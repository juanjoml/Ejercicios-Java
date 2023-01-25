package ejercicio1;

import java.util.Scanner;

/* Ejercicio 1) Crea una clase llamada Cuenta que tendr� los siguientes atributos: titular y cantidad (puede tener decimales). 
El titular ser� obligatorio y la cantidad es opcional. Crea dos constructores que cumpla lo anterior. 
Tendr� dos m�todos especiales: 
� ingresar (double cantidad): se ingresa una cantidad a la cuenta, si la cantidad introducida es negativa, no se har� nada. 
� retirar (double cantidad): se retira una cantidad a la cuenta, si restando la cantidad actual a la que nos pasan es negativa, 
la cantidad de la cuenta pasa a ser 0. */



public class aplicacion {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		System.out.println("Introduce una cantidad");
		
		cuenta juanjo=new cuenta("Juanjo", 3000);
		
		int dinero;
		
		Scanner sc = new Scanner(System.in);
		
		dinero = sc.nextInt();
		
		juanjo.ingresar(dinero);
		
		System.out.println(juanjo.getCantidad());
		
		System.out.println("Retira una cantidad");
		
		dinero = sc.nextInt();
		
		juanjo.retirar(dinero);
		
		System.out.println(juanjo.getCantidad());

	}

}
