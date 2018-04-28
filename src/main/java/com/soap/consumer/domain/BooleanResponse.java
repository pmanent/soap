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
 * <p>Clase Java para BooleanResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BooleanResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Success" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element name="ErrorList" type="{ws.avantio.com/crsConnectionServices}ErrorList"/&gt;
 *         &lt;element name="WarningList" type="{ws.avantio.com/crsConnectionServices}WarningList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BooleanResponse", propOrder = {
    "success",
    "id",
    "errorList",
    "warningList"
})
public class BooleanResponse {

    @XmlElement(name = "Success")
    protected boolean success;
    @XmlElement(name = "Id")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger id;
    @XmlElement(name = "ErrorList", required = true)
    protected ErrorList errorList;
    @XmlElement(name = "WarningList")
    protected WarningList warningList;

    /**
     * Obtiene el valor de la propiedad success.
     * 
     */
    public boolean isSuccess() {
        return success;
    }

    /**
     * Define el valor de la propiedad success.
     * 
     */
    public void setSuccess(boolean value) {
        this.success = value;
    }

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setId(BigInteger value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad errorList.
     * 
     * @return
     *     possible object is
     *     {@link ErrorList }
     *     
     */
    public ErrorList getErrorList() {
        return errorList;
    }

    /**
     * Define el valor de la propiedad errorList.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorList }
     *     
     */
    public void setErrorList(ErrorList value) {
        this.errorList = value;
    }

    /**
     * Obtiene el valor de la propiedad warningList.
     * 
     * @return
     *     possible object is
     *     {@link WarningList }
     *     
     */
    public WarningList getWarningList() {
        return warningList;
    }

    /**
     * Define el valor de la propiedad warningList.
     * 
     * @param value
     *     allowed object is
     *     {@link WarningList }
     *     
     */
    public void setWarningList(WarningList value) {
        this.warningList = value;
    }

}
