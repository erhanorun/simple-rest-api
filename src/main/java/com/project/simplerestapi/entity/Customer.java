package com.project.simplerestapi.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id", unique = true, nullable = false)
    private Integer customer_id;

    @Column(name = "customer_name", nullable = false)
    private String customer_name;

    @Column(name = "customer_age", nullable = false)
    private Integer customer_age;

    @OneToMany(mappedBy = "customer", fetch = FetchType.LAZY)
    private List<CustomerOrder> orders;

    public Customer(Integer id, String name, Integer age) {
        this.customer_id = id;
        this.customer_name = name;
        this.customer_age = age;
        orders = new ArrayList<>();
    }

    public Customer() {
    }

    public Integer getId() {
        return customer_id;
    }


    public String getName() {
        return customer_name;
    }


    public Integer getAge() {
        return customer_age;
    }

    public List<CustomerOrder> getOrders() {
        return orders;
    }

    public void setOrders(List<CustomerOrder> orders) {
        this.orders = orders;
    }

}
