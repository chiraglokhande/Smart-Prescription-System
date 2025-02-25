package smartPrescriptionService;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import smartPrescriptionDao.PrescriptionDao;
import smartPrescriptionModel.Cause;
import smartPrescriptionModel.Medicine;
import smartPrescriptionModel.Pharmacist;

public class PrescriptionService {
	
	PrescriptionDao dao=new PrescriptionDao();
	

	public String addMedicine(Medicine medicine)
	{
	dao.addMedicine(medicine);
		
		return"Medicine Added..";
		
	}
	
	public 	List<Medicine> getMedicine(Cause cause)
	{
		
	return dao.getMedicine(cause);
	
		
		
		
	}
	
	public void addCause(Cause cause)
	{
		dao.addCause(cause);
	}
	
	public Cause getCauseByName(String Name)
	{
		
		
		return dao.getCauseByName(Name);
	}

	public void register(Pharmacist pharmacist)
	{
		dao.register(pharmacist);
	}
	
	public 	Pharmacist getPharmacist(int id)
	{
		
		
		return dao.getPharmacist(id);
		
	}
	public Pharmacist login(String username,String password)
	{
		
		
		return dao.login(username, password);
			
		}
		
	}







