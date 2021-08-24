package main.service;

import java.util.List;

import main.dto.Empleado;

public interface IEmpleadoService {
	
	public List<Empleado> listarEmpleados(); //Listar All 
	
	public Empleado guardarEmpleado(Empleado empleado);	//Guarda un empleado CREATE
	
	public Empleado empleadoXID(String DNI); //Leer datos de un empleado READ
	
	public Empleado actualizarEmpleado(Empleado empleado); //Actualiza datos del empleado UPDATE
	
	public void eliminarEmpleado(String DNI);// Elimina el empleado DELETE
}
