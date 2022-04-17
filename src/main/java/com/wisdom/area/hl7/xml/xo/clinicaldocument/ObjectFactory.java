//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.04.17 时间 06:37:23 PM CST 
//


package com.wisdom.area.hl7.xml.xo.clinicaldocument;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.wisdom.area package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Title_QNAME = new QName( "urn:hl7-org:v3", "title");
    private final static QName _Name_QNAME = new QName( "urn:hl7-org:v3", "name");
    private final static QName _HouseNumber_QNAME = new QName( "urn:hl7-org:v3", "houseNumber");
    private final static QName _StreetName_QNAME = new QName( "urn:hl7-org:v3", "streetName");
    private final static QName _Township_QNAME = new QName( "urn:hl7-org:v3", "township");
    private final static QName _County_QNAME = new QName( "urn:hl7-org:v3", "county");
    private final static QName _City_QNAME = new QName( "urn:hl7-org:v3", "city");
    private final static QName _State_QNAME = new QName( "urn:hl7-org:v3", "state");
    private final static QName _PostalCode_QNAME = new QName("urn:hl7-org:v3",  "postalCode");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.wisdom.area
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Occupation }
     * 
     */
    public Occupation createOccupation() {
        return new Occupation();
    }

    /**
     * Create an instance of {@link OccupationCode }
     * 
     */
    public OccupationCode createOccupationCode() {
        return new OccupationCode();
    }

    /**
     * Create an instance of {@link EffectiveTime }
     * 
     */
    public EffectiveTime createEffectiveTime() {
        return new EffectiveTime();
    }

    /**
     * Create an instance of {@link Low }
     * 
     */
    public Low createLow() {
        return new Low();
    }

    /**
     * Create an instance of {@link Subject }
     * 
     */
    public Subject createSubject() {
        return new Subject();
    }

    /**
     * Create an instance of {@link RelatedSubject }
     * 
     */
    public RelatedSubject createRelatedSubject() {
        return new RelatedSubject();
    }

    /**
     * Create an instance of {@link Code }
     * 
     */
    public Code createCode() {
        return new Code();
    }

    /**
     * Create an instance of {@link AdministrativeGenderCode }
     * 
     */
    public AdministrativeGenderCode createAdministrativeGenderCode() {
        return new AdministrativeGenderCode();
    }

    /**
     * Create an instance of {@link Section }
     * 
     */
    public Section createSection() {
        return new Section();
    }

    /**
     * Create an instance of {@link Text }
     * 
     */
    public Text createText() {
        return new Text();
    }

    /**
     * Create an instance of {@link Entry }
     * 
     */
    public Entry createEntry() {
        return new Entry();
    }

    /**
     * Create an instance of {@link Observation }
     * 
     */
    public Observation createObservation() {
        return new Observation();
    }

    /**
     * Create an instance of {@link EntryRelationship }
     * 
     */
    public EntryRelationship createEntryRelationship() {
        return new EntryRelationship();
    }

    /**
     * Create an instance of {@link Value }
     * 
     */
    public Value createValue() {
        return new Value();
    }

    /**
     * Create an instance of {@link Organizer }
     * 
     */
    public Organizer createOrganizer() {
        return new Organizer();
    }

    /**
     * Create an instance of {@link StatusCode }
     * 
     */
    public StatusCode createStatusCode() {
        return new StatusCode();
    }

    /**
     * Create an instance of {@link Component }
     * 
     */
    public Component createComponent() {
        return new Component();
    }

    /**
     * Create an instance of {@link StructuredBody }
     * 
     */
    public StructuredBody createStructuredBody() {
        return new StructuredBody();
    }

    /**
     * Create an instance of {@link TemplateId }
     * 
     */
    public TemplateId createTemplateId() {
        return new TemplateId();
    }

    /**
     * Create an instance of {@link ConfidentialityCode }
     * 
     */
    public ConfidentialityCode createConfidentialityCode() {
        return new ConfidentialityCode();
    }

    /**
     * Create an instance of {@link Participant }
     * 
     */
    public Participant createParticipant() {
        return new Participant();
    }

    /**
     * Create an instance of {@link AssociatedEntity }
     * 
     */
    public AssociatedEntity createAssociatedEntity() {
        return new AssociatedEntity();
    }

    /**
     * Create an instance of {@link Telecom }
     * 
     */
    public Telecom createTelecom() {
        return new Telecom();
    }

    /**
     * Create an instance of {@link AssociatedPerson }
     * 
     */
    public AssociatedPerson createAssociatedPerson() {
        return new AssociatedPerson();
    }

    /**
     * Create an instance of {@link MaritalStatusCode }
     * 
     */
    public MaritalStatusCode createMaritalStatusCode() {
        return new MaritalStatusCode();
    }

    /**
     * Create an instance of {@link SetId }
     * 
     */
    public SetId createSetId() {
        return new SetId();
    }

    /**
     * Create an instance of {@link Id }
     * 
     */
    public Id createId() {
        return new Id();
    }

    /**
     * Create an instance of {@link AssignedCustodian }
     * 
     */
    public AssignedCustodian createAssignedCustodian() {
        return new AssignedCustodian();
    }

    /**
     * Create an instance of {@link RepresentedCustodianOrganization }
     * 
     */
    public RepresentedCustodianOrganization createRepresentedCustodianOrganization() {
        return new RepresentedCustodianOrganization();
    }

    /**
     * Create an instance of {@link Addr }
     * 
     */
    public Addr createAddr() {
        return new Addr();
    }

    /**
     * Create an instance of {@link EthnicGroupCode }
     * 
     */
    public EthnicGroupCode createEthnicGroupCode() {
        return new EthnicGroupCode();
    }

    /**
     * Create an instance of {@link Author }
     * 
     */
    public Author createAuthor() {
        return new Author();
    }

    /**
     * Create an instance of {@link Time }
     * 
     */
    public Time createTime() {
        return new Time();
    }

    /**
     * Create an instance of {@link AssignedAuthor }
     * 
     */
    public AssignedAuthor createAssignedAuthor() {
        return new AssignedAuthor();
    }

    /**
     * Create an instance of {@link AssignedPerson }
     * 
     */
    public AssignedPerson createAssignedPerson() {
        return new AssignedPerson();
    }

    /**
     * Create an instance of {@link RepresentedOrganization }
     * 
     */
    public RepresentedOrganization createRepresentedOrganization() {
        return new RepresentedOrganization();
    }

    /**
     * Create an instance of {@link LanguageCode }
     * 
     */
    public LanguageCode createLanguageCode() {
        return new LanguageCode();
    }

    /**
     * Create an instance of {@link ParentDocument }
     * 
     */
    public ParentDocument createParentDocument() {
        return new ParentDocument();
    }

    /**
     * Create an instance of {@link VersionNumber }
     * 
     */
    public VersionNumber createVersionNumber() {
        return new VersionNumber();
    }

    /**
     * Create an instance of {@link EmployerOrganization }
     * 
     */
    public EmployerOrganization createEmployerOrganization() {
        return new EmployerOrganization();
    }

    /**
     * Create an instance of {@link TypeId }
     * 
     */
    public TypeId createTypeId() {
        return new TypeId();
    }

    /**
     * Create an instance of {@link RelatedDocument }
     * 
     */
    public RelatedDocument createRelatedDocument() {
        return new RelatedDocument();
    }

    /**
     * Create an instance of {@link RecordTarget }
     * 
     */
    public RecordTarget createRecordTarget() {
        return new RecordTarget();
    }

    /**
     * Create an instance of {@link PatientRole }
     * 
     */
    public PatientRole createPatientRole() {
        return new PatientRole();
    }

    /**
     * Create an instance of {@link Patient }
     * 
     */
    public Patient createPatient() {
        return new Patient();
    }

    /**
     * Create an instance of {@link BirthTime }
     * 
     */
    public BirthTime createBirthTime() {
        return new BirthTime();
    }

    /**
     * Create an instance of {@link Household }
     * 
     */
    public Household createHousehold() {
        return new Household();
    }

    /**
     * Create an instance of {@link HouseType }
     * 
     */
    public HouseType createHouseType() {
        return new HouseType();
    }

    /**
     * Create an instance of {@link EducationLevel }
     * 
     */
    public EducationLevel createEducationLevel() {
        return new EducationLevel();
    }

    /**
     * Create an instance of {@link EducationLevelCode }
     * 
     */
    public EducationLevelCode createEducationLevelCode() {
        return new EducationLevelCode();
    }

    /**
     * Create an instance of {@link ClinicalDocument }
     * 
     */
    public ClinicalDocument createClinicalDocument() {
        return new ClinicalDocument();
    }

    /**
     * Create an instance of {@link RealmCode }
     * 
     */
    public RealmCode createRealmCode() {
        return new RealmCode();
    }

    /**
     * Create an instance of {@link Custodian }
     * 
     */
    public Custodian createCustodian() {
        return new Custodian();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(name = "township")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createTownship(String value) {
        return new JAXBElement<String>(_Township_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(name = "title")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createTitle(String value) {
        return new JAXBElement<String>(_Title_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(name = "state")
    public JAXBElement<String> createState(String value) {
        return new JAXBElement<String>(_State_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(name = "county")
    public JAXBElement<String> createCounty(String value) {
        return new JAXBElement<String>(_County_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(name = "name")
    public JAXBElement<String> createName(String value) {
        return new JAXBElement<String>(_Name_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(name = "houseNumber")
    public JAXBElement<String> createHouseNumber(String value) {
        return new JAXBElement<String>(_HouseNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(name = "city")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCity(String value) {
        return new JAXBElement<String>(_City_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(name = "streetName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createStreetName(String value) {
        return new JAXBElement<String>(_StreetName_QNAME, String.class, null, value);
    }

    @XmlElementDecl(name = "postalCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createPostalCode(String value) {
        return new JAXBElement<String>(_PostalCode_QNAME, String.class, null, value);
    }


}
