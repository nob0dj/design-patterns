package com.sh.member.model.vo;


import com.sh.member.model.visitor.Visitor;

public class Gold extends Member {

	public Gold() {}

	public Gold(String name, String grade, int point) {
		super(name, grade, point);
	}
	
	
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	
}