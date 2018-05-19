package decorator;

import component.Member;

public abstract class Prefix extends Member {
	Member member;
	
	public Prefix(Member member) {
		// TODO Auto-generated constructor stub
		this.member = member;
	}

	public abstract String getName();

}
