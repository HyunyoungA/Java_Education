package com.kh.practice.chap01_poly.view;

import java.util.Scanner;

import com.kh.practice.chap01_poly.controller.LibraryController;
import com.kh.practice.chap01_poly.model.vo.Book;
import com.kh.practice.chap01_poly.model.vo.Member;

public class LibraryMenu {
	private LibraryController lc = new LibraryController();
	private Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		System.out.print("성별 : ");
		char gender = sc.next().charAt(0); //**nexeLint() X --> next()**
		
		Member m = new Member(name, age, gender);
		lc.insertMember(m);
		
		int i = 0;
		while(true){//**조건식을 true로 설정하고 무한 반복!!**
			System.out.println("==== 메뉴 ====");
			System.out.println("1. 마이페이지");
			System.out.println("2. 도서 전체 조회"); 
			System.out.println("3. 도서 검색");
			System.out.println("4. 도서 대여하기");
			System.out.println("9. 프로그램 종료하기");
			System.out.print("메뉴 번호 : ");
			i = sc.nextInt();
			
			switch(i) {
			case 1 : System.out.print(lc.myInfo()); break;
			case 2 : selectAll(); break;
			case 3 : searchBook(); break;
			case 4 : rentBook(); break;
			case 9 : System.out.println("프로그램을 종료합니다.");return;
			default : System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
			
		}
	}
	public void selectAll() {
		
		Book[] bList = lc.selectAll();
		
		for(int i = 0; i < bList.length; i++) {
			System.out.println( i + "번 도서 : " + bList[i]);
		}
	}
	
	public void searchBook() {
		System.out.println();
		System.out.print("검색할 제목 키워드 : ");
		String keyword = sc.nextLine();
		
		Book[] searchList = lc.searchBook(keyword);
		
		for(int i = 0; i < searchList.length; i++) {
			if(searchList[i] != null);
			System.out.println(searchList[i]);
		}
		
		//그 결과 값을 Book[] 자료형 searchList에 담아 검색 결과인 도서 목록 출력
	}
	public void rentBook() {
		System.out.println();
		selectAll();
//		Scanner sc = new Scanner(System.in);
		System.out.println("대여할 도서 번호 선택 : ");
		int num = sc.nextInt();
		
		int result = lc.rentBook(num);
		
		if(result == 0) {
			System.out.println("성공적으로 대여되었습니다.");
		}else if(result == 1) {
			System.out.println("나이 제한으로 대여 불가능입니다.");
		}else {
			System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었으니 마이페이지에서 확인하세요");
		}
	}

}
