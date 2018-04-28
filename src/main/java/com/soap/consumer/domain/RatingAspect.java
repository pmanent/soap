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
 * <p>Clase Java para RatingAspect complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RatingAspect"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AspectType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Rating" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RatingAspect", propOrder = {
    "aspectType",
    "rating"
})
public class RatingAspect {

    @XmlElement(name = "AspectType", required = true)
    protected String aspectType;
    @XmlElement(name = "Rating")
    protected int rating;

    /**
     * Obtiene el valor de la propiedad aspectType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAspectType() {
        return aspectType;
    }

    /**
     * Define el valor de la propiedad aspectType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAspectType(String value) {
        this.aspectType = value;
    }

    /**
     * Obtiene el valor de la propiedad rating.
     * 
     */
    public int getRating() {
        return rating;
    }

    /**
     * Define el valor de la propiedad rating.
     * 
     */
    public void setRating(int value) {
        this.rating = value;
    }

}
