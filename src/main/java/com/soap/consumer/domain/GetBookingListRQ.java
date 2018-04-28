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
 * <p>Clase Java para GetBookingListRQ complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GetBookingListRQ"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Credentials" type="{ws.avantio.com/crsConnectionServices}CredentialsNoLanguage"/&gt;
 *         &lt;element name="Criteria" type="{ws.avantio.com/crsConnectionServices}BookingListCriteria"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetBookingListRQ", propOrder = {
    "credentials",
    "criteria"
})
public class GetBookingListRQ {

    @XmlElement(name = "Credentials", required = true)
    protected CredentialsNoLanguage credentials;
    @XmlElement(name = "Criteria", required = true)
    protected BookingListCriteria criteria;

    /**
     * Obtiene el valor de la propiedad credentials.
     * 
     * @return
     *     possible object is
     *     {@link CredentialsNoLanguage }
     *     
     */
    public CredentialsNoLanguage getCredentials() {
        return credentials;
    }

    /**
     * Define el valor de la propiedad credentials.
     * 
     * @param value
     *     allowed object is
     *     {@link CredentialsNoLanguage }
     *     
     */
    public void setCredentials(CredentialsNoLanguage value) {
        this.credentials = value;
    }

    /**
     * Obtiene el valor de la propiedad criteria.
     * 
     * @return
     *     possible object is
     *     {@link BookingListCriteria }
     *     
     */
    public BookingListCriteria getCriteria() {
        return criteria;
    }

    /**
     * Define el valor de la propiedad criteria.
     * 
     * @param value
     *     allowed object is
     *     {@link BookingListCriteria }
     *     
     */
    public void setCriteria(BookingListCriteria value) {
        this.criteria = value;
    }

}
