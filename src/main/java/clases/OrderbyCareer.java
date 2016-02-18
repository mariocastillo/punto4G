package clases;

import interfaces.IComparisonStrategy;

public class OrderbyCareer implements IComparisonStrategy {
	@Override
	public int comparisonf(Student a, Student b) {
		return a.career.compareToIgnoreCase(b.career);
	}

}
