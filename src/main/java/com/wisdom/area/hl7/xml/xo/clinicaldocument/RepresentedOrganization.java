package com.wisdom.area.hl7.xml.xo.clinicaldocument;

import lombok.Data;

import javax.xml.bind.annotation.*;
import java.util.List;

/**
 * @author goya
 * @create 2022-04-17 19:39
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
 *       &lt;sequence>
 *         &lt;element ref="{urn:hl7-org:v3}id"/>
 *         &lt;element ref="{urn:hl7-org:v3}name"/>
 *         &lt;element ref="{urn:hl7-org:v3}addr"/>
 *       &lt;/sequence>
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
        "id",
        "name",
        "addr",
        "asOrganizationPartOf"
})
@XmlRootElement(name = "representedOrganization")
public class RepresentedOrganization {

    @XmlElement(required = true)
    protected List<Id> id;

    @XmlElement(required = true)
    protected Name name;

    @XmlElement(required = true)
    protected Addr addr;

    private AsOrganizationPartOf asOrganizationPartOf;
}
