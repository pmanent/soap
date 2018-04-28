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
 * <p>Clase Java para ChangesList complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ChangesList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SuccessChanges" type="{ws.avantio.com/crsConnectionServices}SuccessChanges" minOccurs="0"/&gt;
 *         &lt;element name="FailedChanges" type="{ws.avantio.com/crsConnectionServices}FailedChanges" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangesList", propOrder = {
    "successChanges",
    "failedChanges"
})
public class ChangesList {

    @XmlElement(name = "SuccessChanges")
    protected SuccessChanges successChanges;
    @XmlElement(name = "FailedChanges")
    protected FailedChanges failedChanges;

    /**
     * Obtiene el valor de la propiedad successChanges.
     * 
     * @return
     *     possible object is
     *     {@link SuccessChanges }
     *     
     */
    public SuccessChanges getSuccessChanges() {
        return successChanges;
    }

    /**
     * Define el valor de la propiedad successChanges.
     * 
     * @param value
     *     allowed object is
     *     {@link SuccessChanges }
     *     
     */
    public void setSuccessChanges(SuccessChanges value) {
        this.successChanges = value;
    }

    /**
     * Obtiene el valor de la propiedad failedChanges.
     * 
     * @return
     *     possible object is
     *     {@link FailedChanges }
     *     
     */
    public FailedChanges getFailedChanges() {
        return failedChanges;
    }

    /**
     * Define el valor de la propiedad failedChanges.
     * 
     * @param value
     *     allowed object is
     *     {@link FailedChanges }
     *     
     */
    public void setFailedChanges(FailedChanges value) {
        this.failedChanges = value;
    }

}
