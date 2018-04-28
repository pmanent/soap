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
 * <p>Clase Java para HotelFeatures complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="HotelFeatures"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Stars" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/&gt;
 *         &lt;element name="Restaurant" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Bar" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MeetingHall" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Laundry" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="InternetAccess" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Reception24" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="HeatedSwimmingPool" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Jacuzzi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Parking" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Garage" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Tennis" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Gym" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Sauna" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelFeatures", propOrder = {
    "stars",
    "restaurant",
    "bar",
    "meetingHall",
    "laundry",
    "internetAccess",
    "reception24",
    "heatedSwimmingPool",
    "jacuzzi",
    "parking",
    "garage",
    "tennis",
    "gym",
    "sauna"
})
public class HotelFeatures {

    @XmlElement(name = "Stars", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger stars;
    @XmlElement(name = "Restaurant", required = true)
    protected String restaurant;
    @XmlElement(name = "Bar", required = true)
    protected String bar;
    @XmlElement(name = "MeetingHall", required = true)
    protected String meetingHall;
    @XmlElement(name = "Laundry", required = true)
    protected String laundry;
    @XmlElement(name = "InternetAccess", required = true)
    protected String internetAccess;
    @XmlElement(name = "Reception24", required = true)
    protected String reception24;
    @XmlElement(name = "HeatedSwimmingPool", required = true)
    protected String heatedSwimmingPool;
    @XmlElement(name = "Jacuzzi", required = true)
    protected String jacuzzi;
    @XmlElement(name = "Parking", required = true)
    protected String parking;
    @XmlElement(name = "Garage", required = true)
    protected String garage;
    @XmlElement(name = "Tennis", required = true)
    protected String tennis;
    @XmlElement(name = "Gym", required = true)
    protected String gym;
    @XmlElement(name = "Sauna", required = true)
    protected String sauna;

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
     * Obtiene el valor de la propiedad restaurant.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRestaurant() {
        return restaurant;
    }

    /**
     * Define el valor de la propiedad restaurant.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRestaurant(String value) {
        this.restaurant = value;
    }

    /**
     * Obtiene el valor de la propiedad bar.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBar() {
        return bar;
    }

    /**
     * Define el valor de la propiedad bar.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBar(String value) {
        this.bar = value;
    }

    /**
     * Obtiene el valor de la propiedad meetingHall.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeetingHall() {
        return meetingHall;
    }

    /**
     * Define el valor de la propiedad meetingHall.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeetingHall(String value) {
        this.meetingHall = value;
    }

    /**
     * Obtiene el valor de la propiedad laundry.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLaundry() {
        return laundry;
    }

    /**
     * Define el valor de la propiedad laundry.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLaundry(String value) {
        this.laundry = value;
    }

    /**
     * Obtiene el valor de la propiedad internetAccess.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternetAccess() {
        return internetAccess;
    }

    /**
     * Define el valor de la propiedad internetAccess.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternetAccess(String value) {
        this.internetAccess = value;
    }

    /**
     * Obtiene el valor de la propiedad reception24.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReception24() {
        return reception24;
    }

    /**
     * Define el valor de la propiedad reception24.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReception24(String value) {
        this.reception24 = value;
    }

    /**
     * Obtiene el valor de la propiedad heatedSwimmingPool.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeatedSwimmingPool() {
        return heatedSwimmingPool;
    }

    /**
     * Define el valor de la propiedad heatedSwimmingPool.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeatedSwimmingPool(String value) {
        this.heatedSwimmingPool = value;
    }

    /**
     * Obtiene el valor de la propiedad jacuzzi.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJacuzzi() {
        return jacuzzi;
    }

    /**
     * Define el valor de la propiedad jacuzzi.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJacuzzi(String value) {
        this.jacuzzi = value;
    }

    /**
     * Obtiene el valor de la propiedad parking.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParking() {
        return parking;
    }

    /**
     * Define el valor de la propiedad parking.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParking(String value) {
        this.parking = value;
    }

    /**
     * Obtiene el valor de la propiedad garage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGarage() {
        return garage;
    }

    /**
     * Define el valor de la propiedad garage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGarage(String value) {
        this.garage = value;
    }

    /**
     * Obtiene el valor de la propiedad tennis.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTennis() {
        return tennis;
    }

    /**
     * Define el valor de la propiedad tennis.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTennis(String value) {
        this.tennis = value;
    }

    /**
     * Obtiene el valor de la propiedad gym.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGym() {
        return gym;
    }

    /**
     * Define el valor de la propiedad gym.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGym(String value) {
        this.gym = value;
    }

    /**
     * Obtiene el valor de la propiedad sauna.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSauna() {
        return sauna;
    }

    /**
     * Define el valor de la propiedad sauna.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSauna(String value) {
        this.sauna = value;
    }

}
