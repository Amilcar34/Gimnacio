package com.utn.modelo;

import javax.swing.event.SwingPropertyChangeSupport;

public final class Organizador {

	public int indice;



	public static void mostrarTablas(Aspirante[] categoriaA, Entrenador[] categoriaE) {

		for (int i = 0; i < categoriaE.length; i++) {

			int k = 1;

			for (int j = 0; j < categoriaA.length; j++) {

				if ((categoriaA[j].categoria == "Mosca" || categoriaA[j].categoria == "Gallo") && categoriaA[i].categoria == "Mosca-Gallo" ) {
					
					switch (k) {
					case 1:
						//a1=categoriaA;
						
						break;

					default:
						break;
					}

				} else if (categoriaA[j].categoria == "Pluma" || categoriaA[j].categoria == "Ligero") {

				} else if (categoriaA[j].categoria == "Welter" || categoriaA[j].categoria == "Mediano") {

				} else if (categoriaA[j].categoria == "Mediopesado" || categoriaA[j].categoria == "Pesado") {

				}
			}

		}
	}System.out.println("Estudiantes de la categoria "+categoria[].categoria);

	}

	public static void organisa(Aspirante[] estudiantes) {

	}

}
