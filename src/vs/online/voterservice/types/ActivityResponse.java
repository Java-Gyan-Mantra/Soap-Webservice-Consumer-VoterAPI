
package vs.online.voterservice.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="voteCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element ref="{http://www.online.vs/VoterService/types}VoterInfo" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "voteCount",
    "voterInfo"
})
@XmlRootElement(name = "ActivityResponse")
public class ActivityResponse {

    protected int voteCount;
    @XmlElement(name = "VoterInfo", namespace = "http://www.online.vs/VoterService/types", required = true)
    protected List<VoterInfo> voterInfo;

    /**
     * Gets the value of the voteCount property.
     * 
     */
    public int getVoteCount() {
        return voteCount;
    }

    /**
     * Sets the value of the voteCount property.
     * 
     */
    public void setVoteCount(int value) {
        this.voteCount = value;
    }

    /**
     * Gets the value of the voterInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the voterInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVoterInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VoterInfo }
     * 
     * 
     */
    public List<VoterInfo> getVoterInfo() {
        if (voterInfo == null) {
            voterInfo = new ArrayList<VoterInfo>();
        }
        return this.voterInfo;
    }

}
