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
 * <p>Clase Java para ExternalIDsCriteria complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ExternalIDsCriteria"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ExternalID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExternalBookingCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AccommodationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExternalIDsCriteria", propOrder = {
    "externalID",
    "externalBookingCode",
    "accommodationCode"
})
public class ExternalIDsCriteria {

    @XmlElement(name = "ExternalID")
    protected String externalID;
    @XmlElement(name = "ExternalBookingCode")
    protected String externalBookingCode;
    @XmlElement(name = "AccommodationCode")
    protected String accommodationCode;

    /**
     * Obtiene el valor de la propiedad externalID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalID() {
        return externalID;
    }

    /**
     * Define el valor de la propiedad externalID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalID(String value) {
        this.externalID = value;
    }

    /**
     * Obtiene el valor de la propiedad externalBookingCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalBookingCode() {
        return externalBookingCode;
    }

    /**
     * Define el valor de la propiedad externalBookingCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalBookingCode(String value) {
        this.externalBookingCode = value;
    }

    /**
     * Obtiene el valor de la propiedad accommodationCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccommodationCode() {
        return accommodationCode;
    }

    /**
     * Define el valor de la propiedad accommodationCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccommodationCode(String value) {
        this.accommodationCode = value;
    }

}
