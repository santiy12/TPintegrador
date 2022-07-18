package NegocioImplements;

import java.util.List;

import Dao.PacDao;
import DaoImplements.PacDaoInt;
import Entidades.Paciente;
import Negocio.PacNeg;

public class PacNegInt implements PacNeg{

	private PacDao pacDao = new PacDaoInt();
	
	public PacNegInt(PacDao pacDao)
	{
		this.pacDao = pacDao;
	}
	
	public PacNegInt()
	{
	}
	
	@Override
	public List<Paciente> obtenerTodos() {
		return pacDao.obtenerTodos();
	}

	@Override
	public Paciente obtenerUno(int DNI) {
		return pacDao.obtenerUno(DNI);
	}

	@Override
	public boolean insertar(Paciente paciente) {
		return pacDao.insertar(paciente);
	}

	@Override
	public boolean editar(Paciente paciente) {
		return pacDao.editar(paciente);
	}

	@Override
	public boolean borrar(int DNI) {
		return pacDao.borrar(DNI);
	}

}
