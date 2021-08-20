package model.dao;

import model.dao.impl.SellerDaoJDBC;


//CLASS RESPONSAVEL PARA INSTANCIAR OS DAOS
public class DaoFactory {
	
	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC();
	}
}
