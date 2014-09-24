package Entity;

import java.util.Calendar;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
@Entity
public class Pessoa {
	
	public Pessoa(){
		
	}
	@Id
	@GeneratedValue
	private Integer id;
	@Column(name="pessoa_nome")
	private String nome;
	@Column(name="pessoa_cpf")
	private String cpf;
	@Column(name="pessoa_nascimento")
	private Date nascimento = new Date();
	@Column(name="pessoa_sexo")
	private Sexo sexo;
	@Column(name="pessoa_deficiente")
	private Deficiencia deficiente;
	//@JoinColumn(name="pessoa_estadoCivil")
	@ManyToOne
	private EstadoCivil estadoCivil = new EstadoCivil();
	@ElementCollection
	private String[] pessoa_telefone = new String[5];
	@Column(name="pessoa_ramal")
	private int ramal;
	@ElementCollection
	private String[] pessoa_redeSociais = new String[4];
	//@JoinColumn(name="pessoa_endereco")
	@OneToOne
	private Endereco endereco = new Endereco();
	@OneToOne
	private Profissional profissionais = new Profissional();
	@OneToOne
	private Adicionais dadosAdicionais = new Adicionais();
	@OneToOne
	private Acesso dadosAcesso = new Acesso();
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Date getNascimento() {
		return nascimento;
	}
	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}
	public Sexo getSexo() {
		return sexo;
	}
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	public Deficiencia getDeficiente() {
		return deficiente;
	}
	public void setDeficiente(Deficiencia deficiente) {
		this.deficiente = deficiente;
	}
	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	public String[] getPessoa_telefone() {
		return pessoa_telefone;
	}
	public void setPessoa_telefone(String[] pessoa_telefone) {
		this.pessoa_telefone = pessoa_telefone;
	}
	public int getRamal() {
		return ramal;
	}
	public void setRamal(int ramal) {
		this.ramal = ramal;
	}
	public String[] getPessoa_redeSociais() {
		return pessoa_redeSociais;
	}
	public void setPessoa_redeSociais(String[] pessoa_redeSociais) {
		this.pessoa_redeSociais = pessoa_redeSociais;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public Profissional getProfissionais() {
		return profissionais;
	}
	public void setProfissionais(Profissional profissionais) {
		this.profissionais = profissionais;
	}
	public Adicionais getDadosAdicionais() {
		return dadosAdicionais;
	}
	public void setDadosAdicionais(Adicionais dadosAdicionais) {
		this.dadosAdicionais = dadosAdicionais;
	}
	public Acesso getDadosAcesso() {
		return dadosAcesso;
	}
	public void setDadosAcesso(Acesso dadosAcesso) {
		this.dadosAcesso = dadosAcesso;
	}
}
