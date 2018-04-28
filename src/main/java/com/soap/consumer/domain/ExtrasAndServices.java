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
 * <p>Clase Java para ExtrasAndServices complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ExtrasAndServices"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SpecialServices" type="{ws.avantio.com/crsConnectionServices}SpecialServices"/&gt;
 *         &lt;element name="CommonServices" type="{ws.avantio.com/crsConnectionServices}CommonServices"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtrasAndServices", propOrder = {
    "specialServices",
    "commonServices"
})
public class ExtrasAndServices {

    @XmlElement(name = "SpecialServices", required = true)
    protected SpecialServices specialServices;
    @XmlElement(name = "CommonServices", required = true)
    protected CommonServices commonServices;

    /**
     * Obtiene el valor de la propiedad specialServices.
     * 
     * @return
     *     possible object is
     *     {@link SpecialServices }
     *     
     */
    public SpecialServices getSpecialServices() {
        return specialServices;
    }

    /**
     * Define el valor de la propiedad specialServices.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialServices }
     *     
     */
    public void setSpecialServices(SpecialServices value) {
        this.specialServices = value;
    }

    /**
     * Obtiene el valor de la propiedad commonServices.
     * 
     * @return
     *     possible object is
     *     {@link CommonServices }
     *     
     */
    public CommonServices getCommonServices() {
        return commonServices;
    }

    /**
     * Define el valor de la propiedad commonServices.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonServices }
     *     
     */
    public void setCommonServices(CommonServices value) {
        this.commonServices = value;
    }

}
