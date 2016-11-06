package pe.edu.sistemas.model;

import javax.enterprise.context.RequestScoped;

import org.springframework.stereotype.Component;

@Component( "loginModel" )
@RequestScoped
public class LoginModel 
{
	private String usuario;
	private String clave;
	
	public LoginModel() {
	
	}
	
	public String getClave() {
		return clave;
	}
	
	public String getUsuario() {
		return usuario;
	}
	
	public void setClave(String clave) {
		this.clave = clave;
	}
	
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
}
