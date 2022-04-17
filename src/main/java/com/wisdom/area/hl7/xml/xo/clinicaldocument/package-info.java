/**
 * @author goya
 * @create 2022-04-17 20:50
 * @Description
 */
@javax.xml.bind.annotation.XmlSchema(
        namespace = "urn:hl7-org:v3",
        xmlns = {@XmlNs(prefix = "", namespaceURI = "urn:hl7-org:v3")
                , @XmlNs(prefix = "mif", namespaceURI = "urn:hl7-org:v3/mif")
                , @XmlNs(prefix = "xsi", namespaceURI = "http://www.w3.org/2001/XMLSchema-instance")
        },
        elementFormDefault = XmlNsForm.QUALIFIED
)
package com.wisdom.area.hl7.xml.xo.clinicaldocument;

import javax.xml.bind.annotation.XmlNs;
import javax.xml.bind.annotation.XmlNsForm;