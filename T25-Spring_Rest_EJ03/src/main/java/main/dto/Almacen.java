package main.dto;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="almacenes")
public class Almacen {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	@Column (name = "lugar")
	private String lugar;
	@Column (name = "capacidad")
	private int capacidad;
	
	@OneToMany
	@JoinColumn(name="numReferencia")
	private List<Caja> caja;

	// Constructores
	
	public Almacen() {
		
	}
	
	public Almacen(int codigo, String lugar, int capacidad, List<Caja> caja) {
		this.codigo = codigo;
		this.lugar = lugar;
		this.capacidad = capacidad;
		this.caja = caja;
	}
	
	// Getters & setters

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Caja")
	public List<Caja> getCaja(){
		return caja;
	}
	
	public void setCaja(List<Caja> caja) {
		this.caja = caja;
	}
	
	// toString

	@Override
	public String toString() {
		return "Almacen [codigo=" + codigo + ", lugar=" + lugar + ", capacidad=" + capacidad + "]";
	}
	
	
	
}
