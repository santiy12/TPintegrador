package Entidades;

public class Usuario {
private int DNI;
private String clave;
private boolean tipoUsuario;
private boolean Estado;


public Usuario()
{}


public Usuario(int Dni, String clave, boolean tipoUsuario, boolean estado) {
	super();
	DNI = Dni;
	this.clave = clave;
	this.tipoUsuario = tipoUsuario;
	Estado = estado;
}





public int getDNI() {
	return DNI;
}


public void setDNI(int dNI) {
	DNI = dNI;
}


public String getClave() {
	return clave;
}


public void setClave(String clave) {
	this.clave = clave;
}


public boolean isTipoUsuario() {
	return tipoUsuario;
}


public void setTipoUsuario(boolean tipoUsuario) {
	this.tipoUsuario = tipoUsuario;
}


public boolean isEstado() {
	return Estado;
}


public void setEstado(boolean estado) {
	Estado = estado;
}


@Override
public String toString() {
	return "Usuario [DNI=" + DNI + ", clave=" + clave + ", tipoUsuario=" + tipoUsuario + ", Estado=" + Estado + "]";
}


}
