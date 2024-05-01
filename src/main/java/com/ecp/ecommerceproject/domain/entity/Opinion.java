//package com.ecp.ecommerceproject.domain.entity;
//
//import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//import lombok.ToString;
//
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
//
//import java.time.LocalDate;
//
//@Entity
//@EnableAutoConfiguration
//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
//@ToString
//public class Opinion {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @Column
//    private String title;
//    @Column
//    private String body;
//    @Column
//    private LocalDate posted;
//
//    @JoinColumn(name = "my_user")
//    @ManyToOne(fetch = FetchType.LAZY)
//    private MyUser my_user;
//
//    @ManyToOne
//    @JoinColumn(name = "product")
//    private Product product;
//
//    @Column
//    private double rating;
//
//}
