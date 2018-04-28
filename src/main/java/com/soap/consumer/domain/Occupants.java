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
 * <p>Clase Java para Occupants complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Occupants"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AdultsNumber" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
 *         &lt;element name="Child1_Age" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="Child2_Age" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="Child3_Age" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="Child4_Age" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="Child5_Age" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="Child6_Age" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Occupants", propOrder = {
    "adultsNumber",
    "child1Age",
    "child2Age",
    "child3Age",
    "child4Age",
    "child5Age",
    "child6Age"
})
public class Occupants {

    @XmlElement(name = "AdultsNumber", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger adultsNumber;
    @XmlElement(name = "Child1_Age")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger child1Age;
    @XmlElement(name = "Child2_Age")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger child2Age;
    @XmlElement(name = "Child3_Age")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger child3Age;
    @XmlElement(name = "Child4_Age")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger child4Age;
    @XmlElement(name = "Child5_Age")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger child5Age;
    @XmlElement(name = "Child6_Age")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger child6Age;

    /**
     * Obtiene el valor de la propiedad adultsNumber.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAdultsNumber() {
        return adultsNumber;
    }

    /**
     * Define el valor de la propiedad adultsNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAdultsNumber(BigInteger value) {
        this.adultsNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad child1Age.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getChild1Age() {
        return child1Age;
    }

    /**
     * Define el valor de la propiedad child1Age.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setChild1Age(BigInteger value) {
        this.child1Age = value;
    }

    /**
     * Obtiene el valor de la propiedad child2Age.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getChild2Age() {
        return child2Age;
    }

    /**
     * Define el valor de la propiedad child2Age.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setChild2Age(BigInteger value) {
        this.child2Age = value;
    }

    /**
     * Obtiene el valor de la propiedad child3Age.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getChild3Age() {
        return child3Age;
    }

    /**
     * Define el valor de la propiedad child3Age.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setChild3Age(BigInteger value) {
        this.child3Age = value;
    }

    /**
     * Obtiene el valor de la propiedad child4Age.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getChild4Age() {
        return child4Age;
    }

    /**
     * Define el valor de la propiedad child4Age.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setChild4Age(BigInteger value) {
        this.child4Age = value;
    }

    /**
     * Obtiene el valor de la propiedad child5Age.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getChild5Age() {
        return child5Age;
    }

    /**
     * Define el valor de la propiedad child5Age.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setChild5Age(BigInteger value) {
        this.child5Age = value;
    }

    /**
     * Obtiene el valor de la propiedad child6Age.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getChild6Age() {
        return child6Age;
    }

    /**
     * Define el valor de la propiedad child6Age.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setChild6Age(BigInteger value) {
        this.child6Age = value;
    }

}
