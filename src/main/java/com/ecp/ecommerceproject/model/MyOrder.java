//package com.ecp.ecommerceproject.model;
//
//import java.time.LocalDate;
//import java.util.List;
//
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
//
//import com.ecp.ecommerceproject.domain.entity.MyUser;
//import com.ecp.ecommerceproject.enums.OrderStatus;
//import com.fasterxml.jackson.annotation.JsonIgnore;
//
//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.EnumType;
//import jakarta.persistence.Enumerated;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.ManyToOne;
//import jakarta.persistence.OneToMany;
//import lombok.AllArgsConstructor;
//import lombok.Builder;
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
//@Builder
//public class MyOrder {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long orderId;
//
//    @Column
//    private LocalDate dateOrdered;
//    @Column
//    private LocalDate dateSent;
//    @Column
//    private double price;
//
//    @Column
//    @Enumerated(EnumType.STRING)
//    private OrderStatus orderStatus;
//    @Column
//    private String shippingAddress;
//
//    @OneToMany(mappedBy = "orderId")
//    @JsonIgnore
//    private List<ItemOrder> itemsOrdered;
//
//    @ManyToOne
//    @JoinColumn(name = "orders")
//    private MyUser customerId;
//
//
//}
