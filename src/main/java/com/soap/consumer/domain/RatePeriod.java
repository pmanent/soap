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
 * <p>Clase Java para RatePeriod complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RatePeriod"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="RoomOnly" type="{ws.avantio.com/crsConnectionServices}PriceByType" minOccurs="0"/&gt;
 *         &lt;element name="BedAndBreakfast" type="{ws.avantio.com/crsConnectionServices}PriceByType" minOccurs="0"/&gt;
 *         &lt;element name="HalfBoard" type="{ws.avantio.com/crsConnectionServices}PriceByType" minOccurs="0"/&gt;
 *         &lt;element name="FullBoard" type="{ws.avantio.com/crsConnectionServices}PriceByType" minOccurs="0"/&gt;
 *         &lt;element name="AllIncluded" type="{ws.avantio.com/crsConnectionServices}PriceByType" minOccurs="0"/&gt;
 *         &lt;element name="Discounts" type="{ws.avantio.com/crsConnectionServices}Discounts" minOccurs="0"/&gt;
 *         &lt;element name="Supplements" type="{ws.avantio.com/crsConnectionServices}Supplements" minOccurs="0"/&gt;
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RatePeriod", propOrder = {
    "startDate",
    "endDate",
    "roomOnly",
    "bedAndBreakfast",
    "halfBoard",
    "fullBoard",
    "allIncluded",
    "discounts",
    "supplements",
    "currency"
})
public class RatePeriod {

    @XmlElement(name = "StartDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    @XmlElement(name = "EndDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDate;
    @XmlElement(name = "RoomOnly")
    protected PriceByType roomOnly;
    @XmlElement(name = "BedAndBreakfast")
    protected PriceByType bedAndBreakfast;
    @XmlElement(name = "HalfBoard")
    protected PriceByType halfBoard;
    @XmlElement(name = "FullBoard")
    protected PriceByType fullBoard;
    @XmlElement(name = "AllIncluded")
    protected PriceByType allIncluded;
    @XmlElement(name = "Discounts")
    protected Discounts discounts;
    @XmlElement(name = "Supplements")
    protected Supplements supplements;
    @XmlElement(name = "Currency")
    protected String currency;

    /**
     * Obtiene el valor de la propiedad startDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Define el valor de la propiedad startDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Obtiene el valor de la propiedad endDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Define el valor de la propiedad endDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Obtiene el valor de la propiedad roomOnly.
     * 
     * @return
     *     possible object is
     *     {@link PriceByType }
     *     
     */
    public PriceByType getRoomOnly() {
        return roomOnly;
    }

    /**
     * Define el valor de la propiedad roomOnly.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceByType }
     *     
     */
    public void setRoomOnly(PriceByType value) {
        this.roomOnly = value;
    }

    /**
     * Obtiene el valor de la propiedad bedAndBreakfast.
     * 
     * @return
     *     possible object is
     *     {@link PriceByType }
     *     
     */
    public PriceByType getBedAndBreakfast() {
        return bedAndBreakfast;
    }

    /**
     * Define el valor de la propiedad bedAndBreakfast.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceByType }
     *     
     */
    public void setBedAndBreakfast(PriceByType value) {
        this.bedAndBreakfast = value;
    }

    /**
     * Obtiene el valor de la propiedad halfBoard.
     * 
     * @return
     *     possible object is
     *     {@link PriceByType }
     *     
     */
    public PriceByType getHalfBoard() {
        return halfBoard;
    }

    /**
     * Define el valor de la propiedad halfBoard.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceByType }
     *     
     */
    public void setHalfBoard(PriceByType value) {
        this.halfBoard = value;
    }

    /**
     * Obtiene el valor de la propiedad fullBoard.
     * 
     * @return
     *     possible object is
     *     {@link PriceByType }
     *     
     */
    public PriceByType getFullBoard() {
        return fullBoard;
    }

    /**
     * Define el valor de la propiedad fullBoard.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceByType }
     *     
     */
    public void setFullBoard(PriceByType value) {
        this.fullBoard = value;
    }

    /**
     * Obtiene el valor de la propiedad allIncluded.
     * 
     * @return
     *     possible object is
     *     {@link PriceByType }
     *     
     */
    public PriceByType getAllIncluded() {
        return allIncluded;
    }

    /**
     * Define el valor de la propiedad allIncluded.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceByType }
     *     
     */
    public void setAllIncluded(PriceByType value) {
        this.allIncluded = value;
    }

    /**
     * Obtiene el valor de la propiedad discounts.
     * 
     * @return
     *     possible object is
     *     {@link Discounts }
     *     
     */
    public Discounts getDiscounts() {
        return discounts;
    }

    /**
     * Define el valor de la propiedad discounts.
     * 
     * @param value
     *     allowed object is
     *     {@link Discounts }
     *     
     */
    public void setDiscounts(Discounts value) {
        this.discounts = value;
    }

    /**
     * Obtiene el valor de la propiedad supplements.
     * 
     * @return
     *     possible object is
     *     {@link Supplements }
     *     
     */
    public Supplements getSupplements() {
        return supplements;
    }

    /**
     * Define el valor de la propiedad supplements.
     * 
     * @param value
     *     allowed object is
     *     {@link Supplements }
     *     
     */
    public void setSupplements(Supplements value) {
        this.supplements = value;
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
