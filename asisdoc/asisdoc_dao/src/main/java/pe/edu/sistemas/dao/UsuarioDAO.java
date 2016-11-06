package pe.edu.sistemas.dao;

import pe.edu.sistemas.dao.domain.Usuario;

public interface UsuarioDAO
{
	public Usuario obtenerUsuario( Integer usuarioId ) throws Exception;
}
