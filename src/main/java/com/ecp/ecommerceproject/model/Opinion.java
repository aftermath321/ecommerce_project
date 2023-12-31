package com.ecp.ecommerceproject.model;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import java.time.LocalDateTime;



@Entity
@EnableAutoConfiguration
public class Opinion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String body;

    @Column
    private LocalDateTime posted;
//
//    @ManyToOne
//    @JoinColumn
//    private User user;

    @ManyToOne
    @JoinColumn
    private Product product;

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

    public LocalDateTime getPosted() {
        return posted;
    }

    public void setPosted(LocalDateTime posted) {
        this.posted = posted;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
