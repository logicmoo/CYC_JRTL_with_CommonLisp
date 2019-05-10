package eu.larkc.plugin.transform.suns;

import cern.colt.matrix.impl.SparseDoubleMatrix2D;
import eu.larkc.core.data.InformationSet;

public class DataMatrix extends SparseDoubleMatrix2D implements InformationSet {

	public DataMatrix(double[][] values) {
		super(values);
	}

	public DataMatrix(int rows, int cols) {
		super(rows, cols);
	}
	
	
}
