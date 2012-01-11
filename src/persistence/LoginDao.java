package persistence;

public class LoginDao extends DaoSupport{

	public boolean logar(String usuario, String senha){
		s = HibernateUtil.getSessionFactory().openSession();
		q = s.createQuery("FROM Pessoa p WHERE  p.usuario = :usuario AND p.senha = :senha");
		q.setString("usuario", usuario);
		q.setString("senha", senha);
		
		if(q.list().size() == 1){
			return true;
		} else {
			return false;
		}
	}
}
