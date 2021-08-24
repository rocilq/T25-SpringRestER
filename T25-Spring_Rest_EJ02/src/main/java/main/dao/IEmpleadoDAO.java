package main.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import main.dto.Empleado;

public interface IEmpleadoDAO extends JpaRepository<Empleado, String> {

}
