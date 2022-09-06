package com.sh.member.model.visitor;


import com.sh.member.model.vo.Gold;
import com.sh.member.model.vo.Silver;
import com.sh.member.model.vo.Vip;

public class EjaVisitor implements Visitor {
	
	private double eja;

	public double getEja() {
		return eja;
	}

	@Override
	public void visit(Gold gold) {
		this.eja = gold.getPoint() * 0.05;
	}

	@Override
	public void visit(Silver silver) {
		this.eja = silver.getPoint() * 0.02;
	}

	@Override
	public void visit(Vip vip) {
		this.eja = vip.getPoint() * 0.02;
	}
	
	
		

	
}
