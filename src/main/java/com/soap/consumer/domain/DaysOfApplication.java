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
 * <p>Clase Java para DaysOfApplication complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DaysOfApplication"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Monday" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Tuesday" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Wednesday" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Thursday" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Friday" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Saturday" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Sunday" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DaysOfApplication", propOrder = {
    "monday",
    "tuesday",
    "wednesday",
    "thursday",
    "friday",
    "saturday",
    "sunday"
})
public class DaysOfApplication {

    @XmlElement(name = "Monday")
    protected boolean monday;
    @XmlElement(name = "Tuesday")
    protected boolean tuesday;
    @XmlElement(name = "Wednesday")
    protected boolean wednesday;
    @XmlElement(name = "Thursday")
    protected boolean thursday;
    @XmlElement(name = "Friday")
    protected boolean friday;
    @XmlElement(name = "Saturday")
    protected boolean saturday;
    @XmlElement(name = "Sunday")
    protected boolean sunday;

    /**
     * Obtiene el valor de la propiedad monday.
     * 
     */
    public boolean isMonday() {
        return monday;
    }

    /**
     * Define el valor de la propiedad monday.
     * 
     */
    public void setMonday(boolean value) {
        this.monday = value;
    }

    /**
     * Obtiene el valor de la propiedad tuesday.
     * 
     */
    public boolean isTuesday() {
        return tuesday;
    }

    /**
     * Define el valor de la propiedad tuesday.
     * 
     */
    public void setTuesday(boolean value) {
        this.tuesday = value;
    }

    /**
     * Obtiene el valor de la propiedad wednesday.
     * 
     */
    public boolean isWednesday() {
        return wednesday;
    }

    /**
     * Define el valor de la propiedad wednesday.
     * 
     */
    public void setWednesday(boolean value) {
        this.wednesday = value;
    }

    /**
     * Obtiene el valor de la propiedad thursday.
     * 
     */
    public boolean isThursday() {
        return thursday;
    }

    /**
     * Define el valor de la propiedad thursday.
     * 
     */
    public void setThursday(boolean value) {
        this.thursday = value;
    }

    /**
     * Obtiene el valor de la propiedad friday.
     * 
     */
    public boolean isFriday() {
        return friday;
    }

    /**
     * Define el valor de la propiedad friday.
     * 
     */
    public void setFriday(boolean value) {
        this.friday = value;
    }

    /**
     * Obtiene el valor de la propiedad saturday.
     * 
     */
    public boolean isSaturday() {
        return saturday;
    }

    /**
     * Define el valor de la propiedad saturday.
     * 
     */
    public void setSaturday(boolean value) {
        this.saturday = value;
    }

    /**
     * Obtiene el valor de la propiedad sunday.
     * 
     */
    public boolean isSunday() {
        return sunday;
    }

    /**
     * Define el valor de la propiedad sunday.
     * 
     */
    public void setSunday(boolean value) {
        this.sunday = value;
    }

}
