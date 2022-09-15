package com.sh.member.model.vo;

import com.sh.member.model.visitor.Visitor;
public abstract class Member {
	/*protected도 가능*/
	private String name;
	private String grade;
	private int point;
	
	public Member(){}
	
	public Member(String name, String grade, int point) {
		this.name = name;
		this.grade = grade;
		this.point = point;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
	// visitor구현체 등록 추상메소드
	public abstract void accept(Visitor visitor);
}