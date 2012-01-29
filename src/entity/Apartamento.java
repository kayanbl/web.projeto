package entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import enums.StatusApartamento;

@Entity
public class Apartamento {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idApartamento;
    @OneToOne
    private Endereco endereco;
    @OneToMany(mappedBy = "apartamento")
    private List<Despesa> despesa;
    @Enumerated(EnumType.STRING)
    private StatusApartamento statusApartamento;

    public Long getIdApartamento() {
	return idApartamento;
    }

    public void setIdApartamento(Long idApartamento) {
	this.idApartamento = idApartamento;
    }

    public Endereco getEndereco() {
	return endereco;
    }

    public void setEndereco(Endereco endereco) {
	this.endereco = endereco;
    }

    public List<Despesa> getDespesa() {
	return despesa;
    }

    public void setDespesa(List<Despesa> despesa) {
	this.despesa = despesa;
    }

    public StatusApartamento getStatusApartamento() {
	return statusApartamento;
    }

    public void setStatusApartamento(StatusApartamento statusApartamento) {
	this.statusApartamento = statusApartamento;
    }

}
