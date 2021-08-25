package main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import main.dto.Caja;
import main.service.CajaServiceImpl;

public class CajaController {
	@Autowired
	CajaServiceImpl cajaServiceImpl;

	@GetMapping("/cajaes")
	public List<Caja> listarCajas(){
		return cajaServiceImpl.listarCajas();
	}

	@PostMapping("/cajaes")
	public Caja salvarCaja(@RequestBody Caja caja) {

		return cajaServiceImpl.guardarCaja(caja);
	}

	@GetMapping("/cajaes/{id}")
	public Caja cajaXID(@PathVariable(name="numReferencia") Character id) {

		Caja caja_xid= new Caja();

		caja_xid=cajaServiceImpl.cajaXID(id);

		System.out.println("Caja XID: "+caja_xid);

		return caja_xid;
	}

	@PutMapping("/cajaes/{id}")
	public Caja actualizarCaja(@PathVariable(name="numReferencia")Character id,@RequestBody Caja caja) {

		Caja caja_seleccionado= new Caja();
		Caja caja_actualizada= new Caja();

		caja_seleccionado= cajaServiceImpl.cajaXID(id);

		caja_seleccionado.setContenido(caja.getContenido());
		caja_seleccionado.setValor(caja.getValor());

		caja_actualizada = cajaServiceImpl.actualizarCaja(caja_seleccionado);

		System.out.println("La caja actualizada es: "+ caja_actualizada);

		return caja_actualizada;
	}

	@DeleteMapping("/cajaes/{id}")
	public void eliminarCaja(@PathVariable(name="numReferencia")Character id) {
		cajaServiceImpl.eliminarCaja(id); 
	}
}
