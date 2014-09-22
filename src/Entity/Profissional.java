package Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Profissional {

	public Profissional() {
		// TODO Auto-generated constructor stub
	}
	@Id
	@GeneratedValue
	private Integer id;
	@Column(name="profissionais_cadastramento")
	private Cadastramento cadastramento;
	@ManyToOne
	private Hierarquia hierarquico = new Hierarquia();
	@Column(name="profissionais_cargo")
	private String profissionais_cargo;
	@Column(name="profissionais_trabalhando")
	private boolean profissionais_trabalhando;
	@ManyToOne
	private Interesse profissionais_interesse = new Interesse();
	@Column(name="profissionais_remuneracaoAtual")
	private double profissionais_remuneracaoAtual;
	@Column(name="profissionais_remuneracaoPretendida")
	private double profissionais_remuneracaoPretendida;
	@ManyToOne
	private LocalidadeTrabalho profissionais_localidadeTrabalho = new LocalidadeTrabalho();
}
