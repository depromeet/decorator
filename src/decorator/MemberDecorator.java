package decorator;

import component.Member;

public abstract class MemberDecorator extends Member {
	Member member;
	
	protected MemberDecorator(Member member) {
		this.member = member;
	}
}
