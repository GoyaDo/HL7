package com.wisdom.area.hl7.xml.xo.clinicaldocument;

import lombok.Data;

import javax.xml.bind.annotation.*;

/**
 * @author goya
 * @create 2022-04-17 20:23
 * @Description
 */
@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
})
@XmlRootElement(name = "rateQuantity")
public class RateQuantity {

    @XmlAttribute(name = "value")
    @XmlSchemaType(name = "anySimpleType")
    protected String value;

    @XmlAttribute(name = "unit")
    @XmlSchemaType(name = "anySimpleType")
    protected String unit;
}
