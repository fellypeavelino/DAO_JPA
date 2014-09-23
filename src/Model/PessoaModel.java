package Model;

import Entity.Pessoa;
import Interfaces.IPessoaModel;

public class PessoaModel extends Base<Pessoa, Integer> implements IPessoaModel{

	public PessoaModel() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void inserir(Object objeto) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void alterar(Object objeto) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remover(Class classe, Object pk) throws Exception {
		// TODO Auto-generated method stub
		
	}
//http://serjava.blogspot.com.br/2011/12/persistencia-jpa-dao-generico.html
	//http://www.portalarquiteto.com.br/dao-generico-com-jpa-e-hibernate/
	//http://www.devmedia.com.br/forum/criando-um-do-generico-em-jpa/433028
	//http://hebdomadarium.wordpress.com/2013/11/24/dao-generica/
}
