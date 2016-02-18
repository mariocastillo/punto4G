package clases;

import interfaces.IComparisonStrategy;

public class OrderbyName implements IComparisonStrategy {
	@Override
	public int comparisonf(Student a, Student b) {
		return a.name.compareToIgnoreCase(b.name);
	}

}
