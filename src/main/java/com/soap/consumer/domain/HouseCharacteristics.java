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
 * <p>Clase Java para HouseCharacteristics complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="HouseCharacteristics"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SwimmingPool" type="{ws.avantio.com/crsConnectionServices}SwimmingPool" minOccurs="0"/&gt;
 *         &lt;element name="TV" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NumOfTelevisions" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="TVSatellite" type="{ws.avantio.com/crsConnectionServices}TVSatellite" minOccurs="0"/&gt;
 *         &lt;element name="Garden" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="GardenFurniture" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Iron" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="FirePlace" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Barbacue" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Radio" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MiniBar" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Terrace" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="FencedPlot" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SecurityBox" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Elevator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DVD" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Balcony" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="JuiceSqueazer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ElectricKettle" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HairDryer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ChildrenArea" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Gym" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Alarm" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Tennis" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Squash" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Paddel" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Sauna" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NumOfFans" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="NumOfElectronicMosquitoRepeller" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="WindowScreens" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HandicappedFacilities" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Kitchen" type="{ws.avantio.com/crsConnectionServices}Kitchen" minOccurs="0"/&gt;
 *         &lt;element name="Jacuzzi" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SmokingAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HouseCharacteristics", propOrder = {
    "swimmingPool",
    "tv",
    "numOfTelevisions",
    "tvSatellite",
    "garden",
    "gardenFurniture",
    "iron",
    "firePlace",
    "barbacue",
    "radio",
    "miniBar",
    "terrace",
    "fencedPlot",
    "securityBox",
    "elevator",
    "dvd",
    "balcony",
    "juiceSqueazer",
    "electricKettle",
    "hairDryer",
    "childrenArea",
    "gym",
    "alarm",
    "tennis",
    "squash",
    "paddel",
    "sauna",
    "numOfFans",
    "numOfElectronicMosquitoRepeller",
    "windowScreens",
    "handicappedFacilities",
    "kitchen",
    "jacuzzi",
    "smokingAllowed"
})
public class HouseCharacteristics {

    @XmlElement(name = "SwimmingPool")
    protected SwimmingPool swimmingPool;
    @XmlElement(name = "TV")
    protected Boolean tv;
    @XmlElement(name = "NumOfTelevisions")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numOfTelevisions;
    @XmlElement(name = "TVSatellite")
    protected TVSatellite tvSatellite;
    @XmlElement(name = "Garden")
    protected Boolean garden;
    @XmlElement(name = "GardenFurniture")
    protected Boolean gardenFurniture;
    @XmlElement(name = "Iron")
    protected Boolean iron;
    @XmlElement(name = "FirePlace")
    protected Boolean firePlace;
    @XmlElement(name = "Barbacue")
    protected Boolean barbacue;
    @XmlElement(name = "Radio")
    protected Boolean radio;
    @XmlElement(name = "MiniBar")
    protected Boolean miniBar;
    @XmlElement(name = "Terrace")
    protected Boolean terrace;
    @XmlElement(name = "FencedPlot")
    protected Boolean fencedPlot;
    @XmlElement(name = "SecurityBox")
    protected Boolean securityBox;
    @XmlElement(name = "Elevator")
    protected Boolean elevator;
    @XmlElement(name = "DVD")
    protected Boolean dvd;
    @XmlElement(name = "Balcony")
    protected Boolean balcony;
    @XmlElement(name = "JuiceSqueazer")
    protected Boolean juiceSqueazer;
    @XmlElement(name = "ElectricKettle")
    protected Boolean electricKettle;
    @XmlElement(name = "HairDryer")
    protected Boolean hairDryer;
    @XmlElement(name = "ChildrenArea")
    protected Boolean childrenArea;
    @XmlElement(name = "Gym")
    protected Boolean gym;
    @XmlElement(name = "Alarm")
    protected Boolean alarm;
    @XmlElement(name = "Tennis")
    protected Boolean tennis;
    @XmlElement(name = "Squash")
    protected Boolean squash;
    @XmlElement(name = "Paddel")
    protected Boolean paddel;
    @XmlElement(name = "Sauna")
    protected Boolean sauna;
    @XmlElement(name = "NumOfFans")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numOfFans;
    @XmlElement(name = "NumOfElectronicMosquitoRepeller")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numOfElectronicMosquitoRepeller;
    @XmlElement(name = "WindowScreens")
    protected String windowScreens;
    @XmlElement(name = "HandicappedFacilities")
    protected String handicappedFacilities;
    @XmlElement(name = "Kitchen")
    protected Kitchen kitchen;
    @XmlElement(name = "Jacuzzi")
    protected Boolean jacuzzi;
    @XmlElement(name = "SmokingAllowed")
    protected Boolean smokingAllowed;

    /**
     * Obtiene el valor de la propiedad swimmingPool.
     * 
     * @return
     *     possible object is
     *     {@link SwimmingPool }
     *     
     */
    public SwimmingPool getSwimmingPool() {
        return swimmingPool;
    }

    /**
     * Define el valor de la propiedad swimmingPool.
     * 
     * @param value
     *     allowed object is
     *     {@link SwimmingPool }
     *     
     */
    public void setSwimmingPool(SwimmingPool value) {
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
     * Obtiene el valor de la propiedad numOfTelevisions.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumOfTelevisions() {
        return numOfTelevisions;
    }

    /**
     * Define el valor de la propiedad numOfTelevisions.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumOfTelevisions(BigInteger value) {
        this.numOfTelevisions = value;
    }

    /**
     * Obtiene el valor de la propiedad tvSatellite.
     * 
     * @return
     *     possible object is
     *     {@link TVSatellite }
     *     
     */
    public TVSatellite getTVSatellite() {
        return tvSatellite;
    }

    /**
     * Define el valor de la propiedad tvSatellite.
     * 
     * @param value
     *     allowed object is
     *     {@link TVSatellite }
     *     
     */
    public void setTVSatellite(TVSatellite value) {
        this.tvSatellite = value;
    }

    /**
     * Obtiene el valor de la propiedad garden.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGarden() {
        return garden;
    }

    /**
     * Define el valor de la propiedad garden.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGarden(Boolean value) {
        this.garden = value;
    }

    /**
     * Obtiene el valor de la propiedad gardenFurniture.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGardenFurniture() {
        return gardenFurniture;
    }

    /**
     * Define el valor de la propiedad gardenFurniture.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGardenFurniture(Boolean value) {
        this.gardenFurniture = value;
    }

    /**
     * Obtiene el valor de la propiedad iron.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIron() {
        return iron;
    }

    /**
     * Define el valor de la propiedad iron.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIron(Boolean value) {
        this.iron = value;
    }

    /**
     * Obtiene el valor de la propiedad firePlace.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFirePlace() {
        return firePlace;
    }

    /**
     * Define el valor de la propiedad firePlace.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFirePlace(Boolean value) {
        this.firePlace = value;
    }

    /**
     * Obtiene el valor de la propiedad barbacue.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBarbacue() {
        return barbacue;
    }

    /**
     * Define el valor de la propiedad barbacue.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBarbacue(Boolean value) {
        this.barbacue = value;
    }

    /**
     * Obtiene el valor de la propiedad radio.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRadio() {
        return radio;
    }

    /**
     * Define el valor de la propiedad radio.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRadio(Boolean value) {
        this.radio = value;
    }

    /**
     * Obtiene el valor de la propiedad miniBar.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMiniBar() {
        return miniBar;
    }

    /**
     * Define el valor de la propiedad miniBar.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMiniBar(Boolean value) {
        this.miniBar = value;
    }

    /**
     * Obtiene el valor de la propiedad terrace.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTerrace() {
        return terrace;
    }

    /**
     * Define el valor de la propiedad terrace.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTerrace(Boolean value) {
        this.terrace = value;
    }

    /**
     * Obtiene el valor de la propiedad fencedPlot.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFencedPlot() {
        return fencedPlot;
    }

    /**
     * Define el valor de la propiedad fencedPlot.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFencedPlot(Boolean value) {
        this.fencedPlot = value;
    }

    /**
     * Obtiene el valor de la propiedad securityBox.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSecurityBox() {
        return securityBox;
    }

    /**
     * Define el valor de la propiedad securityBox.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSecurityBox(Boolean value) {
        this.securityBox = value;
    }

    /**
     * Obtiene el valor de la propiedad elevator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isElevator() {
        return elevator;
    }

    /**
     * Define el valor de la propiedad elevator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setElevator(Boolean value) {
        this.elevator = value;
    }

    /**
     * Obtiene el valor de la propiedad dvd.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDVD() {
        return dvd;
    }

    /**
     * Define el valor de la propiedad dvd.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDVD(Boolean value) {
        this.dvd = value;
    }

    /**
     * Obtiene el valor de la propiedad balcony.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBalcony() {
        return balcony;
    }

    /**
     * Define el valor de la propiedad balcony.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBalcony(Boolean value) {
        this.balcony = value;
    }

    /**
     * Obtiene el valor de la propiedad juiceSqueazer.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isJuiceSqueazer() {
        return juiceSqueazer;
    }

    /**
     * Define el valor de la propiedad juiceSqueazer.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setJuiceSqueazer(Boolean value) {
        this.juiceSqueazer = value;
    }

    /**
     * Obtiene el valor de la propiedad electricKettle.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isElectricKettle() {
        return electricKettle;
    }

    /**
     * Define el valor de la propiedad electricKettle.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setElectricKettle(Boolean value) {
        this.electricKettle = value;
    }

    /**
     * Obtiene el valor de la propiedad hairDryer.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHairDryer() {
        return hairDryer;
    }

    /**
     * Define el valor de la propiedad hairDryer.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHairDryer(Boolean value) {
        this.hairDryer = value;
    }

    /**
     * Obtiene el valor de la propiedad childrenArea.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChildrenArea() {
        return childrenArea;
    }

    /**
     * Define el valor de la propiedad childrenArea.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChildrenArea(Boolean value) {
        this.childrenArea = value;
    }

    /**
     * Obtiene el valor de la propiedad gym.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGym() {
        return gym;
    }

    /**
     * Define el valor de la propiedad gym.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGym(Boolean value) {
        this.gym = value;
    }

    /**
     * Obtiene el valor de la propiedad alarm.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAlarm() {
        return alarm;
    }

    /**
     * Define el valor de la propiedad alarm.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAlarm(Boolean value) {
        this.alarm = value;
    }

    /**
     * Obtiene el valor de la propiedad tennis.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTennis() {
        return tennis;
    }

    /**
     * Define el valor de la propiedad tennis.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTennis(Boolean value) {
        this.tennis = value;
    }

    /**
     * Obtiene el valor de la propiedad squash.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSquash() {
        return squash;
    }

    /**
     * Define el valor de la propiedad squash.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSquash(Boolean value) {
        this.squash = value;
    }

    /**
     * Obtiene el valor de la propiedad paddel.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPaddel() {
        return paddel;
    }

    /**
     * Define el valor de la propiedad paddel.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPaddel(Boolean value) {
        this.paddel = value;
    }

    /**
     * Obtiene el valor de la propiedad sauna.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSauna() {
        return sauna;
    }

    /**
     * Define el valor de la propiedad sauna.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSauna(Boolean value) {
        this.sauna = value;
    }

    /**
     * Obtiene el valor de la propiedad numOfFans.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumOfFans() {
        return numOfFans;
    }

    /**
     * Define el valor de la propiedad numOfFans.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumOfFans(BigInteger value) {
        this.numOfFans = value;
    }

    /**
     * Obtiene el valor de la propiedad numOfElectronicMosquitoRepeller.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumOfElectronicMosquitoRepeller() {
        return numOfElectronicMosquitoRepeller;
    }

    /**
     * Define el valor de la propiedad numOfElectronicMosquitoRepeller.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumOfElectronicMosquitoRepeller(BigInteger value) {
        this.numOfElectronicMosquitoRepeller = value;
    }

    /**
     * Obtiene el valor de la propiedad windowScreens.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWindowScreens() {
        return windowScreens;
    }

    /**
     * Define el valor de la propiedad windowScreens.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWindowScreens(String value) {
        this.windowScreens = value;
    }

    /**
     * Obtiene el valor de la propiedad handicappedFacilities.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHandicappedFacilities() {
        return handicappedFacilities;
    }

    /**
     * Define el valor de la propiedad handicappedFacilities.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHandicappedFacilities(String value) {
        this.handicappedFacilities = value;
    }

    /**
     * Obtiene el valor de la propiedad kitchen.
     * 
     * @return
     *     possible object is
     *     {@link Kitchen }
     *     
     */
    public Kitchen getKitchen() {
        return kitchen;
    }

    /**
     * Define el valor de la propiedad kitchen.
     * 
     * @param value
     *     allowed object is
     *     {@link Kitchen }
     *     
     */
    public void setKitchen(Kitchen value) {
        this.kitchen = value;
    }

    /**
     * Obtiene el valor de la propiedad jacuzzi.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isJacuzzi() {
        return jacuzzi;
    }

    /**
     * Define el valor de la propiedad jacuzzi.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setJacuzzi(Boolean value) {
        this.jacuzzi = value;
    }

    /**
     * Obtiene el valor de la propiedad smokingAllowed.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSmokingAllowed() {
        return smokingAllowed;
    }

    /**
     * Define el valor de la propiedad smokingAllowed.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSmokingAllowed(Boolean value) {
        this.smokingAllowed = value;
    }

}
