package com.ulloa.tienda.service

import com.ulloa.tienda.model.Products
import com.ulloa.tienda.repository.ProductsRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service


    @Service
    class ProductsService {
        @Autowired
        lateinit var productsRepository: ProductsRepository


        fun list(): List<Products> {

            return productsRepository.findAll()
        }
}