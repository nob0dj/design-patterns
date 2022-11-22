package com.sh.visitor.member.model.visitor;


import com.sh.visitor.member.model.vo.Gold;
import com.sh.visitor.member.model.vo.Silver;
import com.sh.visitor.member.model.vo.Vip;

public interface Visitor {

	void visit(Gold gold);
	void visit(Silver silver);
	void visit(Vip vip);
}
