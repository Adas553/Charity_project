package pl.coderslab.charity.donation;

import org.springframework.format.annotation.DateTimeFormat;
import pl.coderslab.charity.category.Category;
import pl.coderslab.charity.institution.Institution;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class DonationDto {

    private long id = 0L;

    @NotNull
    @Positive
    private Integer quantity;

    @NotEmpty
    private List<Long> categoryList = new ArrayList<>();

    @NotNull
    @Positive
    private Long institution;

    @NotBlank
    private String street;

    @NotBlank
    private String city;

    @NotBlank
    private String zipCode;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @NotNull
    private LocalDate pickUpDate;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @NotNull
    private LocalTime pickUpTime;

    private String pickUpComment;

    public DonationDto() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public List<Long> getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(List<Long> categoryList) {
        this.categoryList = categoryList;
    }

    public Long getInstitution() {
        return institution;
    }

    public void setInstitution(Long institution) {
        this.institution = institution;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public LocalDate getPickUpDate() {
        return pickUpDate;
    }

    public void setPickUpDate(LocalDate pickUpDate) {
        this.pickUpDate = pickUpDate;
    }

    public LocalTime getPickUpTime() {
        return pickUpTime;
    }

    public void setPickUpTime(LocalTime pickUpTime) {
        this.pickUpTime = pickUpTime;
    }

    public String getPickUpComment() {
        return pickUpComment;
    }

    public void setPickUpComment(String pickUpComment) {
        this.pickUpComment = pickUpComment;
    }
}
