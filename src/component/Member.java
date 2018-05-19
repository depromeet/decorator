package component;

import java.util.ArrayList;
import java.util.List;

public abstract class Member {
	protected List<String> nameList = new ArrayList();

	public List<String> getNameList() {
		return nameList;
	}

	public abstract String getName();
}
