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
 * <p>Clase Java para FeaturesHotel complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FeaturesHotel"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Garage" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Restaurant" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Reception24" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Tennis" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Sauna" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Gym" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="InternetAccess" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Swimmingpool" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="HeatedSwimmingpool" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeaturesHotel", propOrder = {
    "garage",
    "restaurant",
    "reception24",
    "tennis",
    "sauna",
    "gym",
    "internetAccess",
    "swimmingpool",
    "heatedSwimmingpool"
})
public class FeaturesHotel {

    @XmlElement(name = "Garage")
    protected boolean garage;
    @XmlElement(name = "Restaurant")
    protected boolean restaurant;
    @XmlElement(name = "Reception24")
    protected boolean reception24;
    @XmlElement(name = "Tennis")
    protected boolean tennis;
    @XmlElement(name = "Sauna")
    protected boolean sauna;
    @XmlElement(name = "Gym")
    protected boolean gym;
    @XmlElement(name = "InternetAccess")
    protected boolean internetAccess;
    @XmlElement(name = "Swimmingpool")
    protected boolean swimmingpool;
    @XmlElement(name = "HeatedSwimmingpool")
    protected boolean heatedSwimmingpool;

    /**
     * Obtiene el valor de la propiedad garage.
     * 
     */
    public boolean isGarage() {
        return garage;
    }

    /**
     * Define el valor de la propiedad garage.
     * 
     */
    public void setGarage(boolean value) {
        this.garage = value;
    }

    /**
     * Obtiene el valor de la propiedad restaurant.
     * 
     */
    public boolean isRestaurant() {
        return restaurant;
    }

    /**
     * Define el valor de la propiedad restaurant.
     * 
     */
    public void setRestaurant(boolean value) {
        this.restaurant = value;
    }

    /**
     * Obtiene el valor de la propiedad reception24.
     * 
     */
    public boolean isReception24() {
        return reception24;
    }

    /**
     * Define el valor de la propiedad reception24.
     * 
     */
    public void setReception24(boolean value) {
        this.reception24 = value;
    }

    /**
     * Obtiene el valor de la propiedad tennis.
     * 
     */
    public boolean isTennis() {
        return tennis;
    }

    /**
     * Define el valor de la propiedad tennis.
     * 
     */
    public void setTennis(boolean value) {
        this.tennis = value;
    }

    /**
     * Obtiene el valor de la propiedad sauna.
     * 
     */
    public boolean isSauna() {
        return sauna;
    }

    /**
     * Define el valor de la propiedad sauna.
     * 
     */
    public void setSauna(boolean value) {
        this.sauna = value;
    }

    /**
     * Obtiene el valor de la propiedad gym.
     * 
     */
    public boolean isGym() {
        return gym;
    }

    /**
     * Define el valor de la propiedad gym.
     * 
     */
    public void setGym(boolean value) {
        this.gym = value;
    }

    /**
     * Obtiene el valor de la propiedad internetAccess.
     * 
     */
    public boolean isInternetAccess() {
        return internetAccess;
    }

    /**
     * Define el valor de la propiedad internetAccess.
     * 
     */
    public void setInternetAccess(boolean value) {
        this.internetAccess = value;
    }

    /**
     * Obtiene el valor de la propiedad swimmingpool.
     * 
     */
    public boolean isSwimmingpool() {
        return swimmingpool;
    }

    /**
     * Define el valor de la propiedad swimmingpool.
     * 
     */
    public void setSwimmingpool(boolean value) {
        this.swimmingpool = value;
    }

    /**
     * Obtiene el valor de la propiedad heatedSwimmingpool.
     * 
     */
    public boolean isHeatedSwimmingpool() {
        return heatedSwimmingpool;
    }

    /**
     * Define el valor de la propiedad heatedSwimmingpool.
     * 
     */
    public void setHeatedSwimmingpool(boolean value) {
        this.heatedSwimmingpool = value;
    }

}
