package EjercicioArray;

import java.util.ArrayList;
import java.util.Scanner;

public class Aplicacion {

	public static void main(String[] args) {
		ArrayList<Integer> lista = new ArrayList<Integer> ();
		int iterar = 1;
		Scanner scan = new Scanner(System.in);
		
		while (iterar == 1)
		{
			System.out.println();
			System.out.println();
			System.out.println("Ejemplo ArrayList: ");
			System.out.println("1. Insertar un número");
			System.out.println("2. Imprimir la lista");
			System.out.println("3. Obtener el elemento i");
			System.out.println("4. Borrar el elemento i");
			System.out.println("5. Ordenar la lista");
			System.out.println("6. Salir de la aplicación");
			System.out.print("Introduce una opción: ");
			
			int opcion = scan.nextInt();
			
			switch (opcion)
			{
				case 1:
				{
					System.out.print("Introduce un nuevo número: ");
					int numero = scan.nextInt();
					lista.add(numero);				
					break;
				}
					
				case 2:
				{
					System.out.println(lista.toString());
					break;
				}
				
				case 3:
				{
					System.out.print("Indica la posición i: ");
					
					try
					{
						int posicion = scan.nextInt();
						System.out.println(lista.get(posicion).toString());
					}
					catch (Exception e)
					{
						System.out.println("El elemento especificado no existe en la lista.");
					}
					
					break;
				}
				
				case 4:
				{
					System.out.print("Indica la posición i: ");
					
					try
					{
						int posicion = scan.nextInt();
						lista.remove(posicion);
					}
					catch (Exception e)
					{
						System.out.println("El elemento especificado no existe en la lista.");
					}
					
					break;
				}
				
				case 5:
				{
					lista.sort(null);
					break;
				}
					
				case 6:
				{
					iterar = 0;
					break;
				}
					
				default:
					break;
			}
		}
	
		scan.close();
	}
}
