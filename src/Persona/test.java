package Persona;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

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
		
		/*
		System.out.println("*****************");
		System.out.println(Chencho);
		
		//Instancia de Paciente con datos obligatorios
				paciente Masiosare = new paciente("MAS12345", false, false);
				System.out.println("********************");
				System.out.println(Masiosare);
				
				
				//Cambiar el false de seguroMedico a true
				//Masiosare.seguroGastosMedicos = true;
				
				
				
				
				System.out.println("********************");
				System.out.println(Masiosare);
				
				//Implementacion de ArrayList de Dentistas
				*/
				List<Dentista> listaDentistasArrayList = new ArrayList<>();
			//primero genero una instancia de dentista
				Dentista DrChapatin = new Dentista ("Dr.Chapatin","Chespirito",(byte)45,"3467485903","chapameil@gmail.com","General","6657485960","Consutorio 200","Avanzado","matutino", 450);
				//luego la agrego a la lista
				listaDentistasArrayList.add(DrChapatin);
				
				//si agrego la instancia a una variable, puedo imprimir su inforacaion usando un toString 
				
				
				
				listaDentistasArrayList.add(new Dentista("Dr.Simi", "Lares", (byte)50, "317489485", "simillabas@gmail.com", "Odontologia", "3221234565", "500","avanzado","matutino",500));
				
				//si genero la instancia y la agreo directamente al arrayList, para sacar el dato tendre que utilizar un forEach o algun ciclo para imprimir dato por dato
				
				
				
				//implementacion de lista de Dentistas con un HashSet
				Set<Dentista> conjuntoDentistas = new HashSet<>();
				
				//Agregando dentista a mi conjunto
				conjuntoDentistas.add(new Dentista("Dr.Simi", "Lares", (byte)50, "317489485", "simillabas@gmail.com", "Odontologia", "3221234565", "500","avanzado","matutino",500));
				
				
				//Implementacion de un hashmap de Dentistas
				Map<String,Dentista> mapaDentistas = new HashMap<>();
				
				//Agregar un dentista a mi mapa
				mapaDentistas.put("Dr Vaquero",new Dentista ("Manuel", "Acunia", (byte)55, "317489485", "simillabas@gmail.com", "Odontologia", "3221234565", "500","avanzado","Vespertino",2500)); 
				
				//Imprimir el objeto Doctor
				Dentista Doctorsolicitado = mapaDentistas.get("Dr Vaquero");
				
				System.out.println(Doctorsolicitado);
				
	}//cierre metodo main

}//cierre class persona




