package eu.larkc.plugin.transform.suns;

import com.siemens.ct.ic4.larkclearning.core.PopulationCondition;

import eu.larkc.plugin.Contract;


/**
 * This class contains predefined configuration for data transformation by using machine learning.
 * @author Yi Huang
 *
 */
public class MLContract implements Contract {
	
	// class of statistical unit, e.g., http://xmlns.com/foaf/0.1/Person
	private String statisticalUnitClass;
	
	// conditions define the population, e.g., female person older than 30 years
	private PopulationCondition[] conditions;
	
	// feature reduction threshold
	private int featureMinimum;
	
	// target predicate to predict
	private String targetPredicate;
	
	// rank of decomposed matrix
	private int rank;
	
	public String getStatisticalUnitClass() {
		return statisticalUnitClass;
	}
	public void setStatisticalUnitClass(String statisticalUnitClass) {
		this.statisticalUnitClass = statisticalUnitClass;
	}
	public PopulationCondition[] getConditions() {
		return conditions;
	}
	public void setConditions(PopulationCondition[] conditions) {
		this.conditions = conditions;
	}
	public int getFeatureMinimum() {
		return featureMinimum;
	}
	public void setFeatureMinimum(int featureMinimum) {
		this.featureMinimum = featureMinimum;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public String getTargetPredicate() {
		return targetPredicate;
	}
	public void setTargetPredicate(String targetPredicate) {
		this.targetPredicate = targetPredicate;
	}
}
