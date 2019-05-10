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

package org.appdapter.gui.demo;

import java.beans.PropertyVetoException;
import java.lang.reflect.InvocationTargetException;

import org.appdapter.api.trigger.Box;
import org.appdapter.api.trigger.BoxContext;
import org.appdapter.api.trigger.MutableBox;
import org.appdapter.trigger.bind.jena.TriggerImpl;
import org.appdapter.bind.rdf.jena.assembly.CachingComponentAssembler;
import org.appdapter.core.log.Debuggable;
import org.appdapter.gui.api.ScreenBox.Kind;
import org.appdapter.gui.api.WrapperValue;
import org.appdapter.gui.box.ScreenBoxImpl;
import org.appdapter.gui.browse.Utility;
import org.appdapter.gui.trigger.PanelTriggers;

/**
 * @author Stu B. <www.texpedient.com>
 */
public class DemoServiceWrapFuncs {
	private static <BT extends ScreenBoxImpl<TT>, TT extends TriggerImpl<BT>> BT makeTestBoxImpl(Class<BT> boxClass, Class<TT> trigClass, String label) {
		BT result = CachingComponentAssembler.makeEmptyComponent(boxClass);
		result.setShortLabel(label);
		result.setDescription("full description for box with label: " + label);
		return result;
	}

	public static <BT extends ScreenBoxImpl<TT>, TT extends TriggerImpl<BT>> BT makeTestBoxImplWithValue(Class<BT> boxClass, Object value, String label) {
		BT result = CachingComponentAssembler.makeEmptyComponent(boxClass);
		if (!WrapperValue.class.isAssignableFrom(boxClass)) {
			try {
				result = (BT) Utility.uiObjects.findOrCreateBox(label, value);
			} catch (PropertyVetoException e) {
				throw Debuggable.reThrowable(e);
			}
		} else {
			result = CachingComponentAssembler.makeEmptyComponent(boxClass);
		}
		result.setShortLabel(label);
		result.setDescription("full description for box with label: " + label);
		try {
			result.setObject(value);
		} catch (InvocationTargetException ite) {
			throw Debuggable.reThrowable(ite);
		}
		return result;
	}

	/**
	 * Makes a ScreenBox, using the type of trigProto to define the allowed trigger type of the box.
	 * The data/contents of trigProto is not used.
	 * @param <BT>
	 * @param <TT>
	 * @param boxClass
	 * @param trigProto
	 * @param label
	 * @return 
	 */
	public static <BT extends ScreenBoxImpl<TT>, TT extends TriggerImpl<BT>> BT makeTestBoxImpl(Class<BT> boxClass, TT trigProto, String label) {
		BT result = CachingComponentAssembler.makeEmptyComponent(boxClass);
		result.setShortLabel(label);
		result.setDescription("full description for box with label: " + label);
		return result;
	}

	/** Make a ScreenBox and attach it as a child to an existing parentBox.
	 * trigProto to define the allowed trigger type of the new box.
	 * The data/contents of trigProto is not used.
	 * 
	 * @param <BT>
	 * @param <TT>
	 * @param parentBox
	 * @param childBoxClass
	 * @param trigProto
	 * @param label
	 * @return 
	 */
	public static <BT extends ScreenBoxImpl<TT>, TT extends TriggerImpl<BT>> BT makeTestChildBoxImpl(Box parentBox, Class<BT> childBoxClass, TT trigProto, String label) {
		BT result = null;
		BoxContext ctx = parentBox.getBoxContext();
		result = makeTestBoxImpl(childBoxClass, trigProto, label);
		ctx.contextualizeAndAttachChildBox(parentBox, result);
		return result;
	}

	public static <BT extends ScreenBoxImpl<TT>, TT extends TriggerImpl<BT>> BT makeTestChildBoxImplWithObj(Box parentBox, Class<BT> childBoxClass, Object value, String label) {
		BT result = null;
		BoxContext ctx = parentBox.getBoxContext();
		result = makeTestBoxImplWithValue(childBoxClass, value, label);
		ctx.contextualizeAndAttachChildBox(parentBox, result);
		return result;
	}

	public static PanelTriggers.OpenTrigger attachPanelOpenTrigger(MutableBox box, String label, Kind kind) {
		PanelTriggers.OpenTrigger trig = new PanelTriggers.OpenTrigger();
		trig.setShortLabel(label);
		trig.setPanelKind(kind);
		box.attachTrigger(trig);
		return trig;
	}
}
