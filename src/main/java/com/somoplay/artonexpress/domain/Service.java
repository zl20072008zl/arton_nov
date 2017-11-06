package com.somoplay.artonexpress.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

/**
 * A Service.
 */
@Entity
@Table(name = "service")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Service implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "created_date")
    private LocalDate createdDate;

    @Column(name = "updated_date")
    private LocalDate updatedDate;

    @Column(name = "company")
    private String company;

    @Column(name = "name")
    private String name;

    @Column(name = "code")
    private String code;

    @Column(name = "price", precision=10, scale=2)
    private BigDecimal price;

    @Column(name = "expected_delivery_date")
    private String expectedDeliveryDate;

    @Column(name = "expected_transit_time")
    private String expectedTransitTime;

    @Column(name = "jhi_user")
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

    public Service createdDate(LocalDate createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public LocalDate getUpdatedDate() {
        return updatedDate;
    }

    public Service updatedDate(LocalDate updatedDate) {
        this.updatedDate = updatedDate;
        return this;
    }

    public void setUpdatedDate(LocalDate updatedDate) {
        this.updatedDate = updatedDate;
    }

    public String getCompany() {
        return company;
    }

    public Service company(String company) {
        this.company = company;
        return this;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public Service name(String name) {
        this.name = name;
        return this;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public Service code(String code) {
        this.code = code;
        return this;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Service price(BigDecimal price) {
        this.price = price;
        return this;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getExpectedDeliveryDate() {
        return expectedDeliveryDate;
    }

    public Service expectedDeliveryDate(String expectedDeliveryDate) {
        this.expectedDeliveryDate = expectedDeliveryDate;
        return this;
    }

    public void setExpectedDeliveryDate(String expectedDeliveryDate) {
        this.expectedDeliveryDate = expectedDeliveryDate;
    }

    public String getExpectedTransitTime() {
        return expectedTransitTime;
    }

    public Service expectedTransitTime(String expectedTransitTime) {
        this.expectedTransitTime = expectedTransitTime;
        return this;
    }

    public void setExpectedTransitTime(String expectedTransitTime) {
        this.expectedTransitTime = expectedTransitTime;
    }

    public String getUser() {
        return user;
    }

    public Service user(String user) {
        this.user = user;
        return this;
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
        Service service = (Service) o;
        if (service.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), service.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "Service{" +
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
