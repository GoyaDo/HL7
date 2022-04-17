package com.wisdom.area.hl7.xml.xo.clinicaldocument;

import lombok.Data;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * @author goya
 * @create 2022-04-17 20:31
 * @Description
 */
@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "code",
        "text",
        "performer"
})
@XmlRootElement(name = "act")
public class Act {

    @XmlAttribute(name = "classCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String classCode;

    @XmlAttribute(name = "moodCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String moodCode;

    @XmlAttribute(name = "negationInd")
    protected Boolean negationInd;

    protected Code code;

    protected Text text;

    protected Performer performer;

}
