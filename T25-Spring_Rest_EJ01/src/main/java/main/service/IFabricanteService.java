package main.service;

import java.util.List;

import main.dto.Fabricante;

public interface IFabricanteService {
	//Metodos del CRUD
	public List<Fabricante> listarFabricantes(); //Listar All 

	public Fabricante guardarFabricante(Fabricante fabricante);	//Guarda un Fabricante CREATE

	public Fabricante FabricanteXID(Integer id); //Leer datos de un Fabricante READ

	public Fabricante actualizarFabricante(Fabricante fabricante); //Actualiza datos del Fabricante UPDATE

	public void eliminarFabricante(Integer id);// Elimina el Fabricante DELETE
}
