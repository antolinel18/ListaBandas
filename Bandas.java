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
			switch (opcion) {
			case 1:
				for(int i = 0; i < bandas.length; i++) {
					System.out.println("Dime la nueva banda: ");
					bandas[i] = sc.next();
				}
				break;
			case 2:
				System.out.println("Dime que banda quieres eliminar: ");
				bandaEliminada = sc.next();
				for (int i = 0; i < bandas.length; i++) {
					if (bandas[i] != null && bandas[i].equals(bandaEliminada)) {
						bandas[i] = null;
						encontrada = true;
						System.out.println("Banda eliminada");
					}
				}
				if (!encontrada) {
					System.out.println("No se encontro la banda");
				}
				break;
			case 3:
				for (int i = 0; i < bandas.length; i++) {
					System.out.println(bandas[i]);
				}
				break;
			case 4:
				System.out.println("Saliendo del programa...");
				break;

			default:
				System.out.println("Opcion incorrecta");
				break;
			}
		} while (opcion != 4);
		
		sc.close();
	}

}