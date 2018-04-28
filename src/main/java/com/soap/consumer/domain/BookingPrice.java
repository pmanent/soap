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
 * <p>Clase Java para BookingPrice complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BookingPrice"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RoomOnly" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="BedAndBreakfast" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="HalfBoard" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="FullBoard" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="AllIncluded" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="RoomOnlyFinal" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="BedAndBreakfastFinal" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="HalfBoardFinal" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="FullBoardFinal" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="AllIncludedFinal" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="RoomOnlyWithoutOffer" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="BedAndBreakfastWithoutOffer" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="HalfBoardWithoutOffer" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="FullBoardWithoutOffer" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="AllIncludedWithoutOffer" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="RoomOnlyFinalWithoutOffer" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="BedAndBreakfastFinalWithoutOffer" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="HalfBoardFinalWithoutOffer" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="FullBoardFinalWithoutOffer" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="AllIncludedFinalWithoutOffer" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="RoomOnlyPaymentWhenBooking" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="BedAndBreakfastPaymentWhenBooking" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="HalfBoardPaymentWhenBooking" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="FullBoardPaymentWhenBooking" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="AllIncludedPaymentWhenBooking" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="RoomOnlyFinalPaymentDetails" type="{ws.avantio.com/crsConnectionServices}PaymentDetails"/&gt;
 *         &lt;element name="BedAndBreakfastFinalPaymentDetails" type="{ws.avantio.com/crsConnectionServices}PaymentDetails"/&gt;
 *         &lt;element name="HalfBoardFinalPaymentDetails" type="{ws.avantio.com/crsConnectionServices}PaymentDetails"/&gt;
 *         &lt;element name="FullBoardFinalPaymentDetails" type="{ws.avantio.com/crsConnectionServices}PaymentDetails"/&gt;
 *         &lt;element name="AllIncludedFinalPaymentDetails" type="{ws.avantio.com/crsConnectionServices}PaymentDetails"/&gt;
 *         &lt;element name="PromotionalCodeStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RoomOnlyPromotionalCodeDiscount" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="BedAndBreakfastPromotionalCodeDiscount" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="HalfBoardPromotionalCodeDiscount" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="FullBoardPromotionalCodeDiscount" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="AllIncludedPromotionalCodeDiscount" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AppliedTaxPercentage" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BookingPrice", propOrder = {
    "roomOnly",
    "bedAndBreakfast",
    "halfBoard",
    "fullBoard",
    "allIncluded",
    "roomOnlyFinal",
    "bedAndBreakfastFinal",
    "halfBoardFinal",
    "fullBoardFinal",
    "allIncludedFinal",
    "roomOnlyWithoutOffer",
    "bedAndBreakfastWithoutOffer",
    "halfBoardWithoutOffer",
    "fullBoardWithoutOffer",
    "allIncludedWithoutOffer",
    "roomOnlyFinalWithoutOffer",
    "bedAndBreakfastFinalWithoutOffer",
    "halfBoardFinalWithoutOffer",
    "fullBoardFinalWithoutOffer",
    "allIncludedFinalWithoutOffer",
    "roomOnlyPaymentWhenBooking",
    "bedAndBreakfastPaymentWhenBooking",
    "halfBoardPaymentWhenBooking",
    "fullBoardPaymentWhenBooking",
    "allIncludedPaymentWhenBooking",
    "roomOnlyFinalPaymentDetails",
    "bedAndBreakfastFinalPaymentDetails",
    "halfBoardFinalPaymentDetails",
    "fullBoardFinalPaymentDetails",
    "allIncludedFinalPaymentDetails",
    "promotionalCodeStatus",
    "roomOnlyPromotionalCodeDiscount",
    "bedAndBreakfastPromotionalCodeDiscount",
    "halfBoardPromotionalCodeDiscount",
    "fullBoardPromotionalCodeDiscount",
    "allIncludedPromotionalCodeDiscount",
    "currency",
    "appliedTaxPercentage"
})
public class BookingPrice {

    @XmlElement(name = "RoomOnly")
    protected Float roomOnly;
    @XmlElement(name = "BedAndBreakfast")
    protected Float bedAndBreakfast;
    @XmlElement(name = "HalfBoard")
    protected Float halfBoard;
    @XmlElement(name = "FullBoard")
    protected Float fullBoard;
    @XmlElement(name = "AllIncluded")
    protected Float allIncluded;
    @XmlElement(name = "RoomOnlyFinal")
    protected Float roomOnlyFinal;
    @XmlElement(name = "BedAndBreakfastFinal")
    protected Float bedAndBreakfastFinal;
    @XmlElement(name = "HalfBoardFinal")
    protected Float halfBoardFinal;
    @XmlElement(name = "FullBoardFinal")
    protected Float fullBoardFinal;
    @XmlElement(name = "AllIncludedFinal")
    protected Float allIncludedFinal;
    @XmlElement(name = "RoomOnlyWithoutOffer")
    protected Float roomOnlyWithoutOffer;
    @XmlElement(name = "BedAndBreakfastWithoutOffer")
    protected Float bedAndBreakfastWithoutOffer;
    @XmlElement(name = "HalfBoardWithoutOffer")
    protected Float halfBoardWithoutOffer;
    @XmlElement(name = "FullBoardWithoutOffer")
    protected Float fullBoardWithoutOffer;
    @XmlElement(name = "AllIncludedWithoutOffer")
    protected Float allIncludedWithoutOffer;
    @XmlElement(name = "RoomOnlyFinalWithoutOffer")
    protected Float roomOnlyFinalWithoutOffer;
    @XmlElement(name = "BedAndBreakfastFinalWithoutOffer")
    protected Float bedAndBreakfastFinalWithoutOffer;
    @XmlElement(name = "HalfBoardFinalWithoutOffer")
    protected Float halfBoardFinalWithoutOffer;
    @XmlElement(name = "FullBoardFinalWithoutOffer")
    protected Float fullBoardFinalWithoutOffer;
    @XmlElement(name = "AllIncludedFinalWithoutOffer")
    protected Float allIncludedFinalWithoutOffer;
    @XmlElement(name = "RoomOnlyPaymentWhenBooking")
    protected Float roomOnlyPaymentWhenBooking;
    @XmlElement(name = "BedAndBreakfastPaymentWhenBooking")
    protected Float bedAndBreakfastPaymentWhenBooking;
    @XmlElement(name = "HalfBoardPaymentWhenBooking")
    protected Float halfBoardPaymentWhenBooking;
    @XmlElement(name = "FullBoardPaymentWhenBooking")
    protected Float fullBoardPaymentWhenBooking;
    @XmlElement(name = "AllIncludedPaymentWhenBooking")
    protected Float allIncludedPaymentWhenBooking;
    @XmlElement(name = "RoomOnlyFinalPaymentDetails", required = true)
    protected PaymentDetails roomOnlyFinalPaymentDetails;
    @XmlElement(name = "BedAndBreakfastFinalPaymentDetails", required = true)
    protected PaymentDetails bedAndBreakfastFinalPaymentDetails;
    @XmlElement(name = "HalfBoardFinalPaymentDetails", required = true)
    protected PaymentDetails halfBoardFinalPaymentDetails;
    @XmlElement(name = "FullBoardFinalPaymentDetails", required = true)
    protected PaymentDetails fullBoardFinalPaymentDetails;
    @XmlElement(name = "AllIncludedFinalPaymentDetails", required = true)
    protected PaymentDetails allIncludedFinalPaymentDetails;
    @XmlElement(name = "PromotionalCodeStatus")
    protected String promotionalCodeStatus;
    @XmlElement(name = "RoomOnlyPromotionalCodeDiscount")
    protected Float roomOnlyPromotionalCodeDiscount;
    @XmlElement(name = "BedAndBreakfastPromotionalCodeDiscount")
    protected Float bedAndBreakfastPromotionalCodeDiscount;
    @XmlElement(name = "HalfBoardPromotionalCodeDiscount")
    protected Float halfBoardPromotionalCodeDiscount;
    @XmlElement(name = "FullBoardPromotionalCodeDiscount")
    protected Float fullBoardPromotionalCodeDiscount;
    @XmlElement(name = "AllIncludedPromotionalCodeDiscount")
    protected Float allIncludedPromotionalCodeDiscount;
    @XmlElement(name = "Currency")
    protected String currency;
    @XmlElement(name = "AppliedTaxPercentage")
    protected Float appliedTaxPercentage;

    /**
     * Obtiene el valor de la propiedad roomOnly.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getRoomOnly() {
        return roomOnly;
    }

    /**
     * Define el valor de la propiedad roomOnly.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setRoomOnly(Float value) {
        this.roomOnly = value;
    }

    /**
     * Obtiene el valor de la propiedad bedAndBreakfast.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getBedAndBreakfast() {
        return bedAndBreakfast;
    }

    /**
     * Define el valor de la propiedad bedAndBreakfast.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setBedAndBreakfast(Float value) {
        this.bedAndBreakfast = value;
    }

    /**
     * Obtiene el valor de la propiedad halfBoard.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getHalfBoard() {
        return halfBoard;
    }

    /**
     * Define el valor de la propiedad halfBoard.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setHalfBoard(Float value) {
        this.halfBoard = value;
    }

    /**
     * Obtiene el valor de la propiedad fullBoard.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getFullBoard() {
        return fullBoard;
    }

    /**
     * Define el valor de la propiedad fullBoard.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setFullBoard(Float value) {
        this.fullBoard = value;
    }

    /**
     * Obtiene el valor de la propiedad allIncluded.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getAllIncluded() {
        return allIncluded;
    }

    /**
     * Define el valor de la propiedad allIncluded.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setAllIncluded(Float value) {
        this.allIncluded = value;
    }

    /**
     * Obtiene el valor de la propiedad roomOnlyFinal.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getRoomOnlyFinal() {
        return roomOnlyFinal;
    }

    /**
     * Define el valor de la propiedad roomOnlyFinal.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setRoomOnlyFinal(Float value) {
        this.roomOnlyFinal = value;
    }

    /**
     * Obtiene el valor de la propiedad bedAndBreakfastFinal.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getBedAndBreakfastFinal() {
        return bedAndBreakfastFinal;
    }

    /**
     * Define el valor de la propiedad bedAndBreakfastFinal.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setBedAndBreakfastFinal(Float value) {
        this.bedAndBreakfastFinal = value;
    }

    /**
     * Obtiene el valor de la propiedad halfBoardFinal.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getHalfBoardFinal() {
        return halfBoardFinal;
    }

    /**
     * Define el valor de la propiedad halfBoardFinal.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setHalfBoardFinal(Float value) {
        this.halfBoardFinal = value;
    }

    /**
     * Obtiene el valor de la propiedad fullBoardFinal.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getFullBoardFinal() {
        return fullBoardFinal;
    }

    /**
     * Define el valor de la propiedad fullBoardFinal.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setFullBoardFinal(Float value) {
        this.fullBoardFinal = value;
    }

    /**
     * Obtiene el valor de la propiedad allIncludedFinal.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getAllIncludedFinal() {
        return allIncludedFinal;
    }

    /**
     * Define el valor de la propiedad allIncludedFinal.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setAllIncludedFinal(Float value) {
        this.allIncludedFinal = value;
    }

    /**
     * Obtiene el valor de la propiedad roomOnlyWithoutOffer.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getRoomOnlyWithoutOffer() {
        return roomOnlyWithoutOffer;
    }

    /**
     * Define el valor de la propiedad roomOnlyWithoutOffer.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setRoomOnlyWithoutOffer(Float value) {
        this.roomOnlyWithoutOffer = value;
    }

    /**
     * Obtiene el valor de la propiedad bedAndBreakfastWithoutOffer.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getBedAndBreakfastWithoutOffer() {
        return bedAndBreakfastWithoutOffer;
    }

    /**
     * Define el valor de la propiedad bedAndBreakfastWithoutOffer.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setBedAndBreakfastWithoutOffer(Float value) {
        this.bedAndBreakfastWithoutOffer = value;
    }

    /**
     * Obtiene el valor de la propiedad halfBoardWithoutOffer.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getHalfBoardWithoutOffer() {
        return halfBoardWithoutOffer;
    }

    /**
     * Define el valor de la propiedad halfBoardWithoutOffer.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setHalfBoardWithoutOffer(Float value) {
        this.halfBoardWithoutOffer = value;
    }

    /**
     * Obtiene el valor de la propiedad fullBoardWithoutOffer.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getFullBoardWithoutOffer() {
        return fullBoardWithoutOffer;
    }

    /**
     * Define el valor de la propiedad fullBoardWithoutOffer.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setFullBoardWithoutOffer(Float value) {
        this.fullBoardWithoutOffer = value;
    }

    /**
     * Obtiene el valor de la propiedad allIncludedWithoutOffer.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getAllIncludedWithoutOffer() {
        return allIncludedWithoutOffer;
    }

    /**
     * Define el valor de la propiedad allIncludedWithoutOffer.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setAllIncludedWithoutOffer(Float value) {
        this.allIncludedWithoutOffer = value;
    }

    /**
     * Obtiene el valor de la propiedad roomOnlyFinalWithoutOffer.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getRoomOnlyFinalWithoutOffer() {
        return roomOnlyFinalWithoutOffer;
    }

    /**
     * Define el valor de la propiedad roomOnlyFinalWithoutOffer.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setRoomOnlyFinalWithoutOffer(Float value) {
        this.roomOnlyFinalWithoutOffer = value;
    }

    /**
     * Obtiene el valor de la propiedad bedAndBreakfastFinalWithoutOffer.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getBedAndBreakfastFinalWithoutOffer() {
        return bedAndBreakfastFinalWithoutOffer;
    }

    /**
     * Define el valor de la propiedad bedAndBreakfastFinalWithoutOffer.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setBedAndBreakfastFinalWithoutOffer(Float value) {
        this.bedAndBreakfastFinalWithoutOffer = value;
    }

    /**
     * Obtiene el valor de la propiedad halfBoardFinalWithoutOffer.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getHalfBoardFinalWithoutOffer() {
        return halfBoardFinalWithoutOffer;
    }

    /**
     * Define el valor de la propiedad halfBoardFinalWithoutOffer.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setHalfBoardFinalWithoutOffer(Float value) {
        this.halfBoardFinalWithoutOffer = value;
    }

    /**
     * Obtiene el valor de la propiedad fullBoardFinalWithoutOffer.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getFullBoardFinalWithoutOffer() {
        return fullBoardFinalWithoutOffer;
    }

    /**
     * Define el valor de la propiedad fullBoardFinalWithoutOffer.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setFullBoardFinalWithoutOffer(Float value) {
        this.fullBoardFinalWithoutOffer = value;
    }

    /**
     * Obtiene el valor de la propiedad allIncludedFinalWithoutOffer.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getAllIncludedFinalWithoutOffer() {
        return allIncludedFinalWithoutOffer;
    }

    /**
     * Define el valor de la propiedad allIncludedFinalWithoutOffer.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setAllIncludedFinalWithoutOffer(Float value) {
        this.allIncludedFinalWithoutOffer = value;
    }

    /**
     * Obtiene el valor de la propiedad roomOnlyPaymentWhenBooking.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getRoomOnlyPaymentWhenBooking() {
        return roomOnlyPaymentWhenBooking;
    }

    /**
     * Define el valor de la propiedad roomOnlyPaymentWhenBooking.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setRoomOnlyPaymentWhenBooking(Float value) {
        this.roomOnlyPaymentWhenBooking = value;
    }

    /**
     * Obtiene el valor de la propiedad bedAndBreakfastPaymentWhenBooking.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getBedAndBreakfastPaymentWhenBooking() {
        return bedAndBreakfastPaymentWhenBooking;
    }

    /**
     * Define el valor de la propiedad bedAndBreakfastPaymentWhenBooking.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setBedAndBreakfastPaymentWhenBooking(Float value) {
        this.bedAndBreakfastPaymentWhenBooking = value;
    }

    /**
     * Obtiene el valor de la propiedad halfBoardPaymentWhenBooking.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getHalfBoardPaymentWhenBooking() {
        return halfBoardPaymentWhenBooking;
    }

    /**
     * Define el valor de la propiedad halfBoardPaymentWhenBooking.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setHalfBoardPaymentWhenBooking(Float value) {
        this.halfBoardPaymentWhenBooking = value;
    }

    /**
     * Obtiene el valor de la propiedad fullBoardPaymentWhenBooking.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getFullBoardPaymentWhenBooking() {
        return fullBoardPaymentWhenBooking;
    }

    /**
     * Define el valor de la propiedad fullBoardPaymentWhenBooking.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setFullBoardPaymentWhenBooking(Float value) {
        this.fullBoardPaymentWhenBooking = value;
    }

    /**
     * Obtiene el valor de la propiedad allIncludedPaymentWhenBooking.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getAllIncludedPaymentWhenBooking() {
        return allIncludedPaymentWhenBooking;
    }

    /**
     * Define el valor de la propiedad allIncludedPaymentWhenBooking.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setAllIncludedPaymentWhenBooking(Float value) {
        this.allIncludedPaymentWhenBooking = value;
    }

    /**
     * Obtiene el valor de la propiedad roomOnlyFinalPaymentDetails.
     * 
     * @return
     *     possible object is
     *     {@link PaymentDetails }
     *     
     */
    public PaymentDetails getRoomOnlyFinalPaymentDetails() {
        return roomOnlyFinalPaymentDetails;
    }

    /**
     * Define el valor de la propiedad roomOnlyFinalPaymentDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentDetails }
     *     
     */
    public void setRoomOnlyFinalPaymentDetails(PaymentDetails value) {
        this.roomOnlyFinalPaymentDetails = value;
    }

    /**
     * Obtiene el valor de la propiedad bedAndBreakfastFinalPaymentDetails.
     * 
     * @return
     *     possible object is
     *     {@link PaymentDetails }
     *     
     */
    public PaymentDetails getBedAndBreakfastFinalPaymentDetails() {
        return bedAndBreakfastFinalPaymentDetails;
    }

    /**
     * Define el valor de la propiedad bedAndBreakfastFinalPaymentDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentDetails }
     *     
     */
    public void setBedAndBreakfastFinalPaymentDetails(PaymentDetails value) {
        this.bedAndBreakfastFinalPaymentDetails = value;
    }

    /**
     * Obtiene el valor de la propiedad halfBoardFinalPaymentDetails.
     * 
     * @return
     *     possible object is
     *     {@link PaymentDetails }
     *     
     */
    public PaymentDetails getHalfBoardFinalPaymentDetails() {
        return halfBoardFinalPaymentDetails;
    }

    /**
     * Define el valor de la propiedad halfBoardFinalPaymentDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentDetails }
     *     
     */
    public void setHalfBoardFinalPaymentDetails(PaymentDetails value) {
        this.halfBoardFinalPaymentDetails = value;
    }

    /**
     * Obtiene el valor de la propiedad fullBoardFinalPaymentDetails.
     * 
     * @return
     *     possible object is
     *     {@link PaymentDetails }
     *     
     */
    public PaymentDetails getFullBoardFinalPaymentDetails() {
        return fullBoardFinalPaymentDetails;
    }

    /**
     * Define el valor de la propiedad fullBoardFinalPaymentDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentDetails }
     *     
     */
    public void setFullBoardFinalPaymentDetails(PaymentDetails value) {
        this.fullBoardFinalPaymentDetails = value;
    }

    /**
     * Obtiene el valor de la propiedad allIncludedFinalPaymentDetails.
     * 
     * @return
     *     possible object is
     *     {@link PaymentDetails }
     *     
     */
    public PaymentDetails getAllIncludedFinalPaymentDetails() {
        return allIncludedFinalPaymentDetails;
    }

    /**
     * Define el valor de la propiedad allIncludedFinalPaymentDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentDetails }
     *     
     */
    public void setAllIncludedFinalPaymentDetails(PaymentDetails value) {
        this.allIncludedFinalPaymentDetails = value;
    }

    /**
     * Obtiene el valor de la propiedad promotionalCodeStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromotionalCodeStatus() {
        return promotionalCodeStatus;
    }

    /**
     * Define el valor de la propiedad promotionalCodeStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromotionalCodeStatus(String value) {
        this.promotionalCodeStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad roomOnlyPromotionalCodeDiscount.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getRoomOnlyPromotionalCodeDiscount() {
        return roomOnlyPromotionalCodeDiscount;
    }

    /**
     * Define el valor de la propiedad roomOnlyPromotionalCodeDiscount.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setRoomOnlyPromotionalCodeDiscount(Float value) {
        this.roomOnlyPromotionalCodeDiscount = value;
    }

    /**
     * Obtiene el valor de la propiedad bedAndBreakfastPromotionalCodeDiscount.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getBedAndBreakfastPromotionalCodeDiscount() {
        return bedAndBreakfastPromotionalCodeDiscount;
    }

    /**
     * Define el valor de la propiedad bedAndBreakfastPromotionalCodeDiscount.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setBedAndBreakfastPromotionalCodeDiscount(Float value) {
        this.bedAndBreakfastPromotionalCodeDiscount = value;
    }

    /**
     * Obtiene el valor de la propiedad halfBoardPromotionalCodeDiscount.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getHalfBoardPromotionalCodeDiscount() {
        return halfBoardPromotionalCodeDiscount;
    }

    /**
     * Define el valor de la propiedad halfBoardPromotionalCodeDiscount.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setHalfBoardPromotionalCodeDiscount(Float value) {
        this.halfBoardPromotionalCodeDiscount = value;
    }

    /**
     * Obtiene el valor de la propiedad fullBoardPromotionalCodeDiscount.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getFullBoardPromotionalCodeDiscount() {
        return fullBoardPromotionalCodeDiscount;
    }

    /**
     * Define el valor de la propiedad fullBoardPromotionalCodeDiscount.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setFullBoardPromotionalCodeDiscount(Float value) {
        this.fullBoardPromotionalCodeDiscount = value;
    }

    /**
     * Obtiene el valor de la propiedad allIncludedPromotionalCodeDiscount.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getAllIncludedPromotionalCodeDiscount() {
        return allIncludedPromotionalCodeDiscount;
    }

    /**
     * Define el valor de la propiedad allIncludedPromotionalCodeDiscount.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setAllIncludedPromotionalCodeDiscount(Float value) {
        this.allIncludedPromotionalCodeDiscount = value;
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

    /**
     * Obtiene el valor de la propiedad appliedTaxPercentage.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getAppliedTaxPercentage() {
        return appliedTaxPercentage;
    }

    /**
     * Define el valor de la propiedad appliedTaxPercentage.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setAppliedTaxPercentage(Float value) {
        this.appliedTaxPercentage = value;
    }

}
