/*
 * Created on 17.04.2004
 *
 * 
 */
package org.eclisp.ui.perspectives;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;


/**
 * This class represents the Lisp Perspective
 * 
 * @author Moritz Post
 */
public class LispPerspective implements IPerspectiveFactory {

    public void createInitialLayout(IPageLayout layout) {        
		// Get the editor area.
		String editorArea = layout.getEditorArea();

		
		
		layout.addPerspectiveShortcut("org.eclisp.ui.perspectives.lispPerspective");
		
        layout.addShowViewShortcut("org.eclisp.ui.views.lispView");
        
        // wizards
        layout.addNewWizardShortcut("org.eclisp.ui.wizards.newLispFileWizard");

        // standart views
		layout.addShowViewShortcut(IPageLayout.ID_OUTLINE);
		layout.addShowViewShortcut(IPageLayout.ID_PROBLEM_VIEW);
		layout.addShowViewShortcut(IPageLayout.ID_RES_NAV);
		layout.addShowViewShortcut(IPageLayout.ID_PROP_SHEET);
        
		// Top left: Resource Navigator view and Bookmarks view placeholder
		IFolderLayout topLeft = layout.createFolder("topLeft", IPageLayout.LEFT, 0.25f, editorArea);
		topLeft.addView(IPageLayout.ID_RES_NAV);

		// Bottom left: Outline view and Property Sheet view
//		IFolderLayout bottomLeft = layout.createFolder("bottomLeft", IPageLayout.BOTTOM, 0.50f,
//			"topLeft");
//		bottomLeft.addView(IPageLayout.ID_OUTLINE);
//		bottomLeft.addView(IPageLayout.ID_PROP_SHEET);

		// Bottom right: Task List view
		layout.addView(IPageLayout.ID_TASK_LIST, IPageLayout.BOTTOM, 0.66f, editorArea);
		
    }

}
