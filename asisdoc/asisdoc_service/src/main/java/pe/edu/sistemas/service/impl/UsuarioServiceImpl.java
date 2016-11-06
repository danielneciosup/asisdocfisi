package pe.edu.sistemas.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.sistemas.bo.UsuarioBO;
import pe.edu.sistemas.dao.UsuarioDAO;
import pe.edu.sistemas.dao.domain.Usuario;
import pe.edu.sistemas.service.UsuarioService;
import pe.edu.sistemas.service.transformer.UsuarioTranformerToBO;

@Service( "usuarioService" )
public class UsuarioServiceImpl implements UsuarioService 
{
	@Autowired
	private UsuarioDAO usuarioDao;
	
	@Autowired
	private UsuarioTranformerToBO usuarioTranformerToBO;

	public UsuarioBO obtenerUsuario(Integer usuarioId) throws Exception 
	{
		Usuario usuarioEntidad = usuarioDao.obtenerUsuario( usuarioId );
		return usuarioTranformerToBO.transformer( usuarioEntidad );
	}	
}
