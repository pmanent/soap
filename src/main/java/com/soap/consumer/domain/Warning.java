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
 * <p>Clase Java para Warning complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Warning"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WarningId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="WarningMessage" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Warning", propOrder = {
    "warningId",
    "warningMessage"
})
public class Warning {

    @XmlElement(name = "WarningId", required = true)
    protected String warningId;
    @XmlElement(name = "WarningMessage", required = true)
    protected String warningMessage;

    /**
     * Obtiene el valor de la propiedad warningId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarningId() {
        return warningId;
    }

    /**
     * Define el valor de la propiedad warningId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarningId(String value) {
        this.warningId = value;
    }

    /**
     * Obtiene el valor de la propiedad warningMessage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarningMessage() {
        return warningMessage;
    }

    /**
     * Define el valor de la propiedad warningMessage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarningMessage(String value) {
        this.warningMessage = value;
    }

}
