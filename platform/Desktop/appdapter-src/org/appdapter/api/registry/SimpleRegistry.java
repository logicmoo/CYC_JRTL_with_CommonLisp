package org.appdapter.api.registry;

import java.util.List;

public interface SimpleRegistry extends Registry
{
     <OT> OT findOptionalFirstMatch(final Class<OT> p0, final Pattern p1);
    
     <OT> OT findRequiredUniqueMatch(final Class<OT> p0, final Pattern p1) throws Exception;
    
     <OT> OT findOptionalUniqueMatch(final Class<OT> p0, final Pattern p1) throws Exception;
    
     <OT> List<OT> findAllMatches(final Class<OT> p0, final Pattern p1, final int p2, final int p3) throws Exception;
}

/*

	Total time: 16 ms
	
*/