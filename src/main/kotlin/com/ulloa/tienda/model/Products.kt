package com.ulloa.tienda.model

import javax.persistence.*

    @Entity
    @Table(name = "products")
    class Products {
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Id
        @Column(updatable = false)
        var id: Long? = null

        var description: String? = null
}