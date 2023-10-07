package Persona;

public class AsistenteDental {


	//1 Atributos
	private String fechaIngreso;
	private double salario;
	
	
	// 2 Constructor(Dejo el constructor publico para poder acceder a el de forma sencilla)
	public AsistenteDental(String fechaIngreso, double salario) {
		
	}
	
	
	//3 Metodos
	
	
	//Metodo para imprimir informacion
	public void mostrarDatosAsistente() {
		System.out.println("La fecha de ingreso del asistente es: " + fechaIngreso);
		System.out.println("El salario del asistente es: " + salario);
	}//metodoimprimirinformacion
	
	
	
	//getters y setters para poder acceder a mis datos privados y oder realizar operaciones con ellos
	//sin getters, la informacion me aparece en null
	//sin setters, no puedo cambiar la informacion 
	
	//Este getter permite retornar el dato de la fecha de ingreso en formato String
	
	
	public String getfechaIngreso() {
		return fechaIngreso;
	}//Getter
	
	
	//getter para salario
	public double getSalario() {
		return salario;
	}//getSalario
	
	//setter para salario (modificar los datos)
	public void setSalario(double nuevoSalario) {
		if (nuevoSalario >0 || nuevoSalario <100) {
			salario = nuevoSalario;
		}//cierre if
	}//cierresetter
	
	
	
	
}//cierre AsistenteDental 
