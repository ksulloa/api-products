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
        @PostMapping
        fun save(@RequestBody products: Products):Products{
            return productsService.save(products)
        }
        @PutMapping
        fun update(@RequestBody products: Products):Products{
            return  productsService.update(products)

        }
        @PatchMapping
        fun updateDescription(@RequestBody products: Products):Products{
            return  productsService.updateDescription(products)

        }
        @DeleteMapping("/delete/{id}")
        fun delete (@PathVariable("id") id: Long):Boolean{
            return productsService.delete(id)

        }

    }