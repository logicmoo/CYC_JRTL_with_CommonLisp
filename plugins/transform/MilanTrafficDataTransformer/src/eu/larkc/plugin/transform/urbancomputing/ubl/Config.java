package eu.larkc.plugin.transform.urbancomputing.ubl;

import it.cefriel.larkc.urbancomputing.ontologies.UrbanPathFindingVocabulary;

import java.io.FileInputStream;
import java.util.Properties;

import org.openrdf.model.URI;
import org.openrdf.model.impl.URIImpl;

public class Config {
	
	// The fixed configuration parameters
	
	public final String TRAFFIC_NAMESPACE = "http://larkc.cefriel.it/ontologies/urbanpathfinding#";
	public final String MAP_NAMESPACE = "http://www.linkingurbandata.org/onto/ama/";
	
	public final URI TRAFFIC_RECORDS = new URIImpl(TRAFFIC_NAMESPACE + "TrafficRecords");
	public final URI RECORDS_FROM = new URIImpl(TRAFFIC_NAMESPACE + "hasTrafficRecordsFrom");
	public final URI RECORDS_UNTIL = new URIImpl(TRAFFIC_NAMESPACE + "hasTrafficRecordsUntil");
	public final URI TRAFFIC_CONDITION = new URIImpl(TRAFFIC_NAMESPACE + "hasTrafficCondition");
	public final URI RECORDS_DATE = new URIImpl("http://purl.org/dc/terms/date");
	public final URI EST_TRAVELTIME = UrbanPathFindingVocabulary.HAS_ESTIMATED_TRAVEL_TIME;//new URIImpl(URBAN_NAMESPACE + "estimatedTraveltime");

//	public final URI LAST_TRAFFIC_PREDICTION_TIME = new URIImpl(URBAN_NAMESPACE + "LastTrafficPredictionTime");
//	public final URI NAMED_TRAFFIC_GRAPHS = new URIImpl(URBAN_NAMESPACE + "NamedTrafficGraphs");
	
	public final URI LINK_CATEGORY = UrbanPathFindingVocabulary.HAS_LINK_CATEGORY;//new URIImpl(URBAN_NAMESPACE + "linkType");
	public final URI LINK_TYPE = UrbanPathFindingVocabulary.LINK;//new URIImpl(URBAN_NAMESPACE + "Link");
	public final URI LINKED_WITH = new URIImpl(TRAFFIC_NAMESPACE + "LinkedWith");
	public final URI LINK_LENGTH = UrbanPathFindingVocabulary.HAS_LENGTH;//new URIImpl(URBAN_NAMESPACE + "length");
	public final URI LINK_FROM_NODE = UrbanPathFindingVocabulary.HAS_FROM;//new URIImpl(URBAN_NAMESPACE + "lFrom");
	public final URI LINK_TO_NODE = UrbanPathFindingVocabulary.HAS_TO;//new URIImpl(URBAN_NAMESPACE + "lTo");
	public final URI SENSOR_TYPE = UrbanPathFindingVocabulary.TRAFFIC_SENSOR;//new URIImpl(URBAN_NAMESPACE + "TrafficSensor");
//	public  final URI MEAN_SPEED = new URIImpl(URBAN_NAMESPACE + "meanSpeed");
	//graph where link categories are stored
	public final URI NUMERIC_CATS = new URIImpl(TRAFFIC_NAMESPACE + "linktypes/NumericValues");
	//relates a link category to a number
	public final URI NUMERIC_CAT = new URIImpl(TRAFFIC_NAMESPACE + "linktypes/NumericValue");
	public final URI LOCAL_ROAD = UrbanPathFindingVocabulary.LOCAL_ROAD;//new URIImpl(URBAN_NAMESPACE + "linktypes/LocalRoad");
	public final URI SECONDARY_ROAD = UrbanPathFindingVocabulary.SECONDARY_ROAD;//new URIImpl(URBAN_NAMESPACE + "linktypes/SecondaryRoad");
	public final URI MAIN_ROAD = UrbanPathFindingVocabulary.MAIN_ROAD;//new URIImpl(URBAN_NAMESPACE + "linktypes/MainRoad");
	public final URI HIGHWAY = UrbanPathFindingVocabulary.HIGHWAY;//new URIImpl(URBAN_NAMESPACE + "linktypes/Highway");
	
	public final URI GB_LAT = UrbanPathFindingVocabulary.GB_LAT;
	public final URI GB_LONG = UrbanPathFindingVocabulary.GB_LONG;

	// the variable config properties
	
	String trafficDBName = "postgres";
	String trafficDBUser = "postgres";
	
	String rnnDirectory = "D:/larkc/WP6data/RNN_XML";
	String weatherDirectory = "D:/larkc/WP6data/weather";
	
	String sensorCategoryInfoPath = "D:/larkc/WP6data/SensorCongestionDensities.txt";
	
	// parameters for SSL learning
	public static double sslLambdaReg = 0.05;
	public static double sslLambdaNull = 0.0001;
	public static double sslThreshold = 0.3;
	
	
	
	Config(){
		Properties properties = new Properties();
		try{
			properties.load(new FileInputStream("plugins/MilanTrafficDataTransformer/config.properties"));
			rnnDirectory = properties.getProperty("rnnDirectory");
			weatherDirectory = properties.getProperty("weatherDirectory");
			sensorCategoryInfoPath = properties.getProperty("sensorCategoryInfoPath");
//			graphLocation=properties.getProperty("graph_location");
		}catch (Exception e) {
			System.err.println("Error loading file, default values will be loaded");
//			graphLocation=DEFAULT_GRAPH_LOCATION;
//			graphName=DEFAULT_GRAPH_NAME;
		}
	}
	
}
