package com.url.apirestaurant.persistence.crud;

import com.url.apirestaurant.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {
}
