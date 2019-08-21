package com.cyc.cycjava.cycl.rdf;


import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.rdf.rdf_triple;
import com.cyc.cycjava.cycl.vector_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.rdf.rdf_triple.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.THREE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class rdf_triple extends SubLTranslatedFile {
    public static final SubLFile me = new rdf_triple();

    public static final String myName = "com.cyc.cycjava.cycl.rdf.rdf_triple";

    public static final String myFingerPrint = "d4277a271ad670debae87a5de83720d6e2708e48c4fe474833a1ccf5a169db7e";

    // deflexical
    private static final SubLSymbol $rdf_triple_positions$ = makeSymbol("*RDF-TRIPLE-POSITIONS*");

    // Internal Constants
    public static final SubLSymbol VALID_RDF_SUBJECT_P = makeSymbol("VALID-RDF-SUBJECT-P");

    public static final SubLSymbol VALID_RDF_PREDICATE_P = makeSymbol("VALID-RDF-PREDICATE-P");

    public static final SubLSymbol VALID_RDF_OBJECT_P = makeSymbol("VALID-RDF-OBJECT-P");

    public static final SubLObject $ic3 = vector(new SubLObject[]{ makeKeyword("SUBJECT"), makeKeyword("PREDICATE"), makeKeyword("OBJECT") });

    public static final SubLSymbol RDF_TRIPLE_POSITION_P = makeSymbol("RDF-TRIPLE-POSITION-P");







    public static SubLObject rdf_triple_p(final SubLObject v_object, SubLObject robustP) {
        if (robustP == UNPROVIDED) {
            robustP = NIL;
        }
        return makeBoolean((v_object.isVector() && (NIL != list_utilities.lengthE(v_object, THREE_INTEGER, UNPROVIDED))) && ((NIL == robustP) || (((NIL != rdf_graph.valid_rdf_subject_p(rdf_triple_subject(v_object))) && (NIL != rdf_graph.valid_rdf_predicate_p(rdf_triple_predicate(v_object)))) && (NIL != rdf_graph.valid_rdf_object_p(rdf_triple_object(v_object))))));
    }

    public static SubLObject new_rdf_triple(final SubLObject subject, final SubLObject predicate, final SubLObject v_object) {
        assert NIL != rdf_graph.valid_rdf_subject_p(subject) : "rdf_graph.valid_rdf_subject_p(subject) " + "CommonSymbols.NIL != rdf_graph.valid_rdf_subject_p(subject) " + subject;
        assert NIL != rdf_graph.valid_rdf_predicate_p(predicate) : "rdf_graph.valid_rdf_predicate_p(predicate) " + "CommonSymbols.NIL != rdf_graph.valid_rdf_predicate_p(predicate) " + predicate;
        assert NIL != rdf_graph.valid_rdf_object_p(v_object) : "rdf_graph.valid_rdf_object_p error :" + v_object;
        final SubLObject triple = make_vector(THREE_INTEGER, UNPROVIDED);
        set_aref(triple, ZERO_INTEGER, subject);
        set_aref(triple, ONE_INTEGER, predicate);
        set_aref(triple, TWO_INTEGER, v_object);
        return triple;
    }

    public static SubLObject copy_rdf_triple(final SubLObject triple) {
        return vector_utilities.copy_vector(triple);
    }

    public static SubLObject rdf_triple_args(final SubLObject triple) {
        return list(rdf_triple_subject(triple), rdf_triple_predicate(triple), rdf_triple_object(triple));
    }

    public static SubLObject rdf_triple_position_p(final SubLObject v_object) {
        return find(v_object, $rdf_triple_positions$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject rdf_triple_remaining_arg(final SubLObject triple, SubLObject position, final SubLObject other_position) {
        assert NIL != rdf_triple_position_p(position) : "rdf_triple.rdf_triple_position_p(position) " + "CommonSymbols.NIL != rdf_triple.rdf_triple_position_p(position) " + position;
        assert NIL != rdf_triple_position_p(other_position) : "rdf_triple.rdf_triple_position_p(other_position) " + "CommonSymbols.NIL != rdf_triple.rdf_triple_position_p(other_position) " + other_position;
        final SubLObject vector_var = $rdf_triple_positions$.getGlobalValue();
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject this_position;
        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
            element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
            this_position = aref(vector_var, element_num);
            if ((!this_position.eql(position)) && (!this_position.eql(other_position))) {
                return rdf_triple_arg(triple, this_position);
            }
        }
        return NIL;
    }

    public static SubLObject rdf_triple_arg(final SubLObject triple, SubLObject position) {
        assert NIL != rdf_triple_position_p(position) : "rdf_triple.rdf_triple_position_p(position) " + "CommonSymbols.NIL != rdf_triple.rdf_triple_position_p(position) " + position;
        final SubLObject i = position(position, $rdf_triple_positions$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return aref(triple, i);
    }

    public static SubLObject rdf_triple_subject(final SubLObject triple) {
        return rdf_triple_arg(triple, $SUBJECT);
    }

    public static SubLObject rdf_triple_predicate(final SubLObject triple) {
        return rdf_triple_arg(triple, $PREDICATE);
    }

    public static SubLObject rdf_triple_object(final SubLObject triple) {
        return rdf_triple_arg(triple, $OBJECT);
    }

    public static SubLObject rdf_triples_equalP(final SubLObject triple1, final SubLObject triple2) {
        return equal(rdf_triple_args(triple1), rdf_triple_args(triple2));
    }

    public static SubLObject declare_rdf_triple_file() {
        declareFunction(me, "rdf_triple_p", "RDF-TRIPLE-P", 1, 1, false);
        declareFunction(me, "new_rdf_triple", "NEW-RDF-TRIPLE", 3, 0, false);
        declareFunction(me, "copy_rdf_triple", "COPY-RDF-TRIPLE", 1, 0, false);
        declareFunction(me, "rdf_triple_args", "RDF-TRIPLE-ARGS", 1, 0, false);
        declareFunction(me, "rdf_triple_position_p", "RDF-TRIPLE-POSITION-P", 1, 0, false);
        declareFunction(me, "rdf_triple_remaining_arg", "RDF-TRIPLE-REMAINING-ARG", 3, 0, false);
        declareFunction(me, "rdf_triple_arg", "RDF-TRIPLE-ARG", 2, 0, false);
        declareFunction(me, "rdf_triple_subject", "RDF-TRIPLE-SUBJECT", 1, 0, false);
        declareFunction(me, "rdf_triple_predicate", "RDF-TRIPLE-PREDICATE", 1, 0, false);
        declareFunction(me, "rdf_triple_object", "RDF-TRIPLE-OBJECT", 1, 0, false);
        declareFunction(me, "rdf_triples_equalP", "RDF-TRIPLES-EQUAL?", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_rdf_triple_file() {
        deflexical("*RDF-TRIPLE-POSITIONS*", $ic3);
        return NIL;
    }

    public static SubLObject setup_rdf_triple_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_rdf_triple_file();
    }

    @Override
    public void initializeVariables() {
        init_rdf_triple_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_rdf_triple_file();
    }

    static {










    }
}

/**
 * Total time: 87 ms
 */
