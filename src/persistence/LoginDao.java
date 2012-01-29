package persistence;

public class LoginDao extends DaoSupport {

    public boolean logar(String login, String senha) {
	s = HibernateUtil.getSessionFactory().openSession();
	q = s.createQuery("FROM Pessoa p WHERE  p.login = :login AND p.senha = :senha");
	q.setString("login", login);
	q.setString("senha", senha);

	if (q.list().size() == 1) {
	    return true;
	} else {
	    return false;
	}
    }
}
