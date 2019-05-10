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
//<editor-fold defaultstate="collapsed" desc="comment">
package org.appdapter.bind.log4j;

import java.net.URL;

import org.apache.log4j.PropertyConfigurator;

//</editor-fold>
/**
 * @author Stu B. <www.texpedient.com>
 */
public class Log4jFuncs {
	public static void forceLog4jConfig(URL propertiesURL) {

		System.out.println("[System.out] " + Log4jFuncs.class.getName() + 
						" is forcing Log4J to read config from propertiesURL: " + propertiesURL);
		PropertyConfigurator.configure(propertiesURL);
		
		
	}
}
