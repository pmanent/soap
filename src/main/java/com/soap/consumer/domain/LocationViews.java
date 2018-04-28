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
 * <p>Clase Java para LocationViews complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="LocationViews"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ViewToBeach" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ViewToSwimmingPool" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ViewToGolf" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ViewToGarden" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ViewToRiver" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ViewToMountain" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ViewToLake" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ViewToSki" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationViews", propOrder = {
    "viewToBeach",
    "viewToSwimmingPool",
    "viewToGolf",
    "viewToGarden",
    "viewToRiver",
    "viewToMountain",
    "viewToLake",
    "viewToSki"
})
public class LocationViews {

    @XmlElement(name = "ViewToBeach")
    protected Boolean viewToBeach;
    @XmlElement(name = "ViewToSwimmingPool")
    protected Boolean viewToSwimmingPool;
    @XmlElement(name = "ViewToGolf")
    protected Boolean viewToGolf;
    @XmlElement(name = "ViewToGarden")
    protected Boolean viewToGarden;
    @XmlElement(name = "ViewToRiver")
    protected Boolean viewToRiver;
    @XmlElement(name = "ViewToMountain")
    protected Boolean viewToMountain;
    @XmlElement(name = "ViewToLake")
    protected Boolean viewToLake;
    @XmlElement(name = "ViewToSki")
    protected Boolean viewToSki;

    /**
     * Obtiene el valor de la propiedad viewToBeach.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isViewToBeach() {
        return viewToBeach;
    }

    /**
     * Define el valor de la propiedad viewToBeach.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setViewToBeach(Boolean value) {
        this.viewToBeach = value;
    }

    /**
     * Obtiene el valor de la propiedad viewToSwimmingPool.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isViewToSwimmingPool() {
        return viewToSwimmingPool;
    }

    /**
     * Define el valor de la propiedad viewToSwimmingPool.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setViewToSwimmingPool(Boolean value) {
        this.viewToSwimmingPool = value;
    }

    /**
     * Obtiene el valor de la propiedad viewToGolf.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isViewToGolf() {
        return viewToGolf;
    }

    /**
     * Define el valor de la propiedad viewToGolf.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setViewToGolf(Boolean value) {
        this.viewToGolf = value;
    }

    /**
     * Obtiene el valor de la propiedad viewToGarden.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isViewToGarden() {
        return viewToGarden;
    }

    /**
     * Define el valor de la propiedad viewToGarden.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setViewToGarden(Boolean value) {
        this.viewToGarden = value;
    }

    /**
     * Obtiene el valor de la propiedad viewToRiver.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isViewToRiver() {
        return viewToRiver;
    }

    /**
     * Define el valor de la propiedad viewToRiver.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setViewToRiver(Boolean value) {
        this.viewToRiver = value;
    }

    /**
     * Obtiene el valor de la propiedad viewToMountain.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isViewToMountain() {
        return viewToMountain;
    }

    /**
     * Define el valor de la propiedad viewToMountain.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setViewToMountain(Boolean value) {
        this.viewToMountain = value;
    }

    /**
     * Obtiene el valor de la propiedad viewToLake.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isViewToLake() {
        return viewToLake;
    }

    /**
     * Define el valor de la propiedad viewToLake.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setViewToLake(Boolean value) {
        this.viewToLake = value;
    }

    /**
     * Obtiene el valor de la propiedad viewToSki.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isViewToSki() {
        return viewToSki;
    }

    /**
     * Define el valor de la propiedad viewToSki.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setViewToSki(Boolean value) {
        this.viewToSki = value;
    }

}
