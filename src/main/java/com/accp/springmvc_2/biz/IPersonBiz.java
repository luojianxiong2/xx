package com.accp.springmvc_2.biz;

import java.util.List;

import com.accp.springmvc_2.pojo.Person;

public interface IPersonBiz {

	/**
	 * 
	 * @title: findPersonList
	 * @description: 查询员工列表
	 * @return
	 */
	public List<Person> findPersonList();

	/**
	 * 
	 * @title: addPerson
	 * @description: 新增员工信息
	 * @param person
	 */
	public void addPerson(Person person);

	/**
	 * 
	 * @title: removePersonById
	 * @description: 移除员工信息
	 * @param id
	 */
	public void removePersonById(Integer id);

	/**
	 * 
	 * @title: getPersonById
	 * @description: 读取指定员工信息
	 * @param id
	 * @return
	 */
	public Person getPersonById(Integer id);
}
