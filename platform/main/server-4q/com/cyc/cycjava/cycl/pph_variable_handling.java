package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.pph_variable_handling;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;
import org.armedbear.lisp.Lisp;

import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.*;
import static com.cyc.cycjava.cycl.pph_variable_handling.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUAL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FIVE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FOUR_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.IDENTITY;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.SIX_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.THREE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class pph_variable_handling extends SubLTranslatedFile {
    public static final SubLFile me = new pph_variable_handling();

    public static final String myName = "com.cyc.cycjava.cycl.pph_variable_handling";

    public static final String myFingerPrint = "8c698277d6b585838ccd09f85d31ac14b307b32febc9a1632e3c679ab3d45393";

    // defconstant
    public static final SubLSymbol $dtp_pph_var_entry$ = makeSymbol("*DTP-PPH-VAR-ENTRY*");

    // defconstant
    // What something is when we don't know what it is.
    private static final SubLSymbol $pph_default_var_type$ = makeSymbol("*PPH-DEFAULT-VAR-TYPE*");



    // defvar
    public static final SubLSymbol $pph_different_vars$ = makeSymbol("*PPH-DIFFERENT-VARS*");

    // Internal Constants
    public static final SubLSymbol PPH_VAR_ENTRY = makeSymbol("PPH-VAR-ENTRY");

    public static final SubLSymbol PPH_VAR_ENTRY_P = makeSymbol("PPH-VAR-ENTRY-P");

    public static final SubLList $list2 = list(makeSymbol("VAR"), makeSymbol("TYPE"), makeSymbol("QUANTIFIER"), makeSymbol("SINGLE-USE?"), makeSymbol("ARG-POSITION"));

    public static final SubLList $list3 = list(makeKeyword("VAR"), makeKeyword("TYPE"), makeKeyword("QUANTIFIER"), makeKeyword("SINGLE-USE?"), makeKeyword("ARG-POSITION"));

    public static final SubLList $list4 = list(makeSymbol("PPH-VAR-ENTRY-VAR"), makeSymbol("PPH-VAR-ENTRY-TYPE"), makeSymbol("PPH-VAR-ENTRY-QUANTIFIER"), makeSymbol("PPH-VAR-ENTRY-SINGLE-USE?"), makeSymbol("PPH-VAR-ENTRY-ARG-POSITION"));

    public static final SubLList $list5 = list(makeSymbol("_CSETF-PPH-VAR-ENTRY-VAR"), makeSymbol("_CSETF-PPH-VAR-ENTRY-TYPE"), makeSymbol("_CSETF-PPH-VAR-ENTRY-QUANTIFIER"), makeSymbol("_CSETF-PPH-VAR-ENTRY-SINGLE-USE?"), makeSymbol("_CSETF-PPH-VAR-ENTRY-ARG-POSITION"));

    public static final SubLSymbol PPRINT_PPH_VAR_ENTRY = makeSymbol("PPRINT-PPH-VAR-ENTRY");

    public static final SubLSymbol PPH_VAR_ENTRY_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("PPH-VAR-ENTRY-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list8 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("PPH-VAR-ENTRY-P"));

    private static final SubLSymbol PPH_VAR_ENTRY_VAR = makeSymbol("PPH-VAR-ENTRY-VAR");

    private static final SubLSymbol _CSETF_PPH_VAR_ENTRY_VAR = makeSymbol("_CSETF-PPH-VAR-ENTRY-VAR");

    private static final SubLSymbol PPH_VAR_ENTRY_TYPE = makeSymbol("PPH-VAR-ENTRY-TYPE");

    private static final SubLSymbol _CSETF_PPH_VAR_ENTRY_TYPE = makeSymbol("_CSETF-PPH-VAR-ENTRY-TYPE");

    private static final SubLSymbol PPH_VAR_ENTRY_QUANTIFIER = makeSymbol("PPH-VAR-ENTRY-QUANTIFIER");

    private static final SubLSymbol _CSETF_PPH_VAR_ENTRY_QUANTIFIER = makeSymbol("_CSETF-PPH-VAR-ENTRY-QUANTIFIER");

    private static final SubLSymbol $sym15$PPH_VAR_ENTRY_SINGLE_USE_ = makeSymbol("PPH-VAR-ENTRY-SINGLE-USE?");

    private static final SubLSymbol $sym16$_CSETF_PPH_VAR_ENTRY_SINGLE_USE_ = makeSymbol("_CSETF-PPH-VAR-ENTRY-SINGLE-USE?");

    private static final SubLSymbol PPH_VAR_ENTRY_ARG_POSITION = makeSymbol("PPH-VAR-ENTRY-ARG-POSITION");

    private static final SubLSymbol _CSETF_PPH_VAR_ENTRY_ARG_POSITION = makeSymbol("_CSETF-PPH-VAR-ENTRY-ARG-POSITION");







    private static final SubLSymbol $kw22$SINGLE_USE_ = makeKeyword("SINGLE-USE?");



    private static final SubLString $str24$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_PPH_VAR_ENTRY = makeSymbol("MAKE-PPH-VAR-ENTRY");





    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_PPH_VAR_ENTRY_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-PPH-VAR-ENTRY-METHOD");

    public static final SubLString $str30$__PPH_VAR_ENTRY___S__S__S__S_ = makeString("#<PPH-VAR-ENTRY: ~S ~S ~S ~S>");

    private static final SubLObject $$Thing = reader_make_constant_shell(makeString("Thing"));

    private static final SubLString $str32$_PPH_error_level_ = makeString("(PPH error level ");

    private static final SubLString $str33$__ = makeString(") ");

    private static final SubLString $str34$Non_EL_var___S = makeString("Non EL var: ~S");

    private static final SubLString $str35$Registering__S_as__S___ = makeString("Registering ~S as ~S.~%");

    private static final SubLSymbol PPH_DEREGISTER_VAR = makeSymbol("PPH-DEREGISTER-VAR");

    public static final SubLList $list37 = list(makeKeyword("UNIVERSAL"), makeKeyword("EXISTENTIAL"), makeKeyword("NO"));

    public static final SubLString $str38$___S_is_not_a_quantifier_keyword_ = makeString("~&~S is not a quantifier keyword among ~S");

    private static final SubLObject $$ExistentialQuantifier = reader_make_constant_shell(makeString("ExistentialQuantifier"));



    private static final SubLObject $$forAll = reader_make_constant_shell(makeString("forAll"));







    private static final SubLList $list45 = list(list(makeSymbol("VARS")), makeSymbol("&BODY"), makeSymbol("BODY"));



    public static final SubLSymbol $pph_hypothesized_vars$ = makeSymbol("*PPH-HYPOTHESIZED-VARS*");



    private static final SubLList $list49 = list(makeSymbol("*PPH-HYPOTHESIZED-VARS*"));

    private static final SubLSymbol PPH_EXISTENTIAL_VAR_P = makeSymbol("PPH-EXISTENTIAL-VAR-P");

    private static final SubLString $str51$__Registering__S_as_a_query_var__ = makeString("~&Registering ~S as a query var.~%");



    private static final SubLString $str53$PPH_REGISTER_VAR_AS_USED_ONLY_ONC = makeString("PPH-REGISTER-VAR-AS-USED-ONLY-ONCE called on var ~S with no PPH-VAR-ENTRY~%");

    private static final SubLList $list54 = list(list(makeSymbol("VAR"), makeSymbol("VAR-ENTRY"), makeSymbol("&OPTIONAL"), makeSymbol("STOP-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));



    private static final SubLSymbol $pph_var_types$ = makeSymbol("*PPH-VAR-TYPES*");

    private static final SubLSymbol $sym57$PPH_SPEC_ = makeSymbol("PPH-SPEC?");

    private static final SubLSymbol $sym58$PPH_STRING_IS_POS_ = makeSymbol("PPH-STRING-IS-POS?");





    private static final SubLInteger $int$128 = makeInteger(128);

    private static final SubLObject $$Pronoun = reader_make_constant_shell(makeString("Pronoun"));

    private static final SubLString $str63$__Noted___S_is_a__S___ = makeString("~&Noted: ~S is a ~S.~%");

    private static final SubLString $$$other = makeString("other");

    private static final SubLString $$$_other_ = makeString(" other ");

    private static final SubLString $$$other_ = makeString("other ");

    private static final SubLString $$$_another = makeString(" another");

    private static final SubLString $$$another = makeString("another");

    private static final SubLSymbol PPH_FORMULA_FREE_VARIABLES = makeSymbol("PPH-FORMULA-FREE-VARIABLES");

    private static final SubLSymbol $sym70$EL_VAR_ = makeSymbol("EL-VAR?");

    private static final SubLInteger $int$98 = makeInteger(98);

    private static final SubLList $list72 = list(ONE_INTEGER);

    private static final SubLList $list73 = list(reader_make_constant_shell(makeString("isa")), makeKeyword("ANYTHING"), list(makeKeyword("TEST"), makeSymbol("PPH-QUOTED-COLLECTION?")));

    private static final SubLObject $$quotedCollection = reader_make_constant_shell(makeString("quotedCollection"));

    private static final SubLSymbol $sym75$PPH_OPERATOR_ARG_SCOPED_ = makeSymbol("PPH-OPERATOR-ARG-SCOPED?");

    private static final SubLInteger $int$200 = makeInteger(200);

    private static final SubLSymbol $sym77$PPH_OPERATOR_ARG_QUOTED_ = makeSymbol("PPH-OPERATOR-ARG-QUOTED?");

    private static final SubLSymbol $sym78$PPH_VALID_VAR_TYPE_ = makeSymbol("PPH-VALID-VAR-TYPE?");





    private static final SubLList $list81 = list(makeSymbol("NEG-LITS"), makeSymbol("POS-LITS"));

    private static final SubLObject $$CycLVariable = reader_make_constant_shell(makeString("CycLVariable"));

    private static final SubLSymbol $sym83$SPECS_FN_NAT_ = makeSymbol("SPECS-FN-NAT?");

    private static final SubLString $str84$Removing_non_SpecsFn_terms_from__ = makeString("Removing non-SpecsFn terms from ~S");

    private static final SubLSymbol $sym85$PPH_GENERALITY_ESTIMATE_ = makeSymbol("PPH-GENERALITY-ESTIMATE<");

    private static final SubLSymbol PPH_CLAUSAL_FORM = makeSymbol("PPH-CLAUSAL-FORM");



    private static final SubLSymbol PPH_VARIABLE_ISA_CONSTRAINTS_IN_LIT = makeSymbol("PPH-VARIABLE-ISA-CONSTRAINTS-IN-LIT");

    private static final SubLObject $$FamilyRelationSlot = reader_make_constant_shell(makeString("FamilyRelationSlot"));

    private static final SubLObject $$Agent_Generic = reader_make_constant_shell(makeString("Agent-Generic"));

    private static final SubLList $list91 = list(makeSymbol("TYPE"), makeSymbol("TARGET"), makeSymbol("CONSTRAINT-MT"));









    private static final SubLSymbol PPH_MAKE_TYPE_LEVEL = makeSymbol("PPH-MAKE-TYPE-LEVEL");

    private static final SubLSymbol $sym97$PPH_TRUTH_PRESERVING_OPERATOR_ = makeSymbol("PPH-TRUTH-PRESERVING-OPERATOR?");

    private static final SubLList $list98 = list(reader_make_constant_shell(makeString("and")), reader_make_constant_shell(makeString("thereExists")), reader_make_constant_shell(makeString("forAll")));

    private static final SubLList $list99 = list(reader_make_constant_shell(makeString("TheSetOf")));

    private static final SubLObject $$extentCardinality = reader_make_constant_shell(makeString("extentCardinality"));

    private static final SubLObject $$trueSentence = reader_make_constant_shell(makeString("trueSentence"));

    private static final SubLObject $$holdsSometimeDuring = reader_make_constant_shell(makeString("holdsSometimeDuring"));

    private static final SubLObject $$ist = reader_make_constant_shell(makeString("ist"));

    private static final SubLSymbol EL_EXISTENTIAL_P = makeSymbol("EL-EXISTENTIAL-P");

    private static final SubLSymbol QUANTIFIED_SUB_SENTENCE = makeSymbol("QUANTIFIED-SUB-SENTENCE");

    private static final SubLSymbol PPH_MIN_VARIABLE_ISA_CONSTRAINT = makeSymbol("PPH-MIN-VARIABLE-ISA-CONSTRAINT");

    private static final SubLString $str107$Constraints_on__S_are__S_____choo = makeString("Constraints on ~S are ~S;~%, choosing ~S~%");

    private static final SubLSymbol PPH_FIND_MOST_SPECIFIC = makeSymbol("PPH-FIND-MOST-SPECIFIC");



    public static SubLObject pph_var_entry_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        pprint_pph_var_entry(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject pph_var_entry_p(final SubLObject v_object) {
        return v_object.getClass() == pph_variable_handling.$pph_var_entry_native.class ? T : NIL;
    }

    public static SubLObject pph_var_entry_var(final SubLObject v_object) {
        assert NIL != pph_var_entry_p(v_object) : "pph_variable_handling.pph_var_entry_p(v_object) " + "CommonSymbols.NIL != pph_variable_handling.pph_var_entry_p(v_object) " + v_object;
        return v_object.getField2();
    }

    public static SubLObject pph_var_entry_type(final SubLObject v_object) {
        assert NIL != pph_var_entry_p(v_object) : "pph_variable_handling.pph_var_entry_p(v_object) " + "CommonSymbols.NIL != pph_variable_handling.pph_var_entry_p(v_object) " + v_object;
        return v_object.getField3();
    }

    public static SubLObject pph_var_entry_quantifier(final SubLObject v_object) {
        assert NIL != pph_var_entry_p(v_object) : "pph_variable_handling.pph_var_entry_p(v_object) " + "CommonSymbols.NIL != pph_variable_handling.pph_var_entry_p(v_object) " + v_object;
        return v_object.getField4();
    }

    public static SubLObject pph_var_entry_single_useP(final SubLObject v_object) {
        assert NIL != pph_var_entry_p(v_object) : "pph_variable_handling.pph_var_entry_p(v_object) " + "CommonSymbols.NIL != pph_variable_handling.pph_var_entry_p(v_object) " + v_object;
        return v_object.getField5();
    }

    public static SubLObject pph_var_entry_arg_position(final SubLObject v_object) {
        assert NIL != pph_var_entry_p(v_object) : "pph_variable_handling.pph_var_entry_p(v_object) " + "CommonSymbols.NIL != pph_variable_handling.pph_var_entry_p(v_object) " + v_object;
        return v_object.getField6();
    }

    public static SubLObject _csetf_pph_var_entry_var(final SubLObject v_object, final SubLObject value) {
        assert NIL != pph_var_entry_p(v_object) : "pph_variable_handling.pph_var_entry_p(v_object) " + "CommonSymbols.NIL != pph_variable_handling.pph_var_entry_p(v_object) " + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_pph_var_entry_type(final SubLObject v_object, final SubLObject value) {
        assert NIL != pph_var_entry_p(v_object) : "pph_variable_handling.pph_var_entry_p(v_object) " + "CommonSymbols.NIL != pph_variable_handling.pph_var_entry_p(v_object) " + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_pph_var_entry_quantifier(final SubLObject v_object, final SubLObject value) {
        assert NIL != pph_var_entry_p(v_object) : "pph_variable_handling.pph_var_entry_p(v_object) " + "CommonSymbols.NIL != pph_variable_handling.pph_var_entry_p(v_object) " + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_pph_var_entry_single_useP(final SubLObject v_object, final SubLObject value) {
        assert NIL != pph_var_entry_p(v_object) : "pph_variable_handling.pph_var_entry_p(v_object) " + "CommonSymbols.NIL != pph_variable_handling.pph_var_entry_p(v_object) " + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_pph_var_entry_arg_position(final SubLObject v_object, final SubLObject value) {
        assert NIL != pph_var_entry_p(v_object) : "pph_variable_handling.pph_var_entry_p(v_object) " + "CommonSymbols.NIL != pph_variable_handling.pph_var_entry_p(v_object) " + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject make_pph_var_entry(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new pph_variable_handling.$pph_var_entry_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($VAR)) {
                _csetf_pph_var_entry_var(v_new, current_value);
            } else
                if (pcase_var.eql($TYPE)) {
                    _csetf_pph_var_entry_type(v_new, current_value);
                } else
                    if (pcase_var.eql($QUANTIFIER)) {
                        _csetf_pph_var_entry_quantifier(v_new, current_value);
                    } else
                        if (pcase_var.eql($kw22$SINGLE_USE_)) {
                            _csetf_pph_var_entry_single_useP(v_new, current_value);
                        } else
                            if (pcase_var.eql($ARG_POSITION)) {
                                _csetf_pph_var_entry_arg_position(v_new, current_value);
                            } else {
                                Errors.error($str24$Invalid_slot__S_for_construction_, current_arg);
                            }




        }
        return v_new;
    }

    public static SubLObject visit_defstruct_pph_var_entry(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_PPH_VAR_ENTRY, FIVE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $VAR, pph_var_entry_var(obj));
        funcall(visitor_fn, obj, $SLOT, $TYPE, pph_var_entry_type(obj));
        funcall(visitor_fn, obj, $SLOT, $QUANTIFIER, pph_var_entry_quantifier(obj));
        funcall(visitor_fn, obj, $SLOT, $kw22$SINGLE_USE_, pph_var_entry_single_useP(obj));
        funcall(visitor_fn, obj, $SLOT, $ARG_POSITION, pph_var_entry_arg_position(obj));
        funcall(visitor_fn, obj, $END, MAKE_PPH_VAR_ENTRY, FIVE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_pph_var_entry_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_pph_var_entry(obj, visitor_fn);
    }

    public static SubLObject pprint_pph_var_entry(final SubLObject var_entry, final SubLObject stream, final SubLObject depth) {
        format(stream, $str30$__PPH_VAR_ENTRY___S__S__S__S_, new SubLObject[]{ pph_var_entry_var(var_entry), pph_var_entry_type(var_entry), pph_var_entry_arg_position(var_entry), pph_var_entry_quantifier(var_entry) });
        return var_entry;
    }

    public static SubLObject new_pph_var_entry(final SubLObject var, SubLObject type, SubLObject type_map, SubLObject quantifier, SubLObject single_useP) {
        if (type == UNPROVIDED) {
            type = pph_default_var_type();
        }
        if (type_map == UNPROVIDED) {
            type_map = pph_utilities.pph_new_empty_map();
        }
        if (quantifier == UNPROVIDED) {
            quantifier = NIL;
        }
        if (single_useP == UNPROVIDED) {
            single_useP = NIL;
        }
        final SubLObject new_var_entry = make_pph_var_entry(UNPROVIDED);
        _csetf_pph_var_entry_var(new_var_entry, var);
        _csetf_pph_var_entry_type(new_var_entry, type);
        _csetf_pph_var_entry_arg_position(new_var_entry, type_map);
        _csetf_pph_var_entry_quantifier(new_var_entry, quantifier);
        _csetf_pph_var_entry_single_useP(new_var_entry, single_useP);
        return new_var_entry;
    }

    public static SubLObject pph_var_entry_copy(final SubLObject old_entry) {
        final SubLObject var = pph_var_entry_var(old_entry);
        final SubLObject type = pph_var_entry_type(old_entry);
        final SubLObject arg_position = pph_var_entry_arg_position(old_entry);
        final SubLObject quantifier = pph_var_entry_quantifier(old_entry);
        final SubLObject single_useP = pph_var_entry_single_useP(old_entry);
        return new_pph_var_entry(var, type, arg_position, quantifier, single_useP);
    }

    public static SubLObject set_pph_var_type(final SubLObject var_entry, final SubLObject type) {
        _csetf_pph_var_entry_type(var_entry, type);
        return var_entry;
    }

    public static SubLObject set_pph_var_type_map(final SubLObject var_entry, final SubLObject map) {
        _csetf_pph_var_entry_arg_position(var_entry, map);
        return var_entry;
    }

    public static SubLObject set_pph_var_quantifier(final SubLObject var_entry, final SubLObject quantifier) {
        _csetf_pph_var_entry_quantifier(var_entry, quantifier);
        return var_entry;
    }

    public static SubLObject clear_pph_var_types() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        dictionary.clear_dictionary(pph_vars.$pph_var_types$.getDynamicValue(thread));
        return pph_vars.$pph_var_types$.getDynamicValue(thread);
    }

    public static SubLObject pph_default_var_type() {
        return $pph_default_var_type$.getGlobalValue();
    }

    public static SubLObject pph_registered_vars() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return dictionary.dictionary_keys(pph_vars.$pph_var_types$.getDynamicValue(thread));
    }

    public static SubLObject pph_var_entry(final SubLObject var) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == cycl_variables.el_varP(var)) {
            final SubLObject new_format_string = cconcatenate($str32$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str33$__, format_nil.format_nil_a_no_copy($str34$Non_EL_var___S) });
            pph_error.pph_handle_error(new_format_string, list(var));
        }
        return NIL != cycl_variables.el_varP(var) ? dictionary.dictionary_lookup(pph_vars.$pph_var_types$.getDynamicValue(thread), var, UNPROVIDED) : NIL;
    }

    public static SubLObject pph_var_entries(final SubLObject vars) {
        return Mapping.mapcar(PPH_VAR_ENTRY, vars);
    }

    public static SubLObject pph_var_registeredP(final SubLObject var) {
        return makeBoolean((NIL != pph_vars.pph_tracking_var_types_p()) && (NIL != pph_var_entry(var)));
    }

    public static SubLObject pph_var_registered_as_defaultP(final SubLObject var) {
        return eq(pph_var_type(var), pph_default_var_type());
    }

    public static SubLObject pph_register_var(final SubLObject var, SubLObject type, SubLObject type_map) {
        if (type == UNPROVIDED) {
            type = pph_default_var_type();
        }
        if (type_map == UNPROVIDED) {
            type_map = pph_utilities.pph_new_empty_map();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
            format_nil.force_format(T, $str35$Registering__S_as__S___, var, type, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        final SubLObject existing = pph_var_entry(var);
        final SubLObject v_new = (NIL != existing) ? pph_var_entry_copy(existing) : new_pph_var_entry(var, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        set_pph_var_type(v_new, type);
        set_pph_var_type_map(v_new, type_map);
        dictionary.dictionary_enter(pph_vars.$pph_var_types$.getDynamicValue(thread), var, v_new);
        pph_note_var_type(var, type);
        return pph_vars.$pph_var_types$.getDynamicValue(thread);
    }

    public static SubLObject pph_update_var_type(final SubLObject var, final SubLObject type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject existing = pph_var_entry(var);
        final SubLObject v_new = (NIL != existing) ? pph_var_entry_copy(existing) : new_pph_var_entry(var, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        set_pph_var_type(v_new, type);
        if (NIL == existing) {
            set_pph_var_type_map(v_new, pph_utilities.pph_new_empty_map());
        }
        dictionary.dictionary_enter(pph_vars.$pph_var_types$.getDynamicValue(thread), var, v_new);
        pph_note_var_type(var, type);
        return pph_vars.$pph_var_types$.getDynamicValue(thread);
    }

    public static SubLObject pph_deregister_var(final SubLObject var) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        dictionary.dictionary_remove(pph_vars.$pph_var_types$.getDynamicValue(thread), var);
        return pph_vars.$pph_var_types$.getDynamicValue(thread);
    }

    public static SubLObject pph_deregister_vars(final SubLObject vars) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        Mapping.mapcar(PPH_DEREGISTER_VAR, vars);
        return pph_vars.$pph_var_types$.getDynamicValue(thread);
    }

    public static SubLObject pph_var_quantifiedP(final SubLObject var) {
        return makeBoolean((NIL != pph_var_registeredP(var)) && (NIL != member(pph_var_quantifier(var), $list37, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject pph_register_var_quantifier(final SubLObject var, final SubLObject quantifier) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == pph_vars.pph_quantifier_keyword_p(quantifier)) {
            if ((NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) && (NIL == pph_error.suppress_pph_warningsP())) {
                Errors.warn($str38$___S_is_not_a_quantifier_keyword_, quantifier, pph_vars.pph_quantifier_keywords());
                force_output(StreamsLow.$error_output$.getDynamicValue(thread));
            }
            return NIL;
        }
        final SubLObject existing = pph_var_entry(var);
        final SubLObject v_new = (NIL != existing) ? pph_var_entry_copy(existing) : new_pph_var_entry(var, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        set_pph_var_quantifier(v_new, quantifier);
        dictionary.dictionary_enter(pph_vars.$pph_var_types$.getDynamicValue(thread), var, v_new);
        return pph_vars.$pph_var_types$.getDynamicValue(thread);
    }

    public static SubLObject pph_quantifier_for_operator(final SubLObject operator) {
        if (NIL != pph_utilities.pph_isaP(operator, $$ExistentialQuantifier, UNPROVIDED)) {
            return $EXISTENTIAL;
        }
        if (operator.eql($$forAll)) {
            return $UNIVERSAL;
        }
        return $SCOPED;
    }

    public static SubLObject pph_register_scoped_vars(final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != el_formula_p(formula)) && (NIL != indexed_term_p(cycl_utilities.formula_arg0(formula)))) {
            final SubLObject operator = cycl_utilities.formula_arg0(formula);
            final SubLObject scoping_args = kb_accessors.scoping_args(operator, pph_vars.$pph_domain_mt$.getDynamicValue(thread));
            final SubLObject quantifier = (NIL != scoping_args) ? pph_quantifier_for_operator(operator) : NIL;
            SubLObject argnum = ZERO_INTEGER;
            SubLObject cdolist_list_var;
            final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(formula, $IGNORE);
            SubLObject arg = NIL;
            arg = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                argnum = add(argnum, ONE_INTEGER);
                if (NIL != member(argnum, scoping_args, UNPROVIDED, UNPROVIDED)) {
                    if ((NIL != cycl_variables.el_varP(arg)) && (NIL == pph_var_quantifier(arg))) {
                        pph_register_var_quantifier(arg, quantifier);
                    }
                } else
                    if (NIL != el_formula_p(arg)) {
                        pph_register_scoped_vars(arg);
                    }

                cdolist_list_var = cdolist_list_var.rest();
                arg = cdolist_list_var.first();
            } 
        }
        return formula;
    }

    public static SubLObject with_pph_hypothesized_vars(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list45);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject vars = NIL;
        destructuring_bind_must_consp(current, datum, $list45);
        vars = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(CLET, list(list($pph_hypothesized_vars$, listS(CCONCATENATE, vars, $list49))), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list45);
        return NIL;
    }

    public static SubLObject pph_register_query_vars(final SubLObject query_formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject query_vars = remove_if(PPH_EXISTENTIAL_VAR_P, pph_formula_free_variables(query_formula, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        query_vars = set_difference(query_vars, $pph_hypothesized_vars$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
        if (NIL != pph_question.pph_hypothesize_antecedent_varsP(query_formula)) {
            final SubLObject antecedent_vars = pph_utilities.pph_vars_to_quantify(cycl_utilities.formula_arg1(query_formula, UNPROVIDED));
            query_vars = set_difference(query_vars, antecedent_vars, UNPROVIDED, UNPROVIDED);
        }
        SubLObject cdolist_list_var = query_vars;
        SubLObject query_var = NIL;
        query_var = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                format_nil.force_format(T, $str51$__Registering__S_as_a_query_var__, query_var, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            pph_register_var_quantifier(query_var, $QUERY);
            cdolist_list_var = cdolist_list_var.rest();
            query_var = cdolist_list_var.first();
        } 
        return query_vars;
    }

    public static SubLObject pph_query_var_p(final SubLObject var) {
        return makeBoolean((NIL != cycl_variables.el_varP(var)) && ($QUERY == pph_var_quantifier(var)));
    }

    public static SubLObject pph_existential_var_p(final SubLObject var) {
        return eq($EXISTENTIAL, pph_var_quantifier(var));
    }

    public static SubLObject pph_note_if_var_is_used_only_once_in_formula(final SubLObject var, final SubLObject formula) {
        final SubLObject duplicateP = list_utilities.tree_countG(var, pph_strip_existentials(formula, UNPROVIDED), ONE_INTEGER, UNPROVIDED, UNPROVIDED);
        if (NIL == duplicateP) {
            pph_register_var_as_used_only_once(var);
        }
        return duplicateP;
    }

    public static SubLObject pph_register_var_as_used_only_once(final SubLObject var) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject entry = pph_var_entry(var);
        if (NIL != pph_var_entry_p(entry)) {
            _csetf_pph_var_entry_single_useP(entry, T);
        } else
            if ((NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) && (NIL == pph_error.suppress_pph_warningsP())) {
                Errors.warn($str53$PPH_REGISTER_VAR_AS_USED_ONLY_ONC, var);
                force_output(StreamsLow.$error_output$.getDynamicValue(thread));
            }

        return entry;
    }

    public static SubLObject pph_var_used_only_onceP(final SubLObject var) {
        final SubLObject entry = pph_var_entry(var);
        return NIL != entry ? pph_var_entry_single_useP(entry) : NIL;
    }

    public static SubLObject pph_do_var_entries(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list54);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        SubLObject var_entry = NIL;
        destructuring_bind_must_consp(current, datum, $list54);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list54);
        var_entry = current.first();
        current = current.rest();
        final SubLObject stop_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list54);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(DO_DICTIONARY, list(var, var_entry, $pph_var_types$, stop_var), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list54);
        return NIL;
    }

    public static SubLObject pph_var_quantifier(final SubLObject var) {
        final SubLObject entry = pph_var_entry(var);
        return NIL != entry ? pph_var_entry_quantifier(entry) : NIL;
    }

    public static SubLObject pph_var_type(final SubLObject var) {
        final SubLObject entry = pph_var_entry(var);
        return NIL != entry ? pph_var_entry_type(entry) : pph_default_var_type();
    }

    public static SubLObject pph_cycl_var_type(final SubLObject var) {
        final SubLObject entry = pph_var_entry(var);
        SubLObject var_type = (NIL != entry) ? pph_var_entry_type(entry) : pph_default_var_type();
        while (NIL != cycl_variables.el_varP(var_type)) {
            final SubLObject var_type_type = pph_var_type(var_type);
            if (NIL != pph_utilities.specs_fn_natP(var_type_type)) {
                var_type = cycl_utilities.nat_arg1(var_type_type, UNPROVIDED);
            } else {
                var_type = pph_default_var_type();
            }
        } 
        return var_type;
    }

    public static SubLObject pph_type_arg_position_map(final SubLObject var) {
        final SubLObject entry = pph_var_entry(var);
        final SubLObject type_map = (NIL != entry) ? pph_var_entry_arg_position(entry) : pph_utilities.pph_new_empty_map();
        return type_map;
    }

    public static SubLObject pph_unregistered_variableP(final SubLObject obj) {
        return makeBoolean((NIL != cycl_variables.el_varP(obj)) && (NIL == pph_var_registeredP(obj)));
    }

    public static SubLObject pph_duplicate_var_typeP(final SubLObject type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL != pph_vars.pph_tracking_var_types_p()) && count(type, Mapping.mapcar(symbol_function(PPH_VAR_ENTRY_TYPE), dictionary.dictionary_values(pph_vars.$pph_var_types$.getDynamicValue(thread))), symbol_function($sym57$PPH_SPEC_), UNPROVIDED, UNPROVIDED, UNPROVIDED).numG(ONE_INTEGER));
    }

    public static SubLObject pph_var_paraphrased_explicitlyP(final SubLObject obj) {
        final SubLObject var_as_var_olist = pph_methods.pph_paraphrase_var_as_var(obj, UNPROVIDED, UNPROVIDED);
        final SubLObject var_as_var_string = pph_phrase.pph_phrase_output_list_string(var_as_var_olist, UNPROVIDED);
        SubLObject foundP = NIL;
        if (NIL == foundP) {
            SubLObject csome_list_var = pph_drs.pph_discourse_phrases_for_cycl(obj);
            SubLObject paraphrase = NIL;
            paraphrase = csome_list_var.first();
            while ((NIL == foundP) && (NIL != csome_list_var)) {
                if (NIL != pph_phrase.pph_phrase_p(paraphrase, UNPROVIDED)) {
                    foundP = equal(var_as_var_string, pph_phrase.pph_phrase_string(paraphrase, UNPROVIDED));
                }
                csome_list_var = csome_list_var.rest();
                paraphrase = csome_list_var.first();
            } 
        }
        return foundP;
    }

    public static SubLObject string_mentions_varP(final SubLObject string, final SubLObject var) {
        return string_utilities.substringP(pph_phrase.pph_phrase_output_list_string(pph_methods.pph_paraphrase_var_as_var(var, UNPROVIDED, UNPROVIDED), NIL), string, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject pph_use_explicit_varP(final SubLObject var) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != pph_vars.pph_maximize_linksP()) {
            return T;
        }
        if (NIL != pph_var_previously_explicitP(var)) {
            return T;
        }
        if (NIL != pph_query_var_p(var)) {
            return makeBoolean(NIL == pph_vars.$pph_use_wh_for_query_varsP$.getDynamicValue(thread));
        }
        if (NIL != pph_var_used_only_onceP(var)) {
            return NIL;
        }
        return NIL;
    }

    public static SubLObject pph_var_type_previously_explicit_if_mentionedP(final SubLObject type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(pph_vars.$pph_var_types$.getDynamicValue(thread))); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject var_entry_var = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject var_entry = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if ((!pph_var_entry_type(var_entry).equal(type)) || (NIL == pph_drs.pph_discourse_referentP(var_entry_var))) {
                return NIL;
            }
            SubLObject cdolist_list_var = pph_drs.pph_discourse_phrases_for_cycl(var_entry_var);
            SubLObject paraphrase = NIL;
            paraphrase = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if ((NIL != pph_phrase.pph_phrase_p(paraphrase, UNPROVIDED)) && (NIL != string_mentions_varP(pph_phrase.pph_phrase_string(paraphrase, NIL), var_entry_var))) {
                    return T;
                }
                cdolist_list_var = cdolist_list_var.rest();
                paraphrase = cdolist_list_var.first();
            } 
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return NIL;
    }

    public static SubLObject pph_var_previously_explicitP(final SubLObject var) {
        final SubLObject paraphrases = pph_drs.pph_discourse_phrases_for_cycl(var);
        SubLObject explicitP = NIL;
        if (NIL == explicitP) {
            SubLObject csome_list_var = paraphrases;
            SubLObject paraphrase = NIL;
            paraphrase = csome_list_var.first();
            while ((NIL == explicitP) && (NIL != csome_list_var)) {
                if (NIL != pph_phrase.pph_phrase_p(paraphrase, UNPROVIDED)) {
                    explicitP = string_mentions_varP(pph_phrase.pph_phrase_string(paraphrase, NIL), var);
                }
                csome_list_var = csome_list_var.rest();
                paraphrase = csome_list_var.first();
            } 
        }
        return explicitP;
    }

    public static SubLObject pph_var_previously_lexifiedP(final SubLObject var) {
        final SubLObject paraphrases = pph_drs.pph_discourse_phrases_for_cycl(var);
        SubLObject lexifiedP = NIL;
        if (NIL == lexifiedP) {
            SubLObject csome_list_var = paraphrases;
            SubLObject paraphrase = NIL;
            paraphrase = csome_list_var.first();
            while ((NIL == lexifiedP) && (NIL != csome_list_var)) {
                if ((NIL == pph_phrase.pph_phrase_p(paraphrase, UNPROVIDED)) || (NIL == string_mentions_varP(pph_phrase.pph_phrase_string(paraphrase, NIL), var))) {
                    lexifiedP = T;
                }
                csome_list_var = csome_list_var.rest();
                paraphrase = csome_list_var.first();
            } 
        }
        return lexifiedP;
    }

    public static SubLObject pph_string_is_posP_internal(final SubLObject string, final SubLObject pos, SubLObject parse_morphologically, SubLObject mt) {
        if (parse_morphologically == UNPROVIDED) {
            parse_morphologically = $NEVER;
        }
        if (mt == UNPROVIDED) {
            mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = pph_vars.$allow_utf8_in_pph_text_mode$.currentBinding(thread);
        final SubLObject _prev_bind_3 = lexicon_vars.$parse_morphologically$.currentBinding(thread);
        try {
            lexicon_vars.$lexicon_lookup_mt$.bind(mt, thread);
            pph_vars.$allow_utf8_in_pph_text_mode$.bind(T, thread);
            lexicon_vars.$parse_morphologically$.bind(parse_morphologically, thread);
            final SubLObject local_state = pph_macros.find_or_create_pph_external_memoization_state();
            final SubLObject _prev_bind_0_$1 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    ans = lexicon_accessors.string_is_posP(pph_string.pph_string_if_non_null_to_output_format(string, $TEXT), pos, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } finally {
                    final SubLObject _prev_bind_0_$2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2, thread);
                    }
                }
            } finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0_$1, thread);
            }
        } finally {
            lexicon_vars.$parse_morphologically$.rebind(_prev_bind_3, thread);
            pph_vars.$allow_utf8_in_pph_text_mode$.rebind(_prev_bind_2, thread);
            lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject pph_string_is_posP(final SubLObject string, final SubLObject pos, SubLObject parse_morphologically, SubLObject mt) {
        if (parse_morphologically == UNPROVIDED) {
            parse_morphologically = $NEVER;
        }
        if (mt == UNPROVIDED) {
            mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return pph_string_is_posP_internal(string, pos, parse_morphologically, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym58$PPH_STRING_IS_POS_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym58$PPH_STRING_IS_POS_, FOUR_INTEGER, $int$128, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym58$PPH_STRING_IS_POS_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_4(string, pos, parse_morphologically, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (string.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (pos.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (parse_morphologically.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(pph_string_is_posP_internal(string, pos, parse_morphologically, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(string, pos, parse_morphologically, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject pph_var_previously_pronounP(final SubLObject var) {
        final SubLObject paraphrases = pph_drs.pph_discourse_phrases_for_cycl(var);
        SubLObject pronounP = NIL;
        if (NIL == pronounP) {
            SubLObject csome_list_var = paraphrases;
            SubLObject paraphrase = NIL;
            paraphrase = csome_list_var.first();
            while ((NIL == pronounP) && (NIL != csome_list_var)) {
                if (NIL != pph_phrase.pph_phrase_p(paraphrase, UNPROVIDED)) {
                    pronounP = pph_string_is_posP(pph_phrase.pph_phrase_string(paraphrase, NIL), $$Pronoun, $NEVER, UNPROVIDED);
                }
                csome_list_var = csome_list_var.rest();
                paraphrase = csome_list_var.first();
            } 
        }
        return pronounP;
    }

    public static SubLObject pph_register_vars_as_different(final SubLObject var1, final SubLObject var2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        $pph_different_vars$.setDynamicValue(list_utilities.alist_enter($pph_different_vars$.getDynamicValue(thread), var1, var2, UNPROVIDED), thread);
        return $pph_different_vars$.getDynamicValue(thread);
    }

    public static SubLObject pph_different_varsP(final SubLObject var1, final SubLObject var2, SubLObject strictP) {
        if (strictP == UNPROVIDED) {
            strictP = T;
        }
        if (NIL != strictP) {
            return makeBoolean((NIL != pph_different_varsP_int(var1, var2)) || (NIL != pph_different_varsP_int(var2, var1)));
        }
        return makeBoolean(!var1.eql(var2));
    }

    public static SubLObject pph_different_varsP_int(final SubLObject var1, final SubLObject var2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return eql(var2, list_utilities.alist_lookup($pph_different_vars$.getDynamicValue(thread), var1, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject pph_note_var_type(final SubLObject var, final SubLObject type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != dictionary.dictionary_p(pph_vars.$pph_noted_var_types$.getDynamicValue(thread))) {
            dictionary_utilities.dictionary_pushnew(pph_vars.$pph_noted_var_types$.getDynamicValue(thread), var, type, symbol_function(EQUAL), UNPROVIDED);
            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                format_nil.force_format(T, $str63$__Noted___S_is_a__S___, var, type, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        }
        return var;
    }

    public static SubLObject pph_other_vars_with_var_type(final SubLObject var) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject other_vars = NIL;
        if (NIL != dictionary.dictionary_p(pph_vars.$pph_noted_var_types$.getDynamicValue(thread))) {
            final SubLObject type = pph_var_type(var);
            SubLObject found_varP = NIL;
            SubLObject cdolist_list_var = pph_vars_with_type(type);
            SubLObject other_var = NIL;
            other_var = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (other_var.equal(var)) {
                    found_varP = T;
                } else {
                    other_vars = cons(other_var, other_vars);
                }
                cdolist_list_var = cdolist_list_var.rest();
                other_var = cdolist_list_var.first();
            } 
        }
        return other_vars;
    }

    public static SubLObject pph_vars_with_type(final SubLObject type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject vars = NIL;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(pph_vars.$pph_noted_var_types$.getDynamicValue(thread))); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject var = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject var_types = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject cdolist_list_var = var_types;
            SubLObject var_type = NIL;
            var_type = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != pph_utilities.pph_genlP(var_type, type, UNPROVIDED)) {
                    vars = cons(var, vars);
                }
                cdolist_list_var = cdolist_list_var.rest();
                var_type = cdolist_list_var.first();
            } 
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return vars;
    }

    public static SubLObject pph_var_previously_paraphrased_with_otherP(final SubLObject var) {
        final SubLObject paraphrases = pph_drs.pph_discourse_phrases_for_cycl(var);
        SubLObject v_answer = NIL;
        if (NIL == v_answer) {
            SubLObject csome_list_var = paraphrases;
            SubLObject paraphrase = NIL;
            paraphrase = csome_list_var.first();
            while ((NIL == v_answer) && (NIL != csome_list_var)) {
                if (NIL != pph_phrase.pph_phrase_p(paraphrase, UNPROVIDED)) {
                    final SubLObject paraphrase_string = pph_phrase.pph_phrase_string(paraphrase, NIL);
                    if ((NIL != string_utilities.substringP($$$other, paraphrase_string, UNPROVIDED, UNPROVIDED, UNPROVIDED)) && ((((NIL != string_utilities.substringP($$$_other_, paraphrase_string, UNPROVIDED, UNPROVIDED, UNPROVIDED)) || (NIL != string_utilities.starts_with($$$other_, paraphrase_string))) || (NIL != string_utilities.substringP($$$_another, paraphrase_string, UNPROVIDED, UNPROVIDED, UNPROVIDED))) || (NIL != string_utilities.starts_with($$$another, paraphrase_string)))) {
                        v_answer = T;
                    }
                }
                csome_list_var = csome_list_var.rest();
                paraphrase = csome_list_var.first();
            } 
        }
        return v_answer;
    }

    public static SubLObject pph_formula_free_variables_internal(final SubLObject formula, SubLObject bound_vars) {
        if (bound_vars == UNPROVIDED) {
            bound_vars = NIL;
        }
        SubLObject free_vars = NIL;
        if (NIL == nart_handles.nart_p(formula)) {
            if (NIL != cycl_grammar.cycl_sentence_p(formula)) {
                free_vars = sentence_free_variables(formula, bound_vars, $sym70$EL_VAR_, UNPROVIDED);
            } else
                if (NIL != narts_high.naut_p(formula)) {
                    free_vars = naut_free_variables(formula, bound_vars, $sym70$EL_VAR_, UNPROVIDED);
                }

        }
        return free_vars;
    }

    public static SubLObject pph_formula_free_variables(final SubLObject formula, SubLObject bound_vars) {
        if (bound_vars == UNPROVIDED) {
            bound_vars = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return pph_formula_free_variables_internal(formula, bound_vars);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PPH_FORMULA_FREE_VARIABLES, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PPH_FORMULA_FREE_VARIABLES, TWO_INTEGER, $int$98, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, PPH_FORMULA_FREE_VARIABLES, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(formula, bound_vars);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (formula.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && bound_vars.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(pph_formula_free_variables_internal(formula, bound_vars)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(formula, bound_vars));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject pph_var_scoped_or_quotedP(final SubLObject var, final SubLObject formula) {
        if (NIL != pph_utilities.pph_formula_with_dotsP(formula)) {
            return NIL;
        }
        SubLObject freeP = NIL;
        if (NIL == freeP) {
            SubLObject csome_list_var;
            SubLObject tree_position;
            for (csome_list_var = cycl_utilities.arg_positions_bfs(var, formula, symbol_function(EQL)), tree_position = NIL, tree_position = csome_list_var.first(); (NIL == freeP) && (NIL != csome_list_var); freeP = makeBoolean(NIL == pph_arg_scoped_or_quotedP(tree_position, formula)) , csome_list_var = csome_list_var.rest() , tree_position = csome_list_var.first()) {
            }
        }
        return makeBoolean(NIL == freeP);
    }

    public static SubLObject pph_arg_scoped_or_quotedP(final SubLObject arg_position, final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject operator = cycl_utilities.formula_arg0(formula);
        final SubLObject arg_num = arg_position.first();
        if (NIL != pph_operator_arg_scopedP(operator, arg_num, pph_vars.$pph_domain_mt$.getDynamicValue(thread))) {
            return T;
        }
        if ((NIL != list_utilities.singletonP(arg_position)) && ((NIL != pph_operator_arg_quotedP(operator, arg_num)) || (arg_position.equal($list72) && (NIL != formula_pattern_match.formula_matches_pattern(formula, $list73))))) {
            return T;
        }
        if (NIL != list_utilities.lengthG(arg_position, ONE_INTEGER, UNPROVIDED)) {
            final SubLObject sub_formula = cycl_utilities.formula_arg(formula, arg_num, UNPROVIDED);
            return pph_arg_scopedP(arg_position.rest(), sub_formula);
        }
        return NIL;
    }

    public static SubLObject pph_quoted_collectionP(final SubLObject v_object) {
        return makeBoolean((NIL != indexed_term_p(v_object)) && (NIL != pph_utilities.pph_removal_ask_boolean(list($$quotedCollection, v_object), UNPROVIDED)));
    }

    public static SubLObject pph_arg_scopedP(final SubLObject arg_position, final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject operator = cycl_utilities.formula_arg0(formula);
        final SubLObject arg_num = arg_position.first();
        if (NIL != pph_operator_arg_scopedP(operator, arg_num, pph_vars.$pph_domain_mt$.getDynamicValue(thread))) {
            return T;
        }
        if (NIL != list_utilities.lengthG(arg_position, ONE_INTEGER, UNPROVIDED)) {
            final SubLObject sub_formula = cycl_utilities.formula_arg(formula, arg_num, UNPROVIDED);
            return pph_arg_scopedP(arg_position.rest(), sub_formula);
        }
        return NIL;
    }

    public static SubLObject pph_operator_arg_scopedP_internal(final SubLObject operator, final SubLObject arg_num, final SubLObject mt) {
        return makeBoolean((NIL != indexed_term_p(operator)) && (NIL != member(arg_num, kb_accessors.scoping_args(operator, mt), symbol_function(EQL), UNPROVIDED)));
    }

    public static SubLObject pph_operator_arg_scopedP(final SubLObject operator, final SubLObject arg_num, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return pph_operator_arg_scopedP_internal(operator, arg_num, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym75$PPH_OPERATOR_ARG_SCOPED_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym75$PPH_OPERATOR_ARG_SCOPED_, THREE_INTEGER, $int$200, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym75$PPH_OPERATOR_ARG_SCOPED_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(operator, arg_num, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (operator.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (arg_num.eql(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.eql(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(pph_operator_arg_scopedP_internal(operator, arg_num, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(operator, arg_num, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject pph_operator_arg_quotedP_internal(final SubLObject operator, final SubLObject arg_num) {
        return makeBoolean((NIL != indexed_term_p(operator)) && (NIL != kb_accessors.quoted_argumentP(operator, arg_num)));
    }

    public static SubLObject pph_operator_arg_quotedP(final SubLObject operator, final SubLObject arg_num) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return pph_operator_arg_quotedP_internal(operator, arg_num);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym77$PPH_OPERATOR_ARG_QUOTED_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym77$PPH_OPERATOR_ARG_QUOTED_, TWO_INTEGER, $int$200, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym77$PPH_OPERATOR_ARG_QUOTED_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(operator, arg_num);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (operator.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && arg_num.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(pph_operator_arg_quotedP_internal(operator, arg_num)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(operator, arg_num));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject pph_variable_isa_constraints(final SubLObject var, final SubLObject formula, SubLObject mt, SubLObject use_var_typing_clausesP, SubLObject directlyP, SubLObject validity_test) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (use_var_typing_clausesP == UNPROVIDED) {
            use_var_typing_clausesP = T;
        }
        if (directlyP == UNPROVIDED) {
            directlyP = NIL;
        }
        if (validity_test == UNPROVIDED) {
            validity_test = $sym78$PPH_VALID_VAR_TYPE_;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        final SubLObject var_types = set.new_set(symbol_function(EQUAL), UNPROVIDED);
        final SubLObject stripped = pph_strip_existentials(formula, T);
        final SubLObject clausal_form = ((NIL != el_universal_p(stripped)) || (NIL != el_implication_p(stripped))) ? $CNF : $DNF;
        thread.resetMultipleValues();
        final SubLObject v_clauses = pph_clausal_form(stripped, mt, clausal_form);
        final SubLObject new_mt = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (v_clauses.isList()) {
            SubLObject list_var = NIL;
            SubLObject clause = NIL;
            SubLObject clause_num = NIL;
            list_var = v_clauses;
            clause = list_var.first();
            for (clause_num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , clause = list_var.first() , clause_num = add(ONE_INTEGER, clause_num)) {
                SubLObject current;
                final SubLObject datum = current = clause;
                SubLObject neg_lits = NIL;
                SubLObject pos_lits = NIL;
                destructuring_bind_must_consp(current, datum, $list81);
                neg_lits = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list81);
                pos_lits = current.first();
                current = current.rest();
                if (NIL == current) {
                    final SubLObject lits_to_use = (NIL != neg_lits) ? neg_lits : pos_lits;
                    SubLObject this_clause_constraints = NIL;
                    SubLObject cdolist_list_var = lits_to_use;
                    SubLObject exp = NIL;
                    exp = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        if (NIL != cycl_utilities.expression_find(var, exp, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                            thread.resetMultipleValues();
                            final SubLObject more_ans = pph_variable_isa_constraints_in_lit(var, exp, lits_to_use, new_mt, use_var_typing_clausesP, validity_test);
                            final SubLObject more_var_types = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            this_clause_constraints = append(this_clause_constraints, more_ans, more_var_types);
                            set_utilities.set_add_all(more_var_types, var_types);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        exp = cdolist_list_var.first();
                    } 
                    if (clause_num.eql(ZERO_INTEGER) || (clausal_form == $CNF)) {
                        ans = append(ans, this_clause_constraints);
                    } else {
                        ans = pph_utilities.pph_min_ceiling_cols(pph_delete_genls(append(ans, this_clause_constraints)), NIL, mt, UNPROVIDED);
                    }
                } else {
                    cdestructuring_bind_error(datum, $list81);
                }
            }
        }
        ans = list_utilities.delete_if_not(validity_test, delete($$CycLVariable, ans, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL != find_if($sym83$SPECS_FN_NAT_, ans, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                format_nil.force_format(T, $str84$Removing_non_SpecsFn_terms_from__, ans, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            ans = list_utilities.remove_if_not($sym83$SPECS_FN_NAT_, ans, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        if ((NIL == directlyP) && (NIL == set.set_emptyP(var_types))) {
            ans = pph_replace_direct_var_types(var_types, ans, mt);
        }
        return Sort.sort(pph_delete_genls(ans), $sym85$PPH_GENERALITY_ESTIMATE_, UNPROVIDED);
    }

    public static SubLObject pph_replace_direct_var_types(final SubLObject var_types, SubLObject ans, final SubLObject mt) {
        for (SubLObject var_types_okP = NIL, v_iteration = ZERO_INTEGER, max_iterations = TEN_INTEGER; (NIL == var_types_okP) && (!v_iteration.numGE(max_iterations)); var_types_okP = T) {
            v_iteration = add(v_iteration, ONE_INTEGER);
            SubLObject to_remove = NIL;
            SubLObject cdolist_list_var = ans;
            SubLObject type = NIL;
            type = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != set.set_memberP(type, var_types)) {
                    to_remove = cons(type, to_remove);
                }
                cdolist_list_var = cdolist_list_var.rest();
                type = cdolist_list_var.first();
            } 
            if (NIL == list_utilities.empty_list_p(to_remove)) {
                cdolist_list_var = to_remove;
                type = NIL;
                type = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    ans = delete(type, ans, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    ans = append(ans, pph_genls(type, mt));
                    cdolist_list_var = cdolist_list_var.rest();
                    type = cdolist_list_var.first();
                } 
            }
        }
        return ans;
    }

    public static SubLObject pph_clausal_form_internal(final SubLObject expression, final SubLObject mt, final SubLObject dnf_or_cnf) {
        return clausifier.clausal_form(expression, mt, dnf_or_cnf);
    }

    public static SubLObject pph_clausal_form(final SubLObject expression, final SubLObject mt, final SubLObject dnf_or_cnf) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return pph_clausal_form_internal(expression, mt, dnf_or_cnf);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PPH_CLAUSAL_FORM, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PPH_CLAUSAL_FORM, THREE_INTEGER, $int$32, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, PPH_CLAUSAL_FORM, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(expression, mt, dnf_or_cnf);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (expression.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (mt.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && dnf_or_cnf.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(pph_clausal_form_internal(expression, mt, dnf_or_cnf)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(expression, mt, dnf_or_cnf));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject pph_variable_isa_constraints_in_lit_internal(final SubLObject var, final SubLObject exp, final SubLObject lits, final SubLObject mt, SubLObject use_var_typing_clausesP, SubLObject validity_test) {
        if (use_var_typing_clausesP == UNPROVIDED) {
            use_var_typing_clausesP = T;
        }
        if (validity_test == UNPROVIDED) {
            validity_test = $sym78$PPH_VALID_VAR_TYPE_;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        SubLObject from_var_typing_clauses = NIL;
        final SubLObject op = cycl_utilities.formula_operator(exp);
        final SubLObject pos = cycl_utilities.formula_arg_positions(exp, var, symbol_function(EQL)).first();
        if ((NIL != forts.fort_p(op)) && pos.isInteger()) {
            ans = append(kb_accessors.argn_isa(op, pos, mt), ans);
            SubLObject cdolist_list_var = kb_accessors.argn_genl(op, pos, mt);
            SubLObject genl = NIL;
            genl = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject item_var = pph_utilities.pph_make_type_level(genl);
                if (NIL == member(item_var, ans, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                    ans = cons(item_var, ans);
                }
                cdolist_list_var = cdolist_list_var.rest();
                genl = cdolist_list_var.first();
            } 
        }
        if (NIL != pph_utilities.pph_isaP(op, $$FamilyRelationSlot, UNPROVIDED)) {
            ans = cons($$Agent_Generic, ans);
        }
        if (NIL != pph_types.pph_rmp_sentenceP(exp)) {
            SubLObject rbp_constraints = NIL;
            final SubLObject local_state = pph_macros.find_or_create_pph_external_memoization_state();
            final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    rbp_constraints = rbp_wff.rbp_formula_variable_isa_constraints(exp, var);
                } finally {
                    final SubLObject _prev_bind_0_$3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                    }
                }
            } finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
            }
            SubLObject cdolist_list_var2 = rbp_constraints;
            SubLObject raw_constraint = NIL;
            raw_constraint = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                SubLObject current;
                final SubLObject datum = current = raw_constraint;
                SubLObject type = NIL;
                SubLObject target = NIL;
                SubLObject constraint_mt = NIL;
                destructuring_bind_must_consp(current, datum, $list91);
                type = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list91);
                target = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list91);
                constraint_mt = current.first();
                current = current.rest();
                if (NIL == current) {
                    final SubLObject pcase_var = type;
                    if (pcase_var.eql($ISA)) {
                        final SubLObject item_var2 = target;
                        if (NIL == member(item_var2, ans, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                            ans = cons(item_var2, ans);
                        }
                    } else
                        if (pcase_var.eql($GENL) || pcase_var.eql($NOT_DISJOINT)) {
                            final SubLObject item_var2 = pph_utilities.pph_make_type_level(target);
                            if (NIL == member(item_var2, ans, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                ans = cons(item_var2, ans);
                            }
                        }

                } else {
                    cdestructuring_bind_error(datum, $list91);
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                raw_constraint = cdolist_list_var2.first();
            } 
        }
        if ((NIL != use_var_typing_clausesP) && (NIL != pph_utilities.pph_var_typing_clauseP(exp, var, validity_test))) {
            from_var_typing_clauses = cons(pph_utilities.pph_var_type_from_asent(exp), from_var_typing_clauses);
        }
        thread.resetMultipleValues();
        final SubLObject more_ans = pph_variable_isa_constraints_in_subexpressions(var, exp, lits, mt, use_var_typing_clausesP);
        final SubLObject more_var_types = thread.secondMultipleValue();
        thread.resetMultipleValues();
        ans = cconcatenate(ans, more_ans);
        from_var_typing_clauses = cconcatenate(from_var_typing_clauses, more_var_types);
        return values(Sort.sort(pph_delete_genls(ans), $sym85$PPH_GENERALITY_ESTIMATE_, UNPROVIDED), Sort.sort(pph_delete_genls(from_var_typing_clauses), $sym85$PPH_GENERALITY_ESTIMATE_, UNPROVIDED));
    }

    public static SubLObject pph_variable_isa_constraints_in_lit(final SubLObject var, final SubLObject exp, final SubLObject lits, final SubLObject mt, SubLObject use_var_typing_clausesP, SubLObject validity_test) {
        if (use_var_typing_clausesP == UNPROVIDED) {
            use_var_typing_clausesP = T;
        }
        if (validity_test == UNPROVIDED) {
            validity_test = $sym78$PPH_VALID_VAR_TYPE_;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return pph_variable_isa_constraints_in_lit_internal(var, exp, lits, mt, use_var_typing_clausesP, validity_test);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PPH_VARIABLE_ISA_CONSTRAINTS_IN_LIT, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PPH_VARIABLE_ISA_CONSTRAINTS_IN_LIT, SIX_INTEGER, $int$100, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, PPH_VARIABLE_ISA_CONSTRAINTS_IN_LIT, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_6(var, exp, lits, mt, use_var_typing_clausesP, validity_test);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (var.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (exp.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (lits.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (mt.equal(cached_args.first())) {
                                cached_args = cached_args.rest();
                                if (use_var_typing_clausesP.equal(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && validity_test.equal(cached_args.first())) {
                                        return memoization_state.caching_results(results2);
                                    }
                                }
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(pph_variable_isa_constraints_in_lit_internal(var, exp, lits, mt, use_var_typing_clausesP, validity_test)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(var, exp, lits, mt, use_var_typing_clausesP, validity_test));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject pph_genls(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        if (NIL != indexed_term_p(v_term)) {
            return genls.genls(v_term, mt, UNPROVIDED);
        }
        if (NIL != pph_utilities.specs_fn_natP(v_term)) {
            final SubLObject core_term = pph_utilities.pph_core_term(v_term);
            return NIL != pph_utilities.specs_fn_natP(core_term) ? NIL : Mapping.mapcar(PPH_MAKE_TYPE_LEVEL, pph_genls(core_term, mt));
        }
        return NIL;
    }

    public static SubLObject pph_variable_isa_constraints_in_subexpressions(final SubLObject var, final SubLObject exp, final SubLObject lits, final SubLObject mt, final SubLObject use_var_typing_clausesP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        SubLObject from_var_typing_clauses = NIL;
        final SubLObject use_var_typing_sub_clausesP = makeBoolean((NIL != use_var_typing_clausesP) && (NIL != pph_truth_preserving_operatorP(cycl_utilities.formula_arg0(exp), UNPROVIDED)));
        SubLObject cdolist_list_var;
        final SubLObject terms = cdolist_list_var = cycl_utilities.formula_terms(exp, $IGNORE);
        SubLObject sub_exp = NIL;
        sub_exp = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != atomic_sentenceP(sub_exp)) {
                thread.resetMultipleValues();
                final SubLObject more_ans = pph_variable_isa_constraints_in_lit(var, sub_exp, lits, mt, use_var_typing_sub_clausesP, UNPROVIDED);
                final SubLObject more_var_types = thread.secondMultipleValue();
                thread.resetMultipleValues();
                ans = append(ans, more_ans);
                from_var_typing_clauses = append(from_var_typing_clauses, more_var_types);
            }
            if (NIL != el_formula_p(sub_exp)) {
                thread.resetMultipleValues();
                final SubLObject more_ans = pph_variable_isa_constraints_in_subexpressions(var, sub_exp, lits, mt, use_var_typing_sub_clausesP);
                final SubLObject more_var_types = thread.secondMultipleValue();
                thread.resetMultipleValues();
                ans = append(ans, more_ans);
                from_var_typing_clauses = append(from_var_typing_clauses, more_var_types);
            }
            cdolist_list_var = cdolist_list_var.rest();
            sub_exp = cdolist_list_var.first();
        } 
        return values(ans, from_var_typing_clauses);
    }

    public static SubLObject pph_truth_preserving_operatorP_internal(final SubLObject operator, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        return makeBoolean((NIL != forts.fort_p(operator)) && (((NIL != member(operator, $list98, UNPROVIDED, UNPROVIDED)) || (NIL != member(operator, $list99, UNPROVIDED, UNPROVIDED))) || ((NIL != fort_types_interface.predicateP(operator)) && ((((NIL != pph_utilities.pph_genl_predicateP(operator, $$extentCardinality, mt)) || (NIL != pph_utilities.pph_genl_predicateP(operator, $$trueSentence, mt))) || (NIL != pph_utilities.pph_genl_predicateP(operator, $$holdsSometimeDuring, mt))) || (NIL != pph_utilities.pph_genl_predicateP(operator, $$ist, mt))))));
    }

    public static SubLObject pph_truth_preserving_operatorP(final SubLObject operator, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return pph_truth_preserving_operatorP_internal(operator, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym97$PPH_TRUTH_PRESERVING_OPERATOR_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym97$PPH_TRUTH_PRESERVING_OPERATOR_, TWO_INTEGER, $int$200, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym97$PPH_TRUTH_PRESERVING_OPERATOR_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(operator, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (operator.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(pph_truth_preserving_operatorP_internal(operator, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(operator, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject pph_strip_existentials(SubLObject formula, SubLObject include_nested_existentialsP) {
        if (include_nested_existentialsP == UNPROVIDED) {
            include_nested_existentialsP = NIL;
        }
        if (NIL != include_nested_existentialsP) {
            return cycl_utilities.expression_transform(formula, EL_EXISTENTIAL_P, QUANTIFIED_SUB_SENTENCE, UNPROVIDED, UNPROVIDED);
        }
        while (NIL != el_existential_p(formula)) {
            formula = quantified_sub_sentence(formula);
        } 
        return formula;
    }

    public static SubLObject pph_delete_genls(SubLObject cols) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (!cols.isList()) {
            return NIL;
        }
        SubLObject ans = NIL;
        SubLObject col = NIL;
        ans = NIL;
        for (col = delete_duplicates(cols, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED).first(); NIL != col; col = cols.first()) {
            cols = cols.rest();
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(pph_vars.$pph_domain_mt$.getDynamicValue(thread));
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                if ((NIL == subl_promotions.memberP(col, cols, $sym57$PPH_SPEC_, UNPROVIDED)) && (NIL == member(col, ans, $sym57$PPH_SPEC_, UNPROVIDED))) {
                    ans = cons(col, ans);
                }
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
            // ans = ans;
        }
        return ans;
    }

    public static SubLObject pph_min_variable_isa_constraint_internal(final SubLObject var, final SubLObject formula, SubLObject mt, SubLObject use_var_typing_clausesP, SubLObject directlyP, SubLObject validity_test) {
        if (mt == UNPROVIDED) {
            mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        if (use_var_typing_clausesP == UNPROVIDED) {
            use_var_typing_clausesP = T;
        }
        if (directlyP == UNPROVIDED) {
            directlyP = NIL;
        }
        if (validity_test == UNPROVIDED) {
            validity_test = $sym78$PPH_VALID_VAR_TYPE_;
        }
        final SubLObject constraints = pph_variable_isa_constraints(var, formula, mt, use_var_typing_clausesP, directlyP, validity_test);
        final SubLObject found_constraints = pph_find_most_specific(constraints, UNPROVIDED);
        final SubLObject choice = (NIL != found_constraints) ? found_constraints : pph_default_var_type();
        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
            format_nil.force_format(T, $str107$Constraints_on__S_are__S_____choo, var, constraints, choice, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return choice;
    }

    public static SubLObject pph_min_variable_isa_constraint(final SubLObject var, final SubLObject formula, SubLObject mt, SubLObject use_var_typing_clausesP, SubLObject directlyP, SubLObject validity_test) {
        if (mt == UNPROVIDED) {
            mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        if (use_var_typing_clausesP == UNPROVIDED) {
            use_var_typing_clausesP = T;
        }
        if (directlyP == UNPROVIDED) {
            directlyP = NIL;
        }
        if (validity_test == UNPROVIDED) {
            validity_test = $sym78$PPH_VALID_VAR_TYPE_;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return pph_min_variable_isa_constraint_internal(var, formula, mt, use_var_typing_clausesP, directlyP, validity_test);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PPH_MIN_VARIABLE_ISA_CONSTRAINT, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PPH_MIN_VARIABLE_ISA_CONSTRAINT, SIX_INTEGER, $int$98, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, PPH_MIN_VARIABLE_ISA_CONSTRAINT, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_6(var, formula, mt, use_var_typing_clausesP, directlyP, validity_test);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (var.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (formula.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (mt.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (use_var_typing_clausesP.equal(cached_args.first())) {
                                cached_args = cached_args.rest();
                                if (directlyP.equal(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && validity_test.equal(cached_args.first())) {
                                        return memoization_state.caching_results(results2);
                                    }
                                }
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(pph_min_variable_isa_constraint_internal(var, formula, mt, use_var_typing_clausesP, directlyP, validity_test)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(var, formula, mt, use_var_typing_clausesP, directlyP, validity_test));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject pph_find_most_specific_internal(final SubLObject items, SubLObject test) {
        if (test == UNPROVIDED) {
            test = $sym85$PPH_GENERALITY_ESTIMATE_;
        }
        SubLObject ans = items.first();
        SubLObject cdolist_list_var = items.rest();
        SubLObject other = NIL;
        other = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject pcase_var = test;
            if (pcase_var.eql(QUOTE) || pcase_var.eql($sym85$PPH_GENERALITY_ESTIMATE_)) {
                if (NIL != pph_utilities.pph_generality_estimateL(other, ans)) {
                    ans = other;
                }
            } else
                if (NIL != funcall(test, other, ans)) {
                    ans = other;
                }

            cdolist_list_var = cdolist_list_var.rest();
            other = cdolist_list_var.first();
        } 
        return ans;
    }

    public static SubLObject pph_find_most_specific(final SubLObject items, SubLObject test) {
        if (test == UNPROVIDED) {
            test = $sym85$PPH_GENERALITY_ESTIMATE_;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return pph_find_most_specific_internal(items, test);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PPH_FIND_MOST_SPECIFIC, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PPH_FIND_MOST_SPECIFIC, TWO_INTEGER, $int$100, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, PPH_FIND_MOST_SPECIFIC, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(items, test);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (items.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && test.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(pph_find_most_specific_internal(items, test)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(items, test));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject declare_pph_variable_handling_file() {
        declareFunction(me, "pph_var_entry_print_function_trampoline", "PPH-VAR-ENTRY-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "pph_var_entry_p", "PPH-VAR-ENTRY-P", 1, 0, false);
        new pph_variable_handling.$pph_var_entry_p$UnaryFunction();
        declareFunction(me, "pph_var_entry_var", "PPH-VAR-ENTRY-VAR", 1, 0, false);
        declareFunction(me, "pph_var_entry_type", "PPH-VAR-ENTRY-TYPE", 1, 0, false);
        declareFunction(me, "pph_var_entry_quantifier", "PPH-VAR-ENTRY-QUANTIFIER", 1, 0, false);
        declareFunction(me, "pph_var_entry_single_useP", "PPH-VAR-ENTRY-SINGLE-USE?", 1, 0, false);
        declareFunction(me, "pph_var_entry_arg_position", "PPH-VAR-ENTRY-ARG-POSITION", 1, 0, false);
        declareFunction(me, "_csetf_pph_var_entry_var", "_CSETF-PPH-VAR-ENTRY-VAR", 2, 0, false);
        declareFunction(me, "_csetf_pph_var_entry_type", "_CSETF-PPH-VAR-ENTRY-TYPE", 2, 0, false);
        declareFunction(me, "_csetf_pph_var_entry_quantifier", "_CSETF-PPH-VAR-ENTRY-QUANTIFIER", 2, 0, false);
        declareFunction(me, "_csetf_pph_var_entry_single_useP", "_CSETF-PPH-VAR-ENTRY-SINGLE-USE?", 2, 0, false);
        declareFunction(me, "_csetf_pph_var_entry_arg_position", "_CSETF-PPH-VAR-ENTRY-ARG-POSITION", 2, 0, false);
        declareFunction(me, "make_pph_var_entry", "MAKE-PPH-VAR-ENTRY", 0, 1, false);
        declareFunction(me, "visit_defstruct_pph_var_entry", "VISIT-DEFSTRUCT-PPH-VAR-ENTRY", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_pph_var_entry_method", "VISIT-DEFSTRUCT-OBJECT-PPH-VAR-ENTRY-METHOD", 2, 0, false);
        declareFunction(me, "pprint_pph_var_entry", "PPRINT-PPH-VAR-ENTRY", 3, 0, false);
        declareFunction(me, "new_pph_var_entry", "NEW-PPH-VAR-ENTRY", 1, 4, false);
        declareFunction(me, "pph_var_entry_copy", "PPH-VAR-ENTRY-COPY", 1, 0, false);
        declareFunction(me, "set_pph_var_type", "SET-PPH-VAR-TYPE", 2, 0, false);
        declareFunction(me, "set_pph_var_type_map", "SET-PPH-VAR-TYPE-MAP", 2, 0, false);
        declareFunction(me, "set_pph_var_quantifier", "SET-PPH-VAR-QUANTIFIER", 2, 0, false);
        declareFunction(me, "clear_pph_var_types", "CLEAR-PPH-VAR-TYPES", 0, 0, false);
        declareFunction(me, "pph_default_var_type", "PPH-DEFAULT-VAR-TYPE", 0, 0, false);
        declareFunction(me, "pph_registered_vars", "PPH-REGISTERED-VARS", 0, 0, false);
        declareFunction(me, "pph_var_entry", "PPH-VAR-ENTRY", 1, 0, false);
        declareFunction(me, "pph_var_entries", "PPH-VAR-ENTRIES", 1, 0, false);
        declareFunction(me, "pph_var_registeredP", "PPH-VAR-REGISTERED?", 1, 0, false);
        declareFunction(me, "pph_var_registered_as_defaultP", "PPH-VAR-REGISTERED-AS-DEFAULT?", 1, 0, false);
        declareFunction(me, "pph_register_var", "PPH-REGISTER-VAR", 1, 2, false);
        declareFunction(me, "pph_update_var_type", "PPH-UPDATE-VAR-TYPE", 2, 0, false);
        declareFunction(me, "pph_deregister_var", "PPH-DEREGISTER-VAR", 1, 0, false);
        declareFunction(me, "pph_deregister_vars", "PPH-DEREGISTER-VARS", 1, 0, false);
        declareFunction(me, "pph_var_quantifiedP", "PPH-VAR-QUANTIFIED?", 1, 0, false);
        declareFunction(me, "pph_register_var_quantifier", "PPH-REGISTER-VAR-QUANTIFIER", 2, 0, false);
        declareFunction(me, "pph_quantifier_for_operator", "PPH-QUANTIFIER-FOR-OPERATOR", 1, 0, false);
        declareFunction(me, "pph_register_scoped_vars", "PPH-REGISTER-SCOPED-VARS", 1, 0, false);
        declareMacro(me, "with_pph_hypothesized_vars", "WITH-PPH-HYPOTHESIZED-VARS");
        declareFunction(me, "pph_register_query_vars", "PPH-REGISTER-QUERY-VARS", 1, 0, false);
        declareFunction(me, "pph_query_var_p", "PPH-QUERY-VAR-P", 1, 0, false);
        declareFunction(me, "pph_existential_var_p", "PPH-EXISTENTIAL-VAR-P", 1, 0, false);
        declareFunction(me, "pph_note_if_var_is_used_only_once_in_formula", "PPH-NOTE-IF-VAR-IS-USED-ONLY-ONCE-IN-FORMULA", 2, 0, false);
        declareFunction(me, "pph_register_var_as_used_only_once", "PPH-REGISTER-VAR-AS-USED-ONLY-ONCE", 1, 0, false);
        declareFunction(me, "pph_var_used_only_onceP", "PPH-VAR-USED-ONLY-ONCE?", 1, 0, false);
        declareMacro(me, "pph_do_var_entries", "PPH-DO-VAR-ENTRIES");
        declareFunction(me, "pph_var_quantifier", "PPH-VAR-QUANTIFIER", 1, 0, false);
        declareFunction(me, "pph_var_type", "PPH-VAR-TYPE", 1, 0, false);
        declareFunction(me, "pph_cycl_var_type", "PPH-CYCL-VAR-TYPE", 1, 0, false);
        declareFunction(me, "pph_type_arg_position_map", "PPH-TYPE-ARG-POSITION-MAP", 1, 0, false);
        declareFunction(me, "pph_unregistered_variableP", "PPH-UNREGISTERED-VARIABLE?", 1, 0, false);
        declareFunction(me, "pph_duplicate_var_typeP", "PPH-DUPLICATE-VAR-TYPE?", 1, 0, false);
        declareFunction(me, "pph_var_paraphrased_explicitlyP", "PPH-VAR-PARAPHRASED-EXPLICITLY?", 1, 0, false);
        declareFunction(me, "string_mentions_varP", "STRING-MENTIONS-VAR?", 2, 0, false);
        declareFunction(me, "pph_use_explicit_varP", "PPH-USE-EXPLICIT-VAR?", 1, 0, false);
        declareFunction(me, "pph_var_type_previously_explicit_if_mentionedP", "PPH-VAR-TYPE-PREVIOUSLY-EXPLICIT-IF-MENTIONED?", 1, 0, false);
        declareFunction(me, "pph_var_previously_explicitP", "PPH-VAR-PREVIOUSLY-EXPLICIT?", 1, 0, false);
        declareFunction(me, "pph_var_previously_lexifiedP", "PPH-VAR-PREVIOUSLY-LEXIFIED?", 1, 0, false);
        declareFunction(me, "pph_string_is_posP_internal", "PPH-STRING-IS-POS?-INTERNAL", 2, 2, false);
        declareFunction(me, "pph_string_is_posP", "PPH-STRING-IS-POS?", 2, 2, false);
        declareFunction(me, "pph_var_previously_pronounP", "PPH-VAR-PREVIOUSLY-PRONOUN?", 1, 0, false);
        declareFunction(me, "pph_register_vars_as_different", "PPH-REGISTER-VARS-AS-DIFFERENT", 2, 0, false);
        declareFunction(me, "pph_different_varsP", "PPH-DIFFERENT-VARS?", 2, 1, false);
        declareFunction(me, "pph_different_varsP_int", "PPH-DIFFERENT-VARS?-INT", 2, 0, false);
        declareFunction(me, "pph_note_var_type", "PPH-NOTE-VAR-TYPE", 2, 0, false);
        declareFunction(me, "pph_other_vars_with_var_type", "PPH-OTHER-VARS-WITH-VAR-TYPE", 1, 0, false);
        declareFunction(me, "pph_vars_with_type", "PPH-VARS-WITH-TYPE", 1, 0, false);
        declareFunction(me, "pph_var_previously_paraphrased_with_otherP", "PPH-VAR-PREVIOUSLY-PARAPHRASED-WITH-OTHER?", 1, 0, false);
        declareFunction(me, "pph_formula_free_variables_internal", "PPH-FORMULA-FREE-VARIABLES-INTERNAL", 1, 1, false);
        declareFunction(me, "pph_formula_free_variables", "PPH-FORMULA-FREE-VARIABLES", 1, 1, false);
        declareFunction(me, "pph_var_scoped_or_quotedP", "PPH-VAR-SCOPED-OR-QUOTED?", 2, 0, false);
        declareFunction(me, "pph_arg_scoped_or_quotedP", "PPH-ARG-SCOPED-OR-QUOTED?", 2, 0, false);
        declareFunction(me, "pph_quoted_collectionP", "PPH-QUOTED-COLLECTION?", 1, 0, false);
        declareFunction(me, "pph_arg_scopedP", "PPH-ARG-SCOPED?", 2, 0, false);
        declareFunction(me, "pph_operator_arg_scopedP_internal", "PPH-OPERATOR-ARG-SCOPED?-INTERNAL", 3, 0, false);
        declareFunction(me, "pph_operator_arg_scopedP", "PPH-OPERATOR-ARG-SCOPED?", 3, 0, false);
        declareFunction(me, "pph_operator_arg_quotedP_internal", "PPH-OPERATOR-ARG-QUOTED?-INTERNAL", 2, 0, false);
        declareFunction(me, "pph_operator_arg_quotedP", "PPH-OPERATOR-ARG-QUOTED?", 2, 0, false);
        declareFunction(me, "pph_variable_isa_constraints", "PPH-VARIABLE-ISA-CONSTRAINTS", 2, 4, false);
        declareFunction(me, "pph_replace_direct_var_types", "PPH-REPLACE-DIRECT-VAR-TYPES", 3, 0, false);
        declareFunction(me, "pph_clausal_form_internal", "PPH-CLAUSAL-FORM-INTERNAL", 3, 0, false);
        declareFunction(me, "pph_clausal_form", "PPH-CLAUSAL-FORM", 3, 0, false);
        declareFunction(me, "pph_variable_isa_constraints_in_lit_internal", "PPH-VARIABLE-ISA-CONSTRAINTS-IN-LIT-INTERNAL", 4, 2, false);
        declareFunction(me, "pph_variable_isa_constraints_in_lit", "PPH-VARIABLE-ISA-CONSTRAINTS-IN-LIT", 4, 2, false);
        declareFunction(me, "pph_genls", "PPH-GENLS", 1, 1, false);
        declareFunction(me, "pph_variable_isa_constraints_in_subexpressions", "PPH-VARIABLE-ISA-CONSTRAINTS-IN-SUBEXPRESSIONS", 5, 0, false);
        declareFunction(me, "pph_truth_preserving_operatorP_internal", "PPH-TRUTH-PRESERVING-OPERATOR?-INTERNAL", 1, 1, false);
        declareFunction(me, "pph_truth_preserving_operatorP", "PPH-TRUTH-PRESERVING-OPERATOR?", 1, 1, false);
        declareFunction(me, "pph_strip_existentials", "PPH-STRIP-EXISTENTIALS", 1, 1, false);
        declareFunction(me, "pph_delete_genls", "PPH-DELETE-GENLS", 1, 0, false);
        declareFunction(me, "pph_min_variable_isa_constraint_internal", "PPH-MIN-VARIABLE-ISA-CONSTRAINT-INTERNAL", 2, 4, false);
        declareFunction(me, "pph_min_variable_isa_constraint", "PPH-MIN-VARIABLE-ISA-CONSTRAINT", 2, 4, false);
        declareFunction(me, "pph_find_most_specific_internal", "PPH-FIND-MOST-SPECIFIC-INTERNAL", 1, 1, false);
        declareFunction(me, "pph_find_most_specific", "PPH-FIND-MOST-SPECIFIC", 1, 1, false);
        return NIL;
    }

    public static SubLObject init_pph_variable_handling_file() {
        defconstant("*DTP-PPH-VAR-ENTRY*", PPH_VAR_ENTRY);
        defconstant("*PPH-DEFAULT-VAR-TYPE*", $$Thing);
        defparameter("*PPH-HYPOTHESIZED-VARS*", NIL);
        defvar("*PPH-DIFFERENT-VARS*", NIL);
        return NIL;
    }

    public static SubLObject setup_pph_variable_handling_file() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_pph_var_entry$.getGlobalValue(), symbol_function(PPH_VAR_ENTRY_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list8);
        def_csetf(PPH_VAR_ENTRY_VAR, _CSETF_PPH_VAR_ENTRY_VAR);
        def_csetf(PPH_VAR_ENTRY_TYPE, _CSETF_PPH_VAR_ENTRY_TYPE);
        def_csetf(PPH_VAR_ENTRY_QUANTIFIER, _CSETF_PPH_VAR_ENTRY_QUANTIFIER);
        def_csetf($sym15$PPH_VAR_ENTRY_SINGLE_USE_, $sym16$_CSETF_PPH_VAR_ENTRY_SINGLE_USE_);
        def_csetf(PPH_VAR_ENTRY_ARG_POSITION, _CSETF_PPH_VAR_ENTRY_ARG_POSITION);
        identity(PPH_VAR_ENTRY);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_pph_var_entry$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_PPH_VAR_ENTRY_METHOD));
        memoization_state.note_memoized_function($sym58$PPH_STRING_IS_POS_);
        memoization_state.note_memoized_function(PPH_FORMULA_FREE_VARIABLES);
        memoization_state.note_memoized_function($sym75$PPH_OPERATOR_ARG_SCOPED_);
        memoization_state.note_memoized_function($sym77$PPH_OPERATOR_ARG_QUOTED_);
        memoization_state.note_memoized_function(PPH_CLAUSAL_FORM);
        memoization_state.note_memoized_function(PPH_VARIABLE_ISA_CONSTRAINTS_IN_LIT);
        memoization_state.note_memoized_function($sym97$PPH_TRUTH_PRESERVING_OPERATOR_);
        memoization_state.note_memoized_function(PPH_MIN_VARIABLE_ISA_CONSTRAINT);
        memoization_state.note_memoized_function(PPH_FIND_MOST_SPECIFIC);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_pph_variable_handling_file();
    }

    @Override
    public void initializeVariables() {
        init_pph_variable_handling_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_pph_variable_handling_file();
    }

    static {



















































































































    }

    public static final class $pph_var_entry_native extends SubLStructNative {
        public SubLObject $var;

        public SubLObject $type;

        public SubLObject $quantifier;

        public SubLObject $single_useP;

        public SubLObject $arg_position;

        private static final SubLStructDeclNative structDecl;

        public $pph_var_entry_native() {
            this.$var = Lisp.NIL;
            this.$type = Lisp.NIL;
            this.$quantifier = Lisp.NIL;
            this.$single_useP = Lisp.NIL;
            this.$arg_position = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$var;
        }

        @Override
        public SubLObject getField3() {
            return this.$type;
        }

        @Override
        public SubLObject getField4() {
            return this.$quantifier;
        }

        @Override
        public SubLObject getField5() {
            return this.$single_useP;
        }

        @Override
        public SubLObject getField6() {
            return this.$arg_position;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$var = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$type = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$quantifier = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$single_useP = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return this.$arg_position = value;
        }

        static {
            structDecl = makeStructDeclNative(pph_variable_handling.$pph_var_entry_native.class, PPH_VAR_ENTRY, PPH_VAR_ENTRY_P, $list2, $list3, new String[]{ "$var", "$type", "$quantifier", "$single_useP", "$arg_position" }, $list4, $list5, PPRINT_PPH_VAR_ENTRY);
        }
    }

    public static final class $pph_var_entry_p$UnaryFunction extends UnaryFunction {
        public $pph_var_entry_p$UnaryFunction() {
            super(extractFunctionNamed("PPH-VAR-ENTRY-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return pph_var_entry_p(arg1);
        }
    }
}

/**
 * Total time: 474 ms
 */
