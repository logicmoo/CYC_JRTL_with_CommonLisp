/*
 *  Copyright 2012 by The Appdapter Project (www.appdapter.org).
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
package org.appdapter.core.log;

// import org.appdapter.api.trigger.AnyOper.UIHidden;

/**
 * @author Stu B. <www.texpedient.com>
 */
// @UIHidden
public interface Loggable {
	public static int			IMPO_NORM		= 0;
	public static int			IMPO_LO			= -10;
	public static int			IMPO_LOLO		= -100;
	public static int			IMPO_MIN		= Integer.MIN_VALUE;
	public static int			IMPO_HI			= 10;
	public static int			IMPO_HIHI		= 100;
	public static int			IMPO_MAX		= Integer.MAX_VALUE;
	
	public void logInfo(int importance, String msg);
	public void logInfo(String msg);
	public void logError(String msg, Throwable t);
	public void logError(String msg);
	public void logWarning(String msg, Throwable t);
	public void logWarning(String msg);
	public void logDebug(String msg);
}
