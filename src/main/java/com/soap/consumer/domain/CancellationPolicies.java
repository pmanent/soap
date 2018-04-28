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
 * <p>Clase Java para CancellationPolicies complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CancellationPolicies"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CancellationPolicyList" type="{ws.avantio.com/crsConnectionServices}CancellationPolicyList"/&gt;
 *         &lt;element name="NoShow" type="{ws.avantio.com/crsConnectionServices}NoShow"/&gt;
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
@XmlType(name = "CancellationPolicies", propOrder = {
    "description",
    "cancellationPolicyList",
    "noShow",
    "currency"
})
public class CancellationPolicies {

    @XmlElement(name = "Description", required = true)
    protected String description;
    @XmlElement(name = "CancellationPolicyList", required = true)
    protected CancellationPolicyList cancellationPolicyList;
    @XmlElement(name = "NoShow", required = true)
    protected NoShow noShow;
    @XmlElement(name = "Currency", required = true)
    protected String currency;

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
     * Obtiene el valor de la propiedad cancellationPolicyList.
     * 
     * @return
     *     possible object is
     *     {@link CancellationPolicyList }
     *     
     */
    public CancellationPolicyList getCancellationPolicyList() {
        return cancellationPolicyList;
    }

    /**
     * Define el valor de la propiedad cancellationPolicyList.
     * 
     * @param value
     *     allowed object is
     *     {@link CancellationPolicyList }
     *     
     */
    public void setCancellationPolicyList(CancellationPolicyList value) {
        this.cancellationPolicyList = value;
    }

    /**
     * Obtiene el valor de la propiedad noShow.
     * 
     * @return
     *     possible object is
     *     {@link NoShow }
     *     
     */
    public NoShow getNoShow() {
        return noShow;
    }

    /**
     * Define el valor de la propiedad noShow.
     * 
     * @param value
     *     allowed object is
     *     {@link NoShow }
     *     
     */
    public void setNoShow(NoShow value) {
        this.noShow = value;
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
