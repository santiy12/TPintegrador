<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
	<head>
		<meta charset="UTF-8" />
	        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<meta name="viewport" content="width=device-width, initial-scale=1.0" />
	        <title>Agregar Medico</title>
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
		<form action="/servletMed" method="get">
		<div class="container my-3">
			<form class="row needs-validation" novalidate>
				<div class="col-sm-12 col-md-4 mb-3">
					<div class="form-floating">
						<input type="text" maxlength="8" class="form-control" id="InputDni" required>
						<label for="InputDni">DNI</label>
						<div class="invalid-tooltip">Ingrese un DNI valido</div>
					</div>
				</div>
				<div class="col-sm-12 col-md-4 mb-3">
					<div class="form-floating">
						<input type="text" class="form-control" id="InputNombre" required>
						<label for="InputNombre">Nombre</label>
						<div class="invalid-tooltip">Ingrese un Nombre</div>
					</div>
				</div>
				<div class="col-sm-12 col-md-4 mb-3">
					<div class="form-floating">
						<input type="text" class="form-control" id="InputApellido" required>
						<label for="InputApellido">Apellido</label>
						<div class="invalid-tooltip">Ingrese un Apellido</div>
					</div>
				</div>
				<div class="col-sm-12 col-md-4 mb-3">
					<div class="form-floating">
						<select class="form-select" id="SelectSexo" required>
							<option selected disabled value=""></option>
							<option>Femenino</option>
							<option>Masculino</option>
						</select>
						<label for="SelectSexo">Sexo</label>
						<div class="invalid-tooltip">Elija un Sexo</div>
					</div>
				</div>
				<div class="col-sm-12 col-md-4 mb-3">
					<div class="form-floating">
						<input type="text" class="form-control" id="InputNacionalidad" required>
						<label for="InputNacionalidad">Nacionalidad</label>
						<div class="invalid-tooltip">Elija una Nacionalidad</div>
					</div>
				</div>
				<div class="col-sm-12 col-md-4 mb-3">
					<div class="form-floating">
						<input type="date" class="form-control" id="InputNacimiento" required>
						<label for="InputNacimiento">Nacimiento</label>
						<div class="invalid-tooltip">Elija una Fecha de Nacimiento</div>
					</div>
				</div>
				
				<div class="col-sm-12 col-md-4 mb-3">
					<div class="form-floating">
						<input type="text" class="form-control" id="InputProvincia" required>
						<label for="InputProvincia">Provincia</label>
						<div class="invalid-tooltip">Ingrese una Provincia</div>
					</div>
				</div>
				<div class="col-sm-12 col-md-4 mb-3">
					<div class="form-floating">
						<input type="text" class="form-control" id="InputLocalidad" required>
						<label for="InputLocalidad">Localidad</label>
						<div class="invalid-tooltip">Ingrese una Localidad</div>
					</div>
				</div>
				<div class="col-sm-12 col-md-4 mb-3">
					<div class="form-floating">
						<input type="text" class="form-control" id="InputDireccion" required>
						<label for="InputDireccion">Direccion</label>
						<div class="invalid-tooltip">Ingrese una Direccion</div>
					</div>
				</div>
				<div class="col-sm-12 col-md-4 mb-3">
					<div class="form-floating">
						<input type="email" class="form-control" id="InputEmail" required>
						<label for="InputEmail">Correo Electronico</label>
						<div class="invalid-tooltip">Ingrese un Correo valido</div>
					</div>
				</div>
				<div class="col-sm-12 col-md-4 mb-3">
					<div class="form-floating">
						<input type="text" class="form-control" id="InputTel" required>
						<label for="InputTel">Telefono</label>
						<div class="invalid-tooltip">Ingrese un Nro de telefono</div>
					</div>
				</div>
				<div class="col-sm-12 col-md-4 mb-3">
					<div class="form-floating">
						<select class="form-select" id="SelectEspecialidad" required>
							<option selected disabled value=""></option>
							<option>Odontologo</option>
							<option>Pediatra</option>
						</select>
						<label for="SelectEspecialidad">Especialidad</label>
						<div class="invalid-tooltip">Elija un Sexo</div>
					</div>
				</div>
				<div class="col-sm-12 col-md-4 mb-3">
				</div>
				<div class="col-12 mb-3">
					<label for="CheckLunes" class="form-label">Dias de Atencion</label>
					<div class="input-group">
						<div class="input-group-text">
							<input class="form-check-input me-1" type="checkbox" value="" id="CheckLunes">
							<label class="form-check-label" for="CheckLunes">Lunes</label>
						</div>
						<div class="input-group-text">
							<input class="form-check-input me-1" type="checkbox" value="" id="CheckMartes">
							<label class="form-check-label" for="CheckMartes">Martes</label>
						</div>
						<div class="input-group-text">
							<input class="form-check-input me-1" type="checkbox" value="" id="CheckMiercoles">
							<label class="form-check-label" for="CheckMiercoles">Miercoles</label>
						</div>
						<div class="input-group-text">
							<input class="form-check-input me-1" type="checkbox" value="" id="CheckJueves">
							<label class="form-check-label" for="CheckJueves">Jueves</label>
						</div>
						<div class="input-group-text">
							<input class="form-check-input me-1" type="checkbox" value="" id="CheckViernes">
							<label class="form-check-label" for="CheckViernes">Viernes</label>
						</div>
						<div class="input-group-text">
							<input class="form-check-input me-1" type="checkbox" value="" id="CheckSabado">
							<label class="form-check-label" for="CheckSabado">Sabado</label>
						</div>
						<div class="input-group-text">
							<input class="form-check-input me-1" type="checkbox" value="" id="CheckDomingo">
							<label class="form-check-label" for="CheckDomingo">Domingo</label>
						</div>
					</div>
				</div>
				<div class="col-12 mb-3">
					<div class="input-group">
						<span class="input-group-text" id="Horario">De</span>
						<div class="input-group-text">
							<input type="time" class="form-control" id="InputHEntrada" required>
						</div>
						<span class="input-group-text">Hasta</span>
						<div class="input-group-text">
							<input type="time" class="form-control" id="InputHSalida" required>
						</div>
					</div>
				</div>
				<div class="col-sm-12 col-md-4 mb-3">
					<div class="form-floating">
						<input type="text" class="form-control" id="InputContrasena" required>
						<label for="InputContrasena">contrasena</label>
						<div class="invalid-tooltip">Ingrese una contraserna para su cuenta</div>
					</div>
				</div>
				<div class="col-12 mb-3">
					<button class="btn btn-success" type="submit">Agregar Medico</button>
				</div>
			</form>
		</div>
		<%if(request.getAttribute("mensajeAlert") != null){%>
	 		$('.toast-body').html('<span><%=request.getAttribute("mensaje") %></span><button class="btn" type="button" data-bs-dismiss="toast"><i class="bi bi-x-lg"></i></button>')
	        $('.toast').toast('show');
	 		<% } %>
			
		</form>
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