package com.ecp.ecommerceproject.model;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import java.time.LocalDate;



@Entity
@EnableAutoConfiguration
public class Opinion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="productid")
    private Long productid;
    @Column
    private String title;
    @Column
    private String body;
    @Column
    private LocalDate posted;
    @Column
    private String author;

//    @ManyToOne
//    @JoinColumn
//    private User user;

    @ManyToOne
    @JoinColumn
    private Product product;

    @Column
    private double rating;
    

    public String getAuthor() {
        return author;
    }

    public void SetAuthor(String author) {
        this.author = author;
    }
     public Long getProductid() {
        return productid;
    }

    public void SetProductid(Long productid) {
        this.productid = productid;
    }
    public String getTitle() {
        return title;
    }

    public void SetTitle(String title) {
        this.title = title;
    }
    public Long getId() {
        return id;
    }
    public double getRating() {
        return rating;
    }

    public void SetRating(double rating) {
        this.rating = rating;
    }
    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

//    public User getUsers() {
//        return user;
//    }

//    public void setUser(User user) {
//        this.user = user;
//    }

    public LocalDate getPosted() {
        return posted;
    }

    public void setPosted(LocalDate posted) {
        this.posted = posted;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
