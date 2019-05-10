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

package org.appdapter.gui.repo;

import java.net.URL;
import java.util.*;

import org.appdapter.core.debug.UIAnnotations.UISalient;
import org.appdapter.core.debug.UIAnnotations.UtilClass;
import org.appdapter.api.trigger.Box;
import org.appdapter.api.trigger.BoxContext;
import org.appdapter.api.trigger.MutableBox;
import org.appdapter.api.trigger.Trigger;
import org.appdapter.trigger.bind.jena.TriggerImpl;
import org.appdapter.bind.rdf.jena.assembly.AssemblerUtils;
import org.appdapter.bind.rdf.jena.model.JenaFileManagerUtils;
import org.appdapter.core.convert.NoSuchConversionException;
import org.appdapter.core.convert.ReflectUtils;
import org.appdapter.core.log.Debuggable;
import org.appdapter.core.store.Repo;
import org.appdapter.demo.DemoResources;
import org.appdapter.gui.api.DisplayContext;
import org.appdapter.gui.browse.Utility;
import org.appdapter.gui.trigger.TriggerForClass;

import com.hp.hpl.jena.query.Dataset;
import com.hp.hpl.jena.rdf.model.Model;

/**
 * @author Stu B. <www.texpedient.com>
 */
public class BridgeTriggers implements UtilClass {

	@UISalient(MenuName = "<toplevel>|External Tools|Startup Twinkle main")//
	public static void startTwinkle() throws Throwable {
		Class.forName("twinkle.Twinkle").getMethod("main", String[].class).invoke(null, (Object) new String[0]);
	}

	@UISalient(MenuName = "<toplevel>|External Tools|Startup Swoop main")//
	public static void startSwoop() throws Throwable {
		Class.forName("org.mindswap.swoop.Swoop").getMethod("main", String[].class).invoke(null, (Object) new String[0]);
	}

	@UISalient(MenuName = "External Tools|Run Twinkle On Model %t", IsNotSideEffectSafe = true)//
	public static void startTwinkle(Model m) throws Throwable {
		Class.forName("twinkle.Twinkle").getMethod("mainWithModel", Model.class).invoke(null, m);
	}

	@UISalient(MenuName = "%m%p")//
	public static List<Model> getModelsFoundIn(Repo repo) {
		return getModelsFoundIn(repo.getMainQueryDataset());
	}

	@UISalient(MenuName = "%m%p")//
	public static List<Model> getModelsFoundIn(Dataset mainQueryDataset) {
		ArrayList<Model> models = new ArrayList<Model>();
		for (String s : ReflectUtils.toList(mainQueryDataset.listNames())) {
			models.add(mainQueryDataset.getNamedModel(s));
		}
		return models;
	}

	public static class MountSubmenuFromTriplesTrigger<BT extends Box<TriggerImpl<BT>>> extends TriggerImpl<BT> implements TriggerForClass {

		// as opposed to system gnerated triggers
		@Override public boolean isFavorited() {
			return true;
		}

		/**
		 *  return @true if the trigger can be invoked for a visual that changes no state
		 */
		@Override public boolean isSideEffectSafe() {
			return false;
		}

		@UISalient(MenuName = "triplesURLParam")
		public static Class<URL> boxTargetClass = URL.class;

		@Override public boolean appliesTarget(Class cls, Object anyObject) {
			return ReflectUtils.convertsTo(anyObject, cls, boxTargetClass);
		}

		@Override public Trigger createTrigger(String menuFmt, DisplayContext ctx, Object poj) {
			try {
				return new MountSubmenuFromTriplesTrigger(Utility.recast(poj, boxTargetClass));
			} catch (NoSuchConversionException e) {
				throw Debuggable.reThrowable(e);
			}
		}

		String triplesURL;

		public MountSubmenuFromTriplesTrigger(URL triplesURLParam) {
			triplesURL = triplesURLParam.toExternalForm();
		}

		public MountSubmenuFromTriplesTrigger(String triplesURLParam) {
			triplesURL = triplesURLParam;
		}

		@Override public void fire(BT targetBox) {
			logInfo(toString() + ".fire()");
			BoxContext bc = targetBox.getBoxContext();
			JenaFileManagerUtils.ensureClassLoaderRegisteredWithDefaultJenaFM(DemoResources.class.getClassLoader());
			logInfo("Loading triples from URL: " + triplesURL);
			try {
				Set<Object> loadedStuff = AssemblerUtils.buildAllObjectsInRdfFile(triplesURL);
				logInfo("Loaded " + loadedStuff.size() + " objects");
				for (Object o : loadedStuff) {
					if (o instanceof MutableBox) {
						MutableBox loadedMutableBox = (MutableBox) o;
						bc.contextualizeAndAttachChildBox(targetBox, loadedMutableBox);
						logInfo("Loaded mutable box: " + loadedMutableBox);
					} else {
						logInfo("Loaded object which is not a mutable box: " + o);
					}
				}
			} catch (Exception e) {

			}
		}

		@Override public Object getIdentityObject() {
			return (getClass() + ":" + triplesURL).intern();
		}
	}
}
