package org.appdapter.api.registry;

public interface Receiver<OC>
{
    Status receiveMatch(final OC p0, final ResultSequence<OC> p1, final long p2);
    
    public enum Status
    {
        SEEKING, 
        DONE;
    }
}

/*

	Total time: 18 ms
	
*/