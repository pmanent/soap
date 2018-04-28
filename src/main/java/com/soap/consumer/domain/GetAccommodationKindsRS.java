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
 * <p>Clase Java para GetAccommodationKindsRS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GetAccommodationKindsRS"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InternationalizedKinds" type="{ws.avantio.com/crsConnectionServices}InternationalizedKinds" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetAccommodationKindsRS", propOrder = {
    "internationalizedKinds"
})
public class GetAccommodationKindsRS {

    @XmlElement(name = "InternationalizedKinds", required = true)
    protected List<InternationalizedKinds> internationalizedKinds;

    /**
     * Gets the value of the internationalizedKinds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the internationalizedKinds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInternationalizedKinds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InternationalizedKinds }
     * 
     * 
     */
    public List<InternationalizedKinds> getInternationalizedKinds() {
        if (internationalizedKinds == null) {
            internationalizedKinds = new ArrayList<InternationalizedKinds>();
        }
        return this.internationalizedKinds;
    }

}
