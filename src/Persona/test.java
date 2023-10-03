package Persona;

public class test {
	
	//Metodo principal para instanciar mis clases
	public static void main(String[] args) {
		
		Persona Felipe = new Persona("Felipe", "Maqueda", (byte)31, "3173830521","marcouriel065@gmail.com" );
		
		System.out.println(Felipe);//imprime el lugar de la memoria 
		Felipe.imprimirInfo();//imprime informacion
		Felipe.saludar();//imprime saludo
		
		
		//Instancia de Dentista
		Dentista Simi = new Dentista ("Dr.Simi", "Lares", (byte)50, "3174894859", "simillabas@gmail.com", "Odontologia", "3221234565", "500","avanzado","matutino",500);
		
		System.out.println("******************************");
		Simi.calcularSalario();
		Simi.imprimirInfoDentista();

	}

}
