package org.appdapter.api.registry;

public interface VerySimpleRegistry extends SimpleRegistry
{
    void registerNamedObject(final Object p0, final String p1);
    
     <OT> OT findOptionalUniqueNamedObject(final Class<OT> p0, final String p1) throws Exception;
    
     <OT> OT findRequiredUniqueNamedObject(final Class<OT> p0, final String p1) throws Exception;
}

/*

	Total time: 16 ms
	
*/