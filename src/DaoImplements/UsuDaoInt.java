package DaoImplements;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Dao.UsuarioDao;
import Entidades.Usuario;

public class UsuDaoInt implements UsuarioDao{

	private Conexion cn;
	
	@Override
	public List<Usuario> obtenerTodos() {
		cn = new Conexion();
		cn.Open();
		 List<Usuario> list = new ArrayList<Usuario>();
		 try
		 {
			 ResultSet rs= cn.query("Select usuarios.DNI, usuarios.Clave, usuarios.tipoUsuario from usuarios");
			 while(rs.next())
			 {
				 Usuario usu = new Usuario();
				 usu.setDNI(rs.getInt("usuarios.DNI"));
				 usu.setClave(rs.getString("usuarios.Clave"));
				 usu.setTipoUsuario(rs.getBoolean("usuarios.tipoUsuario"));
				 usu.setEstado(rs.getBoolean("usuarios.Estado")); ///NO ESTA EN LA BD
				 
				 list.add(usu);
			 }
			 
		 }
		 catch(Exception e)
		 {
			 e.printStackTrace();
		 }
		 finally
		 {
			 cn.close();
		 }
		 return list;
	}

	@Override
	public Usuario obtenerUno(int Dni) {
		cn = new Conexion();
		cn.Open();
		Usuario usu = new Usuario();
		try
		 {
			 ResultSet rs= cn.query("Select DNI, Clave, tipoUsuario from usuarios where DNI="+ Dni);
			 rs.next();

			 usu.setDNI(rs.getInt("DNI"));
			 usu.setClave(rs.getString("Clave"));
			 usu.setTipoUsuario(rs.getBoolean("tipoUsuario"));
			 ///usu.setEstado(rs.getBoolean("usuarios.Estado")); ///NO ESTA EN LA BD
			 
		 }
		 catch(Exception e)
		 {
			 e.printStackTrace();
		 }
		 finally
		 {
			 cn.close();
		 }
		return usu;
	}

	@Override
	public boolean insertar(Usuario usuario) {
		boolean f=false;

		cn = new Conexion();
		cn.Open();	

		String query = "INSERT INTO usuarios (DNI,Clave,tipoUsuario) VALUES ("+usuario.getDNI()+",'"+usuario.getClave()+"','"+usuario.isTipoUsuario()+")";
		System.out.println(query);
		try
		 {
			f = cn.execute(query);
		 }
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			cn.close();
		}
		return f;
	}

	@Override
	public boolean editar(Usuario usuario) {
		boolean f=false;

		cn = new Conexion();
		cn.Open();	

		String query = "UPDATE usuarios SET DNI = '"+usuario.getDNI()+"', Clave = '"+usuario.getClave()+"', tipoUsuario = '"+usuario.isTipoUsuario()+"'";
		System.out.println(query);
		try
		 {
			f = cn.execute(query);
		 }
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			cn.close();
		}
		return f;
	}

	@Override
	public boolean borrar(int Dni) {
		boolean estado=false;
		cn = new Conexion();
		cn.Open();		 
		String query = "UPDATE usuarios SET Estado=0 WHERE DNI="+Dni;
		try
		 {
			estado=cn.execute(query);
		 }
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			cn.close();
		}
		return estado; 
	}

}
