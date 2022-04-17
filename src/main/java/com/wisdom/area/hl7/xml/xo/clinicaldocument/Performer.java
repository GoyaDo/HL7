package com.wisdom.area.hl7.xml.xo.clinicaldocument;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * @author goya
 * @create 2022-04-17 20:17
 * @Description
 */
@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "time",
        "assignedEntity"
})
@XmlRootElement(name = "procedure")
public class Performer {

    private Time time;

    private AssignedEntity assignedEntity;
}
