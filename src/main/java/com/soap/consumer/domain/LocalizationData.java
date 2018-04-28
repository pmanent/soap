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
 * <p>Clase Java para LocalizationData complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="LocalizationData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Country" type="{ws.avantio.com/crsConnectionServices}SimpleCountry"/&gt;
 *         &lt;element name="Region" type="{ws.avantio.com/crsConnectionServices}SimpleRegion"/&gt;
 *         &lt;element name="AreaDist" type="{ws.avantio.com/crsConnectionServices}AreaDist"/&gt;
 *         &lt;element name="City" type="{ws.avantio.com/crsConnectionServices}SimpleCity"/&gt;
 *         &lt;element name="Locality" type="{ws.avantio.com/crsConnectionServices}SimpleLocality"/&gt;
 *         &lt;element name="District" type="{ws.avantio.com/crsConnectionServices}District"/&gt;
 *         &lt;element name="Resort" type="{ws.avantio.com/crsConnectionServices}Resort"/&gt;
 *         &lt;element name="KindOfWay" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Way" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Block" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Door" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Floor" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/&gt;
 *         &lt;element name="GoogleMaps" type="{ws.avantio.com/crsConnectionServices}GoogleMaps" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocalizationData", propOrder = {
    "country",
    "region",
    "areaDist",
    "city",
    "locality",
    "district",
    "resort",
    "kindOfWay",
    "way",
    "number",
    "block",
    "door",
    "floor",
    "googleMaps"
})
public class LocalizationData {

    @XmlElement(name = "Country", required = true)
    protected SimpleCountry country;
    @XmlElement(name = "Region", required = true)
    protected SimpleRegion region;
    @XmlElement(name = "AreaDist", required = true)
    protected AreaDist areaDist;
    @XmlElement(name = "City", required = true)
    protected SimpleCity city;
    @XmlElement(name = "Locality", required = true)
    protected SimpleLocality locality;
    @XmlElement(name = "District", required = true)
    protected District district;
    @XmlElement(name = "Resort", required = true)
    protected Resort resort;
    @XmlElement(name = "KindOfWay", required = true)
    protected String kindOfWay;
    @XmlElement(name = "Way", required = true)
    protected String way;
    @XmlElement(name = "Number", required = true)
    protected String number;
    @XmlElement(name = "Block", required = true)
    protected String block;
    @XmlElement(name = "Door", required = true)
    protected String door;
    @XmlElement(name = "Floor", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger floor;
    @XmlElement(name = "GoogleMaps")
    protected GoogleMaps googleMaps;

    /**
     * Obtiene el valor de la propiedad country.
     * 
     * @return
     *     possible object is
     *     {@link SimpleCountry }
     *     
     */
    public SimpleCountry getCountry() {
        return country;
    }

    /**
     * Define el valor de la propiedad country.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleCountry }
     *     
     */
    public void setCountry(SimpleCountry value) {
        this.country = value;
    }

    /**
     * Obtiene el valor de la propiedad region.
     * 
     * @return
     *     possible object is
     *     {@link SimpleRegion }
     *     
     */
    public SimpleRegion getRegion() {
        return region;
    }

    /**
     * Define el valor de la propiedad region.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleRegion }
     *     
     */
    public void setRegion(SimpleRegion value) {
        this.region = value;
    }

    /**
     * Obtiene el valor de la propiedad areaDist.
     * 
     * @return
     *     possible object is
     *     {@link AreaDist }
     *     
     */
    public AreaDist getAreaDist() {
        return areaDist;
    }

    /**
     * Define el valor de la propiedad areaDist.
     * 
     * @param value
     *     allowed object is
     *     {@link AreaDist }
     *     
     */
    public void setAreaDist(AreaDist value) {
        this.areaDist = value;
    }

    /**
     * Obtiene el valor de la propiedad city.
     * 
     * @return
     *     possible object is
     *     {@link SimpleCity }
     *     
     */
    public SimpleCity getCity() {
        return city;
    }

    /**
     * Define el valor de la propiedad city.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleCity }
     *     
     */
    public void setCity(SimpleCity value) {
        this.city = value;
    }

    /**
     * Obtiene el valor de la propiedad locality.
     * 
     * @return
     *     possible object is
     *     {@link SimpleLocality }
     *     
     */
    public SimpleLocality getLocality() {
        return locality;
    }

    /**
     * Define el valor de la propiedad locality.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleLocality }
     *     
     */
    public void setLocality(SimpleLocality value) {
        this.locality = value;
    }

    /**
     * Obtiene el valor de la propiedad district.
     * 
     * @return
     *     possible object is
     *     {@link District }
     *     
     */
    public District getDistrict() {
        return district;
    }

    /**
     * Define el valor de la propiedad district.
     * 
     * @param value
     *     allowed object is
     *     {@link District }
     *     
     */
    public void setDistrict(District value) {
        this.district = value;
    }

    /**
     * Obtiene el valor de la propiedad resort.
     * 
     * @return
     *     possible object is
     *     {@link Resort }
     *     
     */
    public Resort getResort() {
        return resort;
    }

    /**
     * Define el valor de la propiedad resort.
     * 
     * @param value
     *     allowed object is
     *     {@link Resort }
     *     
     */
    public void setResort(Resort value) {
        this.resort = value;
    }

    /**
     * Obtiene el valor de la propiedad kindOfWay.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKindOfWay() {
        return kindOfWay;
    }

    /**
     * Define el valor de la propiedad kindOfWay.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKindOfWay(String value) {
        this.kindOfWay = value;
    }

    /**
     * Obtiene el valor de la propiedad way.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWay() {
        return way;
    }

    /**
     * Define el valor de la propiedad way.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWay(String value) {
        this.way = value;
    }

    /**
     * Obtiene el valor de la propiedad number.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Define el valor de la propiedad number.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Obtiene el valor de la propiedad block.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlock() {
        return block;
    }

    /**
     * Define el valor de la propiedad block.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlock(String value) {
        this.block = value;
    }

    /**
     * Obtiene el valor de la propiedad door.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDoor() {
        return door;
    }

    /**
     * Define el valor de la propiedad door.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDoor(String value) {
        this.door = value;
    }

    /**
     * Obtiene el valor de la propiedad floor.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFloor() {
        return floor;
    }

    /**
     * Define el valor de la propiedad floor.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFloor(BigInteger value) {
        this.floor = value;
    }

    /**
     * Obtiene el valor de la propiedad googleMaps.
     * 
     * @return
     *     possible object is
     *     {@link GoogleMaps }
     *     
     */
    public GoogleMaps getGoogleMaps() {
        return googleMaps;
    }

    /**
     * Define el valor de la propiedad googleMaps.
     * 
     * @param value
     *     allowed object is
     *     {@link GoogleMaps }
     *     
     */
    public void setGoogleMaps(GoogleMaps value) {
        this.googleMaps = value;
    }

}
