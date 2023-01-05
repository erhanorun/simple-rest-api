package com.project.simplerestapi.entity.elastic;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Document(indexName = "customer")
public class CustomerModel {
    @Id
    private Integer customer_id;
    @Field(type = FieldType.Text, analyzer = "custom_analyzer")
    private String customer_name;
    private Integer customer_age;

    public CustomerModel(Integer id, String name, Integer age) {
        this.customer_id = id;
        this.customer_name = name;
        this.customer_age = age;
    }

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
