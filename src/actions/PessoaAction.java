package actions;

import java.util.ArrayList;
import java.util.List;

import entity.Pessoa;

public class PessoaAction extends Page {

    private static final long serialVersionUID = 1L;
    private Pessoa pessoa;
    private List<String> sexo;

    public PessoaAction() {
	pessoa = new Pessoa();
    }

    public String execute() {
	sexo = new ArrayList<String>();
	sexo.add("Masculino");
	sexo.add("Feminino");

	return SUCCESS;
    }

    public List<String> getSexo() {
	return sexo;
    }

    public Pessoa getPessoa() {
	return pessoa;
    }
}
