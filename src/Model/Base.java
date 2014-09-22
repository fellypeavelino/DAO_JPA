package Model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import Interfaces.IBase;

public class Base implements IBase{

	public Base() {
		// TODO Auto-generated constructor stub
		this.emf = Persistence.createEntityManagerFactory("unitPSC");
		this.em = this.emf.createEntityManager();
		this.t = em.getTransaction();
	}
	EntityManagerFactory emf;
	EntityManager em;
	EntityTransaction t;
	
	public void fechar() throws Exception{
		this.emf.close();
	}
	
	public void inserir(Object objeto) throws Exception{
		Base conecta = new Base();
		this.t.begin();
		this.em.persist(objeto);
		this.t.commit();
		this.fechar();
	}

	public void alterar(Object objeto)throws Exception{
		this.em.merge(objeto);
	}
	
	public void remover(Object objeto)throws Exception{
		Object objetoPersistido = this.em.getReference(null, objeto);
		this.em.remove(objetoPersistido);
	}
}
