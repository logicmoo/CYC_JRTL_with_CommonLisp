package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class kb_hl_supports_high extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.kb_hl_supports_high";
    public static final String myFingerPrint = "a2892ef968c17916d346dbdb58376b22508e749fb7d7a4a2c8432b2d184a3bbe";
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 8865L)
    public static SubLSymbol $unreify_kb_hl_supportsP$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 11485L)
    public static SubLSymbol $kb_hl_support_dump_id_table$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 29258L)
    public static SubLSymbol $tms_kb_hl_support_queue$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 33182L)
    public static SubLSymbol $debug_bootstrap_kb_hl_supports_seconds$;
    private static final SubLList $list0;
    private static final SubLList $list1;
    private static final SubLSymbol $kw2$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw3$DONE;
    private static final SubLSymbol $sym4$DO_LIST;
    private static final SubLSymbol $sym5$KB_KB_HL_SUPPORT_ARGUMENTS;
    private static final SubLList $list6;
    private static final SubLSymbol $sym7$DO_SET_CONTENTS;
    private static final SubLSymbol $sym8$KB_KB_HL_SUPPORT_DEPENDENTS;
    private static final SubLList $list9;
    private static final SubLSymbol $sym10$KB_HL_SUPPORT_JUSTIFICATION;
    private static final SubLList $list11;
    private static final SubLList $list12;
    private static final SubLSymbol $kw13$NUM;
    private static final SubLSymbol $kw14$PROGRESS_MESSAGE;
    private static final SubLString $str15$mapping_kb_hl_supports_for_sweep;
    private static final SubLSymbol $sym16$PIF;
    private static final SubLSymbol $sym17$POSITIVE_INTEGER_P;
    private static final SubLSymbol $sym18$PROGRESS_CSOME;
    private static final SubLSymbol $sym19$KB_HL_SUPPORTS_AROUND;
    private static final SubLList $list20;
    private static final SubLSymbol $sym21$DO_KB_HL_SUPPORTS;
    private static final SubLSymbol $sym22$KB_HL_SUPPORT_P;
    private static final SubLString $str23$Eliminating_invalid_KB_HL_support;
    private static final SubLSymbol $sym24$STRINGP;
    private static final SubLSymbol $kw25$SKIP;
    private static final SubLSymbol $sym26$VALID_DEDUCTION_;
    private static final SubLString $str27$Eliminating_KB_HL_supports_with_i;
    private static final SubLSymbol $sym28$POSSIBLY_REIFY_HL_SUPPORT;
    private static final SubLSymbol $sym29$UNREIFY_KB_HL_SUPPORT;
    private static final SubLSymbol $sym30$TRUE;
    private static final SubLInteger $int31$500;
    private static final SubLSymbol $sym32$NON_NEGATIVE_INTEGER_P;
    private static final SubLInteger $int33$100;
    private static final SubLSymbol $sym34$FIND_KB_HL_SUPPORT_BY_ID;
    private static final SubLSymbol $sym35$CLET;
    private static final SubLList $list36;
    private static final SubLSymbol $sym37$SUPPORT_P;
    private static final SubLString $str38$Verifying_KB_HL_support_indexing;
    private static final SubLString $str39$Searching_for_circular_KB_HL_supp;
    private static final SubLString $str40$Searching_for_duplicate_KB_HL_sup;
    private static final SubLSymbol $sym41$_;
    private static final SubLSymbol $sym42$KB_HL_SUPPORT_ID;
    private static final SubLString $str43$Searching_for_KB_HL_supports_with;
    private static final SubLString $str44$Searching_for_KB_HL_supports_with;
    private static final SubLString $str45$Searching_for_KB_HL_supports_with;
    private static final SubLString $str46$Searching_for_KB_HL_supports_with;
    private static final SubLSymbol $sym47$CATCH_ERROR_MESSAGE_HANDLER;
    private static final SubLString $str48$Verifying_KB_HL_supports;
    private static final SubLString $str49$__Error_during_KB_HL_support_veri;
    private static final SubLString $str50$__Error_during_indexing_verificat;
    private static final SubLString $str51$__The_following_KB_HL_supports_we;
    private static final SubLString $str52$__s__s__;
    private static final SubLString $str53$___s_KB_HL_supports_are_not_finda;
    private static final SubLString $str54$__Error_during_non_circularity_ve;
    private static final SubLString $str55$__The_following_KB_HL_supports_ar;
    private static final SubLString $str56$___s_KB_HL_supports_are_circular_;
    private static final SubLString $str57$__Error_during_uniqueness_verific;
    private static final SubLString $str58$__The_following_KB_HL_supports_ha;
    private static final SubLString $str59$___s_KB_HL_supports_have_duplicat;
    private static final SubLString $str60$__Error_during_dependent_verifica;
    private static final SubLString $str61$__The_following_KB_HL_supports_ha;
    private static final SubLString $str62$___s_KB_HL_supports_have_invalid_;
    private static final SubLString $str63$__Error_during_argument_verificat;
    private static final SubLString $str64$__The_following_KB_HL_supports_ha;
    private static final SubLString $str65$___s_KB_HL_supports_have_invalid_;
    private static final SubLString $str66$__Error_during_HL_support_verific;
    private static final SubLString $str67$__The_following_KB_HL_supports_ha;
    private static final SubLString $str68$___s_KB_HL_supports_have_invalid_;
    private static final SubLString $str69$__Error_during_KB_HL_support_back;
    private static final SubLString $str70$__The_following_KB_HL_supports_ha;
    private static final SubLString $str71$___s_KB_HL_supports_have_missing_;
    private static final SubLSymbol $sym72$ENQUEUEING_KB_HL_SUPPORTS_FOR_TMS_;
    private static final SubLSymbol $sym73$WITH_KB_HL_SUPPORT_REJUSTIFICATION;
    private static final SubLList $list74;
    private static final SubLSymbol $sym75$PROGN;
    private static final SubLList $list76;
    private static final SubLList $list77;
    private static final SubLSymbol $sym78$PROCESS_TMS_KB_HL_SUPPORT_QUEUE;
    private static final SubLSymbol $sym79$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__;
    private static final SubLList $list80;
    private static final SubLSymbol $sym81$CSETQ;
    private static final SubLString $str82$_A;
    private static final SubLSymbol $kw83$UNJUSTIFIABLE;
    private static final SubLSymbol $sym84$TMS_FORT_TO_KILL_;
    private static final SubLString $str85$Bootstrapping_KB_HL_supports;
    private static final SubLString $str86$Slow_reification_of_;
    private static final SubLString $str87$Could_not_create_KB_HL_support_fo;
    private static final SubLString $str88$Created_invalid_KB_HL_support_for;
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 937L)
    public static SubLObject do_kb_hl_support_arguments(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_hl_supports_high.$list0);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject argument_var = (SubLObject)kb_hl_supports_high.NIL;
        SubLObject kb_hl_support = (SubLObject)kb_hl_supports_high.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_hl_supports_high.$list0);
        argument_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_hl_supports_high.$list0);
        kb_hl_support = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)kb_hl_supports_high.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)kb_hl_supports_high.NIL;
        SubLObject current_$1 = (SubLObject)kb_hl_supports_high.NIL;
        while (kb_hl_supports_high.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_hl_supports_high.$list0);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_hl_supports_high.$list0);
            if (kb_hl_supports_high.NIL == conses_high.member(current_$1, (SubLObject)kb_hl_supports_high.$list1, (SubLObject)kb_hl_supports_high.UNPROVIDED, (SubLObject)kb_hl_supports_high.UNPROVIDED)) {
                bad = (SubLObject)kb_hl_supports_high.T;
            }
            if (current_$1 == kb_hl_supports_high.$kw2$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (kb_hl_supports_high.NIL != bad && kb_hl_supports_high.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_hl_supports_high.$list0);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)kb_hl_supports_high.$kw3$DONE, current);
        final SubLObject done = (SubLObject)((kb_hl_supports_high.NIL != done_tail) ? conses_high.cadr(done_tail) : kb_hl_supports_high.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.listS((SubLObject)kb_hl_supports_high.$sym4$DO_LIST, (SubLObject)ConsesLow.list(argument_var, (SubLObject)ConsesLow.list((SubLObject)kb_hl_supports_high.$sym5$KB_KB_HL_SUPPORT_ARGUMENTS, kb_hl_support), (SubLObject)kb_hl_supports_high.$kw3$DONE, done), ConsesLow.append(body, (SubLObject)kb_hl_supports_high.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 1168L)
    public static SubLObject do_kb_hl_support_dependents(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_hl_supports_high.$list6);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject dependent_var = (SubLObject)kb_hl_supports_high.NIL;
        SubLObject kb_hl_support = (SubLObject)kb_hl_supports_high.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_hl_supports_high.$list6);
        dependent_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_hl_supports_high.$list6);
        kb_hl_support = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)kb_hl_supports_high.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)kb_hl_supports_high.NIL;
        SubLObject current_$2 = (SubLObject)kb_hl_supports_high.NIL;
        while (kb_hl_supports_high.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_hl_supports_high.$list6);
            current_$2 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_hl_supports_high.$list6);
            if (kb_hl_supports_high.NIL == conses_high.member(current_$2, (SubLObject)kb_hl_supports_high.$list1, (SubLObject)kb_hl_supports_high.UNPROVIDED, (SubLObject)kb_hl_supports_high.UNPROVIDED)) {
                bad = (SubLObject)kb_hl_supports_high.T;
            }
            if (current_$2 == kb_hl_supports_high.$kw2$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (kb_hl_supports_high.NIL != bad && kb_hl_supports_high.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_hl_supports_high.$list6);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)kb_hl_supports_high.$kw3$DONE, current);
        final SubLObject done = (SubLObject)((kb_hl_supports_high.NIL != done_tail) ? conses_high.cadr(done_tail) : kb_hl_supports_high.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.listS((SubLObject)kb_hl_supports_high.$sym7$DO_SET_CONTENTS, (SubLObject)ConsesLow.list(dependent_var, (SubLObject)ConsesLow.list((SubLObject)kb_hl_supports_high.$sym8$KB_KB_HL_SUPPORT_DEPENDENTS, kb_hl_support), (SubLObject)kb_hl_supports_high.$kw3$DONE, done), ConsesLow.append(body, (SubLObject)kb_hl_supports_high.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 1379L)
    public static SubLObject do_kb_hl_support_supports(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_hl_supports_high.$list9);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject support_var = (SubLObject)kb_hl_supports_high.NIL;
        SubLObject kb_hl_support = (SubLObject)kb_hl_supports_high.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_hl_supports_high.$list9);
        support_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_hl_supports_high.$list9);
        kb_hl_support = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)kb_hl_supports_high.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)kb_hl_supports_high.NIL;
        SubLObject current_$3 = (SubLObject)kb_hl_supports_high.NIL;
        while (kb_hl_supports_high.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_hl_supports_high.$list9);
            current_$3 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_hl_supports_high.$list9);
            if (kb_hl_supports_high.NIL == conses_high.member(current_$3, (SubLObject)kb_hl_supports_high.$list1, (SubLObject)kb_hl_supports_high.UNPROVIDED, (SubLObject)kb_hl_supports_high.UNPROVIDED)) {
                bad = (SubLObject)kb_hl_supports_high.T;
            }
            if (current_$3 == kb_hl_supports_high.$kw2$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (kb_hl_supports_high.NIL != bad && kb_hl_supports_high.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_hl_supports_high.$list9);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)kb_hl_supports_high.$kw3$DONE, current);
        final SubLObject done = (SubLObject)((kb_hl_supports_high.NIL != done_tail) ? conses_high.cadr(done_tail) : kb_hl_supports_high.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.listS((SubLObject)kb_hl_supports_high.$sym4$DO_LIST, (SubLObject)ConsesLow.list(support_var, (SubLObject)ConsesLow.list((SubLObject)kb_hl_supports_high.$sym10$KB_HL_SUPPORT_JUSTIFICATION, kb_hl_support), (SubLObject)kb_hl_supports_high.$kw3$DONE, done), ConsesLow.append(body, (SubLObject)kb_hl_supports_high.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 1576L)
    public static SubLObject do_recent_kb_hl_supports(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_hl_supports_high.$list11);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)kb_hl_supports_high.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_hl_supports_high.$list11);
        var = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)kb_hl_supports_high.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)kb_hl_supports_high.NIL;
        SubLObject current_$4 = (SubLObject)kb_hl_supports_high.NIL;
        while (kb_hl_supports_high.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_hl_supports_high.$list11);
            current_$4 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_hl_supports_high.$list11);
            if (kb_hl_supports_high.NIL == conses_high.member(current_$4, (SubLObject)kb_hl_supports_high.$list12, (SubLObject)kb_hl_supports_high.UNPROVIDED, (SubLObject)kb_hl_supports_high.UNPROVIDED)) {
                bad = (SubLObject)kb_hl_supports_high.T;
            }
            if (current_$4 == kb_hl_supports_high.$kw2$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (kb_hl_supports_high.NIL != bad && kb_hl_supports_high.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_hl_supports_high.$list11);
        }
        final SubLObject num_tail = cdestructuring_bind.property_list_member((SubLObject)kb_hl_supports_high.$kw13$NUM, current);
        final SubLObject num = (SubLObject)((kb_hl_supports_high.NIL != num_tail) ? conses_high.cadr(num_tail) : kb_hl_supports_high.NIL);
        final SubLObject progress_message_tail = cdestructuring_bind.property_list_member((SubLObject)kb_hl_supports_high.$kw14$PROGRESS_MESSAGE, current);
        final SubLObject progress_message = (SubLObject)((kb_hl_supports_high.NIL != progress_message_tail) ? conses_high.cadr(progress_message_tail) : kb_hl_supports_high.$str15$mapping_kb_hl_supports_for_sweep);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)kb_hl_supports_high.$kw3$DONE, current);
        final SubLObject done = (SubLObject)((kb_hl_supports_high.NIL != done_tail) ? conses_high.cadr(done_tail) : kb_hl_supports_high.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.list((SubLObject)kb_hl_supports_high.$sym16$PIF, (SubLObject)ConsesLow.list((SubLObject)kb_hl_supports_high.$sym17$POSITIVE_INTEGER_P, num), (SubLObject)ConsesLow.listS((SubLObject)kb_hl_supports_high.$sym18$PROGRESS_CSOME, (SubLObject)ConsesLow.list(var, (SubLObject)ConsesLow.list((SubLObject)kb_hl_supports_high.$sym19$KB_HL_SUPPORTS_AROUND, (SubLObject)kb_hl_supports_high.$list20, num, num), progress_message, done), ConsesLow.append(body, (SubLObject)kb_hl_supports_high.NIL)), (SubLObject)ConsesLow.listS((SubLObject)kb_hl_supports_high.$sym21$DO_KB_HL_SUPPORTS, (SubLObject)ConsesLow.list(var, (SubLObject)kb_hl_supports_high.$kw14$PROGRESS_MESSAGE, progress_message, (SubLObject)kb_hl_supports_high.$kw3$DONE, done), ConsesLow.append(body, (SubLObject)kb_hl_supports_high.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 2199L)
    public static SubLObject create_kb_hl_support(final SubLObject hl_support, final SubLObject justification) {
        return kb_hl_supports_interface.kb_create_kb_hl_support(hl_support, justification);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 2409L)
    public static SubLObject find_kb_hl_support(final SubLObject hl_support) {
        return kb_hl_supports_interface.kb_lookup_kb_hl_support(hl_support);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 2503L)
    public static SubLObject find_kb_hl_supports_mentioning_term(final SubLObject v_term) {
        return kb_hl_supports_interface.kb_lookup_kb_hl_supports_mentioning_term(v_term);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 2619L)
    public static SubLObject find_or_create_kb_hl_support(final SubLObject hl_support, final SubLObject justification) {
        SubLObject kb_hl_support = find_kb_hl_support(hl_support);
        if (kb_hl_supports_high.NIL == kb_hl_support) {
            kb_hl_support = create_kb_hl_support(hl_support, justification);
        }
        return kb_hl_support;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 2963L)
    public static SubLObject find_or_possibly_create_kb_hl_support(final SubLObject hl_support) {
        SubLObject kb_hl_support = find_kb_hl_support(hl_support);
        if (kb_hl_supports_high.NIL == kb_hl_support) {
            kb_hl_support = possibly_create_kb_hl_support(hl_support);
        }
        return kb_hl_support;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 3213L)
    public static SubLObject possibly_create_kb_hl_support(final SubLObject hl_support) {
        final SubLObject justification = kb_hl_support_handles.hl_justify_for_kb_hl_support(hl_support);
        SubLObject kb_hl_support = (SubLObject)kb_hl_supports_high.NIL;
        if (kb_hl_supports_high.NIL != arguments.non_empty_hl_justification_p(justification)) {
            kb_hl_support = kb_hl_supports_interface.kb_create_kb_hl_support(hl_support, justification);
        }
        return kb_hl_support;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 3518L)
    public static SubLObject kb_hl_support_hl_support(final SubLObject kb_hl_support) {
        final SubLObject argument = kb_hl_supports_interface.kb_kb_hl_support_argument(kb_hl_support);
        SubLObject hl_support = (SubLObject)kb_hl_supports_high.NIL;
        if (kb_hl_supports_high.NIL != deduction_handles.deduction_p(argument)) {
            hl_support = deductions_high.deduction_supported_object(argument);
        }
        else if (kb_hl_supports_high.NIL != arguments.hl_support_p(argument)) {
            hl_support = argument;
        }
        return hl_support;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 3864L)
    public static SubLObject kb_hl_support_justification(final SubLObject kb_hl_support) {
        final SubLObject argument = kb_hl_supports_interface.kb_kb_hl_support_argument(kb_hl_support);
        SubLObject justification = (SubLObject)kb_hl_supports_high.NIL;
        if (kb_hl_supports_high.NIL != deduction_handles.deduction_p(argument)) {
            justification = deductions_high.deduction_supports(argument);
        }
        return justification;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 4125L)
    public static SubLObject kb_hl_support_module(final SubLObject kb_hl_support) {
        final SubLObject hl_support = kb_hl_support_hl_support(kb_hl_support);
        return (SubLObject)((kb_hl_supports_high.NIL != arguments.hl_support_p(hl_support)) ? arguments.hl_support_module(hl_support) : kb_hl_supports_high.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 4323L)
    public static SubLObject kb_hl_support_sentence(final SubLObject kb_hl_support) {
        final SubLObject hl_support = kb_hl_support_hl_support(kb_hl_support);
        return (SubLObject)((kb_hl_supports_high.NIL != arguments.hl_support_p(hl_support)) ? arguments.hl_support_sentence(hl_support) : kb_hl_supports_high.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 4525L)
    public static SubLObject kb_hl_support_mt(final SubLObject kb_hl_support) {
        final SubLObject hl_support = kb_hl_support_hl_support(kb_hl_support);
        return (SubLObject)((kb_hl_supports_high.NIL != arguments.hl_support_p(hl_support)) ? arguments.hl_support_mt(hl_support) : kb_hl_supports_high.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 4715L)
    public static SubLObject kb_hl_support_tv(final SubLObject kb_hl_support) {
        final SubLObject hl_support = kb_hl_support_hl_support(kb_hl_support);
        return (SubLObject)((kb_hl_supports_high.NIL != arguments.hl_support_p(hl_support)) ? arguments.hl_support_tv(hl_support) : kb_hl_supports_high.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 4905L)
    public static SubLObject kb_hl_support_el_sentence(final SubLObject kb_hl_support) {
        return cycl_utilities.hl_to_el(kb_hl_support_sentence(kb_hl_support));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 5023L)
    public static SubLObject kb_hl_support_ist_sentence(final SubLObject kb_hl_support) {
        final SubLObject sentence = kb_hl_support_sentence(kb_hl_support);
        return (kb_hl_supports_high.NIL != el_utilities.ist_sentence_p(sentence, (SubLObject)kb_hl_supports_high.UNPROVIDED)) ? sentence : el_utilities.make_ist_sentence(kb_hl_support_mt(kb_hl_support), sentence);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 5271L)
    public static SubLObject kb_hl_support_el_ist_sentence(final SubLObject kb_hl_support) {
        final SubLObject sentence = kb_hl_support_el_sentence(kb_hl_support);
        return (kb_hl_supports_high.NIL != el_utilities.ist_sentence_p(sentence, (SubLObject)kb_hl_supports_high.UNPROVIDED)) ? sentence : el_utilities.make_ist_sentence(kb_hl_support_mt(kb_hl_support), sentence);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 5525L)
    public static SubLObject kb_hl_support_elmt(final SubLObject kb_hl_support) {
        return cycl_utilities.hl_to_el(kb_hl_support_mt(kb_hl_support));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 5629L)
    public static SubLObject kb_hl_support_cons(final SubLObject kb_hl_support) {
        return el_utilities.elf_to_list(kb_hl_support_sentence(kb_hl_support));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 5742L)
    public static SubLObject kb_hl_support_justification_size(final SubLObject kb_hl_support) {
        assert kb_hl_supports_high.NIL != kb_hl_support_handles.kb_hl_support_p(kb_hl_support) : kb_hl_support;
        final SubLObject deduction = kb_hl_supports_interface.kb_kb_hl_support_argument(kb_hl_support);
        if (kb_hl_supports_high.NIL != deduction_handles.deduction_p(deduction)) {
            return Sequences.length(deductions_high.deduction_supports(deduction));
        }
        return (SubLObject)kb_hl_supports_high.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 6094L)
    public static SubLObject kb_hl_support_uselessP(final SubLObject kb_hl_support) {
        return (SubLObject)SubLObjectFactory.makeBoolean(kb_hl_supports_high.NIL == kb_hl_supports_low.kb_hl_support_has_dependentsP(kb_hl_support));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 6252L)
    public static SubLObject kb_hl_support_unjustifiedP(final SubLObject kb_hl_support) {
        final SubLObject argument = kb_hl_supports_interface.kb_kb_hl_support_argument(kb_hl_support);
        return (SubLObject)SubLObjectFactory.makeBoolean(kb_hl_supports_high.NIL == deduction_handles.valid_deductionP(argument, (SubLObject)kb_hl_supports_high.T));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 6426L)
    public static SubLObject should_remove_kb_hl_supportP(final SubLObject kb_hl_support) {
        return (SubLObject)SubLObjectFactory.makeBoolean(kb_hl_supports_high.NIL != kb_hl_support_unjustifiedP(kb_hl_support) || kb_hl_supports_high.NIL != kb_hl_support_uselessP(kb_hl_support));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 6599L)
    public static SubLObject possibly_remove_kb_hl_support(final SubLObject kb_hl_support) {
        SubLObject removedP = (SubLObject)kb_hl_supports_high.NIL;
        if (kb_hl_supports_high.NIL != should_remove_kb_hl_supportP(kb_hl_support)) {
            kb_hl_supports_interface.kb_remove_kb_hl_support(kb_hl_support);
            removedP = (SubLObject)kb_hl_supports_high.T;
        }
        return removedP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 6832L)
    public static SubLObject eliminate_kb_hl_supports_invalid_dependents(SubLObject robustP) {
        if (robustP == kb_hl_supports_high.UNPROVIDED) {
            robustP = (SubLObject)kb_hl_supports_high.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject removed_countP = (SubLObject)kb_hl_supports_high.ZERO_INTEGER;
        final SubLObject idx = kb_hl_support_handles.do_kb_hl_supports_table();
        final SubLObject mess = (SubLObject)kb_hl_supports_high.$str23$Eliminating_invalid_KB_HL_support;
        final SubLObject total = id_index.id_index_count(idx);
        SubLObject sofar = (SubLObject)kb_hl_supports_high.ZERO_INTEGER;
        assert kb_hl_supports_high.NIL != Types.stringp(mess) : mess;
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)kb_hl_supports_high.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kb_hl_supports_high.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kb_hl_supports_high.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(mess);
                final SubLObject idx_$5 = idx;
                if (kb_hl_supports_high.NIL == id_index.id_index_objects_empty_p(idx_$5, (SubLObject)kb_hl_supports_high.$kw25$SKIP)) {
                    final SubLObject idx_$6 = idx_$5;
                    if (kb_hl_supports_high.NIL == id_index.id_index_dense_objects_empty_p(idx_$6, (SubLObject)kb_hl_supports_high.$kw25$SKIP)) {
                        final SubLObject vector_var = id_index.id_index_dense_objects(idx_$6);
                        final SubLObject backwardP_var = (SubLObject)kb_hl_supports_high.NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject s_id;
                        SubLObject s_handle;
                        SubLObject kb_hl_support;
                        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)kb_hl_supports_high.NIL, v_iteration = (SubLObject)kb_hl_supports_high.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)kb_hl_supports_high.ONE_INTEGER)) {
                            s_id = ((kb_hl_supports_high.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)kb_hl_supports_high.ONE_INTEGER) : v_iteration);
                            s_handle = Vectors.aref(vector_var, s_id);
                            if (kb_hl_supports_high.NIL == id_index.id_index_tombstone_p(s_handle) || kb_hl_supports_high.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_hl_supports_high.$kw25$SKIP)) {
                                if (kb_hl_supports_high.NIL != id_index.id_index_tombstone_p(s_handle)) {
                                    s_handle = (SubLObject)kb_hl_supports_high.$kw25$SKIP;
                                }
                                kb_hl_support = kb_hl_support_handles.resolve_kb_hl_support_id_value_pair(s_id, s_handle);
                                removed_countP = Numbers.add(removed_countP, eliminate_kb_hl_support_invalid_dependents(kb_hl_support, robustP));
                                sofar = Numbers.add(sofar, (SubLObject)kb_hl_supports_high.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$7 = idx_$5;
                    if (kb_hl_supports_high.NIL == id_index.id_index_sparse_objects_empty_p(idx_$7) || kb_hl_supports_high.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_hl_supports_high.$kw25$SKIP)) {
                        final SubLObject sparse = id_index.id_index_sparse_objects(idx_$7);
                        SubLObject s_id2 = id_index.id_index_sparse_id_threshold(idx_$7);
                        final SubLObject end_id = id_index.id_index_next_id(idx_$7);
                        final SubLObject v_default = (SubLObject)((kb_hl_supports_high.NIL != id_index.id_index_skip_tombstones_p((SubLObject)kb_hl_supports_high.$kw25$SKIP)) ? kb_hl_supports_high.NIL : kb_hl_supports_high.$kw25$SKIP);
                        while (s_id2.numL(end_id)) {
                            final SubLObject s_handle2 = Hashtables.gethash_without_values(s_id2, sparse, v_default);
                            if (kb_hl_supports_high.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_hl_supports_high.$kw25$SKIP) || kb_hl_supports_high.NIL == id_index.id_index_tombstone_p(s_handle2)) {
                                final SubLObject kb_hl_support2 = kb_hl_support_handles.resolve_kb_hl_support_id_value_pair(s_id2, s_handle2);
                                removed_countP = Numbers.add(removed_countP, eliminate_kb_hl_support_invalid_dependents(kb_hl_support2, robustP));
                                sofar = Numbers.add(sofar, (SubLObject)kb_hl_supports_high.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                            s_id2 = Numbers.add(s_id2, (SubLObject)kb_hl_supports_high.ONE_INTEGER);
                        }
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$8 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_hl_supports_high.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$8, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return removed_countP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 7229L)
    public static SubLObject eliminate_kb_hl_support_invalid_dependents(final SubLObject kb_hl_support, SubLObject robustP) {
        if (robustP == kb_hl_supports_high.UNPROVIDED) {
            robustP = (SubLObject)kb_hl_supports_high.NIL;
        }
        final SubLObject dependents = kb_hl_supports_interface.kb_kb_hl_support_dependents(kb_hl_support);
        final SubLObject count = list_utilities.count_if_not((SubLObject)kb_hl_supports_high.$sym26$VALID_DEDUCTION_, dependents, (SubLObject)kb_hl_supports_high.UNPROVIDED, (SubLObject)kb_hl_supports_high.UNPROVIDED, (SubLObject)kb_hl_supports_high.UNPROVIDED);
        if (count.numG((SubLObject)kb_hl_supports_high.ZERO_INTEGER)) {
            SubLObject new_dependents = (SubLObject)kb_hl_supports_high.NIL;
            SubLObject cdolist_list_var = dependents;
            SubLObject dependent = (SubLObject)kb_hl_supports_high.NIL;
            dependent = cdolist_list_var.first();
            while (kb_hl_supports_high.NIL != cdolist_list_var) {
                if (kb_hl_supports_high.NIL != deduction_handles.valid_deductionP(dependent, robustP)) {
                    final SubLObject item_var = dependent;
                    if (kb_hl_supports_high.NIL == conses_high.member(item_var, new_dependents, Symbols.symbol_function((SubLObject)kb_hl_supports_high.EQL), Symbols.symbol_function((SubLObject)kb_hl_supports_high.IDENTITY))) {
                        new_dependents = (SubLObject)ConsesLow.cons(item_var, new_dependents);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                dependent = cdolist_list_var.first();
            }
            kb_hl_supports_interface.kb_kb_hl_support_set_dependents(kb_hl_support, new_dependents);
        }
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 7990L)
    public static SubLObject destroy_kb_hl_supports_with_invalid_hl_supports() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject destroyed_count = (SubLObject)kb_hl_supports_high.ZERO_INTEGER;
        final SubLObject idx = kb_hl_support_handles.do_kb_hl_supports_table();
        final SubLObject mess = (SubLObject)kb_hl_supports_high.$str27$Eliminating_KB_HL_supports_with_i;
        final SubLObject total = id_index.id_index_count(idx);
        SubLObject sofar = (SubLObject)kb_hl_supports_high.ZERO_INTEGER;
        assert kb_hl_supports_high.NIL != Types.stringp(mess) : mess;
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)kb_hl_supports_high.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kb_hl_supports_high.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kb_hl_supports_high.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(mess);
                final SubLObject idx_$9 = idx;
                if (kb_hl_supports_high.NIL == id_index.id_index_objects_empty_p(idx_$9, (SubLObject)kb_hl_supports_high.$kw25$SKIP)) {
                    final SubLObject idx_$10 = idx_$9;
                    if (kb_hl_supports_high.NIL == id_index.id_index_dense_objects_empty_p(idx_$10, (SubLObject)kb_hl_supports_high.$kw25$SKIP)) {
                        final SubLObject vector_var = id_index.id_index_dense_objects(idx_$10);
                        final SubLObject backwardP_var = (SubLObject)kb_hl_supports_high.NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject s_id;
                        SubLObject s_handle;
                        SubLObject kb_hl_support;
                        SubLObject hl_support;
                        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)kb_hl_supports_high.NIL, v_iteration = (SubLObject)kb_hl_supports_high.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)kb_hl_supports_high.ONE_INTEGER)) {
                            s_id = ((kb_hl_supports_high.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)kb_hl_supports_high.ONE_INTEGER) : v_iteration);
                            s_handle = Vectors.aref(vector_var, s_id);
                            if (kb_hl_supports_high.NIL == id_index.id_index_tombstone_p(s_handle) || kb_hl_supports_high.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_hl_supports_high.$kw25$SKIP)) {
                                if (kb_hl_supports_high.NIL != id_index.id_index_tombstone_p(s_handle)) {
                                    s_handle = (SubLObject)kb_hl_supports_high.$kw25$SKIP;
                                }
                                kb_hl_support = kb_hl_support_handles.resolve_kb_hl_support_id_value_pair(s_id, s_handle);
                                hl_support = kb_hl_support_hl_support(kb_hl_support);
                                if (kb_hl_supports_high.NIL == arguments.valid_hl_supportP(hl_support)) {
                                    kb_hl_supports_interface.kb_remove_kb_hl_support(kb_hl_support);
                                    destroyed_count = Numbers.add(destroyed_count, (SubLObject)kb_hl_supports_high.ONE_INTEGER);
                                }
                                sofar = Numbers.add(sofar, (SubLObject)kb_hl_supports_high.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$11 = idx_$9;
                    if (kb_hl_supports_high.NIL == id_index.id_index_sparse_objects_empty_p(idx_$11) || kb_hl_supports_high.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_hl_supports_high.$kw25$SKIP)) {
                        final SubLObject sparse = id_index.id_index_sparse_objects(idx_$11);
                        SubLObject s_id2 = id_index.id_index_sparse_id_threshold(idx_$11);
                        final SubLObject end_id = id_index.id_index_next_id(idx_$11);
                        final SubLObject v_default = (SubLObject)((kb_hl_supports_high.NIL != id_index.id_index_skip_tombstones_p((SubLObject)kb_hl_supports_high.$kw25$SKIP)) ? kb_hl_supports_high.NIL : kb_hl_supports_high.$kw25$SKIP);
                        while (s_id2.numL(end_id)) {
                            final SubLObject s_handle2 = Hashtables.gethash_without_values(s_id2, sparse, v_default);
                            if (kb_hl_supports_high.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_hl_supports_high.$kw25$SKIP) || kb_hl_supports_high.NIL == id_index.id_index_tombstone_p(s_handle2)) {
                                final SubLObject kb_hl_support2 = kb_hl_support_handles.resolve_kb_hl_support_id_value_pair(s_id2, s_handle2);
                                final SubLObject hl_support2 = kb_hl_support_hl_support(kb_hl_support2);
                                if (kb_hl_supports_high.NIL == arguments.valid_hl_supportP(hl_support2)) {
                                    kb_hl_supports_interface.kb_remove_kb_hl_support(kb_hl_support2);
                                    destroyed_count = Numbers.add(destroyed_count, (SubLObject)kb_hl_supports_high.ONE_INTEGER);
                                }
                                sofar = Numbers.add(sofar, (SubLObject)kb_hl_supports_high.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                            s_id2 = Numbers.add(s_id2, (SubLObject)kb_hl_supports_high.ONE_INTEGER);
                        }
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$12 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_hl_supports_high.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$12, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return destroyed_count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 8410L)
    public static SubLObject possibly_reify_hl_supports(final SubLObject justification) {
        return Mapping.mapcar((SubLObject)kb_hl_supports_high.$sym28$POSSIBLY_REIFY_HL_SUPPORT, justification);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 8587L)
    public static SubLObject possibly_reify_hl_support(final SubLObject support) {
        if (kb_hl_supports_high.NIL != assertion_handles.assertion_p(support)) {
            return support;
        }
        if (kb_hl_supports_high.NIL != kb_hl_support_handles.kb_hl_support_p(support)) {
            return support;
        }
        final SubLObject kb_hl_support = find_or_possibly_create_kb_hl_support(support);
        return (kb_hl_supports_high.NIL != kb_hl_support) ? kb_hl_support : support;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 8918L)
    public static SubLObject possibly_unreify_kb_hl_supports(final SubLObject justification) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (kb_hl_supports_high.NIL != kb_hl_supports_high.$unreify_kb_hl_supportsP$.getDynamicValue(thread)) ? unreify_kb_hl_supports(justification) : justification;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 9089L)
    public static SubLObject unreify_kb_hl_supports(final SubLObject justification) {
        return Mapping.mapcar((SubLObject)kb_hl_supports_high.$sym29$UNREIFY_KB_HL_SUPPORT, justification);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 9202L)
    public static SubLObject unreify_kb_hl_support(final SubLObject support) {
        return (kb_hl_supports_high.NIL != kb_hl_support_handles.kb_hl_support_p(support)) ? kb_hl_support_hl_support(support) : support;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 9345L)
    public static SubLObject random_kb_hl_support(SubLObject test) {
        if (test == kb_hl_supports_high.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)kb_hl_supports_high.$sym30$TRUE);
        }
        if (kb_hl_support_handles.kb_hl_support_count().numG((SubLObject)kb_hl_supports_high.ZERO_INTEGER)) {
            final SubLObject max_id = kb_hl_support_handles.next_kb_hl_support_id();
            SubLObject v_answer;
            SubLObject candidate;
            for (v_answer = (SubLObject)kb_hl_supports_high.NIL; kb_hl_supports_high.NIL == v_answer; v_answer = candidate) {
                candidate = kb_hl_support_handles.find_kb_hl_support_by_id(random.random(max_id));
                if (kb_hl_supports_high.NIL != candidate && kb_hl_supports_high.NIL != Functions.funcall(test, candidate)) {}
            }
            return v_answer;
        }
        return (SubLObject)kb_hl_supports_high.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 9788L)
    public static SubLObject sample_kb_hl_supports(SubLObject n, SubLObject allow_repeatsP, SubLObject test) {
        if (n == kb_hl_supports_high.UNPROVIDED) {
            n = (SubLObject)kb_hl_supports_high.$int31$500;
        }
        if (allow_repeatsP == kb_hl_supports_high.UNPROVIDED) {
            allow_repeatsP = (SubLObject)kb_hl_supports_high.NIL;
        }
        if (test == kb_hl_supports_high.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)kb_hl_supports_high.$sym30$TRUE);
        }
        assert kb_hl_supports_high.NIL != subl_promotions.non_negative_integer_p(n) : n;
        if (kb_hl_supports_high.NIL != allow_repeatsP) {
            SubLObject result = (SubLObject)kb_hl_supports_high.NIL;
            SubLObject i;
            for (i = (SubLObject)kb_hl_supports_high.NIL, i = (SubLObject)kb_hl_supports_high.ZERO_INTEGER; i.numL(n); i = Numbers.add(i, (SubLObject)kb_hl_supports_high.ONE_INTEGER)) {
                result = (SubLObject)ConsesLow.cons(random_kb_hl_support(test), result);
            }
            return result;
        }
        SubLObject result;
        for (result = set_contents.new_set_contents(n, Symbols.symbol_function((SubLObject)kb_hl_supports_high.EQL)); set_contents.set_contents_size(result).numL(n); result = set_contents.set_contents_add(random_kb_hl_support(test), result, Symbols.symbol_function((SubLObject)kb_hl_supports_high.EQL))) {}
        return set_contents.set_contents_element_list(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 10402L)
    public static SubLObject kb_hl_supports_around_kb_hl_support(final SubLObject kb_hl_support, SubLObject total, SubLObject before, SubLObject after) {
        if (total == kb_hl_supports_high.UNPROVIDED) {
            total = (SubLObject)kb_hl_supports_high.$int33$100;
        }
        if (before == kb_hl_supports_high.UNPROVIDED) {
            before = (SubLObject)kb_hl_supports_high.ZERO_INTEGER;
        }
        if (after == kb_hl_supports_high.UNPROVIDED) {
            after = Numbers.subtract(total, before);
        }
        assert kb_hl_supports_high.NIL != kb_hl_support_handles.kb_hl_support_p(kb_hl_support) : kb_hl_support;
        return kb_hl_supports_around(kb_hl_support_handles.kb_hl_support_id(kb_hl_support), total, before, after);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 10922L)
    public static SubLObject kb_hl_supports_around(final SubLObject kb_hl_support_id, SubLObject total, SubLObject before, SubLObject after) {
        if (total == kb_hl_supports_high.UNPROVIDED) {
            total = (SubLObject)kb_hl_supports_high.$int33$100;
        }
        if (before == kb_hl_supports_high.UNPROVIDED) {
            before = (SubLObject)kb_hl_supports_high.ZERO_INTEGER;
        }
        if (after == kb_hl_supports_high.UNPROVIDED) {
            after = Numbers.subtract(total, before);
        }
        assert kb_hl_supports_high.NIL != subl_promotions.non_negative_integer_p(kb_hl_support_id) : kb_hl_support_id;
        return assertions_high.kb_objects_around_id((SubLObject)kb_hl_supports_high.$sym34$FIND_KB_HL_SUPPORT_BY_ID, (SubLObject)kb_hl_supports_high.ZERO_INTEGER, kb_hl_support_id, kb_hl_support_handles.next_kb_hl_support_id(), total, before, after);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 11576L)
    public static SubLObject kb_hl_support_dump_id(final SubLObject kb_hl_support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject id = kb_hl_support_handles.kb_hl_support_id(kb_hl_support);
        final SubLObject dump_table = kb_hl_supports_high.$kb_hl_support_dump_id_table$.getDynamicValue(thread);
        if (kb_hl_supports_high.NIL != dump_table) {
            id = id_index.id_index_lookup(dump_table, id, (SubLObject)kb_hl_supports_high.UNPROVIDED);
        }
        return id;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 11878L)
    public static SubLObject find_kb_hl_support_by_dump_id(final SubLObject dump_id) {
        return kb_hl_support_handles.find_kb_hl_support_by_id(dump_id);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 11978L)
    public static SubLObject with_kb_hl_support_dump_id_table(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)kb_hl_supports_high.$sym35$CLET, (SubLObject)kb_hl_supports_high.$list36, ConsesLow.append(body, (SubLObject)kb_hl_supports_high.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 12210L)
    public static SubLObject dump_kb_hl_support_indexing_int(final SubLObject filename) {
        cfasl_utilities.cfasl_save(kb_hl_supports_low.$kb_hl_support_index$.getGlobalValue(), filename);
        return (SubLObject)kb_hl_supports_high.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 12344L)
    public static SubLObject load_kb_hl_support_indexing_int(final SubLObject filename) {
        kb_hl_supports_low.$kb_hl_support_index$.setGlobalValue(cfasl_utilities.cfasl_load(filename));
        return (SubLObject)kb_hl_supports_high.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 12473L)
    public static SubLObject invalid_kb_hl_supportP(final SubLObject kb_hl_support) {
        return (SubLObject)SubLObjectFactory.makeBoolean(kb_hl_supports_high.NIL != kb_hl_support_handles.kb_hl_support_p(kb_hl_support) && kb_hl_supports_high.NIL == kb_hl_support_handles.valid_kb_hl_supportP(kb_hl_support, (SubLObject)kb_hl_supports_high.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 12714L)
    public static SubLObject invalid_kb_hl_support_robustP(final SubLObject kb_hl_support) {
        return (SubLObject)SubLObjectFactory.makeBoolean(kb_hl_supports_high.NIL != kb_hl_support_handles.kb_hl_support_p(kb_hl_support) && kb_hl_supports_high.NIL == kb_hl_support_handles.valid_kb_hl_supportP(kb_hl_support, (SubLObject)kb_hl_supports_high.T));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 12876L)
    public static SubLObject kb_hl_support_has_problemsP(final SubLObject kb_hl_support) {
        return (SubLObject)SubLObjectFactory.makeBoolean(kb_hl_supports_high.NIL != kb_hl_support_handles.kb_hl_support_p(kb_hl_support) && (kb_hl_supports_high.NIL == kb_hl_support_handles.valid_kb_hl_supportP(kb_hl_support, (SubLObject)kb_hl_supports_high.UNPROVIDED) || kb_hl_supports_high.NIL != kb_hl_support_not_findable_by_hl_supportP(kb_hl_support) || kb_hl_supports_high.NIL != kb_hl_support_circularP(kb_hl_support) || kb_hl_supports_high.NIL != kb_hl_support_has_invalid_dependentP(kb_hl_support, (SubLObject)kb_hl_supports_high.UNPROVIDED) || kb_hl_supports_high.NIL != kb_hl_support_has_invalid_argumentP(kb_hl_support, (SubLObject)kb_hl_supports_high.UNPROVIDED) || kb_hl_supports_high.NIL != kb_hl_support_has_invalid_hl_supportP(kb_hl_support)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 13474L)
    public static SubLObject kb_hl_support_not_findable_by_hl_supportP(final SubLObject kb_hl_support) {
        final SubLObject hl_support = kb_hl_support_hl_support(kb_hl_support);
        return (SubLObject)SubLObjectFactory.makeBoolean(!kb_hl_support.eql(find_kb_hl_support(hl_support)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 13684L)
    public static SubLObject kb_hl_support_circularP(final SubLObject kb_hl_support) {
        final SubLObject justification = kb_hl_support_justification(kb_hl_support);
        return kb_hl_support_circularP_int((SubLObject)ConsesLow.list(kb_hl_support), justification);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 13888L)
    public static SubLObject kb_hl_support_circularP_int(final SubLObject kb_hl_supports, final SubLObject justification) {
        SubLObject circularP = keyhash_utilities.fast_intersectP(kb_hl_supports, justification, Symbols.symbol_function((SubLObject)kb_hl_supports_high.EQL), (SubLObject)kb_hl_supports_high.UNPROVIDED, (SubLObject)kb_hl_supports_high.UNPROVIDED);
        if (kb_hl_supports_high.NIL == circularP) {
            SubLObject csome_list_var = justification;
            SubLObject support = (SubLObject)kb_hl_supports_high.NIL;
            support = csome_list_var.first();
            while (kb_hl_supports_high.NIL == circularP && kb_hl_supports_high.NIL != csome_list_var) {
                if (kb_hl_supports_high.NIL != kb_hl_support_handles.kb_hl_support_p(support)) {
                    final SubLObject new_kb_hl_supports = (SubLObject)ConsesLow.cons(support, kb_hl_supports);
                    final SubLObject new_justification = kb_hl_support_justification(support);
                    if (kb_hl_supports_high.NIL != kb_hl_support_circularP_int(new_kb_hl_supports, new_justification)) {
                        circularP = (SubLObject)kb_hl_supports_high.T;
                    }
                }
                csome_list_var = csome_list_var.rest();
                support = csome_list_var.first();
            }
        }
        return circularP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 14378L)
    public static SubLObject kb_hl_support_has_invalid_dependentP(final SubLObject kb_hl_support, SubLObject robustP) {
        if (robustP == kb_hl_supports_high.UNPROVIDED) {
            robustP = (SubLObject)kb_hl_supports_high.NIL;
        }
        SubLObject invalid_dependentP = (SubLObject)kb_hl_supports_high.NIL;
        final SubLObject set_contents_var = kb_hl_supports_interface.kb_kb_hl_support_dependents(kb_hl_support);
        SubLObject basis_object;
        SubLObject state;
        SubLObject dependent;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)kb_hl_supports_high.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); kb_hl_supports_high.NIL == invalid_dependentP && kb_hl_supports_high.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            dependent = set_contents.do_set_contents_next(basis_object, state);
            if (kb_hl_supports_high.NIL != set_contents.do_set_contents_element_validP(state, dependent) && kb_hl_supports_high.NIL == deduction_handles.valid_deductionP(dependent, robustP)) {
                invalid_dependentP = (SubLObject)kb_hl_supports_high.T;
            }
        }
        return invalid_dependentP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 14694L)
    public static SubLObject kb_hl_support_has_invalid_argumentP(final SubLObject kb_hl_support, SubLObject robustP) {
        if (robustP == kb_hl_supports_high.UNPROVIDED) {
            robustP = (SubLObject)kb_hl_supports_high.NIL;
        }
        SubLObject invalid_argumentP;
        SubLObject rest;
        SubLObject argument;
        for (invalid_argumentP = (SubLObject)kb_hl_supports_high.NIL, rest = (SubLObject)kb_hl_supports_high.NIL, rest = kb_hl_supports_interface.kb_kb_hl_support_arguments(kb_hl_support); kb_hl_supports_high.NIL == invalid_argumentP && kb_hl_supports_high.NIL != rest; rest = rest.rest()) {
            argument = rest.first();
            if (kb_hl_supports_high.NIL == deduction_handles.valid_deductionP(argument, robustP)) {
                invalid_argumentP = (SubLObject)kb_hl_supports_high.T;
            }
        }
        return invalid_argumentP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 15002L)
    public static SubLObject kb_hl_support_has_invalid_hl_supportP(final SubLObject kb_hl_support) {
        final SubLObject hl_support = kb_hl_support_hl_support(kb_hl_support);
        return (SubLObject)SubLObjectFactory.makeBoolean(kb_hl_supports_high.NIL == arguments.valid_hl_supportP(hl_support));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 15187L)
    public static SubLObject kb_hl_support_has_missing_backpointerP(final SubLObject kb_hl_support) {
        SubLObject missing_backpointerP = (SubLObject)kb_hl_supports_high.NIL;
        final SubLObject set_contents_var = kb_hl_supports_interface.kb_kb_hl_support_dependents(kb_hl_support);
        SubLObject basis_object;
        SubLObject state;
        SubLObject dependent;
        SubLObject backpointerP;
        SubLObject csome_list_var;
        SubLObject support;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)kb_hl_supports_high.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); kb_hl_supports_high.NIL == missing_backpointerP && kb_hl_supports_high.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            dependent = set_contents.do_set_contents_next(basis_object, state);
            if (kb_hl_supports_high.NIL != set_contents.do_set_contents_element_validP(state, dependent) && kb_hl_supports_high.NIL != deduction_handles.valid_deductionP(dependent, (SubLObject)kb_hl_supports_high.UNPROVIDED)) {
                backpointerP = (SubLObject)kb_hl_supports_high.NIL;
                if (kb_hl_supports_high.NIL == backpointerP) {
                    csome_list_var = deductions_high.deduction_supports(dependent);
                    support = (SubLObject)kb_hl_supports_high.NIL;
                    support = csome_list_var.first();
                    while (kb_hl_supports_high.NIL == backpointerP && kb_hl_supports_high.NIL != csome_list_var) {
                        if (support.eql(kb_hl_support)) {
                            backpointerP = (SubLObject)kb_hl_supports_high.T;
                        }
                        csome_list_var = csome_list_var.rest();
                        support = csome_list_var.first();
                    }
                }
                if (kb_hl_supports_high.NIL == backpointerP) {
                    missing_backpointerP = (SubLObject)kb_hl_supports_high.T;
                }
            }
        }
        return missing_backpointerP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 15674L)
    public static SubLObject kb_hl_support_has_dependent_with_supportP(final SubLObject kb_hl_support, final SubLObject support) {
        assert kb_hl_supports_high.NIL != kb_hl_support_handles.kb_hl_support_p(kb_hl_support) : kb_hl_support;
        assert kb_hl_supports_high.NIL != arguments.support_p(support) : support;
        final SubLObject set_contents_var = kb_hl_supports_interface.kb_kb_hl_support_dependents(kb_hl_support);
        SubLObject basis_object;
        SubLObject state;
        SubLObject deduction;
        SubLObject cdolist_list_var;
        SubLObject deduction_support;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)kb_hl_supports_high.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); kb_hl_supports_high.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            deduction = set_contents.do_set_contents_next(basis_object, state);
            if (kb_hl_supports_high.NIL != set_contents.do_set_contents_element_validP(state, deduction)) {
                cdolist_list_var = deductions_high.deduction_supports(deduction);
                deduction_support = (SubLObject)kb_hl_supports_high.NIL;
                deduction_support = cdolist_list_var.first();
                while (kb_hl_supports_high.NIL != cdolist_list_var) {
                    if (kb_hl_supports_high.NIL != arguments.support_equal(deduction_support, support)) {
                        return (SubLObject)kb_hl_supports_high.T;
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    deduction_support = cdolist_list_var.first();
                }
            }
        }
        return (SubLObject)kb_hl_supports_high.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 16202L)
    public static SubLObject kb_hl_supports_not_findable_by_hl_support() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject failures = (SubLObject)kb_hl_supports_high.NIL;
        final SubLObject idx = kb_hl_support_handles.do_kb_hl_supports_table();
        final SubLObject mess = (SubLObject)kb_hl_supports_high.$str38$Verifying_KB_HL_support_indexing;
        final SubLObject total = id_index.id_index_count(idx);
        SubLObject sofar = (SubLObject)kb_hl_supports_high.ZERO_INTEGER;
        assert kb_hl_supports_high.NIL != Types.stringp(mess) : mess;
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)kb_hl_supports_high.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kb_hl_supports_high.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kb_hl_supports_high.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(mess);
                final SubLObject idx_$13 = idx;
                if (kb_hl_supports_high.NIL == id_index.id_index_objects_empty_p(idx_$13, (SubLObject)kb_hl_supports_high.$kw25$SKIP)) {
                    final SubLObject idx_$14 = idx_$13;
                    if (kb_hl_supports_high.NIL == id_index.id_index_dense_objects_empty_p(idx_$14, (SubLObject)kb_hl_supports_high.$kw25$SKIP)) {
                        final SubLObject vector_var = id_index.id_index_dense_objects(idx_$14);
                        final SubLObject backwardP_var = (SubLObject)kb_hl_supports_high.NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject s_id;
                        SubLObject s_handle;
                        SubLObject kb_hl_support;
                        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)kb_hl_supports_high.NIL, v_iteration = (SubLObject)kb_hl_supports_high.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)kb_hl_supports_high.ONE_INTEGER)) {
                            s_id = ((kb_hl_supports_high.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)kb_hl_supports_high.ONE_INTEGER) : v_iteration);
                            s_handle = Vectors.aref(vector_var, s_id);
                            if (kb_hl_supports_high.NIL == id_index.id_index_tombstone_p(s_handle) || kb_hl_supports_high.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_hl_supports_high.$kw25$SKIP)) {
                                if (kb_hl_supports_high.NIL != id_index.id_index_tombstone_p(s_handle)) {
                                    s_handle = (SubLObject)kb_hl_supports_high.$kw25$SKIP;
                                }
                                kb_hl_support = kb_hl_support_handles.resolve_kb_hl_support_id_value_pair(s_id, s_handle);
                                if (kb_hl_supports_high.NIL != kb_hl_support_not_findable_by_hl_supportP(kb_hl_support)) {
                                    failures = (SubLObject)ConsesLow.cons(kb_hl_support, failures);
                                }
                                sofar = Numbers.add(sofar, (SubLObject)kb_hl_supports_high.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$15 = idx_$13;
                    if (kb_hl_supports_high.NIL == id_index.id_index_sparse_objects_empty_p(idx_$15) || kb_hl_supports_high.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_hl_supports_high.$kw25$SKIP)) {
                        final SubLObject sparse = id_index.id_index_sparse_objects(idx_$15);
                        SubLObject s_id2 = id_index.id_index_sparse_id_threshold(idx_$15);
                        final SubLObject end_id = id_index.id_index_next_id(idx_$15);
                        final SubLObject v_default = (SubLObject)((kb_hl_supports_high.NIL != id_index.id_index_skip_tombstones_p((SubLObject)kb_hl_supports_high.$kw25$SKIP)) ? kb_hl_supports_high.NIL : kb_hl_supports_high.$kw25$SKIP);
                        while (s_id2.numL(end_id)) {
                            final SubLObject s_handle2 = Hashtables.gethash_without_values(s_id2, sparse, v_default);
                            if (kb_hl_supports_high.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_hl_supports_high.$kw25$SKIP) || kb_hl_supports_high.NIL == id_index.id_index_tombstone_p(s_handle2)) {
                                final SubLObject kb_hl_support2 = kb_hl_support_handles.resolve_kb_hl_support_id_value_pair(s_id2, s_handle2);
                                if (kb_hl_supports_high.NIL != kb_hl_support_not_findable_by_hl_supportP(kb_hl_support2)) {
                                    failures = (SubLObject)ConsesLow.cons(kb_hl_support2, failures);
                                }
                                sofar = Numbers.add(sofar, (SubLObject)kb_hl_supports_high.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                            s_id2 = Numbers.add(s_id2, (SubLObject)kb_hl_supports_high.ONE_INTEGER);
                        }
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$16 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_hl_supports_high.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$16, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return Sequences.nreverse(failures);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 16512L)
    public static SubLObject circular_kb_hl_supports() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject circular_supports = (SubLObject)kb_hl_supports_high.NIL;
        final SubLObject idx = kb_hl_support_handles.do_kb_hl_supports_table();
        final SubLObject mess = (SubLObject)kb_hl_supports_high.$str39$Searching_for_circular_KB_HL_supp;
        final SubLObject total = id_index.id_index_count(idx);
        SubLObject sofar = (SubLObject)kb_hl_supports_high.ZERO_INTEGER;
        assert kb_hl_supports_high.NIL != Types.stringp(mess) : mess;
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)kb_hl_supports_high.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kb_hl_supports_high.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kb_hl_supports_high.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(mess);
                final SubLObject idx_$17 = idx;
                if (kb_hl_supports_high.NIL == id_index.id_index_objects_empty_p(idx_$17, (SubLObject)kb_hl_supports_high.$kw25$SKIP)) {
                    final SubLObject idx_$18 = idx_$17;
                    if (kb_hl_supports_high.NIL == id_index.id_index_dense_objects_empty_p(idx_$18, (SubLObject)kb_hl_supports_high.$kw25$SKIP)) {
                        final SubLObject vector_var = id_index.id_index_dense_objects(idx_$18);
                        final SubLObject backwardP_var = (SubLObject)kb_hl_supports_high.NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject s_id;
                        SubLObject s_handle;
                        SubLObject kb_hl_support;
                        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)kb_hl_supports_high.NIL, v_iteration = (SubLObject)kb_hl_supports_high.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)kb_hl_supports_high.ONE_INTEGER)) {
                            s_id = ((kb_hl_supports_high.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)kb_hl_supports_high.ONE_INTEGER) : v_iteration);
                            s_handle = Vectors.aref(vector_var, s_id);
                            if (kb_hl_supports_high.NIL == id_index.id_index_tombstone_p(s_handle) || kb_hl_supports_high.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_hl_supports_high.$kw25$SKIP)) {
                                if (kb_hl_supports_high.NIL != id_index.id_index_tombstone_p(s_handle)) {
                                    s_handle = (SubLObject)kb_hl_supports_high.$kw25$SKIP;
                                }
                                kb_hl_support = kb_hl_support_handles.resolve_kb_hl_support_id_value_pair(s_id, s_handle);
                                if (kb_hl_supports_high.NIL != kb_hl_support_circularP(kb_hl_support)) {
                                    circular_supports = (SubLObject)ConsesLow.cons(kb_hl_support, circular_supports);
                                }
                                sofar = Numbers.add(sofar, (SubLObject)kb_hl_supports_high.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$19 = idx_$17;
                    if (kb_hl_supports_high.NIL == id_index.id_index_sparse_objects_empty_p(idx_$19) || kb_hl_supports_high.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_hl_supports_high.$kw25$SKIP)) {
                        final SubLObject sparse = id_index.id_index_sparse_objects(idx_$19);
                        SubLObject s_id2 = id_index.id_index_sparse_id_threshold(idx_$19);
                        final SubLObject end_id = id_index.id_index_next_id(idx_$19);
                        final SubLObject v_default = (SubLObject)((kb_hl_supports_high.NIL != id_index.id_index_skip_tombstones_p((SubLObject)kb_hl_supports_high.$kw25$SKIP)) ? kb_hl_supports_high.NIL : kb_hl_supports_high.$kw25$SKIP);
                        while (s_id2.numL(end_id)) {
                            final SubLObject s_handle2 = Hashtables.gethash_without_values(s_id2, sparse, v_default);
                            if (kb_hl_supports_high.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_hl_supports_high.$kw25$SKIP) || kb_hl_supports_high.NIL == id_index.id_index_tombstone_p(s_handle2)) {
                                final SubLObject kb_hl_support2 = kb_hl_support_handles.resolve_kb_hl_support_id_value_pair(s_id2, s_handle2);
                                if (kb_hl_supports_high.NIL != kb_hl_support_circularP(kb_hl_support2)) {
                                    circular_supports = (SubLObject)ConsesLow.cons(kb_hl_support2, circular_supports);
                                }
                                sofar = Numbers.add(sofar, (SubLObject)kb_hl_supports_high.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                            s_id2 = Numbers.add(s_id2, (SubLObject)kb_hl_supports_high.ONE_INTEGER);
                        }
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$20 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_hl_supports_high.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$20, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return Sequences.nreverse(circular_supports);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 16818L)
    public static SubLObject duplicate_kb_hl_supports() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_hl_supports = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)kb_hl_supports_high.EQUAL), (SubLObject)kb_hl_supports_high.UNPROVIDED);
        SubLObject duplicate_supports = (SubLObject)kb_hl_supports_high.NIL;
        final SubLObject idx = kb_hl_support_handles.do_kb_hl_supports_table();
        final SubLObject mess = (SubLObject)kb_hl_supports_high.$str40$Searching_for_duplicate_KB_HL_sup;
        final SubLObject total = id_index.id_index_count(idx);
        SubLObject sofar = (SubLObject)kb_hl_supports_high.ZERO_INTEGER;
        assert kb_hl_supports_high.NIL != Types.stringp(mess) : mess;
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)kb_hl_supports_high.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kb_hl_supports_high.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kb_hl_supports_high.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(mess);
                final SubLObject idx_$21 = idx;
                if (kb_hl_supports_high.NIL == id_index.id_index_objects_empty_p(idx_$21, (SubLObject)kb_hl_supports_high.$kw25$SKIP)) {
                    final SubLObject idx_$22 = idx_$21;
                    if (kb_hl_supports_high.NIL == id_index.id_index_dense_objects_empty_p(idx_$22, (SubLObject)kb_hl_supports_high.$kw25$SKIP)) {
                        final SubLObject vector_var = id_index.id_index_dense_objects(idx_$22);
                        final SubLObject backwardP_var = (SubLObject)kb_hl_supports_high.NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject s_id;
                        SubLObject s_handle;
                        SubLObject kb_hl_support;
                        SubLObject hl_support;
                        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)kb_hl_supports_high.NIL, v_iteration = (SubLObject)kb_hl_supports_high.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)kb_hl_supports_high.ONE_INTEGER)) {
                            s_id = ((kb_hl_supports_high.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)kb_hl_supports_high.ONE_INTEGER) : v_iteration);
                            s_handle = Vectors.aref(vector_var, s_id);
                            if (kb_hl_supports_high.NIL == id_index.id_index_tombstone_p(s_handle) || kb_hl_supports_high.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_hl_supports_high.$kw25$SKIP)) {
                                if (kb_hl_supports_high.NIL != id_index.id_index_tombstone_p(s_handle)) {
                                    s_handle = (SubLObject)kb_hl_supports_high.$kw25$SKIP;
                                }
                                kb_hl_support = kb_hl_support_handles.resolve_kb_hl_support_id_value_pair(s_id, s_handle);
                                hl_support = kb_hl_support_hl_support(kb_hl_support);
                                dictionary_utilities.dictionary_push(v_hl_supports, hl_support, kb_hl_support);
                                sofar = Numbers.add(sofar, (SubLObject)kb_hl_supports_high.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$23 = idx_$21;
                    if (kb_hl_supports_high.NIL == id_index.id_index_sparse_objects_empty_p(idx_$23) || kb_hl_supports_high.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_hl_supports_high.$kw25$SKIP)) {
                        final SubLObject sparse = id_index.id_index_sparse_objects(idx_$23);
                        SubLObject s_id2 = id_index.id_index_sparse_id_threshold(idx_$23);
                        final SubLObject end_id = id_index.id_index_next_id(idx_$23);
                        final SubLObject v_default = (SubLObject)((kb_hl_supports_high.NIL != id_index.id_index_skip_tombstones_p((SubLObject)kb_hl_supports_high.$kw25$SKIP)) ? kb_hl_supports_high.NIL : kb_hl_supports_high.$kw25$SKIP);
                        while (s_id2.numL(end_id)) {
                            final SubLObject s_handle2 = Hashtables.gethash_without_values(s_id2, sparse, v_default);
                            if (kb_hl_supports_high.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_hl_supports_high.$kw25$SKIP) || kb_hl_supports_high.NIL == id_index.id_index_tombstone_p(s_handle2)) {
                                final SubLObject kb_hl_support2 = kb_hl_support_handles.resolve_kb_hl_support_id_value_pair(s_id2, s_handle2);
                                final SubLObject hl_support2 = kb_hl_support_hl_support(kb_hl_support2);
                                dictionary_utilities.dictionary_push(v_hl_supports, hl_support2, kb_hl_support2);
                                sofar = Numbers.add(sofar, (SubLObject)kb_hl_supports_high.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                            s_id2 = Numbers.add(s_id2, (SubLObject)kb_hl_supports_high.ONE_INTEGER);
                        }
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$24 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_hl_supports_high.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$24, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(v_hl_supports)); kb_hl_supports_high.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject hl_support3 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject kb_hl_supports = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (kb_hl_supports_high.NIL != list_utilities.lengthG(kb_hl_supports, (SubLObject)kb_hl_supports_high.ONE_INTEGER, (SubLObject)kb_hl_supports_high.UNPROVIDED)) {
                duplicate_supports = ConsesLow.nconc(duplicate_supports, kb_hl_supports);
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return Sort.sort(duplicate_supports, Symbols.symbol_function((SubLObject)kb_hl_supports_high.$sym41$_), (SubLObject)kb_hl_supports_high.$sym42$KB_HL_SUPPORT_ID);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 17414L)
    public static SubLObject kb_hl_supports_with_invalid_dependents(SubLObject robustP) {
        if (robustP == kb_hl_supports_high.UNPROVIDED) {
            robustP = (SubLObject)kb_hl_supports_high.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)kb_hl_supports_high.NIL;
        final SubLObject idx = kb_hl_support_handles.do_kb_hl_supports_table();
        final SubLObject mess = (SubLObject)kb_hl_supports_high.$str43$Searching_for_KB_HL_supports_with;
        final SubLObject total = id_index.id_index_count(idx);
        SubLObject sofar = (SubLObject)kb_hl_supports_high.ZERO_INTEGER;
        assert kb_hl_supports_high.NIL != Types.stringp(mess) : mess;
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)kb_hl_supports_high.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kb_hl_supports_high.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kb_hl_supports_high.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(mess);
                final SubLObject idx_$25 = idx;
                if (kb_hl_supports_high.NIL == id_index.id_index_objects_empty_p(idx_$25, (SubLObject)kb_hl_supports_high.$kw25$SKIP)) {
                    final SubLObject idx_$26 = idx_$25;
                    if (kb_hl_supports_high.NIL == id_index.id_index_dense_objects_empty_p(idx_$26, (SubLObject)kb_hl_supports_high.$kw25$SKIP)) {
                        final SubLObject vector_var = id_index.id_index_dense_objects(idx_$26);
                        final SubLObject backwardP_var = (SubLObject)kb_hl_supports_high.NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject s_id;
                        SubLObject s_handle;
                        SubLObject kb_hl_support;
                        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)kb_hl_supports_high.NIL, v_iteration = (SubLObject)kb_hl_supports_high.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)kb_hl_supports_high.ONE_INTEGER)) {
                            s_id = ((kb_hl_supports_high.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)kb_hl_supports_high.ONE_INTEGER) : v_iteration);
                            s_handle = Vectors.aref(vector_var, s_id);
                            if (kb_hl_supports_high.NIL == id_index.id_index_tombstone_p(s_handle) || kb_hl_supports_high.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_hl_supports_high.$kw25$SKIP)) {
                                if (kb_hl_supports_high.NIL != id_index.id_index_tombstone_p(s_handle)) {
                                    s_handle = (SubLObject)kb_hl_supports_high.$kw25$SKIP;
                                }
                                kb_hl_support = kb_hl_support_handles.resolve_kb_hl_support_id_value_pair(s_id, s_handle);
                                if (kb_hl_supports_high.NIL != kb_hl_support_has_invalid_dependentP(kb_hl_support, robustP)) {
                                    result = (SubLObject)ConsesLow.cons(kb_hl_support, result);
                                }
                                sofar = Numbers.add(sofar, (SubLObject)kb_hl_supports_high.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$27 = idx_$25;
                    if (kb_hl_supports_high.NIL == id_index.id_index_sparse_objects_empty_p(idx_$27) || kb_hl_supports_high.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_hl_supports_high.$kw25$SKIP)) {
                        final SubLObject sparse = id_index.id_index_sparse_objects(idx_$27);
                        SubLObject s_id2 = id_index.id_index_sparse_id_threshold(idx_$27);
                        final SubLObject end_id = id_index.id_index_next_id(idx_$27);
                        final SubLObject v_default = (SubLObject)((kb_hl_supports_high.NIL != id_index.id_index_skip_tombstones_p((SubLObject)kb_hl_supports_high.$kw25$SKIP)) ? kb_hl_supports_high.NIL : kb_hl_supports_high.$kw25$SKIP);
                        while (s_id2.numL(end_id)) {
                            final SubLObject s_handle2 = Hashtables.gethash_without_values(s_id2, sparse, v_default);
                            if (kb_hl_supports_high.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_hl_supports_high.$kw25$SKIP) || kb_hl_supports_high.NIL == id_index.id_index_tombstone_p(s_handle2)) {
                                final SubLObject kb_hl_support2 = kb_hl_support_handles.resolve_kb_hl_support_id_value_pair(s_id2, s_handle2);
                                if (kb_hl_supports_high.NIL != kb_hl_support_has_invalid_dependentP(kb_hl_support2, robustP)) {
                                    result = (SubLObject)ConsesLow.cons(kb_hl_support2, result);
                                }
                                sofar = Numbers.add(sofar, (SubLObject)kb_hl_supports_high.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                            s_id2 = Numbers.add(s_id2, (SubLObject)kb_hl_supports_high.ONE_INTEGER);
                        }
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$28 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_hl_supports_high.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$28, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 17755L)
    public static SubLObject kb_hl_supports_with_invalid_arguments(SubLObject robustP) {
        if (robustP == kb_hl_supports_high.UNPROVIDED) {
            robustP = (SubLObject)kb_hl_supports_high.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)kb_hl_supports_high.NIL;
        final SubLObject idx = kb_hl_support_handles.do_kb_hl_supports_table();
        final SubLObject mess = (SubLObject)kb_hl_supports_high.$str44$Searching_for_KB_HL_supports_with;
        final SubLObject total = id_index.id_index_count(idx);
        SubLObject sofar = (SubLObject)kb_hl_supports_high.ZERO_INTEGER;
        assert kb_hl_supports_high.NIL != Types.stringp(mess) : mess;
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)kb_hl_supports_high.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kb_hl_supports_high.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kb_hl_supports_high.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(mess);
                final SubLObject idx_$29 = idx;
                if (kb_hl_supports_high.NIL == id_index.id_index_objects_empty_p(idx_$29, (SubLObject)kb_hl_supports_high.$kw25$SKIP)) {
                    final SubLObject idx_$30 = idx_$29;
                    if (kb_hl_supports_high.NIL == id_index.id_index_dense_objects_empty_p(idx_$30, (SubLObject)kb_hl_supports_high.$kw25$SKIP)) {
                        final SubLObject vector_var = id_index.id_index_dense_objects(idx_$30);
                        final SubLObject backwardP_var = (SubLObject)kb_hl_supports_high.NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject s_id;
                        SubLObject s_handle;
                        SubLObject kb_hl_support;
                        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)kb_hl_supports_high.NIL, v_iteration = (SubLObject)kb_hl_supports_high.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)kb_hl_supports_high.ONE_INTEGER)) {
                            s_id = ((kb_hl_supports_high.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)kb_hl_supports_high.ONE_INTEGER) : v_iteration);
                            s_handle = Vectors.aref(vector_var, s_id);
                            if (kb_hl_supports_high.NIL == id_index.id_index_tombstone_p(s_handle) || kb_hl_supports_high.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_hl_supports_high.$kw25$SKIP)) {
                                if (kb_hl_supports_high.NIL != id_index.id_index_tombstone_p(s_handle)) {
                                    s_handle = (SubLObject)kb_hl_supports_high.$kw25$SKIP;
                                }
                                kb_hl_support = kb_hl_support_handles.resolve_kb_hl_support_id_value_pair(s_id, s_handle);
                                if (kb_hl_supports_high.NIL != kb_hl_support_has_invalid_argumentP(kb_hl_support, robustP)) {
                                    result = (SubLObject)ConsesLow.cons(kb_hl_support, result);
                                }
                                sofar = Numbers.add(sofar, (SubLObject)kb_hl_supports_high.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$31 = idx_$29;
                    if (kb_hl_supports_high.NIL == id_index.id_index_sparse_objects_empty_p(idx_$31) || kb_hl_supports_high.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_hl_supports_high.$kw25$SKIP)) {
                        final SubLObject sparse = id_index.id_index_sparse_objects(idx_$31);
                        SubLObject s_id2 = id_index.id_index_sparse_id_threshold(idx_$31);
                        final SubLObject end_id = id_index.id_index_next_id(idx_$31);
                        final SubLObject v_default = (SubLObject)((kb_hl_supports_high.NIL != id_index.id_index_skip_tombstones_p((SubLObject)kb_hl_supports_high.$kw25$SKIP)) ? kb_hl_supports_high.NIL : kb_hl_supports_high.$kw25$SKIP);
                        while (s_id2.numL(end_id)) {
                            final SubLObject s_handle2 = Hashtables.gethash_without_values(s_id2, sparse, v_default);
                            if (kb_hl_supports_high.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_hl_supports_high.$kw25$SKIP) || kb_hl_supports_high.NIL == id_index.id_index_tombstone_p(s_handle2)) {
                                final SubLObject kb_hl_support2 = kb_hl_support_handles.resolve_kb_hl_support_id_value_pair(s_id2, s_handle2);
                                if (kb_hl_supports_high.NIL != kb_hl_support_has_invalid_argumentP(kb_hl_support2, robustP)) {
                                    result = (SubLObject)ConsesLow.cons(kb_hl_support2, result);
                                }
                                sofar = Numbers.add(sofar, (SubLObject)kb_hl_supports_high.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                            s_id2 = Numbers.add(s_id2, (SubLObject)kb_hl_supports_high.ONE_INTEGER);
                        }
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$32 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_hl_supports_high.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$32, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 18093L)
    public static SubLObject kb_hl_supports_with_invalid_hl_supports() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)kb_hl_supports_high.NIL;
        final SubLObject idx = kb_hl_support_handles.do_kb_hl_supports_table();
        final SubLObject mess = (SubLObject)kb_hl_supports_high.$str45$Searching_for_KB_HL_supports_with;
        final SubLObject total = id_index.id_index_count(idx);
        SubLObject sofar = (SubLObject)kb_hl_supports_high.ZERO_INTEGER;
        assert kb_hl_supports_high.NIL != Types.stringp(mess) : mess;
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)kb_hl_supports_high.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kb_hl_supports_high.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kb_hl_supports_high.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(mess);
                final SubLObject idx_$33 = idx;
                if (kb_hl_supports_high.NIL == id_index.id_index_objects_empty_p(idx_$33, (SubLObject)kb_hl_supports_high.$kw25$SKIP)) {
                    final SubLObject idx_$34 = idx_$33;
                    if (kb_hl_supports_high.NIL == id_index.id_index_dense_objects_empty_p(idx_$34, (SubLObject)kb_hl_supports_high.$kw25$SKIP)) {
                        final SubLObject vector_var = id_index.id_index_dense_objects(idx_$34);
                        final SubLObject backwardP_var = (SubLObject)kb_hl_supports_high.NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject s_id;
                        SubLObject s_handle;
                        SubLObject kb_hl_support;
                        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)kb_hl_supports_high.NIL, v_iteration = (SubLObject)kb_hl_supports_high.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)kb_hl_supports_high.ONE_INTEGER)) {
                            s_id = ((kb_hl_supports_high.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)kb_hl_supports_high.ONE_INTEGER) : v_iteration);
                            s_handle = Vectors.aref(vector_var, s_id);
                            if (kb_hl_supports_high.NIL == id_index.id_index_tombstone_p(s_handle) || kb_hl_supports_high.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_hl_supports_high.$kw25$SKIP)) {
                                if (kb_hl_supports_high.NIL != id_index.id_index_tombstone_p(s_handle)) {
                                    s_handle = (SubLObject)kb_hl_supports_high.$kw25$SKIP;
                                }
                                kb_hl_support = kb_hl_support_handles.resolve_kb_hl_support_id_value_pair(s_id, s_handle);
                                if (kb_hl_supports_high.NIL != kb_hl_support_has_invalid_hl_supportP(kb_hl_support)) {
                                    result = (SubLObject)ConsesLow.cons(kb_hl_support, result);
                                }
                                sofar = Numbers.add(sofar, (SubLObject)kb_hl_supports_high.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$35 = idx_$33;
                    if (kb_hl_supports_high.NIL == id_index.id_index_sparse_objects_empty_p(idx_$35) || kb_hl_supports_high.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_hl_supports_high.$kw25$SKIP)) {
                        final SubLObject sparse = id_index.id_index_sparse_objects(idx_$35);
                        SubLObject s_id2 = id_index.id_index_sparse_id_threshold(idx_$35);
                        final SubLObject end_id = id_index.id_index_next_id(idx_$35);
                        final SubLObject v_default = (SubLObject)((kb_hl_supports_high.NIL != id_index.id_index_skip_tombstones_p((SubLObject)kb_hl_supports_high.$kw25$SKIP)) ? kb_hl_supports_high.NIL : kb_hl_supports_high.$kw25$SKIP);
                        while (s_id2.numL(end_id)) {
                            final SubLObject s_handle2 = Hashtables.gethash_without_values(s_id2, sparse, v_default);
                            if (kb_hl_supports_high.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_hl_supports_high.$kw25$SKIP) || kb_hl_supports_high.NIL == id_index.id_index_tombstone_p(s_handle2)) {
                                final SubLObject kb_hl_support2 = kb_hl_support_handles.resolve_kb_hl_support_id_value_pair(s_id2, s_handle2);
                                if (kb_hl_supports_high.NIL != kb_hl_support_has_invalid_hl_supportP(kb_hl_support2)) {
                                    result = (SubLObject)ConsesLow.cons(kb_hl_support2, result);
                                }
                                sofar = Numbers.add(sofar, (SubLObject)kb_hl_supports_high.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                            s_id2 = Numbers.add(s_id2, (SubLObject)kb_hl_supports_high.ONE_INTEGER);
                        }
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$36 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_hl_supports_high.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$36, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 18412L)
    public static SubLObject kb_hl_supports_with_missing_backpointers() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)kb_hl_supports_high.NIL;
        final SubLObject idx = kb_hl_support_handles.do_kb_hl_supports_table();
        final SubLObject mess = (SubLObject)kb_hl_supports_high.$str46$Searching_for_KB_HL_supports_with;
        final SubLObject total = id_index.id_index_count(idx);
        SubLObject sofar = (SubLObject)kb_hl_supports_high.ZERO_INTEGER;
        assert kb_hl_supports_high.NIL != Types.stringp(mess) : mess;
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)kb_hl_supports_high.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kb_hl_supports_high.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kb_hl_supports_high.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(mess);
                final SubLObject idx_$37 = idx;
                if (kb_hl_supports_high.NIL == id_index.id_index_objects_empty_p(idx_$37, (SubLObject)kb_hl_supports_high.$kw25$SKIP)) {
                    final SubLObject idx_$38 = idx_$37;
                    if (kb_hl_supports_high.NIL == id_index.id_index_dense_objects_empty_p(idx_$38, (SubLObject)kb_hl_supports_high.$kw25$SKIP)) {
                        final SubLObject vector_var = id_index.id_index_dense_objects(idx_$38);
                        final SubLObject backwardP_var = (SubLObject)kb_hl_supports_high.NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject s_id;
                        SubLObject s_handle;
                        SubLObject kb_hl_support;
                        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)kb_hl_supports_high.NIL, v_iteration = (SubLObject)kb_hl_supports_high.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)kb_hl_supports_high.ONE_INTEGER)) {
                            s_id = ((kb_hl_supports_high.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)kb_hl_supports_high.ONE_INTEGER) : v_iteration);
                            s_handle = Vectors.aref(vector_var, s_id);
                            if (kb_hl_supports_high.NIL == id_index.id_index_tombstone_p(s_handle) || kb_hl_supports_high.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_hl_supports_high.$kw25$SKIP)) {
                                if (kb_hl_supports_high.NIL != id_index.id_index_tombstone_p(s_handle)) {
                                    s_handle = (SubLObject)kb_hl_supports_high.$kw25$SKIP;
                                }
                                kb_hl_support = kb_hl_support_handles.resolve_kb_hl_support_id_value_pair(s_id, s_handle);
                                if (kb_hl_supports_high.NIL != kb_hl_support_has_missing_backpointerP(kb_hl_support)) {
                                    result = (SubLObject)ConsesLow.cons(kb_hl_support, result);
                                }
                                sofar = Numbers.add(sofar, (SubLObject)kb_hl_supports_high.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$39 = idx_$37;
                    if (kb_hl_supports_high.NIL == id_index.id_index_sparse_objects_empty_p(idx_$39) || kb_hl_supports_high.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_hl_supports_high.$kw25$SKIP)) {
                        final SubLObject sparse = id_index.id_index_sparse_objects(idx_$39);
                        SubLObject s_id2 = id_index.id_index_sparse_id_threshold(idx_$39);
                        final SubLObject end_id = id_index.id_index_next_id(idx_$39);
                        final SubLObject v_default = (SubLObject)((kb_hl_supports_high.NIL != id_index.id_index_skip_tombstones_p((SubLObject)kb_hl_supports_high.$kw25$SKIP)) ? kb_hl_supports_high.NIL : kb_hl_supports_high.$kw25$SKIP);
                        while (s_id2.numL(end_id)) {
                            final SubLObject s_handle2 = Hashtables.gethash_without_values(s_id2, sparse, v_default);
                            if (kb_hl_supports_high.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_hl_supports_high.$kw25$SKIP) || kb_hl_supports_high.NIL == id_index.id_index_tombstone_p(s_handle2)) {
                                final SubLObject kb_hl_support2 = kb_hl_support_handles.resolve_kb_hl_support_id_value_pair(s_id2, s_handle2);
                                if (kb_hl_supports_high.NIL != kb_hl_support_has_missing_backpointerP(kb_hl_support2)) {
                                    result = (SubLObject)ConsesLow.cons(kb_hl_support2, result);
                                }
                                sofar = Numbers.add(sofar, (SubLObject)kb_hl_supports_high.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                            s_id2 = Numbers.add(s_id2, (SubLObject)kb_hl_supports_high.ONE_INTEGER);
                        }
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$40 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_hl_supports_high.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$40, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 18734L)
    public static SubLObject verify_kb_hl_supports(SubLObject stream, SubLObject verboseP) {
        if (stream == kb_hl_supports_high.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (verboseP == kb_hl_supports_high.UNPROVIDED) {
            verboseP = (SubLObject)kb_hl_supports_high.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_hl_supports = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)kb_hl_supports_high.EQUAL), (SubLObject)kb_hl_supports_high.UNPROVIDED);
        SubLObject indexing_failures = (SubLObject)kb_hl_supports_high.NIL;
        SubLObject circular_kb_hl_supports = (SubLObject)kb_hl_supports_high.NIL;
        SubLObject duplicate_kb_hl_supports = (SubLObject)kb_hl_supports_high.NIL;
        SubLObject kb_hl_supports_with_invalid_dependents = (SubLObject)kb_hl_supports_high.NIL;
        SubLObject kb_hl_supports_with_invalid_arguments = (SubLObject)kb_hl_supports_high.NIL;
        SubLObject kb_hl_supports_with_invalid_hl_supports = (SubLObject)kb_hl_supports_high.NIL;
        SubLObject kb_hl_supports_with_missing_backpointers = (SubLObject)kb_hl_supports_high.NIL;
        SubLObject error_message = (SubLObject)kb_hl_supports_high.NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)kb_hl_supports_high.$sym47$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    final SubLObject idx = kb_hl_support_handles.do_kb_hl_supports_table();
                    final SubLObject mess = (SubLObject)kb_hl_supports_high.$str48$Verifying_KB_HL_supports;
                    final SubLObject total = id_index.id_index_count(idx);
                    SubLObject sofar = (SubLObject)kb_hl_supports_high.ZERO_INTEGER;
                    assert kb_hl_supports_high.NIL != Types.stringp(mess) : mess;
                    final SubLObject _prev_bind_0_$41 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                    try {
                        utilities_macros.$last_percent_progress_index$.bind((SubLObject)kb_hl_supports_high.ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kb_hl_supports_high.NIL, thread);
                        utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kb_hl_supports_high.T, thread);
                        utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                        try {
                            utilities_macros.noting_percent_progress_preamble(mess);
                            final SubLObject idx_$42 = idx;
                            if (kb_hl_supports_high.NIL == id_index.id_index_objects_empty_p(idx_$42, (SubLObject)kb_hl_supports_high.$kw25$SKIP)) {
                                final SubLObject idx_$43 = idx_$42;
                                if (kb_hl_supports_high.NIL == id_index.id_index_dense_objects_empty_p(idx_$43, (SubLObject)kb_hl_supports_high.$kw25$SKIP)) {
                                    final SubLObject vector_var = id_index.id_index_dense_objects(idx_$43);
                                    final SubLObject backwardP_var = (SubLObject)kb_hl_supports_high.NIL;
                                    SubLObject length;
                                    SubLObject v_iteration;
                                    SubLObject s_id;
                                    SubLObject s_handle;
                                    SubLObject kb_hl_support;
                                    SubLObject hl_support;
                                    for (length = Sequences.length(vector_var), v_iteration = (SubLObject)kb_hl_supports_high.NIL, v_iteration = (SubLObject)kb_hl_supports_high.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)kb_hl_supports_high.ONE_INTEGER)) {
                                        s_id = ((kb_hl_supports_high.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)kb_hl_supports_high.ONE_INTEGER) : v_iteration);
                                        s_handle = Vectors.aref(vector_var, s_id);
                                        if (kb_hl_supports_high.NIL == id_index.id_index_tombstone_p(s_handle) || kb_hl_supports_high.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_hl_supports_high.$kw25$SKIP)) {
                                            if (kb_hl_supports_high.NIL != id_index.id_index_tombstone_p(s_handle)) {
                                                s_handle = (SubLObject)kb_hl_supports_high.$kw25$SKIP;
                                            }
                                            kb_hl_support = kb_hl_support_handles.resolve_kb_hl_support_id_value_pair(s_id, s_handle);
                                            hl_support = kb_hl_support_hl_support(kb_hl_support);
                                            dictionary_utilities.dictionary_push(v_hl_supports, hl_support, kb_hl_support);
                                            if (kb_hl_supports_high.NIL != kb_hl_support_not_findable_by_hl_supportP(kb_hl_support)) {
                                                indexing_failures = (SubLObject)ConsesLow.cons(kb_hl_support, indexing_failures);
                                            }
                                            if (kb_hl_supports_high.NIL != kb_hl_support_circularP(kb_hl_support)) {
                                                circular_kb_hl_supports = (SubLObject)ConsesLow.cons(kb_hl_support, circular_kb_hl_supports);
                                            }
                                            if (kb_hl_supports_high.NIL != kb_hl_support_has_invalid_dependentP(kb_hl_support, (SubLObject)kb_hl_supports_high.UNPROVIDED)) {
                                                kb_hl_supports_with_invalid_dependents = (SubLObject)ConsesLow.cons(kb_hl_support, kb_hl_supports_with_invalid_dependents);
                                            }
                                            if (kb_hl_supports_high.NIL != kb_hl_support_has_invalid_argumentP(kb_hl_support, (SubLObject)kb_hl_supports_high.UNPROVIDED)) {
                                                kb_hl_supports_with_invalid_arguments = (SubLObject)ConsesLow.cons(kb_hl_support, kb_hl_supports_with_invalid_arguments);
                                            }
                                            if (kb_hl_supports_high.NIL != kb_hl_support_has_invalid_hl_supportP(kb_hl_support)) {
                                                kb_hl_supports_with_invalid_hl_supports = (SubLObject)ConsesLow.cons(kb_hl_support, kb_hl_supports_with_invalid_hl_supports);
                                            }
                                            if (kb_hl_supports_high.NIL != kb_hl_support_has_missing_backpointerP(kb_hl_support)) {
                                                kb_hl_supports_with_missing_backpointers = (SubLObject)ConsesLow.cons(kb_hl_support, kb_hl_supports_with_missing_backpointers);
                                            }
                                            sofar = Numbers.add(sofar, (SubLObject)kb_hl_supports_high.ONE_INTEGER);
                                            utilities_macros.note_percent_progress(sofar, total);
                                        }
                                    }
                                }
                                final SubLObject idx_$44 = idx_$42;
                                if (kb_hl_supports_high.NIL == id_index.id_index_sparse_objects_empty_p(idx_$44) || kb_hl_supports_high.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_hl_supports_high.$kw25$SKIP)) {
                                    final SubLObject sparse = id_index.id_index_sparse_objects(idx_$44);
                                    SubLObject s_id2 = id_index.id_index_sparse_id_threshold(idx_$44);
                                    final SubLObject end_id = id_index.id_index_next_id(idx_$44);
                                    final SubLObject v_default = (SubLObject)((kb_hl_supports_high.NIL != id_index.id_index_skip_tombstones_p((SubLObject)kb_hl_supports_high.$kw25$SKIP)) ? kb_hl_supports_high.NIL : kb_hl_supports_high.$kw25$SKIP);
                                    while (s_id2.numL(end_id)) {
                                        final SubLObject s_handle2 = Hashtables.gethash_without_values(s_id2, sparse, v_default);
                                        if (kb_hl_supports_high.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_hl_supports_high.$kw25$SKIP) || kb_hl_supports_high.NIL == id_index.id_index_tombstone_p(s_handle2)) {
                                            final SubLObject kb_hl_support2 = kb_hl_support_handles.resolve_kb_hl_support_id_value_pair(s_id2, s_handle2);
                                            final SubLObject hl_support2 = kb_hl_support_hl_support(kb_hl_support2);
                                            dictionary_utilities.dictionary_push(v_hl_supports, hl_support2, kb_hl_support2);
                                            if (kb_hl_supports_high.NIL != kb_hl_support_not_findable_by_hl_supportP(kb_hl_support2)) {
                                                indexing_failures = (SubLObject)ConsesLow.cons(kb_hl_support2, indexing_failures);
                                            }
                                            if (kb_hl_supports_high.NIL != kb_hl_support_circularP(kb_hl_support2)) {
                                                circular_kb_hl_supports = (SubLObject)ConsesLow.cons(kb_hl_support2, circular_kb_hl_supports);
                                            }
                                            if (kb_hl_supports_high.NIL != kb_hl_support_has_invalid_dependentP(kb_hl_support2, (SubLObject)kb_hl_supports_high.UNPROVIDED)) {
                                                kb_hl_supports_with_invalid_dependents = (SubLObject)ConsesLow.cons(kb_hl_support2, kb_hl_supports_with_invalid_dependents);
                                            }
                                            if (kb_hl_supports_high.NIL != kb_hl_support_has_invalid_argumentP(kb_hl_support2, (SubLObject)kb_hl_supports_high.UNPROVIDED)) {
                                                kb_hl_supports_with_invalid_arguments = (SubLObject)ConsesLow.cons(kb_hl_support2, kb_hl_supports_with_invalid_arguments);
                                            }
                                            if (kb_hl_supports_high.NIL != kb_hl_support_has_invalid_hl_supportP(kb_hl_support2)) {
                                                kb_hl_supports_with_invalid_hl_supports = (SubLObject)ConsesLow.cons(kb_hl_support2, kb_hl_supports_with_invalid_hl_supports);
                                            }
                                            if (kb_hl_supports_high.NIL != kb_hl_support_has_missing_backpointerP(kb_hl_support2)) {
                                                kb_hl_supports_with_missing_backpointers = (SubLObject)ConsesLow.cons(kb_hl_support2, kb_hl_supports_with_missing_backpointers);
                                            }
                                            sofar = Numbers.add(sofar, (SubLObject)kb_hl_supports_high.ONE_INTEGER);
                                            utilities_macros.note_percent_progress(sofar, total);
                                        }
                                        s_id2 = Numbers.add(s_id2, (SubLObject)kb_hl_supports_high.ONE_INTEGER);
                                    }
                                }
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$42 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_hl_supports_high.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                utilities_macros.noting_percent_progress_postamble();
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$42, thread);
                            }
                        }
                    }
                    finally {
                        utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
                        utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                        utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
                        utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0_$41, thread);
                    }
                    SubLObject iteration_state;
                    for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(v_hl_supports)); kb_hl_supports_high.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                        thread.resetMultipleValues();
                        final SubLObject hl_support3 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        final SubLObject kb_hl_supports = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (kb_hl_supports_high.NIL != list_utilities.lengthG(kb_hl_supports, (SubLObject)kb_hl_supports_high.ONE_INTEGER, (SubLObject)kb_hl_supports_high.UNPROVIDED)) {
                            duplicate_kb_hl_supports = ConsesLow.nconc(duplicate_kb_hl_supports, kb_hl_supports);
                        }
                    }
                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                    indexing_failures = Sequences.nreverse(indexing_failures);
                    circular_kb_hl_supports = Sequences.nreverse(circular_kb_hl_supports);
                    duplicate_kb_hl_supports = Sort.sort(duplicate_kb_hl_supports, Symbols.symbol_function((SubLObject)kb_hl_supports_high.$sym41$_), (SubLObject)kb_hl_supports_high.$sym42$KB_HL_SUPPORT_ID);
                    kb_hl_supports_with_invalid_dependents = Sequences.nreverse(kb_hl_supports_with_invalid_dependents);
                    kb_hl_supports_with_invalid_arguments = Sequences.nreverse(kb_hl_supports_with_invalid_arguments);
                    kb_hl_supports_with_invalid_hl_supports = Sequences.nreverse(kb_hl_supports_with_invalid_hl_supports);
                    kb_hl_supports_with_missing_backpointers = Sequences.nreverse(kb_hl_supports_with_missing_backpointers);
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)kb_hl_supports_high.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        }
        finally {
            thread.throwStack.pop();
        }
        if (kb_hl_supports_high.NIL != stream) {
            if (kb_hl_supports_high.NIL != error_message) {
                PrintLow.format(stream, (SubLObject)kb_hl_supports_high.$str49$__Error_during_KB_HL_support_veri, error_message);
            }
            if (kb_hl_supports_high.NIL != indexing_failures) {
                report_kb_hl_support_indexing_failures(stream, indexing_failures, verboseP);
            }
            if (kb_hl_supports_high.NIL != circular_kb_hl_supports) {
                report_circular_kb_hl_supports(stream, circular_kb_hl_supports, verboseP);
            }
            if (kb_hl_supports_high.NIL != duplicate_kb_hl_supports) {
                report_duplicate_kb_hl_supports(stream, duplicate_kb_hl_supports, verboseP);
            }
            if (kb_hl_supports_high.NIL != kb_hl_supports_with_invalid_dependents) {
                report_kb_hl_supports_with_invalid_dependents(stream, kb_hl_supports_with_invalid_dependents, verboseP);
            }
            if (kb_hl_supports_high.NIL != kb_hl_supports_with_invalid_arguments) {
                report_kb_hl_supports_with_invalid_arguments(stream, kb_hl_supports_with_invalid_arguments, verboseP);
            }
            if (kb_hl_supports_high.NIL != kb_hl_supports_with_invalid_hl_supports) {
                report_kb_hl_supports_with_invalid_hl_supports(stream, kb_hl_supports_with_invalid_hl_supports, verboseP);
            }
            if (kb_hl_supports_high.NIL != kb_hl_supports_with_missing_backpointers) {
                report_kb_hl_supports_with_missing_backpointers(stream, kb_hl_supports_with_missing_backpointers, verboseP);
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(kb_hl_supports_high.NIL == indexing_failures && kb_hl_supports_high.NIL == circular_kb_hl_supports && kb_hl_supports_high.NIL == duplicate_kb_hl_supports && kb_hl_supports_high.NIL == kb_hl_supports_with_invalid_dependents && kb_hl_supports_high.NIL == kb_hl_supports_with_invalid_arguments && kb_hl_supports_high.NIL == kb_hl_supports_with_invalid_hl_supports && kb_hl_supports_high.NIL == kb_hl_supports_with_missing_backpointers && kb_hl_supports_high.NIL == error_message);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 22391L)
    public static SubLObject verify_kb_hl_support_indexing(SubLObject stream) {
        if (stream == kb_hl_supports_high.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject failures = (SubLObject)kb_hl_supports_high.NIL;
        SubLObject error_message = (SubLObject)kb_hl_supports_high.NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)kb_hl_supports_high.$sym47$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    failures = kb_hl_supports_not_findable_by_hl_support();
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)kb_hl_supports_high.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        }
        finally {
            thread.throwStack.pop();
        }
        if (kb_hl_supports_high.NIL != stream) {
            if (kb_hl_supports_high.NIL != error_message) {
                PrintLow.format(stream, (SubLObject)kb_hl_supports_high.$str50$__Error_during_indexing_verificat, error_message);
            }
            if (kb_hl_supports_high.NIL != failures) {
                report_kb_hl_support_indexing_failures(stream, failures, (SubLObject)kb_hl_supports_high.UNPROVIDED);
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(kb_hl_supports_high.NIL == failures && kb_hl_supports_high.NIL == error_message);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 22891L)
    public static SubLObject report_kb_hl_support_indexing_failures(final SubLObject stream, final SubLObject failures, SubLObject verboseP) {
        if (verboseP == kb_hl_supports_high.UNPROVIDED) {
            verboseP = (SubLObject)kb_hl_supports_high.NIL;
        }
        if (kb_hl_supports_high.NIL != verboseP) {
            PrintLow.format(stream, (SubLObject)kb_hl_supports_high.$str51$__The_following_KB_HL_supports_we, Sequences.length(failures));
            SubLObject cdolist_list_var = failures;
            SubLObject failure = (SubLObject)kb_hl_supports_high.NIL;
            failure = cdolist_list_var.first();
            while (kb_hl_supports_high.NIL != cdolist_list_var) {
                PrintLow.format(stream, (SubLObject)kb_hl_supports_high.$str52$__s__s__, kb_hl_support_handles.kb_hl_support_id(failure), failure);
                cdolist_list_var = cdolist_list_var.rest();
                failure = cdolist_list_var.first();
            }
        }
        else {
            PrintLow.format(stream, (SubLObject)kb_hl_supports_high.$str53$___s_KB_HL_supports_are_not_finda, Sequences.length(failures));
        }
        return (SubLObject)kb_hl_supports_high.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 23357L)
    public static SubLObject verify_kb_hl_supports_non_circular(SubLObject stream) {
        if (stream == kb_hl_supports_high.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject failures = (SubLObject)kb_hl_supports_high.NIL;
        SubLObject error_message = (SubLObject)kb_hl_supports_high.NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)kb_hl_supports_high.$sym47$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    failures = circular_kb_hl_supports();
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)kb_hl_supports_high.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        }
        finally {
            thread.throwStack.pop();
        }
        if (kb_hl_supports_high.NIL != stream) {
            if (kb_hl_supports_high.NIL != error_message) {
                PrintLow.format(stream, (SubLObject)kb_hl_supports_high.$str54$__Error_during_non_circularity_ve, error_message);
            }
            if (kb_hl_supports_high.NIL != failures) {
                report_circular_kb_hl_supports(stream, failures, (SubLObject)kb_hl_supports_high.UNPROVIDED);
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(kb_hl_supports_high.NIL == failures && kb_hl_supports_high.NIL == error_message);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 23844L)
    public static SubLObject report_circular_kb_hl_supports(final SubLObject stream, final SubLObject circular_kb_hl_supports, SubLObject verboseP) {
        if (verboseP == kb_hl_supports_high.UNPROVIDED) {
            verboseP = (SubLObject)kb_hl_supports_high.NIL;
        }
        if (kb_hl_supports_high.NIL != verboseP) {
            PrintLow.format(stream, (SubLObject)kb_hl_supports_high.$str55$__The_following_KB_HL_supports_ar, Sequences.length(circular_kb_hl_supports));
            SubLObject cdolist_list_var = circular_kb_hl_supports;
            SubLObject kb_hl_support = (SubLObject)kb_hl_supports_high.NIL;
            kb_hl_support = cdolist_list_var.first();
            while (kb_hl_supports_high.NIL != cdolist_list_var) {
                PrintLow.format(stream, (SubLObject)kb_hl_supports_high.$str52$__s__s__, kb_hl_support_handles.kb_hl_support_id(kb_hl_support), kb_hl_support);
                cdolist_list_var = cdolist_list_var.rest();
                kb_hl_support = cdolist_list_var.first();
            }
        }
        else {
            PrintLow.format(stream, (SubLObject)kb_hl_supports_high.$str56$___s_KB_HL_supports_are_circular_, Sequences.length(circular_kb_hl_supports));
        }
        return (SubLObject)kb_hl_supports_high.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 24327L)
    public static SubLObject verify_kb_hl_support_uniqueness(SubLObject stream) {
        if (stream == kb_hl_supports_high.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject failures = (SubLObject)kb_hl_supports_high.NIL;
        SubLObject error_message = (SubLObject)kb_hl_supports_high.NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)kb_hl_supports_high.$sym47$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    failures = duplicate_kb_hl_supports();
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)kb_hl_supports_high.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        }
        finally {
            thread.throwStack.pop();
        }
        if (kb_hl_supports_high.NIL != stream) {
            if (kb_hl_supports_high.NIL != error_message) {
                PrintLow.format(stream, (SubLObject)kb_hl_supports_high.$str57$__Error_during_uniqueness_verific, error_message);
            }
            if (kb_hl_supports_high.NIL != failures) {
                report_duplicate_kb_hl_supports(stream, failures, (SubLObject)kb_hl_supports_high.UNPROVIDED);
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(kb_hl_supports_high.NIL == failures && kb_hl_supports_high.NIL == error_message);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 24808L)
    public static SubLObject report_duplicate_kb_hl_supports(final SubLObject stream, final SubLObject kb_hl_supports, SubLObject verboseP) {
        if (verboseP == kb_hl_supports_high.UNPROVIDED) {
            verboseP = (SubLObject)kb_hl_supports_high.NIL;
        }
        if (kb_hl_supports_high.NIL != verboseP) {
            PrintLow.format(stream, (SubLObject)kb_hl_supports_high.$str58$__The_following_KB_HL_supports_ha, Sequences.length(kb_hl_supports));
            SubLObject cdolist_list_var = kb_hl_supports;
            SubLObject kb_hl_support = (SubLObject)kb_hl_supports_high.NIL;
            kb_hl_support = cdolist_list_var.first();
            while (kb_hl_supports_high.NIL != cdolist_list_var) {
                PrintLow.format(stream, (SubLObject)kb_hl_supports_high.$str52$__s__s__, kb_hl_support_handles.kb_hl_support_id(kb_hl_support), kb_hl_support);
                cdolist_list_var = cdolist_list_var.rest();
                kb_hl_support = cdolist_list_var.first();
            }
        }
        else {
            PrintLow.format(stream, (SubLObject)kb_hl_supports_high.$str59$___s_KB_HL_supports_have_duplicat, Sequences.length(kb_hl_supports));
        }
        return (SubLObject)kb_hl_supports_high.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 25262L)
    public static SubLObject verify_kb_hl_support_dependents(SubLObject stream) {
        if (stream == kb_hl_supports_high.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject failures = (SubLObject)kb_hl_supports_high.NIL;
        SubLObject error_message = (SubLObject)kb_hl_supports_high.NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)kb_hl_supports_high.$sym47$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    failures = kb_hl_supports_with_invalid_dependents((SubLObject)kb_hl_supports_high.UNPROVIDED);
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)kb_hl_supports_high.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        }
        finally {
            thread.throwStack.pop();
        }
        if (kb_hl_supports_high.NIL != stream) {
            if (kb_hl_supports_high.NIL != error_message) {
                PrintLow.format(stream, (SubLObject)kb_hl_supports_high.$str60$__Error_during_dependent_verifica, error_message);
            }
            if (kb_hl_supports_high.NIL != failures) {
                report_kb_hl_supports_with_invalid_dependents(stream, failures, (SubLObject)kb_hl_supports_high.UNPROVIDED);
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(kb_hl_supports_high.NIL == failures && kb_hl_supports_high.NIL == error_message);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 25770L)
    public static SubLObject report_kb_hl_supports_with_invalid_dependents(final SubLObject stream, final SubLObject kb_hl_supports, SubLObject verboseP) {
        if (verboseP == kb_hl_supports_high.UNPROVIDED) {
            verboseP = (SubLObject)kb_hl_supports_high.NIL;
        }
        if (kb_hl_supports_high.NIL != verboseP) {
            PrintLow.format(stream, (SubLObject)kb_hl_supports_high.$str61$__The_following_KB_HL_supports_ha, Sequences.length(kb_hl_supports));
            SubLObject cdolist_list_var = kb_hl_supports;
            SubLObject kb_hl_support = (SubLObject)kb_hl_supports_high.NIL;
            kb_hl_support = cdolist_list_var.first();
            while (kb_hl_supports_high.NIL != cdolist_list_var) {
                PrintLow.format(stream, (SubLObject)kb_hl_supports_high.$str52$__s__s__, kb_hl_support_handles.kb_hl_support_id(kb_hl_support), kb_hl_support);
                cdolist_list_var = cdolist_list_var.rest();
                kb_hl_support = cdolist_list_var.first();
            }
        }
        else {
            PrintLow.format(stream, (SubLObject)kb_hl_supports_high.$str62$___s_KB_HL_supports_have_invalid_, Sequences.length(kb_hl_supports));
        }
        return (SubLObject)kb_hl_supports_high.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 26254L)
    public static SubLObject verify_kb_hl_support_arguments(SubLObject stream) {
        if (stream == kb_hl_supports_high.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject failures = (SubLObject)kb_hl_supports_high.NIL;
        SubLObject error_message = (SubLObject)kb_hl_supports_high.NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)kb_hl_supports_high.$sym47$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    failures = kb_hl_supports_with_invalid_arguments((SubLObject)kb_hl_supports_high.UNPROVIDED);
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)kb_hl_supports_high.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        }
        finally {
            thread.throwStack.pop();
        }
        if (kb_hl_supports_high.NIL != stream) {
            if (kb_hl_supports_high.NIL != error_message) {
                PrintLow.format(stream, (SubLObject)kb_hl_supports_high.$str63$__Error_during_argument_verificat, error_message);
            }
            if (kb_hl_supports_high.NIL != failures) {
                report_kb_hl_supports_with_invalid_arguments(stream, failures, (SubLObject)kb_hl_supports_high.UNPROVIDED);
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(kb_hl_supports_high.NIL == failures && kb_hl_supports_high.NIL == error_message);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 26758L)
    public static SubLObject report_kb_hl_supports_with_invalid_arguments(final SubLObject stream, final SubLObject kb_hl_supports, SubLObject verboseP) {
        if (verboseP == kb_hl_supports_high.UNPROVIDED) {
            verboseP = (SubLObject)kb_hl_supports_high.NIL;
        }
        if (kb_hl_supports_high.NIL != verboseP) {
            PrintLow.format(stream, (SubLObject)kb_hl_supports_high.$str64$__The_following_KB_HL_supports_ha, Sequences.length(kb_hl_supports));
            SubLObject cdolist_list_var = kb_hl_supports;
            SubLObject kb_hl_support = (SubLObject)kb_hl_supports_high.NIL;
            kb_hl_support = cdolist_list_var.first();
            while (kb_hl_supports_high.NIL != cdolist_list_var) {
                PrintLow.format(stream, (SubLObject)kb_hl_supports_high.$str52$__s__s__, kb_hl_support_handles.kb_hl_support_id(kb_hl_support), kb_hl_support);
                cdolist_list_var = cdolist_list_var.rest();
                kb_hl_support = cdolist_list_var.first();
            }
        }
        else {
            PrintLow.format(stream, (SubLObject)kb_hl_supports_high.$str65$___s_KB_HL_supports_have_invalid_, Sequences.length(kb_hl_supports));
        }
        return (SubLObject)kb_hl_supports_high.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 27239L)
    public static SubLObject verify_kb_hl_support_hl_supports(SubLObject stream) {
        if (stream == kb_hl_supports_high.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject failures = (SubLObject)kb_hl_supports_high.NIL;
        SubLObject error_message = (SubLObject)kb_hl_supports_high.NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)kb_hl_supports_high.$sym47$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    failures = kb_hl_supports_with_invalid_hl_supports();
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)kb_hl_supports_high.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        }
        finally {
            thread.throwStack.pop();
        }
        if (kb_hl_supports_high.NIL != stream) {
            if (kb_hl_supports_high.NIL != error_message) {
                PrintLow.format(stream, (SubLObject)kb_hl_supports_high.$str66$__Error_during_HL_support_verific, error_message);
            }
            if (kb_hl_supports_high.NIL != failures) {
                report_kb_hl_supports_with_invalid_hl_supports(stream, failures, (SubLObject)kb_hl_supports_high.UNPROVIDED);
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(kb_hl_supports_high.NIL == failures && kb_hl_supports_high.NIL == error_message);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 27751L)
    public static SubLObject report_kb_hl_supports_with_invalid_hl_supports(final SubLObject stream, final SubLObject kb_hl_supports, SubLObject verboseP) {
        if (verboseP == kb_hl_supports_high.UNPROVIDED) {
            verboseP = (SubLObject)kb_hl_supports_high.NIL;
        }
        if (kb_hl_supports_high.NIL != verboseP) {
            PrintLow.format(stream, (SubLObject)kb_hl_supports_high.$str67$__The_following_KB_HL_supports_ha, Sequences.length(kb_hl_supports));
            SubLObject cdolist_list_var = kb_hl_supports;
            SubLObject kb_hl_support = (SubLObject)kb_hl_supports_high.NIL;
            kb_hl_support = cdolist_list_var.first();
            while (kb_hl_supports_high.NIL != cdolist_list_var) {
                PrintLow.format(stream, (SubLObject)kb_hl_supports_high.$str52$__s__s__, kb_hl_support_handles.kb_hl_support_id(kb_hl_support), kb_hl_support);
                cdolist_list_var = cdolist_list_var.rest();
                kb_hl_support = cdolist_list_var.first();
            }
        }
        else {
            PrintLow.format(stream, (SubLObject)kb_hl_supports_high.$str68$___s_KB_HL_supports_have_invalid_, Sequences.length(kb_hl_supports));
        }
        return (SubLObject)kb_hl_supports_high.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 28238L)
    public static SubLObject verify_kb_hl_support_backpointers(SubLObject stream) {
        if (stream == kb_hl_supports_high.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject failures = (SubLObject)kb_hl_supports_high.NIL;
        SubLObject error_message = (SubLObject)kb_hl_supports_high.NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)kb_hl_supports_high.$sym47$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    failures = kb_hl_supports_with_missing_backpointers();
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)kb_hl_supports_high.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        }
        finally {
            thread.throwStack.pop();
        }
        if (kb_hl_supports_high.NIL != stream) {
            if (kb_hl_supports_high.NIL != error_message) {
                PrintLow.format(stream, (SubLObject)kb_hl_supports_high.$str69$__Error_during_KB_HL_support_back, error_message);
            }
            if (kb_hl_supports_high.NIL != failures) {
                report_kb_hl_supports_with_missing_backpointers(stream, failures, (SubLObject)kb_hl_supports_high.UNPROVIDED);
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(kb_hl_supports_high.NIL == failures && kb_hl_supports_high.NIL == error_message);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 28768L)
    public static SubLObject report_kb_hl_supports_with_missing_backpointers(final SubLObject stream, final SubLObject kb_hl_supports, SubLObject verboseP) {
        if (verboseP == kb_hl_supports_high.UNPROVIDED) {
            verboseP = (SubLObject)kb_hl_supports_high.NIL;
        }
        if (kb_hl_supports_high.NIL != verboseP) {
            PrintLow.format(stream, (SubLObject)kb_hl_supports_high.$str70$__The_following_KB_HL_supports_ha, Sequences.length(kb_hl_supports));
            SubLObject cdolist_list_var = kb_hl_supports;
            SubLObject kb_hl_support = (SubLObject)kb_hl_supports_high.NIL;
            kb_hl_support = cdolist_list_var.first();
            while (kb_hl_supports_high.NIL != cdolist_list_var) {
                PrintLow.format(stream, (SubLObject)kb_hl_supports_high.$str52$__s__s__, kb_hl_support_handles.kb_hl_support_id(kb_hl_support), kb_hl_support);
                cdolist_list_var = cdolist_list_var.rest();
                kb_hl_support = cdolist_list_var.first();
            }
        }
        else {
            PrintLow.format(stream, (SubLObject)kb_hl_supports_high.$str71$___s_KB_HL_supports_have_missing_, Sequences.length(kb_hl_supports));
        }
        return (SubLObject)kb_hl_supports_high.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 29336L)
    public static SubLObject enqueueing_kb_hl_supports_for_tmsP_int() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return queues.queue_p(kb_hl_supports_high.$tms_kb_hl_support_queue$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 29440L)
    public static SubLObject enqueueing_kb_hl_supports_for_tmsP() {
        return enqueueing_kb_hl_supports_for_tmsP_int();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 29596L)
    public static SubLObject with_kb_hl_support_rejustification(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.list((SubLObject)kb_hl_supports_high.$sym16$PIF, (SubLObject)kb_hl_supports_high.$list74, reader.bq_cons((SubLObject)kb_hl_supports_high.$sym75$PROGN, ConsesLow.append(body, (SubLObject)kb_hl_supports_high.NIL)), (SubLObject)ConsesLow.listS((SubLObject)kb_hl_supports_high.$sym35$CLET, (SubLObject)kb_hl_supports_high.$list76, ConsesLow.append(body, (SubLObject)kb_hl_supports_high.$list77)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 29862L)
    public static SubLObject process_tms_kb_hl_support_queue() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        while (kb_hl_supports_high.NIL == queues.queue_empty_p(kb_hl_supports_high.$tms_kb_hl_support_queue$.getDynamicValue(thread))) {
            final SubLObject kb_hl_support = queues.dequeue(kb_hl_supports_high.$tms_kb_hl_support_queue$.getDynamicValue(thread));
            if (kb_hl_support_handles.kb_hl_support_id(kb_hl_support).isInteger()) {
                rejustify_or_remove_kb_hl_support(kb_hl_support);
            }
        }
        return (SubLObject)kb_hl_supports_high.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 30204L)
    public static SubLObject enqueue_kb_hl_support_for_tms(final SubLObject kb_hl_support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject hl_support = kb_hl_support_hl_support(kb_hl_support);
        kb_hl_supports_interface.kb_kb_hl_support_set_argument(kb_hl_support, hl_support);
        queues.enqueue(kb_hl_support, kb_hl_supports_high.$tms_kb_hl_support_queue$.getDynamicValue(thread));
        return (SubLObject)kb_hl_supports_high.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 30458L)
    public static SubLObject rejustify_or_remove_kb_hl_support(final SubLObject kb_hl_support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject hl_support = kb_hl_support_hl_support(kb_hl_support);
        SubLObject verifiedP = (SubLObject)kb_hl_supports_high.NIL;
        SubLObject rejustifiedP = (SubLObject)kb_hl_supports_high.NIL;
        if (kb_hl_supports_high.NIL == kb_hl_support_uselessP(kb_hl_support)) {
            SubLObject message_var = (SubLObject)kb_hl_supports_high.NIL;
            final SubLObject was_appendingP = Eval.eval((SubLObject)kb_hl_supports_high.$sym79$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__);
            Eval.eval((SubLObject)kb_hl_supports_high.$list80);
            try {
                try {
                    thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                    final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind((SubLObject)kb_hl_supports_high.$sym47$CATCH_ERROR_MESSAGE_HANDLER, thread);
                        try {
                            verifiedP = hl_supports.hl_verify(hl_support);
                        }
                        catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, (SubLObject)kb_hl_supports_high.NIL);
                        }
                    }
                    finally {
                        Errors.$error_handler$.rebind(_prev_bind_0, thread);
                    }
                }
                catch (Throwable ccatch_env_var) {
                    message_var = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                }
                finally {
                    thread.throwStack.pop();
                }
            }
            finally {
                final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_hl_supports_high.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    Eval.eval((SubLObject)ConsesLow.list((SubLObject)kb_hl_supports_high.$sym81$CSETQ, (SubLObject)kb_hl_supports_high.$sym79$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__, was_appendingP));
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
            if (message_var.isString()) {
                Errors.warn((SubLObject)kb_hl_supports_high.$str82$_A, message_var);
            }
        }
        if (kb_hl_supports_high.NIL != verifiedP) {
            final SubLObject rejustify_result = kb_hl_supports_interface.kb_rejustify_kb_hl_support(kb_hl_support);
            if (kb_hl_supports_high.$kw83$UNJUSTIFIABLE == rejustify_result) {
                tms_remove_kb_hl_support(kb_hl_support);
            }
            else {
                rejustifiedP = (SubLObject)kb_hl_supports_high.T;
            }
        }
        else {
            tms_remove_kb_hl_support(kb_hl_support);
        }
        return rejustifiedP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 31008L)
    public static SubLObject tms_possibly_rejustify_kb_hl_support(final SubLObject kb_hl_support) {
        return (SubLObject)((kb_hl_supports_high.NIL != enqueueing_kb_hl_supports_for_tmsP()) ? enqueue_kb_hl_support_for_tms(kb_hl_support) : SubLObjectFactory.makeBoolean(kb_hl_supports_high.NIL == possibly_rejustify_kb_hl_support(kb_hl_support)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 31244L)
    public static SubLObject possibly_rejustify_kb_hl_support(final SubLObject kb_hl_support) {
        final SubLObject hl_support = kb_hl_support_hl_support(kb_hl_support);
        SubLObject rejustifiedP = (SubLObject)kb_hl_supports_high.NIL;
        if (kb_hl_supports_high.NIL != Sequences.find_if((SubLObject)kb_hl_supports_high.$sym84$TMS_FORT_TO_KILL_, hl_support, (SubLObject)kb_hl_supports_high.UNPROVIDED, (SubLObject)kb_hl_supports_high.UNPROVIDED, (SubLObject)kb_hl_supports_high.UNPROVIDED)) {
            return (SubLObject)kb_hl_supports_high.NIL;
        }
        if (kb_hl_supports_high.NIL != hl_supports.hl_verify(hl_support)) {
            final SubLObject rejustify_result = kb_hl_supports_interface.kb_rejustify_kb_hl_support(kb_hl_support);
            if (kb_hl_supports_high.$kw83$UNJUSTIFIABLE == rejustify_result) {
                handle_unverifiable_kb_hl_support(kb_hl_support);
            }
            else {
                rejustifiedP = (SubLObject)kb_hl_supports_high.T;
            }
        }
        else {
            handle_unverifiable_kb_hl_support(kb_hl_support);
        }
        return rejustifiedP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 31764L)
    public static SubLObject verify_kb_hl_support(final SubLObject kb_hl_support) {
        final SubLObject hl_support = kb_hl_support_hl_support(kb_hl_support);
        final SubLObject verifiedP = hl_supports.hl_verify(hl_support);
        if (kb_hl_supports_high.NIL == verifiedP) {
            handle_unverifiable_kb_hl_support(kb_hl_support);
        }
        return verifiedP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 32024L)
    public static SubLObject handle_unverifiable_kb_hl_support(final SubLObject kb_hl_support) {
        final SubLObject argument = kb_hl_supports_interface.kb_kb_hl_support_argument(kb_hl_support);
        if (kb_hl_supports_high.NIL != deduction_handles.deduction_p(argument)) {
            if (kb_hl_supports_high.NIL != tms.tms_argument_being_removedP(argument)) {
                tms_remove_kb_hl_support(kb_hl_support);
            }
            else {
                tms.tms_remove_deduction(argument);
            }
        }
        else {
            tms_remove_kb_hl_support(kb_hl_support);
        }
        return (SubLObject)kb_hl_supports_high.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 32378L)
    public static SubLObject tms_remove_kb_hl_supports_mentioning_term(final SubLObject v_term) {
        SubLObject removed_count = (SubLObject)kb_hl_supports_high.ZERO_INTEGER;
        SubLObject kb_hl_supports_mentioning_term = (SubLObject)kb_hl_supports_high.NIL;
        SubLObject cdolist_list_var = find_kb_hl_supports_mentioning_term(v_term);
        SubLObject kb_hl_support = (SubLObject)kb_hl_supports_high.NIL;
        kb_hl_support = cdolist_list_var.first();
        while (kb_hl_supports_high.NIL != cdolist_list_var) {
            if (kb_hl_supports_high.NIL != arguments.valid_supportP(kb_hl_support, (SubLObject)kb_hl_supports_high.UNPROVIDED)) {
                kb_hl_supports_mentioning_term = (SubLObject)ConsesLow.cons(kb_hl_support, kb_hl_supports_mentioning_term);
            }
            cdolist_list_var = cdolist_list_var.rest();
            kb_hl_support = cdolist_list_var.first();
        }
        cdolist_list_var = kb_hl_supports_mentioning_term;
        kb_hl_support = (SubLObject)kb_hl_supports_high.NIL;
        kb_hl_support = cdolist_list_var.first();
        while (kb_hl_supports_high.NIL != cdolist_list_var) {
            if (kb_hl_supports_high.NIL != kb_hl_support_handles.valid_kb_hl_supportP(kb_hl_support, (SubLObject)kb_hl_supports_high.T)) {
                tms_remove_kb_hl_support(kb_hl_support);
                removed_count = Numbers.add(removed_count, (SubLObject)kb_hl_supports_high.ONE_INTEGER);
            }
            cdolist_list_var = cdolist_list_var.rest();
            kb_hl_support = cdolist_list_var.first();
        }
        return removed_count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 32897L)
    public static SubLObject tms_remove_kb_hl_support(final SubLObject kb_hl_support) {
        final SubLObject set_contents_var = kb_hl_supports_interface.kb_kb_hl_support_dependents(kb_hl_support);
        SubLObject basis_object;
        SubLObject state;
        SubLObject deduction;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)kb_hl_supports_high.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); kb_hl_supports_high.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            deduction = set_contents.do_set_contents_next(basis_object, state);
            if (kb_hl_supports_high.NIL != set_contents.do_set_contents_element_validP(state, deduction)) {
                tms.tms_remove_deduction(deduction);
            }
        }
        kb_hl_supports_interface.kb_remove_kb_hl_support(kb_hl_support);
        return kb_hl_support;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 33307L)
    public static SubLObject bootstrap_kb_hl_supports(SubLObject reconsider_deductionsP) {
        if (reconsider_deductionsP == kb_hl_supports_high.UNPROVIDED) {
            reconsider_deductionsP = (SubLObject)kb_hl_supports_high.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject size = Numbers.ceiling(deduction_handles.deduction_count(), kb_utilities.estimated_deductions_per_hl_support());
        kb_utilities.setup_kb_hl_support_tables(size, (SubLObject)kb_hl_supports_high.NIL);
        final SubLObject _prev_bind_0 = control_vars.$save_asked_queriesP$.currentBinding(thread);
        try {
            control_vars.$save_asked_queriesP$.bind((SubLObject)kb_hl_supports_high.NIL, thread);
            final SubLObject local_state;
            final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
            final SubLObject _prev_bind_0_$46 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                    final SubLObject _prev_bind_0_$47 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = utilities_macros.$progress_note$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = utilities_macros.$progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = utilities_macros.$progress_total$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = utilities_macros.$progress_sofar$.currentBinding(thread);
                    final SubLObject _prev_bind_8 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                    final SubLObject _prev_bind_9 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                    final SubLObject _prev_bind_10 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                    final SubLObject _prev_bind_11 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, (SubLObject)kb_hl_supports_high.SIX_INTEGER), thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind((SubLObject)kb_hl_supports_high.T, thread);
                        utilities_macros.$progress_note$.bind((SubLObject)kb_hl_supports_high.$str85$Bootstrapping_KB_HL_supports, thread);
                        utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                        utilities_macros.$progress_total$.bind(deduction_handles.deduction_count(), thread);
                        utilities_macros.$progress_sofar$.bind((SubLObject)kb_hl_supports_high.ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_index$.bind((SubLObject)kb_hl_supports_high.ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kb_hl_supports_high.NIL, thread);
                        utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kb_hl_supports_high.T, thread);
                        utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                        try {
                            utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                            SubLObject id;
                            SubLObject deduction;
                            for (id = (SubLObject)kb_hl_supports_high.NIL, id = (SubLObject)kb_hl_supports_high.ZERO_INTEGER; id.numL(utilities_macros.$progress_total$.getDynamicValue(thread)); id = Numbers.add(id, (SubLObject)kb_hl_supports_high.ONE_INTEGER)) {
                                deduction = deduction_handles.find_deduction_by_id(id);
                                if (kb_hl_supports_high.NIL != deduction_handles.deduction_p(deduction) && (kb_hl_supports_high.NIL == reconsider_deductionsP || kb_hl_supports_high.NIL == tms.tms_reconsider_deduction(deduction))) {
                                    bootstrap_kb_hl_supports_for_deduction(deduction);
                                }
                                utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)kb_hl_supports_high.ONE_INTEGER), thread);
                                utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$48 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_hl_supports_high.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                utilities_macros.noting_percent_progress_postamble();
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$48, thread);
                            }
                        }
                    }
                    finally {
                        utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_11, thread);
                        utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_10, thread);
                        utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_9, thread);
                        utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_8, thread);
                        utilities_macros.$progress_sofar$.rebind(_prev_bind_7, thread);
                        utilities_macros.$progress_total$.rebind(_prev_bind_6, thread);
                        utilities_macros.$progress_start_time$.rebind(_prev_bind_5, thread);
                        utilities_macros.$progress_note$.rebind(_prev_bind_4, thread);
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_3, thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_2, thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_$47, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$49 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_hl_supports_high.T, thread);
                        final SubLObject _values2 = Values.getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        Values.restoreValuesFromVector(_values2);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$49, thread);
                    }
                }
            }
            finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0_$46, thread);
            }
        }
        finally {
            control_vars.$save_asked_queriesP$.rebind(_prev_bind_0, thread);
        }
        kb_hl_support_handles.finalize_kb_hl_supports((SubLObject)kb_hl_supports_high.UNPROVIDED);
        return kb_hl_support_handles.kb_hl_support_count();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-hl-supports-high.lisp", position = 34092L)
    public static SubLObject bootstrap_kb_hl_supports_for_deduction(final SubLObject deduction) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject old_supports = deductions_high.deduction_supports(deduction);
        SubLObject new_supports = (SubLObject)kb_hl_supports_high.NIL;
        SubLObject cdolist_list_var = old_supports;
        SubLObject support = (SubLObject)kb_hl_supports_high.NIL;
        support = cdolist_list_var.first();
        while (kb_hl_supports_high.NIL != cdolist_list_var) {
            SubLObject error_message = (SubLObject)kb_hl_supports_high.NIL;
            SubLObject new_support = (SubLObject)kb_hl_supports_high.NIL;
            try {
                thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind((SubLObject)kb_hl_supports_high.$sym47$CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        if (kb_hl_supports_high.NIL != subl_promotions.positive_integer_p(kb_hl_supports_high.$debug_bootstrap_kb_hl_supports_seconds$.getDynamicValue(thread))) {
                            final SubLObject _prev_bind_0_$50 = utilities_macros.$noting_progress_delayed_mode_seconds$.currentBinding(thread);
                            final SubLObject _prev_bind_2 = utilities_macros.$noting_progress_delayed_mode_string$.currentBinding(thread);
                            try {
                                utilities_macros.$noting_progress_delayed_mode_seconds$.bind(kb_hl_supports_high.$debug_bootstrap_kb_hl_supports_seconds$.getDynamicValue(thread), thread);
                                utilities_macros.$noting_progress_delayed_mode_string$.bind(Sequences.cconcatenate((SubLObject)kb_hl_supports_high.$str86$Slow_reification_of_, format_nil.format_nil_s_no_copy(support)), thread);
                                final SubLObject str = Sequences.cconcatenate((SubLObject)kb_hl_supports_high.$str86$Slow_reification_of_, format_nil.format_nil_s_no_copy(support));
                                final SubLObject _prev_bind_0_$51 = utilities_macros.$progress_start_time$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$52 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                                final SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                                final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                                final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                                final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding(thread);
                                final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                                final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding(thread);
                                try {
                                    utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                                    utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                                    utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                                    utilities_macros.$progress_notification_count$.bind((SubLObject)kb_hl_supports_high.ZERO_INTEGER, thread);
                                    utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)kb_hl_supports_high.ZERO_INTEGER, thread);
                                    utilities_macros.$progress_count$.bind((SubLObject)kb_hl_supports_high.ZERO_INTEGER, thread);
                                    utilities_macros.$is_noting_progressP$.bind((SubLObject)kb_hl_supports_high.T, thread);
                                    utilities_macros.$silent_progressP$.bind((SubLObject)((kb_hl_supports_high.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : kb_hl_supports_high.T), thread);
                                    utilities_macros.noting_progress_preamble(str);
                                    new_support = possibly_reify_hl_support(support);
                                    utilities_macros.noting_progress_postamble();
                                }
                                finally {
                                    utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
                                    utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
                                    utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
                                    utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                                    utilities_macros.$progress_notification_count$.rebind(_prev_bind_4, thread);
                                    utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                                    utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_1_$52, thread);
                                    utilities_macros.$progress_start_time$.rebind(_prev_bind_0_$51, thread);
                                }
                            }
                            finally {
                                utilities_macros.$noting_progress_delayed_mode_string$.rebind(_prev_bind_2, thread);
                                utilities_macros.$noting_progress_delayed_mode_seconds$.rebind(_prev_bind_0_$50, thread);
                            }
                        }
                        else {
                            new_support = possibly_reify_hl_support(support);
                        }
                    }
                    catch (Throwable catch_var) {
                        Errors.handleThrowable(catch_var, (SubLObject)kb_hl_supports_high.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            }
            catch (Throwable ccatch_env_var) {
                error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            }
            finally {
                thread.throwStack.pop();
            }
            if (kb_hl_supports_high.NIL != error_message) {
                Errors.warn((SubLObject)kb_hl_supports_high.$str87$Could_not_create_KB_HL_support_fo, support, error_message);
            }
            else if (kb_hl_supports_high.NIL != kb_hl_support_handles.valid_kb_hl_supportP(new_support, (SubLObject)kb_hl_supports_high.UNPROVIDED)) {
                kb_hl_supports_interface.kb_kb_hl_support_add_dependent(new_support, deduction);
            }
            else if (kb_hl_supports_high.NIL != kb_hl_support_handles.kb_hl_support_p(new_support)) {
                Errors.warn((SubLObject)kb_hl_supports_high.$str88$Created_invalid_KB_HL_support_for, support, error_message);
                new_support = (SubLObject)kb_hl_supports_high.NIL;
            }
            new_supports = (SubLObject)ConsesLow.cons((kb_hl_supports_high.NIL != new_support) ? new_support : support, new_supports);
            cdolist_list_var = cdolist_list_var.rest();
            support = cdolist_list_var.first();
        }
        deductions_low.reset_deduction_supports(deduction, Sequences.nreverse(new_supports));
        return (SubLObject)kb_hl_supports_high.NIL;
    }
    
    public static SubLObject declare_kb_hl_supports_high_file() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_hl_supports_high", "do_kb_hl_support_arguments", "DO-KB-HL-SUPPORT-ARGUMENTS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_hl_supports_high", "do_kb_hl_support_dependents", "DO-KB-HL-SUPPORT-DEPENDENTS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_hl_supports_high", "do_kb_hl_support_supports", "DO-KB-HL-SUPPORT-SUPPORTS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_hl_supports_high", "do_recent_kb_hl_supports", "DO-RECENT-KB-HL-SUPPORTS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_supports_high", "create_kb_hl_support", "CREATE-KB-HL-SUPPORT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_supports_high", "find_kb_hl_support", "FIND-KB-HL-SUPPORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_supports_high", "find_kb_hl_supports_mentioning_term", "FIND-KB-HL-SUPPORTS-MENTIONING-TERM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_supports_high", "find_or_create_kb_hl_support", "FIND-OR-CREATE-KB-HL-SUPPORT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_supports_high", "find_or_possibly_create_kb_hl_support", "FIND-OR-POSSIBLY-CREATE-KB-HL-SUPPORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_supports_high", "possibly_create_kb_hl_support", "POSSIBLY-CREATE-KB-HL-SUPPORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_supports_high", "kb_hl_support_hl_support", "KB-HL-SUPPORT-HL-SUPPORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_supports_high", "kb_hl_support_justification", "KB-HL-SUPPORT-JUSTIFICATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_supports_high", "kb_hl_support_module", "KB-HL-SUPPORT-MODULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_supports_high", "kb_hl_support_sentence", "KB-HL-SUPPORT-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_supports_high", "kb_hl_support_mt", "KB-HL-SUPPORT-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_supports_high", "kb_hl_support_tv", "KB-HL-SUPPORT-TV", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_supports_high", "kb_hl_support_el_sentence", "KB-HL-SUPPORT-EL-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_supports_high", "kb_hl_support_ist_sentence", "KB-HL-SUPPORT-IST-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_supports_high", "kb_hl_support_el_ist_sentence", "KB-HL-SUPPORT-EL-IST-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_supports_high", "kb_hl_support_elmt", "KB-HL-SUPPORT-ELMT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_supports_high", "kb_hl_support_cons", "KB-HL-SUPPORT-CONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_supports_high", "kb_hl_support_justification_size", "KB-HL-SUPPORT-JUSTIFICATION-SIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_supports_high", "kb_hl_support_uselessP", "KB-HL-SUPPORT-USELESS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_supports_high", "kb_hl_support_unjustifiedP", "KB-HL-SUPPORT-UNJUSTIFIED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_supports_high", "should_remove_kb_hl_supportP", "SHOULD-REMOVE-KB-HL-SUPPORT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_supports_high", "possibly_remove_kb_hl_support", "POSSIBLY-REMOVE-KB-HL-SUPPORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_supports_high", "eliminate_kb_hl_supports_invalid_dependents", "ELIMINATE-KB-HL-SUPPORTS-INVALID-DEPENDENTS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_supports_high", "eliminate_kb_hl_support_invalid_dependents", "ELIMINATE-KB-HL-SUPPORT-INVALID-DEPENDENTS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_supports_high", "destroy_kb_hl_supports_with_invalid_hl_supports", "DESTROY-KB-HL-SUPPORTS-WITH-INVALID-HL-SUPPORTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_supports_high", "possibly_reify_hl_supports", "POSSIBLY-REIFY-HL-SUPPORTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_supports_high", "possibly_reify_hl_support", "POSSIBLY-REIFY-HL-SUPPORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_supports_high", "possibly_unreify_kb_hl_supports", "POSSIBLY-UNREIFY-KB-HL-SUPPORTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_supports_high", "unreify_kb_hl_supports", "UNREIFY-KB-HL-SUPPORTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_supports_high", "unreify_kb_hl_support", "UNREIFY-KB-HL-SUPPORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_supports_high", "random_kb_hl_support", "RANDOM-KB-HL-SUPPORT", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_supports_high", "sample_kb_hl_supports", "SAMPLE-KB-HL-SUPPORTS", 0, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_supports_high", "kb_hl_supports_around_kb_hl_support", "KB-HL-SUPPORTS-AROUND-KB-HL-SUPPORT", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_supports_high", "kb_hl_supports_around", "KB-HL-SUPPORTS-AROUND", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_supports_high", "kb_hl_support_dump_id", "KB-HL-SUPPORT-DUMP-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_supports_high", "find_kb_hl_support_by_dump_id", "FIND-KB-HL-SUPPORT-BY-DUMP-ID", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_hl_supports_high", "with_kb_hl_support_dump_id_table", "WITH-KB-HL-SUPPORT-DUMP-ID-TABLE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_supports_high", "dump_kb_hl_support_indexing_int", "DUMP-KB-HL-SUPPORT-INDEXING-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_supports_high", "load_kb_hl_support_indexing_int", "LOAD-KB-HL-SUPPORT-INDEXING-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_supports_high", "invalid_kb_hl_supportP", "INVALID-KB-HL-SUPPORT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_supports_high", "invalid_kb_hl_support_robustP", "INVALID-KB-HL-SUPPORT-ROBUST?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_supports_high", "kb_hl_support_has_problemsP", "KB-HL-SUPPORT-HAS-PROBLEMS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_supports_high", "kb_hl_support_not_findable_by_hl_supportP", "KB-HL-SUPPORT-NOT-FINDABLE-BY-HL-SUPPORT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_supports_high", "kb_hl_support_circularP", "KB-HL-SUPPORT-CIRCULAR?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_supports_high", "kb_hl_support_circularP_int", "KB-HL-SUPPORT-CIRCULAR?-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_supports_high", "kb_hl_support_has_invalid_dependentP", "KB-HL-SUPPORT-HAS-INVALID-DEPENDENT?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_supports_high", "kb_hl_support_has_invalid_argumentP", "KB-HL-SUPPORT-HAS-INVALID-ARGUMENT?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_supports_high", "kb_hl_support_has_invalid_hl_supportP", "KB-HL-SUPPORT-HAS-INVALID-HL-SUPPORT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_supports_high", "kb_hl_support_has_missing_backpointerP", "KB-HL-SUPPORT-HAS-MISSING-BACKPOINTER?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_supports_high", "kb_hl_support_has_dependent_with_supportP", "KB-HL-SUPPORT-HAS-DEPENDENT-WITH-SUPPORT?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_supports_high", "kb_hl_supports_not_findable_by_hl_support", "KB-HL-SUPPORTS-NOT-FINDABLE-BY-HL-SUPPORT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_supports_high", "circular_kb_hl_supports", "CIRCULAR-KB-HL-SUPPORTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_supports_high", "duplicate_kb_hl_supports", "DUPLICATE-KB-HL-SUPPORTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_supports_high", "kb_hl_supports_with_invalid_dependents", "KB-HL-SUPPORTS-WITH-INVALID-DEPENDENTS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_supports_high", "kb_hl_supports_with_invalid_arguments", "KB-HL-SUPPORTS-WITH-INVALID-ARGUMENTS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_supports_high", "kb_hl_supports_with_invalid_hl_supports", "KB-HL-SUPPORTS-WITH-INVALID-HL-SUPPORTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_supports_high", "kb_hl_supports_with_missing_backpointers", "KB-HL-SUPPORTS-WITH-MISSING-BACKPOINTERS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_supports_high", "verify_kb_hl_supports", "VERIFY-KB-HL-SUPPORTS", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_supports_high", "verify_kb_hl_support_indexing", "VERIFY-KB-HL-SUPPORT-INDEXING", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_supports_high", "report_kb_hl_support_indexing_failures", "REPORT-KB-HL-SUPPORT-INDEXING-FAILURES", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_supports_high", "verify_kb_hl_supports_non_circular", "VERIFY-KB-HL-SUPPORTS-NON-CIRCULAR", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_supports_high", "report_circular_kb_hl_supports", "REPORT-CIRCULAR-KB-HL-SUPPORTS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_supports_high", "verify_kb_hl_support_uniqueness", "VERIFY-KB-HL-SUPPORT-UNIQUENESS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_supports_high", "report_duplicate_kb_hl_supports", "REPORT-DUPLICATE-KB-HL-SUPPORTS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_supports_high", "verify_kb_hl_support_dependents", "VERIFY-KB-HL-SUPPORT-DEPENDENTS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_supports_high", "report_kb_hl_supports_with_invalid_dependents", "REPORT-KB-HL-SUPPORTS-WITH-INVALID-DEPENDENTS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_supports_high", "verify_kb_hl_support_arguments", "VERIFY-KB-HL-SUPPORT-ARGUMENTS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_supports_high", "report_kb_hl_supports_with_invalid_arguments", "REPORT-KB-HL-SUPPORTS-WITH-INVALID-ARGUMENTS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_supports_high", "verify_kb_hl_support_hl_supports", "VERIFY-KB-HL-SUPPORT-HL-SUPPORTS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_supports_high", "report_kb_hl_supports_with_invalid_hl_supports", "REPORT-KB-HL-SUPPORTS-WITH-INVALID-HL-SUPPORTS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_supports_high", "verify_kb_hl_support_backpointers", "VERIFY-KB-HL-SUPPORT-BACKPOINTERS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_supports_high", "report_kb_hl_supports_with_missing_backpointers", "REPORT-KB-HL-SUPPORTS-WITH-MISSING-BACKPOINTERS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_supports_high", "enqueueing_kb_hl_supports_for_tmsP_int", "ENQUEUEING-KB-HL-SUPPORTS-FOR-TMS?-INT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_supports_high", "enqueueing_kb_hl_supports_for_tmsP", "ENQUEUEING-KB-HL-SUPPORTS-FOR-TMS?", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_hl_supports_high", "with_kb_hl_support_rejustification", "WITH-KB-HL-SUPPORT-REJUSTIFICATION");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_supports_high", "process_tms_kb_hl_support_queue", "PROCESS-TMS-KB-HL-SUPPORT-QUEUE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_supports_high", "enqueue_kb_hl_support_for_tms", "ENQUEUE-KB-HL-SUPPORT-FOR-TMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_supports_high", "rejustify_or_remove_kb_hl_support", "REJUSTIFY-OR-REMOVE-KB-HL-SUPPORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_supports_high", "tms_possibly_rejustify_kb_hl_support", "TMS-POSSIBLY-REJUSTIFY-KB-HL-SUPPORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_supports_high", "possibly_rejustify_kb_hl_support", "POSSIBLY-REJUSTIFY-KB-HL-SUPPORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_supports_high", "verify_kb_hl_support", "VERIFY-KB-HL-SUPPORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_supports_high", "handle_unverifiable_kb_hl_support", "HANDLE-UNVERIFIABLE-KB-HL-SUPPORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_supports_high", "tms_remove_kb_hl_supports_mentioning_term", "TMS-REMOVE-KB-HL-SUPPORTS-MENTIONING-TERM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_supports_high", "tms_remove_kb_hl_support", "TMS-REMOVE-KB-HL-SUPPORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_supports_high", "bootstrap_kb_hl_supports", "BOOTSTRAP-KB-HL-SUPPORTS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_hl_supports_high", "bootstrap_kb_hl_supports_for_deduction", "BOOTSTRAP-KB-HL-SUPPORTS-FOR-DEDUCTION", 1, 0, false);
        return (SubLObject)kb_hl_supports_high.NIL;
    }
    
    public static SubLObject init_kb_hl_supports_high_file() {
        kb_hl_supports_high.$unreify_kb_hl_supportsP$ = SubLFiles.defparameter("*UNREIFY-KB-HL-SUPPORTS?*", (SubLObject)kb_hl_supports_high.NIL);
        kb_hl_supports_high.$kb_hl_support_dump_id_table$ = SubLFiles.defparameter("*KB-HL-SUPPORT-DUMP-ID-TABLE*", (SubLObject)kb_hl_supports_high.NIL);
        kb_hl_supports_high.$tms_kb_hl_support_queue$ = SubLFiles.defparameter("*TMS-KB-HL-SUPPORT-QUEUE*", (SubLObject)kb_hl_supports_high.NIL);
        kb_hl_supports_high.$debug_bootstrap_kb_hl_supports_seconds$ = SubLFiles.defparameter("*DEBUG-BOOTSTRAP-KB-HL-SUPPORTS-SECONDS*", (SubLObject)kb_hl_supports_high.NIL);
        return (SubLObject)kb_hl_supports_high.NIL;
    }
    
    public static SubLObject setup_kb_hl_supports_high_file() {
        access_macros.register_macro_helper((SubLObject)kb_hl_supports_high.$sym72$ENQUEUEING_KB_HL_SUPPORTS_FOR_TMS_, (SubLObject)kb_hl_supports_high.$sym73$WITH_KB_HL_SUPPORT_REJUSTIFICATION);
        access_macros.register_macro_helper((SubLObject)kb_hl_supports_high.$sym78$PROCESS_TMS_KB_HL_SUPPORT_QUEUE, (SubLObject)kb_hl_supports_high.$sym73$WITH_KB_HL_SUPPORT_REJUSTIFICATION);
        return (SubLObject)kb_hl_supports_high.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_kb_hl_supports_high_file();
    }
    
    @Override
	public void initializeVariables() {
        init_kb_hl_supports_high_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_kb_hl_supports_high_file();
    }
    
    static {
        me = (SubLFile)new kb_hl_supports_high();
        kb_hl_supports_high.$unreify_kb_hl_supportsP$ = null;
        kb_hl_supports_high.$kb_hl_support_dump_id_table$ = null;
        kb_hl_supports_high.$tms_kb_hl_support_queue$ = null;
        kb_hl_supports_high.$debug_bootstrap_kb_hl_supports_seconds$ = null;
        $list0 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ARGUMENT-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("KB-HL-SUPPORT"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list1 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $kw2$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw3$DONE = SubLObjectFactory.makeKeyword("DONE");
        $sym4$DO_LIST = SubLObjectFactory.makeSymbol("DO-LIST");
        $sym5$KB_KB_HL_SUPPORT_ARGUMENTS = SubLObjectFactory.makeSymbol("KB-KB-HL-SUPPORT-ARGUMENTS");
        $list6 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEPENDENT-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("KB-HL-SUPPORT"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym7$DO_SET_CONTENTS = SubLObjectFactory.makeSymbol("DO-SET-CONTENTS");
        $sym8$KB_KB_HL_SUPPORT_DEPENDENTS = SubLObjectFactory.makeSymbol("KB-KB-HL-SUPPORT-DEPENDENTS");
        $list9 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUPPORT-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("KB-HL-SUPPORT"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym10$KB_HL_SUPPORT_JUSTIFICATION = SubLObjectFactory.makeSymbol("KB-HL-SUPPORT-JUSTIFICATION");
        $list11 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("NUM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROGRESS-MESSAGE"), (SubLObject)SubLObjectFactory.makeString("mapping kb-hl-supports for sweep")), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list12 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NUM"), (SubLObject)SubLObjectFactory.makeKeyword("PROGRESS-MESSAGE"), (SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $kw13$NUM = SubLObjectFactory.makeKeyword("NUM");
        $kw14$PROGRESS_MESSAGE = SubLObjectFactory.makeKeyword("PROGRESS-MESSAGE");
        $str15$mapping_kb_hl_supports_for_sweep = SubLObjectFactory.makeString("mapping kb-hl-supports for sweep");
        $sym16$PIF = SubLObjectFactory.makeSymbol("PIF");
        $sym17$POSITIVE_INTEGER_P = SubLObjectFactory.makeSymbol("POSITIVE-INTEGER-P");
        $sym18$PROGRESS_CSOME = SubLObjectFactory.makeSymbol("PROGRESS-CSOME");
        $sym19$KB_HL_SUPPORTS_AROUND = SubLObjectFactory.makeSymbol("KB-HL-SUPPORTS-AROUND");
        $list20 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEXT-KB-HL-SUPPORT-ID"));
        $sym21$DO_KB_HL_SUPPORTS = SubLObjectFactory.makeSymbol("DO-KB-HL-SUPPORTS");
        $sym22$KB_HL_SUPPORT_P = SubLObjectFactory.makeSymbol("KB-HL-SUPPORT-P");
        $str23$Eliminating_invalid_KB_HL_support = SubLObjectFactory.makeString("Eliminating invalid KB HL support dependents");
        $sym24$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $kw25$SKIP = SubLObjectFactory.makeKeyword("SKIP");
        $sym26$VALID_DEDUCTION_ = SubLObjectFactory.makeSymbol("VALID-DEDUCTION?");
        $str27$Eliminating_KB_HL_supports_with_i = SubLObjectFactory.makeString("Eliminating KB HL supports with invalid HL supports");
        $sym28$POSSIBLY_REIFY_HL_SUPPORT = SubLObjectFactory.makeSymbol("POSSIBLY-REIFY-HL-SUPPORT");
        $sym29$UNREIFY_KB_HL_SUPPORT = SubLObjectFactory.makeSymbol("UNREIFY-KB-HL-SUPPORT");
        $sym30$TRUE = SubLObjectFactory.makeSymbol("TRUE");
        $int31$500 = SubLObjectFactory.makeInteger(500);
        $sym32$NON_NEGATIVE_INTEGER_P = SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P");
        $int33$100 = SubLObjectFactory.makeInteger(100);
        $sym34$FIND_KB_HL_SUPPORT_BY_ID = SubLObjectFactory.makeSymbol("FIND-KB-HL-SUPPORT-BY-ID");
        $sym35$CLET = SubLObjectFactory.makeSymbol("CLET");
        $list36 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*KB-HL-SUPPORT-DUMP-ID-TABLE*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CREATE-KB-HL-SUPPORT-DUMP-ID-TABLE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*CFASL-KB-HL-SUPPORT-HANDLE-FUNC*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("KB-HL-SUPPORT-DUMP-ID"))));
        $sym37$SUPPORT_P = SubLObjectFactory.makeSymbol("SUPPORT-P");
        $str38$Verifying_KB_HL_support_indexing = SubLObjectFactory.makeString("Verifying KB HL support indexing");
        $str39$Searching_for_circular_KB_HL_supp = SubLObjectFactory.makeString("Searching for circular KB HL supports");
        $str40$Searching_for_duplicate_KB_HL_sup = SubLObjectFactory.makeString("Searching for duplicate KB HL supports");
        $sym41$_ = SubLObjectFactory.makeSymbol("<");
        $sym42$KB_HL_SUPPORT_ID = SubLObjectFactory.makeSymbol("KB-HL-SUPPORT-ID");
        $str43$Searching_for_KB_HL_supports_with = SubLObjectFactory.makeString("Searching for KB HL supports with invalid dependents");
        $str44$Searching_for_KB_HL_supports_with = SubLObjectFactory.makeString("Searching for KB HL supports with invalid arguments");
        $str45$Searching_for_KB_HL_supports_with = SubLObjectFactory.makeString("Searching for KB HL supports with invalid HL supports");
        $str46$Searching_for_KB_HL_supports_with = SubLObjectFactory.makeString("Searching for KB HL supports with missing backpointers");
        $sym47$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $str48$Verifying_KB_HL_supports = SubLObjectFactory.makeString("Verifying KB HL supports");
        $str49$__Error_during_KB_HL_support_veri = SubLObjectFactory.makeString("~&Error during KB HL support verification: ~a~%");
        $str50$__Error_during_indexing_verificat = SubLObjectFactory.makeString("~&Error during indexing verification: ~a~%");
        $str51$__The_following_KB_HL_supports_we = SubLObjectFactory.makeString("~&The following KB HL supports were not findable via their HL supports (~s in total):~%");
        $str52$__s__s__ = SubLObjectFactory.makeString(" ~s ~s~%");
        $str53$___s_KB_HL_supports_are_not_finda = SubLObjectFactory.makeString("~&~s KB HL supports are not findable via their HL supports.~%");
        $str54$__Error_during_non_circularity_ve = SubLObjectFactory.makeString("~&Error during non-circularity verification: ~a~%");
        $str55$__The_following_KB_HL_supports_ar = SubLObjectFactory.makeString("~&The following KB HL supports are circular (~s in total):~%");
        $str56$___s_KB_HL_supports_are_circular_ = SubLObjectFactory.makeString("~&~s KB HL supports are circular.~%");
        $str57$__Error_during_uniqueness_verific = SubLObjectFactory.makeString("~&Error during uniqueness verification: ~a~%");
        $str58$__The_following_KB_HL_supports_ha = SubLObjectFactory.makeString("~&The following KB HL supports have duplicates (~s in total):~%");
        $str59$___s_KB_HL_supports_have_duplicat = SubLObjectFactory.makeString("~&~s KB HL supports have duplicates.~%");
        $str60$__Error_during_dependent_verifica = SubLObjectFactory.makeString("~&Error during dependent verification: ~a~%");
        $str61$__The_following_KB_HL_supports_ha = SubLObjectFactory.makeString("~&The following KB HL supports have invalid dependents (~s in total):~%");
        $str62$___s_KB_HL_supports_have_invalid_ = SubLObjectFactory.makeString("~&~s KB HL supports have invalid dependents.~%");
        $str63$__Error_during_argument_verificat = SubLObjectFactory.makeString("~&Error during argument verification: ~a~%");
        $str64$__The_following_KB_HL_supports_ha = SubLObjectFactory.makeString("~&The following KB HL supports have invalid arguments (~s in total):~%");
        $str65$___s_KB_HL_supports_have_invalid_ = SubLObjectFactory.makeString("~&~s KB HL supports have invalid arguments.~%");
        $str66$__Error_during_HL_support_verific = SubLObjectFactory.makeString("~&Error during HL support verification: ~a~%");
        $str67$__The_following_KB_HL_supports_ha = SubLObjectFactory.makeString("~&The following KB HL supports have invalid HL supports (~s in total):~%");
        $str68$___s_KB_HL_supports_have_invalid_ = SubLObjectFactory.makeString("~&~s KB HL supports have invalid HL supports.~%");
        $str69$__Error_during_KB_HL_support_back = SubLObjectFactory.makeString("~&Error during KB HL support backpointer verification: ~a~%");
        $str70$__The_following_KB_HL_supports_ha = SubLObjectFactory.makeString("~&The following KB HL supports have missing backpointers (~s in total):~%");
        $str71$___s_KB_HL_supports_have_missing_ = SubLObjectFactory.makeString("~&~s KB HL supports have missing backpointers.~%");
        $sym72$ENQUEUEING_KB_HL_SUPPORTS_FOR_TMS_ = SubLObjectFactory.makeSymbol("ENQUEUEING-KB-HL-SUPPORTS-FOR-TMS?");
        $sym73$WITH_KB_HL_SUPPORT_REJUSTIFICATION = SubLObjectFactory.makeSymbol("WITH-KB-HL-SUPPORT-REJUSTIFICATION");
        $list74 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ENQUEUEING-KB-HL-SUPPORTS-FOR-TMS?"));
        $sym75$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $list76 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*TMS-KB-HL-SUPPORT-QUEUE*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CREATE-QUEUE"))));
        $list77 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROCESS-TMS-KB-HL-SUPPORT-QUEUE")));
        $sym78$PROCESS_TMS_KB_HL_SUPPORT_QUEUE = SubLObjectFactory.makeSymbol("PROCESS-TMS-KB-HL-SUPPORT-QUEUE");
        $sym79$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__ = SubLObjectFactory.makeSymbol("*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*");
        $list80 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*"), (SubLObject)kb_hl_supports_high.NIL);
        $sym81$CSETQ = SubLObjectFactory.makeSymbol("CSETQ");
        $str82$_A = SubLObjectFactory.makeString("~A");
        $kw83$UNJUSTIFIABLE = SubLObjectFactory.makeKeyword("UNJUSTIFIABLE");
        $sym84$TMS_FORT_TO_KILL_ = SubLObjectFactory.makeSymbol("TMS-FORT-TO-KILL?");
        $str85$Bootstrapping_KB_HL_supports = SubLObjectFactory.makeString("Bootstrapping KB HL supports");
        $str86$Slow_reification_of_ = SubLObjectFactory.makeString("Slow reification of ");
        $str87$Could_not_create_KB_HL_support_fo = SubLObjectFactory.makeString("Could not create KB HL support for ~s because ~a");
        $str88$Created_invalid_KB_HL_support_for = SubLObjectFactory.makeString("Created invalid KB HL support for ~s");
    }
}

/*

	Total time: 1069 ms
	
*/