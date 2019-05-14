package com.tcs.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.tcs.dao.StudentRepository;
import com.tcs.model.StudentModel;

@RestController
public class StudentController {
	@Autowired
	StudentRepository repo;
	@RequestMapping("/home")
	public ModelAndView msg()
	{
		ModelAndView mv=new ModelAndView("Home");
		return mv;
	}
	
	@RequestMapping("/addStud")
	public ModelAndView addStudent(StudentModel stud)
	{
		ModelAndView mv=new ModelAndView("addStud");
		return mv;
	}
	
	@RequestMapping("/searchStud")
	public ModelAndView srchStudent(StudentModel stud)
	{
		ModelAndView mv=new ModelAndView("searchStud");
		return mv;
	}
	
	@RequestMapping("/updateStud")
	public ModelAndView updateStudent(StudentModel stud)
	{
		ModelAndView mv=new ModelAndView("updateStud");
		return mv;
	}
	
	@RequestMapping("/delStud")
	public ModelAndView delStudent(StudentModel stud)
	{
		//repo.save(stud);
		ModelAndView mv=new ModelAndView("delStud");
		return mv;
	}
	
	//CRUD operations
	
	@RequestMapping("/add")
	public String add(StudentModel stud)
	{
		repo.save(stud);
		return "Student added Successfully...";
	}
	
	@RequestMapping("/search")
	public StudentModel srch(@RequestParam("Id") int id)
	{
		StudentModel stud=repo.findById(id).orElse(new StudentModel());
		return stud;
	}
	
	@RequestMapping("/update")
	public String update(StudentModel stud)
	{
		repo.save(stud);
		return "Student record updated successfully...";
	}
	
	@RequestMapping("/del")
	public String del(@RequestParam("Id") int id)
	{
		repo.deleteById(id);
		return "Student deleted Successfully with id : "+id;
		
	}
	
}

