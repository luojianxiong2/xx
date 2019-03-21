package com.accp.springmvc_2.dao;

import java.util.List;

import com.accp.springmvc_2.pojo.Person;

public interface IPersonDao {

	/**
	 * 
	 * @title: queryPerson
	 * @description: 查询
	 * @return
	 */
	public List<Person> queryPerson();

	/**
	 * 
	 * @title: savePerson
	 * @description: 保存
	 * @param person
	 * @return
	 */
	public Integer savePerson(Person person);

	/**
	 * 
	 * @title: deletePerson
	 * @description: 删除
	 * @param id
	 */
	public void deletePerson(Integer id);

	/**
	 * 
	 * @title: loadPerson
	 * @description: 加载
	 * @param id
	 */
	public Person loadPerson(Integer id);

	/**
	 * 
	 * @title: countPersonByName
	 * @description: 根据姓名统计个数
	 * @param name
	 * @return
	 */
	public Integer countPersonByName(String name);
}
