package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.org.apache.xpath.internal.operations.And;

import Entidades.Usuario;
import Negocio.UsuarioNeg;
import NegocioImplements.UsuarioNegInt;

/**
 * Servlet implementation class servletUsuario
 */
@WebServlet("/servletUsuario")
public class servletUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servletUsuario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if (request.getParameter("btnLogin")!= null) {
			Usuario user = new Usuario();
			user.setDNI(Integer.parseInt(request.getParameter("txtDni")) );
			user.setClave(request.getParameter("TxtPass"));
			
			UsuarioNegInt negUser = new UsuarioNegInt();
			Usuario UserAux = negUser.obtenerUno(user.getDNI());
			System.out.println(UserAux.getDNI()); //para poder ver que datos trae de la base de datos utilizar estas lineas
			System.out.println(UserAux.getClave());
			System.out.println(UserAux.isTipoUsuario());
			System.out.println(UserAux.isEstado());
			
			String clave1= user.getClave();
			String clave2 = UserAux.getClave();
			if(clave2.equals(clave1)) {
				System.out.println("entro al if de claves");
			}
			if(user.getDNI()==UserAux.getDNI() && clave2.equals(clave1) ) {
		
				request.getSession().setAttribute("usuario", UserAux.getDNI());
					if(UserAux.isTipoUsuario()) {
						request.getSession().setAttribute("Medico", UserAux.getDNI());
					RequestDispatcher rd = request.getRequestDispatcher("/MedTurnos.jsp");
					rd.forward(request, response);
					}
					else {
				
						request.getSession().setAttribute("usuario", UserAux.getDNI());
						RequestDispatcher rd = request.getRequestDispatcher("/AdminPrincipal.jsp");
						rd.forward(request, response);
					
					}
				
			}
			else {
				request.setAttribute("usuario", 3);
				RequestDispatcher rd = request.getRequestDispatcher("/Login.jsp");
				rd.forward(request, response);
			}
			
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
