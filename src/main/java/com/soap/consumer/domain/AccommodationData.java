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
 * <p>Clase Java para AccommodationData complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AccommodationData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AccommodationCode" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
 *         &lt;element name="UserCode" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
 *         &lt;element name="LoginGA" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="GACode" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
 *         &lt;element name="AccommodationName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="IdGallery" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/&gt;
 *         &lt;element name="OccupationalRuleId" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/&gt;
 *         &lt;element name="PriceModifierId" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/&gt;
 *         &lt;element name="TouristicRegistrationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Purpose" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="UserKind" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MasterKind" type="{ws.avantio.com/crsConnectionServices}MasterKind"/&gt;
 *         &lt;element name="HotelFeatures" type="{ws.avantio.com/crsConnectionServices}HotelFeatures" minOccurs="0"/&gt;
 *         &lt;element name="LocalizationData" type="{ws.avantio.com/crsConnectionServices}LocalizationData"/&gt;
 *         &lt;element name="IsAvailable" type="{ws.avantio.com/crsConnectionServices}Available"/&gt;
 *         &lt;element name="AccommodationUnits" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="RoomOnlyPrice" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="RoomOnlyOfferPrice" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="BedAndBreakfastPrice" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="BedAndBreakfastOfferPrice" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="HalfBoardPrice" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="HalfBoardOfferPrice" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="FullBoardPrice" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="FullBoardOfferPrice" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="AllIncludedPrice" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="AllIncludedOfferPrice" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VAT" type="{ws.avantio.com/crsConnectionServices}VAT" minOccurs="0"/&gt;
 *         &lt;element name="OfferText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MonthlyPrice" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="SalePrice" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="Images" type="{ws.avantio.com/crsConnectionServices}Images"/&gt;
 *         &lt;element name="HotelImages" type="{ws.avantio.com/crsConnectionServices}Images" minOccurs="0"/&gt;
 *         &lt;element name="BookingURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SaleURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BookingLSURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DetailsURL" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Features" type="{ws.avantio.com/crsConnectionServices}Features"/&gt;
 *         &lt;element name="CheckInCheckOutInfo" type="{ws.avantio.com/crsConnectionServices}CheckInCheckOutInfo"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DescriptionMultiLanguage" type="{ws.avantio.com/crsConnectionServices}DescriptionMultiLanguage" minOccurs="0"/&gt;
 *         &lt;element name="TitleMultiLanguage" type="{ws.avantio.com/crsConnectionServices}TitleMultiLanguage" minOccurs="0"/&gt;
 *         &lt;element name="Reviews" type="{ws.avantio.com/crsConnectionServices}Reviews" minOccurs="0"/&gt;
 *         &lt;element name="Labels" type="{ws.avantio.com/crsConnectionServices}Labels" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccommodationData", propOrder = {
    "accommodationCode",
    "userCode",
    "loginGA",
    "gaCode",
    "accommodationName",
    "idGallery",
    "occupationalRuleId",
    "priceModifierId",
    "touristicRegistrationNumber",
    "purpose",
    "userKind",
    "masterKind",
    "hotelFeatures",
    "localizationData",
    "isAvailable",
    "accommodationUnits",
    "roomOnlyPrice",
    "roomOnlyOfferPrice",
    "bedAndBreakfastPrice",
    "bedAndBreakfastOfferPrice",
    "halfBoardPrice",
    "halfBoardOfferPrice",
    "fullBoardPrice",
    "fullBoardOfferPrice",
    "allIncludedPrice",
    "allIncludedOfferPrice",
    "currency",
    "vat",
    "offerText",
    "monthlyPrice",
    "salePrice",
    "images",
    "hotelImages",
    "bookingURL",
    "saleURL",
    "bookingLSURL",
    "detailsURL",
    "features",
    "checkInCheckOutInfo",
    "description",
    "descriptionMultiLanguage",
    "titleMultiLanguage",
    "reviews",
    "labels"
})
public class AccommodationData {

    @XmlElement(name = "AccommodationCode", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger accommodationCode;
    @XmlElement(name = "UserCode", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger userCode;
    @XmlElement(name = "LoginGA", required = true)
    protected String loginGA;
    @XmlElement(name = "GACode", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger gaCode;
    @XmlElement(name = "AccommodationName", required = true)
    protected String accommodationName;
    @XmlElement(name = "IdGallery", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger idGallery;
    @XmlElement(name = "OccupationalRuleId", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger occupationalRuleId;
    @XmlElement(name = "PriceModifierId", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger priceModifierId;
    @XmlElement(name = "TouristicRegistrationNumber")
    protected String touristicRegistrationNumber;
    @XmlElement(name = "Purpose", required = true)
    protected String purpose;
    @XmlElement(name = "UserKind", required = true)
    protected String userKind;
    @XmlElement(name = "MasterKind", required = true)
    protected MasterKind masterKind;
    @XmlElement(name = "HotelFeatures")
    protected HotelFeatures hotelFeatures;
    @XmlElement(name = "LocalizationData", required = true)
    protected LocalizationData localizationData;
    @XmlElement(name = "IsAvailable", required = true)
    protected Available isAvailable;
    @XmlElement(name = "AccommodationUnits")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger accommodationUnits;
    @XmlElement(name = "RoomOnlyPrice")
    protected Float roomOnlyPrice;
    @XmlElement(name = "RoomOnlyOfferPrice")
    protected Float roomOnlyOfferPrice;
    @XmlElement(name = "BedAndBreakfastPrice")
    protected Float bedAndBreakfastPrice;
    @XmlElement(name = "BedAndBreakfastOfferPrice")
    protected Float bedAndBreakfastOfferPrice;
    @XmlElement(name = "HalfBoardPrice")
    protected Float halfBoardPrice;
    @XmlElement(name = "HalfBoardOfferPrice")
    protected Float halfBoardOfferPrice;
    @XmlElement(name = "FullBoardPrice")
    protected Float fullBoardPrice;
    @XmlElement(name = "FullBoardOfferPrice")
    protected Float fullBoardOfferPrice;
    @XmlElement(name = "AllIncludedPrice")
    protected Float allIncludedPrice;
    @XmlElement(name = "AllIncludedOfferPrice")
    protected Float allIncludedOfferPrice;
    @XmlElement(name = "Currency")
    protected String currency;
    @XmlElement(name = "VAT")
    protected VAT vat;
    @XmlElement(name = "OfferText")
    protected String offerText;
    @XmlElement(name = "MonthlyPrice")
    protected Float monthlyPrice;
    @XmlElement(name = "SalePrice")
    protected Float salePrice;
    @XmlElement(name = "Images", required = true)
    protected Images images;
    @XmlElement(name = "HotelImages")
    protected Images hotelImages;
    @XmlElement(name = "BookingURL")
    protected String bookingURL;
    @XmlElement(name = "SaleURL")
    protected String saleURL;
    @XmlElement(name = "BookingLSURL")
    protected String bookingLSURL;
    @XmlElement(name = "DetailsURL", required = true)
    protected String detailsURL;
    @XmlElement(name = "Features", required = true)
    protected Features features;
    @XmlElement(name = "CheckInCheckOutInfo", required = true)
    protected CheckInCheckOutInfo checkInCheckOutInfo;
    @XmlElement(name = "Description", required = true)
    protected String description;
    @XmlElement(name = "DescriptionMultiLanguage")
    protected DescriptionMultiLanguage descriptionMultiLanguage;
    @XmlElement(name = "TitleMultiLanguage")
    protected TitleMultiLanguage titleMultiLanguage;
    @XmlElement(name = "Reviews")
    protected Reviews reviews;
    @XmlElement(name = "Labels")
    protected Labels labels;

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
     * Obtiene el valor de la propiedad gaCode.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGACode() {
        return gaCode;
    }

    /**
     * Define el valor de la propiedad gaCode.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGACode(BigInteger value) {
        this.gaCode = value;
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
     * Obtiene el valor de la propiedad occupationalRuleId.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOccupationalRuleId() {
        return occupationalRuleId;
    }

    /**
     * Define el valor de la propiedad occupationalRuleId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOccupationalRuleId(BigInteger value) {
        this.occupationalRuleId = value;
    }

    /**
     * Obtiene el valor de la propiedad priceModifierId.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPriceModifierId() {
        return priceModifierId;
    }

    /**
     * Define el valor de la propiedad priceModifierId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPriceModifierId(BigInteger value) {
        this.priceModifierId = value;
    }

    /**
     * Obtiene el valor de la propiedad touristicRegistrationNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTouristicRegistrationNumber() {
        return touristicRegistrationNumber;
    }

    /**
     * Define el valor de la propiedad touristicRegistrationNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTouristicRegistrationNumber(String value) {
        this.touristicRegistrationNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad purpose.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurpose() {
        return purpose;
    }

    /**
     * Define el valor de la propiedad purpose.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurpose(String value) {
        this.purpose = value;
    }

    /**
     * Obtiene el valor de la propiedad userKind.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserKind() {
        return userKind;
    }

    /**
     * Define el valor de la propiedad userKind.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserKind(String value) {
        this.userKind = value;
    }

    /**
     * Obtiene el valor de la propiedad masterKind.
     * 
     * @return
     *     possible object is
     *     {@link MasterKind }
     *     
     */
    public MasterKind getMasterKind() {
        return masterKind;
    }

    /**
     * Define el valor de la propiedad masterKind.
     * 
     * @param value
     *     allowed object is
     *     {@link MasterKind }
     *     
     */
    public void setMasterKind(MasterKind value) {
        this.masterKind = value;
    }

    /**
     * Obtiene el valor de la propiedad hotelFeatures.
     * 
     * @return
     *     possible object is
     *     {@link HotelFeatures }
     *     
     */
    public HotelFeatures getHotelFeatures() {
        return hotelFeatures;
    }

    /**
     * Define el valor de la propiedad hotelFeatures.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelFeatures }
     *     
     */
    public void setHotelFeatures(HotelFeatures value) {
        this.hotelFeatures = value;
    }

    /**
     * Obtiene el valor de la propiedad localizationData.
     * 
     * @return
     *     possible object is
     *     {@link LocalizationData }
     *     
     */
    public LocalizationData getLocalizationData() {
        return localizationData;
    }

    /**
     * Define el valor de la propiedad localizationData.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalizationData }
     *     
     */
    public void setLocalizationData(LocalizationData value) {
        this.localizationData = value;
    }

    /**
     * Obtiene el valor de la propiedad isAvailable.
     * 
     * @return
     *     possible object is
     *     {@link Available }
     *     
     */
    public Available getIsAvailable() {
        return isAvailable;
    }

    /**
     * Define el valor de la propiedad isAvailable.
     * 
     * @param value
     *     allowed object is
     *     {@link Available }
     *     
     */
    public void setIsAvailable(Available value) {
        this.isAvailable = value;
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
     * Obtiene el valor de la propiedad roomOnlyPrice.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getRoomOnlyPrice() {
        return roomOnlyPrice;
    }

    /**
     * Define el valor de la propiedad roomOnlyPrice.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setRoomOnlyPrice(Float value) {
        this.roomOnlyPrice = value;
    }

    /**
     * Obtiene el valor de la propiedad roomOnlyOfferPrice.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getRoomOnlyOfferPrice() {
        return roomOnlyOfferPrice;
    }

    /**
     * Define el valor de la propiedad roomOnlyOfferPrice.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setRoomOnlyOfferPrice(Float value) {
        this.roomOnlyOfferPrice = value;
    }

    /**
     * Obtiene el valor de la propiedad bedAndBreakfastPrice.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getBedAndBreakfastPrice() {
        return bedAndBreakfastPrice;
    }

    /**
     * Define el valor de la propiedad bedAndBreakfastPrice.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setBedAndBreakfastPrice(Float value) {
        this.bedAndBreakfastPrice = value;
    }

    /**
     * Obtiene el valor de la propiedad bedAndBreakfastOfferPrice.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getBedAndBreakfastOfferPrice() {
        return bedAndBreakfastOfferPrice;
    }

    /**
     * Define el valor de la propiedad bedAndBreakfastOfferPrice.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setBedAndBreakfastOfferPrice(Float value) {
        this.bedAndBreakfastOfferPrice = value;
    }

    /**
     * Obtiene el valor de la propiedad halfBoardPrice.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getHalfBoardPrice() {
        return halfBoardPrice;
    }

    /**
     * Define el valor de la propiedad halfBoardPrice.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setHalfBoardPrice(Float value) {
        this.halfBoardPrice = value;
    }

    /**
     * Obtiene el valor de la propiedad halfBoardOfferPrice.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getHalfBoardOfferPrice() {
        return halfBoardOfferPrice;
    }

    /**
     * Define el valor de la propiedad halfBoardOfferPrice.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setHalfBoardOfferPrice(Float value) {
        this.halfBoardOfferPrice = value;
    }

    /**
     * Obtiene el valor de la propiedad fullBoardPrice.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getFullBoardPrice() {
        return fullBoardPrice;
    }

    /**
     * Define el valor de la propiedad fullBoardPrice.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setFullBoardPrice(Float value) {
        this.fullBoardPrice = value;
    }

    /**
     * Obtiene el valor de la propiedad fullBoardOfferPrice.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getFullBoardOfferPrice() {
        return fullBoardOfferPrice;
    }

    /**
     * Define el valor de la propiedad fullBoardOfferPrice.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setFullBoardOfferPrice(Float value) {
        this.fullBoardOfferPrice = value;
    }

    /**
     * Obtiene el valor de la propiedad allIncludedPrice.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getAllIncludedPrice() {
        return allIncludedPrice;
    }

    /**
     * Define el valor de la propiedad allIncludedPrice.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setAllIncludedPrice(Float value) {
        this.allIncludedPrice = value;
    }

    /**
     * Obtiene el valor de la propiedad allIncludedOfferPrice.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getAllIncludedOfferPrice() {
        return allIncludedOfferPrice;
    }

    /**
     * Define el valor de la propiedad allIncludedOfferPrice.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setAllIncludedOfferPrice(Float value) {
        this.allIncludedOfferPrice = value;
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

    /**
     * Obtiene el valor de la propiedad vat.
     * 
     * @return
     *     possible object is
     *     {@link VAT }
     *     
     */
    public VAT getVAT() {
        return vat;
    }

    /**
     * Define el valor de la propiedad vat.
     * 
     * @param value
     *     allowed object is
     *     {@link VAT }
     *     
     */
    public void setVAT(VAT value) {
        this.vat = value;
    }

    /**
     * Obtiene el valor de la propiedad offerText.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferText() {
        return offerText;
    }

    /**
     * Define el valor de la propiedad offerText.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferText(String value) {
        this.offerText = value;
    }

    /**
     * Obtiene el valor de la propiedad monthlyPrice.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMonthlyPrice() {
        return monthlyPrice;
    }

    /**
     * Define el valor de la propiedad monthlyPrice.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMonthlyPrice(Float value) {
        this.monthlyPrice = value;
    }

    /**
     * Obtiene el valor de la propiedad salePrice.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSalePrice() {
        return salePrice;
    }

    /**
     * Define el valor de la propiedad salePrice.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSalePrice(Float value) {
        this.salePrice = value;
    }

    /**
     * Obtiene el valor de la propiedad images.
     * 
     * @return
     *     possible object is
     *     {@link Images }
     *     
     */
    public Images getImages() {
        return images;
    }

    /**
     * Define el valor de la propiedad images.
     * 
     * @param value
     *     allowed object is
     *     {@link Images }
     *     
     */
    public void setImages(Images value) {
        this.images = value;
    }

    /**
     * Obtiene el valor de la propiedad hotelImages.
     * 
     * @return
     *     possible object is
     *     {@link Images }
     *     
     */
    public Images getHotelImages() {
        return hotelImages;
    }

    /**
     * Define el valor de la propiedad hotelImages.
     * 
     * @param value
     *     allowed object is
     *     {@link Images }
     *     
     */
    public void setHotelImages(Images value) {
        this.hotelImages = value;
    }

    /**
     * Obtiene el valor de la propiedad bookingURL.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingURL() {
        return bookingURL;
    }

    /**
     * Define el valor de la propiedad bookingURL.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingURL(String value) {
        this.bookingURL = value;
    }

    /**
     * Obtiene el valor de la propiedad saleURL.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaleURL() {
        return saleURL;
    }

    /**
     * Define el valor de la propiedad saleURL.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaleURL(String value) {
        this.saleURL = value;
    }

    /**
     * Obtiene el valor de la propiedad bookingLSURL.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingLSURL() {
        return bookingLSURL;
    }

    /**
     * Define el valor de la propiedad bookingLSURL.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingLSURL(String value) {
        this.bookingLSURL = value;
    }

    /**
     * Obtiene el valor de la propiedad detailsURL.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetailsURL() {
        return detailsURL;
    }

    /**
     * Define el valor de la propiedad detailsURL.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetailsURL(String value) {
        this.detailsURL = value;
    }

    /**
     * Obtiene el valor de la propiedad features.
     * 
     * @return
     *     possible object is
     *     {@link Features }
     *     
     */
    public Features getFeatures() {
        return features;
    }

    /**
     * Define el valor de la propiedad features.
     * 
     * @param value
     *     allowed object is
     *     {@link Features }
     *     
     */
    public void setFeatures(Features value) {
        this.features = value;
    }

    /**
     * Obtiene el valor de la propiedad checkInCheckOutInfo.
     * 
     * @return
     *     possible object is
     *     {@link CheckInCheckOutInfo }
     *     
     */
    public CheckInCheckOutInfo getCheckInCheckOutInfo() {
        return checkInCheckOutInfo;
    }

    /**
     * Define el valor de la propiedad checkInCheckOutInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckInCheckOutInfo }
     *     
     */
    public void setCheckInCheckOutInfo(CheckInCheckOutInfo value) {
        this.checkInCheckOutInfo = value;
    }

    /**
     * Obtiene el valor de la propiedad description.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Define el valor de la propiedad description.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Obtiene el valor de la propiedad descriptionMultiLanguage.
     * 
     * @return
     *     possible object is
     *     {@link DescriptionMultiLanguage }
     *     
     */
    public DescriptionMultiLanguage getDescriptionMultiLanguage() {
        return descriptionMultiLanguage;
    }

    /**
     * Define el valor de la propiedad descriptionMultiLanguage.
     * 
     * @param value
     *     allowed object is
     *     {@link DescriptionMultiLanguage }
     *     
     */
    public void setDescriptionMultiLanguage(DescriptionMultiLanguage value) {
        this.descriptionMultiLanguage = value;
    }

    /**
     * Obtiene el valor de la propiedad titleMultiLanguage.
     * 
     * @return
     *     possible object is
     *     {@link TitleMultiLanguage }
     *     
     */
    public TitleMultiLanguage getTitleMultiLanguage() {
        return titleMultiLanguage;
    }

    /**
     * Define el valor de la propiedad titleMultiLanguage.
     * 
     * @param value
     *     allowed object is
     *     {@link TitleMultiLanguage }
     *     
     */
    public void setTitleMultiLanguage(TitleMultiLanguage value) {
        this.titleMultiLanguage = value;
    }

    /**
     * Obtiene el valor de la propiedad reviews.
     * 
     * @return
     *     possible object is
     *     {@link Reviews }
     *     
     */
    public Reviews getReviews() {
        return reviews;
    }

    /**
     * Define el valor de la propiedad reviews.
     * 
     * @param value
     *     allowed object is
     *     {@link Reviews }
     *     
     */
    public void setReviews(Reviews value) {
        this.reviews = value;
    }

    /**
     * Obtiene el valor de la propiedad labels.
     * 
     * @return
     *     possible object is
     *     {@link Labels }
     *     
     */
    public Labels getLabels() {
        return labels;
    }

    /**
     * Define el valor de la propiedad labels.
     * 
     * @param value
     *     allowed object is
     *     {@link Labels }
     *     
     */
    public void setLabels(Labels value) {
        this.labels = value;
    }

}
