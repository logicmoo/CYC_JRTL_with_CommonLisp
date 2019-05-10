package eu.larkc.plugin.reason.urbancomputing;

import org.openrdf.model.URI;

public class Configuration {
	private URI vertexClass;
	private URI edgeClass;
	private URI pathClass;
	
	private URI fromProperty;
	private URI toProperty;
	private URI weightProperty;
	
	private URI sourceProperty;
	private URI destinationProperty;
	private URI composedByProperty;
	private URI pathWeightProperty;
	
	public URI getVertexClass() {
		return vertexClass;
	}
	public void setVertexClass(URI vertexClass) {
		this.vertexClass = vertexClass;
	}
	public URI getEdgeClass() {
		return edgeClass;
	}
	public void setEdgeClass(URI edgeClass) {
		this.edgeClass = edgeClass;
	}
	public URI getFromProperty() {
		return fromProperty;
	}
	public void setFromProperty(URI fromProperty) {
		this.fromProperty = fromProperty;
	}
	public URI getToProperty() {
		return toProperty;
	}
	public void setToProperty(URI toProperty) {
		this.toProperty = toProperty;
	}
	public URI getWeightProperty() {
		return weightProperty;
	}
	public void setWeightProperty(URI weightProperty) {
		this.weightProperty = weightProperty;
	}
	public URI getPathClass() {
		return pathClass;
	}
	public void setPathClass(URI pathClass) {
		this.pathClass = pathClass;
	}
	public URI getSourceProperty() {
		return sourceProperty;
	}
	public void setSourceProperty(URI sourceProperty) {
		this.sourceProperty = sourceProperty;
	}
	public URI getDestinationProperty() {
		return destinationProperty;
	}
	public void setDestinationProperty(URI destinationProperty) {
		this.destinationProperty = destinationProperty;
	}
	public URI getComposedByProperty() {
		return composedByProperty;
	}
	public void setComposedByProperty(URI composedByProperty) {
		this.composedByProperty = composedByProperty;
	}
	public URI getPathWeightProperty() {
		return pathWeightProperty;
	}
	public void setPathWeightProperty(URI pathWeightProperty) {
		this.pathWeightProperty = pathWeightProperty;
	}
	
	public String toString(){
		return "Vertex Class: <" + vertexClass +">\nEdge Class: <"+edgeClass+">" +
				"\nFrom Property: <"+fromProperty+">\nTo Property: <"+toProperty+">" +
				"\nWeight Property: <"+weightProperty+">\nPath Class: <"+pathClass+">" +
				"\nSource Property: <"+sourceProperty+">\nDestination Property: <"+destinationProperty+">" +
				"\nPath Weight Property: <"+pathWeightProperty+">\nComposed By Property: <"+composedByProperty+">";
	}
}
