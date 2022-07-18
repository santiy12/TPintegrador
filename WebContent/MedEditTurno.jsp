<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Editar Turno</title>
</head>
<body>
Bienvenido/a, NombreDeUsuario!<br>

<h3><b>Editar turno numero X</b></h3>
Paciente: Fulano Rodriguez <br>
Sexo: n/s <br>
Edad: xx <br>
Fecha de Nacimiento: dd/mm/aaaa <br>
Nacionalidad: Argentino/a<br>
Provincia: Buenos Aires<br>
Localidad: Gral. Pacheco<br>
Direccion: Av. Hipólito Yrigoyen 288<br>
Fecha: dd/mm/aaaa<br>
Horario: hh:mm<br>
Estado actual: estado<br>
Cambiar a: <select name="selectE">
			<option value=0>-Seleccionar Estado-</option>
			<option value=1>Presente</option>
			<option value=2>Ausente</option>
			
</select><br>
<% if( "selectE" == "1") {%>

<input type="text" width=500 height=500 /><br>
<input type="submit" value="Editar Estado" />


<%}%><br>
</body>
</html>