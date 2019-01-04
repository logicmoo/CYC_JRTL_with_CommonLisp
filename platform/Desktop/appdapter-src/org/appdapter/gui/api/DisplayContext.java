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

package org.appdapter.gui.api;

import java.util.Collection;

import org.appdapter.api.trigger.Trigger;
import org.appdapter.api.trigger.UserResult;
import org.appdapter.gui.util.Annotations.UIProvider;


/**
 * @author Stu B. <www.texpedient.com>
 */
public interface DisplayContext extends UIProvider/*, IShowObjectMessageAndErrors*/{
	// TODO : replace this with general BoxPanelSwitchableView
	public BoxPanelSwitchableView getBoxPanelTabPane();

	public NamedObjectCollection getLocalBoxedChildren();

	/**
	 * Return triggers that are useful specifically to this DisplayContext (example: Remove $obj from this tab)
	 * 
	 * @param box
	 * @param object
	 * @return
	 */
	public Collection<Trigger> getTriggersFromUI(Object object);

	public UserResult addObject(String title, Object value, boolean showASAP) throws Exception;

	/**
	 * Return the local Name of $obj
	 * @param value
	 * @return
	 */
	public String getTitleOf(Object value);

}
