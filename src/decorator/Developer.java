package decorator;

import component.Member;

import java.util.List;

public class Developer extends MemberDecorator {
	
	public Developer(Member member) {
		super(member);
		member.getNameList().add("Developer");
	}

	@Override
	public String getName() {
		return "Developer " + member.getName();
	}

	@Override
	public List<String> getNameList() {
		return member.getNameList();
	}
}
