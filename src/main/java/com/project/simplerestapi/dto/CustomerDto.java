package com.project.simplerestapi.dto;

public class CustomerDto {
    private Integer customer_id;
    private String customer_name;
    private Integer customer_age;

    public Integer getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(Integer customer_id) {
        this.customer_id = customer_id;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public Integer getCustomer_age() {
        return customer_age;
    }

    public void setCustomer_age(Integer customer_age) {
        this.customer_age = customer_age;
    }
}
