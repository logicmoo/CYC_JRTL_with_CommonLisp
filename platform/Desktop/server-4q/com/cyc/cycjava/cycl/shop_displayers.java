package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class shop_displayers extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.shop_displayers";
    public static final String myFingerPrint = "7dd29e1918af85dedd45f26d4bdfadf36edca3754f1329dd01fa229892027e17";
    @SubLTranslatedFile.SubL(source = "cycl/shop-displayers.lisp", position = 843L)
    private static SubLSymbol $cb_plan_task_examiner_link_image$;
    @SubLTranslatedFile.SubL(source = "cycl/shop-displayers.lisp", position = 947L)
    private static SubLSymbol $cb_plan_task_examiner_method_image$;
    @SubLTranslatedFile.SubL(source = "cycl/shop-displayers.lisp", position = 1057L)
    private static SubLSymbol $cb_plan_task_examiner_operator_image$;
    @SubLTranslatedFile.SubL(source = "cycl/shop-displayers.lisp", position = 1173L)
    private static SubLSymbol $cb_plan_task_examiner_scond_image$;
    private static final SubLSymbol $kw0$TE_LINK;
    private static final SubLString $str1$bl_sdi_gif;
    private static final SubLSymbol $kw2$TE_METHOD;
    private static final SubLString $str3$gr_sdi_gif;
    private static final SubLSymbol $kw4$TE_OPERATOR;
    private static final SubLString $str5$yl_sdi_gif;
    private static final SubLSymbol $kw6$TE_EXAMINER;
    private static final SubLString $str7$red_diam_gif;
    private static final SubLSymbol $sym8$HTML_TASK_DISPLAYER;
    private static final SubLSymbol $sym9$SHOP_INDEXED_OBJECT;
    private static final SubLList $list10;
    private static final SubLSymbol $sym11$PLAN_DISPLAYER;
    private static final SubLSymbol $sym12$TASK;
    private static final SubLSymbol $sym13$OBJECT;
    private static final SubLSymbol $sym14$INSTANCE_COUNT;
    private static final SubLSymbol $sym15$INSTANCE_INDEX;
    private static final SubLSymbol $sym16$SUBLOOP_RESERVED_INITIALIZE_HTML_TASK_DISPLAYER_CLASS;
    private static final SubLSymbol $sym17$ISOLATED_P;
    private static final SubLSymbol $sym18$INSTANCE_NUMBER;
    private static final SubLSymbol $sym19$SUBLOOP_RESERVED_INITIALIZE_HTML_TASK_DISPLAYER_INSTANCE;
    private static final SubLSymbol $sym20$HTML_PLAN_DISPLAYER;
    private static final SubLList $list21;
    private static final SubLList $list22;
    private static final SubLSymbol $sym23$DISPLAY_VARIABLE_SUBSTITUTION;
    private static final SubLSymbol $sym24$OPEN_VARIABLES;
    private static final SubLSymbol $sym25$MBINDING;
    private static final SubLSymbol $sym26$TASK_DISPLAYER_HASH_TABLE;
    private static final SubLSymbol $sym27$PLAN;
    private static final SubLSymbol $sym28$SUBLOOP_RESERVED_INITIALIZE_HTML_PLAN_DISPLAYER_CLASS;
    private static final SubLSymbol $sym29$SUBLOOP_RESERVED_INITIALIZE_HTML_PLAN_DISPLAYER_INSTANCE;
    private static final SubLSymbol $sym30$CYC_DEVELOPMENT_PLAN_DISPLAYER_FACTORY;
    private static final SubLSymbol $sym31$SHOP_PLAN_DISPLAYER_FACTORY;
    private static final SubLSymbol $sym32$SUBLOOP_RESERVED_INITIALIZE_CYC_DEVELOPMENT_PLAN_DISPLAYER_FACTOR;
    private static final SubLSymbol $sym33$SUBLOOP_RESERVED_INITIALIZE_CYC_DEVELOPMENT_PLAN_DISPLAYER_FACTOR;
    private static final SubLSymbol $sym34$CREATE_PLAN_DISPLAYER;
    private static final SubLList $list35;
    private static final SubLList $list36;
    private static final SubLList $list37;
    private static final SubLSymbol $sym38$INIT_WITH_PLAN;
    private static final SubLSymbol $sym39$CYC_DEVELOPMENT_PLAN_DISPLAYER_FACTORY_CREATE_PLAN_DISPLAYER_METH;
    private static final SubLSymbol $sym40$CREATE_TASK_DISPLAYER;
    private static final SubLList $list41;
    private static final SubLList $list42;
    private static final SubLSymbol $sym43$CYC_DEVELOPMENT_PLAN_DISPLAYER_FACTORY_CREATE_TASK_DISPLAYER_METH;
    private static final SubLSymbol $sym44$INITIALIZE;
    private static final SubLList $list45;
    private static final SubLList $list46;
    private static final SubLSymbol $sym47$HTML_TASK_DISPLAYER_INITIALIZE_METHOD;
    private static final SubLSymbol $sym48$INIT_WITH_TASK;
    private static final SubLList $list49;
    private static final SubLList $list50;
    private static final SubLSymbol $sym51$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD;
    private static final SubLSymbol $sym52$HTML_TASK_DISPLAYER_INIT_WITH_TASK_METHOD;
    private static final SubLSymbol $sym53$FIND_INSTANCE_BY_ID_STRING;
    private static final SubLList $list54;
    private static final SubLList $list55;
    private static final SubLSymbol $sym56$HTML_TASK_DISPLAYER_FIND_INSTANCE_BY_ID_STRING_METHOD;
    private static final SubLSymbol $sym57$TASK_EXAMINER_LINK_IMAGE;
    private static final SubLList $list58;
    private static final SubLSymbol $sym59$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD;
    private static final SubLSymbol $sym60$PLANNER_RULE;
    private static final SubLSymbol $sym61$HTML_TASK_DISPLAYER_TASK_EXAMINER_LINK_IMAGE_METHOD;
    private static final SubLSymbol $sym62$CB_TASK_EXAMINER_LINK;
    private static final SubLList $list63;
    private static final SubLSymbol $sym64$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD;
    private static final SubLString $str65$cg_plan_task_examiner_;
    private static final SubLSymbol $kw66$TOP;
    private static final SubLSymbol $sym67$HTML_TASK_DISPLAYER_CB_TASK_EXAMINER_LINK_METHOD;
    private static final SubLSymbol $sym68$HTML_FORM;
    private static final SubLList $list69;
    private static final SubLList $list70;
    private static final SubLSymbol $sym71$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD;
    private static final SubLSymbol $kw72$TASK_EXAMINER_LINKS;
    private static final SubLSymbol $sym73$PREPARE_TASK_FOR_DISPLAY;
    private static final SubLSymbol $sym74$FORMULA;
    private static final SubLSymbol $kw75$CYCL;
    private static final SubLSymbol $sym76$HTML_TASK_DISPLAYER_HTML_FORM_METHOD;
    private static final SubLList $list77;
    private static final SubLSymbol $sym78$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD;
    private static final SubLSymbol $sym79$HTML_TASK_DISPLAYER_FORMULA_METHOD;
    private static final SubLSymbol $sym80$BINDINGS;
    private static final SubLList $list81;
    private static final SubLSymbol $sym82$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD;
    private static final SubLSymbol $sym83$HTML_TASK_DISPLAYER_BINDINGS_METHOD;
    private static final SubLSymbol $sym84$DISPLAY_BINDINGS;
    private static final SubLList $list85;
    private static final SubLList $list86;
    private static final SubLSymbol $sym87$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD;
    private static final SubLSymbol $sym88$VARIABLE_MANAGER;
    private static final SubLSymbol $sym89$FIRST;
    private static final SubLSymbol $sym90$RECOVER_EL;
    private static final SubLSymbol $sym91$HTML_TASK_DISPLAYER_DISPLAY_BINDINGS_METHOD;
    private static final SubLSymbol $sym92$HTML_TASK_PAGE;
    private static final SubLList $list93;
    private static final SubLSymbol $sym94$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD;
    private static final SubLString $str95$Task_Examiner;
    private static final SubLString $str96$__DOCTYPE_html_PUBLIC_____W3C__DT;
    private static final SubLString $str97$_meta_http_equiv__X_UA_Compatible;
    private static final SubLSymbol $kw98$UNINITIALIZED;
    private static final SubLSymbol $kw99$CB_CYC;
    private static final SubLSymbol $kw100$SAM_AUTOCOMPLETE_CSS;
    private static final SubLSymbol $kw101$SHA1;
    private static final SubLString $str102$yui_skin_sam;
    private static final SubLString $str103$reloadFrameButton;
    private static final SubLString $str104$button;
    private static final SubLString $str105$reload;
    private static final SubLString $str106$Refresh_Frames;
    private static final SubLString $str107$Task__;
    private static final SubLString $str108$Translation__;
    private static final SubLString $str109$Assertion__;
    private static final SubLSymbol $sym110$ASSERTIONS;
    private static final SubLString $str111$Bindings__;
    private static final SubLSymbol $sym112$HTML_TASK_DISPLAYER_HTML_TASK_PAGE_METHOD;
    private static final SubLList $list113;
    private static final SubLList $list114;
    private static final SubLSymbol $sym115$HTML_PLAN_DISPLAYER_INITIALIZE_METHOD;
    private static final SubLList $list116;
    private static final SubLList $list117;
    private static final SubLSymbol $sym118$OUTER_CATCH_FOR_HTML_PLAN_DISPLAYER_METHOD;
    private static final SubLSymbol $sym119$RECOVER_EL_VARIABLE;
    private static final SubLSymbol $sym120$PRE_ORDERING;
    private static final SubLSymbol $sym121$HTML_PLAN_DISPLAYER_INIT_WITH_PLAN_METHOD;
    private static final SubLList $list122;
    private static final SubLSymbol $sym123$OUTER_CATCH_FOR_HTML_PLAN_DISPLAYER_METHOD;
    private static final SubLSymbol $sym124$SIMPLE_BINDING_LIST;
    private static final SubLSymbol $sym125$HTML_PLAN_DISPLAYER_PREPARE_TASK_FOR_DISPLAY_METHOD;
    private static final SubLSymbol $sym126$HTML_HIERARCHICAL_FORM;
    private static final SubLList $list127;
    private static final SubLSymbol $sym128$OUTER_CATCH_FOR_HTML_PLAN_DISPLAYER_METHOD;
    private static final SubLSymbol $sym129$POST_ORDERING;
    private static final SubLSymbol $sym130$HTML_PLAN_DISPLAYER_HTML_HIERARCHICAL_FORM_METHOD;
    private static final SubLSymbol $sym131$HTML_PRIMITIVE_FORM;
    private static final SubLList $list132;
    private static final SubLSymbol $sym133$OUTER_CATCH_FOR_HTML_PLAN_DISPLAYER_METHOD;
    private static final SubLSymbol $sym134$PRIMITIVE_FORM;
    private static final SubLString $str135$__Step_;
    private static final SubLString $str136$___;
    private static final SubLSymbol $sym137$HTML_PLAN_DISPLAYER_HTML_PRIMITIVE_FORM_METHOD;
    private static final SubLSymbol $sym138$HTML_MULTIBINDING_VALUES;
    private static final SubLList $list139;
    private static final SubLList $list140;
    private static final SubLSymbol $sym141$OUTER_CATCH_FOR_HTML_PLAN_DISPLAYER_METHOD;
    private static final SubLString $str142$is_one_of;
    private static final SubLString $str143$_;
    private static final SubLSymbol $sym144$HTML_PLAN_DISPLAYER_HTML_MULTIBINDING_VALUES_METHOD;
    private static final SubLSymbol $sym145$HTML_MBINDING_FORM;
    private static final SubLList $list146;
    private static final SubLSymbol $sym147$OUTER_CATCH_FOR_HTML_PLAN_DISPLAYER_METHOD;
    private static final SubLString $str148$for_any_of_the_following_values__;
    private static final SubLSymbol $sym149$HTML_PLAN_DISPLAYER_HTML_MBINDING_FORM_METHOD;
    private static final SubLList $list150;
    private static final SubLSymbol $kw151$PRIMITIVE;
    private static final SubLSymbol $sym152$HTML_PLAN_DISPLAYER_HTML_FORM_METHOD;
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-displayers.lisp", position = 1243L)
    public static SubLObject get_html_task_displayer_plan_displayer(final SubLObject html_task_displayer) {
        return classes.subloop_get_access_protected_instance_slot(html_task_displayer, (SubLObject)shop_displayers.TWO_INTEGER, (SubLObject)shop_displayers.$sym11$PLAN_DISPLAYER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-displayers.lisp", position = 1243L)
    public static SubLObject set_html_task_displayer_plan_displayer(final SubLObject html_task_displayer, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(html_task_displayer, value, (SubLObject)shop_displayers.TWO_INTEGER, (SubLObject)shop_displayers.$sym11$PLAN_DISPLAYER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-displayers.lisp", position = 1243L)
    public static SubLObject get_html_task_displayer_task(final SubLObject html_task_displayer) {
        return classes.subloop_get_access_protected_instance_slot(html_task_displayer, (SubLObject)shop_displayers.ONE_INTEGER, (SubLObject)shop_displayers.$sym12$TASK);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-displayers.lisp", position = 1243L)
    public static SubLObject set_html_task_displayer_task(final SubLObject html_task_displayer, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(html_task_displayer, value, (SubLObject)shop_displayers.ONE_INTEGER, (SubLObject)shop_displayers.$sym12$TASK);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-displayers.lisp", position = 1243L)
    public static SubLObject subloop_reserved_initialize_html_task_displayer_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_displayers.$sym13$OBJECT, (SubLObject)shop_displayers.$sym14$INSTANCE_COUNT, (SubLObject)shop_displayers.ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_displayers.$sym9$SHOP_INDEXED_OBJECT, (SubLObject)shop_displayers.$sym15$INSTANCE_INDEX, (SubLObject)shop_displayers.NIL);
        return (SubLObject)shop_displayers.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-displayers.lisp", position = 1243L)
    public static SubLObject subloop_reserved_initialize_html_task_displayer_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_displayers.$sym13$OBJECT, (SubLObject)shop_displayers.$sym17$ISOLATED_P, (SubLObject)shop_displayers.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_displayers.$sym13$OBJECT, (SubLObject)shop_displayers.$sym18$INSTANCE_NUMBER, (SubLObject)shop_displayers.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_displayers.$sym8$HTML_TASK_DISPLAYER, (SubLObject)shop_displayers.$sym12$TASK, (SubLObject)shop_displayers.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_displayers.$sym8$HTML_TASK_DISPLAYER, (SubLObject)shop_displayers.$sym11$PLAN_DISPLAYER, (SubLObject)shop_displayers.NIL);
        return (SubLObject)shop_displayers.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-displayers.lisp", position = 1243L)
    public static SubLObject html_task_displayer_p(final SubLObject html_task_displayer) {
        return classes.subloop_instanceof_class(html_task_displayer, (SubLObject)shop_displayers.$sym8$HTML_TASK_DISPLAYER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-displayers.lisp", position = 1730L)
    public static SubLObject get_html_plan_displayer_display_variable_substitution(final SubLObject html_plan_displayer) {
        return classes.subloop_get_access_protected_instance_slot(html_plan_displayer, (SubLObject)shop_displayers.FIVE_INTEGER, (SubLObject)shop_displayers.$sym23$DISPLAY_VARIABLE_SUBSTITUTION);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-displayers.lisp", position = 1730L)
    public static SubLObject set_html_plan_displayer_display_variable_substitution(final SubLObject html_plan_displayer, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(html_plan_displayer, value, (SubLObject)shop_displayers.FIVE_INTEGER, (SubLObject)shop_displayers.$sym23$DISPLAY_VARIABLE_SUBSTITUTION);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-displayers.lisp", position = 1730L)
    public static SubLObject get_html_plan_displayer_open_variables(final SubLObject html_plan_displayer) {
        return classes.subloop_get_access_protected_instance_slot(html_plan_displayer, (SubLObject)shop_displayers.FOUR_INTEGER, (SubLObject)shop_displayers.$sym24$OPEN_VARIABLES);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-displayers.lisp", position = 1730L)
    public static SubLObject set_html_plan_displayer_open_variables(final SubLObject html_plan_displayer, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(html_plan_displayer, value, (SubLObject)shop_displayers.FOUR_INTEGER, (SubLObject)shop_displayers.$sym24$OPEN_VARIABLES);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-displayers.lisp", position = 1730L)
    public static SubLObject get_html_plan_displayer_mbinding(final SubLObject html_plan_displayer) {
        return classes.subloop_get_access_protected_instance_slot(html_plan_displayer, (SubLObject)shop_displayers.THREE_INTEGER, (SubLObject)shop_displayers.$sym25$MBINDING);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-displayers.lisp", position = 1730L)
    public static SubLObject set_html_plan_displayer_mbinding(final SubLObject html_plan_displayer, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(html_plan_displayer, value, (SubLObject)shop_displayers.THREE_INTEGER, (SubLObject)shop_displayers.$sym25$MBINDING);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-displayers.lisp", position = 1730L)
    public static SubLObject get_html_plan_displayer_task_displayer_hash_table(final SubLObject html_plan_displayer) {
        return classes.subloop_get_access_protected_instance_slot(html_plan_displayer, (SubLObject)shop_displayers.TWO_INTEGER, (SubLObject)shop_displayers.$sym26$TASK_DISPLAYER_HASH_TABLE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-displayers.lisp", position = 1730L)
    public static SubLObject set_html_plan_displayer_task_displayer_hash_table(final SubLObject html_plan_displayer, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(html_plan_displayer, value, (SubLObject)shop_displayers.TWO_INTEGER, (SubLObject)shop_displayers.$sym26$TASK_DISPLAYER_HASH_TABLE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-displayers.lisp", position = 1730L)
    public static SubLObject get_html_plan_displayer_plan(final SubLObject html_plan_displayer) {
        return classes.subloop_get_access_protected_instance_slot(html_plan_displayer, (SubLObject)shop_displayers.ONE_INTEGER, (SubLObject)shop_displayers.$sym27$PLAN);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-displayers.lisp", position = 1730L)
    public static SubLObject set_html_plan_displayer_plan(final SubLObject html_plan_displayer, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(html_plan_displayer, value, (SubLObject)shop_displayers.ONE_INTEGER, (SubLObject)shop_displayers.$sym27$PLAN);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-displayers.lisp", position = 1730L)
    public static SubLObject subloop_reserved_initialize_html_plan_displayer_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_displayers.$sym13$OBJECT, (SubLObject)shop_displayers.$sym14$INSTANCE_COUNT, (SubLObject)shop_displayers.ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_displayers.$sym9$SHOP_INDEXED_OBJECT, (SubLObject)shop_displayers.$sym15$INSTANCE_INDEX, (SubLObject)shop_displayers.NIL);
        return (SubLObject)shop_displayers.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-displayers.lisp", position = 1730L)
    public static SubLObject subloop_reserved_initialize_html_plan_displayer_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_displayers.$sym13$OBJECT, (SubLObject)shop_displayers.$sym17$ISOLATED_P, (SubLObject)shop_displayers.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_displayers.$sym13$OBJECT, (SubLObject)shop_displayers.$sym18$INSTANCE_NUMBER, (SubLObject)shop_displayers.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_displayers.$sym20$HTML_PLAN_DISPLAYER, (SubLObject)shop_displayers.$sym27$PLAN, (SubLObject)shop_displayers.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_displayers.$sym20$HTML_PLAN_DISPLAYER, (SubLObject)shop_displayers.$sym26$TASK_DISPLAYER_HASH_TABLE, (SubLObject)shop_displayers.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_displayers.$sym20$HTML_PLAN_DISPLAYER, (SubLObject)shop_displayers.$sym25$MBINDING, (SubLObject)shop_displayers.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_displayers.$sym20$HTML_PLAN_DISPLAYER, (SubLObject)shop_displayers.$sym24$OPEN_VARIABLES, (SubLObject)shop_displayers.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_displayers.$sym20$HTML_PLAN_DISPLAYER, (SubLObject)shop_displayers.$sym23$DISPLAY_VARIABLE_SUBSTITUTION, (SubLObject)shop_displayers.NIL);
        return (SubLObject)shop_displayers.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-displayers.lisp", position = 1730L)
    public static SubLObject html_plan_displayer_p(final SubLObject html_plan_displayer) {
        return classes.subloop_instanceof_class(html_plan_displayer, (SubLObject)shop_displayers.$sym20$HTML_PLAN_DISPLAYER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-displayers.lisp", position = 2629L)
    public static SubLObject subloop_reserved_initialize_cyc_development_plan_displayer_factory_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_displayers.$sym13$OBJECT, (SubLObject)shop_displayers.$sym14$INSTANCE_COUNT, (SubLObject)shop_displayers.ZERO_INTEGER);
        return (SubLObject)shop_displayers.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-displayers.lisp", position = 2629L)
    public static SubLObject subloop_reserved_initialize_cyc_development_plan_displayer_factory_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_displayers.$sym13$OBJECT, (SubLObject)shop_displayers.$sym17$ISOLATED_P, (SubLObject)shop_displayers.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_displayers.$sym13$OBJECT, (SubLObject)shop_displayers.$sym18$INSTANCE_NUMBER, (SubLObject)shop_displayers.NIL);
        return (SubLObject)shop_displayers.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-displayers.lisp", position = 2629L)
    public static SubLObject cyc_development_plan_displayer_factory_p(final SubLObject cyc_development_plan_displayer_factory) {
        return classes.subloop_instanceof_class(cyc_development_plan_displayer_factory, (SubLObject)shop_displayers.$sym30$CYC_DEVELOPMENT_PLAN_DISPLAYER_FACTORY);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-displayers.lisp", position = 2955L)
    public static SubLObject cyc_development_plan_displayer_factory_create_plan_displayer_method(final SubLObject self, final SubLObject plan) {
        final SubLObject plan_displayer = object.object_new_method((SubLObject)shop_displayers.$sym20$HTML_PLAN_DISPLAYER);
        methods.funcall_instance_method_with_2_args(plan_displayer, (SubLObject)shop_displayers.$sym38$INIT_WITH_PLAN, plan, self);
        return plan_displayer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-displayers.lisp", position = 3287L)
    public static SubLObject cyc_development_plan_displayer_factory_create_task_displayer_method(final SubLObject self, final SubLObject task) {
        final SubLObject task_displayer = object.object_new_method((SubLObject)shop_displayers.$sym8$HTML_TASK_DISPLAYER);
        html_task_displayer_init_with_task_method(task_displayer, task);
        return task_displayer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-displayers.lisp", position = 3613L)
    public static SubLObject html_task_displayer_initialize_method(final SubLObject self) {
        shop_datastructures.shop_indexed_object_initialize_method(self);
        return self;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-displayers.lisp", position = 3787L)
    public static SubLObject html_task_displayer_init_with_task_method(final SubLObject self, final SubLObject new_task) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_html_task_displayer_method = (SubLObject)shop_displayers.NIL;
        SubLObject task = get_html_task_displayer_task(self);
        try {
            thread.throwStack.push(shop_displayers.$sym51$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD);
            try {
                task = new_task;
                Dynamic.sublisp_throw((SubLObject)shop_displayers.$sym51$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD, (SubLObject)shop_displayers.NIL);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_displayers.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_html_task_displayer_task(self, task);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_html_task_displayer_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_displayers.$sym51$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_html_task_displayer_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-displayers.lisp", position = 3903L)
    public static SubLObject html_task_displayer_find_instance_by_id_string_method(final SubLObject self, final SubLObject id_string) {
        final SubLObject id = reader.read_from_string_ignoring_errors(id_string, (SubLObject)shop_displayers.UNPROVIDED, (SubLObject)shop_displayers.UNPROVIDED, (SubLObject)shop_displayers.UNPROVIDED, (SubLObject)shop_displayers.UNPROVIDED);
        return shop_datastructures.shop_indexed_object_find_instance_method(self, id);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-displayers.lisp", position = 4171L)
    public static SubLObject html_task_displayer_task_examiner_link_image_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_html_task_displayer_method = (SubLObject)shop_displayers.NIL;
        final SubLObject task = get_html_task_displayer_task(self);
        try {
            thread.throwStack.push(shop_displayers.$sym59$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD);
            try {
                final SubLObject planner_rule = methods.funcall_instance_method_with_0_args(task, (SubLObject)shop_displayers.$sym60$PLANNER_RULE);
                if (shop_displayers.NIL != shop_datastructures.shop_method_p(planner_rule)) {
                    Dynamic.sublisp_throw((SubLObject)shop_displayers.$sym59$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD, shop_displayers.$cb_plan_task_examiner_method_image$.getGlobalValue());
                }
                else if (shop_displayers.NIL != shop_datastructures.shop_precondition_p(planner_rule)) {
                    Dynamic.sublisp_throw((SubLObject)shop_displayers.$sym59$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD, shop_displayers.$cb_plan_task_examiner_operator_image$.getGlobalValue());
                }
                else if (shop_displayers.NIL != shop_datastructures.shop_sufficiency_condition_p(planner_rule)) {
                    Dynamic.sublisp_throw((SubLObject)shop_displayers.$sym59$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD, shop_displayers.$cb_plan_task_examiner_scond_image$.getGlobalValue());
                }
                else {
                    Dynamic.sublisp_throw((SubLObject)shop_displayers.$sym59$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD, shop_displayers.$cb_plan_task_examiner_link_image$.getGlobalValue());
                }
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_displayers.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_html_task_displayer_task(self, task);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_html_task_displayer_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_displayers.$sym59$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_html_task_displayer_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-displayers.lisp", position = 4739L)
    public static SubLObject html_task_displayer_cb_task_examiner_link_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_html_task_displayer_method = (SubLObject)shop_displayers.NIL;
        final SubLObject instance_number = object.get_object_instance_number(self);
        try {
            thread.throwStack.push(shop_displayers.$sym64$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD);
            try {
                final SubLObject id_string = PrintLow.write_to_string(instances.get_slot(self, (SubLObject)shop_displayers.$sym18$INSTANCE_NUMBER), shop_displayers.EMPTY_SUBL_OBJECT_ARRAY);
                final SubLObject href = Sequences.cconcatenate((SubLObject)shop_displayers.$str65$cg_plan_task_examiner_, id_string);
                final SubLObject image = html_task_displayer_task_examiner_link_image_method(self);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)shop_displayers.UNPROVIDED);
                html_utilities.html_markup(href);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)shop_displayers.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)shop_displayers.UNPROVIDED);
                final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)shop_displayers.T, thread);
                    final SubLObject image_src = cyc_file_dependencies.cb_icon_file_path(image);
                    final SubLObject align = (SubLObject)shop_displayers.$kw66$TOP;
                    final SubLObject alt = cyc_file_dependencies.cb_get_icon_alt_string(image);
                    final SubLObject border = (SubLObject)shop_displayers.ZERO_INTEGER;
                    html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)shop_displayers.UNPROVIDED);
                    html_utilities.html_markup(image_src);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)shop_displayers.UNPROVIDED);
                    if (shop_displayers.NIL != alt) {
                        html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)shop_displayers.UNPROVIDED);
                        html_utilities.html_markup(alt);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)shop_displayers.UNPROVIDED);
                    }
                    if (shop_displayers.NIL != align) {
                        html_utilities.html_markup(html_macros.$html_image_align$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)shop_displayers.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_align(align));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)shop_displayers.UNPROVIDED);
                    }
                    if (shop_displayers.NIL != border) {
                        html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)shop_displayers.UNPROVIDED);
                        html_utilities.html_markup(border);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)shop_displayers.UNPROVIDED);
                    }
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)shop_displayers.UNPROVIDED);
                    final SubLObject _prev_bind_0_$1 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)shop_displayers.T, thread);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$1, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                Dynamic.sublisp_throw((SubLObject)shop_displayers.$sym64$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD, (SubLObject)shop_displayers.NIL);
            }
            finally {
                final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_displayers.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    object.set_object_instance_number(self, instance_number);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_html_task_displayer_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_displayers.$sym64$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_html_task_displayer_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-displayers.lisp", position = 5157L)
    public static SubLObject html_task_displayer_html_form_method(final SubLObject self, final SubLObject style_args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_html_task_displayer_method = (SubLObject)shop_displayers.NIL;
        final SubLObject plan_displayer = get_html_task_displayer_plan_displayer(self);
        final SubLObject task = get_html_task_displayer_task(self);
        try {
            thread.throwStack.push(shop_displayers.$sym71$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD);
            try {
                if (shop_displayers.NIL != subl_promotions.memberP((SubLObject)shop_displayers.$kw72$TASK_EXAMINER_LINKS, style_args, (SubLObject)shop_displayers.UNPROVIDED, (SubLObject)shop_displayers.UNPROVIDED)) {
                    html_task_displayer_cb_task_examiner_link_method(self);
                }
                final SubLObject display_form = methods.funcall_instance_method_with_1_args(plan_displayer, (SubLObject)shop_displayers.$sym73$PREPARE_TASK_FOR_DISPLAY, instances.get_slot(task, (SubLObject)shop_displayers.$sym74$FORMULA));
                if (shop_displayers.NIL != subl_promotions.memberP((SubLObject)shop_displayers.$kw75$CYCL, style_args, (SubLObject)shop_displayers.UNPROVIDED, (SubLObject)shop_displayers.UNPROVIDED)) {
                    cb_utilities.cb_form(display_form, (SubLObject)shop_displayers.UNPROVIDED, (SubLObject)shop_displayers.UNPROVIDED);
                }
                else {
                    final SubLObject _prev_bind_0 = pph_vars.$pph_quantify_varsP$.currentBinding(thread);
                    try {
                        pph_vars.$pph_quantify_varsP$.bind((SubLObject)shop_displayers.NIL, thread);
                        pph_html.html_text_with_target(display_form, (SubLObject)shop_displayers.UNPROVIDED, (SubLObject)shop_displayers.UNPROVIDED, (SubLObject)shop_displayers.UNPROVIDED, (SubLObject)shop_displayers.UNPROVIDED);
                    }
                    finally {
                        pph_vars.$pph_quantify_varsP$.rebind(_prev_bind_0, thread);
                    }
                }
                Dynamic.sublisp_throw((SubLObject)shop_displayers.$sym71$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD, (SubLObject)shop_displayers.NIL);
            }
            finally {
                final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_displayers.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_html_task_displayer_plan_displayer(self, plan_displayer);
                    set_html_task_displayer_task(self, task);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_html_task_displayer_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_displayers.$sym71$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_html_task_displayer_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-displayers.lisp", position = 5613L)
    public static SubLObject html_task_displayer_formula_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_html_task_displayer_method = (SubLObject)shop_displayers.NIL;
        final SubLObject task = get_html_task_displayer_task(self);
        try {
            thread.throwStack.push(shop_displayers.$sym78$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)shop_displayers.$sym78$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD, instances.get_slot(task, (SubLObject)shop_displayers.$sym74$FORMULA));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_displayers.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_html_task_displayer_task(self, task);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_html_task_displayer_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_displayers.$sym78$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_html_task_displayer_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-displayers.lisp", position = 5710L)
    public static SubLObject html_task_displayer_bindings_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_html_task_displayer_method = (SubLObject)shop_displayers.NIL;
        final SubLObject task = get_html_task_displayer_task(self);
        try {
            thread.throwStack.push(shop_displayers.$sym82$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)shop_displayers.$sym82$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD, instances.get_slot(task, (SubLObject)shop_displayers.$sym80$BINDINGS));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_displayers.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_html_task_displayer_task(self, task);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_html_task_displayer_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_displayers.$sym82$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_html_task_displayer_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-displayers.lisp", position = 5810L)
    public static SubLObject html_task_displayer_display_bindings_method(final SubLObject self, final SubLObject style_args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_html_task_displayer_method = (SubLObject)shop_displayers.NIL;
        final SubLObject plan_displayer = get_html_task_displayer_plan_displayer(self);
        try {
            thread.throwStack.push(shop_displayers.$sym87$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD);
            try {
                final SubLObject var_manager = instances.get_slot(instances.get_slot(instances.get_slot(self, (SubLObject)shop_displayers.$sym11$PLAN_DISPLAYER), (SubLObject)shop_displayers.$sym27$PLAN), (SubLObject)shop_displayers.$sym88$VARIABLE_MANAGER);
                final SubLObject mbind = html_task_displayer_bindings_method(self);
                if (shop_displayers.NIL != mbind) {
                    html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)shop_displayers.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)shop_displayers.ZERO_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)shop_displayers.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)shop_displayers.UNPROVIDED);
                    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)shop_displayers.T, thread);
                        SubLObject iteration_state;
                        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(multibindings.mb_multi_var_term_map(mbind))); shop_displayers.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                            thread.resetMultipleValues();
                            final SubLObject cur_var = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                            final SubLObject entry = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            final SubLObject cur_values = Mapping.mapcar(Symbols.symbol_function((SubLObject)shop_displayers.$sym89$FIRST), entry);
                            final SubLObject el_var = methods.funcall_instance_method_with_1_args(var_manager, (SubLObject)shop_displayers.$sym90$RECOVER_EL, cur_var);
                            final SubLObject el_values = methods.funcall_instance_method_with_1_args(var_manager, (SubLObject)shop_displayers.$sym90$RECOVER_EL, cur_values);
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)shop_displayers.UNPROVIDED);
                            final SubLObject _prev_bind_0_$2 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)shop_displayers.T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)shop_displayers.UNPROVIDED);
                                final SubLObject _prev_bind_0_$3 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)shop_displayers.T, thread);
                                    html_utilities.html_princ(el_var);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$3, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)shop_displayers.UNPROVIDED);
                                final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)shop_displayers.T, thread);
                                    if (shop_displayers.NIL != list_utilities.singletonP(el_values)) {
                                        cb_utilities.cb_form(el_values.first(), (SubLObject)shop_displayers.UNPROVIDED, (SubLObject)shop_displayers.UNPROVIDED);
                                    }
                                    else {
                                        cb_utilities.cb_form(el_values, (SubLObject)shop_displayers.UNPROVIDED, (SubLObject)shop_displayers.UNPROVIDED);
                                    }
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$4, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$2, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri((SubLObject)shop_displayers.UNPROVIDED);
                        }
                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(multibindings.mb_simple_var_term_map(mbind))); shop_displayers.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                            thread.resetMultipleValues();
                            final SubLObject cur_var = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                            final SubLObject entry = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            final SubLObject cur_values = Mapping.mapcar(Symbols.symbol_function((SubLObject)shop_displayers.$sym89$FIRST), entry);
                            final SubLObject el_var = methods.funcall_instance_method_with_1_args(var_manager, (SubLObject)shop_displayers.$sym90$RECOVER_EL, cur_var);
                            final SubLObject el_values = methods.funcall_instance_method_with_1_args(var_manager, (SubLObject)shop_displayers.$sym90$RECOVER_EL, cur_values);
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)shop_displayers.UNPROVIDED);
                            final SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)shop_displayers.T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)shop_displayers.UNPROVIDED);
                                final SubLObject _prev_bind_0_$6 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)shop_displayers.T, thread);
                                    html_utilities.html_princ(el_var);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$6, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)shop_displayers.UNPROVIDED);
                                final SubLObject _prev_bind_0_$7 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)shop_displayers.T, thread);
                                    if (shop_displayers.NIL != list_utilities.singletonP(el_values)) {
                                        cb_utilities.cb_form(el_values.first(), (SubLObject)shop_displayers.UNPROVIDED, (SubLObject)shop_displayers.UNPROVIDED);
                                    }
                                    else {
                                        cb_utilities.cb_form(el_values, (SubLObject)shop_displayers.UNPROVIDED, (SubLObject)shop_displayers.UNPROVIDED);
                                    }
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$7, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$5, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri((SubLObject)shop_displayers.UNPROVIDED);
                        }
                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                    html_utilities.html_newline((SubLObject)shop_displayers.UNPROVIDED);
                }
                Dynamic.sublisp_throw((SubLObject)shop_displayers.$sym87$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD, (SubLObject)shop_displayers.NIL);
            }
            finally {
                final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_displayers.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_html_task_displayer_plan_displayer(self, plan_displayer);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_html_task_displayer_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_displayers.$sym87$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_html_task_displayer_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-displayers.lisp", position = 6542L)
    public static SubLObject html_task_displayer_html_task_page_method(final SubLObject self, final SubLObject style_args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_html_task_displayer_method = (SubLObject)shop_displayers.NIL;
        final SubLObject plan_displayer = get_html_task_displayer_plan_displayer(self);
        final SubLObject task = get_html_task_displayer_task(self);
        try {
            thread.throwStack.push(shop_displayers.$sym94$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD);
            try {
                final SubLObject prepared_form = methods.funcall_instance_method_with_1_args(plan_displayer, (SubLObject)shop_displayers.$sym73$PREPARE_TASK_FOR_DISPLAY, html_task_displayer_formula_method(self));
                final SubLObject title_var = (SubLObject)shop_displayers.$str95$Task_Examiner;
                final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
                try {
                    html_macros.$html_id_space_id_generator$.bind((shop_displayers.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)shop_displayers.UNPROVIDED, (SubLObject)shop_displayers.UNPROVIDED, (SubLObject)shop_displayers.UNPROVIDED), thread);
                    html_utilities.html_markup((SubLObject)shop_displayers.$str96$__DOCTYPE_html_PUBLIC_____W3C__DT);
                    if (shop_displayers.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                        html_utilities.html_source_readability_terpri((SubLObject)shop_displayers.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)shop_displayers.$str97$_meta_http_equiv__X_UA_Compatible);
                    }
                    html_utilities.html_source_readability_terpri((SubLObject)shop_displayers.UNPROVIDED);
                    final SubLObject _prev_bind_0_$8 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
                    try {
                        cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == shop_displayers.$kw98$UNINITIALIZED) ? ConsesLow.list(shop_displayers.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                        html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                        html_macros.html_head_content_type();
                        cb_parameters.cb_head_shortcut_icon();
                        html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                        cyc_file_dependencies.css((SubLObject)shop_displayers.$kw99$CB_CYC);
                        dhtml_macros.html_basic_cb_scripts();
                        if (shop_displayers.NIL != title_var) {
                            html_utilities.html_source_readability_terpri((SubLObject)shop_displayers.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                        }
                        html_complete.html_complete_script();
                        cyc_file_dependencies.css((SubLObject)shop_displayers.$kw100$SAM_AUTOCOMPLETE_CSS);
                        html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)shop_displayers.UNPROVIDED);
                        final SubLObject _prev_bind_0_$9 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                        try {
                            html_macros.$html_inside_bodyP$.bind((SubLObject)shop_displayers.T, thread);
                            html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                            if (shop_displayers.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                                html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)shop_displayers.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)shop_displayers.UNPROVIDED);
                            }
                            html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)shop_displayers.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)shop_displayers.$str102$yui_skin_sam);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)shop_displayers.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)shop_displayers.UNPROVIDED);
                            final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)shop_displayers.T, thread);
                                html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)shop_displayers.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)shop_displayers.$str103$reloadFrameButton);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)shop_displayers.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)shop_displayers.UNPROVIDED);
                                final SubLObject _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)shop_displayers.T, thread);
                                    html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)shop_displayers.UNPROVIDED);
                                    html_utilities.html_markup((SubLObject)shop_displayers.$str104$button);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)shop_displayers.UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)shop_displayers.UNPROVIDED);
                                    html_utilities.html_markup((SubLObject)shop_displayers.$str105$reload);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)shop_displayers.UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)shop_displayers.UNPROVIDED);
                                    html_utilities.html_princ((SubLObject)shop_displayers.$str106$Refresh_Frames);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)shop_displayers.UNPROVIDED);
                                    if (shop_displayers.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                        html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                                    }
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)shop_displayers.UNPROVIDED);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$11, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                                if (shop_displayers.NIL != title_var) {
                                    html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                    html_utilities.html_markup((SubLObject)shop_displayers.TWO_INTEGER);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)shop_displayers.UNPROVIDED);
                                    html_utilities.html_princ(title_var);
                                    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                    html_utilities.html_markup((SubLObject)shop_displayers.TWO_INTEGER);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)shop_displayers.UNPROVIDED);
                                }
                                html_utilities.html_hr((SubLObject)shop_displayers.UNPROVIDED, (SubLObject)shop_displayers.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_utilities.html_princ((SubLObject)shop_displayers.$str107$Task__);
                                html_utilities.html_newline((SubLObject)shop_displayers.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                cb_utilities.cb_form(prepared_form, (SubLObject)shop_displayers.UNPROVIDED, (SubLObject)shop_displayers.UNPROVIDED);
                                html_utilities.html_newline((SubLObject)shop_displayers.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_utilities.html_princ((SubLObject)shop_displayers.$str108$Translation__);
                                html_utilities.html_newline((SubLObject)shop_displayers.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                final SubLObject _prev_bind_0_$12 = pph_vars.$pph_quantify_varsP$.currentBinding(thread);
                                try {
                                    pph_vars.$pph_quantify_varsP$.bind((SubLObject)shop_displayers.NIL, thread);
                                    pph_html.html_text_with_target(prepared_form, (SubLObject)shop_displayers.UNPROVIDED, (SubLObject)shop_displayers.UNPROVIDED, (SubLObject)shop_displayers.UNPROVIDED, (SubLObject)shop_displayers.UNPROVIDED);
                                }
                                finally {
                                    pph_vars.$pph_quantify_varsP$.rebind(_prev_bind_0_$12, thread);
                                }
                                html_utilities.html_newline((SubLObject)shop_displayers.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_utilities.html_princ((SubLObject)shop_displayers.$str109$Assertion__);
                                html_utilities.html_newline((SubLObject)shop_displayers.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                SubLObject planner_rules = shop_basic_plan.shop_basic_task_planner_rule_method(task);
                                if (!planner_rules.isList()) {
                                    planner_rules = (SubLObject)ConsesLow.list(planner_rules);
                                }
                                SubLObject cdolist_list_var = planner_rules;
                                SubLObject cur_rule = (SubLObject)shop_displayers.NIL;
                                cur_rule = cdolist_list_var.first();
                                while (shop_displayers.NIL != cdolist_list_var) {
                                    SubLObject cdolist_list_var_$13 = methods.funcall_instance_method_with_0_args(cur_rule, (SubLObject)shop_displayers.$sym110$ASSERTIONS);
                                    SubLObject cur_assertion = (SubLObject)shop_displayers.NIL;
                                    cur_assertion = cdolist_list_var_$13.first();
                                    while (shop_displayers.NIL != cdolist_list_var_$13) {
                                        cb_utilities.cb_assertion_link(cur_assertion, (SubLObject)shop_displayers.UNPROVIDED);
                                        cdolist_list_var_$13 = cdolist_list_var_$13.rest();
                                        cur_assertion = cdolist_list_var_$13.first();
                                    }
                                    cdolist_list_var = cdolist_list_var.rest();
                                    cur_rule = cdolist_list_var.first();
                                }
                                if (shop_displayers.NIL != html_task_displayer_bindings_method(self)) {
                                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                    html_utilities.html_princ((SubLObject)shop_displayers.$str111$Bindings__);
                                    html_utilities.html_newline((SubLObject)shop_displayers.UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                    html_task_displayer_display_bindings_method(self, style_args);
                                }
                                Dynamic.sublisp_throw((SubLObject)shop_displayers.$sym94$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD, (SubLObject)shop_displayers.NIL);
                                html_utilities.html_source_readability_terpri((SubLObject)shop_displayers.UNPROVIDED);
                                html_utilities.html_copyright_notice();
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$10, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri((SubLObject)shop_displayers.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$9, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                    }
                    finally {
                        cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$8, thread);
                    }
                    html_utilities.html_source_readability_terpri((SubLObject)shop_displayers.UNPROVIDED);
                }
                finally {
                    html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_displayers.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_html_task_displayer_plan_displayer(self, plan_displayer);
                    set_html_task_displayer_task(self, task);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_html_task_displayer_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_displayers.$sym94$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_html_task_displayer_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-displayers.lisp", position = 7721L)
    public static SubLObject html_plan_displayer_initialize_method(final SubLObject self) {
        shop_datastructures.shop_indexed_object_initialize_method(self);
        instances.set_slot(self, (SubLObject)shop_displayers.$sym26$TASK_DISPLAYER_HASH_TABLE, Hashtables.make_hash_table((SubLObject)shop_displayers.TEN_INTEGER, (SubLObject)shop_displayers.UNPROVIDED, (SubLObject)shop_displayers.UNPROVIDED));
        return self;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-displayers.lisp", position = 7968L)
    public static SubLObject html_plan_displayer_init_with_plan_method(final SubLObject self, final SubLObject new_plan, final SubLObject displayer_factory) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_html_plan_displayer_method = (SubLObject)shop_displayers.NIL;
        SubLObject display_variable_substitution = get_html_plan_displayer_display_variable_substitution(self);
        SubLObject open_variables = get_html_plan_displayer_open_variables(self);
        SubLObject mbinding = get_html_plan_displayer_mbinding(self);
        final SubLObject task_displayer_hash_table = get_html_plan_displayer_task_displayer_hash_table(self);
        SubLObject plan = get_html_plan_displayer_plan(self);
        try {
            thread.throwStack.push(shop_displayers.$sym118$OUTER_CATCH_FOR_HTML_PLAN_DISPLAYER_METHOD);
            try {
                plan = new_plan;
                final SubLObject var_manager = instances.get_slot(new_plan, (SubLObject)shop_displayers.$sym88$VARIABLE_MANAGER);
                final SubLObject new_mbinding = instances.get_slot(new_plan, (SubLObject)shop_displayers.$sym80$BINDINGS);
                final SubLObject open_vars = instances.get_slot(new_plan, (SubLObject)shop_displayers.$sym24$OPEN_VARIABLES);
                SubLObject display_sub = (SubLObject)shop_displayers.NIL;
                SubLObject cdolist_list_var = open_vars;
                SubLObject cur_var = (SubLObject)shop_displayers.NIL;
                cur_var = cdolist_list_var.first();
                while (shop_displayers.NIL != cdolist_list_var) {
                    final SubLObject el_var = methods.funcall_instance_method_with_1_args(var_manager, (SubLObject)shop_displayers.$sym119$RECOVER_EL_VARIABLE, cur_var);
                    display_sub = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(cur_var, el_var), display_sub);
                    cdolist_list_var = cdolist_list_var.rest();
                    cur_var = cdolist_list_var.first();
                }
                mbinding = new_mbinding;
                open_variables = open_vars;
                display_variable_substitution = display_sub;
                cdolist_list_var = instances.get_slot(new_plan, (SubLObject)shop_displayers.$sym120$PRE_ORDERING);
                SubLObject step = (SubLObject)shop_displayers.NIL;
                step = cdolist_list_var.first();
                while (shop_displayers.NIL != cdolist_list_var) {
                    final SubLObject task_displayer = methods.funcall_class_method_with_1_args(displayer_factory, (SubLObject)shop_displayers.$sym40$CREATE_TASK_DISPLAYER, step);
                    html_task_displayer_init_with_task_method(task_displayer, step);
                    instances.set_slot(task_displayer, (SubLObject)shop_displayers.$sym11$PLAN_DISPLAYER, self);
                    Hashtables.sethash(step, task_displayer_hash_table, task_displayer);
                    cdolist_list_var = cdolist_list_var.rest();
                    step = cdolist_list_var.first();
                }
                Dynamic.sublisp_throw((SubLObject)shop_displayers.$sym118$OUTER_CATCH_FOR_HTML_PLAN_DISPLAYER_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_displayers.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_html_plan_displayer_display_variable_substitution(self, display_variable_substitution);
                    set_html_plan_displayer_open_variables(self, open_variables);
                    set_html_plan_displayer_mbinding(self, mbinding);
                    set_html_plan_displayer_task_displayer_hash_table(self, task_displayer_hash_table);
                    set_html_plan_displayer_plan(self, plan);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_html_plan_displayer_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_displayers.$sym118$OUTER_CATCH_FOR_HTML_PLAN_DISPLAYER_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_html_plan_displayer_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-displayers.lisp", position = 9065L)
    public static SubLObject html_plan_displayer_prepare_task_for_display_method(final SubLObject self, final SubLObject task) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_html_plan_displayer_method = (SubLObject)shop_displayers.NIL;
        final SubLObject plan = get_html_plan_displayer_plan(self);
        try {
            thread.throwStack.push(shop_displayers.$sym123$OUTER_CATCH_FOR_HTML_PLAN_DISPLAYER_METHOD);
            try {
                final SubLObject new_task = conses_high.sublis(instances.get_slot(plan, (SubLObject)shop_displayers.$sym124$SIMPLE_BINDING_LIST), task, (SubLObject)shop_displayers.UNPROVIDED, (SubLObject)shop_displayers.UNPROVIDED);
                final SubLObject var_manager = instances.get_slot(plan, (SubLObject)shop_displayers.$sym88$VARIABLE_MANAGER);
                Dynamic.sublisp_throw((SubLObject)shop_displayers.$sym123$OUTER_CATCH_FOR_HTML_PLAN_DISPLAYER_METHOD, methods.funcall_instance_method_with_1_args(var_manager, (SubLObject)shop_displayers.$sym90$RECOVER_EL, new_task));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_displayers.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_html_plan_displayer_plan(self, plan);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_html_plan_displayer_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_displayers.$sym123$OUTER_CATCH_FOR_HTML_PLAN_DISPLAYER_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_html_plan_displayer_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-displayers.lisp", position = 9373L)
    public static SubLObject html_plan_displayer_html_hierarchical_form_method(final SubLObject self, final SubLObject style_args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_html_plan_displayer_method = (SubLObject)shop_displayers.NIL;
        final SubLObject task_displayer_hash_table = get_html_plan_displayer_task_displayer_hash_table(self);
        final SubLObject plan = get_html_plan_displayer_plan(self);
        try {
            thread.throwStack.push(shop_displayers.$sym128$OUTER_CATCH_FOR_HTML_PLAN_DISPLAYER_METHOD);
            try {
                final SubLObject pre = Sequences.reverse(instances.get_slot(plan, (SubLObject)shop_displayers.$sym120$PRE_ORDERING));
                final SubLObject post = instances.get_slot(plan, (SubLObject)shop_displayers.$sym129$POST_ORDERING);
                html_utilities.html_newline((SubLObject)shop_displayers.TWO_INTEGER);
                SubLObject stack = (SubLObject)shop_displayers.NIL;
                SubLObject indent_count = (SubLObject)shop_displayers.ZERO_INTEGER;
                SubLObject cur_pre;
                SubLObject step;
                SubLObject next;
                SubLObject cur_task;
                for (cur_pre = (SubLObject)shop_displayers.NIL, cur_pre = pre; shop_displayers.NIL != cur_pre; cur_pre = cur_pre.rest()) {
                    step = cur_pre.first();
                    next = conses_high.second(cur_pre);
                    while (shop_displayers.NIL == shop_basic_plan.ppo_tree_descendantP(pre, post, step, stack.first(), Symbols.symbol_function((SubLObject)shop_displayers.EQUAL)) && shop_displayers.NIL != stack) {
                        indent_count = Numbers.subtract(indent_count, (SubLObject)shop_displayers.ONE_INTEGER);
                        stack = stack.rest();
                    }
                    cur_task = Hashtables.gethash(step, task_displayer_hash_table, (SubLObject)shop_displayers.UNPROVIDED);
                    html_utilities.html_indent(Numbers.multiply((SubLObject)shop_displayers.FIVE_INTEGER, indent_count));
                    html_task_displayer_html_form_method(cur_task, style_args);
                    html_utilities.html_newline((SubLObject)shop_displayers.UNPROVIDED);
                    if (shop_displayers.NIL != shop_basic_plan.ppo_tree_descendantP(pre, post, next, step, Symbols.symbol_function((SubLObject)shop_displayers.EQUAL))) {
                        indent_count = Numbers.add(indent_count, (SubLObject)shop_displayers.ONE_INTEGER);
                        stack = (SubLObject)ConsesLow.cons(step, stack);
                    }
                }
                Dynamic.sublisp_throw((SubLObject)shop_displayers.$sym128$OUTER_CATCH_FOR_HTML_PLAN_DISPLAYER_METHOD, (SubLObject)shop_displayers.NIL);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_displayers.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_html_plan_displayer_task_displayer_hash_table(self, task_displayer_hash_table);
                    set_html_plan_displayer_plan(self, plan);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_html_plan_displayer_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_displayers.$sym128$OUTER_CATCH_FOR_HTML_PLAN_DISPLAYER_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_html_plan_displayer_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-displayers.lisp", position = 9963L)
    public static SubLObject html_plan_displayer_html_primitive_form_method(final SubLObject self, final SubLObject style_args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_html_plan_displayer_method = (SubLObject)shop_displayers.NIL;
        final SubLObject plan = get_html_plan_displayer_plan(self);
        try {
            thread.throwStack.push(shop_displayers.$sym133$OUTER_CATCH_FOR_HTML_PLAN_DISPLAYER_METHOD);
            try {
                SubLObject step_display_form = (SubLObject)shop_displayers.NIL;
                html_utilities.html_newline((SubLObject)shop_displayers.TWO_INTEGER);
                SubLObject list_var = (SubLObject)shop_displayers.NIL;
                SubLObject step = (SubLObject)shop_displayers.NIL;
                SubLObject num = (SubLObject)shop_displayers.NIL;
                list_var = methods.funcall_instance_method_with_0_args(plan, (SubLObject)shop_displayers.$sym134$PRIMITIVE_FORM);
                step = list_var.first();
                for (num = (SubLObject)shop_displayers.ZERO_INTEGER; shop_displayers.NIL != list_var; list_var = list_var.rest(), step = list_var.first(), num = Numbers.add((SubLObject)shop_displayers.ONE_INTEGER, num)) {
                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    html_utilities.html_princ((SubLObject)shop_displayers.$str135$__Step_);
                    html_utilities.html_prin1(number_utilities.f_1X(num));
                    html_utilities.html_princ((SubLObject)shop_displayers.$str136$___);
                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                    step_display_form = html_plan_displayer_prepare_task_for_display_method(self, step);
                    if (shop_displayers.NIL != subl_promotions.memberP((SubLObject)shop_displayers.$kw75$CYCL, style_args, (SubLObject)shop_displayers.UNPROVIDED, (SubLObject)shop_displayers.UNPROVIDED)) {
                        cb_utilities.cb_form(step_display_form, (SubLObject)shop_displayers.UNPROVIDED, (SubLObject)shop_displayers.UNPROVIDED);
                    }
                    else {
                        final SubLObject _prev_bind_0 = pph_vars.$pph_quantify_varsP$.currentBinding(thread);
                        try {
                            pph_vars.$pph_quantify_varsP$.bind((SubLObject)shop_displayers.NIL, thread);
                            pph_html.html_text_with_target(step_display_form, (SubLObject)shop_displayers.UNPROVIDED, (SubLObject)shop_displayers.UNPROVIDED, (SubLObject)shop_displayers.UNPROVIDED, (SubLObject)shop_displayers.UNPROVIDED);
                        }
                        finally {
                            pph_vars.$pph_quantify_varsP$.rebind(_prev_bind_0, thread);
                        }
                    }
                    html_utilities.html_newline((SubLObject)shop_displayers.UNPROVIDED);
                }
                Dynamic.sublisp_throw((SubLObject)shop_displayers.$sym133$OUTER_CATCH_FOR_HTML_PLAN_DISPLAYER_METHOD, (SubLObject)shop_displayers.NIL);
            }
            finally {
                final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_displayers.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_html_plan_displayer_plan(self, plan);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_html_plan_displayer_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_displayers.$sym133$OUTER_CATCH_FOR_HTML_PLAN_DISPLAYER_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_html_plan_displayer_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-displayers.lisp", position = 10576L)
    public static SubLObject html_plan_displayer_html_multibinding_values_method(final SubLObject self, final SubLObject var, final SubLObject style_args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_html_plan_displayer_method = (SubLObject)shop_displayers.NIL;
        final SubLObject mbinding = get_html_plan_displayer_mbinding(self);
        final SubLObject plan = get_html_plan_displayer_plan(self);
        try {
            thread.throwStack.push(shop_displayers.$sym141$OUTER_CATCH_FOR_HTML_PLAN_DISPLAYER_METHOD);
            try {
                final SubLObject el_var = methods.funcall_instance_method_with_1_args(methods.funcall_instance_method_with_0_args(plan, (SubLObject)shop_displayers.$sym88$VARIABLE_MANAGER), (SubLObject)shop_displayers.$sym119$RECOVER_EL_VARIABLE, var);
                final SubLObject values = multibindings.mb_var_values(var, mbinding);
                if (shop_displayers.NIL != values) {
                    if (shop_displayers.NIL != subl_promotions.memberP((SubLObject)shop_displayers.$kw75$CYCL, style_args, (SubLObject)shop_displayers.UNPROVIDED, (SubLObject)shop_displayers.UNPROVIDED)) {
                        cb_utilities.cb_form(el_var, (SubLObject)shop_displayers.UNPROVIDED, (SubLObject)shop_displayers.UNPROVIDED);
                    }
                    else {
                        pph_html.html_phrase_with_target(el_var, (SubLObject)shop_displayers.UNPROVIDED, (SubLObject)shop_displayers.UNPROVIDED);
                    }
                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    html_utilities.html_indent((SubLObject)shop_displayers.THREE_INTEGER);
                    html_utilities.html_princ((SubLObject)shop_displayers.$str142$is_one_of);
                    html_utilities.html_indent((SubLObject)shop_displayers.THREE_INTEGER);
                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                    pph_html.html_phrase_with_target(values.first(), (SubLObject)shop_displayers.UNPROVIDED, (SubLObject)shop_displayers.UNPROVIDED);
                    SubLObject cdolist_list_var = values.rest();
                    SubLObject cur_val = (SubLObject)shop_displayers.NIL;
                    cur_val = cdolist_list_var.first();
                    while (shop_displayers.NIL != cdolist_list_var) {
                        html_utilities.html_princ((SubLObject)shop_displayers.$str143$_);
                        html_utilities.html_indent((SubLObject)shop_displayers.TWO_INTEGER);
                        pph_html.html_phrase_with_target(cur_val, (SubLObject)shop_displayers.UNPROVIDED, (SubLObject)shop_displayers.UNPROVIDED);
                        cdolist_list_var = cdolist_list_var.rest();
                        cur_val = cdolist_list_var.first();
                    }
                    html_utilities.html_newline((SubLObject)shop_displayers.UNPROVIDED);
                }
                Dynamic.sublisp_throw((SubLObject)shop_displayers.$sym141$OUTER_CATCH_FOR_HTML_PLAN_DISPLAYER_METHOD, (SubLObject)shop_displayers.NIL);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_displayers.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_html_plan_displayer_mbinding(self, mbinding);
                    set_html_plan_displayer_plan(self, plan);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_html_plan_displayer_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_displayers.$sym141$OUTER_CATCH_FOR_HTML_PLAN_DISPLAYER_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_html_plan_displayer_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-displayers.lisp", position = 11318L)
    public static SubLObject html_plan_displayer_html_mbinding_form_method(final SubLObject self, final SubLObject style_args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_html_plan_displayer_method = (SubLObject)shop_displayers.NIL;
        final SubLObject open_variables = get_html_plan_displayer_open_variables(self);
        try {
            thread.throwStack.push(shop_displayers.$sym147$OUTER_CATCH_FOR_HTML_PLAN_DISPLAYER_METHOD);
            try {
                if (shop_displayers.NIL != open_variables) {
                    html_utilities.html_newline((SubLObject)shop_displayers.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    html_utilities.html_princ((SubLObject)shop_displayers.$str148$for_any_of_the_following_values__);
                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                    html_utilities.html_newline((SubLObject)shop_displayers.TWO_INTEGER);
                    SubLObject cdolist_list_var = open_variables;
                    SubLObject cur_var = (SubLObject)shop_displayers.NIL;
                    cur_var = cdolist_list_var.first();
                    while (shop_displayers.NIL != cdolist_list_var) {
                        html_plan_displayer_html_multibinding_values_method(self, cur_var, style_args);
                        cdolist_list_var = cdolist_list_var.rest();
                        cur_var = cdolist_list_var.first();
                    }
                    html_utilities.html_newline((SubLObject)shop_displayers.UNPROVIDED);
                }
                Dynamic.sublisp_throw((SubLObject)shop_displayers.$sym147$OUTER_CATCH_FOR_HTML_PLAN_DISPLAYER_METHOD, (SubLObject)shop_displayers.NIL);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_displayers.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_html_plan_displayer_open_variables(self, open_variables);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_html_plan_displayer_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_displayers.$sym147$OUTER_CATCH_FOR_HTML_PLAN_DISPLAYER_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_html_plan_displayer_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-displayers.lisp", position = 11763L)
    public static SubLObject html_plan_displayer_html_form_method(final SubLObject self, final SubLObject style_args) {
        if (shop_displayers.NIL != subl_promotions.memberP((SubLObject)shop_displayers.$kw151$PRIMITIVE, style_args, (SubLObject)shop_displayers.UNPROVIDED, (SubLObject)shop_displayers.UNPROVIDED)) {
            html_plan_displayer_html_primitive_form_method(self, style_args);
        }
        else {
            html_plan_displayer_html_hierarchical_form_method(self, style_args);
        }
        html_plan_displayer_html_mbinding_form_method(self, style_args);
        return (SubLObject)shop_displayers.NIL;
    }
    
    public static SubLObject declare_shop_displayers_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_displayers", "get_html_task_displayer_plan_displayer", "GET-HTML-TASK-DISPLAYER-PLAN-DISPLAYER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_displayers", "set_html_task_displayer_plan_displayer", "SET-HTML-TASK-DISPLAYER-PLAN-DISPLAYER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_displayers", "get_html_task_displayer_task", "GET-HTML-TASK-DISPLAYER-TASK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_displayers", "set_html_task_displayer_task", "SET-HTML-TASK-DISPLAYER-TASK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_displayers", "subloop_reserved_initialize_html_task_displayer_class", "SUBLOOP-RESERVED-INITIALIZE-HTML-TASK-DISPLAYER-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_displayers", "subloop_reserved_initialize_html_task_displayer_instance", "SUBLOOP-RESERVED-INITIALIZE-HTML-TASK-DISPLAYER-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_displayers", "html_task_displayer_p", "HTML-TASK-DISPLAYER-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_displayers", "get_html_plan_displayer_display_variable_substitution", "GET-HTML-PLAN-DISPLAYER-DISPLAY-VARIABLE-SUBSTITUTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_displayers", "set_html_plan_displayer_display_variable_substitution", "SET-HTML-PLAN-DISPLAYER-DISPLAY-VARIABLE-SUBSTITUTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_displayers", "get_html_plan_displayer_open_variables", "GET-HTML-PLAN-DISPLAYER-OPEN-VARIABLES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_displayers", "set_html_plan_displayer_open_variables", "SET-HTML-PLAN-DISPLAYER-OPEN-VARIABLES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_displayers", "get_html_plan_displayer_mbinding", "GET-HTML-PLAN-DISPLAYER-MBINDING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_displayers", "set_html_plan_displayer_mbinding", "SET-HTML-PLAN-DISPLAYER-MBINDING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_displayers", "get_html_plan_displayer_task_displayer_hash_table", "GET-HTML-PLAN-DISPLAYER-TASK-DISPLAYER-HASH-TABLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_displayers", "set_html_plan_displayer_task_displayer_hash_table", "SET-HTML-PLAN-DISPLAYER-TASK-DISPLAYER-HASH-TABLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_displayers", "get_html_plan_displayer_plan", "GET-HTML-PLAN-DISPLAYER-PLAN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_displayers", "set_html_plan_displayer_plan", "SET-HTML-PLAN-DISPLAYER-PLAN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_displayers", "subloop_reserved_initialize_html_plan_displayer_class", "SUBLOOP-RESERVED-INITIALIZE-HTML-PLAN-DISPLAYER-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_displayers", "subloop_reserved_initialize_html_plan_displayer_instance", "SUBLOOP-RESERVED-INITIALIZE-HTML-PLAN-DISPLAYER-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_displayers", "html_plan_displayer_p", "HTML-PLAN-DISPLAYER-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_displayers", "subloop_reserved_initialize_cyc_development_plan_displayer_factory_class", "SUBLOOP-RESERVED-INITIALIZE-CYC-DEVELOPMENT-PLAN-DISPLAYER-FACTORY-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_displayers", "subloop_reserved_initialize_cyc_development_plan_displayer_factory_instance", "SUBLOOP-RESERVED-INITIALIZE-CYC-DEVELOPMENT-PLAN-DISPLAYER-FACTORY-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_displayers", "cyc_development_plan_displayer_factory_p", "CYC-DEVELOPMENT-PLAN-DISPLAYER-FACTORY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_displayers", "cyc_development_plan_displayer_factory_create_plan_displayer_method", "CYC-DEVELOPMENT-PLAN-DISPLAYER-FACTORY-CREATE-PLAN-DISPLAYER-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_displayers", "cyc_development_plan_displayer_factory_create_task_displayer_method", "CYC-DEVELOPMENT-PLAN-DISPLAYER-FACTORY-CREATE-TASK-DISPLAYER-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_displayers", "html_task_displayer_initialize_method", "HTML-TASK-DISPLAYER-INITIALIZE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_displayers", "html_task_displayer_init_with_task_method", "HTML-TASK-DISPLAYER-INIT-WITH-TASK-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_displayers", "html_task_displayer_find_instance_by_id_string_method", "HTML-TASK-DISPLAYER-FIND-INSTANCE-BY-ID-STRING-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_displayers", "html_task_displayer_task_examiner_link_image_method", "HTML-TASK-DISPLAYER-TASK-EXAMINER-LINK-IMAGE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_displayers", "html_task_displayer_cb_task_examiner_link_method", "HTML-TASK-DISPLAYER-CB-TASK-EXAMINER-LINK-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_displayers", "html_task_displayer_html_form_method", "HTML-TASK-DISPLAYER-HTML-FORM-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_displayers", "html_task_displayer_formula_method", "HTML-TASK-DISPLAYER-FORMULA-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_displayers", "html_task_displayer_bindings_method", "HTML-TASK-DISPLAYER-BINDINGS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_displayers", "html_task_displayer_display_bindings_method", "HTML-TASK-DISPLAYER-DISPLAY-BINDINGS-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_displayers", "html_task_displayer_html_task_page_method", "HTML-TASK-DISPLAYER-HTML-TASK-PAGE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_displayers", "html_plan_displayer_initialize_method", "HTML-PLAN-DISPLAYER-INITIALIZE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_displayers", "html_plan_displayer_init_with_plan_method", "HTML-PLAN-DISPLAYER-INIT-WITH-PLAN-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_displayers", "html_plan_displayer_prepare_task_for_display_method", "HTML-PLAN-DISPLAYER-PREPARE-TASK-FOR-DISPLAY-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_displayers", "html_plan_displayer_html_hierarchical_form_method", "HTML-PLAN-DISPLAYER-HTML-HIERARCHICAL-FORM-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_displayers", "html_plan_displayer_html_primitive_form_method", "HTML-PLAN-DISPLAYER-HTML-PRIMITIVE-FORM-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_displayers", "html_plan_displayer_html_multibinding_values_method", "HTML-PLAN-DISPLAYER-HTML-MULTIBINDING-VALUES-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_displayers", "html_plan_displayer_html_mbinding_form_method", "HTML-PLAN-DISPLAYER-HTML-MBINDING-FORM-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_displayers", "html_plan_displayer_html_form_method", "HTML-PLAN-DISPLAYER-HTML-FORM-METHOD", 2, 0, false);
        return (SubLObject)shop_displayers.NIL;
    }
    
    public static SubLObject init_shop_displayers_file() {
        shop_displayers.$cb_plan_task_examiner_link_image$ = SubLFiles.deflexical("*CB-PLAN-TASK-EXAMINER-LINK-IMAGE*", (SubLObject)shop_displayers.$kw0$TE_LINK);
        shop_displayers.$cb_plan_task_examiner_method_image$ = SubLFiles.deflexical("*CB-PLAN-TASK-EXAMINER-METHOD-IMAGE*", (SubLObject)shop_displayers.$kw2$TE_METHOD);
        shop_displayers.$cb_plan_task_examiner_operator_image$ = SubLFiles.deflexical("*CB-PLAN-TASK-EXAMINER-OPERATOR-IMAGE*", (SubLObject)shop_displayers.$kw4$TE_OPERATOR);
        shop_displayers.$cb_plan_task_examiner_scond_image$ = SubLFiles.deflexical("*CB-PLAN-TASK-EXAMINER-SCOND-IMAGE*", (SubLObject)shop_displayers.$kw6$TE_EXAMINER);
        return (SubLObject)shop_displayers.NIL;
    }
    
    public static SubLObject setup_shop_displayers_file() {
        Hashtables.sethash((SubLObject)shop_displayers.$kw0$TE_LINK, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)shop_displayers.$str1$bl_sdi_gif, (SubLObject)shop_displayers.NIL));
        Hashtables.sethash((SubLObject)shop_displayers.$kw2$TE_METHOD, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)shop_displayers.$str3$gr_sdi_gif, (SubLObject)shop_displayers.NIL));
        Hashtables.sethash((SubLObject)shop_displayers.$kw4$TE_OPERATOR, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)shop_displayers.$str5$yl_sdi_gif, (SubLObject)shop_displayers.NIL));
        Hashtables.sethash((SubLObject)shop_displayers.$kw6$TE_EXAMINER, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)shop_displayers.$str7$red_diam_gif, (SubLObject)shop_displayers.NIL));
        classes.subloop_new_class((SubLObject)shop_displayers.$sym8$HTML_TASK_DISPLAYER, (SubLObject)shop_displayers.$sym9$SHOP_INDEXED_OBJECT, (SubLObject)shop_displayers.NIL, (SubLObject)shop_displayers.NIL, (SubLObject)shop_displayers.$list10);
        classes.class_set_implements_slot_listeners((SubLObject)shop_displayers.$sym8$HTML_TASK_DISPLAYER, (SubLObject)shop_displayers.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)shop_displayers.$sym8$HTML_TASK_DISPLAYER, (SubLObject)shop_displayers.$sym16$SUBLOOP_RESERVED_INITIALIZE_HTML_TASK_DISPLAYER_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)shop_displayers.$sym8$HTML_TASK_DISPLAYER, (SubLObject)shop_displayers.$sym19$SUBLOOP_RESERVED_INITIALIZE_HTML_TASK_DISPLAYER_INSTANCE);
        subloop_reserved_initialize_html_task_displayer_class((SubLObject)shop_displayers.$sym8$HTML_TASK_DISPLAYER);
        classes.subloop_new_class((SubLObject)shop_displayers.$sym20$HTML_PLAN_DISPLAYER, (SubLObject)shop_displayers.$sym9$SHOP_INDEXED_OBJECT, (SubLObject)shop_displayers.$list21, (SubLObject)shop_displayers.NIL, (SubLObject)shop_displayers.$list22);
        classes.class_set_implements_slot_listeners((SubLObject)shop_displayers.$sym20$HTML_PLAN_DISPLAYER, (SubLObject)shop_displayers.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)shop_displayers.$sym20$HTML_PLAN_DISPLAYER, (SubLObject)shop_displayers.$sym28$SUBLOOP_RESERVED_INITIALIZE_HTML_PLAN_DISPLAYER_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)shop_displayers.$sym20$HTML_PLAN_DISPLAYER, (SubLObject)shop_displayers.$sym29$SUBLOOP_RESERVED_INITIALIZE_HTML_PLAN_DISPLAYER_INSTANCE);
        subloop_reserved_initialize_html_plan_displayer_class((SubLObject)shop_displayers.$sym20$HTML_PLAN_DISPLAYER);
        classes.subloop_new_class((SubLObject)shop_displayers.$sym30$CYC_DEVELOPMENT_PLAN_DISPLAYER_FACTORY, (SubLObject)shop_displayers.$sym31$SHOP_PLAN_DISPLAYER_FACTORY, (SubLObject)shop_displayers.NIL, (SubLObject)shop_displayers.NIL, (SubLObject)shop_displayers.NIL);
        classes.class_set_implements_slot_listeners((SubLObject)shop_displayers.$sym30$CYC_DEVELOPMENT_PLAN_DISPLAYER_FACTORY, (SubLObject)shop_displayers.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)shop_displayers.$sym30$CYC_DEVELOPMENT_PLAN_DISPLAYER_FACTORY, (SubLObject)shop_displayers.$sym32$SUBLOOP_RESERVED_INITIALIZE_CYC_DEVELOPMENT_PLAN_DISPLAYER_FACTOR);
        classes.subloop_note_instance_initialization_function((SubLObject)shop_displayers.$sym30$CYC_DEVELOPMENT_PLAN_DISPLAYER_FACTORY, (SubLObject)shop_displayers.$sym33$SUBLOOP_RESERVED_INITIALIZE_CYC_DEVELOPMENT_PLAN_DISPLAYER_FACTOR);
        subloop_reserved_initialize_cyc_development_plan_displayer_factory_class((SubLObject)shop_displayers.$sym30$CYC_DEVELOPMENT_PLAN_DISPLAYER_FACTORY);
        methods.methods_incorporate_class_method((SubLObject)shop_displayers.$sym34$CREATE_PLAN_DISPLAYER, (SubLObject)shop_displayers.$sym30$CYC_DEVELOPMENT_PLAN_DISPLAYER_FACTORY, (SubLObject)shop_displayers.$list35, (SubLObject)shop_displayers.$list36, (SubLObject)shop_displayers.$list37);
        methods.subloop_register_class_method((SubLObject)shop_displayers.$sym30$CYC_DEVELOPMENT_PLAN_DISPLAYER_FACTORY, (SubLObject)shop_displayers.$sym34$CREATE_PLAN_DISPLAYER, (SubLObject)shop_displayers.$sym39$CYC_DEVELOPMENT_PLAN_DISPLAYER_FACTORY_CREATE_PLAN_DISPLAYER_METH);
        methods.methods_incorporate_class_method((SubLObject)shop_displayers.$sym40$CREATE_TASK_DISPLAYER, (SubLObject)shop_displayers.$sym30$CYC_DEVELOPMENT_PLAN_DISPLAYER_FACTORY, (SubLObject)shop_displayers.$list35, (SubLObject)shop_displayers.$list41, (SubLObject)shop_displayers.$list42);
        methods.subloop_register_class_method((SubLObject)shop_displayers.$sym30$CYC_DEVELOPMENT_PLAN_DISPLAYER_FACTORY, (SubLObject)shop_displayers.$sym40$CREATE_TASK_DISPLAYER, (SubLObject)shop_displayers.$sym43$CYC_DEVELOPMENT_PLAN_DISPLAYER_FACTORY_CREATE_TASK_DISPLAYER_METH);
        methods.methods_incorporate_instance_method((SubLObject)shop_displayers.$sym44$INITIALIZE, (SubLObject)shop_displayers.$sym8$HTML_TASK_DISPLAYER, (SubLObject)shop_displayers.$list45, (SubLObject)shop_displayers.NIL, (SubLObject)shop_displayers.$list46);
        methods.subloop_register_instance_method((SubLObject)shop_displayers.$sym8$HTML_TASK_DISPLAYER, (SubLObject)shop_displayers.$sym44$INITIALIZE, (SubLObject)shop_displayers.$sym47$HTML_TASK_DISPLAYER_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_displayers.$sym48$INIT_WITH_TASK, (SubLObject)shop_displayers.$sym8$HTML_TASK_DISPLAYER, (SubLObject)shop_displayers.$list35, (SubLObject)shop_displayers.$list49, (SubLObject)shop_displayers.$list50);
        methods.subloop_register_instance_method((SubLObject)shop_displayers.$sym8$HTML_TASK_DISPLAYER, (SubLObject)shop_displayers.$sym48$INIT_WITH_TASK, (SubLObject)shop_displayers.$sym52$HTML_TASK_DISPLAYER_INIT_WITH_TASK_METHOD);
        methods.methods_incorporate_class_method((SubLObject)shop_displayers.$sym53$FIND_INSTANCE_BY_ID_STRING, (SubLObject)shop_displayers.$sym8$HTML_TASK_DISPLAYER, (SubLObject)shop_displayers.$list35, (SubLObject)shop_displayers.$list54, (SubLObject)shop_displayers.$list55);
        methods.subloop_register_class_method((SubLObject)shop_displayers.$sym8$HTML_TASK_DISPLAYER, (SubLObject)shop_displayers.$sym53$FIND_INSTANCE_BY_ID_STRING, (SubLObject)shop_displayers.$sym56$HTML_TASK_DISPLAYER_FIND_INSTANCE_BY_ID_STRING_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_displayers.$sym57$TASK_EXAMINER_LINK_IMAGE, (SubLObject)shop_displayers.$sym8$HTML_TASK_DISPLAYER, (SubLObject)shop_displayers.$list45, (SubLObject)shop_displayers.NIL, (SubLObject)shop_displayers.$list58);
        methods.subloop_register_instance_method((SubLObject)shop_displayers.$sym8$HTML_TASK_DISPLAYER, (SubLObject)shop_displayers.$sym57$TASK_EXAMINER_LINK_IMAGE, (SubLObject)shop_displayers.$sym61$HTML_TASK_DISPLAYER_TASK_EXAMINER_LINK_IMAGE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_displayers.$sym62$CB_TASK_EXAMINER_LINK, (SubLObject)shop_displayers.$sym8$HTML_TASK_DISPLAYER, (SubLObject)shop_displayers.$list45, (SubLObject)shop_displayers.NIL, (SubLObject)shop_displayers.$list63);
        methods.subloop_register_instance_method((SubLObject)shop_displayers.$sym8$HTML_TASK_DISPLAYER, (SubLObject)shop_displayers.$sym62$CB_TASK_EXAMINER_LINK, (SubLObject)shop_displayers.$sym67$HTML_TASK_DISPLAYER_CB_TASK_EXAMINER_LINK_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_displayers.$sym68$HTML_FORM, (SubLObject)shop_displayers.$sym8$HTML_TASK_DISPLAYER, (SubLObject)shop_displayers.$list35, (SubLObject)shop_displayers.$list69, (SubLObject)shop_displayers.$list70);
        methods.subloop_register_instance_method((SubLObject)shop_displayers.$sym8$HTML_TASK_DISPLAYER, (SubLObject)shop_displayers.$sym68$HTML_FORM, (SubLObject)shop_displayers.$sym76$HTML_TASK_DISPLAYER_HTML_FORM_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_displayers.$sym74$FORMULA, (SubLObject)shop_displayers.$sym8$HTML_TASK_DISPLAYER, (SubLObject)shop_displayers.$list35, (SubLObject)shop_displayers.NIL, (SubLObject)shop_displayers.$list77);
        methods.subloop_register_instance_method((SubLObject)shop_displayers.$sym8$HTML_TASK_DISPLAYER, (SubLObject)shop_displayers.$sym74$FORMULA, (SubLObject)shop_displayers.$sym79$HTML_TASK_DISPLAYER_FORMULA_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_displayers.$sym80$BINDINGS, (SubLObject)shop_displayers.$sym8$HTML_TASK_DISPLAYER, (SubLObject)shop_displayers.$list35, (SubLObject)shop_displayers.NIL, (SubLObject)shop_displayers.$list81);
        methods.subloop_register_instance_method((SubLObject)shop_displayers.$sym8$HTML_TASK_DISPLAYER, (SubLObject)shop_displayers.$sym80$BINDINGS, (SubLObject)shop_displayers.$sym83$HTML_TASK_DISPLAYER_BINDINGS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_displayers.$sym84$DISPLAY_BINDINGS, (SubLObject)shop_displayers.$sym8$HTML_TASK_DISPLAYER, (SubLObject)shop_displayers.$list85, (SubLObject)shop_displayers.$list69, (SubLObject)shop_displayers.$list86);
        methods.subloop_register_instance_method((SubLObject)shop_displayers.$sym8$HTML_TASK_DISPLAYER, (SubLObject)shop_displayers.$sym84$DISPLAY_BINDINGS, (SubLObject)shop_displayers.$sym91$HTML_TASK_DISPLAYER_DISPLAY_BINDINGS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_displayers.$sym92$HTML_TASK_PAGE, (SubLObject)shop_displayers.$sym8$HTML_TASK_DISPLAYER, (SubLObject)shop_displayers.$list35, (SubLObject)shop_displayers.$list69, (SubLObject)shop_displayers.$list93);
        methods.subloop_register_instance_method((SubLObject)shop_displayers.$sym8$HTML_TASK_DISPLAYER, (SubLObject)shop_displayers.$sym92$HTML_TASK_PAGE, (SubLObject)shop_displayers.$sym112$HTML_TASK_DISPLAYER_HTML_TASK_PAGE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_displayers.$sym44$INITIALIZE, (SubLObject)shop_displayers.$sym20$HTML_PLAN_DISPLAYER, (SubLObject)shop_displayers.$list113, (SubLObject)shop_displayers.NIL, (SubLObject)shop_displayers.$list114);
        methods.subloop_register_instance_method((SubLObject)shop_displayers.$sym20$HTML_PLAN_DISPLAYER, (SubLObject)shop_displayers.$sym44$INITIALIZE, (SubLObject)shop_displayers.$sym115$HTML_PLAN_DISPLAYER_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_displayers.$sym38$INIT_WITH_PLAN, (SubLObject)shop_displayers.$sym20$HTML_PLAN_DISPLAYER, (SubLObject)shop_displayers.$list35, (SubLObject)shop_displayers.$list116, (SubLObject)shop_displayers.$list117);
        methods.subloop_register_instance_method((SubLObject)shop_displayers.$sym20$HTML_PLAN_DISPLAYER, (SubLObject)shop_displayers.$sym38$INIT_WITH_PLAN, (SubLObject)shop_displayers.$sym121$HTML_PLAN_DISPLAYER_INIT_WITH_PLAN_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_displayers.$sym73$PREPARE_TASK_FOR_DISPLAY, (SubLObject)shop_displayers.$sym20$HTML_PLAN_DISPLAYER, (SubLObject)shop_displayers.$list45, (SubLObject)shop_displayers.$list41, (SubLObject)shop_displayers.$list122);
        methods.subloop_register_instance_method((SubLObject)shop_displayers.$sym20$HTML_PLAN_DISPLAYER, (SubLObject)shop_displayers.$sym73$PREPARE_TASK_FOR_DISPLAY, (SubLObject)shop_displayers.$sym125$HTML_PLAN_DISPLAYER_PREPARE_TASK_FOR_DISPLAY_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_displayers.$sym126$HTML_HIERARCHICAL_FORM, (SubLObject)shop_displayers.$sym20$HTML_PLAN_DISPLAYER, (SubLObject)shop_displayers.$list45, (SubLObject)shop_displayers.$list69, (SubLObject)shop_displayers.$list127);
        methods.subloop_register_instance_method((SubLObject)shop_displayers.$sym20$HTML_PLAN_DISPLAYER, (SubLObject)shop_displayers.$sym126$HTML_HIERARCHICAL_FORM, (SubLObject)shop_displayers.$sym130$HTML_PLAN_DISPLAYER_HTML_HIERARCHICAL_FORM_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_displayers.$sym131$HTML_PRIMITIVE_FORM, (SubLObject)shop_displayers.$sym20$HTML_PLAN_DISPLAYER, (SubLObject)shop_displayers.$list85, (SubLObject)shop_displayers.$list69, (SubLObject)shop_displayers.$list132);
        methods.subloop_register_instance_method((SubLObject)shop_displayers.$sym20$HTML_PLAN_DISPLAYER, (SubLObject)shop_displayers.$sym131$HTML_PRIMITIVE_FORM, (SubLObject)shop_displayers.$sym137$HTML_PLAN_DISPLAYER_HTML_PRIMITIVE_FORM_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_displayers.$sym138$HTML_MULTIBINDING_VALUES, (SubLObject)shop_displayers.$sym20$HTML_PLAN_DISPLAYER, (SubLObject)shop_displayers.$list45, (SubLObject)shop_displayers.$list139, (SubLObject)shop_displayers.$list140);
        methods.subloop_register_instance_method((SubLObject)shop_displayers.$sym20$HTML_PLAN_DISPLAYER, (SubLObject)shop_displayers.$sym138$HTML_MULTIBINDING_VALUES, (SubLObject)shop_displayers.$sym144$HTML_PLAN_DISPLAYER_HTML_MULTIBINDING_VALUES_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_displayers.$sym145$HTML_MBINDING_FORM, (SubLObject)shop_displayers.$sym20$HTML_PLAN_DISPLAYER, (SubLObject)shop_displayers.$list45, (SubLObject)shop_displayers.$list69, (SubLObject)shop_displayers.$list146);
        methods.subloop_register_instance_method((SubLObject)shop_displayers.$sym20$HTML_PLAN_DISPLAYER, (SubLObject)shop_displayers.$sym145$HTML_MBINDING_FORM, (SubLObject)shop_displayers.$sym149$HTML_PLAN_DISPLAYER_HTML_MBINDING_FORM_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_displayers.$sym68$HTML_FORM, (SubLObject)shop_displayers.$sym20$HTML_PLAN_DISPLAYER, (SubLObject)shop_displayers.$list35, (SubLObject)shop_displayers.$list69, (SubLObject)shop_displayers.$list150);
        methods.subloop_register_instance_method((SubLObject)shop_displayers.$sym20$HTML_PLAN_DISPLAYER, (SubLObject)shop_displayers.$sym68$HTML_FORM, (SubLObject)shop_displayers.$sym152$HTML_PLAN_DISPLAYER_HTML_FORM_METHOD);
        return (SubLObject)shop_displayers.NIL;
    }
    
    public void declareFunctions() {
        declare_shop_displayers_file();
    }
    
    public void initializeVariables() {
        init_shop_displayers_file();
    }
    
    public void runTopLevelForms() {
        setup_shop_displayers_file();
    }
    
    static {
        me = (SubLFile)new shop_displayers();
        shop_displayers.$cb_plan_task_examiner_link_image$ = null;
        shop_displayers.$cb_plan_task_examiner_method_image$ = null;
        shop_displayers.$cb_plan_task_examiner_operator_image$ = null;
        shop_displayers.$cb_plan_task_examiner_scond_image$ = null;
        $kw0$TE_LINK = SubLObjectFactory.makeKeyword("TE-LINK");
        $str1$bl_sdi_gif = SubLObjectFactory.makeString("bl_sdi.gif");
        $kw2$TE_METHOD = SubLObjectFactory.makeKeyword("TE-METHOD");
        $str3$gr_sdi_gif = SubLObjectFactory.makeString("gr_sdi.gif");
        $kw4$TE_OPERATOR = SubLObjectFactory.makeKeyword("TE-OPERATOR");
        $str5$yl_sdi_gif = SubLObjectFactory.makeString("yl_sdi.gif");
        $kw6$TE_EXAMINER = SubLObjectFactory.makeKeyword("TE-EXAMINER");
        $str7$red_diam_gif = SubLObjectFactory.makeString("red_diam.gif");
        $sym8$HTML_TASK_DISPLAYER = SubLObjectFactory.makeSymbol("HTML-TASK-DISPLAYER");
        $sym9$SHOP_INDEXED_OBJECT = SubLObjectFactory.makeSymbol("SHOP-INDEXED-OBJECT");
        $list10 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TASK"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PLAN-DISPLAYER"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-CLASS-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("FIND-INSTANCE-BY-ID-STRING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ID")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)shop_displayers.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("INIT-WITH-TASK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TASK")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("CB-TASK-EXAMINER-LINK"), (SubLObject)shop_displayers.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("HTML-TASK-PAGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STYLE-ARGS")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("TASK-EXAMINER-LINK-IMAGE"), (SubLObject)shop_displayers.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")));
        $sym11$PLAN_DISPLAYER = SubLObjectFactory.makeSymbol("PLAN-DISPLAYER");
        $sym12$TASK = SubLObjectFactory.makeSymbol("TASK");
        $sym13$OBJECT = SubLObjectFactory.makeSymbol("OBJECT");
        $sym14$INSTANCE_COUNT = SubLObjectFactory.makeSymbol("INSTANCE-COUNT");
        $sym15$INSTANCE_INDEX = SubLObjectFactory.makeSymbol("INSTANCE-INDEX");
        $sym16$SUBLOOP_RESERVED_INITIALIZE_HTML_TASK_DISPLAYER_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-HTML-TASK-DISPLAYER-CLASS");
        $sym17$ISOLATED_P = SubLObjectFactory.makeSymbol("ISOLATED-P");
        $sym18$INSTANCE_NUMBER = SubLObjectFactory.makeSymbol("INSTANCE-NUMBER");
        $sym19$SUBLOOP_RESERVED_INITIALIZE_HTML_TASK_DISPLAYER_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-HTML-TASK-DISPLAYER-INSTANCE");
        $sym20$HTML_PLAN_DISPLAYER = SubLObjectFactory.makeSymbol("HTML-PLAN-DISPLAYER");
        $list21 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SHOP-PLAN-I"));
        $list22 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PLAN"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TASK-DISPLAYER-HASH-TABLE"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MBINDING"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPEN-VARIABLES"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DISPLAY-VARIABLE-SUBSTITUTION"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)shop_displayers.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("HTML-FORM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STYLE-ARGS")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("HTML-HIERARCHICAL-FORM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STYLE-ARGS")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("HTML-PRIMITIVE-FORM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STYLE-ARGS")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("HTML-MBINDING-FORM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STYLE-ARGS")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("HTML-MULTIBINDING-VALUES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("MBINDING"), (SubLObject)SubLObjectFactory.makeSymbol("STYLE-ARGS")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PREPARE-TASK-FOR-DISPLAY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TASK")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")) });
        $sym23$DISPLAY_VARIABLE_SUBSTITUTION = SubLObjectFactory.makeSymbol("DISPLAY-VARIABLE-SUBSTITUTION");
        $sym24$OPEN_VARIABLES = SubLObjectFactory.makeSymbol("OPEN-VARIABLES");
        $sym25$MBINDING = SubLObjectFactory.makeSymbol("MBINDING");
        $sym26$TASK_DISPLAYER_HASH_TABLE = SubLObjectFactory.makeSymbol("TASK-DISPLAYER-HASH-TABLE");
        $sym27$PLAN = SubLObjectFactory.makeSymbol("PLAN");
        $sym28$SUBLOOP_RESERVED_INITIALIZE_HTML_PLAN_DISPLAYER_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-HTML-PLAN-DISPLAYER-CLASS");
        $sym29$SUBLOOP_RESERVED_INITIALIZE_HTML_PLAN_DISPLAYER_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-HTML-PLAN-DISPLAYER-INSTANCE");
        $sym30$CYC_DEVELOPMENT_PLAN_DISPLAYER_FACTORY = SubLObjectFactory.makeSymbol("CYC-DEVELOPMENT-PLAN-DISPLAYER-FACTORY");
        $sym31$SHOP_PLAN_DISPLAYER_FACTORY = SubLObjectFactory.makeSymbol("SHOP-PLAN-DISPLAYER-FACTORY");
        $sym32$SUBLOOP_RESERVED_INITIALIZE_CYC_DEVELOPMENT_PLAN_DISPLAYER_FACTOR = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYC-DEVELOPMENT-PLAN-DISPLAYER-FACTORY-CLASS");
        $sym33$SUBLOOP_RESERVED_INITIALIZE_CYC_DEVELOPMENT_PLAN_DISPLAYER_FACTOR = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYC-DEVELOPMENT-PLAN-DISPLAYER-FACTORY-INSTANCE");
        $sym34$CREATE_PLAN_DISPLAYER = SubLObjectFactory.makeSymbol("CREATE-PLAN-DISPLAYER");
        $list35 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"));
        $list36 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PLAN"));
        $list37 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PLAN-DISPLAYER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW"), (SubLObject)SubLObjectFactory.makeSymbol("HTML-PLAN-DISPLAYER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("HTML-PLAN-DISPLAYER"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INIT-WITH-PLAN"), (SubLObject)SubLObjectFactory.makeSymbol("HTML-PLAN-DISPLAYER")), (SubLObject)SubLObjectFactory.makeSymbol("PLAN-DISPLAYER"), (SubLObject)SubLObjectFactory.makeSymbol("PLAN"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("PLAN-DISPLAYER"))));
        $sym38$INIT_WITH_PLAN = SubLObjectFactory.makeSymbol("INIT-WITH-PLAN");
        $sym39$CYC_DEVELOPMENT_PLAN_DISPLAYER_FACTORY_CREATE_PLAN_DISPLAYER_METH = SubLObjectFactory.makeSymbol("CYC-DEVELOPMENT-PLAN-DISPLAYER-FACTORY-CREATE-PLAN-DISPLAYER-METHOD");
        $sym40$CREATE_TASK_DISPLAYER = SubLObjectFactory.makeSymbol("CREATE-TASK-DISPLAYER");
        $list41 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TASK"));
        $list42 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TASK-DISPLAYER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW"), (SubLObject)SubLObjectFactory.makeSymbol("HTML-TASK-DISPLAYER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("HTML-TASK-DISPLAYER"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INIT-WITH-TASK"), (SubLObject)SubLObjectFactory.makeSymbol("HTML-TASK-DISPLAYER")), (SubLObject)SubLObjectFactory.makeSymbol("TASK-DISPLAYER"), (SubLObject)SubLObjectFactory.makeSymbol("TASK")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("TASK-DISPLAYER"))));
        $sym43$CYC_DEVELOPMENT_PLAN_DISPLAYER_FACTORY_CREATE_TASK_DISPLAYER_METH = SubLObjectFactory.makeSymbol("CYC-DEVELOPMENT-PLAN-DISPLAYER-FACTORY-CREATE-TASK-DISPLAYER-METHOD");
        $sym44$INITIALIZE = SubLObjectFactory.makeSymbol("INITIALIZE");
        $list45 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROTECTED"));
        $list46 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)SubLObjectFactory.makeSymbol("SUPER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym47$HTML_TASK_DISPLAYER_INITIALIZE_METHOD = SubLObjectFactory.makeSymbol("HTML-TASK-DISPLAYER-INITIALIZE-METHOD");
        $sym48$INIT_WITH_TASK = SubLObjectFactory.makeSymbol("INIT-WITH-TASK");
        $list49 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-TASK"));
        $list50 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("TASK"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-TASK")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)shop_displayers.NIL));
        $sym51$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-HTML-TASK-DISPLAYER-METHOD");
        $sym52$HTML_TASK_DISPLAYER_INIT_WITH_TASK_METHOD = SubLObjectFactory.makeSymbol("HTML-TASK-DISPLAYER-INIT-WITH-TASK-METHOD");
        $sym53$FIND_INSTANCE_BY_ID_STRING = SubLObjectFactory.makeSymbol("FIND-INSTANCE-BY-ID-STRING");
        $list54 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ID-STRING"));
        $list55 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ID"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("READ-FROM-STRING-IGNORING-ERRORS"), (SubLObject)SubLObjectFactory.makeSymbol("ID-STRING")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIND-INSTANCE"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("ID")))));
        $sym56$HTML_TASK_DISPLAYER_FIND_INSTANCE_BY_ID_STRING_METHOD = SubLObjectFactory.makeSymbol("HTML-TASK-DISPLAYER-FIND-INSTANCE-BY-ID-STRING-METHOD");
        $sym57$TASK_EXAMINER_LINK_IMAGE = SubLObjectFactory.makeSymbol("TASK-EXAMINER-LINK-IMAGE");
        $list58 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param TASK shop-task-p\n   @return keywordp ;; cb-icon to use for image"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PLANNER-RULE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PLANNER-RULE"), (SubLObject)SubLObjectFactory.makeSymbol("TASK")), (SubLObject)SubLObjectFactory.makeSymbol("TASK")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PCOND"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SHOP-METHOD-P"), (SubLObject)SubLObjectFactory.makeSymbol("PLANNER-RULE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("*CB-PLAN-TASK-EXAMINER-METHOD-IMAGE*"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SHOP-PRECONDITION-P"), (SubLObject)SubLObjectFactory.makeSymbol("PLANNER-RULE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("*CB-PLAN-TASK-EXAMINER-OPERATOR-IMAGE*"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SHOP-SUFFICIENCY-CONDITION-P"), (SubLObject)SubLObjectFactory.makeSymbol("PLANNER-RULE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("*CB-PLAN-TASK-EXAMINER-SCOND-IMAGE*"))), (SubLObject)ConsesLow.list((SubLObject)shop_displayers.T, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("*CB-PLAN-TASK-EXAMINER-LINK-IMAGE*"))))));
        $sym59$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-HTML-TASK-DISPLAYER-METHOD");
        $sym60$PLANNER_RULE = SubLObjectFactory.makeSymbol("PLANNER-RULE");
        $sym61$HTML_TASK_DISPLAYER_TASK_EXAMINER_LINK_IMAGE_METHOD = SubLObjectFactory.makeSymbol("HTML-TASK-DISPLAYER-TASK-EXAMINER-LINK-IMAGE-METHOD");
        $sym62$CB_TASK_EXAMINER_LINK = SubLObjectFactory.makeSymbol("CB-TASK-EXAMINER-LINK");
        $list63 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ID-STRING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WRITE-TO-STRING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-NUMBER"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HREF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CCONCATENATE"), (SubLObject)SubLObjectFactory.makeString("cg?plan-task-examiner&"), (SubLObject)SubLObjectFactory.makeSymbol("ID-STRING"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IMAGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TASK-EXAMINER-LINK-IMAGE"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-FANCY-ANCHOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("HREF"), (SubLObject)SubLObjectFactory.makeSymbol("HREF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CB-ICON"), (SubLObject)SubLObjectFactory.makeSymbol("IMAGE"), (SubLObject)SubLObjectFactory.makeKeyword("BORDER-OVERRIDE"), (SubLObject)shop_displayers.ZERO_INTEGER))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)shop_displayers.NIL));
        $sym64$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-HTML-TASK-DISPLAYER-METHOD");
        $str65$cg_plan_task_examiner_ = SubLObjectFactory.makeString("cg?plan-task-examiner&");
        $kw66$TOP = SubLObjectFactory.makeKeyword("TOP");
        $sym67$HTML_TASK_DISPLAYER_CB_TASK_EXAMINER_LINK_METHOD = SubLObjectFactory.makeSymbol("HTML-TASK-DISPLAYER-CB-TASK-EXAMINER-LINK-METHOD");
        $sym68$HTML_FORM = SubLObjectFactory.makeSymbol("HTML-FORM");
        $list69 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STYLE-ARGS"));
        $list70 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER?"), (SubLObject)SubLObjectFactory.makeKeyword("TASK-EXAMINER-LINKS"), (SubLObject)SubLObjectFactory.makeSymbol("STYLE-ARGS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CB-TASK-EXAMINER-LINK"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DISPLAY-FORM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PLAN-DISPLAYER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PREPARE-TASK-FOR-DISPLAY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("TASK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FORMULA")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER?"), (SubLObject)SubLObjectFactory.makeKeyword("CYCL"), (SubLObject)SubLObjectFactory.makeSymbol("STYLE-ARGS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CB-FORM"), (SubLObject)SubLObjectFactory.makeSymbol("DISPLAY-FORM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROGN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*PPH-QUANTIFY-VARS?*"), (SubLObject)shop_displayers.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-TEXT-WITH-TARGET"), (SubLObject)SubLObjectFactory.makeSymbol("DISPLAY-FORM"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)shop_displayers.NIL)));
        $sym71$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-HTML-TASK-DISPLAYER-METHOD");
        $kw72$TASK_EXAMINER_LINKS = SubLObjectFactory.makeKeyword("TASK-EXAMINER-LINKS");
        $sym73$PREPARE_TASK_FOR_DISPLAY = SubLObjectFactory.makeSymbol("PREPARE-TASK-FOR-DISPLAY");
        $sym74$FORMULA = SubLObjectFactory.makeSymbol("FORMULA");
        $kw75$CYCL = SubLObjectFactory.makeKeyword("CYCL");
        $sym76$HTML_TASK_DISPLAYER_HTML_FORM_METHOD = SubLObjectFactory.makeSymbol("HTML-TASK-DISPLAYER-HTML-FORM-METHOD");
        $list77 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("TASK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FORMULA")))));
        $sym78$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-HTML-TASK-DISPLAYER-METHOD");
        $sym79$HTML_TASK_DISPLAYER_FORMULA_METHOD = SubLObjectFactory.makeSymbol("HTML-TASK-DISPLAYER-FORMULA-METHOD");
        $sym80$BINDINGS = SubLObjectFactory.makeSymbol("BINDINGS");
        $list81 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("TASK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("BINDINGS")))));
        $sym82$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-HTML-TASK-DISPLAYER-METHOD");
        $sym83$HTML_TASK_DISPLAYER_BINDINGS_METHOD = SubLObjectFactory.makeSymbol("HTML-TASK-DISPLAYER-BINDINGS-METHOD");
        $sym84$DISPLAY_BINDINGS = SubLObjectFactory.makeSymbol("DISPLAY-BINDINGS");
        $list85 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PRIVATE"));
        $list86 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IGNORE"), (SubLObject)SubLObjectFactory.makeSymbol("STYLE-ARGS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR-MANAGER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-COMPOSED-SLOTS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("VARIABLE-MANAGER"), (SubLObject)SubLObjectFactory.makeSymbol("PLAN"), (SubLObject)SubLObjectFactory.makeSymbol("PLAN-DISPLAYER"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MBIND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BINDINGS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("MBIND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-FANCY-TABLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BORDER"), (SubLObject)shop_displayers.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DO-MBIND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CUR-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("CUR-VALUES"), (SubLObject)SubLObjectFactory.makeSymbol("MBIND")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EL-VAR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("VAR-MANAGER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("RECOVER-EL")), (SubLObject)SubLObjectFactory.makeSymbol("CUR-VAR"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EL-VALUES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("VAR-MANAGER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("RECOVER-EL")), (SubLObject)SubLObjectFactory.makeSymbol("CUR-VALUES")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-TABLE-ROW"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-TABLE-DATA"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-PRINC"), (SubLObject)SubLObjectFactory.makeSymbol("EL-VAR"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-TABLE-DATA"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SINGLETON?"), (SubLObject)SubLObjectFactory.makeSymbol("EL-VALUES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CB-FORM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)SubLObjectFactory.makeSymbol("EL-VALUES"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CB-FORM"), (SubLObject)SubLObjectFactory.makeSymbol("EL-VALUES")))))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-NEWLINE")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)shop_displayers.NIL));
        $sym87$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-HTML-TASK-DISPLAYER-METHOD");
        $sym88$VARIABLE_MANAGER = SubLObjectFactory.makeSymbol("VARIABLE-MANAGER");
        $sym89$FIRST = SubLObjectFactory.makeSymbol("FIRST");
        $sym90$RECOVER_EL = SubLObjectFactory.makeSymbol("RECOVER-EL");
        $sym91$HTML_TASK_DISPLAYER_DISPLAY_BINDINGS_METHOD = SubLObjectFactory.makeSymbol("HTML-TASK-DISPLAYER-DISPLAY-BINDINGS-METHOD");
        $sym92$HTML_TASK_PAGE = SubLObjectFactory.makeSymbol("HTML-TASK-PAGE");
        $list93 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("This method displays the contents of the Task Examiner Page for the\n   displayer's associated TASK."), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IGNORE"), (SubLObject)SubLObjectFactory.makeSymbol("STYLE-ARGS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PREPARED-FORM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("PLAN-DISPLAYER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PREPARE-TASK-FOR-DISPLAY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMULA"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))))), (SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("CB-SIMPLE-MAIN-DOCUMENT"), ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Task Examiner"), (SubLObject)SubLObjectFactory.makeKeyword("COMPLETION?"), (SubLObject)shop_displayers.T), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-HR")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-STRONG"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-PRINC"), (SubLObject)SubLObjectFactory.makeString("Task: ")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-NEWLINE"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CB-FORM"), (SubLObject)SubLObjectFactory.makeSymbol("PREPARED-FORM")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-NEWLINE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-STRONG"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-PRINC"), (SubLObject)SubLObjectFactory.makeString("Translation: ")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-NEWLINE"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*PPH-QUANTIFY-VARS?*"), (SubLObject)shop_displayers.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-TEXT-WITH-TARGET"), (SubLObject)SubLObjectFactory.makeSymbol("PREPARED-FORM"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-NEWLINE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-STRONG"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-PRINC"), (SubLObject)SubLObjectFactory.makeString("Assertion: ")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-NEWLINE"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PLANNER-RULES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PLANNER-RULE"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-BASIC-TASK")), (SubLObject)SubLObjectFactory.makeSymbol("TASK")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LISTP"), (SubLObject)SubLObjectFactory.makeSymbol("PLANNER-RULES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("PLANNER-RULES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("PLANNER-RULES")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CUR-RULE"), (SubLObject)SubLObjectFactory.makeSymbol("PLANNER-RULES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CUR-ASSERTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTIONS"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-PLANNER-RULE")), (SubLObject)SubLObjectFactory.makeSymbol("CUR-RULE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CB-ASSERTION-LINK"), (SubLObject)SubLObjectFactory.makeSymbol("CUR-ASSERTION"))))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BINDINGS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-STRONG"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-PRINC"), (SubLObject)SubLObjectFactory.makeString("Bindings: ")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-NEWLINE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DISPLAY-BINDINGS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("STYLE-ARGS"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)shop_displayers.NIL) })));
        $sym94$OUTER_CATCH_FOR_HTML_TASK_DISPLAYER_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-HTML-TASK-DISPLAYER-METHOD");
        $str95$Task_Examiner = SubLObjectFactory.makeString("Task Examiner");
        $str96$__DOCTYPE_html_PUBLIC_____W3C__DT = SubLObjectFactory.makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $str97$_meta_http_equiv__X_UA_Compatible = SubLObjectFactory.makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");
        $kw98$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $kw99$CB_CYC = SubLObjectFactory.makeKeyword("CB-CYC");
        $kw100$SAM_AUTOCOMPLETE_CSS = SubLObjectFactory.makeKeyword("SAM-AUTOCOMPLETE-CSS");
        $kw101$SHA1 = SubLObjectFactory.makeKeyword("SHA1");
        $str102$yui_skin_sam = SubLObjectFactory.makeString("yui-skin-sam");
        $str103$reloadFrameButton = SubLObjectFactory.makeString("reloadFrameButton");
        $str104$button = SubLObjectFactory.makeString("button");
        $str105$reload = SubLObjectFactory.makeString("reload");
        $str106$Refresh_Frames = SubLObjectFactory.makeString("Refresh Frames");
        $str107$Task__ = SubLObjectFactory.makeString("Task: ");
        $str108$Translation__ = SubLObjectFactory.makeString("Translation: ");
        $str109$Assertion__ = SubLObjectFactory.makeString("Assertion: ");
        $sym110$ASSERTIONS = SubLObjectFactory.makeSymbol("ASSERTIONS");
        $str111$Bindings__ = SubLObjectFactory.makeString("Bindings: ");
        $sym112$HTML_TASK_DISPLAYER_HTML_TASK_PAGE_METHOD = SubLObjectFactory.makeSymbol("HTML-TASK-DISPLAYER-HTML-TASK-PAGE-METHOD");
        $list113 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROTECTED"), (SubLObject)SubLObjectFactory.makeKeyword("NO-MEMBER-VARIABLES"));
        $list114 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@returns html-plan-displayer-p; initialized object"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)SubLObjectFactory.makeSymbol("SUPER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("TASK-DISPLAYER-HASH-TABLE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAKE-HASH-TABLE"), (SubLObject)shop_displayers.TEN_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym115$HTML_PLAN_DISPLAYER_INITIALIZE_METHOD = SubLObjectFactory.makeSymbol("HTML-PLAN-DISPLAYER-INITIALIZE-METHOD");
        $list116 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-PLAN"), (SubLObject)SubLObjectFactory.makeSymbol("DISPLAYER-FACTORY"));
        $list117 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param NEW-PLAN          shop-basic-plan-p\n   @param DISPLAYER-FACTORY shop-plan-displayer-factory-p\n   @return html-plan-displayer-p"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("PLAN"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-PLAN")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR-MANAGER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-PLAN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("VARIABLE-MANAGER")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-MBINDING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-PLAN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("BINDINGS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPEN-VARS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-PLAN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("OPEN-VARIABLES")))), (SubLObject)SubLObjectFactory.makeSymbol("DISPLAY-SUB")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CUR-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("OPEN-VARS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EL-VAR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("VAR-MANAGER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("RECOVER-EL-VARIABLE")), (SubLObject)SubLObjectFactory.makeSymbol("CUR-VAR")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONS"), (SubLObject)SubLObjectFactory.makeSymbol("CUR-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("EL-VAR")), (SubLObject)SubLObjectFactory.makeSymbol("DISPLAY-SUB")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("MBINDING"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-MBINDING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("OPEN-VARIABLES"), (SubLObject)SubLObjectFactory.makeSymbol("OPEN-VARS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("DISPLAY-VARIABLE-SUBSTITUTION"), (SubLObject)SubLObjectFactory.makeSymbol("DISPLAY-SUB")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STEP"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-PLAN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PRE-ORDERING")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TASK-DISPLAYER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-CLASS-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("DISPLAYER-FACTORY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("CREATE-TASK-DISPLAYER")), (SubLObject)SubLObjectFactory.makeSymbol("STEP")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INIT-WITH-TASK"), (SubLObject)SubLObjectFactory.makeSymbol("HTML-TASK-DISPLAYER")), (SubLObject)SubLObjectFactory.makeSymbol("TASK-DISPLAYER"), (SubLObject)SubLObjectFactory.makeSymbol("STEP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("TASK-DISPLAYER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PLAN-DISPLAYER")), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GETHASH"), (SubLObject)SubLObjectFactory.makeSymbol("STEP"), (SubLObject)SubLObjectFactory.makeSymbol("TASK-DISPLAYER-HASH-TABLE")), (SubLObject)SubLObjectFactory.makeSymbol("TASK-DISPLAYER")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))));
        $sym118$OUTER_CATCH_FOR_HTML_PLAN_DISPLAYER_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-HTML-PLAN-DISPLAYER-METHOD");
        $sym119$RECOVER_EL_VARIABLE = SubLObjectFactory.makeSymbol("RECOVER-EL-VARIABLE");
        $sym120$PRE_ORDERING = SubLObjectFactory.makeSymbol("PRE-ORDERING");
        $sym121$HTML_PLAN_DISPLAYER_INIT_WITH_PLAN_METHOD = SubLObjectFactory.makeSymbol("HTML-PLAN-DISPLAYER-INIT-WITH-PLAN-METHOD");
        $list122 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param TASK listp; a task formula in CycL."), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-TASK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBLIS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("PLAN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SIMPLE-BINDING-LIST"))), (SubLObject)SubLObjectFactory.makeSymbol("TASK"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR-MANAGER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("PLAN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("VARIABLE-MANAGER"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("VAR-MANAGER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("RECOVER-EL")), (SubLObject)SubLObjectFactory.makeSymbol("NEW-TASK")))));
        $sym123$OUTER_CATCH_FOR_HTML_PLAN_DISPLAYER_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-HTML-PLAN-DISPLAYER-METHOD");
        $sym124$SIMPLE_BINDING_LIST = SubLObjectFactory.makeSymbol("SIMPLE-BINDING-LIST");
        $sym125$HTML_PLAN_DISPLAYER_PREPARE_TASK_FOR_DISPLAY_METHOD = SubLObjectFactory.makeSymbol("HTML-PLAN-DISPLAYER-PREPARE-TASK-FOR-DISPLAY-METHOD");
        $sym126$HTML_HIERARCHICAL_FORM = SubLObjectFactory.makeSymbol("HTML-HIERARCHICAL-FORM");
        $list127 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Displays all the tasks in the plan, indicating decompositon relationships\n   with tree-like indentation."), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REVERSE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("PLAN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PRE-ORDERING"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("POST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("PLAN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("POST-ORDERING"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-NEWLINE"), (SubLObject)shop_displayers.TWO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DO-PPO-TREE-DEPTH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STEP"), (SubLObject)SubLObjectFactory.makeSymbol("INDENT-COUNT"), (SubLObject)SubLObjectFactory.makeSymbol("PRE"), (SubLObject)SubLObjectFactory.makeSymbol("POST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)shop_displayers.EQUAL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CUR-TASK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GETHASH"), (SubLObject)SubLObjectFactory.makeSymbol("STEP"), (SubLObject)SubLObjectFactory.makeSymbol("TASK-DISPLAYER-HASH-TABLE")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-INDENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*"), (SubLObject)shop_displayers.FIVE_INTEGER, (SubLObject)SubLObjectFactory.makeSymbol("INDENT-COUNT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-FORM"), (SubLObject)SubLObjectFactory.makeSymbol("HTML-TASK-DISPLAYER")), (SubLObject)SubLObjectFactory.makeSymbol("CUR-TASK"), (SubLObject)SubLObjectFactory.makeSymbol("STYLE-ARGS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-NEWLINE")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)shop_displayers.NIL)));
        $sym128$OUTER_CATCH_FOR_HTML_PLAN_DISPLAYER_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-HTML-PLAN-DISPLAYER-METHOD");
        $sym129$POST_ORDERING = SubLObjectFactory.makeSymbol("POST-ORDERING");
        $sym130$HTML_PLAN_DISPLAYER_HTML_HIERARCHICAL_FORM_METHOD = SubLObjectFactory.makeSymbol("HTML-PLAN-DISPLAYER-HTML-HIERARCHICAL-FORM-METHOD");
        $sym131$HTML_PRIMITIVE_FORM = SubLObjectFactory.makeSymbol("HTML-PRIMITIVE-FORM");
        $list132 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Displays only the primitive tasks of the plan."), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STEP-DISPLAY-FORM"), (SubLObject)shop_displayers.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-NEWLINE"), (SubLObject)shop_displayers.TWO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST-NUMBERED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STEP"), (SubLObject)SubLObjectFactory.makeSymbol("NUM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("PLAN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PRIMITIVE-FORM")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-STRONG"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-PRINC"), (SubLObject)SubLObjectFactory.makeString("  Step ")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-PRIN1"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("1+"), (SubLObject)SubLObjectFactory.makeSymbol("NUM"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-PRINC"), (SubLObject)SubLObjectFactory.makeString(".  "))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("STEP-DISPLAY-FORM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PREPARE-TASK-FOR-DISPLAY"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("STEP"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER?"), (SubLObject)SubLObjectFactory.makeKeyword("CYCL"), (SubLObject)SubLObjectFactory.makeSymbol("STYLE-ARGS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CB-FORM"), (SubLObject)SubLObjectFactory.makeSymbol("STEP-DISPLAY-FORM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*PPH-QUANTIFY-VARS?*"), (SubLObject)shop_displayers.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-TEXT-WITH-TARGET"), (SubLObject)SubLObjectFactory.makeSymbol("STEP-DISPLAY-FORM")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-NEWLINE")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)shop_displayers.NIL));
        $sym133$OUTER_CATCH_FOR_HTML_PLAN_DISPLAYER_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-HTML-PLAN-DISPLAYER-METHOD");
        $sym134$PRIMITIVE_FORM = SubLObjectFactory.makeSymbol("PRIMITIVE-FORM");
        $str135$__Step_ = SubLObjectFactory.makeString("  Step ");
        $str136$___ = SubLObjectFactory.makeString(".  ");
        $sym137$HTML_PLAN_DISPLAYER_HTML_PRIMITIVE_FORM_METHOD = SubLObjectFactory.makeSymbol("HTML-PLAN-DISPLAYER-HTML-PRIMITIVE-FORM-METHOD");
        $sym138$HTML_MULTIBINDING_VALUES = SubLObjectFactory.makeSymbol("HTML-MULTIBINDING-VALUES");
        $list139 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("STYLE-ARGS"));
        $list140 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EL-VAR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PLAN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("VARIABLE-MANAGER"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("RECOVER-EL-VARIABLE")), (SubLObject)SubLObjectFactory.makeSymbol("VAR"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VALUES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MB-VAR-VALUES"), (SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("MBINDING")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NULL"), (SubLObject)SubLObjectFactory.makeSymbol("VALUES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER?"), (SubLObject)SubLObjectFactory.makeKeyword("CYCL"), (SubLObject)SubLObjectFactory.makeSymbol("STYLE-ARGS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CB-FORM"), (SubLObject)SubLObjectFactory.makeSymbol("EL-VAR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-PHRASE-WITH-TARGET"), (SubLObject)SubLObjectFactory.makeSymbol("EL-VAR"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-STRONG"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-INDENT"), (SubLObject)shop_displayers.THREE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-PRINC"), (SubLObject)SubLObjectFactory.makeString("is one of")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-INDENT"), (SubLObject)shop_displayers.THREE_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-PHRASE-WITH-TARGET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)SubLObjectFactory.makeSymbol("VALUES"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CUR-VAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REST"), (SubLObject)SubLObjectFactory.makeSymbol("VALUES"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-PRINC"), (SubLObject)SubLObjectFactory.makeString(",")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-INDENT"), (SubLObject)shop_displayers.TWO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-PHRASE-WITH-TARGET"), (SubLObject)SubLObjectFactory.makeSymbol("CUR-VAL"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-NEWLINE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)shop_displayers.NIL)));
        $sym141$OUTER_CATCH_FOR_HTML_PLAN_DISPLAYER_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-HTML-PLAN-DISPLAYER-METHOD");
        $str142$is_one_of = SubLObjectFactory.makeString("is one of");
        $str143$_ = SubLObjectFactory.makeString(",");
        $sym144$HTML_PLAN_DISPLAYER_HTML_MULTIBINDING_VALUES_METHOD = SubLObjectFactory.makeSymbol("HTML-PLAN-DISPLAYER-HTML-MULTIBINDING-VALUES-METHOD");
        $sym145$HTML_MBINDING_FORM = SubLObjectFactory.makeSymbol("HTML-MBINDING-FORM");
        $list146 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("OPEN-VARIABLES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-NEWLINE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-STRONG"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-PRINC"), (SubLObject)SubLObjectFactory.makeString("for any of the following values..."))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-NEWLINE"), (SubLObject)shop_displayers.TWO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CUR-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("OPEN-VARIABLES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-MULTIBINDING-VALUES"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("CUR-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("STYLE-ARGS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-NEWLINE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)shop_displayers.NIL));
        $sym147$OUTER_CATCH_FOR_HTML_PLAN_DISPLAYER_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-HTML-PLAN-DISPLAYER-METHOD");
        $str148$for_any_of_the_following_values__ = SubLObjectFactory.makeString("for any of the following values...");
        $sym149$HTML_PLAN_DISPLAYER_HTML_MBINDING_FORM_METHOD = SubLObjectFactory.makeSymbol("HTML-PLAN-DISPLAYER-HTML-MBINDING-FORM-METHOD");
        $list150 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER?"), (SubLObject)SubLObjectFactory.makeKeyword("PRIMITIVE"), (SubLObject)SubLObjectFactory.makeSymbol("STYLE-ARGS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-PRIMITIVE-FORM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("STYLE-ARGS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-HIERARCHICAL-FORM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("STYLE-ARGS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-MBINDING-FORM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("STYLE-ARGS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)shop_displayers.NIL));
        $kw151$PRIMITIVE = SubLObjectFactory.makeKeyword("PRIMITIVE");
        $sym152$HTML_PLAN_DISPLAYER_HTML_FORM_METHOD = SubLObjectFactory.makeSymbol("HTML-PLAN-DISPLAYER-HTML-FORM-METHOD");
    }
}

/*

	Total time: 750 ms
	
*/