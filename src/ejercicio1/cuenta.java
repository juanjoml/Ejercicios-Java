package ejercicio1;

/* Ejercicio 1) Crea una clase llamada Cuenta que tendrá los siguientes atributos: titular y cantidad (puede tener decimales). 
El titular será obligatorio y la cantidad es opcional. Crea dos constructores que cumpla lo anterior. 
Tendrá dos métodos especiales: 
• ingresar (double cantidad): se ingresa una cantidad a la cuenta, si la cantidad introducida es negativa, no se hará nada. 
• retirar (double cantidad): se retira una cantidad a la cuenta, si restando la cantidad actual a la que nos pasan es negativa, 
la cantidad de la cuenta pasa a ser 0. */

public class cuenta {
	
	private String titular;
	private double cantidad;
	
	
	
	public cuenta(String titular, double cantidad)
	{
		this.titular= titular;
		this.cantidad=cantidad;
	}
	
	public cuenta(String titular)
	{
		this.titular= titular;
	}
	
	
	public void ingresar(double cantidad)
	{
		if(cantidad<0) {return;}	// Si la cantidad es negativa, te devuelve la cantidad que tiene el objeto, tal cual (con un void return??)
		
		else if(cantidad>=0)		// Si la cantidad es positiva o cero, la cantidad de la instancia "Juanjo" será la inicial (3000) 
		{							// más la que le pasamos (en el main, dinero; aquí, cantidad)
			this.cantidad+=cantidad;
		}
	}
	
	public void retirar(double cantidad)
	{
		if(this.cantidad > cantidad )	// Si la cantidad de la instancia "Juanjo" es mayor que la que retiramos, se la restamos.
		{
			this.cantidad = this.cantidad - cantidad;
		}
		else if (this.cantidad <= cantidad)	// Si no (la cantidad a retirar es mayor que la de la instancia), la dejamos a cero.
		{
			this.cantidad = 0;
		}
		
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	
	
}


