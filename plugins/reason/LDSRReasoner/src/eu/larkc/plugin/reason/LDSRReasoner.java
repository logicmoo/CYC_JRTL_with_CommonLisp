package eu.larkc.plugin.reason;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.openrdf.model.Statement;
import org.openrdf.model.URI;
import org.openrdf.model.Value;
import org.openrdf.model.impl.StatementImpl;
import org.openrdf.model.impl.URIImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import eu.larkc.core.data.BooleanInformationSet;
import eu.larkc.core.data.CloseableIterator;
import eu.larkc.core.data.DataFactoryImpl;
import eu.larkc.core.data.SetOfStatements;
import eu.larkc.core.data.SetOfStatementsImpl;
import eu.larkc.core.data.VariableBinding;
import eu.larkc.core.data.VariableBindingImpl;
import eu.larkc.core.data.VariableBinding.Binding;
import eu.larkc.core.data.VariableBindingImpl.BindingRow;
import eu.larkc.core.qos.QoSInformation;
import eu.larkc.core.query.SPARQLQuery;
import eu.larkc.plugin.Context;
import eu.larkc.plugin.Contract;

public class LDSRReasoner implements Reasoner {
	
	private static Logger _log = LoggerFactory.getLogger(LDSRReasoner.class);

	public LDSRReasoner() {
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

	@Override
	public URI getIdentifier() {
		return new URIImpl("urn:" + this.getClass().getName());
	}

	@Override
	public QoSInformation getQoSInformation() {
		// TODO Auto-generated method stub
		return null;
	}

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		
		_log.info("Starting reasoner...");
	
		String sparqlQuery = "PREFIX dbp-ont: <http://dbpedia.org/ontology/> " +
				"PREFIX dbp-prop: <http://dbpedia.org/property/> " +
				"PREFIX skos: <http://www.w3.org/2004/02/skos/core#> " +
				"PREFIX dbpedia: <http://dbpedia.org/resource/> " +
				"PREFIX dbp-cat: <http://dbpedia.org/resource/Category:> " +
				"SELECT distinct ?Country ?City " +
				"WHERE {   ?Country dbp-ont:capital ?City . " +
				"?City skos:subject dbp-cat:Capitals_in_Europe . " +
				"?Country dbp-ont:governmenttype dbpedia:Parliamentary_republic .}";
		
		_log.info("Using '"+sparqlQuery+"' as input");
		
		SPARQLQuery inputQuery = DataFactoryImpl.INSTANCE.createSPARQLQuery(sparqlQuery);
		
		List<Statement> allStatements = new ArrayList<Statement>();
		
		URI uri = new URIImpl("http://dbpedia.org/resource/Amelia_Heinle");
		URI uri1 = new URIImpl("http://dbpedia.org/resource/Purple_People_Eater");
		URI uri2 = new URIImpl("http://dbpedia.org/resource/Claude_Fauchet_(historian)");
		URI uri3 = new URIImpl("http://dbpedia.org/resource/Naval_Air_Station_Pensacola");
		
		Value value = new URIImpl("http://0.8306754");
		Value value1 = new URIImpl("http://0.83837366");
		Value value2 = new URIImpl("http://0.8492048");
		Value value3 = new URIImpl("http://0.8409036");
		
		Statement statement = new StatementImpl(null, uri, value);
		Statement statement1 = new StatementImpl(null, uri1, value1);
		Statement statement2 = new StatementImpl(null, uri2, value2);
		Statement statement3 = new StatementImpl(null, uri3, value3);
		
		allStatements.add(statement); 
		allStatements.add(statement1); 
		allStatements.add(statement2); 
		allStatements.add(statement3); 
		
		SetOfStatementsImpl sos = new SetOfStatementsImpl( allStatements );
		
		_log.info("Beginning reasoning...");
		LDSRReasoner reasoner = new LDSRReasoner();
		
		reasoner.sparqlSelect(inputQuery, sos, null, null);
	}

	@Override
	public BooleanInformationSet sparqlAsk(SPARQLQuery theQuery,
			SetOfStatements theSetOfStatements, Contract contract,
			Context context) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SetOfStatements sparqlConstruct(SPARQLQuery theQuery,
			SetOfStatements theSetOfStatements, Contract contract,
			Context context) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SetOfStatements sparqlDescribe(SPARQLQuery theQuery,
			SetOfStatements theSetOfStatements, Contract contract,
			Context context) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public VariableBinding sparqlSelect(SPARQLQuery theQuery,
			SetOfStatements theSetOfStatements, Contract contract,
			Context context) 
	{
		if (!(theQuery instanceof SPARQLQuery))
			return null;
		
		String queryAsString = theQuery.toString();
		
		//Store query to file
		try {
			FileWriter fstream = new FileWriter("query.txt");
			
			BufferedWriter out = new BufferedWriter(fstream);
			    
			out.write(queryAsString);
			
			out.flush();
			out.close();
			    
		} catch (IOException e) {
			e.printStackTrace();
		}
       
		//Store sos to file
		try {
			FileWriter fstream = new FileWriter("weight.txt");
			
			BufferedWriter out = new BufferedWriter(fstream);
			
			CloseableIterator<Statement> itInput = theSetOfStatements.getStatements();
			
			while( itInput.hasNext() ) {
				Statement statement = itInput.next();
			
				String uri = statement.getPredicate().stringValue();
				String value = statement.getObject().stringValue().substring(7);
				
				out.write(uri+"\t"+value+"\n");
				out.flush();
			}
			
			out.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//TODO:copy them to remote server
		
		//TODO:execute script
		
		//TODO:download file
		
		//Deserialize file to variable bindings
		try {
			
			List<Binding> bindings = new ArrayList<Binding>();
			List<String> variables = new ArrayList<String>();
			
			FileInputStream fstream = new FileInputStream("results.txt");
			
			DataInputStream in = new DataInputStream(fstream);
		    BufferedReader br = new BufferedReader(new InputStreamReader(in));
		    
		    String strLine;
		    
		    while ((strLine = br.readLine()) != null)   {
		      String[] split = strLine.split(";");
		      
		      if(split != null &&
		    	 split.length == 2)
		      {
					variables.add(split[0]);
					
					BindingRow bindingRow = new VariableBindingImpl.BindingRow();
					bindingRow.addValue(new URIImpl(split[1]));
					bindings.add(bindingRow);
		      }
		      else
		      {
		    	  //warn
		      }
		    }
		    
		    in.close();
		    
		    return new VariableBindingImpl(bindings, variables);
		    
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
		return null;
	}
}
