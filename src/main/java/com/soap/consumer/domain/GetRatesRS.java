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
 * <p>Clase Java para GetRatesRS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GetRatesRS"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Accommodation" type="{ws.avantio.com/crsConnectionServices}Accommodation"/&gt;
 *         &lt;element name="RatePeriod" type="{ws.avantio.com/crsConnectionServices}RatePeriod" maxOccurs="unbounded"/&gt;
 *         &lt;element name="VAT" type="{ws.avantio.com/crsConnectionServices}VAT" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetRatesRS", propOrder = {
    "accommodation",
    "ratePeriod",
    "vat"
})
public class GetRatesRS {

    @XmlElement(name = "Accommodation", required = true)
    protected Accommodation accommodation;
    @XmlElement(name = "RatePeriod", required = true)
    protected List<RatePeriod> ratePeriod;
    @XmlElement(name = "VAT")
    protected VAT vat;

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
     * Gets the value of the ratePeriod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ratePeriod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRatePeriod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RatePeriod }
     * 
     * 
     */
    public List<RatePeriod> getRatePeriod() {
        if (ratePeriod == null) {
            ratePeriod = new ArrayList<RatePeriod>();
        }
        return this.ratePeriod;
    }

    /**
     * Obtiene el valor de la propiedad vat.
     * 
     * @return
     *     possible object is
     *     {@link VAT }
     *     
     */
    public VAT getVAT() {
        return vat;
    }

    /**
     * Define el valor de la propiedad vat.
     * 
     * @param value
     *     allowed object is
     *     {@link VAT }
     *     
     */
    public void setVAT(VAT value) {
        this.vat = value;
    }

}
