package com.sh.visitor.member.model.visitor;

import com.sh.visitor.member.model.vo.Gold;
import com.sh.visitor.member.model.vo.Silver;
import com.sh.visitor.member.model.vo.Vip;

public class BuyVisitor implements Visitor {

	private int price;
	private double discountRate;
	
	public BuyVisitor(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return (int) (price - price * discountRate);
	}

	@Override
	public void visit(Gold gold) {
		this.discountRate = 0.05;
	}

	@Override
	public void visit(Silver silver) {
		this.discountRate = 0.02;
	}

	@Override
	public void visit(Vip vip) {
		this.discountRate = 0.1;
	}

}
