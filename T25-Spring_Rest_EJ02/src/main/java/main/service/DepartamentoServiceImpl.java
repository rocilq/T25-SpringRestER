package main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import main.dao.IDepartamentoDAO;
import main.dto.Departamento;

public class DepartamentoServiceImpl implements IDepartamentoService{
	
	@Autowired
	IDepartamentoDAO iDepartamentoDAO;
	
	@Override
	public List<Departamento> listarDepartamentos() {
		// TODO Auto-generated method stub
		return iDepartamentoDAO.findAll();
	}

	@Override
	public Departamento guardarDepartamento(Departamento departamento) {
		// TODO Auto-generated method stub
		return iDepartamentoDAO.save(departamento);
	}

	@Override
	public Departamento departamentoXID(Integer id) {
		// TODO Auto-generated method stub
		return iDepartamentoDAO.findById(id).get();
	}

	@Override
	public Departamento actualizarDepartamento(Departamento departamento) {
		// TODO Auto-generated method stub
		return iDepartamentoDAO.save(departamento);
	}

	@Override
	public void eliminarDepartamento(Integer id) {
		// TODO Auto-generated method stub
		iDepartamentoDAO.deleteById(id);
	}

}
