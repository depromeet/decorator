import component.Chansoo;
import component.Member;
import component.Seowan;
import decorator.Designer;
import decorator.Developer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member m = new Seowan();
		m = new Developer(m);
		m = new Developer(m);
		print(m);

		Member e = new Developer(new Designer(new Chansoo()));
		print(e);

		Member chansoo = new Chansoo();
		print(chansoo);

		Member chansoo2 = new Chansoo();
		chansoo2 = new Developer(chansoo2);
		print(chansoo2);

	}

	private static void print(Member member) {
		System.out.println(member.getName());
	}

}
