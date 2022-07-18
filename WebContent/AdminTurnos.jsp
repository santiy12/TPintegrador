<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
	<head>
		<meta charset="UTF-8" />
	        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<meta name="viewport" content="width=device-width, initial-scale=1.0" />
	        <title>Turnos</title>
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
        					<li class="nav-item"><a class="nav-link active" aria-current="page" href="#">Turnos</a></li>
		    			</ul>
	        			<span class="navbar-brand">Bienvenido Administrador X</span>
					<div class="mx-1">
		        			<a class="btn btn-success" type="submit" href="Login.jsp">Salir</a>
					</div>
				</div>
       			</div>
		</nav>
		<div class="container my-3">
			<form class="col-sm-12 col-md-6 needs-validation" novalidate>
				<div class="form-floating mb-3">
					<input type="text" maxlength="8" class="form-control" id="InputDniMed" required>
					<label for="InputDniMed">DNI del Medico</label>
					<div class="invalid-tooltip">Ingrese un DNI valido</div>
				</div>
				<div class="form-floating mb-3">
					<select class="form-select" id="SelectEspecialidad" required>
						<option selected disabled value=""></option>
						<option>Odontologo</option>
						<option>Pediatra</option>
					</select>
					<label for="SelectEspecialidad">Especialidad</label>
					<div class="invalid-tooltip">Elija una Especialidad</div>
				</div>
				<div class="form-floating mb-3">
					<select class="form-select" id="SelectMedico" required>
						<option selected disabled value=""></option>
						<option>Jose Manuel</option>
						<option>Silvina</option>
					</select>
					<label for="SelectMedico">Medico</label>
					<div class="invalid-tooltip">Elija un Medico</div>
				</div>
				<div class="row">
					<div class="col-6">
						<div class="form-floating mb-3">
							<select class="form-select" id="SelectDia" required>
								<option selected disabled value=""></option>
								<option>Lunes</option>
								<option>Martes</option>
							</select>
							<label for="SelectDia">Dia</label>
							<div class="invalid-tooltip">Elija un Dia</div>
						</div>
					</div>
					<div class="col-6">
						<div class="form-floating mb-3">
							<select class="form-select" id="SelectHorario" required>
								<option selected disabled value=""></option>
								<option>14:00</option>
								<option>15:00</option>
							</select>
							<label for="SelectHorario">Horario</label>
							<div class="invalid-tooltip">Elija un Horario</div>
						</div>
					</div>
				</div>
				<button class="btn btn-success mb-3" type="submit">Agregar Turno</button>
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