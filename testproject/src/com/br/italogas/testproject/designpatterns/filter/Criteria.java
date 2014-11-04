package com.br.italogas.testproject.designpatterns.filter;

import java.util.List;

public interface Criteria {
	
	public List<Person> meetCriteria(List<Person> persons);

}
