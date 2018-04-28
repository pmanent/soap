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
 * <p>Clase Java para GetAvailabilitiesRS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GetAvailabilitiesRS"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Pagination" type="{ws.avantio.com/crsConnectionServices}Pager" minOccurs="0"/&gt;
 *         &lt;element name="AccommodationList" type="{ws.avantio.com/crsConnectionServices}AccommodationAvailList"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetAvailabilitiesRS", propOrder = {
    "pagination",
    "accommodationList"
})
public class GetAvailabilitiesRS {

    @XmlElement(name = "Pagination")
    protected Pager pagination;
    @XmlElement(name = "AccommodationList", required = true)
    protected AccommodationAvailList accommodationList;

    /**
     * Obtiene el valor de la propiedad pagination.
     * 
     * @return
     *     possible object is
     *     {@link Pager }
     *     
     */
    public Pager getPagination() {
        return pagination;
    }

    /**
     * Define el valor de la propiedad pagination.
     * 
     * @param value
     *     allowed object is
     *     {@link Pager }
     *     
     */
    public void setPagination(Pager value) {
        this.pagination = value;
    }

    /**
     * Obtiene el valor de la propiedad accommodationList.
     * 
     * @return
     *     possible object is
     *     {@link AccommodationAvailList }
     *     
     */
    public AccommodationAvailList getAccommodationList() {
        return accommodationList;
    }

    /**
     * Define el valor de la propiedad accommodationList.
     * 
     * @param value
     *     allowed object is
     *     {@link AccommodationAvailList }
     *     
     */
    public void setAccommodationList(AccommodationAvailList value) {
        this.accommodationList = value;
    }

}
