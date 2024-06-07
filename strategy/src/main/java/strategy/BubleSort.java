package strategy;

import java.util.List;

public class BubleSort implements IStrategy {

	@Override
	public List<Integer> sort(List<Integer> list) {
		for (int i = 0; i < list.size(); i++) {
			for (int j = 1; j < (list.size() - i); j++) {
				Integer a = list.get(j - 1);
				Integer b = list.get(j);
				if (a > b) {
					// swap elements
					int indexA = list.indexOf(a);
					int indexB = list.indexOf(b);
					list.set(indexB, a);
					list.set(indexA, b);
				}
			}
		}
		return list;
	}

}
