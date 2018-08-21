
package ru.naztrans.elcom.webclientclasses;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for createCategoryResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createCategoryResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://service.elcom.naztrans.ru/}resultDTO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createCategoryResponse", propOrder = {
    "_return"
})
public class CreateCategoryResponse {

    @XmlElement(name = "return")
    protected ResultDTO _return;

    /**
     * Gets the value of the return property.
     *
     * @return
     *     possible object is
     *     {@link ResultDTO }
     *
     */
    public ResultDTO getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     *
     * @param value
     *     allowed object is
     *     {@link ResultDTO }
     *     
     */
    public void setReturn(ResultDTO value) {
        this._return = value;
    }

}
