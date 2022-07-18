package Dao;

///import java.util.List; Por si necesitamos hacer listados de medicos| capaz para las estadisticas que queria el profe
import Entidades.Medico;
import java.util.List;

public interface MedDao {

	public List<Medico> obtenerTodos();
	public Medico obtenerUno(int Dni);
	public boolean insertar(Medico medico);
	public boolean editar(Medico medico);
	public boolean borrar(int Dni);
	
}
