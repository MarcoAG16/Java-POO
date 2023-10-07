package Persona;

public class TestAsistenteDental {

	public static void main(String[] args) {
		
		//Instancia de nuetro asistente
		
		AsistenteDental Francisca = new AsistenteDental("05/10/2023", 9783.35d);
		
		//Impresion de la informacion de nuestro asistente
		Francisca.mostrarDatosAsistente();
		
		//El sueldo de Francisca no es de 875.4, es de 87.54
		
		//cambio de sueldo 
		//Francisca.salario = 87.54d;
		
		//Mostrar solo el sueldo
		//System.out.println(Francisca.salario);
		
		//Mostrar solo el sueldo (antes del getter)
		System.out.println(Francisca.getSalario());
		
		
		//Modificar salario con setter
		Francisca.setSalario(300.00);//No cumple la condicion 
		
		//Imprimir el nuevo salario de Francisca
		System.out.println(Francisca.getSalario());

	}//metodo main

}
