//package com.ecp.ecommerceproject.domain.entity;
//
//import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//import lombok.ToString;
//import lombok.AccessLevel;
//
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
//
//import com.ecp.ecommerceproject.domain.valueobjects.Image;
//import com.ecp.ecommerceproject.domain.valueobjects.Money;
//import com.ecp.ecommerceproject.domain.valueobjects.Producer;
//import com.ecp.ecommerceproject.domain.valueobjects.Rating;
//import com.ecp.ecommerceproject.model.ItemOrder;
//import com.fasterxml.jackson.annotation.JsonIgnore;
//
//import java.time.LocalDate;
//import java.util.List;
//
//
//@Entity
//@EnableAutoConfiguration
//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
//@ToString
//public class Product {
//
//    @Id
//    @Column(nullable = false)
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @Column(nullable = false)
//    private String name;
//
//    @Column(nullable = false)
//    private Producer producer;
//
//    @Column(nullable = false)
//    private LocalDate released;
//
//    @Column(nullable = false)
//    @Embedded
//    private Money price;
//
//    @Transient
//    @Getter(AccessLevel.NONE)
//    @Embedded
//    private Rating rating;
//
//    @Column
//    private Image imagePath;
//
//    @Column
//    private String description;
//
//    @Column (nullable = false)
//    private Long quantityAvailable;
//
//
//    @OneToMany(mappedBy = "product")
//    private List<Opinion> opinions;
//
//    @OneToMany(mappedBy = "product")
//    private List<ItemOrder> productsOrdered;
//
//
//    public Rating getRating (){
//
//        if (opinions != null && !opinions.isEmpty()){
//            Rating totalRating = new Rating(0.0);
//            double temp = 0.0;
//
//            for (Opinion opinion : opinions){
//                temp += opinion.getRating();
//            }
//
//            temp = temp/opinions.size();
//            totalRating.parseDouble(temp);
//        }
//        return new Rating(0.0);
//    }
//
//
//}
