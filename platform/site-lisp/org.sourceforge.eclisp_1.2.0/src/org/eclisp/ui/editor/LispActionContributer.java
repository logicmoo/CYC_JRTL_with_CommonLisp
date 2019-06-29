/*
 * Created on 01.05.2004
 * 
 *  
 */
package org.eclisp.ui.editor;

import java.util.ResourceBundle;

import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.editors.text.TextEditorActionContributor;
import org.eclipse.ui.texteditor.ITextEditor;
import org.eclipse.ui.texteditor.ITextEditorActionDefinitionIds;
import org.eclipse.ui.texteditor.RetargetTextEditorAction;

/**
 *  
 */
public class LispActionContributer extends TextEditorActionContributor {

    private RetargetTextEditorAction fContentAssistProposal;

    public LispActionContributer() {
        super();
        ResourceBundle bundle = ResourceBundle.getBundle("org.eclisp.ui.editor.LispEditorMessages");
        fContentAssistProposal = new RetargetTextEditorAction(bundle, "ContentAssistProposal.");
        fContentAssistProposal
                .setActionDefinitionId(ITextEditorActionDefinitionIds.CONTENT_ASSIST_PROPOSALS);
    }

    private void doSetActiveEditor(IEditorPart part) {
        super.setActiveEditor(part);

        ITextEditor editor = null;
        if (part instanceof ITextEditor) {
            editor = (ITextEditor) part;
        }

        fContentAssistProposal.setAction(getAction(editor,
                "ContentAssistProposal"));
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.ui.part.EditorActionBarContributor#contributeToMenu(org.eclipse.jface.action.IMenuManager)
     */
    public void contributeToMenu(IMenuManager menu) {
        super.contributeToMenu(menu);
        //		
        //		IMenuManager navigateMenu=
        // menu.findMenuUsingPath(IWorkbenchActionConstants.M_NAVIGATE);
        //		if (navigateMenu != null) {
        //			navigateMenu.appendToGroup(IWorkbenchActionConstants.OPEN_EXT,
        // fOpenDeclarationAction);
        //			navigateMenu.setVisible(true);
        //		}
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.ui.part.EditorActionBarContributor#init(org.eclipse.ui.IActionBars)
     */
    public void init(IActionBars bars) {
        super.init(bars);

        IMenuManager menuManager = bars.getMenuManager();
        IMenuManager editMenu = menuManager
                .findMenuUsingPath(IWorkbenchActionConstants.M_EDIT);
        if (editMenu != null) {
            editMenu.add(new Separator());
            editMenu.add(fContentAssistProposal);
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.ui.IEditorActionBarContributor#setActiveEditor(org.eclipse.ui.IEditorPart)
     */
    public void setActiveEditor(IEditorPart part) {
        doSetActiveEditor(part);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.ui.IEditorActionBarContributor#dispose()
     */
    public void dispose() {
        doSetActiveEditor(null);
        super.dispose();
    }
}