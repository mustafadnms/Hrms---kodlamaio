package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobPositionService;
import kodlamaio.hrms.dataAccess.abstracts.JobPositionDao;
import kodlamaio.hrms.entities.concretes.JobPosition;

@Service
public class JobPositionManager implements JobPositionService{
	@Autowired
	public JobPositionDao jobPositionDao;

	@Override
	public List<JobPosition> getAll() {
		return this.jobPositionDao.findAll();
	}

	@Override
	public void add(JobPosition jobPosition) {
		this.jobPositionDao.save(jobPosition);
	} 

	
}
