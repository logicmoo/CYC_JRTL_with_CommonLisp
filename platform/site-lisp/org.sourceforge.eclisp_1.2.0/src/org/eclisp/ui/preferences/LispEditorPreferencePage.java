package org.eclisp.ui.preferences;

import org.eclipse.jface.preference.*;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.ui.IWorkbench;
import org.eclisp.EclispPlugin;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * This class represents a preference page that is contributed to the
 * Preferences dialog. By subclassing <samp>FieldEditorPreferencePage </samp>,
 * we can use the field support built into JFace that allows us to create a page
 * that is small and knows how to save, restore and apply itself.
 * <p>
 * This page is used to modify preferences only. They are stored in the
 * preference store that belongs to the main plug-in class. That way,
 * preferences can be accessed directly via the preference store.
 */

public class LispEditorPreferencePage extends FieldEditorPreferencePage
        implements IWorkbenchPreferencePage {

    public static final String BRACKET_MATCHER_COLOR = "bracketMatcherColor";
    public static final String BRACKET_MATCHER_ENABLE = "bracketMatcherEnable";

    public LispEditorPreferencePage() {
        super(GRID);
        setPreferenceStore(EclispPlugin.getDefault().getPreferenceStore());
        setDescription("Lisp Editor Settings:");
        initializeDefaults();
    }

    /**
     * Sets the default values of the preferences.
     */
    private void initializeDefaults() {
        IPreferenceStore store = getPreferenceStore();
        store.setDefault(BRACKET_MATCHER_ENABLE, true);
        store.setDefault(BRACKET_MATCHER_COLOR, "128,129,130");
    }

    /**
     * Creates the field editors. Field editors are abstractions of the common
     * GUI blocks needed to manipulate various types of preferences. Each field
     * editor knows how to save and restore itself.
     */

    public void createFieldEditors() {
        addField(new BooleanFieldEditor(BRACKET_MATCHER_ENABLE,
                "&Enable matching bracket", getFieldEditorParent()));
        
        addField(new ColorFieldEditor(BRACKET_MATCHER_COLOR,
                "&Matching bracket color", getFieldEditorParent()));        
    }

    public void init(IWorkbench workbench) {
    }
}