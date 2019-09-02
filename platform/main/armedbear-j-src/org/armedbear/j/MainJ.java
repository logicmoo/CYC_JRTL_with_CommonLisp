/*
   This file is part of the LarKC platform 
   http://www.larkc.eu/

   Copyright 2010 LarKC project consortium

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */
package org.armedbear.j;

import java.lang.reflect.Method;

import org.logicmoo.system.Startup;

/**
 * TODO Describe this type briefly. 
 * If necessary include a longer description and/or an example.
 * 
 * @author Administrator
 *
 */
public class MainJ {
	public static void main(String[] args) {
    	args = Startup.extractOptions(MainJ.class, args);
		final String version = System.getProperty("java.version");
		if (version.startsWith("1.0") || version.startsWith("1.1") || version.startsWith("1.2") || version.startsWith("1.3")) {
			System.err.println("");
			System.err.print("J requires Java 1.4 or later.");
			System.err.println(" (Java 1.4.2 is recommended.)");
			System.err.println("");
			// System.exit(1);
		}
		try {
			Class c = Class.forName("org.armedbear.j.Editor");
			Class[] parameterTypes = new Class[1];
			parameterTypes[0] = String[].class;
			Method method = c.getMethod("main", parameterTypes);
			Object[] parameters = new Object[1];
			parameters[0] = args;
			method.invoke(null, parameters);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}