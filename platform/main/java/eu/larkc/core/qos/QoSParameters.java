package eu.larkc.core.qos;

public interface QoSParameters extends java.io.Serializable {

	public int getRequiredNumberOfAnswers();
	public long getMaximumRuntime();
}
