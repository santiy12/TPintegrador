package Negocio;

import java.util.List;

import Entidades.Turno;

public interface TurnoNeg {

	public List<Turno> obtenerTodos();
	public Turno obtenerUno(int DniP,int DniM);
	public boolean insertar(Turno turno);
	public boolean editar(Turno turno);
	public boolean borrar(int DniP,int DniM);
}
