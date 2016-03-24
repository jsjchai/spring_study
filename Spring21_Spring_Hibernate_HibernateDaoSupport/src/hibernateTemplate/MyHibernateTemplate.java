package hibernateTemplate;

import org.hibernate.Session;

public class MyHibernateTemplate {

	public void executeWithNativeSession(MyHibernateCallback callback) {
		Session s = null;
		try {
			s = this.getSession();
			s.beginTransaction();

			callback.doInHibernate(s);
			
			s.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			s.getTransaction().rollback();
		} finally {
			// ...
		}
	}
	
	private Session getSession() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void save(final Object o) {
		new MyHibernateTemplate().executeWithNativeSession(new MyHibernateCallback() {
			
			@Override
			public void doInHibernate(Session s) {
				s.save(o);
			}
		});
	}
}
