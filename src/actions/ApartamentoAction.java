package actions;

import persistence.ApartamentoDao;

import com.opensymphony.xwork2.ActionSupport;

import entity.Apartamento;

public class ApartamentoAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private Apartamento apartamento;
	private ApartamentoDao apartamentoDao;

	public ApartamentoAction() {
		apartamento = new Apartamento();
		apartamentoDao = new ApartamentoDao();
	}

	public String saveOrUpdate() {
		try {
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
