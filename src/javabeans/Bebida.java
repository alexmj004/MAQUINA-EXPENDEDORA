package javabeans;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class Bebida {
	//Atributos privados:
	private String nombreBebida;
	private double precio;
	
	//Constructor por defecto:
	public Bebida() {
		// TODO Auto-generated constructor stub
	}

	//Constructor con todo:
	public Bebida(String nombreBebida, double precio) {
		super();
		this.nombreBebida = nombreBebida;
		this.precio = precio;
	}

	//Métodos getter y setter:
	public String getNombreBebida() {
		return nombreBebida;
	}

	public void setNombreBebida(String nombreBebida) {
		this.nombreBebida = nombreBebida;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	//Método toString:
	@Override
	public String toString() {
		return "Bebida [nombreBebida=" + nombreBebida + ", precio=" + precio + "]";
	}

	//Dos bebidas son iguales por su nombre:
	@Override
	public int hashCode() {
		return Objects.hash(nombreBebida);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bebida other = (Bebida) obj;
		return Objects.equals(nombreBebida, other.nombreBebida);
	}
	

}
