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
 * <p>Clase Java para Features complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Features"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Distribution" type="{ws.avantio.com/crsConnectionServices}Distribution" minOccurs="0"/&gt;
 *         &lt;element name="HouseCharacteristics" type="{ws.avantio.com/crsConnectionServices}HouseCharacteristics" minOccurs="0"/&gt;
 *         &lt;element name="Extras" type="{ws.avantio.com/crsConnectionServices}Extras" minOccurs="0"/&gt;
 *         &lt;element name="ExtrasAndServices" type="{ws.avantio.com/crsConnectionServices}ExtrasAndServices" minOccurs="0"/&gt;
 *         &lt;element name="Location" type="{ws.avantio.com/crsConnectionServices}Location" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Features", propOrder = {
    "distribution",
    "houseCharacteristics",
    "extras",
    "extrasAndServices",
    "location"
})
public class Features {

    @XmlElement(name = "Distribution")
    protected Distribution distribution;
    @XmlElement(name = "HouseCharacteristics")
    protected HouseCharacteristics houseCharacteristics;
    @XmlElement(name = "Extras")
    protected Extras extras;
    @XmlElement(name = "ExtrasAndServices")
    protected ExtrasAndServices extrasAndServices;
    @XmlElement(name = "Location")
    protected Location location;

    /**
     * Obtiene el valor de la propiedad distribution.
     * 
     * @return
     *     possible object is
     *     {@link Distribution }
     *     
     */
    public Distribution getDistribution() {
        return distribution;
    }

    /**
     * Define el valor de la propiedad distribution.
     * 
     * @param value
     *     allowed object is
     *     {@link Distribution }
     *     
     */
    public void setDistribution(Distribution value) {
        this.distribution = value;
    }

    /**
     * Obtiene el valor de la propiedad houseCharacteristics.
     * 
     * @return
     *     possible object is
     *     {@link HouseCharacteristics }
     *     
     */
    public HouseCharacteristics getHouseCharacteristics() {
        return houseCharacteristics;
    }

    /**
     * Define el valor de la propiedad houseCharacteristics.
     * 
     * @param value
     *     allowed object is
     *     {@link HouseCharacteristics }
     *     
     */
    public void setHouseCharacteristics(HouseCharacteristics value) {
        this.houseCharacteristics = value;
    }

    /**
     * Obtiene el valor de la propiedad extras.
     * 
     * @return
     *     possible object is
     *     {@link Extras }
     *     
     */
    public Extras getExtras() {
        return extras;
    }

    /**
     * Define el valor de la propiedad extras.
     * 
     * @param value
     *     allowed object is
     *     {@link Extras }
     *     
     */
    public void setExtras(Extras value) {
        this.extras = value;
    }

    /**
     * Obtiene el valor de la propiedad extrasAndServices.
     * 
     * @return
     *     possible object is
     *     {@link ExtrasAndServices }
     *     
     */
    public ExtrasAndServices getExtrasAndServices() {
        return extrasAndServices;
    }

    /**
     * Define el valor de la propiedad extrasAndServices.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtrasAndServices }
     *     
     */
    public void setExtrasAndServices(ExtrasAndServices value) {
        this.extrasAndServices = value;
    }

    /**
     * Obtiene el valor de la propiedad location.
     * 
     * @return
     *     possible object is
     *     {@link Location }
     *     
     */
    public Location getLocation() {
        return location;
    }

    /**
     * Define el valor de la propiedad location.
     * 
     * @param value
     *     allowed object is
     *     {@link Location }
     *     
     */
    public void setLocation(Location value) {
        this.location = value;
    }

}
