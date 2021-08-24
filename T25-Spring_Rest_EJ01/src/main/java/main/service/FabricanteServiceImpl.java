package main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import main.dao.IFabricanteDAO;
import main.dto.Fabricante;

public class FabricanteServiceImpl implements IFabricanteService{
	//Utilizamos los metodos de la interface IFabricanteDAO, es como si instaciaramos.
		@Autowired
		IFabricanteDAO iFabricanteDAO;
		
		@Override
		public List<Fabricante> listarFabricantes() {
			
			return iFabricanteDAO.findAll();
		}

		@Override
		public Fabricante guardarFabricante(Fabricante fabricante) {
			
			return iFabricanteDAO.save(fabricante);
		}

		@Override
		public Fabricante FabricanteXID(Integer id) {
			
			return iFabricanteDAO.findById(id).get();
		}

		@Override
		public Fabricante actualizarFabricante(Fabricante fabricante) {
			
			return iFabricanteDAO.save(fabricante);
		}

		@Override
		public void eliminarFabricante(Integer id) {
			
			iFabricanteDAO.deleteById(id);
			
		}
}
