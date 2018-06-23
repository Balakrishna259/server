package com.java.excel;

import java.util.Comparator;

public class Yyuio implements Comparator {



	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		
		return ((Person)o1).getLastName().compareTo(((Person)o2).getLastName());
	}

	

}
