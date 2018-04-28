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
 * <p>Clase Java para Distances complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Distances"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BeachDistance" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="SkiDistance" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="TownDistance" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="FirstBeachLine" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="FirstSkiLine" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="FirstGolfLine" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Distances", propOrder = {
    "beachDistance",
    "skiDistance",
    "townDistance",
    "firstBeachLine",
    "firstSkiLine",
    "firstGolfLine"
})
public class Distances {

    @XmlElement(name = "BeachDistance")
    protected Float beachDistance;
    @XmlElement(name = "SkiDistance")
    protected Float skiDistance;
    @XmlElement(name = "TownDistance")
    protected Float townDistance;
    @XmlElement(name = "FirstBeachLine")
    protected boolean firstBeachLine;
    @XmlElement(name = "FirstSkiLine")
    protected boolean firstSkiLine;
    @XmlElement(name = "FirstGolfLine")
    protected boolean firstGolfLine;

    /**
     * Obtiene el valor de la propiedad beachDistance.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getBeachDistance() {
        return beachDistance;
    }

    /**
     * Define el valor de la propiedad beachDistance.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setBeachDistance(Float value) {
        this.beachDistance = value;
    }

    /**
     * Obtiene el valor de la propiedad skiDistance.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSkiDistance() {
        return skiDistance;
    }

    /**
     * Define el valor de la propiedad skiDistance.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSkiDistance(Float value) {
        this.skiDistance = value;
    }

    /**
     * Obtiene el valor de la propiedad townDistance.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getTownDistance() {
        return townDistance;
    }

    /**
     * Define el valor de la propiedad townDistance.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTownDistance(Float value) {
        this.townDistance = value;
    }

    /**
     * Obtiene el valor de la propiedad firstBeachLine.
     * 
     */
    public boolean isFirstBeachLine() {
        return firstBeachLine;
    }

    /**
     * Define el valor de la propiedad firstBeachLine.
     * 
     */
    public void setFirstBeachLine(boolean value) {
        this.firstBeachLine = value;
    }

    /**
     * Obtiene el valor de la propiedad firstSkiLine.
     * 
     */
    public boolean isFirstSkiLine() {
        return firstSkiLine;
    }

    /**
     * Define el valor de la propiedad firstSkiLine.
     * 
     */
    public void setFirstSkiLine(boolean value) {
        this.firstSkiLine = value;
    }

    /**
     * Obtiene el valor de la propiedad firstGolfLine.
     * 
     */
    public boolean isFirstGolfLine() {
        return firstGolfLine;
    }

    /**
     * Define el valor de la propiedad firstGolfLine.
     * 
     */
    public void setFirstGolfLine(boolean value) {
        this.firstGolfLine = value;
    }

}
