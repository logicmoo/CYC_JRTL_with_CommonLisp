package org.appdapter.api.registry;

public interface Finder<OC>
{
    ResultSequence deliverMatchesUntilDone(final Pattern p0, final Receiver<OC> p1);
    
    void killDeliverySequence(final ResultSequence p0);
}

/*

	Total time: 4 ms
	
*/