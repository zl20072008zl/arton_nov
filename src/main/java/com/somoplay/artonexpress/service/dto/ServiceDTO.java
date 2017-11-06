package com.somoplay.artonexpress.service.dto;


import java.time.LocalDate;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

/**
 * A DTO for the Service entity.
 */
public class ServiceDTO implements Serializable {

    private Long id;

    private LocalDate createdDate;

    private LocalDate updatedDate;

    private String company;

    private String name;

    private String code;

    private BigDecimal price;

    private String expectedDeliveryDate;

    private String expectedTransitTime;

    private String user;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public LocalDate getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(LocalDate updatedDate) {
        this.updatedDate = updatedDate;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getExpectedDeliveryDate() {
        return expectedDeliveryDate;
    }

    public void setExpectedDeliveryDate(String expectedDeliveryDate) {
        this.expectedDeliveryDate = expectedDeliveryDate;
    }

    public String getExpectedTransitTime() {
        return expectedTransitTime;
    }

    public void setExpectedTransitTime(String expectedTransitTime) {
        this.expectedTransitTime = expectedTransitTime;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        ServiceDTO serviceDTO = (ServiceDTO) o;
        if(serviceDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), serviceDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "ServiceDTO{" +
            "id=" + getId() +
            ", createdDate='" + getCreatedDate() + "'" +
            ", updatedDate='" + getUpdatedDate() + "'" +
            ", company='" + getCompany() + "'" +
            ", name='" + getName() + "'" +
            ", code='" + getCode() + "'" +
            ", price='" + getPrice() + "'" +
            ", expectedDeliveryDate='" + getExpectedDeliveryDate() + "'" +
            ", expectedTransitTime='" + getExpectedTransitTime() + "'" +
            ", user='" + getUser() + "'" +
            "}";
    }
}
