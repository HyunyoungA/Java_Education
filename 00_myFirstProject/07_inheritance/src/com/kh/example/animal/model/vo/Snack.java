package com.kh.example.animal.model.vo;

public class Snack extends Animal{// extends Animal �̰ɷ� ��� Ŭ���� ������.
	private String pattern;
	
	public Snack() {}
	public Snack (String name, int age, double weight, String pattern) {
		super(name, age, weight);
		this.pattern = pattern;
	}
	
	public void setPattern(String pattern) {
		this.pattern = pattern;
	}
	public String getPattern() {
		return pattern;
	}
//	@Override
//	public String inform() {
//		 return super.inform() + " " + pattern;//���ۼ��� �������̵�
//	}
//	@Override
//	public String inform() {//conrtoll + �����̽��� -->�������̵� ������ â�� ������
//		return super.inform() + " " + pattern;
//	}
	@Override
		public String toString() {
			return super.toString() + " " + pattern;
		}
	
	
	
	
	
	
	
	
	
}