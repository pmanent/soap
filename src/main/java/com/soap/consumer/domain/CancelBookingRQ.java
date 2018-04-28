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
 * <p>Clase Java para CancelBookingRQ complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CancelBookingRQ"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Credentials" type="{ws.avantio.com/crsConnectionServices}Credentials"/&gt;
 *         &lt;element name="Localizer" type="{ws.avantio.com/crsConnectionServices}Localizer"/&gt;
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SendMailToOrganization" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="SendMailToTourist" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancelBookingRQ", propOrder = {
    "credentials",
    "localizer",
    "comments",
    "sendMailToOrganization",
    "sendMailToTourist"
})
public class CancelBookingRQ {

    @XmlElement(name = "Credentials", required = true)
    protected Credentials credentials;
    @XmlElement(name = "Localizer", required = true)
    protected Localizer localizer;
    @XmlElement(name = "Comments", required = true)
    protected String comments;
    @XmlElement(name = "SendMailToOrganization")
    protected boolean sendMailToOrganization;
    @XmlElement(name = "SendMailToTourist")
    protected boolean sendMailToTourist;

    /**
     * Obtiene el valor de la propiedad credentials.
     * 
     * @return
     *     possible object is
     *     {@link Credentials }
     *     
     */
    public Credentials getCredentials() {
        return credentials;
    }

    /**
     * Define el valor de la propiedad credentials.
     * 
     * @param value
     *     allowed object is
     *     {@link Credentials }
     *     
     */
    public void setCredentials(Credentials value) {
        this.credentials = value;
    }

    /**
     * Obtiene el valor de la propiedad localizer.
     * 
     * @return
     *     possible object is
     *     {@link Localizer }
     *     
     */
    public Localizer getLocalizer() {
        return localizer;
    }

    /**
     * Define el valor de la propiedad localizer.
     * 
     * @param value
     *     allowed object is
     *     {@link Localizer }
     *     
     */
    public void setLocalizer(Localizer value) {
        this.localizer = value;
    }

    /**
     * Obtiene el valor de la propiedad comments.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Define el valor de la propiedad comments.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
    }

    /**
     * Obtiene el valor de la propiedad sendMailToOrganization.
     * 
     */
    public boolean isSendMailToOrganization() {
        return sendMailToOrganization;
    }

    /**
     * Define el valor de la propiedad sendMailToOrganization.
     * 
     */
    public void setSendMailToOrganization(boolean value) {
        this.sendMailToOrganization = value;
    }

    /**
     * Obtiene el valor de la propiedad sendMailToTourist.
     * 
     */
    public boolean isSendMailToTourist() {
        return sendMailToTourist;
    }

    /**
     * Define el valor de la propiedad sendMailToTourist.
     * 
     */
    public void setSendMailToTourist(boolean value) {
        this.sendMailToTourist = value;
    }

}
