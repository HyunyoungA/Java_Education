package com.kh.homework.person.controller;

import com.kh.homework.person.model.vo.Employee;
import com.kh.homework.person.model.vo.Student;

public class PersonController {
	private Student[] s = new Student[3];
	private Employee[] e = new Employee[10];
	
	public int[] personCount() {//**각 배열에 저장된 객체의 수를 정수배열에 담아 반환하는 메소드**
		int[] count = new int[2];
		
		for(int i = 0; i < s.length; i++) {
			if(s[i] != null) {
				count[0]++;
			}
		}
		for(int i = 0; i < e.length; i++) {
			if(e[i] != null) {
				count[1]++;
			}
		}
		return count;
	
	}
	public void insertStudent(String name, int age, double height, double weight, int grade, String major) {
		//매개변수로 받아온 데이터를 학생 객체 배열 중 빈 곳에 저장하는 메소드
		for(int i = 0; i < s.length; i++) {
			if(s[i] == null) {
				s[i] = new Student(name, age, height, weight, grade, major);
				break;
			}
		}
	}
	
	public Student[] printStudent() {
		return s;
	}
	
	public void insertEmployee (String name, int age, double height, double weight, int salary, String dept) {
		for(int i = 0; i < e.length; i++) {
			if(e[i] == null) {
				e[i] = new Employee(name, age, height, weight, salary, dept);
				break;
			}
		}
	}
	public Employee[] printEmployee() {
		return e;
	}
}
