package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.corba.se.spi.protocol.RequestDispatcherRegistry;

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
      //System.out.println("entro aca"); 
 
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//System.out.println("entro aca"); 
		
		if (request.getParameter("Param").equals("MostrarLista")) {
			System.out.println("if param mostrar lista");
			PacNegInt pacneg = new PacNegInt();
			ArrayList<Paciente> list =  (ArrayList<Paciente>) pacneg.obtenerTodos();
			
			
			request.setAttribute("ListaPacientes", list);

			RequestDispatcher rd = request.getRequestDispatcher("/VerPacientes.jsp");

			rd.forward(request, response);
			
		}
		
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
			Paciente pacAux = new Paciente();
		
			 pacAux = pacneg.obtenerUno(paci.getDni());
			 int Dni = pacAux.getDni();
			if (Dni == paci.getDni()) {
				request.setAttribute("registro", 0);
				System.out.println("paciente ya existe");
			}
			else {
				request.setAttribute("registro", pacneg.insertar(paci)); 
			}
			RequestDispatcher rd = request.getRequestDispatcher("/AdminAltaPaciente.jsp");
			rd.forward(request, response); 

			//System.out.println(paci.toString()); 
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		if(request.getParameter("btnEliminar")!= null) {
			Paciente paci = new Paciente();
			
			paci.setDni(Integer.parseInt(request.getParameter("DniPaciente")));
			
			PacNegInt pacneg = new PacNegInt();
			if(pacneg.borrar(paci.getDni())) {
				request.setAttribute("Elimino", 1);
				System.out.println("paciente eliminado");
				
			}
			else {
				request.setAttribute("Elimino",0);
				System.out.println("error al Eliminar paciente");
			}
			
			ArrayList<Paciente> list =  (ArrayList<Paciente>) pacneg.obtenerTodos();
			
			
			request.setAttribute("ListaPacientes", list);

			RequestDispatcher rd = request.getRequestDispatcher("/VerPacientes.jsp");
			rd.forward(request, response); 
		}
		
		
	}

}
