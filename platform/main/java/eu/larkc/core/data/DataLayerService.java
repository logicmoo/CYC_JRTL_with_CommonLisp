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
