package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_macro_helper;
import static com.cyc.cycjava.cycl.cfasl.cfasl_common_symbol_p;
import static com.cyc.cycjava.cycl.cfasl.cfasl_input;
import static com.cyc.cycjava.cycl.cfasl.cfasl_input_object;
import static com.cyc.cycjava.cycl.cfasl.cfasl_output;
import static com.cyc.cycjava.cycl.cfasl.cfasl_raw_write_byte;
import static com.cyc.cycjava.cycl.cfasl.register_cfasl_input_function;
import static com.cyc.cycjava.cycl.cfasl.within_cfasl_externalization_p;
import static com.cyc.cycjava.cycl.constant_handles.constant_p;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.utilities_macros.note_funcall_helper_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.make_symbol;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLSystemTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class cfasl_compression extends SubLTranslatedFile {
    public static final SubLFile me = new cfasl_compression();

    public static final String myName = "com.cyc.cycjava.cycl.cfasl_compression";

    public static final String myFingerPrint = "3d54b6ea90ca9e6159c98e940f382774f658e839e6c38cde88039632a7e38712";

    // defconstant
    private static final SubLSymbol $cfasl_opcode_open_compressed_block$ = makeSymbol("*CFASL-OPCODE-OPEN-COMPRESSED-BLOCK*");

    // defconstant
    private static final SubLSymbol $cfasl_opcode_compression_pair$ = makeSymbol("*CFASL-OPCODE-COMPRESSION-PAIR*");

    // defconstant
    private static final SubLSymbol $cfasl_opcode_compression_key$ = makeSymbol("*CFASL-OPCODE-COMPRESSION-KEY*");

    // defconstant
    private static final SubLSymbol $cfasl_opcode_close_compressed_block$ = makeSymbol("*CFASL-OPCODE-CLOSE-COMPRESSED-BLOCK*");









    // defparameter
    public static final SubLSymbol $cfasl_output_compression_code_isg$ = makeSymbol("*CFASL-OUTPUT-COMPRESSION-CODE-ISG*");

    // defparameter
    private static final SubLSymbol $within_cfasl_compression_analysisP$ = makeSymbol("*WITHIN-CFASL-COMPRESSION-ANALYSIS?*");

    // deflexical
    // The valid properties for the CFASL compression options property list.
    private static final SubLSymbol $cfasl_compression_options_properties$ = makeSymbol("*CFASL-COMPRESSION-OPTIONS-PROPERTIES*");

    private static final SubLInteger $int$54 = makeInteger(54);

    public static final SubLSymbol CFASL_INPUT_OPEN_COMPRESSED_BLOCK = makeSymbol("CFASL-INPUT-OPEN-COMPRESSED-BLOCK");

    private static final SubLInteger $int$55 = makeInteger(55);

    public static final SubLSymbol CFASL_INPUT_COMPRESSION_PAIR = makeSymbol("CFASL-INPUT-COMPRESSION-PAIR");

    private static final SubLInteger $int$56 = makeInteger(56);

    public static final SubLSymbol CFASL_INPUT_COMPRESSION_KEY = makeSymbol("CFASL-INPUT-COMPRESSION-KEY");

    private static final SubLInteger $int$57 = makeInteger(57);

    public static final SubLSymbol CFASL_INPUT_CLOSE_COMPRESSED_BLOCK = makeSymbol("CFASL-INPUT-CLOSE-COMPRESSED-BLOCK");

    public static final SubLSymbol $cfasl_decompression_index$ = makeSymbol("*CFASL-DECOMPRESSION-INDEX*");

    public static final SubLSymbol $cfasl_compression_not_found$ = makeSymbol("*CFASL-COMPRESSION-NOT-FOUND*");

    public static final SubLString $str10$NOT_FOUND = makeString("NOT-FOUND");

    public static final SubLString $str11$Couldn_t_decompress__s_using_tabl = makeString("Couldn't decompress ~s using table ~s");

    public static final SubLList $list12 = list(list(makeSymbol("STREAM"), makeSymbol("OPTIONS")), makeSymbol("&BODY"), makeSymbol("BODY"));



    public static final SubLSymbol $cfasl_output_compression_options$ = makeSymbol("*CFASL-OUTPUT-COMPRESSION-OPTIONS*");

    public static final SubLList $list15 = list(makeSymbol("*CFASL-OUTPUT-COMPRESSION-CODE-ISG*"), list(makeSymbol("NEW-INTEGER-SEQUENCE-GENERATOR")));

    public static final SubLSymbol $cfasl_output_compression_table$ = makeSymbol("*CFASL-OUTPUT-COMPRESSION-TABLE*");

    public static final SubLSymbol WITH_CFASL_COMPRESSION_CFASL_OUTPUT_COMPRESSION_TABLE = makeSymbol("WITH-CFASL-COMPRESSION-CFASL-OUTPUT-COMPRESSION-TABLE");

    public static final SubLSymbol WITH_CFASL_COMPRESSION_PREAMBLE = makeSymbol("WITH-CFASL-COMPRESSION-PREAMBLE");

    public static final SubLSymbol WITH_CFASL_COMPRESSION_POSTAMBLE = makeSymbol("WITH-CFASL-COMPRESSION-POSTAMBLE");

    private static final SubLList $list20 = list(list(makeSymbol("STREAM-VAR"), makeSymbol("TARGET-STREAM"), makeSymbol("OPTIONS")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list21 = list(makeSymbol("VALIDATE-CFASL-COMPRESSION-OPTIONS"), makeSymbol("*CFASL-OUTPUT-COMPRESSION-OPTIONS*"));

    private static final SubLList $list22 = list(makeSymbol("*WITHIN-CFASL-COMPRESSION-ANALYSIS?*"), T);

    private static final SubLList $list23 = list(makeSymbol("*NULL-OUTPUT*"));

    private static final SubLList $list24 = list(list(makeSymbol("CSETQ"), makeSymbol("*CFASL-OUTPUT-COMPRESSION-TABLE*"), list(makeSymbol("FINALIZE-CFASL-OUTPUT-COMPRESSION-TABLE"), makeSymbol("*CFASL-OUTPUT-COMPRESSION-TABLE*"))));

    public static final SubLList $list25 = list(list(makeSymbol("*CFASL-OUTPUT-COMPRESSION-OPTIONS*"), list(makeSymbol("PUTF"), makeSymbol("*CFASL-OUTPUT-COMPRESSION-OPTIONS*"), makeKeyword("ANALYZE"), makeKeyword("OBJECT"))));

    private static final SubLSymbol CFASL_OUTPUT_OPEN_COMPRESSED_BLOCK = makeSymbol("CFASL-OUTPUT-OPEN-COMPRESSED-BLOCK");

    private static final SubLSymbol CFASL_OUTPUT_CLOSE_COMPRESSED_BLOCK = makeSymbol("CFASL-OUTPUT-CLOSE-COMPRESSED-BLOCK");

    private static final SubLSymbol WITH_CFASL_COMPRESSION = makeSymbol("WITH-CFASL-COMPRESSION");











    private static final SubLList $list34 = list(makeKeyword("ALL?"), makeKeyword("ANALYZE"), makeKeyword("NOT"), makeKeyword("VERBOSE?"), makeKeyword("EXTERNALIZED?"));



    private static final SubLSymbol CFASL_COMPRESSION_OPTIONS_PROPERTY_P = makeSymbol("CFASL-COMPRESSION-OPTIONS-PROPERTY-P");

    private static final SubLList $list37 = list(list(makeSymbol("*CFASL-OUTPUT-COMPRESSION-TABLE*"), NIL));

    private static final SubLList $list38 = cons(makeSymbol("OBJECT"), makeSymbol("COUNT"));

    private static final SubLString $str39$__CFASL_compression_dictionary___ = makeString("~&CFASL compression dictionary:~%");

    private static final SubLSymbol $sym40$_ = makeSymbol(">");





    public static SubLObject new_cfasl_decompression_table() {
        return dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED);
    }

    public static SubLObject push_new_cfasl_decompression_table(final SubLObject stream) {
        final SubLObject decompression_table = new_cfasl_decompression_table();
        return dictionary_utilities.dictionary_push($cfasl_decompression_index$.getGlobalValue(), stream, decompression_table);
    }

    public static SubLObject pop_cfasl_decompression_table(final SubLObject stream) {
        return dictionary_utilities.dictionary_pop($cfasl_decompression_index$.getGlobalValue(), stream);
    }

    public static SubLObject current_cfasl_decompression_table_for_stream(final SubLObject stream) {
        return dictionary.dictionary_lookup_without_values($cfasl_decompression_index$.getGlobalValue(), stream, UNPROVIDED).first();
    }

    public static SubLObject enter_cfasl_decompression_pair(final SubLObject stream, final SubLObject code, final SubLObject v_object) {
        final SubLObject decompression_table = current_cfasl_decompression_table_for_stream(stream);
        return dictionary.dictionary_enter(decompression_table, code, v_object);
    }

    public static SubLObject decompress_cfasl_object(final SubLObject stream, final SubLObject code) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject decompression_table = current_cfasl_decompression_table_for_stream(stream);
        final SubLObject result = dictionary.dictionary_lookup_without_values(decompression_table, code, $cfasl_compression_not_found$.getGlobalValue());
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && result.eql($cfasl_compression_not_found$.getGlobalValue())) {
            Errors.error($str11$Couldn_t_decompress__s_using_tabl, code, decompression_table);
        }
        return result;
    }

    public static SubLObject cfasl_input_open_compressed_block(final SubLObject stream) {
        push_new_cfasl_decompression_table(stream);
        return cfasl_input(stream, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject cfasl_input_compression_pair(final SubLObject stream) {
        final SubLObject code = cfasl_input_object(stream);
        final SubLObject v_object = cfasl_input_object(stream);
        enter_cfasl_decompression_pair(stream, code, v_object);
        return cfasl_input(stream, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject cfasl_input_compression_key(final SubLObject stream) {
        final SubLObject code = cfasl_input_object(stream);
        final SubLObject v_object = decompress_cfasl_object(stream, code);
        return v_object;
    }

    public static SubLObject cfasl_input_close_compressed_block(final SubLObject stream) {
        pop_cfasl_decompression_table(stream);
        return cfasl_input(stream, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject with_cfasl_compression(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list12);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject stream = NIL;
        SubLObject options = NIL;
        destructuring_bind_must_consp(current, datum, $list12);
        stream = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list12);
        options = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(CLET, list(list($cfasl_output_compression_options$, options), $list15, list($cfasl_output_compression_table$, list(WITH_CFASL_COMPRESSION_CFASL_OUTPUT_COMPRESSION_TABLE, stream))), list(WITH_CFASL_COMPRESSION_PREAMBLE, stream), append(body, list(list(WITH_CFASL_COMPRESSION_POSTAMBLE, stream))));
        }
        cdestructuring_bind_error(datum, $list12);
        return NIL;
    }

    public static SubLObject with_cfasl_2_pass_compression(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list20);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject stream_var = NIL;
        SubLObject target_stream = NIL;
        SubLObject options = NIL;
        destructuring_bind_must_consp(current, datum, $list20);
        stream_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list20);
        target_stream = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list20);
        options = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return list(CLET, list(list($cfasl_output_compression_options$, options), $list15, list($cfasl_output_compression_table$, list(WITH_CFASL_COMPRESSION_CFASL_OUTPUT_COMPRESSION_TABLE, target_stream))), $list21, listS(CLET, list($list22, bq_cons(stream_var, $list23)), append(body, $list24)), listS(CLET, bq_cons(list(stream_var, target_stream), $list25), list(CFASL_OUTPUT_OPEN_COMPRESSED_BLOCK, stream_var), append(body, list(list(CFASL_OUTPUT_CLOSE_COMPRESSED_BLOCK, stream_var)))));
        }
        cdestructuring_bind_error(datum, $list20);
        return NIL;
    }

    public static SubLObject with_cfasl_compression_cfasl_output_compression_table(final SubLObject stream) {
        return dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
    }

    public static SubLObject with_cfasl_compression_preamble(final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        validate_cfasl_compression_options($cfasl_output_compression_options$.getDynamicValue(thread));
        final SubLObject object_to_analyze = getf($cfasl_output_compression_options$.getDynamicValue(thread), $ANALYZE, UNPROVIDED);
        if (NIL != object_to_analyze) {
            SubLObject table = NIL;
            final SubLObject _prev_bind_0 = $within_cfasl_compression_analysisP$.currentBinding(thread);
            try {
                $within_cfasl_compression_analysisP$.bind(T, thread);
                final SubLObject options = list($ALL_, T, $NOT, list(object_to_analyze), $VERBOSE_, getf($cfasl_output_compression_options$.getDynamicValue(thread), $VERBOSE_, UNPROVIDED), $EXTERNALIZED_, getf($cfasl_output_compression_options$.getDynamicValue(thread), $EXTERNALIZED_, UNPROVIDED));
                final SubLObject _prev_bind_0_$1 = $cfasl_output_compression_options$.currentBinding(thread);
                final SubLObject _prev_bind_2 = $cfasl_output_compression_code_isg$.currentBinding(thread);
                final SubLObject _prev_bind_3 = $cfasl_output_compression_table$.currentBinding(thread);
                try {
                    $cfasl_output_compression_options$.bind(options, thread);
                    $cfasl_output_compression_code_isg$.bind(integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                    $cfasl_output_compression_table$.bind(with_cfasl_compression_cfasl_output_compression_table(StreamsLow.$null_output$.getDynamicValue(thread)), thread);
                    with_cfasl_compression_preamble(StreamsLow.$null_output$.getDynamicValue(thread));
                    cfasl_output(object_to_analyze, StreamsLow.$null_output$.getDynamicValue(thread));
                    table = finalize_cfasl_output_compression_table($cfasl_output_compression_table$.getDynamicValue(thread));
                    with_cfasl_compression_postamble(StreamsLow.$null_output$.getDynamicValue(thread));
                } finally {
                    $cfasl_output_compression_table$.rebind(_prev_bind_3, thread);
                    $cfasl_output_compression_code_isg$.rebind(_prev_bind_2, thread);
                    $cfasl_output_compression_options$.rebind(_prev_bind_0_$1, thread);
                }
            } finally {
                $within_cfasl_compression_analysisP$.rebind(_prev_bind_0, thread);
            }
            $cfasl_output_compression_table$.setDynamicValue(table, thread);
        }
        return cfasl_output_open_compressed_block(stream);
    }

    public static SubLObject cfasl_compression_options_property_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $cfasl_compression_options_properties$.getGlobalValue());
    }

    public static SubLObject validate_cfasl_compression_options(final SubLObject options) {
        assert NIL != list_utilities.property_list_p(options) : "list_utilities.property_list_p(options) " + "CommonSymbols.NIL != list_utilities.property_list_p(options) " + options;
        assert NIL != list_utilities.property_list_p(options) : "list_utilities.property_list_p(options) " + "CommonSymbols.NIL != list_utilities.property_list_p(options) " + options;
        SubLObject remainder;
        SubLObject property;
        SubLObject value;
        for (remainder = NIL, remainder = options; NIL != remainder; remainder = cddr(remainder)) {
            property = remainder.first();
            value = cadr(remainder);
            assert NIL != cfasl_compression_options_property_p(property) : "cfasl_compression.cfasl_compression_options_property_p(property) " + "CommonSymbols.NIL != cfasl_compression.cfasl_compression_options_property_p(property) " + property;
        }
        return options;
    }

    public static SubLObject with_cfasl_compression_postamble(final SubLObject stream) {
        return cfasl_output_close_compressed_block(stream);
    }

    public static SubLObject without_cfasl_compression(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list37, append(body, NIL));
    }

    public static SubLObject cfasl_compress_objectP(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == $cfasl_output_compression_table$.getDynamicValue(thread)) {
            return NIL;
        }
        if (NIL != cfasl_uncompressible_object_p(v_object)) {
            return NIL;
        }
        if (NIL != getf($cfasl_output_compression_options$.getDynamicValue(thread), $ANALYZE, UNPROVIDED)) {
            return list_utilities.sublisp_boolean(dictionary.dictionary_lookup($cfasl_output_compression_table$.getDynamicValue(thread), v_object, UNPROVIDED));
        }
        if (NIL != list_utilities.member_eqP(v_object, getf($cfasl_output_compression_options$.getDynamicValue(thread), $NOT, UNPROVIDED))) {
            return NIL;
        }
        if (NIL != getf($cfasl_output_compression_options$.getDynamicValue(thread), $ALL_, UNPROVIDED)) {
            return T;
        }
        return NIL;
    }

    public static SubLObject cfasl_uncompressible_object_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean(((((NIL == v_object) || v_object.isFixnum()) || (NIL != cfasl_common_symbol_p(v_object))) || (NIL != cycl_grammar.hl_variable_p(v_object))) || (((NIL == within_cfasl_externalization_p()) && (NIL == getf($cfasl_output_compression_options$.getDynamicValue(thread), $EXTERNALIZED_, UNPROVIDED))) && (((NIL != constant_p(v_object)) || (NIL != nart_handles.nart_p(v_object))) || (NIL != assertion_handles.assertion_p(v_object)))));
    }

    public static SubLObject finalize_cfasl_output_compression_table(final SubLObject old_dict) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject new_dict = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
        SubLObject got_oneP;
        for (SubLObject doneP = NIL; NIL == doneP; doneP = makeBoolean(NIL == got_oneP)) {
            got_oneP = NIL;
            SubLObject cdolist_list_var = dictionary_utilities.dictionary_to_alist(old_dict);
            SubLObject cons = NIL;
            cons = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = cons;
                SubLObject v_object = NIL;
                SubLObject count = NIL;
                destructuring_bind_must_consp(current, datum, $list38);
                v_object = current.first();
                current = count = current.rest();
                if (ONE_INTEGER.numE(count) && v_object.isCons()) {
                    got_oneP = T;
                    dictionary.dictionary_remove(old_dict, v_object);
                    SubLObject cons_$2;
                    SubLObject element;
                    for (cons_$2 = NIL, cons_$2 = v_object; cons_$2.isCons(); cons_$2 = cons_$2.rest()) {
                        element = cons_$2.first();
                        if (NIL == cfasl_uncompressible_object_p(element)) {
                            dictionary_utilities.dictionary_increment(old_dict, element, UNPROVIDED);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                cons = cdolist_list_var.first();
            } 
        }
        if (NIL != getf($cfasl_output_compression_options$.getDynamicValue(thread), $VERBOSE_, UNPROVIDED)) {
            format(T, $str39$__CFASL_compression_dictionary___);
            format_nil.print_one_per_line(delete(ONE_INTEGER, dictionary_utilities.sort_dictionary_by_values(old_dict, symbol_function($sym40$_)), symbol_function(EQ), symbol_function(CDR), UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED);
        }
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(old_dict)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject v_object2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject count2 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (count2.numGE(TWO_INTEGER)) {
                dictionary.dictionary_enter(new_dict, v_object2, $PRECOMPUTED);
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return new_dict;
    }

    public static SubLObject cfasl_output_open_compressed_block(final SubLObject stream) {
        return cfasl_raw_write_byte($cfasl_opcode_open_compressed_block$.getGlobalValue(), stream);
    }

    public static SubLObject cfasl_output_object_compressed(final SubLObject v_object, final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $within_cfasl_compression_analysisP$.getDynamicValue(thread)) {
            return dictionary_utilities.dictionary_increment($cfasl_output_compression_table$.getDynamicValue(thread), v_object, UNPROVIDED);
        }
        SubLObject code = dictionary.dictionary_lookup($cfasl_output_compression_table$.getDynamicValue(thread), v_object, UNPROVIDED);
        if ((NIL == code) || ($PRECOMPUTED == code)) {
            code = cfasl_output_compression_pair(v_object, stream);
        }
        return cfasl_output_compressed_object(code, stream);
    }

    public static SubLObject cfasl_output_compression_pair(final SubLObject v_object, final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject code = integer_sequence_generator.integer_sequence_generator_next($cfasl_output_compression_code_isg$.getDynamicValue(thread));
        dictionary.dictionary_enter($cfasl_output_compression_table$.getDynamicValue(thread), v_object, code);
        cfasl_raw_write_byte($cfasl_opcode_compression_pair$.getGlobalValue(), stream);
        final SubLObject _prev_bind_0 = $cfasl_output_compression_table$.currentBinding(thread);
        try {
            $cfasl_output_compression_table$.bind(NIL, thread);
            cfasl_output(code, stream);
            cfasl_output(v_object, stream);
        } finally {
            $cfasl_output_compression_table$.rebind(_prev_bind_0, thread);
        }
        return code;
    }

    public static SubLObject cfasl_output_compressed_object(final SubLObject code, final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        cfasl_raw_write_byte($cfasl_opcode_compression_key$.getGlobalValue(), stream);
        final SubLObject _prev_bind_0 = $cfasl_output_compression_table$.currentBinding(thread);
        try {
            $cfasl_output_compression_table$.bind(NIL, thread);
            cfasl_output(code, stream);
        } finally {
            $cfasl_output_compression_table$.rebind(_prev_bind_0, thread);
        }
        return code;
    }

    public static SubLObject cfasl_output_close_compressed_block(final SubLObject stream) {
        return cfasl_raw_write_byte($cfasl_opcode_close_compressed_block$.getGlobalValue(), stream);
    }

    public static SubLObject declare_cfasl_compression_file() {
        declareFunction(me, "new_cfasl_decompression_table", "NEW-CFASL-DECOMPRESSION-TABLE", 0, 0, false);
        declareFunction(me, "push_new_cfasl_decompression_table", "PUSH-NEW-CFASL-DECOMPRESSION-TABLE", 1, 0, false);
        declareFunction(me, "pop_cfasl_decompression_table", "POP-CFASL-DECOMPRESSION-TABLE", 1, 0, false);
        declareFunction(me, "current_cfasl_decompression_table_for_stream", "CURRENT-CFASL-DECOMPRESSION-TABLE-FOR-STREAM", 1, 0, false);
        declareFunction(me, "enter_cfasl_decompression_pair", "ENTER-CFASL-DECOMPRESSION-PAIR", 3, 0, false);
        declareFunction(me, "decompress_cfasl_object", "DECOMPRESS-CFASL-OBJECT", 2, 0, false);
        declareFunction(me, "cfasl_input_open_compressed_block", "CFASL-INPUT-OPEN-COMPRESSED-BLOCK", 1, 0, false);
        declareFunction(me, "cfasl_input_compression_pair", "CFASL-INPUT-COMPRESSION-PAIR", 1, 0, false);
        declareFunction(me, "cfasl_input_compression_key", "CFASL-INPUT-COMPRESSION-KEY", 1, 0, false);
        declareFunction(me, "cfasl_input_close_compressed_block", "CFASL-INPUT-CLOSE-COMPRESSED-BLOCK", 1, 0, false);
        declareMacro(me, "with_cfasl_compression", "WITH-CFASL-COMPRESSION");
        declareMacro(me, "with_cfasl_2_pass_compression", "WITH-CFASL-2-PASS-COMPRESSION");
        declareFunction(me, "with_cfasl_compression_cfasl_output_compression_table", "WITH-CFASL-COMPRESSION-CFASL-OUTPUT-COMPRESSION-TABLE", 1, 0, false);
        declareFunction(me, "with_cfasl_compression_preamble", "WITH-CFASL-COMPRESSION-PREAMBLE", 1, 0, false);
        declareFunction(me, "cfasl_compression_options_property_p", "CFASL-COMPRESSION-OPTIONS-PROPERTY-P", 1, 0, false);
        declareFunction(me, "validate_cfasl_compression_options", "VALIDATE-CFASL-COMPRESSION-OPTIONS", 1, 0, false);
        declareFunction(me, "with_cfasl_compression_postamble", "WITH-CFASL-COMPRESSION-POSTAMBLE", 1, 0, false);
        declareMacro(me, "without_cfasl_compression", "WITHOUT-CFASL-COMPRESSION");
        declareFunction(me, "cfasl_compress_objectP", "CFASL-COMPRESS-OBJECT?", 1, 0, false);
        declareFunction(me, "cfasl_uncompressible_object_p", "CFASL-UNCOMPRESSIBLE-OBJECT-P", 1, 0, false);
        declareFunction(me, "finalize_cfasl_output_compression_table", "FINALIZE-CFASL-OUTPUT-COMPRESSION-TABLE", 1, 0, false);
        declareFunction(me, "cfasl_output_open_compressed_block", "CFASL-OUTPUT-OPEN-COMPRESSED-BLOCK", 1, 0, false);
        declareFunction(me, "cfasl_output_object_compressed", "CFASL-OUTPUT-OBJECT-COMPRESSED", 2, 0, false);
        declareFunction(me, "cfasl_output_compression_pair", "CFASL-OUTPUT-COMPRESSION-PAIR", 2, 0, false);
        declareFunction(me, "cfasl_output_compressed_object", "CFASL-OUTPUT-COMPRESSED-OBJECT", 2, 0, false);
        declareFunction(me, "cfasl_output_close_compressed_block", "CFASL-OUTPUT-CLOSE-COMPRESSED-BLOCK", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_cfasl_compression_file() {
        defconstant("*CFASL-OPCODE-OPEN-COMPRESSED-BLOCK*", $int$54);
        defconstant("*CFASL-OPCODE-COMPRESSION-PAIR*", $int$55);
        defconstant("*CFASL-OPCODE-COMPRESSION-KEY*", $int$56);
        defconstant("*CFASL-OPCODE-CLOSE-COMPRESSED-BLOCK*", $int$57);
        deflexical("*CFASL-DECOMPRESSION-INDEX*", SubLSystemTrampolineFile.maybeDefault($cfasl_decompression_index$, $cfasl_decompression_index$, () -> dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED)));
        deflexical("*CFASL-COMPRESSION-NOT-FOUND*", SubLSystemTrampolineFile.maybeDefault($cfasl_compression_not_found$, $cfasl_compression_not_found$, () -> make_symbol($str10$NOT_FOUND)));
        defparameter("*CFASL-OUTPUT-COMPRESSION-OPTIONS*", NIL);
        defparameter("*CFASL-OUTPUT-COMPRESSION-TABLE*", NIL);
        defparameter("*CFASL-OUTPUT-COMPRESSION-CODE-ISG*", NIL);
        defparameter("*WITHIN-CFASL-COMPRESSION-ANALYSIS?*", NIL);
        deflexical("*CFASL-COMPRESSION-OPTIONS-PROPERTIES*", $list34);
        return NIL;
    }

    public static SubLObject setup_cfasl_compression_file() {
        register_cfasl_input_function($cfasl_opcode_open_compressed_block$.getGlobalValue(), CFASL_INPUT_OPEN_COMPRESSED_BLOCK);
        register_cfasl_input_function($cfasl_opcode_compression_pair$.getGlobalValue(), CFASL_INPUT_COMPRESSION_PAIR);
        register_cfasl_input_function($cfasl_opcode_compression_key$.getGlobalValue(), CFASL_INPUT_COMPRESSION_KEY);
        register_cfasl_input_function($cfasl_opcode_close_compressed_block$.getGlobalValue(), CFASL_INPUT_CLOSE_COMPRESSED_BLOCK);
        declare_defglobal($cfasl_decompression_index$);
        declare_defglobal($cfasl_compression_not_found$);
        note_funcall_helper_function(CFASL_INPUT_OPEN_COMPRESSED_BLOCK);
        note_funcall_helper_function(CFASL_INPUT_COMPRESSION_PAIR);
        note_funcall_helper_function(CFASL_INPUT_COMPRESSION_KEY);
        note_funcall_helper_function(CFASL_INPUT_CLOSE_COMPRESSED_BLOCK);
        register_macro_helper(WITH_CFASL_COMPRESSION_CFASL_OUTPUT_COMPRESSION_TABLE, WITH_CFASL_COMPRESSION);
        register_macro_helper(WITH_CFASL_COMPRESSION_PREAMBLE, WITH_CFASL_COMPRESSION);
        register_macro_helper(WITH_CFASL_COMPRESSION_POSTAMBLE, WITH_CFASL_COMPRESSION);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_cfasl_compression_file();
    }

    @Override
    public void initializeVariables() {
        init_cfasl_compression_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_cfasl_compression_file();
    }

    
}

/**
 * Total time: 151 ms
 */
