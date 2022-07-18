package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.MedDao;
import DaoImplements.MedDaoInt;
import Entidades.Medico;
import Entidades.Usuario;
import Negocio.MedNeg;
import Negocio.UsuarioNeg;
import NegocioImplements.MedNegInt;
import NegocioImplements.UsuarioNegInt;



/**
 * Servlet implementation class servletMed
 */
@WebServlet("/servletMed")
public class servletMed extends HttpServlet {
	private static final long serialVersionUID = 1L;
     

	MedNeg negMed = new MedNegInt();
	UsuarioNeg negUsu = new UsuarioNegInt();
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servletMed() {
        super();
        // TODO Auto-generated constructor stub
    }

    
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		if(request.getParameter("btnAceptar")!=null)
		{
			Medico medic = new Medico();
			medic.setDni(Integer.parseInt(request.getParameter("InputDni")));
			medic.setNombre(request.getParameter("InputNombre"));
			medic.setApellido(request.getParameter("InputApellido"));
			medic.setSexo(request.getParameter("SelectSexo"));
			medic.setNacionalidad(request.getParameter("InputNacionalidad"));
			medic.setFechaNacimiento(request.getParameter("InputNacimiento"));
			medic.setDireccion(request.getParameter("InputDireccion"));
			medic.setLocalidad(request.getParameter("InputLocalidad"));
			medic.setProvincia(request.getParameter("InputProvincia"));
			medic.setCorreo(request.getParameter("InputEmail"));
			medic.setTelefono(Integer.parseInt(request.getParameter("InputTel")));
			medic.setCodEspecialidad(request.getParameter("1"));
			Usuario user = new Usuario();
			user.setDNI(Integer.parseInt(request.getParameter("InputDni")));
			user.setClave(request.getParameter("InputContrasena"));
			
			String mensaje;
			boolean estado;
	    	if(estado = negMed.insertar(medic))
	    	{
	    		negUsu.insertar(user);
	    		mensaje="MedicoAgregado";
	    	}
	    	else {
	    		mensaje="No se pudo Agregar";
	    	}
	    	request.setAttribute("mesaje", mensaje);
	    	RequestDispatcher rd = request.getRequestDispatcher("/Login.jsp");
			rd.forward(request, response);
	    	
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
