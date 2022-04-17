package com.wisdom.area.hl7.xml.xo.clinicaldocument;

import lombok.Data;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.List;

/**
 * @author goya
 * @create 2022-04-17 19:14
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
 *         &lt;element ref="{urn:hl7-org:v3}administrativeGenderCode"/>
 *         &lt;element ref="{urn:hl7-org:v3}birthTime"/>
 *         &lt;element ref="{urn:hl7-org:v3}maritalStatusCode"/>
 *         &lt;element ref="{urn:hl7-org:v3}ethnicGroupCode"/>
 *         &lt;element ref="{urn:hl7-org:v3}employerOrganization"/>
 *         &lt;element ref="{urn:hl7-org:v3}household"/>
 *         &lt;element ref="{urn:hl7-org:v3}educationLevel"/>
 *         &lt;element ref="{urn:hl7-org:v3}occupation"/>
 *       &lt;/sequence>
 *       &lt;attribute name="classCode" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="determinerCode" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
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
        "administrativeGenderCode",
        "birthTime",
        "guardian",
        "birthplace",
        "maritalStatusCode",
        "ethnicGroupCode",
        "employerOrganization",
        "household",
        "educationLevel",
        "occupation"
})
@XmlRootElement(name = "patient")
public class Patient {

    @XmlAttribute(name = "classCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    private String classCode;

    @XmlAttribute(name = "determinerCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    private String determinerCode;

    @XmlElement(required = true)
    private Id id;

    @XmlElement(required = true)
    private List<String> name;

    @XmlElement(required = true)
    private AdministrativeGenderCode administrativeGenderCode;

    @XmlElement(required = true)
    private BirthTime birthTime;

    @XmlElement(required = true)
    private List<Guardian> guardian;

    @XmlElement(required = true)
    private BirthPlace birthplace;

    @XmlElement(required = true)
    private MaritalStatusCode maritalStatusCode;

    @XmlElement(required = true)
    private EthnicGroupCode ethnicGroupCode;

    @XmlElement(required = true)
    private EmployerOrganization employerOrganization;

    @XmlElement(required = true)
    private Household household;

    @XmlElement(required = true)
    private EducationLevel educationLevel;

    @XmlElement(required = true)
    private Occupation occupation;
}
