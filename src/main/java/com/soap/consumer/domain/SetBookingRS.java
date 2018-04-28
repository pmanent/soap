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
 * <p>Clase Java para SetBookingRS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SetBookingRS"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Success" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Localizer" type="{ws.avantio.com/crsConnectionServices}Localizer"/&gt;
 *         &lt;element name="ErrorList" type="{ws.avantio.com/crsConnectionServices}ErrorList"/&gt;
 *         &lt;element name="CustomerCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WarningList" type="{ws.avantio.com/crsConnectionServices}WarningList" minOccurs="0"/&gt;
 *         &lt;element name="PaymentURI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetBookingRS", propOrder = {
    "success",
    "localizer",
    "errorList",
    "customerCode",
    "warningList",
    "paymentURI"
})
public class SetBookingRS {

    @XmlElement(name = "Success")
    protected boolean success;
    @XmlElement(name = "Localizer", required = true)
    protected Localizer localizer;
    @XmlElement(name = "ErrorList", required = true)
    protected ErrorList errorList;
    @XmlElement(name = "CustomerCode")
    protected String customerCode;
    @XmlElement(name = "WarningList")
    protected WarningList warningList;
    @XmlElement(name = "PaymentURI")
    protected String paymentURI;

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
     * Obtiene el valor de la propiedad localizer.
     * 
     * @return
     *     possible object is
     *     {@link Localizer }
     *     
     */
    public Localizer getLocalizer() {
        return localizer;
    }

    /**
     * Define el valor de la propiedad localizer.
     * 
     * @param value
     *     allowed object is
     *     {@link Localizer }
     *     
     */
    public void setLocalizer(Localizer value) {
        this.localizer = value;
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
     * Obtiene el valor de la propiedad customerCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerCode() {
        return customerCode;
    }

    /**
     * Define el valor de la propiedad customerCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerCode(String value) {
        this.customerCode = value;
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

    /**
     * Obtiene el valor de la propiedad paymentURI.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentURI() {
        return paymentURI;
    }

    /**
     * Define el valor de la propiedad paymentURI.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentURI(String value) {
        this.paymentURI = value;
    }

}
