package jasko.tim.lisp.preferences;

import java.util.StringTokenizer;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.ui.texteditor.AbstractDecoratedTextEditorPreferenceConstants;

import jasko.tim.lisp.LispPlugin;
import jasko.tim.lisp.ColorManager;

/**
 * Class used to initialize default preference values.
 */

public class PreferenceInitializer extends AbstractPreferenceInitializer implements PreferenceConstants {

    private static final HashMap<String, String> DEFAULT_COLOR_MAP = new HashMap<String, String>();
    
    static {
        DEFAULT_COLOR_MAP.put(COLOR_COMMENT, rgbAsPrefString(ColorManager.DEFAULT_COMMENT));
        DEFAULT_COLOR_MAP.put(COLOR_CONSTANT, rgbAsPrefString(ColorManager.DEFAULT_CONSTANT));
        DEFAULT_COLOR_MAP.put(COLOR_GLOBAL, rgbAsPrefString(ColorManager.DEFAULT_GLOBAL));
        DEFAULT_COLOR_MAP.put(COLOR_KEYWORD, rgbAsPrefString(ColorManager.DEFAULT_KEYWORD));
        DEFAULT_COLOR_MAP.put(COLOR_NUMBER, rgbAsPrefString(ColorManager.DEFAULT_NUMBER));
        DEFAULT_COLOR_MAP.put(COLOR_PARAMS, rgbAsPrefString(ColorManager.DEFAULT_PARAMS));
        DEFAULT_COLOR_MAP.put(COLOR_PAREN, rgbAsPrefString(ColorManager.DEFAULT_PAREN));
        DEFAULT_COLOR_MAP.put(COLOR_SENT_MESSAGE, rgbAsPrefString(ColorManager.DEFAULT_SENT_MESSAGE));
        DEFAULT_COLOR_MAP.put(COLOR_STRINGS, rgbAsPrefString(ColorManager.DEFAULT_STRING));
        DEFAULT_COLOR_MAP.put(COLOR_SYMBOL, rgbAsPrefString(ColorManager.DEFAULT_SYMBOL));
        DEFAULT_COLOR_MAP.put(COLOR_UCW, rgbAsPrefString(ColorManager.DEFAULT_UCW));
        
        DEFAULT_COLOR_MAP.put(REPL_INSPECTABLE_BG_COLOR, rgbAsPrefString(ColorManager.DEFAULT_REPL_INSPECTABLE_BG_COLOR));
        DEFAULT_COLOR_MAP.put(REPL_INSPECTABLE_FG_COLOR, rgbAsPrefString(ColorManager.DEFAULT_REPL_INSPECTABLE_FG_COLOR));
        DEFAULT_COLOR_MAP.put(REPL_INPUT_BG_COLOR, rgbAsPrefString(ColorManager.DEFAULT_REPL_INPUT_BG_COLOR));
        DEFAULT_COLOR_MAP.put(REPL_INPUT_FG_COLOR, rgbAsPrefString(ColorManager.DEFAULT_REPL_INPUT_FG_COLOR));
    }
    
	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer#initializeDefaultPreferences()
	 */
    public static IPreferenceStore getStore ()
    {
    	return LispPlugin.getDefault().getPreferenceStore();
    }
    
	public void initializeDefaultPreferences() {
	
		IPreferenceStore store = LispPlugin.getDefault().getPreferenceStore();
		for (Map.Entry<String, String> e: DEFAULT_COLOR_MAP.entrySet()) {
			store.setDefault((String)e.getKey(), (String)e.getValue());
		}
        
		store.setDefault(LISP_ENVIRONMENT,"");
		store.setDefault(MANAGE_PACKAGES, true);
		store.setDefault(USE_UNIT_TEST, true);
		store.setDefault(BUILD_TYPE, USE_AUTO_BUILD);
		store.setDefault(LISP_TYPE,SBCL_LISP);
		store.setDefault(SHOW_OUTLINE_HINT, true);
		
		store.setDefault(SHOW_EVAL_IN_REPL, true);
		store.setDefault(USE_CTRL_ENTER, false);
		//TODO: Make Paredit
        store.setDefault(PAIR_EDIT_BRACKETS, false);
        store.setDefault(PAIR_SMART_BRACKETS, false);
        store.setDefault(PAIR_EDIT_BRACES, false);
        store.setDefault(PAIR_EDIT_QUOTES, false);
        store.setDefault(PAIR_EDIT_COMMENTS, true);
        store.setDefault(AUTO_POPUP_COMPLETIONS, true);
        store.setDefault(AUTO_POPUP_COMPLETIONS_DELAY, 700);
        store.setDefault(AUTO_INSERT_COMPLETIONS, false);
        store.setDefault(AUTO_FUZZY_COMPLETIONS, false);
        store.setDefault(DOCS_IN_COMPLETIONS, true);
        store.setDefault(MAX_HINT_LINES, 20);
        store.setDefault(ARGLIST_BELOW, false);
        store.setDefault(DEBUG_HIDE_CUSP_FRAMES, true);
        store.setDefault(CUSTOM_AUTO_EDITS, "let ;let ((|))\tdefun ;defun | ()\n  ");
        store.setDefault(AUTO_COMPLETIONS_NLIMIT, 20);
        
        store.setDefault(DECORATE_REPL_INSPECTABLES, true);
        store.setDefault(REPL_INSPECTABLE_UNDERLINE, true);
        store.setDefault(REPL_FONT_SIZE, 9);
        
        store.setDefault(OUTLINE_SORT, 1);
        
        store.setDefault(SSH_COMMAND, "ssh");
        store.setDefault(REMOTE_LISP_EXE, "sbcl");
        store.setDefault(REMOTE_INI, "~/.sbcl/slime/cusp-loader.lisp");
        
        store.setDefault(INDENT_ON_NO_ENCLOSING_SEXP,true);
        store.setDefault(INDENT_PREVIOUS_LINE,true);
        store.setDefault(EVALUATE_HIGHLIGHT,true);
        store.setDefault(AUTOFOCUS_DEBUGGER,false);
        store.setDefault(SWITCH_TO_EDITOR_FROM_DEBUGGER_IF,true);
        store.setDefault(EVAL_IN_PACKAGE,false);
        
        store.setDefault(ALLOW_TABS,false);
	   	store.setDefault(EXTERNAL_COPY_FILE,true);
	   	store.setDefault(EXTERNAL_SHOW,true);
	   	store.setDefault(SHOW_ECLIPSE_COMPILE_WARNING_DIALOG,true);
	   	
	   	store.setDefault(STRING_INDENT_MODE,INDENT_FIRST_LINE);
        store.setDefault(SPECIAL_WITH_INDENT, true);
        
	   	store.setDefault(ON_SAVE_CHECK_EXTRA ,false);
	   	
	
	} 

	/**
	 * Returns the default rgb preference string for the given color id.
	 * @param colorId - one of the color constants specified in {@link PreferenceConstants}.
	 */
	public static String getDefaultColorFor (String colorId) {
		return DEFAULT_COLOR_MAP.get(colorId);
	}

	
	protected static String rgbAsPrefString(RGB rgb) { 
		return "" + rgb.red + "," + rgb.green + "," + rgb.blue + "";
	}

	/*
	 *  Dealing with CustomAutoEdits preferences - probably not the best place in initializer
	 */
	private static String PREFERENCE_DELIMITER = "\t"; //how auto edits delimited
	private static String AUTO_EDIT_DELIMITER = ";"; //how input is delimited from output in one auto
	
	public static String[] getDefaultCustomAutoEditsPreference() {
		return convert(
				LispPlugin.getDefault().getPreferenceStore().getDefaultString(CUSTOM_AUTO_EDITS));
	}
	
	public static String[] getCustomAutoEditsPreference() {
		return convert(LispPlugin.getDefault().getPreferenceStore().getString(CUSTOM_AUTO_EDITS));
	}
		
	public static String[] getCustomAutoEditsPreference2() {
		return convert2(LispPlugin.getDefault().getPreferenceStore().getString(CUSTOM_AUTO_EDITS));
	}

	private static String[] convert(String preferenceValue) {
		StringTokenizer tokenizer =
			new StringTokenizer(preferenceValue, PREFERENCE_DELIMITER);
		int tokenCount = tokenizer.countTokens();
		String[] elements = new String[tokenCount];
		for (int i = 0; i < tokenCount; ++i) {
				elements[i] = tokenizer.nextToken();
		}

		return elements;
	}

	// get strings: odd - match, even - replace
	private static String[] convert2(String prefVal){
		String[] str1 = convert(prefVal);
		String[] res = new String[2*str1.length];
		for( int i = 0; i < str1.length; ++i ){
			StringTokenizer tk = new StringTokenizer(str1[i],AUTO_EDIT_DELIMITER);
			if( tk.countTokens() == 2 ){
				res[2*i] = tk.nextToken();
				res[2*i+1] = tk.nextToken();
			} else {
				res[2*i] = null;
				res[2*i+1] = null;
				System.out.print("<> Bad auto-edit string: "+str1[i]);
			}
		}
		return res;
	}
	

	public static void setCustomAutoEditPreference(String[] elements) {
		StringBuffer buffer = new StringBuffer();
		for (int i = 0; i < elements.length; i++) {
			buffer.append(elements[i]);
			buffer.append(PREFERENCE_DELIMITER);
		}
		LispPlugin.getDefault().getPreferenceStore().setValue(CUSTOM_AUTO_EDITS, buffer.toString());
	}
	
}
