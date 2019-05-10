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
package eu.larkc.core.data;

import org.apache.log4j.Logger;

import com.ontotext.ordi.Factory;
import com.ontotext.ordi.tripleset.TSource;

class DataLayerService {
	
	private static TSource ordi;
	private static Thread shutdownThread;
	private static Logger logger = Logger.getLogger(DataLayerService.class);
	private static String NO_PERSIST = "eu.larkc.core.data.persistence";

	static synchronized TSource getORDI() {
		if (ordi == null) {
			String queryOptimize = System.getProperty("trree.optimization",
					"true");
			System.setProperty("trree.optimization", queryOptimize);
			ordi = Factory.createDefaultTSource();
			Runtime rt = Runtime.getRuntime();
			shutdownThread = new Thread() {
				@Override
				public void run() {
					logger.info("Shutdown request is invoked!");
					String persist = System.getProperty(NO_PERSIST, "true");
					if (persist.equals("false")) {
						logger.info("No data persistence set!");
					} else {
						ordi.shutdown();
					}
				}
			};
			rt.addShutdownHook(shutdownThread);
		}
		return ordi;
	}
	
	static synchronized void setORDI(TSource source) {
		ordi = source;
	}
}
