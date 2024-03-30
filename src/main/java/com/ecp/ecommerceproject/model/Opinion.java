package com.ecp.ecommerceproject.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import java.time.LocalDate;

@Entity
@EnableAutoConfiguration
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
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
    

  
}
