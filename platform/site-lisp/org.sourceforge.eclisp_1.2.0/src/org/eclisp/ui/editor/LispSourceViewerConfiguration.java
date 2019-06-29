/*
 * Created on 19.04.2004
 * 
 *  
 */
package org.eclisp.ui.editor;

import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ITextDoubleClickStrategy;
import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.contentassist.ContentAssistant;
import org.eclipse.jface.text.contentassist.IContentAssistant;
import org.eclipse.jface.text.presentation.IPresentationReconciler;
import org.eclipse.jface.text.presentation.PresentationReconciler;
import org.eclipse.jface.text.rules.BufferedRuleBasedScanner;
import org.eclipse.jface.text.rules.DefaultDamagerRepairer;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.jface.text.source.SourceViewerConfiguration;
import org.eclipse.swt.graphics.RGB;
import org.eclisp.ui.editor.util.LispColorProvider;

/**
 * @author soul
 *  
 */
public class LispSourceViewerConfiguration extends SourceViewerConfiguration {

    /**
     * Single token scanner.
     */
    static class SingleTokenScanner extends BufferedRuleBasedScanner {

        public SingleTokenScanner(TextAttribute attribute) {
            setDefaultReturnToken(new Token(attribute));
        }
    };
    
    /* (non-Javadoc)
	 * Method declared on SourceViewerConfiguration
	 */
	public ITextDoubleClickStrategy getDoubleClickStrategy(ISourceViewer sourceViewer, String contentType) {
		return new LispDoubleClickSelector();
	}

    /*
     * (non-Javadoc) Method declared on SourceViewerConfiguration
     */
    public IPresentationReconciler getPresentationReconciler(
            ISourceViewer sourceViewer) {

        LispColorProvider provider = LispEditorEnvironment.getLispColorProvider();
        PresentationReconciler reconciler = new PresentationReconciler();

        DefaultDamagerRepairer dr = new DefaultDamagerRepairer(LispEditorEnvironment.getLispCodeScanner());
        reconciler.setDamager(dr, IDocument.DEFAULT_CONTENT_TYPE);
        reconciler.setRepairer(dr, IDocument.DEFAULT_CONTENT_TYPE);

        dr = new DefaultDamagerRepairer(new SingleTokenScanner(
                new TextAttribute(provider.getColor(LispColorProvider.MULTI_LINE_COMMENT))));
        reconciler.setDamager(dr, LispPartitionScanner.LISP_MULTILINE_COMMENT);
        reconciler.setRepairer(dr, LispPartitionScanner.LISP_MULTILINE_COMMENT);

        return reconciler;
    }
    
	/* (non-Javadoc)
	 * Method declared on SourceViewerConfiguration
	 */
	public int getTabWidth(ISourceViewer sourceViewer) {
		return 4;
	}
	
	/* (non-Javadoc)
	 * Method declared on SourceViewerConfiguration
	 */
	public IContentAssistant getContentAssistant(ISourceViewer sourceViewer) {

		ContentAssistant assistant= new ContentAssistant();
		assistant.setContentAssistProcessor(new LispCompletionProcessor(), IDocument.DEFAULT_CONTENT_TYPE);		

		// TODO: move those settings to the preferences
		assistant.enableAutoInsert(true);
//		assistant.enableAutoActivation(true);
		assistant.setAutoActivationDelay(500);
		assistant.setProposalPopupOrientation(IContentAssistant.PROPOSAL_OVERLAY);
		assistant.setContextInformationPopupOrientation(IContentAssistant.CONTEXT_INFO_ABOVE);
		assistant.setContextInformationPopupBackground(LispEditorEnvironment.getLispColorProvider().getColor(new RGB(150, 150, 0)));

		return assistant;
	}

}