package main.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import main.dto.Articulo;

public interface IArticuloDAO extends JpaRepository<Articulo, Integer> {
	public List<Articulo> findById(int id);
}
