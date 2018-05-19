package decorator;

import component.Member;

public class Designer extends Prefix {

	public Designer(Member member) {
		super(member);
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		String name = member.getName();

		member.getNameList().add("Designer");
		return String.join(", ", member.getNameList());
	}
}