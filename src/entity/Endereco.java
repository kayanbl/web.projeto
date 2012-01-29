package entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import enums.Estado;
import enums.Pais;

@Entity
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idApartamento;
    @Enumerated(EnumType.STRING)
    private Pais pais;
    @Enumerated(EnumType.STRING)
    private Estado estado;
    private String cidade;
    private String rua;
    private String numero;
    private String complemento;

    public Long getIdApartamento() {
	return idApartamento;
    }

    public void setIdApartamento(Long idApartamento) {
	this.idApartamento = idApartamento;
    }

    public Pais getPais() {
	return pais;
    }

    public void setPais(Pais pais) {
	this.pais = pais;
    }

    public Estado getEstado() {
	return estado;
    }

    public void setEstado(Estado estado) {
	this.estado = estado;
    }

    public String getCidade() {
	return cidade;
    }

    public void setCidade(String cidade) {
	this.cidade = cidade;
    }

    public String getRua() {
	return rua;
    }

    public void setRua(String rua) {
	this.rua = rua;
    }

    public String getNumero() {
	return numero;
    }

    public void setNumero(String numero) {
	this.numero = numero;
    }

    public String getComplemento() {
	return complemento;
    }

    public void setComplemento(String complemento) {
	this.complemento = complemento;
    }

}
