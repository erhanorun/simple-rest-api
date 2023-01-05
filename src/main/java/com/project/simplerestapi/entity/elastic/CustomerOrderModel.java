package com.project.simplerestapi.entity.elastic;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Document(indexName = "customer_order")
public class CustomerOrderModel {
    @Id
    private Integer order_id;
    @Field(type = FieldType.Text, analyzer = "custom_analyzer")
    private String order_name;
    private double order_price;

    public CustomerOrderModel(Integer id, String name, double price) {
        this.order_id = id;
        this.order_name = name;
        this.order_price = price;
    }

    public Integer getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Integer order_id) {
        this.order_id = order_id;
    }

    public String getOrder_name() {
        return order_name;
    }

    public void setOrder_name(String order_name) {
        this.order_name = order_name;
    }

    public double getOrder_price() {
        return order_price;
    }

    public void setOrder_price(double order_price) {
        this.order_price = order_price;
    }
}
