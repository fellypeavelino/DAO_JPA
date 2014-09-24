package Interfaces;

public interface IHierarquiaModel extends IBase{
	public void inserir(Object objeto) throws Exception;
	public void alterar(Object objeto) throws Exception;
	public void remover(Class classe, Object pk) throws Exception ;
	
}
