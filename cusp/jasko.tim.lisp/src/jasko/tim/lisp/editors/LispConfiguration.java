package jasko.tim.lisp.editors;

import java.net.MalformedURLException;
import java.net.URL;

import jasko.tim.lisp.ColorManager;
import jasko.tim.lisp.LispPlugin;
import jasko.tim.lisp.editors.assist.*;
import jasko.tim.lisp.editors.autoedits.*;
import jasko.tim.lisp.preferences.PreferenceConstants;
import jasko.tim.lisp.util.LispUtil;

import org.eclipse.jface.text.hyperlink.URLHyperlinkDetector;
import org.eclipse.swt.*;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.text.*;
import org.eclipse.jface.text.contentassist.*;
import org.eclipse.jface.text.hyperlink.IHyperlinkDetector;
import org.eclipse.jface.text.presentation.*;
import org.eclipse.jface.text.reconciler.IReconciler;
import org.eclipse.jface.text.reconciler.MonoReconciler;
import org.eclipse.jface.text.rules.*;
import org.eclipse.jface.text.source.*;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.browser.IWorkbenchBrowserSupport;
import org.eclipse.ui.editors.text.*;

/**
 * Eclipse uses this class to do the majority of the customization that makes our Lisp
 *  editor a Lisp editor.
 * @author Tim Jasko
 *
 */
public class LispConfiguration extends TextSourceViewerConfiguration {
	protected RuleBasedScanner tagScanner;
	
	private ITextDoubleClickStrategy doubleClickStrategy;
	protected ColorManager colorManager;
	protected ContentAssistant ca;
	protected ILispEditor editor;
 
	public ITextDoubleClickStrategy getDoubleClickStrategy(
			ISourceViewer sourceViewer,
			String contentType) {
			if (doubleClickStrategy == null)
				doubleClickStrategy = new LispDoubleClickStrategy();
			return doubleClickStrategy;
		}

	private final IPropertyChangeListener prefsListener = new IPropertyChangeListener () {
        public void propertyChange (PropertyChangeEvent event) {
        	IPreferenceStore ps = LispPlugin.getDefault().getPreferenceStore();
            String prop = event.getProperty();
            if (prop.equals(PreferenceConstants.AUTO_POPUP_COMPLETIONS)) {
                ca.enableAutoActivation((Boolean)event.getNewValue());
            } else if (prop.equals(PreferenceConstants.AUTO_INSERT_COMPLETIONS)) {
                ca.enableAutoInsert((Boolean)event.getNewValue());
            } else if (prop.equals(PreferenceConstants.AUTO_POPUP_COMPLETIONS_DELAY)){
            	ca.setAutoActivationDelay(ps.getInt(PreferenceConstants.AUTO_POPUP_COMPLETIONS_DELAY));
            } else if (prop.equals(PreferenceConstants.ARGLIST_BELOW)){
        		if( ps.getBoolean(PreferenceConstants.ARGLIST_BELOW)){
        			ca.setContextInformationPopupOrientation(ContentAssistant.CONTEXT_INFO_BELOW);
        		} else {
        			ca.setContextInformationPopupOrientation(ContentAssistant.CONTEXT_INFO_ABOVE);			
        		}
            }
        }
    };

    public void stopContentAssistant(){
    	ca.enableAutoActivation(false);
    	
    }
    
    /* returns to state defined in AUTO_POPUP_COMPLETIONS) */
    public void startContentAssistant(){
    	ca.enableAutoActivation(LispPlugin.getDefault().getPreferenceStore()
    			.getBoolean(PreferenceConstants.AUTO_POPUP_COMPLETIONS));
    }
    
	public LispConfiguration(ILispEditor editor, ColorManager colorManager) {
		this.editor = editor;
		this.colorManager = colorManager;
		
		ca = new ContentAssistant();
		ca.setContentAssistProcessor(new ArglistAssistProcessor(editor), 
			IDocument.DEFAULT_CONTENT_TYPE);
        
        IPreferenceStore ps = LispPlugin.getDefault().getPreferenceStore();
		ca.enableAutoActivation(ps.getBoolean(PreferenceConstants.AUTO_POPUP_COMPLETIONS));
        ca.enableAutoInsert(ps.getBoolean(PreferenceConstants.AUTO_INSERT_COMPLETIONS));
		ca.setAutoActivationDelay(ps.getInt(PreferenceConstants.AUTO_POPUP_COMPLETIONS_DELAY));
		ca.setProposalPopupOrientation(ContentAssistant.CONTEXT_INFO_BELOW);
		if( ps.getBoolean(PreferenceConstants.ARGLIST_BELOW)){
			ca.setContextInformationPopupOrientation(ContentAssistant.CONTEXT_INFO_BELOW);
		} else {
			ca.setContextInformationPopupOrientation(ContentAssistant.CONTEXT_INFO_ABOVE);			
		}
        
        ps.addPropertyChangeListener(prefsListener);
	}
    
    public void finalize () {
        // is this the right way to do it?  No .dispose on config objects...
        LispPlugin.getDefault().getPreferenceStore().removePropertyChangeListener(prefsListener);
    }

    
    public static void callUrl(String url, int offset, IDocument doc) {
		String identifier = LispUtil.getCurrentFullWord(doc, offset);
		identifier = identifier.replace("'", "");
		identifier = identifier.replace("`", "");
		
		IWorkbenchBrowserSupport browser =
			LispPlugin.getDefault().getWorkbench().getBrowserSupport();
		try {
			browser.createBrowser("jasko.tim.lisp.lispdoc").openURL(new URL(
					url.replace("%s", identifier)));
		} catch (PartInitException e) {
			e.printStackTrace();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
    }
    
    public String showParameterHints () {  	
            return ca.showContextInformation();    		
    }
    
    public String showContentCompletions () {
        return ca.showPossibleCompletions();
    }
    
	public IContentAssistant getContentAssistant(ISourceViewer sourceViewer) {
		ca.setInformationControlCreator(new LispTextHoverControlCreator());
		return ca;
	}
	
	public ITextHover getTextHover(ISourceViewer sourceViewer, String contentType) {
		if (contentType.equals(IDocument.DEFAULT_CONTENT_TYPE)) {
			return new LispTextHover(editor);
		} else {
			return null;
		}
	}
	
	public IAnnotationHover getAnnotationHover(ISourceViewer sourceViewer) {
		return new MarkerAnnotationHover();
	}
	
	public String[] getConfiguredContentTypes(ISourceViewer sourceViewer) {
		return new String[] {
			IDocument.DEFAULT_CONTENT_TYPE,
			LispPartitionScanner.LISP_COMMENT,
			LispPartitionScanner.LISP_STRING,
			LispPartitionScanner.LISP_CHARACTER,
			LispPartitionScanner.LISP_SPECIAL_CHARACTER
			};
	}

	protected RuleBasedScanner getLispScanner() {
		if (tagScanner == null) {
			tagScanner = new LispScanner(colorManager, null);
			tagScanner.setDefaultReturnToken(
				new Token(
					new TextAttribute(
						colorManager.getColor(ColorManager.TokenType.DEFAULT))));
		}
		return tagScanner;
	}
	
	
	public IPresentationReconciler getPresentationReconciler(ISourceViewer sourceViewer) {
		//Set up the parentheses matching while we're here

     	ParenMatcher pm = new ParenMatcher();
		MatchingCharacterPainter painter = new MatchingCharacterPainter(
 			sourceViewer, pm);
		
		pm.setPainter(painter);
		//painter.setColor(Display.getDefault().getSystemColor(SWT.COLOR_DARK_GRAY));
		ITextViewerExtension2 extension = (ITextViewerExtension2)sourceViewer;
		extension.addPainter(painter);
		
	 	
		PresentationReconciler reconciler = new PresentationReconciler();

		DefaultDamagerRepairer dr =
			new DefaultDamagerRepairer(getLispScanner());
		reconciler.setDamager(dr, IDocument.DEFAULT_CONTENT_TYPE);
		reconciler.setRepairer(dr, IDocument.DEFAULT_CONTENT_TYPE);

		NonRuleBasedDamagerRepairer ndr =
			new NonRuleBasedDamagerRepairer(
				new TextAttribute(
					colorManager.getColor(ColorManager.TokenType.COMMENT), null, SWT.ITALIC));
		reconciler.setDamager(ndr, LispPartitionScanner.LISP_COMMENT);
		reconciler.setRepairer(ndr, LispPartitionScanner.LISP_COMMENT);
		
		NonRuleBasedDamagerRepairer ndr3 =
			new NonRuleBasedDamagerRepairer(
				new TextAttribute(
					colorManager.getColor(ColorManager.TokenType.DEFAULT)));
		reconciler.setDamager(ndr3, LispPartitionScanner.LISP_CHARACTER);
		reconciler.setRepairer(ndr3, LispPartitionScanner.LISP_CHARACTER);
		
		NonRuleBasedDamagerRepairer ndr2 =
			new NonRuleBasedDamagerRepairer(
				new TextAttribute(
					colorManager.getColor(ColorManager.TokenType.STRING)));
		reconciler.setDamager(ndr2, LispPartitionScanner.LISP_STRING);
		reconciler.setRepairer(ndr2, LispPartitionScanner.LISP_STRING);

		return reconciler;
	}
	
	public IAutoEditStrategy[] getAutoEditStrategies(ISourceViewer sourceViewer, String contentType) {
		return AllAutoEdits.get();
	}
	
	public String[] getIndentPrefixes(ISourceViewer sourceViewer,
         String contentType) {
		return null;
	}
	
	public int getTabWidth(ISourceViewer sourceViewer) {
		return 8; // Seems to match emacs defaults. Or at least the defaults on our particular build.
	}

	public IHyperlinkDetector[] getHyperlinkDetectors(ISourceViewer sourceViewer) {
		return new IHyperlinkDetector[] { new LispHyperlinkDetector(editor), new URLHyperlinkDetector() };
	}

    /* (non-Javadoc)
     * @see org.eclipse.jface.text.source.SourceViewerConfiguration#getReconciler(org.eclipse.jface.text.source.ISourceViewer)
     */
    public IReconciler getReconciler(ISourceViewer sourceViewer)
    {
        LispReconcilingStrategy strategy = new LispReconcilingStrategy();
        strategy.setEditor(editor);
        
        MonoReconciler reconciler = new MonoReconciler(strategy,false);
        
        return reconciler;
    }
}