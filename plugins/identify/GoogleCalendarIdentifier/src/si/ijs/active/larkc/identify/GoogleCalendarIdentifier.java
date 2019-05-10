package si.ijs.active.larkc.identify;

import java.util.Collection;
import java.util.HashSet;
import org.openrdf.model.URI;
import org.openrdf.model.impl.URIImpl;
import eu.larkc.core.data.InformationSet;
import eu.larkc.core.data.NaturalLanguageDocumentUrl;
import eu.larkc.core.qos.QoSInformation;
import eu.larkc.core.query.Query;
import eu.larkc.plugin.Context;
import eu.larkc.plugin.Contract;
import eu.larkc.plugin.identify.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
* This is an LarKC identifier plug-in, which can connect to Google calendar and 
* @author LarKC plug-in Wizard
*
*/
public class GoogleCalendarIdentifier implements Identifier {

	//only first time when called, return results (anytime b.)
	private boolean once = false;

	/** 
 	* Main invocation method for identifier plug-in
 	*/
	public Collection<InformationSet> identify(Query theQuery,
			Contract contract, Context context) {
		Logger log = LoggerFactory.getLogger(GoogleCalendarIdentifier.class);

		if (once) { return null; }
		once = true;

		// the plug-in code
		log.info("Hello from identifier!");
		//dummy return
		Collection<InformationSet> articleSet = new HashSet<InformationSet>();
		articleSet.add(new NaturalLanguageDocumentUrl("Some url"));
		return articleSet;
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

	public URI getIdentifier() {
		return new URIImpl("urn:" + this.getClass().getName());
	}

	public QoSInformation getQoSInformation() {
		// TODO Auto-generated method stub
		return null;
	}
}