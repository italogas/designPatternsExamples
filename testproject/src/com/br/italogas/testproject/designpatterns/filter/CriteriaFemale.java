package com.br.italogas.testproject.designpatterns.filter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaFemale implements Criteria {

	public CriteriaFemale() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		// TODO Auto-generated method stub
		List<Person> femalePersons = new ArrayList<Person>();
		for(Person p : persons){
			if(p.getGender().equalsIgnoreCase("FEMALE")){
				femalePersons.add(p);
			}
		}
		return femalePersons;
	}

}
