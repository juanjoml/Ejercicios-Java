package ejercicio2;

import java.util.Scanner;

/* Ejercicio 2) Haz una clase llamada Persona que siga las siguientes condiciones: 

-Sus atributos son: nombre, edad, DNI, sexo (H hombre, M mujer), peso y altura. 
No queremos que se accedan directamente a ellos. Piensa que modificador de acceso es el m�s adecuado, tambi�n su tipo. 
Si quieres a�adir alg�n atributo puedes hacerlo. 

-Por defecto, todos los atributos menos el DNI ser�n valores por defecto seg�n su tipo (0 n�meros, cadena vac�a para String, etc.). 
Sexo ser� hombre por defecto, usa una constante para ello. 

-Se implantar�n varios constructores:  o Un constructor por defecto. o Un constructor con el nombre, edad y sexo, el resto por defecto. 
o Un constructor con todos los atributos como par�metro. 

-Los m�todos que se implementaran son:
  
1) calcularIMC(): calculara si la persona est� en su peso ideal (peso en kg/(altura elevado a 2  en m)), 
si esta f�rmula devuelve un valor menor que 20, la funci�n devuelve un -1, si devuelve un n�mero entre 20 y 25 (incluidos), significa 
que est� por debajo de su peso ideal la funci�n devuelve un 0  y si devuelve un valor mayor que 25 significa que tiene sobrepeso, la 
funci�n devuelve un 1. Te recomiendo que uses constantes para devolver estos valores.
  
2) esMayorDeEdad (): indica si es mayor de edad, devuelve un booleano.

3) toString (): devuelve toda la informaci�n del objeto. 

4) generaDNI (): genera un n�mero aleatorio de 8 cifras, genera a partir de este su n�mero su letra correspondiente. Este m�todo ser� 
invocado cuando se construya el objeto. Puedes dividir el m�todo para que te sea m�s f�cil. No ser� visible al exterior. POR HACER

5) M�todos set de cada par�metro, excepto de DNI. POR HACER */


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
			System.out.println("Elige una opci�n");					// Elegimos una opci�n
			System.out.println("1) Comprobar si tiene peso ideal");	
			System.out.println("2) Comprobar si es mayor de edad");	
			System.out.println("3) Mostrar la informaci�n del objeto");	
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
