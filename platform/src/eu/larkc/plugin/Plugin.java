package eu.larkc.plugin;

import org.openrdf.model.URI;

import eu.larkc.core.metadata.MetaData;
import eu.larkc.core.qos.QoSInformation;

public interface Plugin {

	public URI getIdentifier();
	public QoSInformation getQoSInformation();
	//public MetaData getMetaData();
}
