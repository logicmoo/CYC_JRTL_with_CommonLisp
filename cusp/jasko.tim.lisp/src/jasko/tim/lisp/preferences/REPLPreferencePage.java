package jasko.tim.lisp.preferences;

import org.eclipse.jface.preference.*;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.ui.IWorkbench;
import jasko.tim.lisp.LispPlugin;

public class REPLPreferencePage extends FieldEditorPreferencePage implements IWorkbenchPreferencePage {
    private Composite indent;
    
    public REPLPreferencePage () {
        super(GRID);
    }

    public void createFieldEditors() {
        // this thing with the repl font styles would almost certainly be "easier" if I were to figure out how
        // to hook into the proper extension points -- however, the font styles extension point I found was
        // deprecated in Eclipse 3.0 in favor of the UI themes stuff, which is more of a hairball than
        // I can bring myself to figure out right this minute.  - Chas Emerick
        //final ArrayList<FieldEditor> replInspectableStyleEditors = new ArrayList<FieldEditor>();
        final Composite parent = getFieldEditorParent();
        addField(new BooleanFieldEditor(PreferenceConstants.USE_CTRL_ENTER,
        		"Eval on Ctrl+Enter. Use it when 'Automatically close (' is on.", 
        		parent));

        addField(new BooleanFieldEditor(PreferenceConstants.SHOW_EVAL_IN_REPL,
        		"Show expression evaluated from file in REPL",parent));

        /*addField(new BooleanFieldEditor(PreferenceConstants.DEBUG_HIDE_CUSP_FRAMES,
        		"Clean up backtraces in debugger: don't show cusp frames.", 
        		parent));*/

        addField(new StringFieldEditor(
                PreferenceConstants.REPL_FONT_SIZE,
                "REPL font size (Requires restart):",
                parent));

        addField(new org.eclipse.jface.preference.ColorFieldEditor(
                PreferenceConstants.REPL_INPUT_FG_COLOR,
                "Foreground text color for user input in REPL history: ",
                parent));

        addField(new org.eclipse.jface.preference.ColorFieldEditor(
                PreferenceConstants.REPL_INPUT_BG_COLOR,
                "Background text color for user input in REPL history: ",
                parent));        
        
        addField(new BooleanFieldEditor(
                    PreferenceConstants.DECORATE_REPL_INSPECTABLES,
                    "Apply custom style to inspectable objects in the REPL",
                    parent) {
            private boolean installedListener = false;
            protected Button getChangeControl (Composite parent) {
                // not sure how else to get a listener installed on the actual checkbox...
                final Button b = super.getChangeControl(parent);
                if (!installedListener) b.addSelectionListener(new SelectionAdapter () {
                    public void widgetSelected (SelectionEvent e) {
                        for (Control c : indent.getChildren()) {
                            c.setEnabled(b.getSelection());
                        }
                    }
                });
                return b;
            }
        });

        indent = new Composite(parent, 0);
        indent.setLayout(new GridLayout(2, false));
        addField(new BooleanFieldEditor(
                PreferenceConstants.REPL_INSPECTABLE_UNDERLINE,
                "Underline inspectable objects",
                indent));

        addField(new org.eclipse.jface.preference.ColorFieldEditor(
                PreferenceConstants.REPL_INSPECTABLE_FG_COLOR,
                "Inspectable foreground text color: ",
                indent));

        addField(new org.eclipse.jface.preference.ColorFieldEditor(
                PreferenceConstants.REPL_INSPECTABLE_BG_COLOR,
                "Inspectable background text color: ",
                indent));
        
        for (Control c : indent.getChildren()) {
            GridData gd = new GridData(GridData.BEGINNING, GridData.CENTER, false, false, 1, 1);
            gd.horizontalIndent = 25;
            c.setLayoutData(gd);
        }
    }

    /* (non-Javadoc)
     * @see org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
     */
    public void init(IWorkbench workbench) {
        setPreferenceStore(LispPlugin.getDefault().getPreferenceStore());
        setDescription("REPL Interaction and Formatting Options");
    }
    
}