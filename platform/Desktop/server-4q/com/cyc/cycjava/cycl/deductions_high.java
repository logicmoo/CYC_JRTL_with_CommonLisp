package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
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

public final class deductions_high extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.deductions_high";
    public static final String myFingerPrint = "a039d6d2e83a3ce998f53b8cf341cdd51d0d90353ce2e360e427ff276caa2c13";
    @SubLTranslatedFile.SubL(source = "cycl/deductions-high.lisp", position = 13399L)
    public static SubLSymbol $deduction_dump_id_table$;
    private static final SubLList $list0;
    private static final SubLList $list1;
    private static final SubLSymbol $kw2$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw3$DONE;
    private static final SubLSymbol $sym4$DO_LIST;
    private static final SubLSymbol $sym5$DEDUCTION_SUPPORTS;
    private static final SubLList $list6;
    private static final SubLList $list7;
    private static final SubLSymbol $kw8$PROGRESS_MESSAGE;
    private static final SubLSymbol $sym9$PROGRESS_MESSAGE_VAR;
    private static final SubLSymbol $sym10$CLET;
    private static final SubLSymbol $sym11$DO_DEDUCTIONS_BACKWARDS;
    private static final SubLSymbol $sym12$SOFAR_VAR;
    private static final SubLSymbol $sym13$TOTAL_VAR;
    private static final SubLList $list14;
    private static final SubLList $list15;
    private static final SubLSymbol $sym16$NOTING_PERCENT_PROGRESS;
    private static final SubLSymbol $sym17$NOTE_PERCENT_PROGRESS;
    private static final SubLSymbol $sym18$CINC;
    private static final SubLSymbol $sym19$ID_VAR;
    private static final SubLSymbol $sym20$DO_NUMBERS;
    private static final SubLSymbol $kw21$START;
    private static final SubLList $list22;
    private static final SubLSymbol $kw23$END;
    private static final SubLSymbol $kw24$DELTA;
    private static final SubLSymbol $sym25$FIND_DEDUCTION_BY_ID;
    private static final SubLSymbol $sym26$PWHEN;
    private static final SubLList $list27;
    private static final SubLList $list28;
    private static final SubLSymbol $kw29$NUM;
    private static final SubLString $str30$mapping_deductions_for_sweep;
    private static final SubLSymbol $sym31$PIF;
    private static final SubLSymbol $sym32$POSITIVE_INTEGER_P;
    private static final SubLSymbol $sym33$PROGRESS_CSOME;
    private static final SubLSymbol $sym34$DEDUCTIONS_AROUND;
    private static final SubLSymbol $sym35$DO_DEDUCTIONS;
    private static final SubLSymbol $kw36$DEDUCTION;
    private static final SubLSymbol $sym37$HL_JUSTIFICATION_P;
    private static final SubLSymbol $sym38$BINDINGS_P;
    private static final SubLSymbol $sym39$LISTP;
    private static final SubLSymbol $sym40$DEDUCTION_P;
    private static final SubLSymbol $kw41$TRUE;
    private static final SubLSymbol $sym42$TRUE;
    private static final SubLInteger $int43$500;
    private static final SubLSymbol $sym44$NON_NEGATIVE_INTEGER_P;
    private static final SubLSymbol $sym45$SUPPORT_EQUAL;
    private static final SubLObject $const46$skolem;
    private static final SubLSymbol $sym47$DEDUCTION_ASSERTION;
    private static final SubLList $list48;
    private static final SubLString $str49$Return_the_support_for_which_DEDU;
    private static final SubLList $list50;
    private static final SubLList $list51;
    private static final SubLSymbol $sym52$DEDUCTION_SUPPORTED_OBJECT;
    private static final SubLSymbol $kw53$UNKNOWN;
    private static final SubLSymbol $sym54$DEDUCTION_TRUTH;
    private static final SubLString $str55$Return_the_truth_of_DEDUCTION____;
    private static final SubLList $list56;
    private static final SubLSymbol $sym57$DEDUCTION_STRENGTH;
    private static final SubLString $str58$Return_the_current_argumentation_;
    private static final SubLList $list59;
    private static final SubLList $list60;
    private static final SubLList $list61;
    private static final SubLInteger $int62$100;
    
    @SubLTranslatedFile.SubL(source = "cycl/deductions-high.lisp", position = 935L)
    public static SubLObject do_deduction_supports(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)deductions_high.$list0);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject support = (SubLObject)deductions_high.NIL;
        SubLObject deduction = (SubLObject)deductions_high.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)deductions_high.$list0);
        support = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)deductions_high.$list0);
        deduction = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)deductions_high.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)deductions_high.NIL;
        SubLObject current_$1 = (SubLObject)deductions_high.NIL;
        while (deductions_high.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)deductions_high.$list0);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)deductions_high.$list0);
            if (deductions_high.NIL == conses_high.member(current_$1, (SubLObject)deductions_high.$list1, (SubLObject)deductions_high.UNPROVIDED, (SubLObject)deductions_high.UNPROVIDED)) {
                bad = (SubLObject)deductions_high.T;
            }
            if (current_$1 == deductions_high.$kw2$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (deductions_high.NIL != bad && deductions_high.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)deductions_high.$list0);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)deductions_high.$kw3$DONE, current);
        final SubLObject done = (SubLObject)((deductions_high.NIL != done_tail) ? conses_high.cadr(done_tail) : deductions_high.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.listS((SubLObject)deductions_high.$sym4$DO_LIST, (SubLObject)ConsesLow.list(support, (SubLObject)ConsesLow.list((SubLObject)deductions_high.$sym5$DEDUCTION_SUPPORTS, deduction), (SubLObject)deductions_high.$kw3$DONE, done), ConsesLow.append(body, (SubLObject)deductions_high.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deductions-high.lisp", position = 1368L)
    public static SubLObject do_deductions_backwards(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)deductions_high.$list6);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject deduction_var = (SubLObject)deductions_high.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)deductions_high.$list6);
        deduction_var = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)deductions_high.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)deductions_high.NIL;
        SubLObject current_$2 = (SubLObject)deductions_high.NIL;
        while (deductions_high.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)deductions_high.$list6);
            current_$2 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)deductions_high.$list6);
            if (deductions_high.NIL == conses_high.member(current_$2, (SubLObject)deductions_high.$list7, (SubLObject)deductions_high.UNPROVIDED, (SubLObject)deductions_high.UNPROVIDED)) {
                bad = (SubLObject)deductions_high.T;
            }
            if (current_$2 == deductions_high.$kw2$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (deductions_high.NIL != bad && deductions_high.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)deductions_high.$list6);
        }
        final SubLObject progress_message_tail = cdestructuring_bind.property_list_member((SubLObject)deductions_high.$kw8$PROGRESS_MESSAGE, current);
        final SubLObject progress_message = (SubLObject)((deductions_high.NIL != progress_message_tail) ? conses_high.cadr(progress_message_tail) : deductions_high.NIL);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)deductions_high.$kw3$DONE, current);
        final SubLObject done = (SubLObject)((deductions_high.NIL != done_tail) ? conses_high.cadr(done_tail) : deductions_high.NIL);
        final SubLObject body;
        current = (body = temp);
        if (!progress_message.isAtom()) {
            final SubLObject progress_message_var = (SubLObject)deductions_high.$sym9$PROGRESS_MESSAGE_VAR;
            return (SubLObject)ConsesLow.list((SubLObject)deductions_high.$sym10$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(progress_message_var, progress_message)), (SubLObject)ConsesLow.listS((SubLObject)deductions_high.$sym11$DO_DEDUCTIONS_BACKWARDS, (SubLObject)ConsesLow.list(deduction_var, (SubLObject)deductions_high.$kw8$PROGRESS_MESSAGE, progress_message_var, (SubLObject)deductions_high.$kw3$DONE, done), ConsesLow.append(body, (SubLObject)deductions_high.NIL)));
        }
        if (deductions_high.NIL != progress_message) {
            final SubLObject sofar_var = (SubLObject)deductions_high.$sym12$SOFAR_VAR;
            final SubLObject total_var = (SubLObject)deductions_high.$sym13$TOTAL_VAR;
            return (SubLObject)ConsesLow.list((SubLObject)deductions_high.$sym10$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(total_var, (SubLObject)deductions_high.$list14), reader.bq_cons(sofar_var, (SubLObject)deductions_high.$list15)), (SubLObject)ConsesLow.list((SubLObject)deductions_high.$sym16$NOTING_PERCENT_PROGRESS, progress_message, (SubLObject)ConsesLow.listS((SubLObject)deductions_high.$sym11$DO_DEDUCTIONS_BACKWARDS, (SubLObject)ConsesLow.list(deduction_var, (SubLObject)deductions_high.$kw3$DONE, done), (SubLObject)ConsesLow.list((SubLObject)deductions_high.$sym17$NOTE_PERCENT_PROGRESS, sofar_var, total_var), (SubLObject)ConsesLow.list((SubLObject)deductions_high.$sym18$CINC, sofar_var), ConsesLow.append(body, (SubLObject)deductions_high.NIL))));
        }
        final SubLObject id_var = (SubLObject)deductions_high.$sym19$ID_VAR;
        return (SubLObject)ConsesLow.list((SubLObject)deductions_high.$sym20$DO_NUMBERS, (SubLObject)ConsesLow.list(new SubLObject[] { id_var, deductions_high.$kw21$START, deductions_high.$list22, deductions_high.$kw23$END, deductions_high.MINUS_ONE_INTEGER, deductions_high.$kw24$DELTA, deductions_high.MINUS_ONE_INTEGER, deductions_high.$kw3$DONE, done }), (SubLObject)ConsesLow.list((SubLObject)deductions_high.$sym10$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(deduction_var, (SubLObject)ConsesLow.list((SubLObject)deductions_high.$sym25$FIND_DEDUCTION_BY_ID, id_var))), (SubLObject)ConsesLow.listS((SubLObject)deductions_high.$sym26$PWHEN, deduction_var, ConsesLow.append(body, (SubLObject)deductions_high.NIL))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deductions-high.lisp", position = 2421L)
    public static SubLObject do_recent_deductions(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)deductions_high.$list27);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)deductions_high.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)deductions_high.$list27);
        var = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)deductions_high.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)deductions_high.NIL;
        SubLObject current_$3 = (SubLObject)deductions_high.NIL;
        while (deductions_high.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)deductions_high.$list27);
            current_$3 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)deductions_high.$list27);
            if (deductions_high.NIL == conses_high.member(current_$3, (SubLObject)deductions_high.$list28, (SubLObject)deductions_high.UNPROVIDED, (SubLObject)deductions_high.UNPROVIDED)) {
                bad = (SubLObject)deductions_high.T;
            }
            if (current_$3 == deductions_high.$kw2$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (deductions_high.NIL != bad && deductions_high.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)deductions_high.$list27);
        }
        final SubLObject num_tail = cdestructuring_bind.property_list_member((SubLObject)deductions_high.$kw29$NUM, current);
        final SubLObject num = (SubLObject)((deductions_high.NIL != num_tail) ? conses_high.cadr(num_tail) : deductions_high.NIL);
        final SubLObject progress_message_tail = cdestructuring_bind.property_list_member((SubLObject)deductions_high.$kw8$PROGRESS_MESSAGE, current);
        final SubLObject progress_message = (SubLObject)((deductions_high.NIL != progress_message_tail) ? conses_high.cadr(progress_message_tail) : deductions_high.$str30$mapping_deductions_for_sweep);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)deductions_high.$kw3$DONE, current);
        final SubLObject done = (SubLObject)((deductions_high.NIL != done_tail) ? conses_high.cadr(done_tail) : deductions_high.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.list((SubLObject)deductions_high.$sym31$PIF, (SubLObject)ConsesLow.list((SubLObject)deductions_high.$sym32$POSITIVE_INTEGER_P, num), (SubLObject)ConsesLow.listS((SubLObject)deductions_high.$sym33$PROGRESS_CSOME, (SubLObject)ConsesLow.list(var, (SubLObject)ConsesLow.list((SubLObject)deductions_high.$sym34$DEDUCTIONS_AROUND, (SubLObject)deductions_high.$list22, num, num), progress_message, done), ConsesLow.append(body, (SubLObject)deductions_high.NIL)), (SubLObject)ConsesLow.listS((SubLObject)deductions_high.$sym35$DO_DEDUCTIONS, (SubLObject)ConsesLow.list(var, progress_message, (SubLObject)deductions_high.$kw3$DONE, done), ConsesLow.append(body, (SubLObject)deductions_high.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deductions-high.lisp", position = 2998L)
    public static SubLObject deduction_spec_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isCons() && deductions_high.$kw36$DEDUCTION == v_object.first() && deductions_high.NIL != arguments.non_empty_hl_justification_p(conses_high.second(v_object)) && (deductions_high.NIL == conses_high.third(v_object) || deductions_high.NIL != bindings.bindings_p(conses_high.third(v_object))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deductions-high.lisp", position = 3456L)
    public static SubLObject create_deduction_spec(final SubLObject supports, SubLObject v_bindings, SubLObject pragmatic_support_mts) {
        if (v_bindings == deductions_high.UNPROVIDED) {
            v_bindings = (SubLObject)deductions_high.NIL;
        }
        if (pragmatic_support_mts == deductions_high.UNPROVIDED) {
            pragmatic_support_mts = (SubLObject)deductions_high.NIL;
        }
        assert deductions_high.NIL != arguments.hl_justification_p(supports) : supports;
        assert deductions_high.NIL != bindings.bindings_p(v_bindings) : v_bindings;
        assert deductions_high.NIL != Types.listp(pragmatic_support_mts) : pragmatic_support_mts;
        final SubLObject canon_supports = arguments.canonicalize_supports(supports, (SubLObject)deductions_high.T);
        return (SubLObject)ConsesLow.list((SubLObject)deductions_high.$kw36$DEDUCTION, canon_supports, v_bindings, pragmatic_support_mts);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deductions-high.lisp", position = 3805L)
    public static SubLObject deduction_to_deduction_spec(final SubLObject deduction) {
        assert deductions_high.NIL != deduction_handles.deduction_p(deduction) : deduction;
        final SubLObject supports = deduction_supports(deduction);
        final SubLObject v_bindings = deduction_bindings(deduction);
        final SubLObject pragmatic_support_mts = deduction_pragmatic_support_mts(deduction);
        final SubLObject deduction_spec = create_deduction_spec(supports, v_bindings, pragmatic_support_mts);
        return deduction_spec;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deductions-high.lisp", position = 4174L)
    public static SubLObject deduction_spec_supports(final SubLObject deduction_spec) {
        return ConsesLow.nth((SubLObject)deductions_high.ONE_INTEGER, deduction_spec);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deductions-high.lisp", position = 4324L)
    public static SubLObject deduction_spec_bindings(final SubLObject deduction_spec) {
        return ConsesLow.nth((SubLObject)deductions_high.TWO_INTEGER, deduction_spec);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deductions-high.lisp", position = 4474L)
    public static SubLObject deduction_spec_pragmatic_support_mts(final SubLObject deduction_spec) {
        return ConsesLow.nth((SubLObject)deductions_high.THREE_INTEGER, deduction_spec);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deductions-high.lisp", position = 4650L)
    public static SubLObject create_deduction_with_tv(final SubLObject assertion, final SubLObject supports, final SubLObject tv, SubLObject v_bindings, SubLObject pragmatic_support_mts) {
        if (v_bindings == deductions_high.UNPROVIDED) {
            v_bindings = (SubLObject)deductions_high.NIL;
        }
        if (pragmatic_support_mts == deductions_high.UNPROVIDED) {
            pragmatic_support_mts = (SubLObject)deductions_high.NIL;
        }
        final SubLObject deduction = create_deduction(assertion, supports, enumeration_types.tv_truth(tv), enumeration_types.tv_strength(tv), v_bindings, pragmatic_support_mts);
        return deduction;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deductions-high.lisp", position = 5052L)
    public static SubLObject create_deduction_for_hl_support(final SubLObject hl_support, final SubLObject justification) {
        final SubLObject tv = arguments.hl_support_tv(hl_support);
        final SubLObject deduction = create_deduction_with_tv(hl_support, justification, tv, (SubLObject)deductions_high.UNPROVIDED, (SubLObject)deductions_high.UNPROVIDED);
        return deduction;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deductions-high.lisp", position = 5313L)
    public static SubLObject create_deduction(final SubLObject assertion, final SubLObject supports, final SubLObject truth, final SubLObject strength, SubLObject v_bindings, SubLObject pragmatic_support_mts) {
        if (v_bindings == deductions_high.UNPROVIDED) {
            v_bindings = (SubLObject)deductions_high.NIL;
        }
        if (pragmatic_support_mts == deductions_high.UNPROVIDED) {
            pragmatic_support_mts = (SubLObject)deductions_high.NIL;
        }
        return deductions_interface.kb_create_deduction(assertion, supports, truth, strength, v_bindings, pragmatic_support_mts);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deductions-high.lisp", position = 5519L)
    public static SubLObject remove_deduction(final SubLObject deduction) {
        return deductions_interface.kb_remove_deduction(deduction);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deductions-high.lisp", position = 5605L)
    public static SubLObject set_deduction_strength(final SubLObject deduction, final SubLObject new_strength) {
        return deductions_interface.kb_set_deduction_strength(deduction, new_strength);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deductions-high.lisp", position = 5802L)
    public static SubLObject find_deduction(final SubLObject supported_object, final SubLObject supports, SubLObject truth) {
        if (truth == deductions_high.UNPROVIDED) {
            truth = (SubLObject)deductions_high.$kw41$TRUE;
        }
        return deductions_interface.kb_lookup_deduction(supported_object, supports, truth);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deductions-high.lisp", position = 6127L)
    public static SubLObject random_deduction(SubLObject test) {
        if (test == deductions_high.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)deductions_high.$sym42$TRUE);
        }
        if (deduction_handles.deduction_count().numG((SubLObject)deductions_high.ZERO_INTEGER)) {
            final SubLObject max_id = deduction_handles.next_deduction_id();
            SubLObject v_answer;
            SubLObject candidate;
            for (v_answer = (SubLObject)deductions_high.NIL; deductions_high.NIL == v_answer; v_answer = candidate) {
                candidate = deduction_handles.find_deduction_by_id(random.random(max_id));
                if (deductions_high.NIL != candidate && deductions_high.NIL != Functions.funcall(test, candidate)) {}
            }
            return v_answer;
        }
        return (SubLObject)deductions_high.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deductions-high.lisp", position = 6583L)
    public static SubLObject sample_deductions(SubLObject n, SubLObject allow_repeatsP, SubLObject test) {
        if (n == deductions_high.UNPROVIDED) {
            n = (SubLObject)deductions_high.$int43$500;
        }
        if (allow_repeatsP == deductions_high.UNPROVIDED) {
            allow_repeatsP = (SubLObject)deductions_high.NIL;
        }
        if (test == deductions_high.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)deductions_high.$sym42$TRUE);
        }
        assert deductions_high.NIL != subl_promotions.non_negative_integer_p(n) : n;
        if (deductions_high.NIL != allow_repeatsP) {
            SubLObject result = (SubLObject)deductions_high.NIL;
            SubLObject i;
            for (i = (SubLObject)deductions_high.NIL, i = (SubLObject)deductions_high.ZERO_INTEGER; i.numL(n); i = Numbers.add(i, (SubLObject)deductions_high.ONE_INTEGER)) {
                result = (SubLObject)ConsesLow.cons(random_deduction(test), result);
            }
            return result;
        }
        SubLObject result;
        for (result = set_contents.new_set_contents(n, Symbols.symbol_function((SubLObject)deductions_high.EQL)); set_contents.set_contents_size(result).numL(n); result = set_contents.set_contents_add(random_deduction(test), result, Symbols.symbol_function((SubLObject)deductions_high.EQL))) {}
        return set_contents.set_contents_element_list(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deductions-high.lisp", position = 7177L)
    public static SubLObject deduction_supports_equal(final SubLObject supports1, final SubLObject supports2) {
        return (SubLObject)SubLObjectFactory.makeBoolean(Sequences.length(supports1).numE(Sequences.length(supports2)) && deductions_high.NIL != list_utilities.sets_equalP(supports1, supports2, (SubLObject)deductions_high.$sym45$SUPPORT_EQUAL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deductions-high.lisp", position = 7429L)
    public static SubLObject deduction_equal(final SubLObject deduction1, final SubLObject deduction2) {
        return (SubLObject)SubLObjectFactory.makeBoolean(deduction_supported_object(deduction1).equal(deduction_supported_object(deduction2)) && arguments.argument_truth(deduction1).eql(arguments.argument_truth(deduction2)) && deductions_high.NIL != deduction_supports_equal(deduction_supports(deduction1), deduction_supports(deduction2)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deductions-high.lisp", position = 7874L)
    public static SubLObject invalid_deduction(final SubLObject deduction, SubLObject robust) {
        if (robust == deductions_high.UNPROVIDED) {
            robust = (SubLObject)deductions_high.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(deductions_high.NIL != deduction_handles.deduction_p(deduction) && deductions_high.NIL == deduction_handles.valid_deduction(deduction, robust));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deductions-high.lisp", position = 8138L)
    public static SubLObject forward_deductionP(final SubLObject deduction) {
        return forward_deduction_intP(deduction, (SubLObject)deductions_high.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deductions-high.lisp", position = 8347L)
    public static SubLObject forward_not_code_deductionP(final SubLObject deduction) {
        return forward_deduction_intP(deduction, (SubLObject)deductions_high.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deductions-high.lisp", position = 8559L)
    public static SubLObject forward_deduction_intP(final SubLObject deduction, final SubLObject include_code_assertionsP) {
        if (deductions_high.NIL != deduction_handles.deduction_p(deduction)) {
            SubLObject shyP;
            SubLObject rest;
            SubLObject support;
            for (shyP = (SubLObject)deductions_high.NIL, rest = (SubLObject)deductions_high.NIL, rest = deduction_supports(deduction); deductions_high.NIL == shyP && deductions_high.NIL != rest; shyP = (SubLObject)SubLObjectFactory.makeBoolean(deductions_high.NIL == assertions_high.forward_assertionP(support) && (deductions_high.NIL == include_code_assertionsP || deductions_high.NIL == assertions_high.code_assertionP(support)) && deductions_high.NIL == kb_hl_support_handles.kb_hl_support_p(support) && deductions_high.NIL == arguments.hl_support_p(support)), rest = rest.rest()) {
                support = rest.first();
            }
            return (SubLObject)SubLObjectFactory.makeBoolean(deductions_high.NIL == shyP);
        }
        return (SubLObject)deductions_high.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deductions-high.lisp", position = 9024L)
    public static SubLObject lifting_deduction_p(final SubLObject deduction) {
        if (deductions_high.NIL != deduction_handles.deduction_p(deduction)) {
            if (deductions_high.NIL != kb_accessors.decontextualized_assertionP(deduction_supported_object(deduction))) {
                return (SubLObject)deductions_high.T;
            }
            SubLObject cdolist_list_var = deduction_supports(deduction);
            SubLObject support = (SubLObject)deductions_high.NIL;
            support = cdolist_list_var.first();
            while (deductions_high.NIL != cdolist_list_var) {
                if (deductions_high.NIL != assertions_high.lifting_assertion_p(support)) {
                    return (SubLObject)deductions_high.T;
                }
                cdolist_list_var = cdolist_list_var.rest();
                support = cdolist_list_var.first();
            }
        }
        return (SubLObject)deductions_high.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deductions-high.lisp", position = 9453L)
    public static SubLObject skolem_deduction_p(final SubLObject deduction) {
        return assertion_utilities.gaf_assertion_with_pred_p(deduction_supported_object(deduction), deductions_high.$const46$skolem);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deductions-high.lisp", position = 9666L)
    public static SubLObject deduction_assertion(final SubLObject deduction) {
        enforceType(deduction, deductions_high.$sym40$DEDUCTION_P);
        return (SubLObject)((deductions_high.NIL != deduction_handles.deduction_handle_validP(deduction)) ? deductions_interface.kb_deduction_supported_object(deduction) : deductions_high.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deductions-high.lisp", position = 10026L)
    public static SubLObject deduction_supported_object(final SubLObject deduction) {
        enforceType(deduction, deductions_high.$sym40$DEDUCTION_P);
        return (SubLObject)((deductions_high.NIL != deduction_handles.deduction_handle_validP(deduction)) ? deductions_interface.kb_deduction_supported_object(deduction) : deductions_high.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deductions-high.lisp", position = 10360L)
    public static SubLObject deduction_truth(final SubLObject deduction) {
        enforceType(deduction, deductions_high.$sym40$DEDUCTION_P);
        if (deductions_high.NIL == deduction_handles.deduction_handle_validP(deduction)) {
            return (SubLObject)deductions_high.$kw53$UNKNOWN;
        }
        return deductions_interface.kb_deduction_truth(deduction);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deductions-high.lisp", position = 10733L)
    public static SubLObject deduction_strength(final SubLObject deduction) {
        enforceType(deduction, deductions_high.$sym40$DEDUCTION_P);
        return (SubLObject)((deductions_high.NIL != deduction_handles.deduction_handle_validP(deduction)) ? deductions_interface.kb_deduction_strength(deduction) : deductions_high.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deductions-high.lisp", position = 11110L)
    public static SubLObject deduction_supports(final SubLObject deduction) {
        assert deductions_high.NIL != deduction_handles.deduction_p(deduction) : deduction;
        return (SubLObject)((deductions_high.NIL != deduction_handles.deduction_handle_validP(deduction)) ? kb_hl_supports_high.possibly_unreify_kb_hl_supports(deductions_interface.kb_deduction_supports(deduction)) : deductions_high.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deductions-high.lisp", position = 11385L)
    public static SubLObject deduction_bindings(final SubLObject deduction) {
        assert deductions_high.NIL != deduction_handles.deduction_p(deduction) : deduction;
        return (SubLObject)((deductions_high.NIL != deduction_handles.deduction_handle_validP(deduction)) ? deductions_interface.kb_deduction_bindings(deduction) : deductions_high.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deductions-high.lisp", position = 11603L)
    public static SubLObject deduction_pragmatic_support_mts(final SubLObject deduction) {
        assert deductions_high.NIL != deduction_handles.deduction_p(deduction) : deduction;
        return (SubLObject)((deductions_high.NIL != deduction_handles.deduction_handle_validP(deduction)) ? deductions_interface.kb_deduction_pragmatic_support_mts(deduction) : deductions_high.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deductions-high.lisp", position = 11860L)
    public static SubLObject deduction_mt(final SubLObject deduction) {
        final SubLObject supported_object = deduction_supported_object(deduction);
        return arguments.support_mt(supported_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deductions-high.lisp", position = 12109L)
    public static SubLObject deduction_id_from_recipe(final SubLObject assertion, final SubLObject supports, SubLObject truth) {
        if (truth == deductions_high.UNPROVIDED) {
            truth = (SubLObject)deductions_high.$kw41$TRUE;
        }
        final SubLObject deduction = find_deduction(assertion, supports, truth);
        return (SubLObject)((deductions_high.NIL != deduction_handles.deduction_p(deduction)) ? deduction_handles.deduction_id(deduction) : deductions_high.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deductions-high.lisp", position = 12527L)
    public static SubLObject deduction_checkpoint_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(deductions_high.NIL != list_utilities.proper_list_p(v_object) && deductions_high.NIL != list_utilities.lengthE(v_object, (SubLObject)deductions_high.TWO_INTEGER, (SubLObject)deductions_high.UNPROVIDED) && deductions_high.NIL != list_utilities.every_in_list((SubLObject)deductions_high.$sym44$NON_NEGATIVE_INTEGER_P, v_object, (SubLObject)deductions_high.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deductions-high.lisp", position = 12819L)
    public static SubLObject new_deduction_checkpoint() {
        final SubLObject deduction_count = deduction_handles.deduction_count();
        final SubLObject next_deduction_id = deduction_handles.next_deduction_id();
        return (SubLObject)ConsesLow.list(deduction_count, next_deduction_id);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deductions-high.lisp", position = 13076L)
    public static SubLObject deduction_checkpoint_currentP(final SubLObject deduction_checkpoint) {
        SubLObject checkpoint_count = (SubLObject)deductions_high.NIL;
        SubLObject checkpoint_next_id = (SubLObject)deductions_high.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(deduction_checkpoint, deduction_checkpoint, (SubLObject)deductions_high.$list60);
        checkpoint_count = deduction_checkpoint.first();
        SubLObject current = deduction_checkpoint.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, deduction_checkpoint, (SubLObject)deductions_high.$list60);
        checkpoint_next_id = current.first();
        current = current.rest();
        if (deductions_high.NIL == current) {
            return (SubLObject)SubLObjectFactory.makeBoolean(checkpoint_count.numE(deduction_handles.deduction_count()) && checkpoint_next_id.numE(deduction_handles.next_deduction_id()));
        }
        cdestructuring_bind.cdestructuring_bind_error(deduction_checkpoint, (SubLObject)deductions_high.$list60);
        return (SubLObject)deductions_high.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deductions-high.lisp", position = 13507L)
    public static SubLObject deduction_dump_id(final SubLObject deduction) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject id = deduction_handles.deduction_id(deduction);
        final SubLObject dump_table = deductions_high.$deduction_dump_id_table$.getDynamicValue(thread);
        if (deductions_high.NIL != dump_table) {
            id = id_index.id_index_lookup(dump_table, id, (SubLObject)deductions_high.UNPROVIDED);
        }
        return id;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deductions-high.lisp", position = 13777L)
    public static SubLObject find_deduction_by_dump_id(final SubLObject dump_id) {
        return deduction_handles.find_deduction_by_id(dump_id);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deductions-high.lisp", position = 13869L)
    public static SubLObject with_deduction_dump_id_table(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)deductions_high.$sym10$CLET, (SubLObject)deductions_high.$list61, ConsesLow.append(body, (SubLObject)deductions_high.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deductions-high.lisp", position = 14081L)
    public static SubLObject deductions_around_deduction(final SubLObject deduction, SubLObject total, SubLObject before, SubLObject after) {
        if (total == deductions_high.UNPROVIDED) {
            total = (SubLObject)deductions_high.$int62$100;
        }
        if (before == deductions_high.UNPROVIDED) {
            before = (SubLObject)deductions_high.ZERO_INTEGER;
        }
        if (after == deductions_high.UNPROVIDED) {
            after = Numbers.subtract(total, before);
        }
        assert deductions_high.NIL != deduction_handles.deduction_p(deduction) : deduction;
        return deductions_around(deduction_handles.deduction_id(deduction), total, before, after);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deductions-high.lisp", position = 15251L)
    public static SubLObject deductions_around(final SubLObject deduction_id, SubLObject total, SubLObject before, SubLObject after) {
        if (total == deductions_high.UNPROVIDED) {
            total = (SubLObject)deductions_high.$int62$100;
        }
        if (before == deductions_high.UNPROVIDED) {
            before = (SubLObject)deductions_high.ZERO_INTEGER;
        }
        if (after == deductions_high.UNPROVIDED) {
            after = Numbers.subtract(total, before);
        }
        assert deductions_high.NIL != subl_promotions.non_negative_integer_p(deduction_id) : deduction_id;
        return assertions_high.kb_objects_around_id((SubLObject)deductions_high.$sym25$FIND_DEDUCTION_BY_ID, (SubLObject)deductions_high.ZERO_INTEGER, deduction_id, deduction_handles.next_deduction_id(), total, before, after);
    }
    
    public static SubLObject declare_deductions_high_file() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.deductions_high", "do_deduction_supports", "DO-DEDUCTION-SUPPORTS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.deductions_high", "do_deductions_backwards", "DO-DEDUCTIONS-BACKWARDS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.deductions_high", "do_recent_deductions", "DO-RECENT-DEDUCTIONS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deductions_high", "deduction_spec_p", "DEDUCTION-SPEC-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deductions_high", "create_deduction_spec", "CREATE-DEDUCTION-SPEC", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deductions_high", "deduction_to_deduction_spec", "DEDUCTION-TO-DEDUCTION-SPEC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deductions_high", "deduction_spec_supports", "DEDUCTION-SPEC-SUPPORTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deductions_high", "deduction_spec_bindings", "DEDUCTION-SPEC-BINDINGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deductions_high", "deduction_spec_pragmatic_support_mts", "DEDUCTION-SPEC-PRAGMATIC-SUPPORT-MTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deductions_high", "create_deduction_with_tv", "CREATE-DEDUCTION-WITH-TV", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deductions_high", "create_deduction_for_hl_support", "CREATE-DEDUCTION-FOR-HL-SUPPORT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deductions_high", "create_deduction", "CREATE-DEDUCTION", 4, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deductions_high", "remove_deduction", "REMOVE-DEDUCTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deductions_high", "set_deduction_strength", "SET-DEDUCTION-STRENGTH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deductions_high", "find_deduction", "FIND-DEDUCTION", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deductions_high", "random_deduction", "RANDOM-DEDUCTION", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deductions_high", "sample_deductions", "SAMPLE-DEDUCTIONS", 0, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deductions_high", "deduction_supports_equal", "DEDUCTION-SUPPORTS-EQUAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deductions_high", "deduction_equal", "DEDUCTION-EQUAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deductions_high", "invalid_deduction", "INVALID-DEDUCTION", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deductions_high", "forward_deductionP", "FORWARD-DEDUCTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deductions_high", "forward_not_code_deductionP", "FORWARD-NOT-CODE-DEDUCTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deductions_high", "forward_deduction_intP", "FORWARD-DEDUCTION-INT?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deductions_high", "lifting_deduction_p", "LIFTING-DEDUCTION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deductions_high", "skolem_deduction_p", "SKOLEM-DEDUCTION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deductions_high", "deduction_assertion", "DEDUCTION-ASSERTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deductions_high", "deduction_supported_object", "DEDUCTION-SUPPORTED-OBJECT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deductions_high", "deduction_truth", "DEDUCTION-TRUTH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deductions_high", "deduction_strength", "DEDUCTION-STRENGTH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deductions_high", "deduction_supports", "DEDUCTION-SUPPORTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deductions_high", "deduction_bindings", "DEDUCTION-BINDINGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deductions_high", "deduction_pragmatic_support_mts", "DEDUCTION-PRAGMATIC-SUPPORT-MTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deductions_high", "deduction_mt", "DEDUCTION-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deductions_high", "deduction_id_from_recipe", "DEDUCTION-ID-FROM-RECIPE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deductions_high", "deduction_checkpoint_p", "DEDUCTION-CHECKPOINT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deductions_high", "new_deduction_checkpoint", "NEW-DEDUCTION-CHECKPOINT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deductions_high", "deduction_checkpoint_currentP", "DEDUCTION-CHECKPOINT-CURRENT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deductions_high", "deduction_dump_id", "DEDUCTION-DUMP-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deductions_high", "find_deduction_by_dump_id", "FIND-DEDUCTION-BY-DUMP-ID", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.deductions_high", "with_deduction_dump_id_table", "WITH-DEDUCTION-DUMP-ID-TABLE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deductions_high", "deductions_around_deduction", "DEDUCTIONS-AROUND-DEDUCTION", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deductions_high", "deductions_around", "DEDUCTIONS-AROUND", 1, 3, false);
        return (SubLObject)deductions_high.NIL;
    }
    
    public static SubLObject init_deductions_high_file() {
        deductions_high.$deduction_dump_id_table$ = SubLFiles.defparameter("*DEDUCTION-DUMP-ID-TABLE*", (SubLObject)deductions_high.NIL);
        return (SubLObject)deductions_high.NIL;
    }
    
    public static SubLObject setup_deductions_high_file() {
        utilities_macros.register_obsolete_cyc_api_function((SubLObject)deductions_high.$sym47$DEDUCTION_ASSERTION, (SubLObject)deductions_high.NIL, (SubLObject)deductions_high.$list48, (SubLObject)deductions_high.$str49$Return_the_support_for_which_DEDU, (SubLObject)deductions_high.$list50, (SubLObject)deductions_high.$list51);
        utilities_macros.register_cyc_api_function((SubLObject)deductions_high.$sym52$DEDUCTION_SUPPORTED_OBJECT, (SubLObject)deductions_high.$list48, (SubLObject)deductions_high.$str49$Return_the_support_for_which_DEDU, (SubLObject)deductions_high.$list50, (SubLObject)deductions_high.$list51);
        utilities_macros.register_cyc_api_function((SubLObject)deductions_high.$sym54$DEDUCTION_TRUTH, (SubLObject)deductions_high.$list48, (SubLObject)deductions_high.$str55$Return_the_truth_of_DEDUCTION____, (SubLObject)deductions_high.$list50, (SubLObject)deductions_high.$list56);
        utilities_macros.register_cyc_api_function((SubLObject)deductions_high.$sym57$DEDUCTION_STRENGTH, (SubLObject)deductions_high.$list48, (SubLObject)deductions_high.$str58$Return_the_current_argumentation_, (SubLObject)deductions_high.$list50, (SubLObject)deductions_high.$list59);
        return (SubLObject)deductions_high.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_deductions_high_file();
    }
    
    @Override
	public void initializeVariables() {
        init_deductions_high_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_deductions_high_file();
    }
    
    static {
        me = (SubLFile)new deductions_high();
        deductions_high.$deduction_dump_id_table$ = null;
        $list0 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUPPORT"), (SubLObject)SubLObjectFactory.makeSymbol("DEDUCTION"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list1 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $kw2$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw3$DONE = SubLObjectFactory.makeKeyword("DONE");
        $sym4$DO_LIST = SubLObjectFactory.makeSymbol("DO-LIST");
        $sym5$DEDUCTION_SUPPORTS = SubLObjectFactory.makeSymbol("DEDUCTION-SUPPORTS");
        $list6 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEDUCTION-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("PROGRESS-MESSAGE"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list7 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROGRESS-MESSAGE"), (SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $kw8$PROGRESS_MESSAGE = SubLObjectFactory.makeKeyword("PROGRESS-MESSAGE");
        $sym9$PROGRESS_MESSAGE_VAR = SubLObjectFactory.makeUninternedSymbol("PROGRESS-MESSAGE-VAR");
        $sym10$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym11$DO_DEDUCTIONS_BACKWARDS = SubLObjectFactory.makeSymbol("DO-DEDUCTIONS-BACKWARDS");
        $sym12$SOFAR_VAR = SubLObjectFactory.makeUninternedSymbol("SOFAR-VAR");
        $sym13$TOTAL_VAR = SubLObjectFactory.makeUninternedSymbol("TOTAL-VAR");
        $list14 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEDUCTION-COUNT")));
        $list15 = ConsesLow.list((SubLObject)deductions_high.ZERO_INTEGER);
        $sym16$NOTING_PERCENT_PROGRESS = SubLObjectFactory.makeSymbol("NOTING-PERCENT-PROGRESS");
        $sym17$NOTE_PERCENT_PROGRESS = SubLObjectFactory.makeSymbol("NOTE-PERCENT-PROGRESS");
        $sym18$CINC = SubLObjectFactory.makeSymbol("CINC");
        $sym19$ID_VAR = SubLObjectFactory.makeUninternedSymbol("ID-VAR");
        $sym20$DO_NUMBERS = SubLObjectFactory.makeSymbol("DO-NUMBERS");
        $kw21$START = SubLObjectFactory.makeKeyword("START");
        $list22 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEXT-DEDUCTION-ID"));
        $kw23$END = SubLObjectFactory.makeKeyword("END");
        $kw24$DELTA = SubLObjectFactory.makeKeyword("DELTA");
        $sym25$FIND_DEDUCTION_BY_ID = SubLObjectFactory.makeSymbol("FIND-DEDUCTION-BY-ID");
        $sym26$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
        $list27 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("NUM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROGRESS-MESSAGE"), (SubLObject)SubLObjectFactory.makeString("mapping deductions for sweep")), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list28 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NUM"), (SubLObject)SubLObjectFactory.makeKeyword("PROGRESS-MESSAGE"), (SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $kw29$NUM = SubLObjectFactory.makeKeyword("NUM");
        $str30$mapping_deductions_for_sweep = SubLObjectFactory.makeString("mapping deductions for sweep");
        $sym31$PIF = SubLObjectFactory.makeSymbol("PIF");
        $sym32$POSITIVE_INTEGER_P = SubLObjectFactory.makeSymbol("POSITIVE-INTEGER-P");
        $sym33$PROGRESS_CSOME = SubLObjectFactory.makeSymbol("PROGRESS-CSOME");
        $sym34$DEDUCTIONS_AROUND = SubLObjectFactory.makeSymbol("DEDUCTIONS-AROUND");
        $sym35$DO_DEDUCTIONS = SubLObjectFactory.makeSymbol("DO-DEDUCTIONS");
        $kw36$DEDUCTION = SubLObjectFactory.makeKeyword("DEDUCTION");
        $sym37$HL_JUSTIFICATION_P = SubLObjectFactory.makeSymbol("HL-JUSTIFICATION-P");
        $sym38$BINDINGS_P = SubLObjectFactory.makeSymbol("BINDINGS-P");
        $sym39$LISTP = SubLObjectFactory.makeSymbol("LISTP");
        $sym40$DEDUCTION_P = SubLObjectFactory.makeSymbol("DEDUCTION-P");
        $kw41$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $sym42$TRUE = SubLObjectFactory.makeSymbol("TRUE");
        $int43$500 = SubLObjectFactory.makeInteger(500);
        $sym44$NON_NEGATIVE_INTEGER_P = SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P");
        $sym45$SUPPORT_EQUAL = SubLObjectFactory.makeSymbol("SUPPORT-EQUAL");
        $const46$skolem = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("skolem"));
        $sym47$DEDUCTION_ASSERTION = SubLObjectFactory.makeSymbol("DEDUCTION-ASSERTION");
        $list48 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEDUCTION"));
        $str49$Return_the_support_for_which_DEDU = SubLObjectFactory.makeString("Return the support for which DEDUCTION is a deduction.");
        $list50 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEDUCTION"), (SubLObject)SubLObjectFactory.makeSymbol("DEDUCTION-P")));
        $list51 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUPPORT-P"));
        $sym52$DEDUCTION_SUPPORTED_OBJECT = SubLObjectFactory.makeSymbol("DEDUCTION-SUPPORTED-OBJECT");
        $kw53$UNKNOWN = SubLObjectFactory.makeKeyword("UNKNOWN");
        $sym54$DEDUCTION_TRUTH = SubLObjectFactory.makeSymbol("DEDUCTION-TRUTH");
        $str55$Return_the_truth_of_DEDUCTION____ = SubLObjectFactory.makeString("Return the truth of DEDUCTION -- either :true :false or :unknown.");
        $list56 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TRUTH-P"));
        $sym57$DEDUCTION_STRENGTH = SubLObjectFactory.makeSymbol("DEDUCTION-STRENGTH");
        $str58$Return_the_current_argumentation_ = SubLObjectFactory.makeString("Return the current argumentation strength of DEDUCTION -- either :monotonic, :default, or :unknown.");
        $list59 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EL-STRENGTH-P"));
        $list60 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECKPOINT-COUNT"), (SubLObject)SubLObjectFactory.makeSymbol("CHECKPOINT-NEXT-ID"));
        $list61 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*DEDUCTION-DUMP-ID-TABLE*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CREATE-DEDUCTION-DUMP-ID-TABLE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*CFASL-DEDUCTION-HANDLE-FUNC*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("DEDUCTION-DUMP-ID"))));
        $int62$100 = SubLObjectFactory.makeInteger(100);
    }
}

/*

	Total time: 223 ms
	
*/