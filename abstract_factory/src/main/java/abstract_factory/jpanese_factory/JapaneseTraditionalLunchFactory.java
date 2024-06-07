package abstract_factory.jpanese_factory;

import abstract_factory.AbstractTraditionalLunchFactory;
import abstract_factory.FirstDish;
import abstract_factory.SecondDish;

public class JapaneseTraditionalLunchFactory implements AbstractTraditionalLunchFactory {

	@Override
	public FirstDish getFirstDish() {
		return new JapaneseFirstDish();
	}

	@Override
	public SecondDish getSecondDish() {
		return new JapaneseSecondDish();
	}

}
