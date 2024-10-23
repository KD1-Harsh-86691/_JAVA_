// KD1-86691-HARSH

package com.cdac.p4;

class Student implements Comparable<Student> {
	int roll;
	String name;
	String city;
	double marks;

	public Student() {
	}

	public Student(int roll, String name, String city, double marks) {
		this.roll = roll;
		this.name = name;
		this.city = city;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [ roll = " + roll + " name = " + name + " city = " + city + " marks = " + marks + "]";
	}

	@Override
	public int compareTo(Student o) {
		return this.roll - o.roll;
	}

}
