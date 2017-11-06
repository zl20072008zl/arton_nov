//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.11 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.10.28 时间 03:38:22 PM EDT
//


package com.somoplay.artonexpress.ups.shipping.IF;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ContactsType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="ContactsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ForwardAgent" type="{}ForwardAgentType" minOccurs="0"/&gt;
 *         &lt;element name="UltimateConsignee" type="{}UltimateConsigneeType" minOccurs="0"/&gt;
 *         &lt;element name="IntermediateConsignee" type="{}IntermediateConsigneeType" minOccurs="0"/&gt;
 *         &lt;element name="Producer" type="{}ProducerType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactsType", propOrder = {
    "forwardAgent",
    "ultimateConsignee",
    "intermediateConsignee",
    "producer"
})
public class ContactsType {

    @XmlElement(name = "ForwardAgent")
    protected ForwardAgentType forwardAgent;
    @XmlElement(name = "UltimateConsignee")
    protected UltimateConsigneeType ultimateConsignee;
    @XmlElement(name = "IntermediateConsignee")
    protected IntermediateConsigneeType intermediateConsignee;
    @XmlElement(name = "Producer")
    protected ProducerType producer;

    /**
     * 获取forwardAgent属性的值。
     *
     * @return
     *     possible object is
     *     {@link ForwardAgentType }
     *
     */
    public ForwardAgentType getForwardAgent() {
        return forwardAgent;
    }

    /**
     * 设置forwardAgent属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link ForwardAgentType }
     *
     */
    public void setForwardAgent(ForwardAgentType value) {
        this.forwardAgent = value;
    }

    /**
     * 获取ultimateConsignee属性的值。
     *
     * @return
     *     possible object is
     *     {@link UltimateConsigneeType }
     *
     */
    public UltimateConsigneeType getUltimateConsignee() {
        return ultimateConsignee;
    }

    /**
     * 设置ultimateConsignee属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link UltimateConsigneeType }
     *
     */
    public void setUltimateConsignee(UltimateConsigneeType value) {
        this.ultimateConsignee = value;
    }

    /**
     * 获取intermediateConsignee属性的值。
     *
     * @return
     *     possible object is
     *     {@link IntermediateConsigneeType }
     *
     */
    public IntermediateConsigneeType getIntermediateConsignee() {
        return intermediateConsignee;
    }

    /**
     * 设置intermediateConsignee属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link IntermediateConsigneeType }
     *
     */
    public void setIntermediateConsignee(IntermediateConsigneeType value) {
        this.intermediateConsignee = value;
    }

    /**
     * 获取producer属性的值。
     *
     * @return
     *     possible object is
     *     {@link ProducerType }
     *
     */
    public ProducerType getProducer() {
        return producer;
    }

    /**
     * 设置producer属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link ProducerType }
     *
     */
    public void setProducer(ProducerType value) {
        this.producer = value;
    }

}
