package com.ulloa.tienda.repository

import com.ulloa.tienda.model.Client
import com.ulloa.tienda.model.Products
import org.springframework.data.jpa.repository.JpaRepository

interface ClientRepository: JpaRepository<Client, Long> {
    fun findById(id: Long?): Client?
}