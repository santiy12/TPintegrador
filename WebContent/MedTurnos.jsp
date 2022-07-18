<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
	<head>
		<meta charset="UTF-8" />
	        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<meta name="viewport" content="width=device-width, initial-scale=1.0" />
	        <title>Mis Turnos</title>
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
						<li class="nav-item"><a class="nav-link active" aria-current="page" href="#">Mis Turnos</a></li>
		    			</ul>
	        			<span class="navbar-brand">Bienvenido Medico X</span>
					<div class="mx-1">
		        			<a class="btn btn-success" type="submit" href="Login.jsp">Salir</a>
					</div>
				</div>
       			</div>
		</nav>
		<div class="container my-3">
			<form class="row needs-validation" novalidate>
				<div class="col-sm-6 col-md-3 mb-3">
					<select class="form-select" id="SelectCampo" required>
						<option selected disabled value="">CAMPO</option>
						<option>DNI</option>
						<option>Nombre</option>
						<option>Apellido</option>
						<option>Dia</option>
						<option>Horario</option>
						<option>Estado del Turno</option>
					</select>
					<div class="invalid-feedback">Elija un Campo</div>
				</div>
				<div class="col-sm-6 col-md-2 mb-3">
					<select class="form-select" id="SelectCriterio" required>
						<option selected disabled value="">CRITERIO</option>
						<option>Es</option>
						<option>No Es</option>
						<option>Contiene</option>
						<option>No Contiene</option>
					</select>
					<div class="invalid-feedback">Elija un Criterio</div>
				</div>
				<div class="col-sm-12 col-md-3 mb-3">
					<input type="text" class="form-control" required>
					<div class="invalid-feedback">Ingrese algo a Buscar</div>
				</div>
				<div class="col-sm-12 col-md-4 mb-3">
					<div class="btn-group" role="group" aria-label="Basic example">
						<button class="btn btn-success" type="submit">Buscar</button>
						<a class="btn btn-secondary">Quitar Filtros</a>
					</div>
				</div>
			</form>
			<div class="my-5"></div>
			<div class="row">
				<div class="col-sm-12 col-md-9 mb-3">
					<table class="table table-dark table-striped" style="width: auto;">
						<thead>
							<tr>
								<th class="text-center">Estado del Turno</th>
								<th>Dia</th>
								<th>Hora</th>
								<th class="text-center" colspan="2">Paciente</th>
								<th>DNI</th>
								<th class="text-center">Ver Paciente</th>
								<th></th>
							</tr>
						</thead>
						<tbody>
							<% for(int i=0;i<9;i++){ %>
							<tr>
								<td><select class="form-select form-select-sm" id="SelectEstado<%=i%>">
									<option value="1">Libre</option>
									<option value="2" selected>Ocupado</option>
									<option value="3">Presente</option>
									<option value="4">Ausente</option>
								</select></td>
								<td>Lunes</td>
								<td><%=10+i%>:00</td>
								<td>Juan</td>
								<td>Perez</td>
								<td><%=11111111*(i+1)%></td>
								<td class="text-center"><a class="btn btn-sm btn-success" type="submit" href="#">Ver</a></td>
								<td><a class="btn btn-sm btn-secondary" type="submit" href="#">Guardar</a></td>
							</tr>
							<% } %>
						</tbody>
					</table>
				</div>
			</div>
		</div>
		<script>
		(() => {
  			'use strict'

 		 	// Fetch all the forms we want to apply custom Bootstrap validation styles to
  			const forms = document.querySelectorAll('.needs-validation')

  			// Loop over them and prevent submission
  			Array.from(forms).forEach(form => {
    				form.addEventListener('submit', event => {
      					if (!form.checkValidity()) {
        					event.preventDefault()
        					event.stopPropagation()
      					}

      					form.classList.add('was-validated')
    				}, false)
  			})
		})()
		</script>
	</body>
</html>