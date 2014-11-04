package com.br.italogas.testproject.designpatterns.filter;

import java.util.List;

public class OrCriteria implements Criteria {

	private Criteria criteria;
	private Criteria othercriteria;

	public OrCriteria(Criteria criteria, Criteria othercriteria) {
		// TODO Auto-generated constructor stub
		this.criteria = criteria;
		this.othercriteria = othercriteria;
	}

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		// TODO Auto-generated method stub
		List<Person> firstCriteriaPersons = criteria.meetCriteria(persons);
		List<Person> otherCriteriaPersons = othercriteria.meetCriteria(persons);
		
		for(Person p : otherCriteriaPersons){
			if(!firstCriteriaPersons.contains(p)){
				firstCriteriaPersons.add(p);
			}
		}
		
		return firstCriteriaPersons;
	}

}
