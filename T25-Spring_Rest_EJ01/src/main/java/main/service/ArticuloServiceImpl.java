package main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import main.dao.IArticuloDAO;
import main.dto.Articulo;

public class ArticuloServiceImpl implements IArticuloService{
	//Utilizamos los metodos de la interface IArticuloDAO, es como si instaciaramos.
			@Autowired
			IArticuloDAO iArticuloDAO;
			
			@Override
			public List<Articulo> listarArticulos() {
				
				return iArticuloDAO.findAll();
			}

			@Override
			public Articulo guardarArticulo(Articulo articulo) {
				
				return iArticuloDAO.save(articulo);
			}

			@Override
			public Articulo ArticuloXID(Integer id) {
				
				return iArticuloDAO.findById(id).get();
			}

			@Override
			public Articulo actualizarArticulo(Articulo articulo) {
				
				return iArticuloDAO.save(articulo);
			}

			@Override
			public void eliminarArticulo(Integer id) {
				
				iArticuloDAO.deleteById(id);
				
			}
}
