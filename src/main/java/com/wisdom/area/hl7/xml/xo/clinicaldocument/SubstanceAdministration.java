package com.wisdom.area.hl7.xml.xo.clinicaldocument;

import lombok.Data;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.List;

/**
 * @author goya
 * @create 2022-04-17 20:17
 * @Description
 */
@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "code",
        "text",
        "statusCode",
        "effectiveTime",
        "repeatNumber",
        "approachSiteCode",
        "routeCode",
        "doseQuantity",
        "rateQuantity",
        "consumable",
        "entryRelationship",
        "performer"
})
@XmlRootElement(name = "substanceAdministration")
public class SubstanceAdministration {

    @XmlAttribute(name = "classCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String classCode;

    @XmlAttribute(name = "moodCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String moodCode;

    protected Code code;

    protected Text text;

    protected StatusCode statusCode;

    protected EffectiveTime effectiveTime;

    protected RepeatNumber repeatNumber;

    protected ApproachSiteCode approachSiteCode;

    protected RouteCode routeCode;

    protected DoseQuantity doseQuantity;

    protected RateQuantity rateQuantity;

    protected Consumable consumable;

    protected List<EntryRelationship> entryRelationship;

    protected Performer performer;
}
