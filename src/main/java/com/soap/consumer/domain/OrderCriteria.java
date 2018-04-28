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
 * <p>Clase Java para OrderCriteria complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="OrderCriteria"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FieldCriteria" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DirectionOrder" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderCriteria", propOrder = {
    "fieldCriteria",
    "directionOrder"
})
public class OrderCriteria {

    @XmlElement(name = "FieldCriteria", required = true)
    protected String fieldCriteria;
    @XmlElement(name = "DirectionOrder", required = true)
    protected String directionOrder;

    /**
     * Obtiene el valor de la propiedad fieldCriteria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldCriteria() {
        return fieldCriteria;
    }

    /**
     * Define el valor de la propiedad fieldCriteria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldCriteria(String value) {
        this.fieldCriteria = value;
    }

    /**
     * Obtiene el valor de la propiedad directionOrder.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectionOrder() {
        return directionOrder;
    }

    /**
     * Define el valor de la propiedad directionOrder.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectionOrder(String value) {
        this.directionOrder = value;
    }

}
