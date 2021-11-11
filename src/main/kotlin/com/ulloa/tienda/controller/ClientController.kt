package com.ulloa.tienda.controller

import com.ulloa.tienda.model.Client
import com.ulloa.tienda.model.Products
import com.ulloa.tienda.service.ClientService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/client")
@CrossOrigin(methods = [RequestMethod.GET, RequestMethod.POST, RequestMethod.PATCH, RequestMethod.PUT])

class ClientController {
    @Autowired
    lateinit var clientService: ClientService

    @GetMapping
    fun list(): List<Client>{
        return clientService.list()
    }
    @PostMapping
    fun save(@RequestBody client:Client):Client{
        return clientService.save(client)

}
    @PutMapping
    fun update(@RequestBody client: Client): Client {
        return  clientService.update(client)

    }
    @PatchMapping
    fun updateNombre(@RequestBody client: Client): Client {
        return  clientService.updateNombre(client)

    }
    @DeleteMapping("/delete/{id}")
    fun delete (@PathVariable("id") id: Long):Boolean{
        return clientService.delete(id)

    }
}