package eu.larkc.plugin.reason.urbancomputing.ubl.support;

import org.jgrapht.graph.DefaultWeightedEdge;

/**
 * An extension of JGraph class DefaultWeightedEdge to set a label (String) to the edges
 */
public class NamedWeightedEdge extends DefaultWeightedEdge {
	private static final long serialVersionUID = 1L;
	private String label;
	
	/**
	 * @return the label of the edge
	 */
	public String getLabel(){return label;}
	/**
	 * @param label the name of the edge
	 */
	public void setLabel(String label){this.label=label;}
	
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
