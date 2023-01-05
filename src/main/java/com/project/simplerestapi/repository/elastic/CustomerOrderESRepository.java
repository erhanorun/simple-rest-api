package com.project.simplerestapi.repository.elastic;

import com.project.simplerestapi.entity.elastic.CustomerOrderModel;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerOrderESRepository extends ElasticsearchRepository<CustomerOrderModel, Integer> {
}
