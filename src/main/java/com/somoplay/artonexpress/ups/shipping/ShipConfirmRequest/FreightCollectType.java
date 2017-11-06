//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.11 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.10.28 时间 03:38:23 PM EDT
//


package com.somoplay.artonexpress.ups.shipping.ShipConfirmRequest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>FreightCollectType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="FreightCollectType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BillReceiver" type="{}BillReceiverType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FreightCollectType", propOrder = {
    "billReceiver"
})
public class FreightCollectType {

    @XmlElement(name = "BillReceiver", required = true)
    protected BillReceiverType billReceiver;

    /**
     * 获取billReceiver属性的值。
     *
     * @return
     *     possible object is
     *     {@link BillReceiverType }
     *
     */
    public BillReceiverType getBillReceiver() {
        return billReceiver;
    }

    /**
     * 设置billReceiver属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link BillReceiverType }
     *
     */
    public void setBillReceiver(BillReceiverType value) {
        this.billReceiver = value;
    }

}
