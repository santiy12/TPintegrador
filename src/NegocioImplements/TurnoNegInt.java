package NegocioImplements;

import java.util.List;

import Dao.TurnoDao;
import DaoImplements.TurnoDaoInt;
import Entidades.Turno;
import Negocio.TurnoNeg;

public class TurnoNegInt implements TurnoNeg{

	private TurnoDao turDao = new TurnoDaoInt();
	
	public TurnoNegInt(TurnoDao turDao)
	{
		this.turDao = turDao;
	}
	
	public TurnoNegInt()
	{
	}
	
	@Override
	public List<Turno> obtenerTodos() {
		return turDao.obtenerTodos();
	}

	@Override
	public Turno obtenerUno(int DniP, int DniM) {
		return turDao.obtenerUno(DniP, DniM);
	}

	@Override
	public boolean insertar(Turno turno) {
		return turDao.insertar(turno);
	}

	@Override
	public boolean editar(Turno turno) {
		return turDao.editar(turno);
	}

	@Override
	public boolean borrar(int DniP, int DniM) {
		return turDao.borrar(DniP, DniM);
	}

}
