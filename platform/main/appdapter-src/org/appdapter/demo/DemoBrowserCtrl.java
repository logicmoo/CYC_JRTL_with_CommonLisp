package org.appdapter.demo;

import org.appdapter.api.trigger.UserResult;
import javax.swing.JFrame;

public interface DemoBrowserCtrl
{
    void launchFrame(final String p0);
    
    JFrame getFrame();
    
    void initialize(final String[] p0);
    
    UserResult addObject(final String p0, final Object p1, final boolean p2, final boolean p3);
    
    UserResult addObject(final String p0, final Object p1, final boolean p2);
    
    void show();
}

/*

	Total time: 37 ms
	
*/