package com.enoca.simplerestapi.repository.elastic;

import com.enoca.simplerestapi.entity.elastic.CustomerOrderModel;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerOrderESRepository extends ElasticsearchRepository<CustomerOrderModel, Integer> {
}
