package pe.edu.sistemas.service.transformer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;

import pe.edu.sistemas.bo.UsuarioBO;
import pe.edu.sistemas.dao.domain.Usuario;

@ComponentScan( "usuarioTransformerToBO" )
@Scope( "singleton" )
public class UsuarioTranformerToBO 
{
	public UsuarioBO transformer(final Usuario usuario) {
		UsuarioBO usuarioBO = null;
		if(usuario!=null){
			usuarioBO = new UsuarioBO();
			usuarioBO.setUsuario((usuario.getNomUsuario()));
			usuarioBO.setContrasenia(usuario.getPassword());
		}
		return usuarioBO;
	}

	public List<UsuarioBO> transformer(final List<Usuario> lista) {
		List<UsuarioBO> listaUsuarioBO = new ArrayList<UsuarioBO>();
		for (Usuario usuario : lista) {
			listaUsuarioBO.add(transformer(usuario));
		}
		return listaUsuarioBO;
	}
}
