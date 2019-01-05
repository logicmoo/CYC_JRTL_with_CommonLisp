package eu.larkc.plugin;

import org.openrdf.model.URI;

import eu.larkc.plugin.decide.Decider;
import eu.larkc.plugin.identify.Identifier;
import eu.larkc.plugin.reason.Reasoner;
import eu.larkc.plugin.select.Selecter;
import eu.larkc.plugin.transform.InformationSetTransformer;
import eu.larkc.plugin.transform.QueryTransformer;

public interface PluginFactory {

	public Identifier getIdentifier(URI thePluginId);
	public InformationSetTransformer getDataSetTransformer(URI thePluginId);
	public QueryTransformer getQueryTransformer(URI thePluginId);
	public Selecter getSelecter(URI thePluginId);
	public Reasoner getReasoner(URI thePluginId);
	public Decider getDecider(URI thePluginId);
	
	public Plugin getPlugin(URI thePluginId);
}
