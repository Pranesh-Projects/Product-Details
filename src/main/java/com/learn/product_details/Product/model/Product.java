package com.learn.product_details.Product.model;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "product_id")
    private int id;
    @Column(name = "product_name")
    private String name;
    @Column(name = "quantity")
    private int quantity;
    @Column(name = "price")
    private double price;
}
