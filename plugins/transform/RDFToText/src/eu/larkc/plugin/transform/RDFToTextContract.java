package eu.larkc.plugin.transform;

import eu.larkc.plugin.Contract;
import gate.creole.larkc.molecules.Lexicaliser;

/**
 * this class is used for setting up the parameters for the Transformer
 * 
 * @author danica
 * 
 */
public class RDFToTextContract implements Contract {
	public String getTheDirectoryURL() {
		return theDirectoryURL;
	}

	public void setTheDirectoryURL(String theDirectoryURL) {
		this.theDirectoryURL = theDirectoryURL;
	}

	public String getSubjectQueryString() {
		return subjectQueryString;
	}

	public void setSubjectQueryString(String subjectQueryString) {
		this.subjectQueryString = subjectQueryString;
	}

	public String getDepth() {
		return depth;
	}

	public void setDepth(String depth) {
		this.depth = depth;
	}

	private static final long serialVersionUID = 4964585541551132712L;

	RDFToTextContract(String docPath, String location, String repositoryId,
			String documentsForTriples) {
		this.theDirectoryURL = docPath;
		this.location = location;
		this.repositoryId = repositoryId;
		this.documentsForTriples = documentsForTriples;
	}

	Lexicaliser lexicaliser;

	public Lexicaliser getLexicaliser() {
		return lexicaliser;
	}

	public void setLexicaliser(Lexicaliser lexicaliser) {
		this.lexicaliser = lexicaliser;
	}

	String theDirectoryURL;

	String location;

	String repositoryId;

	String subjectQueryString;

	String depth;

	String documentsForTriples;

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getRepositoryId() {
		return repositoryId;
	}

	public void setRepositoryId(String repositoryId) {
		this.repositoryId = repositoryId;
	}

	public String getDocumentsForTriples() {
		return documentsForTriples;
	}

	public void setDocumentsForTriples(String documentsForTriples) {
		this.documentsForTriples = documentsForTriples;
	}

	public void setDocPath(String docPath) {
		this.theDirectoryURL = docPath;
	}

	public String getDocPath() {
		return theDirectoryURL;
	}
}