//package com.ecp.ecommerceproject.model;
//
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
//
//import com.ecp.ecommerceproject.domain.entity.MyUser;
//
//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.OneToOne;
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//import lombok.ToString;
//
//@Entity
//@EnableAutoConfiguration
//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
//@ToString
//public class MyUserDetails {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @OneToOne
//    @JoinColumn(name = "myUserId", referencedColumnName = "id")
//    private MyUser myUser;
//
//    @Column
//    private String firstName;
//    @Column
//    private String lastName;
//    @Column
//    private String address;
//    @Column
//    private String city;
//    @Column
//    private String zipcode;
//    @Column
//    private Long phoneNumber;
//
//
//
//}
