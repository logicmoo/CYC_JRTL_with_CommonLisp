package org.appdapter.core.store;

import java.util.List;
import org.appdapter.bind.rdf.jena.query.JenaArqResultSetProcessor;
import com.hp.hpl.jena.query.QuerySolution;
import com.hp.hpl.jena.query.Query;

public interface QueryProcessor
{
     <ResType> ResType processQuery(final Query p0, final QuerySolution p1, final JenaArqResultSetProcessor<ResType> p2);
    
    List<QuerySolution> findAllSolutions(final Query p0, final QuerySolution p1);
}

/*

	Total time: 4 ms
	
*/