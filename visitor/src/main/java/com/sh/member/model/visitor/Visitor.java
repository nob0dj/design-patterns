package com.sh.member.model.visitor;


import com.sh.member.model.vo.Gold;
import com.sh.member.model.vo.Silver;
import com.sh.member.model.vo.Vip;

public interface Visitor {

	void visit(Gold gold);
	void visit(Silver silver);
	void visit(Vip vip);
}
