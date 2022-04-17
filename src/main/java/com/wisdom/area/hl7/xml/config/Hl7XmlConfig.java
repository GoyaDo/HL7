package com.wisdom.area.hl7.xml.config;

import com.esotericsoftware.yamlbeans.YamlReader;
import com.wisdom.area.hl7.xml.xo.clinicaldocument.*;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * @author goya
 * @create 2022-04-17 18:32
 * @Description
 */
public class Hl7XmlConfig {

    private static void beanToXml(Object obj, String path) throws IOException {
        // 创建输出流
        StringWriter sw = new StringWriter();
        try {
            // 利用jdk中自带的转换类实现
            JAXBContext context = JAXBContext.newInstance(obj.getClass());

            Marshaller marshaller = context.createMarshaller();
            // 格式化xml输出的格式
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,
                    Boolean.TRUE);

            // 去掉生成的报文头
            marshaller.setProperty(Marshaller.JAXB_FRAGMENT, true);

            // TODO CJ: shemaLocation位置问题
            marshaller.setProperty(Marshaller.JAXB_SCHEMA_LOCATION, "urn:hl7-org:v3 ..\\sdschemas\\SDA.xsd");

            // 将对象转换成输出流形式的xml
            FileWriter fileWriter = new FileWriter(path);

            StringWriter writer = new StringWriter();

            // TODO CJ: 默认生成standlon问题
            writer.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>" + "\n");

            fileWriter.write(writer.toString());
            fileWriter.write(sw.toString());
            marshaller.marshal(obj, fileWriter);

            fileWriter.close();
        } catch (JAXBException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) throws IOException {

        YamlReader reader = new YamlReader(new FileReader("myConfig.yaml"));

//        ClinicalDocument read = (ClinicalDocument) reader.read();

        ClinicalDocument clinicalDocument = reader.read(ClinicalDocument.class);

        Component component = new Component();

        StructuredBody structuredBody = new StructuredBody();

        Component component1 = new Component();
        Component component2 = new Component();

        Section section = new Section();

        Entry entry = new Entry();
        entry.setTypeCode("111");

        List<Entry> list = new ArrayList();
        list.add(entry);

        section.setEntry(list);

        component1.setSection(section);

        Section section2 = new Section();

        Entry entry2 = new Entry();
        entry2.setTypeCode("111");

        List<Entry> list2 = new ArrayList();
        list2.add(entry);

        section2.setEntry(list2);

        component2.setSection(section2);

        List<Component> list1 = new ArrayList();
        list1.add(component1);
        list1.add(component2);


        structuredBody.setComponent(list1);



        component.setStructuredBody(structuredBody);

        clinicalDocument.setComponent(component);

        beanToXml(clinicalDocument,"test.xml");
    }
}
