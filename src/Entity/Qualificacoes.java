package Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

@Entity
public class Qualificacoes {

	public Qualificacoes() {
		// TODO Auto-generated constructor stub
	}
	@Id
	@GeneratedValue
	private Integer id;
	@ManyToOne
	private Academico academico = new Academico();
	@Column(name="qualificacao_curso")
	private String curso;
	@Lob
	private String instrucoes;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Academico getAcademico() {
		return academico;
	}
	public void setAcademico(Academico academico) {
		this.academico = academico;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String getInstrucoes() {
		return instrucoes;
	}
	public void setInstrucoes(String instrucoes) {
		this.instrucoes = instrucoes;
	}
}
