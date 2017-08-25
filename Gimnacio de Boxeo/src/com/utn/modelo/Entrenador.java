package com.utn.modelo;

public final class Entrenador {

	public String categoria;
	public String nombre;
	public Aspirante a1;
	public Aspirante a2;
	public Aspirante a3;
	public Aspirante a4;
	public Aspirante a5;

	// public static Aspirante moscaGallo[];
	// public static Aspirante plumaLigero[];
	// public static Aspirante welterMediano[];
	// public static Aspirante mediopesadoPesado[];
	//
	// public static Aspirante[] estMoscaGallo = new Aspirante[5];
	// public static Aspirante[] estPlumaLigero = new Aspirante[5];
	// public static Aspirante[] estWelterMediano = new Aspirante[5];
	// public static Aspirante[] estMediopesadoPesado = new Aspirante[5];
	//
	// public static Aspirante[] noEstMoscaGallo = new Aspirante[100];
	// public static Aspirante[] noEstPlumaLigero = new Aspirante[100];
	// public static Aspirante[] noEstWelterMediano = new Aspirante[100];
	// public static Aspirante[] noEstMediopesadoPesado = new Aspirante[100];

	public static int limiteEstudiantes = 5;

	public static void asignaCategoria(Aspirante[] aspirante, Entrenador[] entrenador) {


for (int iniE = 0; iniE < entrenador.length; iniE++) {

	int i = 0;

	for (int iniA = 0; iniA < aspirante.length; iniA++) {

		if ((aspirante[iniA].categoria== "Mosca" || aspirante[iniA].categoria == "Gallo") && entrenador[iniE].categoria=="Mosca-Gallo") {

			if (i < limiteEstudiantes){
				System.out.println("Entro al GYM " + aspirante[iniA].nombre + " de la categoria "+ aspirante[iniA].categoria + " para cursar con " + entrenador[iniE].nombre);
				i++;
			}else{
				System.out.println("No entro por falta de cupos el estudiante: " + aspirante[iniA].nombre + " que pertenecia a la categoria " + aspirante[iniA].categoria);
			}


		} else if ((aspirante[iniA].categoria.equals("Pluma") || aspirante[iniA].categoria.equals("Ligero")) && entrenador[iniE].categoria.equals("Pluma-Ligero")) {

			if (i < limiteEstudiantes){
				System.out.println("Entro al GYM " + aspirante[iniA].nombre + " de la categoria "+ aspirante[iniA].categoria + " para cursar con " + entrenador[iniE].nombre);
				i++;
			}else{
				System.out.println("No entro por falta de cupos el estudiante: " + aspirante[iniA].nombre + " que pertenecia a la categoria " + aspirante[iniA].categoria);
			}

		} else if ((aspirante[iniA].categoria.equals("Welter") || aspirante[iniA].categoria.equals("Mediano")) && entrenador[iniE].categoria.equals("Welter-Mediano")) {

			if (i < limiteEstudiantes){
				System.out.println("Entro al GYM " + aspirante[iniA].nombre + " de la categoria "+ aspirante[iniA].categoria  + " para cursar con " + entrenador[iniE].nombre);
				i++;
			}else{
				System.out.println("No entro por falta de cupos el estudiante: " + aspirante[iniA].nombre + " que pertenecia a la categoria " + aspirante[iniA].categoria);
			}

		} else if ((aspirante[iniA].categoria.equals("Mediopesado") || aspirante[iniA].categoria.equals("Pesado")) && entrenador[iniE].categoria.equals("Mediopesado-Pesado")) {

			if (i < limiteEstudiantes){
				System.out.println("Entro al GYM " + aspirante[iniA].nombre + " de la categoria "+ aspirante[iniA].categoria  + " para cursar con " + entrenador[iniE].nombre);
				i++;
			}else{
				System.out.println("No entro por falta de cupos el estudiante: " + aspirante[iniA].nombre + " que pertenecia a la categoria " + aspirante[iniA].categoria);
			}
		}

			}
		}
	}
}
