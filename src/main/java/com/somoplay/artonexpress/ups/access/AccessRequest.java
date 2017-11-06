//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.11 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.10.28 时间 03:16:31 PM EDT
//


package com.somoplay.artonexpress.ups.access;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AccessLicenseNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="UserId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "accessLicenseNumber",
    "userId",
    "password"
})
@XmlRootElement(name = "AccessRequest")
public class AccessRequest {

    @XmlElement(name = "AccessLicenseNumber", required = true)
    protected String accessLicenseNumber;
    @XmlElement(name = "UserId", required = true)
    protected String userId;
    @XmlElement(name = "Password", required = true)
    protected String password;

    /**
     * 获取accessLicenseNumber属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAccessLicenseNumber() {
        return accessLicenseNumber;
    }

    /**
     * 设置accessLicenseNumber属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAccessLicenseNumber(String value) {
        this.accessLicenseNumber = value;
    }

    /**
     * 获取userId属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置userId属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUserId(String value) {
        this.userId = value;
    }

    /**
     * 获取password属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置password属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPassword(String value) {
        this.password = value;
    }

}
