package eu.larkc.plugin.select.interest;


import java.io.File;
import java.util.*;

import org.openrdf.model.Statement;
import org.openrdf.model.URI;

import org.openrdf.model.impl.LiteralImpl;
import org.openrdf.model.impl.StatementImpl;
import org.openrdf.model.impl.URIImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import eu.larkc.core.data.CloseableIterator;
import eu.larkc.core.data.LabelledGroupOfStatements;
import eu.larkc.core.data.RdfGraph;
import eu.larkc.core.data.SetOfStatementsImpl;
import eu.larkc.core.data.VariableBinding;
import eu.larkc.core.data.VariableBinding.Binding;

import eu.larkc.core.data.*;
import eu.larkc.core.data.util.*;
import eu.larkc.core.qos.QoSInformation;
import eu.larkc.core.query.SPARQLQuery;
import eu.larkc.core.query.SPARQLQueryImpl;
import eu.larkc.plugin.Context;
import eu.larkc.plugin.Contract;

import eu.larkc.plugin.select.Selecter;


/**
 * This is a selecter based on user interest , from WICI 
 * @author Yan Wang, Yi Zeng
 *
 */
public class InterestBasedSelecter implements Selecter {

	private ContextImpl contextimpl;
	private UserInterests userInterests;

	String uiDataUri;
	String userUri;
	String IRP;

	SPARQLQuery refinedQuery;

	public InterestBasedSelecter() {
	}

	public InterestBasedSelecter(String interests, String iRP) {
		super();
		this.userInterests = new UserInterests(interests);
		IRP = iRP;
		contextimpl = new ContextImpl(userInterests, IRP);

	}

	public InterestBasedSelecter(String uiDataUri, String userUri, String iRP) {
		super();
		this.uiDataUri = uiDataUri;
		this.userUri = userUri;
		IRP = iRP;
		contextimpl = new ContextImpl(uiDataUri,userUri,IRP);

	}

	
	@Override
	public Context createContext() {
		return contextimpl;
	}

	@Override
	public void initialise() {
		userInterests = contextimpl.getUserInterests();
	}

	@Override
	public SetOfStatements select(SetOfStatements theSetOfStatements,
			Contract contract, Context context) {		
//		Logger log = LoggerFactory.getLogger(InterestBasedSelecter.class);
		printSize_SetOfStatements("number of original statements:",theSetOfStatements);
		RdfStoreConnection con = DataFactory.INSTANCE.createRdfStoreConnection();

		/**
		 * FIXME: This is a quick optimisation that ensures all data is in the repository
		 */

		if (theSetOfStatements instanceof RdfStoreConnection == false) {
			CloseableIterator<Statement> i = theSetOfStatements.getStatements();
			Random r = new Random();			
			URI g = new URIImpl("http://InterestBasedSelecter/" + r.nextInt());
			while (i.hasNext()) {
				Statement s = i.next();
				con.addStatement(s.getSubject(), s.getPredicate(), s.getObject(),
						g);
			}
		}
		/**
		 * FIXME: End fixme.
		 */
		
		LabelledGroupOfStatements lgs = con.createLabelledGroupOfStatements();

		Random r = new Random();			
		URI ng = new URIImpl("http://InterestBasedSelecter/selection/" + r.nextInt());
		
		List<Statement> stList = new ArrayList();

		SPARQLQuery query = contextimpl.creatSingleQueryToGetSubset();
		SetOfStatements sts = con.executeConstruct(query);
		System.out.println("query" + query);
		CloseableIterator<Statement> iter = sts.getStatements();
		while (iter.hasNext()) {
			Statement st = iter.next();
			
//			lgs.includeStatement(st);	//*1

//			stList.add(new StatementImpl(st.getSubject(), st.getPredicate(), st
//					.getObject()));		//*2
			con.addStatement(st.getSubject(), st.getPredicate(),
					st.getObject(), ng);
		}

//		printSize_SetOfStatements("number of selected statements:",lgs);	//*1
//		return lgs;						//*1

			
//		log.info("number of selected statements:" + stList.size());		//*2	
//		return 	new SetOfStatementsImpl(stList);						//*2

		ArrayList<URI> graphs = new ArrayList<URI>();		//*3S
		graphs.add(ng);
		DataSet dataset = con.createDataSet(graphs, null);
		printSize_SetOfStatements("number of selected statements:", dataset);
		return dataset;										//*3E
	}
	
	public void innerTest_QueryOnSelection(SetOfStatements sts){
		Logger log = LoggerFactory.getLogger(InterestBasedSelecter.class);

		final String NEW_LINE = System.getProperty( "line.separator" );
		String queryString = 
			"PREFIX pubmed:  <http://linkedlifedata.com/resource/pubmed/>"+ NEW_LINE +
				"SELECT ?articleTitle ?year"+ NEW_LINE +
				"WHERE {"+ NEW_LINE +
				"?article pubmed:hasYear ?year ."+ NEW_LINE +
				"?article pubmed:hasArticleTitle ?articleTitle ."+ NEW_LINE + 
				"FILTER regex(?articleTitle,'disease','i')"+ NEW_LINE +
				"} ORDERBY DESC(?year)";		
		
		SPARQLQuery query =  DataFactory.INSTANCE.createSPARQLQuery(queryString);

		VariableBinding vb= new SPARQLQueryExecutor().executeSelect(query, sts);

		CloseableIterator<Binding> iter = vb.iterator();
		
		int i=0;
		while (iter.hasNext()) {
			Binding s = iter.next();
			log.info(i+s.toString());
			i++;
		}
		log.info("number of answers:" + i);		
	}

	public void innerTest_QueryOnSelection(RdfStoreConnection con){
		Logger log = LoggerFactory.getLogger(InterestBasedSelecter.class);

		final String NEW_LINE = System.getProperty( "line.separator" );
		String queryString = 
			"PREFIX pubmed:  <http://linkedlifedata.com/resource/pubmed/>"+ NEW_LINE +
				"SELECT ?articleTitle ?year"+ NEW_LINE +
				"WHERE {"+ NEW_LINE +
				"?article pubmed:hasYear ?year ."+ NEW_LINE +
				"?article pubmed:hasArticleTitle ?articleTitle ."+ NEW_LINE + 
				"FILTER regex(?articleTitle,'disease','i')"+ NEW_LINE +
				"} ORDERBY DESC(?year)";		

//		RdfGraph g = DataFactory.INSTANCE.createRdfGraph(allStatements, label);
		String labelString1 = "http://labelledgroup.interest-based.subset.";
		URI label1 = new URIImpl(labelString1);

		String temp ="http://temp";
		con.addStatement(new URIImpl(temp),new URIImpl(temp),new URIImpl(temp),new URIImpl(temp), label1);
		LabelledGroupOfStatements lgs = con.createLabelledGroupOfStatements(label1);
//		lgs.excludeStatement(null, null, null, null);
//		for(Statement theStatement:allStatements)
//			lgs.includeStatement(theStatement);
		
		VariableBinding vb= new SPARQLQueryExecutor().executeSelect(new SPARQLQueryImpl(queryString), lgs);
//		VariableBinding vb= new SPARQLQueryExecutor().executeSelect(new SPARQLQueryImpl(queryString), new SetOfStatementsImpl( allStatements ));
	
		CloseableIterator<Binding> iter = vb.iterator();
		
		int i=0;
		while (iter.hasNext()) {
			Binding s = iter.next();
			log.info(i+s.toString());
			i++;
		}
		log.info("number of answers:" + i);		
	}
	
	public void printSize_SetOfStatements(String info, SetOfStatements theSetOfStatements){
		Logger log = LoggerFactory.getLogger(InterestBasedSelecter.class);
		
		CloseableIterator<Statement> sts0 = theSetOfStatements.getStatements();
		int n=0;
		while(sts0.hasNext()){
			sts0.next();
			n++;
		}
		log.info(info + n);	
	}
	
	public void printQuery(SPARQLQuery query) {
		Logger log = LoggerFactory.getLogger(InterestBasedSelecter.class);
		log.info("" + query.toString());
	}
	
	public void printUserInterests(Context context) {
		Logger log = LoggerFactory.getLogger(InterestBasedSelecter.class);
		if(context!=null){
			ContextImpl contextimpl=(ContextImpl)context;		
			log.info("" + contextimpl.userInterests.interests);
		}else{
			log.info("context is null!");
		}
	}
	

	
	@Override
	public void shutdown() {
	}
	
	@Override
	public URI getIdentifier() {
		return new URIImpl("urn:" + this.getClass().getName());
	}

	@Override
	public QoSInformation getQoSInformation() {
		// TODO Auto-generated method stub
		return null;
	}

}
