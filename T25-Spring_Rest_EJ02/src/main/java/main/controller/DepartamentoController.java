package main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import main.dto.Departamento;
import main.service.DepartamentoServiceImpl;

@RestController
@RequestMapping("/api")
public class DepartamentoController {
	
	@Autowired
	DepartamentoServiceImpl departamentoServiceImpl;
	
	@GetMapping("/departamentos")
	public List<Departamento> listarDepartamentos(){
		return departamentoServiceImpl.listarDepartamentos();
	}
	
	@PostMapping("/clientes")
	public Departamento salvarCliente(@RequestBody Departamento departamento) {
		
		return departamentoServiceImpl.guardarDepartamento(departamento);
	}
	
	@GetMapping("/departamentos/{id}")
	public Departamento departamentoXID (@PathVariable(name="codigo") Integer id){
		
		Departamento departamento_xid = new Departamento();
		
		departamento_xid = departamentoServiceImpl.departamentoXID(id);
		
		System.out.println("Departamento XID: " + departamento_xid);
		
		return departamento_xid;
	}
	
	@PutMapping("/departamentos/{id}")
	public Departamento actualizarDepartamento(@PathVariable(name="codigo")Integer id,@RequestBody Departamento departamento) {
		Departamento departamento_seleccionado = new Departamento();
		Departamento departamento_actualizado = new Departamento();
		
		departamento_seleccionado = departamentoServiceImpl.departamentoXID(id);
		
		departamento_seleccionado.setCodigo(departamento.getCodigo());
		departamento_seleccionado.setNombre(departamento.getNombre());
		departamento_seleccionado.setPresupuesto(departamento.getPresupuesto());
		
		departamento_actualizado = departamentoServiceImpl.actualizarDepartamento(departamento_seleccionado);
		
		System.out.println("El departamento actualizado es: " + departamento_actualizado);
		
		return departamento_actualizado;
		
	}
	
	@DeleteMapping("/departamentos/{id}")
	public void eliminarDepartamento(@PathVariable(name="codigo")Integer id) {
		departamentoServiceImpl.eliminarDepartamento(id);
	}
	
}
