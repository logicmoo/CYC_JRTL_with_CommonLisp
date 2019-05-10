package eu.larkc.plugin.select.sparqlkeyword.annotator;

import java.util.*;

import org.openrdf.model.*;
import org.openrdf.model.impl.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import eu.larkc.core.data.CloseableIterator;
import eu.larkc.core.data.DataFactory;
import eu.larkc.core.data.RdfStoreConnection;

public class KeyPhraseAnnotator {
	public final static URI HAS_KEY_PHRASES = new URIImpl("http://www.ontotext.com/hasKeyPhrases");

	private final static int MAX_THREADS = Runtime.getRuntime().availableProcessors();
	
	private RdfStoreConnection connection;
	private TrainableExtractor extractor;
	private int maxTrainingSamples = Integer.MAX_VALUE;
	
	public KeyPhraseAnnotator(TrainableExtractor x) {
		this(DataFactory.INSTANCE.createRdfStoreConnection(), x);
	}
	
	public KeyPhraseAnnotator(RdfStoreConnection c, TrainableExtractor x) {
		connection = c;
		extractor = x;
	}
	
	public int getMaxTrainingSamples() {
		return maxTrainingSamples;
	}
	
	public void setMaxTrainingSamples(int value) {
		maxTrainingSamples = value;
	}
	
	private void clearMolecules() {
		connection.removeStatement(null, HAS_KEY_PHRASES, null, null);
	}
	
	private int visitMolecules(boolean trainingMode) {
		// position iterator at the beginning of repository
		CloseableIterator<? extends Statement> iter = 
			connection.search(null, null, null, null, null);
		// prepare an set to keep account of visited nodes
		TreeSet<String> visited = new TreeSet<String>();
		
		// start workers
		AnnotatorWorker workers[] = new AnnotatorWorker[trainingMode ? 1 : MAX_THREADS];
		for (int idx=0; idx < workers.length; idx++) {
			workers[idx] = new AnnotatorWorker(iter, visited, connection, trainingMode);
			workers[idx].setMaxTrainingSamples(getMaxTrainingSamples());
			workers[idx].setExtractor(extractor, !trainingMode);
			workers[idx].start();
		}
		// wait for workers to complete
		boolean repeat = false;
		do {
			for (int idx=0; idx < workers.length; idx++) {
				try {
					workers[idx].join(0);
				} catch (InterruptedException e) {
					repeat = true;
					continue;
				}
			}
		} while (repeat);
		// count the results
		int total = 0;
		for (int idx=0; idx < workers.length; idx++) {
			if (workers[idx].getError() > 0) return -1;
			total += workers[idx].getCount();
		}
		// report the total count
		return total;
	}
	
	public void annotate() {
		long t1, t2;
		int nr;
		Logger log = LoggerFactory.getLogger(KeyPhraseAnnotator.class);
		// clear previously annotated molecules
		clearMolecules();
		// walk the graph in training mode if needed
		if (!extractor.isTrained()) {
			t1 = System.currentTimeMillis();
			nr = visitMolecules(true);
			t2 = System.currentTimeMillis();
			log.info("Finished training on " + nr + " molecules in " + (t2 - t1) + "ms");
		}
		// now walk the graph in annotation mode
		t1 = System.currentTimeMillis();
		nr = visitMolecules(false);
		t2 = System.currentTimeMillis();
		log.info("Finished annotation of " + nr + " molecules in " + (t2 - t1) + "ms");
	}
	
	public static void main(String[] args) {
		GateKeyPhraseExtractor xtor = new GateKeyPhraseExtractor("gate/keyphrase.gapp");
		KeyPhraseAnnotator annotator = new KeyPhraseAnnotator(xtor);
		annotator.setMaxTrainingSamples(10000);
		annotator.annotate();
	}

}
