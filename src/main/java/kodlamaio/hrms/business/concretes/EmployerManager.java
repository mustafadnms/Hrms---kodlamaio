package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.EmployerService;
import kodlamaio.hrms.core.utilities.DataResult;
import kodlamaio.hrms.dataAccess.abstracts.EmployerDao;
import kodlamaio.hrms.entities.concretes.Employer;

@Service
public class EmployerManager implements EmployerService{
	
	@Autowired
	private EmployerDao employerDao ;

	@Override
	public DataResult<List<Employer>> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(Employer employer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Employer getPhoneNumberByCompanyId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<Employer> getByCompanyNameAndPhoneNumbers_PhoneNumber(String companyName, String phoneNumber) {
		// TODO Auto-generated method stub
		return null;
	}

}
