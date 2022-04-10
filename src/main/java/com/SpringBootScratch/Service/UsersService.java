package com.SpringBootScratch.Service;

import org.springframework.stereotype.Service;

import com.SpringBootScratch.Models.Users;
import com.SpringBootScratch.Repository.UsersRepository;

@Service
public class UsersService {
	
	private final UsersRepository usersRepository;
	
	public UsersService(UsersRepository usersRepository) {
	    this.usersRepository = usersRepository;
	}
	
	public Users registerUsers(String uname,String uemail,String upwd,int phone) {
		if(uemail ==null && upwd ==null){
			return null;
		}else {
			Users u =new Users();
			u.setUname(uname);
			u.setUemail(uemail);
			u.setUpwd(upwd);
			u.setPhone(phone);
			return  usersRepository.save(u);
		}
	}
	
	  public Users authenticate(String uemail,String upwd) { 
		  return usersRepository.findByUemailAndUpwd(uemail, upwd).orElse(null); 
	  }
	 
}
