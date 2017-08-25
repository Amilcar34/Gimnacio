package com.utn.modelo;

public final class Aspirante {

	public String categoria;
	public double peso;
	public String nombre;

	public void asignaPesoCategoria(double pesoAspi, Aspirante aspirante) {

		if (pesoAspi < 52.16) {
			aspirante.categoria = "Mosca";
			aspirante.peso = pesoAspi;
		} 
		else if (pesoAspi < 55.33) {
			aspirante.categoria = "Gallo";
			aspirante.peso = pesoAspi;
		} 
		else if (pesoAspi < 58.96) {
			aspirante.categoria = "Pluma";
			aspirante.peso = pesoAspi;
		} 
		else if (pesoAspi < 63.50) {
			aspirante.categoria = "Ligero";
			aspirante.peso = pesoAspi;
		}
		else if (pesoAspi < 69.85) {
			aspirante.categoria = "Welter";
			aspirante.peso = pesoAspi;
		}
		else if (pesoAspi < 76.20) {
			aspirante.categoria = "Mediano";
			aspirante.peso = pesoAspi;
		}
		else if (pesoAspi < 91) {
			aspirante.categoria = "Mediopesado";
			aspirante.peso = pesoAspi;
		}
		else if ( pesoAspi >= 91){
			aspirante.categoria = "Pesado";
			aspirante.peso = pesoAspi;
		}
		
//
		System.out.println(aspirante.nombre + " pertenece a la categoria " + aspirante.categoria + " porque pesa " + aspirante.peso + " kg.");
		
	}
}
