package decorator;

import component.Member;

import java.util.List;

public class Designer extends MemberDecorator {

	public Designer(Member member) {
		super(member);
		member.getNameList().add("Designer");
	}

	@Override
	public String getName() {
		return "Designer " + member.getName();
	}

	@Override
	public List<String> getNameList() {
		return member.getNameList();
	}
}
