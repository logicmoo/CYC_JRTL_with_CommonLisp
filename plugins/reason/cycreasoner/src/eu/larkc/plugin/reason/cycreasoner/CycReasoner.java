package eu.larkc.plugin.reason.cycreasoner;

import java.io.IOException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.opencyc.api.CycAccess;
import org.opencyc.api.CycApiException;
import org.opencyc.cycobject.CycConstant;
import org.opencyc.cycobject.CycList;
import org.openrdf.model.Statement;
import org.openrdf.model.URI;
import org.openrdf.model.impl.URIImpl;
import org.openrdf.query.algebra.StatementPattern;
import org.openrdf.query.algebra.Var;
import org.openrdf.query.algebra.helpers.StatementPatternCollector;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import eu.larkc.core.data.BooleanInformationSet;
import eu.larkc.core.data.CloseableIterator;
import eu.larkc.core.data.SetOfStatements;
import eu.larkc.core.data.VariableBinding;
import eu.larkc.core.data.VariableBindingImpl;
import eu.larkc.core.data.VariableBinding.Binding;
import eu.larkc.core.data.VariableBindingImpl.BindingRow;
import eu.larkc.core.qos.QoSInformation;
import eu.larkc.core.query.SPARQLQuery;
import eu.larkc.core.query.SPARQLQueryImpl;
import eu.larkc.plugin.Context;
import eu.larkc.plugin.Contract;
import eu.larkc.plugin.reason.Reasoner;

/**
 * Reasoner plug-in, which transfers Reasoning requests to the ResearchCyc reasoner
 * @author Blaz Fortuna, Luka Bradesko
 */
public class CycReasoner implements Reasoner {

	// link to research cyc
	private static String researchCycServerIP = "shodan.ijs.si";
	private static int researchCycServerPort = 3600;
		
	private CycAccess ca;
	private HashMap inferenceParams = new HashMap();
	private CycConstant mtAll;
	private CycConstant onlineNewsArticle;
	private CycConstant predicate;
	private CycConstant business;
	private CycConstant thing;
	private CycConstant universalMt;
	private CycConstant mentionedInArticle;
	
	private String prefix = "http://www.cycfoundation.org/concepts/";
	
	private void init(String cycServer, int serverPort) {
        // prepare connection stuff
		Logger log = LoggerFactory.getLogger(CycReasoner.class);
		try {
			log.info("Connecting to cyc ...");
			ca = new CycAccess(cycServer, serverPort);
			mtAll = ca.makeCycConstant("InferencePSC");
			universalMt = ca.makeCycConstant("BaseKB");
			onlineNewsArticle = ca.makeCycConstant("OnlineNewsArticle");
			predicate = ca.makeCycConstant("Predicate");
			business = ca.makeCycConstant("Business");
			thing = ca.makeCycConstant("Thing");
			//new consts
			mentionedInArticle = ca.makeCycConstant("mentionedInArticle");
			ca.assertIsa(mentionedInArticle, predicate);
			ca.assertArgIsa(mentionedInArticle, 1, thing);
			ca.assertArgIsa(mentionedInArticle, 2, onlineNewsArticle);
			ca.assertGaf(universalMt, ca.makeCycConstant("arity"), mentionedInArticle, 2);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (CycApiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public CycReasoner() {
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
	
	public String getCycConst(String uriStr) throws UnknownHostException, IOException {
		Logger log = LoggerFactory.getLogger(CycReasoner.class);
		if (uriStr.length() > prefix.length() && 
			uriStr.subSequence(0, prefix.length()).equals(prefix)) {
				return "#$" + uriStr.substring(prefix.length());
		} else {
			CycList query = ca.makeCycList(
					"(#$urlOfCW ?X (#$URLFn \"" + uriStr + "\"))");
			CycList answer = ca.askNewCycQuery(query, mtAll, inferenceParams);
			if (!answer.isEmpty()) {
				String cycConst = ((CycList)((CycList)answer.get(0)).get(0)).getDottedElement().toString();
				log.info(" - " + cycConst);
				return "#$" + cycConst;
			}
		}
		return uriStr;
	}
	
	public String getCycQueryStr(Var var) throws UnknownHostException, IOException {
		if (var.hasValue()) {
			return getCycConst(var.getValue().stringValue());
		} else { 
			return "?" + var.getName();
		}
	}

	@Override
	public VariableBinding sparqlSelect(SPARQLQuery theQuery,
			SetOfStatements theSetOfStatements, Contract contract,
			Context context) {
		Logger log = LoggerFactory.getLogger(CycReasoner.class);
				
		if (theSetOfStatements == null) { return null; }
		
		// connecting to cyc
		init(researchCycServerIP, researchCycServerPort);

	    try {
	    	log.info("Reasoning ...");
	    	// load assertion
	    	String articleId = null;
	    	CloseableIterator<Statement> iter = theSetOfStatements.getStatements();
	    	while (iter.hasNext()) {
	    		Statement stat = iter.next();	    		
	    		CycConstant subjectCycConst = ca.makeCycConstant(
	    				getCycConst(stat.getSubject().stringValue()));
	    		CycConstant predicatCycConst = ca.makeCycConstant(
	    				getCycConst(stat.getPredicate().stringValue()));
	    		CycConstant objectCycConst = ca.makeCycConstant(
	    				getCycConst(stat.getObject().stringValue()));
	    		ca.assertGaf(universalMt, predicatCycConst, subjectCycConst, objectCycConst);
	    		// remember 
    			if (articleId == null) { articleId = getCycConst(stat.getObject().stringValue()); }
	    		log.info("Cyc Asserting: " + subjectCycConst + ", " + predicatCycConst + ", " + objectCycConst);
	    	}
	    	
	    	// translate query (we assume query is a sparql query)
			if (theQuery instanceof SPARQLQueryImpl) {
				SPARQLQuery sparqlQuery = (SPARQLQuery)theQuery;
				StatementPatternCollector spc = new StatementPatternCollector();
				((SPARQLQueryImpl)sparqlQuery).getParsedQuery().getTupleExpr().visit(spc);
				StringBuilder cycQuery = new StringBuilder();
				// we iterate over all the triple patterns and extract ones with links
				cycQuery.append("(#$and ");
				for (StatementPattern sp : spc.getStatementPatterns()) {
					cycQuery.append('(');
					cycQuery.append(getCycQueryStr(sp.getPredicateVar()));
					cycQuery.append(' ');
					cycQuery.append(getCycQueryStr(sp.getSubjectVar()));
					cycQuery.append(' ');
					cycQuery.append(getCycQueryStr(sp.getObjectVar()));
					cycQuery.append(')');
				}
				cycQuery.append(')');				

		    	CycList query = ca.makeCycList(cycQuery.toString());
		    	log.info("Cyc query: " + query);
		    	CycList answer = ca.askNewCycQuery(query, mtAll, inferenceParams);
				log.info("Cyc answer: " + answer);
			
				List<Binding> bindings = new ArrayList<Binding>();
				List<String> variables = new ArrayList<String>();
				
				if (!answer.isEmpty()) { 				
					// read headers
					CycList headerRow = (CycList)answer.get(0);
					int headerCols = headerRow.size();
					for (int colN = 0; colN < headerCols; colN++) {
						String var = ((CycList)headerRow.get(colN)).get(0).toString();
						var = var.substring(1, var.length());
						variables.add(var);
						log.info(var);
					}
					
					// read values
					int rows = answer.size();
					for (int rowN = 0; rowN < rows; rowN++) {
						CycList row = (CycList)answer.get(rowN);
						int cols = row.size();
						boolean ignoreRow = false;
						BindingRow bindingRow = new VariableBindingImpl.BindingRow();
						for (int colN = 0; colN < cols; colN++) {
							CycList cycVal = (CycList)row.get(colN);
							if (cycVal.getDottedElement() != null) {
								String val = cycVal.getDottedElement().toString();
								bindingRow.addValue(new URIImpl(prefix + val));
								log.info(val);
							} else {
								ignoreRow = true;
							}
						}
						if (!ignoreRow) {
							bindings.add(bindingRow);
						}						
					}
				}
				
				return new VariableBindingImpl(bindings, variables);
			} else {
				return null;			
			}
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (CycApiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		return null;
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

	//Binding classes
	/**
	 * @author: Luka Bradesko
	 * 
	 */


}
