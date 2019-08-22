package com.cyc.cycjava.cycl.inference.modules.removal;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.literal_atomic_sentence;
import static com.cyc.cycjava.cycl.el_utilities.make_binary_formula;
import static com.cyc.cycjava.cycl.el_utilities.make_unary_formula;
import static com.cyc.cycjava.cycl.el_utilities.replace_formula_arg;
import static com.cyc.cycjava.cycl.utilities_macros.note_funcall_helper_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.arg_type;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.czer_meta;
import com.cyc.cycjava.cycl.genl_mts;
import com.cyc.cycjava.cycl.hl_supports;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.rdf.rdf_graph;
import com.cyc.cycjava.cycl.rdf.rdf_uri;
import com.cyc.cycjava.cycl.rdf.rdf_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class removal_modules_rdf extends SubLTranslatedFile {
    public static final SubLFile me = new removal_modules_rdf();

    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rdf";

    public static final String myFingerPrint = "85ed2a3db5621990c7bceb0468633b017620db042880fa6ff0897da92deda64c";

    // defparameter
    // Definitions
    public static final SubLSymbol $allow_rdf_removalP$ = makeSymbol("*ALLOW-RDF-REMOVAL?*");

    private static final SubLSymbol $REMOVAL_RDF_UNIFY_ARG1 = makeKeyword("REMOVAL-RDF-UNIFY-ARG1");

    public static final SubLList $list1 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("MODULE-SUBTYPE"), makeKeyword("RDF"), makeKeyword("REQUIRED"), makeSymbol("ALLOW-RDF-REMOVAL?"), makeKeyword("REQUIRED-PATTERN"), list(list(makeKeyword("TEST"), makeSymbol("HAS-RDF-URI?")), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("TEST"), makeSymbol("HAS-RDF-URI?"))), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-RDF-UNIFY-ARG1"), makeKeyword("DOCUMENTATION"), makeString("Find arg1 bindings based on #$rdfURI values for arg0 and arg2."), makeKeyword("EXAMPLE"), makeString("(#$wikicompany:Customer ?WHO #$Nokia)") });

    private static final SubLSymbol $REMOVAL_RDF_UNIFY_ARG2 = makeKeyword("REMOVAL-RDF-UNIFY-ARG2");

    public static final SubLList $list3 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("MODULE-SUBTYPE"), makeKeyword("RDF"), makeKeyword("REQUIRED"), makeSymbol("ALLOW-RDF-REMOVAL?"), makeKeyword("REQUIRED-PATTERN"), list(list(makeKeyword("TEST"), makeSymbol("HAS-RDF-URI?")), list(makeKeyword("TEST"), makeSymbol("HAS-RDF-URI?")), list(makeKeyword("OR"), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("TEST"), makeSymbol("HAS-RDF-URI?")))), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-RDF-UNIFY-ARG2"), makeKeyword("DOCUMENTATION"), makeString("Find arg2 bindings based on #$rdfURI values for arg0 and arg1."), makeKeyword("EXAMPLE"), makeString("(#$wikicompany:Competitor #$Nokia ?WHO)") });

    private static final SubLSymbol $RDF_STRONGLY_PREFER_AT_LEAST_ONE_FULLY_BOUND_ARG = makeKeyword("RDF-STRONGLY-PREFER-AT-LEAST-ONE-FULLY-BOUND-ARG");

    public static final SubLList $list5 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), list(list(makeKeyword("AND"), list(makeKeyword("TEST"), makeSymbol("NOT-ASSERTIBLE-PREDICATE?")), list(makeKeyword("TEST"), makeSymbol("HAS-RDF-URI?"))), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("GROSSLY-DISPREFERRED"));

    public static final SubLSymbol $sym6$ALLOW_RDF_REMOVAL_ = makeSymbol("ALLOW-RDF-REMOVAL?");

    public static final SubLSymbol $sym7$HAS_RDF_URI_ = makeSymbol("HAS-RDF-URI?");

    public static final SubLList $list8 = list(list(makeSymbol("ASENT"), makeSymbol("BINDINGS"), makeSymbol("JUSTIFICATION"), makeSymbol("&KEY"), makeSymbol("JUSTIFY?"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list9 = list(makeKeyword("JUSTIFY?"), makeKeyword("DONE"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");





    public static final SubLSymbol $sym13$OBJECT = makeUninternedSymbol("OBJECT");

    public static final SubLSymbol $sym14$PREDICATE = makeUninternedSymbol("PREDICATE");

    public static final SubLSymbol $sym15$SUBJECT = makeUninternedSymbol("SUBJECT");

    public static final SubLSymbol $sym16$SUBJECT_VALUE = makeUninternedSymbol("SUBJECT-VALUE");

    public static final SubLSymbol $sym17$ARG1 = makeUninternedSymbol("ARG1");

    public static final SubLSymbol $sym18$OBJECT_URI = makeUninternedSymbol("OBJECT-URI");

    public static final SubLSymbol $sym19$PREDICATE_URI = makeUninternedSymbol("PREDICATE-URI");

    public static final SubLSymbol $sym20$GRAPH = makeUninternedSymbol("GRAPH");



    public static final SubLSymbol FORMULA_TERMS = makeSymbol("FORMULA-TERMS");



    public static final SubLSymbol INFERENCE_RDF_URIS_FOR_CYC_TERM = makeSymbol("INFERENCE-RDF-URIS-FOR-CYC-TERM");



    public static final SubLSymbol FIND_OR_DOWNLOAD_RDF_GRAPH = makeSymbol("FIND-OR-DOWNLOAD-RDF-GRAPH");



    public static final SubLSymbol RDF_GRAPH_P = makeSymbol("RDF-GRAPH-P");

    public static final SubLSymbol RDF_GRAPH_FIND_SUBJECTS = makeSymbol("RDF-GRAPH-FIND-SUBJECTS");

    public static final SubLSymbol RDF_URI_P = makeSymbol("RDF-URI-P");

    public static final SubLSymbol RDF_URI_TO_CYC_TERM = makeSymbol("RDF-URI-TO-CYC-TERM");



    public static final SubLSymbol TERM_UNIFY = makeSymbol("TERM-UNIFY");

    public static final SubLList $list34 = list(T, T);

    public static final SubLSymbol CPUSH_IF = makeSymbol("CPUSH-IF");

    public static final SubLSymbol MAKE_RDF_IST_GRAPH_SUPPORT = makeSymbol("MAKE-RDF-IST-GRAPH-SUPPORT");

    public static final SubLSymbol MAKE_RDF_URI_SUPPORT = makeSymbol("MAKE-RDF-URI-SUPPORT");

    public static final SubLSymbol $sym38$SUBJECT = makeUninternedSymbol("SUBJECT");

    public static final SubLSymbol $sym39$PREDICATE = makeUninternedSymbol("PREDICATE");

    public static final SubLSymbol $sym40$OBJECT = makeUninternedSymbol("OBJECT");

    public static final SubLSymbol $sym41$OBJECT_VALUE = makeUninternedSymbol("OBJECT-VALUE");

    public static final SubLSymbol $sym42$ARG2 = makeUninternedSymbol("ARG2");

    public static final SubLSymbol $sym43$SUBJECT_URI = makeUninternedSymbol("SUBJECT-URI");

    public static final SubLSymbol $sym44$PREDICATE_URI = makeUninternedSymbol("PREDICATE-URI");

    public static final SubLSymbol $sym45$GRAPH = makeUninternedSymbol("GRAPH");

    public static final SubLSymbol RDF_GRAPH_FIND_OBJECTS = makeSymbol("RDF-GRAPH-FIND-OBJECTS");

    private static final SubLObject $$rdfURI = reader_make_constant_shell(makeString("rdfURI"));

    public static final SubLList $list48 = list(makeKeyword("MAX-NUMBER"), ONE_INTEGER);

    public static final SubLList $list49 = list(makeSymbol("BINDINGS"), makeSymbol("SUPPORTS"));

    private static final SubLObject $$ResourcePCWAtURIFn = reader_make_constant_shell(makeString("ResourcePCWAtURIFn"));



    private static final SubLObject $$ist_Graph = reader_make_constant_shell(makeString("ist-Graph"));

    private static final SubLObject $$ContextOfNamedGraphFn = reader_make_constant_shell(makeString("ContextOfNamedGraphFn"));

    private static final SubLObject $$ResourceWithURIFn = reader_make_constant_shell(makeString("ResourceWithURIFn"));

    public static final SubLList $list55 = list(makeUninternedSymbol("PREDICATE"), makeUninternedSymbol("ARG1"), makeUninternedSymbol("OBJECT"));



    public static final SubLSymbol REMOVAL_RDF_UNIFY_ARG1 = makeSymbol("REMOVAL-RDF-UNIFY-ARG1");

    public static final SubLList $list58 = list(makeUninternedSymbol("PREDICATE"), makeUninternedSymbol("SUBJECT"), makeUninternedSymbol("ARG2"));

    public static final SubLSymbol REMOVAL_RDF_UNIFY_ARG2 = makeSymbol("REMOVAL-RDF-UNIFY-ARG2");

    public static final SubLList $list60 = list(makeSymbol("HL-MODULE"), makeSymbol("LITERAL"), makeSymbol("MT"), makeSymbol("TV"));

    public static final SubLSymbol HL_VERIFY_RDF = makeSymbol("HL-VERIFY-RDF");

    public static final SubLSymbol HL_JUSTIFY_RDF = makeSymbol("HL-JUSTIFY-RDF");

    public static final SubLSymbol HL_FORWARD_MT_COMBOS_RDF = makeSymbol("HL-FORWARD-MT-COMBOS-RDF");



    public static final SubLSymbol $sym65$TERM__ = makeSymbol("TERM-<");

    public static final SubLSymbol MAX_FLOOR_MTS_WHERE_RDF = makeSymbol("MAX-FLOOR-MTS-WHERE-RDF");

    public static final SubLList $list67 = list(makeKeyword("VERIFY"), makeSymbol("HL-VERIFY-RDF"), makeKeyword("JUSTIFY"), makeSymbol("HL-JUSTIFY-RDF"), makeKeyword("FORWARD-MT-COMBOS"), makeSymbol("HL-FORWARD-MT-COMBOS-RDF"));

    public static SubLObject allow_rdf_removalP(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return list_utilities.sublisp_boolean($allow_rdf_removalP$.getDynamicValue(thread));
    }

    public static SubLObject has_rdf_uriP(final SubLObject v_term) {
        return list_utilities.non_empty_list_p(inference_rdf_uris_for_cyc_term(v_term));
    }

    public static SubLObject inference_rdf_uris_for_cyc_term(final SubLObject v_term) {
        return rdf_utilities.rdf_uris_for_cyc_term(v_term, NIL, T);
    }

    public static SubLObject do_removal_rdf_unify_arg1(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list8);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject asent = NIL;
        SubLObject v_bindings = NIL;
        SubLObject justification = NIL;
        destructuring_bind_must_consp(current, datum, $list8);
        asent = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list8);
        v_bindings = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list8);
        justification = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list8);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list8);
            if (NIL == member(current_$1, $list9, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list8);
        }
        final SubLObject justifyP_tail = property_list_member($JUSTIFY_, current);
        final SubLObject justifyP = (NIL != justifyP_tail) ? cadr(justifyP_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject v_object = $sym13$OBJECT;
        final SubLObject predicate = $sym14$PREDICATE;
        final SubLObject subject = $sym15$SUBJECT;
        final SubLObject subject_value = $sym16$SUBJECT_VALUE;
        final SubLObject arg1 = $sym17$ARG1;
        final SubLObject object_uri = $sym18$OBJECT_URI;
        final SubLObject predicate_uri = $sym19$PREDICATE_URI;
        final SubLObject v_graph = $sym20$GRAPH;
        return list(CDESTRUCTURING_BIND, list(predicate, arg1, v_object), list(FORMULA_TERMS, asent), list(CSOME, list(object_uri, list(INFERENCE_RDF_URIS_FOR_CYC_TERM, v_object), done), list(CLET, list(list(v_graph, list(FIND_OR_DOWNLOAD_RDF_GRAPH, object_uri))), list(PWHEN, list(RDF_GRAPH_P, v_graph), list(CSOME, list(predicate_uri, list(INFERENCE_RDF_URIS_FOR_CYC_TERM, predicate), done), list(CSOME, list(subject_value, list(RDF_GRAPH_FIND_SUBJECTS, v_graph, predicate_uri, object_uri), done), list(PWHEN, list(RDF_URI_P, subject_value), list(CLET, list(list(subject, list(RDF_URI_TO_CYC_TERM, subject_value))), list(CMULTIPLE_VALUE_BIND, list(v_bindings, justification), listS(TERM_UNIFY, subject, arg1, $list34), listS(PWHEN, v_bindings, list(PWHEN, justifyP, list(CPUSH_IF, list(MAKE_RDF_IST_GRAPH_SUPPORT, v_graph, object_uri, predicate_uri, subject_value), justification), list(CPUSH_IF, list(MAKE_RDF_URI_SUPPORT, v_object, object_uri), justification), list(CPUSH_IF, list(MAKE_RDF_URI_SUPPORT, predicate, predicate_uri), justification), list(CPUSH_IF, list(MAKE_RDF_URI_SUPPORT, subject, subject_value), justification)), append(body, NIL)))))))))));
    }

    public static SubLObject do_removal_rdf_unify_arg2(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list8);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject asent = NIL;
        SubLObject v_bindings = NIL;
        SubLObject justification = NIL;
        destructuring_bind_must_consp(current, datum, $list8);
        asent = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list8);
        v_bindings = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list8);
        justification = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$2 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list8);
            current_$2 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list8);
            if (NIL == member(current_$2, $list9, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$2 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list8);
        }
        final SubLObject justifyP_tail = property_list_member($JUSTIFY_, current);
        final SubLObject justifyP = (NIL != justifyP_tail) ? cadr(justifyP_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject subject = $sym38$SUBJECT;
        final SubLObject predicate = $sym39$PREDICATE;
        final SubLObject v_object = $sym40$OBJECT;
        final SubLObject object_value = $sym41$OBJECT_VALUE;
        final SubLObject arg2 = $sym42$ARG2;
        final SubLObject subject_uri = $sym43$SUBJECT_URI;
        final SubLObject predicate_uri = $sym44$PREDICATE_URI;
        final SubLObject v_graph = $sym45$GRAPH;
        return list(CDESTRUCTURING_BIND, list(predicate, subject, arg2), list(FORMULA_TERMS, asent), list(CSOME, list(subject_uri, list(INFERENCE_RDF_URIS_FOR_CYC_TERM, subject), done), list(CLET, list(list(v_graph, list(FIND_OR_DOWNLOAD_RDF_GRAPH, subject_uri))), list(PWHEN, list(RDF_GRAPH_P, v_graph), list(CSOME, list(predicate_uri, list(INFERENCE_RDF_URIS_FOR_CYC_TERM, predicate), done), list(CSOME, list(object_value, list(RDF_GRAPH_FIND_OBJECTS, v_graph, subject_uri, predicate_uri), done), list(PWHEN, list(RDF_URI_P, object_value), list(CLET, list(list(v_object, list(RDF_URI_TO_CYC_TERM, object_value))), list(CMULTIPLE_VALUE_BIND, list(v_bindings, justification), listS(TERM_UNIFY, v_object, arg2, $list34), listS(PWHEN, v_bindings, list(PWHEN, justifyP, list(CPUSH_IF, list(MAKE_RDF_IST_GRAPH_SUPPORT, v_graph, subject_uri, predicate_uri, object_value), justification), list(CPUSH_IF, list(MAKE_RDF_URI_SUPPORT, v_object, object_value), justification), list(CPUSH_IF, list(MAKE_RDF_URI_SUPPORT, predicate, predicate_uri), justification), list(CPUSH_IF, list(MAKE_RDF_URI_SUPPORT, subject, subject_uri), justification)), append(body, NIL)))))))))));
    }

    public static SubLObject make_rdf_uri_support(final SubLObject v_term, final SubLObject v_rdf_uri) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject sentence = list($$rdfURI, v_term, possibly_rdf_uri_to_cyc_string(v_rdf_uri));
        final SubLObject assertion = czer_meta.find_assertion_cycl(sentence, UNPROVIDED);
        if (NIL != assertion) {
            return assertion;
        }
        final SubLObject query_results = ask_utilities.query_justified(sentence, mt_relevance_macros.$mt$.getDynamicValue(thread), $list48);
        if (NIL != query_results) {
            final SubLObject first_result = query_results.first();
            SubLObject current;
            final SubLObject datum = current = first_result;
            SubLObject v_bindings = NIL;
            SubLObject supports = NIL;
            destructuring_bind_must_consp(current, datum, $list49);
            v_bindings = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list49);
            supports = current.first();
            current = current.rest();
            if (NIL == current) {
                if (NIL != list_utilities.singletonP(supports)) {
                    return supports.first();
                }
            } else {
                cdestructuring_bind_error(datum, $list49);
            }
        }
        return NIL;
    }

    public static SubLObject possibly_rdf_uri_to_cyc_string(final SubLObject v_rdf_uri) {
        return NIL != rdf_uri.rdf_uri_p(v_rdf_uri) ? rdf_uri.rdf_uri_cyc_string(v_rdf_uri) : v_rdf_uri;
    }

    public static SubLObject make_rdf_ist_graph_support(final SubLObject v_graph, final SubLObject subject, final SubLObject predicate, final SubLObject v_object) {
        final SubLObject graph_term = (NIL != rdf_graph.rdf_graph_topic(v_graph)) ? make_unary_formula($$ResourcePCWAtURIFn, rdf_uri.rdf_uri_cyc_string(rdf_graph.rdf_graph_topic(v_graph))) : NIL;
        return NIL != graph_term ? arguments.make_hl_support($OPAQUE, make_binary_formula($$ist_Graph, make_unary_formula($$ContextOfNamedGraphFn, graph_term), make_binary_formula(make_unary_formula($$ResourceWithURIFn, possibly_rdf_uri_to_cyc_string(predicate)), make_unary_formula($$ResourceWithURIFn, possibly_rdf_uri_to_cyc_string(subject)), make_unary_formula($$ResourceWithURIFn, possibly_rdf_uri_to_cyc_string(v_object)))), UNPROVIDED, UNPROVIDED) : NIL;
    }

    public static SubLObject removal_rdf_unify_arg1(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.formula_terms(asent, UNPROVIDED);
        SubLObject predicate = NIL;
        SubLObject arg1_$3 = NIL;
        SubLObject v_object = NIL;
        destructuring_bind_must_consp(current, datum, $list55);
        predicate = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list55);
        arg1_$3 = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list55);
        v_object = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject csome_list_var = inference_rdf_uris_for_cyc_term(v_object);
            SubLObject object_uri = NIL;
            object_uri = csome_list_var.first();
            while (NIL != csome_list_var) {
                final SubLObject v_graph = rdf_graph.find_or_download_rdf_graph(object_uri);
                if (NIL != rdf_graph.rdf_graph_p(v_graph)) {
                    SubLObject csome_list_var_$4 = inference_rdf_uris_for_cyc_term(predicate);
                    SubLObject predicate_uri = NIL;
                    predicate_uri = csome_list_var_$4.first();
                    while (NIL != csome_list_var_$4) {
                        SubLObject csome_list_var_$5 = rdf_graph.rdf_graph_find_subjects(v_graph, predicate_uri, object_uri);
                        SubLObject subject_value = NIL;
                        subject_value = csome_list_var_$5.first();
                        while (NIL != csome_list_var_$5) {
                            if (NIL != rdf_uri.rdf_uri_p(subject_value)) {
                                final SubLObject subject = rdf_utilities.rdf_uri_to_cyc_term(subject_value);
                                thread.resetMultipleValues();
                                final SubLObject v_bindings = unification_utilities.term_unify(subject, arg1_$3, T, T);
                                final SubLObject justification = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if (NIL != v_bindings) {
                                    final SubLObject bound_arg1 = bindings.subst_bindings(v_bindings, arg1);
                                    final SubLObject unified_asent = replace_formula_arg(ONE_INTEGER, bound_arg1, asent);
                                    backward.removal_add_node(arguments.make_hl_support($RDF, unified_asent, UNPROVIDED, UNPROVIDED), v_bindings, justification);
                                }
                            }
                            csome_list_var_$5 = csome_list_var_$5.rest();
                            subject_value = csome_list_var_$5.first();
                        } 
                        csome_list_var_$4 = csome_list_var_$4.rest();
                        predicate_uri = csome_list_var_$4.first();
                    } 
                }
                csome_list_var = csome_list_var.rest();
                object_uri = csome_list_var.first();
            } 
        } else {
            cdestructuring_bind_error(datum, $list55);
        }
        return NIL;
    }

    public static SubLObject removal_rdf_unify_arg2(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.formula_terms(asent, UNPROVIDED);
        SubLObject predicate = NIL;
        SubLObject subject = NIL;
        SubLObject arg2_$6 = NIL;
        destructuring_bind_must_consp(current, datum, $list58);
        predicate = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list58);
        subject = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list58);
        arg2_$6 = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject csome_list_var = inference_rdf_uris_for_cyc_term(subject);
            SubLObject subject_uri = NIL;
            subject_uri = csome_list_var.first();
            while (NIL != csome_list_var) {
                final SubLObject v_graph = rdf_graph.find_or_download_rdf_graph(subject_uri);
                if (NIL != rdf_graph.rdf_graph_p(v_graph)) {
                    SubLObject csome_list_var_$7 = inference_rdf_uris_for_cyc_term(predicate);
                    SubLObject predicate_uri = NIL;
                    predicate_uri = csome_list_var_$7.first();
                    while (NIL != csome_list_var_$7) {
                        SubLObject csome_list_var_$8 = rdf_graph.rdf_graph_find_objects(v_graph, subject_uri, predicate_uri);
                        SubLObject object_value = NIL;
                        object_value = csome_list_var_$8.first();
                        while (NIL != csome_list_var_$8) {
                            if (NIL != rdf_uri.rdf_uri_p(object_value)) {
                                final SubLObject v_object = rdf_utilities.rdf_uri_to_cyc_term(object_value);
                                thread.resetMultipleValues();
                                final SubLObject v_bindings = unification_utilities.term_unify(v_object, arg2_$6, T, T);
                                final SubLObject justification = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if (NIL != v_bindings) {
                                    final SubLObject bound_arg2 = bindings.subst_bindings(v_bindings, arg2);
                                    final SubLObject unified_asent = replace_formula_arg(TWO_INTEGER, bound_arg2, asent);
                                    backward.removal_add_node(arguments.make_hl_support($RDF, unified_asent, UNPROVIDED, UNPROVIDED), v_bindings, justification);
                                }
                            }
                            csome_list_var_$8 = csome_list_var_$8.rest();
                            object_value = csome_list_var_$8.first();
                        } 
                        csome_list_var_$7 = csome_list_var_$7.rest();
                        predicate_uri = csome_list_var_$7.first();
                    } 
                }
                csome_list_var = csome_list_var.rest();
                subject_uri = csome_list_var.first();
            } 
        } else {
            cdestructuring_bind_error(datum, $list58);
        }
        return NIL;
    }

    public static SubLObject supports_for_rdf(final SubLObject asent, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject supports = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject current;
            final SubLObject datum = current = cycl_utilities.formula_terms(asent, UNPROVIDED);
            SubLObject predicate = NIL;
            SubLObject subject = NIL;
            SubLObject arg2 = NIL;
            destructuring_bind_must_consp(current, datum, $list58);
            predicate = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list58);
            subject = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list58);
            arg2 = current.first();
            current = current.rest();
            if (NIL == current) {
                if (NIL == supports) {
                    SubLObject csome_list_var = inference_rdf_uris_for_cyc_term(subject);
                    SubLObject subject_uri = NIL;
                    subject_uri = csome_list_var.first();
                    while ((NIL == supports) && (NIL != csome_list_var)) {
                        final SubLObject v_graph = rdf_graph.find_or_download_rdf_graph(subject_uri);
                        if ((NIL != rdf_graph.rdf_graph_p(v_graph)) && (NIL == supports)) {
                            SubLObject csome_list_var_$9 = inference_rdf_uris_for_cyc_term(predicate);
                            SubLObject predicate_uri = NIL;
                            predicate_uri = csome_list_var_$9.first();
                            while ((NIL == supports) && (NIL != csome_list_var_$9)) {
                                if (NIL == supports) {
                                    SubLObject csome_list_var_$10 = rdf_graph.rdf_graph_find_objects(v_graph, subject_uri, predicate_uri);
                                    SubLObject object_value = NIL;
                                    object_value = csome_list_var_$10.first();
                                    while ((NIL == supports) && (NIL != csome_list_var_$10)) {
                                        if (NIL != rdf_uri.rdf_uri_p(object_value)) {
                                            final SubLObject v_object = rdf_utilities.rdf_uri_to_cyc_term(object_value);
                                            thread.resetMultipleValues();
                                            final SubLObject v_bindings = unification_utilities.term_unify(v_object, arg2, T, T);
                                            SubLObject justification = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            if (NIL != v_bindings) {
                                                SubLObject var = make_rdf_ist_graph_support(v_graph, subject_uri, predicate_uri, object_value);
                                                if (NIL != var) {
                                                    justification = cons(var, justification);
                                                }
                                                var = make_rdf_uri_support(v_object, object_value);
                                                if (NIL != var) {
                                                    justification = cons(var, justification);
                                                }
                                                var = make_rdf_uri_support(predicate, predicate_uri);
                                                if (NIL != var) {
                                                    justification = cons(var, justification);
                                                }
                                                var = make_rdf_uri_support(subject, subject_uri);
                                                if (NIL != var) {
                                                    justification = cons(var, justification);
                                                }
                                                supports = justification;
                                            }
                                        }
                                        csome_list_var_$10 = csome_list_var_$10.rest();
                                        object_value = csome_list_var_$10.first();
                                    } 
                                }
                                csome_list_var_$9 = csome_list_var_$9.rest();
                                predicate_uri = csome_list_var_$9.first();
                            } 
                        }
                        csome_list_var = csome_list_var.rest();
                        subject_uri = csome_list_var.first();
                    } 
                }
            } else {
                cdestructuring_bind_error(datum, $list58);
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return supports;
    }

    public static SubLObject hl_verify_rdf(final SubLObject support) {
        SubLObject ans = NIL;
        SubLObject hl_module = NIL;
        SubLObject literal = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(support, support, $list60);
        hl_module = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, $list60);
        literal = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list60);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list60);
        tv = current.first();
        current = current.rest();
        if (NIL == current) {
            if (NIL == cycl_utilities.negatedP(literal)) {
                final SubLObject atomic_sentence = literal_atomic_sentence(literal);
                ans = list_utilities.non_empty_list_p(supports_for_rdf(atomic_sentence, mt));
            }
        } else {
            cdestructuring_bind_error(support, $list60);
        }
        return ans;
    }

    public static SubLObject hl_justify_rdf(final SubLObject support) {
        SubLObject hl_module = NIL;
        SubLObject literal = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(support, support, $list60);
        hl_module = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, $list60);
        literal = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list60);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list60);
        tv = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(support, $list60);
            return NIL;
        }
        if (NIL == cycl_utilities.negatedP(literal)) {
            final SubLObject atomic_sentence = literal_atomic_sentence(literal);
            return supports_for_rdf(atomic_sentence, mt);
        }
        return NIL;
    }

    public static SubLObject hl_forward_mt_combos_rdf(final SubLObject support) {
        SubLObject hl_module = NIL;
        SubLObject literal = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(support, support, $list60);
        hl_module = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, $list60);
        literal = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list60);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list60);
        tv = current.first();
        current = current.rest();
        if (NIL == current) {
            if (NIL == cycl_utilities.negatedP(literal)) {
                final SubLObject atomic_sentence = literal_atomic_sentence(literal);
                final SubLObject mts = max_floor_mts_where_rdf(atomic_sentence);
                SubLObject ans = NIL;
                SubLObject cdolist_list_var = mts;
                SubLObject mt_$11 = NIL;
                mt_$11 = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    ans = cons(arguments.make_hl_support(hl_module, literal, mt_$11, tv), ans);
                    cdolist_list_var = cdolist_list_var.rest();
                    mt_$11 = cdolist_list_var.first();
                } 
                return nreverse(ans);
            }
        } else {
            cdestructuring_bind_error(support, $list60);
        }
        return NIL;
    }

    public static SubLObject max_floor_mts_where_rdf(final SubLObject literal) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject mt_combos = NIL;
        SubLObject answer_mts = NIL;
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.formula_terms(literal_atomic_sentence(literal), UNPROVIDED);
        SubLObject predicate = NIL;
        SubLObject subject = NIL;
        SubLObject arg2 = NIL;
        destructuring_bind_must_consp(current, datum, $list58);
        predicate = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list58);
        subject = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list58);
        arg2 = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject csome_list_var = inference_rdf_uris_for_cyc_term(subject);
            SubLObject subject_uri = NIL;
            subject_uri = csome_list_var.first();
            while (NIL != csome_list_var) {
                final SubLObject v_graph = rdf_graph.find_or_download_rdf_graph(subject_uri);
                if (NIL != rdf_graph.rdf_graph_p(v_graph)) {
                    SubLObject csome_list_var_$12 = inference_rdf_uris_for_cyc_term(predicate);
                    SubLObject predicate_uri = NIL;
                    predicate_uri = csome_list_var_$12.first();
                    while (NIL != csome_list_var_$12) {
                        SubLObject csome_list_var_$13 = rdf_graph.rdf_graph_find_objects(v_graph, subject_uri, predicate_uri);
                        SubLObject object_value = NIL;
                        object_value = csome_list_var_$13.first();
                        while (NIL != csome_list_var_$13) {
                            if (NIL != rdf_uri.rdf_uri_p(object_value)) {
                                final SubLObject v_object = rdf_utilities.rdf_uri_to_cyc_term(object_value);
                                thread.resetMultipleValues();
                                final SubLObject v_bindings = unification_utilities.term_unify(v_object, arg2, T, T);
                                SubLObject justification = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if (NIL != v_bindings) {
                                    SubLObject var = make_rdf_ist_graph_support(v_graph, subject_uri, predicate_uri, object_value);
                                    if (NIL != var) {
                                        justification = cons(var, justification);
                                    }
                                    var = make_rdf_uri_support(v_object, object_value);
                                    if (NIL != var) {
                                        justification = cons(var, justification);
                                    }
                                    var = make_rdf_uri_support(predicate, predicate_uri);
                                    if (NIL != var) {
                                        justification = cons(var, justification);
                                    }
                                    var = make_rdf_uri_support(subject, subject_uri);
                                    if (NIL != var) {
                                        justification = cons(var, justification);
                                    }
                                    SubLObject combo = Mapping.mapcar(SUPPORT_MT, justification);
                                    combo = delete_duplicates(combo, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    final SubLObject item_var;
                                    combo = item_var = Sort.sort(combo, symbol_function($sym65$TERM__), UNPROVIDED);
                                    if (NIL == member(item_var, mt_combos, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                        mt_combos = cons(item_var, mt_combos);
                                    }
                                }
                            }
                            csome_list_var_$13 = csome_list_var_$13.rest();
                            object_value = csome_list_var_$13.first();
                        } 
                        csome_list_var_$12 = csome_list_var_$12.rest();
                        predicate_uri = csome_list_var_$12.first();
                    } 
                }
                csome_list_var = csome_list_var.rest();
                subject_uri = csome_list_var.first();
            } 
        } else {
            cdestructuring_bind_error(datum, $list58);
        }
        SubLObject cdolist_list_var = mt_combos;
        SubLObject mt_combo = NIL;
        mt_combo = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject target_set = genl_mts.max_floor_mts(mt_combo, UNPROVIDED, UNPROVIDED);
            answer_mts = append(target_set, answer_mts);
            cdolist_list_var = cdolist_list_var.rest();
            mt_combo = cdolist_list_var.first();
        } 
        answer_mts = list_utilities.remove_duplicate_forts(answer_mts);
        SubLObject sane_mts = NIL;
        SubLObject cdolist_list_var2 = answer_mts;
        SubLObject answer_mt = NIL;
        answer_mt = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            if (NIL != arg_type.semantically_valid_literalP(literal, answer_mt, UNPROVIDED)) {
                sane_mts = cons(answer_mt, sane_mts);
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            answer_mt = cdolist_list_var2.first();
        } 
        answer_mts = sane_mts;
        return answer_mts;
    }

    public static SubLObject declare_removal_modules_rdf_file() {
        declareFunction(me, "allow_rdf_removalP", "ALLOW-RDF-REMOVAL?", 1, 1, false);
        declareFunction(me, "has_rdf_uriP", "HAS-RDF-URI?", 1, 0, false);
        declareFunction(me, "inference_rdf_uris_for_cyc_term", "INFERENCE-RDF-URIS-FOR-CYC-TERM", 1, 0, false);
        declareMacro(me, "do_removal_rdf_unify_arg1", "DO-REMOVAL-RDF-UNIFY-ARG1");
        declareMacro(me, "do_removal_rdf_unify_arg2", "DO-REMOVAL-RDF-UNIFY-ARG2");
        declareFunction(me, "make_rdf_uri_support", "MAKE-RDF-URI-SUPPORT", 2, 0, false);
        declareFunction(me, "possibly_rdf_uri_to_cyc_string", "POSSIBLY-RDF-URI-TO-CYC-STRING", 1, 0, false);
        declareFunction(me, "make_rdf_ist_graph_support", "MAKE-RDF-IST-GRAPH-SUPPORT", 4, 0, false);
        declareFunction(me, "removal_rdf_unify_arg1", "REMOVAL-RDF-UNIFY-ARG1", 1, 1, false);
        declareFunction(me, "removal_rdf_unify_arg2", "REMOVAL-RDF-UNIFY-ARG2", 1, 1, false);
        declareFunction(me, "supports_for_rdf", "SUPPORTS-FOR-RDF", 2, 0, false);
        declareFunction(me, "hl_verify_rdf", "HL-VERIFY-RDF", 1, 0, false);
        declareFunction(me, "hl_justify_rdf", "HL-JUSTIFY-RDF", 1, 0, false);
        declareFunction(me, "hl_forward_mt_combos_rdf", "HL-FORWARD-MT-COMBOS-RDF", 1, 0, false);
        declareFunction(me, "max_floor_mts_where_rdf", "MAX-FLOOR-MTS-WHERE-RDF", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_rdf_file() {
        defparameter("*ALLOW-RDF-REMOVAL?*", NIL);
        return NIL;
    }

    public static SubLObject setup_removal_modules_rdf_file() {
        inference_modules.inference_removal_module($REMOVAL_RDF_UNIFY_ARG1, $list1);
        inference_modules.inference_removal_module($REMOVAL_RDF_UNIFY_ARG2, $list3);
        preference_modules.inference_preference_module($RDF_STRONGLY_PREFER_AT_LEAST_ONE_FULLY_BOUND_ARG, $list5);
        note_funcall_helper_function($sym6$ALLOW_RDF_REMOVAL_);
        note_funcall_helper_function($sym7$HAS_RDF_URI_);
        note_funcall_helper_function(REMOVAL_RDF_UNIFY_ARG1);
        note_funcall_helper_function(REMOVAL_RDF_UNIFY_ARG2);
        note_funcall_helper_function(HL_VERIFY_RDF);
        note_funcall_helper_function(HL_JUSTIFY_RDF);
        note_funcall_helper_function(HL_FORWARD_MT_COMBOS_RDF);
        note_funcall_helper_function(MAX_FLOOR_MTS_WHERE_RDF);
        hl_supports.setup_hl_support_module($RDF, $list67);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_removal_modules_rdf_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_modules_rdf_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_rdf_file();
    }

    
}

/**
 * Total time: 241 ms
 */
