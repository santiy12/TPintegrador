package Dao;

import java.util.List;
import Entidades.Turno;

public interface TurnoDao {

	public List<Turno> obtenerTodos();
	public Turno obtenerUno(int DniP,int DniM); /// Seria mas comodo si le ponemos un codigo autonumerico a cada turno, no?
	public boolean insertar(Turno turno);
	public boolean editar(Turno turno);
	public boolean borrar(int DniP,int DniM);
	
}
