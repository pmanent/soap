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
 * <p>Clase Java para OccupationalRule complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="OccupationalRule"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="MinimumNights" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/&gt;
 *         &lt;element name="MinimumNightsOnline" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/&gt;
 *         &lt;element name="MaximumNights" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="CheckInDays" type="{ws.avantio.com/crsConnectionServices}OccupationalRuleDays" minOccurs="0"/&gt;
 *         &lt;element name="CheckOutDays" type="{ws.avantio.com/crsConnectionServices}OccupationalRuleDays" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OccupationalRule", propOrder = {
    "startDate",
    "endDate",
    "minimumNights",
    "minimumNightsOnline",
    "maximumNights",
    "checkInDays",
    "checkOutDays"
})
public class OccupationalRule {

    @XmlElement(name = "StartDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    @XmlElement(name = "EndDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDate;
    @XmlElement(name = "MinimumNights", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger minimumNights;
    @XmlElement(name = "MinimumNightsOnline", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger minimumNightsOnline;
    @XmlElement(name = "MaximumNights")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger maximumNights;
    @XmlElement(name = "CheckInDays")
    protected OccupationalRuleDays checkInDays;
    @XmlElement(name = "CheckOutDays")
    protected OccupationalRuleDays checkOutDays;

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
     * Obtiene el valor de la propiedad minimumNights.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinimumNights() {
        return minimumNights;
    }

    /**
     * Define el valor de la propiedad minimumNights.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinimumNights(BigInteger value) {
        this.minimumNights = value;
    }

    /**
     * Obtiene el valor de la propiedad minimumNightsOnline.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinimumNightsOnline() {
        return minimumNightsOnline;
    }

    /**
     * Define el valor de la propiedad minimumNightsOnline.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinimumNightsOnline(BigInteger value) {
        this.minimumNightsOnline = value;
    }

    /**
     * Obtiene el valor de la propiedad maximumNights.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximumNights() {
        return maximumNights;
    }

    /**
     * Define el valor de la propiedad maximumNights.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximumNights(BigInteger value) {
        this.maximumNights = value;
    }

    /**
     * Obtiene el valor de la propiedad checkInDays.
     * 
     * @return
     *     possible object is
     *     {@link OccupationalRuleDays }
     *     
     */
    public OccupationalRuleDays getCheckInDays() {
        return checkInDays;
    }

    /**
     * Define el valor de la propiedad checkInDays.
     * 
     * @param value
     *     allowed object is
     *     {@link OccupationalRuleDays }
     *     
     */
    public void setCheckInDays(OccupationalRuleDays value) {
        this.checkInDays = value;
    }

    /**
     * Obtiene el valor de la propiedad checkOutDays.
     * 
     * @return
     *     possible object is
     *     {@link OccupationalRuleDays }
     *     
     */
    public OccupationalRuleDays getCheckOutDays() {
        return checkOutDays;
    }

    /**
     * Define el valor de la propiedad checkOutDays.
     * 
     * @param value
     *     allowed object is
     *     {@link OccupationalRuleDays }
     *     
     */
    public void setCheckOutDays(OccupationalRuleDays value) {
        this.checkOutDays = value;
    }

}
