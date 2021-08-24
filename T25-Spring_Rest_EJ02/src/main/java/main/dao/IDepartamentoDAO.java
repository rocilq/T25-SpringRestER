package main.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import main.dto.Departamento;

public interface IDepartamentoDAO extends JpaRepository<Departamento, Integer>{
	
}
