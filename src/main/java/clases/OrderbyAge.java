package clases;

import interfaces.IComparisonStrategy;

public class OrderbyAge implements IComparisonStrategy {

	@Override
	public int comparisonf(Student a, Student b) {
		int r;
		if (a.age>b.age) {
			r=1;
		}
		else if (a.age<b.age) {
			r=-1;
		}
		else {
			r=0;
		}			
		return r;
	}

}
