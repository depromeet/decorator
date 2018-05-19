package decorator;

import component.Member;

public class Developer extends Prefix {
	
	public Developer(Member member) {
		// TODO Auto-generated constructor stub
		super(member);
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		String name = member.getName();

		member.getNameList().add("Developer");
		return String.join(", ", member.getNameList());

	}

}
