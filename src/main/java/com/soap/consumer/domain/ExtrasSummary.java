//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.04.15 a las 06:28:31 PM CEST 
//


package com.soap.consumer.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ExtrasSummary complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ExtrasSummary"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ObligatoryOrIncluded" type="{ws.avantio.com/crsConnectionServices}ExtrasSummaryList"/&gt;
 *         &lt;element name="Optional" type="{ws.avantio.com/crsConnectionServices}ExtrasSummaryList"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtrasSummary", propOrder = {
    "obligatoryOrIncluded",
    "optional"
})
public class ExtrasSummary {

    @XmlElement(name = "ObligatoryOrIncluded", required = true)
    protected ExtrasSummaryList obligatoryOrIncluded;
    @XmlElement(name = "Optional", required = true)
    protected ExtrasSummaryList optional;

    /**
     * Obtiene el valor de la propiedad obligatoryOrIncluded.
     * 
     * @return
     *     possible object is
     *     {@link ExtrasSummaryList }
     *     
     */
    public ExtrasSummaryList getObligatoryOrIncluded() {
        return obligatoryOrIncluded;
    }

    /**
     * Define el valor de la propiedad obligatoryOrIncluded.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtrasSummaryList }
     *     
     */
    public void setObligatoryOrIncluded(ExtrasSummaryList value) {
        this.obligatoryOrIncluded = value;
    }

    /**
     * Obtiene el valor de la propiedad optional.
     * 
     * @return
     *     possible object is
     *     {@link ExtrasSummaryList }
     *     
     */
    public ExtrasSummaryList getOptional() {
        return optional;
    }

    /**
     * Define el valor de la propiedad optional.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtrasSummaryList }
     *     
     */
    public void setOptional(ExtrasSummaryList value) {
        this.optional = value;
    }

}
