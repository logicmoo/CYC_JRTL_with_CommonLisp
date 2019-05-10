package eu.larkc.plugin.identify.urbancomputing.ubl;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;

import java.util.List;

import org.openrdf.model.URI;
import org.openrdf.model.impl.URIImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import eu.larkc.core.data.DataFactory;
import eu.larkc.core.data.InformationSet;
import eu.larkc.core.data.RdfGraph;
import eu.larkc.core.data.RdfStoreConnection;
import eu.larkc.core.qos.QoSInformation;
import eu.larkc.core.query.Query;
import eu.larkc.core.query.SPARQLQueryImpl;
import eu.larkc.plugin.Context;
import eu.larkc.plugin.Contract;
import eu.larkc.plugin.identify.Identifier;
import eu.larkc.urbancomputing.LarKCUtilities;

/**
 * An Identifier plugin to load a remote RDF graph (in a known location)
 * 
 * @author Daniele Dell'Aglio, Luka Bradesko, Emanuele Della Valle
 * 
 */
public class RemoteGraphLoaderIdentifier implements Identifier {
	private static Logger logger = LoggerFactory.getLogger(RemoteGraphLoaderIdentifier.class.getCanonicalName());
	
	private boolean once = false;
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

	public Collection<InformationSet> identify(Query theQuery, Contract contract, Context context) {
		logger.info("starting");
		if (once)
			return null;
		once = true;

		RdfStoreConnection dataLayer = DataFactory.INSTANCE.createRdfStoreConnection();
		
		//TODO: implement a policy to refresh it sometime!
		//check if Data Layer contains the graph
		if(dataLayer.executeSelect(new SPARQLQueryImpl("SELECT ?s ?p ?o FROM <"+Config.getInstance().getGraphName()+"> WHERE{?s ?p ?o} LIMIT 1 ")).iterator().hasNext())
		{
			logger.info("Data Layer contains the graph {}!", Config.getInstance().getGraphName());
			RdfGraph rg = dataLayer.createRdfGraph(new URIImpl(Config.getInstance().getGraphName()));
			List<InformationSet> graphs = new ArrayList<InformationSet>();
			graphs.add(rg);
			return graphs;
		}
		else{
			logger.info("Data Layer doesn't contain the graph {}!", Config.getInstance().getGraphName());
			//the Data Layer doesn't contain the graph -> load it
			String sGraph = Config.getInstance().getGraphLocation();
			List<InformationSet> ret = new ArrayList<InformationSet>();
			URI graphName = new URIImpl(Config.getInstance().getGraphName());
			
			try{
				URL uGraph = new URL(sGraph);
				logger.info("Loading {} in the named graph {}", sGraph, graphName);
				try {
					LarKCUtilities.importRdfGraph(uGraph.openStream(), graphName, LarKCUtilities.RDFXML);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				ret.add(dataLayer.createRdfGraph(graphName));
			} catch (MalformedURLException e) {
				logger.error("Error while loading the RDF file!", e);
			}
			return ret;			
		}
	}// identify

	public URI getIdentifier() {
		return new URIImpl("urn:" + this.getClass().getCanonicalName());
	}

	public QoSInformation getQoSInformation() {
		// TODO dd Qos info here
		return null;
	}
}
