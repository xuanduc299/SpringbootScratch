package com.SpringBootScratch.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;



import com.SpringBootScratch.Models.Users;


@Controller
public class StudentInfController {

	@GetMapping("/profile")
	public String gethomePage(Model model) {
		model.addAttribute("homeRequest", new Users());
		  model.addAttribute("masv","20810310291");
		  model.addAttribute("trangthai", "dang hoc");
		  model.addAttribute("ngayvaotruong", "2019");
		  model.addAttribute("khoadt", "2020-2025");
		  model.addAttribute("bacdaotao", "dai hoc");
		  model.addAttribute("nganh", "CNPM");
		  model.addAttribute("khoa", "CNTT");
		  model.addAttribute("chucvu", "hoc sinh");
		  model.addAttribute("gioitinh", "nam");
		  model.addAttribute("mahoso", "..");
		  model.addAttribute("coso", "co so 1");
		  model.addAttribute("loaihinhdt", "CNPM");
		  model.addAttribute("chuyennganh", "CNTT2");
		  model.addAttribute("lop", "D15CNPM2");
		  model.addAttribute("congtacdoan", "null");
		
		/*
		 * Iterable<StudentInformation> studeninfo = studenInfoRepository.findAll();
		 * model.addAttribute("studeninfo",studeninfo); System.out.println("haha");
		 */
		return "profile";
	}
	
	
	
	
}
