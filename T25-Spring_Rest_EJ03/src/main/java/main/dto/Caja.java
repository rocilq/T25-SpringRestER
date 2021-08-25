package main.dto;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="cajas")
public class Caja {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private char numReferencia;
	@Column(name="contenido")
	private String contenido;
	@Column(name="valor")
	private int valor;
	
	@ManyToOne
	@JoinColumn(name="codigo")
	private List<Almacen> almacen;
	
	// Constructores
	
	public Caja() {
		
	}

	public Caja(char numReferencia, String contenido, int valor) {
		this.numReferencia = numReferencia;
		this.contenido = contenido;
		this.valor = valor;
	}
	
	// Getters & Setters

	public char getNumReferencia() {
		return numReferencia;
	}

	public void setNumReferencia(char numReferencia) {
		this.numReferencia = numReferencia;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Almacen")
	public List<Almacen> getAlmacen() {
		return almacen;
	}

	public void setAlmacen(List<Almacen> almacen) {
		this.almacen = almacen;
	}

	// To String
	
	@Override
	public String toString() {
		return "Caja [numReferencia=" + numReferencia + ", contenido=" + contenido + ", valor=" + valor + "]";
	}
	
	
}
