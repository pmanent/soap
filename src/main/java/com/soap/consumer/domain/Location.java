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
 * <p>Clase Java para Location complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Location"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LocationDescription" type="{ws.avantio.com/crsConnectionServices}LocationDescription" minOccurs="0"/&gt;
 *         &lt;element name="LocationDistances" type="{ws.avantio.com/crsConnectionServices}LocationDistances" minOccurs="0"/&gt;
 *         &lt;element name="NearestPlaces" type="{ws.avantio.com/crsConnectionServices}NearestPlaces" minOccurs="0"/&gt;
 *         &lt;element name="LocationViews" type="{ws.avantio.com/crsConnectionServices}LocationViews" minOccurs="0"/&gt;
 *         &lt;element name="FirstBeachLine" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="FirstGolfLine" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LatitudeDirection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DegreesLatitude" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element name="MinutesLatitude" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element name="SecondsLatitude" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element name="LengthDirection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DegreesLength" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element name="MinutesLength" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element name="SecondsLength" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Location", propOrder = {
    "locationDescription",
    "locationDistances",
    "nearestPlaces",
    "locationViews",
    "firstBeachLine",
    "firstGolfLine",
    "latitudeDirection",
    "degreesLatitude",
    "minutesLatitude",
    "secondsLatitude",
    "lengthDirection",
    "degreesLength",
    "minutesLength",
    "secondsLength"
})
public class Location {

    @XmlElement(name = "LocationDescription")
    protected LocationDescription locationDescription;
    @XmlElement(name = "LocationDistances")
    protected LocationDistances locationDistances;
    @XmlElement(name = "NearestPlaces")
    protected NearestPlaces nearestPlaces;
    @XmlElement(name = "LocationViews")
    protected LocationViews locationViews;
    @XmlElement(name = "FirstBeachLine")
    protected Boolean firstBeachLine;
    @XmlElement(name = "FirstGolfLine")
    protected Boolean firstGolfLine;
    @XmlElement(name = "LatitudeDirection")
    protected String latitudeDirection;
    @XmlElement(name = "DegreesLatitude")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger degreesLatitude;
    @XmlElement(name = "MinutesLatitude")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger minutesLatitude;
    @XmlElement(name = "SecondsLatitude")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger secondsLatitude;
    @XmlElement(name = "LengthDirection")
    protected String lengthDirection;
    @XmlElement(name = "DegreesLength")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger degreesLength;
    @XmlElement(name = "MinutesLength")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger minutesLength;
    @XmlElement(name = "SecondsLength")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger secondsLength;

    /**
     * Obtiene el valor de la propiedad locationDescription.
     * 
     * @return
     *     possible object is
     *     {@link LocationDescription }
     *     
     */
    public LocationDescription getLocationDescription() {
        return locationDescription;
    }

    /**
     * Define el valor de la propiedad locationDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationDescription }
     *     
     */
    public void setLocationDescription(LocationDescription value) {
        this.locationDescription = value;
    }

    /**
     * Obtiene el valor de la propiedad locationDistances.
     * 
     * @return
     *     possible object is
     *     {@link LocationDistances }
     *     
     */
    public LocationDistances getLocationDistances() {
        return locationDistances;
    }

    /**
     * Define el valor de la propiedad locationDistances.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationDistances }
     *     
     */
    public void setLocationDistances(LocationDistances value) {
        this.locationDistances = value;
    }

    /**
     * Obtiene el valor de la propiedad nearestPlaces.
     * 
     * @return
     *     possible object is
     *     {@link NearestPlaces }
     *     
     */
    public NearestPlaces getNearestPlaces() {
        return nearestPlaces;
    }

    /**
     * Define el valor de la propiedad nearestPlaces.
     * 
     * @param value
     *     allowed object is
     *     {@link NearestPlaces }
     *     
     */
    public void setNearestPlaces(NearestPlaces value) {
        this.nearestPlaces = value;
    }

    /**
     * Obtiene el valor de la propiedad locationViews.
     * 
     * @return
     *     possible object is
     *     {@link LocationViews }
     *     
     */
    public LocationViews getLocationViews() {
        return locationViews;
    }

    /**
     * Define el valor de la propiedad locationViews.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationViews }
     *     
     */
    public void setLocationViews(LocationViews value) {
        this.locationViews = value;
    }

    /**
     * Obtiene el valor de la propiedad firstBeachLine.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFirstBeachLine() {
        return firstBeachLine;
    }

    /**
     * Define el valor de la propiedad firstBeachLine.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFirstBeachLine(Boolean value) {
        this.firstBeachLine = value;
    }

    /**
     * Obtiene el valor de la propiedad firstGolfLine.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFirstGolfLine() {
        return firstGolfLine;
    }

    /**
     * Define el valor de la propiedad firstGolfLine.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFirstGolfLine(Boolean value) {
        this.firstGolfLine = value;
    }

    /**
     * Obtiene el valor de la propiedad latitudeDirection.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLatitudeDirection() {
        return latitudeDirection;
    }

    /**
     * Define el valor de la propiedad latitudeDirection.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLatitudeDirection(String value) {
        this.latitudeDirection = value;
    }

    /**
     * Obtiene el valor de la propiedad degreesLatitude.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDegreesLatitude() {
        return degreesLatitude;
    }

    /**
     * Define el valor de la propiedad degreesLatitude.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDegreesLatitude(BigInteger value) {
        this.degreesLatitude = value;
    }

    /**
     * Obtiene el valor de la propiedad minutesLatitude.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinutesLatitude() {
        return minutesLatitude;
    }

    /**
     * Define el valor de la propiedad minutesLatitude.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinutesLatitude(BigInteger value) {
        this.minutesLatitude = value;
    }

    /**
     * Obtiene el valor de la propiedad secondsLatitude.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSecondsLatitude() {
        return secondsLatitude;
    }

    /**
     * Define el valor de la propiedad secondsLatitude.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSecondsLatitude(BigInteger value) {
        this.secondsLatitude = value;
    }

    /**
     * Obtiene el valor de la propiedad lengthDirection.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLengthDirection() {
        return lengthDirection;
    }

    /**
     * Define el valor de la propiedad lengthDirection.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLengthDirection(String value) {
        this.lengthDirection = value;
    }

    /**
     * Obtiene el valor de la propiedad degreesLength.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDegreesLength() {
        return degreesLength;
    }

    /**
     * Define el valor de la propiedad degreesLength.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDegreesLength(BigInteger value) {
        this.degreesLength = value;
    }

    /**
     * Obtiene el valor de la propiedad minutesLength.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinutesLength() {
        return minutesLength;
    }

    /**
     * Define el valor de la propiedad minutesLength.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinutesLength(BigInteger value) {
        this.minutesLength = value;
    }

    /**
     * Obtiene el valor de la propiedad secondsLength.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSecondsLength() {
        return secondsLength;
    }

    /**
     * Define el valor de la propiedad secondsLength.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSecondsLength(BigInteger value) {
        this.secondsLength = value;
    }

}
