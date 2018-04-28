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
 * <p>Clase Java para CheckInCheckOutInfo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CheckInCheckOutInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CheckInRules" type="{ws.avantio.com/crsConnectionServices}CheckInRules"/&gt;
 *         &lt;element name="CheckOutSchedule" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckInCheckOutInfo", propOrder = {
    "checkInRules",
    "checkOutSchedule"
})
public class CheckInCheckOutInfo {

    @XmlElement(name = "CheckInRules", required = true)
    protected CheckInRules checkInRules;
    @XmlElement(name = "CheckOutSchedule", required = true)
    protected String checkOutSchedule;

    /**
     * Obtiene el valor de la propiedad checkInRules.
     * 
     * @return
     *     possible object is
     *     {@link CheckInRules }
     *     
     */
    public CheckInRules getCheckInRules() {
        return checkInRules;
    }

    /**
     * Define el valor de la propiedad checkInRules.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckInRules }
     *     
     */
    public void setCheckInRules(CheckInRules value) {
        this.checkInRules = value;
    }

    /**
     * Obtiene el valor de la propiedad checkOutSchedule.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckOutSchedule() {
        return checkOutSchedule;
    }

    /**
     * Define el valor de la propiedad checkOutSchedule.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckOutSchedule(String value) {
        this.checkOutSchedule = value;
    }

}
