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
 * <p>Clase Java para FeaturedAccommodation complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FeaturedAccommodation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AccommodationCode" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
 *         &lt;element name="AccommodationName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="UserCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LoginGA" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="UserKind" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MasterKind" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Image" type="{ws.avantio.com/crsConnectionServices}Image"/&gt;
 *         &lt;element name="Stars" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/&gt;
 *         &lt;element name="Purpose" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Price" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Capacity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
 *         &lt;element name="Rooms" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
 *         &lt;element name="Resort" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Locality" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="District" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Region" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Area" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PetsAllowed" type="{ws.avantio.com/crsConnectionServices}ComplexFeature"/&gt;
 *         &lt;element name="Swimmingpool" type="{ws.avantio.com/crsConnectionServices}ComplexFeature"/&gt;
 *         &lt;element name="Parking" type="{ws.avantio.com/crsConnectionServices}ComplexFeature"/&gt;
 *         &lt;element name="AirConditioned" type="{ws.avantio.com/crsConnectionServices}ComplexFeature"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeaturedAccommodation", propOrder = {
    "accommodationCode",
    "accommodationName",
    "userCode",
    "loginGA",
    "userKind",
    "masterKind",
    "image",
    "stars",
    "purpose",
    "price",
    "currency",
    "capacity",
    "rooms",
    "resort",
    "country",
    "city",
    "locality",
    "district",
    "region",
    "area",
    "title",
    "petsAllowed",
    "swimmingpool",
    "parking",
    "airConditioned"
})
public class FeaturedAccommodation {

    @XmlElement(name = "AccommodationCode", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger accommodationCode;
    @XmlElement(name = "AccommodationName", required = true)
    protected String accommodationName;
    @XmlElement(name = "UserCode", required = true)
    protected String userCode;
    @XmlElement(name = "LoginGA", required = true)
    protected String loginGA;
    @XmlElement(name = "UserKind", required = true)
    protected String userKind;
    @XmlElement(name = "MasterKind", required = true)
    protected String masterKind;
    @XmlElement(name = "Image", required = true)
    protected Image image;
    @XmlElement(name = "Stars", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger stars;
    @XmlElement(name = "Purpose", required = true)
    protected String purpose;
    @XmlElement(name = "Price")
    protected float price;
    @XmlElement(name = "Currency", required = true)
    protected String currency;
    @XmlElement(name = "Capacity", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger capacity;
    @XmlElement(name = "Rooms", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger rooms;
    @XmlElement(name = "Resort", required = true)
    protected String resort;
    @XmlElement(name = "Country", required = true)
    protected String country;
    @XmlElement(name = "City", required = true)
    protected String city;
    @XmlElement(name = "Locality", required = true)
    protected String locality;
    @XmlElement(name = "District", required = true)
    protected String district;
    @XmlElement(name = "Region", required = true)
    protected String region;
    @XmlElement(name = "Area", required = true)
    protected String area;
    @XmlElement(name = "Title", required = true)
    protected String title;
    @XmlElement(name = "PetsAllowed", required = true)
    protected ComplexFeature petsAllowed;
    @XmlElement(name = "Swimmingpool", required = true)
    protected ComplexFeature swimmingpool;
    @XmlElement(name = "Parking", required = true)
    protected ComplexFeature parking;
    @XmlElement(name = "AirConditioned", required = true)
    protected ComplexFeature airConditioned;

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
     * Obtiene el valor de la propiedad accommodationName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccommodationName() {
        return accommodationName;
    }

    /**
     * Define el valor de la propiedad accommodationName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccommodationName(String value) {
        this.accommodationName = value;
    }

    /**
     * Obtiene el valor de la propiedad userCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserCode() {
        return userCode;
    }

    /**
     * Define el valor de la propiedad userCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserCode(String value) {
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
     * Obtiene el valor de la propiedad userKind.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserKind() {
        return userKind;
    }

    /**
     * Define el valor de la propiedad userKind.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserKind(String value) {
        this.userKind = value;
    }

    /**
     * Obtiene el valor de la propiedad masterKind.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMasterKind() {
        return masterKind;
    }

    /**
     * Define el valor de la propiedad masterKind.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMasterKind(String value) {
        this.masterKind = value;
    }

    /**
     * Obtiene el valor de la propiedad image.
     * 
     * @return
     *     possible object is
     *     {@link Image }
     *     
     */
    public Image getImage() {
        return image;
    }

    /**
     * Define el valor de la propiedad image.
     * 
     * @param value
     *     allowed object is
     *     {@link Image }
     *     
     */
    public void setImage(Image value) {
        this.image = value;
    }

    /**
     * Obtiene el valor de la propiedad stars.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStars() {
        return stars;
    }

    /**
     * Define el valor de la propiedad stars.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStars(BigInteger value) {
        this.stars = value;
    }

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
     * Obtiene el valor de la propiedad price.
     * 
     */
    public float getPrice() {
        return price;
    }

    /**
     * Define el valor de la propiedad price.
     * 
     */
    public void setPrice(float value) {
        this.price = value;
    }

    /**
     * Obtiene el valor de la propiedad currency.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Define el valor de la propiedad currency.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
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
     * Obtiene el valor de la propiedad rooms.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRooms() {
        return rooms;
    }

    /**
     * Define el valor de la propiedad rooms.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRooms(BigInteger value) {
        this.rooms = value;
    }

    /**
     * Obtiene el valor de la propiedad resort.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResort() {
        return resort;
    }

    /**
     * Define el valor de la propiedad resort.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResort(String value) {
        this.resort = value;
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
     * Obtiene el valor de la propiedad district.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistrict() {
        return district;
    }

    /**
     * Define el valor de la propiedad district.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistrict(String value) {
        this.district = value;
    }

    /**
     * Obtiene el valor de la propiedad region.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegion() {
        return region;
    }

    /**
     * Define el valor de la propiedad region.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegion(String value) {
        this.region = value;
    }

    /**
     * Obtiene el valor de la propiedad area.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArea() {
        return area;
    }

    /**
     * Define el valor de la propiedad area.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArea(String value) {
        this.area = value;
    }

    /**
     * Obtiene el valor de la propiedad title.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Define el valor de la propiedad title.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Obtiene el valor de la propiedad petsAllowed.
     * 
     * @return
     *     possible object is
     *     {@link ComplexFeature }
     *     
     */
    public ComplexFeature getPetsAllowed() {
        return petsAllowed;
    }

    /**
     * Define el valor de la propiedad petsAllowed.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplexFeature }
     *     
     */
    public void setPetsAllowed(ComplexFeature value) {
        this.petsAllowed = value;
    }

    /**
     * Obtiene el valor de la propiedad swimmingpool.
     * 
     * @return
     *     possible object is
     *     {@link ComplexFeature }
     *     
     */
    public ComplexFeature getSwimmingpool() {
        return swimmingpool;
    }

    /**
     * Define el valor de la propiedad swimmingpool.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplexFeature }
     *     
     */
    public void setSwimmingpool(ComplexFeature value) {
        this.swimmingpool = value;
    }

    /**
     * Obtiene el valor de la propiedad parking.
     * 
     * @return
     *     possible object is
     *     {@link ComplexFeature }
     *     
     */
    public ComplexFeature getParking() {
        return parking;
    }

    /**
     * Define el valor de la propiedad parking.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplexFeature }
     *     
     */
    public void setParking(ComplexFeature value) {
        this.parking = value;
    }

    /**
     * Obtiene el valor de la propiedad airConditioned.
     * 
     * @return
     *     possible object is
     *     {@link ComplexFeature }
     *     
     */
    public ComplexFeature getAirConditioned() {
        return airConditioned;
    }

    /**
     * Define el valor de la propiedad airConditioned.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplexFeature }
     *     
     */
    public void setAirConditioned(ComplexFeature value) {
        this.airConditioned = value;
    }

}
