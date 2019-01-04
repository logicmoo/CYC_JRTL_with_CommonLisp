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

import org.appdapter.api.trigger.MutableBox;
import org.appdapter.trigger.bind.jena.TriggerImpl;
import org.appdapter.gui.box.ScreenBoxImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Stu B. <www.texpedient.com>
 *
 * 	End run factory methods for bootstrap triggers (not read from config).
 * // MBT extends MutableBox<? extends TT>,
 */
public class BootstrapTriggerFactory { // <TT extends Trigger<? extends MutableBox<? extends TT>> & MutableKnownComponent> {
	static Logger theLogger = LoggerFactory.getLogger(BootstrapTriggerFactory.class);

	// public  <BT extends Box<? extends TT>, TT extends MutableTrigger<BT> & MutableKnownComponent> TT
	<CTT extends ConcreteTrigger> CTT putNewConcreteTriggerOnBox(MutableBox<ConcreteTrigger> mbox, Class<CTT> trigClass, String trigName)  {
		CTT trig = null;
		try {
			trig = trigClass.newInstance();
			trig.setShortLabel(trigName);
			mbox.attachTrigger(trig);

		} catch (Throwable t) {
			theLogger.error("Problem building trigger for class " + trigClass + " with name " + trigName, t);
		}
		return trig;
	}
	public <RTTS extends ScreenBoxImpl<RTT>, RTT extends TriggerImpl<RTTS>> RTT putTriggerOnBox(MutableBox<? super RTT> mbox, Class<RTT> trigClass, String trigName) {
		return null;
	}
	public <BTS extends TriggerImpl<BT>, BT extends ScreenBoxImpl<BTS>> TriggerImpl<BT> attachNewTrigger(BT box, Class<? extends TriggerImpl<BT>> trigClass,  String trigName) {
		TriggerImpl<BT> trig = null;
		try {
			trig = trigClass.newInstance();
			attachTrigger(box, trig, trigName);
		} catch (Throwable t) {
			theLogger.error("Problem building trigger for class " + trigClass + " with name " + trigName, t);
		}
		return trig;
	}

	public <BTS extends TriggerImpl<BT>, BT extends ScreenBoxImpl<BTS>> void attachTrigger(BT box, TriggerImpl<BT> trigger,  String trigName) {
		trigger.setShortLabel(trigName);
		box.attachTrigger((BTS) trigger);
	}
}
