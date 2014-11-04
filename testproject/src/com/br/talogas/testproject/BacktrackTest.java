package com.br.talogas.testproject;

import java.util.ArrayList;
import java.util.List;

public class BacktrackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> a = new ArrayList<Integer>();
		List<Integer> x = new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		permu(x, a);
	}

	private static void permu(List<Integer> x, List<Integer> a) {
		// TODO Auto-generated method stub
		if(x.size() == a.size()){
			System.out.println("Chegou aqui! /n");
			printSolution(x);
		} else {
			for(Integer i : a){
				x.add(i);
				System.out.println(x.toString());
				if(valid(x)){
					permu(x, a);
				} else {
					x.remove(i);
					return;
				}
			}
		}
	}

	private static boolean valid(List<Integer> x) {
		// TODO Auto-generated method stub
		for(int i = 0; i < x.size()-1; i++){
			if(x.get(i).equals(x.get(i+1))){
				return false;
			}
		}
		return true;
	}
	

	private static void printSolution(List<Integer> x) {
		// TODO Auto-generated method stub
		String s = null;
		for(Integer i : x){
			s += String.format("%s, ",  i.toString());
		}
		System.out.println(s);
	}


}
