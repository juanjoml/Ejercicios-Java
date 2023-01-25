package ejercicio2;

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
invocado cuando se construya el objeto. Puedes dividir el m�todo para que te sea m�s f�cil. No ser� visible al exterior. POR HACER.

5) M�todos set de cada par�metro, excepto de DNI. POR HACER. */

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