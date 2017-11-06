//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.11 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.10.28 时间 03:38:23 PM EDT
//


package com.somoplay.artonexpress.ups.shipping.ShipConfirmRequest;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>LabelSpecificationType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="LabelSpecificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LabelPrintMethod" type="{}LabelPrintMethodCodeDescriptionType"/&gt;
 *         &lt;element name="HTTPUserAgent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LabelStockSize" type="{}LabelStockSizeType" minOccurs="0"/&gt;
 *         &lt;element name="LabelImageFormat" type="{}LabelImageFormatCodeDescriptionType"/&gt;
 *         &lt;element name="Instruction" type="{}InstructionCodeDescriptionType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CharacterSet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LabelSpecificationType", propOrder = {
    "labelPrintMethod",
    "httpUserAgent",
    "labelStockSize",
    "labelImageFormat",
    "instruction",
    "characterSet"
})
public class LabelSpecificationType {

    @XmlElement(name = "LabelPrintMethod", required = true)
    protected LabelPrintMethodCodeDescriptionType labelPrintMethod;
    @XmlElement(name = "HTTPUserAgent")
    protected String httpUserAgent;
    @XmlElement(name = "LabelStockSize")
    protected LabelStockSizeType labelStockSize;
    @XmlElement(name = "LabelImageFormat", required = true)
    protected LabelImageFormatCodeDescriptionType labelImageFormat;
    @XmlElement(name = "Instruction")
    protected List<InstructionCodeDescriptionType> instruction;
    @XmlElement(name = "CharacterSet")
    protected String characterSet;

    /**
     * 获取labelPrintMethod属性的值。
     *
     * @return
     *     possible object is
     *     {@link LabelPrintMethodCodeDescriptionType }
     *
     */
    public LabelPrintMethodCodeDescriptionType getLabelPrintMethod() {
        return labelPrintMethod;
    }

    /**
     * 设置labelPrintMethod属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link LabelPrintMethodCodeDescriptionType }
     *
     */
    public void setLabelPrintMethod(LabelPrintMethodCodeDescriptionType value) {
        this.labelPrintMethod = value;
    }

    /**
     * 获取httpUserAgent属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getHTTPUserAgent() {
        return httpUserAgent;
    }

    /**
     * 设置httpUserAgent属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setHTTPUserAgent(String value) {
        this.httpUserAgent = value;
    }

    /**
     * 获取labelStockSize属性的值。
     *
     * @return
     *     possible object is
     *     {@link LabelStockSizeType }
     *
     */
    public LabelStockSizeType getLabelStockSize() {
        return labelStockSize;
    }

    /**
     * 设置labelStockSize属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link LabelStockSizeType }
     *
     */
    public void setLabelStockSize(LabelStockSizeType value) {
        this.labelStockSize = value;
    }

    /**
     * 获取labelImageFormat属性的值。
     *
     * @return
     *     possible object is
     *     {@link LabelImageFormatCodeDescriptionType }
     *
     */
    public LabelImageFormatCodeDescriptionType getLabelImageFormat() {
        return labelImageFormat;
    }

    /**
     * 设置labelImageFormat属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link LabelImageFormatCodeDescriptionType }
     *
     */
    public void setLabelImageFormat(LabelImageFormatCodeDescriptionType value) {
        this.labelImageFormat = value;
    }

    /**
     * Gets the value of the instruction property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the instruction property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstruction().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstructionCodeDescriptionType }
     *
     *
     */
    public List<InstructionCodeDescriptionType> getInstruction() {
        if (instruction == null) {
            instruction = new ArrayList<InstructionCodeDescriptionType>();
        }
        return this.instruction;
    }

    /**
     * 获取characterSet属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCharacterSet() {
        return characterSet;
    }

    /**
     * 设置characterSet属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCharacterSet(String value) {
        this.characterSet = value;
    }

}
