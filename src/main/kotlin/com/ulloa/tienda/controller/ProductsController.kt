package com.ulloa.tienda.controller

import com.ulloa.tienda.model.Products
import com.ulloa.tienda.service.ProductsService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*


    @RestController
    @RequestMapping("/products")
    @CrossOrigin(methods = [RequestMethod.GET, RequestMethod.POST, RequestMethod.PATCH, RequestMethod.PUT])

    class ProductsController {
        @Autowired
        lateinit var productsService: ProductsService

        @GetMapping
        fun list(): List<Products>{
            return productsService.list()
        }

    }