package pl.coderslab.charity.donation;

import org.springframework.format.annotation.DateTimeFormat;
import pl.coderslab.charity.category.Category;
import pl.coderslab.charity.institution.Institution;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Donation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private int quantity;

    @ManyToMany
    private List<Category> categoryList = new ArrayList<>();

    @ManyToOne
    private Institution institution;

    private String street;

    private String city;

    private String zipCode;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate pickUpDate;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalTime pickUpTime;

    private String pickUpComment;

    public Donation() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public List<Category> getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(List<Category> categoryList) {
        this.categoryList = categoryList;
    }

    public Institution getInstitution() {
        return institution;
    }

    public void setInstitution(Institution institution) {
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
