package DaoImplements;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Dao.TurnoDao;
import Entidades.Turno;

public class TurnoDaoInt implements TurnoDao{
	
	private Conexion cn;

	@Override
	public List<Turno> obtenerTodos() {
		cn = new Conexion();
		cn.Open();
		 List<Turno> list = new ArrayList<Turno>();
		 try
		 {
			 ResultSet rs= cn.query("Select turnos.DniMedico, turnos.DiaHorario, turnos.DniPaciente, turnos.Especialidad, turnos.Estado from turnos");
			 while(rs.next())
			 {
				 Turno tur = new Turno();
				 tur.setDniMed(rs.getInt("turnos.DniMedico"));
				 tur.setDiaHorario(rs.getString("turnos.DiaHorario"));
				 tur.setDniPaciente(rs.getInt("turnos.DniPaciente"));
				 tur.setEspecialidad(rs.getString("turnos.Especialidad"));
				 tur.setEstado(rs.getBoolean("turnos.Estado"));
				 
				 list.add(tur);
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
	public Turno obtenerUno(int DniP, int DniM) { ///Deberian tener un Id unico en vez de usar los dnis como claves, los turnos entre medico y paciente se pueden repetir
		cn = new Conexion();
		cn.Open();
		Turno tur = new Turno();
		try
		 {
			 ResultSet rs= cn.query("Select turnos.DniMedico, turnos.DiaHorario, turnos.DniPaciente, turnos.Especialidad, turnos.Estado from turnos where turnos.DniMedico ="+DniM + " && turnos DniPaciente = "+ DniP);
			 rs.next();

			 tur.setDniMed(rs.getInt("turnos.DniMedico"));
			 tur.setDiaHorario(rs.getString("turnos.DiaHorario"));
			 tur.setDniPaciente(rs.getInt("turnos.DniPaciente"));
			 tur.setEspecialidad(rs.getString("turnos.Especialidad"));
			 tur.setEstado(rs.getBoolean("turnos.Estado"));

		 }
		 catch(Exception e)
		 {
			 e.printStackTrace();
		 }
		 finally
		 {
			 cn.close();
		 }
		return tur;
	}

	@Override
	public boolean insertar(Turno turno) {
	boolean f=false;

	cn = new Conexion();
	cn.Open();	

	String query = "INSERT INTO turnos (DniMedico,DiaHorario,DniPaciente,Especialidad,Estado) VALUES ("+turno.getDniMed()+",'"+turno.getDiaHorario()+"',"+turno.getDniPaciente()+", '"+turno.getEspecialidad()+"','"+turno.isEstado()+")";
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
	public boolean editar(Turno turno) {
		boolean f=false;

		cn = new Conexion();
		cn.Open();	

		String query = "UPDATE turnos SET DniMedico = '"+turno.getDniMed()+"', DiaHorario = '"+turno.getDiaHorario()+"', DniPaciente = '"+turno.getDniPaciente()+"', Especialidad = '"+turno.getEspecialidad()+"', Estado = '"+turno.isEstado()+"'";
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
	public boolean borrar(int DniP, int DniM /*,int Cod*/) {///cambiar las lineas de query si hace falta
		boolean estado=false;
		cn = new Conexion();
		cn.Open();		 
		String query = "UPDATE turnos SET Estado=0 WHERE DniMedico ="+DniM +" && DniPaciente = "+DniP;
		/*String query = "UPDATE turnos SET Estado=0 WHERE Cod ="+ Cod;*/
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
