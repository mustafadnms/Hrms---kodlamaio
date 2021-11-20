package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.DataResult;
import kodlamaio.hrms.entities.concretes.Employer;

public interface EmployerService {
    DataResult<List<Employer>> getAll();
    void add(Employer employer);
    Employer getPhoneNumberByCompanyId(int id);
    DataResult<Employer> getByCompanyNameAndPhoneNumbers_PhoneNumber(String companyName, String phoneNumber);
}