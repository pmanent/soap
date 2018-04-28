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
 * <p>Clase Java para LocationDistances complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="LocationDistances"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BeachDistance" type="{ws.avantio.com/crsConnectionServices}DistanceTo" minOccurs="0"/&gt;
 *         &lt;element name="RockBeachDistance" type="{ws.avantio.com/crsConnectionServices}DistanceTo" minOccurs="0"/&gt;
 *         &lt;element name="GolfDistance" type="{ws.avantio.com/crsConnectionServices}DistanceTo" minOccurs="0"/&gt;
 *         &lt;element name="CityDistance" type="{ws.avantio.com/crsConnectionServices}DistanceTo" minOccurs="0"/&gt;
 *         &lt;element name="SuperMarketDistance" type="{ws.avantio.com/crsConnectionServices}DistanceTo" minOccurs="0"/&gt;
 *         &lt;element name="AirportDistance" type="{ws.avantio.com/crsConnectionServices}DistanceTo" minOccurs="0"/&gt;
 *         &lt;element name="SkiDistance" type="{ws.avantio.com/crsConnectionServices}DistanceTo" minOccurs="0"/&gt;
 *         &lt;element name="TrainStationDistance" type="{ws.avantio.com/crsConnectionServices}DistanceTo" minOccurs="0"/&gt;
 *         &lt;element name="StopBusDistance" type="{ws.avantio.com/crsConnectionServices}DistanceTo" minOccurs="0"/&gt;
 *         &lt;element name="ThemParkDistance" type="{ws.avantio.com/crsConnectionServices}DistanceTo" minOccurs="0"/&gt;
 *         &lt;element name="WaterParkDistance" type="{ws.avantio.com/crsConnectionServices}DistanceTo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationDistances", propOrder = {
    "beachDistance",
    "rockBeachDistance",
    "golfDistance",
    "cityDistance",
    "superMarketDistance",
    "airportDistance",
    "skiDistance",
    "trainStationDistance",
    "stopBusDistance",
    "themParkDistance",
    "waterParkDistance"
})
public class LocationDistances {

    @XmlElement(name = "BeachDistance")
    protected DistanceTo beachDistance;
    @XmlElement(name = "RockBeachDistance")
    protected DistanceTo rockBeachDistance;
    @XmlElement(name = "GolfDistance")
    protected DistanceTo golfDistance;
    @XmlElement(name = "CityDistance")
    protected DistanceTo cityDistance;
    @XmlElement(name = "SuperMarketDistance")
    protected DistanceTo superMarketDistance;
    @XmlElement(name = "AirportDistance")
    protected DistanceTo airportDistance;
    @XmlElement(name = "SkiDistance")
    protected DistanceTo skiDistance;
    @XmlElement(name = "TrainStationDistance")
    protected DistanceTo trainStationDistance;
    @XmlElement(name = "StopBusDistance")
    protected DistanceTo stopBusDistance;
    @XmlElement(name = "ThemParkDistance")
    protected DistanceTo themParkDistance;
    @XmlElement(name = "WaterParkDistance")
    protected DistanceTo waterParkDistance;

    /**
     * Obtiene el valor de la propiedad beachDistance.
     * 
     * @return
     *     possible object is
     *     {@link DistanceTo }
     *     
     */
    public DistanceTo getBeachDistance() {
        return beachDistance;
    }

    /**
     * Define el valor de la propiedad beachDistance.
     * 
     * @param value
     *     allowed object is
     *     {@link DistanceTo }
     *     
     */
    public void setBeachDistance(DistanceTo value) {
        this.beachDistance = value;
    }

    /**
     * Obtiene el valor de la propiedad rockBeachDistance.
     * 
     * @return
     *     possible object is
     *     {@link DistanceTo }
     *     
     */
    public DistanceTo getRockBeachDistance() {
        return rockBeachDistance;
    }

    /**
     * Define el valor de la propiedad rockBeachDistance.
     * 
     * @param value
     *     allowed object is
     *     {@link DistanceTo }
     *     
     */
    public void setRockBeachDistance(DistanceTo value) {
        this.rockBeachDistance = value;
    }

    /**
     * Obtiene el valor de la propiedad golfDistance.
     * 
     * @return
     *     possible object is
     *     {@link DistanceTo }
     *     
     */
    public DistanceTo getGolfDistance() {
        return golfDistance;
    }

    /**
     * Define el valor de la propiedad golfDistance.
     * 
     * @param value
     *     allowed object is
     *     {@link DistanceTo }
     *     
     */
    public void setGolfDistance(DistanceTo value) {
        this.golfDistance = value;
    }

    /**
     * Obtiene el valor de la propiedad cityDistance.
     * 
     * @return
     *     possible object is
     *     {@link DistanceTo }
     *     
     */
    public DistanceTo getCityDistance() {
        return cityDistance;
    }

    /**
     * Define el valor de la propiedad cityDistance.
     * 
     * @param value
     *     allowed object is
     *     {@link DistanceTo }
     *     
     */
    public void setCityDistance(DistanceTo value) {
        this.cityDistance = value;
    }

    /**
     * Obtiene el valor de la propiedad superMarketDistance.
     * 
     * @return
     *     possible object is
     *     {@link DistanceTo }
     *     
     */
    public DistanceTo getSuperMarketDistance() {
        return superMarketDistance;
    }

    /**
     * Define el valor de la propiedad superMarketDistance.
     * 
     * @param value
     *     allowed object is
     *     {@link DistanceTo }
     *     
     */
    public void setSuperMarketDistance(DistanceTo value) {
        this.superMarketDistance = value;
    }

    /**
     * Obtiene el valor de la propiedad airportDistance.
     * 
     * @return
     *     possible object is
     *     {@link DistanceTo }
     *     
     */
    public DistanceTo getAirportDistance() {
        return airportDistance;
    }

    /**
     * Define el valor de la propiedad airportDistance.
     * 
     * @param value
     *     allowed object is
     *     {@link DistanceTo }
     *     
     */
    public void setAirportDistance(DistanceTo value) {
        this.airportDistance = value;
    }

    /**
     * Obtiene el valor de la propiedad skiDistance.
     * 
     * @return
     *     possible object is
     *     {@link DistanceTo }
     *     
     */
    public DistanceTo getSkiDistance() {
        return skiDistance;
    }

    /**
     * Define el valor de la propiedad skiDistance.
     * 
     * @param value
     *     allowed object is
     *     {@link DistanceTo }
     *     
     */
    public void setSkiDistance(DistanceTo value) {
        this.skiDistance = value;
    }

    /**
     * Obtiene el valor de la propiedad trainStationDistance.
     * 
     * @return
     *     possible object is
     *     {@link DistanceTo }
     *     
     */
    public DistanceTo getTrainStationDistance() {
        return trainStationDistance;
    }

    /**
     * Define el valor de la propiedad trainStationDistance.
     * 
     * @param value
     *     allowed object is
     *     {@link DistanceTo }
     *     
     */
    public void setTrainStationDistance(DistanceTo value) {
        this.trainStationDistance = value;
    }

    /**
     * Obtiene el valor de la propiedad stopBusDistance.
     * 
     * @return
     *     possible object is
     *     {@link DistanceTo }
     *     
     */
    public DistanceTo getStopBusDistance() {
        return stopBusDistance;
    }

    /**
     * Define el valor de la propiedad stopBusDistance.
     * 
     * @param value
     *     allowed object is
     *     {@link DistanceTo }
     *     
     */
    public void setStopBusDistance(DistanceTo value) {
        this.stopBusDistance = value;
    }

    /**
     * Obtiene el valor de la propiedad themParkDistance.
     * 
     * @return
     *     possible object is
     *     {@link DistanceTo }
     *     
     */
    public DistanceTo getThemParkDistance() {
        return themParkDistance;
    }

    /**
     * Define el valor de la propiedad themParkDistance.
     * 
     * @param value
     *     allowed object is
     *     {@link DistanceTo }
     *     
     */
    public void setThemParkDistance(DistanceTo value) {
        this.themParkDistance = value;
    }

    /**
     * Obtiene el valor de la propiedad waterParkDistance.
     * 
     * @return
     *     possible object is
     *     {@link DistanceTo }
     *     
     */
    public DistanceTo getWaterParkDistance() {
        return waterParkDistance;
    }

    /**
     * Define el valor de la propiedad waterParkDistance.
     * 
     * @param value
     *     allowed object is
     *     {@link DistanceTo }
     *     
     */
    public void setWaterParkDistance(DistanceTo value) {
        this.waterParkDistance = value;
    }

}
