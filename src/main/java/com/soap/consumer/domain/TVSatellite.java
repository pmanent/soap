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
 * <p>Clase Java para TVSatellite complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TVSatellite"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="LanguageEN" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="LanguageES" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="LanguageFR" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="LanguageDE" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="LanguageDU" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="LanguageRU" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LanguageNO" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LanguageSV" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TVSatellite", propOrder = {
    "value",
    "languageEN",
    "languageES",
    "languageFR",
    "languageDE",
    "languageDU",
    "languageRU",
    "languageNO",
    "languageSV"
})
public class TVSatellite {

    @XmlElement(name = "Value")
    protected boolean value;
    @XmlElement(name = "LanguageEN")
    protected boolean languageEN;
    @XmlElement(name = "LanguageES")
    protected boolean languageES;
    @XmlElement(name = "LanguageFR")
    protected boolean languageFR;
    @XmlElement(name = "LanguageDE")
    protected boolean languageDE;
    @XmlElement(name = "LanguageDU")
    protected boolean languageDU;
    @XmlElement(name = "LanguageRU")
    protected Boolean languageRU;
    @XmlElement(name = "LanguageNO")
    protected Boolean languageNO;
    @XmlElement(name = "LanguageSV")
    protected Boolean languageSV;

    /**
     * Obtiene el valor de la propiedad value.
     * 
     */
    public boolean isValue() {
        return value;
    }

    /**
     * Define el valor de la propiedad value.
     * 
     */
    public void setValue(boolean value) {
        this.value = value;
    }

    /**
     * Obtiene el valor de la propiedad languageEN.
     * 
     */
    public boolean isLanguageEN() {
        return languageEN;
    }

    /**
     * Define el valor de la propiedad languageEN.
     * 
     */
    public void setLanguageEN(boolean value) {
        this.languageEN = value;
    }

    /**
     * Obtiene el valor de la propiedad languageES.
     * 
     */
    public boolean isLanguageES() {
        return languageES;
    }

    /**
     * Define el valor de la propiedad languageES.
     * 
     */
    public void setLanguageES(boolean value) {
        this.languageES = value;
    }

    /**
     * Obtiene el valor de la propiedad languageFR.
     * 
     */
    public boolean isLanguageFR() {
        return languageFR;
    }

    /**
     * Define el valor de la propiedad languageFR.
     * 
     */
    public void setLanguageFR(boolean value) {
        this.languageFR = value;
    }

    /**
     * Obtiene el valor de la propiedad languageDE.
     * 
     */
    public boolean isLanguageDE() {
        return languageDE;
    }

    /**
     * Define el valor de la propiedad languageDE.
     * 
     */
    public void setLanguageDE(boolean value) {
        this.languageDE = value;
    }

    /**
     * Obtiene el valor de la propiedad languageDU.
     * 
     */
    public boolean isLanguageDU() {
        return languageDU;
    }

    /**
     * Define el valor de la propiedad languageDU.
     * 
     */
    public void setLanguageDU(boolean value) {
        this.languageDU = value;
    }

    /**
     * Obtiene el valor de la propiedad languageRU.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLanguageRU() {
        return languageRU;
    }

    /**
     * Define el valor de la propiedad languageRU.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLanguageRU(Boolean value) {
        this.languageRU = value;
    }

    /**
     * Obtiene el valor de la propiedad languageNO.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLanguageNO() {
        return languageNO;
    }

    /**
     * Define el valor de la propiedad languageNO.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLanguageNO(Boolean value) {
        this.languageNO = value;
    }

    /**
     * Obtiene el valor de la propiedad languageSV.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLanguageSV() {
        return languageSV;
    }

    /**
     * Define el valor de la propiedad languageSV.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLanguageSV(Boolean value) {
        this.languageSV = value;
    }

}
