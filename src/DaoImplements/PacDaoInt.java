package DaoImplements;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Dao.PacDao;
import Entidades.Paciente;

public class PacDaoInt implements PacDao{
	
	private Conexion cn;

	@Override
	public List<Paciente> obtenerTodos() {
		cn = new Conexion();
		cn.Open();
		 List<Paciente> list = new ArrayList<Paciente>();
		 try
		 {
			 ResultSet rs= cn.query("Select pacientes.DNI, pacientes.Nombre, pacientes.Apellido, pacientes.sexo, pacientes.Nacionalidad, pacientes.FechaNacimiento , pacientes.Direccion, pacientes.Localidad, pacientes.Provincia. pacientes.CorreoElectronico, pacientes.Telefono from pacientes");
			 while(rs.next())
			 {
				 Paciente pac = new Paciente();
				 pac.setDni(rs.getInt("pacientes.DNI"));
				 pac.setNombre(rs.getString("pacientes.Nombre"));
				 pac.setApellido(rs.getString("pacientes.Apellido"));
				 pac.setSexo(rs.getString("pacientes.sexo"));
				 pac.setNacionalidad(rs.getString("pacientes.Nacionalidad"));
				 pac.setFechaNacimiento(rs.getString("pacientes.FechaNacimiento"));
				 pac.setDireccion(rs.getString("pacientes.Direccion"));
				 pac.setLocalidad(rs.getString("pacientes.Localidad"));
				 pac.setProvincia(rs.getString("pacientes.Provincia"));
				 pac.setCorreo(rs.getString("pacientes.CorreoElectronico"));
				 pac.setTelefono(rs.getInt("pacientes.Telefono"));
				 list.add(pac);
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
	public Paciente obtenerUno(int DNI) {
		cn = new Conexion();
		cn.Open();
		Paciente pac = new Paciente();
		try
		 {
			 ResultSet rs= cn.query("Select pacientes.DNI, pacientes.Nombre, pacientes.Apellido, pacientes.sexo, pacientes.Nacionalidad, pacientes.FechaNacimiento , pacientes.Direccion, pacientes.Localidad, pacientes.Provincia. pacientes.CorreoElectronico, pacientes.Telefono from pacientes where pacientes.DNI ="+DNI);
			 rs.next();

			 pac.setDni(rs.getInt("pacientes.DNI"));
			 pac.setNombre(rs.getString("pacientes.Nombre"));
			 pac.setApellido(rs.getString("pacientes.Apellido"));
			 pac.setSexo(rs.getString("pacientes.sexo"));
			 pac.setNacionalidad(rs.getString("pacientes.Nacionalidad"));
			 pac.setFechaNacimiento(rs.getString("pacientes.FechaNacimiento"));
			 pac.setDireccion(rs.getString("pacientes.Direccion"));
			 pac.setLocalidad(rs.getString("pacientes.Localidad"));
			 pac.setProvincia(rs.getString("pacientes.Provincia"));
			 pac.setCorreo(rs.getString("pacientes.CorreoElectronico"));
			 pac.setTelefono(rs.getInt("pacientes.Telefono"));
		 }
		 catch(Exception e)
		 {
			 e.printStackTrace();
		 }
		 finally
		 {
			 cn.close();
		 }
		return pac;
	}

	@Override
	public boolean insertar(Paciente paciente) {	
		boolean f=false;

		cn = new Conexion();
		cn.Open();	

		String query = "INSERT INTO pacientes (DNI,Nombre,Apellido,Sexo,Nacionalidad,FechaNacimiento,Direccion,Localidad,Provincia,CorreoElectronico,Telefono) VALUES ("+paciente.getDni()+",'"+paciente.getNombre()+"','"+paciente.getApellido()+"', '"+paciente.getSexo()+"','"+paciente.getNacionalidad()+"','"+paciente.getFechaNacimiento()+"','"+paciente.getDireccion()+"','"+paciente.getLocalidad()+"','"+paciente.getProvincia()+"','"+paciente.getCorreo()+"',"+paciente.getTelefono()+"')";
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
	public boolean editar(Paciente paciente) {
		boolean f=false;

		cn = new Conexion();
		cn.Open();	

		String query = "UPDATE pacientes SET DNI = '"+paciente.getDni()+"', Nombre = '"+paciente.getNombre()+"', Apellido = '"+paciente.getApellido()+"', sexo = '"+paciente.getSexo()+"', Nacionalidad = '"+paciente.getNacionalidad()+"', FechaNacimiento = '"+ paciente.getFechaNacimiento() +"', Direccion = '"+ paciente.getDireccion()+"', Localidad = '"+paciente.getLocalidad()+"', Provincia = '"+paciente.getProvincia()+"', CorreoElectronico = '"+paciente.getCorreo()+"', Telefono = '"+paciente.getTelefono()+"'";
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
	public boolean borrar(int DNI) {///Le falta estado a pacientes en BD
		boolean estado=false;
		/*cn = new Conexion();
		cn.Open();		 
		String query = "UPDATE pacientes SET estado=0 WHERE DNI="+Dni;
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
		}*/
		return estado; 
	}

}
