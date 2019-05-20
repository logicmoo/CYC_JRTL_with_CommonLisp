package jasko.tim.lisp.preferences;


/**
 * Constant definitions for plug-in preferences
 */

public interface PreferenceConstants {

	public static final String LISP_TYPE = "lispType";
	public static final String SBCL_LISP = "SBCLLisp";
	public static final String OTHER_LISP = "otherLisp";
	public static final String LISP_ENVIRONMENT = "lispEnvironment";
	public static final String REGULAR_INDENT_LINE = "regularLineIndent";
	public static final String COLOR_COMMENT       = "colorComment";
	public static final String COLOR_CONSTANT      = "colorConstant";
	public static final String COLOR_DEFAULT       = "colorDefault";
	public static final String COLOR_KEYWORD       = "colorKeyword";
	public static final String COLOR_GLOBAL        = "colorGlobal";
	public static final String COLOR_NUMBER        = "colorNumber";
	public static final String COLOR_PAREN         = "colorParen";
	public static final String COLOR_PARAMS        = "colorParams";
	public static final String COLOR_SENT_MESSAGE  = "colorSentMessage";
	public static final String COLOR_STRINGS       = "colorStrings";
	public static final String COLOR_SYMBOL        = "colorSymbol";
	public static final String COLOR_UCW           = "colorUcw";

	public static final String SHOW_OUTLINE_HINT = "showOutlineHint";
	
	public static final String LISP_EXE = "lispExecutable";
	public static final String LISP_INI = "lispIni";
	//public static final String USE_SITEWIDE_LISP = "usePluginLisp";
	/**
	 * 	this preference should be accessed only through 
	 *  CuspInterface.getManagePackages - because its value should be constant
	 *  after lisp starts
	 */
	public static final String MANAGE_PACKAGES = "managePackages";
	/**
	 * 	this preference should be accessed only through 
	 *  CuspInterface.getUseUnitTest - because its value should be constant after
	 *  lisp starts
	 */
	public static final String USE_UNIT_TEST= "useUnitTest";
	public static final String CONSOLE_COMPILER_LOG = "consoleCompilerLog";
	public static final String SYSTEMS_PATH = "systemsPath";
	public static final String SYSTEMS_SHARED_PATH = "systemsSharedPath";
	
	public static final String USE_AUTO_BUILD = "useAutoBuild";
	public static final String USE_ECLIPSE_BUILD = "useEclipseBuild";
	public static final String USE_SLIME_BUILD = "useSlimeBuild";
	public static final String BUILD_TYPE = "buildType";
	public static final String SLIME_TYPE_PACK_EVAL = "slimeTypePackEval";
	
	public static final String LISP_ARGUMENTS =  "lispArguments";
	public static final String USE_REMOTE_LISP = "useRemoteLisp";
	public static final String SSH_COMMAND = "sshCommand";
	public static final String REMOTE_HOST = "remoteHost";
	public static final String REMOTE_USER = "remoteUser";
	public static final String REMOTE_LISP_EXE = "remoteLispExecutable";
	public static final String REMOTE_INI = "remoteLispIni";
	public static final String REMOTE_LOCAL_PATH_PREFIX = "localPathPrefix";
	public static final String REMOTE_REMOTE_PATH_PREFIX = "remotePathPrefix";

	public static final String PAIR_EDIT_BRACKETS = "pairEditBrackets";
	public static final String PAIR_SMART_BRACKETS = "pairSmartBrackets";
	public static final String PAIR_EDIT_BRACES = "pairEditBraces";
	public static final String PAIR_EDIT_QUOTES = "pairEditQuotes";
	public static final String PAIR_EDIT_COMMENTS = "pairEditComments";
	public static final String AUTO_POPUP_COMPLETIONS = "autoPopupCompletions";
	public static final String AUTO_POPUP_COMPLETIONS_DELAY = "autoPopupCompletionsDelay";
    public static final String AUTO_INSERT_COMPLETIONS = "autoInsertCompletions";
    public static final String AUTO_FUZZY_COMPLETIONS = "autoFuzzyCompletions";
    public static final String AUTO_COMPLETIONS_NLIMIT = "autoCompletionsNLimit";
    public static final String DOCS_IN_COMPLETIONS = "docsInCompletions";
    public static final String MAX_HINT_LINES = "maxHintLines";
    public static final String ARGLIST_BELOW = "arglistBelow";
    
    public static final String CUSTOM_AUTO_EDITS = "customAutoEdits";
    
	public static final String SHOW_EVAL_IN_REPL = "showEvalInRepl";
	public static final String USE_CTRL_ENTER = "useCtrlEnter";
    public static final String REPL_INPUT_BG_COLOR = "REPLInputColorBG";
    public static final String REPL_INPUT_FG_COLOR = "REPLInputColorFG";
    public static final String DECORATE_REPL_INSPECTABLES = "decorateREPLInspectables";
    public static final String REPL_INSPECTABLE_BG_COLOR = "REPLInspectableColorBG";
    public static final String REPL_INSPECTABLE_FG_COLOR = "REPLInspectableColorFG";
    public static final String REPL_INSPECTABLE_UNDERLINE = "REPLInspectableUnderline";
    public static final String REPL_FONT_SIZE = "REPLFontSize";
	public static final String DEBUG_HIDE_CUSP_FRAMES = "debugHideCuspFrames";
    
    public static final String OUTLINE_SORT = "OutlineSort";
    
    public static final String INDENT_ON_NO_ENCLOSING_SEXP = "indentOnNoEnclosingSexp";
    public static final String INDENT_PREVIOUS_LINE = "indentPreviousLine";
    public static final String EVALUATE_HIGHLIGHT = "evaluateHighlight";
    public static final String ALLOW_TABS = "allowTabsInStringsAndComments";

    public static final String NO_INDENT = "NO_INDENT";
    public static final String INDENT_SINGLE_LINE = "INDENT_SINGLE_LINE";
    public static final String INDENT_FIRST_LINE = "INDENT_FIRST_LINE";
    public static final String INDENT_ALL = "INDENT_ALL";
    public static final String STRING_INDENT_MODE = "stringIndentMode";
    	
	public static final String AUTOFOCUS_DEBUGGER = "autofocusDebugger";
	public static final String SWITCH_TO_EDITOR_FROM_DEBUGGER_IF = "switchToEditorFromDebuggerIf";

    public static final String EXTERNAL_COPY_FILE = "externalCopyFile";
    public static final String EXTERNAL_SHOW = "externalShow";

    public static final String SHOW_ECLIPSE_COMPILE_WARNING_DIALOG = "showEclipseCompileWarningDialog";
    
    public static final String EVAL_IN_PACKAGE = "evalInPackage";
    
    public static final String SPECIAL_WITH_INDENT = "specialWithIndent";
    
    public static final String ON_SAVE_CHECK_EXTRA = "onSaveCheckExtra";
  
    

}
