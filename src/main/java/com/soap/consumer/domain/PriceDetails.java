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
 * <p>Clase Java para PriceDetails complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PriceDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AccommodationAmount" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="DiscountAmount" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="ExtrasAndServicesAmount" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
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
@XmlType(name = "PriceDetails", propOrder = {
    "accommodationAmount",
    "discountAmount",
    "extrasAndServicesAmount",
    "services"
})
public class PriceDetails {

    @XmlElement(name = "AccommodationAmount")
    protected float accommodationAmount;
    @XmlElement(name = "DiscountAmount")
    protected float discountAmount;
    @XmlElement(name = "ExtrasAndServicesAmount")
    protected float extrasAndServicesAmount;
    @XmlElement(name = "Services")
    protected Services services;

    /**
     * Obtiene el valor de la propiedad accommodationAmount.
     * 
     */
    public float getAccommodationAmount() {
        return accommodationAmount;
    }

    /**
     * Define el valor de la propiedad accommodationAmount.
     * 
     */
    public void setAccommodationAmount(float value) {
        this.accommodationAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad discountAmount.
     * 
     */
    public float getDiscountAmount() {
        return discountAmount;
    }

    /**
     * Define el valor de la propiedad discountAmount.
     * 
     */
    public void setDiscountAmount(float value) {
        this.discountAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad extrasAndServicesAmount.
     * 
     */
    public float getExtrasAndServicesAmount() {
        return extrasAndServicesAmount;
    }

    /**
     * Define el valor de la propiedad extrasAndServicesAmount.
     * 
     */
    public void setExtrasAndServicesAmount(float value) {
        this.extrasAndServicesAmount = value;
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
