package org.appdapter.gui.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.appdapter.gui.util.FunctionalRegisteryDef.MapTester;

public abstract class FunctionalRegistryMap<SRCHKEY, RESULT> implements MapTester<SRCHKEY> {

	List<FunctionalRegisteryDef> customizerList = new ArrayList<FunctionalRegisteryDef>();

	public final RESULT findCustomizerClass(SRCHKEY c) {
		RESULT cc = tryFirstThenAltrates(c);
		if (cc == null) {
			FunctionalRegisteryDef<SRCHKEY, RESULT> cd = searchThisRegistry(c);
			if (cd != null) {
				cc = cd.getFunctional();
			}
		}
		if (cc == null) {
			cc = tryLast(c);
		}
		return cc;
	}

	public abstract SRCHKEY nextInListToTry(SRCHKEY c);

	public abstract RESULT tryFirst(SRCHKEY c);

	public abstract RESULT tryLast(SRCHKEY c);

	public abstract int meetSearchCriteria(SRCHKEY t, SRCHKEY c);

	public RESULT tryFirstThenAltrates(SRCHKEY c) {

		RESULT customizerClass = null;
		customizerClass = tryFirst(c);
		if (customizerClass == null) {
			if (c == Object.class) {
				return null;
			} else {
				try {
					SRCHKEY c1 = nextInListToTry(c);
					if (c1 == null)
						return null;
					return findCustomizerClass(c1);
				} catch (Exception e) {
					e.printStackTrace();
					return null;
				}
			}
		} else {
			return customizerClass;
		}
	}

	public FunctionalRegisteryDef searchThisRegistry(SRCHKEY c) {
		FunctionalRegisteryDef best = null;
		double rate = 0;
		for (Iterator<FunctionalRegisteryDef> iterator = customizerList.iterator(); iterator.hasNext();) {
			FunctionalRegisteryDef type = iterator.next();
			double tr = type.getRatingForClass(c);
			if (tr > rate) {
				best = type;
				rate = tr;
			}
		}
		return best;
	}

	public void registerCustomizerDef(RESULT cust, SRCHKEY... forClasses) {
		FunctionalRegisteryDef<SRCHKEY, RESULT> def = findCustomizerDefOfCustomizer(cust);
		if (def == null)
			def = new FunctionalRegisteryDef(this, cust, forClasses);
		registerCustomizerDef(def);
	}

	private void registerCustomizerDef(FunctionalRegisteryDef<SRCHKEY, RESULT> def) {
		FunctionalRegisteryDef<SRCHKEY, RESULT> type = findCustomizerDefOfCustomizer(def.foundObject);
		if (type != null) {
			if (type == def)
				return;
			def.worksFor.addAll(type.worksFor);
			def.worksAgainst.addAll(type.worksAgainst);
		}
		customizerList.add(0, def);
	}

	private FunctionalRegisteryDef<SRCHKEY, RESULT> findCustomizerDefOfCustomizer(RESULT c) {
		for (Iterator<FunctionalRegisteryDef> iterator = customizerList.iterator(); iterator.hasNext();) {
			FunctionalRegisteryDef type = iterator.next();
			if (type.foundObject == c)
				return type;
		}
		return null;
	}

}
