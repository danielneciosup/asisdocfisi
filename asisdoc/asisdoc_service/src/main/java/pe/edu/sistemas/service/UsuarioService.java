package pe.edu.sistemas.service;

import pe.edu.sistemas.bo.UsuarioBO;

public interface UsuarioService 
{
	public UsuarioBO obtenerUsuario( Integer usuarioId ) throws Exception; 
}
