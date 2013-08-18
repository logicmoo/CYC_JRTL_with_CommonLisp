// 
// 
// 

package com.cyc.tool.subl.management;

import javax.management.MBeanServer;
import javax.management.MBeanServerConnection;
import java.lang.management.ManagementFactory;
import com.sun.management.HotSpotDiagnosticMXBean;

public class HeapDumper
{
    private static final String HOTSPOT_BEAN_NAME = "com.sun.management:type=HotSpotDiagnostic";
    private static volatile HotSpotDiagnosticMXBean hotspotMBean;
    
    public static void dumpHeap(final String fileName, final boolean live) {
        initHotspotMBean();
        try {
            HeapDumper.hotspotMBean.dumpHeap(fileName, live);
        }
        catch (RuntimeException re) {
            throw re;
        }
        catch (Exception exp) {
            throw new RuntimeException(exp);
        }
    }
    
    private static void initHotspotMBean() {
        if (HeapDumper.hotspotMBean == null) {
            synchronized (HeapDumper.class) {
                if (HeapDumper.hotspotMBean == null) {
                    HeapDumper.hotspotMBean = getHotspotMBean();
                }
            }
        }
    }
    
    private static HotSpotDiagnosticMXBean getHotspotMBean() {
        try {
            final MBeanServer server = ManagementFactory.getPlatformMBeanServer();
            final HotSpotDiagnosticMXBean bean = (HotSpotDiagnosticMXBean)ManagementFactory.newPlatformMXBeanProxy(server, "com.sun.management:type=HotSpotDiagnostic", HotSpotDiagnosticMXBean.class);
            return bean;
        }
        catch (RuntimeException re) {
            throw re;
        }
        catch (Exception exp) {
            throw new RuntimeException(exp);
        }
    }
    
    public static void main(final String[] args) {
        String fileName = "heap.bin";
        boolean live = true;
        switch (args.length) {
            case 2: {
                live = args[1].equals("true");
            }
            case 1: {
                fileName = args[0];
                break;
            }
        }
        dumpHeap(fileName, live);
    }
}
