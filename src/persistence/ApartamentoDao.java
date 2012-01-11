package persistence;

import java.util.List;

import entity.Apartamento;

public class ApartamentoDao extends DaoSupport implements GenericDaoMethods<Apartamento> {

	@Override
	public void saveOrUpdate(Apartamento object) {

		try{
			s = HibernateUtil.getSessionFactory().openSession();
			t = s.beginTransaction();
			s.saveOrUpdate(object);
			t.commit();
		}catch(Exception e){
			t.rollback();
		}
		
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Apartamento findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Apartamento> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
