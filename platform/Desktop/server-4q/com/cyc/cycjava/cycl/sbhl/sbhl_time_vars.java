package com.cyc.cycjava.cycl.sbhl;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.kb_control_vars;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class sbhl_time_vars extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.sbhl.sbhl_time_vars";
    public static final String myFingerPrint = "f5f18d0472059a35b4c8a133e1b4b25aeb8094293b1ac5c68a1daa7936e1595d";
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-vars.lisp", position = 658L)
    public static SubLSymbol $sbhl_temporality_activeP$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-vars.lisp", position = 1179L)
    public static SubLSymbol $sbhl_temporality_consider_link_disjunctionsP$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-vars.lisp", position = 2670L)
    public static SubLSymbol $sbhl_temporality_verbose_justsP$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-vars.lisp", position = 2872L)
    public static SubLSymbol $sbhl_temporality_include_only_links_in_verbose_justsP$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-vars.lisp", position = 3167L)
    public static SubLSymbol $sbhl_temporal_link_support_table$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-vars.lisp", position = 3371L)
    public static SubLSymbol $sbhl_temporal_link_disjunction_support_table$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-vars.lisp", position = 3543L)
    public static SubLSymbol $sbhl_temporal_link_disjunction_term_table$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-vars.lisp", position = 3717L)
    public static SubLSymbol $sbhl_extended_universal_date_list$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-vars.lisp", position = 4060L)
    public static SubLSymbol $sbhl_time_predicates$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-vars.lisp", position = 4164L)
    public static SubLSymbol $sbhl_time_modules$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-vars.lisp", position = 4362L)
    public static SubLSymbol $sbhl_temporal_points_being_removed$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-vars.lisp", position = 4463L)
    public static SubLSymbol $sbhl_temporal_link_disjunction_consequent_table$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-vars.lisp", position = 4668L)
    public static SubLSymbol $sbhl_temporality_dont_collect_dates_when_all_accessingP$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-vars.lisp", position = 4921L)
    public static SubLSymbol $sbhl_temporality_all_accesses_polarity_filter$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-vars.lisp", position = 5357L)
    public static SubLSymbol $sbhl_temporality_consequent_links_search_passed_through$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-vars.lisp", position = 5606L)
    public static SubLSymbol $sbhl_temporality_succession_depth$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-vars.lisp", position = 5693L)
    public static SubLSymbol $sbhl_temporality_succession_depth_threshold$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-vars.lisp", position = 6137L)
    private static SubLSymbol $sbhl_temporality_date_succession$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-vars.lisp", position = 6377L)
    public static SubLSymbol $sbhl_temporality_search_passed_through_dateP$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-vars.lisp", position = 6599L)
    public static SubLSymbol $sbhl_temporality_justification_gathering_passed_through_dateP$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-vars.lisp", position = 7174L)
    private static SubLSymbol $sbhl_hl_time_predicates$;
    private static final SubLSymbol $sym0$_SBHL_TEMPORALITY_CONSIDER_LINK_DISJUNCTIONS__;
    private static final SubLString $str1$Consider_disjunctive_temporal_rel;
    private static final SubLString $str2$This_controls_whether_the_HL_modu;
    private static final SubLList $list3;
    private static final SubLList $list4;
    private static final SubLSymbol $sym5$CLET;
    private static final SubLList $list6;
    private static final SubLSymbol $sym7$PWHEN;
    private static final SubLSymbol $sym8$CAND;
    private static final SubLSymbol $sym9$NULL;
    private static final SubLList $list10;
    private static final SubLSymbol $sym11$CSETQ;
    private static final SubLList $list12;
    private static final SubLSymbol $sym13$ADD_TEMPORAL_LINK_DISJUNCTION_CONSEQUENTS;
    private static final SubLSymbol $sym14$REMOVE_TEMPORAL_LINK_DISJUNCTION_CONSEQUENTS;
    private static final SubLSymbol $sym15$_SBHL_TEMPORAL_LINK_SUPPORT_TABLE_;
    private static final SubLInteger $int16$40000;
    private static final SubLSymbol $sym17$_SBHL_TEMPORAL_LINK_DISJUNCTION_SUPPORT_TABLE_;
    private static final SubLInteger $int18$4000;
    private static final SubLSymbol $sym19$_SBHL_TEMPORAL_LINK_DISJUNCTION_TERM_TABLE_;
    private static final SubLSymbol $sym20$_SBHL_EXTENDED_UNIVERSAL_DATE_LIST_;
    private static final SubLSymbol $sym21$_SBHL_TIME_PREDICATES_;
    private static final SubLSymbol $sym22$_SBHL_TIME_MODULES_;
    private static final SubLList $list23;
    private static final SubLList $list24;
    private static final SubLSymbol $sym25$PROGN;
    private static final SubLSymbol $sym26$CHECK_TYPE;
    private static final SubLList $list27;
    private static final SubLSymbol $sym28$_SBHL_TEMPORALITY_ALL_ACCESSES_POLARITY_FILTER_;
    private static final SubLList $list29;
    private static final SubLList $list30;
    private static final SubLList $list31;
    private static final SubLSymbol $sym32$_SBHL_TEMPORALITY_SUCCESSION_DEPTH_;
    private static final SubLList $list33;
    private static final SubLList $list34;
    private static final SubLList $list35;
    private static final SubLSymbol $sym36$SMART_CSOME;
    private static final SubLList $list37;
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-vars.lisp", position = 951L)
    public static SubLObject sbhl_temporality_activeP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(sbhl_time_vars.NIL != sbhl_time_vars.$sbhl_temporality_activeP$.getDynamicValue(thread) && sbhl_time_vars.NIL != kb_control_vars.time_kb_loaded_p());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-vars.lisp", position = 1816L)
    public static SubLObject possibly_considering_link_disjunctions_in_mt(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject mt = (SubLObject)sbhl_time_vars.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_time_vars.$list4);
        mt = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)sbhl_time_vars.$sym5$CLET, (SubLObject)sbhl_time_vars.$list6, (SubLObject)ConsesLow.list((SubLObject)sbhl_time_vars.$sym7$PWHEN, (SubLObject)ConsesLow.listS((SubLObject)sbhl_time_vars.$sym8$CAND, (SubLObject)ConsesLow.list((SubLObject)sbhl_time_vars.$sym9$NULL, mt), (SubLObject)sbhl_time_vars.$list10), (SubLObject)ConsesLow.listS((SubLObject)sbhl_time_vars.$sym11$CSETQ, mt, (SubLObject)sbhl_time_vars.$list12)), (SubLObject)ConsesLow.list((SubLObject)sbhl_time_vars.$sym7$PWHEN, (SubLObject)sbhl_time_vars.$sym0$_SBHL_TEMPORALITY_CONSIDER_LINK_DISJUNCTIONS__, (SubLObject)ConsesLow.list((SubLObject)sbhl_time_vars.$sym13$ADD_TEMPORAL_LINK_DISJUNCTION_CONSEQUENTS, mt)), ConsesLow.append(body, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)sbhl_time_vars.$sym7$PWHEN, (SubLObject)sbhl_time_vars.$sym0$_SBHL_TEMPORALITY_CONSIDER_LINK_DISJUNCTIONS__, (SubLObject)ConsesLow.list((SubLObject)sbhl_time_vars.$sym14$REMOVE_TEMPORAL_LINK_DISJUNCTION_CONSEQUENTS, mt)))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-vars.lisp", position = 4756L)
    public static SubLObject without_collecting_dates_in_sbhl_search(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)sbhl_time_vars.$sym5$CLET, (SubLObject)sbhl_time_vars.$list23, ConsesLow.append(body, (SubLObject)sbhl_time_vars.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-vars.lisp", position = 4999L)
    public static SubLObject in_sbhl_search_only_collecting(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject polarity = (SubLObject)sbhl_time_vars.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_time_vars.$list24);
        polarity = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.list((SubLObject)sbhl_time_vars.$sym25$PROGN, (SubLObject)ConsesLow.listS((SubLObject)sbhl_time_vars.$sym26$CHECK_TYPE, polarity, (SubLObject)sbhl_time_vars.$list27), (SubLObject)ConsesLow.listS((SubLObject)sbhl_time_vars.$sym5$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)sbhl_time_vars.$sym28$_SBHL_TEMPORALITY_ALL_ACCESSES_POLARITY_FILTER_, polarity)), ConsesLow.append(body, (SubLObject)sbhl_time_vars.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-vars.lisp", position = 5210L)
    public static SubLObject in_sbhl_search_collecting_all(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)sbhl_time_vars.$sym5$CLET, (SubLObject)sbhl_time_vars.$list29, ConsesLow.append(body, (SubLObject)sbhl_time_vars.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-vars.lisp", position = 5435L)
    public static SubLObject sbhl_temporality_consequent_links_search_passed_through_link_p(final SubLObject link) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return subl_promotions.memberP(link, sbhl_time_vars.$sbhl_temporality_consequent_links_search_passed_through$.getDynamicValue(thread), (SubLObject)sbhl_time_vars.UNPROVIDED, (SubLObject)sbhl_time_vars.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-vars.lisp", position = 5768L)
    public static SubLObject with_sbhl_temporality_succession_depth(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject integer = (SubLObject)sbhl_time_vars.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_time_vars.$list30);
        integer = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.list((SubLObject)sbhl_time_vars.$sym25$PROGN, (SubLObject)ConsesLow.listS((SubLObject)sbhl_time_vars.$sym26$CHECK_TYPE, integer, (SubLObject)sbhl_time_vars.$list31), (SubLObject)ConsesLow.listS((SubLObject)sbhl_time_vars.$sym5$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)sbhl_time_vars.$sym32$_SBHL_TEMPORALITY_SUCCESSION_DEPTH_, integer)), ConsesLow.append(body, (SubLObject)sbhl_time_vars.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-vars.lisp", position = 5972L)
    public static SubLObject sbhl_succession_depth_non_negative_p() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(!sbhl_time_vars.$sbhl_temporality_succession_depth$.getDynamicValue(thread).isNegative());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-vars.lisp", position = 6278L)
    public static SubLObject sbhl_temporality_date_succession() {
        return sbhl_time_vars.$sbhl_temporality_date_succession$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-vars.lisp", position = 6929L)
    public static SubLObject with_new_sbhl_temporality_passed_through_date_vars(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)sbhl_time_vars.$sym5$CLET, (SubLObject)sbhl_time_vars.$list33, ConsesLow.append(body, (SubLObject)sbhl_time_vars.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-vars.lisp", position = 7473L)
    public static SubLObject sbhl_hl_time_predicate_p(final SubLObject predicate) {
        return subl_promotions.memberP(predicate, sbhl_time_vars.$sbhl_hl_time_predicates$.getGlobalValue(), Symbols.symbol_function((SubLObject)sbhl_time_vars.EQL), (SubLObject)sbhl_time_vars.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-vars.lisp", position = 7676L)
    public static SubLObject get_sbhl_hl_time_predicates() {
        return sbhl_time_vars.$sbhl_hl_time_predicates$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-vars.lisp", position = 7823L)
    public static SubLObject do_sbhl_hl_time_predicates(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_time_vars.$list35);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject pred_var = (SubLObject)sbhl_time_vars.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_time_vars.$list35);
        pred_var = current.first();
        current = current.rest();
        final SubLObject done_var = (SubLObject)(current.isCons() ? current.first() : sbhl_time_vars.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_time_vars.$list35);
        current = current.rest();
        if (sbhl_time_vars.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)sbhl_time_vars.$sym36$SMART_CSOME, (SubLObject)ConsesLow.list(pred_var, (SubLObject)sbhl_time_vars.$list37, done_var), ConsesLow.append(body, (SubLObject)sbhl_time_vars.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_time_vars.$list35);
        return (SubLObject)sbhl_time_vars.NIL;
    }
    
    public static SubLObject declare_sbhl_time_vars_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_vars", "sbhl_temporality_activeP", "SBHL-TEMPORALITY-ACTIVE?", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_time_vars", "possibly_considering_link_disjunctions_in_mt", "POSSIBLY-CONSIDERING-LINK-DISJUNCTIONS-IN-MT");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_time_vars", "without_collecting_dates_in_sbhl_search", "WITHOUT-COLLECTING-DATES-IN-SBHL-SEARCH");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_time_vars", "in_sbhl_search_only_collecting", "IN-SBHL-SEARCH-ONLY-COLLECTING");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_time_vars", "in_sbhl_search_collecting_all", "IN-SBHL-SEARCH-COLLECTING-ALL");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_vars", "sbhl_temporality_consequent_links_search_passed_through_link_p", "SBHL-TEMPORALITY-CONSEQUENT-LINKS-SEARCH-PASSED-THROUGH-LINK-P", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_time_vars", "with_sbhl_temporality_succession_depth", "WITH-SBHL-TEMPORALITY-SUCCESSION-DEPTH");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_vars", "sbhl_succession_depth_non_negative_p", "SBHL-SUCCESSION-DEPTH-NON-NEGATIVE-P", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_vars", "sbhl_temporality_date_succession", "SBHL-TEMPORALITY-DATE-SUCCESSION", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_time_vars", "with_new_sbhl_temporality_passed_through_date_vars", "WITH-NEW-SBHL-TEMPORALITY-PASSED-THROUGH-DATE-VARS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_vars", "sbhl_hl_time_predicate_p", "SBHL-HL-TIME-PREDICATE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_vars", "get_sbhl_hl_time_predicates", "GET-SBHL-HL-TIME-PREDICATES", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_time_vars", "do_sbhl_hl_time_predicates", "DO-SBHL-HL-TIME-PREDICATES");
        return (SubLObject)sbhl_time_vars.NIL;
    }
    
    public static SubLObject init_sbhl_time_vars_file() {
        sbhl_time_vars.$sbhl_temporality_activeP$ = SubLFiles.defparameter("*SBHL-TEMPORALITY-ACTIVE?*", (SubLObject)sbhl_time_vars.T);
        sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$ = SubLFiles.defparameter("*SBHL-TEMPORALITY-CONSIDER-LINK-DISJUNCTIONS?*", (SubLObject)sbhl_time_vars.NIL);
        sbhl_time_vars.$sbhl_temporality_verbose_justsP$ = SubLFiles.defparameter("*SBHL-TEMPORALITY-VERBOSE-JUSTS?*", (SubLObject)sbhl_time_vars.NIL);
        sbhl_time_vars.$sbhl_temporality_include_only_links_in_verbose_justsP$ = SubLFiles.defparameter("*SBHL-TEMPORALITY-INCLUDE-ONLY-LINKS-IN-VERBOSE-JUSTS?*", (SubLObject)sbhl_time_vars.NIL);
        sbhl_time_vars.$sbhl_temporal_link_support_table$ = SubLFiles.deflexical("*SBHL-TEMPORAL-LINK-SUPPORT-TABLE*", maybeDefault((SubLObject)sbhl_time_vars.$sym15$_SBHL_TEMPORAL_LINK_SUPPORT_TABLE_, sbhl_time_vars.$sbhl_temporal_link_support_table$, ()->(Hashtables.make_hash_table((SubLObject)sbhl_time_vars.$int16$40000, Symbols.symbol_function((SubLObject)sbhl_time_vars.EQUAL), (SubLObject)sbhl_time_vars.UNPROVIDED))));
        sbhl_time_vars.$sbhl_temporal_link_disjunction_support_table$ = SubLFiles.deflexical("*SBHL-TEMPORAL-LINK-DISJUNCTION-SUPPORT-TABLE*", maybeDefault((SubLObject)sbhl_time_vars.$sym17$_SBHL_TEMPORAL_LINK_DISJUNCTION_SUPPORT_TABLE_, sbhl_time_vars.$sbhl_temporal_link_disjunction_support_table$, ()->(Hashtables.make_hash_table((SubLObject)sbhl_time_vars.$int18$4000, Symbols.symbol_function((SubLObject)sbhl_time_vars.EQUAL), (SubLObject)sbhl_time_vars.UNPROVIDED))));
        sbhl_time_vars.$sbhl_temporal_link_disjunction_term_table$ = SubLFiles.deflexical("*SBHL-TEMPORAL-LINK-DISJUNCTION-TERM-TABLE*", maybeDefault((SubLObject)sbhl_time_vars.$sym19$_SBHL_TEMPORAL_LINK_DISJUNCTION_TERM_TABLE_, sbhl_time_vars.$sbhl_temporal_link_disjunction_term_table$, ()->(Hashtables.make_hash_table((SubLObject)sbhl_time_vars.$int18$4000, (SubLObject)sbhl_time_vars.UNPROVIDED, (SubLObject)sbhl_time_vars.UNPROVIDED))));
        sbhl_time_vars.$sbhl_extended_universal_date_list$ = SubLFiles.deflexical("*SBHL-EXTENDED-UNIVERSAL-DATE-LIST*", (SubLObject)(maybeDefault((SubLObject)sbhl_time_vars.$sym20$_SBHL_EXTENDED_UNIVERSAL_DATE_LIST_, sbhl_time_vars.$sbhl_extended_universal_date_list$, sbhl_time_vars.NIL)));
        sbhl_time_vars.$sbhl_time_predicates$ = SubLFiles.deflexical("*SBHL-TIME-PREDICATES*", (SubLObject)(maybeDefault((SubLObject)sbhl_time_vars.$sym21$_SBHL_TIME_PREDICATES_, sbhl_time_vars.$sbhl_time_predicates$, sbhl_time_vars.NIL)));
        sbhl_time_vars.$sbhl_time_modules$ = SubLFiles.deflexical("*SBHL-TIME-MODULES*", maybeDefault((SubLObject)sbhl_time_vars.$sym22$_SBHL_TIME_MODULES_, sbhl_time_vars.$sbhl_time_modules$, ()->(dictionary.new_dictionary((SubLObject)sbhl_time_vars.UNPROVIDED, (SubLObject)sbhl_time_vars.UNPROVIDED))));
        sbhl_time_vars.$sbhl_temporal_points_being_removed$ = SubLFiles.defparameter("*SBHL-TEMPORAL-POINTS-BEING-REMOVED*", (SubLObject)sbhl_time_vars.NIL);
        sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$ = SubLFiles.defparameter("*SBHL-TEMPORAL-LINK-DISJUNCTION-CONSEQUENT-TABLE*", (SubLObject)sbhl_time_vars.NIL);
        sbhl_time_vars.$sbhl_temporality_dont_collect_dates_when_all_accessingP$ = SubLFiles.defparameter("*SBHL-TEMPORALITY-DONT-COLLECT-DATES-WHEN-ALL-ACCESSING?*", (SubLObject)sbhl_time_vars.NIL);
        sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$ = SubLFiles.defparameter("*SBHL-TEMPORALITY-ALL-ACCESSES-POLARITY-FILTER*", (SubLObject)sbhl_time_vars.NIL);
        sbhl_time_vars.$sbhl_temporality_consequent_links_search_passed_through$ = SubLFiles.defparameter("*SBHL-TEMPORALITY-CONSEQUENT-LINKS-SEARCH-PASSED-THROUGH*", (SubLObject)sbhl_time_vars.NIL);
        sbhl_time_vars.$sbhl_temporality_succession_depth$ = SubLFiles.defparameter("*SBHL-TEMPORALITY-SUCCESSION-DEPTH*", (SubLObject)sbhl_time_vars.NIL);
        sbhl_time_vars.$sbhl_temporality_succession_depth_threshold$ = SubLFiles.defparameter("*SBHL-TEMPORALITY-SUCCESSION-DEPTH-THRESHOLD*", (SubLObject)sbhl_time_vars.TEN_INTEGER);
        sbhl_time_vars.$sbhl_temporality_date_succession$ = SubLFiles.deflexical("*SBHL-TEMPORALITY-DATE-SUCCESSION*", (SubLObject)sbhl_time_vars.TEN_INTEGER);
        sbhl_time_vars.$sbhl_temporality_search_passed_through_dateP$ = SubLFiles.defparameter("*SBHL-TEMPORALITY-SEARCH-PASSED-THROUGH-DATE?*", (SubLObject)sbhl_time_vars.NIL);
        sbhl_time_vars.$sbhl_temporality_justification_gathering_passed_through_dateP$ = SubLFiles.defparameter("*SBHL-TEMPORALITY-JUSTIFICATION-GATHERING-PASSED-THROUGH-DATE?*", (SubLObject)sbhl_time_vars.NIL);
        sbhl_time_vars.$sbhl_hl_time_predicates$ = SubLFiles.deflexical("*SBHL-HL-TIME-PREDICATES*", (SubLObject)sbhl_time_vars.$list34);
        return (SubLObject)sbhl_time_vars.NIL;
    }
    
    public static SubLObject setup_sbhl_time_vars_file() {
        utilities_macros.declare_control_parameter_internal((SubLObject)sbhl_time_vars.$sym0$_SBHL_TEMPORALITY_CONSIDER_LINK_DISJUNCTIONS__, (SubLObject)sbhl_time_vars.$str1$Consider_disjunctive_temporal_rel, (SubLObject)sbhl_time_vars.$str2$This_controls_whether_the_HL_modu, (SubLObject)sbhl_time_vars.$list3);
        subl_macro_promotions.declare_defglobal((SubLObject)sbhl_time_vars.$sym15$_SBHL_TEMPORAL_LINK_SUPPORT_TABLE_);
        subl_macro_promotions.declare_defglobal((SubLObject)sbhl_time_vars.$sym17$_SBHL_TEMPORAL_LINK_DISJUNCTION_SUPPORT_TABLE_);
        subl_macro_promotions.declare_defglobal((SubLObject)sbhl_time_vars.$sym19$_SBHL_TEMPORAL_LINK_DISJUNCTION_TERM_TABLE_);
        subl_macro_promotions.declare_defglobal((SubLObject)sbhl_time_vars.$sym20$_SBHL_EXTENDED_UNIVERSAL_DATE_LIST_);
        subl_macro_promotions.declare_defglobal((SubLObject)sbhl_time_vars.$sym21$_SBHL_TIME_PREDICATES_);
        subl_macro_promotions.declare_defglobal((SubLObject)sbhl_time_vars.$sym22$_SBHL_TIME_MODULES_);
        return (SubLObject)sbhl_time_vars.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_sbhl_time_vars_file();
    }
    
    @Override
	public void initializeVariables() {
        init_sbhl_time_vars_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_sbhl_time_vars_file();
    }
    
    static {
        me = (SubLFile)new sbhl_time_vars();
        sbhl_time_vars.$sbhl_temporality_activeP$ = null;
        sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$ = null;
        sbhl_time_vars.$sbhl_temporality_verbose_justsP$ = null;
        sbhl_time_vars.$sbhl_temporality_include_only_links_in_verbose_justsP$ = null;
        sbhl_time_vars.$sbhl_temporal_link_support_table$ = null;
        sbhl_time_vars.$sbhl_temporal_link_disjunction_support_table$ = null;
        sbhl_time_vars.$sbhl_temporal_link_disjunction_term_table$ = null;
        sbhl_time_vars.$sbhl_extended_universal_date_list$ = null;
        sbhl_time_vars.$sbhl_time_predicates$ = null;
        sbhl_time_vars.$sbhl_time_modules$ = null;
        sbhl_time_vars.$sbhl_temporal_points_being_removed$ = null;
        sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$ = null;
        sbhl_time_vars.$sbhl_temporality_dont_collect_dates_when_all_accessingP$ = null;
        sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$ = null;
        sbhl_time_vars.$sbhl_temporality_consequent_links_search_passed_through$ = null;
        sbhl_time_vars.$sbhl_temporality_succession_depth$ = null;
        sbhl_time_vars.$sbhl_temporality_succession_depth_threshold$ = null;
        sbhl_time_vars.$sbhl_temporality_date_succession$ = null;
        sbhl_time_vars.$sbhl_temporality_search_passed_through_dateP$ = null;
        sbhl_time_vars.$sbhl_temporality_justification_gathering_passed_through_dateP$ = null;
        sbhl_time_vars.$sbhl_hl_time_predicates$ = null;
        $sym0$_SBHL_TEMPORALITY_CONSIDER_LINK_DISJUNCTIONS__ = SubLObjectFactory.makeSymbol("*SBHL-TEMPORALITY-CONSIDER-LINK-DISJUNCTIONS?*");
        $str1$Consider_disjunctive_temporal_rel = SubLObjectFactory.makeString("Consider disjunctive temporal relation literals");
        $str2$This_controls_whether_the_HL_modu = SubLObjectFactory.makeString("This controls whether the HL module that handles temporal relation\n   queries will consider temporal relation literal assertions the\n   information content of which is disjunctive.  Typically, such literals\n   are negated ground atomic formulas.  (Considering them adds some expense.)");
        $list3 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)sbhl_time_vars.NIL, (SubLObject)SubLObjectFactory.makeString("No")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)sbhl_time_vars.T, (SubLObject)SubLObjectFactory.makeString("Yes")));
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym5$CLET = SubLObjectFactory.makeSymbol("CLET");
        $list6 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SBHL-TEMPORAL-LINK-DISJUNCTION-CONSEQUENT-TABLE*"));
        $sym7$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
        $sym8$CAND = SubLObjectFactory.makeSymbol("CAND");
        $sym9$NULL = SubLObjectFactory.makeSymbol("NULL");
        $list10 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ALL-MTS-ARE-RELEVANT?")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ANY-MT-IS-RELEVANT?")))));
        $sym11$CSETQ = SubLObjectFactory.makeSymbol("CSETQ");
        $list12 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*MT*"));
        $sym13$ADD_TEMPORAL_LINK_DISJUNCTION_CONSEQUENTS = SubLObjectFactory.makeSymbol("ADD-TEMPORAL-LINK-DISJUNCTION-CONSEQUENTS");
        $sym14$REMOVE_TEMPORAL_LINK_DISJUNCTION_CONSEQUENTS = SubLObjectFactory.makeSymbol("REMOVE-TEMPORAL-LINK-DISJUNCTION-CONSEQUENTS");
        $sym15$_SBHL_TEMPORAL_LINK_SUPPORT_TABLE_ = SubLObjectFactory.makeSymbol("*SBHL-TEMPORAL-LINK-SUPPORT-TABLE*");
        $int16$40000 = SubLObjectFactory.makeInteger(40000);
        $sym17$_SBHL_TEMPORAL_LINK_DISJUNCTION_SUPPORT_TABLE_ = SubLObjectFactory.makeSymbol("*SBHL-TEMPORAL-LINK-DISJUNCTION-SUPPORT-TABLE*");
        $int18$4000 = SubLObjectFactory.makeInteger(4000);
        $sym19$_SBHL_TEMPORAL_LINK_DISJUNCTION_TERM_TABLE_ = SubLObjectFactory.makeSymbol("*SBHL-TEMPORAL-LINK-DISJUNCTION-TERM-TABLE*");
        $sym20$_SBHL_EXTENDED_UNIVERSAL_DATE_LIST_ = SubLObjectFactory.makeSymbol("*SBHL-EXTENDED-UNIVERSAL-DATE-LIST*");
        $sym21$_SBHL_TIME_PREDICATES_ = SubLObjectFactory.makeSymbol("*SBHL-TIME-PREDICATES*");
        $sym22$_SBHL_TIME_MODULES_ = SubLObjectFactory.makeSymbol("*SBHL-TIME-MODULES*");
        $list23 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SBHL-TEMPORALITY-DONT-COLLECT-DATES-WHEN-ALL-ACCESSING?*"), (SubLObject)sbhl_time_vars.T));
        $list24 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("POLARITY"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym25$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $sym26$CHECK_TYPE = SubLObjectFactory.makeSymbol("CHECK-TYPE");
        $list27 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEYWORDP"));
        $sym28$_SBHL_TEMPORALITY_ALL_ACCESSES_POLARITY_FILTER_ = SubLObjectFactory.makeSymbol("*SBHL-TEMPORALITY-ALL-ACCESSES-POLARITY-FILTER*");
        $list29 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SBHL-TEMPORALITY-ALL-ACCESSES-POLARITY-FILTER*"), (SubLObject)sbhl_time_vars.NIL));
        $list30 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INTEGER"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list31 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INTEGERP"));
        $sym32$_SBHL_TEMPORALITY_SUCCESSION_DEPTH_ = SubLObjectFactory.makeSymbol("*SBHL-TEMPORALITY-SUCCESSION-DEPTH*");
        $list33 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SBHL-TEMPORALITY-JUSTIFICATION-GATHERING-PASSED-THROUGH-DATE?*"), (SubLObject)sbhl_time_vars.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SBHL-TEMPORALITY-SEARCH-PASSED-THROUGH-DATE?*"), (SubLObject)sbhl_time_vars.NIL));
        $list34 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("weak-HL-TimePrecedence")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("strict-HL-TimePrecedence")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("successorStrict-HL-TimePrecedence")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("weakSuccessor-HL-TimePrecedence")));
        $list35 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRED-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("DONE-VAR")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym36$SMART_CSOME = SubLObjectFactory.makeSymbol("SMART-CSOME");
        $list37 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SBHL-HL-TIME-PREDICATES"));
    }
}

/*

	Total time: 99 ms
	
*/