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

import org.appdapter.api.trigger.Box;
import org.appdapter.trigger.bind.jena.TriggerImpl;
import org.appdapter.bind.sql.h2.DatabaseConnector;
import org.appdapter.demo.DemoDatabase;

/**
 * @author Stu B. <www.texpedient.com>
 */
public class DatabaseTriggers {


	public enum Kind {
		OPEN,
		CLOSE
	}

	public static class InitTrigger<BT extends Box<TriggerImpl<BT>>> extends  TriggerImpl<BT> {
		@Override public void fire(BT targetBox) {
			logInfo(toString() + "-initing");
			DatabaseConnector dbc = DemoDatabase.initConnector();
			org.appdapter.gui.browse.Utility.showResult(dbc);
		}
	}
}
