package eu.larkc.plugin.identify;

import java.util.Collection;
import eu.larkc.core.data.InformationSet;
import eu.larkc.core.query.Query;
import eu.larkc.plugin.Context;
import eu.larkc.plugin.Contract;
import eu.larkc.plugin.Plugin;

public interface Identifier extends Plugin {

	public Collection<InformationSet> identify(Query theQuery,
			Contract contract, Context context);
}
