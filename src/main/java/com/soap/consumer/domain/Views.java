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
 * <p>Clase Java para Views complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Views"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ViewToBeach" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ViewToSwimmingPool" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ViewToGarden" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ViewToLake" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ViewToGolf" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ViewToRiver" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ViewToMountain" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ViewToSki" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Views", propOrder = {
    "viewToBeach",
    "viewToSwimmingPool",
    "viewToGarden",
    "viewToLake",
    "viewToGolf",
    "viewToRiver",
    "viewToMountain",
    "viewToSki"
})
public class Views {

    @XmlElement(name = "ViewToBeach")
    protected boolean viewToBeach;
    @XmlElement(name = "ViewToSwimmingPool")
    protected boolean viewToSwimmingPool;
    @XmlElement(name = "ViewToGarden")
    protected boolean viewToGarden;
    @XmlElement(name = "ViewToLake")
    protected boolean viewToLake;
    @XmlElement(name = "ViewToGolf")
    protected boolean viewToGolf;
    @XmlElement(name = "ViewToRiver")
    protected boolean viewToRiver;
    @XmlElement(name = "ViewToMountain")
    protected boolean viewToMountain;
    @XmlElement(name = "ViewToSki")
    protected boolean viewToSki;

    /**
     * Obtiene el valor de la propiedad viewToBeach.
     * 
     */
    public boolean isViewToBeach() {
        return viewToBeach;
    }

    /**
     * Define el valor de la propiedad viewToBeach.
     * 
     */
    public void setViewToBeach(boolean value) {
        this.viewToBeach = value;
    }

    /**
     * Obtiene el valor de la propiedad viewToSwimmingPool.
     * 
     */
    public boolean isViewToSwimmingPool() {
        return viewToSwimmingPool;
    }

    /**
     * Define el valor de la propiedad viewToSwimmingPool.
     * 
     */
    public void setViewToSwimmingPool(boolean value) {
        this.viewToSwimmingPool = value;
    }

    /**
     * Obtiene el valor de la propiedad viewToGarden.
     * 
     */
    public boolean isViewToGarden() {
        return viewToGarden;
    }

    /**
     * Define el valor de la propiedad viewToGarden.
     * 
     */
    public void setViewToGarden(boolean value) {
        this.viewToGarden = value;
    }

    /**
     * Obtiene el valor de la propiedad viewToLake.
     * 
     */
    public boolean isViewToLake() {
        return viewToLake;
    }

    /**
     * Define el valor de la propiedad viewToLake.
     * 
     */
    public void setViewToLake(boolean value) {
        this.viewToLake = value;
    }

    /**
     * Obtiene el valor de la propiedad viewToGolf.
     * 
     */
    public boolean isViewToGolf() {
        return viewToGolf;
    }

    /**
     * Define el valor de la propiedad viewToGolf.
     * 
     */
    public void setViewToGolf(boolean value) {
        this.viewToGolf = value;
    }

    /**
     * Obtiene el valor de la propiedad viewToRiver.
     * 
     */
    public boolean isViewToRiver() {
        return viewToRiver;
    }

    /**
     * Define el valor de la propiedad viewToRiver.
     * 
     */
    public void setViewToRiver(boolean value) {
        this.viewToRiver = value;
    }

    /**
     * Obtiene el valor de la propiedad viewToMountain.
     * 
     */
    public boolean isViewToMountain() {
        return viewToMountain;
    }

    /**
     * Define el valor de la propiedad viewToMountain.
     * 
     */
    public void setViewToMountain(boolean value) {
        this.viewToMountain = value;
    }

    /**
     * Obtiene el valor de la propiedad viewToSki.
     * 
     */
    public boolean isViewToSki() {
        return viewToSki;
    }

    /**
     * Define el valor de la propiedad viewToSki.
     * 
     */
    public void setViewToSki(boolean value) {
        this.viewToSki = value;
    }

}
