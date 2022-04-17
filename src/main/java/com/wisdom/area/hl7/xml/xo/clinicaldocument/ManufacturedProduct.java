package com.wisdom.area.hl7.xml.xo.clinicaldocument;

import lombok.Data;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * @author goya
 * @create 2022-04-17 20:25
 * @Description
 */
@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "id",
        "manufacturedMaterial",
        "manufacturerOrganization",
        "manufacturedLabeledDrug"
})
@XmlRootElement(name = "manufacturedProduct")
public class ManufacturedProduct {

    @XmlAttribute(name = "classCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String classCode;

    private Id id;

    private ManufacturedMaterial manufacturedMaterial;

    private ManufacturerOrganization manufacturerOrganization;

    private ManufacturedLabeledDrug manufacturedLabeledDrug;
}
