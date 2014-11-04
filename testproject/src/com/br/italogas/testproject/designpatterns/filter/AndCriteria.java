package com.br.italogas.testproject.designpatterns.filter;

import java.util.List;

public class AndCriteria implements Criteria {

	private Criteria criteria;
	private Criteria othercriteria;

	public AndCriteria(Criteria criteria, Criteria othercriteria) {
		// TODO Auto-generated constructor stub
		this.criteria = criteria;
		this.othercriteria = othercriteria;
	}

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		// TODO Auto-generated method stub
		List<Person> firtsCriteriaPersons = criteria.meetCriteria(persons);
		return othercriteria.meetCriteria(firtsCriteriaPersons);
	}

}
