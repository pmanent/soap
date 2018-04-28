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
 * <p>Clase Java para Discounts complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Discounts"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ThirdPerson" type="{ws.avantio.com/crsConnectionServices}Discount" minOccurs="0"/&gt;
 *         &lt;element name="ForthPerson" type="{ws.avantio.com/crsConnectionServices}Discount" minOccurs="0"/&gt;
 *         &lt;element name="FifthPerson" type="{ws.avantio.com/crsConnectionServices}Discount" minOccurs="0"/&gt;
 *         &lt;element name="SixthPerson" type="{ws.avantio.com/crsConnectionServices}Discount" minOccurs="0"/&gt;
 *         &lt;element name="SeventhPerson" type="{ws.avantio.com/crsConnectionServices}Discount" minOccurs="0"/&gt;
 *         &lt;element name="FirstChild" type="{ws.avantio.com/crsConnectionServices}Discount" minOccurs="0"/&gt;
 *         &lt;element name="SecondChild" type="{ws.avantio.com/crsConnectionServices}Discount" minOccurs="0"/&gt;
 *         &lt;element name="ThirdChild" type="{ws.avantio.com/crsConnectionServices}Discount" minOccurs="0"/&gt;
 *         &lt;element name="ForthChild" type="{ws.avantio.com/crsConnectionServices}Discount" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Discounts", propOrder = {
    "thirdPerson",
    "forthPerson",
    "fifthPerson",
    "sixthPerson",
    "seventhPerson",
    "firstChild",
    "secondChild",
    "thirdChild",
    "forthChild"
})
public class Discounts {

    @XmlElement(name = "ThirdPerson")
    protected Discount thirdPerson;
    @XmlElement(name = "ForthPerson")
    protected Discount forthPerson;
    @XmlElement(name = "FifthPerson")
    protected Discount fifthPerson;
    @XmlElement(name = "SixthPerson")
    protected Discount sixthPerson;
    @XmlElement(name = "SeventhPerson")
    protected Discount seventhPerson;
    @XmlElement(name = "FirstChild")
    protected Discount firstChild;
    @XmlElement(name = "SecondChild")
    protected Discount secondChild;
    @XmlElement(name = "ThirdChild")
    protected Discount thirdChild;
    @XmlElement(name = "ForthChild")
    protected Discount forthChild;

    /**
     * Obtiene el valor de la propiedad thirdPerson.
     * 
     * @return
     *     possible object is
     *     {@link Discount }
     *     
     */
    public Discount getThirdPerson() {
        return thirdPerson;
    }

    /**
     * Define el valor de la propiedad thirdPerson.
     * 
     * @param value
     *     allowed object is
     *     {@link Discount }
     *     
     */
    public void setThirdPerson(Discount value) {
        this.thirdPerson = value;
    }

    /**
     * Obtiene el valor de la propiedad forthPerson.
     * 
     * @return
     *     possible object is
     *     {@link Discount }
     *     
     */
    public Discount getForthPerson() {
        return forthPerson;
    }

    /**
     * Define el valor de la propiedad forthPerson.
     * 
     * @param value
     *     allowed object is
     *     {@link Discount }
     *     
     */
    public void setForthPerson(Discount value) {
        this.forthPerson = value;
    }

    /**
     * Obtiene el valor de la propiedad fifthPerson.
     * 
     * @return
     *     possible object is
     *     {@link Discount }
     *     
     */
    public Discount getFifthPerson() {
        return fifthPerson;
    }

    /**
     * Define el valor de la propiedad fifthPerson.
     * 
     * @param value
     *     allowed object is
     *     {@link Discount }
     *     
     */
    public void setFifthPerson(Discount value) {
        this.fifthPerson = value;
    }

    /**
     * Obtiene el valor de la propiedad sixthPerson.
     * 
     * @return
     *     possible object is
     *     {@link Discount }
     *     
     */
    public Discount getSixthPerson() {
        return sixthPerson;
    }

    /**
     * Define el valor de la propiedad sixthPerson.
     * 
     * @param value
     *     allowed object is
     *     {@link Discount }
     *     
     */
    public void setSixthPerson(Discount value) {
        this.sixthPerson = value;
    }

    /**
     * Obtiene el valor de la propiedad seventhPerson.
     * 
     * @return
     *     possible object is
     *     {@link Discount }
     *     
     */
    public Discount getSeventhPerson() {
        return seventhPerson;
    }

    /**
     * Define el valor de la propiedad seventhPerson.
     * 
     * @param value
     *     allowed object is
     *     {@link Discount }
     *     
     */
    public void setSeventhPerson(Discount value) {
        this.seventhPerson = value;
    }

    /**
     * Obtiene el valor de la propiedad firstChild.
     * 
     * @return
     *     possible object is
     *     {@link Discount }
     *     
     */
    public Discount getFirstChild() {
        return firstChild;
    }

    /**
     * Define el valor de la propiedad firstChild.
     * 
     * @param value
     *     allowed object is
     *     {@link Discount }
     *     
     */
    public void setFirstChild(Discount value) {
        this.firstChild = value;
    }

    /**
     * Obtiene el valor de la propiedad secondChild.
     * 
     * @return
     *     possible object is
     *     {@link Discount }
     *     
     */
    public Discount getSecondChild() {
        return secondChild;
    }

    /**
     * Define el valor de la propiedad secondChild.
     * 
     * @param value
     *     allowed object is
     *     {@link Discount }
     *     
     */
    public void setSecondChild(Discount value) {
        this.secondChild = value;
    }

    /**
     * Obtiene el valor de la propiedad thirdChild.
     * 
     * @return
     *     possible object is
     *     {@link Discount }
     *     
     */
    public Discount getThirdChild() {
        return thirdChild;
    }

    /**
     * Define el valor de la propiedad thirdChild.
     * 
     * @param value
     *     allowed object is
     *     {@link Discount }
     *     
     */
    public void setThirdChild(Discount value) {
        this.thirdChild = value;
    }

    /**
     * Obtiene el valor de la propiedad forthChild.
     * 
     * @return
     *     possible object is
     *     {@link Discount }
     *     
     */
    public Discount getForthChild() {
        return forthChild;
    }

    /**
     * Define el valor de la propiedad forthChild.
     * 
     * @param value
     *     allowed object is
     *     {@link Discount }
     *     
     */
    public void setForthChild(Discount value) {
        this.forthChild = value;
    }

}
