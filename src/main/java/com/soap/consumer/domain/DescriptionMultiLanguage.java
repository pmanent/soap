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
 * <p>Clase Java para DescriptionMultiLanguage complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DescriptionMultiLanguage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DescriptionES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DescriptionFR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DescriptionEN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DescriptionDE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DescriptionDU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DescriptionRU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DescriptionIT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DescriptionPT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DescriptionMultiLanguage", propOrder = {
    "descriptionES",
    "descriptionFR",
    "descriptionEN",
    "descriptionDE",
    "descriptionDU",
    "descriptionRU",
    "descriptionIT",
    "descriptionPT"
})
public class DescriptionMultiLanguage {

    @XmlElement(name = "DescriptionES")
    protected String descriptionES;
    @XmlElement(name = "DescriptionFR")
    protected String descriptionFR;
    @XmlElement(name = "DescriptionEN")
    protected String descriptionEN;
    @XmlElement(name = "DescriptionDE")
    protected String descriptionDE;
    @XmlElement(name = "DescriptionDU")
    protected String descriptionDU;
    @XmlElement(name = "DescriptionRU")
    protected String descriptionRU;
    @XmlElement(name = "DescriptionIT")
    protected String descriptionIT;
    @XmlElement(name = "DescriptionPT")
    protected String descriptionPT;

    /**
     * Obtiene el valor de la propiedad descriptionES.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionES() {
        return descriptionES;
    }

    /**
     * Define el valor de la propiedad descriptionES.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionES(String value) {
        this.descriptionES = value;
    }

    /**
     * Obtiene el valor de la propiedad descriptionFR.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionFR() {
        return descriptionFR;
    }

    /**
     * Define el valor de la propiedad descriptionFR.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionFR(String value) {
        this.descriptionFR = value;
    }

    /**
     * Obtiene el valor de la propiedad descriptionEN.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionEN() {
        return descriptionEN;
    }

    /**
     * Define el valor de la propiedad descriptionEN.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionEN(String value) {
        this.descriptionEN = value;
    }

    /**
     * Obtiene el valor de la propiedad descriptionDE.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionDE() {
        return descriptionDE;
    }

    /**
     * Define el valor de la propiedad descriptionDE.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionDE(String value) {
        this.descriptionDE = value;
    }

    /**
     * Obtiene el valor de la propiedad descriptionDU.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionDU() {
        return descriptionDU;
    }

    /**
     * Define el valor de la propiedad descriptionDU.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionDU(String value) {
        this.descriptionDU = value;
    }

    /**
     * Obtiene el valor de la propiedad descriptionRU.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionRU() {
        return descriptionRU;
    }

    /**
     * Define el valor de la propiedad descriptionRU.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionRU(String value) {
        this.descriptionRU = value;
    }

    /**
     * Obtiene el valor de la propiedad descriptionIT.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionIT() {
        return descriptionIT;
    }

    /**
     * Define el valor de la propiedad descriptionIT.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionIT(String value) {
        this.descriptionIT = value;
    }

    /**
     * Obtiene el valor de la propiedad descriptionPT.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionPT() {
        return descriptionPT;
    }

    /**
     * Define el valor de la propiedad descriptionPT.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionPT(String value) {
        this.descriptionPT = value;
    }

}
