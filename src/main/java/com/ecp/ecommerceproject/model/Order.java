package com.ecp.ecommerceproject.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import com.ecp.ecommerceproject.enums.OrderStatus;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@EnableAutoConfiguration
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    @Column
    private String customerID;
    @Column
    private LocalDate dateOrdered;
    @Column
    private LocalDate dateSent;
    @Column
    private double price;
    @Column
    @OneToMany(mappedBy = "orderId")
    private List<ItemOrder> orderedItem;
    @Column
    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus;
    @Column
    private String shippingAddress;


}
