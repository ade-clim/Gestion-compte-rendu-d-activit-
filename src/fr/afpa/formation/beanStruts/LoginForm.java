package fr.afpa.formation.beanStruts;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

public class LoginForm extends ActionForm{

	private String login;
	private String password;
	private String role;
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	/**
	 * @param login
	 * @param password
	 * @param role
	 */
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	
	public ActionErrors validate() {
		 ActionErrors errors = new ActionErrors();
		 return errors;
	 }
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		 this.login = null;
		 this.password = null;
		 this.role = null;
	 }
	
	
	
}
