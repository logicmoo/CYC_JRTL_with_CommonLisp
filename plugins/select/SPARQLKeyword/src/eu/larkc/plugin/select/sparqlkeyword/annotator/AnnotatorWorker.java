package eu.larkc.plugin.select.sparqlkeyword.annotator;

import java.util.*;

import org.openrdf.model.*;

import eu.larkc.core.data.CloseableIterator;
import eu.larkc.core.data.RdfStoreConnection;

public class AnnotatorWorker extends Thread {
	private CloseableIterator<? extends Statement> iter = null;
	private TreeSet<String> visited = null;
	private RdfStoreConnection connection = null;
	private TrainableExtractor extractor = null;
	
	private boolean trainingMode = false;
	
	private int maxTrainingSamples = 1000;
	
	private int count = 0;
	private int error = 0;
	
	public AnnotatorWorker(
			CloseableIterator<? extends Statement> iter, 
			TreeSet<String> visited,
			RdfStoreConnection connection, 
			boolean trainingMode) {
		this.iter = iter;
		this.visited = visited;
		this.connection = connection;
		this.trainingMode = trainingMode;
	}

	public int getCount() {
		return count;
	}
	public int getError() {
		return error;
	}
	public int getMaxTrainingSamples() {
		return maxTrainingSamples;
	}
	public void setMaxTrainingSamples(int value) {
		maxTrainingSamples = value;
	}
	public void setExtractor(TrainableExtractor extractor, boolean doClone) {
		if (doClone) {
			try {
				this.extractor = extractor.clone();
			} catch (CloneNotSupportedException e) {
				throw new RuntimeException("Unsupported extractor!");
			}
		} else {
			this.extractor = extractor;
		}
	}
	
	public void run() {
		TreeMap<String,Value> molecule = new TreeMap<String,Value>();
		LinkedList<String> literals = new LinkedList<String>();	

		count = 0;
		
		while (true) {
			Statement st = null;
			synchronized (connection) {
				if (iter.hasNext()) {
					st = iter.next();
				}	
			}
			// is there anything left to process
			if (st == null) break;
			Resource subject = st.getSubject();
			// skip blank nodes, we're only interested in real URIs
			if (subject instanceof BNode) continue;
			// skip URIs already visited once
			String uriId = subject.toString();
			synchronized (visited) {
				if (visited.contains(uriId)) continue;
				visited.add(uriId); // mark this URI as visited
			}
			// skip our stuff
			if (st.getPredicate().equals(KeyPhraseAnnotator.HAS_KEY_PHRASES)) continue;
			// prepare data structures for collecting the molecule
			molecule.clear();
			literals.clear();
			// collect the node molecule
			collectMolecule(subject, molecule, literals);
			// compile a single string of all the unique literals in molecule
			String literalString = join(literals, ". ");
			if (trainingMode) {
				if (count++ >= getMaxTrainingSamples()) break;
				synchronized (extractor) {
					extractor.train(literalString);
				}
			} else {
				String[] phrases = null;
				synchronized (extractor) {
					phrases = extractor.extract(literalString);
				}
				if (phrases.length > 0) {
					String phrasesString = join(Arrays.asList(phrases), ", ");
					synchronized (connection) {
						connection.addStatement(subject, 
							KeyPhraseAnnotator.HAS_KEY_PHRASES, 
							connection.getValueFactory().createLiteral(phrasesString), 
							KeyPhraseAnnotator.HAS_KEY_PHRASES);
					}
					count++;
				}
			}
		}
	}
	private void collectMolecule(Value node, Map<String,Value> molecule, List<String> literals) {
		String id = node.toString();
		if (molecule.containsKey(id)) return;
		// mark as visited
		molecule.put(id, node);
		// where can we go over blank nodes
		if (node instanceof Resource) {
			CloseableIterator<Statement> iter = 
				connection.search((Resource)node, null, null, null, null);
			while (true) {
				Statement st;
				synchronized (connection) {
					if (iter.hasNext()) 
						st = iter.next();
					else 
						break;
				}
				Value next = st.getObject();
				if (next instanceof URI) {
					continue; // we don't go out of the molecule scope 
				} else {
					// blank nodes are still inside the molecule
					collectMolecule(next, molecule, literals);
				}
			}
		} else {
			literals.add(node.stringValue());
		}
	}
	
	private String join(Collection<String> strings, String delimiter) {
		StringBuffer sb = new StringBuffer();
		boolean init = true;
		for (String string : strings) {
			if (init) 
				init = false;
			else 
				sb.append(delimiter);
			sb.append(string);
		}
		return sb.toString();
	}
}
