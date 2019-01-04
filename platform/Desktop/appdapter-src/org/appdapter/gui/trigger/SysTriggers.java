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

package org.appdapter.gui.trigger;

import javax.swing.JFrame;

import org.appdapter.api.trigger.Box;
import org.appdapter.trigger.bind.jena.TriggerImpl;
import org.appdapter.gui.box.ScreenBoxImpl;
import org.appdapter.gui.browse.Utility;
import org.appdapter.gui.demo.DemoBrowser;

//import twinkle.ui.components.ComponentRegistry;
//import twinkle.ui.components.TwinkleMain;

/**
 * @author Stu B. <www.texpedient.com>
 */
public class SysTriggers {

	public enum Kind {
		QUIT, DUMP
	}

	public static class QuitTrigger<BT extends Box<TriggerImpl<BT>>> extends TriggerImpl<BT> {

		public TriggerImpl<BT> makeTrigger(Class<BT> captures) {
			return new QuitTrigger<BT>();
		}

		@Override public void fire(BT targetBox) {
			logInfo(toString() + "-firing, program exiting");
			DemoBrowser.close();
		}
	}

	// Example of the shorter, less-safe, raw typing style.
	public static class DumpTrigger extends TriggerImpl {
		@Override public void fire(Box targetBox) {
			logInfo(toString() + "-dumping");
			((ScreenBoxImpl) targetBox).dump();
		}
	}

}
