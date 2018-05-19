package component;

import java.util.List;

public class Chansoo extends Member {

	public Chansoo() {
		super();
		nameList.add("Chansoo");
	}

	@Override
	public String getName() {
		return "Chansoo";
	}

	@Override
	public List<String> getNameList() {
		return nameList;
	}
}
