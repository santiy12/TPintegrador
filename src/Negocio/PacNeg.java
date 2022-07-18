package Negocio;

import java.util.List;

import Entidades.Paciente;

public interface PacNeg {

	public List<Paciente> obtenerTodos();
	public Paciente obtenerUno(int DNI);
	public boolean insertar(Paciente paciente);
	public boolean editar(Paciente paciente);
	public boolean borrar(int DNI);
}
