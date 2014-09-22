package Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Acesso {

	public Acesso() {
		// TODO Auto-generated constructor stub
	}
	@Id
	@GeneratedValue
	private Integer id;
	@Column(name="acesso_nome")
	private String nome;
	@Column(name="acesso_senha")
	private String senha;
	private transient String confirmarSenha;
	@Column(name="acesso_mail")
	private String mail;
	@Column(name="acesso_palavraChave")
	private String palavraChave;
	@ManyToOne
	private Origem origem = new Origem();
	@Column(name="acesso_lido")
	private boolean li;
}
