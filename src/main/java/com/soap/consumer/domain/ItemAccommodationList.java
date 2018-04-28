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
 * <p>Clase Java para ItemAccommodationList complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ItemAccommodationList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LoginGA" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AccommodationCode" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
 *         &lt;element name="UserCode" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
 *         &lt;element name="AccommodationName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Resort" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="GAName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="IdGallery" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/&gt;
 *         &lt;element name="Locality" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Capacity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
 *         &lt;element name="AdultsAndChildrenCapacity" type="{ws.avantio.com/crsConnectionServices}AdultsAndChildsCapacity" minOccurs="0"/&gt;
 *         &lt;element name="AccommodationUnits" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="MasterKind" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="IsAvailable" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="RepresentationType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Features" type="{ws.avantio.com/crsConnectionServices}FeaturesList"/&gt;
 *         &lt;element name="HotelFeatures" type="{ws.avantio.com/crsConnectionServices}FeaturesHotel" minOccurs="0"/&gt;
 *         &lt;element name="Views" type="{ws.avantio.com/crsConnectionServices}Views"/&gt;
 *         &lt;element name="Distances" type="{ws.avantio.com/crsConnectionServices}Distances"/&gt;
 *         &lt;element name="MainPicture" type="{ws.avantio.com/crsConnectionServices}Image"/&gt;
 *         &lt;element name="Price" type="{ws.avantio.com/crsConnectionServices}Price"/&gt;
 *         &lt;element name="PriceWithoutOffer" type="{ws.avantio.com/crsConnectionServices}Price"/&gt;
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemAccommodationList", propOrder = {
    "loginGA",
    "accommodationCode",
    "userCode",
    "accommodationName",
    "resort",
    "gaName",
    "idGallery",
    "locality",
    "capacity",
    "adultsAndChildrenCapacity",
    "accommodationUnits",
    "masterKind",
    "isAvailable",
    "representationType",
    "features",
    "hotelFeatures",
    "views",
    "distances",
    "mainPicture",
    "price",
    "priceWithoutOffer",
    "currency"
})
public class ItemAccommodationList {

    @XmlElement(name = "LoginGA", required = true)
    protected String loginGA;
    @XmlElement(name = "AccommodationCode", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger accommodationCode;
    @XmlElement(name = "UserCode", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger userCode;
    @XmlElement(name = "AccommodationName", required = true)
    protected String accommodationName;
    @XmlElement(name = "Resort", required = true)
    protected String resort;
    @XmlElement(name = "GAName", required = true)
    protected String gaName;
    @XmlElement(name = "IdGallery", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger idGallery;
    @XmlElement(name = "Locality", required = true)
    protected String locality;
    @XmlElement(name = "Capacity", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger capacity;
    @XmlElement(name = "AdultsAndChildrenCapacity")
    protected AdultsAndChildsCapacity adultsAndChildrenCapacity;
    @XmlElement(name = "AccommodationUnits")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger accommodationUnits;
    @XmlElement(name = "MasterKind", required = true)
    protected String masterKind;
    @XmlElement(name = "IsAvailable", required = true)
    protected BigInteger isAvailable;
    @XmlElement(name = "RepresentationType", required = true)
    protected String representationType;
    @XmlElement(name = "Features", required = true)
    protected FeaturesList features;
    @XmlElement(name = "HotelFeatures")
    protected FeaturesHotel hotelFeatures;
    @XmlElement(name = "Views", required = true)
    protected Views views;
    @XmlElement(name = "Distances", required = true)
    protected Distances distances;
    @XmlElement(name = "MainPicture", required = true)
    protected Image mainPicture;
    @XmlElement(name = "Price", required = true)
    protected Price price;
    @XmlElement(name = "PriceWithoutOffer", required = true)
    protected Price priceWithoutOffer;
    @XmlElement(name = "Currency", required = true)
    protected String currency;

    /**
     * Obtiene el valor de la propiedad loginGA.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoginGA() {
        return loginGA;
    }

    /**
     * Define el valor de la propiedad loginGA.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoginGA(String value) {
        this.loginGA = value;
    }

    /**
     * Obtiene el valor de la propiedad accommodationCode.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAccommodationCode() {
        return accommodationCode;
    }

    /**
     * Define el valor de la propiedad accommodationCode.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAccommodationCode(BigInteger value) {
        this.accommodationCode = value;
    }

    /**
     * Obtiene el valor de la propiedad userCode.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUserCode() {
        return userCode;
    }

    /**
     * Define el valor de la propiedad userCode.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUserCode(BigInteger value) {
        this.userCode = value;
    }

    /**
     * Obtiene el valor de la propiedad accommodationName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccommodationName() {
        return accommodationName;
    }

    /**
     * Define el valor de la propiedad accommodationName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccommodationName(String value) {
        this.accommodationName = value;
    }

    /**
     * Obtiene el valor de la propiedad resort.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResort() {
        return resort;
    }

    /**
     * Define el valor de la propiedad resort.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResort(String value) {
        this.resort = value;
    }

    /**
     * Obtiene el valor de la propiedad gaName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGAName() {
        return gaName;
    }

    /**
     * Define el valor de la propiedad gaName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGAName(String value) {
        this.gaName = value;
    }

    /**
     * Obtiene el valor de la propiedad idGallery.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIdGallery() {
        return idGallery;
    }

    /**
     * Define el valor de la propiedad idGallery.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIdGallery(BigInteger value) {
        this.idGallery = value;
    }

    /**
     * Obtiene el valor de la propiedad locality.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocality() {
        return locality;
    }

    /**
     * Define el valor de la propiedad locality.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocality(String value) {
        this.locality = value;
    }

    /**
     * Obtiene el valor de la propiedad capacity.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCapacity() {
        return capacity;
    }

    /**
     * Define el valor de la propiedad capacity.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCapacity(BigInteger value) {
        this.capacity = value;
    }

    /**
     * Obtiene el valor de la propiedad adultsAndChildrenCapacity.
     * 
     * @return
     *     possible object is
     *     {@link AdultsAndChildsCapacity }
     *     
     */
    public AdultsAndChildsCapacity getAdultsAndChildrenCapacity() {
        return adultsAndChildrenCapacity;
    }

    /**
     * Define el valor de la propiedad adultsAndChildrenCapacity.
     * 
     * @param value
     *     allowed object is
     *     {@link AdultsAndChildsCapacity }
     *     
     */
    public void setAdultsAndChildrenCapacity(AdultsAndChildsCapacity value) {
        this.adultsAndChildrenCapacity = value;
    }

    /**
     * Obtiene el valor de la propiedad accommodationUnits.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAccommodationUnits() {
        return accommodationUnits;
    }

    /**
     * Define el valor de la propiedad accommodationUnits.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAccommodationUnits(BigInteger value) {
        this.accommodationUnits = value;
    }

    /**
     * Obtiene el valor de la propiedad masterKind.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMasterKind() {
        return masterKind;
    }

    /**
     * Define el valor de la propiedad masterKind.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMasterKind(String value) {
        this.masterKind = value;
    }

    /**
     * Obtiene el valor de la propiedad isAvailable.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIsAvailable() {
        return isAvailable;
    }

    /**
     * Define el valor de la propiedad isAvailable.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIsAvailable(BigInteger value) {
        this.isAvailable = value;
    }

    /**
     * Obtiene el valor de la propiedad representationType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepresentationType() {
        return representationType;
    }

    /**
     * Define el valor de la propiedad representationType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepresentationType(String value) {
        this.representationType = value;
    }

    /**
     * Obtiene el valor de la propiedad features.
     * 
     * @return
     *     possible object is
     *     {@link FeaturesList }
     *     
     */
    public FeaturesList getFeatures() {
        return features;
    }

    /**
     * Define el valor de la propiedad features.
     * 
     * @param value
     *     allowed object is
     *     {@link FeaturesList }
     *     
     */
    public void setFeatures(FeaturesList value) {
        this.features = value;
    }

    /**
     * Obtiene el valor de la propiedad hotelFeatures.
     * 
     * @return
     *     possible object is
     *     {@link FeaturesHotel }
     *     
     */
    public FeaturesHotel getHotelFeatures() {
        return hotelFeatures;
    }

    /**
     * Define el valor de la propiedad hotelFeatures.
     * 
     * @param value
     *     allowed object is
     *     {@link FeaturesHotel }
     *     
     */
    public void setHotelFeatures(FeaturesHotel value) {
        this.hotelFeatures = value;
    }

    /**
     * Obtiene el valor de la propiedad views.
     * 
     * @return
     *     possible object is
     *     {@link Views }
     *     
     */
    public Views getViews() {
        return views;
    }

    /**
     * Define el valor de la propiedad views.
     * 
     * @param value
     *     allowed object is
     *     {@link Views }
     *     
     */
    public void setViews(Views value) {
        this.views = value;
    }

    /**
     * Obtiene el valor de la propiedad distances.
     * 
     * @return
     *     possible object is
     *     {@link Distances }
     *     
     */
    public Distances getDistances() {
        return distances;
    }

    /**
     * Define el valor de la propiedad distances.
     * 
     * @param value
     *     allowed object is
     *     {@link Distances }
     *     
     */
    public void setDistances(Distances value) {
        this.distances = value;
    }

    /**
     * Obtiene el valor de la propiedad mainPicture.
     * 
     * @return
     *     possible object is
     *     {@link Image }
     *     
     */
    public Image getMainPicture() {
        return mainPicture;
    }

    /**
     * Define el valor de la propiedad mainPicture.
     * 
     * @param value
     *     allowed object is
     *     {@link Image }
     *     
     */
    public void setMainPicture(Image value) {
        this.mainPicture = value;
    }

    /**
     * Obtiene el valor de la propiedad price.
     * 
     * @return
     *     possible object is
     *     {@link Price }
     *     
     */
    public Price getPrice() {
        return price;
    }

    /**
     * Define el valor de la propiedad price.
     * 
     * @param value
     *     allowed object is
     *     {@link Price }
     *     
     */
    public void setPrice(Price value) {
        this.price = value;
    }

    /**
     * Obtiene el valor de la propiedad priceWithoutOffer.
     * 
     * @return
     *     possible object is
     *     {@link Price }
     *     
     */
    public Price getPriceWithoutOffer() {
        return priceWithoutOffer;
    }

    /**
     * Define el valor de la propiedad priceWithoutOffer.
     * 
     * @param value
     *     allowed object is
     *     {@link Price }
     *     
     */
    public void setPriceWithoutOffer(Price value) {
        this.priceWithoutOffer = value;
    }

    /**
     * Obtiene el valor de la propiedad currency.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Define el valor de la propiedad currency.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

}
