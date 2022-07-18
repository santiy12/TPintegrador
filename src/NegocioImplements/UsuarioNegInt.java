package NegocioImplements;

import java.util.List;

import Dao.UsuarioDao;
import DaoImplements.UsuDaoInt;
import Entidades.Usuario;
import Negocio.UsuarioNeg;


public class UsuarioNegInt implements UsuarioNeg {

	private UsuarioDao usuDao = new UsuDaoInt();
	
	public UsuarioNegInt(UsuarioDao usuDao)
	{
		this.usuDao = usuDao;
	}
	
	public UsuarioNegInt()
	{
	}
	
	@Override
	public List<Usuario> obtenerTodos() {
		
		return usuDao.obtenerTodos();
	}

	@Override
	public Usuario obtenerUno(int DniP) {
		
		return usuDao.obtenerUno(DniP);
	}

	@Override
	public boolean insertar(Usuario usuario) {
		
		UsuDaoInt Userdao = new UsuDaoInt();
		return Userdao.insertar(usuario);
	}

	@Override
	public boolean editar(Usuario usuario) {
	
		return usuDao.editar(usuario);
	}

	@Override
	public boolean borrar(int Dni) {
		return usuDao.borrar(Dni);
	}
}
