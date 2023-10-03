package Persona;

public class Dentista extends Persona {
	
	
	//Atributos
	
	//Ya no creo valores como nombre, edad, etc por que se van a heredar de la clase persona
	

	
	String especialidad;
	String cedula;
	String consultorioAsignado;
	String experiencia;
	String turno;
	int salario;
	
	//2 constructor
	public Dentista(String nombre, String apellido, byte edad, String telefono, String email, String especialidad,
			String cedula, String consultorioAsignado, String experiencia, String turno, int salario) {
		super(nombre, apellido, edad, telefono, email); //Informacion de la clase persona
		//informacion de la clase Dentista
		this.especialidad = especialidad;
		this.cedula = cedula;
		this.consultorioAsignado = consultorioAsignado;
		this.experiencia = experiencia;
		this.turno = turno;
		this.salario = salario;
	}//Constructor Dentista con informacion heredada
	
	
	//3 Metodos (Metodo para calcular salario basado en la experiencia
	//Experiencia = basico, intermedio, avanzado
	//Si el dentista esta en rango basico, gana 30,000. Si es intermedio, gana 40,000 y si es avanzado gana 50,000.
	
	void calcularSalario () {
		//logica de programacion
		if (experiencia.equals("basico")) {
			salario = 30000;
		}else if (experiencia == "intermedio") {
			salario = 40000;
			
		}else if (experiencia == "avanzado") {
			salario = 50000;
		}
	}//cierre calcular salario
	
	
	void imprimirInfoDentista() {
		System.out.println("La especialidad: " + especialidad);
		System.out.println("El salario es: " + salario);
		
	}//cierre imprimirinfodentista
	
	//Diferencia entre evaluar variables con operador de igualdad (==) y evaluar el contenido de las variables con el metodo equals (.equals)
	
}
