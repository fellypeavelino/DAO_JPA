package Entity;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Endereco {

	public Endereco() {
		// TODO Auto-generated constructor stub
	}
	@Id
	@GeneratedValue
	private Integer endereco_id;
	@Column(name="endereco_nome")
	private String nome;
	@Column(name="endereco_numero")
	private int numero;
	@Column(name="endereco_complemento")
	private String complemento;
	@Column(name="endereco_bairro")
	private String bairro;
	@Column(name="endereco_cidade")
	private String cidade;
	@Column(name="endereco_uf")
	private String uf;
	@Column(name="endereco_cep")
	private String cep;
	@ManyToOne
	public Pais endereco_pais = new Pais();
	public Integer getEndereco_id() {
		return endereco_id;
	}
	public void setEndereco_id(Integer endereco_id) {
		this.endereco_id = endereco_id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public Pais getEndereco_pais() {
		return endereco_pais;
	}
	public void setEndereco_pais(Pais endereco_pais) {
		this.endereco_pais = endereco_pais;
	}
}
