package eu.larkc.plugin.select.sparqlkeyword.annotator;

import gate.Annotation;
import gate.AnnotationSet;
import gate.Document;
import gate.Factory;
import gate.FeatureMap;
import gate.Gate;
import gate.ProcessingResource;
import gate.creole.ConditionalSerialAnalyserController;
import gate.creole.ExecutionException;
import gate.creole.ResourceInstantiationException;
import gate.util.persistence.PersistenceManager;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Writer;
import java.util.HashSet;
import java.util.Iterator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class GateKeyPhraseExtractor implements TrainableExtractor {
	boolean trained = false;
	String gappPath = null;
	ConditionalSerialAnalyserController appController;
	//TODO: Resolve the type
	//KeyPhraseExtractor extractorPlugin = null;
	
	@SuppressWarnings("unchecked")
	public GateKeyPhraseExtractor(String gappPath) {
		this.gappPath = gappPath;
		// initialize the GATE framework
		try {
			Gate.init();
		} catch (Exception ex) {
			throw new RuntimeException("Couldn't initialize GATE framework: " + 
																ex.getMessage());
		}
		// initialize application controller from .gapp configuration
		try {
			// TODO: figure out how to pass the relative path to .gapp file
			appController = (ConditionalSerialAnalyserController)PersistenceManager.
				loadObjectFromFile(new File(gappPath));
		} catch (Exception ex) {
			throw new RuntimeException("Failed while loading " +
					"GATE keyphrase extraction application");
		}
		// create an empty corpus
		try {
			appController.setCorpus(Factory.newCorpus("default"));
		} catch (ResourceInstantiationException ex) {
			throw new RuntimeException("Failed to create an empty corpus");
		}
		// retrieve the keyphrase extractor GATE plugin
		Iterator iter = appController.getPRs().iterator();
		while (iter.hasNext()) {
			ProcessingResource pr = (ProcessingResource)iter.next();
			if (pr.getName().equals("keyphrase")) {
				//TODO: Resolve the type
				//extractorPlugin = (KeyPhraseExtractor)pr;
				break;
			}
		}
		//TODO uncommet when the missing type is found
		/*if (extractorPlugin == null) {
			throw new IllegalArgumentException("Failed to retrieve the key-phrase extractor GATE plugin");
		}*/

	}
	
	public boolean isTrained() {
		return trained;
	}
	public void setTrained() {
		trained = true;
	}
	
	@SuppressWarnings("unchecked")
	private String[] processContent(String content, boolean training) {
		String[] result = null;
		Document doc = createDocument(content);
		appController.getCorpus().clear();
		appController.getCorpus().add(doc);
		try {
			//TODO: Missing type
			//extractorPlugin.setTrainingMode(training);
			appController.execute();
			appController.getCorpus().clear();
			// in extraction mode we need results!
			if (!training) {
				AnnotationSet as = doc.getAnnotations().get("KeyPhrase");
				HashSet<String> phrases = new HashSet<String>();
				for (Annotation a : as) {
					phrases.add(a.getFeatures().get("string").toString().toLowerCase());
				}
				result = phrases.toArray(new String[phrases.size()]);
			} else {
				setTrained();
			}
			// cleanup resources to prevent leaks
			Factory.deleteResource(doc);
			
		} catch (ExecutionException e) {
			throw new RuntimeException(e);
		}
		return result;
	}
	
	public void train(String content) {
		processContent(content, true);
	}
	
	public String[] extract(String content) {
		return processContent(content, false); 
	}
	
	private Document createDocument(String content) {
		Document doc = null;

		// create a feature map for this document
		FeatureMap fm = Factory.newFeatureMap();
		fm.put(Document.DOCUMENT_STRING_CONTENT_PARAMETER_NAME, content);
		fm.put(Document.DOCUMENT_MIME_TYPE_PARAMETER_NAME, "text/plain");
		fm.put(Document.DOCUMENT_MARKUP_AWARE_PARAMETER_NAME, Boolean.FALSE);
	
		try {
			doc = (Document)Factory.createResource("gate.corpora.DocumentImpl", fm);
		} catch (Exception ex) {
			return null;
		}
		return doc;
	}
	
	public void saveModel(Writer writer) throws IOException {
		//extractorPlugin.save(writer);
	}
	
	public void loadModel(InputStreamReader reader) throws IOException {
		//extractorPlugin.load(reader);
	}
	
	public GateKeyPhraseExtractor clone() throws CloneNotSupportedException {
		Logger log = LoggerFactory.getLogger(GateKeyPhraseExtractor.class);
		GateKeyPhraseExtractor clonedInstance = new GateKeyPhraseExtractor(gappPath);
		if (isTrained()) {
			try {
				File tempXmlModel = File.createTempFile("extractor-", ".xml");
				saveModel(new FileWriter(tempXmlModel));
				clonedInstance.loadModel(new InputStreamReader(new FileInputStream(tempXmlModel)));
				clonedInstance.setTrained();
				log.info("Cloned extractor using temp file " + tempXmlModel.getAbsolutePath());
				tempXmlModel.delete();
			} catch (IOException ex) {
				throw new CloneNotSupportedException("Failed to clone extractor: " + ex.getMessage());
			}
		}
		return clonedInstance;
	}
}