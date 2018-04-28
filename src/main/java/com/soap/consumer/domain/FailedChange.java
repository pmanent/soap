//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.04.15 a las 06:28:31 PM CEST 
//


package com.soap.consumer.domain;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para FailedChange complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FailedChange"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ChangeCode" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
 *         &lt;element name="ChangeError" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FailedChange", propOrder = {
    "changeCode",
    "changeError"
})
public class FailedChange {

    @XmlElement(name = "ChangeCode", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger changeCode;
    @XmlElement(name = "ChangeError", required = true)
    protected String changeError;

    /**
     * Obtiene el valor de la propiedad changeCode.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getChangeCode() {
        return changeCode;
    }

    /**
     * Define el valor de la propiedad changeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setChangeCode(BigInteger value) {
        this.changeCode = value;
    }

    /**
     * Obtiene el valor de la propiedad changeError.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangeError() {
        return changeError;
    }

    /**
     * Define el valor de la propiedad changeError.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangeError(String value) {
        this.changeError = value;
    }

}
