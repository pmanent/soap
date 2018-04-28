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
 * <p>Clase Java para GetAllAccommodationListRS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GetAllAccommodationListRS"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AllAccommodationList" type="{ws.avantio.com/crsConnectionServices}AllAccommodationList"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetAllAccommodationListRS", propOrder = {
    "allAccommodationList"
})
public class GetAllAccommodationListRS {

    @XmlElement(name = "AllAccommodationList", required = true)
    protected AllAccommodationList allAccommodationList;

    /**
     * Obtiene el valor de la propiedad allAccommodationList.
     * 
     * @return
     *     possible object is
     *     {@link AllAccommodationList }
     *     
     */
    public AllAccommodationList getAllAccommodationList() {
        return allAccommodationList;
    }

    /**
     * Define el valor de la propiedad allAccommodationList.
     * 
     * @param value
     *     allowed object is
     *     {@link AllAccommodationList }
     *     
     */
    public void setAllAccommodationList(AllAccommodationList value) {
        this.allAccommodationList = value;
    }

}
