package com.br.italogas.testproject.designpatterns.filter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaMarried implements Criteria {

	public CriteriaMarried() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		// TODO Auto-generated method stub
		ArrayList<Person> marriedPersons = new ArrayList<Person>();
		for(Person p : persons){
			if(p.getMaritalStatus().equalsIgnoreCase("MARRIED")){
				marriedPersons.add(p);
			}
		}
		return marriedPersons;
	}

}
