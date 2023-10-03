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
		
		//instacia de paciente
		paciente Chencho = new paciente("CHNCH12", "RH Positivo", true, true, "05/Oct/2023", "Doc.Simi lares", false);
		
		System.out.println("*****************");
		System.out.println(Chencho);
		
		//Instancia de Paciente con datos obligatorios
				paciente Masiosare = new paciente("MAS12345", false, false);
				System.out.println("********************");
				System.out.println(Masiosare);
				
				
				//Cambiar el false de seguroMedico a true
				Masiosare.seguroGastosMedicos = true;
				
				
				
				
				System.out.println("**********");
				System.out.println(Masiosare);
				
	}

}
