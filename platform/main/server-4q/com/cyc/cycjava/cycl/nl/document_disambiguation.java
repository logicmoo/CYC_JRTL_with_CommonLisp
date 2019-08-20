package com.cyc.cycjava.cycl.nl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.method_func;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.make_vector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.putf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_string;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.V10;
import com.cyc.cycjava.cycl.document;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.nl_api_datastructures;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class document_disambiguation extends SubLTranslatedFile implements V10 {
    public static final SubLFile me = new document_disambiguation();



    // defconstant
    public static final SubLSymbol $dtp_simple_disambiguator$ = makeSymbol("*DTP-SIMPLE-DISAMBIGUATOR*");

    // deflexical
    public static final SubLSymbol $document_disambiguate_method_table$ = makeSymbol("*DOCUMENT-DISAMBIGUATE-METHOD-TABLE*");

    private static final SubLSymbol SIMPLE_DISAMBIGUATOR = makeSymbol("SIMPLE-DISAMBIGUATOR");

    private static final SubLSymbol SIMPLE_DISAMBIGUATOR_P = makeSymbol("SIMPLE-DISAMBIGUATOR-P");

    private static final SubLList $list2 = list(makeSymbol("MIN-STRENGTH"));

    private static final SubLList $list3 = list(makeKeyword("MIN-STRENGTH"));

    private static final SubLList $list4 = list(makeSymbol("SDIS-MIN-STRENGTH"));

    private static final SubLList $list5 = list(makeSymbol("_CSETF-SDIS-MIN-STRENGTH"));

    private static final SubLSymbol SDIS_PRINT = makeSymbol("SDIS-PRINT");

    private static final SubLSymbol SIMPLE_DISAMBIGUATOR_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("SIMPLE-DISAMBIGUATOR-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list8 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("SIMPLE-DISAMBIGUATOR-P"));

    private static final SubLSymbol SDIS_MIN_STRENGTH = makeSymbol("SDIS-MIN-STRENGTH");

    private static final SubLSymbol _CSETF_SDIS_MIN_STRENGTH = makeSymbol("_CSETF-SDIS-MIN-STRENGTH");

    private static final SubLSymbol $MIN_STRENGTH = makeKeyword("MIN-STRENGTH");

    private static final SubLString $str12$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_SIMPLE_DISAMBIGUATOR = makeSymbol("MAKE-SIMPLE-DISAMBIGUATOR");





    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_SIMPLE_DISAMBIGUATOR_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-SIMPLE-DISAMBIGUATOR-METHOD");

    private static final SubLString $str18$__SIMPLE_DISAMBIGUATOR_ = makeString("#<SIMPLE-DISAMBIGUATOR ");

    private static final SubLString $str19$_ = makeString(">");





    private static final SubLSymbol DOCUMENT_DISAMBIGUATE_SIMPLE_DISAMBIGUATOR_METHOD = makeSymbol("DOCUMENT-DISAMBIGUATE-SIMPLE-DISAMBIGUATOR-METHOD");

    private static final SubLObject $const23$ContextuallyDependentLexicalMappi = reader_make_constant_shell(makeString("ContextuallyDependentLexicalMapping"));

    private static final SubLList $list24 = list(reader_make_constant_shell(makeString("VanishinglyRareLexicalMapping")));

    private static final SubLList $list25 = list(reader_make_constant_shell(makeString("VanishinglyRareLexicalMapping")), reader_make_constant_shell(makeString("ContextuallyDependentLexicalMapping")));

    private static final SubLObject $$PrimaryLexicalMapping = reader_make_constant_shell(makeString("PrimaryLexicalMapping"));

    public static SubLObject simple_disambiguator_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        sdis_print(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject simple_disambiguator_p(final SubLObject v_object) {
        return v_object.getClass() == $simple_disambiguator_native.class ? T : NIL;
    }

    public static SubLObject sdis_min_strength(final SubLObject v_object) {
        assert NIL != simple_disambiguator_p(v_object) : "document_disambiguation.simple_disambiguator_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject _csetf_sdis_min_strength(final SubLObject v_object, final SubLObject value) {
        assert NIL != simple_disambiguator_p(v_object) : "document_disambiguation.simple_disambiguator_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject make_simple_disambiguator(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $simple_disambiguator_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($MIN_STRENGTH)) {
                _csetf_sdis_min_strength(v_new, current_value);
            } else {
                Errors.error($str12$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }

    public static SubLObject visit_defstruct_simple_disambiguator(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_SIMPLE_DISAMBIGUATOR, ONE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $MIN_STRENGTH, sdis_min_strength(obj));
        funcall(visitor_fn, obj, $END, MAKE_SIMPLE_DISAMBIGUATOR, ONE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_simple_disambiguator_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_simple_disambiguator(obj, visitor_fn);
    }

    public static SubLObject new_simple_disambiguator(final SubLObject min_strength) {
        final SubLObject disambiguator = make_simple_disambiguator(UNPROVIDED);
        _csetf_sdis_min_strength(disambiguator, min_strength);
        return disambiguator;
    }

    public static SubLObject sdis_print(final SubLObject sdis, final SubLObject stream, final SubLObject depth) {
        write_string($str18$__SIMPLE_DISAMBIGUATOR_, stream, UNPROVIDED, UNPROVIDED);
        write_string(string_utilities.to_string(sdis_min_strength(sdis)), stream, UNPROVIDED, UNPROVIDED);
        write_string($str19$_, stream, UNPROVIDED, UNPROVIDED);
        return sdis;
    }

    public static SubLObject document_disambiguate(final SubLObject disambiguator, final SubLObject doc, SubLObject v_context) {
        if (v_context == UNPROVIDED) {
            v_context = NIL;
        }
        final SubLObject method_function = method_func(disambiguator, $document_disambiguate_method_table$.getGlobalValue());
        if (NIL != method_function) {
            return funcall(method_function, disambiguator, doc, v_context);
        }
        return doc;
    }

    public static SubLObject document_disambiguate_simple_disambiguator_method(final SubLObject disambiguator, final SubLObject doc, SubLObject v_context) {
        if (v_context == UNPROVIDED) {
            v_context = NIL;
        }
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
        SubLObject interps;
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
                    interps = document.word_interps(word);
                    putf(document.word_info(word), $INTERPS, interps_meeting_threshold(sdis_min_strength(disambiguator), interps));
                    cdolist_list_var = cdolist_list_var.rest();
                    word = cdolist_list_var.first();
                } 
            }
        }
        return doc;
    }

    public static SubLObject interps_meeting_threshold(final SubLObject threshold, final SubLObject interps) {
        SubLObject ret_list = NIL;
        SubLObject cdolist_list_var = interps;
        SubLObject interp = NIL;
        interp = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject pragmatics = nl_api_datastructures.get_nl_interp_pragmatics(interp);
            final SubLObject invalid_strengths = get_invalid_strengths_for_threshold(threshold);
            SubLObject invalidP = NIL;
            if (NIL == invalidP) {
                SubLObject csome_list_var = invalid_strengths;
                SubLObject strength = NIL;
                strength = csome_list_var.first();
                while ((NIL == invalidP) && (NIL != csome_list_var)) {
                    if (NIL != list_utilities.tree_find(strength, pragmatics, UNPROVIDED, UNPROVIDED)) {
                        invalidP = T;
                    }
                    csome_list_var = csome_list_var.rest();
                    strength = csome_list_var.first();
                } 
            }
            if (NIL == invalidP) {
                ret_list = cons(interp, ret_list);
            }
            cdolist_list_var = cdolist_list_var.rest();
            interp = cdolist_list_var.first();
        } 
        return nreverse(ret_list);
    }

    public static SubLObject get_invalid_strengths_for_threshold(final SubLObject threshold_strength) {
        if (threshold_strength.eql($const23$ContextuallyDependentLexicalMappi)) {
            return $list24;
        }
        if (threshold_strength.equal(NIL)) {
            return $list25;
        }
        if (threshold_strength.equal($$PrimaryLexicalMapping)) {
            return $list25;
        }
        return NIL;
    }

    public static SubLObject declare_document_disambiguation_file() {
        declareFunction("simple_disambiguator_print_function_trampoline", "SIMPLE-DISAMBIGUATOR-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("simple_disambiguator_p", "SIMPLE-DISAMBIGUATOR-P", 1, 0, false);
        new document_disambiguation.$simple_disambiguator_p$UnaryFunction();
        declareFunction("sdis_min_strength", "SDIS-MIN-STRENGTH", 1, 0, false);
        declareFunction("_csetf_sdis_min_strength", "_CSETF-SDIS-MIN-STRENGTH", 2, 0, false);
        declareFunction("make_simple_disambiguator", "MAKE-SIMPLE-DISAMBIGUATOR", 0, 1, false);
        declareFunction("visit_defstruct_simple_disambiguator", "VISIT-DEFSTRUCT-SIMPLE-DISAMBIGUATOR", 2, 0, false);
        declareFunction("visit_defstruct_object_simple_disambiguator_method", "VISIT-DEFSTRUCT-OBJECT-SIMPLE-DISAMBIGUATOR-METHOD", 2, 0, false);
        declareFunction("new_simple_disambiguator", "NEW-SIMPLE-DISAMBIGUATOR", 1, 0, false);
        declareFunction("sdis_print", "SDIS-PRINT", 3, 0, false);
        declareFunction("document_disambiguate", "DOCUMENT-DISAMBIGUATE", 2, 1, false);
        declareFunction("document_disambiguate_simple_disambiguator_method", "DOCUMENT-DISAMBIGUATE-SIMPLE-DISAMBIGUATOR-METHOD", 2, 1, false);
        declareFunction("interps_meeting_threshold", "INTERPS-MEETING-THRESHOLD", 2, 0, false);
        declareFunction("get_invalid_strengths_for_threshold", "GET-INVALID-STRENGTHS-FOR-THRESHOLD", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_document_disambiguation_file() {
        defconstant("*DTP-SIMPLE-DISAMBIGUATOR*", SIMPLE_DISAMBIGUATOR);
        deflexical("*DOCUMENT-DISAMBIGUATE-METHOD-TABLE*", make_vector($int$256, NIL));
        return NIL;
    }

    public static SubLObject setup_document_disambiguation_file() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_simple_disambiguator$.getGlobalValue(), symbol_function(SIMPLE_DISAMBIGUATOR_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list8);
        def_csetf(SDIS_MIN_STRENGTH, _CSETF_SDIS_MIN_STRENGTH);
        identity(SIMPLE_DISAMBIGUATOR);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_simple_disambiguator$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_SIMPLE_DISAMBIGUATOR_METHOD));
        register_method($document_disambiguate_method_table$.getGlobalValue(), $dtp_simple_disambiguator$.getGlobalValue(), symbol_function(DOCUMENT_DISAMBIGUATE_SIMPLE_DISAMBIGUATOR_METHOD));
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_document_disambiguation_file();
    }

    @Override
    public void initializeVariables() {
        init_document_disambiguation_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_document_disambiguation_file();
    }

    static {






























    }

    public static final class $simple_disambiguator_native extends SubLStructNative {
        public SubLObject $min_strength;

        private static final SubLStructDeclNative structDecl;

        private $simple_disambiguator_native() {
            this.$min_strength = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$min_strength;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$min_strength = value;
        }

        static {
            structDecl = makeStructDeclNative($simple_disambiguator_native.class, SIMPLE_DISAMBIGUATOR, SIMPLE_DISAMBIGUATOR_P, $list2, $list3, new String[]{ "$min_strength" }, $list4, $list5, SDIS_PRINT);
        }
    }

    public static final class $simple_disambiguator_p$UnaryFunction extends UnaryFunction {
        public $simple_disambiguator_p$UnaryFunction() {
            super(extractFunctionNamed("SIMPLE-DISAMBIGUATOR-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return simple_disambiguator_p(arg1);
        }
    }
}

/**
 * Total time: 127 ms
 */
