package org.appdapter.registry.basic;

import org.appdapter.api.registry.Description;
import org.appdapter.api.registry.Pattern;

public class BasicPattern implements Pattern
{
    private Description myDesc;
    
    public BasicPattern(final Description desc) {
        this.myDesc = desc;
    }
    
    public boolean matches(final Description d) {
        return this.myDesc.equals(d);
    }
    
    protected Description getDescription() {
        return this.myDesc;
    }
}

/*

	Total time: 6 ms
	
*/