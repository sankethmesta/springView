package com.aris.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aris.beans.ArisEmployee;
import com.aris.beans.PatientDetails;
import com.aris.dao.EmployeeDao;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeDao empdao;
	
	@RequestMapping("/viewform")
	public String vieform(Model m) {
		m.addAttribute("command", new ArisEmployee());
		return "addemployeeform";
	}
	
	@RequestMapping("/addEmployee")
	public String save(@ModelAttribute("emp") ArisEmployee emp) {
		empdao.save(emp);
		return "viewpage";
		
	}
	@RequestMapping("/ViewPatient")
	public String ViewPatient(Model m) {
		List<PatientDetails> list = empdao.getPatient();
		m.addAttribute("list", list);
		return "ViewPatient";
	}
	

}
