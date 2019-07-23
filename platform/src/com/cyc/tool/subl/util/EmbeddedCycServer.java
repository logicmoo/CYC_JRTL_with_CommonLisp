/* For LarKC */
package com.cyc.tool.subl.util;

import java.io.InputStream;
import java.io.OutputStream;

public interface EmbeddedCycServer {
	void initialize(String p0, String[] p1);

	void processRequest(String p0, InputStream p1, OutputStream p2);

	void shutdown();
}
