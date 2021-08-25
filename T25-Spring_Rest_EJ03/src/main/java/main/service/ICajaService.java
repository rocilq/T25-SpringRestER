package main.service;

import java.util.List;

import main.dto.Caja;

public interface ICajaService {
	
	public List<Caja> listarCajas(); //Listar All 

	public Caja guardarCaja(Caja caja);	//Guarda un caja CREATE

	public Caja cajaXID(Character id); //Leer datos de un caja READ

	public Caja actualizarCaja(Caja caja); //Actualiza datos del caja UPDATE

	public void eliminarCaja(Character id);// Elimina el caja DELETE
}
