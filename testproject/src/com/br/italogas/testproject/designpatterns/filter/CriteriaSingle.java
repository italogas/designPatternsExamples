package com.br.italogas.testproject.designpatterns.filter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaSingle implements Criteria {

	public CriteriaSingle() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		// TODO Auto-generated method stub
		List<Person> singlePersons = new ArrayList<Person>();
		for(Person p : persons){
			if(p.getMaritalStatus().equalsIgnoreCase("SINGLE")){
				singlePersons.add(p);
			}
		}
		return singlePersons;
	}

}
