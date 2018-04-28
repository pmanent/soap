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
 * <p>Clase Java para MasterKind complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MasterKind"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MasterKindCode" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
 *         &lt;element name="MasterKindName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MasterKind", propOrder = {
    "masterKindCode",
    "masterKindName"
})
public class MasterKind {

    @XmlElement(name = "MasterKindCode", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger masterKindCode;
    @XmlElement(name = "MasterKindName", required = true)
    protected String masterKindName;

    /**
     * Obtiene el valor de la propiedad masterKindCode.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMasterKindCode() {
        return masterKindCode;
    }

    /**
     * Define el valor de la propiedad masterKindCode.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMasterKindCode(BigInteger value) {
        this.masterKindCode = value;
    }

    /**
     * Obtiene el valor de la propiedad masterKindName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMasterKindName() {
        return masterKindName;
    }

    /**
     * Define el valor de la propiedad masterKindName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMasterKindName(String value) {
        this.masterKindName = value;
    }

}
