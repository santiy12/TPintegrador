package Negocio;

import java.util.List;

import Entidades.Usuario;

public interface UsuarioNeg {

	public List<Usuario> obtenerTodos();
	public Usuario obtenerUno(int DniP);
	public boolean insertar(Usuario usuario);
	public boolean editar(Usuario usuario);
	public boolean borrar(int Dni);
}
