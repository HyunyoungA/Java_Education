package com.kh.practice.set.model.vo;

public class Lottery {
	private String name;
	private String phone;
	
	public Lottery() {}
	public Lottery(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {//객체의 정보를 리턴하는 메소드
		return name + "(" + phone + ")";
	}
	@Override
	public int hashCode() {//해시코트를 리턴하는 메소드
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + (name == null ? 0 : name.hashCode()); 
		result = PRIME * result + (phone == null ? 0 : phone.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {//객체가 같은지 여부를 리턴하는 메소드
		if(this == obj) {
			return true;
		}
		if(obj == null) {
			return false;
		}
		if(getClass() != obj.getClass()) {
			return false;
		}
		
		Lottery other = (Lottery)obj;
		if(name == null) {
			if(other.name != null) {
				return false;
			}
		}else if(!name.equals(other.name)) {
			return false;
		}
		if(phone == null) {
			if(other.phone != null) {
				return false;
			}
		}else if(!phone.equals(other.phone)) {
			return false;
		}
		return true;
	}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
