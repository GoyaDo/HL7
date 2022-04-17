package com.wisdom.area.hl7.xml.xo.clinicaldocument;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * @author goya
 * @create 2022-04-17 19:42
 * @Description
 */
@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "wholeOrganization"
})
@XmlRootElement(name = "asOrganizationPartOf")
public class AsOrganizationPartOf {

    private WholeOrganization wholeOrganization;
}
