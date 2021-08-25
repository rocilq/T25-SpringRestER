package main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import main.dao.IAlmacenDAO;
import main.dto.Almacen;

public class AlmacenServiceImpl implements IAlmacenService{
	
	@Autowired
	IAlmacenDAO iAlmacenDAO;
	
	@Override
	public List<Almacen> listarAlmacens() {
		// TODO Auto-generated method stub
		return iAlmacenDAO.findAll();
	}

	@Override
	public Almacen guardarAlmacen(Almacen almacen) {
		// TODO Auto-generated method stub
		return iAlmacenDAO.save(almacen);
	}

	@Override
	public Almacen almacenXID(Integer id) {
		// TODO Auto-generated method stub
		return iAlmacenDAO.findById(id).get();
	}

	@Override
	public Almacen actualizarAlmacen(Almacen almacen) {
		// TODO Auto-generated method stub
		return iAlmacenDAO.save(almacen);
	}

	@Override
	public void eliminarAlmacen(Integer id) {
		// TODO Auto-generated method stub
		iAlmacenDAO.deleteById(id);
	}

}
