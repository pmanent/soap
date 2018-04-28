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
 * <p>Clase Java para BookingData complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BookingData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ArrivalDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="DepartureDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="Accommodation" type="{ws.avantio.com/crsConnectionServices}Accommodation"/&gt;
 *         &lt;element name="Occupants" type="{ws.avantio.com/crsConnectionServices}Occupants"/&gt;
 *         &lt;element name="ClientData" type="{ws.avantio.com/crsConnectionServices}ClientData"/&gt;
 *         &lt;element name="Board" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaymentMethod" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
 *         &lt;element name="CreditCardData" type="{ws.avantio.com/crsConnectionServices}CreditCardData" minOccurs="0"/&gt;
 *         &lt;element name="BookingType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ExternalBookingCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FinalPrice" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SendMailToOrganization" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="SendMailToTourist" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="PaymentMethods" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BookingCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MaskedCreditCardNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Services" type="{ws.avantio.com/crsConnectionServices}Services" minOccurs="0"/&gt;
 *         &lt;element name="PromotionalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BookingData", propOrder = {
    "arrivalDate",
    "departureDate",
    "accommodation",
    "occupants",
    "clientData",
    "board",
    "paymentMethod",
    "creditCardData",
    "bookingType",
    "externalBookingCode",
    "finalPrice",
    "currency",
    "comments",
    "sendMailToOrganization",
    "sendMailToTourist",
    "paymentMethods",
    "bookingCode",
    "maskedCreditCardNumber",
    "services",
    "promotionalCode"
})
public class BookingData {

    @XmlElement(name = "ArrivalDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar arrivalDate;
    @XmlElement(name = "DepartureDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar departureDate;
    @XmlElement(name = "Accommodation", required = true)
    protected Accommodation accommodation;
    @XmlElement(name = "Occupants", required = true)
    protected Occupants occupants;
    @XmlElement(name = "ClientData", required = true)
    protected ClientData clientData;
    @XmlElement(name = "Board")
    protected String board;
    @XmlElement(name = "PaymentMethod", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger paymentMethod;
    @XmlElement(name = "CreditCardData")
    protected CreditCardData creditCardData;
    @XmlElement(name = "BookingType", required = true)
    protected String bookingType;
    @XmlElement(name = "ExternalBookingCode")
    protected String externalBookingCode;
    @XmlElement(name = "FinalPrice")
    protected Float finalPrice;
    @XmlElement(name = "Currency")
    protected String currency;
    @XmlElement(name = "Comments", required = true)
    protected String comments;
    @XmlElement(name = "SendMailToOrganization")
    protected boolean sendMailToOrganization;
    @XmlElement(name = "SendMailToTourist")
    protected boolean sendMailToTourist;
    @XmlElement(name = "PaymentMethods")
    protected String paymentMethods;
    @XmlElement(name = "BookingCode")
    protected String bookingCode;
    @XmlElement(name = "MaskedCreditCardNumber")
    protected String maskedCreditCardNumber;
    @XmlElement(name = "Services")
    protected Services services;
    @XmlElement(name = "PromotionalCode")
    protected String promotionalCode;

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
     * Obtiene el valor de la propiedad creditCardData.
     * 
     * @return
     *     possible object is
     *     {@link CreditCardData }
     *     
     */
    public CreditCardData getCreditCardData() {
        return creditCardData;
    }

    /**
     * Define el valor de la propiedad creditCardData.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCardData }
     *     
     */
    public void setCreditCardData(CreditCardData value) {
        this.creditCardData = value;
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
     * Obtiene el valor de la propiedad externalBookingCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalBookingCode() {
        return externalBookingCode;
    }

    /**
     * Define el valor de la propiedad externalBookingCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalBookingCode(String value) {
        this.externalBookingCode = value;
    }

    /**
     * Obtiene el valor de la propiedad finalPrice.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getFinalPrice() {
        return finalPrice;
    }

    /**
     * Define el valor de la propiedad finalPrice.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setFinalPrice(Float value) {
        this.finalPrice = value;
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
     * Obtiene el valor de la propiedad sendMailToOrganization.
     * 
     */
    public boolean isSendMailToOrganization() {
        return sendMailToOrganization;
    }

    /**
     * Define el valor de la propiedad sendMailToOrganization.
     * 
     */
    public void setSendMailToOrganization(boolean value) {
        this.sendMailToOrganization = value;
    }

    /**
     * Obtiene el valor de la propiedad sendMailToTourist.
     * 
     */
    public boolean isSendMailToTourist() {
        return sendMailToTourist;
    }

    /**
     * Define el valor de la propiedad sendMailToTourist.
     * 
     */
    public void setSendMailToTourist(boolean value) {
        this.sendMailToTourist = value;
    }

    /**
     * Obtiene el valor de la propiedad paymentMethods.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentMethods() {
        return paymentMethods;
    }

    /**
     * Define el valor de la propiedad paymentMethods.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentMethods(String value) {
        this.paymentMethods = value;
    }

    /**
     * Obtiene el valor de la propiedad bookingCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingCode() {
        return bookingCode;
    }

    /**
     * Define el valor de la propiedad bookingCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingCode(String value) {
        this.bookingCode = value;
    }

    /**
     * Obtiene el valor de la propiedad maskedCreditCardNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaskedCreditCardNumber() {
        return maskedCreditCardNumber;
    }

    /**
     * Define el valor de la propiedad maskedCreditCardNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaskedCreditCardNumber(String value) {
        this.maskedCreditCardNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad services.
     * 
     * @return
     *     possible object is
     *     {@link Services }
     *     
     */
    public Services getServices() {
        return services;
    }

    /**
     * Define el valor de la propiedad services.
     * 
     * @param value
     *     allowed object is
     *     {@link Services }
     *     
     */
    public void setServices(Services value) {
        this.services = value;
    }

    /**
     * Obtiene el valor de la propiedad promotionalCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromotionalCode() {
        return promotionalCode;
    }

    /**
     * Define el valor de la propiedad promotionalCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromotionalCode(String value) {
        this.promotionalCode = value;
    }

}
