package com.ecp.ecommerceproject.model;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import java.time.LocalDate;
import java.util.List;

@Entity
@EnableAutoConfiguration
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;
    @Column
    private String producer;
    @Column
    private LocalDate released;
    @Column
    private double price;
    @Column
    private double rating;
    @Column
    private String imagePath;
    @Column
    private String description;

    @OneToMany(mappedBy = "product")
    private List<Opinion> opinions;

    public List<Opinion> getOpinions() {
        return opinions;
    }

    public void setOpinions(List<Opinion> opinions) {
        this.opinions = opinions;
    }

    public Product() {
    }

    public Product(Long id, String name, String producer, LocalDate released, double price, double rating, String imagePath, String description) {
        this.id = id;
        this.name = name;
        this.producer = producer;
        this.released = released;
        this.price = price;
        this.rating = rating;
        this.imagePath = imagePath;
        this.description = description;
    }

    public Product(String name, String producer, LocalDate released, double price, double rating, String imagePath, String description) {
        this.name = name;
        this.producer = producer;
        this.released = released;
        this.price = price;
        this.rating = rating;
        this.imagePath = imagePath;
        this.description = description;
    }

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

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public LocalDate getReleased() {
        return released;
    }

    public void setReleased(LocalDate released) {
        this.released = released;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", producer='" + producer + '\'' +
                ", released=" + released +
                ", price=" + price +
                ", rating=" + rating +
                ", imagePath='" + imagePath + '\'' +
                '}';
    }
}
