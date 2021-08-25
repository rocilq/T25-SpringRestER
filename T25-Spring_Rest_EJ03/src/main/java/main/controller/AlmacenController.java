package main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import main.dto.Almacen;
import main.service.AlmacenServiceImpl;

public class AlmacenController {
	@Autowired
	AlmacenServiceImpl almacenServiceImpl;

	@GetMapping("/almacenes")
	public List<Almacen> listarAlmacens(){
		return almacenServiceImpl.listarAlmacens();
	}

	@PostMapping("/almacenes")
	public Almacen salvarAlmacen(@RequestBody Almacen almacen) {

		return almacenServiceImpl.guardarAlmacen(almacen);
	}

	@GetMapping("/almacenes/{id}")
	public Almacen almacenXID(@PathVariable(name="codigo") Integer id) {

		Almacen almacen_xid= new Almacen();

		almacen_xid=almacenServiceImpl.almacenXID(id);

		System.out.println("Almacen XID: "+almacen_xid);

		return almacen_xid;
	}

	@PutMapping("/almacenes/{id}")
	public Almacen actualizarAlmacen(@PathVariable(name="codigo")Integer id,@RequestBody Almacen almacen) {

		Almacen almacen_seleccionado= new Almacen();
		Almacen almacen_actualizado= new Almacen();

		almacen_seleccionado= almacenServiceImpl.almacenXID(id);

		almacen_seleccionado.setLugar(almacen.getLugar());
		

		almacen_actualizado = almacenServiceImpl.actualizarAlmacen(almacen_seleccionado);

		System.out.println("El almacen actualizado es: "+ almacen_actualizado);

		return almacen_actualizado;
	}

	@DeleteMapping("/almacenes/{id}")
	public void eliminarAlmacen(@PathVariable(name="codigo")Integer id) {
		almacenServiceImpl.eliminarAlmacen(id); 
	}
}
