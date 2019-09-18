package com.cyc.kb.client;

/*
 * #%L
 * KBAPI
 * %%
 * Copyright (C) 1995 - 2014 Cycorp, Inc
 * %%
 * This software is the proprietary information of Cycorp, Inc.
 * Use is subject to license terms.
 * #L%
 */

import java.util.HashMap;
import java.util.Map;

import com.cyc.base.cycobject.CycObject;
import com.cyc.kb.KBObject;



/**
 * A collection of utilities related to KB API.
 * @author jmoszko
 *
 */

public class KBUtils {
	
	/**
	 * This method takes a Map<KBObject, Object> instance and converts it to a Map<CycObject, Object> instance.
	 * 
	 * @param mapToConvert
	 * @return kboToCoMap
	 */
	public static Map<CycObject, Object> convertKBObjectMapToCoObjectMap (Map<KBObject, Object> mapToConvert) {
		Map<CycObject, Object> kboToCoMap = new HashMap<CycObject, Object>();
		for (Map.Entry<KBObject, Object> i : mapToConvert.entrySet()) {
			KBObject key = i.getKey();
			Object val = i.getValue();
			Object typedVal = null;
			if (val instanceof KBObject)
				typedVal = ((KBObject)val).getCore();
			else
				typedVal = val;
			kboToCoMap.put(key.getCore(), typedVal);
		}
		return kboToCoMap;
	}

}
