/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.id_index.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import java.util.Iterator;
import java.util.Map;

import org.armedbear.lisp.Lisp;
import org.logicmoo.system.BeanShellCntrl;

import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.cycjava.cycl.nl.document_disambiguation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
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
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      RULE-DISAMBIGUATION
 * source file: /cyc/top/cycl/rule-disambiguation.lisp
 * created:     2019/07/03 17:38:57
 */
public final class rule_disambiguation extends SubLTranslatedFile implements V12 {
    public static final class $rule_disambiguator_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        public SubLObject getField2() {
            return com.cyc.cycjava.cycl.rule_disambiguation.$rule_disambiguator_native.this.$rule_file;
        }

        public SubLObject getField3() {
            return com.cyc.cycjava.cycl.rule_disambiguation.$rule_disambiguator_native.this.$count_file;
        }

        public SubLObject getField4() {
            return com.cyc.cycjava.cycl.rule_disambiguation.$rule_disambiguator_native.this.$rules;
        }

        public SubLObject getField5() {
            return com.cyc.cycjava.cycl.rule_disambiguation.$rule_disambiguator_native.this.$counts;
        }

        public SubLObject setField2(SubLObject value) {
            return com.cyc.cycjava.cycl.rule_disambiguation.$rule_disambiguator_native.this.$rule_file = value;
        }

        public SubLObject setField3(SubLObject value) {
            return com.cyc.cycjava.cycl.rule_disambiguation.$rule_disambiguator_native.this.$count_file = value;
        }

        public SubLObject setField4(SubLObject value) {
            return com.cyc.cycjava.cycl.rule_disambiguation.$rule_disambiguator_native.this.$rules = value;
        }

        public SubLObject setField5(SubLObject value) {
            return com.cyc.cycjava.cycl.rule_disambiguation.$rule_disambiguator_native.this.$counts = value;
        }

        public SubLObject $rule_file = Lisp.NIL;

        public SubLObject $count_file = Lisp.NIL;

        public SubLObject $rules = Lisp.NIL;

        public SubLObject $counts = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.rule_disambiguation.$rule_disambiguator_native.class, RULE_DISAMBIGUATOR, RULE_DISAMBIGUATOR_P, $list_alt8, $list_alt9, new String[]{ "$rule_file", "$count_file", "$rules", "$counts" }, $list_alt10, $list_alt11, RDIS_PRINT);
    }

    public static final SubLFile me = new rule_disambiguation();

 public static final String myName = "com.cyc.cycjava.cycl.rule_disambiguation";


    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $word_sense_disambiguation_rule_file$ = makeSymbol("*WORD-SENSE-DISAMBIGUATION-RULE-FILE*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $word_sense_disambiguation_count_file$ = makeSymbol("*WORD-SENSE-DISAMBIGUATION-COUNT-FILE*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_rule_disambiguator$ = makeSymbol("*DTP-RULE-DISAMBIGUATOR*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLString $str0$data_word_sense_disambiguation_ru = makeString("data/word-sense-disambiguation-rules.fht");

    static private final SubLString $str1$data_word_sense_disambiguation_co = makeString("data/word-sense-disambiguation-counts.fht");

    static private final SubLList $list2 = list(list(makeSymbol("DISAMBIGUATOR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list4 = list(list(makeSymbol("NEW-RULE-DISAMBIGUATOR")));

    private static final SubLSymbol FINALIZE_RULE_DISAMBIGUATOR = makeSymbol("FINALIZE-RULE-DISAMBIGUATOR");

    private static final SubLSymbol RULE_DISAMBIGUATOR = makeSymbol("RULE-DISAMBIGUATOR");

    private static final SubLSymbol RULE_DISAMBIGUATOR_P = makeSymbol("RULE-DISAMBIGUATOR-P");

    static private final SubLList $list8 = list(makeSymbol("RULE-FILE"), makeSymbol("COUNT-FILE"), makeSymbol("RULES"), makeSymbol("COUNTS"));

    static private final SubLList $list9 = list(makeKeyword("RULE-FILE"), makeKeyword("COUNT-FILE"), makeKeyword("RULES"), makeKeyword("COUNTS"));

    static private final SubLList $list10 = list(makeSymbol("RDIS-RULE-FILE"), makeSymbol("RDIS-COUNT-FILE"), makeSymbol("RDIS-RULES"), makeSymbol("RDIS-COUNTS"));

    static private final SubLList $list11 = list(makeSymbol("_CSETF-RDIS-RULE-FILE"), makeSymbol("_CSETF-RDIS-COUNT-FILE"), makeSymbol("_CSETF-RDIS-RULES"), makeSymbol("_CSETF-RDIS-COUNTS"));

    private static final SubLSymbol RDIS_PRINT = makeSymbol("RDIS-PRINT");

    private static final SubLSymbol RULE_DISAMBIGUATOR_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("RULE-DISAMBIGUATOR-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list14 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("RULE-DISAMBIGUATOR-P"));

    private static final SubLSymbol RDIS_RULE_FILE = makeSymbol("RDIS-RULE-FILE");

    private static final SubLSymbol _CSETF_RDIS_RULE_FILE = makeSymbol("_CSETF-RDIS-RULE-FILE");

    private static final SubLSymbol RDIS_COUNT_FILE = makeSymbol("RDIS-COUNT-FILE");

    private static final SubLSymbol _CSETF_RDIS_COUNT_FILE = makeSymbol("_CSETF-RDIS-COUNT-FILE");

    private static final SubLSymbol RDIS_RULES = makeSymbol("RDIS-RULES");

    private static final SubLSymbol _CSETF_RDIS_RULES = makeSymbol("_CSETF-RDIS-RULES");

    private static final SubLSymbol RDIS_COUNTS = makeSymbol("RDIS-COUNTS");

    private static final SubLSymbol _CSETF_RDIS_COUNTS = makeSymbol("_CSETF-RDIS-COUNTS");

    private static final SubLString $str27$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_RULE_DISAMBIGUATOR = makeSymbol("MAKE-RULE-DISAMBIGUATOR");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_RULE_DISAMBIGUATOR_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-RULE-DISAMBIGUATOR-METHOD");

    private static final SubLString $str34$__RULE_DISAMBIGUATOR_ = makeString("#<RULE-DISAMBIGUATOR ");

    private static final SubLString $$$_ = makeString(" ");

    private static final SubLString $str36$_ = makeString(">");

    private static final SubLList $list37 = list(list(makeSymbol("BAG"), makeSymbol("WORD")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym38$CYCL = makeUninternedSymbol("CYCL");

    private static final SubLSymbol $sym39$GENL_CYCL = makeUninternedSymbol("GENL-CYCL");

    private static final SubLSymbol WORD_CYCLS = makeSymbol("WORD-CYCLS");

    private static final SubLSymbol CINC_HASH = makeSymbol("CINC-HASH");

    private static final SubLList $list44 = list(MINUS_ONE_INTEGER);

    private static final SubLSymbol GET_UPWARDS_CLOSURE = makeSymbol("GET-UPWARDS-CLOSURE");

    private static final SubLSymbol DOCUMENT_DISAMBIGUATE_RULE_DISAMBIGUATOR_METHOD = makeSymbol("DOCUMENT-DISAMBIGUATE-RULE-DISAMBIGUATOR-METHOD");

    private static final SubLSymbol DOCUMENT_P = makeSymbol("DOCUMENT-P");



    private static final SubLObject $const51$ContextuallyDependentLexicalMappi = reader_make_constant_shell("ContextuallyDependentLexicalMapping");

    private static final SubLString $str53$Can_t_load_rules_from__a = makeString("Can't load rules from ~a");

    private static final SubLString $str54$Can_t_load_counts_from__a = makeString("Can't load counts from ~a");

    private static final SubLInteger $int$1024 = makeInteger(1024);

    private static final SubLList $list56 = list(makeSymbol("?X"), makeSymbol("?Y"));



    private static final SubLList $list58 = list(new SubLObject[]{ makeKeyword("INFERENCE-MODE"), makeKeyword("SHALLOW"), makeKeyword("ALLOW-INDETERMINATE-RESULTS?"), NIL, makeKeyword("DISJUNCTION-FREE-EL-VARS-POLICY"), makeKeyword("COMPUTE-INTERSECTION"), makeKeyword("INTERMEDIATE-STEP-VALIDATION-LEVEL"), makeKeyword("MINIMAL"), makeKeyword("MAX-TIME"), makeInteger(57600), makeKeyword("PROBABLY-APPROXIMATELY-DONE"), makeDouble(1.0), makeKeyword("ANSWER-LANGUAGE"), makeKeyword("EL"), makeKeyword("CONTINUABLE?"), NIL });

    private static final SubLString $str59$data_word_sense_disambiguation_ru = makeString("data/word-sense-disambiguation-rules.txt");





    private static final SubLInteger $int$65536 = makeInteger(65536);

    private static final SubLString $str64$Unable_to_open__S = makeString("Unable to open ~S");

    private static final SubLString $str65$___ = makeString("(~%");

    private static final SubLString $str66$__S____S___ = makeString("(~S . ~S)~%");

    private static final SubLString $str67$___ = makeString(")~%");

    private static final SubLList $list69 = list(makeSymbol("?LICENSOR"));

    private static final SubLSymbol $kw72$ALLOW_INDETERMINATE_RESULTS_ = makeKeyword("ALLOW-INDETERMINATE-RESULTS?");

    private static final SubLSymbol $DISJUNCTION_FREE_EL_VARS_POLICY = makeKeyword("DISJUNCTION-FREE-EL-VARS-POLICY");

    private static final SubLSymbol $INTERMEDIATE_STEP_VALIDATION_LEVEL = makeKeyword("INTERMEDIATE-STEP-VALIDATION-LEVEL");

    private static final SubLInteger $int$57600 = makeInteger(57600);

    private static final SubLSymbol $PROBABLY_APPROXIMATELY_DONE = makeKeyword("PROBABLY-APPROXIMATELY-DONE");

    private static final SubLFloat $float$1_0 = makeDouble(1.0);

    private static final SubLString $str85$_tmp_ = makeString("/tmp/");

    private static final SubLString $str87$_a_is_invalid = makeString("~a is invalid");

    private static final SubLString $str88$Can_t_load__a___a = makeString("Can't load ~a: ~a");

    private static final SubLString $$$cdolist = makeString("cdolist");

    private static final SubLSymbol $IMAGE_INDEPENDENT_CFASL = makeKeyword("IMAGE-INDEPENDENT-CFASL");

    private static final SubLString $$$Iterating_over_FHT = makeString("Iterating over FHT");

    private static final SubLList $list93 = cons(makeSymbol("LICENSED?"), makeSymbol("TERM"));

    private static final SubLString $str94$don_t_know_how_to_convert__A = makeString("don't know how to convert ~A");

    private static final SubLString $str95$_A__A_ = makeString("~A,~A,");

    private static final SubLString $str96$_A_ = makeString("~A,");

    private static final SubLString $str97$__ = makeString("~%");

    private static final SubLList $list98 = list(makeKeyword("INTERMEDIATE-STEP-VALIDATION-LEVEL"), makeKeyword("MINIMAL"));

    private static final SubLString $$$mapping_Cyc_FORTs = makeString("mapping Cyc FORTs");

    private static final SubLString $str101$_host_george_term_id_lists_ = makeString("/host/george/term-id-lists/");

    private static final SubLString $str102$_host_george_disambig_rules_ = makeString("/host/george/disambig-rules/");

    private static final SubLString $str103$_Afort_id__4__0D_cfasl = makeString("~Afort-id-~4,'0D.cfasl");

    private static final SubLString $str104$_Adisambiguator_rule_file__4__0D_ = makeString("~Adisambiguator-rule-file-~4,'0D.txt");

    private static final SubLString $str105$created_using_CREATE_RULE_DISAMBI = makeString("created using CREATE-RULE-DISAMBIGUATION-CONDOR-JOBS in RULE-DISAMBIGUATION");

    private static final SubLString $str106$arguments______progn__load____hom = makeString("arguments = \"\'(progn (load \"\"/home/daves/cycl/rule-disambiguation.lisp\"\") (load-transcript-file \"\"/cyc/top/transcripts/0917/billie-20061025103022-21843-local-0-sent.ts\"\" nil :none) (load-transcript-file \"\"/cyc/top/transcripts/0917/billie-20061025103022-21843-local-1-sent.ts\"\" nil :none) (create-disambiguator-rules-file-from-fort-file-id ~A))\'\"~%");

    private static final SubLString $str107$queue____ = makeString("queue~%~%");

    public static final SubLObject with_new_rule_disambiguator_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt2);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject disambiguator = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt2);
                    disambiguator = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return listS(CLET, list(bq_cons(disambiguator, $list_alt4)), append(body, list(list(FINALIZE_RULE_DISAMBIGUATOR, disambiguator))));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt2);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject with_new_rule_disambiguator(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list2);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject disambiguator = NIL;
        destructuring_bind_must_consp(current, datum, $list2);
        disambiguator = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(CLET, list(bq_cons(disambiguator, $list4)), append(body, list(list(FINALIZE_RULE_DISAMBIGUATOR, disambiguator))));
        }
        cdestructuring_bind_error(datum, $list2);
        return NIL;
    }

    public static final SubLObject rule_disambiguator_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        rdis_print(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject rule_disambiguator_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        rdis_print(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject rule_disambiguator_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.rule_disambiguation.$rule_disambiguator_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject rule_disambiguator_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.rule_disambiguation.$rule_disambiguator_native.class ? T : NIL;
    }

    public static final SubLObject rdis_rule_file_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, RULE_DISAMBIGUATOR_P);
        return v_object.getField2();
    }

    public static SubLObject rdis_rule_file(final SubLObject v_object) {
        assert NIL != rule_disambiguator_p(v_object) : "! rule_disambiguation.rule_disambiguator_p(v_object) " + "rule_disambiguation.rule_disambiguator_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject rdis_count_file_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, RULE_DISAMBIGUATOR_P);
        return v_object.getField3();
    }

    public static SubLObject rdis_count_file(final SubLObject v_object) {
        assert NIL != rule_disambiguator_p(v_object) : "! rule_disambiguation.rule_disambiguator_p(v_object) " + "rule_disambiguation.rule_disambiguator_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject rdis_rules_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, RULE_DISAMBIGUATOR_P);
        return v_object.getField4();
    }

    public static SubLObject rdis_rules(final SubLObject v_object) {
        assert NIL != rule_disambiguator_p(v_object) : "! rule_disambiguation.rule_disambiguator_p(v_object) " + "rule_disambiguation.rule_disambiguator_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject rdis_counts_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, RULE_DISAMBIGUATOR_P);
        return v_object.getField5();
    }

    public static SubLObject rdis_counts(final SubLObject v_object) {
        assert NIL != rule_disambiguator_p(v_object) : "! rule_disambiguation.rule_disambiguator_p(v_object) " + "rule_disambiguation.rule_disambiguator_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject _csetf_rdis_rule_file_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, RULE_DISAMBIGUATOR_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_rdis_rule_file(final SubLObject v_object, final SubLObject value) {
        assert NIL != rule_disambiguator_p(v_object) : "! rule_disambiguation.rule_disambiguator_p(v_object) " + "rule_disambiguation.rule_disambiguator_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_rdis_count_file_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, RULE_DISAMBIGUATOR_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_rdis_count_file(final SubLObject v_object, final SubLObject value) {
        assert NIL != rule_disambiguator_p(v_object) : "! rule_disambiguation.rule_disambiguator_p(v_object) " + "rule_disambiguation.rule_disambiguator_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_rdis_rules_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, RULE_DISAMBIGUATOR_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_rdis_rules(final SubLObject v_object, final SubLObject value) {
        assert NIL != rule_disambiguator_p(v_object) : "! rule_disambiguation.rule_disambiguator_p(v_object) " + "rule_disambiguation.rule_disambiguator_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_rdis_counts_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, RULE_DISAMBIGUATOR_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_rdis_counts(final SubLObject v_object, final SubLObject value) {
        assert NIL != rule_disambiguator_p(v_object) : "! rule_disambiguation.rule_disambiguator_p(v_object) " + "rule_disambiguation.rule_disambiguator_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject make_rule_disambiguator_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.rule_disambiguation.$rule_disambiguator_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($RULE_FILE)) {
                        _csetf_rdis_rule_file(v_new, current_value);
                    } else {
                        if (pcase_var.eql($COUNT_FILE)) {
                            _csetf_rdis_count_file(v_new, current_value);
                        } else {
                            if (pcase_var.eql($RULES)) {
                                _csetf_rdis_rules(v_new, current_value);
                            } else {
                                if (pcase_var.eql($COUNTS)) {
                                    _csetf_rdis_counts(v_new, current_value);
                                } else {
                                    Errors.error($str_alt26$Invalid_slot__S_for_construction_, current_arg);
                                }
                            }
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_rule_disambiguator(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.rule_disambiguation.$rule_disambiguator_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($RULE_FILE)) {
                _csetf_rdis_rule_file(v_new, current_value);
            } else
                if (pcase_var.eql($COUNT_FILE)) {
                    _csetf_rdis_count_file(v_new, current_value);
                } else
                    if (pcase_var.eql($RULES)) {
                        _csetf_rdis_rules(v_new, current_value);
                    } else
                        if (pcase_var.eql($COUNTS)) {
                            _csetf_rdis_counts(v_new, current_value);
                        } else {
                            Errors.error($str27$Invalid_slot__S_for_construction_, current_arg);
                        }



        }
        return v_new;
    }

    public static SubLObject visit_defstruct_rule_disambiguator(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_RULE_DISAMBIGUATOR, FOUR_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $RULE_FILE, rdis_rule_file(obj));
        funcall(visitor_fn, obj, $SLOT, $COUNT_FILE, rdis_count_file(obj));
        funcall(visitor_fn, obj, $SLOT, $RULES, rdis_rules(obj));
        funcall(visitor_fn, obj, $SLOT, $COUNTS, rdis_counts(obj));
        funcall(visitor_fn, obj, $END, MAKE_RULE_DISAMBIGUATOR, FOUR_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_rule_disambiguator_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_rule_disambiguator(obj, visitor_fn);
    }

    /**
     * returns a new rule-disambiguator using the rules in PATH
     */
    @LispMethod(comment = "returns a new rule-disambiguator using the rules in PATH")
    public static final SubLObject new_rule_disambiguator_alt(SubLObject rulepath, SubLObject countpath) {
        if (rulepath == UNPROVIDED) {
            rulepath = $word_sense_disambiguation_rule_file$.getDynamicValue();
        }
        if (countpath == UNPROVIDED) {
            countpath = $word_sense_disambiguation_count_file$.getDynamicValue();
        }
        SubLTrampolineFile.checkType(rulepath, STRINGP);
        SubLTrampolineFile.checkType(countpath, STRINGP);
        {
            SubLObject dis = make_rule_disambiguator(UNPROVIDED);
            _csetf_rdis_rule_file(dis, rulepath);
            _csetf_rdis_rules(dis, load_disambiguator_rules(rulepath));
            _csetf_rdis_count_file(dis, countpath);
            _csetf_rdis_counts(dis, load_disambiguator_counts(countpath));
            return dis;
        }
    }

    /**
     * returns a new rule-disambiguator using the rules in PATH
     */
    @LispMethod(comment = "returns a new rule-disambiguator using the rules in PATH")
    public static SubLObject new_rule_disambiguator(SubLObject rulepath, SubLObject countpath) {
        if (rulepath == UNPROVIDED) {
            rulepath = $word_sense_disambiguation_rule_file$.getDynamicValue();
        }
        if (countpath == UNPROVIDED) {
            countpath = $word_sense_disambiguation_count_file$.getDynamicValue();
        }
        assert NIL != stringp(rulepath) : "! stringp(rulepath) " + ("Types.stringp(rulepath) " + "CommonSymbols.NIL != Types.stringp(rulepath) ") + rulepath;
        assert NIL != stringp(countpath) : "! stringp(countpath) " + ("Types.stringp(countpath) " + "CommonSymbols.NIL != Types.stringp(countpath) ") + countpath;
        final SubLObject dis = make_rule_disambiguator(UNPROVIDED);
        _csetf_rdis_rule_file(dis, rulepath);
        _csetf_rdis_rules(dis, load_disambiguator_rules(rulepath));
        _csetf_rdis_count_file(dis, countpath);
        _csetf_rdis_counts(dis, load_disambiguator_counts(countpath));
        return dis;
    }

    /**
     * frees all resources of disambiguator RDIS
     */
    @LispMethod(comment = "frees all resources of disambiguator RDIS")
    public static final SubLObject finalize_rule_disambiguator_alt(SubLObject rdis) {
        SubLTrampolineFile.checkType(rdis, RULE_DISAMBIGUATOR_P);
        file_backed_cache.file_backed_cache_finalize(rdis_rules(rdis));
        file_backed_cache.file_backed_cache_finalize(rdis_counts(rdis));
        return T;
    }

    /**
     * frees all resources of disambiguator RDIS
     */
    @LispMethod(comment = "frees all resources of disambiguator RDIS")
    public static SubLObject finalize_rule_disambiguator(final SubLObject rdis) {
        assert NIL != rule_disambiguator_p(rdis) : "! rule_disambiguation.rule_disambiguator_p(rdis) " + ("rule_disambiguation.rule_disambiguator_p(rdis) " + "CommonSymbols.NIL != rule_disambiguation.rule_disambiguator_p(rdis) ") + rdis;
        file_backed_cache.file_backed_cache_finalize(rdis_rules(rdis));
        file_backed_cache.file_backed_cache_finalize(rdis_counts(rdis));
        return T;
    }

    /**
     * prints RDIS to STREAM, ignoring DEPTH
     */
    @LispMethod(comment = "prints RDIS to STREAM, ignoring DEPTH")
    public static final SubLObject rdis_print_alt(SubLObject rdis, SubLObject stream, SubLObject depth) {
        write_string($str_alt28$__RULE_DISAMBIGUATOR_, stream, UNPROVIDED, UNPROVIDED);
        write_string(rdis_rule_file(rdis), stream, UNPROVIDED, UNPROVIDED);
        write_string($str_alt29$_, stream, UNPROVIDED, UNPROVIDED);
        write_string(rdis_count_file(rdis), stream, UNPROVIDED, UNPROVIDED);
        write_string($str_alt30$_, stream, UNPROVIDED, UNPROVIDED);
        return rdis;
    }

    /**
     * prints RDIS to STREAM, ignoring DEPTH
     */
    @LispMethod(comment = "prints RDIS to STREAM, ignoring DEPTH")
    public static SubLObject rdis_print(final SubLObject rdis, final SubLObject stream, final SubLObject depth) {
        write_string($str34$__RULE_DISAMBIGUATOR_, stream, UNPROVIDED, UNPROVIDED);
        write_string(rdis_rule_file(rdis), stream, UNPROVIDED, UNPROVIDED);
        write_string($$$_, stream, UNPROVIDED, UNPROVIDED);
        write_string(rdis_count_file(rdis), stream, UNPROVIDED, UNPROVIDED);
        write_string($str36$_, stream, UNPROVIDED, UNPROVIDED);
        return rdis;
    }

    /**
     * Don't use any of the senses that were added to bag because of this word.  Expected to be used
     * when disambiguating WORD.
     */
    @LispMethod(comment = "Don\'t use any of the senses that were added to bag because of this word.  Expected to be used\r\nwhen disambiguating WORD.\nDon\'t use any of the senses that were added to bag because of this word.  Expected to be used\nwhen disambiguating WORD.")
    public static final SubLObject with_sense_bag_excepting_word_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt31);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject v_bag = NIL;
                    SubLObject word = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt31);
                    v_bag = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt31);
                    word = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            SubLObject cycl = $sym32$CYCL;
                            SubLObject genl_cycl = $sym33$GENL_CYCL;
                            return listS(PROGN, list(CDOLIST, list(cycl, list(WORD_CYCLS, word)), listS(CINC_HASH, cycl, v_bag, $list_alt38), list(CDOLIST, list(genl_cycl, list(GET_UPWARDS_CLOSURE, cycl)), listS(CINC_HASH, genl_cycl, v_bag, $list_alt38))), append(body, list(list(CDOLIST, list(cycl, list(WORD_CYCLS, word)), list(CINC_HASH, cycl, v_bag), list(CDOLIST, list(genl_cycl, list(GET_UPWARDS_CLOSURE, cycl)), list(CINC_HASH, genl_cycl, v_bag))))));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt31);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Don't use any of the senses that were added to bag because of this word.  Expected to be used
     * when disambiguating WORD.
     */
    @LispMethod(comment = "Don\'t use any of the senses that were added to bag because of this word.  Expected to be used\r\nwhen disambiguating WORD.\nDon\'t use any of the senses that were added to bag because of this word.  Expected to be used\nwhen disambiguating WORD.")
    public static SubLObject with_sense_bag_excepting_word(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list37);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject v_bag = NIL;
        SubLObject word = NIL;
        destructuring_bind_must_consp(current, datum, $list37);
        v_bag = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list37);
        word = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject cycl = $sym38$CYCL;
            final SubLObject genl_cycl = $sym39$GENL_CYCL;
            return listS(PROGN, list(CDOLIST, list(cycl, list(WORD_CYCLS, word)), listS(CINC_HASH, cycl, v_bag, $list44), list(CDOLIST, list(genl_cycl, list(GET_UPWARDS_CLOSURE, cycl)), listS(CINC_HASH, genl_cycl, v_bag, $list44))), append(body, list(list(CDOLIST, list(cycl, list(WORD_CYCLS, word)), list(CINC_HASH, cycl, v_bag), list(CDOLIST, list(genl_cycl, list(GET_UPWARDS_CLOSURE, cycl)), list(CINC_HASH, genl_cycl, v_bag))))));
        }
        cdestructuring_bind_error(datum, $list37);
        return NIL;
    }

    public static SubLObject document_disambiguate_rule_disambiguator_method(final SubLObject disambiguator, final SubLObject doc, SubLObject v_context) {
        if (v_context == UNPROVIDED) {
            v_context = new_sense_bag(doc);
        }
        return rdis_disambiguate(disambiguator, doc, v_context);
    }

    /**
     * disambiguates each word in DOC by discarding senses that aren't licensed by sense set CONTEXT
     */
    @LispMethod(comment = "disambiguates each word in DOC by discarding senses that aren\'t licensed by sense set CONTEXT")
    public static final SubLObject rdis_disambiguate_alt(SubLObject rdis, SubLObject doc, SubLObject v_context) {
        if (v_context == UNPROVIDED) {
            v_context = new_sense_bag(doc);
        }
        SubLTrampolineFile.checkType(rdis, RULE_DISAMBIGUATOR_P);
        SubLTrampolineFile.checkType(doc, DOCUMENT_P);
        SubLTrampolineFile.checkType(v_context, HASH_TABLE_P);
        {
            SubLObject vector_var = document.document_paragraphs(doc);
            SubLObject backwardP_var = NIL;
            SubLObject length = length(vector_var);
            SubLObject v_iteration = NIL;
            for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                {
                    SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                    SubLObject paragraph = aref(vector_var, element_num);
                    SubLObject vector_var_1 = document.paragraph_sentences(paragraph);
                    SubLObject backwardP_var_2 = NIL;
                    SubLObject length_3 = length(vector_var_1);
                    SubLObject v_iteration_4 = NIL;
                    for (v_iteration_4 = ZERO_INTEGER; v_iteration_4.numL(length_3); v_iteration_4 = add(v_iteration_4, ONE_INTEGER)) {
                        {
                            SubLObject element_num_5 = (NIL != backwardP_var_2) ? ((SubLObject) (subtract(length_3, v_iteration_4, ONE_INTEGER))) : v_iteration_4;
                            SubLObject sentence = aref(vector_var_1, element_num_5);
                            SubLObject vector_var_6 = document.sentence_yield(sentence);
                            SubLObject backwardP_var_7 = NIL;
                            SubLObject length_8 = length(vector_var_6);
                            SubLObject v_iteration_9 = NIL;
                            for (v_iteration_9 = ZERO_INTEGER; v_iteration_9.numL(length_8); v_iteration_9 = add(v_iteration_9, ONE_INTEGER)) {
                                {
                                    SubLObject element_num_10 = (NIL != backwardP_var_7) ? ((SubLObject) (subtract(length_8, v_iteration_9, ONE_INTEGER))) : v_iteration_9;
                                    SubLObject word = aref(vector_var_6, element_num_10);
                                    {
                                        SubLObject cdolist_list_var = document.word_cycls(word);
                                        SubLObject cycl = NIL;
                                        for (cycl = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cycl = cdolist_list_var.first()) {
                                            hash_table_utilities.cinc_hash(cycl, v_context, MINUS_ONE_INTEGER, UNPROVIDED);
                                            {
                                                SubLObject cdolist_list_var_11 = document_annotation_widgets.get_upwards_closure(cycl);
                                                SubLObject genl_cycl = NIL;
                                                for (genl_cycl = cdolist_list_var_11.first(); NIL != cdolist_list_var_11; cdolist_list_var_11 = cdolist_list_var_11.rest() , genl_cycl = cdolist_list_var_11.first()) {
                                                    hash_table_utilities.cinc_hash(genl_cycl, v_context, MINUS_ONE_INTEGER, UNPROVIDED);
                                                }
                                            }
                                        }
                                    }
                                    {
                                        SubLObject sense_markers = document.word_interps(word);
                                        SubLObject new_senses = NIL;
                                        SubLObject cdolist_list_var = sense_markers;
                                        SubLObject sense_marker = NIL;
                                        for (sense_marker = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sense_marker = cdolist_list_var.first()) {
                                            if (NIL != is_licensed_p(sense_marker, rdis_rules(rdis), v_context)) {
                                                new_senses = cons(sense_marker, new_senses);
                                            }
                                        }
                                        if (NIL == new_senses) {
                                            new_senses = sense_markers_not_requiring_licensing(rule_void(sense_markers, rdis_rules(rdis)));
                                        }
                                        putf(document.word_info(word), $INTERPS, new_senses);
                                    }
                                    {
                                        SubLObject cdolist_list_var = document.word_cycls(word);
                                        SubLObject cycl = NIL;
                                        for (cycl = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cycl = cdolist_list_var.first()) {
                                            hash_table_utilities.cinc_hash(cycl, v_context, UNPROVIDED, UNPROVIDED);
                                            {
                                                SubLObject cdolist_list_var_12 = document_annotation_widgets.get_upwards_closure(cycl);
                                                SubLObject genl_cycl = NIL;
                                                for (genl_cycl = cdolist_list_var_12.first(); NIL != cdolist_list_var_12; cdolist_list_var_12 = cdolist_list_var_12.rest() , genl_cycl = cdolist_list_var_12.first()) {
                                                    hash_table_utilities.cinc_hash(genl_cycl, v_context, UNPROVIDED, UNPROVIDED);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return doc;
    }

    /**
     * disambiguates each word in DOC by discarding senses that aren't licensed by sense set CONTEXT
     */
    @LispMethod(comment = "disambiguates each word in DOC by discarding senses that aren\'t licensed by sense set CONTEXT")
    public static SubLObject rdis_disambiguate(final SubLObject rdis, final SubLObject doc, SubLObject v_context) {
        if (v_context == UNPROVIDED) {
            v_context = new_sense_bag(doc);
        }
        assert NIL != rule_disambiguator_p(rdis) : "! rule_disambiguation.rule_disambiguator_p(rdis) " + ("rule_disambiguation.rule_disambiguator_p(rdis) " + "CommonSymbols.NIL != rule_disambiguation.rule_disambiguator_p(rdis) ") + rdis;
        assert NIL != document.document_p(doc) : "! document.document_p(doc) " + ("document.document_p(doc) " + "CommonSymbols.NIL != document.document_p(doc) ") + doc;
        assert NIL != hash_table_p(v_context) : "! hash_table_p(v_context) " + ("Types.hash_table_p(v_context) " + "CommonSymbols.NIL != Types.hash_table_p(v_context) ") + v_context;
        final SubLObject vector_var = document.document_paragraphs(doc);
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject paragraph;
        SubLObject vector_var_$1;
        SubLObject backwardP_var_$2;
        SubLObject length_$3;
        SubLObject v_iteration_$4;
        SubLObject element_num_$5;
        SubLObject sentence;
        SubLObject cdolist_list_var;
        SubLObject word;
        SubLObject cdolist_list_var_$6;
        SubLObject cycl;
        SubLObject cdolist_list_var_$7;
        SubLObject genl_cycl;
        SubLObject sense_markers;
        SubLObject new_senses;
        SubLObject cdolist_list_var_$8;
        SubLObject sense_marker;
        SubLObject cdolist_list_var_$9;
        SubLObject cdolist_list_var_$10;
        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
            element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
            paragraph = aref(vector_var, element_num);
            vector_var_$1 = document.paragraph_sentences(paragraph);
            backwardP_var_$2 = NIL;
            for (length_$3 = length(vector_var_$1), v_iteration_$4 = NIL, v_iteration_$4 = ZERO_INTEGER; v_iteration_$4.numL(length_$3); v_iteration_$4 = add(v_iteration_$4, ONE_INTEGER)) {
                element_num_$5 = (NIL != backwardP_var_$2) ? subtract(length_$3, v_iteration_$4, ONE_INTEGER) : v_iteration_$4;
                sentence = aref(vector_var_$1, element_num_$5);
                cdolist_list_var = document.sentence_yield_exhaustive(sentence);
                word = NIL;
                word = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    cdolist_list_var_$6 = document.word_cycls(word);
                    cycl = NIL;
                    cycl = cdolist_list_var_$6.first();
                    while (NIL != cdolist_list_var_$6) {
                        hash_table_utilities.cinc_hash(cycl, v_context, MINUS_ONE_INTEGER, UNPROVIDED);
                        cdolist_list_var_$7 = document_annotation_widgets.get_upwards_closure(cycl);
                        genl_cycl = NIL;
                        genl_cycl = cdolist_list_var_$7.first();
                        while (NIL != cdolist_list_var_$7) {
                            hash_table_utilities.cinc_hash(genl_cycl, v_context, MINUS_ONE_INTEGER, UNPROVIDED);
                            cdolist_list_var_$7 = cdolist_list_var_$7.rest();
                            genl_cycl = cdolist_list_var_$7.first();
                        } 
                        cdolist_list_var_$6 = cdolist_list_var_$6.rest();
                        cycl = cdolist_list_var_$6.first();
                    } 
                    sense_markers = document.word_interps(word);
                    new_senses = NIL;
                    cdolist_list_var_$8 = sense_markers;
                    sense_marker = NIL;
                    sense_marker = cdolist_list_var_$8.first();
                    while (NIL != cdolist_list_var_$8) {
                        if (NIL != is_licensed_p(sense_marker, rdis_rules(rdis), v_context)) {
                            new_senses = cons(sense_marker, new_senses);
                        }
                        cdolist_list_var_$8 = cdolist_list_var_$8.rest();
                        sense_marker = cdolist_list_var_$8.first();
                    } 
                    if (NIL == new_senses) {
                        new_senses = sense_markers_not_requiring_licensing(rule_void(sense_markers, rdis_rules(rdis)));
                    }
                    putf(document.word_info(word), $INTERPS, new_senses);
                    cdolist_list_var_$9 = document.word_cycls(word);
                    cycl = NIL;
                    cycl = cdolist_list_var_$9.first();
                    while (NIL != cdolist_list_var_$9) {
                        hash_table_utilities.cinc_hash(cycl, v_context, UNPROVIDED, UNPROVIDED);
                        cdolist_list_var_$10 = document_annotation_widgets.get_upwards_closure(cycl);
                        genl_cycl = NIL;
                        genl_cycl = cdolist_list_var_$10.first();
                        while (NIL != cdolist_list_var_$10) {
                            hash_table_utilities.cinc_hash(genl_cycl, v_context, UNPROVIDED, UNPROVIDED);
                            cdolist_list_var_$10 = cdolist_list_var_$10.rest();
                            genl_cycl = cdolist_list_var_$10.first();
                        } 
                        cdolist_list_var_$9 = cdolist_list_var_$9.rest();
                        cycl = cdolist_list_var_$9.first();
                    } 
                    cdolist_list_var = cdolist_list_var.rest();
                    word = cdolist_list_var.first();
                } 
            }
        }
        return doc;
    }

    public static final SubLObject sense_markers_not_requiring_licensing_alt(SubLObject sense_markers) {
        {
            SubLObject valid_markers = NIL;
            SubLObject cdolist_list_var = sense_markers;
            SubLObject sense_marker = NIL;
            for (sense_marker = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sense_marker = cdolist_list_var.first()) {
                if (!((NIL != list_utilities.tree_find($$VanishinglyRareLexicalMapping, nl_api_datastructures.get_nl_interp_pragmatics(sense_marker), UNPROVIDED, UNPROVIDED)) || (NIL != list_utilities.tree_find($const44$ContextuallyDependentLexicalMappi, nl_api_datastructures.get_nl_interp_pragmatics(sense_marker), UNPROVIDED, UNPROVIDED)))) {
                    valid_markers = cons(sense_marker, valid_markers);
                }
            }
            return valid_markers;
        }
    }

    public static SubLObject sense_markers_not_requiring_licensing(final SubLObject sense_markers) {
        SubLObject valid_markers = NIL;
        SubLObject cdolist_list_var = sense_markers;
        SubLObject sense_marker = NIL;
        sense_marker = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL == list_utilities.tree_find($$VanishinglyRareLexicalMapping, nl_api_datastructures.get_nl_interp_pragmatics(sense_marker), UNPROVIDED, UNPROVIDED)) && (NIL == list_utilities.tree_find($const51$ContextuallyDependentLexicalMappi, nl_api_datastructures.get_nl_interp_pragmatics(sense_marker), UNPROVIDED, UNPROVIDED))) {
                valid_markers = cons(sense_marker, valid_markers);
            }
            cdolist_list_var = cdolist_list_var.rest();
            sense_marker = cdolist_list_var.first();
        } 
        return valid_markers;
    }

    /**
     * returns those sense markers in SENSE-MARKERS that don't have a rule in RULES
     */
    @LispMethod(comment = "returns those sense markers in SENSE-MARKERS that don\'t have a rule in RULES")
    public static final SubLObject rule_void_alt(SubLObject sense_markers, SubLObject rules) {
        {
            SubLObject rule_void = NIL;
            SubLObject cdolist_list_var = sense_markers;
            SubLObject sense_marker = NIL;
            for (sense_marker = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sense_marker = cdolist_list_var.first()) {
                if (file_backed_cache.file_backed_cache_lookup(sense_marker, rules, UNPROVIDED, UNPROVIDED) == $NOT_FOUND) {
                    rule_void = cons(sense_marker, rule_void);
                }
            }
            return rule_void;
        }
    }

    /**
     * returns those sense markers in SENSE-MARKERS that don't have a rule in RULES
     */
    @LispMethod(comment = "returns those sense markers in SENSE-MARKERS that don\'t have a rule in RULES")
    public static SubLObject rule_void(final SubLObject sense_markers, final SubLObject rules) {
        SubLObject rule_void = NIL;
        SubLObject cdolist_list_var = sense_markers;
        SubLObject sense_marker = NIL;
        sense_marker = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (file_backed_cache.file_backed_cache_lookup(sense_marker, rules, UNPROVIDED, UNPROVIDED) == $NOT_FOUND) {
                rule_void = cons(sense_marker, rule_void);
            }
            cdolist_list_var = cdolist_list_var.rest();
            sense_marker = cdolist_list_var.first();
        } 
        return rule_void;
    }

    /**
     * returns a file hash table connected to PATH
     */
    @LispMethod(comment = "returns a file hash table connected to PATH")
    public static final SubLObject load_disambiguator_rules_alt(SubLObject path) {
        if (NIL == Filesys.probe_file(path)) {
            Errors.error($str_alt46$Can_t_load_rules_from__a, path);
        }
        return file_backed_cache.file_backed_cache_create(path, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * returns a file hash table connected to PATH
     */
    @LispMethod(comment = "returns a file hash table connected to PATH")
    public static SubLObject load_disambiguator_rules(final SubLObject path) {
        if (NIL == Filesys.probe_file(path)) {
            Errors.error($str53$Can_t_load_rules_from__a, path);
        }
        return file_backed_cache.file_backed_cache_create(path, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * returns a file hash table connected to PATH
     */
    @LispMethod(comment = "returns a file hash table connected to PATH")
    public static final SubLObject load_disambiguator_counts_alt(SubLObject path) {
        if (NIL == Filesys.probe_file(path)) {
            Errors.error($str_alt47$Can_t_load_counts_from__a, path);
        }
        return file_backed_cache.file_backed_cache_create(path, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * returns a file hash table connected to PATH
     */
    @LispMethod(comment = "returns a file hash table connected to PATH")
    public static SubLObject load_disambiguator_counts(final SubLObject path) {
        if (NIL == Filesys.probe_file(path)) {
            Errors.error($str54$Can_t_load_counts_from__a, path);
        }
        return file_backed_cache.file_backed_cache_create(path, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * returns the subset of SENSE-MARKERS with the highest counts according to table COUNTS
     *
     * @unknown that SENSE-MARKERS as used in this file are instances of nl-interpretation-p
     */
    @LispMethod(comment = "returns the subset of SENSE-MARKERS with the highest counts according to table COUNTS\r\n\r\n@unknown that SENSE-MARKERS as used in this file are instances of nl-interpretation-p")
    public static final SubLObject highest_count_sense_markers_alt(SubLObject sense_markers, SubLObject counts) {
        {
            SubLObject max_count = ZERO_INTEGER;
            SubLObject highest_count_sense_markers = NIL;
            SubLObject count = NIL;
            SubLObject cdolist_list_var = sense_markers;
            SubLObject sense_marker = NIL;
            for (sense_marker = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sense_marker = cdolist_list_var.first()) {
                count = file_backed_cache.file_backed_cache_lookup(nl_api_datastructures.get_nl_interp_cycl(sense_marker), counts, ZERO_INTEGER, UNPROVIDED);
                if (count.numG(max_count)) {
                    max_count = count;
                    highest_count_sense_markers = list(sense_marker);
                } else {
                    if (count.numE(max_count)) {
                        highest_count_sense_markers = cons(sense_marker, highest_count_sense_markers);
                    }
                }
            }
            return nreverse(highest_count_sense_markers);
        }
    }

    /**
     * returns the subset of SENSE-MARKERS with the highest counts according to table COUNTS
     *
     * @unknown that SENSE-MARKERS as used in this file are instances of nl-interpretation-p
     */
    @LispMethod(comment = "returns the subset of SENSE-MARKERS with the highest counts according to table COUNTS\r\n\r\n@unknown that SENSE-MARKERS as used in this file are instances of nl-interpretation-p")
    public static SubLObject highest_count_sense_markers(final SubLObject sense_markers, final SubLObject counts) {
        SubLObject max_count = ZERO_INTEGER;
        SubLObject highest_count_sense_markers = NIL;
        SubLObject count = NIL;
        SubLObject cdolist_list_var = sense_markers;
        SubLObject sense_marker = NIL;
        sense_marker = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            count = file_backed_cache.file_backed_cache_lookup(nl_api_datastructures.get_nl_interp_cycl(sense_marker), counts, ZERO_INTEGER, UNPROVIDED);
            if (count.numG(max_count)) {
                max_count = count;
                highest_count_sense_markers = list(sense_marker);
            } else
                if (count.numE(max_count)) {
                    highest_count_sense_markers = cons(sense_marker, highest_count_sense_markers);
                }

            cdolist_list_var = cdolist_list_var.rest();
            sense_marker = cdolist_list_var.first();
        } 
        return nreverse(highest_count_sense_markers);
    }

    /**
     * returns t if WORD has more than one sense associated with it, nil otherwise
     */
    @LispMethod(comment = "returns t if WORD has more than one sense associated with it, nil otherwise")
    public static final SubLObject ambiguous_p_alt(SubLObject word) {
        return numG(length(document.word_interps(word)), ONE_INTEGER);
    }

    /**
     * returns t if WORD has more than one sense associated with it, nil otherwise
     */
    @LispMethod(comment = "returns t if WORD has more than one sense associated with it, nil otherwise")
    public static SubLObject ambiguous_p(final SubLObject word) {
        return numG(length(document.word_interps(word)), ONE_INTEGER);
    }

    /**
     * return t if SENSE-MARKER is licensed according the RULES and CONTEXT
     */
    @LispMethod(comment = "return t if SENSE-MARKER is licensed according the RULES and CONTEXT")
    public static final SubLObject is_licensed_p_alt(SubLObject sense_marker, SubLObject rules, SubLObject v_context) {
        {
            SubLObject sense = nl_api_datastructures.get_nl_interp_cycl(sense_marker);
            SubLObject rule = file_backed_cache.file_backed_cache_lookup(sense, rules, NIL, UNPROVIDED);
            SubLObject is_licensed = NIL;
            SubLObject not_licensed = NIL;
            SubLObject v_term = NIL;
            if (NIL == is_licensed) {
                {
                    SubLObject csome_list_var = rule;
                    SubLObject clause = NIL;
                    for (clause = csome_list_var.first(); !((NIL != is_licensed) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , clause = csome_list_var.first()) {
                        if (NIL != positive_clause_p(clause)) {
                            v_term = clause_term(clause);
                            is_licensed = makeBoolean((NIL != is_licensed) || (NIL != sense_bag_licensesP(v_term, v_context)));
                        }
                    }
                }
            }
            if (NIL != is_licensed) {
                if (NIL == not_licensed) {
                    {
                        SubLObject csome_list_var = rule;
                        SubLObject clause = NIL;
                        for (clause = csome_list_var.first(); !((NIL != not_licensed) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , clause = csome_list_var.first()) {
                            if (NIL != negative_clause_p(clause)) {
                                v_term = clause_term(clause);
                                is_licensed = makeBoolean((NIL != is_licensed) && (NIL == sense_bag_licensesP(v_term, v_context)));
                                not_licensed = makeBoolean(NIL == is_licensed);
                            }
                        }
                    }
                }
            }
            return is_licensed;
        }
    }

    /**
     * return t if SENSE-MARKER is licensed according the RULES and CONTEXT
     */
    @LispMethod(comment = "return t if SENSE-MARKER is licensed according the RULES and CONTEXT")
    public static SubLObject is_licensed_p(final SubLObject sense_marker, final SubLObject rules, final SubLObject v_context) {
        final SubLObject sense = nl_api_datastructures.get_nl_interp_cycl(sense_marker);
        final SubLObject rule = file_backed_cache.file_backed_cache_lookup(sense, rules, NIL, UNPROVIDED);
        SubLObject is_licensed = NIL;
        SubLObject not_licensed = NIL;
        SubLObject v_term = NIL;
        if (NIL == is_licensed) {
            SubLObject csome_list_var = rule;
            SubLObject clause = NIL;
            clause = csome_list_var.first();
            while ((NIL == is_licensed) && (NIL != csome_list_var)) {
                if (NIL != positive_clause_p(clause)) {
                    v_term = clause_term(clause);
                    is_licensed = makeBoolean((NIL != is_licensed) || (NIL != sense_bag_licensesP(v_term, v_context)));
                }
                csome_list_var = csome_list_var.rest();
                clause = csome_list_var.first();
            } 
        }
        if ((NIL != is_licensed) && (NIL == not_licensed)) {
            SubLObject csome_list_var = rule;
            SubLObject clause = NIL;
            clause = csome_list_var.first();
            while ((NIL == not_licensed) && (NIL != csome_list_var)) {
                if (NIL != negative_clause_p(clause)) {
                    v_term = clause_term(clause);
                    is_licensed = makeBoolean((NIL != is_licensed) && (NIL == sense_bag_licensesP(v_term, v_context)));
                    not_licensed = makeBoolean(NIL == is_licensed);
                }
                csome_list_var = csome_list_var.rest();
                clause = csome_list_var.first();
            } 
        }
        return is_licensed;
    }

    /**
     * returns t iff CLAUSE is a positive clause
     */
    @LispMethod(comment = "returns t iff CLAUSE is a positive clause")
    public static final SubLObject positive_clause_p_alt(SubLObject clause) {
        return clause_sign(clause);
    }

    /**
     * returns t iff CLAUSE is a positive clause
     */
    @LispMethod(comment = "returns t iff CLAUSE is a positive clause")
    public static SubLObject positive_clause_p(final SubLObject clause) {
        return clause_sign(clause);
    }

    /**
     * returns t iff CLAUSE is a negative clause
     */
    @LispMethod(comment = "returns t iff CLAUSE is a negative clause")
    public static final SubLObject negative_clause_p_alt(SubLObject clause) {
        return makeBoolean(NIL == clause_sign(clause));
    }

    /**
     * returns t iff CLAUSE is a negative clause
     */
    @LispMethod(comment = "returns t iff CLAUSE is a negative clause")
    public static SubLObject negative_clause_p(final SubLObject clause) {
        return makeBoolean(NIL == clause_sign(clause));
    }

    /**
     * returns the sign of CLAUSE
     */
    @LispMethod(comment = "returns the sign of CLAUSE")
    public static final SubLObject clause_sign_alt(SubLObject clause) {
        return clause.first();
    }

    /**
     * returns the sign of CLAUSE
     */
    @LispMethod(comment = "returns the sign of CLAUSE")
    public static SubLObject clause_sign(final SubLObject clause) {
        return clause.first();
    }

    /**
     * returns the term of CLAUSE
     */
    @LispMethod(comment = "returns the term of CLAUSE")
    public static final SubLObject clause_term_alt(SubLObject clause) {
        return clause.rest();
    }

    /**
     * returns the term of CLAUSE
     */
    @LispMethod(comment = "returns the term of CLAUSE")
    public static SubLObject clause_term(final SubLObject clause) {
        return clause.rest();
    }

    /**
     * returns a set containing all senses in DOC
     */
    @LispMethod(comment = "returns a set containing all senses in DOC")
    public static final SubLObject new_sense_bag_alt(SubLObject doc) {
        SubLTrampolineFile.checkType(doc, DOCUMENT_P);
        {
            SubLObject senses = make_hash_table($int$1024, EQUAL, UNPROVIDED);
            SubLObject sense = NIL;
            SubLObject vector_var = document.document_paragraphs(doc);
            SubLObject backwardP_var = NIL;
            SubLObject length = length(vector_var);
            SubLObject v_iteration = NIL;
            for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                {
                    SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                    SubLObject paragraph = aref(vector_var, element_num);
                    SubLObject vector_var_13 = document.paragraph_sentences(paragraph);
                    SubLObject backwardP_var_14 = NIL;
                    SubLObject length_15 = length(vector_var_13);
                    SubLObject v_iteration_16 = NIL;
                    for (v_iteration_16 = ZERO_INTEGER; v_iteration_16.numL(length_15); v_iteration_16 = add(v_iteration_16, ONE_INTEGER)) {
                        {
                            SubLObject element_num_17 = (NIL != backwardP_var_14) ? ((SubLObject) (subtract(length_15, v_iteration_16, ONE_INTEGER))) : v_iteration_16;
                            SubLObject sentence = aref(vector_var_13, element_num_17);
                            SubLObject vector_var_18 = document.sentence_yield(sentence);
                            SubLObject backwardP_var_19 = NIL;
                            SubLObject length_20 = length(vector_var_18);
                            SubLObject v_iteration_21 = NIL;
                            for (v_iteration_21 = ZERO_INTEGER; v_iteration_21.numL(length_20); v_iteration_21 = add(v_iteration_21, ONE_INTEGER)) {
                                {
                                    SubLObject element_num_22 = (NIL != backwardP_var_19) ? ((SubLObject) (subtract(length_20, v_iteration_21, ONE_INTEGER))) : v_iteration_21;
                                    SubLObject word = aref(vector_var_18, element_num_22);
                                    SubLObject cdolist_list_var = document.word_interps(word);
                                    SubLObject sense_marker = NIL;
                                    for (sense_marker = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sense_marker = cdolist_list_var.first()) {
                                        sense = nl_api_datastructures.get_nl_interp_cycl(sense_marker);
                                        hash_table_utilities.cinc_hash(sense, senses, UNPROVIDED, UNPROVIDED);
                                        {
                                            SubLObject cdolist_list_var_23 = document_annotation_widgets.get_upwards_closure(sense);
                                            SubLObject general = NIL;
                                            for (general = cdolist_list_var_23.first(); NIL != cdolist_list_var_23; cdolist_list_var_23 = cdolist_list_var_23.rest() , general = cdolist_list_var_23.first()) {
                                                hash_table_utilities.cinc_hash(general, senses, UNPROVIDED, UNPROVIDED);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return senses;
        }
    }

    /**
     * returns a set containing all senses in DOC
     */
    @LispMethod(comment = "returns a set containing all senses in DOC")
    public static SubLObject new_sense_bag(final SubLObject doc) {
        assert NIL != document.document_p(doc) : "! document.document_p(doc) " + ("document.document_p(doc) " + "CommonSymbols.NIL != document.document_p(doc) ") + doc;
        final SubLObject senses = make_hash_table($int$1024, EQUAL, UNPROVIDED);
        SubLObject sense = NIL;
        final SubLObject vector_var = document.document_paragraphs(doc);
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject paragraph;
        SubLObject vector_var_$11;
        SubLObject backwardP_var_$12;
        SubLObject length_$13;
        SubLObject v_iteration_$14;
        SubLObject element_num_$15;
        SubLObject sentence;
        SubLObject cdolist_list_var;
        SubLObject word;
        SubLObject cdolist_list_var_$16;
        SubLObject sense_marker;
        SubLObject cdolist_list_var_$17;
        SubLObject general;
        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
            element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
            paragraph = aref(vector_var, element_num);
            vector_var_$11 = document.paragraph_sentences(paragraph);
            backwardP_var_$12 = NIL;
            for (length_$13 = length(vector_var_$11), v_iteration_$14 = NIL, v_iteration_$14 = ZERO_INTEGER; v_iteration_$14.numL(length_$13); v_iteration_$14 = add(v_iteration_$14, ONE_INTEGER)) {
                element_num_$15 = (NIL != backwardP_var_$12) ? subtract(length_$13, v_iteration_$14, ONE_INTEGER) : v_iteration_$14;
                sentence = aref(vector_var_$11, element_num_$15);
                cdolist_list_var = document.sentence_yield_exhaustive(sentence);
                word = NIL;
                word = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    cdolist_list_var_$16 = document.word_interps(word);
                    sense_marker = NIL;
                    sense_marker = cdolist_list_var_$16.first();
                    while (NIL != cdolist_list_var_$16) {
                        sense = nl_api_datastructures.get_nl_interp_cycl(sense_marker);
                        hash_table_utilities.cinc_hash(sense, senses, UNPROVIDED, UNPROVIDED);
                        cdolist_list_var_$17 = document_annotation_widgets.get_upwards_closure(sense);
                        general = NIL;
                        general = cdolist_list_var_$17.first();
                        while (NIL != cdolist_list_var_$17) {
                            hash_table_utilities.cinc_hash(general, senses, UNPROVIDED, UNPROVIDED);
                            cdolist_list_var_$17 = cdolist_list_var_$17.rest();
                            general = cdolist_list_var_$17.first();
                        } 
                        cdolist_list_var_$16 = cdolist_list_var_$16.rest();
                        sense_marker = cdolist_list_var_$16.first();
                    } 
                    cdolist_list_var = cdolist_list_var.rest();
                    word = cdolist_list_var.first();
                } 
            }
        }
        return senses;
    }

    /**
     * returns t if TERM is licensed by sense bag BAG
     */
    @LispMethod(comment = "returns t if TERM is licensed by sense bag BAG")
    public static final SubLObject sense_bag_licensesP_alt(SubLObject v_term, SubLObject v_bag) {
        return subl_promotions.positive_integer_p(gethash_without_values(v_term, v_bag, UNPROVIDED));
    }

    /**
     * returns t if TERM is licensed by sense bag BAG
     */
    @LispMethod(comment = "returns t if TERM is licensed by sense bag BAG")
    public static SubLObject sense_bag_licensesP(final SubLObject v_term, final SubLObject v_bag) {
        return subl_promotions.positive_integer_p(gethash_without_values(v_term, v_bag, UNPROVIDED));
    }

    public static final SubLObject disambiguation_rule_query_alt(SubLObject pred) {
        return ask_utilities.query_template($list_alt49, bq_cons(pred, $list_alt49), $$InferencePSC, $list_alt51);
    }

    public static SubLObject disambiguation_rule_query(final SubLObject pred) {
        return ask_utilities.query_template($list56, bq_cons(pred, $list56), $$InferencePSC, $list58);
    }

    public static final SubLObject create_disambiguator_rules_file_alt(SubLObject f_out) {
        if (f_out == UNPROVIDED) {
            f_out = $str_alt52$data_word_sense_disambiguation_ru;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject licensing_term_pairs = disambiguation_rule_query($$isLicensedBy);
                SubLObject delicensing_term_pairs = disambiguation_rule_query($$isDelicensedBy);
                SubLObject rule_hash_table = make_hash_table($int$65536, EQUAL, UNPROVIDED);
                {
                    SubLObject cdolist_list_var = licensing_term_pairs;
                    SubLObject licensing_term_pair = NIL;
                    for (licensing_term_pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , licensing_term_pair = cdolist_list_var.first()) {
                        hash_table_utilities.push_hash(licensing_term_pair.first(), cons(T, second(licensing_term_pair)), rule_hash_table);
                    }
                }
                {
                    SubLObject cdolist_list_var = delicensing_term_pairs;
                    SubLObject delicensing_term_pair = NIL;
                    for (delicensing_term_pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , delicensing_term_pair = cdolist_list_var.first()) {
                        hash_table_utilities.push_hash(delicensing_term_pair.first(), cons(NIL, second(delicensing_term_pair)), rule_hash_table);
                    }
                }
                {
                    SubLObject stream = NIL;
                    try {
                        stream = compatibility.open_text(f_out, $OUTPUT, NIL);
                        if (!stream.isStream()) {
                            Errors.error($str_alt57$Unable_to_open__S, f_out);
                        }
                        {
                            SubLObject s_out = stream;
                            {
                                SubLObject _prev_bind_0 = $print_pretty$.currentBinding(thread);
                                try {
                                    $print_pretty$.bind(NIL, thread);
                                    format(s_out, $str_alt58$___);
                                    {
                                        SubLObject key = NIL;
                                        SubLObject value = NIL;
                                        {
                                            final Iterator cdohash_iterator = getEntrySetIterator(rule_hash_table);
                                            try {
                                                while (iteratorHasNext(cdohash_iterator)) {
                                                    final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                                    key = getEntryKey(cdohash_entry);
                                                    value = getEntryValue(cdohash_entry);
                                                    format(s_out, $str_alt59$__S____S___, key, value);
                                                } 
                                            } finally {
                                                releaseEntrySetIterator(cdohash_iterator);
                                            }
                                        }
                                    }
                                    format(s_out, $str_alt60$___);
                                } finally {
                                    $print_pretty$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                if (stream.isStream()) {
                                    close(stream, UNPROVIDED);
                                }
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
                return $DONE;
            }
        }
    }

    public static SubLObject create_disambiguator_rules_file(SubLObject f_out) {
        if (f_out == UNPROVIDED) {
            f_out = $str59$data_word_sense_disambiguation_ru;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject licensing_term_pairs = disambiguation_rule_query($$isLicensedBy);
        final SubLObject delicensing_term_pairs = disambiguation_rule_query($$isDelicensedBy);
        final SubLObject rule_hash_table = make_hash_table($int$65536, EQUAL, UNPROVIDED);
        SubLObject cdolist_list_var = licensing_term_pairs;
        SubLObject licensing_term_pair = NIL;
        licensing_term_pair = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            hash_table_utilities.push_hash(licensing_term_pair.first(), cons(T, second(licensing_term_pair)), rule_hash_table);
            cdolist_list_var = cdolist_list_var.rest();
            licensing_term_pair = cdolist_list_var.first();
        } 
        cdolist_list_var = delicensing_term_pairs;
        SubLObject delicensing_term_pair = NIL;
        delicensing_term_pair = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            hash_table_utilities.push_hash(delicensing_term_pair.first(), cons(NIL, second(delicensing_term_pair)), rule_hash_table);
            cdolist_list_var = cdolist_list_var.rest();
            delicensing_term_pair = cdolist_list_var.first();
        } 
        SubLObject stream = NIL;
        try {
            stream = compatibility.open_text(f_out, $OUTPUT);
            if (!stream.isStream()) {
                Errors.error($str64$Unable_to_open__S, f_out);
            }
            final SubLObject s_out = stream;
            final SubLObject _prev_bind_0 = $print_pretty$.currentBinding(thread);
            try {
                $print_pretty$.bind(NIL, thread);
                format(s_out, $str65$___);
                SubLObject key = NIL;
                SubLObject value = NIL;
                final Iterator cdohash_iterator = getEntrySetIterator(rule_hash_table);
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        key = getEntryKey(cdohash_entry);
                        value = getEntryValue(cdohash_entry);
                        format(s_out, $str66$__S____S___, key, value);
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
                format(s_out, $str67$___);
            } finally {
                $print_pretty$.rebind(_prev_bind_0, thread);
            }
        } finally {
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return $DONE;
    }

    public static final SubLObject fort_disambiguation_rule_query_alt(SubLObject fort, SubLObject pred, SubLObject pstore) {
        return ask_utilities.query_template(bq_cons(fort, $list_alt62), listS(pred, fort, $list_alt62), $$InferencePSC, list(new SubLObject[]{ $INFERENCE_MODE, $SHALLOW, $kw65$ALLOW_INDETERMINATE_RESULTS_, NIL, $DISJUNCTION_FREE_EL_VARS_POLICY, $COMPUTE_INTERSECTION, $INTERMEDIATE_STEP_VALIDATION_LEVEL, $MINIMAL, $MAX_TIME, $int$57600, $PROBABLY_APPROXIMATELY_DONE, $float$1_0, $ANSWER_LANGUAGE, $EL, $CONTINUABLE_, NIL, $PROBLEM_STORE, pstore }));
    }

    public static SubLObject fort_disambiguation_rule_query(final SubLObject fort, final SubLObject pred, final SubLObject pstore) {
        return ask_utilities.query_template(bq_cons(fort, $list69), listS(pred, fort, $list69), $$InferencePSC, list(new SubLObject[]{ $INFERENCE_MODE, $SHALLOW, $kw72$ALLOW_INDETERMINATE_RESULTS_, NIL, $DISJUNCTION_FREE_EL_VARS_POLICY, $COMPUTE_INTERSECTION, $INTERMEDIATE_STEP_VALIDATION_LEVEL, $MINIMAL, $MAX_TIME, $int$57600, $PROBABLY_APPROXIMATELY_DONE, $float$1_0, $ANSWER_LANGUAGE, $EL, $CONTINUABLE_, NIL, $PROBLEM_STORE, pstore }));
    }

    /**
     * Creates a file hash table at PATH using TESTFN and SERIALIZATION with the same contents as ALIST
     */
    @LispMethod(comment = "Creates a file hash table at PATH using TESTFN and SERIALIZATION with the same contents as ALIST")
    public static final SubLObject term_alist_to_file_hash_table_alt(SubLObject alist, SubLObject path, SubLObject testfn, SubLObject serialization, SubLObject tempstem) {
        if (testfn == UNPROVIDED) {
            testfn = file_hash_table.$default_fht_test_function$.getGlobalValue();
        }
        if (serialization == UNPROVIDED) {
            serialization = file_hash_table.$default_fht_serialization_protocol$.getGlobalValue();
        }
        if (tempstem == UNPROVIDED) {
            tempstem = $str_alt78$_tmp_;
        }
        SubLTrampolineFile.checkType(alist, LISTP);
        SubLTrampolineFile.checkType(path, STRINGP);
        {
            SubLObject fht = file_hash_table.fast_create_file_hash_table(path, tempstem, testfn, serialization);
            SubLObject cdolist_list_var = reverse(alist);
            SubLObject keyXvalue = NIL;
            for (keyXvalue = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , keyXvalue = cdolist_list_var.first()) {
                {
                    SubLObject key = keyXvalue.first();
                    if ((NIL != invalid_constantP(key, UNPROVIDED)) || (NIL != narts_high.invalid_nartP(key, UNPROVIDED))) {
                        Errors.warn($str_alt80$_a_is_invalid, key);
                    } else {
                        file_hash_table.fast_put_file_hash_table(keyXvalue.first(), fht, keyXvalue.rest());
                    }
                }
            }
            file_hash_table.finalize_fast_create_file_hash_table(fht, UNPROVIDED, UNPROVIDED);
        }
        return path;
    }

    /**
     * Creates a file hash table at PATH using TESTFN and SERIALIZATION with the same contents as ALIST
     */
    @LispMethod(comment = "Creates a file hash table at PATH using TESTFN and SERIALIZATION with the same contents as ALIST")
    public static SubLObject term_alist_to_file_hash_table(final SubLObject alist, final SubLObject path, SubLObject testfn, SubLObject serialization, SubLObject tempstem) {
        if (testfn == UNPROVIDED) {
            testfn = file_hash_table.$default_fht_test_function$.getGlobalValue();
        }
        if (serialization == UNPROVIDED) {
            serialization = file_hash_table.$default_fht_serialization_protocol$.getGlobalValue();
        }
        if (tempstem == UNPROVIDED) {
            tempstem = $str85$_tmp_;
        }
        assert NIL != listp(alist) : "! listp(alist) " + ("Types.listp(alist) " + "CommonSymbols.NIL != Types.listp(alist) ") + alist;
        assert NIL != stringp(path) : "! stringp(path) " + ("Types.stringp(path) " + "CommonSymbols.NIL != Types.stringp(path) ") + path;
        final SubLObject fht = file_hash_table.fast_create_file_hash_table(path, tempstem, testfn, serialization);
        SubLObject cdolist_list_var = reverse(alist);
        SubLObject keyXvalue = NIL;
        keyXvalue = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject key = keyXvalue.first();
            if ((NIL != invalid_constantP(key, UNPROVIDED)) || (NIL != narts_high.invalid_nartP(key, UNPROVIDED))) {
                Errors.warn($str87$_a_is_invalid, key);
            } else {
                file_hash_table.fast_put_file_hash_table(keyXvalue.first(), fht, keyXvalue.rest());
            }
            cdolist_list_var = cdolist_list_var.rest();
            keyXvalue = cdolist_list_var.first();
        } 
        file_hash_table.finalize_fast_create_file_hash_table(fht, UNPROVIDED, UNPROVIDED);
        return path;
    }

    public static final SubLObject alist_file_to_fht_alt(SubLObject infile, SubLObject outfht) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(infile, STRINGP);
            SubLTrampolineFile.checkType(outfht, STRINGP);
            if (NIL == Filesys.probe_file(infile)) {
                Errors.error($str_alt81$Can_t_load__a___a, infile, file_utilities.why_not_probe_fileP(infile));
            }
            {
                SubLObject alist = NIL;
                SubLObject hash = make_hash_table($int$1024, EQUAL, UNPROVIDED);
                SubLObject stream = NIL;
                try {
                    stream = compatibility.open_text(infile, $INPUT, NIL);
                    if (!stream.isStream()) {
                        Errors.error($str_alt57$Unable_to_open__S, infile);
                    }
                    {
                        SubLObject in = stream;
                        alist = read(in, T, NIL, UNPROVIDED);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            if (stream.isStream()) {
                                close(stream, UNPROVIDED);
                            }
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                {
                    SubLObject list_var = alist;
                    $progress_note$.setDynamicValue($$$cdolist, thread);
                    $progress_start_time$.setDynamicValue(get_universal_time(), thread);
                    $progress_total$.setDynamicValue(length(list_var), thread);
                    $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                    {
                        SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
                        SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                        SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                        SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                        try {
                            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                            $last_percent_progress_prediction$.bind(NIL, thread);
                            $within_noting_percent_progress$.bind(T, thread);
                            $percent_progress_start_time$.bind(get_universal_time(), thread);
                            noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                            {
                                SubLObject csome_list_var = list_var;
                                SubLObject keyXvalue = NIL;
                                for (keyXvalue = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , keyXvalue = csome_list_var.first()) {
                                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                    {
                                        SubLObject key = keyXvalue.first();
                                        if ((NIL != invalid_constantP(key, UNPROVIDED)) || (NIL != narts_high.invalid_nartP(key, UNPROVIDED))) {
                                            Errors.warn($str_alt80$_a_is_invalid, key);
                                        } else {
                                            sethash(keyXvalue.first(), hash, keyXvalue.rest());
                                        }
                                    }
                                }
                            }
                            noting_percent_progress_postamble();
                        } finally {
                            $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                            $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                            $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return file_hash_table.hash_table_to_file_hash_table(hash, outfht, $str_alt78$_tmp_, EQUAL, $IMAGE_INDEPENDENT_CFASL, UNPROVIDED);
            }
        }
    }

    public static SubLObject alist_file_to_fht(final SubLObject infile, final SubLObject outfht) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(infile) : "! stringp(infile) " + ("Types.stringp(infile) " + "CommonSymbols.NIL != Types.stringp(infile) ") + infile;
        assert NIL != stringp(outfht) : "! stringp(outfht) " + ("Types.stringp(outfht) " + "CommonSymbols.NIL != Types.stringp(outfht) ") + outfht;
        if (NIL == Filesys.probe_file(infile)) {
            Errors.error($str88$Can_t_load__a___a, infile, file_utilities.why_not_probe_fileP(infile));
        }
        SubLObject alist = NIL;
        final SubLObject hash = make_hash_table($int$1024, EQUAL, UNPROVIDED);
        SubLObject stream = NIL;
        try {
            stream = compatibility.open_text(infile, $INPUT);
            if (!stream.isStream()) {
                Errors.error($str64$Unable_to_open__S, infile);
            }
            final SubLObject in = stream;
            alist = read(in, T, NIL, UNPROVIDED);
        } finally {
            final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        final SubLObject list_var = alist;
        final SubLObject _prev_bind_2 = $progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_7 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_8 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_9 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $progress_note$.bind($$$cdolist, thread);
            $progress_start_time$.bind(get_universal_time(), thread);
            $progress_total$.bind(length(list_var), thread);
            $progress_sofar$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = list_var;
                SubLObject keyXvalue = NIL;
                keyXvalue = csome_list_var.first();
                while (NIL != csome_list_var) {
                    final SubLObject key = keyXvalue.first();
                    if ((NIL != invalid_constantP(key, UNPROVIDED)) || (NIL != narts_high.invalid_nartP(key, UNPROVIDED))) {
                        Errors.warn($str87$_a_is_invalid, key);
                    } else {
                        sethash(keyXvalue.first(), hash, keyXvalue.rest());
                    }
                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    keyXvalue = csome_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$18 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$18, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_9, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_8, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_7, thread);
            $last_percent_progress_index$.rebind(_prev_bind_6, thread);
            $progress_sofar$.rebind(_prev_bind_5, thread);
            $progress_total$.rebind(_prev_bind_4, thread);
            $progress_start_time$.rebind(_prev_bind_3, thread);
            $progress_note$.rebind(_prev_bind_2, thread);
        }
        return file_hash_table.hash_table_to_file_hash_table(hash, outfht, $str85$_tmp_, EQUAL, $IMAGE_INDEPENDENT_CFASL, UNPROVIDED);
    }

    public static final SubLObject disambiguator_rule_fht_to_hl_id_text_file_alt(SubLObject infht, SubLObject outfile) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Filesys.probe_file(infht)) {
                Errors.error($str_alt81$Can_t_load__a___a, infht, file_utilities.why_not_probe_fileP(infht));
            }
            {
                SubLObject fht = file_hash_table.open_file_hash_table_read_only(infht, UNPROVIDED, UNPROVIDED);
                SubLObject doneP = NIL;
                SubLObject stream = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                        try {
                            stream_macros.$stream_requires_locking$.bind(NIL, thread);
                            stream = compatibility.open_text(outfile, $OUTPUT, NIL);
                        } finally {
                            stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                        }
                    }
                    if (!stream.isStream()) {
                        Errors.error($str_alt57$Unable_to_open__S, outfile);
                    }
                    {
                        SubLObject out = stream;
                        SubLObject table_var = fht;
                        $progress_note$.setDynamicValue($$$Iterating_over_FHT, thread);
                        $progress_start_time$.setDynamicValue(get_universal_time(), thread);
                        $progress_total$.setDynamicValue(file_hash_table.file_hash_table_count(table_var), thread);
                        $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                        {
                            SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
                            SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                            SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                            SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                            try {
                                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                $last_percent_progress_prediction$.bind(NIL, thread);
                                $within_noting_percent_progress$.bind(T, thread);
                                $percent_progress_start_time$.bind(get_universal_time(), thread);
                                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                                {
                                    SubLObject continuation = NIL;
                                    SubLObject completeP = NIL;
                                    while ((NIL == doneP) && (NIL == completeP)) {
                                        thread.resetMultipleValues();
                                        {
                                            SubLObject the_key = file_hash_table.get_file_hash_table_any(table_var, continuation, NIL);
                                            SubLObject the_value = thread.secondMultipleValue();
                                            SubLObject next = thread.thirdMultipleValue();
                                            thread.resetMultipleValues();
                                            if (NIL != next) {
                                                {
                                                    SubLObject key = the_key;
                                                    SubLObject licensers = the_value;
                                                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                                    {
                                                        SubLObject licensing_terms = NIL;
                                                        {
                                                            SubLObject cdolist_list_var = licensers;
                                                            SubLObject licenser = NIL;
                                                            for (licenser = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , licenser = cdolist_list_var.first()) {
                                                                {
                                                                    SubLObject datum = licenser;
                                                                    SubLObject current = datum;
                                                                    SubLObject licensedP = NIL;
                                                                    SubLObject v_term = NIL;
                                                                    destructuring_bind_must_consp(current, datum, $list_alt86);
                                                                    licensedP = current.first();
                                                                    current = current.rest();
                                                                    v_term = current;
                                                                    if (licensedP == T) {
                                                                        licensing_terms = cons(v_term, licensing_terms);
                                                                    } else {
                                                                        Errors.warn($str_alt87$don_t_know_how_to_convert__A, licensedP);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        format(out, $str_alt88$_A__A_, kb_utilities.compact_hl_external_id_string(key), T);
                                                        {
                                                            SubLObject cdolist_list_var = licensing_terms;
                                                            SubLObject v_term = NIL;
                                                            for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                                                                format(out, $str_alt89$_A_, kb_utilities.compact_hl_external_id_string(v_term));
                                                            }
                                                        }
                                                    }
                                                    format(out, $str_alt90$__);
                                                }
                                            }
                                            continuation = next;
                                            completeP = sublisp_null(next);
                                        }
                                    } 
                                }
                                noting_percent_progress_postamble();
                            } finally {
                                $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                                $last_percent_progress_index$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            if (stream.isStream()) {
                                close(stream, UNPROVIDED);
                            }
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
            }
            return outfile;
        }
    }

    public static SubLObject disambiguator_rule_fht_to_hl_id_text_file(final SubLObject infht, final SubLObject outfile) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == Filesys.probe_file(infht)) {
            Errors.error($str88$Can_t_load__a___a, infht, file_utilities.why_not_probe_fileP(infht));
        }
        final SubLObject fht = file_hash_table.open_file_hash_table_read_only(infht, UNPROVIDED, UNPROVIDED);
        final SubLObject doneP = NIL;
        SubLObject stream = NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_text(outfile, $OUTPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str64$Unable_to_open__S, outfile);
            }
            final SubLObject out = stream;
            final SubLObject table_var = fht;
            $progress_note$.setDynamicValue($$$Iterating_over_FHT, thread);
            $progress_start_time$.setDynamicValue(get_universal_time(), thread);
            $progress_total$.setDynamicValue(file_hash_table.file_hash_table_count(table_var), thread);
            $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
            final SubLObject _prev_bind_2 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_5 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                    SubLObject continuation = NIL;
                    SubLObject next;
                    for (SubLObject completeP = NIL; (NIL == doneP) && (NIL == completeP); completeP = sublisp_null(next)) {
                        thread.resetMultipleValues();
                        final SubLObject the_key = file_hash_table.get_file_hash_table_any(table_var, continuation, NIL);
                        final SubLObject the_value = thread.secondMultipleValue();
                        next = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != next) {
                            final SubLObject key = the_key;
                            final SubLObject licensers = the_value;
                            note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                            $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                            SubLObject licensing_terms = NIL;
                            SubLObject cdolist_list_var = licensers;
                            SubLObject licenser = NIL;
                            licenser = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                SubLObject current;
                                final SubLObject datum = current = licenser;
                                SubLObject licensedP = NIL;
                                SubLObject v_term = NIL;
                                destructuring_bind_must_consp(current, datum, $list93);
                                licensedP = current.first();
                                current = v_term = current.rest();
                                if (licensedP == T) {
                                    licensing_terms = cons(v_term, licensing_terms);
                                } else {
                                    Errors.warn($str94$don_t_know_how_to_convert__A, licensedP);
                                }
                                cdolist_list_var = cdolist_list_var.rest();
                                licenser = cdolist_list_var.first();
                            } 
                            format(out, $str95$_A__A_, kb_utilities.compact_hl_external_id_string(key), T);
                            cdolist_list_var = licensing_terms;
                            SubLObject v_term2 = NIL;
                            v_term2 = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                format(out, $str96$_A_, kb_utilities.compact_hl_external_id_string(v_term2));
                                cdolist_list_var = cdolist_list_var.rest();
                                v_term2 = cdolist_list_var.first();
                            } 
                            format(out, $str97$__);
                        }
                        continuation = next;
                    }
                } finally {
                    final SubLObject _prev_bind_0_$19 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$19, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_5, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_4, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_3, thread);
                $last_percent_progress_index$.rebind(_prev_bind_2, thread);
            }
        } finally {
            final SubLObject _prev_bind_6 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values2 = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values2);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_6, thread);
            }
        }
        return outfile;
    }

    public static final SubLObject create_disambiguator_rules_file_from_forts_alt(SubLObject f_out) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(f_out, STRINGP);
            {
                SubLObject rule_hash_table = make_hash_table($int$65536, EQUAL, UNPROVIDED);
                SubLObject store = NIL;
                try {
                    store = inference_datastructures_problem_store.new_problem_store($list_alt91);
                    {
                        SubLObject message = $$$mapping_Cyc_FORTs;
                        SubLObject total = forts.fort_count();
                        SubLObject sofar = ZERO_INTEGER;
                        {
                            SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
                            SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                            SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                            SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                            try {
                                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                $last_percent_progress_prediction$.bind(NIL, thread);
                                $within_noting_percent_progress$.bind(T, thread);
                                $percent_progress_start_time$.bind(get_universal_time(), thread);
                                noting_percent_progress_preamble(message);
                                {
                                    SubLObject cdolist_list_var = forts.do_forts_tables();
                                    SubLObject table_var = NIL;
                                    for (table_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , table_var = cdolist_list_var.first()) {
                                        if (NIL == do_id_index_empty_p(table_var, $SKIP)) {
                                            {
                                                SubLObject id = do_id_index_next_id(table_var, T, NIL, NIL);
                                                SubLObject state_var = do_id_index_next_state(table_var, T, id, NIL);
                                                SubLObject fort = NIL;
                                                while (NIL != id) {
                                                    fort = do_id_index_state_object(table_var, $SKIP, id, state_var);
                                                    if (NIL != do_id_index_id_and_object_validP(id, fort, $SKIP)) {
                                                        sofar = add(sofar, ONE_INTEGER);
                                                        note_percent_progress(sofar, total);
                                                        {
                                                            SubLObject cdolist_list_var_24 = fort_disambiguation_rule_query(fort, $$isLicensedBy, store);
                                                            SubLObject pair = NIL;
                                                            for (pair = cdolist_list_var_24.first(); NIL != cdolist_list_var_24; cdolist_list_var_24 = cdolist_list_var_24.rest() , pair = cdolist_list_var_24.first()) {
                                                                hash_table_utilities.push_hash(pair.first(), cons(T, second(pair)), rule_hash_table);
                                                            }
                                                        }
                                                        {
                                                            SubLObject cdolist_list_var_25 = fort_disambiguation_rule_query(fort, $$isDelicensedBy, store);
                                                            SubLObject pair = NIL;
                                                            for (pair = cdolist_list_var_25.first(); NIL != cdolist_list_var_25; cdolist_list_var_25 = cdolist_list_var_25.rest() , pair = cdolist_list_var_25.first()) {
                                                                hash_table_utilities.push_hash(pair.first(), cons(NIL, second(pair)), rule_hash_table);
                                                            }
                                                        }
                                                    }
                                                    id = do_id_index_next_id(table_var, T, id, state_var);
                                                    state_var = do_id_index_next_state(table_var, T, id, state_var);
                                                } 
                                            }
                                        }
                                    }
                                }
                                noting_percent_progress_postamble();
                            } finally {
                                $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                                $last_percent_progress_index$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            inference_datastructures_problem_store.destroy_problem_store(store);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                {
                    SubLObject stream = NIL;
                    try {
                        stream = compatibility.open_text(f_out, $OUTPUT, NIL);
                        if (!stream.isStream()) {
                            Errors.error($str_alt57$Unable_to_open__S, f_out);
                        }
                        {
                            SubLObject s_out = stream;
                            {
                                SubLObject _prev_bind_0 = $print_pretty$.currentBinding(thread);
                                try {
                                    $print_pretty$.bind(NIL, thread);
                                    format(s_out, $str_alt58$___);
                                    {
                                        SubLObject key = NIL;
                                        SubLObject value = NIL;
                                        {
                                            final Iterator cdohash_iterator = getEntrySetIterator(rule_hash_table);
                                            try {
                                                while (iteratorHasNext(cdohash_iterator)) {
                                                    final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                                    key = getEntryKey(cdohash_entry);
                                                    value = getEntryValue(cdohash_entry);
                                                    format(s_out, $str_alt59$__S____S___, key, value);
                                                } 
                                            } finally {
                                                releaseEntrySetIterator(cdohash_iterator);
                                            }
                                        }
                                    }
                                    format(s_out, $str_alt60$___);
                                } finally {
                                    $print_pretty$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                if (stream.isStream()) {
                                    close(stream, UNPROVIDED);
                                }
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
                return $DONE;
            }
        }
    }

    public static SubLObject create_disambiguator_rules_file_from_forts(final SubLObject f_out) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(f_out) : "! stringp(f_out) " + ("Types.stringp(f_out) " + "CommonSymbols.NIL != Types.stringp(f_out) ") + f_out;
        final SubLObject rule_hash_table = make_hash_table($int$65536, EQUAL, UNPROVIDED);
        SubLObject store = NIL;
        try {
            store = inference_datastructures_problem_store.new_problem_store($list98);
            final SubLObject message = $$$mapping_Cyc_FORTs;
            final SubLObject total = forts.fort_count();
            SubLObject sofar = ZERO_INTEGER;
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
                    noting_percent_progress_preamble(message);
                    SubLObject cdolist_list_var = forts.do_forts_tables();
                    SubLObject table_var = NIL;
                    table_var = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        final SubLObject idx = table_var;
                        if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
                            final SubLObject idx_$20 = idx;
                            if (NIL == id_index_dense_objects_empty_p(idx_$20, $SKIP)) {
                                final SubLObject vector_var = id_index_dense_objects(idx_$20);
                                final SubLObject backwardP_var = NIL;
                                SubLObject length;
                                SubLObject v_iteration;
                                SubLObject id;
                                SubLObject fort;
                                SubLObject cdolist_list_var_$21;
                                SubLObject pair;
                                SubLObject cdolist_list_var_$22;
                                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                    fort = aref(vector_var, id);
                                    if ((NIL == id_index_tombstone_p(fort)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                        if (NIL != id_index_tombstone_p(fort)) {
                                            fort = $SKIP;
                                        }
                                        sofar = add(sofar, ONE_INTEGER);
                                        note_percent_progress(sofar, total);
                                        cdolist_list_var_$21 = fort_disambiguation_rule_query(fort, $$isLicensedBy, store);
                                        pair = NIL;
                                        pair = cdolist_list_var_$21.first();
                                        while (NIL != cdolist_list_var_$21) {
                                            hash_table_utilities.push_hash(pair.first(), cons(T, second(pair)), rule_hash_table);
                                            cdolist_list_var_$21 = cdolist_list_var_$21.rest();
                                            pair = cdolist_list_var_$21.first();
                                        } 
                                        cdolist_list_var_$22 = fort_disambiguation_rule_query(fort, $$isDelicensedBy, store);
                                        pair = NIL;
                                        pair = cdolist_list_var_$22.first();
                                        while (NIL != cdolist_list_var_$22) {
                                            hash_table_utilities.push_hash(pair.first(), cons(NIL, second(pair)), rule_hash_table);
                                            cdolist_list_var_$22 = cdolist_list_var_$22.rest();
                                            pair = cdolist_list_var_$22.first();
                                        } 
                                    }
                                }
                            }
                            final SubLObject idx_$21 = idx;
                            if ((NIL == id_index_sparse_objects_empty_p(idx_$21)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                final SubLObject sparse = id_index_sparse_objects(idx_$21);
                                SubLObject id2 = id_index_sparse_id_threshold(idx_$21);
                                final SubLObject end_id = id_index_next_id(idx_$21);
                                final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                                while (id2.numL(end_id)) {
                                    final SubLObject fort2 = gethash_without_values(id2, sparse, v_default);
                                    if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(fort2))) {
                                        sofar = add(sofar, ONE_INTEGER);
                                        note_percent_progress(sofar, total);
                                        SubLObject cdolist_list_var_$23 = fort_disambiguation_rule_query(fort2, $$isLicensedBy, store);
                                        SubLObject pair2 = NIL;
                                        pair2 = cdolist_list_var_$23.first();
                                        while (NIL != cdolist_list_var_$23) {
                                            hash_table_utilities.push_hash(pair2.first(), cons(T, second(pair2)), rule_hash_table);
                                            cdolist_list_var_$23 = cdolist_list_var_$23.rest();
                                            pair2 = cdolist_list_var_$23.first();
                                        } 
                                        SubLObject cdolist_list_var_$24 = fort_disambiguation_rule_query(fort2, $$isDelicensedBy, store);
                                        pair2 = NIL;
                                        pair2 = cdolist_list_var_$24.first();
                                        while (NIL != cdolist_list_var_$24) {
                                            hash_table_utilities.push_hash(pair2.first(), cons(NIL, second(pair2)), rule_hash_table);
                                            cdolist_list_var_$24 = cdolist_list_var_$24.rest();
                                            pair2 = cdolist_list_var_$24.first();
                                        } 
                                    }
                                    id2 = add(id2, ONE_INTEGER);
                                } 
                            }
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        table_var = cdolist_list_var.first();
                    } 
                } finally {
                    final SubLObject _prev_bind_0_$26 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$26, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_4, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
                $last_percent_progress_index$.rebind(_prev_bind_0, thread);
            }
        } finally {
            final SubLObject _prev_bind_5 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values2 = getValuesAsVector();
                inference_datastructures_problem_store.destroy_problem_store(store);
                restoreValuesFromVector(_values2);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_5, thread);
            }
        }
        SubLObject stream = NIL;
        try {
            stream = compatibility.open_text(f_out, $OUTPUT);
            if (!stream.isStream()) {
                Errors.error($str64$Unable_to_open__S, f_out);
            }
            final SubLObject s_out = stream;
            final SubLObject _prev_bind_6 = $print_pretty$.currentBinding(thread);
            try {
                $print_pretty$.bind(NIL, thread);
                format(s_out, $str65$___);
                SubLObject key = NIL;
                SubLObject value = NIL;
                final Iterator cdohash_iterator = getEntrySetIterator(rule_hash_table);
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        key = getEntryKey(cdohash_entry);
                        value = getEntryValue(cdohash_entry);
                        format(s_out, $str66$__S____S___, key, value);
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
                format(s_out, $str67$___);
            } finally {
                $print_pretty$.rebind(_prev_bind_6, thread);
            }
        } finally {
            final SubLObject _prev_bind_7 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values3 = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values3);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_7, thread);
            }
        }
        return $DONE;
    }

    public static final SubLObject create_disambiguator_rules_file_from_fort_list_alt(SubLObject fort_list, SubLObject f_out) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(f_out, STRINGP);
            {
                SubLObject rule_hash_table = make_hash_table($int$65536, EQUAL, UNPROVIDED);
                SubLObject list_var = fort_list;
                $progress_note$.setDynamicValue($$$cdolist, thread);
                $progress_start_time$.setDynamicValue(get_universal_time(), thread);
                $progress_total$.setDynamicValue(length(list_var), thread);
                $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                {
                    SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                    SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_prediction$.bind(NIL, thread);
                        $within_noting_percent_progress$.bind(T, thread);
                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                        noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                        {
                            SubLObject csome_list_var = list_var;
                            SubLObject fort = NIL;
                            for (fort = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , fort = csome_list_var.first()) {
                                note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                {
                                    SubLObject store = NIL;
                                    try {
                                        store = inference_datastructures_problem_store.new_problem_store(NIL);
                                        {
                                            SubLObject cdolist_list_var = fort_disambiguation_rule_query(fort, $$isLicensedBy, store);
                                            SubLObject pair = NIL;
                                            for (pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pair = cdolist_list_var.first()) {
                                                hash_table_utilities.push_hash(pair.first(), cons(T, second(pair)), rule_hash_table);
                                            }
                                        }
                                        {
                                            SubLObject cdolist_list_var = fort_disambiguation_rule_query(fort, $$isDelicensedBy, store);
                                            SubLObject pair = NIL;
                                            for (pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pair = cdolist_list_var.first()) {
                                                hash_table_utilities.push_hash(pair.first(), cons(NIL, second(pair)), rule_hash_table);
                                            }
                                        }
                                    } finally {
                                        {
                                            SubLObject _prev_bind_0_26 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                inference_datastructures_problem_store.destroy_problem_store(store);
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_26, thread);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        noting_percent_progress_postamble();
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_0, thread);
                    }
                }
                {
                    SubLObject stream = NIL;
                    try {
                        stream = compatibility.open_text(f_out, $OUTPUT, NIL);
                        if (!stream.isStream()) {
                            Errors.error($str_alt57$Unable_to_open__S, f_out);
                        }
                        {
                            SubLObject s_out = stream;
                            {
                                SubLObject _prev_bind_0 = $print_pretty$.currentBinding(thread);
                                try {
                                    $print_pretty$.bind(NIL, thread);
                                    format(s_out, $str_alt58$___);
                                    {
                                        SubLObject key = NIL;
                                        SubLObject value = NIL;
                                        {
                                            final Iterator cdohash_iterator = getEntrySetIterator(rule_hash_table);
                                            try {
                                                while (iteratorHasNext(cdohash_iterator)) {
                                                    final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                                    key = getEntryKey(cdohash_entry);
                                                    value = getEntryValue(cdohash_entry);
                                                    format(s_out, $str_alt59$__S____S___, key, value);
                                                } 
                                            } finally {
                                                releaseEntrySetIterator(cdohash_iterator);
                                            }
                                        }
                                    }
                                    format(s_out, $str_alt60$___);
                                } finally {
                                    $print_pretty$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                if (stream.isStream()) {
                                    close(stream, UNPROVIDED);
                                }
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
                return $DONE;
            }
        }
    }

    public static SubLObject create_disambiguator_rules_file_from_fort_list(final SubLObject fort_list, final SubLObject f_out) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(f_out) : "! stringp(f_out) " + ("Types.stringp(f_out) " + "CommonSymbols.NIL != Types.stringp(f_out) ") + f_out;
        final SubLObject rule_hash_table = make_hash_table($int$65536, EQUAL, UNPROVIDED);
        final SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $progress_note$.bind($$$cdolist, thread);
            $progress_start_time$.bind(get_universal_time(), thread);
            $progress_total$.bind(length(fort_list), thread);
            $progress_sofar$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = fort_list;
                SubLObject fort = NIL;
                fort = csome_list_var.first();
                while (NIL != csome_list_var) {
                    SubLObject store = NIL;
                    try {
                        store = inference_datastructures_problem_store.new_problem_store(NIL);
                        SubLObject cdolist_list_var = fort_disambiguation_rule_query(fort, $$isLicensedBy, store);
                        SubLObject pair = NIL;
                        pair = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            hash_table_utilities.push_hash(pair.first(), cons(T, second(pair)), rule_hash_table);
                            cdolist_list_var = cdolist_list_var.rest();
                            pair = cdolist_list_var.first();
                        } 
                        cdolist_list_var = fort_disambiguation_rule_query(fort, $$isDelicensedBy, store);
                        pair = NIL;
                        pair = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            hash_table_utilities.push_hash(pair.first(), cons(NIL, second(pair)), rule_hash_table);
                            cdolist_list_var = cdolist_list_var.rest();
                            pair = cdolist_list_var.first();
                        } 
                    } finally {
                        final SubLObject _prev_bind_0_$27 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            inference_datastructures_problem_store.destroy_problem_store(store);
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$27, thread);
                        }
                    }
                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    fort = csome_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$28 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$28, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_8, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
            $last_percent_progress_index$.rebind(_prev_bind_5, thread);
            $progress_sofar$.rebind(_prev_bind_4, thread);
            $progress_total$.rebind(_prev_bind_3, thread);
            $progress_start_time$.rebind(_prev_bind_2, thread);
            $progress_note$.rebind(_prev_bind_0, thread);
        }
        SubLObject stream = NIL;
        try {
            stream = compatibility.open_text(f_out, $OUTPUT);
            if (!stream.isStream()) {
                Errors.error($str64$Unable_to_open__S, f_out);
            }
            final SubLObject s_out = stream;
            final SubLObject _prev_bind_9 = $print_pretty$.currentBinding(thread);
            try {
                $print_pretty$.bind(NIL, thread);
                format(s_out, $str65$___);
                SubLObject key = NIL;
                SubLObject value = NIL;
                final Iterator cdohash_iterator = getEntrySetIterator(rule_hash_table);
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        key = getEntryKey(cdohash_entry);
                        value = getEntryValue(cdohash_entry);
                        format(s_out, $str66$__S____S___, key, value);
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
                format(s_out, $str67$___);
            } finally {
                $print_pretty$.rebind(_prev_bind_9, thread);
            }
        } finally {
            final SubLObject _prev_bind_10 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values3 = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values3);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_10, thread);
            }
        }
        return $DONE;
    }

    public static final SubLObject create_disambiguator_rules_file_from_fort_file_id_alt(SubLObject file_id_num, SubLObject in_path, SubLObject out_path) {
        if (in_path == UNPROVIDED) {
            in_path = $str_alt94$_host_george_term_id_lists_;
        }
        if (out_path == UNPROVIDED) {
            out_path = $str_alt95$_host_george_disambig_rules_;
        }
        {
            SubLObject file_name = format(NIL, $str_alt96$_Afort_id__4__0D_cfasl, in_path, file_id_num);
            SubLObject terms = cfasl_utilities.cfasl_load(file_name);
            SubLObject out_file_name = format(NIL, $str_alt97$_Adisambiguator_rule_file__4__0D_, out_path, file_id_num);
            return create_disambiguator_rules_file_from_fort_list(terms, out_file_name);
        }
    }

    public static SubLObject create_disambiguator_rules_file_from_fort_file_id(final SubLObject file_id_num, SubLObject in_path, SubLObject out_path) {
        if (in_path == UNPROVIDED) {
            in_path = $str101$_host_george_term_id_lists_;
        }
        if (out_path == UNPROVIDED) {
            out_path = $str102$_host_george_disambig_rules_;
        }
        final SubLObject file_name = format(NIL, $str103$_Afort_id__4__0D_cfasl, in_path, file_id_num);
        final SubLObject terms = cfasl_utilities.cfasl_load(file_name);
        final SubLObject out_file_name = format(NIL, $str104$_Adisambiguator_rule_file__4__0D_, out_path, file_id_num);
        return create_disambiguator_rules_file_from_fort_list(terms, out_file_name);
    }

    public static final SubLObject create_rule_disambugation_condor_jobs_alt(SubLObject count) {
        {
            SubLObject n = NIL;
            for (n = ZERO_INTEGER; n.numL(count); n = add(n, ONE_INTEGER)) {
                format(T, $str_alt98$created_using_CREATE_RULE_DISAMBI);
                format(T, $str_alt99$arguments______progn__load____hom, n);
                format(T, $str_alt100$queue____);
            }
        }
        return NIL;
    }

    public static SubLObject create_rule_disambugation_condor_jobs(final SubLObject count) {
        SubLObject n;
        for (n = NIL, n = ZERO_INTEGER; n.numL(count); n = add(n, ONE_INTEGER)) {
            format(T, $str105$created_using_CREATE_RULE_DISAMBI);
            format(T, $str106$arguments______progn__load____hom, n);
            format(T, $str107$queue____);
        }
        return NIL;
    }

    public static SubLObject declare_rule_disambiguation_file() {
        declareMacro("with_new_rule_disambiguator", "WITH-NEW-RULE-DISAMBIGUATOR");
        declareFunction("rule_disambiguator_print_function_trampoline", "RULE-DISAMBIGUATOR-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("rule_disambiguator_p", "RULE-DISAMBIGUATOR-P", 1, 0, false);
        new rule_disambiguation.$rule_disambiguator_p$UnaryFunction();
        declareFunction("rdis_rule_file", "RDIS-RULE-FILE", 1, 0, false);
        declareFunction("rdis_count_file", "RDIS-COUNT-FILE", 1, 0, false);
        declareFunction("rdis_rules", "RDIS-RULES", 1, 0, false);
        declareFunction("rdis_counts", "RDIS-COUNTS", 1, 0, false);
        declareFunction("_csetf_rdis_rule_file", "_CSETF-RDIS-RULE-FILE", 2, 0, false);
        declareFunction("_csetf_rdis_count_file", "_CSETF-RDIS-COUNT-FILE", 2, 0, false);
        declareFunction("_csetf_rdis_rules", "_CSETF-RDIS-RULES", 2, 0, false);
        declareFunction("_csetf_rdis_counts", "_CSETF-RDIS-COUNTS", 2, 0, false);
        declareFunction("make_rule_disambiguator", "MAKE-RULE-DISAMBIGUATOR", 0, 1, false);
        declareFunction("visit_defstruct_rule_disambiguator", "VISIT-DEFSTRUCT-RULE-DISAMBIGUATOR", 2, 0, false);
        declareFunction("visit_defstruct_object_rule_disambiguator_method", "VISIT-DEFSTRUCT-OBJECT-RULE-DISAMBIGUATOR-METHOD", 2, 0, false);
        declareFunction("new_rule_disambiguator", "NEW-RULE-DISAMBIGUATOR", 0, 2, false);
        declareFunction("finalize_rule_disambiguator", "FINALIZE-RULE-DISAMBIGUATOR", 1, 0, false);
        declareFunction("rdis_print", "RDIS-PRINT", 3, 0, false);
        declareMacro("with_sense_bag_excepting_word", "WITH-SENSE-BAG-EXCEPTING-WORD");
        declareFunction("document_disambiguate_rule_disambiguator_method", "DOCUMENT-DISAMBIGUATE-RULE-DISAMBIGUATOR-METHOD", 2, 1, false);
        declareFunction("rdis_disambiguate", "RDIS-DISAMBIGUATE", 2, 1, false);
        declareFunction("sense_markers_not_requiring_licensing", "SENSE-MARKERS-NOT-REQUIRING-LICENSING", 1, 0, false);
        declareFunction("rule_void", "RULE-VOID", 2, 0, false);
        declareFunction("load_disambiguator_rules", "LOAD-DISAMBIGUATOR-RULES", 1, 0, false);
        declareFunction("load_disambiguator_counts", "LOAD-DISAMBIGUATOR-COUNTS", 1, 0, false);
        declareFunction("highest_count_sense_markers", "HIGHEST-COUNT-SENSE-MARKERS", 2, 0, false);
        declareFunction("ambiguous_p", "AMBIGUOUS-P", 1, 0, false);
        declareFunction("is_licensed_p", "IS-LICENSED-P", 3, 0, false);
        declareFunction("positive_clause_p", "POSITIVE-CLAUSE-P", 1, 0, false);
        declareFunction("negative_clause_p", "NEGATIVE-CLAUSE-P", 1, 0, false);
        declareFunction("clause_sign", "CLAUSE-SIGN", 1, 0, false);
        declareFunction("clause_term", "CLAUSE-TERM", 1, 0, false);
        declareFunction("new_sense_bag", "NEW-SENSE-BAG", 1, 0, false);
        declareFunction("sense_bag_licensesP", "SENSE-BAG-LICENSES?", 2, 0, false);
        declareFunction("disambiguation_rule_query", "DISAMBIGUATION-RULE-QUERY", 1, 0, false);
        declareFunction("create_disambiguator_rules_file", "CREATE-DISAMBIGUATOR-RULES-FILE", 0, 1, false);
        declareFunction("fort_disambiguation_rule_query", "FORT-DISAMBIGUATION-RULE-QUERY", 3, 0, false);
        declareFunction("term_alist_to_file_hash_table", "TERM-ALIST-TO-FILE-HASH-TABLE", 2, 3, false);
        declareFunction("alist_file_to_fht", "ALIST-FILE-TO-FHT", 2, 0, false);
        declareFunction("disambiguator_rule_fht_to_hl_id_text_file", "DISAMBIGUATOR-RULE-FHT-TO-HL-ID-TEXT-FILE", 2, 0, false);
        declareFunction("create_disambiguator_rules_file_from_forts", "CREATE-DISAMBIGUATOR-RULES-FILE-FROM-FORTS", 1, 0, false);
        declareFunction("create_disambiguator_rules_file_from_fort_list", "CREATE-DISAMBIGUATOR-RULES-FILE-FROM-FORT-LIST", 2, 0, false);
        declareFunction("create_disambiguator_rules_file_from_fort_file_id", "CREATE-DISAMBIGUATOR-RULES-FILE-FROM-FORT-FILE-ID", 1, 2, false);
        declareFunction("create_rule_disambugation_condor_jobs", "CREATE-RULE-DISAMBUGATION-CONDOR-JOBS", 1, 0, false);
        return NIL;
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLString $str_alt0$data_word_sense_disambiguation_ru = makeString("data/word-sense-disambiguation-rules.fht");

    static private final SubLString $str_alt1$data_word_sense_disambiguation_co = makeString("data/word-sense-disambiguation-counts.fht");

    static private final SubLList $list_alt2 = list(list(makeSymbol("DISAMBIGUATOR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt4 = list(list(makeSymbol("NEW-RULE-DISAMBIGUATOR")));

    static private final SubLList $list_alt8 = list(makeSymbol("RULE-FILE"), makeSymbol("COUNT-FILE"), makeSymbol("RULES"), makeSymbol("COUNTS"));

    static private final SubLList $list_alt9 = list(makeKeyword("RULE-FILE"), makeKeyword("COUNT-FILE"), makeKeyword("RULES"), makeKeyword("COUNTS"));

    static private final SubLList $list_alt10 = list(makeSymbol("RDIS-RULE-FILE"), makeSymbol("RDIS-COUNT-FILE"), makeSymbol("RDIS-RULES"), makeSymbol("RDIS-COUNTS"));

    static private final SubLList $list_alt11 = list(makeSymbol("_CSETF-RDIS-RULE-FILE"), makeSymbol("_CSETF-RDIS-COUNT-FILE"), makeSymbol("_CSETF-RDIS-RULES"), makeSymbol("_CSETF-RDIS-COUNTS"));

    public static SubLObject init_rule_disambiguation_file() {
        defparameter("*WORD-SENSE-DISAMBIGUATION-RULE-FILE*", $str0$data_word_sense_disambiguation_ru);
        defparameter("*WORD-SENSE-DISAMBIGUATION-COUNT-FILE*", $str1$data_word_sense_disambiguation_co);
        defconstant("*DTP-RULE-DISAMBIGUATOR*", RULE_DISAMBIGUATOR);
        return NIL;
    }

    public static SubLObject setup_rule_disambiguation_file() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_rule_disambiguator$.getGlobalValue(), symbol_function(RULE_DISAMBIGUATOR_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list14);
        def_csetf(RDIS_RULE_FILE, _CSETF_RDIS_RULE_FILE);
        def_csetf(RDIS_COUNT_FILE, _CSETF_RDIS_COUNT_FILE);
        def_csetf(RDIS_RULES, _CSETF_RDIS_RULES);
        def_csetf(RDIS_COUNTS, _CSETF_RDIS_COUNTS);
        identity(RULE_DISAMBIGUATOR);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_rule_disambiguator$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_RULE_DISAMBIGUATOR_METHOD));
        register_method(document_disambiguation.$document_disambiguate_method_table$.getGlobalValue(), $dtp_rule_disambiguator$.getGlobalValue(), symbol_function(DOCUMENT_DISAMBIGUATE_RULE_DISAMBIGUATOR_METHOD));
        return NIL;
    }

    static private final SubLString $str_alt26$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLString $str_alt28$__RULE_DISAMBIGUATOR_ = makeString("#<RULE-DISAMBIGUATOR ");

    static private final SubLString $str_alt29$_ = makeString(" ");

    static private final SubLString $str_alt30$_ = makeString(">");

    static private final SubLList $list_alt31 = list(list(makeSymbol("BAG"), makeSymbol("WORD")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym32$CYCL = makeUninternedSymbol("CYCL");

    static private final SubLSymbol $sym33$GENL_CYCL = makeUninternedSymbol("GENL-CYCL");

    @Override
    public void declareFunctions() {
        declare_rule_disambiguation_file();
    }

    static private final SubLList $list_alt38 = list(MINUS_ONE_INTEGER);

    @Override
    public void initializeVariables() {
        init_rule_disambiguation_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_rule_disambiguation_file();
    }

    static {
    }

    public static final SubLObject $const44$ContextuallyDependentLexicalMappi = reader_make_constant_shell("ContextuallyDependentLexicalMapping");

    static private final SubLString $str_alt46$Can_t_load_rules_from__a = makeString("Can't load rules from ~a");

    static private final SubLString $str_alt47$Can_t_load_counts_from__a = makeString("Can't load counts from ~a");

    static private final SubLList $list_alt49 = list(makeSymbol("?X"), makeSymbol("?Y"));

    static private final SubLList $list_alt51 = list(new SubLObject[]{ makeKeyword("INFERENCE-MODE"), makeKeyword("SHALLOW"), makeKeyword("ALLOW-INDETERMINATE-RESULTS?"), NIL, makeKeyword("DISJUNCTION-FREE-EL-VARS-POLICY"), makeKeyword("COMPUTE-INTERSECTION"), makeKeyword("INTERMEDIATE-STEP-VALIDATION-LEVEL"), makeKeyword("MINIMAL"), makeKeyword("MAX-TIME"), makeInteger(57600), makeKeyword("PROBABLY-APPROXIMATELY-DONE"), makeDouble(1.0), makeKeyword("ANSWER-LANGUAGE"), makeKeyword("EL"), makeKeyword("CONTINUABLE?"), NIL });

    static private final SubLString $str_alt52$data_word_sense_disambiguation_ru = makeString("data/word-sense-disambiguation-rules.txt");

    static private final SubLString $str_alt57$Unable_to_open__S = makeString("Unable to open ~S");

    static private final SubLString $str_alt58$___ = makeString("(~%");

    static private final SubLString $str_alt59$__S____S___ = makeString("(~S . ~S)~%");

    static private final SubLString $str_alt60$___ = makeString(")~%");

    public static final class $rule_disambiguator_p$UnaryFunction extends UnaryFunction {
        public $rule_disambiguator_p$UnaryFunction() {
            super(extractFunctionNamed("RULE-DISAMBIGUATOR-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return rule_disambiguator_p(arg1);
        }
    }

    static private final SubLList $list_alt62 = list(makeSymbol("?LICENSOR"));

    public static final SubLSymbol $kw65$ALLOW_INDETERMINATE_RESULTS_ = makeKeyword("ALLOW-INDETERMINATE-RESULTS?");

    static private final SubLString $str_alt78$_tmp_ = makeString("/tmp/");

    static private final SubLString $str_alt80$_a_is_invalid = makeString("~a is invalid");

    static private final SubLString $str_alt81$Can_t_load__a___a = makeString("Can't load ~a: ~a");

    static private final SubLList $list_alt86 = cons(makeSymbol("LICENSED?"), makeSymbol("TERM"));

    static private final SubLString $str_alt87$don_t_know_how_to_convert__A = makeString("don't know how to convert ~A");

    static private final SubLString $str_alt88$_A__A_ = makeString("~A,~A,");

    static private final SubLString $str_alt89$_A_ = makeString("~A,");

    static private final SubLString $str_alt90$__ = makeString("~%");

    static private final SubLList $list_alt91 = list(makeKeyword("INTERMEDIATE-STEP-VALIDATION-LEVEL"), makeKeyword("MINIMAL"));

    static private final SubLString $str_alt94$_host_george_term_id_lists_ = makeString("/host/george/term-id-lists/");

    static private final SubLString $str_alt95$_host_george_disambig_rules_ = makeString("/host/george/disambig-rules/");

    static private final SubLString $str_alt96$_Afort_id__4__0D_cfasl = makeString("~Afort-id-~4,'0D.cfasl");

    static private final SubLString $str_alt97$_Adisambiguator_rule_file__4__0D_ = makeString("~Adisambiguator-rule-file-~4,'0D.txt");

    static private final SubLString $str_alt98$created_using_CREATE_RULE_DISAMBI = makeString("created using CREATE-RULE-DISAMBIGUATION-CONDOR-JOBS in RULE-DISAMBIGUATION");

    static private final SubLString $str_alt99$arguments______progn__load____hom = makeString("arguments = \"\'(progn (load \"\"/home/daves/cycl/rule-disambiguation.lisp\"\") (load-transcript-file \"\"/cyc/top/transcripts/0917/billie-20061025103022-21843-local-0-sent.ts\"\" nil :none) (load-transcript-file \"\"/cyc/top/transcripts/0917/billie-20061025103022-21843-local-1-sent.ts\"\" nil :none) (create-disambiguator-rules-file-from-fort-file-id ~A))\'\"~%");

    static private final SubLString $str_alt100$queue____ = makeString("queue~%~%");
}

/**
 * Total time: 755 ms
 */
