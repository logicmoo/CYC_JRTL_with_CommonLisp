package jasko.tim.lisp.views.repl;

import org.eclipse.jface.text.*;
import org.eclipse.jface.text.presentation.*;
import org.eclipse.jface.text.rules.*;
import org.eclipse.jface.text.source.ISourceViewer;

import jasko.tim.lisp.ColorManager;
import jasko.tim.lisp.editors.*;

public class ReplConfiguration extends LispConfiguration {
	public ReplConfiguration(ColorManager colorManager) {
		super(null, colorManager);
	}
	
	public String[] getConfiguredContentTypes(ISourceViewer sourceViewer) {
		return new String[] {
			IDocument.DEFAULT_CONTENT_TYPE,
			LispPartitionScanner.LISP_COMMENT,
			LispPartitionScanner.LISP_STRING,
			ReplPartitionScanner.SENT_COMMAND
		};
	}
	
	
	public IPresentationReconciler getPresentationReconciler(ISourceViewer sourceViewer) {
		PresentationReconciler reconciler = (PresentationReconciler)super.getPresentationReconciler(sourceViewer);
		
		DefaultDamagerRepairer dr =
			new DefaultDamagerRepairer(new LispScanner(colorManager, 
					colorManager.getColor(ColorManager.TokenType.SENT_MESSAGE)));
		reconciler.setDamager(dr, ReplPartitionScanner.SENT_COMMAND);
		reconciler.setRepairer(dr, ReplPartitionScanner.SENT_COMMAND);

		return reconciler;
	}
	
}
