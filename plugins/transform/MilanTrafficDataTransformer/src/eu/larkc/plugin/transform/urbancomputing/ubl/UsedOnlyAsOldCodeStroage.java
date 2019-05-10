package eu.larkc.plugin.transform.urbancomputing.ubl;

public class UsedOnlyAsOldCodeStroage {

}


////display fields
//for (int i = 0; i < rsm.getColumnCount(); i++) {
//	System.out.print(rsm.getColumnLabel(i+1) + "    ");
//}
//System.out.println("");
//
//int count = 0;
//long currStamp1 = 0;
//long currStamp2 = 0;
//URI graphname = null;
//GregorianCalendar time = null;
//while (rs.next())
//{
//	float flow = rs.getFloat("flow");
//	float speed = rs.getFloat("speed");
//	
//	// kick out invalid sensors:
//	// a) if flow = 0, then speed is arbitrary
//	// b) if speed is exactly 0 over a 5 min time interval, then probably the sensor is broken
//	// c) if speed is > 200km/h, this is implausible
//	if (flow == 0 || speed == 0 || speed > 200){ // check whether this is a valid time point
//		continue;
//	}
//	
//	count ++;
//	
//	// if time that is not seen before, create new named graph for all data records in that slot
//	if (rs.getInt("stamp2") != currStamp2){ // rs.getInt("stamp1") != currStamp1 || 
//		//currStamp1 = rs.getInt("stamp1");
//		currStamp1 = stamp1;
//		currStamp2 = rs.getInt("stamp2");
//		
//		time = (GregorianCalendar)basedate.clone();
////		time.add(Calendar.DATE,rs.getInt("stamp1"));
//		time.add(Calendar.DATE,(int)stamp1);
//		time.add(Calendar.MINUTE,(rs.getInt("stamp2")-1000)*5);
//	
//		graphname = myValues.createURI(TRAFFIC_RECORD.toString() + new XMLGregorianCalendarImpl(time)); 
//		resultSet.add(graphname);
//
//		myConn.addStatement(graphname,TIME_STAMP,myValues.createLiteral(new XMLGregorianCalendarImpl(time)),URBAN_DEFAULT_GRAPH);
//		myConn.addStatement(graphname,RDF.TYPE,TRAFFIC_RECORD,URBAN_DEFAULT_GRAPH);
//	}
//	
//	URI sensor = myValues.createURI(URBAN_NAMESPACE + "trafficsensor/sensor" + rs.getLong("id"));
//	
////	System.out.println("count = " + count + " Flow " + flow + " speed " + speed);
//	
//	myConn.addStatement(sensor,TRAFFIC_FLOW,myValues.createLiteral(flow),graphname);
//	myConn.addStatement(sensor,TRAFFIC_SPEED,myValues.createLiteral(speed),graphname);
//}
//rs.close();
//
//System.out.println("Added " + count + " traffic data records.");
//}
//



////*******************************************
////try to query traffic data for a given time slot
//
////We want the traffic information from when?
//GregorianCalendar timeOfInterest = (GregorianCalendar)GregorianCalendar.getInstance();
//timeOfInterest.add(Calendar.YEAR, -1);
//GregorianCalendar startInterval = (GregorianCalendar)timeOfInterest.clone();
//startInterval.add(Calendar.MINUTE,-5);
//
//String sparql2 = "Select ?link ?sensor ?speed ?g ?time where { graph ?g { "
//	+ "?sensor <" + TRAFFIC_SPEED + "> ?speed . "
//	+ "} . "
////	+ "?sensor <" + RDF.TYPE + "> <" + SENSOR_TYPE + "> . "
////	+ "?sensor <" + LINKED_WITH + "> ?link . "
//	+ "?g <" + RDF.TYPE + "> <" + TRAFFIC_RECORD + "> . "
//	+ "?g <" + TIME_STAMP + "> ?time . "
//	+ "FILTER (?time >= " + values.createLiteral(new XMLGregorianCalendarImpl(startInterval)) 
//				+ " && ?time <= " + values.createLiteral(new XMLGregorianCalendarImpl(timeOfInterest)) + ") "
//	+ "}";
//System.out.println(sparql2);
//
////sparql2 = "Select * where { ?g <" + RDF.TYPE + "> <" + TRAFFIC_RECORD + "> . "
////	+ "?g <" + TIME_STAMP + "> ?time . }";
//
//CloseableIterator<Binding> iter3 = con.executeSelect(new SPARQLQueryImpl(sparql2)).iterator();
//while (iter3.hasNext()){
//	Binding b = iter3.next();
//	System.out.println(b);
//}
//iter3.close();			



////*******************************************
////compute mean sensor speed for all sensors in a given street type
//String [] categories = {URBAN_NAMESPACE + "linktypes/SecondaryRoad", URBAN_NAMESPACE + "linktypes/LocalRoad", 
//		URBAN_NAMESPACE + "linktypes/MainRoad", URBAN_NAMESPACE + "linktypes/Highway"};
//
//double meanSpeed = 0;
//double meanSquareSpeed = 0;		
//int count = 0;
//
//for (int i = 0; i < categories.length; i++){
//	String sparql = "Select ?speed where { "
//		+ "?sensor <" + TRAFFIC_SPEED + "> ?speed . "
//		+ "?sensor <" + LINKED_WITH + "> ?link . "
//		+ "?link  <" + LINK_CATEGORY + "> <" + categories[i] + "> . "
//		+ "}";
//	
//	double meanSpeedCat = 0;
//	double meanSquareSpeedCat = 0;
//	int countCat = 0;
//	CloseableIterator<Binding> iter = myConn.executeSelect(new SPARQLQueryImpl(sparql)).iterator();
//	while (iter.hasNext()){
//		Binding b = iter.next();
//		countCat ++;
//		count ++;
//		double speed = ((Literal)b.getValues().get(0)).doubleValue(); 
//		meanSpeedCat += speed;
//		meanSquareSpeedCat += speed*speed;
//		meanSpeed += speed;
//		meanSquareSpeed += speed*speed;
//	}
//	iter.close();
//	
//	meanSpeedCat /= countCat;
//	meanSquareSpeedCat /= countCat;
//	double standardDeviationSpeedCat = Math.sqrt(meanSquareSpeedCat-meanSpeedCat*meanSpeedCat);
//	
//	// delete old mean speed statement from data layer
//	myConn.removeStatement(new URIImpl(categories[i]), MEAN_SPEED, null, null);
//	
//	// add new mean speed statement to data layer
//	myConn.addStatement(new URIImpl(categories[i]), MEAN_SPEED, myValues.createLiteral(meanSpeedCat), URBAN_DEFAULT_GRAPH);
//	System.out.println("Based on " + countCat + 
//			" examples mean speed for category " + categories[i] + 
//			" is " + meanSpeedCat + "(+-" + standardDeviationSpeedCat + ") km/h.");
//}
//meanSpeed /= count;
//meanSquareSpeed /= count;
//double standardDeviationSpeed = Math.sqrt(meanSquareSpeed-meanSpeed*meanSpeed);
//System.out.println("Based on " + count + " examples overall mean speed  is " 
//		+ meanSpeed + "(+-" + standardDeviationSpeed + ") km/h.");
//
////Prepare output
//DataSet ds = myConn.createDataSet(resultSet, null);
//
//
//return ds;
//}




////*****************  store results in RDF format ***********************************
//System.out.println("Writing traffic predictions for " + links.size() + " links to RDF store ...");
//for (String link : links.keySet()) {
//	int index = links.get(link).index;
//	double speed = result.get(index);
//	//			System.out.println("Link " + link + " has index " + index + " and speed " + speed + ".");
//	con.addStatement(new URIImpl(link),TRAFFIC_SPEED,values.createLiteral(speed),graphname);
//	con.addStatement(new URIImpl(link),LINK_INDEX,values.createLiteral(index),graphname);
//}
//
//Collection<URI> graphnames = new ArrayList<URI>();
//graphnames.add(graphname);
//for (RdfGraph graph : ds.getDefaultGraphs()) {
//	graphnames.add(graph.getName());
//}
//return con.createDataSet(graphnames, null);


//String sparqlx = ""
//+ "PREFIX lud: <http://www.linkingurbandata.org/onto/ama/>\n"
//+ "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\n"
//+ "SELECT ?g ?link ?o\n"
//+ "WHERE {?link rdf:type lud:Link \n"
//+ "graph ?g { ?link lud:speedCategory ?o . } . \n"
//+ "?g lud:TrafficRecordsFrom ?dfrom . \n"
//+ "?g lud:TrafficRecordsUntil ?duntil . \n"
//+ "FILTER(?dfrom <= " + ltime + " && ?duntil >= " + ltime + ")}";
//CloseableIterator<Binding> iterx = myConn.executeSelect(new SPARQLQueryImpl(sparqlx)).iterator();
//
//while (iterx.hasNext()){
//Binding b = iterx.next();
//System.out.println(b);
//}
//iterx.close();		
//