package abstract_factory;

import abstract_factory.american_factory.AmericanTraditionalLunchFactory;
import abstract_factory.jpanese_factory.JapaneseTraditionalLunchFactory;
import abstract_factory.ukrainian_factory.UkrainianTraditionalLunchFactory;

public interface AbstractTraditionalLunchFactory {
	
	 FirstDish getFirstDish();
	 SecondDish getSecondDish();
	 
	 static AbstractTraditionalLunchFactory getTraditionalLunchFactory(String lunchName) {
		 return switch (lunchName) {
		 
		 	case "American" -> new AmericanTraditionalLunchFactory();
		 	case "Ukrainian" -> new UkrainianTraditionalLunchFactory();
		 	case "Japanese" -> new JapaneseTraditionalLunchFactory();
		 	
		 	default -> throw new IllegalArgumentException("Wrong lunch name - " + lunchName);
		 };
	 }

}
