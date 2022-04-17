package com.wisdom.area.hl7.xml.xo.clinicaldocument;

import lombok.Data;

import javax.xml.bind.annotation.*;

/**
 * @author goya
 * @create 2022-04-17 20:40
 * @Description
 */
@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
})
@XmlRootElement(name = "width")
public class Width {

    @XmlAttribute(name = "value")
    protected Boolean value;

    @XmlAttribute(name = "unit")
    protected String unit;
}
