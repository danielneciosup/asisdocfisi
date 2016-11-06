package pe.edu.sistemas.bo;

import java.io.Serializable;

public class UsuarioBO implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5508317212779115693L;
	private String usuario;
	private String contrasenia;
	
	public UsuarioBO() {
	
	}

	public UsuarioBO(String usuario, String contrasenia) {
		super();
		this.usuario = usuario;
		this.contrasenia = contrasenia;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}
}
