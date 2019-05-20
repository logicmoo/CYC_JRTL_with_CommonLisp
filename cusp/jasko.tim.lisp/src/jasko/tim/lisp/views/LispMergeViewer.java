package jasko.tim.lisp.views;

import jasko.tim.lisp.LispPlugin;
import jasko.tim.lisp.editors.*;

import org.eclipse.jface.text.TextViewer;
import org.eclipse.compare.contentmergeviewer.TextMergeViewer;
import org.eclipse.compare.CompareConfiguration;
import org.eclipse.compare.structuremergeviewer.ICompareInput;
import org.eclipse.jface.text.source.SourceViewer;
import org.eclipse.swt.widgets.Composite;


public class LispMergeViewer extends TextMergeViewer {

	private LispCompareInput theInput;
	
	public LispMergeViewer(final Composite parent, final int styles,
			final CompareConfiguration mp) {
		super(parent, styles, mp);
	 }
	
	protected void configureTextViewer(TextViewer textViewer){
	      if(textViewer instanceof SourceViewer) {
	    	  SourceViewer sv = (SourceViewer) textViewer;
	          sv.configure(new LispConfiguration(null, LispPlugin.getDefault().getColorManager()));
	        }
	}

	public void setInput(final Object input) {

		if (input instanceof ICompareInput) {
			final ICompareInput compareInput = (ICompareInput) input;
			this.theInput = new LispCompareInput(compareInput);
		}

		super.setInput(this.theInput);
	}
}
