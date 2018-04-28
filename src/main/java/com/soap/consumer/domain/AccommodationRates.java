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
 * <p>Clase Java para AccommodationRates complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AccommodationRates"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AccommodationCode" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
 *         &lt;element name="LoginGA" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="UserCode" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OccupationalRuleId" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="Capacity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="Rates" type="{ws.avantio.com/crsConnectionServices}RatesList"/&gt;
 *         &lt;element name="VAT" type="{ws.avantio.com/crsConnectionServices}VAT" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccommodationRates", propOrder = {
    "accommodationCode",
    "loginGA",
    "userCode",
    "name",
    "occupationalRuleId",
    "capacity",
    "rates",
    "vat"
})
public class AccommodationRates {

    @XmlElement(name = "AccommodationCode", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger accommodationCode;
    @XmlElement(name = "LoginGA", required = true)
    protected String loginGA;
    @XmlElement(name = "UserCode", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger userCode;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "OccupationalRuleId")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger occupationalRuleId;
    @XmlElement(name = "Capacity")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger capacity;
    @XmlElement(name = "Rates", required = true)
    protected RatesList rates;
    @XmlElement(name = "VAT")
    protected VAT vat;

    /**
     * Obtiene el valor de la propiedad accommodationCode.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAccommodationCode() {
        return accommodationCode;
    }

    /**
     * Define el valor de la propiedad accommodationCode.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAccommodationCode(BigInteger value) {
        this.accommodationCode = value;
    }

    /**
     * Obtiene el valor de la propiedad loginGA.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoginGA() {
        return loginGA;
    }

    /**
     * Define el valor de la propiedad loginGA.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoginGA(String value) {
        this.loginGA = value;
    }

    /**
     * Obtiene el valor de la propiedad userCode.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUserCode() {
        return userCode;
    }

    /**
     * Define el valor de la propiedad userCode.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUserCode(BigInteger value) {
        this.userCode = value;
    }

    /**
     * Obtiene el valor de la propiedad name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Define el valor de la propiedad name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtiene el valor de la propiedad occupationalRuleId.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOccupationalRuleId() {
        return occupationalRuleId;
    }

    /**
     * Define el valor de la propiedad occupationalRuleId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOccupationalRuleId(BigInteger value) {
        this.occupationalRuleId = value;
    }

    /**
     * Obtiene el valor de la propiedad capacity.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCapacity() {
        return capacity;
    }

    /**
     * Define el valor de la propiedad capacity.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCapacity(BigInteger value) {
        this.capacity = value;
    }

    /**
     * Obtiene el valor de la propiedad rates.
     * 
     * @return
     *     possible object is
     *     {@link RatesList }
     *     
     */
    public RatesList getRates() {
        return rates;
    }

    /**
     * Define el valor de la propiedad rates.
     * 
     * @param value
     *     allowed object is
     *     {@link RatesList }
     *     
     */
    public void setRates(RatesList value) {
        this.rates = value;
    }

    /**
     * Obtiene el valor de la propiedad vat.
     * 
     * @return
     *     possible object is
     *     {@link VAT }
     *     
     */
    public VAT getVAT() {
        return vat;
    }

    /**
     * Define el valor de la propiedad vat.
     * 
     * @param value
     *     allowed object is
     *     {@link VAT }
     *     
     */
    public void setVAT(VAT value) {
        this.vat = value;
    }

}
