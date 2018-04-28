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
 * <p>Clase Java para LocationDescription complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="LocationDescription"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Where" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Howto" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Description1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Description2" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationDescription", propOrder = {
    "where",
    "howto",
    "description1",
    "description2"
})
public class LocationDescription {

    @XmlElement(name = "Where", required = true)
    protected String where;
    @XmlElement(name = "Howto", required = true)
    protected String howto;
    @XmlElement(name = "Description1", required = true)
    protected String description1;
    @XmlElement(name = "Description2", required = true)
    protected String description2;

    /**
     * Obtiene el valor de la propiedad where.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWhere() {
        return where;
    }

    /**
     * Define el valor de la propiedad where.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWhere(String value) {
        this.where = value;
    }

    /**
     * Obtiene el valor de la propiedad howto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHowto() {
        return howto;
    }

    /**
     * Define el valor de la propiedad howto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHowto(String value) {
        this.howto = value;
    }

    /**
     * Obtiene el valor de la propiedad description1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription1() {
        return description1;
    }

    /**
     * Define el valor de la propiedad description1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription1(String value) {
        this.description1 = value;
    }

    /**
     * Obtiene el valor de la propiedad description2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription2() {
        return description2;
    }

    /**
     * Define el valor de la propiedad description2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription2(String value) {
        this.description2 = value;
    }

}
