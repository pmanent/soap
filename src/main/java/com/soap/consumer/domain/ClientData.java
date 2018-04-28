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
 * <p>Clase Java para ClientData complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ClientData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Surname" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DNI" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Address" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Locality" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PostCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ISOCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Telephone" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Telephone2" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="EMail" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Fax" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClientData", propOrder = {
    "name",
    "surname",
    "dni",
    "address",
    "locality",
    "postCode",
    "city",
    "country",
    "isoCountryCode",
    "telephone",
    "telephone2",
    "eMail",
    "fax",
    "language"
})
public class ClientData {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Surname", required = true)
    protected String surname;
    @XmlElement(name = "DNI", required = true)
    protected String dni;
    @XmlElement(name = "Address", required = true)
    protected String address;
    @XmlElement(name = "Locality", required = true)
    protected String locality;
    @XmlElement(name = "PostCode", required = true)
    protected String postCode;
    @XmlElement(name = "City", required = true)
    protected String city;
    @XmlElement(name = "Country", required = true)
    protected String country;
    @XmlElement(name = "ISOCountryCode")
    protected String isoCountryCode;
    @XmlElement(name = "Telephone", required = true)
    protected String telephone;
    @XmlElement(name = "Telephone2", required = true)
    protected String telephone2;
    @XmlElement(name = "EMail", required = true)
    protected String eMail;
    @XmlElement(name = "Fax", required = true)
    protected String fax;
    @XmlElement(name = "Language")
    protected String language;

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
     * Obtiene el valor de la propiedad surname.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Define el valor de la propiedad surname.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurname(String value) {
        this.surname = value;
    }

    /**
     * Obtiene el valor de la propiedad dni.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDNI() {
        return dni;
    }

    /**
     * Define el valor de la propiedad dni.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDNI(String value) {
        this.dni = value;
    }

    /**
     * Obtiene el valor de la propiedad address.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Define el valor de la propiedad address.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Obtiene el valor de la propiedad locality.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocality() {
        return locality;
    }

    /**
     * Define el valor de la propiedad locality.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocality(String value) {
        this.locality = value;
    }

    /**
     * Obtiene el valor de la propiedad postCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostCode() {
        return postCode;
    }

    /**
     * Define el valor de la propiedad postCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostCode(String value) {
        this.postCode = value;
    }

    /**
     * Obtiene el valor de la propiedad city.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Define el valor de la propiedad city.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Obtiene el valor de la propiedad country.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Define el valor de la propiedad country.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Obtiene el valor de la propiedad isoCountryCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISOCountryCode() {
        return isoCountryCode;
    }

    /**
     * Define el valor de la propiedad isoCountryCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISOCountryCode(String value) {
        this.isoCountryCode = value;
    }

    /**
     * Obtiene el valor de la propiedad telephone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * Define el valor de la propiedad telephone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelephone(String value) {
        this.telephone = value;
    }

    /**
     * Obtiene el valor de la propiedad telephone2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelephone2() {
        return telephone2;
    }

    /**
     * Define el valor de la propiedad telephone2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelephone2(String value) {
        this.telephone2 = value;
    }

    /**
     * Obtiene el valor de la propiedad eMail.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMail() {
        return eMail;
    }

    /**
     * Define el valor de la propiedad eMail.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMail(String value) {
        this.eMail = value;
    }

    /**
     * Obtiene el valor de la propiedad fax.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFax() {
        return fax;
    }

    /**
     * Define el valor de la propiedad fax.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFax(String value) {
        this.fax = value;
    }

    /**
     * Obtiene el valor de la propiedad language.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Define el valor de la propiedad language.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

}
