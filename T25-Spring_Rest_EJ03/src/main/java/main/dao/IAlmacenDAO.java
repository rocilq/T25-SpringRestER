package main.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import main.dto.Almacen;

public interface IAlmacenDAO extends JpaRepository<Almacen, Integer>{

}
