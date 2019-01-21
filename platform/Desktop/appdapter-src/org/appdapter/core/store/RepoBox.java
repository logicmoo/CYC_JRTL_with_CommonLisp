package org.appdapter.core.store;

import java.util.List;
import org.appdapter.api.trigger.Box;
import org.appdapter.api.trigger.Trigger;

public interface RepoBox<TT extends Trigger<? extends RepoBox<TT>>> extends Box<TT>
{
    @Override
	Repo getValue();
    
    List<Repo.GraphStat> getAllGraphStats();
    
    String processQueryAtUrlAndProduceXml(final String p0, final ClassLoader p1);
    
    Box findGraphBox(final String p0);
    
    Repo getRepo();
}

/*

	Total time: 6 ms
	
*/