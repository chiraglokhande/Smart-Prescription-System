package smartPrescriptionDao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import smartPrescriptionModel.Cause;
import smartPrescriptionModel.Medicine;
import smartPrescriptionModel.Pharmacist;

public class PrescriptionDao {

	SessionFactory sf;

	public PrescriptionDao() {
		sf = new Configuration().configure().addAnnotatedClass(Cause.class).addAnnotatedClass(Medicine.class)
				.addAnnotatedClass(Pharmacist.class).buildSessionFactory();
		System.out.println("Database Is Created..");
	}

	public String addMedicine(Medicine medicine) {
		Session session = sf.openSession();

		Transaction tr = session.beginTransaction();

		session.save(medicine);
		tr.commit();
		session.close();

		return "Medicine Added..";

	}

	@SuppressWarnings("deprecation")
	public List<Medicine> getMedicine(Cause cause) {
		Session session = sf.openSession();

		String hql = "from Medicine where cause_id=:causeId";
		Query<Medicine> query = session.createQuery(hql);
		query.setParameter("causeId", cause.getId());

		List<Medicine> list = query.list();
		session.close();
		return list;

	}

	public void addCause(Cause cause) {

		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		if (getCauseByName(cause.getName()) == null) {
			session.save(cause);

			tr.commit();

			session.close();
		} else {
			System.out.println("Already Exists");
		}
	}

	public Cause getCauseByName(String Name) {
		Cause cause = null;
		Session session = sf.openSession();

		String hql = "From Cause Where name=:name";

		Query<Cause> query = session.createQuery(hql);

		query.setParameter("name", Name);

		List<Cause> causes = query.list(); // Fetch multiple results
		if (!causes.isEmpty()) {
			cause = causes.get(0);
		}
		session.close();
		return cause;
	}

	public void register(Pharmacist pharmacist) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Pharmacist p1 = getPharmacist(pharmacist.getId());

		if (p1 == null) {
			session.save(pharmacist);
			tr.commit();
			session.close();
		} else {
			System.out.println("Pharmacist Already Exists With This Creadentials.");
		}
	}

	public Pharmacist getPharmacist(int id) {
		Session session = sf.openSession();

		String hql = "from Pharmacist where id=:id";
		Query<Pharmacist> query = session.createQuery(hql);

		query.setParameter("id", id);

		Pharmacist pharmacist = query.uniqueResult();
		session.close();
		return pharmacist;

	}

	public Pharmacist login(String username, String password) {

		Session session = sf.openSession();

		String hql = "from Pharmacist where username=:username AND password=:password";
		Query<Pharmacist> query = session.createQuery(hql);

		query.setParameter("username", username);
		query.setParameter("password", password);

		Pharmacist pharmacist = query.uniqueResult();

		session.close();
		return pharmacist;

	}

}
