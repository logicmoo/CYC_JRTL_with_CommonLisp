package org.appdapter.bind.rdf.jena.query;

import com.hp.hpl.jena.query.ResultSet;

public interface JenaArqResultSetProcessor<ResType>
{
    ResType processResultSet(final ResultSet p0);
}

/*

	Total time: 4 ms
	
*/