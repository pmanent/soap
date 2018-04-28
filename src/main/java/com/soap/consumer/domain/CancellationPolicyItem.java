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
 * <p>Clase Java para CancellationPolicyItem complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CancellationPolicyItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RoomOnlyAmount" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="BedAndBreakfastAmount" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="HalfBoardAmount" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="FullBoardAmount" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="AllIncludedAmount" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="Deadline" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancellationPolicyItem", propOrder = {
    "roomOnlyAmount",
    "bedAndBreakfastAmount",
    "halfBoardAmount",
    "fullBoardAmount",
    "allIncludedAmount",
    "deadline"
})
public class CancellationPolicyItem {

    @XmlElement(name = "RoomOnlyAmount")
    protected Float roomOnlyAmount;
    @XmlElement(name = "BedAndBreakfastAmount")
    protected Float bedAndBreakfastAmount;
    @XmlElement(name = "HalfBoardAmount")
    protected Float halfBoardAmount;
    @XmlElement(name = "FullBoardAmount")
    protected Float fullBoardAmount;
    @XmlElement(name = "AllIncludedAmount")
    protected Float allIncludedAmount;
    @XmlElement(name = "Deadline", required = true)
    protected String deadline;

    /**
     * Obtiene el valor de la propiedad roomOnlyAmount.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getRoomOnlyAmount() {
        return roomOnlyAmount;
    }

    /**
     * Define el valor de la propiedad roomOnlyAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setRoomOnlyAmount(Float value) {
        this.roomOnlyAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad bedAndBreakfastAmount.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getBedAndBreakfastAmount() {
        return bedAndBreakfastAmount;
    }

    /**
     * Define el valor de la propiedad bedAndBreakfastAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setBedAndBreakfastAmount(Float value) {
        this.bedAndBreakfastAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad halfBoardAmount.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getHalfBoardAmount() {
        return halfBoardAmount;
    }

    /**
     * Define el valor de la propiedad halfBoardAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setHalfBoardAmount(Float value) {
        this.halfBoardAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad fullBoardAmount.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getFullBoardAmount() {
        return fullBoardAmount;
    }

    /**
     * Define el valor de la propiedad fullBoardAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setFullBoardAmount(Float value) {
        this.fullBoardAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad allIncludedAmount.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getAllIncludedAmount() {
        return allIncludedAmount;
    }

    /**
     * Define el valor de la propiedad allIncludedAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setAllIncludedAmount(Float value) {
        this.allIncludedAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad deadline.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeadline() {
        return deadline;
    }

    /**
     * Define el valor de la propiedad deadline.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeadline(String value) {
        this.deadline = value;
    }

}
