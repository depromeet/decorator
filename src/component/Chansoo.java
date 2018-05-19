package component;

public class Chansoo extends Member {

	@Override
	public String getName() {
		nameList.add("Chansoo");
		return String.join(", ", nameList);
	}

}
