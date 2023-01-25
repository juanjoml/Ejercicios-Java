package ejercicio2;

import java.util.Scanner;

/* Ejercicio 2) Haz una clase llamada Persona que siga las siguientes condiciones: 

-Sus atributos son: nombre, edad, DNI, sexo (H hombre, M mujer), peso y altura. 
No queremos que se accedan directamente a ellos. Piensa que modificador de acceso es el más adecuado, también su tipo. 
Si quieres añadir algún atributo puedes hacerlo. 

-Por defecto, todos los atributos menos el DNI serán valores por defecto según su tipo (0 números, cadena vacía para String, etc.). 
Sexo será hombre por defecto, usa una constante para ello. 

-Se implantarán varios constructores:  o Un constructor por defecto. o Un constructor con el nombre, edad y sexo, el resto por defecto. 
o Un constructor con todos los atributos como parámetro. 

-Los métodos que se implementaran son:
  
1) calcularIMC(): calculara si la persona está en su peso ideal (peso en kg/(altura elevado a 2  en m)), 
si esta fórmula devuelve un valor menor que 20, la función devuelve un -1, si devuelve un número entre 20 y 25 (incluidos), significa 
que está por debajo de su peso ideal la función devuelve un 0  y si devuelve un valor mayor que 25 significa que tiene sobrepeso, la 
función devuelve un 1. Te recomiendo que uses constantes para devolver estos valores.
  
2) esMayorDeEdad (): indica si es mayor de edad, devuelve un booleano.

3) toString (): devuelve toda la información del objeto. 

4) generaDNI (): genera un número aleatorio de 8 cifras, genera a partir de este su número su letra correspondiente. Este método será 
invocado cuando se construya el objeto. Puedes dividir el método para que te sea más fácil. No será visible al exterior. POR HACER

5) Métodos set de cada parámetro, excepto de DNI. POR HACER */


public class aplicacion {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	
		
		System.out.println("Introduce nombre");	
		
		String nombre;
		
		nombre = sc.next();
		
		System.out.println("Introduce edad");	
						
		int edad;
		
		edad = sc.nextInt();
		
		System.out.println("Introduce dni");	
			
		int dni;
		
		dni = sc.nextInt();
		
		System.out.println("Introduce sexo");	
		
		String sexo;
		
		sexo = sc.next();
		
		System.out.println("Introduce peso");	
					
		int peso;
		
		peso = sc.nextInt();
		
		System.out.println("Introduce altura");	
		
		float altura;
		
		altura = sc.nextFloat();
		
		Persona persona1= new Persona ( nombre,  edad,  dni,  sexo,  peso,  altura);
		
		int rpt=0;
		while(rpt==0) {
			
		
			System.out.println("\n");	
			System.out.println("Elige una opción");					// Elegimos una opción
			System.out.println("1) Comprobar si tiene peso ideal");	
			System.out.println("2) Comprobar si es mayor de edad");	
			System.out.println("3) Mostrar la información del objeto");	
			System.out.println("4) Salir");
			int opcion;
			
			opcion = sc.nextInt();
			
			switch(opcion) {
			
			case 1: System.out.println(persona1.calcularIMC(peso, altura));; break;
			case 2: System.out.println(persona1.esMayorDeEdad(edad)); break;
			case 3: System.out.println(persona1.toString()); break;
			case 4: rpt=1; break;
			}			
		}			
	}
}
