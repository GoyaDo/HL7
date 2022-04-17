package com.wisdom.area.hl7.xml.xo.clinicaldocument;

import lombok.Data;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.List;

/**
 * @author goya
 * @create 2022-04-17 19:52
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
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{urn:hl7-org:v3}code"/>
 *         &lt;element ref="{urn:hl7-org:v3}effectiveTime"/>
 *         &lt;element ref="{urn:hl7-org:v3}entryRelationship"/>
 *         &lt;element ref="{urn:hl7-org:v3}value"/>
 *       &lt;/choice>
 *       &lt;attribute name="classCode" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="moodCode" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
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
        "codeOrEffectiveTimeOrEntryRelationship"
})
@XmlRootElement(name = "observation")
public class Observation {

    @XmlAttribute(name = "classCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String classCode;

    @XmlAttribute(name = "moodCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String moodCode;

    @XmlElements({
            @XmlElement(name = "code", type = Code.class),
            @XmlElement(name = "effectiveTime", type = EffectiveTime.class),
            @XmlElement(name = "entryRelationship", type = EntryRelationship.class),
            @XmlElement(name = "value", type = Value.class)
    })
    protected List<Object> codeOrEffectiveTimeOrEntryRelationship;
}
