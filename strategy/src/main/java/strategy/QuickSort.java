package strategy;

import java.util.List;

public class QuickSort implements IStrategy {

	@Override
	public List<Integer> sort(List<Integer> list) {
		list.sort((o1, o2) -> o1.compareTo(o2));
		return list;
	}

}
