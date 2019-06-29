/*
 * Created on 19.04.2004
 * 
 *  
 */
package org.eclisp.ui.editor;

import java.util.ResourceBundle;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.ui.editors.text.TextEditor;
import org.eclipse.ui.texteditor.ContentAssistAction;
import org.eclipse.ui.texteditor.ITextEditorActionDefinitionIds;
import org.eclipse.ui.texteditor.SourceViewerDecorationSupport;
import org.eclisp.EclispPlugin;
import org.eclisp.ui.preferences.LispEditorPreferencePage;

/**
 *  
 */
public class LispEditor extends TextEditor {

    /**
     *  
     */
    public LispEditor() {
        super();
        LispEditorEnvironment.connect(this);
    }

    protected void initializeEditor() {
        super.initializeEditor();
        setSourceViewerConfiguration(new LispSourceViewerConfiguration());
    }

    
    protected void configureSourceViewerDecorationSupport(
            SourceViewerDecorationSupport decoSupport) {
        super.configureSourceViewerDecorationSupport(decoSupport);

        IPreferenceStore store = EclispPlugin.getDefault().getPreferenceStore();
        
        decoSupport.setCharacterPairMatcher(new BracketPairMatcher());
        decoSupport.setCursorLinePainterPreferenceKeys(store.getString(LispEditorPreferencePage.BRACKET_MATCHER_ENABLE), store.getString(LispEditorPreferencePage.BRACKET_MATCHER_COLOR));
    }
    
	/** The <code>LispEditor</code> implementation of this 
	 * <code>AbstractTextEditor</code> method extend the 
	 * actions to add those specific to the receiver
	 */
	protected void createActions() {
		super.createActions();
		
		ResourceBundle bundle = ResourceBundle.getBundle("org.eclisp.ui.editor.LispEditorMessages");
		
        IAction action = new ContentAssistAction(bundle, "ContentAssistProposal.", this);
        
        // This action definition is associated with the accelerator Ctrl+Space
        action.setActionDefinitionId(ITextEditorActionDefinitionIds.CONTENT_ASSIST_PROPOSALS);
        setAction("ContentAssistProposal", action);
	}
}