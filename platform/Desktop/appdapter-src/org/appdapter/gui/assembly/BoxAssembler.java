/*
 *  Copyright 2011 by The Appdapter Project (www.appdapter.org).
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.appdapter.gui.assembly;

import java.util.List;
import java.util.Set;

import org.appdapter.api.trigger.BoxAssemblyNames;
import org.appdapter.api.trigger.Trigger;
import org.appdapter.bind.rdf.jena.assembly.DynamicCachingComponentAssembler;
import org.appdapter.core.component.ComponentAssemblyNames;
import org.appdapter.core.item.Item;
import org.appdapter.core.item.ItemFuncs;
import org.appdapter.gui.box.ScreenBoxImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.hp.hpl.jena.assembler.Assembler;
import com.hp.hpl.jena.assembler.Mode;
import com.hp.hpl.jena.rdf.model.Resource;

/**
 * @author Stu B. <www.texpedient.com>
 */
public class BoxAssembler extends DynamicCachingComponentAssembler<ScreenBoxImpl> {
	static Logger theLogger = LoggerFactory.getLogger(BoxAssembler.class);

	public BoxAssembler(Resource builderConfRes) {
		super(builderConfRes);
	}

	@Override
	protected void initExtendedFieldsAndLinks(ScreenBoxImpl box, Item configItem, Assembler asmblr, Mode mode) {
		theLogger.info("bonus box init here");
		List<Object> linkedTriggers = getReader().findOrMakeLinkedObjects(configItem, BoxAssemblyNames.P_trigger, asmblr, mode, null);
		for (Object lt : linkedTriggers) {
			Trigger t = (Trigger) lt;
			box.attachTrigger(t);
		}

		Set<Item> extraItems = ItemFuncs.getLinkedItemSet(configItem, ComponentAssemblyNames.P_extraThing);
		System.out.println("Found extraItems: " + extraItems);

	}

}
