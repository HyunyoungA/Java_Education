package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice1 {
	
	public void inputScanner1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸��� �Է��ϼ��� : ");
		String name = sc.nextLine();
		System.out.print("������ �Է��ϼ���(��/��) : ");
		String strGender = sc.nextLine();
		char gender = strGender.charAt(0);
		System.out.print("���̸� �Է��ϼ��� : ");
		int age = sc.nextInt();
		System.out.print("Ű�� �Է��ϼ���(cm) : ");
		double height = sc.nextDouble();
		System.out.printf("Ű %scm�� %d�� %s�� %s�� �ݰ����ϴ�^^", height, age, strGender, name);
		
	}

}