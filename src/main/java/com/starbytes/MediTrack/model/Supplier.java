package com.starbytes.MediTrack.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
//@Data
@NoArgsConstructor
@AllArgsConstructor
public class Supplier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int rating;
    private String responseTime;
    private String deliveryPerformance;
    private String priceCompetitiveness;
    private double onTimeDelivery;
    private String emailId;
    private Long phoneNumber;
    private String category;
    private String status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getResponseTime() {
        return responseTime;
    }

    public void setResponseTime(String responseTime) {
        this.responseTime = responseTime;
    }

    public String getDeliveryPerformance() {
        return deliveryPerformance;
    }

    public void setDeliveryPerformance(String deliveryPerformance) {
        this.deliveryPerformance = deliveryPerformance;
    }

    public String getPriceCompetitiveness() {
        return priceCompetitiveness;
    }

    public void setPriceCompetitiveness(String priceCompetitiveness) {
        this.priceCompetitiveness = priceCompetitiveness;
    }

    public double getOnTimeDelivery() {
        return onTimeDelivery;
    }

    public void setOnTimeDelivery(double onTimeDelivery) {
        this.onTimeDelivery = onTimeDelivery;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
