package com.ecp.ecommerceproject.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.AccessLevel;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.time.LocalDate;
import java.util.List;

@Entity
@EnableAutoConfiguration
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
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
    @Transient
    @Getter(AccessLevel.NONE)
    private double rating;
    @Column
    private String imagePath;
    @Column
    private String description;
    @Column
    private Long quantityAvailable;
    

    @OneToMany(mappedBy = "product")
    private List<Opinion> opinions;
    
    @OneToMany(mappedBy = "product")
    @JsonIgnore
    private List<ItemOrder> productsOrdered;


    public Double getRating (){
        if (opinions != null && !opinions.isEmpty()){
            double totalRating = 0.0;
            for (Opinion opinion : opinions){
                totalRating += opinion.getRating();
            }
            return totalRating/opinions.size();
        }
        return 0.0;
    }
    

}
