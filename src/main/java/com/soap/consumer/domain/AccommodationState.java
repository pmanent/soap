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
 * <p>Clase Java para AccommodationState complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AccommodationState"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AccommodationCode" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
 *         &lt;element name="AvailableCode" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
 *         &lt;element name="IsOnRequest" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="RoomOnlyPrice" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="RoomOnlyWithoutOfferPrice" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccommodationState", propOrder = {
    "accommodationCode",
    "availableCode",
    "isOnRequest",
    "roomOnlyPrice",
    "roomOnlyWithoutOfferPrice",
    "currency"
})
public class AccommodationState {

    @XmlElement(name = "AccommodationCode", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger accommodationCode;
    @XmlElement(name = "AvailableCode", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger availableCode;
    @XmlElement(name = "IsOnRequest")
    protected boolean isOnRequest;
    @XmlElement(name = "RoomOnlyPrice")
    protected float roomOnlyPrice;
    @XmlElement(name = "RoomOnlyWithoutOfferPrice")
    protected float roomOnlyWithoutOfferPrice;
    @XmlElement(name = "Currency", required = true)
    protected String currency;

    /**
     * Obtiene el valor de la propiedad accommodationCode.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAccommodationCode() {
        return accommodationCode;
    }

    /**
     * Define el valor de la propiedad accommodationCode.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAccommodationCode(BigInteger value) {
        this.accommodationCode = value;
    }

    /**
     * Obtiene el valor de la propiedad availableCode.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAvailableCode() {
        return availableCode;
    }

    /**
     * Define el valor de la propiedad availableCode.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAvailableCode(BigInteger value) {
        this.availableCode = value;
    }

    /**
     * Obtiene el valor de la propiedad isOnRequest.
     * 
     */
    public boolean isIsOnRequest() {
        return isOnRequest;
    }

    /**
     * Define el valor de la propiedad isOnRequest.
     * 
     */
    public void setIsOnRequest(boolean value) {
        this.isOnRequest = value;
    }

    /**
     * Obtiene el valor de la propiedad roomOnlyPrice.
     * 
     */
    public float getRoomOnlyPrice() {
        return roomOnlyPrice;
    }

    /**
     * Define el valor de la propiedad roomOnlyPrice.
     * 
     */
    public void setRoomOnlyPrice(float value) {
        this.roomOnlyPrice = value;
    }

    /**
     * Obtiene el valor de la propiedad roomOnlyWithoutOfferPrice.
     * 
     */
    public float getRoomOnlyWithoutOfferPrice() {
        return roomOnlyWithoutOfferPrice;
    }

    /**
     * Define el valor de la propiedad roomOnlyWithoutOfferPrice.
     * 
     */
    public void setRoomOnlyWithoutOfferPrice(float value) {
        this.roomOnlyWithoutOfferPrice = value;
    }

    /**
     * Obtiene el valor de la propiedad currency.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Define el valor de la propiedad currency.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

}
