package admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import admin.model.AdminModel;
import admin.service.AdminService;

@RestController
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	public AdminService adminService;

	@PostMapping("/register")
	public void register(@RequestBody AdminModel admin)
	{
		adminService.register(admin);
	}
	
	@DeleteMapping("/deleteFarmer")
	public void deleteFarmer(@RequestBody  String userName)
	{
		adminService.delete(userName);
	}
}
