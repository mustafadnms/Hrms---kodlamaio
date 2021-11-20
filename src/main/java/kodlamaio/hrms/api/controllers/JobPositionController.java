package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.JobPositionService;
import kodlamaio.hrms.entities.concretes.JobPosition;

@CrossOrigin
@RestController
@RequestMapping("/api/positions")
public class JobPositionController {
	@Autowired
	private JobPositionService jobPositionService;

	@GetMapping("/getAll")
	public List<JobPosition> getAll() {
		return this.jobPositionService.getAll();
	}
	
	@PostMapping("/add")
	public void add(@RequestBody JobPosition jobPosition) {
		this.jobPositionService.add(jobPosition);
	}
}
