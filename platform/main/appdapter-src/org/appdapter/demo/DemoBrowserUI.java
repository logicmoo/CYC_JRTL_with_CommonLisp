package org.appdapter.demo;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class DemoBrowserUI
{
    static Logger theLogger;
    public static DemoNavigatorCtrlFactory demoBrowserFactory;
    
    public static void registerDemo(final DemoNavigatorCtrlFactory crtlMaker) {
        DemoBrowserUI.demoBrowserFactory = crtlMaker;
    }
    
    public static DemoBrowserCtrl makeDemoNavigatorCtrl(final String[] args) {
        if (DemoBrowserUI.demoBrowserFactory == null) {
            return null;
        }
        return DemoBrowserUI.demoBrowserFactory.makeDemoNavigatorCtrl(args, false);
    }
    
    public static DemoBrowserCtrl makeDemoNavigatorCtrl(final String[] args, final boolean addExamples) {
        if (DemoBrowserUI.demoBrowserFactory == null) {
            return null;
        }
        return DemoBrowserUI.demoBrowserFactory.makeDemoNavigatorCtrl(args, addExamples);
    }
    
    public static void testLoggingSetup() {
        try {
            final Object theLogger2 = LoggerFactory.getLogger((Class)DemoBrowserUI.class);
            assert DemoBrowserUI.theLogger == theLogger2;
        }
        catch (Throwable anything) {
            anything.printStackTrace();
        }
    }
    
    static {
        DemoBrowserUI.theLogger = LoggerFactory.getLogger((Class)DemoBrowserUI.class);
        DemoBrowserUI.demoBrowserFactory = null;
    }
}

/*

	Total time: 21 ms
	
*/