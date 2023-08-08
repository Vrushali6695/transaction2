package transactionDao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import transaction.transaction;

;

@Repository
public class transactionDao {
	 @Autowired
		SessionFactory sf;
		public List<transaction> getAllRecord() {
			Session session=sf.openSession();	
			Criteria criteria=session.createCriteria(transaction.class);
			List<transaction> t=criteria.list();
			session.close();
			return t;
		}
		
		public boolean insertData(transaction t) {
			Session session=sf.openSession();
			Transaction tr=session.beginTransaction();
			session.save(t);
			tr.commit();
			session.close();
			return true;
		}

		public boolean deleteData(int id) {
			Session session=sf.openSession();
			Transaction tr=session.beginTransaction();
			transaction t=session.get(transaction.class, id);
			session.delete(t);
			tr.commit();
			session.close();
		    return true;
		}

		public void updateData(transaction t) {
			Session session=sf.openSession();
			Transaction tr=session.beginTransaction();
			session.update(t);
			tr.commit();
			session.close();
		}
		
		
}
