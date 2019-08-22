package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.sublisp_throw;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.assoc;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_tree;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.fourth;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.subst;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class drt_rm extends SubLTranslatedFile {
    public static final SubLFile me = new drt_rm();

    public static final String myName = "com.cyc.cycjava.cycl.drt_rm";

    public static final String myFingerPrint = "fd59d1f917864a6320cc402a2bd9e104682bbdf9b5330ec656028a358ee371cd";

    // defparameter
    // The list of the valid arg0's of an initial RM formula.
    private static final SubLSymbol $drt_rm_wrapper_fns$ = makeSymbol("*DRT-RM-WRAPPER-FNS*");

    // defparameter
    /**
     * The mapping between NL implementation constants and internally used keywords.
     *
     * @unknown put this info in KB.
     */
    private static final SubLSymbol $drt_rm_wrapper_fns_to_keywords$ = makeSymbol("*DRT-RM-WRAPPER-FNS-TO-KEYWORDS*");



    public static final SubLString $str1$_______________________RM_MAPPING = makeString("~%******************** RM MAPPING ********************~%");

    public static final SubLString $str2$_A_has_been_mapped_to__A__ = makeString("~A has been mapped to ~A~%");

    public static final SubLString $str3$map_rm___A_was_mapped_to__A__now_ = makeString("map-rm: ~A was mapped to ~A, now to ~A~%");





    public static final SubLList $list6 = list(new SubLObject[]{ list(makeSymbol("FORMULA"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("MAPPED-FORMULA"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("ROOT-TERM"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("SUPER-RM"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("SUB-RMS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("TYPE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("TARGET-VAR"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("TARGET-TERM"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("SCOPE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("CONDITIONS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEFINITENESS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("QUANT"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("GENDER"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("NUMBER"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("SYNTACTIC-ROLE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-PROPERTY"), list(makeSymbol("PROPERTY-KEYWORD"), makeSymbol("NEW-PROPERTY-VALUE")), makeKeyword("NO-MEMBER-VARIABLES")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("COREFERENCE-PROBABILITY"), list(makeSymbol("TARGET-RM"))), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CONSTRUCT-CYCL"), NIL) });

    public static final SubLSymbol SYNTACTIC_ROLE = makeSymbol("SYNTACTIC-ROLE");







    public static final SubLSymbol DEFINITENESS = makeSymbol("DEFINITENESS");









    public static final SubLSymbol SUB_RMS = makeSymbol("SUB-RMS");

    public static final SubLSymbol SUPER_RM = makeSymbol("SUPER-RM");



    public static final SubLSymbol MAPPED_FORMULA = makeSymbol("MAPPED-FORMULA");





    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_RM_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-RM-CLASS");





    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_RM_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-RM-INSTANCE");

    public static final SubLSymbol SET_PROPERTY = makeSymbol("SET-PROPERTY");

    public static final SubLList $list27 = list(makeSymbol("PROPERTY-KEYWORD"), makeSymbol("NEW-PROPERTY-VALUE"));

    public static final SubLList $list28 = list(makeString("Sets the property of this RM indicated by PROPERTY-KEYWORD to NEW-PROPERTY-VALUE."), list(new SubLObject[]{ makeSymbol("PCASE"), makeSymbol("PROPERTY-KEYWORD"), list(makeKeyword("TYPE"), list(makeSymbol("CSETQ"), makeSymbol("TYPE"), makeSymbol("NEW-PROPERTY-VALUE"))), list(makeKeyword("DEFINITENESS"), list(makeSymbol("CSETQ"), makeSymbol("DEFINITENESS"), makeSymbol("NEW-PROPERTY-VALUE")), list(makeSymbol("PWHEN"), list(EQ, makeSymbol("NEW-PROPERTY-VALUE"), reader_make_constant_shell(makeString("Definite-NLAttr"))), list(makeSymbol("CSETQ"), makeSymbol("TYPE"), makeKeyword("DEFINITE")))), list(makeKeyword("QUANT"), list(makeSymbol("CSETQ"), makeSymbol("QUANT"), makeSymbol("NEW-PROPERTY-VALUE")), list(makeSymbol("PWHEN"), list(EQ, makeSymbol("NEW-PROPERTY-VALUE"), reader_make_constant_shell(makeString("ProperName-NLAttr"))), list(makeSymbol("CSETQ"), makeSymbol("TARGET-TERM"), makeSymbol("ROOT-TERM")))), list(makeKeyword("GENDER"), list(makeSymbol("CSETQ"), makeSymbol("GENDER"), makeSymbol("NEW-PROPERTY-VALUE"))), list(makeKeyword("NUMBER"), list(makeSymbol("CSETQ"), makeSymbol("NUMBER"), makeSymbol("NEW-PROPERTY-VALUE"))), list(makeKeyword("SYNTACTIC-ROLE"), list(makeSymbol("CSETQ"), makeSymbol("SYNTACTIC-ROLE"), makeSymbol("NEW-PROPERTY-VALUE"))), list(makeSymbol("OTHERWISE"), list(makeSymbol("DRT-WARN"), makeString("~%(rm-set-property-method ~A) property keyword/value ~A/~A invalid"), makeSymbol("SELF"), makeSymbol("PROPERTY-KEYWORD"), makeSymbol("NEW-PROPERTY-VALUE"))) }), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol $sym29$OUTER_CATCH_FOR_RM_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-RM-METHOD");





    private static final SubLObject $$Definite_NLAttr = reader_make_constant_shell(makeString("Definite-NLAttr"));





    private static final SubLObject $$ProperName_NLAttr = reader_make_constant_shell(makeString("ProperName-NLAttr"));







    public static final SubLString $str39$___rm_set_property_method__A__pro = makeString("~%(rm-set-property-method ~A) property keyword/value ~A/~A invalid");

    public static final SubLSymbol RM_SET_PROPERTY_METHOD = makeSymbol("RM-SET-PROPERTY-METHOD");

    public static final SubLSymbol CONSTRUCT_CYCL = makeSymbol("CONSTRUCT-CYCL");

    public static final SubLList $list42 = list(makeString("Constructs the cycl that this RM can be represented with."), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("TARGET-VAR"), makeSymbol("TARGET-TERM")), list(makeSymbol("DRT-WARN"), makeString("~%(rm-construct-cycl-method ~A) both target-var (~A) and target-term (~A) are set: using target-var"), makeSymbol("SELF"), makeSymbol("TARGET-VAR"), makeSymbol("TARGET-TERM"))), list(makeSymbol("PCOND"), list(makeSymbol("TARGET-VAR"), list(makeSymbol("RET"), makeSymbol("TARGET-VAR"))), list(makeSymbol("TARGET-TERM"), list(makeSymbol("RET"), makeSymbol("TARGET-TERM"))), list(makeSymbol("ROOT-TERM"), list(makeSymbol("DRT-WARN"), makeString("~%(rm-construct-cycl-method ~A) niether target-var nor target-term are set: using root-term (~A)"), makeSymbol("SELF"), makeSymbol("ROOT-TERM")), list(makeSymbol("RET"), makeSymbol("ROOT-TERM"))), list(T, list(makeSymbol("DRT-WARN"), makeString("~%(rm-construct-cycl-method ~A) no match."), makeSymbol("SELF")), list(makeSymbol("RET"), NIL))));

    public static final SubLSymbol $sym43$OUTER_CATCH_FOR_RM_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-RM-METHOD");

    public static final SubLString $str44$___rm_construct_cycl_method__A__b = makeString("~%(rm-construct-cycl-method ~A) both target-var (~A) and target-term (~A) are set: using target-var");

    public static final SubLString $str45$___rm_construct_cycl_method__A__n = makeString("~%(rm-construct-cycl-method ~A) niether target-var nor target-term are set: using root-term (~A)");

    public static final SubLString $str46$___rm_construct_cycl_method__A__n = makeString("~%(rm-construct-cycl-method ~A) no match.");

    public static final SubLSymbol RM_CONSTRUCT_CYCL_METHOD = makeSymbol("RM-CONSTRUCT-CYCL-METHOD");

    public static final SubLSymbol COREFERENCE_PROBABILITY = makeSymbol("COREFERENCE-PROBABILITY");

    public static final SubLList $list49 = list(makeSymbol("TARGET-RM"));

    public static final SubLList $list50 = list(makeString("Determines the probability that this RM can corefer to TARGET-RM.\n@returns a number between 0 and 1, or nil if no coreference is possible.\n@note This is a simple initial implementation..."), list(makeSymbol("PWHEN"), list(EQ, makeSymbol("SELF"), makeSymbol("TARGET-RM")), list(makeSymbol("RET"), NIL)), list(makeSymbol("PWHEN"), list(makeSymbol("TREE-FIND"), makeSymbol("FORMULA"), list(makeSymbol("GET-SLOT"), makeSymbol("TARGET-RM"), list(makeSymbol("QUOTE"), makeSymbol("FORMULA"))), list(makeSymbol("FUNCTION"), EQUAL)), list(makeSymbol("RET"), makeDouble(0.0))), list(makeSymbol("CLET"), list(list(makeSymbol("PROBABILITY"), makeDouble(0.0))), list(makeSymbol("PWHEN"), list(EQ, makeSymbol("GENDER"), list(makeSymbol("GET-SLOT"), makeSymbol("TARGET-RM"), list(makeSymbol("QUOTE"), makeSymbol("GENDER")))), list(makeSymbol("CSETQ"), makeSymbol("PROBABILITY"), list(makeSymbol("+"), makeSymbol("PROBABILITY"), makeDouble(0.5)))), list(makeSymbol("PWHEN"), list(EQ, makeSymbol("NUMBER"), list(makeSymbol("GET-SLOT"), makeSymbol("TARGET-RM"), list(makeSymbol("QUOTE"), makeSymbol("NUMBER")))), list(makeSymbol("CSETQ"), makeSymbol("PROBABILITY"), list(makeSymbol("+"), makeSymbol("PROBABILITY"), makeDouble(0.5)))), list(makeSymbol("RET"), makeSymbol("PROBABILITY"))));

    public static final SubLSymbol $sym51$OUTER_CATCH_FOR_RM_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-RM-METHOD");

    private static final SubLFloat $float$0_0 = makeDouble(0.0);

    private static final SubLFloat $float$0_5 = makeDouble(0.5);

    public static final SubLSymbol RM_COREFERENCE_PROBABILITY_METHOD = makeSymbol("RM-COREFERENCE-PROBABILITY-METHOD");

    public static final SubLList $list55 = list(reader_make_constant_shell(makeString("NLSemFn")), reader_make_constant_shell(makeString("NLNumberFn")), reader_make_constant_shell(makeString("NLQuantFn-3")), reader_make_constant_shell(makeString("NLDefinitenessFn-3")), reader_make_constant_shell(makeString("NLTagFn")), reader_make_constant_shell(makeString("PronounFn")), reader_make_constant_shell(makeString("SomeFn")));

    public static final SubLList $list56 = list(list(reader_make_constant_shell(makeString("NLSemFn")), makeKeyword("SEM")), list(reader_make_constant_shell(makeString("NLNumberFn")), makeKeyword("NUMBER")), list(reader_make_constant_shell(makeString("NLDefinitenessFn-3")), makeKeyword("DEFINITENESS")), list(reader_make_constant_shell(makeString("NLQuantFn-3")), makeKeyword("QUANT")), list(reader_make_constant_shell(makeString("NLTagFn")), makeKeyword("ANY")), list(reader_make_constant_shell(makeString("PronounFn")), makeKeyword("PRONOMIAL")), list(reader_make_constant_shell(makeString("SomeFn")), makeKeyword("SOMEFN")));

    public static final SubLSymbol DRT_POSSIBLE_RM_FORMULA = makeSymbol("DRT-POSSIBLE-RM-FORMULA");

    private static final SubLObject $$SubcollectionFunction = reader_make_constant_shell(makeString("SubcollectionFunction"));

    public static final SubLList $list59 = list(makeKeyword("TYPE"), makeKeyword("PRONOMIAL"));





    public static final SubLString $str62$drt_rm_formula_properties___A_has = makeString("drt-rm-formula-properties: ~A has multiple ~A properties");



    public static final SubLList $list64 = list(makeSymbol("PREV-RM-FORMULA"), makeSymbol("PREV-RM"));

    public static SubLObject real_rm(final SubLObject rm) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject new_rm = drt.drt_get_coreference(rm);
        final SubLObject existsP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL == existsP) {
            return rm;
        }
        if (rm.eql(new_rm)) {
            return rm;
        }
        return real_rm(new_rm);
    }

    public static SubLObject map_rm(final SubLObject rm, final SubLObject target) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != forts.fort_p(target)) {
            instances.set_slot(rm, TARGET_TERM, target);
            if ((!drt.$drt_trace_level$.getDynamicValue(thread).isNumber()) || drt.$drt_trace_level$.getDynamicValue(thread).numGE(TWO_INTEGER)) {
                if ((!drt.$drt_trace_level$.getDynamicValue(thread).isNumber()) || drt.$drt_trace_level$.getDynamicValue(thread).numGE(TWO_INTEGER)) {
                    drt.drt_tracer_output(TWO_INTEGER, list($str1$_______________________RM_MAPPING));
                }
                if ((!drt.$drt_trace_level$.getDynamicValue(thread).isNumber()) || drt.$drt_trace_level$.getDynamicValue(thread).numGE(TWO_INTEGER)) {
                    drt.drt_tracer_output(TWO_INTEGER, list($str2$_A_has_been_mapped_to__A__, rm, target));
                }
            }
        } else
            if (NIL != rm_p(target)) {
                thread.resetMultipleValues();
                final SubLObject old_rm = drt.drt_get_coreference(rm);
                final SubLObject existsP = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if ((NIL != existsP) && drt.$drt_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                    Errors.warn($str3$map_rm___A_was_mapped_to__A__now_, rm, old_rm, target);
                }
                final SubLObject result = drt.drt_set_coreference(rm, target);
                if ((!drt.$drt_trace_level$.getDynamicValue(thread).isNumber()) || drt.$drt_trace_level$.getDynamicValue(thread).numGE(TWO_INTEGER)) {
                    if ((!drt.$drt_trace_level$.getDynamicValue(thread).isNumber()) || drt.$drt_trace_level$.getDynamicValue(thread).numGE(TWO_INTEGER)) {
                        drt.drt_tracer_output(TWO_INTEGER, list($str1$_______________________RM_MAPPING));
                    }
                    if ((!drt.$drt_trace_level$.getDynamicValue(thread).isNumber()) || drt.$drt_trace_level$.getDynamicValue(thread).numGE(TWO_INTEGER)) {
                        drt.drt_tracer_output(TWO_INTEGER, list($str2$_A_has_been_mapped_to__A__, rm, target));
                    }
                }
                return result;
            }

        return NIL;
    }

    public static SubLObject get_rm_syntactic_role(final SubLObject rm) {
        return classes.subloop_get_access_protected_instance_slot(rm, FIFTEEN_INTEGER, SYNTACTIC_ROLE);
    }

    public static SubLObject set_rm_syntactic_role(final SubLObject rm, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(rm, value, FIFTEEN_INTEGER, SYNTACTIC_ROLE);
    }

    public static SubLObject get_rm_number(final SubLObject rm) {
        return classes.subloop_get_access_protected_instance_slot(rm, FOURTEEN_INTEGER, NUMBER);
    }

    public static SubLObject set_rm_number(final SubLObject rm, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(rm, value, FOURTEEN_INTEGER, NUMBER);
    }

    public static SubLObject get_rm_gender(final SubLObject rm) {
        return classes.subloop_get_access_protected_instance_slot(rm, THIRTEEN_INTEGER, GENDER);
    }

    public static SubLObject set_rm_gender(final SubLObject rm, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(rm, value, THIRTEEN_INTEGER, GENDER);
    }

    public static SubLObject get_rm_quant(final SubLObject rm) {
        return classes.subloop_get_access_protected_instance_slot(rm, TWELVE_INTEGER, QUANT);
    }

    public static SubLObject set_rm_quant(final SubLObject rm, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(rm, value, TWELVE_INTEGER, QUANT);
    }

    public static SubLObject get_rm_definiteness(final SubLObject rm) {
        return classes.subloop_get_access_protected_instance_slot(rm, ELEVEN_INTEGER, DEFINITENESS);
    }

    public static SubLObject set_rm_definiteness(final SubLObject rm, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(rm, value, ELEVEN_INTEGER, DEFINITENESS);
    }

    public static SubLObject get_rm_conditions(final SubLObject rm) {
        return classes.subloop_get_access_protected_instance_slot(rm, TEN_INTEGER, CONDITIONS);
    }

    public static SubLObject set_rm_conditions(final SubLObject rm, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(rm, value, TEN_INTEGER, CONDITIONS);
    }

    public static SubLObject get_rm_scope(final SubLObject rm) {
        return classes.subloop_get_access_protected_instance_slot(rm, NINE_INTEGER, SCOPE);
    }

    public static SubLObject set_rm_scope(final SubLObject rm, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(rm, value, NINE_INTEGER, SCOPE);
    }

    public static SubLObject get_rm_target_term(final SubLObject rm) {
        return classes.subloop_get_access_protected_instance_slot(rm, EIGHT_INTEGER, TARGET_TERM);
    }

    public static SubLObject set_rm_target_term(final SubLObject rm, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(rm, value, EIGHT_INTEGER, TARGET_TERM);
    }

    public static SubLObject get_rm_target_var(final SubLObject rm) {
        return classes.subloop_get_access_protected_instance_slot(rm, SEVEN_INTEGER, TARGET_VAR);
    }

    public static SubLObject set_rm_target_var(final SubLObject rm, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(rm, value, SEVEN_INTEGER, TARGET_VAR);
    }

    public static SubLObject get_rm_type(final SubLObject rm) {
        return classes.subloop_get_access_protected_instance_slot(rm, SIX_INTEGER, TYPE);
    }

    public static SubLObject set_rm_type(final SubLObject rm, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(rm, value, SIX_INTEGER, TYPE);
    }

    public static SubLObject get_rm_sub_rms(final SubLObject rm) {
        return classes.subloop_get_access_protected_instance_slot(rm, FIVE_INTEGER, SUB_RMS);
    }

    public static SubLObject set_rm_sub_rms(final SubLObject rm, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(rm, value, FIVE_INTEGER, SUB_RMS);
    }

    public static SubLObject get_rm_super_rm(final SubLObject rm) {
        return classes.subloop_get_access_protected_instance_slot(rm, FOUR_INTEGER, SUPER_RM);
    }

    public static SubLObject set_rm_super_rm(final SubLObject rm, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(rm, value, FOUR_INTEGER, SUPER_RM);
    }

    public static SubLObject get_rm_root_term(final SubLObject rm) {
        return classes.subloop_get_access_protected_instance_slot(rm, THREE_INTEGER, ROOT_TERM);
    }

    public static SubLObject set_rm_root_term(final SubLObject rm, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(rm, value, THREE_INTEGER, ROOT_TERM);
    }

    public static SubLObject get_rm_mapped_formula(final SubLObject rm) {
        return classes.subloop_get_access_protected_instance_slot(rm, TWO_INTEGER, MAPPED_FORMULA);
    }

    public static SubLObject set_rm_mapped_formula(final SubLObject rm, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(rm, value, TWO_INTEGER, MAPPED_FORMULA);
    }

    public static SubLObject get_rm_formula(final SubLObject rm) {
        return classes.subloop_get_access_protected_instance_slot(rm, ONE_INTEGER, FORMULA);
    }

    public static SubLObject set_rm_formula(final SubLObject rm, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(rm, value, ONE_INTEGER, FORMULA);
    }

    public static SubLObject subloop_reserved_initialize_rm_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_rm_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, RM, FORMULA, NIL);
        classes.subloop_initialize_slot(new_instance, RM, MAPPED_FORMULA, NIL);
        classes.subloop_initialize_slot(new_instance, RM, ROOT_TERM, NIL);
        classes.subloop_initialize_slot(new_instance, RM, SUPER_RM, NIL);
        classes.subloop_initialize_slot(new_instance, RM, SUB_RMS, NIL);
        classes.subloop_initialize_slot(new_instance, RM, TYPE, NIL);
        classes.subloop_initialize_slot(new_instance, RM, TARGET_VAR, NIL);
        classes.subloop_initialize_slot(new_instance, RM, TARGET_TERM, NIL);
        classes.subloop_initialize_slot(new_instance, RM, SCOPE, NIL);
        classes.subloop_initialize_slot(new_instance, RM, CONDITIONS, NIL);
        classes.subloop_initialize_slot(new_instance, RM, DEFINITENESS, NIL);
        classes.subloop_initialize_slot(new_instance, RM, QUANT, NIL);
        classes.subloop_initialize_slot(new_instance, RM, GENDER, NIL);
        classes.subloop_initialize_slot(new_instance, RM, NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, RM, SYNTACTIC_ROLE, NIL);
        return NIL;
    }

    public static SubLObject rm_p(final SubLObject rm) {
        return classes.subloop_instanceof_class(rm, RM);
    }

    public static SubLObject rm_set_property_method(final SubLObject self, final SubLObject property_keyword, final SubLObject new_property_value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_rm_method = NIL;
        SubLObject syntactic_role = get_rm_syntactic_role(self);
        SubLObject number = get_rm_number(self);
        SubLObject gender = get_rm_gender(self);
        SubLObject quant = get_rm_quant(self);
        SubLObject definiteness = get_rm_definiteness(self);
        SubLObject target_term = get_rm_target_term(self);
        SubLObject type = get_rm_type(self);
        final SubLObject root_term = get_rm_root_term(self);
        try {
            thread.throwStack.push($sym29$OUTER_CATCH_FOR_RM_METHOD);
            try {
                if (property_keyword.eql($TYPE)) {
                    type = new_property_value;
                } else
                    if (property_keyword.eql($DEFINITENESS)) {
                        definiteness = new_property_value;
                        if (new_property_value.eql($$Definite_NLAttr)) {
                            type = $DEFINITE;
                        }
                    } else
                        if (property_keyword.eql($QUANT)) {
                            quant = new_property_value;
                            if (new_property_value.eql($$ProperName_NLAttr)) {
                                target_term = root_term;
                            }
                        } else
                            if (property_keyword.eql($GENDER)) {
                                gender = new_property_value;
                            } else
                                if (property_keyword.eql($NUMBER)) {
                                    number = new_property_value;
                                } else
                                    if (property_keyword.eql($SYNTACTIC_ROLE)) {
                                        syntactic_role = new_property_value;
                                    } else
                                        if (drt.$drt_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                                            Errors.warn($str39$___rm_set_property_method__A__pro, self, property_keyword, new_property_value);
                                        }






                sublisp_throw($sym29$OUTER_CATCH_FOR_RM_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_rm_syntactic_role(self, syntactic_role);
                    set_rm_number(self, number);
                    set_rm_gender(self, gender);
                    set_rm_quant(self, quant);
                    set_rm_definiteness(self, definiteness);
                    set_rm_target_term(self, target_term);
                    set_rm_type(self, type);
                    set_rm_root_term(self, root_term);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_rm_method = Errors.handleThrowable(ccatch_env_var, $sym29$OUTER_CATCH_FOR_RM_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_rm_method;
    }

    public static SubLObject rm_construct_cycl_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_rm_method = NIL;
        final SubLObject target_term = get_rm_target_term(self);
        final SubLObject target_var = get_rm_target_var(self);
        final SubLObject root_term = get_rm_root_term(self);
        try {
            thread.throwStack.push($sym43$OUTER_CATCH_FOR_RM_METHOD);
            try {
                if (((NIL != target_var) && (NIL != target_term)) && drt.$drt_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                    Errors.warn($str44$___rm_construct_cycl_method__A__b, self, target_var, target_term);
                }
                if (NIL != target_var) {
                    sublisp_throw($sym43$OUTER_CATCH_FOR_RM_METHOD, target_var);
                } else
                    if (NIL != target_term) {
                        sublisp_throw($sym43$OUTER_CATCH_FOR_RM_METHOD, target_term);
                    } else
                        if (NIL != root_term) {
                            if (drt.$drt_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                                Errors.warn($str45$___rm_construct_cycl_method__A__n, self, root_term);
                            }
                            sublisp_throw($sym43$OUTER_CATCH_FOR_RM_METHOD, root_term);
                        } else {
                            if (drt.$drt_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                                Errors.warn($str46$___rm_construct_cycl_method__A__n, self);
                            }
                            sublisp_throw($sym43$OUTER_CATCH_FOR_RM_METHOD, NIL);
                        }


            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_rm_target_term(self, target_term);
                    set_rm_target_var(self, target_var);
                    set_rm_root_term(self, root_term);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_rm_method = Errors.handleThrowable(ccatch_env_var, $sym43$OUTER_CATCH_FOR_RM_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_rm_method;
    }

    public static SubLObject rm_coreference_probability_method(final SubLObject self, final SubLObject target_rm) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_rm_method = NIL;
        final SubLObject number = get_rm_number(self);
        final SubLObject gender = get_rm_gender(self);
        final SubLObject formula = get_rm_formula(self);
        try {
            thread.throwStack.push($sym51$OUTER_CATCH_FOR_RM_METHOD);
            try {
                if (self.eql(target_rm)) {
                    sublisp_throw($sym51$OUTER_CATCH_FOR_RM_METHOD, NIL);
                }
                if (NIL != list_utilities.tree_find(formula, instances.get_slot(target_rm, FORMULA), symbol_function(EQUAL), UNPROVIDED)) {
                    sublisp_throw($sym51$OUTER_CATCH_FOR_RM_METHOD, $float$0_0);
                }
                SubLObject probability = $float$0_0;
                if (gender.eql(instances.get_slot(target_rm, GENDER))) {
                    probability = add(probability, $float$0_5);
                }
                if (number.eql(instances.get_slot(target_rm, NUMBER))) {
                    probability = add(probability, $float$0_5);
                }
                sublisp_throw($sym51$OUTER_CATCH_FOR_RM_METHOD, probability);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_rm_number(self, number);
                    set_rm_gender(self, gender);
                    set_rm_formula(self, formula);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_rm_method = Errors.handleThrowable(ccatch_env_var, $sym51$OUTER_CATCH_FOR_RM_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_rm_method;
    }

    public static SubLObject drt_rm_wrapper_fn_p(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return subl_promotions.memberP(fort, $drt_rm_wrapper_fns$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject drt_rm_wrapper_fn_to_keyword(final SubLObject wrapper_fn) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject assoc_pair = assoc(wrapper_fn, $drt_rm_wrapper_fns_to_keywords$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
        if (NIL != assoc_pair) {
            return second(assoc_pair);
        }
        return NIL;
    }

    public static SubLObject drt_possible_rm_formula(final SubLObject poss_rm_formula) {
        if (poss_rm_formula.isCons()) {
            return list_utilities.sublisp_boolean(drt_rm_wrapper_fn_p(poss_rm_formula.first()));
        }
        return NIL;
    }

    public static SubLObject drt_find_rm_formulas(final SubLObject formula) {
        final SubLObject poss_rm_formulas = list_utilities.tree_gather(formula, symbol_function(DRT_POSSIBLE_RM_FORMULA), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject last_poss_formula = NIL;
        SubLObject result = NIL;
        SubLObject cdolist_list_var = poss_rm_formulas;
        SubLObject poss_rm_formula = NIL;
        poss_rm_formula = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL == subl_promotions.memberP(poss_rm_formula, last_poss_formula, symbol_function(EQUAL), UNPROVIDED)) || (NIL != isa.isaP(cycl_utilities.formula_arg0(last_poss_formula), $$SubcollectionFunction, UNPROVIDED, UNPROVIDED))) {
                result = cons(poss_rm_formula, result);
            }
            last_poss_formula = poss_rm_formula;
            cdolist_list_var = cdolist_list_var.rest();
            poss_rm_formula = cdolist_list_var.first();
        } 
        return nreverse(result);
    }

    public static SubLObject drt_pronoun_formula_to_property_pairs(final SubLObject pronoun_formula) {
        if (length(pronoun_formula).eql(FIVE_INTEGER)) {
            final SubLObject number = third(pronoun_formula);
            final SubLObject gender = fourth(pronoun_formula);
            return list($list59, list($NUMBER, number), list($GENDER, gender));
        }
        return NIL;
    }

    public static SubLObject drt_rm_formula_properties(final SubLObject rm_formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (!rm_formula.isCons()) {
            return values(NIL, rm_formula);
        }
        final SubLObject poss_rm_wrapper_keyword = drt_rm_wrapper_fn_to_keyword(rm_formula.first());
        if (poss_rm_wrapper_keyword == $PRONOMIAL) {
            return values(drt_pronoun_formula_to_property_pairs(rm_formula), NIL);
        }
        if (poss_rm_wrapper_keyword == $SOMEFN) {
            return values(NIL, second(rm_formula));
        }
        if (poss_rm_wrapper_keyword.isKeyword()) {
            thread.resetMultipleValues();
            final SubLObject recurse_property_pairs = drt_rm_formula_properties(third(rm_formula));
            final SubLObject recurse_root_term = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if ((NIL != assoc(poss_rm_wrapper_keyword, recurse_property_pairs, UNPROVIDED, UNPROVIDED)) && drt.$drt_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                Errors.warn($str62$drt_rm_formula_properties___A_has, rm_formula, poss_rm_wrapper_keyword);
            }
            return values(cons(list(poss_rm_wrapper_keyword, second(rm_formula)), recurse_property_pairs), recurse_root_term);
        }
        return values(NIL, rm_formula);
    }

    public static SubLObject create_rm_from_rm_formula(final SubLObject rm_formula, SubLObject rm_formula_to_rm_mappings) {
        if (rm_formula_to_rm_mappings == UNPROVIDED) {
            rm_formula_to_rm_mappings = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject property_pairs = drt_rm_formula_properties(rm_formula);
        final SubLObject root_term = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject rm = methods.funcall_class_method_with_0_args(RM, NEW);
        SubLObject rm_mapped_formula = copy_tree(root_term);
        SubLObject cdolist_list_var = rm_formula_to_rm_mappings;
        SubLObject rm_formula_to_rm_mapping = NIL;
        rm_formula_to_rm_mapping = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = rm_formula_to_rm_mapping;
            SubLObject prev_rm_formula = NIL;
            SubLObject prev_rm = NIL;
            destructuring_bind_must_consp(current, datum, $list64);
            prev_rm_formula = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list64);
            prev_rm = current.first();
            current = current.rest();
            if (NIL == current) {
                rm_mapped_formula = subst(prev_rm, prev_rm_formula, rm_mapped_formula, symbol_function(EQUAL), UNPROVIDED);
            } else {
                cdestructuring_bind_error(datum, $list64);
            }
            cdolist_list_var = cdolist_list_var.rest();
            rm_formula_to_rm_mapping = cdolist_list_var.first();
        } 
        instances.set_slot(rm, FORMULA, rm_formula);
        instances.set_slot(rm, MAPPED_FORMULA, rm_mapped_formula);
        instances.set_slot(rm, ROOT_TERM, root_term);
        cdolist_list_var = property_pairs;
        SubLObject property_pair = NIL;
        property_pair = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject property_keyword = property_pair.first();
            final SubLObject property_value = second(property_pair);
            methods.funcall_instance_method_with_2_args(rm, SET_PROPERTY, property_keyword, property_value);
            cdolist_list_var = cdolist_list_var.rest();
            property_pair = cdolist_list_var.first();
        } 
        return rm;
    }

    public static SubLObject declare_drt_rm_file() {
        declareFunction(me, "real_rm", "REAL-RM", 1, 0, false);
        declareFunction(me, "map_rm", "MAP-RM", 2, 0, false);
        declareFunction(me, "get_rm_syntactic_role", "GET-RM-SYNTACTIC-ROLE", 1, 0, false);
        declareFunction(me, "set_rm_syntactic_role", "SET-RM-SYNTACTIC-ROLE", 2, 0, false);
        declareFunction(me, "get_rm_number", "GET-RM-NUMBER", 1, 0, false);
        declareFunction(me, "set_rm_number", "SET-RM-NUMBER", 2, 0, false);
        declareFunction(me, "get_rm_gender", "GET-RM-GENDER", 1, 0, false);
        declareFunction(me, "set_rm_gender", "SET-RM-GENDER", 2, 0, false);
        declareFunction(me, "get_rm_quant", "GET-RM-QUANT", 1, 0, false);
        declareFunction(me, "set_rm_quant", "SET-RM-QUANT", 2, 0, false);
        declareFunction(me, "get_rm_definiteness", "GET-RM-DEFINITENESS", 1, 0, false);
        declareFunction(me, "set_rm_definiteness", "SET-RM-DEFINITENESS", 2, 0, false);
        declareFunction(me, "get_rm_conditions", "GET-RM-CONDITIONS", 1, 0, false);
        declareFunction(me, "set_rm_conditions", "SET-RM-CONDITIONS", 2, 0, false);
        declareFunction(me, "get_rm_scope", "GET-RM-SCOPE", 1, 0, false);
        declareFunction(me, "set_rm_scope", "SET-RM-SCOPE", 2, 0, false);
        declareFunction(me, "get_rm_target_term", "GET-RM-TARGET-TERM", 1, 0, false);
        declareFunction(me, "set_rm_target_term", "SET-RM-TARGET-TERM", 2, 0, false);
        declareFunction(me, "get_rm_target_var", "GET-RM-TARGET-VAR", 1, 0, false);
        declareFunction(me, "set_rm_target_var", "SET-RM-TARGET-VAR", 2, 0, false);
        declareFunction(me, "get_rm_type", "GET-RM-TYPE", 1, 0, false);
        declareFunction(me, "set_rm_type", "SET-RM-TYPE", 2, 0, false);
        declareFunction(me, "get_rm_sub_rms", "GET-RM-SUB-RMS", 1, 0, false);
        declareFunction(me, "set_rm_sub_rms", "SET-RM-SUB-RMS", 2, 0, false);
        declareFunction(me, "get_rm_super_rm", "GET-RM-SUPER-RM", 1, 0, false);
        declareFunction(me, "set_rm_super_rm", "SET-RM-SUPER-RM", 2, 0, false);
        declareFunction(me, "get_rm_root_term", "GET-RM-ROOT-TERM", 1, 0, false);
        declareFunction(me, "set_rm_root_term", "SET-RM-ROOT-TERM", 2, 0, false);
        declareFunction(me, "get_rm_mapped_formula", "GET-RM-MAPPED-FORMULA", 1, 0, false);
        declareFunction(me, "set_rm_mapped_formula", "SET-RM-MAPPED-FORMULA", 2, 0, false);
        declareFunction(me, "get_rm_formula", "GET-RM-FORMULA", 1, 0, false);
        declareFunction(me, "set_rm_formula", "SET-RM-FORMULA", 2, 0, false);
        declareFunction(me, "subloop_reserved_initialize_rm_class", "SUBLOOP-RESERVED-INITIALIZE-RM-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_rm_instance", "SUBLOOP-RESERVED-INITIALIZE-RM-INSTANCE", 1, 0, false);
        declareFunction(me, "rm_p", "RM-P", 1, 0, false);
        declareFunction(me, "rm_set_property_method", "RM-SET-PROPERTY-METHOD", 3, 0, false);
        declareFunction(me, "rm_construct_cycl_method", "RM-CONSTRUCT-CYCL-METHOD", 1, 0, false);
        declareFunction(me, "rm_coreference_probability_method", "RM-COREFERENCE-PROBABILITY-METHOD", 2, 0, false);
        declareFunction(me, "drt_rm_wrapper_fn_p", "DRT-RM-WRAPPER-FN-P", 1, 0, false);
        declareFunction(me, "drt_rm_wrapper_fn_to_keyword", "DRT-RM-WRAPPER-FN-TO-KEYWORD", 1, 0, false);
        declareFunction(me, "drt_possible_rm_formula", "DRT-POSSIBLE-RM-FORMULA", 1, 0, false);
        declareFunction(me, "drt_find_rm_formulas", "DRT-FIND-RM-FORMULAS", 1, 0, false);
        declareFunction(me, "drt_pronoun_formula_to_property_pairs", "DRT-PRONOUN-FORMULA-TO-PROPERTY-PAIRS", 1, 0, false);
        declareFunction(me, "drt_rm_formula_properties", "DRT-RM-FORMULA-PROPERTIES", 1, 0, false);
        declareFunction(me, "create_rm_from_rm_formula", "CREATE-RM-FROM-RM-FORMULA", 1, 1, false);
        return NIL;
    }

    public static SubLObject init_drt_rm_file() {
        defparameter("*DRT-RM-WRAPPER-FNS*", $list55);
        defparameter("*DRT-RM-WRAPPER-FNS-TO-KEYWORDS*", $list56);
        return NIL;
    }

    public static SubLObject setup_drt_rm_file() {
        classes.subloop_new_class(RM, OBJECT, NIL, NIL, $list6);
        classes.class_set_implements_slot_listeners(RM, NIL);
        classes.subloop_note_class_initialization_function(RM, SUBLOOP_RESERVED_INITIALIZE_RM_CLASS);
        classes.subloop_note_instance_initialization_function(RM, SUBLOOP_RESERVED_INITIALIZE_RM_INSTANCE);
        subloop_reserved_initialize_rm_class(RM);
        methods.methods_incorporate_instance_method(SET_PROPERTY, RM, NIL, $list27, $list28);
        methods.subloop_register_instance_method(RM, SET_PROPERTY, RM_SET_PROPERTY_METHOD);
        methods.methods_incorporate_instance_method(CONSTRUCT_CYCL, RM, NIL, NIL, $list42);
        methods.subloop_register_instance_method(RM, CONSTRUCT_CYCL, RM_CONSTRUCT_CYCL_METHOD);
        methods.methods_incorporate_instance_method(COREFERENCE_PROBABILITY, RM, NIL, $list49, $list50);
        methods.subloop_register_instance_method(RM, COREFERENCE_PROBABILITY, RM_COREFERENCE_PROBABILITY_METHOD);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_drt_rm_file();
    }

    @Override
    public void initializeVariables() {
        init_drt_rm_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_drt_rm_file();
    }

    
}

/**
 * Total time: 211 ms
 */
