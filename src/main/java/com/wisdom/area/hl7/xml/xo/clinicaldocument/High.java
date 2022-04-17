package com.wisdom.area.hl7.xml.xo.clinicaldocument;

import lombok.Data;

import javax.xml.bind.annotation.*;
import java.math.BigInteger;

/**
 * @author goya
 * @create 2022-04-17 20:35
 * @Description
 */
@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "high")
public class High {

    @XmlAttribute(name = "value", required = true)
    protected BigInteger value;
}
