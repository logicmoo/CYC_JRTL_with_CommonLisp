/* For LarKC */
package com.cyc.tool.subl.management;

import java.lang.management.ManagementFactory;

import javax.management.MBeanServer;

import com.sun.management.HotSpotDiagnosticMXBean;

public class HeapDumper {
	private static HotSpotDiagnosticMXBean getHotspotMBean() {
		try {
			MBeanServer server = ManagementFactory.getPlatformMBeanServer();
			HotSpotDiagnosticMXBean bean = ManagementFactory.newPlatformMXBeanProxy(server,
					"com.sun.management:type=HotSpotDiagnostic", HotSpotDiagnosticMXBean.class);
			return bean;
		} catch (RuntimeException re) {
			throw re;
		} catch (Exception exp) {
			throw new RuntimeException(exp);
		}
	}

	private static void initHotspotMBean() {
		if (HeapDumper.hotspotMBean == null)
			synchronized (HeapDumper.class) {
				if (HeapDumper.hotspotMBean == null)
					HeapDumper.hotspotMBean = getHotspotMBean();
			}
	}

	public static void dumpHeap(String fileName, boolean live) {
		initHotspotMBean();
		try {
			HeapDumper.hotspotMBean.dumpHeap(fileName, live);
		} catch (RuntimeException re) {
			throw re;
		} catch (Exception exp) {
			throw new RuntimeException(exp);
		}
	}

	public static void main(String[] args) {
		String fileName = "heap.bin";
		boolean live = true;
		switch (args.length) {
		case 2:
			live = args[1].equals("true");
		case 1:
			fileName = args[0];
			break;
		}
		dumpHeap(fileName, live);
	}

	private static String HOTSPOT_BEAN_NAME = "com.sun.management:type=HotSpotDiagnostic";
	private static volatile HotSpotDiagnosticMXBean hotspotMBean;
}
