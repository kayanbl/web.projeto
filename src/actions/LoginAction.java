package actions;

import persistence.LoginDao;
import entity.Pessoa;

public class LoginAction extends Page {

	private static final long serialVersionUID = 1L;
	private Pessoa pessoa;
	private LoginDao loginDao;

	public LoginAction() {
		pessoa = new Pessoa();
		loginDao = new LoginDao();
	}

	public String logar() {

		if (loginDao.logar(pessoa.getUsuario(), pessoa.getSenha()) == true) {
			return SUCCESS;
		} else {
			addActionError("O nome de usuário ou a senha estão incorretos.");
			return INPUT;
		}
	}

	public String execute() {
		return SUCCESS;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

}
