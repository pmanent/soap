//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.04.15 a las 06:28:31 PM CEST 
//


package com.soap.consumer.domain;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GetAccommodationDescriptionsRS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GetAccommodationDescriptionsRS"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Accommodation" type="{ws.avantio.com/crsConnectionServices}Accommodation"/&gt;
 *         &lt;element name="Images" type="{ws.avantio.com/crsConnectionServices}Images"/&gt;
 *         &lt;element name="InternationalizedItem" type="{ws.avantio.com/crsConnectionServices}InternationalizedAccommodation" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetAccommodationDescriptionsRS", propOrder = {
    "accommodation",
    "images",
    "internationalizedItem"
})
public class GetAccommodationDescriptionsRS {

    @XmlElement(name = "Accommodation", required = true)
    protected Accommodation accommodation;
    @XmlElement(name = "Images", required = true)
    protected Images images;
    @XmlElement(name = "InternationalizedItem", required = true)
    protected List<InternationalizedAccommodation> internationalizedItem;

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
     * Obtiene el valor de la propiedad images.
     * 
     * @return
     *     possible object is
     *     {@link Images }
     *     
     */
    public Images getImages() {
        return images;
    }

    /**
     * Define el valor de la propiedad images.
     * 
     * @param value
     *     allowed object is
     *     {@link Images }
     *     
     */
    public void setImages(Images value) {
        this.images = value;
    }

    /**
     * Gets the value of the internationalizedItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the internationalizedItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInternationalizedItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InternationalizedAccommodation }
     * 
     * 
     */
    public List<InternationalizedAccommodation> getInternationalizedItem() {
        if (internationalizedItem == null) {
            internationalizedItem = new ArrayList<InternationalizedAccommodation>();
        }
        return this.internationalizedItem;
    }

}
