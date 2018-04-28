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
 * <p>Clase Java para ExternalAccommodation complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ExternalAccommodation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ExternalCredentials" type="{ws.avantio.com/crsConnectionServices}ExternalCredentials"/&gt;
 *         &lt;element name="AccommodationCode" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
 *         &lt;element name="UserCode" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
 *         &lt;element name="LoginGA" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ExternalID" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element name="ExternalRoomOnlyID" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element name="ExternalBedAndBreakfastID" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element name="ExternalHalfBoardID" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element name="ExternalFullBoardID" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element name="ExternalAllIncludedID" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element name="Changes" type="{ws.avantio.com/crsConnectionServices}Changes" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExternalAccommodation", propOrder = {
    "externalCredentials",
    "accommodationCode",
    "userCode",
    "loginGA",
    "externalID",
    "externalRoomOnlyID",
    "externalBedAndBreakfastID",
    "externalHalfBoardID",
    "externalFullBoardID",
    "externalAllIncludedID",
    "changes"
})
public class ExternalAccommodation {

    @XmlElement(name = "ExternalCredentials", required = true)
    protected ExternalCredentials externalCredentials;
    @XmlElement(name = "AccommodationCode", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger accommodationCode;
    @XmlElement(name = "UserCode", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger userCode;
    @XmlElement(name = "LoginGA", required = true)
    protected String loginGA;
    @XmlElement(name = "ExternalID")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger externalID;
    @XmlElement(name = "ExternalRoomOnlyID")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger externalRoomOnlyID;
    @XmlElement(name = "ExternalBedAndBreakfastID")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger externalBedAndBreakfastID;
    @XmlElement(name = "ExternalHalfBoardID")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger externalHalfBoardID;
    @XmlElement(name = "ExternalFullBoardID")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger externalFullBoardID;
    @XmlElement(name = "ExternalAllIncludedID")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger externalAllIncludedID;
    @XmlElement(name = "Changes")
    protected Changes changes;

    /**
     * Obtiene el valor de la propiedad externalCredentials.
     * 
     * @return
     *     possible object is
     *     {@link ExternalCredentials }
     *     
     */
    public ExternalCredentials getExternalCredentials() {
        return externalCredentials;
    }

    /**
     * Define el valor de la propiedad externalCredentials.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalCredentials }
     *     
     */
    public void setExternalCredentials(ExternalCredentials value) {
        this.externalCredentials = value;
    }

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
     * Obtiene el valor de la propiedad externalID.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getExternalID() {
        return externalID;
    }

    /**
     * Define el valor de la propiedad externalID.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setExternalID(BigInteger value) {
        this.externalID = value;
    }

    /**
     * Obtiene el valor de la propiedad externalRoomOnlyID.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getExternalRoomOnlyID() {
        return externalRoomOnlyID;
    }

    /**
     * Define el valor de la propiedad externalRoomOnlyID.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setExternalRoomOnlyID(BigInteger value) {
        this.externalRoomOnlyID = value;
    }

    /**
     * Obtiene el valor de la propiedad externalBedAndBreakfastID.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getExternalBedAndBreakfastID() {
        return externalBedAndBreakfastID;
    }

    /**
     * Define el valor de la propiedad externalBedAndBreakfastID.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setExternalBedAndBreakfastID(BigInteger value) {
        this.externalBedAndBreakfastID = value;
    }

    /**
     * Obtiene el valor de la propiedad externalHalfBoardID.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getExternalHalfBoardID() {
        return externalHalfBoardID;
    }

    /**
     * Define el valor de la propiedad externalHalfBoardID.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setExternalHalfBoardID(BigInteger value) {
        this.externalHalfBoardID = value;
    }

    /**
     * Obtiene el valor de la propiedad externalFullBoardID.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getExternalFullBoardID() {
        return externalFullBoardID;
    }

    /**
     * Define el valor de la propiedad externalFullBoardID.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setExternalFullBoardID(BigInteger value) {
        this.externalFullBoardID = value;
    }

    /**
     * Obtiene el valor de la propiedad externalAllIncludedID.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getExternalAllIncludedID() {
        return externalAllIncludedID;
    }

    /**
     * Define el valor de la propiedad externalAllIncludedID.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setExternalAllIncludedID(BigInteger value) {
        this.externalAllIncludedID = value;
    }

    /**
     * Obtiene el valor de la propiedad changes.
     * 
     * @return
     *     possible object is
     *     {@link Changes }
     *     
     */
    public Changes getChanges() {
        return changes;
    }

    /**
     * Define el valor de la propiedad changes.
     * 
     * @param value
     *     allowed object is
     *     {@link Changes }
     *     
     */
    public void setChanges(Changes value) {
        this.changes = value;
    }

}
