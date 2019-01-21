package com.cyc.cycjava.cycl.rdf;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.unicode_strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.web_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class rdf_n_triples_writer extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.rdf.rdf_n_triples_writer";
    public static final String myFingerPrint = "fc0ee80313438d893b60aed7f07fe41e7859f609f733b3dca1e666292089d326";
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-n-triples-writer.lisp", position = 847L)
    private static SubLSymbol $n_triples_writer_stream$;
    private static final SubLSymbol $sym0$RDF_TRIPLE_P;
    private static final SubLString $str1$Can_t_write_subject__S;
    private static final SubLString $str2$Can_t_write_predicate__S;
    private static final SubLString $str3$Can_t_write_object__S;
    private static final SubLString $str4$__A;
    private static final SubLString $str5$__;
    private static final SubLString $str6$___A;
    private static final SubLSymbol $sym7$URI_P;
    private static final SubLString $str8$__A_;
    private static final SubLSymbol $sym9$INVALID_N_TRIPLE_CHAR_P;
    private static final SubLInteger $int10$32;
    private static final SubLInteger $int11$34;
    private static final SubLInteger $int12$92;
    private static final SubLInteger $int13$127;
    private static final SubLString $str14$_t;
    private static final SubLString $str15$_n;
    private static final SubLString $str16$_r;
    private static final SubLString $str17$__;
    private static final SubLString $str18$__;
    private static final SubLString $str19$_U_8_1_0__0_A;
    private static final SubLString $str20$_u_4_1_0__0_A;
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-n-triples-writer.lisp", position = 948L)
    public static SubLObject write_n_triple(final SubLObject v_rdf_triple, SubLObject stream) {
        if (stream == rdf_n_triples_writer.UNPROVIDED) {
            stream = rdf_n_triples_writer.$n_triples_writer_stream$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert rdf_n_triples_writer.NIL != rdf_triple.rdf_triple_p(v_rdf_triple, (SubLObject)rdf_n_triples_writer.UNPROVIDED) : v_rdf_triple;
        final SubLObject _prev_bind_0 = rdf_n_triples_writer.$n_triples_writer_stream$.currentBinding(thread);
        try {
            rdf_n_triples_writer.$n_triples_writer_stream$.bind(stream, thread);
            write_n_subject(rdf_triple.rdf_triple_subject(v_rdf_triple));
            print_high.princ((SubLObject)Characters.CHAR_space, rdf_n_triples_writer.$n_triples_writer_stream$.getDynamicValue(thread));
            write_n_predicate(rdf_triple.rdf_triple_predicate(v_rdf_triple));
            print_high.princ((SubLObject)Characters.CHAR_space, rdf_n_triples_writer.$n_triples_writer_stream$.getDynamicValue(thread));
            write_n_object(rdf_triple.rdf_triple_object(v_rdf_triple));
            print_high.princ((SubLObject)Characters.CHAR_space, rdf_n_triples_writer.$n_triples_writer_stream$.getDynamicValue(thread));
            print_high.princ((SubLObject)Characters.CHAR_period, rdf_n_triples_writer.$n_triples_writer_stream$.getDynamicValue(thread));
            streams_high.terpri(rdf_n_triples_writer.$n_triples_writer_stream$.getDynamicValue(thread));
        }
        finally {
            rdf_n_triples_writer.$n_triples_writer_stream$.rebind(_prev_bind_0, thread);
        }
        return v_rdf_triple;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-n-triples-writer.lisp", position = 1556L)
    public static SubLObject write_n_subject(final SubLObject subject) {
        if (rdf_n_triples_writer.NIL != rdf_uri.rdf_uri_p(subject)) {
            write_n_uri(rdf_uri.rdf_uri_utf8_string(subject));
        }
        else if (rdf_n_triples_writer.NIL != web_utilities.uri_p(subject, (SubLObject)rdf_n_triples_writer.UNPROVIDED)) {
            write_n_uri(subject);
        }
        else if (rdf_n_triples_writer.NIL != rdf_blank_node.rdf_blank_node_p(subject)) {
            write_n_blank_node(subject);
        }
        else {
            Errors.error((SubLObject)rdf_n_triples_writer.$str1$Can_t_write_subject__S, subject);
        }
        return subject;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-n-triples-writer.lisp", position = 1895L)
    public static SubLObject write_n_predicate(final SubLObject predicate) {
        if (rdf_n_triples_writer.NIL != rdf_uri.rdf_uri_p(predicate)) {
            write_n_uri(rdf_uri.rdf_uri_utf8_string(predicate));
        }
        else if (rdf_n_triples_writer.NIL != web_utilities.uri_p(predicate, (SubLObject)rdf_n_triples_writer.UNPROVIDED)) {
            write_n_uri(predicate);
        }
        else {
            Errors.error((SubLObject)rdf_n_triples_writer.$str2$Can_t_write_predicate__S, predicate);
        }
        return predicate;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-n-triples-writer.lisp", position = 2155L)
    public static SubLObject write_n_object(final SubLObject v_object) {
        if (rdf_n_triples_writer.NIL != rdf_uri.rdf_uri_p(v_object)) {
            write_n_uri(rdf_uri.rdf_uri_utf8_string(v_object));
        }
        else if (rdf_n_triples_writer.NIL != rdf_blank_node.rdf_blank_node_p(v_object)) {
            write_n_blank_node(v_object);
        }
        else if (rdf_n_triples_writer.NIL != web_utilities.uri_p(v_object, (SubLObject)rdf_n_triples_writer.UNPROVIDED)) {
            write_n_uri(v_object);
        }
        else if (rdf_n_triples_writer.NIL != rdf_literal.rdf_literal_p(v_object)) {
            write_n_literal(v_object);
        }
        else {
            Errors.error((SubLObject)rdf_n_triples_writer.$str3$Can_t_write_object__S, v_object);
        }
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-n-triples-writer.lisp", position = 2508L)
    public static SubLObject write_n_literal(final SubLObject literal) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        print_high.princ((SubLObject)Characters.CHAR_quotation, rdf_n_triples_writer.$n_triples_writer_stream$.getDynamicValue(thread));
        print_high.princ(n_triple_string_from_utf8_string(rdf_literal.rdf_literal_utf8_lexical_form(literal)), rdf_n_triples_writer.$n_triples_writer_stream$.getDynamicValue(thread));
        print_high.princ((SubLObject)Characters.CHAR_quotation, rdf_n_triples_writer.$n_triples_writer_stream$.getDynamicValue(thread));
        if (rdf_n_triples_writer.NIL != rdf_literal.rdf_literal_language_tag(literal)) {
            PrintLow.format(rdf_n_triples_writer.$n_triples_writer_stream$.getDynamicValue(thread), (SubLObject)rdf_n_triples_writer.$str4$__A, rdf_literal.rdf_literal_language_tag(literal));
        }
        else if (rdf_n_triples_writer.NIL != rdf_literal.rdf_literal_datatype(literal)) {
            print_high.princ((SubLObject)rdf_n_triples_writer.$str5$__, rdf_n_triples_writer.$n_triples_writer_stream$.getDynamicValue(thread));
            write_n_uri(rdf_uri.rdf_uri_utf8_string(rdf_literal.rdf_literal_datatype(literal)));
        }
        return literal;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-n-triples-writer.lisp", position = 3039L)
    public static SubLObject write_n_blank_node(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        PrintLow.format(rdf_n_triples_writer.$n_triples_writer_stream$.getDynamicValue(thread), (SubLObject)rdf_n_triples_writer.$str6$___A, rdf_blank_node.rdf_blank_node_id_string(node));
        return node;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-n-triples-writer.lisp", position = 3172L)
    public static SubLObject write_n_uri(final SubLObject uri) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert rdf_n_triples_writer.NIL != web_utilities.uri_p(uri, (SubLObject)rdf_n_triples_writer.UNPROVIDED) : uri;
        PrintLow.format(rdf_n_triples_writer.$n_triples_writer_stream$.getDynamicValue(thread), (SubLObject)rdf_n_triples_writer.$str8$__A_, n_triple_string_from_utf8_string(uri));
        return uri;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-n-triples-writer.lisp", position = 3328L)
    public static SubLObject n_triple_string_from_utf8_string(final SubLObject string) {
        if (rdf_n_triples_writer.NIL == Sequences.find_if((SubLObject)rdf_n_triples_writer.$sym9$INVALID_N_TRIPLE_CHAR_P, string, (SubLObject)rdf_n_triples_writer.UNPROVIDED, (SubLObject)rdf_n_triples_writer.UNPROVIDED, (SubLObject)rdf_n_triples_writer.UNPROVIDED)) {
            return string;
        }
        return n_triple_string_from_unicode_vector(unicode_strings.utf8_vector_to_unicode_vector(unicode_strings.utf8_string_to_utf8_vector(string)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-n-triples-writer.lisp", position = 3576L)
    public static SubLObject invalid_n_triple_char_p(final SubLObject v_char) {
        return invalid_n_triple_char_code_p(Characters.char_code(v_char));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-n-triples-writer.lisp", position = 3681L)
    public static SubLObject invalid_n_triple_char_code_p(final SubLObject code) {
        return (SubLObject)SubLObjectFactory.makeBoolean(code.numL((SubLObject)rdf_n_triples_writer.$int10$32) || code.eql((SubLObject)rdf_n_triples_writer.$int11$34) || code.eql((SubLObject)rdf_n_triples_writer.$int12$92) || code.numGE((SubLObject)rdf_n_triples_writer.$int13$127));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-n-triples-writer.lisp", position = 3825L)
    public static SubLObject n_triple_string_from_unicode_vector(final SubLObject vector) {
        SubLObject string = (SubLObject)rdf_n_triples_writer.NIL;
        SubLObject stream = (SubLObject)rdf_n_triples_writer.NIL;
        try {
            stream = streams_high.make_private_string_output_stream();
            final SubLObject backwardP_var = (SubLObject)rdf_n_triples_writer.NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject element_num;
            SubLObject code_point;
            for (length = Sequences.length(vector), v_iteration = (SubLObject)rdf_n_triples_writer.NIL, v_iteration = (SubLObject)rdf_n_triples_writer.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)rdf_n_triples_writer.ONE_INTEGER)) {
                element_num = ((rdf_n_triples_writer.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)rdf_n_triples_writer.ONE_INTEGER) : v_iteration);
                code_point = Vectors.aref(vector, element_num);
                output_n_triple_char_code(code_point, stream);
            }
            string = streams_high.get_output_stream_string(stream);
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)rdf_n_triples_writer.T);
                final SubLObject _values = Values.getValuesAsVector();
                streams_high.close(stream, (SubLObject)rdf_n_triples_writer.UNPROVIDED);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-n-triples-writer.lisp", position = 4053L)
    public static SubLObject output_n_triple_char_code(final SubLObject code_point, final SubLObject stream) {
        if (code_point.eql((SubLObject)rdf_n_triples_writer.NINE_INTEGER)) {
            print_high.princ((SubLObject)rdf_n_triples_writer.$str14$_t, stream);
        }
        else if (code_point.eql((SubLObject)rdf_n_triples_writer.TEN_INTEGER)) {
            print_high.princ((SubLObject)rdf_n_triples_writer.$str15$_n, stream);
        }
        else if (code_point.eql((SubLObject)rdf_n_triples_writer.THIRTEEN_INTEGER)) {
            print_high.princ((SubLObject)rdf_n_triples_writer.$str16$_r, stream);
        }
        else if (code_point.eql((SubLObject)rdf_n_triples_writer.$int11$34)) {
            print_high.princ((SubLObject)rdf_n_triples_writer.$str17$__, stream);
        }
        else if (code_point.eql((SubLObject)rdf_n_triples_writer.$int12$92)) {
            print_high.princ((SubLObject)rdf_n_triples_writer.$str18$__, stream);
        }
        else if (code_point.numL((SubLObject)rdf_n_triples_writer.$int10$32)) {
            output_n_triple_unicode_escape(code_point, stream);
        }
        else if (code_point.numL((SubLObject)rdf_n_triples_writer.$int13$127)) {
            print_high.princ(Characters.code_char(code_point), stream);
        }
        else {
            output_n_triple_unicode_escape(code_point, stream);
        }
        return (SubLObject)rdf_n_triples_writer.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-n-triples-writer.lisp", position = 4565L)
    public static SubLObject output_n_triple_unicode_escape(final SubLObject code_point, final SubLObject stream) {
        final SubLObject hex_string = number_utilities.convert_to_hexadecimal(code_point);
        if (rdf_n_triples_writer.NIL != list_utilities.lengthG(hex_string, (SubLObject)rdf_n_triples_writer.FOUR_INTEGER, (SubLObject)rdf_n_triples_writer.UNPROVIDED)) {
            PrintLow.format(stream, (SubLObject)rdf_n_triples_writer.$str19$_U_8_1_0__0_A, hex_string);
        }
        else {
            PrintLow.format(stream, (SubLObject)rdf_n_triples_writer.$str20$_u_4_1_0__0_A, hex_string);
        }
        return (SubLObject)rdf_n_triples_writer.NIL;
    }
    
    public static SubLObject declare_rdf_n_triples_writer_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_n_triples_writer", "write_n_triple", "WRITE-N-TRIPLE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_n_triples_writer", "write_n_subject", "WRITE-N-SUBJECT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_n_triples_writer", "write_n_predicate", "WRITE-N-PREDICATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_n_triples_writer", "write_n_object", "WRITE-N-OBJECT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_n_triples_writer", "write_n_literal", "WRITE-N-LITERAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_n_triples_writer", "write_n_blank_node", "WRITE-N-BLANK-NODE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_n_triples_writer", "write_n_uri", "WRITE-N-URI", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_n_triples_writer", "n_triple_string_from_utf8_string", "N-TRIPLE-STRING-FROM-UTF8-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_n_triples_writer", "invalid_n_triple_char_p", "INVALID-N-TRIPLE-CHAR-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_n_triples_writer", "invalid_n_triple_char_code_p", "INVALID-N-TRIPLE-CHAR-CODE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_n_triples_writer", "n_triple_string_from_unicode_vector", "N-TRIPLE-STRING-FROM-UNICODE-VECTOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_n_triples_writer", "output_n_triple_char_code", "OUTPUT-N-TRIPLE-CHAR-CODE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_n_triples_writer", "output_n_triple_unicode_escape", "OUTPUT-N-TRIPLE-UNICODE-ESCAPE", 2, 0, false);
        return (SubLObject)rdf_n_triples_writer.NIL;
    }
    
    public static SubLObject init_rdf_n_triples_writer_file() {
        rdf_n_triples_writer.$n_triples_writer_stream$ = SubLFiles.defparameter("*N-TRIPLES-WRITER-STREAM*", StreamsLow.$standard_output$.getDynamicValue());
        return (SubLObject)rdf_n_triples_writer.NIL;
    }
    
    public static SubLObject setup_rdf_n_triples_writer_file() {
        return (SubLObject)rdf_n_triples_writer.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_rdf_n_triples_writer_file();
    }
    
    @Override
	public void initializeVariables() {
        init_rdf_n_triples_writer_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_rdf_n_triples_writer_file();
    }
    
    static {
        me = (SubLFile)new rdf_n_triples_writer();
        rdf_n_triples_writer.$n_triples_writer_stream$ = null;
        $sym0$RDF_TRIPLE_P = SubLObjectFactory.makeSymbol("RDF-TRIPLE-P");
        $str1$Can_t_write_subject__S = SubLObjectFactory.makeString("Can't write subject ~S");
        $str2$Can_t_write_predicate__S = SubLObjectFactory.makeString("Can't write predicate ~S");
        $str3$Can_t_write_object__S = SubLObjectFactory.makeString("Can't write object ~S");
        $str4$__A = SubLObjectFactory.makeString("@~A");
        $str5$__ = SubLObjectFactory.makeString("^^");
        $str6$___A = SubLObjectFactory.makeString("_:~A");
        $sym7$URI_P = SubLObjectFactory.makeSymbol("URI-P");
        $str8$__A_ = SubLObjectFactory.makeString("<~A>");
        $sym9$INVALID_N_TRIPLE_CHAR_P = SubLObjectFactory.makeSymbol("INVALID-N-TRIPLE-CHAR-P");
        $int10$32 = SubLObjectFactory.makeInteger(32);
        $int11$34 = SubLObjectFactory.makeInteger(34);
        $int12$92 = SubLObjectFactory.makeInteger(92);
        $int13$127 = SubLObjectFactory.makeInteger(127);
        $str14$_t = SubLObjectFactory.makeString("\\t");
        $str15$_n = SubLObjectFactory.makeString("\\n");
        $str16$_r = SubLObjectFactory.makeString("\\r");
        $str17$__ = SubLObjectFactory.makeString("\\\"");
        $str18$__ = SubLObjectFactory.makeString("\\\\");
        $str19$_U_8_1_0__0_A = SubLObjectFactory.makeString("\\U~8,1,0,'0@A");
        $str20$_u_4_1_0__0_A = SubLObjectFactory.makeString("\\u~4,1,0,'0@A");
    }
}

/*

	Total time: 158 ms
	
*/