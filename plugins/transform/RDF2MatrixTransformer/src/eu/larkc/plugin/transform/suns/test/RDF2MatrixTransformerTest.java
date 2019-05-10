package eu.larkc.plugin.transform.suns.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cern.colt.list.DoubleArrayList;
import cern.colt.list.IntArrayList;

import com.siemens.ct.ic4.larkclearning.core.Feature;
import com.siemens.ct.ic4.larkclearning.core.PopulationCondition;
import com.siemens.ct.ic4.larkclearning.core.StatisticalUnit;

import eu.larkc.core.data.InformationSet;
import eu.larkc.core.data.RdfGraph;
import eu.larkc.plugin.identify.filereader.SimpleFileReaderIdentifier;
import eu.larkc.plugin.transform.suns.DataMatrix;
import eu.larkc.plugin.transform.suns.MLContract;
import eu.larkc.plugin.transform.suns.RDF2MatrixTransformer;


public class RDF2MatrixTransformerTest {
	
	// RDF triple store
	static String[] rdfTripleStore = {"data/lj_foaf-clean.rdf"};
	
	// statistical unit definition: foaf:Person
	static String statisticalUnitClass = "http://xmlns.com/foaf/0.1/Person";
	
	// define a empty condition set
	static PopulationCondition[] conditions = null;
	
	static String output_file = "data/matrix_test.txt";
	static String output_file_att = "data/attributes_test.txt";
	static String output_file_unit = "data/units_test.txt";
	
	public static void main(String[] args) {
		Logger log = LoggerFactory.getLogger(RDF2MatrixTransformerTest.class);
	
		// load RDF triples from local file system 
		SimpleFileReaderIdentifier reader =  new SimpleFileReaderIdentifier(rdfTripleStore);
		Collection<InformationSet> coll = reader.identify(null, null, null);
		Iterator<InformationSet> iterator = coll.iterator();
		if (iterator.hasNext()) {
			RdfGraph infoSet = (RdfGraph)(coll.iterator().next());
			
			// transform a triple store into a binary 2D-matrix
			RDF2MatrixTransformer transformer = new RDF2MatrixTransformer();
			
			// make contract setting up the learning environment
			MLContract contract = new MLContract();
			contract.setStatisticalUnitClass(statisticalUnitClass);
			contract.setConditions(conditions);
			contract.setFeatureMinimum(10);
			
			// process transformation
			DataMatrix matrix = (DataMatrix)transformer.transform(infoSet, contract, null);
			
			
			
			
//			// save resulting units, features and matrix
//			// print out the result matrix in a TXT-file
//			try {
//				Writer out = new FileWriter(new File(output_file));
//				
//				IntArrayList rows = new IntArrayList();
//				IntArrayList cols = new IntArrayList();
//				DoubleArrayList values = new DoubleArrayList();
//				matrix.getNonZeros(rows, cols, values);
//				for (int i=0; i<rows.size(); i++) {
//					out.write(rows.get(i)+" "+cols.get(i)+" "+values.get(i)+"\n");
//				}
//				out.flush();
//				out.close();
//			} catch (FileNotFoundException e) {
//				e.printStackTrace();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//			
//			//print out attributes and units 
//			try {
//				Writer out_att = new FileWriter(new File(output_file_att));
//				Object[] featureArray = transformer.getFeatures().toArray();
//				Arrays.sort(featureArray);
//				for (int i = 0; i < featureArray.length; i++) {
//					Feature feature = (Feature)featureArray[i];
//					out_att.write(feature.getUri()+"\n");
//				}
//				out_att.flush();
//				out_att.close();
//			} catch (FileNotFoundException e) {
//				e.printStackTrace();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//			
//			try {
//				Writer out_unit = new FileWriter(new File(output_file_unit));
//				List<StatisticalUnit> units = transformer.getPopulation().getUnitList();
//				Object[] unitArray = units.toArray();
//				Arrays.sort(unitArray);
//				for (int i = 0; i < unitArray.length; i++) {
//					StatisticalUnit unit = (StatisticalUnit)unitArray[i];
//					out_unit.write(unit.getUri()+"\n");
//				}
//				out_unit.flush();
//				out_unit.close();
//			} catch (FileNotFoundException e) {
//				e.printStackTrace();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
			
		} else {
			log.info("no file found.");
		}
	}
}
