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
 * <p>Clase Java para PaymentDetail complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PaymentDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PaymentNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PaymentTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="PaymentDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PaymentMethods" type="{ws.avantio.com/crsConnectionServices}PaymentMethods" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentDetail", propOrder = {
    "paymentNumber",
    "paymentTime",
    "amount",
    "paymentDate",
    "paymentMethods"
})
public class PaymentDetail {

    @XmlElement(name = "PaymentNumber", required = true)
    protected String paymentNumber;
    @XmlElement(name = "PaymentTime", required = true)
    protected String paymentTime;
    @XmlElement(name = "Amount")
    protected float amount;
    @XmlElement(name = "PaymentDate", required = true)
    protected String paymentDate;
    @XmlElement(name = "PaymentMethods")
    protected PaymentMethods paymentMethods;

    /**
     * Obtiene el valor de la propiedad paymentNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentNumber() {
        return paymentNumber;
    }

    /**
     * Define el valor de la propiedad paymentNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentNumber(String value) {
        this.paymentNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad paymentTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentTime() {
        return paymentTime;
    }

    /**
     * Define el valor de la propiedad paymentTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentTime(String value) {
        this.paymentTime = value;
    }

    /**
     * Obtiene el valor de la propiedad amount.
     * 
     */
    public float getAmount() {
        return amount;
    }

    /**
     * Define el valor de la propiedad amount.
     * 
     */
    public void setAmount(float value) {
        this.amount = value;
    }

    /**
     * Obtiene el valor de la propiedad paymentDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentDate() {
        return paymentDate;
    }

    /**
     * Define el valor de la propiedad paymentDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentDate(String value) {
        this.paymentDate = value;
    }

    /**
     * Obtiene el valor de la propiedad paymentMethods.
     * 
     * @return
     *     possible object is
     *     {@link PaymentMethods }
     *     
     */
    public PaymentMethods getPaymentMethods() {
        return paymentMethods;
    }

    /**
     * Define el valor de la propiedad paymentMethods.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentMethods }
     *     
     */
    public void setPaymentMethods(PaymentMethods value) {
        this.paymentMethods = value;
    }

}
