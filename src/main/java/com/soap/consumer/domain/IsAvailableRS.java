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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para IsAvailableRS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="IsAvailableRS"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Available" type="{ws.avantio.com/crsConnectionServices}Available"/&gt;
 *         &lt;element name="OccupationalRule" type="{ws.avantio.com/crsConnectionServices}OccupationalRule" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IsAvailableRS", propOrder = {
    "available",
    "occupationalRule"
})
@XmlRootElement
public class IsAvailableRS {

    @XmlElement(name = "Available", required = true)
    protected Available available;
    @XmlElement(name = "OccupationalRule", required = true)
    protected List<OccupationalRule> occupationalRule;

    /**
     * Obtiene el valor de la propiedad available.
     * 
     * @return
     *     possible object is
     *     {@link Available }
     *     
     */
    public Available getAvailable() {
        return available;
    }

    /**
     * Define el valor de la propiedad available.
     * 
     * @param value
     *     allowed object is
     *     {@link Available }
     *     
     */
    public void setAvailable(Available value) {
        this.available = value;
    }

    /**
     * Gets the value of the occupationalRule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the occupationalRule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOccupationalRule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OccupationalRule }
     * 
     * 
     */
    public List<OccupationalRule> getOccupationalRule() {
        if (occupationalRule == null) {
            occupationalRule = new ArrayList<OccupationalRule>();
        }
        return this.occupationalRule;
    }

}
