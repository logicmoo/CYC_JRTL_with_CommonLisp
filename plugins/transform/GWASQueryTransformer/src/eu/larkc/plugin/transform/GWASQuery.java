package eu.larkc.plugin.transform;

import java.util.HashSet;
import java.util.Set;

import eu.larkc.core.query.Query;

public class GWASQuery implements Query {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8018617425046388138L;
	public Set<String> keywords = new HashSet<String>();
	public boolean searchInRIF = true;
	public boolean useUMLS = false;
	public int searchMode = 0;
	public long dateConstraint = -1;
	public Set<String> snpIDs = new HashSet<String>();
	
	public String toString() {
		return keywords + "\n" + searchInRIF + "\n" + useUMLS + "\n"
				+ searchMode + "\n" + dateConstraint + "\n" + snpIDs;
	}
}