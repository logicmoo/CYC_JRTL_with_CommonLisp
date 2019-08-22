package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.substitute;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.armedbear.lisp.Lisp;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
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
 public final class reformulator_module_subcollection_processor extends SubLTranslatedFile {
    public static final SubLFile me = new reformulator_module_subcollection_processor();

    public static final String myName = "com.cyc.cycjava.cycl.reformulator_module_subcollection_processor";

    public static final String myFingerPrint = "0430c72adea26f9f864433f3e29f5dcd3f5473325d86237a5a8e485032682f4c";

    // deflexical
    private static final SubLSymbol $scfn_microseconds$ = makeSymbol("*SCFN-MICROSECONDS*");

    // defconstant
    public static final SubLSymbol $dtp_rl_scfn_data$ = makeSymbol("*DTP-RL-SCFN-DATA*");

    // deflexical
    private static final SubLSymbol $subcollection_macros$ = makeSymbol("*SUBCOLLECTION-MACROS*");

    private static final SubLObject $$SubcollectionProcessorRLModule = reader_make_constant_shell(makeString("SubcollectionProcessorRLModule"));

    public static final SubLList $list1 = list(new SubLObject[]{ makeKeyword("REQUIRED"), makeSymbol("SCFN-EXPRESSION-REQUIRED"), makeKeyword("COST"), makeSymbol("SCFN-COST-ESTIMATE"), makeKeyword("REFORMULATE"), makeSymbol("SCFN-EXPRESSION-REFORMULATE"), makeKeyword("DOCUMENTATION"), makeString("Distributes info from a #$SubcollectionFunction NAUT into a conjunctive clause"), makeKeyword("EXAMPLE-SOURCE"), makeString("(#$isa ?VAR0 (#$SubcollectionOfWithRelationToFn #$Sheep #$hates #$Bertolo))"), makeKeyword("EXAMPLE-TARGET"), makeString("(#$and (#$isa ?VAR0 #$Sheep) (#$hates ?VAR0 #$Bertolo))") });

    private static final SubLInteger $int$2300 = makeInteger(2300);

    public static final SubLSymbol RL_SCFN_DATA = makeSymbol("RL-SCFN-DATA");

    public static final SubLSymbol RL_SCFN_DATA_P = makeSymbol("RL-SCFN-DATA-P");

    public static final SubLList $list5 = list(makeSymbol("HIERARCHY-PRED"), makeSymbol("VAR-NAME"), makeSymbol("NAUT"), makeSymbol("SUBCOLLECTION-FN"), makeSymbol("ARG-FROM"), makeSymbol("PRED"), makeSymbol("ARG-TO"));

    public static final SubLList $list6 = list(makeKeyword("HIERARCHY-PRED"), makeKeyword("VAR-NAME"), makeKeyword("NAUT"), makeKeyword("SUBCOLLECTION-FN"), makeKeyword("ARG-FROM"), makeKeyword("PRED"), makeKeyword("ARG-TO"));

    public static final SubLList $list7 = list(makeSymbol("RL-SCFN-DATA-HIERARCHY-PRED"), makeSymbol("RL-SCFN-DATA-VAR-NAME"), makeSymbol("RL-SCFN-DATA-NAUT"), makeSymbol("RL-SCFN-DATA-SUBCOLLECTION-FN"), makeSymbol("RL-SCFN-DATA-ARG-FROM"), makeSymbol("RL-SCFN-DATA-PRED"), makeSymbol("RL-SCFN-DATA-ARG-TO"));

    public static final SubLList $list8 = list(makeSymbol("_CSETF-RL-SCFN-DATA-HIERARCHY-PRED"), makeSymbol("_CSETF-RL-SCFN-DATA-VAR-NAME"), makeSymbol("_CSETF-RL-SCFN-DATA-NAUT"), makeSymbol("_CSETF-RL-SCFN-DATA-SUBCOLLECTION-FN"), makeSymbol("_CSETF-RL-SCFN-DATA-ARG-FROM"), makeSymbol("_CSETF-RL-SCFN-DATA-PRED"), makeSymbol("_CSETF-RL-SCFN-DATA-ARG-TO"));

    public static final SubLSymbol PRINT_RL_SCFN_DATA = makeSymbol("PRINT-RL-SCFN-DATA");

    public static final SubLSymbol RL_SCFN_DATA_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("RL-SCFN-DATA-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list11 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("RL-SCFN-DATA-P"));

    private static final SubLSymbol RL_SCFN_DATA_HIERARCHY_PRED = makeSymbol("RL-SCFN-DATA-HIERARCHY-PRED");

    private static final SubLSymbol _CSETF_RL_SCFN_DATA_HIERARCHY_PRED = makeSymbol("_CSETF-RL-SCFN-DATA-HIERARCHY-PRED");

    private static final SubLSymbol RL_SCFN_DATA_VAR_NAME = makeSymbol("RL-SCFN-DATA-VAR-NAME");

    private static final SubLSymbol _CSETF_RL_SCFN_DATA_VAR_NAME = makeSymbol("_CSETF-RL-SCFN-DATA-VAR-NAME");

    private static final SubLSymbol RL_SCFN_DATA_NAUT = makeSymbol("RL-SCFN-DATA-NAUT");

    private static final SubLSymbol _CSETF_RL_SCFN_DATA_NAUT = makeSymbol("_CSETF-RL-SCFN-DATA-NAUT");

    private static final SubLSymbol RL_SCFN_DATA_SUBCOLLECTION_FN = makeSymbol("RL-SCFN-DATA-SUBCOLLECTION-FN");

    private static final SubLSymbol _CSETF_RL_SCFN_DATA_SUBCOLLECTION_FN = makeSymbol("_CSETF-RL-SCFN-DATA-SUBCOLLECTION-FN");

    private static final SubLSymbol RL_SCFN_DATA_ARG_FROM = makeSymbol("RL-SCFN-DATA-ARG-FROM");

    private static final SubLSymbol _CSETF_RL_SCFN_DATA_ARG_FROM = makeSymbol("_CSETF-RL-SCFN-DATA-ARG-FROM");

    private static final SubLSymbol RL_SCFN_DATA_PRED = makeSymbol("RL-SCFN-DATA-PRED");

    private static final SubLSymbol _CSETF_RL_SCFN_DATA_PRED = makeSymbol("_CSETF-RL-SCFN-DATA-PRED");

    private static final SubLSymbol RL_SCFN_DATA_ARG_TO = makeSymbol("RL-SCFN-DATA-ARG-TO");

    private static final SubLSymbol _CSETF_RL_SCFN_DATA_ARG_TO = makeSymbol("_CSETF-RL-SCFN-DATA-ARG-TO");















    private static final SubLString $str33$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_RL_SCFN_DATA = makeSymbol("MAKE-RL-SCFN-DATA");





    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_RL_SCFN_DATA_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-RL-SCFN-DATA-METHOD");

    private static final SubLString $str39$__RL_Scfn_Data__H_Pred____S__ = makeString("#<RL-Scfn-Data: H-Pred:  ~S~%");

    private static final SubLString $str40$___________________Var____S__ = makeString("                   Var:  ~S~%");

    private static final SubLString $str41$__________________NAUT____S__ = makeString("                  NAUT:  ~S~%");

    private static final SubLString $str42$_______________SubC_fn____S__ = makeString("               SubC-fn:  ~S~%");

    private static final SubLString $str43$______________Arg_from____S__ = makeString("              Arg-from:  ~S~%");

    private static final SubLString $str44$__________________Pred____S__ = makeString("                  Pred:  ~S~%");

    private static final SubLString $str45$________________Arg_To____S___ = makeString("                Arg-To:  ~S>~%");

    public static final SubLList $list46 = list(reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("genls")));

    private static final SubLObject $$SubcollectionFunction = reader_make_constant_shell(makeString("SubcollectionFunction"));

    public static final SubLList $list48 = list(reader_make_constant_shell(makeString("SubcollectionPerformedByTypeFn")), reader_make_constant_shell(makeString("SubcollectionPerformedByFn")));

    public static final SubLList $list49 = list(makeSymbol("SCFN"), makeSymbol("ARG1"), makeSymbol("PRED"), makeSymbol("ARG2"));

    private static final SubLList $list50 = list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToFn")), reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")));

    private static final SubLList $list51 = list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationFromFn")), reader_make_constant_shell(makeString("SubcollectionOfWithRelationFromTypeFn")));

    private static final SubLList $list52 = list(list(reader_make_constant_shell(makeString("isa")), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToFn")), list(makeKeyword("PRED"), makeKeyword("TERM"), makeKeyword("ARG"))), list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationFromFn")), list(makeKeyword("PRED"), makeKeyword("ARG"), makeKeyword("TERM"))), list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), list(reader_make_constant_shell(makeString("relationInstanceExists")), makeKeyword("PRED"), makeKeyword("TERM"), makeKeyword("ARG"))), list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationFromTypeFn")), list(reader_make_constant_shell(makeString("relationExistsInstance")), makeKeyword("PRED"), makeKeyword("ARG"), makeKeyword("TERM"))))), list(reader_make_constant_shell(makeString("genls")), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToFn")), list(reader_make_constant_shell(makeString("relationAllInstance")), makeKeyword("PRED"), makeKeyword("TERM"), makeKeyword("ARG"))), list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationFromFn")), list(reader_make_constant_shell(makeString("relationInstanceAll")), makeKeyword("PRED"), makeKeyword("ARG"), makeKeyword("TERM"))), list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), list(reader_make_constant_shell(makeString("relationAllExists")), makeKeyword("PRED"), makeKeyword("TERM"), makeKeyword("ARG"))), list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationFromTypeFn")), list(reader_make_constant_shell(makeString("relationExistsAll")), makeKeyword("PRED"), makeKeyword("ARG"), makeKeyword("TERM"))))));

    private static final SubLList $list53 = list(makeKeyword("MODES"), list(reader_make_constant_shell(makeString("ReformulatorMode-Verbosify"))), makeKeyword("RECURSION-LIMIT"), ZERO_INTEGER);

    private static final SubLList $list54 = list(makeSymbol("SCFN"), makeSymbol("ARG-FROM"), makeSymbol("PRED"), makeSymbol("ARG-TO"));

    private static final SubLList $list55 = list(reader_make_constant_shell(makeString("CollectionIntersection2Fn")), reader_make_constant_shell(makeString("CollectionDifferenceFn")));

    private static final SubLObject $$CollectionIntersection2Fn = reader_make_constant_shell(makeString("CollectionIntersection2Fn"));

    private static final SubLObject $$CollectionDifferenceFn = reader_make_constant_shell(makeString("CollectionDifferenceFn"));

    private static final SubLObject $$isa = reader_make_constant_shell(makeString("isa"));

    private static final SubLObject $$genls = reader_make_constant_shell(makeString("genls"));

    private static final SubLObject $$disjointWith = reader_make_constant_shell(makeString("disjointWith"));

    private static final SubLObject $$ProspectiveCollectionFn = reader_make_constant_shell(makeString("ProspectiveCollectionFn"));

    private static final SubLObject $$prospectiveMembers = reader_make_constant_shell(makeString("prospectiveMembers"));

    private static final SubLObject $$relationAllInstance = reader_make_constant_shell(makeString("relationAllInstance"));









    private static final SubLString $str68$Reformulator_Subcollection_Proces = makeString("Reformulator Subcollection Processing");

    private static final SubLString $str69$subcoll_proc_test_suite = makeString("subcoll-proc-test-suite");

    public static SubLObject scfn_cost_estimate(final SubLObject expression, final SubLObject mt, final SubLObject settings) {
        return $scfn_microseconds$.getGlobalValue();
    }

    public static SubLObject rl_scfn_data_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_rl_scfn_data(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject rl_scfn_data_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$rl_scfn_data_native.class ? T : NIL;
    }

    public static SubLObject rl_scfn_data_hierarchy_pred(final SubLObject v_object) {
        assert NIL != rl_scfn_data_p(v_object) : "reformulator_module_subcollection_processor.rl_scfn_data_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject rl_scfn_data_var_name(final SubLObject v_object) {
        assert NIL != rl_scfn_data_p(v_object) : "reformulator_module_subcollection_processor.rl_scfn_data_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject rl_scfn_data_naut(final SubLObject v_object) {
        assert NIL != rl_scfn_data_p(v_object) : "reformulator_module_subcollection_processor.rl_scfn_data_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject rl_scfn_data_subcollection_fn(final SubLObject v_object) {
        assert NIL != rl_scfn_data_p(v_object) : "reformulator_module_subcollection_processor.rl_scfn_data_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject rl_scfn_data_arg_from(final SubLObject v_object) {
        assert NIL != rl_scfn_data_p(v_object) : "reformulator_module_subcollection_processor.rl_scfn_data_p error :" + v_object;
        return v_object.getField6();
    }

    public static SubLObject rl_scfn_data_pred(final SubLObject v_object) {
        assert NIL != rl_scfn_data_p(v_object) : "reformulator_module_subcollection_processor.rl_scfn_data_p error :" + v_object;
        return v_object.getField7();
    }

    public static SubLObject rl_scfn_data_arg_to(final SubLObject v_object) {
        assert NIL != rl_scfn_data_p(v_object) : "reformulator_module_subcollection_processor.rl_scfn_data_p error :" + v_object;
        return v_object.getField8();
    }

    public static SubLObject _csetf_rl_scfn_data_hierarchy_pred(final SubLObject v_object, final SubLObject value) {
        assert NIL != rl_scfn_data_p(v_object) : "reformulator_module_subcollection_processor.rl_scfn_data_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_rl_scfn_data_var_name(final SubLObject v_object, final SubLObject value) {
        assert NIL != rl_scfn_data_p(v_object) : "reformulator_module_subcollection_processor.rl_scfn_data_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_rl_scfn_data_naut(final SubLObject v_object, final SubLObject value) {
        assert NIL != rl_scfn_data_p(v_object) : "reformulator_module_subcollection_processor.rl_scfn_data_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_rl_scfn_data_subcollection_fn(final SubLObject v_object, final SubLObject value) {
        assert NIL != rl_scfn_data_p(v_object) : "reformulator_module_subcollection_processor.rl_scfn_data_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_rl_scfn_data_arg_from(final SubLObject v_object, final SubLObject value) {
        assert NIL != rl_scfn_data_p(v_object) : "reformulator_module_subcollection_processor.rl_scfn_data_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_rl_scfn_data_pred(final SubLObject v_object, final SubLObject value) {
        assert NIL != rl_scfn_data_p(v_object) : "reformulator_module_subcollection_processor.rl_scfn_data_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_rl_scfn_data_arg_to(final SubLObject v_object, final SubLObject value) {
        assert NIL != rl_scfn_data_p(v_object) : "reformulator_module_subcollection_processor.rl_scfn_data_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static SubLObject make_rl_scfn_data(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $rl_scfn_data_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($HIERARCHY_PRED)) {
                _csetf_rl_scfn_data_hierarchy_pred(v_new, current_value);
            } else
                if (pcase_var.eql($VAR_NAME)) {
                    _csetf_rl_scfn_data_var_name(v_new, current_value);
                } else
                    if (pcase_var.eql($NAUT)) {
                        _csetf_rl_scfn_data_naut(v_new, current_value);
                    } else
                        if (pcase_var.eql($SUBCOLLECTION_FN)) {
                            _csetf_rl_scfn_data_subcollection_fn(v_new, current_value);
                        } else
                            if (pcase_var.eql($ARG_FROM)) {
                                _csetf_rl_scfn_data_arg_from(v_new, current_value);
                            } else
                                if (pcase_var.eql($PRED)) {
                                    _csetf_rl_scfn_data_pred(v_new, current_value);
                                } else
                                    if (pcase_var.eql($ARG_TO)) {
                                        _csetf_rl_scfn_data_arg_to(v_new, current_value);
                                    } else {
                                        Errors.error($str33$Invalid_slot__S_for_construction_, current_arg);
                                    }






        }
        return v_new;
    }

    public static SubLObject visit_defstruct_rl_scfn_data(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_RL_SCFN_DATA, SEVEN_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $HIERARCHY_PRED, rl_scfn_data_hierarchy_pred(obj));
        funcall(visitor_fn, obj, $SLOT, $VAR_NAME, rl_scfn_data_var_name(obj));
        funcall(visitor_fn, obj, $SLOT, $NAUT, rl_scfn_data_naut(obj));
        funcall(visitor_fn, obj, $SLOT, $SUBCOLLECTION_FN, rl_scfn_data_subcollection_fn(obj));
        funcall(visitor_fn, obj, $SLOT, $ARG_FROM, rl_scfn_data_arg_from(obj));
        funcall(visitor_fn, obj, $SLOT, $PRED, rl_scfn_data_pred(obj));
        funcall(visitor_fn, obj, $SLOT, $ARG_TO, rl_scfn_data_arg_to(obj));
        funcall(visitor_fn, obj, $END, MAKE_RL_SCFN_DATA, SEVEN_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_rl_scfn_data_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_rl_scfn_data(obj, visitor_fn);
    }

    public static SubLObject print_rl_scfn_data(final SubLObject rl_scfn_data, final SubLObject stream, final SubLObject depth) {
        format(stream, $str39$__RL_Scfn_Data__H_Pred____S__, rl_scfn_data_hierarchy_pred(rl_scfn_data));
        format(stream, $str40$___________________Var____S__, rl_scfn_data_var_name(rl_scfn_data));
        format(stream, $str41$__________________NAUT____S__, rl_scfn_data_naut(rl_scfn_data));
        format(stream, $str42$_______________SubC_fn____S__, rl_scfn_data_subcollection_fn(rl_scfn_data));
        format(stream, $str43$______________Arg_from____S__, rl_scfn_data_arg_from(rl_scfn_data));
        format(stream, $str44$__________________Pred____S__, rl_scfn_data_pred(rl_scfn_data));
        format(stream, $str45$________________Arg_To____S___, rl_scfn_data_arg_to(rl_scfn_data));
        return rl_scfn_data;
    }

    public static SubLObject new_rl_scfn_data(final SubLObject hier, final SubLObject var, final SubLObject naut, final SubLObject scfn, final SubLObject arg_from, final SubLObject pred, final SubLObject arg_to) {
        final SubLObject rl_scfn_data = make_rl_scfn_data(UNPROVIDED);
        _csetf_rl_scfn_data_hierarchy_pred(rl_scfn_data, hier);
        _csetf_rl_scfn_data_var_name(rl_scfn_data, var);
        _csetf_rl_scfn_data_naut(rl_scfn_data, naut);
        _csetf_rl_scfn_data_subcollection_fn(rl_scfn_data, scfn);
        _csetf_rl_scfn_data_arg_from(rl_scfn_data, arg_from);
        _csetf_rl_scfn_data_pred(rl_scfn_data, pred);
        _csetf_rl_scfn_data_arg_to(rl_scfn_data, arg_to);
        return rl_scfn_data;
    }

    public static SubLObject scfn_expression_required(final SubLObject expression, final SubLObject mt, final SubLObject settings) {
        if (((NIL != clauses.clauses_p(expression)) && (NIL != list_utilities.singletonP(expression))) && (NIL != clause_utilities.pos_atomic_cnf_p(expression.first()))) {
            final SubLObject sentence = clause_utilities.gaf_cnf_literal(expression.first());
            return makeBoolean((((NIL != possibly_atomic_sentence_p(sentence)) && (NIL != formula_arityE(sentence, TWO_INTEGER, UNPROVIDED))) && (NIL != member(cycl_utilities.atomic_sentence_predicate(sentence), $list46, UNPROVIDED, UNPROVIDED))) && ((NIL != nart_handles.nart_p(cycl_utilities.sentence_arg2(sentence, UNPROVIDED))) || (NIL != possibly_naut_p(cycl_utilities.sentence_arg2(sentence, UNPROVIDED)))));
        }
        return NIL;
    }

    public static SubLObject deconstruct_rl_scfn_expression(final SubLObject expression, final SubLObject mt) {
        final SubLObject sentence = clause_utilities.gaf_cnf_literal(expression.first());
        final SubLObject hier_pred = cycl_utilities.formula_arg0(sentence);
        final SubLObject var = cycl_utilities.formula_arg1(sentence, UNPROVIDED);
        final SubLObject nat = cycl_utilities.formula_arg2(sentence, UNPROVIDED);
        final SubLObject naut_candidate = function_terms.nart_to_naut(nat);
        final SubLObject naut_fn = cycl_utilities.nat_functor(naut_candidate);
        if ((NIL == isa.isaP(naut_fn, $$SubcollectionFunction, mt, UNPROVIDED)) && (NIL == member(naut_fn, $list48, UNPROVIDED, UNPROVIDED))) {
            return NIL;
        }
        if (NIL == formula_arityE(naut_candidate, THREE_INTEGER, UNPROVIDED)) {
            final SubLObject rl_scfn_data = make_rl_scfn_data(UNPROVIDED);
            _csetf_rl_scfn_data_hierarchy_pred(rl_scfn_data, hier_pred);
            _csetf_rl_scfn_data_var_name(rl_scfn_data, var);
            _csetf_rl_scfn_data_naut(rl_scfn_data, naut_candidate);
            _csetf_rl_scfn_data_subcollection_fn(rl_scfn_data, cycl_utilities.nat_functor(naut_candidate));
            return rl_scfn_data;
        }
        SubLObject current;
        final SubLObject datum = current = naut_candidate;
        SubLObject scfn = NIL;
        SubLObject arg1 = NIL;
        SubLObject pred = NIL;
        SubLObject arg2 = NIL;
        destructuring_bind_must_consp(current, datum, $list49);
        scfn = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list49);
        arg1 = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list49);
        pred = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list49);
        arg2 = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject arg_from = NIL;
            SubLObject arg_to = NIL;
            if (NIL != member(scfn, $list50, UNPROVIDED, UNPROVIDED)) {
                arg_from = arg1;
                arg_to = arg2;
            } else
                if (NIL != member(scfn, $list51, UNPROVIDED, UNPROVIDED)) {
                    arg_from = arg2;
                    arg_to = arg1;
                }

            return new_rl_scfn_data(hier_pred, var, naut_candidate, scfn, arg_from, pred, arg_to);
        }
        cdestructuring_bind_error(datum, $list49);
        return NIL;
    }

    public static SubLObject scfn_expression_reformulate(final SubLObject expression, final SubLObject original_clause, final SubLObject mt, final SubLObject settings) {
        final SubLObject thesentence = clause_utilities.gaf_cnf_literal(expression.first());
        final SubLObject rl_scfn_data = deconstruct_rl_scfn_expression(expression, mt);
        if (NIL != rl_scfn_data) {
            final SubLObject result = reconstruct_rl_scfn_expression(rl_scfn_data);
            if (NIL != result) {
                final SubLObject modifiedP = makeBoolean(!expression.equal(result));
                if (!thesentence.equal(cycl_utilities.formula_arg1(result, UNPROVIDED))) {
                    return values(result, modifiedP);
                }
            }
        }
        return values(expression, NIL);
    }

    public static SubLObject reformulate_rl_scfn_data(final SubLObject rl_scfn_data) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject naut = rl_scfn_data_naut(rl_scfn_data);
        final SubLObject new_naut = reformulator_hub.reformulate_cycl(naut, mt_relevance_macros.$mt$.getDynamicValue(thread), $list53);
        if ((NIL != possibly_naut_p(new_naut)) && (NIL != formula_arityE(new_naut, THREE_INTEGER, UNPROVIDED))) {
            SubLObject current;
            final SubLObject datum = current = new_naut;
            SubLObject scfn = NIL;
            SubLObject arg_from = NIL;
            SubLObject pred = NIL;
            SubLObject arg_to = NIL;
            destructuring_bind_must_consp(current, datum, $list54);
            scfn = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list54);
            arg_from = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list54);
            pred = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list54);
            arg_to = current.first();
            current = current.rest();
            if (NIL == current) {
                _csetf_rl_scfn_data_naut(rl_scfn_data, new_naut);
                _csetf_rl_scfn_data_subcollection_fn(rl_scfn_data, scfn);
                _csetf_rl_scfn_data_arg_from(rl_scfn_data, arg_from);
                _csetf_rl_scfn_data_pred(rl_scfn_data, pred);
                _csetf_rl_scfn_data_arg_to(rl_scfn_data, arg_to);
            } else {
                cdestructuring_bind_error(datum, $list54);
            }
            return rl_scfn_data;
        }
        return NIL;
    }

    public static SubLObject reconstruct_rl_scfn_expression(final SubLObject rl_scfn_data) {
        if (NIL != set_operation_scfn(rl_scfn_data)) {
            return set_reconstruct(rl_scfn_data);
        }
        if (NIL != prospective_collection_scfn(rl_scfn_data)) {
            return prospective_collection_reconstruct(rl_scfn_data);
        }
        if (NIL != rl_scfn_data_pred(rl_scfn_data)) {
            return reconstruct_rl_scfn_expression_int(rl_scfn_data);
        }
        final SubLObject new_data = reformulate_rl_scfn_data(rl_scfn_data);
        if (NIL != new_data) {
            return reconstruct_rl_scfn_expression_int(rl_scfn_data);
        }
        return NIL;
    }

    public static SubLObject reconstruct_rl_scfn_expression_int(final SubLObject rl_scfn_data) {
        final SubLObject scfn = rl_scfn_data_subcollection_fn(rl_scfn_data);
        final SubLObject var_coll = find_var_coll_from_scfn(scfn, rl_scfn_data);
        final SubLObject other_coll = find_other_coll_from_scfn(scfn, rl_scfn_data);
        final SubLObject pred = rl_scfn_data_pred(rl_scfn_data);
        final SubLObject hier_pred = rl_scfn_data_hierarchy_pred(rl_scfn_data);
        final SubLObject var = rl_scfn_data_var_name(rl_scfn_data);
        final SubLObject macro = find_macro_pred_from_scfn(scfn, hier_pred);
        final SubLObject sentence1 = make_binary_formula(hier_pred, var, var_coll);
        final SubLObject sentence2 = replace_into_scfn_macro(macro, pred, var, other_coll);
        return make_conjunction(list(sentence1, sentence2));
    }

    public static SubLObject set_operation_scfn(final SubLObject rl_scfn_data) {
        return member(rl_scfn_data_subcollection_fn(rl_scfn_data), $list55, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject set_reconstruct(final SubLObject rl_scfn_data) {
        final SubLObject naut = rl_scfn_data_naut(rl_scfn_data);
        final SubLObject scfn = rl_scfn_data_subcollection_fn(rl_scfn_data);
        final SubLObject var = rl_scfn_data_var_name(rl_scfn_data);
        final SubLObject col1 = cycl_utilities.formula_arg1(naut, UNPROVIDED);
        final SubLObject col2 = cycl_utilities.formula_arg2(naut, UNPROVIDED);
        final SubLObject hier_pred = rl_scfn_data_hierarchy_pred(rl_scfn_data);
        final SubLObject literal1 = make_binary_formula(hier_pred, var, col1);
        SubLObject literal2 = NIL;
        final SubLObject pcase_var = scfn;
        if (pcase_var.eql($$CollectionIntersection2Fn)) {
            literal2 = make_binary_formula(hier_pred, var, col2);
        } else
            if (pcase_var.eql($$CollectionDifferenceFn)) {
                final SubLObject pcase_var_$1 = hier_pred;
                if (pcase_var_$1.eql($$isa)) {
                    literal2 = make_negation(make_binary_formula($$isa, var, col2));
                } else
                    if (pcase_var_$1.eql($$genls)) {
                        literal2 = make_binary_formula($$disjointWith, var, col2);
                    }

            }

        return make_conjunction(list(literal1, literal2));
    }

    public static SubLObject prospective_collection_scfn(final SubLObject rl_scfn_data) {
        return eql(rl_scfn_data_subcollection_fn(rl_scfn_data), $$ProspectiveCollectionFn);
    }

    public static SubLObject prospective_collection_reconstruct(final SubLObject rl_scfn_data) {
        final SubLObject naut = rl_scfn_data_naut(rl_scfn_data);
        final SubLObject var = rl_scfn_data_var_name(rl_scfn_data);
        final SubLObject col1 = cycl_utilities.formula_arg1(naut, UNPROVIDED);
        final SubLObject col2 = cycl_utilities.formula_arg2(naut, UNPROVIDED);
        final SubLObject hier_pred = rl_scfn_data_hierarchy_pred(rl_scfn_data);
        final SubLObject literal1 = make_binary_formula(hier_pred, var, col1);
        SubLObject literal2 = NIL;
        final SubLObject pcase_var = hier_pred;
        if (pcase_var.eql($$isa)) {
            literal2 = make_binary_formula($$prospectiveMembers, var, col2);
        } else
            if (pcase_var.eql($$genls)) {
                literal2 = make_ternary_formula($$relationAllInstance, $$prospectiveMembers, var, col2);
            }

        return make_conjunction(list(literal1, literal2));
    }

    public static SubLObject find_var_coll_from_scfn(final SubLObject scfn, final SubLObject rl_scfn_data) {
        final SubLObject direction = (NIL != member(scfn, $list50, UNPROVIDED, UNPROVIDED)) ? $TO : $FROM;
        if (direction.eql($TO)) {
            return rl_scfn_data_arg_from(rl_scfn_data);
        }
        return rl_scfn_data_arg_to(rl_scfn_data);
    }

    public static SubLObject find_other_coll_from_scfn(final SubLObject scfn, final SubLObject rl_scfn_data) {
        final SubLObject direction = (NIL != member(scfn, $list50, UNPROVIDED, UNPROVIDED)) ? $TO : $FROM;
        if (direction.eql($TO)) {
            return rl_scfn_data_arg_to(rl_scfn_data);
        }
        return rl_scfn_data_arg_from(rl_scfn_data);
    }

    public static SubLObject find_macro_pred_from_scfn(final SubLObject scfn, final SubLObject hier_pred) {
        return second(assoc(scfn, second(assoc(hier_pred, $subcollection_macros$.getGlobalValue(), UNPROVIDED, UNPROVIDED)), UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject replace_into_scfn_macro(final SubLObject macro, final SubLObject pred, final SubLObject v_term, final SubLObject coll) {
        return substitute(pred, $PRED, substitute(v_term, $TERM, substitute(coll, $ARG, macro, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject declare_reformulator_module_subcollection_processor_file() {
        declareFunction(me, "scfn_cost_estimate", "SCFN-COST-ESTIMATE", 3, 0, false);
        declareFunction(me, "rl_scfn_data_print_function_trampoline", "RL-SCFN-DATA-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "rl_scfn_data_p", "RL-SCFN-DATA-P", 1, 0, false);
        new reformulator_module_subcollection_processor.$rl_scfn_data_p$UnaryFunction();
        declareFunction(me, "rl_scfn_data_hierarchy_pred", "RL-SCFN-DATA-HIERARCHY-PRED", 1, 0, false);
        declareFunction(me, "rl_scfn_data_var_name", "RL-SCFN-DATA-VAR-NAME", 1, 0, false);
        declareFunction(me, "rl_scfn_data_naut", "RL-SCFN-DATA-NAUT", 1, 0, false);
        declareFunction(me, "rl_scfn_data_subcollection_fn", "RL-SCFN-DATA-SUBCOLLECTION-FN", 1, 0, false);
        declareFunction(me, "rl_scfn_data_arg_from", "RL-SCFN-DATA-ARG-FROM", 1, 0, false);
        declareFunction(me, "rl_scfn_data_pred", "RL-SCFN-DATA-PRED", 1, 0, false);
        declareFunction(me, "rl_scfn_data_arg_to", "RL-SCFN-DATA-ARG-TO", 1, 0, false);
        declareFunction(me, "_csetf_rl_scfn_data_hierarchy_pred", "_CSETF-RL-SCFN-DATA-HIERARCHY-PRED", 2, 0, false);
        declareFunction(me, "_csetf_rl_scfn_data_var_name", "_CSETF-RL-SCFN-DATA-VAR-NAME", 2, 0, false);
        declareFunction(me, "_csetf_rl_scfn_data_naut", "_CSETF-RL-SCFN-DATA-NAUT", 2, 0, false);
        declareFunction(me, "_csetf_rl_scfn_data_subcollection_fn", "_CSETF-RL-SCFN-DATA-SUBCOLLECTION-FN", 2, 0, false);
        declareFunction(me, "_csetf_rl_scfn_data_arg_from", "_CSETF-RL-SCFN-DATA-ARG-FROM", 2, 0, false);
        declareFunction(me, "_csetf_rl_scfn_data_pred", "_CSETF-RL-SCFN-DATA-PRED", 2, 0, false);
        declareFunction(me, "_csetf_rl_scfn_data_arg_to", "_CSETF-RL-SCFN-DATA-ARG-TO", 2, 0, false);
        declareFunction(me, "make_rl_scfn_data", "MAKE-RL-SCFN-DATA", 0, 1, false);
        declareFunction(me, "visit_defstruct_rl_scfn_data", "VISIT-DEFSTRUCT-RL-SCFN-DATA", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_rl_scfn_data_method", "VISIT-DEFSTRUCT-OBJECT-RL-SCFN-DATA-METHOD", 2, 0, false);
        declareFunction(me, "print_rl_scfn_data", "PRINT-RL-SCFN-DATA", 3, 0, false);
        declareFunction(me, "new_rl_scfn_data", "NEW-RL-SCFN-DATA", 7, 0, false);
        declareFunction(me, "scfn_expression_required", "SCFN-EXPRESSION-REQUIRED", 3, 0, false);
        declareFunction(me, "deconstruct_rl_scfn_expression", "DECONSTRUCT-RL-SCFN-EXPRESSION", 2, 0, false);
        declareFunction(me, "scfn_expression_reformulate", "SCFN-EXPRESSION-REFORMULATE", 4, 0, false);
        declareFunction(me, "reformulate_rl_scfn_data", "REFORMULATE-RL-SCFN-DATA", 1, 0, false);
        declareFunction(me, "reconstruct_rl_scfn_expression", "RECONSTRUCT-RL-SCFN-EXPRESSION", 1, 0, false);
        declareFunction(me, "reconstruct_rl_scfn_expression_int", "RECONSTRUCT-RL-SCFN-EXPRESSION-INT", 1, 0, false);
        declareFunction(me, "set_operation_scfn", "SET-OPERATION-SCFN", 1, 0, false);
        declareFunction(me, "set_reconstruct", "SET-RECONSTRUCT", 1, 0, false);
        declareFunction(me, "prospective_collection_scfn", "PROSPECTIVE-COLLECTION-SCFN", 1, 0, false);
        declareFunction(me, "prospective_collection_reconstruct", "PROSPECTIVE-COLLECTION-RECONSTRUCT", 1, 0, false);
        declareFunction(me, "find_var_coll_from_scfn", "FIND-VAR-COLL-FROM-SCFN", 2, 0, false);
        declareFunction(me, "find_other_coll_from_scfn", "FIND-OTHER-COLL-FROM-SCFN", 2, 0, false);
        declareFunction(me, "find_macro_pred_from_scfn", "FIND-MACRO-PRED-FROM-SCFN", 2, 0, false);
        declareFunction(me, "replace_into_scfn_macro", "REPLACE-INTO-SCFN-MACRO", 4, 0, false);
        return NIL;
    }

    public static SubLObject init_reformulator_module_subcollection_processor_file() {
        deflexical("*SCFN-MICROSECONDS*", $int$2300);
        defconstant("*DTP-RL-SCFN-DATA*", RL_SCFN_DATA);
        deflexical("*SUBCOLLECTION-MACROS*", $list52);
        return NIL;
    }

    public static SubLObject setup_reformulator_module_subcollection_processor_file() {
        reformulator_module_harness.declare_rl_module($$SubcollectionProcessorRLModule, $list1);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_rl_scfn_data$.getGlobalValue(), symbol_function(RL_SCFN_DATA_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list11);
        def_csetf(RL_SCFN_DATA_HIERARCHY_PRED, _CSETF_RL_SCFN_DATA_HIERARCHY_PRED);
        def_csetf(RL_SCFN_DATA_VAR_NAME, _CSETF_RL_SCFN_DATA_VAR_NAME);
        def_csetf(RL_SCFN_DATA_NAUT, _CSETF_RL_SCFN_DATA_NAUT);
        def_csetf(RL_SCFN_DATA_SUBCOLLECTION_FN, _CSETF_RL_SCFN_DATA_SUBCOLLECTION_FN);
        def_csetf(RL_SCFN_DATA_ARG_FROM, _CSETF_RL_SCFN_DATA_ARG_FROM);
        def_csetf(RL_SCFN_DATA_PRED, _CSETF_RL_SCFN_DATA_PRED);
        def_csetf(RL_SCFN_DATA_ARG_TO, _CSETF_RL_SCFN_DATA_ARG_TO);
        identity(RL_SCFN_DATA);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_rl_scfn_data$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_RL_SCFN_DATA_METHOD));
        sunit_external.define_test_category($str68$Reformulator_Subcollection_Proces, UNPROVIDED);
        sunit_external.define_test_suite($str69$subcoll_proc_test_suite, list($str68$Reformulator_Subcollection_Proces), UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_reformulator_module_subcollection_processor_file();
    }

    @Override
    public void initializeVariables() {
        init_reformulator_module_subcollection_processor_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_reformulator_module_subcollection_processor_file();
    }

    

    public static final class $rl_scfn_data_native extends SubLStructNative {
        public SubLObject $hierarchy_pred;

        public SubLObject $var_name;

        public SubLObject $naut;

        public SubLObject $subcollection_fn;

        public SubLObject $arg_from;

        public SubLObject $pred;

        public SubLObject $arg_to;

        private static final SubLStructDeclNative structDecl;

        private $rl_scfn_data_native() {
            this.$hierarchy_pred = Lisp.NIL;
            this.$var_name = Lisp.NIL;
            this.$naut = Lisp.NIL;
            this.$subcollection_fn = Lisp.NIL;
            this.$arg_from = Lisp.NIL;
            this.$pred = Lisp.NIL;
            this.$arg_to = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$hierarchy_pred;
        }

        @Override
        public SubLObject getField3() {
            return this.$var_name;
        }

        @Override
        public SubLObject getField4() {
            return this.$naut;
        }

        @Override
        public SubLObject getField5() {
            return this.$subcollection_fn;
        }

        @Override
        public SubLObject getField6() {
            return this.$arg_from;
        }

        @Override
        public SubLObject getField7() {
            return this.$pred;
        }

        @Override
        public SubLObject getField8() {
            return this.$arg_to;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$hierarchy_pred = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$var_name = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$naut = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$subcollection_fn = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return this.$arg_from = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return this.$pred = value;
        }

        @Override
        public SubLObject setField8(final SubLObject value) {
            return this.$arg_to = value;
        }

        static {
            structDecl = makeStructDeclNative($rl_scfn_data_native.class, RL_SCFN_DATA, RL_SCFN_DATA_P, $list5, $list6, new String[]{ "$hierarchy_pred", "$var_name", "$naut", "$subcollection_fn", "$arg_from", "$pred", "$arg_to" }, $list7, $list8, PRINT_RL_SCFN_DATA);
        }
    }

    public static final class $rl_scfn_data_p$UnaryFunction extends UnaryFunction {
        public $rl_scfn_data_p$UnaryFunction() {
            super(extractFunctionNamed("RL-SCFN-DATA-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return rl_scfn_data_p(arg1);
        }
    }
}

/**
 * Total time: 135 ms
 */
