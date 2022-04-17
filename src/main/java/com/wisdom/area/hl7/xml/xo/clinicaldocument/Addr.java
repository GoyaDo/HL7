package com.wisdom.area.hl7.xml.xo.clinicaldocument;

import lombok.Data;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author goya
 * @create 2022-04-17 19:09
 * @Description <p>anonymous complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{urn:hl7-org:v3}city"/>
 *         &lt;element ref="{urn:hl7-org:v3}county"/>
 *         &lt;element ref="{urn:hl7-org:v3}houseNumber"/>
 *         &lt;element ref="{urn:hl7-org:v3}state"/>
 *         &lt;element ref="{urn:hl7-org:v3}streetName"/>
 *         &lt;element ref="{urn:hl7-org:v3}township"/>
 *       &lt;/choice>
 *       &lt;attribute name="use" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "content"
})
@XmlRootElement(name = "addr")
public class Addr {


    @XmlAttribute(name = "use")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String use;

    @XmlElementRefs({
            @XmlElementRef(name = "houseNumber", namespace = "urn:hl7-org:v3",type = JAXBElement.class, required = false),
            @XmlElementRef(name = "streetName", namespace = "urn:hl7-org:v3",type = JAXBElement.class, required = false),
            @XmlElementRef(name = "township", namespace = "urn:hl7-org:v3",type = JAXBElement.class, required = false),
            @XmlElementRef(name = "county", namespace = "urn:hl7-org:v3",type = JAXBElement.class, required = false),
            @XmlElementRef(name = "city", namespace = "urn:hl7-org:v3",type = JAXBElement.class, required = false),
            @XmlElementRef(name = "state", namespace = "urn:hl7-org:v3",type = JAXBElement.class, required = false),
            @XmlElementRef(name = "postalCode", namespace = "urn:hl7-org:v3",type = JAXBElement.class, required = false)
    })
    @XmlMixed
    protected List<Serializable> content;


    /**
     * Gets the value of the content property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link String }
     *
     *
     */
    public List<Serializable> getContent() {
        if (content == null) {
            content = new ArrayList<Serializable>();
        }
        return this.content;
    }

}
