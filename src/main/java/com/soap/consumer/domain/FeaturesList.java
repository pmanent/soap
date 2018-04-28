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
 * <p>Clase Java para FeaturesList complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FeaturesList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HotelName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HotelStars" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="Bedrooms" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/&gt;
 *         &lt;element name="AreaHousing" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/&gt;
 *         &lt;element name="Toilets" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/&gt;
 *         &lt;element name="BathroomWithBathtub" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/&gt;
 *         &lt;element name="BathroomWithShower" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/&gt;
 *         &lt;element name="Swimmingpool" type="{ws.avantio.com/crsConnectionServices}ComplexFeature"/&gt;
 *         &lt;element name="Parking" type="{ws.avantio.com/crsConnectionServices}ComplexFeature"/&gt;
 *         &lt;element name="AirConditioned" type="{ws.avantio.com/crsConnectionServices}ComplexFeature"/&gt;
 *         &lt;element name="Terrace" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Garden" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="TVSatellite" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeaturesList", propOrder = {
    "hotelName",
    "hotelStars",
    "bedrooms",
    "areaHousing",
    "toilets",
    "bathroomWithBathtub",
    "bathroomWithShower",
    "swimmingpool",
    "parking",
    "airConditioned",
    "terrace",
    "garden",
    "tvSatellite"
})
public class FeaturesList {

    @XmlElement(name = "HotelName")
    protected String hotelName;
    @XmlElement(name = "HotelStars")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger hotelStars;
    @XmlElement(name = "Bedrooms", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger bedrooms;
    @XmlElement(name = "AreaHousing", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger areaHousing;
    @XmlElement(name = "Toilets", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger toilets;
    @XmlElement(name = "BathroomWithBathtub", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger bathroomWithBathtub;
    @XmlElement(name = "BathroomWithShower", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger bathroomWithShower;
    @XmlElement(name = "Swimmingpool", required = true)
    protected ComplexFeature swimmingpool;
    @XmlElement(name = "Parking", required = true)
    protected ComplexFeature parking;
    @XmlElement(name = "AirConditioned", required = true)
    protected ComplexFeature airConditioned;
    @XmlElement(name = "Terrace")
    protected boolean terrace;
    @XmlElement(name = "Garden")
    protected boolean garden;
    @XmlElement(name = "TVSatellite")
    protected boolean tvSatellite;

    /**
     * Obtiene el valor de la propiedad hotelName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelName() {
        return hotelName;
    }

    /**
     * Define el valor de la propiedad hotelName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelName(String value) {
        this.hotelName = value;
    }

    /**
     * Obtiene el valor de la propiedad hotelStars.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getHotelStars() {
        return hotelStars;
    }

    /**
     * Define el valor de la propiedad hotelStars.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setHotelStars(BigInteger value) {
        this.hotelStars = value;
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
     * Obtiene el valor de la propiedad areaHousing.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAreaHousing() {
        return areaHousing;
    }

    /**
     * Define el valor de la propiedad areaHousing.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAreaHousing(BigInteger value) {
        this.areaHousing = value;
    }

    /**
     * Obtiene el valor de la propiedad toilets.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getToilets() {
        return toilets;
    }

    /**
     * Define el valor de la propiedad toilets.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setToilets(BigInteger value) {
        this.toilets = value;
    }

    /**
     * Obtiene el valor de la propiedad bathroomWithBathtub.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBathroomWithBathtub() {
        return bathroomWithBathtub;
    }

    /**
     * Define el valor de la propiedad bathroomWithBathtub.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBathroomWithBathtub(BigInteger value) {
        this.bathroomWithBathtub = value;
    }

    /**
     * Obtiene el valor de la propiedad bathroomWithShower.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBathroomWithShower() {
        return bathroomWithShower;
    }

    /**
     * Define el valor de la propiedad bathroomWithShower.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBathroomWithShower(BigInteger value) {
        this.bathroomWithShower = value;
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

    /**
     * Obtiene el valor de la propiedad terrace.
     * 
     */
    public boolean isTerrace() {
        return terrace;
    }

    /**
     * Define el valor de la propiedad terrace.
     * 
     */
    public void setTerrace(boolean value) {
        this.terrace = value;
    }

    /**
     * Obtiene el valor de la propiedad garden.
     * 
     */
    public boolean isGarden() {
        return garden;
    }

    /**
     * Define el valor de la propiedad garden.
     * 
     */
    public void setGarden(boolean value) {
        this.garden = value;
    }

    /**
     * Obtiene el valor de la propiedad tvSatellite.
     * 
     */
    public boolean isTVSatellite() {
        return tvSatellite;
    }

    /**
     * Define el valor de la propiedad tvSatellite.
     * 
     */
    public void setTVSatellite(boolean value) {
        this.tvSatellite = value;
    }

}
