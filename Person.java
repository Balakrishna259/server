package com.java.excel;

import java.util.Scanner;
import java.util.TreeMap;

public class Person implements Comparable {

	public double id;
	public String name;
	public String lastName;
	
	public Person() {

	}
	
	
	public Person(int id, String name, String lastName) {
		this.id = id;
		this.name = name;
		this.lastName = lastName;
	}
	
	public double getId() {
		return id;
	}

	public void setId(double id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", lastName=" + lastName + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	@Override
	public int compareTo(Object o) {
		//((Person)o).getName().compareTo(this.getName());
	 return this.getName().compareTo(((Person)o).getName());
	}
	




//	public static void main(String[] args) {
//		
//		TreeMap<Integer, String> m =new TreeMap<>();
//		m.put(1, "Bala");
//		m.put(2, "Aksh");
//		m.put(3, "Kart");
//		m.put(4, "Vina");
//		m.put(5, "Ajay");
//		m.put(6, "Puji");
//		m.put(7, "Anud");
//		
//		System.out.println(m);
//		
//		System.out.println(m.get(1));
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter values to insert into map");
//		m.put(8, sc.nextLine());
//		System.out.println(m);
//		
//	}


}
