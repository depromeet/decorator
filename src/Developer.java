
public class Developer extends Prefix{
	
	public Developer(Member member) {
		// TODO Auto-generated constructor stub
		super(member);
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Developer " + member.getName();
	}

}
