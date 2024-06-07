package abstract_factory.american_factory;

import abstract_factory.AbstractTraditionalLunchFactory;
import abstract_factory.FirstDish;
import abstract_factory.SecondDish;

public class AmericanTraditionalLunchFactory implements AbstractTraditionalLunchFactory {

	@Override
	public FirstDish getFirstDish() {
		return new AmericanFirstDish();
	}

	@Override
	public SecondDish getSecondDish() {
		return new AmericanSecondDish();
	}

}
