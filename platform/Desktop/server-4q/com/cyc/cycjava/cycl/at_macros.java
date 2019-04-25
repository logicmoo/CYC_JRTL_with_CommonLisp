package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class at_macros extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.at_macros";
    public static final String myFingerPrint = "cdfa3240a573a39d2132cbfd46cf1def86f515bb9ac9820be5b78b2a65f180b0";
    private static final SubLSymbol $sym0$CLET;
    private static final SubLList $list1;
    private static final SubLSymbol $sym2$CUNWIND_PROTECT;
    private static final SubLList $list3;
    private static final SubLList $list4;
    private static final SubLSymbol $sym5$MAKE_DEFN_FN_HISTORY_TABLE;
    private static final SubLSymbol $sym6$WITH_NEW_DEFN_SPACE;
    private static final SubLSymbol $sym7$MAKE_QUOTED_DEFN_FN_HISTORY_TABLE;
    private static final SubLSymbol $sym8$MAKE_DEFN_COL_HISTORY_TABLE;
    private static final SubLSymbol $sym9$MAKE_QUOTED_DEFN_COL_HISTORY_TABLE;
    private static final SubLSymbol $sym10$POSSIBLY_MAKE_DEFN_FN_HISTORY_TABLE;
    private static final SubLSymbol $sym11$WITH_POSSIBLY_NEW_DEFN_SPACE;
    private static final SubLSymbol $sym12$POSSIBLY_MAKE_QUOTED_DEFN_FN_HISTORY_TABLE;
    private static final SubLSymbol $sym13$POSSIBLY_MAKE_DEFN_COL_HISTORY_TABLE;
    private static final SubLSymbol $sym14$POSSIBLY_MAKE_QUOTED_DEFN_COL_HISTORY_TABLE;
    private static final SubLList $list15;
    private static final SubLSymbol $sym16$_AT_DEFNS_;
    private static final SubLList $list17;
    private static final SubLSymbol $sym18$_AT_DEFN_;
    private static final SubLSymbol $sym19$_AT_FUNCTIONS_;
    private static final SubLSymbol $sym20$_AT_FUNCTION_;
    private static final SubLList $list21;
    private static final SubLList $list22;
    private static final SubLSymbol $sym23$CSETQ;
    private static final SubLList $list24;
    private static final SubLList $list25;
    private static final SubLList $list26;
    private static final SubLSymbol $sym27$_AT_MODE_;
    private static final SubLList $list28;
    private static final SubLSymbol $sym29$_AT_IND_ISA_;
    private static final SubLList $list30;
    private static final SubLSymbol $sym31$_AT_IND_GENL_;
    private static final SubLList $list32;
    private static final SubLSymbol $sym33$_AT_PRED_;
    private static final SubLSymbol $sym34$PWHEN;
    private static final SubLSymbol $sym35$_AT_INVERSE_;
    private static final SubLList $list36;
    private static final SubLList $list37;
    private static final SubLList $list38;
    private static final SubLSymbol $sym39$GENL_SOMETHING_;
    private static final SubLSymbol $sym40$PROGN;
    private static final SubLSymbol $sym41$FWHEN;
    private static final SubLSymbol $sym42$FORT_P;
    private static final SubLSymbol $sym43$COR;
    private static final SubLSymbol $sym44$GENL_PREDICATES;
    private static final SubLSymbol $sym45$GENL_INVERSES;
    private static final SubLSymbol $sym46$_AT_RELN_;
    private static final SubLSymbol $sym47$_AT_SEARCH_GENL_PREDS__;
    private static final SubLSymbol $sym48$CAND;
    private static final SubLSymbol $sym49$_AT_CHECK_GENL_PREDS__;
    private static final SubLSymbol $sym50$_AT_SEARCH_GENL_INVERSES__;
    private static final SubLSymbol $sym51$_AT_CHECK_GENL_INVERSES__;
    private static final SubLSymbol $sym52$_AT_ARG_;
    private static final SubLList $list53;
    private static final SubLSymbol $sym54$_AT_ARG_TYPE_;
    private static final SubLList $list55;
    private static final SubLSymbol $sym56$CHECK_TYPE;
    private static final SubLList $list57;
    private static final SubLSymbol $sym58$_AT_ARGNUM_;
    private static final SubLSymbol $sym59$_AT_IND_ARG_;
    private static final SubLSymbol $sym60$_AT_IND_ARGNUM_;
    private static final SubLList $list61;
    private static final SubLList $list62;
    private static final SubLSymbol $sym63$_AT_ARG_ISA_;
    private static final SubLList $list64;
    private static final SubLList $list65;
    private static final SubLSymbol $sym66$_AT_BASE_FN_;
    private static final SubLSymbol $sym67$_AT_SOURCE_;
    private static final SubLList $list68;
    private static final SubLSymbol $sym69$_AT_CONSTRAINT_GAF_;
    private static final SubLList $list70;
    private static final SubLSymbol $sym71$__;
    private static final SubLSymbol $sym72$_AT_TEST_LEVEL_;
    private static final SubLSymbol $sym73$_AT_TRACE_LEVEL_;
    private static final SubLSymbol $sym74$_DEFN_TEST_LEVEL_;
    private static final SubLSymbol $sym75$_DEFN_TRACE_LEVEL_;
    private static final SubLList $list76;
    private static final SubLList $list77;
    private static final SubLList $list78;
    private static final SubLList $list79;
    private static final SubLList $list80;
    private static final SubLList $list81;
    private static final SubLList $list82;
    private static final SubLSymbol $sym83$CCATCH_IGNORE;
    private static final SubLSymbol $kw84$AT_MAPPING_DONE;
    private static final SubLList $list85;
    private static final SubLList $list86;
    private static final SubLSymbol $sym87$SYMBOLP;
    private static final SubLSymbol $sym88$QUOTE;
    private static final SubLSymbol $sym89$CPUSHNEW;
    private static final SubLList $list90;
    private static final SubLList $list91;
    private static final SubLString $str92$__a_METERS_;
    private static final SubLString $str93$_a_METERED;
    private static final SubLString $str94$RESET__a_METERS;
    private static final SubLSymbol $sym95$DEFVAR_DEFN;
    private static final SubLList $list96;
    private static final SubLString $str97$metering_cache_for_calls_to_defn_;
    private static final SubLSymbol $sym98$DEFINE;
    private static final SubLSymbol $sym99$CSETF;
    private static final SubLSymbol $sym100$GETHASH;
    private static final SubLSymbol $kw101$CALLS;
    private static final SubLList $list102;
    private static final SubLSymbol $kw103$TIMES;
    private static final SubLList $list104;
    private static final SubLSymbol $kw105$RESULTS;
    private static final SubLSymbol $kw106$ARGS;
    private static final SubLSymbol $sym107$SETHASH;
    private static final SubLSymbol $kw108$ARG_LIST;
    private static final SubLSymbol $kw109$FUNCTION;
    private static final SubLList $list110;
    private static final SubLSymbol $kw111$RESET;
    private static final SubLSymbol $sym112$CDOLIST;
    private static final SubLList $list113;
    private static final SubLList $list114;
    private static final SubLList $list115;
    private static final SubLSymbol $sym116$CPUSH;
    private static final SubLList $list117;
    private static final SubLSymbol $sym118$PIF;
    private static final SubLSymbol $sym119$_DEFN_METERS__;
    private static final SubLList $list120;
    private static final SubLSymbol $sym121$CTIME;
    private static final SubLSymbol $sym122$RUN_TIME;
    private static final SubLSymbol $sym123$RESULT;
    private static final SubLSymbol $sym124$CINC;
    private static final SubLSymbol $sym125$LIST;
    private static final SubLList $list126;
    private static final SubLSymbol $sym127$RET;
    private static final SubLList $list128;
    private static final SubLList $list129;
    private static final SubLSymbol $kw130$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw131$DONE_VAR;
    private static final SubLSymbol $sym132$ALL_ARG_CONSTRAINTS;
    private static final SubLSymbol $sym133$DTLAC_LIST_GENERATOR;
    private static final SubLSymbol $sym134$CSOME;
    private static final SubLSymbol $sym135$DO_ALL_TOP_LEVEL_ARG_CONSTRAINTS;
    private static final SubLSymbol $sym136$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const137$EverythingPSC;
    private static final SubLSymbol $sym138$ALL_ARG_CONSTRAINTS;
    private static final SubLSymbol $sym139$DAACIO_LIST_GENERATOR;
    private static final SubLSymbol $sym140$DO_ALL_ARG_CONSTRAINTS_INSIDE_OUT;
    private static final SubLList $list141;
    private static final SubLList $list142;
    private static final SubLList $list143;
    
    @SubLTranslatedFile.SubL(source = "cycl/at-macros.lisp", position = 515L)
    public static SubLObject with_new_defn_space(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.list((SubLObject)at_macros.$sym0$CLET, (SubLObject)at_macros.$list1, reader.bq_cons((SubLObject)at_macros.$sym2$CUNWIND_PROTECT, ConsesLow.append(body, (SubLObject)at_macros.$list3)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-macros.lisp", position = 1032L)
    public static SubLObject with_possibly_new_defn_space(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.list((SubLObject)at_macros.$sym0$CLET, (SubLObject)at_macros.$list4, reader.bq_cons((SubLObject)at_macros.$sym2$CUNWIND_PROTECT, ConsesLow.append(body, (SubLObject)at_macros.$list3)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-macros.lisp", position = 1540L)
    public static SubLObject make_defn_fn_history_table() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return Hashtables.make_hash_table(at_vars.$defn_fn_history_default_size$.getDynamicValue(thread), (SubLObject)at_macros.UNPROVIDED, (SubLObject)at_macros.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-macros.lisp", position = 1681L)
    public static SubLObject make_quoted_defn_fn_history_table() {
        return make_defn_fn_history_table();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-macros.lisp", position = 1809L)
    public static SubLObject make_defn_col_history_table() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return Hashtables.make_hash_table(at_vars.$defn_col_history_default_size$.getDynamicValue(thread), (SubLObject)at_macros.UNPROVIDED, (SubLObject)at_macros.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-macros.lisp", position = 1952L)
    public static SubLObject make_quoted_defn_col_history_table() {
        return make_defn_col_history_table();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-macros.lisp", position = 2082L)
    public static SubLObject possibly_make_defn_fn_history_table() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (at_macros.NIL != misc_utilities.uninitialized_p(at_vars.$defn_fn_history$.getDynamicValue(thread))) {
            return make_defn_fn_history_table();
        }
        return at_vars.$defn_fn_history$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-macros.lisp", position = 2301L)
    public static SubLObject possibly_make_quoted_defn_fn_history_table() {
        return possibly_make_defn_fn_history_table();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-macros.lisp", position = 2456L)
    public static SubLObject possibly_make_defn_col_history_table() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (at_macros.NIL != misc_utilities.uninitialized_p(at_vars.$defn_col_history$.getDynamicValue(thread))) {
            return make_defn_col_history_table();
        }
        return at_vars.$defn_col_history$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-macros.lisp", position = 2679L)
    public static SubLObject possibly_make_quoted_defn_col_history_table() {
        return possibly_make_defn_col_history_table();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-macros.lisp", position = 2836L)
    public static SubLObject with_at_defns(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject v_defns = (SubLObject)at_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)at_macros.$list15);
        v_defns = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)at_macros.$sym0$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)at_macros.$sym16$_AT_DEFNS_, v_defns)), ConsesLow.append(body, (SubLObject)at_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-macros.lisp", position = 3004L)
    public static SubLObject with_at_defn(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject defn = (SubLObject)at_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)at_macros.$list17);
        defn = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)at_macros.$sym0$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)at_macros.$sym18$_AT_DEFN_, defn)), ConsesLow.append(body, (SubLObject)at_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-macros.lisp", position = 3168L)
    public static SubLObject with_at_functions(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject v_defns = (SubLObject)at_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)at_macros.$list15);
        v_defns = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)at_macros.$sym0$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)at_macros.$sym19$_AT_FUNCTIONS_, v_defns)), ConsesLow.append(body, (SubLObject)at_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-macros.lisp", position = 3344L)
    public static SubLObject with_at_function(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject defn = (SubLObject)at_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)at_macros.$list17);
        defn = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)at_macros.$sym0$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)at_macros.$sym20$_AT_FUNCTION_, defn)), ConsesLow.append(body, (SubLObject)at_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-macros.lisp", position = 3516L)
    public static SubLObject with_at_result(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject result_var = (SubLObject)at_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)at_macros.$list21);
        result_var = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)at_macros.$sym0$CLET, (SubLObject)at_macros.$list22, ConsesLow.append(body, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)at_macros.$sym23$CSETQ, result_var, (SubLObject)at_macros.$list22))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-macros.lisp", position = 3714L)
    public static SubLObject with_some_at_arg_isa_var(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject boolean_var = (SubLObject)at_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)at_macros.$list24);
        boolean_var = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)at_macros.$sym0$CLET, (SubLObject)at_macros.$list25, ConsesLow.append(body, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)at_macros.$sym23$CSETQ, boolean_var, (SubLObject)at_macros.$list25))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-macros.lisp", position = 3969L)
    public static SubLObject with_at_mode(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject mode = (SubLObject)at_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)at_macros.$list26);
        mode = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)at_macros.$sym0$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)at_macros.$sym27$_AT_MODE_, mode)), ConsesLow.append(body, (SubLObject)at_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-macros.lisp", position = 4133L)
    public static SubLObject with_at_ind_isa(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject col = (SubLObject)at_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)at_macros.$list28);
        col = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)at_macros.$sym0$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)at_macros.$sym29$_AT_IND_ISA_, col)), ConsesLow.append(body, (SubLObject)at_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-macros.lisp", position = 4301L)
    public static SubLObject with_at_ind_genl(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject v_term = (SubLObject)at_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)at_macros.$list30);
        v_term = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)at_macros.$sym0$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)at_macros.$sym31$_AT_IND_GENL_, v_term)), ConsesLow.append(body, (SubLObject)at_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-macros.lisp", position = 4473L)
    public static SubLObject with_at_pred(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject constraint_pred = (SubLObject)at_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)at_macros.$list32);
        constraint_pred = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.list((SubLObject)at_macros.$sym0$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)at_macros.$sym33$_AT_PRED_, constraint_pred)), (SubLObject)ConsesLow.listS((SubLObject)at_macros.$sym34$PWHEN, (SubLObject)at_macros.$sym33$_AT_PRED_, ConsesLow.append(body, (SubLObject)at_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-macros.lisp", position = 4725L)
    public static SubLObject with_at_inverse(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject constraint_pred = (SubLObject)at_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)at_macros.$list32);
        constraint_pred = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)at_macros.$sym0$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)at_macros.$sym35$_AT_INVERSE_, constraint_pred)), ConsesLow.append(body, (SubLObject)at_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-macros.lisp", position = 4916L)
    public static SubLObject with_at_mapping_inverses(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.list((SubLObject)at_macros.$sym34$PWHEN, (SubLObject)at_macros.$list36, (SubLObject)ConsesLow.listS((SubLObject)at_macros.$sym0$CLET, (SubLObject)at_macros.$list37, ConsesLow.append(body, (SubLObject)at_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-macros.lisp", position = 5172L)
    public static SubLObject with_at_reln(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject reln = (SubLObject)at_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)at_macros.$list38);
        reln = current.first();
        final SubLObject body;
        current = (body = current.rest());
        final SubLObject genl_somethingP = (SubLObject)at_macros.$sym39$GENL_SOMETHING_;
        return (SubLObject)ConsesLow.list((SubLObject)at_macros.$sym40$PROGN, (SubLObject)ConsesLow.listS((SubLObject)at_macros.$sym0$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(genl_somethingP, (SubLObject)ConsesLow.list((SubLObject)at_macros.$sym41$FWHEN, (SubLObject)ConsesLow.list((SubLObject)at_macros.$sym42$FORT_P, reln), (SubLObject)ConsesLow.list((SubLObject)at_macros.$sym43$COR, (SubLObject)ConsesLow.list((SubLObject)at_macros.$sym44$GENL_PREDICATES, reln), (SubLObject)ConsesLow.list((SubLObject)at_macros.$sym45$GENL_INVERSES, reln)))), (SubLObject)ConsesLow.list((SubLObject)at_macros.$sym46$_AT_RELN_, reln), (SubLObject)ConsesLow.list((SubLObject)at_macros.$sym47$_AT_SEARCH_GENL_PREDS__, (SubLObject)ConsesLow.list((SubLObject)at_macros.$sym48$CAND, (SubLObject)at_macros.$sym49$_AT_CHECK_GENL_PREDS__, genl_somethingP)), (SubLObject)ConsesLow.list((SubLObject)at_macros.$sym50$_AT_SEARCH_GENL_INVERSES__, (SubLObject)ConsesLow.list((SubLObject)at_macros.$sym48$CAND, (SubLObject)at_macros.$sym51$_AT_CHECK_GENL_INVERSES__, genl_somethingP))), ConsesLow.append(body, (SubLObject)at_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-macros.lisp", position = 5665L)
    public static SubLObject with_at_arg(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject v_term = (SubLObject)at_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)at_macros.$list30);
        v_term = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)at_macros.$sym0$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)at_macros.$sym52$_AT_ARG_, v_term)), ConsesLow.append(body, (SubLObject)at_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-macros.lisp", position = 5827L)
    public static SubLObject with_at_type(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject type = (SubLObject)at_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)at_macros.$list53);
        type = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)at_macros.$sym0$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)at_macros.$sym54$_AT_ARG_TYPE_, type)), ConsesLow.append(body, (SubLObject)at_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-macros.lisp", position = 5995L)
    public static SubLObject with_at_argnum(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject integer = (SubLObject)at_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)at_macros.$list55);
        integer = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.list((SubLObject)at_macros.$sym40$PROGN, (SubLObject)ConsesLow.listS((SubLObject)at_macros.$sym56$CHECK_TYPE, integer, (SubLObject)at_macros.$list57), (SubLObject)ConsesLow.listS((SubLObject)at_macros.$sym0$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)at_macros.$sym58$_AT_ARGNUM_, integer)), ConsesLow.append(body, (SubLObject)at_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-macros.lisp", position = 6217L)
    public static SubLObject with_at_ind_arg(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject v_term = (SubLObject)at_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)at_macros.$list30);
        v_term = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)at_macros.$sym0$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)at_macros.$sym59$_AT_IND_ARG_, v_term)), ConsesLow.append(body, (SubLObject)at_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-macros.lisp", position = 6387L)
    public static SubLObject with_at_ind_argnum(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject integer = (SubLObject)at_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)at_macros.$list55);
        integer = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.list((SubLObject)at_macros.$sym40$PROGN, (SubLObject)ConsesLow.listS((SubLObject)at_macros.$sym56$CHECK_TYPE, integer, (SubLObject)at_macros.$list57), (SubLObject)ConsesLow.listS((SubLObject)at_macros.$sym0$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)at_macros.$sym60$_AT_IND_ARGNUM_, integer)), ConsesLow.append(body, (SubLObject)at_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-macros.lisp", position = 6617L)
    public static SubLObject with_at_arg_isa(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject collection = (SubLObject)at_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)at_macros.$list61);
        collection = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.list((SubLObject)at_macros.$sym40$PROGN, (SubLObject)ConsesLow.listS((SubLObject)at_macros.$sym56$CHECK_TYPE, collection, (SubLObject)at_macros.$list62), (SubLObject)ConsesLow.listS((SubLObject)at_macros.$sym0$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)at_macros.$sym63$_AT_ARG_ISA_, collection)), ConsesLow.append(body, (SubLObject)at_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-macros.lisp", position = 6847L)
    public static SubLObject with_at_base_fn(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject fn = (SubLObject)at_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)at_macros.$list64);
        fn = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.list((SubLObject)at_macros.$sym40$PROGN, (SubLObject)ConsesLow.listS((SubLObject)at_macros.$sym56$CHECK_TYPE, fn, (SubLObject)at_macros.$list65), (SubLObject)ConsesLow.listS((SubLObject)at_macros.$sym0$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)at_macros.$sym66$_AT_BASE_FN_, fn)), ConsesLow.append(body, (SubLObject)at_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-macros.lisp", position = 7066L)
    public static SubLObject with_at_source(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject v_term = (SubLObject)at_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)at_macros.$list30);
        v_term = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)at_macros.$sym0$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)at_macros.$sym67$_AT_SOURCE_, v_term)), ConsesLow.append(body, (SubLObject)at_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-macros.lisp", position = 7234L)
    public static SubLObject with_at_constraint_gaf(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject gaf = (SubLObject)at_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)at_macros.$list68);
        gaf = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)at_macros.$sym0$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)at_macros.$sym69$_AT_CONSTRAINT_GAF_, gaf)), ConsesLow.append(body, (SubLObject)at_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-macros.lisp", position = 7416L)
    public static SubLObject at_test(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject level = (SubLObject)at_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)at_macros.$list70);
        level = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)at_macros.$sym34$PWHEN, (SubLObject)ConsesLow.list((SubLObject)at_macros.$sym71$__, (SubLObject)at_macros.$sym72$_AT_TEST_LEVEL_, level), ConsesLow.append(body, (SubLObject)at_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-macros.lisp", position = 7507L)
    public static SubLObject at_trace(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject level = (SubLObject)at_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)at_macros.$list70);
        level = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)at_macros.$sym34$PWHEN, (SubLObject)ConsesLow.list((SubLObject)at_macros.$sym71$__, (SubLObject)at_macros.$sym73$_AT_TRACE_LEVEL_, level), ConsesLow.append(body, (SubLObject)at_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-macros.lisp", position = 7600L)
    public static SubLObject defn_test(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject level = (SubLObject)at_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)at_macros.$list70);
        level = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)at_macros.$sym34$PWHEN, (SubLObject)ConsesLow.list((SubLObject)at_macros.$sym71$__, (SubLObject)at_macros.$sym74$_DEFN_TEST_LEVEL_, level), ConsesLow.append(body, (SubLObject)at_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-macros.lisp", position = 7695L)
    public static SubLObject defn_trace(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject level = (SubLObject)at_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)at_macros.$list70);
        level = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)at_macros.$sym34$PWHEN, (SubLObject)ConsesLow.list((SubLObject)at_macros.$sym71$__, (SubLObject)at_macros.$sym75$_DEFN_TRACE_LEVEL_, level), ConsesLow.append(body, (SubLObject)at_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-macros.lisp", position = 7792L)
    public static SubLObject gathering_at_constraints(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)at_macros.$sym0$CLET, (SubLObject)at_macros.$list76, ConsesLow.append(body, (SubLObject)at_macros.$list77));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-macros.lisp", position = 8116L)
    public static SubLObject gathering_at_assertions(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)at_macros.$sym0$CLET, (SubLObject)at_macros.$list78, ConsesLow.append(body, (SubLObject)at_macros.$list79));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-macros.lisp", position = 8434L)
    public static SubLObject gathering_at_format_violations(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)at_macros.$sym0$CLET, (SubLObject)at_macros.$list80, ConsesLow.append(body, (SubLObject)at_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-macros.lisp", position = 8662L)
    public static SubLObject gathering_at_different_violations(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)at_macros.$sym0$CLET, (SubLObject)at_macros.$list81, ConsesLow.append(body, (SubLObject)at_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-macros.lisp", position = 8899L)
    public static SubLObject gathering_at_predicate_violations(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)at_macros.$sym0$CLET, (SubLObject)at_macros.$list82, ConsesLow.append(body, (SubLObject)at_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-macros.lisp", position = 9136L)
    public static SubLObject until_at_mapping_finished(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.list((SubLObject)at_macros.$sym83$CCATCH_IGNORE, (SubLObject)at_macros.$kw84$AT_MAPPING_DONE, (SubLObject)ConsesLow.listS((SubLObject)at_macros.$sym0$CLET, (SubLObject)at_macros.$list85, ConsesLow.append(body, (SubLObject)at_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-macros.lisp", position = 9278L)
    public static SubLObject declare_collection_specific_defn(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject symbol = (SubLObject)at_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)at_macros.$list86);
        symbol = current.first();
        current = current.rest();
        if (at_macros.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)at_macros.$sym34$PWHEN, (SubLObject)ConsesLow.list((SubLObject)at_macros.$sym87$SYMBOLP, (SubLObject)ConsesLow.list((SubLObject)at_macros.$sym88$QUOTE, symbol)), (SubLObject)ConsesLow.listS((SubLObject)at_macros.$sym89$CPUSHNEW, (SubLObject)ConsesLow.list((SubLObject)at_macros.$sym88$QUOTE, symbol), (SubLObject)at_macros.$list90));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)at_macros.$list86);
        return (SubLObject)at_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-macros.lisp", position = 9557L)
    public static SubLObject define_defn_metered(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = (SubLObject)at_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)at_macros.$list91);
        name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)at_macros.$list91);
        final SubLObject temp = current.rest();
        final SubLObject arg_list;
        current = (arg_list = current.first());
        final SubLObject body;
        current = (body = temp);
        final SubLObject meter_cache = Packages.intern(PrintLow.format((SubLObject)at_macros.NIL, (SubLObject)at_macros.$str92$__a_METERS_, name), (SubLObject)at_macros.UNPROVIDED);
        final SubLObject metered_function = Packages.intern(PrintLow.format((SubLObject)at_macros.NIL, (SubLObject)at_macros.$str93$_a_METERED, name), (SubLObject)at_macros.UNPROVIDED);
        final SubLObject reset_function = Packages.intern(PrintLow.format((SubLObject)at_macros.NIL, (SubLObject)at_macros.$str94$RESET__a_METERS, name), (SubLObject)at_macros.UNPROVIDED);
        final SubLObject args = list_utilities.args_from_arg_list(arg_list);
        return (SubLObject)ConsesLow.list(new SubLObject[] { at_macros.$sym40$PROGN, ConsesLow.list((SubLObject)at_macros.$sym95$DEFVAR_DEFN, meter_cache, (SubLObject)at_macros.$list96, PrintLow.format((SubLObject)at_macros.NIL, (SubLObject)at_macros.$str97$metering_cache_for_calls_to_defn_, name)), ConsesLow.listS((SubLObject)at_macros.$sym98$DEFINE, new SubLObject[] { reset_function, at_macros.NIL, ConsesLow.listS((SubLObject)at_macros.$sym99$CSETF, (SubLObject)ConsesLow.list((SubLObject)at_macros.$sym100$GETHASH, (SubLObject)at_macros.$kw101$CALLS, meter_cache), (SubLObject)at_macros.$list102), ConsesLow.listS((SubLObject)at_macros.$sym99$CSETF, (SubLObject)ConsesLow.list((SubLObject)at_macros.$sym100$GETHASH, (SubLObject)at_macros.$kw103$TIMES, meter_cache), (SubLObject)at_macros.$list104), ConsesLow.listS((SubLObject)at_macros.$sym99$CSETF, (SubLObject)ConsesLow.list((SubLObject)at_macros.$sym100$GETHASH, (SubLObject)at_macros.$kw105$RESULTS, meter_cache), (SubLObject)at_macros.$list104), ConsesLow.listS((SubLObject)at_macros.$sym99$CSETF, (SubLObject)ConsesLow.list((SubLObject)at_macros.$sym100$GETHASH, (SubLObject)at_macros.$kw106$ARGS, meter_cache), (SubLObject)at_macros.$list104), ConsesLow.list((SubLObject)at_macros.$sym107$SETHASH, (SubLObject)at_macros.$kw108$ARG_LIST, meter_cache, (SubLObject)ConsesLow.list((SubLObject)at_macros.$sym88$QUOTE, args)), ConsesLow.list((SubLObject)at_macros.$sym107$SETHASH, (SubLObject)at_macros.$kw109$FUNCTION, meter_cache, (SubLObject)ConsesLow.list((SubLObject)at_macros.$sym88$QUOTE, name)), at_macros.$list110 }), ConsesLow.list(reset_function), ConsesLow.list((SubLObject)at_macros.$sym107$SETHASH, (SubLObject)at_macros.$kw111$RESET, meter_cache, (SubLObject)ConsesLow.list((SubLObject)at_macros.$sym88$QUOTE, reset_function)), ConsesLow.listS((SubLObject)at_macros.$sym98$DEFINE, metered_function, arg_list, ConsesLow.append(body, (SubLObject)at_macros.NIL)), ConsesLow.list((SubLObject)at_macros.$sym112$CDOLIST, (SubLObject)at_macros.$list113, (SubLObject)ConsesLow.listS((SubLObject)at_macros.$sym34$PWHEN, (SubLObject)ConsesLow.listS((SubLObject)at_macros.EQ, (SubLObject)ConsesLow.list((SubLObject)at_macros.$sym88$QUOTE, name), (SubLObject)at_macros.$list114), (SubLObject)at_macros.$list115)), ConsesLow.listS((SubLObject)at_macros.$sym116$CPUSH, meter_cache, (SubLObject)at_macros.$list117), ConsesLow.list((SubLObject)at_macros.$sym98$DEFINE, name, arg_list, (SubLObject)ConsesLow.list((SubLObject)at_macros.$sym118$PIF, (SubLObject)at_macros.$sym119$_DEFN_METERS__, (SubLObject)ConsesLow.listS((SubLObject)at_macros.$sym0$CLET, new SubLObject[] { at_macros.$list120, ConsesLow.list((SubLObject)at_macros.$sym121$CTIME, (SubLObject)at_macros.$sym122$RUN_TIME, (SubLObject)ConsesLow.list((SubLObject)at_macros.$sym23$CSETQ, (SubLObject)at_macros.$sym123$RESULT, reader.bq_cons(metered_function, ConsesLow.append(args, (SubLObject)at_macros.NIL)))), ConsesLow.list((SubLObject)at_macros.$sym124$CINC, (SubLObject)ConsesLow.list((SubLObject)at_macros.$sym100$GETHASH, (SubLObject)at_macros.$kw101$CALLS, meter_cache)), ConsesLow.list((SubLObject)at_macros.$sym116$CPUSH, (SubLObject)at_macros.$sym122$RUN_TIME, (SubLObject)ConsesLow.list((SubLObject)at_macros.$sym100$GETHASH, (SubLObject)at_macros.$kw103$TIMES, meter_cache)), ConsesLow.list((SubLObject)at_macros.$sym116$CPUSH, (SubLObject)at_macros.$sym123$RESULT, (SubLObject)ConsesLow.list((SubLObject)at_macros.$sym100$GETHASH, (SubLObject)at_macros.$kw105$RESULTS, meter_cache)), ConsesLow.list((SubLObject)at_macros.$sym116$CPUSH, reader.bq_cons((SubLObject)at_macros.$sym125$LIST, ConsesLow.append(args, (SubLObject)at_macros.NIL)), (SubLObject)ConsesLow.list((SubLObject)at_macros.$sym100$GETHASH, (SubLObject)at_macros.$kw106$ARGS, meter_cache)), at_macros.$list126 }), (SubLObject)ConsesLow.list((SubLObject)at_macros.$sym127$RET, reader.bq_cons(metered_function, ConsesLow.append(args, (SubLObject)at_macros.NIL))))) });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-macros.lisp", position = 11138L)
    public static SubLObject do_all_top_level_arg_constraints(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)at_macros.$list128);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject constraint_var = (SubLObject)at_macros.NIL;
        SubLObject formula = (SubLObject)at_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)at_macros.$list128);
        constraint_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)at_macros.$list128);
        formula = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)at_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)at_macros.NIL;
        SubLObject current_$1 = (SubLObject)at_macros.NIL;
        while (at_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)at_macros.$list128);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)at_macros.$list128);
            if (at_macros.NIL == conses_high.member(current_$1, (SubLObject)at_macros.$list129, (SubLObject)at_macros.UNPROVIDED, (SubLObject)at_macros.UNPROVIDED)) {
                bad = (SubLObject)at_macros.T;
            }
            if (current_$1 == at_macros.$kw130$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (at_macros.NIL != bad && at_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)at_macros.$list128);
        }
        final SubLObject done_var_tail = cdestructuring_bind.property_list_member((SubLObject)at_macros.$kw131$DONE_VAR, current);
        final SubLObject done_var = (SubLObject)((at_macros.NIL != done_var_tail) ? conses_high.cadr(done_var_tail) : at_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject all_arg_constraints = (SubLObject)at_macros.$sym132$ALL_ARG_CONSTRAINTS;
        return (SubLObject)ConsesLow.list((SubLObject)at_macros.$sym0$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(all_arg_constraints, (SubLObject)ConsesLow.list((SubLObject)at_macros.$sym133$DTLAC_LIST_GENERATOR, formula))), (SubLObject)ConsesLow.listS((SubLObject)at_macros.$sym134$CSOME, (SubLObject)ConsesLow.list(constraint_var, all_arg_constraints, done_var), ConsesLow.append(body, (SubLObject)at_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-macros.lisp", position = 11676L)
    public static SubLObject dtlac_list_generator(final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)at_macros.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)at_macros.$sym136$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(at_macros.$const137$EverythingPSC, thread);
            result = arg_type.sorted_top_level_arg_constraints_on_formula(formula);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-macros.lisp", position = 11903L)
    public static SubLObject do_all_arg_constraints_inside_out(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)at_macros.$list128);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject constraint_var = (SubLObject)at_macros.NIL;
        SubLObject formula = (SubLObject)at_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)at_macros.$list128);
        constraint_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)at_macros.$list128);
        formula = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)at_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)at_macros.NIL;
        SubLObject current_$2 = (SubLObject)at_macros.NIL;
        while (at_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)at_macros.$list128);
            current_$2 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)at_macros.$list128);
            if (at_macros.NIL == conses_high.member(current_$2, (SubLObject)at_macros.$list129, (SubLObject)at_macros.UNPROVIDED, (SubLObject)at_macros.UNPROVIDED)) {
                bad = (SubLObject)at_macros.T;
            }
            if (current_$2 == at_macros.$kw130$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (at_macros.NIL != bad && at_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)at_macros.$list128);
        }
        final SubLObject done_var_tail = cdestructuring_bind.property_list_member((SubLObject)at_macros.$kw131$DONE_VAR, current);
        final SubLObject done_var = (SubLObject)((at_macros.NIL != done_var_tail) ? conses_high.cadr(done_var_tail) : at_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject all_arg_constraints = (SubLObject)at_macros.$sym138$ALL_ARG_CONSTRAINTS;
        return (SubLObject)ConsesLow.list((SubLObject)at_macros.$sym0$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(all_arg_constraints, (SubLObject)ConsesLow.list((SubLObject)at_macros.$sym139$DAACIO_LIST_GENERATOR, formula))), (SubLObject)ConsesLow.listS((SubLObject)at_macros.$sym134$CSOME, (SubLObject)ConsesLow.list(constraint_var, all_arg_constraints, done_var), ConsesLow.append(body, (SubLObject)at_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-macros.lisp", position = 12521L)
    public static SubLObject daacio_list_generator(final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)at_macros.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)at_macros.$sym136$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(at_macros.$const137$EverythingPSC, thread);
            result = arg_type.inside_out_arg_constraints_on_formula(formula);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-macros.lisp", position = 12744L)
    public static SubLObject gather_wff_violations(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)at_macros.$sym0$CLET, (SubLObject)at_macros.$list141, ConsesLow.append(body, (SubLObject)at_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-macros.lisp", position = 12979L)
    public static SubLObject dont_gather_wff_violations(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)at_macros.$sym0$CLET, (SubLObject)at_macros.$list142, ConsesLow.append(body, (SubLObject)at_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-macros.lisp", position = 13205L)
    public static SubLObject dont_gather_wff_violations_or_suggestions(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)at_macros.$sym0$CLET, (SubLObject)at_macros.$list143, ConsesLow.append(body, (SubLObject)at_macros.NIL));
    }
    
    public static SubLObject declare_at_macros_file() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.at_macros", "with_new_defn_space", "WITH-NEW-DEFN-SPACE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.at_macros", "with_possibly_new_defn_space", "WITH-POSSIBLY-NEW-DEFN-SPACE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_macros", "make_defn_fn_history_table", "MAKE-DEFN-FN-HISTORY-TABLE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_macros", "make_quoted_defn_fn_history_table", "MAKE-QUOTED-DEFN-FN-HISTORY-TABLE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_macros", "make_defn_col_history_table", "MAKE-DEFN-COL-HISTORY-TABLE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_macros", "make_quoted_defn_col_history_table", "MAKE-QUOTED-DEFN-COL-HISTORY-TABLE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_macros", "possibly_make_defn_fn_history_table", "POSSIBLY-MAKE-DEFN-FN-HISTORY-TABLE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_macros", "possibly_make_quoted_defn_fn_history_table", "POSSIBLY-MAKE-QUOTED-DEFN-FN-HISTORY-TABLE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_macros", "possibly_make_defn_col_history_table", "POSSIBLY-MAKE-DEFN-COL-HISTORY-TABLE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_macros", "possibly_make_quoted_defn_col_history_table", "POSSIBLY-MAKE-QUOTED-DEFN-COL-HISTORY-TABLE", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.at_macros", "with_at_defns", "WITH-AT-DEFNS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.at_macros", "with_at_defn", "WITH-AT-DEFN");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.at_macros", "with_at_functions", "WITH-AT-FUNCTIONS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.at_macros", "with_at_function", "WITH-AT-FUNCTION");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.at_macros", "with_at_result", "WITH-AT-RESULT");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.at_macros", "with_some_at_arg_isa_var", "WITH-SOME-AT-ARG-ISA-VAR");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.at_macros", "with_at_mode", "WITH-AT-MODE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.at_macros", "with_at_ind_isa", "WITH-AT-IND-ISA");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.at_macros", "with_at_ind_genl", "WITH-AT-IND-GENL");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.at_macros", "with_at_pred", "WITH-AT-PRED");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.at_macros", "with_at_inverse", "WITH-AT-INVERSE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.at_macros", "with_at_mapping_inverses", "WITH-AT-MAPPING-INVERSES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.at_macros", "with_at_reln", "WITH-AT-RELN");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.at_macros", "with_at_arg", "WITH-AT-ARG");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.at_macros", "with_at_type", "WITH-AT-TYPE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.at_macros", "with_at_argnum", "WITH-AT-ARGNUM");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.at_macros", "with_at_ind_arg", "WITH-AT-IND-ARG");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.at_macros", "with_at_ind_argnum", "WITH-AT-IND-ARGNUM");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.at_macros", "with_at_arg_isa", "WITH-AT-ARG-ISA");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.at_macros", "with_at_base_fn", "WITH-AT-BASE-FN");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.at_macros", "with_at_source", "WITH-AT-SOURCE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.at_macros", "with_at_constraint_gaf", "WITH-AT-CONSTRAINT-GAF");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.at_macros", "at_test", "AT-TEST");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.at_macros", "at_trace", "AT-TRACE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.at_macros", "defn_test", "DEFN-TEST");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.at_macros", "defn_trace", "DEFN-TRACE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.at_macros", "gathering_at_constraints", "GATHERING-AT-CONSTRAINTS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.at_macros", "gathering_at_assertions", "GATHERING-AT-ASSERTIONS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.at_macros", "gathering_at_format_violations", "GATHERING-AT-FORMAT-VIOLATIONS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.at_macros", "gathering_at_different_violations", "GATHERING-AT-DIFFERENT-VIOLATIONS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.at_macros", "gathering_at_predicate_violations", "GATHERING-AT-PREDICATE-VIOLATIONS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.at_macros", "until_at_mapping_finished", "UNTIL-AT-MAPPING-FINISHED");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.at_macros", "declare_collection_specific_defn", "DECLARE-COLLECTION-SPECIFIC-DEFN");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.at_macros", "define_defn_metered", "DEFINE-DEFN-METERED");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.at_macros", "do_all_top_level_arg_constraints", "DO-ALL-TOP-LEVEL-ARG-CONSTRAINTS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_macros", "dtlac_list_generator", "DTLAC-LIST-GENERATOR", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.at_macros", "do_all_arg_constraints_inside_out", "DO-ALL-ARG-CONSTRAINTS-INSIDE-OUT");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_macros", "daacio_list_generator", "DAACIO-LIST-GENERATOR", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.at_macros", "gather_wff_violations", "GATHER-WFF-VIOLATIONS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.at_macros", "dont_gather_wff_violations", "DONT-GATHER-WFF-VIOLATIONS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.at_macros", "dont_gather_wff_violations_or_suggestions", "DONT-GATHER-WFF-VIOLATIONS-OR-SUGGESTIONS");
        return (SubLObject)at_macros.NIL;
    }
    
    public static SubLObject init_at_macros_file() {
        return (SubLObject)at_macros.NIL;
    }
    
    public static SubLObject setup_at_macros_file() {
        access_macros.register_macro_helper((SubLObject)at_macros.$sym5$MAKE_DEFN_FN_HISTORY_TABLE, (SubLObject)at_macros.$sym6$WITH_NEW_DEFN_SPACE);
        access_macros.register_macro_helper((SubLObject)at_macros.$sym7$MAKE_QUOTED_DEFN_FN_HISTORY_TABLE, (SubLObject)at_macros.$sym6$WITH_NEW_DEFN_SPACE);
        access_macros.register_macro_helper((SubLObject)at_macros.$sym8$MAKE_DEFN_COL_HISTORY_TABLE, (SubLObject)at_macros.$sym6$WITH_NEW_DEFN_SPACE);
        access_macros.register_macro_helper((SubLObject)at_macros.$sym9$MAKE_QUOTED_DEFN_COL_HISTORY_TABLE, (SubLObject)at_macros.$sym6$WITH_NEW_DEFN_SPACE);
        access_macros.register_macro_helper((SubLObject)at_macros.$sym10$POSSIBLY_MAKE_DEFN_FN_HISTORY_TABLE, (SubLObject)at_macros.$sym11$WITH_POSSIBLY_NEW_DEFN_SPACE);
        access_macros.register_macro_helper((SubLObject)at_macros.$sym12$POSSIBLY_MAKE_QUOTED_DEFN_FN_HISTORY_TABLE, (SubLObject)at_macros.$sym11$WITH_POSSIBLY_NEW_DEFN_SPACE);
        access_macros.register_macro_helper((SubLObject)at_macros.$sym13$POSSIBLY_MAKE_DEFN_COL_HISTORY_TABLE, (SubLObject)at_macros.$sym11$WITH_POSSIBLY_NEW_DEFN_SPACE);
        access_macros.register_macro_helper((SubLObject)at_macros.$sym14$POSSIBLY_MAKE_QUOTED_DEFN_COL_HISTORY_TABLE, (SubLObject)at_macros.$sym11$WITH_POSSIBLY_NEW_DEFN_SPACE);
        access_macros.register_macro_helper((SubLObject)at_macros.$sym133$DTLAC_LIST_GENERATOR, (SubLObject)at_macros.$sym135$DO_ALL_TOP_LEVEL_ARG_CONSTRAINTS);
        access_macros.register_macro_helper((SubLObject)at_macros.$sym139$DAACIO_LIST_GENERATOR, (SubLObject)at_macros.$sym140$DO_ALL_ARG_CONSTRAINTS_INSIDE_OUT);
        return (SubLObject)at_macros.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_at_macros_file();
    }
    
    @Override
	public void initializeVariables() {
        init_at_macros_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_at_macros_file();
    }
    
    static {
        me = (SubLFile)new at_macros();
        $sym0$CLET = SubLObjectFactory.makeSymbol("CLET");
        $list1 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*DEFN-FN-HISTORY*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAKE-DEFN-FN-HISTORY-TABLE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*QUOTED-DEFN-FN-HISTORY*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAKE-QUOTED-DEFN-FN-HISTORY-TABLE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*DEFN-COL-HISTORY*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAKE-DEFN-COL-HISTORY-TABLE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*QUOTED-DEFN-COL-HISTORY*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAKE-QUOTED-DEFN-COL-HISTORY-TABLE"))));
        $sym2$CUNWIND_PROTECT = SubLObjectFactory.makeSymbol("CUNWIND-PROTECT");
        $list3 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLEAR-DEFN-SPACE")));
        $list4 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*DEFN-FN-HISTORY*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("POSSIBLY-MAKE-DEFN-FN-HISTORY-TABLE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*QUOTED-DEFN-FN-HISTORY*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("POSSIBLY-MAKE-QUOTED-DEFN-FN-HISTORY-TABLE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*DEFN-COL-HISTORY*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("POSSIBLY-MAKE-DEFN-COL-HISTORY-TABLE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*QUOTED-DEFN-COL-HISTORY*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("POSSIBLY-MAKE-QUOTED-DEFN-COL-HISTORY-TABLE"))));
        $sym5$MAKE_DEFN_FN_HISTORY_TABLE = SubLObjectFactory.makeSymbol("MAKE-DEFN-FN-HISTORY-TABLE");
        $sym6$WITH_NEW_DEFN_SPACE = SubLObjectFactory.makeSymbol("WITH-NEW-DEFN-SPACE");
        $sym7$MAKE_QUOTED_DEFN_FN_HISTORY_TABLE = SubLObjectFactory.makeSymbol("MAKE-QUOTED-DEFN-FN-HISTORY-TABLE");
        $sym8$MAKE_DEFN_COL_HISTORY_TABLE = SubLObjectFactory.makeSymbol("MAKE-DEFN-COL-HISTORY-TABLE");
        $sym9$MAKE_QUOTED_DEFN_COL_HISTORY_TABLE = SubLObjectFactory.makeSymbol("MAKE-QUOTED-DEFN-COL-HISTORY-TABLE");
        $sym10$POSSIBLY_MAKE_DEFN_FN_HISTORY_TABLE = SubLObjectFactory.makeSymbol("POSSIBLY-MAKE-DEFN-FN-HISTORY-TABLE");
        $sym11$WITH_POSSIBLY_NEW_DEFN_SPACE = SubLObjectFactory.makeSymbol("WITH-POSSIBLY-NEW-DEFN-SPACE");
        $sym12$POSSIBLY_MAKE_QUOTED_DEFN_FN_HISTORY_TABLE = SubLObjectFactory.makeSymbol("POSSIBLY-MAKE-QUOTED-DEFN-FN-HISTORY-TABLE");
        $sym13$POSSIBLY_MAKE_DEFN_COL_HISTORY_TABLE = SubLObjectFactory.makeSymbol("POSSIBLY-MAKE-DEFN-COL-HISTORY-TABLE");
        $sym14$POSSIBLY_MAKE_QUOTED_DEFN_COL_HISTORY_TABLE = SubLObjectFactory.makeSymbol("POSSIBLY-MAKE-QUOTED-DEFN-COL-HISTORY-TABLE");
        $list15 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEFNS"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym16$_AT_DEFNS_ = SubLObjectFactory.makeSymbol("*AT-DEFNS*");
        $list17 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEFN"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym18$_AT_DEFN_ = SubLObjectFactory.makeSymbol("*AT-DEFN*");
        $sym19$_AT_FUNCTIONS_ = SubLObjectFactory.makeSymbol("*AT-FUNCTIONS*");
        $sym20$_AT_FUNCTION_ = SubLObjectFactory.makeSymbol("*AT-FUNCTION*");
        $list21 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RESULT-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list22 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*AT-RESULT*"));
        $sym23$CSETQ = SubLObjectFactory.makeSymbol("CSETQ");
        $list24 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BOOLEAN-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list25 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*AT-SOME-ARG-ISA?*"));
        $list26 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MODE"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym27$_AT_MODE_ = SubLObjectFactory.makeSymbol("*AT-MODE*");
        $list28 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COL"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym29$_AT_IND_ISA_ = SubLObjectFactory.makeSymbol("*AT-IND-ISA*");
        $list30 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym31$_AT_IND_GENL_ = SubLObjectFactory.makeSymbol("*AT-IND-GENL*");
        $list32 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONSTRAINT-PRED"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym33$_AT_PRED_ = SubLObjectFactory.makeSymbol("*AT-PRED*");
        $sym34$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
        $sym35$_AT_INVERSE_ = SubLObjectFactory.makeSymbol("*AT-INVERSE*");
        $list36 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)SubLObjectFactory.makeSymbol("*AT-CHECK-GENL-INVERSES?*"), (SubLObject)SubLObjectFactory.makeSymbol("*AT-INVERSE*"));
        $list37 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*AT-MAPPING-GENL-INVERSES?*"), (SubLObject)at_macros.T));
        $list38 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RELN"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym39$GENL_SOMETHING_ = SubLObjectFactory.makeUninternedSymbol("GENL-SOMETHING?");
        $sym40$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $sym41$FWHEN = SubLObjectFactory.makeSymbol("FWHEN");
        $sym42$FORT_P = SubLObjectFactory.makeSymbol("FORT-P");
        $sym43$COR = SubLObjectFactory.makeSymbol("COR");
        $sym44$GENL_PREDICATES = SubLObjectFactory.makeSymbol("GENL-PREDICATES");
        $sym45$GENL_INVERSES = SubLObjectFactory.makeSymbol("GENL-INVERSES");
        $sym46$_AT_RELN_ = SubLObjectFactory.makeSymbol("*AT-RELN*");
        $sym47$_AT_SEARCH_GENL_PREDS__ = SubLObjectFactory.makeSymbol("*AT-SEARCH-GENL-PREDS?*");
        $sym48$CAND = SubLObjectFactory.makeSymbol("CAND");
        $sym49$_AT_CHECK_GENL_PREDS__ = SubLObjectFactory.makeSymbol("*AT-CHECK-GENL-PREDS?*");
        $sym50$_AT_SEARCH_GENL_INVERSES__ = SubLObjectFactory.makeSymbol("*AT-SEARCH-GENL-INVERSES?*");
        $sym51$_AT_CHECK_GENL_INVERSES__ = SubLObjectFactory.makeSymbol("*AT-CHECK-GENL-INVERSES?*");
        $sym52$_AT_ARG_ = SubLObjectFactory.makeSymbol("*AT-ARG*");
        $list53 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym54$_AT_ARG_TYPE_ = SubLObjectFactory.makeSymbol("*AT-ARG-TYPE*");
        $list55 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INTEGER"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym56$CHECK_TYPE = SubLObjectFactory.makeSymbol("CHECK-TYPE");
        $list57 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INTEGERP"));
        $sym58$_AT_ARGNUM_ = SubLObjectFactory.makeSymbol("*AT-ARGNUM*");
        $sym59$_AT_IND_ARG_ = SubLObjectFactory.makeSymbol("*AT-IND-ARG*");
        $sym60$_AT_IND_ARGNUM_ = SubLObjectFactory.makeSymbol("*AT-IND-ARGNUM*");
        $list61 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COLLECTION"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list62 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORT-P"));
        $sym63$_AT_ARG_ISA_ = SubLObjectFactory.makeSymbol("*AT-ARG-ISA*");
        $list64 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FN"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list65 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION-SPEC-P"));
        $sym66$_AT_BASE_FN_ = SubLObjectFactory.makeSymbol("*AT-BASE-FN*");
        $sym67$_AT_SOURCE_ = SubLObjectFactory.makeSymbol("*AT-SOURCE*");
        $list68 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GAF"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym69$_AT_CONSTRAINT_GAF_ = SubLObjectFactory.makeSymbol("*AT-CONSTRAINT-GAF*");
        $list70 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEVEL"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym71$__ = SubLObjectFactory.makeSymbol(">=");
        $sym72$_AT_TEST_LEVEL_ = SubLObjectFactory.makeSymbol("*AT-TEST-LEVEL*");
        $sym73$_AT_TRACE_LEVEL_ = SubLObjectFactory.makeSymbol("*AT-TRACE-LEVEL*");
        $sym74$_DEFN_TEST_LEVEL_ = SubLObjectFactory.makeSymbol("*DEFN-TEST-LEVEL*");
        $sym75$_DEFN_TRACE_LEVEL_ = SubLObjectFactory.makeSymbol("*DEFN-TRACE-LEVEL*");
        $list76 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*GATHER-AT-CONSTRAINTS?*"), (SubLObject)at_macros.T));
        $list77 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLRHASH"), (SubLObject)SubLObjectFactory.makeSymbol("*AT-ISA-CONSTRAINTS*")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLRHASH"), (SubLObject)SubLObjectFactory.makeSymbol("*AT-GENL-CONSTRAINTS*")));
        $list78 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*GATHER-AT-ASSERTIONS?*"), (SubLObject)at_macros.T));
        $list79 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLRHASH"), (SubLObject)SubLObjectFactory.makeSymbol("*AT-ISA-ASSERTIONS*")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLRHASH"), (SubLObject)SubLObjectFactory.makeSymbol("*AT-GENL-ASSERTIONS*")));
        $list80 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*GATHER-AT-FORMAT-VIOLATIONS?*"), (SubLObject)at_macros.T), (SubLObject)SubLObjectFactory.makeSymbol("*AT-FORMAT-VIOLATIONS*"));
        $list81 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*GATHER-AT-DIFFERENT-VIOLATIONS?*"), (SubLObject)at_macros.T), (SubLObject)SubLObjectFactory.makeSymbol("*AT-DIFFERENT-VIOLATIONS*"));
        $list82 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*GATHER-AT-PREDICATE-VIOLATIONS?*"), (SubLObject)at_macros.T), (SubLObject)SubLObjectFactory.makeSymbol("*AT-PREDICATE-VIOLATIONS*"));
        $sym83$CCATCH_IGNORE = SubLObjectFactory.makeSymbol("CCATCH-IGNORE");
        $kw84$AT_MAPPING_DONE = SubLObjectFactory.makeKeyword("AT-MAPPING-DONE");
        $list85 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*WITHIN-AT-MAPPING?*"), (SubLObject)at_macros.T));
        $list86 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SYMBOL"));
        $sym87$SYMBOLP = SubLObjectFactory.makeSymbol("SYMBOLP");
        $sym88$QUOTE = SubLObjectFactory.makeSymbol("QUOTE");
        $sym89$CPUSHNEW = SubLObjectFactory.makeSymbol("CPUSHNEW");
        $list90 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*AT-COLLECTION-SPECIFIC-DEFNS*"));
        $list91 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("ARG-LIST")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $str92$__a_METERS_ = SubLObjectFactory.makeString("*~a-METERS*");
        $str93$_a_METERED = SubLObjectFactory.makeString("~a-METERED");
        $str94$RESET__a_METERS = SubLObjectFactory.makeString("RESET-~a-METERS");
        $sym95$DEFVAR_DEFN = SubLObjectFactory.makeSymbol("DEFVAR-DEFN");
        $list96 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAKE-HASH-TABLE"), (SubLObject)at_macros.EIGHT_INTEGER);
        $str97$metering_cache_for_calls_to_defn_ = SubLObjectFactory.makeString("metering cache for calls to defn module function ~a");
        $sym98$DEFINE = SubLObjectFactory.makeSymbol("DEFINE");
        $sym99$CSETF = SubLObjectFactory.makeSymbol("CSETF");
        $sym100$GETHASH = SubLObjectFactory.makeSymbol("GETHASH");
        $kw101$CALLS = SubLObjectFactory.makeKeyword("CALLS");
        $list102 = ConsesLow.list((SubLObject)at_macros.ZERO_INTEGER);
        $kw103$TIMES = SubLObjectFactory.makeKeyword("TIMES");
        $list104 = ConsesLow.list((SubLObject)at_macros.NIL);
        $kw105$RESULTS = SubLObjectFactory.makeKeyword("RESULTS");
        $kw106$ARGS = SubLObjectFactory.makeKeyword("ARGS");
        $sym107$SETHASH = SubLObjectFactory.makeSymbol("SETHASH");
        $kw108$ARG_LIST = SubLObjectFactory.makeKeyword("ARG-LIST");
        $kw109$FUNCTION = SubLObjectFactory.makeKeyword("FUNCTION");
        $list110 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)at_macros.NIL));
        $kw111$RESET = SubLObjectFactory.makeKeyword("RESET");
        $sym112$CDOLIST = SubLObjectFactory.makeSymbol("CDOLIST");
        $list113 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CACHE"), (SubLObject)SubLObjectFactory.makeSymbol("*DEFN-METER-CACHES*"));
        $list114 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GETHASH"), (SubLObject)SubLObjectFactory.makeKeyword("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("CACHE")));
        $list115 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("*DEFN-METER-CACHES*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DELETE"), (SubLObject)SubLObjectFactory.makeSymbol("CACHE"), (SubLObject)SubLObjectFactory.makeSymbol("*DEFN-METER-CACHES*"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLRHASH"), (SubLObject)SubLObjectFactory.makeSymbol("CACHE")));
        $sym116$CPUSH = SubLObjectFactory.makeSymbol("CPUSH");
        $list117 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*DEFN-METER-CACHES*"));
        $sym118$PIF = SubLObjectFactory.makeSymbol("PIF");
        $sym119$_DEFN_METERS__ = SubLObjectFactory.makeSymbol("*DEFN-METERS?*");
        $list120 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RESULT"), (SubLObject)SubLObjectFactory.makeSymbol("RUN-TIME"));
        $sym121$CTIME = SubLObjectFactory.makeSymbol("CTIME");
        $sym122$RUN_TIME = SubLObjectFactory.makeSymbol("RUN-TIME");
        $sym123$RESULT = SubLObjectFactory.makeSymbol("RESULT");
        $sym124$CINC = SubLObjectFactory.makeSymbol("CINC");
        $sym125$LIST = SubLObjectFactory.makeSymbol("LIST");
        $list126 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT")));
        $sym127$RET = SubLObjectFactory.makeSymbol("RET");
        $list128 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONSTRAINT-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("FORMULA"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE-VAR")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list129 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONE-VAR"));
        $kw130$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw131$DONE_VAR = SubLObjectFactory.makeKeyword("DONE-VAR");
        $sym132$ALL_ARG_CONSTRAINTS = SubLObjectFactory.makeUninternedSymbol("ALL-ARG-CONSTRAINTS");
        $sym133$DTLAC_LIST_GENERATOR = SubLObjectFactory.makeSymbol("DTLAC-LIST-GENERATOR");
        $sym134$CSOME = SubLObjectFactory.makeSymbol("CSOME");
        $sym135$DO_ALL_TOP_LEVEL_ARG_CONSTRAINTS = SubLObjectFactory.makeSymbol("DO-ALL-TOP-LEVEL-ARG-CONSTRAINTS");
        $sym136$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const137$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $sym138$ALL_ARG_CONSTRAINTS = SubLObjectFactory.makeUninternedSymbol("ALL-ARG-CONSTRAINTS");
        $sym139$DAACIO_LIST_GENERATOR = SubLObjectFactory.makeSymbol("DAACIO-LIST-GENERATOR");
        $sym140$DO_ALL_ARG_CONSTRAINTS_INSIDE_OUT = SubLObjectFactory.makeSymbol("DO-ALL-ARG-CONSTRAINTS-INSIDE-OUT");
        $list141 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*NOTING-AT-VIOLATIONS?*"), (SubLObject)at_macros.T), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*ACCUMULATING-AT-VIOLATIONS?*"), (SubLObject)at_macros.T), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*NOTING-WFF-VIOLATIONS?*"), (SubLObject)at_macros.T), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*ACCUMULATING-WFF-VIOLATIONS?*"), (SubLObject)at_macros.T));
        $list142 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*NOTING-AT-VIOLATIONS?*"), (SubLObject)SubLObjectFactory.makeSymbol("*ACCUMULATING-AT-VIOLATIONS?*"), (SubLObject)SubLObjectFactory.makeSymbol("*NOTING-WFF-VIOLATIONS?*"), (SubLObject)SubLObjectFactory.makeSymbol("*ACCUMULATING-WFF-VIOLATIONS?*"));
        $list143 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*NOTING-AT-VIOLATIONS?*"), (SubLObject)SubLObjectFactory.makeSymbol("*ACCUMULATING-AT-VIOLATIONS?*"), (SubLObject)SubLObjectFactory.makeSymbol("*NOTING-WFF-VIOLATIONS?*"), (SubLObject)SubLObjectFactory.makeSymbol("*ACCUMULATING-WFF-VIOLATIONS?*"), (SubLObject)SubLObjectFactory.makeSymbol("*PROVIDE-WFF-SUGGESTIONS?*"));
    }
}

/*

	Total time: 260 ms
	
*/