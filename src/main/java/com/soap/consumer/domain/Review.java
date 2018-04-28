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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para Review complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Review"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GuestName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Language" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Rating" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PositiveComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NegativeComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Reply" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RatingAspects" type="{ws.avantio.com/crsConnectionServices}RatingAspects" minOccurs="0"/&gt;
 *         &lt;element name="BookingStartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="BookingEndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="ReviewDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Review", propOrder = {
    "guestName",
    "language",
    "rating",
    "title",
    "positiveComment",
    "negativeComment",
    "reply",
    "ratingAspects",
    "bookingStartDate",
    "bookingEndDate",
    "reviewDate"
})
public class Review {

    @XmlElement(name = "GuestName", required = true)
    protected String guestName;
    @XmlElement(name = "Language", required = true)
    protected String language;
    @XmlElement(name = "Rating")
    protected int rating;
    @XmlElement(name = "Title", required = true)
    protected String title;
    @XmlElement(name = "PositiveComment")
    protected String positiveComment;
    @XmlElement(name = "NegativeComment")
    protected String negativeComment;
    @XmlElement(name = "Reply")
    protected String reply;
    @XmlElement(name = "RatingAspects")
    protected RatingAspects ratingAspects;
    @XmlElement(name = "BookingStartDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar bookingStartDate;
    @XmlElement(name = "BookingEndDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar bookingEndDate;
    @XmlElement(name = "ReviewDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar reviewDate;

    /**
     * Obtiene el valor de la propiedad guestName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuestName() {
        return guestName;
    }

    /**
     * Define el valor de la propiedad guestName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuestName(String value) {
        this.guestName = value;
    }

    /**
     * Obtiene el valor de la propiedad language.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Define el valor de la propiedad language.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Obtiene el valor de la propiedad rating.
     * 
     */
    public int getRating() {
        return rating;
    }

    /**
     * Define el valor de la propiedad rating.
     * 
     */
    public void setRating(int value) {
        this.rating = value;
    }

    /**
     * Obtiene el valor de la propiedad title.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Define el valor de la propiedad title.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Obtiene el valor de la propiedad positiveComment.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPositiveComment() {
        return positiveComment;
    }

    /**
     * Define el valor de la propiedad positiveComment.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPositiveComment(String value) {
        this.positiveComment = value;
    }

    /**
     * Obtiene el valor de la propiedad negativeComment.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNegativeComment() {
        return negativeComment;
    }

    /**
     * Define el valor de la propiedad negativeComment.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNegativeComment(String value) {
        this.negativeComment = value;
    }

    /**
     * Obtiene el valor de la propiedad reply.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReply() {
        return reply;
    }

    /**
     * Define el valor de la propiedad reply.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReply(String value) {
        this.reply = value;
    }

    /**
     * Obtiene el valor de la propiedad ratingAspects.
     * 
     * @return
     *     possible object is
     *     {@link RatingAspects }
     *     
     */
    public RatingAspects getRatingAspects() {
        return ratingAspects;
    }

    /**
     * Define el valor de la propiedad ratingAspects.
     * 
     * @param value
     *     allowed object is
     *     {@link RatingAspects }
     *     
     */
    public void setRatingAspects(RatingAspects value) {
        this.ratingAspects = value;
    }

    /**
     * Obtiene el valor de la propiedad bookingStartDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBookingStartDate() {
        return bookingStartDate;
    }

    /**
     * Define el valor de la propiedad bookingStartDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBookingStartDate(XMLGregorianCalendar value) {
        this.bookingStartDate = value;
    }

    /**
     * Obtiene el valor de la propiedad bookingEndDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBookingEndDate() {
        return bookingEndDate;
    }

    /**
     * Define el valor de la propiedad bookingEndDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBookingEndDate(XMLGregorianCalendar value) {
        this.bookingEndDate = value;
    }

    /**
     * Obtiene el valor de la propiedad reviewDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReviewDate() {
        return reviewDate;
    }

    /**
     * Define el valor de la propiedad reviewDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReviewDate(XMLGregorianCalendar value) {
        this.reviewDate = value;
    }

}
