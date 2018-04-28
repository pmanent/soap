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
 * <p>Clase Java para SupplementByAdditionalPerson complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SupplementByAdditionalPerson"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ApplicableFromNumberPeople" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/&gt;
 *         &lt;element name="Supplement" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupplementByAdditionalPerson", propOrder = {
    "applicableFromNumberPeople",
    "supplement"
})
public class SupplementByAdditionalPerson {

    @XmlElement(name = "ApplicableFromNumberPeople", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger applicableFromNumberPeople;
    @XmlElement(name = "Supplement")
    protected float supplement;

    /**
     * Obtiene el valor de la propiedad applicableFromNumberPeople.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getApplicableFromNumberPeople() {
        return applicableFromNumberPeople;
    }

    /**
     * Define el valor de la propiedad applicableFromNumberPeople.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setApplicableFromNumberPeople(BigInteger value) {
        this.applicableFromNumberPeople = value;
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

}
