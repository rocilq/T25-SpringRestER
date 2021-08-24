package main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import main.dto.Articulo;
import main.service.ArticuloServiceImpl;

public class ArticuloController {
	@Autowired
	ArticuloServiceImpl articuloServiceImpl;

	@GetMapping("/articulos")
	public List<Articulo> listarArticulos(){
		return articuloServiceImpl.listarArticulos();
	}

	@PostMapping("/articulos")
	public Articulo salvarArticulo(@RequestBody Articulo Articulo) {

		return articuloServiceImpl.guardarArticulo(Articulo);
	}

	@GetMapping("/articulos/{id}")
	public Articulo ArticuloXID(@PathVariable(name="id") Integer id) {

		Articulo articulo_xid= new Articulo();

		articulo_xid=articuloServiceImpl.ArticuloXID(id);

		System.out.println("Articulo XID: "+articulo_xid);

		return articulo_xid;
	}

	@PutMapping("/articulos/{id}")
	public Articulo actualizarArticulo(@PathVariable(name="id")Integer id,@RequestBody Articulo articulo) {

		Articulo articulo_seleccionado= new Articulo();
		Articulo articulo_actualizado= new Articulo();

		articulo_seleccionado= articuloServiceImpl.ArticuloXID(id);

		articulo_seleccionado.setNombre(articulo.getNombre());


		articulo_actualizado = articuloServiceImpl.actualizarArticulo(articulo_seleccionado);

		System.out.println("El articulo actualizado es: "+ articulo_actualizado);

		return articulo_actualizado;
	}
	
	@DeleteMapping("/articulos/{id}")
	public void eleiminarArticulo(@PathVariable(name="id")Integer id) {
		articuloServiceImpl.eliminarArticulo(id);
	}
	
}
