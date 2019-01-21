package com.cyc.cycjava.cycl.rdf;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.vector_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class rdf_triple extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.rdf.rdf_triple";
    public static final String myFingerPrint = "d4277a271ad670debae87a5de83720d6e2708e48c4fe474833a1ccf5a169db7e";
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-triple.lisp", position = 1801L)
    private static SubLSymbol $rdf_triple_positions$;
    private static final SubLSymbol $sym0$VALID_RDF_SUBJECT_P;
    private static final SubLSymbol $sym1$VALID_RDF_PREDICATE_P;
    private static final SubLSymbol $sym2$VALID_RDF_OBJECT_P;
    private static final SubLObject $ic3;
    private static final SubLSymbol $sym4$RDF_TRIPLE_POSITION_P;
    private static final SubLSymbol $kw5$SUBJECT;
    private static final SubLSymbol $kw6$PREDICATE;
    private static final SubLSymbol $kw7$OBJECT;
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-triple.lisp", position = 827L)
    public static SubLObject rdf_triple_p(final SubLObject v_object, SubLObject robustP) {
        if (robustP == rdf_triple.UNPROVIDED) {
            robustP = (SubLObject)rdf_triple.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isVector() && rdf_triple.NIL != list_utilities.lengthE(v_object, (SubLObject)rdf_triple.THREE_INTEGER, (SubLObject)rdf_triple.UNPROVIDED) && (rdf_triple.NIL == robustP || (rdf_triple.NIL != rdf_graph.valid_rdf_subject_p(rdf_triple_subject(v_object)) && rdf_triple.NIL != rdf_graph.valid_rdf_predicate_p(rdf_triple_predicate(v_object)) && rdf_triple.NIL != rdf_graph.valid_rdf_object_p(rdf_triple_object(v_object)))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-triple.lisp", position = 1147L)
    public static SubLObject new_rdf_triple(final SubLObject subject, final SubLObject predicate, final SubLObject v_object) {
        assert rdf_triple.NIL != rdf_graph.valid_rdf_subject_p(subject) : subject;
        assert rdf_triple.NIL != rdf_graph.valid_rdf_predicate_p(predicate) : predicate;
        assert rdf_triple.NIL != rdf_graph.valid_rdf_object_p(v_object) : v_object;
        final SubLObject triple = Vectors.make_vector((SubLObject)rdf_triple.THREE_INTEGER, (SubLObject)rdf_triple.UNPROVIDED);
        Vectors.set_aref(triple, (SubLObject)rdf_triple.ZERO_INTEGER, subject);
        Vectors.set_aref(triple, (SubLObject)rdf_triple.ONE_INTEGER, predicate);
        Vectors.set_aref(triple, (SubLObject)rdf_triple.TWO_INTEGER, v_object);
        return triple;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-triple.lisp", position = 1490L)
    public static SubLObject copy_rdf_triple(final SubLObject triple) {
        return vector_utilities.copy_vector(triple);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-triple.lisp", position = 1564L)
    public static SubLObject rdf_triple_args(final SubLObject triple) {
        return (SubLObject)ConsesLow.list(rdf_triple_subject(triple), rdf_triple_predicate(triple), rdf_triple_object(triple));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-triple.lisp", position = 1878L)
    public static SubLObject rdf_triple_position_p(final SubLObject v_object) {
        return Sequences.find(v_object, rdf_triple.$rdf_triple_positions$.getGlobalValue(), (SubLObject)rdf_triple.UNPROVIDED, (SubLObject)rdf_triple.UNPROVIDED, (SubLObject)rdf_triple.UNPROVIDED, (SubLObject)rdf_triple.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-triple.lisp", position = 1971L)
    public static SubLObject rdf_triple_remaining_arg(final SubLObject triple, SubLObject position, final SubLObject other_position) {
        assert rdf_triple.NIL != rdf_triple_position_p(position) : position;
        assert rdf_triple.NIL != rdf_triple_position_p(other_position) : other_position;
        final SubLObject vector_var = rdf_triple.$rdf_triple_positions$.getGlobalValue();
        final SubLObject backwardP_var = (SubLObject)rdf_triple.NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject this_position;
        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)rdf_triple.NIL, v_iteration = (SubLObject)rdf_triple.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)rdf_triple.ONE_INTEGER)) {
            element_num = ((rdf_triple.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)rdf_triple.ONE_INTEGER) : v_iteration);
            this_position = Vectors.aref(vector_var, element_num);
            if (!this_position.eql(position) && !this_position.eql(other_position)) {
                return rdf_triple_arg(triple, this_position);
            }
        }
        return (SubLObject)rdf_triple.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-triple.lisp", position = 2336L)
    public static SubLObject rdf_triple_arg(final SubLObject triple, SubLObject position) {
        assert rdf_triple.NIL != rdf_triple_position_p(position) : position;
        final SubLObject i = Sequences.position(position, rdf_triple.$rdf_triple_positions$.getGlobalValue(), (SubLObject)rdf_triple.UNPROVIDED, (SubLObject)rdf_triple.UNPROVIDED, (SubLObject)rdf_triple.UNPROVIDED, (SubLObject)rdf_triple.UNPROVIDED);
        return Vectors.aref(triple, i);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-triple.lisp", position = 2519L)
    public static SubLObject rdf_triple_subject(final SubLObject triple) {
        return rdf_triple_arg(triple, (SubLObject)rdf_triple.$kw5$SUBJECT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-triple.lisp", position = 2608L)
    public static SubLObject rdf_triple_predicate(final SubLObject triple) {
        return rdf_triple_arg(triple, (SubLObject)rdf_triple.$kw6$PREDICATE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-triple.lisp", position = 2701L)
    public static SubLObject rdf_triple_object(final SubLObject triple) {
        return rdf_triple_arg(triple, (SubLObject)rdf_triple.$kw7$OBJECT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-triple.lisp", position = 2788L)
    public static SubLObject rdf_triples_equalP(final SubLObject triple1, final SubLObject triple2) {
        return Equality.equal(rdf_triple_args(triple1), rdf_triple_args(triple2));
    }
    
    public static SubLObject declare_rdf_triple_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_triple", "rdf_triple_p", "RDF-TRIPLE-P", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_triple", "new_rdf_triple", "NEW-RDF-TRIPLE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_triple", "copy_rdf_triple", "COPY-RDF-TRIPLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_triple", "rdf_triple_args", "RDF-TRIPLE-ARGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_triple", "rdf_triple_position_p", "RDF-TRIPLE-POSITION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_triple", "rdf_triple_remaining_arg", "RDF-TRIPLE-REMAINING-ARG", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_triple", "rdf_triple_arg", "RDF-TRIPLE-ARG", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_triple", "rdf_triple_subject", "RDF-TRIPLE-SUBJECT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_triple", "rdf_triple_predicate", "RDF-TRIPLE-PREDICATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_triple", "rdf_triple_object", "RDF-TRIPLE-OBJECT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_triple", "rdf_triples_equalP", "RDF-TRIPLES-EQUAL?", 2, 0, false);
        return (SubLObject)rdf_triple.NIL;
    }
    
    public static SubLObject init_rdf_triple_file() {
        rdf_triple.$rdf_triple_positions$ = SubLFiles.deflexical("*RDF-TRIPLE-POSITIONS*", rdf_triple.$ic3);
        return (SubLObject)rdf_triple.NIL;
    }
    
    public static SubLObject setup_rdf_triple_file() {
        return (SubLObject)rdf_triple.NIL;
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
        me = (SubLFile)new rdf_triple();
        rdf_triple.$rdf_triple_positions$ = null;
        $sym0$VALID_RDF_SUBJECT_P = SubLObjectFactory.makeSymbol("VALID-RDF-SUBJECT-P");
        $sym1$VALID_RDF_PREDICATE_P = SubLObjectFactory.makeSymbol("VALID-RDF-PREDICATE-P");
        $sym2$VALID_RDF_OBJECT_P = SubLObjectFactory.makeSymbol("VALID-RDF-OBJECT-P");
        $ic3 = Vectors.vector(new SubLObject[] { SubLObjectFactory.makeKeyword("SUBJECT"), SubLObjectFactory.makeKeyword("PREDICATE"), SubLObjectFactory.makeKeyword("OBJECT") });
        $sym4$RDF_TRIPLE_POSITION_P = SubLObjectFactory.makeSymbol("RDF-TRIPLE-POSITION-P");
        $kw5$SUBJECT = SubLObjectFactory.makeKeyword("SUBJECT");
        $kw6$PREDICATE = SubLObjectFactory.makeKeyword("PREDICATE");
        $kw7$OBJECT = SubLObjectFactory.makeKeyword("OBJECT");
    }
}

/*

	Total time: 87 ms
	
*/