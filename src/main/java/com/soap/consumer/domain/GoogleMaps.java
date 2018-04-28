//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.04.15 a las 06:28:31 PM CEST 
//


package com.soap.consumer.domain;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GoogleMaps complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GoogleMaps"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Latitude" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Longitude" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MaxZoom" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="Zoom" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GoogleMaps", propOrder = {
    "latitude",
    "longitude",
    "maxZoom",
    "zoom"
})
public class GoogleMaps {

    @XmlElement(name = "Latitude", required = true)
    protected String latitude;
    @XmlElement(name = "Longitude", required = true)
    protected String longitude;
    @XmlElement(name = "MaxZoom")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger maxZoom;
    @XmlElement(name = "Zoom")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger zoom;

    /**
     * Obtiene el valor de la propiedad latitude.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLatitude() {
        return latitude;
    }

    /**
     * Define el valor de la propiedad latitude.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLatitude(String value) {
        this.latitude = value;
    }

    /**
     * Obtiene el valor de la propiedad longitude.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongitude() {
        return longitude;
    }

    /**
     * Define el valor de la propiedad longitude.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongitude(String value) {
        this.longitude = value;
    }

    /**
     * Obtiene el valor de la propiedad maxZoom.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxZoom() {
        return maxZoom;
    }

    /**
     * Define el valor de la propiedad maxZoom.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxZoom(BigInteger value) {
        this.maxZoom = value;
    }

    /**
     * Obtiene el valor de la propiedad zoom.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getZoom() {
        return zoom;
    }

    /**
     * Define el valor de la propiedad zoom.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setZoom(BigInteger value) {
        this.zoom = value;
    }

}
