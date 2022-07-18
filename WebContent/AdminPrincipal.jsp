<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
	<head>
		<meta charset="UTF-8" />
	        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<meta name="viewport" content="width=device-width, initial-scale=1.0" />
	        <title>ABMLPaciente</title>
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
						<li class="nav-item"><a class="nav-link" href="AdminAltaMedico.jsp">Agregar Medico</a></li>
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
	</body>
</html>