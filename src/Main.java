import component.Chansoo;
import component.Member;
import component.Seowan;
import decorator.Designer;
import decorator.Developer;

public class Main {

	public static void main(String[] args) {
		Member m = new Seowan();
		m = new Developer(m);
		m = new Developer(m);
		print(m);
		printNameList(m);

		Member e = new Developer(new Designer(new Chansoo()));
		print(e);
		printNameList(e);

		Member chansoo = new Chansoo();
		print(chansoo);
		printNameList(chansoo);

		Member chansoo2 = new Chansoo();
		chansoo2 = new Developer(chansoo2);
		print(chansoo2);
		printNameList(chansoo2);

	}

	private static void print(Member member) {
		System.out.println("--------------------------");
		System.out.println("name : ");
		System.out.println(member.getName());
	}

	private static void printNameList(Member member) {
		System.out.println("--------------------------");
		System.out.println("name list : ");
		member.getNameList().forEach(System.out::println);
	}

}
