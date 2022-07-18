<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Agregar Turno</title>

</head>
<body>
Bienvenido/a, NombreDeUsuario!<br>
<h2> AGREGAR TURNO</h2>
<b>Seleccione especialidad:</b><select name="selectE">
								<option>Especialidad 1</option>
								<option>Especialidad 2</option>
								<option>Especialidad 3</option>
								<option>Especialidad 4</option></select><br>
<b>Seleccione Medico:</b><select name="SelectM">
							<option>Doc 1</option>
							<option>Doc 2</option>
							<option>Doc 3</option></select><br>
<b>Seleccione Fecha y Horario</b><select name="SelectF">
							<option>Lunes</option>
							<option>Jueves</option>
							<option>Viernes</option></select>
							<select name="SelectH">
							<option>15:00</option>
							<option>16:00</option>
							<option>18:00</option></select><br>
<b>Seleccione Paciente:</b><select name="SelectP">
							<option>Paciente 1</option>
							<option>Paciente 2</option>
							<option>Paciente 3</option></select><br>
<input type="submit" name="btnAgregarT" value="Agregar"/>

</body>
</html>