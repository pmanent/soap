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
 * <p>Clase Java para SwimmingPool complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SwimmingPool"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PoolType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Dimensions" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MinimumDepth" type="{ws.avantio.com/crsConnectionServices}Distance"/&gt;
 *         &lt;element name="MaximumDepth" type="{ws.avantio.com/crsConnectionServices}Distance"/&gt;
 *         &lt;element name="OpeningDate" type="{ws.avantio.com/crsConnectionServices}GeneralDate"/&gt;
 *         &lt;element name="ClosingDate" type="{ws.avantio.com/crsConnectionServices}GeneralDate"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SwimmingPool", propOrder = {
    "poolType",
    "dimensions",
    "minimumDepth",
    "maximumDepth",
    "openingDate",
    "closingDate"
})
public class SwimmingPool {

    @XmlElement(name = "PoolType", required = true)
    protected String poolType;
    @XmlElement(name = "Dimensions", required = true)
    protected String dimensions;
    @XmlElement(name = "MinimumDepth", required = true)
    protected Distance minimumDepth;
    @XmlElement(name = "MaximumDepth", required = true)
    protected Distance maximumDepth;
    @XmlElement(name = "OpeningDate", required = true)
    protected GeneralDate openingDate;
    @XmlElement(name = "ClosingDate", required = true)
    protected GeneralDate closingDate;

    /**
     * Obtiene el valor de la propiedad poolType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoolType() {
        return poolType;
    }

    /**
     * Define el valor de la propiedad poolType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoolType(String value) {
        this.poolType = value;
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

}
