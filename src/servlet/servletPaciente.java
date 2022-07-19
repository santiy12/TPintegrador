package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Entidades.Paciente;
import Negocio.PacNeg;
import NegocioImplements.PacNegInt;

/**
 * Servlet implementation class servletPaciente
 */
@WebServlet("/servletPaciente")
public class servletPaciente extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servletPaciente() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		if(request.getParameter("btnAgregar")!= null) {
			
			Paciente paci = new Paciente();
			
			paci.setDni(Integer.parseInt(request.getParameter("InputDni")));
			paci.setNombre(request.getParameter("InputNombre"));
			paci.setApellido(request.getParameter("InputApellido"));
			paci.setSexo(request.getParameter("SelectSexo"));
			paci.setNacionalidad(request.getParameter("InputNacionalidad"));
			paci.setFechaNacimiento(request.getParameter("InputNacimiento"));
			paci.setProvincia(request.getParameter("InputProvincia"));
			paci.setLocalidad(request.getParameter("InputLocalidad"));
			paci.setDireccion(request.getParameter("InputDireccion"));
			paci.setCorreo(request.getParameter("InputEmail"));
			paci.setTelefono(Integer.parseInt(request.getParameter("InputTelefono")));
			
			PacNegInt pacneg = new PacNegInt();
		
			pacneg.insertar(paci);
			//System.out.println(paci.toString()); 
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
