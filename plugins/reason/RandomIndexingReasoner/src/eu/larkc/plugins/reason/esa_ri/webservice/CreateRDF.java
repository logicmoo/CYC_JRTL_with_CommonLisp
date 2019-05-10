
package eu.larkc.plugins.reason.esa_ri.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for createRDF complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createRDF">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tokens" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="radio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="radioNrOfResults" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createRDF", propOrder = {
    "tokens",
    "radio",
    "radioNrOfResults"
})
public class CreateRDF {

    protected String tokens;
    protected String radio;
    protected int radioNrOfResults;

    /**
     * Gets the value of the tokens property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTokens() {
        return tokens;
    }

    /**
     * Sets the value of the tokens property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTokens(String value) {
        this.tokens = value;
    }

    /**
     * Gets the value of the radio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRadio() {
        return radio;
    }

    /**
     * Sets the value of the radio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRadio(String value) {
        this.radio = value;
    }

    /**
     * Gets the value of the radioNrOfResults property.
     * 
     */
    public int getRadioNrOfResults() {
        return radioNrOfResults;
    }

    /**
     * Sets the value of the radioNrOfResults property.
     * 
     */
    public void setRadioNrOfResults(int value) {
        this.radioNrOfResults = value;
    }

}
