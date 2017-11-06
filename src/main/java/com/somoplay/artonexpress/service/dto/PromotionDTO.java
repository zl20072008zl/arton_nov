package com.somoplay.artonexpress.service.dto;


import java.time.LocalDate;
import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the Promotion entity.
 */
public class PromotionDTO implements Serializable {

    private Long id;

    private LocalDate createdDate;

    private LocalDate updatedDate;

    private String name;

    private String description;

    private Float percentageOff;

    private LocalDate startDate;

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

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public LocalDate getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(LocalDate updatedDate) {
        this.updatedDate = updatedDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Float getPercentageOff() {
        return percentageOff;
    }

    public void setPercentageOff(Float percentageOff) {
        this.percentageOff = percentageOff;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getExpiredDate() {
        return expiredDate;
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

        PromotionDTO promotionDTO = (PromotionDTO) o;
        if(promotionDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), promotionDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "PromotionDTO{" +
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
