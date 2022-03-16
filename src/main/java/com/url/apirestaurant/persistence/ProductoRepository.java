package com.url.apirestaurant.persistence;

import com.url.apirestaurant.persistence.crud.ProductoCrudRepository;
import com.url.apirestaurant.persistence.entity.Producto;

import java.util.List;

public class ProductoRepository {
    private ProductoCrudRepository productoCrudRepository;

    public List<Producto> getAll() {
        return (List<Producto>) productoCrudRepository.findAll();
    }
}
