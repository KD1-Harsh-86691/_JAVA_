package com.test;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

// Instead of using separate comparator class we are using nested local class. 
// So JVM does not handle multiple .class files.

public class MainApp {
	static List<Student> students = new LinkedList<Student>();

	public static int menu(Scanner sc) {
		System.out.println("0. EXIT");
		System.out.println("1. Add Student");
		System.out.println("2. Display Student");
		System.out.println("3. sorted on their on marks (desc)");
		System.out.println("4. sorted on their on name (asc)");
		System.out.println("5. sorted on their city (asc)");
		System.out.println("6. Remove Student on their roll no");
		System.out.println("7. Find Student on their roll no");
		System.out.println("Enter your choice : ");
		return sc.nextInt();
	}

	public static void displayAllStudents(List<Student> s) {
		System.out.println("----------------------------------------------");
		for (Student Student : s)
			System.out.println(Student);
		System.out.println("----------------------------------------------");
	}

	public static void addStudent(Scanner sc) {
		System.out.println("Enter roll no, name, city, marks");
		Student student = new Student(sc.nextInt(), sc.next(), sc.next(), sc.nextDouble());
		students.add(student);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student s = new Student();
		int choice;

		while ((choice = menu(sc)) != 0) {
			switch (choice) {
			case 1:
				addStudent(sc);
				break;
			case 2:
				if (students.size() > 0)
					displayAllStudents(students);
				else
					System.out.println("No student is present in list.");
				break;
			case 3: {
				class MarksComparator implements Comparator<Student> {
					@Override
					public int compare(Student o1, Student o2) {
						return Double.compare(o2.getMarks(), o1.getMarks());
					}
				}

				MarksComparator mc = new MarksComparator();
				Collections.sort(students, mc);
			}
				break;
			case 4: {
				class NameComparator implements Comparator<Student> {

					@Override
					public int compare(Student o1, Student o2) {
						return o1.getName().compareTo(o2.getName());
					}

				}
				NameComparator nc = new NameComparator();
				Collections.sort(students, nc);
			}
				break;
			case 5: {
				class CityComparator implements Comparator<Student> {

					@Override
					public int compare(Student o1, Student o2) {
						return o1.getCity().compareTo(o2.getCity());
					}

				}

				CityComparator cc = new CityComparator();
				Collections.sort(students, cc);
			}
				break;
			case 6: {
				System.out.println("Enter Student id to remove");

				s.setRoll(sc.nextInt());

				if (students.remove(s))
					System.out.println("Student removed successfully...");
				else
					System.out.println("Student Id is not matched..");
			}
				break;
			case 7: {
				System.out.println("Enter Student id to search ");
				s.setRoll(sc.nextInt());
				
				if (students.contains(s)) {
					for (Student stud : students) {
						if (s.getRoll() == stud.getRoll())
							System.out.println("Student found = "+stud);
					}
				}
				else
					System.out.println("Student Id is not matched..");
			}
				break;

			default:
				System.out.println("Wrong choice...");
				break;
			}

		}
	}

}
