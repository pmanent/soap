//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.04.15 a las 06:28:31 PM CEST 
//


package com.soap.consumer.domain;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para InternationalizedAccommodation complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="InternationalizedAccommodation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Language" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DetailsURL" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="BookingURL" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MasterKind" type="{ws.avantio.com/crsConnectionServices}MasterKind"/&gt;
 *         &lt;element name="Country" type="{ws.avantio.com/crsConnectionServices}SimpleCountry"/&gt;
 *         &lt;element name="Region" type="{ws.avantio.com/crsConnectionServices}SimpleRegion"/&gt;
 *         &lt;element name="Area" type="{ws.avantio.com/crsConnectionServices}AreaDist" maxOccurs="unbounded"/&gt;
 *         &lt;element name="City" type="{ws.avantio.com/crsConnectionServices}SimpleCity"/&gt;
 *         &lt;element name="Locality" type="{ws.avantio.com/crsConnectionServices}SimpleLocality"/&gt;
 *         &lt;element name="District" type="{ws.avantio.com/crsConnectionServices}District"/&gt;
 *         &lt;element name="ExtrasSummary" type="{ws.avantio.com/crsConnectionServices}ExtrasSummary"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ManualDescription" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="GalleryDescription" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AccommodationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InternationalizedAccommodation", propOrder = {
    "language",
    "detailsURL",
    "bookingURL",
    "masterKind",
    "country",
    "region",
    "area",
    "city",
    "locality",
    "district",
    "extrasSummary",
    "description",
    "manualDescription",
    "galleryDescription",
    "accommodationName"
})
public class InternationalizedAccommodation {

    @XmlElement(name = "Language", required = true)
    protected String language;
    @XmlElement(name = "DetailsURL", required = true)
    protected String detailsURL;
    @XmlElement(name = "BookingURL", required = true)
    protected String bookingURL;
    @XmlElement(name = "MasterKind", required = true)
    protected MasterKind masterKind;
    @XmlElement(name = "Country", required = true)
    protected SimpleCountry country;
    @XmlElement(name = "Region", required = true)
    protected SimpleRegion region;
    @XmlElement(name = "Area", required = true)
    protected List<AreaDist> area;
    @XmlElement(name = "City", required = true)
    protected SimpleCity city;
    @XmlElement(name = "Locality", required = true)
    protected SimpleLocality locality;
    @XmlElement(name = "District", required = true)
    protected District district;
    @XmlElement(name = "ExtrasSummary", required = true)
    protected ExtrasSummary extrasSummary;
    @XmlElement(name = "Description", required = true)
    protected String description;
    @XmlElement(name = "ManualDescription")
    protected Boolean manualDescription;
    @XmlElement(name = "GalleryDescription", required = true)
    protected String galleryDescription;
    @XmlElement(name = "AccommodationName")
    protected String accommodationName;

    /**
     * Obtiene el valor de la propiedad language.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Define el valor de la propiedad language.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
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
     * Obtiene el valor de la propiedad country.
     * 
     * @return
     *     possible object is
     *     {@link SimpleCountry }
     *     
     */
    public SimpleCountry getCountry() {
        return country;
    }

    /**
     * Define el valor de la propiedad country.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleCountry }
     *     
     */
    public void setCountry(SimpleCountry value) {
        this.country = value;
    }

    /**
     * Obtiene el valor de la propiedad region.
     * 
     * @return
     *     possible object is
     *     {@link SimpleRegion }
     *     
     */
    public SimpleRegion getRegion() {
        return region;
    }

    /**
     * Define el valor de la propiedad region.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleRegion }
     *     
     */
    public void setRegion(SimpleRegion value) {
        this.region = value;
    }

    /**
     * Gets the value of the area property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the area property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArea().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AreaDist }
     * 
     * 
     */
    public List<AreaDist> getArea() {
        if (area == null) {
            area = new ArrayList<AreaDist>();
        }
        return this.area;
    }

    /**
     * Obtiene el valor de la propiedad city.
     * 
     * @return
     *     possible object is
     *     {@link SimpleCity }
     *     
     */
    public SimpleCity getCity() {
        return city;
    }

    /**
     * Define el valor de la propiedad city.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleCity }
     *     
     */
    public void setCity(SimpleCity value) {
        this.city = value;
    }

    /**
     * Obtiene el valor de la propiedad locality.
     * 
     * @return
     *     possible object is
     *     {@link SimpleLocality }
     *     
     */
    public SimpleLocality getLocality() {
        return locality;
    }

    /**
     * Define el valor de la propiedad locality.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleLocality }
     *     
     */
    public void setLocality(SimpleLocality value) {
        this.locality = value;
    }

    /**
     * Obtiene el valor de la propiedad district.
     * 
     * @return
     *     possible object is
     *     {@link District }
     *     
     */
    public District getDistrict() {
        return district;
    }

    /**
     * Define el valor de la propiedad district.
     * 
     * @param value
     *     allowed object is
     *     {@link District }
     *     
     */
    public void setDistrict(District value) {
        this.district = value;
    }

    /**
     * Obtiene el valor de la propiedad extrasSummary.
     * 
     * @return
     *     possible object is
     *     {@link ExtrasSummary }
     *     
     */
    public ExtrasSummary getExtrasSummary() {
        return extrasSummary;
    }

    /**
     * Define el valor de la propiedad extrasSummary.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtrasSummary }
     *     
     */
    public void setExtrasSummary(ExtrasSummary value) {
        this.extrasSummary = value;
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
     * Obtiene el valor de la propiedad manualDescription.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isManualDescription() {
        return manualDescription;
    }

    /**
     * Define el valor de la propiedad manualDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setManualDescription(Boolean value) {
        this.manualDescription = value;
    }

    /**
     * Obtiene el valor de la propiedad galleryDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGalleryDescription() {
        return galleryDescription;
    }

    /**
     * Define el valor de la propiedad galleryDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGalleryDescription(String value) {
        this.galleryDescription = value;
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

}
