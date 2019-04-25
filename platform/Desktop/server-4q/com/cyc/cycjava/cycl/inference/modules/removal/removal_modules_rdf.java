package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.hl_supports;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.arg_type;
import com.cyc.cycjava.cycl.genl_mts;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.rdf.rdf_graph;
import com.cyc.cycjava.cycl.rdf.rdf_uri;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.czer_meta;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.rdf.rdf_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_rdf extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rdf";
    public static final String myFingerPrint = "85ed2a3db5621990c7bceb0468633b017620db042880fa6ff0897da92deda64c";
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rdf.lisp", position = 2091L)
    public static SubLSymbol $allow_rdf_removalP$;
    private static final SubLSymbol $kw0$REMOVAL_RDF_UNIFY_ARG1;
    private static final SubLList $list1;
    private static final SubLSymbol $kw2$REMOVAL_RDF_UNIFY_ARG2;
    private static final SubLList $list3;
    private static final SubLSymbol $kw4$RDF_STRONGLY_PREFER_AT_LEAST_ONE_FULLY_BOUND_ARG;
    private static final SubLList $list5;
    private static final SubLSymbol $sym6$ALLOW_RDF_REMOVAL_;
    private static final SubLSymbol $sym7$HAS_RDF_URI_;
    private static final SubLList $list8;
    private static final SubLList $list9;
    private static final SubLSymbol $kw10$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw11$JUSTIFY_;
    private static final SubLSymbol $kw12$DONE;
    private static final SubLSymbol $sym13$OBJECT;
    private static final SubLSymbol $sym14$PREDICATE;
    private static final SubLSymbol $sym15$SUBJECT;
    private static final SubLSymbol $sym16$SUBJECT_VALUE;
    private static final SubLSymbol $sym17$ARG1;
    private static final SubLSymbol $sym18$OBJECT_URI;
    private static final SubLSymbol $sym19$PREDICATE_URI;
    private static final SubLSymbol $sym20$GRAPH;
    private static final SubLSymbol $sym21$CDESTRUCTURING_BIND;
    private static final SubLSymbol $sym22$FORMULA_TERMS;
    private static final SubLSymbol $sym23$CSOME;
    private static final SubLSymbol $sym24$INFERENCE_RDF_URIS_FOR_CYC_TERM;
    private static final SubLSymbol $sym25$CLET;
    private static final SubLSymbol $sym26$FIND_OR_DOWNLOAD_RDF_GRAPH;
    private static final SubLSymbol $sym27$PWHEN;
    private static final SubLSymbol $sym28$RDF_GRAPH_P;
    private static final SubLSymbol $sym29$RDF_GRAPH_FIND_SUBJECTS;
    private static final SubLSymbol $sym30$RDF_URI_P;
    private static final SubLSymbol $sym31$RDF_URI_TO_CYC_TERM;
    private static final SubLSymbol $sym32$CMULTIPLE_VALUE_BIND;
    private static final SubLSymbol $sym33$TERM_UNIFY;
    private static final SubLList $list34;
    private static final SubLSymbol $sym35$CPUSH_IF;
    private static final SubLSymbol $sym36$MAKE_RDF_IST_GRAPH_SUPPORT;
    private static final SubLSymbol $sym37$MAKE_RDF_URI_SUPPORT;
    private static final SubLSymbol $sym38$SUBJECT;
    private static final SubLSymbol $sym39$PREDICATE;
    private static final SubLSymbol $sym40$OBJECT;
    private static final SubLSymbol $sym41$OBJECT_VALUE;
    private static final SubLSymbol $sym42$ARG2;
    private static final SubLSymbol $sym43$SUBJECT_URI;
    private static final SubLSymbol $sym44$PREDICATE_URI;
    private static final SubLSymbol $sym45$GRAPH;
    private static final SubLSymbol $sym46$RDF_GRAPH_FIND_OBJECTS;
    private static final SubLObject $const47$rdfURI;
    private static final SubLList $list48;
    private static final SubLList $list49;
    private static final SubLObject $const50$ResourcePCWAtURIFn;
    private static final SubLSymbol $kw51$OPAQUE;
    private static final SubLObject $const52$ist_Graph;
    private static final SubLObject $const53$ContextOfNamedGraphFn;
    private static final SubLObject $const54$ResourceWithURIFn;
    private static final SubLList $list55;
    private static final SubLSymbol $kw56$RDF;
    private static final SubLSymbol $sym57$REMOVAL_RDF_UNIFY_ARG1;
    private static final SubLList $list58;
    private static final SubLSymbol $sym59$REMOVAL_RDF_UNIFY_ARG2;
    private static final SubLList $list60;
    private static final SubLSymbol $sym61$HL_VERIFY_RDF;
    private static final SubLSymbol $sym62$HL_JUSTIFY_RDF;
    private static final SubLSymbol $sym63$HL_FORWARD_MT_COMBOS_RDF;
    private static final SubLSymbol $sym64$SUPPORT_MT;
    private static final SubLSymbol $sym65$TERM__;
    private static final SubLSymbol $sym66$MAX_FLOOR_MTS_WHERE_RDF;
    private static final SubLList $list67;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rdf.lisp", position = 2143L)
    public static SubLObject allow_rdf_removalP(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_rdf.UNPROVIDED) {
            sense = (SubLObject)removal_modules_rdf.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return list_utilities.sublisp_boolean(removal_modules_rdf.$allow_rdf_removalP$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rdf.lisp", position = 2274L)
    public static SubLObject has_rdf_uriP(final SubLObject v_term) {
        return list_utilities.non_empty_list_p(inference_rdf_uris_for_cyc_term(v_term));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rdf.lisp", position = 2386L)
    public static SubLObject inference_rdf_uris_for_cyc_term(final SubLObject v_term) {
        return rdf_utilities.rdf_uris_for_cyc_term(v_term, (SubLObject)removal_modules_rdf.NIL, (SubLObject)removal_modules_rdf.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rdf.lisp", position = 2486L)
    public static SubLObject do_removal_rdf_unify_arg1(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_rdf.$list8);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject asent = (SubLObject)removal_modules_rdf.NIL;
        SubLObject v_bindings = (SubLObject)removal_modules_rdf.NIL;
        SubLObject justification = (SubLObject)removal_modules_rdf.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_rdf.$list8);
        asent = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_rdf.$list8);
        v_bindings = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_rdf.$list8);
        justification = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)removal_modules_rdf.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)removal_modules_rdf.NIL;
        SubLObject current_$1 = (SubLObject)removal_modules_rdf.NIL;
        while (removal_modules_rdf.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)removal_modules_rdf.$list8);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)removal_modules_rdf.$list8);
            if (removal_modules_rdf.NIL == conses_high.member(current_$1, (SubLObject)removal_modules_rdf.$list9, (SubLObject)removal_modules_rdf.UNPROVIDED, (SubLObject)removal_modules_rdf.UNPROVIDED)) {
                bad = (SubLObject)removal_modules_rdf.T;
            }
            if (current_$1 == removal_modules_rdf.$kw10$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (removal_modules_rdf.NIL != bad && removal_modules_rdf.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)removal_modules_rdf.$list8);
        }
        final SubLObject justifyP_tail = cdestructuring_bind.property_list_member((SubLObject)removal_modules_rdf.$kw11$JUSTIFY_, current);
        final SubLObject justifyP = (SubLObject)((removal_modules_rdf.NIL != justifyP_tail) ? conses_high.cadr(justifyP_tail) : removal_modules_rdf.NIL);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)removal_modules_rdf.$kw12$DONE, current);
        final SubLObject done = (SubLObject)((removal_modules_rdf.NIL != done_tail) ? conses_high.cadr(done_tail) : removal_modules_rdf.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject v_object = (SubLObject)removal_modules_rdf.$sym13$OBJECT;
        final SubLObject predicate = (SubLObject)removal_modules_rdf.$sym14$PREDICATE;
        final SubLObject subject = (SubLObject)removal_modules_rdf.$sym15$SUBJECT;
        final SubLObject subject_value = (SubLObject)removal_modules_rdf.$sym16$SUBJECT_VALUE;
        final SubLObject arg1 = (SubLObject)removal_modules_rdf.$sym17$ARG1;
        final SubLObject object_uri = (SubLObject)removal_modules_rdf.$sym18$OBJECT_URI;
        final SubLObject predicate_uri = (SubLObject)removal_modules_rdf.$sym19$PREDICATE_URI;
        final SubLObject v_graph = (SubLObject)removal_modules_rdf.$sym20$GRAPH;
        return (SubLObject)ConsesLow.list((SubLObject)removal_modules_rdf.$sym21$CDESTRUCTURING_BIND, (SubLObject)ConsesLow.list(predicate, arg1, v_object), (SubLObject)ConsesLow.list((SubLObject)removal_modules_rdf.$sym22$FORMULA_TERMS, asent), (SubLObject)ConsesLow.list((SubLObject)removal_modules_rdf.$sym23$CSOME, (SubLObject)ConsesLow.list(object_uri, (SubLObject)ConsesLow.list((SubLObject)removal_modules_rdf.$sym24$INFERENCE_RDF_URIS_FOR_CYC_TERM, v_object), done), (SubLObject)ConsesLow.list((SubLObject)removal_modules_rdf.$sym25$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(v_graph, (SubLObject)ConsesLow.list((SubLObject)removal_modules_rdf.$sym26$FIND_OR_DOWNLOAD_RDF_GRAPH, object_uri))), (SubLObject)ConsesLow.list((SubLObject)removal_modules_rdf.$sym27$PWHEN, (SubLObject)ConsesLow.list((SubLObject)removal_modules_rdf.$sym28$RDF_GRAPH_P, v_graph), (SubLObject)ConsesLow.list((SubLObject)removal_modules_rdf.$sym23$CSOME, (SubLObject)ConsesLow.list(predicate_uri, (SubLObject)ConsesLow.list((SubLObject)removal_modules_rdf.$sym24$INFERENCE_RDF_URIS_FOR_CYC_TERM, predicate), done), (SubLObject)ConsesLow.list((SubLObject)removal_modules_rdf.$sym23$CSOME, (SubLObject)ConsesLow.list(subject_value, (SubLObject)ConsesLow.list((SubLObject)removal_modules_rdf.$sym29$RDF_GRAPH_FIND_SUBJECTS, v_graph, predicate_uri, object_uri), done), (SubLObject)ConsesLow.list((SubLObject)removal_modules_rdf.$sym27$PWHEN, (SubLObject)ConsesLow.list((SubLObject)removal_modules_rdf.$sym30$RDF_URI_P, subject_value), (SubLObject)ConsesLow.list((SubLObject)removal_modules_rdf.$sym25$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(subject, (SubLObject)ConsesLow.list((SubLObject)removal_modules_rdf.$sym31$RDF_URI_TO_CYC_TERM, subject_value))), (SubLObject)ConsesLow.list((SubLObject)removal_modules_rdf.$sym32$CMULTIPLE_VALUE_BIND, (SubLObject)ConsesLow.list(v_bindings, justification), (SubLObject)ConsesLow.listS((SubLObject)removal_modules_rdf.$sym33$TERM_UNIFY, subject, arg1, (SubLObject)removal_modules_rdf.$list34), (SubLObject)ConsesLow.listS((SubLObject)removal_modules_rdf.$sym27$PWHEN, v_bindings, (SubLObject)ConsesLow.list((SubLObject)removal_modules_rdf.$sym27$PWHEN, justifyP, (SubLObject)ConsesLow.list((SubLObject)removal_modules_rdf.$sym35$CPUSH_IF, (SubLObject)ConsesLow.list((SubLObject)removal_modules_rdf.$sym36$MAKE_RDF_IST_GRAPH_SUPPORT, v_graph, object_uri, predicate_uri, subject_value), justification), (SubLObject)ConsesLow.list((SubLObject)removal_modules_rdf.$sym35$CPUSH_IF, (SubLObject)ConsesLow.list((SubLObject)removal_modules_rdf.$sym37$MAKE_RDF_URI_SUPPORT, v_object, object_uri), justification), (SubLObject)ConsesLow.list((SubLObject)removal_modules_rdf.$sym35$CPUSH_IF, (SubLObject)ConsesLow.list((SubLObject)removal_modules_rdf.$sym37$MAKE_RDF_URI_SUPPORT, predicate, predicate_uri), justification), (SubLObject)ConsesLow.list((SubLObject)removal_modules_rdf.$sym35$CPUSH_IF, (SubLObject)ConsesLow.list((SubLObject)removal_modules_rdf.$sym37$MAKE_RDF_URI_SUPPORT, subject, subject_value), justification)), ConsesLow.append(body, (SubLObject)removal_modules_rdf.NIL)))))))))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rdf.lisp", position = 3733L)
    public static SubLObject do_removal_rdf_unify_arg2(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_rdf.$list8);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject asent = (SubLObject)removal_modules_rdf.NIL;
        SubLObject v_bindings = (SubLObject)removal_modules_rdf.NIL;
        SubLObject justification = (SubLObject)removal_modules_rdf.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_rdf.$list8);
        asent = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_rdf.$list8);
        v_bindings = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_rdf.$list8);
        justification = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)removal_modules_rdf.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)removal_modules_rdf.NIL;
        SubLObject current_$2 = (SubLObject)removal_modules_rdf.NIL;
        while (removal_modules_rdf.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)removal_modules_rdf.$list8);
            current_$2 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)removal_modules_rdf.$list8);
            if (removal_modules_rdf.NIL == conses_high.member(current_$2, (SubLObject)removal_modules_rdf.$list9, (SubLObject)removal_modules_rdf.UNPROVIDED, (SubLObject)removal_modules_rdf.UNPROVIDED)) {
                bad = (SubLObject)removal_modules_rdf.T;
            }
            if (current_$2 == removal_modules_rdf.$kw10$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (removal_modules_rdf.NIL != bad && removal_modules_rdf.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)removal_modules_rdf.$list8);
        }
        final SubLObject justifyP_tail = cdestructuring_bind.property_list_member((SubLObject)removal_modules_rdf.$kw11$JUSTIFY_, current);
        final SubLObject justifyP = (SubLObject)((removal_modules_rdf.NIL != justifyP_tail) ? conses_high.cadr(justifyP_tail) : removal_modules_rdf.NIL);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)removal_modules_rdf.$kw12$DONE, current);
        final SubLObject done = (SubLObject)((removal_modules_rdf.NIL != done_tail) ? conses_high.cadr(done_tail) : removal_modules_rdf.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject subject = (SubLObject)removal_modules_rdf.$sym38$SUBJECT;
        final SubLObject predicate = (SubLObject)removal_modules_rdf.$sym39$PREDICATE;
        final SubLObject v_object = (SubLObject)removal_modules_rdf.$sym40$OBJECT;
        final SubLObject object_value = (SubLObject)removal_modules_rdf.$sym41$OBJECT_VALUE;
        final SubLObject arg2 = (SubLObject)removal_modules_rdf.$sym42$ARG2;
        final SubLObject subject_uri = (SubLObject)removal_modules_rdf.$sym43$SUBJECT_URI;
        final SubLObject predicate_uri = (SubLObject)removal_modules_rdf.$sym44$PREDICATE_URI;
        final SubLObject v_graph = (SubLObject)removal_modules_rdf.$sym45$GRAPH;
        return (SubLObject)ConsesLow.list((SubLObject)removal_modules_rdf.$sym21$CDESTRUCTURING_BIND, (SubLObject)ConsesLow.list(predicate, subject, arg2), (SubLObject)ConsesLow.list((SubLObject)removal_modules_rdf.$sym22$FORMULA_TERMS, asent), (SubLObject)ConsesLow.list((SubLObject)removal_modules_rdf.$sym23$CSOME, (SubLObject)ConsesLow.list(subject_uri, (SubLObject)ConsesLow.list((SubLObject)removal_modules_rdf.$sym24$INFERENCE_RDF_URIS_FOR_CYC_TERM, subject), done), (SubLObject)ConsesLow.list((SubLObject)removal_modules_rdf.$sym25$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(v_graph, (SubLObject)ConsesLow.list((SubLObject)removal_modules_rdf.$sym26$FIND_OR_DOWNLOAD_RDF_GRAPH, subject_uri))), (SubLObject)ConsesLow.list((SubLObject)removal_modules_rdf.$sym27$PWHEN, (SubLObject)ConsesLow.list((SubLObject)removal_modules_rdf.$sym28$RDF_GRAPH_P, v_graph), (SubLObject)ConsesLow.list((SubLObject)removal_modules_rdf.$sym23$CSOME, (SubLObject)ConsesLow.list(predicate_uri, (SubLObject)ConsesLow.list((SubLObject)removal_modules_rdf.$sym24$INFERENCE_RDF_URIS_FOR_CYC_TERM, predicate), done), (SubLObject)ConsesLow.list((SubLObject)removal_modules_rdf.$sym23$CSOME, (SubLObject)ConsesLow.list(object_value, (SubLObject)ConsesLow.list((SubLObject)removal_modules_rdf.$sym46$RDF_GRAPH_FIND_OBJECTS, v_graph, subject_uri, predicate_uri), done), (SubLObject)ConsesLow.list((SubLObject)removal_modules_rdf.$sym27$PWHEN, (SubLObject)ConsesLow.list((SubLObject)removal_modules_rdf.$sym30$RDF_URI_P, object_value), (SubLObject)ConsesLow.list((SubLObject)removal_modules_rdf.$sym25$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(v_object, (SubLObject)ConsesLow.list((SubLObject)removal_modules_rdf.$sym31$RDF_URI_TO_CYC_TERM, object_value))), (SubLObject)ConsesLow.list((SubLObject)removal_modules_rdf.$sym32$CMULTIPLE_VALUE_BIND, (SubLObject)ConsesLow.list(v_bindings, justification), (SubLObject)ConsesLow.listS((SubLObject)removal_modules_rdf.$sym33$TERM_UNIFY, v_object, arg2, (SubLObject)removal_modules_rdf.$list34), (SubLObject)ConsesLow.listS((SubLObject)removal_modules_rdf.$sym27$PWHEN, v_bindings, (SubLObject)ConsesLow.list((SubLObject)removal_modules_rdf.$sym27$PWHEN, justifyP, (SubLObject)ConsesLow.list((SubLObject)removal_modules_rdf.$sym35$CPUSH_IF, (SubLObject)ConsesLow.list((SubLObject)removal_modules_rdf.$sym36$MAKE_RDF_IST_GRAPH_SUPPORT, v_graph, subject_uri, predicate_uri, object_value), justification), (SubLObject)ConsesLow.list((SubLObject)removal_modules_rdf.$sym35$CPUSH_IF, (SubLObject)ConsesLow.list((SubLObject)removal_modules_rdf.$sym37$MAKE_RDF_URI_SUPPORT, v_object, object_value), justification), (SubLObject)ConsesLow.list((SubLObject)removal_modules_rdf.$sym35$CPUSH_IF, (SubLObject)ConsesLow.list((SubLObject)removal_modules_rdf.$sym37$MAKE_RDF_URI_SUPPORT, predicate, predicate_uri), justification), (SubLObject)ConsesLow.list((SubLObject)removal_modules_rdf.$sym35$CPUSH_IF, (SubLObject)ConsesLow.list((SubLObject)removal_modules_rdf.$sym37$MAKE_RDF_URI_SUPPORT, subject, subject_uri), justification)), ConsesLow.append(body, (SubLObject)removal_modules_rdf.NIL)))))))))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rdf.lisp", position = 5029L)
    public static SubLObject make_rdf_uri_support(final SubLObject v_term, final SubLObject v_rdf_uri) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject sentence = (SubLObject)ConsesLow.list(removal_modules_rdf.$const47$rdfURI, v_term, possibly_rdf_uri_to_cyc_string(v_rdf_uri));
        final SubLObject assertion = czer_meta.find_assertion_cycl(sentence, (SubLObject)removal_modules_rdf.UNPROVIDED);
        if (removal_modules_rdf.NIL != assertion) {
            return assertion;
        }
        final SubLObject query_results = ask_utilities.query_justified(sentence, mt_relevance_macros.$mt$.getDynamicValue(thread), (SubLObject)removal_modules_rdf.$list48);
        if (removal_modules_rdf.NIL != query_results) {
            final SubLObject first_result = query_results.first();
            SubLObject current;
            final SubLObject datum = current = first_result;
            SubLObject v_bindings = (SubLObject)removal_modules_rdf.NIL;
            SubLObject supports = (SubLObject)removal_modules_rdf.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_rdf.$list49);
            v_bindings = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_rdf.$list49);
            supports = current.first();
            current = current.rest();
            if (removal_modules_rdf.NIL == current) {
                if (removal_modules_rdf.NIL != list_utilities.singletonP(supports)) {
                    return supports.first();
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)removal_modules_rdf.$list49);
            }
        }
        return (SubLObject)removal_modules_rdf.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rdf.lisp", position = 5562L)
    public static SubLObject possibly_rdf_uri_to_cyc_string(final SubLObject v_rdf_uri) {
        return (removal_modules_rdf.NIL != rdf_uri.rdf_uri_p(v_rdf_uri)) ? rdf_uri.rdf_uri_cyc_string(v_rdf_uri) : v_rdf_uri;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rdf.lisp", position = 5702L)
    public static SubLObject make_rdf_ist_graph_support(final SubLObject v_graph, final SubLObject subject, final SubLObject predicate, final SubLObject v_object) {
        final SubLObject graph_term = (SubLObject)((removal_modules_rdf.NIL != rdf_graph.rdf_graph_topic(v_graph)) ? el_utilities.make_unary_formula(removal_modules_rdf.$const50$ResourcePCWAtURIFn, rdf_uri.rdf_uri_cyc_string(rdf_graph.rdf_graph_topic(v_graph))) : removal_modules_rdf.NIL);
        return (SubLObject)((removal_modules_rdf.NIL != graph_term) ? arguments.make_hl_support((SubLObject)removal_modules_rdf.$kw51$OPAQUE, el_utilities.make_binary_formula(removal_modules_rdf.$const52$ist_Graph, el_utilities.make_unary_formula(removal_modules_rdf.$const53$ContextOfNamedGraphFn, graph_term), el_utilities.make_binary_formula(el_utilities.make_unary_formula(removal_modules_rdf.$const54$ResourceWithURIFn, possibly_rdf_uri_to_cyc_string(predicate)), el_utilities.make_unary_formula(removal_modules_rdf.$const54$ResourceWithURIFn, possibly_rdf_uri_to_cyc_string(subject)), el_utilities.make_unary_formula(removal_modules_rdf.$const54$ResourceWithURIFn, possibly_rdf_uri_to_cyc_string(v_object)))), (SubLObject)removal_modules_rdf.UNPROVIDED, (SubLObject)removal_modules_rdf.UNPROVIDED) : removal_modules_rdf.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rdf.lisp", position = 6403L)
    public static SubLObject removal_rdf_unify_arg1(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_rdf.UNPROVIDED) {
            sense = (SubLObject)removal_modules_rdf.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_rdf.UNPROVIDED);
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.formula_terms(asent, (SubLObject)removal_modules_rdf.UNPROVIDED);
        SubLObject predicate = (SubLObject)removal_modules_rdf.NIL;
        SubLObject arg1_$3 = (SubLObject)removal_modules_rdf.NIL;
        SubLObject v_object = (SubLObject)removal_modules_rdf.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_rdf.$list55);
        predicate = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_rdf.$list55);
        arg1_$3 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_rdf.$list55);
        v_object = current.first();
        current = current.rest();
        if (removal_modules_rdf.NIL == current) {
            SubLObject csome_list_var = inference_rdf_uris_for_cyc_term(v_object);
            SubLObject object_uri = (SubLObject)removal_modules_rdf.NIL;
            object_uri = csome_list_var.first();
            while (removal_modules_rdf.NIL != csome_list_var) {
                final SubLObject v_graph = rdf_graph.find_or_download_rdf_graph(object_uri);
                if (removal_modules_rdf.NIL != rdf_graph.rdf_graph_p(v_graph)) {
                    SubLObject csome_list_var_$4 = inference_rdf_uris_for_cyc_term(predicate);
                    SubLObject predicate_uri = (SubLObject)removal_modules_rdf.NIL;
                    predicate_uri = csome_list_var_$4.first();
                    while (removal_modules_rdf.NIL != csome_list_var_$4) {
                        SubLObject csome_list_var_$5 = rdf_graph.rdf_graph_find_subjects(v_graph, predicate_uri, object_uri);
                        SubLObject subject_value = (SubLObject)removal_modules_rdf.NIL;
                        subject_value = csome_list_var_$5.first();
                        while (removal_modules_rdf.NIL != csome_list_var_$5) {
                            if (removal_modules_rdf.NIL != rdf_uri.rdf_uri_p(subject_value)) {
                                final SubLObject subject = rdf_utilities.rdf_uri_to_cyc_term(subject_value);
                                thread.resetMultipleValues();
                                final SubLObject v_bindings = unification_utilities.term_unify(subject, arg1_$3, (SubLObject)removal_modules_rdf.T, (SubLObject)removal_modules_rdf.T);
                                final SubLObject justification = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if (removal_modules_rdf.NIL != v_bindings) {
                                    final SubLObject bound_arg1 = bindings.subst_bindings(v_bindings, arg1);
                                    final SubLObject unified_asent = el_utilities.replace_formula_arg((SubLObject)removal_modules_rdf.ONE_INTEGER, bound_arg1, asent);
                                    backward.removal_add_node(arguments.make_hl_support((SubLObject)removal_modules_rdf.$kw56$RDF, unified_asent, (SubLObject)removal_modules_rdf.UNPROVIDED, (SubLObject)removal_modules_rdf.UNPROVIDED), v_bindings, justification);
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
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)removal_modules_rdf.$list55);
        }
        return (SubLObject)removal_modules_rdf.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rdf.lisp", position = 6817L)
    public static SubLObject removal_rdf_unify_arg2(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_rdf.UNPROVIDED) {
            sense = (SubLObject)removal_modules_rdf.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_rdf.UNPROVIDED);
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.formula_terms(asent, (SubLObject)removal_modules_rdf.UNPROVIDED);
        SubLObject predicate = (SubLObject)removal_modules_rdf.NIL;
        SubLObject subject = (SubLObject)removal_modules_rdf.NIL;
        SubLObject arg2_$6 = (SubLObject)removal_modules_rdf.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_rdf.$list58);
        predicate = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_rdf.$list58);
        subject = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_rdf.$list58);
        arg2_$6 = current.first();
        current = current.rest();
        if (removal_modules_rdf.NIL == current) {
            SubLObject csome_list_var = inference_rdf_uris_for_cyc_term(subject);
            SubLObject subject_uri = (SubLObject)removal_modules_rdf.NIL;
            subject_uri = csome_list_var.first();
            while (removal_modules_rdf.NIL != csome_list_var) {
                final SubLObject v_graph = rdf_graph.find_or_download_rdf_graph(subject_uri);
                if (removal_modules_rdf.NIL != rdf_graph.rdf_graph_p(v_graph)) {
                    SubLObject csome_list_var_$7 = inference_rdf_uris_for_cyc_term(predicate);
                    SubLObject predicate_uri = (SubLObject)removal_modules_rdf.NIL;
                    predicate_uri = csome_list_var_$7.first();
                    while (removal_modules_rdf.NIL != csome_list_var_$7) {
                        SubLObject csome_list_var_$8 = rdf_graph.rdf_graph_find_objects(v_graph, subject_uri, predicate_uri);
                        SubLObject object_value = (SubLObject)removal_modules_rdf.NIL;
                        object_value = csome_list_var_$8.first();
                        while (removal_modules_rdf.NIL != csome_list_var_$8) {
                            if (removal_modules_rdf.NIL != rdf_uri.rdf_uri_p(object_value)) {
                                final SubLObject v_object = rdf_utilities.rdf_uri_to_cyc_term(object_value);
                                thread.resetMultipleValues();
                                final SubLObject v_bindings = unification_utilities.term_unify(v_object, arg2_$6, (SubLObject)removal_modules_rdf.T, (SubLObject)removal_modules_rdf.T);
                                final SubLObject justification = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if (removal_modules_rdf.NIL != v_bindings) {
                                    final SubLObject bound_arg2 = bindings.subst_bindings(v_bindings, arg2);
                                    final SubLObject unified_asent = el_utilities.replace_formula_arg((SubLObject)removal_modules_rdf.TWO_INTEGER, bound_arg2, asent);
                                    backward.removal_add_node(arguments.make_hl_support((SubLObject)removal_modules_rdf.$kw56$RDF, unified_asent, (SubLObject)removal_modules_rdf.UNPROVIDED, (SubLObject)removal_modules_rdf.UNPROVIDED), v_bindings, justification);
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
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)removal_modules_rdf.$list58);
        }
        return (SubLObject)removal_modules_rdf.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rdf.lisp", position = 7231L)
    public static SubLObject supports_for_rdf(final SubLObject asent, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject supports = (SubLObject)removal_modules_rdf.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject current;
            final SubLObject datum = current = cycl_utilities.formula_terms(asent, (SubLObject)removal_modules_rdf.UNPROVIDED);
            SubLObject predicate = (SubLObject)removal_modules_rdf.NIL;
            SubLObject subject = (SubLObject)removal_modules_rdf.NIL;
            SubLObject arg2 = (SubLObject)removal_modules_rdf.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_rdf.$list58);
            predicate = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_rdf.$list58);
            subject = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_rdf.$list58);
            arg2 = current.first();
            current = current.rest();
            if (removal_modules_rdf.NIL == current) {
                if (removal_modules_rdf.NIL == supports) {
                    SubLObject csome_list_var = inference_rdf_uris_for_cyc_term(subject);
                    SubLObject subject_uri = (SubLObject)removal_modules_rdf.NIL;
                    subject_uri = csome_list_var.first();
                    while (removal_modules_rdf.NIL == supports && removal_modules_rdf.NIL != csome_list_var) {
                        final SubLObject v_graph = rdf_graph.find_or_download_rdf_graph(subject_uri);
                        if (removal_modules_rdf.NIL != rdf_graph.rdf_graph_p(v_graph) && removal_modules_rdf.NIL == supports) {
                            SubLObject csome_list_var_$9 = inference_rdf_uris_for_cyc_term(predicate);
                            SubLObject predicate_uri = (SubLObject)removal_modules_rdf.NIL;
                            predicate_uri = csome_list_var_$9.first();
                            while (removal_modules_rdf.NIL == supports && removal_modules_rdf.NIL != csome_list_var_$9) {
                                if (removal_modules_rdf.NIL == supports) {
                                    SubLObject csome_list_var_$10 = rdf_graph.rdf_graph_find_objects(v_graph, subject_uri, predicate_uri);
                                    SubLObject object_value = (SubLObject)removal_modules_rdf.NIL;
                                    object_value = csome_list_var_$10.first();
                                    while (removal_modules_rdf.NIL == supports && removal_modules_rdf.NIL != csome_list_var_$10) {
                                        if (removal_modules_rdf.NIL != rdf_uri.rdf_uri_p(object_value)) {
                                            final SubLObject v_object = rdf_utilities.rdf_uri_to_cyc_term(object_value);
                                            thread.resetMultipleValues();
                                            final SubLObject v_bindings = unification_utilities.term_unify(v_object, arg2, (SubLObject)removal_modules_rdf.T, (SubLObject)removal_modules_rdf.T);
                                            SubLObject justification = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            if (removal_modules_rdf.NIL != v_bindings) {
                                                SubLObject var = make_rdf_ist_graph_support(v_graph, subject_uri, predicate_uri, object_value);
                                                if (removal_modules_rdf.NIL != var) {
                                                    justification = (SubLObject)ConsesLow.cons(var, justification);
                                                }
                                                var = make_rdf_uri_support(v_object, object_value);
                                                if (removal_modules_rdf.NIL != var) {
                                                    justification = (SubLObject)ConsesLow.cons(var, justification);
                                                }
                                                var = make_rdf_uri_support(predicate, predicate_uri);
                                                if (removal_modules_rdf.NIL != var) {
                                                    justification = (SubLObject)ConsesLow.cons(var, justification);
                                                }
                                                var = make_rdf_uri_support(subject, subject_uri);
                                                if (removal_modules_rdf.NIL != var) {
                                                    justification = (SubLObject)ConsesLow.cons(var, justification);
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
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)removal_modules_rdf.$list58);
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return supports;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rdf.lisp", position = 7482L)
    public static SubLObject hl_verify_rdf(final SubLObject support) {
        SubLObject ans = (SubLObject)removal_modules_rdf.NIL;
        SubLObject hl_module = (SubLObject)removal_modules_rdf.NIL;
        SubLObject literal = (SubLObject)removal_modules_rdf.NIL;
        SubLObject mt = (SubLObject)removal_modules_rdf.NIL;
        SubLObject tv = (SubLObject)removal_modules_rdf.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, (SubLObject)removal_modules_rdf.$list60);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)removal_modules_rdf.$list60);
        literal = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)removal_modules_rdf.$list60);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)removal_modules_rdf.$list60);
        tv = current.first();
        current = current.rest();
        if (removal_modules_rdf.NIL == current) {
            if (removal_modules_rdf.NIL == cycl_utilities.negatedP(literal)) {
                final SubLObject atomic_sentence = el_utilities.literal_atomic_sentence(literal);
                ans = list_utilities.non_empty_list_p(supports_for_rdf(atomic_sentence, mt));
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(support, (SubLObject)removal_modules_rdf.$list60);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rdf.lisp", position = 7818L)
    public static SubLObject hl_justify_rdf(final SubLObject support) {
        SubLObject hl_module = (SubLObject)removal_modules_rdf.NIL;
        SubLObject literal = (SubLObject)removal_modules_rdf.NIL;
        SubLObject mt = (SubLObject)removal_modules_rdf.NIL;
        SubLObject tv = (SubLObject)removal_modules_rdf.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, (SubLObject)removal_modules_rdf.$list60);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)removal_modules_rdf.$list60);
        literal = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)removal_modules_rdf.$list60);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)removal_modules_rdf.$list60);
        tv = current.first();
        current = current.rest();
        if (removal_modules_rdf.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(support, (SubLObject)removal_modules_rdf.$list60);
            return (SubLObject)removal_modules_rdf.NIL;
        }
        if (removal_modules_rdf.NIL == cycl_utilities.negatedP(literal)) {
            final SubLObject atomic_sentence = el_utilities.literal_atomic_sentence(literal);
            return supports_for_rdf(atomic_sentence, mt);
        }
        return (SubLObject)removal_modules_rdf.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rdf.lisp", position = 8112L)
    public static SubLObject hl_forward_mt_combos_rdf(final SubLObject support) {
        SubLObject hl_module = (SubLObject)removal_modules_rdf.NIL;
        SubLObject literal = (SubLObject)removal_modules_rdf.NIL;
        SubLObject mt = (SubLObject)removal_modules_rdf.NIL;
        SubLObject tv = (SubLObject)removal_modules_rdf.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, (SubLObject)removal_modules_rdf.$list60);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)removal_modules_rdf.$list60);
        literal = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)removal_modules_rdf.$list60);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)removal_modules_rdf.$list60);
        tv = current.first();
        current = current.rest();
        if (removal_modules_rdf.NIL == current) {
            if (removal_modules_rdf.NIL == cycl_utilities.negatedP(literal)) {
                final SubLObject atomic_sentence = el_utilities.literal_atomic_sentence(literal);
                final SubLObject mts = max_floor_mts_where_rdf(atomic_sentence);
                SubLObject ans = (SubLObject)removal_modules_rdf.NIL;
                SubLObject cdolist_list_var = mts;
                SubLObject mt_$11 = (SubLObject)removal_modules_rdf.NIL;
                mt_$11 = cdolist_list_var.first();
                while (removal_modules_rdf.NIL != cdolist_list_var) {
                    ans = (SubLObject)ConsesLow.cons(arguments.make_hl_support(hl_module, literal, mt_$11, tv), ans);
                    cdolist_list_var = cdolist_list_var.rest();
                    mt_$11 = cdolist_list_var.first();
                }
                return Sequences.nreverse(ans);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(support, (SubLObject)removal_modules_rdf.$list60);
        }
        return (SubLObject)removal_modules_rdf.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rdf.lisp", position = 8510L)
    public static SubLObject max_floor_mts_where_rdf(final SubLObject literal) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject mt_combos = (SubLObject)removal_modules_rdf.NIL;
        SubLObject answer_mts = (SubLObject)removal_modules_rdf.NIL;
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.formula_terms(el_utilities.literal_atomic_sentence(literal), (SubLObject)removal_modules_rdf.UNPROVIDED);
        SubLObject predicate = (SubLObject)removal_modules_rdf.NIL;
        SubLObject subject = (SubLObject)removal_modules_rdf.NIL;
        SubLObject arg2 = (SubLObject)removal_modules_rdf.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_rdf.$list58);
        predicate = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_rdf.$list58);
        subject = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_rdf.$list58);
        arg2 = current.first();
        current = current.rest();
        if (removal_modules_rdf.NIL == current) {
            SubLObject csome_list_var = inference_rdf_uris_for_cyc_term(subject);
            SubLObject subject_uri = (SubLObject)removal_modules_rdf.NIL;
            subject_uri = csome_list_var.first();
            while (removal_modules_rdf.NIL != csome_list_var) {
                final SubLObject v_graph = rdf_graph.find_or_download_rdf_graph(subject_uri);
                if (removal_modules_rdf.NIL != rdf_graph.rdf_graph_p(v_graph)) {
                    SubLObject csome_list_var_$12 = inference_rdf_uris_for_cyc_term(predicate);
                    SubLObject predicate_uri = (SubLObject)removal_modules_rdf.NIL;
                    predicate_uri = csome_list_var_$12.first();
                    while (removal_modules_rdf.NIL != csome_list_var_$12) {
                        SubLObject csome_list_var_$13 = rdf_graph.rdf_graph_find_objects(v_graph, subject_uri, predicate_uri);
                        SubLObject object_value = (SubLObject)removal_modules_rdf.NIL;
                        object_value = csome_list_var_$13.first();
                        while (removal_modules_rdf.NIL != csome_list_var_$13) {
                            if (removal_modules_rdf.NIL != rdf_uri.rdf_uri_p(object_value)) {
                                final SubLObject v_object = rdf_utilities.rdf_uri_to_cyc_term(object_value);
                                thread.resetMultipleValues();
                                final SubLObject v_bindings = unification_utilities.term_unify(v_object, arg2, (SubLObject)removal_modules_rdf.T, (SubLObject)removal_modules_rdf.T);
                                SubLObject justification = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if (removal_modules_rdf.NIL != v_bindings) {
                                    SubLObject var = make_rdf_ist_graph_support(v_graph, subject_uri, predicate_uri, object_value);
                                    if (removal_modules_rdf.NIL != var) {
                                        justification = (SubLObject)ConsesLow.cons(var, justification);
                                    }
                                    var = make_rdf_uri_support(v_object, object_value);
                                    if (removal_modules_rdf.NIL != var) {
                                        justification = (SubLObject)ConsesLow.cons(var, justification);
                                    }
                                    var = make_rdf_uri_support(predicate, predicate_uri);
                                    if (removal_modules_rdf.NIL != var) {
                                        justification = (SubLObject)ConsesLow.cons(var, justification);
                                    }
                                    var = make_rdf_uri_support(subject, subject_uri);
                                    if (removal_modules_rdf.NIL != var) {
                                        justification = (SubLObject)ConsesLow.cons(var, justification);
                                    }
                                    SubLObject combo = Mapping.mapcar((SubLObject)removal_modules_rdf.$sym64$SUPPORT_MT, justification);
                                    combo = Sequences.delete_duplicates(combo, (SubLObject)removal_modules_rdf.UNPROVIDED, (SubLObject)removal_modules_rdf.UNPROVIDED, (SubLObject)removal_modules_rdf.UNPROVIDED, (SubLObject)removal_modules_rdf.UNPROVIDED);
                                    final SubLObject item_var;
                                    combo = (item_var = Sort.sort(combo, Symbols.symbol_function((SubLObject)removal_modules_rdf.$sym65$TERM__), (SubLObject)removal_modules_rdf.UNPROVIDED));
                                    if (removal_modules_rdf.NIL == conses_high.member(item_var, mt_combos, Symbols.symbol_function((SubLObject)removal_modules_rdf.EQUAL), Symbols.symbol_function((SubLObject)removal_modules_rdf.IDENTITY))) {
                                        mt_combos = (SubLObject)ConsesLow.cons(item_var, mt_combos);
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
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)removal_modules_rdf.$list58);
        }
        SubLObject cdolist_list_var = mt_combos;
        SubLObject mt_combo = (SubLObject)removal_modules_rdf.NIL;
        mt_combo = cdolist_list_var.first();
        while (removal_modules_rdf.NIL != cdolist_list_var) {
            final SubLObject target_set = genl_mts.max_floor_mts(mt_combo, (SubLObject)removal_modules_rdf.UNPROVIDED, (SubLObject)removal_modules_rdf.UNPROVIDED);
            answer_mts = ConsesLow.append(target_set, answer_mts);
            cdolist_list_var = cdolist_list_var.rest();
            mt_combo = cdolist_list_var.first();
        }
        answer_mts = list_utilities.remove_duplicate_forts(answer_mts);
        SubLObject sane_mts = (SubLObject)removal_modules_rdf.NIL;
        SubLObject cdolist_list_var2 = answer_mts;
        SubLObject answer_mt = (SubLObject)removal_modules_rdf.NIL;
        answer_mt = cdolist_list_var2.first();
        while (removal_modules_rdf.NIL != cdolist_list_var2) {
            if (removal_modules_rdf.NIL != arg_type.semantically_valid_literalP(literal, answer_mt, (SubLObject)removal_modules_rdf.UNPROVIDED)) {
                sane_mts = (SubLObject)ConsesLow.cons(answer_mt, sane_mts);
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            answer_mt = cdolist_list_var2.first();
        }
        answer_mts = sane_mts;
        return answer_mts;
    }
    
    public static SubLObject declare_removal_modules_rdf_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rdf", "allow_rdf_removalP", "ALLOW-RDF-REMOVAL?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rdf", "has_rdf_uriP", "HAS-RDF-URI?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rdf", "inference_rdf_uris_for_cyc_term", "INFERENCE-RDF-URIS-FOR-CYC-TERM", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rdf", "do_removal_rdf_unify_arg1", "DO-REMOVAL-RDF-UNIFY-ARG1");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rdf", "do_removal_rdf_unify_arg2", "DO-REMOVAL-RDF-UNIFY-ARG2");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rdf", "make_rdf_uri_support", "MAKE-RDF-URI-SUPPORT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rdf", "possibly_rdf_uri_to_cyc_string", "POSSIBLY-RDF-URI-TO-CYC-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rdf", "make_rdf_ist_graph_support", "MAKE-RDF-IST-GRAPH-SUPPORT", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rdf", "removal_rdf_unify_arg1", "REMOVAL-RDF-UNIFY-ARG1", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rdf", "removal_rdf_unify_arg2", "REMOVAL-RDF-UNIFY-ARG2", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rdf", "supports_for_rdf", "SUPPORTS-FOR-RDF", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rdf", "hl_verify_rdf", "HL-VERIFY-RDF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rdf", "hl_justify_rdf", "HL-JUSTIFY-RDF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rdf", "hl_forward_mt_combos_rdf", "HL-FORWARD-MT-COMBOS-RDF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rdf", "max_floor_mts_where_rdf", "MAX-FLOOR-MTS-WHERE-RDF", 1, 0, false);
        return (SubLObject)removal_modules_rdf.NIL;
    }
    
    public static SubLObject init_removal_modules_rdf_file() {
        removal_modules_rdf.$allow_rdf_removalP$ = SubLFiles.defparameter("*ALLOW-RDF-REMOVAL?*", (SubLObject)removal_modules_rdf.NIL);
        return (SubLObject)removal_modules_rdf.NIL;
    }
    
    public static SubLObject setup_removal_modules_rdf_file() {
        inference_modules.inference_removal_module((SubLObject)removal_modules_rdf.$kw0$REMOVAL_RDF_UNIFY_ARG1, (SubLObject)removal_modules_rdf.$list1);
        inference_modules.inference_removal_module((SubLObject)removal_modules_rdf.$kw2$REMOVAL_RDF_UNIFY_ARG2, (SubLObject)removal_modules_rdf.$list3);
        preference_modules.inference_preference_module((SubLObject)removal_modules_rdf.$kw4$RDF_STRONGLY_PREFER_AT_LEAST_ONE_FULLY_BOUND_ARG, (SubLObject)removal_modules_rdf.$list5);
        utilities_macros.note_funcall_helper_function((SubLObject)removal_modules_rdf.$sym6$ALLOW_RDF_REMOVAL_);
        utilities_macros.note_funcall_helper_function((SubLObject)removal_modules_rdf.$sym7$HAS_RDF_URI_);
        utilities_macros.note_funcall_helper_function((SubLObject)removal_modules_rdf.$sym57$REMOVAL_RDF_UNIFY_ARG1);
        utilities_macros.note_funcall_helper_function((SubLObject)removal_modules_rdf.$sym59$REMOVAL_RDF_UNIFY_ARG2);
        utilities_macros.note_funcall_helper_function((SubLObject)removal_modules_rdf.$sym61$HL_VERIFY_RDF);
        utilities_macros.note_funcall_helper_function((SubLObject)removal_modules_rdf.$sym62$HL_JUSTIFY_RDF);
        utilities_macros.note_funcall_helper_function((SubLObject)removal_modules_rdf.$sym63$HL_FORWARD_MT_COMBOS_RDF);
        utilities_macros.note_funcall_helper_function((SubLObject)removal_modules_rdf.$sym66$MAX_FLOOR_MTS_WHERE_RDF);
        hl_supports.setup_hl_support_module((SubLObject)removal_modules_rdf.$kw56$RDF, (SubLObject)removal_modules_rdf.$list67);
        return (SubLObject)removal_modules_rdf.NIL;
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
    
    static {
        me = (SubLFile)new removal_modules_rdf();
        removal_modules_rdf.$allow_rdf_removalP$ = null;
        $kw0$REMOVAL_RDF_UNIFY_ARG1 = SubLObjectFactory.makeKeyword("REMOVAL-RDF-UNIFY-ARG1");
        $list1 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("MODULE-SUBTYPE"), SubLObjectFactory.makeKeyword("RDF"), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("ALLOW-RDF-REMOVAL?"), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("HAS-RDF-URI?")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("HAS-RDF-URI?"))), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), removal_modules_rdf.ONE_INTEGER, SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("INCOMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-RDF-UNIFY-ARG1"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("Find arg1 bindings based on #$rdfURI values for arg0 and arg2."), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$wikicompany:Customer ?WHO #$Nokia)") });
        $kw2$REMOVAL_RDF_UNIFY_ARG2 = SubLObjectFactory.makeKeyword("REMOVAL-RDF-UNIFY-ARG2");
        $list3 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("MODULE-SUBTYPE"), SubLObjectFactory.makeKeyword("RDF"), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("ALLOW-RDF-REMOVAL?"), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("HAS-RDF-URI?")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("HAS-RDF-URI?")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("HAS-RDF-URI?")))), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), removal_modules_rdf.ONE_INTEGER, SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("INCOMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-RDF-UNIFY-ARG2"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("Find arg2 bindings based on #$rdfURI values for arg0 and arg1."), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$wikicompany:Competitor #$Nokia ?WHO)") });
        $kw4$RDF_STRONGLY_PREFER_AT_LEAST_ONE_FULLY_BOUND_ARG = SubLObjectFactory.makeKeyword("RDF-STRONGLY-PREFER-AT-LEAST-ONE-FULLY-BOUND-ARG");
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SENSE"), (SubLObject)SubLObjectFactory.makeKeyword("POS"), (SubLObject)SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("NOT-ASSERTIBLE-PREDICATE?")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("HAS-RDF-URI?"))), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), (SubLObject)SubLObjectFactory.makeKeyword("PREFERENCE-LEVEL"), (SubLObject)SubLObjectFactory.makeKeyword("GROSSLY-DISPREFERRED"));
        $sym6$ALLOW_RDF_REMOVAL_ = SubLObjectFactory.makeSymbol("ALLOW-RDF-REMOVAL?");
        $sym7$HAS_RDF_URI_ = SubLObjectFactory.makeSymbol("HAS-RDF-URI?");
        $list8 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASENT"), (SubLObject)SubLObjectFactory.makeSymbol("BINDINGS"), (SubLObject)SubLObjectFactory.makeSymbol("JUSTIFICATION"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("JUSTIFY?"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list9 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("JUSTIFY?"), (SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $kw10$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw11$JUSTIFY_ = SubLObjectFactory.makeKeyword("JUSTIFY?");
        $kw12$DONE = SubLObjectFactory.makeKeyword("DONE");
        $sym13$OBJECT = SubLObjectFactory.makeUninternedSymbol("OBJECT");
        $sym14$PREDICATE = SubLObjectFactory.makeUninternedSymbol("PREDICATE");
        $sym15$SUBJECT = SubLObjectFactory.makeUninternedSymbol("SUBJECT");
        $sym16$SUBJECT_VALUE = SubLObjectFactory.makeUninternedSymbol("SUBJECT-VALUE");
        $sym17$ARG1 = SubLObjectFactory.makeUninternedSymbol("ARG1");
        $sym18$OBJECT_URI = SubLObjectFactory.makeUninternedSymbol("OBJECT-URI");
        $sym19$PREDICATE_URI = SubLObjectFactory.makeUninternedSymbol("PREDICATE-URI");
        $sym20$GRAPH = SubLObjectFactory.makeUninternedSymbol("GRAPH");
        $sym21$CDESTRUCTURING_BIND = SubLObjectFactory.makeSymbol("CDESTRUCTURING-BIND");
        $sym22$FORMULA_TERMS = SubLObjectFactory.makeSymbol("FORMULA-TERMS");
        $sym23$CSOME = SubLObjectFactory.makeSymbol("CSOME");
        $sym24$INFERENCE_RDF_URIS_FOR_CYC_TERM = SubLObjectFactory.makeSymbol("INFERENCE-RDF-URIS-FOR-CYC-TERM");
        $sym25$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym26$FIND_OR_DOWNLOAD_RDF_GRAPH = SubLObjectFactory.makeSymbol("FIND-OR-DOWNLOAD-RDF-GRAPH");
        $sym27$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
        $sym28$RDF_GRAPH_P = SubLObjectFactory.makeSymbol("RDF-GRAPH-P");
        $sym29$RDF_GRAPH_FIND_SUBJECTS = SubLObjectFactory.makeSymbol("RDF-GRAPH-FIND-SUBJECTS");
        $sym30$RDF_URI_P = SubLObjectFactory.makeSymbol("RDF-URI-P");
        $sym31$RDF_URI_TO_CYC_TERM = SubLObjectFactory.makeSymbol("RDF-URI-TO-CYC-TERM");
        $sym32$CMULTIPLE_VALUE_BIND = SubLObjectFactory.makeSymbol("CMULTIPLE-VALUE-BIND");
        $sym33$TERM_UNIFY = SubLObjectFactory.makeSymbol("TERM-UNIFY");
        $list34 = ConsesLow.list((SubLObject)removal_modules_rdf.T, (SubLObject)removal_modules_rdf.T);
        $sym35$CPUSH_IF = SubLObjectFactory.makeSymbol("CPUSH-IF");
        $sym36$MAKE_RDF_IST_GRAPH_SUPPORT = SubLObjectFactory.makeSymbol("MAKE-RDF-IST-GRAPH-SUPPORT");
        $sym37$MAKE_RDF_URI_SUPPORT = SubLObjectFactory.makeSymbol("MAKE-RDF-URI-SUPPORT");
        $sym38$SUBJECT = SubLObjectFactory.makeUninternedSymbol("SUBJECT");
        $sym39$PREDICATE = SubLObjectFactory.makeUninternedSymbol("PREDICATE");
        $sym40$OBJECT = SubLObjectFactory.makeUninternedSymbol("OBJECT");
        $sym41$OBJECT_VALUE = SubLObjectFactory.makeUninternedSymbol("OBJECT-VALUE");
        $sym42$ARG2 = SubLObjectFactory.makeUninternedSymbol("ARG2");
        $sym43$SUBJECT_URI = SubLObjectFactory.makeUninternedSymbol("SUBJECT-URI");
        $sym44$PREDICATE_URI = SubLObjectFactory.makeUninternedSymbol("PREDICATE-URI");
        $sym45$GRAPH = SubLObjectFactory.makeUninternedSymbol("GRAPH");
        $sym46$RDF_GRAPH_FIND_OBJECTS = SubLObjectFactory.makeSymbol("RDF-GRAPH-FIND-OBJECTS");
        $const47$rdfURI = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("rdfURI"));
        $list48 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MAX-NUMBER"), (SubLObject)removal_modules_rdf.ONE_INTEGER);
        $list49 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BINDINGS"), (SubLObject)SubLObjectFactory.makeSymbol("SUPPORTS"));
        $const50$ResourcePCWAtURIFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ResourcePCWAtURIFn"));
        $kw51$OPAQUE = SubLObjectFactory.makeKeyword("OPAQUE");
        $const52$ist_Graph = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist-Graph"));
        $const53$ContextOfNamedGraphFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ContextOfNamedGraphFn"));
        $const54$ResourceWithURIFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ResourceWithURIFn"));
        $list55 = ConsesLow.list((SubLObject)SubLObjectFactory.makeUninternedSymbol("PREDICATE"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("ARG1"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("OBJECT"));
        $kw56$RDF = SubLObjectFactory.makeKeyword("RDF");
        $sym57$REMOVAL_RDF_UNIFY_ARG1 = SubLObjectFactory.makeSymbol("REMOVAL-RDF-UNIFY-ARG1");
        $list58 = ConsesLow.list((SubLObject)SubLObjectFactory.makeUninternedSymbol("PREDICATE"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("SUBJECT"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("ARG2"));
        $sym59$REMOVAL_RDF_UNIFY_ARG2 = SubLObjectFactory.makeSymbol("REMOVAL-RDF-UNIFY-ARG2");
        $list60 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HL-MODULE"), (SubLObject)SubLObjectFactory.makeSymbol("LITERAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("TV"));
        $sym61$HL_VERIFY_RDF = SubLObjectFactory.makeSymbol("HL-VERIFY-RDF");
        $sym62$HL_JUSTIFY_RDF = SubLObjectFactory.makeSymbol("HL-JUSTIFY-RDF");
        $sym63$HL_FORWARD_MT_COMBOS_RDF = SubLObjectFactory.makeSymbol("HL-FORWARD-MT-COMBOS-RDF");
        $sym64$SUPPORT_MT = SubLObjectFactory.makeSymbol("SUPPORT-MT");
        $sym65$TERM__ = SubLObjectFactory.makeSymbol("TERM-<");
        $sym66$MAX_FLOOR_MTS_WHERE_RDF = SubLObjectFactory.makeSymbol("MAX-FLOOR-MTS-WHERE-RDF");
        $list67 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VERIFY"), (SubLObject)SubLObjectFactory.makeSymbol("HL-VERIFY-RDF"), (SubLObject)SubLObjectFactory.makeKeyword("JUSTIFY"), (SubLObject)SubLObjectFactory.makeSymbol("HL-JUSTIFY-RDF"), (SubLObject)SubLObjectFactory.makeKeyword("FORWARD-MT-COMBOS"), (SubLObject)SubLObjectFactory.makeSymbol("HL-FORWARD-MT-COMBOS-RDF"));
    }
}

/*

	Total time: 241 ms
	
*/