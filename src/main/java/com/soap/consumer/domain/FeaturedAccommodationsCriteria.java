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
 * <p>Clase Java para FeaturedAccommodationsCriteria complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FeaturedAccommodationsCriteria"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Purpose" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MasterKind" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element name="Area" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element name="Region" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element name="Locality" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element name="District" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element name="RestrictedToLanguage" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MaxFeaturedAccommodations" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeaturedAccommodationsCriteria", propOrder = {
    "purpose",
    "masterKind",
    "country",
    "area",
    "region",
    "city",
    "locality",
    "district",
    "restrictedToLanguage",
    "maxFeaturedAccommodations"
})
public class FeaturedAccommodationsCriteria {

    @XmlElement(name = "Purpose")
    protected String purpose;
    @XmlElement(name = "MasterKind")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger masterKind;
    @XmlElement(name = "Country")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger country;
    @XmlElement(name = "Area")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger area;
    @XmlElement(name = "Region")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger region;
    @XmlElement(name = "City")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger city;
    @XmlElement(name = "Locality")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger locality;
    @XmlElement(name = "District")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger district;
    @XmlElement(name = "RestrictedToLanguage")
    protected Boolean restrictedToLanguage;
    @XmlElement(name = "MaxFeaturedAccommodations")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger maxFeaturedAccommodations;

    /**
     * Obtiene el valor de la propiedad purpose.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurpose() {
        return purpose;
    }

    /**
     * Define el valor de la propiedad purpose.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurpose(String value) {
        this.purpose = value;
    }

    /**
     * Obtiene el valor de la propiedad masterKind.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMasterKind() {
        return masterKind;
    }

    /**
     * Define el valor de la propiedad masterKind.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMasterKind(BigInteger value) {
        this.masterKind = value;
    }

    /**
     * Obtiene el valor de la propiedad country.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCountry() {
        return country;
    }

    /**
     * Define el valor de la propiedad country.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCountry(BigInteger value) {
        this.country = value;
    }

    /**
     * Obtiene el valor de la propiedad area.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getArea() {
        return area;
    }

    /**
     * Define el valor de la propiedad area.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setArea(BigInteger value) {
        this.area = value;
    }

    /**
     * Obtiene el valor de la propiedad region.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRegion() {
        return region;
    }

    /**
     * Define el valor de la propiedad region.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRegion(BigInteger value) {
        this.region = value;
    }

    /**
     * Obtiene el valor de la propiedad city.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCity() {
        return city;
    }

    /**
     * Define el valor de la propiedad city.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCity(BigInteger value) {
        this.city = value;
    }

    /**
     * Obtiene el valor de la propiedad locality.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLocality() {
        return locality;
    }

    /**
     * Define el valor de la propiedad locality.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLocality(BigInteger value) {
        this.locality = value;
    }

    /**
     * Obtiene el valor de la propiedad district.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDistrict() {
        return district;
    }

    /**
     * Define el valor de la propiedad district.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDistrict(BigInteger value) {
        this.district = value;
    }

    /**
     * Obtiene el valor de la propiedad restrictedToLanguage.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRestrictedToLanguage() {
        return restrictedToLanguage;
    }

    /**
     * Define el valor de la propiedad restrictedToLanguage.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRestrictedToLanguage(Boolean value) {
        this.restrictedToLanguage = value;
    }

    /**
     * Obtiene el valor de la propiedad maxFeaturedAccommodations.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxFeaturedAccommodations() {
        return maxFeaturedAccommodations;
    }

    /**
     * Define el valor de la propiedad maxFeaturedAccommodations.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxFeaturedAccommodations(BigInteger value) {
        this.maxFeaturedAccommodations = value;
    }

}
