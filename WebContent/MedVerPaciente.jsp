<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
	<head>
		<meta charset="UTF-8" />
	        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<meta name="viewport" content="width=device-width, initial-scale=1.0" />
	        <title>Editar Turno</title>
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
						<li class="nav-item"><a class="nav-link" href="MedTurnos.jsp">Mis Turnos</a></li>
		    			</ul>
	        			<span class="navbar-brand">Bienvenido Medico X</span>
					<div class="mx-1">
		        			<a class="btn btn-success" type="submit" href="Login.jsp">Salir</a>
					</div>
				</div>
       			</div>
		</nav>
		<div class="container my-3">
			<div class="row">
				<div class="col-sm-12 col-md-4 mb-3">
					<h2>Manuel Perez</h2>
					<table class="table table-light" style="width: auto;">
						<tr>
							<th>Sexo</th>
							<td>Masculino</td>
						</tr>
						<tr>
							<th>Nacionalidad</th>
							<td>Argentina</td>
						</tr>
						<tr>
							<th>Fecha de Nacimiento</th>
							<td>12/09/1995</td>
						</tr>
						<tr>
							<th>Provincia</th>
							<td>Buenos Aires</td>
						</tr>
						<tr>
							<th>Localidad</th>
							<td>Escobar</td>
						</tr>
						<tr>
							<th>Direccion</th>
							<td>Calle A 123</td>
						</tr>
						<tr>
							<th>Correo Electronico</th>
							<td>mperez@hotmail.com</td>
						</tr>
						<tr>
							<th>Telefono</th>
							<td>1123956729</td>
						</tr>
					</table>
				</div>
				<div class="col-sm-12 col-md-8 mb-3">
					<h2>Turnos</h2>
					<table class="table table-dark table-striped" style="width: auto;">
						<thead>
							<tr>
								<th class="text-center" colspan="2">Medico</th>
								<th class="text-center">Especialidad</th>
								<th class="text-center">Dia</th>
								<th class="text-center">Hora</th>
								<th class="text-center">Estado del Turno</th>
							</tr>
						</thead>
						<tbody>
							<% for(int i=0;i<6;i++){ %>
							<tr>
								<td>Juan</td>
								<td>Torres</td>
								<td>Odontologo</td>
								<td>0<%=1+i%>/05/2019</td>
								<td><%=10+i%>:00</td>
								<td class="text-center">Presente</td>
							</tr>
							<% } %>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</body>
</html>