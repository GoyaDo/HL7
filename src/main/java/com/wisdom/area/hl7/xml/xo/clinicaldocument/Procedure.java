package com.wisdom.area.hl7.xml.xo.clinicaldocument;

import lombok.Data;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * @author goya
 * @create 2022-04-17 20:13
 * @Description
 */
@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "code",
        "effectiveTime",
        "priorityCode",
        "targetSiteCode",
        "performer",
        "entryRelationship"
})
@XmlRootElement(name = "procedure")
public class Procedure {

    @XmlAttribute(name = "classCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String classCode;

    @XmlAttribute(name = "moodCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String moodCode;

    private Code code;

    private EffectiveTime effectiveTime;

    private PriorityCode priorityCode;

    private TargetSiteCode targetSiteCode;

    private Performer performer;

    private EntryRelationship entryRelationship;
}
