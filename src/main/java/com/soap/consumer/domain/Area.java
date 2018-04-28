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
 * <p>Clase Java para Area complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Area"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Area" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
 *         &lt;element name="AreaUnit" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Area", propOrder = {
    "area",
    "areaUnit"
})
public class Area {

    @XmlElement(name = "Area", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger area;
    @XmlElement(name = "AreaUnit", required = true)
    protected String areaUnit;

    /**
     * Obtiene el valor de la propiedad area.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getArea() {
        return area;
    }

    /**
     * Define el valor de la propiedad area.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setArea(BigInteger value) {
        this.area = value;
    }

    /**
     * Obtiene el valor de la propiedad areaUnit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaUnit() {
        return areaUnit;
    }

    /**
     * Define el valor de la propiedad areaUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaUnit(String value) {
        this.areaUnit = value;
    }

}
