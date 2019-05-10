package eu.larkc.plugin.identify.urbancomputing.ubl;

import java.io.FileInputStream;
import java.util.Properties;

public class Config {
	private static final String DEFAULT_GRAPH_LOCATION = 
//		"http://seip.cefriel.it/urbanlarkc-public/ama-xml-milano_navigli_graph.rdf";
//		"http://localhost/maps/ama-xml-milano_navigli_graph.rdf";
		"http://sauron:8112/ama-xml-milano_graph.rdf";
	private static final String DEFAULT_GRAPH_NAME =
		"http://seip.cefriel.it/ama";
	
	
	private static Config _config=null;

	private String graphLocation;
	private String graphName;
	
	public static Config getInstance(){
		if(_config==null)
			_config=new Config();
		return _config;
	}
	
	private Config(){
		Properties properties = new Properties();
		try{
			properties.load(new FileInputStream("plugins/RemoteGraphLoader/config.properties"));
			graphLocation=properties.getProperty("graph_location");
			graphName=properties.getProperty("graph_name");
		}catch (Exception e) {
			System.err.println("Error loading file, default values will be loaded");
			graphLocation=DEFAULT_GRAPH_LOCATION;
			graphName=DEFAULT_GRAPH_NAME;
		}
	}
	
	public String getGraphLocation(){
		return graphLocation;
	}
	
	public String getGraphName(){
		return graphName;
	}
}
