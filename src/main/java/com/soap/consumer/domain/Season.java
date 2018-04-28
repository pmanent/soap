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
 * <p>Clase Java para Season complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Season"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StartDay" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
 *         &lt;element name="StartMonth" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
 *         &lt;element name="FinalDay" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
 *         &lt;element name="FinalMonth" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Season", propOrder = {
    "startDay",
    "startMonth",
    "finalDay",
    "finalMonth"
})
public class Season {

    @XmlElement(name = "StartDay", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger startDay;
    @XmlElement(name = "StartMonth", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger startMonth;
    @XmlElement(name = "FinalDay", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger finalDay;
    @XmlElement(name = "FinalMonth", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger finalMonth;

    /**
     * Obtiene el valor de la propiedad startDay.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStartDay() {
        return startDay;
    }

    /**
     * Define el valor de la propiedad startDay.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStartDay(BigInteger value) {
        this.startDay = value;
    }

    /**
     * Obtiene el valor de la propiedad startMonth.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStartMonth() {
        return startMonth;
    }

    /**
     * Define el valor de la propiedad startMonth.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStartMonth(BigInteger value) {
        this.startMonth = value;
    }

    /**
     * Obtiene el valor de la propiedad finalDay.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFinalDay() {
        return finalDay;
    }

    /**
     * Define el valor de la propiedad finalDay.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFinalDay(BigInteger value) {
        this.finalDay = value;
    }

    /**
     * Obtiene el valor de la propiedad finalMonth.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFinalMonth() {
        return finalMonth;
    }

    /**
     * Define el valor de la propiedad finalMonth.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFinalMonth(BigInteger value) {
        this.finalMonth = value;
    }

}
