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
 * <p>Clase Java para Extras complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Extras"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Heating" type="{ws.avantio.com/crsConnectionServices}Heating" minOccurs="0"/&gt;
 *         &lt;element name="AirConditioned" type="{ws.avantio.com/crsConnectionServices}AirConditioned" minOccurs="0"/&gt;
 *         &lt;element name="Parking" type="{ws.avantio.com/crsConnectionServices}Parking" minOccurs="0"/&gt;
 *         &lt;element name="ExtraBeds" type="{ws.avantio.com/crsConnectionServices}ExtraBeds" minOccurs="0"/&gt;
 *         &lt;element name="SwimmingPool" type="{ws.avantio.com/crsConnectionServices}SwimmingPool" minOccurs="0"/&gt;
 *         &lt;element name="HeatedSwimmingPool" type="{ws.avantio.com/crsConnectionServices}HeatedSwimmingPool" minOccurs="0"/&gt;
 *         &lt;element name="BedClothes" type="{ws.avantio.com/crsConnectionServices}BedClothes" minOccurs="0"/&gt;
 *         &lt;element name="Towels" type="{ws.avantio.com/crsConnectionServices}Towels" minOccurs="0"/&gt;
 *         &lt;element name="TV" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
 *         &lt;element name="InternetAccess" type="{ws.avantio.com/crsConnectionServices}InternetAccess" minOccurs="0"/&gt;
 *         &lt;element name="PetsAllowed" type="{ws.avantio.com/crsConnectionServices}PetsAllowed" minOccurs="0"/&gt;
 *         &lt;element name="HandicappedFacilities" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FinalClean" type="{ws.avantio.com/crsConnectionServices}FinalClean" minOccurs="0"/&gt;
 *         &lt;element name="Deposit" type="{ws.avantio.com/crsConnectionServices}Deposit" minOccurs="0"/&gt;
 *         &lt;element name="Kitchen" type="{ws.avantio.com/crsConnectionServices}Kitchen" minOccurs="0"/&gt;
 *         &lt;element name="InternetAccessInRoom" type="{ws.avantio.com/crsConnectionServices}InternetAccessInRoom" minOccurs="0"/&gt;
 *         &lt;element name="Cot" type="{ws.avantio.com/crsConnectionServices}Cot" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Extras", propOrder = {
    "heating",
    "airConditioned",
    "parking",
    "extraBeds",
    "swimmingPool",
    "heatedSwimmingPool",
    "bedClothes",
    "towels",
    "tv",
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
    "internetAccess",
    "petsAllowed",
    "handicappedFacilities",
    "finalClean",
    "deposit",
    "kitchen",
    "internetAccessInRoom",
    "cot"
})
public class Extras {

    @XmlElement(name = "Heating")
    protected Heating heating;
    @XmlElement(name = "AirConditioned")
    protected AirConditioned airConditioned;
    @XmlElement(name = "Parking")
    protected Parking parking;
    @XmlElement(name = "ExtraBeds")
    protected ExtraBeds extraBeds;
    @XmlElement(name = "SwimmingPool")
    protected SwimmingPool swimmingPool;
    @XmlElement(name = "HeatedSwimmingPool")
    protected HeatedSwimmingPool heatedSwimmingPool;
    @XmlElement(name = "BedClothes")
    protected BedClothes bedClothes;
    @XmlElement(name = "Towels")
    protected Towels towels;
    @XmlElement(name = "TV")
    protected Boolean tv;
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
    @XmlElement(name = "InternetAccess")
    protected InternetAccess internetAccess;
    @XmlElement(name = "PetsAllowed")
    protected PetsAllowed petsAllowed;
    @XmlElement(name = "HandicappedFacilities")
    protected String handicappedFacilities;
    @XmlElement(name = "FinalClean")
    protected FinalClean finalClean;
    @XmlElement(name = "Deposit")
    protected Deposit deposit;
    @XmlElement(name = "Kitchen")
    protected Kitchen kitchen;
    @XmlElement(name = "InternetAccessInRoom")
    protected InternetAccessInRoom internetAccessInRoom;
    @XmlElement(name = "Cot")
    protected Cot cot;

    /**
     * Obtiene el valor de la propiedad heating.
     * 
     * @return
     *     possible object is
     *     {@link Heating }
     *     
     */
    public Heating getHeating() {
        return heating;
    }

    /**
     * Define el valor de la propiedad heating.
     * 
     * @param value
     *     allowed object is
     *     {@link Heating }
     *     
     */
    public void setHeating(Heating value) {
        this.heating = value;
    }

    /**
     * Obtiene el valor de la propiedad airConditioned.
     * 
     * @return
     *     possible object is
     *     {@link AirConditioned }
     *     
     */
    public AirConditioned getAirConditioned() {
        return airConditioned;
    }

    /**
     * Define el valor de la propiedad airConditioned.
     * 
     * @param value
     *     allowed object is
     *     {@link AirConditioned }
     *     
     */
    public void setAirConditioned(AirConditioned value) {
        this.airConditioned = value;
    }

    /**
     * Obtiene el valor de la propiedad parking.
     * 
     * @return
     *     possible object is
     *     {@link Parking }
     *     
     */
    public Parking getParking() {
        return parking;
    }

    /**
     * Define el valor de la propiedad parking.
     * 
     * @param value
     *     allowed object is
     *     {@link Parking }
     *     
     */
    public void setParking(Parking value) {
        this.parking = value;
    }

    /**
     * Obtiene el valor de la propiedad extraBeds.
     * 
     * @return
     *     possible object is
     *     {@link ExtraBeds }
     *     
     */
    public ExtraBeds getExtraBeds() {
        return extraBeds;
    }

    /**
     * Define el valor de la propiedad extraBeds.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtraBeds }
     *     
     */
    public void setExtraBeds(ExtraBeds value) {
        this.extraBeds = value;
    }

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
     * Obtiene el valor de la propiedad heatedSwimmingPool.
     * 
     * @return
     *     possible object is
     *     {@link HeatedSwimmingPool }
     *     
     */
    public HeatedSwimmingPool getHeatedSwimmingPool() {
        return heatedSwimmingPool;
    }

    /**
     * Define el valor de la propiedad heatedSwimmingPool.
     * 
     * @param value
     *     allowed object is
     *     {@link HeatedSwimmingPool }
     *     
     */
    public void setHeatedSwimmingPool(HeatedSwimmingPool value) {
        this.heatedSwimmingPool = value;
    }

    /**
     * Obtiene el valor de la propiedad bedClothes.
     * 
     * @return
     *     possible object is
     *     {@link BedClothes }
     *     
     */
    public BedClothes getBedClothes() {
        return bedClothes;
    }

    /**
     * Define el valor de la propiedad bedClothes.
     * 
     * @param value
     *     allowed object is
     *     {@link BedClothes }
     *     
     */
    public void setBedClothes(BedClothes value) {
        this.bedClothes = value;
    }

    /**
     * Obtiene el valor de la propiedad towels.
     * 
     * @return
     *     possible object is
     *     {@link Towels }
     *     
     */
    public Towels getTowels() {
        return towels;
    }

    /**
     * Define el valor de la propiedad towels.
     * 
     * @param value
     *     allowed object is
     *     {@link Towels }
     *     
     */
    public void setTowels(Towels value) {
        this.towels = value;
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
     * Obtiene el valor de la propiedad internetAccess.
     * 
     * @return
     *     possible object is
     *     {@link InternetAccess }
     *     
     */
    public InternetAccess getInternetAccess() {
        return internetAccess;
    }

    /**
     * Define el valor de la propiedad internetAccess.
     * 
     * @param value
     *     allowed object is
     *     {@link InternetAccess }
     *     
     */
    public void setInternetAccess(InternetAccess value) {
        this.internetAccess = value;
    }

    /**
     * Obtiene el valor de la propiedad petsAllowed.
     * 
     * @return
     *     possible object is
     *     {@link PetsAllowed }
     *     
     */
    public PetsAllowed getPetsAllowed() {
        return petsAllowed;
    }

    /**
     * Define el valor de la propiedad petsAllowed.
     * 
     * @param value
     *     allowed object is
     *     {@link PetsAllowed }
     *     
     */
    public void setPetsAllowed(PetsAllowed value) {
        this.petsAllowed = value;
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
     * Obtiene el valor de la propiedad finalClean.
     * 
     * @return
     *     possible object is
     *     {@link FinalClean }
     *     
     */
    public FinalClean getFinalClean() {
        return finalClean;
    }

    /**
     * Define el valor de la propiedad finalClean.
     * 
     * @param value
     *     allowed object is
     *     {@link FinalClean }
     *     
     */
    public void setFinalClean(FinalClean value) {
        this.finalClean = value;
    }

    /**
     * Obtiene el valor de la propiedad deposit.
     * 
     * @return
     *     possible object is
     *     {@link Deposit }
     *     
     */
    public Deposit getDeposit() {
        return deposit;
    }

    /**
     * Define el valor de la propiedad deposit.
     * 
     * @param value
     *     allowed object is
     *     {@link Deposit }
     *     
     */
    public void setDeposit(Deposit value) {
        this.deposit = value;
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
     * Obtiene el valor de la propiedad internetAccessInRoom.
     * 
     * @return
     *     possible object is
     *     {@link InternetAccessInRoom }
     *     
     */
    public InternetAccessInRoom getInternetAccessInRoom() {
        return internetAccessInRoom;
    }

    /**
     * Define el valor de la propiedad internetAccessInRoom.
     * 
     * @param value
     *     allowed object is
     *     {@link InternetAccessInRoom }
     *     
     */
    public void setInternetAccessInRoom(InternetAccessInRoom value) {
        this.internetAccessInRoom = value;
    }

    /**
     * Obtiene el valor de la propiedad cot.
     * 
     * @return
     *     possible object is
     *     {@link Cot }
     *     
     */
    public Cot getCot() {
        return cot;
    }

    /**
     * Define el valor de la propiedad cot.
     * 
     * @param value
     *     allowed object is
     *     {@link Cot }
     *     
     */
    public void setCot(Cot value) {
        this.cot = value;
    }

}
