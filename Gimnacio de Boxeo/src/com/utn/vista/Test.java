package com.utn.vista;

import com.utn.modelo.Aspirante;
import com.utn.modelo.Entrenador;
import com.utn.modelo.Organizador;

public final class Test {

	public static void main(String[] args) {
		

		System.out.println("los que se vinieron a inscribir :");
		System.out.println(" ");

		Aspirante h = new Aspirante();
		h.nombre = "Laura";
		h.asignaPesoCategoria(43, h);

		Aspirante h1 = new Aspirante();
		h1.nombre = "Lucia";
		h1.asignaPesoCategoria(47, h1);

		Aspirante h2 = new Aspirante();
		h2.nombre = "Lorena";
		h2.asignaPesoCategoria(53, h2);

		Aspirante h3 = new Aspirante();
		h3.nombre = "Lautaro";
		h3.asignaPesoCategoria(57, h3);

		Aspirante h4 = new Aspirante();
		h4.nombre = "Lucas";
		h4.asignaPesoCategoria(63, h4);

		Aspirante h5 = new Aspirante();
		h5.nombre = "Luciano";
		h5.asignaPesoCategoria(67, h5);

		Aspirante h6 = new Aspirante();
		h6.nombre = "Lulu";
		h6.asignaPesoCategoria(73, h6);

		Aspirante h7 = new Aspirante();
		h7.nombre = "Lucho";
		h7.asignaPesoCategoria(77, h7);

		Aspirante h8 = new Aspirante();
		h8.nombre = "Lore";
		h8.asignaPesoCategoria(83, h8);

		Aspirante h9 = new Aspirante();
		h9.nombre = "Lasie";
		h9.asignaPesoCategoria(87, h9);

		Aspirante h10 = new Aspirante();
		h10.nombre = "Lampone";
		h10.asignaPesoCategoria(93, h10);

		Aspirante h11 = new Aspirante();
		h11.nombre = "Lucia";
		h11.asignaPesoCategoria(97, h11);

		Aspirante h12 = new Aspirante();
		h12.nombre = "Lito";
		h12.asignaPesoCategoria(103, h12);

		Aspirante a = new Aspirante();
		a.nombre = "Juares";
		a.asignaPesoCategoria(40, a);

		Aspirante a1 = new Aspirante();
		a1.nombre = "Juan";
		a1.asignaPesoCategoria(45.0, a1);

		Aspirante a2 = new Aspirante();
		a2.nombre = "Jorge";
		a2.asignaPesoCategoria(50.0, a2);

		Aspirante a3 = new Aspirante();
		a3.nombre = "Jose";
		a3.asignaPesoCategoria(55.0, a3);

		Aspirante a4 = new Aspirante();
		a4.nombre = "Javier";
		a4.asignaPesoCategoria(60.0, a4);

		Aspirante a5 = new Aspirante();
		a5.nombre = "Juanito";
		a5.asignaPesoCategoria(65.0, a5);

		Aspirante a6 = new Aspirante();
		a6.nombre = "Jaimito";
		a6.asignaPesoCategoria(70.0, a6);

		Aspirante a7 = new Aspirante();
		a7.nombre = "Juana";
		a7.asignaPesoCategoria(75, a7);

		Aspirante a8 = new Aspirante();
		a8.nombre = "Josefa";
		a8.asignaPesoCategoria(80, a8);

		Aspirante a9 = new Aspirante();
		a9.nombre = "Jimena";
		a9.asignaPesoCategoria(85, a9);

		Aspirante a10 = new Aspirante();
		a10.nombre = "Jasinta";
		a10.asignaPesoCategoria(90, a10);

		Aspirante a11 = new Aspirante();
		a11.nombre = "Jazmin";
		a11.asignaPesoCategoria(95, a11);

		Aspirante a12 = new Aspirante();
		a12.nombre = "Josias";
		a12.asignaPesoCategoria(100, a12);

		//
		System.out.println(" ");
		System.out.println("==================================================================================");

		Entrenador e1 = new Entrenador();
		e1.nombre = "Amadeo";
		e1.categoria = "Mosca-Gallo";

		Entrenador e2 = new Entrenador();
		e2.nombre = "Armando";
		e2.categoria = "Pluma-Ligero";

		Entrenador e3 = new Entrenador();
		e3.nombre = "Alejandro";
		e3.categoria = "Welter-Mediano";

		Entrenador e4 = new Entrenador();
		e4.nombre = "Agustina";
		e4.categoria = "Mediopesado-Pesado";

		Aspirante[] estudiantes = { a, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, h, h1, h2, h3, h4, h5, h6, h7,
				h8, h9, h10, h11, h12 };

		Entrenador[] entrenadores = { e1, e2, e3, e4 };

		if ((a5.categoria == "Mosca" || a5.categoria=="Gallo") && e1.categoria == "Mosca-Gallo"){
			System.out.println("jjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjj");
}
		Entrenador.asignaCategoria(estudiantes, entrenadores);
		
	//	Organizador.organisa(estudiantes);
		
		System.out.println();
	}
}
