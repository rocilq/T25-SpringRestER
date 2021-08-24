package main.service;

import java.util.List;

import main.dto.Articulo;

public interface IArticuloService {
	//Metodos del CRUD
			public List<Articulo> listarArticulos(); //Listar All 
			
			public Articulo guardarArticulo(Articulo articulo);	//Guarda un Articulo CREATE
			
			public Articulo ArticuloXID(Integer id); //Leer datos de un Articulo READ
			
			public Articulo actualizarArticulo(Articulo articulo); //Actualiza datos del Articulo UPDATE
			
			public void eliminarArticulo(Integer id);// Elimina el Articulo DELETE
}
