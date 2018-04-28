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
 * <p>Clase Java para TitleMultiLanguage complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TitleMultiLanguage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TitleES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TitleFR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TitleEN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TitleDE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TitleDU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TitleRU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TitleIT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TitlePT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TitleMultiLanguage", propOrder = {
    "titleES",
    "titleFR",
    "titleEN",
    "titleDE",
    "titleDU",
    "titleRU",
    "titleIT",
    "titlePT"
})
public class TitleMultiLanguage {

    @XmlElement(name = "TitleES")
    protected String titleES;
    @XmlElement(name = "TitleFR")
    protected String titleFR;
    @XmlElement(name = "TitleEN")
    protected String titleEN;
    @XmlElement(name = "TitleDE")
    protected String titleDE;
    @XmlElement(name = "TitleDU")
    protected String titleDU;
    @XmlElement(name = "TitleRU")
    protected String titleRU;
    @XmlElement(name = "TitleIT")
    protected String titleIT;
    @XmlElement(name = "TitlePT")
    protected String titlePT;

    /**
     * Obtiene el valor de la propiedad titleES.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitleES() {
        return titleES;
    }

    /**
     * Define el valor de la propiedad titleES.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitleES(String value) {
        this.titleES = value;
    }

    /**
     * Obtiene el valor de la propiedad titleFR.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitleFR() {
        return titleFR;
    }

    /**
     * Define el valor de la propiedad titleFR.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitleFR(String value) {
        this.titleFR = value;
    }

    /**
     * Obtiene el valor de la propiedad titleEN.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitleEN() {
        return titleEN;
    }

    /**
     * Define el valor de la propiedad titleEN.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitleEN(String value) {
        this.titleEN = value;
    }

    /**
     * Obtiene el valor de la propiedad titleDE.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitleDE() {
        return titleDE;
    }

    /**
     * Define el valor de la propiedad titleDE.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitleDE(String value) {
        this.titleDE = value;
    }

    /**
     * Obtiene el valor de la propiedad titleDU.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitleDU() {
        return titleDU;
    }

    /**
     * Define el valor de la propiedad titleDU.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitleDU(String value) {
        this.titleDU = value;
    }

    /**
     * Obtiene el valor de la propiedad titleRU.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitleRU() {
        return titleRU;
    }

    /**
     * Define el valor de la propiedad titleRU.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitleRU(String value) {
        this.titleRU = value;
    }

    /**
     * Obtiene el valor de la propiedad titleIT.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitleIT() {
        return titleIT;
    }

    /**
     * Define el valor de la propiedad titleIT.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitleIT(String value) {
        this.titleIT = value;
    }

    /**
     * Obtiene el valor de la propiedad titlePT.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitlePT() {
        return titlePT;
    }

    /**
     * Define el valor de la propiedad titlePT.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitlePT(String value) {
        this.titlePT = value;
    }

}
