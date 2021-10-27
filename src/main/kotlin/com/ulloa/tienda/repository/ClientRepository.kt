package com.ulloa.tienda.repository

import com.ulloa.tienda.model.Client
import org.springframework.data.jpa.repository.JpaRepository

interface ClientRepository: JpaRepository<Client, Long> {
}