package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.entities.concretes.User;

public interface UserService {
    User getById(int id);
}