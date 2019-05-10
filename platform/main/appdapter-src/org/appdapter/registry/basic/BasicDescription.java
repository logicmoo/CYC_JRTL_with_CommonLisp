package org.appdapter.registry.basic;

import org.appdapter.api.registry.Description;

public final class BasicDescription implements Description
{
    private final String myName;
    
    public BasicDescription(final String name) {
        this.myName = name;
    }
    
    @Override
	public String getName() {
        return this.myName;
    }
    
    @Override
    public int hashCode() {
        return this.myName.hashCode();
    }
    
    @Override
    public boolean equals(final Object other) {
        if (other != null && this.myName != null && other instanceof BasicDescription) {
            final BasicDescription obd = (BasicDescription)other;
            return this.myName.equals(obd.getName());
        }
        return false;
    }
}

/*

	Total time: 18 ms
	
*/