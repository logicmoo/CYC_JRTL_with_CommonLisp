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
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.inference.browser.cb_query;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cb_adornments extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.cb_adornments";
    public static final String myFingerPrint = "25b72a1f20f9f861d397f5a2654b958eea4b067e6c3a73a414511e3c9a385e57";
    @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 420L)
    private static SubLSymbol $adornment_display$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 643L)
    private static SubLSymbol $adorn_thingo$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 726L)
    private static SubLSymbol $adorn_arg$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 839L)
    private static SubLSymbol $adorn_pred$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 953L)
    private static SubLSymbol $adorn_mt$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 1064L)
    private static SubLSymbol $adornment_type$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 1165L)
    private static SubLSymbol $adornment_sorted_list$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 2440L)
    public static SubLSymbol $dtp_adornment$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 4962L)
    public static SubLSymbol $cb_adornment_table$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 20395L)
    public static SubLSymbol $debug_adornments_p$;
    private static final SubLSymbol $kw0$MAIN;
    private static final SubLList $list1;
    private static final SubLString $str2$_;
    private static final SubLSymbol $sym3$ADORNMENT;
    private static final SubLSymbol $sym4$ADORNMENT_P;
    private static final SubLList $list5;
    private static final SubLList $list6;
    private static final SubLList $list7;
    private static final SubLList $list8;
    private static final SubLSymbol $sym9$PRINT_ADORNMENT;
    private static final SubLSymbol $sym10$ADORNMENT_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list11;
    private static final SubLSymbol $sym12$ADORNMENT_NAME;
    private static final SubLSymbol $sym13$_CSETF_ADORNMENT_NAME;
    private static final SubLSymbol $sym14$ADORNMENT_TYPE;
    private static final SubLSymbol $sym15$_CSETF_ADORNMENT_TYPE;
    private static final SubLSymbol $sym16$ADORNMENT_ACTIVE_P;
    private static final SubLSymbol $sym17$_CSETF_ADORNMENT_ACTIVE_P;
    private static final SubLSymbol $sym18$ADORNMENT_IMAGE;
    private static final SubLSymbol $sym19$_CSETF_ADORNMENT_IMAGE;
    private static final SubLSymbol $sym20$ADORNMENT_IMAGE_DISABLED;
    private static final SubLSymbol $sym21$_CSETF_ADORNMENT_IMAGE_DISABLED;
    private static final SubLSymbol $sym22$ADORNMENT_IMAGE_ALT;
    private static final SubLSymbol $sym23$_CSETF_ADORNMENT_IMAGE_ALT;
    private static final SubLSymbol $sym24$ADORNMENT_DYNAMIC_TAGFN;
    private static final SubLSymbol $sym25$_CSETF_ADORNMENT_DYNAMIC_TAGFN;
    private static final SubLSymbol $sym26$ADORNMENT_COLOR;
    private static final SubLSymbol $sym27$_CSETF_ADORNMENT_COLOR;
    private static final SubLSymbol $sym28$ADORNMENT_LETTER;
    private static final SubLSymbol $sym29$_CSETF_ADORNMENT_LETTER;
    private static final SubLSymbol $sym30$ADORNMENT_EFFECTIVE_FN;
    private static final SubLSymbol $sym31$_CSETF_ADORNMENT_EFFECTIVE_FN;
    private static final SubLSymbol $sym32$ADORNMENT_HANDLER;
    private static final SubLSymbol $sym33$_CSETF_ADORNMENT_HANDLER;
    private static final SubLSymbol $sym34$ADORNMENT_TOOL;
    private static final SubLSymbol $sym35$_CSETF_ADORNMENT_TOOL;
    private static final SubLSymbol $sym36$ADORNMENT_COMMENT;
    private static final SubLSymbol $sym37$_CSETF_ADORNMENT_COMMENT;
    private static final SubLSymbol $sym38$ADORNMENT_DYNAMIC_COMMENT;
    private static final SubLSymbol $sym39$_CSETF_ADORNMENT_DYNAMIC_COMMENT;
    private static final SubLSymbol $sym40$ADORNMENT_TITLE;
    private static final SubLSymbol $sym41$_CSETF_ADORNMENT_TITLE;
    private static final SubLSymbol $kw42$NAME;
    private static final SubLSymbol $kw43$TYPE;
    private static final SubLSymbol $kw44$ACTIVE_P;
    private static final SubLSymbol $kw45$IMAGE;
    private static final SubLSymbol $kw46$IMAGE_DISABLED;
    private static final SubLSymbol $kw47$IMAGE_ALT;
    private static final SubLSymbol $kw48$DYNAMIC_TAGFN;
    private static final SubLSymbol $kw49$COLOR;
    private static final SubLSymbol $kw50$LETTER;
    private static final SubLSymbol $kw51$EFFECTIVE_FN;
    private static final SubLSymbol $kw52$HANDLER;
    private static final SubLSymbol $kw53$TOOL;
    private static final SubLSymbol $kw54$COMMENT;
    private static final SubLSymbol $kw55$DYNAMIC_COMMENT;
    private static final SubLSymbol $kw56$TITLE;
    private static final SubLString $str57$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw58$BEGIN;
    private static final SubLSymbol $sym59$MAKE_ADORNMENT;
    private static final SubLSymbol $kw60$SLOT;
    private static final SubLSymbol $kw61$END;
    private static final SubLSymbol $sym62$VISIT_DEFSTRUCT_OBJECT_ADORNMENT_METHOD;
    private static final SubLSymbol $sym63$_CB_ADORNMENT_TABLE_;
    private static final SubLList $list64;
    private static final SubLSymbol $sym65$OLD;
    private static final SubLSymbol $sym66$NEW;
    private static final SubLSymbol $sym67$CLET;
    private static final SubLList $list68;
    private static final SubLSymbol $sym69$QUOTE;
    private static final SubLSymbol $sym70$CSETF;
    private static final SubLSymbol $sym71$CSETQ;
    private static final SubLSymbol $sym72$CONS;
    private static final SubLSymbol $sym73$DELETE;
    private static final SubLList $list74;
    private static final SubLSymbol $sym75$ACTIVE_ADORNMENT_STRUCT_P;
    private static final SubLSymbol $kw76$ASSERTION;
    private static final SubLSymbol $kw77$DEDUCTION;
    private static final SubLSymbol $kw78$INDEX_CONSTANT_NAME;
    private static final SubLSymbol $kw79$INDEX_FORT;
    private static final SubLSymbol $kw80$INDEX_CONSTANT;
    private static final SubLSymbol $kw81$CONSTANT;
    private static final SubLSymbol $kw82$GAF_ARG_PREDICATE;
    private static final SubLSymbol $kw83$INDEX_TERM;
    private static final SubLSymbol $kw84$TOP;
    private static final SubLString $str85$cb_start_;
    private static final SubLString $str86$_;
    private static final SubLSymbol $kw87$CENTER;
    private static final SubLSymbol $sym88$DISPLAY_ADORNMENT;
    private static final SubLSymbol $sym89$ACTIVATE_ADORNMENT;
    private static final SubLSymbol $kw90$INDEX_BROWSER;
    private static final SubLString $str91$index_browser_gif;
    private static final SubLSymbol $kw92$INDEX_BROWSER_DISABLED;
    private static final SubLString $str93$index_browser_disabled_gif;
    private static final SubLList $list94;
    private static final SubLSymbol $sym95$INDEX_BROWSER;
    private static final SubLList $list96;
    private static final SubLSymbol $sym97$META_AXIOMS;
    private static final SubLSymbol $kw98$CY_MENU;
    private static final SubLString $str99$cy_menu_gif;
    private static final SubLList $list100;
    private static final SubLSymbol $sym101$ASSERTION_REVIEW;
    private static final SubLSymbol $kw102$BL_MENU;
    private static final SubLString $str103$bl_menu_gif;
    private static final SubLList $list104;
    private static final SubLSymbol $sym105$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const106$EverythingPSC;
    private static final SubLSymbol $kw107$RED_DIAMOND;
    private static final SubLString $str108$red_diam_gif;
    private static final SubLList $list109;
    private static final SubLSymbol $sym110$HIERARCHY_LINK;
    private static final SubLSymbol $kw111$HIERARCHY_BROWSER;
    private static final SubLString $str112$hierarchy_browser_gif;
    private static final SubLSymbol $kw113$HIERARCHY_BROWSER_DISABLED;
    private static final SubLString $str114$hierarchy_browser_disabled_gif;
    private static final SubLList $list115;
    private static final SubLSymbol $sym116$HIERARCHY_DEFAULT;
    private static final SubLSymbol $kw117$ALPHA_BROWSER;
    private static final SubLString $str118$alpha_browser_gif;
    private static final SubLSymbol $kw119$ALPHA_BROWSER_DISABLED;
    private static final SubLString $str120$alpha_browser_disabled_gif;
    private static final SubLList $list121;
    private static final SubLSymbol $sym122$ALPHABETICAL_SEARCH;
    private static final SubLSymbol $kw123$PLUS_GREEN;
    private static final SubLString $str124$plus_green_gif;
    private static final SubLString $str125$_LitQ_;
    private static final SubLSymbol $kw126$PLUS_YELLOW;
    private static final SubLString $str127$plus_yellow_gif;
    private static final SubLSymbol $kw128$PLUS_PURPLE;
    private static final SubLString $str129$plus_purple_gif;
    private static final SubLSymbol $kw130$LIKELY;
    private static final SubLSymbol $kw131$KNOWN;
    private static final SubLSymbol $kw132$POSSIBLE;
    private static final SubLSymbol $kw133$INDEX;
    private static final SubLList $list134;
    private static final SubLSymbol $sym135$LITERAL_QUERY_INDEX;
    private static final SubLSymbol $kw136$NORMAL;
    private static final SubLList $list137;
    private static final SubLSymbol $sym138$LITERAL_QUERY_NORMAL;
    private static final SubLSymbol $kw139$INDEX_DISPLAY;
    private static final SubLList $list140;
    private static final SubLSymbol $sym141$LITERAL_QUERY_INDEX_DISPLAY;
    private static final SubLString $str142$_Asserted_Argument_;
    private static final SubLSymbol $sym143$CONVERT_DEDUCTION_TO_FORMULA;
    private static final SubLString $str144$_Assertion_Deductions_;
    private static final SubLSymbol $kw145$BL_SDI;
    private static final SubLString $str146$bl_sdi_gif;
    private static final SubLList $list147;
    private static final SubLSymbol $sym148$ASSERTED_ASSERTION;
    private static final SubLSymbol $kw149$GR_SDI;
    private static final SubLString $str150$gr_sdi_gif;
    private static final SubLList $list151;
    private static final SubLSymbol $sym152$DEDUCED_ASSERTION;
    private static final SubLSymbol $sym153$_DEBUG_ADORNMENTS_P_;
    private static final SubLSymbol $kw154$CB_VIEW_ADORN;
    private static final SubLString $str155$cb_view_adorn_html;
    private static final SubLList $list156;
    private static final SubLString $str157$_a_does_not_specify_an_index;
    private static final SubLString $str158$Adornments;
    private static final SubLString $str159$__DOCTYPE_html_PUBLIC_____W3C__DT;
    private static final SubLString $str160$_meta_http_equiv__X_UA_Compatible;
    private static final SubLSymbol $kw161$UNINITIALIZED;
    private static final SubLSymbol $kw162$CB_CYC;
    private static final SubLSymbol $kw163$SAM_AUTOCOMPLETE_CSS;
    private static final SubLSymbol $kw164$SHA1;
    private static final SubLString $str165$yui_skin_sam;
    private static final SubLString $str166$reloadFrameButton;
    private static final SubLString $str167$button;
    private static final SubLString $str168$reload;
    private static final SubLString $str169$Refresh_Frames;
    private static final SubLString $str170$post;
    private static final SubLString $str171$cb_adornment_handler;
    private static final SubLString $str172$Current_Values;
    private static final SubLString $str173$Update_Adornment_Settings;
    private static final SubLString $str174$Currently_Active_Adornments__;
    private static final SubLString $str175$Adornment_Associations;
    private static final SubLSymbol $kw176$MIDDLE;
    private static final SubLString $str177$Icon;
    private static final SubLString $str178$Active_;
    private static final SubLSymbol $kw179$LEFT;
    private static final SubLString $str180$Name;
    private static final SubLString $str181$Dynamic_;
    private static final SubLString $str182$Has_Link_;
    private static final SubLString $str183$Type;
    private static final SubLString $str184$Tool;
    private static final SubLString $str185$effective_fn;
    private static final SubLSymbol $sym186$ADORNMENT_;
    private static final SubLString $str187$_dddddd;
    private static final SubLString $str188$_cccccc;
    private static final SubLString $str189$_dynamic;
    private static final SubLString $str190$_;
    private static final SubLString $str191$No;
    private static final SubLString $str192$Yes;
    private static final SubLSymbol $kw193$NBSP;
    private static final SubLSymbol $sym194$CB_VIEW_ADORN;
    private static final SubLSymbol $kw195$HTML_HANDLER;
    private static final SubLString $str196$debug;
    private static final SubLString $str197$_;
    private static final SubLString $str198$_;
    private static final SubLString $str199$Active_adornments_have_been_chang;
    private static final SubLSymbol $sym200$CB_ADORNMENT_HANDLER;
    private static final SubLString $str201$_View_Adornments_;
    private static final SubLString $str202$cb_view_adorn__A;
    private static final SubLSymbol $kw203$VIEW_ADORN;
    private static final SubLSymbol $sym204$CB_LINK_VIEW_ADORN;
    private static final SubLString $str205$___;
    
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 1738L)
    public static SubLObject bookkeeping_assertion_p(final SubLObject assertion) {
        return (SubLObject)SubLObjectFactory.makeBoolean(cb_adornments.NIL != assertions_high.gaf_assertionP(assertion) && cb_adornments.NIL != fort_types_interface.bookkeeping_predicate_p(assertions_high.gaf_predicate(assertion)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 1957L)
    public static SubLObject documentation_assertion_p(final SubLObject assertion) {
        return (SubLObject)SubLObjectFactory.makeBoolean(cb_adornments.NIL != assertions_high.gaf_assertionP(assertion) && cb_adornments.NIL != kb_accessors.documentation_predicate_in_any_mt_p(assertions_high.gaf_predicate(assertion)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 2167L)
    public static SubLObject print_adornment(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_adornments.NIL != print_high.$print_level$.getDynamicValue(thread) && depth.numG(print_high.$print_level$.getDynamicValue(thread))) {
            print_high.princ((SubLObject)cb_adornments.$str2$_, stream);
        }
        else if (cb_adornments.NIL != print_high.$print_readably$.getDynamicValue(thread)) {
            print_high.print_not_readable(v_object, stream);
        }
        else {
            print_macros.print_unreadable_object_preamble(stream, v_object, (SubLObject)cb_adornments.T, (SubLObject)cb_adornments.T);
            print_high.princ(adornment_name(v_object), stream);
            print_macros.print_unreadable_object_postamble(stream, v_object, (SubLObject)cb_adornments.NIL, (SubLObject)cb_adornments.NIL);
        }
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 2440L)
    public static SubLObject adornment_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_adornment(v_object, stream, (SubLObject)cb_adornments.ZERO_INTEGER);
        return (SubLObject)cb_adornments.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 2440L)
    public static SubLObject adornment_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $adornment_native.class) ? cb_adornments.T : cb_adornments.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 2440L)
    public static SubLObject adornment_name(final SubLObject v_object) {
        assert cb_adornments.NIL != adornment_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 2440L)
    public static SubLObject adornment_type(final SubLObject v_object) {
        assert cb_adornments.NIL != adornment_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 2440L)
    public static SubLObject adornment_active_p(final SubLObject v_object) {
        assert cb_adornments.NIL != adornment_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 2440L)
    public static SubLObject adornment_image(final SubLObject v_object) {
        assert cb_adornments.NIL != adornment_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 2440L)
    public static SubLObject adornment_image_disabled(final SubLObject v_object) {
        assert cb_adornments.NIL != adornment_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 2440L)
    public static SubLObject adornment_image_alt(final SubLObject v_object) {
        assert cb_adornments.NIL != adornment_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 2440L)
    public static SubLObject adornment_dynamic_tagfn(final SubLObject v_object) {
        assert cb_adornments.NIL != adornment_p(v_object) : v_object;
        return v_object.getField8();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 2440L)
    public static SubLObject adornment_color(final SubLObject v_object) {
        assert cb_adornments.NIL != adornment_p(v_object) : v_object;
        return v_object.getField9();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 2440L)
    public static SubLObject adornment_letter(final SubLObject v_object) {
        assert cb_adornments.NIL != adornment_p(v_object) : v_object;
        return v_object.getField10();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 2440L)
    public static SubLObject adornment_effective_fn(final SubLObject v_object) {
        assert cb_adornments.NIL != adornment_p(v_object) : v_object;
        return v_object.getField11();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 2440L)
    public static SubLObject adornment_handler(final SubLObject v_object) {
        assert cb_adornments.NIL != adornment_p(v_object) : v_object;
        return v_object.getField12();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 2440L)
    public static SubLObject adornment_tool(final SubLObject v_object) {
        assert cb_adornments.NIL != adornment_p(v_object) : v_object;
        return v_object.getField13();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 2440L)
    public static SubLObject adornment_comment(final SubLObject v_object) {
        assert cb_adornments.NIL != adornment_p(v_object) : v_object;
        return v_object.getField14();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 2440L)
    public static SubLObject adornment_dynamic_comment(final SubLObject v_object) {
        assert cb_adornments.NIL != adornment_p(v_object) : v_object;
        return v_object.getField15();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 2440L)
    public static SubLObject adornment_title(final SubLObject v_object) {
        assert cb_adornments.NIL != adornment_p(v_object) : v_object;
        return v_object.getField16();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 2440L)
    public static SubLObject _csetf_adornment_name(final SubLObject v_object, final SubLObject value) {
        assert cb_adornments.NIL != adornment_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 2440L)
    public static SubLObject _csetf_adornment_type(final SubLObject v_object, final SubLObject value) {
        assert cb_adornments.NIL != adornment_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 2440L)
    public static SubLObject _csetf_adornment_active_p(final SubLObject v_object, final SubLObject value) {
        assert cb_adornments.NIL != adornment_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 2440L)
    public static SubLObject _csetf_adornment_image(final SubLObject v_object, final SubLObject value) {
        assert cb_adornments.NIL != adornment_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 2440L)
    public static SubLObject _csetf_adornment_image_disabled(final SubLObject v_object, final SubLObject value) {
        assert cb_adornments.NIL != adornment_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 2440L)
    public static SubLObject _csetf_adornment_image_alt(final SubLObject v_object, final SubLObject value) {
        assert cb_adornments.NIL != adornment_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 2440L)
    public static SubLObject _csetf_adornment_dynamic_tagfn(final SubLObject v_object, final SubLObject value) {
        assert cb_adornments.NIL != adornment_p(v_object) : v_object;
        return v_object.setField8(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 2440L)
    public static SubLObject _csetf_adornment_color(final SubLObject v_object, final SubLObject value) {
        assert cb_adornments.NIL != adornment_p(v_object) : v_object;
        return v_object.setField9(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 2440L)
    public static SubLObject _csetf_adornment_letter(final SubLObject v_object, final SubLObject value) {
        assert cb_adornments.NIL != adornment_p(v_object) : v_object;
        return v_object.setField10(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 2440L)
    public static SubLObject _csetf_adornment_effective_fn(final SubLObject v_object, final SubLObject value) {
        assert cb_adornments.NIL != adornment_p(v_object) : v_object;
        return v_object.setField11(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 2440L)
    public static SubLObject _csetf_adornment_handler(final SubLObject v_object, final SubLObject value) {
        assert cb_adornments.NIL != adornment_p(v_object) : v_object;
        return v_object.setField12(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 2440L)
    public static SubLObject _csetf_adornment_tool(final SubLObject v_object, final SubLObject value) {
        assert cb_adornments.NIL != adornment_p(v_object) : v_object;
        return v_object.setField13(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 2440L)
    public static SubLObject _csetf_adornment_comment(final SubLObject v_object, final SubLObject value) {
        assert cb_adornments.NIL != adornment_p(v_object) : v_object;
        return v_object.setField14(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 2440L)
    public static SubLObject _csetf_adornment_dynamic_comment(final SubLObject v_object, final SubLObject value) {
        assert cb_adornments.NIL != adornment_p(v_object) : v_object;
        return v_object.setField15(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 2440L)
    public static SubLObject _csetf_adornment_title(final SubLObject v_object, final SubLObject value) {
        assert cb_adornments.NIL != adornment_p(v_object) : v_object;
        return v_object.setField16(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 2440L)
    public static SubLObject make_adornment(SubLObject arglist) {
        if (arglist == cb_adornments.UNPROVIDED) {
            arglist = (SubLObject)cb_adornments.NIL;
        }
        final SubLObject v_new = (SubLObject)new $adornment_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)cb_adornments.NIL, next = arglist; cb_adornments.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)cb_adornments.$kw42$NAME)) {
                _csetf_adornment_name(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)cb_adornments.$kw43$TYPE)) {
                _csetf_adornment_type(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)cb_adornments.$kw44$ACTIVE_P)) {
                _csetf_adornment_active_p(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)cb_adornments.$kw45$IMAGE)) {
                _csetf_adornment_image(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)cb_adornments.$kw46$IMAGE_DISABLED)) {
                _csetf_adornment_image_disabled(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)cb_adornments.$kw47$IMAGE_ALT)) {
                _csetf_adornment_image_alt(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)cb_adornments.$kw48$DYNAMIC_TAGFN)) {
                _csetf_adornment_dynamic_tagfn(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)cb_adornments.$kw49$COLOR)) {
                _csetf_adornment_color(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)cb_adornments.$kw50$LETTER)) {
                _csetf_adornment_letter(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)cb_adornments.$kw51$EFFECTIVE_FN)) {
                _csetf_adornment_effective_fn(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)cb_adornments.$kw52$HANDLER)) {
                _csetf_adornment_handler(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)cb_adornments.$kw53$TOOL)) {
                _csetf_adornment_tool(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)cb_adornments.$kw54$COMMENT)) {
                _csetf_adornment_comment(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)cb_adornments.$kw55$DYNAMIC_COMMENT)) {
                _csetf_adornment_dynamic_comment(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)cb_adornments.$kw56$TITLE)) {
                _csetf_adornment_title(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)cb_adornments.$str57$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 2440L)
    public static SubLObject visit_defstruct_adornment(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)cb_adornments.$kw58$BEGIN, (SubLObject)cb_adornments.$sym59$MAKE_ADORNMENT, (SubLObject)cb_adornments.FIFTEEN_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)cb_adornments.$kw60$SLOT, (SubLObject)cb_adornments.$kw42$NAME, adornment_name(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)cb_adornments.$kw60$SLOT, (SubLObject)cb_adornments.$kw43$TYPE, adornment_type(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)cb_adornments.$kw60$SLOT, (SubLObject)cb_adornments.$kw44$ACTIVE_P, adornment_active_p(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)cb_adornments.$kw60$SLOT, (SubLObject)cb_adornments.$kw45$IMAGE, adornment_image(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)cb_adornments.$kw60$SLOT, (SubLObject)cb_adornments.$kw46$IMAGE_DISABLED, adornment_image_disabled(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)cb_adornments.$kw60$SLOT, (SubLObject)cb_adornments.$kw47$IMAGE_ALT, adornment_image_alt(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)cb_adornments.$kw60$SLOT, (SubLObject)cb_adornments.$kw48$DYNAMIC_TAGFN, adornment_dynamic_tagfn(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)cb_adornments.$kw60$SLOT, (SubLObject)cb_adornments.$kw49$COLOR, adornment_color(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)cb_adornments.$kw60$SLOT, (SubLObject)cb_adornments.$kw50$LETTER, adornment_letter(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)cb_adornments.$kw60$SLOT, (SubLObject)cb_adornments.$kw51$EFFECTIVE_FN, adornment_effective_fn(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)cb_adornments.$kw60$SLOT, (SubLObject)cb_adornments.$kw52$HANDLER, adornment_handler(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)cb_adornments.$kw60$SLOT, (SubLObject)cb_adornments.$kw53$TOOL, adornment_tool(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)cb_adornments.$kw60$SLOT, (SubLObject)cb_adornments.$kw54$COMMENT, adornment_comment(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)cb_adornments.$kw60$SLOT, (SubLObject)cb_adornments.$kw55$DYNAMIC_COMMENT, adornment_dynamic_comment(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)cb_adornments.$kw60$SLOT, (SubLObject)cb_adornments.$kw56$TITLE, adornment_title(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)cb_adornments.$kw61$END, (SubLObject)cb_adornments.$sym59$MAKE_ADORNMENT, (SubLObject)cb_adornments.FIFTEEN_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 2440L)
    public static SubLObject visit_defstruct_object_adornment_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_adornment(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 5081L)
    public static SubLObject active_adornment_struct_p(final SubLObject adornment, SubLObject type) {
        if (type == cb_adornments.UNPROVIDED) {
            type = cb_adornments.$adornment_type$.getDynamicValue();
        }
        if (cb_adornments.NIL != type) {
            if (adornment_type(adornment).eql(type) && cb_adornments.NIL != active_adornment_p(adornment)) {
                return (SubLObject)ConsesLow.list(adornment);
            }
        }
        else if (cb_adornments.NIL != active_adornment_p(adornment)) {
            return (SubLObject)ConsesLow.list(adornment);
        }
        return (SubLObject)cb_adornments.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 5403L)
    public static SubLObject active_adornment_p(final SubLObject adornment) {
        final SubLObject active_p = adornment_active_p(adornment);
        if (active_p.isFunctionSpec()) {
            return Functions.funcall(active_p);
        }
        return active_p;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 5626L)
    public static SubLObject enable_adornment(final SubLObject adornment_name, SubLObject enable_p) {
        if (enable_p == cb_adornments.UNPROVIDED) {
            enable_p = (SubLObject)cb_adornments.T;
        }
        final SubLObject adornment = find_adornment(adornment_name);
        if (cb_adornments.NIL != adornment) {
            _csetf_adornment_active_p(adornment, enable_p);
            return enable_p;
        }
        return (SubLObject)cb_adornments.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 5893L)
    public static SubLObject defadornment(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = (SubLObject)cb_adornments.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_adornments.$list64);
        name = current.first();
        final SubLObject arglist;
        current = (arglist = current.rest());
        final SubLObject old = (SubLObject)cb_adornments.$sym65$OLD;
        final SubLObject v_new = (SubLObject)cb_adornments.$sym66$NEW;
        return (SubLObject)ConsesLow.list((SubLObject)cb_adornments.$sym67$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(old, (SubLObject)cb_adornments.$list68), (SubLObject)ConsesLow.list(v_new, (SubLObject)ConsesLow.list((SubLObject)cb_adornments.$sym59$MAKE_ADORNMENT, (SubLObject)ConsesLow.list((SubLObject)cb_adornments.$sym69$QUOTE, arglist)))), (SubLObject)ConsesLow.list((SubLObject)cb_adornments.$sym70$CSETF, (SubLObject)ConsesLow.list((SubLObject)cb_adornments.$sym12$ADORNMENT_NAME, v_new), (SubLObject)ConsesLow.list((SubLObject)cb_adornments.$sym69$QUOTE, name)), (SubLObject)ConsesLow.list((SubLObject)cb_adornments.$sym71$CSETQ, (SubLObject)cb_adornments.$sym63$_CB_ADORNMENT_TABLE_, (SubLObject)ConsesLow.list((SubLObject)cb_adornments.$sym72$CONS, v_new, (SubLObject)ConsesLow.listS((SubLObject)cb_adornments.$sym73$DELETE, (SubLObject)ConsesLow.list((SubLObject)cb_adornments.$sym69$QUOTE, name), old, (SubLObject)cb_adornments.$list74))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 6538L)
    public static SubLObject find_adornment(final SubLObject name) {
        return Sequences.find(name, cb_adornments.$cb_adornment_table$.getGlobalValue(), Symbols.symbol_function((SubLObject)cb_adornments.EQUAL), Symbols.symbol_function((SubLObject)cb_adornments.$sym12$ADORNMENT_NAME), (SubLObject)cb_adornments.UNPROVIDED, (SubLObject)cb_adornments.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 6646L)
    public static SubLObject active_adornments(final SubLObject type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)cb_adornments.NIL;
        final SubLObject _prev_bind_0 = cb_adornments.$adornment_type$.currentBinding(thread);
        try {
            cb_adornments.$adornment_type$.bind(type, thread);
            result = Mapping.mapcan(Symbols.symbol_function((SubLObject)cb_adornments.$sym75$ACTIVE_ADORNMENT_STRUCT_P), cb_adornments.$cb_adornment_table$.getGlobalValue(), cb_adornments.EMPTY_SUBL_OBJECT_ARRAY);
        }
        finally {
            cb_adornments.$adornment_type$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 6887L)
    public static SubLObject id_for_type(final SubLObject type, final SubLObject thingo) {
        if (type.eql((SubLObject)cb_adornments.$kw76$ASSERTION)) {
            return assertion_handles.assertion_id(thingo);
        }
        if (type.eql((SubLObject)cb_adornments.$kw77$DEDUCTION)) {
            return deduction_handles.deduction_id(thingo);
        }
        if (type.eql((SubLObject)cb_adornments.$kw78$INDEX_CONSTANT_NAME)) {
            return constants_high.constant_name(thingo);
        }
        if (type.eql((SubLObject)cb_adornments.$kw79$INDEX_FORT) || type.eql((SubLObject)cb_adornments.$kw80$INDEX_CONSTANT) || type.eql((SubLObject)cb_adornments.$kw81$CONSTANT) || type.eql((SubLObject)cb_adornments.$kw82$GAF_ARG_PREDICATE)) {
            return cb_utilities.cb_fort_identifier(thingo);
        }
        if (type.eql((SubLObject)cb_adornments.$kw83$INDEX_TERM)) {
            return cb_utilities.cb_term_identifier(thingo);
        }
        return cb_utilities.cb_term_identifier(thingo);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 7359L)
    public static SubLObject calc_adornment_image_alt(final SubLObject adornment, final SubLObject thingo, SubLObject arg, SubLObject pred) {
        if (arg == cb_adornments.UNPROVIDED) {
            arg = (SubLObject)cb_adornments.NIL;
        }
        if (pred == cb_adornments.UNPROVIDED) {
            pred = (SubLObject)cb_adornments.NIL;
        }
        final SubLObject image_alt = adornment_image_alt(adornment);
        if (cb_adornments.NIL == image_alt || image_alt.isString()) {
            return image_alt;
        }
        if (cb_adornments.NIL != arg) {
            return Functions.funcall(adornment_image_alt(adornment), thingo, arg, pred);
        }
        return Functions.funcall(adornment_image_alt(adornment), thingo);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 7729L)
    public static SubLObject display_linked_adornment(final SubLObject adornment, final SubLObject type, final SubLObject thingo, final SubLObject arg, final SubLObject pred, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject handler = adornment_handler(adornment);
        final SubLObject id = id_for_type(type, thingo);
        final SubLObject image = adornment_image(adornment);
        final SubLObject alt = calc_adornment_image_alt(adornment, thingo, arg, pred);
        if (cb_adornments.$adornment_display$.getDynamicValue(thread).eql((SubLObject)cb_adornments.$kw84$TOP)) {
            handler = Sequences.cconcatenate((SubLObject)cb_adornments.$str85$cb_start_, handler);
        }
        SubLObject handler_string = Sequences.cconcatenate(format_nil.format_nil_a_no_copy(handler), new SubLObject[] { cb_adornments.$str86$_, format_nil.format_nil_a_no_copy(id) });
        final SubLObject title = adornment_title(adornment);
        if (cb_adornments.NIL != arg) {
            if (cb_adornments.NIL != mt) {
                handler_string = Sequences.cconcatenate(format_nil.format_nil_a_no_copy(handler_string), new SubLObject[] { cb_adornments.$str86$_, format_nil.format_nil_a_no_copy(arg), cb_adornments.$str86$_, format_nil.format_nil_a_no_copy(cb_utilities.cb_fort_identifier(pred)), cb_adornments.$str86$_, format_nil.format_nil_a_no_copy(cb_utilities.cb_fort_identifier(mt)) });
            }
            else {
                handler_string = Sequences.cconcatenate(format_nil.format_nil_a_no_copy(handler_string), new SubLObject[] { cb_adornments.$str86$_, format_nil.format_nil_a_no_copy(arg), cb_adornments.$str86$_, format_nil.format_nil_a_no_copy(cb_utilities.cb_fort_identifier(pred)) });
            }
        }
        if (cb_adornments.NIL != image) {
            final SubLObject resolved_image = resolved_adornment_image(image, adornment, thingo, arg, pred);
            final SubLObject frame_name_var = cb_utilities.cb_frame_name(cb_adornments.$adornment_display$.getDynamicValue(thread));
            html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_adornments.UNPROVIDED);
            cb_parameters.cyc_cgi_url_int();
            html_utilities.html_princ(handler_string);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_adornments.UNPROVIDED);
            if (cb_adornments.NIL != title) {
                html_utilities.html_markup(html_macros.$html_anchor_title$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_adornments.UNPROVIDED);
                html_utilities.html_markup(title);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_adornments.UNPROVIDED);
            }
            if (cb_adornments.NIL != frame_name_var) {
                html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_adornments.UNPROVIDED);
                html_utilities.html_markup(frame_name_var);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_adornments.UNPROVIDED);
            }
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_adornments.UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_adornments.T, thread);
                html_utilities.html_basic_image(resolved_image, alt, (SubLObject)cb_adornments.$kw87$CENTER, (SubLObject)cb_adornments.UNPROVIDED);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        }
        else {
            final SubLObject frame_name_var2 = cb_utilities.cb_frame_name(cb_adornments.$adornment_display$.getDynamicValue(thread));
            html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_adornments.UNPROVIDED);
            cb_parameters.cyc_cgi_url_int();
            html_utilities.html_princ(handler_string);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_adornments.UNPROVIDED);
            if (cb_adornments.NIL != title) {
                html_utilities.html_markup(html_macros.$html_anchor_title$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_adornments.UNPROVIDED);
                html_utilities.html_markup(title);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_adornments.UNPROVIDED);
            }
            if (cb_adornments.NIL != frame_name_var2) {
                html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_adornments.UNPROVIDED);
                html_utilities.html_markup(frame_name_var2);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_adornments.UNPROVIDED);
            }
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_adornments.UNPROVIDED);
            final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_adornments.T, thread);
                final SubLObject color = adornment_color(adornment);
                html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                if (cb_adornments.NIL != color) {
                    html_utilities.html_markup(html_macros.$html_font_color$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_adornments.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_color(color));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_adornments.UNPROVIDED);
                }
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_adornments.UNPROVIDED);
                final SubLObject _prev_bind_0_$1 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_adornments.T, thread);
                    html_utilities.html_princ(adornment_letter(adornment));
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$1, thread);
                }
                html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
            }
            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        }
        return thingo;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 9136L)
    public static SubLObject display_adornment_disabled(final SubLObject adornment, SubLObject type, SubLObject thingo, SubLObject arg, SubLObject pred, SubLObject mt) {
        if (type == cb_adornments.UNPROVIDED) {
            type = (SubLObject)cb_adornments.NIL;
        }
        if (thingo == cb_adornments.UNPROVIDED) {
            thingo = (SubLObject)cb_adornments.NIL;
        }
        if (arg == cb_adornments.UNPROVIDED) {
            arg = (SubLObject)cb_adornments.NIL;
        }
        if (pred == cb_adornments.UNPROVIDED) {
            pred = (SubLObject)cb_adornments.NIL;
        }
        if (mt == cb_adornments.UNPROVIDED) {
            mt = (SubLObject)cb_adornments.NIL;
        }
        final SubLObject image = resolved_adornment_image(adornment_image_disabled(adornment), adornment, thingo, arg, pred);
        html_utilities.html_basic_image(image, calc_adornment_image_alt(adornment, thingo, arg, pred), (SubLObject)cb_adornments.$kw84$TOP, (SubLObject)cb_adornments.UNPROVIDED);
        return (SubLObject)cb_adornments.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 9456L)
    public static SubLObject display_adornment(final SubLObject adornment, SubLObject type, SubLObject thingo, SubLObject arg, SubLObject pred, SubLObject mt) {
        if (type == cb_adornments.UNPROVIDED) {
            type = (SubLObject)cb_adornments.NIL;
        }
        if (thingo == cb_adornments.UNPROVIDED) {
            thingo = (SubLObject)cb_adornments.NIL;
        }
        if (arg == cb_adornments.UNPROVIDED) {
            arg = (SubLObject)cb_adornments.NIL;
        }
        if (pred == cb_adornments.UNPROVIDED) {
            pred = (SubLObject)cb_adornments.NIL;
        }
        if (mt == cb_adornments.UNPROVIDED) {
            mt = (SubLObject)cb_adornments.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject image = adornment_image(adornment);
        if (cb_adornments.NIL != adornment_handler(adornment) && cb_adornments.NIL != thingo) {
            display_linked_adornment(adornment, type, thingo, arg, pred, mt);
        }
        else if (cb_adornments.NIL != image) {
            final SubLObject resolved_image = resolved_adornment_image(image, adornment, thingo, arg, pred);
            html_utilities.html_basic_image(resolved_image, calc_adornment_image_alt(adornment, thingo, arg, pred), (SubLObject)cb_adornments.$kw84$TOP, (SubLObject)cb_adornments.UNPROVIDED);
        }
        else {
            final SubLObject color = adornment_color(adornment);
            html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
            if (cb_adornments.NIL != color) {
                html_utilities.html_markup(html_macros.$html_font_color$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_adornments.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_color(color));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_adornments.UNPROVIDED);
            }
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_adornments.UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_adornments.T, thread);
                html_utilities.html_princ(adornment_letter(adornment));
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
        }
        return thingo;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 10176L)
    public static SubLObject display_active_adornments(SubLObject type) {
        if (type == cb_adornments.UNPROVIDED) {
            type = (SubLObject)cb_adornments.NIL;
        }
        Mapping.mapc(Symbols.symbol_function((SubLObject)cb_adornments.$sym88$DISPLAY_ADORNMENT), active_adornments(type), cb_adornments.EMPTY_SUBL_OBJECT_ARRAY);
        return (SubLObject)cb_adornments.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 10305L)
    public static SubLObject resolved_adornment_image(final SubLObject image, SubLObject adornment, SubLObject thingo, SubLObject arg, SubLObject pred) {
        if (adornment == cb_adornments.UNPROVIDED) {
            adornment = (SubLObject)cb_adornments.NIL;
        }
        if (thingo == cb_adornments.UNPROVIDED) {
            thingo = (SubLObject)cb_adornments.NIL;
        }
        if (arg == cb_adornments.UNPROVIDED) {
            arg = (SubLObject)cb_adornments.NIL;
        }
        if (pred == cb_adornments.UNPROVIDED) {
            pred = (SubLObject)cb_adornments.NIL;
        }
        if (cb_adornments.NIL != adornment && !cb_adornments.assertionsDisabledInClass && cb_adornments.NIL == adornment_p(adornment)) {
            throw new AssertionError(adornment);
        }
        if (image.isKeyword()) {
            return cyc_file_dependencies.cb_icon_src(image);
        }
        if (image.isString()) {
            return image;
        }
        if (image.isFunctionSpec()) {
            return resolved_adornment_image(Functions.funcall(image, (SubLObject)((cb_adornments.NIL != thingo) ? adorn_thingo_p(adornment, thingo, arg, pred) : cb_adornments.NIL)), (SubLObject)cb_adornments.UNPROVIDED, (SubLObject)cb_adornments.UNPROVIDED, (SubLObject)cb_adornments.UNPROVIDED, (SubLObject)cb_adornments.UNPROVIDED);
        }
        return cyc_file_dependencies.cb_missing_icon();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 10922L)
    public static SubLObject adorn_thingo_p(final SubLObject adornment, final SubLObject thingo, SubLObject arg, SubLObject pred) {
        if (arg == cb_adornments.UNPROVIDED) {
            arg = (SubLObject)cb_adornments.NIL;
        }
        if (pred == cb_adornments.UNPROVIDED) {
            pred = (SubLObject)cb_adornments.NIL;
        }
        if (!adornment_effective_fn(adornment).isFunctionSpec()) {
            return (SubLObject)cb_adornments.NIL;
        }
        if (cb_adornments.NIL != arg) {
            return Functions.funcall(adornment_effective_fn(adornment), thingo, arg, pred);
        }
        return Functions.funcall(adornment_effective_fn(adornment), thingo);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 11285L)
    public static SubLObject activate_adornment(final SubLObject adornment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject thingo = cb_adornments.$adorn_thingo$.getDynamicValue(thread);
        final SubLObject arg = cb_adornments.$adorn_arg$.getDynamicValue(thread);
        final SubLObject pred = cb_adornments.$adorn_pred$.getDynamicValue(thread);
        final SubLObject mt = cb_adornments.$adorn_mt$.getDynamicValue(thread);
        final SubLObject type = cb_adornments.$adornment_type$.getDynamicValue(thread);
        if (cb_adornments.NIL != adorn_thingo_p(adornment, thingo, arg, pred)) {
            display_adornment(adornment, type, thingo, arg, pred, mt);
            return (SubLObject)cb_adornments.T;
        }
        return (SubLObject)cb_adornments.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 11634L)
    public static SubLObject handle_adornments(final SubLObject type, final SubLObject adornment_display, final SubLObject thingo, SubLObject arg, SubLObject pred, SubLObject mt) {
        if (arg == cb_adornments.UNPROVIDED) {
            arg = (SubLObject)cb_adornments.NIL;
        }
        if (pred == cb_adornments.UNPROVIDED) {
            pred = (SubLObject)cb_adornments.NIL;
        }
        if (mt == cb_adornments.UNPROVIDED) {
            mt = (SubLObject)cb_adornments.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject active_adornments = active_adornments(type);
        final SubLObject _prev_bind_0 = cb_adornments.$adornment_display$.currentBinding(thread);
        final SubLObject _prev_bind_2 = cb_adornments.$adorn_thingo$.currentBinding(thread);
        final SubLObject _prev_bind_3 = cb_adornments.$adorn_arg$.currentBinding(thread);
        final SubLObject _prev_bind_4 = cb_adornments.$adorn_pred$.currentBinding(thread);
        final SubLObject _prev_bind_5 = cb_adornments.$adorn_mt$.currentBinding(thread);
        final SubLObject _prev_bind_6 = cb_adornments.$adornment_type$.currentBinding(thread);
        try {
            cb_adornments.$adornment_display$.bind(adornment_display, thread);
            cb_adornments.$adorn_thingo$.bind(thingo, thread);
            cb_adornments.$adorn_arg$.bind(arg, thread);
            cb_adornments.$adorn_pred$.bind(pred, thread);
            cb_adornments.$adorn_mt$.bind(mt, thread);
            cb_adornments.$adornment_type$.bind(type, thread);
            Mapping.mapc((SubLObject)cb_adornments.$sym89$ACTIVATE_ADORNMENT, active_adornments, cb_adornments.EMPTY_SUBL_OBJECT_ARRAY);
        }
        finally {
            cb_adornments.$adornment_type$.rebind(_prev_bind_6, thread);
            cb_adornments.$adorn_mt$.rebind(_prev_bind_5, thread);
            cb_adornments.$adorn_pred$.rebind(_prev_bind_4, thread);
            cb_adornments.$adorn_arg$.rebind(_prev_bind_3, thread);
            cb_adornments.$adorn_thingo$.rebind(_prev_bind_2, thread);
            cb_adornments.$adornment_display$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_adornments.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 12080L)
    public static SubLObject handle_specific_adornment(final SubLObject type, final SubLObject name, final SubLObject adornment_display, final SubLObject thingo, SubLObject arg, SubLObject pred, SubLObject mt) {
        if (arg == cb_adornments.UNPROVIDED) {
            arg = (SubLObject)cb_adornments.NIL;
        }
        if (pred == cb_adornments.UNPROVIDED) {
            pred = (SubLObject)cb_adornments.NIL;
        }
        if (mt == cb_adornments.UNPROVIDED) {
            mt = (SubLObject)cb_adornments.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = cb_adornments.$adornment_display$.currentBinding(thread);
        final SubLObject _prev_bind_2 = cb_adornments.$adorn_thingo$.currentBinding(thread);
        final SubLObject _prev_bind_3 = cb_adornments.$adorn_arg$.currentBinding(thread);
        final SubLObject _prev_bind_4 = cb_adornments.$adorn_pred$.currentBinding(thread);
        final SubLObject _prev_bind_5 = cb_adornments.$adorn_mt$.currentBinding(thread);
        final SubLObject _prev_bind_6 = cb_adornments.$adornment_type$.currentBinding(thread);
        try {
            cb_adornments.$adornment_display$.bind(adornment_display, thread);
            cb_adornments.$adorn_thingo$.bind(thingo, thread);
            cb_adornments.$adorn_arg$.bind(arg, thread);
            cb_adornments.$adorn_pred$.bind(pred, thread);
            cb_adornments.$adorn_mt$.bind(mt, thread);
            cb_adornments.$adornment_type$.bind(type, thread);
            final SubLObject adornment = find_adornment(name);
            if (cb_adornments.NIL != active_adornment_struct_p(adornment, type)) {
                activate_adornment(adornment);
            }
        }
        finally {
            cb_adornments.$adornment_type$.rebind(_prev_bind_6, thread);
            cb_adornments.$adorn_mt$.rebind(_prev_bind_5, thread);
            cb_adornments.$adorn_pred$.rebind(_prev_bind_4, thread);
            cb_adornments.$adorn_arg$.rebind(_prev_bind_3, thread);
            cb_adornments.$adorn_thingo$.rebind(_prev_bind_2, thread);
            cb_adornments.$adornment_display$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_adornments.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 14279L)
    public static SubLObject cb_include_hierarchy_linkP(final SubLObject arg, final SubLObject predicate) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_adornments.NIL != subl_promotions.memberP(arg, (SubLObject)cb_adornments.$list104, (SubLObject)cb_adornments.UNPROVIDED, (SubLObject)cb_adornments.UNPROVIDED)) {
            SubLObject transitiveP = (SubLObject)cb_adornments.NIL;
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)cb_adornments.$sym105$RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind(cb_adornments.$const106$EverythingPSC, thread);
                transitiveP = kb_accessors.transitive_predicateP(predicate);
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
            return transitiveP;
        }
        return (SubLObject)cb_adornments.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 14655L)
    public static SubLObject hierarchy_link_effective_fn(final SubLObject index_hook, final SubLObject arg, final SubLObject pred) {
        return (SubLObject)SubLObjectFactory.makeBoolean(cb_adornments.NIL != forts.fort_p(index_hook) && cb_adornments.NIL != cb_include_hierarchy_linkP(arg, pred));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 15720L)
    public static SubLObject cb_show_alphabetic_searchP(final SubLObject fort) {
        return constant_handles.constant_p(fort);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 16583L)
    public static SubLObject literal_query_index_effective_fn(final SubLObject index_hook, final SubLObject arg, final SubLObject pred, SubLObject mt) {
        if (mt == cb_adornments.UNPROVIDED) {
            mt = (SubLObject)cb_adornments.NIL;
        }
        if (cb_adornments.NIL != forts.fort_p(index_hook)) {
            return cb_query.cb_include_literal_query_linkP(index_hook, arg, pred, (SubLObject)cb_adornments.$kw133$INDEX);
        }
        return (SubLObject)cb_adornments.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 17181L)
    public static SubLObject literal_query_normal_effective_fn(final SubLObject index_hook, final SubLObject arg, final SubLObject pred) {
        if (cb_adornments.NIL != forts.fort_p(index_hook)) {
            return cb_query.cb_include_literal_query_linkP(index_hook, arg, pred, (SubLObject)cb_adornments.$kw136$NORMAL);
        }
        return (SubLObject)cb_adornments.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 17358L)
    public static SubLObject literal_query_marker_else_green(final SubLObject type) {
        if (cb_adornments.NIL != type) {
            return type;
        }
        return (SubLObject)cb_adornments.$kw123$PLUS_GREEN;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 17473L)
    public static SubLObject literal_query_marker_else_yellow(final SubLObject type) {
        if (cb_adornments.NIL != type) {
            return type;
        }
        return (SubLObject)cb_adornments.$kw126$PLUS_YELLOW;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 17636L)
    public static SubLObject literal_query_marker_else_purple(final SubLObject type) {
        if (cb_adornments.NIL != type) {
            return type;
        }
        return (SubLObject)cb_adornments.$kw128$PLUS_PURPLE;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 18266L)
    public static SubLObject literal_query_index_display_effective_fn(final SubLObject index_hook, final SubLObject arg, final SubLObject pred) {
        if (cb_adornments.NIL != forts.fort_p(index_hook)) {
            return cb_query.cb_include_literal_query_linkP(index_hook, arg, pred, (SubLObject)cb_adornments.$kw139$INDEX_DISPLAY);
        }
        return (SubLObject)cb_adornments.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 18956L)
    public static SubLObject cb_get_asserted_argument(final SubLObject assertion) {
        if (cb_adornments.NIL != assertion) {
            return assertions_high.get_asserted_argument(assertion);
        }
        return (SubLObject)cb_adornments.$str142$_Asserted_Argument_;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 19232L)
    public static SubLObject convert_deduction_to_formula(final SubLObject deduction) {
        final SubLObject assertion = deductions_high.deduction_assertion(deduction);
        return uncanonicalizer.assertion_el_formula(assertion);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 19391L)
    public static SubLObject cb_assertion_deductions(final SubLObject assertion) {
        if (cb_adornments.NIL != assertion) {
            return Mapping.mapcar(Symbols.symbol_function((SubLObject)cb_adornments.$sym143$CONVERT_DEDUCTION_TO_FORMULA), assertions_high.assertion_deductions(assertion));
        }
        return (SubLObject)cb_adornments.$str144$_Assertion_Deductions_;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 20531L)
    public static SubLObject adornmentL(final SubLObject adornment1, final SubLObject adornment2) {
        final SubLObject pos1 = Sequences.position(adornment_name(adornment1), cb_adornments.$adornment_sorted_list$.getGlobalValue(), (SubLObject)cb_adornments.UNPROVIDED, (SubLObject)cb_adornments.UNPROVIDED, (SubLObject)cb_adornments.UNPROVIDED, (SubLObject)cb_adornments.UNPROVIDED);
        final SubLObject pos2 = Sequences.position(adornment_name(adornment2), cb_adornments.$adornment_sorted_list$.getGlobalValue(), (SubLObject)cb_adornments.UNPROVIDED, (SubLObject)cb_adornments.UNPROVIDED, (SubLObject)cb_adornments.UNPROVIDED, (SubLObject)cb_adornments.UNPROVIDED);
        if (cb_adornments.NIL == pos1 || cb_adornments.NIL == pos2) {
            return (SubLObject)cb_adornments.NIL;
        }
        return Numbers.numL(pos1, pos2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 20874L)
    public static SubLObject cb_view_adorn(SubLObject args) {
        if (args == cb_adornments.UNPROVIDED) {
            args = (SubLObject)cb_adornments.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = args;
        SubLObject index_spec = (SubLObject)cb_adornments.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_adornments.$list156);
        index_spec = current.first();
        current = current.rest();
        if (cb_adornments.NIL == current) {
            final SubLObject index_hook = cb_utilities.cb_guess_index(index_spec);
            if (cb_adornments.NIL == cb_utilities.cb_index_hook_p(index_hook)) {
                cb_utilities.cb_error((SubLObject)cb_adornments.$str157$_a_does_not_specify_an_index, index_hook, (SubLObject)cb_adornments.UNPROVIDED, (SubLObject)cb_adornments.UNPROVIDED, (SubLObject)cb_adornments.UNPROVIDED, (SubLObject)cb_adornments.UNPROVIDED);
                return (SubLObject)cb_adornments.NIL;
            }
            final SubLObject title_var = (SubLObject)cb_adornments.$str158$Adornments;
            final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
            try {
                html_macros.$html_id_space_id_generator$.bind((cb_adornments.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_adornments.UNPROVIDED, (SubLObject)cb_adornments.UNPROVIDED, (SubLObject)cb_adornments.UNPROVIDED), thread);
                html_utilities.html_markup((SubLObject)cb_adornments.$str159$__DOCTYPE_html_PUBLIC_____W3C__DT);
                if (cb_adornments.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                    html_utilities.html_source_readability_terpri((SubLObject)cb_adornments.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_adornments.$str160$_meta_http_equiv__X_UA_Compatible);
                }
                html_utilities.html_source_readability_terpri((SubLObject)cb_adornments.UNPROVIDED);
                final SubLObject _prev_bind_0_$2 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
                try {
                    cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_adornments.$kw161$UNINITIALIZED) ? ConsesLow.list(cb_adornments.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                    html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                    html_macros.html_head_content_type();
                    cb_parameters.cb_head_shortcut_icon();
                    html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                    cyc_file_dependencies.css((SubLObject)cb_adornments.$kw162$CB_CYC);
                    dhtml_macros.html_basic_cb_scripts();
                    if (cb_adornments.NIL != title_var) {
                        html_utilities.html_source_readability_terpri((SubLObject)cb_adornments.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                        html_utilities.html_princ(title_var);
                        html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                    }
                    html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_adornments.UNPROVIDED);
                    final SubLObject _prev_bind_0_$3 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                    try {
                        html_macros.$html_inside_bodyP$.bind((SubLObject)cb_adornments.T, thread);
                        html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                        if (cb_adornments.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                            html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_adornments.UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_adornments.UNPROVIDED);
                        }
                        html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_adornments.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_adornments.$str165$yui_skin_sam);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_adornments.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_adornments.UNPROVIDED);
                        final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_adornments.T, thread);
                            html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_adornments.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_adornments.$str166$reloadFrameButton);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_adornments.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_adornments.UNPROVIDED);
                            final SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_adornments.T, thread);
                                html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_adornments.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)cb_adornments.$str167$button);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_adornments.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_adornments.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)cb_adornments.$str168$reload);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_adornments.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_adornments.UNPROVIDED);
                                html_utilities.html_princ((SubLObject)cb_adornments.$str169$Refresh_Frames);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_adornments.UNPROVIDED);
                                if (cb_adornments.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                    html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                                }
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_adornments.UNPROVIDED);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$5, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                            if (cb_adornments.NIL != title_var) {
                                html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                html_utilities.html_markup((SubLObject)cb_adornments.TWO_INTEGER);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_adornments.UNPROVIDED);
                                html_utilities.html_princ(title_var);
                                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                html_utilities.html_markup((SubLObject)cb_adornments.TWO_INTEGER);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_adornments.UNPROVIDED);
                            }
                            final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_adornments.NIL);
                            html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_adornments.UNPROVIDED);
                            html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_adornments.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_adornments.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_adornments.$str170$post);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_adornments.UNPROVIDED);
                            if (cb_adornments.NIL != frame_name_var) {
                                html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_adornments.UNPROVIDED);
                                html_utilities.html_markup(frame_name_var);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_adornments.UNPROVIDED);
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_adornments.UNPROVIDED);
                            final SubLObject _prev_bind_0_$6 = html_macros.$html_safe_print$.currentBinding(thread);
                            final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_adornments.T, thread);
                                html_macros.$within_html_form$.bind((SubLObject)cb_adornments.T, thread);
                                html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                html_utilities.html_hidden_input((SubLObject)cb_adornments.$str171$cb_adornment_handler, (SubLObject)cb_adornments.T, (SubLObject)cb_adornments.UNPROVIDED);
                                cb_utilities.cb_help_preamble((SubLObject)cb_adornments.$kw154$CB_VIEW_ADORN, (SubLObject)cb_adornments.UNPROVIDED, (SubLObject)cb_adornments.UNPROVIDED);
                                html_utilities.html_newline((SubLObject)cb_adornments.TWO_INTEGER);
                                html_utilities.html_reset_input((SubLObject)cb_adornments.$str172$Current_Values);
                                html_utilities.html_indent((SubLObject)cb_adornments.UNPROVIDED);
                                html_utilities.html_submit_input((SubLObject)cb_adornments.$str173$Update_Adornment_Settings, (SubLObject)cb_adornments.UNPROVIDED, (SubLObject)cb_adornments.UNPROVIDED);
                                html_utilities.html_newline((SubLObject)cb_adornments.UNPROVIDED);
                                html_utilities.html_hr((SubLObject)cb_adornments.UNPROVIDED, (SubLObject)cb_adornments.UNPROVIDED);
                                html_utilities.html_newline((SubLObject)cb_adornments.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_utilities.html_princ((SubLObject)cb_adornments.$str174$Currently_Active_Adornments__);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                display_active_adornments((SubLObject)cb_adornments.UNPROVIDED);
                                html_utilities.html_newline((SubLObject)cb_adornments.TWO_INTEGER);
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_utilities.html_princ((SubLObject)cb_adornments.$str175$Adornment_Associations);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                html_utilities.html_newline((SubLObject)cb_adornments.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_adornments.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)cb_adornments.TWO_INTEGER);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_adornments.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_adornments.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)cb_adornments.ZERO_INTEGER);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_adornments.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_adornments.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)cb_adornments.ZERO_INTEGER);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_adornments.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_adornments.UNPROVIDED);
                                final SubLObject _prev_bind_0_$7 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_adornments.T, thread);
                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_adornments.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$8 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)cb_adornments.T, thread);
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_adornments.UNPROVIDED);
                                        final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind((SubLObject)cb_adornments.T, thread);
                                            html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                            html_utilities.html_simple_attribute(html_macros.$html_table_noflow$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_adornments.UNPROVIDED);
                                            html_utilities.html_markup((SubLObject)cb_adornments.ZERO_INTEGER);
                                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_adornments.UNPROVIDED);
                                            html_utilities.html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_adornments.UNPROVIDED);
                                            html_utilities.html_markup((SubLObject)cb_adornments.THREE_INTEGER);
                                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_adornments.UNPROVIDED);
                                            html_utilities.html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_adornments.UNPROVIDED);
                                            html_utilities.html_markup((SubLObject)cb_adornments.ZERO_INTEGER);
                                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_adornments.UNPROVIDED);
                                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_adornments.UNPROVIDED);
                                            final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind((SubLObject)cb_adornments.T, thread);
                                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_adornments.UNPROVIDED);
                                                final SubLObject _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind((SubLObject)cb_adornments.T, thread);
                                                    html_utilities.html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                                                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_adornments.UNPROVIDED);
                                                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_adornments.$kw176$MIDDLE));
                                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_adornments.UNPROVIDED);
                                                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_adornments.UNPROVIDED);
                                                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_adornments.$kw84$TOP));
                                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_adornments.UNPROVIDED);
                                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_adornments.UNPROVIDED);
                                                    final SubLObject _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind((SubLObject)cb_adornments.T, thread);
                                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                        html_utilities.html_princ((SubLObject)cb_adornments.$str177$Icon);
                                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                    }
                                                    finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$12, thread);
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                                                    html_utilities.html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                                                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_adornments.UNPROVIDED);
                                                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_adornments.$kw176$MIDDLE));
                                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_adornments.UNPROVIDED);
                                                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_adornments.UNPROVIDED);
                                                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_adornments.$kw84$TOP));
                                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_adornments.UNPROVIDED);
                                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_adornments.UNPROVIDED);
                                                    final SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind((SubLObject)cb_adornments.T, thread);
                                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                        html_utilities.html_princ((SubLObject)cb_adornments.$str178$Active_);
                                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                    }
                                                    finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$13, thread);
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                                                    html_utilities.html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                                                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_adornments.UNPROVIDED);
                                                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_adornments.$kw179$LEFT));
                                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_adornments.UNPROVIDED);
                                                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_adornments.UNPROVIDED);
                                                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_adornments.$kw84$TOP));
                                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_adornments.UNPROVIDED);
                                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_adornments.UNPROVIDED);
                                                    final SubLObject _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind((SubLObject)cb_adornments.T, thread);
                                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                        html_utilities.html_princ((SubLObject)cb_adornments.$str180$Name);
                                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                    }
                                                    finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$14, thread);
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                                                    html_utilities.html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                                                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_adornments.UNPROVIDED);
                                                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_adornments.$kw179$LEFT));
                                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_adornments.UNPROVIDED);
                                                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_adornments.UNPROVIDED);
                                                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_adornments.$kw84$TOP));
                                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_adornments.UNPROVIDED);
                                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_adornments.UNPROVIDED);
                                                    final SubLObject _prev_bind_0_$15 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind((SubLObject)cb_adornments.T, thread);
                                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                        html_utilities.html_princ((SubLObject)cb_adornments.$str181$Dynamic_);
                                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                    }
                                                    finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$15, thread);
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                                                    html_utilities.html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                                                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_adornments.UNPROVIDED);
                                                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_adornments.$kw179$LEFT));
                                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_adornments.UNPROVIDED);
                                                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_adornments.UNPROVIDED);
                                                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_adornments.$kw84$TOP));
                                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_adornments.UNPROVIDED);
                                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_adornments.UNPROVIDED);
                                                    final SubLObject _prev_bind_0_$16 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind((SubLObject)cb_adornments.T, thread);
                                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                        html_utilities.html_princ((SubLObject)cb_adornments.$str182$Has_Link_);
                                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                    }
                                                    finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$16, thread);
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                                                    html_utilities.html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                                                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_adornments.UNPROVIDED);
                                                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_adornments.$kw179$LEFT));
                                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_adornments.UNPROVIDED);
                                                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_adornments.UNPROVIDED);
                                                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_adornments.$kw84$TOP));
                                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_adornments.UNPROVIDED);
                                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_adornments.UNPROVIDED);
                                                    final SubLObject _prev_bind_0_$17 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind((SubLObject)cb_adornments.T, thread);
                                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                        html_utilities.html_princ((SubLObject)cb_adornments.$str183$Type);
                                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                    }
                                                    finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$17, thread);
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                                                    html_utilities.html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                                                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_adornments.UNPROVIDED);
                                                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_adornments.$kw179$LEFT));
                                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_adornments.UNPROVIDED);
                                                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_adornments.UNPROVIDED);
                                                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_adornments.$kw84$TOP));
                                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_adornments.UNPROVIDED);
                                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_adornments.UNPROVIDED);
                                                    final SubLObject _prev_bind_0_$18 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind((SubLObject)cb_adornments.T, thread);
                                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                        html_utilities.html_princ((SubLObject)cb_adornments.$str184$Tool);
                                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                    }
                                                    finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$18, thread);
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                                                    if (cb_adornments.NIL != cb_adornments.$debug_adornments_p$.getDynamicValue(thread)) {
                                                        html_utilities.html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                                                        html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_adornments.UNPROVIDED);
                                                        html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_adornments.$kw176$MIDDLE));
                                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_adornments.UNPROVIDED);
                                                        html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_adornments.UNPROVIDED);
                                                        html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_adornments.$kw84$TOP));
                                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_adornments.UNPROVIDED);
                                                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_adornments.UNPROVIDED);
                                                        final SubLObject _prev_bind_0_$19 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind((SubLObject)cb_adornments.T, thread);
                                                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                            html_utilities.html_princ((SubLObject)cb_adornments.$str185$effective_fn);
                                                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                        }
                                                        finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$19, thread);
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                                                    }
                                                }
                                                finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$11, thread);
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_utilities.html_source_readability_terpri((SubLObject)cb_adornments.UNPROVIDED);
                                                SubLObject bgcolor = (SubLObject)cb_adornments.NIL;
                                                SubLObject color_toggle = (SubLObject)cb_adornments.NIL;
                                                SubLObject list_var = (SubLObject)cb_adornments.NIL;
                                                SubLObject entry = (SubLObject)cb_adornments.NIL;
                                                SubLObject ignore_me = (SubLObject)cb_adornments.NIL;
                                                list_var = Sort.sort(conses_high.copy_list(cb_adornments.$cb_adornment_table$.getGlobalValue()), Symbols.symbol_function((SubLObject)cb_adornments.$sym186$ADORNMENT_), (SubLObject)cb_adornments.UNPROVIDED);
                                                entry = list_var.first();
                                                for (ignore_me = (SubLObject)cb_adornments.ZERO_INTEGER; cb_adornments.NIL != list_var; list_var = list_var.rest(), entry = list_var.first(), ignore_me = Numbers.add((SubLObject)cb_adornments.ONE_INTEGER, ignore_me)) {
                                                    if (cb_adornments.NIL != color_toggle) {
                                                        color_toggle = (SubLObject)cb_adornments.NIL;
                                                    }
                                                    else {
                                                        color_toggle = (SubLObject)cb_adornments.T;
                                                    }
                                                    bgcolor = (SubLObject)((cb_adornments.NIL != color_toggle) ? cb_adornments.$str187$_dddddd : cb_adornments.$str188$_cccccc);
                                                    final SubLObject name = Strings.string(adornment_name(entry));
                                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                    if (cb_adornments.NIL != bgcolor) {
                                                        html_utilities.html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_adornments.UNPROVIDED);
                                                        html_utilities.html_markup(bgcolor);
                                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_adornments.UNPROVIDED);
                                                    }
                                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_adornments.UNPROVIDED);
                                                    final SubLObject _prev_bind_0_$20 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind((SubLObject)cb_adornments.T, thread);
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        html_utilities.html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                                                        html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_adornments.UNPROVIDED);
                                                        html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_adornments.$kw176$MIDDLE));
                                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_adornments.UNPROVIDED);
                                                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_adornments.UNPROVIDED);
                                                        final SubLObject _prev_bind_0_$21 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind((SubLObject)cb_adornments.T, thread);
                                                            display_adornment(entry, (SubLObject)cb_adornments.UNPROVIDED, (SubLObject)cb_adornments.UNPROVIDED, (SubLObject)cb_adornments.UNPROVIDED, (SubLObject)cb_adornments.UNPROVIDED, (SubLObject)cb_adornments.UNPROVIDED);
                                                        }
                                                        finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$21, thread);
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        html_utilities.html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                                                        html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_adornments.UNPROVIDED);
                                                        html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_adornments.$kw176$MIDDLE));
                                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_adornments.UNPROVIDED);
                                                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_adornments.UNPROVIDED);
                                                        final SubLObject _prev_bind_0_$22 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind((SubLObject)cb_adornments.T, thread);
                                                            html_utilities.html_checkbox_input(Strings.string(name), Strings.string(name), adornment_active_p(entry), (SubLObject)cb_adornments.UNPROVIDED, (SubLObject)cb_adornments.UNPROVIDED, (SubLObject)cb_adornments.UNPROVIDED);
                                                        }
                                                        finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$22, thread);
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        html_utilities.html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                                                        html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_adornments.UNPROVIDED);
                                                        html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_adornments.$kw179$LEFT));
                                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_adornments.UNPROVIDED);
                                                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_adornments.UNPROVIDED);
                                                        final SubLObject _prev_bind_0_$23 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind((SubLObject)cb_adornments.T, thread);
                                                            html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                                            html_utilities.html_princ(Strings.string_downcase(name, (SubLObject)cb_adornments.UNPROVIDED, (SubLObject)cb_adornments.UNPROVIDED));
                                                            html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                                        }
                                                        finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$23, thread);
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        html_utilities.html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                                                        html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_adornments.UNPROVIDED);
                                                        html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_adornments.$kw179$LEFT));
                                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_adornments.UNPROVIDED);
                                                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_adornments.UNPROVIDED);
                                                        final SubLObject _prev_bind_0_$24 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind((SubLObject)cb_adornments.T, thread);
                                                            if (cb_adornments.NIL != adornment_dynamic_tagfn(entry)) {
                                                                html_utilities.html_checkbox_input(Sequences.cconcatenate(format_nil.format_nil_a_no_copy(name), (SubLObject)cb_adornments.$str189$_dynamic), Sequences.cconcatenate(format_nil.format_nil_a_no_copy(name), (SubLObject)cb_adornments.$str189$_dynamic), (SubLObject)SubLObjectFactory.makeBoolean(cb_adornments.NIL != adornment_image_alt(entry) && !adornment_image_alt(entry).isString()), (SubLObject)cb_adornments.UNPROVIDED, (SubLObject)cb_adornments.UNPROVIDED, (SubLObject)cb_adornments.UNPROVIDED);
                                                                html_utilities.html_indent((SubLObject)cb_adornments.UNPROVIDED);
                                                                if (cb_adornments.NIL != adornment_dynamic_comment(entry)) {
                                                                    html_utilities.html_princ(adornment_dynamic_comment(entry));
                                                                }
                                                                else {
                                                                    html_utilities.html_princ((SubLObject)cb_adornments.$str190$_);
                                                                }
                                                            }
                                                            else {
                                                                html_utilities.html_princ((SubLObject)cb_adornments.$str191$No);
                                                            }
                                                        }
                                                        finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$24, thread);
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        html_utilities.html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                                                        html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_adornments.UNPROVIDED);
                                                        html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_adornments.$kw179$LEFT));
                                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_adornments.UNPROVIDED);
                                                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_adornments.UNPROVIDED);
                                                        final SubLObject _prev_bind_0_$25 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind((SubLObject)cb_adornments.T, thread);
                                                            html_utilities.html_princ((SubLObject)((cb_adornments.NIL != adornment_handler(entry)) ? cb_adornments.$str192$Yes : cb_adornments.$str191$No));
                                                        }
                                                        finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$25, thread);
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        html_utilities.html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                                                        html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_adornments.UNPROVIDED);
                                                        html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_adornments.$kw179$LEFT));
                                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_adornments.UNPROVIDED);
                                                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_adornments.UNPROVIDED);
                                                        final SubLObject _prev_bind_0_$26 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind((SubLObject)cb_adornments.T, thread);
                                                            html_utilities.html_princ(Strings.string_downcase(Strings.string(adornment_type(entry)), (SubLObject)cb_adornments.UNPROVIDED, (SubLObject)cb_adornments.UNPROVIDED));
                                                        }
                                                        finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$26, thread);
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_adornments.UNPROVIDED);
                                                        html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_adornments.$kw179$LEFT));
                                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_adornments.UNPROVIDED);
                                                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_adornments.UNPROVIDED);
                                                        final SubLObject _prev_bind_0_$27 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind((SubLObject)cb_adornments.T, thread);
                                                            final SubLObject tool = adornment_tool(entry);
                                                            if (cb_adornments.NIL != tool && cb_adornments.NIL != cb_utilities.cb_link_method(tool)) {
                                                                cb_utilities.cb_link(tool, cb_utilities.cb_tool_abbreviation(tool), (SubLObject)cb_adornments.UNPROVIDED, (SubLObject)cb_adornments.UNPROVIDED, (SubLObject)cb_adornments.UNPROVIDED, (SubLObject)cb_adornments.UNPROVIDED);
                                                            }
                                                            else {
                                                                html_utilities.html_glyph((SubLObject)cb_adornments.$kw193$NBSP, (SubLObject)cb_adornments.UNPROVIDED);
                                                            }
                                                        }
                                                        finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$27, thread);
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        if (cb_adornments.NIL != cb_adornments.$debug_adornments_p$.getDynamicValue(thread)) {
                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                            html_utilities.html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                                                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_adornments.UNPROVIDED);
                                                            html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_adornments.$kw179$LEFT));
                                                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_adornments.UNPROVIDED);
                                                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_adornments.UNPROVIDED);
                                                            final SubLObject _prev_bind_0_$28 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind((SubLObject)cb_adornments.T, thread);
                                                                html_utilities.html_princ(Strings.string(adornment_effective_fn(entry)));
                                                            }
                                                            finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$28, thread);
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        }
                                                    }
                                                    finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$20, thread);
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                    html_utilities.html_source_readability_terpri((SubLObject)cb_adornments.UNPROVIDED);
                                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                    if (cb_adornments.NIL != bgcolor) {
                                                        html_utilities.html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_adornments.UNPROVIDED);
                                                        html_utilities.html_markup(bgcolor);
                                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_adornments.UNPROVIDED);
                                                    }
                                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_adornments.UNPROVIDED);
                                                    final SubLObject _prev_bind_0_$29 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind((SubLObject)cb_adornments.T, thread);
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_adornments.UNPROVIDED);
                                                        html_utilities.html_markup((SubLObject)cb_adornments.TWO_INTEGER);
                                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_adornments.UNPROVIDED);
                                                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_adornments.UNPROVIDED);
                                                        final SubLObject _prev_bind_0_$30 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind((SubLObject)cb_adornments.T, thread);
                                                            html_utilities.html_br();
                                                        }
                                                        finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$30, thread);
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_adornments.UNPROVIDED);
                                                        html_utilities.html_markup((SubLObject)cb_adornments.FIVE_INTEGER);
                                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_adornments.UNPROVIDED);
                                                        html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_adornments.UNPROVIDED);
                                                        html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_adornments.$kw179$LEFT));
                                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_adornments.UNPROVIDED);
                                                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_adornments.UNPROVIDED);
                                                        final SubLObject _prev_bind_0_$31 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind((SubLObject)cb_adornments.T, thread);
                                                            if (cb_adornments.NIL != adornment_comment(entry)) {
                                                                html_utilities.html_princ(adornment_comment(entry));
                                                            }
                                                            else {
                                                                html_utilities.html_princ((SubLObject)cb_adornments.$str190$_);
                                                            }
                                                        }
                                                        finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$31, thread);
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                        if (cb_adornments.NIL != bgcolor) {
                                                            html_utilities.html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                                                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_adornments.UNPROVIDED);
                                                            html_utilities.html_markup(bgcolor);
                                                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_adornments.UNPROVIDED);
                                                        }
                                                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_adornments.UNPROVIDED);
                                                        final SubLObject _prev_bind_0_$32 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind((SubLObject)cb_adornments.T, thread);
                                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                            html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_adornments.UNPROVIDED);
                                                            html_utilities.html_markup((SubLObject)cb_adornments.SEVEN_INTEGER);
                                                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_adornments.UNPROVIDED);
                                                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_adornments.UNPROVIDED);
                                                            final SubLObject _prev_bind_0_$33 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind((SubLObject)cb_adornments.T, thread);
                                                                html_utilities.html_br();
                                                            }
                                                            finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$33, thread);
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        }
                                                        finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$32, thread);
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                        html_utilities.html_source_readability_terpri((SubLObject)cb_adornments.UNPROVIDED);
                                                    }
                                                    finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$29, thread);
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                    html_utilities.html_source_readability_terpri((SubLObject)cb_adornments.UNPROVIDED);
                                                }
                                            }
                                            finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$10, thread);
                                            }
                                            html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                        }
                                        finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$9, thread);
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$8, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                    html_utilities.html_source_readability_terpri((SubLObject)cb_adornments.UNPROVIDED);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$7, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                html_utilities.html_newline((SubLObject)cb_adornments.UNPROVIDED);
                                html_utilities.html_reset_input((SubLObject)cb_adornments.$str172$Current_Values);
                                html_utilities.html_indent((SubLObject)cb_adornments.UNPROVIDED);
                                html_utilities.html_submit_input((SubLObject)cb_adornments.$str173$Update_Adornment_Settings, (SubLObject)cb_adornments.UNPROVIDED, (SubLObject)cb_adornments.UNPROVIDED);
                                html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                            }
                            finally {
                                html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                                html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$6, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri((SubLObject)cb_adornments.UNPROVIDED);
                            html_utilities.html_copyright_notice();
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$4, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_adornments.UNPROVIDED);
                    }
                    finally {
                        html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$3, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                }
                finally {
                    cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$2, thread);
                }
                html_utilities.html_source_readability_terpri((SubLObject)cb_adornments.UNPROVIDED);
            }
            finally {
                html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)cb_adornments.$list156);
        }
        return (SubLObject)cb_adornments.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 25680L)
    public static SubLObject cb_adornment_handler(final SubLObject args) {
        cb_adornments.$debug_adornments_p$.setDynamicValue((SubLObject)SubLObjectFactory.makeBoolean(cb_adornments.NIL != html_utilities.html_extract_input((SubLObject)cb_adornments.$str196$debug, args)));
        SubLObject cdolist_list_var = Mapping.mapcar(Symbols.symbol_function((SubLObject)cb_adornments.$sym12$ADORNMENT_NAME), cb_adornments.$cb_adornment_table$.getGlobalValue());
        SubLObject name = (SubLObject)cb_adornments.NIL;
        name = cdolist_list_var.first();
        while (cb_adornments.NIL != cdolist_list_var) {
            final SubLObject dynamic_tag = Sequences.cconcatenate(format_nil.format_nil_a_no_copy(name), (SubLObject)cb_adornments.$str189$_dynamic);
            final SubLObject adornment = find_adornment(name);
            if (cb_adornments.NIL != html_utilities.html_extract_input(Strings.string(name), args)) {
                enable_adornment(name, (SubLObject)cb_adornments.T);
            }
            else {
                enable_adornment(name, (SubLObject)cb_adornments.NIL);
            }
            if (cb_adornments.NIL != html_utilities.html_extract_input(dynamic_tag, args)) {
                _csetf_adornment_image_alt(adornment, adornment_dynamic_tagfn(adornment));
            }
            else {
                _csetf_adornment_image_alt(adornment, Sequences.cconcatenate((SubLObject)cb_adornments.$str197$_, new SubLObject[] { format_nil.format_nil_a_no_copy(adornment_name(adornment)), cb_adornments.$str198$_ }));
            }
            cdolist_list_var = cdolist_list_var.rest();
            name = cdolist_list_var.first();
        }
        cb_utilities.cb_message_page_with_history((SubLObject)cb_adornments.$str199$Active_adornments_have_been_chang, (SubLObject)cb_adornments.UNPROVIDED);
        return (SubLObject)cb_adornments.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 26519L)
    public static SubLObject cb_link_view_adorn(final SubLObject index_hook, SubLObject linktext) {
        if (linktext == cb_adornments.UNPROVIDED) {
            linktext = (SubLObject)cb_adornments.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_adornments.NIL == linktext) {
            linktext = (SubLObject)cb_adornments.$str201$_View_Adornments_;
        }
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_adornments.$kw0$MAIN);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_adornments.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_adornments.$str202$cb_view_adorn__A, cb_utilities.cb_index_identifier(index_hook));
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_adornments.UNPROVIDED);
        if (cb_adornments.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_adornments.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_adornments.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_adornments.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_adornments.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return index_hook;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 26788L)
    public static SubLObject cb_c_index_adornments(final SubLObject index_hook) {
        html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
        cb_utilities.cb_link((SubLObject)cb_adornments.$kw203$VIEW_ADORN, index_hook, (SubLObject)cb_adornments.$str158$Adornments, (SubLObject)cb_adornments.UNPROVIDED, (SubLObject)cb_adornments.UNPROVIDED, (SubLObject)cb_adornments.UNPROVIDED);
        html_utilities.html_princ((SubLObject)cb_adornments.$str205$___);
        html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
        display_active_adornments((SubLObject)cb_adornments.UNPROVIDED);
        html_utilities.html_newline((SubLObject)cb_adornments.TWO_INTEGER);
        return (SubLObject)cb_adornments.NIL;
    }
    
    public static SubLObject declare_cb_adornments_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_adornments", "bookkeeping_assertion_p", "BOOKKEEPING-ASSERTION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_adornments", "documentation_assertion_p", "DOCUMENTATION-ASSERTION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_adornments", "print_adornment", "PRINT-ADORNMENT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_adornments", "adornment_print_function_trampoline", "ADORNMENT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_adornments", "adornment_p", "ADORNMENT-P", 1, 0, false);
        new $adornment_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_adornments", "adornment_name", "ADORNMENT-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_adornments", "adornment_type", "ADORNMENT-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_adornments", "adornment_active_p", "ADORNMENT-ACTIVE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_adornments", "adornment_image", "ADORNMENT-IMAGE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_adornments", "adornment_image_disabled", "ADORNMENT-IMAGE-DISABLED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_adornments", "adornment_image_alt", "ADORNMENT-IMAGE-ALT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_adornments", "adornment_dynamic_tagfn", "ADORNMENT-DYNAMIC-TAGFN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_adornments", "adornment_color", "ADORNMENT-COLOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_adornments", "adornment_letter", "ADORNMENT-LETTER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_adornments", "adornment_effective_fn", "ADORNMENT-EFFECTIVE-FN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_adornments", "adornment_handler", "ADORNMENT-HANDLER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_adornments", "adornment_tool", "ADORNMENT-TOOL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_adornments", "adornment_comment", "ADORNMENT-COMMENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_adornments", "adornment_dynamic_comment", "ADORNMENT-DYNAMIC-COMMENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_adornments", "adornment_title", "ADORNMENT-TITLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_adornments", "_csetf_adornment_name", "_CSETF-ADORNMENT-NAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_adornments", "_csetf_adornment_type", "_CSETF-ADORNMENT-TYPE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_adornments", "_csetf_adornment_active_p", "_CSETF-ADORNMENT-ACTIVE-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_adornments", "_csetf_adornment_image", "_CSETF-ADORNMENT-IMAGE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_adornments", "_csetf_adornment_image_disabled", "_CSETF-ADORNMENT-IMAGE-DISABLED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_adornments", "_csetf_adornment_image_alt", "_CSETF-ADORNMENT-IMAGE-ALT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_adornments", "_csetf_adornment_dynamic_tagfn", "_CSETF-ADORNMENT-DYNAMIC-TAGFN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_adornments", "_csetf_adornment_color", "_CSETF-ADORNMENT-COLOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_adornments", "_csetf_adornment_letter", "_CSETF-ADORNMENT-LETTER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_adornments", "_csetf_adornment_effective_fn", "_CSETF-ADORNMENT-EFFECTIVE-FN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_adornments", "_csetf_adornment_handler", "_CSETF-ADORNMENT-HANDLER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_adornments", "_csetf_adornment_tool", "_CSETF-ADORNMENT-TOOL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_adornments", "_csetf_adornment_comment", "_CSETF-ADORNMENT-COMMENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_adornments", "_csetf_adornment_dynamic_comment", "_CSETF-ADORNMENT-DYNAMIC-COMMENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_adornments", "_csetf_adornment_title", "_CSETF-ADORNMENT-TITLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_adornments", "make_adornment", "MAKE-ADORNMENT", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_adornments", "visit_defstruct_adornment", "VISIT-DEFSTRUCT-ADORNMENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_adornments", "visit_defstruct_object_adornment_method", "VISIT-DEFSTRUCT-OBJECT-ADORNMENT-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_adornments", "active_adornment_struct_p", "ACTIVE-ADORNMENT-STRUCT-P", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_adornments", "active_adornment_p", "ACTIVE-ADORNMENT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_adornments", "enable_adornment", "ENABLE-ADORNMENT", 1, 1, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cb_adornments", "defadornment", "DEFADORNMENT");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_adornments", "find_adornment", "FIND-ADORNMENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_adornments", "active_adornments", "ACTIVE-ADORNMENTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_adornments", "id_for_type", "ID-FOR-TYPE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_adornments", "calc_adornment_image_alt", "CALC-ADORNMENT-IMAGE-ALT", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_adornments", "display_linked_adornment", "DISPLAY-LINKED-ADORNMENT", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_adornments", "display_adornment_disabled", "DISPLAY-ADORNMENT-DISABLED", 1, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_adornments", "display_adornment", "DISPLAY-ADORNMENT", 1, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_adornments", "display_active_adornments", "DISPLAY-ACTIVE-ADORNMENTS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_adornments", "resolved_adornment_image", "RESOLVED-ADORNMENT-IMAGE", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_adornments", "adorn_thingo_p", "ADORN-THINGO-P", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_adornments", "activate_adornment", "ACTIVATE-ADORNMENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_adornments", "handle_adornments", "HANDLE-ADORNMENTS", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_adornments", "handle_specific_adornment", "HANDLE-SPECIFIC-ADORNMENT", 4, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_adornments", "cb_include_hierarchy_linkP", "CB-INCLUDE-HIERARCHY-LINK?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_adornments", "hierarchy_link_effective_fn", "HIERARCHY-LINK-EFFECTIVE-FN", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_adornments", "cb_show_alphabetic_searchP", "CB-SHOW-ALPHABETIC-SEARCH?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_adornments", "literal_query_index_effective_fn", "LITERAL-QUERY-INDEX-EFFECTIVE-FN", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_adornments", "literal_query_normal_effective_fn", "LITERAL-QUERY-NORMAL-EFFECTIVE-FN", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_adornments", "literal_query_marker_else_green", "LITERAL-QUERY-MARKER-ELSE-GREEN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_adornments", "literal_query_marker_else_yellow", "LITERAL-QUERY-MARKER-ELSE-YELLOW", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_adornments", "literal_query_marker_else_purple", "LITERAL-QUERY-MARKER-ELSE-PURPLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_adornments", "literal_query_index_display_effective_fn", "LITERAL-QUERY-INDEX-DISPLAY-EFFECTIVE-FN", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_adornments", "cb_get_asserted_argument", "CB-GET-ASSERTED-ARGUMENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_adornments", "convert_deduction_to_formula", "CONVERT-DEDUCTION-TO-FORMULA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_adornments", "cb_assertion_deductions", "CB-ASSERTION-DEDUCTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_adornments", "adornmentL", "ADORNMENT<", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_adornments", "cb_view_adorn", "CB-VIEW-ADORN", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_adornments", "cb_adornment_handler", "CB-ADORNMENT-HANDLER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_adornments", "cb_link_view_adorn", "CB-LINK-VIEW-ADORN", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_adornments", "cb_c_index_adornments", "CB-C-INDEX-ADORNMENTS", 1, 0, false);
        return (SubLObject)cb_adornments.NIL;
    }
    
    public static SubLObject init_cb_adornments_file() {
        cb_adornments.$adornment_display$ = SubLFiles.defparameter("*ADORNMENT-DISPLAY*", (SubLObject)cb_adornments.$kw0$MAIN);
        cb_adornments.$adorn_thingo$ = SubLFiles.defparameter("*ADORN-THINGO*", (SubLObject)cb_adornments.NIL);
        cb_adornments.$adorn_arg$ = SubLFiles.defparameter("*ADORN-ARG*", (SubLObject)cb_adornments.NIL);
        cb_adornments.$adorn_pred$ = SubLFiles.defparameter("*ADORN-PRED*", (SubLObject)cb_adornments.NIL);
        cb_adornments.$adorn_mt$ = SubLFiles.defparameter("*ADORN-MT*", (SubLObject)cb_adornments.NIL);
        cb_adornments.$adornment_type$ = SubLFiles.defparameter("*ADORNMENT-TYPE*", (SubLObject)cb_adornments.NIL);
        cb_adornments.$adornment_sorted_list$ = SubLFiles.deflexical("*ADORNMENT-SORTED-LIST*", (SubLObject)cb_adornments.$list1);
        cb_adornments.$dtp_adornment$ = SubLFiles.defconstant("*DTP-ADORNMENT*", (SubLObject)cb_adornments.$sym3$ADORNMENT);
        cb_adornments.$cb_adornment_table$ = SubLFiles.deflexical("*CB-ADORNMENT-TABLE*", (SubLObject)((cb_adornments.NIL != Symbols.boundp((SubLObject)cb_adornments.$sym63$_CB_ADORNMENT_TABLE_)) ? cb_adornments.$cb_adornment_table$.getGlobalValue() : cb_adornments.NIL));
        cb_adornments.$debug_adornments_p$ = SubLFiles.defparameter("*DEBUG-ADORNMENTS-P*", (SubLObject)cb_adornments.NIL);
        return (SubLObject)cb_adornments.NIL;
    }
    
    public static SubLObject setup_cb_adornments_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), cb_adornments.$dtp_adornment$.getGlobalValue(), Symbols.symbol_function((SubLObject)cb_adornments.$sym10$ADORNMENT_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)cb_adornments.$list11);
        Structures.def_csetf((SubLObject)cb_adornments.$sym12$ADORNMENT_NAME, (SubLObject)cb_adornments.$sym13$_CSETF_ADORNMENT_NAME);
        Structures.def_csetf((SubLObject)cb_adornments.$sym14$ADORNMENT_TYPE, (SubLObject)cb_adornments.$sym15$_CSETF_ADORNMENT_TYPE);
        Structures.def_csetf((SubLObject)cb_adornments.$sym16$ADORNMENT_ACTIVE_P, (SubLObject)cb_adornments.$sym17$_CSETF_ADORNMENT_ACTIVE_P);
        Structures.def_csetf((SubLObject)cb_adornments.$sym18$ADORNMENT_IMAGE, (SubLObject)cb_adornments.$sym19$_CSETF_ADORNMENT_IMAGE);
        Structures.def_csetf((SubLObject)cb_adornments.$sym20$ADORNMENT_IMAGE_DISABLED, (SubLObject)cb_adornments.$sym21$_CSETF_ADORNMENT_IMAGE_DISABLED);
        Structures.def_csetf((SubLObject)cb_adornments.$sym22$ADORNMENT_IMAGE_ALT, (SubLObject)cb_adornments.$sym23$_CSETF_ADORNMENT_IMAGE_ALT);
        Structures.def_csetf((SubLObject)cb_adornments.$sym24$ADORNMENT_DYNAMIC_TAGFN, (SubLObject)cb_adornments.$sym25$_CSETF_ADORNMENT_DYNAMIC_TAGFN);
        Structures.def_csetf((SubLObject)cb_adornments.$sym26$ADORNMENT_COLOR, (SubLObject)cb_adornments.$sym27$_CSETF_ADORNMENT_COLOR);
        Structures.def_csetf((SubLObject)cb_adornments.$sym28$ADORNMENT_LETTER, (SubLObject)cb_adornments.$sym29$_CSETF_ADORNMENT_LETTER);
        Structures.def_csetf((SubLObject)cb_adornments.$sym30$ADORNMENT_EFFECTIVE_FN, (SubLObject)cb_adornments.$sym31$_CSETF_ADORNMENT_EFFECTIVE_FN);
        Structures.def_csetf((SubLObject)cb_adornments.$sym32$ADORNMENT_HANDLER, (SubLObject)cb_adornments.$sym33$_CSETF_ADORNMENT_HANDLER);
        Structures.def_csetf((SubLObject)cb_adornments.$sym34$ADORNMENT_TOOL, (SubLObject)cb_adornments.$sym35$_CSETF_ADORNMENT_TOOL);
        Structures.def_csetf((SubLObject)cb_adornments.$sym36$ADORNMENT_COMMENT, (SubLObject)cb_adornments.$sym37$_CSETF_ADORNMENT_COMMENT);
        Structures.def_csetf((SubLObject)cb_adornments.$sym38$ADORNMENT_DYNAMIC_COMMENT, (SubLObject)cb_adornments.$sym39$_CSETF_ADORNMENT_DYNAMIC_COMMENT);
        Structures.def_csetf((SubLObject)cb_adornments.$sym40$ADORNMENT_TITLE, (SubLObject)cb_adornments.$sym41$_CSETF_ADORNMENT_TITLE);
        Equality.identity((SubLObject)cb_adornments.$sym3$ADORNMENT);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), cb_adornments.$dtp_adornment$.getGlobalValue(), Symbols.symbol_function((SubLObject)cb_adornments.$sym62$VISIT_DEFSTRUCT_OBJECT_ADORNMENT_METHOD));
        subl_macro_promotions.declare_defglobal((SubLObject)cb_adornments.$sym63$_CB_ADORNMENT_TABLE_);
        Hashtables.sethash((SubLObject)cb_adornments.$kw90$INDEX_BROWSER, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_adornments.$str91$index_browser_gif, (SubLObject)cb_adornments.NIL));
        Hashtables.sethash((SubLObject)cb_adornments.$kw92$INDEX_BROWSER_DISABLED, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_adornments.$str93$index_browser_disabled_gif, (SubLObject)cb_adornments.NIL));
        SubLObject old = cb_adornments.$cb_adornment_table$.getGlobalValue();
        SubLObject v_new = make_adornment((SubLObject)cb_adornments.$list94);
        _csetf_adornment_name(v_new, (SubLObject)cb_adornments.$sym95$INDEX_BROWSER);
        cb_adornments.$cb_adornment_table$.setGlobalValue((SubLObject)ConsesLow.cons(v_new, Sequences.delete((SubLObject)cb_adornments.$sym95$INDEX_BROWSER, old, Symbols.symbol_function((SubLObject)cb_adornments.EQUAL), Symbols.symbol_function((SubLObject)cb_adornments.$sym12$ADORNMENT_NAME), (SubLObject)cb_adornments.UNPROVIDED, (SubLObject)cb_adornments.UNPROVIDED, (SubLObject)cb_adornments.UNPROVIDED)));
        old = cb_adornments.$cb_adornment_table$.getGlobalValue();
        v_new = make_adornment((SubLObject)cb_adornments.$list96);
        _csetf_adornment_name(v_new, (SubLObject)cb_adornments.$sym97$META_AXIOMS);
        cb_adornments.$cb_adornment_table$.setGlobalValue((SubLObject)ConsesLow.cons(v_new, Sequences.delete((SubLObject)cb_adornments.$sym97$META_AXIOMS, old, Symbols.symbol_function((SubLObject)cb_adornments.EQUAL), Symbols.symbol_function((SubLObject)cb_adornments.$sym12$ADORNMENT_NAME), (SubLObject)cb_adornments.UNPROVIDED, (SubLObject)cb_adornments.UNPROVIDED, (SubLObject)cb_adornments.UNPROVIDED)));
        Hashtables.sethash((SubLObject)cb_adornments.$kw98$CY_MENU, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_adornments.$str99$cy_menu_gif, (SubLObject)cb_adornments.NIL));
        old = cb_adornments.$cb_adornment_table$.getGlobalValue();
        v_new = make_adornment((SubLObject)cb_adornments.$list100);
        _csetf_adornment_name(v_new, (SubLObject)cb_adornments.$sym101$ASSERTION_REVIEW);
        cb_adornments.$cb_adornment_table$.setGlobalValue((SubLObject)ConsesLow.cons(v_new, Sequences.delete((SubLObject)cb_adornments.$sym101$ASSERTION_REVIEW, old, Symbols.symbol_function((SubLObject)cb_adornments.EQUAL), Symbols.symbol_function((SubLObject)cb_adornments.$sym12$ADORNMENT_NAME), (SubLObject)cb_adornments.UNPROVIDED, (SubLObject)cb_adornments.UNPROVIDED, (SubLObject)cb_adornments.UNPROVIDED)));
        Hashtables.sethash((SubLObject)cb_adornments.$kw102$BL_MENU, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_adornments.$str103$bl_menu_gif, (SubLObject)cb_adornments.NIL));
        Hashtables.sethash((SubLObject)cb_adornments.$kw107$RED_DIAMOND, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_adornments.$str108$red_diam_gif, (SubLObject)cb_adornments.NIL));
        old = cb_adornments.$cb_adornment_table$.getGlobalValue();
        v_new = make_adornment((SubLObject)cb_adornments.$list109);
        _csetf_adornment_name(v_new, (SubLObject)cb_adornments.$sym110$HIERARCHY_LINK);
        cb_adornments.$cb_adornment_table$.setGlobalValue((SubLObject)ConsesLow.cons(v_new, Sequences.delete((SubLObject)cb_adornments.$sym110$HIERARCHY_LINK, old, Symbols.symbol_function((SubLObject)cb_adornments.EQUAL), Symbols.symbol_function((SubLObject)cb_adornments.$sym12$ADORNMENT_NAME), (SubLObject)cb_adornments.UNPROVIDED, (SubLObject)cb_adornments.UNPROVIDED, (SubLObject)cb_adornments.UNPROVIDED)));
        Hashtables.sethash((SubLObject)cb_adornments.$kw111$HIERARCHY_BROWSER, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_adornments.$str112$hierarchy_browser_gif, (SubLObject)cb_adornments.NIL));
        Hashtables.sethash((SubLObject)cb_adornments.$kw113$HIERARCHY_BROWSER_DISABLED, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_adornments.$str114$hierarchy_browser_disabled_gif, (SubLObject)cb_adornments.NIL));
        old = cb_adornments.$cb_adornment_table$.getGlobalValue();
        v_new = make_adornment((SubLObject)cb_adornments.$list115);
        _csetf_adornment_name(v_new, (SubLObject)cb_adornments.$sym116$HIERARCHY_DEFAULT);
        cb_adornments.$cb_adornment_table$.setGlobalValue((SubLObject)ConsesLow.cons(v_new, Sequences.delete((SubLObject)cb_adornments.$sym116$HIERARCHY_DEFAULT, old, Symbols.symbol_function((SubLObject)cb_adornments.EQUAL), Symbols.symbol_function((SubLObject)cb_adornments.$sym12$ADORNMENT_NAME), (SubLObject)cb_adornments.UNPROVIDED, (SubLObject)cb_adornments.UNPROVIDED, (SubLObject)cb_adornments.UNPROVIDED)));
        Hashtables.sethash((SubLObject)cb_adornments.$kw117$ALPHA_BROWSER, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_adornments.$str118$alpha_browser_gif, (SubLObject)cb_adornments.NIL));
        Hashtables.sethash((SubLObject)cb_adornments.$kw119$ALPHA_BROWSER_DISABLED, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_adornments.$str120$alpha_browser_disabled_gif, (SubLObject)cb_adornments.NIL));
        old = cb_adornments.$cb_adornment_table$.getGlobalValue();
        v_new = make_adornment((SubLObject)cb_adornments.$list121);
        _csetf_adornment_name(v_new, (SubLObject)cb_adornments.$sym122$ALPHABETICAL_SEARCH);
        cb_adornments.$cb_adornment_table$.setGlobalValue((SubLObject)ConsesLow.cons(v_new, Sequences.delete((SubLObject)cb_adornments.$sym122$ALPHABETICAL_SEARCH, old, Symbols.symbol_function((SubLObject)cb_adornments.EQUAL), Symbols.symbol_function((SubLObject)cb_adornments.$sym12$ADORNMENT_NAME), (SubLObject)cb_adornments.UNPROVIDED, (SubLObject)cb_adornments.UNPROVIDED, (SubLObject)cb_adornments.UNPROVIDED)));
        Hashtables.sethash((SubLObject)cb_adornments.$kw123$PLUS_GREEN, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_adornments.$str124$plus_green_gif, (SubLObject)cb_adornments.$str125$_LitQ_));
        Hashtables.sethash((SubLObject)cb_adornments.$kw126$PLUS_YELLOW, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_adornments.$str127$plus_yellow_gif, (SubLObject)cb_adornments.$str125$_LitQ_));
        Hashtables.sethash((SubLObject)cb_adornments.$kw128$PLUS_PURPLE, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_adornments.$str129$plus_purple_gif, (SubLObject)cb_adornments.$str125$_LitQ_));
        Hashtables.sethash((SubLObject)cb_adornments.$kw130$LIKELY, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_adornments.$str124$plus_green_gif, (SubLObject)cb_adornments.$str125$_LitQ_));
        Hashtables.sethash((SubLObject)cb_adornments.$kw131$KNOWN, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_adornments.$str127$plus_yellow_gif, (SubLObject)cb_adornments.$str125$_LitQ_));
        Hashtables.sethash((SubLObject)cb_adornments.$kw132$POSSIBLE, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_adornments.$str129$plus_purple_gif, (SubLObject)cb_adornments.$str125$_LitQ_));
        old = cb_adornments.$cb_adornment_table$.getGlobalValue();
        v_new = make_adornment((SubLObject)cb_adornments.$list134);
        _csetf_adornment_name(v_new, (SubLObject)cb_adornments.$sym135$LITERAL_QUERY_INDEX);
        cb_adornments.$cb_adornment_table$.setGlobalValue((SubLObject)ConsesLow.cons(v_new, Sequences.delete((SubLObject)cb_adornments.$sym135$LITERAL_QUERY_INDEX, old, Symbols.symbol_function((SubLObject)cb_adornments.EQUAL), Symbols.symbol_function((SubLObject)cb_adornments.$sym12$ADORNMENT_NAME), (SubLObject)cb_adornments.UNPROVIDED, (SubLObject)cb_adornments.UNPROVIDED, (SubLObject)cb_adornments.UNPROVIDED)));
        old = cb_adornments.$cb_adornment_table$.getGlobalValue();
        v_new = make_adornment((SubLObject)cb_adornments.$list137);
        _csetf_adornment_name(v_new, (SubLObject)cb_adornments.$sym138$LITERAL_QUERY_NORMAL);
        cb_adornments.$cb_adornment_table$.setGlobalValue((SubLObject)ConsesLow.cons(v_new, Sequences.delete((SubLObject)cb_adornments.$sym138$LITERAL_QUERY_NORMAL, old, Symbols.symbol_function((SubLObject)cb_adornments.EQUAL), Symbols.symbol_function((SubLObject)cb_adornments.$sym12$ADORNMENT_NAME), (SubLObject)cb_adornments.UNPROVIDED, (SubLObject)cb_adornments.UNPROVIDED, (SubLObject)cb_adornments.UNPROVIDED)));
        old = cb_adornments.$cb_adornment_table$.getGlobalValue();
        v_new = make_adornment((SubLObject)cb_adornments.$list140);
        _csetf_adornment_name(v_new, (SubLObject)cb_adornments.$sym141$LITERAL_QUERY_INDEX_DISPLAY);
        cb_adornments.$cb_adornment_table$.setGlobalValue((SubLObject)ConsesLow.cons(v_new, Sequences.delete((SubLObject)cb_adornments.$sym141$LITERAL_QUERY_INDEX_DISPLAY, old, Symbols.symbol_function((SubLObject)cb_adornments.EQUAL), Symbols.symbol_function((SubLObject)cb_adornments.$sym12$ADORNMENT_NAME), (SubLObject)cb_adornments.UNPROVIDED, (SubLObject)cb_adornments.UNPROVIDED, (SubLObject)cb_adornments.UNPROVIDED)));
        Hashtables.sethash((SubLObject)cb_adornments.$kw145$BL_SDI, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_adornments.$str146$bl_sdi_gif, (SubLObject)cb_adornments.NIL));
        old = cb_adornments.$cb_adornment_table$.getGlobalValue();
        v_new = make_adornment((SubLObject)cb_adornments.$list147);
        _csetf_adornment_name(v_new, (SubLObject)cb_adornments.$sym148$ASSERTED_ASSERTION);
        cb_adornments.$cb_adornment_table$.setGlobalValue((SubLObject)ConsesLow.cons(v_new, Sequences.delete((SubLObject)cb_adornments.$sym148$ASSERTED_ASSERTION, old, Symbols.symbol_function((SubLObject)cb_adornments.EQUAL), Symbols.symbol_function((SubLObject)cb_adornments.$sym12$ADORNMENT_NAME), (SubLObject)cb_adornments.UNPROVIDED, (SubLObject)cb_adornments.UNPROVIDED, (SubLObject)cb_adornments.UNPROVIDED)));
        Hashtables.sethash((SubLObject)cb_adornments.$kw149$GR_SDI, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_adornments.$str150$gr_sdi_gif, (SubLObject)cb_adornments.NIL));
        old = cb_adornments.$cb_adornment_table$.getGlobalValue();
        v_new = make_adornment((SubLObject)cb_adornments.$list151);
        _csetf_adornment_name(v_new, (SubLObject)cb_adornments.$sym152$DEDUCED_ASSERTION);
        cb_adornments.$cb_adornment_table$.setGlobalValue((SubLObject)ConsesLow.cons(v_new, Sequences.delete((SubLObject)cb_adornments.$sym152$DEDUCED_ASSERTION, old, Symbols.symbol_function((SubLObject)cb_adornments.EQUAL), Symbols.symbol_function((SubLObject)cb_adornments.$sym12$ADORNMENT_NAME), (SubLObject)cb_adornments.UNPROVIDED, (SubLObject)cb_adornments.UNPROVIDED, (SubLObject)cb_adornments.UNPROVIDED)));
        utilities_macros.register_html_state_variable((SubLObject)cb_adornments.$sym153$_DEBUG_ADORNMENTS_P_);
        Hashtables.sethash((SubLObject)cb_adornments.$kw154$CB_VIEW_ADORN, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_adornments.$str155$cb_view_adorn_html, (SubLObject)cb_adornments.NIL));
        html_macros.note_cgi_handler_function((SubLObject)cb_adornments.$sym194$CB_VIEW_ADORN, (SubLObject)cb_adornments.$kw195$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cb_adornments.$sym200$CB_ADORNMENT_HANDLER, (SubLObject)cb_adornments.$kw195$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_adornments.$kw203$VIEW_ADORN, (SubLObject)cb_adornments.$sym204$CB_LINK_VIEW_ADORN, (SubLObject)cb_adornments.TWO_INTEGER);
        return (SubLObject)cb_adornments.NIL;
    }
    
    public void declareFunctions() {
        declare_cb_adornments_file();
    }
    
    public void initializeVariables() {
        init_cb_adornments_file();
    }
    
    public void runTopLevelForms() {
        setup_cb_adornments_file();
    }
    
    static {
        me = (SubLFile)new cb_adornments();
        cb_adornments.$adornment_display$ = null;
        cb_adornments.$adorn_thingo$ = null;
        cb_adornments.$adorn_arg$ = null;
        cb_adornments.$adorn_pred$ = null;
        cb_adornments.$adorn_mt$ = null;
        cb_adornments.$adornment_type$ = null;
        cb_adornments.$adornment_sorted_list$ = null;
        cb_adornments.$dtp_adornment$ = null;
        cb_adornments.$cb_adornment_table$ = null;
        cb_adornments.$debug_adornments_p$ = null;
        $kw0$MAIN = SubLObjectFactory.makeKeyword("MAIN");
        $list1 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("ALPHABETICAL-SEARCH"), SubLObjectFactory.makeSymbol("VFACETS"), SubLObjectFactory.makeSymbol("WORDNET-SYNSET"), SubLObjectFactory.makeSymbol("HIERARCHY-DEFAULT"), SubLObjectFactory.makeSymbol("HIERARCHY-LINK"), SubLObjectFactory.makeSymbol("LITERAL-QUERY-INDEX-DISPLAY"), SubLObjectFactory.makeSymbol("LITERAL-QUERY-NORMAL"), SubLObjectFactory.makeSymbol("LITERAL-QUERY-INDEX"), SubLObjectFactory.makeSymbol("CONSTANT-REVIEW"), SubLObjectFactory.makeSymbol("ASSERTION-REVIEW"), SubLObjectFactory.makeSymbol("META-AXIOMS"), SubLObjectFactory.makeSymbol("DEDUCED-ASSERTION"), SubLObjectFactory.makeSymbol("ASSERTED-ASSERTION") });
        $str2$_ = SubLObjectFactory.makeString("#");
        $sym3$ADORNMENT = SubLObjectFactory.makeSymbol("ADORNMENT");
        $sym4$ADORNMENT_P = SubLObjectFactory.makeSymbol("ADORNMENT-P");
        $list5 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("NAME"), SubLObjectFactory.makeSymbol("TYPE"), SubLObjectFactory.makeSymbol("ACTIVE-P"), SubLObjectFactory.makeSymbol("IMAGE"), SubLObjectFactory.makeSymbol("IMAGE-DISABLED"), SubLObjectFactory.makeSymbol("IMAGE-ALT"), SubLObjectFactory.makeSymbol("DYNAMIC-TAGFN"), SubLObjectFactory.makeSymbol("COLOR"), SubLObjectFactory.makeSymbol("LETTER"), SubLObjectFactory.makeSymbol("EFFECTIVE-FN"), SubLObjectFactory.makeSymbol("HANDLER"), SubLObjectFactory.makeSymbol("TOOL"), SubLObjectFactory.makeSymbol("COMMENT"), SubLObjectFactory.makeSymbol("DYNAMIC-COMMENT"), SubLObjectFactory.makeSymbol("TITLE") });
        $list6 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("NAME"), SubLObjectFactory.makeKeyword("TYPE"), SubLObjectFactory.makeKeyword("ACTIVE-P"), SubLObjectFactory.makeKeyword("IMAGE"), SubLObjectFactory.makeKeyword("IMAGE-DISABLED"), SubLObjectFactory.makeKeyword("IMAGE-ALT"), SubLObjectFactory.makeKeyword("DYNAMIC-TAGFN"), SubLObjectFactory.makeKeyword("COLOR"), SubLObjectFactory.makeKeyword("LETTER"), SubLObjectFactory.makeKeyword("EFFECTIVE-FN"), SubLObjectFactory.makeKeyword("HANDLER"), SubLObjectFactory.makeKeyword("TOOL"), SubLObjectFactory.makeKeyword("COMMENT"), SubLObjectFactory.makeKeyword("DYNAMIC-COMMENT"), SubLObjectFactory.makeKeyword("TITLE") });
        $list7 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("ADORNMENT-NAME"), SubLObjectFactory.makeSymbol("ADORNMENT-TYPE"), SubLObjectFactory.makeSymbol("ADORNMENT-ACTIVE-P"), SubLObjectFactory.makeSymbol("ADORNMENT-IMAGE"), SubLObjectFactory.makeSymbol("ADORNMENT-IMAGE-DISABLED"), SubLObjectFactory.makeSymbol("ADORNMENT-IMAGE-ALT"), SubLObjectFactory.makeSymbol("ADORNMENT-DYNAMIC-TAGFN"), SubLObjectFactory.makeSymbol("ADORNMENT-COLOR"), SubLObjectFactory.makeSymbol("ADORNMENT-LETTER"), SubLObjectFactory.makeSymbol("ADORNMENT-EFFECTIVE-FN"), SubLObjectFactory.makeSymbol("ADORNMENT-HANDLER"), SubLObjectFactory.makeSymbol("ADORNMENT-TOOL"), SubLObjectFactory.makeSymbol("ADORNMENT-COMMENT"), SubLObjectFactory.makeSymbol("ADORNMENT-DYNAMIC-COMMENT"), SubLObjectFactory.makeSymbol("ADORNMENT-TITLE") });
        $list8 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("_CSETF-ADORNMENT-NAME"), SubLObjectFactory.makeSymbol("_CSETF-ADORNMENT-TYPE"), SubLObjectFactory.makeSymbol("_CSETF-ADORNMENT-ACTIVE-P"), SubLObjectFactory.makeSymbol("_CSETF-ADORNMENT-IMAGE"), SubLObjectFactory.makeSymbol("_CSETF-ADORNMENT-IMAGE-DISABLED"), SubLObjectFactory.makeSymbol("_CSETF-ADORNMENT-IMAGE-ALT"), SubLObjectFactory.makeSymbol("_CSETF-ADORNMENT-DYNAMIC-TAGFN"), SubLObjectFactory.makeSymbol("_CSETF-ADORNMENT-COLOR"), SubLObjectFactory.makeSymbol("_CSETF-ADORNMENT-LETTER"), SubLObjectFactory.makeSymbol("_CSETF-ADORNMENT-EFFECTIVE-FN"), SubLObjectFactory.makeSymbol("_CSETF-ADORNMENT-HANDLER"), SubLObjectFactory.makeSymbol("_CSETF-ADORNMENT-TOOL"), SubLObjectFactory.makeSymbol("_CSETF-ADORNMENT-COMMENT"), SubLObjectFactory.makeSymbol("_CSETF-ADORNMENT-DYNAMIC-COMMENT"), SubLObjectFactory.makeSymbol("_CSETF-ADORNMENT-TITLE") });
        $sym9$PRINT_ADORNMENT = SubLObjectFactory.makeSymbol("PRINT-ADORNMENT");
        $sym10$ADORNMENT_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("ADORNMENT-PRINT-FUNCTION-TRAMPOLINE");
        $list11 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("ADORNMENT-P"));
        $sym12$ADORNMENT_NAME = SubLObjectFactory.makeSymbol("ADORNMENT-NAME");
        $sym13$_CSETF_ADORNMENT_NAME = SubLObjectFactory.makeSymbol("_CSETF-ADORNMENT-NAME");
        $sym14$ADORNMENT_TYPE = SubLObjectFactory.makeSymbol("ADORNMENT-TYPE");
        $sym15$_CSETF_ADORNMENT_TYPE = SubLObjectFactory.makeSymbol("_CSETF-ADORNMENT-TYPE");
        $sym16$ADORNMENT_ACTIVE_P = SubLObjectFactory.makeSymbol("ADORNMENT-ACTIVE-P");
        $sym17$_CSETF_ADORNMENT_ACTIVE_P = SubLObjectFactory.makeSymbol("_CSETF-ADORNMENT-ACTIVE-P");
        $sym18$ADORNMENT_IMAGE = SubLObjectFactory.makeSymbol("ADORNMENT-IMAGE");
        $sym19$_CSETF_ADORNMENT_IMAGE = SubLObjectFactory.makeSymbol("_CSETF-ADORNMENT-IMAGE");
        $sym20$ADORNMENT_IMAGE_DISABLED = SubLObjectFactory.makeSymbol("ADORNMENT-IMAGE-DISABLED");
        $sym21$_CSETF_ADORNMENT_IMAGE_DISABLED = SubLObjectFactory.makeSymbol("_CSETF-ADORNMENT-IMAGE-DISABLED");
        $sym22$ADORNMENT_IMAGE_ALT = SubLObjectFactory.makeSymbol("ADORNMENT-IMAGE-ALT");
        $sym23$_CSETF_ADORNMENT_IMAGE_ALT = SubLObjectFactory.makeSymbol("_CSETF-ADORNMENT-IMAGE-ALT");
        $sym24$ADORNMENT_DYNAMIC_TAGFN = SubLObjectFactory.makeSymbol("ADORNMENT-DYNAMIC-TAGFN");
        $sym25$_CSETF_ADORNMENT_DYNAMIC_TAGFN = SubLObjectFactory.makeSymbol("_CSETF-ADORNMENT-DYNAMIC-TAGFN");
        $sym26$ADORNMENT_COLOR = SubLObjectFactory.makeSymbol("ADORNMENT-COLOR");
        $sym27$_CSETF_ADORNMENT_COLOR = SubLObjectFactory.makeSymbol("_CSETF-ADORNMENT-COLOR");
        $sym28$ADORNMENT_LETTER = SubLObjectFactory.makeSymbol("ADORNMENT-LETTER");
        $sym29$_CSETF_ADORNMENT_LETTER = SubLObjectFactory.makeSymbol("_CSETF-ADORNMENT-LETTER");
        $sym30$ADORNMENT_EFFECTIVE_FN = SubLObjectFactory.makeSymbol("ADORNMENT-EFFECTIVE-FN");
        $sym31$_CSETF_ADORNMENT_EFFECTIVE_FN = SubLObjectFactory.makeSymbol("_CSETF-ADORNMENT-EFFECTIVE-FN");
        $sym32$ADORNMENT_HANDLER = SubLObjectFactory.makeSymbol("ADORNMENT-HANDLER");
        $sym33$_CSETF_ADORNMENT_HANDLER = SubLObjectFactory.makeSymbol("_CSETF-ADORNMENT-HANDLER");
        $sym34$ADORNMENT_TOOL = SubLObjectFactory.makeSymbol("ADORNMENT-TOOL");
        $sym35$_CSETF_ADORNMENT_TOOL = SubLObjectFactory.makeSymbol("_CSETF-ADORNMENT-TOOL");
        $sym36$ADORNMENT_COMMENT = SubLObjectFactory.makeSymbol("ADORNMENT-COMMENT");
        $sym37$_CSETF_ADORNMENT_COMMENT = SubLObjectFactory.makeSymbol("_CSETF-ADORNMENT-COMMENT");
        $sym38$ADORNMENT_DYNAMIC_COMMENT = SubLObjectFactory.makeSymbol("ADORNMENT-DYNAMIC-COMMENT");
        $sym39$_CSETF_ADORNMENT_DYNAMIC_COMMENT = SubLObjectFactory.makeSymbol("_CSETF-ADORNMENT-DYNAMIC-COMMENT");
        $sym40$ADORNMENT_TITLE = SubLObjectFactory.makeSymbol("ADORNMENT-TITLE");
        $sym41$_CSETF_ADORNMENT_TITLE = SubLObjectFactory.makeSymbol("_CSETF-ADORNMENT-TITLE");
        $kw42$NAME = SubLObjectFactory.makeKeyword("NAME");
        $kw43$TYPE = SubLObjectFactory.makeKeyword("TYPE");
        $kw44$ACTIVE_P = SubLObjectFactory.makeKeyword("ACTIVE-P");
        $kw45$IMAGE = SubLObjectFactory.makeKeyword("IMAGE");
        $kw46$IMAGE_DISABLED = SubLObjectFactory.makeKeyword("IMAGE-DISABLED");
        $kw47$IMAGE_ALT = SubLObjectFactory.makeKeyword("IMAGE-ALT");
        $kw48$DYNAMIC_TAGFN = SubLObjectFactory.makeKeyword("DYNAMIC-TAGFN");
        $kw49$COLOR = SubLObjectFactory.makeKeyword("COLOR");
        $kw50$LETTER = SubLObjectFactory.makeKeyword("LETTER");
        $kw51$EFFECTIVE_FN = SubLObjectFactory.makeKeyword("EFFECTIVE-FN");
        $kw52$HANDLER = SubLObjectFactory.makeKeyword("HANDLER");
        $kw53$TOOL = SubLObjectFactory.makeKeyword("TOOL");
        $kw54$COMMENT = SubLObjectFactory.makeKeyword("COMMENT");
        $kw55$DYNAMIC_COMMENT = SubLObjectFactory.makeKeyword("DYNAMIC-COMMENT");
        $kw56$TITLE = SubLObjectFactory.makeKeyword("TITLE");
        $str57$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw58$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym59$MAKE_ADORNMENT = SubLObjectFactory.makeSymbol("MAKE-ADORNMENT");
        $kw60$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw61$END = SubLObjectFactory.makeKeyword("END");
        $sym62$VISIT_DEFSTRUCT_OBJECT_ADORNMENT_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-ADORNMENT-METHOD");
        $sym63$_CB_ADORNMENT_TABLE_ = SubLObjectFactory.makeSymbol("*CB-ADORNMENT-TABLE*");
        $list64 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("ARGLIST"));
        $sym65$OLD = SubLObjectFactory.makeUninternedSymbol("OLD");
        $sym66$NEW = SubLObjectFactory.makeUninternedSymbol("NEW");
        $sym67$CLET = SubLObjectFactory.makeSymbol("CLET");
        $list68 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*CB-ADORNMENT-TABLE*"));
        $sym69$QUOTE = SubLObjectFactory.makeSymbol("QUOTE");
        $sym70$CSETF = SubLObjectFactory.makeSymbol("CSETF");
        $sym71$CSETQ = SubLObjectFactory.makeSymbol("CSETQ");
        $sym72$CONS = SubLObjectFactory.makeSymbol("CONS");
        $sym73$DELETE = SubLObjectFactory.makeSymbol("DELETE");
        $list74 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)cb_adornments.EQUAL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("ADORNMENT-NAME")));
        $sym75$ACTIVE_ADORNMENT_STRUCT_P = SubLObjectFactory.makeSymbol("ACTIVE-ADORNMENT-STRUCT-P");
        $kw76$ASSERTION = SubLObjectFactory.makeKeyword("ASSERTION");
        $kw77$DEDUCTION = SubLObjectFactory.makeKeyword("DEDUCTION");
        $kw78$INDEX_CONSTANT_NAME = SubLObjectFactory.makeKeyword("INDEX-CONSTANT-NAME");
        $kw79$INDEX_FORT = SubLObjectFactory.makeKeyword("INDEX-FORT");
        $kw80$INDEX_CONSTANT = SubLObjectFactory.makeKeyword("INDEX-CONSTANT");
        $kw81$CONSTANT = SubLObjectFactory.makeKeyword("CONSTANT");
        $kw82$GAF_ARG_PREDICATE = SubLObjectFactory.makeKeyword("GAF-ARG-PREDICATE");
        $kw83$INDEX_TERM = SubLObjectFactory.makeKeyword("INDEX-TERM");
        $kw84$TOP = SubLObjectFactory.makeKeyword("TOP");
        $str85$cb_start_ = SubLObjectFactory.makeString("cb-start|");
        $str86$_ = SubLObjectFactory.makeString("&");
        $kw87$CENTER = SubLObjectFactory.makeKeyword("CENTER");
        $sym88$DISPLAY_ADORNMENT = SubLObjectFactory.makeSymbol("DISPLAY-ADORNMENT");
        $sym89$ACTIVATE_ADORNMENT = SubLObjectFactory.makeSymbol("ACTIVATE-ADORNMENT");
        $kw90$INDEX_BROWSER = SubLObjectFactory.makeKeyword("INDEX-BROWSER");
        $str91$index_browser_gif = SubLObjectFactory.makeString("index-browser.gif");
        $kw92$INDEX_BROWSER_DISABLED = SubLObjectFactory.makeKeyword("INDEX-BROWSER-DISABLED");
        $str93$index_browser_disabled_gif = SubLObjectFactory.makeString("index-browser-disabled.gif");
        $list94 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("TYPE"), SubLObjectFactory.makeKeyword("INDEX-TERM"), SubLObjectFactory.makeKeyword("ACTIVE-P"), cb_adornments.T, SubLObjectFactory.makeKeyword("IMAGE"), SubLObjectFactory.makeKeyword("INDEX-BROWSER"), SubLObjectFactory.makeKeyword("IMAGE-DISABLED"), SubLObjectFactory.makeKeyword("INDEX-BROWSER-DISABLED"), SubLObjectFactory.makeKeyword("IMAGE-ALT"), SubLObjectFactory.makeString("[Indices]"), SubLObjectFactory.makeKeyword("EFFECTIVE-FN"), SubLObjectFactory.makeSymbol("CYC-TERM"), SubLObjectFactory.makeKeyword("HANDLER"), SubLObjectFactory.makeString("cb-cf"), SubLObjectFactory.makeKeyword("TITLE"), SubLObjectFactory.makeString("Index Browser"), SubLObjectFactory.makeKeyword("COMMENT"), SubLObjectFactory.makeString("Links you to the index view for a term.") });
        $sym95$INDEX_BROWSER = SubLObjectFactory.makeSymbol("INDEX-BROWSER");
        $list96 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("TYPE"), SubLObjectFactory.makeKeyword("ASSERTION"), SubLObjectFactory.makeKeyword("ACTIVE-P"), cb_adornments.T, SubLObjectFactory.makeKeyword("COLOR"), SubLObjectFactory.makeKeyword("YELLOW"), SubLObjectFactory.makeKeyword("LETTER"), SubLObjectFactory.makeString("M"), SubLObjectFactory.makeKeyword("EFFECTIVE-FN"), SubLObjectFactory.makeSymbol("ASSERTION-HAS-META-ASSERTIONS?"), SubLObjectFactory.makeKeyword("COMMENT"), SubLObjectFactory.makeString("Indicates that some meta-assertion has been made, that is, an assertion where one of the arguments is this assertion.") });
        $sym97$META_AXIOMS = SubLObjectFactory.makeSymbol("META-AXIOMS");
        $kw98$CY_MENU = SubLObjectFactory.makeKeyword("CY-MENU");
        $str99$cy_menu_gif = SubLObjectFactory.makeString("cy_menu.gif");
        $list100 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("TYPE"), SubLObjectFactory.makeKeyword("ASSERTION"), SubLObjectFactory.makeKeyword("ACTIVE-P"), cb_adornments.NIL, SubLObjectFactory.makeKeyword("IMAGE"), SubLObjectFactory.makeKeyword("CY-MENU"), SubLObjectFactory.makeKeyword("IMAGE-ALT"), SubLObjectFactory.makeString("[KE Assertion Review]"), SubLObjectFactory.makeKeyword("EFFECTIVE-FN"), SubLObjectFactory.makeSymbol("ASSERTION-NEEDS-REVIEW-P"), SubLObjectFactory.makeKeyword("HANDLER"), SubLObjectFactory.makeString("cb-taf"), SubLObjectFactory.makeKeyword("TOOL"), SubLObjectFactory.makeKeyword("KE-REVIEW"), SubLObjectFactory.makeKeyword("COMMENT"), SubLObjectFactory.makeString("Links to a special page for reviewing this assertion (support of #$MyReviewer).") });
        $sym101$ASSERTION_REVIEW = SubLObjectFactory.makeSymbol("ASSERTION-REVIEW");
        $kw102$BL_MENU = SubLObjectFactory.makeKeyword("BL-MENU");
        $str103$bl_menu_gif = SubLObjectFactory.makeString("bl_menu.gif");
        $list104 = ConsesLow.list((SubLObject)cb_adornments.ONE_INTEGER, (SubLObject)cb_adornments.TWO_INTEGER);
        $sym105$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const106$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $kw107$RED_DIAMOND = SubLObjectFactory.makeKeyword("RED-DIAMOND");
        $str108$red_diam_gif = SubLObjectFactory.makeString("red_diam.gif");
        $list109 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("TYPE"), SubLObjectFactory.makeKeyword("GAF-ARG-PREDICATE"), SubLObjectFactory.makeKeyword("ACTIVE-P"), cb_adornments.T, SubLObjectFactory.makeKeyword("IMAGE"), SubLObjectFactory.makeKeyword("RED-DIAMOND"), SubLObjectFactory.makeKeyword("IMAGE-ALT"), SubLObjectFactory.makeString("[Hier]"), SubLObjectFactory.makeKeyword("EFFECTIVE-FN"), SubLObjectFactory.makeSymbol("HIERARCHY-LINK-EFFECTIVE-FN"), SubLObjectFactory.makeKeyword("HANDLER"), SubLObjectFactory.makeString("cb-hier"), SubLObjectFactory.makeKeyword("TOOL"), SubLObjectFactory.makeKeyword("HIERARCHY-BROWSER"), SubLObjectFactory.makeKeyword("TITLE"), SubLObjectFactory.makeString("Hierarchy Browser"), SubLObjectFactory.makeKeyword("COMMENT"), SubLObjectFactory.makeString("Lets you browse the isa hierarchy.") });
        $sym110$HIERARCHY_LINK = SubLObjectFactory.makeSymbol("HIERARCHY-LINK");
        $kw111$HIERARCHY_BROWSER = SubLObjectFactory.makeKeyword("HIERARCHY-BROWSER");
        $str112$hierarchy_browser_gif = SubLObjectFactory.makeString("hierarchy-browser.gif");
        $kw113$HIERARCHY_BROWSER_DISABLED = SubLObjectFactory.makeKeyword("HIERARCHY-BROWSER-DISABLED");
        $str114$hierarchy_browser_disabled_gif = SubLObjectFactory.makeString("hierarchy-browser-disabled.gif");
        $list115 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("TYPE"), SubLObjectFactory.makeKeyword("INDEX-CONSTANT"), SubLObjectFactory.makeKeyword("ACTIVE-P"), cb_adornments.T, SubLObjectFactory.makeKeyword("IMAGE"), SubLObjectFactory.makeKeyword("HIERARCHY-BROWSER"), SubLObjectFactory.makeKeyword("IMAGE-DISABLED"), SubLObjectFactory.makeKeyword("HIERARCHY-BROWSER-DISABLED"), SubLObjectFactory.makeKeyword("IMAGE-ALT"), SubLObjectFactory.makeString("[Hier]"), SubLObjectFactory.makeKeyword("EFFECTIVE-FN"), SubLObjectFactory.makeSymbol("HB-DEFAULT-METHOD-AVAILABLE?"), SubLObjectFactory.makeKeyword("HANDLER"), SubLObjectFactory.makeString("cb-hier-default"), SubLObjectFactory.makeKeyword("TOOL"), SubLObjectFactory.makeKeyword("HIERARCHY-BROWSER"), SubLObjectFactory.makeKeyword("TITLE"), SubLObjectFactory.makeString("Hierarchy Browser"), SubLObjectFactory.makeKeyword("COMMENT"), SubLObjectFactory.makeString("Lets you browse the isa hierarchy.") });
        $sym116$HIERARCHY_DEFAULT = SubLObjectFactory.makeSymbol("HIERARCHY-DEFAULT");
        $kw117$ALPHA_BROWSER = SubLObjectFactory.makeKeyword("ALPHA-BROWSER");
        $str118$alpha_browser_gif = SubLObjectFactory.makeString("alpha-browser.gif");
        $kw119$ALPHA_BROWSER_DISABLED = SubLObjectFactory.makeKeyword("ALPHA-BROWSER-DISABLED");
        $str120$alpha_browser_disabled_gif = SubLObjectFactory.makeString("alpha-browser-disabled.gif");
        $list121 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("TYPE"), SubLObjectFactory.makeKeyword("INDEX-CONSTANT-NAME"), SubLObjectFactory.makeKeyword("ACTIVE-P"), cb_adornments.T, SubLObjectFactory.makeKeyword("IMAGE"), SubLObjectFactory.makeKeyword("ALPHA-BROWSER"), SubLObjectFactory.makeKeyword("IMAGE-DISABLED"), SubLObjectFactory.makeKeyword("ALPHA-BROWSER-DISABLED"), SubLObjectFactory.makeKeyword("IMAGE-ALT"), SubLObjectFactory.makeString("[Alpha]"), SubLObjectFactory.makeKeyword("EFFECTIVE-FN"), SubLObjectFactory.makeSymbol("CB-SHOW-ALPHABETIC-SEARCH?"), SubLObjectFactory.makeKeyword("HANDLER"), SubLObjectFactory.makeString("cb-ad"), SubLObjectFactory.makeKeyword("TOOL"), SubLObjectFactory.makeKeyword("ALPHA-TOP"), SubLObjectFactory.makeKeyword("TITLE"), SubLObjectFactory.makeString("Alphabetical Browser"), SubLObjectFactory.makeKeyword("COMMENT"), SubLObjectFactory.makeString("Links you to the alphabetical list of FORTs") });
        $sym122$ALPHABETICAL_SEARCH = SubLObjectFactory.makeSymbol("ALPHABETICAL-SEARCH");
        $kw123$PLUS_GREEN = SubLObjectFactory.makeKeyword("PLUS-GREEN");
        $str124$plus_green_gif = SubLObjectFactory.makeString("plus-green.gif");
        $str125$_LitQ_ = SubLObjectFactory.makeString("[LitQ]");
        $kw126$PLUS_YELLOW = SubLObjectFactory.makeKeyword("PLUS-YELLOW");
        $str127$plus_yellow_gif = SubLObjectFactory.makeString("plus-yellow.gif");
        $kw128$PLUS_PURPLE = SubLObjectFactory.makeKeyword("PLUS-PURPLE");
        $str129$plus_purple_gif = SubLObjectFactory.makeString("plus-purple.gif");
        $kw130$LIKELY = SubLObjectFactory.makeKeyword("LIKELY");
        $kw131$KNOWN = SubLObjectFactory.makeKeyword("KNOWN");
        $kw132$POSSIBLE = SubLObjectFactory.makeKeyword("POSSIBLE");
        $kw133$INDEX = SubLObjectFactory.makeKeyword("INDEX");
        $list134 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("TYPE"), SubLObjectFactory.makeKeyword("GAF-ARG-PREDICATE-CONTENT"), SubLObjectFactory.makeKeyword("ACTIVE-P"), cb_adornments.T, SubLObjectFactory.makeKeyword("IMAGE"), SubLObjectFactory.makeSymbol("LITERAL-QUERY-MARKER-ELSE-GREEN"), SubLObjectFactory.makeKeyword("IMAGE-ALT"), SubLObjectFactory.makeString("[LitQ]"), SubLObjectFactory.makeKeyword("EFFECTIVE-FN"), SubLObjectFactory.makeSymbol("LITERAL-QUERY-INDEX-EFFECTIVE-FN"), SubLObjectFactory.makeKeyword("HANDLER"), SubLObjectFactory.makeString("cb-lq"), SubLObjectFactory.makeKeyword("TOOL"), SubLObjectFactory.makeKeyword("ASK"), SubLObjectFactory.makeKeyword("COMMENT"), SubLObjectFactory.makeString("There are likely to be some additional derivable relations; this establishes them.") });
        $sym135$LITERAL_QUERY_INDEX = SubLObjectFactory.makeSymbol("LITERAL-QUERY-INDEX");
        $kw136$NORMAL = SubLObjectFactory.makeKeyword("NORMAL");
        $list137 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("TYPE"), SubLObjectFactory.makeKeyword("GAF-ARG-PREDICATEX"), SubLObjectFactory.makeKeyword("ACTIVE-P"), cb_adornments.T, SubLObjectFactory.makeKeyword("IMAGE"), SubLObjectFactory.makeSymbol("LITERAL-QUERY-MARKER-ELSE-YELLOW"), SubLObjectFactory.makeKeyword("IMAGE-ALT"), SubLObjectFactory.makeString("[LitQ]"), SubLObjectFactory.makeKeyword("EFFECTIVE-FN"), SubLObjectFactory.makeSymbol("LITERAL-QUERY-NORMAL-EFFECTIVE-FN"), SubLObjectFactory.makeKeyword("HANDLER"), SubLObjectFactory.makeString("cb-lq"), SubLObjectFactory.makeKeyword("TOOL"), SubLObjectFactory.makeKeyword("ASK"), SubLObjectFactory.makeKeyword("COMMENT"), SubLObjectFactory.makeString("If Green, there are likely to be some additional derivable relations; if yellow, it is possible there are additional relations. This establishes them.") });
        $sym138$LITERAL_QUERY_NORMAL = SubLObjectFactory.makeSymbol("LITERAL-QUERY-NORMAL");
        $kw139$INDEX_DISPLAY = SubLObjectFactory.makeKeyword("INDEX-DISPLAY");
        $list140 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("TYPE"), SubLObjectFactory.makeKeyword("GAF-ARG-PREDICATEX"), SubLObjectFactory.makeKeyword("ACTIVE-P"), cb_adornments.T, SubLObjectFactory.makeKeyword("IMAGE"), SubLObjectFactory.makeSymbol("LITERAL-QUERY-MARKER-ELSE-PURPLE"), SubLObjectFactory.makeKeyword("IMAGE-ALT"), SubLObjectFactory.makeString("[LitQ]"), SubLObjectFactory.makeKeyword("EFFECTIVE-FN"), SubLObjectFactory.makeSymbol("LITERAL-QUERY-INDEX-DISPLAY-EFFECTIVE-FN"), SubLObjectFactory.makeKeyword("HANDLER"), SubLObjectFactory.makeString("cb-lq"), SubLObjectFactory.makeKeyword("TOOL"), SubLObjectFactory.makeKeyword("ASK"), SubLObjectFactory.makeKeyword("COMMENT"), SubLObjectFactory.makeString("If Green, there are likely to be some additional derivable relations; if yellow, it is possible there are additional relations. If purple, additional relations are unlikely to be found (but you won't know until you try). This establishes them.") });
        $sym141$LITERAL_QUERY_INDEX_DISPLAY = SubLObjectFactory.makeSymbol("LITERAL-QUERY-INDEX-DISPLAY");
        $str142$_Asserted_Argument_ = SubLObjectFactory.makeString("[Asserted Argument]");
        $sym143$CONVERT_DEDUCTION_TO_FORMULA = SubLObjectFactory.makeSymbol("CONVERT-DEDUCTION-TO-FORMULA");
        $str144$_Assertion_Deductions_ = SubLObjectFactory.makeString("[Assertion Deductions]");
        $kw145$BL_SDI = SubLObjectFactory.makeKeyword("BL-SDI");
        $str146$bl_sdi_gif = SubLObjectFactory.makeString("bl_sdi.gif");
        $list147 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("TYPE"), SubLObjectFactory.makeKeyword("ASSERTION"), SubLObjectFactory.makeKeyword("ACTIVE-P"), cb_adornments.NIL, SubLObjectFactory.makeKeyword("IMAGE"), SubLObjectFactory.makeKeyword("BL-SDI"), SubLObjectFactory.makeKeyword("DYNAMIC-TAGFN"), SubLObjectFactory.makeSymbol("CB-GET-ASSERTED-ARGUMENT"), SubLObjectFactory.makeKeyword("IMAGE-ALT"), SubLObjectFactory.makeSymbol("CB-GET-ASSERTED-ARGUMENT"), SubLObjectFactory.makeKeyword("EFFECTIVE-FN"), SubLObjectFactory.makeSymbol("ASSERTED-ASSERTION?"), SubLObjectFactory.makeKeyword("COMMENT"), SubLObjectFactory.makeString("effective when the assertion has some asserted argument."), SubLObjectFactory.makeKeyword("DYNAMIC-COMMENT"), SubLObjectFactory.makeString("The asserted argument") });
        $sym148$ASSERTED_ASSERTION = SubLObjectFactory.makeSymbol("ASSERTED-ASSERTION");
        $kw149$GR_SDI = SubLObjectFactory.makeKeyword("GR-SDI");
        $str150$gr_sdi_gif = SubLObjectFactory.makeString("gr_sdi.gif");
        $list151 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("TYPE"), SubLObjectFactory.makeKeyword("ASSERTION"), SubLObjectFactory.makeKeyword("ACTIVE-P"), cb_adornments.NIL, SubLObjectFactory.makeKeyword("IMAGE"), SubLObjectFactory.makeKeyword("GR-SDI"), SubLObjectFactory.makeKeyword("DYNAMIC-TAGFN"), SubLObjectFactory.makeSymbol("CB-ASSERTION-DEDUCTIONS"), SubLObjectFactory.makeKeyword("IMAGE-ALT"), SubLObjectFactory.makeSymbol("CB-ASSERTION-DEDUCTIONS"), SubLObjectFactory.makeKeyword("EFFECTIVE-FN"), SubLObjectFactory.makeSymbol("DEDUCED-ASSERTION?"), SubLObjectFactory.makeKeyword("COMMENT"), SubLObjectFactory.makeString("effective when the assertion has some deduced argument."), SubLObjectFactory.makeKeyword("DYNAMIC-COMMENT"), SubLObjectFactory.makeString("List of deduced formulas") });
        $sym152$DEDUCED_ASSERTION = SubLObjectFactory.makeSymbol("DEDUCED-ASSERTION");
        $sym153$_DEBUG_ADORNMENTS_P_ = SubLObjectFactory.makeSymbol("*DEBUG-ADORNMENTS-P*");
        $kw154$CB_VIEW_ADORN = SubLObjectFactory.makeKeyword("CB-VIEW-ADORN");
        $str155$cb_view_adorn_html = SubLObjectFactory.makeString("cb-view-adorn.html");
        $list156 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDEX-SPEC"));
        $str157$_a_does_not_specify_an_index = SubLObjectFactory.makeString("~a does not specify an index");
        $str158$Adornments = SubLObjectFactory.makeString("Adornments");
        $str159$__DOCTYPE_html_PUBLIC_____W3C__DT = SubLObjectFactory.makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $str160$_meta_http_equiv__X_UA_Compatible = SubLObjectFactory.makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");
        $kw161$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $kw162$CB_CYC = SubLObjectFactory.makeKeyword("CB-CYC");
        $kw163$SAM_AUTOCOMPLETE_CSS = SubLObjectFactory.makeKeyword("SAM-AUTOCOMPLETE-CSS");
        $kw164$SHA1 = SubLObjectFactory.makeKeyword("SHA1");
        $str165$yui_skin_sam = SubLObjectFactory.makeString("yui-skin-sam");
        $str166$reloadFrameButton = SubLObjectFactory.makeString("reloadFrameButton");
        $str167$button = SubLObjectFactory.makeString("button");
        $str168$reload = SubLObjectFactory.makeString("reload");
        $str169$Refresh_Frames = SubLObjectFactory.makeString("Refresh Frames");
        $str170$post = SubLObjectFactory.makeString("post");
        $str171$cb_adornment_handler = SubLObjectFactory.makeString("cb-adornment-handler");
        $str172$Current_Values = SubLObjectFactory.makeString("Current Values");
        $str173$Update_Adornment_Settings = SubLObjectFactory.makeString("Update Adornment Settings");
        $str174$Currently_Active_Adornments__ = SubLObjectFactory.makeString("Currently Active Adornments: ");
        $str175$Adornment_Associations = SubLObjectFactory.makeString("Adornment Associations");
        $kw176$MIDDLE = SubLObjectFactory.makeKeyword("MIDDLE");
        $str177$Icon = SubLObjectFactory.makeString("Icon");
        $str178$Active_ = SubLObjectFactory.makeString("Active?");
        $kw179$LEFT = SubLObjectFactory.makeKeyword("LEFT");
        $str180$Name = SubLObjectFactory.makeString("Name");
        $str181$Dynamic_ = SubLObjectFactory.makeString("Dynamic?");
        $str182$Has_Link_ = SubLObjectFactory.makeString("Has Link?");
        $str183$Type = SubLObjectFactory.makeString("Type");
        $str184$Tool = SubLObjectFactory.makeString("Tool");
        $str185$effective_fn = SubLObjectFactory.makeString("effective-fn");
        $sym186$ADORNMENT_ = SubLObjectFactory.makeSymbol("ADORNMENT<");
        $str187$_dddddd = SubLObjectFactory.makeString("#dddddd");
        $str188$_cccccc = SubLObjectFactory.makeString("#cccccc");
        $str189$_dynamic = SubLObjectFactory.makeString("-dynamic");
        $str190$_ = SubLObjectFactory.makeString("?");
        $str191$No = SubLObjectFactory.makeString("No");
        $str192$Yes = SubLObjectFactory.makeString("Yes");
        $kw193$NBSP = SubLObjectFactory.makeKeyword("NBSP");
        $sym194$CB_VIEW_ADORN = SubLObjectFactory.makeSymbol("CB-VIEW-ADORN");
        $kw195$HTML_HANDLER = SubLObjectFactory.makeKeyword("HTML-HANDLER");
        $str196$debug = SubLObjectFactory.makeString("debug");
        $str197$_ = SubLObjectFactory.makeString("[");
        $str198$_ = SubLObjectFactory.makeString("]");
        $str199$Active_adornments_have_been_chang = SubLObjectFactory.makeString("Active adornments have been changed");
        $sym200$CB_ADORNMENT_HANDLER = SubLObjectFactory.makeSymbol("CB-ADORNMENT-HANDLER");
        $str201$_View_Adornments_ = SubLObjectFactory.makeString("[View Adornments]");
        $str202$cb_view_adorn__A = SubLObjectFactory.makeString("cb-view-adorn&~A");
        $kw203$VIEW_ADORN = SubLObjectFactory.makeKeyword("VIEW-ADORN");
        $sym204$CB_LINK_VIEW_ADORN = SubLObjectFactory.makeSymbol("CB-LINK-VIEW-ADORN");
        $str205$___ = SubLObjectFactory.makeString(" : ");
    }
    
    public static final class $adornment_native extends SubLStructNative
    {
        public SubLObject $name;
        public SubLObject $type;
        public SubLObject $active_p;
        public SubLObject $image;
        public SubLObject $image_disabled;
        public SubLObject $image_alt;
        public SubLObject $dynamic_tagfn;
        public SubLObject $color;
        public SubLObject $letter;
        public SubLObject $effective_fn;
        public SubLObject $handler;
        public SubLObject $tool;
        public SubLObject $comment;
        public SubLObject $dynamic_comment;
        public SubLObject $title;
        private static final SubLStructDeclNative structDecl;
        
        public $adornment_native() {
            this.$name = (SubLObject)CommonSymbols.NIL;
            this.$type = (SubLObject)CommonSymbols.NIL;
            this.$active_p = (SubLObject)CommonSymbols.NIL;
            this.$image = (SubLObject)CommonSymbols.NIL;
            this.$image_disabled = (SubLObject)CommonSymbols.NIL;
            this.$image_alt = (SubLObject)CommonSymbols.NIL;
            this.$dynamic_tagfn = (SubLObject)CommonSymbols.NIL;
            this.$color = (SubLObject)CommonSymbols.NIL;
            this.$letter = (SubLObject)CommonSymbols.NIL;
            this.$effective_fn = (SubLObject)CommonSymbols.NIL;
            this.$handler = (SubLObject)CommonSymbols.NIL;
            this.$tool = (SubLObject)CommonSymbols.NIL;
            this.$comment = (SubLObject)CommonSymbols.NIL;
            this.$dynamic_comment = (SubLObject)CommonSymbols.NIL;
            this.$title = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$adornment_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$name;
        }
        
        public SubLObject getField3() {
            return this.$type;
        }
        
        public SubLObject getField4() {
            return this.$active_p;
        }
        
        public SubLObject getField5() {
            return this.$image;
        }
        
        public SubLObject getField6() {
            return this.$image_disabled;
        }
        
        public SubLObject getField7() {
            return this.$image_alt;
        }
        
        public SubLObject getField8() {
            return this.$dynamic_tagfn;
        }
        
        public SubLObject getField9() {
            return this.$color;
        }
        
        public SubLObject getField10() {
            return this.$letter;
        }
        
        public SubLObject getField11() {
            return this.$effective_fn;
        }
        
        public SubLObject getField12() {
            return this.$handler;
        }
        
        public SubLObject getField13() {
            return this.$tool;
        }
        
        public SubLObject getField14() {
            return this.$comment;
        }
        
        public SubLObject getField15() {
            return this.$dynamic_comment;
        }
        
        public SubLObject getField16() {
            return this.$title;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$name = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$type = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$active_p = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$image = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$image_disabled = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$image_alt = value;
        }
        
        public SubLObject setField8(final SubLObject value) {
            return this.$dynamic_tagfn = value;
        }
        
        public SubLObject setField9(final SubLObject value) {
            return this.$color = value;
        }
        
        public SubLObject setField10(final SubLObject value) {
            return this.$letter = value;
        }
        
        public SubLObject setField11(final SubLObject value) {
            return this.$effective_fn = value;
        }
        
        public SubLObject setField12(final SubLObject value) {
            return this.$handler = value;
        }
        
        public SubLObject setField13(final SubLObject value) {
            return this.$tool = value;
        }
        
        public SubLObject setField14(final SubLObject value) {
            return this.$comment = value;
        }
        
        public SubLObject setField15(final SubLObject value) {
            return this.$dynamic_comment = value;
        }
        
        public SubLObject setField16(final SubLObject value) {
            return this.$title = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$adornment_native.class, cb_adornments.$sym3$ADORNMENT, cb_adornments.$sym4$ADORNMENT_P, cb_adornments.$list5, cb_adornments.$list6, new String[] { "$name", "$type", "$active_p", "$image", "$image_disabled", "$image_alt", "$dynamic_tagfn", "$color", "$letter", "$effective_fn", "$handler", "$tool", "$comment", "$dynamic_comment", "$title" }, cb_adornments.$list7, cb_adornments.$list8, cb_adornments.$sym9$PRINT_ADORNMENT);
        }
    }
    
    public static final class $adornment_p$UnaryFunction extends UnaryFunction
    {
        public $adornment_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("ADORNMENT-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return cb_adornments.adornment_p(arg1);
        }
    }
}

/*

	Total time: 1444 ms
	 synthetic 
*/