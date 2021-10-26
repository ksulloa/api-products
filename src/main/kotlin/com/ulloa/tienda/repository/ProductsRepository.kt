package com.ulloa.tienda.repository

import com.ulloa.tienda.model.Products
import org.springframework.data.jpa.repository.JpaRepository

interface ProductsRepository: JpaRepository<Products, Long> {
}