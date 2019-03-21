package com.accp.springmvc_2.action;

import java.io.File;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.accp.springmvc_2.biz.IPersonBiz;
import com.accp.springmvc_2.pojo.Person;


@Controller
public class PersonAction {
	
	@Autowired
	private IPersonBiz personBiz;

	public IPersonBiz getPersonBiz() {
		return personBiz;
	}

	public void setPersonBiz(IPersonBiz personBiz) {
		this.personBiz = personBiz;
	}
	
	@RequestMapping("/person/list")
	public String showPersonList(Model model)throws Exception{
		List<Person> data=personBiz.findPersonList();
		model.addAttribute("LIST", data);//请求级
		return "personList";
	}
	
	@RequestMapping("/person/del")
	public String delPerson(Integer id)throws Exception{
		personBiz.removePersonById(id);
		return "redirect:/person/list";
	}
	
	@RequestMapping("/person/load")
	public String loadPerson(Integer id,Model model)throws Exception{
		Person person=personBiz.getPersonById(id);
		model.addAttribute("PERSON",person);
		return "personInfo";
	}
	
	
	@RequestMapping("/person/add")
	public String addPerson(Person person,MultipartFile img,HttpSession session)throws Exception{
		//获得上传文件的真实路径
		String path=session.getServletContext().getRealPath("/WEB-INF/static/images");
		//获得上传文件名
		String fileName=img.getOriginalFilename();
		//传输文件
		img.transferTo(new File(path+File.separator+fileName));
		person.setPersonImg(fileName);
		personBiz.addPerson(person);
		return "redirect:/person/list";
	}
	
	
	
}
