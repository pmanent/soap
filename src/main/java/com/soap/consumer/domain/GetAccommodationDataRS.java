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
 * <p>Clase Java para GetAccommodationDataRS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GetAccommodationDataRS"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AccommodationData" type="{ws.avantio.com/crsConnectionServices}AccommodationData"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetAccommodationDataRS", propOrder = {
    "accommodationData"
})
public class GetAccommodationDataRS {

    @XmlElement(name = "AccommodationData", required = true)
    protected AccommodationData accommodationData;

    /**
     * Obtiene el valor de la propiedad accommodationData.
     * 
     * @return
     *     possible object is
     *     {@link AccommodationData }
     *     
     */
    public AccommodationData getAccommodationData() {
        return accommodationData;
    }

    /**
     * Define el valor de la propiedad accommodationData.
     * 
     * @param value
     *     allowed object is
     *     {@link AccommodationData }
     *     
     */
    public void setAccommodationData(AccommodationData value) {
        this.accommodationData = value;
    }

}
