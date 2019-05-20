package jasko.tim.lisp.cusp;

public abstract class CuspDisplayRunnable extends CuspRunnable {

	protected String presentation = null;
	
	public void startPresentation(String presentation) {
		this.presentation = presentation;
	}
	
	public void endPresentation() {
		presentation = null;
	}
}
