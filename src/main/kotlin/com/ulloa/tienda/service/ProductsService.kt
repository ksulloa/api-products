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

        fun save(products: Products): Products {
            return productsRepository.save(products)
        }

        fun update(products: Products): Products {
            return productsRepository.save(products)

        }

        fun updateDescription (products: Products):Products {
            val response = productsRepository.findById(products.id)
                ?: throw Exception()
            response.apply {
                this.description=products.description
            }
            return productsRepository.save(response)
        }
        fun delete (id:Long): Boolean{
            productsRepository.deleteById(id)
            return true
    }
    }