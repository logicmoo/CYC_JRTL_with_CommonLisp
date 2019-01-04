package eu.larkc.plugin.transform;

import eu.larkc.core.data.InformationSet;
import eu.larkc.plugin.Context;
import eu.larkc.plugin.Contract;
import eu.larkc.plugin.Plugin;

public interface InformationSetTransformer extends Plugin {

	public InformationSet transform(InformationSet theInformationSet,
			Contract theContract, Context theContext);
}
