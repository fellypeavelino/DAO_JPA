package Model;

import java.io.Serializable;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import Interfaces.IBase;

public abstract class Base<T, I extends Serializable> implements IBase{

	public Base() {
		// TODO Auto-generated constructor stub
	}
	EntityManagerFactory emf;
	EntityManager em;
	EntityTransaction t;
	
	
	public void conectar(){
		this.emf = Persistence.createEntityManagerFactory("unitPSC");
		this.em = this.emf.createEntityManager();
		this.t = em.getTransaction();
	}
	
	public void fechar() throws Exception{
		this.emf.close();
	}
	
	public void inserir(Class<T> objeto) throws Exception{
		this.conectar();
		this.t.begin();
		this.em.persist(objeto);
		this.t.commit();
		this.fechar();
	}
	
	public void alterar(Class<T> objeto)throws Exception{
		this.em.merge(objeto);
	}
	
	public void remover(Class<T> classe, I pk)throws Exception{
		Object objetoPersistido = this.em.getReference(classe, pk);
		this.em.remove(objetoPersistido);
	}
	
	public T listar(Class<T> classe, I pk)throws Exception {
		return this.em.find(classe, pk);
	}
}
