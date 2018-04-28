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
 * <p>Clase Java para Distribution complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Distribution"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PeopleCapacity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element name="MinimumOccupation" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element name="AcceptYoungsters" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OccupationWithoutSupplement" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element name="Bedrooms" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element name="DoubleBeds" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element name="IndividualBeds" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element name="IndividualSofaBed" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element name="DoubleSofaBed" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element name="Toilets" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element name="BathroomWithBathtub" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element name="BathroomWithShower" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element name="Berths" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element name="AreaHousing" type="{ws.avantio.com/crsConnectionServices}Area" minOccurs="0"/&gt;
 *         &lt;element name="AreaPlot" type="{ws.avantio.com/crsConnectionServices}Area" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Distribution", propOrder = {
    "peopleCapacity",
    "minimumOccupation",
    "acceptYoungsters",
    "occupationWithoutSupplement",
    "bedrooms",
    "doubleBeds",
    "individualBeds",
    "individualSofaBed",
    "doubleSofaBed",
    "toilets",
    "bathroomWithBathtub",
    "bathroomWithShower",
    "berths",
    "areaHousing",
    "areaPlot"
})
public class Distribution {

    @XmlElement(name = "PeopleCapacity")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger peopleCapacity;
    @XmlElement(name = "MinimumOccupation")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger minimumOccupation;
    @XmlElement(name = "AcceptYoungsters")
    protected Boolean acceptYoungsters;
    @XmlElement(name = "OccupationWithoutSupplement")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger occupationWithoutSupplement;
    @XmlElement(name = "Bedrooms")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger bedrooms;
    @XmlElement(name = "DoubleBeds")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger doubleBeds;
    @XmlElement(name = "IndividualBeds")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger individualBeds;
    @XmlElement(name = "IndividualSofaBed")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger individualSofaBed;
    @XmlElement(name = "DoubleSofaBed")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger doubleSofaBed;
    @XmlElement(name = "Toilets")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger toilets;
    @XmlElement(name = "BathroomWithBathtub")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger bathroomWithBathtub;
    @XmlElement(name = "BathroomWithShower")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger bathroomWithShower;
    @XmlElement(name = "Berths")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger berths;
    @XmlElement(name = "AreaHousing")
    protected Area areaHousing;
    @XmlElement(name = "AreaPlot")
    protected Area areaPlot;

    /**
     * Obtiene el valor de la propiedad peopleCapacity.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPeopleCapacity() {
        return peopleCapacity;
    }

    /**
     * Define el valor de la propiedad peopleCapacity.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPeopleCapacity(BigInteger value) {
        this.peopleCapacity = value;
    }

    /**
     * Obtiene el valor de la propiedad minimumOccupation.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinimumOccupation() {
        return minimumOccupation;
    }

    /**
     * Define el valor de la propiedad minimumOccupation.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinimumOccupation(BigInteger value) {
        this.minimumOccupation = value;
    }

    /**
     * Obtiene el valor de la propiedad acceptYoungsters.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAcceptYoungsters() {
        return acceptYoungsters;
    }

    /**
     * Define el valor de la propiedad acceptYoungsters.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAcceptYoungsters(Boolean value) {
        this.acceptYoungsters = value;
    }

    /**
     * Obtiene el valor de la propiedad occupationWithoutSupplement.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOccupationWithoutSupplement() {
        return occupationWithoutSupplement;
    }

    /**
     * Define el valor de la propiedad occupationWithoutSupplement.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOccupationWithoutSupplement(BigInteger value) {
        this.occupationWithoutSupplement = value;
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
     * Obtiene el valor de la propiedad doubleBeds.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDoubleBeds() {
        return doubleBeds;
    }

    /**
     * Define el valor de la propiedad doubleBeds.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDoubleBeds(BigInteger value) {
        this.doubleBeds = value;
    }

    /**
     * Obtiene el valor de la propiedad individualBeds.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIndividualBeds() {
        return individualBeds;
    }

    /**
     * Define el valor de la propiedad individualBeds.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIndividualBeds(BigInteger value) {
        this.individualBeds = value;
    }

    /**
     * Obtiene el valor de la propiedad individualSofaBed.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIndividualSofaBed() {
        return individualSofaBed;
    }

    /**
     * Define el valor de la propiedad individualSofaBed.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIndividualSofaBed(BigInteger value) {
        this.individualSofaBed = value;
    }

    /**
     * Obtiene el valor de la propiedad doubleSofaBed.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDoubleSofaBed() {
        return doubleSofaBed;
    }

    /**
     * Define el valor de la propiedad doubleSofaBed.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDoubleSofaBed(BigInteger value) {
        this.doubleSofaBed = value;
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
     * Obtiene el valor de la propiedad berths.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBerths() {
        return berths;
    }

    /**
     * Define el valor de la propiedad berths.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBerths(BigInteger value) {
        this.berths = value;
    }

    /**
     * Obtiene el valor de la propiedad areaHousing.
     * 
     * @return
     *     possible object is
     *     {@link Area }
     *     
     */
    public Area getAreaHousing() {
        return areaHousing;
    }

    /**
     * Define el valor de la propiedad areaHousing.
     * 
     * @param value
     *     allowed object is
     *     {@link Area }
     *     
     */
    public void setAreaHousing(Area value) {
        this.areaHousing = value;
    }

    /**
     * Obtiene el valor de la propiedad areaPlot.
     * 
     * @return
     *     possible object is
     *     {@link Area }
     *     
     */
    public Area getAreaPlot() {
        return areaPlot;
    }

    /**
     * Define el valor de la propiedad areaPlot.
     * 
     * @param value
     *     allowed object is
     *     {@link Area }
     *     
     */
    public void setAreaPlot(Area value) {
        this.areaPlot = value;
    }

}
