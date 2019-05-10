package eu.larkc.plugin.reason.urbancomputing;

import org.jgrapht.graph.DefaultWeightedEdge;
import org.openrdf.model.URI;

/**
 * An extension of JGraph class DefaultWeightedEdge to set a label (String) to the edges
 */
public class NamedWeightedEdge extends DefaultWeightedEdge {
	private static final long serialVersionUID = 1L;
	private URI label;
	
	/**
	 * @return the label of the edge
	 */
	public URI getURI(){return label;}
	/**
	 * @param label the name of the edge
	 */
	public void setURI(URI label){this.label=label;}
	
	/**
	 * @return the label of the starting vertex
	 */
	public String getFrom(){return this.getSource().toString();}
	/**
	 * @return the label of the ending vertex
	 */
	public String getTo(){return this.getTarget().toString();}

	public String toString(){
		return label+" "+super.toString();
	}
	

}
