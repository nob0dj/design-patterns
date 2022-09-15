package com.sh.member.controller;


import com.sh.member.model.visitor.BuyVisitor;
import com.sh.member.model.visitor.EjaVisitor;
import com.sh.member.model.vo.Member;

public class MemberManager {
	public static final int MAX_MEMBER = 40;
	private Member[] memberArr = new Member[MAX_MEMBER];
	private int memberIndex = 0;
	
	//다형성 
	public void insertMember(Member m){
		this.memberArr[memberIndex++] = m;
	}
	
	public void printEjaInfo() {
		EjaVisitor visitor = new EjaVisitor();
		System.out.println("-----------정보출력-------------");
		System.out.printf("%-15s %-15s %-15s %-15s\n", "이름","등급","포인트","이자포인트");
		for(int i = 0; i < memberIndex; i++){
			Member m = memberArr[i];
			m.accept(visitor);
			System.out.printf("%-15s %-15s %-15d %-15.2f\n", 
							  m.getName(), 
							  m.getGrade(), 
							  m.getPoint(), 
							  visitor.getEja());
		}
	}
	
	public void printBuyInfo(int price) {
		BuyVisitor visitor = new BuyVisitor(price);
		for(int i = 0; i < memberIndex; i++) {
			memberArr[i].accept(visitor);
			System.out.printf("%s등급회원 %s는 %d원 상품을 %d원에 구매합니다.\n", 
					memberArr[i].getGrade(), 
					memberArr[i].getName(), 
					price, 
					visitor.getPrice());
		}
	}
}
