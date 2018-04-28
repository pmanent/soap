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
 * <p>Clase Java para SingleSupplement complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SingleSupplement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Supplement" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="SingleSupplementType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SingleSupplement", propOrder = {
    "type",
    "supplement",
    "singleSupplementType"
})
public class SingleSupplement {

    @XmlElement(name = "Type", required = true)
    protected String type;
    @XmlElement(name = "Supplement")
    protected float supplement;
    @XmlElement(name = "SingleSupplementType", required = true)
    protected String singleSupplementType;

    /**
     * Obtiene el valor de la propiedad type.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Define el valor de la propiedad type.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Obtiene el valor de la propiedad supplement.
     * 
     */
    public float getSupplement() {
        return supplement;
    }

    /**
     * Define el valor de la propiedad supplement.
     * 
     */
    public void setSupplement(float value) {
        this.supplement = value;
    }

    /**
     * Obtiene el valor de la propiedad singleSupplementType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSingleSupplementType() {
        return singleSupplementType;
    }

    /**
     * Define el valor de la propiedad singleSupplementType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSingleSupplementType(String value) {
        this.singleSupplementType = value;
    }

}
