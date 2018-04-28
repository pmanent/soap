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
 * <p>Clase Java para PriceModifier complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PriceModifier"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="NumberOfNights" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="MaxNumberOfNights" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="MinNumberOfNights" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="MaxDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DiscountSupplementType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="DaysAdvance" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
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
@XmlType(name = "PriceModifier", propOrder = {
    "startDate",
    "endDate",
    "numberOfNights",
    "maxNumberOfNights",
    "minNumberOfNights",
    "maxDate",
    "type",
    "discountSupplementType",
    "amount",
    "daysAdvance",
    "currency"
})
public class PriceModifier {

    @XmlElement(name = "StartDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    @XmlElement(name = "EndDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDate;
    @XmlElement(name = "NumberOfNights")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfNights;
    @XmlElement(name = "MaxNumberOfNights")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger maxNumberOfNights;
    @XmlElement(name = "MinNumberOfNights")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger minNumberOfNights;
    @XmlElement(name = "MaxDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar maxDate;
    @XmlElement(name = "Type", required = true)
    protected String type;
    @XmlElement(name = "DiscountSupplementType", required = true)
    protected String discountSupplementType;
    @XmlElement(name = "Amount")
    protected float amount;
    @XmlElement(name = "DaysAdvance")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger daysAdvance;
    @XmlElement(name = "Currency", required = true)
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
     * Obtiene el valor de la propiedad numberOfNights.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfNights() {
        return numberOfNights;
    }

    /**
     * Define el valor de la propiedad numberOfNights.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfNights(BigInteger value) {
        this.numberOfNights = value;
    }

    /**
     * Obtiene el valor de la propiedad maxNumberOfNights.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxNumberOfNights() {
        return maxNumberOfNights;
    }

    /**
     * Define el valor de la propiedad maxNumberOfNights.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxNumberOfNights(BigInteger value) {
        this.maxNumberOfNights = value;
    }

    /**
     * Obtiene el valor de la propiedad minNumberOfNights.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinNumberOfNights() {
        return minNumberOfNights;
    }

    /**
     * Define el valor de la propiedad minNumberOfNights.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinNumberOfNights(BigInteger value) {
        this.minNumberOfNights = value;
    }

    /**
     * Obtiene el valor de la propiedad maxDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMaxDate() {
        return maxDate;
    }

    /**
     * Define el valor de la propiedad maxDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMaxDate(XMLGregorianCalendar value) {
        this.maxDate = value;
    }

    /**
     * Obtiene el valor de la propiedad type.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Define el valor de la propiedad type.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Obtiene el valor de la propiedad discountSupplementType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountSupplementType() {
        return discountSupplementType;
    }

    /**
     * Define el valor de la propiedad discountSupplementType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountSupplementType(String value) {
        this.discountSupplementType = value;
    }

    /**
     * Obtiene el valor de la propiedad amount.
     * 
     */
    public float getAmount() {
        return amount;
    }

    /**
     * Define el valor de la propiedad amount.
     * 
     */
    public void setAmount(float value) {
        this.amount = value;
    }

    /**
     * Obtiene el valor de la propiedad daysAdvance.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDaysAdvance() {
        return daysAdvance;
    }

    /**
     * Define el valor de la propiedad daysAdvance.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDaysAdvance(BigInteger value) {
        this.daysAdvance = value;
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
