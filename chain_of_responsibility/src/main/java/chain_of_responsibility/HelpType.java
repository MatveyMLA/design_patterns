package chain_of_responsibility;

import java.util.stream.Stream;

public enum HelpType {
	AMBULANCE(1),
	POLICE(2),
	FIREFITERS(3);
	
	private int helpNum;
	
	HelpType(int helpNum) {
		this.helpNum = helpNum;
	}

	public int getHelpNum() {
		return helpNum;
	}

	public void setHelpNum(int helpNum) {
		this.helpNum = helpNum;
	}
	
	static HelpType getByNum(int helpNum) {
		return Stream.of(HelpType.values())
				.filter(help -> help.getHelpNum() == helpNum)
				.findFirst()
				.get();
				
	}
	
}
