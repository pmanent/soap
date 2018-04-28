//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.04.15 a las 06:28:31 PM CEST 
//


package com.soap.consumer.domain;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CheckInRule complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CheckInRule"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Season" type="{ws.avantio.com/crsConnectionServices}Season"/&gt;
 *         &lt;element name="Schedule" type="{ws.avantio.com/crsConnectionServices}Schedule" maxOccurs="unbounded"/&gt;
 *         &lt;element name="DaysOfApplication" type="{ws.avantio.com/crsConnectionServices}DaysOfApplication"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckInRule", propOrder = {
    "season",
    "schedule",
    "daysOfApplication"
})
public class CheckInRule {

    @XmlElement(name = "Season", required = true)
    protected Season season;
    @XmlElement(name = "Schedule", required = true)
    protected List<Schedule> schedule;
    @XmlElement(name = "DaysOfApplication", required = true)
    protected DaysOfApplication daysOfApplication;

    /**
     * Obtiene el valor de la propiedad season.
     * 
     * @return
     *     possible object is
     *     {@link Season }
     *     
     */
    public Season getSeason() {
        return season;
    }

    /**
     * Define el valor de la propiedad season.
     * 
     * @param value
     *     allowed object is
     *     {@link Season }
     *     
     */
    public void setSeason(Season value) {
        this.season = value;
    }

    /**
     * Gets the value of the schedule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the schedule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSchedule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Schedule }
     * 
     * 
     */
    public List<Schedule> getSchedule() {
        if (schedule == null) {
            schedule = new ArrayList<Schedule>();
        }
        return this.schedule;
    }

    /**
     * Obtiene el valor de la propiedad daysOfApplication.
     * 
     * @return
     *     possible object is
     *     {@link DaysOfApplication }
     *     
     */
    public DaysOfApplication getDaysOfApplication() {
        return daysOfApplication;
    }

    /**
     * Define el valor de la propiedad daysOfApplication.
     * 
     * @param value
     *     allowed object is
     *     {@link DaysOfApplication }
     *     
     */
    public void setDaysOfApplication(DaysOfApplication value) {
        this.daysOfApplication = value;
    }

}
