package com.deval.pizza.persistence.repository;

import com.deval.pizza.persistence.entity.OrderEntity;
import org.springframework.data.repository.ListCrudRepository;

public interface OrderRepository extends ListCrudRepository<OrderEntity, Integer> {

}
