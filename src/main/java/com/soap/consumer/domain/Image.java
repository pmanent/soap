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
 * <p>Clase Java para Image complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Image"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ImageId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Descriptions" type="{ws.avantio.com/crsConnectionServices}ImageDescriptions" minOccurs="0"/&gt;
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ThumbnailImageURL" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MediumImageURL" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AdaptedImageURL" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OriginalImageURL" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Image", propOrder = {
    "imageId",
    "name",
    "descriptions",
    "type",
    "thumbnailImageURL",
    "mediumImageURL",
    "adaptedImageURL",
    "originalImageURL"
})
public class Image {

    @XmlElement(name = "ImageId")
    protected String imageId;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Descriptions")
    protected ImageDescriptions descriptions;
    @XmlElement(name = "Type")
    protected String type;
    @XmlElement(name = "ThumbnailImageURL", required = true)
    protected String thumbnailImageURL;
    @XmlElement(name = "MediumImageURL", required = true)
    protected String mediumImageURL;
    @XmlElement(name = "AdaptedImageURL", required = true)
    protected String adaptedImageURL;
    @XmlElement(name = "OriginalImageURL", required = true)
    protected String originalImageURL;

    /**
     * Obtiene el valor de la propiedad imageId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageId() {
        return imageId;
    }

    /**
     * Define el valor de la propiedad imageId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageId(String value) {
        this.imageId = value;
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
     * Obtiene el valor de la propiedad descriptions.
     * 
     * @return
     *     possible object is
     *     {@link ImageDescriptions }
     *     
     */
    public ImageDescriptions getDescriptions() {
        return descriptions;
    }

    /**
     * Define el valor de la propiedad descriptions.
     * 
     * @param value
     *     allowed object is
     *     {@link ImageDescriptions }
     *     
     */
    public void setDescriptions(ImageDescriptions value) {
        this.descriptions = value;
    }

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
     * Obtiene el valor de la propiedad thumbnailImageURL.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThumbnailImageURL() {
        return thumbnailImageURL;
    }

    /**
     * Define el valor de la propiedad thumbnailImageURL.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThumbnailImageURL(String value) {
        this.thumbnailImageURL = value;
    }

    /**
     * Obtiene el valor de la propiedad mediumImageURL.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediumImageURL() {
        return mediumImageURL;
    }

    /**
     * Define el valor de la propiedad mediumImageURL.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediumImageURL(String value) {
        this.mediumImageURL = value;
    }

    /**
     * Obtiene el valor de la propiedad adaptedImageURL.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdaptedImageURL() {
        return adaptedImageURL;
    }

    /**
     * Define el valor de la propiedad adaptedImageURL.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdaptedImageURL(String value) {
        this.adaptedImageURL = value;
    }

    /**
     * Obtiene el valor de la propiedad originalImageURL.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalImageURL() {
        return originalImageURL;
    }

    /**
     * Define el valor de la propiedad originalImageURL.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalImageURL(String value) {
        this.originalImageURL = value;
    }

}
