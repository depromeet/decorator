package component;

import java.util.ArrayList;
import java.util.List;

public abstract class Member {
	protected List<String> nameList;

	protected Member() {
		nameList = new ArrayList<>();
	}

	public abstract String getName();

	public abstract List<String> getNameList();
}
