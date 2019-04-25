package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cb_shop extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.cb_shop";
    public static final String myFingerPrint = "bacf773d709ef722d0582544a6b454c5aaa6322309af564ee283697fecc23981";
    @SubLTranslatedFile.SubL(source = "cycl/cb-shop.lisp", position = 830L)
    private static SubLSymbol $cyc_development_environment$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-shop.lisp", position = 886L)
    private static SubLSymbol $cb_planner_default_domain_mt$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-shop.lisp", position = 944L)
    private static SubLSymbol $cb_shop_planner$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-shop.lisp", position = 989L)
    public static SubLSymbol $cb_shop_task_string$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-shop.lisp", position = 1079L)
    public static SubLSymbol $cb_planner_warning_message$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-shop.lisp", position = 1132L)
    public static SubLSymbol $cb_shop_planner_thread$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-shop.lisp", position = 1194L)
    public static SubLSymbol $cb_planner_task$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-shop.lisp", position = 1236L)
    public static SubLSymbol $cb_planner_domain_mt$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-shop.lisp", position = 1310L)
    public static SubLSymbol $cb_last_planner_format$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-shop.lisp", position = 1361L)
    public static SubLSymbol $cb_last_planner_structure$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-shop.lisp", position = 1423L)
    public static SubLSymbol $cb_last_planner_number$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-shop.lisp", position = 1472L)
    public static SubLSymbol $cb_shop_time_cutoff$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-shop.lisp", position = 1519L)
    public static SubLSymbol $cb_shop_depth_limit$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-shop.lisp", position = 1564L)
    public static SubLSymbol $cb_shop_num_backchains$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-shop.lisp", position = 1611L)
    public static SubLSymbol $cb_last_planner_do_fi_asks$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-shop.lisp", position = 1664L)
    public static SubLSymbol $cb_shop_cycle_checking_enabledP$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-shop.lisp", position = 1720L)
    public static SubLSymbol $cb_last_planner_show_advanced_settings$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-shop.lisp", position = 1786L)
    public static SubLSymbol $cb_plan_search_type$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-shop.lisp", position = 1833L)
    public static SubLSymbol $cb_shop_verbosity$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-shop.lisp", position = 1875L)
    private static SubLSymbol $cb_plan_displayers$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-shop.lisp", position = 2285L)
    private static SubLSymbol $cb_shop_plan_checking_enabled$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-shop.lisp", position = 2342L)
    private static SubLSymbol $cb_shop_plan_checking_rules$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-shop.lisp", position = 12225L)
    private static SubLSymbol $cb_shop_refresh_rate$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-shop.lisp", position = 36039L)
    private static SubLSymbol $cb_shop_process_label$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-shop.lisp", position = 36105L)
    private static SubLSymbol $cb_shop_processes$;
    private static final SubLSymbol $sym0$_CB_SHOP_TASK_STRING_;
    private static final SubLSymbol $sym1$_CB_PLANNER_WARNING_MESSAGE_;
    private static final SubLSymbol $sym2$_CB_SHOP_PLANNER_THREAD_;
    private static final SubLSymbol $sym3$_CB_PLANNER_TASK_;
    private static final SubLSymbol $sym4$_CB_PLANNER_DOMAIN_MT_;
    private static final SubLSymbol $kw5$CYCL;
    private static final SubLSymbol $sym6$_CB_LAST_PLANNER_FORMAT_;
    private static final SubLSymbol $kw7$HIERARCHICAL;
    private static final SubLSymbol $sym8$_CB_LAST_PLANNER_STRUCTURE_;
    private static final SubLSymbol $sym9$_CB_LAST_PLANNER_NUMBER_;
    private static final SubLInteger $int10$500;
    private static final SubLSymbol $sym11$_CB_SHOP_TIME_CUTOFF_;
    private static final SubLInteger $int12$75;
    private static final SubLSymbol $sym13$_CB_SHOP_DEPTH_LIMIT_;
    private static final SubLSymbol $sym14$_CB_SHOP_NUM_BACKCHAINS_;
    private static final SubLSymbol $sym15$_CB_LAST_PLANNER_DO_FI_ASKS_;
    private static final SubLSymbol $sym16$_CB_SHOP_CYCLE_CHECKING_ENABLED__;
    private static final SubLSymbol $sym17$_CB_LAST_PLANNER_SHOW_ADVANCED_SETTINGS_;
    private static final SubLSymbol $kw18$ALL;
    private static final SubLSymbol $sym19$_CB_PLAN_SEARCH_TYPE_;
    private static final SubLSymbol $sym20$_CB_SHOP_VERBOSITY_;
    private static final SubLSymbol $sym21$CLET;
    private static final SubLList $list22;
    private static final SubLSymbol $sym23$_CB_SHOP_PLAN_CHECKING_ENABLED_;
    private static final SubLSymbol $sym24$_CB_SHOP_PLAN_CHECKING_RULES_;
    private static final SubLSymbol $sym25$VALID_ASSERTION;
    private static final SubLString $str26$Not_a_planning_assertion_;
    private static final SubLString $str27$Rule_has_been_added_to_SHOP_plan_;
    private static final SubLSymbol $sym28$CB_SHOP_USE_IN_PLAN_CHECKING;
    private static final SubLSymbol $kw29$HTML_HANDLER;
    private static final SubLSymbol $sym30$ASSERTION_P;
    private static final SubLString $str31$_Use_in_Plan_Checking_;
    private static final SubLSymbol $kw32$SELF;
    private static final SubLString $str33$cb_shop_use_in_plan_checking__a;
    private static final SubLSymbol $kw34$USE_IN_PLAN_CHECKING;
    private static final SubLSymbol $sym35$CB_LINK_USE_IN_PLAN_CHECKING;
    private static final SubLSymbol $kw36$CB_SHOP_PLAN_CHECKING;
    private static final SubLString $str37$cb_shop_plan_checking_html;
    private static final SubLSymbol $kw38$DISABLE;
    private static final SubLSymbol $kw39$ENABLE;
    private static final SubLSymbol $kw40$DISCARD;
    private static final SubLSymbol $kw41$UPDATE;
    private static final SubLSymbol $kw42$SELECTED_RULES;
    private static final SubLString $str43$Plan_Checking_Control;
    private static final SubLString $str44$__DOCTYPE_html_PUBLIC_____W3C__DT;
    private static final SubLString $str45$_meta_http_equiv__X_UA_Compatible;
    private static final SubLSymbol $kw46$UNINITIALIZED;
    private static final SubLSymbol $kw47$CB_CYC;
    private static final SubLSymbol $kw48$SAM_AUTOCOMPLETE_CSS;
    private static final SubLSymbol $kw49$SHA1;
    private static final SubLString $str50$yui_skin_sam;
    private static final SubLString $str51$reloadFrameButton;
    private static final SubLString $str52$button;
    private static final SubLString $str53$reload;
    private static final SubLString $str54$Refresh_Frames;
    private static final SubLString $str55$post;
    private static final SubLString $str56$cb_shop_plan_checking;
    private static final SubLSymbol $kw57$PLANNER;
    private static final SubLString $str58$_Back_to_Planner_;
    private static final SubLString $str59$Plan_Checking_is_;
    private static final SubLString $str60$Enabled_;
    private static final SubLString $str61$Disabled_;
    private static final SubLString $str62$Disable;
    private static final SubLString $str63$Enable;
    private static final SubLString $str64$Update;
    private static final SubLString $str65$Discard_All;
    private static final SubLString $str66$Choose_Planning_Rules_for_inclusi;
    private static final SubLString $str67$No_Rules_in_plan_checking_set_;
    private static final SubLSymbol $kw68$TOP;
    private static final SubLSymbol $sym69$CB_SHOP_PLAN_CHECKING;
    private static final SubLString $str70$_Plan_Checking_;
    private static final SubLSymbol $kw71$PLAN_CHECKING;
    private static final SubLSymbol $sym72$CB_LINK_PLAN_CHECKING;
    private static final SubLSymbol $kw73$POS;
    private static final SubLSymbol $sym74$CYC_DEVELOPMENT_PLANNER;
    private static final SubLSymbol $sym75$SHOP;
    private static final SubLList $list76;
    private static final SubLSymbol $sym77$OBJECT;
    private static final SubLSymbol $sym78$INSTANCE_COUNT;
    private static final SubLSymbol $sym79$SUBLOOP_RESERVED_INITIALIZE_CYC_DEVELOPMENT_PLANNER_CLASS;
    private static final SubLSymbol $sym80$ISOLATED_P;
    private static final SubLSymbol $sym81$INSTANCE_NUMBER;
    private static final SubLSymbol $sym82$DISPLAYER_FACTORY;
    private static final SubLSymbol $sym83$DOMAIN_TABLE;
    private static final SubLSymbol $sym84$PROBLEM_TABLE;
    private static final SubLSymbol $sym85$THREADS;
    private static final SubLSymbol $sym86$SUBLOOP_RESERVED_INITIALIZE_CYC_DEVELOPMENT_PLANNER_INSTANCE;
    private static final SubLSymbol $sym87$INITIALIZE;
    private static final SubLList $list88;
    private static final SubLList $list89;
    private static final SubLSymbol $sym90$OUTER_CATCH_FOR_CYC_DEVELOPMENT_PLANNER_METHOD;
    private static final SubLSymbol $sym91$CYC_DEVELOPMENT_PLAN_DISPLAYER_FACTORY;
    private static final SubLSymbol $sym92$CYC_DEVELOPMENT_PLANNER_INITIALIZE_METHOD;
    private static final SubLSymbol $sym93$MAKE_DOMAIN_WITH_RULES;
    private static final SubLList $list94;
    private static final SubLList $list95;
    private static final SubLList $list96;
    private static final SubLSymbol $sym97$OUTER_CATCH_FOR_CYC_DEVELOPMENT_PLANNER_METHOD;
    private static final SubLSymbol $sym98$SHOP_CYC_DOMAIN;
    private static final SubLSymbol $sym99$CYC_DEVELOPMENT_PLANNER_MAKE_DOMAIN_WITH_RULES_METHOD;
    private static final SubLSymbol $sym100$MAKE_DOMAIN_FROM_PROOF_CHECKER;
    private static final SubLList $list101;
    private static final SubLList $list102;
    private static final SubLSymbol $sym103$CYC_DEVELOPMENT_PLANNER_MAKE_DOMAIN_FROM_PROOF_CHECKER_METHOD;
    private static final SubLString $str104$Plan_Finder;
    private static final SubLString $str105$Cannot_have_a_FRAMESET_tag_inside;
    private static final SubLString $str106$400__;
    private static final SubLSymbol $kw107$CB_SHOP_CONTROLS;
    private static final SubLSymbol $kw108$CB_SHOP_SUMMARY;
    private static final SubLSymbol $sym109$PLAN_FINDER;
    private static final SubLString $str110$Planner_Examiner;
    private static final SubLSymbol $sym111$PLAN_EXAMINER;
    private static final SubLString $str112$Plan_Verbose_Examiner;
    private static final SubLSymbol $sym113$PLAN_VERBOSE_EXAMINER;
    private static final SubLString $str114$Plan_Task_Examiner;
    private static final SubLSymbol $sym115$PLAN_TASK_EXAMINER;
    private static final SubLString $str116$controls;
    private static final SubLString $str117$cb_shop_controls;
    private static final SubLString $str118$info;
    private static final SubLString $str119$cb_shop_information;
    private static final SubLString $str120$_Summary_;
    private static final SubLSymbol $kw121$MAIN;
    private static final SubLSymbol $sym122$CB_LINK_CB_SHOP_SUMMARY;
    private static final SubLString $str123$_Controls_;
    private static final SubLSymbol $sym124$CB_LINK_CB_SHOP_CONTROLS;
    private static final SubLString $str125$_Plan_Finder_;
    private static final SubLString $str126$plan_finder;
    private static final SubLSymbol $sym127$CB_LINK_PLANNER;
    private static final SubLString $str128$_Plan_Examiner_;
    private static final SubLString $str129$plan_examiner;
    private static final SubLSymbol $kw130$PLAN_EXAMINER;
    private static final SubLSymbol $sym131$CB_LINK_PLAN_EXAMINER;
    private static final SubLString $str132$_Plan_Verbose_Examiner_;
    private static final SubLString $str133$plan_verbose_examiner;
    private static final SubLSymbol $kw134$PLAN_VERBOSE_EXAMINER;
    private static final SubLSymbol $sym135$CB_LINK_PLAN_VERBOSE_EXAMINER;
    private static final SubLString $str136$Planner;
    private static final SubLString $str137$Simple_Hierarchical_Ordered_Plann;
    private static final SubLSymbol $sym138$CB_SHOP_CONTROLS;
    private static final SubLString $str139$Summary;
    private static final SubLString $str140$_New_Plan_;
    private static final SubLString $str141$_Full_Screen_;
    private static final SubLSymbol $sym142$CB_SHOP_INFORMATION;
    private static final SubLString $str143$Hierarchical_Ordered_Planner;
    private static final SubLString $str144$find_plans;
    private static final SubLString $str145$show_advanced_parameters;
    private static final SubLString $str146$red;
    private static final SubLString $str147$Warning_;
    private static final SubLString $str148$verbosity_level;
    private static final SubLString $str149$cutoff_number;
    private static final SubLString $str150$number;
    private static final SubLString $str151$cutoff_time;
    private static final SubLString $str152$time;
    private static final SubLString $str153$do_fi_asks;
    private static final SubLString $str154$do_asks;
    private static final SubLString $str155$num_backchains;
    private static final SubLString $str156$cycle_checking;
    private static final SubLString $str157$depth_limit_p;
    private static final SubLString $str158$depth_limit;
    private static final SubLString $str159$search_type;
    private static final SubLString $str160$logging;
    private static final SubLString $str161$no_logging;
    private static final SubLString $str162$domain_mt;
    private static final SubLString $str163$task;
    private static final SubLString $str164$Task_syntax_not_recognized_;
    private static final SubLSymbol $sym165$MAKE_NEW_THREAD;
    private static final SubLSymbol $sym166$OUTPUT_STREAM;
    private static final SubLString $str167$___s_is_not_a_valid__s_microtheor;
    private static final SubLObject $const168$PlanningDomainMicrotheory;
    private static final SubLString $str169$Domain;
    private static final SubLString $str170$Task;
    private static final SubLString $str171$__Please_enter_an_instance_of__s_;
    private static final SubLSymbol $sym172$FIND_PLANS;
    private static final SubLString $str173$Show;
    private static final SubLString $str174$Hide;
    private static final SubLString $str175$Last_task_;
    private static final SubLString $str176$Planner_halted_because__;
    private static final SubLSymbol $kw177$SEARCH_EXHAUSTED;
    private static final SubLString $str178$Search_space_was_exhausted_;
    private static final SubLSymbol $kw179$DEPTH_CUTOFF;
    private static final SubLString $str180$Depth_limit_was_reached_;
    private static final SubLSymbol $kw181$NUMBER_CUTOFF;
    private static final SubLString $str182$Number_cutoff_was_reached_;
    private static final SubLSymbol $kw183$TIME_CUTOFF;
    private static final SubLString $str184$Time_cutoff_was_reached_;
    private static final SubLString $str185$_Examine_Plans_;
    private static final SubLString $str186$_Examine_Verbose_Output_;
    private static final SubLSymbol $kw187$PLAN_FINDER;
    private static final SubLString $str188$plan_finder_html;
    private static final SubLString $str189$Plan_Checking_Enabled;
    private static final SubLString $str190$Complete;
    private static final SubLString $str191$Mt_;
    private static final SubLString $str192$Clear_Mt;
    private static final SubLString $str193$Task_;
    private static final SubLString $str194$Clear_Task;
    private static final SubLInteger $int195$24;
    private static final SubLString $str196$Find_Plans;
    private static final SubLInteger $int197$80;
    private static final SubLString $str198$virtual;
    private static final SubLString $str199$95_;
    private static final SubLSymbol $kw200$LEFT;
    private static final SubLString $str201$50;
    private static final SubLString $str202$Advanced_Planning_Parameters;
    private static final SubLString $str203$SHOP_Domain_Examiner;
    private static final SubLString $str204$_Verbose_Output_;
    private static final SubLString $str205$Go_to_;
    private static final SubLString $str206$_methods;
    private static final SubLString $str207$Methods;
    private static final SubLString $str208$_operators;
    private static final SubLString $str209$Operators;
    private static final SubLString $str210$_cond_operators;
    private static final SubLString $str211$Conditional_Ops;
    private static final SubLString $str212$_sconds;
    private static final SubLString $str213$Sufficient_Conditions;
    private static final SubLString $str214$Planning_Mt_;
    private static final SubLSymbol $sym215$GET_NAME;
    private static final SubLString $str216$methods;
    private static final SubLSymbol $sym217$HTML_DISPLAY_ALL_METHODS;
    private static final SubLString $str218$operators;
    private static final SubLSymbol $sym219$HTML_DISPLAY_ALL_OPERATORS;
    private static final SubLString $str220$cond_operators;
    private static final SubLString $str221$Conditional_Operators;
    private static final SubLSymbol $sym222$HTML_DISPLAY_ALL_CONDITIONAL_OPERATORS;
    private static final SubLString $str223$sconds;
    private static final SubLSymbol $sym224$HTML_DISPLAY_ALL_SCONDS;
    private static final SubLString $str225$SHOP_Log;
    private static final SubLSymbol $sym226$LOG;
    private static final SubLSymbol $sym227$P_WRAPPER;
    private static final SubLSymbol $sym228$VERBOSE;
    private static final SubLString $str229$No_Verbose_Output__Set_Verbosity_;
    private static final SubLSymbol $sym230$DISPLAY_HTML_LOG;
    private static final SubLString $str231$plan_examiner_html;
    private static final SubLString $str232$Plan_Examiner;
    private static final SubLString $str233$handle_plan_examiner_input;
    private static final SubLSymbol $sym234$HALT_STATUS;
    private static final SubLSymbol $sym235$PROBLEM;
    private static final SubLString $str236$format;
    private static final SubLString $str237$structure;
    private static final SubLString $str238$_cycl;
    private static final SubLSymbol $kw239$ENGLISH;
    private static final SubLString $str240$_hierarchical;
    private static final SubLSymbol $kw241$PRIMITIVE;
    private static final SubLSymbol $sym242$HANDLE_PLAN_EXAMINER_INPUT;
    private static final SubLString $str243$Change_View;
    private static final SubLString $str244$submit;
    private static final SubLString $str245$Format_;
    private static final SubLString $str246$_english;
    private static final SubLString $str247$English;
    private static final SubLString $str248$CycL;
    private static final SubLString $str249$Structure_;
    private static final SubLString $str250$_primitive;
    private static final SubLString $str251$Primitive;
    private static final SubLString $str252$Hierarchical;
    private static final SubLString $str253$;
    private static final SubLString $str254$Number_Cutoff_;
    private static final SubLString $str255$no_number;
    private static final SubLString $str256$All_plans;
    private static final SubLString $str257$_plans;
    private static final SubLString $str258$Time_Cutoff_;
    private static final SubLString $str259$no_time;
    private static final SubLString $str260$Run_forever;
    private static final SubLString $str261$_seconds;
    private static final SubLString $str262$Depth_Cutoff_;
    private static final SubLString $str263$no_depth_limit;
    private static final SubLString $str264$No;
    private static final SubLString $str265$Yes;
    private static final SubLString $str266$Back_Chaining_;
    private static final SubLString $str267$nil;
    private static final SubLString $str268$No_backchaining;
    private static final SubLString $str269$_backchains;
    private static final SubLString $str270$Cycle_Checking_;
    private static final SubLString $str271$no_cycle_checking;
    private static final SubLString $str272$Log_Process_;
    private static final SubLString $str273$_all;
    private static final SubLString $str274$_first;
    private static final SubLSymbol $kw275$FIRST;
    private static final SubLString $str276$_shallowest;
    private static final SubLSymbol $kw277$SHALLOWEST;
    private static final SubLString $str278$_all_shallowest;
    private static final SubLSymbol $kw279$ALL_SHALLOWEST;
    private static final SubLString $str280$_id_first;
    private static final SubLSymbol $kw281$ID_FIRST;
    private static final SubLString $str282$_id_all;
    private static final SubLSymbol $kw283$ID_ALL;
    private static final SubLSymbol $sym284$HTML_TASK_DISPLAYER;
    private static final SubLSymbol $sym285$FIND_INSTANCE_BY_ID_STRING;
    private static final SubLSymbol $sym286$HTML_TASK_PAGE;
    private static final SubLString $str287$Number_of_plans_found__;
    private static final SubLString $str288$Plans_;
    private static final SubLSymbol $kw289$TASK_EXAMINER_LINKS;
    private static final SubLString $str290$Plan_;
    private static final SubLString $str291$_;
    private static final SubLString $str292$No_plans_found_;
    private static final SubLString $str293$CB_SHOP_PLANNING;
    private static final SubLSymbol $sym294$DICTIONARY_LOOKUP;
    private static final SubLSymbol $sym295$PROCESS_WRAPPER_GET_ID;
    private static final SubLList $list296;
    private static final SubLSymbol $sym297$CB_SHOP_ABORT_LINK_HANDLER;
    private static final SubLString $str298$_a__a;
    private static final SubLString $str299$cb_shop_abort_link_handler;
    private static final SubLString $str300$_Abort_;
    private static final SubLSymbol $sym301$CB_SHOP_PAUSE_LINK_HANDLER;
    private static final SubLString $str302$cb_shop_pause_link_handler;
    private static final SubLString $str303$_Pause_;
    private static final SubLSymbol $sym304$CB_SHOP_RESUME_LINK_HANDLER;
    private static final SubLString $str305$cb_shop_resume_link_handler;
    private static final SubLString $str306$_Resume_;
    private static final SubLSymbol $sym307$CB_SHOP_VIEW_LINK_HANDLER;
    private static final SubLString $str308$cb_shop_view_link_handler;
    private static final SubLString $str309$_View_;
    private static final SubLSymbol $sym310$CB_SHOP_REPLAN_LINK_HANDLER;
    private static final SubLString $str311$cb_shop_replan_link_handler;
    private static final SubLString $str312$_Replan_;
    private static final SubLSymbol $sym313$CB_SHOP_VERBOSE_LINK_HANDLER;
    private static final SubLString $str314$cb_shop_verbose_link_handler;
    private static final SubLString $str315$_Log_;
    private static final SubLSymbol $sym316$CB_SHOP_DELETE_LINK_HANDLER;
    private static final SubLString $str317$cb_shop_delete_link_handler;
    private static final SubLString $str318$_Delete_;
    private static final SubLSymbol $sym319$CB_SHOP_DOMAIN_EXAMINER_LINK_HANDLER;
    private static final SubLString $str320$cb_shop_domain_examiner_link_hand;
    private static final SubLString $str321$_Domain_;
    private static final SubLSymbol $kw322$THREAD_STRUCTURE;
    private static final SubLString $str323$Initializing;
    private static final SubLSymbol $sym324$GET_DOMAIN;
    private static final SubLSymbol $kw325$UNKNOWN;
    private static final SubLSymbol $sym326$TASKS;
    private static final SubLSymbol $sym327$TASK_MT;
    private static final SubLString $str328$No_Plans_Currently_Available_;
    private static final SubLString $str329$Status;
    private static final SubLString $str330$Actions;
    private static final SubLSymbol $sym331$NUM_BACKCHAINS;
    private static final SubLSymbol $sym332$MAKE_DOMAIN_FROM_MT;
    private static final SubLSymbol $sym333$CB_SHOP_PW_PROOF_CHECKING_FUNC;
    private static final SubLSymbol $sym334$CB_SHOP_PW_FUNC;
    private static final SubLInteger $int335$30;
    private static final SubLString $str336$Open_Nodes;
    private static final SubLString $str337$Inferences;
    private static final SubLString $str338$Expansions;
    private static final SubLString $str339$Plans;
    private static final SubLSymbol $kw340$RIGHT;
    private static final SubLSymbol $kw341$RED;
    private static final SubLString $str342$Depth_Cutoff;
    private static final SubLString $str343$Number_Cutoff;
    private static final SubLString $str344$Time_Cutoff;
    private static final SubLString $str345$Paused_By_User;
    private static final SubLString $str346$Completed;
    private static final SubLString $str347$Pausing;
    private static final SubLString $str348$Running;
    private static final SubLSymbol $sym349$CYCL_PLANS;
    private static final SubLSymbol $sym350$PLANNER;
    private static final SubLSymbol $sym351$CREATE_PLAN_DISPLAYER;
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-shop.lisp", position = 1923L)
    public static SubLObject with_cb_shop_defaults(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)cb_shop.$sym21$CLET, (SubLObject)cb_shop.$list22, ConsesLow.append(body, (SubLObject)cb_shop.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-shop.lisp", position = 2396L)
    public static SubLObject cb_shop_plan_checking_enabled() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return cb_shop.$cb_shop_plan_checking_enabled$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-shop.lisp", position = 2491L)
    public static SubLObject cb_shop_enable_plan_checking() {
        cb_shop.$cb_shop_plan_checking_enabled$.setDynamicValue((SubLObject)cb_shop.T);
        return (SubLObject)cb_shop.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-shop.lisp", position = 2597L)
    public static SubLObject cb_shop_disable_plan_checking() {
        cb_shop.$cb_shop_plan_checking_enabled$.setDynamicValue((SubLObject)cb_shop.NIL);
        return (SubLObject)cb_shop.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-shop.lisp", position = 2706L)
    public static SubLObject cb_shop_plan_checking_rules() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        cb_shop.$cb_shop_plan_checking_rules$.setDynamicValue(list_utilities.delete_if_not(Symbols.symbol_function((SubLObject)cb_shop.$sym25$VALID_ASSERTION), cb_shop.$cb_shop_plan_checking_rules$.getDynamicValue(thread), (SubLObject)cb_shop.UNPROVIDED, (SubLObject)cb_shop.UNPROVIDED, (SubLObject)cb_shop.UNPROVIDED, (SubLObject)cb_shop.UNPROVIDED), thread);
        return conses_high.copy_list(cb_shop.$cb_shop_plan_checking_rules$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-shop.lisp", position = 2911L)
    public static SubLObject cb_shop_add_to_plan_checking_rules(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_shop.NIL != assertion_handles.assertion_p(assertion) && cb_shop.NIL == conses_high.member(assertion, cb_shop.$cb_shop_plan_checking_rules$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)cb_shop.EQL), Symbols.symbol_function((SubLObject)cb_shop.IDENTITY))) {
            cb_shop.$cb_shop_plan_checking_rules$.setDynamicValue((SubLObject)ConsesLow.cons(assertion, cb_shop.$cb_shop_plan_checking_rules$.getDynamicValue(thread)), thread);
        }
        return (SubLObject)cb_shop.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-shop.lisp", position = 3078L)
    public static SubLObject cb_shop_remove_from_plan_checking_rules(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        cb_shop.$cb_shop_plan_checking_rules$.setDynamicValue(Sequences.delete(assertion, cb_shop.$cb_shop_plan_checking_rules$.getDynamicValue(thread), (SubLObject)cb_shop.UNPROVIDED, (SubLObject)cb_shop.UNPROVIDED, (SubLObject)cb_shop.UNPROVIDED, (SubLObject)cb_shop.UNPROVIDED, (SubLObject)cb_shop.UNPROVIDED), thread);
        return (SubLObject)cb_shop.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-shop.lisp", position = 3252L)
    public static SubLObject cb_shop_clear_all_plan_checking_rules() {
        cb_shop.$cb_shop_plan_checking_rules$.setDynamicValue((SubLObject)cb_shop.NIL);
        return (SubLObject)cb_shop.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-shop.lisp", position = 3367L)
    public static SubLObject cb_shop_use_in_plan_checking(final SubLObject args) {
        final SubLObject assertion = cb_utilities.cb_guess_assertion(args);
        if (cb_shop.NIL == shop_main.shop_planning_assertionP(assertion)) {
            return cb_utilities.cb_error((SubLObject)cb_shop.$str26$Not_a_planning_assertion_, (SubLObject)cb_shop.UNPROVIDED, (SubLObject)cb_shop.UNPROVIDED, (SubLObject)cb_shop.UNPROVIDED, (SubLObject)cb_shop.UNPROVIDED, (SubLObject)cb_shop.UNPROVIDED);
        }
        cb_shop_add_to_plan_checking_rules(assertion);
        return cb_utilities.cb_simple_message_page((SubLObject)cb_shop.$str27$Rule_has_been_added_to_SHOP_plan_, (SubLObject)cb_shop.UNPROVIDED, (SubLObject)cb_shop.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-shop.lisp", position = 3727L)
    public static SubLObject cb_link_use_in_plan_checking(final SubLObject assertion, SubLObject linktext) {
        if (linktext == cb_shop.UNPROVIDED) {
            linktext = (SubLObject)cb_shop.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert cb_shop.NIL != assertion_handles.assertion_p(assertion) : assertion;
        if (cb_shop.NIL == linktext) {
            linktext = (SubLObject)cb_shop.$str31$_Use_in_Plan_Checking_;
        }
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_shop.$kw32$SELF);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_shop.$str33$cb_shop_use_in_plan_checking__a, assertion_handles.assertion_id(assertion));
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
        if (cb_shop.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return assertion;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-shop.lisp", position = 4120L)
    public static SubLObject cb_shop_plan_checking(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject arghash = html_arghash.arglist_to_arghash(args);
        if (cb_shop.NIL != html_arghash.get_arghash_value((SubLObject)cb_shop.$kw38$DISABLE, arghash)) {
            cb_shop_disable_plan_checking();
        }
        else if (cb_shop.NIL != html_arghash.get_arghash_value((SubLObject)cb_shop.$kw39$ENABLE, arghash)) {
            cb_shop_enable_plan_checking();
        }
        else if (cb_shop.NIL != html_arghash.get_arghash_value((SubLObject)cb_shop.$kw40$DISCARD, arghash)) {
            cb_shop_clear_all_plan_checking_rules();
        }
        else if (cb_shop.NIL != html_arghash.get_arghash_value((SubLObject)cb_shop.$kw41$UPDATE, arghash)) {
            SubLObject cdolist_list_var;
            final SubLObject discards = cdolist_list_var = html_arghash.get_arghash_value_list((SubLObject)cb_shop.$kw42$SELECTED_RULES, arghash);
            SubLObject discard_id = (SubLObject)cb_shop.NIL;
            discard_id = cdolist_list_var.first();
            while (cb_shop.NIL != cdolist_list_var) {
                cb_shop_remove_from_plan_checking_rules(assertion_handles.find_assertion_by_id(discard_id));
                cdolist_list_var = cdolist_list_var.rest();
                discard_id = cdolist_list_var.first();
            }
        }
        final SubLObject enabledP = cb_shop_plan_checking_enabled();
        final SubLObject rules = cb_shop_plan_checking_rules();
        final SubLObject title_var = (SubLObject)cb_shop.$str43$Plan_Checking_Control;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind((cb_shop.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_shop.UNPROVIDED, (SubLObject)cb_shop.UNPROVIDED, (SubLObject)cb_shop.UNPROVIDED), thread);
            html_utilities.html_markup((SubLObject)cb_shop.$str44$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (cb_shop.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri((SubLObject)cb_shop.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_shop.$str45$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_shop.UNPROVIDED);
            final SubLObject _prev_bind_0_$1 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_shop.$kw46$UNINITIALIZED) ? ConsesLow.list(cb_shop.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_parameters.cb_head_shortcut_icon();
                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css((SubLObject)cb_shop.$kw47$CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (cb_shop.NIL != title_var) {
                    html_utilities.html_source_readability_terpri((SubLObject)cb_shop.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(title_var);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_shop.UNPROVIDED);
                final SubLObject _prev_bind_0_$2 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind((SubLObject)cb_shop.T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (cb_shop.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                    }
                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_shop.$str50$yui_skin_sam);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
                    final SubLObject _prev_bind_0_$3 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_shop.$str51$reloadFrameButton);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
                        final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
                            html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_shop.$str52$button);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_shop.$str53$reload);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_shop.$str54$Refresh_Frames);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                            if (cb_shop.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$4, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (cb_shop.NIL != title_var) {
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_shop.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_shop.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
                        }
                        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_shop.NIL);
                        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_shop.$str55$post);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                        if (cb_shop.NIL != frame_name_var) {
                            html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                            html_utilities.html_markup(frame_name_var);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                        }
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
                        final SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
                            html_macros.$within_html_form$.bind((SubLObject)cb_shop.T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_utilities.html_hidden_input((SubLObject)cb_shop.$str56$cb_shop_plan_checking, (SubLObject)cb_shop.T, (SubLObject)cb_shop.UNPROVIDED);
                            cb_utilities.cb_help_preamble((SubLObject)cb_shop.$kw36$CB_SHOP_PLAN_CHECKING, (SubLObject)cb_shop.UNPROVIDED, (SubLObject)cb_shop.UNPROVIDED);
                            cb_utilities.cb_link((SubLObject)cb_shop.$kw57$PLANNER, (SubLObject)cb_shop.$str58$_Back_to_Planner_, (SubLObject)cb_shop.UNPROVIDED, (SubLObject)cb_shop.UNPROVIDED, (SubLObject)cb_shop.UNPROVIDED, (SubLObject)cb_shop.UNPROVIDED);
                            html_utilities.html_newline((SubLObject)cb_shop.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_shop.$str59$Plan_Checking_is_);
                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            if (cb_shop.NIL != enabledP) {
                                html_utilities.html_princ((SubLObject)cb_shop.$str60$Enabled_);
                            }
                            else {
                                html_utilities.html_princ((SubLObject)cb_shop.$str61$Disabled_);
                            }
                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_utilities.html_newline((SubLObject)cb_shop.UNPROVIDED);
                            if (cb_shop.NIL != enabledP) {
                                html_arghash.html_arghash_submit_input(arghash, (SubLObject)cb_shop.$str62$Disable, (SubLObject)cb_shop.$kw38$DISABLE, (SubLObject)cb_shop.UNPROVIDED);
                            }
                            else {
                                html_arghash.html_arghash_submit_input(arghash, (SubLObject)cb_shop.$str63$Enable, (SubLObject)cb_shop.$kw39$ENABLE, (SubLObject)cb_shop.UNPROVIDED);
                            }
                            html_utilities.html_indent((SubLObject)cb_shop.UNPROVIDED);
                            html_arghash.html_arghash_submit_input(arghash, (SubLObject)cb_shop.$str64$Update, (SubLObject)cb_shop.$kw41$UPDATE, (SubLObject)cb_shop.UNPROVIDED);
                            html_utilities.html_indent((SubLObject)cb_shop.UNPROVIDED);
                            html_arghash.html_arghash_submit_input(arghash, (SubLObject)cb_shop.$str65$Discard_All, (SubLObject)cb_shop.$kw40$DISCARD, (SubLObject)cb_shop.UNPROVIDED);
                            html_utilities.html_hr((SubLObject)cb_shop.UNPROVIDED, (SubLObject)cb_shop.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            if (cb_shop.NIL != rules) {
                                html_utilities.html_princ((SubLObject)cb_shop.$str66$Choose_Planning_Rules_for_inclusi);
                            }
                            else {
                                html_utilities.html_princ((SubLObject)cb_shop.$str67$No_Rules_in_plan_checking_set_);
                            }
                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_utilities.html_newline((SubLObject)cb_shop.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_shop.ZERO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
                            final SubLObject _prev_bind_0_$6 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
                                SubLObject cdolist_list_var2 = rules;
                                SubLObject cur_rule = (SubLObject)cb_shop.NIL;
                                cur_rule = cdolist_list_var2.first();
                                while (cb_shop.NIL != cdolist_list_var2) {
                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$7 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                                        html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_shop.$kw68$TOP));
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
                                        final SubLObject _prev_bind_0_$8 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
                                            html_arghash.html_arghash_checkbox_input(arghash, (SubLObject)cb_shop.$kw42$SELECTED_RULES, assertion_handles.assertion_id(cur_rule), (SubLObject)cb_shop.UNPROVIDED, (SubLObject)cb_shop.UNPROVIDED);
                                        }
                                        finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$8, thread);
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
                                        final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
                                            cb_utilities.cb_show_assertion_readably(cur_rule, (SubLObject)cb_shop.UNPROVIDED, (SubLObject)cb_shop.UNPROVIDED);
                                        }
                                        finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$9, thread);
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$7, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                    html_utilities.html_source_readability_terpri((SubLObject)cb_shop.UNPROVIDED);
                                    cdolist_list_var2 = cdolist_list_var2.rest();
                                    cur_rule = cdolist_list_var2.first();
                                }
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$6, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        }
                        finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$5, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_shop.UNPROVIDED);
                        html_utilities.html_copyright_notice();
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$3, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_shop.UNPROVIDED);
                }
                finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$2, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            }
            finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$1, thread);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_shop.UNPROVIDED);
        }
        finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_shop.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-shop.lisp", position = 5976L)
    public static SubLObject cb_link_plan_checking(SubLObject linktext) {
        if (linktext == cb_shop.UNPROVIDED) {
            linktext = (SubLObject)cb_shop.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_shop.NIL == linktext) {
            linktext = (SubLObject)cb_shop.$str70$_Plan_Checking_;
        }
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_shop.$kw32$SELF);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        html_utilities.html_princ((SubLObject)cb_shop.$str56$cb_shop_plan_checking);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
        if (cb_shop.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return (SubLObject)cb_shop.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-shop.lisp", position = 6201L)
    public static SubLObject cb_shop_gather_simple_action_rules_in_proof_checker(final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject assertions = (SubLObject)cb_shop.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject cdolist_list_var = shop_main.$shop_simple_action_definition_predicates$.getGlobalValue();
            SubLObject cur_pred = (SubLObject)cb_shop.NIL;
            cur_pred = cdolist_list_var.first();
            while (cb_shop.NIL != cdolist_list_var) {
                assertions = ConsesLow.append(assertions, kb_mapping.gather_predicate_rule_index(cur_pred, (SubLObject)cb_shop.$kw73$POS, (SubLObject)cb_shop.UNPROVIDED, (SubLObject)cb_shop.UNPROVIDED));
                cdolist_list_var = cdolist_list_var.rest();
                cur_pred = cdolist_list_var.first();
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        SubLObject cdolist_list_var2 = assertions;
        SubLObject cur_assertion = (SubLObject)cb_shop.NIL;
        cur_assertion = cdolist_list_var2.first();
        while (cb_shop.NIL != cdolist_list_var2) {
            cb_assertion_editor.cb_add_to_proof_checker_rules(cur_assertion);
            cdolist_list_var2 = cdolist_list_var2.rest();
            cur_assertion = cdolist_list_var2.first();
        }
        return (SubLObject)cb_shop.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-shop.lisp", position = 6667L)
    public static SubLObject subloop_reserved_initialize_cyc_development_planner_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)cb_shop.$sym77$OBJECT, (SubLObject)cb_shop.$sym78$INSTANCE_COUNT, (SubLObject)cb_shop.ZERO_INTEGER);
        return (SubLObject)cb_shop.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-shop.lisp", position = 6667L)
    public static SubLObject subloop_reserved_initialize_cyc_development_planner_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)cb_shop.$sym77$OBJECT, (SubLObject)cb_shop.$sym80$ISOLATED_P, (SubLObject)cb_shop.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)cb_shop.$sym77$OBJECT, (SubLObject)cb_shop.$sym81$INSTANCE_NUMBER, (SubLObject)cb_shop.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)cb_shop.$sym75$SHOP, (SubLObject)cb_shop.$sym82$DISPLAYER_FACTORY, (SubLObject)cb_shop.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)cb_shop.$sym75$SHOP, (SubLObject)cb_shop.$sym83$DOMAIN_TABLE, (SubLObject)cb_shop.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)cb_shop.$sym75$SHOP, (SubLObject)cb_shop.$sym84$PROBLEM_TABLE, (SubLObject)cb_shop.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)cb_shop.$sym75$SHOP, (SubLObject)cb_shop.$sym85$THREADS, (SubLObject)cb_shop.NIL);
        return (SubLObject)cb_shop.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-shop.lisp", position = 6667L)
    public static SubLObject cyc_development_planner_p(final SubLObject cyc_development_planner) {
        return classes.subloop_instanceof_class(cyc_development_planner, (SubLObject)cb_shop.$sym74$CYC_DEVELOPMENT_PLANNER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-shop.lisp", position = 7056L)
    public static SubLObject cyc_development_planner_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_cyc_development_planner_method = (SubLObject)cb_shop.NIL;
        SubLObject displayer_factory = shop_main.get_shop_displayer_factory(self);
        try {
            thread.throwStack.push(cb_shop.$sym90$OUTER_CATCH_FOR_CYC_DEVELOPMENT_PLANNER_METHOD);
            try {
                shop_main.shop_initialize_method(self);
                displayer_factory = object.object_new_method((SubLObject)cb_shop.$sym91$CYC_DEVELOPMENT_PLAN_DISPLAYER_FACTORY);
                Dynamic.sublisp_throw((SubLObject)cb_shop.$sym90$OUTER_CATCH_FOR_CYC_DEVELOPMENT_PLANNER_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cb_shop.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    shop_main.set_shop_displayer_factory(self, displayer_factory);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_cyc_development_planner_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)cb_shop.$sym90$OUTER_CATCH_FOR_CYC_DEVELOPMENT_PLANNER_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_cyc_development_planner_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-shop.lisp", position = 7294L)
    public static SubLObject cyc_development_planner_make_domain_with_rules_method(final SubLObject self, final SubLObject rules, final SubLObject task_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_cyc_development_planner_method = (SubLObject)cb_shop.NIL;
        final SubLObject domain_table = shop_main.get_shop_domain_table(self);
        try {
            thread.throwStack.push(cb_shop.$sym97$OUTER_CATCH_FOR_CYC_DEVELOPMENT_PLANNER_METHOD);
            try {
                final SubLObject domain = object.object_new_method((SubLObject)cb_shop.$sym98$SHOP_CYC_DOMAIN);
                shop_domain.shop_cyc_domain_init_domain_with_rules_method(domain, rules, task_mt);
                Hashtables.sethash(task_mt, domain_table, domain);
                Dynamic.sublisp_throw((SubLObject)cb_shop.$sym97$OUTER_CATCH_FOR_CYC_DEVELOPMENT_PLANNER_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cb_shop.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    shop_main.set_shop_domain_table(self, domain_table);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_cyc_development_planner_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)cb_shop.$sym97$OUTER_CATCH_FOR_CYC_DEVELOPMENT_PLANNER_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_cyc_development_planner_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-shop.lisp", position = 7613L)
    public static SubLObject cyc_development_planner_make_domain_from_proof_checker_method(final SubLObject self, final SubLObject task_mt) {
        final SubLObject assertions = cb_shop_plan_checking_rules();
        return cyc_development_planner_make_domain_with_rules_method(self, assertions, task_mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-shop.lisp", position = 7858L)
    public static SubLObject plan_finder(SubLObject args) {
        if (args == cb_shop.UNPROVIDED) {
            args = (SubLObject)cb_shop.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_shop.NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn((SubLObject)cb_shop.$str104$Plan_Finder);
        }
        else {
            if (cb_shop.NIL != cb_shop.$cyc_development_environment$.getDynamicValue(thread)) {
                cb_shop.$cb_shop_planner$.setDynamicValue(object.object_new_method((SubLObject)cb_shop.$sym74$CYC_DEVELOPMENT_PLANNER), thread);
            }
            else {
                cb_shop.$cb_shop_planner$.setDynamicValue(object.object_new_method((SubLObject)cb_shop.$sym75$SHOP), thread);
            }
            if (cb_shop.NIL != html_macros.html_inside_body_p()) {
                Errors.error((SubLObject)cb_shop.$str105$Cannot_have_a_FRAMESET_tag_inside);
            }
            html_utilities.html_markup(html_macros.$html_frameset_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_frameset_rows$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
            html_utilities.html_markup((SubLObject)cb_shop.$str106$400__);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_frameset_frameborder$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
            html_utilities.html_markup((SubLObject)cb_shop.ONE_INTEGER);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
                cb_utilities.cb_frame((SubLObject)cb_shop.$kw107$CB_SHOP_CONTROLS, (SubLObject)cb_shop.UNPROVIDED, (SubLObject)cb_shop.UNPROVIDED, (SubLObject)cb_shop.UNPROVIDED, (SubLObject)cb_shop.UNPROVIDED);
                cb_utilities.cb_frame((SubLObject)cb_shop.$kw108$CB_SHOP_SUMMARY, (SubLObject)cb_shop.UNPROVIDED, (SubLObject)cb_shop.UNPROVIDED, (SubLObject)cb_shop.UNPROVIDED, (SubLObject)cb_shop.UNPROVIDED);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_frameset_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_shop.UNPROVIDED);
        }
        plan_finder_internal(args);
        return (SubLObject)cb_shop.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-shop.lisp", position = 8814L)
    public static SubLObject plan_examiner(SubLObject args) {
        if (args == cb_shop.UNPROVIDED) {
            args = (SubLObject)cb_shop.NIL;
        }
        if (cb_shop.NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn((SubLObject)cb_shop.$str110$Planner_Examiner);
        }
        else {
            plan_examiner_internal(args);
        }
        return (SubLObject)cb_shop.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-shop.lisp", position = 9073L)
    public static SubLObject plan_verbose_examiner(SubLObject args) {
        if (args == cb_shop.UNPROVIDED) {
            args = (SubLObject)cb_shop.NIL;
        }
        if (cb_shop.NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn((SubLObject)cb_shop.$str112$Plan_Verbose_Examiner);
        }
        else {
            plan_verbose_examiner_internal(args);
        }
        return (SubLObject)cb_shop.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-shop.lisp", position = 9353L)
    public static SubLObject plan_task_examiner(SubLObject args) {
        if (args == cb_shop.UNPROVIDED) {
            args = (SubLObject)cb_shop.NIL;
        }
        if (cb_shop.NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn((SubLObject)cb_shop.$str114$Plan_Task_Examiner);
        }
        else {
            plan_task_examiner_internal(args);
        }
        return (SubLObject)cb_shop.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-shop.lisp", position = 10020L)
    public static SubLObject cb_link_cb_shop_summary(SubLObject linktext) {
        if (linktext == cb_shop.UNPROVIDED) {
            linktext = (SubLObject)cb_shop.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_shop.NIL == linktext) {
            linktext = (SubLObject)cb_shop.$str120$_Summary_;
        }
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_shop.$kw121$MAIN);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        html_utilities.html_princ((SubLObject)cb_shop.$str119$cb_shop_information);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
        if (cb_shop.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return (SubLObject)cb_shop.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-shop.lisp", position = 10234L)
    public static SubLObject cb_link_cb_shop_controls(SubLObject linktext) {
        if (linktext == cb_shop.UNPROVIDED) {
            linktext = (SubLObject)cb_shop.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_shop.NIL == linktext) {
            linktext = (SubLObject)cb_shop.$str123$_Controls_;
        }
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_shop.$kw121$MAIN);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        html_utilities.html_princ((SubLObject)cb_shop.$str117$cb_shop_controls);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
        if (cb_shop.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return (SubLObject)cb_shop.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-shop.lisp", position = 10448L)
    public static SubLObject cb_link_planner(SubLObject linktext) {
        if (linktext == cb_shop.UNPROVIDED) {
            linktext = (SubLObject)cb_shop.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_shop.NIL == linktext) {
            linktext = (SubLObject)cb_shop.$str125$_Plan_Finder_;
        }
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_shop.$kw121$MAIN);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        html_utilities.html_princ((SubLObject)cb_shop.$str126$plan_finder);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
        if (cb_shop.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return (SubLObject)cb_shop.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-shop.lisp", position = 10776L)
    public static SubLObject cb_link_plan_examiner(SubLObject linktext) {
        if (linktext == cb_shop.UNPROVIDED) {
            linktext = (SubLObject)cb_shop.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_shop.NIL == linktext) {
            linktext = (SubLObject)cb_shop.$str128$_Plan_Examiner_;
        }
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_shop.$kw121$MAIN);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        html_utilities.html_princ((SubLObject)cb_shop.$str129$plan_examiner);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
        if (cb_shop.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return (SubLObject)cb_shop.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-shop.lisp", position = 11119L)
    public static SubLObject cb_link_plan_verbose_examiner(SubLObject linktext) {
        if (linktext == cb_shop.UNPROVIDED) {
            linktext = (SubLObject)cb_shop.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_shop.NIL == linktext) {
            linktext = (SubLObject)cb_shop.$str132$_Plan_Verbose_Examiner_;
        }
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_shop.$kw121$MAIN);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        html_utilities.html_princ((SubLObject)cb_shop.$str133$plan_verbose_examiner);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
        if (cb_shop.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return (SubLObject)cb_shop.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-shop.lisp", position = 11870L)
    public static SubLObject clear_cb_planner_warning_message() {
        cb_shop.$cb_planner_warning_message$.setDynamicValue((SubLObject)cb_shop.NIL);
        return (SubLObject)cb_shop.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-shop.lisp", position = 12141L)
    public static SubLObject cb_shop_controls(final SubLObject args) {
        return plan_finder_internal(args);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-shop.lisp", position = 12340L)
    public static SubLObject cb_shop_information(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject refreshingP = cb_shop_information_refreshP();
        if (cb_shop.NIL != refreshingP) {
            html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            html_utilities.html_refresh(cb_shop.$cb_shop_refresh_rate$.getGlobalValue(), (SubLObject)cb_shop.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_shop.UNPROVIDED);
        }
        final SubLObject color_value = html_macros.$html_default_bgcolor$.getDynamicValue(thread);
        final SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
        try {
            html_macros.$html_inside_bodyP$.bind((SubLObject)cb_shop.T, thread);
            html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
            if (cb_shop.NIL != color_value) {
                html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_color(color_value));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
            }
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
            final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
                html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                html_utilities.html_markup((SubLObject)cb_shop.THREE_INTEGER);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
                html_utilities.html_princ((SubLObject)cb_shop.$str139$Summary);
                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                html_utilities.html_markup((SubLObject)cb_shop.THREE_INTEGER);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
                cb_utilities.cb_link((SubLObject)cb_shop.$kw107$CB_SHOP_CONTROLS, (SubLObject)cb_shop.$str140$_New_Plan_, (SubLObject)cb_shop.UNPROVIDED, (SubLObject)cb_shop.UNPROVIDED, (SubLObject)cb_shop.UNPROVIDED, (SubLObject)cb_shop.UNPROVIDED);
                html_utilities.html_indent((SubLObject)cb_shop.UNPROVIDED);
                cb_utilities.cb_link((SubLObject)cb_shop.$kw108$CB_SHOP_SUMMARY, (SubLObject)cb_shop.$str141$_Full_Screen_, (SubLObject)cb_shop.UNPROVIDED, (SubLObject)cb_shop.UNPROVIDED, (SubLObject)cb_shop.UNPROVIDED, (SubLObject)cb_shop.UNPROVIDED);
                html_utilities.html_newline((SubLObject)cb_shop.UNPROVIDED);
                cb_shop_display_processes();
                html_utilities.html_source_readability_terpri((SubLObject)cb_shop.UNPROVIDED);
                html_utilities.html_copyright_notice();
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$10, thread);
            }
            html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_shop.UNPROVIDED);
        }
        finally {
            html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_shop.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-shop.lisp", position = 12860L)
    public static SubLObject plan_finder_internal(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title_var = (SubLObject)cb_shop.$str143$Hierarchical_Ordered_Planner;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind((cb_shop.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_shop.UNPROVIDED, (SubLObject)cb_shop.UNPROVIDED, (SubLObject)cb_shop.UNPROVIDED), thread);
            html_utilities.html_markup((SubLObject)cb_shop.$str44$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (cb_shop.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri((SubLObject)cb_shop.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_shop.$str45$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_shop.UNPROVIDED);
            final SubLObject _prev_bind_0_$11 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_shop.$kw46$UNINITIALIZED) ? ConsesLow.list(cb_shop.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_parameters.cb_head_shortcut_icon();
                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css((SubLObject)cb_shop.$kw47$CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (cb_shop.NIL != title_var) {
                    html_utilities.html_source_readability_terpri((SubLObject)cb_shop.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(title_var);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_complete.html_complete_script();
                cyc_file_dependencies.css((SubLObject)cb_shop.$kw48$SAM_AUTOCOMPLETE_CSS);
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_shop.UNPROVIDED);
                final SubLObject _prev_bind_0_$12 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind((SubLObject)cb_shop.T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (cb_shop.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                    }
                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_shop.$str50$yui_skin_sam);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
                    final SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_shop.$str51$reloadFrameButton);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
                        final SubLObject _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
                            html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_shop.$str52$button);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_shop.$str53$reload);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_shop.$str54$Refresh_Frames);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                            if (cb_shop.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$14, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (cb_shop.NIL != title_var) {
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_shop.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_shop.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
                        }
                        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_shop.$kw121$MAIN);
                        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_shop.$str55$post);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                        if (cb_shop.NIL != frame_name_var) {
                            html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                            html_utilities.html_markup(frame_name_var);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                        }
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
                        final SubLObject _prev_bind_0_$15 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
                            html_macros.$within_html_form$.bind((SubLObject)cb_shop.T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_utilities.html_hidden_input((SubLObject)cb_shop.$str126$plan_finder, (SubLObject)cb_shop.T, (SubLObject)cb_shop.UNPROVIDED);
                            final SubLObject new_taskP = list_utilities.sublisp_boolean(html_utilities.html_extract_input((SubLObject)cb_shop.$str144$find_plans, args));
                            final SubLObject show_advanced_settingsP = list_utilities.sublisp_boolean(html_utilities.html_extract_input((SubLObject)cb_shop.$str145$show_advanced_parameters, args));
                            extract_settings(args);
                            if (cb_shop.NIL != cb_shop.$cb_last_planner_show_advanced_settings$.getDynamicValue(thread) && cb_shop.NIL != args) {
                                extract_advanced_settings(args);
                            }
                            cb_shop_extract_problem(args);
                            if (cb_shop.NIL != show_advanced_settingsP) {
                                plan_finder_change_advanced_parameters(args);
                            }
                            else if (cb_shop.NIL != new_taskP) {
                                cb_shop_new_task(args);
                            }
                            if (cb_shop.NIL != cb_shop.$cb_planner_warning_message$.getDynamicValue(thread)) {
                                final SubLObject color_val = (SubLObject)cb_shop.$str146$red;
                                html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                                if (cb_shop.NIL != color_val) {
                                    html_utilities.html_markup(html_macros.$html_font_color$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_color(color_val));
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                                }
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
                                final SubLObject _prev_bind_0_$16 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
                                    html_utilities.html_princ((SubLObject)cb_shop.$str147$Warning_);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$16, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                html_utilities.html_princ_doc_string(cb_shop.$cb_planner_warning_message$.getDynamicValue(thread), (SubLObject)cb_shop.UNPROVIDED);
                                html_utilities.html_newline((SubLObject)cb_shop.UNPROVIDED);
                            }
                            cb_shop_ask_for_new_task(args);
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        }
                        finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$15, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_shop.UNPROVIDED);
                        html_utilities.html_copyright_notice();
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$13, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_shop.UNPROVIDED);
                }
                finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$12, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            }
            finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$11, thread);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_shop.UNPROVIDED);
        }
        finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_shop.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-shop.lisp", position = 13768L)
    public static SubLObject extract_settings(final SubLObject args) {
        final SubLObject verbosity_string = html_utilities.html_extract_input((SubLObject)cb_shop.$str148$verbosity_level, args);
        final SubLObject verbosity_level = (SubLObject)(verbosity_string.isString() ? string_utilities.string_to_integer(string_utilities.trim_whitespace(verbosity_string)) : cb_shop.NIL);
        if (cb_shop.NIL != verbosity_level && verbosity_level.numGE((SubLObject)cb_shop.ZERO_INTEGER) && verbosity_level.numLE((SubLObject)cb_shop.NINE_INTEGER)) {
            cb_shop.$cb_shop_verbosity$.setDynamicValue(verbosity_level);
        }
        return (SubLObject)cb_shop.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-shop.lisp", position = 14189L)
    public static SubLObject extract_advanced_settings(final SubLObject args) {
        final SubLObject cutoff_number_string = html_utilities.html_extract_input((SubLObject)cb_shop.$str149$cutoff_number, args);
        final SubLObject cutoff_numberP = (SubLObject)(cutoff_number_string.isString() ? Equality.equal(string_utilities.trim_whitespace(cutoff_number_string), (SubLObject)cb_shop.$str150$number) : cb_shop.NIL);
        final SubLObject cutoff_time_string = html_utilities.html_extract_input((SubLObject)cb_shop.$str151$cutoff_time, args);
        final SubLObject cutoff_timeP = (SubLObject)(cutoff_time_string.isString() ? Equality.equal(string_utilities.trim_whitespace(cutoff_time_string), (SubLObject)cb_shop.$str152$time) : cb_shop.NIL);
        final SubLObject cutoff_number = (SubLObject)((cb_shop.NIL != cutoff_numberP) ? string_utilities.string_to_integer(string_utilities.trim_whitespace(html_utilities.html_extract_input((SubLObject)cb_shop.$str150$number, args))) : cb_shop.NIL);
        final SubLObject cutoff_time = (SubLObject)((cb_shop.NIL != cutoff_timeP) ? string_utilities.string_to_integer(string_utilities.trim_whitespace(html_utilities.html_extract_input((SubLObject)cb_shop.$str152$time, args))) : cb_shop.NIL);
        final SubLObject do_fi_asksP = Equality.equal(html_utilities.html_extract_input((SubLObject)cb_shop.$str153$do_fi_asks, args), (SubLObject)cb_shop.$str154$do_asks);
        final SubLObject num_backchains_string = (SubLObject)((cb_shop.NIL != do_fi_asksP) ? html_utilities.html_extract_input((SubLObject)cb_shop.$str155$num_backchains, args) : cb_shop.NIL);
        final SubLObject num_backchains = (SubLObject)((cb_shop.NIL != number_utilities.number_string_p(num_backchains_string)) ? string_utilities.string_to_integer(string_utilities.trim_whitespace(num_backchains_string)) : cb_shop.ZERO_INTEGER);
        final SubLObject cycle_checking_string = html_utilities.html_extract_input((SubLObject)cb_shop.$str156$cycle_checking, args);
        final SubLObject logging = html_utilities.html_extract_input((SubLObject)cb_shop.$str148$verbosity_level, args);
        final SubLObject depth_limitP = Equality.equal(html_utilities.html_extract_input((SubLObject)cb_shop.$str157$depth_limit_p, args), (SubLObject)cb_shop.$str158$depth_limit);
        final SubLObject depth_limit_string = (SubLObject)((cb_shop.NIL != depth_limitP) ? html_utilities.html_extract_input((SubLObject)cb_shop.$str158$depth_limit, args) : cb_shop.NIL);
        final SubLObject depth_limit = (SubLObject)(depth_limit_string.isString() ? string_utilities.string_to_integer(string_utilities.trim_whitespace(depth_limit_string)) : cb_shop.NIL);
        final SubLObject search_type = html_utilities.html_extract_input((SubLObject)cb_shop.$str159$search_type, args);
        cb_shop.$cb_plan_search_type$.setDynamicValue(find_keyword_for_search_type(search_type));
        cb_shop.$cb_last_planner_number$.setDynamicValue(cutoff_number);
        cb_shop.$cb_shop_time_cutoff$.setDynamicValue(cutoff_time);
        cb_shop.$cb_shop_num_backchains$.setDynamicValue(num_backchains);
        cb_shop.$cb_shop_depth_limit$.setDynamicValue(depth_limit);
        if (cycle_checking_string.isString()) {
            cb_shop.$cb_shop_cycle_checking_enabledP$.setDynamicValue(Equality.equal(cycle_checking_string, (SubLObject)cb_shop.$str156$cycle_checking));
        }
        if (logging.isString()) {
            if (cb_shop.NIL != Strings.stringE(logging, (SubLObject)cb_shop.$str160$logging, (SubLObject)cb_shop.UNPROVIDED, (SubLObject)cb_shop.UNPROVIDED, (SubLObject)cb_shop.UNPROVIDED, (SubLObject)cb_shop.UNPROVIDED)) {
                cb_shop.$cb_shop_verbosity$.setDynamicValue((SubLObject)cb_shop.NINE_INTEGER);
            }
            if (cb_shop.NIL != Strings.stringE(logging, (SubLObject)cb_shop.$str161$no_logging, (SubLObject)cb_shop.UNPROVIDED, (SubLObject)cb_shop.UNPROVIDED, (SubLObject)cb_shop.UNPROVIDED, (SubLObject)cb_shop.UNPROVIDED)) {
                cb_shop.$cb_shop_verbosity$.setDynamicValue((SubLObject)cb_shop.ZERO_INTEGER);
            }
        }
        return (SubLObject)cb_shop.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-shop.lisp", position = 16239L)
    public static SubLObject cb_shop_extract_problem(final SubLObject args) {
        if (cb_shop.NIL != args) {
            final SubLObject domain_mt_string = string_utilities.trim_whitespace(html_utilities.html_extract_input((SubLObject)cb_shop.$str162$domain_mt, args));
            final SubLObject domain_mt = constants_high.find_constant(domain_mt_string);
            final SubLObject task_string = string_utilities.trim_whitespace(html_utilities.html_extract_input((SubLObject)cb_shop.$str163$task, args));
            final SubLObject task = cb_form_widgets.cb_extract_query_formula_from_string(task_string, domain_mt);
            if (cb_shop.NIL == task) {
                cb_shop.$cb_shop_task_string$.setDynamicValue(task_string);
                cb_shop.$cb_planner_warning_message$.setDynamicValue((SubLObject)cb_shop.$str164$Task_syntax_not_recognized_);
            }
            else {
                clear_cb_planner_warning_message();
            }
            cb_shop.$cb_planner_task$.setDynamicValue(task);
            cb_shop.$cb_planner_domain_mt$.setDynamicValue(domain_mt);
        }
        return (SubLObject)cb_shop.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-shop.lisp", position = 16975L)
    public static SubLObject cb_shop_new_plan_thread(final SubLObject planner, final SubLObject verbose) {
        final SubLObject thread = methods.funcall_instance_method_with_0_args(planner, (SubLObject)cb_shop.$sym165$MAKE_NEW_THREAD);
        if (verbose.numG((SubLObject)cb_shop.ZERO_INTEGER)) {
            instances.set_slot(thread, (SubLObject)cb_shop.$sym166$OUTPUT_STREAM, (SubLObject)cb_shop.NIL);
        }
        return thread;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-shop.lisp", position = 17232L)
    public static SubLObject initialize_planner_thread() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        cb_shop.$cb_shop_planner_thread$.setDynamicValue(cb_shop_new_plan_thread(cb_shop.$cb_shop_planner$.getDynamicValue(thread), cb_shop.$cb_shop_verbosity$.getDynamicValue(thread)), thread);
        return (SubLObject)cb_shop.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-shop.lisp", position = 17406L)
    public static SubLObject invalid_mt_warning_string(final SubLObject mt, final SubLObject mt_type) {
        return Sequences.cconcatenate(PrintLow.format((SubLObject)cb_shop.NIL, (SubLObject)cb_shop.$str167$___s_is_not_a_valid__s_microtheor, mt, (SubLObject)((cb_shop.NIL != kb_utilities.kbeq(mt_type, cb_shop.$const168$PlanningDomainMicrotheory)) ? cb_shop.$str169$Domain : cb_shop.$str170$Task)), PrintLow.format((SubLObject)cb_shop.NIL, (SubLObject)cb_shop.$str171$__Please_enter_an_instance_of__s_, mt_type));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-shop.lisp", position = 17665L)
    public static SubLObject cb_shop_new_task(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject domain_mt = cb_shop.$cb_planner_domain_mt$.getDynamicValue(thread);
        final SubLObject task = cb_shop.$cb_planner_task$.getDynamicValue(thread);
        clear_plan_displayers();
        cb_shop_new_plan_process(task, domain_mt);
        return (SubLObject)cb_shop.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-shop.lisp", position = 17909L)
    public static SubLObject plan_finder_continue_task() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = shop_parameters.$shop_method_cycle_checking_enabledP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = shop_parameters.$shop_default_depth_limit$.currentBinding(thread);
        try {
            shop_parameters.$shop_method_cycle_checking_enabledP$.bind(cb_shop.$cb_shop_cycle_checking_enabledP$.getDynamicValue(thread), thread);
            shop_parameters.$shop_default_depth_limit$.bind(cb_shop.$cb_shop_depth_limit$.getDynamicValue(thread), thread);
            methods.funcall_instance_method_with_6_args(cb_shop.$cb_shop_planner_thread$.getDynamicValue(thread), (SubLObject)cb_shop.$sym172$FIND_PLANS, cb_shop.$cb_planner_task$.getDynamicValue(thread), cb_shop.$cb_plan_search_type$.getDynamicValue(thread), cb_shop.$cb_shop_verbosity$.getDynamicValue(thread), cb_shop.$cb_last_planner_number$.getDynamicValue(thread), cb_shop.$cb_shop_time_cutoff$.getDynamicValue(thread), shop_parameters.$shop_default_depth_limit$.getDynamicValue(thread));
        }
        finally {
            shop_parameters.$shop_default_depth_limit$.rebind(_prev_bind_2, thread);
            shop_parameters.$shop_method_cycle_checking_enabledP$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_shop.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-shop.lisp", position = 18264L)
    public static SubLObject plan_finder_change_advanced_parameters(final SubLObject args) {
        final SubLObject show_advanced_settings = html_utilities.html_extract_input((SubLObject)cb_shop.$str145$show_advanced_parameters, args);
        if (cb_shop.NIL != string_utilities.starts_with(show_advanced_settings, (SubLObject)cb_shop.$str173$Show)) {
            cb_shop.$cb_last_planner_show_advanced_settings$.setDynamicValue((SubLObject)cb_shop.T);
        }
        else if (cb_shop.NIL != string_utilities.starts_with(show_advanced_settings, (SubLObject)cb_shop.$str174$Hide)) {
            cb_shop.$cb_last_planner_show_advanced_settings$.setDynamicValue((SubLObject)cb_shop.NIL);
        }
        return (SubLObject)cb_shop.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-shop.lisp", position = 18662L)
    public static SubLObject show_last_task(final SubLObject last_task, final SubLObject plan_displayers, final SubLObject halt_reason) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_newline((SubLObject)cb_shop.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_utilities.html_princ((SubLObject)cb_shop.$str175$Last_task_);
        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        html_utilities.html_newline((SubLObject)cb_shop.UNPROVIDED);
        final SubLObject _prev_bind_0 = pph_vars.$pph_quantify_varsP$.currentBinding(thread);
        try {
            pph_vars.$pph_quantify_varsP$.bind((SubLObject)cb_shop.NIL, thread);
            pph_html.html_text_with_target(last_task, (SubLObject)cb_shop.UNPROVIDED, (SubLObject)cb_shop.UNPROVIDED, (SubLObject)cb_shop.UNPROVIDED, (SubLObject)cb_shop.UNPROVIDED);
        }
        finally {
            pph_vars.$pph_quantify_varsP$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_newline((SubLObject)cb_shop.UNPROVIDED);
        html_utilities.html_newline((SubLObject)cb_shop.TWO_INTEGER);
        display_html_plans(plan_displayers, halt_reason);
        html_utilities.html_newline((SubLObject)cb_shop.TWO_INTEGER);
        return (SubLObject)cb_shop.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-shop.lisp", position = 19478L)
    public static SubLObject cb_planner_display_halt_reason(final SubLObject reason) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_utilities.html_princ((SubLObject)cb_shop.$str176$Planner_halted_because__);
        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        if (reason.eql((SubLObject)cb_shop.$kw177$SEARCH_EXHAUSTED)) {
            html_utilities.html_princ((SubLObject)cb_shop.$str178$Search_space_was_exhausted_);
        }
        else if (reason.eql((SubLObject)cb_shop.$kw179$DEPTH_CUTOFF)) {
            final SubLObject color_val = (SubLObject)cb_shop.$str146$red;
            html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
            if (cb_shop.NIL != color_val) {
                html_utilities.html_markup(html_macros.$html_font_color$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_color(color_val));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
            }
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
                html_utilities.html_princ((SubLObject)cb_shop.$str180$Depth_limit_was_reached_);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
        }
        else if (reason.eql((SubLObject)cb_shop.$kw181$NUMBER_CUTOFF)) {
            final SubLObject color_val = (SubLObject)cb_shop.$str146$red;
            html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
            if (cb_shop.NIL != color_val) {
                html_utilities.html_markup(html_macros.$html_font_color$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_color(color_val));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
            }
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
                html_utilities.html_princ((SubLObject)cb_shop.$str182$Number_cutoff_was_reached_);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
        }
        else if (reason.eql((SubLObject)cb_shop.$kw183$TIME_CUTOFF)) {
            final SubLObject color_val = (SubLObject)cb_shop.$str146$red;
            html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
            if (cb_shop.NIL != color_val) {
                html_utilities.html_markup(html_macros.$html_font_color$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_color(color_val));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
            }
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
                html_utilities.html_princ((SubLObject)cb_shop.$str184$Time_cutoff_was_reached_);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
        }
        return (SubLObject)cb_shop.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-shop.lisp", position = 20005L)
    public static SubLObject summarize_last_task(SubLObject planner_thread) {
        if (planner_thread == cb_shop.UNPROVIDED) {
            planner_thread = cb_shop.$cb_shop_planner_thread$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_shop.NIL == planner_thread) {
            return (SubLObject)cb_shop.NIL;
        }
        final SubLObject last_task = shop_basic_planner_thread.shop_planner_thread_task(planner_thread);
        html_utilities.html_newline((SubLObject)cb_shop.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_utilities.html_princ((SubLObject)cb_shop.$str175$Last_task_);
        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        html_utilities.html_newline((SubLObject)cb_shop.UNPROVIDED);
        if (cb_shop.$cb_last_planner_format$.getDynamicValue(thread).equal((SubLObject)cb_shop.$kw5$CYCL)) {
            cb_utilities.cb_form(last_task, (SubLObject)cb_shop.UNPROVIDED, (SubLObject)cb_shop.UNPROVIDED);
        }
        else {
            final SubLObject _prev_bind_0 = pph_vars.$pph_quantify_varsP$.currentBinding(thread);
            try {
                pph_vars.$pph_quantify_varsP$.bind((SubLObject)cb_shop.NIL, thread);
                pph_html.html_text_with_target(last_task, (SubLObject)cb_shop.UNPROVIDED, (SubLObject)cb_shop.UNPROVIDED, (SubLObject)cb_shop.UNPROVIDED, (SubLObject)cb_shop.UNPROVIDED);
            }
            finally {
                pph_vars.$pph_quantify_varsP$.rebind(_prev_bind_0, thread);
            }
        }
        html_utilities.html_newline((SubLObject)cb_shop.TWO_INTEGER);
        shop_basic_planner_thread.shop_basic_planner_thread_html_stats_method(planner_thread);
        html_utilities.html_newline((SubLObject)cb_shop.TWO_INTEGER);
        cb_planner_display_halt_reason(shop_basic_planner_thread.shop_basic_planner_thread_halt_status_method(planner_thread));
        html_utilities.html_newline((SubLObject)cb_shop.TWO_INTEGER);
        if (cb_shop.NIL != cb_shop.$cb_plan_displayers$.getDynamicValue(thread)) {
            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
            cb_utilities.cb_link((SubLObject)cb_shop.$kw130$PLAN_EXAMINER, (SubLObject)cb_shop.$str185$_Examine_Plans_, (SubLObject)cb_shop.UNPROVIDED, (SubLObject)cb_shop.UNPROVIDED, (SubLObject)cb_shop.UNPROVIDED, (SubLObject)cb_shop.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        }
        if (cb_shop.$cb_shop_verbosity$.getDynamicValue(thread).numG((SubLObject)cb_shop.ZERO_INTEGER)) {
            cb_utilities.cb_link((SubLObject)cb_shop.$kw134$PLAN_VERBOSE_EXAMINER, (SubLObject)cb_shop.$str186$_Examine_Verbose_Output_, (SubLObject)cb_shop.UNPROVIDED, (SubLObject)cb_shop.UNPROVIDED, (SubLObject)cb_shop.UNPROVIDED, (SubLObject)cb_shop.UNPROVIDED);
            html_utilities.html_newline((SubLObject)cb_shop.TWO_INTEGER);
        }
        html_utilities.html_hr((SubLObject)cb_shop.UNPROVIDED, (SubLObject)cb_shop.UNPROVIDED);
        return (SubLObject)cb_shop.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-shop.lisp", position = 21173L)
    public static SubLObject cb_shop_ask_for_new_task(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject domain_mt = cb_shop.$cb_planner_domain_mt$.getDynamicValue(thread);
        final SubLObject task_string = cb_shop.$cb_shop_task_string$.getDynamicValue(thread);
        cb_utilities.cb_help_preamble((SubLObject)cb_shop.$kw187$PLAN_FINDER, (SubLObject)cb_shop.NIL, (SubLObject)cb_shop.UNPROVIDED);
        if (cb_shop.NIL != cb_shop_plan_checking_enabled()) {
            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
            html_utilities.html_indent((SubLObject)cb_shop.UNPROVIDED);
            cb_utilities.cb_link((SubLObject)cb_shop.$kw71$PLAN_CHECKING, (SubLObject)cb_shop.$str189$Plan_Checking_Enabled, (SubLObject)cb_shop.UNPROVIDED, (SubLObject)cb_shop.UNPROVIDED, (SubLObject)cb_shop.UNPROVIDED, (SubLObject)cb_shop.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        }
        html_utilities.html_newline((SubLObject)cb_shop.UNPROVIDED);
        html_complete.html_complete_button((SubLObject)cb_shop.$str162$domain_mt, (SubLObject)cb_shop.$str190$Complete, cb_shop.$const168$PlanningDomainMicrotheory, (SubLObject)cb_shop.UNPROVIDED, (SubLObject)cb_shop.UNPROVIDED, (SubLObject)cb_shop.UNPROVIDED, (SubLObject)cb_shop.UNPROVIDED);
        html_utilities.html_indent((SubLObject)cb_shop.TWO_INTEGER);
        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_utilities.html_princ((SubLObject)cb_shop.$str191$Mt_);
        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        html_utilities.html_indent((SubLObject)cb_shop.TWO_INTEGER);
        html_utilities.html_text_input((SubLObject)cb_shop.$str162$domain_mt, domain_mt, cb_parameters.$cb_constant_input_width$.getDynamicValue(thread));
        html_utilities.html_indent((SubLObject)cb_shop.UNPROVIDED);
        html_script_utilities.html_clear_input_button((SubLObject)cb_shop.$str162$domain_mt, (SubLObject)cb_shop.$str192$Clear_Mt, (SubLObject)cb_shop.UNPROVIDED);
        html_utilities.html_newline((SubLObject)cb_shop.UNPROVIDED);
        html_complete.html_complete_button((SubLObject)cb_shop.$str163$task, (SubLObject)cb_shop.$str190$Complete, (SubLObject)cb_shop.UNPROVIDED, (SubLObject)cb_shop.UNPROVIDED, (SubLObject)cb_shop.UNPROVIDED, (SubLObject)cb_shop.UNPROVIDED, (SubLObject)cb_shop.UNPROVIDED);
        html_utilities.html_indent((SubLObject)cb_shop.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_utilities.html_princ((SubLObject)cb_shop.$str193$Task_);
        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        html_utilities.html_indent((SubLObject)cb_shop.TWO_INTEGER);
        html_script_utilities.html_clear_input_button((SubLObject)cb_shop.$str163$task, (SubLObject)cb_shop.$str194$Clear_Task, (SubLObject)cb_shop.UNPROVIDED);
        html_utilities.html_indent((SubLObject)cb_shop.UNPROVIDED);
        html_complete.html_cyclify_button((SubLObject)cb_shop.$str163$task, (SubLObject)cb_shop.UNPROVIDED, (SubLObject)cb_shop.UNPROVIDED);
        html_utilities.html_indent((SubLObject)cb_shop.$int195$24);
        html_utilities.html_submit_input((SubLObject)cb_shop.$str196$Find_Plans, (SubLObject)cb_shop.$str144$find_plans, (SubLObject)cb_shop.UNPROVIDED);
        html_utilities.html_newline((SubLObject)cb_shop.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_textarea_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_textarea_name$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_shop.$str163$task);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_textarea_cols$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_shop.$int197$80);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_textarea_rows$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_shop.EIGHT_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_table_wrap$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_shop.$str198$virtual);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
            if (cb_shop.NIL != cb_shop.$cb_planner_task$.getDynamicValue(thread)) {
                html_utilities.html_princ(format_cycl_expression.format_cycl_expression_to_string(fi.perform_fi_substitutions(cb_shop.$cb_planner_task$.getDynamicValue(thread), (SubLObject)cb_shop.UNPROVIDED), (SubLObject)cb_shop.UNPROVIDED));
            }
            else if (task_string.isString()) {
                html_utilities.html_princ(task_string);
            }
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_textarea_tail$.getGlobalValue());
        html_utilities.html_newline((SubLObject)cb_shop.TWO_INTEGER);
        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_shop.ZERO_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_shop.ZERO_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_shop.ZERO_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_table_width$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_shop.$str199$95_);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
        _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            if (cb_shop.NIL != html_macros.$html_color_lighter_grey$.getGlobalValue()) {
                html_utilities.html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_color_lighter_grey$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
            }
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
            final SubLObject _prev_bind_0_$17 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_shop.$kw200$LEFT));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_shop.$str201$50);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
                final SubLObject _prev_bind_0_$18 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
                    if (cb_shop.NIL != cb_shop.$cb_last_planner_show_advanced_settings$.getDynamicValue(thread)) {
                        html_utilities.html_submit_input((SubLObject)cb_shop.$str174$Hide, (SubLObject)cb_shop.$str145$show_advanced_parameters, (SubLObject)cb_shop.UNPROVIDED);
                    }
                    else {
                        html_utilities.html_submit_input((SubLObject)cb_shop.$str173$Show, (SubLObject)cb_shop.$str145$show_advanced_parameters, (SubLObject)cb_shop.UNPROVIDED);
                    }
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$18, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
                final SubLObject _prev_bind_0_$19 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
                    html_utilities.html_indent((SubLObject)cb_shop.THREE_INTEGER);
                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    html_utilities.html_princ((SubLObject)cb_shop.$str202$Advanced_Planning_Parameters);
                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$19, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$17, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_shop.UNPROVIDED);
            if (cb_shop.NIL != cb_shop.$cb_last_planner_show_advanced_settings$.getDynamicValue(thread)) {
                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
                final SubLObject _prev_bind_0_$20 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_shop.THREE_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
                    final SubLObject _prev_bind_0_$21 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
                        cb_advanced_planner_settings_table(args);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$21, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$20, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_shop.UNPROVIDED);
            }
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return (SubLObject)cb_shop.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-shop.lisp", position = 23276L)
    public static SubLObject cb_shop_domain_examiner(final SubLObject domain) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title_var = (SubLObject)cb_shop.$str203$SHOP_Domain_Examiner;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind((cb_shop.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_shop.UNPROVIDED, (SubLObject)cb_shop.UNPROVIDED, (SubLObject)cb_shop.UNPROVIDED), thread);
            html_utilities.html_markup((SubLObject)cb_shop.$str44$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (cb_shop.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri((SubLObject)cb_shop.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_shop.$str45$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_shop.UNPROVIDED);
            final SubLObject _prev_bind_0_$22 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_shop.$kw46$UNINITIALIZED) ? ConsesLow.list(cb_shop.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_parameters.cb_head_shortcut_icon();
                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css((SubLObject)cb_shop.$kw47$CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (cb_shop.NIL != title_var) {
                    html_utilities.html_source_readability_terpri((SubLObject)cb_shop.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(title_var);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_shop.UNPROVIDED);
                final SubLObject _prev_bind_0_$23 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind((SubLObject)cb_shop.T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (cb_shop.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                    }
                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_shop.$str50$yui_skin_sam);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
                    final SubLObject _prev_bind_0_$24 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_shop.$str51$reloadFrameButton);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
                        final SubLObject _prev_bind_0_$25 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
                            html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_shop.$str52$button);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_shop.$str53$reload);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_shop.$str54$Refresh_Frames);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                            if (cb_shop.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$25, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (cb_shop.NIL != title_var) {
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_shop.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_shop.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
                        }
                        cb_utilities.cb_link((SubLObject)cb_shop.$kw134$PLAN_VERBOSE_EXAMINER, (SubLObject)cb_shop.$str204$_Verbose_Output_, (SubLObject)cb_shop.UNPROVIDED, (SubLObject)cb_shop.UNPROVIDED, (SubLObject)cb_shop.UNPROVIDED, (SubLObject)cb_shop.UNPROVIDED);
                        html_utilities.html_hr((SubLObject)cb_shop.UNPROVIDED, (SubLObject)cb_shop.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                        html_utilities.html_princ((SubLObject)cb_shop.$str205$Go_to_);
                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                        html_utilities.html_indent((SubLObject)cb_shop.TWO_INTEGER);
                        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_shop.$str206$_methods);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
                        final SubLObject _prev_bind_0_$26 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
                            html_utilities.html_princ((SubLObject)cb_shop.$str207$Methods);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$26, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                        html_utilities.html_indent((SubLObject)cb_shop.TWO_INTEGER);
                        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_shop.$str208$_operators);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
                        final SubLObject _prev_bind_0_$27 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
                            html_utilities.html_princ((SubLObject)cb_shop.$str209$Operators);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$27, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                        html_utilities.html_indent((SubLObject)cb_shop.TWO_INTEGER);
                        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_shop.$str210$_cond_operators);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
                        final SubLObject _prev_bind_0_$28 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
                            html_utilities.html_princ((SubLObject)cb_shop.$str211$Conditional_Ops);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$28, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                        html_utilities.html_indent((SubLObject)cb_shop.TWO_INTEGER);
                        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_shop.$str212$_sconds);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
                        final SubLObject _prev_bind_0_$29 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
                            html_utilities.html_princ((SubLObject)cb_shop.$str213$Sufficient_Conditions);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$29, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                        html_utilities.html_hr((SubLObject)cb_shop.UNPROVIDED, (SubLObject)cb_shop.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                        html_utilities.html_princ((SubLObject)cb_shop.$str214$Planning_Mt_);
                        html_utilities.html_indent((SubLObject)cb_shop.UNPROVIDED);
                        cb_utilities.cb_form(methods.funcall_instance_method_with_0_args(domain, (SubLObject)cb_shop.$sym215$GET_NAME), (SubLObject)cb_shop.UNPROVIDED, (SubLObject)cb_shop.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                        html_utilities.html_newline((SubLObject)cb_shop.TWO_INTEGER);
                        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_anchor_name$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_shop.$str216$methods);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
                        final SubLObject _prev_bind_0_$30 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_shop.THREE_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_shop.$str207$Methods);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_shop.THREE_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
                            methods.funcall_instance_method_with_0_args(domain, (SubLObject)cb_shop.$sym217$HTML_DISPLAY_ALL_METHODS);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$30, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_anchor_name$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_shop.$str218$operators);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
                        final SubLObject _prev_bind_0_$31 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_shop.THREE_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_shop.$str209$Operators);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_shop.THREE_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
                            methods.funcall_instance_method_with_0_args(domain, (SubLObject)cb_shop.$sym219$HTML_DISPLAY_ALL_OPERATORS);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$31, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_anchor_name$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_shop.$str220$cond_operators);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
                        final SubLObject _prev_bind_0_$32 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_shop.THREE_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_shop.$str221$Conditional_Operators);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_shop.THREE_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
                            methods.funcall_instance_method_with_0_args(domain, (SubLObject)cb_shop.$sym222$HTML_DISPLAY_ALL_CONDITIONAL_OPERATORS);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$32, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_anchor_name$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_shop.$str223$sconds);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
                        final SubLObject _prev_bind_0_$33 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_shop.THREE_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_shop.$str213$Sufficient_Conditions);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_shop.THREE_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
                            methods.funcall_instance_method_with_0_args(domain, (SubLObject)cb_shop.$sym224$HTML_DISPLAY_ALL_SCONDS);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$33, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_shop.UNPROVIDED);
                        html_utilities.html_copyright_notice();
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$24, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_shop.UNPROVIDED);
                }
                finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$23, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            }
            finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$22, thread);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_shop.UNPROVIDED);
        }
        finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_shop.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-shop.lisp", position = 24719L)
    public static SubLObject plan_verbose_examiner_internal(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup((SubLObject)cb_shop.$str44$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (cb_shop.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_utilities.html_source_readability_terpri((SubLObject)cb_shop.UNPROVIDED);
            html_utilities.html_markup((SubLObject)cb_shop.$str45$_meta_http_equiv__X_UA_Compatible);
        }
        html_utilities.html_source_readability_terpri((SubLObject)cb_shop.UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_shop.$kw46$UNINITIALIZED) ? ConsesLow.list(cb_shop.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            html_utilities.html_source_readability_terpri((SubLObject)cb_shop.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_utilities.html_princ((SubLObject)cb_shop.$str225$SHOP_Log);
            html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
            dhtml_macros.dhtml_with_dom_script();
            dhtml_macros.dhtml_with_toggle_visibility_support();
            html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_shop.UNPROVIDED);
            final SubLObject color_value = html_macros.$html_default_bgcolor$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$34 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind((SubLObject)cb_shop.T, thread);
                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                if (cb_shop.NIL != color_value) {
                    html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_color(color_value));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                }
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
                final SubLObject _prev_bind_0_$35 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
                    final SubLObject thread_$36 = cb_shop.$cb_shop_planner_thread$.getDynamicValue(thread);
                    final SubLObject log = instances.get_slot(thread_$36, (SubLObject)cb_shop.$sym226$LOG);
                    final SubLObject pw = instances.get_slot(thread_$36, (SubLObject)cb_shop.$sym227$P_WRAPPER);
                    cb_shop_domain_examiner_link(pw);
                    html_utilities.html_hr((SubLObject)cb_shop.UNPROVIDED, (SubLObject)cb_shop.UNPROVIDED);
                    if (instances.get_slot(log, (SubLObject)cb_shop.$sym228$VERBOSE).numE((SubLObject)cb_shop.ZERO_INTEGER)) {
                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                        html_utilities.html_princ((SubLObject)cb_shop.$str229$No_Verbose_Output__Set_Verbosity_);
                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                    }
                    else {
                        final SubLObject log_$37 = instances.get_slot(thread_$36, (SubLObject)cb_shop.$sym226$LOG);
                        methods.funcall_instance_method_with_0_args(log_$37, (SubLObject)cb_shop.$sym230$DISPLAY_HTML_LOG);
                    }
                    html_utilities.html_source_readability_terpri((SubLObject)cb_shop.UNPROVIDED);
                    html_utilities.html_copyright_notice();
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$35, thread);
                }
                html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_shop.UNPROVIDED);
            }
            finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$34, thread);
            }
            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
        }
        finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_source_readability_terpri((SubLObject)cb_shop.UNPROVIDED);
        return (SubLObject)cb_shop.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-shop.lisp", position = 25529L)
    public static SubLObject plan_examiner_internal(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title_var = (SubLObject)cb_shop.$str232$Plan_Examiner;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind((cb_shop.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_shop.UNPROVIDED, (SubLObject)cb_shop.UNPROVIDED, (SubLObject)cb_shop.UNPROVIDED), thread);
            html_utilities.html_markup((SubLObject)cb_shop.$str44$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (cb_shop.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri((SubLObject)cb_shop.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_shop.$str45$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_shop.UNPROVIDED);
            final SubLObject _prev_bind_0_$38 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_shop.$kw46$UNINITIALIZED) ? ConsesLow.list(cb_shop.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_parameters.cb_head_shortcut_icon();
                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css((SubLObject)cb_shop.$kw47$CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (cb_shop.NIL != title_var) {
                    html_utilities.html_source_readability_terpri((SubLObject)cb_shop.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(title_var);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_complete.html_complete_script();
                cyc_file_dependencies.css((SubLObject)cb_shop.$kw48$SAM_AUTOCOMPLETE_CSS);
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_shop.UNPROVIDED);
                final SubLObject _prev_bind_0_$39 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind((SubLObject)cb_shop.T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (cb_shop.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                    }
                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_shop.$str50$yui_skin_sam);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
                    final SubLObject _prev_bind_0_$40 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_shop.$str51$reloadFrameButton);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
                        final SubLObject _prev_bind_0_$41 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
                            html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_shop.$str52$button);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_shop.$str53$reload);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_shop.$str54$Refresh_Frames);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                            if (cb_shop.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$41, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (cb_shop.NIL != title_var) {
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_shop.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_shop.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
                        }
                        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_shop.NIL);
                        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_shop.$str55$post);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                        if (cb_shop.NIL != frame_name_var) {
                            html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                            html_utilities.html_markup(frame_name_var);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                        }
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
                        final SubLObject _prev_bind_0_$42 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
                            html_macros.$within_html_form$.bind((SubLObject)cb_shop.T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_utilities.html_hidden_input((SubLObject)cb_shop.$str233$handle_plan_examiner_input, (SubLObject)cb_shop.T, (SubLObject)cb_shop.UNPROVIDED);
                            cb_utilities.cb_help_preamble((SubLObject)cb_shop.$kw130$PLAN_EXAMINER, (SubLObject)cb_shop.NIL, (SubLObject)cb_shop.UNPROVIDED);
                            cb_utilities.cb_link((SubLObject)cb_shop.$kw57$PLANNER, (SubLObject)cb_shop.$str140$_New_Plan_, (SubLObject)cb_shop.UNPROVIDED, (SubLObject)cb_shop.UNPROVIDED, (SubLObject)cb_shop.UNPROVIDED, (SubLObject)cb_shop.UNPROVIDED);
                            html_utilities.html_indent((SubLObject)cb_shop.UNPROVIDED);
                            cb_utilities.cb_link((SubLObject)cb_shop.$kw134$PLAN_VERBOSE_EXAMINER, (SubLObject)cb_shop.$str204$_Verbose_Output_, (SubLObject)cb_shop.UNPROVIDED, (SubLObject)cb_shop.UNPROVIDED, (SubLObject)cb_shop.UNPROVIDED, (SubLObject)cb_shop.UNPROVIDED);
                            html_utilities.html_indent((SubLObject)cb_shop.UNPROVIDED);
                            final SubLObject pw = instances.get_slot(cb_shop.$cb_shop_planner_thread$.getDynamicValue(thread), (SubLObject)cb_shop.$sym227$P_WRAPPER);
                            cb_shop_domain_examiner_link(pw);
                            html_utilities.html_hr((SubLObject)cb_shop.UNPROVIDED, (SubLObject)cb_shop.UNPROVIDED);
                            cb_plan_examiner_controls();
                            final SubLObject plans = cb_shop.$cb_plan_displayers$.getDynamicValue(thread);
                            final SubLObject halt_status = instances.get_slot(cb_shop.$cb_shop_planner_thread$.getDynamicValue(thread), (SubLObject)cb_shop.$sym234$HALT_STATUS);
                            final SubLObject last_task = shop_datastructures.shop_basic_problem_get_tasks_method(instances.get_slot(cb_shop.$cb_shop_planner_thread$.getDynamicValue(thread), (SubLObject)cb_shop.$sym235$PROBLEM)).first();
                            show_last_task(last_task, plans, halt_status);
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        }
                        finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$42, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_shop.UNPROVIDED);
                        html_utilities.html_copyright_notice();
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$40, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_shop.UNPROVIDED);
                }
                finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$39, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            }
            finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$38, thread);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_shop.UNPROVIDED);
        }
        finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_shop.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-shop.lisp", position = 26356L)
    public static SubLObject handle_plan_examiner_input(final SubLObject args) {
        final SubLObject new_format = html_utilities.html_extract_input((SubLObject)cb_shop.$str236$format, args);
        final SubLObject new_structure = html_utilities.html_extract_input((SubLObject)cb_shop.$str237$structure, args);
        cb_shop.$cb_last_planner_format$.setDynamicValue((SubLObject)(new_format.equal((SubLObject)cb_shop.$str238$_cycl) ? cb_shop.$kw5$CYCL : cb_shop.$kw239$ENGLISH));
        cb_shop.$cb_last_planner_structure$.setDynamicValue((SubLObject)(new_structure.equal((SubLObject)cb_shop.$str240$_hierarchical) ? cb_shop.$kw7$HIERARCHICAL : cb_shop.$kw241$PRIMITIVE));
        plan_examiner_internal(args);
        return (SubLObject)cb_shop.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-shop.lisp", position = 26789L)
    public static SubLObject cb_plan_examiner_controls() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_submit_input((SubLObject)cb_shop.$str243$Change_View, (SubLObject)cb_shop.$str244$submit, (SubLObject)cb_shop.UNPROVIDED);
        html_utilities.html_newline((SubLObject)cb_shop.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_shop.ZERO_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_shop.ZERO_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_shop.ZERO_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
            final SubLObject _prev_bind_0_$43 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
                final SubLObject _prev_bind_0_$44 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
                    html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_shop.ZERO_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_shop.ZERO_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_shop.ZERO_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
                    final SubLObject _prev_bind_0_$45 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
                        final SubLObject _prev_bind_0_$46 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
                            final SubLObject _prev_bind_0_$47 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_utilities.html_princ((SubLObject)cb_shop.$str245$Format_);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$47, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$46, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_shop.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
                        final SubLObject _prev_bind_0_$48 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
                            final SubLObject _prev_bind_0_$49 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
                                html_utilities.html_radio_input((SubLObject)cb_shop.$str236$format, (SubLObject)cb_shop.$str246$_english, Equality.equal(cb_shop.$cb_last_planner_format$.getDynamicValue(thread), (SubLObject)cb_shop.$kw239$ENGLISH), (SubLObject)cb_shop.UNPROVIDED);
                                html_utilities.html_indent((SubLObject)cb_shop.UNPROVIDED);
                                html_utilities.html_princ((SubLObject)cb_shop.$str247$English);
                                html_utilities.html_indent((SubLObject)cb_shop.FIVE_INTEGER);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$49, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$48, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_shop.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
                        final SubLObject _prev_bind_0_$50 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
                            final SubLObject _prev_bind_0_$51 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
                                html_utilities.html_radio_input((SubLObject)cb_shop.$str236$format, (SubLObject)cb_shop.$str238$_cycl, Equality.equal(cb_shop.$cb_last_planner_format$.getDynamicValue(thread), (SubLObject)cb_shop.$kw5$CYCL), (SubLObject)cb_shop.UNPROVIDED);
                                html_utilities.html_indent((SubLObject)cb_shop.UNPROVIDED);
                                html_utilities.html_princ((SubLObject)cb_shop.$str248$CycL);
                                html_utilities.html_indent((SubLObject)cb_shop.FIVE_INTEGER);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$51, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$50, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_shop.UNPROVIDED);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$45, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$44, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
                final SubLObject _prev_bind_0_$52 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
                    html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_shop.ZERO_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_shop.ZERO_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_shop.ZERO_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
                    final SubLObject _prev_bind_0_$53 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
                        final SubLObject _prev_bind_0_$54 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
                            final SubLObject _prev_bind_0_$55 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_utilities.html_princ((SubLObject)cb_shop.$str249$Structure_);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$55, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$54, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_shop.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
                        final SubLObject _prev_bind_0_$56 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
                            final SubLObject _prev_bind_0_$57 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
                                html_utilities.html_radio_input((SubLObject)cb_shop.$str237$structure, (SubLObject)cb_shop.$str250$_primitive, Equality.equal(cb_shop.$cb_last_planner_structure$.getDynamicValue(thread), (SubLObject)cb_shop.$kw241$PRIMITIVE), (SubLObject)cb_shop.UNPROVIDED);
                                html_utilities.html_indent((SubLObject)cb_shop.UNPROVIDED);
                                html_utilities.html_princ((SubLObject)cb_shop.$str251$Primitive);
                                html_utilities.html_indent((SubLObject)cb_shop.FIVE_INTEGER);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$57, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$56, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_shop.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
                        final SubLObject _prev_bind_0_$58 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
                            final SubLObject _prev_bind_0_$59 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
                                html_utilities.html_radio_input((SubLObject)cb_shop.$str237$structure, (SubLObject)cb_shop.$str240$_hierarchical, Equality.equal(cb_shop.$cb_last_planner_structure$.getDynamicValue(thread), (SubLObject)cb_shop.$kw7$HIERARCHICAL), (SubLObject)cb_shop.UNPROVIDED);
                                html_utilities.html_indent((SubLObject)cb_shop.UNPROVIDED);
                                html_utilities.html_princ((SubLObject)cb_shop.$str252$Hierarchical);
                                html_utilities.html_indent((SubLObject)cb_shop.FIVE_INTEGER);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$59, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$58, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_shop.UNPROVIDED);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$53, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$52, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$43, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_shop.UNPROVIDED);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
        html_utilities.html_newline((SubLObject)cb_shop.UNPROVIDED);
        html_utilities.html_hr((SubLObject)cb_shop.UNPROVIDED, (SubLObject)cb_shop.UNPROVIDED);
        return (SubLObject)cb_shop.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-shop.lisp", position = 28236L)
    public static SubLObject cb_advanced_planner_settings_table(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        cb_utilities.cb_link((SubLObject)cb_shop.$kw71$PLAN_CHECKING, (SubLObject)cb_shop.UNPROVIDED, (SubLObject)cb_shop.UNPROVIDED, (SubLObject)cb_shop.UNPROVIDED, (SubLObject)cb_shop.UNPROVIDED, (SubLObject)cb_shop.UNPROVIDED);
        final SubLObject number_string = html_utilities.html_extract_input((SubLObject)cb_shop.$str150$number, args);
        final SubLObject time_arg = html_utilities.html_extract_input((SubLObject)cb_shop.$str152$time, args);
        final SubLObject time_string = (SubLObject)((cb_shop.NIL != time_arg) ? time_arg : ((cb_shop.NIL != cb_shop.$cb_shop_time_cutoff$.getDynamicValue(thread)) ? PrintLow.write_to_string(cb_shop.$cb_shop_time_cutoff$.getDynamicValue(thread), cb_shop.EMPTY_SUBL_OBJECT_ARRAY) : cb_shop.$str253$));
        html_utilities.html_newline((SubLObject)cb_shop.TWO_INTEGER);
        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_shop.ZERO_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_shop.ZERO_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_shop.ZERO_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
            final SubLObject _prev_bind_0_$60 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
                final SubLObject _prev_bind_0_$61 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
                    html_utilities.html_indent((SubLObject)cb_shop.THREE_INTEGER);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$61, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
                final SubLObject _prev_bind_0_$62 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
                    html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_shop.ZERO_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_shop.ZERO_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_shop.ZERO_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
                    final SubLObject _prev_bind_0_$63 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
                        final SubLObject _prev_bind_0_$64 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
                            final SubLObject _prev_bind_0_$65 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_utilities.html_princ((SubLObject)cb_shop.$str254$Number_Cutoff_);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$65, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$64, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_shop.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
                        final SubLObject _prev_bind_0_$66 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
                            final SubLObject _prev_bind_0_$67 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
                                html_utilities.html_radio_input((SubLObject)cb_shop.$str149$cutoff_number, (SubLObject)cb_shop.$str255$no_number, (SubLObject)SubLObjectFactory.makeBoolean(cb_shop.NIL == cb_shop.$cb_last_planner_number$.getDynamicValue(thread)), (SubLObject)cb_shop.UNPROVIDED);
                                html_utilities.html_indent((SubLObject)cb_shop.UNPROVIDED);
                                html_utilities.html_princ((SubLObject)cb_shop.$str256$All_plans);
                                html_utilities.html_indent((SubLObject)cb_shop.FIVE_INTEGER);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$67, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$66, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_shop.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
                        final SubLObject _prev_bind_0_$68 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
                            final SubLObject _prev_bind_0_$69 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
                                html_utilities.html_radio_input((SubLObject)cb_shop.$str149$cutoff_number, (SubLObject)cb_shop.$str150$number, list_utilities.sublisp_boolean(cb_shop.$cb_last_planner_number$.getDynamicValue(thread)), (SubLObject)cb_shop.UNPROVIDED);
                                html_utilities.html_indent((SubLObject)cb_shop.UNPROVIDED);
                                html_utilities.html_text_input((SubLObject)cb_shop.$str150$number, number_string, (SubLObject)cb_shop.THREE_INTEGER);
                                html_utilities.html_princ((SubLObject)cb_shop.$str257$_plans);
                                html_utilities.html_indent((SubLObject)cb_shop.FIVE_INTEGER);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$69, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$68, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_shop.UNPROVIDED);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$63, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$62, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
                final SubLObject _prev_bind_0_$70 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
                    html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_shop.ZERO_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_shop.ZERO_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_shop.ZERO_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
                    final SubLObject _prev_bind_0_$71 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
                        final SubLObject _prev_bind_0_$72 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
                            final SubLObject _prev_bind_0_$73 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_utilities.html_princ((SubLObject)cb_shop.$str258$Time_Cutoff_);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$73, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$72, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_shop.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
                        final SubLObject _prev_bind_0_$74 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
                            final SubLObject _prev_bind_0_$75 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
                                html_utilities.html_radio_input((SubLObject)cb_shop.$str151$cutoff_time, (SubLObject)cb_shop.$str259$no_time, (SubLObject)SubLObjectFactory.makeBoolean(cb_shop.NIL == cb_shop.$cb_shop_time_cutoff$.getDynamicValue(thread)), (SubLObject)cb_shop.UNPROVIDED);
                                html_utilities.html_indent((SubLObject)cb_shop.UNPROVIDED);
                                html_utilities.html_princ((SubLObject)cb_shop.$str260$Run_forever);
                                html_utilities.html_indent((SubLObject)cb_shop.FIVE_INTEGER);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$75, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$74, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_shop.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
                        final SubLObject _prev_bind_0_$76 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
                            final SubLObject _prev_bind_0_$77 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
                                html_utilities.html_radio_input((SubLObject)cb_shop.$str151$cutoff_time, (SubLObject)cb_shop.$str152$time, list_utilities.sublisp_boolean(cb_shop.$cb_shop_time_cutoff$.getDynamicValue(thread)), (SubLObject)cb_shop.UNPROVIDED);
                                html_utilities.html_indent((SubLObject)cb_shop.UNPROVIDED);
                                html_utilities.html_text_input((SubLObject)cb_shop.$str152$time, time_string, (SubLObject)cb_shop.THREE_INTEGER);
                                html_utilities.html_princ((SubLObject)cb_shop.$str261$_seconds);
                                html_utilities.html_indent((SubLObject)cb_shop.FIVE_INTEGER);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$77, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$76, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_shop.UNPROVIDED);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$71, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$70, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
                final SubLObject _prev_bind_0_$78 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
                    html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_shop.ZERO_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_shop.ZERO_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_shop.ZERO_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
                    final SubLObject _prev_bind_0_$79 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
                        final SubLObject _prev_bind_0_$80 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
                            final SubLObject _prev_bind_0_$81 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_utilities.html_princ((SubLObject)cb_shop.$str262$Depth_Cutoff_);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$81, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$80, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_shop.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
                        final SubLObject _prev_bind_0_$82 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
                            final SubLObject _prev_bind_0_$83 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
                                html_utilities.html_radio_input((SubLObject)cb_shop.$str157$depth_limit_p, (SubLObject)cb_shop.$str263$no_depth_limit, Types.sublisp_null(cb_shop.$cb_shop_depth_limit$.getDynamicValue(thread)), (SubLObject)cb_shop.UNPROVIDED);
                                html_utilities.html_indent((SubLObject)cb_shop.UNPROVIDED);
                                html_utilities.html_princ((SubLObject)cb_shop.$str264$No);
                                html_utilities.html_indent((SubLObject)cb_shop.FIVE_INTEGER);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$83, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$82, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_shop.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
                        final SubLObject _prev_bind_0_$84 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
                            final SubLObject _prev_bind_0_$85 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
                                html_utilities.html_radio_input((SubLObject)cb_shop.$str157$depth_limit_p, (SubLObject)cb_shop.$str158$depth_limit, cb_shop.$cb_shop_depth_limit$.getDynamicValue(thread), (SubLObject)cb_shop.UNPROVIDED);
                                html_utilities.html_indent((SubLObject)cb_shop.UNPROVIDED);
                                html_utilities.html_princ((SubLObject)cb_shop.$str265$Yes);
                                html_utilities.html_text_input((SubLObject)cb_shop.$str158$depth_limit, (SubLObject)((cb_shop.NIL == cb_shop.$cb_shop_depth_limit$.getDynamicValue(thread)) ? cb_shop.$str253$ : PrintLow.write_to_string(cb_shop.$cb_shop_depth_limit$.getDynamicValue(thread), cb_shop.EMPTY_SUBL_OBJECT_ARRAY)), (SubLObject)cb_shop.FIVE_INTEGER);
                                html_utilities.html_indent((SubLObject)cb_shop.FIVE_INTEGER);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$85, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$84, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_shop.UNPROVIDED);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$79, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$78, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
                final SubLObject _prev_bind_0_$86 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
                    html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_shop.ZERO_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_shop.ZERO_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_shop.ZERO_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
                    final SubLObject _prev_bind_0_$87 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
                        final SubLObject _prev_bind_0_$88 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
                            final SubLObject _prev_bind_0_$89 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_utilities.html_princ((SubLObject)cb_shop.$str266$Back_Chaining_);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$89, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$88, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_shop.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
                        final SubLObject _prev_bind_0_$90 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
                            final SubLObject _prev_bind_0_$91 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
                                html_utilities.html_radio_input((SubLObject)cb_shop.$str153$do_fi_asks, (SubLObject)cb_shop.$str267$nil, Equality.eq(cb_shop.$cb_shop_num_backchains$.getDynamicValue(thread), (SubLObject)cb_shop.ZERO_INTEGER), (SubLObject)cb_shop.UNPROVIDED);
                                html_utilities.html_indent((SubLObject)cb_shop.UNPROVIDED);
                                html_utilities.html_princ((SubLObject)cb_shop.$str268$No_backchaining);
                                html_utilities.html_indent((SubLObject)cb_shop.FIVE_INTEGER);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$91, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$90, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_shop.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
                        final SubLObject _prev_bind_0_$92 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
                            final SubLObject _prev_bind_0_$93 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
                                html_utilities.html_radio_input((SubLObject)cb_shop.$str153$do_fi_asks, (SubLObject)cb_shop.$str154$do_asks, Numbers.numGE(cb_shop.$cb_shop_num_backchains$.getDynamicValue(thread), (SubLObject)cb_shop.ONE_INTEGER), (SubLObject)cb_shop.UNPROVIDED);
                                html_utilities.html_indent((SubLObject)cb_shop.UNPROVIDED);
                                html_utilities.html_text_input((SubLObject)cb_shop.$str155$num_backchains, PrintLow.write_to_string(cb_shop.$cb_shop_num_backchains$.getDynamicValue(thread), cb_shop.EMPTY_SUBL_OBJECT_ARRAY), (SubLObject)cb_shop.THREE_INTEGER);
                                html_utilities.html_princ((SubLObject)cb_shop.$str269$_backchains);
                                html_utilities.html_indent((SubLObject)cb_shop.FIVE_INTEGER);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$93, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$92, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_shop.UNPROVIDED);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$87, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$86, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$60, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_shop.UNPROVIDED);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
        html_utilities.html_newline((SubLObject)cb_shop.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_shop.ZERO_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_shop.ZERO_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_shop.ZERO_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
        _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
            final SubLObject _prev_bind_0_$94 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
                final SubLObject _prev_bind_0_$95 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
                    html_utilities.html_indent((SubLObject)cb_shop.THREE_INTEGER);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$95, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
                final SubLObject _prev_bind_0_$96 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
                    html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_shop.ZERO_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_shop.ZERO_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_shop.ZERO_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
                    final SubLObject _prev_bind_0_$97 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
                        final SubLObject _prev_bind_0_$98 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
                            final SubLObject _prev_bind_0_$99 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_utilities.html_princ((SubLObject)cb_shop.$str270$Cycle_Checking_);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$99, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$98, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_shop.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
                        final SubLObject _prev_bind_0_$100 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
                            final SubLObject _prev_bind_0_$101 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
                                html_utilities.html_radio_input((SubLObject)cb_shop.$str156$cycle_checking, (SubLObject)cb_shop.$str271$no_cycle_checking, Equality.eq(cb_shop.$cb_shop_cycle_checking_enabledP$.getDynamicValue(thread), (SubLObject)cb_shop.NIL), (SubLObject)cb_shop.UNPROVIDED);
                                html_utilities.html_indent((SubLObject)cb_shop.UNPROVIDED);
                                html_utilities.html_princ((SubLObject)cb_shop.$str264$No);
                                html_utilities.html_indent((SubLObject)cb_shop.FIVE_INTEGER);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$101, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$100, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_shop.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
                        final SubLObject _prev_bind_0_$102 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
                            final SubLObject _prev_bind_0_$103 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
                                html_utilities.html_radio_input((SubLObject)cb_shop.$str156$cycle_checking, (SubLObject)cb_shop.$str156$cycle_checking, Equality.eq(cb_shop.$cb_shop_cycle_checking_enabledP$.getDynamicValue(thread), (SubLObject)cb_shop.T), (SubLObject)cb_shop.UNPROVIDED);
                                html_utilities.html_indent((SubLObject)cb_shop.UNPROVIDED);
                                html_utilities.html_princ((SubLObject)cb_shop.$str265$Yes);
                                html_utilities.html_indent((SubLObject)cb_shop.FIVE_INTEGER);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$103, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$102, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_shop.UNPROVIDED);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$97, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$96, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
                final SubLObject _prev_bind_0_$104 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
                    html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_shop.ZERO_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_shop.ZERO_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_shop.ZERO_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
                    final SubLObject _prev_bind_0_$105 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
                        final SubLObject _prev_bind_0_$106 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
                            final SubLObject _prev_bind_0_$107 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_utilities.html_princ((SubLObject)cb_shop.$str272$Log_Process_);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$107, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$106, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_shop.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
                        final SubLObject _prev_bind_0_$108 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
                            final SubLObject _prev_bind_0_$109 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
                                html_utilities.html_radio_input((SubLObject)cb_shop.$str148$verbosity_level, (SubLObject)cb_shop.$str161$no_logging, Numbers.numE(cb_shop.$cb_shop_verbosity$.getDynamicValue(thread), (SubLObject)cb_shop.ZERO_INTEGER), (SubLObject)cb_shop.UNPROVIDED);
                                html_utilities.html_indent((SubLObject)cb_shop.UNPROVIDED);
                                html_utilities.html_princ((SubLObject)cb_shop.$str264$No);
                                html_utilities.html_indent((SubLObject)cb_shop.FIVE_INTEGER);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$109, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$108, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_shop.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
                        final SubLObject _prev_bind_0_$110 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
                            final SubLObject _prev_bind_0_$111 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
                                html_utilities.html_radio_input((SubLObject)cb_shop.$str148$verbosity_level, (SubLObject)cb_shop.$str160$logging, Numbers.numG(cb_shop.$cb_shop_verbosity$.getDynamicValue(thread), (SubLObject)cb_shop.ZERO_INTEGER), (SubLObject)cb_shop.UNPROVIDED);
                                html_utilities.html_indent((SubLObject)cb_shop.UNPROVIDED);
                                html_utilities.html_princ((SubLObject)cb_shop.$str265$Yes);
                                html_utilities.html_indent((SubLObject)cb_shop.FIVE_INTEGER);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$111, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$110, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_shop.UNPROVIDED);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$105, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$104, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$94, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_shop.UNPROVIDED);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return (SubLObject)cb_shop.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-shop.lisp", position = 34359L)
    public static SubLObject find_keyword_for_search_type(final SubLObject search_type) {
        SubLObject v_answer = (SubLObject)cb_shop.NIL;
        if (search_type.equal((SubLObject)cb_shop.$str273$_all)) {
            v_answer = (SubLObject)cb_shop.$kw18$ALL;
        }
        else if (search_type.equal((SubLObject)cb_shop.$str274$_first)) {
            v_answer = (SubLObject)cb_shop.$kw275$FIRST;
        }
        else if (search_type.equal((SubLObject)cb_shop.$str276$_shallowest)) {
            v_answer = (SubLObject)cb_shop.$kw277$SHALLOWEST;
        }
        else if (search_type.equal((SubLObject)cb_shop.$str278$_all_shallowest)) {
            v_answer = (SubLObject)cb_shop.$kw279$ALL_SHALLOWEST;
        }
        else if (search_type.equal((SubLObject)cb_shop.$str280$_id_first)) {
            v_answer = (SubLObject)cb_shop.$kw281$ID_FIRST;
        }
        else if (search_type.equal((SubLObject)cb_shop.$str282$_id_all)) {
            v_answer = (SubLObject)cb_shop.$kw283$ID_ALL;
        }
        else {
            v_answer = (SubLObject)cb_shop.$kw18$ALL;
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-shop.lisp", position = 34882L)
    public static SubLObject plan_task_examiner_internal(final SubLObject args) {
        final SubLObject id_string = args.first();
        final SubLObject task_displayer = methods.funcall_class_method_with_1_args((SubLObject)cb_shop.$sym284$HTML_TASK_DISPLAYER, (SubLObject)cb_shop.$sym285$FIND_INSTANCE_BY_ID_STRING, id_string);
        methods.funcall_instance_method_with_1_args(task_displayer, (SubLObject)cb_shop.$sym286$HTML_TASK_PAGE, (SubLObject)cb_shop.NIL);
        return (SubLObject)cb_shop.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-shop.lisp", position = 35238L)
    public static SubLObject display_html_plans(final SubLObject plans, final SubLObject halt_reason) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_utilities.html_princ((SubLObject)cb_shop.$str287$Number_of_plans_found__);
        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        html_utilities.html_princ(Sequences.length(plans));
        html_utilities.html_newline((SubLObject)cb_shop.TWO_INTEGER);
        cb_planner_display_halt_reason(halt_reason);
        html_utilities.html_newline((SubLObject)cb_shop.TWO_INTEGER);
        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_utilities.html_princ((SubLObject)cb_shop.$str288$Plans_);
        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        if (cb_shop.NIL != plans) {
            html_utilities.html_newline((SubLObject)cb_shop.UNPROVIDED);
            SubLObject j = (SubLObject)cb_shop.ONE_INTEGER;
            final SubLObject style_controls = (SubLObject)ConsesLow.list(cb_shop.$cb_last_planner_format$.getDynamicValue(thread), cb_shop.$cb_last_planner_structure$.getDynamicValue(thread), (SubLObject)cb_shop.$kw289$TASK_EXAMINER_LINKS);
            SubLObject cdolist_list_var = plans;
            SubLObject plan = (SubLObject)cb_shop.NIL;
            plan = cdolist_list_var.first();
            while (cb_shop.NIL != cdolist_list_var) {
                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                html_utilities.html_princ((SubLObject)cb_shop.$str290$Plan_);
                html_utilities.html_prin1(j);
                html_utilities.html_princ((SubLObject)cb_shop.$str291$_);
                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                shop_displayers.html_plan_displayer_html_form_method(plan, style_controls);
                html_utilities.html_newline((SubLObject)cb_shop.UNPROVIDED);
                j = Numbers.add(j, (SubLObject)cb_shop.ONE_INTEGER);
                cdolist_list_var = cdolist_list_var.rest();
                plan = cdolist_list_var.first();
            }
        }
        else {
            html_utilities.html_indent((SubLObject)cb_shop.UNPROVIDED);
            html_utilities.html_princ((SubLObject)cb_shop.$str292$No_plans_found_);
            html_utilities.html_newline((SubLObject)cb_shop.UNPROVIDED);
        }
        return (SubLObject)cb_shop.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-shop.lisp", position = 36360L)
    public static SubLObject cb_shop_abort_link_handler(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject id_str = (SubLObject)cb_shop.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(args, args, (SubLObject)cb_shop.$list296);
        id_str = args.first();
        final SubLObject current = args.rest();
        if (cb_shop.NIL == current) {
            final SubLObject pw = Functions.funcall(html_id_links.html_id_lookup_func(cb_shop.$cb_shop_processes$.getDynamicValue(thread)), cb_shop.$cb_shop_processes$.getDynamicValue(thread), reader.read_from_string_ignoring_errors(id_str, (SubLObject)cb_shop.UNPROVIDED, (SubLObject)cb_shop.UNPROVIDED, (SubLObject)cb_shop.UNPROVIDED, (SubLObject)cb_shop.UNPROVIDED));
            process_utilities.process_wrapper_process_abort(pw);
            dictionary.dictionary_remove(cb_shop.$cb_shop_processes$.getDynamicValue(thread), process_utilities.process_wrapper_get_id(pw));
            return plan_finder((SubLObject)cb_shop.NIL);
        }
        cdestructuring_bind.cdestructuring_bind_error(args, (SubLObject)cb_shop.$list296);
        return (SubLObject)cb_shop.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-shop.lisp", position = 36360L)
    public static SubLObject cb_shop_abort_link(final SubLObject pw) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject id = Functions.funcall(html_id_links.html_id_id_func(cb_shop.$cb_shop_processes$.getDynamicValue(thread)), pw);
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_shop.$kw121$MAIN);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_shop.$str298$_a__a, (SubLObject)cb_shop.$str299$cb_shop_abort_link_handler, id);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
        if (cb_shop.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
            html_utilities.html_princ((SubLObject)cb_shop.$str300$_Abort_);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return (SubLObject)cb_shop.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-shop.lisp", position = 36607L)
    public static SubLObject cb_shop_pause_link_handler(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject id_str = (SubLObject)cb_shop.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(args, args, (SubLObject)cb_shop.$list296);
        id_str = args.first();
        final SubLObject current = args.rest();
        if (cb_shop.NIL == current) {
            final SubLObject a = Functions.funcall(html_id_links.html_id_lookup_func(cb_shop.$cb_shop_processes$.getDynamicValue(thread)), cb_shop.$cb_shop_processes$.getDynamicValue(thread), reader.read_from_string_ignoring_errors(id_str, (SubLObject)cb_shop.UNPROVIDED, (SubLObject)cb_shop.UNPROVIDED, (SubLObject)cb_shop.UNPROVIDED, (SubLObject)cb_shop.UNPROVIDED));
            process_utilities.process_wrapper_process_pause(a);
            return plan_finder((SubLObject)cb_shop.NIL);
        }
        cdestructuring_bind.cdestructuring_bind_error(args, (SubLObject)cb_shop.$list296);
        return (SubLObject)cb_shop.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-shop.lisp", position = 36607L)
    public static SubLObject cb_shop_pause_link(final SubLObject a) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject id = Functions.funcall(html_id_links.html_id_id_func(cb_shop.$cb_shop_processes$.getDynamicValue(thread)), a);
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_shop.$kw121$MAIN);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_shop.$str298$_a__a, (SubLObject)cb_shop.$str302$cb_shop_pause_link_handler, id);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
        if (cb_shop.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
            html_utilities.html_princ((SubLObject)cb_shop.$str303$_Pause_);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return (SubLObject)cb_shop.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-shop.lisp", position = 36784L)
    public static SubLObject cb_shop_resume_link_handler(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject id_str = (SubLObject)cb_shop.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(args, args, (SubLObject)cb_shop.$list296);
        id_str = args.first();
        final SubLObject current = args.rest();
        if (cb_shop.NIL == current) {
            final SubLObject pw = Functions.funcall(html_id_links.html_id_lookup_func(cb_shop.$cb_shop_processes$.getDynamicValue(thread)), cb_shop.$cb_shop_processes$.getDynamicValue(thread), reader.read_from_string_ignoring_errors(id_str, (SubLObject)cb_shop.UNPROVIDED, (SubLObject)cb_shop.UNPROVIDED, (SubLObject)cb_shop.UNPROVIDED, (SubLObject)cb_shop.UNPROVIDED));
            process_utilities.process_wrapper_process_resume(pw);
            return plan_finder((SubLObject)cb_shop.NIL);
        }
        cdestructuring_bind.cdestructuring_bind_error(args, (SubLObject)cb_shop.$list296);
        return (SubLObject)cb_shop.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-shop.lisp", position = 36784L)
    public static SubLObject cb_shop_resume_link(final SubLObject pw) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject id = Functions.funcall(html_id_links.html_id_id_func(cb_shop.$cb_shop_processes$.getDynamicValue(thread)), pw);
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_shop.$kw121$MAIN);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_shop.$str298$_a__a, (SubLObject)cb_shop.$str305$cb_shop_resume_link_handler, id);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
        if (cb_shop.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
            html_utilities.html_princ((SubLObject)cb_shop.$str306$_Resume_);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return (SubLObject)cb_shop.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-shop.lisp", position = 36966L)
    public static SubLObject cb_shop_view_link_handler(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject id_str = (SubLObject)cb_shop.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(args, args, (SubLObject)cb_shop.$list296);
        id_str = args.first();
        final SubLObject current = args.rest();
        if (cb_shop.NIL == current) {
            final SubLObject pw = Functions.funcall(html_id_links.html_id_lookup_func(cb_shop.$cb_shop_processes$.getDynamicValue(thread)), cb_shop.$cb_shop_processes$.getDynamicValue(thread), reader.read_from_string_ignoring_errors(id_str, (SubLObject)cb_shop.UNPROVIDED, (SubLObject)cb_shop.UNPROVIDED, (SubLObject)cb_shop.UNPROVIDED, (SubLObject)cb_shop.UNPROVIDED));
            cb_shop_plan_process_view(pw);
            return plan_examiner_internal((SubLObject)cb_shop.NIL);
        }
        cdestructuring_bind.cdestructuring_bind_error(args, (SubLObject)cb_shop.$list296);
        return (SubLObject)cb_shop.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-shop.lisp", position = 36966L)
    public static SubLObject cb_shop_view_link(final SubLObject pw) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject id = Functions.funcall(html_id_links.html_id_id_func(cb_shop.$cb_shop_processes$.getDynamicValue(thread)), pw);
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_shop.$kw121$MAIN);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_shop.$str298$_a__a, (SubLObject)cb_shop.$str308$cb_shop_view_link_handler, id);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
        if (cb_shop.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
            html_utilities.html_princ((SubLObject)cb_shop.$str309$_View_);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return (SubLObject)cb_shop.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-shop.lisp", position = 37153L)
    public static SubLObject cb_shop_replan_link_handler(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject id_str = (SubLObject)cb_shop.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(args, args, (SubLObject)cb_shop.$list296);
        id_str = args.first();
        final SubLObject current = args.rest();
        if (cb_shop.NIL == current) {
            final SubLObject pw = Functions.funcall(html_id_links.html_id_lookup_func(cb_shop.$cb_shop_processes$.getDynamicValue(thread)), cb_shop.$cb_shop_processes$.getDynamicValue(thread), reader.read_from_string_ignoring_errors(id_str, (SubLObject)cb_shop.UNPROVIDED, (SubLObject)cb_shop.UNPROVIDED, (SubLObject)cb_shop.UNPROVIDED, (SubLObject)cb_shop.UNPROVIDED));
            cb_shop_replan(pw);
            return plan_finder((SubLObject)cb_shop.NIL);
        }
        cdestructuring_bind.cdestructuring_bind_error(args, (SubLObject)cb_shop.$list296);
        return (SubLObject)cb_shop.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-shop.lisp", position = 37153L)
    public static SubLObject cb_shop_replan_link(final SubLObject pw) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject id = Functions.funcall(html_id_links.html_id_id_func(cb_shop.$cb_shop_processes$.getDynamicValue(thread)), pw);
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_shop.$kw121$MAIN);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_shop.$str298$_a__a, (SubLObject)cb_shop.$str311$cb_shop_replan_link_handler, id);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
        if (cb_shop.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
            html_utilities.html_princ((SubLObject)cb_shop.$str312$_Replan_);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return (SubLObject)cb_shop.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-shop.lisp", position = 37318L)
    public static SubLObject cb_shop_verbose_link_handler(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject id_str = (SubLObject)cb_shop.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(args, args, (SubLObject)cb_shop.$list296);
        id_str = args.first();
        final SubLObject current = args.rest();
        if (cb_shop.NIL == current) {
            final SubLObject pw = Functions.funcall(html_id_links.html_id_lookup_func(cb_shop.$cb_shop_processes$.getDynamicValue(thread)), cb_shop.$cb_shop_processes$.getDynamicValue(thread), reader.read_from_string_ignoring_errors(id_str, (SubLObject)cb_shop.UNPROVIDED, (SubLObject)cb_shop.UNPROVIDED, (SubLObject)cb_shop.UNPROVIDED, (SubLObject)cb_shop.UNPROVIDED));
            final SubLObject _prev_bind_0 = cb_shop.$cb_shop_planner_thread$.currentBinding(thread);
            try {
                cb_shop.$cb_shop_planner_thread$.bind(cb_shop_plan_process_get_thread(pw), thread);
                plan_verbose_examiner_internal((SubLObject)cb_shop.NIL);
            }
            finally {
                cb_shop.$cb_shop_planner_thread$.rebind(_prev_bind_0, thread);
            }
            return (SubLObject)cb_shop.NIL;
        }
        cdestructuring_bind.cdestructuring_bind_error(args, (SubLObject)cb_shop.$list296);
        return (SubLObject)cb_shop.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-shop.lisp", position = 37318L)
    public static SubLObject cb_shop_verbose_link(final SubLObject pw) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject id = Functions.funcall(html_id_links.html_id_id_func(cb_shop.$cb_shop_processes$.getDynamicValue(thread)), pw);
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_shop.$kw121$MAIN);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_shop.$str298$_a__a, (SubLObject)cb_shop.$str314$cb_shop_verbose_link_handler, id);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
        if (cb_shop.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
            html_utilities.html_princ((SubLObject)cb_shop.$str315$_Log_);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return (SubLObject)cb_shop.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-shop.lisp", position = 37562L)
    public static SubLObject cb_shop_delete_link_handler(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject id_str = (SubLObject)cb_shop.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(args, args, (SubLObject)cb_shop.$list296);
        id_str = args.first();
        final SubLObject current = args.rest();
        if (cb_shop.NIL == current) {
            final SubLObject pw = Functions.funcall(html_id_links.html_id_lookup_func(cb_shop.$cb_shop_processes$.getDynamicValue(thread)), cb_shop.$cb_shop_processes$.getDynamicValue(thread), reader.read_from_string_ignoring_errors(id_str, (SubLObject)cb_shop.UNPROVIDED, (SubLObject)cb_shop.UNPROVIDED, (SubLObject)cb_shop.UNPROVIDED, (SubLObject)cb_shop.UNPROVIDED));
            if (cb_shop.NIL == process_utilities.process_wrapper_process_completedP(pw)) {
                process_utilities.process_wrapper_process_abort(pw);
            }
            dictionary.dictionary_remove(cb_shop.$cb_shop_processes$.getDynamicValue(thread), process_utilities.process_wrapper_get_id(pw));
            return plan_finder((SubLObject)cb_shop.NIL);
        }
        cdestructuring_bind.cdestructuring_bind_error(args, (SubLObject)cb_shop.$list296);
        return (SubLObject)cb_shop.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-shop.lisp", position = 37562L)
    public static SubLObject cb_shop_delete_link(final SubLObject pw) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject id = Functions.funcall(html_id_links.html_id_id_func(cb_shop.$cb_shop_processes$.getDynamicValue(thread)), pw);
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_shop.$kw121$MAIN);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_shop.$str298$_a__a, (SubLObject)cb_shop.$str317$cb_shop_delete_link_handler, id);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
        if (cb_shop.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
            html_utilities.html_princ((SubLObject)cb_shop.$str318$_Delete_);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return (SubLObject)cb_shop.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-shop.lisp", position = 37868L)
    public static SubLObject cb_shop_domain_examiner_link_handler(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject id_str = (SubLObject)cb_shop.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(args, args, (SubLObject)cb_shop.$list296);
        id_str = args.first();
        final SubLObject current = args.rest();
        if (cb_shop.NIL == current) {
            final SubLObject pw = Functions.funcall(html_id_links.html_id_lookup_func(cb_shop.$cb_shop_processes$.getDynamicValue(thread)), cb_shop.$cb_shop_processes$.getDynamicValue(thread), reader.read_from_string_ignoring_errors(id_str, (SubLObject)cb_shop.UNPROVIDED, (SubLObject)cb_shop.UNPROVIDED, (SubLObject)cb_shop.UNPROVIDED, (SubLObject)cb_shop.UNPROVIDED));
            return cb_shop_domain_examiner(cb_shop_plan_process_get_domain(pw));
        }
        cdestructuring_bind.cdestructuring_bind_error(args, (SubLObject)cb_shop.$list296);
        return (SubLObject)cb_shop.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-shop.lisp", position = 37868L)
    public static SubLObject cb_shop_domain_examiner_link(final SubLObject pw) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject id = Functions.funcall(html_id_links.html_id_id_func(cb_shop.$cb_shop_processes$.getDynamicValue(thread)), pw);
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_shop.$kw121$MAIN);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_shop.$str298$_a__a, (SubLObject)cb_shop.$str320$cb_shop_domain_examiner_link_hand, id);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
        if (cb_shop.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
            html_utilities.html_princ((SubLObject)cb_shop.$str321$_Domain_);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return (SubLObject)cb_shop.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-shop.lisp", position = 38067L)
    public static SubLObject cb_shop_plan_process_get_thread(final SubLObject pw) {
        return process_utilities.process_wrapper_get_property(pw, (SubLObject)cb_shop.$kw322$THREAD_STRUCTURE, (SubLObject)cb_shop.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-shop.lisp", position = 38264L)
    public static SubLObject cb_shop_plan_process_set_planner(final SubLObject pw, final SubLObject planner) {
        return process_utilities.process_wrapper_set_property(pw, (SubLObject)cb_shop.$kw57$PLANNER, planner);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-shop.lisp", position = 38470L)
    public static SubLObject cb_shop_plan_process_get_task(final SubLObject pw) {
        final SubLObject task = shop_basic_planner_thread.shop_planner_thread_task(cb_shop_plan_process_get_thread(pw));
        if (cb_shop.NIL != task) {
            return task;
        }
        return (SubLObject)cb_shop.$str323$Initializing;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-shop.lisp", position = 38763L)
    public static SubLObject cb_shop_plan_process_get_domain(final SubLObject pw) {
        return methods.funcall_instance_method_with_0_args(cb_shop_plan_process_get_thread(pw), (SubLObject)cb_shop.$sym324$GET_DOMAIN);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-shop.lisp", position = 38949L)
    public static SubLObject cb_shop_plan_process_num_open_nodes(final SubLObject pw) {
        final SubLObject thread = cb_shop_plan_process_get_thread(pw);
        if (cb_shop.NIL != thread) {
            return shop_basic_planner_thread.shop_planner_thread_num_open_nodes(thread);
        }
        return (SubLObject)cb_shop.ONE_INTEGER;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-shop.lisp", position = 39242L)
    public static SubLObject cb_shop_plan_process_num_inferences(final SubLObject pw) {
        final SubLObject thread = cb_shop_plan_process_get_thread(pw);
        if (cb_shop.NIL != thread) {
            return shop_basic_planner_thread.shop_planner_thread_num_inferences(thread);
        }
        return (SubLObject)cb_shop.ZERO_INTEGER;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-shop.lisp", position = 39535L)
    public static SubLObject cb_shop_plan_process_num_expansions(final SubLObject pw) {
        final SubLObject thread = cb_shop_plan_process_get_thread(pw);
        if (cb_shop.NIL != thread) {
            return shop_basic_planner_thread.shop_planner_thread_nodes_expanded(thread);
        }
        return (SubLObject)cb_shop.ZERO_INTEGER;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-shop.lisp", position = 39828L)
    public static SubLObject cb_shop_plan_process_num_plans(final SubLObject pw) {
        final SubLObject thread = cb_shop_plan_process_get_thread(pw);
        if (cb_shop.NIL != thread) {
            return shop_basic_planner_thread.shop_planner_thread_num_plans_found(thread);
        }
        return (SubLObject)cb_shop.ZERO_INTEGER;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-shop.lisp", position = 40117L)
    public static SubLObject cb_shop_plan_process_verbosity(final SubLObject pw) {
        final SubLObject thread = cb_shop_plan_process_get_thread(pw);
        final SubLObject log = instances.get_slot(thread, (SubLObject)cb_shop.$sym226$LOG);
        if (cb_shop.NIL != thread) {
            return instances.get_slot(log, (SubLObject)cb_shop.$sym228$VERBOSE);
        }
        return (SubLObject)cb_shop.ZERO_INTEGER;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-shop.lisp", position = 40410L)
    public static SubLObject cb_shop_plan_halt_status(final SubLObject pw) {
        final SubLObject thread = cb_shop_plan_process_get_thread(pw);
        final SubLObject halt_status = instances.get_slot(thread, (SubLObject)cb_shop.$sym234$HALT_STATUS);
        if (cb_shop.NIL != thread) {
            return halt_status;
        }
        return (SubLObject)cb_shop.$kw325$UNKNOWN;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-shop.lisp", position = 40709L)
    public static SubLObject cb_shop_plan_process_view(final SubLObject pw) {
        final SubLObject thread = cb_shop_plan_process_get_thread(pw);
        clear_plan_displayers();
        init_plan_displayers(thread);
        return (SubLObject)cb_shop.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-shop.lisp", position = 40911L)
    public static SubLObject cb_shop_replan(final SubLObject pw) {
        final SubLObject thread = cb_shop_plan_process_get_thread(pw);
        final SubLObject problem = instances.get_slot(thread, (SubLObject)cb_shop.$sym235$PROBLEM);
        final SubLObject tasklist = instances.get_slot(problem, (SubLObject)cb_shop.$sym326$TASKS);
        final SubLObject mt = instances.get_slot(problem, (SubLObject)cb_shop.$sym327$TASK_MT);
        if (cb_shop.NIL != list_utilities.singletonP(tasklist)) {
            cb_shop_new_plan_process(tasklist.first(), mt);
        }
        return (SubLObject)cb_shop.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-shop.lisp", position = 41267L)
    public static SubLObject cb_shop_information_refreshP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(cb_shop.$cb_shop_processes$.getDynamicValue(thread))); cb_shop.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject cur_id = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject cur_pw = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (cb_shop.NIL != process_utilities.process_wrapper_process_runningP(cur_pw)) {
                return (SubLObject)cb_shop.T;
            }
            if (cb_shop.NIL != process_utilities.process_wrapper_process_pausingP(cur_pw)) {
                return (SubLObject)cb_shop.T;
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return (SubLObject)cb_shop.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-shop.lisp", position = 41542L)
    public static SubLObject cb_shop_display_processes() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_shop.NIL != dictionary.dictionary_empty_p(cb_shop.$cb_shop_processes$.getDynamicValue(thread))) {
            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
            html_utilities.html_princ((SubLObject)cb_shop.$str328$No_Plans_Currently_Available_);
            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            return (SubLObject)cb_shop.NIL;
        }
        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_shop.ZERO_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
            final SubLObject _prev_bind_0_$112 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
                html_utilities.html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
                final SubLObject _prev_bind_0_$113 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
                    html_utilities.html_princ((SubLObject)cb_shop.$str329$Status);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$113, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                cb_shop_display_process_stats_header();
                html_utilities.html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
                final SubLObject _prev_bind_0_$114 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
                    html_utilities.html_princ((SubLObject)cb_shop.$str330$Actions);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$114, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$112, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_shop.UNPROVIDED);
            SubLObject iteration_state;
            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(cb_shop.$cb_shop_processes$.getDynamicValue(thread))); cb_shop.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                thread.resetMultipleValues();
                final SubLObject cur_id = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                final SubLObject cur_pw = thread.secondMultipleValue();
                thread.resetMultipleValues();
                cb_shop_display_process(cur_pw);
            }
            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return (SubLObject)cb_shop.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-shop.lisp", position = 42181L)
    public static SubLObject cb_shop_pw_func(final SubLObject pw, final SubLObject task, final SubLObject domain_mt, final SubLObject verbose, final SubLObject number, final SubLObject time, final SubLObject depth, final SubLObject back_chains) {
        final SubLObject planner = object.object_new_method((SubLObject)cb_shop.$sym74$CYC_DEVELOPMENT_PLANNER);
        final SubLObject thread = cb_shop_new_plan_thread(planner, verbose);
        instances.set_slot(thread, (SubLObject)cb_shop.$sym227$P_WRAPPER, pw);
        instances.set_slot(thread, (SubLObject)cb_shop.$sym331$NUM_BACKCHAINS, back_chains);
        methods.funcall_instance_method_with_1_args(planner, (SubLObject)cb_shop.$sym332$MAKE_DOMAIN_FROM_MT, domain_mt);
        shop_basic_planner_thread.shop_plan_process_set_thread(pw, thread);
        return shop_basic_planner_thread.shop_basic_planner_thread_find_plans_method(thread, task, domain_mt, (SubLObject)cb_shop.$kw18$ALL, verbose, number, time, depth);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-shop.lisp", position = 42766L)
    public static SubLObject cb_shop_pw_proof_checking_func(final SubLObject pw, final SubLObject task, final SubLObject domain_mt, final SubLObject rules, final SubLObject verbose, final SubLObject number, final SubLObject time, final SubLObject depth, final SubLObject back_chains) {
        final SubLObject planner = object.object_new_method((SubLObject)cb_shop.$sym74$CYC_DEVELOPMENT_PLANNER);
        final SubLObject thread = cb_shop_new_plan_thread(planner, verbose);
        instances.set_slot(thread, (SubLObject)cb_shop.$sym227$P_WRAPPER, pw);
        instances.set_slot(thread, (SubLObject)cb_shop.$sym331$NUM_BACKCHAINS, back_chains);
        methods.funcall_instance_method_with_2_args(planner, (SubLObject)cb_shop.$sym93$MAKE_DOMAIN_WITH_RULES, rules, domain_mt);
        shop_basic_planner_thread.shop_plan_process_set_thread(pw, thread);
        return shop_basic_planner_thread.shop_basic_planner_thread_find_plans_method(thread, task, domain_mt, (SubLObject)cb_shop.$kw18$ALL, verbose, number, time, depth);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-shop.lisp", position = 43430L)
    public static SubLObject cb_shop_new_plan_process(final SubLObject task, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_shop.NIL == task || cb_shop.NIL == mt) {
            return (SubLObject)cb_shop.NIL;
        }
        if (cb_shop.NIL != cb_shop_plan_checking_enabled()) {
            final SubLObject rules = cb_shop_plan_checking_rules();
            final SubLObject _prev_bind_0 = shop_parameters.$shop_method_cycle_checking_enabledP$.currentBinding(thread);
            final SubLObject _prev_bind_2 = shop_parameters.$shop_default_depth_limit$.currentBinding(thread);
            try {
                shop_parameters.$shop_method_cycle_checking_enabledP$.bind(cb_shop.$cb_shop_cycle_checking_enabledP$.getDynamicValue(thread), thread);
                shop_parameters.$shop_default_depth_limit$.bind(cb_shop.$cb_shop_depth_limit$.getDynamicValue(thread), thread);
                final SubLObject pw = process_utilities.new_process_wrapper(cb_shop.$cb_shop_process_label$.getGlobalValue(), (SubLObject)cb_shop.$sym333$CB_SHOP_PW_PROOF_CHECKING_FUNC, (SubLObject)ConsesLow.list(task, mt, rules, cb_shop.$cb_shop_verbosity$.getDynamicValue(thread), cb_shop.$cb_last_planner_number$.getDynamicValue(thread), cb_shop.$cb_shop_time_cutoff$.getDynamicValue(thread), cb_shop.$cb_shop_depth_limit$.getDynamicValue(thread), cb_shop.$cb_shop_num_backchains$.getDynamicValue(thread)));
                final SubLObject id = process_utilities.process_wrapper_get_id(pw);
                dictionary.dictionary_enter(cb_shop.$cb_shop_processes$.getDynamicValue(thread), id, pw);
            }
            finally {
                shop_parameters.$shop_default_depth_limit$.rebind(_prev_bind_2, thread);
                shop_parameters.$shop_method_cycle_checking_enabledP$.rebind(_prev_bind_0, thread);
            }
        }
        else {
            final SubLObject _prev_bind_3 = shop_parameters.$shop_method_cycle_checking_enabledP$.currentBinding(thread);
            final SubLObject _prev_bind_4 = shop_parameters.$shop_default_depth_limit$.currentBinding(thread);
            try {
                shop_parameters.$shop_method_cycle_checking_enabledP$.bind(cb_shop.$cb_shop_cycle_checking_enabledP$.getDynamicValue(thread), thread);
                shop_parameters.$shop_default_depth_limit$.bind(cb_shop.$cb_shop_depth_limit$.getDynamicValue(thread), thread);
                final SubLObject pw2 = process_utilities.new_process_wrapper(cb_shop.$cb_shop_process_label$.getGlobalValue(), (SubLObject)cb_shop.$sym334$CB_SHOP_PW_FUNC, (SubLObject)ConsesLow.list(task, mt, cb_shop.$cb_shop_verbosity$.getDynamicValue(thread), cb_shop.$cb_last_planner_number$.getDynamicValue(thread), cb_shop.$cb_shop_time_cutoff$.getDynamicValue(thread), cb_shop.$cb_shop_depth_limit$.getDynamicValue(thread), cb_shop.$cb_shop_num_backchains$.getDynamicValue(thread)));
                final SubLObject id2 = process_utilities.process_wrapper_get_id(pw2);
                dictionary.dictionary_enter(cb_shop.$cb_shop_processes$.getDynamicValue(thread), id2, pw2);
            }
            finally {
                shop_parameters.$shop_default_depth_limit$.rebind(_prev_bind_4, thread);
                shop_parameters.$shop_method_cycle_checking_enabledP$.rebind(_prev_bind_3, thread);
            }
        }
        return (SubLObject)cb_shop.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-shop.lisp", position = 44525L)
    public static SubLObject cb_shop_display_process_stats_header() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup(html_macros.$html_table_header_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_table_data_width$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_shop.$int335$30);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
            html_utilities.html_princ((SubLObject)cb_shop.$str170$Task);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_table_header_head$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
        _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
            html_utilities.html_princ((SubLObject)cb_shop.$str336$Open_Nodes);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_table_header_head$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
        _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
            html_utilities.html_princ((SubLObject)cb_shop.$str337$Inferences);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_table_header_head$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
        _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
            html_utilities.html_princ((SubLObject)cb_shop.$str338$Expansions);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_table_header_head$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
        _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
            html_utilities.html_princ((SubLObject)cb_shop.$str339$Plans);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
        return (SubLObject)cb_shop.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-shop.lisp", position = 44869L)
    public static SubLObject cb_shop_display_process_stats(final SubLObject pw) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
            final SubLObject task = cb_shop_plan_process_get_task(pw);
            if (task.isString()) {
                html_utilities.html_princ(task);
            }
            else {
                cb_utilities.cb_form(task, (SubLObject)cb_shop.UNPROVIDED, (SubLObject)cb_shop.UNPROVIDED);
            }
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
        html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_shop.$kw340$RIGHT));
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
        _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
            html_utilities.html_princ(cb_shop_plan_process_num_open_nodes(pw));
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
        html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_shop.$kw340$RIGHT));
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
        _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
            html_utilities.html_princ(cb_shop_plan_process_num_inferences(pw));
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
        html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_shop.$kw340$RIGHT));
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
        _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
            html_utilities.html_princ(cb_shop_plan_process_num_expansions(pw));
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
        html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_shop.$kw340$RIGHT));
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
        _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
            html_utilities.html_princ(cb_shop_plan_process_num_plans(pw));
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
        return (SubLObject)cb_shop.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-shop.lisp", position = 45632L)
    public static SubLObject cb_shop_display_process_halt_status(final SubLObject pw) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject color_val = (SubLObject)cb_shop.$kw341$RED;
        html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
        if (cb_shop.NIL != color_val) {
            html_utilities.html_markup(html_macros.$html_font_color$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
            html_utilities.html_markup(html_utilities.html_color(color_val));
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_shop.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
            final SubLObject pcase_var = cb_shop_plan_halt_status(pw);
            if (pcase_var.eql((SubLObject)cb_shop.$kw179$DEPTH_CUTOFF)) {
                html_utilities.html_princ((SubLObject)cb_shop.$str342$Depth_Cutoff);
            }
            else if (pcase_var.eql((SubLObject)cb_shop.$kw181$NUMBER_CUTOFF)) {
                html_utilities.html_princ((SubLObject)cb_shop.$str343$Number_Cutoff);
            }
            else if (pcase_var.eql((SubLObject)cb_shop.$kw183$TIME_CUTOFF)) {
                html_utilities.html_princ((SubLObject)cb_shop.$str344$Time_Cutoff);
            }
            else if (cb_shop.NIL != process_utilities.process_wrapper_process_pausedP(pw)) {
                html_utilities.html_princ((SubLObject)cb_shop.$str345$Paused_By_User);
            }
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
        return (SubLObject)cb_shop.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-shop.lisp", position = 46149L)
    public static SubLObject cb_shop_display_process(final SubLObject pw) {
        if (cb_shop.NIL != process_utilities.process_wrapper_process_runningP(pw)) {
            cb_shop_display_running_process(pw);
        }
        else if (cb_shop.NIL != process_utilities.process_wrapper_process_pausingP(pw)) {
            cb_shop_display_pausing_process(pw);
        }
        else if (cb_shop.NIL != process_utilities.process_wrapper_process_pausedP(pw)) {
            cb_shop_display_paused_process(pw);
        }
        else if (cb_shop.NIL != process_utilities.process_wrapper_process_completedP(pw)) {
            cb_shop_display_completed_process(pw);
        }
        return (SubLObject)cb_shop.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-shop.lisp", position = 46599L)
    public static SubLObject cb_shop_display_completed_process(final SubLObject pw) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
            final SubLObject _prev_bind_0_$115 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
                html_utilities.html_princ((SubLObject)cb_shop.$str346$Completed);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$115, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            cb_shop_display_process_stats(pw);
            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
            final SubLObject _prev_bind_0_$116 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
                if (cb_shop_plan_process_num_plans(pw).numG((SubLObject)cb_shop.ZERO_INTEGER)) {
                    cb_shop_view_link(pw);
                    html_utilities.html_indent((SubLObject)cb_shop.TWO_INTEGER);
                }
                if (cb_shop_plan_process_verbosity(pw).numG((SubLObject)cb_shop.ZERO_INTEGER)) {
                    cb_shop_verbose_link(pw);
                    html_utilities.html_indent((SubLObject)cb_shop.TWO_INTEGER);
                }
                cb_shop_delete_link(pw);
                html_utilities.html_indent((SubLObject)cb_shop.TWO_INTEGER);
                cb_shop_replan_link(pw);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$116, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
        html_utilities.html_source_readability_terpri((SubLObject)cb_shop.UNPROVIDED);
        return (SubLObject)cb_shop.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-shop.lisp", position = 47116L)
    public static SubLObject cb_shop_display_pausing_process(final SubLObject pw) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
            final SubLObject _prev_bind_0_$117 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
                html_utilities.html_princ((SubLObject)cb_shop.$str347$Pausing);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$117, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            cb_shop_display_process_stats(pw);
            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
            final SubLObject _prev_bind_0_$118 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
                cb_shop_resume_link(pw);
                html_utilities.html_indent((SubLObject)cb_shop.TWO_INTEGER);
                cb_shop_abort_link(pw);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$118, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
        html_utilities.html_source_readability_terpri((SubLObject)cb_shop.UNPROVIDED);
        return (SubLObject)cb_shop.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-shop.lisp", position = 47435L)
    public static SubLObject cb_shop_display_paused_process(final SubLObject pw) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
            final SubLObject _prev_bind_0_$119 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
                cb_shop_display_process_halt_status(pw);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$119, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            cb_shop_display_process_stats(pw);
            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
            final SubLObject _prev_bind_0_$120 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
                if (cb_shop_plan_process_num_plans(pw).numG((SubLObject)cb_shop.ZERO_INTEGER)) {
                    cb_shop_view_link(pw);
                    html_utilities.html_indent((SubLObject)cb_shop.TWO_INTEGER);
                }
                if (cb_shop_plan_process_verbosity(pw).numG((SubLObject)cb_shop.ZERO_INTEGER)) {
                    cb_shop_verbose_link(pw);
                    html_utilities.html_indent((SubLObject)cb_shop.TWO_INTEGER);
                }
                cb_shop_resume_link(pw);
                html_utilities.html_indent((SubLObject)cb_shop.TWO_INTEGER);
                cb_shop_abort_link(pw);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$120, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
        html_utilities.html_source_readability_terpri((SubLObject)cb_shop.UNPROVIDED);
        return (SubLObject)cb_shop.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-shop.lisp", position = 47972L)
    public static SubLObject cb_shop_display_running_process(final SubLObject pw) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
            final SubLObject _prev_bind_0_$121 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
                html_utilities.html_princ((SubLObject)cb_shop.$str348$Running);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$121, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            cb_shop_display_process_stats(pw);
            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_shop.UNPROVIDED);
            final SubLObject _prev_bind_0_$122 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_shop.T, thread);
                cb_shop_pause_link(pw);
                html_utilities.html_indent((SubLObject)cb_shop.TWO_INTEGER);
                cb_shop_abort_link(pw);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$122, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
        html_utilities.html_source_readability_terpri((SubLObject)cb_shop.UNPROVIDED);
        return (SubLObject)cb_shop.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-shop.lisp", position = 48294L)
    public static SubLObject init_plan_displayers(final SubLObject thread) {
        final SubLThread thread_$123 = SubLProcess.currentSubLThread();
        final SubLObject plans = methods.funcall_instance_method_with_0_args(thread, (SubLObject)cb_shop.$sym349$CYCL_PLANS);
        final SubLObject planner = instances.get_slot(thread, (SubLObject)cb_shop.$sym350$PLANNER);
        SubLObject cdolist_list_var = plans;
        SubLObject plan = (SubLObject)cb_shop.NIL;
        plan = cdolist_list_var.first();
        while (cb_shop.NIL != cdolist_list_var) {
            cb_shop.$cb_plan_displayers$.setDynamicValue((SubLObject)ConsesLow.cons(methods.funcall_class_method_with_1_args(shop_main.get_shop_displayer_factory(planner), (SubLObject)cb_shop.$sym351$CREATE_PLAN_DISPLAYER, plan), cb_shop.$cb_plan_displayers$.getDynamicValue(thread_$123)), thread_$123);
            cdolist_list_var = cdolist_list_var.rest();
            plan = cdolist_list_var.first();
        }
        cb_shop.$cb_plan_displayers$.setDynamicValue(Sequences.reverse(cb_shop.$cb_plan_displayers$.getDynamicValue(thread_$123)), thread_$123);
        cb_shop.$cb_shop_planner_thread$.setDynamicValue(thread, thread_$123);
        return (SubLObject)cb_shop.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-shop.lisp", position = 49008L)
    public static SubLObject clear_plan_displayers() {
        cb_shop.$cb_plan_displayers$.setDynamicValue((SubLObject)cb_shop.NIL);
        return (SubLObject)cb_shop.NIL;
    }
    
    public static SubLObject declare_cb_shop_file() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cb_shop", "with_cb_shop_defaults", "WITH-CB-SHOP-DEFAULTS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_shop", "cb_shop_plan_checking_enabled", "CB-SHOP-PLAN-CHECKING-ENABLED", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_shop", "cb_shop_enable_plan_checking", "CB-SHOP-ENABLE-PLAN-CHECKING", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_shop", "cb_shop_disable_plan_checking", "CB-SHOP-DISABLE-PLAN-CHECKING", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_shop", "cb_shop_plan_checking_rules", "CB-SHOP-PLAN-CHECKING-RULES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_shop", "cb_shop_add_to_plan_checking_rules", "CB-SHOP-ADD-TO-PLAN-CHECKING-RULES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_shop", "cb_shop_remove_from_plan_checking_rules", "CB-SHOP-REMOVE-FROM-PLAN-CHECKING-RULES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_shop", "cb_shop_clear_all_plan_checking_rules", "CB-SHOP-CLEAR-ALL-PLAN-CHECKING-RULES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_shop", "cb_shop_use_in_plan_checking", "CB-SHOP-USE-IN-PLAN-CHECKING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_shop", "cb_link_use_in_plan_checking", "CB-LINK-USE-IN-PLAN-CHECKING", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_shop", "cb_shop_plan_checking", "CB-SHOP-PLAN-CHECKING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_shop", "cb_link_plan_checking", "CB-LINK-PLAN-CHECKING", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_shop", "cb_shop_gather_simple_action_rules_in_proof_checker", "CB-SHOP-GATHER-SIMPLE-ACTION-RULES-IN-PROOF-CHECKER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_shop", "subloop_reserved_initialize_cyc_development_planner_class", "SUBLOOP-RESERVED-INITIALIZE-CYC-DEVELOPMENT-PLANNER-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_shop", "subloop_reserved_initialize_cyc_development_planner_instance", "SUBLOOP-RESERVED-INITIALIZE-CYC-DEVELOPMENT-PLANNER-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_shop", "cyc_development_planner_p", "CYC-DEVELOPMENT-PLANNER-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_shop", "cyc_development_planner_initialize_method", "CYC-DEVELOPMENT-PLANNER-INITIALIZE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_shop", "cyc_development_planner_make_domain_with_rules_method", "CYC-DEVELOPMENT-PLANNER-MAKE-DOMAIN-WITH-RULES-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_shop", "cyc_development_planner_make_domain_from_proof_checker_method", "CYC-DEVELOPMENT-PLANNER-MAKE-DOMAIN-FROM-PROOF-CHECKER-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_shop", "plan_finder", "PLAN-FINDER", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_shop", "plan_examiner", "PLAN-EXAMINER", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_shop", "plan_verbose_examiner", "PLAN-VERBOSE-EXAMINER", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_shop", "plan_task_examiner", "PLAN-TASK-EXAMINER", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_shop", "cb_link_cb_shop_summary", "CB-LINK-CB-SHOP-SUMMARY", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_shop", "cb_link_cb_shop_controls", "CB-LINK-CB-SHOP-CONTROLS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_shop", "cb_link_planner", "CB-LINK-PLANNER", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_shop", "cb_link_plan_examiner", "CB-LINK-PLAN-EXAMINER", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_shop", "cb_link_plan_verbose_examiner", "CB-LINK-PLAN-VERBOSE-EXAMINER", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_shop", "clear_cb_planner_warning_message", "CLEAR-CB-PLANNER-WARNING-MESSAGE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_shop", "cb_shop_controls", "CB-SHOP-CONTROLS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_shop", "cb_shop_information", "CB-SHOP-INFORMATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_shop", "plan_finder_internal", "PLAN-FINDER-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_shop", "extract_settings", "EXTRACT-SETTINGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_shop", "extract_advanced_settings", "EXTRACT-ADVANCED-SETTINGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_shop", "cb_shop_extract_problem", "CB-SHOP-EXTRACT-PROBLEM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_shop", "cb_shop_new_plan_thread", "CB-SHOP-NEW-PLAN-THREAD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_shop", "initialize_planner_thread", "INITIALIZE-PLANNER-THREAD", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_shop", "invalid_mt_warning_string", "INVALID-MT-WARNING-STRING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_shop", "cb_shop_new_task", "CB-SHOP-NEW-TASK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_shop", "plan_finder_continue_task", "PLAN-FINDER-CONTINUE-TASK", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_shop", "plan_finder_change_advanced_parameters", "PLAN-FINDER-CHANGE-ADVANCED-PARAMETERS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_shop", "show_last_task", "SHOW-LAST-TASK", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_shop", "cb_planner_display_halt_reason", "CB-PLANNER-DISPLAY-HALT-REASON", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_shop", "summarize_last_task", "SUMMARIZE-LAST-TASK", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_shop", "cb_shop_ask_for_new_task", "CB-SHOP-ASK-FOR-NEW-TASK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_shop", "cb_shop_domain_examiner", "CB-SHOP-DOMAIN-EXAMINER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_shop", "plan_verbose_examiner_internal", "PLAN-VERBOSE-EXAMINER-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_shop", "plan_examiner_internal", "PLAN-EXAMINER-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_shop", "handle_plan_examiner_input", "HANDLE-PLAN-EXAMINER-INPUT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_shop", "cb_plan_examiner_controls", "CB-PLAN-EXAMINER-CONTROLS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_shop", "cb_advanced_planner_settings_table", "CB-ADVANCED-PLANNER-SETTINGS-TABLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_shop", "find_keyword_for_search_type", "FIND-KEYWORD-FOR-SEARCH-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_shop", "plan_task_examiner_internal", "PLAN-TASK-EXAMINER-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_shop", "display_html_plans", "DISPLAY-HTML-PLANS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_shop", "cb_shop_abort_link_handler", "CB-SHOP-ABORT-LINK-HANDLER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_shop", "cb_shop_abort_link", "CB-SHOP-ABORT-LINK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_shop", "cb_shop_pause_link_handler", "CB-SHOP-PAUSE-LINK-HANDLER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_shop", "cb_shop_pause_link", "CB-SHOP-PAUSE-LINK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_shop", "cb_shop_resume_link_handler", "CB-SHOP-RESUME-LINK-HANDLER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_shop", "cb_shop_resume_link", "CB-SHOP-RESUME-LINK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_shop", "cb_shop_view_link_handler", "CB-SHOP-VIEW-LINK-HANDLER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_shop", "cb_shop_view_link", "CB-SHOP-VIEW-LINK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_shop", "cb_shop_replan_link_handler", "CB-SHOP-REPLAN-LINK-HANDLER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_shop", "cb_shop_replan_link", "CB-SHOP-REPLAN-LINK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_shop", "cb_shop_verbose_link_handler", "CB-SHOP-VERBOSE-LINK-HANDLER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_shop", "cb_shop_verbose_link", "CB-SHOP-VERBOSE-LINK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_shop", "cb_shop_delete_link_handler", "CB-SHOP-DELETE-LINK-HANDLER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_shop", "cb_shop_delete_link", "CB-SHOP-DELETE-LINK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_shop", "cb_shop_domain_examiner_link_handler", "CB-SHOP-DOMAIN-EXAMINER-LINK-HANDLER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_shop", "cb_shop_domain_examiner_link", "CB-SHOP-DOMAIN-EXAMINER-LINK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_shop", "cb_shop_plan_process_get_thread", "CB-SHOP-PLAN-PROCESS-GET-THREAD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_shop", "cb_shop_plan_process_set_planner", "CB-SHOP-PLAN-PROCESS-SET-PLANNER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_shop", "cb_shop_plan_process_get_task", "CB-SHOP-PLAN-PROCESS-GET-TASK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_shop", "cb_shop_plan_process_get_domain", "CB-SHOP-PLAN-PROCESS-GET-DOMAIN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_shop", "cb_shop_plan_process_num_open_nodes", "CB-SHOP-PLAN-PROCESS-NUM-OPEN-NODES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_shop", "cb_shop_plan_process_num_inferences", "CB-SHOP-PLAN-PROCESS-NUM-INFERENCES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_shop", "cb_shop_plan_process_num_expansions", "CB-SHOP-PLAN-PROCESS-NUM-EXPANSIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_shop", "cb_shop_plan_process_num_plans", "CB-SHOP-PLAN-PROCESS-NUM-PLANS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_shop", "cb_shop_plan_process_verbosity", "CB-SHOP-PLAN-PROCESS-VERBOSITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_shop", "cb_shop_plan_halt_status", "CB-SHOP-PLAN-HALT-STATUS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_shop", "cb_shop_plan_process_view", "CB-SHOP-PLAN-PROCESS-VIEW", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_shop", "cb_shop_replan", "CB-SHOP-REPLAN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_shop", "cb_shop_information_refreshP", "CB-SHOP-INFORMATION-REFRESH?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_shop", "cb_shop_display_processes", "CB-SHOP-DISPLAY-PROCESSES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_shop", "cb_shop_pw_func", "CB-SHOP-PW-FUNC", 8, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_shop", "cb_shop_pw_proof_checking_func", "CB-SHOP-PW-PROOF-CHECKING-FUNC", 9, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_shop", "cb_shop_new_plan_process", "CB-SHOP-NEW-PLAN-PROCESS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_shop", "cb_shop_display_process_stats_header", "CB-SHOP-DISPLAY-PROCESS-STATS-HEADER", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_shop", "cb_shop_display_process_stats", "CB-SHOP-DISPLAY-PROCESS-STATS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_shop", "cb_shop_display_process_halt_status", "CB-SHOP-DISPLAY-PROCESS-HALT-STATUS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_shop", "cb_shop_display_process", "CB-SHOP-DISPLAY-PROCESS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_shop", "cb_shop_display_completed_process", "CB-SHOP-DISPLAY-COMPLETED-PROCESS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_shop", "cb_shop_display_pausing_process", "CB-SHOP-DISPLAY-PAUSING-PROCESS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_shop", "cb_shop_display_paused_process", "CB-SHOP-DISPLAY-PAUSED-PROCESS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_shop", "cb_shop_display_running_process", "CB-SHOP-DISPLAY-RUNNING-PROCESS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_shop", "init_plan_displayers", "INIT-PLAN-DISPLAYERS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_shop", "clear_plan_displayers", "CLEAR-PLAN-DISPLAYERS", 0, 0, false);
        return (SubLObject)cb_shop.NIL;
    }
    
    public static SubLObject init_cb_shop_file() {
        cb_shop.$cyc_development_environment$ = SubLFiles.defparameter("*CYC-DEVELOPMENT-ENVIRONMENT*", (SubLObject)cb_shop.T);
        cb_shop.$cb_planner_default_domain_mt$ = SubLFiles.defparameter("*CB-PLANNER-DEFAULT-DOMAIN-MT*", (SubLObject)cb_shop.NIL);
        cb_shop.$cb_shop_planner$ = SubLFiles.defparameter("*CB-SHOP-PLANNER*", (SubLObject)cb_shop.NIL);
        cb_shop.$cb_shop_task_string$ = SubLFiles.defparameter("*CB-SHOP-TASK-STRING*", (SubLObject)cb_shop.NIL);
        cb_shop.$cb_planner_warning_message$ = SubLFiles.defparameter("*CB-PLANNER-WARNING-MESSAGE*", (SubLObject)cb_shop.NIL);
        cb_shop.$cb_shop_planner_thread$ = SubLFiles.defparameter("*CB-SHOP-PLANNER-THREAD*", (SubLObject)cb_shop.NIL);
        cb_shop.$cb_planner_task$ = SubLFiles.defparameter("*CB-PLANNER-TASK*", (SubLObject)cb_shop.NIL);
        cb_shop.$cb_planner_domain_mt$ = SubLFiles.defparameter("*CB-PLANNER-DOMAIN-MT*", cb_shop.$cb_planner_default_domain_mt$.getDynamicValue());
        cb_shop.$cb_last_planner_format$ = SubLFiles.defparameter("*CB-LAST-PLANNER-FORMAT*", (SubLObject)cb_shop.$kw5$CYCL);
        cb_shop.$cb_last_planner_structure$ = SubLFiles.defparameter("*CB-LAST-PLANNER-STRUCTURE*", (SubLObject)cb_shop.$kw7$HIERARCHICAL);
        cb_shop.$cb_last_planner_number$ = SubLFiles.defparameter("*CB-LAST-PLANNER-NUMBER*", (SubLObject)cb_shop.NIL);
        cb_shop.$cb_shop_time_cutoff$ = SubLFiles.defparameter("*CB-SHOP-TIME-CUTOFF*", (SubLObject)cb_shop.$int10$500);
        cb_shop.$cb_shop_depth_limit$ = SubLFiles.defparameter("*CB-SHOP-DEPTH-LIMIT*", (SubLObject)cb_shop.$int12$75);
        cb_shop.$cb_shop_num_backchains$ = SubLFiles.defparameter("*CB-SHOP-NUM-BACKCHAINS*", (SubLObject)cb_shop.ZERO_INTEGER);
        cb_shop.$cb_last_planner_do_fi_asks$ = SubLFiles.defparameter("*CB-LAST-PLANNER-DO-FI-ASKS*", (SubLObject)cb_shop.NIL);
        cb_shop.$cb_shop_cycle_checking_enabledP$ = SubLFiles.defparameter("*CB-SHOP-CYCLE-CHECKING-ENABLED?*", (SubLObject)cb_shop.T);
        cb_shop.$cb_last_planner_show_advanced_settings$ = SubLFiles.defparameter("*CB-LAST-PLANNER-SHOW-ADVANCED-SETTINGS*", (SubLObject)cb_shop.NIL);
        cb_shop.$cb_plan_search_type$ = SubLFiles.defparameter("*CB-PLAN-SEARCH-TYPE*", (SubLObject)cb_shop.$kw18$ALL);
        cb_shop.$cb_shop_verbosity$ = SubLFiles.defparameter("*CB-SHOP-VERBOSITY*", (SubLObject)cb_shop.NINE_INTEGER);
        cb_shop.$cb_plan_displayers$ = SubLFiles.defparameter("*CB-PLAN-DISPLAYERS*", (SubLObject)cb_shop.NIL);
        cb_shop.$cb_shop_plan_checking_enabled$ = SubLFiles.defparameter("*CB-SHOP-PLAN-CHECKING-ENABLED*", (SubLObject)cb_shop.NIL);
        cb_shop.$cb_shop_plan_checking_rules$ = SubLFiles.defparameter("*CB-SHOP-PLAN-CHECKING-RULES*", (SubLObject)cb_shop.NIL);
        cb_shop.$cb_shop_refresh_rate$ = SubLFiles.deflexical("*CB-SHOP-REFRESH-RATE*", (SubLObject)cb_shop.TWO_INTEGER);
        cb_shop.$cb_shop_process_label$ = SubLFiles.deflexical("*CB-SHOP-PROCESS-LABEL*", (SubLObject)cb_shop.$str293$CB_SHOP_PLANNING);
        cb_shop.$cb_shop_processes$ = SubLFiles.defparameter("*CB-SHOP-PROCESSES*", dictionary.new_dictionary(Symbols.symbol_function((SubLObject)cb_shop.EQL), (SubLObject)cb_shop.TEN_INTEGER));
        return (SubLObject)cb_shop.NIL;
    }
    
    public static SubLObject setup_cb_shop_file() {
        utilities_macros.register_html_state_variable((SubLObject)cb_shop.$sym0$_CB_SHOP_TASK_STRING_);
        utilities_macros.register_html_state_variable((SubLObject)cb_shop.$sym1$_CB_PLANNER_WARNING_MESSAGE_);
        utilities_macros.register_html_state_variable((SubLObject)cb_shop.$sym2$_CB_SHOP_PLANNER_THREAD_);
        utilities_macros.register_html_state_variable((SubLObject)cb_shop.$sym3$_CB_PLANNER_TASK_);
        utilities_macros.register_html_state_variable((SubLObject)cb_shop.$sym4$_CB_PLANNER_DOMAIN_MT_);
        utilities_macros.register_html_state_variable((SubLObject)cb_shop.$sym6$_CB_LAST_PLANNER_FORMAT_);
        utilities_macros.register_html_state_variable((SubLObject)cb_shop.$sym8$_CB_LAST_PLANNER_STRUCTURE_);
        utilities_macros.register_html_state_variable((SubLObject)cb_shop.$sym9$_CB_LAST_PLANNER_NUMBER_);
        utilities_macros.register_html_state_variable((SubLObject)cb_shop.$sym11$_CB_SHOP_TIME_CUTOFF_);
        utilities_macros.register_html_state_variable((SubLObject)cb_shop.$sym13$_CB_SHOP_DEPTH_LIMIT_);
        utilities_macros.register_html_state_variable((SubLObject)cb_shop.$sym14$_CB_SHOP_NUM_BACKCHAINS_);
        utilities_macros.register_html_state_variable((SubLObject)cb_shop.$sym15$_CB_LAST_PLANNER_DO_FI_ASKS_);
        utilities_macros.register_html_state_variable((SubLObject)cb_shop.$sym16$_CB_SHOP_CYCLE_CHECKING_ENABLED__);
        utilities_macros.register_html_state_variable((SubLObject)cb_shop.$sym17$_CB_LAST_PLANNER_SHOW_ADVANCED_SETTINGS_);
        utilities_macros.register_html_state_variable((SubLObject)cb_shop.$sym19$_CB_PLAN_SEARCH_TYPE_);
        utilities_macros.register_html_state_variable((SubLObject)cb_shop.$sym20$_CB_SHOP_VERBOSITY_);
        utilities_macros.register_html_state_variable((SubLObject)cb_shop.$sym23$_CB_SHOP_PLAN_CHECKING_ENABLED_);
        utilities_macros.register_html_state_variable((SubLObject)cb_shop.$sym24$_CB_SHOP_PLAN_CHECKING_RULES_);
        html_macros.note_cgi_handler_function((SubLObject)cb_shop.$sym28$CB_SHOP_USE_IN_PLAN_CHECKING, (SubLObject)cb_shop.$kw29$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_shop.$kw34$USE_IN_PLAN_CHECKING, (SubLObject)cb_shop.$sym35$CB_LINK_USE_IN_PLAN_CHECKING, (SubLObject)cb_shop.TWO_INTEGER);
        Hashtables.sethash((SubLObject)cb_shop.$kw36$CB_SHOP_PLAN_CHECKING, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_shop.$str37$cb_shop_plan_checking_html, (SubLObject)cb_shop.NIL));
        html_macros.note_cgi_handler_function((SubLObject)cb_shop.$sym69$CB_SHOP_PLAN_CHECKING, (SubLObject)cb_shop.$kw29$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_shop.$kw71$PLAN_CHECKING, (SubLObject)cb_shop.$sym72$CB_LINK_PLAN_CHECKING, (SubLObject)cb_shop.ONE_INTEGER);
        classes.subloop_new_class((SubLObject)cb_shop.$sym74$CYC_DEVELOPMENT_PLANNER, (SubLObject)cb_shop.$sym75$SHOP, (SubLObject)cb_shop.NIL, (SubLObject)cb_shop.NIL, (SubLObject)cb_shop.$list76);
        classes.class_set_implements_slot_listeners((SubLObject)cb_shop.$sym74$CYC_DEVELOPMENT_PLANNER, (SubLObject)cb_shop.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)cb_shop.$sym74$CYC_DEVELOPMENT_PLANNER, (SubLObject)cb_shop.$sym79$SUBLOOP_RESERVED_INITIALIZE_CYC_DEVELOPMENT_PLANNER_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)cb_shop.$sym74$CYC_DEVELOPMENT_PLANNER, (SubLObject)cb_shop.$sym86$SUBLOOP_RESERVED_INITIALIZE_CYC_DEVELOPMENT_PLANNER_INSTANCE);
        subloop_reserved_initialize_cyc_development_planner_class((SubLObject)cb_shop.$sym74$CYC_DEVELOPMENT_PLANNER);
        methods.methods_incorporate_instance_method((SubLObject)cb_shop.$sym87$INITIALIZE, (SubLObject)cb_shop.$sym74$CYC_DEVELOPMENT_PLANNER, (SubLObject)cb_shop.$list88, (SubLObject)cb_shop.NIL, (SubLObject)cb_shop.$list89);
        methods.subloop_register_instance_method((SubLObject)cb_shop.$sym74$CYC_DEVELOPMENT_PLANNER, (SubLObject)cb_shop.$sym87$INITIALIZE, (SubLObject)cb_shop.$sym92$CYC_DEVELOPMENT_PLANNER_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)cb_shop.$sym93$MAKE_DOMAIN_WITH_RULES, (SubLObject)cb_shop.$sym74$CYC_DEVELOPMENT_PLANNER, (SubLObject)cb_shop.$list94, (SubLObject)cb_shop.$list95, (SubLObject)cb_shop.$list96);
        methods.subloop_register_instance_method((SubLObject)cb_shop.$sym74$CYC_DEVELOPMENT_PLANNER, (SubLObject)cb_shop.$sym93$MAKE_DOMAIN_WITH_RULES, (SubLObject)cb_shop.$sym99$CYC_DEVELOPMENT_PLANNER_MAKE_DOMAIN_WITH_RULES_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)cb_shop.$sym100$MAKE_DOMAIN_FROM_PROOF_CHECKER, (SubLObject)cb_shop.$sym74$CYC_DEVELOPMENT_PLANNER, (SubLObject)cb_shop.$list94, (SubLObject)cb_shop.$list101, (SubLObject)cb_shop.$list102);
        methods.subloop_register_instance_method((SubLObject)cb_shop.$sym74$CYC_DEVELOPMENT_PLANNER, (SubLObject)cb_shop.$sym100$MAKE_DOMAIN_FROM_PROOF_CHECKER, (SubLObject)cb_shop.$sym103$CYC_DEVELOPMENT_PLANNER_MAKE_DOMAIN_FROM_PROOF_CHECKER_METHOD);
        html_macros.note_cgi_handler_function((SubLObject)cb_shop.$sym109$PLAN_FINDER, (SubLObject)cb_shop.$kw29$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cb_shop.$sym111$PLAN_EXAMINER, (SubLObject)cb_shop.$kw29$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cb_shop.$sym113$PLAN_VERBOSE_EXAMINER, (SubLObject)cb_shop.$kw29$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cb_shop.$sym115$PLAN_TASK_EXAMINER, (SubLObject)cb_shop.$kw29$HTML_HANDLER);
        cb_utilities.register_cb_frame((SubLObject)cb_shop.$kw107$CB_SHOP_CONTROLS, (SubLObject)cb_shop.$str116$controls, (SubLObject)cb_shop.$str117$cb_shop_controls, (SubLObject)cb_shop.NIL, (SubLObject)cb_shop.NIL, (SubLObject)cb_shop.T);
        cb_utilities.register_cb_frame((SubLObject)cb_shop.$kw108$CB_SHOP_SUMMARY, (SubLObject)cb_shop.$str118$info, (SubLObject)cb_shop.$str119$cb_shop_information, (SubLObject)cb_shop.NIL, (SubLObject)cb_shop.NIL, (SubLObject)cb_shop.T);
        cb_utilities.setup_cb_link_method((SubLObject)cb_shop.$kw108$CB_SHOP_SUMMARY, (SubLObject)cb_shop.$sym122$CB_LINK_CB_SHOP_SUMMARY, (SubLObject)cb_shop.ONE_INTEGER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_shop.$kw107$CB_SHOP_CONTROLS, (SubLObject)cb_shop.$sym124$CB_LINK_CB_SHOP_CONTROLS, (SubLObject)cb_shop.ONE_INTEGER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_shop.$kw57$PLANNER, (SubLObject)cb_shop.$sym127$CB_LINK_PLANNER, (SubLObject)cb_shop.ONE_INTEGER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_shop.$kw130$PLAN_EXAMINER, (SubLObject)cb_shop.$sym131$CB_LINK_PLAN_EXAMINER, (SubLObject)cb_shop.ONE_INTEGER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_shop.$kw134$PLAN_VERBOSE_EXAMINER, (SubLObject)cb_shop.$sym135$CB_LINK_PLAN_VERBOSE_EXAMINER, (SubLObject)cb_shop.ONE_INTEGER);
        cb_utilities.declare_cb_tool((SubLObject)cb_shop.$kw57$PLANNER, (SubLObject)cb_shop.$str136$Planner, (SubLObject)cb_shop.$str136$Planner, (SubLObject)cb_shop.$str137$Simple_Hierarchical_Ordered_Plann);
        html_macros.note_cgi_handler_function((SubLObject)cb_shop.$sym138$CB_SHOP_CONTROLS, (SubLObject)cb_shop.$kw29$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cb_shop.$sym142$CB_SHOP_INFORMATION, (SubLObject)cb_shop.$kw29$HTML_HANDLER);
        Hashtables.sethash((SubLObject)cb_shop.$kw187$PLAN_FINDER, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_shop.$str188$plan_finder_html, (SubLObject)cb_shop.NIL));
        Hashtables.sethash((SubLObject)cb_shop.$kw130$PLAN_EXAMINER, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_shop.$str231$plan_examiner_html, (SubLObject)cb_shop.NIL));
        html_macros.note_cgi_handler_function((SubLObject)cb_shop.$sym242$HANDLE_PLAN_EXAMINER_INPUT, (SubLObject)cb_shop.$kw29$HTML_HANDLER);
        html_id_links.register_html_id_index(cb_shop.$cb_shop_processes$.getDynamicValue(), (SubLObject)cb_shop.$sym294$DICTIONARY_LOOKUP, (SubLObject)cb_shop.$sym295$PROCESS_WRAPPER_GET_ID);
        html_macros.note_cgi_handler_function((SubLObject)cb_shop.$sym297$CB_SHOP_ABORT_LINK_HANDLER, (SubLObject)cb_shop.$kw29$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cb_shop.$sym301$CB_SHOP_PAUSE_LINK_HANDLER, (SubLObject)cb_shop.$kw29$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cb_shop.$sym304$CB_SHOP_RESUME_LINK_HANDLER, (SubLObject)cb_shop.$kw29$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cb_shop.$sym307$CB_SHOP_VIEW_LINK_HANDLER, (SubLObject)cb_shop.$kw29$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cb_shop.$sym310$CB_SHOP_REPLAN_LINK_HANDLER, (SubLObject)cb_shop.$kw29$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cb_shop.$sym313$CB_SHOP_VERBOSE_LINK_HANDLER, (SubLObject)cb_shop.$kw29$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cb_shop.$sym316$CB_SHOP_DELETE_LINK_HANDLER, (SubLObject)cb_shop.$kw29$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cb_shop.$sym319$CB_SHOP_DOMAIN_EXAMINER_LINK_HANDLER, (SubLObject)cb_shop.$kw29$HTML_HANDLER);
        return (SubLObject)cb_shop.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_cb_shop_file();
    }
    
    @Override
	public void initializeVariables() {
        init_cb_shop_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_cb_shop_file();
    }
    
    static {
        me = (SubLFile)new cb_shop();
        cb_shop.$cyc_development_environment$ = null;
        cb_shop.$cb_planner_default_domain_mt$ = null;
        cb_shop.$cb_shop_planner$ = null;
        cb_shop.$cb_shop_task_string$ = null;
        cb_shop.$cb_planner_warning_message$ = null;
        cb_shop.$cb_shop_planner_thread$ = null;
        cb_shop.$cb_planner_task$ = null;
        cb_shop.$cb_planner_domain_mt$ = null;
        cb_shop.$cb_last_planner_format$ = null;
        cb_shop.$cb_last_planner_structure$ = null;
        cb_shop.$cb_last_planner_number$ = null;
        cb_shop.$cb_shop_time_cutoff$ = null;
        cb_shop.$cb_shop_depth_limit$ = null;
        cb_shop.$cb_shop_num_backchains$ = null;
        cb_shop.$cb_last_planner_do_fi_asks$ = null;
        cb_shop.$cb_shop_cycle_checking_enabledP$ = null;
        cb_shop.$cb_last_planner_show_advanced_settings$ = null;
        cb_shop.$cb_plan_search_type$ = null;
        cb_shop.$cb_shop_verbosity$ = null;
        cb_shop.$cb_plan_displayers$ = null;
        cb_shop.$cb_shop_plan_checking_enabled$ = null;
        cb_shop.$cb_shop_plan_checking_rules$ = null;
        cb_shop.$cb_shop_refresh_rate$ = null;
        cb_shop.$cb_shop_process_label$ = null;
        cb_shop.$cb_shop_processes$ = null;
        $sym0$_CB_SHOP_TASK_STRING_ = SubLObjectFactory.makeSymbol("*CB-SHOP-TASK-STRING*");
        $sym1$_CB_PLANNER_WARNING_MESSAGE_ = SubLObjectFactory.makeSymbol("*CB-PLANNER-WARNING-MESSAGE*");
        $sym2$_CB_SHOP_PLANNER_THREAD_ = SubLObjectFactory.makeSymbol("*CB-SHOP-PLANNER-THREAD*");
        $sym3$_CB_PLANNER_TASK_ = SubLObjectFactory.makeSymbol("*CB-PLANNER-TASK*");
        $sym4$_CB_PLANNER_DOMAIN_MT_ = SubLObjectFactory.makeSymbol("*CB-PLANNER-DOMAIN-MT*");
        $kw5$CYCL = SubLObjectFactory.makeKeyword("CYCL");
        $sym6$_CB_LAST_PLANNER_FORMAT_ = SubLObjectFactory.makeSymbol("*CB-LAST-PLANNER-FORMAT*");
        $kw7$HIERARCHICAL = SubLObjectFactory.makeKeyword("HIERARCHICAL");
        $sym8$_CB_LAST_PLANNER_STRUCTURE_ = SubLObjectFactory.makeSymbol("*CB-LAST-PLANNER-STRUCTURE*");
        $sym9$_CB_LAST_PLANNER_NUMBER_ = SubLObjectFactory.makeSymbol("*CB-LAST-PLANNER-NUMBER*");
        $int10$500 = SubLObjectFactory.makeInteger(500);
        $sym11$_CB_SHOP_TIME_CUTOFF_ = SubLObjectFactory.makeSymbol("*CB-SHOP-TIME-CUTOFF*");
        $int12$75 = SubLObjectFactory.makeInteger(75);
        $sym13$_CB_SHOP_DEPTH_LIMIT_ = SubLObjectFactory.makeSymbol("*CB-SHOP-DEPTH-LIMIT*");
        $sym14$_CB_SHOP_NUM_BACKCHAINS_ = SubLObjectFactory.makeSymbol("*CB-SHOP-NUM-BACKCHAINS*");
        $sym15$_CB_LAST_PLANNER_DO_FI_ASKS_ = SubLObjectFactory.makeSymbol("*CB-LAST-PLANNER-DO-FI-ASKS*");
        $sym16$_CB_SHOP_CYCLE_CHECKING_ENABLED__ = SubLObjectFactory.makeSymbol("*CB-SHOP-CYCLE-CHECKING-ENABLED?*");
        $sym17$_CB_LAST_PLANNER_SHOW_ADVANCED_SETTINGS_ = SubLObjectFactory.makeSymbol("*CB-LAST-PLANNER-SHOW-ADVANCED-SETTINGS*");
        $kw18$ALL = SubLObjectFactory.makeKeyword("ALL");
        $sym19$_CB_PLAN_SEARCH_TYPE_ = SubLObjectFactory.makeSymbol("*CB-PLAN-SEARCH-TYPE*");
        $sym20$_CB_SHOP_VERBOSITY_ = SubLObjectFactory.makeSymbol("*CB-SHOP-VERBOSITY*");
        $sym21$CLET = SubLObjectFactory.makeSymbol("CLET");
        $list22 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SHOP-METHOD-CYCLE-CHECKING-ENABLED?*"), (SubLObject)SubLObjectFactory.makeSymbol("*CB-SHOP-CYCLE-CHECKING-ENABLED?*")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SHOP-DEFAULT-DEPTH-LIMIT*"), (SubLObject)SubLObjectFactory.makeSymbol("*CB-SHOP-DEPTH-LIMIT*")));
        $sym23$_CB_SHOP_PLAN_CHECKING_ENABLED_ = SubLObjectFactory.makeSymbol("*CB-SHOP-PLAN-CHECKING-ENABLED*");
        $sym24$_CB_SHOP_PLAN_CHECKING_RULES_ = SubLObjectFactory.makeSymbol("*CB-SHOP-PLAN-CHECKING-RULES*");
        $sym25$VALID_ASSERTION = SubLObjectFactory.makeSymbol("VALID-ASSERTION");
        $str26$Not_a_planning_assertion_ = SubLObjectFactory.makeString("Not a planning assertion.");
        $str27$Rule_has_been_added_to_SHOP_plan_ = SubLObjectFactory.makeString("Rule has been added to SHOP plan checking rule set.");
        $sym28$CB_SHOP_USE_IN_PLAN_CHECKING = SubLObjectFactory.makeSymbol("CB-SHOP-USE-IN-PLAN-CHECKING");
        $kw29$HTML_HANDLER = SubLObjectFactory.makeKeyword("HTML-HANDLER");
        $sym30$ASSERTION_P = SubLObjectFactory.makeSymbol("ASSERTION-P");
        $str31$_Use_in_Plan_Checking_ = SubLObjectFactory.makeString("[Use in Plan Checking]");
        $kw32$SELF = SubLObjectFactory.makeKeyword("SELF");
        $str33$cb_shop_use_in_plan_checking__a = SubLObjectFactory.makeString("cb-shop-use-in-plan-checking&~a");
        $kw34$USE_IN_PLAN_CHECKING = SubLObjectFactory.makeKeyword("USE-IN-PLAN-CHECKING");
        $sym35$CB_LINK_USE_IN_PLAN_CHECKING = SubLObjectFactory.makeSymbol("CB-LINK-USE-IN-PLAN-CHECKING");
        $kw36$CB_SHOP_PLAN_CHECKING = SubLObjectFactory.makeKeyword("CB-SHOP-PLAN-CHECKING");
        $str37$cb_shop_plan_checking_html = SubLObjectFactory.makeString("cb-shop-plan-checking.html");
        $kw38$DISABLE = SubLObjectFactory.makeKeyword("DISABLE");
        $kw39$ENABLE = SubLObjectFactory.makeKeyword("ENABLE");
        $kw40$DISCARD = SubLObjectFactory.makeKeyword("DISCARD");
        $kw41$UPDATE = SubLObjectFactory.makeKeyword("UPDATE");
        $kw42$SELECTED_RULES = SubLObjectFactory.makeKeyword("SELECTED-RULES");
        $str43$Plan_Checking_Control = SubLObjectFactory.makeString("Plan Checking Control");
        $str44$__DOCTYPE_html_PUBLIC_____W3C__DT = SubLObjectFactory.makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $str45$_meta_http_equiv__X_UA_Compatible = SubLObjectFactory.makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");
        $kw46$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $kw47$CB_CYC = SubLObjectFactory.makeKeyword("CB-CYC");
        $kw48$SAM_AUTOCOMPLETE_CSS = SubLObjectFactory.makeKeyword("SAM-AUTOCOMPLETE-CSS");
        $kw49$SHA1 = SubLObjectFactory.makeKeyword("SHA1");
        $str50$yui_skin_sam = SubLObjectFactory.makeString("yui-skin-sam");
        $str51$reloadFrameButton = SubLObjectFactory.makeString("reloadFrameButton");
        $str52$button = SubLObjectFactory.makeString("button");
        $str53$reload = SubLObjectFactory.makeString("reload");
        $str54$Refresh_Frames = SubLObjectFactory.makeString("Refresh Frames");
        $str55$post = SubLObjectFactory.makeString("post");
        $str56$cb_shop_plan_checking = SubLObjectFactory.makeString("cb-shop-plan-checking");
        $kw57$PLANNER = SubLObjectFactory.makeKeyword("PLANNER");
        $str58$_Back_to_Planner_ = SubLObjectFactory.makeString("[Back to Planner]");
        $str59$Plan_Checking_is_ = SubLObjectFactory.makeString("Plan Checking is ");
        $str60$Enabled_ = SubLObjectFactory.makeString("Enabled.");
        $str61$Disabled_ = SubLObjectFactory.makeString("Disabled.");
        $str62$Disable = SubLObjectFactory.makeString("Disable");
        $str63$Enable = SubLObjectFactory.makeString("Enable");
        $str64$Update = SubLObjectFactory.makeString("Update");
        $str65$Discard_All = SubLObjectFactory.makeString("Discard All");
        $str66$Choose_Planning_Rules_for_inclusi = SubLObjectFactory.makeString("Choose Planning Rules for inclusion:");
        $str67$No_Rules_in_plan_checking_set_ = SubLObjectFactory.makeString("No Rules in plan checking set.");
        $kw68$TOP = SubLObjectFactory.makeKeyword("TOP");
        $sym69$CB_SHOP_PLAN_CHECKING = SubLObjectFactory.makeSymbol("CB-SHOP-PLAN-CHECKING");
        $str70$_Plan_Checking_ = SubLObjectFactory.makeString("[Plan Checking]");
        $kw71$PLAN_CHECKING = SubLObjectFactory.makeKeyword("PLAN-CHECKING");
        $sym72$CB_LINK_PLAN_CHECKING = SubLObjectFactory.makeSymbol("CB-LINK-PLAN-CHECKING");
        $kw73$POS = SubLObjectFactory.makeKeyword("POS");
        $sym74$CYC_DEVELOPMENT_PLANNER = SubLObjectFactory.makeSymbol("CYC-DEVELOPMENT-PLANNER");
        $sym75$SHOP = SubLObjectFactory.makeSymbol("SHOP");
        $list76 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("MAKE-DOMAIN-FROM-PROOF-CHECKER"), (SubLObject)cb_shop.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")));
        $sym77$OBJECT = SubLObjectFactory.makeSymbol("OBJECT");
        $sym78$INSTANCE_COUNT = SubLObjectFactory.makeSymbol("INSTANCE-COUNT");
        $sym79$SUBLOOP_RESERVED_INITIALIZE_CYC_DEVELOPMENT_PLANNER_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYC-DEVELOPMENT-PLANNER-CLASS");
        $sym80$ISOLATED_P = SubLObjectFactory.makeSymbol("ISOLATED-P");
        $sym81$INSTANCE_NUMBER = SubLObjectFactory.makeSymbol("INSTANCE-NUMBER");
        $sym82$DISPLAYER_FACTORY = SubLObjectFactory.makeSymbol("DISPLAYER-FACTORY");
        $sym83$DOMAIN_TABLE = SubLObjectFactory.makeSymbol("DOMAIN-TABLE");
        $sym84$PROBLEM_TABLE = SubLObjectFactory.makeSymbol("PROBLEM-TABLE");
        $sym85$THREADS = SubLObjectFactory.makeSymbol("THREADS");
        $sym86$SUBLOOP_RESERVED_INITIALIZE_CYC_DEVELOPMENT_PLANNER_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYC-DEVELOPMENT-PLANNER-INSTANCE");
        $sym87$INITIALIZE = SubLObjectFactory.makeSymbol("INITIALIZE");
        $list88 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROTECTED"));
        $list89 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)SubLObjectFactory.makeSymbol("SUPER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("DISPLAYER-FACTORY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW"), (SubLObject)SubLObjectFactory.makeSymbol("CYC-DEVELOPMENT-PLAN-DISPLAYER-FACTORY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("CYC-DEVELOPMENT-PLAN-DISPLAYER-FACTORY")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym90$OUTER_CATCH_FOR_CYC_DEVELOPMENT_PLANNER_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-CYC-DEVELOPMENT-PLANNER-METHOD");
        $sym91$CYC_DEVELOPMENT_PLAN_DISPLAYER_FACTORY = SubLObjectFactory.makeSymbol("CYC-DEVELOPMENT-PLAN-DISPLAYER-FACTORY");
        $sym92$CYC_DEVELOPMENT_PLANNER_INITIALIZE_METHOD = SubLObjectFactory.makeSymbol("CYC-DEVELOPMENT-PLANNER-INITIALIZE-METHOD");
        $sym93$MAKE_DOMAIN_WITH_RULES = SubLObjectFactory.makeSymbol("MAKE-DOMAIN-WITH-RULES");
        $list94 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"));
        $list95 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RULES"), (SubLObject)SubLObjectFactory.makeSymbol("TASK-MT"));
        $list96 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DOMAIN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-CYC-DOMAIN")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-CYC-DOMAIN"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INIT-DOMAIN-WITH-RULES"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-CYC-DOMAIN")), (SubLObject)SubLObjectFactory.makeSymbol("DOMAIN"), (SubLObject)SubLObjectFactory.makeSymbol("RULES"), (SubLObject)SubLObjectFactory.makeSymbol("TASK-MT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GETHASH"), (SubLObject)SubLObjectFactory.makeSymbol("TASK-MT"), (SubLObject)SubLObjectFactory.makeSymbol("DOMAIN-TABLE")), (SubLObject)SubLObjectFactory.makeSymbol("DOMAIN")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))));
        $sym97$OUTER_CATCH_FOR_CYC_DEVELOPMENT_PLANNER_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-CYC-DEVELOPMENT-PLANNER-METHOD");
        $sym98$SHOP_CYC_DOMAIN = SubLObjectFactory.makeSymbol("SHOP-CYC-DOMAIN");
        $sym99$CYC_DEVELOPMENT_PLANNER_MAKE_DOMAIN_WITH_RULES_METHOD = SubLObjectFactory.makeSymbol("CYC-DEVELOPMENT-PLANNER-MAKE-DOMAIN-WITH-RULES-METHOD");
        $sym100$MAKE_DOMAIN_FROM_PROOF_CHECKER = SubLObjectFactory.makeSymbol("MAKE-DOMAIN-FROM-PROOF-CHECKER");
        $list101 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TASK-MT"));
        $list102 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param TASK-MT microtheory-p"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTIONS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CB-SHOP-PLAN-CHECKING-RULES")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAKE-DOMAIN-WITH-RULES"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTIONS"), (SubLObject)SubLObjectFactory.makeSymbol("TASK-MT")))));
        $sym103$CYC_DEVELOPMENT_PLANNER_MAKE_DOMAIN_FROM_PROOF_CHECKER_METHOD = SubLObjectFactory.makeSymbol("CYC-DEVELOPMENT-PLANNER-MAKE-DOMAIN-FROM-PROOF-CHECKER-METHOD");
        $str104$Plan_Finder = SubLObjectFactory.makeString("Plan Finder");
        $str105$Cannot_have_a_FRAMESET_tag_inside = SubLObjectFactory.makeString("Cannot have a FRAMESET tag inside a BODY tag.");
        $str106$400__ = SubLObjectFactory.makeString("400,*");
        $kw107$CB_SHOP_CONTROLS = SubLObjectFactory.makeKeyword("CB-SHOP-CONTROLS");
        $kw108$CB_SHOP_SUMMARY = SubLObjectFactory.makeKeyword("CB-SHOP-SUMMARY");
        $sym109$PLAN_FINDER = SubLObjectFactory.makeSymbol("PLAN-FINDER");
        $str110$Planner_Examiner = SubLObjectFactory.makeString("Planner Examiner");
        $sym111$PLAN_EXAMINER = SubLObjectFactory.makeSymbol("PLAN-EXAMINER");
        $str112$Plan_Verbose_Examiner = SubLObjectFactory.makeString("Plan Verbose Examiner");
        $sym113$PLAN_VERBOSE_EXAMINER = SubLObjectFactory.makeSymbol("PLAN-VERBOSE-EXAMINER");
        $str114$Plan_Task_Examiner = SubLObjectFactory.makeString("Plan Task Examiner");
        $sym115$PLAN_TASK_EXAMINER = SubLObjectFactory.makeSymbol("PLAN-TASK-EXAMINER");
        $str116$controls = SubLObjectFactory.makeString("controls");
        $str117$cb_shop_controls = SubLObjectFactory.makeString("cb-shop-controls");
        $str118$info = SubLObjectFactory.makeString("info");
        $str119$cb_shop_information = SubLObjectFactory.makeString("cb-shop-information");
        $str120$_Summary_ = SubLObjectFactory.makeString("[Summary]");
        $kw121$MAIN = SubLObjectFactory.makeKeyword("MAIN");
        $sym122$CB_LINK_CB_SHOP_SUMMARY = SubLObjectFactory.makeSymbol("CB-LINK-CB-SHOP-SUMMARY");
        $str123$_Controls_ = SubLObjectFactory.makeString("[Controls]");
        $sym124$CB_LINK_CB_SHOP_CONTROLS = SubLObjectFactory.makeSymbol("CB-LINK-CB-SHOP-CONTROLS");
        $str125$_Plan_Finder_ = SubLObjectFactory.makeString("[Plan Finder]");
        $str126$plan_finder = SubLObjectFactory.makeString("plan-finder");
        $sym127$CB_LINK_PLANNER = SubLObjectFactory.makeSymbol("CB-LINK-PLANNER");
        $str128$_Plan_Examiner_ = SubLObjectFactory.makeString("[Plan Examiner]");
        $str129$plan_examiner = SubLObjectFactory.makeString("plan-examiner");
        $kw130$PLAN_EXAMINER = SubLObjectFactory.makeKeyword("PLAN-EXAMINER");
        $sym131$CB_LINK_PLAN_EXAMINER = SubLObjectFactory.makeSymbol("CB-LINK-PLAN-EXAMINER");
        $str132$_Plan_Verbose_Examiner_ = SubLObjectFactory.makeString("[Plan Verbose Examiner]");
        $str133$plan_verbose_examiner = SubLObjectFactory.makeString("plan-verbose-examiner");
        $kw134$PLAN_VERBOSE_EXAMINER = SubLObjectFactory.makeKeyword("PLAN-VERBOSE-EXAMINER");
        $sym135$CB_LINK_PLAN_VERBOSE_EXAMINER = SubLObjectFactory.makeSymbol("CB-LINK-PLAN-VERBOSE-EXAMINER");
        $str136$Planner = SubLObjectFactory.makeString("Planner");
        $str137$Simple_Hierarchical_Ordered_Plann = SubLObjectFactory.makeString("Simple Hierarchical Ordered Planner");
        $sym138$CB_SHOP_CONTROLS = SubLObjectFactory.makeSymbol("CB-SHOP-CONTROLS");
        $str139$Summary = SubLObjectFactory.makeString("Summary");
        $str140$_New_Plan_ = SubLObjectFactory.makeString("[New Plan]");
        $str141$_Full_Screen_ = SubLObjectFactory.makeString("[Full Screen]");
        $sym142$CB_SHOP_INFORMATION = SubLObjectFactory.makeSymbol("CB-SHOP-INFORMATION");
        $str143$Hierarchical_Ordered_Planner = SubLObjectFactory.makeString("Hierarchical Ordered Planner");
        $str144$find_plans = SubLObjectFactory.makeString("find-plans");
        $str145$show_advanced_parameters = SubLObjectFactory.makeString("show-advanced-parameters");
        $str146$red = SubLObjectFactory.makeString("red");
        $str147$Warning_ = SubLObjectFactory.makeString("Warning:");
        $str148$verbosity_level = SubLObjectFactory.makeString("verbosity-level");
        $str149$cutoff_number = SubLObjectFactory.makeString("cutoff-number");
        $str150$number = SubLObjectFactory.makeString("number");
        $str151$cutoff_time = SubLObjectFactory.makeString("cutoff-time");
        $str152$time = SubLObjectFactory.makeString("time");
        $str153$do_fi_asks = SubLObjectFactory.makeString("do-fi-asks");
        $str154$do_asks = SubLObjectFactory.makeString("do-asks");
        $str155$num_backchains = SubLObjectFactory.makeString("num-backchains");
        $str156$cycle_checking = SubLObjectFactory.makeString("cycle-checking");
        $str157$depth_limit_p = SubLObjectFactory.makeString("depth-limit-p");
        $str158$depth_limit = SubLObjectFactory.makeString("depth-limit");
        $str159$search_type = SubLObjectFactory.makeString("search-type");
        $str160$logging = SubLObjectFactory.makeString("logging");
        $str161$no_logging = SubLObjectFactory.makeString("no-logging");
        $str162$domain_mt = SubLObjectFactory.makeString("domain-mt");
        $str163$task = SubLObjectFactory.makeString("task");
        $str164$Task_syntax_not_recognized_ = SubLObjectFactory.makeString("Task syntax not recognized.");
        $sym165$MAKE_NEW_THREAD = SubLObjectFactory.makeSymbol("MAKE-NEW-THREAD");
        $sym166$OUTPUT_STREAM = SubLObjectFactory.makeSymbol("OUTPUT-STREAM");
        $str167$___s_is_not_a_valid__s_microtheor = SubLObjectFactory.makeString("~%~s is not a valid ~s microtheory.");
        $const168$PlanningDomainMicrotheory = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PlanningDomainMicrotheory"));
        $str169$Domain = SubLObjectFactory.makeString("Domain");
        $str170$Task = SubLObjectFactory.makeString("Task");
        $str171$__Please_enter_an_instance_of__s_ = SubLObjectFactory.makeString("~%Please enter an instance of ~s.");
        $sym172$FIND_PLANS = SubLObjectFactory.makeSymbol("FIND-PLANS");
        $str173$Show = SubLObjectFactory.makeString("Show");
        $str174$Hide = SubLObjectFactory.makeString("Hide");
        $str175$Last_task_ = SubLObjectFactory.makeString("Last task:");
        $str176$Planner_halted_because__ = SubLObjectFactory.makeString("Planner halted because: ");
        $kw177$SEARCH_EXHAUSTED = SubLObjectFactory.makeKeyword("SEARCH-EXHAUSTED");
        $str178$Search_space_was_exhausted_ = SubLObjectFactory.makeString("Search space was exhausted.");
        $kw179$DEPTH_CUTOFF = SubLObjectFactory.makeKeyword("DEPTH-CUTOFF");
        $str180$Depth_limit_was_reached_ = SubLObjectFactory.makeString("Depth limit was reached.");
        $kw181$NUMBER_CUTOFF = SubLObjectFactory.makeKeyword("NUMBER-CUTOFF");
        $str182$Number_cutoff_was_reached_ = SubLObjectFactory.makeString("Number cutoff was reached.");
        $kw183$TIME_CUTOFF = SubLObjectFactory.makeKeyword("TIME-CUTOFF");
        $str184$Time_cutoff_was_reached_ = SubLObjectFactory.makeString("Time cutoff was reached.");
        $str185$_Examine_Plans_ = SubLObjectFactory.makeString("[Examine Plans]");
        $str186$_Examine_Verbose_Output_ = SubLObjectFactory.makeString("[Examine Verbose Output]");
        $kw187$PLAN_FINDER = SubLObjectFactory.makeKeyword("PLAN-FINDER");
        $str188$plan_finder_html = SubLObjectFactory.makeString("plan-finder.html");
        $str189$Plan_Checking_Enabled = SubLObjectFactory.makeString("Plan Checking Enabled");
        $str190$Complete = SubLObjectFactory.makeString("Complete");
        $str191$Mt_ = SubLObjectFactory.makeString("Mt:");
        $str192$Clear_Mt = SubLObjectFactory.makeString("Clear Mt");
        $str193$Task_ = SubLObjectFactory.makeString("Task:");
        $str194$Clear_Task = SubLObjectFactory.makeString("Clear Task");
        $int195$24 = SubLObjectFactory.makeInteger(24);
        $str196$Find_Plans = SubLObjectFactory.makeString("Find Plans");
        $int197$80 = SubLObjectFactory.makeInteger(80);
        $str198$virtual = SubLObjectFactory.makeString("virtual");
        $str199$95_ = SubLObjectFactory.makeString("95%");
        $kw200$LEFT = SubLObjectFactory.makeKeyword("LEFT");
        $str201$50 = SubLObjectFactory.makeString("50");
        $str202$Advanced_Planning_Parameters = SubLObjectFactory.makeString("Advanced Planning Parameters");
        $str203$SHOP_Domain_Examiner = SubLObjectFactory.makeString("SHOP Domain Examiner");
        $str204$_Verbose_Output_ = SubLObjectFactory.makeString("[Verbose Output]");
        $str205$Go_to_ = SubLObjectFactory.makeString("Go to:");
        $str206$_methods = SubLObjectFactory.makeString("#methods");
        $str207$Methods = SubLObjectFactory.makeString("Methods");
        $str208$_operators = SubLObjectFactory.makeString("#operators");
        $str209$Operators = SubLObjectFactory.makeString("Operators");
        $str210$_cond_operators = SubLObjectFactory.makeString("#cond-operators");
        $str211$Conditional_Ops = SubLObjectFactory.makeString("Conditional Ops");
        $str212$_sconds = SubLObjectFactory.makeString("#sconds");
        $str213$Sufficient_Conditions = SubLObjectFactory.makeString("Sufficient Conditions");
        $str214$Planning_Mt_ = SubLObjectFactory.makeString("Planning Mt:");
        $sym215$GET_NAME = SubLObjectFactory.makeSymbol("GET-NAME");
        $str216$methods = SubLObjectFactory.makeString("methods");
        $sym217$HTML_DISPLAY_ALL_METHODS = SubLObjectFactory.makeSymbol("HTML-DISPLAY-ALL-METHODS");
        $str218$operators = SubLObjectFactory.makeString("operators");
        $sym219$HTML_DISPLAY_ALL_OPERATORS = SubLObjectFactory.makeSymbol("HTML-DISPLAY-ALL-OPERATORS");
        $str220$cond_operators = SubLObjectFactory.makeString("cond-operators");
        $str221$Conditional_Operators = SubLObjectFactory.makeString("Conditional Operators");
        $sym222$HTML_DISPLAY_ALL_CONDITIONAL_OPERATORS = SubLObjectFactory.makeSymbol("HTML-DISPLAY-ALL-CONDITIONAL-OPERATORS");
        $str223$sconds = SubLObjectFactory.makeString("sconds");
        $sym224$HTML_DISPLAY_ALL_SCONDS = SubLObjectFactory.makeSymbol("HTML-DISPLAY-ALL-SCONDS");
        $str225$SHOP_Log = SubLObjectFactory.makeString("SHOP Log");
        $sym226$LOG = SubLObjectFactory.makeSymbol("LOG");
        $sym227$P_WRAPPER = SubLObjectFactory.makeSymbol("P-WRAPPER");
        $sym228$VERBOSE = SubLObjectFactory.makeSymbol("VERBOSE");
        $str229$No_Verbose_Output__Set_Verbosity_ = SubLObjectFactory.makeString("No Verbose Output! Set Verbosity to a value higher than 0.");
        $sym230$DISPLAY_HTML_LOG = SubLObjectFactory.makeSymbol("DISPLAY-HTML-LOG");
        $str231$plan_examiner_html = SubLObjectFactory.makeString("plan-examiner.html");
        $str232$Plan_Examiner = SubLObjectFactory.makeString("Plan Examiner");
        $str233$handle_plan_examiner_input = SubLObjectFactory.makeString("handle-plan-examiner-input");
        $sym234$HALT_STATUS = SubLObjectFactory.makeSymbol("HALT-STATUS");
        $sym235$PROBLEM = SubLObjectFactory.makeSymbol("PROBLEM");
        $str236$format = SubLObjectFactory.makeString("format");
        $str237$structure = SubLObjectFactory.makeString("structure");
        $str238$_cycl = SubLObjectFactory.makeString(":cycl");
        $kw239$ENGLISH = SubLObjectFactory.makeKeyword("ENGLISH");
        $str240$_hierarchical = SubLObjectFactory.makeString(":hierarchical");
        $kw241$PRIMITIVE = SubLObjectFactory.makeKeyword("PRIMITIVE");
        $sym242$HANDLE_PLAN_EXAMINER_INPUT = SubLObjectFactory.makeSymbol("HANDLE-PLAN-EXAMINER-INPUT");
        $str243$Change_View = SubLObjectFactory.makeString("Change View");
        $str244$submit = SubLObjectFactory.makeString("submit");
        $str245$Format_ = SubLObjectFactory.makeString("Format:");
        $str246$_english = SubLObjectFactory.makeString(":english");
        $str247$English = SubLObjectFactory.makeString("English");
        $str248$CycL = SubLObjectFactory.makeString("CycL");
        $str249$Structure_ = SubLObjectFactory.makeString("Structure:");
        $str250$_primitive = SubLObjectFactory.makeString(":primitive");
        $str251$Primitive = SubLObjectFactory.makeString("Primitive");
        $str252$Hierarchical = SubLObjectFactory.makeString("Hierarchical");
        $str253$ = SubLObjectFactory.makeString("");
        $str254$Number_Cutoff_ = SubLObjectFactory.makeString("Number Cutoff:");
        $str255$no_number = SubLObjectFactory.makeString("no-number");
        $str256$All_plans = SubLObjectFactory.makeString("All plans");
        $str257$_plans = SubLObjectFactory.makeString(" plans");
        $str258$Time_Cutoff_ = SubLObjectFactory.makeString("Time Cutoff:");
        $str259$no_time = SubLObjectFactory.makeString("no-time");
        $str260$Run_forever = SubLObjectFactory.makeString("Run forever");
        $str261$_seconds = SubLObjectFactory.makeString(" seconds");
        $str262$Depth_Cutoff_ = SubLObjectFactory.makeString("Depth Cutoff:");
        $str263$no_depth_limit = SubLObjectFactory.makeString("no-depth-limit");
        $str264$No = SubLObjectFactory.makeString("No");
        $str265$Yes = SubLObjectFactory.makeString("Yes");
        $str266$Back_Chaining_ = SubLObjectFactory.makeString("Back Chaining:");
        $str267$nil = SubLObjectFactory.makeString("nil");
        $str268$No_backchaining = SubLObjectFactory.makeString("No backchaining");
        $str269$_backchains = SubLObjectFactory.makeString(" backchains");
        $str270$Cycle_Checking_ = SubLObjectFactory.makeString("Cycle Checking:");
        $str271$no_cycle_checking = SubLObjectFactory.makeString("no-cycle-checking");
        $str272$Log_Process_ = SubLObjectFactory.makeString("Log Process:");
        $str273$_all = SubLObjectFactory.makeString(":all");
        $str274$_first = SubLObjectFactory.makeString(":first");
        $kw275$FIRST = SubLObjectFactory.makeKeyword("FIRST");
        $str276$_shallowest = SubLObjectFactory.makeString(":shallowest");
        $kw277$SHALLOWEST = SubLObjectFactory.makeKeyword("SHALLOWEST");
        $str278$_all_shallowest = SubLObjectFactory.makeString(":all-shallowest");
        $kw279$ALL_SHALLOWEST = SubLObjectFactory.makeKeyword("ALL-SHALLOWEST");
        $str280$_id_first = SubLObjectFactory.makeString(":id-first");
        $kw281$ID_FIRST = SubLObjectFactory.makeKeyword("ID-FIRST");
        $str282$_id_all = SubLObjectFactory.makeString(":id-all");
        $kw283$ID_ALL = SubLObjectFactory.makeKeyword("ID-ALL");
        $sym284$HTML_TASK_DISPLAYER = SubLObjectFactory.makeSymbol("HTML-TASK-DISPLAYER");
        $sym285$FIND_INSTANCE_BY_ID_STRING = SubLObjectFactory.makeSymbol("FIND-INSTANCE-BY-ID-STRING");
        $sym286$HTML_TASK_PAGE = SubLObjectFactory.makeSymbol("HTML-TASK-PAGE");
        $str287$Number_of_plans_found__ = SubLObjectFactory.makeString("Number of plans found: ");
        $str288$Plans_ = SubLObjectFactory.makeString("Plans:");
        $kw289$TASK_EXAMINER_LINKS = SubLObjectFactory.makeKeyword("TASK-EXAMINER-LINKS");
        $str290$Plan_ = SubLObjectFactory.makeString("Plan ");
        $str291$_ = SubLObjectFactory.makeString(":");
        $str292$No_plans_found_ = SubLObjectFactory.makeString("No plans found!");
        $str293$CB_SHOP_PLANNING = SubLObjectFactory.makeString("CB SHOP PLANNING");
        $sym294$DICTIONARY_LOOKUP = SubLObjectFactory.makeSymbol("DICTIONARY-LOOKUP");
        $sym295$PROCESS_WRAPPER_GET_ID = SubLObjectFactory.makeSymbol("PROCESS-WRAPPER-GET-ID");
        $list296 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ID-STR"));
        $sym297$CB_SHOP_ABORT_LINK_HANDLER = SubLObjectFactory.makeSymbol("CB-SHOP-ABORT-LINK-HANDLER");
        $str298$_a__a = SubLObjectFactory.makeString("~a&~a");
        $str299$cb_shop_abort_link_handler = SubLObjectFactory.makeString("cb-shop-abort-link-handler");
        $str300$_Abort_ = SubLObjectFactory.makeString("[Abort]");
        $sym301$CB_SHOP_PAUSE_LINK_HANDLER = SubLObjectFactory.makeSymbol("CB-SHOP-PAUSE-LINK-HANDLER");
        $str302$cb_shop_pause_link_handler = SubLObjectFactory.makeString("cb-shop-pause-link-handler");
        $str303$_Pause_ = SubLObjectFactory.makeString("[Pause]");
        $sym304$CB_SHOP_RESUME_LINK_HANDLER = SubLObjectFactory.makeSymbol("CB-SHOP-RESUME-LINK-HANDLER");
        $str305$cb_shop_resume_link_handler = SubLObjectFactory.makeString("cb-shop-resume-link-handler");
        $str306$_Resume_ = SubLObjectFactory.makeString("[Resume]");
        $sym307$CB_SHOP_VIEW_LINK_HANDLER = SubLObjectFactory.makeSymbol("CB-SHOP-VIEW-LINK-HANDLER");
        $str308$cb_shop_view_link_handler = SubLObjectFactory.makeString("cb-shop-view-link-handler");
        $str309$_View_ = SubLObjectFactory.makeString("[View]");
        $sym310$CB_SHOP_REPLAN_LINK_HANDLER = SubLObjectFactory.makeSymbol("CB-SHOP-REPLAN-LINK-HANDLER");
        $str311$cb_shop_replan_link_handler = SubLObjectFactory.makeString("cb-shop-replan-link-handler");
        $str312$_Replan_ = SubLObjectFactory.makeString("[Replan]");
        $sym313$CB_SHOP_VERBOSE_LINK_HANDLER = SubLObjectFactory.makeSymbol("CB-SHOP-VERBOSE-LINK-HANDLER");
        $str314$cb_shop_verbose_link_handler = SubLObjectFactory.makeString("cb-shop-verbose-link-handler");
        $str315$_Log_ = SubLObjectFactory.makeString("[Log]");
        $sym316$CB_SHOP_DELETE_LINK_HANDLER = SubLObjectFactory.makeSymbol("CB-SHOP-DELETE-LINK-HANDLER");
        $str317$cb_shop_delete_link_handler = SubLObjectFactory.makeString("cb-shop-delete-link-handler");
        $str318$_Delete_ = SubLObjectFactory.makeString("[Delete]");
        $sym319$CB_SHOP_DOMAIN_EXAMINER_LINK_HANDLER = SubLObjectFactory.makeSymbol("CB-SHOP-DOMAIN-EXAMINER-LINK-HANDLER");
        $str320$cb_shop_domain_examiner_link_hand = SubLObjectFactory.makeString("cb-shop-domain-examiner-link-handler");
        $str321$_Domain_ = SubLObjectFactory.makeString("[Domain]");
        $kw322$THREAD_STRUCTURE = SubLObjectFactory.makeKeyword("THREAD-STRUCTURE");
        $str323$Initializing = SubLObjectFactory.makeString("Initializing");
        $sym324$GET_DOMAIN = SubLObjectFactory.makeSymbol("GET-DOMAIN");
        $kw325$UNKNOWN = SubLObjectFactory.makeKeyword("UNKNOWN");
        $sym326$TASKS = SubLObjectFactory.makeSymbol("TASKS");
        $sym327$TASK_MT = SubLObjectFactory.makeSymbol("TASK-MT");
        $str328$No_Plans_Currently_Available_ = SubLObjectFactory.makeString("No Plans Currently Available.");
        $str329$Status = SubLObjectFactory.makeString("Status");
        $str330$Actions = SubLObjectFactory.makeString("Actions");
        $sym331$NUM_BACKCHAINS = SubLObjectFactory.makeSymbol("NUM-BACKCHAINS");
        $sym332$MAKE_DOMAIN_FROM_MT = SubLObjectFactory.makeSymbol("MAKE-DOMAIN-FROM-MT");
        $sym333$CB_SHOP_PW_PROOF_CHECKING_FUNC = SubLObjectFactory.makeSymbol("CB-SHOP-PW-PROOF-CHECKING-FUNC");
        $sym334$CB_SHOP_PW_FUNC = SubLObjectFactory.makeSymbol("CB-SHOP-PW-FUNC");
        $int335$30 = SubLObjectFactory.makeInteger(30);
        $str336$Open_Nodes = SubLObjectFactory.makeString("Open Nodes");
        $str337$Inferences = SubLObjectFactory.makeString("Inferences");
        $str338$Expansions = SubLObjectFactory.makeString("Expansions");
        $str339$Plans = SubLObjectFactory.makeString("Plans");
        $kw340$RIGHT = SubLObjectFactory.makeKeyword("RIGHT");
        $kw341$RED = SubLObjectFactory.makeKeyword("RED");
        $str342$Depth_Cutoff = SubLObjectFactory.makeString("Depth Cutoff");
        $str343$Number_Cutoff = SubLObjectFactory.makeString("Number Cutoff");
        $str344$Time_Cutoff = SubLObjectFactory.makeString("Time Cutoff");
        $str345$Paused_By_User = SubLObjectFactory.makeString("Paused By User");
        $str346$Completed = SubLObjectFactory.makeString("Completed");
        $str347$Pausing = SubLObjectFactory.makeString("Pausing");
        $str348$Running = SubLObjectFactory.makeString("Running");
        $sym349$CYCL_PLANS = SubLObjectFactory.makeSymbol("CYCL-PLANS");
        $sym350$PLANNER = SubLObjectFactory.makeSymbol("PLANNER");
        $sym351$CREATE_PLAN_DISPLAYER = SubLObjectFactory.makeSymbol("CREATE-PLAN-DISPLAYER");
    }
}

/*

	Total time: 3099 ms
	
*/