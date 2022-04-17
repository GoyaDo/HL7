package com.wisdom.area.hl7.xml.xo.clinicaldocument;

import lombok.Data;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.List;

/**
 * @author goya
 * @create 2022-04-17 18:36
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
 *         &lt;element ref="{urn:hl7-org:v3}realmCode"/>
 *         &lt;element ref="{urn:hl7-org:v3}typeId"/>
 *         &lt;element ref="{urn:hl7-org:v3}templateId"/>
 *         &lt;element ref="{urn:hl7-org:v3}id"/>
 *         &lt;element ref="{urn:hl7-org:v3}code"/>
 *         &lt;element ref="{urn:hl7-org:v3}title"/>
 *         &lt;element ref="{urn:hl7-org:v3}effectiveTime"/>
 *         &lt;element ref="{urn:hl7-org:v3}confidentialityCode"/>
 *         &lt;element ref="{urn:hl7-org:v3}languageCode"/>
 *         &lt;element ref="{urn:hl7-org:v3}setId"/>
 *         &lt;element ref="{urn:hl7-org:v3}versionNumber"/>
 *         &lt;element ref="{urn:hl7-org:v3}recordTarget"/>
 *         &lt;element ref="{urn:hl7-org:v3}author"/>
 *         &lt;element ref="{urn:hl7-org:v3}custodian"/>
 *         &lt;element ref="{urn:hl7-org:v3}participant"/>
 *         &lt;element ref="{urn:hl7-org:v3}relatedDocument"/>
 *         &lt;element ref="{urn:hl7-org:v3}component"/>
 *       &lt;/sequence>
 *       &lt;attribute ref="{schemas.reuters.com/ns/2006/04/14/rmds/webservices/news/xsi}schemaLocation use="required""/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "realmCode",
        "typeId",
        "templateId",
        "id",
        "code",
        "title",
        "effectiveTime",
        "confidentialityCode",
        "languageCode",
        "setId",
        "versionNumber",
        "recordTarget",
        "author",
        "custodian",
        "legalAuthenticator",
        "participant",
        "relatedDocument",
        "component"
})
@XmlRootElement(name = "ClinicalDocument")
public class ClinicalDocument {

    @XmlElement(required = true)
    protected RealmCode realmCode;

    @XmlElement(required = true)
    protected TypeId typeId;

    @XmlElement(required = true)
    protected TemplateId templateId;

    @XmlElement(required = true)
    protected Id id;

    @XmlElement(required = true)
    protected Code code;

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String title;

    @XmlElement(required = true)
    protected EffectiveTime effectiveTime;

    @XmlElement(required = true)
    protected ConfidentialityCode confidentialityCode;

    @XmlElement(required = true)
    protected LanguageCode languageCode;

    @XmlElement(required = true)
    protected SetId setId;

    @XmlElement(required = true)
    protected VersionNumber versionNumber;

    @XmlElement(required = true)
    protected List<RecordTarget> recordTarget;

    @XmlElement(required = true)
    protected List<Author> author;

    @XmlElement(required = true)
    protected Custodian custodian;

    private LegalAuthenticator legalAuthenticator;

    @XmlElement(required = true)
    protected List<Participant> participant;

    @XmlElement(required = true)
    protected List<RelatedDocument> relatedDocument;

    @XmlElement(required = true)
    protected Component component;


}
