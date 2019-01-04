package eu.larkc.plugin.transform;

import java.util.Set;

import eu.larkc.core.query.Query;
import eu.larkc.plugin.Context;
import eu.larkc.plugin.Contract;
import eu.larkc.plugin.Plugin;

public interface QueryTransformer extends Plugin {

	public Set<Query> transform(Query theQuery, Contract theContract, Context theContext);
}

