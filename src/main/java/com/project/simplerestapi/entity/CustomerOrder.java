package com.project.simplerestapi.entity;

import javax.persistence.*;

@Entity
public class CustomerOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id", unique = true, nullable = false)
    private Integer order_id;

    @Column(name = "order_name", nullable = false)
    private String order_name;

    @Column(name = "order_price", nullable = false)
    private double order_price;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;


    public CustomerOrder() {
    }

    public CustomerOrder(Integer id, String name, double price, Customer customer) {
        super();
        this.order_id = id;
        this.order_name = name;
        this.order_price = price;
        this.customer = customer;
    }


    public Integer getId() {
        return order_id;
    }

    public void setId(Integer id) {
        this.order_id = id;
    }

    public String getName() {
        return order_name;
    }

    public void setName(String order_name) {
        this.order_name = order_name;
    }

    public void setPrice(double order_price) {
        this.order_price = order_price;
    }

    public double getPrice() {
        return order_price;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

}
