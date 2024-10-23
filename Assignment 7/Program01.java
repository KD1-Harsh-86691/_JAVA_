// KD1-86691-HARSH

package com.cdac.p4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class StuCityComparator implements Comparator<Student> {
	@Override
	public int compare(Student o1, Student o2) {
		return o1.city.compareTo(o2.city);
	}
}

class StuMarksComparatorDesc implements Comparator<Student>{
	@Override
	public int compare(Student o1, Student o2) {
		return Double.compare(o2.marks,o1.marks);
	}
}

class StuNameComparatorAsc implements Comparator<Student>{
	@Override
	public int compare(Student o1, Student o2) {
		return o1.name.compareTo(o2.name);
	}
}


public  class Program01{
	
	public static int menu(Scanner sc) {
		System.out.println("0. EXIT");
		System.out.println("1. sorted on their city (asc)  ");
		System.out.println("2. sorted on their on marks (desc) ");
		System.out.println("3. sorted on their on name (asc) ");
		System.out.println("4. sorted on the rollno");
		return sc.nextInt();
	}
	
	public static void displayAllStudent(Student[] arr) {
		System.out.println("+++++++++++++++++++++++++++");
		for (Student student : arr)
			System.out.println(student);
		System.out.println("+++++++++++++++++++++++++++");
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student[] arr = new Student[5];
		Comparator<Student> comparator;
		arr[0] = new Student(11,"Harsh","Gwalior",14);
		arr[1] = new Student(5,"Messi","Argentina",11);
		arr[2] = new Student(7,"Yamal","Spain",12);
		arr[3] = new Student(9,"Isko","Spain",13);
		arr[4] = new Student(13,"Salah","Germany",16);
		
		int choice;
		while((choice = menu(sc))!=0) {
			switch (choice) {
			case 1:
				comparator = new StuCityComparator();
				Arrays.sort(arr,comparator);
				displayAllStudent(arr);
				break;
				
			case 2:
				comparator = new StuMarksComparatorDesc();
				Arrays.sort(arr,comparator);
				displayAllStudent(arr);
				
			case 3:
				comparator = new StuNameComparatorAsc();
				Arrays.sort(arr,comparator);
				displayAllStudent(arr);
				
			case 4:
//				Student student = new Student();
				Arrays.sort(arr);
				displayAllStudent(arr);
				

			default:
				System.out.println("Wrong Choice....");
				break;
			}
		}
		
		
		
	}
}
	
