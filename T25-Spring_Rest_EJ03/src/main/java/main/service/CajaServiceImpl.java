package main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import main.dao.ICajaDAO;
import main.dto.Caja;

public class CajaServiceImpl implements ICajaService{
	
	@Autowired
	ICajaDAO iCajaDAO;
	
	@Override
	public List<Caja> listarCajas() {
		// TODO Auto-generated method stub
		return iCajaDAO.findAll();
	}

	@Override
	public Caja guardarCaja(Caja caja) {
		// TODO Auto-generated method stub
		return iCajaDAO.save(caja);
	}

	@Override
	public Caja cajaXID(Character id) {
		// TODO Auto-generated method stub
		return iCajaDAO.findById(id).get();
	}

	@Override
	public Caja actualizarCaja(Caja caja) {
		// TODO Auto-generated method stub
		return iCajaDAO.save(caja);
	}

	@Override
	public void eliminarCaja(Character id) {
		// TODO Auto-generated method stub
		iCajaDAO.deleteById(id);
	}

}
