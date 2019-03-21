package com.accp.springmvc_2.test;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.accp.springmvc_2.biz.IPersonBiz;
import com.accp.springmvc_2.pojo.Person;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/spring/spring-main.xml" })
public class BizTest {

	@Autowired
	private IPersonBiz personBiz;

	public IPersonBiz getPersonBiz() {
		return personBiz;
	}

	public void setPersonBiz(IPersonBiz personBiz) {
		this.personBiz = personBiz;
	}

	@Test
	public void testQueryPerson() {
		personBiz.findPersonList();
	}

	@Test
	public void testSavePerson() {
		personBiz.addPerson(new Person("小马", (byte)0, new Date()));
	}
}
