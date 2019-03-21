package com.accp.springmvc_2.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.springmvc_2.biz.IPersonBiz;
import com.accp.springmvc_2.dao.IPersonDao;
import com.accp.springmvc_2.exception.PersonException;
import com.accp.springmvc_2.pojo.Person;

@Service("personBiz")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, isolation = Isolation.READ_COMMITTED)
public class PersonBiz implements IPersonBiz {

	@Autowired
	private IPersonDao personDao;

	public IPersonDao getPersonDao() {
		return personDao;
	}

	public void setPersonDao(IPersonDao personDao) {
		this.personDao = personDao;
	}

	@Override
	public List<Person> findPersonList() {
		return personDao.queryPerson();
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, isolation = Isolation.READ_COMMITTED)
	public void addPerson(Person person) {
		if(personDao.countPersonByName(person.getPersonName())!=0){
			throw new PersonException(person.getPersonName()+"已存在!");
		}
		personDao.savePerson(person);
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, isolation = Isolation.READ_COMMITTED)
	public void removePersonById(Integer id) {
		personDao.deletePerson(id);
	}

	@Override
	public Person getPersonById(Integer id) {
		return personDao.loadPerson(id);
	}

}
