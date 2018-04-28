//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.04.15 a las 06:28:31 PM CEST 
//


package com.soap.consumer.domain;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AccommodationAvail complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AccommodationAvail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AccommodationCode" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
 *         &lt;element name="LoginGA" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="UserCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OccupationalRuleId" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="Availabilities" type="{ws.avantio.com/crsConnectionServices}Availabilities" maxOccurs="unbounded"/&gt;
 *         &lt;element name="MinDaysNotice" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccommodationAvail", propOrder = {
    "accommodationCode",
    "loginGA",
    "userCode",
    "name",
    "occupationalRuleId",
    "availabilities",
    "minDaysNotice"
})
public class AccommodationAvail {

    @XmlElement(name = "AccommodationCode", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger accommodationCode;
    @XmlElement(name = "LoginGA", required = true)
    protected String loginGA;
    @XmlElement(name = "UserCode")
    protected int userCode;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "OccupationalRuleId")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger occupationalRuleId;
    @XmlElement(name = "Availabilities", required = true)
    protected List<Availabilities> availabilities;
    @XmlElement(name = "MinDaysNotice")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger minDaysNotice;

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
     */
    public int getUserCode() {
        return userCode;
    }

    /**
     * Define el valor de la propiedad userCode.
     * 
     */
    public void setUserCode(int value) {
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
     * Gets the value of the availabilities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the availabilities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAvailabilities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Availabilities }
     * 
     * 
     */
    public List<Availabilities> getAvailabilities() {
        if (availabilities == null) {
            availabilities = new ArrayList<Availabilities>();
        }
        return this.availabilities;
    }

    /**
     * Obtiene el valor de la propiedad minDaysNotice.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinDaysNotice() {
        return minDaysNotice;
    }

    /**
     * Define el valor de la propiedad minDaysNotice.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinDaysNotice(BigInteger value) {
        this.minDaysNotice = value;
    }

}
