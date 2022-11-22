package com.sh.visitor.member.run;

import com.sh.visitor.member.controller.MemberManager;
import com.sh.visitor.member.model.vo.Gold;
import com.sh.visitor.member.model.vo.Silver;
import com.sh.visitor.member.model.vo.Vip;

public class Run {
	public static void main(String[] args){
		MemberManager m = new MemberManager();

		m.insertMember(new Silver("홍길동", "Silver", 1000));
		m.insertMember(new Silver("고길동", "Silver", 2000));
		m.insertMember(new Silver("홍동민", "Silver", 3000));
		m.insertMember(new Gold("김회장", "Gold", 1000));
		m.insertMember(new Gold("이회장", "Gold", 2000));
		m.insertMember(new Gold("오회장", "Gold", 3000));
		m.insertMember(new Vip("최순실", "Vip", 10000));
		
		// 1.이자 조회
		m.printEjaInfo();
		
		// 2.구매가 조회 : 판매가 10000원 상품의 등급별 실구매가 조회
		m.printBuyInfo(10000);
		
		
		
	}
}
