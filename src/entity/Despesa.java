package entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import enums.Mes;

@Entity
public class Despesa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idDespesa;
    @ManyToOne
    private Apartamento apartamento;
    @Enumerated(EnumType.STRING)
    private Mes mes;
    private Integer ano;
    private Double contaAgua;
    private Double contaCondominio;
    private Double contaLuz;
    private Double contaGas;
    private Double gastoExtra;
    private String comentario;

    public Mes getMes() {
	return mes;
    }

    public void setMes(Mes mes) {
	this.mes = mes;
    }

    public Integer getAno() {
	return ano;
    }

    public void setAno(Integer ano) {
	this.ano = ano;
    }

    public Long getIdDespesa() {
	return idDespesa;
    }

    public void setIdDespesa(Long idDespesa) {
	this.idDespesa = idDespesa;
    }

    public Apartamento getApartamento() {
	return apartamento;
    }

    public void setApartamento(Apartamento apartamento) {
	this.apartamento = apartamento;
    }

    public Double getContaAgua() {
	return contaAgua;
    }

    public void setContaAgua(Double contaAgua) {
	this.contaAgua = contaAgua;
    }

    public Double getContaCondominio() {
	return contaCondominio;
    }

    public void setContaCondominio(Double contaCondominio) {
	this.contaCondominio = contaCondominio;
    }

    public Double getContaLuz() {
	return contaLuz;
    }

    public void setContaLuz(Double contaLuz) {
	this.contaLuz = contaLuz;
    }

    public Double getContaGas() {
	return contaGas;
    }

    public void setContaGas(Double contaGas) {
	this.contaGas = contaGas;
    }

    public Double getGastoExtra() {
	return gastoExtra;
    }

    public void setGastoExtra(Double gastoExtra) {
	this.gastoExtra = gastoExtra;
    }

    public String getComentario() {
	return comentario;
    }

    public void setComentario(String comentario) {
	this.comentario = comentario;
    }

}
