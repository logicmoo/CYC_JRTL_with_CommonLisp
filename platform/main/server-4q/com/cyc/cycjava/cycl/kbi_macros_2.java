/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval.eval;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.intern;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      KBI-MACROS-2
 *  source file: /cyc/top/cycl/kbi-macros-2.lisp
 *  created:     2019/07/03 17:37:19
 */
public final class kbi_macros_2 extends SubLTranslatedFile implements V02 {
    // // Constructor
    private kbi_macros_2() {
    }

    public static final SubLFile me = new kbi_macros_2();


    // // Definitions
    public static final SubLObject define_kbi_module(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject module = NIL;
            SubLObject v_properties = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt0);
            module = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt0);
            v_properties = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject forms = NIL;
                    SubLObject property_list = eval(v_properties);
                    SubLObject domain = second(member($KBI_DOMAIN, property_list, UNPROVIDED, UNPROVIDED));
                    SubLObject domain_var = (domain.isSymbol()) ? ((SubLObject) (intern(symbol_name(domain), UNPROVIDED))) : NIL;
                    SubLObject count_var = (domain.isSymbol()) ? ((SubLObject) (intern(format(NIL, $str_alt2$__a_COUNT_, symbol_name(module)), UNPROVIDED))) : NIL;
                    SubLObject time_var = (domain.isSymbol()) ? ((SubLObject) (intern(format(NIL, $str_alt3$__a_TIME_, symbol_name(module)), UNPROVIDED))) : NIL;
                    SubLObject result_var_prop = member($kw4$KBI_CACHE_RESULTS_, property_list, UNPROVIDED, UNPROVIDED);
                    SubLObject result_varP = makeBoolean((NIL != result_var_prop) && (NIL != second(result_var_prop)));
                    SubLObject result_var = (module.isSymbol() && ((NIL != result_varP) || (NIL != (NIL != result_var_prop ? ((SubLObject) (NIL)) : get($kw4$KBI_CACHE_RESULTS_, $DEFAULT, UNPROVIDED))))) ? ((SubLObject) (intern(format(NIL, $str_alt6$__a_RESULTS_, symbol_name(module)), UNPROVIDED))) : NIL;
                    SubLObject repair_var_prop = member($kw7$KBI_CACHE_REPAIR_, property_list, UNPROVIDED, UNPROVIDED);
                    SubLObject repair_varP = makeBoolean((NIL != repair_var_prop) && (NIL != second(repair_var_prop)));
                    SubLObject repair_var = (module.isSymbol() && ((NIL != repair_varP) || (NIL != (NIL != repair_var_prop ? ((SubLObject) (NIL)) : makeBoolean((NIL != get($kw8$KBI_CACHE_REPAIRS_, $DEFAULT, UNPROVIDED)) && (NIL != subl_promotions.memberP($KBI_REPAIR_FN, property_list, UNPROVIDED, UNPROVIDED))))))) ? ((SubLObject) (intern(format(NIL, $str_alt10$__a_REPAIRS_, symbol_name(module)), UNPROVIDED))) : NIL;
                    SubLObject evaluation_fn = second(member($KBI_EVALUATION_FN, property_list, UNPROVIDED, UNPROVIDED));
                    SubLObject kbi_nl_just = second(member($KBI_NL_JUST_FN, property_list, UNPROVIDED, UNPROVIDED));
                    SubLObject doc = second(member($KBI_DOC, property_list, UNPROVIDED, UNPROVIDED));
                    if (NIL != count_var) {
                        property_list = cons($KBI_COUNT_CACHE, cons(count_var, property_list));
                    }
                    if (NIL != time_var) {
                        property_list = cons($KBI_TIME_CACHE, cons(time_var, property_list));
                    }
                    if (NIL != result_var) {
                        property_list = cons($KBI_RESULT_CACHE, cons(result_var, property_list));
                    }
                    if (NIL != repair_var) {
                        property_list = cons($KBI_REPAIR_CACHE, cons(repair_var, property_list));
                    }
                    {
                        SubLObject att_vals = NIL;
                        SubLObject attribute = NIL;
                        SubLObject value = NIL;
                        for (att_vals = property_list, attribute = att_vals.first(), value = second(att_vals); NIL != att_vals; att_vals = cddr(att_vals) , attribute = att_vals.first() , value = second(att_vals)) {
                            {
                                SubLObject pcase_var = attribute;
                                if (pcase_var.eql($KBI_COUNT_CACHE)) {
                                    forms = cons(list(DEFVAR_KBI, count_var, ZERO_INTEGER, format(NIL, $str_alt19$number_of_predicate_applications_, module)), forms);
                                } else
                                    if (pcase_var.eql($KBI_TIME_CACHE)) {
                                        forms = cons(list(DEFVAR_KBI, time_var, ZERO_INTEGER, format(NIL, $str_alt20$run_time_of_predicate_application, module)), forms);
                                    } else
                                        if (pcase_var.eql($KBI_RESULT_CACHE)) {
                                            forms = cons(list(DEFVAR_KBI, result_var, NIL, format(NIL, $str_alt21$violators_of_kbi_module__s, module)), forms);
                                        } else
                                            if (pcase_var.eql($KBI_REPAIR_CACHE)) {
                                                forms = cons(list(DEFVAR_KBI, value, NIL, format(NIL, $str_alt22$repaired_violators_of_kbi_module_, module)), forms);
                                            } else
                                                if (pcase_var.eql($KBI_PREDICATE_FN)) {
                                                    if (NIL == domain_var) {
                                                        Errors.warn($str_alt24$missing_value_for_property__kbi_d);
                                                        return NIL;
                                                    } else
                                                        if (NIL == evaluation_fn) {
                                                            Errors.warn($str_alt25$missing_value_for_property__kbi_e);
                                                            return NIL;
                                                        } else {
                                                            {
                                                                SubLObject malP = $sym26$MAL_;
                                                                SubLObject time = $sym27$TIME;
                                                                forms = cons(list(DEFINE_PUBLIC, value, list(domain_var), doc, list(PWHEN, list(CAND, list($sym31$RUN_KBI_MODULE_, module), list($sym32$KBI_APPLIES_TO_, module, domain_var)), list(CLET, list(malP, time), list(KBI_INCREMENT_COUNT, module), list(CTIME, time, list($sym36$ANY_KBI_RESULT_, malP, list(evaluation_fn, domain_var))), list(KBI_INCREMENT_TIME, module, time), list(RET, malP)))), forms);
                                                            }
                                                        }

                                                } else
                                                    if (pcase_var.eql($KBI_RESULT_FN)) {
                                                        if (NIL == domain_var) {
                                                            Errors.warn($str_alt24$missing_value_for_property__kbi_d);
                                                            return NIL;
                                                        } else
                                                            if (NIL == evaluation_fn) {
                                                                Errors.warn($str_alt25$missing_value_for_property__kbi_e);
                                                                return NIL;
                                                            } else {
                                                                {
                                                                    SubLObject data = $sym40$DATA;
                                                                    forms = cons(list(DEFINE_PUBLIC, value, list(domain_var), format(NIL, $str_alt41$explanation_of_why_kbi_module__s_, module, domain_var), list(PWHEN, list($sym32$KBI_APPLIES_TO_, module, domain_var), list(CLET, list(data), list(WITH_KBI_RESULT, data, list(evaluation_fn, domain_var)), list(RET, data)))), forms);
                                                                }
                                                            }

                                                    } else
                                                        if (pcase_var.eql($KBI_JUSTIFY_FN)) {
                                                            if (NIL == domain_var) {
                                                                Errors.warn($str_alt24$missing_value_for_property__kbi_d);
                                                                return NIL;
                                                            } else
                                                                if (NIL == evaluation_fn) {
                                                                    Errors.warn($str_alt25$missing_value_for_property__kbi_e);
                                                                    return NIL;
                                                                } else
                                                                    if (NIL == kbi_nl_just) {
                                                                        {
                                                                            SubLObject data = $sym44$DATA;
                                                                            forms = cons(list(DEFINE_PUBLIC, value, bq_cons(domain_var, $list_alt45), format(NIL, $str_alt41$explanation_of_why_kbi_module__s_, module, domain_var), list(PWHEN, list($sym46$KBI_FINDING_, module, domain_var), list(CLET, list(data), list(WITH_KBI_RESULT, data, list(evaluation_fn, domain_var)), list(PCASE, MODE, list($EL, list(PIF, data, list(RET, list(LIST, module, domain_var, data)), list(RET, list(LIST, module, domain_var)))), list($NL, listS(WARN, $str_alt54$_s_missing_value_for_property__s, module, $list_alt55)))))), forms);
                                                                        }
                                                                    } else {
                                                                        {
                                                                            SubLObject data = $sym56$DATA;
                                                                            forms = cons(list(DEFINE_PUBLIC, value, bq_cons(domain_var, $list_alt45), format(NIL, $str_alt41$explanation_of_why_kbi_module__s_, module, domain_var), list(PWHEN, list($sym46$KBI_FINDING_, module, domain_var), list(CLET, list(data), list(WITH_KBI_RESULT, data, list(evaluation_fn, domain_var)), list(PCASE, MODE, list($EL, list(PIF, data, list(RET, list(LIST, module, domain_var, data)), list(RET, list(LIST, module, domain_var)))), list($NL, list(RET, list(kbi_nl_just, domain_var, data))))))), forms);
                                                                        }
                                                                    }


                                                        }






                            }
                        }
                    }
                    return bq_cons(PROGN, append(nreverse(cons(list(INSTALL_KBI_MODULE, module, list(QUOTE, property_list)), forms)), NIL));
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt0);
            }
        }
        return NIL;
    }

    public static final SubLObject declare_kbi_macros_2_file() {
        declareMacro("define_kbi_module", "DEFINE-KBI-MODULE");
        return NIL;
    }

    public static final SubLObject init_kbi_macros_2_file() {
        return NIL;
    }

    public static final SubLObject setup_kbi_macros_2_file() {
                return NIL;
    }

    // // Internal Constants
    static private final SubLList $list_alt0 = list(makeSymbol("MODULE"), makeSymbol("PROPERTIES"));

    private static final SubLSymbol $KBI_DOMAIN = makeKeyword("KBI-DOMAIN");

    static private final SubLString $str_alt2$__a_COUNT_ = makeString("*~a-COUNT*");

    static private final SubLString $str_alt3$__a_TIME_ = makeString("*~a-TIME*");

    public static final SubLSymbol $kw4$KBI_CACHE_RESULTS_ = makeKeyword("KBI-CACHE-RESULTS?");



    static private final SubLString $str_alt6$__a_RESULTS_ = makeString("*~a-RESULTS*");

    public static final SubLSymbol $kw7$KBI_CACHE_REPAIR_ = makeKeyword("KBI-CACHE-REPAIR?");

    public static final SubLSymbol $kw8$KBI_CACHE_REPAIRS_ = makeKeyword("KBI-CACHE-REPAIRS?");

    private static final SubLSymbol $KBI_REPAIR_FN = makeKeyword("KBI-REPAIR-FN");

    static private final SubLString $str_alt10$__a_REPAIRS_ = makeString("*~a-REPAIRS*");

    private static final SubLSymbol $KBI_EVALUATION_FN = makeKeyword("KBI-EVALUATION-FN");

    private static final SubLSymbol $KBI_NL_JUST_FN = makeKeyword("KBI-NL-JUST-FN");

    private static final SubLSymbol $KBI_DOC = makeKeyword("KBI-DOC");

    private static final SubLSymbol $KBI_COUNT_CACHE = makeKeyword("KBI-COUNT-CACHE");

    private static final SubLSymbol $KBI_TIME_CACHE = makeKeyword("KBI-TIME-CACHE");

    private static final SubLSymbol $KBI_RESULT_CACHE = makeKeyword("KBI-RESULT-CACHE");

    private static final SubLSymbol $KBI_REPAIR_CACHE = makeKeyword("KBI-REPAIR-CACHE");

    private static final SubLSymbol DEFVAR_KBI = makeSymbol("DEFVAR-KBI");

    static private final SubLString $str_alt19$number_of_predicate_applications_ = makeString("number of predicate applications of kbi module ~s");

    static private final SubLString $str_alt20$run_time_of_predicate_application = makeString("run time of predicate applications of kbi module ~s");

    static private final SubLString $str_alt21$violators_of_kbi_module__s = makeString("violators of kbi module ~s");

    static private final SubLString $str_alt22$repaired_violators_of_kbi_module_ = makeString("repaired violators of kbi module ~s");

    private static final SubLSymbol $KBI_PREDICATE_FN = makeKeyword("KBI-PREDICATE-FN");

    static private final SubLString $str_alt24$missing_value_for_property__kbi_d = makeString("missing value for property :kbi-domain");

    static private final SubLString $str_alt25$missing_value_for_property__kbi_e = makeString("missing value for property :kbi-evaluation-fn");

    static private final SubLSymbol $sym26$MAL_ = makeUninternedSymbol("MAL?");

    static private final SubLSymbol $sym27$TIME = makeUninternedSymbol("TIME");







    static private final SubLSymbol $sym31$RUN_KBI_MODULE_ = makeSymbol("RUN-KBI-MODULE?");

    static private final SubLSymbol $sym32$KBI_APPLIES_TO_ = makeSymbol("KBI-APPLIES-TO?");



    private static final SubLSymbol KBI_INCREMENT_COUNT = makeSymbol("KBI-INCREMENT-COUNT");



    static private final SubLSymbol $sym36$ANY_KBI_RESULT_ = makeSymbol("ANY-KBI-RESULT?");

    private static final SubLSymbol KBI_INCREMENT_TIME = makeSymbol("KBI-INCREMENT-TIME");



    private static final SubLSymbol $KBI_RESULT_FN = makeKeyword("KBI-RESULT-FN");

    static private final SubLSymbol $sym40$DATA = makeUninternedSymbol("DATA");

    static private final SubLString $str_alt41$explanation_of_why_kbi_module__s_ = makeString("explanation of why kbi module ~s applies to ~a");

    private static final SubLSymbol WITH_KBI_RESULT = makeSymbol("WITH-KBI-RESULT");

    private static final SubLSymbol $KBI_JUSTIFY_FN = makeKeyword("KBI-JUSTIFY-FN");

    static private final SubLSymbol $sym44$DATA = makeUninternedSymbol("DATA");

    static private final SubLList $list_alt45 = list(makeSymbol("&OPTIONAL"), list(makeSymbol("MODE"), makeSymbol("*KBI-I/O-MODE*")));

    static private final SubLSymbol $sym46$KBI_FINDING_ = makeSymbol("KBI-FINDING?");















    static private final SubLString $str_alt54$_s_missing_value_for_property__s = makeString("~s missing value for property ~s");

    static private final SubLList $list_alt55 = list(makeKeyword("KBI-NL-JUST-FN"));

    static private final SubLSymbol $sym56$DATA = makeUninternedSymbol("DATA");



    private static final SubLSymbol INSTALL_KBI_MODULE = makeSymbol("INSTALL-KBI-MODULE");



    // // Initializers
    public void declareFunctions() {
        declare_kbi_macros_2_file();
    }

    public void initializeVariables() {
        init_kbi_macros_2_file();
    }

    public void runTopLevelForms() {
        setup_kbi_macros_2_file();
    }
}

