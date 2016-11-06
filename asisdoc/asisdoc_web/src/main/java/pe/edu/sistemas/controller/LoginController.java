package pe.edu.sistemas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import pe.edu.sistemas.model.LoginModel;

@Controller( "loginController" )
public class LoginController 
{
	@Autowired
	private LoginModel loginModel;
	
	public String entrar(){
		System.out.println(this.loginModel.getUsuario());
		System.out.println(this.loginModel.getClave());
		return "index.jsp";
	}	
	
	public LoginModel getLoginModel() {
		return loginModel;
	}
}

