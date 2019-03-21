package com.accp.springmvc_2.action;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

//<bean id="myBean" class="..."/>
//Component:包含Controller,Service,Repository
@Controller
@SessionAttributes(value = { "ARR" })
// 存放在session中
public class TestAction {
	// String:视图逻辑名
	// 方法的参数成为共享数据的方式
	@RequestMapping(method = { RequestMethod.POST, RequestMethod.GET }, value = {
			"/test1", "/test2" })
	public String showOne(
			@RequestParam(required = true, value = "n") String name,
			String[] loves,
			@RequestParam("d") @DateTimeFormat(pattern = "yyyy-MM-dd") Date mydate)
			throws Exception {
		System.out.println("springmvc处理请求,接收参数:" + name);
		System.out.println("springmvc处理请求,接收同名参数:" + loves);
		System.out.println("springmvc处理请求,接收日期参数:" + mydate);
		return "test";
	}

	@RequestMapping("/test3")
	public String showTwo(Model model, HttpSession session,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		// 存放数据
		model.addAttribute("STR", "共享字符串");
		model.addAttribute("ARR", new String[] { "小马", "小波" });
		return "test";
	}

}
