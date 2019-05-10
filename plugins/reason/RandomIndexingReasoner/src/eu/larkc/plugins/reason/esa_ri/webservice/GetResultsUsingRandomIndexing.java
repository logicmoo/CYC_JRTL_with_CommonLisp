
package eu.larkc.plugins.reason.esa_ri.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getResultsUsingRandomIndexing complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getResultsUsingRandomIndexing">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tokens" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getResultsUsingRandomIndexing", propOrder = {
    "tokens"
})
public class GetResultsUsingRandomIndexing {

    protected String tokens;

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

}
