package com.wisdom.area.hl7.xml.xo.clinicaldocument;

import lombok.Data;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.math.BigInteger;

/**
 * @author goya
 * @create 2022-04-17 19:57
 * @Description
 *
 * <p>anonymous complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="codeSystem" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="codeSystemName" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute ref="{schemas.reuters.com/ns/2006/04/14/rmds/webservices/news/xsi}type use="required""/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
//        "content",
        "width"
})
@XmlRootElement(name = "value")
public class Value extends Code{

//    @XmlValue
//    protected String content;

    @XmlAttribute(name = "type", required = true,namespace = "http://www.w3.org/2001/XMLSchema-instance")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String type;

    @XmlAttribute(name = "value")
    protected Boolean value;

    @XmlAttribute(name = "code")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String code;

    @XmlAttribute(name = "codeSystem")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String codeSystem;

    @XmlAttribute(name = "codeSystemName")
    @XmlSchemaType(name = "anySimpleType")
    protected String codeSystemName;

    @XmlAttribute(name = "codesystemName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String codesystemName;

    @XmlAttribute(name = "codeSystemVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    private String codeSystemVersion;

    @XmlAttribute(name = "displayName")
    @XmlSchemaType(name = "anySimpleType")
    protected String displayName;

    @XmlAttribute(name = "unit")
    @XmlSchemaType(name = "anySimpleType")
    protected String unit;

    private Width width;


}
