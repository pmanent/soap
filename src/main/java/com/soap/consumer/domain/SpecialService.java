//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.04.15 a las 06:28:31 PM CEST 
//


package com.soap.consumer.domain;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SpecialService complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SpecialService"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ParkingLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Allowed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LimitWeight" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element name="ChangeTowels" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ChangeBedClothes" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ChangeFrequency" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element name="Dimensions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MinimumDepth" type="{ws.avantio.com/crsConnectionServices}Distance" minOccurs="0"/&gt;
 *         &lt;element name="MaximumDepth" type="{ws.avantio.com/crsConnectionServices}Distance" minOccurs="0"/&gt;
 *         &lt;element name="OpeningDate" type="{ws.avantio.com/crsConnectionServices}GeneralDate" minOccurs="0"/&gt;
 *         &lt;element name="ClosingDate" type="{ws.avantio.com/crsConnectionServices}GeneralDate" minOccurs="0"/&gt;
 *         &lt;element name="PaymentMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaymentMethods" type="{ws.avantio.com/crsConnectionServices}PaymentMethods" minOccurs="0"/&gt;
 *         &lt;element name="DangerousPetsAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="IncludedInPrice" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="AdditionalPrice" type="{ws.avantio.com/crsConnectionServices}Price" minOccurs="0"/&gt;
 *         &lt;element name="AdditionalPriceChildren" type="{ws.avantio.com/crsConnectionServices}Price" minOccurs="0"/&gt;
 *         &lt;element name="ChildrenAgeLimit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MaxPrice" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="MinPrice" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="PayTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Application" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ApplicationLimit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ApplicationLimitType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Comparison" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ComparisonValue" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Countable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="CountableLimit" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Season" type="{ws.avantio.com/crsConnectionServices}Season" maxOccurs="unbounded"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="VAT" type="{ws.avantio.com/crsConnectionServices}VAT" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecialService", propOrder = {
    "type",
    "parkingLocation",
    "allowed",
    "limitWeight",
    "changeTowels",
    "changeBedClothes",
    "changeFrequency",
    "dimensions",
    "minimumDepth",
    "maximumDepth",
    "openingDate",
    "closingDate",
    "paymentMethod",
    "paymentMethods",
    "dangerousPetsAllowed",
    "code",
    "includedInPrice",
    "additionalPrice",
    "additionalPriceChildren",
    "childrenAgeLimit",
    "maxPrice",
    "minPrice",
    "payTime",
    "application",
    "applicationLimit",
    "applicationLimitType",
    "comparison",
    "comparisonValue",
    "countable",
    "countableLimit",
    "season",
    "description",
    "vat"
})
public class SpecialService {

    @XmlElement(name = "Type")
    protected String type;
    @XmlElement(name = "ParkingLocation")
    protected String parkingLocation;
    @XmlElement(name = "Allowed")
    protected String allowed;
    @XmlElement(name = "LimitWeight")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger limitWeight;
    @XmlElement(name = "ChangeTowels")
    protected Boolean changeTowels;
    @XmlElement(name = "ChangeBedClothes")
    protected Boolean changeBedClothes;
    @XmlElement(name = "ChangeFrequency")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger changeFrequency;
    @XmlElement(name = "Dimensions")
    protected String dimensions;
    @XmlElement(name = "MinimumDepth")
    protected Distance minimumDepth;
    @XmlElement(name = "MaximumDepth")
    protected Distance maximumDepth;
    @XmlElement(name = "OpeningDate")
    protected GeneralDate openingDate;
    @XmlElement(name = "ClosingDate")
    protected GeneralDate closingDate;
    @XmlElement(name = "PaymentMethod")
    protected String paymentMethod;
    @XmlElement(name = "PaymentMethods")
    protected PaymentMethods paymentMethods;
    @XmlElement(name = "DangerousPetsAllowed")
    protected Boolean dangerousPetsAllowed;
    @XmlElement(name = "Code")
    protected int code;
    @XmlElement(name = "IncludedInPrice")
    protected boolean includedInPrice;
    @XmlElement(name = "AdditionalPrice")
    protected Price additionalPrice;
    @XmlElement(name = "AdditionalPriceChildren")
    protected Price additionalPriceChildren;
    @XmlElement(name = "ChildrenAgeLimit")
    protected Integer childrenAgeLimit;
    @XmlElement(name = "MaxPrice")
    protected Float maxPrice;
    @XmlElement(name = "MinPrice")
    protected Float minPrice;
    @XmlElement(name = "PayTime")
    protected String payTime;
    @XmlElement(name = "Application", required = true)
    protected String application;
    @XmlElement(name = "ApplicationLimit")
    protected Integer applicationLimit;
    @XmlElement(name = "ApplicationLimitType")
    protected String applicationLimitType;
    @XmlElement(name = "Comparison")
    protected String comparison;
    @XmlElement(name = "ComparisonValue")
    protected Integer comparisonValue;
    @XmlElement(name = "Countable")
    protected boolean countable;
    @XmlElement(name = "CountableLimit")
    protected int countableLimit;
    @XmlElement(name = "Season", required = true)
    protected List<Season> season;
    @XmlElement(name = "Description", required = true)
    protected String description;
    @XmlElement(name = "VAT")
    protected VAT vat;

    /**
     * Obtiene el valor de la propiedad type.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Define el valor de la propiedad type.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Obtiene el valor de la propiedad parkingLocation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParkingLocation() {
        return parkingLocation;
    }

    /**
     * Define el valor de la propiedad parkingLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParkingLocation(String value) {
        this.parkingLocation = value;
    }

    /**
     * Obtiene el valor de la propiedad allowed.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllowed() {
        return allowed;
    }

    /**
     * Define el valor de la propiedad allowed.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllowed(String value) {
        this.allowed = value;
    }

    /**
     * Obtiene el valor de la propiedad limitWeight.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLimitWeight() {
        return limitWeight;
    }

    /**
     * Define el valor de la propiedad limitWeight.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLimitWeight(BigInteger value) {
        this.limitWeight = value;
    }

    /**
     * Obtiene el valor de la propiedad changeTowels.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChangeTowels() {
        return changeTowels;
    }

    /**
     * Define el valor de la propiedad changeTowels.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChangeTowels(Boolean value) {
        this.changeTowels = value;
    }

    /**
     * Obtiene el valor de la propiedad changeBedClothes.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChangeBedClothes() {
        return changeBedClothes;
    }

    /**
     * Define el valor de la propiedad changeBedClothes.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChangeBedClothes(Boolean value) {
        this.changeBedClothes = value;
    }

    /**
     * Obtiene el valor de la propiedad changeFrequency.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getChangeFrequency() {
        return changeFrequency;
    }

    /**
     * Define el valor de la propiedad changeFrequency.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setChangeFrequency(BigInteger value) {
        this.changeFrequency = value;
    }

    /**
     * Obtiene el valor de la propiedad dimensions.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDimensions() {
        return dimensions;
    }

    /**
     * Define el valor de la propiedad dimensions.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDimensions(String value) {
        this.dimensions = value;
    }

    /**
     * Obtiene el valor de la propiedad minimumDepth.
     * 
     * @return
     *     possible object is
     *     {@link Distance }
     *     
     */
    public Distance getMinimumDepth() {
        return minimumDepth;
    }

    /**
     * Define el valor de la propiedad minimumDepth.
     * 
     * @param value
     *     allowed object is
     *     {@link Distance }
     *     
     */
    public void setMinimumDepth(Distance value) {
        this.minimumDepth = value;
    }

    /**
     * Obtiene el valor de la propiedad maximumDepth.
     * 
     * @return
     *     possible object is
     *     {@link Distance }
     *     
     */
    public Distance getMaximumDepth() {
        return maximumDepth;
    }

    /**
     * Define el valor de la propiedad maximumDepth.
     * 
     * @param value
     *     allowed object is
     *     {@link Distance }
     *     
     */
    public void setMaximumDepth(Distance value) {
        this.maximumDepth = value;
    }

    /**
     * Obtiene el valor de la propiedad openingDate.
     * 
     * @return
     *     possible object is
     *     {@link GeneralDate }
     *     
     */
    public GeneralDate getOpeningDate() {
        return openingDate;
    }

    /**
     * Define el valor de la propiedad openingDate.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralDate }
     *     
     */
    public void setOpeningDate(GeneralDate value) {
        this.openingDate = value;
    }

    /**
     * Obtiene el valor de la propiedad closingDate.
     * 
     * @return
     *     possible object is
     *     {@link GeneralDate }
     *     
     */
    public GeneralDate getClosingDate() {
        return closingDate;
    }

    /**
     * Define el valor de la propiedad closingDate.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralDate }
     *     
     */
    public void setClosingDate(GeneralDate value) {
        this.closingDate = value;
    }

    /**
     * Obtiene el valor de la propiedad paymentMethod.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Define el valor de la propiedad paymentMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentMethod(String value) {
        this.paymentMethod = value;
    }

    /**
     * Obtiene el valor de la propiedad paymentMethods.
     * 
     * @return
     *     possible object is
     *     {@link PaymentMethods }
     *     
     */
    public PaymentMethods getPaymentMethods() {
        return paymentMethods;
    }

    /**
     * Define el valor de la propiedad paymentMethods.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentMethods }
     *     
     */
    public void setPaymentMethods(PaymentMethods value) {
        this.paymentMethods = value;
    }

    /**
     * Obtiene el valor de la propiedad dangerousPetsAllowed.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDangerousPetsAllowed() {
        return dangerousPetsAllowed;
    }

    /**
     * Define el valor de la propiedad dangerousPetsAllowed.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDangerousPetsAllowed(Boolean value) {
        this.dangerousPetsAllowed = value;
    }

    /**
     * Obtiene el valor de la propiedad code.
     * 
     */
    public int getCode() {
        return code;
    }

    /**
     * Define el valor de la propiedad code.
     * 
     */
    public void setCode(int value) {
        this.code = value;
    }

    /**
     * Obtiene el valor de la propiedad includedInPrice.
     * 
     */
    public boolean isIncludedInPrice() {
        return includedInPrice;
    }

    /**
     * Define el valor de la propiedad includedInPrice.
     * 
     */
    public void setIncludedInPrice(boolean value) {
        this.includedInPrice = value;
    }

    /**
     * Obtiene el valor de la propiedad additionalPrice.
     * 
     * @return
     *     possible object is
     *     {@link Price }
     *     
     */
    public Price getAdditionalPrice() {
        return additionalPrice;
    }

    /**
     * Define el valor de la propiedad additionalPrice.
     * 
     * @param value
     *     allowed object is
     *     {@link Price }
     *     
     */
    public void setAdditionalPrice(Price value) {
        this.additionalPrice = value;
    }

    /**
     * Obtiene el valor de la propiedad additionalPriceChildren.
     * 
     * @return
     *     possible object is
     *     {@link Price }
     *     
     */
    public Price getAdditionalPriceChildren() {
        return additionalPriceChildren;
    }

    /**
     * Define el valor de la propiedad additionalPriceChildren.
     * 
     * @param value
     *     allowed object is
     *     {@link Price }
     *     
     */
    public void setAdditionalPriceChildren(Price value) {
        this.additionalPriceChildren = value;
    }

    /**
     * Obtiene el valor de la propiedad childrenAgeLimit.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getChildrenAgeLimit() {
        return childrenAgeLimit;
    }

    /**
     * Define el valor de la propiedad childrenAgeLimit.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setChildrenAgeLimit(Integer value) {
        this.childrenAgeLimit = value;
    }

    /**
     * Obtiene el valor de la propiedad maxPrice.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMaxPrice() {
        return maxPrice;
    }

    /**
     * Define el valor de la propiedad maxPrice.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMaxPrice(Float value) {
        this.maxPrice = value;
    }

    /**
     * Obtiene el valor de la propiedad minPrice.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMinPrice() {
        return minPrice;
    }

    /**
     * Define el valor de la propiedad minPrice.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMinPrice(Float value) {
        this.minPrice = value;
    }

    /**
     * Obtiene el valor de la propiedad payTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayTime() {
        return payTime;
    }

    /**
     * Define el valor de la propiedad payTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayTime(String value) {
        this.payTime = value;
    }

    /**
     * Obtiene el valor de la propiedad application.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplication() {
        return application;
    }

    /**
     * Define el valor de la propiedad application.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplication(String value) {
        this.application = value;
    }

    /**
     * Obtiene el valor de la propiedad applicationLimit.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getApplicationLimit() {
        return applicationLimit;
    }

    /**
     * Define el valor de la propiedad applicationLimit.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setApplicationLimit(Integer value) {
        this.applicationLimit = value;
    }

    /**
     * Obtiene el valor de la propiedad applicationLimitType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationLimitType() {
        return applicationLimitType;
    }

    /**
     * Define el valor de la propiedad applicationLimitType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationLimitType(String value) {
        this.applicationLimitType = value;
    }

    /**
     * Obtiene el valor de la propiedad comparison.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComparison() {
        return comparison;
    }

    /**
     * Define el valor de la propiedad comparison.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComparison(String value) {
        this.comparison = value;
    }

    /**
     * Obtiene el valor de la propiedad comparisonValue.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getComparisonValue() {
        return comparisonValue;
    }

    /**
     * Define el valor de la propiedad comparisonValue.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setComparisonValue(Integer value) {
        this.comparisonValue = value;
    }

    /**
     * Obtiene el valor de la propiedad countable.
     * 
     */
    public boolean isCountable() {
        return countable;
    }

    /**
     * Define el valor de la propiedad countable.
     * 
     */
    public void setCountable(boolean value) {
        this.countable = value;
    }

    /**
     * Obtiene el valor de la propiedad countableLimit.
     * 
     */
    public int getCountableLimit() {
        return countableLimit;
    }

    /**
     * Define el valor de la propiedad countableLimit.
     * 
     */
    public void setCountableLimit(int value) {
        this.countableLimit = value;
    }

    /**
     * Gets the value of the season property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the season property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeason().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Season }
     * 
     * 
     */
    public List<Season> getSeason() {
        if (season == null) {
            season = new ArrayList<Season>();
        }
        return this.season;
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

}
