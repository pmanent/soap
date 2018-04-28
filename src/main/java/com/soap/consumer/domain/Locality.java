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
 * <p>Clase Java para Locality complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Locality"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LocalityCode" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Districts" type="{ws.avantio.com/crsConnectionServices}DistrictList"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Locality", propOrder = {
    "localityCode",
    "name",
    "districts"
})
public class Locality {

    @XmlElement(name = "LocalityCode", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger localityCode;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Districts", required = true)
    protected DistrictList districts;

    /**
     * Obtiene el valor de la propiedad localityCode.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLocalityCode() {
        return localityCode;
    }

    /**
     * Define el valor de la propiedad localityCode.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLocalityCode(BigInteger value) {
        this.localityCode = value;
    }

    /**
     * Obtiene el valor de la propiedad name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Define el valor de la propiedad name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtiene el valor de la propiedad districts.
     * 
     * @return
     *     possible object is
     *     {@link DistrictList }
     *     
     */
    public DistrictList getDistricts() {
        return districts;
    }

    /**
     * Define el valor de la propiedad districts.
     * 
     * @param value
     *     allowed object is
     *     {@link DistrictList }
     *     
     */
    public void setDistricts(DistrictList value) {
        this.districts = value;
    }

}
