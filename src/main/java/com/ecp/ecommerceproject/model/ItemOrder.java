package com.ecp.ecommerceproject.model;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import com.ecp.ecommerceproject.domain.entity.Product;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
public class ItemOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long itemOrderId;

    private Long quantity;

    @ManyToOne
    @JoinColumn(name = "productsOrdered")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "itemsOrdered")
    private MyOrder orderId;

}
