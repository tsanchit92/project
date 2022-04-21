package admin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import admin.model.AdminModel;
import admin.repository.AdminRepository;

@Service
public class AdminService {
	
	@Autowired
	public AdminRepository repo;
	
	public void register(AdminModel admin) {
		repo.save(admin);
	}

	public void delete(String userName) {
		
		
	}

}
