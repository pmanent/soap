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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para CriteriaAccommodationList complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CriteriaAccommodationList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Occupants" type="{ws.avantio.com/crsConnectionServices}Occupants" minOccurs="0"/&gt;
 *         &lt;element name="Purpose" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DateFrom" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="DateTo" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="RegionCode" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element name="AreaCode" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element name="CityCode" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element name="LocalityCode" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element name="KindCode" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element name="ResortCode" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element name="Bedrooms" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element name="AccommodationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SwimmingPool" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TV" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Satellite" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AirConditioned" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Heating" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Garage" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Microwaves" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HandicappedFacilities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PetsAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Parking" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="WashingMachine" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Dishwasher" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ProximityToSea" type="{ws.avantio.com/crsConnectionServices}Proximity" minOccurs="0"/&gt;
 *         &lt;element name="ProximityToSupermarket" type="{ws.avantio.com/crsConnectionServices}Proximity" minOccurs="0"/&gt;
 *         &lt;element name="ProximityToGolf" type="{ws.avantio.com/crsConnectionServices}Proximity" minOccurs="0"/&gt;
 *         &lt;element name="ProximityToCity" type="{ws.avantio.com/crsConnectionServices}Proximity" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CriteriaAccommodationList", propOrder = {
    "occupants",
    "purpose",
    "dateFrom",
    "dateTo",
    "regionCode",
    "areaCode",
    "cityCode",
    "localityCode",
    "kindCode",
    "resortCode",
    "bedrooms",
    "accommodationName",
    "swimmingPool",
    "tv",
    "satellite",
    "airConditioned",
    "heating",
    "garage",
    "microwaves",
    "handicappedFacilities",
    "petsAllowed",
    "parking",
    "washingMachine",
    "dishwasher",
    "proximityToSea",
    "proximityToSupermarket",
    "proximityToGolf",
    "proximityToCity"
})
public class CriteriaAccommodationList {

    @XmlElement(name = "Occupants")
    protected Occupants occupants;
    @XmlElement(name = "Purpose")
    protected String purpose;
    @XmlElement(name = "DateFrom")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateFrom;
    @XmlElement(name = "DateTo")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateTo;
    @XmlElement(name = "RegionCode")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger regionCode;
    @XmlElement(name = "AreaCode")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger areaCode;
    @XmlElement(name = "CityCode")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger cityCode;
    @XmlElement(name = "LocalityCode")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger localityCode;
    @XmlElement(name = "KindCode")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger kindCode;
    @XmlElement(name = "ResortCode")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger resortCode;
    @XmlElement(name = "Bedrooms")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger bedrooms;
    @XmlElement(name = "AccommodationName")
    protected String accommodationName;
    @XmlElement(name = "SwimmingPool")
    protected Boolean swimmingPool;
    @XmlElement(name = "TV")
    protected Boolean tv;
    @XmlElement(name = "Satellite")
    protected Boolean satellite;
    @XmlElement(name = "AirConditioned")
    protected Boolean airConditioned;
    @XmlElement(name = "Heating")
    protected Boolean heating;
    @XmlElement(name = "Garage")
    protected Boolean garage;
    @XmlElement(name = "Microwaves")
    protected Boolean microwaves;
    @XmlElement(name = "HandicappedFacilities")
    protected Boolean handicappedFacilities;
    @XmlElement(name = "PetsAllowed")
    protected Boolean petsAllowed;
    @XmlElement(name = "Parking")
    protected Boolean parking;
    @XmlElement(name = "WashingMachine")
    protected Boolean washingMachine;
    @XmlElement(name = "Dishwasher")
    protected Boolean dishwasher;
    @XmlElement(name = "ProximityToSea")
    protected Proximity proximityToSea;
    @XmlElement(name = "ProximityToSupermarket")
    protected Proximity proximityToSupermarket;
    @XmlElement(name = "ProximityToGolf")
    protected Proximity proximityToGolf;
    @XmlElement(name = "ProximityToCity")
    protected Proximity proximityToCity;

    /**
     * Obtiene el valor de la propiedad occupants.
     * 
     * @return
     *     possible object is
     *     {@link Occupants }
     *     
     */
    public Occupants getOccupants() {
        return occupants;
    }

    /**
     * Define el valor de la propiedad occupants.
     * 
     * @param value
     *     allowed object is
     *     {@link Occupants }
     *     
     */
    public void setOccupants(Occupants value) {
        this.occupants = value;
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
     * Obtiene el valor de la propiedad dateFrom.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateFrom() {
        return dateFrom;
    }

    /**
     * Define el valor de la propiedad dateFrom.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateFrom(XMLGregorianCalendar value) {
        this.dateFrom = value;
    }

    /**
     * Obtiene el valor de la propiedad dateTo.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateTo() {
        return dateTo;
    }

    /**
     * Define el valor de la propiedad dateTo.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateTo(XMLGregorianCalendar value) {
        this.dateTo = value;
    }

    /**
     * Obtiene el valor de la propiedad regionCode.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRegionCode() {
        return regionCode;
    }

    /**
     * Define el valor de la propiedad regionCode.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRegionCode(BigInteger value) {
        this.regionCode = value;
    }

    /**
     * Obtiene el valor de la propiedad areaCode.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAreaCode() {
        return areaCode;
    }

    /**
     * Define el valor de la propiedad areaCode.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAreaCode(BigInteger value) {
        this.areaCode = value;
    }

    /**
     * Obtiene el valor de la propiedad cityCode.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCityCode() {
        return cityCode;
    }

    /**
     * Define el valor de la propiedad cityCode.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCityCode(BigInteger value) {
        this.cityCode = value;
    }

    /**
     * Obtiene el valor de la propiedad localityCode.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLocalityCode() {
        return localityCode;
    }

    /**
     * Define el valor de la propiedad localityCode.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLocalityCode(BigInteger value) {
        this.localityCode = value;
    }

    /**
     * Obtiene el valor de la propiedad kindCode.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getKindCode() {
        return kindCode;
    }

    /**
     * Define el valor de la propiedad kindCode.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setKindCode(BigInteger value) {
        this.kindCode = value;
    }

    /**
     * Obtiene el valor de la propiedad resortCode.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getResortCode() {
        return resortCode;
    }

    /**
     * Define el valor de la propiedad resortCode.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setResortCode(BigInteger value) {
        this.resortCode = value;
    }

    /**
     * Obtiene el valor de la propiedad bedrooms.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBedrooms() {
        return bedrooms;
    }

    /**
     * Define el valor de la propiedad bedrooms.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBedrooms(BigInteger value) {
        this.bedrooms = value;
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
     * Obtiene el valor de la propiedad swimmingPool.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSwimmingPool() {
        return swimmingPool;
    }

    /**
     * Define el valor de la propiedad swimmingPool.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSwimmingPool(Boolean value) {
        this.swimmingPool = value;
    }

    /**
     * Obtiene el valor de la propiedad tv.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTV() {
        return tv;
    }

    /**
     * Define el valor de la propiedad tv.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTV(Boolean value) {
        this.tv = value;
    }

    /**
     * Obtiene el valor de la propiedad satellite.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSatellite() {
        return satellite;
    }

    /**
     * Define el valor de la propiedad satellite.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSatellite(Boolean value) {
        this.satellite = value;
    }

    /**
     * Obtiene el valor de la propiedad airConditioned.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAirConditioned() {
        return airConditioned;
    }

    /**
     * Define el valor de la propiedad airConditioned.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAirConditioned(Boolean value) {
        this.airConditioned = value;
    }

    /**
     * Obtiene el valor de la propiedad heating.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHeating() {
        return heating;
    }

    /**
     * Define el valor de la propiedad heating.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHeating(Boolean value) {
        this.heating = value;
    }

    /**
     * Obtiene el valor de la propiedad garage.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGarage() {
        return garage;
    }

    /**
     * Define el valor de la propiedad garage.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGarage(Boolean value) {
        this.garage = value;
    }

    /**
     * Obtiene el valor de la propiedad microwaves.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMicrowaves() {
        return microwaves;
    }

    /**
     * Define el valor de la propiedad microwaves.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMicrowaves(Boolean value) {
        this.microwaves = value;
    }

    /**
     * Obtiene el valor de la propiedad handicappedFacilities.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHandicappedFacilities() {
        return handicappedFacilities;
    }

    /**
     * Define el valor de la propiedad handicappedFacilities.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHandicappedFacilities(Boolean value) {
        this.handicappedFacilities = value;
    }

    /**
     * Obtiene el valor de la propiedad petsAllowed.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPetsAllowed() {
        return petsAllowed;
    }

    /**
     * Define el valor de la propiedad petsAllowed.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPetsAllowed(Boolean value) {
        this.petsAllowed = value;
    }

    /**
     * Obtiene el valor de la propiedad parking.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isParking() {
        return parking;
    }

    /**
     * Define el valor de la propiedad parking.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setParking(Boolean value) {
        this.parking = value;
    }

    /**
     * Obtiene el valor de la propiedad washingMachine.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWashingMachine() {
        return washingMachine;
    }

    /**
     * Define el valor de la propiedad washingMachine.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWashingMachine(Boolean value) {
        this.washingMachine = value;
    }

    /**
     * Obtiene el valor de la propiedad dishwasher.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDishwasher() {
        return dishwasher;
    }

    /**
     * Define el valor de la propiedad dishwasher.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDishwasher(Boolean value) {
        this.dishwasher = value;
    }

    /**
     * Obtiene el valor de la propiedad proximityToSea.
     * 
     * @return
     *     possible object is
     *     {@link Proximity }
     *     
     */
    public Proximity getProximityToSea() {
        return proximityToSea;
    }

    /**
     * Define el valor de la propiedad proximityToSea.
     * 
     * @param value
     *     allowed object is
     *     {@link Proximity }
     *     
     */
    public void setProximityToSea(Proximity value) {
        this.proximityToSea = value;
    }

    /**
     * Obtiene el valor de la propiedad proximityToSupermarket.
     * 
     * @return
     *     possible object is
     *     {@link Proximity }
     *     
     */
    public Proximity getProximityToSupermarket() {
        return proximityToSupermarket;
    }

    /**
     * Define el valor de la propiedad proximityToSupermarket.
     * 
     * @param value
     *     allowed object is
     *     {@link Proximity }
     *     
     */
    public void setProximityToSupermarket(Proximity value) {
        this.proximityToSupermarket = value;
    }

    /**
     * Obtiene el valor de la propiedad proximityToGolf.
     * 
     * @return
     *     possible object is
     *     {@link Proximity }
     *     
     */
    public Proximity getProximityToGolf() {
        return proximityToGolf;
    }

    /**
     * Define el valor de la propiedad proximityToGolf.
     * 
     * @param value
     *     allowed object is
     *     {@link Proximity }
     *     
     */
    public void setProximityToGolf(Proximity value) {
        this.proximityToGolf = value;
    }

    /**
     * Obtiene el valor de la propiedad proximityToCity.
     * 
     * @return
     *     possible object is
     *     {@link Proximity }
     *     
     */
    public Proximity getProximityToCity() {
        return proximityToCity;
    }

    /**
     * Define el valor de la propiedad proximityToCity.
     * 
     * @param value
     *     allowed object is
     *     {@link Proximity }
     *     
     */
    public void setProximityToCity(Proximity value) {
        this.proximityToCity = value;
    }

}
