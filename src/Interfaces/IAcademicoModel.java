package Interfaces;

import Entity.Pessoa;
import Model.Base;

public interface IAcademicoModel extends IBase{
	public void inserir(Object objeto) throws Exception;
	public void alterar(Object objeto) throws Exception;
	public void remover(Class classe, Object pk) throws Exception ;
	
}
