package main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import main.dao.IEmpleadoDAO;
import main.dto.Empleado;

public class EmpleadoServiceImpl implements IEmpleadoService{
	
	@Autowired
	IEmpleadoDAO iEmpleadoDAO;
	
	@Override
	public List<Empleado> listarEmpleados() {
		// TODO Auto-generated method stub
		return iEmpleadoDAO.findAll();
	}

	@Override
	public Empleado guardarEmpleado(Empleado empleado) {
		// TODO Auto-generated method stub
		return iEmpleadoDAO.save(empleado);
	}

	@Override
	public Empleado empleadoXID(String DNI) {
		// TODO Auto-generated method stub
		return iEmpleadoDAO.findById(DNI).get();
	}

	@Override
	public Empleado actualizarEmpleado(Empleado empleado) {
		// TODO Auto-generated method stub
		return iEmpleadoDAO.save(empleado);
	}

	@Override
	public void eliminarEmpleado(String DNI) {
		// TODO Auto-generated method stub
		iEmpleadoDAO.deleteById(DNI);
	}

}
