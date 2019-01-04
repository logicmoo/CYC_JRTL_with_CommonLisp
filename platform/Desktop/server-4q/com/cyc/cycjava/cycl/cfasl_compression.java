package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cfasl_compression extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.cfasl_compression";
    public static final String myFingerPrint = "3d54b6ea90ca9e6159c98e940f382774f658e839e6c38cde88039632a7e38712";
    @SubLTranslatedFile.SubL(source = "cycl/cfasl-compression.lisp", position = 1145L)
    private static SubLSymbol $cfasl_opcode_open_compressed_block$;
    @SubLTranslatedFile.SubL(source = "cycl/cfasl-compression.lisp", position = 1244L)
    private static SubLSymbol $cfasl_opcode_compression_pair$;
    @SubLTranslatedFile.SubL(source = "cycl/cfasl-compression.lisp", position = 1337L)
    private static SubLSymbol $cfasl_opcode_compression_key$;
    @SubLTranslatedFile.SubL(source = "cycl/cfasl-compression.lisp", position = 1429L)
    private static SubLSymbol $cfasl_opcode_close_compressed_block$;
    @SubLTranslatedFile.SubL(source = "cycl/cfasl-compression.lisp", position = 1528L)
    private static SubLSymbol $cfasl_decompression_index$;
    @SubLTranslatedFile.SubL(source = "cycl/cfasl-compression.lisp", position = 2715L)
    private static SubLSymbol $cfasl_compression_not_found$;
    @SubLTranslatedFile.SubL(source = "cycl/cfasl-compression.lisp", position = 4136L)
    public static SubLSymbol $cfasl_output_compression_options$;
    @SubLTranslatedFile.SubL(source = "cycl/cfasl-compression.lisp", position = 4277L)
    public static SubLSymbol $cfasl_output_compression_table$;
    @SubLTranslatedFile.SubL(source = "cycl/cfasl-compression.lisp", position = 4379L)
    public static SubLSymbol $cfasl_output_compression_code_isg$;
    @SubLTranslatedFile.SubL(source = "cycl/cfasl-compression.lisp", position = 4484L)
    private static SubLSymbol $within_cfasl_compression_analysisP$;
    @SubLTranslatedFile.SubL(source = "cycl/cfasl-compression.lisp", position = 7330L)
    private static SubLSymbol $cfasl_compression_options_properties$;
    private static final SubLInteger $int0$54;
    private static final SubLSymbol $sym1$CFASL_INPUT_OPEN_COMPRESSED_BLOCK;
    private static final SubLInteger $int2$55;
    private static final SubLSymbol $sym3$CFASL_INPUT_COMPRESSION_PAIR;
    private static final SubLInteger $int4$56;
    private static final SubLSymbol $sym5$CFASL_INPUT_COMPRESSION_KEY;
    private static final SubLInteger $int6$57;
    private static final SubLSymbol $sym7$CFASL_INPUT_CLOSE_COMPRESSED_BLOCK;
    private static final SubLSymbol $sym8$_CFASL_DECOMPRESSION_INDEX_;
    private static final SubLSymbol $sym9$_CFASL_COMPRESSION_NOT_FOUND_;
    private static final SubLString $str10$NOT_FOUND;
    private static final SubLString $str11$Couldn_t_decompress__s_using_tabl;
    private static final SubLList $list12;
    private static final SubLSymbol $sym13$CLET;
    private static final SubLSymbol $sym14$_CFASL_OUTPUT_COMPRESSION_OPTIONS_;
    private static final SubLList $list15;
    private static final SubLSymbol $sym16$_CFASL_OUTPUT_COMPRESSION_TABLE_;
    private static final SubLSymbol $sym17$WITH_CFASL_COMPRESSION_CFASL_OUTPUT_COMPRESSION_TABLE;
    private static final SubLSymbol $sym18$WITH_CFASL_COMPRESSION_PREAMBLE;
    private static final SubLSymbol $sym19$WITH_CFASL_COMPRESSION_POSTAMBLE;
    private static final SubLList $list20;
    private static final SubLList $list21;
    private static final SubLList $list22;
    private static final SubLList $list23;
    private static final SubLList $list24;
    private static final SubLList $list25;
    private static final SubLSymbol $sym26$CFASL_OUTPUT_OPEN_COMPRESSED_BLOCK;
    private static final SubLSymbol $sym27$CFASL_OUTPUT_CLOSE_COMPRESSED_BLOCK;
    private static final SubLSymbol $sym28$WITH_CFASL_COMPRESSION;
    private static final SubLSymbol $kw29$ANALYZE;
    private static final SubLSymbol $kw30$ALL_;
    private static final SubLSymbol $kw31$NOT;
    private static final SubLSymbol $kw32$VERBOSE_;
    private static final SubLSymbol $kw33$EXTERNALIZED_;
    private static final SubLList $list34;
    private static final SubLSymbol $sym35$PROPERTY_LIST_P;
    private static final SubLSymbol $sym36$CFASL_COMPRESSION_OPTIONS_PROPERTY_P;
    private static final SubLList $list37;
    private static final SubLList $list38;
    private static final SubLString $str39$__CFASL_compression_dictionary___;
    private static final SubLSymbol $sym40$_;
    private static final SubLSymbol $sym41$CDR;
    private static final SubLSymbol $kw42$PRECOMPUTED;
    
    @SubLTranslatedFile.SubL(source = "cycl/cfasl-compression.lisp", position = 1741L)
    public static SubLObject new_cfasl_decompression_table() {
        return dictionary.new_dictionary(Symbols.symbol_function((SubLObject)cfasl_compression.EQ), (SubLObject)cfasl_compression.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cfasl-compression.lisp", position = 2012L)
    public static SubLObject push_new_cfasl_decompression_table(final SubLObject stream) {
        final SubLObject decompression_table = new_cfasl_decompression_table();
        return dictionary_utilities.dictionary_push(cfasl_compression.$cfasl_decompression_index$.getGlobalValue(), stream, decompression_table);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cfasl-compression.lisp", position = 2222L)
    public static SubLObject pop_cfasl_decompression_table(final SubLObject stream) {
        return dictionary_utilities.dictionary_pop(cfasl_compression.$cfasl_decompression_index$.getGlobalValue(), stream);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cfasl-compression.lisp", position = 2339L)
    public static SubLObject current_cfasl_decompression_table_for_stream(final SubLObject stream) {
        return dictionary.dictionary_lookup_without_values(cfasl_compression.$cfasl_decompression_index$.getGlobalValue(), stream, (SubLObject)cfasl_compression.UNPROVIDED).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cfasl-compression.lisp", position = 2497L)
    public static SubLObject enter_cfasl_decompression_pair(final SubLObject stream, final SubLObject code, final SubLObject v_object) {
        final SubLObject decompression_table = current_cfasl_decompression_table_for_stream(stream);
        return dictionary.dictionary_enter(decompression_table, code, v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cfasl-compression.lisp", position = 2792L)
    public static SubLObject decompress_cfasl_object(final SubLObject stream, final SubLObject code) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject decompression_table = current_cfasl_decompression_table_for_stream(stream);
        final SubLObject result = dictionary.dictionary_lookup_without_values(decompression_table, code, cfasl_compression.$cfasl_compression_not_found$.getGlobalValue());
        if (cfasl_compression.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && result.eql(cfasl_compression.$cfasl_compression_not_found$.getGlobalValue())) {
            Errors.error((SubLObject)cfasl_compression.$str11$Couldn_t_decompress__s_using_tabl, code, decompression_table);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cfasl-compression.lisp", position = 3178L)
    public static SubLObject cfasl_input_open_compressed_block(final SubLObject stream) {
        push_new_cfasl_decompression_table(stream);
        return cfasl.cfasl_input(stream, (SubLObject)cfasl_compression.UNPROVIDED, (SubLObject)cfasl_compression.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cfasl-compression.lisp", position = 3433L)
    public static SubLObject cfasl_input_compression_pair(final SubLObject stream) {
        final SubLObject code = cfasl.cfasl_input_object(stream);
        final SubLObject v_object = cfasl.cfasl_input_object(stream);
        enter_cfasl_decompression_pair(stream, code, v_object);
        return cfasl.cfasl_input(stream, (SubLObject)cfasl_compression.UNPROVIDED, (SubLObject)cfasl_compression.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cfasl-compression.lisp", position = 3746L)
    public static SubLObject cfasl_input_compression_key(final SubLObject stream) {
        final SubLObject code = cfasl.cfasl_input_object(stream);
        final SubLObject v_object = decompress_cfasl_object(stream, code);
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cfasl-compression.lisp", position = 3923L)
    public static SubLObject cfasl_input_close_compressed_block(final SubLObject stream) {
        pop_cfasl_decompression_table(stream);
        return cfasl.cfasl_input(stream, (SubLObject)cfasl_compression.UNPROVIDED, (SubLObject)cfasl_compression.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cfasl-compression.lisp", position = 4549L)
    public static SubLObject with_cfasl_compression(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cfasl_compression.$list12);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject stream = (SubLObject)cfasl_compression.NIL;
        SubLObject options = (SubLObject)cfasl_compression.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cfasl_compression.$list12);
        stream = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cfasl_compression.$list12);
        options = current.first();
        current = current.rest();
        if (cfasl_compression.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)cfasl_compression.$sym13$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)cfasl_compression.$sym14$_CFASL_OUTPUT_COMPRESSION_OPTIONS_, options), (SubLObject)cfasl_compression.$list15, (SubLObject)ConsesLow.list((SubLObject)cfasl_compression.$sym16$_CFASL_OUTPUT_COMPRESSION_TABLE_, (SubLObject)ConsesLow.list((SubLObject)cfasl_compression.$sym17$WITH_CFASL_COMPRESSION_CFASL_OUTPUT_COMPRESSION_TABLE, stream))), (SubLObject)ConsesLow.list((SubLObject)cfasl_compression.$sym18$WITH_CFASL_COMPRESSION_PREAMBLE, stream), ConsesLow.append(body, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)cfasl_compression.$sym19$WITH_CFASL_COMPRESSION_POSTAMBLE, stream))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)cfasl_compression.$list12);
        return (SubLObject)cfasl_compression.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cfasl-compression.lisp", position = 4972L)
    public static SubLObject with_cfasl_2_pass_compression(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cfasl_compression.$list20);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject stream_var = (SubLObject)cfasl_compression.NIL;
        SubLObject target_stream = (SubLObject)cfasl_compression.NIL;
        SubLObject options = (SubLObject)cfasl_compression.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cfasl_compression.$list20);
        stream_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cfasl_compression.$list20);
        target_stream = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cfasl_compression.$list20);
        options = current.first();
        current = current.rest();
        if (cfasl_compression.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.list((SubLObject)cfasl_compression.$sym13$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)cfasl_compression.$sym14$_CFASL_OUTPUT_COMPRESSION_OPTIONS_, options), (SubLObject)cfasl_compression.$list15, (SubLObject)ConsesLow.list((SubLObject)cfasl_compression.$sym16$_CFASL_OUTPUT_COMPRESSION_TABLE_, (SubLObject)ConsesLow.list((SubLObject)cfasl_compression.$sym17$WITH_CFASL_COMPRESSION_CFASL_OUTPUT_COMPRESSION_TABLE, target_stream))), (SubLObject)cfasl_compression.$list21, (SubLObject)ConsesLow.listS((SubLObject)cfasl_compression.$sym13$CLET, (SubLObject)ConsesLow.list((SubLObject)cfasl_compression.$list22, reader.bq_cons(stream_var, (SubLObject)cfasl_compression.$list23)), ConsesLow.append(body, (SubLObject)cfasl_compression.$list24)), (SubLObject)ConsesLow.listS((SubLObject)cfasl_compression.$sym13$CLET, reader.bq_cons((SubLObject)ConsesLow.list(stream_var, target_stream), (SubLObject)cfasl_compression.$list25), (SubLObject)ConsesLow.list((SubLObject)cfasl_compression.$sym26$CFASL_OUTPUT_OPEN_COMPRESSED_BLOCK, stream_var), ConsesLow.append(body, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)cfasl_compression.$sym27$CFASL_OUTPUT_CLOSE_COMPRESSED_BLOCK, stream_var)))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)cfasl_compression.$list20);
        return (SubLObject)cfasl_compression.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cfasl-compression.lisp", position = 6133L)
    public static SubLObject with_cfasl_compression_cfasl_output_compression_table(final SubLObject stream) {
        return dictionary.new_dictionary(Symbols.symbol_function((SubLObject)cfasl_compression.EQUAL), (SubLObject)cfasl_compression.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cfasl-compression.lisp", position = 6347L)
    public static SubLObject with_cfasl_compression_preamble(final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        validate_cfasl_compression_options(cfasl_compression.$cfasl_output_compression_options$.getDynamicValue(thread));
        final SubLObject object_to_analyze = conses_high.getf(cfasl_compression.$cfasl_output_compression_options$.getDynamicValue(thread), (SubLObject)cfasl_compression.$kw29$ANALYZE, (SubLObject)cfasl_compression.UNPROVIDED);
        if (cfasl_compression.NIL != object_to_analyze) {
            SubLObject table = (SubLObject)cfasl_compression.NIL;
            final SubLObject _prev_bind_0 = cfasl_compression.$within_cfasl_compression_analysisP$.currentBinding(thread);
            try {
                cfasl_compression.$within_cfasl_compression_analysisP$.bind((SubLObject)cfasl_compression.T, thread);
                final SubLObject options = (SubLObject)ConsesLow.list((SubLObject)cfasl_compression.$kw30$ALL_, (SubLObject)cfasl_compression.T, (SubLObject)cfasl_compression.$kw31$NOT, (SubLObject)ConsesLow.list(object_to_analyze), (SubLObject)cfasl_compression.$kw32$VERBOSE_, conses_high.getf(cfasl_compression.$cfasl_output_compression_options$.getDynamicValue(thread), (SubLObject)cfasl_compression.$kw32$VERBOSE_, (SubLObject)cfasl_compression.UNPROVIDED), (SubLObject)cfasl_compression.$kw33$EXTERNALIZED_, conses_high.getf(cfasl_compression.$cfasl_output_compression_options$.getDynamicValue(thread), (SubLObject)cfasl_compression.$kw33$EXTERNALIZED_, (SubLObject)cfasl_compression.UNPROVIDED));
                final SubLObject _prev_bind_0_$1 = cfasl_compression.$cfasl_output_compression_options$.currentBinding(thread);
                final SubLObject _prev_bind_2 = cfasl_compression.$cfasl_output_compression_code_isg$.currentBinding(thread);
                final SubLObject _prev_bind_3 = cfasl_compression.$cfasl_output_compression_table$.currentBinding(thread);
                try {
                    cfasl_compression.$cfasl_output_compression_options$.bind(options, thread);
                    cfasl_compression.$cfasl_output_compression_code_isg$.bind(integer_sequence_generator.new_integer_sequence_generator((SubLObject)cfasl_compression.UNPROVIDED, (SubLObject)cfasl_compression.UNPROVIDED, (SubLObject)cfasl_compression.UNPROVIDED), thread);
                    cfasl_compression.$cfasl_output_compression_table$.bind(with_cfasl_compression_cfasl_output_compression_table(StreamsLow.$null_output$.getDynamicValue(thread)), thread);
                    with_cfasl_compression_preamble(StreamsLow.$null_output$.getDynamicValue(thread));
                    cfasl.cfasl_output(object_to_analyze, StreamsLow.$null_output$.getDynamicValue(thread));
                    table = finalize_cfasl_output_compression_table(cfasl_compression.$cfasl_output_compression_table$.getDynamicValue(thread));
                    with_cfasl_compression_postamble(StreamsLow.$null_output$.getDynamicValue(thread));
                }
                finally {
                    cfasl_compression.$cfasl_output_compression_table$.rebind(_prev_bind_3, thread);
                    cfasl_compression.$cfasl_output_compression_code_isg$.rebind(_prev_bind_2, thread);
                    cfasl_compression.$cfasl_output_compression_options$.rebind(_prev_bind_0_$1, thread);
                }
            }
            finally {
                cfasl_compression.$within_cfasl_compression_analysisP$.rebind(_prev_bind_0, thread);
            }
            cfasl_compression.$cfasl_output_compression_table$.setDynamicValue(table, thread);
        }
        return cfasl_output_open_compressed_block(stream);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cfasl-compression.lisp", position = 7513L)
    public static SubLObject cfasl_compression_options_property_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, cfasl_compression.$cfasl_compression_options_properties$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cfasl-compression.lisp", position = 7644L)
    public static SubLObject validate_cfasl_compression_options(final SubLObject options) {
        assert cfasl_compression.NIL != list_utilities.property_list_p(options) : options;
        assert cfasl_compression.NIL != list_utilities.property_list_p(options) : options;
        SubLObject remainder;
        SubLObject property;
        SubLObject value;
        for (remainder = (SubLObject)cfasl_compression.NIL, remainder = options; cfasl_compression.NIL != remainder; remainder = conses_high.cddr(remainder)) {
            property = remainder.first();
            value = conses_high.cadr(remainder);
            assert cfasl_compression.NIL != cfasl_compression_options_property_p(property) : property;
        }
        return options;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cfasl-compression.lisp", position = 7828L)
    public static SubLObject with_cfasl_compression_postamble(final SubLObject stream) {
        return cfasl_output_close_compressed_block(stream);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cfasl-compression.lisp", position = 7980L)
    public static SubLObject without_cfasl_compression(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)cfasl_compression.$sym13$CLET, (SubLObject)cfasl_compression.$list37, ConsesLow.append(body, (SubLObject)cfasl_compression.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cfasl-compression.lisp", position = 8155L)
    public static SubLObject cfasl_compress_objectP(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cfasl_compression.NIL == cfasl_compression.$cfasl_output_compression_table$.getDynamicValue(thread)) {
            return (SubLObject)cfasl_compression.NIL;
        }
        if (cfasl_compression.NIL != cfasl_uncompressible_object_p(v_object)) {
            return (SubLObject)cfasl_compression.NIL;
        }
        if (cfasl_compression.NIL != conses_high.getf(cfasl_compression.$cfasl_output_compression_options$.getDynamicValue(thread), (SubLObject)cfasl_compression.$kw29$ANALYZE, (SubLObject)cfasl_compression.UNPROVIDED)) {
            return list_utilities.sublisp_boolean(dictionary.dictionary_lookup(cfasl_compression.$cfasl_output_compression_table$.getDynamicValue(thread), v_object, (SubLObject)cfasl_compression.UNPROVIDED));
        }
        if (cfasl_compression.NIL != list_utilities.member_eqP(v_object, conses_high.getf(cfasl_compression.$cfasl_output_compression_options$.getDynamicValue(thread), (SubLObject)cfasl_compression.$kw31$NOT, (SubLObject)cfasl_compression.UNPROVIDED))) {
            return (SubLObject)cfasl_compression.NIL;
        }
        if (cfasl_compression.NIL != conses_high.getf(cfasl_compression.$cfasl_output_compression_options$.getDynamicValue(thread), (SubLObject)cfasl_compression.$kw30$ALL_, (SubLObject)cfasl_compression.UNPROVIDED)) {
            return (SubLObject)cfasl_compression.T;
        }
        return (SubLObject)cfasl_compression.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cfasl-compression.lisp", position = 8818L)
    public static SubLObject cfasl_uncompressible_object_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(cfasl_compression.NIL == v_object || v_object.isFixnum() || cfasl_compression.NIL != cfasl.cfasl_common_symbol_p(v_object) || cfasl_compression.NIL != cycl_grammar.hl_variable_p(v_object) || (cfasl_compression.NIL == cfasl.within_cfasl_externalization_p() && cfasl_compression.NIL == conses_high.getf(cfasl_compression.$cfasl_output_compression_options$.getDynamicValue(thread), (SubLObject)cfasl_compression.$kw33$EXTERNALIZED_, (SubLObject)cfasl_compression.UNPROVIDED) && (cfasl_compression.NIL != constant_handles.constant_p(v_object) || cfasl_compression.NIL != nart_handles.nart_p(v_object) || cfasl_compression.NIL != assertion_handles.assertion_p(v_object))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cfasl-compression.lisp", position = 9202L)
    public static SubLObject finalize_cfasl_output_compression_table(final SubLObject old_dict) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject new_dict = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)cfasl_compression.EQUAL), (SubLObject)cfasl_compression.UNPROVIDED);
        SubLObject got_oneP;
        for (SubLObject doneP = (SubLObject)cfasl_compression.NIL; cfasl_compression.NIL == doneP; doneP = (SubLObject)SubLObjectFactory.makeBoolean(cfasl_compression.NIL == got_oneP)) {
            got_oneP = (SubLObject)cfasl_compression.NIL;
            SubLObject cdolist_list_var = dictionary_utilities.dictionary_to_alist(old_dict);
            SubLObject cons = (SubLObject)cfasl_compression.NIL;
            cons = cdolist_list_var.first();
            while (cfasl_compression.NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = cons;
                SubLObject v_object = (SubLObject)cfasl_compression.NIL;
                SubLObject count = (SubLObject)cfasl_compression.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cfasl_compression.$list38);
                v_object = current.first();
                current = (count = current.rest());
                if (cfasl_compression.ONE_INTEGER.numE(count) && v_object.isCons()) {
                    got_oneP = (SubLObject)cfasl_compression.T;
                    dictionary.dictionary_remove(old_dict, v_object);
                    SubLObject cons_$2;
                    SubLObject element;
                    for (cons_$2 = (SubLObject)cfasl_compression.NIL, cons_$2 = v_object; cons_$2.isCons(); cons_$2 = cons_$2.rest()) {
                        element = cons_$2.first();
                        if (cfasl_compression.NIL == cfasl_uncompressible_object_p(element)) {
                            dictionary_utilities.dictionary_increment(old_dict, element, (SubLObject)cfasl_compression.UNPROVIDED);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                cons = cdolist_list_var.first();
            }
        }
        if (cfasl_compression.NIL != conses_high.getf(cfasl_compression.$cfasl_output_compression_options$.getDynamicValue(thread), (SubLObject)cfasl_compression.$kw32$VERBOSE_, (SubLObject)cfasl_compression.UNPROVIDED)) {
            PrintLow.format((SubLObject)cfasl_compression.T, (SubLObject)cfasl_compression.$str39$__CFASL_compression_dictionary___);
            format_nil.print_one_per_line(Sequences.delete((SubLObject)cfasl_compression.ONE_INTEGER, dictionary_utilities.sort_dictionary_by_values(old_dict, Symbols.symbol_function((SubLObject)cfasl_compression.$sym40$_)), Symbols.symbol_function((SubLObject)cfasl_compression.EQ), Symbols.symbol_function((SubLObject)cfasl_compression.$sym41$CDR), (SubLObject)cfasl_compression.UNPROVIDED, (SubLObject)cfasl_compression.UNPROVIDED, (SubLObject)cfasl_compression.UNPROVIDED), (SubLObject)cfasl_compression.UNPROVIDED);
        }
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(old_dict)); cfasl_compression.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject v_object2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject count2 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (count2.numGE((SubLObject)cfasl_compression.TWO_INTEGER)) {
                dictionary.dictionary_enter(new_dict, v_object2, (SubLObject)cfasl_compression.$kw42$PRECOMPUTED);
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return new_dict;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cfasl-compression.lisp", position = 10252L)
    public static SubLObject cfasl_output_open_compressed_block(final SubLObject stream) {
        return cfasl.cfasl_raw_write_byte(cfasl_compression.$cfasl_opcode_open_compressed_block$.getGlobalValue(), stream);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cfasl-compression.lisp", position = 10389L)
    public static SubLObject cfasl_output_object_compressed(final SubLObject v_object, final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cfasl_compression.NIL != cfasl_compression.$within_cfasl_compression_analysisP$.getDynamicValue(thread)) {
            return dictionary_utilities.dictionary_increment(cfasl_compression.$cfasl_output_compression_table$.getDynamicValue(thread), v_object, (SubLObject)cfasl_compression.UNPROVIDED);
        }
        SubLObject code = dictionary.dictionary_lookup(cfasl_compression.$cfasl_output_compression_table$.getDynamicValue(thread), v_object, (SubLObject)cfasl_compression.UNPROVIDED);
        if (cfasl_compression.NIL == code || cfasl_compression.$kw42$PRECOMPUTED == code) {
            code = cfasl_output_compression_pair(v_object, stream);
        }
        return cfasl_output_compressed_object(code, stream);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cfasl-compression.lisp", position = 10827L)
    public static SubLObject cfasl_output_compression_pair(final SubLObject v_object, final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject code = integer_sequence_generator.integer_sequence_generator_next(cfasl_compression.$cfasl_output_compression_code_isg$.getDynamicValue(thread));
        dictionary.dictionary_enter(cfasl_compression.$cfasl_output_compression_table$.getDynamicValue(thread), v_object, code);
        cfasl.cfasl_raw_write_byte(cfasl_compression.$cfasl_opcode_compression_pair$.getGlobalValue(), stream);
        final SubLObject _prev_bind_0 = cfasl_compression.$cfasl_output_compression_table$.currentBinding(thread);
        try {
            cfasl_compression.$cfasl_output_compression_table$.bind((SubLObject)cfasl_compression.NIL, thread);
            cfasl.cfasl_output(code, stream);
            cfasl.cfasl_output(v_object, stream);
        }
        finally {
            cfasl_compression.$cfasl_output_compression_table$.rebind(_prev_bind_0, thread);
        }
        return code;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cfasl-compression.lisp", position = 11228L)
    public static SubLObject cfasl_output_compressed_object(final SubLObject code, final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        cfasl.cfasl_raw_write_byte(cfasl_compression.$cfasl_opcode_compression_key$.getGlobalValue(), stream);
        final SubLObject _prev_bind_0 = cfasl_compression.$cfasl_output_compression_table$.currentBinding(thread);
        try {
            cfasl_compression.$cfasl_output_compression_table$.bind((SubLObject)cfasl_compression.NIL, thread);
            cfasl.cfasl_output(code, stream);
        }
        finally {
            cfasl_compression.$cfasl_output_compression_table$.rebind(_prev_bind_0, thread);
        }
        return code;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cfasl-compression.lisp", position = 11428L)
    public static SubLObject cfasl_output_close_compressed_block(final SubLObject stream) {
        return cfasl.cfasl_raw_write_byte(cfasl_compression.$cfasl_opcode_close_compressed_block$.getGlobalValue(), stream);
    }
    
    public static SubLObject declare_cfasl_compression_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cfasl_compression", "new_cfasl_decompression_table", "NEW-CFASL-DECOMPRESSION-TABLE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cfasl_compression", "push_new_cfasl_decompression_table", "PUSH-NEW-CFASL-DECOMPRESSION-TABLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cfasl_compression", "pop_cfasl_decompression_table", "POP-CFASL-DECOMPRESSION-TABLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cfasl_compression", "current_cfasl_decompression_table_for_stream", "CURRENT-CFASL-DECOMPRESSION-TABLE-FOR-STREAM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cfasl_compression", "enter_cfasl_decompression_pair", "ENTER-CFASL-DECOMPRESSION-PAIR", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cfasl_compression", "decompress_cfasl_object", "DECOMPRESS-CFASL-OBJECT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cfasl_compression", "cfasl_input_open_compressed_block", "CFASL-INPUT-OPEN-COMPRESSED-BLOCK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cfasl_compression", "cfasl_input_compression_pair", "CFASL-INPUT-COMPRESSION-PAIR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cfasl_compression", "cfasl_input_compression_key", "CFASL-INPUT-COMPRESSION-KEY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cfasl_compression", "cfasl_input_close_compressed_block", "CFASL-INPUT-CLOSE-COMPRESSED-BLOCK", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cfasl_compression", "with_cfasl_compression", "WITH-CFASL-COMPRESSION");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cfasl_compression", "with_cfasl_2_pass_compression", "WITH-CFASL-2-PASS-COMPRESSION");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cfasl_compression", "with_cfasl_compression_cfasl_output_compression_table", "WITH-CFASL-COMPRESSION-CFASL-OUTPUT-COMPRESSION-TABLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cfasl_compression", "with_cfasl_compression_preamble", "WITH-CFASL-COMPRESSION-PREAMBLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cfasl_compression", "cfasl_compression_options_property_p", "CFASL-COMPRESSION-OPTIONS-PROPERTY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cfasl_compression", "validate_cfasl_compression_options", "VALIDATE-CFASL-COMPRESSION-OPTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cfasl_compression", "with_cfasl_compression_postamble", "WITH-CFASL-COMPRESSION-POSTAMBLE", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cfasl_compression", "without_cfasl_compression", "WITHOUT-CFASL-COMPRESSION");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cfasl_compression", "cfasl_compress_objectP", "CFASL-COMPRESS-OBJECT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cfasl_compression", "cfasl_uncompressible_object_p", "CFASL-UNCOMPRESSIBLE-OBJECT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cfasl_compression", "finalize_cfasl_output_compression_table", "FINALIZE-CFASL-OUTPUT-COMPRESSION-TABLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cfasl_compression", "cfasl_output_open_compressed_block", "CFASL-OUTPUT-OPEN-COMPRESSED-BLOCK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cfasl_compression", "cfasl_output_object_compressed", "CFASL-OUTPUT-OBJECT-COMPRESSED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cfasl_compression", "cfasl_output_compression_pair", "CFASL-OUTPUT-COMPRESSION-PAIR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cfasl_compression", "cfasl_output_compressed_object", "CFASL-OUTPUT-COMPRESSED-OBJECT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cfasl_compression", "cfasl_output_close_compressed_block", "CFASL-OUTPUT-CLOSE-COMPRESSED-BLOCK", 1, 0, false);
        return (SubLObject)cfasl_compression.NIL;
    }
    
    public static SubLObject init_cfasl_compression_file() {
        cfasl_compression.$cfasl_opcode_open_compressed_block$ = SubLFiles.defconstant("*CFASL-OPCODE-OPEN-COMPRESSED-BLOCK*", (SubLObject)cfasl_compression.$int0$54);
        cfasl_compression.$cfasl_opcode_compression_pair$ = SubLFiles.defconstant("*CFASL-OPCODE-COMPRESSION-PAIR*", (SubLObject)cfasl_compression.$int2$55);
        cfasl_compression.$cfasl_opcode_compression_key$ = SubLFiles.defconstant("*CFASL-OPCODE-COMPRESSION-KEY*", (SubLObject)cfasl_compression.$int4$56);
        cfasl_compression.$cfasl_opcode_close_compressed_block$ = SubLFiles.defconstant("*CFASL-OPCODE-CLOSE-COMPRESSED-BLOCK*", (SubLObject)cfasl_compression.$int6$57);
        cfasl_compression.$cfasl_decompression_index$ = SubLFiles.deflexical("*CFASL-DECOMPRESSION-INDEX*", (cfasl_compression.NIL != Symbols.boundp((SubLObject)cfasl_compression.$sym8$_CFASL_DECOMPRESSION_INDEX_)) ? cfasl_compression.$cfasl_decompression_index$.getGlobalValue() : dictionary.new_dictionary(Symbols.symbol_function((SubLObject)cfasl_compression.EQ), (SubLObject)cfasl_compression.UNPROVIDED));
        cfasl_compression.$cfasl_compression_not_found$ = SubLFiles.deflexical("*CFASL-COMPRESSION-NOT-FOUND*", (cfasl_compression.NIL != Symbols.boundp((SubLObject)cfasl_compression.$sym9$_CFASL_COMPRESSION_NOT_FOUND_)) ? cfasl_compression.$cfasl_compression_not_found$.getGlobalValue() : Symbols.make_symbol((SubLObject)cfasl_compression.$str10$NOT_FOUND));
        cfasl_compression.$cfasl_output_compression_options$ = SubLFiles.defparameter("*CFASL-OUTPUT-COMPRESSION-OPTIONS*", (SubLObject)cfasl_compression.NIL);
        cfasl_compression.$cfasl_output_compression_table$ = SubLFiles.defparameter("*CFASL-OUTPUT-COMPRESSION-TABLE*", (SubLObject)cfasl_compression.NIL);
        cfasl_compression.$cfasl_output_compression_code_isg$ = SubLFiles.defparameter("*CFASL-OUTPUT-COMPRESSION-CODE-ISG*", (SubLObject)cfasl_compression.NIL);
        cfasl_compression.$within_cfasl_compression_analysisP$ = SubLFiles.defparameter("*WITHIN-CFASL-COMPRESSION-ANALYSIS?*", (SubLObject)cfasl_compression.NIL);
        cfasl_compression.$cfasl_compression_options_properties$ = SubLFiles.deflexical("*CFASL-COMPRESSION-OPTIONS-PROPERTIES*", (SubLObject)cfasl_compression.$list34);
        return (SubLObject)cfasl_compression.NIL;
    }
    
    public static SubLObject setup_cfasl_compression_file() {
        cfasl.register_cfasl_input_function(cfasl_compression.$cfasl_opcode_open_compressed_block$.getGlobalValue(), (SubLObject)cfasl_compression.$sym1$CFASL_INPUT_OPEN_COMPRESSED_BLOCK);
        cfasl.register_cfasl_input_function(cfasl_compression.$cfasl_opcode_compression_pair$.getGlobalValue(), (SubLObject)cfasl_compression.$sym3$CFASL_INPUT_COMPRESSION_PAIR);
        cfasl.register_cfasl_input_function(cfasl_compression.$cfasl_opcode_compression_key$.getGlobalValue(), (SubLObject)cfasl_compression.$sym5$CFASL_INPUT_COMPRESSION_KEY);
        cfasl.register_cfasl_input_function(cfasl_compression.$cfasl_opcode_close_compressed_block$.getGlobalValue(), (SubLObject)cfasl_compression.$sym7$CFASL_INPUT_CLOSE_COMPRESSED_BLOCK);
        subl_macro_promotions.declare_defglobal((SubLObject)cfasl_compression.$sym8$_CFASL_DECOMPRESSION_INDEX_);
        subl_macro_promotions.declare_defglobal((SubLObject)cfasl_compression.$sym9$_CFASL_COMPRESSION_NOT_FOUND_);
        utilities_macros.note_funcall_helper_function((SubLObject)cfasl_compression.$sym1$CFASL_INPUT_OPEN_COMPRESSED_BLOCK);
        utilities_macros.note_funcall_helper_function((SubLObject)cfasl_compression.$sym3$CFASL_INPUT_COMPRESSION_PAIR);
        utilities_macros.note_funcall_helper_function((SubLObject)cfasl_compression.$sym5$CFASL_INPUT_COMPRESSION_KEY);
        utilities_macros.note_funcall_helper_function((SubLObject)cfasl_compression.$sym7$CFASL_INPUT_CLOSE_COMPRESSED_BLOCK);
        access_macros.register_macro_helper((SubLObject)cfasl_compression.$sym17$WITH_CFASL_COMPRESSION_CFASL_OUTPUT_COMPRESSION_TABLE, (SubLObject)cfasl_compression.$sym28$WITH_CFASL_COMPRESSION);
        access_macros.register_macro_helper((SubLObject)cfasl_compression.$sym18$WITH_CFASL_COMPRESSION_PREAMBLE, (SubLObject)cfasl_compression.$sym28$WITH_CFASL_COMPRESSION);
        access_macros.register_macro_helper((SubLObject)cfasl_compression.$sym19$WITH_CFASL_COMPRESSION_POSTAMBLE, (SubLObject)cfasl_compression.$sym28$WITH_CFASL_COMPRESSION);
        return (SubLObject)cfasl_compression.NIL;
    }
    
    public void declareFunctions() {
        declare_cfasl_compression_file();
    }
    
    public void initializeVariables() {
        init_cfasl_compression_file();
    }
    
    public void runTopLevelForms() {
        setup_cfasl_compression_file();
    }
    
    static {
        me = (SubLFile)new cfasl_compression();
        cfasl_compression.$cfasl_opcode_open_compressed_block$ = null;
        cfasl_compression.$cfasl_opcode_compression_pair$ = null;
        cfasl_compression.$cfasl_opcode_compression_key$ = null;
        cfasl_compression.$cfasl_opcode_close_compressed_block$ = null;
        cfasl_compression.$cfasl_decompression_index$ = null;
        cfasl_compression.$cfasl_compression_not_found$ = null;
        cfasl_compression.$cfasl_output_compression_options$ = null;
        cfasl_compression.$cfasl_output_compression_table$ = null;
        cfasl_compression.$cfasl_output_compression_code_isg$ = null;
        cfasl_compression.$within_cfasl_compression_analysisP$ = null;
        cfasl_compression.$cfasl_compression_options_properties$ = null;
        $int0$54 = SubLObjectFactory.makeInteger(54);
        $sym1$CFASL_INPUT_OPEN_COMPRESSED_BLOCK = SubLObjectFactory.makeSymbol("CFASL-INPUT-OPEN-COMPRESSED-BLOCK");
        $int2$55 = SubLObjectFactory.makeInteger(55);
        $sym3$CFASL_INPUT_COMPRESSION_PAIR = SubLObjectFactory.makeSymbol("CFASL-INPUT-COMPRESSION-PAIR");
        $int4$56 = SubLObjectFactory.makeInteger(56);
        $sym5$CFASL_INPUT_COMPRESSION_KEY = SubLObjectFactory.makeSymbol("CFASL-INPUT-COMPRESSION-KEY");
        $int6$57 = SubLObjectFactory.makeInteger(57);
        $sym7$CFASL_INPUT_CLOSE_COMPRESSED_BLOCK = SubLObjectFactory.makeSymbol("CFASL-INPUT-CLOSE-COMPRESSED-BLOCK");
        $sym8$_CFASL_DECOMPRESSION_INDEX_ = SubLObjectFactory.makeSymbol("*CFASL-DECOMPRESSION-INDEX*");
        $sym9$_CFASL_COMPRESSION_NOT_FOUND_ = SubLObjectFactory.makeSymbol("*CFASL-COMPRESSION-NOT-FOUND*");
        $str10$NOT_FOUND = SubLObjectFactory.makeString("NOT-FOUND");
        $str11$Couldn_t_decompress__s_using_tabl = SubLObjectFactory.makeString("Couldn't decompress ~s using table ~s");
        $list12 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeSymbol("OPTIONS")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym13$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym14$_CFASL_OUTPUT_COMPRESSION_OPTIONS_ = SubLObjectFactory.makeSymbol("*CFASL-OUTPUT-COMPRESSION-OPTIONS*");
        $list15 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*CFASL-OUTPUT-COMPRESSION-CODE-ISG*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-INTEGER-SEQUENCE-GENERATOR")));
        $sym16$_CFASL_OUTPUT_COMPRESSION_TABLE_ = SubLObjectFactory.makeSymbol("*CFASL-OUTPUT-COMPRESSION-TABLE*");
        $sym17$WITH_CFASL_COMPRESSION_CFASL_OUTPUT_COMPRESSION_TABLE = SubLObjectFactory.makeSymbol("WITH-CFASL-COMPRESSION-CFASL-OUTPUT-COMPRESSION-TABLE");
        $sym18$WITH_CFASL_COMPRESSION_PREAMBLE = SubLObjectFactory.makeSymbol("WITH-CFASL-COMPRESSION-PREAMBLE");
        $sym19$WITH_CFASL_COMPRESSION_POSTAMBLE = SubLObjectFactory.makeSymbol("WITH-CFASL-COMPRESSION-POSTAMBLE");
        $list20 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STREAM-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-STREAM"), (SubLObject)SubLObjectFactory.makeSymbol("OPTIONS")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list21 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VALIDATE-CFASL-COMPRESSION-OPTIONS"), (SubLObject)SubLObjectFactory.makeSymbol("*CFASL-OUTPUT-COMPRESSION-OPTIONS*"));
        $list22 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*WITHIN-CFASL-COMPRESSION-ANALYSIS?*"), (SubLObject)cfasl_compression.T);
        $list23 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*NULL-OUTPUT*"));
        $list24 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("*CFASL-OUTPUT-COMPRESSION-TABLE*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FINALIZE-CFASL-OUTPUT-COMPRESSION-TABLE"), (SubLObject)SubLObjectFactory.makeSymbol("*CFASL-OUTPUT-COMPRESSION-TABLE*"))));
        $list25 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*CFASL-OUTPUT-COMPRESSION-OPTIONS*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUTF"), (SubLObject)SubLObjectFactory.makeSymbol("*CFASL-OUTPUT-COMPRESSION-OPTIONS*"), (SubLObject)SubLObjectFactory.makeKeyword("ANALYZE"), (SubLObject)SubLObjectFactory.makeKeyword("OBJECT"))));
        $sym26$CFASL_OUTPUT_OPEN_COMPRESSED_BLOCK = SubLObjectFactory.makeSymbol("CFASL-OUTPUT-OPEN-COMPRESSED-BLOCK");
        $sym27$CFASL_OUTPUT_CLOSE_COMPRESSED_BLOCK = SubLObjectFactory.makeSymbol("CFASL-OUTPUT-CLOSE-COMPRESSED-BLOCK");
        $sym28$WITH_CFASL_COMPRESSION = SubLObjectFactory.makeSymbol("WITH-CFASL-COMPRESSION");
        $kw29$ANALYZE = SubLObjectFactory.makeKeyword("ANALYZE");
        $kw30$ALL_ = SubLObjectFactory.makeKeyword("ALL?");
        $kw31$NOT = SubLObjectFactory.makeKeyword("NOT");
        $kw32$VERBOSE_ = SubLObjectFactory.makeKeyword("VERBOSE?");
        $kw33$EXTERNALIZED_ = SubLObjectFactory.makeKeyword("EXTERNALIZED?");
        $list34 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ALL?"), (SubLObject)SubLObjectFactory.makeKeyword("ANALYZE"), (SubLObject)SubLObjectFactory.makeKeyword("NOT"), (SubLObject)SubLObjectFactory.makeKeyword("VERBOSE?"), (SubLObject)SubLObjectFactory.makeKeyword("EXTERNALIZED?"));
        $sym35$PROPERTY_LIST_P = SubLObjectFactory.makeSymbol("PROPERTY-LIST-P");
        $sym36$CFASL_COMPRESSION_OPTIONS_PROPERTY_P = SubLObjectFactory.makeSymbol("CFASL-COMPRESSION-OPTIONS-PROPERTY-P");
        $list37 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*CFASL-OUTPUT-COMPRESSION-TABLE*"), (SubLObject)cfasl_compression.NIL));
        $list38 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("OBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("COUNT"));
        $str39$__CFASL_compression_dictionary___ = SubLObjectFactory.makeString("~&CFASL compression dictionary:~%");
        $sym40$_ = SubLObjectFactory.makeSymbol(">");
        $sym41$CDR = SubLObjectFactory.makeSymbol("CDR");
        $kw42$PRECOMPUTED = SubLObjectFactory.makeKeyword("PRECOMPUTED");
    }
}

/*

	Total time: 151 ms
	
*/