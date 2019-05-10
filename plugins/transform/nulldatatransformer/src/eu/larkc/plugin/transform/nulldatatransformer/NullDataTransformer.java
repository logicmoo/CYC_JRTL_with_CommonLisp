package eu.larkc.plugin.transform.nulldatatransformer;

import org.openrdf.model.URI;
import org.openrdf.model.impl.URIImpl;

import eu.larkc.core.data.InformationSet;
import eu.larkc.core.metadata.MetaData;
import eu.larkc.core.metadata.MetaDataImpl;
import eu.larkc.core.metadata.MethodMetaDataImpl;
import eu.larkc.core.qos.QoSInformation;
import eu.larkc.core.query.Query;
import eu.larkc.plugin.Context;
import eu.larkc.plugin.Contract;
import eu.larkc.plugin.transform.InformationSetTransformer;

public class NullDataTransformer implements InformationSetTransformer
{
	public NullDataTransformer() {
	}

	@Override
	public Context createContext() {
		return null;
	}

	@Override
	public void initialise() {
	}
	
	@Override
	public void shutdown() {
	}

	public InformationSet transform(InformationSet theInformationSet, Contract theContract, Context theContext) {
		return theInformationSet;
	}

	public URI getIdentifier() {
		return new URIImpl("urn:" + this.getClass().getName());
	}

	public QoSInformation getQoSInformation() {
		return new QoSInformation() {
		};
	}

	public void setInputQuery(Query theQuery) {
		this.inputQuery = theQuery;
	}
	
	Query inputQuery;
}
