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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para BookingDataResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BookingDataResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Localizer" type="{ws.avantio.com/crsConnectionServices}Localizer" minOccurs="0"/&gt;
 *         &lt;element name="ArrivalDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="DepartureDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="BookingDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Price" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="PriceDetails" type="{ws.avantio.com/crsConnectionServices}PriceDetails" minOccurs="0"/&gt;
 *         &lt;element name="Deposit" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Board" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Accommodation" type="{ws.avantio.com/crsConnectionServices}Accommodation"/&gt;
 *         &lt;element name="Occupants" type="{ws.avantio.com/crsConnectionServices}Occupants"/&gt;
 *         &lt;element name="ClientData" type="{ws.avantio.com/crsConnectionServices}ClientData"/&gt;
 *         &lt;element name="PaymentMethod" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
 *         &lt;element name="BookingType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LastUpdatedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BookingLanguage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AppliedTaxPercentage" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="CommentsDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BookingDataResponse", propOrder = {
    "localizer",
    "arrivalDate",
    "departureDate",
    "bookingDate",
    "price",
    "priceDetails",
    "deposit",
    "currency",
    "board",
    "accommodation",
    "occupants",
    "clientData",
    "paymentMethod",
    "bookingType",
    "comments",
    "lastUpdatedDate",
    "bookingLanguage",
    "appliedTaxPercentage",
    "commentsDate"
})
public class BookingDataResponse {

    @XmlElement(name = "Localizer")
    protected Localizer localizer;
    @XmlElement(name = "ArrivalDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar arrivalDate;
    @XmlElement(name = "DepartureDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar departureDate;
    @XmlElement(name = "BookingDate")
    protected String bookingDate;
    @XmlElement(name = "Price")
    protected float price;
    @XmlElement(name = "PriceDetails")
    protected PriceDetails priceDetails;
    @XmlElement(name = "Deposit")
    protected float deposit;
    @XmlElement(name = "Currency", required = true)
    protected String currency;
    @XmlElement(name = "Board", required = true)
    protected String board;
    @XmlElement(name = "Accommodation", required = true)
    protected Accommodation accommodation;
    @XmlElement(name = "Occupants", required = true)
    protected Occupants occupants;
    @XmlElement(name = "ClientData", required = true)
    protected ClientData clientData;
    @XmlElement(name = "PaymentMethod", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger paymentMethod;
    @XmlElement(name = "BookingType", required = true)
    protected String bookingType;
    @XmlElement(name = "Comments", required = true)
    protected String comments;
    @XmlElement(name = "LastUpdatedDate")
    protected String lastUpdatedDate;
    @XmlElement(name = "BookingLanguage")
    protected String bookingLanguage;
    @XmlElement(name = "AppliedTaxPercentage")
    protected Float appliedTaxPercentage;
    @XmlElement(name = "CommentsDate")
    protected String commentsDate;

    /**
     * Obtiene el valor de la propiedad localizer.
     * 
     * @return
     *     possible object is
     *     {@link Localizer }
     *     
     */
    public Localizer getLocalizer() {
        return localizer;
    }

    /**
     * Define el valor de la propiedad localizer.
     * 
     * @param value
     *     allowed object is
     *     {@link Localizer }
     *     
     */
    public void setLocalizer(Localizer value) {
        this.localizer = value;
    }

    /**
     * Obtiene el valor de la propiedad arrivalDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getArrivalDate() {
        return arrivalDate;
    }

    /**
     * Define el valor de la propiedad arrivalDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setArrivalDate(XMLGregorianCalendar value) {
        this.arrivalDate = value;
    }

    /**
     * Obtiene el valor de la propiedad departureDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDepartureDate() {
        return departureDate;
    }

    /**
     * Define el valor de la propiedad departureDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDepartureDate(XMLGregorianCalendar value) {
        this.departureDate = value;
    }

    /**
     * Obtiene el valor de la propiedad bookingDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingDate() {
        return bookingDate;
    }

    /**
     * Define el valor de la propiedad bookingDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingDate(String value) {
        this.bookingDate = value;
    }

    /**
     * Obtiene el valor de la propiedad price.
     * 
     */
    public float getPrice() {
        return price;
    }

    /**
     * Define el valor de la propiedad price.
     * 
     */
    public void setPrice(float value) {
        this.price = value;
    }

    /**
     * Obtiene el valor de la propiedad priceDetails.
     * 
     * @return
     *     possible object is
     *     {@link PriceDetails }
     *     
     */
    public PriceDetails getPriceDetails() {
        return priceDetails;
    }

    /**
     * Define el valor de la propiedad priceDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceDetails }
     *     
     */
    public void setPriceDetails(PriceDetails value) {
        this.priceDetails = value;
    }

    /**
     * Obtiene el valor de la propiedad deposit.
     * 
     */
    public float getDeposit() {
        return deposit;
    }

    /**
     * Define el valor de la propiedad deposit.
     * 
     */
    public void setDeposit(float value) {
        this.deposit = value;
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
     * Obtiene el valor de la propiedad board.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoard() {
        return board;
    }

    /**
     * Define el valor de la propiedad board.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoard(String value) {
        this.board = value;
    }

    /**
     * Obtiene el valor de la propiedad accommodation.
     * 
     * @return
     *     possible object is
     *     {@link Accommodation }
     *     
     */
    public Accommodation getAccommodation() {
        return accommodation;
    }

    /**
     * Define el valor de la propiedad accommodation.
     * 
     * @param value
     *     allowed object is
     *     {@link Accommodation }
     *     
     */
    public void setAccommodation(Accommodation value) {
        this.accommodation = value;
    }

    /**
     * Obtiene el valor de la propiedad occupants.
     * 
     * @return
     *     possible object is
     *     {@link Occupants }
     *     
     */
    public Occupants getOccupants() {
        return occupants;
    }

    /**
     * Define el valor de la propiedad occupants.
     * 
     * @param value
     *     allowed object is
     *     {@link Occupants }
     *     
     */
    public void setOccupants(Occupants value) {
        this.occupants = value;
    }

    /**
     * Obtiene el valor de la propiedad clientData.
     * 
     * @return
     *     possible object is
     *     {@link ClientData }
     *     
     */
    public ClientData getClientData() {
        return clientData;
    }

    /**
     * Define el valor de la propiedad clientData.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientData }
     *     
     */
    public void setClientData(ClientData value) {
        this.clientData = value;
    }

    /**
     * Obtiene el valor de la propiedad paymentMethod.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Define el valor de la propiedad paymentMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPaymentMethod(BigInteger value) {
        this.paymentMethod = value;
    }

    /**
     * Obtiene el valor de la propiedad bookingType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingType() {
        return bookingType;
    }

    /**
     * Define el valor de la propiedad bookingType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingType(String value) {
        this.bookingType = value;
    }

    /**
     * Obtiene el valor de la propiedad comments.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Define el valor de la propiedad comments.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
    }

    /**
     * Obtiene el valor de la propiedad lastUpdatedDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    /**
     * Define el valor de la propiedad lastUpdatedDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastUpdatedDate(String value) {
        this.lastUpdatedDate = value;
    }

    /**
     * Obtiene el valor de la propiedad bookingLanguage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingLanguage() {
        return bookingLanguage;
    }

    /**
     * Define el valor de la propiedad bookingLanguage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingLanguage(String value) {
        this.bookingLanguage = value;
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

    /**
     * Obtiene el valor de la propiedad commentsDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommentsDate() {
        return commentsDate;
    }

    /**
     * Define el valor de la propiedad commentsDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommentsDate(String value) {
        this.commentsDate = value;
    }

}
