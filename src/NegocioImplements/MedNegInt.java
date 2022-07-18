package NegocioImplements;

import java.util.List;

import Dao.MedDao;
import DaoImplements.MedDaoInt;
import DaoImplements.UsuDaoInt;
import Entidades.Medico;
import Entidades.Usuario;
import Negocio.MedNeg;


public class MedNegInt implements MedNeg{

	private MedDao medDao = new MedDaoInt();
	
	public MedNegInt(MedDao medDao)
	{
		this.medDao = medDao;
	}
	
	public MedNegInt()
	{
	}
	
	@Override
	public List<Medico> obtenerTodos() {
		return medDao.obtenerTodos();
	}

	@Override
	public Medico obtenerUno(int Dni) {
		return medDao.obtenerUno(Dni);
	}

	@Override
	public boolean insertar(Medico medico) {
		
		MedDaoInt Medao = new MedDaoInt();
		return  Medao.insertar(medico);
		
	}

	@Override
	public boolean editar(Medico medico) {
		return medDao.editar(medico);
	}

	@Override
	public boolean borrar(int Dni) {
		return medDao.borrar(Dni);
	}

}
