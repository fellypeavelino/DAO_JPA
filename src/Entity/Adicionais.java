package Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Adicionais {

	public Adicionais() {
		// TODO Auto-generated constructor stub
	}
	@Id
	@GeneratedValue
	private Integer id;
	@Column(name="adicionais_trabalhou")
	private boolean trabalhou;
	@Column(name="adicionais_cargo")
	private String adicionais_cargo;
	@Column(name="adicionais_parentes")
	private boolean adicionais_parentes;
	@Column(name="adicionais_altura")
	private Integer adicionais_altura;
	@Column(name="adicionais_rg")
	private String adicionais_rg;
	@Column(name="adicionais_orgao")
	private String adicionais_orgao;
	@Column(name="adicionais_uf")
	private UF adicionais_uf;
	@ManyToOne
	private Regiao regiao = new Regiao();
	@ManyToOne
	private Pais adicionais_pais = new Pais();
}
