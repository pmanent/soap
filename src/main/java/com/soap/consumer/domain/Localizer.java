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
 * <p>Clase Java para Localizer complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Localizer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BookingCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Localizator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AgentLocalizator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Localizer", propOrder = {
    "bookingCode",
    "localizator",
    "agentLocalizator"
})
public class Localizer {

    @XmlElement(name = "BookingCode")
    protected String bookingCode;
    @XmlElement(name = "Localizator")
    protected String localizator;
    @XmlElement(name = "AgentLocalizator")
    protected String agentLocalizator;

    /**
     * Obtiene el valor de la propiedad bookingCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingCode() {
        return bookingCode;
    }

    /**
     * Define el valor de la propiedad bookingCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingCode(String value) {
        this.bookingCode = value;
    }

    /**
     * Obtiene el valor de la propiedad localizator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalizator() {
        return localizator;
    }

    /**
     * Define el valor de la propiedad localizator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalizator(String value) {
        this.localizator = value;
    }

    /**
     * Obtiene el valor de la propiedad agentLocalizator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentLocalizator() {
        return agentLocalizator;
    }

    /**
     * Define el valor de la propiedad agentLocalizator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentLocalizator(String value) {
        this.agentLocalizator = value;
    }

}
