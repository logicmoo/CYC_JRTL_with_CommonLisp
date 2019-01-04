package org.appdapter.gui.util;

import java.util.HashSet;

class FunctionalRegisteryDef<SRCHKEY, RESULT> {

	static public interface MapTester<SRCHKEY2> {
		int meetSearchCriteria(SRCHKEY2 t, SRCHKEY2 c);
	}

	RESULT foundObject;
	MapTester map;
	HashSet<SRCHKEY> worksFor = new HashSet<SRCHKEY>();
	HashSet<SRCHKEY> worksAgainst = new HashSet<SRCHKEY>();

	public FunctionalRegisteryDef(FunctionalRegisteryDef.MapTester<SRCHKEY> map, RESULT customizerClass, SRCHKEY... worksForClass) {
		this.map = map;
		addWorksFor(worksForClass);
		foundObject = customizerClass;
	}

	void addWorksFor(SRCHKEY[] worksForClass) {
		for (SRCHKEY c : worksForClass) {
			worksFor.add(c);
		}
	}

	RESULT getFunctional() {
		return foundObject;
	}

	int getRatingForClass(SRCHKEY c) {
		int score = 0;
		for (SRCHKEY t : worksFor) {
			int goodness = isAssignableFrom(t, c);
			if (goodness > 0)
				score++;
		}
		for (SRCHKEY t : worksAgainst) {
			int goodness = isAssignableFrom(t, c);
			if (goodness > 0)
				score--;
		}
		return score;
	}

	private int isAssignableFrom(SRCHKEY t, SRCHKEY c) {
		return map.meetSearchCriteria(t, c);
	}
}