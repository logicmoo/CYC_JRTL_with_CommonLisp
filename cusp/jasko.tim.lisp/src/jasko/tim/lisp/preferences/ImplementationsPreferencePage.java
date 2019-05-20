package jasko.tim.lisp.preferences;

import java.io.File;

import org.eclipse.jface.preference.*;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.ui.IWorkbench;
import jasko.tim.lisp.LispPlugin;

/**
 * This class represents a preference page that
 * is contributed to the Preferences dialog. By 
 * subclassing <samp>FieldEditorPreferencePage</samp>, we
 * can use the field support built into JFace that allows
 * us to create a page that is small and knows how to 
 * save, restore and apply itself.
 * <p>
 * This page is used to modify preferences only. They
 * are stored in the preference store that belongs to
 * the main plug-in class. That way, preferences can
 * be accessed directly via the preference store.
 */

public class ImplementationsPreferencePage extends FieldEditorPreferencePage
	implements IWorkbenchPreferencePage {

    private Composite libManagerIndent;
	
	public ImplementationsPreferencePage() {
		super(GRID);
	}
	
	
	/**
	 * Creates the field editors. Field editors are abstractions of
	 * the common GUI blocks needed to manipulate various types
	 * of preferences. Each field editor knows how to save and
	 * restore itself.
	 */
	public void createFieldEditors() {
		Composite parent = getFieldEditorParent();

		addField(new StringFieldEditor(
				PreferenceConstants.LISP_ARGUMENTS,
				"Lisp Executable &Arguments:",
				parent));
	
		StringFieldEditor ed = new StringFieldEditor(
				PreferenceConstants.LISP_ENVIRONMENT,
				"Lisp Executable &Environment:",
				parent);
		
		String envToolTip = "Format: VAR1=val;VAR2=val2;";
		ed.getLabelControl(parent).setToolTipText(envToolTip);
		ed.getTextControl(parent).setToolTipText(envToolTip);
		
		addField(ed);
	
		
		/*addField(new BooleanFieldEditor(
					PreferenceConstants.USE_SITEWIDE_LISP,
					"Use a lisp &sitewide installation (executable is on the path)",
					parent));*/

		
		addField(new FileFieldEditor(PreferenceConstants.LISP_EXE, 
				"&Lisp Executable:", parent));

		addField(new FileFieldEditor(PreferenceConstants.LISP_INI, 
				"&Initialization File:", parent));


		RadioGroupFieldEditor lispType = new RadioGroupFieldEditor(PreferenceConstants.LISP_TYPE, "Lisp Type", 1, 
				new String[][] {
				  { "SBCL", PreferenceConstants.SBCL_LISP },
				  { "Other",PreferenceConstants.OTHER_LISP}
				},parent);	
		addField(lispType);
		
		/////////////////
		
		RadioGroupFieldEditor compilations = new RadioGroupFieldEditor(PreferenceConstants.BUILD_TYPE, "How to handle compilation:", 1, 
				new String[][] {
				  { "Compile on Save (recommented)", PreferenceConstants.USE_AUTO_BUILD },
				  { "Eclipse Autobuild (not recommended)", 
					  PreferenceConstants.USE_ECLIPSE_BUILD },
				  { "Slime Style Build", PreferenceConstants.USE_SLIME_BUILD } 
				},parent);
		compilations.getRadioBoxControl(parent)
			.setToolTipText("- Compile on save: compiles only expressions changed by recent edits.\n" +
					"- Eclipse Autobuild: recompiles whole file on save.\n" +
					"- Slime Style Build: manually select which expressions to compile.");
		
		addField(compilations);

		addField(new BooleanFieldEditor(PreferenceConstants.MANAGE_PACKAGES, 
				"Use Cusp to manage libraries (requires Lisp restart)", parent){
            private boolean installedListener = false;
            protected Button getChangeControl (Composite parent) {
                // not sure how else to get a listener installed on the actual checkbox...
                final Button b = super.getChangeControl(parent);
                if (!installedListener) b.addSelectionListener(new SelectionAdapter () {
                    public void widgetSelected (SelectionEvent e) {
                        for (Control c : libManagerIndent.getChildren()) {
                            c.setEnabled(b.getSelection());
                        }
                    }
                });
                return b;
            }        	
		});

		libManagerIndent = new Composite(parent, SWT.NONE);
		libManagerIndent.setLayout(new GridLayout(2, false));
		StringFieldEditor strf = new StringFieldEditor(PreferenceConstants.SYSTEMS_PATH, 
				"Path to libraries:", libManagerIndent);
		StringFieldEditor sharedLibDir = new StringFieldEditor(PreferenceConstants.SYSTEMS_SHARED_PATH,"Path to Shared Libraries",libManagerIndent);
		
		String strfTipString = "Top levels. Cusp's library manager will search subdirectories.\n" +
				"Separate directories by ;\nNote: Requires Lisp restart";
		String sharedLibDirString = "Shared Lib Directory. Sets the path variable.\nCan nest up to 2 levels of directories.\nNote: Requires Cusp Restart";
		
		strf.getLabelControl(libManagerIndent).setToolTipText(strfTipString);
		strf.getTextControl(libManagerIndent).setToolTipText(strfTipString);	
		
		sharedLibDir.getLabelControl(libManagerIndent).setToolTipText(sharedLibDirString);
		sharedLibDir.getTextControl(libManagerIndent).setToolTipText(sharedLibDirString);
		
		addField(strf);
		
		addField(sharedLibDir);
        //addField(strf);
        
        for (Control c : libManagerIndent.getChildren()) {
            GridData gd = new GridData(GridData.BEGINNING, GridData.CENTER, false, false, 1, 1);
            gd.horizontalIndent = 25;
            c.setLayoutData(gd);
        }
        new Label(parent,SWT.NONE);

		
		addField(new BooleanFieldEditor(PreferenceConstants.USE_UNIT_TEST, 
				"Use LispUnit integrated with Cusp (requires Lisp restart)", 
				parent));

		addField(new BooleanFieldEditor(PreferenceConstants.CONSOLE_COMPILER_LOG, 
				"Write compiler log to Console", parent));
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
	 */
	public void init(IWorkbench workbench) {
		setPreferenceStore(LispPlugin.getDefault().getPreferenceStore());
		setDescription("Setup Lisp Implementation.");
	}


	
}