package com.br.italogas.testproject.designpatterns.filter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaMale implements Criteria {

	public CriteriaMale() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		// TODO Auto-generated method stub
		List<Person> malePersons = new ArrayList<Person>();
		for(Person p : persons){
			if(p.getGender().equalsIgnoreCase("MALE")){
				malePersons.add(p);
			}
		}
		return malePersons;
	}

}
