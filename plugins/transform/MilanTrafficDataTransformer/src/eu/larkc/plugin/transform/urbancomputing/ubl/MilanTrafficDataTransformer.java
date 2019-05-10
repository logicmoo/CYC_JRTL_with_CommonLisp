package eu.larkc.plugin.transform.urbancomputing.ubl;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

import no.uib.cipr.matrix.DenseVector;
import no.uib.cipr.matrix.Matrix;
import no.uib.cipr.matrix.MatrixEntry;
import no.uib.cipr.matrix.Vector;
import no.uib.cipr.matrix.VectorEntry;
import no.uib.cipr.matrix.Vector.Norm;
import no.uib.cipr.matrix.sparse.CG;
import no.uib.cipr.matrix.sparse.CompRowMatrix;
import no.uib.cipr.matrix.sparse.DiagonalPreconditioner;
import no.uib.cipr.matrix.sparse.FlexCompRowMatrix;
import no.uib.cipr.matrix.sparse.IterativeSolver;
import no.uib.cipr.matrix.sparse.IterativeSolverNotConvergedException;
import no.uib.cipr.matrix.sparse.Preconditioner;

import org.openrdf.model.Literal;
import org.openrdf.model.Statement;
import org.openrdf.model.URI;
import org.openrdf.model.Value;
import org.openrdf.model.ValueFactory;
import org.openrdf.model.impl.URIImpl;
import org.openrdf.model.vocabulary.RDF;

import com.siemens.ctic4.nn.NeuralNet;
import com.sun.org.apache.xerces.internal.jaxp.datatype.XMLGregorianCalendarImpl;

import eu.larkc.core.data.CloseableIterator;
import eu.larkc.core.data.DataFactory;
import eu.larkc.core.data.DataSet;
import eu.larkc.core.data.InformationSet;
import eu.larkc.core.data.RdfGraph;
import eu.larkc.core.data.RdfStoreConnection;
import eu.larkc.core.data.VariableBinding;
import eu.larkc.core.data.VariableBinding.Binding;
import eu.larkc.core.qos.QoSInformation;
import eu.larkc.core.query.SPARQLQueryImpl;
import eu.larkc.plugin.Context;
import eu.larkc.plugin.Contract;
import eu.larkc.plugin.identify.urbancomputing.ubl.RemoteGraphLoaderIdentifier;
import eu.larkc.plugin.transform.InformationSetTransformer;
import eu.larkc.urbancomputing.LarKCUtilities;


/**
 * This identifier predict the traffic conditions on each road segment in the Milan street map for the next two hours.  
 * 
 * It firsts checks whether the predictions are already in the database. If not then it
 * a) loads the historical traffic data 12h back up to the current time,
 * b) loads the weather conditions of the current day,
 * c) predicts the speed and flow at sensor locations using recurrent neural networks,
 * d) categorizes the predictions into different traffic classes,
 * e) generalizes the traffic classes to all streets.
 *
 *  To understand the code, start in the transform function.
 *  
 * @author Florian Steinke
 */
public class MilanTrafficDataTransformer implements InformationSetTransformer {

	private final boolean ISDEBUG = false;

	private static Logger logger = Logger
	.getLogger(MilanTrafficDataTransformer.class.getCanonicalName());

	// general variables
	private java.sql.Connection rdbConn = null;
	private RdfStoreConnection myConn = null;
	private ValueFactory myValues = null;


	// SSL Variables 
	private static FlexCompRowMatrix sslGraphLaplacian = null;
	private static List<Integer> sslLinks = null;
	//	private List<Integer> sslLinksCat = null;
	//	private List<Integer> sslLinksLength = null;
	private static List<Integer> sslDefaultLinks = null;
	//	private List<Integer> sslDefaultLinksCat = null;
	//	private List<Integer> sslDefaultLinksLength = null;
	private static FlexCompRowMatrix sslSelector = null;
	private static List<Integer> sslSensors = null;
	//	private static CompRowMatrix sslLeft;

	//	private static FlexCompRowMatrix sslSelector = null;
	//	private static List<Integer> sslSensors = null;
	//	private static CompRowMatrix sslLeft;

	// Categorization data
	class TrafficCategoryInfo{
		float densityThreshold;
		float normalSpeed;
	};
	private static HashMap<Long,TrafficCategoryInfo> catInfo = null;


	// Neural network variables
	private static List<NeuralNet> nets = null;
	private static List<Long> netSensorIds = null;

	// configuration object
	private static Config conf;

	public MilanTrafficDataTransformer(){
		conf = new Config();
		try
		{
			Class.forName("org.postgresql.Driver").newInstance();
			rdbConn = DriverManager.getConnection("jdbc:postgresql:Traffic", 
					conf.trafficDBName,
					conf.trafficDBUser);

			myConn = DataFactory.INSTANCE.createRdfStoreConnection();
			myValues = myConn.getValueFactory();
		}
		catch (Exception e) {
			System.err.println(e.getMessage());
			rdbConn = null;
			myConn = null;
		}
	}

	protected void finalize ()  {
		if (rdbConn != null){
			try
			{
				rdbConn.close();
			}
			catch (SQLException ex) {System.err.println(ex.getMessage());}
		}
	}

	class WeatherRecord{
		int tmean; 
		int humidity;
	};

	class DayType{
		int daytype; 
		int holiday;
	};

	class FloatTrafficRecord{
		int time; // time in 5 min intervals, positive indices in future, negative in past, 0 now
		long sensorId;
		float flow;
		float speed;
	};

	class CategoryTrafficRecord{
		int time; // time in 5 min intervals, positive indices in future, negative in past
		long sensorOrLinkId;
		int trafficCondition;
		boolean isSensor;
		//		int streetCategory;
	};


	public InformationSet transform(InformationSet theInformationSet,
			Contract theContract, Context theContext) {

		if (ISDEBUG)
			System.out.println("Free memory is " + Runtime.getRuntime().freeMemory()/1024/1024  + "MB.");


		// check input arguments and initialize result set
		if (!(theInformationSet instanceof RdfGraph)){
			logger.warning("Input to traffic completion was not an RDF graph. Nothing can be done.");
			return theInformationSet;
		}
		RdfGraph roadmap = (RdfGraph)theInformationSet;
		Collection<URI> resultSet = new ArrayList<URI>();
		resultSet.add(roadmap.getName());

		// start execution timer
		logger.info("Starting traffic prediction plugin ...");
		Calendar startTime = Calendar.getInstance();

		// determine time of prediction for RNNs and the time slots that are exported to the data layer
		GregorianCalendar officialPredictionTime = new GregorianCalendar();
		GregorianCalendar realPredictionTime = new GregorianCalendar();
		Integer exportTimeSlotStart = getPredictionTimes(officialPredictionTime,realPredictionTime);
		if (ISDEBUG)
			System.out.println("Time for prediciton " 
					+ new XMLGregorianCalendarImpl(officialPredictionTime) + " time slot " + exportTimeSlotStart);

		// checks whether the predictions are up to date
		// if (!checkTrafficUpToDate(timeofinterest)){
		// logger.info("Update traffic predictions ...");

		// delete old unused graphs and all data in there
		if (!ISDEBUG) deleteOldTrafficData();

		// load traffic data at sensors for last 12h
		List<FloatTrafficRecord> histTrafficDataSensor = loadTrafficDataFromRDB(realPredictionTime,24);

		// load weather data and day types
		GregorianCalendar tomorrow = (GregorianCalendar)realPredictionTime.clone();
		tomorrow.add(Calendar.DAY_OF_YEAR, 1);
		WeatherRecord [] weatherRec = new WeatherRecord[2];
		weatherRec[0] = loadWeatherData(realPredictionTime);
		weatherRec[1] = loadWeatherData(tomorrow);
		DayType [] days = new DayType[2];
		days[0] = loadDayType(realPredictionTime);
		days[1] = loadDayType(tomorrow);


		if (ISDEBUG)
			System.out.println("Free memory is " + Runtime.getRuntime().freeMemory()/1024/1024  + "MB.");

		// make traffic predictions using RNN
		List<FloatTrafficRecord> predTrafficDataSensor = predictTraffic(histTrafficDataSensor,weatherRec,days);

		if (ISDEBUG)
			System.out.println("Free memory is " + Runtime.getRuntime().freeMemory()/1024/1024  + "MB.");

		// Select the time steps which should be placed into the data layer
		List<FloatTrafficRecord> trafficDataSensor = new LinkedList<FloatTrafficRecord>();
		for (FloatTrafficRecord rec : predTrafficDataSensor){
			if (ISDEBUG || (rec.time >= exportTimeSlotStart && rec.time <= exportTimeSlotStart+24))
				//			if (rec.time == exportTimeSlotStart)
				trafficDataSensor.add(rec);
		}
		if (ISDEBUG)
			for (FloatTrafficRecord rec : histTrafficDataSensor)
				trafficDataSensor.add(rec);

		// Categorize traffic records (only for those that go into the data layer)
		List<CategoryTrafficRecord> trafficCategoriesSensor = categorizeTraffic(trafficDataSensor);

		// Generalize traffic categories to all streets
		List<CategoryTrafficRecord> trafficCategoriesLinks = generalizeSensorTraffic(trafficCategoriesSensor);

		// for debug write intermediate results:
		if (ISDEBUG)
			writeAllTraffic(histTrafficDataSensor,predTrafficDataSensor,trafficCategoriesSensor,trafficCategoriesLinks);

		// write results to RDF
		if (!ISDEBUG){
			List<CategoryTrafficRecord> records2Write = new ArrayList<CategoryTrafficRecord>();
			records2Write.addAll(trafficCategoriesSensor);
			records2Write.addAll(trafficCategoriesLinks);
			writeTrafficToDataLayer(officialPredictionTime,resultSet,records2Write);
		}

		//		} else{
		//			logger.info("No need to update traffic predictions at time " + new XMLGregorianCalendarImpl(timeofinterest));
		//
		//			// recover graph names of existing data
		//			resultSet.addAll(getTrafficGraphNames());
		//		}

		Calendar endTime = Calendar.getInstance();
		float duration = (endTime.getTime().getTime()-startTime.getTime().getTime()) / 1000;
		logger.info("Finished predicting traffic information for next 2 hours in " + duration + "sec.");

		DataSet ds = myConn.createDataSet(resultSet, null);
		return ds;
	}



	/* *******************************************************************
	 * Methods to read and write data from and to data layer
	 * 
	 */



	private int getPredictionTimes(GregorianCalendar officialPredictionTime,
			GregorianCalendar realPredictionTime) {

		Calendar now = Calendar.getInstance();

		//		now.add(Calendar.YEAR, -1);
		//		GregorianCalendar timeofinterest = new GregorianCalendar(
		//				now.get(Calendar.YEAR),now.get(Calendar.MONTH),now.get(Calendar.DAY_OF_MONTH),0,0);
		//				hh.get(Calendar.HOUR_OF_DAY),0);

		// do the predictions at midnight of current day
		realPredictionTime.set(2009, 2, 26, 0, 0, 0);
		realPredictionTime.add(Calendar.MINUTE, -5);
		officialPredictionTime.set(
				now.get(Calendar.YEAR), now.get(Calendar.MONTH), now.get(Calendar.DAY_OF_MONTH), 
				0, 0, 0);
		officialPredictionTime.add(Calendar.MINUTE, -5);
		return (int)(now.get(Calendar.HOUR_OF_DAY)*12 + now.get(Calendar.MINUTE)/5);
	}

	private void loadCategorizationInfo() {
		if (catInfo == null){
			catInfo = new HashMap<Long,TrafficCategoryInfo>();

			// load file
			try{
				File file = new File(conf.sensorCategoryInfoPath);
				Scanner sc = new Scanner(file);
				sc.nextLine();
				while (sc.hasNext()){
					String line = sc.nextLine();
					String [] elems = line.split(" ");
					long id = Long.parseLong(elems[0]);
					TrafficCategoryInfo ci = new TrafficCategoryInfo();
					ci.normalSpeed = Float.parseFloat(elems[1]);
					ci.densityThreshold = Float.parseFloat(elems[2]);
					catInfo.put(id, ci);
				}
				sc.close();
			} catch (Exception e){
				e.printStackTrace();
			}
		}
	}

	/*
	 * Returns the graph names of all graphs which contain information written by the this plugin
	 */
	private List<URI> getTrafficGraphNames() {
		List<URI> res = new ArrayList<URI>();

		String sparql = "Select ?g where { graph <"
			+ conf.TRAFFIC_RECORDS + "> { ?g <" + conf.RECORDS_FROM + "> ?void} }";
		CloseableIterator<Binding> iter = myConn.executeSelect(new SPARQLQueryImpl(sparql)).iterator();

		if (iter.hasNext()){ // then the base graph must exits
			res.add(conf.TRAFFIC_RECORDS);
		}

		while (iter.hasNext()){
			Binding b = iter.next();
			res.add((URI)b.getValues().get(0));
		}
		iter.close();

		return res;
	}

	/*
	 * Writes computed traffic into the data layer
	 */
	private void writeTrafficToDataLayer(GregorianCalendar timeofinterest, Collection<URI> resultSet,
			List<CategoryTrafficRecord> catWrites) {

		logger.info("Writing traffic predicitons to data layer ...");

		List<URI> graphnames = new LinkedList<URI>();
		graphnames.add(conf.TRAFFIC_RECORDS);

		// **************** write traffic categories 
		if (catWrites != null){
			// sort by time
			Collections.sort(catWrites, new Comparator<CategoryTrafficRecord>(){
				@Override
				public int compare(CategoryTrafficRecord c1, CategoryTrafficRecord c2) {
					if (c1.time == c2.time) return 0;
					if (c1.time < c2.time) return -1;
					return 1;
				}});
			int currentTime = 0;
			URI currentGraph = null;
			for (CategoryTrafficRecord catRec : catWrites) {

				// if novel time step, create a new named graph
				if (currentTime != catRec.time || currentGraph == null){
					// new graph
					currentGraph = new URIImpl(conf.TRAFFIC_RECORDS.stringValue() + catRec.time);

					GregorianCalendar timefrom = (GregorianCalendar) timeofinterest.clone();
					timefrom.add(Calendar.MINUTE, 5*(catRec.time-1));

					GregorianCalendar timeuntil = (GregorianCalendar) timeofinterest.clone();
					timeuntil.add(GregorianCalendar.MINUTE, 5*catRec.time);

					logger.info("Writing records for time + " + new XMLGregorianCalendarImpl(timefrom) 
					+ " (" + catRec.time + " x 5min).");

					myConn.addStatement(currentGraph, conf.RECORDS_FROM, 
							myValues.createLiteral(new XMLGregorianCalendarImpl(timefrom)), 
							conf.TRAFFIC_RECORDS);
					myConn.addStatement(currentGraph, conf.RECORDS_DATE, 
							myValues.createLiteral(new XMLGregorianCalendarImpl(timefrom)), 
							conf.TRAFFIC_RECORDS);
					myConn.addStatement(currentGraph, conf.RECORDS_UNTIL, 
							myValues.createLiteral(new XMLGregorianCalendarImpl(timeuntil)), 
							conf.TRAFFIC_RECORDS);

					currentTime = catRec.time;
					graphnames.add(currentGraph);
				}
				URI	subject;
				if (catRec.isSensor){
					subject = new URIImpl(conf.MAP_NAMESPACE + "trafficsensor/sensor" + catRec.sensorOrLinkId);
				}else{
					subject = new URIImpl(conf.MAP_NAMESPACE + "links/link" + catRec.sensorOrLinkId);
				}
				myConn.addStatement(subject, conf.TRAFFIC_CONDITION, 
						myValues.createLiteral(catRec.trafficCondition), currentGraph);

				// add estimated travel time
				if (!catRec.isSensor){

					//					CloseableIterator<Statement> iter = myConn.search(subject, null, null, null, null);
					//					while (iter.hasNext()){
					//						Statement s = iter.next();
					//						System.out.println(s.getPredicate() + " " + s.getObject());
					//					}

					// determine numeric category and length of link
					URI cat = (URI)myConn.search(subject, conf.LINK_CATEGORY, null, null, null).next().getObject();
					float length = ((Literal)myConn.search(subject, conf.LINK_LENGTH, null, null, null).
							next().getObject()).floatValue();
					int ncat = ((Literal)myConn.search(cat, conf.NUMERIC_CAT, null, null, null).
							next().getObject()).intValue();

					// LOCAL_ROAD, SECONDARY_ROAD, MAIN_ROAD, HIGHWAY
					float [] speedsFree = {30,30,40,70};
					float [] speedsCongested = {10,10,15,20};

					float speed;
					if (catRec.trafficCondition == 0)
						speed = speedsFree[ncat-1];
					else
						speed = speedsCongested[ncat-1];

					float traveltime  = length/1000 / speed *60; // in minutes

					myConn.addStatement(subject, conf.EST_TRAVELTIME, 
							myValues.createLiteral(traveltime), currentGraph);
				}
			}
		}		



		//		// *****************write time for checking and deleting data
		//		myConn.addStatement(conf.TRAFFIC_RECORDS, conf.LAST_TRAFFIC_PREDICTION_TIME, 
		//				myValues.createLiteral(new XMLGregorianCalendarImpl(timeofinterest)), 
		//				conf.TRAFFIC_RECORDS);
		//		

		// ********** return result
		resultSet.addAll(graphnames);
	}

	private void deleteOldTrafficData() {
		List<URI> graphNames = getTrafficGraphNames();

		for (URI graph : graphNames) {
			logger.info("Deleting old traffic graph " + graph + " ... ");
			myConn.removeStatement(null, null, null, graph);
		}

	}

	//	private boolean checkTrafficUpToDate(GregorianCalendar timeofinterest) {
	//		return false;
	//		boolean res;
	//		
	//		CloseableIterator<Statement> iter = myConn.search(conf.TRAFFIC_RECORDS, 
	//				conf.LAST_TRAFFIC_PREDICTION_TIME, null, conf.TRAFFIC_RECORDS, null);
	//		if (!iter.hasNext()) res = false;
	//		else {
	//			Statement s = iter.next();
	//			XMLGregorianCalendar lastPredTime = ((Literal)s.getObject()).calendarValue();
	//			res = timeofinterest.compareTo(lastPredTime.toGregorianCalendar()) == 0;
	//		}
	//		iter.close();
	//		
	//		return res;
	//	}

	/* *******************************************************************
	 * Methods to read and write data from RDB or files
	 * 
	 */
	private List<Integer> loadSensors(RdfGraph map){
		List<Integer> sensorList = new LinkedList<Integer>();
		sensorList.add(1);
		return sensorList;
	}

	private WeatherRecord loadWeatherData(GregorianCalendar timeofinterest) {
		//		String [] monthnames = {"Gennaio",
		//				"Febbraio", "Marzo", "Aprile", "Maggio",
		//				"Giugno", "Luglio", "Agosto", "Settembre",
		//				"Ottobre", "Novembre", "Dicembre"};
		//		String url = "http://www.ilmeteo.it/portale/archivio-meteo/Milano/" 
		//			+ timeofinterest.get(Calendar.YEAR) + "/"
		//			+ monthnames[timeofinterest.get(Calendar.MONTH)]
		//			+ "?format=csv";
		//		String url = "http://www.spiegel.de";
		//		InputStream in = new URL(url).openStream();
		//		Scanner sc = new Scanner(in);

		WeatherRecord res = new WeatherRecord();
		try {
			String file= conf.weatherDirectory + "/" 
			+ timeofinterest.get(Calendar.YEAR) + "-"
			+ String.format("%1$02d",timeofinterest.get(Calendar.MONTH)+1) + ".csv";
			Scanner sc = new Scanner(new File(file));
			sc.useDelimiter("\n");
			for (int i = 0; i < timeofinterest.get(Calendar.DAY_OF_MONTH); i++){
				String help = sc.next();
				//				System.out.println(help);
			}

			String line= sc.next().replace("\"", " ");
			String[]content= line.split(";");

			res.humidity = Integer.parseInt(content[6].trim());
			res.tmean = Integer.parseInt(content[2].trim());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return res;
	}

	private DayType loadDayType(GregorianCalendar timeofinterest) {
		DayType d = new DayType();
		d.daytype = timeofinterest.get(Calendar.DAY_OF_WEEK);
		if (d.daytype == 0) d.daytype = 7;

		d.holiday = 0; 
		if (true){
			GregorianCalendar basedate = new GregorianCalendar(2000, Calendar.JANUARY, 1, 0, 0);
			long stamp1 = (timeofinterest.getTime().getTime() - basedate.getTime().getTime()) / (1000 * 60 * 60 * 24);

			String sql = "select descrizione from \"Giorno\" where id = " + stamp1;

			try{
				java.sql.ResultSet rs = rdbConn.createStatement().executeQuery(sql);
				rs.next();
				String desc = rs.getString("descrizione");

				// if description starts with any of the day names, then not a holiday
				final String [] prefix  = {"Dome","Lune","Mart","Merc","Giov","Vene","Saba"};
				d.holiday = 1;
				for (int i = 0; i < prefix.length; i++)
					if (desc.startsWith(prefix[i])){
						d.holiday = 0;
						break;
					}
			}catch (Exception e){
				e.printStackTrace();
			}
		}

		return d;
	}

	private List<FloatTrafficRecord> loadTrafficDataFromRDB(GregorianCalendar timeofinterest, int numberOfHoursIntoPast) {

		List<FloatTrafficRecord> res = new LinkedList<FloatTrafficRecord>();

		//		CREATE TABLE trafficsmall
		//		(
		//		  id integer NOT NULL,
		//		  stamp1 smallint NOT NULL,
		//		  stamp2 smallint NOT NULL,
		//		  flow smallint,
		//		  speed real,
		//		  CONSTRAINT trafficsmall_primary PRIMARY KEY (id, stamp1, stamp2)
		//		);
		//		Insert into trafficsmall
		//		Select id,stamp1,stamp2,flow,speed from "CGT_Sezioni_detail" 
		//		where stamp1 >= 3600 and stamp1 < 3372 ;

		if (rdbConn != null){

			logger.info("Performing select on traffic database ...");

			// prepare SQL for database
			GregorianCalendar basedate = new GregorianCalendar(2000, Calendar.JANUARY, 1, 0, 0);


			//			long stamp1 = 3371; 
			long stamp1 = (timeofinterest.getTime().getTime() - basedate.getTime().getTime()) / (1000 * 60 * 60 * 24);
			long stamp1old = stamp1;

			int stamp2 = timeofinterest.get(Calendar.HOUR_OF_DAY)*12+timeofinterest.get(Calendar.MINUTE)/5 +1 +1000;
			int stamp2old = stamp2 - 12*numberOfHoursIntoPast +1;

			if (stamp2old < 1001){
				stamp1old = stamp1old - 1;
				stamp2old = 1288 - (1001-stamp2old);
			}

			String sql = "select id,stamp1,stamp2,flow,speed from "
				+ " trafficsmall ";
			//				+ " \"CGT_Peritrafficsmall ";
			if (stamp1 == stamp1old)
				sql = sql + "where stamp1 = " + stamp1 + " and stamp2 >= " + stamp2old + " and stamp2 <= " + stamp2;
			else
				sql = sql + "where (stamp1 = " + stamp1 + " and stamp2 <= " + stamp2 + ") or " 
				+ "(stamp1 = " + stamp1old + " and stamp2 >= " + stamp2old + ")";

			sql = sql + " order by id,stamp1,stamp2";

			try{
				// running actual query
				logger.info("Running traffic RDB query ...");
				java.sql.ResultSet rs = rdbConn.createStatement().executeQuery(sql);
				logger.info("Formatting results of select ...");

				while (rs.next())
				{
					FloatTrafficRecord rec = new FloatTrafficRecord();
					rec.flow = rs.getFloat("flow");
					rec.speed = rs.getFloat("speed");
					rec.sensorId = rs.getLong("id");
					rec.time = (int) ((rs.getLong("stamp1")-stamp1)*288+rs.getLong("stamp2")-stamp2);

					if (ISDEBUG && rec.time > 0)
						System.out.println("Error: time > 0 " + rec.sensorId + " at " + rec.time);

					res.add(rec);
				}
				rs.close();

			} catch (SQLException ex) {System.err.println(ex.getMessage());}
		}
		return res;


	}


	/* *******************************************************************
	 * The really intelligent methods
	 * 
	 */
	private List<FloatTrafficRecord> predictTraffic(
			List<FloatTrafficRecord> trafficData, 
			WeatherRecord [] weatherData,
			DayType [] days) {
		List<FloatTrafficRecord> res = new LinkedList<FloatTrafficRecord>();
		if (false){
			//**********************************************************
			// demo implementation which just predicts zero everywhere
			//**********************************************************
			HashSet<Long> knownSensorIDs = new HashSet<Long>();

			for (FloatTrafficRecord rec : trafficData) {
				if (!knownSensorIDs.contains(rec.sensorId)){
					knownSensorIDs.add(rec.sensorId);
					for (int i = 1; i <= 24; i++){
						FloatTrafficRecord rn = new FloatTrafficRecord();
						rn.sensorId = rec.sensorId;
						rn.time = i;
						rn.flow = 0;
						rn.speed = 0;
						res.add(rn);
					}
				}
			}
		} else {
			// if necessary load neural nets
			if (nets == null){

				long startTime = System.currentTimeMillis();

				nets = new ArrayList<NeuralNet>();
				netSensorIds = new ArrayList<Long>();

				File xmlDir = new File(conf.rnnDirectory);
				String [] netFiles = xmlDir.list(new FilenameFilter() {
					@Override
					public boolean accept(File dir, String name) {
						return name.endsWith(".xml");
					}
				});

				int MAXNUMNETS = netFiles.length;
				//				if (ISDEBUG) MAXNUMNETS = 20;
				logger.info("Loading " + MAXNUMNETS + " neural nets from file (from available " + netFiles.length + ")");

				for (int i = 0; i < MAXNUMNETS; i++){ 
					try {
						String id = netFiles[i].substring(6, netFiles[i].length()-4);
						netSensorIds.add(Long.parseLong(id));
						if (ISDEBUG)
							System.out.println("Loading net " + netFiles[i] + " ...");
						NeuralNet net = NeuralNet.createFromSennModelFile(xmlDir.toString() + "/" + netFiles[i]);
						nets.add(net);
					} catch (Exception e) {
						e.printStackTrace();
					};
				}

				long endTime = System.currentTimeMillis();
				logger.info("Loading " + MAXNUMNETS + " neural nets from file took " + (endTime-startTime)/1000 + " seconds.");
			}

			logger.info("Evaluating neural nets ...");
			HashSet<Long> validSensors = new HashSet<Long>();
			HashSet<Long> invalidSensors = new HashSet<Long>();

			// now do the evaluation for each sensor
			for (int i = 0; i < netSensorIds.size(); i++){
				NeuralNet net;
				// work on clone to discard internal state at next call
				//				if (ISDEBUG)
				//					net = nets.get(0).clone(); // this uses always the same net !!!!!!!!!!!!!!!!!!!!!!!!!!!!!! TODO change !!!!!!!!!!!!!!!!!!!!!
				//				else
				net = nets.get(i).clone(); 
				long sensorId = netSensorIds.get(i);


				// fill input with data from trafficRecords
				float maxSpeed = 0;
				float minSpeed = Float.MAX_VALUE;
				float maxFlow = 0;
				float minFlow = Float.MAX_VALUE;
				float [] input = new float[net.getInputs().getVariableNames().length];
				for (int j = 0; j < input.length; j++) input[j] = Float.NaN;
				for (FloatTrafficRecord rec: trafficData){
					if (rec.sensorId ==  sensorId && rec.time >= -287 && rec.time <= 0){
						int hour = -rec.time / 12;
						int slice = 12 - (-rec.time % 12) -1;
						int blockIndStart = 4 + 2*12*(23-hour);

						if (!Double.isNaN(input[blockIndStart + slice]))
							logger.severe("Double acces to same input at sensor " + sensorId);
						input[blockIndStart + slice] = rec.flow;
						if (!Double.isNaN(input[blockIndStart + slice + 12]))
							logger.severe("Double acces to same input at sensor " + sensorId);
						input[blockIndStart + slice + 12] = rec.speed;

						if (maxFlow < rec.flow) maxFlow = rec.flow;
						if (minFlow > rec.flow) minFlow = rec.flow;
						if (maxSpeed < rec.speed) maxSpeed = rec.speed;
						if (minSpeed > rec.speed) minSpeed = rec.speed;
					}
				}

				int numUnassigned = 0;
				for (int j = 4; j < input.length; j++) 
					if (Float.isNaN(input[j])) numUnassigned++;

				//				if (numUnassigned < 3){
				//					for (int j = 4; j < input.length; j++) 
				//						if (Float.isNaN(input[j])) input[j] = 10;
				//					numUnassigned = 0;
				//				}	

				if (ISDEBUG)
					System.out.println(sensorId + ": flow (" + minFlow + "," 
							+ maxFlow + "), speed (" + minSpeed + "," + maxSpeed
							+ "), unassigned = " + numUnassigned);

				// test whether current inputs for this sensor are valid, if not it is skipped
				boolean validInput = maxSpeed > 5 && numUnassigned == 0;
				if (validInput)
					validSensors.add(sensorId);
				else{
					invalidSensors.add(sensorId);
					continue;
				}

				// call neural network evaluation twice (due to lag 1 data)
				// 1st time: use weather of today
				// 2nd time: use weather of tomorrow
				input[0] = days[0].daytype;
				input[1] = days[0].holiday;
				input[2] = weatherData[0].tmean;
				input[3] = weatherData[0].humidity;
				float [] output = net.fullRecall(input);

				input[0] = days[1].daytype;
				input[1] = days[1].holiday;
				input[2] = weatherData[1].tmean;
				input[3] = weatherData[1].humidity;
				output = net.fullRecall(input);

				// add outputs of the 24h hours into output record list
				for (int j = 0; j < 24*12; j++){
					FloatTrafficRecord rec = new FloatTrafficRecord();
					rec.sensorId = sensorId;

					int hour = j / 12;
					int slice = j % 12;

					rec.time = j+1;
					rec.flow = output[288*2 + hour*2*12 + slice];
					rec.speed = output[288*2 + hour*2*12 + slice + 12];

					res.add(rec);
				}
			}

			logger.info("Predicted traffic with RNNs for " + validSensors.size()
					+ " sensors\nthat are " + validSensors);
			logger.info("Skipped " + invalidSensors.size() 
					+ " sensors due to unavailable or inconsistent data\nthese are "
					+ invalidSensors);
		}
		return res;
	}

	private List<CategoryTrafficRecord> categorizeTraffic(
			List<FloatTrafficRecord> floatRecs) {

		loadCategorizationInfo();

		if (floatRecs != null){
			List<CategoryTrafficRecord> res = new LinkedList<CategoryTrafficRecord>();

			for (FloatTrafficRecord floatRec : floatRecs) {
				CategoryTrafficRecord catRec = new CategoryTrafficRecord();
				catRec.time = floatRec.time;
				catRec.sensorOrLinkId = floatRec.sensorId;
				catRec.isSensor = true;

				boolean congested = false;
				if (catInfo.containsKey((long)floatRec.sensorId)){
					TrafficCategoryInfo ci = catInfo.get(catRec.sensorOrLinkId);
					congested = floatRec.speed < 0.6*ci.normalSpeed && floatRec.flow > 10;
				}
				//				float density = floatRec.flow*12/floatRec.speed; // density in #/km
				//				float densityThreshold = 50;
				//				densityThreshold = catInfo.get(catRec.sensorOrLinkId);
				//				boolean congested = density > densityThreshold;

				catRec.trafficCondition = congested ? 1 : 0; // normal traffic is 0
				res.add(catRec);
			}
			return res; 
		} else {
			return null;
		}
	}

	private int extractLinkID(String uri){
		String id = uri.substring(uri.indexOf("links/link")+10);
		return Integer.parseInt(id);
	}
	private int extractSensorID(String uri){
		String id = uri.substring(uri.indexOf("trafficsensor/sensor")+20);
		return Integer.parseInt(id);
	}

	private void collectSSLTrafficNetWork(){
		class LinkConnection{
			int link1;
			int link2;
			boolean sameCategory;
			LinkConnection(int l1, int l2, boolean sameCat){ link1 = l1; link2 = l2; sameCategory = sameCat; }
		};	


		class SensorLinkPair{
			int sensorid;
			int linkid;
			SensorLinkPair(int sen, int lin){sensorid = sen; linkid = lin;}
		};		

		logger.info("Collecting traffic network for SSL ...");

		// collect all links with category and mean speed
		String sparqlm1 = "Select ?v where {<" + conf.LOCAL_ROAD + "> <" + conf.NUMERIC_CAT + "> ?v .} limit 1"; 

		if (!myConn.executeSelect(new SPARQLQueryImpl(sparqlm1)).iterator().hasNext()){
			myConn.addStatement(conf.LOCAL_ROAD, conf.NUMERIC_CAT, myValues.createLiteral(1), conf.NUMERIC_CATS);
			myConn.addStatement(conf.SECONDARY_ROAD, conf.NUMERIC_CAT, myValues.createLiteral(2), conf.NUMERIC_CATS);
			myConn.addStatement(conf.MAIN_ROAD, conf.NUMERIC_CAT, myValues.createLiteral(3), conf.NUMERIC_CATS);
			myConn.addStatement(conf.HIGHWAY, conf.NUMERIC_CAT, myValues.createLiteral(4), conf.NUMERIC_CATS);
		}
		String sparql0 = "Select ?link ?ncat where { "
			+ "?link <" + RDF.TYPE + "> <" + conf.LINK_TYPE + "> . "
			+ "?link <" + conf.LINK_CATEGORY + "> ?cat ."
			+ "?cat <" + conf.NUMERIC_CAT + "> ?ncat ."
			//			+ "FILTER( ?ncat > 2) "
			+ "}";
		CloseableIterator<Binding> iter1 = myConn.executeSelect(new SPARQLQueryImpl(sparql0)).iterator();
		sslLinks = new ArrayList<Integer>(); 
		//		sslLinksCat = new ArrayList<Integer>(); 
		sslDefaultLinks = new ArrayList<Integer>(); 
		//		sslDefaultLinksCat = new ArrayList<Integer>(); 
		while (iter1.hasNext()){
			Binding b = iter1.next();
			String linkname = b.getValues().get(0).toString();
			int linkid = extractLinkID(linkname);
			int streetCategory = ((Literal)b.getValues().get(1)).intValue();
			if (streetCategory > 2){
				sslLinks.add(linkid);
				//				sslLinksCat.add(streetCategory);
			} else {
				sslDefaultLinks.add(linkid);
				//				sslDefaultLinksCat.add(streetCategory);
			}
		}
		iter1.close();

		// sort links by id and move the categories accordingly
		//		HashMap<Integer,Integer> help = new HashMap<Integer,Integer>();
		//		for (int i = 0; i < sslLinks.size(); i++) help.put(sslLinks.get(i), sslLinksCat.get(i));
		Collections.sort(sslLinks);
		//		for (int i = 0; i < sslLinks.size(); i++) sslLinksCat.set(i,help.get(sslLinks.get(i)));

		// collect connections between links
		List<LinkConnection> connects = new ArrayList<LinkConnection>(); 
		String sparql1 = "Select ?link1 ?link2 ?x1 ?x2 ?y1 ?y2 ?z1 ?z2 where { "
			+ "?link1 <" + RDF.TYPE + "> <" + conf.LINK_TYPE + "> . "
			+ "?link2 <" + RDF.TYPE + "> <" + conf.LINK_TYPE + "> . "
			+ "?link1 <" + conf.LINK_FROM_NODE + "> ?x . "
			+ "?link1 <" + conf.LINK_TO_NODE + "> ?y . "
			+ "?link2 <" + conf.LINK_FROM_NODE + "> ?y . "
			+ "?link2 <" + conf.LINK_TO_NODE + "> ?z . "
			+ "?x <" + conf.GB_LAT + "> ?x1 . "
			+ "?x <" + conf.GB_LONG + "> ?x2 . "
			+ "?y <" + conf.GB_LAT + "> ?y1 . "
			+ "?y <" + conf.GB_LONG + "> ?y2 . "
			+ "?z <" + conf.GB_LAT + "> ?z1 . "
			+ "?z <" + conf.GB_LONG + "> ?z2 . "
			+ "}";
		CloseableIterator<Binding> iter2 = myConn.executeSelect(new SPARQLQueryImpl(sparql1)).iterator();
		while (iter2.hasNext()){
			Binding b = iter2.next();
			int link1 = extractLinkID(b.getValues().get(0).toString());
			int link2 = extractLinkID(b.getValues().get(1).toString());
			int ilink1 = Collections.binarySearch(sslLinks, link1);
			int ilink2 = Collections.binarySearch(sslLinks, link2);
			if (ilink1 >= 0 && ilink2 >= 0){

				// compute direction of the two links: if they are not within 45� then 
				// we set a flag and give these connections a lower weight
				Vector x = new DenseVector(2);
				x.set(0,((Literal)b.getValues().get(2)).doubleValue());
				x.set(1,((Literal)b.getValues().get(3)).doubleValue());
				Vector y = new DenseVector(2);
				y.set(0,((Literal)b.getValues().get(4)).doubleValue());
				y.set(1,((Literal)b.getValues().get(5)).doubleValue());
				Vector z = new DenseVector(2);
				z.set(0,((Literal)b.getValues().get(6)).doubleValue());
				z.set(1,((Literal)b.getValues().get(7)).doubleValue());

				// compute differences
				z.add(-1,y);
				y.add(-1,x);

				// compute angle
				double angle = Math.abs(Math.acos(z.dot(y)/z.norm(Norm.Two)/y.norm(Norm.Two)))/Math.PI*180;
				connects.add(new LinkConnection(ilink1,ilink2,angle<45));
			}
		}
		iter2.close();

		// build graph Laplacian

		// load connection weights into matrix
		int N = sslLinks.size();
		FlexCompRowMatrix W = new FlexCompRowMatrix(N,N);
		final double diff_cat = 0.1;
		for (LinkConnection h : connects){
			double linkStrength = h.sameCategory ? 1 : diff_cat;
			W.set(h.link1, h.link2, linkStrength);
			W.set(h.link2, h.link1, linkStrength);
		}

		// compute degree
		Vector one = new DenseVector(N);
		for (int i = 0; i < N; i++) one.set(i, 1);
		Vector degree = new DenseVector(N);
		W.mult(one, degree);

		sslGraphLaplacian = new FlexCompRowMatrix(N,N);
		sslGraphLaplacian.add(-1,W);
		for (int i = 0; i < N; i++) sslGraphLaplacian.add(i, i, degree.get(i));

		// collect all traffic sensor speed predictions with relevant link
		sslSensors = new ArrayList<Integer>();
		List<SensorLinkPair> sensorLinks = new ArrayList<SensorLinkPair>();
		String sparql2 = "Select ?sensor ?link where { "
			+ "?sensor <" + RDF.TYPE + "> <" + conf.SENSOR_TYPE + "> . "
			+ "?sensor <" + conf.LINKED_WITH + "> ?link .  "
			+ "}";
		CloseableIterator<Binding> iter3 = myConn.executeSelect(new SPARQLQueryImpl(sparql2)).iterator();
		while (iter3.hasNext()){
			Binding b = iter3.next();
			int linkid = extractLinkID(b.getValues().get(1).toString());
			int sensorid = extractSensorID(b.getValues().get(0).toString());
			int ilink = Collections.binarySearch(sslLinks, linkid);
			if (ilink >= 0){
				sensorLinks.add(new SensorLinkPair(sensorid,linkid));
				sslSensors.add(sensorid);
			}
		}
		iter3.close();
		Collections.sort(sslSensors);

		//		// check whether certain linkid occur more often
		//		HashSet<Integer> h = new HashSet<Integer>();
		//		for (SensorLinkPair sp : sensorLinks) {
		//			if (h.contains(sp.linkid)){
		//				System.out.println(sp.sensorid + " " + sp.linkid);
		//			}
		//			h.add(sp.linkid);
		//		}


		// build selection matrix S 
		int m = sensorLinks.size();
		sslSelector = new FlexCompRowMatrix(m,N);
		for (SensorLinkPair sp : sensorLinks) {
			int ilink = Collections.binarySearch(sslLinks, sp.linkid);
			int isensor = Collections.binarySearch(sslSensors, sp.sensorid);
			sslSelector.set(isensor,ilink,1);
		}		

		logger.info("Done with collecting traffic network for SSL.");		
	}

	private List<CategoryTrafficRecord> generalizeSensorTraffic(
			List<CategoryTrafficRecord> sensorCats) {

		if (sensorCats == null) return null;

		logger.info("Generalizing traffic from sensors to links ...");


		// **********************************************************
		// collect time invariant data: links, Graph Laplacian, selector matrix (not all of which will be used
		if (sslGraphLaplacian ==  null) collectSSLTrafficNetWork();

		//******************************************************************************
		// do generalization for each time step and write results into output list

		// sort by time
		Collections.sort(sensorCats, new Comparator<CategoryTrafficRecord>(){
			@Override
			public int compare(CategoryTrafficRecord o1, CategoryTrafficRecord o2) {
				if (o1.time == o2.time) return 0;
				if (o1.time < o2.time) return -1;
				return 1;
			}});


		int currentTime = -288*30;
		Iterator<CategoryTrafficRecord> iter = sensorCats.iterator();
		List<CategoryTrafficRecord> result = new LinkedList<CategoryTrafficRecord>();
		Vector y = null;
		while (true){
			CategoryTrafficRecord rec = null;
			if (iter.hasNext()) rec = iter.next();

			//			// skip time steps before time 0
			//			if (rec != null && rec.time < 0) continue;

			if ((rec == null || rec.time != currentTime) && y != null){
				// do the generalization
				Vector catPred = solveSSL(y,currentTime);

				if (ISDEBUG)
					System.out.println("Free memory is " + Runtime.getRuntime().freeMemory()/1024/1024  + "MB.");

				// write results to output list
				for (int i = 0; i < catPred.size(); i++){
					CategoryTrafficRecord linkrec = new CategoryTrafficRecord();
					linkrec.sensorOrLinkId = sslLinks.get(i);
					linkrec.time = currentTime;
					linkrec.trafficCondition = catPred.get(i) > Config.sslThreshold ? 1 : 0;
					linkrec.isSensor = false;
					//					linkrec.streetCategory = sslLinksCat.get(i);
					result.add(linkrec);
				}

				// write default values for other links to output
				for (int i = 0; i < sslDefaultLinks.size();i++){
					CategoryTrafficRecord linkrec = new CategoryTrafficRecord();
					linkrec.sensorOrLinkId = sslDefaultLinks.get(i);
					linkrec.time = currentTime;
					linkrec.trafficCondition = 0; // normal 
					linkrec.isSensor = false;
					//					linkrec.streetCategory = sslDefaultLinksCat.get(i);
					result.add(linkrec);
				}

				// clear right hand side
				y = null;
			}

			if (rec == null) break;
			else {
				if (rec.time != currentTime){
					// Initialize vectors of SSL system
					y = new DenseVector(sslSensors.size());
					for (int i = 0; i < y.size(); i++) {
						y.set(i,Double.NaN);
					}
					currentTime = rec.time; 
				}

				// just insert data
				int isensor = Collections.binarySearch(sslSensors, (int)rec.sensorOrLinkId);
				if (isensor >= 0) {
					// check whether this was empty before
					if (ISDEBUG && !Double.isNaN(y.get(isensor)))
						System.out.println("Error: y entry is already given a number." +
								"Double records? " + rec.sensorOrLinkId + " at time "
								+ rec.time + " (" + y.get(isensor) + "/" + Double.isNaN(y.get(isensor)) +  ")");

					y.set(isensor, rec.trafficCondition);
					//					System.out.println(isensor + " " + rec.trafficCondition + " from " + rec.sensorOrLinkId);
				}
			}
		}
		return result;
	}



	private Vector solveSSL(Vector y, int time) {
		// entries in y that are NaN should be neglected from the generalization, i.e.
		// they have to be deleted from the selector matrix

		int N = sslLinks.size();
		int m = 0;
		int numOnes = 0;
		int [] indexYInYred = new int[y.size()];
		for (int i = 0; i < y.size(); i++) {
			indexYInYred[i] = m;
			if (!Double.isNaN(y.get(i))) m++;
			if (y.get(i) == 1) numOnes++;
		}

		DenseVector yred = new DenseVector(m);
		FlexCompRowMatrix Sred = new FlexCompRowMatrix(m,N);

		for (MatrixEntry ij : sslSelector) {
			int oldIndex = ij.row();
			if (!Double.isNaN(y.get(oldIndex))){
				int newIndex = indexYInYred[oldIndex];
				yred.set(newIndex,y.get(oldIndex));
				Sred.add(newIndex, ij.column(), 1);
			}
		}

		// compute left hand side of SSL equation
		CompRowMatrix left = new CompRowMatrix(sslGraphLaplacian);
		left.scale(Config.sslLambdaReg);

		// regularize the system to zero to avoid singularities of the matrix
		for (int i = 0; i < N; i++){
			left.add(i, i, Config.sslLambdaNull);
		}

		// add influence of selector matrix S^T S
		for (MatrixEntry ij : Sred) {
			int col = ij.column();
			left.add(col, col, 1);		
		}	

		// compute right hand side of SSL equation
		DenseVector right = new DenseVector(N);
		Sred.transMult(yred, right);

		// now finally solve the system itself
		Vector result = new DenseVector(sslLinks.size());
		try{
			IterativeSolver solver = new CG(result);
			// Create a preconditioner 
			//	Preconditioner M = new ICC(AA.copy()); 
			Preconditioner M = new DiagonalPreconditioner(sslLinks.size());
			M.setMatrix(left); 
			solver.setPreconditioner(M); 

			long start = System.currentTimeMillis();
			solver.solve(left, right, result);
			long stop = System.currentTimeMillis();

			// compute residual and check computation
			Vector residual = new DenseVector(N);
			left.mult(result,residual).add(-1, right);
			logger.info("Solving SSL of size " + N + "x" + N + " at time " + time + " took " + (stop-start) + "ms.\n"
					+ "Maximum entry of residual (CG error) for solving linear system is " + residual.norm(Vector.Norm.Infinity) + "\n"
					+ "with " + numOnes + " congections from " + m + " given sensor traffics");

		} catch (IterativeSolverNotConvergedException e) {
			System.out.println("Error while solving linear system:");
			e.printStackTrace();
		}


		//		if (ISDEBUG){
		//			// DEBUG: Export matrices and check whether computation was correct
		////			if (time == 0){
		//				writeMatrix(left,"debugdata/left"+time);
		//				writeMatrix(sslGraphLaplacian,"debugdata/L");
		//				writeMatrix(Sred,"debugdata/S"+time);
		////			}
		//			writeVector(result, "debugdata/result"+time);
		//			writeVector(right, "debugdata/right"+time);
		//			writeVector(yred,"debugdata/y"+time);
		//			// End DEBUG:
		//		}

		return result;
	}





	// *************************** THIS CODE IS TEST CODE FOR THIS PLUGIN ************************************************
	// *************************** THIS CODE IS TEST CODE FOR THIS PLUGIN ************************************************
	// *************************** THIS CODE IS TEST CODE FOR THIS PLUGIN ************************************************
	public static void main(String[] args){
		System.out.println("Free memory is " + Runtime.getRuntime().freeMemory()/1024/1024  + "MB.");

		//		// load street map
		////		RemoteGraphLoaderIdentifier mapLoader = new RemoteGraphLoaderIdentifier();
		////		Collection<InformationSet> maps = mapLoader.identify(null, null, null);
		try{
			//LOAD THE NEW MAP
			LarKCUtilities.importRdfGraph((new URL("http://localhost/milano-map-with-sensors-and-geo.nt")).openStream(), new URIImpl("http://larkc.cefriel.it/pathfinding/map"), LarKCUtilities.NTRIPLE);
			//LOADS THE OLD MAP
			//			LarKCUtilities.importRdfGraph((new URL("http://localhost/milano-map-with-sensors-and-geo.rdf")).openStream(), new URIImpl("http://larkc.cefriel.it/pathfinding/map"), LarKCUtilities.RDFXML);
		}catch (Exception e) {
			e.printStackTrace();
		}
		RdfGraph map = DataFactory.INSTANCE.createRdfStoreConnection().createRdfGraph(
				new URIImpl("http://larkc.cefriel.it/pathfinding/map"));

		//		// run 
		MilanTrafficDataTransformer m = new MilanTrafficDataTransformer();
		m.transform(map, null, null);

		GregorianCalendar time = (GregorianCalendar)Calendar.getInstance();
		time.add(Calendar.HOUR, 1);
		m.writeTrafficPredictionsForDebug(time);

		//		CloseableIterator<Statement> iter = DataFactory.INSTANCE.createRdfStoreConnection().search(
		//		 new URIImpl("http://www.linkingurbandata.org/onto/ama/trafficsensor/sensor10001"),
		//		 null, null, null, null);
		//
		//while (iter.hasNext()){
		//	Statement s = iter.next();
		//	System.out.println(s.getPredicate() + " " + s.getObject());
		//}

		//

		//		////		
		//////	// test the results
		//////	m.testLastPredicitonTime();
		//////	m.testCategoryWriting();
		////	

		//		WeatherRecord weather = m.loadWeatherData(time);
		//		
		//		System.out.println(weather.tmean + " " + weather.humidity);
		////		
		////		m.writeNodeGB();
	}

	private void writeNodeGB() {
		String sparql = "PREFIX lud: <http://www.linkingurbandata.org/onto/ama/>\n"
			+ "SELECT ?node ?lat ?long where " 
			+ "{ ?node lud:gbLat ?lat; lud:gbLong ?long . }";

		try{
			CloseableIterator<Binding> iter = myConn.executeSelect(new SPARQLQueryImpl(sparql)).iterator();


			FileWriter fstream = new FileWriter("debugdata/NodePosition.dat");
			BufferedWriter out = new BufferedWriter(fstream);
			PrintWriter print = new PrintWriter(out);
			print.println("NoderURI;gbLat;gbLong");
			int count = 0;
			while (iter.hasNext()){
				Binding b = iter.next();
				count++;
				print.println(
						b.getValues().get(0).toString() + ";" + 
						((Literal)b.getValues().get(1)).doubleValue() + ";" + 
						((Literal)b.getValues().get(2)).doubleValue() 
				);
			}
			iter.close();
			System.out.println("Wrote " + count + " nodes to file.");
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	//	private void testLastPredicitonTime(){
	//		String sparql = "SELECT ?time where " 
	//			+ "{ <" + conf.TRAFFIC_RECORDS + "> <" + conf.LAST_TRAFFIC_PREDICTION_TIME + "> ?time . }";
	//		
	//		VariableBinding res = myConn.executeSelect(new SPARQLQueryImpl(sparql));
	//		if (!res.iterator().hasNext()) System.out.println("No prediciton done so far.");
	//		else{
	//			Binding b = res.iterator().next();
	//			Value v = b.getValues().get(0);
	//			System.out.println("Last update at " + v.stringValue() + ".");
	//		}
	//	}

	//	private void testCategoryWriting(){
	//		String sparql = "SELECT ?graph ?timefrom ?timeuntil where " 
	//			+ "{ ?graph <" + conf.RECORDS_FROM + "> ?timefrom ; "
	//			+ "<" + conf.RECORDS_UNTIL + "> ?timeuntil . }";
	//
	//		CloseableIterator<Binding> res = myConn.executeSelect(new SPARQLQueryImpl(sparql)).iterator();
	//		while (res.hasNext()){
	//			Binding b = res.next();
	//			System.out.println(b.getValues().get(0) 
	//					+ " from " + b.getValues().get(1)
	//					+ " until " + b.getValues().get(2));
	//		}
	//	}
	//	


	public void writeVector(Vector v, String filename){
		try {

			FileWriter fstream = new FileWriter(filename + ".vec");
			BufferedWriter out = new BufferedWriter(fstream);
			PrintWriter print = new PrintWriter(out);
			for (int i = 0; i < v.size(); i++){
				print.println(v.get(i));
			}
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void writeMatrix(Matrix m, String filename){
		try {
			FileWriter fstream = new FileWriter(filename + ".mx");
			BufferedWriter out = new BufferedWriter(fstream);
			PrintWriter print = new PrintWriter(out);

			print.println(m.numRows() + " " + m.numColumns() + " 0");

			Iterator<MatrixEntry> iter = m.iterator();
			while (iter.hasNext()){
				MatrixEntry entry = iter.next();
				print.println(entry.row() + " " + entry.column() + " " + entry.get());
			}

			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	

	public void writeTrafficPredictionsForDebug(GregorianCalendar time){
		Literal ltime = myValues.createLiteral(new XMLGregorianCalendarImpl(time));

		System.out.println("Debug: Querying traffic info at time " + ltime);

		// *****************************************************+
		// write prediction for all sensors
		try {

			String sparql = "" 
				+ "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\n"
				+ "PREFIX lud: <http://larkc.cefriel.it/ontologies/urbanpathfinding#>\n"
				+ "SELECT  ?pfrom1 ?pfrom2 ?pto1 ?pto2 ?trafficCondition\n" 
				+ "WHERE {?sensor rdf:type lud:TrafficSensor .\n"
				+ "?sensor lud:LinkedWith ?link .\n"
				+ "?link lud:hasTo ?n1 ;\n"
				+ "lud:hasFrom ?n2 .\n"
				+ "?n1 lud:gbLat ?pfrom1; lud:gbLong ?pfrom2 .\n"
				+ "?n2 lud:gbLat ?pto1; lud:gbLong ?pto2 .\n"				
				+ "graph ?g { ?sensor lud:hasTrafficCondition ?trafficCondition . } . \n"
				+ "?g lud:hasTrafficRecordsFrom ?dfrom . \n"
				+ "?g lud:hasTrafficRecordsUntil ?duntil . \n"
				+ "FILTER(?dfrom <= " + ltime + " && ?duntil >= " + ltime + ")}";

			System.out.println(sparql);

			CloseableIterator<Binding> iter = myConn.executeSelect(new SPARQLQueryImpl(sparql)).iterator();

			FileWriter fstream = new FileWriter("debugdata/SensorTraffic.dat");
			BufferedWriter out = new BufferedWriter(fstream);
			PrintWriter print = new PrintWriter(out);
			int count = 0;
			while (iter.hasNext()){
				Binding b = iter.next();
				count++;
				print.println(
						((Literal)b.getValues().get(0)).doubleValue() + " " + 
						((Literal)b.getValues().get(1)).doubleValue() + " " + 
						((Literal)b.getValues().get(2)).doubleValue() + " " + 
						((Literal)b.getValues().get(3)).doubleValue() + " " + 
						((Literal)b.getValues().get(4)).intValue() 
				);
			}
			iter.close();
			System.out.println("Wrote traffic predictions for " + count + " sensors to file.");
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		// *****************************************************+
		// write prediction for all links including travel times
		try {
			String sparql = "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\n"
				+ "PREFIX lud: <http://larkc.cefriel.it/ontologies/urbanpathfinding#>\n"
				+ "SELECT ?pfrom1 ?pfrom2 ?pto1 ?pto2 ?linkTrafficCondition ?estTravelTime\n"
				+ "WHERE {?link rdf:type lud:Link ;\n"
				+ "lud:hasTo ?n1 ;\n"
				+ "lud:hasFrom ?n2 .\n"
				+ "?n1 lud:gbLat ?pfrom1; lud:gbLong ?pfrom2 .\n"
				+ "?n2 lud:gbLat ?pto1; lud:gbLong ?pto2 .\n"
				+ "graph ?g { ?link lud:hasTrafficCondition ?linkTrafficCondition . \n"
				+ 			" ?link lud:hasEstimatedTravelTime ?estTravelTime } . \n"
				+ "?g lud:hasTrafficRecordsFrom ?dfrom . \n"
				+ "?g lud:hasTrafficRecordsUntil ?duntil . \n"
				+ "FILTER(?dfrom <= " + ltime + " && ?duntil >= " + ltime + ")}";

			System.out.println(sparql);
			CloseableIterator<Binding> iter = myConn.executeSelect(new SPARQLQueryImpl(sparql)).iterator();

			FileWriter fstream = new FileWriter("debugdata/LinkTraffic.dat");
			BufferedWriter out = new BufferedWriter(fstream);
			PrintWriter print = new PrintWriter(out);
			int count = 0;
			while (iter.hasNext()){
				Binding b = iter.next();
				count++;
				//				System.out.println(b);
				print.println(
						((Literal)b.getValues().get(0)).doubleValue() + " " + 
						((Literal)b.getValues().get(1)).doubleValue() + " " + 
						((Literal)b.getValues().get(2)).doubleValue() + " " + 
						((Literal)b.getValues().get(3)).doubleValue() + " " + 
						((Literal)b.getValues().get(4)).intValue() + " " + 
						((Literal)b.getValues().get(5)).doubleValue() 
				);
			}
			iter.close();
			System.out.println("Wrote traffic predictions for " + count + " links to file.");
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		// ***********************************************************************************
		// DEMO for Daniele and Irene

		// determine Graph
		String sparql = "PREFIX lud: <http://larkc.cefriel.it/ontologies/urbanpathfinding#>\n"
			+ "SELECT ?g\n"
			+ "WHERE {?g lud:hasTrafficRecordsFrom ?dfrom . \n"
			+ "?g lud:hasTrafficRecordsUntil ?duntil . \n"
			+ "FILTER(?dfrom <= " + ltime + " && ?duntil >= " + ltime + ")}";
		CloseableIterator<Binding> iter = myConn.executeSelect(new SPARQLQueryImpl(sparql)).iterator();

		if (iter.hasNext()){
			URI graph = (URI)iter.next().getValues().get(0);

			CloseableIterator<Statement> iter2 = myConn.search(null, conf.EST_TRAVELTIME, null, graph, null);
			for (int i = 0; i < 3; i++){
				Statement s = iter2.next();
				System.out.println("Est. travel time: " + s.getSubject() + " " + ((Literal)s.getObject()).floatValue() + " min");
			}
		}
	}	


	private void writeAllTraffic(
			List<FloatTrafficRecord> histTrafficDataSensor,
			List<FloatTrafficRecord> predTrafficDataSensor,
			List<CategoryTrafficRecord> trafficCategoriesSensor,
			List<CategoryTrafficRecord> trafficCategoriesLinks) {

		if (sslLinks != null){
			// determine set of currently valid sensors as those, that have predictions
			HashSet<Long> validSensors = new HashSet<Long>();
			for (FloatTrafficRecord rec : predTrafficDataSensor)
				validSensors.add(rec.sensorId);

			System.out.println("Found " + validSensors.size() + " valid sensors to write to file.");

			// write float records for all valid sensors
			List<FloatTrafficRecord> frecs = new ArrayList<FloatTrafficRecord>();
			frecs.addAll(histTrafficDataSensor);
			frecs.addAll(predTrafficDataSensor);

			try {
				FileWriter fstream = new FileWriter("debugdata/FloatTraffic.dat");
				BufferedWriter out = new BufferedWriter(fstream);
				PrintWriter print = new PrintWriter(out);
				int count = 0;
				for (FloatTrafficRecord rec : frecs){
					if (validSensors.contains(rec.sensorId)){
						count++;
						print.println(rec.sensorId + " " + rec.time + " " + rec.flow + " " + rec.speed);
					}
				}
				System.out.println("Wrote " + count + " float records to file.");

				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}			

			// write class records for all links 
			try {
				FileWriter fstream = new FileWriter("debugdata/CatTrafficLink.dat");
				BufferedWriter out = new BufferedWriter(fstream);
				PrintWriter print = new PrintWriter(out);
				int count = 0;
				for (CategoryTrafficRecord rec : trafficCategoriesLinks){
					if (!rec.isSensor && Collections.binarySearch(sslLinks, (int)rec.sensorOrLinkId) >= 0){
						count++;
						print.println(rec.sensorOrLinkId + " " + rec.time + " " + rec.trafficCondition);
					}
				}
				System.out.println("Wrote " + count + " link category records to file.");
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

			// write class records for all sensors 
			try {
				FileWriter fstream = new FileWriter("debugdata/CatTrafficSensor.dat");
				BufferedWriter out = new BufferedWriter(fstream);
				PrintWriter print = new PrintWriter(out);
				int count = 0;
				for (CategoryTrafficRecord rec : trafficCategoriesSensor){
					if (rec.isSensor && Collections.binarySearch(sslSensors, (int)rec.sensorOrLinkId) >= 0
							&& validSensors.contains(rec.sensorOrLinkId)){
						count++;
						print.println(rec.sensorOrLinkId + " " + rec.time + " " + rec.trafficCondition);
					}
				}
				System.out.println("Wrote " + count + " sensor category records to file.");
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

			// write positions for all sensors
			try {
				String sparql = "" 
					+ "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\n"
					+ "PREFIX lud: <http://www.linkingurbandata.org/onto/ama/>\n"
					+ "SELECT ?pfrom1 ?pfrom2 ?pto1 ?pto2 ?sensor\n"
					+ "WHERE {?sensor rdf:type lud:TrafficSensor ;\n"
					+ " lud:linkedWith ?link .\n"
					+ "?link lud:lTo ?n1 ;\n"
					+ "lud:lFrom ?n2 .\n"
					+ "?n1 lud:gbLat ?pfrom1; lud:gbLong ?pfrom2 .\n"
					+ "?n2 lud:gbLat ?pto1; lud:gbLong ?pto2 . }";				
				CloseableIterator<Binding> iter = myConn.executeSelect(new SPARQLQueryImpl(sparql)).iterator();

				FileWriter fstream = new FileWriter("debugdata/SensorLocation.dat");
				BufferedWriter out = new BufferedWriter(fstream);
				PrintWriter print = new PrintWriter(out);
				int count = 0;
				while (iter.hasNext()){
					Binding b = iter.next();
					count++;
					print.println(
							extractSensorID(b.getValues().get(4).toString()) + " " + 
							( ((Literal)b.getValues().get(0)).doubleValue() + ((Literal)b.getValues().get(2)).doubleValue())/2
							+ " " + 
							( ((Literal)b.getValues().get(1)).doubleValue() + ((Literal)b.getValues().get(3)).doubleValue())/2);
				}
				iter.close();
				System.out.println("Wrote " + count + " sensor locations to file.");
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			

			// wrote positions for all links
			try {
				String sparql = "" 
					+ "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\n"
					+ "PREFIX lud: <http://www.linkingurbandata.org/onto/ama/>\n"
					+ "SELECT ?pfrom1 ?pfrom2 ?pto1 ?pto2 ?link\n"
					+ "WHERE {?link lud:lTo ?n1 ;\n"
					+ "lud:lFrom ?n2 .\n"
					+ "?n1 lud:gbLat ?pfrom1; lud:gbLong ?pfrom2 .\n"
					+ "?n2 lud:gbLat ?pto1; lud:gbLong ?pto2 . }";				
				CloseableIterator<Binding> iter = myConn.executeSelect(new SPARQLQueryImpl(sparql)).iterator();

				FileWriter fstream = new FileWriter("debugdata/LinkLocation.dat");
				BufferedWriter out = new BufferedWriter(fstream);
				PrintWriter print = new PrintWriter(out);
				int count = 0;
				while (iter.hasNext()){
					Binding b = iter.next();
					count++;
					print.println(
							extractLinkID(b.getValues().get(4).toString()) + " " + 
							((Literal)b.getValues().get(0)).doubleValue() + " " + 
							((Literal)b.getValues().get(1)).doubleValue() + " " + 
							((Literal)b.getValues().get(2)).doubleValue() + " " + 
							((Literal)b.getValues().get(3)).doubleValue());
				}
				iter.close();
				System.out.println("Wrote " + count + " link locations to file.");
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}					
		}

	}

	// *************************** END TEST CODE ************************************************

	public URI getIdentifier() {
		return new URIImpl("urn:" + this.getClass().getName());
	}

	public QoSInformation getQoSInformation() {
		// TODO Auto-generated method stub
		return null;
	}

	public Context createContext() {
		// TODO Auto-generated method stub
		return null;
	}

	public void initialise() {
		// TODO Auto-generated method stub

	}

	public void shutdown() {
		// TODO Auto-generated method stub

	}
}
