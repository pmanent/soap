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
 * <p>Clase Java para Towels complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Towels"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="IncludedInPrice" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="AdditionalPrice" type="{ws.avantio.com/crsConnectionServices}Price" minOccurs="0"/&gt;
 *         &lt;element name="MaxPrice" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="MinPrice" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="PayTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Application" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Comparison" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ComparisonValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Countable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="CountableLimit" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ChangeTowels" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ChangeFrequency" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
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
@XmlType(name = "Towels", propOrder = {
    "type",
    "includedInPrice",
    "additionalPrice",
    "maxPrice",
    "minPrice",
    "payTime",
    "application",
    "comparison",
    "comparisonValue",
    "countable",
    "countableLimit",
    "changeTowels",
    "changeFrequency",
    "season",
    "description",
    "vat"
})
public class Towels {

    @XmlElement(name = "Type", required = true)
    protected String type;
    @XmlElement(name = "IncludedInPrice")
    protected boolean includedInPrice;
    @XmlElement(name = "AdditionalPrice")
    protected Price additionalPrice;
    @XmlElement(name = "MaxPrice")
    protected Float maxPrice;
    @XmlElement(name = "MinPrice")
    protected Float minPrice;
    @XmlElement(name = "PayTime")
    protected String payTime;
    @XmlElement(name = "Application", required = true)
    protected String application;
    @XmlElement(name = "Comparison")
    protected String comparison;
    @XmlElement(name = "ComparisonValue")
    protected String comparisonValue;
    @XmlElement(name = "Countable")
    protected boolean countable;
    @XmlElement(name = "CountableLimit")
    protected int countableLimit;
    @XmlElement(name = "ChangeTowels")
    protected boolean changeTowels;
    @XmlElement(name = "ChangeFrequency")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger changeFrequency;
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
     *     {@link String }
     *     
     */
    public String getComparisonValue() {
        return comparisonValue;
    }

    /**
     * Define el valor de la propiedad comparisonValue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComparisonValue(String value) {
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
     * Obtiene el valor de la propiedad changeTowels.
     * 
     */
    public boolean isChangeTowels() {
        return changeTowels;
    }

    /**
     * Define el valor de la propiedad changeTowels.
     * 
     */
    public void setChangeTowels(boolean value) {
        this.changeTowels = value;
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
