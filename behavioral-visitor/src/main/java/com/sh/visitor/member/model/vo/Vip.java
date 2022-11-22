package com.sh.visitor.member.model.vo;


import com.sh.visitor.member.model.visitor.Visitor;

public class Vip extends Member {
	
	public Vip(){}
	
	public Vip(String name, String grade, int point){
		super(name, grade, point);
	}
	
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}