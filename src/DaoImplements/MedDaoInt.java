package DaoImplements;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Dao.MedDao;
import Entidades.Medico;



public class MedDaoInt implements MedDao {

	private Conexion cn;
	
	public MedDaoInt() {
		
	}
	
	@Override
	public List<Medico> obtenerTodos() {
		cn = new Conexion();
		cn.Open();
		 List<Medico> list = new ArrayList<Medico>();
		 try
		 {
			 ResultSet rs= cn.query("Select medicos.DNI, medicos.Nombre, medicos.Apellido, medicos.sexo, medicos.Nacionalidad, medicos.FechaNacimiento , medicos.Direccion, medicos.Localidad, medicos.Provincia. medicos.CorreoElectronico, medicos.Telefono, medicos.CodEspecialidad, medicos.DiaHorariosDeAtencion from medicos");
			 while(rs.next())
			 {
				 Medico med = new Medico();
				 med.setDni(rs.getInt("medicos.DNI"));
				 med.setNombre(rs.getString("medicos.Nombre"));
				 med.setApellido(rs.getString("medicos.Apellido"));
				 med.setSexo(rs.getString("medicos.sexo"));
				 med.setNacionalidad(rs.getString("medicos.Nacionalidad"));
				 med.setFechaNacimiento(rs.getString("medicos.FechaNacimiento"));
				 med.setDireccion(rs.getString("medicos.Direccion"));
				 med.setLocalidad(rs.getString("medicos.Localidad"));
				 med.setProvincia(rs.getString("medicos.Provincia"));
				 med.setCorreo(rs.getString("medicos.CorreoElectronico"));
				 med.setTelefono(rs.getInt("medicos.Telefono"));
				 med.setCodEspecialidad(rs.getString("medicos.Cod.Especialidad"));
				 med.setHorarioDesde(rs.getString("DiaHorariosDeAtencion"));
				 //med.setHorarioHasta(rs.getString("HorarioHasta"));
				 list.add(med);
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
	public Medico obtenerUno(int DNI) {
		cn = new Conexion();
		cn.Open();
		Medico med = new Medico();
		try
		 {
			ResultSet rs= cn.query("Select medicos.DNI, medicos.Nombre, medicos.Apellido, medicos.sexo, medicos.Nacionalidad, medicos.FechaNacimiento , medicos.Direccion, medicos.Localidad, medicos.Provincia. medicos.CorreoElectronico, medicos.Telefono, medicos.[Cod.Especialidad], medicos.DiaHorariosDeAtencion from medicos where medicos.DNI ="+DNI);
			 rs.next();

			 med.setDni(rs.getInt("medicos.DNI"));
			 med.setNombre(rs.getString("medicos.Nombre"));
			 med.setApellido(rs.getString("medicos.Apellido"));
			 med.setSexo(rs.getString("medicos.sexo"));
			 med.setNacionalidad(rs.getString("medicos.Nacionalidad"));
			 med.setFechaNacimiento(rs.getString("medicos.FechaNacimiento"));
			 med.setDireccion(rs.getString("medicos.Direccion"));
			 med.setLocalidad(rs.getString("medicos.Localidad"));
			 med.setProvincia(rs.getString("medicos.Provincia"));
			 med.setCorreo(rs.getString("medicos.CorreoElectronico"));
			 med.setTelefono(rs.getInt("medicos.Telefono"));
			 med.setCodEspecialidad(rs.getString("medicos.[Cod.Especialidad]"));
			 med.setHorarioDesde(rs.getString("HorarioDesde"));
			 med.setHorarioHasta(rs.getString("HorarioHasta"));
			 
		 }
		 catch(Exception e)
		 {
			 e.printStackTrace();
		 }
		 finally
		 {
			 cn.close();
		 }
		return med;
	}

	@Override
	public boolean insertar(Medico medico) {
		
		boolean f=false;

		cn = new Conexion();
		cn.Open();	

		String query = "INSERT INTO medicos (DNI,Nombre,Apellido,Sexo,Nacionalidad,FechaNacimiento,Direccion,Localidad,Provincia,CorreoElectronico,Telefono,CodEspecialidad,DiaHorariosDeAtencion) VALUES ("+medico.getDni()+",'"+medico.getNombre()+"','"+medico.getApellido()+"', '"+medico.getSexo()+"','"+medico.getNacionalidad()+"','"+medico.getFechaNacimiento()+"','"+medico.getDireccion()+"','"+medico.getLocalidad()+"','"+medico.getProvincia()+"','"+medico.getCorreo()+"',"+medico.getTelefono()+",'"+medico.getCodEspecialidad()+"',''19hs'')";
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
	public boolean editar(Medico medico) {
		boolean f=false;

		cn = new Conexion();
		cn.Open();	

		String query = "UPDATE medicos SET DNI = '"+medico.getDni()+"', Nombre = '"+medico.getNombre()+"', Apellido = '"+medico.getApellido()+"', sexo = '"+medico.getSexo()+"', Nacionalidad = '"+medico.getNacionalidad()+"', FechaNacimiento = '"+ medico.getFechaNacimiento() +"', Direccion = '"+ medico.getDireccion()+"', Localidad = '"+medico.getLocalidad()+"', Provincia = '"+medico.getProvincia()+"', CorreoElectronico = '"+medico.getCorreo()+"', Telefono = '"+medico.getTelefono()+"', [Cod.Especialidad] = '"+medico.getCodEspecialidad()+"', HorarioDesde = '"+medico.getHorarioDesde()+"',HorarioHasta= '"+medico.getHorarioHasta()+"'";
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
	public boolean borrar(int Dni) { ///Le falta estado a medicos en BD
		boolean estado=false;
		/*cn = new Conexion();
		cn.Open();		 
		String query = "UPDATE medicos SET estado=0 WHERE DNI="+Dni;
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
	
