package abstract_factory.ukrainian_factory;

import abstract_factory.AbstractTraditionalLunchFactory;
import abstract_factory.FirstDish;
import abstract_factory.SecondDish;

public class UkrainianTraditionalLunchFactory implements AbstractTraditionalLunchFactory {

	@Override
	public FirstDish getFirstDish() {
		return new UkrainianFirstDish();
	}

	@Override
	public SecondDish getSecondDish() {
		return new UkrainianSecondDish();
	}

}
