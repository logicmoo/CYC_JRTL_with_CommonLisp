/*
 * Copyright (C) 2008, 2009 Semantic Technology Institute (STI) Innsbruck, 
 * University of Innsbruck, Technikerstrasse 21a, 6020 Innsbruck, Austria.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package eu.larkc.plugin.reason.irisrulereasoner;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.Properties;

import javax.xml.datatype.DatatypeConstants;

import org.deri.iris.Configuration;
import org.deri.iris.EvaluationException;
import org.deri.iris.KnowledgeBaseFactory;
import org.deri.iris.ProgramNotStratifiedException;
import org.deri.iris.RuleUnsafeException;
import org.deri.iris.api.IKnowledgeBase;
import org.deri.iris.api.basics.IPredicate;
import org.deri.iris.api.basics.IQuery;
import org.deri.iris.api.basics.IRule;
import org.deri.iris.api.basics.ITuple;
import org.deri.iris.api.terms.IStringTerm;
import org.deri.iris.api.terms.ITerm;
import org.deri.iris.api.terms.IVariable;
import org.deri.iris.api.terms.concrete.IBase64Binary;
import org.deri.iris.api.terms.concrete.IBooleanTerm;
import org.deri.iris.api.terms.concrete.IDateTerm;
import org.deri.iris.api.terms.concrete.IDecimalTerm;
import org.deri.iris.api.terms.concrete.IDoubleTerm;
import org.deri.iris.api.terms.concrete.IDuration;
import org.deri.iris.api.terms.concrete.IFloatTerm;
import org.deri.iris.api.terms.concrete.IGDay;
import org.deri.iris.api.terms.concrete.IGMonth;
import org.deri.iris.api.terms.concrete.IGMonthDay;
import org.deri.iris.api.terms.concrete.IGYear;
import org.deri.iris.api.terms.concrete.IGYearMonth;
import org.deri.iris.api.terms.concrete.IHexBinary;
import org.deri.iris.api.terms.concrete.IIntegerTerm;
import org.deri.iris.api.terms.concrete.IIri;
import org.deri.iris.api.terms.concrete.ITime;
import org.deri.iris.compiler.Parser;
import org.deri.iris.compiler.ParserException;
import org.deri.iris.evaluation.IEvaluationStrategy;
import org.deri.iris.evaluation.stratifiedbottomup.StratifiedBottomUpEvaluationStrategyFactory;
import org.deri.iris.factory.Factory;
import org.deri.iris.facts.Facts;
import org.deri.iris.storage.IRelation;
import org.deri.iris.storage.IRelationFactory;
import org.deri.iris.storage.simple.SimpleRelationFactory;
import org.openrdf.model.Literal;
import org.openrdf.model.Statement;
import org.openrdf.model.URI;
import org.openrdf.model.Value;
import org.openrdf.model.ValueFactory;
import org.openrdf.model.impl.BNodeImpl;
import org.openrdf.model.impl.StatementImpl;
import org.openrdf.model.impl.URIImpl;
import org.openrdf.model.impl.ValueFactoryImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import eu.larkc.core.data.BooleanInformationSet;
import eu.larkc.core.data.BooleanInformationSetImpl;
import eu.larkc.core.data.CloseableIterator;
import eu.larkc.core.data.DataFactory;
import eu.larkc.core.data.RdfGraph;
import eu.larkc.core.data.SetOfStatements;
import eu.larkc.core.data.VariableBinding;
import eu.larkc.core.data.util.SPARQLQueryExecutor;
import eu.larkc.core.metadata.MetaData;
import eu.larkc.core.metadata.MetaDataImpl;
import eu.larkc.core.metadata.MethodMetaDataImpl;
import eu.larkc.core.qos.QoSInformation;
import eu.larkc.core.query.Query;
import eu.larkc.core.query.SPARQLQuery;
import eu.larkc.plugin.Context;
import eu.larkc.plugin.Contract;
import eu.larkc.plugin.reason.Reasoner;

/**
 * <p>
 * First (cheating) implementation of the IRIS rule based reasoner plugin. This
 * plugin applies several RDF entailment rules to the RDF triples using the IRIS
 * Datalog reasoner.
 * </p>
 * 
 * <p>
 * !!!WARNING!!! rdfp5a and rdfp5b generate problems when creating
 * triple(LITERAL, URI, LITERAL), since the first LITERAL has to be an URI
 * actually.
 * </p>
 */
public class IrisRuleBasedReasoner implements Reasoner {

	/* Configuration */
	public static final String EMPTY = "EMPTY"; // no IRIS reasoning
	public static final String L2_ENTAILMENT_RULES = "plugins/IrisRuleReasoner/files/L2_entailment.rules"; // l2
	// entailment
	// rules
	public static final String L2 = L2_ENTAILMENT_RULES; // l2 entailment rules
	public static final String RDF = "plugins/IrisRuleReasoner/files/RDF_entailment.rules"; // RDF
	// entailment
	// rules
	// TODO

	public static final String RDFS = "plugins/IrisRuleReasoner/files/RDFS_entailment.rules"; // RDFs
	// entailment
	// rules
	// TODO

	/* Iris Evaluation Strategy */
	public static final String BOTTOM_UP = "BOTTOM UP STRATEGY";
	public static final String TOPDOWN = "TOP DOWN STRATEGY";
//	private static String strategy = BOTTOM_UP;

	/* the entailment rules */
	private String entailmentRulesFile;

	/* allow blank nodes */
	private static boolean CALCULATE_BLANK_NODES = false;

	/* print Debug messages */
	// private static final boolean DEBUG = false;
	public static boolean DEBUG = false;

	/* if IRIS-rulebased reasoning is of */
	private boolean NOIRIS = false;

	/* the input query */
	private Query inputQuery;

	/* Member variables */
	private List<IRule> entailmentRules;
	private Configuration configuration;
	private SetOfStatements theIrisFactsSetOfStatements;

	/* Counters */
	private int statemRDF; // counts only if IRIS is

	/**
	 * Default constructor. Loads entailment rules from the L2_entailment.rules
	 * file.
	 */
	public IrisRuleBasedReasoner() {
		this(L2_ENTAILMENT_RULES);
	}

	/**
	 * Creates the IrisRuleBasedReasoner object and loads entailment rules from
	 * <code>filename</code>.
	 * 
	 * @param filename
	 *            path to entailment rules file
	 */
	public IrisRuleBasedReasoner(String filename) {
		this.statemRDF = 0;
		setEntailmentRules(filename);
		configuration = new Configuration();
	}

	public IrisRuleBasedReasoner(Properties parameters) {
		this.statemRDF = 0;
		setEntailmentRules( parameters.getProperty( "rules.filename" ) );
		configuration = new Configuration();
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

	/**
	 * To set the entailment rules - standard is L2 entailment rules.
	 * 
	 * 
	 * @param filename
	 *            the absolute filename of the rule file
	 */
	public void setEntailmentRules(String filename) {
		// Do this as a default if any other rule-loading fails
		Logger log = LoggerFactory.getLogger(IrisRuleBasedReasoner.class);
		setEntailmentRulesAsList(new ArrayList<IRule>());

		if (filename == null || filename.equals(EMPTY)) {
			if (DEBUG) {
			log.info("\nNo Rules set: performing all Querys without IRIS Reasoner.");
			}
//			NOIRIS = true;
			this.setEntailmentRulesAsList(new ArrayList<IRule>());
			this.entailmentRulesFile = "No entailment rules set!";
			return;
		}
		try {
			this.entailmentRulesFile = filename;
			setEntailmentRulesFromFile(filename);
			if (DEBUG) {
				log.info("\nUsing IRIS with entailment rules: "
						+ filename + ".\n");
			}
		} catch (IOException e) {
			System.err.println("Unable to load file " + filename);
		} catch (ParserException e) {
			System.err.println("Unable to parse entailment rules file "
					+ filename);
			System.err.println("There probably is a Datalog syntax error.");
			e.printStackTrace();
		}
	}

	/**
	 * 
	 */
	public BooleanInformationSet sparqlAsk(SPARQLQuery theQuery,
			SetOfStatements theSetOfStatements, Contract contract,
			Context context) {

		if (NOIRIS) {
			if (DEBUG) {
				System.out
						.println("Performing a simple reasoning - without IRIS.");
			}
			return new BooleanInformationSetImpl(new SPARQLQueryExecutor()
					.executeAsk(theQuery, theSetOfStatements));
		}
		createModel(theQuery, theSetOfStatements, contract);
		return new BooleanInformationSetImpl(new SPARQLQueryExecutor()
				.executeAsk(theQuery, theIrisFactsSetOfStatements));
	}

	/**
	 * 
	 */
	public SetOfStatements sparqlConstruct(SPARQLQuery theQuery,
			SetOfStatements theSetOfStatements, Contract contract,
			Context context) {
		if (NOIRIS) {
			if (DEBUG) {
				System.out
						.println("Performing a simple reasoning - without IRIS.");
			}
			return (new SPARQLQueryExecutor().executeConstruct(theQuery,
					theSetOfStatements));
		}
		createModel(theQuery, theSetOfStatements, contract);
		return new SPARQLQueryExecutor().executeConstruct(theQuery,
				theIrisFactsSetOfStatements);

	}

	/**
	 * 
	 */
	public SetOfStatements sparqlDescribe(SPARQLQuery theQuery,
			SetOfStatements theSetOfStatements, Contract contract,
			Context context) {
		return sparqlConstruct(theQuery, theSetOfStatements, contract, context);
	}

	/**
	 * 
	 */
	public VariableBinding sparqlSelect(SPARQLQuery theQuery,
			SetOfStatements theSetOfStatements, Contract contract,
			Context context) {
		if (NOIRIS) {
			if (DEBUG) {
				System.out
						.println("Performing a simple reasoning - without IRIS.");
			}
			return new SPARQLQueryExecutor().executeSelect(theQuery,
					theSetOfStatements);
		}
		createModel(theQuery, theSetOfStatements, contract);
		return new SPARQLQueryExecutor().executeSelect(theQuery,
				theIrisFactsSetOfStatements);
	}

	/**
	 * Create the SetOfStatements using IRIS, i.e. the stratified bottom up
	 * evaluation strategy is used to generate more triples by applying the
	 * given entailment rules.
	 * 
	 * @param theQuery
	 *            SPARQL query
	 * @param theTripleSet
	 *            set of triples
	 * @param contract
	 *            (not used in this version)
	 * @throws IOException
	 *             on failure
	 * @throws ParserException
	 *             on failure
	 */
	private void createModel(SPARQLQuery theQuery,
			SetOfStatements theTripleSet, Contract contract) {
		Logger log = LoggerFactory.getLogger(IrisRuleBasedReasoner.class);
		IEvaluationStrategy evaluationStrategy = null;
		try {
			Map<IPredicate, IRelation> facts = extractFacts(theTripleSet);
			// if (strategy.equals(IrisRuleBasedReasoner.TOPDOWN)) { // TODO
			// // OLDT evaluation strategy is a BETA implementation ! //
			// //evaluationStrategy = new OLDTEvaluationStrategy(facts,
			// this.getEntailmentRulesAsList(), configuration);
			//
			// } else {
			if (DEBUG) {
				System.out
						.println("Stratified bottom up evaluation strategy chosen.");
			}
			
			IKnowledgeBase kb = KnowledgeBaseFactory.createKnowledgeBase( facts, getEntailmentRulesAsList() );

			IPredicate triplePredicate = Factory.BASIC.createPredicate("triple", 3);
			IQuery query = Factory.BASIC.createQuery(Factory.BASIC.createLiteral(
							true, triplePredicate, Factory.BASIC.createTuple(Factory.TERM
									.createVariable("s"), Factory.TERM.createVariable("p"),
									Factory.TERM.createVariable("o"))));
			IRelation result = kb.execute( query );

//			StratifiedBottomUpEvaluationStrategyFactory bottomUpFactory = new StratifiedBottomUpEvaluationStrategyFactory();
//
//			// Create the IRIS evaluator using the triplets as facts and the
//			// given entailment rules as rules
//			evaluationStrategy = bottomUpFactory.createEvaluator(facts, this
//					.getEntailmentRulesAsList(), configuration);
//
//			IRelation result = getFullRelationFromIRIS(evaluationStrategy);
			assert (result != null) : "Result must not be null!";

			if (DEBUG) {
				log.info("IRIS result set:");
				for (int i = 0; i < result.size(); i++)
					log.info("  " + result.get(i));
				log.info("");
			}

			theIrisFactsSetOfStatements = createStatementsFromIrisRelation(result);

		} catch (EvaluationException e1) {
			// Something went wrong while evaluating the triples with IRIS
			e1.printStackTrace();
		}

	}

	/**
	 * Create a IRIS knowledge base (facts and rules, in this case, only facts)
	 * by extracting the RDF triplets from the given SetOfStatement and creating
	 * the appropriate IRIS facts. The generated facts have the form of
	 * 
	 * <pre>
	 * triple(S, P, O)
	 * </pre>
	 * 
	 * where S, P, O are subject, predicate, object as defined in the RDF graph.
	 * 
	 * @param theTripleSet
	 *            a SetOfStatements
	 * 
	 * @return an IRIS Facts object
	 */
	private Map<IPredicate, IRelation> extractFacts(SetOfStatements theTripleSet) {
		// 1) create IRIS knowledge base by converting rdf graph to IRIS
		// facts.
		Logger log = LoggerFactory.getLogger(IrisRuleBasedReasoner.class);

		CloseableIterator<org.openrdf.model.Statement> statementsIterator = theTripleSet
				.getStatements();

		IPredicate triplePredicate = Factory.BASIC.createPredicate("triple", 3);
		IRelationFactory srf = new SimpleRelationFactory();

		IRelation factRelation = srf.createRelation();

		while (statementsIterator.hasNext()) {
			statemRDF++;
			org.openrdf.model.Statement statement = (org.openrdf.model.Statement) statementsIterator
					.next();

			factRelation.add(convertRDFStatement2IrisTriple(statement));
		}
		if(DEBUG) {
			log.info("Read in " + statemRDF + " triples from SetOfStatements");
		}

		Map<IPredicate, IRelation> rawFacts = new HashMap<IPredicate, IRelation>();
		rawFacts.put(triplePredicate, factRelation);
		statementsIterator.close();
		statementsIterator = null;

		return rawFacts;
	}

	/**
	 * Creates the SetOfStatements from the IRIS results
	 * 
	 * @param result
	 * @return
	 */
	private SetOfStatements createStatementsFromIrisRelation(IRelation result) {
		Logger log = LoggerFactory.getLogger(IrisRuleBasedReasoner.class);
		List<org.openrdf.model.Statement> list = new ArrayList<org.openrdf.model.Statement>();
		for (int i = 0; i < result.size(); i++) {
			ITuple tup = result.get(i);
			try {
				Statement s = this.convertIrisTuple2RDFStatement(tup);
				list.add(s);
			} catch (IllegalTripleException e) {
				if (DEBUG) {
					log.info("Error converting ITuple : "
							+ tup.toString());
					e.printStackTrace();
				}
				// NOTE: Illegal triples will be IGNORED
				// Subject must be an URI!
			}

		}

		RdfGraph g = DataFactory.INSTANCE.createRdfGraph(list, new URIImpl(
				"http://www.example.com/IRISRuleBasedReasoner"));
		return (SetOfStatements) g;
	}

	/**
	 * Create a IRIS query <code>?- triple(?S, ?P, ?O)</code> and return the
	 * evaluation result
	 * 
	 * @param evaluationStrategy
	 *            the IRIS evaluation strategy used
	 * 
	 * @return relation containing all triples
	 * 
	 * @throws ProgramNotStratifiedException
	 *             if the program is not stratified
	 * @throws RuleUnsafeException
	 *             if the program contains unsafe rules
	 * @throws EvaluationException
	 *             on evaluation error
	 */
	private IRelation getFullRelationFromIRIS(
			IEvaluationStrategy evaluationStrategy)
			throws ProgramNotStratifiedException, RuleUnsafeException,
			EvaluationException {

		IRelation result = null;
		// Create IRIS query
		List<IVariable> outputVariables = new LinkedList<IVariable>();
		IPredicate triplePredicate = Factory.BASIC.createPredicate("triple", 3);
		IQuery query = Factory.BASIC.createQuery(Factory.BASIC.createLiteral(
				true, triplePredicate, Factory.BASIC.createTuple(Factory.TERM
						.createVariable("s"), Factory.TERM.createVariable("p"),
						Factory.TERM.createVariable("o"))));

		result = evaluationStrategy.evaluateQuery(query, outputVariables);
		return result;
	}

	private org.openrdf.model.Statement convertIrisTuple2RDFStatement(
			ITuple triple) {
		assert triple.size() == 3 : "Triple size must be 3.";

		ITerm s = triple.get(0);
		ITerm p = triple.get(1);
		ITerm o = triple.get(2);

		String pString = removeSingleQuotes(p.toString());
		String sString = removeSingleQuotes(s.toString());
		String oString = removeSingleQuotes(o.toString());

		if (s instanceof IIri) {
			if (o instanceof IIri) {
				return new StatementImpl(new URIImpl(sString), new URIImpl(
						pString), new URIImpl(oString));
			} else {
				Literal l = getLiteralIRIS2RDF(o, oString);
				return new StatementImpl(new URIImpl(sString), new URIImpl(
						pString), l);
			}

		} else {
			// Exception because Subject must be an URI (sameAS) still?
			if (!CALCULATE_BLANK_NODES) {
				throw new IllegalTripleException("Subject must be an URI.");
			}

			// changed: // TODO // NOTE:testing
			if (o instanceof IIri) {
				return new StatementImpl(new BNodeImpl(sString), new URIImpl(
						pString), new URIImpl(oString));
			}
			Literal l = getLiteralIRIS2RDF(o, oString);
			return new StatementImpl(new BNodeImpl(sString), new URIImpl(
					pString), l);

		}
	}

	/**
	 * Since the IRIS ITerm.toString() methods ALWAYS add a leading and trailing
	 * single quote, we simple remove them
	 * 
	 * @param str
	 * @return stripped string, with removed single quotes
	 */
	private String removeSingleQuotes(String str) {
		str = (String) ((str.startsWith("'") && str.endsWith("'")) ? str
				.subSequence(1, str.length() - 1) : str);
		return str;
	}

	/**
	 * Since the IRIS ITerm.toString() methods ALWAYS add a leading and trailing
	 * double quote, we simple remove them
	 * 
	 * @param str
	 * @return stripped string, with removed single quotes
	 */
	private String removeDoubleQuotes(String str) {
		str = (String) ((str.startsWith("\"") && str.endsWith("\"")) ? str
				.subSequence(1, str.length() - 1) : str);
		return str;
	}

	/**
	 * Converts Literals from IRIS to RDF form
	 * 
	 * @param iterm
	 *            , resource String, jenaModel
	 * @return RDF TypedLiteral
	 */
	public Literal getLiteralIRIS2RDF(ITerm iterm, String resString) {
		Logger log = LoggerFactory.getLogger(IrisRuleBasedReasoner.class);
		resString = removeDoubleQuotes(resString);
		ValueFactory vfact = new ValueFactoryImpl();
		if (DEBUG) {
			Class<?> clazz = iterm.getClass();
			log.info("IRIS -> RDF CLASS: " + clazz + " VALUE: "
					+ resString);
		}
		if (iterm instanceof IIntegerTerm) {
			if (DEBUG)
				log.info("IntegerTerm " + iterm.toString());
			return vfact.createLiteral(Integer.parseInt(resString));
		}
		if (iterm instanceof IStringTerm) {
			if (DEBUG)
				log.info("StringTerm " + iterm.toString()
						+ " ; resString: " + resString);
			return vfact.createLiteral(resString);
		}
		if (iterm instanceof IFloatTerm) {
			if (DEBUG)
				log.info("FloatTerm " + iterm.toString());
			return vfact.createLiteral(Float.parseFloat(resString));
		}
		if (iterm instanceof IDoubleTerm) {
			if (DEBUG)
				log.info("DoubleTerm " + iterm.toString());
			return vfact.createLiteral(Double.parseDouble(resString));
		}
		if (iterm instanceof IBooleanTerm) {
			if (DEBUG)
				log.info("BooleanTerm " + iterm.toString());
			return vfact.createLiteral(Boolean.parseBoolean(resString));
		}
		if (iterm instanceof IDecimalTerm) {
			if (DEBUG)
				log.info("DecimalTerm " + iterm.toString());
			return vfact.createLiteral(Double.parseDouble(resString));
		}
		if (iterm instanceof IBase64Binary) {
			if (DEBUG)
				log.info("Base64Binary " + iterm.toString());
			// TODO base64binary
		}
		if (iterm instanceof IDateTerm) {
			if (DEBUG)
				log.info("IDateTerm " + iterm.toString());
			IDateTerm dt = (IDateTerm) iterm;
			Calendar c = Calendar.getInstance();
			c.set(dt.getYear(), dt.getMonth(), dt.getDay(), 0, 0);
			return vfact.createLiteral(dt.getValue());
		}
		if (iterm instanceof IDuration) {
			// IDuration dt = (IDuration) iterm;
			// TODO duration
		}

		if (iterm instanceof IGDay) {
			// IGDay g = (IGDay) iterm;
			// TODO GDay
			// return vfact.
		}
		if (iterm instanceof IGMonth) {
			// TODO IGMonth
			// return vfact.
		}
		if (iterm instanceof IGYear) {
			// TODO IGYear
			// return vfact.
		}
		if (iterm instanceof IGMonthDay) {
			// TODO IGMonthDay
			// return vfact.
		}
		if (iterm instanceof IGYearMonth) {
			// TODO IGYearMonth
			// return vfact.
		}
		if (iterm instanceof IHexBinary) {
			// TODO IHexBinary
			// return vfact.
		}
		if (iterm instanceof ITime) {
			// TODO ITime
			// return vfact.
		}
		// returns StringType if not found
		if (DEBUG)
			log.info("Datatype not yet supported: "
					+ iterm.toString() + ". Returns string value.");
		return vfact.createLiteral(resString);
	}

	/**
	 * 
	 * @param rdfStatement
	 * @return the ITuple
	 */
	public ITuple convertRDFStatement2IrisTriple(
			org.openrdf.model.Statement rdfStatement) {
		org.openrdf.model.Resource s = rdfStatement.getSubject();
		org.openrdf.model.Resource p = rdfStatement.getPredicate();
		Value o = rdfStatement.getObject();

		ITuple triple = Factory.BASIC.createTuple(convertToIrisTerm(s),
				convertToIrisTerm(p), convertToIrisTerm(o));

		return triple;

	}

	/**
	 * Converts Object Values to IRIS Terms
	 * 
	 * @param ObjectValue
	 * @return IRIS Term (Literal)
	 */
	public ITerm convertToIrisTerm(Value oVal) {
		Logger log = LoggerFactory.getLogger(IrisRuleBasedReasoner.class);
		if (oVal instanceof org.openrdf.model.URI) {
			try {
				return Factory.CONCRETE.createIri(oVal.toString());
			} catch (Exception e) {
				if (DEBUG) {
					System.err
							.println("Unable to create IRIS IRI from RDF resource "
									+ oVal);
					e.printStackTrace();
				}
			}
		}

		// TODO blank nodes
		if (CALCULATE_BLANK_NODES && oVal instanceof org.openrdf.model.BNode) {
			org.openrdf.model.BNode bnode = (org.openrdf.model.BNode) oVal;
			return Factory.CONCRETE.createIri("http://b-node/" + bnode.getID());
		}

		if (oVal instanceof org.openrdf.model.Literal) {

			org.openrdf.model.Literal l = (org.openrdf.model.Literal) oVal;

			URI t = l.getDatatype();
			if (t != null) {
				String d = t.toString().trim();
				if (DEBUG) {
					log.info("RDF->IRIS CLASS: " + l + " Datatype:  "
							+ d);
				}
				if (d.equals("http://www.w3.org/2001/XMLSchema#float")) {
					return Factory.CONCRETE.createFloat(l.floatValue());
				}

				if (d.equals("http://www.w3.org/2001/XMLSchema#double")) {
					return Factory.CONCRETE.createDouble(l.doubleValue());
				}
				if (d.equals("http://www.w3.org/2001/XMLSchema#integer")) {
					return Factory.CONCRETE.createInteger(l.intValue());

				}
				// if (d.equals("http://www.w3.org/2001/XMLSchema#BigInteger"))
				// {
				// TODO : BigInteger
				// }
				if (d.equals("http://www.w3.org/2001/XMLSchema#boolean")) {
					return Factory.CONCRETE.createBoolean(l.booleanValue());
				}
				if (d.equals("http://www.w3.org/2001/XMLSchema#decimal")) {
					return Factory.CONCRETE.createDecimal(l.doubleValue());
				}
				if (d.equals("http://www.w3.org/2001/XMLSchema#byte")) {
					return Factory.CONCRETE.createInteger(l.intValue());
				}
				if (d.equals("http://www.w3.org/2001/XMLSchema#date")) {
					return Factory.CONCRETE.createDate(l.calendarValue()
							.getYear(), l.calendarValue().getMonth(), l
							.calendarValue().getDay());
				}
				if (d.equals("http://www.w3.org/2001/XMLSchema#dateTime")) {
					try {
						if (l.calendarValue().getTimezone() == DatatypeConstants.FIELD_UNDEFINED) {
							return Factory.CONCRETE.createDateTime(l
									.calendarValue().getYear(), l
									.calendarValue().getMonth(), l
									.calendarValue().getDay(), l
									.calendarValue().getHour(), l
									.calendarValue().getMinute(), l
									.calendarValue().getSecond(), l
									.calendarValue().getMillisecond(), 0, 0);
						}
						return Factory.CONCRETE.createDateTime(l
								.calendarValue().getYear(), l.calendarValue()
								.getMonth(), l.calendarValue().getDay(), l
								.calendarValue().getHour(), l.calendarValue()
								.getMinute(), l.calendarValue().getSecond(), l
								.calendarValue().getMillisecond(), 0, 0);
					} catch (IllegalArgumentException e) {
						return Factory.CONCRETE.createDateTime(l
								.calendarValue().getYear(), l.calendarValue()
								.getMonth(), l.calendarValue().getDay(), l
								.calendarValue().getHour(), l.calendarValue()
								.getMinute(), 0, 0, 0);
					}
				}

				if (d.equals("http://www.w3.org/2001/XMLSchema#duration")) {
					try {
						return Factory.CONCRETE.createDuration(l.longValue());
					} catch (NumberFormatException e) {
						return Factory.TERM.createString(l.stringValue()
								.toString());
					}

				}
				// TODO base64Binary
				// if
				// (d.equals("http://www.w3.org/2001/XMLSchema#base64Binary")) {
				// return Factory.CONCRETE.createBase64Binary(l.stringValue()
				// .toString());
				// }
				// else just build string
				return Factory.TERM.createString(l.stringValue().toString());

			}

		}
		return Factory.TERM.createString(oVal.toString());
	}

	/**
	 * replaces namespace Uri e.g.: Prefix rdf: namespace URI:
	 * http://www.w3.org/1999/02/22-rdf-syntax-ns# "rdf:type" ->
	 * http://www.w3.org/1999/02/22-rdf-syntax-ns#type
	 * 
	 * @param input
	 *            a String representation of a RDF rules file.
	 * 
	 * @returns a String where the namespace abbreviations are replaced by full
	 *          names
	 * 
	 */
	private String replaceNamespaces(String input) {

		String result = input;
		String shortNamespace = new String();
		String longNamespace = new String();

		String str = null;
		StringTokenizer tok = new StringTokenizer(input);

		while (tok.hasMoreTokens()) {
			str = tok.nextToken();
			if ((str.equals("//Prefix")) || (str.equals("Prefix"))) {
				shortNamespace = tok.nextToken().toString();
				while (!str.toLowerCase().equals("uri:")) {
					str = tok.nextToken();
				}
				longNamespace = tok.nextToken().toString();
				result = result.replace(shortNamespace, longNamespace);
			}
		}
		return result;
	}

	/**
	 * Load a <code>.rules</code> file containing entailment rules (Datalog
	 * rules) and set the current entailment rules of the
	 * CheatingIrisRuleBasedReasoner to the ones in the file.
	 * 
	 * @param filename
	 *            the <code>.rules</code> file to load
	 * @throws IOException
	 *             if the file can not be read
	 * @throws ParserException
	 *             on error
	 */
	public void setEntailmentRulesFromFile(String filename) throws IOException,
			ParserException {
		String in = IOTextFileHelper.loadTextFile(filename);
		in = this.replaceNamespaces(in);
		setEntailmentRulesFromProgram(in);
	}

	/**
	 * Sets the entailment rules to the rules given in Datalog form in the
	 * <code>input</code> String.
	 * 
	 * @param input
	 *            a Datalog program containing entailment rules
	 * 
	 * @throws ParserException
	 *             on error
	 */
	public void setEntailmentRulesFromProgram(String input)
			throws ParserException {
		Parser parser = new Parser();
		parser.parse(input);

		setEntailmentRulesAsList(parser.getRules());
	}

	/**
	 * 
	 * @return theURI
	 */
	public URI getIdentifier() {
		return new URIImpl("urn:" + this.getClass().getName());
	}

	/**
	 * 
	 * @return meta data
	 */
	public MetaData getMetaData() {
		// prepare meta-data about this plug-in
		MetaDataImpl metaData = new MetaDataImpl(Reasoner.class
				.getCanonicalName());

		// TODO all the
		// add what it can get on the input and what it gives on the output
		// select
		metaData.addMethod(new MethodMetaDataImpl("sparqlSelect", new String[] {
				SPARQLQuery.class.getCanonicalName(),
				SPARQLQuery.class.getCanonicalName() },
				new String[] { SetOfStatements.class.getCanonicalName() },
				VariableBinding.class.getCanonicalName()));

		// construct
		metaData.addMethod(new MethodMetaDataImpl("sparqlConstruct",
				new String[] { SPARQLQuery.class.getCanonicalName(),
						SPARQLQuery.class.getCanonicalName() },
				new String[] { SetOfStatements.class.getCanonicalName() },
				SetOfStatements.class.getCanonicalName()));

		// describe
		metaData.addMethod(new MethodMetaDataImpl("sparqlDescribe",
				new String[] { SPARQLQuery.class.getCanonicalName(),
						SPARQLQuery.class.getCanonicalName() },
				new String[] { SetOfStatements.class.getCanonicalName() },
				SetOfStatements.class.getCanonicalName()));

		// ask
		metaData.addMethod(new MethodMetaDataImpl("sparqlAsk", new String[] {
				SPARQLQuery.class.getCanonicalName(),
				SPARQLQuery.class.getCanonicalName() },
				new String[] { SetOfStatements.class.getCanonicalName() },
				BooleanInformationSet.class.getCanonicalName()));

		return metaData;

	}

	/**
	 * 
	 * @return the QoS information
	 */
	public QoSInformation getQoSInformation() {
		return new QoSInformation() {
		};
	}

	/**
	 * Sets the input Query
	 * 
	 * @param theQuery
	 */
	public void setInputQuery(Query theQuery) {
		this.inputQuery = theQuery;
	}

	/**
	 * 
	 * @return the input query
	 */
	public Query getInputQuery() {
		return inputQuery;
	}

	/**
	 * Loads and sets the entailment rules
	 * 
	 * @param rules
	 */
	private void setEntailmentRulesAsList(List<IRule> rules) {
		Logger log = LoggerFactory.getLogger(IrisRuleBasedReasoner.class);
		if (DEBUG) {
			log.info(rules.size() + " entailment rules loaded:");
			for (IRule r : rules)
				log.info("  " + r);
			log.info("");
		}
		entailmentRules = rules;
	}

	/**
	 * 
	 * @return list of entailment rules
	 */
	public List<IRule> getEntailmentRulesAsList() {
		return entailmentRules;
	}

	/**
	 * IllegalTripleException
	 * 
	 * This exception is thrown, if the conversation from IRIS Triple to
	 * openrdf.model.Statement caused an error.
	 * 
	 */
	public class IllegalTripleException extends IllegalArgumentException {

		public IllegalTripleException(String string) {
			super(string);
		}

		private static final long serialVersionUID = 1L;

	}

	/**
	 * If the Iris rulebased reasoning set off.
	 * 
	 * @return true if Iris is set off, false otherwise
	 */
	public boolean isIrisOFF() {
		return this.NOIRIS;
	}

	/**
	 * Counts the Statements read in - but only if Iris reasoning is activated.
	 * 
	 * @return number of statements read in
	 */
	public int getNumberOfStatementsReadIn() {
		return statemRDF;
	}

	/**
	 * Just for the early adopters workshop.
	 * 
	 * @return path and name to the used entailment rule files
	 */
	public String getEntailmentRulesFileName() {
		return entailmentRulesFile;
	}
	
	
	/**
	 *  inner class to read in text from a file
	 */
	public static class IOTextFileHelper {

		/**
		 * Loads a text file and gives a String representation back.
		 * 
		 * @param filename
		 * @return the file content as String
		 * @throws IOException
		 */
		public static String loadTextFile(String filename) throws IOException {
			BufferedReader in = null;
			StringBuffer contents = null;
	
			try {
				in = new BufferedReader(new FileReader(filename));
			} catch (FileNotFoundException e) {
				throw e;
			}
			try {
				contents = new StringBuffer();
				String line = null;
				while ((line = in.readLine()) != null) {
					contents.append(line);
					contents.append(System.getProperty("line.separator"));
				}
	
			} finally {
				in.close();
			}
			return contents.toString();
		}
	
		/**
		 * 
		 * @param text
		 * @param absolutFilename
		 * @throws FileNotFoundException
		 */
		public static void writeStringToTextFile(String text,
				String absolutFilename) throws FileNotFoundException {
	
			File f = new File(absolutFilename);
			f.setWritable(true);
			f.setReadable(true);
	
			PrintWriter out = new PrintWriter(absolutFilename);
			out.print(text);
			out.close();
		}

	}

}
