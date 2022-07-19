<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
	<head>
		<meta charset="UTF-8" />
	        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<meta name="viewport" content="width=device-width, initial-scale=1.0" />
	        <title>Agregar Paciente</title>
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
		<div class="container my-3">
			<form class="row needs-validation"  method="get" action="servletPaciente" novalidate>
				<div class="col-sm-12 col-md-4 mb-3">
					<div class="form-floating">
						<input type="text" maxlength="8" class="form-control" name="InputDni" required>
						<label for="InputDni">DNI</label>
						<div class="invalid-tooltip">Ingrese un DNI valido</div>
					</div>
				</div>
				<div class="col-sm-12 col-md-4 mb-3">
					<div class="form-floating">
						<input type="text" class="form-control" name="InputNombre" required>
						<label for="InputNombre">Nombre</label>
						<div class="invalid-tooltip">Ingrese un Nombre</div>
					</div>
				</div>
				<div class="col-sm-12 col-md-4 mb-3">
					<div class="form-floating">
						<input type="text" class="form-control" name="InputApellido" required>
						<label for="InputApellido">Apellido</label>
						<div class="invalid-tooltip">Ingrese un Apellido</div>
					</div>
				</div>
				<div class="col-sm-12 col-md-4 mb-3">
					<div class="form-floating">
						<select class="form-select" name="SelectSexo" placeholder="Sexo" required>
							<option selected disabled value=""></option>
							<option value="Femenino">Femenino</option>
							<option value="Masculino">Masculino</option>
						</select>
						<label for="SelectSexo">Sexo</label>
						<div class="invalid-tooltip">Elija un Sexo</div>
					</div>
				</div>
				<div class="col-sm-12 col-md-4 mb-3">
					<div class="form-floating">
						<input type="text" class="form-control" name="InputNacionalidad" required>
						<label for="InputNacionalidad">Nacionalidad</label>
						<div class="invalid-tooltip">Elija una Nacionalidad</div>
					</div>
				</div>
				<div class="col-sm-12 col-md-4 mb-3">
					<div class="form-floating">
						<input type="date" class="form-control" name="InputNacimiento" required>
						<label for="InputNacimiento">Nacimiento</label>
						<div class="invalid-tooltip">Elija una Fecha de Nacimiento</div>
					</div>
				</div>
				
				<div class="col-sm-12 col-md-4 mb-3">
					<div class="form-floating">
						<input type="text" class="form-control" name="InputProvincia" required>
						<label for="InputProvincia">Provincia</label>
						<div class="invalid-tooltip">Ingrese una Provincia</div>
					</div>
				</div>
				<div class="col-sm-12 col-md-4 mb-3">
					<div class="form-floating">
						<input type="text" class="form-control" name="InputLocalidad" required>
						<label for="InputLocalidad">Localidad</label>
						<div class="invalid-tooltip">Ingrese una Localidad</div>
					</div>
				</div>
				<div class="col-sm-12 col-md-4 mb-3">
					<div class="form-floating">
						<input type="text" class="form-control" name="InputDireccion" required>
						<label for="InputDireccion">Direccion</label>
						<div class="invalid-tooltip">Ingrese una Direccion</div>
					</div>
				</div>
				<div class="col-sm-12 col-md-4 mb-3">
					<div class="form-floating">
						<input type="email" class="form-control" name="InputEmail" required>
						<label for="InputEmail">Correo Electronico</label>
						<div class="invalid-tooltip">Ingrese un Correo valido</div>
					</div>
				</div>
				<div class="col-sm-12 col-md-4 mb-3">
					<div class="form-floating">
						<input type="text" maxlength="8" class="form-control" name="InputTelefono" required>
						<label for="InputTelefono">Telefono</label>
						<div class="invalid-tooltip">Ingrese un Numero de Telefono</div>
					</div>
				</div>
				<div class="col-sm-12 col-md-4 mb-3">
				</div>
				<div class="col-12 mb-3">
					<button class="btn btn-success" name="btnAgregar" value="agregar" type="submit">Agregar Paciente</button>
				</div>
			</form>
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