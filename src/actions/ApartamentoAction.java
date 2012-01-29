package actions;

import persistence.ApartamentoDao;
import entity.Apartamento;
import enums.StatusApartamento;

public class ApartamentoAction extends Page {

    private static final long serialVersionUID = 1L;
    private Apartamento apartamento;
    private ApartamentoDao apartamentoDao;

    public ApartamentoAction() {
	apartamento = new Apartamento();
	apartamentoDao = new ApartamentoDao();
    }

    public String execute() {
	return SUCCESS;
    }

    public String saveOrUpdate() {
	try {
	    apartamento.setStatusApartamento(StatusApartamento.DISPONIVEL);
	    apartamentoDao.saveOrUpdate(apartamento);
	    addActionMessage("Apartamento gravado.");
	} catch (Exception e) {
	    addActionError("Não foi possível cadastrar o apartamento.");
	    e.printStackTrace();
	}

	return SUCCESS;
    }

    public Apartamento getApartamento() {
	return apartamento;
    }

}
