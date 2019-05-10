package eu.larkc.plugin.transform;

import java.util.ResourceBundle;

import org.openrdf.model.Statement;
import org.openrdf.model.URI;
import org.openrdf.model.impl.URIImpl;

import eu.larkc.core.data.CloseableIterator;
import eu.larkc.core.data.InformationSet;
import eu.larkc.core.data.NaturalLanguageDocument;
import eu.larkc.core.data.NaturalLanguageDocumentUrl;
import eu.larkc.core.data.SetOfStatements;
import eu.larkc.core.qos.QoSInformation;
import eu.larkc.plugin.Context;
import eu.larkc.plugin.Contract;
import gate.creole.larkc.molecules.CreateMoleculeDocsStandalone;

/**
 * This is a transformer which is preparing documents for processing by
 * geometrical selection methods;
 * 
 * it will lexicalise an RDF graph into documents which are then used by plugins
 * inspired by IR document-based methods such as Random Indexing; one such
 * plugin is RandomIndexingSelecter
 * 
 * 
 * @author Danica Damljanovic
 * 
 */
public class RDFToTextTransformer implements InformationSetTransformer {

	public RDFToTextTransformer() {
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
		System.out.println("Hello from RDFToText transformer");

		// take set of statements
		SetOfStatements statements = (SetOfStatements) theInformationSet;

		// location is either a local dir containing a repository or
		// the URL of a opensesame server, id is the repository to use,
		// and docUrl is the directory/file where to place the documents.

		//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
		//%%%%IMPORTANT: find the alternative way to pass on the ri 
		//parameters as the contract is not aimed to be used for this%%%%%%%%
		//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
		ResourceBundle rb = ResourceBundle
		.getBundle("eu.larkc.plugin.transform.RDFToTextTransformer");
		String docPath = rb.getString("corpusOrFile");
		
		String location = rb.getString("location");
		String repositoryId = rb.getString("id");
		String documentsForTriples = "false";
	
		//Contract theContract = new RDFToTextContract(corpusOrFile, location,
		//		repositoryId, "false");
		
		//String docUrl = ((RDFToTextContract) theContract).getDocPath();

		//String location = ((RDFToTextContract) theContract).getLocation();
		//String repositoryId = ((RDFToTextContract) theContract)
		//		.getRepositoryId();
		//String documentsForTriples = ((RDFToTextContract) theContract)
		//		.getDocumentsForTriples();

		// generate documents from the graph
		NaturalLanguageDocument documents = generateDocuments(statements,
				docPath, location, repositoryId, documentsForTriples);

		return documents;

	}

	/**
	 * this method takes statements as input, then calls GATE; GATE pipeline
	 * will process these statements and generate natural language documents
	 * stored at given docURL
	 * 
	 * @param statements
	 * @param docPath
	 * @return
	 */
	NaturalLanguageDocument generateDocuments(SetOfStatements statements,
			String docPath, String location, String repositoryId,
			String documentsForTriples) {

		// pass it on to gate pipeline
		String[] args = { location, repositoryId, docPath,
				documentsForTriples };
		try {
			System.out.println("RDFToText transformer, passing on these arguments:\n");
			for (String arg : args) {
				System.out.println(arg+"\n");
			}
			//log.info("Passing finished, calling method...\n");
			CreateMoleculeDocsStandalone.main(args);
			System.out.println("Finished.");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return new NaturalLanguageDocumentUrl(docPath);
	}

	/**
	 * this method is for illustration how this transformer
	 * resources\mooney-sample\
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		RDFToTextTransformer transformer = new RDFToTextTransformer();

		/*
		 * in this example we connect to the remote repository using given
		 * repository location and id: this example should be changed to fetch
		 * the statements through the larkc datastore
		 */
		InformationSet theInformationSet = new SetOfStatements() {

			@Override
			public CloseableIterator<Statement> getStatements() {
				// TODO Auto-generated method stub
				return null;
			}
		};

//		ResourceBundle rb = ResourceBundle
//				.getBundle("eu.larkc.plugin.transform.RDFToTextTransformer");
		
		String location = args[0];//rb.getString("location");
		String repositoryId = args[1];//rb.getString("id");

		String corpusOrFile = args[2]; //rb.getString("corpusOrFile");
		
		Contract theContract = new RDFToTextContract(corpusOrFile, location,
				repositoryId, "false");
		transformer.transform(theInformationSet, theContract, null);
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
