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

import org.appdapter.trigger.bind.jena.TriggerImpl;
import org.appdapter.bind.rdf.jena.assembly.DynamicCachingComponentAssembler;
import org.appdapter.core.item.Item;
import org.appdapter.core.name.Ident;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.hp.hpl.jena.assembler.Assembler;
import com.hp.hpl.jena.assembler.Mode;
import com.hp.hpl.jena.rdf.model.Resource;

/**
 * @author Stu B. <www.texpedient.com>
 */
public class TriggerAssembler extends DynamicCachingComponentAssembler<TriggerImpl> {
	static Logger theLogger = LoggerFactory.getLogger(TriggerAssembler.class);

	public TriggerAssembler(Resource builderConfRes) {
		super(builderConfRes);
	}

	@Override
	protected void initExtendedFieldsAndLinks(TriggerImpl comp, Item configItem, Assembler asmblr, Mode mode) {
		theLogger.info("bonus trigger init here");
		Ident compID = comp.getIdent();
		//TriggerImpl bt = TriggerImpl.attachNoargsTrigger(mbox, btClass, apsbLabel);
	}

}
