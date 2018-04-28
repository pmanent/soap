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
 * <p>Clase Java para OnlineStateCriteria complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="OnlineStateCriteria"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DateFrom" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="DateTo" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="Occupants" type="{ws.avantio.com/crsConnectionServices}Occupants"/&gt;
 *         &lt;element name="AccommodationList" type="{ws.avantio.com/crsConnectionServices}AccommodationCodeList"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OnlineStateCriteria", propOrder = {
    "dateFrom",
    "dateTo",
    "occupants",
    "accommodationList"
})
public class OnlineStateCriteria {

    @XmlElement(name = "DateFrom", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateFrom;
    @XmlElement(name = "DateTo", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateTo;
    @XmlElement(name = "Occupants", required = true)
    protected Occupants occupants;
    @XmlElement(name = "AccommodationList", required = true)
    protected AccommodationCodeList accommodationList;

    /**
     * Obtiene el valor de la propiedad dateFrom.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateFrom() {
        return dateFrom;
    }

    /**
     * Define el valor de la propiedad dateFrom.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateFrom(XMLGregorianCalendar value) {
        this.dateFrom = value;
    }

    /**
     * Obtiene el valor de la propiedad dateTo.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateTo() {
        return dateTo;
    }

    /**
     * Define el valor de la propiedad dateTo.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateTo(XMLGregorianCalendar value) {
        this.dateTo = value;
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
     * Obtiene el valor de la propiedad accommodationList.
     * 
     * @return
     *     possible object is
     *     {@link AccommodationCodeList }
     *     
     */
    public AccommodationCodeList getAccommodationList() {
        return accommodationList;
    }

    /**
     * Define el valor de la propiedad accommodationList.
     * 
     * @param value
     *     allowed object is
     *     {@link AccommodationCodeList }
     *     
     */
    public void setAccommodationList(AccommodationCodeList value) {
        this.accommodationList = value;
    }

}
