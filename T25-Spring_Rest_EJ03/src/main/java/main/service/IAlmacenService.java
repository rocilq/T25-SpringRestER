package main.service;

import java.util.List;

import main.dto.Almacen;

public interface IAlmacenService {
	public List<Almacen> listarAlmacens(); //Listar All 

	public Almacen guardarAlmacen(Almacen almacen);	//Guarda un almacen CREATE

	public Almacen almacenXID(Integer id); //Leer datos de un almacen READ

	public Almacen actualizarAlmacen(Almacen almacen); //Actualiza datos del almacen UPDATE

	public void eliminarAlmacen(Integer id);// Elimina el almacen DELETE
}
