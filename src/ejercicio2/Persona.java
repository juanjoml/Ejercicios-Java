package ejercicio2;

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
invocado cuando se construya el objeto. Puedes dividir el método para que te sea más fácil. No será visible al exterior. POR HACER.

5) Métodos set de cada parámetro, excepto de DNI. POR HACER. */

public class Persona {
	
	private String nombre;
	private int edad;
	private int dni;
	private String sexo;
	private int peso;
	private float altura;


	public Persona()
	{
		this.nombre= "";
		this.edad=0;
		this.dni=0;
		this.sexo="H";
		this.peso=0;
		this.altura=0.0f;
	}
	
	public Persona(String nombre, int edad, String sexo)
	{
		this.nombre= nombre;
		this.edad=edad;
		this.dni=dni;
		this.sexo=sexo;
		this.peso=0;
		this.altura=0.0f;
	}
	
	public Persona (String nombre, int edad, int dni, String sexo, int peso, float altura)
	{
		this.nombre= nombre;
		this.edad=edad;
		this.dni=dni;
		this.sexo=sexo;
		this.peso=peso;
		this.altura=altura;
	}
	
	public Persona (int peso, float altura) 
	{
		this.peso=peso;
		this.altura=altura;
	}
	
	public int calcularIMC(int peso, float altura)
	{
		if((peso/(Math.pow(altura, 2)))<20)
		{
			return -1;
		}
		else 
		{
			if((peso/(Math.pow(altura, 2))>=20 && (peso/(Math.pow(altura, 2))<=25)))
			{
				return 0;
			}
			else
			{
				if ((peso/(Math.pow(altura, 2))>25))
				{
					return 1;
				}
			}
		}
		
		return -1;
	}
	
	public boolean esMayorDeEdad (int edad) {
		if (edad>18) {
			return true;	
		}
		else {
			return false;	
		}
		
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + ", sexo=" + sexo + ", peso=" + peso
				+ ", altura=" + altura + "]";
	}
}