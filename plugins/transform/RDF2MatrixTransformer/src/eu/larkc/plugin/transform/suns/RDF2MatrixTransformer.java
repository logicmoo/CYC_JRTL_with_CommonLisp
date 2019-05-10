package eu.larkc.plugin.transform.suns;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.openrdf.model.URI;
import org.openrdf.model.Value;
import org.openrdf.model.impl.URIImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.siemens.ct.ic4.larkclearning.core.Feature;
import com.siemens.ct.ic4.larkclearning.core.Population;
import com.siemens.ct.ic4.larkclearning.core.PopulationCondition;
import com.siemens.ct.ic4.larkclearning.core.StatisticalUnit;
import com.siemens.ct.ic4.larkclearning.query.SPARQLQuery;
import com.siemens.ct.ic4.larkclearning.query.SPARQLQueryGenerator;

import eu.larkc.core.data.CloseableIterator;
import eu.larkc.core.data.DataFactory;
import eu.larkc.core.data.InformationSet;
import eu.larkc.core.data.SetOfStatements;
import eu.larkc.core.data.VariableBinding;
import eu.larkc.core.data.VariableBinding.Binding;
import eu.larkc.core.data.util.SPARQLQueryExecutor;
import eu.larkc.core.qos.QoSInformation;
import eu.larkc.plugin.Context;
import eu.larkc.plugin.Contract;
import eu.larkc.plugin.transform.InformationSetTransformer;


/**
 * Given a predefined statistical unit class, this plug-in transforms
 * a set of RDF-triples related to statistical units to a 2-dimensional matrix
 * in which the rows are the statistical units (e.g., students),
 * the columns are the features of interest (e.g., sex, age, etc.).
 * The entries are binary: <i>one</i> stands for the existence of a corresponding RDF-triple in the triple set, and <i>zero</i>, otherwise.
 * The generated matrix can be used as input for learning plug-ins.
 * 
 * Input: SetOfStatements
 * Output: DataMatrix
 * 
 * Note: the output will not added into the intern database. 
 * 
 * @author Yi Huang
 *
*/
public class RDF2MatrixTransformer implements InformationSetTransformer {

	// the population containing statistical units
	private Population population;
	
	// the prediction relevant features
	private HashMap<String, Feature> features;
	
	public RDF2MatrixTransformer() {
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

	public InformationSet transform(InformationSet theInformationSet,
			Contract theContract, Context theContext) {
		Logger log = LoggerFactory.getLogger(RDF2MatrixTransformer.class);
		
		if (theInformationSet == null || !(theInformationSet instanceof SetOfStatements) || 
				theContract ==null || !(theContract instanceof MLContract))
			return null;
		
		log.info("+++ RDF2Matrix transformer starts ...");
		
		// the contract contains the environment configuration of machine learning 
		MLContract ml_contract = (MLContract)theContract;
		SetOfStatements statements = (SetOfStatements)theInformationSet;
		
		// create the population gathering URIs of statistical units (rows)
		createPopulation(statements, ml_contract.getStatisticalUnitClass(), ml_contract.getConditions());
		
		// extract the features (columns)
		log.info("Extracting features ...");
		extractFeatures(statements);
		
		// remove rare features
		log.info("Pruning features ...");
		int threshold = ml_contract.getFeatureMinimum();
		if (threshold<1)
			threshold = 1;
		pruningFeature(threshold);
		
		// fill the data matrix with ones in such (row,col) where there exist RDF triples for corresponding (unit,feature)
		log.info("Building matrix ...");
		DataMatrix matrix = buildBinaryMatrix(statements);
		
		log.info("+++ RDF2Matrix transformer finished!");
		
		return matrix;
	}
	
	public void createPopulation(
			SetOfStatements statements,
			String statisticalUnitClass,
			PopulationCondition[] conditions) {
		Logger log = LoggerFactory.getLogger(RDF2MatrixTransformer.class);
		
		log.info("Creating poplation ...");
		population = new Population(statisticalUnitClass, conditions);
		
		log.info("Collecting units ...");
		population.setUnits(collectStatisticalUnits(statements));
	}
	
	private HashMap<String, StatisticalUnit> collectStatisticalUnits(SetOfStatements statements) {
		
		HashMap<String, StatisticalUnit> units = new HashMap<String, StatisticalUnit>();
		SPARQLQuery sparqlquery = SPARQLQueryGenerator.createUnitPattern(
				population.getStatisticalUnitClass(),
				population.createConditions());
		eu.larkc.core.query.SPARQLQuery query = DataFactory.INSTANCE.createSPARQLQuery(sparqlquery.toString());
		
		SPARQLQueryExecutor qexec = new SPARQLQueryExecutor();
		VariableBinding vb = qexec.executeSelect(query, statements);
		CloseableIterator<Binding> it = vb.iterator();		
		for (int i=1; it.hasNext(); i++) {
			Binding bindung = it.next();
			List<Value> values = bindung.getValues();
			Value unit = values.get(0);
			units.put(unit.toString(), new StatisticalUnit(unit.toString(), i));
	    }
		it.close();
		return units;
	}
	
	public List<Feature> extractFeatures(SetOfStatements statements) {
		features = new HashMap<String, Feature>();
		SPARQLQuery sparqlquery = SPARQLQueryGenerator.createPOPattern(
				population.getStatisticalUnitClass(),
				population.createConditions());
		eu.larkc.core.query.SPARQLQuery query = DataFactory.INSTANCE.createSPARQLQuery(sparqlquery.toString());
		SPARQLQueryExecutor qexec = new SPARQLQueryExecutor();
		VariableBinding vb = qexec.executeSelect(query, statements);
		CloseableIterator<Binding> it = vb.iterator();
		for (int i=1; it.hasNext(); i++) {
			Binding bindung = it.next();
			List<Value> values = bindung.getValues();
			Value predicate = values.get(1);
			Value object = values.get(0);
			if (features.containsKey(predicate.toString() + object.toString()))
		    	  features.get(predicate.toString() + object.toString()).increaseFrequency();
		      else
		    	  features.put(predicate.toString() + object.toString(),
		    			  	   new Feature(object.toString(),
		    			  			       i,
		    			  			       predicate.toString()));
	    }
		it.close();
		return getFeatures();
	}
	
	private DataMatrix buildBinaryMatrix(SetOfStatements statements) {
		HashMap<String, StatisticalUnit> units = population.getUnits();
		DataMatrix matrix = new DataMatrix(units.size(), features.size());
		
		SPARQLQuery sparqlquery = SPARQLQueryGenerator.createSPOPattern(
				population.getStatisticalUnitClass(),
				population.createConditions());
		eu.larkc.core.query.SPARQLQuery query = DataFactory.INSTANCE.createSPARQLQuery(sparqlquery.toString());
		
		SPARQLQueryExecutor qexec = new SPARQLQueryExecutor();
		VariableBinding vb = qexec.executeSelect(query, statements);
		CloseableIterator<Binding> it = vb.iterator();		
		for (int i=1; it.hasNext(); i++) {
			Binding bindung = it.next();
			List<Value> values = bindung.getValues();
			Value subject = values.get(0);
			Value predicate = values.get(1);
			Value object = values.get(2);
			
			StatisticalUnit unit = units.get(subject.toString());
		    Feature feature = features.get(predicate.toString()+object.toString());
		    if (unit != null && feature != null) {
			    int row = unit.getIndex()-1;
			    int col = feature.getIndex()-1;
			    matrix.setQuick(row, col, 1);
		    }
	    }
		it.close();
		return matrix;
	}
	
	private void pruningFeature(int threshold) {
		// remove rare features
		Object[] values = features.values().toArray().clone();
		for (int i=0; i<values.length; i++) {
			Feature feature = (Feature)values[i];
			int frequency = feature.getFrequency();
			if (frequency<threshold)
				features.remove(feature.getPredicate()+feature.getUri());
		}
		
		// reset indices
		Object[] _values = features.values().toArray();
		Arrays.sort(_values);
		for (int i=0; i<_values.length; i++) {
			((Feature)_values[i]).setIndex(i+1);
		}
	}
	
	public Population getPopulation() {
		return population;
	}

	public List<Feature> getFeatures() {
		List<Feature> result = new ArrayList<Feature>();
		result.addAll(features.values());
		return result;
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
