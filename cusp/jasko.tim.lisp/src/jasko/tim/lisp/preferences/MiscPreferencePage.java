package jasko.tim.lisp.preferences;

import org.eclipse.jface.preference.*;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.ui.IWorkbench;
import jasko.tim.lisp.LispPlugin;

public class MiscPreferencePage extends FieldEditorPreferencePage
implements IWorkbenchPreferencePage {

	public MiscPreferencePage() {
		super(GRID);
		setPreferenceStore(LispPlugin.getDefault().getPreferenceStore());
		//	setDescription("Lisp settings.");
	}


	/**
	 * Creates the field editors. Field editors are abstractions of
	 * the common GUI blocks needed to manipulate various types
	 * of preferences. Each field editor knows how to save and
	 * restore itself.
	 */

	public void createFieldEditors() {
		Composite parent = getFieldEditorParent();
        Group group = new Group(parent,SWT.SHADOW_IN);
        ///////////////////////////
        
        group.setText("Editor");
        group.setLayout(new RowLayout(SWT.VERTICAL));
	     addField(new BooleanFieldEditor(
	                PreferenceConstants.INDENT_ON_NO_ENCLOSING_SEXP,
	                "Automatically indent line on tab when there is no enclosing sexp",
	                group));
	     addField(new BooleanFieldEditor(
	                PreferenceConstants.INDENT_PREVIOUS_LINE,
	                "Automatically indent previous line on enter",
	                group));
	     addField(new BooleanFieldEditor(
	                PreferenceConstants.EVAL_IN_PACKAGE,
	                "Evaluate in toplevel package in which expression is located",
	                group));
	     ////////////////////////
	     group = new Group(parent,SWT.SHADOW_IN); 
	     group.setText("Highlighting");
	     group.setLayout(new RowLayout(SWT.VERTICAL));
	     addField(new BooleanFieldEditor(
	                PreferenceConstants.EVALUATE_HIGHLIGHT,
	                "Evaluate exactly what user highlights (must choose, alternative doesn't work currently)",
	                group));
	     ////////////////////////
	     group = new Group(parent,SWT.SHADOW_IN); 
	     group.setText("Debugger");
	     group.setLayout(new RowLayout(SWT.VERTICAL));
	     
	     addField(new BooleanFieldEditor(
	                PreferenceConstants.AUTOFOCUS_DEBUGGER,
	                "Autofocus on Debugger",
	                group));
	     
	     addField(new BooleanFieldEditor(
	                PreferenceConstants.SWITCH_TO_EDITOR_FROM_DEBUGGER_IF,
	                "Switch To Editor From Debugger if Editor was Active",
	                group));
	     
	     ////////////////////////
	     group = new Group(parent,SWT.SHADOW_IN); 
	     group.setText("Tabs");
	     group.setLayout(new RowLayout(SWT.VERTICAL));
	     
	     addField(new BooleanFieldEditor(
	                PreferenceConstants.ALLOW_TABS,
	                "Allow tabs in lisp strings and comments",
	                group));
	     addField(new BooleanFieldEditor(
	                PreferenceConstants.SPECIAL_WITH_INDENT,
	                "Indents everything that starts with WITH by default with 2 spaces",
	                group));
	     addField(new RadioGroupFieldEditor(PreferenceConstants.STRING_INDENT_MODE, "How to handle String idents", 1, 
					new String[][] {
					  { "No Indent", PreferenceConstants.NO_INDENT },
					  { "Indent Single Line", 
						  PreferenceConstants.INDENT_SINGLE_LINE},
					  { "Indent First Line", PreferenceConstants.INDENT_FIRST_LINE}, 
					  {"Indent All",PreferenceConstants.INDENT_ALL}
					},group));
	     ////////////////////////
	     group = new Group(parent,SWT.SHADOW_IN); 
	     group.setText("External Files");
	     group.setLayout(new RowLayout(SWT.VERTICAL));
	     
	     addField(new BooleanFieldEditor(
	                PreferenceConstants.EXTERNAL_COPY_FILE,
	                "Copy External Files from System",
	                group));
	     addField(new BooleanFieldEditor(
	                PreferenceConstants.EXTERNAL_SHOW,
	                "Show External File Dialog",
	                group));
	     ////////////////////////
	     group = new Group(parent,SWT.SHADOW_IN); 
	     group.setText("Compiling");
	     group.setLayout(new RowLayout(SWT.VERTICAL));
	     
	     addField(new BooleanFieldEditor(
	                PreferenceConstants.SHOW_ECLIPSE_COMPILE_WARNING_DIALOG,
	                "Show Compile File Warning Dialog",
	                group));
	     ////////////////////////
	     group = new Group(parent,SWT.SHADOW_IN); 
	     group.setText("Saving");
	     group.setLayout(new RowLayout(SWT.VERTICAL));

	     addField(new BooleanFieldEditor(
	                PreferenceConstants.ON_SAVE_CHECK_EXTRA ,
	                "Check for unloaded packages, repeated functions, and commas",
	                group));
	     ///////////////////////////
	     
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
	 */
	public void init(IWorkbench workbench) {
	}
}


