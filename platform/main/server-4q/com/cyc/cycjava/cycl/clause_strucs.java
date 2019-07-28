package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.clause_strucs;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Storage;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;
import org.armedbear.lisp.Lisp;

import static com.cyc.cycjava.cycl.access_macros.*;
import static com.cyc.cycjava.cycl.clause_strucs.*;
import static com.cyc.cycjava.cycl.control_vars.*;
import static com.cyc.cycjava.cycl.id_index.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUAL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.MINUS_ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.THREE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class clause_strucs extends SubLTranslatedFile {
    public static final SubLFile me = new clause_strucs();

    public static final String myName = "com.cyc.cycjava.cycl.clause_strucs";

    public static final String myFingerPrint = "04e93cb7c0645d9939147e98cfa78461439b55ba8b3bff0f2062ae5becdbaa49";

    // defconstant
    public static final SubLSymbol $dtp_clause_struc$ = makeSymbol("*DTP-CLAUSE-STRUC*");

    // deflexical
    // Free list for CLAUSE-STRUC objects
    private static final SubLSymbol $clause_struc_free_list$ = makeSymbol("*CLAUSE-STRUC-FREE-LIST*");

    // deflexical
    // Lock for CLAUSE-STRUC object free list
    private static final SubLSymbol $clause_struc_free_lock$ = makeSymbol("*CLAUSE-STRUC-FREE-LOCK*");





    // defparameter
    public static final SubLSymbol $clause_struc_dump_id_table$ = makeSymbol("*CLAUSE-STRUC-DUMP-ID-TABLE*");

    // Internal Constants
    public static final SubLSymbol CLAUSE_STRUC = makeSymbol("CLAUSE-STRUC");

    public static final SubLSymbol CLAUSE_STRUC_P = makeSymbol("CLAUSE-STRUC-P");

    private static final SubLInteger $int$142 = makeInteger(142);

    public static final SubLList $list3 = list(makeSymbol("ID"), makeSymbol("CNF"), makeSymbol("ASSERTIONS"));

    public static final SubLList $list4 = list(makeKeyword("ID"), makeKeyword("CNF"), makeKeyword("ASSERTIONS"));

    public static final SubLList $list5 = list(makeSymbol("CLS-ID"), makeSymbol("CLS-CNF"), makeSymbol("CLS-ASSERTIONS"));

    public static final SubLList $list6 = list(makeSymbol("_CSETF-CLS-ID"), makeSymbol("_CSETF-CLS-CNF"), makeSymbol("_CSETF-CLS-ASSERTIONS"));

    public static final SubLSymbol PRINT_CLAUSE_STRUC = makeSymbol("PRINT-CLAUSE-STRUC");

    public static final SubLSymbol CLAUSE_STRUC_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("CLAUSE-STRUC-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list9 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("CLAUSE-STRUC-P"));

    private static final SubLSymbol CLS_ID = makeSymbol("CLS-ID");

    private static final SubLSymbol _CSETF_CLS_ID = makeSymbol("_CSETF-CLS-ID");

    private static final SubLSymbol CLS_CNF = makeSymbol("CLS-CNF");

    private static final SubLSymbol _CSETF_CLS_CNF = makeSymbol("_CSETF-CLS-CNF");

    private static final SubLSymbol CLS_ASSERTIONS = makeSymbol("CLS-ASSERTIONS");

    private static final SubLSymbol _CSETF_CLS_ASSERTIONS = makeSymbol("_CSETF-CLS-ASSERTIONS");







    private static final SubLString $str19$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_CLAUSE_STRUC = makeSymbol("MAKE-CLAUSE-STRUC");





    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_CLAUSE_STRUC_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-CLAUSE-STRUC-METHOD");

    private static final SubLString $str25$_ = makeString("<");

    private static final SubLString $str26$_ = makeString("?");

    private static final SubLString $str27$_ = makeString(">");

    private static final SubLString $str28$_The_CFASL_invalid_clause_struc_ = makeString("<The CFASL invalid clause struc>");

    private static final SubLInteger $int$242 = makeInteger(242);

    private static final SubLSymbol SXHASH_CLAUSE_STRUC_METHOD = makeSymbol("SXHASH-CLAUSE-STRUC-METHOD");

    private static final SubLString $str31$CLAUSE_STRUC_resource_lock = makeString("CLAUSE-STRUC resource lock");





    private static final SubLList $list34 = list(list(makeSymbol("ASSERTION-VAR"), makeSymbol("CLAUSE-STRUC"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list35 = list(makeKeyword("DONE"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");





    private static final SubLSymbol CLAUSE_STRUC_ASSERTIONS = makeSymbol("CLAUSE-STRUC-ASSERTIONS");

    private static final SubLSymbol $sym40$INVALID_CONSTANT_ = makeSymbol("INVALID-CONSTANT?");







    private static final SubLString $str44$create_sample_invalid_clause_stru = makeString("create-sample-invalid-clause-struc not implemented");



    private static final SubLSymbol $clause_struc_from_id$ = makeSymbol("*CLAUSE-STRUC-FROM-ID*");

    private static final SubLList $list47 = list(list(makeSymbol("VAR"), makeSymbol("&KEY"), list(makeSymbol("PROGRESS-MESSAGE"), makeString("mapping Cyc clause structs")), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list48 = list(makeKeyword("PROGRESS-MESSAGE"), makeKeyword("DONE"));



    private static final SubLString $$$mapping_Cyc_clause_structs = makeString("mapping Cyc clause structs");



    private static final SubLList $list52 = list(makeSymbol("CLAUSE-STRUC-TABLE"));

    private static final SubLSymbol CLAUSE_STRUC_TABLE = makeSymbol("CLAUSE-STRUC-TABLE");

    private static final SubLSymbol DO_CLAUSE_STRUCS = makeSymbol("DO-CLAUSE-STRUCS");

    private static final SubLSymbol $new_clause_struc_id_threshold$ = makeSymbol("*NEW-CLAUSE-STRUC-ID-THRESHOLD*");

    private static final SubLString $str56$Cleaning_clause_struc_table = makeString("Cleaning clause-struc table");





    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");

    private static final SubLString $str61$invalid_clause_struct__S = makeString("invalid clause-struct ~S");

    private static final SubLString $str62$Freeing_clause_strucs = makeString("Freeing clause-strucs");

    private static final SubLString $str63$Determining_maximum_clause_struc_ = makeString("Determining maximum clause-struc ID");



    private static final SubLList $list65 = list(list(makeSymbol("*CLAUSE-STRUC-DUMP-ID-TABLE*"), list(makeSymbol("CREATE-CLAUSE-STRUC-DUMP-ID-TABLE"))), list(makeSymbol("*CFASL-CLAUSE-STRUC-HANDLE-FUNC*"), list(makeSymbol("QUOTE"), makeSymbol("CLAUSE-STRUC-DUMP-ID"))));

    private static final SubLSymbol CREATE_CLAUSE_STRUC_DUMP_ID_TABLE = makeSymbol("CREATE-CLAUSE-STRUC-DUMP-ID-TABLE");

    private static final SubLSymbol WITH_CLAUSE_STRUC_DUMP_ID_TABLE = makeSymbol("WITH-CLAUSE-STRUC-DUMP-ID-TABLE");

    public static SubLObject clause_struc_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_clause_struc(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject clause_struc_p(final SubLObject v_object) {
        return v_object.getClass() == clause_strucs.$clause_struc_native.class ? T : NIL;
    }

    public static SubLObject cls_id(final SubLObject v_object) {
        assert NIL != clause_struc_p(v_object) : "clause_strucs.clause_struc_p(v_object) " + "CommonSymbols.NIL != clause_strucs.clause_struc_p(v_object) " + v_object;
        return v_object.getField2();
    }

    public static SubLObject cls_cnf(final SubLObject v_object) {
        assert NIL != clause_struc_p(v_object) : "clause_strucs.clause_struc_p(v_object) " + "CommonSymbols.NIL != clause_strucs.clause_struc_p(v_object) " + v_object;
        return v_object.getField3();
    }

    public static SubLObject cls_assertions(final SubLObject v_object) {
        assert NIL != clause_struc_p(v_object) : "clause_strucs.clause_struc_p(v_object) " + "CommonSymbols.NIL != clause_strucs.clause_struc_p(v_object) " + v_object;
        return v_object.getField4();
    }

    public static SubLObject _csetf_cls_id(final SubLObject v_object, final SubLObject value) {
        assert NIL != clause_struc_p(v_object) : "clause_strucs.clause_struc_p(v_object) " + "CommonSymbols.NIL != clause_strucs.clause_struc_p(v_object) " + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_cls_cnf(final SubLObject v_object, final SubLObject value) {
        assert NIL != clause_struc_p(v_object) : "clause_strucs.clause_struc_p(v_object) " + "CommonSymbols.NIL != clause_strucs.clause_struc_p(v_object) " + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_cls_assertions(final SubLObject v_object, final SubLObject value) {
        assert NIL != clause_struc_p(v_object) : "clause_strucs.clause_struc_p(v_object) " + "CommonSymbols.NIL != clause_strucs.clause_struc_p(v_object) " + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject make_clause_struc(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new clause_strucs.$clause_struc_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($ID)) {
                _csetf_cls_id(v_new, current_value);
            } else
                if (pcase_var.eql($CNF)) {
                    _csetf_cls_cnf(v_new, current_value);
                } else
                    if (pcase_var.eql($ASSERTIONS)) {
                        _csetf_cls_assertions(v_new, current_value);
                    } else {
                        Errors.error($str19$Invalid_slot__S_for_construction_, current_arg);
                    }


        }
        return v_new;
    }

    public static SubLObject visit_defstruct_clause_struc(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_CLAUSE_STRUC, THREE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $ID, cls_id(obj));
        funcall(visitor_fn, obj, $SLOT, $CNF, cls_cnf(obj));
        funcall(visitor_fn, obj, $SLOT, $ASSERTIONS, cls_assertions(obj));
        funcall(visitor_fn, obj, $END, MAKE_CLAUSE_STRUC, THREE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_clause_struc_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_clause_struc(obj, visitor_fn);
    }

    public static SubLObject print_clause_struc(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != valid_clause_struc(v_object, UNPROVIDED)) {
            final SubLObject formula = (NIL != assertion_handles.$print_assertions_in_cnf$.getDynamicValue(thread)) ? clause_struc_cnf(v_object) : clause_struc_formula(v_object, $assertion_truth$.getDynamicValue(thread));
            princ($str25$_, stream);
            if (formula.isCons()) {
                prin1(formula, stream);
            } else {
                princ($str26$_, stream);
            }
            princ($str27$_, stream);
        } else
            if (v_object.eql(cfasl_kb_methods.cfasl_invalid_clause_struc())) {
                format(stream, $str28$_The_CFASL_invalid_clause_struc_);
            } else {
                compatibility.default_struct_print_function(v_object, stream, depth);
            }

        return v_object;
    }

    public static SubLObject sxhash_clause_struc_method(final SubLObject v_object) {
        final SubLObject id = cls_id(v_object);
        if (id.isInteger()) {
            return id;
        }
        return $int$242;
    }

    public static SubLObject make_static_clause_struc() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_object = NIL;
        final SubLObject _prev_bind_0 = Storage.$current_area$.currentBinding(thread);
        try {
            Storage.$current_area$.bind(Storage.get_static_area(), thread);
            v_object = make_clause_struc(UNPROVIDED);
        } finally {
            Storage.$current_area$.rebind(_prev_bind_0, thread);
        }
        return v_object;
    }

    public static SubLObject init_clause_struc(final SubLObject clause_struc) {
        _csetf_cls_id(clause_struc, NIL);
        _csetf_cls_cnf(clause_struc, NIL);
        _csetf_cls_assertions(clause_struc, NIL);
        return clause_struc;
    }

    public static SubLObject free_clause_struc_p(final SubLObject v_object) {
        return makeBoolean((NIL != clause_struc_p(v_object)) && (cls_cnf(v_object) == $FREE));
    }

    public static SubLObject free_clause_struc(SubLObject v_object) {
        assert NIL != clause_struc_p(v_object) : "clause_strucs.clause_struc_p(v_object) " + "CommonSymbols.NIL != clause_strucs.clause_struc_p(v_object) " + v_object;
        if (NIL == free_clause_struc_p(v_object)) {
            v_object = init_clause_struc(v_object);
            _csetf_cls_cnf(v_object, $FREE);
            if (NIL != $structure_resourcing_enabled$.getGlobalValue()) {
                SubLObject release = NIL;
                try {
                    release = seize_lock($clause_struc_free_lock$.getGlobalValue());
                    _csetf_cls_id(v_object, $clause_struc_free_list$.getGlobalValue());
                    $clause_struc_free_list$.setGlobalValue(v_object);
                } finally {
                    if (NIL != release) {
                        release_lock($clause_struc_free_lock$.getGlobalValue());
                    }
                }
            }
            return T;
        }
        return NIL;
    }

    public static SubLObject get_clause_struc() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $structure_resourcing_enabled$.getGlobalValue()) {
            SubLObject v_object = NIL;
            SubLObject found = NIL;
            SubLObject release = NIL;
            try {
                release = seize_lock($clause_struc_free_lock$.getGlobalValue());
                v_object = $clause_struc_free_list$.getGlobalValue();
                while ((NIL == found) && (NIL != v_object)) {
                    if (NIL != free_clause_struc_p(v_object)) {
                        $clause_struc_free_list$.setGlobalValue(cls_id(v_object));
                        found = T;
                    } else {
                        v_object = cls_id(v_object);
                    }
                } 
                if (NIL == found) {
                    if (NIL != $structure_resourcing_make_static$.getDynamicValue(thread)) {
                        v_object = make_static_clause_struc();
                    } else {
                        v_object = make_clause_struc(UNPROVIDED);
                    }
                    $clause_struc_free_list$.setGlobalValue(NIL);
                }
            } finally {
                if (NIL != release) {
                    release_lock($clause_struc_free_lock$.getGlobalValue());
                }
            }
            return init_clause_struc(v_object);
        }
        if (NIL != $structure_resourcing_make_static$.getDynamicValue(thread)) {
            return init_clause_struc(make_static_clause_struc());
        }
        return init_clause_struc(make_clause_struc(UNPROVIDED));
    }

    public static SubLObject clause_struc_id(final SubLObject clause_struc) {
        assert NIL != clause_struc_p(clause_struc) : "clause_strucs.clause_struc_p(clause_struc) " + "CommonSymbols.NIL != clause_strucs.clause_struc_p(clause_struc) " + clause_struc;
        return cls_id(clause_struc);
    }

    public static SubLObject reset_clause_struc_id(final SubLObject clause_struc, final SubLObject new_id) {
        _csetf_cls_id(clause_struc, new_id);
        return clause_struc;
    }

    public static SubLObject clause_struc_cnf(final SubLObject clause_struc) {
        assert NIL != clause_struc_p(clause_struc) : "clause_strucs.clause_struc_p(clause_struc) " + "CommonSymbols.NIL != clause_strucs.clause_struc_p(clause_struc) " + clause_struc;
        return cls_cnf(clause_struc);
    }

    public static SubLObject gaf_clause_strucP(final SubLObject clause_struc) {
        return makeBoolean((NIL != clause_struc_p(clause_struc)) && (NIL != clauses.gaf_cnfP(clause_struc_cnf(clause_struc))));
    }

    public static SubLObject clause_struc_formula(final SubLObject clause_struc, SubLObject truth) {
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        assert NIL != clause_struc_p(clause_struc) : "clause_strucs.clause_struc_p(clause_struc) " + "CommonSymbols.NIL != clause_strucs.clause_struc_p(clause_struc) " + clause_struc;
        return clauses.cnf_formula(clause_struc_cnf(clause_struc), truth);
    }

    public static SubLObject do_clause_struc_assertions(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list34);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject assertion_var = NIL;
        SubLObject clause_struc = NIL;
        destructuring_bind_must_consp(current, datum, $list34);
        assertion_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list34);
        clause_struc = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list34);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list34);
            if (NIL == member(current_$1, $list35, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list34);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return listS(DO_LIST, list(assertion_var, list(CLAUSE_STRUC_ASSERTIONS, clause_struc), $DONE, done), append(body, NIL));
    }

    public static SubLObject clause_struc_assertions(final SubLObject clause_struc) {
        assert NIL != clause_struc_p(clause_struc) : "clause_strucs.clause_struc_p(clause_struc) " + "CommonSymbols.NIL != clause_strucs.clause_struc_p(clause_struc) " + clause_struc;
        return cls_assertions(clause_struc);
    }

    public static SubLObject reset_clause_struc_assertions(final SubLObject clause_struc, final SubLObject new_assertions) {
        _csetf_cls_assertions(clause_struc, new_assertions);
        return clause_struc;
    }

    public static SubLObject valid_clause_struc(final SubLObject clause_struc, SubLObject robust) {
        if (robust == UNPROVIDED) {
            robust = NIL;
        }
        if ((NIL == clause_struc_p(clause_struc)) || (!clause_struc_id(clause_struc).isInteger())) {
            return NIL;
        }
        if (NIL == robust) {
            return T;
        }
        final SubLObject cnf = clause_struc_cnf(clause_struc);
        final SubLObject assertions = clause_struc_assertions(clause_struc);
        return makeBoolean((((NIL != clauses.cnf_p(cnf)) && (NIL == list_utilities.tree_find_if(symbol_function($sym40$INVALID_CONSTANT_), cnf, UNPROVIDED))) && assertions.isCons()) && (NIL != list_utilities.every_in_list(symbol_function(VALID_ASSERTION), assertions, UNPROVIDED)));
    }

    public static SubLObject invalid_clause_struc(final SubLObject clause_struc, SubLObject robust) {
        if (robust == UNPROVIDED) {
            robust = NIL;
        }
        return makeBoolean((NIL != clause_struc_p(clause_struc)) && (NIL == valid_clause_struc(clause_struc, robust)));
    }

    public static SubLObject find_clause_struc_by_id(final SubLObject id) {
        assert NIL != integerp(id) : "Types.integerp(id) " + "CommonSymbols.NIL != Types.integerp(id) " + id;
        return lookup_clause_struc(id);
    }

    public static SubLObject create_clause_struc(final SubLObject cnf) {
        assert NIL != clauses.cnf_p(cnf) : "clauses.cnf_p(cnf) " + "CommonSymbols.NIL != clauses.cnf_p(cnf) " + cnf;
        final SubLObject clause_struc = make_clause_struc_shell(cnf, UNPROVIDED);
        return clause_struc;
    }

    public static SubLObject make_clause_struc_shell(final SubLObject cnf, SubLObject id) {
        if (id == UNPROVIDED) {
            id = NIL;
        }
        assert NIL != clauses.cnf_p(cnf) : "clauses.cnf_p(cnf) " + "CommonSymbols.NIL != clauses.cnf_p(cnf) " + cnf;
        if (NIL == id) {
            id = make_clause_struc_id();
        }
        assert NIL != integerp(id) : "Types.integerp(id) " + "CommonSymbols.NIL != Types.integerp(id) " + id;
        final SubLObject clause_struc = get_clause_struc();
        register_clause_struc_id(clause_struc, id);
        _csetf_cls_cnf(clause_struc, cnf);
        return clause_struc;
    }

    public static SubLObject create_sample_invalid_clause_struc() {
        if (NIL != alexandria_allegro_macros.alexandria_allegro_mode_enabledP()) {
            Errors.sublisp_break($str44$create_sample_invalid_clause_stru, EMPTY_SUBL_OBJECT_ARRAY);
        }
        return get_clause_struc();
    }

    public static SubLObject add_clause_struc_assertion(final SubLObject clause_struc, final SubLObject assertion) {
        assert NIL != assertion_handles.assertion_p(assertion) : "assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) " + assertion;
        assert NIL != clause_struc_p(clause_struc) : "clause_strucs.clause_struc_p(clause_struc) " + "CommonSymbols.NIL != clause_strucs.clause_struc_p(clause_struc) " + clause_struc;
        reset_clause_struc_assertions(clause_struc, cons(assertion, clause_struc_assertions(clause_struc)));
        return clause_struc;
    }

    public static SubLObject remove_clause_struc(final SubLObject clause_struc) {
        assert NIL != clause_struc_p(clause_struc) : "clause_strucs.clause_struc_p(clause_struc) " + "CommonSymbols.NIL != clause_strucs.clause_struc_p(clause_struc) " + clause_struc;
        deregister_clause_struc_id(clause_struc_id(clause_struc));
        free_clause_struc(clause_struc);
        return T;
    }

    public static SubLObject remove_clause_struc_assertion(final SubLObject clause_struc, final SubLObject assertion) {
        assert NIL != assertion_handles.assertion_p(assertion) : "assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) " + assertion;
        assert NIL != clause_struc_p(clause_struc) : "clause_strucs.clause_struc_p(clause_struc) " + "CommonSymbols.NIL != clause_strucs.clause_struc_p(clause_struc) " + clause_struc;
        reset_clause_struc_assertions(clause_struc, list_utilities.delete_first(assertion, clause_struc_assertions(clause_struc), UNPROVIDED));
        return simplify_clause_struc_uses(clause_struc);
    }

    public static SubLObject simplify_clause_struc_uses(final SubLObject clause_struc) {
        assert NIL != clause_struc_p(clause_struc) : "clause_strucs.clause_struc_p(clause_struc) " + "CommonSymbols.NIL != clause_strucs.clause_struc_p(clause_struc) " + clause_struc;
        final SubLObject assertions = clause_struc_assertions(clause_struc);
        if (NIL != list_utilities.singletonP(assertions)) {
            final SubLObject remaining_assertion = assertions.first();
            if (NIL != assertion_handles.valid_assertionP(remaining_assertion, UNPROVIDED)) {
                final SubLObject cnf = clause_struc_cnf(clause_struc);
                assertions_low.update_assertion_formula_data(remaining_assertion, cnf);
            }
            remove_clause_struc(clause_struc);
            return T;
        }
        return NIL;
    }

    public static SubLObject do_clause_strucs(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list47);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        destructuring_bind_must_consp(current, datum, $list47);
        var = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$2 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list47);
            current_$2 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list47);
            if (NIL == member(current_$2, $list48, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$2 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list47);
        }
        final SubLObject progress_message_tail = property_list_member($PROGRESS_MESSAGE, current);
        final SubLObject progress_message = (NIL != progress_message_tail) ? cadr(progress_message_tail) : $$$mapping_Cyc_clause_structs;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return listS(DO_KB_SUID_TABLE, list(var, $list52, $PROGRESS_MESSAGE, progress_message, $DONE, done), append(body, NIL));
    }

    public static SubLObject clause_struc_table() {
        return $clause_struc_from_id$.getGlobalValue();
    }

    public static SubLObject clause_struc_count() {
        if (NIL == $clause_struc_from_id$.getGlobalValue()) {
            return ZERO_INTEGER;
        }
        return id_index_count($clause_struc_from_id$.getGlobalValue());
    }

    public static SubLObject random_clause_struc() {
        if (clause_struc_count().numG(ZERO_INTEGER)) {
            SubLObject max_id;
            SubLObject v_answer;
            for (max_id = next_clause_struc_id(), v_answer = NIL; NIL == v_answer; v_answer = find_clause_struc_by_id(random.random(max_id))) {
            }
            return v_answer;
        }
        return NIL;
    }

    public static SubLObject new_clause_struc_id_threshold() {
        return $new_clause_struc_id_threshold$.getGlobalValue();
    }

    public static SubLObject set_new_clause_struc_id_threshold(final SubLObject id) {
        $new_clause_struc_id_threshold$.setGlobalValue(id);
        return id;
    }

    public static SubLObject old_clause_struc_count() {
        return nth_value_step_2(nth_value_step_1(ZERO_INTEGER), id_index_old_and_new_object_counts(clause_struc_table(), new_clause_struc_id_threshold()));
    }

    public static SubLObject new_clause_struc_count() {
        return nth_value_step_2(nth_value_step_1(ONE_INTEGER), id_index_old_and_new_object_counts(clause_struc_table(), new_clause_struc_id_threshold()));
    }

    public static SubLObject setup_clause_struc_table(final SubLObject size, final SubLObject exactP) {
        if (NIL != $clause_struc_from_id$.getGlobalValue()) {
            return NIL;
        }
        $clause_struc_from_id$.setGlobalValue(new_id_index(size, ZERO_INTEGER));
        return T;
    }

    public static SubLObject finalize_clause_strucs(SubLObject max_clause_struc_id) {
        if (max_clause_struc_id == UNPROVIDED) {
            max_clause_struc_id = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        set_next_clause_struc_id(max_clause_struc_id);
        set_new_clause_struc_id_threshold(next_clause_struc_id());
        if (NIL == max_clause_struc_id) {
            final SubLObject _prev_bind_0 = Storage.$current_area$.currentBinding(thread);
            try {
                Storage.$current_area$.bind(Storage.get_static_area(), thread);
                optimize_id_index($clause_struc_from_id$.getGlobalValue(), UNPROVIDED);
            } finally {
                Storage.$current_area$.rebind(_prev_bind_0, thread);
            }
        }
        return NIL;
    }

    public static SubLObject clean_clause_struc_table(SubLObject verboseP) {
        if (verboseP == UNPROVIDED) {
            verboseP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject idx = clause_struc_table();
        final SubLObject mess = $str56$Cleaning_clause_struc_table;
        final SubLObject total = id_index_count(idx);
        SubLObject sofar = ZERO_INTEGER;
        assert NIL != stringp(mess) : "Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) " + mess;
        final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble(mess);
                final SubLObject idx_$3 = idx;
                if (NIL == id_index_objects_empty_p(idx_$3, $SKIP)) {
                    final SubLObject idx_$4 = idx_$3;
                    if (NIL == id_index_dense_objects_empty_p(idx_$4, $SKIP)) {
                        final SubLObject vector_var = id_index_dense_objects(idx_$4);
                        final SubLObject backwardP_var = NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject id;
                        SubLObject clause_struc;
                        SubLObject id_$5;
                        SubLObject ignore_errors_tag;
                        SubLObject _prev_bind_0_$6;
                        SubLObject cdolist_list_var;
                        SubLObject assertion;
                        SubLObject _prev_bind_0_$7;
                        SubLObject _values;
                        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                            id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                            clause_struc = aref(vector_var, id);
                            if ((NIL == id_index_tombstone_p(clause_struc)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                if (NIL != id_index_tombstone_p(clause_struc)) {
                                    clause_struc = $SKIP;
                                }
                                if (NIL == valid_clause_struc(clause_struc, T)) {
                                    id_$5 = clause_struc_id(clause_struc);
                                    ignore_errors_tag = NIL;
                                    try {
                                        thread.throwStack.push($IGNORE_ERRORS_TARGET);
                                        _prev_bind_0_$6 = Errors.$error_handler$.currentBinding(thread);
                                        try {
                                            Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                                            try {
                                                try {
                                                    if (NIL != verboseP) {
                                                        Errors.warn($str61$invalid_clause_struct__S, id_$5);
                                                    }
                                                    cdolist_list_var = clause_struc_assertions(clause_struc);
                                                    assertion = NIL;
                                                    assertion = cdolist_list_var.first();
                                                    while (NIL != cdolist_list_var) {
                                                        tms.tms_remove_assertion(assertion);
                                                        cdolist_list_var = cdolist_list_var.rest();
                                                        assertion = cdolist_list_var.first();
                                                    } 
                                                } finally {
                                                    _prev_bind_0_$7 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                    try {
                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                        _values = getValuesAsVector();
                                                        if (id_$5.isInteger()) {
                                                            deregister_clause_struc_id(id_$5);
                                                            reset_clause_struc_id(clause_struc, NIL);
                                                        }
                                                        restoreValuesFromVector(_values);
                                                    } finally {
                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$7, thread);
                                                    }
                                                }
                                            } catch (final Throwable catch_var) {
                                                Errors.handleThrowable(catch_var, NIL);
                                            }
                                        } finally {
                                            Errors.$error_handler$.rebind(_prev_bind_0_$6, thread);
                                        }
                                    } catch (final Throwable ccatch_env_var) {
                                        ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
                                    } finally {
                                        thread.throwStack.pop();
                                    }
                                }
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$5 = idx_$3;
                    if ((NIL == id_index_sparse_objects_empty_p(idx_$5)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        final SubLObject sparse = id_index_sparse_objects(idx_$5);
                        SubLObject id2 = id_index_sparse_id_threshold(idx_$5);
                        final SubLObject end_id = id_index_next_id(idx_$5);
                        final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                        while (id2.numL(end_id)) {
                            final SubLObject clause_struc2 = gethash_without_values(id2, sparse, v_default);
                            if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(clause_struc2))) {
                                if (NIL == valid_clause_struc(clause_struc2, T)) {
                                    final SubLObject id_$6 = clause_struc_id(clause_struc2);
                                    SubLObject ignore_errors_tag2 = NIL;
                                    try {
                                        thread.throwStack.push($IGNORE_ERRORS_TARGET);
                                        final SubLObject _prev_bind_0_$8 = Errors.$error_handler$.currentBinding(thread);
                                        try {
                                            Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                                            try {
                                                try {
                                                    if (NIL != verboseP) {
                                                        Errors.warn($str61$invalid_clause_struct__S, id_$6);
                                                    }
                                                    SubLObject cdolist_list_var2 = clause_struc_assertions(clause_struc2);
                                                    SubLObject assertion2 = NIL;
                                                    assertion2 = cdolist_list_var2.first();
                                                    while (NIL != cdolist_list_var2) {
                                                        tms.tms_remove_assertion(assertion2);
                                                        cdolist_list_var2 = cdolist_list_var2.rest();
                                                        assertion2 = cdolist_list_var2.first();
                                                    } 
                                                } finally {
                                                    final SubLObject _prev_bind_0_$9 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                    try {
                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                        final SubLObject _values2 = getValuesAsVector();
                                                        if (id_$6.isInteger()) {
                                                            deregister_clause_struc_id(id_$6);
                                                            reset_clause_struc_id(clause_struc2, NIL);
                                                        }
                                                        restoreValuesFromVector(_values2);
                                                    } finally {
                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$9, thread);
                                                    }
                                                }
                                            } catch (final Throwable catch_var2) {
                                                Errors.handleThrowable(catch_var2, NIL);
                                            }
                                        } finally {
                                            Errors.$error_handler$.rebind(_prev_bind_0_$8, thread);
                                        }
                                    } catch (final Throwable ccatch_env_var2) {
                                        ignore_errors_tag2 = Errors.handleThrowable(ccatch_env_var2, $IGNORE_ERRORS_TARGET);
                                    } finally {
                                        thread.throwStack.pop();
                                    }
                                }
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                            id2 = add(id2, ONE_INTEGER);
                        } 
                    }
                }
            } finally {
                final SubLObject _prev_bind_0_$10 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values3 = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values3);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$10, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject free_all_clause_strucs() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject idx = clause_struc_table();
        final SubLObject mess = $str62$Freeing_clause_strucs;
        final SubLObject total = id_index_count(idx);
        SubLObject sofar = ZERO_INTEGER;
        assert NIL != stringp(mess) : "Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) " + mess;
        final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble(mess);
                final SubLObject idx_$13 = idx;
                if (NIL == id_index_objects_empty_p(idx_$13, $SKIP)) {
                    final SubLObject idx_$14 = idx_$13;
                    if (NIL == id_index_dense_objects_empty_p(idx_$14, $SKIP)) {
                        final SubLObject vector_var = id_index_dense_objects(idx_$14);
                        final SubLObject backwardP_var = NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject id;
                        SubLObject clause_struc;
                        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                            id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                            clause_struc = aref(vector_var, id);
                            if ((NIL == id_index_tombstone_p(clause_struc)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                if (NIL != id_index_tombstone_p(clause_struc)) {
                                    clause_struc = $SKIP;
                                }
                                free_clause_struc(clause_struc);
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$15 = idx_$13;
                    if ((NIL == id_index_sparse_objects_empty_p(idx_$15)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        final SubLObject sparse = id_index_sparse_objects(idx_$15);
                        SubLObject id2 = id_index_sparse_id_threshold(idx_$15);
                        final SubLObject end_id = id_index_next_id(idx_$15);
                        final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                        while (id2.numL(end_id)) {
                            final SubLObject clause_struc2 = gethash_without_values(id2, sparse, v_default);
                            if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(clause_struc2))) {
                                free_clause_struc(clause_struc2);
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                            id2 = add(id2, ONE_INTEGER);
                        } 
                    }
                }
            } finally {
                final SubLObject _prev_bind_0_$16 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$16, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        clear_clause_struc_table();
        return NIL;
    }

    public static SubLObject clear_clause_struc_table() {
        return clear_id_index($clause_struc_from_id$.getGlobalValue());
    }

    public static SubLObject next_clause_struc_id() {
        return id_index_next_id($clause_struc_from_id$.getGlobalValue());
    }

    public static SubLObject set_next_clause_struc_id(SubLObject max_clause_struc_id) {
        if (max_clause_struc_id == UNPROVIDED) {
            max_clause_struc_id = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject max = MINUS_ONE_INTEGER;
        if (NIL != max_clause_struc_id) {
            max = max_clause_struc_id;
        } else {
            final SubLObject idx = clause_struc_table();
            final SubLObject mess = $str63$Determining_maximum_clause_struc_;
            final SubLObject total = id_index_count(idx);
            SubLObject sofar = ZERO_INTEGER;
            assert NIL != stringp(mess) : "Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) " + mess;
            final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble(mess);
                    final SubLObject idx_$17 = idx;
                    if (NIL == id_index_objects_empty_p(idx_$17, $SKIP)) {
                        final SubLObject idx_$18 = idx_$17;
                        if (NIL == id_index_dense_objects_empty_p(idx_$18, $SKIP)) {
                            final SubLObject vector_var = id_index_dense_objects(idx_$18);
                            final SubLObject backwardP_var = NIL;
                            SubLObject length;
                            SubLObject v_iteration;
                            SubLObject id;
                            SubLObject clause_struc;
                            for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                clause_struc = aref(vector_var, id);
                                if ((NIL == id_index_tombstone_p(clause_struc)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                    if (NIL != id_index_tombstone_p(clause_struc)) {
                                        clause_struc = $SKIP;
                                    }
                                    max = max(max, clause_struc_id(clause_struc));
                                    sofar = add(sofar, ONE_INTEGER);
                                    note_percent_progress(sofar, total);
                                }
                            }
                        }
                        final SubLObject idx_$19 = idx_$17;
                        if ((NIL == id_index_sparse_objects_empty_p(idx_$19)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                            final SubLObject sparse = id_index_sparse_objects(idx_$19);
                            SubLObject id2 = id_index_sparse_id_threshold(idx_$19);
                            final SubLObject end_id = id_index_next_id(idx_$19);
                            final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                            while (id2.numL(end_id)) {
                                final SubLObject clause_struc2 = gethash_without_values(id2, sparse, v_default);
                                if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(clause_struc2))) {
                                    max = max(max, clause_struc_id(clause_struc2));
                                    sofar = add(sofar, ONE_INTEGER);
                                    note_percent_progress(sofar, total);
                                }
                                id2 = add(id2, ONE_INTEGER);
                            } 
                        }
                    }
                } finally {
                    final SubLObject _prev_bind_0_$20 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$20, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_4, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
                $last_percent_progress_index$.rebind(_prev_bind_0, thread);
            }
        }
        final SubLObject next_id = add(max, ONE_INTEGER);
        set_id_index_next_id($clause_struc_from_id$.getGlobalValue(), next_id);
        return next_id;
    }

    public static SubLObject register_clause_struc_id(final SubLObject clause_struc, final SubLObject id) {
        reset_clause_struc_id(clause_struc, id);
        id_index_enter($clause_struc_from_id$.getGlobalValue(), id, clause_struc);
        return clause_struc;
    }

    public static SubLObject deregister_clause_struc_id(final SubLObject id) {
        return id_index_remove($clause_struc_from_id$.getGlobalValue(), id);
    }

    public static SubLObject lookup_clause_struc(final SubLObject id) {
        return id_index_lookup($clause_struc_from_id$.getGlobalValue(), id, UNPROVIDED);
    }

    public static SubLObject make_clause_struc_id() {
        return id_index_reserve($clause_struc_from_id$.getGlobalValue());
    }

    public static SubLObject clause_struc_dump_id(final SubLObject clause_struc) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject id = clause_struc_id(clause_struc);
        final SubLObject dump_table = $clause_struc_dump_id_table$.getDynamicValue(thread);
        if (NIL != dump_table) {
            id = id_index_lookup(dump_table, id, UNPROVIDED);
        }
        return id;
    }

    public static SubLObject find_clause_struc_by_dump_id(final SubLObject dump_id) {
        return find_clause_struc_by_id(dump_id);
    }

    public static SubLObject with_clause_struc_dump_id_table(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list65, append(body, NIL));
    }

    public static SubLObject create_clause_struc_dump_id_table() {
        return new_indirect_compact_id_index($clause_struc_from_id$.getGlobalValue());
    }

    public static SubLObject number_of_assertions_in_more_than_one_mt() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = ZERO_INTEGER;
        final SubLObject idx = clause_struc_table();
        final SubLObject mess = $$$mapping_Cyc_clause_structs;
        final SubLObject total = id_index_count(idx);
        SubLObject sofar = ZERO_INTEGER;
        assert NIL != stringp(mess) : "Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) " + mess;
        final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble(mess);
                final SubLObject idx_$21 = idx;
                if (NIL == id_index_objects_empty_p(idx_$21, $SKIP)) {
                    final SubLObject idx_$22 = idx_$21;
                    if (NIL == id_index_dense_objects_empty_p(idx_$22, $SKIP)) {
                        final SubLObject vector_var = id_index_dense_objects(idx_$22);
                        final SubLObject backwardP_var = NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject id;
                        SubLObject clause_struc;
                        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                            id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                            clause_struc = aref(vector_var, id);
                            if ((NIL == id_index_tombstone_p(clause_struc)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                if (NIL != id_index_tombstone_p(clause_struc)) {
                                    clause_struc = $SKIP;
                                }
                                count = add(count, length(clause_struc_assertions(clause_struc)));
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$23 = idx_$21;
                    if ((NIL == id_index_sparse_objects_empty_p(idx_$23)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        final SubLObject sparse = id_index_sparse_objects(idx_$23);
                        SubLObject id2 = id_index_sparse_id_threshold(idx_$23);
                        final SubLObject end_id = id_index_next_id(idx_$23);
                        final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                        while (id2.numL(end_id)) {
                            final SubLObject clause_struc2 = gethash_without_values(id2, sparse, v_default);
                            if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(clause_struc2))) {
                                count = add(count, length(clause_struc_assertions(clause_struc2)));
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                            id2 = add(id2, ONE_INTEGER);
                        } 
                    }
                }
            } finally {
                final SubLObject _prev_bind_0_$24 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$24, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return count;
    }

    public static SubLObject mts_with_clause_strucs() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_dictionary = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
        final SubLObject idx = clause_struc_table();
        final SubLObject mess = $$$mapping_Cyc_clause_structs;
        final SubLObject total = id_index_count(idx);
        SubLObject sofar = ZERO_INTEGER;
        assert NIL != stringp(mess) : "Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) " + mess;
        final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble(mess);
                final SubLObject idx_$25 = idx;
                if (NIL == id_index_objects_empty_p(idx_$25, $SKIP)) {
                    final SubLObject idx_$26 = idx_$25;
                    if (NIL == id_index_dense_objects_empty_p(idx_$26, $SKIP)) {
                        final SubLObject vector_var = id_index_dense_objects(idx_$26);
                        final SubLObject backwardP_var = NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject id;
                        SubLObject clause_struc;
                        SubLObject cdolist_list_var;
                        SubLObject assertion;
                        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                            id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                            clause_struc = aref(vector_var, id);
                            if ((NIL == id_index_tombstone_p(clause_struc)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                if (NIL != id_index_tombstone_p(clause_struc)) {
                                    clause_struc = $SKIP;
                                }
                                cdolist_list_var = clause_struc_assertions(clause_struc);
                                assertion = NIL;
                                assertion = cdolist_list_var.first();
                                while (NIL != cdolist_list_var) {
                                    dictionary_utilities.dictionary_increment(v_dictionary, assertions_high.assertion_mt(assertion), UNPROVIDED);
                                    cdolist_list_var = cdolist_list_var.rest();
                                    assertion = cdolist_list_var.first();
                                } 
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$27 = idx_$25;
                    if ((NIL == id_index_sparse_objects_empty_p(idx_$27)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        final SubLObject sparse = id_index_sparse_objects(idx_$27);
                        SubLObject id2 = id_index_sparse_id_threshold(idx_$27);
                        final SubLObject end_id = id_index_next_id(idx_$27);
                        final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                        while (id2.numL(end_id)) {
                            final SubLObject clause_struc2 = gethash_without_values(id2, sparse, v_default);
                            if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(clause_struc2))) {
                                SubLObject cdolist_list_var2 = clause_struc_assertions(clause_struc2);
                                SubLObject assertion2 = NIL;
                                assertion2 = cdolist_list_var2.first();
                                while (NIL != cdolist_list_var2) {
                                    dictionary_utilities.dictionary_increment(v_dictionary, assertions_high.assertion_mt(assertion2), UNPROVIDED);
                                    cdolist_list_var2 = cdolist_list_var2.rest();
                                    assertion2 = cdolist_list_var2.first();
                                } 
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                            id2 = add(id2, ONE_INTEGER);
                        } 
                    }
                }
            } finally {
                final SubLObject _prev_bind_0_$28 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$28, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return v_dictionary;
    }

    public static SubLObject declare_clause_strucs_file() {
        declareFunction(me, "clause_struc_print_function_trampoline", "CLAUSE-STRUC-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "clause_struc_p", "CLAUSE-STRUC-P", 1, 0, false);
        new clause_strucs.$clause_struc_p$UnaryFunction();
        declareFunction(me, "cls_id", "CLS-ID", 1, 0, false);
        declareFunction(me, "cls_cnf", "CLS-CNF", 1, 0, false);
        declareFunction(me, "cls_assertions", "CLS-ASSERTIONS", 1, 0, false);
        declareFunction(me, "_csetf_cls_id", "_CSETF-CLS-ID", 2, 0, false);
        declareFunction(me, "_csetf_cls_cnf", "_CSETF-CLS-CNF", 2, 0, false);
        declareFunction(me, "_csetf_cls_assertions", "_CSETF-CLS-ASSERTIONS", 2, 0, false);
        declareFunction(me, "make_clause_struc", "MAKE-CLAUSE-STRUC", 0, 1, false);
        declareFunction(me, "visit_defstruct_clause_struc", "VISIT-DEFSTRUCT-CLAUSE-STRUC", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_clause_struc_method", "VISIT-DEFSTRUCT-OBJECT-CLAUSE-STRUC-METHOD", 2, 0, false);
        declareFunction(me, "print_clause_struc", "PRINT-CLAUSE-STRUC", 3, 0, false);
        declareFunction(me, "sxhash_clause_struc_method", "SXHASH-CLAUSE-STRUC-METHOD", 1, 0, false);
        declareFunction(me, "make_static_clause_struc", "MAKE-STATIC-CLAUSE-STRUC", 0, 0, false);
        declareFunction(me, "init_clause_struc", "INIT-CLAUSE-STRUC", 1, 0, false);
        declareFunction(me, "free_clause_struc_p", "FREE-CLAUSE-STRUC-P", 1, 0, false);
        declareFunction(me, "free_clause_struc", "FREE-CLAUSE-STRUC", 1, 0, false);
        declareFunction(me, "get_clause_struc", "GET-CLAUSE-STRUC", 0, 0, false);
        declareFunction(me, "clause_struc_id", "CLAUSE-STRUC-ID", 1, 0, false);
        declareFunction(me, "reset_clause_struc_id", "RESET-CLAUSE-STRUC-ID", 2, 0, false);
        declareFunction(me, "clause_struc_cnf", "CLAUSE-STRUC-CNF", 1, 0, false);
        declareFunction(me, "gaf_clause_strucP", "GAF-CLAUSE-STRUC?", 1, 0, false);
        declareFunction(me, "clause_struc_formula", "CLAUSE-STRUC-FORMULA", 1, 1, false);
        declareMacro(me, "do_clause_struc_assertions", "DO-CLAUSE-STRUC-ASSERTIONS");
        declareFunction(me, "clause_struc_assertions", "CLAUSE-STRUC-ASSERTIONS", 1, 0, false);
        declareFunction(me, "reset_clause_struc_assertions", "RESET-CLAUSE-STRUC-ASSERTIONS", 2, 0, false);
        declareFunction(me, "valid_clause_struc", "VALID-CLAUSE-STRUC", 1, 1, false);
        declareFunction(me, "invalid_clause_struc", "INVALID-CLAUSE-STRUC", 1, 1, false);
        declareFunction(me, "find_clause_struc_by_id", "FIND-CLAUSE-STRUC-BY-ID", 1, 0, false);
        declareFunction(me, "create_clause_struc", "CREATE-CLAUSE-STRUC", 1, 0, false);
        declareFunction(me, "make_clause_struc_shell", "MAKE-CLAUSE-STRUC-SHELL", 1, 1, false);
        declareFunction(me, "create_sample_invalid_clause_struc", "CREATE-SAMPLE-INVALID-CLAUSE-STRUC", 0, 0, false);
        declareFunction(me, "add_clause_struc_assertion", "ADD-CLAUSE-STRUC-ASSERTION", 2, 0, false);
        declareFunction(me, "remove_clause_struc", "REMOVE-CLAUSE-STRUC", 1, 0, false);
        declareFunction(me, "remove_clause_struc_assertion", "REMOVE-CLAUSE-STRUC-ASSERTION", 2, 0, false);
        declareFunction(me, "simplify_clause_struc_uses", "SIMPLIFY-CLAUSE-STRUC-USES", 1, 0, false);
        declareMacro(me, "do_clause_strucs", "DO-CLAUSE-STRUCS");
        declareFunction(me, "clause_struc_table", "CLAUSE-STRUC-TABLE", 0, 0, false);
        declareFunction(me, "clause_struc_count", "CLAUSE-STRUC-COUNT", 0, 0, false);
        declareFunction(me, "random_clause_struc", "RANDOM-CLAUSE-STRUC", 0, 0, false);
        declareFunction(me, "new_clause_struc_id_threshold", "NEW-CLAUSE-STRUC-ID-THRESHOLD", 0, 0, false);
        declareFunction(me, "set_new_clause_struc_id_threshold", "SET-NEW-CLAUSE-STRUC-ID-THRESHOLD", 1, 0, false);
        declareFunction(me, "old_clause_struc_count", "OLD-CLAUSE-STRUC-COUNT", 0, 0, false);
        declareFunction(me, "new_clause_struc_count", "NEW-CLAUSE-STRUC-COUNT", 0, 0, false);
        declareFunction(me, "setup_clause_struc_table", "SETUP-CLAUSE-STRUC-TABLE", 2, 0, false);
        declareFunction(me, "finalize_clause_strucs", "FINALIZE-CLAUSE-STRUCS", 0, 1, false);
        declareFunction(me, "clean_clause_struc_table", "CLEAN-CLAUSE-STRUC-TABLE", 0, 1, false);
        declareFunction(me, "free_all_clause_strucs", "FREE-ALL-CLAUSE-STRUCS", 0, 0, false);
        declareFunction(me, "clear_clause_struc_table", "CLEAR-CLAUSE-STRUC-TABLE", 0, 0, false);
        declareFunction(me, "next_clause_struc_id", "NEXT-CLAUSE-STRUC-ID", 0, 0, false);
        declareFunction(me, "set_next_clause_struc_id", "SET-NEXT-CLAUSE-STRUC-ID", 0, 1, false);
        declareFunction(me, "register_clause_struc_id", "REGISTER-CLAUSE-STRUC-ID", 2, 0, false);
        declareFunction(me, "deregister_clause_struc_id", "DEREGISTER-CLAUSE-STRUC-ID", 1, 0, false);
        declareFunction(me, "lookup_clause_struc", "LOOKUP-CLAUSE-STRUC", 1, 0, false);
        declareFunction(me, "make_clause_struc_id", "MAKE-CLAUSE-STRUC-ID", 0, 0, false);
        declareFunction(me, "clause_struc_dump_id", "CLAUSE-STRUC-DUMP-ID", 1, 0, false);
        declareFunction(me, "find_clause_struc_by_dump_id", "FIND-CLAUSE-STRUC-BY-DUMP-ID", 1, 0, false);
        declareMacro(me, "with_clause_struc_dump_id_table", "WITH-CLAUSE-STRUC-DUMP-ID-TABLE");
        declareFunction(me, "create_clause_struc_dump_id_table", "CREATE-CLAUSE-STRUC-DUMP-ID-TABLE", 0, 0, false);
        declareFunction(me, "number_of_assertions_in_more_than_one_mt", "NUMBER-OF-ASSERTIONS-IN-MORE-THAN-ONE-MT", 0, 0, false);
        declareFunction(me, "mts_with_clause_strucs", "MTS-WITH-CLAUSE-STRUCS", 0, 0, false);
        return NIL;
    }

    public static SubLObject init_clause_strucs_file() {
        defconstant("*DTP-CLAUSE-STRUC*", CLAUSE_STRUC);
        deflexical("*CLAUSE-STRUC-FREE-LIST*", NIL);
        deflexical("*CLAUSE-STRUC-FREE-LOCK*", make_lock($str31$CLAUSE_STRUC_resource_lock));
        deflexical("*CLAUSE-STRUC-FROM-ID*", SubLTrampolineFile.maybeDefault($clause_struc_from_id$, $clause_struc_from_id$, NIL));
        deflexical("*NEW-CLAUSE-STRUC-ID-THRESHOLD*", SubLTrampolineFile.maybeDefault($new_clause_struc_id_threshold$, $new_clause_struc_id_threshold$, NIL));
        defparameter("*CLAUSE-STRUC-DUMP-ID-TABLE*", NIL);
        return NIL;
    }

    public static SubLObject setup_clause_strucs_file() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_clause_struc$.getGlobalValue(), symbol_function(CLAUSE_STRUC_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list9);
        def_csetf(CLS_ID, _CSETF_CLS_ID);
        def_csetf(CLS_CNF, _CSETF_CLS_CNF);
        def_csetf(CLS_ASSERTIONS, _CSETF_CLS_ASSERTIONS);
        identity(CLAUSE_STRUC);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_clause_struc$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_CLAUSE_STRUC_METHOD));
        register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_clause_struc$.getGlobalValue(), symbol_function(SXHASH_CLAUSE_STRUC_METHOD));
        declare_defglobal($clause_struc_from_id$);
        register_macro_helper(CLAUSE_STRUC_TABLE, DO_CLAUSE_STRUCS);
        declare_defglobal($new_clause_struc_id_threshold$);
        register_macro_helper(CREATE_CLAUSE_STRUC_DUMP_ID_TABLE, WITH_CLAUSE_STRUC_DUMP_ID_TABLE);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_clause_strucs_file();
    }

    @Override
    public void initializeVariables() {
        init_clause_strucs_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_clause_strucs_file();
    }

    static {











































































    }

    public static final class $clause_struc_native extends SubLStructNative {
        public SubLObject $id;

        public SubLObject $cnf;

        public SubLObject $assertions;

        private static final SubLStructDeclNative structDecl;

        public $clause_struc_native() {
            this.$id = Lisp.NIL;
            this.$cnf = Lisp.NIL;
            this.$assertions = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$id;
        }

        @Override
        public SubLObject getField3() {
            return this.$cnf;
        }

        @Override
        public SubLObject getField4() {
            return this.$assertions;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$id = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$cnf = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$assertions = value;
        }

        static {
            structDecl = makeStructDeclNative(clause_strucs.$clause_struc_native.class, CLAUSE_STRUC, CLAUSE_STRUC_P, $list3, $list4, new String[]{ "$id", "$cnf", "$assertions" }, $list5, $list6, PRINT_CLAUSE_STRUC);
        }
    }

    public static final class $clause_struc_p$UnaryFunction extends UnaryFunction {
        public $clause_struc_p$UnaryFunction() {
            super(extractFunctionNamed("CLAUSE-STRUC-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return clause_struc_p(arg1);
        }
    }
}

/**
 * Total time: 591 ms
 */
