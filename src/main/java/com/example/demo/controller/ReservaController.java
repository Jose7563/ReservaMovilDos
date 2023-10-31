package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Reserva;
import com.example.demo.repository.ReservaRepository;

@RestController
@RequestMapping("/api")
public class ReservaController {
	
	 @Autowired
	    public ReservaRepository reservaRepository;

	    @GetMapping(value ="/reservas")
	    public Iterable<Reserva> getAllReservas(){
	        return reservaRepository.findAll();
	    }
	    
	    @PostMapping(value = "/reservas/new")
	    public Reserva saveProducto(@RequestBody Reserva reserva){
	        return reservaRepository.save(reserva);
	    }
	    @DeleteMapping(value="/reservas/delete/{id}")
	    public void deleteProducto(@PathVariable Integer id){
	    	reservaRepository.deleteById(id);
	    }
	    

}
