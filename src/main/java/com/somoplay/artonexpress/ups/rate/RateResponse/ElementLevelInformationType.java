//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.11 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.10.28 时间 03:47:50 PM EDT
//


package com.somoplay.artonexpress.ups.rate.RateResponse;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ElementLevelInformationType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="ElementLevelInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Level" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ElementIdentifier" type="{}ElementIdentifierType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElementLevelInformationType", propOrder = {
    "level",
    "elementIdentifier"
})
public class ElementLevelInformationType {

    @XmlElement(name = "Level", required = true)
    protected String level;
    @XmlElement(name = "ElementIdentifier")
    protected List<ElementIdentifierType> elementIdentifier;

    /**
     * 获取level属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLevel() {
        return level;
    }

    /**
     * 设置level属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLevel(String value) {
        this.level = value;
    }

    /**
     * Gets the value of the elementIdentifier property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the elementIdentifier property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElementIdentifier().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ElementIdentifierType }
     *
     *
     */
    public List<ElementIdentifierType> getElementIdentifier() {
        if (elementIdentifier == null) {
            elementIdentifier = new ArrayList<ElementIdentifierType>();
        }
        return this.elementIdentifier;
    }

}
