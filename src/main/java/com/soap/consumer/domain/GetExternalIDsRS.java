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
 * <p>Clase Java para GetExternalIDsRS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GetExternalIDsRS"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Accommodation" type="{ws.avantio.com/crsConnectionServices}Accommodation" minOccurs="0"/&gt;
 *         &lt;element name="EmailGA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LanguageGA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LocalizerList" type="{ws.avantio.com/crsConnectionServices}LocalizerList" minOccurs="0"/&gt;
 *         &lt;element name="InstantBooking" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetExternalIDsRS", propOrder = {
    "accommodation",
    "emailGA",
    "languageGA",
    "localizerList",
    "instantBooking"
})
public class GetExternalIDsRS {

    @XmlElement(name = "Accommodation")
    protected Accommodation accommodation;
    @XmlElement(name = "EmailGA")
    protected String emailGA;
    @XmlElement(name = "LanguageGA")
    protected String languageGA;
    @XmlElement(name = "LocalizerList")
    protected LocalizerList localizerList;
    @XmlElement(name = "InstantBooking")
    protected Boolean instantBooking;

    /**
     * Obtiene el valor de la propiedad accommodation.
     * 
     * @return
     *     possible object is
     *     {@link Accommodation }
     *     
     */
    public Accommodation getAccommodation() {
        return accommodation;
    }

    /**
     * Define el valor de la propiedad accommodation.
     * 
     * @param value
     *     allowed object is
     *     {@link Accommodation }
     *     
     */
    public void setAccommodation(Accommodation value) {
        this.accommodation = value;
    }

    /**
     * Obtiene el valor de la propiedad emailGA.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailGA() {
        return emailGA;
    }

    /**
     * Define el valor de la propiedad emailGA.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailGA(String value) {
        this.emailGA = value;
    }

    /**
     * Obtiene el valor de la propiedad languageGA.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageGA() {
        return languageGA;
    }

    /**
     * Define el valor de la propiedad languageGA.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageGA(String value) {
        this.languageGA = value;
    }

    /**
     * Obtiene el valor de la propiedad localizerList.
     * 
     * @return
     *     possible object is
     *     {@link LocalizerList }
     *     
     */
    public LocalizerList getLocalizerList() {
        return localizerList;
    }

    /**
     * Define el valor de la propiedad localizerList.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalizerList }
     *     
     */
    public void setLocalizerList(LocalizerList value) {
        this.localizerList = value;
    }

    /**
     * Obtiene el valor de la propiedad instantBooking.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInstantBooking() {
        return instantBooking;
    }

    /**
     * Define el valor de la propiedad instantBooking.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInstantBooking(Boolean value) {
        this.instantBooking = value;
    }

}
