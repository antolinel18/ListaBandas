package dam1.entornos;

import java.util.Scanner;

public class Bandas {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int opcion;
		String bandaEliminada;
		boolean encontrada = false;
		
		System.out.println("Dime cuantas bandas quieres guardar:");
		int indice = sc.nextInt();
		String bandas [] = new String[indice];
		do {
			System.out.println("MENU PRINCIPAL");
			System.out.println("1.- Añadir una nueva banda a la lista");
			System.out.println("2.- Eliminar una banda de la lista");
			System.out.println("3.- Mostrar todas las bandas existentes");
			System.out.println("4.- SALIR DEL PROGRAMA");
			opcion = sc.nextInt();


		} while (opcion != 4);
		
		sc.close();
	}

}
