package eu.larkc.core.data;

public class BooleanInformationSetImpl implements BooleanInformationSet {
	
	private boolean mValue;
	private static final long serialVersionUID = 1L;
	
	public BooleanInformationSetImpl(boolean value) {
		mValue = value;
	}

	@Override
	public boolean getValue() {
		return mValue;
	}
}
