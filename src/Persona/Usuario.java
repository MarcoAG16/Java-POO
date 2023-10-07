package Persona;

public class Usuario {
	
	
	//Atributos
	private String rol;
	private String username;
	private String password;
	private String tipoUsario;
	
	//Crear nuevo usuario
	public Usuario(String tipoUsuario,String username, String password) {
		this.tipoUsario = tipoUsuario;
		this.username = username;
		this.password = password;
	}//constructor
	
	
	
	//Recuperar (getter)
	public String getPassword () {
		//si el usuario registrado coincide con el usuario que paso como parametro entonces obtengo la 

		return password;
	}//getter
	
	
	//Cambiar contrasenia (setter)
		public void setPassword(String nuevoPassword) {
			//si la nueva contrasenia es diferente a una cadena vacia y es diferente a la contrasenia anterior...
			if (nuevoPassword != "" && nuevoPassword != password) {
				//... entonces reemplazo la contrasenia anterior
				password = nuevoPassword;
				System.out.println("contrasenia cambiada correctamente");
			}else {
				System.out.println("Lo siento, no puedo cambiar la contrasenia");
			}
		}
		
		
		//Cambiar la contrasenia de un objeto del tipo usuario
		
		//Felipe.setPassword (una donde la contrasenia este vacia)
		//Felipe.setPassword (una donde la contrasenia no este vacia pero sea igual a la anterior)
		//Felipe.setPassword (se cumplan las dos condiciones)
	
	

		
		
		
		
}//Class Usuario


