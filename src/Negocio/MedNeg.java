package Negocio;

import java.util.List;

import Entidades.Medico;

public interface MedNeg {

	public List<Medico> obtenerTodos();
	public Medico obtenerUno(int Dni);
	public boolean insertar(Medico medico);
	public boolean editar(Medico medico);
	public boolean borrar(int Dni);
	
}
