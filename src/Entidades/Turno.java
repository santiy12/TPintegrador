package Entidades;

public class Turno {
	private int DniMed;
	private String DiaHorario; ///Lo puse como string, chequear despues si conviene dejarlo asi o cambiarlo
	private int DniPaciente;
	private String Especialidad;
	private boolean Estado;
	
	public int getDniMed() {
		return DniMed;
	}
	public void setDniMed(int dniMed) {
		DniMed = dniMed;
	}
	public String getDiaHorario() {
		return DiaHorario;
	}
	public void setDiaHorario(String diaHorario) {
		DiaHorario = diaHorario;
	}
	public int getDniPaciente() {
		return DniPaciente;
	}
	public void setDniPaciente(int dniPaciente) {
		DniPaciente = dniPaciente;
	}
	public String getEspecialidad() {
		return Especialidad;
	}
	public void setEspecialidad(String especialidad) {
		Especialidad = especialidad;
	}
	public boolean isEstado() {
		return Estado;
	}
	public void setEstado(boolean estado) {
		Estado = estado;
	}



}
