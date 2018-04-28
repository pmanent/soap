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
 * <p>Clase Java para GetBookingRS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GetBookingRS"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BookingData" type="{ws.avantio.com/crsConnectionServices}BookingDataResponse"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetBookingRS", propOrder = {
    "bookingData"
})
public class GetBookingRS {

    @XmlElement(name = "BookingData", required = true)
    protected BookingDataResponse bookingData;

    /**
     * Obtiene el valor de la propiedad bookingData.
     * 
     * @return
     *     possible object is
     *     {@link BookingDataResponse }
     *     
     */
    public BookingDataResponse getBookingData() {
        return bookingData;
    }

    /**
     * Define el valor de la propiedad bookingData.
     * 
     * @param value
     *     allowed object is
     *     {@link BookingDataResponse }
     *     
     */
    public void setBookingData(BookingDataResponse value) {
        this.bookingData = value;
    }

}
