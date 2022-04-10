package com.SpringBootScratch.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.SpringBootScratch.Models.StudentInformation;
import com.SpringBootScratch.Repository.StudenInfoRepository;

@Controller
@RequestMapping("/user")
public class StdInfoController {
	@Autowired
	StudenInfoRepository studenInfoRepository;
	
	@GetMapping("/search")
	public String search(Model model){
		List<StudentInformation> StudenInfo = studenInfoRepository.findAll();
		model.addAttribute("uList", StudenInfo);
		
		return "/searchS";
	}
	
	@GetMapping("/create")
	public String create() {
	    return "/createS";
	}
	@PostMapping("/create")
	public String create(@ModelAttribute StudentInformation StudenInfo) {
		studenInfoRepository.save(StudenInfo);
	    return "redirect:/search";
	}
	@GetMapping("/delete")
	public String delete(@RequestParam("id") Long id) {
		studenInfoRepository.deleteById(id);
	    return "redirect:/user/search";
	}

	/// edit?id=123
	@GetMapping("/edit")
	public String edit(Model model, @Param("id") Long id) {
	    StudentInformation StudenInfo = studenInfoRepository.getById(id);
	    model.addAttribute("StudenInfo", StudenInfo);
	    return "/editS";
	}
	@PostMapping("/edit")
	public String edit(@ModelAttribute("user") StudentInformation StudenInfo) {
		studenInfoRepository.save(StudenInfo);
	    return "redirect:/user/search";
	}
}
