package org.appdapter.api.registry;

import java.util.List;

public interface SimpleFinder<OT> extends Finder<OT>
{
    public static final int MAX_MATCHES = Integer.MAX_VALUE;
    
    OT findFirstMatch(final Pattern p0, final int p1, final int p2) throws Exception;
    
    List<OT> findAllMatches(final Pattern p0, final int p1, final int p2) throws Exception;
    
    long countMatches(final Pattern p0, final int p1) throws Exception;
}

/*

	Total time: 5 ms
	
*/