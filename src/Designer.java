
public class Designer extends Prefix {

	public Designer(Member member) {
		super(member);
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Designer " + member.getName();
	}
}