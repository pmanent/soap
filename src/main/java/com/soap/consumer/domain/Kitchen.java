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
 * <p>Clase Java para Kitchen complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Kitchen"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="KitchenClass" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="KitchenType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="NumberOfKitchens" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="Fridge" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Freezer" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="WashingMachine" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Dishwasher" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Dryer" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="CoffeeMachine" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Fryer" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Toaster" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="TableWare" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="KitchenUtensils" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Microwave" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Oven" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Kitchen", propOrder = {
    "kitchenClass",
    "kitchenType",
    "numberOfKitchens",
    "fridge",
    "freezer",
    "washingMachine",
    "dishwasher",
    "dryer",
    "coffeeMachine",
    "fryer",
    "toaster",
    "tableWare",
    "kitchenUtensils",
    "microwave",
    "oven"
})
public class Kitchen {

    @XmlElement(name = "KitchenClass", required = true)
    protected String kitchenClass;
    @XmlElement(name = "KitchenType", required = true)
    protected String kitchenType;
    @XmlElement(name = "NumberOfKitchens")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfKitchens;
    @XmlElement(name = "Fridge")
    protected boolean fridge;
    @XmlElement(name = "Freezer")
    protected boolean freezer;
    @XmlElement(name = "WashingMachine")
    protected boolean washingMachine;
    @XmlElement(name = "Dishwasher")
    protected boolean dishwasher;
    @XmlElement(name = "Dryer")
    protected boolean dryer;
    @XmlElement(name = "CoffeeMachine")
    protected boolean coffeeMachine;
    @XmlElement(name = "Fryer")
    protected boolean fryer;
    @XmlElement(name = "Toaster")
    protected boolean toaster;
    @XmlElement(name = "TableWare")
    protected boolean tableWare;
    @XmlElement(name = "KitchenUtensils")
    protected boolean kitchenUtensils;
    @XmlElement(name = "Microwave")
    protected boolean microwave;
    @XmlElement(name = "Oven")
    protected boolean oven;

    /**
     * Obtiene el valor de la propiedad kitchenClass.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKitchenClass() {
        return kitchenClass;
    }

    /**
     * Define el valor de la propiedad kitchenClass.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKitchenClass(String value) {
        this.kitchenClass = value;
    }

    /**
     * Obtiene el valor de la propiedad kitchenType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKitchenType() {
        return kitchenType;
    }

    /**
     * Define el valor de la propiedad kitchenType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKitchenType(String value) {
        this.kitchenType = value;
    }

    /**
     * Obtiene el valor de la propiedad numberOfKitchens.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfKitchens() {
        return numberOfKitchens;
    }

    /**
     * Define el valor de la propiedad numberOfKitchens.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfKitchens(BigInteger value) {
        this.numberOfKitchens = value;
    }

    /**
     * Obtiene el valor de la propiedad fridge.
     * 
     */
    public boolean isFridge() {
        return fridge;
    }

    /**
     * Define el valor de la propiedad fridge.
     * 
     */
    public void setFridge(boolean value) {
        this.fridge = value;
    }

    /**
     * Obtiene el valor de la propiedad freezer.
     * 
     */
    public boolean isFreezer() {
        return freezer;
    }

    /**
     * Define el valor de la propiedad freezer.
     * 
     */
    public void setFreezer(boolean value) {
        this.freezer = value;
    }

    /**
     * Obtiene el valor de la propiedad washingMachine.
     * 
     */
    public boolean isWashingMachine() {
        return washingMachine;
    }

    /**
     * Define el valor de la propiedad washingMachine.
     * 
     */
    public void setWashingMachine(boolean value) {
        this.washingMachine = value;
    }

    /**
     * Obtiene el valor de la propiedad dishwasher.
     * 
     */
    public boolean isDishwasher() {
        return dishwasher;
    }

    /**
     * Define el valor de la propiedad dishwasher.
     * 
     */
    public void setDishwasher(boolean value) {
        this.dishwasher = value;
    }

    /**
     * Obtiene el valor de la propiedad dryer.
     * 
     */
    public boolean isDryer() {
        return dryer;
    }

    /**
     * Define el valor de la propiedad dryer.
     * 
     */
    public void setDryer(boolean value) {
        this.dryer = value;
    }

    /**
     * Obtiene el valor de la propiedad coffeeMachine.
     * 
     */
    public boolean isCoffeeMachine() {
        return coffeeMachine;
    }

    /**
     * Define el valor de la propiedad coffeeMachine.
     * 
     */
    public void setCoffeeMachine(boolean value) {
        this.coffeeMachine = value;
    }

    /**
     * Obtiene el valor de la propiedad fryer.
     * 
     */
    public boolean isFryer() {
        return fryer;
    }

    /**
     * Define el valor de la propiedad fryer.
     * 
     */
    public void setFryer(boolean value) {
        this.fryer = value;
    }

    /**
     * Obtiene el valor de la propiedad toaster.
     * 
     */
    public boolean isToaster() {
        return toaster;
    }

    /**
     * Define el valor de la propiedad toaster.
     * 
     */
    public void setToaster(boolean value) {
        this.toaster = value;
    }

    /**
     * Obtiene el valor de la propiedad tableWare.
     * 
     */
    public boolean isTableWare() {
        return tableWare;
    }

    /**
     * Define el valor de la propiedad tableWare.
     * 
     */
    public void setTableWare(boolean value) {
        this.tableWare = value;
    }

    /**
     * Obtiene el valor de la propiedad kitchenUtensils.
     * 
     */
    public boolean isKitchenUtensils() {
        return kitchenUtensils;
    }

    /**
     * Define el valor de la propiedad kitchenUtensils.
     * 
     */
    public void setKitchenUtensils(boolean value) {
        this.kitchenUtensils = value;
    }

    /**
     * Obtiene el valor de la propiedad microwave.
     * 
     */
    public boolean isMicrowave() {
        return microwave;
    }

    /**
     * Define el valor de la propiedad microwave.
     * 
     */
    public void setMicrowave(boolean value) {
        this.microwave = value;
    }

    /**
     * Obtiene el valor de la propiedad oven.
     * 
     */
    public boolean isOven() {
        return oven;
    }

    /**
     * Define el valor de la propiedad oven.
     * 
     */
    public void setOven(boolean value) {
        this.oven = value;
    }

}
