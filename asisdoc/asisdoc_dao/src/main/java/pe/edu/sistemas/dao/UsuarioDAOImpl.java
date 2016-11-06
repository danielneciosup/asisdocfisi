package pe.edu.sistemas.dao;

import pe.edu.sistemas.core.dao.DAOImpl;
import pe.edu.sistemas.dao.domain.Usuario;

public class UsuarioDAOImpl extends DAOImpl<Usuario, Integer> implements UsuarioDAO 
{

	public Usuario obtenerUsuario(Integer usuarioId) throws Exception
	{
		return super.obtenerEntidadPorId( Usuario.class, usuarioId);
	}

}
