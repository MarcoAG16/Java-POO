package Persona;

public class paciente {

	//1 Atributos
	String numeroSeguroSocial;
	String tipoSangre;
	boolean expediente;
	 boolean seguroGastosMedicos;
	String cita;
	String doctorAsignado;
	boolean alergias;
	
	
	
	//2 Constructor que recopile los datos
	public paciente(String numeroSeguroSocial, String tipoSangre, boolean expediente, boolean seguroGastosMedicos,String cita, String doctorAsignado, boolean alergias) {
		super();
		this.numeroSeguroSocial = numeroSeguroSocial;
		this.tipoSangre = tipoSangre;
		this.expediente = expediente;
		this.seguroGastosMedicos = seguroGastosMedicos;
		this.cita = cita;
		this.doctorAsignado = doctorAsignado;
		this.alergias = alergias;
	}//constructor con todos los campos
	
	
	
	//2.1 Constructor que recopile solo los datos requeridos u obligatorios
	paciente(String numeroSeguroSocial, boolean expediente, boolean seguroGastosMedicos){
		this.numeroSeguroSocial = numeroSeguroSocial;
		this.expediente = expediente;
		this.seguroGastosMedicos=seguroGastosMedicos;
	}//constructor con campos obligatorios
	
	
		
	


	
	
	
	//3 Metodos
@Override
//Metodo llamado toString que utiliza datos del tipo String
	public String toString() {
		return "Paciente [numeroSeguroSocial=" + numeroSeguroSocial + ", tipoSangre=" + tipoSangre + ", expediente="
				+ expediente + ", seguroGastosMedicos=" + seguroGastosMedicos + ", cita=" + cita + ", doctorAsignado="
				+ doctorAsignado + ", alergias=" + alergias + "]";
	}//tostring



//getter
public boolean getSeguroGatsosMedicos() {
	return seguroGastosMedicos;
}

//setter
public void setSeguroGastosMedicos(boolean seguroGastosMedicos) {
	this.seguroGastosMedicos = seguroGastosMedicos;
}
	
	
	
}//Class Paciente
