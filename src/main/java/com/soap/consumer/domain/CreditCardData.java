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
 * <p>Clase Java para CreditCardData complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CreditCardData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CardType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CardNumber" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
 *         &lt;element name="ExpiryDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Cardholder" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CCVCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditCardData", propOrder = {
    "cardType",
    "cardNumber",
    "expiryDate",
    "cardholder",
    "ccvCode"
})
public class CreditCardData {

    @XmlElement(name = "CardType", required = true)
    protected String cardType;
    @XmlElement(name = "CardNumber", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger cardNumber;
    @XmlElement(name = "ExpiryDate", required = true)
    protected String expiryDate;
    @XmlElement(name = "Cardholder", required = true)
    protected String cardholder;
    @XmlElement(name = "CCVCode", required = true)
    protected String ccvCode;

    /**
     * Obtiene el valor de la propiedad cardType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardType() {
        return cardType;
    }

    /**
     * Define el valor de la propiedad cardType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardType(String value) {
        this.cardType = value;
    }

    /**
     * Obtiene el valor de la propiedad cardNumber.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCardNumber() {
        return cardNumber;
    }

    /**
     * Define el valor de la propiedad cardNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCardNumber(BigInteger value) {
        this.cardNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad expiryDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpiryDate() {
        return expiryDate;
    }

    /**
     * Define el valor de la propiedad expiryDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpiryDate(String value) {
        this.expiryDate = value;
    }

    /**
     * Obtiene el valor de la propiedad cardholder.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardholder() {
        return cardholder;
    }

    /**
     * Define el valor de la propiedad cardholder.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardholder(String value) {
        this.cardholder = value;
    }

    /**
     * Obtiene el valor de la propiedad ccvCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCVCode() {
        return ccvCode;
    }

    /**
     * Define el valor de la propiedad ccvCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCVCode(String value) {
        this.ccvCode = value;
    }

}
