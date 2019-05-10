package eu.larkc.plugin.select.sparqlkeyword.annotator;

public interface TrainableExtractor {
	public boolean isTrained();
	public void setTrained();
	public void train(String content);
	public String[] extract(String content);
	public TrainableExtractor clone() throws CloneNotSupportedException;
}
