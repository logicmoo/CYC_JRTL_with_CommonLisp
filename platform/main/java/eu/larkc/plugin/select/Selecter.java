package eu.larkc.plugin.select;

import eu.larkc.core.data.SetOfStatements;
import eu.larkc.plugin.Context;
import eu.larkc.plugin.Contract;
import eu.larkc.plugin.Plugin;

public interface Selecter extends Plugin {

	public SetOfStatements select(SetOfStatements theSetOfStatements, Contract contract,
			Context context);
}
