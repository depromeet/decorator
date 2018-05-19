
public abstract class Prefix implements Member{
	Member member;
	
	public Prefix(Member member) {
		// TODO Auto-generated constructor stub
		this.member = member;
	}
	
	@Override
	public abstract String getName();
	
}
