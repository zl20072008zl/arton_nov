package com.somoplay.artonexpress.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

/**
 * A Promotion.
 */
@Entity
@Table(name = "promotion")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Promotion implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "created_date")
    private LocalDate createdDate;

    @Column(name = "updated_date")
    private LocalDate updatedDate;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "percentage_off")
    private Float percentageOff;

    @Column(name = "start_date")
    private LocalDate startDate;

    @Column(name = "expired_date")
    private LocalDate expiredDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public Promotion createdDate(LocalDate createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public LocalDate getUpdatedDate() {
        return updatedDate;
    }

    public Promotion updatedDate(LocalDate updatedDate) {
        this.updatedDate = updatedDate;
        return this;
    }

    public void setUpdatedDate(LocalDate updatedDate) {
        this.updatedDate = updatedDate;
    }

    public String getName() {
        return name;
    }

    public Promotion name(String name) {
        this.name = name;
        return this;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public Promotion description(String description) {
        this.description = description;
        return this;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Float getPercentageOff() {
        return percentageOff;
    }

    public Promotion percentageOff(Float percentageOff) {
        this.percentageOff = percentageOff;
        return this;
    }

    public void setPercentageOff(Float percentageOff) {
        this.percentageOff = percentageOff;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public Promotion startDate(LocalDate startDate) {
        this.startDate = startDate;
        return this;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getExpiredDate() {
        return expiredDate;
    }

    public Promotion expiredDate(LocalDate expiredDate) {
        this.expiredDate = expiredDate;
        return this;
    }

    public void setExpiredDate(LocalDate expiredDate) {
        this.expiredDate = expiredDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Promotion promotion = (Promotion) o;
        if (promotion.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), promotion.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "Promotion{" +
            "id=" + getId() +
            ", createdDate='" + getCreatedDate() + "'" +
            ", updatedDate='" + getUpdatedDate() + "'" +
            ", name='" + getName() + "'" +
            ", description='" + getDescription() + "'" +
            ", percentageOff='" + getPercentageOff() + "'" +
            ", startDate='" + getStartDate() + "'" +
            ", expiredDate='" + getExpiredDate() + "'" +
            "}";
    }
}
