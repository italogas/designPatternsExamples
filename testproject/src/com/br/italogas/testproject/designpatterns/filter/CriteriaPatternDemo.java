package com.br.italogas.testproject.designpatterns.filter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaPatternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Person> persons = new ArrayList<Person>();
		
		persons.add(new Person("Robert", "Male", "Single"));
		persons.add(new Person("Jonh", "Male", "Married"));
		persons.add(new Person("Laura", "Female", "Married"));
		persons.add(new Person("Diana", "Female", "Single"));
		persons.add(new Person("Mike", "Male", "Single"));
		persons.add(new Person("Bobby", "Male", "Single"));
		
		CriteriaMale male = new CriteriaMale();
		CriteriaFemale female = new CriteriaFemale();
		CriteriaSingle single = new CriteriaSingle();
		AndCriteria singleMale = new AndCriteria(single, male);
		OrCriteria singleOrFemale = new OrCriteria(single, female);
		
		System.out.println("Males: ");
		printPersons(male.meetCriteria(persons));
		
		System.out.println("\nFemales: ");
		printPersons(female.meetCriteria(persons));
		
		System.out.println("\nSingle Males: ");
		printPersons(singleMale.meetCriteria(persons));
		
		System.out.println("\nSingle Or Females: ");
		printPersons(singleOrFemale.meetCriteria(persons));
		
	}

	private static void printPersons(List<Person> persons) {
		// TODO Auto-generated method stub
		for(Person p : persons){
			System.out.println("Person: [ Name : " + p.getName() + ", Gender: " + p.getGender()
					+ ", Marital Status: " + p.getMaritalStatus() + " ]");
		}
		
	}

}
