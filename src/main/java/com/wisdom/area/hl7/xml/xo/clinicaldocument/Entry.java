package com.wisdom.area.hl7.xml.xo.clinicaldocument;

import lombok.Data;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * @author goya
 * @create 2022-04-17 19:51
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
 *       &lt;choice>
 *         &lt;element ref="{urn:hl7-org:v3}observation"/>
 *         &lt;element ref="{urn:hl7-org:v3}organizer"/>
 *       &lt;/choice>
 *       &lt;attribute name="contextConductionInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="typeCode" type="{http://www.w3.org/2001/XMLSchema}NCName" />
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
        "observation",
        "organizer",
        "procedure",
        "substanceAdministration"
})
@XmlRootElement(name = "entry")
public class Entry {

    @XmlAttribute(name = "typeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String typeCode;

    @XmlAttribute(name = "contextConductionInd")
    protected Boolean contextConductionInd;

    protected Observation observation;

    protected Organizer organizer;

    protected Procedure procedure;

    protected SubstanceAdministration substanceAdministration;


}
