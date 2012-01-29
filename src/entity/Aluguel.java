package entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "Aluguel")
public class Aluguel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idAluguel;
    @OneToOne
    private Pessoa pessoa;
    @OneToOne
    private Apartamento apartamento;
    private Double valorDiaria;
    @Temporal(TemporalType.DATE)
    private Date dataEntrada;
    @Temporal(TemporalType.DATE)
    private Date dataSaida;

    public Long getIdAluguel() {
	return idAluguel;
    }

    public void setIdAluguel(Long idAluguel) {
	this.idAluguel = idAluguel;
    }

    public Pessoa getPessoa() {
	return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
	this.pessoa = pessoa;
    }

    public Apartamento getApartamento() {
	return apartamento;
    }

    public void setApartamento(Apartamento apartamento) {
	this.apartamento = apartamento;
    }

    public Double getValorDiaria() {
	return valorDiaria;
    }

    public void setValorDiaria(Double valorDiaria) {
	this.valorDiaria = valorDiaria;
    }

    public Date getDataEntrada() {
	return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
	this.dataEntrada = dataEntrada;
    }

    public Date getDataSaida() {
	return dataSaida;
    }

    public void setDataSaida(Date dataSaida) {
	this.dataSaida = dataSaida;
    }

    public Double getDesconto() {
	return desconto;
    }

    public void setDesconto(Double desconto) {
	this.desconto = desconto;
    }

    public String getComentário() {
	return comentário;
    }

    public void setComentário(String comentário) {
	this.comentário = comentário;
    }

    private Double desconto;
    private String comentário;

}
