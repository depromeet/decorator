package component;

import java.util.List;

public class Seowan extends Member {

	public Seowan() {
		super();
		nameList.add("Seowan");
	}

	@Override
	public String getName() {
		return "Seowan";
	}

	@Override
	public List<String> getNameList() {
		return nameList;
	}
}
