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
 * <p>Clase Java para VAT complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="VAT"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Included" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Percentage" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VAT", propOrder = {
    "included",
    "percentage"
})
public class VAT {

    @XmlElement(name = "Included")
    protected boolean included;
    @XmlElement(name = "Percentage")
    protected Float percentage;

    /**
     * Obtiene el valor de la propiedad included.
     * 
     */
    public boolean isIncluded() {
        return included;
    }

    /**
     * Define el valor de la propiedad included.
     * 
     */
    public void setIncluded(boolean value) {
        this.included = value;
    }

    /**
     * Obtiene el valor de la propiedad percentage.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPercentage() {
        return percentage;
    }

    /**
     * Define el valor de la propiedad percentage.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPercentage(Float value) {
        this.percentage = value;
    }

}
