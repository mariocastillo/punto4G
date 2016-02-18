package clases;

import java.util.ArrayList;

import interfaces.IComparisonStrategy;


public  class Sorter {
	IComparisonStrategy strategy;
	public Sorter(IComparisonStrategy strategy) {
		this.strategy=strategy;
		
		// TODO Auto-generated constructor stub
	}
	
	public void setStrategy(IComparisonStrategy strategy){
		this.strategy=strategy;
	}
	
	
	
	public ArrayList<Student> Sortdown(ArrayList<Student> a){
		for (int i = 0; i < a.size(); i++) {
			for (int j = i+1; j < a.size(); j++) {
				if (strategy.comparisonf(a.get(i), a.get(j))>0) {
					a.add(i,a.get(j));
					a.remove(j+1);
				}
			}			
		}
		return a;
	}
	
	public ArrayList<Student> Sortup(ArrayList<Student> a){
		for (int i = 0; i < a.size(); i++) {
			for (int j = i+1; j < a.size(); j++) {
				if (strategy.comparisonf(a.get(i), a.get(j))<0) {
					a.add(i,a.get(j));
					a.remove(j+1);
				}
			}			
		}
		return a;
	}
	
	void printListe(ArrayList<Student> s){
		for (Student student : s) {
			System.out.println(student.name + "--" + student.career + "--" + student.age);

		}
		
		
	}



}
