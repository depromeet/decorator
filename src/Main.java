
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member m = new Developer(new Seowan());
		System.out.println(m.getName());
		Member e = new Developer(new Designer(new Chansoo()));
		System.out.println(e.getName());
	}

}
