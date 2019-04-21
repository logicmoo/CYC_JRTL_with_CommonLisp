package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cb_viewpoint extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.cb_viewpoint";
    public static final String myFingerPrint = "7fd2b4efe971053d54e42d9c3106e025b7bbd040c86989485f2ad4b24317d97d";
    @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 510L)
    private static SubLSymbol $viewpoint_type$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 1482L)
    public static SubLSymbol $dtp_viewpoint$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 3983L)
    public static SubLSymbol $cb_viewpoint_table$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 4100L)
    public static SubLSymbol $cb_viewpoint_summary_alist$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 4180L)
    private static SubLSymbol $index_hook$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 4887L)
    private static SubLSymbol $viewpoint_cache$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 11693L)
    private static SubLSymbol $dash_nil$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 25151L)
    public static SubLSymbol $cb_use_mycreator_filter$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 25151L)
    public static SubLSymbol $cb_mycreator_filter$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 25374L)
    public static SubLSymbol $cb_use_myreviewer_filter$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 25374L)
    public static SubLSymbol $cb_myreviewer_filter$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 25616L)
    public static SubLSymbol $cb_use_assertion_start_date_filter$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 25616L)
    public static SubLSymbol $cb_assertion_start_date_filter$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 25912L)
    public static SubLSymbol $cb_use_assertion_end_date_filter$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 25912L)
    public static SubLSymbol $cb_assertion_end_date_filter$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 26208L)
    public static SubLSymbol $cb_use_mts_filter$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 26208L)
    public static SubLSymbol $cb_mts_filter$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 26439L)
    public static SubLSymbol $cb_use_mycreationpurpose_filter$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 26439L)
    public static SubLSymbol $cb_mycreationpurpose_filter$;
    private static final SubLString $str0$_;
    private static final SubLSymbol $sym1$VIEWPOINT;
    private static final SubLSymbol $sym2$VIEWPOINT_P;
    private static final SubLList $list3;
    private static final SubLList $list4;
    private static final SubLList $list5;
    private static final SubLList $list6;
    private static final SubLSymbol $sym7$PRINT_VIEWPOINT;
    private static final SubLSymbol $sym8$VIEWPOINT_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list9;
    private static final SubLSymbol $sym10$VIEWPOINT_NAME;
    private static final SubLSymbol $sym11$_CSETF_VIEWPOINT_NAME;
    private static final SubLSymbol $sym12$VIEWPOINT_SUMMARY_NAME;
    private static final SubLSymbol $sym13$_CSETF_VIEWPOINT_SUMMARY_NAME;
    private static final SubLSymbol $sym14$VIEWPOINT_LINKABLE_NAME;
    private static final SubLSymbol $sym15$_CSETF_VIEWPOINT_LINKABLE_NAME;
    private static final SubLSymbol $sym16$VIEWPOINT_LINKNAME_PREFIX;
    private static final SubLSymbol $sym17$_CSETF_VIEWPOINT_LINKNAME_PREFIX;
    private static final SubLSymbol $sym18$VIEWPOINT_FILTER_GETTER;
    private static final SubLSymbol $sym19$_CSETF_VIEWPOINT_FILTER_GETTER;
    private static final SubLSymbol $sym20$VIEWPOINT_FILTER_SETTER;
    private static final SubLSymbol $sym21$_CSETF_VIEWPOINT_FILTER_SETTER;
    private static final SubLSymbol $sym22$VIEWPOINT_TYPE;
    private static final SubLSymbol $sym23$_CSETF_VIEWPOINT_TYPE;
    private static final SubLSymbol $sym24$VIEWPOINT_ACTIVE_P;
    private static final SubLSymbol $sym25$_CSETF_VIEWPOINT_ACTIVE_P;
    private static final SubLSymbol $sym26$VIEWPOINT_EFFECTIVE_FN;
    private static final SubLSymbol $sym27$_CSETF_VIEWPOINT_EFFECTIVE_FN;
    private static final SubLSymbol $sym28$VIEWPOINT_VALUE_PROMPT_FN;
    private static final SubLSymbol $sym29$_CSETF_VIEWPOINT_VALUE_PROMPT_FN;
    private static final SubLSymbol $sym30$VIEWPOINT_VALUE_UPDATE_FN;
    private static final SubLSymbol $sym31$_CSETF_VIEWPOINT_VALUE_UPDATE_FN;
    private static final SubLSymbol $sym32$VIEWPOINT_INITIAL_FILTER_VALUE;
    private static final SubLSymbol $sym33$_CSETF_VIEWPOINT_INITIAL_FILTER_VALUE;
    private static final SubLSymbol $sym34$VIEWPOINT_EFFECTIVE_FN_SLOTNAME;
    private static final SubLSymbol $sym35$_CSETF_VIEWPOINT_EFFECTIVE_FN_SLOTNAME;
    private static final SubLSymbol $kw36$NAME;
    private static final SubLSymbol $kw37$SUMMARY_NAME;
    private static final SubLSymbol $kw38$LINKABLE_NAME;
    private static final SubLSymbol $kw39$LINKNAME_PREFIX;
    private static final SubLSymbol $kw40$FILTER_GETTER;
    private static final SubLSymbol $kw41$FILTER_SETTER;
    private static final SubLSymbol $kw42$TYPE;
    private static final SubLSymbol $kw43$ACTIVE_P;
    private static final SubLSymbol $kw44$EFFECTIVE_FN;
    private static final SubLSymbol $kw45$VALUE_PROMPT_FN;
    private static final SubLSymbol $kw46$VALUE_UPDATE_FN;
    private static final SubLSymbol $kw47$INITIAL_FILTER_VALUE;
    private static final SubLSymbol $kw48$EFFECTIVE_FN_SLOTNAME;
    private static final SubLString $str49$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw50$BEGIN;
    private static final SubLSymbol $sym51$MAKE_VIEWPOINT;
    private static final SubLSymbol $kw52$SLOT;
    private static final SubLSymbol $kw53$END;
    private static final SubLSymbol $sym54$VISIT_DEFSTRUCT_OBJECT_VIEWPOINT_METHOD;
    private static final SubLSymbol $sym55$_CB_VIEWPOINT_TABLE_;
    private static final SubLSymbol $sym56$_CB_VIEWPOINT_SUMMARY_ALIST_;
    private static final SubLSymbol $sym57$ACTIVE_VIEWPOINT_STRUCT_P;
    private static final SubLList $list58;
    private static final SubLString $str59$_A_FILTER;
    private static final SubLString $str60$CB__A;
    private static final SubLString $str61$SET__A;
    private static final SubLString $str62$_A_EFFECTIVE_FN;
    private static final SubLSymbol $sym63$PROGN;
    private static final SubLSymbol $sym64$DEFFILTERSET;
    private static final SubLList $list65;
    private static final SubLSymbol $kw66$LIST_OF_FORMS;
    private static final SubLSymbol $sym67$DEFVIEWPOINT_INTERNAL;
    private static final SubLSymbol $sym68$QUOTE;
    private static final SubLSymbol $sym69$DEFINE;
    private static final SubLList $list70;
    private static final SubLList $list71;
    private static final SubLList $list72;
    private static final SubLSymbol $sym73$CLET;
    private static final SubLSymbol $sym74$FIND_VIEWPOINT;
    private static final SubLList $list75;
    private static final SubLList $list76;
    private static final SubLSymbol $sym77$CAR;
    private static final SubLString $str78$activate__A;
    private static final SubLString $str79$_;
    private static final SubLSymbol $kw80$NBSP;
    private static final SubLSymbol $kw81$SINGLE_SIMPLE_DATE;
    private static final SubLString $str82$_D;
    private static final SubLSymbol $kw83$EDIT_VIEWPOINT;
    private static final SubLString $str84$Edit;
    private static final SubLSymbol $sym85$DISPLAY_VIEWPOINT;
    private static final SubLString $str86$Complete;
    private static final SubLString $str87$;
    private static final SubLString $str88$cb_show_cyclist__A;
    private static final SubLObject $const89$Cyclist;
    private static final SubLInteger $int90$24;
    private static final SubLString $str91$cb_show_cyclist1__A;
    private static final SubLString $str92$cb_show_cyclist2__A;
    private static final SubLString $str93$________;
    private static final SubLString $str94$Unknown__A___S;
    private static final SubLString $str95$cyclist;
    private static final SubLObject $const96$Cyc_BasedProject;
    private static final SubLObject $const97$isa;
    private static final SubLString $str98$project1__A;
    private static final SubLString $str99$project2__A;
    private static final SubLString $str100$project3__A;
    private static final SubLString $str101$project;
    private static final SubLSymbol $kw102$CB_VIEWPOINT;
    private static final SubLString $str103$cb_viewpoint_html;
    private static final SubLList $list104;
    private static final SubLString $str105$_a_does_not_specify_an_index;
    private static final SubLString $str106$Viewpoint_Filter_Summary;
    private static final SubLString $str107$__DOCTYPE_html_PUBLIC_____W3C__DT;
    private static final SubLString $str108$_meta_http_equiv__X_UA_Compatible;
    private static final SubLSymbol $kw109$UNINITIALIZED;
    private static final SubLSymbol $kw110$CB_CYC;
    private static final SubLSymbol $kw111$SAM_AUTOCOMPLETE_CSS;
    private static final SubLSymbol $kw112$SHA1;
    private static final SubLString $str113$yui_skin_sam;
    private static final SubLString $str114$reloadFrameButton;
    private static final SubLString $str115$button;
    private static final SubLString $str116$reload;
    private static final SubLString $str117$Refresh_Frames;
    private static final SubLString $str118$post;
    private static final SubLString $str119$cb_viewpoint_summary_handler;
    private static final SubLString $str120$Current_Values;
    private static final SubLString $str121$Update_Filter_Settings;
    private static final SubLString $str122$always_show_comments;
    private static final SubLString $str123$Always_show_comments__regardless_;
    private static final SubLString $str124$always_show_bookkeeping;
    private static final SubLString $str125$Always_show_bookkeeping_predicate;
    private static final SubLSymbol $sym126$DISPLAY_VIEWPOINT_1;
    private static final SubLSymbol $sym127$CB_VIEWPOINT;
    private static final SubLSymbol $kw128$HTML_HANDLER;
    private static final SubLList $list129;
    private static final SubLString $str130$Viewpoint_Filters;
    private static final SubLString $str131$cb_viewpoint_handler;
    private static final SubLSymbol $sym132$CB_EV;
    private static final SubLString $str133$Summary_filters_have_been_changed;
    private static final SubLSymbol $sym134$CB_VIEWPOINT_SUMMARY_HANDLER;
    private static final SubLSymbol $sym135$CB_VIEWPOINT_HANDLER;
    private static final SubLString $str136$_Viewpoint_;
    private static final SubLSymbol $kw137$MAIN;
    private static final SubLString $str138$cb_viewpoint__A;
    private static final SubLSymbol $kw139$VIEWPOINT;
    private static final SubLSymbol $sym140$CB_LINK_VIEWPOINT;
    private static final SubLString $str141$_;
    private static final SubLString $str142$_Filter;
    private static final SubLString $str143$_Only_those_terms_whose_;
    private static final SubLString $str144$_field_has_a_value_equal_to_a_ter;
    private static final SubLSymbol $sym145$CB_PROMPT_CYCLISTS;
    private static final SubLString $str146$Activate_Filter;
    private static final SubLString $str147$all_dates__A;
    private static final SubLString $str148$no;
    private static final SubLString $str149$cb_show_start__A;
    private static final SubLString $str150$all;
    private static final SubLString $str151$yes;
    private static final SubLSymbol $sym152$MTS;
    private static final SubLString $str153$All_Mts;
    private static final SubLString $str154$Specify_Mts;
    private static final SubLString $str155$use_genl_mt;
    private static final SubLString $str156$Include_All_Genl_Mts;
    private static final SubLString $str157$new_mt;
    private static final SubLSymbol $sym158$CB_PROMPT_PROJECTS;
    private static final SubLObject $const159$EverythingPSC;
    private static final SubLSymbol $sym160$_CB_USE_MYCREATOR_FILTER_;
    private static final SubLSymbol $sym161$_CB_MYCREATOR_FILTER_;
    private static final SubLSymbol $sym162$MYCREATOR;
    private static final SubLList $list163;
    private static final SubLSymbol $sym164$CB_MYCREATOR_FILTER;
    private static final SubLSymbol $sym165$SET_CB_MYCREATOR_FILTER;
    private static final SubLSymbol $sym166$MYCREATOR_EFFECTIVE_FN;
    private static final SubLString $str167$not_an_assertion;
    private static final SubLSymbol $sym168$_CB_USE_MYREVIEWER_FILTER_;
    private static final SubLSymbol $sym169$_CB_MYREVIEWER_FILTER_;
    private static final SubLSymbol $sym170$MYREVIEWER;
    private static final SubLList $list171;
    private static final SubLSymbol $sym172$CB_MYREVIEWER_FILTER;
    private static final SubLSymbol $sym173$SET_CB_MYREVIEWER_FILTER;
    private static final SubLSymbol $sym174$MYREVIEWER_EFFECTIVE_FN;
    private static final SubLSymbol $sym175$_CB_USE_ASSERTION_START_DATE_FILTER_;
    private static final SubLSymbol $sym176$_CB_ASSERTION_START_DATE_FILTER_;
    private static final SubLSymbol $sym177$ASSERTION_START_DATE;
    private static final SubLList $list178;
    private static final SubLSymbol $sym179$CB_ASSERTION_START_DATE_FILTER;
    private static final SubLSymbol $sym180$SET_CB_ASSERTION_START_DATE_FILTER;
    private static final SubLSymbol $sym181$_CB_USE_ASSERTION_END_DATE_FILTER_;
    private static final SubLSymbol $sym182$_CB_ASSERTION_END_DATE_FILTER_;
    private static final SubLSymbol $sym183$ASSERTION_END_DATE;
    private static final SubLList $list184;
    private static final SubLSymbol $sym185$CB_ASSERTION_END_DATE_FILTER;
    private static final SubLSymbol $sym186$SET_CB_ASSERTION_END_DATE_FILTER;
    private static final SubLSymbol $sym187$_CB_USE_MTS_FILTER_;
    private static final SubLSymbol $sym188$_CB_MTS_FILTER_;
    private static final SubLList $list189;
    private static final SubLSymbol $sym190$CB_MTS_FILTER;
    private static final SubLSymbol $sym191$SET_CB_MTS_FILTER;
    private static final SubLSymbol $sym192$_CB_USE_MYCREATIONPURPOSE_FILTER_;
    private static final SubLSymbol $sym193$_CB_MYCREATIONPURPOSE_FILTER_;
    private static final SubLSymbol $sym194$MYCREATIONPURPOSE;
    private static final SubLList $list195;
    private static final SubLSymbol $sym196$CB_MYCREATIONPURPOSE_FILTER;
    private static final SubLSymbol $sym197$SET_CB_MYCREATIONPURPOSE_FILTER;
    private static final SubLSymbol $sym198$MYCREATIONPURPOSE_EFFECTIVE_FN;
    private static final SubLSymbol $sym199$CB_ONLINE_FILTER_HOOKS;
    private static final SubLList $list200;
    private static final SubLList $list201;
    private static final SubLList $list202;
    private static final SubLSymbol $kw203$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw204$SPECIFIED_MT;
    private static final SubLSymbol $sym205$WITH_ASSERTION_FILTERS;
    private static final SubLSymbol $sym206$PCOND;
    private static final SubLSymbol $sym207$CAND;
    private static final SubLList $list208;
    private static final SubLSymbol $sym209$CNOT;
    private static final SubLSymbol $sym210$PIF;
    private static final SubLList $list211;
    private static final SubLSymbol $sym212$WITH_MT_LIST_AND_GENL_MTS;
    private static final SubLList $list213;
    private static final SubLSymbol $sym214$CSETQ;
    private static final SubLSymbol $sym215$WITH_MT_LIST;
    private static final SubLList $list216;
    private static final SubLSymbol $sym217$RESULT;
    private static final SubLSymbol $sym218$RET;
    private static final SubLString $str219$cb_ev;
    private static final SubLSymbol $kw220$TOP;
    private static final SubLString $str221$cb_start_cb_ev;
    private static final SubLString $str222$_a__a__a;
    private static final SubLString $str223$_a__a;
    private static final SubLSymbol $sym224$CB_LINK_EDIT_VIEWPOINT;
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 1216L)
    public static SubLObject print_viewpoint(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_viewpoint.NIL != print_high.$print_level$.getDynamicValue(thread) && depth.numG(print_high.$print_level$.getDynamicValue(thread))) {
            print_high.princ((SubLObject)cb_viewpoint.$str0$_, stream);
        }
        else if (cb_viewpoint.NIL != print_high.$print_readably$.getDynamicValue(thread)) {
            print_high.print_not_readable(v_object, stream);
        }
        else {
            print_macros.print_unreadable_object_preamble(stream, v_object, (SubLObject)cb_viewpoint.T, (SubLObject)cb_viewpoint.T);
            print_high.princ(viewpoint_name(v_object), stream);
            print_macros.print_unreadable_object_postamble(stream, v_object, (SubLObject)cb_viewpoint.NIL, (SubLObject)cb_viewpoint.NIL);
        }
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 1482L)
    public static SubLObject viewpoint_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_viewpoint(v_object, stream, (SubLObject)cb_viewpoint.ZERO_INTEGER);
        return (SubLObject)cb_viewpoint.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 1482L)
    public static SubLObject viewpoint_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $viewpoint_native.class) ? cb_viewpoint.T : cb_viewpoint.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 1482L)
    public static SubLObject viewpoint_name(final SubLObject v_object) {
        assert cb_viewpoint.NIL != viewpoint_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 1482L)
    public static SubLObject viewpoint_summary_name(final SubLObject v_object) {
        assert cb_viewpoint.NIL != viewpoint_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 1482L)
    public static SubLObject viewpoint_linkable_name(final SubLObject v_object) {
        assert cb_viewpoint.NIL != viewpoint_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 1482L)
    public static SubLObject viewpoint_linkname_prefix(final SubLObject v_object) {
        assert cb_viewpoint.NIL != viewpoint_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 1482L)
    public static SubLObject viewpoint_filter_getter(final SubLObject v_object) {
        assert cb_viewpoint.NIL != viewpoint_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 1482L)
    public static SubLObject viewpoint_filter_setter(final SubLObject v_object) {
        assert cb_viewpoint.NIL != viewpoint_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 1482L)
    public static SubLObject viewpoint_type(final SubLObject v_object) {
        assert cb_viewpoint.NIL != viewpoint_p(v_object) : v_object;
        return v_object.getField8();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 1482L)
    public static SubLObject viewpoint_active_p(final SubLObject v_object) {
        assert cb_viewpoint.NIL != viewpoint_p(v_object) : v_object;
        return v_object.getField9();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 1482L)
    public static SubLObject viewpoint_effective_fn(final SubLObject v_object) {
        assert cb_viewpoint.NIL != viewpoint_p(v_object) : v_object;
        return v_object.getField10();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 1482L)
    public static SubLObject viewpoint_value_prompt_fn(final SubLObject v_object) {
        assert cb_viewpoint.NIL != viewpoint_p(v_object) : v_object;
        return v_object.getField11();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 1482L)
    public static SubLObject viewpoint_value_update_fn(final SubLObject v_object) {
        assert cb_viewpoint.NIL != viewpoint_p(v_object) : v_object;
        return v_object.getField12();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 1482L)
    public static SubLObject viewpoint_initial_filter_value(final SubLObject v_object) {
        assert cb_viewpoint.NIL != viewpoint_p(v_object) : v_object;
        return v_object.getField13();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 1482L)
    public static SubLObject viewpoint_effective_fn_slotname(final SubLObject v_object) {
        assert cb_viewpoint.NIL != viewpoint_p(v_object) : v_object;
        return v_object.getField14();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 1482L)
    public static SubLObject _csetf_viewpoint_name(final SubLObject v_object, final SubLObject value) {
        assert cb_viewpoint.NIL != viewpoint_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 1482L)
    public static SubLObject _csetf_viewpoint_summary_name(final SubLObject v_object, final SubLObject value) {
        assert cb_viewpoint.NIL != viewpoint_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 1482L)
    public static SubLObject _csetf_viewpoint_linkable_name(final SubLObject v_object, final SubLObject value) {
        assert cb_viewpoint.NIL != viewpoint_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 1482L)
    public static SubLObject _csetf_viewpoint_linkname_prefix(final SubLObject v_object, final SubLObject value) {
        assert cb_viewpoint.NIL != viewpoint_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 1482L)
    public static SubLObject _csetf_viewpoint_filter_getter(final SubLObject v_object, final SubLObject value) {
        assert cb_viewpoint.NIL != viewpoint_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 1482L)
    public static SubLObject _csetf_viewpoint_filter_setter(final SubLObject v_object, final SubLObject value) {
        assert cb_viewpoint.NIL != viewpoint_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 1482L)
    public static SubLObject _csetf_viewpoint_type(final SubLObject v_object, final SubLObject value) {
        assert cb_viewpoint.NIL != viewpoint_p(v_object) : v_object;
        return v_object.setField8(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 1482L)
    public static SubLObject _csetf_viewpoint_active_p(final SubLObject v_object, final SubLObject value) {
        assert cb_viewpoint.NIL != viewpoint_p(v_object) : v_object;
        return v_object.setField9(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 1482L)
    public static SubLObject _csetf_viewpoint_effective_fn(final SubLObject v_object, final SubLObject value) {
        assert cb_viewpoint.NIL != viewpoint_p(v_object) : v_object;
        return v_object.setField10(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 1482L)
    public static SubLObject _csetf_viewpoint_value_prompt_fn(final SubLObject v_object, final SubLObject value) {
        assert cb_viewpoint.NIL != viewpoint_p(v_object) : v_object;
        return v_object.setField11(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 1482L)
    public static SubLObject _csetf_viewpoint_value_update_fn(final SubLObject v_object, final SubLObject value) {
        assert cb_viewpoint.NIL != viewpoint_p(v_object) : v_object;
        return v_object.setField12(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 1482L)
    public static SubLObject _csetf_viewpoint_initial_filter_value(final SubLObject v_object, final SubLObject value) {
        assert cb_viewpoint.NIL != viewpoint_p(v_object) : v_object;
        return v_object.setField13(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 1482L)
    public static SubLObject _csetf_viewpoint_effective_fn_slotname(final SubLObject v_object, final SubLObject value) {
        assert cb_viewpoint.NIL != viewpoint_p(v_object) : v_object;
        return v_object.setField14(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 1482L)
    public static SubLObject make_viewpoint(SubLObject arglist) {
        if (arglist == cb_viewpoint.UNPROVIDED) {
            arglist = (SubLObject)cb_viewpoint.NIL;
        }
        final SubLObject v_new = (SubLObject)new $viewpoint_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)cb_viewpoint.NIL, next = arglist; cb_viewpoint.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)cb_viewpoint.$kw36$NAME)) {
                _csetf_viewpoint_name(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)cb_viewpoint.$kw37$SUMMARY_NAME)) {
                _csetf_viewpoint_summary_name(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)cb_viewpoint.$kw38$LINKABLE_NAME)) {
                _csetf_viewpoint_linkable_name(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)cb_viewpoint.$kw39$LINKNAME_PREFIX)) {
                _csetf_viewpoint_linkname_prefix(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)cb_viewpoint.$kw40$FILTER_GETTER)) {
                _csetf_viewpoint_filter_getter(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)cb_viewpoint.$kw41$FILTER_SETTER)) {
                _csetf_viewpoint_filter_setter(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)cb_viewpoint.$kw42$TYPE)) {
                _csetf_viewpoint_type(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)cb_viewpoint.$kw43$ACTIVE_P)) {
                _csetf_viewpoint_active_p(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)cb_viewpoint.$kw44$EFFECTIVE_FN)) {
                _csetf_viewpoint_effective_fn(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)cb_viewpoint.$kw45$VALUE_PROMPT_FN)) {
                _csetf_viewpoint_value_prompt_fn(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)cb_viewpoint.$kw46$VALUE_UPDATE_FN)) {
                _csetf_viewpoint_value_update_fn(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)cb_viewpoint.$kw47$INITIAL_FILTER_VALUE)) {
                _csetf_viewpoint_initial_filter_value(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)cb_viewpoint.$kw48$EFFECTIVE_FN_SLOTNAME)) {
                _csetf_viewpoint_effective_fn_slotname(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)cb_viewpoint.$str49$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 1482L)
    public static SubLObject visit_defstruct_viewpoint(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)cb_viewpoint.$kw50$BEGIN, (SubLObject)cb_viewpoint.$sym51$MAKE_VIEWPOINT, (SubLObject)cb_viewpoint.THIRTEEN_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)cb_viewpoint.$kw52$SLOT, (SubLObject)cb_viewpoint.$kw36$NAME, viewpoint_name(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)cb_viewpoint.$kw52$SLOT, (SubLObject)cb_viewpoint.$kw37$SUMMARY_NAME, viewpoint_summary_name(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)cb_viewpoint.$kw52$SLOT, (SubLObject)cb_viewpoint.$kw38$LINKABLE_NAME, viewpoint_linkable_name(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)cb_viewpoint.$kw52$SLOT, (SubLObject)cb_viewpoint.$kw39$LINKNAME_PREFIX, viewpoint_linkname_prefix(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)cb_viewpoint.$kw52$SLOT, (SubLObject)cb_viewpoint.$kw40$FILTER_GETTER, viewpoint_filter_getter(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)cb_viewpoint.$kw52$SLOT, (SubLObject)cb_viewpoint.$kw41$FILTER_SETTER, viewpoint_filter_setter(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)cb_viewpoint.$kw52$SLOT, (SubLObject)cb_viewpoint.$kw42$TYPE, viewpoint_type(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)cb_viewpoint.$kw52$SLOT, (SubLObject)cb_viewpoint.$kw43$ACTIVE_P, viewpoint_active_p(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)cb_viewpoint.$kw52$SLOT, (SubLObject)cb_viewpoint.$kw44$EFFECTIVE_FN, viewpoint_effective_fn(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)cb_viewpoint.$kw52$SLOT, (SubLObject)cb_viewpoint.$kw45$VALUE_PROMPT_FN, viewpoint_value_prompt_fn(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)cb_viewpoint.$kw52$SLOT, (SubLObject)cb_viewpoint.$kw46$VALUE_UPDATE_FN, viewpoint_value_update_fn(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)cb_viewpoint.$kw52$SLOT, (SubLObject)cb_viewpoint.$kw47$INITIAL_FILTER_VALUE, viewpoint_initial_filter_value(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)cb_viewpoint.$kw52$SLOT, (SubLObject)cb_viewpoint.$kw48$EFFECTIVE_FN_SLOTNAME, viewpoint_effective_fn_slotname(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)cb_viewpoint.$kw53$END, (SubLObject)cb_viewpoint.$sym51$MAKE_VIEWPOINT, (SubLObject)cb_viewpoint.THIRTEEN_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 1482L)
    public static SubLObject visit_defstruct_object_viewpoint_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_viewpoint(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 4253L)
    public static SubLObject find_viewpoint(final SubLObject name) {
        return Sequences.find(name, cb_viewpoint.$cb_viewpoint_table$.getGlobalValue(), Symbols.symbol_function((SubLObject)cb_viewpoint.EQUAL), Symbols.symbol_function((SubLObject)cb_viewpoint.$sym10$VIEWPOINT_NAME), (SubLObject)cb_viewpoint.UNPROVIDED, (SubLObject)cb_viewpoint.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 4361L)
    public static SubLObject active_filter_p(final SubLObject viewpoint_name) {
        final SubLObject viewpoint = find_viewpoint(viewpoint_name);
        if (cb_viewpoint.NIL != viewpoint) {
            return viewpoint_active_p(viewpoint);
        }
        return (SubLObject)cb_viewpoint.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 4554L)
    public static SubLObject active_viewpoint_struct_p(final SubLObject viewpoint, SubLObject type) {
        if (type == cb_viewpoint.UNPROVIDED) {
            type = cb_viewpoint.$viewpoint_type$.getDynamicValue();
        }
        if (cb_viewpoint.NIL != type) {
            if (cb_viewpoint.NIL != active_filter_p(viewpoint) && viewpoint_type(viewpoint).eql(type)) {
                return (SubLObject)ConsesLow.list(viewpoint);
            }
        }
        else if (cb_viewpoint.NIL != viewpoint_active_p(viewpoint)) {
            return (SubLObject)ConsesLow.list(viewpoint);
        }
        return (SubLObject)cb_viewpoint.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 4957L)
    public static SubLObject clear_viewpoint_cache() {
        cb_viewpoint.$viewpoint_cache$.setGlobalValue((SubLObject)cb_viewpoint.NIL);
        return (SubLObject)cb_viewpoint.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 5046L)
    public static SubLObject active_filters(SubLObject type) {
        if (type == cb_viewpoint.UNPROVIDED) {
            type = (SubLObject)cb_viewpoint.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject cache_hit = conses_high.assoc(type, cb_viewpoint.$viewpoint_cache$.getGlobalValue(), (SubLObject)cb_viewpoint.UNPROVIDED, (SubLObject)cb_viewpoint.UNPROVIDED).rest();
        if (cb_viewpoint.NIL != cache_hit) {
            return cache_hit;
        }
        SubLObject result = (SubLObject)cb_viewpoint.NIL;
        final SubLObject _prev_bind_0 = cb_viewpoint.$viewpoint_type$.currentBinding(thread);
        try {
            cb_viewpoint.$viewpoint_type$.bind(type, thread);
            result = Mapping.mapcan(Symbols.symbol_function((SubLObject)cb_viewpoint.$sym57$ACTIVE_VIEWPOINT_STRUCT_P), cb_viewpoint.$cb_viewpoint_table$.getGlobalValue(), cb_viewpoint.EMPTY_SUBL_OBJECT_ARRAY);
        }
        finally {
            cb_viewpoint.$viewpoint_type$.rebind(_prev_bind_0, thread);
        }
        if (cb_viewpoint.NIL != result) {
            cb_viewpoint.$viewpoint_cache$.setGlobalValue(conses_high.acons(type, result, cb_viewpoint.$viewpoint_cache$.getGlobalValue()));
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 5477L)
    public static SubLObject enable_filter(final SubLObject filter_name, SubLObject enable_p) {
        if (enable_p == cb_viewpoint.UNPROVIDED) {
            enable_p = (SubLObject)cb_viewpoint.T;
        }
        clear_viewpoint_cache();
        final SubLObject viewpoint = find_viewpoint(filter_name);
        if (cb_viewpoint.NIL != viewpoint) {
            _csetf_viewpoint_active_p(viewpoint, enable_p);
            return enable_p;
        }
        return (SubLObject)cb_viewpoint.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 5807L)
    public static SubLObject doc_predicate_p(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean((cb_viewpoint.NIL != cb_parameters.$cb_viewpoint_show_doc_preds$.getDynamicValue(thread) && cb_viewpoint.NIL != cb_adornments.documentation_assertion_p(assertion)) || (cb_viewpoint.NIL != cb_parameters.$cb_viewpoint_show_book_preds$.getDynamicValue(thread) && cb_viewpoint.NIL != cb_adornments.bookkeeping_assertion_p(assertion)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 6066L)
    public static SubLObject defviewpoint(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = (SubLObject)cb_viewpoint.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_viewpoint.$list58);
        name = current.first();
        final SubLObject arglist;
        current = (arglist = current.rest());
        final SubLObject filtername = Packages.intern(PrintLow.format((SubLObject)cb_viewpoint.NIL, (SubLObject)cb_viewpoint.$str59$_A_FILTER, Strings.string_upcase(Strings.string(name), (SubLObject)cb_viewpoint.UNPROVIDED, (SubLObject)cb_viewpoint.UNPROVIDED)), (SubLObject)cb_viewpoint.UNPROVIDED);
        final SubLObject gettername = Packages.intern(PrintLow.format((SubLObject)cb_viewpoint.NIL, (SubLObject)cb_viewpoint.$str60$CB__A, filtername), (SubLObject)cb_viewpoint.UNPROVIDED);
        final SubLObject settername = Packages.intern(PrintLow.format((SubLObject)cb_viewpoint.NIL, (SubLObject)cb_viewpoint.$str61$SET__A, gettername), (SubLObject)cb_viewpoint.UNPROVIDED);
        final SubLObject effective_fn_name = Packages.intern(PrintLow.format((SubLObject)cb_viewpoint.NIL, (SubLObject)cb_viewpoint.$str62$_A_EFFECTIVE_FN, name), (SubLObject)cb_viewpoint.UNPROVIDED);
        final SubLObject type = cb_macros.extract_keyword((SubLObject)cb_viewpoint.$kw42$TYPE, arglist, (SubLObject)cb_viewpoint.UNPROVIDED);
        return (SubLObject)ConsesLow.list((SubLObject)cb_viewpoint.$sym63$PROGN, (SubLObject)ConsesLow.listS((SubLObject)cb_viewpoint.$sym64$DEFFILTERSET, filtername, (SubLObject)cb_viewpoint.$list65), (SubLObject)((cb_viewpoint.NIL != cb_macros.extract_keyword((SubLObject)cb_viewpoint.$kw48$EFFECTIVE_FN_SLOTNAME, arglist, (SubLObject)cb_viewpoint.UNPROVIDED)) ? ((type == cb_viewpoint.$kw66$LIST_OF_FORMS) ? ConsesLow.list((SubLObject)cb_viewpoint.$sym63$PROGN, (SubLObject)ConsesLow.list((SubLObject)cb_viewpoint.$sym67$DEFVIEWPOINT_INTERNAL, (SubLObject)ConsesLow.list((SubLObject)cb_viewpoint.$sym68$QUOTE, name), (SubLObject)ConsesLow.list((SubLObject)cb_viewpoint.$sym68$QUOTE, arglist), (SubLObject)ConsesLow.list((SubLObject)cb_viewpoint.$sym68$QUOTE, gettername), (SubLObject)ConsesLow.list((SubLObject)cb_viewpoint.$sym68$QUOTE, settername), (SubLObject)ConsesLow.list((SubLObject)cb_viewpoint.$sym68$QUOTE, effective_fn_name)), (SubLObject)ConsesLow.list((SubLObject)cb_viewpoint.$sym69$DEFINE, effective_fn_name, (SubLObject)cb_viewpoint.$list70, (SubLObject)cb_viewpoint.$list71, (SubLObject)cb_viewpoint.$list72, (SubLObject)ConsesLow.listS((SubLObject)cb_viewpoint.$sym73$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)cb_viewpoint.$sym1$VIEWPOINT, (SubLObject)ConsesLow.list((SubLObject)cb_viewpoint.$sym74$FIND_VIEWPOINT, (SubLObject)ConsesLow.list((SubLObject)cb_viewpoint.$sym68$QUOTE, name)))), (SubLObject)cb_viewpoint.$list75))) : ConsesLow.listS((SubLObject)cb_viewpoint.$sym67$DEFVIEWPOINT_INTERNAL, (SubLObject)ConsesLow.list((SubLObject)cb_viewpoint.$sym68$QUOTE, name), (SubLObject)ConsesLow.list((SubLObject)cb_viewpoint.$sym68$QUOTE, arglist), (SubLObject)ConsesLow.list((SubLObject)cb_viewpoint.$sym68$QUOTE, gettername), (SubLObject)ConsesLow.list((SubLObject)cb_viewpoint.$sym68$QUOTE, settername), (SubLObject)cb_viewpoint.$list76)) : ConsesLow.listS((SubLObject)cb_viewpoint.$sym67$DEFVIEWPOINT_INTERNAL, (SubLObject)ConsesLow.list((SubLObject)cb_viewpoint.$sym68$QUOTE, name), (SubLObject)ConsesLow.list((SubLObject)cb_viewpoint.$sym68$QUOTE, arglist), (SubLObject)ConsesLow.list((SubLObject)cb_viewpoint.$sym68$QUOTE, gettername), (SubLObject)ConsesLow.list((SubLObject)cb_viewpoint.$sym68$QUOTE, settername), (SubLObject)cb_viewpoint.$list76)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 7778L)
    public static SubLObject defviewpoint_internal(final SubLObject name, final SubLObject arglist, final SubLObject gettername, final SubLObject settername, final SubLObject effective_fn_name) {
        clear_viewpoint_cache();
        final SubLObject old = cb_viewpoint.$cb_viewpoint_table$.getGlobalValue();
        final SubLObject v_new = make_viewpoint(arglist);
        _csetf_viewpoint_name(v_new, name);
        if (cb_viewpoint.NIL == viewpoint_summary_name(v_new)) {
            _csetf_viewpoint_summary_name(v_new, name);
        }
        _csetf_viewpoint_filter_getter(v_new, gettername);
        _csetf_viewpoint_filter_setter(v_new, settername);
        Functions.funcall(settername, viewpoint_initial_filter_value(v_new));
        cb_viewpoint.$cb_viewpoint_table$.setGlobalValue((SubLObject)ConsesLow.cons(v_new, Sequences.delete(name, old, Symbols.symbol_function((SubLObject)cb_viewpoint.EQUAL), Symbols.symbol_function((SubLObject)cb_viewpoint.$sym10$VIEWPOINT_NAME), (SubLObject)cb_viewpoint.UNPROVIDED, (SubLObject)cb_viewpoint.UNPROVIDED, (SubLObject)cb_viewpoint.UNPROVIDED)));
        cb_viewpoint.$cb_viewpoint_summary_alist$.setGlobalValue(conses_high.acons(viewpoint_summary_name(v_new), (SubLObject)ConsesLow.cons(v_new, Sequences.delete(name, conses_high.assoc(viewpoint_summary_name(v_new), cb_viewpoint.$cb_viewpoint_summary_alist$.getGlobalValue(), (SubLObject)cb_viewpoint.UNPROVIDED, (SubLObject)cb_viewpoint.UNPROVIDED).rest(), Symbols.symbol_function((SubLObject)cb_viewpoint.EQUAL), Symbols.symbol_function((SubLObject)cb_viewpoint.$sym10$VIEWPOINT_NAME), (SubLObject)cb_viewpoint.UNPROVIDED, (SubLObject)cb_viewpoint.UNPROVIDED, (SubLObject)cb_viewpoint.UNPROVIDED)), Sequences.delete(viewpoint_summary_name(v_new), cb_viewpoint.$cb_viewpoint_summary_alist$.getGlobalValue(), Symbols.symbol_function((SubLObject)cb_viewpoint.EQUAL), Symbols.symbol_function((SubLObject)cb_viewpoint.$sym77$CAR), (SubLObject)cb_viewpoint.UNPROVIDED, (SubLObject)cb_viewpoint.UNPROVIDED, (SubLObject)cb_viewpoint.UNPROVIDED)));
        if (cb_viewpoint.NIL != effective_fn_name) {
            _csetf_viewpoint_effective_fn(v_new, effective_fn_name);
        }
        return (SubLObject)cb_viewpoint.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 9124L)
    public static SubLObject display_viewpoint(final SubLObject viewpoint, SubLObject for_summary) {
        if (for_summary == cb_viewpoint.UNPROVIDED) {
            for_summary = (SubLObject)cb_viewpoint.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_viewpoint.NIL != for_summary) {
            final SubLObject checkbox_name = PrintLow.format((SubLObject)cb_viewpoint.NIL, (SubLObject)cb_viewpoint.$str78$activate__A, viewpoint_name(viewpoint));
            html_utilities.html_checkbox_input(checkbox_name, checkbox_name, active_viewpoint_struct_p(viewpoint, (SubLObject)cb_viewpoint.UNPROVIDED), (SubLObject)cb_viewpoint.UNPROVIDED, (SubLObject)cb_viewpoint.UNPROVIDED, (SubLObject)cb_viewpoint.UNPROVIDED);
            html_utilities.html_indent((SubLObject)cb_viewpoint.UNPROVIDED);
        }
        else {
            html_utilities.html_newline((SubLObject)cb_viewpoint.UNPROVIDED);
            html_utilities.html_indent((SubLObject)cb_viewpoint.TWO_INTEGER);
        }
        if (cb_viewpoint.NIL != viewpoint_linkname_prefix(viewpoint)) {
            html_utilities.html_princ(viewpoint_linkname_prefix(viewpoint));
        }
        cb_utilities.cb_form(viewpoint_linkable_name(viewpoint), (SubLObject)cb_viewpoint.UNPROVIDED, (SubLObject)cb_viewpoint.UNPROVIDED);
        html_utilities.html_princ((SubLObject)cb_viewpoint.$str79$_);
        final SubLObject pcase_var;
        final SubLObject type = pcase_var = viewpoint_type(viewpoint);
        if (pcase_var.eql((SubLObject)cb_viewpoint.$kw66$LIST_OF_FORMS)) {
            SubLObject cdolist_list_var = Functions.funcall(viewpoint_filter_getter(viewpoint));
            SubLObject thingy = (SubLObject)cb_viewpoint.NIL;
            thingy = cdolist_list_var.first();
            while (cb_viewpoint.NIL != cdolist_list_var) {
                html_utilities.html_glyph((SubLObject)cb_viewpoint.$kw80$NBSP, (SubLObject)cb_viewpoint.UNPROVIDED);
                cb_utilities.cb_form(thingy, (SubLObject)cb_viewpoint.UNPROVIDED, (SubLObject)cb_viewpoint.UNPROVIDED);
                if (cb_viewpoint.NIL != for_summary) {
                    html_utilities.html_newline((SubLObject)cb_viewpoint.UNPROVIDED);
                }
                else {
                    html_utilities.html_indent((SubLObject)cb_viewpoint.UNPROVIDED);
                }
                cdolist_list_var = cdolist_list_var.rest();
                thingy = cdolist_list_var.first();
            }
        }
        else if (pcase_var.eql((SubLObject)cb_viewpoint.$kw81$SINGLE_SIMPLE_DATE)) {
            html_utilities.html_glyph((SubLObject)cb_viewpoint.$kw80$NBSP, (SubLObject)cb_viewpoint.UNPROVIDED);
            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_viewpoint.$str82$_D, Functions.funcall(viewpoint_filter_getter(viewpoint)));
        }
        if (cb_viewpoint.NIL != for_summary) {
            html_utilities.html_indent((SubLObject)cb_viewpoint.TWO_INTEGER);
            cb_utilities.cb_link((SubLObject)cb_viewpoint.$kw83$EDIT_VIEWPOINT, viewpoint, (SubLObject)cb_viewpoint.$str84$Edit, cb_utilities.cb_index_identifier(cb_viewpoint.$index_hook$.getDynamicValue(thread)), (SubLObject)cb_viewpoint.UNPROVIDED, (SubLObject)cb_viewpoint.UNPROVIDED);
        }
        if (cb_viewpoint.NIL != for_summary) {
            html_utilities.html_newline((SubLObject)cb_viewpoint.UNPROVIDED);
        }
        return (SubLObject)cb_viewpoint.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 10601L)
    public static SubLObject cb_display_viewpoint_filters() {
        if (cb_viewpoint.NIL != active_filters((SubLObject)cb_viewpoint.UNPROVIDED)) {
            html_utilities.html_princ((SubLObject)cb_viewpoint.$str79$_);
            Mapping.mapc(Symbols.symbol_function((SubLObject)cb_viewpoint.$sym85$DISPLAY_VIEWPOINT), active_filters((SubLObject)cb_viewpoint.UNPROVIDED), cb_viewpoint.EMPTY_SUBL_OBJECT_ARRAY);
        }
        return (SubLObject)cb_viewpoint.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 10808L)
    public static SubLObject prompt_with_completion(final SubLObject button, final SubLObject type, final SubLObject v_default, final SubLObject size) {
        html_utilities.html_newline((SubLObject)cb_viewpoint.UNPROVIDED);
        html_utilities.html_indent((SubLObject)cb_viewpoint.THREE_INTEGER);
        html_complete.html_complete_button(button, (SubLObject)cb_viewpoint.$str86$Complete, type, (SubLObject)cb_viewpoint.UNPROVIDED, (SubLObject)cb_viewpoint.UNPROVIDED, (SubLObject)cb_viewpoint.UNPROVIDED, (SubLObject)cb_viewpoint.UNPROVIDED);
        html_utilities.html_indent((SubLObject)cb_viewpoint.UNPROVIDED);
        html_utilities.html_text_input(button, v_default, size);
        html_utilities.html_indent((SubLObject)cb_viewpoint.UNPROVIDED);
        html_script_utilities.html_clear_input_button(button, (SubLObject)cb_viewpoint.UNPROVIDED, (SubLObject)cb_viewpoint.UNPROVIDED);
        html_utilities.html_newline((SubLObject)cb_viewpoint.UNPROVIDED);
        return (SubLObject)cb_viewpoint.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 11265L)
    public static SubLObject cb_prompt_cyclists(final SubLObject id, SubLObject default1, SubLObject default2, SubLObject default3) {
        if (default1 == cb_viewpoint.UNPROVIDED) {
            default1 = (SubLObject)cb_viewpoint.$str87$;
        }
        if (default2 == cb_viewpoint.UNPROVIDED) {
            default2 = (SubLObject)cb_viewpoint.$str87$;
        }
        if (default3 == cb_viewpoint.UNPROVIDED) {
            default3 = (SubLObject)cb_viewpoint.$str87$;
        }
        prompt_with_completion(PrintLow.format((SubLObject)cb_viewpoint.NIL, (SubLObject)cb_viewpoint.$str88$cb_show_cyclist__A, id), cb_viewpoint.$const89$Cyclist, default1, (SubLObject)cb_viewpoint.$int90$24);
        prompt_with_completion(PrintLow.format((SubLObject)cb_viewpoint.NIL, (SubLObject)cb_viewpoint.$str91$cb_show_cyclist1__A, id), cb_viewpoint.$const89$Cyclist, default2, (SubLObject)cb_viewpoint.$int90$24);
        prompt_with_completion(PrintLow.format((SubLObject)cb_viewpoint.NIL, (SubLObject)cb_viewpoint.$str92$cb_show_cyclist2__A, id), cb_viewpoint.$const89$Cyclist, default3, (SubLObject)cb_viewpoint.$int90$24);
        return (SubLObject)cb_viewpoint.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 11813L)
    public static SubLObject extract_fort_input(final SubLObject key, final SubLObject args, final SubLObject typestring) {
        SubLObject value = string_utilities.trim_whitespace(html_utilities.html_extract_input(key, args));
        if (cb_viewpoint.$str87$.equalp(value) || cb_viewpoint.$dash_nil$.getGlobalValue().equalp(value)) {
            value = (SubLObject)cb_viewpoint.NIL;
        }
        else {
            value = cb_utilities.cb_guess_fort(value, (SubLObject)cb_viewpoint.UNPROVIDED);
            if (cb_viewpoint.NIL == forts.fort_p(value)) {
                cb_utilities.cb_error((SubLObject)cb_viewpoint.$str94$Unknown__A___S, typestring, value, (SubLObject)cb_viewpoint.UNPROVIDED, (SubLObject)cb_viewpoint.UNPROVIDED, (SubLObject)cb_viewpoint.UNPROVIDED);
                return (SubLObject)cb_viewpoint.NIL;
            }
        }
        return value;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 12239L)
    public static SubLObject cb_get_cyclists(final SubLObject id, final SubLObject args) {
        return Sequences.delete((SubLObject)cb_viewpoint.NIL, (SubLObject)ConsesLow.list(extract_fort_input(PrintLow.format((SubLObject)cb_viewpoint.NIL, (SubLObject)cb_viewpoint.$str88$cb_show_cyclist__A, id), args, (SubLObject)cb_viewpoint.$str95$cyclist), extract_fort_input(PrintLow.format((SubLObject)cb_viewpoint.NIL, (SubLObject)cb_viewpoint.$str91$cb_show_cyclist1__A, id), args, (SubLObject)cb_viewpoint.$str95$cyclist), extract_fort_input(PrintLow.format((SubLObject)cb_viewpoint.NIL, (SubLObject)cb_viewpoint.$str92$cb_show_cyclist2__A, id), args, (SubLObject)cb_viewpoint.$str95$cyclist)), (SubLObject)cb_viewpoint.UNPROVIDED, (SubLObject)cb_viewpoint.UNPROVIDED, (SubLObject)cb_viewpoint.UNPROVIDED, (SubLObject)cb_viewpoint.UNPROVIDED, (SubLObject)cb_viewpoint.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 12655L)
    public static SubLObject cb_prompt_projects(final SubLObject id, SubLObject default1, SubLObject default2, SubLObject default3) {
        if (default1 == cb_viewpoint.UNPROVIDED) {
            default1 = cb_viewpoint.$dash_nil$.getGlobalValue();
        }
        if (default2 == cb_viewpoint.UNPROVIDED) {
            default2 = cb_viewpoint.$dash_nil$.getGlobalValue();
        }
        if (default3 == cb_viewpoint.UNPROVIDED) {
            default3 = cb_viewpoint.$dash_nil$.getGlobalValue();
        }
        final SubLObject all_projects = (SubLObject)ConsesLow.cons(cb_viewpoint.$dash_nil$.getGlobalValue(), kb_mapping_utilities.pred_values_in_any_mt(cb_viewpoint.$const96$Cyc_BasedProject, cb_viewpoint.$const97$isa, (SubLObject)cb_viewpoint.TWO_INTEGER, (SubLObject)cb_viewpoint.ONE_INTEGER, (SubLObject)cb_viewpoint.UNPROVIDED));
        html_utilities.html_select_from_list(PrintLow.format((SubLObject)cb_viewpoint.NIL, (SubLObject)cb_viewpoint.$str98$project1__A, id), default1, all_projects, (SubLObject)cb_viewpoint.UNPROVIDED);
        html_utilities.html_select_from_list(PrintLow.format((SubLObject)cb_viewpoint.NIL, (SubLObject)cb_viewpoint.$str99$project2__A, id), default2, all_projects, (SubLObject)cb_viewpoint.UNPROVIDED);
        html_utilities.html_select_from_list(PrintLow.format((SubLObject)cb_viewpoint.NIL, (SubLObject)cb_viewpoint.$str100$project3__A, id), default3, all_projects, (SubLObject)cb_viewpoint.UNPROVIDED);
        return (SubLObject)cb_viewpoint.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 13234L)
    public static SubLObject cb_get_projects(final SubLObject id, final SubLObject args) {
        return Sequences.delete((SubLObject)cb_viewpoint.NIL, (SubLObject)ConsesLow.list(extract_fort_input(PrintLow.format((SubLObject)cb_viewpoint.NIL, (SubLObject)cb_viewpoint.$str98$project1__A, id), args, (SubLObject)cb_viewpoint.$str101$project), extract_fort_input(PrintLow.format((SubLObject)cb_viewpoint.NIL, (SubLObject)cb_viewpoint.$str99$project2__A, id), args, (SubLObject)cb_viewpoint.$str101$project), extract_fort_input(PrintLow.format((SubLObject)cb_viewpoint.NIL, (SubLObject)cb_viewpoint.$str100$project3__A, id), args, (SubLObject)cb_viewpoint.$str101$project)), (SubLObject)cb_viewpoint.UNPROVIDED, (SubLObject)cb_viewpoint.UNPROVIDED, (SubLObject)cb_viewpoint.UNPROVIDED, (SubLObject)cb_viewpoint.UNPROVIDED, (SubLObject)cb_viewpoint.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 13627L)
    public static SubLObject display_viewpoint_1(final SubLObject arg) {
        return display_viewpoint(arg, (SubLObject)cb_viewpoint.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 13803L)
    public static SubLObject cb_viewpoint(SubLObject args) {
        if (args == cb_viewpoint.UNPROVIDED) {
            args = (SubLObject)cb_viewpoint.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = args;
        SubLObject index_spec = (SubLObject)cb_viewpoint.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_viewpoint.$list104);
        index_spec = current.first();
        current = current.rest();
        if (cb_viewpoint.NIL == current) {
            final SubLObject index_hook = cb_utilities.cb_guess_index(index_spec);
            if (cb_viewpoint.NIL == cb_utilities.cb_index_hook_p(index_hook)) {
                cb_utilities.cb_error((SubLObject)cb_viewpoint.$str105$_a_does_not_specify_an_index, index_hook, (SubLObject)cb_viewpoint.UNPROVIDED, (SubLObject)cb_viewpoint.UNPROVIDED, (SubLObject)cb_viewpoint.UNPROVIDED, (SubLObject)cb_viewpoint.UNPROVIDED);
                return (SubLObject)cb_viewpoint.NIL;
            }
            final SubLObject title_var = (SubLObject)cb_viewpoint.$str106$Viewpoint_Filter_Summary;
            final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
            try {
                html_macros.$html_id_space_id_generator$.bind((cb_viewpoint.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_viewpoint.UNPROVIDED, (SubLObject)cb_viewpoint.UNPROVIDED, (SubLObject)cb_viewpoint.UNPROVIDED), thread);
                html_utilities.html_markup((SubLObject)cb_viewpoint.$str107$__DOCTYPE_html_PUBLIC_____W3C__DT);
                if (cb_viewpoint.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                    html_utilities.html_source_readability_terpri((SubLObject)cb_viewpoint.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_viewpoint.$str108$_meta_http_equiv__X_UA_Compatible);
                }
                html_utilities.html_source_readability_terpri((SubLObject)cb_viewpoint.UNPROVIDED);
                final SubLObject _prev_bind_0_$1 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
                try {
                    cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_viewpoint.$kw109$UNINITIALIZED) ? ConsesLow.list(cb_viewpoint.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                    html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                    html_macros.html_head_content_type();
                    cb_parameters.cb_head_shortcut_icon();
                    html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                    cyc_file_dependencies.css((SubLObject)cb_viewpoint.$kw110$CB_CYC);
                    dhtml_macros.html_basic_cb_scripts();
                    if (cb_viewpoint.NIL != title_var) {
                        html_utilities.html_source_readability_terpri((SubLObject)cb_viewpoint.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                        html_utilities.html_princ(title_var);
                        html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                    }
                    html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_viewpoint.UNPROVIDED);
                    final SubLObject _prev_bind_0_$2 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                    try {
                        html_macros.$html_inside_bodyP$.bind((SubLObject)cb_viewpoint.T, thread);
                        html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                        if (cb_viewpoint.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                            html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_viewpoint.UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_viewpoint.UNPROVIDED);
                        }
                        html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_viewpoint.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_viewpoint.$str113$yui_skin_sam);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_viewpoint.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_viewpoint.UNPROVIDED);
                        final SubLObject _prev_bind_0_$3 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_viewpoint.T, thread);
                            html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_viewpoint.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_viewpoint.$str114$reloadFrameButton);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_viewpoint.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_viewpoint.UNPROVIDED);
                            final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_viewpoint.T, thread);
                                html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_viewpoint.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)cb_viewpoint.$str115$button);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_viewpoint.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_viewpoint.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)cb_viewpoint.$str116$reload);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_viewpoint.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_viewpoint.UNPROVIDED);
                                html_utilities.html_princ((SubLObject)cb_viewpoint.$str117$Refresh_Frames);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_viewpoint.UNPROVIDED);
                                if (cb_viewpoint.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                    html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                                }
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_viewpoint.UNPROVIDED);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$4, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                            if (cb_viewpoint.NIL != title_var) {
                                html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                html_utilities.html_markup((SubLObject)cb_viewpoint.TWO_INTEGER);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_viewpoint.UNPROVIDED);
                                html_utilities.html_princ(title_var);
                                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                html_utilities.html_markup((SubLObject)cb_viewpoint.TWO_INTEGER);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_viewpoint.UNPROVIDED);
                            }
                            final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_viewpoint.NIL);
                            html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_viewpoint.UNPROVIDED);
                            html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_viewpoint.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_viewpoint.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_viewpoint.$str118$post);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_viewpoint.UNPROVIDED);
                            if (cb_viewpoint.NIL != frame_name_var) {
                                html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_viewpoint.UNPROVIDED);
                                html_utilities.html_markup(frame_name_var);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_viewpoint.UNPROVIDED);
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_viewpoint.UNPROVIDED);
                            final SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding(thread);
                            final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_viewpoint.T, thread);
                                html_macros.$within_html_form$.bind((SubLObject)cb_viewpoint.T, thread);
                                html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                html_utilities.html_hidden_input((SubLObject)cb_viewpoint.$str119$cb_viewpoint_summary_handler, (SubLObject)cb_viewpoint.T, (SubLObject)cb_viewpoint.UNPROVIDED);
                                cb_utilities.cb_help_preamble((SubLObject)cb_viewpoint.$kw102$CB_VIEWPOINT, (SubLObject)cb_viewpoint.UNPROVIDED, (SubLObject)cb_viewpoint.UNPROVIDED);
                                html_utilities.html_newline((SubLObject)cb_viewpoint.TWO_INTEGER);
                                html_utilities.html_reset_input((SubLObject)cb_viewpoint.$str120$Current_Values);
                                html_utilities.html_indent((SubLObject)cb_viewpoint.UNPROVIDED);
                                html_utilities.html_submit_input((SubLObject)cb_viewpoint.$str121$Update_Filter_Settings, (SubLObject)cb_viewpoint.UNPROVIDED, (SubLObject)cb_viewpoint.UNPROVIDED);
                                html_utilities.html_newline((SubLObject)cb_viewpoint.UNPROVIDED);
                                cb_adornments.cb_c_index_adornments(index_hook);
                                html_utilities.html_newline((SubLObject)cb_viewpoint.UNPROVIDED);
                                html_utilities.html_checkbox_input((SubLObject)cb_viewpoint.$str122$always_show_comments, (SubLObject)cb_viewpoint.$str122$always_show_comments, cb_parameters.$cb_viewpoint_show_doc_preds$.getDynamicValue(thread), (SubLObject)cb_viewpoint.UNPROVIDED, (SubLObject)cb_viewpoint.UNPROVIDED, (SubLObject)cb_viewpoint.UNPROVIDED);
                                html_utilities.html_glyph((SubLObject)cb_viewpoint.$kw80$NBSP, (SubLObject)cb_viewpoint.UNPROVIDED);
                                html_utilities.html_princ((SubLObject)cb_viewpoint.$str123$Always_show_comments__regardless_);
                                html_utilities.html_newline((SubLObject)cb_viewpoint.UNPROVIDED);
                                html_utilities.html_checkbox_input((SubLObject)cb_viewpoint.$str124$always_show_bookkeeping, (SubLObject)cb_viewpoint.$str124$always_show_bookkeeping, cb_parameters.$cb_viewpoint_show_book_preds$.getDynamicValue(thread), (SubLObject)cb_viewpoint.UNPROVIDED, (SubLObject)cb_viewpoint.UNPROVIDED, (SubLObject)cb_viewpoint.UNPROVIDED);
                                html_utilities.html_glyph((SubLObject)cb_viewpoint.$kw80$NBSP, (SubLObject)cb_viewpoint.UNPROVIDED);
                                html_utilities.html_princ((SubLObject)cb_viewpoint.$str125$Always_show_bookkeeping_predicate);
                                html_utilities.html_newline((SubLObject)cb_viewpoint.TWO_INTEGER);
                                SubLObject cdolist_list_var = cb_viewpoint.$cb_viewpoint_summary_alist$.getGlobalValue();
                                SubLObject viewpoint_summaries = (SubLObject)cb_viewpoint.NIL;
                                viewpoint_summaries = cdolist_list_var.first();
                                while (cb_viewpoint.NIL != cdolist_list_var) {
                                    final SubLObject _prev_bind_0_$6 = cb_viewpoint.$index_hook$.currentBinding(thread);
                                    try {
                                        cb_viewpoint.$index_hook$.bind(index_hook, thread);
                                        if (cb_viewpoint.NIL != conses_high.endp(conses_high.cddr(viewpoint_summaries))) {
                                            display_viewpoint(conses_high.cadr(viewpoint_summaries), (SubLObject)cb_viewpoint.T);
                                        }
                                        else {
                                            Mapping.mapc(Symbols.symbol_function((SubLObject)cb_viewpoint.$sym126$DISPLAY_VIEWPOINT_1), viewpoint_summaries.rest(), cb_viewpoint.EMPTY_SUBL_OBJECT_ARRAY);
                                        }
                                    }
                                    finally {
                                        cb_viewpoint.$index_hook$.rebind(_prev_bind_0_$6, thread);
                                    }
                                    html_utilities.html_newline((SubLObject)cb_viewpoint.UNPROVIDED);
                                    cdolist_list_var = cdolist_list_var.rest();
                                    viewpoint_summaries = cdolist_list_var.first();
                                }
                                html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                            }
                            finally {
                                html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                                html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$5, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri((SubLObject)cb_viewpoint.UNPROVIDED);
                            html_utilities.html_copyright_notice();
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$3, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_viewpoint.UNPROVIDED);
                    }
                    finally {
                        html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$2, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                }
                finally {
                    cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$1, thread);
                }
                html_utilities.html_source_readability_terpri((SubLObject)cb_viewpoint.UNPROVIDED);
            }
            finally {
                html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)cb_viewpoint.$list104);
        }
        return (SubLObject)cb_viewpoint.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 15479L)
    public static SubLObject cb_ev(SubLObject args) {
        if (args == cb_viewpoint.UNPROVIDED) {
            args = (SubLObject)cb_viewpoint.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = args;
        SubLObject summary_name = (SubLObject)cb_viewpoint.NIL;
        SubLObject index_spec = (SubLObject)cb_viewpoint.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_viewpoint.$list129);
        summary_name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_viewpoint.$list129);
        index_spec = current.first();
        current = current.rest();
        if (cb_viewpoint.NIL == current) {
            final SubLObject index_hook = cb_utilities.cb_guess_index(index_spec);
            final SubLObject viewpoints = conses_high.assoc(Packages.intern(summary_name, (SubLObject)cb_viewpoint.UNPROVIDED), cb_viewpoint.$cb_viewpoint_summary_alist$.getGlobalValue(), (SubLObject)cb_viewpoint.UNPROVIDED, (SubLObject)cb_viewpoint.UNPROVIDED).rest();
            if (cb_viewpoint.NIL == cb_utilities.cb_index_hook_p(index_hook)) {
                cb_utilities.cb_error((SubLObject)cb_viewpoint.$str105$_a_does_not_specify_an_index, index_hook, (SubLObject)cb_viewpoint.UNPROVIDED, (SubLObject)cb_viewpoint.UNPROVIDED, (SubLObject)cb_viewpoint.UNPROVIDED, (SubLObject)cb_viewpoint.UNPROVIDED);
                return (SubLObject)cb_viewpoint.NIL;
            }
            final SubLObject title_var = (SubLObject)cb_viewpoint.$str130$Viewpoint_Filters;
            final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
            try {
                html_macros.$html_id_space_id_generator$.bind((cb_viewpoint.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_viewpoint.UNPROVIDED, (SubLObject)cb_viewpoint.UNPROVIDED, (SubLObject)cb_viewpoint.UNPROVIDED), thread);
                html_utilities.html_markup((SubLObject)cb_viewpoint.$str107$__DOCTYPE_html_PUBLIC_____W3C__DT);
                if (cb_viewpoint.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                    html_utilities.html_source_readability_terpri((SubLObject)cb_viewpoint.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_viewpoint.$str108$_meta_http_equiv__X_UA_Compatible);
                }
                html_utilities.html_source_readability_terpri((SubLObject)cb_viewpoint.UNPROVIDED);
                final SubLObject _prev_bind_0_$7 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
                try {
                    cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_viewpoint.$kw109$UNINITIALIZED) ? ConsesLow.list(cb_viewpoint.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                    html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                    html_macros.html_head_content_type();
                    cb_parameters.cb_head_shortcut_icon();
                    html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                    cyc_file_dependencies.css((SubLObject)cb_viewpoint.$kw110$CB_CYC);
                    dhtml_macros.html_basic_cb_scripts();
                    if (cb_viewpoint.NIL != title_var) {
                        html_utilities.html_source_readability_terpri((SubLObject)cb_viewpoint.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                        html_utilities.html_princ(title_var);
                        html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                    }
                    html_complete.html_complete_script();
                    cyc_file_dependencies.css((SubLObject)cb_viewpoint.$kw111$SAM_AUTOCOMPLETE_CSS);
                    html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_viewpoint.UNPROVIDED);
                    final SubLObject _prev_bind_0_$8 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                    try {
                        html_macros.$html_inside_bodyP$.bind((SubLObject)cb_viewpoint.T, thread);
                        html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                        if (cb_viewpoint.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                            html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_viewpoint.UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_viewpoint.UNPROVIDED);
                        }
                        html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_viewpoint.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_viewpoint.$str113$yui_skin_sam);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_viewpoint.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_viewpoint.UNPROVIDED);
                        final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_viewpoint.T, thread);
                            html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_viewpoint.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_viewpoint.$str114$reloadFrameButton);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_viewpoint.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_viewpoint.UNPROVIDED);
                            final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_viewpoint.T, thread);
                                html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_viewpoint.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)cb_viewpoint.$str115$button);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_viewpoint.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_viewpoint.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)cb_viewpoint.$str116$reload);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_viewpoint.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_viewpoint.UNPROVIDED);
                                html_utilities.html_princ((SubLObject)cb_viewpoint.$str117$Refresh_Frames);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_viewpoint.UNPROVIDED);
                                if (cb_viewpoint.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                    html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                                }
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_viewpoint.UNPROVIDED);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$10, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                            if (cb_viewpoint.NIL != title_var) {
                                html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                html_utilities.html_markup((SubLObject)cb_viewpoint.TWO_INTEGER);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_viewpoint.UNPROVIDED);
                                html_utilities.html_princ(title_var);
                                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                html_utilities.html_markup((SubLObject)cb_viewpoint.TWO_INTEGER);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_viewpoint.UNPROVIDED);
                            }
                            final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_viewpoint.NIL);
                            html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_viewpoint.UNPROVIDED);
                            html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_viewpoint.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_viewpoint.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_viewpoint.$str118$post);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_viewpoint.UNPROVIDED);
                            if (cb_viewpoint.NIL != frame_name_var) {
                                html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_viewpoint.UNPROVIDED);
                                html_utilities.html_markup(frame_name_var);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_viewpoint.UNPROVIDED);
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_viewpoint.UNPROVIDED);
                            final SubLObject _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding(thread);
                            final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_viewpoint.T, thread);
                                html_macros.$within_html_form$.bind((SubLObject)cb_viewpoint.T, thread);
                                html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                html_utilities.html_hidden_input((SubLObject)cb_viewpoint.$str131$cb_viewpoint_handler, (SubLObject)ConsesLow.list(summary_name, index_spec), (SubLObject)cb_viewpoint.UNPROVIDED);
                                cb_utilities.cb_back_button((SubLObject)cb_viewpoint.UNPROVIDED, (SubLObject)cb_viewpoint.UNPROVIDED);
                                html_utilities.html_indent((SubLObject)cb_viewpoint.UNPROVIDED);
                                html_utilities.html_reset_input((SubLObject)cb_viewpoint.$str120$Current_Values);
                                html_utilities.html_indent((SubLObject)cb_viewpoint.UNPROVIDED);
                                html_utilities.html_submit_input((SubLObject)cb_viewpoint.$str121$Update_Filter_Settings, (SubLObject)cb_viewpoint.UNPROVIDED, (SubLObject)cb_viewpoint.UNPROVIDED);
                                html_utilities.html_newline((SubLObject)cb_viewpoint.UNPROVIDED);
                                SubLObject cdolist_list_var = viewpoints;
                                SubLObject viewpoint = (SubLObject)cb_viewpoint.NIL;
                                viewpoint = cdolist_list_var.first();
                                while (cb_viewpoint.NIL != cdolist_list_var) {
                                    if (cb_viewpoint.NIL != viewpoint_value_prompt_fn(viewpoint)) {
                                        Functions.funcall(viewpoint_value_prompt_fn(viewpoint), viewpoint, index_hook);
                                    }
                                    cdolist_list_var = cdolist_list_var.rest();
                                    viewpoint = cdolist_list_var.first();
                                }
                                html_utilities.html_newline((SubLObject)cb_viewpoint.UNPROVIDED);
                                html_utilities.html_hr((SubLObject)cb_viewpoint.UNPROVIDED, (SubLObject)cb_viewpoint.UNPROVIDED);
                                html_utilities.html_newline((SubLObject)cb_viewpoint.UNPROVIDED);
                                html_utilities.html_reset_input((SubLObject)cb_viewpoint.$str120$Current_Values);
                                html_utilities.html_indent((SubLObject)cb_viewpoint.UNPROVIDED);
                                html_utilities.html_submit_input((SubLObject)cb_viewpoint.$str121$Update_Filter_Settings, (SubLObject)cb_viewpoint.UNPROVIDED, (SubLObject)cb_viewpoint.UNPROVIDED);
                                html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                            }
                            finally {
                                html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                                html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$11, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri((SubLObject)cb_viewpoint.UNPROVIDED);
                            html_utilities.html_copyright_notice();
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$9, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_viewpoint.UNPROVIDED);
                    }
                    finally {
                        html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$8, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                }
                finally {
                    cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$7, thread);
                }
                html_utilities.html_source_readability_terpri((SubLObject)cb_viewpoint.UNPROVIDED);
            }
            finally {
                html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)cb_viewpoint.$list129);
        }
        return (SubLObject)cb_viewpoint.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 16628L)
    public static SubLObject cb_viewpoint_summary_handler(final SubLObject args) {
        cb_parameters.$cb_viewpoint_show_doc_preds$.setDynamicValue((SubLObject)SubLObjectFactory.makeBoolean(cb_viewpoint.NIL != html_utilities.html_extract_input((SubLObject)cb_viewpoint.$str122$always_show_comments, args)));
        cb_parameters.$cb_viewpoint_show_book_preds$.setDynamicValue((SubLObject)SubLObjectFactory.makeBoolean(cb_viewpoint.NIL != html_utilities.html_extract_input((SubLObject)cb_viewpoint.$str124$always_show_bookkeeping, args)));
        SubLObject cdolist_list_var = cb_viewpoint.$cb_viewpoint_table$.getGlobalValue();
        SubLObject viewpoint = (SubLObject)cb_viewpoint.NIL;
        viewpoint = cdolist_list_var.first();
        while (cb_viewpoint.NIL != cdolist_list_var) {
            _csetf_viewpoint_active_p(viewpoint, (SubLObject)SubLObjectFactory.makeBoolean(cb_viewpoint.NIL != html_utilities.html_extract_input(PrintLow.format((SubLObject)cb_viewpoint.NIL, (SubLObject)cb_viewpoint.$str78$activate__A, viewpoint_name(viewpoint)), args)));
            cdolist_list_var = cdolist_list_var.rest();
            viewpoint = cdolist_list_var.first();
        }
        clear_viewpoint_cache();
        cb_utilities.cb_message_page_with_history((SubLObject)cb_viewpoint.$str133$Summary_filters_have_been_changed, (SubLObject)cb_viewpoint.UNPROVIDED);
        return (SubLObject)cb_viewpoint.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 17201L)
    public static SubLObject cb_viewpoint_handler(final SubLObject args) {
        final SubLObject input = reader.read_from_string(args.first(), (SubLObject)cb_viewpoint.UNPROVIDED, (SubLObject)cb_viewpoint.UNPROVIDED, (SubLObject)cb_viewpoint.UNPROVIDED, (SubLObject)cb_viewpoint.UNPROVIDED, (SubLObject)cb_viewpoint.UNPROVIDED);
        final SubLObject summary_name = Strings.string(input.first());
        final SubLObject index_spec = conses_high.cadr(input);
        SubLObject cdolist_list_var;
        final SubLObject viewpoints = cdolist_list_var = conses_high.assoc(Packages.intern(summary_name, (SubLObject)cb_viewpoint.UNPROVIDED), cb_viewpoint.$cb_viewpoint_summary_alist$.getGlobalValue(), (SubLObject)cb_viewpoint.UNPROVIDED, (SubLObject)cb_viewpoint.UNPROVIDED).rest();
        SubLObject viewpoint = (SubLObject)cb_viewpoint.NIL;
        viewpoint = cdolist_list_var.first();
        while (cb_viewpoint.NIL != cdolist_list_var) {
            if (cb_viewpoint.NIL != viewpoint_value_update_fn(viewpoint)) {
                Functions.funcall(viewpoint_value_update_fn(viewpoint), viewpoint, args);
            }
            cdolist_list_var = cdolist_list_var.rest();
            viewpoint = cdolist_list_var.first();
        }
        clear_viewpoint_cache();
        cb_viewpoint((SubLObject)ConsesLow.list(index_spec));
        return (SubLObject)cb_viewpoint.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 17793L)
    public static SubLObject cb_link_viewpoint(final SubLObject index_hook, SubLObject linktext) {
        if (linktext == cb_viewpoint.UNPROVIDED) {
            linktext = (SubLObject)cb_viewpoint.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_viewpoint.NIL == linktext) {
            linktext = (SubLObject)cb_viewpoint.$str136$_Viewpoint_;
        }
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_viewpoint.$kw137$MAIN);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_viewpoint.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_viewpoint.$str138$cb_viewpoint__A, cb_utilities.cb_index_identifier(index_hook));
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_viewpoint.UNPROVIDED);
        if (cb_viewpoint.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_viewpoint.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_viewpoint.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_viewpoint.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_viewpoint.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return index_hook;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 18056L)
    public static SubLObject common_prompt_prefix(final SubLObject viewpoint, final SubLObject index_hook) {
        html_utilities.html_hr((SubLObject)cb_viewpoint.UNPROVIDED, (SubLObject)cb_viewpoint.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
        if (cb_viewpoint.NIL != viewpoint_linkname_prefix(viewpoint)) {
            html_utilities.html_princ(viewpoint_linkname_prefix(viewpoint));
        }
        html_utilities.html_princ((SubLObject)cb_viewpoint.$str141$_);
        cb_utilities.cb_form(viewpoint_linkable_name(viewpoint), (SubLObject)cb_viewpoint.UNPROVIDED, (SubLObject)cb_viewpoint.UNPROVIDED);
        html_utilities.html_princ((SubLObject)cb_viewpoint.$str142$_Filter);
        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        html_utilities.html_newline((SubLObject)cb_viewpoint.UNPROVIDED);
        return (SubLObject)cb_viewpoint.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 18468L)
    public static SubLObject prompt_for_list_of_cyclists(final SubLObject viewpoint, final SubLObject index_hook) {
        common_prompt_prefix(viewpoint, index_hook);
        html_utilities.html_indent((SubLObject)cb_viewpoint.TWO_INTEGER);
        html_utilities.html_princ((SubLObject)cb_viewpoint.$str143$_Only_those_terms_whose_);
        cb_utilities.cb_form(viewpoint_linkable_name(viewpoint), (SubLObject)cb_viewpoint.UNPROVIDED, (SubLObject)cb_viewpoint.UNPROVIDED);
        html_utilities.html_princ((SubLObject)cb_viewpoint.$str144$_field_has_a_value_equal_to_a_ter);
        html_utilities.html_newline((SubLObject)cb_viewpoint.UNPROVIDED);
        Functions.apply(Symbols.symbol_function((SubLObject)cb_viewpoint.$sym145$CB_PROMPT_CYCLISTS), (SubLObject)ConsesLow.cons(viewpoint_name(viewpoint), Functions.funcall(viewpoint_filter_getter(viewpoint))));
        return (SubLObject)cb_viewpoint.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 18947L)
    public static SubLObject prompt_for_date(final SubLObject viewpoint, final SubLObject index_hook) {
        common_prompt_prefix(viewpoint, index_hook);
        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_utilities.html_princ((SubLObject)cb_viewpoint.$str146$Activate_Filter);
        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        html_utilities.html_newline((SubLObject)cb_viewpoint.UNPROVIDED);
        html_utilities.html_indent((SubLObject)cb_viewpoint.SIX_INTEGER);
        html_utilities.html_checkbox_input(PrintLow.format((SubLObject)cb_viewpoint.NIL, (SubLObject)cb_viewpoint.$str147$all_dates__A, viewpoint_name(viewpoint)), (SubLObject)cb_viewpoint.$str148$no, viewpoint_active_p(viewpoint), (SubLObject)cb_viewpoint.UNPROVIDED, (SubLObject)cb_viewpoint.UNPROVIDED, (SubLObject)cb_viewpoint.UNPROVIDED);
        html_utilities.html_indent((SubLObject)cb_viewpoint.FOUR_INTEGER);
        cb_utilities.prompt_for_simple_date(Functions.funcall(viewpoint_filter_getter(viewpoint)), PrintLow.format((SubLObject)cb_viewpoint.NIL, (SubLObject)cb_viewpoint.$str149$cb_show_start__A, viewpoint_name(viewpoint)));
        return (SubLObject)cb_viewpoint.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 19432L)
    public static SubLObject prompt_for_mt(final SubLObject viewpoint, final SubLObject index_hook) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        common_prompt_prefix(viewpoint, index_hook);
        html_utilities.html_newline((SubLObject)cb_viewpoint.UNPROVIDED);
        final SubLObject relevant_mts = kb_indexing.mts_of_indexed_term(index_hook);
        final SubLObject temp_list = conses_high.copy_list(relevant_mts);
        final SubLObject mts_list = kb_utilities.sort_terms(conses_high.union(temp_list, conses_high.copy_list(cb_mts_filter()), (SubLObject)cb_viewpoint.UNPROVIDED, (SubLObject)cb_viewpoint.UNPROVIDED), (SubLObject)cb_viewpoint.NIL, (SubLObject)cb_viewpoint.NIL, (SubLObject)cb_viewpoint.T, (SubLObject)cb_viewpoint.UNPROVIDED, (SubLObject)cb_viewpoint.UNPROVIDED, (SubLObject)cb_viewpoint.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_viewpoint.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_viewpoint.ZERO_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_viewpoint.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_viewpoint.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_viewpoint.ZERO_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_viewpoint.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_viewpoint.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_viewpoint.ZERO_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_viewpoint.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_viewpoint.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        final SubLObject _prev_bind_2 = html_macros.$html_indent_table_max$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_viewpoint.T, thread);
            html_macros.$html_indent_table_max$.bind((SubLObject)cb_viewpoint.THREE_INTEGER, thread);
            SubLObject indent = (SubLObject)cb_viewpoint.ZERO_INTEGER;
            SubLObject span = Numbers.max((SubLObject)cb_viewpoint.ONE_INTEGER, Numbers.subtract(html_macros.$html_indent_table_max$.getDynamicValue(thread), indent));
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_viewpoint.UNPROVIDED);
            final SubLObject _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_viewpoint.T, thread);
                html_utilities.html_indent_row_internal(indent);
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                if (cb_viewpoint.NIL != span) {
                    html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_viewpoint.UNPROVIDED);
                    html_utilities.html_markup(span);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_viewpoint.UNPROVIDED);
                }
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_viewpoint.UNPROVIDED);
                final SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_viewpoint.T, thread);
                    html_utilities.html_radio_input((SubLObject)cb_viewpoint.$str150$all, (SubLObject)cb_viewpoint.$str151$yes, (SubLObject)SubLObjectFactory.makeBoolean(cb_viewpoint.NIL == active_filter_p((SubLObject)cb_viewpoint.$sym152$MTS)), (SubLObject)cb_viewpoint.UNPROVIDED);
                    html_utilities.html_indent((SubLObject)cb_viewpoint.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    html_utilities.html_princ((SubLObject)cb_viewpoint.$str153$All_Mts);
                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                    html_utilities.html_newline((SubLObject)cb_viewpoint.UNPROVIDED);
                    html_utilities.html_radio_input((SubLObject)cb_viewpoint.$str150$all, (SubLObject)cb_viewpoint.$str148$no, active_filter_p((SubLObject)cb_viewpoint.$sym152$MTS), (SubLObject)cb_viewpoint.UNPROVIDED);
                    html_utilities.html_indent((SubLObject)cb_viewpoint.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    html_utilities.html_princ((SubLObject)cb_viewpoint.$str154$Specify_Mts);
                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$13, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$12, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_viewpoint.UNPROVIDED);
            indent = (SubLObject)cb_viewpoint.ONE_INTEGER;
            span = Numbers.max((SubLObject)cb_viewpoint.ONE_INTEGER, Numbers.subtract(html_macros.$html_indent_table_max$.getDynamicValue(thread), indent));
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_viewpoint.UNPROVIDED);
            final SubLObject _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_viewpoint.T, thread);
                html_utilities.html_indent_row_internal(indent);
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                if (cb_viewpoint.NIL != span) {
                    html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_viewpoint.UNPROVIDED);
                    html_utilities.html_markup(span);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_viewpoint.UNPROVIDED);
                }
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_viewpoint.UNPROVIDED);
                final SubLObject _prev_bind_0_$15 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_viewpoint.T, thread);
                    html_utilities.html_checkbox_input((SubLObject)cb_viewpoint.$str155$use_genl_mt, (SubLObject)cb_viewpoint.$str151$yes, cb_parameters.cb_mts_filter_use_genlmt(), (SubLObject)cb_viewpoint.UNPROVIDED, (SubLObject)cb_viewpoint.UNPROVIDED, (SubLObject)cb_viewpoint.UNPROVIDED);
                    html_utilities.html_indent((SubLObject)cb_viewpoint.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    html_utilities.html_princ((SubLObject)cb_viewpoint.$str156$Include_All_Genl_Mts);
                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                    html_utilities.html_newline((SubLObject)cb_viewpoint.UNPROVIDED);
                    SubLObject cdolist_list_var = mts_list;
                    SubLObject mt = (SubLObject)cb_viewpoint.NIL;
                    mt = cdolist_list_var.first();
                    while (cb_viewpoint.NIL != cdolist_list_var) {
                        html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                        html_utilities.html_checkbox_input((SubLObject)cb_viewpoint.$str157$new_mt, mt, conses_high.member(mt, cb_mts_filter(), (SubLObject)cb_viewpoint.UNPROVIDED, (SubLObject)cb_viewpoint.UNPROVIDED), (SubLObject)cb_viewpoint.UNPROVIDED, (SubLObject)cb_viewpoint.UNPROVIDED, (SubLObject)cb_viewpoint.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                        if (cb_viewpoint.NIL != subl_promotions.memberP(mt, relevant_mts, (SubLObject)cb_viewpoint.UNPROVIDED, (SubLObject)cb_viewpoint.UNPROVIDED)) {
                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            cb_utilities.cb_form(mt, (SubLObject)cb_viewpoint.UNPROVIDED, (SubLObject)cb_viewpoint.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                        }
                        else {
                            cb_utilities.cb_form(mt, (SubLObject)cb_viewpoint.UNPROVIDED, (SubLObject)cb_viewpoint.UNPROVIDED);
                        }
                        html_utilities.html_indent((SubLObject)cb_viewpoint.TWO_INTEGER);
                        cdolist_list_var = cdolist_list_var.rest();
                        mt = cdolist_list_var.first();
                    }
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$15, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$14, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_viewpoint.UNPROVIDED);
            html_utilities.html_indent_table_internal((SubLObject)cb_viewpoint.THREE_INTEGER);
        }
        finally {
            html_macros.$html_indent_table_max$.rebind(_prev_bind_2, thread);
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return (SubLObject)cb_viewpoint.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 21622L)
    public static SubLObject prompt_for_cycbasedproject(final SubLObject viewpoint, final SubLObject index_hook) {
        common_prompt_prefix(viewpoint, index_hook);
        html_utilities.html_newline((SubLObject)cb_viewpoint.UNPROVIDED);
        html_utilities.html_princ((SubLObject)cb_viewpoint.$str143$_Only_those_terms_whose_);
        cb_utilities.cb_form(viewpoint_linkable_name(viewpoint), (SubLObject)cb_viewpoint.UNPROVIDED, (SubLObject)cb_viewpoint.UNPROVIDED);
        html_utilities.html_princ((SubLObject)cb_viewpoint.$str144$_field_has_a_value_equal_to_a_ter);
        html_utilities.html_newline((SubLObject)cb_viewpoint.UNPROVIDED);
        Functions.apply(Symbols.symbol_function((SubLObject)cb_viewpoint.$sym158$CB_PROMPT_PROJECTS), (SubLObject)ConsesLow.cons(viewpoint_name(viewpoint), Functions.funcall(viewpoint_filter_getter(viewpoint))));
        return (SubLObject)cb_viewpoint.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 22099L)
    public static SubLObject receive_list_of_cyclists(final SubLObject viewpoint, final SubLObject args) {
        final SubLObject v_new = cb_get_cyclists(viewpoint_name(viewpoint), args);
        Functions.funcall(viewpoint_filter_setter(viewpoint), v_new);
        _csetf_viewpoint_active_p(viewpoint, (SubLObject)SubLObjectFactory.makeBoolean(cb_viewpoint.NIL != v_new));
        return (SubLObject)cb_viewpoint.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 22353L)
    public static SubLObject receive_list_of_projects(final SubLObject viewpoint, final SubLObject args) {
        final SubLObject v_new = cb_get_projects(viewpoint_name(viewpoint), args);
        Functions.funcall(viewpoint_filter_setter(viewpoint), v_new);
        _csetf_viewpoint_active_p(viewpoint, (SubLObject)SubLObjectFactory.makeBoolean(cb_viewpoint.NIL != v_new));
        return (SubLObject)cb_viewpoint.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 22609L)
    public static SubLObject receive_date(final SubLObject viewpoint, final SubLObject args) {
        final SubLObject all_datesP = html_utilities.html_extract_input(PrintLow.format((SubLObject)cb_viewpoint.NIL, (SubLObject)cb_viewpoint.$str147$all_dates__A, viewpoint_name(viewpoint)), args);
        if (all_datesP.equal((SubLObject)cb_viewpoint.$str148$no)) {
            _csetf_viewpoint_active_p(viewpoint, (SubLObject)cb_viewpoint.T);
            Functions.funcall(viewpoint_filter_setter(viewpoint), cb_utilities.read_args_for_simple_date(PrintLow.format((SubLObject)cb_viewpoint.NIL, (SubLObject)cb_viewpoint.$str149$cb_show_start__A, viewpoint_name(viewpoint)), args));
        }
        else {
            _csetf_viewpoint_active_p(viewpoint, (SubLObject)cb_viewpoint.NIL);
        }
        return (SubLObject)cb_viewpoint.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 23138L)
    public static SubLObject receive_mt(final SubLObject viewpoint, final SubLObject args) {
        final SubLObject selected_allP = html_utilities.html_extract_input((SubLObject)cb_viewpoint.$str150$all, args);
        final SubLObject selected_use_genlsP = html_utilities.html_extract_input((SubLObject)cb_viewpoint.$str155$use_genl_mt, args);
        final SubLObject selections = html_utilities.html_extract_input_values((SubLObject)cb_viewpoint.$str157$new_mt, args);
        if (cb_viewpoint.NIL != selected_use_genlsP) {
            cb_parameters.set_cb_mts_filter_use_genlmt((SubLObject)cb_viewpoint.T);
        }
        else {
            cb_parameters.set_cb_mts_filter_use_genlmt((SubLObject)cb_viewpoint.NIL);
        }
        if (selected_allP.equal((SubLObject)cb_viewpoint.$str151$yes)) {
            _csetf_viewpoint_active_p(viewpoint, (SubLObject)cb_viewpoint.NIL);
            Functions.funcall(viewpoint_filter_setter(viewpoint), (SubLObject)cb_viewpoint.NIL);
        }
        else {
            _csetf_viewpoint_active_p(viewpoint, (SubLObject)cb_viewpoint.T);
            Functions.funcall(viewpoint_filter_setter(viewpoint), (SubLObject)cb_viewpoint.NIL);
            SubLObject cdolist_list_var = selections;
            SubLObject new_mt = (SubLObject)cb_viewpoint.NIL;
            new_mt = cdolist_list_var.first();
            while (cb_viewpoint.NIL != cdolist_list_var) {
                Functions.funcall(viewpoint_filter_setter(viewpoint), (SubLObject)ConsesLow.cons(cb_utilities.cb_guess_fort(new_mt, (SubLObject)cb_viewpoint.UNPROVIDED), Functions.funcall(viewpoint_filter_getter(viewpoint))));
                cdolist_list_var = cdolist_list_var.rest();
                new_mt = cdolist_list_var.first();
            }
        }
        return (SubLObject)cb_viewpoint.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 24133L)
    public static SubLObject cb_set_microtheory_browsing_filter_viewpoint(final SubLObject mt) {
        final SubLObject viewpoint = find_viewpoint((SubLObject)cb_viewpoint.$sym152$MTS);
        if (cb_viewpoint.NIL != kb_utilities.kbeq(mt, cb_viewpoint.$const159$EverythingPSC)) {
            _csetf_viewpoint_active_p(viewpoint, (SubLObject)cb_viewpoint.NIL);
            cb_parameters.set_cb_mts_filter_use_genlmt((SubLObject)cb_viewpoint.NIL);
            Functions.funcall(viewpoint_filter_setter(viewpoint), (SubLObject)cb_viewpoint.NIL);
        }
        else {
            _csetf_viewpoint_active_p(viewpoint, (SubLObject)cb_viewpoint.T);
            cb_parameters.set_cb_mts_filter_use_genlmt((SubLObject)cb_viewpoint.T);
            Functions.funcall(viewpoint_filter_setter(viewpoint), (SubLObject)ConsesLow.list(mt));
        }
        return (SubLObject)cb_viewpoint.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 24700L)
    public static SubLObject assertion_before_date(final SubLObject assertion) {
        return (SubLObject)SubLObjectFactory.makeBoolean(cb_viewpoint.NIL != doc_predicate_p(assertion) || cb_viewpoint.NIL == assertions_high.asserted_when(assertion) || assertions_high.asserted_when(assertion).numLE(cb_assertion_end_date_filter()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 24915L)
    public static SubLObject assertion_after_date(final SubLObject assertion) {
        return (SubLObject)SubLObjectFactory.makeBoolean(cb_viewpoint.NIL != doc_predicate_p(assertion) || cb_viewpoint.NIL == assertions_high.asserted_when(assertion) || cb_assertion_start_date_filter().numLE(assertions_high.asserted_when(assertion)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 25151L)
    public static SubLObject cb_use_mycreator_filter() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return cb_viewpoint.$cb_use_mycreator_filter$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 25151L)
    public static SubLObject set_cb_use_mycreator_filter(final SubLObject new_value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        cb_viewpoint.$cb_use_mycreator_filter$.setDynamicValue(new_value, thread);
        return cb_viewpoint.$cb_use_mycreator_filter$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 25151L)
    public static SubLObject cb_mycreator_filter() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return cb_viewpoint.$cb_mycreator_filter$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 25151L)
    public static SubLObject set_cb_mycreator_filter(final SubLObject new_value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        cb_viewpoint.$cb_mycreator_filter$.setDynamicValue(new_value, thread);
        return cb_viewpoint.$cb_mycreator_filter$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 25151L)
    public static SubLObject mycreator_effective_fn(final SubLObject assertion) {
        if (cb_viewpoint.NIL == assertion_handles.assertion_p(assertion)) {
            Errors.sublisp_break((SubLObject)cb_viewpoint.$str167$not_an_assertion, cb_viewpoint.EMPTY_SUBL_OBJECT_ARRAY);
        }
        if (cb_viewpoint.NIL != doc_predicate_p(assertion)) {
            return (SubLObject)cb_viewpoint.T;
        }
        final SubLObject viewpoint = find_viewpoint((SubLObject)cb_viewpoint.$sym162$MYCREATOR);
        return conses_high.member(Functions.funcall(viewpoint_effective_fn_slotname(viewpoint), assertion), Functions.funcall(viewpoint_filter_getter(viewpoint)), (SubLObject)cb_viewpoint.UNPROVIDED, (SubLObject)cb_viewpoint.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 25374L)
    public static SubLObject cb_use_myreviewer_filter() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return cb_viewpoint.$cb_use_myreviewer_filter$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 25374L)
    public static SubLObject set_cb_use_myreviewer_filter(final SubLObject new_value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        cb_viewpoint.$cb_use_myreviewer_filter$.setDynamicValue(new_value, thread);
        return cb_viewpoint.$cb_use_myreviewer_filter$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 25374L)
    public static SubLObject cb_myreviewer_filter() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return cb_viewpoint.$cb_myreviewer_filter$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 25374L)
    public static SubLObject set_cb_myreviewer_filter(final SubLObject new_value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        cb_viewpoint.$cb_myreviewer_filter$.setDynamicValue(new_value, thread);
        return cb_viewpoint.$cb_myreviewer_filter$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 25374L)
    public static SubLObject myreviewer_effective_fn(final SubLObject assertion) {
        if (cb_viewpoint.NIL == assertion_handles.assertion_p(assertion)) {
            Errors.sublisp_break((SubLObject)cb_viewpoint.$str167$not_an_assertion, cb_viewpoint.EMPTY_SUBL_OBJECT_ARRAY);
        }
        if (cb_viewpoint.NIL != doc_predicate_p(assertion)) {
            return (SubLObject)cb_viewpoint.T;
        }
        final SubLObject viewpoint = find_viewpoint((SubLObject)cb_viewpoint.$sym170$MYREVIEWER);
        return conses_high.member(Functions.funcall(viewpoint_effective_fn_slotname(viewpoint), assertion), Functions.funcall(viewpoint_filter_getter(viewpoint)), (SubLObject)cb_viewpoint.UNPROVIDED, (SubLObject)cb_viewpoint.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 25616L)
    public static SubLObject cb_use_assertion_start_date_filter() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return cb_viewpoint.$cb_use_assertion_start_date_filter$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 25616L)
    public static SubLObject set_cb_use_assertion_start_date_filter(final SubLObject new_value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        cb_viewpoint.$cb_use_assertion_start_date_filter$.setDynamicValue(new_value, thread);
        return cb_viewpoint.$cb_use_assertion_start_date_filter$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 25616L)
    public static SubLObject cb_assertion_start_date_filter() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return cb_viewpoint.$cb_assertion_start_date_filter$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 25616L)
    public static SubLObject set_cb_assertion_start_date_filter(final SubLObject new_value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        cb_viewpoint.$cb_assertion_start_date_filter$.setDynamicValue(new_value, thread);
        return cb_viewpoint.$cb_assertion_start_date_filter$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 25912L)
    public static SubLObject cb_use_assertion_end_date_filter() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return cb_viewpoint.$cb_use_assertion_end_date_filter$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 25912L)
    public static SubLObject set_cb_use_assertion_end_date_filter(final SubLObject new_value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        cb_viewpoint.$cb_use_assertion_end_date_filter$.setDynamicValue(new_value, thread);
        return cb_viewpoint.$cb_use_assertion_end_date_filter$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 25912L)
    public static SubLObject cb_assertion_end_date_filter() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return cb_viewpoint.$cb_assertion_end_date_filter$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 25912L)
    public static SubLObject set_cb_assertion_end_date_filter(final SubLObject new_value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        cb_viewpoint.$cb_assertion_end_date_filter$.setDynamicValue(new_value, thread);
        return cb_viewpoint.$cb_assertion_end_date_filter$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 26208L)
    public static SubLObject cb_use_mts_filter() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return cb_viewpoint.$cb_use_mts_filter$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 26208L)
    public static SubLObject set_cb_use_mts_filter(final SubLObject new_value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        cb_viewpoint.$cb_use_mts_filter$.setDynamicValue(new_value, thread);
        return cb_viewpoint.$cb_use_mts_filter$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 26208L)
    public static SubLObject cb_mts_filter() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return cb_viewpoint.$cb_mts_filter$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 26208L)
    public static SubLObject set_cb_mts_filter(final SubLObject new_value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        cb_viewpoint.$cb_mts_filter$.setDynamicValue(new_value, thread);
        return cb_viewpoint.$cb_mts_filter$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 26439L)
    public static SubLObject cb_use_mycreationpurpose_filter() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return cb_viewpoint.$cb_use_mycreationpurpose_filter$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 26439L)
    public static SubLObject set_cb_use_mycreationpurpose_filter(final SubLObject new_value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        cb_viewpoint.$cb_use_mycreationpurpose_filter$.setDynamicValue(new_value, thread);
        return cb_viewpoint.$cb_use_mycreationpurpose_filter$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 26439L)
    public static SubLObject cb_mycreationpurpose_filter() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return cb_viewpoint.$cb_mycreationpurpose_filter$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 26439L)
    public static SubLObject set_cb_mycreationpurpose_filter(final SubLObject new_value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        cb_viewpoint.$cb_mycreationpurpose_filter$.setDynamicValue(new_value, thread);
        return cb_viewpoint.$cb_mycreationpurpose_filter$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 26439L)
    public static SubLObject mycreationpurpose_effective_fn(final SubLObject assertion) {
        if (cb_viewpoint.NIL == assertion_handles.assertion_p(assertion)) {
            Errors.sublisp_break((SubLObject)cb_viewpoint.$str167$not_an_assertion, cb_viewpoint.EMPTY_SUBL_OBJECT_ARRAY);
        }
        if (cb_viewpoint.NIL != doc_predicate_p(assertion)) {
            return (SubLObject)cb_viewpoint.T;
        }
        final SubLObject viewpoint = find_viewpoint((SubLObject)cb_viewpoint.$sym194$MYCREATIONPURPOSE);
        return conses_high.member(Functions.funcall(viewpoint_effective_fn_slotname(viewpoint), assertion), Functions.funcall(viewpoint_filter_getter(viewpoint)), (SubLObject)cb_viewpoint.UNPROVIDED, (SubLObject)cb_viewpoint.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 26689L)
    public static SubLObject cb_calc_filter_hooks() {
        final SubLObject active = active_filters((SubLObject)cb_viewpoint.UNPROVIDED);
        if (cb_viewpoint.NIL == active) {
            return (SubLObject)cb_viewpoint.NIL;
        }
        if (cb_viewpoint.NIL != conses_high.endp(active.rest())) {
            return viewpoint_effective_fn(active.first());
        }
        return (SubLObject)cb_viewpoint.$sym199$CB_ONLINE_FILTER_HOOKS;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 27090L)
    public static SubLObject cb_online_filter_hooks(final SubLObject assertion) {
        SubLObject cdolist_list_var;
        final SubLObject active = cdolist_list_var = active_filters((SubLObject)cb_viewpoint.UNPROVIDED);
        SubLObject filter = (SubLObject)cb_viewpoint.NIL;
        filter = cdolist_list_var.first();
        while (cb_viewpoint.NIL != cdolist_list_var) {
            if (cb_viewpoint.NIL == Functions.funcall(viewpoint_effective_fn(filter), assertion)) {
                return (SubLObject)cb_viewpoint.NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            filter = cdolist_list_var.first();
        }
        return (SubLObject)cb_viewpoint.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 27383L)
    public static SubLObject with_assertion_filters(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.list((SubLObject)cb_viewpoint.$sym73$CLET, (SubLObject)cb_viewpoint.$list200, reader.bq_cons((SubLObject)cb_viewpoint.$sym63$PROGN, ConsesLow.append(body, (SubLObject)cb_viewpoint.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 27523L)
    public static SubLObject find_relevant_key(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject answer_list = (SubLObject)cb_viewpoint.NIL;
        SubLObject mt_getter = (SubLObject)cb_viewpoint.NIL;
        SubLObject getter = (SubLObject)cb_viewpoint.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_viewpoint.$list201);
        answer_list = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_viewpoint.$list201);
        mt_getter = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_viewpoint.$list201);
        getter = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)cb_viewpoint.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)cb_viewpoint.NIL;
        SubLObject current_$16 = (SubLObject)cb_viewpoint.NIL;
        while (cb_viewpoint.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)cb_viewpoint.$list201);
            current_$16 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)cb_viewpoint.$list201);
            if (cb_viewpoint.NIL == conses_high.member(current_$16, (SubLObject)cb_viewpoint.$list202, (SubLObject)cb_viewpoint.UNPROVIDED, (SubLObject)cb_viewpoint.UNPROVIDED)) {
                bad = (SubLObject)cb_viewpoint.T;
            }
            if (current_$16 == cb_viewpoint.$kw203$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (cb_viewpoint.NIL != bad && cb_viewpoint.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)cb_viewpoint.$list201);
        }
        final SubLObject specified_mt_tail = cdestructuring_bind.property_list_member((SubLObject)cb_viewpoint.$kw204$SPECIFIED_MT, current);
        final SubLObject specified_mt = (SubLObject)((cb_viewpoint.NIL != specified_mt_tail) ? conses_high.cadr(specified_mt_tail) : cb_viewpoint.NIL);
        return (SubLObject)ConsesLow.list((SubLObject)cb_viewpoint.$sym205$WITH_ASSERTION_FILTERS, (SubLObject)ConsesLow.list((SubLObject)cb_viewpoint.$sym206$PCOND, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)cb_viewpoint.$sym207$CAND, (SubLObject)cb_viewpoint.$list208, (SubLObject)ConsesLow.list((SubLObject)cb_viewpoint.$sym209$CNOT, specified_mt)), (SubLObject)ConsesLow.list((SubLObject)cb_viewpoint.$sym210$PIF, (SubLObject)cb_viewpoint.$list211, (SubLObject)ConsesLow.list((SubLObject)cb_viewpoint.$sym212$WITH_MT_LIST_AND_GENL_MTS, (SubLObject)cb_viewpoint.$list213, (SubLObject)ConsesLow.list((SubLObject)cb_viewpoint.$sym214$CSETQ, answer_list, mt_getter)), (SubLObject)ConsesLow.list((SubLObject)cb_viewpoint.$sym215$WITH_MT_LIST, (SubLObject)cb_viewpoint.$list213, (SubLObject)ConsesLow.list((SubLObject)cb_viewpoint.$sym214$CSETQ, answer_list, mt_getter)))), (SubLObject)ConsesLow.list((SubLObject)cb_viewpoint.T, (SubLObject)ConsesLow.list((SubLObject)cb_viewpoint.$sym214$CSETQ, answer_list, getter))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 28127L)
    public static SubLObject count_relevant(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject filtered = (SubLObject)cb_viewpoint.NIL;
        SubLObject unfiltered = (SubLObject)cb_viewpoint.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_viewpoint.$list216);
        filtered = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_viewpoint.$list216);
        unfiltered = current.first();
        current = current.rest();
        if (cb_viewpoint.NIL == current) {
            final SubLObject result = (SubLObject)cb_viewpoint.$sym217$RESULT;
            return (SubLObject)ConsesLow.list((SubLObject)cb_viewpoint.$sym73$CLET, (SubLObject)ConsesLow.list(result), (SubLObject)ConsesLow.list((SubLObject)cb_viewpoint.$sym205$WITH_ASSERTION_FILTERS, (SubLObject)ConsesLow.list((SubLObject)cb_viewpoint.$sym210$PIF, (SubLObject)cb_viewpoint.$list208, (SubLObject)ConsesLow.list((SubLObject)cb_viewpoint.$sym214$CSETQ, result, filtered), (SubLObject)ConsesLow.list((SubLObject)cb_viewpoint.$sym214$CSETQ, result, unfiltered))), (SubLObject)ConsesLow.list((SubLObject)cb_viewpoint.$sym218$RET, result));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)cb_viewpoint.$list216);
        return (SubLObject)cb_viewpoint.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 28442L)
    public static SubLObject cb_link_edit_viewpoint(final SubLObject viewpoint, SubLObject linktext, SubLObject index_hook) {
        if (linktext == cb_viewpoint.UNPROVIDED) {
            linktext = (SubLObject)cb_viewpoint.NIL;
        }
        if (index_hook == cb_viewpoint.UNPROVIDED) {
            index_hook = (SubLObject)cb_viewpoint.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_viewpoint.NIL == linktext) {
            linktext = viewpoint_name(viewpoint);
        }
        SubLObject handler = (SubLObject)cb_viewpoint.$str219$cb_ev;
        final SubLObject frame = cb_parameters.$cb_default_term_frame$.getDynamicValue(thread);
        if (frame == cb_viewpoint.$kw220$TOP) {
            handler = (SubLObject)cb_viewpoint.$str221$cb_start_cb_ev;
        }
        final SubLObject frame_name_var = cb_utilities.cb_frame_name(frame);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_viewpoint.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        if (cb_viewpoint.NIL != index_hook) {
            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_viewpoint.$str222$_a__a__a, new SubLObject[] { handler, viewpoint_summary_name(viewpoint), index_hook });
        }
        else {
            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_viewpoint.$str223$_a__a, handler, viewpoint_summary_name(viewpoint));
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_viewpoint.UNPROVIDED);
        if (cb_viewpoint.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_viewpoint.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_viewpoint.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_viewpoint.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_viewpoint.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return viewpoint;
    }
    
    public static SubLObject declare_cb_viewpoint_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_viewpoint", "print_viewpoint", "PRINT-VIEWPOINT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_viewpoint", "viewpoint_print_function_trampoline", "VIEWPOINT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_viewpoint", "viewpoint_p", "VIEWPOINT-P", 1, 0, false);
        new $viewpoint_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_viewpoint", "viewpoint_name", "VIEWPOINT-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_viewpoint", "viewpoint_summary_name", "VIEWPOINT-SUMMARY-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_viewpoint", "viewpoint_linkable_name", "VIEWPOINT-LINKABLE-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_viewpoint", "viewpoint_linkname_prefix", "VIEWPOINT-LINKNAME-PREFIX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_viewpoint", "viewpoint_filter_getter", "VIEWPOINT-FILTER-GETTER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_viewpoint", "viewpoint_filter_setter", "VIEWPOINT-FILTER-SETTER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_viewpoint", "viewpoint_type", "VIEWPOINT-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_viewpoint", "viewpoint_active_p", "VIEWPOINT-ACTIVE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_viewpoint", "viewpoint_effective_fn", "VIEWPOINT-EFFECTIVE-FN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_viewpoint", "viewpoint_value_prompt_fn", "VIEWPOINT-VALUE-PROMPT-FN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_viewpoint", "viewpoint_value_update_fn", "VIEWPOINT-VALUE-UPDATE-FN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_viewpoint", "viewpoint_initial_filter_value", "VIEWPOINT-INITIAL-FILTER-VALUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_viewpoint", "viewpoint_effective_fn_slotname", "VIEWPOINT-EFFECTIVE-FN-SLOTNAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_viewpoint", "_csetf_viewpoint_name", "_CSETF-VIEWPOINT-NAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_viewpoint", "_csetf_viewpoint_summary_name", "_CSETF-VIEWPOINT-SUMMARY-NAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_viewpoint", "_csetf_viewpoint_linkable_name", "_CSETF-VIEWPOINT-LINKABLE-NAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_viewpoint", "_csetf_viewpoint_linkname_prefix", "_CSETF-VIEWPOINT-LINKNAME-PREFIX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_viewpoint", "_csetf_viewpoint_filter_getter", "_CSETF-VIEWPOINT-FILTER-GETTER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_viewpoint", "_csetf_viewpoint_filter_setter", "_CSETF-VIEWPOINT-FILTER-SETTER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_viewpoint", "_csetf_viewpoint_type", "_CSETF-VIEWPOINT-TYPE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_viewpoint", "_csetf_viewpoint_active_p", "_CSETF-VIEWPOINT-ACTIVE-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_viewpoint", "_csetf_viewpoint_effective_fn", "_CSETF-VIEWPOINT-EFFECTIVE-FN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_viewpoint", "_csetf_viewpoint_value_prompt_fn", "_CSETF-VIEWPOINT-VALUE-PROMPT-FN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_viewpoint", "_csetf_viewpoint_value_update_fn", "_CSETF-VIEWPOINT-VALUE-UPDATE-FN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_viewpoint", "_csetf_viewpoint_initial_filter_value", "_CSETF-VIEWPOINT-INITIAL-FILTER-VALUE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_viewpoint", "_csetf_viewpoint_effective_fn_slotname", "_CSETF-VIEWPOINT-EFFECTIVE-FN-SLOTNAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_viewpoint", "make_viewpoint", "MAKE-VIEWPOINT", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_viewpoint", "visit_defstruct_viewpoint", "VISIT-DEFSTRUCT-VIEWPOINT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_viewpoint", "visit_defstruct_object_viewpoint_method", "VISIT-DEFSTRUCT-OBJECT-VIEWPOINT-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_viewpoint", "find_viewpoint", "FIND-VIEWPOINT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_viewpoint", "active_filter_p", "ACTIVE-FILTER-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_viewpoint", "active_viewpoint_struct_p", "ACTIVE-VIEWPOINT-STRUCT-P", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_viewpoint", "clear_viewpoint_cache", "CLEAR-VIEWPOINT-CACHE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_viewpoint", "active_filters", "ACTIVE-FILTERS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_viewpoint", "enable_filter", "ENABLE-FILTER", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_viewpoint", "doc_predicate_p", "DOC-PREDICATE-P", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cb_viewpoint", "defviewpoint", "DEFVIEWPOINT");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_viewpoint", "defviewpoint_internal", "DEFVIEWPOINT-INTERNAL", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_viewpoint", "display_viewpoint", "DISPLAY-VIEWPOINT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_viewpoint", "cb_display_viewpoint_filters", "CB-DISPLAY-VIEWPOINT-FILTERS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_viewpoint", "prompt_with_completion", "PROMPT-WITH-COMPLETION", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_viewpoint", "cb_prompt_cyclists", "CB-PROMPT-CYCLISTS", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_viewpoint", "extract_fort_input", "EXTRACT-FORT-INPUT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_viewpoint", "cb_get_cyclists", "CB-GET-CYCLISTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_viewpoint", "cb_prompt_projects", "CB-PROMPT-PROJECTS", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_viewpoint", "cb_get_projects", "CB-GET-PROJECTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_viewpoint", "display_viewpoint_1", "DISPLAY-VIEWPOINT-1", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_viewpoint", "cb_viewpoint", "CB-VIEWPOINT", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_viewpoint", "cb_ev", "CB-EV", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_viewpoint", "cb_viewpoint_summary_handler", "CB-VIEWPOINT-SUMMARY-HANDLER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_viewpoint", "cb_viewpoint_handler", "CB-VIEWPOINT-HANDLER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_viewpoint", "cb_link_viewpoint", "CB-LINK-VIEWPOINT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_viewpoint", "common_prompt_prefix", "COMMON-PROMPT-PREFIX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_viewpoint", "prompt_for_list_of_cyclists", "PROMPT-FOR-LIST-OF-CYCLISTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_viewpoint", "prompt_for_date", "PROMPT-FOR-DATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_viewpoint", "prompt_for_mt", "PROMPT-FOR-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_viewpoint", "prompt_for_cycbasedproject", "PROMPT-FOR-CYCBASEDPROJECT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_viewpoint", "receive_list_of_cyclists", "RECEIVE-LIST-OF-CYCLISTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_viewpoint", "receive_list_of_projects", "RECEIVE-LIST-OF-PROJECTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_viewpoint", "receive_date", "RECEIVE-DATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_viewpoint", "receive_mt", "RECEIVE-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_viewpoint", "cb_set_microtheory_browsing_filter_viewpoint", "CB-SET-MICROTHEORY-BROWSING-FILTER-VIEWPOINT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_viewpoint", "assertion_before_date", "ASSERTION-BEFORE-DATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_viewpoint", "assertion_after_date", "ASSERTION-AFTER-DATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_viewpoint", "cb_use_mycreator_filter", "CB-USE-MYCREATOR-FILTER", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_viewpoint", "set_cb_use_mycreator_filter", "SET-CB-USE-MYCREATOR-FILTER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_viewpoint", "cb_mycreator_filter", "CB-MYCREATOR-FILTER", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_viewpoint", "set_cb_mycreator_filter", "SET-CB-MYCREATOR-FILTER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_viewpoint", "mycreator_effective_fn", "MYCREATOR-EFFECTIVE-FN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_viewpoint", "cb_use_myreviewer_filter", "CB-USE-MYREVIEWER-FILTER", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_viewpoint", "set_cb_use_myreviewer_filter", "SET-CB-USE-MYREVIEWER-FILTER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_viewpoint", "cb_myreviewer_filter", "CB-MYREVIEWER-FILTER", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_viewpoint", "set_cb_myreviewer_filter", "SET-CB-MYREVIEWER-FILTER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_viewpoint", "myreviewer_effective_fn", "MYREVIEWER-EFFECTIVE-FN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_viewpoint", "cb_use_assertion_start_date_filter", "CB-USE-ASSERTION-START-DATE-FILTER", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_viewpoint", "set_cb_use_assertion_start_date_filter", "SET-CB-USE-ASSERTION-START-DATE-FILTER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_viewpoint", "cb_assertion_start_date_filter", "CB-ASSERTION-START-DATE-FILTER", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_viewpoint", "set_cb_assertion_start_date_filter", "SET-CB-ASSERTION-START-DATE-FILTER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_viewpoint", "cb_use_assertion_end_date_filter", "CB-USE-ASSERTION-END-DATE-FILTER", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_viewpoint", "set_cb_use_assertion_end_date_filter", "SET-CB-USE-ASSERTION-END-DATE-FILTER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_viewpoint", "cb_assertion_end_date_filter", "CB-ASSERTION-END-DATE-FILTER", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_viewpoint", "set_cb_assertion_end_date_filter", "SET-CB-ASSERTION-END-DATE-FILTER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_viewpoint", "cb_use_mts_filter", "CB-USE-MTS-FILTER", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_viewpoint", "set_cb_use_mts_filter", "SET-CB-USE-MTS-FILTER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_viewpoint", "cb_mts_filter", "CB-MTS-FILTER", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_viewpoint", "set_cb_mts_filter", "SET-CB-MTS-FILTER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_viewpoint", "cb_use_mycreationpurpose_filter", "CB-USE-MYCREATIONPURPOSE-FILTER", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_viewpoint", "set_cb_use_mycreationpurpose_filter", "SET-CB-USE-MYCREATIONPURPOSE-FILTER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_viewpoint", "cb_mycreationpurpose_filter", "CB-MYCREATIONPURPOSE-FILTER", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_viewpoint", "set_cb_mycreationpurpose_filter", "SET-CB-MYCREATIONPURPOSE-FILTER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_viewpoint", "mycreationpurpose_effective_fn", "MYCREATIONPURPOSE-EFFECTIVE-FN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_viewpoint", "cb_calc_filter_hooks", "CB-CALC-FILTER-HOOKS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_viewpoint", "cb_online_filter_hooks", "CB-ONLINE-FILTER-HOOKS", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cb_viewpoint", "with_assertion_filters", "WITH-ASSERTION-FILTERS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cb_viewpoint", "find_relevant_key", "FIND-RELEVANT-KEY");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cb_viewpoint", "count_relevant", "COUNT-RELEVANT");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_viewpoint", "cb_link_edit_viewpoint", "CB-LINK-EDIT-VIEWPOINT", 1, 2, false);
        return (SubLObject)cb_viewpoint.NIL;
    }
    
    public static SubLObject init_cb_viewpoint_file() {
        cb_viewpoint.$viewpoint_type$ = SubLFiles.defparameter("*VIEWPOINT-TYPE*", (SubLObject)cb_viewpoint.NIL);
        cb_viewpoint.$dtp_viewpoint$ = SubLFiles.defconstant("*DTP-VIEWPOINT*", (SubLObject)cb_viewpoint.$sym1$VIEWPOINT);
        cb_viewpoint.$cb_viewpoint_table$ = SubLFiles.deflexical("*CB-VIEWPOINT-TABLE*", (SubLObject)(maybeDefault((SubLObject)cb_viewpoint.$sym55$_CB_VIEWPOINT_TABLE_, cb_viewpoint.$cb_viewpoint_table$, cb_viewpoint.NIL)));
        cb_viewpoint.$cb_viewpoint_summary_alist$ = SubLFiles.deflexical("*CB-VIEWPOINT-SUMMARY-ALIST*", (SubLObject)(maybeDefault((SubLObject)cb_viewpoint.$sym56$_CB_VIEWPOINT_SUMMARY_ALIST_, cb_viewpoint.$cb_viewpoint_summary_alist$, cb_viewpoint.NIL)));
        cb_viewpoint.$index_hook$ = SubLFiles.defparameter("*INDEX-HOOK*", (SubLObject)cb_viewpoint.NIL);
        cb_viewpoint.$viewpoint_cache$ = SubLFiles.deflexical("*VIEWPOINT-CACHE*", (SubLObject)cb_viewpoint.NIL);
        cb_viewpoint.$dash_nil$ = SubLFiles.deflexical("*DASH-NIL*", (SubLObject)cb_viewpoint.$str93$________);
        cb_viewpoint.$cb_use_mycreator_filter$ = SubLFiles.defparameter("*CB-USE-MYCREATOR-FILTER*", (SubLObject)cb_viewpoint.NIL);
        cb_viewpoint.$cb_mycreator_filter$ = SubLFiles.defparameter("*CB-MYCREATOR-FILTER*", (SubLObject)cb_viewpoint.NIL);
        cb_viewpoint.$cb_use_myreviewer_filter$ = SubLFiles.defparameter("*CB-USE-MYREVIEWER-FILTER*", (SubLObject)cb_viewpoint.NIL);
        cb_viewpoint.$cb_myreviewer_filter$ = SubLFiles.defparameter("*CB-MYREVIEWER-FILTER*", (SubLObject)cb_viewpoint.NIL);
        cb_viewpoint.$cb_use_assertion_start_date_filter$ = SubLFiles.defparameter("*CB-USE-ASSERTION-START-DATE-FILTER*", (SubLObject)cb_viewpoint.NIL);
        cb_viewpoint.$cb_assertion_start_date_filter$ = SubLFiles.defparameter("*CB-ASSERTION-START-DATE-FILTER*", (SubLObject)cb_viewpoint.NIL);
        cb_viewpoint.$cb_use_assertion_end_date_filter$ = SubLFiles.defparameter("*CB-USE-ASSERTION-END-DATE-FILTER*", (SubLObject)cb_viewpoint.NIL);
        cb_viewpoint.$cb_assertion_end_date_filter$ = SubLFiles.defparameter("*CB-ASSERTION-END-DATE-FILTER*", (SubLObject)cb_viewpoint.NIL);
        cb_viewpoint.$cb_use_mts_filter$ = SubLFiles.defparameter("*CB-USE-MTS-FILTER*", (SubLObject)cb_viewpoint.NIL);
        cb_viewpoint.$cb_mts_filter$ = SubLFiles.defparameter("*CB-MTS-FILTER*", (SubLObject)cb_viewpoint.NIL);
        cb_viewpoint.$cb_use_mycreationpurpose_filter$ = SubLFiles.defparameter("*CB-USE-MYCREATIONPURPOSE-FILTER*", (SubLObject)cb_viewpoint.NIL);
        cb_viewpoint.$cb_mycreationpurpose_filter$ = SubLFiles.defparameter("*CB-MYCREATIONPURPOSE-FILTER*", (SubLObject)cb_viewpoint.NIL);
        return (SubLObject)cb_viewpoint.NIL;
    }
    
    public static SubLObject setup_cb_viewpoint_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), cb_viewpoint.$dtp_viewpoint$.getGlobalValue(), Symbols.symbol_function((SubLObject)cb_viewpoint.$sym8$VIEWPOINT_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)cb_viewpoint.$list9);
        Structures.def_csetf((SubLObject)cb_viewpoint.$sym10$VIEWPOINT_NAME, (SubLObject)cb_viewpoint.$sym11$_CSETF_VIEWPOINT_NAME);
        Structures.def_csetf((SubLObject)cb_viewpoint.$sym12$VIEWPOINT_SUMMARY_NAME, (SubLObject)cb_viewpoint.$sym13$_CSETF_VIEWPOINT_SUMMARY_NAME);
        Structures.def_csetf((SubLObject)cb_viewpoint.$sym14$VIEWPOINT_LINKABLE_NAME, (SubLObject)cb_viewpoint.$sym15$_CSETF_VIEWPOINT_LINKABLE_NAME);
        Structures.def_csetf((SubLObject)cb_viewpoint.$sym16$VIEWPOINT_LINKNAME_PREFIX, (SubLObject)cb_viewpoint.$sym17$_CSETF_VIEWPOINT_LINKNAME_PREFIX);
        Structures.def_csetf((SubLObject)cb_viewpoint.$sym18$VIEWPOINT_FILTER_GETTER, (SubLObject)cb_viewpoint.$sym19$_CSETF_VIEWPOINT_FILTER_GETTER);
        Structures.def_csetf((SubLObject)cb_viewpoint.$sym20$VIEWPOINT_FILTER_SETTER, (SubLObject)cb_viewpoint.$sym21$_CSETF_VIEWPOINT_FILTER_SETTER);
        Structures.def_csetf((SubLObject)cb_viewpoint.$sym22$VIEWPOINT_TYPE, (SubLObject)cb_viewpoint.$sym23$_CSETF_VIEWPOINT_TYPE);
        Structures.def_csetf((SubLObject)cb_viewpoint.$sym24$VIEWPOINT_ACTIVE_P, (SubLObject)cb_viewpoint.$sym25$_CSETF_VIEWPOINT_ACTIVE_P);
        Structures.def_csetf((SubLObject)cb_viewpoint.$sym26$VIEWPOINT_EFFECTIVE_FN, (SubLObject)cb_viewpoint.$sym27$_CSETF_VIEWPOINT_EFFECTIVE_FN);
        Structures.def_csetf((SubLObject)cb_viewpoint.$sym28$VIEWPOINT_VALUE_PROMPT_FN, (SubLObject)cb_viewpoint.$sym29$_CSETF_VIEWPOINT_VALUE_PROMPT_FN);
        Structures.def_csetf((SubLObject)cb_viewpoint.$sym30$VIEWPOINT_VALUE_UPDATE_FN, (SubLObject)cb_viewpoint.$sym31$_CSETF_VIEWPOINT_VALUE_UPDATE_FN);
        Structures.def_csetf((SubLObject)cb_viewpoint.$sym32$VIEWPOINT_INITIAL_FILTER_VALUE, (SubLObject)cb_viewpoint.$sym33$_CSETF_VIEWPOINT_INITIAL_FILTER_VALUE);
        Structures.def_csetf((SubLObject)cb_viewpoint.$sym34$VIEWPOINT_EFFECTIVE_FN_SLOTNAME, (SubLObject)cb_viewpoint.$sym35$_CSETF_VIEWPOINT_EFFECTIVE_FN_SLOTNAME);
        Equality.identity((SubLObject)cb_viewpoint.$sym1$VIEWPOINT);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), cb_viewpoint.$dtp_viewpoint$.getGlobalValue(), Symbols.symbol_function((SubLObject)cb_viewpoint.$sym54$VISIT_DEFSTRUCT_OBJECT_VIEWPOINT_METHOD));
        subl_macro_promotions.declare_defglobal((SubLObject)cb_viewpoint.$sym55$_CB_VIEWPOINT_TABLE_);
        subl_macro_promotions.declare_defglobal((SubLObject)cb_viewpoint.$sym56$_CB_VIEWPOINT_SUMMARY_ALIST_);
        Hashtables.sethash((SubLObject)cb_viewpoint.$kw102$CB_VIEWPOINT, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_viewpoint.$str103$cb_viewpoint_html, (SubLObject)cb_viewpoint.NIL));
        html_macros.note_cgi_handler_function((SubLObject)cb_viewpoint.$sym127$CB_VIEWPOINT, (SubLObject)cb_viewpoint.$kw128$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cb_viewpoint.$sym132$CB_EV, (SubLObject)cb_viewpoint.$kw128$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cb_viewpoint.$sym134$CB_VIEWPOINT_SUMMARY_HANDLER, (SubLObject)cb_viewpoint.$kw128$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cb_viewpoint.$sym135$CB_VIEWPOINT_HANDLER, (SubLObject)cb_viewpoint.$kw128$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_viewpoint.$kw139$VIEWPOINT, (SubLObject)cb_viewpoint.$sym140$CB_LINK_VIEWPOINT, (SubLObject)cb_viewpoint.TWO_INTEGER);
        utilities_macros.register_html_state_variable((SubLObject)cb_viewpoint.$sym160$_CB_USE_MYCREATOR_FILTER_);
        utilities_macros.register_html_state_variable((SubLObject)cb_viewpoint.$sym161$_CB_MYCREATOR_FILTER_);
        defviewpoint_internal((SubLObject)cb_viewpoint.$sym162$MYCREATOR, (SubLObject)cb_viewpoint.$list163, (SubLObject)cb_viewpoint.$sym164$CB_MYCREATOR_FILTER, (SubLObject)cb_viewpoint.$sym165$SET_CB_MYCREATOR_FILTER, (SubLObject)cb_viewpoint.$sym166$MYCREATOR_EFFECTIVE_FN);
        utilities_macros.register_html_state_variable((SubLObject)cb_viewpoint.$sym168$_CB_USE_MYREVIEWER_FILTER_);
        utilities_macros.register_html_state_variable((SubLObject)cb_viewpoint.$sym169$_CB_MYREVIEWER_FILTER_);
        defviewpoint_internal((SubLObject)cb_viewpoint.$sym170$MYREVIEWER, (SubLObject)cb_viewpoint.$list171, (SubLObject)cb_viewpoint.$sym172$CB_MYREVIEWER_FILTER, (SubLObject)cb_viewpoint.$sym173$SET_CB_MYREVIEWER_FILTER, (SubLObject)cb_viewpoint.$sym174$MYREVIEWER_EFFECTIVE_FN);
        utilities_macros.register_html_state_variable((SubLObject)cb_viewpoint.$sym175$_CB_USE_ASSERTION_START_DATE_FILTER_);
        utilities_macros.register_html_state_variable((SubLObject)cb_viewpoint.$sym176$_CB_ASSERTION_START_DATE_FILTER_);
        defviewpoint_internal((SubLObject)cb_viewpoint.$sym177$ASSERTION_START_DATE, (SubLObject)cb_viewpoint.$list178, (SubLObject)cb_viewpoint.$sym179$CB_ASSERTION_START_DATE_FILTER, (SubLObject)cb_viewpoint.$sym180$SET_CB_ASSERTION_START_DATE_FILTER, (SubLObject)cb_viewpoint.NIL);
        utilities_macros.register_html_state_variable((SubLObject)cb_viewpoint.$sym181$_CB_USE_ASSERTION_END_DATE_FILTER_);
        utilities_macros.register_html_state_variable((SubLObject)cb_viewpoint.$sym182$_CB_ASSERTION_END_DATE_FILTER_);
        defviewpoint_internal((SubLObject)cb_viewpoint.$sym183$ASSERTION_END_DATE, (SubLObject)cb_viewpoint.$list184, (SubLObject)cb_viewpoint.$sym185$CB_ASSERTION_END_DATE_FILTER, (SubLObject)cb_viewpoint.$sym186$SET_CB_ASSERTION_END_DATE_FILTER, (SubLObject)cb_viewpoint.NIL);
        utilities_macros.register_html_state_variable((SubLObject)cb_viewpoint.$sym187$_CB_USE_MTS_FILTER_);
        utilities_macros.register_html_state_variable((SubLObject)cb_viewpoint.$sym188$_CB_MTS_FILTER_);
        defviewpoint_internal((SubLObject)cb_viewpoint.$sym152$MTS, (SubLObject)cb_viewpoint.$list189, (SubLObject)cb_viewpoint.$sym190$CB_MTS_FILTER, (SubLObject)cb_viewpoint.$sym191$SET_CB_MTS_FILTER, (SubLObject)cb_viewpoint.NIL);
        utilities_macros.register_html_state_variable((SubLObject)cb_viewpoint.$sym192$_CB_USE_MYCREATIONPURPOSE_FILTER_);
        utilities_macros.register_html_state_variable((SubLObject)cb_viewpoint.$sym193$_CB_MYCREATIONPURPOSE_FILTER_);
        defviewpoint_internal((SubLObject)cb_viewpoint.$sym194$MYCREATIONPURPOSE, (SubLObject)cb_viewpoint.$list195, (SubLObject)cb_viewpoint.$sym196$CB_MYCREATIONPURPOSE_FILTER, (SubLObject)cb_viewpoint.$sym197$SET_CB_MYCREATIONPURPOSE_FILTER, (SubLObject)cb_viewpoint.$sym198$MYCREATIONPURPOSE_EFFECTIVE_FN);
        cb_utilities.setup_cb_link_method((SubLObject)cb_viewpoint.$kw83$EDIT_VIEWPOINT, (SubLObject)cb_viewpoint.$sym224$CB_LINK_EDIT_VIEWPOINT, (SubLObject)cb_viewpoint.THREE_INTEGER);
        return (SubLObject)cb_viewpoint.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_cb_viewpoint_file();
    }
    
    @Override
	public void initializeVariables() {
        init_cb_viewpoint_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_cb_viewpoint_file();
    }
    
    static {
        me = (SubLFile)new cb_viewpoint();
        cb_viewpoint.$viewpoint_type$ = null;
        cb_viewpoint.$dtp_viewpoint$ = null;
        cb_viewpoint.$cb_viewpoint_table$ = null;
        cb_viewpoint.$cb_viewpoint_summary_alist$ = null;
        cb_viewpoint.$index_hook$ = null;
        cb_viewpoint.$viewpoint_cache$ = null;
        cb_viewpoint.$dash_nil$ = null;
        cb_viewpoint.$cb_use_mycreator_filter$ = null;
        cb_viewpoint.$cb_mycreator_filter$ = null;
        cb_viewpoint.$cb_use_myreviewer_filter$ = null;
        cb_viewpoint.$cb_myreviewer_filter$ = null;
        cb_viewpoint.$cb_use_assertion_start_date_filter$ = null;
        cb_viewpoint.$cb_assertion_start_date_filter$ = null;
        cb_viewpoint.$cb_use_assertion_end_date_filter$ = null;
        cb_viewpoint.$cb_assertion_end_date_filter$ = null;
        cb_viewpoint.$cb_use_mts_filter$ = null;
        cb_viewpoint.$cb_mts_filter$ = null;
        cb_viewpoint.$cb_use_mycreationpurpose_filter$ = null;
        cb_viewpoint.$cb_mycreationpurpose_filter$ = null;
        $str0$_ = SubLObjectFactory.makeString("#");
        $sym1$VIEWPOINT = SubLObjectFactory.makeSymbol("VIEWPOINT");
        $sym2$VIEWPOINT_P = SubLObjectFactory.makeSymbol("VIEWPOINT-P");
        $list3 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("NAME"), SubLObjectFactory.makeSymbol("SUMMARY-NAME"), SubLObjectFactory.makeSymbol("LINKABLE-NAME"), SubLObjectFactory.makeSymbol("LINKNAME-PREFIX"), SubLObjectFactory.makeSymbol("FILTER-GETTER"), SubLObjectFactory.makeSymbol("FILTER-SETTER"), SubLObjectFactory.makeSymbol("TYPE"), SubLObjectFactory.makeSymbol("ACTIVE-P"), SubLObjectFactory.makeSymbol("EFFECTIVE-FN"), SubLObjectFactory.makeSymbol("VALUE-PROMPT-FN"), SubLObjectFactory.makeSymbol("VALUE-UPDATE-FN"), SubLObjectFactory.makeSymbol("INITIAL-FILTER-VALUE"), SubLObjectFactory.makeSymbol("EFFECTIVE-FN-SLOTNAME") });
        $list4 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("NAME"), SubLObjectFactory.makeKeyword("SUMMARY-NAME"), SubLObjectFactory.makeKeyword("LINKABLE-NAME"), SubLObjectFactory.makeKeyword("LINKNAME-PREFIX"), SubLObjectFactory.makeKeyword("FILTER-GETTER"), SubLObjectFactory.makeKeyword("FILTER-SETTER"), SubLObjectFactory.makeKeyword("TYPE"), SubLObjectFactory.makeKeyword("ACTIVE-P"), SubLObjectFactory.makeKeyword("EFFECTIVE-FN"), SubLObjectFactory.makeKeyword("VALUE-PROMPT-FN"), SubLObjectFactory.makeKeyword("VALUE-UPDATE-FN"), SubLObjectFactory.makeKeyword("INITIAL-FILTER-VALUE"), SubLObjectFactory.makeKeyword("EFFECTIVE-FN-SLOTNAME") });
        $list5 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("VIEWPOINT-NAME"), SubLObjectFactory.makeSymbol("VIEWPOINT-SUMMARY-NAME"), SubLObjectFactory.makeSymbol("VIEWPOINT-LINKABLE-NAME"), SubLObjectFactory.makeSymbol("VIEWPOINT-LINKNAME-PREFIX"), SubLObjectFactory.makeSymbol("VIEWPOINT-FILTER-GETTER"), SubLObjectFactory.makeSymbol("VIEWPOINT-FILTER-SETTER"), SubLObjectFactory.makeSymbol("VIEWPOINT-TYPE"), SubLObjectFactory.makeSymbol("VIEWPOINT-ACTIVE-P"), SubLObjectFactory.makeSymbol("VIEWPOINT-EFFECTIVE-FN"), SubLObjectFactory.makeSymbol("VIEWPOINT-VALUE-PROMPT-FN"), SubLObjectFactory.makeSymbol("VIEWPOINT-VALUE-UPDATE-FN"), SubLObjectFactory.makeSymbol("VIEWPOINT-INITIAL-FILTER-VALUE"), SubLObjectFactory.makeSymbol("VIEWPOINT-EFFECTIVE-FN-SLOTNAME") });
        $list6 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("_CSETF-VIEWPOINT-NAME"), SubLObjectFactory.makeSymbol("_CSETF-VIEWPOINT-SUMMARY-NAME"), SubLObjectFactory.makeSymbol("_CSETF-VIEWPOINT-LINKABLE-NAME"), SubLObjectFactory.makeSymbol("_CSETF-VIEWPOINT-LINKNAME-PREFIX"), SubLObjectFactory.makeSymbol("_CSETF-VIEWPOINT-FILTER-GETTER"), SubLObjectFactory.makeSymbol("_CSETF-VIEWPOINT-FILTER-SETTER"), SubLObjectFactory.makeSymbol("_CSETF-VIEWPOINT-TYPE"), SubLObjectFactory.makeSymbol("_CSETF-VIEWPOINT-ACTIVE-P"), SubLObjectFactory.makeSymbol("_CSETF-VIEWPOINT-EFFECTIVE-FN"), SubLObjectFactory.makeSymbol("_CSETF-VIEWPOINT-VALUE-PROMPT-FN"), SubLObjectFactory.makeSymbol("_CSETF-VIEWPOINT-VALUE-UPDATE-FN"), SubLObjectFactory.makeSymbol("_CSETF-VIEWPOINT-INITIAL-FILTER-VALUE"), SubLObjectFactory.makeSymbol("_CSETF-VIEWPOINT-EFFECTIVE-FN-SLOTNAME") });
        $sym7$PRINT_VIEWPOINT = SubLObjectFactory.makeSymbol("PRINT-VIEWPOINT");
        $sym8$VIEWPOINT_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("VIEWPOINT-PRINT-FUNCTION-TRAMPOLINE");
        $list9 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("VIEWPOINT-P"));
        $sym10$VIEWPOINT_NAME = SubLObjectFactory.makeSymbol("VIEWPOINT-NAME");
        $sym11$_CSETF_VIEWPOINT_NAME = SubLObjectFactory.makeSymbol("_CSETF-VIEWPOINT-NAME");
        $sym12$VIEWPOINT_SUMMARY_NAME = SubLObjectFactory.makeSymbol("VIEWPOINT-SUMMARY-NAME");
        $sym13$_CSETF_VIEWPOINT_SUMMARY_NAME = SubLObjectFactory.makeSymbol("_CSETF-VIEWPOINT-SUMMARY-NAME");
        $sym14$VIEWPOINT_LINKABLE_NAME = SubLObjectFactory.makeSymbol("VIEWPOINT-LINKABLE-NAME");
        $sym15$_CSETF_VIEWPOINT_LINKABLE_NAME = SubLObjectFactory.makeSymbol("_CSETF-VIEWPOINT-LINKABLE-NAME");
        $sym16$VIEWPOINT_LINKNAME_PREFIX = SubLObjectFactory.makeSymbol("VIEWPOINT-LINKNAME-PREFIX");
        $sym17$_CSETF_VIEWPOINT_LINKNAME_PREFIX = SubLObjectFactory.makeSymbol("_CSETF-VIEWPOINT-LINKNAME-PREFIX");
        $sym18$VIEWPOINT_FILTER_GETTER = SubLObjectFactory.makeSymbol("VIEWPOINT-FILTER-GETTER");
        $sym19$_CSETF_VIEWPOINT_FILTER_GETTER = SubLObjectFactory.makeSymbol("_CSETF-VIEWPOINT-FILTER-GETTER");
        $sym20$VIEWPOINT_FILTER_SETTER = SubLObjectFactory.makeSymbol("VIEWPOINT-FILTER-SETTER");
        $sym21$_CSETF_VIEWPOINT_FILTER_SETTER = SubLObjectFactory.makeSymbol("_CSETF-VIEWPOINT-FILTER-SETTER");
        $sym22$VIEWPOINT_TYPE = SubLObjectFactory.makeSymbol("VIEWPOINT-TYPE");
        $sym23$_CSETF_VIEWPOINT_TYPE = SubLObjectFactory.makeSymbol("_CSETF-VIEWPOINT-TYPE");
        $sym24$VIEWPOINT_ACTIVE_P = SubLObjectFactory.makeSymbol("VIEWPOINT-ACTIVE-P");
        $sym25$_CSETF_VIEWPOINT_ACTIVE_P = SubLObjectFactory.makeSymbol("_CSETF-VIEWPOINT-ACTIVE-P");
        $sym26$VIEWPOINT_EFFECTIVE_FN = SubLObjectFactory.makeSymbol("VIEWPOINT-EFFECTIVE-FN");
        $sym27$_CSETF_VIEWPOINT_EFFECTIVE_FN = SubLObjectFactory.makeSymbol("_CSETF-VIEWPOINT-EFFECTIVE-FN");
        $sym28$VIEWPOINT_VALUE_PROMPT_FN = SubLObjectFactory.makeSymbol("VIEWPOINT-VALUE-PROMPT-FN");
        $sym29$_CSETF_VIEWPOINT_VALUE_PROMPT_FN = SubLObjectFactory.makeSymbol("_CSETF-VIEWPOINT-VALUE-PROMPT-FN");
        $sym30$VIEWPOINT_VALUE_UPDATE_FN = SubLObjectFactory.makeSymbol("VIEWPOINT-VALUE-UPDATE-FN");
        $sym31$_CSETF_VIEWPOINT_VALUE_UPDATE_FN = SubLObjectFactory.makeSymbol("_CSETF-VIEWPOINT-VALUE-UPDATE-FN");
        $sym32$VIEWPOINT_INITIAL_FILTER_VALUE = SubLObjectFactory.makeSymbol("VIEWPOINT-INITIAL-FILTER-VALUE");
        $sym33$_CSETF_VIEWPOINT_INITIAL_FILTER_VALUE = SubLObjectFactory.makeSymbol("_CSETF-VIEWPOINT-INITIAL-FILTER-VALUE");
        $sym34$VIEWPOINT_EFFECTIVE_FN_SLOTNAME = SubLObjectFactory.makeSymbol("VIEWPOINT-EFFECTIVE-FN-SLOTNAME");
        $sym35$_CSETF_VIEWPOINT_EFFECTIVE_FN_SLOTNAME = SubLObjectFactory.makeSymbol("_CSETF-VIEWPOINT-EFFECTIVE-FN-SLOTNAME");
        $kw36$NAME = SubLObjectFactory.makeKeyword("NAME");
        $kw37$SUMMARY_NAME = SubLObjectFactory.makeKeyword("SUMMARY-NAME");
        $kw38$LINKABLE_NAME = SubLObjectFactory.makeKeyword("LINKABLE-NAME");
        $kw39$LINKNAME_PREFIX = SubLObjectFactory.makeKeyword("LINKNAME-PREFIX");
        $kw40$FILTER_GETTER = SubLObjectFactory.makeKeyword("FILTER-GETTER");
        $kw41$FILTER_SETTER = SubLObjectFactory.makeKeyword("FILTER-SETTER");
        $kw42$TYPE = SubLObjectFactory.makeKeyword("TYPE");
        $kw43$ACTIVE_P = SubLObjectFactory.makeKeyword("ACTIVE-P");
        $kw44$EFFECTIVE_FN = SubLObjectFactory.makeKeyword("EFFECTIVE-FN");
        $kw45$VALUE_PROMPT_FN = SubLObjectFactory.makeKeyword("VALUE-PROMPT-FN");
        $kw46$VALUE_UPDATE_FN = SubLObjectFactory.makeKeyword("VALUE-UPDATE-FN");
        $kw47$INITIAL_FILTER_VALUE = SubLObjectFactory.makeKeyword("INITIAL-FILTER-VALUE");
        $kw48$EFFECTIVE_FN_SLOTNAME = SubLObjectFactory.makeKeyword("EFFECTIVE-FN-SLOTNAME");
        $str49$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw50$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym51$MAKE_VIEWPOINT = SubLObjectFactory.makeSymbol("MAKE-VIEWPOINT");
        $kw52$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw53$END = SubLObjectFactory.makeKeyword("END");
        $sym54$VISIT_DEFSTRUCT_OBJECT_VIEWPOINT_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-VIEWPOINT-METHOD");
        $sym55$_CB_VIEWPOINT_TABLE_ = SubLObjectFactory.makeSymbol("*CB-VIEWPOINT-TABLE*");
        $sym56$_CB_VIEWPOINT_SUMMARY_ALIST_ = SubLObjectFactory.makeSymbol("*CB-VIEWPOINT-SUMMARY-ALIST*");
        $sym57$ACTIVE_VIEWPOINT_STRUCT_P = SubLObjectFactory.makeSymbol("ACTIVE-VIEWPOINT-STRUCT-P");
        $list58 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("ARGLIST"));
        $str59$_A_FILTER = SubLObjectFactory.makeString("~A-FILTER");
        $str60$CB__A = SubLObjectFactory.makeString("CB-~A");
        $str61$SET__A = SubLObjectFactory.makeString("SET-~A");
        $str62$_A_EFFECTIVE_FN = SubLObjectFactory.makeString("~A-EFFECTIVE-FN");
        $sym63$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $sym64$DEFFILTERSET = SubLObjectFactory.makeSymbol("DEFFILTERSET");
        $list65 = ConsesLow.list((SubLObject)cb_viewpoint.NIL, (SubLObject)SubLObjectFactory.makeString("Automatically generated filter"));
        $kw66$LIST_OF_FORMS = SubLObjectFactory.makeKeyword("LIST-OF-FORMS");
        $sym67$DEFVIEWPOINT_INTERNAL = SubLObjectFactory.makeSymbol("DEFVIEWPOINT-INTERNAL");
        $sym68$QUOTE = SubLObjectFactory.makeSymbol("QUOTE");
        $sym69$DEFINE = SubLObjectFactory.makeSymbol("DEFINE");
        $list70 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"));
        $list71 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-P"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BREAK"), (SubLObject)SubLObjectFactory.makeString("not an assertion")));
        $list72 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DOC-PREDICATE-P"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)cb_viewpoint.T));
        $sym73$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym74$FIND_VIEWPOINT = SubLObjectFactory.makeSymbol("FIND-VIEWPOINT");
        $list75 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VIEWPOINT-EFFECTIVE-FN-SLOTNAME"), (SubLObject)SubLObjectFactory.makeSymbol("VIEWPOINT")), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VIEWPOINT-FILTER-GETTER"), (SubLObject)SubLObjectFactory.makeSymbol("VIEWPOINT"))))));
        $list76 = ConsesLow.list((SubLObject)cb_viewpoint.NIL);
        $sym77$CAR = SubLObjectFactory.makeSymbol("CAR");
        $str78$activate__A = SubLObjectFactory.makeString("activate-~A");
        $str79$_ = SubLObjectFactory.makeString(":");
        $kw80$NBSP = SubLObjectFactory.makeKeyword("NBSP");
        $kw81$SINGLE_SIMPLE_DATE = SubLObjectFactory.makeKeyword("SINGLE-SIMPLE-DATE");
        $str82$_D = SubLObjectFactory.makeString("~D");
        $kw83$EDIT_VIEWPOINT = SubLObjectFactory.makeKeyword("EDIT-VIEWPOINT");
        $str84$Edit = SubLObjectFactory.makeString("Edit");
        $sym85$DISPLAY_VIEWPOINT = SubLObjectFactory.makeSymbol("DISPLAY-VIEWPOINT");
        $str86$Complete = SubLObjectFactory.makeString("Complete");
        $str87$ = SubLObjectFactory.makeString("");
        $str88$cb_show_cyclist__A = SubLObjectFactory.makeString("cb-show-cyclist-~A");
        $const89$Cyclist = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Cyclist"));
        $int90$24 = SubLObjectFactory.makeInteger(24);
        $str91$cb_show_cyclist1__A = SubLObjectFactory.makeString("cb-show-cyclist1-~A");
        $str92$cb_show_cyclist2__A = SubLObjectFactory.makeString("cb-show-cyclist2-~A");
        $str93$________ = SubLObjectFactory.makeString("--------");
        $str94$Unknown__A___S = SubLObjectFactory.makeString("Unknown ~A: ~S");
        $str95$cyclist = SubLObjectFactory.makeString("cyclist");
        $const96$Cyc_BasedProject = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Cyc-BasedProject"));
        $const97$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $str98$project1__A = SubLObjectFactory.makeString("project1-~A");
        $str99$project2__A = SubLObjectFactory.makeString("project2-~A");
        $str100$project3__A = SubLObjectFactory.makeString("project3-~A");
        $str101$project = SubLObjectFactory.makeString("project");
        $kw102$CB_VIEWPOINT = SubLObjectFactory.makeKeyword("CB-VIEWPOINT");
        $str103$cb_viewpoint_html = SubLObjectFactory.makeString("cb-viewpoint.html");
        $list104 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDEX-SPEC"));
        $str105$_a_does_not_specify_an_index = SubLObjectFactory.makeString("~a does not specify an index");
        $str106$Viewpoint_Filter_Summary = SubLObjectFactory.makeString("Viewpoint Filter Summary");
        $str107$__DOCTYPE_html_PUBLIC_____W3C__DT = SubLObjectFactory.makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $str108$_meta_http_equiv__X_UA_Compatible = SubLObjectFactory.makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");
        $kw109$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $kw110$CB_CYC = SubLObjectFactory.makeKeyword("CB-CYC");
        $kw111$SAM_AUTOCOMPLETE_CSS = SubLObjectFactory.makeKeyword("SAM-AUTOCOMPLETE-CSS");
        $kw112$SHA1 = SubLObjectFactory.makeKeyword("SHA1");
        $str113$yui_skin_sam = SubLObjectFactory.makeString("yui-skin-sam");
        $str114$reloadFrameButton = SubLObjectFactory.makeString("reloadFrameButton");
        $str115$button = SubLObjectFactory.makeString("button");
        $str116$reload = SubLObjectFactory.makeString("reload");
        $str117$Refresh_Frames = SubLObjectFactory.makeString("Refresh Frames");
        $str118$post = SubLObjectFactory.makeString("post");
        $str119$cb_viewpoint_summary_handler = SubLObjectFactory.makeString("cb-viewpoint-summary-handler");
        $str120$Current_Values = SubLObjectFactory.makeString("Current Values");
        $str121$Update_Filter_Settings = SubLObjectFactory.makeString("Update Filter Settings");
        $str122$always_show_comments = SubLObjectFactory.makeString("always-show-comments");
        $str123$Always_show_comments__regardless_ = SubLObjectFactory.makeString("Always show comments, regardless of other filter settings.");
        $str124$always_show_bookkeeping = SubLObjectFactory.makeString("always-show-bookkeeping");
        $str125$Always_show_bookkeeping_predicate = SubLObjectFactory.makeString("Always show bookkeeping predicates, regardless of other filter settings.");
        $sym126$DISPLAY_VIEWPOINT_1 = SubLObjectFactory.makeSymbol("DISPLAY-VIEWPOINT-1");
        $sym127$CB_VIEWPOINT = SubLObjectFactory.makeSymbol("CB-VIEWPOINT");
        $kw128$HTML_HANDLER = SubLObjectFactory.makeKeyword("HTML-HANDLER");
        $list129 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUMMARY-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("INDEX-SPEC"));
        $str130$Viewpoint_Filters = SubLObjectFactory.makeString("Viewpoint Filters");
        $str131$cb_viewpoint_handler = SubLObjectFactory.makeString("cb-viewpoint-handler");
        $sym132$CB_EV = SubLObjectFactory.makeSymbol("CB-EV");
        $str133$Summary_filters_have_been_changed = SubLObjectFactory.makeString("Summary filters have been changed");
        $sym134$CB_VIEWPOINT_SUMMARY_HANDLER = SubLObjectFactory.makeSymbol("CB-VIEWPOINT-SUMMARY-HANDLER");
        $sym135$CB_VIEWPOINT_HANDLER = SubLObjectFactory.makeSymbol("CB-VIEWPOINT-HANDLER");
        $str136$_Viewpoint_ = SubLObjectFactory.makeString("[Viewpoint]");
        $kw137$MAIN = SubLObjectFactory.makeKeyword("MAIN");
        $str138$cb_viewpoint__A = SubLObjectFactory.makeString("cb-viewpoint&~A");
        $kw139$VIEWPOINT = SubLObjectFactory.makeKeyword("VIEWPOINT");
        $sym140$CB_LINK_VIEWPOINT = SubLObjectFactory.makeSymbol("CB-LINK-VIEWPOINT");
        $str141$_ = SubLObjectFactory.makeString(" ");
        $str142$_Filter = SubLObjectFactory.makeString(" Filter");
        $str143$_Only_those_terms_whose_ = SubLObjectFactory.makeString("(Only those terms whose ");
        $str144$_field_has_a_value_equal_to_a_ter = SubLObjectFactory.makeString(" field has a value equal to a term below will be presented. Leave blank to disable this filter.)");
        $sym145$CB_PROMPT_CYCLISTS = SubLObjectFactory.makeSymbol("CB-PROMPT-CYCLISTS");
        $str146$Activate_Filter = SubLObjectFactory.makeString("Activate Filter");
        $str147$all_dates__A = SubLObjectFactory.makeString("all-dates-~A");
        $str148$no = SubLObjectFactory.makeString("no");
        $str149$cb_show_start__A = SubLObjectFactory.makeString("cb-show-start-~A");
        $str150$all = SubLObjectFactory.makeString("all");
        $str151$yes = SubLObjectFactory.makeString("yes");
        $sym152$MTS = SubLObjectFactory.makeSymbol("MTS");
        $str153$All_Mts = SubLObjectFactory.makeString("All Mts");
        $str154$Specify_Mts = SubLObjectFactory.makeString("Specify Mts");
        $str155$use_genl_mt = SubLObjectFactory.makeString("use-genl-mt");
        $str156$Include_All_Genl_Mts = SubLObjectFactory.makeString("Include All Genl Mts");
        $str157$new_mt = SubLObjectFactory.makeString("new-mt");
        $sym158$CB_PROMPT_PROJECTS = SubLObjectFactory.makeSymbol("CB-PROMPT-PROJECTS");
        $const159$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $sym160$_CB_USE_MYCREATOR_FILTER_ = SubLObjectFactory.makeSymbol("*CB-USE-MYCREATOR-FILTER*");
        $sym161$_CB_MYCREATOR_FILTER_ = SubLObjectFactory.makeSymbol("*CB-MYCREATOR-FILTER*");
        $sym162$MYCREATOR = SubLObjectFactory.makeSymbol("MYCREATOR");
        $list163 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("LINKABLE-NAME"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("myCreator")), SubLObjectFactory.makeKeyword("TYPE"), SubLObjectFactory.makeKeyword("LIST-OF-FORMS"), SubLObjectFactory.makeKeyword("ACTIVE-P"), cb_viewpoint.NIL, SubLObjectFactory.makeKeyword("VALUE-PROMPT-FN"), SubLObjectFactory.makeSymbol("PROMPT-FOR-LIST-OF-CYCLISTS"), SubLObjectFactory.makeKeyword("VALUE-UPDATE-FN"), SubLObjectFactory.makeSymbol("RECEIVE-LIST-OF-CYCLISTS"), SubLObjectFactory.makeKeyword("EFFECTIVE-FN-SLOTNAME"), SubLObjectFactory.makeSymbol("ASSERTED-BY") });
        $sym164$CB_MYCREATOR_FILTER = SubLObjectFactory.makeSymbol("CB-MYCREATOR-FILTER");
        $sym165$SET_CB_MYCREATOR_FILTER = SubLObjectFactory.makeSymbol("SET-CB-MYCREATOR-FILTER");
        $sym166$MYCREATOR_EFFECTIVE_FN = SubLObjectFactory.makeSymbol("MYCREATOR-EFFECTIVE-FN");
        $str167$not_an_assertion = SubLObjectFactory.makeString("not an assertion");
        $sym168$_CB_USE_MYREVIEWER_FILTER_ = SubLObjectFactory.makeSymbol("*CB-USE-MYREVIEWER-FILTER*");
        $sym169$_CB_MYREVIEWER_FILTER_ = SubLObjectFactory.makeSymbol("*CB-MYREVIEWER-FILTER*");
        $sym170$MYREVIEWER = SubLObjectFactory.makeSymbol("MYREVIEWER");
        $list171 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("LINKABLE-NAME"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("myReviewer")), SubLObjectFactory.makeKeyword("TYPE"), SubLObjectFactory.makeKeyword("LIST-OF-FORMS"), SubLObjectFactory.makeKeyword("ACTIVE-P"), cb_viewpoint.NIL, SubLObjectFactory.makeKeyword("EFFECTIVE-FN-SLOTNAME"), SubLObjectFactory.makeSymbol("ASSERTED-REVIEWER"), SubLObjectFactory.makeKeyword("VALUE-PROMPT-FN"), SubLObjectFactory.makeSymbol("PROMPT-FOR-LIST-OF-CYCLISTS"), SubLObjectFactory.makeKeyword("VALUE-UPDATE-FN"), SubLObjectFactory.makeSymbol("RECEIVE-LIST-OF-CYCLISTS") });
        $sym172$CB_MYREVIEWER_FILTER = SubLObjectFactory.makeSymbol("CB-MYREVIEWER-FILTER");
        $sym173$SET_CB_MYREVIEWER_FILTER = SubLObjectFactory.makeSymbol("SET-CB-MYREVIEWER-FILTER");
        $sym174$MYREVIEWER_EFFECTIVE_FN = SubLObjectFactory.makeSymbol("MYREVIEWER-EFFECTIVE-FN");
        $sym175$_CB_USE_ASSERTION_START_DATE_FILTER_ = SubLObjectFactory.makeSymbol("*CB-USE-ASSERTION-START-DATE-FILTER*");
        $sym176$_CB_ASSERTION_START_DATE_FILTER_ = SubLObjectFactory.makeSymbol("*CB-ASSERTION-START-DATE-FILTER*");
        $sym177$ASSERTION_START_DATE = SubLObjectFactory.makeSymbol("ASSERTION-START-DATE");
        $list178 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("LINKNAME-PREFIX"), SubLObjectFactory.makeString("After "), SubLObjectFactory.makeKeyword("LINKABLE-NAME"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("myCreationTime")), SubLObjectFactory.makeKeyword("TYPE"), SubLObjectFactory.makeKeyword("SINGLE-SIMPLE-DATE"), SubLObjectFactory.makeKeyword("ACTIVE-P"), cb_viewpoint.NIL, SubLObjectFactory.makeKeyword("EFFECTIVE-FN"), SubLObjectFactory.makeSymbol("ASSERTION-AFTER-DATE"), SubLObjectFactory.makeKeyword("VALUE-PROMPT-FN"), SubLObjectFactory.makeSymbol("PROMPT-FOR-DATE"), SubLObjectFactory.makeKeyword("VALUE-UPDATE-FN"), SubLObjectFactory.makeSymbol("RECEIVE-DATE"), SubLObjectFactory.makeKeyword("INITIAL-FILTER-VALUE"), SubLObjectFactory.makeInteger(19800101) });
        $sym179$CB_ASSERTION_START_DATE_FILTER = SubLObjectFactory.makeSymbol("CB-ASSERTION-START-DATE-FILTER");
        $sym180$SET_CB_ASSERTION_START_DATE_FILTER = SubLObjectFactory.makeSymbol("SET-CB-ASSERTION-START-DATE-FILTER");
        $sym181$_CB_USE_ASSERTION_END_DATE_FILTER_ = SubLObjectFactory.makeSymbol("*CB-USE-ASSERTION-END-DATE-FILTER*");
        $sym182$_CB_ASSERTION_END_DATE_FILTER_ = SubLObjectFactory.makeSymbol("*CB-ASSERTION-END-DATE-FILTER*");
        $sym183$ASSERTION_END_DATE = SubLObjectFactory.makeSymbol("ASSERTION-END-DATE");
        $list184 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("LINKNAME-PREFIX"), SubLObjectFactory.makeString("Before "), SubLObjectFactory.makeKeyword("LINKABLE-NAME"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("myCreationTime")), SubLObjectFactory.makeKeyword("TYPE"), SubLObjectFactory.makeKeyword("SINGLE-SIMPLE-DATE"), SubLObjectFactory.makeKeyword("ACTIVE-P"), cb_viewpoint.NIL, SubLObjectFactory.makeKeyword("EFFECTIVE-FN"), SubLObjectFactory.makeSymbol("ASSERTION-BEFORE-DATE"), SubLObjectFactory.makeKeyword("VALUE-PROMPT-FN"), SubLObjectFactory.makeSymbol("PROMPT-FOR-DATE"), SubLObjectFactory.makeKeyword("VALUE-UPDATE-FN"), SubLObjectFactory.makeSymbol("RECEIVE-DATE"), SubLObjectFactory.makeKeyword("INITIAL-FILTER-VALUE"), SubLObjectFactory.makeInteger(29991231) });
        $sym185$CB_ASSERTION_END_DATE_FILTER = SubLObjectFactory.makeSymbol("CB-ASSERTION-END-DATE-FILTER");
        $sym186$SET_CB_ASSERTION_END_DATE_FILTER = SubLObjectFactory.makeSymbol("SET-CB-ASSERTION-END-DATE-FILTER");
        $sym187$_CB_USE_MTS_FILTER_ = SubLObjectFactory.makeSymbol("*CB-USE-MTS-FILTER*");
        $sym188$_CB_MTS_FILTER_ = SubLObjectFactory.makeSymbol("*CB-MTS-FILTER*");
        $list189 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("LINKABLE-NAME"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Microtheory")), SubLObjectFactory.makeKeyword("TYPE"), SubLObjectFactory.makeKeyword("LIST-OF-FORMS"), SubLObjectFactory.makeKeyword("ACTIVE-P"), cb_viewpoint.NIL, SubLObjectFactory.makeKeyword("EFFECTIVE-FN"), cb_viewpoint.NIL, SubLObjectFactory.makeKeyword("VALUE-PROMPT-FN"), SubLObjectFactory.makeSymbol("PROMPT-FOR-MT"), SubLObjectFactory.makeKeyword("VALUE-UPDATE-FN"), SubLObjectFactory.makeSymbol("RECEIVE-MT") });
        $sym190$CB_MTS_FILTER = SubLObjectFactory.makeSymbol("CB-MTS-FILTER");
        $sym191$SET_CB_MTS_FILTER = SubLObjectFactory.makeSymbol("SET-CB-MTS-FILTER");
        $sym192$_CB_USE_MYCREATIONPURPOSE_FILTER_ = SubLObjectFactory.makeSymbol("*CB-USE-MYCREATIONPURPOSE-FILTER*");
        $sym193$_CB_MYCREATIONPURPOSE_FILTER_ = SubLObjectFactory.makeSymbol("*CB-MYCREATIONPURPOSE-FILTER*");
        $sym194$MYCREATIONPURPOSE = SubLObjectFactory.makeSymbol("MYCREATIONPURPOSE");
        $list195 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("LINKABLE-NAME"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("myCreationPurpose")), SubLObjectFactory.makeKeyword("TYPE"), SubLObjectFactory.makeKeyword("LIST-OF-FORMS"), SubLObjectFactory.makeKeyword("ACTIVE-P"), cb_viewpoint.NIL, SubLObjectFactory.makeKeyword("VALUE-PROMPT-FN"), SubLObjectFactory.makeSymbol("PROMPT-FOR-CYCBASEDPROJECT"), SubLObjectFactory.makeKeyword("VALUE-UPDATE-FN"), SubLObjectFactory.makeSymbol("RECEIVE-LIST-OF-PROJECTS"), SubLObjectFactory.makeKeyword("EFFECTIVE-FN-SLOTNAME"), SubLObjectFactory.makeSymbol("ASSERTED-WHY") });
        $sym196$CB_MYCREATIONPURPOSE_FILTER = SubLObjectFactory.makeSymbol("CB-MYCREATIONPURPOSE-FILTER");
        $sym197$SET_CB_MYCREATIONPURPOSE_FILTER = SubLObjectFactory.makeSymbol("SET-CB-MYCREATIONPURPOSE-FILTER");
        $sym198$MYCREATIONPURPOSE_EFFECTIVE_FN = SubLObjectFactory.makeSymbol("MYCREATIONPURPOSE-EFFECTIVE-FN");
        $sym199$CB_ONLINE_FILTER_HOOKS = SubLObjectFactory.makeSymbol("CB-ONLINE-FILTER-HOOKS");
        $list200 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*ASSERTION-FILTER-HOOK*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CB-CALC-FILTER-HOOKS"))));
        $list201 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ANSWER-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("MT-GETTER"), (SubLObject)SubLObjectFactory.makeSymbol("GETTER"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("SPECIFIED-MT"));
        $list202 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SPECIFIED-MT"));
        $kw203$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw204$SPECIFIED_MT = SubLObjectFactory.makeKeyword("SPECIFIED-MT");
        $sym205$WITH_ASSERTION_FILTERS = SubLObjectFactory.makeSymbol("WITH-ASSERTION-FILTERS");
        $sym206$PCOND = SubLObjectFactory.makeSymbol("PCOND");
        $sym207$CAND = SubLObjectFactory.makeSymbol("CAND");
        $list208 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ACTIVE-FILTER-P"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("MTS")));
        $sym209$CNOT = SubLObjectFactory.makeSymbol("CNOT");
        $sym210$PIF = SubLObjectFactory.makeSymbol("PIF");
        $list211 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CB-MTS-FILTER-USE-GENLMT"));
        $sym212$WITH_MT_LIST_AND_GENL_MTS = SubLObjectFactory.makeSymbol("WITH-MT-LIST-AND-GENL-MTS");
        $list213 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CB-MTS-FILTER"));
        $sym214$CSETQ = SubLObjectFactory.makeSymbol("CSETQ");
        $sym215$WITH_MT_LIST = SubLObjectFactory.makeSymbol("WITH-MT-LIST");
        $list216 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FILTERED"), (SubLObject)SubLObjectFactory.makeSymbol("UNFILTERED"));
        $sym217$RESULT = SubLObjectFactory.makeUninternedSymbol("RESULT");
        $sym218$RET = SubLObjectFactory.makeSymbol("RET");
        $str219$cb_ev = SubLObjectFactory.makeString("cb-ev");
        $kw220$TOP = SubLObjectFactory.makeKeyword("TOP");
        $str221$cb_start_cb_ev = SubLObjectFactory.makeString("cb-start|cb-ev");
        $str222$_a__a__a = SubLObjectFactory.makeString("~a&~a&~a");
        $str223$_a__a = SubLObjectFactory.makeString("~a&~a");
        $sym224$CB_LINK_EDIT_VIEWPOINT = SubLObjectFactory.makeSymbol("CB-LINK-EDIT-VIEWPOINT");
    }
    
    public static final class $viewpoint_native extends SubLStructNative
    {
        public SubLObject $name;
        public SubLObject $summary_name;
        public SubLObject $linkable_name;
        public SubLObject $linkname_prefix;
        public SubLObject $filter_getter;
        public SubLObject $filter_setter;
        public SubLObject $type;
        public SubLObject $active_p;
        public SubLObject $effective_fn;
        public SubLObject $value_prompt_fn;
        public SubLObject $value_update_fn;
        public SubLObject $initial_filter_value;
        public SubLObject $effective_fn_slotname;
        private static final SubLStructDeclNative structDecl;
        
        public $viewpoint_native() {
            this.$name = (SubLObject)CommonSymbols.NIL;
            this.$summary_name = (SubLObject)CommonSymbols.NIL;
            this.$linkable_name = (SubLObject)CommonSymbols.NIL;
            this.$linkname_prefix = (SubLObject)CommonSymbols.NIL;
            this.$filter_getter = (SubLObject)CommonSymbols.NIL;
            this.$filter_setter = (SubLObject)CommonSymbols.NIL;
            this.$type = (SubLObject)CommonSymbols.NIL;
            this.$active_p = (SubLObject)CommonSymbols.NIL;
            this.$effective_fn = (SubLObject)CommonSymbols.NIL;
            this.$value_prompt_fn = (SubLObject)CommonSymbols.NIL;
            this.$value_update_fn = (SubLObject)CommonSymbols.NIL;
            this.$initial_filter_value = (SubLObject)CommonSymbols.NIL;
            this.$effective_fn_slotname = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$viewpoint_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$name;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$summary_name;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$linkable_name;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$linkname_prefix;
        }
        
        @Override
		public SubLObject getField6() {
            return this.$filter_getter;
        }
        
        @Override
		public SubLObject getField7() {
            return this.$filter_setter;
        }
        
        @Override
		public SubLObject getField8() {
            return this.$type;
        }
        
        @Override
		public SubLObject getField9() {
            return this.$active_p;
        }
        
        @Override
		public SubLObject getField10() {
            return this.$effective_fn;
        }
        
        @Override
		public SubLObject getField11() {
            return this.$value_prompt_fn;
        }
        
        @Override
		public SubLObject getField12() {
            return this.$value_update_fn;
        }
        
        @Override
		public SubLObject getField13() {
            return this.$initial_filter_value;
        }
        
        @Override
		public SubLObject getField14() {
            return this.$effective_fn_slotname;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$name = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$summary_name = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$linkable_name = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$linkname_prefix = value;
        }
        
        @Override
		public SubLObject setField6(final SubLObject value) {
            return this.$filter_getter = value;
        }
        
        @Override
		public SubLObject setField7(final SubLObject value) {
            return this.$filter_setter = value;
        }
        
        @Override
		public SubLObject setField8(final SubLObject value) {
            return this.$type = value;
        }
        
        @Override
		public SubLObject setField9(final SubLObject value) {
            return this.$active_p = value;
        }
        
        @Override
		public SubLObject setField10(final SubLObject value) {
            return this.$effective_fn = value;
        }
        
        @Override
		public SubLObject setField11(final SubLObject value) {
            return this.$value_prompt_fn = value;
        }
        
        @Override
		public SubLObject setField12(final SubLObject value) {
            return this.$value_update_fn = value;
        }
        
        @Override
		public SubLObject setField13(final SubLObject value) {
            return this.$initial_filter_value = value;
        }
        
        @Override
		public SubLObject setField14(final SubLObject value) {
            return this.$effective_fn_slotname = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$viewpoint_native.class, cb_viewpoint.$sym1$VIEWPOINT, cb_viewpoint.$sym2$VIEWPOINT_P, cb_viewpoint.$list3, cb_viewpoint.$list4, new String[] { "$name", "$summary_name", "$linkable_name", "$linkname_prefix", "$filter_getter", "$filter_setter", "$type", "$active_p", "$effective_fn", "$value_prompt_fn", "$value_update_fn", "$initial_filter_value", "$effective_fn_slotname" }, cb_viewpoint.$list5, cb_viewpoint.$list6, cb_viewpoint.$sym7$PRINT_VIEWPOINT);
        }
    }
    
    public static final class $viewpoint_p$UnaryFunction extends UnaryFunction
    {
        public $viewpoint_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("VIEWPOINT-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return cb_viewpoint.viewpoint_p(arg1);
        }
    }
}

/*

	Total time: 662 ms
	
*/