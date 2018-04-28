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
 * <p>Clase Java para GetBookingPriceRS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GetBookingPriceRS"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BookingPrice" type="{ws.avantio.com/crsConnectionServices}BookingPrice"/&gt;
 *         &lt;element name="CancellationPolicies" type="{ws.avantio.com/crsConnectionServices}CancellationPolicies" minOccurs="0"/&gt;
 *         &lt;element name="TermsAndConditions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Services" type="{ws.avantio.com/crsConnectionServices}Services" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetBookingPriceRS", propOrder = {
    "bookingPrice",
    "cancellationPolicies",
    "termsAndConditions",
    "services"
})
public class GetBookingPriceRS {

    @XmlElement(name = "BookingPrice", required = true)
    protected BookingPrice bookingPrice;
    @XmlElement(name = "CancellationPolicies")
    protected CancellationPolicies cancellationPolicies;
    @XmlElement(name = "TermsAndConditions")
    protected String termsAndConditions;
    @XmlElement(name = "Services")
    protected Services services;

    /**
     * Obtiene el valor de la propiedad bookingPrice.
     * 
     * @return
     *     possible object is
     *     {@link BookingPrice }
     *     
     */
    public BookingPrice getBookingPrice() {
        return bookingPrice;
    }

    /**
     * Define el valor de la propiedad bookingPrice.
     * 
     * @param value
     *     allowed object is
     *     {@link BookingPrice }
     *     
     */
    public void setBookingPrice(BookingPrice value) {
        this.bookingPrice = value;
    }

    /**
     * Obtiene el valor de la propiedad cancellationPolicies.
     * 
     * @return
     *     possible object is
     *     {@link CancellationPolicies }
     *     
     */
    public CancellationPolicies getCancellationPolicies() {
        return cancellationPolicies;
    }

    /**
     * Define el valor de la propiedad cancellationPolicies.
     * 
     * @param value
     *     allowed object is
     *     {@link CancellationPolicies }
     *     
     */
    public void setCancellationPolicies(CancellationPolicies value) {
        this.cancellationPolicies = value;
    }

    /**
     * Obtiene el valor de la propiedad termsAndConditions.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTermsAndConditions() {
        return termsAndConditions;
    }

    /**
     * Define el valor de la propiedad termsAndConditions.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTermsAndConditions(String value) {
        this.termsAndConditions = value;
    }

    /**
     * Obtiene el valor de la propiedad services.
     * 
     * @return
     *     possible object is
     *     {@link Services }
     *     
     */
    public Services getServices() {
        return services;
    }

    /**
     * Define el valor de la propiedad services.
     * 
     * @param value
     *     allowed object is
     *     {@link Services }
     *     
     */
    public void setServices(Services value) {
        this.services = value;
    }

}
