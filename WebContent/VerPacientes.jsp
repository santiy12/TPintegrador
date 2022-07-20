<%@page import="Entidades.Paciente"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
	<head>
		<meta charset="UTF-8" />
	        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<meta name="viewport" content="width=device-width, initial-scale=1.0" />
	        <title>Ver Pacientes</title>
	        <!-- Bootstrap -->
	        <link rel="stylesheet" href="css/bootstrap.min.css" />
	</head>
	<body>
		<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  			<div class="container-fluid">
	    			<a class="navbar-brand" href="#">Clinica Medica UTN</a>
				<button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      			    		<span class="navbar-toggler-icon"></span>
				</button>
				<div class="collapse navbar-collapse" id="navbarSupportedContent">
	    				<ul class="navbar-nav me-auto mb-2 mb-lg-0">
						<li class="nav-item"><a class="nav-link active" aria-current="page" href="#">Agregar Medico</a></li>
						<li class="nav-item"><a class="nav-link" href="AdminAltaPaciente.jsp">Agregar Paciente</a></li>
        					<li class="nav-item"><a class="nav-link" href="AdminTurnos.jsp">Turnos</a></li>
		    			</ul>
						<span class="navbar-brand">Bienvenido Administrador X</span>
					<div class="mx-1">
		        			<a class="btn btn-success" type="submit" href="Login.jsp">Salir</a>
					</div>
				</div>
       			</div>
		</nav>
		<% if(request.getAttribute("Elimino")!= null){
			
			String elimino = request.getAttribute("Elimino").toString();
			
			if(elimino.equals("0")){
				%>
				Error al dar de baja a paciente 
				<%
			}
			else if (elimino.equals("1")){
				%>
				Se dio de baja al paciente
				<%
			}
			}%>
	
		 <%
               ArrayList<Paciente> listar = null;

                if (request.getAttribute("ListaPacientes") != null) {

                               listar = (ArrayList<Paciente>) request.getAttribute("ListaPacientes");
                               
                              System.out.println("if Lista Pacientes");

                }

           
%>           
		<div class="container my-3">
			<div class="row">
				<div class="col-12 mb-3">
					<table class="table table-dark table-striped" style="width: auto;">
						<thead>
							<tr>
								<th>Dni</th>
								<th>Nombre</th>
								<th>Apellido</th>
								<th>Sexo</th>
								<th>Nacionalidad</th>
								<th>Nacimiento</th>
								<th>Provincia</th>
								<th>Localidad</th>
								<th>Direccion</th>
								<th>Correo</th>
								<th>Telefono</th>
								<th></th>
								<th></th>
							</tr>
						</thead>
						<tbody>
							<% 

			                if (listar != null) {

			                               for (Paciente paci : listar) { System.out.println(paci.toString());%>
			                               
							<tr>
							
							<form action="servletPaciente" method="post" >
								<td><%= paci.getDni() %><input type="hidden" name="DniPaciente" value="<%= paci.getDni() %>" ></input></td>
								<td><%= paci.getNombre() %></td>
								<td><%= paci.getApellido() %></td>
								<td><%= paci.getSexo() %></td>
								<td><%= paci.getNacionalidad()%></td>
								<td><%= paci.getFechaNacimiento() %></td>
								<td><%= paci.getProvincia() %></td>
								<td><%= paci.getLocalidad() %></td>
								<td><%= paci.getDireccion()%></td>
								<td><%= paci.getCorreo() %></td>
								<td><%= paci.getTelefono() %></td>
								<td> <input type="submit" name="btnEliminar" value="Eliminar" > <td>
								<td> <input type="submit" name="btnEditar" value="editar" > <td>
								</form>
							</tr>
							<%}        }%>  
							
						</tbody>
					</table>
				</div>
			</div>
		</div>
		
	</body>
</html>