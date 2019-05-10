package eu.larkc.plugin.decider;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.GregorianCalendar;

import javax.xml.datatype.XMLGregorianCalendar;

import org.openrdf.model.URI;
import org.openrdf.model.impl.StatementImpl;
import org.openrdf.model.impl.URIImpl;
import org.openrdf.model.vocabulary.RDF;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sun.org.apache.xerces.internal.jaxp.datatype.XMLGregorianCalendarImpl;

import eu.larkc.core.Larkc;
import eu.larkc.core.data.CloseableIterator;
import eu.larkc.core.data.DataFactory;
import eu.larkc.core.data.InformationSet;
import eu.larkc.core.data.RdfStoreConnection;
import eu.larkc.core.data.VariableBinding.Binding;
import eu.larkc.core.metadata.PluginRegistry;
import eu.larkc.core.pluginManager.PluginManager;
import eu.larkc.core.pluginManager.local.LocalInformationSetTransformManager;
import eu.larkc.core.pluginManager.local.queue.Queue;
import eu.larkc.core.query.SPARQLQueryImpl;
import eu.larkc.plugin.transform.InformationSetTransformer;
import eu.larkc.urbancomputing.LarKCUtilities;

public class BatchTimeDataLoader extends Thread {
	private static Logger logger = LoggerFactory.getLogger(BatchTimeDataLoader.class);
	@Override
	public void run() {
//		staticImporter();
//		dynamicImporter();
	}
	
	private void staticImporter(){
		try{
			logger.debug("Importing the path finding ontology");
//			LarKCUtilities.importRdfGraph((new URL("http://localhost/map.rdf")).openStream(), new URIImpl("http://larkc.cefriel.it/urbanpathfinding"), LarKCUtilities.NTRIPLE);
//			logger.debug("Importing the sensor map");
//			LarKCUtilities.importRdfGraph((new URL("http://localhost/sensor-map.rdf")).openStream(), new URIImpl("http://larkc.cefriel.it/map"), LarKCUtilities.RDFXML);
//			logger.debug("Imported... importing the lenghts");
//			LarKCUtilities.importRdfGraph((new URL("http://localhost/lengths.rdf")).openStream(), new URIImpl("http://larkc.cefriel.it/lengths"), LarKCUtilities.RDFXML);
//			logger.debug("Imported... importing the coordinates");
//			LarKCUtilities.importRdfGraph((new URL("http://localhost/siemens-coordinates.rdf")).openStream(), new URIImpl("http://larkc.cefriel.it/coordinates"), LarKCUtilities.NTRIPLE);
//			logger.debug("Imported... importing the nominal travel time values");
//			LarKCUtilities.importRdfGraph((new URL("http://localhost/nominal-travel-time.n3")).openStream(), new URIImpl("http://larkc.cefriel.it/nominaltraveltimes"), LarKCUtilities.NTRIPLE);

			LarKCUtilities.importRdfGraph((new URL("http://localhost/milano-map-with-sensors-and-geo.nt")).openStream(), new URIImpl("http://larkc.cefriel.it/pathfinding/map"), LarKCUtilities.NTRIPLE);
//			LarKCUtilities.importRdfGraph((new URL("http://localhost/milano-map-with-sensors-and-geo.rdf")).openStream(), new URIImpl("http://larkc.cefriel.it/pathfinding/mapOld"), LarKCUtilities.RDFXML);
			logger.debug("Imported, ready to work");
			
		}catch (MalformedURLException e) {
			logger.error("Error while importing the RDF files", e);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void dynamicImporter(){
		logger.debug("Starting the traffic predicter workflow");
		try{
			URL url = new URL("http://localhost:8000/sparql/?query=ASK%7B%3Fs%20%3Fp%20%3Fo.%7D");
			url.openStream();
			
			//write the triples for the review demo
			GregorianCalendar temp = new GregorianCalendar();
			temp.add(GregorianCalendar.HOUR, 1);
			temp.set(GregorianCalendar.MILLISECOND, 0);
			XMLGregorianCalendar time = new XMLGregorianCalendarImpl(temp);
			
			RdfStoreConnection con = DataFactory.INSTANCE.createRdfStoreConnection();
			
			String query = 
				"PREFIX upf: <http://larkc.cefriel.it/ontologies/urbanpathfinding#> "+
				"PREFIX xsd: <http://www.w3.org/2001/XMLSchema#> "+
				"SELECT ?g "+
				"WHERE { "+
					"?g upf:hasTrafficRecordsFrom ?dfrom . "+ 
					"?g upf:hasTrafficRecordsUntil ?duntil . "+
					"FILTER(?dfrom <= \""+time.toXMLFormat()+"\"^^xsd:dateTime && ?duntil >= \""+time.toXMLFormat()+"\"^^xsd:dateTime) "+
				"}";
			logger.debug("Sending query to retrieve the graph for the estimated travel times: {}", query);
			CloseableIterator<Binding> graph = DataFactory.INSTANCE.createRdfStoreConnection().executeSelect(new SPARQLQueryImpl(query)).iterator();
			URI predictionGraph=null;
			if(graph.hasNext()){
				predictionGraph = (URI)graph.next().getValues().get(0);
				logger.debug("Found graph: {}", predictionGraph);
			}
			else{
				logger.error("No graph has been found!");
			}
			
			URI reviewDemo = new URIImpl("http://www.larkc.cefriel.it#reviewDemo"); 
			URI reviewGraph = new URIImpl("http://www.larkc.cefriel.it#reviewGraph"); 

			con.addStatement(reviewDemo, new URIImpl("http://www.larkc.cefriel.it#hasGraph"), predictionGraph, reviewGraph);
			con.addStatement(reviewDemo, new URIImpl("http://www.larkc.cefriel.it#hasDateTime"), con.getValueFactory().createLiteral(time), reviewGraph);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
