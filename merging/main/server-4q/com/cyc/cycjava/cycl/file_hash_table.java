/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.defmacro_obsolete_warning;
import static com.cyc.cycjava.cycl.cfasl.assemble_4_fixnums_to_non_negative_integer;
import static com.cyc.cycjava.cycl.cfasl.cfasl_input;
import static com.cyc.cycjava.cycl.cfasl.cfasl_output;
import static com.cyc.cycjava.cycl.constant_handles.constant_suid;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.define_test_case_table_int;
import static com.cyc.cycjava.cycl.file_utilities.empty_file_p;
import static com.cyc.cycjava.cycl.file_utilities.make_prefixed_temp_filename;
import static com.cyc.cycjava.cycl.file_utilities.temp_directory;
import static com.cyc.cycjava.cycl.file_utilities.truncate_file;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.utilities_macros.$is_noting_progressP$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_index$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_prediction$;
import static com.cyc.cycjava.cycl.utilities_macros.$noting_progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$percent_progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_count$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_elapsed_seconds_for_notification$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_last_pacification_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_notification_count$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_pacifications_since_last_nl$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_sofar$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$silent_progressP$;
import static com.cyc.cycjava.cycl.utilities_macros.$suppress_all_progress_faster_than_seconds$;
import static com.cyc.cycjava.cycl.utilities_macros.$within_noting_percent_progress$;
import static com.cyc.cycjava.cycl.utilities_macros.note_percent_progress;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_preamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_progress_preamble;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_G;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_I;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_S;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.make_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.rplaca;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.set_nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equalp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryKey;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryValue;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.hash_table_count;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorHasNext;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorNextEntry;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.releaseEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.make_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.release_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.seize_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.$most_negative_fixnum$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.$most_positive_fixnum$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.abs;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.assemble_fixnums_to_integer;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.ceiling;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.expt;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.integerDivide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.log;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.logand;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.max;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.mod;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numG;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numNE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.round;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.reverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.make_symbol;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.fixnump;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.hash_table_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.listp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.sublisp_null;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.make_vector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.set_aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_listp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.acons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.putf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.file_length;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.file_position;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.force_output;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.open_stream_p;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.output_stream_p;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.read_byte;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.read_byte_sequence_to_positive_integer;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.terpri;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_byte;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_positive_integer_as_byte_sequence;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_string;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import java.util.Iterator;
import java.util.Map;

import org.armedbear.lisp.Lisp;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
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
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.bytes;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      FILE-HASH-TABLE
 * source file: /cyc/top/cycl/file-hash-table.lisp
 * created:     2019/07/03 17:37:16
 */
public final class file_hash_table extends SubLTranslatedFile implements V12 {
    static private final SubLString $str_alt270$ = makeString("");

    public static final class $htfile_key_entry_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        public SubLObject getField2() {
            return com.cyc.cycjava.cycl.file_hash_table.$htfile_key_entry_native.this.$key_offset;
        }

        public SubLObject getField3() {
            return com.cyc.cycjava.cycl.file_hash_table.$htfile_key_entry_native.this.$hash_code;
        }

        public SubLObject setField2(SubLObject value) {
            return com.cyc.cycjava.cycl.file_hash_table.$htfile_key_entry_native.this.$key_offset = value;
        }

        public SubLObject setField3(SubLObject value) {
            return com.cyc.cycjava.cycl.file_hash_table.$htfile_key_entry_native.this.$hash_code = value;
        }

        public SubLObject $key_offset = Lisp.NIL;

        public SubLObject $hash_code = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.file_hash_table.$htfile_key_entry_native.class, HTFILE_KEY_ENTRY, HTFILE_KEY_ENTRY_P, $list_alt138, $list_alt139, new String[]{ "$key_offset", "$hash_code" }, $list_alt140, $list_alt141, DEFAULT_STRUCT_PRINT_FUNCTION);
    }

    public static final class $htfile_header_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        public SubLObject getField2() {
            return com.cyc.cycjava.cycl.file_hash_table.$htfile_header_native.this.$size;
        }

        public SubLObject getField3() {
            return com.cyc.cycjava.cycl.file_hash_table.$htfile_header_native.this.$version_major;
        }

        public SubLObject getField4() {
            return com.cyc.cycjava.cycl.file_hash_table.$htfile_header_native.this.$version_minor;
        }

        public SubLObject getField5() {
            return com.cyc.cycjava.cycl.file_hash_table.$htfile_header_native.this.$object_space_offset;
        }

        public SubLObject getField6() {
            return com.cyc.cycjava.cycl.file_hash_table.$htfile_header_native.this.$key_space_offset;
        }

        public SubLObject getField7() {
            return com.cyc.cycjava.cycl.file_hash_table.$htfile_header_native.this.$current_heap_top;
        }

        public SubLObject getField8() {
            return com.cyc.cycjava.cycl.file_hash_table.$htfile_header_native.this.$item_count;
        }

        public SubLObject getField9() {
            return com.cyc.cycjava.cycl.file_hash_table.$htfile_header_native.this.$capacity;
        }

        public SubLObject getField10() {
            return com.cyc.cycjava.cycl.file_hash_table.$htfile_header_native.this.$free_list_head;
        }

        public SubLObject getField11() {
            return com.cyc.cycjava.cycl.file_hash_table.$htfile_header_native.this.$deletion_count;
        }

        public SubLObject getField12() {
            return com.cyc.cycjava.cycl.file_hash_table.$htfile_header_native.this.$header_crc;
        }

        public SubLObject getField13() {
            return com.cyc.cycjava.cycl.file_hash_table.$htfile_header_native.this.$extension_space_size;
        }

        public SubLObject getField14() {
            return com.cyc.cycjava.cycl.file_hash_table.$htfile_header_native.this.$extension_space;
        }

        public SubLObject setField2(SubLObject value) {
            return com.cyc.cycjava.cycl.file_hash_table.$htfile_header_native.this.$size = value;
        }

        public SubLObject setField3(SubLObject value) {
            return com.cyc.cycjava.cycl.file_hash_table.$htfile_header_native.this.$version_major = value;
        }

        public SubLObject setField4(SubLObject value) {
            return com.cyc.cycjava.cycl.file_hash_table.$htfile_header_native.this.$version_minor = value;
        }

        public SubLObject setField5(SubLObject value) {
            return com.cyc.cycjava.cycl.file_hash_table.$htfile_header_native.this.$object_space_offset = value;
        }

        public SubLObject setField6(SubLObject value) {
            return com.cyc.cycjava.cycl.file_hash_table.$htfile_header_native.this.$key_space_offset = value;
        }

        public SubLObject setField7(SubLObject value) {
            return com.cyc.cycjava.cycl.file_hash_table.$htfile_header_native.this.$current_heap_top = value;
        }

        public SubLObject setField8(SubLObject value) {
            return com.cyc.cycjava.cycl.file_hash_table.$htfile_header_native.this.$item_count = value;
        }

        public SubLObject setField9(SubLObject value) {
            return com.cyc.cycjava.cycl.file_hash_table.$htfile_header_native.this.$capacity = value;
        }

        public SubLObject setField10(SubLObject value) {
            return com.cyc.cycjava.cycl.file_hash_table.$htfile_header_native.this.$free_list_head = value;
        }

        public SubLObject setField11(SubLObject value) {
            return com.cyc.cycjava.cycl.file_hash_table.$htfile_header_native.this.$deletion_count = value;
        }

        public SubLObject setField12(SubLObject value) {
            return com.cyc.cycjava.cycl.file_hash_table.$htfile_header_native.this.$header_crc = value;
        }

        public SubLObject setField13(SubLObject value) {
            return com.cyc.cycjava.cycl.file_hash_table.$htfile_header_native.this.$extension_space_size = value;
        }

        public SubLObject setField14(SubLObject value) {
            return com.cyc.cycjava.cycl.file_hash_table.$htfile_header_native.this.$extension_space = value;
        }

        public SubLObject $size = Lisp.NIL;

        public SubLObject $version_major = Lisp.NIL;

        public SubLObject $version_minor = Lisp.NIL;

        public SubLObject $object_space_offset = Lisp.NIL;

        public SubLObject $key_space_offset = Lisp.NIL;

        public SubLObject $current_heap_top = Lisp.NIL;

        public SubLObject $item_count = Lisp.NIL;

        public SubLObject $capacity = Lisp.NIL;

        public SubLObject $free_list_head = Lisp.NIL;

        public SubLObject $deletion_count = Lisp.NIL;

        public SubLObject $header_crc = Lisp.NIL;

        public SubLObject $extension_space_size = Lisp.NIL;

        public SubLObject $extension_space = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.file_hash_table.$htfile_header_native.class, HTFILE_HEADER, HTFILE_HEADER_P, $list_alt57, $list_alt58, new String[]{ "$size", "$version_major", "$version_minor", "$object_space_offset", "$key_space_offset", "$current_heap_top", "$item_count", "$capacity", "$free_list_head", "$deletion_count", "$header_crc", "$extension_space_size", "$extension_space" }, $list_alt59, $list_alt60, DEFAULT_STRUCT_PRINT_FUNCTION);
    }

    public static final class $fast_create_fht_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        public SubLObject getField2() {
            return com.cyc.cycjava.cycl.file_hash_table.$fast_create_fht_native.this.$fht;
        }

        public SubLObject getField3() {
            return com.cyc.cycjava.cycl.file_hash_table.$fast_create_fht_native.this.$tempstem;
        }

        public SubLObject getField4() {
            return com.cyc.cycjava.cycl.file_hash_table.$fast_create_fht_native.this.$tempfile;
        }

        public SubLObject getField5() {
            return com.cyc.cycjava.cycl.file_hash_table.$fast_create_fht_native.this.$keystream;
        }

        public SubLObject setField2(SubLObject value) {
            return com.cyc.cycjava.cycl.file_hash_table.$fast_create_fht_native.this.$fht = value;
        }

        public SubLObject setField3(SubLObject value) {
            return com.cyc.cycjava.cycl.file_hash_table.$fast_create_fht_native.this.$tempstem = value;
        }

        public SubLObject setField4(SubLObject value) {
            return com.cyc.cycjava.cycl.file_hash_table.$fast_create_fht_native.this.$tempfile = value;
        }

        public SubLObject setField5(SubLObject value) {
            return com.cyc.cycjava.cycl.file_hash_table.$fast_create_fht_native.this.$keystream = value;
        }

        public SubLObject $fht = Lisp.NIL;

        public SubLObject $tempstem = Lisp.NIL;

        public SubLObject $tempfile = Lisp.NIL;

        public SubLObject $keystream = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.file_hash_table.$fast_create_fht_native.class, FAST_CREATE_FHT, FAST_CREATE_FHT_P, $list_alt337, $list_alt338, new String[]{ "$fht", "$tempstem", "$tempfile", "$keystream" }, $list_alt339, $list_alt340, DEFAULT_STRUCT_PRINT_FUNCTION);
    }

    public static final SubLFile me = new file_hash_table();

 public static final String myName = "com.cyc.cycjava.cycl.file_hash_table";


    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_file_hash_table$ = makeSymbol("*DTP-FILE-HASH-TABLE*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_htfile_header$ = makeSymbol("*DTP-HTFILE-HEADER*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_htfile_object_entry$ = makeSymbol("*DTP-HTFILE-OBJECT-ENTRY*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_htfile_key_entry$ = makeSymbol("*DTP-HTFILE-KEY-ENTRY*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $default_fht_serialization_protocol$ = makeSymbol("*DEFAULT-FHT-SERIALIZATION-PROTOCOL*");

    // defparameter
    // The minimum cache size of a file hashtable
    /**
     * The minimum cache size of a file hashtable
     */
    @LispMethod(comment = "The minimum cache size of a file hashtable\ndefparameter")
    public static final SubLSymbol $fht_min_cache_capacity$ = makeSymbol("*FHT-MIN-CACHE-CAPACITY*");

    // defparameter
    // The percentage of file hashtable entries to be cached
    /**
     * The percentage of file hashtable entries to be cached
     */
    @LispMethod(comment = "The percentage of file hashtable entries to be cached\ndefparameter")
    public static final SubLSymbol $fht_cache_percentage$ = makeSymbol("*FHT-CACHE-PERCENTAGE*");

    // defconstant
    @LispMethod(comment = "defconstant")
    private static final SubLSymbol $htfile_header_current_vmajor$ = makeSymbol("*HTFILE-HEADER-CURRENT-VMAJOR*");

    // defconstant
    @LispMethod(comment = "defconstant")
    private static final SubLSymbol $htfile_header_current_vminor$ = makeSymbol("*HTFILE-HEADER-CURRENT-VMINOR*");

    // defconstant
    @LispMethod(comment = "defconstant")
    private static final SubLSymbol $htfile_header_current_size$ = makeSymbol("*HTFILE-HEADER-CURRENT-SIZE*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $htfile_default_expected_items$ = makeSymbol("*HTFILE-DEFAULT-EXPECTED-ITEMS*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $htfile_default_average_size$ = makeSymbol("*HTFILE-DEFAULT-AVERAGE-SIZE*");

    // defconstant
    @LispMethod(comment = "defconstant")
    private static final SubLSymbol $fht_empty_offset_marker$ = makeSymbol("*FHT-EMPTY-OFFSET-MARKER*");

    // defconstant
    @LispMethod(comment = "defconstant")
    private static final SubLSymbol $fht_tombstone_offset_marker$ = makeSymbol("*FHT-TOMBSTONE-OFFSET-MARKER*");

    // defconstant
    @LispMethod(comment = "defconstant")
    private static final SubLSymbol $fht_invalid_hash_code$ = makeSymbol("*FHT-INVALID-HASH-CODE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $fht_tombstone_key_entry$ = makeSymbol("*FHT-TOMBSTONE-KEY-ENTRY*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $fht_empty_key_entry$ = makeSymbol("*FHT-EMPTY-KEY-ENTRY*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $max_fht_hash_code_value$ = makeSymbol("*MAX-FHT-HASH-CODE-VALUE*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_fht_serialization_entry$ = makeSymbol("*DTP-FHT-SERIALIZATION-ENTRY*");

    // defparameter
    /**
     * When set to T, we are in fast put mode, i.e. doing serial insertion, and
     * constantly flushing the buffers is seriously slowing us down.
     */
    @LispMethod(comment = "When set to T, we are in fast put mode, i.e. doing serial insertion, and\r\nconstantly flushing the buffers is seriously slowing us down.\ndefparameter\nWhen set to T, we are in fast put mode, i.e. doing serial insertion, and\nconstantly flushing the buffers is seriously slowing us down.")
    private static final SubLSymbol $fast_put_skip_output_forcing$ = makeSymbol("*FAST-PUT-SKIP-OUTPUT-FORCING*");

    // defconstant
    @LispMethod(comment = "defconstant")
    private static final SubLSymbol $htfile_minimal_file_block_size$ = makeSymbol("*HTFILE-MINIMAL-FILE-BLOCK-SIZE*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_htfile_file_block_entry$ = makeSymbol("*DTP-HTFILE-FILE-BLOCK-ENTRY*");

    // defconstant
    @LispMethod(comment = "defconstant")
    private static final SubLSymbol $htfile_key_entry_size$ = makeSymbol("*HTFILE-KEY-ENTRY-SIZE*");

    // defconstant
    @LispMethod(comment = "defconstant")
    private static final SubLSymbol $fht_hash_constant_a$ = makeSymbol("*FHT-HASH-CONSTANT-A*");

    // defconstant
    @LispMethod(comment = "defconstant")
    private static final SubLSymbol $fht_hash_step_size$ = makeSymbol("*FHT-HASH-STEP-SIZE*");

    // defconstant
    @LispMethod(comment = "defconstant")
    private static final SubLSymbol $fht_hash_next_step_pow2$ = makeSymbol("*FHT-HASH-NEXT-STEP-POW2*");

    // defconstant
    @LispMethod(comment = "defconstant")
    private static final SubLSymbol $fht_dknuths_magic_cutoff$ = makeSymbol("*FHT-DKNUTHS-MAGIC-CUTOFF*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $keyspace_move_size$ = makeSymbol("*KEYSPACE-MOVE-SIZE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $keyspace_rehash_cache_size$ = makeSymbol("*KEYSPACE-REHASH-CACHE-SIZE*");

    // defconstant
    @LispMethod(comment = "defconstant")
    private static final SubLSymbol $htfile_object_entry_size$ = makeSymbol("*HTFILE-OBJECT-ENTRY-SIZE*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $file_hash_table_header_position$ = makeSymbol("*FILE-HASH-TABLE-HEADER-POSITION*");

    // defparameter
    /**
     * Which optimization mode we want to employ. There is :conservative, :moderate
     * and :aggressive
     */
    @LispMethod(comment = "Which optimization mode we want to employ. There is :conservative, :moderate\r\nand :aggressive\ndefparameter\nWhich optimization mode we want to employ. There is :conservative, :moderate\nand :aggressive")
    public static final SubLSymbol $fast_file_hash_table_optimization_mode$ = makeSymbol("*FAST-FILE-HASH-TABLE-OPTIMIZATION-MODE*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_fast_create_fht$ = makeSymbol("*DTP-FAST-CREATE-FHT*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $fast_fht_large_buffer_size$ = makeSymbol("*FAST-FHT-LARGE-BUFFER-SIZE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $fast_fht_small_buffer_size$ = makeSymbol("*FAST-FHT-SMALL-BUFFER-SIZE*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $fast_fht_keyspace_alignment$ = makeSymbol("*FAST-FHT-KEYSPACE-ALIGNMENT*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_fast_fht_keystream_sorter$ = makeSymbol("*DTP-FAST-FHT-KEYSTREAM-SORTER*");

    // defconstant
    // The value written out as a hashcode for the chunk sentinel.
    /**
     * The value written out as a hashcode for the chunk sentinel.
     */
    @LispMethod(comment = "The value written out as a hashcode for the chunk sentinel.\ndefconstant")
    private static final SubLSymbol $fast_fht_sentinel_hashcode_value$ = makeSymbol("*FAST-FHT-SENTINEL-HASHCODE-VALUE*");

    // defconstant
    /**
     * The value returned for a sentinel hashcode; it is larger than any other value
     * should be.
     */
    @LispMethod(comment = "The value returned for a sentinel hashcode; it is larger than any other value\r\nshould be.\ndefconstant\nThe value returned for a sentinel hashcode; it is larger than any other value\nshould be.")
    private static final SubLSymbol $fast_fht_sentinel_index_value$ = makeSymbol("*FAST-FHT-SENTINEL-INDEX-VALUE*");

    // defparameter
    // Assume 64K of entries.
    /**
     * Assume 64K of entries.
     */
    @LispMethod(comment = "Assume 64K of entries.\ndefparameter")
    public static final SubLSymbol $fast_fht_keystream_tile_size_pow2$ = makeSymbol("*FAST-FHT-KEYSTREAM-TILE-SIZE-POW2*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $test_fast_fht_generator_state$ = makeSymbol("*TEST-FAST-FHT-GENERATOR-STATE*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol FILE_HASH_TABLE = makeSymbol("FILE-HASH-TABLE");

    private static final SubLSymbol FILE_HASH_TABLE_P = makeSymbol("FILE-HASH-TABLE-P");

    static private final SubLList $list2 = list(new SubLObject[]{ makeSymbol("STREAM"), makeSymbol("HEADER"), makeSymbol("LOCK"), makeSymbol("ENCODING-INPUT-FN"), makeSymbol("ENCODING-OUTPUT-FN"), makeSymbol("ENCODING-SIZE-FN"), makeSymbol("ENCODING-KEY-INPUT-FN"), makeSymbol("ENCODING-KEY-OUTPUT-FN"), makeSymbol("TESTFN"), makeSymbol("HASH-FN"), makeSymbol("INPUT-CACHE"), makeSymbol("OUTPUT-CACHE"), makeSymbol("PROPERTY-LIST") });

    static private final SubLList $list3 = list(new SubLObject[]{ makeKeyword("STREAM"), makeKeyword("HEADER"), $LOCK, makeKeyword("ENCODING-INPUT-FN"), makeKeyword("ENCODING-OUTPUT-FN"), makeKeyword("ENCODING-SIZE-FN"), makeKeyword("ENCODING-KEY-INPUT-FN"), makeKeyword("ENCODING-KEY-OUTPUT-FN"), makeKeyword("TESTFN"), makeKeyword("HASH-FN"), makeKeyword("INPUT-CACHE"), makeKeyword("OUTPUT-CACHE"), makeKeyword("PROPERTY-LIST") });

    static private final SubLList $list4 = list(new SubLObject[]{ makeSymbol("FILE-HASH-TABLE-STREAM"), makeSymbol("FILE-HASH-TABLE-HEADER"), makeSymbol("FILE-HASH-TABLE-LOCK"), makeSymbol("FILE-HASH-TABLE-ENCODING-INPUT-FN"), makeSymbol("FILE-HASH-TABLE-ENCODING-OUTPUT-FN"), makeSymbol("FILE-HASH-TABLE-ENCODING-SIZE-FN"), makeSymbol("FILE-HASH-TABLE-ENCODING-KEY-INPUT-FN"), makeSymbol("FILE-HASH-TABLE-ENCODING-KEY-OUTPUT-FN"), makeSymbol("FILE-HASH-TABLE-TESTFN"), makeSymbol("FILE-HASH-TABLE-HASH-FN"), makeSymbol("FILE-HASH-TABLE-INPUT-CACHE"), makeSymbol("FILE-HASH-TABLE-OUTPUT-CACHE"), makeSymbol("FILE-HASH-TABLE-PROPERTY-LIST") });

    static private final SubLList $list5 = list(new SubLObject[]{ makeSymbol("_CSETF-FILE-HASH-TABLE-STREAM"), makeSymbol("_CSETF-FILE-HASH-TABLE-HEADER"), makeSymbol("_CSETF-FILE-HASH-TABLE-LOCK"), makeSymbol("_CSETF-FILE-HASH-TABLE-ENCODING-INPUT-FN"), makeSymbol("_CSETF-FILE-HASH-TABLE-ENCODING-OUTPUT-FN"), makeSymbol("_CSETF-FILE-HASH-TABLE-ENCODING-SIZE-FN"), makeSymbol("_CSETF-FILE-HASH-TABLE-ENCODING-KEY-INPUT-FN"), makeSymbol("_CSETF-FILE-HASH-TABLE-ENCODING-KEY-OUTPUT-FN"), makeSymbol("_CSETF-FILE-HASH-TABLE-TESTFN"), makeSymbol("_CSETF-FILE-HASH-TABLE-HASH-FN"), makeSymbol("_CSETF-FILE-HASH-TABLE-INPUT-CACHE"), makeSymbol("_CSETF-FILE-HASH-TABLE-OUTPUT-CACHE"), makeSymbol("_CSETF-FILE-HASH-TABLE-PROPERTY-LIST") });

    private static final SubLSymbol FILE_HASH_TABLE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("FILE-HASH-TABLE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list8 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("FILE-HASH-TABLE-P"));

    private static final SubLSymbol FILE_HASH_TABLE_STREAM = makeSymbol("FILE-HASH-TABLE-STREAM");

    private static final SubLSymbol _CSETF_FILE_HASH_TABLE_STREAM = makeSymbol("_CSETF-FILE-HASH-TABLE-STREAM");

    private static final SubLSymbol FILE_HASH_TABLE_HEADER = makeSymbol("FILE-HASH-TABLE-HEADER");

    private static final SubLSymbol _CSETF_FILE_HASH_TABLE_HEADER = makeSymbol("_CSETF-FILE-HASH-TABLE-HEADER");

    private static final SubLSymbol FILE_HASH_TABLE_LOCK = makeSymbol("FILE-HASH-TABLE-LOCK");

    private static final SubLSymbol _CSETF_FILE_HASH_TABLE_LOCK = makeSymbol("_CSETF-FILE-HASH-TABLE-LOCK");

    private static final SubLSymbol FILE_HASH_TABLE_ENCODING_INPUT_FN = makeSymbol("FILE-HASH-TABLE-ENCODING-INPUT-FN");

    private static final SubLSymbol _CSETF_FILE_HASH_TABLE_ENCODING_INPUT_FN = makeSymbol("_CSETF-FILE-HASH-TABLE-ENCODING-INPUT-FN");

    private static final SubLSymbol FILE_HASH_TABLE_ENCODING_OUTPUT_FN = makeSymbol("FILE-HASH-TABLE-ENCODING-OUTPUT-FN");

    private static final SubLSymbol _CSETF_FILE_HASH_TABLE_ENCODING_OUTPUT_FN = makeSymbol("_CSETF-FILE-HASH-TABLE-ENCODING-OUTPUT-FN");

    private static final SubLSymbol FILE_HASH_TABLE_ENCODING_SIZE_FN = makeSymbol("FILE-HASH-TABLE-ENCODING-SIZE-FN");

    private static final SubLSymbol _CSETF_FILE_HASH_TABLE_ENCODING_SIZE_FN = makeSymbol("_CSETF-FILE-HASH-TABLE-ENCODING-SIZE-FN");

    private static final SubLSymbol FILE_HASH_TABLE_ENCODING_KEY_INPUT_FN = makeSymbol("FILE-HASH-TABLE-ENCODING-KEY-INPUT-FN");

    private static final SubLSymbol _CSETF_FILE_HASH_TABLE_ENCODING_KEY_INPUT_FN = makeSymbol("_CSETF-FILE-HASH-TABLE-ENCODING-KEY-INPUT-FN");

    private static final SubLSymbol FILE_HASH_TABLE_ENCODING_KEY_OUTPUT_FN = makeSymbol("FILE-HASH-TABLE-ENCODING-KEY-OUTPUT-FN");

    private static final SubLSymbol _CSETF_FILE_HASH_TABLE_ENCODING_KEY_OUTPUT_FN = makeSymbol("_CSETF-FILE-HASH-TABLE-ENCODING-KEY-OUTPUT-FN");

    private static final SubLSymbol FILE_HASH_TABLE_TESTFN = makeSymbol("FILE-HASH-TABLE-TESTFN");

    private static final SubLSymbol _CSETF_FILE_HASH_TABLE_TESTFN = makeSymbol("_CSETF-FILE-HASH-TABLE-TESTFN");

    private static final SubLSymbol FILE_HASH_TABLE_HASH_FN = makeSymbol("FILE-HASH-TABLE-HASH-FN");

    private static final SubLSymbol _CSETF_FILE_HASH_TABLE_HASH_FN = makeSymbol("_CSETF-FILE-HASH-TABLE-HASH-FN");

    private static final SubLSymbol FILE_HASH_TABLE_INPUT_CACHE = makeSymbol("FILE-HASH-TABLE-INPUT-CACHE");

    private static final SubLSymbol _CSETF_FILE_HASH_TABLE_INPUT_CACHE = makeSymbol("_CSETF-FILE-HASH-TABLE-INPUT-CACHE");

    private static final SubLSymbol FILE_HASH_TABLE_OUTPUT_CACHE = makeSymbol("FILE-HASH-TABLE-OUTPUT-CACHE");

    private static final SubLSymbol _CSETF_FILE_HASH_TABLE_OUTPUT_CACHE = makeSymbol("_CSETF-FILE-HASH-TABLE-OUTPUT-CACHE");

    private static final SubLSymbol FILE_HASH_TABLE_PROPERTY_LIST = makeSymbol("FILE-HASH-TABLE-PROPERTY-LIST");

    private static final SubLSymbol _CSETF_FILE_HASH_TABLE_PROPERTY_LIST = makeSymbol("_CSETF-FILE-HASH-TABLE-PROPERTY-LIST");

    private static final SubLSymbol $ENCODING_INPUT_FN = makeKeyword("ENCODING-INPUT-FN");

    private static final SubLSymbol $ENCODING_OUTPUT_FN = makeKeyword("ENCODING-OUTPUT-FN");

    private static final SubLSymbol $ENCODING_SIZE_FN = makeKeyword("ENCODING-SIZE-FN");

    private static final SubLSymbol $ENCODING_KEY_INPUT_FN = makeKeyword("ENCODING-KEY-INPUT-FN");

    private static final SubLSymbol $ENCODING_KEY_OUTPUT_FN = makeKeyword("ENCODING-KEY-OUTPUT-FN");

    private static final SubLString $str48$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_FILE_HASH_TABLE = makeSymbol("MAKE-FILE-HASH-TABLE");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_FILE_HASH_TABLE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-FILE-HASH-TABLE-METHOD");

    private static final SubLString $str54$__FHT__Stream___A_Lock___A___ = makeString("#<FHT: Stream: ~A Lock: ~A ~%");

    private static final SubLString $str55$_Test___A__ = makeString(" Test: ~A~%");

    private static final SubLString $str56$_Encoding__Input__A_Output__A_Siz = makeString(" Encoding: Input ~A Output ~A Sizing ~A~%");

    private static final SubLString $str57$_Key_Encoding__Input__A_Output__A = makeString(" Key Encoding: Input ~A Output ~A~%");

    private static final SubLString $str58$_Hashing___A__ = makeString(" Hashing: ~A~%");

    private static final SubLString $str59$_Caches__Input__A_Output__A____ = makeString(" Caches: Input ~A Output ~A >~%");

    private static final SubLString $str60$_Properties___A__ = makeString(" Properties: ~A~%");

    private static final SubLSymbol HTFILE_HEADER = makeSymbol("HTFILE-HEADER");

    private static final SubLSymbol HTFILE_HEADER_P = makeSymbol("HTFILE-HEADER-P");

    private static final SubLList $list63 = list(new SubLObject[]{ makeSymbol("SIZE"), makeSymbol("VERSION-MAJOR"), makeSymbol("VERSION-MINOR"), makeSymbol("OBJECT-SPACE-OFFSET"), makeSymbol("KEY-SPACE-OFFSET"), makeSymbol("CURRENT-HEAP-TOP"), makeSymbol("ITEM-COUNT"), makeSymbol("CAPACITY"), makeSymbol("FREE-LIST-HEAD"), makeSymbol("DELETION-COUNT"), makeSymbol("HEADER-CRC"), makeSymbol("EXTENSION-SPACE-SIZE"), makeSymbol("EXTENSION-SPACE") });

    private static final SubLList $list64 = list(new SubLObject[]{ $SIZE, makeKeyword("VERSION-MAJOR"), makeKeyword("VERSION-MINOR"), makeKeyword("OBJECT-SPACE-OFFSET"), makeKeyword("KEY-SPACE-OFFSET"), makeKeyword("CURRENT-HEAP-TOP"), makeKeyword("ITEM-COUNT"), makeKeyword("CAPACITY"), makeKeyword("FREE-LIST-HEAD"), makeKeyword("DELETION-COUNT"), makeKeyword("HEADER-CRC"), makeKeyword("EXTENSION-SPACE-SIZE"), makeKeyword("EXTENSION-SPACE") });

    private static final SubLList $list65 = list(new SubLObject[]{ makeSymbol("HTFILE-HEADER-SIZE"), makeSymbol("HTFILE-HEADER-VERSION-MAJOR"), makeSymbol("HTFILE-HEADER-VERSION-MINOR"), makeSymbol("HTFILE-HEADER-OBJECT-SPACE-OFFSET"), makeSymbol("HTFILE-HEADER-KEY-SPACE-OFFSET"), makeSymbol("HTFILE-HEADER-CURRENT-HEAP-TOP"), makeSymbol("HTFILE-HEADER-ITEM-COUNT"), makeSymbol("HTFILE-HEADER-CAPACITY"), makeSymbol("HTFILE-HEADER-FREE-LIST-HEAD"), makeSymbol("HTFILE-HEADER-DELETION-COUNT"), makeSymbol("HTFILE-HEADER-HEADER-CRC"), makeSymbol("HTFILE-HEADER-EXTENSION-SPACE-SIZE"), makeSymbol("HTFILE-HEADER-EXTENSION-SPACE") });

    private static final SubLList $list66 = list(new SubLObject[]{ makeSymbol("_CSETF-HTFILE-HEADER-SIZE"), makeSymbol("_CSETF-HTFILE-HEADER-VERSION-MAJOR"), makeSymbol("_CSETF-HTFILE-HEADER-VERSION-MINOR"), makeSymbol("_CSETF-HTFILE-HEADER-OBJECT-SPACE-OFFSET"), makeSymbol("_CSETF-HTFILE-HEADER-KEY-SPACE-OFFSET"), makeSymbol("_CSETF-HTFILE-HEADER-CURRENT-HEAP-TOP"), makeSymbol("_CSETF-HTFILE-HEADER-ITEM-COUNT"), makeSymbol("_CSETF-HTFILE-HEADER-CAPACITY"), makeSymbol("_CSETF-HTFILE-HEADER-FREE-LIST-HEAD"), makeSymbol("_CSETF-HTFILE-HEADER-DELETION-COUNT"), makeSymbol("_CSETF-HTFILE-HEADER-HEADER-CRC"), makeSymbol("_CSETF-HTFILE-HEADER-EXTENSION-SPACE-SIZE"), makeSymbol("_CSETF-HTFILE-HEADER-EXTENSION-SPACE") });

    private static final SubLSymbol HTFILE_HEADER_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("HTFILE-HEADER-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list68 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("HTFILE-HEADER-P"));

    private static final SubLSymbol HTFILE_HEADER_SIZE = makeSymbol("HTFILE-HEADER-SIZE");

    private static final SubLSymbol _CSETF_HTFILE_HEADER_SIZE = makeSymbol("_CSETF-HTFILE-HEADER-SIZE");

    private static final SubLSymbol HTFILE_HEADER_VERSION_MAJOR = makeSymbol("HTFILE-HEADER-VERSION-MAJOR");

    private static final SubLSymbol _CSETF_HTFILE_HEADER_VERSION_MAJOR = makeSymbol("_CSETF-HTFILE-HEADER-VERSION-MAJOR");

    private static final SubLSymbol HTFILE_HEADER_VERSION_MINOR = makeSymbol("HTFILE-HEADER-VERSION-MINOR");

    private static final SubLSymbol _CSETF_HTFILE_HEADER_VERSION_MINOR = makeSymbol("_CSETF-HTFILE-HEADER-VERSION-MINOR");

    private static final SubLSymbol HTFILE_HEADER_OBJECT_SPACE_OFFSET = makeSymbol("HTFILE-HEADER-OBJECT-SPACE-OFFSET");

    private static final SubLSymbol _CSETF_HTFILE_HEADER_OBJECT_SPACE_OFFSET = makeSymbol("_CSETF-HTFILE-HEADER-OBJECT-SPACE-OFFSET");

    private static final SubLSymbol HTFILE_HEADER_KEY_SPACE_OFFSET = makeSymbol("HTFILE-HEADER-KEY-SPACE-OFFSET");

    private static final SubLSymbol _CSETF_HTFILE_HEADER_KEY_SPACE_OFFSET = makeSymbol("_CSETF-HTFILE-HEADER-KEY-SPACE-OFFSET");

    private static final SubLSymbol HTFILE_HEADER_CURRENT_HEAP_TOP = makeSymbol("HTFILE-HEADER-CURRENT-HEAP-TOP");

    private static final SubLSymbol _CSETF_HTFILE_HEADER_CURRENT_HEAP_TOP = makeSymbol("_CSETF-HTFILE-HEADER-CURRENT-HEAP-TOP");

    private static final SubLSymbol HTFILE_HEADER_ITEM_COUNT = makeSymbol("HTFILE-HEADER-ITEM-COUNT");

    private static final SubLSymbol _CSETF_HTFILE_HEADER_ITEM_COUNT = makeSymbol("_CSETF-HTFILE-HEADER-ITEM-COUNT");

    private static final SubLSymbol HTFILE_HEADER_CAPACITY = makeSymbol("HTFILE-HEADER-CAPACITY");

    private static final SubLSymbol _CSETF_HTFILE_HEADER_CAPACITY = makeSymbol("_CSETF-HTFILE-HEADER-CAPACITY");

    private static final SubLSymbol HTFILE_HEADER_FREE_LIST_HEAD = makeSymbol("HTFILE-HEADER-FREE-LIST-HEAD");

    private static final SubLSymbol _CSETF_HTFILE_HEADER_FREE_LIST_HEAD = makeSymbol("_CSETF-HTFILE-HEADER-FREE-LIST-HEAD");

    private static final SubLSymbol HTFILE_HEADER_DELETION_COUNT = makeSymbol("HTFILE-HEADER-DELETION-COUNT");

    private static final SubLSymbol _CSETF_HTFILE_HEADER_DELETION_COUNT = makeSymbol("_CSETF-HTFILE-HEADER-DELETION-COUNT");

    private static final SubLSymbol HTFILE_HEADER_HEADER_CRC = makeSymbol("HTFILE-HEADER-HEADER-CRC");

    private static final SubLSymbol _CSETF_HTFILE_HEADER_HEADER_CRC = makeSymbol("_CSETF-HTFILE-HEADER-HEADER-CRC");

    private static final SubLSymbol HTFILE_HEADER_EXTENSION_SPACE_SIZE = makeSymbol("HTFILE-HEADER-EXTENSION-SPACE-SIZE");

    private static final SubLSymbol _CSETF_HTFILE_HEADER_EXTENSION_SPACE_SIZE = makeSymbol("_CSETF-HTFILE-HEADER-EXTENSION-SPACE-SIZE");

    private static final SubLSymbol HTFILE_HEADER_EXTENSION_SPACE = makeSymbol("HTFILE-HEADER-EXTENSION-SPACE");

    private static final SubLSymbol _CSETF_HTFILE_HEADER_EXTENSION_SPACE = makeSymbol("_CSETF-HTFILE-HEADER-EXTENSION-SPACE");

    private static final SubLSymbol $OBJECT_SPACE_OFFSET = makeKeyword("OBJECT-SPACE-OFFSET");

    private static final SubLSymbol $KEY_SPACE_OFFSET = makeKeyword("KEY-SPACE-OFFSET");

    private static final SubLSymbol $CURRENT_HEAP_TOP = makeKeyword("CURRENT-HEAP-TOP");

    private static final SubLSymbol $FREE_LIST_HEAD = makeKeyword("FREE-LIST-HEAD");

    private static final SubLSymbol $EXTENSION_SPACE_SIZE = makeKeyword("EXTENSION-SPACE-SIZE");

    private static final SubLSymbol MAKE_HTFILE_HEADER = makeSymbol("MAKE-HTFILE-HEADER");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_HTFILE_HEADER_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-HTFILE-HEADER-METHOD");

    private static final SubLString $str110$__HTFile_Header__Size__A_Format_V = makeString("#<HTFile-Header: Size=~A Format-Version ~A.~A~%");

    private static final SubLString $str111$_ObjSpace_Offset__0x_X___D___KeyS = makeString(" ObjSpace Offset: 0x~X (~D)  KeySpace Offset: 0x~X (~D) HeapTop: 0x~X (~D)~%");

    private static final SubLString $str112$_Item_Count___A__Capacity___A__ = makeString(" Item Count: ~A  Capacity: ~A~%");

    private static final SubLString $str113$_FreeListHead___A_ = makeString(" FreeListHead: ~A ");

    private static final SubLString $str114$_no_free_list_ = makeString(" no free-list ");

    private static final SubLString $str115$_Deletions___A_ = makeString(" Deletions: ~A ");

    private static final SubLString $$$_no_deletions_ = makeString(" no deletions ");

    private static final SubLString $str117$_CRC___A_ = makeString(" CRC: ~A ");

    private static final SubLString $$$_no_CRC_support_ = makeString(" no CRC support ");

    private static final SubLString $str119$_Extension_Space____A____A____ = makeString(" Extension Space: (~A) |~A| ~%");

    private static final SubLString $str120$__ = makeString("> ");

    private static final SubLSymbol HTFILE_OBJECT_ENTRY = makeSymbol("HTFILE-OBJECT-ENTRY");

    private static final SubLSymbol HTFILE_OBJECT_ENTRY_P = makeSymbol("HTFILE-OBJECT-ENTRY-P");

    private static final SubLList $list123 = list(makeSymbol("SIZE"), makeSymbol("TYPE"), makeSymbol("KEY-SIZE"), makeSymbol("KEY"), makeSymbol("DATA-SIZE"), makeSymbol("DATA"));

    private static final SubLList $list124 = list($SIZE, $TYPE, makeKeyword("KEY-SIZE"), makeKeyword("KEY"), makeKeyword("DATA-SIZE"), $DATA);

    private static final SubLList $list125 = list(makeSymbol("HTFILE-OBJECT-ENTRY-SIZE"), makeSymbol("HTFILE-OBJECT-ENTRY-TYPE"), makeSymbol("HTFILE-OBJECT-ENTRY-KEY-SIZE"), makeSymbol("HTFILE-OBJECT-ENTRY-KEY"), makeSymbol("HTFILE-OBJECT-ENTRY-DATA-SIZE"), makeSymbol("HTFILE-OBJECT-ENTRY-DATA"));

    private static final SubLList $list126 = list(makeSymbol("_CSETF-HTFILE-OBJECT-ENTRY-SIZE"), makeSymbol("_CSETF-HTFILE-OBJECT-ENTRY-TYPE"), makeSymbol("_CSETF-HTFILE-OBJECT-ENTRY-KEY-SIZE"), makeSymbol("_CSETF-HTFILE-OBJECT-ENTRY-KEY"), makeSymbol("_CSETF-HTFILE-OBJECT-ENTRY-DATA-SIZE"), makeSymbol("_CSETF-HTFILE-OBJECT-ENTRY-DATA"));

    private static final SubLSymbol HTFILE_OBJECT_ENTRY_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("HTFILE-OBJECT-ENTRY-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list128 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("HTFILE-OBJECT-ENTRY-P"));

    private static final SubLSymbol HTFILE_OBJECT_ENTRY_SIZE = makeSymbol("HTFILE-OBJECT-ENTRY-SIZE");

    private static final SubLSymbol _CSETF_HTFILE_OBJECT_ENTRY_SIZE = makeSymbol("_CSETF-HTFILE-OBJECT-ENTRY-SIZE");

    private static final SubLSymbol HTFILE_OBJECT_ENTRY_TYPE = makeSymbol("HTFILE-OBJECT-ENTRY-TYPE");

    private static final SubLSymbol _CSETF_HTFILE_OBJECT_ENTRY_TYPE = makeSymbol("_CSETF-HTFILE-OBJECT-ENTRY-TYPE");

    private static final SubLSymbol HTFILE_OBJECT_ENTRY_KEY_SIZE = makeSymbol("HTFILE-OBJECT-ENTRY-KEY-SIZE");

    private static final SubLSymbol _CSETF_HTFILE_OBJECT_ENTRY_KEY_SIZE = makeSymbol("_CSETF-HTFILE-OBJECT-ENTRY-KEY-SIZE");

    private static final SubLSymbol HTFILE_OBJECT_ENTRY_KEY = makeSymbol("HTFILE-OBJECT-ENTRY-KEY");

    private static final SubLSymbol _CSETF_HTFILE_OBJECT_ENTRY_KEY = makeSymbol("_CSETF-HTFILE-OBJECT-ENTRY-KEY");

    private static final SubLSymbol HTFILE_OBJECT_ENTRY_DATA_SIZE = makeSymbol("HTFILE-OBJECT-ENTRY-DATA-SIZE");

    private static final SubLSymbol _CSETF_HTFILE_OBJECT_ENTRY_DATA_SIZE = makeSymbol("_CSETF-HTFILE-OBJECT-ENTRY-DATA-SIZE");

    private static final SubLSymbol HTFILE_OBJECT_ENTRY_DATA = makeSymbol("HTFILE-OBJECT-ENTRY-DATA");

    private static final SubLSymbol _CSETF_HTFILE_OBJECT_ENTRY_DATA = makeSymbol("_CSETF-HTFILE-OBJECT-ENTRY-DATA");

    private static final SubLSymbol MAKE_HTFILE_OBJECT_ENTRY = makeSymbol("MAKE-HTFILE-OBJECT-ENTRY");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_HTFILE_OBJECT_ENTRY_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-HTFILE-OBJECT-ENTRY-METHOD");

    private static final SubLSymbol HTFILE_KEY_ENTRY = makeSymbol("HTFILE-KEY-ENTRY");

    private static final SubLSymbol HTFILE_KEY_ENTRY_P = makeSymbol("HTFILE-KEY-ENTRY-P");

    private static final SubLList $list150 = list(makeSymbol("KEY-OFFSET"), makeSymbol("HASH-CODE"));

    private static final SubLList $list151 = list(makeKeyword("KEY-OFFSET"), makeKeyword("HASH-CODE"));

    private static final SubLList $list152 = list(makeSymbol("HTFILE-KEY-ENTRY-KEY-OFFSET"), makeSymbol("HTFILE-KEY-ENTRY-HASH-CODE"));

    private static final SubLList $list153 = list(makeSymbol("_CSETF-HTFILE-KEY-ENTRY-KEY-OFFSET"), makeSymbol("_CSETF-HTFILE-KEY-ENTRY-HASH-CODE"));

    private static final SubLSymbol HTFILE_KEY_ENTRY_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("HTFILE-KEY-ENTRY-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list155 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("HTFILE-KEY-ENTRY-P"));

    private static final SubLSymbol HTFILE_KEY_ENTRY_KEY_OFFSET = makeSymbol("HTFILE-KEY-ENTRY-KEY-OFFSET");

    private static final SubLSymbol _CSETF_HTFILE_KEY_ENTRY_KEY_OFFSET = makeSymbol("_CSETF-HTFILE-KEY-ENTRY-KEY-OFFSET");

    private static final SubLSymbol HTFILE_KEY_ENTRY_HASH_CODE = makeSymbol("HTFILE-KEY-ENTRY-HASH-CODE");

    private static final SubLSymbol _CSETF_HTFILE_KEY_ENTRY_HASH_CODE = makeSymbol("_CSETF-HTFILE-KEY-ENTRY-HASH-CODE");

    private static final SubLSymbol MAKE_HTFILE_KEY_ENTRY = makeSymbol("MAKE-HTFILE-KEY-ENTRY");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_HTFILE_KEY_ENTRY_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-HTFILE-KEY-ENTRY-METHOD");

    private static final SubLSymbol $IMAGE_DEPENDENT_CFASL = makeKeyword("IMAGE-DEPENDENT-CFASL");

    private static final SubLInteger $int$2000 = makeInteger(2000);

    private static final SubLInteger $int$84 = makeInteger(84);

    private static final SubLSymbol SXHASH = makeSymbol("SXHASH");

    private static final SubLString $$$File_Hash_Table_Lock = makeString("File Hash Table Lock");

    private static final SubLString $str170$Sorry___A_hashed_to__A__which_is_ = makeString("Sorry, ~A hashed to ~A, which is not a valid hash code.");

    private static final SubLSymbol FHT_SERIALIZATION_ENTRY = makeSymbol("FHT-SERIALIZATION-ENTRY");

    private static final SubLSymbol FHT_SERIALIZATION_ENTRY_P = makeSymbol("FHT-SERIALIZATION-ENTRY-P");

    private static final SubLList $list174 = list(makeSymbol("ENCODING-INPUT-FN"), makeSymbol("ENCODING-OUTPUT-FN"), makeSymbol("ENCODING-SIZE-FN"), makeSymbol("HASH-FN"), makeSymbol("ENCODING-KEY-INPUT-FN"), makeSymbol("ENCODING-KEY-OUTPUT-FN"));

    private static final SubLList $list175 = list(makeKeyword("ENCODING-INPUT-FN"), makeKeyword("ENCODING-OUTPUT-FN"), makeKeyword("ENCODING-SIZE-FN"), makeKeyword("HASH-FN"), makeKeyword("ENCODING-KEY-INPUT-FN"), makeKeyword("ENCODING-KEY-OUTPUT-FN"));

    private static final SubLList $list176 = list(makeSymbol("FHT-SE-ENCODING-INPUT-FN"), makeSymbol("FHT-SE-ENCODING-OUTPUT-FN"), makeSymbol("FHT-SE-ENCODING-SIZE-FN"), makeSymbol("FHT-SE-HASH-FN"), makeSymbol("FHT-SE-ENCODING-KEY-INPUT-FN"), makeSymbol("FHT-SE-ENCODING-KEY-OUTPUT-FN"));

    private static final SubLList $list177 = list(makeSymbol("_CSETF-FHT-SE-ENCODING-INPUT-FN"), makeSymbol("_CSETF-FHT-SE-ENCODING-OUTPUT-FN"), makeSymbol("_CSETF-FHT-SE-ENCODING-SIZE-FN"), makeSymbol("_CSETF-FHT-SE-HASH-FN"), makeSymbol("_CSETF-FHT-SE-ENCODING-KEY-INPUT-FN"), makeSymbol("_CSETF-FHT-SE-ENCODING-KEY-OUTPUT-FN"));

    private static final SubLSymbol PRINT_FHT_SERIALIZATION_ENTRY = makeSymbol("PRINT-FHT-SERIALIZATION-ENTRY");

    private static final SubLSymbol FHT_SERIALIZATION_ENTRY_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("FHT-SERIALIZATION-ENTRY-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list180 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("FHT-SERIALIZATION-ENTRY-P"));

    private static final SubLSymbol FHT_SE_ENCODING_INPUT_FN = makeSymbol("FHT-SE-ENCODING-INPUT-FN");

    private static final SubLSymbol _CSETF_FHT_SE_ENCODING_INPUT_FN = makeSymbol("_CSETF-FHT-SE-ENCODING-INPUT-FN");

    private static final SubLSymbol FHT_SE_ENCODING_OUTPUT_FN = makeSymbol("FHT-SE-ENCODING-OUTPUT-FN");

    private static final SubLSymbol _CSETF_FHT_SE_ENCODING_OUTPUT_FN = makeSymbol("_CSETF-FHT-SE-ENCODING-OUTPUT-FN");

    private static final SubLSymbol FHT_SE_ENCODING_SIZE_FN = makeSymbol("FHT-SE-ENCODING-SIZE-FN");

    private static final SubLSymbol _CSETF_FHT_SE_ENCODING_SIZE_FN = makeSymbol("_CSETF-FHT-SE-ENCODING-SIZE-FN");

    private static final SubLSymbol FHT_SE_HASH_FN = makeSymbol("FHT-SE-HASH-FN");

    private static final SubLSymbol _CSETF_FHT_SE_HASH_FN = makeSymbol("_CSETF-FHT-SE-HASH-FN");

    private static final SubLSymbol FHT_SE_ENCODING_KEY_INPUT_FN = makeSymbol("FHT-SE-ENCODING-KEY-INPUT-FN");

    private static final SubLSymbol _CSETF_FHT_SE_ENCODING_KEY_INPUT_FN = makeSymbol("_CSETF-FHT-SE-ENCODING-KEY-INPUT-FN");

    private static final SubLSymbol FHT_SE_ENCODING_KEY_OUTPUT_FN = makeSymbol("FHT-SE-ENCODING-KEY-OUTPUT-FN");

    private static final SubLSymbol _CSETF_FHT_SE_ENCODING_KEY_OUTPUT_FN = makeSymbol("_CSETF-FHT-SE-ENCODING-KEY-OUTPUT-FN");

    private static final SubLSymbol MAKE_FHT_SERIALIZATION_ENTRY = makeSymbol("MAKE-FHT-SERIALIZATION-ENTRY");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_FHT_SERIALIZATION_ENTRY_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-FHT-SERIALIZATION-ENTRY-METHOD");

    private static final SubLString $str195$__FHT_Serialization__Input_Fn____ = makeString("#<FHT-Serialization: Input Fn:    ~S~%");

    private static final SubLString $str196$_____________________Output_Fn___ = makeString("                     Output Fn:   ~S~%");

    private static final SubLString $str197$_____________________Size_Fn_____ = makeString("                     Size Fn:     ~S~%");

    private static final SubLString $str198$_____________________Hash_Fn_____ = makeString("                     Hash Fn:     ~S~%");

    private static final SubLString $str199$_____________________Key_Input___ = makeString("                     Key Input    ~S~%");

    private static final SubLString $str200$_____________________Key_Output__ = makeString("                     Key Output    ~S~%");

    private static final SubLString $str201$_ = makeString(">");

    private static final SubLSymbol $fht_serialization_table$ = makeSymbol("*FHT-SERIALIZATION-TABLE*");

    private static final SubLList $list203 = list(list(makeSymbol("SERIALIZATION"), makeSymbol("SERIALIZATION-ENTRY"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list204 = list($DONE);

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    static private final SubLList $list208 = list(makeKeyword("ENCODING-INPUT-FN"), makeSymbol("CFASL-INPUT"), makeKeyword("ENCODING-OUTPUT-FN"), makeSymbol("CFASL-OUTPUT"), makeKeyword("ENCODING-SIZE-FN"), makeSymbol("CFASL-OBJECT-SIZE"), makeKeyword("HASH-FN"), makeSymbol("SXHASH"));

    private static final SubLSymbol $IMAGE_INDEPENDENT_CFASL = makeKeyword("IMAGE-INDEPENDENT-CFASL");

    private static final SubLList $list210 = list(makeKeyword("ENCODING-INPUT-FN"), makeSymbol("CFASL-INPUT"), makeKeyword("ENCODING-OUTPUT-FN"), makeSymbol("CFASL-OUTPUT-EXTERNALIZED"), makeKeyword("ENCODING-SIZE-FN"), makeSymbol("CFASL-EXTERNALIZED-OBJECT-SIZE"), makeKeyword("HASH-FN"), makeSymbol("SXHASH-EXTERNAL"));

    private static final SubLSymbol $HL_EXTERNALIZED_KEYS = makeKeyword("HL-EXTERNALIZED-KEYS");

    private static final SubLList $list212 = list(new SubLObject[]{ makeKeyword("ENCODING-INPUT-FN"), makeSymbol("CFASL-INPUT"), makeKeyword("ENCODING-OUTPUT-FN"), makeSymbol("CFASL-OUTPUT-EXTERNALIZED"), makeKeyword("ENCODING-SIZE-FN"), makeSymbol("CFASL-EXTERNALIZED-OBJECT-SIZE"), makeKeyword("HASH-FN"), makeSymbol("SXHASH-EXTERNAL"), makeKeyword("ENCODING-KEY-INPUT-FN"), makeSymbol("FIND-OBJECT-BY-HL-EXTERNAL-ID-STRING"), makeKeyword("ENCODING-KEY-OUTPUT-FN"), makeSymbol("HL-EXTERNAL-ID-STRING") });

    private static final SubLList $list213 = list(makeSymbol("FORMAT-STRING"), makeSymbol("&REST"), makeSymbol("ARGS"));

    static private final SubLList $list215 = list(makeSymbol("NULL"), makeSymbol("*FHT-LOOKUP-STREAM*"));

    public static final SubLSymbol $fht_lookup_stream$ = makeSymbol("*FHT-LOOKUP-STREAM*");

    private static final SubLSymbol $IF_DOES_NOT_EXIST = makeKeyword("IF-DOES-NOT-EXIST");

    private static final SubLSymbol $fht_not_found$ = makeSymbol("*FHT-NOT-FOUND*");

    private static final SubLString $$$FileHashTable_Not_Found = makeString("FileHashTable Not Found");

    private static final SubLSymbol $not_in_fht$ = makeSymbol("*NOT-IN-FHT*");

    private static final SubLString $$$Not_In_FHT = makeString("Not In FHT");

    private static final SubLString $str231$GET_FILE_HASH_TABLE__A_has_cache_ = makeString("GET-FILE-HASH-TABLE ~A has cache hit of ABSENT.~%");

    private static final SubLString $str232$GET_FILE_HASH_TABLE__A_has_cache_ = makeString("GET-FILE-HASH-TABLE ~A has cache hit with good value.~%");

    private static final SubLString $str233$GET_FILE_HASH_TABLE__A_has_to_go_ = makeString("GET-FILE-HASH-TABLE ~A has to go to the FHT.~%");

    private static final SubLString $str235$GET_FILE_HASH_TABLE__A_updated_ca = makeString("GET-FILE-HASH-TABLE ~A updated cache with hit.~%");

    private static final SubLString $str236$GET_FILE_HASH_TABLE__A_updated_ca = makeString("GET-FILE-HASH-TABLE ~A updated cache with ABSENT.~%");

    private static final SubLString $str237$The_key__S_maps_to_the_non_numeri = makeString("The key ~S maps to the non-numeric value ~S in the file-hash-table ~A.");

    private static final SubLList $list238 = list(list(makeSymbol("KEY"), makeSymbol("VAL"), makeSymbol("FHT"), makeSymbol("DONE-VAR"), makeSymbol("&OPTIONAL"), makeSymbol("KEYS-ONLY?")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym239$THE_KEY = makeUninternedSymbol("THE-KEY");

    private static final SubLSymbol $sym240$THE_VALUE = makeUninternedSymbol("THE-VALUE");

    private static final SubLSymbol $sym241$CONTINUATION = makeUninternedSymbol("CONTINUATION");

    private static final SubLSymbol $sym242$NEXT = makeUninternedSymbol("NEXT");

    private static final SubLSymbol $sym243$COMPLETE_ = makeUninternedSymbol("COMPLETE?");

    private static final SubLList $list245 = list(NIL);

    private static final SubLSymbol GET_FILE_HASH_TABLE_ANY = makeSymbol("GET-FILE-HASH-TABLE-ANY");

    private static final SubLSymbol $sym254$THE_KEY = makeUninternedSymbol("THE-KEY");

    private static final SubLSymbol $sym255$THE_VALUE = makeUninternedSymbol("THE-VALUE");

    private static final SubLSymbol $sym256$CONTINUATION = makeUninternedSymbol("CONTINUATION");

    private static final SubLSymbol $sym257$NEXT = makeUninternedSymbol("NEXT");

    private static final SubLSymbol $sym258$COMPLETE_ = makeUninternedSymbol("COMPLETE?");

    private static final SubLSymbol GET_PRISTINE_FILE_HASH_TABLE_ANY = makeSymbol("GET-PRISTINE-FILE-HASH-TABLE-ANY");

    private static final SubLList $list260 = list(list(makeSymbol("KEY"), makeSymbol("VALUE"), makeSymbol("FHT"), makeSymbol("&KEY"), makeSymbol("MESSAGE"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list261 = list(makeKeyword("MESSAGE"), $DONE);

    private static final SubLSymbol $sym263$TABLE_VAR = makeUninternedSymbol("TABLE-VAR");

    private static final SubLSymbol $progress_note$ = makeSymbol("*PROGRESS-NOTE*");

    static private final SubLList $list265 = list(makeSymbol("CSETQ"), makeSymbol("*PROGRESS-START-TIME*"), list(makeSymbol("GET-UNIVERSAL-TIME")));

    private static final SubLSymbol $progress_total$ = makeSymbol("*PROGRESS-TOTAL*");

    private static final SubLSymbol FILE_HASH_TABLE_COUNT = makeSymbol("FILE-HASH-TABLE-COUNT");

    private static final SubLList $list268 = list(makeSymbol("CSETQ"), makeSymbol("*PROGRESS-SOFAR*"), ZERO_INTEGER);

    private static final SubLSymbol DO_FILE_HASH_TABLE = makeSymbol("DO-FILE-HASH-TABLE");

    private static final SubLList $list271 = list(makeSymbol("NOTE-PERCENT-PROGRESS"), makeSymbol("*PROGRESS-SOFAR*"), makeSymbol("*PROGRESS-TOTAL*"));

    private static final SubLList $list272 = list(makeSymbol("CINC"), makeSymbol("*PROGRESS-SOFAR*"));

    private static final SubLSymbol DOSOME_FILE_HASH_TABLE = makeSymbol("DOSOME-FILE-HASH-TABLE");

    private static final SubLSymbol $sym274$TABLE_VAR = makeUninternedSymbol("TABLE-VAR");

    private static final SubLSymbol DOSOME_PRISTINE_FILE_HASH_TABLE = makeSymbol("DOSOME-PRISTINE-FILE-HASH-TABLE");

    private static final SubLString $str276$_S_____S__ = makeString("~S -> ~S~%");

    private static final SubLList $list277 = list(list(makeSymbol("KEY"), makeSymbol("VALUE"), makeSymbol("FHT"), makeSymbol("&OPTIONAL"), list(makeSymbol("MESSAGE"), makeString("do-file-hash-table"))), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLString $str278$do_file_hash_table = makeString("do-file-hash-table");

    private static final SubLSymbol PROGRESS_DO_FILE_HASH_TABLE = makeSymbol("PROGRESS-DO-FILE-HASH-TABLE");

    private static final SubLList $list280 = list(makeSymbol("DO-FILE-HASH-TABLE"));

    private static final SubLList $list281 = list(list(makeSymbol("KEY"), makeSymbol("FHT"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol DOSOME_FILE_HASH_TABLE_KEYS = makeSymbol("DOSOME-FILE-HASH-TABLE-KEYS");

    private static final SubLList $list283 = list(makeSymbol("DO-FILE-HASH-TABLE-KEYS"));

    private static final SubLSymbol DO_FILE_HASH_TABLE_KEYS = makeSymbol("DO-FILE-HASH-TABLE-KEYS");

    private static final SubLList $list285 = list(list(makeSymbol("KEY"), makeSymbol("FHT"), makeSymbol("&KEY"), makeSymbol("MESSAGE"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym286$FHT_VAR = makeUninternedSymbol("FHT-VAR");

    private static final SubLSymbol $sym287$VALUE = makeUninternedSymbol("VALUE");

    static private final SubLList $list288 = list(T);

    private static final SubLSymbol $sym290$FHT_VAR = makeUninternedSymbol("FHT-VAR");

    private static final SubLSymbol $sym291$VALUE = makeUninternedSymbol("VALUE");

    private static final SubLList $list292 = list(list(makeSymbol("KEY"), makeSymbol("FHT"), makeSymbol("&OPTIONAL"), list(makeSymbol("MESSAGE"), makeString("do-file-hash-table-keys"))), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLString $str293$do_file_hash_table_keys = makeString("do-file-hash-table-keys");

    private static final SubLSymbol PROGRESS_DO_FILE_HASH_TABLE_KEYS = makeSymbol("PROGRESS-DO-FILE-HASH-TABLE-KEYS");

    private static final SubLSymbol $sym296$_ = makeSymbol("<");

    private static final SubLString $str297$Invalid_key_entry__A__Offset_0x_X = makeString("Invalid key entry ~A: Offset 0x~X (~A) HashCode ~A~%");

    private static final SubLString $str298$FHT_for__A_corrupted___A_____A__A = makeString("FHT for ~A corrupted; ~A != ~A+~A+ -- cannot recover in this fashion.~%");

    private static final SubLString $str299$Entry__A___A_bytes_total___A_byte = makeString("Entry ~A: ~A bytes total, ~A bytes key size, ~A bytes object size (+ ~A bytes header).~%");

    private static final SubLSymbol $sym300$ITERATE_FILE_HASH_TABLE_DONE_ = makeSymbol("ITERATE-FILE-HASH-TABLE-DONE?");

    private static final SubLSymbol ITERATE_FILE_HASH_TABLE_NEXT_VALUE = makeSymbol("ITERATE-FILE-HASH-TABLE-NEXT-VALUE");

    private static final SubLSymbol ITERATE_FILE_HASH_TABLE_NEXT = makeSymbol("ITERATE-FILE-HASH-TABLE-NEXT");

    static private final SubLList $list304 = list(makeSymbol("CURRENT"), makeSymbol("FHT"), makeSymbol("KEYS-ONLY?"), makeSymbol("FINALIZE-FHT?"));

    private static final SubLString $str306$converting_file_hash_table_to_ali = makeString("converting file-hash-table to alist");

    private static final SubLString $str307$tmp_ = makeString("tmp/");

    private static final SubLString $str309$ = makeString("");

    private static final SubLString $str310$_tmp_ = makeString("/tmp/");

    private static final SubLString $str319$Cannot_put_into_table__table_is_f = makeString("Cannot put into table; table is full and cannot grow.");

    private static final SubLString $str320$Implementation_Error__Unexpected_ = makeString("Implementation Error: Unexpected status ~A returned by FHT-LOOKUP-KEY. (KEY = ~A, INDEX = ~A.)");

    private static final SubLString $str322$Can_neither_find_key__S_nor_prove = makeString("Can neither find key ~S nor prove its non-presence. Ensure that your encoding function and your test function work correctly together, i.e. (funcall testfn <OBJ> (cfasl-decoding (cfasl-encoding <OBJ))) -> T. If they are, then this is an implementation error. (INDEX = ~A, STATUS = ~A, KEY-ENTRY = ~A)");

    private static final SubLString $str323$Cannot_get_key__S_from_table__Imp = makeString("Cannot get key ~S from table: Implementation error (INDEX = ~A, STATUS = ~A, KEY-ENTRY = ~A).");

    private static final SubLSymbol HTFILE_FILE_BLOCK_ENTRY = makeSymbol("HTFILE-FILE-BLOCK-ENTRY");

    private static final SubLSymbol HTFILE_FILE_BLOCK_ENTRY_P = makeSymbol("HTFILE-FILE-BLOCK-ENTRY-P");

    private static final SubLList $list326 = list(makeSymbol("SIZE"), makeSymbol("NEXT"));

    private static final SubLList $list327 = list($SIZE, $NEXT);

    private static final SubLList $list328 = list(makeSymbol("HTFILE-FILE-BLOCK-ENTRY-SIZE"), makeSymbol("HTFILE-FILE-BLOCK-ENTRY-NEXT"));

    private static final SubLList $list329 = list(makeSymbol("_CSETF-HTFILE-FILE-BLOCK-ENTRY-SIZE"), makeSymbol("_CSETF-HTFILE-FILE-BLOCK-ENTRY-NEXT"));

    private static final SubLSymbol PRINT_HTFILE_FILE_BLOCK_ENTRY = makeSymbol("PRINT-HTFILE-FILE-BLOCK-ENTRY");

    private static final SubLSymbol HTFILE_FILE_BLOCK_ENTRY_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("HTFILE-FILE-BLOCK-ENTRY-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list332 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("HTFILE-FILE-BLOCK-ENTRY-P"));

    private static final SubLSymbol HTFILE_FILE_BLOCK_ENTRY_SIZE = makeSymbol("HTFILE-FILE-BLOCK-ENTRY-SIZE");

    private static final SubLSymbol _CSETF_HTFILE_FILE_BLOCK_ENTRY_SIZE = makeSymbol("_CSETF-HTFILE-FILE-BLOCK-ENTRY-SIZE");

    private static final SubLSymbol HTFILE_FILE_BLOCK_ENTRY_NEXT = makeSymbol("HTFILE-FILE-BLOCK-ENTRY-NEXT");

    private static final SubLSymbol _CSETF_HTFILE_FILE_BLOCK_ENTRY_NEXT = makeSymbol("_CSETF-HTFILE-FILE-BLOCK-ENTRY-NEXT");

    private static final SubLSymbol MAKE_HTFILE_FILE_BLOCK_ENTRY = makeSymbol("MAKE-HTFILE-FILE-BLOCK-ENTRY");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_HTFILE_FILE_BLOCK_ENTRY_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-HTFILE-FILE-BLOCK-ENTRY-METHOD");

    private static final SubLString $str340$__FILE_BLOCK_ENTRY__s__s_ = makeString("#<FILE-BLOCK-ENTRY:~s:~s>");

    private static final SubLString $str341$Unable_to_position_to_file_pos__D = makeString("Unable to position to file-pos ~D; true position is.");

    private static final SubLString $str342$Unable_to_position_to_file_pos__A = makeString("Unable to position to file-pos ~A; true position is ~A.");

    private static final SubLString $str343$Invalid_key_index__D_into_key_spa = makeString("Invalid key index ~D into key space [0,~D).");

    private static final SubLString $str344$Invalid_key_offset__A__points_pas = makeString("Invalid key offset ~A, points past key space start ~A.");

    private static final SubLString $str345$Index__A_has_null_hash_code_ = makeString("Index ~A has null hash-code.");

    private static final SubLString $str346$Index__A_has_null_key_offset_ = makeString("Index ~A has null key offset.");

    private static final SubLInteger $int$10009 = makeInteger(10009);

    private static final SubLString $str348$__FHT_LOOKUP__A_I__A__H__A___ = makeString("~&FHT-LOOKUP ~A I=~A (H=~A)~%");

    private static final SubLString $str349$__FHT_LOOKUP__empty_key_iter__A_L = makeString("~&FHT-LOOKUP :empty-key iter=~A LastI=~A~%");

    private static final SubLString $str350$__FHT_LOOKUP__found_iter__A_LastI = makeString("~&FHT-LOOKUP :found iter=~A LastI=~A~%");

    private static final SubLString $str351$__FHT_LOOKUP__table_full_iter__A_ = makeString("~&FHT-LOOKUP :table-full iter=~A LastI=~A~%");

    private static final SubLString $str352$__FHT_LOOKUP_probe_I__A__ = makeString("~&FHT-LOOKUP probe I=~A~%");

    private static final SubLString $str353$__FHT_LOOKUP__error_iter__A_LastI = makeString("~&FHT-LOOKUP :error iter=~A LastI=~A~%");

    private static final SubLInteger $int$66 = makeInteger(66);

    static private final SubLList $list355 = list(list(makeSymbol("FHT"), makeSymbol("DIFF-KEYSPACE"), makeSymbol("DIFF-CAPACITY")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym356$HEADER_LOCAL = makeUninternedSymbol("HEADER-LOCAL");

    private static final SubLSymbol $sym357$KEYSPACE_TEMP = makeUninternedSymbol("KEYSPACE-TEMP");

    private static final SubLSymbol $sym358$CAPACITY_TEMP = makeUninternedSymbol("CAPACITY-TEMP");

    private static final SubLString $str360$Internal_error__S_during_table_re = makeString("Internal error ~S during table rehashing; file might be corrupted.");

    private static final SubLString $str362$Cannot_correctly_determine_file_p = makeString("Cannot correctly determine file position after writing object entry to ~D.");

    private static final SubLString $str363$New_file_position__D_is_smaller_t = makeString("New file position ~D is smaller than starting position ~D ... disk full?");

    private static final SubLString $str364$Instead_of__D_bytes__object_took_ = makeString("Instead of ~D bytes, object took ~D to write; object modified during write?");

    private static final SubLString $str365$Only__D_of_the_expected__D_bytes_ = makeString("Only ~D of the expected ~D bytes were written; object modified during write? Disk full?");

    private static final SubLString $str366$Claimed_object_size__D_did_not_ma = makeString("Claimed object size ~D did not match I/O size ~D; file might be corrupted.");

    private static final SubLSymbol $file_hash_table_headers$ = makeSymbol("*FILE-HASH-TABLE-HEADERS*");

    private static final SubLList $list368 = list(makeSymbol("VMAJOR"), makeSymbol("VMINOR"), makeSymbol("READER"), makeSymbol("WRITER"), makeSymbol("VERIFIER"));

    private static final SubLInteger $int$32792 = makeInteger(32792);

    private static final SubLInteger $int$32784 = makeInteger(32784);

    private static final SubLInteger $int$32776 = makeInteger(32776);

    private static final SubLInteger $int$32768 = makeInteger(32768);

    private static final SubLInteger $int$32824 = makeInteger(32824);

    private static final SubLInteger $int$32816 = makeInteger(32816);

    private static final SubLInteger $int$32808 = makeInteger(32808);

    private static final SubLInteger $int$32800 = makeInteger(32800);

    private static final SubLString $str381$After_reading__S__computed_positi = makeString("After reading ~S, computed position ~D /= actual file position ~D.");

    private static final SubLString $str382$Predicted_object_size__D_did_not_ = makeString("Predicted object size ~D did not match I/O size ~D; file might be corrupted.");

    private static final SubLString $str384$Premature_end_of_file_when_moving = makeString("Premature end-of-file when moving block (~D bytes) from ~D to ~D.");

    private static final SubLString $str388$Invalid_Fast_FHT_optimization_mod = makeString("Invalid Fast-FHT optimization mode ~A.");

    private static final SubLSymbol FAST_CREATE_FHT = makeSymbol("FAST-CREATE-FHT");

    private static final SubLSymbol FAST_CREATE_FHT_P = makeSymbol("FAST-CREATE-FHT-P");

    private static final SubLList $list391 = list(makeSymbol("FHT"), makeSymbol("TEMPSTEM"), makeSymbol("TEMPFILE"), makeSymbol("KEYSTREAM"));

    private static final SubLList $list392 = list(makeKeyword("FHT"), makeKeyword("TEMPSTEM"), makeKeyword("TEMPFILE"), makeKeyword("KEYSTREAM"));

    private static final SubLList $list393 = list(makeSymbol("FAST-CREATE-FHT-FHT"), makeSymbol("FAST-CREATE-FHT-TEMPSTEM"), makeSymbol("FAST-CREATE-FHT-TEMPFILE"), makeSymbol("FAST-CREATE-FHT-KEYSTREAM"));

    private static final SubLList $list394 = list(makeSymbol("_CSETF-FAST-CREATE-FHT-FHT"), makeSymbol("_CSETF-FAST-CREATE-FHT-TEMPSTEM"), makeSymbol("_CSETF-FAST-CREATE-FHT-TEMPFILE"), makeSymbol("_CSETF-FAST-CREATE-FHT-KEYSTREAM"));

    private static final SubLSymbol FAST_CREATE_FHT_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("FAST-CREATE-FHT-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list396 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("FAST-CREATE-FHT-P"));

    private static final SubLSymbol FAST_CREATE_FHT_FHT = makeSymbol("FAST-CREATE-FHT-FHT");

    private static final SubLSymbol _CSETF_FAST_CREATE_FHT_FHT = makeSymbol("_CSETF-FAST-CREATE-FHT-FHT");

    private static final SubLSymbol FAST_CREATE_FHT_TEMPSTEM = makeSymbol("FAST-CREATE-FHT-TEMPSTEM");

    private static final SubLSymbol _CSETF_FAST_CREATE_FHT_TEMPSTEM = makeSymbol("_CSETF-FAST-CREATE-FHT-TEMPSTEM");

    private static final SubLSymbol FAST_CREATE_FHT_TEMPFILE = makeSymbol("FAST-CREATE-FHT-TEMPFILE");

    private static final SubLSymbol _CSETF_FAST_CREATE_FHT_TEMPFILE = makeSymbol("_CSETF-FAST-CREATE-FHT-TEMPFILE");

    private static final SubLSymbol FAST_CREATE_FHT_KEYSTREAM = makeSymbol("FAST-CREATE-FHT-KEYSTREAM");

    private static final SubLSymbol _CSETF_FAST_CREATE_FHT_KEYSTREAM = makeSymbol("_CSETF-FAST-CREATE-FHT-KEYSTREAM");

    private static final SubLSymbol MAKE_FAST_CREATE_FHT = makeSymbol("MAKE-FAST-CREATE-FHT");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_FAST_CREATE_FHT_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-FAST-CREATE-FHT-METHOD");

    private static final SubLInteger $int$1024 = makeInteger(1024);

    private static final SubLSymbol $sym412$_EXIT = makeSymbol("%EXIT");

    private static final SubLString $str413$keystream_ = makeString("keystream-");

    private static final SubLList $list414 = list(makeKeyword("ERROR"), makeKeyword("USE-FIRST"));

    private static final SubLString $str415$Unknown_NON_UNIQUE_KEY_HANDLING_v = makeString("Unknown NON-UNIQUE-KEY-HANDLING value ~S");

    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");

    private static final SubLString $$$ambiguous = makeString("ambiguous");

    private static final SubLString $str419$Unable_to_open__S = makeString("Unable to open ~S");

    private static final SubLString $$$unambiguous = makeString("unambiguous");

    private static final SubLString $str421$Cannot_call_this_method_in_mode__ = makeString("Cannot call this method in mode ~A.");

    private static final SubLString $str422$Seeding_keyspace_with_unambiguous = makeString("Seeding keyspace with unambiguous keys ....");

    private static final SubLString $str423$Run_in_index_of_keystream__prev__ = makeString("Run in index of keystream (prev=~A curr=~A). Fix FAST-FHT-UNIQUIFY-KEYSTREAM");

    private static final SubLString $$$Inserting_ = makeString("Inserting ");

    private static final SubLString $str425$_keys_into_keyspace_____ = makeString(" keys into keyspace ....");

    private static final SubLString $str426$Sorry__key__A_appears_not_to_be_u = makeString("Sorry, key ~A appears not to be unique within the set; fast hash table create only works for already unique sets.");

    private static final SubLSymbol FAST_FHT_KEYSTREAM_SORTER = makeSymbol("FAST-FHT-KEYSTREAM-SORTER");

    private static final SubLSymbol FAST_FHT_KEYSTREAM_SORTER_P = makeSymbol("FAST-FHT-KEYSTREAM-SORTER-P");

    private static final SubLList $list430 = list(makeSymbol("TEMPSTEM"), makeSymbol("IN-FILES"), makeSymbol("OUT-FILES"));

    private static final SubLList $list431 = list(makeKeyword("TEMPSTEM"), makeKeyword("IN-FILES"), makeKeyword("OUT-FILES"));

    static private final SubLList $list432 = list(makeSymbol("FSTFHT-KSORTER-TEMPSTEM"), makeSymbol("FSTFHT-KSORTER-IN-FILES"), makeSymbol("FSTFHT-KSORTER-OUT-FILES"));

    private static final SubLList $list433 = list(makeSymbol("_CSETF-FSTFHT-KSORTER-TEMPSTEM"), makeSymbol("_CSETF-FSTFHT-KSORTER-IN-FILES"), makeSymbol("_CSETF-FSTFHT-KSORTER-OUT-FILES"));

    private static final SubLSymbol FAST_FHT_KEYSTREAM_SORTER_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("FAST-FHT-KEYSTREAM-SORTER-PRINT-FUNCTION-TRAMPOLINE");

    static private final SubLList $list435 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("FAST-FHT-KEYSTREAM-SORTER-P"));

    private static final SubLSymbol FSTFHT_KSORTER_TEMPSTEM = makeSymbol("FSTFHT-KSORTER-TEMPSTEM");

    private static final SubLSymbol _CSETF_FSTFHT_KSORTER_TEMPSTEM = makeSymbol("_CSETF-FSTFHT-KSORTER-TEMPSTEM");

    private static final SubLSymbol FSTFHT_KSORTER_IN_FILES = makeSymbol("FSTFHT-KSORTER-IN-FILES");

    private static final SubLSymbol _CSETF_FSTFHT_KSORTER_IN_FILES = makeSymbol("_CSETF-FSTFHT-KSORTER-IN-FILES");

    private static final SubLSymbol FSTFHT_KSORTER_OUT_FILES = makeSymbol("FSTFHT-KSORTER-OUT-FILES");

    private static final SubLSymbol _CSETF_FSTFHT_KSORTER_OUT_FILES = makeSymbol("_CSETF-FSTFHT-KSORTER-OUT-FILES");

    private static final SubLSymbol MAKE_FAST_FHT_KEYSTREAM_SORTER = makeSymbol("MAKE-FAST-FHT-KEYSTREAM-SORTER");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_FAST_FHT_KEYSTREAM_SORTER_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-FAST-FHT-KEYSTREAM-SORTER-METHOD");

    private static final SubLInteger $int$179769313486231590772930519078902 = makeInteger("179769313486231590772930519078902473361797697894230657273430081157732675805500963132708477322407536021120113879871393357658789768814416622492847430639474124377767893424865485276302219601246094119453082952085005768838150682342462881473913110540827237163350510684586298239947245938479716304835356329624224137216");

    private static final SubLString $str447$Prepare_tiled_input_files_____ = makeString("Prepare tiled input files ....");

    private static final SubLString $str448$Less_than_3_tiles__no_sort_needed = makeString("Less than 3 tiles, no sort needed ....");

    private static final SubLString $str450$Merge_sorting_keystream_of_ = makeString("Merge-sorting keystream of ");

    private static final SubLString $$$_tiles_in_ = makeString(" tiles in ");

    private static final SubLString $str452$_passes____ = makeString(" passes....");

    private static final SubLString $str453$Generate_set_and_activity_files__ = makeString("Generate set and activity files ....");

    private static final SubLString $str454$in_ = makeString("in-");

    private static final SubLString $str455$out_ = makeString("out-");

    private static final SubLString $str456$Can_only_work_from_a_rewound_keys = makeString("Can only work from a rewound keystream ~A.");

    private static final SubLSymbol $sym457$FAST_FHT_KEYSTREAM_ENTRY_ = makeSymbol("FAST-FHT-KEYSTREAM-ENTRY<");

    private static final SubLList $list462 = list(makeUninternedSymbol("START"), makeUninternedSymbol("END"), makeUninternedSymbol("DELTA"));

    private static final SubLString $$$_of_ = makeString(" of ");

    private static final SubLString $$$Merge_Pass_ = makeString("Merge Pass ");

    private static final SubLString $str465$The_chunk_count_should_have_decli = makeString("The chunk count should have declined, but did not: ~A >= ~A.");

    private static final SubLString $str466$Only_sentinels_or__EOF_can_be_equ = makeString("Only sentinels or :EOF can be equal, but ~A and ~A are.");

    private static final SubLList $list468 = list(makeSymbol("FHT"), makeSymbol("INDEX"), makeSymbol("ENTRY"), makeSymbol("IN-STREAM"), makeSymbol("LOSER-ITEMS"), makeSymbol("COLLISION-STREAM"));

    private static final SubLSymbol $sym469$_ = makeSymbol("=");

    private static final SubLSymbol FAST_FHT_GET_COMPARABLE_INDEX_FROM_ENTRY = makeSymbol("FAST-FHT-GET-COMPARABLE-INDEX-FROM-ENTRY");

    private static final SubLSymbol FAST_FHT_WRITE_ONE_COLLISION_STREAM_ENTRY = makeSymbol("FAST-FHT-WRITE-ONE-COLLISION-STREAM-ENTRY");

    private static final SubLSymbol FAST_FHT_READ_ONE_KEYSTREAM_ENTRY = makeSymbol("FAST-FHT-READ-ONE-KEYSTREAM-ENTRY");

    private static final SubLList $list474 = list(new SubLObject[]{ makeSymbol("FHT"), makeSymbol("KEEPER-ENTRY"), makeSymbol("LOSER-ENTRY"), makeSymbol("KEEPER-STREAM"), makeSymbol("LOSER-STREAM"), makeSymbol("KEEPER-ITEMS"), makeSymbol("LOSER-ITEMS"), makeSymbol("SET-STREAM"), makeSymbol("COLLISION-STREAM") });

    private static final SubLSymbol $sym475$INDEX_KEEPER = makeUninternedSymbol("INDEX-KEEPER");

    private static final SubLSymbol $sym476$INDEX_LOSER = makeUninternedSymbol("INDEX-LOSER");

    private static final SubLSymbol FAST_FHT_WRITE_ONE_KEYSTREAM_ENTRY = makeSymbol("FAST-FHT-WRITE-ONE-KEYSTREAM-ENTRY");

    private static final SubLSymbol FAST_FHT_DRAIN_INDEX_RUN = makeSymbol("FAST-FHT-DRAIN-INDEX-RUN");

    private static final SubLString $str479$__A_set_item_A___A_activity_item_ = makeString(" ~A set item~A, ~A activity item~A ");

    private static final SubLString $$$s = makeString("s");

    private static final SubLString $str481$_________________________ = makeString("=========================");

    private static final SubLString $str482$______File__A______ = makeString("~&<<<<File ~A>>>>~%");

    private static final SubLString $str483$File__A_no_does_not_contain_a_val = makeString("File ~A no does not contain a valid keystream: problem at ~A.");

    private static final SubLSymbol $MID_STREAM_EOF = makeKeyword("MID-STREAM-EOF");

    private static final SubLSymbol TEST_FAST_FHT_KEYSTREAM_ENTRY_CMP = makeSymbol("TEST-FAST-FHT-KEYSTREAM-ENTRY-CMP");

    private static final SubLList $list493 = list(new SubLObject[]{ list(list(makeKeyword("SENTINEL"), makeKeyword("SENTINEL")), makeKeyword("EQ")), list(list(makeKeyword("EOF"), makeKeyword("EOF")), makeKeyword("EQ")), list(list(makeKeyword("SENTINEL"), makeKeyword("EOF")), makeKeyword("LT")), list(list(makeKeyword("EOF"), makeKeyword("SENTINEL")), makeKeyword("GT")), list(list(list(makeInteger(104), makeInteger(168), makeInteger(12850), makeString("137")), makeKeyword("SENTINEL")), makeKeyword("LT")), list(list(makeKeyword("SENTINEL"), list(makeInteger(104), makeInteger(168), makeInteger(12850), makeString("137"))), makeKeyword("GT")), list(list(list(makeInteger(104), makeInteger(168), makeInteger(12850), makeString("137")), makeKeyword("EOF")), makeKeyword("LT")), list(list(makeKeyword("EOF"), list(makeInteger(104), makeInteger(168), makeInteger(12850), makeString("137"))), makeKeyword("GT")), list(list(list(makeInteger(128), makeInteger(128), makeInteger(13062), makeString("97")), list(makeInteger(104), makeInteger(168), makeInteger(12850), makeString("137"))), makeKeyword("GT")), list(list(list(makeInteger(104), makeInteger(168), makeInteger(12850), makeString("137")), list(makeInteger(128), makeInteger(128), makeInteger(13062), makeString("97"))), makeKeyword("LT")), list(list(list(makeInteger(104), makeInteger(168), makeInteger(12850), makeString("137")), list(makeInteger(104), makeInteger(168), makeInteger(12850), makeString("137"))), makeKeyword("EQ")) });

    private static final SubLList $list495 = list(list(makeSymbol("FHT"), makeSymbol("FILENAME"), makeSymbol("&KEY"), list(makeSymbol("TEST-FN"), list(QUOTE, makeSymbol("*DEFAULT-FHT-TEST-FUNCTION*"))), list(makeSymbol("SERIALIZATION-FN"), makeSymbol("*DEFAULT-FHT-SERIALIZATION-PROTOCOL*"))), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list496 = list(makeKeyword("TEST-FN"), makeKeyword("SERIALIZATION-FN"));

    public static final SubLSymbol $default_fht_test_function$ = makeSymbol("*DEFAULT-FHT-TEST-FUNCTION*");

    private static final SubLSymbol OPEN_FILE_HASH_TABLE_READ_ONLY = makeSymbol("OPEN-FILE-HASH-TABLE-READ-ONLY");

    private static final SubLSymbol FINALIZE_FILE_HASH_TABLE = makeSymbol("FINALIZE-FILE-HASH-TABLE");

    private static final SubLSymbol OPEN_FILE_HASH_TABLE = makeSymbol("OPEN-FILE-HASH-TABLE");

    private static final SubLList $list505 = list(list(makeSymbol("FHT"), makeSymbol("FILENAME"), makeSymbol("&KEY"), list(makeSymbol("EXPECTED-ITEMS"), makeSymbol("*HTFILE-DEFAULT-EXPECTED-ITEMS*")), list(makeSymbol("AVERAGE-SIZE"), makeSymbol("*HTFILE-DEFAULT-AVERAGE-SIZE*")), list(makeSymbol("TEST-FN"), list(QUOTE, makeSymbol("*DEFAULT-FHT-TEST-FUNCTION*"))), list(makeSymbol("SERIALIZATION-FN"), makeSymbol("*DEFAULT-FHT-SERIALIZATION-PROTOCOL*"))), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list506 = list(makeKeyword("EXPECTED-ITEMS"), makeKeyword("AVERAGE-SIZE"), makeKeyword("TEST-FN"), makeKeyword("SERIALIZATION-FN"));

    private static final SubLSymbol CREATE_FILE_HASH_TABLE = makeSymbol("CREATE-FILE-HASH-TABLE");

    private static final SubLList $list510 = list(list(makeSymbol("FAST-FHT"), makeSymbol("FILENAME"), makeSymbol("&KEY"), list(makeSymbol("TEMPDIR"), list(makeSymbol("TEMP-DIRECTORY"))), list(makeSymbol("TEST-FN"), list(QUOTE, makeSymbol("*DEFAULT-FHT-TEST-FUNCTION*"))), list(makeSymbol("SERIALIZATION-FN"), makeSymbol("*DEFAULT-FHT-SERIALIZATION-PROTOCOL*")), list(makeSymbol("KEEP-TEMPORARY-KEYFILE"))), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list511 = list(makeKeyword("TEMPDIR"), makeKeyword("TEST-FN"), makeKeyword("SERIALIZATION-FN"), makeKeyword("KEEP-TEMPORARY-KEYFILE"));

    private static final SubLSymbol $KEEP_TEMPORARY_KEYFILE = makeKeyword("KEEP-TEMPORARY-KEYFILE");

    private static final SubLSymbol FAST_CREATE_FILE_HASH_TABLE = makeSymbol("FAST-CREATE-FILE-HASH-TABLE");

    private static final SubLSymbol FINALIZE_FAST_CREATE_FILE_HASH_TABLE = makeSymbol("FINALIZE-FAST-CREATE-FILE-HASH-TABLE");

    private static final SubLSymbol TEST_FAST_FHT_CREATION_WITH_MERGE_SORTED_KEYSTREAM = makeSymbol("TEST-FAST-FHT-CREATION-WITH-MERGE-SORTED-KEYSTREAM");

    private static final SubLList $list517 = list(new SubLObject[]{ list(list(makeInteger(31), THREE_INTEGER, makeKeyword("MODERATE")), makeKeyword("SUCCESS")), list(list(makeInteger(23), THREE_INTEGER, makeKeyword("MODERATE")), makeKeyword("SUCCESS")), list(list(FIFTEEN_INTEGER, THREE_INTEGER, makeKeyword("MODERATE")), makeKeyword("SUCCESS")), list(list(SEVEN_INTEGER, THREE_INTEGER, makeKeyword("MODERATE")), makeKeyword("SUCCESS")), list(list(makeInteger(31), THREE_INTEGER, makeKeyword("AGGRESSIVE")), makeKeyword("SUCCESS")), list(list(makeInteger(23), THREE_INTEGER, makeKeyword("AGGRESSIVE")), makeKeyword("SUCCESS")), list(list(FIFTEEN_INTEGER, THREE_INTEGER, makeKeyword("AGGRESSIVE")), makeKeyword("SUCCESS")), list(list(SEVEN_INTEGER, THREE_INTEGER, makeKeyword("AGGRESSIVE")), makeKeyword("SUCCESS")), list(list(makeInteger(31), THREE_INTEGER, makeKeyword("CONSERVATIVE")), makeKeyword("SUCCESS")), list(list(makeInteger(23), THREE_INTEGER, makeKeyword("CONSERVATIVE")), makeKeyword("SUCCESS")), list(list(FIFTEEN_INTEGER, THREE_INTEGER, makeKeyword("CONSERVATIVE")), makeKeyword("SUCCESS")), list(list(SEVEN_INTEGER, THREE_INTEGER, makeKeyword("CONSERVATIVE")), makeKeyword("SUCCESS")) });

    private static final SubLString $$$My_String_ = makeString("My String ");

    private static final SubLString $str521$fht_ = makeString("fht-");

    private static final SubLString $str522$Writing_out_FHT_____ = makeString("Writing out FHT ....");

    private static final SubLList $list523 = list(makeSymbol("KEY"), makeSymbol("VALUES"));

    private static final SubLString $str524$Error__expected__A_items__got__A_ = makeString("Error, expected ~A items, got ~A.");

    private static final SubLString $str525$Checking_map_against_FHT_____ = makeString("Checking map against FHT ....");

    private static final SubLString $str526$For__S__expected__S__got__S_inste = makeString("For ~S, expected ~S, got ~S instead.");

    private static final SubLString $str527$We_checked__A_of__A_entries_ = makeString("We checked ~A of ~A entries.");

    private static final SubLString $str528$Checking_FHT_against_map____ = makeString("Checking FHT against map ...");

    private static final SubLString $str529$For__S__epxected__S__got__S_inste = makeString("For ~S, epxected ~S, got ~S instead.");

    private static final SubLSymbol TEST_FAST_FHT_WITH_KB_CONTENTS = makeSymbol("TEST-FAST-FHT-WITH-KB-CONTENTS");

    private static final SubLList $list531 = list(list(list(makeInteger(100), makeSymbol("RANDOM-CONSTANT"), makeSymbol("CONSTANT-SUID"), makeSymbol("CONSTANT-NAME"), EQL, makeSymbol("STRING-EQUAL")), makeKeyword("SUCCESS")), list(list(makeInteger(100), makeSymbol("RANDOM-ASSERTION"), makeSymbol("ASSERTION-ID"), makeSymbol("COMPACT-HL-EXTERNAL-ID-STRING"), EQL, makeSymbol("STRING-EQUAL")), makeKeyword("SUCCESS")), list(list(makeInteger(100), makeSymbol("TEST-FFHTKB-GENERATE-CONSTANT-INFO"), makeSymbol("TEST-FFHTKB-GRAB-CONSTANT-KEY-INFO"), makeSymbol("TEST-FFHTKB-GRAB-CONSTANT-VALUE-INFO"), EQUALP, EQUALP, makeKeyword("IMAGE-INDEPENDENT-CFASL")), makeKeyword("SUCCESS")));

    

    public static final SubLObject file_hash_table_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject file_hash_table_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject file_hash_table_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.file_hash_table.$file_hash_table_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject file_hash_table_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.file_hash_table.$file_hash_table_native.class ? T : NIL;
    }

    public static final SubLObject file_hash_table_stream_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, FILE_HASH_TABLE_P);
        return v_object.getField2();
    }

    public static SubLObject file_hash_table_stream(final SubLObject v_object) {
        assert NIL != file_hash_table_p(v_object) : "! file_hash_table.file_hash_table_p(v_object) " + "file_hash_table.file_hash_table_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject file_hash_table_header_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, FILE_HASH_TABLE_P);
        return v_object.getField3();
    }

    public static SubLObject file_hash_table_header(final SubLObject v_object) {
        assert NIL != file_hash_table_p(v_object) : "! file_hash_table.file_hash_table_p(v_object) " + "file_hash_table.file_hash_table_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject file_hash_table_lock_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, FILE_HASH_TABLE_P);
        return v_object.getField4();
    }

    public static SubLObject file_hash_table_lock(final SubLObject v_object) {
        assert NIL != file_hash_table_p(v_object) : "! file_hash_table.file_hash_table_p(v_object) " + "file_hash_table.file_hash_table_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject file_hash_table_encoding_input_fn_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, FILE_HASH_TABLE_P);
        return v_object.getField5();
    }

    public static SubLObject file_hash_table_encoding_input_fn(final SubLObject v_object) {
        assert NIL != file_hash_table_p(v_object) : "! file_hash_table.file_hash_table_p(v_object) " + "file_hash_table.file_hash_table_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject file_hash_table_encoding_output_fn_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, FILE_HASH_TABLE_P);
        return v_object.getField6();
    }

    public static SubLObject file_hash_table_encoding_output_fn(final SubLObject v_object) {
        assert NIL != file_hash_table_p(v_object) : "! file_hash_table.file_hash_table_p(v_object) " + "file_hash_table.file_hash_table_p error :" + v_object;
        return v_object.getField6();
    }

    public static final SubLObject file_hash_table_encoding_size_fn_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, FILE_HASH_TABLE_P);
        return v_object.getField7();
    }

    public static SubLObject file_hash_table_encoding_size_fn(final SubLObject v_object) {
        assert NIL != file_hash_table_p(v_object) : "! file_hash_table.file_hash_table_p(v_object) " + "file_hash_table.file_hash_table_p error :" + v_object;
        return v_object.getField7();
    }

    public static final SubLObject file_hash_table_encoding_key_input_fn_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, FILE_HASH_TABLE_P);
        return v_object.getField8();
    }

    public static SubLObject file_hash_table_encoding_key_input_fn(final SubLObject v_object) {
        assert NIL != file_hash_table_p(v_object) : "! file_hash_table.file_hash_table_p(v_object) " + "file_hash_table.file_hash_table_p error :" + v_object;
        return v_object.getField8();
    }

    public static final SubLObject file_hash_table_encoding_key_output_fn_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, FILE_HASH_TABLE_P);
        return v_object.getField9();
    }

    public static SubLObject file_hash_table_encoding_key_output_fn(final SubLObject v_object) {
        assert NIL != file_hash_table_p(v_object) : "! file_hash_table.file_hash_table_p(v_object) " + "file_hash_table.file_hash_table_p error :" + v_object;
        return v_object.getField9();
    }

    public static final SubLObject file_hash_table_testfn_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, FILE_HASH_TABLE_P);
        return v_object.getField10();
    }

    public static SubLObject file_hash_table_testfn(final SubLObject v_object) {
        assert NIL != file_hash_table_p(v_object) : "! file_hash_table.file_hash_table_p(v_object) " + "file_hash_table.file_hash_table_p error :" + v_object;
        return v_object.getField10();
    }

    public static final SubLObject file_hash_table_hash_fn_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, FILE_HASH_TABLE_P);
        return v_object.getField11();
    }

    public static SubLObject file_hash_table_hash_fn(final SubLObject v_object) {
        assert NIL != file_hash_table_p(v_object) : "! file_hash_table.file_hash_table_p(v_object) " + "file_hash_table.file_hash_table_p error :" + v_object;
        return v_object.getField11();
    }

    public static final SubLObject file_hash_table_input_cache_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, FILE_HASH_TABLE_P);
        return v_object.getField12();
    }

    public static SubLObject file_hash_table_input_cache(final SubLObject v_object) {
        assert NIL != file_hash_table_p(v_object) : "! file_hash_table.file_hash_table_p(v_object) " + "file_hash_table.file_hash_table_p error :" + v_object;
        return v_object.getField12();
    }

    public static final SubLObject file_hash_table_output_cache_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, FILE_HASH_TABLE_P);
        return v_object.getField13();
    }

    public static SubLObject file_hash_table_output_cache(final SubLObject v_object) {
        assert NIL != file_hash_table_p(v_object) : "! file_hash_table.file_hash_table_p(v_object) " + "file_hash_table.file_hash_table_p error :" + v_object;
        return v_object.getField13();
    }

    public static final SubLObject file_hash_table_property_list_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, FILE_HASH_TABLE_P);
        return v_object.getField14();
    }

    public static SubLObject file_hash_table_property_list(final SubLObject v_object) {
        assert NIL != file_hash_table_p(v_object) : "! file_hash_table.file_hash_table_p(v_object) " + "file_hash_table.file_hash_table_p error :" + v_object;
        return v_object.getField14();
    }

    public static final SubLObject _csetf_file_hash_table_stream_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, FILE_HASH_TABLE_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_file_hash_table_stream(final SubLObject v_object, final SubLObject value) {
        assert NIL != file_hash_table_p(v_object) : "! file_hash_table.file_hash_table_p(v_object) " + "file_hash_table.file_hash_table_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_file_hash_table_header_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, FILE_HASH_TABLE_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_file_hash_table_header(final SubLObject v_object, final SubLObject value) {
        assert NIL != file_hash_table_p(v_object) : "! file_hash_table.file_hash_table_p(v_object) " + "file_hash_table.file_hash_table_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_file_hash_table_lock_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, FILE_HASH_TABLE_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_file_hash_table_lock(final SubLObject v_object, final SubLObject value) {
        assert NIL != file_hash_table_p(v_object) : "! file_hash_table.file_hash_table_p(v_object) " + "file_hash_table.file_hash_table_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_file_hash_table_encoding_input_fn_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, FILE_HASH_TABLE_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_file_hash_table_encoding_input_fn(final SubLObject v_object, final SubLObject value) {
        assert NIL != file_hash_table_p(v_object) : "! file_hash_table.file_hash_table_p(v_object) " + "file_hash_table.file_hash_table_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_file_hash_table_encoding_output_fn_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, FILE_HASH_TABLE_P);
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_file_hash_table_encoding_output_fn(final SubLObject v_object, final SubLObject value) {
        assert NIL != file_hash_table_p(v_object) : "! file_hash_table.file_hash_table_p(v_object) " + "file_hash_table.file_hash_table_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static final SubLObject _csetf_file_hash_table_encoding_size_fn_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, FILE_HASH_TABLE_P);
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_file_hash_table_encoding_size_fn(final SubLObject v_object, final SubLObject value) {
        assert NIL != file_hash_table_p(v_object) : "! file_hash_table.file_hash_table_p(v_object) " + "file_hash_table.file_hash_table_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static final SubLObject _csetf_file_hash_table_encoding_key_input_fn_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, FILE_HASH_TABLE_P);
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_file_hash_table_encoding_key_input_fn(final SubLObject v_object, final SubLObject value) {
        assert NIL != file_hash_table_p(v_object) : "! file_hash_table.file_hash_table_p(v_object) " + "file_hash_table.file_hash_table_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static final SubLObject _csetf_file_hash_table_encoding_key_output_fn_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, FILE_HASH_TABLE_P);
        return v_object.setField9(value);
    }

    public static SubLObject _csetf_file_hash_table_encoding_key_output_fn(final SubLObject v_object, final SubLObject value) {
        assert NIL != file_hash_table_p(v_object) : "! file_hash_table.file_hash_table_p(v_object) " + "file_hash_table.file_hash_table_p error :" + v_object;
        return v_object.setField9(value);
    }

    public static final SubLObject _csetf_file_hash_table_testfn_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, FILE_HASH_TABLE_P);
        return v_object.setField10(value);
    }

    public static SubLObject _csetf_file_hash_table_testfn(final SubLObject v_object, final SubLObject value) {
        assert NIL != file_hash_table_p(v_object) : "! file_hash_table.file_hash_table_p(v_object) " + "file_hash_table.file_hash_table_p error :" + v_object;
        return v_object.setField10(value);
    }

    public static final SubLObject _csetf_file_hash_table_hash_fn_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, FILE_HASH_TABLE_P);
        return v_object.setField11(value);
    }

    public static SubLObject _csetf_file_hash_table_hash_fn(final SubLObject v_object, final SubLObject value) {
        assert NIL != file_hash_table_p(v_object) : "! file_hash_table.file_hash_table_p(v_object) " + "file_hash_table.file_hash_table_p error :" + v_object;
        return v_object.setField11(value);
    }

    public static final SubLObject _csetf_file_hash_table_input_cache_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, FILE_HASH_TABLE_P);
        return v_object.setField12(value);
    }

    public static SubLObject _csetf_file_hash_table_input_cache(final SubLObject v_object, final SubLObject value) {
        assert NIL != file_hash_table_p(v_object) : "! file_hash_table.file_hash_table_p(v_object) " + "file_hash_table.file_hash_table_p error :" + v_object;
        return v_object.setField12(value);
    }

    public static final SubLObject _csetf_file_hash_table_output_cache_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, FILE_HASH_TABLE_P);
        return v_object.setField13(value);
    }

    public static SubLObject _csetf_file_hash_table_output_cache(final SubLObject v_object, final SubLObject value) {
        assert NIL != file_hash_table_p(v_object) : "! file_hash_table.file_hash_table_p(v_object) " + "file_hash_table.file_hash_table_p error :" + v_object;
        return v_object.setField13(value);
    }

    public static final SubLObject _csetf_file_hash_table_property_list_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, FILE_HASH_TABLE_P);
        return v_object.setField14(value);
    }

    public static SubLObject _csetf_file_hash_table_property_list(final SubLObject v_object, final SubLObject value) {
        assert NIL != file_hash_table_p(v_object) : "! file_hash_table.file_hash_table_p(v_object) " + "file_hash_table.file_hash_table_p error :" + v_object;
        return v_object.setField14(value);
    }

    public static final SubLObject make_file_hash_table_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.file_hash_table.$file_hash_table_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($STREAM)) {
                        _csetf_file_hash_table_stream(v_new, current_value);
                    } else {
                        if (pcase_var.eql($HEADER)) {
                            _csetf_file_hash_table_header(v_new, current_value);
                        } else {
                            if (pcase_var.eql($LOCK)) {
                                _csetf_file_hash_table_lock(v_new, current_value);
                            } else {
                                if (pcase_var.eql($ENCODING_INPUT_FN)) {
                                    _csetf_file_hash_table_encoding_input_fn(v_new, current_value);
                                } else {
                                    if (pcase_var.eql($ENCODING_OUTPUT_FN)) {
                                        _csetf_file_hash_table_encoding_output_fn(v_new, current_value);
                                    } else {
                                        if (pcase_var.eql($ENCODING_SIZE_FN)) {
                                            _csetf_file_hash_table_encoding_size_fn(v_new, current_value);
                                        } else {
                                            if (pcase_var.eql($ENCODING_KEY_INPUT_FN)) {
                                                _csetf_file_hash_table_encoding_key_input_fn(v_new, current_value);
                                            } else {
                                                if (pcase_var.eql($ENCODING_KEY_OUTPUT_FN)) {
                                                    _csetf_file_hash_table_encoding_key_output_fn(v_new, current_value);
                                                } else {
                                                    if (pcase_var.eql($TESTFN)) {
                                                        _csetf_file_hash_table_testfn(v_new, current_value);
                                                    } else {
                                                        if (pcase_var.eql($HASH_FN)) {
                                                            _csetf_file_hash_table_hash_fn(v_new, current_value);
                                                        } else {
                                                            if (pcase_var.eql($INPUT_CACHE)) {
                                                                _csetf_file_hash_table_input_cache(v_new, current_value);
                                                            } else {
                                                                if (pcase_var.eql($OUTPUT_CACHE)) {
                                                                    _csetf_file_hash_table_output_cache(v_new, current_value);
                                                                } else {
                                                                    if (pcase_var.eql($PROPERTY_LIST)) {
                                                                        _csetf_file_hash_table_property_list(v_new, current_value);
                                                                    } else {
                                                                        Errors.error($str_alt47$Invalid_slot__S_for_construction_, current_arg);
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
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_file_hash_table(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.file_hash_table.$file_hash_table_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($STREAM)) {
                _csetf_file_hash_table_stream(v_new, current_value);
            } else
                if (pcase_var.eql($HEADER)) {
                    _csetf_file_hash_table_header(v_new, current_value);
                } else
                    if (pcase_var.eql($LOCK)) {
                        _csetf_file_hash_table_lock(v_new, current_value);
                    } else
                        if (pcase_var.eql($ENCODING_INPUT_FN)) {
                            _csetf_file_hash_table_encoding_input_fn(v_new, current_value);
                        } else
                            if (pcase_var.eql($ENCODING_OUTPUT_FN)) {
                                _csetf_file_hash_table_encoding_output_fn(v_new, current_value);
                            } else
                                if (pcase_var.eql($ENCODING_SIZE_FN)) {
                                    _csetf_file_hash_table_encoding_size_fn(v_new, current_value);
                                } else
                                    if (pcase_var.eql($ENCODING_KEY_INPUT_FN)) {
                                        _csetf_file_hash_table_encoding_key_input_fn(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($ENCODING_KEY_OUTPUT_FN)) {
                                            _csetf_file_hash_table_encoding_key_output_fn(v_new, current_value);
                                        } else
                                            if (pcase_var.eql($TESTFN)) {
                                                _csetf_file_hash_table_testfn(v_new, current_value);
                                            } else
                                                if (pcase_var.eql($HASH_FN)) {
                                                    _csetf_file_hash_table_hash_fn(v_new, current_value);
                                                } else
                                                    if (pcase_var.eql($INPUT_CACHE)) {
                                                        _csetf_file_hash_table_input_cache(v_new, current_value);
                                                    } else
                                                        if (pcase_var.eql($OUTPUT_CACHE)) {
                                                            _csetf_file_hash_table_output_cache(v_new, current_value);
                                                        } else
                                                            if (pcase_var.eql($PROPERTY_LIST)) {
                                                                _csetf_file_hash_table_property_list(v_new, current_value);
                                                            } else {
                                                                Errors.error($str48$Invalid_slot__S_for_construction_, current_arg);
                                                            }












        }
        return v_new;
    }

    public static SubLObject visit_defstruct_file_hash_table(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_FILE_HASH_TABLE, THIRTEEN_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $STREAM, file_hash_table_stream(obj));
        funcall(visitor_fn, obj, $SLOT, $HEADER, file_hash_table_header(obj));
        funcall(visitor_fn, obj, $SLOT, $LOCK, file_hash_table_lock(obj));
        funcall(visitor_fn, obj, $SLOT, $ENCODING_INPUT_FN, file_hash_table_encoding_input_fn(obj));
        funcall(visitor_fn, obj, $SLOT, $ENCODING_OUTPUT_FN, file_hash_table_encoding_output_fn(obj));
        funcall(visitor_fn, obj, $SLOT, $ENCODING_SIZE_FN, file_hash_table_encoding_size_fn(obj));
        funcall(visitor_fn, obj, $SLOT, $ENCODING_KEY_INPUT_FN, file_hash_table_encoding_key_input_fn(obj));
        funcall(visitor_fn, obj, $SLOT, $ENCODING_KEY_OUTPUT_FN, file_hash_table_encoding_key_output_fn(obj));
        funcall(visitor_fn, obj, $SLOT, $TESTFN, file_hash_table_testfn(obj));
        funcall(visitor_fn, obj, $SLOT, $HASH_FN, file_hash_table_hash_fn(obj));
        funcall(visitor_fn, obj, $SLOT, $INPUT_CACHE, file_hash_table_input_cache(obj));
        funcall(visitor_fn, obj, $SLOT, $OUTPUT_CACHE, file_hash_table_output_cache(obj));
        funcall(visitor_fn, obj, $SLOT, $PROPERTY_LIST, file_hash_table_property_list(obj));
        funcall(visitor_fn, obj, $END, MAKE_FILE_HASH_TABLE, THIRTEEN_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_file_hash_table_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_file_hash_table(obj, visitor_fn);
    }

    public static final SubLObject describe_file_hash_table_alt(SubLObject fht, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        format(stream, $str_alt48$__FHT__Stream___A_Lock___A___, file_hash_table_stream(fht), file_hash_table_lock(fht));
        format(stream, $str_alt49$_Test___A__, file_hash_table_testfn(fht));
        describe_htfile_header(file_hash_table_header(fht), stream);
        format(stream, $str_alt50$_Encoding__Input__A_Output__A_Siz, new SubLObject[]{ file_hash_table_encoding_input_fn(fht), file_hash_table_encoding_output_fn(fht), file_hash_table_encoding_size_fn(fht) });
        format(stream, $str_alt51$_Key_Encoding__Input__A_Output__A, file_hash_table_encoding_key_input_fn(fht), file_hash_table_encoding_key_output_fn(fht));
        format(stream, $str_alt52$_Hashing___A__, file_hash_table_hash_fn(fht));
        format(stream, $str_alt53$_Caches__Input__A_Output__A____, file_hash_table_input_cache(fht), file_hash_table_output_cache(fht));
        format(stream, $str_alt54$_Properties___A__, file_hash_table_property_list(fht));
        return fht;
    }

    public static SubLObject describe_file_hash_table(final SubLObject fht, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        format(stream, $str54$__FHT__Stream___A_Lock___A___, file_hash_table_stream(fht), file_hash_table_lock(fht));
        format(stream, $str55$_Test___A__, file_hash_table_testfn(fht));
        describe_htfile_header(file_hash_table_header(fht), stream);
        format(stream, $str56$_Encoding__Input__A_Output__A_Siz, new SubLObject[]{ file_hash_table_encoding_input_fn(fht), file_hash_table_encoding_output_fn(fht), file_hash_table_encoding_size_fn(fht) });
        format(stream, $str57$_Key_Encoding__Input__A_Output__A, file_hash_table_encoding_key_input_fn(fht), file_hash_table_encoding_key_output_fn(fht));
        format(stream, $str58$_Hashing___A__, file_hash_table_hash_fn(fht));
        format(stream, $str59$_Caches__Input__A_Output__A____, file_hash_table_input_cache(fht), file_hash_table_output_cache(fht));
        format(stream, $str60$_Properties___A__, file_hash_table_property_list(fht));
        return fht;
    }

    /**
     * Is OBJECT a read-only file-hash-table?
     */
    @LispMethod(comment = "Is OBJECT a read-only file-hash-table?")
    public static final SubLObject read_only_file_hash_table_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != file_hash_table_p(v_object)) && (NIL != file_hash_table_is_read_onlyP(v_object)));
    }

    /**
     * Is OBJECT a read-only file-hash-table?
     */
    @LispMethod(comment = "Is OBJECT a read-only file-hash-table?")
    public static SubLObject read_only_file_hash_table_p(final SubLObject v_object) {
        return makeBoolean((NIL != file_hash_table_p(v_object)) && (NIL != file_hash_table_is_read_onlyP(v_object)));
    }

    /**
     * Is OBJECT a writeable file-hash-table?
     */
    @LispMethod(comment = "Is OBJECT a writeable file-hash-table?")
    public static final SubLObject writeable_file_hash_table_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != file_hash_table_p(v_object)) && (NIL == file_hash_table_is_read_onlyP(v_object)));
    }

    /**
     * Is OBJECT a writeable file-hash-table?
     */
    @LispMethod(comment = "Is OBJECT a writeable file-hash-table?")
    public static SubLObject writeable_file_hash_table_p(final SubLObject v_object) {
        return makeBoolean((NIL != file_hash_table_p(v_object)) && (NIL == file_hash_table_is_read_onlyP(v_object)));
    }

    /**
     * Is the file-hash-table FHT read-only?
     */
    @LispMethod(comment = "Is the file-hash-table FHT read-only?")
    public static final SubLObject file_hash_table_is_read_onlyP_alt(SubLObject fht) {
        SubLTrampolineFile.checkType(fht, FILE_HASH_TABLE_P);
        {
            SubLObject fht_stream = file_hash_table_stream(fht);
            return makeBoolean(NIL == output_stream_p(fht_stream));
        }
    }

    /**
     * Is the file-hash-table FHT read-only?
     */
    @LispMethod(comment = "Is the file-hash-table FHT read-only?")
    public static SubLObject file_hash_table_is_read_onlyP(final SubLObject fht) {
        assert NIL != file_hash_table_p(fht) : "! file_hash_table.file_hash_table_p(fht) " + ("file_hash_table.file_hash_table_p(fht) " + "CommonSymbols.NIL != file_hash_table.file_hash_table_p(fht) ") + fht;
        final SubLObject fht_stream = file_hash_table_stream(fht);
        return makeBoolean(NIL == output_stream_p(fht_stream));
    }

    /**
     *
     *
     * @return stringp; the path of the file associated with the file-hash-table FHT
     */
    @LispMethod(comment = "@return stringp; the path of the file associated with the file-hash-table FHT")
    public static final SubLObject file_hash_table_path_alt(SubLObject fht) {
        SubLTrampolineFile.checkType(fht, FILE_HASH_TABLE_P);
        return string_utilities.to_string(Filesys.probe_file(file_hash_table_stream(fht)));
    }

    /**
     *
     *
     * @return stringp; the path of the file associated with the file-hash-table FHT
     */
    @LispMethod(comment = "@return stringp; the path of the file associated with the file-hash-table FHT")
    public static SubLObject file_hash_table_path(final SubLObject fht) {
        assert NIL != file_hash_table_p(fht) : "! file_hash_table.file_hash_table_p(fht) " + ("file_hash_table.file_hash_table_p(fht) " + "CommonSymbols.NIL != file_hash_table.file_hash_table_p(fht) ") + fht;
        return string_utilities.to_string(Filesys.probe_file(file_hash_table_stream(fht)));
    }

    /**
     *
     *
     * @return keywordp; the serialization of the file-hash-table FHT
     */
    @LispMethod(comment = "@return keywordp; the serialization of the file-hash-table FHT")
    public static final SubLObject file_hash_table_serialization_alt(SubLObject fht) {
        SubLTrampolineFile.checkType(fht, FILE_HASH_TABLE_P);
        {
            SubLObject encoding_input_fn = file_hash_table_encoding_input_fn(fht);
            SubLObject encoding_output_fn = file_hash_table_encoding_output_fn(fht);
            SubLObject encoding_size_fn = file_hash_table_encoding_size_fn(fht);
            SubLObject hash_fn = file_hash_table_hash_fn(fht);
            SubLObject encoding_key_input_fn = file_hash_table_encoding_key_input_fn(fht);
            SubLObject encoding_key_output_fn = file_hash_table_encoding_key_output_fn(fht);
            return find_fht_serialization_by_functions(encoding_input_fn, encoding_output_fn, encoding_size_fn, hash_fn, encoding_key_input_fn, encoding_key_output_fn);
        }
    }

    /**
     *
     *
     * @return keywordp; the serialization of the file-hash-table FHT
     */
    @LispMethod(comment = "@return keywordp; the serialization of the file-hash-table FHT")
    public static SubLObject file_hash_table_serialization(final SubLObject fht) {
        assert NIL != file_hash_table_p(fht) : "! file_hash_table.file_hash_table_p(fht) " + ("file_hash_table.file_hash_table_p(fht) " + "CommonSymbols.NIL != file_hash_table.file_hash_table_p(fht) ") + fht;
        final SubLObject encoding_input_fn = file_hash_table_encoding_input_fn(fht);
        final SubLObject encoding_output_fn = file_hash_table_encoding_output_fn(fht);
        final SubLObject encoding_size_fn = file_hash_table_encoding_size_fn(fht);
        final SubLObject hash_fn = file_hash_table_hash_fn(fht);
        final SubLObject encoding_key_input_fn = file_hash_table_encoding_key_input_fn(fht);
        final SubLObject encoding_key_output_fn = file_hash_table_encoding_key_output_fn(fht);
        return find_fht_serialization_by_functions(encoding_input_fn, encoding_output_fn, encoding_size_fn, hash_fn, encoding_key_input_fn, encoding_key_output_fn);
    }

    public static SubLObject file_hash_table_change_stream_buffer_size(final SubLObject fht, final SubLObject new_stream_buffer_size) {
        final SubLObject lock = file_hash_table_lock(fht);
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            _csetf_file_hash_table_stream(fht, file_utilities.change_file_stream_buffer_size(file_hash_table_stream(fht), new_stream_buffer_size));
        } finally {
            if (NIL != release) {
                release_lock(lock);
            }
        }
        return fht;
    }

    public static SubLObject file_hash_table_enable_memory_mapping(final SubLObject fht) {
        final SubLObject lock = file_hash_table_lock(fht);
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            _csetf_file_hash_table_stream(fht, file_utilities.enable_file_stream_memory_mapping(file_hash_table_stream(fht)));
        } finally {
            if (NIL != release) {
                release_lock(lock);
            }
        }
        return fht;
    }

    public static SubLObject file_hash_table_memory_mappedP(final SubLObject fht) {
        SubLObject result = NIL;
        final SubLObject lock = file_hash_table_lock(fht);
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            result = file_utilities.file_stream_memory_mappedP(file_hash_table_stream(fht));
        } finally {
            if (NIL != release) {
                release_lock(lock);
            }
        }
        return result;
    }

    public static final SubLObject htfile_header_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject htfile_header_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject htfile_header_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.file_hash_table.$htfile_header_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject htfile_header_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.file_hash_table.$htfile_header_native.class ? T : NIL;
    }

    public static final SubLObject htfile_header_size_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, HTFILE_HEADER_P);
        return v_object.getField2();
    }

    public static SubLObject htfile_header_size(final SubLObject v_object) {
        assert NIL != htfile_header_p(v_object) : "! file_hash_table.htfile_header_p(v_object) " + "file_hash_table.htfile_header_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject htfile_header_version_major_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, HTFILE_HEADER_P);
        return v_object.getField3();
    }

    public static SubLObject htfile_header_version_major(final SubLObject v_object) {
        assert NIL != htfile_header_p(v_object) : "! file_hash_table.htfile_header_p(v_object) " + "file_hash_table.htfile_header_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject htfile_header_version_minor_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, HTFILE_HEADER_P);
        return v_object.getField4();
    }

    public static SubLObject htfile_header_version_minor(final SubLObject v_object) {
        assert NIL != htfile_header_p(v_object) : "! file_hash_table.htfile_header_p(v_object) " + "file_hash_table.htfile_header_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject htfile_header_object_space_offset_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, HTFILE_HEADER_P);
        return v_object.getField5();
    }

    public static SubLObject htfile_header_object_space_offset(final SubLObject v_object) {
        assert NIL != htfile_header_p(v_object) : "! file_hash_table.htfile_header_p(v_object) " + "file_hash_table.htfile_header_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject htfile_header_key_space_offset_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, HTFILE_HEADER_P);
        return v_object.getField6();
    }

    public static SubLObject htfile_header_key_space_offset(final SubLObject v_object) {
        assert NIL != htfile_header_p(v_object) : "! file_hash_table.htfile_header_p(v_object) " + "file_hash_table.htfile_header_p error :" + v_object;
        return v_object.getField6();
    }

    public static final SubLObject htfile_header_current_heap_top_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, HTFILE_HEADER_P);
        return v_object.getField7();
    }

    public static SubLObject htfile_header_current_heap_top(final SubLObject v_object) {
        assert NIL != htfile_header_p(v_object) : "! file_hash_table.htfile_header_p(v_object) " + "file_hash_table.htfile_header_p error :" + v_object;
        return v_object.getField7();
    }

    public static final SubLObject htfile_header_item_count_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, HTFILE_HEADER_P);
        return v_object.getField8();
    }

    public static SubLObject htfile_header_item_count(final SubLObject v_object) {
        assert NIL != htfile_header_p(v_object) : "! file_hash_table.htfile_header_p(v_object) " + "file_hash_table.htfile_header_p error :" + v_object;
        return v_object.getField8();
    }

    public static final SubLObject htfile_header_capacity_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, HTFILE_HEADER_P);
        return v_object.getField9();
    }

    public static SubLObject htfile_header_capacity(final SubLObject v_object) {
        assert NIL != htfile_header_p(v_object) : "! file_hash_table.htfile_header_p(v_object) " + "file_hash_table.htfile_header_p error :" + v_object;
        return v_object.getField9();
    }

    public static final SubLObject htfile_header_free_list_head_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, HTFILE_HEADER_P);
        return v_object.getField10();
    }

    public static SubLObject htfile_header_free_list_head(final SubLObject v_object) {
        assert NIL != htfile_header_p(v_object) : "! file_hash_table.htfile_header_p(v_object) " + "file_hash_table.htfile_header_p error :" + v_object;
        return v_object.getField10();
    }

    public static final SubLObject htfile_header_deletion_count_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, HTFILE_HEADER_P);
        return v_object.getField11();
    }

    public static SubLObject htfile_header_deletion_count(final SubLObject v_object) {
        assert NIL != htfile_header_p(v_object) : "! file_hash_table.htfile_header_p(v_object) " + "file_hash_table.htfile_header_p error :" + v_object;
        return v_object.getField11();
    }

    public static final SubLObject htfile_header_header_crc_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, HTFILE_HEADER_P);
        return v_object.getField12();
    }

    public static SubLObject htfile_header_header_crc(final SubLObject v_object) {
        assert NIL != htfile_header_p(v_object) : "! file_hash_table.htfile_header_p(v_object) " + "file_hash_table.htfile_header_p error :" + v_object;
        return v_object.getField12();
    }

    public static final SubLObject htfile_header_extension_space_size_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, HTFILE_HEADER_P);
        return v_object.getField13();
    }

    public static SubLObject htfile_header_extension_space_size(final SubLObject v_object) {
        assert NIL != htfile_header_p(v_object) : "! file_hash_table.htfile_header_p(v_object) " + "file_hash_table.htfile_header_p error :" + v_object;
        return v_object.getField13();
    }

    public static final SubLObject htfile_header_extension_space_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, HTFILE_HEADER_P);
        return v_object.getField14();
    }

    public static SubLObject htfile_header_extension_space(final SubLObject v_object) {
        assert NIL != htfile_header_p(v_object) : "! file_hash_table.htfile_header_p(v_object) " + "file_hash_table.htfile_header_p error :" + v_object;
        return v_object.getField14();
    }

    public static final SubLObject _csetf_htfile_header_size_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, HTFILE_HEADER_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_htfile_header_size(final SubLObject v_object, final SubLObject value) {
        assert NIL != htfile_header_p(v_object) : "! file_hash_table.htfile_header_p(v_object) " + "file_hash_table.htfile_header_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_htfile_header_version_major_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, HTFILE_HEADER_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_htfile_header_version_major(final SubLObject v_object, final SubLObject value) {
        assert NIL != htfile_header_p(v_object) : "! file_hash_table.htfile_header_p(v_object) " + "file_hash_table.htfile_header_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_htfile_header_version_minor_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, HTFILE_HEADER_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_htfile_header_version_minor(final SubLObject v_object, final SubLObject value) {
        assert NIL != htfile_header_p(v_object) : "! file_hash_table.htfile_header_p(v_object) " + "file_hash_table.htfile_header_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_htfile_header_object_space_offset_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, HTFILE_HEADER_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_htfile_header_object_space_offset(final SubLObject v_object, final SubLObject value) {
        assert NIL != htfile_header_p(v_object) : "! file_hash_table.htfile_header_p(v_object) " + "file_hash_table.htfile_header_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_htfile_header_key_space_offset_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, HTFILE_HEADER_P);
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_htfile_header_key_space_offset(final SubLObject v_object, final SubLObject value) {
        assert NIL != htfile_header_p(v_object) : "! file_hash_table.htfile_header_p(v_object) " + "file_hash_table.htfile_header_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static final SubLObject _csetf_htfile_header_current_heap_top_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, HTFILE_HEADER_P);
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_htfile_header_current_heap_top(final SubLObject v_object, final SubLObject value) {
        assert NIL != htfile_header_p(v_object) : "! file_hash_table.htfile_header_p(v_object) " + "file_hash_table.htfile_header_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static final SubLObject _csetf_htfile_header_item_count_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, HTFILE_HEADER_P);
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_htfile_header_item_count(final SubLObject v_object, final SubLObject value) {
        assert NIL != htfile_header_p(v_object) : "! file_hash_table.htfile_header_p(v_object) " + "file_hash_table.htfile_header_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static final SubLObject _csetf_htfile_header_capacity_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, HTFILE_HEADER_P);
        return v_object.setField9(value);
    }

    public static SubLObject _csetf_htfile_header_capacity(final SubLObject v_object, final SubLObject value) {
        assert NIL != htfile_header_p(v_object) : "! file_hash_table.htfile_header_p(v_object) " + "file_hash_table.htfile_header_p error :" + v_object;
        return v_object.setField9(value);
    }

    public static final SubLObject _csetf_htfile_header_free_list_head_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, HTFILE_HEADER_P);
        return v_object.setField10(value);
    }

    public static SubLObject _csetf_htfile_header_free_list_head(final SubLObject v_object, final SubLObject value) {
        assert NIL != htfile_header_p(v_object) : "! file_hash_table.htfile_header_p(v_object) " + "file_hash_table.htfile_header_p error :" + v_object;
        return v_object.setField10(value);
    }

    public static final SubLObject _csetf_htfile_header_deletion_count_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, HTFILE_HEADER_P);
        return v_object.setField11(value);
    }

    public static SubLObject _csetf_htfile_header_deletion_count(final SubLObject v_object, final SubLObject value) {
        assert NIL != htfile_header_p(v_object) : "! file_hash_table.htfile_header_p(v_object) " + "file_hash_table.htfile_header_p error :" + v_object;
        return v_object.setField11(value);
    }

    public static final SubLObject _csetf_htfile_header_header_crc_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, HTFILE_HEADER_P);
        return v_object.setField12(value);
    }

    public static SubLObject _csetf_htfile_header_header_crc(final SubLObject v_object, final SubLObject value) {
        assert NIL != htfile_header_p(v_object) : "! file_hash_table.htfile_header_p(v_object) " + "file_hash_table.htfile_header_p error :" + v_object;
        return v_object.setField12(value);
    }

    public static final SubLObject _csetf_htfile_header_extension_space_size_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, HTFILE_HEADER_P);
        return v_object.setField13(value);
    }

    public static SubLObject _csetf_htfile_header_extension_space_size(final SubLObject v_object, final SubLObject value) {
        assert NIL != htfile_header_p(v_object) : "! file_hash_table.htfile_header_p(v_object) " + "file_hash_table.htfile_header_p error :" + v_object;
        return v_object.setField13(value);
    }

    public static final SubLObject _csetf_htfile_header_extension_space_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, HTFILE_HEADER_P);
        return v_object.setField14(value);
    }

    public static SubLObject _csetf_htfile_header_extension_space(final SubLObject v_object, final SubLObject value) {
        assert NIL != htfile_header_p(v_object) : "! file_hash_table.htfile_header_p(v_object) " + "file_hash_table.htfile_header_p error :" + v_object;
        return v_object.setField14(value);
    }

    public static final SubLObject make_htfile_header_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.file_hash_table.$htfile_header_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($SIZE)) {
                        _csetf_htfile_header_size(v_new, current_value);
                    } else {
                        if (pcase_var.eql($VERSION_MAJOR)) {
                            _csetf_htfile_header_version_major(v_new, current_value);
                        } else {
                            if (pcase_var.eql($VERSION_MINOR)) {
                                _csetf_htfile_header_version_minor(v_new, current_value);
                            } else {
                                if (pcase_var.eql($OBJECT_SPACE_OFFSET)) {
                                    _csetf_htfile_header_object_space_offset(v_new, current_value);
                                } else {
                                    if (pcase_var.eql($KEY_SPACE_OFFSET)) {
                                        _csetf_htfile_header_key_space_offset(v_new, current_value);
                                    } else {
                                        if (pcase_var.eql($CURRENT_HEAP_TOP)) {
                                            _csetf_htfile_header_current_heap_top(v_new, current_value);
                                        } else {
                                            if (pcase_var.eql($ITEM_COUNT)) {
                                                _csetf_htfile_header_item_count(v_new, current_value);
                                            } else {
                                                if (pcase_var.eql($CAPACITY)) {
                                                    _csetf_htfile_header_capacity(v_new, current_value);
                                                } else {
                                                    if (pcase_var.eql($FREE_LIST_HEAD)) {
                                                        _csetf_htfile_header_free_list_head(v_new, current_value);
                                                    } else {
                                                        if (pcase_var.eql($DELETION_COUNT)) {
                                                            _csetf_htfile_header_deletion_count(v_new, current_value);
                                                        } else {
                                                            if (pcase_var.eql($HEADER_CRC)) {
                                                                _csetf_htfile_header_header_crc(v_new, current_value);
                                                            } else {
                                                                if (pcase_var.eql($EXTENSION_SPACE_SIZE)) {
                                                                    _csetf_htfile_header_extension_space_size(v_new, current_value);
                                                                } else {
                                                                    if (pcase_var.eql($EXTENSION_SPACE)) {
                                                                        _csetf_htfile_header_extension_space(v_new, current_value);
                                                                    } else {
                                                                        Errors.error($str_alt47$Invalid_slot__S_for_construction_, current_arg);
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
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_htfile_header(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.file_hash_table.$htfile_header_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($SIZE)) {
                _csetf_htfile_header_size(v_new, current_value);
            } else
                if (pcase_var.eql($VERSION_MAJOR)) {
                    _csetf_htfile_header_version_major(v_new, current_value);
                } else
                    if (pcase_var.eql($VERSION_MINOR)) {
                        _csetf_htfile_header_version_minor(v_new, current_value);
                    } else
                        if (pcase_var.eql($OBJECT_SPACE_OFFSET)) {
                            _csetf_htfile_header_object_space_offset(v_new, current_value);
                        } else
                            if (pcase_var.eql($KEY_SPACE_OFFSET)) {
                                _csetf_htfile_header_key_space_offset(v_new, current_value);
                            } else
                                if (pcase_var.eql($CURRENT_HEAP_TOP)) {
                                    _csetf_htfile_header_current_heap_top(v_new, current_value);
                                } else
                                    if (pcase_var.eql($ITEM_COUNT)) {
                                        _csetf_htfile_header_item_count(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($CAPACITY)) {
                                            _csetf_htfile_header_capacity(v_new, current_value);
                                        } else
                                            if (pcase_var.eql($FREE_LIST_HEAD)) {
                                                _csetf_htfile_header_free_list_head(v_new, current_value);
                                            } else
                                                if (pcase_var.eql($DELETION_COUNT)) {
                                                    _csetf_htfile_header_deletion_count(v_new, current_value);
                                                } else
                                                    if (pcase_var.eql($HEADER_CRC)) {
                                                        _csetf_htfile_header_header_crc(v_new, current_value);
                                                    } else
                                                        if (pcase_var.eql($EXTENSION_SPACE_SIZE)) {
                                                            _csetf_htfile_header_extension_space_size(v_new, current_value);
                                                        } else
                                                            if (pcase_var.eql($EXTENSION_SPACE)) {
                                                                _csetf_htfile_header_extension_space(v_new, current_value);
                                                            } else {
                                                                Errors.error($str48$Invalid_slot__S_for_construction_, current_arg);
                                                            }












        }
        return v_new;
    }

    public static SubLObject visit_defstruct_htfile_header(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_HTFILE_HEADER, THIRTEEN_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $SIZE, htfile_header_size(obj));
        funcall(visitor_fn, obj, $SLOT, $VERSION_MAJOR, htfile_header_version_major(obj));
        funcall(visitor_fn, obj, $SLOT, $VERSION_MINOR, htfile_header_version_minor(obj));
        funcall(visitor_fn, obj, $SLOT, $OBJECT_SPACE_OFFSET, htfile_header_object_space_offset(obj));
        funcall(visitor_fn, obj, $SLOT, $KEY_SPACE_OFFSET, htfile_header_key_space_offset(obj));
        funcall(visitor_fn, obj, $SLOT, $CURRENT_HEAP_TOP, htfile_header_current_heap_top(obj));
        funcall(visitor_fn, obj, $SLOT, $ITEM_COUNT, htfile_header_item_count(obj));
        funcall(visitor_fn, obj, $SLOT, $CAPACITY, htfile_header_capacity(obj));
        funcall(visitor_fn, obj, $SLOT, $FREE_LIST_HEAD, htfile_header_free_list_head(obj));
        funcall(visitor_fn, obj, $SLOT, $DELETION_COUNT, htfile_header_deletion_count(obj));
        funcall(visitor_fn, obj, $SLOT, $HEADER_CRC, htfile_header_header_crc(obj));
        funcall(visitor_fn, obj, $SLOT, $EXTENSION_SPACE_SIZE, htfile_header_extension_space_size(obj));
        funcall(visitor_fn, obj, $SLOT, $EXTENSION_SPACE, htfile_header_extension_space(obj));
        funcall(visitor_fn, obj, $END, MAKE_HTFILE_HEADER, THIRTEEN_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_htfile_header_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_htfile_header(obj, visitor_fn);
    }

    public static final SubLObject describe_htfile_header_alt(SubLObject htfhdr, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        format(stream, $str_alt101$__HTFile_Header__Size__A_Format_V, new SubLObject[]{ htfile_header_size(htfhdr), htfile_header_version_major(htfhdr), htfile_header_version_minor(htfhdr) });
        format(stream, $str_alt102$_ObjSpace_Offset__0x_X___D___KeyS, new SubLObject[]{ htfile_header_object_space_offset(htfhdr), htfile_header_object_space_offset(htfhdr), htfile_header_key_space_offset(htfhdr), htfile_header_key_space_offset(htfhdr), htfile_header_current_heap_top(htfhdr), htfile_header_current_heap_top(htfhdr) });
        format(stream, $str_alt103$_Item_Count___A__Capacity___A__, htfile_header_item_count(htfhdr), htfile_header_capacity(htfhdr));
        if (NIL != htfile_header_free_list_head(htfhdr)) {
            format(stream, $str_alt104$_FreeListHead___A_, htfile_header_free_list_head(htfhdr));
        } else {
            write_string($str_alt105$_no_free_list_, stream, UNPROVIDED, UNPROVIDED);
        }
        if (NIL != htfile_header_deletion_count(htfhdr)) {
            format(stream, $str_alt106$_Deletions___A_, htfile_header_deletion_count(htfhdr));
        } else {
            write_string($str_alt107$_no_deletions_, stream, UNPROVIDED, UNPROVIDED);
        }
        if (NIL != htfile_header_header_crc(htfhdr)) {
            format(stream, $str_alt108$_CRC___A_, htfile_header_header_crc(htfhdr));
        } else {
            write_string($str_alt109$_no_CRC_support_, stream, UNPROVIDED, UNPROVIDED);
        }
        terpri(stream);
        format(stream, $str_alt110$_Extension_Space____A____A____, htfile_header_extension_space_size(htfhdr), htfile_header_extension_space(htfhdr));
        write_string($str_alt111$__, stream, UNPROVIDED, UNPROVIDED);
        return htfhdr;
    }

    public static SubLObject describe_htfile_header(final SubLObject htfhdr, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        format(stream, $str110$__HTFile_Header__Size__A_Format_V, new SubLObject[]{ htfile_header_size(htfhdr), htfile_header_version_major(htfhdr), htfile_header_version_minor(htfhdr) });
        format(stream, $str111$_ObjSpace_Offset__0x_X___D___KeyS, new SubLObject[]{ htfile_header_object_space_offset(htfhdr), htfile_header_object_space_offset(htfhdr), htfile_header_key_space_offset(htfhdr), htfile_header_key_space_offset(htfhdr), htfile_header_current_heap_top(htfhdr), htfile_header_current_heap_top(htfhdr) });
        format(stream, $str112$_Item_Count___A__Capacity___A__, htfile_header_item_count(htfhdr), htfile_header_capacity(htfhdr));
        if (NIL != htfile_header_free_list_head(htfhdr)) {
            format(stream, $str113$_FreeListHead___A_, htfile_header_free_list_head(htfhdr));
        } else {
            write_string($str114$_no_free_list_, stream, UNPROVIDED, UNPROVIDED);
        }
        if (NIL != htfile_header_deletion_count(htfhdr)) {
            format(stream, $str115$_Deletions___A_, htfile_header_deletion_count(htfhdr));
        } else {
            write_string($$$_no_deletions_, stream, UNPROVIDED, UNPROVIDED);
        }
        if (NIL != htfile_header_header_crc(htfhdr)) {
            format(stream, $str117$_CRC___A_, htfile_header_header_crc(htfhdr));
        } else {
            write_string($$$_no_CRC_support_, stream, UNPROVIDED, UNPROVIDED);
        }
        terpri(stream);
        format(stream, $str119$_Extension_Space____A____A____, htfile_header_extension_space_size(htfhdr), htfile_header_extension_space(htfhdr));
        write_string($str120$__, stream, UNPROVIDED, UNPROVIDED);
        return htfhdr;
    }

    public static final SubLObject htfile_object_entry_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject htfile_object_entry_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject htfile_object_entry_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.file_hash_table.$htfile_object_entry_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject htfile_object_entry_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.file_hash_table.$htfile_object_entry_native.class ? T : NIL;
    }

    public static final SubLObject htfile_object_entry_size_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, HTFILE_OBJECT_ENTRY_P);
        return v_object.getField2();
    }

    public static SubLObject htfile_object_entry_size(final SubLObject v_object) {
        assert NIL != htfile_object_entry_p(v_object) : "! file_hash_table.htfile_object_entry_p(v_object) " + "file_hash_table.htfile_object_entry_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject htfile_object_entry_type_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, HTFILE_OBJECT_ENTRY_P);
        return v_object.getField3();
    }

    public static SubLObject htfile_object_entry_type(final SubLObject v_object) {
        assert NIL != htfile_object_entry_p(v_object) : "! file_hash_table.htfile_object_entry_p(v_object) " + "file_hash_table.htfile_object_entry_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject htfile_object_entry_key_size_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, HTFILE_OBJECT_ENTRY_P);
        return v_object.getField4();
    }

    public static SubLObject htfile_object_entry_key_size(final SubLObject v_object) {
        assert NIL != htfile_object_entry_p(v_object) : "! file_hash_table.htfile_object_entry_p(v_object) " + "file_hash_table.htfile_object_entry_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject htfile_object_entry_key_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, HTFILE_OBJECT_ENTRY_P);
        return v_object.getField5();
    }

    public static SubLObject htfile_object_entry_key(final SubLObject v_object) {
        assert NIL != htfile_object_entry_p(v_object) : "! file_hash_table.htfile_object_entry_p(v_object) " + "file_hash_table.htfile_object_entry_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject htfile_object_entry_data_size_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, HTFILE_OBJECT_ENTRY_P);
        return v_object.getField6();
    }

    public static SubLObject htfile_object_entry_data_size(final SubLObject v_object) {
        assert NIL != htfile_object_entry_p(v_object) : "! file_hash_table.htfile_object_entry_p(v_object) " + "file_hash_table.htfile_object_entry_p error :" + v_object;
        return v_object.getField6();
    }

    public static final SubLObject htfile_object_entry_data_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, HTFILE_OBJECT_ENTRY_P);
        return v_object.getField7();
    }

    public static SubLObject htfile_object_entry_data(final SubLObject v_object) {
        assert NIL != htfile_object_entry_p(v_object) : "! file_hash_table.htfile_object_entry_p(v_object) " + "file_hash_table.htfile_object_entry_p error :" + v_object;
        return v_object.getField7();
    }

    public static final SubLObject _csetf_htfile_object_entry_size_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, HTFILE_OBJECT_ENTRY_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_htfile_object_entry_size(final SubLObject v_object, final SubLObject value) {
        assert NIL != htfile_object_entry_p(v_object) : "! file_hash_table.htfile_object_entry_p(v_object) " + "file_hash_table.htfile_object_entry_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_htfile_object_entry_type_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, HTFILE_OBJECT_ENTRY_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_htfile_object_entry_type(final SubLObject v_object, final SubLObject value) {
        assert NIL != htfile_object_entry_p(v_object) : "! file_hash_table.htfile_object_entry_p(v_object) " + "file_hash_table.htfile_object_entry_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_htfile_object_entry_key_size_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, HTFILE_OBJECT_ENTRY_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_htfile_object_entry_key_size(final SubLObject v_object, final SubLObject value) {
        assert NIL != htfile_object_entry_p(v_object) : "! file_hash_table.htfile_object_entry_p(v_object) " + "file_hash_table.htfile_object_entry_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_htfile_object_entry_key_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, HTFILE_OBJECT_ENTRY_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_htfile_object_entry_key(final SubLObject v_object, final SubLObject value) {
        assert NIL != htfile_object_entry_p(v_object) : "! file_hash_table.htfile_object_entry_p(v_object) " + "file_hash_table.htfile_object_entry_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_htfile_object_entry_data_size_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, HTFILE_OBJECT_ENTRY_P);
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_htfile_object_entry_data_size(final SubLObject v_object, final SubLObject value) {
        assert NIL != htfile_object_entry_p(v_object) : "! file_hash_table.htfile_object_entry_p(v_object) " + "file_hash_table.htfile_object_entry_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static final SubLObject _csetf_htfile_object_entry_data_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, HTFILE_OBJECT_ENTRY_P);
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_htfile_object_entry_data(final SubLObject v_object, final SubLObject value) {
        assert NIL != htfile_object_entry_p(v_object) : "! file_hash_table.htfile_object_entry_p(v_object) " + "file_hash_table.htfile_object_entry_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static final SubLObject make_htfile_object_entry_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.file_hash_table.$htfile_object_entry_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($SIZE)) {
                        _csetf_htfile_object_entry_size(v_new, current_value);
                    } else {
                        if (pcase_var.eql($TYPE)) {
                            _csetf_htfile_object_entry_type(v_new, current_value);
                        } else {
                            if (pcase_var.eql($KEY_SIZE)) {
                                _csetf_htfile_object_entry_key_size(v_new, current_value);
                            } else {
                                if (pcase_var.eql($KEY)) {
                                    _csetf_htfile_object_entry_key(v_new, current_value);
                                } else {
                                    if (pcase_var.eql($DATA_SIZE)) {
                                        _csetf_htfile_object_entry_data_size(v_new, current_value);
                                    } else {
                                        if (pcase_var.eql($DATA)) {
                                            _csetf_htfile_object_entry_data(v_new, current_value);
                                        } else {
                                            Errors.error($str_alt47$Invalid_slot__S_for_construction_, current_arg);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_htfile_object_entry(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.file_hash_table.$htfile_object_entry_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($SIZE)) {
                _csetf_htfile_object_entry_size(v_new, current_value);
            } else
                if (pcase_var.eql($TYPE)) {
                    _csetf_htfile_object_entry_type(v_new, current_value);
                } else
                    if (pcase_var.eql($KEY_SIZE)) {
                        _csetf_htfile_object_entry_key_size(v_new, current_value);
                    } else
                        if (pcase_var.eql($KEY)) {
                            _csetf_htfile_object_entry_key(v_new, current_value);
                        } else
                            if (pcase_var.eql($DATA_SIZE)) {
                                _csetf_htfile_object_entry_data_size(v_new, current_value);
                            } else
                                if (pcase_var.eql($DATA)) {
                                    _csetf_htfile_object_entry_data(v_new, current_value);
                                } else {
                                    Errors.error($str48$Invalid_slot__S_for_construction_, current_arg);
                                }





        }
        return v_new;
    }

    public static SubLObject visit_defstruct_htfile_object_entry(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_HTFILE_OBJECT_ENTRY, SIX_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $SIZE, htfile_object_entry_size(obj));
        funcall(visitor_fn, obj, $SLOT, $TYPE, htfile_object_entry_type(obj));
        funcall(visitor_fn, obj, $SLOT, $KEY_SIZE, htfile_object_entry_key_size(obj));
        funcall(visitor_fn, obj, $SLOT, $KEY, htfile_object_entry_key(obj));
        funcall(visitor_fn, obj, $SLOT, $DATA_SIZE, htfile_object_entry_data_size(obj));
        funcall(visitor_fn, obj, $SLOT, $DATA, htfile_object_entry_data(obj));
        funcall(visitor_fn, obj, $END, MAKE_HTFILE_OBJECT_ENTRY, SIX_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_htfile_object_entry_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_htfile_object_entry(obj, visitor_fn);
    }

    public static final SubLObject htfile_key_entry_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject htfile_key_entry_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject htfile_key_entry_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.file_hash_table.$htfile_key_entry_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject htfile_key_entry_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.file_hash_table.$htfile_key_entry_native.class ? T : NIL;
    }

    public static final SubLObject htfile_key_entry_key_offset_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, HTFILE_KEY_ENTRY_P);
        return v_object.getField2();
    }

    public static SubLObject htfile_key_entry_key_offset(final SubLObject v_object) {
        assert NIL != htfile_key_entry_p(v_object) : "! file_hash_table.htfile_key_entry_p(v_object) " + "file_hash_table.htfile_key_entry_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject htfile_key_entry_hash_code_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, HTFILE_KEY_ENTRY_P);
        return v_object.getField3();
    }

    public static SubLObject htfile_key_entry_hash_code(final SubLObject v_object) {
        assert NIL != htfile_key_entry_p(v_object) : "! file_hash_table.htfile_key_entry_p(v_object) " + "file_hash_table.htfile_key_entry_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject _csetf_htfile_key_entry_key_offset_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, HTFILE_KEY_ENTRY_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_htfile_key_entry_key_offset(final SubLObject v_object, final SubLObject value) {
        assert NIL != htfile_key_entry_p(v_object) : "! file_hash_table.htfile_key_entry_p(v_object) " + "file_hash_table.htfile_key_entry_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_htfile_key_entry_hash_code_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, HTFILE_KEY_ENTRY_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_htfile_key_entry_hash_code(final SubLObject v_object, final SubLObject value) {
        assert NIL != htfile_key_entry_p(v_object) : "! file_hash_table.htfile_key_entry_p(v_object) " + "file_hash_table.htfile_key_entry_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject make_htfile_key_entry_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.file_hash_table.$htfile_key_entry_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($KEY_OFFSET)) {
                        _csetf_htfile_key_entry_key_offset(v_new, current_value);
                    } else {
                        if (pcase_var.eql($HASH_CODE)) {
                            _csetf_htfile_key_entry_hash_code(v_new, current_value);
                        } else {
                            Errors.error($str_alt47$Invalid_slot__S_for_construction_, current_arg);
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_htfile_key_entry(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.file_hash_table.$htfile_key_entry_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($KEY_OFFSET)) {
                _csetf_htfile_key_entry_key_offset(v_new, current_value);
            } else
                if (pcase_var.eql($HASH_CODE)) {
                    _csetf_htfile_key_entry_hash_code(v_new, current_value);
                } else {
                    Errors.error($str48$Invalid_slot__S_for_construction_, current_arg);
                }

        }
        return v_new;
    }

    public static SubLObject visit_defstruct_htfile_key_entry(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_HTFILE_KEY_ENTRY, TWO_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $KEY_OFFSET, htfile_key_entry_key_offset(obj));
        funcall(visitor_fn, obj, $SLOT, $HASH_CODE, htfile_key_entry_hash_code(obj));
        funcall(visitor_fn, obj, $END, MAKE_HTFILE_KEY_ENTRY, TWO_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_htfile_key_entry_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_htfile_key_entry(obj, visitor_fn);
    }

    public static final SubLObject get_default_fht_test_function_alt() {
        return $default_fht_test_function$.getGlobalValue();
    }

    public static SubLObject get_default_fht_test_function() {
        return $default_fht_test_function$.getGlobalValue();
    }

    public static final SubLObject get_default_fht_serialization_protocol_alt() {
        return $default_fht_serialization_protocol$.getGlobalValue();
    }

    public static SubLObject get_default_fht_serialization_protocol() {
        return $default_fht_serialization_protocol$.getGlobalValue();
    }

    public static final SubLObject new_htfile_header_alt() {
        {
            SubLObject header = make_htfile_header(UNPROVIDED);
            _csetf_htfile_header_version_major(header, $htfile_header_current_vmajor$.getGlobalValue());
            _csetf_htfile_header_version_minor(header, $htfile_header_current_vminor$.getGlobalValue());
            return header;
        }
    }

    public static SubLObject new_htfile_header() {
        final SubLObject header = make_htfile_header(UNPROVIDED);
        _csetf_htfile_header_version_major(header, $htfile_header_current_vmajor$.getGlobalValue());
        _csetf_htfile_header_version_minor(header, $htfile_header_current_vminor$.getGlobalValue());
        return header;
    }

    public static final SubLObject construct_empty_htfile_header_alt(SubLObject expected_items, SubLObject avg_size) {
        if (avg_size == UNPROVIDED) {
            avg_size = $htfile_default_average_size$.getGlobalValue();
        }
        {
            SubLObject avg_implementation_size = htfile_scale_user_space_to_implementation_space(avg_size);
            SubLObject header = new_htfile_header();
            _csetf_htfile_header_size(header, $htfile_header_current_size$.getGlobalValue());
            _csetf_htfile_header_item_count(header, ZERO_INTEGER);
            _csetf_htfile_header_capacity(header, fht_ensure_hash_table_size(expected_items));
            _csetf_htfile_header_free_list_head(header, ZERO_INTEGER);
            _csetf_htfile_header_deletion_count(header, ZERO_INTEGER);
            _csetf_htfile_header_header_crc(header, ZERO_INTEGER);
            _csetf_htfile_header_extension_space_size(header, ZERO_INTEGER);
            _csetf_htfile_header_extension_space(header, ZERO_INTEGER);
            {
                SubLObject size = $htfile_header_current_size$.getGlobalValue();
                SubLObject heap_space = multiply(expected_items, avg_implementation_size);
                size = add(size, htfile_header_extension_space_size(header));
                _csetf_htfile_header_object_space_offset(header, size);
                _csetf_htfile_header_current_heap_top(header, size);
                _csetf_htfile_header_key_space_offset(header, add(size, heap_space));
            }
            return header;
        }
    }

    public static SubLObject construct_empty_htfile_header(final SubLObject expected_items, SubLObject avg_size) {
        if (avg_size == UNPROVIDED) {
            avg_size = $htfile_default_average_size$.getGlobalValue();
        }
        final SubLObject avg_implementation_size = htfile_scale_user_space_to_implementation_space(avg_size);
        final SubLObject header = new_htfile_header();
        _csetf_htfile_header_size(header, $htfile_header_current_size$.getGlobalValue());
        _csetf_htfile_header_item_count(header, ZERO_INTEGER);
        _csetf_htfile_header_capacity(header, fht_ensure_hash_table_size(expected_items));
        _csetf_htfile_header_free_list_head(header, ZERO_INTEGER);
        _csetf_htfile_header_deletion_count(header, ZERO_INTEGER);
        _csetf_htfile_header_header_crc(header, ZERO_INTEGER);
        _csetf_htfile_header_extension_space_size(header, ZERO_INTEGER);
        _csetf_htfile_header_extension_space(header, ZERO_INTEGER);
        SubLObject size = $htfile_header_current_size$.getGlobalValue();
        final SubLObject heap_space = multiply(expected_items, avg_implementation_size);
        size = add(size, htfile_header_extension_space_size(header));
        _csetf_htfile_header_object_space_offset(header, size);
        _csetf_htfile_header_current_heap_top(header, size);
        _csetf_htfile_header_key_space_offset(header, add(size, heap_space));
        return header;
    }

    public static final SubLObject htfile_scale_user_space_to_implementation_space_alt(SubLObject avg_size) {
        return add(htfile_minimal_space_required(), avg_size);
    }

    public static SubLObject htfile_scale_user_space_to_implementation_space(final SubLObject avg_size) {
        return add(htfile_minimal_space_required(), avg_size);
    }

    public static final SubLObject htfile_minimal_space_required_alt() {
        return add(htfile_minimal_space_required_for_key(), htfile_minimal_space_required_for_object());
    }

    public static SubLObject htfile_minimal_space_required() {
        return add(htfile_minimal_space_required_for_key(), htfile_minimal_space_required_for_object());
    }

    public static final SubLObject new_file_hash_table_alt(SubLObject encoding_input_fn, SubLObject encoding_output_fn, SubLObject encoding_size_fn, SubLObject encoding_key_input_fn, SubLObject encoding_key_output_fn, SubLObject cachedP, SubLObject testfn, SubLObject hash_fn) {
        if (cachedP == UNPROVIDED) {
            cachedP = $fht_min_cache_capacity$.getDynamicValue();
        }
        if (testfn == UNPROVIDED) {
            testfn = $default_fht_test_function$.getGlobalValue();
        }
        if (hash_fn == UNPROVIDED) {
            hash_fn = SXHASH;
        }
        {
            SubLObject fht = make_file_hash_table(UNPROVIDED);
            _csetf_file_hash_table_stream(fht, NIL);
            _csetf_file_hash_table_header(fht, NIL);
            _csetf_file_hash_table_lock(fht, make_lock($$$File_Hash_Table_Lock));
            _csetf_file_hash_table_encoding_input_fn(fht, encoding_input_fn);
            _csetf_file_hash_table_encoding_output_fn(fht, encoding_output_fn);
            _csetf_file_hash_table_encoding_size_fn(fht, encoding_size_fn);
            _csetf_file_hash_table_testfn(fht, testfn);
            _csetf_file_hash_table_hash_fn(fht, hash_fn);
            _csetf_file_hash_table_encoding_key_input_fn(fht, encoding_key_input_fn);
            _csetf_file_hash_table_encoding_key_output_fn(fht, encoding_key_output_fn);
            if (NIL != cachedP) {
                allocate_file_hash_table_caches(fht, cachedP);
            }
            return fht;
        }
    }

    public static SubLObject new_file_hash_table(final SubLObject encoding_input_fn, final SubLObject encoding_output_fn, final SubLObject encoding_size_fn, final SubLObject encoding_key_input_fn, final SubLObject encoding_key_output_fn, SubLObject cachedP, SubLObject testfn, SubLObject hash_fn) {
        if (cachedP == UNPROVIDED) {
            cachedP = $fht_min_cache_capacity$.getDynamicValue();
        }
        if (testfn == UNPROVIDED) {
            testfn = $default_fht_test_function$.getGlobalValue();
        }
        if (hash_fn == UNPROVIDED) {
            hash_fn = SXHASH;
        }
        final SubLObject fht = make_file_hash_table(UNPROVIDED);
        _csetf_file_hash_table_stream(fht, NIL);
        _csetf_file_hash_table_header(fht, NIL);
        _csetf_file_hash_table_lock(fht, make_lock($$$File_Hash_Table_Lock));
        _csetf_file_hash_table_encoding_input_fn(fht, encoding_input_fn);
        _csetf_file_hash_table_encoding_output_fn(fht, encoding_output_fn);
        _csetf_file_hash_table_encoding_size_fn(fht, encoding_size_fn);
        _csetf_file_hash_table_testfn(fht, testfn);
        _csetf_file_hash_table_hash_fn(fht, hash_fn);
        _csetf_file_hash_table_encoding_key_input_fn(fht, encoding_key_input_fn);
        _csetf_file_hash_table_encoding_key_output_fn(fht, encoding_key_output_fn);
        if (NIL != cachedP) {
            allocate_file_hash_table_caches(fht, cachedP);
        }
        return fht;
    }

    public static final SubLObject new_empty_file_hash_table_alt(SubLObject size, SubLObject encoding_input_fn, SubLObject encoding_output_fn, SubLObject encoding_size_fn, SubLObject encoding_key_input_fn, SubLObject encoding_key_output_fn, SubLObject cachedP, SubLObject avg_size, SubLObject testfn, SubLObject hash_fn) {
        if (cachedP == UNPROVIDED) {
            cachedP = $fht_min_cache_capacity$.getDynamicValue();
        }
        if (avg_size == UNPROVIDED) {
            avg_size = $htfile_default_average_size$.getGlobalValue();
        }
        if (testfn == UNPROVIDED) {
            testfn = $default_fht_test_function$.getGlobalValue();
        }
        if (hash_fn == UNPROVIDED) {
            hash_fn = SXHASH;
        }
        {
            SubLObject fht = new_file_hash_table(encoding_input_fn, encoding_output_fn, encoding_size_fn, encoding_key_input_fn, encoding_key_output_fn, cachedP, testfn, hash_fn);
            _csetf_file_hash_table_header(fht, construct_empty_htfile_header(size, avg_size));
            return fht;
        }
    }

    public static SubLObject new_empty_file_hash_table(final SubLObject size, final SubLObject encoding_input_fn, final SubLObject encoding_output_fn, final SubLObject encoding_size_fn, final SubLObject encoding_key_input_fn, final SubLObject encoding_key_output_fn, SubLObject cachedP, SubLObject avg_size, SubLObject testfn, SubLObject hash_fn) {
        if (cachedP == UNPROVIDED) {
            cachedP = $fht_min_cache_capacity$.getDynamicValue();
        }
        if (avg_size == UNPROVIDED) {
            avg_size = $htfile_default_average_size$.getGlobalValue();
        }
        if (testfn == UNPROVIDED) {
            testfn = $default_fht_test_function$.getGlobalValue();
        }
        if (hash_fn == UNPROVIDED) {
            hash_fn = SXHASH;
        }
        final SubLObject fht = new_file_hash_table(encoding_input_fn, encoding_output_fn, encoding_size_fn, encoding_key_input_fn, encoding_key_output_fn, cachedP, testfn, hash_fn);
        _csetf_file_hash_table_header(fht, construct_empty_htfile_header(size, avg_size));
        return fht;
    }

    public static final SubLObject new_htfile_key_entry_alt(SubLObject code, SubLObject offset) {
        if (offset == UNPROVIDED) {
            offset = ZERO_INTEGER;
        }
        {
            SubLObject entry = make_htfile_key_entry(UNPROVIDED);
            _csetf_htfile_key_entry_key_offset(entry, offset);
            _csetf_htfile_key_entry_hash_code(entry, code);
            return entry;
        }
    }

    public static SubLObject new_htfile_key_entry(final SubLObject code, SubLObject offset) {
        if (offset == UNPROVIDED) {
            offset = ZERO_INTEGER;
        }
        final SubLObject entry = make_htfile_key_entry(UNPROVIDED);
        _csetf_htfile_key_entry_key_offset(entry, offset);
        _csetf_htfile_key_entry_hash_code(entry, code);
        return entry;
    }

    public static final SubLObject construct_tombstone_key_entry_alt() {
        return new_htfile_key_entry($fht_invalid_hash_code$.getGlobalValue(), $fht_tombstone_offset_marker$.getGlobalValue());
    }

    public static SubLObject construct_tombstone_key_entry() {
        return new_htfile_key_entry($fht_invalid_hash_code$.getGlobalValue(), $fht_tombstone_offset_marker$.getGlobalValue());
    }

    public static final SubLObject is_tombstoned_key_entryP_alt(SubLObject entry) {
        return equalp(entry, $fht_tombstone_key_entry$.getGlobalValue());
    }

    public static SubLObject is_tombstoned_key_entryP(final SubLObject entry) {
        return equalp(entry, $fht_tombstone_key_entry$.getGlobalValue());
    }

    public static final SubLObject construct_empty_key_entry_alt() {
        return new_htfile_key_entry($fht_invalid_hash_code$.getGlobalValue(), $fht_empty_offset_marker$.getGlobalValue());
    }

    public static SubLObject construct_empty_key_entry() {
        return new_htfile_key_entry($fht_invalid_hash_code$.getGlobalValue(), $fht_empty_offset_marker$.getGlobalValue());
    }

    public static final SubLObject is_empty_key_entryP_alt(SubLObject entry) {
        return equalp(entry, $fht_empty_key_entry$.getGlobalValue());
    }

    public static SubLObject is_empty_key_entryP(final SubLObject entry) {
        return equalp(entry, $fht_empty_key_entry$.getGlobalValue());
    }

    public static final SubLObject is_valid_key_entryP_alt(SubLObject entry, SubLObject fht) {
        return makeBoolean((NIL != is_empty_key_entryP(entry)) || ((NIL != valid_hash_code_p(htfile_key_entry_hash_code(entry))) && (NIL != valid_fht_heap_offset_p(htfile_key_entry_key_offset(entry), fht))));
    }

    public static SubLObject is_valid_key_entryP(final SubLObject entry, final SubLObject fht) {
        return makeBoolean((NIL != is_empty_key_entryP(entry)) || ((NIL != valid_hash_code_p(htfile_key_entry_hash_code(entry))) && (NIL != valid_fht_heap_offset_p(htfile_key_entry_key_offset(entry), fht))));
    }

    public static final SubLObject fht_sxhash_for_fht_alt(SubLObject fht, SubLObject entity) {
        {
            SubLObject hash_fn = file_hash_table_hash_fn(fht);
            return fht_sxhash(entity, hash_fn);
        }
    }

    public static SubLObject fht_sxhash_for_fht(final SubLObject fht, final SubLObject entity) {
        final SubLObject hash_fn = file_hash_table_hash_fn(fht);
        return fht_sxhash(entity, hash_fn);
    }

    public static final SubLObject fht_sxhash_alt(SubLObject entity, SubLObject hash_fn) {
        {
            SubLObject code = funcall(hash_fn, entity);
            return code;
        }
    }

    public static SubLObject fht_sxhash(final SubLObject entity, final SubLObject hash_fn) {
        final SubLObject code = abs(funcall(hash_fn, entity));
        if (NIL == valid_hash_code_p(code)) {
            Errors.warn($str170$Sorry___A_hashed_to__A__which_is_, entity, code);
        }
        return code;
    }

    public static final SubLObject valid_hash_code_p_alt(SubLObject code) {
        return fixnump(code);
    }

    public static SubLObject valid_hash_code_p(final SubLObject code) {
        return makeBoolean((NIL != subl_promotions.non_negative_integer_p(code)) && code.numL($max_fht_hash_code_value$.getGlobalValue()));
    }

    public static final SubLObject new_object_entry_alt(SubLObject key, SubLObject v_object) {
        {
            SubLObject object_entry = make_htfile_object_entry(UNPROVIDED);
            _csetf_htfile_object_entry_key(object_entry, key);
            _csetf_htfile_object_entry_data(object_entry, v_object);
            return object_entry;
        }
    }

    public static SubLObject new_object_entry(final SubLObject key, final SubLObject v_object) {
        final SubLObject object_entry = make_htfile_object_entry(UNPROVIDED);
        _csetf_htfile_object_entry_key(object_entry, key);
        _csetf_htfile_object_entry_data(object_entry, v_object);
        return object_entry;
    }

    public static final SubLObject fht_serialization_entry_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        print_fht_serialization_entry(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject fht_serialization_entry_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_fht_serialization_entry(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject fht_serialization_entry_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.file_hash_table.$fht_serialization_entry_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject fht_serialization_entry_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.file_hash_table.$fht_serialization_entry_native.class ? T : NIL;
    }

    public static final SubLObject fht_se_encoding_input_fn_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, FHT_SERIALIZATION_ENTRY_P);
        return v_object.getField2();
    }

    public static SubLObject fht_se_encoding_input_fn(final SubLObject v_object) {
        assert NIL != fht_serialization_entry_p(v_object) : "! file_hash_table.fht_serialization_entry_p(v_object) " + "file_hash_table.fht_serialization_entry_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject fht_se_encoding_output_fn_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, FHT_SERIALIZATION_ENTRY_P);
        return v_object.getField3();
    }

    public static SubLObject fht_se_encoding_output_fn(final SubLObject v_object) {
        assert NIL != fht_serialization_entry_p(v_object) : "! file_hash_table.fht_serialization_entry_p(v_object) " + "file_hash_table.fht_serialization_entry_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject fht_se_encoding_size_fn_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, FHT_SERIALIZATION_ENTRY_P);
        return v_object.getField4();
    }

    public static SubLObject fht_se_encoding_size_fn(final SubLObject v_object) {
        assert NIL != fht_serialization_entry_p(v_object) : "! file_hash_table.fht_serialization_entry_p(v_object) " + "file_hash_table.fht_serialization_entry_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject fht_se_hash_fn_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, FHT_SERIALIZATION_ENTRY_P);
        return v_object.getField5();
    }

    public static SubLObject fht_se_hash_fn(final SubLObject v_object) {
        assert NIL != fht_serialization_entry_p(v_object) : "! file_hash_table.fht_serialization_entry_p(v_object) " + "file_hash_table.fht_serialization_entry_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject fht_se_encoding_key_input_fn_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, FHT_SERIALIZATION_ENTRY_P);
        return v_object.getField6();
    }

    public static SubLObject fht_se_encoding_key_input_fn(final SubLObject v_object) {
        assert NIL != fht_serialization_entry_p(v_object) : "! file_hash_table.fht_serialization_entry_p(v_object) " + "file_hash_table.fht_serialization_entry_p error :" + v_object;
        return v_object.getField6();
    }

    public static final SubLObject fht_se_encoding_key_output_fn_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, FHT_SERIALIZATION_ENTRY_P);
        return v_object.getField7();
    }

    public static SubLObject fht_se_encoding_key_output_fn(final SubLObject v_object) {
        assert NIL != fht_serialization_entry_p(v_object) : "! file_hash_table.fht_serialization_entry_p(v_object) " + "file_hash_table.fht_serialization_entry_p error :" + v_object;
        return v_object.getField7();
    }

    public static final SubLObject _csetf_fht_se_encoding_input_fn_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, FHT_SERIALIZATION_ENTRY_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_fht_se_encoding_input_fn(final SubLObject v_object, final SubLObject value) {
        assert NIL != fht_serialization_entry_p(v_object) : "! file_hash_table.fht_serialization_entry_p(v_object) " + "file_hash_table.fht_serialization_entry_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_fht_se_encoding_output_fn_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, FHT_SERIALIZATION_ENTRY_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_fht_se_encoding_output_fn(final SubLObject v_object, final SubLObject value) {
        assert NIL != fht_serialization_entry_p(v_object) : "! file_hash_table.fht_serialization_entry_p(v_object) " + "file_hash_table.fht_serialization_entry_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_fht_se_encoding_size_fn_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, FHT_SERIALIZATION_ENTRY_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_fht_se_encoding_size_fn(final SubLObject v_object, final SubLObject value) {
        assert NIL != fht_serialization_entry_p(v_object) : "! file_hash_table.fht_serialization_entry_p(v_object) " + "file_hash_table.fht_serialization_entry_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_fht_se_hash_fn_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, FHT_SERIALIZATION_ENTRY_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_fht_se_hash_fn(final SubLObject v_object, final SubLObject value) {
        assert NIL != fht_serialization_entry_p(v_object) : "! file_hash_table.fht_serialization_entry_p(v_object) " + "file_hash_table.fht_serialization_entry_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_fht_se_encoding_key_input_fn_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, FHT_SERIALIZATION_ENTRY_P);
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_fht_se_encoding_key_input_fn(final SubLObject v_object, final SubLObject value) {
        assert NIL != fht_serialization_entry_p(v_object) : "! file_hash_table.fht_serialization_entry_p(v_object) " + "file_hash_table.fht_serialization_entry_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static final SubLObject _csetf_fht_se_encoding_key_output_fn_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, FHT_SERIALIZATION_ENTRY_P);
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_fht_se_encoding_key_output_fn(final SubLObject v_object, final SubLObject value) {
        assert NIL != fht_serialization_entry_p(v_object) : "! file_hash_table.fht_serialization_entry_p(v_object) " + "file_hash_table.fht_serialization_entry_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static final SubLObject make_fht_serialization_entry_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.file_hash_table.$fht_serialization_entry_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($ENCODING_INPUT_FN)) {
                        _csetf_fht_se_encoding_input_fn(v_new, current_value);
                    } else {
                        if (pcase_var.eql($ENCODING_OUTPUT_FN)) {
                            _csetf_fht_se_encoding_output_fn(v_new, current_value);
                        } else {
                            if (pcase_var.eql($ENCODING_SIZE_FN)) {
                                _csetf_fht_se_encoding_size_fn(v_new, current_value);
                            } else {
                                if (pcase_var.eql($HASH_FN)) {
                                    _csetf_fht_se_hash_fn(v_new, current_value);
                                } else {
                                    if (pcase_var.eql($ENCODING_KEY_INPUT_FN)) {
                                        _csetf_fht_se_encoding_key_input_fn(v_new, current_value);
                                    } else {
                                        if (pcase_var.eql($ENCODING_KEY_OUTPUT_FN)) {
                                            _csetf_fht_se_encoding_key_output_fn(v_new, current_value);
                                        } else {
                                            Errors.error($str_alt47$Invalid_slot__S_for_construction_, current_arg);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_fht_serialization_entry(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.file_hash_table.$fht_serialization_entry_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($ENCODING_INPUT_FN)) {
                _csetf_fht_se_encoding_input_fn(v_new, current_value);
            } else
                if (pcase_var.eql($ENCODING_OUTPUT_FN)) {
                    _csetf_fht_se_encoding_output_fn(v_new, current_value);
                } else
                    if (pcase_var.eql($ENCODING_SIZE_FN)) {
                        _csetf_fht_se_encoding_size_fn(v_new, current_value);
                    } else
                        if (pcase_var.eql($HASH_FN)) {
                            _csetf_fht_se_hash_fn(v_new, current_value);
                        } else
                            if (pcase_var.eql($ENCODING_KEY_INPUT_FN)) {
                                _csetf_fht_se_encoding_key_input_fn(v_new, current_value);
                            } else
                                if (pcase_var.eql($ENCODING_KEY_OUTPUT_FN)) {
                                    _csetf_fht_se_encoding_key_output_fn(v_new, current_value);
                                } else {
                                    Errors.error($str48$Invalid_slot__S_for_construction_, current_arg);
                                }





        }
        return v_new;
    }

    public static SubLObject visit_defstruct_fht_serialization_entry(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_FHT_SERIALIZATION_ENTRY, SIX_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $ENCODING_INPUT_FN, fht_se_encoding_input_fn(obj));
        funcall(visitor_fn, obj, $SLOT, $ENCODING_OUTPUT_FN, fht_se_encoding_output_fn(obj));
        funcall(visitor_fn, obj, $SLOT, $ENCODING_SIZE_FN, fht_se_encoding_size_fn(obj));
        funcall(visitor_fn, obj, $SLOT, $HASH_FN, fht_se_hash_fn(obj));
        funcall(visitor_fn, obj, $SLOT, $ENCODING_KEY_INPUT_FN, fht_se_encoding_key_input_fn(obj));
        funcall(visitor_fn, obj, $SLOT, $ENCODING_KEY_OUTPUT_FN, fht_se_encoding_key_output_fn(obj));
        funcall(visitor_fn, obj, $END, MAKE_FHT_SERIALIZATION_ENTRY, SIX_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_fht_serialization_entry_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_fht_serialization_entry(obj, visitor_fn);
    }

    public static final SubLObject print_fht_serialization_entry_alt(SubLObject serialization_entry, SubLObject stream, SubLObject depth) {
        format(stream, $str_alt175$__FHT_Serialization__Input_Fn____, fht_se_encoding_input_fn(serialization_entry));
        format(stream, $str_alt176$_____________________Output_Fn___, fht_se_encoding_output_fn(serialization_entry));
        format(stream, $str_alt177$_____________________Size_Fn_____, fht_se_encoding_size_fn(serialization_entry));
        format(stream, $str_alt178$_____________________Hash_Fn_____, fht_se_hash_fn(serialization_entry));
        if (!((IDENTITY == fht_se_encoding_key_input_fn(serialization_entry)) || (symbol_function(IDENTITY) == fht_se_encoding_key_input_fn(serialization_entry)))) {
            format(stream, $str_alt179$_____________________Key_Input___, fht_se_encoding_key_input_fn(serialization_entry));
        }
        if (!((IDENTITY == fht_se_encoding_key_output_fn(serialization_entry)) || (symbol_function(IDENTITY) == fht_se_encoding_key_output_fn(serialization_entry)))) {
            format(stream, $str_alt180$_____________________Key_Output__, fht_se_encoding_key_output_fn(serialization_entry));
        }
        write_string($str_alt181$_, stream, UNPROVIDED, UNPROVIDED);
        return serialization_entry;
    }

    public static SubLObject print_fht_serialization_entry(final SubLObject serialization_entry, final SubLObject stream, final SubLObject depth) {
        format(stream, $str195$__FHT_Serialization__Input_Fn____, fht_se_encoding_input_fn(serialization_entry));
        format(stream, $str196$_____________________Output_Fn___, fht_se_encoding_output_fn(serialization_entry));
        format(stream, $str197$_____________________Size_Fn_____, fht_se_encoding_size_fn(serialization_entry));
        format(stream, $str198$_____________________Hash_Fn_____, fht_se_hash_fn(serialization_entry));
        if ((IDENTITY != fht_se_encoding_key_input_fn(serialization_entry)) && (!symbol_function(IDENTITY).eql(fht_se_encoding_key_input_fn(serialization_entry)))) {
            format(stream, $str199$_____________________Key_Input___, fht_se_encoding_key_input_fn(serialization_entry));
        }
        if ((IDENTITY != fht_se_encoding_key_output_fn(serialization_entry)) && (!symbol_function(IDENTITY).eql(fht_se_encoding_key_output_fn(serialization_entry)))) {
            format(stream, $str200$_____________________Key_Output__, fht_se_encoding_key_output_fn(serialization_entry));
        }
        write_string($str201$_, stream, UNPROVIDED, UNPROVIDED);
        return serialization_entry;
    }

    public static final SubLObject new_fht_serialization_entry_alt(SubLObject plist) {
        {
            SubLObject serialization_entry = make_fht_serialization_entry(UNPROVIDED);
            SubLObject input_fn = getf(plist, $ENCODING_INPUT_FN, UNPROVIDED);
            SubLObject output_fn = getf(plist, $ENCODING_OUTPUT_FN, UNPROVIDED);
            SubLObject size_fn = getf(plist, $ENCODING_SIZE_FN, UNPROVIDED);
            SubLObject hash_fn = getf(plist, $HASH_FN, UNPROVIDED);
            SubLObject key_input_fn = getf(plist, $ENCODING_KEY_INPUT_FN, IDENTITY);
            SubLObject key_output_fn = getf(plist, $ENCODING_KEY_OUTPUT_FN, IDENTITY);
            _csetf_fht_se_encoding_input_fn(serialization_entry, input_fn);
            _csetf_fht_se_encoding_output_fn(serialization_entry, output_fn);
            _csetf_fht_se_encoding_size_fn(serialization_entry, size_fn);
            _csetf_fht_se_hash_fn(serialization_entry, hash_fn);
            _csetf_fht_se_encoding_key_input_fn(serialization_entry, key_input_fn);
            _csetf_fht_se_encoding_key_output_fn(serialization_entry, key_output_fn);
            return serialization_entry;
        }
    }

    public static SubLObject new_fht_serialization_entry(final SubLObject plist) {
        final SubLObject serialization_entry = make_fht_serialization_entry(UNPROVIDED);
        final SubLObject input_fn = getf(plist, $ENCODING_INPUT_FN, UNPROVIDED);
        final SubLObject output_fn = getf(plist, $ENCODING_OUTPUT_FN, UNPROVIDED);
        final SubLObject size_fn = getf(plist, $ENCODING_SIZE_FN, UNPROVIDED);
        final SubLObject hash_fn = getf(plist, $HASH_FN, UNPROVIDED);
        final SubLObject key_input_fn = getf(plist, $ENCODING_KEY_INPUT_FN, IDENTITY);
        final SubLObject key_output_fn = getf(plist, $ENCODING_KEY_OUTPUT_FN, IDENTITY);
        _csetf_fht_se_encoding_input_fn(serialization_entry, input_fn);
        _csetf_fht_se_encoding_output_fn(serialization_entry, output_fn);
        _csetf_fht_se_encoding_size_fn(serialization_entry, size_fn);
        _csetf_fht_se_hash_fn(serialization_entry, hash_fn);
        _csetf_fht_se_encoding_key_input_fn(serialization_entry, key_input_fn);
        _csetf_fht_se_encoding_key_output_fn(serialization_entry, key_output_fn);
        return serialization_entry;
    }

    public static final SubLObject register_fht_serialization_entry_alt(SubLObject serialization, SubLObject plist) {
        {
            SubLObject serialization_entry = new_fht_serialization_entry(plist);
            dictionary.dictionary_enter($fht_serialization_table$.getGlobalValue(), serialization, serialization_entry);
            return serialization_entry;
        }
    }

    public static SubLObject register_fht_serialization_entry(final SubLObject serialization, final SubLObject plist) {
        final SubLObject serialization_entry = new_fht_serialization_entry(plist);
        dictionary.dictionary_enter($fht_serialization_table$.getGlobalValue(), serialization, serialization_entry);
        return serialization_entry;
    }

    public static final SubLObject fht_serialization_entry_alt(SubLObject serialization) {
        return dictionary.dictionary_lookup($fht_serialization_table$.getGlobalValue(), serialization, UNPROVIDED);
    }

    public static SubLObject fht_serialization_entry(final SubLObject serialization) {
        return dictionary.dictionary_lookup($fht_serialization_table$.getGlobalValue(), serialization, UNPROVIDED);
    }

    public static final SubLObject fht_serialization_encoding_input_fn_alt(SubLObject serialization) {
        {
            SubLObject serialization_entry = fht_serialization_entry(serialization);
            if (NIL != fht_serialization_entry_p(serialization_entry)) {
                return fht_se_encoding_input_fn(serialization_entry);
            }
        }
        return NIL;
    }

    public static SubLObject fht_serialization_encoding_input_fn(final SubLObject serialization) {
        final SubLObject serialization_entry = fht_serialization_entry(serialization);
        if (NIL != fht_serialization_entry_p(serialization_entry)) {
            return fht_se_encoding_input_fn(serialization_entry);
        }
        return NIL;
    }

    public static final SubLObject fht_serialization_encoding_output_fn_alt(SubLObject serialization) {
        {
            SubLObject serialization_entry = fht_serialization_entry(serialization);
            if (NIL != fht_serialization_entry_p(serialization_entry)) {
                return fht_se_encoding_output_fn(serialization_entry);
            }
        }
        return NIL;
    }

    public static SubLObject fht_serialization_encoding_output_fn(final SubLObject serialization) {
        final SubLObject serialization_entry = fht_serialization_entry(serialization);
        if (NIL != fht_serialization_entry_p(serialization_entry)) {
            return fht_se_encoding_output_fn(serialization_entry);
        }
        return NIL;
    }

    public static final SubLObject fht_serialization_encoding_size_fn_alt(SubLObject serialization) {
        {
            SubLObject serialization_entry = fht_serialization_entry(serialization);
            if (NIL != fht_serialization_entry_p(serialization_entry)) {
                return fht_se_encoding_size_fn(serialization_entry);
            }
        }
        return NIL;
    }

    public static SubLObject fht_serialization_encoding_size_fn(final SubLObject serialization) {
        final SubLObject serialization_entry = fht_serialization_entry(serialization);
        if (NIL != fht_serialization_entry_p(serialization_entry)) {
            return fht_se_encoding_size_fn(serialization_entry);
        }
        return NIL;
    }

    public static final SubLObject fht_serialization_hash_fn_alt(SubLObject serialization) {
        {
            SubLObject serialization_entry = fht_serialization_entry(serialization);
            if (NIL != fht_serialization_entry_p(serialization_entry)) {
                return fht_se_hash_fn(serialization_entry);
            }
        }
        return NIL;
    }

    public static SubLObject fht_serialization_hash_fn(final SubLObject serialization) {
        final SubLObject serialization_entry = fht_serialization_entry(serialization);
        if (NIL != fht_serialization_entry_p(serialization_entry)) {
            return fht_se_hash_fn(serialization_entry);
        }
        return NIL;
    }

    public static final SubLObject fht_serialization_encoding_key_input_fn_alt(SubLObject serialization) {
        {
            SubLObject serialization_entry = fht_serialization_entry(serialization);
            if (NIL != fht_serialization_entry_p(serialization_entry)) {
                return fht_se_encoding_key_input_fn(serialization_entry);
            }
        }
        return NIL;
    }

    public static SubLObject fht_serialization_encoding_key_input_fn(final SubLObject serialization) {
        final SubLObject serialization_entry = fht_serialization_entry(serialization);
        if (NIL != fht_serialization_entry_p(serialization_entry)) {
            return fht_se_encoding_key_input_fn(serialization_entry);
        }
        return NIL;
    }

    public static final SubLObject fht_serialization_encoding_key_output_fn_alt(SubLObject serialization) {
        {
            SubLObject serialization_entry = fht_serialization_entry(serialization);
            if (NIL != fht_serialization_entry_p(serialization_entry)) {
                return fht_se_encoding_key_output_fn(serialization_entry);
            }
        }
        return NIL;
    }

    public static SubLObject fht_serialization_encoding_key_output_fn(final SubLObject serialization) {
        final SubLObject serialization_entry = fht_serialization_entry(serialization);
        if (NIL != fht_serialization_entry_p(serialization_entry)) {
            return fht_se_encoding_key_output_fn(serialization_entry);
        }
        return NIL;
    }

    public static final SubLObject do_fht_serializations_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt183);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject serialization = NIL;
                    SubLObject serialization_entry = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt183);
                    serialization = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt183);
                    serialization_entry = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_1 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt183);
                            current_1 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt183);
                            if (NIL == member(current_1, $list_alt184, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_1 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt183);
                        }
                        {
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                return listS(DO_DICTIONARY, list(serialization, serialization_entry, $fht_serialization_table$, done), append(body, NIL));
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject do_fht_serializations(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list203);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject serialization = NIL;
        SubLObject serialization_entry = NIL;
        destructuring_bind_must_consp(current, datum, $list203);
        serialization = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list203);
        serialization_entry = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list203);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list203);
            if (NIL == member(current_$1, $list204, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list203);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return listS(DO_DICTIONARY, list(serialization, serialization_entry, $fht_serialization_table$, done), append(body, NIL));
    }

    /**
     *
     *
     * @return keywordp or NIL; the FHT serialization, if any, that is associated with the given functions
     */
    @LispMethod(comment = "@return keywordp or NIL; the FHT serialization, if any, that is associated with the given functions")
    public static final SubLObject find_fht_serialization_by_functions_alt(SubLObject encoding_input_fn, SubLObject encoding_output_fn, SubLObject encoding_size_fn, SubLObject hash_fn, SubLObject encoding_key_input_fn, SubLObject encoding_key_output_fn) {
        if (encoding_key_input_fn == UNPROVIDED) {
            encoding_key_input_fn = IDENTITY;
        }
        if (encoding_key_output_fn == UNPROVIDED) {
            encoding_key_output_fn = IDENTITY;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject matching_serialization = NIL;
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents($fht_serialization_table$.getGlobalValue()));
                while (!((NIL != matching_serialization) || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state)))) {
                    thread.resetMultipleValues();
                    {
                        SubLObject serialization = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject serialization_entry = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if ((((((encoding_input_fn == fht_se_encoding_input_fn(serialization_entry)) && (encoding_output_fn == fht_se_encoding_output_fn(serialization_entry))) && (encoding_size_fn == fht_se_encoding_size_fn(serialization_entry))) && (hash_fn == fht_se_hash_fn(serialization_entry))) && (encoding_key_input_fn == fht_se_encoding_key_input_fn(serialization_entry))) && (encoding_key_output_fn == fht_se_encoding_key_output_fn(serialization_entry))) {
                            matching_serialization = serialization;
                        }
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                return matching_serialization;
            }
        }
    }

    /**
     *
     *
     * @return keywordp or NIL; the FHT serialization, if any, that is associated with the given functions
     */
    @LispMethod(comment = "@return keywordp or NIL; the FHT serialization, if any, that is associated with the given functions")
    public static SubLObject find_fht_serialization_by_functions(final SubLObject encoding_input_fn, final SubLObject encoding_output_fn, final SubLObject encoding_size_fn, final SubLObject hash_fn, SubLObject encoding_key_input_fn, SubLObject encoding_key_output_fn) {
        if (encoding_key_input_fn == UNPROVIDED) {
            encoding_key_input_fn = IDENTITY;
        }
        if (encoding_key_output_fn == UNPROVIDED) {
            encoding_key_output_fn = IDENTITY;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject matching_serialization;
        SubLObject iteration_state;
        for (matching_serialization = NIL, iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents($fht_serialization_table$.getGlobalValue())); (NIL == matching_serialization) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject serialization = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject serialization_entry = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (((((encoding_input_fn.eql(fht_se_encoding_input_fn(serialization_entry)) && encoding_output_fn.eql(fht_se_encoding_output_fn(serialization_entry))) && encoding_size_fn.eql(fht_se_encoding_size_fn(serialization_entry))) && hash_fn.eql(fht_se_hash_fn(serialization_entry))) && encoding_key_input_fn.eql(fht_se_encoding_key_input_fn(serialization_entry))) && encoding_key_output_fn.eql(fht_se_encoding_key_output_fn(serialization_entry))) {
                matching_serialization = serialization;
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return matching_serialization;
    }

    public static SubLObject log_fht_lookup(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject format_string = NIL;
        destructuring_bind_must_consp(current, datum, $list213);
        format_string = current.first();
        final SubLObject args;
        current = args = current.rest();
        return list(PUNLESS, $list215, listS(FORMAT, $fht_lookup_stream$, format_string, append(args, NIL)));
    }

    public static final SubLObject create_file_hash_table_alt(SubLObject filename, SubLObject size, SubLObject avg_size, SubLObject testfn, SubLObject serialization) {
        if (avg_size == UNPROVIDED) {
            avg_size = $htfile_default_average_size$.getGlobalValue();
        }
        if (testfn == UNPROVIDED) {
            testfn = $default_fht_test_function$.getGlobalValue();
        }
        if (serialization == UNPROVIDED) {
            serialization = $default_fht_serialization_protocol$.getGlobalValue();
        }
        {
            SubLObject fht = new_empty_file_hash_table(size, fht_serialization_encoding_input_fn(serialization), fht_serialization_encoding_output_fn(serialization), fht_serialization_encoding_size_fn(serialization), fht_serialization_encoding_key_input_fn(serialization), fht_serialization_encoding_key_output_fn(serialization), compute_fht_cache_capacity(size), avg_size, testfn, fht_serialization_hash_fn(serialization));
            _csetf_file_hash_table_stream(fht, compatibility.open_binary(filename, $IO, UNPROVIDED));
            write_initial_table(fht);
            return fht;
        }
    }

    public static SubLObject create_file_hash_table(final SubLObject filename, final SubLObject size, SubLObject avg_size, SubLObject testfn, SubLObject serialization) {
        if (avg_size == UNPROVIDED) {
            avg_size = $htfile_default_average_size$.getGlobalValue();
        }
        if (testfn == UNPROVIDED) {
            testfn = $default_fht_test_function$.getGlobalValue();
        }
        if (serialization == UNPROVIDED) {
            serialization = $default_fht_serialization_protocol$.getGlobalValue();
        }
        final SubLObject fht = new_empty_file_hash_table(size, fht_serialization_encoding_input_fn(serialization), fht_serialization_encoding_output_fn(serialization), fht_serialization_encoding_size_fn(serialization), fht_serialization_encoding_key_input_fn(serialization), fht_serialization_encoding_key_output_fn(serialization), compute_fht_cache_capacity(size), avg_size, testfn, fht_serialization_hash_fn(serialization));
        _csetf_file_hash_table_stream(fht, compatibility.open_binary(filename, $IO));
        write_initial_table(fht);
        return fht;
    }

    public static final SubLObject open_file_hash_table_alt(SubLObject filename, SubLObject testfn, SubLObject serialization) {
        if (testfn == UNPROVIDED) {
            testfn = $default_fht_test_function$.getGlobalValue();
        }
        if (serialization == UNPROVIDED) {
            serialization = $default_fht_serialization_protocol$.getGlobalValue();
        }
        {
            SubLObject fht = new_file_hash_table(fht_serialization_encoding_input_fn(serialization), fht_serialization_encoding_output_fn(serialization), fht_serialization_encoding_size_fn(serialization), fht_serialization_encoding_key_input_fn(serialization), fht_serialization_encoding_key_output_fn(serialization), NIL, testfn, fht_serialization_hash_fn(serialization));
            _csetf_file_hash_table_stream(fht, StreamsLow.open(filename, new SubLObject[]{ $DIRECTION, $IO, $IF_EXISTS, $OVERWRITE, $IF_DOES_NOT_EXIST, $ERROR, $ELEMENT_TYPE, $BINARY }));
            _csetf_file_hash_table_header(fht, make_htfile_header(UNPROVIDED));
            read_fht_header(fht);
            allocate_file_hash_table_caches(fht, compute_fht_cache_capacity(file_hash_table_count(fht)));
            return fht;
        }
    }

    public static SubLObject open_file_hash_table(final SubLObject filename, SubLObject testfn, SubLObject serialization) {
        if (testfn == UNPROVIDED) {
            testfn = $default_fht_test_function$.getGlobalValue();
        }
        if (serialization == UNPROVIDED) {
            serialization = $default_fht_serialization_protocol$.getGlobalValue();
        }
        final SubLObject fht = new_file_hash_table(fht_serialization_encoding_input_fn(serialization), fht_serialization_encoding_output_fn(serialization), fht_serialization_encoding_size_fn(serialization), fht_serialization_encoding_key_input_fn(serialization), fht_serialization_encoding_key_output_fn(serialization), NIL, testfn, fht_serialization_hash_fn(serialization));
        _csetf_file_hash_table_stream(fht, StreamsLow.open(filename, new SubLObject[]{ $DIRECTION, $IO, $IF_EXISTS, $OVERWRITE, $IF_DOES_NOT_EXIST, $ERROR, $ELEMENT_TYPE, $BINARY }));
        _csetf_file_hash_table_header(fht, make_htfile_header(UNPROVIDED));
        read_fht_header(fht);
        allocate_file_hash_table_caches(fht, compute_fht_cache_capacity(file_hash_table_count(fht)));
        return fht;
    }

    public static final SubLObject open_file_hash_table_read_only_alt(SubLObject filename, SubLObject testfn, SubLObject serialization) {
        if (testfn == UNPROVIDED) {
            testfn = $default_fht_test_function$.getGlobalValue();
        }
        if (serialization == UNPROVIDED) {
            serialization = $default_fht_serialization_protocol$.getGlobalValue();
        }
        {
            SubLObject fht = new_file_hash_table(fht_serialization_encoding_input_fn(serialization), fht_serialization_encoding_output_fn(serialization), fht_serialization_encoding_size_fn(serialization), fht_serialization_encoding_key_input_fn(serialization), fht_serialization_encoding_key_output_fn(serialization), NIL, testfn, fht_serialization_hash_fn(serialization));
            _csetf_file_hash_table_stream(fht, StreamsLow.open(filename, new SubLObject[]{ $DIRECTION, $INPUT, $IF_DOES_NOT_EXIST, $ERROR, $ELEMENT_TYPE, $BINARY }));
            _csetf_file_hash_table_header(fht, make_htfile_header(UNPROVIDED));
            read_fht_header(fht);
            allocate_file_hash_table_caches(fht, compute_fht_cache_capacity(file_hash_table_count(fht)));
            return fht;
        }
    }

    public static SubLObject open_file_hash_table_read_only(final SubLObject filename, SubLObject testfn, SubLObject serialization) {
        if (testfn == UNPROVIDED) {
            testfn = $default_fht_test_function$.getGlobalValue();
        }
        if (serialization == UNPROVIDED) {
            serialization = $default_fht_serialization_protocol$.getGlobalValue();
        }
        final SubLObject fht = new_file_hash_table(fht_serialization_encoding_input_fn(serialization), fht_serialization_encoding_output_fn(serialization), fht_serialization_encoding_size_fn(serialization), fht_serialization_encoding_key_input_fn(serialization), fht_serialization_encoding_key_output_fn(serialization), NIL, testfn, fht_serialization_hash_fn(serialization));
        _csetf_file_hash_table_stream(fht, StreamsLow.open(filename, new SubLObject[]{ $DIRECTION, $INPUT, $IF_DOES_NOT_EXIST, $ERROR, $ELEMENT_TYPE, $BINARY }));
        _csetf_file_hash_table_header(fht, make_htfile_header(UNPROVIDED));
        read_fht_header(fht);
        allocate_file_hash_table_caches(fht, compute_fht_cache_capacity(file_hash_table_count(fht)));
        return fht;
    }

    /**
     * Returns T IFF the file hash table FHT has an open stream.
     */
    @LispMethod(comment = "Returns T IFF the file hash table FHT has an open stream.")
    public static final SubLObject file_hash_table_open_p_alt(SubLObject fht) {
        SubLTrampolineFile.checkType(fht, FILE_HASH_TABLE_P);
        return open_stream_p(file_hash_table_stream(fht));
    }

    /**
     * Returns T IFF the file hash table FHT has an open stream.
     */
    @LispMethod(comment = "Returns T IFF the file hash table FHT has an open stream.")
    public static SubLObject file_hash_table_open_p(final SubLObject fht) {
        assert NIL != file_hash_table_p(fht) : "! file_hash_table.file_hash_table_p(fht) " + ("file_hash_table.file_hash_table_p(fht) " + "CommonSymbols.NIL != file_hash_table.file_hash_table_p(fht) ") + fht;
        return open_stream_p(file_hash_table_stream(fht));
    }

    public static final SubLObject finalize_file_hash_table_alt(SubLObject fht) {
        SubLTrampolineFile.checkType(fht, FILE_HASH_TABLE_P);
        {
            SubLObject lock = file_hash_table_lock(fht);
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                {
                    SubLObject fht_stream = file_hash_table_stream(fht);
                    if (NIL != output_stream_p(fht_stream)) {
                        force_output(fht_stream);
                        write_fht_header(fht);
                    }
                    close(fht_stream, UNPROVIDED);
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return fht;
    }

    public static SubLObject finalize_file_hash_table(final SubLObject fht) {
        assert NIL != file_hash_table_p(fht) : "! file_hash_table.file_hash_table_p(fht) " + ("file_hash_table.file_hash_table_p(fht) " + "CommonSymbols.NIL != file_hash_table.file_hash_table_p(fht) ") + fht;
        final SubLObject lock = file_hash_table_lock(fht);
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            final SubLObject fht_stream = file_hash_table_stream(fht);
            if (NIL != output_stream_p(fht_stream)) {
                force_output(fht_stream);
                write_fht_header(fht);
            }
            close(fht_stream, UNPROVIDED);
        } finally {
            if (NIL != release) {
                release_lock(lock);
            }
        }
        return fht;
    }

    public static final SubLObject file_hash_table_count_alt(SubLObject fht) {
        SubLTrampolineFile.checkType(fht, FILE_HASH_TABLE_P);
        {
            SubLObject retval = NIL;
            SubLObject lock = file_hash_table_lock(fht);
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                {
                    SubLObject header = file_hash_table_header(fht);
                    retval = htfile_header_item_count(header);
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
            return retval;
        }
    }

    public static SubLObject file_hash_table_count(final SubLObject fht) {
        assert NIL != file_hash_table_p(fht) : "! file_hash_table.file_hash_table_p(fht) " + ("file_hash_table.file_hash_table_p(fht) " + "CommonSymbols.NIL != file_hash_table.file_hash_table_p(fht) ") + fht;
        SubLObject retval = NIL;
        final SubLObject lock = file_hash_table_lock(fht);
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            final SubLObject header = file_hash_table_header(fht);
            retval = htfile_header_item_count(header);
        } finally {
            if (NIL != release) {
                release_lock(lock);
            }
        }
        return retval;
    }

    public static final SubLObject file_hash_table_capacity_alt(SubLObject fht) {
        SubLTrampolineFile.checkType(fht, FILE_HASH_TABLE_P);
        {
            SubLObject retval = NIL;
            SubLObject lock = file_hash_table_lock(fht);
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                {
                    SubLObject header = file_hash_table_header(fht);
                    retval = htfile_header_capacity(header);
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
            return retval;
        }
    }

    public static SubLObject file_hash_table_capacity(final SubLObject fht) {
        assert NIL != file_hash_table_p(fht) : "! file_hash_table.file_hash_table_p(fht) " + ("file_hash_table.file_hash_table_p(fht) " + "CommonSymbols.NIL != file_hash_table.file_hash_table_p(fht) ") + fht;
        SubLObject retval = NIL;
        final SubLObject lock = file_hash_table_lock(fht);
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            final SubLObject header = file_hash_table_header(fht);
            retval = htfile_header_capacity(header);
        } finally {
            if (NIL != release) {
                release_lock(lock);
            }
        }
        return retval;
    }

    public static final SubLObject put_file_hash_table_alt(SubLObject key, SubLObject fht, SubLObject value) {
        SubLTrampolineFile.checkType(fht, FILE_HASH_TABLE_P);
        {
            SubLObject encoding_key_output_fn = file_hash_table_encoding_key_output_fn(fht);
            SubLObject internal_key = funcall(encoding_key_output_fn, key);
            SubLObject lock = file_hash_table_lock(fht);
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                perform_fht_put(fht, internal_key, value);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
            put_fht_lookaside_cache(fht, key, value);
        }
        return key;
    }

    public static SubLObject put_file_hash_table(final SubLObject key, final SubLObject fht, final SubLObject value) {
        assert NIL != file_hash_table_p(fht) : "! file_hash_table.file_hash_table_p(fht) " + ("file_hash_table.file_hash_table_p(fht) " + "CommonSymbols.NIL != file_hash_table.file_hash_table_p(fht) ") + fht;
        final SubLObject encoding_key_output_fn = file_hash_table_encoding_key_output_fn(fht);
        final SubLObject internal_key = funcall(encoding_key_output_fn, key);
        final SubLObject lock = file_hash_table_lock(fht);
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            perform_fht_put(fht, internal_key, value);
        } finally {
            if (NIL != release) {
                release_lock(lock);
            }
        }
        put_fht_lookaside_cache(fht, key, value);
        return key;
    }

    /**
     *
     *
     * @return 1:  the value associated with KEY in FHT, or DEFAULT-VALUE if KEY is not in FHT
     * @return 2:  booleanp; T iff KEY is one of the keys in FHT
     */
    @LispMethod(comment = "@return 1:  the value associated with KEY in FHT, or DEFAULT-VALUE if KEY is not in FHT\r\n@return 2:  booleanp; T iff KEY is one of the keys in FHT")
    public static final SubLObject get_file_hash_table_alt(SubLObject key, SubLObject fht, SubLObject default_value) {
        if (default_value == UNPROVIDED) {
            default_value = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(fht, FILE_HASH_TABLE_P);
            thread.resetMultipleValues();
            {
                SubLObject value = get_fht_lookaside_cache(fht, key);
                SubLObject cachedP = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != cachedP) {
                    if (value == $not_in_fht$.getGlobalValue()) {
                        return values(default_value, NIL);
                    } else {
                        return values(value, T);
                    }
                } else {
                    {
                        SubLObject encoding_key_output_fn = file_hash_table_encoding_key_output_fn(fht);
                        SubLObject internal_key = funcall(encoding_key_output_fn, key);
                        SubLObject status = NIL;
                        SubLObject lock = file_hash_table_lock(fht);
                        SubLObject release = NIL;
                        try {
                            release = seize_lock(lock);
                            thread.resetMultipleValues();
                            {
                                SubLObject value_2 = perform_fht_get(fht, internal_key);
                                SubLObject status_3 = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                value = value_2;
                                status = status_3;
                            }
                        } finally {
                            if (NIL != release) {
                                release_lock(lock);
                            }
                        }
                        if (status == $FOUND) {
                            put_fht_lookaside_cache(fht, key, value);
                            return values(value, T);
                        } else {
                            put_fht_lookaside_cache(fht, key, $not_in_fht$.getGlobalValue());
                            return values(default_value, NIL);
                        }
                    }
                }
            }
        }
    }

    /**
     *
     *
     * @return 1:  the value associated with KEY in FHT, or DEFAULT-VALUE if KEY is not in FHT
     * @return 2:  booleanp; T iff KEY is one of the keys in FHT
     */
    @LispMethod(comment = "@return 1:  the value associated with KEY in FHT, or DEFAULT-VALUE if KEY is not in FHT\r\n@return 2:  booleanp; T iff KEY is one of the keys in FHT")
    public static SubLObject get_file_hash_table(final SubLObject key, final SubLObject fht, SubLObject default_value) {
        if (default_value == UNPROVIDED) {
            default_value = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != file_hash_table_p(fht) : "! file_hash_table.file_hash_table_p(fht) " + ("file_hash_table.file_hash_table_p(fht) " + "CommonSymbols.NIL != file_hash_table.file_hash_table_p(fht) ") + fht;
        thread.resetMultipleValues();
        SubLObject value = get_fht_lookaside_cache(fht, key);
        final SubLObject cachedP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != cachedP) {
            if (value.eql($not_in_fht$.getGlobalValue())) {
                if (NIL != $fht_lookup_stream$.getDynamicValue(thread)) {
                    format($fht_lookup_stream$.getDynamicValue(thread), $str231$GET_FILE_HASH_TABLE__A_has_cache_, key);
                }
                return values(default_value, NIL);
            }
            if (NIL != $fht_lookup_stream$.getDynamicValue(thread)) {
                format($fht_lookup_stream$.getDynamicValue(thread), $str232$GET_FILE_HASH_TABLE__A_has_cache_, key);
            }
            return values(value, T);
        } else {
            if (NIL != $fht_lookup_stream$.getDynamicValue(thread)) {
                format($fht_lookup_stream$.getDynamicValue(thread), $str233$GET_FILE_HASH_TABLE__A_has_to_go_, key);
            }
            final SubLObject encoding_key_output_fn = file_hash_table_encoding_key_output_fn(fht);
            final SubLObject internal_key = funcall(encoding_key_output_fn, key);
            SubLObject status = NIL;
            final SubLObject lock = file_hash_table_lock(fht);
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                thread.resetMultipleValues();
                final SubLObject value_$2 = perform_fht_get(fht, internal_key);
                final SubLObject status_$3 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                value = value_$2;
                status = status_$3;
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
            if (status == $FOUND) {
                put_fht_lookaside_cache(fht, key, value);
                if (NIL != $fht_lookup_stream$.getDynamicValue(thread)) {
                    format($fht_lookup_stream$.getDynamicValue(thread), $str235$GET_FILE_HASH_TABLE__A_updated_ca, key);
                }
                return values(value, T);
            }
            put_fht_lookaside_cache(fht, key, $not_in_fht$.getGlobalValue());
            if (NIL != $fht_lookup_stream$.getDynamicValue(thread)) {
                format($fht_lookup_stream$.getDynamicValue(thread), $str236$GET_FILE_HASH_TABLE__A_updated_ca, key);
            }
            return values(default_value, NIL);
        }
    }

    public static final SubLObject remove_file_hash_table_alt(SubLObject key, SubLObject fht) {
        SubLTrampolineFile.checkType(fht, FILE_HASH_TABLE_P);
        {
            SubLObject encoding_key_output_fn = file_hash_table_encoding_key_input_fn(fht);
            SubLObject internal_key = funcall(encoding_key_output_fn, key);
            SubLObject lock = file_hash_table_lock(fht);
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                perform_fht_remove(fht, internal_key);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        put_fht_lookaside_cache(fht, key, $not_in_fht$.getGlobalValue());
        return key;
    }

    public static SubLObject remove_file_hash_table(final SubLObject key, final SubLObject fht) {
        assert NIL != file_hash_table_p(fht) : "! file_hash_table.file_hash_table_p(fht) " + ("file_hash_table.file_hash_table_p(fht) " + "CommonSymbols.NIL != file_hash_table.file_hash_table_p(fht) ") + fht;
        final SubLObject encoding_key_output_fn = file_hash_table_encoding_key_input_fn(fht);
        final SubLObject internal_key = funcall(encoding_key_output_fn, key);
        final SubLObject lock = file_hash_table_lock(fht);
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            perform_fht_remove(fht, internal_key);
        } finally {
            if (NIL != release) {
                release_lock(lock);
            }
        }
        put_fht_lookaside_cache(fht, key, $not_in_fht$.getGlobalValue());
        return key;
    }

    /**
     * FHT is a hashtable that maps keys to numbers.
     * This method increments the count of KEY in FHT by INCREMENT,
     * or initializes it to INITIAL-VAL if it doesn't yet have a value.
     */
    @LispMethod(comment = "FHT is a hashtable that maps keys to numbers.\r\nThis method increments the count of KEY in FHT by INCREMENT,\r\nor initializes it to INITIAL-VAL if it doesn\'t yet have a value.\nFHT is a hashtable that maps keys to numbers.\nThis method increments the count of KEY in FHT by INCREMENT,\nor initializes it to INITIAL-VAL if it doesn\'t yet have a value.")
    public static final SubLObject cinc_file_hash_table_alt(SubLObject key, SubLObject fht, SubLObject increment, SubLObject initial_val) {
        if (increment == UNPROVIDED) {
            increment = ONE_INTEGER;
        }
        if (initial_val == UNPROVIDED) {
            initial_val = increment;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(fht, FILE_HASH_TABLE_P);
            {
                SubLObject val = get_file_hash_table(key, fht, UNPROVIDED);
                if (NIL != val) {
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                        if (!val.isNumber()) {
                            Errors.error($str_alt207$The_key__S_maps_to_the_non_numeri, key, val, fht);
                        }
                    }
                }
                return put_file_hash_table(key, fht, NIL != val ? ((SubLObject) (add(val, increment))) : initial_val);
            }
        }
    }

    /**
     * FHT is a hashtable that maps keys to numbers.
     * This method increments the count of KEY in FHT by INCREMENT,
     * or initializes it to INITIAL-VAL if it doesn't yet have a value.
     */
    @LispMethod(comment = "FHT is a hashtable that maps keys to numbers.\r\nThis method increments the count of KEY in FHT by INCREMENT,\r\nor initializes it to INITIAL-VAL if it doesn\'t yet have a value.\nFHT is a hashtable that maps keys to numbers.\nThis method increments the count of KEY in FHT by INCREMENT,\nor initializes it to INITIAL-VAL if it doesn\'t yet have a value.")
    public static SubLObject cinc_file_hash_table(final SubLObject key, final SubLObject fht, SubLObject increment, SubLObject initial_val) {
        if (increment == UNPROVIDED) {
            increment = ONE_INTEGER;
        }
        if (initial_val == UNPROVIDED) {
            initial_val = increment;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != file_hash_table_p(fht) : "! file_hash_table.file_hash_table_p(fht) " + ("file_hash_table.file_hash_table_p(fht) " + "CommonSymbols.NIL != file_hash_table.file_hash_table_p(fht) ") + fht;
        final SubLObject val = get_file_hash_table(key, fht, UNPROVIDED);
        if (((NIL != val) && (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) && (!val.isNumber())) {
            Errors.error($str237$The_key__S_maps_to_the_non_numeri, key, val, fht);
        }
        return put_file_hash_table(key, fht, NIL != val ? add(val, increment) : initial_val);
    }

    public static final SubLObject dosome_file_hash_table_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt208);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject key = NIL;
                    SubLObject val = NIL;
                    SubLObject fht = NIL;
                    SubLObject done_var = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt208);
                    key = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt208);
                    val = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt208);
                    fht = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt208);
                    done_var = current.first();
                    current = current.rest();
                    {
                        SubLObject keys_onlyP = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                        destructuring_bind_must_listp(current, datum, $list_alt208);
                        current = current.rest();
                        if (NIL == current) {
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject the_key = $sym209$THE_KEY;
                                SubLObject the_value = $sym210$THE_VALUE;
                                SubLObject continuation = $sym211$CONTINUATION;
                                SubLObject next = $sym212$NEXT;
                                SubLObject completeP = $sym213$COMPLETE_;
                                return list(CLET, list(bq_cons(continuation, $list_alt215), bq_cons(completeP, $list_alt215)), list(WHILE, list(CAND, list(CNOT, done_var), list(CNOT, completeP)), list(CMULTIPLE_VALUE_BIND, list(the_key, the_value, next), list(GET_FILE_HASH_TABLE_ANY, fht, continuation, keys_onlyP), list(PUNLESS, list(NULL, next), list(CLET, list(list(key, the_key), list(val, the_value)), bq_cons(PROGN, append(body, NIL)))), list(CSETQ, continuation, next, completeP, list(NULL, next)))));
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt208);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject dosome_file_hash_table(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list238);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject key = NIL;
        SubLObject val = NIL;
        SubLObject fht = NIL;
        SubLObject done_var = NIL;
        destructuring_bind_must_consp(current, datum, $list238);
        key = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list238);
        val = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list238);
        fht = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list238);
        done_var = current.first();
        current = current.rest();
        final SubLObject keys_onlyP = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list238);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject the_key = $sym239$THE_KEY;
            final SubLObject the_value = $sym240$THE_VALUE;
            final SubLObject continuation = $sym241$CONTINUATION;
            final SubLObject next = $sym242$NEXT;
            final SubLObject completeP = $sym243$COMPLETE_;
            return list(CLET, list(bq_cons(continuation, $list245), bq_cons(completeP, $list245)), list(WHILE, list(CAND, list(CNOT, done_var), list(CNOT, completeP)), list(CMULTIPLE_VALUE_BIND, list(the_key, the_value, next), list(GET_FILE_HASH_TABLE_ANY, fht, continuation, keys_onlyP), list(PUNLESS, list(NULL, next), list(CLET, list(list(key, the_key), list(val, the_value)), bq_cons(PROGN, append(body, NIL)))), list(CSETQ, continuation, next, completeP, list(NULL, next)))));
        }
        cdestructuring_bind_error(datum, $list238);
        return NIL;
    }

    public static SubLObject dosome_pristine_file_hash_table(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list238);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject key = NIL;
        SubLObject val = NIL;
        SubLObject fht = NIL;
        SubLObject done_var = NIL;
        destructuring_bind_must_consp(current, datum, $list238);
        key = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list238);
        val = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list238);
        fht = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list238);
        done_var = current.first();
        current = current.rest();
        final SubLObject keys_onlyP = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list238);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject the_key = $sym254$THE_KEY;
            final SubLObject the_value = $sym255$THE_VALUE;
            final SubLObject continuation = $sym256$CONTINUATION;
            final SubLObject next = $sym257$NEXT;
            final SubLObject completeP = $sym258$COMPLETE_;
            return list(CLET, list(bq_cons(continuation, $list245), bq_cons(completeP, $list245)), list(WHILE, list(CAND, list(CNOT, done_var), list(CNOT, completeP)), list(CMULTIPLE_VALUE_BIND, list(the_key, the_value, next), list(GET_PRISTINE_FILE_HASH_TABLE_ANY, fht, continuation, keys_onlyP), list(PUNLESS, list(NULL, next), list(CLET, list(list(key, the_key), list(val, the_value)), bq_cons(PROGN, append(body, NIL)))), list(CSETQ, continuation, next, completeP, list(NULL, next)))));
        }
        cdestructuring_bind_error(datum, $list238);
        return NIL;
    }

    public static final SubLObject do_file_hash_table_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt225);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject key = NIL;
                    SubLObject value = NIL;
                    SubLObject fht = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt225);
                    key = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt225);
                    value = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt225);
                    fht = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_4 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt225);
                            current_4 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt225);
                            if (NIL == member(current_4, $list_alt226, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_4 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt225);
                        }
                        {
                            SubLObject message_tail = property_list_member($MESSAGE, current);
                            SubLObject message = (NIL != message_tail) ? ((SubLObject) (cadr(message_tail))) : NIL;
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                if (NIL != message) {
                                    {
                                        SubLObject table_var = $sym228$TABLE_VAR;
                                        return list(CLET, list(list(table_var, fht)), list(CSETQ, $progress_note$, message), $list_alt230, list(CSETQ, $progress_total$, list(FILE_HASH_TABLE_COUNT, table_var)), $list_alt233, list(NOTING_PERCENT_PROGRESS, $progress_note$, listS(DO_FILE_HASH_TABLE, list(key, value, table_var, $DONE, done), $list_alt236, $list_alt237, append(body, NIL))));
                                    }
                                } else {
                                    return listS(DOSOME_FILE_HASH_TABLE, listS(key, value, fht, done, $list_alt215), append(body, NIL));
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject do_file_hash_table(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list260);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject key = NIL;
        SubLObject value = NIL;
        SubLObject fht = NIL;
        destructuring_bind_must_consp(current, datum, $list260);
        key = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list260);
        value = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list260);
        fht = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$4 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list260);
            current_$4 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list260);
            if (NIL == member(current_$4, $list261, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$4 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list260);
        }
        final SubLObject message_tail = property_list_member($MESSAGE, current);
        final SubLObject message = (NIL != message_tail) ? cadr(message_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        if (NIL != message) {
            final SubLObject table_var = $sym263$TABLE_VAR;
            return list(CLET, list(list(table_var, fht)), list(CSETQ, $progress_note$, message), $list265, list(CSETQ, $progress_total$, list(FILE_HASH_TABLE_COUNT, table_var)), $list268, list(NOTING_PERCENT_PROGRESS, $progress_note$, listS(DO_FILE_HASH_TABLE, list(key, value, table_var, $DONE, done), $list271, $list272, append(body, NIL))));
        }
        return listS(DOSOME_FILE_HASH_TABLE, listS(key, value, fht, done, $list245), append(body, NIL));
    }

    public static SubLObject do_pristine_file_hash_table(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list260);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject key = NIL;
        SubLObject value = NIL;
        SubLObject fht = NIL;
        destructuring_bind_must_consp(current, datum, $list260);
        key = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list260);
        value = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list260);
        fht = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$5 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list260);
            current_$5 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list260);
            if (NIL == member(current_$5, $list261, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$5 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list260);
        }
        final SubLObject message_tail = property_list_member($MESSAGE, current);
        final SubLObject message = (NIL != message_tail) ? cadr(message_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        if (NIL != message) {
            final SubLObject table_var = $sym274$TABLE_VAR;
            return list(CLET, list(list(table_var, fht)), list(CSETQ, $progress_note$, message), $list265, list(CSETQ, $progress_total$, list(FILE_HASH_TABLE_COUNT, table_var)), $list268, list(NOTING_PERCENT_PROGRESS, $progress_note$, listS(DO_FILE_HASH_TABLE, list(key, value, table_var, $DONE, done), $list271, $list272, append(body, NIL))));
        }
        return listS(DOSOME_PRISTINE_FILE_HASH_TABLE, listS(key, value, fht, done, $list245), append(body, NIL));
    }

    public static final SubLObject print_file_hash_table_contents_alt(SubLObject fht) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject continuation = NIL;
                SubLObject completeP = NIL;
                while (NIL == completeP) {
                    thread.resetMultipleValues();
                    {
                        SubLObject the_key = get_file_hash_table_any(fht, continuation, NIL);
                        SubLObject the_value = thread.secondMultipleValue();
                        SubLObject next = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != next) {
                            {
                                SubLObject key = the_key;
                                SubLObject value = the_value;
                                format(T, $str_alt239$_S_____S__, key, value);
                            }
                        }
                        continuation = next;
                        completeP = sublisp_null(next);
                    }
                } 
            }
            return NIL;
        }
    }

    public static SubLObject print_file_hash_table_contents(final SubLObject fht) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject continuation = NIL;
        SubLObject next;
        for (SubLObject completeP = NIL; NIL == completeP; completeP = sublisp_null(next)) {
            thread.resetMultipleValues();
            final SubLObject the_key = get_file_hash_table_any(fht, continuation, NIL);
            final SubLObject the_value = thread.secondMultipleValue();
            next = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (NIL != next) {
                final SubLObject key = the_key;
                final SubLObject value = the_value;
                format(T, $str276$_S_____S__, key, value);
            }
            continuation = next;
        }
        return NIL;
    }

    public static final SubLObject progress_do_file_hash_table_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt240);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject key = NIL;
                    SubLObject value = NIL;
                    SubLObject fht = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt240);
                    key = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt240);
                    value = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt240);
                    fht = current.first();
                    current = current.rest();
                    {
                        SubLObject message = (current.isCons()) ? ((SubLObject) (current.first())) : $str_alt241$do_file_hash_table;
                        destructuring_bind_must_listp(current, datum, $list_alt240);
                        current = current.rest();
                        if (NIL == current) {
                            current = temp;
                            {
                                SubLObject body = current;
                                defmacro_obsolete_warning(PROGRESS_DO_FILE_HASH_TABLE, $list_alt243);
                                return listS(DO_FILE_HASH_TABLE, list(key, value, fht, $MESSAGE, message), append(body, NIL));
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt240);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject progress_do_file_hash_table(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list277);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject key = NIL;
        SubLObject value = NIL;
        SubLObject fht = NIL;
        destructuring_bind_must_consp(current, datum, $list277);
        key = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list277);
        value = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list277);
        fht = current.first();
        current = current.rest();
        final SubLObject message = (current.isCons()) ? current.first() : $str278$do_file_hash_table;
        destructuring_bind_must_listp(current, datum, $list277);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            defmacro_obsolete_warning(PROGRESS_DO_FILE_HASH_TABLE, $list280);
            return listS(DO_FILE_HASH_TABLE, list(key, value, fht, $MESSAGE, message), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list277);
        return NIL;
    }

    public static final SubLObject dosome_file_hash_table_keys_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt244);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject key = NIL;
                    SubLObject fht = NIL;
                    SubLObject done_var = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt244);
                    key = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt244);
                    fht = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt244);
                    done_var = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            defmacro_obsolete_warning(DOSOME_FILE_HASH_TABLE_KEYS, $list_alt246);
                            return listS(DO_FILE_HASH_TABLE_KEYS, list(key, fht, $DONE, done_var), append(body, NIL));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt244);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject dosome_file_hash_table_keys(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list281);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject key = NIL;
        SubLObject fht = NIL;
        SubLObject done_var = NIL;
        destructuring_bind_must_consp(current, datum, $list281);
        key = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list281);
        fht = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list281);
        done_var = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            defmacro_obsolete_warning(DOSOME_FILE_HASH_TABLE_KEYS, $list283);
            return listS(DO_FILE_HASH_TABLE_KEYS, list(key, fht, $DONE, done_var), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list281);
        return NIL;
    }

    public static final SubLObject do_file_hash_table_keys_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt248);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject key = NIL;
                    SubLObject fht = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt248);
                    key = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt248);
                    fht = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_5 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt248);
                            current_5 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt248);
                            if (NIL == member(current_5, $list_alt226, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_5 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt248);
                        }
                        {
                            SubLObject message_tail = property_list_member($MESSAGE, current);
                            SubLObject message = (NIL != message_tail) ? ((SubLObject) (cadr(message_tail))) : NIL;
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                if (NIL != message) {
                                    {
                                        SubLObject fht_var = $sym249$FHT_VAR;
                                        return list(CLET, list(list(fht_var, fht)), list(CSETQ, $progress_note$, message), $list_alt230, list(CSETQ, $progress_total$, list(FILE_HASH_TABLE_COUNT, fht_var)), $list_alt233, list(NOTING_PERCENT_PROGRESS, $progress_note$, listS(DO_FILE_HASH_TABLE_KEYS, list(key, fht_var, $DONE, done), $list_alt236, $list_alt237, append(body, NIL))));
                                    }
                                } else {
                                    {
                                        SubLObject value = $sym250$VALUE;
                                        return listS(DOSOME_FILE_HASH_TABLE, listS(key, value, fht, done, $list_alt251), list(IGNORE, value), append(body, NIL));
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject do_file_hash_table_keys(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list285);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject key = NIL;
        SubLObject fht = NIL;
        destructuring_bind_must_consp(current, datum, $list285);
        key = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list285);
        fht = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$6 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list285);
            current_$6 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list285);
            if (NIL == member(current_$6, $list261, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$6 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list285);
        }
        final SubLObject message_tail = property_list_member($MESSAGE, current);
        final SubLObject message = (NIL != message_tail) ? cadr(message_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        if (NIL != message) {
            final SubLObject fht_var = $sym286$FHT_VAR;
            return list(CLET, list(list(fht_var, fht)), list(CSETQ, $progress_note$, message), $list265, list(CSETQ, $progress_total$, list(FILE_HASH_TABLE_COUNT, fht_var)), $list268, list(NOTING_PERCENT_PROGRESS, $progress_note$, listS(DO_FILE_HASH_TABLE_KEYS, list(key, fht_var, $DONE, done), $list271, $list272, append(body, NIL))));
        }
        final SubLObject value = $sym287$VALUE;
        return listS(DOSOME_FILE_HASH_TABLE, listS(key, value, fht, done, $list288), list(IGNORE, value), append(body, NIL));
    }

    public static SubLObject do_pristine_file_hash_table_keys(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list285);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject key = NIL;
        SubLObject fht = NIL;
        destructuring_bind_must_consp(current, datum, $list285);
        key = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list285);
        fht = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$7 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list285);
            current_$7 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list285);
            if (NIL == member(current_$7, $list261, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$7 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list285);
        }
        final SubLObject message_tail = property_list_member($MESSAGE, current);
        final SubLObject message = (NIL != message_tail) ? cadr(message_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        if (NIL != message) {
            final SubLObject fht_var = $sym290$FHT_VAR;
            return list(CLET, list(list(fht_var, fht)), list(CSETQ, $progress_note$, message), $list265, list(CSETQ, $progress_total$, list(FILE_HASH_TABLE_COUNT, fht_var)), $list268, list(NOTING_PERCENT_PROGRESS, $progress_note$, listS(DO_FILE_HASH_TABLE_KEYS, list(key, fht_var, $DONE, done), $list271, $list272, append(body, NIL))));
        }
        final SubLObject value = $sym291$VALUE;
        return listS(DOSOME_PRISTINE_FILE_HASH_TABLE, listS(key, value, fht, done, $list288), list(IGNORE, value), append(body, NIL));
    }

    public static final SubLObject progress_do_file_hash_table_keys_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt253);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject key = NIL;
                    SubLObject fht = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt253);
                    key = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt253);
                    fht = current.first();
                    current = current.rest();
                    {
                        SubLObject message = (current.isCons()) ? ((SubLObject) (current.first())) : $str_alt254$do_file_hash_table_keys;
                        destructuring_bind_must_listp(current, datum, $list_alt253);
                        current = current.rest();
                        if (NIL == current) {
                            current = temp;
                            {
                                SubLObject body = current;
                                defmacro_obsolete_warning(PROGRESS_DO_FILE_HASH_TABLE_KEYS, $list_alt246);
                                return listS(DO_FILE_HASH_TABLE_KEYS, list(key, fht, $MESSAGE, message), append(body, NIL));
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt253);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject progress_do_file_hash_table_keys(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list292);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject key = NIL;
        SubLObject fht = NIL;
        destructuring_bind_must_consp(current, datum, $list292);
        key = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list292);
        fht = current.first();
        current = current.rest();
        final SubLObject message = (current.isCons()) ? current.first() : $str293$do_file_hash_table_keys;
        destructuring_bind_must_listp(current, datum, $list292);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            defmacro_obsolete_warning(PROGRESS_DO_FILE_HASH_TABLE_KEYS, $list283);
            return listS(DO_FILE_HASH_TABLE_KEYS, list(key, fht, $MESSAGE, message), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list292);
        return NIL;
    }

    public static final SubLObject file_hash_table_keys_alt(SubLObject fht) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject continuation = NIL;
                SubLObject completeP = NIL;
                while (NIL == completeP) {
                    thread.resetMultipleValues();
                    {
                        SubLObject the_key = get_file_hash_table_any(fht, continuation, T);
                        SubLObject the_value = thread.secondMultipleValue();
                        SubLObject next = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != next) {
                            {
                                SubLObject key = the_key;
                                SubLObject value = the_value;
                                result = cons(key, result);
                            }
                        }
                        continuation = next;
                        completeP = sublisp_null(next);
                    }
                } 
                return nreverse(result);
            }
        }
    }

    public static SubLObject file_hash_table_keys(final SubLObject fht) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject continuation = NIL;
        SubLObject next;
        for (SubLObject completeP = NIL; NIL == completeP; completeP = sublisp_null(next)) {
            thread.resetMultipleValues();
            final SubLObject the_key = get_file_hash_table_any(fht, continuation, T);
            final SubLObject the_value = thread.secondMultipleValue();
            next = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (NIL != next) {
                final SubLObject key = the_key;
                final SubLObject value = the_value;
                result = cons(key, result);
            }
            continuation = next;
        }
        return nreverse(result);
    }

    /**
     *
     *
     * @return listp; if KEYS-ONLY? is NIL, then an alist of N random key-value pairs from FHT.
    otherwise, a list of N random keys from FHT.
    If there are less than N key-val pairs in FHT, then it returns all of the pairs or keys.
     */
    @LispMethod(comment = "@return listp; if KEYS-ONLY? is NIL, then an alist of N random key-value pairs from FHT.\r\notherwise, a list of N random keys from FHT.\r\nIf there are less than N key-val pairs in FHT, then it returns all of the pairs or keys.")
    public static final SubLObject file_hash_table_random_n_alt(SubLObject fht, SubLObject n, SubLObject keys_onlyP) {
        if (keys_onlyP == UNPROVIDED) {
            keys_onlyP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(fht, FILE_HASH_TABLE_P);
            SubLTrampolineFile.checkType(n, NON_NEGATIVE_INTEGER_P);
            {
                SubLObject count = file_hash_table_count(fht);
                if (n.numGE(count)) {
                    if (NIL != keys_onlyP) {
                        return file_hash_table_keys(fht);
                    } else {
                        return file_hash_table_to_alist(fht);
                    }
                } else {
                    {
                        SubLObject indexes_to_take = number_utilities.n_random_integers(n, count, symbol_function($sym257$_));
                        SubLObject result = NIL;
                        SubLObject index = ZERO_INTEGER;
                        SubLObject done = NIL;
                        SubLObject continuation = NIL;
                        SubLObject completeP = NIL;
                        while ((NIL == done) && (NIL == completeP)) {
                            thread.resetMultipleValues();
                            {
                                SubLObject the_key = get_file_hash_table_any(fht, continuation, keys_onlyP);
                                SubLObject the_value = thread.secondMultipleValue();
                                SubLObject next = thread.thirdMultipleValue();
                                thread.resetMultipleValues();
                                if (NIL != next) {
                                    {
                                        SubLObject key = the_key;
                                        SubLObject val = the_value;
                                        if (NIL != list_utilities.empty_list_p(indexes_to_take)) {
                                            done = T;
                                        } else {
                                            {
                                                SubLObject next_index_to_take = indexes_to_take.first();
                                                if (index.numE(next_index_to_take)) {
                                                    if (NIL != keys_onlyP) {
                                                        result = cons(key, result);
                                                    } else {
                                                        result = acons(key, val, result);
                                                    }
                                                    indexes_to_take = indexes_to_take.rest();
                                                }
                                            }
                                        }
                                        index = number_utilities.f_1X(index);
                                    }
                                }
                                continuation = next;
                                completeP = sublisp_null(next);
                            }
                        } 
                        return result;
                    }
                }
            }
        }
    }

    /**
     *
     *
     * @return listp; if KEYS-ONLY? is NIL, then an alist of N random key-value pairs from FHT.
    otherwise, a list of N random keys from FHT.
    If there are less than N key-val pairs in FHT, then it returns all of the pairs or keys.
     */
    @LispMethod(comment = "@return listp; if KEYS-ONLY? is NIL, then an alist of N random key-value pairs from FHT.\r\notherwise, a list of N random keys from FHT.\r\nIf there are less than N key-val pairs in FHT, then it returns all of the pairs or keys.")
    public static SubLObject file_hash_table_random_n(final SubLObject fht, final SubLObject n, SubLObject keys_onlyP) {
        if (keys_onlyP == UNPROVIDED) {
            keys_onlyP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != file_hash_table_p(fht) : "! file_hash_table.file_hash_table_p(fht) " + ("file_hash_table.file_hash_table_p(fht) " + "CommonSymbols.NIL != file_hash_table.file_hash_table_p(fht) ") + fht;
        assert NIL != subl_promotions.non_negative_integer_p(n) : "! subl_promotions.non_negative_integer_p(n) " + ("subl_promotions.non_negative_integer_p(n) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(n) ") + n;
        final SubLObject count = file_hash_table_count(fht);
        if (!n.numGE(count)) {
            SubLObject indexes_to_take = number_utilities.n_random_integers(n, count, symbol_function($sym296$_));
            SubLObject result = NIL;
            SubLObject index = ZERO_INTEGER;
            SubLObject done = NIL;
            SubLObject continuation = NIL;
            SubLObject next;
            for (SubLObject completeP = NIL; (NIL == done) && (NIL == completeP); completeP = sublisp_null(next)) {
                thread.resetMultipleValues();
                final SubLObject the_key = get_file_hash_table_any(fht, continuation, keys_onlyP);
                final SubLObject the_value = thread.secondMultipleValue();
                next = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (NIL != next) {
                    final SubLObject key = the_key;
                    final SubLObject val = the_value;
                    if (NIL != list_utilities.empty_list_p(indexes_to_take)) {
                        done = T;
                    } else {
                        final SubLObject next_index_to_take = indexes_to_take.first();
                        if (index.numE(next_index_to_take)) {
                            if (NIL != keys_onlyP) {
                                result = cons(key, result);
                            } else {
                                result = acons(key, val, result);
                            }
                            indexes_to_take = indexes_to_take.rest();
                        }
                    }
                    index = number_utilities.f_1X(index);
                }
                continuation = next;
            }
            return result;
        }
        if (NIL != keys_onlyP) {
            return file_hash_table_keys(fht);
        }
        return file_hash_table_to_alist(fht);
    }

    public static final SubLObject validate_file_hash_table_alt(SubLObject fht, SubLObject report_stream) {
        if (report_stream == UNPROVIDED) {
            report_stream = T;
        }
        {
            SubLObject problems = ZERO_INTEGER;
            SubLObject capacity = file_hash_table_capacity(fht);
            SubLObject key_entry = make_htfile_key_entry(UNPROVIDED);
            SubLObject index = NIL;
            for (index = ZERO_INTEGER; index.numL(capacity); index = add(index, ONE_INTEGER)) {
                fetch_fht_key_entry(fht, index, key_entry);
                if (NIL == is_valid_key_entryP(key_entry, fht)) {
                    problems = add(problems, ONE_INTEGER);
                    format(report_stream, $str_alt258$Invalid_key_entry__A__Offset_0x_X, new SubLObject[]{ index, htfile_key_entry_key_offset(key_entry), htfile_key_entry_key_offset(key_entry), htfile_key_entry_hash_code(key_entry) });
                }
            }
            return numE(problems, ZERO_INTEGER);
        }
    }

    public static SubLObject validate_file_hash_table(final SubLObject fht, SubLObject report_stream) {
        if (report_stream == UNPROVIDED) {
            report_stream = T;
        }
        SubLObject problems = ZERO_INTEGER;
        final SubLObject capacity = file_hash_table_capacity(fht);
        final SubLObject key_entry = make_htfile_key_entry(UNPROVIDED);
        SubLObject index;
        for (index = NIL, index = ZERO_INTEGER; index.numL(capacity); index = add(index, ONE_INTEGER)) {
            fetch_fht_key_entry(fht, index, key_entry);
            if (NIL == is_valid_key_entryP(key_entry, fht)) {
                problems = add(problems, ONE_INTEGER);
                format(report_stream, $str297$Invalid_key_entry__A__Offset_0x_X, new SubLObject[]{ index, htfile_key_entry_key_offset(key_entry), htfile_key_entry_key_offset(key_entry), htfile_key_entry_hash_code(key_entry) });
            }
        }
        return numE(problems, ZERO_INTEGER);
    }

    /**
     * Attempts to walk the heap, recapturing the individual values, and sending them to the report stream.
     * Notice that this might dredge up more entries than we expected.
     * This uses very low level knowledge and is esp. useful if the key space is for some reason
     * corrupted.
     */
    @LispMethod(comment = "Attempts to walk the heap, recapturing the individual values, and sending them to the report stream.\r\nNotice that this might dredge up more entries than we expected.\r\nThis uses very low level knowledge and is esp. useful if the key space is for some reason\r\ncorrupted.\nAttempts to walk the heap, recapturing the individual values, and sending them to the report stream.\nNotice that this might dredge up more entries than we expected.\nThis uses very low level knowledge and is esp. useful if the key space is for some reason\ncorrupted.")
    public static final SubLObject recover_file_hash_table_heap_alt(SubLObject fht, SubLObject report_stream) {
        if (report_stream == UNPROVIDED) {
            report_stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        {
            SubLObject header = file_hash_table_header(fht);
            SubLObject item_count = file_hash_table_capacity(fht);
            SubLObject heap_start = htfile_header_object_space_offset(header);
            SubLObject heap_end = htfile_header_current_heap_top(header);
            SubLObject fht_stream = file_hash_table_stream(fht);
            SubLObject records_read = ZERO_INTEGER;
            compatibility.set_file_position(fht_stream, heap_start);
            while (file_position(fht_stream, UNPROVIDED).numL(heap_end) && records_read.numL(item_count)) {
                {
                    SubLObject total_object_size = read_fht_uint4(fht_stream);
                    SubLObject type_or_key_size = read_fht_uint4(fht_stream);
                    SubLObject object_only_size = read_fht_uint4(fht_stream);
                    if (NIL != numNE(total_object_size, add(add(type_or_key_size, object_only_size), $htfile_object_entry_size$.getGlobalValue()))) {
                        Errors.error($str_alt259$FHT_for__A_corrupted___A_____A__A, new SubLObject[]{ total_object_size, type_or_key_size, object_only_size, $htfile_object_entry_size$.getGlobalValue() });
                    } else {
                        if (NIL != output_stream_p(report_stream)) {
                            format(report_stream, $str_alt260$Entry__A___A_bytes_total___A_byte, new SubLObject[]{ records_read, total_object_size, type_or_key_size, object_only_size, $htfile_object_entry_size$.getGlobalValue() });
                        }
                    }
                    records_read = add(records_read, ONE_INTEGER);
                    {
                        SubLObject current = file_position(fht_stream, UNPROVIDED);
                        compatibility.set_file_position(fht_stream, add(subtract(total_object_size, $htfile_object_entry_size$.getGlobalValue()), current));
                    }
                }
            } 
            return records_read;
        }
    }

    /**
     * Attempts to walk the heap, recapturing the individual values, and sending them to the report stream.
     * Notice that this might dredge up more entries than we expected.
     * This uses very low level knowledge and is esp. useful if the key space is for some reason
     * corrupted.
     */
    @LispMethod(comment = "Attempts to walk the heap, recapturing the individual values, and sending them to the report stream.\r\nNotice that this might dredge up more entries than we expected.\r\nThis uses very low level knowledge and is esp. useful if the key space is for some reason\r\ncorrupted.\nAttempts to walk the heap, recapturing the individual values, and sending them to the report stream.\nNotice that this might dredge up more entries than we expected.\nThis uses very low level knowledge and is esp. useful if the key space is for some reason\ncorrupted.")
    public static SubLObject recover_file_hash_table_heap(final SubLObject fht, SubLObject report_stream) {
        if (report_stream == UNPROVIDED) {
            report_stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLObject header = file_hash_table_header(fht);
        final SubLObject item_count = file_hash_table_capacity(fht);
        final SubLObject heap_start = htfile_header_object_space_offset(header);
        final SubLObject heap_end = htfile_header_current_heap_top(header);
        final SubLObject fht_stream = file_hash_table_stream(fht);
        SubLObject records_read = ZERO_INTEGER;
        compatibility.set_file_position(fht_stream, heap_start);
        while (file_position(fht_stream, UNPROVIDED).numL(heap_end) && records_read.numL(item_count)) {
            final SubLObject total_object_size = read_fht_uint4(fht_stream);
            final SubLObject type_or_key_size = read_fht_uint4(fht_stream);
            final SubLObject object_only_size = read_fht_uint4(fht_stream);
            if (NIL != numNE(total_object_size, add(add(type_or_key_size, object_only_size), $htfile_object_entry_size$.getGlobalValue()))) {
                Errors.error($str298$FHT_for__A_corrupted___A_____A__A, new SubLObject[]{ total_object_size, type_or_key_size, object_only_size, $htfile_object_entry_size$.getGlobalValue() });
            } else
                if (NIL != output_stream_p(report_stream)) {
                    format(report_stream, $str299$Entry__A___A_bytes_total___A_byte, new SubLObject[]{ records_read, total_object_size, type_or_key_size, object_only_size, $htfile_object_entry_size$.getGlobalValue() });
                }

            records_read = add(records_read, ONE_INTEGER);
            final SubLObject current = file_position(fht_stream, UNPROVIDED);
            compatibility.set_file_position(fht_stream, add(subtract(total_object_size, $htfile_object_entry_size$.getGlobalValue()), current));
        } 
        return records_read;
    }

    /**
     * Returns an iterator for the file hash table FHT.
     * Values returned are tuples of the form (<key> <value>).
     *
     * @unknown IF FINALIZE-FHT? is T then FHT is finalized at the end of iteration.
    This is currently necessary for SKSI, until inference support is in place for finalizing resources
    used during a particular inference.
     */
    @LispMethod(comment = "Returns an iterator for the file hash table FHT.\r\nValues returned are tuples of the form (<key> <value>).\r\n\r\n@unknown IF FINALIZE-FHT? is T then FHT is finalized at the end of iteration.\r\nThis is currently necessary for SKSI, until inference support is in place for finalizing resources\r\nused during a particular inference.\nReturns an iterator for the file hash table FHT.\nValues returned are tuples of the form (<key> <value>).")
    public static final SubLObject new_file_hash_table_iterator_alt(SubLObject fht, SubLObject finalize_fhtP) {
        if (finalize_fhtP == UNPROVIDED) {
            finalize_fhtP = NIL;
        }
        SubLTrampolineFile.checkType(fht, FILE_HASH_TABLE_P);
        return new_file_hash_table_iterator_internal(fht, NIL, finalize_fhtP);
    }

    /**
     * Returns an iterator for the file hash table FHT.
     * Values returned are tuples of the form (<key> <value>).
     *
     * @unknown IF FINALIZE-FHT? is T then FHT is finalized at the end of iteration.
    This is currently necessary for SKSI, until inference support is in place for finalizing resources
    used during a particular inference.
     */
    @LispMethod(comment = "Returns an iterator for the file hash table FHT.\r\nValues returned are tuples of the form (<key> <value>).\r\n\r\n@unknown IF FINALIZE-FHT? is T then FHT is finalized at the end of iteration.\r\nThis is currently necessary for SKSI, until inference support is in place for finalizing resources\r\nused during a particular inference.\nReturns an iterator for the file hash table FHT.\nValues returned are tuples of the form (<key> <value>).")
    public static SubLObject new_file_hash_table_iterator(final SubLObject fht, SubLObject finalize_fhtP) {
        if (finalize_fhtP == UNPROVIDED) {
            finalize_fhtP = NIL;
        }
        assert NIL != file_hash_table_p(fht) : "! file_hash_table.file_hash_table_p(fht) " + ("file_hash_table.file_hash_table_p(fht) " + "CommonSymbols.NIL != file_hash_table.file_hash_table_p(fht) ") + fht;
        return new_file_hash_table_iterator_internal(fht, NIL, finalize_fhtP);
    }

    /**
     * Returns an iterator for the keys of FILE-HASH-TABLE.
     *
     * @unknown IF FINALIZE-FHT? is T then FHT is finalized at the end of iteration.
    This is currently necessary for SKSI, until inference support is in place for finalizing resources
    used during a particular inference.
     */
    @LispMethod(comment = "Returns an iterator for the keys of FILE-HASH-TABLE.\r\n\r\n@unknown IF FINALIZE-FHT? is T then FHT is finalized at the end of iteration.\r\nThis is currently necessary for SKSI, until inference support is in place for finalizing resources\r\nused during a particular inference.")
    public static final SubLObject new_file_hash_table_keys_iterator_alt(SubLObject fht, SubLObject finalize_fhtP) {
        if (finalize_fhtP == UNPROVIDED) {
            finalize_fhtP = NIL;
        }
        SubLTrampolineFile.checkType(fht, FILE_HASH_TABLE_P);
        return new_file_hash_table_iterator_internal(fht, T, finalize_fhtP);
    }

    /**
     * Returns an iterator for the keys of FILE-HASH-TABLE.
     *
     * @unknown IF FINALIZE-FHT? is T then FHT is finalized at the end of iteration.
    This is currently necessary for SKSI, until inference support is in place for finalizing resources
    used during a particular inference.
     */
    @LispMethod(comment = "Returns an iterator for the keys of FILE-HASH-TABLE.\r\n\r\n@unknown IF FINALIZE-FHT? is T then FHT is finalized at the end of iteration.\r\nThis is currently necessary for SKSI, until inference support is in place for finalizing resources\r\nused during a particular inference.")
    public static SubLObject new_file_hash_table_keys_iterator(final SubLObject fht, SubLObject finalize_fhtP) {
        if (finalize_fhtP == UNPROVIDED) {
            finalize_fhtP = NIL;
        }
        assert NIL != file_hash_table_p(fht) : "! file_hash_table.file_hash_table_p(fht) " + ("file_hash_table.file_hash_table_p(fht) " + "CommonSymbols.NIL != file_hash_table.file_hash_table_p(fht) ") + fht;
        return new_file_hash_table_iterator_internal(fht, T, finalize_fhtP);
    }

    /**
     * Returns an iterator for the values of FILE-HASH-TABLE.
     *
     * @unknown IF FINALIZE-FHT? is T then FHT is finalized at the end of iteration.
    This is currently necessary for SKSI, until inference support is in place for finalizing resources
    used during a particular inference.
     */
    @LispMethod(comment = "Returns an iterator for the values of FILE-HASH-TABLE.\r\n\r\n@unknown IF FINALIZE-FHT? is T then FHT is finalized at the end of iteration.\r\nThis is currently necessary for SKSI, until inference support is in place for finalizing resources\r\nused during a particular inference.")
    public static final SubLObject new_file_hash_table_values_iterator_alt(SubLObject fht, SubLObject finalize_fhtP) {
        if (finalize_fhtP == UNPROVIDED) {
            finalize_fhtP = NIL;
        }
        SubLTrampolineFile.checkType(fht, FILE_HASH_TABLE_P);
        return iteration.new_iterator(make_iterator_file_hash_table_state(fht, NIL, finalize_fhtP), $sym261$ITERATE_FILE_HASH_TABLE_DONE_, ITERATE_FILE_HASH_TABLE_NEXT_VALUE, UNPROVIDED);
    }

    /**
     * Returns an iterator for the values of FILE-HASH-TABLE.
     *
     * @unknown IF FINALIZE-FHT? is T then FHT is finalized at the end of iteration.
    This is currently necessary for SKSI, until inference support is in place for finalizing resources
    used during a particular inference.
     */
    @LispMethod(comment = "Returns an iterator for the values of FILE-HASH-TABLE.\r\n\r\n@unknown IF FINALIZE-FHT? is T then FHT is finalized at the end of iteration.\r\nThis is currently necessary for SKSI, until inference support is in place for finalizing resources\r\nused during a particular inference.")
    public static SubLObject new_file_hash_table_values_iterator(final SubLObject fht, SubLObject finalize_fhtP) {
        if (finalize_fhtP == UNPROVIDED) {
            finalize_fhtP = NIL;
        }
        assert NIL != file_hash_table_p(fht) : "! file_hash_table.file_hash_table_p(fht) " + ("file_hash_table.file_hash_table_p(fht) " + "CommonSymbols.NIL != file_hash_table.file_hash_table_p(fht) ") + fht;
        return iteration.new_iterator(make_iterator_file_hash_table_state(fht, NIL, finalize_fhtP), $sym300$ITERATE_FILE_HASH_TABLE_DONE_, ITERATE_FILE_HASH_TABLE_NEXT_VALUE, UNPROVIDED);
    }

    public static final SubLObject iterate_file_hash_table_next_value_alt(SubLObject state) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject next = iterate_file_hash_table_next(state);
                SubLObject next_state = thread.secondMultipleValue();
                SubLObject doneP = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                return values(fht_iterator_next_value(next), next_state, doneP);
            }
        }
    }

    public static SubLObject iterate_file_hash_table_next_value(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject next = iterate_file_hash_table_next(state);
        final SubLObject next_state = thread.secondMultipleValue();
        final SubLObject doneP = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        return values(fht_iterator_next_value(next), next_state, doneP);
    }

    public static final SubLObject new_file_hash_table_iterator_internal_alt(SubLObject fht, SubLObject keys_onlyP, SubLObject finalize_fhtP) {
        return iteration.new_iterator(make_iterator_file_hash_table_state(fht, keys_onlyP, finalize_fhtP), $sym261$ITERATE_FILE_HASH_TABLE_DONE_, ITERATE_FILE_HASH_TABLE_NEXT, UNPROVIDED);
    }

    public static SubLObject new_file_hash_table_iterator_internal(final SubLObject fht, final SubLObject keys_onlyP, final SubLObject finalize_fhtP) {
        return iteration.new_iterator(make_iterator_file_hash_table_state(fht, keys_onlyP, finalize_fhtP), $sym300$ITERATE_FILE_HASH_TABLE_DONE_, ITERATE_FILE_HASH_TABLE_NEXT, UNPROVIDED);
    }

    public static final SubLObject make_iterator_file_hash_table_state_alt(SubLObject fht, SubLObject keys_onlyP, SubLObject finalize_fhtP) {
        {
            SubLObject current = $START;
            return list(current, fht, keys_onlyP, finalize_fhtP);
        }
    }

    public static SubLObject make_iterator_file_hash_table_state(final SubLObject fht, final SubLObject keys_onlyP, final SubLObject finalize_fhtP) {
        final SubLObject current = $START;
        return list(current, fht, keys_onlyP, finalize_fhtP);
    }

    public static final SubLObject iterate_file_hash_table_doneP_alt(SubLObject state) {
        {
            SubLObject datum = state;
            SubLObject current = datum;
            SubLObject current_6 = NIL;
            SubLObject fht = NIL;
            SubLObject keys_onlyP = NIL;
            SubLObject finalize_fhtP = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt265);
            current_6 = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt265);
            fht = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt265);
            keys_onlyP = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt265);
            finalize_fhtP = current.first();
            current = current.rest();
            if (NIL == current) {
                if ($DONE == current_6) {
                    if (NIL != finalize_fhtP) {
                        finalize_file_hash_table(fht);
                    }
                    return T;
                }
                return NIL;
            } else {
                cdestructuring_bind_error(datum, $list_alt265);
            }
        }
        return NIL;
    }

    public static SubLObject iterate_file_hash_table_doneP(final SubLObject state) {
        SubLObject current_$8 = NIL;
        SubLObject fht = NIL;
        SubLObject keys_onlyP = NIL;
        SubLObject finalize_fhtP = NIL;
        destructuring_bind_must_consp(state, state, $list304);
        current_$8 = state.first();
        SubLObject current = state.rest();
        destructuring_bind_must_consp(current, state, $list304);
        fht = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list304);
        keys_onlyP = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list304);
        finalize_fhtP = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(state, $list304);
            return NIL;
        }
        if ($DONE == current_$8) {
            if (NIL != finalize_fhtP) {
                finalize_file_hash_table(fht);
            }
            return T;
        }
        return NIL;
    }

    public static final SubLObject iterate_file_hash_table_next_alt(SubLObject state) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = state;
                SubLObject current = datum;
                SubLObject current_7 = NIL;
                SubLObject fht = NIL;
                SubLObject keys_onlyP = NIL;
                SubLObject finalize_fhtP = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt265);
                current_7 = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt265);
                fht = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt265);
                keys_onlyP = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt265);
                finalize_fhtP = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject continuation = ($START == current_7) ? ((SubLObject) (NIL)) : current_7;
                        thread.resetMultipleValues();
                        {
                            SubLObject next_key = get_file_hash_table_any(fht, continuation, keys_onlyP);
                            SubLObject next_value = thread.secondMultipleValue();
                            SubLObject next_continuation = thread.thirdMultipleValue();
                            thread.resetMultipleValues();
                            {
                                SubLObject valid = makeBoolean(NIL != next_continuation);
                                if (NIL == valid) {
                                    {
                                        SubLObject update = $DONE;
                                        if (NIL != finalize_fhtP) {
                                            finalize_file_hash_table(fht);
                                        } else {
                                            set_nth(ONE_INTEGER, state, $UNINITIALIZED);
                                        }
                                        rplaca(state, update);
                                        return values(NIL, state, T);
                                    }
                                }
                                {
                                    SubLObject next = make_fht_iterator_next(keys_onlyP, next_key, next_value);
                                    SubLObject update = next_continuation;
                                    rplaca(state, update);
                                    return values(next, state, NIL);
                                }
                            }
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt265);
                }
            }
            return NIL;
        }
    }

    public static SubLObject iterate_file_hash_table_next(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current_$9 = NIL;
        SubLObject fht = NIL;
        SubLObject keys_onlyP = NIL;
        SubLObject finalize_fhtP = NIL;
        destructuring_bind_must_consp(state, state, $list304);
        current_$9 = state.first();
        SubLObject current = state.rest();
        destructuring_bind_must_consp(current, state, $list304);
        fht = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list304);
        keys_onlyP = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list304);
        finalize_fhtP = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(state, $list304);
            return NIL;
        }
        final SubLObject continuation = ($START == current_$9) ? NIL : current_$9;
        thread.resetMultipleValues();
        final SubLObject next_key = get_file_hash_table_any(fht, continuation, keys_onlyP);
        final SubLObject next_value = thread.secondMultipleValue();
        final SubLObject next_continuation = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        final SubLObject valid = makeBoolean(NIL != next_continuation);
        if (NIL == valid) {
            final SubLObject update = $DONE;
            if (NIL != finalize_fhtP) {
                finalize_file_hash_table(fht);
            } else {
                set_nth(ONE_INTEGER, state, $UNINITIALIZED);
            }
            rplaca(state, update);
            return values(NIL, state, T);
        }
        final SubLObject next = make_fht_iterator_next(keys_onlyP, next_key, next_value);
        final SubLObject update2 = next_continuation;
        rplaca(state, update2);
        return values(next, state, NIL);
    }

    public static final SubLObject make_fht_iterator_next_alt(SubLObject keys_onlyP, SubLObject next_key, SubLObject next_value) {
        return NIL != keys_onlyP ? ((SubLObject) (next_key)) : list(next_key, next_value);
    }

    public static SubLObject make_fht_iterator_next(final SubLObject keys_onlyP, final SubLObject next_key, final SubLObject next_value) {
        return NIL != keys_onlyP ? next_key : list(next_key, next_value);
    }

    public static final SubLObject fht_iterator_next_value_alt(SubLObject next) {
        return next.isList() ? ((SubLObject) (second(next))) : NIL;
    }

    public static SubLObject fht_iterator_next_value(final SubLObject next) {
        return next.isList() ? second(next) : NIL;
    }

    /**
     *
     *
     * @return alist-p; with the same key->value mappings as the file-hash-table FHT
     */
    @LispMethod(comment = "@return alist-p; with the same key->value mappings as the file-hash-table FHT")
    public static final SubLObject file_hash_table_to_alist_alt(SubLObject fht) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject alist = NIL;
                SubLObject table_var = fht;
                $progress_note$.setDynamicValue($str_alt267$converting_file_hash_table_to_ali, thread);
                $progress_start_time$.setDynamicValue(get_universal_time(), thread);
                $progress_total$.setDynamicValue(file_hash_table_count(table_var), thread);
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
                            while (NIL == completeP) {
                                thread.resetMultipleValues();
                                {
                                    SubLObject the_key = get_file_hash_table_any(table_var, continuation, NIL);
                                    SubLObject the_value = thread.secondMultipleValue();
                                    SubLObject next = thread.thirdMultipleValue();
                                    thread.resetMultipleValues();
                                    if (NIL != next) {
                                        {
                                            SubLObject key = the_key;
                                            SubLObject val = the_value;
                                            note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                            $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                            alist = cons(cons(key, val), alist);
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
                return nreverse(alist);
            }
        }
    }

    /**
     *
     *
     * @return alist-p; with the same key->value mappings as the file-hash-table FHT
     */
    @LispMethod(comment = "@return alist-p; with the same key->value mappings as the file-hash-table FHT")
    public static SubLObject file_hash_table_to_alist(final SubLObject fht) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject alist = NIL;
        $progress_note$.setDynamicValue($str306$converting_file_hash_table_to_ali, thread);
        $progress_start_time$.setDynamicValue(get_universal_time(), thread);
        $progress_total$.setDynamicValue(file_hash_table_count(fht), thread);
        $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
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
                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                SubLObject continuation = NIL;
                SubLObject next;
                for (SubLObject completeP = NIL; NIL == completeP; completeP = sublisp_null(next)) {
                    thread.resetMultipleValues();
                    final SubLObject the_key = get_file_hash_table_any(fht, continuation, NIL);
                    final SubLObject the_value = thread.secondMultipleValue();
                    next = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != next) {
                        final SubLObject key = the_key;
                        final SubLObject val = the_value;
                        note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                        $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                        alist = cons(cons(key, val), alist);
                    }
                    continuation = next;
                }
            } finally {
                final SubLObject _prev_bind_0_$10 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$10, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return nreverse(alist);
    }

    /**
     * Write the contents of the hash table HASH-TABLE to a new fast-create-file-hash-table at the path FILENAME.
     * Then finalize the fast-create-file-hash-table.
     *
     * @return NIL
     */
    @LispMethod(comment = "Write the contents of the hash table HASH-TABLE to a new fast-create-file-hash-table at the path FILENAME.\r\nThen finalize the fast-create-file-hash-table.\r\n\r\n@return NIL\nWrite the contents of the hash table HASH-TABLE to a new fast-create-file-hash-table at the path FILENAME.\nThen finalize the fast-create-file-hash-table.")
    public static final SubLObject hash_table_to_file_hash_table_alt(SubLObject hash_table, SubLObject filename, SubLObject tempstem, SubLObject testfn, SubLObject serialization, SubLObject progress_message) {
        if (tempstem == UNPROVIDED) {
            tempstem = $str_alt268$tmp_;
        }
        if (testfn == UNPROVIDED) {
            testfn = $default_fht_test_function$.getGlobalValue();
        }
        if (serialization == UNPROVIDED) {
            serialization = $default_fht_serialization_protocol$.getGlobalValue();
        }
        if (progress_message == UNPROVIDED) {
            progress_message = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(hash_table, HASH_TABLE_P);
            {
                SubLObject fast_fht = fast_create_file_hash_table(filename, tempstem, testfn, serialization);
                SubLObject message_var = progress_message;
                SubLObject silentP = $silent_progressP$.getDynamicValue(thread);
                {
                    SubLObject _prev_bind_0 = $silent_progressP$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $last_percent_progress_index$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
                    SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
                    SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        $silent_progressP$.bind(makeBoolean((NIL != silentP) || (NIL == message_var)), thread);
                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_prediction$.bind(NIL, thread);
                        $within_noting_percent_progress$.bind(T, thread);
                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                        noting_percent_progress_preamble(NIL != message_var ? ((SubLObject) (message_var)) : $str_alt270$);
                        {
                            SubLObject table_var = hash_table;
                            SubLObject index_var = ZERO_INTEGER;
                            SubLObject count_var = hash_table_count(table_var);
                            SubLObject key = NIL;
                            SubLObject val = NIL;
                            {
                                final Iterator cdohash_iterator = getEntrySetIterator(table_var);
                                try {
                                    while (iteratorHasNext(cdohash_iterator)) {
                                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                        key = getEntryKey(cdohash_entry);
                                        val = getEntryValue(cdohash_entry);
                                        {
                                            SubLObject _prev_bind_0_8 = $silent_progressP$.currentBinding(thread);
                                            try {
                                                $silent_progressP$.bind(silentP, thread);
                                                fast_put_file_hash_table(key, fast_fht, val);
                                            } finally {
                                                $silent_progressP$.rebind(_prev_bind_0_8, thread);
                                            }
                                        }
                                        index_var = number_utilities.f_1X(index_var);
                                        note_percent_progress(index_var, count_var);
                                    } 
                                } finally {
                                    releaseEntrySetIterator(cdohash_iterator);
                                }
                            }
                        }
                        noting_percent_progress_postamble();
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_4, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_1, thread);
                        $silent_progressP$.rebind(_prev_bind_0, thread);
                    }
                }
                finalize_fast_create_file_hash_table(fast_fht, UNPROVIDED, UNPROVIDED);
            }
            return NIL;
        }
    }

    /**
     * Write the contents of the hash table HASH-TABLE to a new fast-create-file-hash-table at the path FILENAME.
     * Then finalize the fast-create-file-hash-table.
     *
     * @return NIL
     */
    @LispMethod(comment = "Write the contents of the hash table HASH-TABLE to a new fast-create-file-hash-table at the path FILENAME.\r\nThen finalize the fast-create-file-hash-table.\r\n\r\n@return NIL\nWrite the contents of the hash table HASH-TABLE to a new fast-create-file-hash-table at the path FILENAME.\nThen finalize the fast-create-file-hash-table.")
    public static SubLObject hash_table_to_file_hash_table(final SubLObject hash_table, final SubLObject filename, SubLObject tempstem, SubLObject testfn, SubLObject serialization, SubLObject progress_message) {
        if (tempstem == UNPROVIDED) {
            tempstem = $str307$tmp_;
        }
        if (testfn == UNPROVIDED) {
            testfn = $default_fht_test_function$.getGlobalValue();
        }
        if (serialization == UNPROVIDED) {
            serialization = $default_fht_serialization_protocol$.getGlobalValue();
        }
        if (progress_message == UNPROVIDED) {
            progress_message = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != hash_table_p(hash_table) : "! hash_table_p(hash_table) " + ("Types.hash_table_p(hash_table) " + "CommonSymbols.NIL != Types.hash_table_p(hash_table) ") + hash_table;
        final SubLObject fast_fht = fast_create_file_hash_table(filename, tempstem, testfn, serialization);
        final SubLObject message_var = progress_message;
        final SubLObject silentP = $silent_progressP$.getDynamicValue(thread);
        final SubLObject _prev_bind_0 = $silent_progressP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $silent_progressP$.bind(makeBoolean((NIL != silentP) || (NIL == message_var)), thread);
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble(NIL != message_var ? message_var : $str309$);
                SubLObject index_var = ZERO_INTEGER;
                final SubLObject count_var = hash_table_count(hash_table);
                SubLObject key = NIL;
                SubLObject val = NIL;
                final Iterator cdohash_iterator = getEntrySetIterator(hash_table);
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        key = getEntryKey(cdohash_entry);
                        val = getEntryValue(cdohash_entry);
                        final SubLObject _prev_bind_0_$11 = $silent_progressP$.currentBinding(thread);
                        try {
                            $silent_progressP$.bind(silentP, thread);
                            fast_put_file_hash_table(key, fast_fht, val);
                        } finally {
                            $silent_progressP$.rebind(_prev_bind_0_$11, thread);
                        }
                        index_var = number_utilities.f_1X(index_var);
                        note_percent_progress(index_var, count_var);
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
            } finally {
                final SubLObject _prev_bind_0_$12 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$12, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_5, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_4, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_3, thread);
            $last_percent_progress_index$.rebind(_prev_bind_2, thread);
            $silent_progressP$.rebind(_prev_bind_0, thread);
        }
        finalize_fast_create_file_hash_table(fast_fht, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    /**
     * Creates a file hash table at PATH using TESTFN and SERIALIZATION with the same contents as ALIST
     */
    @LispMethod(comment = "Creates a file hash table at PATH using TESTFN and SERIALIZATION with the same contents as ALIST")
    public static final SubLObject alist_to_file_hash_table_alt(SubLObject alist, SubLObject path, SubLObject testfn, SubLObject serialization, SubLObject tempstem) {
        if (testfn == UNPROVIDED) {
            testfn = $default_fht_test_function$.getGlobalValue();
        }
        if (serialization == UNPROVIDED) {
            serialization = $default_fht_serialization_protocol$.getGlobalValue();
        }
        if (tempstem == UNPROVIDED) {
            tempstem = $str_alt271$_tmp_;
        }
        SubLTrampolineFile.checkType(alist, LISTP);
        SubLTrampolineFile.checkType(path, STRINGP);
        {
            SubLObject fht = fast_create_file_hash_table(path, tempstem, testfn, serialization);
            SubLObject cdolist_list_var = reverse(alist);
            SubLObject keyXvalue = NIL;
            for (keyXvalue = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , keyXvalue = cdolist_list_var.first()) {
                fast_put_file_hash_table(keyXvalue.first(), fht, keyXvalue.rest());
            }
            finalize_fast_create_file_hash_table(fht, UNPROVIDED, UNPROVIDED);
        }
        return path;
    }

    /**
     * Creates a file hash table at PATH using TESTFN and SERIALIZATION with the same contents as ALIST
     */
    @LispMethod(comment = "Creates a file hash table at PATH using TESTFN and SERIALIZATION with the same contents as ALIST")
    public static SubLObject alist_to_file_hash_table(final SubLObject alist, final SubLObject path, SubLObject testfn, SubLObject serialization, SubLObject tempstem) {
        if (testfn == UNPROVIDED) {
            testfn = $default_fht_test_function$.getGlobalValue();
        }
        if (serialization == UNPROVIDED) {
            serialization = $default_fht_serialization_protocol$.getGlobalValue();
        }
        if (tempstem == UNPROVIDED) {
            tempstem = $str310$_tmp_;
        }
        assert NIL != listp(alist) : "! listp(alist) " + ("Types.listp(alist) " + "CommonSymbols.NIL != Types.listp(alist) ") + alist;
        assert NIL != stringp(path) : "! stringp(path) " + ("Types.stringp(path) " + "CommonSymbols.NIL != Types.stringp(path) ") + path;
        final SubLObject fht = fast_create_file_hash_table(path, tempstem, testfn, serialization);
        SubLObject cdolist_list_var = reverse(alist);
        SubLObject keyXvalue = NIL;
        keyXvalue = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            fast_put_file_hash_table(keyXvalue.first(), fht, keyXvalue.rest());
            cdolist_list_var = cdolist_list_var.rest();
            keyXvalue = cdolist_list_var.first();
        } 
        finalize_fast_create_file_hash_table(fht, UNPROVIDED, UNPROVIDED);
        return path;
    }

    /**
     * Mostly useful for copying an FHT from one serialization method to another
     */
    @LispMethod(comment = "Mostly useful for copying an FHT from one serialization method to another")
    public static final SubLObject file_hash_table_copy_alt(SubLObject existing_fht_path, SubLObject new_fht_path, SubLObject existing_testfn, SubLObject existing_serialization, SubLObject testfn, SubLObject serialization, SubLObject progress_message) {
        if (existing_testfn == UNPROVIDED) {
            existing_testfn = $default_fht_test_function$.getGlobalValue();
        }
        if (existing_serialization == UNPROVIDED) {
            existing_serialization = $default_fht_serialization_protocol$.getGlobalValue();
        }
        if (testfn == UNPROVIDED) {
            testfn = $default_fht_test_function$.getGlobalValue();
        }
        if (serialization == UNPROVIDED) {
            serialization = $default_fht_serialization_protocol$.getGlobalValue();
        }
        if (progress_message == UNPROVIDED) {
            progress_message = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject new_fht = create_file_hash_table(new_fht_path, testfn, serialization, UNPROVIDED, UNPROVIDED);
                SubLObject fht = open_file_hash_table_read_only(existing_fht_path, existing_testfn, existing_serialization);
                SubLObject table_var = fht;
                $progress_note$.setDynamicValue(progress_message, thread);
                $progress_start_time$.setDynamicValue(get_universal_time(), thread);
                $progress_total$.setDynamicValue(file_hash_table_count(table_var), thread);
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
                            while (NIL == completeP) {
                                thread.resetMultipleValues();
                                {
                                    SubLObject the_key = get_file_hash_table_any(table_var, continuation, NIL);
                                    SubLObject the_value = thread.secondMultipleValue();
                                    SubLObject next = thread.thirdMultipleValue();
                                    thread.resetMultipleValues();
                                    if (NIL != next) {
                                        {
                                            SubLObject key = the_key;
                                            SubLObject value = the_value;
                                            note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                            $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                            put_file_hash_table(key, new_fht, value);
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
                finalize_file_hash_table(new_fht);
                finalize_file_hash_table(fht);
            }
            return new_fht_path;
        }
    }

    /**
     * Mostly useful for copying an FHT from one serialization method to another
     */
    @LispMethod(comment = "Mostly useful for copying an FHT from one serialization method to another")
    public static SubLObject file_hash_table_copy(final SubLObject existing_fht_path, final SubLObject new_fht_path, SubLObject existing_testfn, SubLObject existing_serialization, SubLObject testfn, SubLObject serialization, SubLObject progress_message) {
        if (existing_testfn == UNPROVIDED) {
            existing_testfn = $default_fht_test_function$.getGlobalValue();
        }
        if (existing_serialization == UNPROVIDED) {
            existing_serialization = $default_fht_serialization_protocol$.getGlobalValue();
        }
        if (testfn == UNPROVIDED) {
            testfn = $default_fht_test_function$.getGlobalValue();
        }
        if (serialization == UNPROVIDED) {
            serialization = $default_fht_serialization_protocol$.getGlobalValue();
        }
        if (progress_message == UNPROVIDED) {
            progress_message = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject new_fht = create_file_hash_table(new_fht_path, testfn, serialization, UNPROVIDED, UNPROVIDED);
        final SubLObject table_var;
        final SubLObject fht = table_var = open_file_hash_table_read_only(existing_fht_path, existing_testfn, existing_serialization);
        $progress_note$.setDynamicValue(progress_message, thread);
        $progress_start_time$.setDynamicValue(get_universal_time(), thread);
        $progress_total$.setDynamicValue(file_hash_table_count(table_var), thread);
        $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
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
                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                SubLObject continuation = NIL;
                SubLObject next;
                for (SubLObject completeP = NIL; NIL == completeP; completeP = sublisp_null(next)) {
                    thread.resetMultipleValues();
                    final SubLObject the_key = get_file_hash_table_any(table_var, continuation, NIL);
                    final SubLObject the_value = thread.secondMultipleValue();
                    next = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != next) {
                        final SubLObject key = the_key;
                        final SubLObject value = the_value;
                        note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                        $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                        put_file_hash_table(key, new_fht, value);
                    }
                    continuation = next;
                }
            } finally {
                final SubLObject _prev_bind_0_$13 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$13, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        finalize_file_hash_table(new_fht);
        finalize_file_hash_table(fht);
        return new_fht_path;
    }

    public static final SubLObject get_file_hash_table_storage_resourcing_alt(SubLObject fht) {
        return getf(file_hash_table_property_list(fht), $STORAGE_RESOURCING, UNPROVIDED);
    }

    public static SubLObject get_file_hash_table_storage_resourcing(final SubLObject fht) {
        return getf(file_hash_table_property_list(fht), $STORAGE_RESOURCING, UNPROVIDED);
    }

    public static final SubLObject set_file_hash_table_storage_resourcing_alt(SubLObject fht, SubLObject value) {
        if (value == UNPROVIDED) {
            value = T;
        }
        _csetf_file_hash_table_property_list(fht, putf(file_hash_table_property_list(fht), $STORAGE_RESOURCING, value));
        return fht;
    }

    public static SubLObject set_file_hash_table_storage_resourcing(final SubLObject fht, SubLObject value) {
        if (value == UNPROVIDED) {
            value = T;
        }
        _csetf_file_hash_table_property_list(fht, putf(file_hash_table_property_list(fht), $STORAGE_RESOURCING, value));
        return fht;
    }

    /**
     * Returns T iff memory resourcing is set on for FHT.
     */
    @LispMethod(comment = "Returns T iff memory resourcing is set on for FHT.")
    public static final SubLObject file_hash_table_storage_resourcing_onP_alt(SubLObject fht) {
        return get_file_hash_table_storage_resourcing(fht);
    }

    /**
     * Returns T iff memory resourcing is set on for FHT.
     */
    @LispMethod(comment = "Returns T iff memory resourcing is set on for FHT.")
    public static SubLObject file_hash_table_storage_resourcing_onP(final SubLObject fht) {
        return get_file_hash_table_storage_resourcing(fht);
    }

    public static final SubLObject compute_fht_cache_capacity_alt(SubLObject size) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return max($fht_min_cache_capacity$.getDynamicValue(thread), round(multiply(divide(size, $int$100), $fht_cache_percentage$.getDynamicValue(thread)), UNPROVIDED));
        }
    }

    public static SubLObject compute_fht_cache_capacity(final SubLObject size) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return max($fht_min_cache_capacity$.getDynamicValue(thread), round(multiply(divide(size, $int$100), $fht_cache_percentage$.getDynamicValue(thread)), UNPROVIDED));
    }

    public static final SubLObject allocate_file_hash_table_caches_alt(SubLObject fht, SubLObject capacity) {
        _csetf_file_hash_table_output_cache(fht, cache.new_cache(capacity, file_hash_table_testfn(fht)));
        return NIL;
    }

    public static SubLObject allocate_file_hash_table_caches(final SubLObject fht, final SubLObject capacity) {
        _csetf_file_hash_table_output_cache(fht, cache.new_cache(capacity, file_hash_table_testfn(fht)));
        return NIL;
    }

    public static final SubLObject put_fht_lookaside_cache_alt(SubLObject fht, SubLObject key, SubLObject value) {
        return cache.cache_set(file_hash_table_output_cache(fht), key, value);
    }

    public static SubLObject put_fht_lookaside_cache(final SubLObject fht, final SubLObject key, final SubLObject value) {
        return cache.cache_set(file_hash_table_output_cache(fht), key, value);
    }

    public static final SubLObject get_fht_lookaside_cache_alt(SubLObject fht, SubLObject key) {
        return cache.cache_get(file_hash_table_output_cache(fht), key);
    }

    public static SubLObject get_fht_lookaside_cache(final SubLObject fht, final SubLObject key) {
        return cache.cache_get(file_hash_table_output_cache(fht), key);
    }

    public static final SubLObject remove_fht_lookaside_cache_alt(SubLObject fht, SubLObject key) {
        return cache.cache_remove(file_hash_table_output_cache(fht), key);
    }

    public static SubLObject remove_fht_lookaside_cache(final SubLObject fht, final SubLObject key) {
        return cache.cache_remove(file_hash_table_output_cache(fht), key);
    }

    public static SubLObject get_pristine_file_hash_table_any(final SubLObject fht, SubLObject continuation, SubLObject key_onlyP) {
        if (continuation == UNPROVIDED) {
            continuation = NIL;
        }
        if (key_onlyP == UNPROVIDED) {
            key_onlyP = NIL;
        }
        assert NIL != file_hash_table_p(fht) : "! file_hash_table.file_hash_table_p(fht) " + ("file_hash_table.file_hash_table_p(fht) " + "CommonSymbols.NIL != file_hash_table.file_hash_table_p(fht) ") + fht;
        final SubLObject header = file_hash_table_header(fht);
        final SubLObject heap_top = htfile_header_current_heap_top(header);
        final SubLObject object_entry = make_htfile_object_entry(UNPROVIDED);
        final SubLObject complete_style = (NIL != key_onlyP) ? $KEY_ONLY : $FULL;
        SubLObject key = NIL;
        SubLObject value = NIL;
        if (NIL == continuation) {
            continuation = htfile_header_object_space_offset(header);
        }
        final SubLObject address = continuation;
        read_object_entry_from_space(fht, object_entry, address, complete_style);
        final SubLObject encoding_key_input_fn = file_hash_table_encoding_key_input_fn(fht);
        final SubLObject internal_key = htfile_object_entry_key(object_entry);
        key = (NIL == internal_key) ? NIL : funcall(encoding_key_input_fn, internal_key);
        value = htfile_object_entry_data(object_entry);
        continuation = add(address, htfile_object_entry_size(object_entry));
        if (continuation.numGE(heap_top)) {
            continuation = NIL;
        }
        return values(key, value, continuation);
    }

    public static final SubLObject get_file_hash_table_any_alt(SubLObject fht, SubLObject continuation, SubLObject key_onlyP) {
        if (continuation == UNPROVIDED) {
            continuation = NIL;
        }
        if (key_onlyP == UNPROVIDED) {
            key_onlyP = NIL;
        }
        SubLTrampolineFile.checkType(fht, FILE_HASH_TABLE_P);
        {
            SubLObject header = file_hash_table_header(fht);
            SubLObject encoding_key_input_fn = file_hash_table_encoding_key_input_fn(fht);
            SubLObject capacity = htfile_header_capacity(header);
            SubLObject index = (continuation.isNumber()) ? ((SubLObject) (continuation)) : ZERO_INTEGER;
            SubLObject doneP = makeBoolean(index.numG(capacity) || index.numE(capacity));
            SubLObject key_entry = make_htfile_key_entry(UNPROVIDED);
            SubLObject object_entry = make_htfile_object_entry(UNPROVIDED);
            SubLObject complete_style = (NIL != key_onlyP) ? ((SubLObject) ($KEY_ONLY)) : $FULL;
            if (NIL != doneP) {
                index = NIL;
            }
            while (NIL == doneP) {
                fetch_fht_key_entry(fht, index, key_entry);
                if (NIL == is_empty_key_entryP(key_entry)) {
                    doneP = T;
                    complete_fht_object_entry_for_key(fht, key_entry, object_entry, complete_style);
                    index = add(index, ONE_INTEGER);
                } else {
                    index = add(index, ONE_INTEGER);
                    if (!index.numL(capacity)) {
                        doneP = T;
                        index = NIL;
                    }
                }
            } 
            {
                SubLObject internal_key = htfile_object_entry_key(object_entry);
                SubLObject key = (NIL == internal_key) ? ((SubLObject) (NIL)) : funcall(encoding_key_input_fn, internal_key);
                SubLObject value = htfile_object_entry_data(object_entry);
                return values(key, value, index);
            }
        }
    }

    public static SubLObject get_file_hash_table_any(final SubLObject fht, SubLObject continuation, SubLObject key_onlyP) {
        if (continuation == UNPROVIDED) {
            continuation = NIL;
        }
        if (key_onlyP == UNPROVIDED) {
            key_onlyP = NIL;
        }
        assert NIL != file_hash_table_p(fht) : "! file_hash_table.file_hash_table_p(fht) " + ("file_hash_table.file_hash_table_p(fht) " + "CommonSymbols.NIL != file_hash_table.file_hash_table_p(fht) ") + fht;
        final SubLObject header = file_hash_table_header(fht);
        final SubLObject encoding_key_input_fn = file_hash_table_encoding_key_input_fn(fht);
        final SubLObject capacity = htfile_header_capacity(header);
        SubLObject index = (continuation.isNumber()) ? continuation : ZERO_INTEGER;
        SubLObject doneP = makeBoolean(index.numG(capacity) || index.numE(capacity));
        final SubLObject key_entry = make_htfile_key_entry(UNPROVIDED);
        final SubLObject object_entry = make_htfile_object_entry(UNPROVIDED);
        final SubLObject complete_style = (NIL != key_onlyP) ? $KEY_ONLY : $FULL;
        if (NIL != doneP) {
            index = NIL;
        }
        while (NIL == doneP) {
            fetch_fht_key_entry(fht, index, key_entry);
            if (NIL == is_empty_key_entryP(key_entry)) {
                doneP = T;
                complete_fht_object_entry_for_key(fht, key_entry, object_entry, complete_style);
                index = add(index, ONE_INTEGER);
            } else {
                index = add(index, ONE_INTEGER);
                if (index.numL(capacity)) {
                    continue;
                }
                doneP = T;
                index = NIL;
            }
        } 
        final SubLObject internal_key = htfile_object_entry_key(object_entry);
        final SubLObject key = (NIL == internal_key) ? NIL : funcall(encoding_key_input_fn, internal_key);
        final SubLObject value = htfile_object_entry_data(object_entry);
        return values(key, value, index);
    }

    public static final SubLObject perform_fht_put_alt(SubLObject fht, SubLObject key, SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject status = fht_lookup_key(fht, key, UNPROVIDED);
                SubLObject index = thread.secondMultipleValue();
                SubLObject key_entry = thread.thirdMultipleValue();
                SubLObject object_entry = thread.fourthMultipleValue();
                thread.resetMultipleValues();
                {
                    SubLObject pcase_var = status;
                    if (pcase_var.eql($NOT_FOUND)) {
                        perform_fht_put_insert(fht, key, value, index, key_entry, object_entry, UNPROVIDED);
                    } else {
                        if (pcase_var.eql($FOUND)) {
                            perform_fht_put_replace(fht, key, value, index, key_entry, object_entry);
                        } else {
                            if (pcase_var.eql($TABLE_FULL)) {
                                Errors.error($str_alt280$Cannot_put_into_table__table_is_f);
                            } else {
                                Errors.error($str_alt281$Implementation_Error__Unexpected_, status, key, index);
                            }
                        }
                    }
                }
            }
            return fht;
        }
    }

    public static SubLObject perform_fht_put(final SubLObject fht, final SubLObject key, final SubLObject value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject status = fht_lookup_key(fht, key, UNPROVIDED);
        final SubLObject index = thread.secondMultipleValue();
        final SubLObject key_entry = thread.thirdMultipleValue();
        final SubLObject object_entry = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        final SubLObject pcase_var = status;
        if (pcase_var.eql($NOT_FOUND)) {
            perform_fht_put_insert(fht, key, value, index, key_entry, object_entry, UNPROVIDED);
        } else
            if (pcase_var.eql($FOUND)) {
                perform_fht_put_replace(fht, key, value, index, key_entry, object_entry);
            } else
                if (pcase_var.eql($TABLE_FULL)) {
                    Errors.error($str319$Cannot_put_into_table__table_is_f);
                } else {
                    Errors.error($str320$Implementation_Error__Unexpected_, status, key, index);
                }


        return fht;
    }

    public static final SubLObject perform_fht_put_insert_alt(SubLObject fht, SubLObject key, SubLObject value, SubLObject index, SubLObject key_entry, SubLObject object_entry, SubLObject store_key_entryP) {
        if (store_key_entryP == UNPROVIDED) {
            store_key_entryP = T;
        }
        {
            SubLObject encoding_size_fn = file_hash_table_encoding_size_fn(fht);
            SubLObject address = NIL;
            specify_object_entry(key, value, encoding_size_fn, object_entry);
            address = allocate_object_space(fht, object_entry);
            store_fht_object_entry(fht, address, object_entry);
            _csetf_htfile_key_entry_key_offset(key_entry, address);
            if (NIL != store_key_entryP) {
                store_fht_key_entry(fht, index, key_entry);
            }
            increase_fht_item_count(fht, makeBoolean(NIL == store_key_entryP));
        }
        return fht;
    }

    public static SubLObject perform_fht_put_insert(final SubLObject fht, final SubLObject key, final SubLObject value, final SubLObject index, final SubLObject key_entry, final SubLObject object_entry, SubLObject store_key_entryP) {
        if (store_key_entryP == UNPROVIDED) {
            store_key_entryP = T;
        }
        final SubLObject encoding_size_fn = file_hash_table_encoding_size_fn(fht);
        SubLObject address = NIL;
        specify_object_entry(key, value, encoding_size_fn, object_entry);
        address = allocate_object_space(fht, object_entry);
        store_fht_object_entry(fht, address, object_entry);
        _csetf_htfile_key_entry_key_offset(key_entry, address);
        if (NIL != store_key_entryP) {
            store_fht_key_entry(fht, index, key_entry, UNPROVIDED);
        }
        increase_fht_item_count(fht, makeBoolean(NIL == store_key_entryP));
        return fht;
    }

    /**
     * Potentially, the replace function could be really smart, maintain free lists,
     * chop up unused blocks, etc. This one prefers to be stupid.
     */
    @LispMethod(comment = "Potentially, the replace function could be really smart, maintain free lists,\r\nchop up unused blocks, etc. This one prefers to be stupid.\nPotentially, the replace function could be really smart, maintain free lists,\nchop up unused blocks, etc. This one prefers to be stupid.")
    public static final SubLObject perform_fht_put_replace_alt(SubLObject fht, SubLObject key, SubLObject value, SubLObject index, SubLObject key_entry, SubLObject object_entry) {
        {
            SubLObject encoding_size_fn = file_hash_table_encoding_size_fn(fht);
            SubLObject old_entry = make_htfile_object_entry(UNPROVIDED);
            SubLObject address = NIL;
            read_object_entry_from_space(fht, old_entry, htfile_key_entry_key_offset(key_entry), UNPROVIDED);
            if (!value.equalp(htfile_object_entry_data(old_entry))) {
                specify_object_entry(key, value, encoding_size_fn, object_entry);
                if (htfile_object_entry_size(old_entry).numE(htfile_object_entry_size(object_entry))) {
                    address = htfile_key_entry_key_offset(key_entry);
                } else {
                    if (NIL != file_hash_table_storage_resourcing_onP(fht)) {
                        deallocate_object_space(fht, htfile_key_entry_key_offset(key_entry), htfile_object_entry_size(old_entry));
                    }
                    address = allocate_object_space(fht, object_entry);
                }
                store_fht_object_entry(fht, address, object_entry);
                if (!address.numE(htfile_key_entry_key_offset(key_entry))) {
                    _csetf_htfile_key_entry_key_offset(key_entry, address);
                    store_fht_key_entry(fht, index, key_entry);
                }
            }
        }
        return fht;
    }

    /**
     * Potentially, the replace function could be really smart, maintain free lists,
     * chop up unused blocks, etc. This one prefers to be stupid.
     */
    @LispMethod(comment = "Potentially, the replace function could be really smart, maintain free lists,\r\nchop up unused blocks, etc. This one prefers to be stupid.\nPotentially, the replace function could be really smart, maintain free lists,\nchop up unused blocks, etc. This one prefers to be stupid.")
    public static SubLObject perform_fht_put_replace(final SubLObject fht, final SubLObject key, final SubLObject value, final SubLObject index, final SubLObject key_entry, final SubLObject object_entry) {
        final SubLObject encoding_size_fn = file_hash_table_encoding_size_fn(fht);
        final SubLObject old_entry = make_htfile_object_entry(UNPROVIDED);
        SubLObject address = NIL;
        read_object_entry_from_space(fht, old_entry, htfile_key_entry_key_offset(key_entry), UNPROVIDED);
        if (!value.equalp(htfile_object_entry_data(old_entry))) {
            specify_object_entry(key, value, encoding_size_fn, object_entry);
            if (htfile_object_entry_size(old_entry).numE(htfile_object_entry_size(object_entry))) {
                address = htfile_key_entry_key_offset(key_entry);
            } else {
                if (NIL != file_hash_table_storage_resourcing_onP(fht)) {
                    deallocate_object_space(fht, htfile_key_entry_key_offset(key_entry), htfile_object_entry_size(old_entry));
                }
                address = allocate_object_space(fht, object_entry);
            }
            store_fht_object_entry(fht, address, object_entry);
            if (!address.numE(htfile_key_entry_key_offset(key_entry))) {
                _csetf_htfile_key_entry_key_offset(key_entry, address);
                store_fht_key_entry(fht, index, key_entry, UNPROVIDED);
            }
        }
        return fht;
    }

    public static final SubLObject perform_fht_remove_alt(SubLObject fht, SubLObject key) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject status = fht_lookup_key(fht, key, UNPROVIDED);
                SubLObject index = thread.secondMultipleValue();
                SubLObject key_entry = thread.thirdMultipleValue();
                SubLObject object_entry = thread.fourthMultipleValue();
                thread.resetMultipleValues();
                {
                    SubLObject pcase_var = status;
                    if (pcase_var.eql($FOUND)) {
                        perform_fht_remove_int(fht, index, key_entry, object_entry);
                    } else {
                        if ((pcase_var.eql(COR) || pcase_var.eql($TABLE_FULL)) || pcase_var.eql($NOT_FOUND)) {
                            return NIL;
                        } else {
                            Errors.error($str_alt281$Implementation_Error__Unexpected_, status, key, index);
                        }
                    }
                }
            }
            return fht;
        }
    }

    public static SubLObject perform_fht_remove(final SubLObject fht, final SubLObject key) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject status = fht_lookup_key(fht, key, UNPROVIDED);
        final SubLObject index = thread.secondMultipleValue();
        final SubLObject key_entry = thread.thirdMultipleValue();
        final SubLObject object_entry = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        final SubLObject pcase_var = status;
        if (pcase_var.eql($FOUND)) {
            perform_fht_remove_int(fht, index, key_entry, object_entry);
        } else {
            if ((pcase_var.eql(COR) || pcase_var.eql($TABLE_FULL)) || pcase_var.eql($NOT_FOUND)) {
                return NIL;
            }
            Errors.error($str320$Implementation_Error__Unexpected_, status, key, index);
        }
        return fht;
    }

    public static final SubLObject perform_fht_remove_int_alt(SubLObject fht, SubLObject index, SubLObject key_entry, SubLObject object_entry) {
        if (!((NIL != is_empty_key_entryP(key_entry)) || (NIL != is_tombstoned_key_entryP(key_entry)))) {
            if (NIL != file_hash_table_storage_resourcing_onP(fht)) {
                deallocate_object_space(fht, htfile_key_entry_key_offset(key_entry), htfile_object_entry_size(object_entry));
            }
            decrease_fht_item_count(fht);
            clear_fht_key_entry_node(fht, index);
            fht_fill_key_entry_gap(fht, index);
            return fht;
        }
        return NIL;
    }

    public static SubLObject perform_fht_remove_int(final SubLObject fht, final SubLObject index, final SubLObject key_entry, final SubLObject object_entry) {
        if ((NIL == is_empty_key_entryP(key_entry)) && (NIL == is_tombstoned_key_entryP(key_entry))) {
            if (NIL != file_hash_table_storage_resourcing_onP(fht)) {
                deallocate_object_space(fht, htfile_key_entry_key_offset(key_entry), htfile_object_entry_size(object_entry));
            }
            decrease_fht_item_count(fht);
            clear_fht_key_entry_node(fht, index);
            fht_fill_key_entry_gap(fht, index);
            return fht;
        }
        return NIL;
    }

    public static final SubLObject clear_fht_key_entry_node_alt(SubLObject fht, SubLObject key_index) {
        return store_fht_key_entry(fht, key_index, construct_empty_key_entry());
    }

    public static SubLObject clear_fht_key_entry_node(final SubLObject fht, final SubLObject key_index) {
        return store_fht_key_entry(fht, key_index, construct_empty_key_entry(), UNPROVIDED);
    }

    public static final SubLObject fht_fill_key_entry_gap_alt(SubLObject fht, SubLObject gap_index) {
        {
            SubLObject key_entry = make_htfile_key_entry(UNPROVIDED);
            SubLObject object_entry = make_htfile_object_entry(UNPROVIDED);
            SubLObject empty = gap_index;
            SubLObject doneP = NIL;
            while (NIL == doneP) {
                gap_index = fht_step_key_index(gap_index, fht);
                fetch_fht_key_entry(fht, gap_index, key_entry);
                if (NIL != is_empty_key_entryP(key_entry)) {
                    doneP = T;
                } else {
                    {
                        SubLObject node_key_code = htfile_key_entry_hash_code(key_entry);
                        SubLObject address = htfile_key_entry_key_offset(key_entry);
                        SubLObject new_index = NIL;
                        read_object_entry_from_space(fht, object_entry, address, $KEY_ONLY);
                        new_index = fht_lookup_key_index_only(fht, htfile_object_entry_key(object_entry), node_key_code);
                        if (new_index.numE(empty)) {
                            store_fht_key_entry(fht, empty, key_entry);
                            empty = gap_index;
                            clear_fht_key_entry_node(fht, empty);
                        }
                    }
                }
            } 
            return fht;
        }
    }

    public static SubLObject fht_fill_key_entry_gap(final SubLObject fht, SubLObject gap_index) {
        final SubLObject key_entry = make_htfile_key_entry(UNPROVIDED);
        final SubLObject object_entry = make_htfile_object_entry(UNPROVIDED);
        SubLObject empty = gap_index;
        SubLObject doneP = NIL;
        while (NIL == doneP) {
            gap_index = fht_step_key_index(gap_index, fht);
            fetch_fht_key_entry(fht, gap_index, key_entry);
            if (NIL != is_empty_key_entryP(key_entry)) {
                doneP = T;
            } else {
                final SubLObject node_key_code = htfile_key_entry_hash_code(key_entry);
                final SubLObject address = htfile_key_entry_key_offset(key_entry);
                SubLObject new_index = NIL;
                read_object_entry_from_space(fht, object_entry, address, $KEY_ONLY);
                new_index = fht_lookup_key_index_only(fht, htfile_object_entry_key(object_entry), node_key_code);
                if (!new_index.numE(empty)) {
                    continue;
                }
                store_fht_key_entry(fht, empty, key_entry, UNPROVIDED);
                empty = gap_index;
                clear_fht_key_entry_node(fht, empty);
            }
        } 
        return fht;
    }

    public static final SubLObject fht_lookup_key_index_only_alt(SubLObject fht, SubLObject key, SubLObject key_code) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject status = fht_lookup_key(fht, key, key_code);
                SubLObject index = thread.secondMultipleValue();
                SubLObject key_entry = thread.thirdMultipleValue();
                SubLObject object_entry = thread.fourthMultipleValue();
                thread.resetMultipleValues();
                return index;
            }
        }
    }

    public static SubLObject fht_lookup_key_index_only(final SubLObject fht, final SubLObject key, final SubLObject key_code) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject status = fht_lookup_key(fht, key, key_code);
        final SubLObject index = thread.secondMultipleValue();
        final SubLObject key_entry = thread.thirdMultipleValue();
        final SubLObject object_entry = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        return index;
    }

    public static final SubLObject increase_fht_item_count_alt(SubLObject fht, SubLObject delay_writeP) {
        if (delay_writeP == UNPROVIDED) {
            delay_writeP = NIL;
        }
        {
            SubLObject header = file_hash_table_header(fht);
            SubLObject count = htfile_header_item_count(header);
            count = add(count, ONE_INTEGER);
            _csetf_htfile_header_item_count(header, count);
            if (NIL == delay_writeP) {
                write_fht_header(fht);
                potentially_grow_fht_table(fht);
            }
            return fht;
        }
    }

    public static SubLObject increase_fht_item_count(final SubLObject fht, SubLObject delay_writeP) {
        if (delay_writeP == UNPROVIDED) {
            delay_writeP = NIL;
        }
        final SubLObject header = file_hash_table_header(fht);
        SubLObject count = htfile_header_item_count(header);
        count = add(count, ONE_INTEGER);
        _csetf_htfile_header_item_count(header, count);
        if (NIL == delay_writeP) {
            write_fht_header(fht);
            potentially_grow_fht_table(fht);
        }
        return fht;
    }

    public static final SubLObject decrease_fht_item_count_alt(SubLObject fht) {
        {
            SubLObject header = file_hash_table_header(fht);
            SubLObject count = htfile_header_item_count(header);
            count = subtract(count, ONE_INTEGER);
            _csetf_htfile_header_item_count(header, count);
            write_fht_header(fht);
            return fht;
        }
    }

    public static SubLObject decrease_fht_item_count(final SubLObject fht) {
        final SubLObject header = file_hash_table_header(fht);
        SubLObject count = htfile_header_item_count(header);
        count = subtract(count, ONE_INTEGER);
        _csetf_htfile_header_item_count(header, count);
        write_fht_header(fht);
        return fht;
    }

    public static final SubLObject perform_fht_get_alt(SubLObject fht, SubLObject key) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject status = fht_lookup_key(fht, key, UNPROVIDED);
                SubLObject index = thread.secondMultipleValue();
                SubLObject key_entry = thread.thirdMultipleValue();
                SubLObject object_entry = thread.fourthMultipleValue();
                thread.resetMultipleValues();
                {
                    SubLObject pcase_var = status;
                    if (pcase_var.eql($NOT_FOUND)) {
                        return values(NIL, status);
                    } else {
                        if (pcase_var.eql($FOUND)) {
                            complete_fht_object_entry_for_key(fht, key_entry, object_entry, UNPROVIDED);
                            return values(htfile_object_entry_data(object_entry), status);
                        } else {
                            if (pcase_var.eql($TABLE_FULL)) {
                                Errors.error($str_alt283$Can_neither_find_key__S_nor_prove, new SubLObject[]{ key, index, status, key_entry });
                            } else {
                                Errors.error($str_alt284$Cannot_get_key__S_from_table__Imp, new SubLObject[]{ key, index, status, key_entry });
                            }
                        }
                    }
                }
            }
            return fht;
        }
    }

    public static SubLObject perform_fht_get(final SubLObject fht, final SubLObject key) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject status = fht_lookup_key(fht, key, UNPROVIDED);
        final SubLObject index = thread.secondMultipleValue();
        final SubLObject key_entry = thread.thirdMultipleValue();
        final SubLObject object_entry = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        final SubLObject pcase_var = status;
        if (pcase_var.eql($NOT_FOUND)) {
            return values(NIL, status);
        }
        if (pcase_var.eql($FOUND)) {
            complete_fht_object_entry_for_key(fht, key_entry, object_entry, UNPROVIDED);
            return values(htfile_object_entry_data(object_entry), status);
        }
        if (pcase_var.eql($TABLE_FULL)) {
            Errors.error($str322$Can_neither_find_key__S_nor_prove, new SubLObject[]{ key, index, status, key_entry });
        } else {
            Errors.error($str323$Cannot_get_key__S_from_table__Imp, new SubLObject[]{ key, index, status, key_entry });
        }
        return fht;
    }

    public static final SubLObject htfile_file_block_entry_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        print_htfile_file_block_entry(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject htfile_file_block_entry_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_htfile_file_block_entry(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject htfile_file_block_entry_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.file_hash_table.$htfile_file_block_entry_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject htfile_file_block_entry_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.file_hash_table.$htfile_file_block_entry_native.class ? T : NIL;
    }

    public static final SubLObject htfile_file_block_entry_size_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, HTFILE_FILE_BLOCK_ENTRY_P);
        return v_object.getField2();
    }

    public static SubLObject htfile_file_block_entry_size(final SubLObject v_object) {
        assert NIL != htfile_file_block_entry_p(v_object) : "! file_hash_table.htfile_file_block_entry_p(v_object) " + "file_hash_table.htfile_file_block_entry_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject htfile_file_block_entry_next_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, HTFILE_FILE_BLOCK_ENTRY_P);
        return v_object.getField3();
    }

    public static SubLObject htfile_file_block_entry_next(final SubLObject v_object) {
        assert NIL != htfile_file_block_entry_p(v_object) : "! file_hash_table.htfile_file_block_entry_p(v_object) " + "file_hash_table.htfile_file_block_entry_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject _csetf_htfile_file_block_entry_size_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, HTFILE_FILE_BLOCK_ENTRY_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_htfile_file_block_entry_size(final SubLObject v_object, final SubLObject value) {
        assert NIL != htfile_file_block_entry_p(v_object) : "! file_hash_table.htfile_file_block_entry_p(v_object) " + "file_hash_table.htfile_file_block_entry_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_htfile_file_block_entry_next_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, HTFILE_FILE_BLOCK_ENTRY_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_htfile_file_block_entry_next(final SubLObject v_object, final SubLObject value) {
        assert NIL != htfile_file_block_entry_p(v_object) : "! file_hash_table.htfile_file_block_entry_p(v_object) " + "file_hash_table.htfile_file_block_entry_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject make_htfile_file_block_entry_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.file_hash_table.$htfile_file_block_entry_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($SIZE)) {
                        _csetf_htfile_file_block_entry_size(v_new, current_value);
                    } else {
                        if (pcase_var.eql($NEXT)) {
                            _csetf_htfile_file_block_entry_next(v_new, current_value);
                        } else {
                            Errors.error($str_alt47$Invalid_slot__S_for_construction_, current_arg);
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_htfile_file_block_entry(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.file_hash_table.$htfile_file_block_entry_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($SIZE)) {
                _csetf_htfile_file_block_entry_size(v_new, current_value);
            } else
                if (pcase_var.eql($NEXT)) {
                    _csetf_htfile_file_block_entry_next(v_new, current_value);
                } else {
                    Errors.error($str48$Invalid_slot__S_for_construction_, current_arg);
                }

        }
        return v_new;
    }

    public static SubLObject visit_defstruct_htfile_file_block_entry(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_HTFILE_FILE_BLOCK_ENTRY, TWO_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $SIZE, htfile_file_block_entry_size(obj));
        funcall(visitor_fn, obj, $SLOT, $NEXT, htfile_file_block_entry_next(obj));
        funcall(visitor_fn, obj, $END, MAKE_HTFILE_FILE_BLOCK_ENTRY, TWO_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_htfile_file_block_entry_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_htfile_file_block_entry(obj, visitor_fn);
    }

    /**
     *
     *
     * @param SIZE;
     * 		positive-integer-p
     * 		Creates a new file block object with the size field set to SIZE and
     * 		NEXT field set to 0 (meaning NULL).
     */
    @LispMethod(comment = "@param SIZE;\r\n\t\tpositive-integer-p\r\n\t\tCreates a new file block object with the size field set to SIZE and\r\n\t\tNEXT field set to 0 (meaning NULL).")
    public static final SubLObject new_htfile_file_block_entry_alt(SubLObject size) {
        if (size == UNPROVIDED) {
            size = NIL;
        }
        {
            SubLObject file_block = make_htfile_file_block_entry(UNPROVIDED);
            _csetf_htfile_file_block_entry_size(file_block, size);
            _csetf_htfile_file_block_entry_next(file_block, ZERO_INTEGER);
            return file_block;
        }
    }

    /**
     *
     *
     * @param SIZE;
     * 		positive-integer-p
     * 		Creates a new file block object with the size field set to SIZE and
     * 		NEXT field set to 0 (meaning NULL).
     */
    @LispMethod(comment = "@param SIZE;\r\n\t\tpositive-integer-p\r\n\t\tCreates a new file block object with the size field set to SIZE and\r\n\t\tNEXT field set to 0 (meaning NULL).")
    public static SubLObject new_htfile_file_block_entry(SubLObject size) {
        if (size == UNPROVIDED) {
            size = NIL;
        }
        final SubLObject file_block = make_htfile_file_block_entry(UNPROVIDED);
        _csetf_htfile_file_block_entry_size(file_block, size);
        _csetf_htfile_file_block_entry_next(file_block, ZERO_INTEGER);
        return file_block;
    }

    /**
     * Print function for @xref htfile-file-block-entry.
     */
    @LispMethod(comment = "Print function for @xref htfile-file-block-entry.")
    public static final SubLObject print_htfile_file_block_entry_alt(SubLObject v_object, SubLObject stream, SubLObject depth) {
        format(stream, $str_alt298$__FILE_BLOCK_ENTRY__s__s_, htfile_file_block_entry_size(v_object), htfile_file_block_entry_next(v_object));
        return NIL;
    }

    /**
     * Print function for @xref htfile-file-block-entry.
     */
    @LispMethod(comment = "Print function for @xref htfile-file-block-entry.")
    public static SubLObject print_htfile_file_block_entry(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        format(stream, $str340$__FILE_BLOCK_ENTRY__s__s_, htfile_file_block_entry_size(v_object), htfile_file_block_entry_next(v_object));
        return NIL;
    }

    /**
     *
     *
     * @param BLOCK-1;
    htfile-file-block-entry-p
     * 		
     * @param BLOCK-2;
     * 		htfile-file-block-entry-p
     * 		Copies BLOCK-1 over to BLOCK-2.
     */
    @LispMethod(comment = "@param BLOCK-1;\nhtfile-file-block-entry-p\r\n\t\t\r\n@param BLOCK-2;\r\n\t\thtfile-file-block-entry-p\r\n\t\tCopies BLOCK-1 over to BLOCK-2.")
    public static final SubLObject copy_file_block_alt(SubLObject block_1, SubLObject block_2) {
        _csetf_htfile_file_block_entry_size(block_2, htfile_file_block_entry_size(block_1));
        _csetf_htfile_file_block_entry_next(block_2, htfile_file_block_entry_next(block_1));
        return block_2;
    }

    /**
     *
     *
     * @param BLOCK-1;
    htfile-file-block-entry-p
     * 		
     * @param BLOCK-2;
     * 		htfile-file-block-entry-p
     * 		Copies BLOCK-1 over to BLOCK-2.
     */
    @LispMethod(comment = "@param BLOCK-1;\nhtfile-file-block-entry-p\r\n\t\t\r\n@param BLOCK-2;\r\n\t\thtfile-file-block-entry-p\r\n\t\tCopies BLOCK-1 over to BLOCK-2.")
    public static SubLObject copy_file_block(final SubLObject block_1, final SubLObject block_2) {
        _csetf_htfile_file_block_entry_size(block_2, htfile_file_block_entry_size(block_1));
        _csetf_htfile_file_block_entry_next(block_2, htfile_file_block_entry_next(block_1));
        return block_2;
    }

    /**
     * Write FILE-BLOCK-ENTRY to the location starting at ADDRESS.
     */
    @LispMethod(comment = "Write FILE-BLOCK-ENTRY to the location starting at ADDRESS.")
    public static final SubLObject write_file_block_entry_to_space_alt(SubLObject fht, SubLObject file_block_entry, SubLObject address) {
        {
            SubLObject stream = file_hash_table_stream(fht);
            file_position(stream, address);
            if (!file_position(stream, UNPROVIDED).numE(address)) {
                Errors.error($str_alt299$Unable_to_position_to_file_pos__D, address, file_position(stream, UNPROVIDED));
            }
            write_fht_uint4(stream, htfile_file_block_entry_size(file_block_entry));
            write_fht_uint8(stream, htfile_file_block_entry_next(file_block_entry));
            force_output(stream);
        }
        return fht;
    }

    /**
     * Write FILE-BLOCK-ENTRY to the location starting at ADDRESS.
     */
    @LispMethod(comment = "Write FILE-BLOCK-ENTRY to the location starting at ADDRESS.")
    public static SubLObject write_file_block_entry_to_space(final SubLObject fht, final SubLObject file_block_entry, final SubLObject address) {
        final SubLObject stream = file_hash_table_stream(fht);
        file_position(stream, address);
        if (!file_position(stream, UNPROVIDED).numE(address)) {
            Errors.error($str341$Unable_to_position_to_file_pos__D, address, file_position(stream, UNPROVIDED));
        }
        write_fht_uint4(stream, htfile_file_block_entry_size(file_block_entry));
        write_fht_uint8(stream, htfile_file_block_entry_next(file_block_entry));
        force_output(stream);
        return fht;
    }

    /**
     * Read FILE-BLOCK-ENTRY from the location starting at ADDRESS.
     */
    @LispMethod(comment = "Read FILE-BLOCK-ENTRY from the location starting at ADDRESS.")
    public static final SubLObject read_file_block_entry_from_space_alt(SubLObject fht, SubLObject file_block_entry, SubLObject address) {
        {
            SubLObject stream = file_hash_table_stream(fht);
            file_position(stream, address);
            if (!file_position(stream, UNPROVIDED).numE(address)) {
                Errors.error($str_alt300$Unable_to_position_to_file_pos__A, address, file_position(stream, UNPROVIDED));
            }
            _csetf_htfile_file_block_entry_size(file_block_entry, read_fht_uint4(stream));
            _csetf_htfile_file_block_entry_next(file_block_entry, read_fht_uint8(stream));
            return file_block_entry;
        }
    }

    /**
     * Read FILE-BLOCK-ENTRY from the location starting at ADDRESS.
     */
    @LispMethod(comment = "Read FILE-BLOCK-ENTRY from the location starting at ADDRESS.")
    public static SubLObject read_file_block_entry_from_space(final SubLObject fht, final SubLObject file_block_entry, final SubLObject address) {
        final SubLObject stream = file_hash_table_stream(fht);
        file_position(stream, address);
        if (!file_position(stream, UNPROVIDED).numE(address)) {
            Errors.error($str342$Unable_to_position_to_file_pos__A, address, file_position(stream, UNPROVIDED));
        }
        _csetf_htfile_file_block_entry_size(file_block_entry, read_fht_uint4(stream));
        _csetf_htfile_file_block_entry_next(file_block_entry, read_fht_uint8(stream));
        return file_block_entry;
    }

    /**
     *
     *
     * @param FHT;
    file-hash-table-p
     * 		
     * @param KEY-ENTRY;
    htfile-key-entry-p
     * 		
     * @param SPACE-AVAILABLE;
    positive-integer-p
     * 		
     * @return file-hash-table-p
    Deallocates SPACE-AVAILABLE number of bytes starting from ADDRESS.
     */
    @LispMethod(comment = "@param FHT;\nfile-hash-table-p\r\n\t\t\r\n@param KEY-ENTRY;\nhtfile-key-entry-p\r\n\t\t\r\n@param SPACE-AVAILABLE;\npositive-integer-p\r\n\t\t\r\n@return file-hash-table-p\r\nDeallocates SPACE-AVAILABLE number of bytes starting from ADDRESS.")
    public static final SubLObject deallocate_object_space_alt(SubLObject fht, SubLObject address, SubLObject space_available) {
        if (!space_available.numGE($htfile_minimal_file_block_size$.getGlobalValue())) {
            return fht;
        }
        {
            SubLObject fht_header = file_hash_table_header(fht);
            SubLObject free_list_head = htfile_header_free_list_head(fht_header);
            SubLObject file_block = new_htfile_file_block_entry(space_available);
            if (free_list_head.isPositive()) {
                {
                    SubLObject new_free_list_head = insert_file_block_in_free_list(fht, free_list_head, file_block, address);
                    _csetf_htfile_header_free_list_head(fht_header, new_free_list_head);
                }
            } else {
                _csetf_htfile_header_free_list_head(fht_header, address);
                write_file_block_entry_to_space(fht, file_block, address);
            }
            return fht;
        }
    }

    /**
     *
     *
     * @param FHT;
    file-hash-table-p
     * 		
     * @param KEY-ENTRY;
    htfile-key-entry-p
     * 		
     * @param SPACE-AVAILABLE;
    positive-integer-p
     * 		
     * @return file-hash-table-p
    Deallocates SPACE-AVAILABLE number of bytes starting from ADDRESS.
     */
    @LispMethod(comment = "@param FHT;\nfile-hash-table-p\r\n\t\t\r\n@param KEY-ENTRY;\nhtfile-key-entry-p\r\n\t\t\r\n@param SPACE-AVAILABLE;\npositive-integer-p\r\n\t\t\r\n@return file-hash-table-p\r\nDeallocates SPACE-AVAILABLE number of bytes starting from ADDRESS.")
    public static SubLObject deallocate_object_space(final SubLObject fht, final SubLObject address, final SubLObject space_available) {
        if (!space_available.numGE($htfile_minimal_file_block_size$.getGlobalValue())) {
            return fht;
        }
        final SubLObject fht_header = file_hash_table_header(fht);
        final SubLObject free_list_head = htfile_header_free_list_head(fht_header);
        final SubLObject file_block = new_htfile_file_block_entry(space_available);
        if (free_list_head.isPositive()) {
            final SubLObject new_free_list_head = insert_file_block_in_free_list(fht, free_list_head, file_block, address);
            _csetf_htfile_header_free_list_head(fht_header, new_free_list_head);
        } else {
            _csetf_htfile_header_free_list_head(fht_header, address);
            write_file_block_entry_to_space(fht, file_block, address);
        }
        return fht;
    }

    /**
     *
     *
     * @param FHT;
    file-hash-table-p
     * 		
     * @param FREE-LIST-HEAD;
    positive-integer-p
     * 		
     * @param FILE-BLOCK;
    htfile-file-block-entry-p
     * 		
     * @param FIEL-BLOCK-ADDRESS;
    positive-integer-p
     * 		
     * @return positive-integer-p : the new free list head
    Inserts FILE-BLOCK with address FILE-BLOCK-ADDRESS in the free list for FHT.
    Returns the updated free list head for FHT.
     */
    @LispMethod(comment = "@param FHT;\nfile-hash-table-p\r\n\t\t\r\n@param FREE-LIST-HEAD;\npositive-integer-p\r\n\t\t\r\n@param FILE-BLOCK;\nhtfile-file-block-entry-p\r\n\t\t\r\n@param FIEL-BLOCK-ADDRESS;\npositive-integer-p\r\n\t\t\r\n@return positive-integer-p : the new free list head\r\nInserts FILE-BLOCK with address FILE-BLOCK-ADDRESS in the free list for FHT.\r\nReturns the updated free list head for FHT.")
    public static final SubLObject insert_file_block_in_free_list_alt(SubLObject fht, SubLObject free_list_head, SubLObject file_block, SubLObject file_block_address) {
        {
            SubLObject prev_block = new_htfile_file_block_entry(UNPROVIDED);
            SubLObject prev_block_address = free_list_head;
            SubLObject next_block = new_htfile_file_block_entry(UNPROVIDED);
            SubLObject doneP = NIL;
            if (file_block_address.numL(free_list_head)) {
                if (add(file_block_address, htfile_file_block_entry_size(file_block)).numE(free_list_head)) {
                    read_file_block_entry_from_space(fht, next_block, free_list_head);
                    _csetf_htfile_file_block_entry_size(file_block, add(htfile_file_block_entry_size(file_block), htfile_file_block_entry_size(next_block)));
                    _csetf_htfile_file_block_entry_next(file_block, htfile_file_block_entry_next(next_block));
                } else {
                    _csetf_htfile_file_block_entry_next(file_block, free_list_head);
                }
                write_file_block_entry_to_space(fht, file_block, file_block_address);
                return file_block_address;
            }
            while ((NIL == doneP) && prev_block_address.numL(file_block_address)) {
                read_file_block_entry_from_space(fht, prev_block, prev_block_address);
                if (htfile_file_block_entry_next(prev_block).isPositive() && htfile_file_block_entry_next(prev_block).numL(file_block_address)) {
                    prev_block_address = htfile_file_block_entry_next(prev_block);
                } else {
                    doneP = T;
                }
            } 
            _csetf_htfile_file_block_entry_next(file_block, htfile_file_block_entry_next(prev_block));
            _csetf_htfile_file_block_entry_next(prev_block, file_block_address);
            if (add(prev_block_address, htfile_file_block_entry_size(prev_block)).numE(file_block_address)) {
                _csetf_htfile_file_block_entry_size(file_block, add(htfile_file_block_entry_size(prev_block), htfile_file_block_entry_size(file_block)));
                file_block_address = prev_block_address;
                prev_block = NIL;
            }
            if (add(file_block_address, htfile_file_block_entry_size(file_block)).numE(htfile_file_block_entry_next(file_block))) {
                read_file_block_entry_from_space(fht, next_block, htfile_file_block_entry_next(file_block));
                _csetf_htfile_file_block_entry_size(file_block, add(htfile_file_block_entry_size(next_block), htfile_file_block_entry_size(file_block)));
                _csetf_htfile_file_block_entry_next(file_block, htfile_file_block_entry_next(next_block));
            }
            if (NIL != htfile_file_block_entry_p(prev_block)) {
                write_file_block_entry_to_space(fht, prev_block, prev_block_address);
            }
            if (NIL != htfile_file_block_entry_p(file_block)) {
                write_file_block_entry_to_space(fht, file_block, file_block_address);
            }
            return free_list_head;
        }
    }

    /**
     *
     *
     * @param FHT;
    file-hash-table-p
     * 		
     * @param FREE-LIST-HEAD;
    positive-integer-p
     * 		
     * @param FILE-BLOCK;
    htfile-file-block-entry-p
     * 		
     * @param FIEL-BLOCK-ADDRESS;
    positive-integer-p
     * 		
     * @return positive-integer-p : the new free list head
    Inserts FILE-BLOCK with address FILE-BLOCK-ADDRESS in the free list for FHT.
    Returns the updated free list head for FHT.
     */
    @LispMethod(comment = "@param FHT;\nfile-hash-table-p\r\n\t\t\r\n@param FREE-LIST-HEAD;\npositive-integer-p\r\n\t\t\r\n@param FILE-BLOCK;\nhtfile-file-block-entry-p\r\n\t\t\r\n@param FIEL-BLOCK-ADDRESS;\npositive-integer-p\r\n\t\t\r\n@return positive-integer-p : the new free list head\r\nInserts FILE-BLOCK with address FILE-BLOCK-ADDRESS in the free list for FHT.\r\nReturns the updated free list head for FHT.")
    public static SubLObject insert_file_block_in_free_list(final SubLObject fht, final SubLObject free_list_head, final SubLObject file_block, SubLObject file_block_address) {
        SubLObject prev_block = new_htfile_file_block_entry(UNPROVIDED);
        SubLObject prev_block_address = free_list_head;
        final SubLObject next_block = new_htfile_file_block_entry(UNPROVIDED);
        SubLObject doneP = NIL;
        if (file_block_address.numL(free_list_head)) {
            if (add(file_block_address, htfile_file_block_entry_size(file_block)).numE(free_list_head)) {
                read_file_block_entry_from_space(fht, next_block, free_list_head);
                _csetf_htfile_file_block_entry_size(file_block, add(htfile_file_block_entry_size(file_block), htfile_file_block_entry_size(next_block)));
                _csetf_htfile_file_block_entry_next(file_block, htfile_file_block_entry_next(next_block));
            } else {
                _csetf_htfile_file_block_entry_next(file_block, free_list_head);
            }
            write_file_block_entry_to_space(fht, file_block, file_block_address);
            return file_block_address;
        }
        while ((NIL == doneP) && prev_block_address.numL(file_block_address)) {
            read_file_block_entry_from_space(fht, prev_block, prev_block_address);
            if (htfile_file_block_entry_next(prev_block).isPositive() && htfile_file_block_entry_next(prev_block).numL(file_block_address)) {
                prev_block_address = htfile_file_block_entry_next(prev_block);
            } else {
                doneP = T;
            }
        } 
        _csetf_htfile_file_block_entry_next(file_block, htfile_file_block_entry_next(prev_block));
        _csetf_htfile_file_block_entry_next(prev_block, file_block_address);
        if (add(prev_block_address, htfile_file_block_entry_size(prev_block)).numE(file_block_address)) {
            _csetf_htfile_file_block_entry_size(file_block, add(htfile_file_block_entry_size(prev_block), htfile_file_block_entry_size(file_block)));
            file_block_address = prev_block_address;
            prev_block = NIL;
        }
        if (add(file_block_address, htfile_file_block_entry_size(file_block)).numE(htfile_file_block_entry_next(file_block))) {
            read_file_block_entry_from_space(fht, next_block, htfile_file_block_entry_next(file_block));
            _csetf_htfile_file_block_entry_size(file_block, add(htfile_file_block_entry_size(next_block), htfile_file_block_entry_size(file_block)));
            _csetf_htfile_file_block_entry_next(file_block, htfile_file_block_entry_next(next_block));
        }
        if (NIL != htfile_file_block_entry_p(prev_block)) {
            write_file_block_entry_to_space(fht, prev_block, prev_block_address);
        }
        if (NIL != htfile_file_block_entry_p(file_block)) {
            write_file_block_entry_to_space(fht, file_block, file_block_address);
        }
        return free_list_head;
    }

    /**
     *
     *
     * @param FHT;
    file-hash-table-p
     * 		
     * @param SPACE-NEEDED;
    positive-integer-p
     * 		
     * @return NIL or positive-integer-p : the address of the space allocated if any
    Allocates SPACE-NEEDED number of bytes from the free list of FHT, if possible.
     */
    @LispMethod(comment = "@param FHT;\nfile-hash-table-p\r\n\t\t\r\n@param SPACE-NEEDED;\npositive-integer-p\r\n\t\t\r\n@return NIL or positive-integer-p : the address of the space allocated if any\r\nAllocates SPACE-NEEDED number of bytes from the free list of FHT, if possible.")
    public static final SubLObject allocate_object_space_from_free_list_alt(SubLObject fht, SubLObject space_needed) {
        {
            SubLObject header = file_hash_table_header(fht);
            SubLObject free_list_head = htfile_header_free_list_head(header);
            SubLObject temp_block = new_htfile_file_block_entry(UNPROVIDED);
            SubLObject next_block = new_htfile_file_block_entry(UNPROVIDED);
            SubLObject temp_block_address = free_list_head;
            SubLObject next_block_address = NIL;
            SubLObject leftover_space = NIL;
            SubLObject failP = NIL;
            SubLObject object_address = NIL;
            read_file_block_entry_from_space(fht, temp_block, temp_block_address);
            if (htfile_file_block_entry_size(temp_block).numGE(space_needed)) {
                object_address = temp_block_address;
                leftover_space = subtract(htfile_file_block_entry_size(temp_block), space_needed);
                if (leftover_space.numL($htfile_minimal_file_block_size$.getGlobalValue())) {
                    _csetf_htfile_header_free_list_head(header, htfile_file_block_entry_next(temp_block));
                } else {
                    _csetf_htfile_file_block_entry_size(temp_block, leftover_space);
                    temp_block_address = add(temp_block_address, space_needed);
                    write_file_block_entry_to_space(fht, temp_block, temp_block_address);
                    _csetf_htfile_header_free_list_head(header, temp_block_address);
                }
                return object_address;
            }
            next_block_address = htfile_file_block_entry_next(temp_block);
            if (!next_block_address.isPositive()) {
                return NIL;
            }
            read_file_block_entry_from_space(fht, next_block, next_block_address);
            while ((NIL == failP) && htfile_file_block_entry_size(next_block).numL(space_needed)) {
                temp_block_address = next_block_address;
                copy_file_block(next_block, temp_block);
                next_block_address = htfile_file_block_entry_next(temp_block);
                if (next_block_address.isPositive()) {
                    read_file_block_entry_from_space(fht, next_block, next_block_address);
                } else {
                    failP = T;
                }
            } 
            if (NIL == failP) {
                object_address = next_block_address;
                leftover_space = subtract(htfile_file_block_entry_size(next_block), space_needed);
                if (leftover_space.numL($htfile_minimal_file_block_size$.getGlobalValue())) {
                    _csetf_htfile_file_block_entry_next(temp_block, htfile_file_block_entry_next(next_block));
                    write_file_block_entry_to_space(fht, temp_block, temp_block_address);
                } else {
                    _csetf_htfile_file_block_entry_size(next_block, leftover_space);
                    next_block_address = add(next_block_address, space_needed);
                    _csetf_htfile_file_block_entry_next(temp_block, next_block_address);
                    write_file_block_entry_to_space(fht, temp_block, temp_block_address);
                    write_file_block_entry_to_space(fht, next_block, next_block_address);
                }
            }
            return object_address;
        }
    }

    /**
     *
     *
     * @param FHT;
    file-hash-table-p
     * 		
     * @param SPACE-NEEDED;
    positive-integer-p
     * 		
     * @return NIL or positive-integer-p : the address of the space allocated if any
    Allocates SPACE-NEEDED number of bytes from the free list of FHT, if possible.
     */
    @LispMethod(comment = "@param FHT;\nfile-hash-table-p\r\n\t\t\r\n@param SPACE-NEEDED;\npositive-integer-p\r\n\t\t\r\n@return NIL or positive-integer-p : the address of the space allocated if any\r\nAllocates SPACE-NEEDED number of bytes from the free list of FHT, if possible.")
    public static SubLObject allocate_object_space_from_free_list(final SubLObject fht, final SubLObject space_needed) {
        final SubLObject header = file_hash_table_header(fht);
        final SubLObject free_list_head = htfile_header_free_list_head(header);
        final SubLObject temp_block = new_htfile_file_block_entry(UNPROVIDED);
        final SubLObject next_block = new_htfile_file_block_entry(UNPROVIDED);
        SubLObject temp_block_address = free_list_head;
        SubLObject next_block_address = NIL;
        SubLObject leftover_space = NIL;
        SubLObject failP = NIL;
        SubLObject object_address = NIL;
        read_file_block_entry_from_space(fht, temp_block, temp_block_address);
        if (htfile_file_block_entry_size(temp_block).numGE(space_needed)) {
            object_address = temp_block_address;
            leftover_space = subtract(htfile_file_block_entry_size(temp_block), space_needed);
            if (leftover_space.numL($htfile_minimal_file_block_size$.getGlobalValue())) {
                _csetf_htfile_header_free_list_head(header, htfile_file_block_entry_next(temp_block));
            } else {
                _csetf_htfile_file_block_entry_size(temp_block, leftover_space);
                temp_block_address = add(temp_block_address, space_needed);
                write_file_block_entry_to_space(fht, temp_block, temp_block_address);
                _csetf_htfile_header_free_list_head(header, temp_block_address);
            }
            return object_address;
        }
        next_block_address = htfile_file_block_entry_next(temp_block);
        if (!next_block_address.isPositive()) {
            return NIL;
        }
        read_file_block_entry_from_space(fht, next_block, next_block_address);
        while ((NIL == failP) && htfile_file_block_entry_size(next_block).numL(space_needed)) {
            temp_block_address = next_block_address;
            copy_file_block(next_block, temp_block);
            next_block_address = htfile_file_block_entry_next(temp_block);
            if (next_block_address.isPositive()) {
                read_file_block_entry_from_space(fht, next_block, next_block_address);
            } else {
                failP = T;
            }
        } 
        if (NIL == failP) {
            object_address = next_block_address;
            leftover_space = subtract(htfile_file_block_entry_size(next_block), space_needed);
            if (leftover_space.numL($htfile_minimal_file_block_size$.getGlobalValue())) {
                _csetf_htfile_file_block_entry_next(temp_block, htfile_file_block_entry_next(next_block));
                write_file_block_entry_to_space(fht, temp_block, temp_block_address);
            } else {
                _csetf_htfile_file_block_entry_size(next_block, leftover_space);
                next_block_address = add(next_block_address, space_needed);
                _csetf_htfile_file_block_entry_next(temp_block, next_block_address);
                write_file_block_entry_to_space(fht, temp_block, temp_block_address);
                write_file_block_entry_to_space(fht, next_block, next_block_address);
            }
        }
        return object_address;
    }

    /**
     * Given a newly allocated file hash table, write out its initial image to
     * disk. This means writing the blank header, then writing out the heap,
     * followed by the empty key table.
     */
    @LispMethod(comment = "Given a newly allocated file hash table, write out its initial image to\r\ndisk. This means writing the blank header, then writing out the heap,\r\nfollowed by the empty key table.\nGiven a newly allocated file hash table, write out its initial image to\ndisk. This means writing the blank header, then writing out the heap,\nfollowed by the empty key table.")
    public static final SubLObject write_initial_table_alt(SubLObject fht) {
        write_fht_header(fht);
        allocate_fht_heap_space(fht);
        allocate_fht_key_space(fht, UNPROVIDED);
        return fht;
    }

    /**
     * Given a newly allocated file hash table, write out its initial image to
     * disk. This means writing the blank header, then writing out the heap,
     * followed by the empty key table.
     */
    @LispMethod(comment = "Given a newly allocated file hash table, write out its initial image to\r\ndisk. This means writing the blank header, then writing out the heap,\r\nfollowed by the empty key table.\nGiven a newly allocated file hash table, write out its initial image to\ndisk. This means writing the blank header, then writing out the heap,\nfollowed by the empty key table.")
    public static SubLObject write_initial_table(final SubLObject fht) {
        write_fht_header(fht);
        allocate_fht_heap_space(fht);
        allocate_fht_key_space(fht, UNPROVIDED);
        return fht;
    }

    public static final SubLObject allocate_fht_heap_space_alt(SubLObject fht) {
        {
            SubLObject stream = file_hash_table_stream(fht);
            SubLObject header = file_hash_table_header(fht);
            SubLObject object_space = htfile_header_object_space_offset(header);
            SubLObject key_space = htfile_header_key_space_offset(header);
            compatibility.set_file_position(stream, object_space);
            force_output(stream);
            compatibility.set_file_position(stream, key_space);
            force_output(stream);
        }
        return fht;
    }

    public static SubLObject allocate_fht_heap_space(final SubLObject fht) {
        final SubLObject stream = file_hash_table_stream(fht);
        final SubLObject header = file_hash_table_header(fht);
        final SubLObject object_space = htfile_header_object_space_offset(header);
        final SubLObject key_space = htfile_header_key_space_offset(header);
        compatibility.set_file_position(stream, object_space);
        force_output(stream);
        compatibility.set_file_position(stream, key_space);
        force_output(stream);
        return fht;
    }

    public static final SubLObject allocate_fht_key_space_alt(SubLObject fht, SubLObject capacity) {
        if (capacity == UNPROVIDED) {
            capacity = NIL;
        }
        {
            SubLObject stream = file_hash_table_stream(fht);
            SubLObject header = file_hash_table_header(fht);
            if (!capacity.isInteger()) {
                capacity = htfile_header_capacity(header);
            }
            {
                SubLObject i = NIL;
                for (i = ZERO_INTEGER; i.numL(capacity); i = add(i, ONE_INTEGER)) {
                    write_key_entry_object(stream, $fht_empty_key_entry$.getGlobalValue());
                }
            }
            force_output(stream);
        }
        return fht;
    }

    public static SubLObject allocate_fht_key_space(final SubLObject fht, SubLObject capacity) {
        if (capacity == UNPROVIDED) {
            capacity = NIL;
        }
        final SubLObject stream = file_hash_table_stream(fht);
        final SubLObject header = file_hash_table_header(fht);
        if (!capacity.isInteger()) {
            capacity = htfile_header_capacity(header);
        }
        SubLObject i;
        for (i = NIL, i = ZERO_INTEGER; i.numL(capacity); i = add(i, ONE_INTEGER)) {
            write_key_entry_object(stream, $fht_empty_key_entry$.getGlobalValue());
        }
        force_output(stream);
        return fht;
    }

    public static final SubLObject htfile_minimal_space_required_for_key_alt() {
        return $htfile_key_entry_size$.getGlobalValue();
    }

    public static SubLObject htfile_minimal_space_required_for_key() {
        return $htfile_key_entry_size$.getGlobalValue();
    }

    public static final SubLObject fht_key_index_to_reladdr_alt(SubLObject index) {
        return multiply(index, $htfile_key_entry_size$.getGlobalValue());
    }

    public static SubLObject fht_key_index_to_reladdr(final SubLObject index) {
        return multiply(index, $htfile_key_entry_size$.getGlobalValue());
    }

    public static final SubLObject fht_keyspace_byte_size_alt(SubLObject capacity) {
        return fht_key_index_to_reladdr(capacity);
    }

    public static SubLObject fht_keyspace_byte_size(final SubLObject capacity) {
        return fht_key_index_to_reladdr(capacity);
    }

    public static final SubLObject valid_heap_offset_p_alt(SubLObject offset, SubLObject heap_start, SubLObject heap_end) {
        return makeBoolean((!offset.numL(heap_start)) && offset.numL(heap_end));
    }

    public static SubLObject valid_heap_offset_p(final SubLObject offset, final SubLObject heap_start, final SubLObject heap_end) {
        return makeBoolean((!offset.numL(heap_start)) && offset.numL(heap_end));
    }

    public static final SubLObject valid_fht_heap_offset_p_alt(SubLObject offset, SubLObject fht) {
        {
            SubLObject header = file_hash_table_header(fht);
            return valid_heap_offset_p(offset, htfile_header_object_space_offset(header), htfile_header_key_space_offset(header));
        }
    }

    public static SubLObject valid_fht_heap_offset_p(final SubLObject offset, final SubLObject fht) {
        final SubLObject header = file_hash_table_header(fht);
        return valid_heap_offset_p(offset, htfile_header_object_space_offset(header), htfile_header_key_space_offset(header));
    }

    public static final SubLObject valid_offset_in_keyspace_p_alt(SubLObject offset, SubLObject keyspace_offset, SubLObject capacity) {
        return makeBoolean((!offset.numL(keyspace_offset)) && offset.numL(add(keyspace_offset, fht_keyspace_byte_size(capacity))));
    }

    public static SubLObject valid_offset_in_keyspace_p(final SubLObject offset, final SubLObject keyspace_offset, final SubLObject capacity) {
        return makeBoolean((!offset.numL(keyspace_offset)) && offset.numL(add(keyspace_offset, fht_keyspace_byte_size(capacity))));
    }

    public static final SubLObject fht_get_keyspace_size_alt(SubLObject fht) {
        {
            SubLObject header = file_hash_table_header(fht);
            return fht_keyspace_byte_size(htfile_header_capacity(header));
        }
    }

    public static SubLObject fht_get_keyspace_size(final SubLObject fht) {
        final SubLObject header = file_hash_table_header(fht);
        return fht_keyspace_byte_size(htfile_header_capacity(header));
    }

    public static final SubLObject fht_key_reladdr_to_address_alt(SubLObject fht, SubLObject reladdr) {
        return add(reladdr, htfile_header_key_space_offset(file_hash_table_header(fht)));
    }

    public static SubLObject fht_key_reladdr_to_address(final SubLObject fht, final SubLObject reladdr) {
        return add(reladdr, htfile_header_key_space_offset(file_hash_table_header(fht)));
    }

    public static final SubLObject fht_key_index_to_address_alt(SubLObject fht, SubLObject index) {
        {
            SubLObject key_offset = fht_key_index_to_reladdr(index);
            return fht_key_reladdr_to_address(fht, key_offset);
        }
    }

    public static SubLObject fht_key_index_to_address(final SubLObject fht, final SubLObject index) {
        final SubLObject key_offset = fht_key_index_to_reladdr(index);
        return fht_key_reladdr_to_address(fht, key_offset);
    }

    public static final SubLObject validate_fht_key_index_alt(SubLObject fht, SubLObject index) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject key_capacity = htfile_header_capacity(file_hash_table_header(fht));
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (!((index.isInteger() && (!index.isNegative())) && index.numL(key_capacity))) {
                        Errors.error($str_alt301$Invalid_key_index__D_into_key_spa, index, key_capacity);
                    }
                }
            }
            return fht;
        }
    }

    public static SubLObject validate_fht_key_index(final SubLObject fht, final SubLObject index) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject key_capacity = htfile_header_capacity(file_hash_table_header(fht));
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (((!index.isInteger()) || index.isNegative()) || (!index.numL(key_capacity)))) {
            Errors.error($str343$Invalid_key_index__D_into_key_spa, index, key_capacity);
        }
        return fht;
    }

    public static SubLObject validate_fht_key_entry(final SubLObject fht, final SubLObject key_entry) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject key_space_start = htfile_header_key_space_offset(file_hash_table_header(fht));
        final SubLObject key_offset = htfile_key_entry_key_offset(key_entry);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ((NIL == subl_promotions.non_negative_integer_p(key_offset)) || (!key_offset.numL(key_space_start)))) {
            Errors.error($str344$Invalid_key_offset__A__points_pas, key_offset, key_space_start);
        }
        return fht;
    }

    public static final SubLObject write_key_entry_object_alt(SubLObject stream, SubLObject key_entry) {
        write_fht_uint8(stream, htfile_key_entry_key_offset(key_entry));
        write_fht_uint4(stream, htfile_key_entry_hash_code(key_entry));
        return stream;
    }

    public static SubLObject write_key_entry_object(final SubLObject stream, final SubLObject key_entry) {
        write_fht_uint8(stream, htfile_key_entry_key_offset(key_entry));
        write_fht_uint4(stream, htfile_key_entry_hash_code(key_entry));
        return stream;
    }

    public static final SubLObject read_key_entry_object_alt(SubLObject stream, SubLObject key_entry) {
        _csetf_htfile_key_entry_key_offset(key_entry, read_fht_uint8(stream));
        _csetf_htfile_key_entry_hash_code(key_entry, read_fht_uint4(stream));
        return key_entry;
    }

    public static SubLObject read_key_entry_object(final SubLObject stream, final SubLObject key_entry) {
        _csetf_htfile_key_entry_key_offset(key_entry, read_fht_uint8(stream));
        _csetf_htfile_key_entry_hash_code(key_entry, read_fht_uint4(stream));
        return key_entry;
    }

    /**
     * Given the index in the key space, read the contents into the
     * key entry object provided.
     */
    @LispMethod(comment = "Given the index in the key space, read the contents into the\r\nkey entry object provided.\nGiven the index in the key space, read the contents into the\nkey entry object provided.")
    public static final SubLObject fetch_fht_key_entry_alt(SubLObject fht, SubLObject index, SubLObject key_entry) {
        validate_fht_key_index(fht, index);
        {
            SubLObject address = fht_key_index_to_address(fht, index);
            SubLObject stream = file_hash_table_stream(fht);
            file_position(stream, address);
            read_key_entry_object(stream, key_entry);
            if ((NIL == htfile_key_entry_hash_code(key_entry)) || (NIL == htfile_key_entry_key_offset(key_entry))) {
                key_entry = $fht_empty_key_entry$.getGlobalValue();
            }
        }
        return key_entry;
    }

    /**
     * Given the index in the key space, read the contents into the
     * key entry object provided.
     */
    @LispMethod(comment = "Given the index in the key space, read the contents into the\r\nkey entry object provided.\nGiven the index in the key space, read the contents into the\nkey entry object provided.")
    public static SubLObject fetch_fht_key_entry(final SubLObject fht, final SubLObject index, final SubLObject key_entry) {
        validate_fht_key_index(fht, index);
        final SubLObject address = fht_key_index_to_address(fht, index);
        final SubLObject stream = file_hash_table_stream(fht);
        file_position(stream, address);
        read_key_entry_object(stream, key_entry);
        if (NIL == htfile_key_entry_hash_code(key_entry)) {
            Errors.warn($str345$Index__A_has_null_hash_code_, index);
            _csetf_htfile_key_entry_hash_code(key_entry, htfile_key_entry_hash_code($fht_empty_key_entry$.getGlobalValue()));
        }
        if (NIL == htfile_key_entry_key_offset(key_entry)) {
            Errors.warn($str346$Index__A_has_null_key_offset_, index);
            _csetf_htfile_key_entry_key_offset(key_entry, htfile_key_entry_key_offset($fht_empty_key_entry$.getGlobalValue()));
        }
        validate_fht_key_entry(fht, key_entry);
        return key_entry;
    }

    public static final SubLObject store_fht_key_entry(SubLObject fht, SubLObject index, SubLObject key_entry) {
        validate_fht_key_index(fht, index);
        {
            SubLObject address = fht_key_index_to_address(fht, index);
            SubLObject stream = file_hash_table_stream(fht);
            file_position(stream, address);
            write_key_entry_object(stream, key_entry);
            force_output(stream);
        }
        return key_entry;
    }

    public static SubLObject store_fht_key_entry(final SubLObject fht, final SubLObject index, final SubLObject key_entry, SubLObject should_flushP) {
        if (should_flushP == UNPROVIDED) {
            should_flushP = T;
        }
        validate_fht_key_index(fht, index);
        validate_fht_key_entry(fht, key_entry);
        final SubLObject address = fht_key_index_to_address(fht, index);
        final SubLObject stream = file_hash_table_stream(fht);
        file_position(stream, address);
        write_key_entry_object(stream, key_entry);
        if (NIL != should_flushP) {
            force_output(stream);
        }
        return key_entry;
    }

    public static final SubLObject fht_hash_alt(SubLObject key_code, SubLObject fht) {
        {
            SubLObject capacity = htfile_header_capacity(file_hash_table_header(fht));
            SubLObject size = subtract(capacity, ONE_INTEGER);
            return logand(multiply(key_code, $fht_hash_constant_a$.getGlobalValue()), size);
        }
    }

    public static SubLObject fht_hash(final SubLObject key_code, final SubLObject fht) {
        final SubLObject capacity = htfile_header_capacity(file_hash_table_header(fht));
        final SubLObject size = subtract(capacity, ONE_INTEGER);
        return logand(multiply(key_code, $fht_hash_constant_a$.getGlobalValue()), size);
    }

    public static final SubLObject fht_ensure_hash_table_size_alt(SubLObject size) {
        if (size.numL($fht_hash_step_size$.getGlobalValue())) {
            size = $fht_hash_step_size$.getGlobalValue();
        }
        {
            SubLObject i = $fht_hash_next_step_pow2$.getGlobalValue();
            SubLObject fract = integerDivide(multiply(i, THREE_INTEGER), FOUR_INTEGER);
            while (fract.numL(size)) {
                i = add(i, i);
                fract = integerDivide(multiply(i, THREE_INTEGER), FOUR_INTEGER);
            } 
            return i;
        }
    }

    public static SubLObject fht_ensure_hash_table_size(SubLObject size) {
        if (size.numL($fht_hash_step_size$.getGlobalValue())) {
            size = $fht_hash_step_size$.getGlobalValue();
        }
        SubLObject i = $fht_hash_next_step_pow2$.getGlobalValue();
        for (SubLObject fract = integerDivide(multiply(i, THREE_INTEGER), FOUR_INTEGER); fract.numL(size); fract = integerDivide(multiply(i, THREE_INTEGER), FOUR_INTEGER)) {
            i = add(i, i);
        }
        return i;
    }

    public static final SubLObject fht_compute_fence_post_index_alt(SubLObject index, SubLObject fht) {
        {
            SubLObject capacity = htfile_header_capacity(file_hash_table_header(fht));
            index = add(index, $fht_hash_step_size$.getGlobalValue());
            while (index.numGE(capacity)) {
                index = subtract(index, capacity);
            } 
            return index;
        }
    }

    public static SubLObject fht_compute_fence_post_index(SubLObject index, final SubLObject fht) {
        SubLObject capacity;
        for (capacity = htfile_header_capacity(file_hash_table_header(fht)), index = add(index, $fht_hash_step_size$.getGlobalValue()); index.numGE(capacity); index = subtract(index, capacity)) {
        }
        return index;
    }

    public static final SubLObject fht_step_key_index_alt(SubLObject index, SubLObject fht) {
        {
            SubLObject capacity = htfile_header_capacity(file_hash_table_header(fht));
            index = subtract(index, $fht_hash_step_size$.getGlobalValue());
            while (index.isNegative()) {
                index = add(index, capacity);
            } 
            return index;
        }
    }

    public static SubLObject fht_step_key_index(SubLObject index, final SubLObject fht) {
        SubLObject capacity;
        for (capacity = htfile_header_capacity(file_hash_table_header(fht)), index = subtract(index, $fht_hash_step_size$.getGlobalValue()); index.isNegative(); index = add(index, capacity)) {
        }
        return index;
    }

    /**
     * Search through the key table and check if we can find the entry.
     * Return it if found, otherwise return either the empty key or
     * the tombstone for full table.
     */
    @LispMethod(comment = "Search through the key table and check if we can find the entry.\r\nReturn it if found, otherwise return either the empty key or\r\nthe tombstone for full table.\nSearch through the key table and check if we can find the entry.\nReturn it if found, otherwise return either the empty key or\nthe tombstone for full table.")
    public static final SubLObject fht_lookup_key_alt(SubLObject fht, SubLObject key, SubLObject known_key_code) {
        if (known_key_code == UNPROVIDED) {
            known_key_code = NIL;
        }
        {
            SubLObject key_entry = make_htfile_key_entry(UNPROVIDED);
            SubLObject object_entry = make_htfile_object_entry(UNPROVIDED);
            SubLObject hash_fn = file_hash_table_hash_fn(fht);
            SubLObject key_code = (known_key_code.isNumber()) ? ((SubLObject) (known_key_code)) : fht_sxhash(key, hash_fn);
            SubLObject index = fht_hash(key_code, fht);
            SubLObject wrap_around = fht_compute_fence_post_index(index, fht);
            SubLObject done = NIL;
            while (NIL == done) {
                fetch_fht_key_entry(fht, index, key_entry);
                if (NIL != is_empty_key_entryP(key_entry)) {
                    _csetf_htfile_key_entry_hash_code(key_entry, key_code);
                    return values($NOT_FOUND, index, key_entry, object_entry);
                } else {
                    if (NIL != identical_fht_key_entryP(fht, key, key_code, key_entry, object_entry)) {
                        return values($FOUND, index, key_entry, object_entry);
                    } else {
                        if (index.numE(wrap_around)) {
                            return values($TABLE_FULL, index, key_entry, object_entry);
                        }
                    }
                }
                index = fht_step_key_index(index, fht);
            } 
            return values($ERROR, index, key_entry, object_entry);
        }
    }

    /**
     * Search through the key table and check if we can find the entry.
     * Return it if found, otherwise return either the empty key or
     * the tombstone for full table.
     */
    @LispMethod(comment = "Search through the key table and check if we can find the entry.\r\nReturn it if found, otherwise return either the empty key or\r\nthe tombstone for full table.\nSearch through the key table and check if we can find the entry.\nReturn it if found, otherwise return either the empty key or\nthe tombstone for full table.")
    public static SubLObject fht_lookup_key(final SubLObject fht, final SubLObject key, SubLObject known_key_code) {
        if (known_key_code == UNPROVIDED) {
            known_key_code = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject key_entry = make_htfile_key_entry(UNPROVIDED);
        final SubLObject object_entry = make_htfile_object_entry(UNPROVIDED);
        final SubLObject hash_fn = file_hash_table_hash_fn(fht);
        final SubLObject key_code = (known_key_code.isNumber()) ? known_key_code : fht_sxhash(key, hash_fn);
        SubLObject index = fht_hash(key_code, fht);
        final SubLObject wrap_around = fht_compute_fence_post_index(index, fht);
        SubLObject iterations = ZERO_INTEGER;
        final SubLObject done = NIL;
        if (NIL != $fht_lookup_stream$.getDynamicValue(thread)) {
            format($fht_lookup_stream$.getDynamicValue(thread), $str348$__FHT_LOOKUP__A_I__A__H__A___, new SubLObject[]{ key, index, key_code });
        }
        while (NIL == done) {
            fetch_fht_key_entry(fht, index, key_entry);
            iterations = add(iterations, ONE_INTEGER);
            if (NIL != is_empty_key_entryP(key_entry)) {
                _csetf_htfile_key_entry_hash_code(key_entry, key_code);
                if (NIL != $fht_lookup_stream$.getDynamicValue(thread)) {
                    format($fht_lookup_stream$.getDynamicValue(thread), $str349$__FHT_LOOKUP__empty_key_iter__A_L, iterations, index);
                }
                return values($NOT_FOUND, index, key_entry, object_entry, iterations);
            }
            if (NIL != identical_fht_key_entryP(fht, key, key_code, key_entry, object_entry)) {
                if (NIL != $fht_lookup_stream$.getDynamicValue(thread)) {
                    format($fht_lookup_stream$.getDynamicValue(thread), $str350$__FHT_LOOKUP__found_iter__A_LastI, iterations, index);
                }
                return values($FOUND, index, key_entry, object_entry, iterations);
            }
            if (index.numE(wrap_around)) {
                if (NIL != $fht_lookup_stream$.getDynamicValue(thread)) {
                    format($fht_lookup_stream$.getDynamicValue(thread), $str351$__FHT_LOOKUP__table_full_iter__A_, iterations, index);
                }
                return values($TABLE_FULL, index, key_entry, object_entry, iterations);
            }
            index = fht_step_key_index(index, fht);
            if (NIL == $fht_lookup_stream$.getDynamicValue(thread)) {
                continue;
            }
            format($fht_lookup_stream$.getDynamicValue(thread), $str352$__FHT_LOOKUP_probe_I__A__, index);
        } 
        if (NIL != $fht_lookup_stream$.getDynamicValue(thread)) {
            format($fht_lookup_stream$.getDynamicValue(thread), $str353$__FHT_LOOKUP__error_iter__A_LastI, iterations, index);
        }
        return values($ERROR, index, key_entry, object_entry, iterations);
    }

    public static final SubLObject identical_fht_key_entryP_alt(SubLObject fht, SubLObject key, SubLObject code, SubLObject key_entry, SubLObject object_entry) {
        {
            SubLObject testfn = file_hash_table_testfn(fht);
            SubLObject address = htfile_key_entry_key_offset(key_entry);
            if (!code.numE(htfile_key_entry_hash_code(key_entry))) {
                return NIL;
            }
            read_object_entry_from_space(fht, object_entry, address, $KEY_ONLY);
            return funcall(testfn, key, htfile_object_entry_key(object_entry));
        }
    }

    public static SubLObject identical_fht_key_entryP(final SubLObject fht, final SubLObject key, final SubLObject code, final SubLObject key_entry, final SubLObject object_entry) {
        final SubLObject testfn = file_hash_table_testfn(fht);
        final SubLObject address = htfile_key_entry_key_offset(key_entry);
        if (!code.numE(htfile_key_entry_hash_code(key_entry))) {
            return NIL;
        }
        read_object_entry_from_space(fht, object_entry, address, $KEY_ONLY);
        return funcall(testfn, key, htfile_object_entry_key(object_entry));
    }

    public static final SubLObject complete_fht_object_entry_for_key_alt(SubLObject fht, SubLObject key_entry, SubLObject object_entry, SubLObject style) {
        if (style == UNPROVIDED) {
            style = $FULL;
        }
        {
            SubLObject address = htfile_key_entry_key_offset(key_entry);
            read_object_entry_from_space(fht, object_entry, address, style);
            return object_entry;
        }
    }

    public static SubLObject complete_fht_object_entry_for_key(final SubLObject fht, final SubLObject key_entry, final SubLObject object_entry, SubLObject style) {
        if (style == UNPROVIDED) {
            style = $FULL;
        }
        final SubLObject address = htfile_key_entry_key_offset(key_entry);
        read_object_entry_from_space(fht, object_entry, address, style);
        return object_entry;
    }

    /**
     * Check whether the last insert just bumped the table size past the
     * critical limit; if so, resize the table to a larger size. Do this
     * by doubling the current object space size (based on the past need)
     * and by moving the keyspace accordingly.
     */
    @LispMethod(comment = "Check whether the last insert just bumped the table size past the\r\ncritical limit; if so, resize the table to a larger size. Do this\r\nby doubling the current object space size (based on the past need)\r\nand by moving the keyspace accordingly.\nCheck whether the last insert just bumped the table size past the\ncritical limit; if so, resize the table to a larger size. Do this\nby doubling the current object space size (based on the past need)\nand by moving the keyspace accordingly.")
    public static final SubLObject potentially_grow_fht_table_alt(SubLObject fht) {
        if (NIL != is_fht_too_smallP(fht)) {
            perform_grow_fht_table(fht);
        }
        return fht;
    }

    /**
     * Check whether the last insert just bumped the table size past the
     * critical limit; if so, resize the table to a larger size. Do this
     * by doubling the current object space size (based on the past need)
     * and by moving the keyspace accordingly.
     */
    @LispMethod(comment = "Check whether the last insert just bumped the table size past the\r\ncritical limit; if so, resize the table to a larger size. Do this\r\nby doubling the current object space size (based on the past need)\r\nand by moving the keyspace accordingly.\nCheck whether the last insert just bumped the table size past the\ncritical limit; if so, resize the table to a larger size. Do this\nby doubling the current object space size (based on the past need)\nand by moving the keyspace accordingly.")
    public static SubLObject potentially_grow_fht_table(final SubLObject fht) {
        if (NIL != is_fht_too_smallP(fht)) {
            perform_grow_fht_table(fht);
        }
        return fht;
    }

    public static final SubLObject perform_grow_fht_table_alt(SubLObject fht) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject header = file_hash_table_header(fht);
                thread.resetMultipleValues();
                {
                    SubLObject new_keyspace = resize_fht_object_and_key_spaces(fht);
                    SubLObject new_capacity = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    allocate_new_fht_key_space(fht, new_keyspace, new_capacity);
                    rehash_fht_key_space(fht, new_keyspace, new_capacity);
                    _csetf_htfile_header_key_space_offset(header, new_keyspace);
                    _csetf_htfile_header_capacity(header, new_capacity);
                    write_fht_header(fht);
                }
            }
            return fht;
        }
    }

    public static SubLObject perform_grow_fht_table(final SubLObject fht) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject header = file_hash_table_header(fht);
        thread.resetMultipleValues();
        final SubLObject new_keyspace = resize_fht_object_and_key_spaces(fht);
        final SubLObject new_capacity = thread.secondMultipleValue();
        thread.resetMultipleValues();
        allocate_new_fht_key_space(fht, new_keyspace, new_capacity);
        rehash_fht_key_space(fht, new_keyspace, new_capacity);
        _csetf_htfile_header_key_space_offset(header, new_keyspace);
        _csetf_htfile_header_capacity(header, new_capacity);
        write_fht_header(fht);
        return fht;
    }

    public static final SubLObject is_fht_too_smallP_alt(SubLObject fht) {
        {
            SubLObject header = file_hash_table_header(fht);
            SubLObject count = htfile_header_item_count(header);
            SubLObject capacity = htfile_header_capacity(header);
            return numG(count, integerDivide(multiply(capacity, $fht_dknuths_magic_cutoff$.getGlobalValue()), $int$100));
        }
    }

    public static SubLObject is_fht_too_smallP(final SubLObject fht) {
        final SubLObject header = file_hash_table_header(fht);
        final SubLObject count = htfile_header_item_count(header);
        final SubLObject capacity = htfile_header_capacity(header);
        return numG(count, integerDivide(multiply(capacity, $fht_dknuths_magic_cutoff$.getGlobalValue()), $int$100));
    }

    /**
     * Compute the new sizes for the object heap and the
     * key space. Then double the capacity.
     */
    @LispMethod(comment = "Compute the new sizes for the object heap and the\r\nkey space. Then double the capacity.\nCompute the new sizes for the object heap and the\nkey space. Then double the capacity.")
    public static final SubLObject resize_fht_object_and_key_spaces_alt(SubLObject fht) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject header = file_hash_table_header(fht);
                SubLObject capacity = htfile_header_capacity(header);
                capacity = add(capacity, capacity);
                thread.resetMultipleValues();
                {
                    SubLObject old_key_space = compute_new_htfile_heap_size(fht, UNPROVIDED);
                    SubLObject new_key_space = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    return values(new_key_space, capacity);
                }
            }
        }
    }

    /**
     * Compute the new sizes for the object heap and the
     * key space. Then double the capacity.
     */
    @LispMethod(comment = "Compute the new sizes for the object heap and the\r\nkey space. Then double the capacity.\nCompute the new sizes for the object heap and the\nkey space. Then double the capacity.")
    public static SubLObject resize_fht_object_and_key_spaces(final SubLObject fht) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject header = file_hash_table_header(fht);
        SubLObject capacity = htfile_header_capacity(header);
        capacity = add(capacity, capacity);
        thread.resetMultipleValues();
        final SubLObject old_key_space = compute_new_htfile_heap_size(fht, UNPROVIDED);
        final SubLObject new_key_space = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return values(new_key_space, capacity);
    }

    /**
     * This function zeroes out the new space, so that the empty
     * keys and the tombstones are properly recognized.
     */
    @LispMethod(comment = "This function zeroes out the new space, so that the empty\r\nkeys and the tombstones are properly recognized.\nThis function zeroes out the new space, so that the empty\nkeys and the tombstones are properly recognized.")
    public static final SubLObject allocate_new_fht_key_space_alt(SubLObject fht, SubLObject new_keyspace, SubLObject new_capacity) {
        {
            SubLObject stream = file_hash_table_stream(fht);
            file_position(stream, new_keyspace);
            allocate_fht_key_space(fht, new_capacity);
        }
        return fht;
    }

    /**
     * This function zeroes out the new space, so that the empty
     * keys and the tombstones are properly recognized.
     */
    @LispMethod(comment = "This function zeroes out the new space, so that the empty\r\nkeys and the tombstones are properly recognized.\nThis function zeroes out the new space, so that the empty\nkeys and the tombstones are properly recognized.")
    public static SubLObject allocate_new_fht_key_space(final SubLObject fht, final SubLObject new_keyspace, final SubLObject new_capacity) {
        final SubLObject stream = file_hash_table_stream(fht);
        file_position(stream, new_keyspace);
        allocate_fht_key_space(fht, new_capacity);
        return fht;
    }

    /**
     * Given the file position offsets of where the keyspace is currently
     * located and where it should be, move it to there. Use the fht to
     * figure out the size of the keyspace.
     */
    @LispMethod(comment = "Given the file position offsets of where the keyspace is currently\r\nlocated and where it should be, move it to there. Use the fht to\r\nfigure out the size of the keyspace.\nGiven the file position offsets of where the keyspace is currently\nlocated and where it should be, move it to there. Use the fht to\nfigure out the size of the keyspace.")
    public static final SubLObject move_htfile_key_space_alt(SubLObject fht, SubLObject from, SubLObject to) {
        {
            SubLObject stream = file_hash_table_stream(fht);
            SubLObject block = make_vector($keyspace_move_size$.getGlobalValue(), UNPROVIDED);
            SubLObject key_space_size = fht_get_keyspace_size(fht);
            SubLObject full_blocks = integerDivide(key_space_size, $keyspace_move_size$.getGlobalValue());
            SubLObject last_block_size = mod(key_space_size, $keyspace_move_size$.getGlobalValue());
            SubLObject i = NIL;
            for (i = ZERO_INTEGER; i.numL(full_blocks); i = add(i, ONE_INTEGER)) {
                move_fht_binary_block(stream, block, $keyspace_move_size$.getGlobalValue(), from, to);
                from = add(from, $keyspace_move_size$.getGlobalValue());
                to = add(to, $keyspace_move_size$.getGlobalValue());
            }
            if (last_block_size.isPositive()) {
                move_fht_binary_block(stream, block, last_block_size, from, to);
            }
        }
        return fht;
    }

    /**
     * Given the file position offsets of where the keyspace is currently
     * located and where it should be, move it to there. Use the fht to
     * figure out the size of the keyspace.
     */
    @LispMethod(comment = "Given the file position offsets of where the keyspace is currently\r\nlocated and where it should be, move it to there. Use the fht to\r\nfigure out the size of the keyspace.\nGiven the file position offsets of where the keyspace is currently\nlocated and where it should be, move it to there. Use the fht to\nfigure out the size of the keyspace.")
    public static SubLObject move_htfile_key_space(final SubLObject fht, SubLObject from, SubLObject to) {
        final SubLObject stream = file_hash_table_stream(fht);
        final SubLObject block = make_vector($keyspace_move_size$.getGlobalValue(), UNPROVIDED);
        final SubLObject key_space_size = fht_get_keyspace_size(fht);
        final SubLObject full_blocks = integerDivide(key_space_size, $keyspace_move_size$.getGlobalValue());
        final SubLObject last_block_size = mod(key_space_size, $keyspace_move_size$.getGlobalValue());
        SubLObject i;
        for (i = NIL, i = ZERO_INTEGER; i.numL(full_blocks); i = add(i, ONE_INTEGER)) {
            move_fht_binary_block(stream, block, $keyspace_move_size$.getGlobalValue(), from, to);
            from = add(from, $keyspace_move_size$.getGlobalValue());
            to = add(to, $keyspace_move_size$.getGlobalValue());
        }
        if (last_block_size.isPositive()) {
            move_fht_binary_block(stream, block, last_block_size, from, to);
        }
        return fht;
    }

    /**
     * Take the entries at the old keyspace and rehash them into their respective
     * new locations; do so in batches of Rehash Cache Size so that we can handle
     * key spaces too large to load into memory.
     */
    @LispMethod(comment = "Take the entries at the old keyspace and rehash them into their respective\r\nnew locations; do so in batches of Rehash Cache Size so that we can handle\r\nkey spaces too large to load into memory.\nTake the entries at the old keyspace and rehash them into their respective\nnew locations; do so in batches of Rehash Cache Size so that we can handle\nkey spaces too large to load into memory.")
    public static final SubLObject rehash_fht_key_space_alt(SubLObject fht, SubLObject new_keyspace, SubLObject new_capacity) {
        {
            SubLObject header = file_hash_table_header(fht);
            SubLObject key_entry = make_htfile_key_entry(UNPROVIDED);
            SubLObject temp_codes = make_vector($keyspace_rehash_cache_size$.getGlobalValue(), UNPROVIDED);
            SubLObject temp_offsets = make_vector($keyspace_rehash_cache_size$.getGlobalValue(), UNPROVIDED);
            SubLObject items = ZERO_INTEGER;
            SubLObject cdotimes_end_var = htfile_header_capacity(header);
            SubLObject i = NIL;
            for (i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
                fetch_fht_key_entry(fht, i, key_entry);
                if (NIL == is_empty_key_entryP(key_entry)) {
                    set_aref(temp_codes, items, htfile_key_entry_hash_code(key_entry));
                    set_aref(temp_offsets, items, htfile_key_entry_key_offset(key_entry));
                    items = add(items, ONE_INTEGER);
                }
                if (items.numE(length(temp_codes))) {
                    rehash_fht_cached_keys(fht, temp_codes, temp_offsets, items, new_keyspace, new_capacity);
                    items = ZERO_INTEGER;
                }
            }
            if (!items.isZero()) {
                rehash_fht_cached_keys(fht, temp_codes, temp_offsets, items, new_keyspace, new_capacity);
            }
        }
        return fht;
    }

    /**
     * Take the entries at the old keyspace and rehash them into their respective
     * new locations; do so in batches of Rehash Cache Size so that we can handle
     * key spaces too large to load into memory.
     */
    @LispMethod(comment = "Take the entries at the old keyspace and rehash them into their respective\r\nnew locations; do so in batches of Rehash Cache Size so that we can handle\r\nkey spaces too large to load into memory.\nTake the entries at the old keyspace and rehash them into their respective\nnew locations; do so in batches of Rehash Cache Size so that we can handle\nkey spaces too large to load into memory.")
    public static SubLObject rehash_fht_key_space(final SubLObject fht, final SubLObject new_keyspace, final SubLObject new_capacity) {
        final SubLObject header = file_hash_table_header(fht);
        final SubLObject key_entry = make_htfile_key_entry(UNPROVIDED);
        final SubLObject temp_codes = make_vector($keyspace_rehash_cache_size$.getGlobalValue(), UNPROVIDED);
        final SubLObject temp_offsets = make_vector($keyspace_rehash_cache_size$.getGlobalValue(), UNPROVIDED);
        SubLObject items = ZERO_INTEGER;
        SubLObject cdotimes_end_var;
        SubLObject i;
        for (cdotimes_end_var = htfile_header_capacity(header), i = NIL, i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
            fetch_fht_key_entry(fht, i, key_entry);
            if (NIL == is_empty_key_entryP(key_entry)) {
                set_aref(temp_codes, items, htfile_key_entry_hash_code(key_entry));
                set_aref(temp_offsets, items, htfile_key_entry_key_offset(key_entry));
                items = add(items, ONE_INTEGER);
            }
            if (items.numE(length(temp_codes))) {
                rehash_fht_cached_keys(fht, temp_codes, temp_offsets, items, new_keyspace, new_capacity);
                items = ZERO_INTEGER;
            }
        }
        if (!items.isZero()) {
            rehash_fht_cached_keys(fht, temp_codes, temp_offsets, items, new_keyspace, new_capacity);
        }
        return fht;
    }

    public static final SubLObject with_different_keyspace_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt304);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject fht = NIL;
                    SubLObject diff_keyspace = NIL;
                    SubLObject diff_capacity = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt304);
                    fht = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt304);
                    diff_keyspace = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt304);
                    diff_capacity = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            SubLObject header_local = $sym305$HEADER_LOCAL;
                            SubLObject keyspace_temp = $sym306$KEYSPACE_TEMP;
                            SubLObject capacity_temp = $sym307$CAPACITY_TEMP;
                            return listS(CLET, list(list(header_local, list(FILE_HASH_TABLE_HEADER, fht)), list(keyspace_temp, list(HTFILE_HEADER_KEY_SPACE_OFFSET, header_local)), list(capacity_temp, list(HTFILE_HEADER_CAPACITY, header_local))), list(CSETF, list(HTFILE_HEADER_KEY_SPACE_OFFSET, header_local), diff_keyspace), list(CSETF, list(HTFILE_HEADER_CAPACITY, header_local), diff_capacity), append(body, list(list(CSETF, list(HTFILE_HEADER_KEY_SPACE_OFFSET, header_local), keyspace_temp), list(CSETF, list(HTFILE_HEADER_CAPACITY, header_local), capacity_temp))));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt304);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject with_different_keyspace(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list355);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject fht = NIL;
        SubLObject diff_keyspace = NIL;
        SubLObject diff_capacity = NIL;
        destructuring_bind_must_consp(current, datum, $list355);
        fht = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list355);
        diff_keyspace = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list355);
        diff_capacity = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject header_local = $sym356$HEADER_LOCAL;
            final SubLObject keyspace_temp = $sym357$KEYSPACE_TEMP;
            final SubLObject capacity_temp = $sym358$CAPACITY_TEMP;
            return listS(CLET, list(list(header_local, list(FILE_HASH_TABLE_HEADER, fht)), list(keyspace_temp, list(HTFILE_HEADER_KEY_SPACE_OFFSET, header_local)), list(capacity_temp, list(HTFILE_HEADER_CAPACITY, header_local))), list(CSETF, list(HTFILE_HEADER_KEY_SPACE_OFFSET, header_local), diff_keyspace), list(CSETF, list(HTFILE_HEADER_CAPACITY, header_local), diff_capacity), append(body, list(list(CSETF, list(HTFILE_HEADER_KEY_SPACE_OFFSET, header_local), keyspace_temp), list(CSETF, list(HTFILE_HEADER_CAPACITY, header_local), capacity_temp))));
        }
        cdestructuring_bind_error(datum, $list355);
        return NIL;
    }

    public static final SubLObject rehash_fht_cached_keys_alt(SubLObject fht, SubLObject code_buffer, SubLObject offset_buffer, SubLObject count, SubLObject new_keyspace, SubLObject new_capacity) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject object_entry = make_htfile_object_entry(UNPROVIDED);
                SubLObject header_local = file_hash_table_header(fht);
                SubLObject keyspace_temp = htfile_header_key_space_offset(header_local);
                SubLObject capacity_temp = htfile_header_capacity(header_local);
                _csetf_htfile_header_key_space_offset(header_local, new_keyspace);
                _csetf_htfile_header_capacity(header_local, new_capacity);
                {
                    SubLObject i = NIL;
                    for (i = ZERO_INTEGER; i.numL(count); i = add(i, ONE_INTEGER)) {
                        {
                            SubLObject code = aref(code_buffer, i);
                            SubLObject address = aref(offset_buffer, i);
                            SubLObject key = NIL;
                            read_object_entry_from_space(fht, object_entry, address, $KEY_ONLY);
                            key = htfile_object_entry_key(object_entry);
                            thread.resetMultipleValues();
                            {
                                SubLObject status = fht_lookup_key(fht, key, code);
                                SubLObject index = thread.secondMultipleValue();
                                SubLObject keyentry = thread.thirdMultipleValue();
                                SubLObject objentry = thread.fourthMultipleValue();
                                thread.resetMultipleValues();
                                handle_rehash_fht_insert(fht, status, index, keyentry, address);
                            }
                        }
                    }
                }
                _csetf_htfile_header_key_space_offset(header_local, keyspace_temp);
                _csetf_htfile_header_capacity(header_local, capacity_temp);
            }
            return fht;
        }
    }

    public static SubLObject rehash_fht_cached_keys(final SubLObject fht, final SubLObject code_buffer, final SubLObject offset_buffer, final SubLObject count, final SubLObject new_keyspace, final SubLObject new_capacity) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject object_entry = make_htfile_object_entry(UNPROVIDED);
        final SubLObject header_local = file_hash_table_header(fht);
        final SubLObject keyspace_temp = htfile_header_key_space_offset(header_local);
        final SubLObject capacity_temp = htfile_header_capacity(header_local);
        _csetf_htfile_header_key_space_offset(header_local, new_keyspace);
        _csetf_htfile_header_capacity(header_local, new_capacity);
        SubLObject i;
        SubLObject code;
        SubLObject address;
        SubLObject key;
        SubLObject status;
        SubLObject index;
        SubLObject keyentry;
        SubLObject objentry;
        for (i = NIL, i = ZERO_INTEGER; i.numL(count); i = add(i, ONE_INTEGER)) {
            code = aref(code_buffer, i);
            address = aref(offset_buffer, i);
            key = NIL;
            read_object_entry_from_space(fht, object_entry, address, $KEY_ONLY);
            key = htfile_object_entry_key(object_entry);
            thread.resetMultipleValues();
            status = fht_lookup_key(fht, key, code);
            index = thread.secondMultipleValue();
            keyentry = thread.thirdMultipleValue();
            objentry = thread.fourthMultipleValue();
            thread.resetMultipleValues();
            handle_rehash_fht_insert(fht, status, index, keyentry, address);
        }
        _csetf_htfile_header_key_space_offset(header_local, keyspace_temp);
        _csetf_htfile_header_capacity(header_local, capacity_temp);
        return fht;
    }

    public static final SubLObject handle_rehash_fht_insert_alt(SubLObject fht, SubLObject status, SubLObject index, SubLObject key_entry, SubLObject offset) {
        if (status != $NOT_FOUND) {
            Errors.error($str_alt309$Internal_error__S_during_table_re, status);
        }
        _csetf_htfile_key_entry_key_offset(key_entry, offset);
        store_fht_key_entry(fht, index, key_entry);
        return fht;
    }

    public static SubLObject handle_rehash_fht_insert(final SubLObject fht, final SubLObject status, final SubLObject index, final SubLObject key_entry, final SubLObject offset) {
        if (status != $NOT_FOUND) {
            Errors.error($str360$Internal_error__S_during_table_re, status);
        }
        _csetf_htfile_key_entry_key_offset(key_entry, offset);
        store_fht_key_entry(fht, index, key_entry, UNPROVIDED);
        return fht;
    }

    public static final SubLObject htfile_minimal_space_required_for_object_alt() {
        return $htfile_object_entry_size$.getGlobalValue();
    }

    public static SubLObject htfile_minimal_space_required_for_object() {
        return $htfile_object_entry_size$.getGlobalValue();
    }

    public static final SubLObject specify_object_entry_alt(SubLObject key, SubLObject v_object, SubLObject encoding_size_fn, SubLObject object_entry) {
        if (object_entry == UNPROVIDED) {
            object_entry = NIL;
        }
        if (NIL == htfile_object_entry_p(object_entry)) {
            object_entry = new_object_entry(key, v_object);
        }
        _csetf_htfile_object_entry_key(object_entry, key);
        _csetf_htfile_object_entry_data(object_entry, v_object);
        _csetf_htfile_object_entry_type(object_entry, $VALID);
        compute_object_entry_size(object_entry, encoding_size_fn);
        return object_entry;
    }

    public static SubLObject specify_object_entry(final SubLObject key, final SubLObject v_object, final SubLObject encoding_size_fn, SubLObject object_entry) {
        if (object_entry == UNPROVIDED) {
            object_entry = NIL;
        }
        if (NIL == htfile_object_entry_p(object_entry)) {
            object_entry = new_object_entry(key, v_object);
        }
        _csetf_htfile_object_entry_key(object_entry, key);
        _csetf_htfile_object_entry_data(object_entry, v_object);
        _csetf_htfile_object_entry_type(object_entry, $VALID);
        compute_object_entry_size(object_entry, encoding_size_fn);
        return object_entry;
    }

    public static final SubLObject compute_object_entry_size_alt(SubLObject object_entry, SubLObject encoding_size_fn) {
        _csetf_htfile_object_entry_key_size(object_entry, funcall(encoding_size_fn, htfile_object_entry_key(object_entry)));
        _csetf_htfile_object_entry_data_size(object_entry, funcall(encoding_size_fn, htfile_object_entry_data(object_entry)));
        _csetf_htfile_object_entry_size(object_entry, add($htfile_object_entry_size$.getGlobalValue(), htfile_object_entry_key_size(object_entry), htfile_object_entry_data_size(object_entry)));
        return object_entry;
    }

    public static SubLObject compute_object_entry_size(final SubLObject object_entry, final SubLObject encoding_size_fn) {
        _csetf_htfile_object_entry_key_size(object_entry, funcall(encoding_size_fn, htfile_object_entry_key(object_entry)));
        _csetf_htfile_object_entry_data_size(object_entry, funcall(encoding_size_fn, htfile_object_entry_data(object_entry)));
        _csetf_htfile_object_entry_size(object_entry, add($htfile_object_entry_size$.getGlobalValue(), htfile_object_entry_key_size(object_entry), htfile_object_entry_data_size(object_entry)));
        return object_entry;
    }

    /**
     * Compute and return the position where you get to write
     * your information to. Assume someone already holds the
     * fht-lock.
     */
    @LispMethod(comment = "Compute and return the position where you get to write\r\nyour information to. Assume someone already holds the\r\nfht-lock.\nCompute and return the position where you get to write\nyour information to. Assume someone already holds the\nfht-lock.")
    public static final SubLObject allocate_object_space_alt(SubLObject fht, SubLObject object_entry) {
        {
            SubLObject header = file_hash_table_header(fht);
            SubLObject needed = htfile_object_entry_size(object_entry);
            SubLObject address = NIL;
            SubLObject new_heap_top = NIL;
            if ((NIL != file_hash_table_storage_resourcing_onP(fht)) && htfile_header_free_list_head(header).isPositive()) {
                address = allocate_object_space_from_free_list(fht, needed);
                if (NIL != address) {
                    return address;
                }
            }
            address = htfile_header_current_heap_top(header);
            new_heap_top = add(needed, address);
            if (new_heap_top.numG(htfile_header_key_space_offset(header))) {
                increase_htfile_heap_size(fht, new_heap_top);
                address = htfile_header_current_heap_top(header);
                new_heap_top = add(needed, address);
            }
            _csetf_htfile_header_current_heap_top(header, new_heap_top);
            return address;
        }
    }

    /**
     * Compute and return the position where you get to write
     * your information to. Assume someone already holds the
     * fht-lock.
     */
    @LispMethod(comment = "Compute and return the position where you get to write\r\nyour information to. Assume someone already holds the\r\nfht-lock.\nCompute and return the position where you get to write\nyour information to. Assume someone already holds the\nfht-lock.")
    public static SubLObject allocate_object_space(final SubLObject fht, final SubLObject object_entry) {
        final SubLObject header = file_hash_table_header(fht);
        final SubLObject needed = htfile_object_entry_size(object_entry);
        SubLObject address = NIL;
        SubLObject new_heap_top = NIL;
        if ((NIL != file_hash_table_storage_resourcing_onP(fht)) && htfile_header_free_list_head(header).isPositive()) {
            address = allocate_object_space_from_free_list(fht, needed);
            if (NIL != address) {
                return address;
            }
        }
        address = htfile_header_current_heap_top(header);
        new_heap_top = add(needed, address);
        if (new_heap_top.numG(htfile_header_key_space_offset(header))) {
            increase_htfile_heap_size(fht, new_heap_top);
            address = htfile_header_current_heap_top(header);
            new_heap_top = add(needed, address);
        }
        _csetf_htfile_header_current_heap_top(header, new_heap_top);
        return address;
    }

    public static final SubLObject store_fht_object_entry_alt(SubLObject fht, SubLObject address, SubLObject object_entry) {
        return write_object_entry_to_space(fht, object_entry, address);
    }

    public static SubLObject store_fht_object_entry(final SubLObject fht, final SubLObject address, final SubLObject object_entry) {
        return write_object_entry_to_space(fht, object_entry, address);
    }

    /**
     * Once we have been given a completely intialized object and
     * a final target address, write the object to that location.
     */
    @LispMethod(comment = "Once we have been given a completely intialized object and\r\na final target address, write the object to that location.\nOnce we have been given a completely intialized object and\na final target address, write the object to that location.")
    public static final SubLObject write_object_entry_to_space_alt(SubLObject fht, SubLObject object_entry, SubLObject address) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject stream = file_hash_table_stream(fht);
                SubLObject encoding_output_fn = file_hash_table_encoding_output_fn(fht);
                if (!address.numE(file_position(stream, UNPROVIDED))) {
                    file_position(stream, address);
                    if (!file_position(stream, UNPROVIDED).numE(address)) {
                        Errors.error($str_alt299$Unable_to_position_to_file_pos__D, address, file_position(stream, UNPROVIDED));
                    }
                }
                write_fht_uint4(stream, htfile_object_entry_size(object_entry));
                write_fht_uint4(stream, htfile_object_entry_key_size(object_entry));
                write_fht_uint4(stream, htfile_object_entry_data_size(object_entry));
                funcall(encoding_output_fn, htfile_object_entry_key(object_entry), stream);
                funcall(encoding_output_fn, htfile_object_entry_data(object_entry), stream);
                if (NIL == $fast_put_skip_output_forcing$.getDynamicValue(thread)) {
                    force_output(stream);
                }
                {
                    SubLObject new_pos = file_position(stream, UNPROVIDED);
                    SubLObject computed_size = htfile_object_entry_size(object_entry);
                    if (!new_pos.isInteger()) {
                        Errors.error($str_alt311$Cannot_correctly_determine_file_p, address, computed_size);
                    }
                    {
                        SubLObject actual_size = subtract(new_pos, address);
                        if (!computed_size.numE(actual_size)) {
                            Errors.error($str_alt312$Predicted_object_size__D_did_not_, computed_size, actual_size);
                        }
                    }
                }
            }
            return fht;
        }
    }

    /**
     * Once we have been given a completely intialized object and
     * a final target address, write the object to that location.
     */
    @LispMethod(comment = "Once we have been given a completely intialized object and\r\na final target address, write the object to that location.\nOnce we have been given a completely intialized object and\na final target address, write the object to that location.")
    public static SubLObject write_object_entry_to_space(final SubLObject fht, final SubLObject object_entry, final SubLObject address) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject stream = file_hash_table_stream(fht);
        final SubLObject encoding_output_fn = file_hash_table_encoding_output_fn(fht);
        if (!address.numE(file_position(stream, UNPROVIDED))) {
            file_position(stream, address);
            if (!file_position(stream, UNPROVIDED).numE(address)) {
                Errors.error($str341$Unable_to_position_to_file_pos__D, address, file_position(stream, UNPROVIDED));
            }
        }
        write_fht_uint4(stream, htfile_object_entry_size(object_entry));
        write_fht_uint4(stream, htfile_object_entry_key_size(object_entry));
        write_fht_uint4(stream, htfile_object_entry_data_size(object_entry));
        funcall(encoding_output_fn, htfile_object_entry_key(object_entry), stream);
        funcall(encoding_output_fn, htfile_object_entry_data(object_entry), stream);
        if (NIL == $fast_put_skip_output_forcing$.getDynamicValue(thread)) {
            force_output(stream);
        }
        final SubLObject new_pos = file_position(stream, UNPROVIDED);
        if (!new_pos.isInteger()) {
            Errors.error($str362$Cannot_correctly_determine_file_p, address);
        }
        if (new_pos.numL(address)) {
            Errors.error($str363$New_file_position__D_is_smaller_t, new_pos, address);
        }
        final SubLObject computed_size = htfile_object_entry_size(object_entry);
        final SubLObject actual_size = subtract(new_pos, address);
        if (!computed_size.numE(actual_size)) {
            if (computed_size.numL(actual_size)) {
                Errors.error($str364$Instead_of__D_bytes__object_took_, computed_size, actual_size);
            } else
                if (computed_size.numG(actual_size)) {
                    Errors.error($str365$Only__D_of_the_expected__D_bytes_, actual_size, computed_size);
                }

        }
        return fht;
    }

    public static final SubLObject read_object_entry_from_space_alt(SubLObject fht, SubLObject object_entry, SubLObject address, SubLObject style) {
        if (style == UNPROVIDED) {
            style = $FULL;
        }
        {
            SubLObject stream = file_hash_table_stream(fht);
            SubLObject encoding_input_fn = file_hash_table_encoding_input_fn(fht);
            file_position(stream, address);
            if (!file_position(stream, UNPROVIDED).numE(address)) {
                Errors.error($str_alt300$Unable_to_position_to_file_pos__A, address, file_position(stream, UNPROVIDED));
            }
            _csetf_htfile_object_entry_size(object_entry, read_fht_uint4(stream));
            _csetf_htfile_object_entry_key_size(object_entry, read_fht_uint4(stream));
            _csetf_htfile_object_entry_data_size(object_entry, read_fht_uint4(stream));
            _csetf_htfile_object_entry_key(object_entry, funcall(encoding_input_fn, stream));
            if (style != $KEY_ONLY) {
                _csetf_htfile_object_entry_data(object_entry, funcall(encoding_input_fn, stream));
                {
                    SubLObject new_pos = file_position(stream, UNPROVIDED);
                    SubLObject claimed_size = htfile_object_entry_size(object_entry);
                    SubLObject actual_size = subtract(new_pos, address);
                    if (!claimed_size.numE(actual_size)) {
                        Errors.error($str_alt313$Claimed_object_size__D_did_not_ma, claimed_size, actual_size);
                    }
                }
            }
            return object_entry;
        }
    }

    public static SubLObject read_object_entry_from_space(final SubLObject fht, final SubLObject object_entry, final SubLObject address, SubLObject style) {
        if (style == UNPROVIDED) {
            style = $FULL;
        }
        final SubLObject stream = file_hash_table_stream(fht);
        final SubLObject encoding_input_fn = file_hash_table_encoding_input_fn(fht);
        file_position(stream, address);
        if (!file_position(stream, UNPROVIDED).numE(address)) {
            Errors.error($str342$Unable_to_position_to_file_pos__A, address, file_position(stream, UNPROVIDED));
        }
        _csetf_htfile_object_entry_size(object_entry, read_fht_uint4(stream));
        _csetf_htfile_object_entry_key_size(object_entry, read_fht_uint4(stream));
        _csetf_htfile_object_entry_data_size(object_entry, read_fht_uint4(stream));
        _csetf_htfile_object_entry_key(object_entry, funcall(encoding_input_fn, stream));
        if (style != $KEY_ONLY) {
            _csetf_htfile_object_entry_data(object_entry, funcall(encoding_input_fn, stream));
            final SubLObject new_pos = file_position(stream, UNPROVIDED);
            final SubLObject claimed_size = htfile_object_entry_size(object_entry);
            final SubLObject actual_size = subtract(new_pos, address);
            if (!claimed_size.numE(actual_size)) {
                Errors.error($str366$Claimed_object_size__D_did_not_ma, claimed_size, actual_size);
            }
        }
        return object_entry;
    }

    /**
     * Move the keyspace down in the file to make more heap room. Adjust the necessary
     * pointers in the header and return. You can assume that you have complete
     * htfile control at this point.
     */
    @LispMethod(comment = "Move the keyspace down in the file to make more heap room. Adjust the necessary\r\npointers in the header and return. You can assume that you have complete\r\nhtfile control at this point.\nMove the keyspace down in the file to make more heap room. Adjust the necessary\npointers in the header and return. You can assume that you have complete\nhtfile control at this point.")
    public static final SubLObject increase_htfile_heap_size_alt(SubLObject fht, SubLObject minimal_size) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject header = file_hash_table_header(fht);
                thread.resetMultipleValues();
                {
                    SubLObject old_key_space = compute_new_htfile_heap_size(fht, minimal_size);
                    SubLObject new_key_space = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    move_htfile_key_space(fht, old_key_space, new_key_space);
                    _csetf_htfile_header_key_space_offset(header, new_key_space);
                }
            }
            return fht;
        }
    }

    /**
     * Move the keyspace down in the file to make more heap room. Adjust the necessary
     * pointers in the header and return. You can assume that you have complete
     * htfile control at this point.
     */
    @LispMethod(comment = "Move the keyspace down in the file to make more heap room. Adjust the necessary\r\npointers in the header and return. You can assume that you have complete\r\nhtfile control at this point.\nMove the keyspace down in the file to make more heap room. Adjust the necessary\npointers in the header and return. You can assume that you have complete\nhtfile control at this point.")
    public static SubLObject increase_htfile_heap_size(final SubLObject fht, final SubLObject minimal_size) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject header = file_hash_table_header(fht);
        thread.resetMultipleValues();
        final SubLObject old_key_space = compute_new_htfile_heap_size(fht, minimal_size);
        final SubLObject new_key_space = thread.secondMultipleValue();
        thread.resetMultipleValues();
        move_htfile_key_space(fht, old_key_space, new_key_space);
        _csetf_htfile_header_key_space_offset(header, new_key_space);
        return fht;
    }

    /**
     * Compute the new heap size, ensuring that at minimum you exceed minimal-size.
     * This avoids having the space double and that still be too small.
     */
    @LispMethod(comment = "Compute the new heap size, ensuring that at minimum you exceed minimal-size.\r\nThis avoids having the space double and that still be too small.\nCompute the new heap size, ensuring that at minimum you exceed minimal-size.\nThis avoids having the space double and that still be too small.")
    public static final SubLObject compute_new_htfile_heap_size_alt(SubLObject fht, SubLObject minimal_size) {
        if (minimal_size == UNPROVIDED) {
            minimal_size = NIL;
        }
        {
            SubLObject header = file_hash_table_header(fht);
            SubLObject old_key_space = htfile_header_key_space_offset(header);
            SubLObject new_key_space = add(old_key_space, old_key_space);
            if (NIL == minimal_size) {
                minimal_size = new_key_space;
            } else {
                while (new_key_space.numL(minimal_size)) {
                    new_key_space = add(new_key_space, new_key_space);
                } 
            }
            return values(old_key_space, new_key_space);
        }
    }

    /**
     * Compute the new heap size, ensuring that at minimum you exceed minimal-size.
     * This avoids having the space double and that still be too small.
     */
    @LispMethod(comment = "Compute the new heap size, ensuring that at minimum you exceed minimal-size.\r\nThis avoids having the space double and that still be too small.\nCompute the new heap size, ensuring that at minimum you exceed minimal-size.\nThis avoids having the space double and that still be too small.")
    public static SubLObject compute_new_htfile_heap_size(final SubLObject fht, SubLObject minimal_size) {
        if (minimal_size == UNPROVIDED) {
            minimal_size = NIL;
        }
        final SubLObject header = file_hash_table_header(fht);
        final SubLObject old_key_space = htfile_header_key_space_offset(header);
        SubLObject new_key_space = add(old_key_space, old_key_space);
        if (NIL == minimal_size) {
            minimal_size = new_key_space;
        } else {
            while (new_key_space.numL(minimal_size)) {
                new_key_space = add(new_key_space, new_key_space);
            } 
        }
        return values(old_key_space, new_key_space);
    }

    public static final SubLObject register_file_table_header_support_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject vmajor = NIL;
            SubLObject vminor = NIL;
            SubLObject reader = NIL;
            SubLObject writer = NIL;
            SubLObject verifier = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt315);
            vmajor = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt315);
            vminor = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt315);
            reader = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt315);
            writer = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt315);
            verifier = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject tuple = cons(vmajor, vminor);
                    SubLObject v_methods = NIL;
                    v_methods = acons($READER, reader, v_methods);
                    v_methods = acons($WRITER, writer, v_methods);
                    v_methods = acons($VERIFIER, verifier, v_methods);
                    return list(SETHASH, tuple, $file_hash_table_headers$, v_methods);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt315);
            }
        }
        return NIL;
    }

    public static SubLObject register_file_table_header_support(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject vmajor = NIL;
        SubLObject vminor = NIL;
        SubLObject reader = NIL;
        SubLObject writer = NIL;
        SubLObject verifier = NIL;
        destructuring_bind_must_consp(current, datum, $list368);
        vmajor = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list368);
        vminor = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list368);
        reader = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list368);
        writer = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list368);
        verifier = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject tuple = cons(vmajor, vminor);
            SubLObject v_methods = NIL;
            v_methods = acons($READER, reader, v_methods);
            v_methods = acons($WRITER, writer, v_methods);
            v_methods = acons($VERIFIER, verifier, v_methods);
            return list(SETHASH, tuple, $file_hash_table_headers$, v_methods);
        }
        cdestructuring_bind_error(datum, $list368);
        return NIL;
    }

    /**
     * Read the header of the file into the fht and store it there.
     */
    @LispMethod(comment = "Read the header of the file into the fht and store it there.")
    public static final SubLObject read_fht_header_alt(SubLObject fht) {
        {
            SubLObject stream = file_hash_table_stream(fht);
            SubLObject header = file_hash_table_header(fht);
            file_position(stream, $file_hash_table_header_position$.getGlobalValue());
            _csetf_htfile_header_size(header, read_fht_uint4(stream));
            _csetf_htfile_header_version_major(header, read_fht_uint4(stream));
            _csetf_htfile_header_version_minor(header, read_fht_uint4(stream));
            read_fht_header_version1p3(fht);
        }
        return fht;
    }

    /**
     * Read the header of the file into the fht and store it there.
     */
    @LispMethod(comment = "Read the header of the file into the fht and store it there.")
    public static SubLObject read_fht_header(final SubLObject fht) {
        final SubLObject stream = file_hash_table_stream(fht);
        final SubLObject header = file_hash_table_header(fht);
        file_position(stream, $file_hash_table_header_position$.getGlobalValue());
        _csetf_htfile_header_size(header, read_fht_uint4(stream));
        _csetf_htfile_header_version_major(header, read_fht_uint4(stream));
        _csetf_htfile_header_version_minor(header, read_fht_uint4(stream));
        read_fht_header_version1p3(fht);
        return fht;
    }

    /**
     * Write the header of the file to the file.
     */
    @LispMethod(comment = "Write the header of the file to the file.")
    public static final SubLObject write_fht_header_alt(SubLObject fht) {
        {
            SubLObject stream = file_hash_table_stream(fht);
            SubLObject header = file_hash_table_header(fht);
            file_position(stream, $file_hash_table_header_position$.getGlobalValue());
            write_fht_uint4(stream, htfile_header_size(header));
            write_fht_uint4(stream, htfile_header_version_major(header));
            write_fht_uint4(stream, htfile_header_version_minor(header));
            write_fht_header_version1p3(fht);
            force_output(stream);
        }
        return fht;
    }

    /**
     * Write the header of the file to the file.
     */
    @LispMethod(comment = "Write the header of the file to the file.")
    public static SubLObject write_fht_header(final SubLObject fht) {
        final SubLObject stream = file_hash_table_stream(fht);
        final SubLObject header = file_hash_table_header(fht);
        file_position(stream, $file_hash_table_header_position$.getGlobalValue());
        write_fht_uint4(stream, htfile_header_size(header));
        write_fht_uint4(stream, htfile_header_version_major(header));
        write_fht_uint4(stream, htfile_header_version_minor(header));
        write_fht_header_version1p3(fht);
        force_output(stream);
        return fht;
    }

    public static final SubLObject read_fht_header_version1p3_alt(SubLObject fht) {
        {
            SubLObject stream = file_hash_table_stream(fht);
            SubLObject header = file_hash_table_header(fht);
            _csetf_htfile_header_object_space_offset(header, read_fht_uint8(stream));
            _csetf_htfile_header_key_space_offset(header, read_fht_uint8(stream));
            _csetf_htfile_header_current_heap_top(header, read_fht_uint8(stream));
            _csetf_htfile_header_item_count(header, read_fht_uint8(stream));
            _csetf_htfile_header_capacity(header, read_fht_uint8(stream));
            _csetf_htfile_header_free_list_head(header, read_fht_uint8(stream));
            _csetf_htfile_header_deletion_count(header, read_fht_uint8(stream));
            _csetf_htfile_header_header_crc(header, read_fht_uint8(stream));
            _csetf_htfile_header_extension_space_size(header, read_fht_uint8(stream));
            if (htfile_header_extension_space_size(header).isPositive()) {
                read_fht_extension_space(fht);
            } else {
                _csetf_htfile_header_extension_space(header, make_vector(ZERO_INTEGER, UNPROVIDED));
            }
            verify_version1p3_crc(fht);
        }
        return fht;
    }

    public static SubLObject read_fht_header_version1p3(final SubLObject fht) {
        final SubLObject stream = file_hash_table_stream(fht);
        final SubLObject header = file_hash_table_header(fht);
        _csetf_htfile_header_object_space_offset(header, read_fht_uint8(stream));
        _csetf_htfile_header_key_space_offset(header, read_fht_uint8(stream));
        _csetf_htfile_header_current_heap_top(header, read_fht_uint8(stream));
        _csetf_htfile_header_item_count(header, read_fht_uint8(stream));
        _csetf_htfile_header_capacity(header, read_fht_uint8(stream));
        _csetf_htfile_header_free_list_head(header, read_fht_uint8(stream));
        _csetf_htfile_header_deletion_count(header, read_fht_uint8(stream));
        _csetf_htfile_header_header_crc(header, read_fht_uint8(stream));
        _csetf_htfile_header_extension_space_size(header, read_fht_uint8(stream));
        if (htfile_header_extension_space_size(header).isPositive()) {
            read_fht_extension_space(fht);
        } else {
            _csetf_htfile_header_extension_space(header, make_vector(ZERO_INTEGER, UNPROVIDED));
        }
        verify_version1p3_crc(fht);
        return fht;
    }

    public static final SubLObject write_fht_header_version1p3_alt(SubLObject fht) {
        {
            SubLObject stream = file_hash_table_stream(fht);
            SubLObject header = file_hash_table_header(fht);
            write_fht_uint8(stream, htfile_header_object_space_offset(header));
            write_fht_uint8(stream, htfile_header_key_space_offset(header));
            write_fht_uint8(stream, htfile_header_current_heap_top(header));
            write_fht_uint8(stream, htfile_header_item_count(header));
            write_fht_uint8(stream, htfile_header_capacity(header));
            write_fht_uint8(stream, htfile_header_free_list_head(header));
            write_fht_uint8(stream, htfile_header_deletion_count(header));
            write_fht_uint8(stream, htfile_header_header_crc(header));
            write_fht_uint8(stream, htfile_header_extension_space_size(header));
            write_fht_extension_space(fht);
        }
        return fht;
    }

    public static SubLObject write_fht_header_version1p3(final SubLObject fht) {
        final SubLObject stream = file_hash_table_stream(fht);
        final SubLObject header = file_hash_table_header(fht);
        write_fht_uint8(stream, htfile_header_object_space_offset(header));
        write_fht_uint8(stream, htfile_header_key_space_offset(header));
        write_fht_uint8(stream, htfile_header_current_heap_top(header));
        write_fht_uint8(stream, htfile_header_item_count(header));
        write_fht_uint8(stream, htfile_header_capacity(header));
        write_fht_uint8(stream, htfile_header_free_list_head(header));
        write_fht_uint8(stream, htfile_header_deletion_count(header));
        write_fht_uint8(stream, htfile_header_header_crc(header));
        write_fht_uint8(stream, htfile_header_extension_space_size(header));
        write_fht_extension_space(fht);
        return fht;
    }

    /**
     * Version 1.2 has no extension space objects.
     */
    @LispMethod(comment = "Version 1.2 has no extension space objects.")
    public static final SubLObject read_fht_extension_space_alt(SubLObject fht) {
        return fht;
    }

    /**
     * Version 1.2 has no extension space objects.
     */
    @LispMethod(comment = "Version 1.2 has no extension space objects.")
    public static SubLObject read_fht_extension_space(final SubLObject fht) {
        return fht;
    }

    public static final SubLObject write_fht_extension_space_alt(SubLObject fht) {
        return fht;
    }

    public static SubLObject write_fht_extension_space(final SubLObject fht) {
        return fht;
    }

    /**
     * Implement later.
     */
    @LispMethod(comment = "Implement later.")
    public static final SubLObject verify_version1p3_crc_alt(SubLObject fht) {
        return fht;
    }

    /**
     * Implement later.
     */
    @LispMethod(comment = "Implement later.")
    public static SubLObject verify_version1p3_crc(final SubLObject fht) {
        return fht;
    }

    public static final SubLObject read_fht_uint4_alt(SubLObject stream) {
        {
            SubLObject byte4 = read_byte(stream, UNPROVIDED, UNPROVIDED);
            SubLObject byte3 = read_byte(stream, UNPROVIDED, UNPROVIDED);
            SubLObject byte2 = read_byte(stream, UNPROVIDED, UNPROVIDED);
            SubLObject byte1 = read_byte(stream, UNPROVIDED, UNPROVIDED);
            return assemble_4_fixnums_to_non_negative_integer(byte1, byte2, byte3, byte4);
        }
    }

    public static SubLObject read_fht_uint4(final SubLObject stream) {
        return read_byte_sequence_to_positive_integer(FOUR_INTEGER, stream, T, NIL, T);
    }

    public static final SubLObject write_fht_uint4_alt(SubLObject stream, SubLObject value) {
        write_byte(bytes.ldb($int$32792, value), stream);
        write_byte(bytes.ldb($int$32784, value), stream);
        write_byte(bytes.ldb($int$32776, value), stream);
        write_byte(bytes.ldb($int$32768, value), stream);
        return value;
    }

    public static SubLObject write_fht_uint4(final SubLObject stream, final SubLObject value) {
        return write_positive_integer_as_byte_sequence(value, FOUR_INTEGER, stream, T);
    }

    public static final SubLObject read_fht_uint8_alt(SubLObject stream) {
        {
            SubLObject byte8 = read_byte(stream, UNPROVIDED, UNPROVIDED);
            SubLObject byte7 = read_byte(stream, UNPROVIDED, UNPROVIDED);
            SubLObject byte6 = read_byte(stream, UNPROVIDED, UNPROVIDED);
            SubLObject byte5 = read_byte(stream, UNPROVIDED, UNPROVIDED);
            SubLObject byte4 = read_byte(stream, UNPROVIDED, UNPROVIDED);
            SubLObject byte3 = read_byte(stream, UNPROVIDED, UNPROVIDED);
            SubLObject byte2 = read_byte(stream, UNPROVIDED, UNPROVIDED);
            SubLObject byte1 = read_byte(stream, UNPROVIDED, UNPROVIDED);
            return assemble_fixnums_to_integer(ONE_INTEGER, new SubLObject[]{ byte1, byte2, byte3, byte4, byte5, byte6, byte7, byte8 });
        }
    }

    public static SubLObject read_fht_uint8(final SubLObject stream) {
        return read_byte_sequence_to_positive_integer(EIGHT_INTEGER, stream, T, NIL, T);
    }

    public static final SubLObject write_fht_uint8_alt(SubLObject stream, SubLObject value) {
        write_byte(bytes.ldb($int$32824, value), stream);
        write_byte(bytes.ldb($int$32816, value), stream);
        write_byte(bytes.ldb($int$32808, value), stream);
        write_byte(bytes.ldb($int$32800, value), stream);
        write_byte(bytes.ldb($int$32792, value), stream);
        write_byte(bytes.ldb($int$32784, value), stream);
        write_byte(bytes.ldb($int$32776, value), stream);
        write_byte(bytes.ldb($int$32768, value), stream);
        return value;
    }

    public static SubLObject write_fht_uint8(final SubLObject stream, final SubLObject value) {
        return write_positive_integer_as_byte_sequence(value, EIGHT_INTEGER, stream, T);
    }

    public static final SubLObject write_null_fht_bytes_alt(SubLObject stream, SubLObject count) {
        {
            SubLObject i = NIL;
            for (i = ZERO_INTEGER; i.numL(count); i = add(i, ONE_INTEGER)) {
                write_byte(ZERO_INTEGER, stream);
            }
        }
        return ZERO_INTEGER;
    }

    public static SubLObject write_null_fht_bytes(final SubLObject stream, final SubLObject count) {
        SubLObject i;
        for (i = NIL, i = ZERO_INTEGER; i.numL(count); i = add(i, ONE_INTEGER)) {
            write_byte(ZERO_INTEGER, stream);
        }
        return ZERO_INTEGER;
    }

    public static final SubLObject read_fht_encoded_object_alt(SubLObject stream, SubLObject encoding_input_fn) {
        {
            SubLObject size = NIL;
            SubLObject start = NIL;
            SubLObject v_object = NIL;
            size = read_fht_uint4(stream);
            start = file_position(stream, UNPROVIDED);
            v_object = funcall(encoding_input_fn, stream);
            {
                SubLObject computed_spot = add(size, start);
                SubLObject real_spot = file_position(stream, UNPROVIDED);
                if (!computed_spot.numE(real_spot)) {
                    Errors.error($str_alt328$After_reading__S__computed_positi, computed_spot, real_spot);
                }
            }
            return values(size, v_object);
        }
    }

    public static SubLObject read_fht_encoded_object(final SubLObject stream, final SubLObject encoding_input_fn) {
        SubLObject size = NIL;
        SubLObject start = NIL;
        SubLObject v_object = NIL;
        size = read_fht_uint4(stream);
        start = file_position(stream, UNPROVIDED);
        v_object = funcall(encoding_input_fn, stream);
        final SubLObject computed_spot = add(size, start);
        final SubLObject real_spot = file_position(stream, UNPROVIDED);
        if (!computed_spot.numE(real_spot)) {
            Errors.error($str381$After_reading__S__computed_positi, computed_spot, real_spot);
        }
        return values(size, v_object);
    }

    public static final SubLObject write_fht_encoded_object_alt(SubLObject stream, SubLObject v_object, SubLObject encoding_output_fn, SubLObject encoding_size_fn) {
        {
            SubLObject computed_size = funcall(encoding_size_fn, v_object);
            SubLObject curr_pos = NIL;
            write_fht_uint4(stream, computed_size);
            curr_pos = file_position(stream, UNPROVIDED);
            funcall(encoding_output_fn, v_object);
            {
                SubLObject end_pos = file_position(stream, UNPROVIDED);
                SubLObject actual_size = subtract(end_pos, curr_pos);
                if (!actual_size.numE(computed_size)) {
                    Errors.error($str_alt312$Predicted_object_size__D_did_not_, computed_size, actual_size);
                }
            }
        }
        return v_object;
    }

    public static SubLObject write_fht_encoded_object(final SubLObject stream, final SubLObject v_object, final SubLObject encoding_output_fn, final SubLObject encoding_size_fn) {
        final SubLObject computed_size = funcall(encoding_size_fn, v_object);
        SubLObject curr_pos = NIL;
        write_fht_uint4(stream, computed_size);
        curr_pos = file_position(stream, UNPROVIDED);
        funcall(encoding_output_fn, v_object);
        final SubLObject end_pos = file_position(stream, UNPROVIDED);
        final SubLObject actual_size = subtract(end_pos, curr_pos);
        if (!actual_size.numE(computed_size)) {
            Errors.error($str382$Predicted_object_size__D_did_not_, computed_size, actual_size);
        }
        return v_object;
    }

    /**
     * Attempt to read size bytes from into block as small ints
     * and return the amount of data actually read.
     */
    @LispMethod(comment = "Attempt to read size bytes from into block as small ints\r\nand return the amount of data actually read.\nAttempt to read size bytes from into block as small ints\nand return the amount of data actually read.")
    public static final SubLObject read_fht_binary_block_alt(SubLObject stream, SubLObject block, SubLObject size) {
        {
            SubLObject i = NIL;
            for (i = ZERO_INTEGER; i.numL(size); i = add(i, ONE_INTEGER)) {
                {
                    SubLObject v_byte = read_byte(stream, NIL, $EOF);
                    if (v_byte == $EOF) {
                        return i;
                    }
                    set_aref(block, i, v_byte);
                }
            }
        }
        return size;
    }

    /**
     * Attempt to read size bytes from into block as small ints
     * and return the amount of data actually read.
     */
    @LispMethod(comment = "Attempt to read size bytes from into block as small ints\r\nand return the amount of data actually read.\nAttempt to read size bytes from into block as small ints\nand return the amount of data actually read.")
    public static SubLObject read_fht_binary_block(final SubLObject stream, final SubLObject block, final SubLObject size) {
        SubLObject i;
        SubLObject v_byte;
        for (i = NIL, i = ZERO_INTEGER; i.numL(size); i = add(i, ONE_INTEGER)) {
            v_byte = read_byte(stream, NIL, $EOF);
            if (v_byte == $EOF) {
                return i;
            }
            set_aref(block, i, v_byte);
        }
        return size;
    }

    /**
     * Used by the massive move functions to get dozens of bytes about in
     * one big swoop.
     */
    @LispMethod(comment = "Used by the massive move functions to get dozens of bytes about in\r\none big swoop.\nUsed by the massive move functions to get dozens of bytes about in\none big swoop.")
    public static final SubLObject write_fht_binary_block_alt(SubLObject stream, SubLObject block, SubLObject size) {
        {
            SubLObject i = NIL;
            for (i = ZERO_INTEGER; i.numL(size); i = add(i, ONE_INTEGER)) {
                write_byte(aref(block, i), stream);
            }
        }
        force_output(stream);
        return stream;
    }

    /**
     * Used by the massive move functions to get dozens of bytes about in
     * one big swoop.
     */
    @LispMethod(comment = "Used by the massive move functions to get dozens of bytes about in\r\none big swoop.\nUsed by the massive move functions to get dozens of bytes about in\none big swoop.")
    public static SubLObject write_fht_binary_block(final SubLObject stream, final SubLObject block, final SubLObject size) {
        SubLObject i;
        for (i = NIL, i = ZERO_INTEGER; i.numL(size); i = add(i, ONE_INTEGER)) {
            write_byte(aref(block, i), stream);
        }
        force_output(stream);
        return stream;
    }

    public static final SubLObject move_fht_binary_block_alt(SubLObject stream, SubLObject block, SubLObject size, SubLObject from, SubLObject to) {
        file_position(stream, from);
        {
            SubLObject amount = read_fht_binary_block(stream, block, size);
            if (!amount.numE(size)) {
                Errors.error($str_alt330$Premature_end_of_file_when_moving, size, from, to);
            }
        }
        file_position(stream, to);
        write_fht_binary_block(stream, block, size);
        return stream;
    }

    public static SubLObject move_fht_binary_block(final SubLObject stream, final SubLObject block, final SubLObject size, final SubLObject from, final SubLObject to) {
        file_position(stream, from);
        final SubLObject amount = read_fht_binary_block(stream, block, size);
        if (!amount.numE(size)) {
            Errors.error($str384$Premature_end_of_file_when_moving, size, from, to);
        }
        file_position(stream, to);
        write_fht_binary_block(stream, block, size);
        return stream;
    }

    /**
     * Perform merge sort on the key tiles and write your own keyspace.
     */
    @LispMethod(comment = "Perform merge sort on the key tiles and write your own keyspace.")
    public static final SubLObject aggressive_fast_fht_optimization_modeP_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return eq($AGGRESSIVE, $fast_file_hash_table_optimization_mode$.getDynamicValue(thread));
        }
    }

    /**
     * Perform merge sort on the key tiles and write your own keyspace.
     */
    @LispMethod(comment = "Perform merge sort on the key tiles and write your own keyspace.")
    public static SubLObject aggressive_fast_fht_optimization_modeP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return eq($AGGRESSIVE, $fast_file_hash_table_optimization_mode$.getDynamicValue(thread));
    }

    /**
     * Perform merge sort on the key tiles, us standard PUT to build keyspace.
     */
    @LispMethod(comment = "Perform merge sort on the key tiles, us standard PUT to build keyspace.")
    public static final SubLObject moderate_fast_fht_optimization_modeP_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return eq($MODERATE, $fast_file_hash_table_optimization_mode$.getDynamicValue(thread));
        }
    }

    /**
     * Perform merge sort on the key tiles, us standard PUT to build keyspace.
     */
    @LispMethod(comment = "Perform merge sort on the key tiles, us standard PUT to build keyspace.")
    public static SubLObject moderate_fast_fht_optimization_modeP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return eq($MODERATE, $fast_file_hash_table_optimization_mode$.getDynamicValue(thread));
    }

    /**
     * Leave key tiles as is and use standard PUT to build keyspace.
     */
    @LispMethod(comment = "Leave key tiles as is and use standard PUT to build keyspace.")
    public static final SubLObject conservative_fast_fht_optimization_modeP_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return eq($CONSERVATIVE, $fast_file_hash_table_optimization_mode$.getDynamicValue(thread));
        }
    }

    /**
     * Leave key tiles as is and use standard PUT to build keyspace.
     */
    @LispMethod(comment = "Leave key tiles as is and use standard PUT to build keyspace.")
    public static SubLObject conservative_fast_fht_optimization_modeP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return eq($CONSERVATIVE, $fast_file_hash_table_optimization_mode$.getDynamicValue(thread));
    }

    public static final SubLObject invalid_fast_fht_optimization_mode_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return Errors.error($str_alt334$Invalid_Fast_FHT_optimization_mod, $fast_file_hash_table_optimization_mode$.getDynamicValue(thread));
        }
    }

    public static SubLObject invalid_fast_fht_optimization_mode() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return Errors.error($str388$Invalid_Fast_FHT_optimization_mod, $fast_file_hash_table_optimization_mode$.getDynamicValue(thread));
    }

    public static final SubLObject fast_create_fht_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject fast_create_fht_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject fast_create_fht_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.file_hash_table.$fast_create_fht_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject fast_create_fht_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.file_hash_table.$fast_create_fht_native.class ? T : NIL;
    }

    public static final SubLObject fast_create_fht_fht_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, FAST_CREATE_FHT_P);
        return v_object.getField2();
    }

    public static SubLObject fast_create_fht_fht(final SubLObject v_object) {
        assert NIL != fast_create_fht_p(v_object) : "! file_hash_table.fast_create_fht_p(v_object) " + "file_hash_table.fast_create_fht_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject fast_create_fht_tempstem_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, FAST_CREATE_FHT_P);
        return v_object.getField3();
    }

    public static SubLObject fast_create_fht_tempstem(final SubLObject v_object) {
        assert NIL != fast_create_fht_p(v_object) : "! file_hash_table.fast_create_fht_p(v_object) " + "file_hash_table.fast_create_fht_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject fast_create_fht_tempfile_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, FAST_CREATE_FHT_P);
        return v_object.getField4();
    }

    public static SubLObject fast_create_fht_tempfile(final SubLObject v_object) {
        assert NIL != fast_create_fht_p(v_object) : "! file_hash_table.fast_create_fht_p(v_object) " + "file_hash_table.fast_create_fht_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject fast_create_fht_keystream_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, FAST_CREATE_FHT_P);
        return v_object.getField5();
    }

    public static SubLObject fast_create_fht_keystream(final SubLObject v_object) {
        assert NIL != fast_create_fht_p(v_object) : "! file_hash_table.fast_create_fht_p(v_object) " + "file_hash_table.fast_create_fht_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject _csetf_fast_create_fht_fht_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, FAST_CREATE_FHT_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_fast_create_fht_fht(final SubLObject v_object, final SubLObject value) {
        assert NIL != fast_create_fht_p(v_object) : "! file_hash_table.fast_create_fht_p(v_object) " + "file_hash_table.fast_create_fht_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_fast_create_fht_tempstem_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, FAST_CREATE_FHT_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_fast_create_fht_tempstem(final SubLObject v_object, final SubLObject value) {
        assert NIL != fast_create_fht_p(v_object) : "! file_hash_table.fast_create_fht_p(v_object) " + "file_hash_table.fast_create_fht_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_fast_create_fht_tempfile_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, FAST_CREATE_FHT_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_fast_create_fht_tempfile(final SubLObject v_object, final SubLObject value) {
        assert NIL != fast_create_fht_p(v_object) : "! file_hash_table.fast_create_fht_p(v_object) " + "file_hash_table.fast_create_fht_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_fast_create_fht_keystream_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, FAST_CREATE_FHT_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_fast_create_fht_keystream(final SubLObject v_object, final SubLObject value) {
        assert NIL != fast_create_fht_p(v_object) : "! file_hash_table.fast_create_fht_p(v_object) " + "file_hash_table.fast_create_fht_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject make_fast_create_fht_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.file_hash_table.$fast_create_fht_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($FHT)) {
                        _csetf_fast_create_fht_fht(v_new, current_value);
                    } else {
                        if (pcase_var.eql($TEMPSTEM)) {
                            _csetf_fast_create_fht_tempstem(v_new, current_value);
                        } else {
                            if (pcase_var.eql($TEMPFILE)) {
                                _csetf_fast_create_fht_tempfile(v_new, current_value);
                            } else {
                                if (pcase_var.eql($KEYSTREAM)) {
                                    _csetf_fast_create_fht_keystream(v_new, current_value);
                                } else {
                                    Errors.error($str_alt47$Invalid_slot__S_for_construction_, current_arg);
                                }
                            }
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_fast_create_fht(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.file_hash_table.$fast_create_fht_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($FHT)) {
                _csetf_fast_create_fht_fht(v_new, current_value);
            } else
                if (pcase_var.eql($TEMPSTEM)) {
                    _csetf_fast_create_fht_tempstem(v_new, current_value);
                } else
                    if (pcase_var.eql($TEMPFILE)) {
                        _csetf_fast_create_fht_tempfile(v_new, current_value);
                    } else
                        if (pcase_var.eql($KEYSTREAM)) {
                            _csetf_fast_create_fht_keystream(v_new, current_value);
                        } else {
                            Errors.error($str48$Invalid_slot__S_for_construction_, current_arg);
                        }



        }
        return v_new;
    }

    public static SubLObject visit_defstruct_fast_create_fht(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_FAST_CREATE_FHT, FOUR_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $FHT, fast_create_fht_fht(obj));
        funcall(visitor_fn, obj, $SLOT, $TEMPSTEM, fast_create_fht_tempstem(obj));
        funcall(visitor_fn, obj, $SLOT, $TEMPFILE, fast_create_fht_tempfile(obj));
        funcall(visitor_fn, obj, $SLOT, $KEYSTREAM, fast_create_fht_keystream(obj));
        funcall(visitor_fn, obj, $END, MAKE_FAST_CREATE_FHT, FOUR_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_fast_create_fht_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_fast_create_fht(obj, visitor_fn);
    }

    public static final SubLObject fast_create_file_hash_table_alt(SubLObject filename, SubLObject tempstem, SubLObject testfn, SubLObject serialization) {
        if (tempstem == UNPROVIDED) {
            tempstem = $str_alt268$tmp_;
        }
        if (testfn == UNPROVIDED) {
            testfn = $default_fht_test_function$.getGlobalValue();
        }
        if (serialization == UNPROVIDED) {
            serialization = $default_fht_serialization_protocol$.getGlobalValue();
        }
        {
            SubLObject fast_fht = make_fast_create_fht(UNPROVIDED);
            SubLObject fht = create_file_hash_table(filename, ONE_INTEGER, ONE_INTEGER, testfn, serialization);
            _csetf_fast_create_fht_fht(fast_fht, fht);
            _csetf_fast_create_fht_tempstem(fast_fht, tempstem);
            fast_create_allocate_keystream(fast_fht);
            fast_create_fixup_object_heap(fast_fht);
            return fast_fht;
        }
    }

    public static SubLObject fast_create_file_hash_table(final SubLObject filename, SubLObject tempstem, SubLObject testfn, SubLObject serialization) {
        if (tempstem == UNPROVIDED) {
            tempstem = $str307$tmp_;
        }
        if (testfn == UNPROVIDED) {
            testfn = $default_fht_test_function$.getGlobalValue();
        }
        if (serialization == UNPROVIDED) {
            serialization = $default_fht_serialization_protocol$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding(thread);
        final SubLObject _prev_bind_2 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding(thread);
        try {
            StreamsLow.$stream_initial_input_buffer_size$.bind($fast_fht_large_buffer_size$.getGlobalValue(), thread);
            StreamsLow.$stream_initial_output_buffer_size$.bind(StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue(thread), thread);
            final SubLObject fast_fht = make_fast_create_fht(UNPROVIDED);
            final SubLObject fht = create_file_hash_table(filename, ONE_INTEGER, ONE_INTEGER, testfn, serialization);
            _csetf_fast_create_fht_fht(fast_fht, fht);
            _csetf_fast_create_fht_tempstem(fast_fht, tempstem);
            fast_create_allocate_keystream(fast_fht);
            fast_create_fixup_object_heap(fast_fht);
            return fast_fht;
        } finally {
            StreamsLow.$stream_initial_output_buffer_size$.rebind(_prev_bind_2, thread);
            StreamsLow.$stream_initial_input_buffer_size$.rebind(_prev_bind_0, thread);
        }
    }

    public static final SubLObject fast_create_allocate_keystream_alt(SubLObject fast_fht) {
        {
            SubLObject tempfile = make_prefixed_temp_filename($str_alt354$keystream_, fast_create_fht_tempstem(fast_fht));
            SubLObject stream = compatibility.open_binary(tempfile, $IO, UNPROVIDED);
            _csetf_fast_create_fht_tempfile(fast_fht, tempfile);
            _csetf_fast_create_fht_keystream(fast_fht, stream);
        }
        return fast_fht;
    }

    public static SubLObject fast_create_allocate_keystream(final SubLObject fast_fht) {
        final SubLObject tempfile = file_utilities.make_prefixed_temp_filename($str413$keystream_, fast_create_fht_tempstem(fast_fht));
        final SubLObject stream = compatibility.open_binary(tempfile, $IO);
        _csetf_fast_create_fht_tempfile(fast_fht, tempfile);
        _csetf_fast_create_fht_keystream(fast_fht, stream);
        return fast_fht;
    }

    public static final SubLObject fast_create_fixup_object_heap_alt(SubLObject fast_fht) {
        {
            SubLObject fht = fast_create_fht_fht(fast_fht);
            SubLObject header = file_hash_table_header(fht);
            _csetf_htfile_header_key_space_offset(header, subtract(expt(TWO_INTEGER, multiply(EIGHT_INTEGER, EIGHT_INTEGER)), ONE_INTEGER));
        }
        return fast_fht;
    }

    public static SubLObject fast_create_fixup_object_heap(final SubLObject fast_fht) {
        final SubLObject fht = fast_create_fht_fht(fast_fht);
        final SubLObject header = file_hash_table_header(fht);
        _csetf_htfile_header_key_space_offset(header, subtract(expt(TWO_INTEGER, multiply(EIGHT_INTEGER, EIGHT_INTEGER)), ONE_INTEGER));
        return fast_fht;
    }

    public static final SubLObject fast_put_file_hash_table_alt(SubLObject key, SubLObject fast_fht, SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject fht = fast_create_fht_fht(fast_fht);
                SubLObject encoding_key_output_fn = file_hash_table_encoding_key_output_fn(fht);
                SubLObject internal_key = funcall(encoding_key_output_fn, key);
                thread.resetMultipleValues();
                {
                    SubLObject key_entry = perform_fast_fht_put(fht, internal_key, value);
                    SubLObject object_entry = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    update_fast_fht_keystream(fast_fht, internal_key, key_entry);
                }
            }
            return fast_fht;
        }
    }

    public static SubLObject fast_put_file_hash_table(final SubLObject key, final SubLObject fast_fht, final SubLObject value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject fht = fast_create_fht_fht(fast_fht);
        final SubLObject encoding_key_output_fn = file_hash_table_encoding_key_output_fn(fht);
        final SubLObject internal_key = funcall(encoding_key_output_fn, key);
        thread.resetMultipleValues();
        final SubLObject key_entry = perform_fast_fht_put(fht, internal_key, value);
        final SubLObject object_entry = thread.secondMultipleValue();
        thread.resetMultipleValues();
        update_fast_fht_keystream(fast_fht, internal_key, key_entry);
        return fast_fht;
    }

    public static final SubLObject perform_fast_fht_put_alt(SubLObject fht, SubLObject key, SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject key_entry = make_htfile_key_entry(UNPROVIDED);
                SubLObject object_entry = make_htfile_object_entry(UNPROVIDED);
                _csetf_htfile_key_entry_hash_code(key_entry, fht_sxhash_for_fht(fht, key));
                {
                    SubLObject _prev_bind_0 = $fast_put_skip_output_forcing$.currentBinding(thread);
                    try {
                        $fast_put_skip_output_forcing$.bind(T, thread);
                        perform_fht_put_insert(fht, key, value, MINUS_ONE_INTEGER, key_entry, object_entry, NIL);
                    } finally {
                        $fast_put_skip_output_forcing$.rebind(_prev_bind_0, thread);
                    }
                }
                return values(key_entry, object_entry);
            }
        }
    }

    public static SubLObject perform_fast_fht_put(final SubLObject fht, final SubLObject key, final SubLObject value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject key_entry = make_htfile_key_entry(UNPROVIDED);
        final SubLObject object_entry = make_htfile_object_entry(UNPROVIDED);
        _csetf_htfile_key_entry_hash_code(key_entry, fht_sxhash_for_fht(fht, key));
        final SubLObject _prev_bind_0 = $fast_put_skip_output_forcing$.currentBinding(thread);
        try {
            $fast_put_skip_output_forcing$.bind(T, thread);
            perform_fht_put_insert(fht, key, value, MINUS_ONE_INTEGER, key_entry, object_entry, NIL);
        } finally {
            $fast_put_skip_output_forcing$.rebind(_prev_bind_0, thread);
        }
        return values(key_entry, object_entry);
    }

    public static final SubLObject update_fast_fht_keystream_alt(SubLObject fast_fht, SubLObject key, SubLObject key_entry) {
        {
            SubLObject keystream = fast_create_fht_keystream(fast_fht);
            cfasl_output(htfile_key_entry_hash_code(key_entry), keystream);
            cfasl_output(htfile_key_entry_key_offset(key_entry), keystream);
            if (NIL == aggressive_fast_fht_optimization_modeP()) {
                cfasl_output(key, keystream);
            }
        }
        return fast_fht;
    }

    public static SubLObject update_fast_fht_keystream(final SubLObject fast_fht, final SubLObject key, final SubLObject key_entry) {
        final SubLObject keystream = fast_create_fht_keystream(fast_fht);
        cfasl_output(htfile_key_entry_hash_code(key_entry), keystream);
        cfasl_output(htfile_key_entry_key_offset(key_entry), keystream);
        if (NIL == aggressive_fast_fht_optimization_modeP()) {
            cfasl_output(key, keystream);
        }
        return fast_fht;
    }

    /**
     *
     *
     * @param NON-UNIQUE-KEY-HANDLING;
     * 		What should we do if we encounter non-unique keys?
     * 		:ERROR means throw an error.
     * 		:USE-FIRST means use the first one we encounter and ignore subsequent ones.
     */
    @LispMethod(comment = "@param NON-UNIQUE-KEY-HANDLING;\r\n\t\tWhat should we do if we encounter non-unique keys?\r\n\t\t:ERROR means throw an error.\r\n\t\t:USE-FIRST means use the first one we encounter and ignore subsequent ones.")
    public static final SubLObject finalize_fast_create_file_hash_table_alt(SubLObject fast_fht, SubLObject keep_temporary_keyfileP, SubLObject non_unique_key_handling) {
        if (keep_temporary_keyfileP == UNPROVIDED) {
            keep_temporary_keyfileP = NIL;
        }
        if (non_unique_key_handling == UNPROVIDED) {
            non_unique_key_handling = $ERROR;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == member(non_unique_key_handling, $list_alt355, UNPROVIDED, UNPROVIDED)) {
                    Errors.error($str_alt356$Unknown_NON_UNIQUE_KEY_HANDLING_v, non_unique_key_handling);
                }
            }
            prepare_fast_fht_keyspace(fast_fht);
            thread.resetMultipleValues();
            {
                SubLObject set_file = insert_fast_fht_keystream_content(fast_fht, keep_temporary_keyfileP, non_unique_key_handling);
                SubLObject collision_file = thread.secondMultipleValue();
                thread.resetMultipleValues();
                shutdown_fast_create_fht(fast_fht, makeBoolean(NIL == keep_temporary_keyfileP));
                if (NIL == keep_temporary_keyfileP) {
                    {
                        SubLObject ignore_errors_tag = NIL;
                        try {
                            {
                                SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                                try {
                                    Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                                    try {
                                        Filesys.delete_file(set_file);
                                    } catch (Throwable catch_var) {
                                        Errors.handleThrowable(catch_var, NIL);
                                    }
                                } finally {
                                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                                }
                            }
                        } catch (Throwable ccatch_env_var) {
                            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
                        }
                    }
                    {
                        SubLObject ignore_errors_tag = NIL;
                        try {
                            {
                                SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                                try {
                                    Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                                    try {
                                        Filesys.delete_file(collision_file);
                                    } catch (Throwable catch_var) {
                                        Errors.handleThrowable(catch_var, NIL);
                                    }
                                } finally {
                                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                                }
                            }
                        } catch (Throwable ccatch_env_var) {
                            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
                        }
                    }
                }
            }
            return fast_fht;
        }
    }

    /**
     *
     *
     * @param NON-UNIQUE-KEY-HANDLING;
     * 		What should we do if we encounter non-unique keys?
     * 		:ERROR means throw an error.
     * 		:USE-FIRST means use the first one we encounter and ignore subsequent ones.
     */
    @LispMethod(comment = "@param NON-UNIQUE-KEY-HANDLING;\r\n\t\tWhat should we do if we encounter non-unique keys?\r\n\t\t:ERROR means throw an error.\r\n\t\t:USE-FIRST means use the first one we encounter and ignore subsequent ones.")
    public static SubLObject finalize_fast_create_file_hash_table(final SubLObject fast_fht, SubLObject keep_temporary_keyfileP, SubLObject non_unique_key_handling) {
        if (keep_temporary_keyfileP == UNPROVIDED) {
            keep_temporary_keyfileP = NIL;
        }
        if (non_unique_key_handling == UNPROVIDED) {
            non_unique_key_handling = $ERROR;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == member(non_unique_key_handling, $list414, UNPROVIDED, UNPROVIDED))) {
            Errors.error($str415$Unknown_NON_UNIQUE_KEY_HANDLING_v, non_unique_key_handling);
        }
        prepare_fast_fht_keyspace(fast_fht);
        file_hash_table_change_stream_buffer_size(fast_create_fht_fht(fast_fht), $int$1024);
        thread.resetMultipleValues();
        final SubLObject set_file = insert_fast_fht_keystream_content(fast_fht, keep_temporary_keyfileP, non_unique_key_handling);
        final SubLObject collision_file = thread.secondMultipleValue();
        thread.resetMultipleValues();
        shutdown_fast_create_fht(fast_fht, makeBoolean(NIL == keep_temporary_keyfileP));
        if (NIL == keep_temporary_keyfileP) {
            SubLObject ignore_errors_tag = NIL;
            try {
                thread.throwStack.push($IGNORE_ERRORS_TARGET);
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                    try {
                        Filesys.delete_file(set_file);
                    } catch (final Throwable catch_var) {
                        Errors.handleThrowable(catch_var, NIL);
                    }
                } finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
            } finally {
                thread.throwStack.pop();
            }
            ignore_errors_tag = NIL;
            try {
                thread.throwStack.push($IGNORE_ERRORS_TARGET);
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                    try {
                        Filesys.delete_file(collision_file);
                    } catch (final Throwable catch_var) {
                        Errors.handleThrowable(catch_var, NIL);
                    }
                } finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
            } finally {
                thread.throwStack.pop();
            }
        }
        return fast_fht;
    }

    public static final SubLObject prepare_fast_fht_keyspace_alt(SubLObject fast_fht) {
        {
            SubLObject fht = fast_create_fht_fht(fast_fht);
            realign_fast_fht_keyspace_offset(fht);
            realign_fast_fht_keyspace_capacity(fht);
            allocate_fast_fht_keyspace(fht);
        }
        return fast_fht;
    }

    public static SubLObject prepare_fast_fht_keyspace(final SubLObject fast_fht) {
        final SubLObject fht = fast_create_fht_fht(fast_fht);
        realign_fast_fht_keyspace_offset(fht);
        realign_fast_fht_keyspace_capacity(fht);
        allocate_fast_fht_keyspace(fht);
        return fast_fht;
    }

    /**
     * Align the keyspace to some sensible power of two.
     */
    @LispMethod(comment = "Align the keyspace to some sensible power of two.")
    public static final SubLObject realign_fast_fht_keyspace_offset_alt(SubLObject fht) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject header = file_hash_table_header(fht);
                SubLObject alignment = expt(TWO_INTEGER, $fast_fht_keyspace_alignment$.getDynamicValue(thread));
                SubLObject heap_top = htfile_header_current_heap_top(header);
                heap_top = add(heap_top, alignment);
                heap_top = multiply(add(integerDivide(heap_top, alignment), ONE_INTEGER), alignment);
                _csetf_htfile_header_key_space_offset(header, heap_top);
            }
            return fht;
        }
    }

    /**
     * Align the keyspace to some sensible power of two.
     */
    @LispMethod(comment = "Align the keyspace to some sensible power of two.")
    public static SubLObject realign_fast_fht_keyspace_offset(final SubLObject fht) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject header = file_hash_table_header(fht);
        final SubLObject alignment = expt(TWO_INTEGER, $fast_fht_keyspace_alignment$.getDynamicValue(thread));
        SubLObject heap_top = htfile_header_current_heap_top(header);
        heap_top = add(heap_top, alignment);
        heap_top = multiply(add(integerDivide(heap_top, alignment), ONE_INTEGER), alignment);
        _csetf_htfile_header_key_space_offset(header, heap_top);
        return fht;
    }

    public static final SubLObject realign_fast_fht_keyspace_capacity_alt(SubLObject fht) {
        {
            SubLObject header = file_hash_table_header(fht);
            _csetf_htfile_header_capacity(header, fht_ensure_hash_table_size(htfile_header_item_count(header)));
        }
        return fht;
    }

    public static SubLObject realign_fast_fht_keyspace_capacity(final SubLObject fht) {
        final SubLObject header = file_hash_table_header(fht);
        _csetf_htfile_header_capacity(header, fht_ensure_hash_table_size(htfile_header_item_count(header)));
        return fht;
    }

    public static final SubLObject allocate_fast_fht_keyspace_alt(SubLObject fht) {
        {
            SubLObject header = file_hash_table_header(fht);
            SubLObject new_keyspace = htfile_header_key_space_offset(header);
            SubLObject new_capacity = htfile_header_capacity(header);
            if (NIL == aggressive_fast_fht_optimization_modeP()) {
                allocate_new_fht_key_space(fht, new_keyspace, new_capacity);
            }
            write_fht_header(fht);
        }
        return fht;
    }

    public static SubLObject allocate_fast_fht_keyspace(final SubLObject fht) {
        final SubLObject header = file_hash_table_header(fht);
        final SubLObject new_keyspace = htfile_header_key_space_offset(header);
        final SubLObject new_capacity = htfile_header_capacity(header);
        if (NIL == aggressive_fast_fht_optimization_modeP()) {
            allocate_new_fht_key_space(fht, new_keyspace, new_capacity);
        }
        write_fht_header(fht);
        return fht;
    }

    public static final SubLObject insert_fast_fht_keystream_content_alt(SubLObject fast_fht, SubLObject keep_temporary_keyfileP, SubLObject non_unique_key_handling) {
        if (keep_temporary_keyfileP == UNPROVIDED) {
            keep_temporary_keyfileP = NIL;
        }
        if (non_unique_key_handling == UNPROVIDED) {
            non_unique_key_handling = $ERROR;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject fht = fast_create_fht_fht(fast_fht);
                SubLObject items = file_hash_table_count(fht);
                SubLObject keystream = fast_create_fht_keystream(fast_fht);
                force_output(keystream);
                compatibility.set_file_position(keystream, ZERO_INTEGER);
                if (NIL != conservative_fast_fht_optimization_modeP()) {
                    perform_fast_fht_insert_by_keystream_ordering(fast_fht, keystream, $$$ambiguous, non_unique_key_handling);
                    return values(NIL, NIL);
                } else {
                    if ((NIL != moderate_fast_fht_optimization_modeP()) || (NIL != aggressive_fast_fht_optimization_modeP())) {
                        thread.resetMultipleValues();
                        {
                            SubLObject set_file = fast_fht_sort_keystream_by_expected_index(fht, keystream, items, fast_create_fht_tempstem(fast_fht), makeBoolean(NIL == keep_temporary_keyfileP));
                            SubLObject collision_file = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            {
                                SubLObject stream = NIL;
                                try {
                                    {
                                        SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                                        try {
                                            stream_macros.$stream_requires_locking$.bind(NIL, thread);
                                            stream = compatibility.open_binary(set_file, $INPUT, NIL);
                                        } finally {
                                            stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                                        }
                                    }
                                    if (!stream.isStream()) {
                                        Errors.error($str_alt360$Unable_to_open__S, set_file);
                                    }
                                    {
                                        SubLObject stream_9 = stream;
                                        if (NIL != moderate_fast_fht_optimization_modeP()) {
                                            perform_fast_fht_insert_by_keystream_ordering(fast_fht, stream_9, $$$unambiguous, non_unique_key_handling);
                                        } else {
                                            if (NIL != aggressive_fast_fht_optimization_modeP()) {
                                                perform_fast_fht_insert_of_unambiguous_keys(fast_fht, stream_9);
                                            } else {
                                                invalid_fast_fht_optimization_mode();
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
                            {
                                SubLObject stream = NIL;
                                try {
                                    {
                                        SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                                        try {
                                            stream_macros.$stream_requires_locking$.bind(NIL, thread);
                                            stream = compatibility.open_binary(collision_file, $INPUT, NIL);
                                        } finally {
                                            stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                                        }
                                    }
                                    if (!stream.isStream()) {
                                        Errors.error($str_alt360$Unable_to_open__S, collision_file);
                                    }
                                    {
                                        SubLObject stream_10 = stream;
                                        perform_fast_fht_insert_by_keystream_ordering(fast_fht, stream_10, $$$ambiguous, non_unique_key_handling);
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
                            return values(set_file, collision_file);
                        }
                    } else {
                        invalid_fast_fht_optimization_mode();
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject insert_fast_fht_keystream_content(final SubLObject fast_fht, SubLObject keep_temporary_keyfileP, SubLObject non_unique_key_handling) {
        if (keep_temporary_keyfileP == UNPROVIDED) {
            keep_temporary_keyfileP = NIL;
        }
        if (non_unique_key_handling == UNPROVIDED) {
            non_unique_key_handling = $ERROR;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject fht = fast_create_fht_fht(fast_fht);
        final SubLObject items = file_hash_table_count(fht);
        final SubLObject keystream = fast_create_fht_keystream(fast_fht);
        force_output(keystream);
        compatibility.set_file_position(keystream, ZERO_INTEGER);
        try {
            final SubLObject _prev_bind_0 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding(thread);
            final SubLObject _prev_bind_2 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding(thread);
            try {
                StreamsLow.$stream_initial_input_buffer_size$.bind($fast_fht_large_buffer_size$.getGlobalValue(), thread);
                StreamsLow.$stream_initial_output_buffer_size$.bind(StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue(thread), thread);
                if (NIL != conservative_fast_fht_optimization_modeP()) {
                    perform_fast_fht_insert_by_keystream_ordering(fast_fht, keystream, $$$ambiguous, non_unique_key_handling);
                    return values(NIL, NIL);
                }
                if ((NIL != moderate_fast_fht_optimization_modeP()) || (NIL != aggressive_fast_fht_optimization_modeP())) {
                    thread.resetMultipleValues();
                    final SubLObject set_file = fast_fht_sort_keystream_by_expected_index(fht, keystream, items, fast_create_fht_tempstem(fast_fht), makeBoolean(NIL == keep_temporary_keyfileP));
                    final SubLObject collision_file = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    SubLObject stream = NIL;
                    try {
                        final SubLObject _prev_bind_0_$14 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                        try {
                            stream_macros.$stream_requires_locking$.bind(NIL, thread);
                            stream = compatibility.open_binary(set_file, $INPUT);
                        } finally {
                            stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_$14, thread);
                        }
                        if (!stream.isStream()) {
                            Errors.error($str419$Unable_to_open__S, set_file);
                        }
                        final SubLObject stream_$15 = stream;
                        if (NIL != moderate_fast_fht_optimization_modeP()) {
                            perform_fast_fht_insert_by_keystream_ordering(fast_fht, stream_$15, $$$unambiguous, non_unique_key_handling);
                        } else
                            if (NIL != aggressive_fast_fht_optimization_modeP()) {
                                perform_fast_fht_insert_of_unambiguous_keys(fast_fht, stream_$15);
                            } else {
                                invalid_fast_fht_optimization_mode();
                            }

                    } finally {
                        final SubLObject _prev_bind_0_$15 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            if (stream.isStream()) {
                                close(stream, UNPROVIDED);
                            }
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$15, thread);
                        }
                    }
                    file_hash_table_enable_memory_mapping(fast_create_fht_fht(fast_fht));
                    stream = NIL;
                    try {
                        final SubLObject _prev_bind_0_$16 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                        try {
                            stream_macros.$stream_requires_locking$.bind(NIL, thread);
                            stream = compatibility.open_binary(collision_file, $INPUT);
                        } finally {
                            stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_$16, thread);
                        }
                        if (!stream.isStream()) {
                            Errors.error($str419$Unable_to_open__S, collision_file);
                        }
                        final SubLObject stream_$16 = stream;
                        perform_fast_fht_insert_by_keystream_ordering(fast_fht, stream_$16, $$$ambiguous, non_unique_key_handling);
                    } finally {
                        final SubLObject _prev_bind_0_$17 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values2 = getValuesAsVector();
                            if (stream.isStream()) {
                                close(stream, UNPROVIDED);
                            }
                            restoreValuesFromVector(_values2);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$17, thread);
                        }
                    }
                    return values(set_file, collision_file);
                }
                invalid_fast_fht_optimization_mode();
            } finally {
                StreamsLow.$stream_initial_output_buffer_size$.rebind(_prev_bind_2, thread);
                StreamsLow.$stream_initial_input_buffer_size$.rebind(_prev_bind_0, thread);
            }
        } finally {
            final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values3 = getValuesAsVector();
                file_hash_table_change_stream_buffer_size(fast_create_fht_fht(fast_fht), $fast_fht_small_buffer_size$.getGlobalValue());
                restoreValuesFromVector(_values3);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return NIL;
    }

    public static final SubLObject perform_fast_fht_insert_of_unambiguous_keys_alt(SubLObject fast_fht, SubLObject keystream) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == aggressive_fast_fht_optimization_modeP()) {
                    Errors.error($str_alt362$Cannot_call_this_method_in_mode__, $fast_file_hash_table_optimization_mode$.getDynamicValue(thread));
                }
            }
            {
                SubLObject fht = fast_create_fht_fht(fast_fht);
                SubLObject total = file_length(keystream);
                SubLObject msg = $str_alt363$Seeding_keyspace_with_unambiguous;
                SubLObject doneP = NIL;
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
                        noting_percent_progress_preamble(msg);
                        {
                            SubLObject header = file_hash_table_header(fht);
                            SubLObject fht_stream = file_hash_table_stream(fht);
                            SubLObject key_entry = new_htfile_key_entry(ZERO_INTEGER, UNPROVIDED);
                            SubLObject prev_index = MINUS_ONE_INTEGER;
                            SubLObject keyspace = htfile_header_key_space_offset(header);
                            compatibility.set_file_position(fht_stream, keyspace);
                            while (NIL == doneP) {
                                note_percent_progress(file_position(keystream, UNPROVIDED), total);
                                {
                                    SubLObject hashcode = cfasl_input(keystream, NIL, $EOF);
                                    SubLObject offset = cfasl_input(keystream, NIL, $EOF);
                                    if ($EOF == hashcode) {
                                        doneP = T;
                                    } else {
                                        {
                                            SubLObject index = fht_hash(hashcode, fht);
                                            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                                if (!prev_index.numL(index)) {
                                                    Errors.error($str_alt364$Run_in_index_of_keystream__prev__, prev_index, index);
                                                }
                                            }
                                            prev_index = add(prev_index, ONE_INTEGER);
                                            while (prev_index.numL(index)) {
                                                write_key_entry_object(fht_stream, $fht_empty_key_entry$.getGlobalValue());
                                                prev_index = add(prev_index, ONE_INTEGER);
                                            } 
                                            _csetf_htfile_key_entry_hash_code(key_entry, hashcode);
                                            _csetf_htfile_key_entry_key_offset(key_entry, offset);
                                            write_key_entry_object(fht_stream, key_entry);
                                        }
                                    }
                                }
                            } 
                            {
                                SubLObject capacity = htfile_header_capacity(header);
                                while (prev_index.numL(capacity)) {
                                    write_key_entry_object(fht_stream, $fht_empty_key_entry$.getGlobalValue());
                                    prev_index = add(prev_index, ONE_INTEGER);
                                } 
                            }
                            force_output(fht_stream);
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
            return fast_fht;
        }
    }

    public static SubLObject perform_fast_fht_insert_of_unambiguous_keys(final SubLObject fast_fht, final SubLObject keystream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == aggressive_fast_fht_optimization_modeP())) {
            Errors.error($str421$Cannot_call_this_method_in_mode__, $fast_file_hash_table_optimization_mode$.getDynamicValue(thread));
        }
        final SubLObject fht = fast_create_fht_fht(fast_fht);
        final SubLObject total = file_length(keystream);
        final SubLObject msg = $str422$Seeding_keyspace_with_unambiguous;
        SubLObject doneP = NIL;
        file_hash_table_change_stream_buffer_size(fht, $fast_fht_large_buffer_size$.getGlobalValue());
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
                noting_percent_progress_preamble(msg);
                final SubLObject header = file_hash_table_header(fht);
                final SubLObject fht_stream = file_hash_table_stream(fht);
                final SubLObject key_entry = new_htfile_key_entry(ZERO_INTEGER, UNPROVIDED);
                SubLObject prev_index = MINUS_ONE_INTEGER;
                final SubLObject keyspace = htfile_header_key_space_offset(header);
                compatibility.set_file_position(fht_stream, keyspace);
                while (NIL == doneP) {
                    note_percent_progress(file_position(keystream, UNPROVIDED), total);
                    final SubLObject hashcode = cfasl_input(keystream, NIL, $EOF);
                    final SubLObject offset = cfasl_input(keystream, NIL, $EOF);
                    if ($EOF == hashcode) {
                        doneP = T;
                    } else {
                        final SubLObject index = fht_hash(hashcode, fht);
                        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!prev_index.numL(index))) {
                            Errors.error($str423$Run_in_index_of_keystream__prev__, prev_index, index);
                        }
                        for (prev_index = add(prev_index, ONE_INTEGER); prev_index.numL(index); prev_index = add(prev_index, ONE_INTEGER)) {
                            write_key_entry_object(fht_stream, $fht_empty_key_entry$.getGlobalValue());
                        }
                        _csetf_htfile_key_entry_hash_code(key_entry, hashcode);
                        _csetf_htfile_key_entry_key_offset(key_entry, offset);
                        write_key_entry_object(fht_stream, key_entry);
                    }
                } 
                for (final SubLObject capacity = htfile_header_capacity(header); prev_index.numL(capacity); prev_index = add(prev_index, ONE_INTEGER)) {
                    write_key_entry_object(fht_stream, $fht_empty_key_entry$.getGlobalValue());
                }
                force_output(fht_stream);
            } finally {
                final SubLObject _prev_bind_0_$20 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$20, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return fast_fht;
    }

    public static final SubLObject perform_fast_fht_insert_by_keystream_ordering_alt(SubLObject fast_fht, SubLObject keystream, SubLObject key_type, SubLObject non_unique_key_handling) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject fht = fast_create_fht_fht(fast_fht);
                SubLObject total = file_length(keystream);
                SubLObject msg = cconcatenate($str_alt365$Inserting_, new SubLObject[]{ format_nil.format_nil_a_no_copy(key_type), $str_alt366$_keys_into_keyspace_____ });
                SubLObject doneP = NIL;
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
                        noting_percent_progress_preamble(msg);
                        while (NIL == doneP) {
                            note_percent_progress(file_position(keystream, UNPROVIDED), total);
                            {
                                SubLObject hashcode = cfasl_input(keystream, NIL, $EOF);
                                SubLObject offset = cfasl_input(keystream, NIL, $EOF);
                                SubLObject key = cfasl_input(keystream, NIL, $EOF);
                                if ($EOF == offset) {
                                    doneP = T;
                                } else {
                                    thread.resetMultipleValues();
                                    {
                                        SubLObject status = fht_lookup_key(fht, key, hashcode);
                                        SubLObject index = thread.secondMultipleValue();
                                        SubLObject key_entry = thread.thirdMultipleValue();
                                        SubLObject object_entry = thread.fourthMultipleValue();
                                        thread.resetMultipleValues();
                                        if (status == $NOT_FOUND) {
                                            _csetf_htfile_key_entry_key_offset(key_entry, offset);
                                            store_fht_key_entry(fht, index, key_entry);
                                        } else {
                                            {
                                                SubLObject format_string = $str_alt367$Sorry__key__A_appears_not_to_be_u;
                                                SubLObject pcase_var = non_unique_key_handling;
                                                if (pcase_var.eql($ERROR)) {
                                                    Errors.error(format_string, key);
                                                } else {
                                                    if (pcase_var.eql($USE_FIRST)) {
                                                        Errors.warn(format_string, key);
                                                    }
                                                }
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
            }
            return fast_fht;
        }
    }

    public static SubLObject perform_fast_fht_insert_by_keystream_ordering(final SubLObject fast_fht, final SubLObject keystream, final SubLObject key_type, final SubLObject non_unique_key_handling) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject fht = fast_create_fht_fht(fast_fht);
        final SubLObject total = file_length(keystream);
        final SubLObject msg = cconcatenate($$$Inserting_, new SubLObject[]{ format_nil.format_nil_a_no_copy(key_type), $str425$_keys_into_keyspace_____ });
        SubLObject doneP = NIL;
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
                noting_percent_progress_preamble(msg);
                while (NIL == doneP) {
                    note_percent_progress(file_position(keystream, UNPROVIDED), total);
                    final SubLObject hashcode = cfasl_input(keystream, NIL, $EOF);
                    final SubLObject offset = cfasl_input(keystream, NIL, $EOF);
                    final SubLObject key = cfasl_input(keystream, NIL, $EOF);
                    if ($EOF == offset) {
                        doneP = T;
                    } else {
                        thread.resetMultipleValues();
                        final SubLObject status = fht_lookup_key(fht, key, hashcode);
                        final SubLObject index = thread.secondMultipleValue();
                        final SubLObject key_entry = thread.thirdMultipleValue();
                        final SubLObject object_entry = thread.fourthMultipleValue();
                        thread.resetMultipleValues();
                        if (status == $NOT_FOUND) {
                            _csetf_htfile_key_entry_key_offset(key_entry, offset);
                            store_fht_key_entry(fht, index, key_entry, NIL);
                        } else {
                            final SubLObject format_string = $str426$Sorry__key__A_appears_not_to_be_u;
                            if (non_unique_key_handling.eql($ERROR)) {
                                Errors.error(format_string, key);
                            } else {
                                if (!non_unique_key_handling.eql($USE_FIRST)) {
                                    continue;
                                }
                                Errors.warn(format_string, key);
                            }
                        }
                    }
                } 
            } finally {
                final SubLObject _prev_bind_0_$21 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$21, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        force_output(file_hash_table_stream(fht));
        return fast_fht;
    }

    public static final SubLObject shutdown_fast_create_fht_alt(SubLObject fast_fht, SubLObject cleanupP) {
        if (cleanupP == UNPROVIDED) {
            cleanupP = NIL;
        }
        close(fast_create_fht_keystream(fast_fht), UNPROVIDED);
        if (NIL != cleanupP) {
            Filesys.delete_file(fast_create_fht_tempfile(fast_fht));
        }
        finalize_file_hash_table(fast_create_fht_fht(fast_fht));
        return fast_fht;
    }

    public static SubLObject shutdown_fast_create_fht(final SubLObject fast_fht, SubLObject cleanupP) {
        if (cleanupP == UNPROVIDED) {
            cleanupP = NIL;
        }
        close(fast_create_fht_keystream(fast_fht), UNPROVIDED);
        if (NIL != cleanupP) {
            Filesys.delete_file(fast_create_fht_tempfile(fast_fht));
        }
        finalize_file_hash_table(fast_create_fht_fht(fast_fht));
        return fast_fht;
    }

    public static final SubLObject fast_fht_keystream_sorter_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject fast_fht_keystream_sorter_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject fast_fht_keystream_sorter_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.file_hash_table.$fast_fht_keystream_sorter_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject fast_fht_keystream_sorter_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.file_hash_table.$fast_fht_keystream_sorter_native.class ? T : NIL;
    }

    public static final SubLObject fstfht_ksorter_tempstem_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, FAST_FHT_KEYSTREAM_SORTER_P);
        return v_object.getField2();
    }

    public static SubLObject fstfht_ksorter_tempstem(final SubLObject v_object) {
        assert NIL != fast_fht_keystream_sorter_p(v_object) : "! file_hash_table.fast_fht_keystream_sorter_p(v_object) " + "file_hash_table.fast_fht_keystream_sorter_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject fstfht_ksorter_in_files_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, FAST_FHT_KEYSTREAM_SORTER_P);
        return v_object.getField3();
    }

    public static SubLObject fstfht_ksorter_in_files(final SubLObject v_object) {
        assert NIL != fast_fht_keystream_sorter_p(v_object) : "! file_hash_table.fast_fht_keystream_sorter_p(v_object) " + "file_hash_table.fast_fht_keystream_sorter_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject fstfht_ksorter_out_files_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, FAST_FHT_KEYSTREAM_SORTER_P);
        return v_object.getField4();
    }

    public static SubLObject fstfht_ksorter_out_files(final SubLObject v_object) {
        assert NIL != fast_fht_keystream_sorter_p(v_object) : "! file_hash_table.fast_fht_keystream_sorter_p(v_object) " + "file_hash_table.fast_fht_keystream_sorter_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject _csetf_fstfht_ksorter_tempstem_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, FAST_FHT_KEYSTREAM_SORTER_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_fstfht_ksorter_tempstem(final SubLObject v_object, final SubLObject value) {
        assert NIL != fast_fht_keystream_sorter_p(v_object) : "! file_hash_table.fast_fht_keystream_sorter_p(v_object) " + "file_hash_table.fast_fht_keystream_sorter_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_fstfht_ksorter_in_files_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, FAST_FHT_KEYSTREAM_SORTER_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_fstfht_ksorter_in_files(final SubLObject v_object, final SubLObject value) {
        assert NIL != fast_fht_keystream_sorter_p(v_object) : "! file_hash_table.fast_fht_keystream_sorter_p(v_object) " + "file_hash_table.fast_fht_keystream_sorter_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_fstfht_ksorter_out_files_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, FAST_FHT_KEYSTREAM_SORTER_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_fstfht_ksorter_out_files(final SubLObject v_object, final SubLObject value) {
        assert NIL != fast_fht_keystream_sorter_p(v_object) : "! file_hash_table.fast_fht_keystream_sorter_p(v_object) " + "file_hash_table.fast_fht_keystream_sorter_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject make_fast_fht_keystream_sorter_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.file_hash_table.$fast_fht_keystream_sorter_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($TEMPSTEM)) {
                        _csetf_fstfht_ksorter_tempstem(v_new, current_value);
                    } else {
                        if (pcase_var.eql($IN_FILES)) {
                            _csetf_fstfht_ksorter_in_files(v_new, current_value);
                        } else {
                            if (pcase_var.eql($OUT_FILES)) {
                                _csetf_fstfht_ksorter_out_files(v_new, current_value);
                            } else {
                                Errors.error($str_alt47$Invalid_slot__S_for_construction_, current_arg);
                            }
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_fast_fht_keystream_sorter(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.file_hash_table.$fast_fht_keystream_sorter_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($TEMPSTEM)) {
                _csetf_fstfht_ksorter_tempstem(v_new, current_value);
            } else
                if (pcase_var.eql($IN_FILES)) {
                    _csetf_fstfht_ksorter_in_files(v_new, current_value);
                } else
                    if (pcase_var.eql($OUT_FILES)) {
                        _csetf_fstfht_ksorter_out_files(v_new, current_value);
                    } else {
                        Errors.error($str48$Invalid_slot__S_for_construction_, current_arg);
                    }


        }
        return v_new;
    }

    public static SubLObject visit_defstruct_fast_fht_keystream_sorter(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_FAST_FHT_KEYSTREAM_SORTER, THREE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $TEMPSTEM, fstfht_ksorter_tempstem(obj));
        funcall(visitor_fn, obj, $SLOT, $IN_FILES, fstfht_ksorter_in_files(obj));
        funcall(visitor_fn, obj, $SLOT, $OUT_FILES, fstfht_ksorter_out_files(obj));
        funcall(visitor_fn, obj, $END, MAKE_FAST_FHT_KEYSTREAM_SORTER, THREE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_fast_fht_keystream_sorter_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_fast_fht_keystream_sorter(obj, visitor_fn);
    }

    /**
     * Take the contents of the keystream and, using a tiled merge sort, generate
     * a representation that proceeds in terms of the expected index of the entries.
     * Generates two files, one file of entries whose index numbers are all unique,
     * and one file of values that collide with some entries in the set. The
     * contents of the two files is mutually disjoint.
     *
     * @return 0 SET-FILE a temporary file with one entry per index
     * @return 1 COLLISION-FILE a temporary file with all index collisions not in SET-FILE
     */
    @LispMethod(comment = "Take the contents of the keystream and, using a tiled merge sort, generate\r\na representation that proceeds in terms of the expected index of the entries.\r\nGenerates two files, one file of entries whose index numbers are all unique,\r\nand one file of values that collide with some entries in the set. The\r\ncontents of the two files is mutually disjoint.\r\n\r\n@return 0 SET-FILE a temporary file with one entry per index\r\n@return 1 COLLISION-FILE a temporary file with all index collisions not in SET-FILE\nTake the contents of the keystream and, using a tiled merge sort, generate\na representation that proceeds in terms of the expected index of the entries.\nGenerates two files, one file of entries whose index numbers are all unique,\nand one file of values that collide with some entries in the set. The\ncontents of the two files is mutually disjoint.")
    public static final SubLObject fast_fht_sort_keystream_by_expected_index_alt(SubLObject fht, SubLObject keystream, SubLObject count, SubLObject temp_stem, SubLObject cleanupP) {
        if (temp_stem == UNPROVIDED) {
            temp_stem = temp_directory();
        }
        if (cleanupP == UNPROVIDED) {
            cleanupP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject total_passes = ceiling(log(count, TWO_INTEGER), UNPROVIDED);
                SubLObject fast_fht_sorter = new_fast_fht_keystream_sorter(temp_stem);
                SubLObject tile_count = NIL;
                {
                    SubLObject _prev_bind_0 = $noting_progress_start_time$.currentBinding(thread);
                    try {
                        $noting_progress_start_time$.bind(get_universal_time(), thread);
                        noting_progress_preamble($str_alt385$Prepare_tiled_input_files_____);
                        tile_count = fast_fht_split_keystream_into_tiled_input_files(fast_fht_sorter, keystream, fht);
                        noting_progress_postamble();
                    } finally {
                        $noting_progress_start_time$.rebind(_prev_bind_0, thread);
                    }
                }
                if (tile_count.numL(THREE_INTEGER)) {
                    {
                        SubLObject _prev_bind_0 = $noting_progress_start_time$.currentBinding(thread);
                        try {
                            $noting_progress_start_time$.bind(get_universal_time(), thread);
                            noting_progress_preamble($str_alt386$Less_than_3_tiles__no_sort_needed);
                            {
                                SubLObject temp_files = fstfht_ksorter_out_files(fast_fht_sorter);
                                _csetf_fstfht_ksorter_out_files(fast_fht_sorter, fstfht_ksorter_in_files(fast_fht_sorter));
                                _csetf_fstfht_ksorter_in_files(fast_fht_sorter, temp_files);
                            }
                            noting_progress_postamble();
                        } finally {
                            $noting_progress_start_time$.rebind(_prev_bind_0, thread);
                        }
                    }
                    if (tile_count.numE(ONE_INTEGER)) {
                        {
                            SubLObject output_files = fstfht_ksorter_out_files(fast_fht_sorter);
                            SubLObject file_a = output_files.first();
                            SubLObject file_b = second(output_files);
                            SubLObject empty_file = (NIL != empty_file_p(file_a)) ? ((SubLObject) (file_a)) : file_b;
                            SubLObject stream = NIL;
                            try {
                                {
                                    SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                                    try {
                                        stream_macros.$stream_requires_locking$.bind(NIL, thread);
                                        stream = compatibility.open_binary(empty_file, $OUTPUT, NIL);
                                    } finally {
                                        stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                                    }
                                }
                                if (!stream.isStream()) {
                                    Errors.error($str_alt360$Unable_to_open__S, empty_file);
                                }
                                {
                                    SubLObject s = stream;
                                    fast_fht_write_keystream_chunk_separator(s);
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
                    }
                } else {
                    total_passes = subtract(total_passes, $fast_fht_keystream_tile_size_pow2$.getDynamicValue(thread));
                    {
                        SubLObject msg = cconcatenate($str_alt388$Merge_sorting_keystream_of_, new SubLObject[]{ format_nil.format_nil_a_no_copy(tile_count), $str_alt389$_tiles_in_, format_nil.format_nil_a_no_copy(total_passes), $str_alt390$_passes____ });
                        {
                            SubLObject _prev_bind_0 = $noting_progress_start_time$.currentBinding(thread);
                            try {
                                $noting_progress_start_time$.bind(get_universal_time(), thread);
                                noting_progress_preamble(msg);
                                total_passes = subtract(total_passes, ONE_INTEGER);
                                fast_fht_almost_merge_sort_keystream(fht, fast_fht_sorter, total_passes);
                                noting_progress_postamble();
                            } finally {
                                $noting_progress_start_time$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
                {
                    SubLObject _prev_bind_0 = $noting_progress_start_time$.currentBinding(thread);
                    try {
                        $noting_progress_start_time$.bind(get_universal_time(), thread);
                        noting_progress_preamble($str_alt391$Generate_set_and_activity_files__);
                        fast_fht_uniquify_keystream(fht, fast_fht_sorter);
                        noting_progress_postamble();
                    } finally {
                        $noting_progress_start_time$.rebind(_prev_bind_0, thread);
                    }
                }
                if (NIL != cleanupP) {
                    {
                        SubLObject cdolist_list_var = fstfht_ksorter_out_files(fast_fht_sorter);
                        SubLObject old_file = NIL;
                        for (old_file = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , old_file = cdolist_list_var.first()) {
                            Filesys.delete_file(old_file);
                        }
                    }
                }
                {
                    SubLObject result_files = fstfht_ksorter_in_files(fast_fht_sorter);
                    return values(result_files.first(), second(result_files));
                }
            }
        }
    }

    /**
     * Take the contents of the keystream and, using a tiled merge sort, generate
     * a representation that proceeds in terms of the expected index of the entries.
     * Generates two files, one file of entries whose index numbers are all unique,
     * and one file of values that collide with some entries in the set. The
     * contents of the two files is mutually disjoint.
     *
     * @return 0 SET-FILE a temporary file with one entry per index
     * @return 1 COLLISION-FILE a temporary file with all index collisions not in SET-FILE
     */
    @LispMethod(comment = "Take the contents of the keystream and, using a tiled merge sort, generate\r\na representation that proceeds in terms of the expected index of the entries.\r\nGenerates two files, one file of entries whose index numbers are all unique,\r\nand one file of values that collide with some entries in the set. The\r\ncontents of the two files is mutually disjoint.\r\n\r\n@return 0 SET-FILE a temporary file with one entry per index\r\n@return 1 COLLISION-FILE a temporary file with all index collisions not in SET-FILE\nTake the contents of the keystream and, using a tiled merge sort, generate\na representation that proceeds in terms of the expected index of the entries.\nGenerates two files, one file of entries whose index numbers are all unique,\nand one file of values that collide with some entries in the set. The\ncontents of the two files is mutually disjoint.")
    public static SubLObject fast_fht_sort_keystream_by_expected_index(final SubLObject fht, final SubLObject keystream, final SubLObject count, SubLObject temp_stem, SubLObject cleanupP) {
        if (temp_stem == UNPROVIDED) {
            temp_stem = file_utilities.temp_directory();
        }
        if (cleanupP == UNPROVIDED) {
            cleanupP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject total_passes = ceiling(log(count, TWO_INTEGER), UNPROVIDED);
        final SubLObject fast_fht_sorter = new_fast_fht_keystream_sorter(temp_stem);
        SubLObject tile_count = NIL;
        SubLObject str = $str447$Prepare_tiled_input_files_____;
        SubLObject _prev_bind_0 = $progress_start_time$.currentBinding(thread);
        SubLObject _prev_bind_2 = $progress_last_pacification_time$.currentBinding(thread);
        SubLObject _prev_bind_3 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
        SubLObject _prev_bind_4 = $progress_notification_count$.currentBinding(thread);
        SubLObject _prev_bind_5 = $progress_pacifications_since_last_nl$.currentBinding(thread);
        SubLObject _prev_bind_6 = $progress_count$.currentBinding(thread);
        SubLObject _prev_bind_7 = $is_noting_progressP$.currentBinding(thread);
        SubLObject _prev_bind_8 = $silent_progressP$.currentBinding(thread);
        try {
            $progress_start_time$.bind(get_universal_time(), thread);
            $progress_last_pacification_time$.bind($progress_start_time$.getDynamicValue(thread), thread);
            $progress_elapsed_seconds_for_notification$.bind($suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
            $progress_notification_count$.bind(ZERO_INTEGER, thread);
            $progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
            $progress_count$.bind(ZERO_INTEGER, thread);
            $is_noting_progressP$.bind(T, thread);
            $silent_progressP$.bind(NIL != str ? $silent_progressP$.getDynamicValue(thread) : T, thread);
            noting_progress_preamble(str);
            tile_count = fast_fht_split_keystream_into_tiled_input_files(fast_fht_sorter, keystream, fht);
            noting_progress_postamble();
        } finally {
            $silent_progressP$.rebind(_prev_bind_8, thread);
            $is_noting_progressP$.rebind(_prev_bind_7, thread);
            $progress_count$.rebind(_prev_bind_6, thread);
            $progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
            $progress_notification_count$.rebind(_prev_bind_4, thread);
            $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
            $progress_last_pacification_time$.rebind(_prev_bind_2, thread);
            $progress_start_time$.rebind(_prev_bind_0, thread);
        }
        if (tile_count.numL(THREE_INTEGER)) {
            str = $str448$Less_than_3_tiles__no_sort_needed;
            _prev_bind_0 = $progress_start_time$.currentBinding(thread);
            _prev_bind_2 = $progress_last_pacification_time$.currentBinding(thread);
            _prev_bind_3 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
            _prev_bind_4 = $progress_notification_count$.currentBinding(thread);
            _prev_bind_5 = $progress_pacifications_since_last_nl$.currentBinding(thread);
            _prev_bind_6 = $progress_count$.currentBinding(thread);
            _prev_bind_7 = $is_noting_progressP$.currentBinding(thread);
            _prev_bind_8 = $silent_progressP$.currentBinding(thread);
            try {
                $progress_start_time$.bind(get_universal_time(), thread);
                $progress_last_pacification_time$.bind($progress_start_time$.getDynamicValue(thread), thread);
                $progress_elapsed_seconds_for_notification$.bind($suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                $progress_notification_count$.bind(ZERO_INTEGER, thread);
                $progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
                $progress_count$.bind(ZERO_INTEGER, thread);
                $is_noting_progressP$.bind(T, thread);
                $silent_progressP$.bind(NIL != str ? $silent_progressP$.getDynamicValue(thread) : T, thread);
                noting_progress_preamble(str);
                final SubLObject temp_files = fstfht_ksorter_out_files(fast_fht_sorter);
                _csetf_fstfht_ksorter_out_files(fast_fht_sorter, fstfht_ksorter_in_files(fast_fht_sorter));
                _csetf_fstfht_ksorter_in_files(fast_fht_sorter, temp_files);
                noting_progress_postamble();
            } finally {
                $silent_progressP$.rebind(_prev_bind_8, thread);
                $is_noting_progressP$.rebind(_prev_bind_7, thread);
                $progress_count$.rebind(_prev_bind_6, thread);
                $progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                $progress_notification_count$.rebind(_prev_bind_4, thread);
                $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                $progress_last_pacification_time$.rebind(_prev_bind_2, thread);
                $progress_start_time$.rebind(_prev_bind_0, thread);
            }
            if (tile_count.numE(ONE_INTEGER)) {
                final SubLObject output_files = fstfht_ksorter_out_files(fast_fht_sorter);
                final SubLObject file_a = output_files.first();
                final SubLObject file_b = second(output_files);
                final SubLObject empty_file = (NIL != file_utilities.empty_file_p(file_a)) ? file_a : file_b;
                SubLObject stream = NIL;
                try {
                    final SubLObject _prev_bind_9 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                    try {
                        stream_macros.$stream_requires_locking$.bind(NIL, thread);
                        stream = compatibility.open_binary(empty_file, $OUTPUT);
                    } finally {
                        stream_macros.$stream_requires_locking$.rebind(_prev_bind_9, thread);
                    }
                    if (!stream.isStream()) {
                        Errors.error($str419$Unable_to_open__S, empty_file);
                    }
                    final SubLObject s = stream;
                    fast_fht_write_keystream_chunk_separator(s);
                } finally {
                    final SubLObject _prev_bind_10 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        if (stream.isStream()) {
                            close(stream, UNPROVIDED);
                        }
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_10, thread);
                    }
                }
            }
        } else {
            total_passes = subtract(total_passes, $fast_fht_keystream_tile_size_pow2$.getDynamicValue(thread));
            final SubLObject str2;
            final SubLObject msg = str2 = cconcatenate($str450$Merge_sorting_keystream_of_, new SubLObject[]{ format_nil.format_nil_a_no_copy(tile_count), $$$_tiles_in_, format_nil.format_nil_a_no_copy(total_passes), $str452$_passes____ });
            final SubLObject _prev_bind_11 = $progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_12 = $progress_last_pacification_time$.currentBinding(thread);
            final SubLObject _prev_bind_13 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
            final SubLObject _prev_bind_14 = $progress_notification_count$.currentBinding(thread);
            final SubLObject _prev_bind_15 = $progress_pacifications_since_last_nl$.currentBinding(thread);
            final SubLObject _prev_bind_16 = $progress_count$.currentBinding(thread);
            final SubLObject _prev_bind_17 = $is_noting_progressP$.currentBinding(thread);
            final SubLObject _prev_bind_18 = $silent_progressP$.currentBinding(thread);
            try {
                $progress_start_time$.bind(get_universal_time(), thread);
                $progress_last_pacification_time$.bind($progress_start_time$.getDynamicValue(thread), thread);
                $progress_elapsed_seconds_for_notification$.bind($suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                $progress_notification_count$.bind(ZERO_INTEGER, thread);
                $progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
                $progress_count$.bind(ZERO_INTEGER, thread);
                $is_noting_progressP$.bind(T, thread);
                $silent_progressP$.bind(NIL != str2 ? $silent_progressP$.getDynamicValue(thread) : T, thread);
                noting_progress_preamble(str2);
                total_passes = subtract(total_passes, ONE_INTEGER);
                fast_fht_almost_merge_sort_keystream(fht, fast_fht_sorter, total_passes);
                noting_progress_postamble();
            } finally {
                $silent_progressP$.rebind(_prev_bind_18, thread);
                $is_noting_progressP$.rebind(_prev_bind_17, thread);
                $progress_count$.rebind(_prev_bind_16, thread);
                $progress_pacifications_since_last_nl$.rebind(_prev_bind_15, thread);
                $progress_notification_count$.rebind(_prev_bind_14, thread);
                $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_13, thread);
                $progress_last_pacification_time$.rebind(_prev_bind_12, thread);
                $progress_start_time$.rebind(_prev_bind_11, thread);
            }
        }
        str = $str453$Generate_set_and_activity_files__;
        _prev_bind_0 = $progress_start_time$.currentBinding(thread);
        _prev_bind_2 = $progress_last_pacification_time$.currentBinding(thread);
        _prev_bind_3 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
        _prev_bind_4 = $progress_notification_count$.currentBinding(thread);
        _prev_bind_5 = $progress_pacifications_since_last_nl$.currentBinding(thread);
        _prev_bind_6 = $progress_count$.currentBinding(thread);
        _prev_bind_7 = $is_noting_progressP$.currentBinding(thread);
        _prev_bind_8 = $silent_progressP$.currentBinding(thread);
        try {
            $progress_start_time$.bind(get_universal_time(), thread);
            $progress_last_pacification_time$.bind($progress_start_time$.getDynamicValue(thread), thread);
            $progress_elapsed_seconds_for_notification$.bind($suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
            $progress_notification_count$.bind(ZERO_INTEGER, thread);
            $progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
            $progress_count$.bind(ZERO_INTEGER, thread);
            $is_noting_progressP$.bind(T, thread);
            $silent_progressP$.bind(NIL != str ? $silent_progressP$.getDynamicValue(thread) : T, thread);
            noting_progress_preamble(str);
            fast_fht_uniquify_keystream(fht, fast_fht_sorter);
            noting_progress_postamble();
        } finally {
            $silent_progressP$.rebind(_prev_bind_8, thread);
            $is_noting_progressP$.rebind(_prev_bind_7, thread);
            $progress_count$.rebind(_prev_bind_6, thread);
            $progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
            $progress_notification_count$.rebind(_prev_bind_4, thread);
            $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
            $progress_last_pacification_time$.rebind(_prev_bind_2, thread);
            $progress_start_time$.rebind(_prev_bind_0, thread);
        }
        if (NIL != cleanupP) {
            SubLObject cdolist_list_var = fstfht_ksorter_out_files(fast_fht_sorter);
            SubLObject old_file = NIL;
            old_file = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                Filesys.delete_file(old_file);
                cdolist_list_var = cdolist_list_var.rest();
                old_file = cdolist_list_var.first();
            } 
        }
        final SubLObject result_files = fstfht_ksorter_in_files(fast_fht_sorter);
        return values(result_files.first(), second(result_files));
    }

    public static final SubLObject new_fast_fht_keystream_sorter_alt(SubLObject temp_stem) {
        {
            SubLObject fast_fht_sorter = make_fast_fht_keystream_sorter(UNPROVIDED);
            _csetf_fstfht_ksorter_tempstem(fast_fht_sorter, temp_stem);
            _csetf_fstfht_ksorter_in_files(fast_fht_sorter, fast_fht_n_temp_files(TWO_INTEGER, $str_alt392$in_, temp_stem));
            _csetf_fstfht_ksorter_out_files(fast_fht_sorter, fast_fht_n_temp_files(TWO_INTEGER, $str_alt393$out_, temp_stem));
            return fast_fht_sorter;
        }
    }

    public static SubLObject new_fast_fht_keystream_sorter(final SubLObject temp_stem) {
        final SubLObject fast_fht_sorter = make_fast_fht_keystream_sorter(UNPROVIDED);
        _csetf_fstfht_ksorter_tempstem(fast_fht_sorter, temp_stem);
        _csetf_fstfht_ksorter_in_files(fast_fht_sorter, fast_fht_n_temp_files(TWO_INTEGER, $str454$in_, temp_stem));
        _csetf_fstfht_ksorter_out_files(fast_fht_sorter, fast_fht_n_temp_files(TWO_INTEGER, $str455$out_, temp_stem));
        return fast_fht_sorter;
    }

    public static final SubLObject fast_fht_n_temp_files_alt(SubLObject n, SubLObject prefix, SubLObject temp_stem) {
        {
            SubLObject files = NIL;
            SubLObject i = NIL;
            for (i = ZERO_INTEGER; i.numL(n); i = add(i, ONE_INTEGER)) {
                files = cons(make_prefixed_temp_filename(prefix, temp_stem), files);
            }
            return files;
        }
    }

    public static SubLObject fast_fht_n_temp_files(final SubLObject n, final SubLObject prefix, final SubLObject temp_stem) {
        SubLObject files = NIL;
        SubLObject i;
        for (i = NIL, i = ZERO_INTEGER; i.numL(n); i = add(i, ONE_INTEGER)) {
            files = cons(file_utilities.make_prefixed_temp_filename(prefix, temp_stem), files);
        }
        return files;
    }

    /**
     * Reads the keystream in (expt 2 *FAST-FHT-KEYSTREAM-TILE-SIZE-POW2*) chunks, sorts them
     * in memory, and writes them alternatingly to one of the input files.
     *
     * @return NON-NEGATIVE-INTEGER-P number of tiles written
     */
    @LispMethod(comment = "Reads the keystream in (expt 2 *FAST-FHT-KEYSTREAM-TILE-SIZE-POW2*) chunks, sorts them\r\nin memory, and writes them alternatingly to one of the input files.\r\n\r\n@return NON-NEGATIVE-INTEGER-P number of tiles written\nReads the keystream in (expt 2 *FAST-FHT-KEYSTREAM-TILE-SIZE-POW2*) chunks, sorts them\nin memory, and writes them alternatingly to one of the input files.")
    public static final SubLObject fast_fht_split_keystream_into_tiled_input_files_alt(SubLObject fast_fht_sorter, SubLObject keystream, SubLObject fht) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject file_queue = queues.create_queue();
                SubLObject tile_counter = ZERO_INTEGER;
                SubLObject tile = NIL;
                SubLObject doneP = NIL;
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (!file_position(keystream, UNPROVIDED).isZero()) {
                        Errors.error($str_alt394$Can_only_work_from_a_rewound_keys, keystream);
                    }
                }
                {
                    SubLObject tile_size = expt(TWO_INTEGER, $fast_fht_keystream_tile_size_pow2$.getDynamicValue(thread));
                    tile = make_vector(tile_size, NIL);
                }
                {
                    SubLObject cdolist_list_var = fstfht_ksorter_in_files(fast_fht_sorter);
                    SubLObject file_name = NIL;
                    for (file_name = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , file_name = cdolist_list_var.first()) {
                        truncate_file(file_name);
                        queues.enqueue(file_name, file_queue);
                    }
                }
                while (NIL == doneP) {
                    {
                        SubLObject cdotimes_end_var = length(tile);
                        SubLObject i = NIL;
                        for (i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
                            {
                                SubLObject old_result = aref(tile, i);
                                SubLObject new_result = fast_fht_read_one_keystream_entry(keystream, fht, old_result);
                                set_aref(tile, i, new_result);
                                doneP = eq($EOF, new_result.first());
                            }
                        }
                    }
                    Sort.sort(tile, $sym395$FAST_FHT_KEYSTREAM_ENTRY_, UNPROVIDED);
                    {
                        SubLObject file = queues.requeue(file_queue);
                        fast_fht_write_one_keystream_tile(file, tile);
                    }
                    tile_counter = add(tile_counter, ONE_INTEGER);
                } 
                return tile_counter;
            }
        }
    }

    /**
     * Reads the keystream in (expt 2 *FAST-FHT-KEYSTREAM-TILE-SIZE-POW2*) chunks, sorts them
     * in memory, and writes them alternatingly to one of the input files.
     *
     * @return NON-NEGATIVE-INTEGER-P number of tiles written
     */
    @LispMethod(comment = "Reads the keystream in (expt 2 *FAST-FHT-KEYSTREAM-TILE-SIZE-POW2*) chunks, sorts them\r\nin memory, and writes them alternatingly to one of the input files.\r\n\r\n@return NON-NEGATIVE-INTEGER-P number of tiles written\nReads the keystream in (expt 2 *FAST-FHT-KEYSTREAM-TILE-SIZE-POW2*) chunks, sorts them\nin memory, and writes them alternatingly to one of the input files.")
    public static SubLObject fast_fht_split_keystream_into_tiled_input_files(final SubLObject fast_fht_sorter, final SubLObject keystream, final SubLObject fht) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject file_queue = queues.create_queue(UNPROVIDED);
        SubLObject tile_counter = ZERO_INTEGER;
        SubLObject tile = NIL;
        SubLObject doneP = NIL;
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!file_position(keystream, UNPROVIDED).isZero())) {
            Errors.error($str456$Can_only_work_from_a_rewound_keys, keystream);
        }
        final SubLObject tile_size = expt(TWO_INTEGER, $fast_fht_keystream_tile_size_pow2$.getDynamicValue(thread));
        tile = make_vector(tile_size, NIL);
        SubLObject cdolist_list_var = fstfht_ksorter_in_files(fast_fht_sorter);
        SubLObject file_name = NIL;
        file_name = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            file_utilities.truncate_file(file_name);
            queues.enqueue(file_name, file_queue);
            cdolist_list_var = cdolist_list_var.rest();
            file_name = cdolist_list_var.first();
        } 
        while (NIL == doneP) {
            SubLObject cdotimes_end_var;
            SubLObject i;
            SubLObject old_result;
            SubLObject new_result;
            for (cdotimes_end_var = length(tile), i = NIL, i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
                old_result = aref(tile, i);
                new_result = fast_fht_read_one_keystream_entry(keystream, fht, old_result);
                set_aref(tile, i, new_result);
                doneP = eq($EOF, new_result.first());
            }
            Sort.sort(tile, $sym457$FAST_FHT_KEYSTREAM_ENTRY_, UNPROVIDED);
            final SubLObject file = queues.requeue(file_queue);
            fast_fht_write_one_keystream_tile(file, tile);
            tile_counter = add(tile_counter, ONE_INTEGER);
        } 
        return tile_counter;
    }

    public static final SubLObject fast_fht_read_one_keystream_entry_alt(SubLObject keystream, SubLObject fht, SubLObject result) {
        if (result == UNPROVIDED) {
            result = NIL;
        }
        result = fast_fht_keystream_eof_entry(result);
        {
            SubLObject hashcode = cfasl_input(keystream, NIL, $EOF);
            if (hashcode.isNumber()) {
                if ($fast_fht_sentinel_hashcode_value$.getGlobalValue().numE(hashcode)) {
                    set_nth(ZERO_INTEGER, result, $fast_fht_sentinel_index_value$.getGlobalValue());
                } else {
                    set_nth(ZERO_INTEGER, result, fht_hash(hashcode, fht));
                }
                set_nth(ONE_INTEGER, result, hashcode);
                set_nth(TWO_INTEGER, result, cfasl_input(keystream, UNPROVIDED, UNPROVIDED));
                if (NIL == aggressive_fast_fht_optimization_modeP()) {
                    set_nth(THREE_INTEGER, result, cfasl_input(keystream, UNPROVIDED, UNPROVIDED));
                }
            }
        }
        return result;
    }

    public static SubLObject fast_fht_read_one_keystream_entry(final SubLObject keystream, final SubLObject fht, SubLObject result) {
        if (result == UNPROVIDED) {
            result = NIL;
        }
        result = fast_fht_keystream_eof_entry(result);
        final SubLObject hashcode = cfasl_input(keystream, NIL, $EOF);
        if (hashcode.isNumber()) {
            if ($fast_fht_sentinel_hashcode_value$.getGlobalValue().numE(hashcode)) {
                set_nth(ZERO_INTEGER, result, $fast_fht_sentinel_index_value$.getGlobalValue());
            } else {
                set_nth(ZERO_INTEGER, result, fht_hash(hashcode, fht));
            }
            set_nth(ONE_INTEGER, result, hashcode);
            set_nth(TWO_INTEGER, result, cfasl_input(keystream, UNPROVIDED, UNPROVIDED));
            if (NIL == aggressive_fast_fht_optimization_modeP()) {
                set_nth(THREE_INTEGER, result, cfasl_input(keystream, UNPROVIDED, UNPROVIDED));
            }
        }
        return result;
    }

    public static final SubLObject fast_fht_keystream_sentinel_entry_alt(SubLObject result) {
        if (result == UNPROVIDED) {
            result = NIL;
        }
        if (!result.isCons()) {
            {
                SubLObject size = (NIL != aggressive_fast_fht_optimization_modeP()) ? ((SubLObject) (THREE_INTEGER)) : FOUR_INTEGER;
                result = make_list(size, UNPROVIDED);
            }
        }
        set_nth(ZERO_INTEGER, result, $fast_fht_sentinel_index_value$.getGlobalValue());
        set_nth(ONE_INTEGER, result, $fast_fht_sentinel_hashcode_value$.getGlobalValue());
        set_nth(TWO_INTEGER, result, $fast_fht_sentinel_hashcode_value$.getGlobalValue());
        if (NIL == aggressive_fast_fht_optimization_modeP()) {
            set_nth(THREE_INTEGER, result, $fast_fht_sentinel_hashcode_value$.getGlobalValue());
        }
        return result;
    }

    public static SubLObject fast_fht_keystream_sentinel_entry(SubLObject result) {
        if (result == UNPROVIDED) {
            result = NIL;
        }
        if (!result.isCons()) {
            final SubLObject size = (NIL != aggressive_fast_fht_optimization_modeP()) ? THREE_INTEGER : FOUR_INTEGER;
            result = make_list(size, UNPROVIDED);
        }
        set_nth(ZERO_INTEGER, result, $fast_fht_sentinel_index_value$.getGlobalValue());
        set_nth(ONE_INTEGER, result, $fast_fht_sentinel_hashcode_value$.getGlobalValue());
        set_nth(TWO_INTEGER, result, $fast_fht_sentinel_hashcode_value$.getGlobalValue());
        if (NIL == aggressive_fast_fht_optimization_modeP()) {
            set_nth(THREE_INTEGER, result, $fast_fht_sentinel_hashcode_value$.getGlobalValue());
        }
        return result;
    }

    public static final SubLObject fast_fht_keystream_eof_entry_alt(SubLObject result) {
        if (result == UNPROVIDED) {
            result = NIL;
        }
        {
            SubLObject size = (NIL != aggressive_fast_fht_optimization_modeP()) ? ((SubLObject) (THREE_INTEGER)) : FOUR_INTEGER;
            if (!result.isCons()) {
                result = make_list(size, UNPROVIDED);
            }
            {
                SubLObject i = NIL;
                for (i = ZERO_INTEGER; i.numL(size); i = add(i, ONE_INTEGER)) {
                    set_nth(i, result, $EOF);
                }
            }
        }
        return result;
    }

    public static SubLObject fast_fht_keystream_eof_entry(SubLObject result) {
        if (result == UNPROVIDED) {
            result = NIL;
        }
        final SubLObject size = (NIL != aggressive_fast_fht_optimization_modeP()) ? THREE_INTEGER : FOUR_INTEGER;
        if (!result.isCons()) {
            result = make_list(size, UNPROVIDED);
        }
        SubLObject i;
        for (i = NIL, i = ZERO_INTEGER; i.numL(size); i = add(i, ONE_INTEGER)) {
            set_nth(i, result, $EOF);
        }
        return result;
    }

    /**
     * Compare the two keystream entries. The earlier one is the
     * one with the lower index; those that hash to the same location
     * are sorted in offset order (which is unique).
     * Sentinels and :EOFs are sorted to the back, with sentinels
     * before EOFs.
     * If both A and B are sentinels or EOFS, return :eq
     *
     * @return :LT, :GT or :EQ, depending on the result
     */
    @LispMethod(comment = "Compare the two keystream entries. The earlier one is the\r\none with the lower index; those that hash to the same location\r\nare sorted in offset order (which is unique).\r\nSentinels and :EOFs are sorted to the back, with sentinels\r\nbefore EOFs.\r\nIf both A and B are sentinels or EOFS, return :eq\r\n\r\n@return :LT, :GT or :EQ, depending on the result\nCompare the two keystream entries. The earlier one is the\none with the lower index; those that hash to the same location\nare sorted in offset order (which is unique).\nSentinels and :EOFs are sorted to the back, with sentinels\nbefore EOFs.\nIf both A and B are sentinels or EOFS, return :eq")
    public static final SubLObject fast_fht_keystream_entry_cmp_alt(SubLObject entry_a, SubLObject entry_b) {
        {
            SubLObject index_a = entry_a.first();
            SubLObject index_b = entry_b.first();
            if (index_a == $EOF) {
                return index_b == $EOF ? ((SubLObject) ($EQ)) : $GT;
            }
            if (index_b == $EOF) {
                return $LT;
            }
            if (index_a.numL(index_b)) {
                return $LT;
            }
            if (index_b.numL(index_a)) {
                return $GT;
            }
            {
                SubLObject offset_a = nth(TWO_INTEGER, entry_a);
                SubLObject offset_b = nth(TWO_INTEGER, entry_b);
                if (offset_a.numL(offset_b)) {
                    return $LT;
                } else {
                    if (offset_b.numL(offset_a)) {
                        return $GT;
                    } else {
                        return $EQ;
                    }
                }
            }
        }
    }

    /**
     * Compare the two keystream entries. The earlier one is the
     * one with the lower index; those that hash to the same location
     * are sorted in offset order (which is unique).
     * Sentinels and :EOFs are sorted to the back, with sentinels
     * before EOFs.
     * If both A and B are sentinels or EOFS, return :eq
     *
     * @return :LT, :GT or :EQ, depending on the result
     */
    @LispMethod(comment = "Compare the two keystream entries. The earlier one is the\r\none with the lower index; those that hash to the same location\r\nare sorted in offset order (which is unique).\r\nSentinels and :EOFs are sorted to the back, with sentinels\r\nbefore EOFs.\r\nIf both A and B are sentinels or EOFS, return :eq\r\n\r\n@return :LT, :GT or :EQ, depending on the result\nCompare the two keystream entries. The earlier one is the\none with the lower index; those that hash to the same location\nare sorted in offset order (which is unique).\nSentinels and :EOFs are sorted to the back, with sentinels\nbefore EOFs.\nIf both A and B are sentinels or EOFS, return :eq")
    public static SubLObject fast_fht_keystream_entry_cmp(final SubLObject entry_a, final SubLObject entry_b) {
        final SubLObject index_a = entry_a.first();
        final SubLObject index_b = entry_b.first();
        if (index_a == $EOF) {
            return index_b == $EOF ? $EQ : $GT;
        }
        if (index_b == $EOF) {
            return $LT;
        }
        if (index_a.numL(index_b)) {
            return $LT;
        }
        if (index_b.numL(index_a)) {
            return $GT;
        }
        final SubLObject offset_a = nth(TWO_INTEGER, entry_a);
        final SubLObject offset_b = nth(TWO_INTEGER, entry_b);
        if (offset_a.numL(offset_b)) {
            return $LT;
        }
        if (offset_b.numL(offset_a)) {
            return $GT;
        }
        return $EQ;
    }

    /**
     * Must be less than in the sense of
     *
     * @unknown fast-fht-keystream-cmp
     */
    @LispMethod(comment = "Must be less than in the sense of\r\n\r\n@unknown fast-fht-keystream-cmp")
    public static final SubLObject fast_fht_keystream_entryL_alt(SubLObject entry_a, SubLObject entry_b) {
        return eq($LT, fast_fht_keystream_entry_cmp(entry_a, entry_b));
    }

    /**
     * Must be less than in the sense of
     *
     * @unknown fast-fht-keystream-cmp
     */
    @LispMethod(comment = "Must be less than in the sense of\r\n\r\n@unknown fast-fht-keystream-cmp")
    public static SubLObject fast_fht_keystream_entryL(final SubLObject entry_a, final SubLObject entry_b) {
        return eq($LT, fast_fht_keystream_entry_cmp(entry_a, entry_b));
    }

    public static final SubLObject fast_fht_write_one_keystream_tile_alt(SubLObject file, SubLObject tile) {
        {
            SubLObject stream = compatibility.open_binary(file, $APPEND, UNPROVIDED);
            SubLObject doneP = NIL;
            SubLObject vector_var = tile;
            SubLObject backwardP_var = NIL;
            SubLObject length = length(vector_var);
            SubLObject datum = (NIL != backwardP_var) ? ((SubLObject) (list(subtract(length, ONE_INTEGER), MINUS_ONE_INTEGER, MINUS_ONE_INTEGER))) : list(ZERO_INTEGER, length, ONE_INTEGER);
            SubLObject current = datum;
            SubLObject start = NIL;
            SubLObject end = NIL;
            SubLObject delta = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt400);
            start = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt400);
            end = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt400);
            delta = current.first();
            current = current.rest();
            if (NIL == current) {
                if (NIL == doneP) {
                    {
                        SubLObject end_var = end;
                        SubLObject element_num = NIL;
                        for (element_num = start; !((NIL != doneP) || (NIL != subl_macros.do_numbers_endtest(element_num, delta, end_var))); element_num = add(element_num, delta)) {
                            {
                                SubLObject entry = aref(vector_var, element_num);
                                if (NIL != is_fast_fht_keystream_eofP(entry)) {
                                    doneP = T;
                                } else {
                                    fast_fht_write_one_keystream_entry(stream, entry);
                                }
                            }
                        }
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt400);
            }
            fast_fht_write_keystream_chunk_separator(stream);
            close(stream, UNPROVIDED);
        }
        return file;
    }

    public static SubLObject fast_fht_write_one_keystream_tile(final SubLObject file, final SubLObject tile) {
        final SubLObject stream = compatibility.open_binary(file, $APPEND);
        SubLObject doneP = NIL;
        final SubLObject backwardP_var = NIL;
        final SubLObject length = length(tile);
        SubLObject current;
        final SubLObject datum = current = (NIL != backwardP_var) ? list(subtract(length, ONE_INTEGER), MINUS_ONE_INTEGER, MINUS_ONE_INTEGER) : list(ZERO_INTEGER, length, ONE_INTEGER);
        SubLObject start = NIL;
        SubLObject end = NIL;
        SubLObject delta = NIL;
        destructuring_bind_must_consp(current, datum, $list462);
        start = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list462);
        end = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list462);
        delta = current.first();
        current = current.rest();
        if (NIL == current) {
            if (NIL == doneP) {
                SubLObject end_var;
                SubLObject element_num;
                SubLObject entry;
                for (end_var = end, element_num = NIL, element_num = start; (NIL == doneP) && (NIL == subl_macros.do_numbers_endtest(element_num, delta, end_var)); element_num = add(element_num, delta)) {
                    entry = aref(tile, element_num);
                    if (NIL != is_fast_fht_keystream_eofP(entry)) {
                        doneP = T;
                    } else {
                        fast_fht_write_one_keystream_entry(stream, entry);
                    }
                }
            }
        } else {
            cdestructuring_bind_error(datum, $list462);
        }
        fast_fht_write_keystream_chunk_separator(stream);
        close(stream, UNPROVIDED);
        return file;
    }

    public static final SubLObject is_fast_fht_keystream_chunk_separator_entryP_alt(SubLObject entry) {
        {
            SubLObject index = entry.first();
            return makeBoolean(index.isNumber() && $fast_fht_sentinel_index_value$.getGlobalValue().numE(index));
        }
    }

    public static SubLObject is_fast_fht_keystream_chunk_separator_entryP(final SubLObject entry) {
        final SubLObject index = entry.first();
        return makeBoolean(index.isNumber() && $fast_fht_sentinel_index_value$.getGlobalValue().numE(index));
    }

    public static final SubLObject is_fast_fht_keystream_eofP_alt(SubLObject entry) {
        return eq($EOF, entry.first());
    }

    public static SubLObject is_fast_fht_keystream_eofP(final SubLObject entry) {
        return eq($EOF, entry.first());
    }

    public static final SubLObject fast_fht_write_keystream_chunk_separator_alt(SubLObject stream) {
        {
            SubLObject sentinel = $fast_fht_sentinel_hashcode_value$.getGlobalValue();
            fast_fht_write_keystream_entry(stream, sentinel, sentinel, sentinel);
        }
        return stream;
    }

    public static SubLObject fast_fht_write_keystream_chunk_separator(final SubLObject stream) {
        final SubLObject sentinel = $fast_fht_sentinel_hashcode_value$.getGlobalValue();
        fast_fht_write_keystream_entry(stream, sentinel, sentinel, sentinel);
        return stream;
    }

    public static final SubLObject fast_fht_write_keystream_entry_alt(SubLObject stream, SubLObject hashcode, SubLObject offset, SubLObject key) {
        if (key == UNPROVIDED) {
            key = NIL;
        }
        cfasl_output(hashcode, stream);
        cfasl_output(offset, stream);
        if (NIL == aggressive_fast_fht_optimization_modeP()) {
            cfasl_output(key, stream);
        }
        return stream;
    }

    public static SubLObject fast_fht_write_keystream_entry(final SubLObject stream, final SubLObject hashcode, final SubLObject offset, SubLObject key) {
        if (key == UNPROVIDED) {
            key = NIL;
        }
        cfasl_output(hashcode, stream);
        cfasl_output(offset, stream);
        if (NIL == aggressive_fast_fht_optimization_modeP()) {
            cfasl_output(key, stream);
        }
        return stream;
    }

    /**
     * Writes an entry of the type manipulated by the merging code.
     * Throws away the leading index.
     */
    @LispMethod(comment = "Writes an entry of the type manipulated by the merging code.\r\nThrows away the leading index.\nWrites an entry of the type manipulated by the merging code.\nThrows away the leading index.")
    public static final SubLObject fast_fht_write_one_keystream_entry_alt(SubLObject stream, SubLObject entry) {
        return fast_fht_write_keystream_entry(stream, nth(ONE_INTEGER, entry), nth(TWO_INTEGER, entry), NIL != aggressive_fast_fht_optimization_modeP() ? ((SubLObject) (NIL)) : nth(THREE_INTEGER, entry));
    }

    /**
     * Writes an entry of the type manipulated by the merging code.
     * Throws away the leading index.
     */
    @LispMethod(comment = "Writes an entry of the type manipulated by the merging code.\r\nThrows away the leading index.\nWrites an entry of the type manipulated by the merging code.\nThrows away the leading index.")
    public static SubLObject fast_fht_write_one_keystream_entry(final SubLObject stream, final SubLObject entry) {
        return fast_fht_write_keystream_entry(stream, nth(ONE_INTEGER, entry), nth(TWO_INTEGER, entry), NIL != aggressive_fast_fht_optimization_modeP() ? NIL : nth(THREE_INTEGER, entry));
    }

    /**
     * Writes an entry of the type manipulated by the merging code.
     * Throws away the leading index. Identical to FAST-FHT-WRITE-ONE-KEYSTREAM-ENTRY
     * except in the case of the :AGGRESSIVE mode, where the stream contains no
     * key object, which must be fetched from the FHT.
     */
    @LispMethod(comment = "Writes an entry of the type manipulated by the merging code.\r\nThrows away the leading index. Identical to FAST-FHT-WRITE-ONE-KEYSTREAM-ENTRY\r\nexcept in the case of the :AGGRESSIVE mode, where the stream contains no\r\nkey object, which must be fetched from the FHT.\nWrites an entry of the type manipulated by the merging code.\nThrows away the leading index. Identical to FAST-FHT-WRITE-ONE-KEYSTREAM-ENTRY\nexcept in the case of the :AGGRESSIVE mode, where the stream contains no\nkey object, which must be fetched from the FHT.")
    public static final SubLObject fast_fht_write_one_collision_stream_entry_alt(SubLObject fht, SubLObject coll_stream, SubLObject entry) {
        if (NIL != aggressive_fast_fht_optimization_modeP()) {
            {
                SubLObject address = nth(TWO_INTEGER, entry);
                SubLObject object_entry = make_htfile_object_entry(UNPROVIDED);
                read_object_entry_from_space(fht, object_entry, address, $KEY_ONLY);
                cfasl_output(nth(ONE_INTEGER, entry), coll_stream);
                cfasl_output(nth(TWO_INTEGER, entry), coll_stream);
                cfasl_output(htfile_object_entry_key(object_entry), coll_stream);
            }
        } else {
            fast_fht_write_one_keystream_entry(coll_stream, entry);
        }
        return fht;
    }

    /**
     * Writes an entry of the type manipulated by the merging code.
     * Throws away the leading index. Identical to FAST-FHT-WRITE-ONE-KEYSTREAM-ENTRY
     * except in the case of the :AGGRESSIVE mode, where the stream contains no
     * key object, which must be fetched from the FHT.
     */
    @LispMethod(comment = "Writes an entry of the type manipulated by the merging code.\r\nThrows away the leading index. Identical to FAST-FHT-WRITE-ONE-KEYSTREAM-ENTRY\r\nexcept in the case of the :AGGRESSIVE mode, where the stream contains no\r\nkey object, which must be fetched from the FHT.\nWrites an entry of the type manipulated by the merging code.\nThrows away the leading index. Identical to FAST-FHT-WRITE-ONE-KEYSTREAM-ENTRY\nexcept in the case of the :AGGRESSIVE mode, where the stream contains no\nkey object, which must be fetched from the FHT.")
    public static SubLObject fast_fht_write_one_collision_stream_entry(final SubLObject fht, final SubLObject coll_stream, final SubLObject entry) {
        if (NIL != aggressive_fast_fht_optimization_modeP()) {
            final SubLObject address = nth(TWO_INTEGER, entry);
            final SubLObject object_entry = make_htfile_object_entry(UNPROVIDED);
            read_object_entry_from_space(fht, object_entry, address, $KEY_ONLY);
            cfasl_output(nth(ONE_INTEGER, entry), coll_stream);
            cfasl_output(nth(TWO_INTEGER, entry), coll_stream);
            cfasl_output(htfile_object_entry_key(object_entry), coll_stream);
        } else {
            fast_fht_write_one_keystream_entry(coll_stream, entry);
        }
        return fht;
    }

    /**
     * Given a set of input files prepared by
     *
     * @unknown FAST-FHT-SPLIT-KEYSTREAM-INTO-TILED-INPUT-FILES, merge
    them until there are only one chunk per output file left over,
    since the final step looks different for our purposes
     * @return LISTP of STRINGP the current output files list
     */
    @LispMethod(comment = "Given a set of input files prepared by\r\n\r\n@unknown FAST-FHT-SPLIT-KEYSTREAM-INTO-TILED-INPUT-FILES, merge\r\nthem until there are only one chunk per output file left over,\r\nsince the final step looks different for our purposes\r\n@return LISTP of STRINGP the current output files list")
    public static final SubLObject fast_fht_almost_merge_sort_keystream_alt(SubLObject fht, SubLObject fast_fht_sorter, SubLObject passes) {
        if (passes == UNPROVIDED) {
            passes = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject input_files = fstfht_ksorter_in_files(fast_fht_sorter);
                SubLObject output_files = fstfht_ksorter_out_files(fast_fht_sorter);
                SubLObject last_chunk_count = $most_positive_fixnum$.getGlobalValue();
                SubLObject passes_msg = (passes.isNumber()) ? ((SubLObject) (cconcatenate($str_alt401$_of_, format_nil.format_nil_a_no_copy(passes)))) : $str_alt270$;
                SubLObject pass = ZERO_INTEGER;
                SubLObject doneP = NIL;
                while (NIL == doneP) {
                    pass = add(pass, ONE_INTEGER);
                    {
                        SubLObject activity_msg = cconcatenate($str_alt402$Merge_Pass_, new SubLObject[]{ format_nil.format_nil_a_no_copy(pass), format_nil.format_nil_a_no_copy(passes_msg) });
                        SubLObject chunk_count = NIL;
                        {
                            SubLObject _prev_bind_0 = $noting_progress_start_time$.currentBinding(thread);
                            try {
                                $noting_progress_start_time$.bind(get_universal_time(), thread);
                                noting_progress_preamble(activity_msg);
                                chunk_count = fast_fht_merge_keystream_input_files(fht, input_files, output_files);
                                noting_progress_postamble();
                            } finally {
                                $noting_progress_start_time$.rebind(_prev_bind_0, thread);
                            }
                        }
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!chunk_count.numL(last_chunk_count)) {
                                Errors.error($str_alt403$The_chunk_count_should_have_decli, chunk_count, last_chunk_count);
                            }
                        }
                        if (TWO_INTEGER.numE(chunk_count)) {
                            doneP = T;
                        } else {
                            {
                                SubLObject tmp_swap_var = input_files;
                                input_files = output_files;
                                output_files = tmp_swap_var;
                            }
                        }
                    }
                } 
                _csetf_fstfht_ksorter_in_files(fast_fht_sorter, input_files);
                _csetf_fstfht_ksorter_out_files(fast_fht_sorter, output_files);
                return output_files;
            }
        }
    }

    /**
     * Given a set of input files prepared by
     *
     * @unknown FAST-FHT-SPLIT-KEYSTREAM-INTO-TILED-INPUT-FILES, merge
    them until there are only one chunk per output file left over,
    since the final step looks different for our purposes
     * @return LISTP of STRINGP the current output files list
     */
    @LispMethod(comment = "Given a set of input files prepared by\r\n\r\n@unknown FAST-FHT-SPLIT-KEYSTREAM-INTO-TILED-INPUT-FILES, merge\r\nthem until there are only one chunk per output file left over,\r\nsince the final step looks different for our purposes\r\n@return LISTP of STRINGP the current output files list")
    public static SubLObject fast_fht_almost_merge_sort_keystream(final SubLObject fht, final SubLObject fast_fht_sorter, SubLObject passes) {
        if (passes == UNPROVIDED) {
            passes = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject input_files = fstfht_ksorter_in_files(fast_fht_sorter);
        SubLObject output_files = fstfht_ksorter_out_files(fast_fht_sorter);
        final SubLObject last_chunk_count = $most_positive_fixnum$.getGlobalValue();
        final SubLObject passes_msg = (passes.isNumber()) ? cconcatenate($$$_of_, format_nil.format_nil_a_no_copy(passes)) : $str309$;
        SubLObject pass = ZERO_INTEGER;
        SubLObject doneP = NIL;
        while (NIL == doneP) {
            pass = add(pass, ONE_INTEGER);
            final SubLObject activity_msg = cconcatenate($$$Merge_Pass_, new SubLObject[]{ format_nil.format_nil_a_no_copy(pass), format_nil.format_nil_a_no_copy(passes_msg) });
            SubLObject chunk_count = NIL;
            final SubLObject str = activity_msg;
            final SubLObject _prev_bind_0 = $progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $progress_last_pacification_time$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $progress_notification_count$.currentBinding(thread);
            final SubLObject _prev_bind_5 = $progress_pacifications_since_last_nl$.currentBinding(thread);
            final SubLObject _prev_bind_6 = $progress_count$.currentBinding(thread);
            final SubLObject _prev_bind_7 = $is_noting_progressP$.currentBinding(thread);
            final SubLObject _prev_bind_8 = $silent_progressP$.currentBinding(thread);
            try {
                $progress_start_time$.bind(get_universal_time(), thread);
                $progress_last_pacification_time$.bind($progress_start_time$.getDynamicValue(thread), thread);
                $progress_elapsed_seconds_for_notification$.bind($suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                $progress_notification_count$.bind(ZERO_INTEGER, thread);
                $progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
                $progress_count$.bind(ZERO_INTEGER, thread);
                $is_noting_progressP$.bind(T, thread);
                $silent_progressP$.bind(NIL != str ? $silent_progressP$.getDynamicValue(thread) : T, thread);
                noting_progress_preamble(str);
                chunk_count = fast_fht_merge_keystream_input_files(fht, input_files, output_files);
                noting_progress_postamble();
            } finally {
                $silent_progressP$.rebind(_prev_bind_8, thread);
                $is_noting_progressP$.rebind(_prev_bind_7, thread);
                $progress_count$.rebind(_prev_bind_6, thread);
                $progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                $progress_notification_count$.rebind(_prev_bind_4, thread);
                $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                $progress_last_pacification_time$.rebind(_prev_bind_2, thread);
                $progress_start_time$.rebind(_prev_bind_0, thread);
            }
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!chunk_count.numL(last_chunk_count))) {
                Errors.error($str465$The_chunk_count_should_have_decli, chunk_count, last_chunk_count);
            }
            if (TWO_INTEGER.numE(chunk_count)) {
                doneP = T;
            } else {
                final SubLObject tmp_swap_var = input_files;
                input_files = output_files;
                output_files = tmp_swap_var;
            }
        } 
        _csetf_fstfht_ksorter_in_files(fast_fht_sorter, input_files);
        _csetf_fstfht_ksorter_out_files(fast_fht_sorter, output_files);
        return output_files;
    }

    /**
     * Merge two files into two output files; this effectively reduces the number
     * of chunks (sentinel delineated sections) in the output by half.
     *
     * @return NON-NEGATIVE-INTEGER-P the number of chunks
     */
    @LispMethod(comment = "Merge two files into two output files; this effectively reduces the number\r\nof chunks (sentinel delineated sections) in the output by half.\r\n\r\n@return NON-NEGATIVE-INTEGER-P the number of chunks\nMerge two files into two output files; this effectively reduces the number\nof chunks (sentinel delineated sections) in the output by half.")
    public static final SubLObject fast_fht_merge_keystream_input_files_alt(SubLObject fht, SubLObject input_files, SubLObject output_files) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject outfile_queue = queues.create_queue();
                SubLObject chunks = ZERO_INTEGER;
                SubLObject doneP = NIL;
                SubLObject cdolist_list_var = output_files;
                SubLObject file = NIL;
                for (file = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , file = cdolist_list_var.first()) {
                    truncate_file(file);
                    queues.enqueue(file, outfile_queue);
                }
                {
                    SubLObject file_a = input_files.first();
                    SubLObject file_b = second(input_files);
                    SubLObject stream = NIL;
                    try {
                        {
                            SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                            try {
                                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                                stream = compatibility.open_binary(file_a, $INPUT, NIL);
                            } finally {
                                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                            }
                        }
                        if (!stream.isStream()) {
                            Errors.error($str_alt360$Unable_to_open__S, file_a);
                        }
                        {
                            SubLObject in_stream_a = stream;
                            SubLObject stream_11 = NIL;
                            try {
                                {
                                    SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                                    try {
                                        stream_macros.$stream_requires_locking$.bind(NIL, thread);
                                        stream_11 = compatibility.open_binary(file_b, $INPUT, NIL);
                                    } finally {
                                        stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                                    }
                                }
                                if (!stream_11.isStream()) {
                                    Errors.error($str_alt360$Unable_to_open__S, file_b);
                                }
                                {
                                    SubLObject in_stream_b = stream_11;
                                    while (NIL == doneP) {
                                        {
                                            SubLObject curr_outfile = queues.requeue(outfile_queue);
                                            SubLObject out_stream = NIL;
                                            try {
                                                out_stream = compatibility.open_binary(curr_outfile, $APPEND, UNPROVIDED);
                                                {
                                                    SubLObject status = fast_fht_merge_keystream_chunks(fht, in_stream_a, in_stream_b, out_stream);
                                                    if ($EOF == status) {
                                                        doneP = T;
                                                    } else {
                                                        chunks = add(chunks, ONE_INTEGER);
                                                    }
                                                }
                                            } finally {
                                                {
                                                    SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                    try {
                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                        close(out_stream, UNPROVIDED);
                                                    } finally {
                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                                    }
                                                }
                                            }
                                        }
                                    } 
                                }
                            } finally {
                                {
                                    SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        if (stream_11.isStream()) {
                                            close(stream_11, UNPROVIDED);
                                        }
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                    }
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
                return chunks;
            }
        }
    }

    /**
     * Merge two files into two output files; this effectively reduces the number
     * of chunks (sentinel delineated sections) in the output by half.
     *
     * @return NON-NEGATIVE-INTEGER-P the number of chunks
     */
    @LispMethod(comment = "Merge two files into two output files; this effectively reduces the number\r\nof chunks (sentinel delineated sections) in the output by half.\r\n\r\n@return NON-NEGATIVE-INTEGER-P the number of chunks\nMerge two files into two output files; this effectively reduces the number\nof chunks (sentinel delineated sections) in the output by half.")
    public static SubLObject fast_fht_merge_keystream_input_files(final SubLObject fht, final SubLObject input_files, final SubLObject output_files) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject outfile_queue = queues.create_queue(UNPROVIDED);
        SubLObject chunks = ZERO_INTEGER;
        SubLObject doneP = NIL;
        SubLObject cdolist_list_var = output_files;
        SubLObject file = NIL;
        file = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            file_utilities.truncate_file(file);
            queues.enqueue(file, outfile_queue);
            cdolist_list_var = cdolist_list_var.rest();
            file = cdolist_list_var.first();
        } 
        final SubLObject file_a = input_files.first();
        final SubLObject file_b = second(input_files);
        SubLObject stream = NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_binary(file_a, $INPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str419$Unable_to_open__S, file_a);
            }
            final SubLObject in_stream_a = stream;
            SubLObject stream_$22 = NIL;
            try {
                final SubLObject _prev_bind_2 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind(NIL, thread);
                    stream_$22 = compatibility.open_binary(file_b, $INPUT);
                } finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_2, thread);
                }
                if (!stream_$22.isStream()) {
                    Errors.error($str419$Unable_to_open__S, file_b);
                }
                final SubLObject in_stream_b = stream_$22;
                while (NIL == doneP) {
                    final SubLObject curr_outfile = queues.requeue(outfile_queue);
                    SubLObject out_stream = NIL;
                    try {
                        out_stream = compatibility.open_binary(curr_outfile, $APPEND);
                        final SubLObject status = fast_fht_merge_keystream_chunks(fht, in_stream_a, in_stream_b, out_stream);
                        if ($EOF == status) {
                            doneP = T;
                        } else {
                            chunks = add(chunks, ONE_INTEGER);
                        }
                    } finally {
                        final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            close(out_stream, UNPROVIDED);
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                        }
                    }
                } 
            } finally {
                final SubLObject _prev_bind_4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    if (stream_$22.isStream()) {
                        close(stream_$22, UNPROVIDED);
                    }
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
                }
            }
        } finally {
            final SubLObject _prev_bind_5 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values3 = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values3);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_5, thread);
            }
        }
        return chunks;
    }

    /**
     * Merge the entries from A and B to out-stream, thereby generating a sorted
     * chunk that is as big as A and B combined.
     *
     * @return :EOF if both stream A and stream B are at EOF, :MORE otherwise
     */
    @LispMethod(comment = "Merge the entries from A and B to out-stream, thereby generating a sorted\r\nchunk that is as big as A and B combined.\r\n\r\n@return :EOF if both stream A and stream B are at EOF, :MORE otherwise\nMerge the entries from A and B to out-stream, thereby generating a sorted\nchunk that is as big as A and B combined.")
    public static final SubLObject fast_fht_merge_keystream_chunks_alt(SubLObject fht, SubLObject in_stream_a, SubLObject in_stream_b, SubLObject out_stream) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject entry_a = NIL;
                SubLObject entry_b = NIL;
                entry_a = fast_fht_read_one_keystream_entry(in_stream_a, fht, entry_a);
                entry_b = fast_fht_read_one_keystream_entry(in_stream_b, fht, entry_b);
                if ((NIL != is_fast_fht_keystream_eofP(entry_a)) && (NIL != is_fast_fht_keystream_eofP(entry_b))) {
                    return $EOF;
                }
                if (NIL != is_fast_fht_keystream_eofP(entry_a)) {
                    fast_fht_keystream_sentinel_entry(entry_a);
                }
                if (NIL != is_fast_fht_keystream_eofP(entry_b)) {
                    fast_fht_keystream_sentinel_entry(entry_b);
                }
                {
                    SubLObject doneP = NIL;
                    while (NIL == doneP) {
                        {
                            SubLObject comparison = fast_fht_keystream_entry_cmp(entry_a, entry_b);
                            SubLObject pcase_var = comparison;
                            if (pcase_var.eql($LT)) {
                                fast_fht_write_one_keystream_entry(out_stream, entry_a);
                                entry_a = fast_fht_read_one_keystream_entry(in_stream_a, fht, entry_a);
                            } else {
                                if (pcase_var.eql($GT)) {
                                    fast_fht_write_one_keystream_entry(out_stream, entry_b);
                                    entry_b = fast_fht_read_one_keystream_entry(in_stream_b, fht, entry_b);
                                } else {
                                    if (pcase_var.eql($EQ)) {
                                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                            if (!((NIL != is_fast_fht_keystream_chunk_separator_entryP(entry_a)) && (NIL != is_fast_fht_keystream_chunk_separator_entryP(entry_b)))) {
                                                Errors.error($str_alt404$Only_sentinels_or__EOF_can_be_equ, entry_a, entry_b);
                                            }
                                        }
                                        doneP = T;
                                    }
                                }
                            }
                        }
                    } 
                }
                fast_fht_write_keystream_chunk_separator(out_stream);
            }
            return $MORE;
        }
    }

    /**
     * Merge the entries from A and B to out-stream, thereby generating a sorted
     * chunk that is as big as A and B combined.
     *
     * @return :EOF if both stream A and stream B are at EOF, :MORE otherwise
     */
    @LispMethod(comment = "Merge the entries from A and B to out-stream, thereby generating a sorted\r\nchunk that is as big as A and B combined.\r\n\r\n@return :EOF if both stream A and stream B are at EOF, :MORE otherwise\nMerge the entries from A and B to out-stream, thereby generating a sorted\nchunk that is as big as A and B combined.")
    public static SubLObject fast_fht_merge_keystream_chunks(final SubLObject fht, final SubLObject in_stream_a, final SubLObject in_stream_b, final SubLObject out_stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject entry_a = NIL;
        SubLObject entry_b = NIL;
        entry_a = fast_fht_read_one_keystream_entry(in_stream_a, fht, entry_a);
        entry_b = fast_fht_read_one_keystream_entry(in_stream_b, fht, entry_b);
        if ((NIL != is_fast_fht_keystream_eofP(entry_a)) && (NIL != is_fast_fht_keystream_eofP(entry_b))) {
            return $EOF;
        }
        if (NIL != is_fast_fht_keystream_eofP(entry_a)) {
            fast_fht_keystream_sentinel_entry(entry_a);
        }
        if (NIL != is_fast_fht_keystream_eofP(entry_b)) {
            fast_fht_keystream_sentinel_entry(entry_b);
        }
        SubLObject doneP = NIL;
        while (NIL == doneP) {
            final SubLObject pcase_var;
            final SubLObject comparison = pcase_var = fast_fht_keystream_entry_cmp(entry_a, entry_b);
            if (pcase_var.eql($LT)) {
                fast_fht_write_one_keystream_entry(out_stream, entry_a);
                entry_a = fast_fht_read_one_keystream_entry(in_stream_a, fht, entry_a);
            } else
                if (pcase_var.eql($GT)) {
                    fast_fht_write_one_keystream_entry(out_stream, entry_b);
                    entry_b = fast_fht_read_one_keystream_entry(in_stream_b, fht, entry_b);
                } else {
                    if (!pcase_var.eql($EQ)) {
                        continue;
                    }
                    if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ((NIL == is_fast_fht_keystream_chunk_separator_entryP(entry_a)) || (NIL == is_fast_fht_keystream_chunk_separator_entryP(entry_b)))) {
                        Errors.error($str466$Only_sentinels_or__EOF_can_be_equ, entry_a, entry_b);
                    }
                    doneP = T;
                }

        } 
        fast_fht_write_keystream_chunk_separator(out_stream);
        return $MORE;
    }

    /**
     * This macro ensures that runs of index from the same stream make it properly
     * into the loser/collision pool.
     */
    @LispMethod(comment = "This macro ensures that runs of index from the same stream make it properly\r\ninto the loser/collision pool.\nThis macro ensures that runs of index from the same stream make it properly\ninto the loser/collision pool.")
    public static final SubLObject fast_fht_drain_index_run_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject fht = NIL;
            SubLObject index = NIL;
            SubLObject entry = NIL;
            SubLObject in_stream = NIL;
            SubLObject loser_items = NIL;
            SubLObject collision_stream = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt406);
            fht = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt406);
            index = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt406);
            entry = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt406);
            in_stream = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt406);
            loser_items = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt406);
            collision_stream = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(WHILE, list($sym407$_, index, list(FAST_FHT_GET_COMPARABLE_INDEX_FROM_ENTRY, entry)), list(FAST_FHT_WRITE_ONE_COLLISION_STREAM_ENTRY, fht, collision_stream, entry), list(CSETQ, entry, list(FAST_FHT_READ_ONE_KEYSTREAM_ENTRY, in_stream, fht, entry)), list(CINC, loser_items));
            } else {
                cdestructuring_bind_error(datum, $list_alt406);
            }
        }
        return NIL;
    }

    /**
     * This macro ensures that runs of index from the same stream make it properly
     * into the loser/collision pool.
     */
    @LispMethod(comment = "This macro ensures that runs of index from the same stream make it properly\r\ninto the loser/collision pool.\nThis macro ensures that runs of index from the same stream make it properly\ninto the loser/collision pool.")
    public static SubLObject fast_fht_drain_index_run(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject fht = NIL;
        SubLObject index = NIL;
        SubLObject entry = NIL;
        SubLObject in_stream = NIL;
        SubLObject loser_items = NIL;
        SubLObject collision_stream = NIL;
        destructuring_bind_must_consp(current, datum, $list468);
        fht = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list468);
        index = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list468);
        entry = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list468);
        in_stream = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list468);
        loser_items = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list468);
        collision_stream = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(WHILE, list($sym469$_, index, list(FAST_FHT_GET_COMPARABLE_INDEX_FROM_ENTRY, entry)), list(FAST_FHT_WRITE_ONE_COLLISION_STREAM_ENTRY, fht, collision_stream, entry), list(CSETQ, entry, list(FAST_FHT_READ_ONE_KEYSTREAM_ENTRY, in_stream, fht, entry)), list(CINC, loser_items));
        }
        cdestructuring_bind_error(datum, $list468);
        return NIL;
    }

    /**
     * This macro handles the shuffling in the case of index collision. We detect index
     * collision on the comparison of the two smalles entries that hash to the same index
     * position. We keep the smallest in the keeper set, then put all the remaining
     * into the collision set. Because the collision set requires extra work anyway, the
     * collision set is not sorted within identical indices.
     */
    @LispMethod(comment = "This macro handles the shuffling in the case of index collision. We detect index\r\ncollision on the comparison of the two smalles entries that hash to the same index\r\nposition. We keep the smallest in the keeper set, then put all the remaining\r\ninto the collision set. Because the collision set requires extra work anyway, the\r\ncollision set is not sorted within identical indices.\nThis macro handles the shuffling in the case of index collision. We detect index\ncollision on the comparison of the two smalles entries that hash to the same index\nposition. We keep the smallest in the keeper set, then put all the remaining\ninto the collision set. Because the collision set requires extra work anyway, the\ncollision set is not sorted within identical indices.")
    public static final SubLObject fast_fht_manage_index_collisions_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject fht = NIL;
            SubLObject keeper_entry = NIL;
            SubLObject loser_entry = NIL;
            SubLObject keeper_stream = NIL;
            SubLObject loser_stream = NIL;
            SubLObject keeper_items = NIL;
            SubLObject loser_items = NIL;
            SubLObject set_stream = NIL;
            SubLObject collision_stream = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt412);
            fht = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt412);
            keeper_entry = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt412);
            loser_entry = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt412);
            keeper_stream = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt412);
            loser_stream = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt412);
            keeper_items = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt412);
            loser_items = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt412);
            set_stream = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt412);
            collision_stream = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject index_keeper = $sym413$INDEX_KEEPER;
                    SubLObject index_loser = $sym414$INDEX_LOSER;
                    return list(CLET, list(list(index_keeper, list(FAST_FHT_GET_COMPARABLE_INDEX_FROM_ENTRY, keeper_entry)), list(index_loser, list(FAST_FHT_GET_COMPARABLE_INDEX_FROM_ENTRY, loser_entry))), list(FAST_FHT_WRITE_ONE_KEYSTREAM_ENTRY, set_stream, keeper_entry), list(CINC, keeper_items), list(CSETQ, keeper_entry, list(FAST_FHT_READ_ONE_KEYSTREAM_ENTRY, keeper_stream, fht, keeper_entry)), list(FAST_FHT_DRAIN_INDEX_RUN, fht, index_keeper, keeper_entry, keeper_stream, loser_items, collision_stream), list(FAST_FHT_DRAIN_INDEX_RUN, fht, index_loser, loser_entry, loser_stream, loser_items, collision_stream));
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt412);
            }
        }
        return NIL;
    }

    /**
     * This macro handles the shuffling in the case of index collision. We detect index
     * collision on the comparison of the two smalles entries that hash to the same index
     * position. We keep the smallest in the keeper set, then put all the remaining
     * into the collision set. Because the collision set requires extra work anyway, the
     * collision set is not sorted within identical indices.
     */
    @LispMethod(comment = "This macro handles the shuffling in the case of index collision. We detect index\r\ncollision on the comparison of the two smalles entries that hash to the same index\r\nposition. We keep the smallest in the keeper set, then put all the remaining\r\ninto the collision set. Because the collision set requires extra work anyway, the\r\ncollision set is not sorted within identical indices.\nThis macro handles the shuffling in the case of index collision. We detect index\ncollision on the comparison of the two smalles entries that hash to the same index\nposition. We keep the smallest in the keeper set, then put all the remaining\ninto the collision set. Because the collision set requires extra work anyway, the\ncollision set is not sorted within identical indices.")
    public static SubLObject fast_fht_manage_index_collisions(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject fht = NIL;
        SubLObject keeper_entry = NIL;
        SubLObject loser_entry = NIL;
        SubLObject keeper_stream = NIL;
        SubLObject loser_stream = NIL;
        SubLObject keeper_items = NIL;
        SubLObject loser_items = NIL;
        SubLObject set_stream = NIL;
        SubLObject collision_stream = NIL;
        destructuring_bind_must_consp(current, datum, $list474);
        fht = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list474);
        keeper_entry = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list474);
        loser_entry = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list474);
        keeper_stream = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list474);
        loser_stream = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list474);
        keeper_items = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list474);
        loser_items = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list474);
        set_stream = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list474);
        collision_stream = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject index_keeper = $sym475$INDEX_KEEPER;
            final SubLObject index_loser = $sym476$INDEX_LOSER;
            return list(CLET, list(list(index_keeper, list(FAST_FHT_GET_COMPARABLE_INDEX_FROM_ENTRY, keeper_entry)), list(index_loser, list(FAST_FHT_GET_COMPARABLE_INDEX_FROM_ENTRY, loser_entry))), list(FAST_FHT_WRITE_ONE_KEYSTREAM_ENTRY, set_stream, keeper_entry), list(CINC, keeper_items), list(CSETQ, keeper_entry, list(FAST_FHT_READ_ONE_KEYSTREAM_ENTRY, keeper_stream, fht, keeper_entry)), list(FAST_FHT_DRAIN_INDEX_RUN, fht, index_keeper, keeper_entry, keeper_stream, loser_items, collision_stream), list(FAST_FHT_DRAIN_INDEX_RUN, fht, index_loser, loser_entry, loser_stream, loser_items, collision_stream));
        }
        cdestructuring_bind_error(datum, $list474);
        return NIL;
    }

    /**
     * Upon entry, OUTPUT-FILES contains the last two big chunks of sorted matter.
     * Merge the input together, but pay attention only to the index information;
     * if two indexes are equal, use the CMP method to determine which one will
     * go into the main file and which one goes into the collisions.
     * INPUT-FILE #1 is the main file and INPUT-FILE #2 is the collisions file.
     */
    @LispMethod(comment = "Upon entry, OUTPUT-FILES contains the last two big chunks of sorted matter.\r\nMerge the input together, but pay attention only to the index information;\r\nif two indexes are equal, use the CMP method to determine which one will\r\ngo into the main file and which one goes into the collisions.\r\nINPUT-FILE #1 is the main file and INPUT-FILE #2 is the collisions file.\nUpon entry, OUTPUT-FILES contains the last two big chunks of sorted matter.\nMerge the input together, but pay attention only to the index information;\nif two indexes are equal, use the CMP method to determine which one will\ngo into the main file and which one goes into the collisions.\nINPUT-FILE #1 is the main file and INPUT-FILE #2 is the collisions file.")
    public static final SubLObject fast_fht_uniquify_keystream_alt(SubLObject fht, SubLObject fast_fht_sorter) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject input_files = fstfht_ksorter_in_files(fast_fht_sorter);
                SubLObject set_file = input_files.first();
                SubLObject collisions = second(input_files);
                SubLObject output_files = fstfht_ksorter_out_files(fast_fht_sorter);
                SubLObject file_a = output_files.first();
                SubLObject file_b = second(output_files);
                SubLObject set_items = ZERO_INTEGER;
                SubLObject collision_items = ZERO_INTEGER;
                SubLObject stream = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                        try {
                            stream_macros.$stream_requires_locking$.bind(NIL, thread);
                            stream = compatibility.open_binary(file_a, $INPUT, NIL);
                        } finally {
                            stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                        }
                    }
                    if (!stream.isStream()) {
                        Errors.error($str_alt360$Unable_to_open__S, file_a);
                    }
                    {
                        SubLObject in_stream_a = stream;
                        SubLObject stream_12 = NIL;
                        try {
                            {
                                SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                                try {
                                    stream_macros.$stream_requires_locking$.bind(NIL, thread);
                                    stream_12 = compatibility.open_binary(file_b, $INPUT, NIL);
                                } finally {
                                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                                }
                            }
                            if (!stream_12.isStream()) {
                                Errors.error($str_alt360$Unable_to_open__S, file_b);
                            }
                            {
                                SubLObject in_stream_b = stream_12;
                                SubLObject stream_13 = NIL;
                                try {
                                    {
                                        SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                                        try {
                                            stream_macros.$stream_requires_locking$.bind(NIL, thread);
                                            stream_13 = compatibility.open_binary(set_file, $OUTPUT, NIL);
                                        } finally {
                                            stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                                        }
                                    }
                                    if (!stream_13.isStream()) {
                                        Errors.error($str_alt360$Unable_to_open__S, set_file);
                                    }
                                    {
                                        SubLObject set_stream = stream_13;
                                        SubLObject stream_14 = NIL;
                                        try {
                                            {
                                                SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                                                try {
                                                    stream_macros.$stream_requires_locking$.bind(NIL, thread);
                                                    stream_14 = compatibility.open_binary(collisions, $OUTPUT, NIL);
                                                } finally {
                                                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                                                }
                                            }
                                            if (!stream_14.isStream()) {
                                                Errors.error($str_alt360$Unable_to_open__S, collisions);
                                            }
                                            {
                                                SubLObject collision_stream = stream_14;
                                                SubLObject entry_a = NIL;
                                                SubLObject entry_b = NIL;
                                                entry_a = fast_fht_read_one_keystream_entry(in_stream_a, fht, entry_a);
                                                entry_b = fast_fht_read_one_keystream_entry(in_stream_b, fht, entry_b);
                                                while (!((NIL != is_fast_fht_keystream_chunk_separator_entryP(entry_a)) && (NIL != is_fast_fht_keystream_chunk_separator_entryP(entry_b)))) {
                                                    {
                                                        SubLObject index_a = fast_fht_get_comparable_index_from_entry(entry_a);
                                                        SubLObject index_b = fast_fht_get_comparable_index_from_entry(entry_b);
                                                        if (index_a.numL(index_b)) {
                                                            fast_fht_write_one_keystream_entry(set_stream, entry_a);
                                                            set_items = add(set_items, ONE_INTEGER);
                                                            entry_a = fast_fht_read_one_keystream_entry(in_stream_a, fht, entry_a);
                                                            while (index_a.numE(fast_fht_get_comparable_index_from_entry(entry_a))) {
                                                                fast_fht_write_one_collision_stream_entry(fht, collision_stream, entry_a);
                                                                entry_a = fast_fht_read_one_keystream_entry(in_stream_a, fht, entry_a);
                                                                collision_items = add(collision_items, ONE_INTEGER);
                                                            } 
                                                        } else {
                                                            if (index_b.numL(index_a)) {
                                                                fast_fht_write_one_keystream_entry(set_stream, entry_b);
                                                                set_items = add(set_items, ONE_INTEGER);
                                                                entry_b = fast_fht_read_one_keystream_entry(in_stream_b, fht, entry_b);
                                                                while (index_b.numE(fast_fht_get_comparable_index_from_entry(entry_b))) {
                                                                    fast_fht_write_one_collision_stream_entry(fht, collision_stream, entry_b);
                                                                    entry_b = fast_fht_read_one_keystream_entry(in_stream_b, fht, entry_b);
                                                                    collision_items = add(collision_items, ONE_INTEGER);
                                                                } 
                                                            } else {
                                                                if (NIL != fast_fht_keystream_entryL(entry_a, entry_b)) {
                                                                    {
                                                                        SubLObject index_keeper = fast_fht_get_comparable_index_from_entry(entry_a);
                                                                        SubLObject index_loser = fast_fht_get_comparable_index_from_entry(entry_b);
                                                                        fast_fht_write_one_keystream_entry(set_stream, entry_a);
                                                                        set_items = add(set_items, ONE_INTEGER);
                                                                        entry_a = fast_fht_read_one_keystream_entry(in_stream_a, fht, entry_a);
                                                                        while (index_keeper.numE(fast_fht_get_comparable_index_from_entry(entry_a))) {
                                                                            fast_fht_write_one_collision_stream_entry(fht, collision_stream, entry_a);
                                                                            entry_a = fast_fht_read_one_keystream_entry(in_stream_a, fht, entry_a);
                                                                            collision_items = add(collision_items, ONE_INTEGER);
                                                                        } 
                                                                        while (index_loser.numE(fast_fht_get_comparable_index_from_entry(entry_b))) {
                                                                            fast_fht_write_one_collision_stream_entry(fht, collision_stream, entry_b);
                                                                            entry_b = fast_fht_read_one_keystream_entry(in_stream_b, fht, entry_b);
                                                                            collision_items = add(collision_items, ONE_INTEGER);
                                                                        } 
                                                                    }
                                                                } else {
                                                                    if (NIL != fast_fht_keystream_entryL(entry_b, entry_a)) {
                                                                        {
                                                                            SubLObject index_keeper = fast_fht_get_comparable_index_from_entry(entry_b);
                                                                            SubLObject index_loser = fast_fht_get_comparable_index_from_entry(entry_a);
                                                                            fast_fht_write_one_keystream_entry(set_stream, entry_b);
                                                                            set_items = add(set_items, ONE_INTEGER);
                                                                            entry_b = fast_fht_read_one_keystream_entry(in_stream_b, fht, entry_b);
                                                                            while (index_keeper.numE(fast_fht_get_comparable_index_from_entry(entry_b))) {
                                                                                fast_fht_write_one_collision_stream_entry(fht, collision_stream, entry_b);
                                                                                entry_b = fast_fht_read_one_keystream_entry(in_stream_b, fht, entry_b);
                                                                                collision_items = add(collision_items, ONE_INTEGER);
                                                                            } 
                                                                            while (index_loser.numE(fast_fht_get_comparable_index_from_entry(entry_a))) {
                                                                                fast_fht_write_one_collision_stream_entry(fht, collision_stream, entry_a);
                                                                                entry_a = fast_fht_read_one_keystream_entry(in_stream_a, fht, entry_a);
                                                                                collision_items = add(collision_items, ONE_INTEGER);
                                                                            } 
                                                                        }
                                                                    } else {
                                                                        Errors.error($str_alt404$Only_sentinels_or__EOF_can_be_equ, entry_a, entry_b);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                } 
                                            }
                                        } finally {
                                            {
                                                SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    if (stream_14.isStream()) {
                                                        close(stream_14, UNPROVIDED);
                                                    }
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                                }
                                            }
                                        }
                                    }
                                } finally {
                                    {
                                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            if (stream_13.isStream()) {
                                                close(stream_13, UNPROVIDED);
                                            }
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                        }
                                    }
                                }
                            }
                        } finally {
                            {
                                SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    if (stream_12.isStream()) {
                                        close(stream_12, UNPROVIDED);
                                    }
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                }
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
                if (NIL == $silent_progressP$.getDynamicValue(thread)) {
                    format(T, $str_alt417$__A_set_item_A___A_activity_item_, new SubLObject[]{ set_items, ONE_INTEGER.numE(set_items) ? ((SubLObject) ($str_alt270$)) : $$$s, collision_items, ONE_INTEGER.numE(collision_items) ? ((SubLObject) ($str_alt270$)) : $$$s });
                }
                return values(set_items, collision_items);
            }
        }
    }

    /**
     * Upon entry, OUTPUT-FILES contains the last two big chunks of sorted matter.
     * Merge the input together, but pay attention only to the index information;
     * if two indexes are equal, use the CMP method to determine which one will
     * go into the main file and which one goes into the collisions.
     * INPUT-FILE #1 is the main file and INPUT-FILE #2 is the collisions file.
     */
    @LispMethod(comment = "Upon entry, OUTPUT-FILES contains the last two big chunks of sorted matter.\r\nMerge the input together, but pay attention only to the index information;\r\nif two indexes are equal, use the CMP method to determine which one will\r\ngo into the main file and which one goes into the collisions.\r\nINPUT-FILE #1 is the main file and INPUT-FILE #2 is the collisions file.\nUpon entry, OUTPUT-FILES contains the last two big chunks of sorted matter.\nMerge the input together, but pay attention only to the index information;\nif two indexes are equal, use the CMP method to determine which one will\ngo into the main file and which one goes into the collisions.\nINPUT-FILE #1 is the main file and INPUT-FILE #2 is the collisions file.")
    public static SubLObject fast_fht_uniquify_keystream(final SubLObject fht, final SubLObject fast_fht_sorter) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject input_files = fstfht_ksorter_in_files(fast_fht_sorter);
        final SubLObject set_file = input_files.first();
        final SubLObject collisions = second(input_files);
        final SubLObject output_files = fstfht_ksorter_out_files(fast_fht_sorter);
        final SubLObject file_a = output_files.first();
        final SubLObject file_b = second(output_files);
        SubLObject set_items = ZERO_INTEGER;
        SubLObject collision_items = ZERO_INTEGER;
        final SubLObject _prev_bind_0 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding(thread);
        final SubLObject _prev_bind_2 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding(thread);
        try {
            StreamsLow.$stream_initial_input_buffer_size$.bind($fast_fht_large_buffer_size$.getGlobalValue(), thread);
            StreamsLow.$stream_initial_output_buffer_size$.bind(StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue(thread), thread);
            SubLObject stream = NIL;
            try {
                final SubLObject _prev_bind_0_$23 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind(NIL, thread);
                    stream = compatibility.open_binary(file_a, $INPUT);
                } finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_$23, thread);
                }
                if (!stream.isStream()) {
                    Errors.error($str419$Unable_to_open__S, file_a);
                }
                final SubLObject in_stream_a = stream;
                SubLObject stream_$24 = NIL;
                try {
                    final SubLObject _prev_bind_0_$24 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                    try {
                        stream_macros.$stream_requires_locking$.bind(NIL, thread);
                        stream_$24 = compatibility.open_binary(file_b, $INPUT);
                    } finally {
                        stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_$24, thread);
                    }
                    if (!stream_$24.isStream()) {
                        Errors.error($str419$Unable_to_open__S, file_b);
                    }
                    final SubLObject in_stream_b = stream_$24;
                    SubLObject stream_$25 = NIL;
                    try {
                        final SubLObject _prev_bind_0_$25 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                        try {
                            stream_macros.$stream_requires_locking$.bind(NIL, thread);
                            stream_$25 = compatibility.open_binary(set_file, $OUTPUT);
                        } finally {
                            stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_$25, thread);
                        }
                        if (!stream_$25.isStream()) {
                            Errors.error($str419$Unable_to_open__S, set_file);
                        }
                        final SubLObject set_stream = stream_$25;
                        SubLObject stream_$26 = NIL;
                        try {
                            final SubLObject _prev_bind_0_$26 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                            try {
                                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                                stream_$26 = compatibility.open_binary(collisions, $OUTPUT);
                            } finally {
                                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_$26, thread);
                            }
                            if (!stream_$26.isStream()) {
                                Errors.error($str419$Unable_to_open__S, collisions);
                            }
                            final SubLObject collision_stream = stream_$26;
                            SubLObject entry_a = NIL;
                            SubLObject entry_b = NIL;
                            entry_a = fast_fht_read_one_keystream_entry(in_stream_a, fht, entry_a);
                            entry_b = fast_fht_read_one_keystream_entry(in_stream_b, fht, entry_b);
                            while ((NIL == is_fast_fht_keystream_chunk_separator_entryP(entry_a)) || (NIL == is_fast_fht_keystream_chunk_separator_entryP(entry_b))) {
                                final SubLObject index_a = fast_fht_get_comparable_index_from_entry(entry_a);
                                final SubLObject index_b = fast_fht_get_comparable_index_from_entry(entry_b);
                                if (index_a.numL(index_b)) {
                                    fast_fht_write_one_keystream_entry(set_stream, entry_a);
                                    set_items = add(set_items, ONE_INTEGER);
                                    for (entry_a = fast_fht_read_one_keystream_entry(in_stream_a, fht, entry_a); index_a.numE(fast_fht_get_comparable_index_from_entry(entry_a)); entry_a = fast_fht_read_one_keystream_entry(in_stream_a, fht, entry_a) , collision_items = add(collision_items, ONE_INTEGER)) {
                                        fast_fht_write_one_collision_stream_entry(fht, collision_stream, entry_a);
                                    }
                                } else
                                    if (index_b.numL(index_a)) {
                                        fast_fht_write_one_keystream_entry(set_stream, entry_b);
                                        set_items = add(set_items, ONE_INTEGER);
                                        for (entry_b = fast_fht_read_one_keystream_entry(in_stream_b, fht, entry_b); index_b.numE(fast_fht_get_comparable_index_from_entry(entry_b)); entry_b = fast_fht_read_one_keystream_entry(in_stream_b, fht, entry_b) , collision_items = add(collision_items, ONE_INTEGER)) {
                                            fast_fht_write_one_collision_stream_entry(fht, collision_stream, entry_b);
                                        }
                                    } else
                                        if (NIL != fast_fht_keystream_entryL(entry_a, entry_b)) {
                                            final SubLObject index_keeper = fast_fht_get_comparable_index_from_entry(entry_a);
                                            final SubLObject index_loser = fast_fht_get_comparable_index_from_entry(entry_b);
                                            fast_fht_write_one_keystream_entry(set_stream, entry_a);
                                            set_items = add(set_items, ONE_INTEGER);
                                            for (entry_a = fast_fht_read_one_keystream_entry(in_stream_a, fht, entry_a); index_keeper.numE(fast_fht_get_comparable_index_from_entry(entry_a)); entry_a = fast_fht_read_one_keystream_entry(in_stream_a, fht, entry_a) , collision_items = add(collision_items, ONE_INTEGER)) {
                                                fast_fht_write_one_collision_stream_entry(fht, collision_stream, entry_a);
                                            }
                                            while (index_loser.numE(fast_fht_get_comparable_index_from_entry(entry_b))) {
                                                fast_fht_write_one_collision_stream_entry(fht, collision_stream, entry_b);
                                                entry_b = fast_fht_read_one_keystream_entry(in_stream_b, fht, entry_b);
                                                collision_items = add(collision_items, ONE_INTEGER);
                                            } 
                                        } else
                                            if (NIL != fast_fht_keystream_entryL(entry_b, entry_a)) {
                                                final SubLObject index_keeper = fast_fht_get_comparable_index_from_entry(entry_b);
                                                final SubLObject index_loser = fast_fht_get_comparable_index_from_entry(entry_a);
                                                fast_fht_write_one_keystream_entry(set_stream, entry_b);
                                                set_items = add(set_items, ONE_INTEGER);
                                                for (entry_b = fast_fht_read_one_keystream_entry(in_stream_b, fht, entry_b); index_keeper.numE(fast_fht_get_comparable_index_from_entry(entry_b)); entry_b = fast_fht_read_one_keystream_entry(in_stream_b, fht, entry_b) , collision_items = add(collision_items, ONE_INTEGER)) {
                                                    fast_fht_write_one_collision_stream_entry(fht, collision_stream, entry_b);
                                                }
                                                while (index_loser.numE(fast_fht_get_comparable_index_from_entry(entry_a))) {
                                                    fast_fht_write_one_collision_stream_entry(fht, collision_stream, entry_a);
                                                    entry_a = fast_fht_read_one_keystream_entry(in_stream_a, fht, entry_a);
                                                    collision_items = add(collision_items, ONE_INTEGER);
                                                } 
                                            } else {
                                                Errors.error($str466$Only_sentinels_or__EOF_can_be_equ, entry_a, entry_b);
                                            }



                            } 
                        } finally {
                            final SubLObject _prev_bind_0_$27 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                if (stream_$26.isStream()) {
                                    close(stream_$26, UNPROVIDED);
                                }
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$27, thread);
                            }
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$28 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values2 = getValuesAsVector();
                            if (stream_$25.isStream()) {
                                close(stream_$25, UNPROVIDED);
                            }
                            restoreValuesFromVector(_values2);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$28, thread);
                        }
                    }
                } finally {
                    final SubLObject _prev_bind_0_$29 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values3 = getValuesAsVector();
                        if (stream_$24.isStream()) {
                            close(stream_$24, UNPROVIDED);
                        }
                        restoreValuesFromVector(_values3);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$29, thread);
                    }
                }
            } finally {
                final SubLObject _prev_bind_0_$30 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values4 = getValuesAsVector();
                    if (stream.isStream()) {
                        close(stream, UNPROVIDED);
                    }
                    restoreValuesFromVector(_values4);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$30, thread);
                }
            }
        } finally {
            StreamsLow.$stream_initial_output_buffer_size$.rebind(_prev_bind_2, thread);
            StreamsLow.$stream_initial_input_buffer_size$.rebind(_prev_bind_0, thread);
        }
        if (NIL == $silent_progressP$.getDynamicValue(thread)) {
            format(T, $str479$__A_set_item_A___A_activity_item_, new SubLObject[]{ set_items, ONE_INTEGER.numE(set_items) ? $str309$ : $$$s, collision_items, ONE_INTEGER.numE(collision_items) ? $str309$ : $$$s });
        }
        return values(set_items, collision_items);
    }

    /**
     * Ensures that even :EOF will give a numeric value.
     */
    @LispMethod(comment = "Ensures that even :EOF will give a numeric value.")
    public static final SubLObject fast_fht_get_comparable_index_from_entry_alt(SubLObject entry) {
        {
            SubLObject index = entry.first();
            if (!index.isNumber()) {
                index = $fast_fht_sentinel_index_value$.getGlobalValue();
            }
            return index;
        }
    }

    /**
     * Ensures that even :EOF will give a numeric value.
     */
    @LispMethod(comment = "Ensures that even :EOF will give a numeric value.")
    public static SubLObject fast_fht_get_comparable_index_from_entry(final SubLObject entry) {
        SubLObject index = entry.first();
        if (!index.isNumber()) {
            index = $fast_fht_sentinel_index_value$.getGlobalValue();
        }
        return index;
    }

    /**
     * A helper method that renders a keystream to a text stream, e.g. for verification
     * of the sorted property.
     *
     * @return FILE-HASH-TABLE-P
     */
    @LispMethod(comment = "A helper method that renders a keystream to a text stream, e.g. for verification\r\nof the sorted property.\r\n\r\n@return FILE-HASH-TABLE-P\nA helper method that renders a keystream to a text stream, e.g. for verification\nof the sorted property.")
    public static final SubLObject fast_fht_dump_keystream_alt(SubLObject keystream, SubLObject fht, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        {
            SubLObject doneP = NIL;
            SubLObject result = NIL;
            while (NIL == doneP) {
                result = fast_fht_read_one_keystream_entry(keystream, fht, result);
                if (NIL != is_fast_fht_keystream_eofP(result)) {
                    doneP = T;
                } else {
                    if (NIL != is_fast_fht_keystream_chunk_separator_entryP(result)) {
                        write_string($str_alt419$_________________________, stream, UNPROVIDED, UNPROVIDED);
                        terpri(stream);
                    } else {
                        princ(result, stream);
                        terpri(stream);
                    }
                }
            } 
        }
        return fht;
    }

    @LispMethod(comment = "A helper method that renders a keystream to a text stream, e.g. for verification\r\nof the sorted property.\r\n\r\n@return FILE-HASH-TABLE-P\nA helper method that renders a keystream to a text stream, e.g. for verification\nof the sorted property.")
    public static SubLObject fast_fht_dump_keystream(final SubLObject keystream, final SubLObject fht, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        SubLObject doneP = NIL;
        SubLObject result = NIL;
        while (NIL == doneP) {
            result = fast_fht_read_one_keystream_entry(keystream, fht, result);
            if (NIL != is_fast_fht_keystream_eofP(result)) {
                doneP = T;
            } else
                if (NIL != is_fast_fht_keystream_chunk_separator_entryP(result)) {
                    write_string($str481$_________________________, stream, UNPROVIDED, UNPROVIDED);
                    terpri(stream);
                } else {
                    princ(result, stream);
                    terpri(stream);
                }

        } 
        return fht;
    }

    /**
     * Wrapper method for FAST-FHT-DUMP-KEYSTREAM that renders
     * all of the files.
     *
     * @return FHT
     */
    @LispMethod(comment = "Wrapper method for FAST-FHT-DUMP-KEYSTREAM that renders\r\nall of the files.\r\n\r\n@return FHT\nWrapper method for FAST-FHT-DUMP-KEYSTREAM that renders\nall of the files.")
    public static final SubLObject fast_fht_dump_keystream_files_alt(SubLObject file_list, SubLObject fht, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject cdolist_list_var = file_list;
                SubLObject file = NIL;
                for (file = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , file = cdolist_list_var.first()) {
                    format(stream, $str_alt420$______File__A______, file);
                    {
                        SubLObject stream_15 = NIL;
                        try {
                            {
                                SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                                try {
                                    stream_macros.$stream_requires_locking$.bind(NIL, thread);
                                    stream_15 = compatibility.open_binary(file, $INPUT, NIL);
                                } finally {
                                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                                }
                            }
                            if (!stream_15.isStream()) {
                                Errors.error($str_alt360$Unable_to_open__S, file);
                            }
                            {
                                SubLObject keystream = stream_15;
                                fast_fht_dump_keystream(keystream, fht, UNPROVIDED);
                            }
                        } finally {
                            {
                                SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    if (stream_15.isStream()) {
                                        close(stream_15, UNPROVIDED);
                                    }
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                    }
                }
            }
            return fht;
        }
    }

    @LispMethod(comment = "Wrapper method for FAST-FHT-DUMP-KEYSTREAM that renders\r\nall of the files.\r\n\r\n@return FHT\nWrapper method for FAST-FHT-DUMP-KEYSTREAM that renders\nall of the files.")
    public static SubLObject fast_fht_dump_keystream_files(final SubLObject file_list, final SubLObject fht, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = file_list;
        SubLObject file = NIL;
        file = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            format(stream, $str482$______File__A______, file);
            SubLObject stream_$34 = NIL;
            try {
                final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind(NIL, thread);
                    stream_$34 = compatibility.open_binary(file, $INPUT);
                } finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                }
                if (!stream_$34.isStream()) {
                    Errors.error($str419$Unable_to_open__S, file);
                }
                final SubLObject keystream = stream_$34;
                fast_fht_dump_keystream(keystream, fht, UNPROVIDED);
            } finally {
                final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    if (stream_$34.isStream()) {
                        close(stream_$34, UNPROVIDED);
                    }
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            file = cdolist_list_var.first();
        } 
        return fht;
    }

    /**
     * Wrapper method for VALIDATE-FAST-FHT-DUMP-KEYSTREAM that
     * checks all of the files;    errors in case of difficulties.
     *
     * @return fht
     */
    @LispMethod(comment = "Wrapper method for VALIDATE-FAST-FHT-DUMP-KEYSTREAM that\r\nchecks all of the files;    errors in case of difficulties.\r\n\r\n@return fht\nWrapper method for VALIDATE-FAST-FHT-DUMP-KEYSTREAM that\nchecks all of the files;    errors in case of difficulties.")
    public static final SubLObject enforce_valid_fast_fht_dump_keystream_files_alt(SubLObject file_list, SubLObject fht) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject cdolist_list_var = file_list;
                SubLObject file = NIL;
                for (file = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , file = cdolist_list_var.first()) {
                    {
                        SubLObject stream = NIL;
                        try {
                            {
                                SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                                try {
                                    stream_macros.$stream_requires_locking$.bind(NIL, thread);
                                    stream = compatibility.open_binary(file, $INPUT, NIL);
                                } finally {
                                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                                }
                            }
                            if (!stream.isStream()) {
                                Errors.error($str_alt360$Unable_to_open__S, file);
                            }
                            {
                                SubLObject keystream = stream;
                                thread.resetMultipleValues();
                                {
                                    SubLObject successP = validate_fast_fht_dump_keystream(keystream, fht);
                                    SubLObject details = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                        if (NIL == successP) {
                                            Errors.error($str_alt421$File__A_no_does_not_contain_a_val, file, details);
                                        }
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
                }
            }
            return fht;
        }
    }

    @LispMethod(comment = "Wrapper method for VALIDATE-FAST-FHT-DUMP-KEYSTREAM that\r\nchecks all of the files;    errors in case of difficulties.\r\n\r\n@return fht\nWrapper method for VALIDATE-FAST-FHT-DUMP-KEYSTREAM that\nchecks all of the files;    errors in case of difficulties.")
    public static SubLObject enforce_valid_fast_fht_dump_keystream_files(final SubLObject file_list, final SubLObject fht) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = file_list;
        SubLObject file = NIL;
        file = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject stream = NIL;
            try {
                final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind(NIL, thread);
                    stream = compatibility.open_binary(file, $INPUT);
                } finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                }
                if (!stream.isStream()) {
                    Errors.error($str419$Unable_to_open__S, file);
                }
                final SubLObject keystream = stream;
                thread.resetMultipleValues();
                final SubLObject successP = validate_fast_fht_dump_keystream(keystream, fht);
                final SubLObject details = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == successP)) {
                    Errors.error($str483$File__A_no_does_not_contain_a_val, file, details);
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
            cdolist_list_var = cdolist_list_var.rest();
            file = cdolist_list_var.first();
        } 
        return fht;
    }

    /**
     * A helper method that ensures that, within the chunk ranges, the
     * index objects are in ascending sorted order.
     *
     * @return 0 T or NIL
     * @return 1 NIL or offending index and code
     */
    @LispMethod(comment = "A helper method that ensures that, within the chunk ranges, the\r\nindex objects are in ascending sorted order.\r\n\r\n@return 0 T or NIL\r\n@return 1 NIL or offending index and code\nA helper method that ensures that, within the chunk ranges, the\nindex objects are in ascending sorted order.")
    public static final SubLObject validate_fast_fht_dump_keystream_alt(SubLObject keystream, SubLObject fht) {
        {
            SubLObject prev_index = $most_negative_fixnum$.getGlobalValue();
            SubLObject chunk = ZERO_INTEGER;
            SubLObject position = ZERO_INTEGER;
            SubLObject doneP = NIL;
            SubLObject result = NIL;
            while (NIL == doneP) {
                result = fast_fht_read_one_keystream_entry(keystream, fht, result);
                if (NIL != is_fast_fht_keystream_eofP(result)) {
                    if (!position.isZero()) {
                        return values(NIL, list($MID_STREAM_EOF, chunk, position));
                    }
                    doneP = T;
                } else {
                    if (NIL != is_fast_fht_keystream_chunk_separator_entryP(result)) {
                        chunk = add(chunk, ONE_INTEGER);
                        position = ZERO_INTEGER;
                        prev_index = $most_negative_fixnum$.getGlobalValue();
                    } else {
                        {
                            SubLObject index = result.first();
                            if (!prev_index.numLE(index)) {
                                return values(NIL, list($UNSORTED_INDEX, chunk, position));
                            }
                            position = add(position, ONE_INTEGER);
                            prev_index = index;
                        }
                    }
                }
            } 
        }
        return values(T, NIL);
    }

    @LispMethod(comment = "A helper method that ensures that, within the chunk ranges, the\r\nindex objects are in ascending sorted order.\r\n\r\n@return 0 T or NIL\r\n@return 1 NIL or offending index and code\nA helper method that ensures that, within the chunk ranges, the\nindex objects are in ascending sorted order.")
    public static SubLObject validate_fast_fht_dump_keystream(final SubLObject keystream, final SubLObject fht) {
        SubLObject prev_index = $most_negative_fixnum$.getGlobalValue();
        SubLObject chunk = ZERO_INTEGER;
        SubLObject position = ZERO_INTEGER;
        SubLObject doneP = NIL;
        SubLObject result = NIL;
        while (NIL == doneP) {
            result = fast_fht_read_one_keystream_entry(keystream, fht, result);
            if (NIL != is_fast_fht_keystream_eofP(result)) {
                if (!position.isZero()) {
                    return values(NIL, list($MID_STREAM_EOF, chunk, position));
                }
                doneP = T;
            } else
                if (NIL != is_fast_fht_keystream_chunk_separator_entryP(result)) {
                    chunk = add(chunk, ONE_INTEGER);
                    position = ZERO_INTEGER;
                    prev_index = $most_negative_fixnum$.getGlobalValue();
                } else {
                    final SubLObject index = result.first();
                    if (!prev_index.numLE(index)) {
                        return values(NIL, list($UNSORTED_INDEX, chunk, position));
                    }
                    position = add(position, ONE_INTEGER);
                    prev_index = index;
                }

        } 
        return values(T, NIL);
    }

    public static final SubLObject test_fast_fht_keystream_entry_cmp_alt(SubLObject entry_a, SubLObject entry_b) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = $fast_file_hash_table_optimization_mode$.currentBinding(thread);
                    try {
                        $fast_file_hash_table_optimization_mode$.bind($MODERATE, thread);
                        result = fast_fht_keystream_entry_cmp(fast_fht_keystream_entry_cmp_expand_argument(entry_a), fast_fht_keystream_entry_cmp_expand_argument(entry_b));
                    } finally {
                        $fast_file_hash_table_optimization_mode$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject test_fast_fht_keystream_entry_cmp(final SubLObject entry_a, final SubLObject entry_b) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $fast_file_hash_table_optimization_mode$.currentBinding(thread);
        try {
            $fast_file_hash_table_optimization_mode$.bind($MODERATE, thread);
            result = fast_fht_keystream_entry_cmp(fast_fht_keystream_entry_cmp_expand_argument(entry_a), fast_fht_keystream_entry_cmp_expand_argument(entry_b));
        } finally {
            $fast_file_hash_table_optimization_mode$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    /**
     * Allow use of symbolic forms of representation for the keys
     * representing sentinels and EOF.
     *
     * @return CONSP
     */
    @LispMethod(comment = "Allow use of symbolic forms of representation for the keys\r\nrepresenting sentinels and EOF.\r\n\r\n@return CONSP\nAllow use of symbolic forms of representation for the keys\nrepresenting sentinels and EOF.")
    public static final SubLObject fast_fht_keystream_entry_cmp_expand_argument_alt(SubLObject arg) {
        if ($SENTINEL == arg) {
            return fast_fht_keystream_sentinel_entry(UNPROVIDED);
        } else {
            if ($EOF == arg) {
                return fast_fht_keystream_eof_entry(UNPROVIDED);
            } else {
                return arg;
            }
        }
    }

    @LispMethod(comment = "Allow use of symbolic forms of representation for the keys\r\nrepresenting sentinels and EOF.\r\n\r\n@return CONSP\nAllow use of symbolic forms of representation for the keys\nrepresenting sentinels and EOF.")
    public static SubLObject fast_fht_keystream_entry_cmp_expand_argument(final SubLObject arg) {
        if ($SENTINEL == arg) {
            return fast_fht_keystream_sentinel_entry(UNPROVIDED);
        }
        if ($EOF == arg) {
            return fast_fht_keystream_eof_entry(UNPROVIDED);
        }
        return arg;
    }

    /**
     * Opens a file hash table for reading and binds the handle to the FHT var.
     */
    @LispMethod(comment = "Opens a file hash table for reading and binds the handle to the FHT var.")
    public static final SubLObject with_input_file_hash_table_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt434);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject fht = NIL;
                    SubLObject filename = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt434);
                    fht = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt434);
                    filename = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_16 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt434);
                            current_16 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt434);
                            if (NIL == member(current_16, $list_alt435, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_16 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt434);
                        }
                        {
                            SubLObject test_fn_tail = property_list_member($TEST_FN, current);
                            SubLObject test_fn = (NIL != test_fn_tail) ? ((SubLObject) (cadr(test_fn_tail))) : $default_fht_test_function$;
                            SubLObject serialization_fn_tail = property_list_member($SERIALIZATION_FN, current);
                            SubLObject serialization_fn = (NIL != serialization_fn_tail) ? ((SubLObject) (cadr(serialization_fn_tail))) : $default_fht_serialization_protocol$.getGlobalValue();
                            current = temp;
                            {
                                SubLObject body = current;
                                return list(CLET, list(fht), list(CUNWIND_PROTECT, listS(PROGN, list(CSETQ, fht, list(OPEN_FILE_HASH_TABLE_READ_ONLY, filename, test_fn, serialization_fn)), append(body, NIL)), list(PWHEN, list(FILE_HASH_TABLE_P, fht), list(FINALIZE_FILE_HASH_TABLE, fht))));
                            }
                        }
                    }
                }
            }
        }
    }

    @LispMethod(comment = "Opens a file hash table for reading and binds the handle to the FHT var.")
    public static SubLObject with_input_file_hash_table(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list495);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject fht = NIL;
        SubLObject filename = NIL;
        destructuring_bind_must_consp(current, datum, $list495);
        fht = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list495);
        filename = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$35 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list495);
            current_$35 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list495);
            if (NIL == member(current_$35, $list496, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$35 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list495);
        }
        final SubLObject test_fn_tail = property_list_member($TEST_FN, current);
        final SubLObject test_fn = (NIL != test_fn_tail) ? cadr(test_fn_tail) : $default_fht_test_function$;
        final SubLObject serialization_fn_tail = property_list_member($SERIALIZATION_FN, current);
        final SubLObject serialization_fn = (NIL != serialization_fn_tail) ? cadr(serialization_fn_tail) : $default_fht_serialization_protocol$.getGlobalValue();
        final SubLObject body;
        current = body = temp;
        return list(CLET, list(fht), list(CUNWIND_PROTECT, listS(PROGN, list(CSETQ, fht, list(OPEN_FILE_HASH_TABLE_READ_ONLY, filename, test_fn, serialization_fn)), append(body, NIL)), list(PWHEN, list(FILE_HASH_TABLE_P, fht), list(FINALIZE_FILE_HASH_TABLE, fht))));
    }

    /**
     * Opens a file hash table for reading and writing and binds the handle to the FHT var.
     */
    @LispMethod(comment = "Opens a file hash table for reading and writing and binds the handle to the FHT var.")
    public static final SubLObject with_writable_file_hash_table_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt434);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject fht = NIL;
                    SubLObject filename = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt434);
                    fht = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt434);
                    filename = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_17 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt434);
                            current_17 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt434);
                            if (NIL == member(current_17, $list_alt435, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_17 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt434);
                        }
                        {
                            SubLObject test_fn_tail = property_list_member($TEST_FN, current);
                            SubLObject test_fn = (NIL != test_fn_tail) ? ((SubLObject) (cadr(test_fn_tail))) : $default_fht_test_function$;
                            SubLObject serialization_fn_tail = property_list_member($SERIALIZATION_FN, current);
                            SubLObject serialization_fn = (NIL != serialization_fn_tail) ? ((SubLObject) (cadr(serialization_fn_tail))) : $default_fht_serialization_protocol$.getGlobalValue();
                            current = temp;
                            {
                                SubLObject body = current;
                                return list(CLET, list(fht), list(CUNWIND_PROTECT, listS(PROGN, list(CSETQ, fht, list(OPEN_FILE_HASH_TABLE, filename, test_fn, serialization_fn)), append(body, NIL)), list(PWHEN, list(FILE_HASH_TABLE_P, fht), list(FINALIZE_FILE_HASH_TABLE, fht))));
                            }
                        }
                    }
                }
            }
        }
    }

    @LispMethod(comment = "Opens a file hash table for reading and writing and binds the handle to the FHT var.")
    public static SubLObject with_writable_file_hash_table(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list495);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject fht = NIL;
        SubLObject filename = NIL;
        destructuring_bind_must_consp(current, datum, $list495);
        fht = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list495);
        filename = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$36 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list495);
            current_$36 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list495);
            if (NIL == member(current_$36, $list496, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$36 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list495);
        }
        final SubLObject test_fn_tail = property_list_member($TEST_FN, current);
        final SubLObject test_fn = (NIL != test_fn_tail) ? cadr(test_fn_tail) : $default_fht_test_function$;
        final SubLObject serialization_fn_tail = property_list_member($SERIALIZATION_FN, current);
        final SubLObject serialization_fn = (NIL != serialization_fn_tail) ? cadr(serialization_fn_tail) : $default_fht_serialization_protocol$.getGlobalValue();
        final SubLObject body;
        current = body = temp;
        return list(CLET, list(fht), list(CUNWIND_PROTECT, listS(PROGN, list(CSETQ, fht, list(OPEN_FILE_HASH_TABLE, filename, test_fn, serialization_fn)), append(body, NIL)), list(PWHEN, list(FILE_HASH_TABLE_P, fht), list(FINALIZE_FILE_HASH_TABLE, fht))));
    }

    /**
     * Open a file hash table for writing to in standard mode and bind the handle to the FHT var.
     */
    @LispMethod(comment = "Open a file hash table for writing to in standard mode and bind the handle to the FHT var.")
    public static final SubLObject with_output_file_hash_table_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt444);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject fht = NIL;
                    SubLObject filename = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt444);
                    fht = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt444);
                    filename = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_18 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt444);
                            current_18 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt444);
                            if (NIL == member(current_18, $list_alt445, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_18 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt444);
                        }
                        {
                            SubLObject expected_items_tail = property_list_member($EXPECTED_ITEMS, current);
                            SubLObject expected_items = (NIL != expected_items_tail) ? ((SubLObject) (cadr(expected_items_tail))) : $htfile_default_expected_items$.getGlobalValue();
                            SubLObject average_size_tail = property_list_member($AVERAGE_SIZE, current);
                            SubLObject average_size = (NIL != average_size_tail) ? ((SubLObject) (cadr(average_size_tail))) : $htfile_default_average_size$.getGlobalValue();
                            SubLObject test_fn_tail = property_list_member($TEST_FN, current);
                            SubLObject test_fn = (NIL != test_fn_tail) ? ((SubLObject) (cadr(test_fn_tail))) : $default_fht_test_function$;
                            SubLObject serialization_fn_tail = property_list_member($SERIALIZATION_FN, current);
                            SubLObject serialization_fn = (NIL != serialization_fn_tail) ? ((SubLObject) (cadr(serialization_fn_tail))) : $default_fht_serialization_protocol$.getGlobalValue();
                            current = temp;
                            {
                                SubLObject body = current;
                                return list(CLET, list(fht), list(CUNWIND_PROTECT, listS(PROGN, list(CSETQ, fht, list(CREATE_FILE_HASH_TABLE, filename, expected_items, average_size, test_fn, serialization_fn)), append(body, NIL)), list(PWHEN, list(FILE_HASH_TABLE_P, fht), list(FINALIZE_FILE_HASH_TABLE, fht))));
                            }
                        }
                    }
                }
            }
        }
    }

    @LispMethod(comment = "Open a file hash table for writing to in standard mode and bind the handle to the FHT var.")
    public static SubLObject with_output_file_hash_table(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list505);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject fht = NIL;
        SubLObject filename = NIL;
        destructuring_bind_must_consp(current, datum, $list505);
        fht = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list505);
        filename = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$37 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list505);
            current_$37 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list505);
            if (NIL == member(current_$37, $list506, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$37 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list505);
        }
        final SubLObject expected_items_tail = property_list_member($EXPECTED_ITEMS, current);
        final SubLObject expected_items = (NIL != expected_items_tail) ? cadr(expected_items_tail) : $htfile_default_expected_items$.getGlobalValue();
        final SubLObject average_size_tail = property_list_member($AVERAGE_SIZE, current);
        final SubLObject average_size = (NIL != average_size_tail) ? cadr(average_size_tail) : $htfile_default_average_size$.getGlobalValue();
        final SubLObject test_fn_tail = property_list_member($TEST_FN, current);
        final SubLObject test_fn = (NIL != test_fn_tail) ? cadr(test_fn_tail) : $default_fht_test_function$;
        final SubLObject serialization_fn_tail = property_list_member($SERIALIZATION_FN, current);
        final SubLObject serialization_fn = (NIL != serialization_fn_tail) ? cadr(serialization_fn_tail) : $default_fht_serialization_protocol$.getGlobalValue();
        final SubLObject body;
        current = body = temp;
        return list(CLET, list(fht), list(CUNWIND_PROTECT, listS(PROGN, list(CSETQ, fht, list(CREATE_FILE_HASH_TABLE, filename, expected_items, average_size, test_fn, serialization_fn)), append(body, NIL)), list(PWHEN, list(FILE_HASH_TABLE_P, fht), list(FINALIZE_FILE_HASH_TABLE, fht))));
    }

    /**
     * Open a FAST-CREATE file-hashtable and bind the handle to the FAST-FHT variable.
     *
     * @unknown Keep in mind that the fast create file-hashtable and the regular file hashtable do NOT support
    the same API; the FAST-CREATE file hashtable conceputally only supports a restricted set of the API calls,
    which is currently modeled by these calls having different names altogether.
     */
    @LispMethod(comment = "Open a FAST-CREATE file-hashtable and bind the handle to the FAST-FHT variable.\r\n\r\n@unknown Keep in mind that the fast create file-hashtable and the regular file hashtable do NOT support\r\nthe same API; the FAST-CREATE file hashtable conceputally only supports a restricted set of the API calls,\r\nwhich is currently modeled by these calls having different names altogether.")
    public static final SubLObject with_fast_create_file_hash_table_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt449);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject fast_fht = NIL;
                    SubLObject filename = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt449);
                    fast_fht = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt449);
                    filename = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_19 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt449);
                            current_19 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt449);
                            if (NIL == member(current_19, $list_alt450, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_19 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt449);
                        }
                        {
                            SubLObject tempdir_tail = property_list_member($TEMPDIR, current);
                            SubLObject tempdir = (NIL != tempdir_tail) ? ((SubLObject) (cadr(tempdir_tail))) : temp_directory();
                            SubLObject test_fn_tail = property_list_member($TEST_FN, current);
                            SubLObject test_fn = (NIL != test_fn_tail) ? ((SubLObject) (cadr(test_fn_tail))) : $default_fht_test_function$;
                            SubLObject serialization_fn_tail = property_list_member($SERIALIZATION_FN, current);
                            SubLObject serialization_fn = (NIL != serialization_fn_tail) ? ((SubLObject) (cadr(serialization_fn_tail))) : $default_fht_serialization_protocol$.getGlobalValue();
                            SubLObject keep_temporary_keyfile_tail = property_list_member($KEEP_TEMPORARY_KEYFILE, current);
                            SubLObject keep_temporary_keyfile = (NIL != keep_temporary_keyfile_tail) ? ((SubLObject) (cadr(keep_temporary_keyfile_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                return list(CLET, list(fast_fht), list(CUNWIND_PROTECT, listS(PROGN, list(CSETQ, fast_fht, list(FAST_CREATE_FILE_HASH_TABLE, filename, tempdir, test_fn, serialization_fn)), append(body, NIL)), list(PWHEN, list(FAST_CREATE_FHT_P, fast_fht), list(FINALIZE_FAST_CREATE_FILE_HASH_TABLE, fast_fht, keep_temporary_keyfile))));
                            }
                        }
                    }
                }
            }
        }
    }

    @LispMethod(comment = "Open a FAST-CREATE file-hashtable and bind the handle to the FAST-FHT variable.\r\n\r\n@unknown Keep in mind that the fast create file-hashtable and the regular file hashtable do NOT support\r\nthe same API; the FAST-CREATE file hashtable conceputally only supports a restricted set of the API calls,\r\nwhich is currently modeled by these calls having different names altogether.")
    public static SubLObject with_fast_create_file_hash_table(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list510);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject fast_fht = NIL;
        SubLObject filename = NIL;
        destructuring_bind_must_consp(current, datum, $list510);
        fast_fht = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list510);
        filename = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$38 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list510);
            current_$38 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list510);
            if (NIL == member(current_$38, $list511, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$38 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list510);
        }
        final SubLObject tempdir_tail = property_list_member($TEMPDIR, current);
        final SubLObject tempdir = (NIL != tempdir_tail) ? cadr(tempdir_tail) : file_utilities.temp_directory();
        final SubLObject test_fn_tail = property_list_member($TEST_FN, current);
        final SubLObject test_fn = (NIL != test_fn_tail) ? cadr(test_fn_tail) : $default_fht_test_function$;
        final SubLObject serialization_fn_tail = property_list_member($SERIALIZATION_FN, current);
        final SubLObject serialization_fn = (NIL != serialization_fn_tail) ? cadr(serialization_fn_tail) : $default_fht_serialization_protocol$.getGlobalValue();
        final SubLObject keep_temporary_keyfile_tail = property_list_member($KEEP_TEMPORARY_KEYFILE, current);
        final SubLObject keep_temporary_keyfile = (NIL != keep_temporary_keyfile_tail) ? cadr(keep_temporary_keyfile_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return list(CLET, list(fast_fht), list(CUNWIND_PROTECT, listS(PROGN, list(CSETQ, fast_fht, list(FAST_CREATE_FILE_HASH_TABLE, filename, tempdir, test_fn, serialization_fn)), append(body, NIL)), list(PWHEN, list(FAST_CREATE_FHT_P, fast_fht), list(FINALIZE_FAST_CREATE_FILE_HASH_TABLE, fast_fht, keep_temporary_keyfile))));
    }

    public static final SubLObject test_fast_fht_creation_with_merge_sorted_keystream_alt(SubLObject items, SubLObject tile_size_pow2, SubLObject optimization) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = $fast_file_hash_table_optimization_mode$.currentBinding(thread);
                try {
                    $fast_file_hash_table_optimization_mode$.bind(optimization, thread);
                    {
                        SubLObject map = make_hash_table(items, EQUAL, UNPROVIDED);
                        SubLObject i = NIL;
                        for (i = ZERO_INTEGER; i.numL(items); i = add(i, ONE_INTEGER)) {
                            map_utilities.map_put(map, string_utilities.to_string(i), cconcatenate($str_alt457$My_String_, format_nil.format_nil_a_no_copy(i)));
                        }
                        {
                            SubLObject fht_name = make_prefixed_temp_filename($str_alt458$fht_, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_20 = $fast_fht_keystream_tile_size_pow2$.currentBinding(thread);
                                try {
                                    $fast_fht_keystream_tile_size_pow2$.bind(tile_size_pow2, thread);
                                    {
                                        SubLObject fast_fht = fast_create_file_hash_table(fht_name, temp_directory(), EQUAL, $IMAGE_DEPENDENT_CFASL);
                                        SubLObject the_map = map;
                                        SubLObject mess = $str_alt459$Writing_out_FHT_____;
                                        SubLObject sofar = ZERO_INTEGER;
                                        SubLObject total = map_utilities.map_size(the_map);
                                        SubLTrampolineFile.checkType(mess, STRINGP);
                                        {
                                            SubLObject _prev_bind_0_21 = $last_percent_progress_index$.currentBinding(thread);
                                            SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                                            SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                                            SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                                            try {
                                                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                                $last_percent_progress_prediction$.bind(NIL, thread);
                                                $within_noting_percent_progress$.bind(T, thread);
                                                $percent_progress_start_time$.bind(get_universal_time(), thread);
                                                noting_percent_progress_preamble(mess);
                                                {
                                                    SubLObject iterator = map_utilities.new_map_iterator(the_map);
                                                    SubLObject done_var = NIL;
                                                    while (NIL == done_var) {
                                                        thread.resetMultipleValues();
                                                        {
                                                            SubLObject var = iteration.iteration_next(iterator);
                                                            SubLObject valid = thread.secondMultipleValue();
                                                            thread.resetMultipleValues();
                                                            if (NIL != valid) {
                                                                {
                                                                    SubLObject datum = var;
                                                                    SubLObject current = datum;
                                                                    SubLObject key = NIL;
                                                                    SubLObject values = NIL;
                                                                    destructuring_bind_must_consp(current, datum, $list_alt460);
                                                                    key = current.first();
                                                                    current = current.rest();
                                                                    destructuring_bind_must_consp(current, datum, $list_alt460);
                                                                    values = current.first();
                                                                    current = current.rest();
                                                                    if (NIL == current) {
                                                                        note_percent_progress(sofar, total);
                                                                        sofar = add(sofar, ONE_INTEGER);
                                                                        fast_put_file_hash_table(key, fast_fht, values);
                                                                    } else {
                                                                        cdestructuring_bind_error(datum, $list_alt460);
                                                                    }
                                                                }
                                                            }
                                                            done_var = makeBoolean(NIL == valid);
                                                        }
                                                    } 
                                                }
                                                noting_percent_progress_postamble();
                                            } finally {
                                                $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                                $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                                $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                                                $last_percent_progress_index$.rebind(_prev_bind_0_21, thread);
                                            }
                                        }
                                        finalize_fast_create_file_hash_table(fast_fht, UNPROVIDED, UNPROVIDED);
                                    }
                                } finally {
                                    $fast_fht_keystream_tile_size_pow2$.rebind(_prev_bind_0_20, thread);
                                }
                            }
                            {
                                SubLObject fht = open_file_hash_table_read_only(fht_name, EQUAL, $IMAGE_DEPENDENT_CFASL);
                                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                    if (!map_utilities.map_size(map).numE(file_hash_table_count(fht))) {
                                        Errors.error($str_alt461$Error__expected__A_items__got__A_, map_utilities.map_size(map), file_hash_table_count(fht));
                                    }
                                }
                                {
                                    SubLObject the_map = map;
                                    SubLObject mess = $str_alt462$Checking_against_FHT_____;
                                    SubLObject sofar = ZERO_INTEGER;
                                    SubLObject total = map_utilities.map_size(the_map);
                                    SubLTrampolineFile.checkType(mess, STRINGP);
                                    {
                                        SubLObject _prev_bind_0_22 = $last_percent_progress_index$.currentBinding(thread);
                                        SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                                        SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                                        SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                                        try {
                                            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                            $last_percent_progress_prediction$.bind(NIL, thread);
                                            $within_noting_percent_progress$.bind(T, thread);
                                            $percent_progress_start_time$.bind(get_universal_time(), thread);
                                            noting_percent_progress_preamble(mess);
                                            {
                                                SubLObject iterator = map_utilities.new_map_iterator(the_map);
                                                SubLObject done_var = NIL;
                                                while (NIL == done_var) {
                                                    thread.resetMultipleValues();
                                                    {
                                                        SubLObject var = iteration.iteration_next(iterator);
                                                        SubLObject valid = thread.secondMultipleValue();
                                                        thread.resetMultipleValues();
                                                        if (NIL != valid) {
                                                            {
                                                                SubLObject datum = var;
                                                                SubLObject current = datum;
                                                                SubLObject key = NIL;
                                                                SubLObject values = NIL;
                                                                destructuring_bind_must_consp(current, datum, $list_alt460);
                                                                key = current.first();
                                                                current = current.rest();
                                                                destructuring_bind_must_consp(current, datum, $list_alt460);
                                                                values = current.first();
                                                                current = current.rest();
                                                                if (NIL == current) {
                                                                    note_percent_progress(sofar, total);
                                                                    sofar = add(sofar, ONE_INTEGER);
                                                                    {
                                                                        SubLObject fht_values = get_file_hash_table(key, fht, $NOT_FOUND);
                                                                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                                                            if (!values.equal(fht_values)) {
                                                                                Errors.error($str_alt463$For__A__expected__A__got__A_inste, key, values, fht_values);
                                                                            }
                                                                        }
                                                                    }
                                                                } else {
                                                                    cdestructuring_bind_error(datum, $list_alt460);
                                                                }
                                                            }
                                                        }
                                                        done_var = makeBoolean(NIL == valid);
                                                    }
                                                } 
                                            }
                                            noting_percent_progress_postamble();
                                        } finally {
                                            $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                            $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                            $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                                            $last_percent_progress_index$.rebind(_prev_bind_0_22, thread);
                                        }
                                    }
                                }
                                {
                                    SubLObject table_var = fht;
                                    $progress_note$.setDynamicValue($str_alt464$Checking_aggressively_built_FHT_a, thread);
                                    $progress_start_time$.setDynamicValue(get_universal_time(), thread);
                                    $progress_total$.setDynamicValue(file_hash_table_count(table_var), thread);
                                    $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                                    {
                                        SubLObject _prev_bind_0_23 = $last_percent_progress_index$.currentBinding(thread);
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
                                                while (NIL == completeP) {
                                                    thread.resetMultipleValues();
                                                    {
                                                        SubLObject the_key = get_file_hash_table_any(table_var, continuation, NIL);
                                                        SubLObject the_value = thread.secondMultipleValue();
                                                        SubLObject next = thread.thirdMultipleValue();
                                                        thread.resetMultipleValues();
                                                        if (NIL != next) {
                                                            {
                                                                SubLObject key = the_key;
                                                                SubLObject values = the_value;
                                                                note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                                                $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                                                {
                                                                    SubLObject map_values = map_utilities.map_get(map, key, $NOT_FOUND);
                                                                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                                                        if (!values.equal(map_values)) {
                                                                            Errors.error($str_alt465$For__A__epxected__A__got__A_inste, key, values, map_values);
                                                                        }
                                                                    }
                                                                }
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
                                            $last_percent_progress_index$.rebind(_prev_bind_0_23, thread);
                                        }
                                    }
                                }
                                finalize_file_hash_table(fht);
                            }
                            {
                                SubLObject ignore_errors_tag = NIL;
                                try {
                                    {
                                        SubLObject _prev_bind_0_24 = Errors.$error_handler$.currentBinding(thread);
                                        try {
                                            Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                                            try {
                                                Filesys.delete_file(fht_name);
                                            } catch (Throwable catch_var) {
                                                Errors.handleThrowable(catch_var, NIL);
                                            }
                                        } finally {
                                            Errors.$error_handler$.rebind(_prev_bind_0_24, thread);
                                        }
                                    }
                                } catch (Throwable ccatch_env_var) {
                                    ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
                                }
                            }
                        }
                    }
                } finally {
                    $fast_file_hash_table_optimization_mode$.rebind(_prev_bind_0, thread);
                }
            }
            return $SUCCESS;
        }
    }

    public static SubLObject test_fast_fht_creation_with_merge_sorted_keystream(final SubLObject items, final SubLObject tile_size_pow2, final SubLObject optimization) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = $fast_file_hash_table_optimization_mode$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $fast_fht_keystream_tile_size_pow2$.currentBinding(thread);
        try {
            $fast_file_hash_table_optimization_mode$.bind(optimization, thread);
            $fast_fht_keystream_tile_size_pow2$.bind(tile_size_pow2, thread);
            final SubLObject map = make_hash_table(items, EQUAL, UNPROVIDED);
            SubLObject i;
            for (i = NIL, i = ZERO_INTEGER; i.numL(items); i = add(i, ONE_INTEGER)) {
                map_utilities.map_put(map, string_utilities.to_string(i), cconcatenate($$$My_String_, format_nil.format_nil_a_no_copy(i)));
            }
            final SubLObject fht_name = test_fast_fht_creation_with_map_contents(map, UNPROVIDED, UNPROVIDED);
            SubLObject ignore_errors_tag = NIL;
            try {
                thread.throwStack.push($IGNORE_ERRORS_TARGET);
                final SubLObject _prev_bind_0_$39 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                    try {
                        Filesys.delete_file(fht_name);
                    } catch (final Throwable catch_var) {
                        Errors.handleThrowable(catch_var, NIL);
                    }
                } finally {
                    Errors.$error_handler$.rebind(_prev_bind_0_$39, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
            } finally {
                thread.throwStack.pop();
            }
        } finally {
            $fast_fht_keystream_tile_size_pow2$.rebind(_prev_bind_2, thread);
            $fast_file_hash_table_optimization_mode$.rebind(_prev_bind_0, thread);
        }
        return $SUCCESS;
    }

    public static SubLObject test_fast_fht_creation_with_map_contents(final SubLObject map, SubLObject serialization, SubLObject value_test) {
        if (serialization == UNPROVIDED) {
            serialization = $IMAGE_DEPENDENT_CFASL;
        }
        if (value_test == UNPROVIDED) {
            value_test = $UNPROVIDED;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject test = map_utilities.map_test(map);
        final SubLObject fht_name = file_utilities.make_prefixed_temp_filename($str521$fht_, UNPROVIDED);
        if (!value_test.isFunctionSpec()) {
            value_test = test;
        }
        final SubLObject fast_fht = fast_create_file_hash_table(fht_name, file_utilities.temp_directory(), test, serialization);
        final SubLObject mess = $str522$Writing_out_FHT_____;
        SubLObject sofar = ZERO_INTEGER;
        final SubLObject total = map_utilities.map_size(map);
        assert NIL != stringp(mess) : "! stringp(mess) " + ("Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) ") + mess;
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
                noting_percent_progress_preamble(mess);
                final SubLObject iterator = map_utilities.new_map_iterator(map);
                SubLObject valid;
                for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
                    thread.resetMultipleValues();
                    final SubLObject var = iteration.iteration_next(iterator);
                    valid = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != valid) {
                        SubLObject current;
                        final SubLObject datum = current = var;
                        SubLObject key = NIL;
                        SubLObject values = NIL;
                        destructuring_bind_must_consp(current, datum, $list523);
                        key = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list523);
                        values = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            note_percent_progress(sofar, total);
                            sofar = add(sofar, ONE_INTEGER);
                            fast_put_file_hash_table(key, fast_fht, values);
                        } else {
                            cdestructuring_bind_error(datum, $list523);
                        }
                    }
                }
            } finally {
                final SubLObject _prev_bind_0_$40 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$40, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        finalize_fast_create_file_hash_table(fast_fht, UNPROVIDED, UNPROVIDED);
        SubLObject not_found;
        SubLObject fht = not_found = open_file_hash_table_read_only(fht_name, test, serialization);
        SubLObject checked = ZERO_INTEGER;
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!map_utilities.map_size(map).numE(file_hash_table_count(fht)))) {
            Errors.error($str524$Error__expected__A_items__got__A_, map_utilities.map_size(map), file_hash_table_count(fht));
        }
        final SubLObject mess2 = $str525$Checking_map_against_FHT_____;
        SubLObject sofar2 = ZERO_INTEGER;
        final SubLObject total2 = map_utilities.map_size(map);
        assert NIL != stringp(mess2) : "! stringp(mess2) " + ("Types.stringp(mess2) " + "CommonSymbols.NIL != Types.stringp(mess2) ") + mess2;
        final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble(mess2);
                final SubLObject iterator2 = map_utilities.new_map_iterator(map);
                SubLObject valid2;
                for (SubLObject done_var2 = NIL; NIL == done_var2; done_var2 = makeBoolean(NIL == valid2)) {
                    thread.resetMultipleValues();
                    final SubLObject var2 = iteration.iteration_next(iterator2);
                    valid2 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != valid2) {
                        SubLObject current2;
                        final SubLObject datum2 = current2 = var2;
                        SubLObject key2 = NIL;
                        SubLObject values2 = NIL;
                        destructuring_bind_must_consp(current2, datum2, $list523);
                        key2 = current2.first();
                        current2 = current2.rest();
                        destructuring_bind_must_consp(current2, datum2, $list523);
                        values2 = current2.first();
                        current2 = current2.rest();
                        if (NIL == current2) {
                            note_percent_progress(sofar2, total2);
                            sofar2 = add(sofar2, ONE_INTEGER);
                            final SubLObject fht_values = get_file_hash_table(key2, fht, not_found);
                            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == funcall(value_test, values2, fht_values))) {
                                Errors.error($str526$For__S__expected__S__got__S_inste, key2, values2, fht_values);
                            }
                            checked = add(checked, ONE_INTEGER);
                        } else {
                            cdestructuring_bind_error(datum2, $list523);
                        }
                    }
                }
            } finally {
                final SubLObject _prev_bind_0_$41 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$41, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_8, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
            $last_percent_progress_index$.rebind(_prev_bind_5, thread);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!checked.numE(map_utilities.map_size(map)))) {
            Errors.error($str527$We_checked__A_of__A_entries_, checked, map_utilities.map_size(map));
        }
        finalize_file_hash_table(fht);
        fht = not_found = open_file_hash_table_read_only(fht_name, test, serialization);
        checked = ZERO_INTEGER;
        final SubLObject table_var = fht;
        $progress_note$.setDynamicValue($str528$Checking_FHT_against_map____, thread);
        $progress_start_time$.setDynamicValue(get_universal_time(), thread);
        $progress_total$.setDynamicValue(file_hash_table_count(table_var), thread);
        $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
        final SubLObject _prev_bind_9 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_10 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_11 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_12 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                SubLObject continuation = NIL;
                SubLObject next;
                for (SubLObject completeP = NIL; NIL == completeP; completeP = sublisp_null(next)) {
                    thread.resetMultipleValues();
                    final SubLObject the_key = get_file_hash_table_any(table_var, continuation, NIL);
                    final SubLObject the_value = thread.secondMultipleValue();
                    next = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != next) {
                        final SubLObject key3 = the_key;
                        final SubLObject values3 = the_value;
                        note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                        $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                        final SubLObject map_values = map_utilities.map_get(map, key3, not_found);
                        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == funcall(value_test, values3, map_values))) {
                            Errors.error($str529$For__S__epxected__S__got__S_inste, key3, values3, map_values);
                        }
                        checked = add(checked, ONE_INTEGER);
                    }
                    continuation = next;
                }
            } finally {
                final SubLObject _prev_bind_0_$42 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values3 = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values3);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$42, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_12, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_11, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_10, thread);
            $last_percent_progress_index$.rebind(_prev_bind_9, thread);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!checked.numE(map_utilities.map_size(map)))) {
            Errors.error($str527$We_checked__A_of__A_entries_, checked, map_utilities.map_size(map));
        }
        finalize_file_hash_table(fht);
        return fht_name;
    }

    public static SubLObject test_fast_fht_with_kb_contents(final SubLObject count, final SubLObject generator, final SubLObject key_property_fn, final SubLObject value_property_fn, SubLObject test, SubLObject value_test, SubLObject serialization) {
        if (test == UNPROVIDED) {
            test = EQL;
        }
        if (value_test == UNPROVIDED) {
            value_test = EQUALP;
        }
        if (serialization == UNPROVIDED) {
            serialization = $IMAGE_DEPENDENT_CFASL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = $test_fast_fht_generator_state$.currentBinding(thread);
        try {
            $test_fast_fht_generator_state$.bind(NIL, thread);
            final SubLObject map = make_hash_table(count, test, UNPROVIDED);
            SubLObject i;
            SubLObject item;
            SubLObject key;
            SubLObject value;
            for (i = NIL, i = ZERO_INTEGER; i.numL(count); i = add(i, ONE_INTEGER)) {
                item = funcall(generator);
                key = funcall(key_property_fn, item);
                value = funcall(value_property_fn, item);
                map_utilities.map_put(map, key, value);
            }
            final SubLObject filename = test_fast_fht_creation_with_map_contents(map, serialization, value_test);
            SubLObject ignore_errors_tag = NIL;
            try {
                thread.throwStack.push($IGNORE_ERRORS_TARGET);
                final SubLObject _prev_bind_0_$43 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                    try {
                        Filesys.delete_file(filename);
                    } catch (final Throwable catch_var) {
                        Errors.handleThrowable(catch_var, NIL);
                    }
                } finally {
                    Errors.$error_handler$.rebind(_prev_bind_0_$43, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
            } finally {
                thread.throwStack.pop();
            }
        } finally {
            $test_fast_fht_generator_state$.rebind(_prev_bind_0, thread);
        }
        return $SUCCESS;
    }

    public static SubLObject test_ffhtkb_generate_constant_info() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == $test_fast_fht_generator_state$.getDynamicValue(thread)) {
            final SubLObject v_term = constants_high.random_constant(UNPROVIDED);
            final SubLObject suid = constant_suid(v_term);
            final SubLObject guid = constants_high.constant_guid(v_term);
            final SubLObject name = constants_high.constant_name(v_term);
            $test_fast_fht_generator_state$.setDynamicValue(list(list($KEY, cons(CHAR_I, suid), $VALUE, guid), list($KEY, cons(CHAR_G, guid), $VALUE, suid), list($KEY, cons(CHAR_T, name), $VALUE, suid), list($KEY, cons(CHAR_S, suid), $VALUE, name)), thread);
        }
        return $test_fast_fht_generator_state$.getDynamicValue(thread);
    }

    public static SubLObject test_ffhtkb_grab_constant_key_info(final SubLObject state) {
        final SubLObject curr_state = state.first();
        return getf(curr_state, $KEY, UNPROVIDED);
    }

    public static SubLObject test_ffhtkb_grab_constant_value_info(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject curr_state = state.first();
        final SubLObject value = getf(curr_state, $VALUE, UNPROVIDED);
        $test_fast_fht_generator_state$.setDynamicValue($test_fast_fht_generator_state$.getDynamicValue(thread).rest(), thread);
        return value;
    }

    public static final SubLObject declare_file_hash_table_file_alt() {
        declareFunction("file_hash_table_print_function_trampoline", "FILE-HASH-TABLE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("file_hash_table_p", "FILE-HASH-TABLE-P", 1, 0, false);
        new com.cyc.cycjava.cycl.file_hash_table.$file_hash_table_p$UnaryFunction();
        declareFunction("file_hash_table_stream", "FILE-HASH-TABLE-STREAM", 1, 0, false);
        declareFunction("file_hash_table_header", "FILE-HASH-TABLE-HEADER", 1, 0, false);
        declareFunction("file_hash_table_lock", "FILE-HASH-TABLE-LOCK", 1, 0, false);
        declareFunction("file_hash_table_encoding_input_fn", "FILE-HASH-TABLE-ENCODING-INPUT-FN", 1, 0, false);
        declareFunction("file_hash_table_encoding_output_fn", "FILE-HASH-TABLE-ENCODING-OUTPUT-FN", 1, 0, false);
        declareFunction("file_hash_table_encoding_size_fn", "FILE-HASH-TABLE-ENCODING-SIZE-FN", 1, 0, false);
        declareFunction("file_hash_table_encoding_key_input_fn", "FILE-HASH-TABLE-ENCODING-KEY-INPUT-FN", 1, 0, false);
        declareFunction("file_hash_table_encoding_key_output_fn", "FILE-HASH-TABLE-ENCODING-KEY-OUTPUT-FN", 1, 0, false);
        declareFunction("file_hash_table_testfn", "FILE-HASH-TABLE-TESTFN", 1, 0, false);
        declareFunction("file_hash_table_hash_fn", "FILE-HASH-TABLE-HASH-FN", 1, 0, false);
        declareFunction("file_hash_table_input_cache", "FILE-HASH-TABLE-INPUT-CACHE", 1, 0, false);
        declareFunction("file_hash_table_output_cache", "FILE-HASH-TABLE-OUTPUT-CACHE", 1, 0, false);
        declareFunction("file_hash_table_property_list", "FILE-HASH-TABLE-PROPERTY-LIST", 1, 0, false);
        declareFunction("_csetf_file_hash_table_stream", "_CSETF-FILE-HASH-TABLE-STREAM", 2, 0, false);
        declareFunction("_csetf_file_hash_table_header", "_CSETF-FILE-HASH-TABLE-HEADER", 2, 0, false);
        declareFunction("_csetf_file_hash_table_lock", "_CSETF-FILE-HASH-TABLE-LOCK", 2, 0, false);
        declareFunction("_csetf_file_hash_table_encoding_input_fn", "_CSETF-FILE-HASH-TABLE-ENCODING-INPUT-FN", 2, 0, false);
        declareFunction("_csetf_file_hash_table_encoding_output_fn", "_CSETF-FILE-HASH-TABLE-ENCODING-OUTPUT-FN", 2, 0, false);
        declareFunction("_csetf_file_hash_table_encoding_size_fn", "_CSETF-FILE-HASH-TABLE-ENCODING-SIZE-FN", 2, 0, false);
        declareFunction("_csetf_file_hash_table_encoding_key_input_fn", "_CSETF-FILE-HASH-TABLE-ENCODING-KEY-INPUT-FN", 2, 0, false);
        declareFunction("_csetf_file_hash_table_encoding_key_output_fn", "_CSETF-FILE-HASH-TABLE-ENCODING-KEY-OUTPUT-FN", 2, 0, false);
        declareFunction("_csetf_file_hash_table_testfn", "_CSETF-FILE-HASH-TABLE-TESTFN", 2, 0, false);
        declareFunction("_csetf_file_hash_table_hash_fn", "_CSETF-FILE-HASH-TABLE-HASH-FN", 2, 0, false);
        declareFunction("_csetf_file_hash_table_input_cache", "_CSETF-FILE-HASH-TABLE-INPUT-CACHE", 2, 0, false);
        declareFunction("_csetf_file_hash_table_output_cache", "_CSETF-FILE-HASH-TABLE-OUTPUT-CACHE", 2, 0, false);
        declareFunction("_csetf_file_hash_table_property_list", "_CSETF-FILE-HASH-TABLE-PROPERTY-LIST", 2, 0, false);
        declareFunction("make_file_hash_table", "MAKE-FILE-HASH-TABLE", 0, 1, false);
        declareFunction("describe_file_hash_table", "DESCRIBE-FILE-HASH-TABLE", 1, 1, false);
        declareFunction("read_only_file_hash_table_p", "READ-ONLY-FILE-HASH-TABLE-P", 1, 0, false);
        declareFunction("writeable_file_hash_table_p", "WRITEABLE-FILE-HASH-TABLE-P", 1, 0, false);
        declareFunction("file_hash_table_is_read_onlyP", "FILE-HASH-TABLE-IS-READ-ONLY?", 1, 0, false);
        declareFunction("file_hash_table_path", "FILE-HASH-TABLE-PATH", 1, 0, false);
        declareFunction("file_hash_table_serialization", "FILE-HASH-TABLE-SERIALIZATION", 1, 0, false);
        declareFunction("htfile_header_print_function_trampoline", "HTFILE-HEADER-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("htfile_header_p", "HTFILE-HEADER-P", 1, 0, false);
        new com.cyc.cycjava.cycl.file_hash_table.$htfile_header_p$UnaryFunction();
        declareFunction("htfile_header_size", "HTFILE-HEADER-SIZE", 1, 0, false);
        declareFunction("htfile_header_version_major", "HTFILE-HEADER-VERSION-MAJOR", 1, 0, false);
        declareFunction("htfile_header_version_minor", "HTFILE-HEADER-VERSION-MINOR", 1, 0, false);
        declareFunction("htfile_header_object_space_offset", "HTFILE-HEADER-OBJECT-SPACE-OFFSET", 1, 0, false);
        declareFunction("htfile_header_key_space_offset", "HTFILE-HEADER-KEY-SPACE-OFFSET", 1, 0, false);
        declareFunction("htfile_header_current_heap_top", "HTFILE-HEADER-CURRENT-HEAP-TOP", 1, 0, false);
        declareFunction("htfile_header_item_count", "HTFILE-HEADER-ITEM-COUNT", 1, 0, false);
        declareFunction("htfile_header_capacity", "HTFILE-HEADER-CAPACITY", 1, 0, false);
        declareFunction("htfile_header_free_list_head", "HTFILE-HEADER-FREE-LIST-HEAD", 1, 0, false);
        declareFunction("htfile_header_deletion_count", "HTFILE-HEADER-DELETION-COUNT", 1, 0, false);
        declareFunction("htfile_header_header_crc", "HTFILE-HEADER-HEADER-CRC", 1, 0, false);
        declareFunction("htfile_header_extension_space_size", "HTFILE-HEADER-EXTENSION-SPACE-SIZE", 1, 0, false);
        declareFunction("htfile_header_extension_space", "HTFILE-HEADER-EXTENSION-SPACE", 1, 0, false);
        declareFunction("_csetf_htfile_header_size", "_CSETF-HTFILE-HEADER-SIZE", 2, 0, false);
        declareFunction("_csetf_htfile_header_version_major", "_CSETF-HTFILE-HEADER-VERSION-MAJOR", 2, 0, false);
        declareFunction("_csetf_htfile_header_version_minor", "_CSETF-HTFILE-HEADER-VERSION-MINOR", 2, 0, false);
        declareFunction("_csetf_htfile_header_object_space_offset", "_CSETF-HTFILE-HEADER-OBJECT-SPACE-OFFSET", 2, 0, false);
        declareFunction("_csetf_htfile_header_key_space_offset", "_CSETF-HTFILE-HEADER-KEY-SPACE-OFFSET", 2, 0, false);
        declareFunction("_csetf_htfile_header_current_heap_top", "_CSETF-HTFILE-HEADER-CURRENT-HEAP-TOP", 2, 0, false);
        declareFunction("_csetf_htfile_header_item_count", "_CSETF-HTFILE-HEADER-ITEM-COUNT", 2, 0, false);
        declareFunction("_csetf_htfile_header_capacity", "_CSETF-HTFILE-HEADER-CAPACITY", 2, 0, false);
        declareFunction("_csetf_htfile_header_free_list_head", "_CSETF-HTFILE-HEADER-FREE-LIST-HEAD", 2, 0, false);
        declareFunction("_csetf_htfile_header_deletion_count", "_CSETF-HTFILE-HEADER-DELETION-COUNT", 2, 0, false);
        declareFunction("_csetf_htfile_header_header_crc", "_CSETF-HTFILE-HEADER-HEADER-CRC", 2, 0, false);
        declareFunction("_csetf_htfile_header_extension_space_size", "_CSETF-HTFILE-HEADER-EXTENSION-SPACE-SIZE", 2, 0, false);
        declareFunction("_csetf_htfile_header_extension_space", "_CSETF-HTFILE-HEADER-EXTENSION-SPACE", 2, 0, false);
        declareFunction("make_htfile_header", "MAKE-HTFILE-HEADER", 0, 1, false);
        declareFunction("describe_htfile_header", "DESCRIBE-HTFILE-HEADER", 1, 1, false);
        declareFunction("htfile_object_entry_print_function_trampoline", "HTFILE-OBJECT-ENTRY-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("htfile_object_entry_p", "HTFILE-OBJECT-ENTRY-P", 1, 0, false);
        new com.cyc.cycjava.cycl.file_hash_table.$htfile_object_entry_p$UnaryFunction();
        declareFunction("htfile_object_entry_size", "HTFILE-OBJECT-ENTRY-SIZE", 1, 0, false);
        declareFunction("htfile_object_entry_type", "HTFILE-OBJECT-ENTRY-TYPE", 1, 0, false);
        declareFunction("htfile_object_entry_key_size", "HTFILE-OBJECT-ENTRY-KEY-SIZE", 1, 0, false);
        declareFunction("htfile_object_entry_key", "HTFILE-OBJECT-ENTRY-KEY", 1, 0, false);
        declareFunction("htfile_object_entry_data_size", "HTFILE-OBJECT-ENTRY-DATA-SIZE", 1, 0, false);
        declareFunction("htfile_object_entry_data", "HTFILE-OBJECT-ENTRY-DATA", 1, 0, false);
        declareFunction("_csetf_htfile_object_entry_size", "_CSETF-HTFILE-OBJECT-ENTRY-SIZE", 2, 0, false);
        declareFunction("_csetf_htfile_object_entry_type", "_CSETF-HTFILE-OBJECT-ENTRY-TYPE", 2, 0, false);
        declareFunction("_csetf_htfile_object_entry_key_size", "_CSETF-HTFILE-OBJECT-ENTRY-KEY-SIZE", 2, 0, false);
        declareFunction("_csetf_htfile_object_entry_key", "_CSETF-HTFILE-OBJECT-ENTRY-KEY", 2, 0, false);
        declareFunction("_csetf_htfile_object_entry_data_size", "_CSETF-HTFILE-OBJECT-ENTRY-DATA-SIZE", 2, 0, false);
        declareFunction("_csetf_htfile_object_entry_data", "_CSETF-HTFILE-OBJECT-ENTRY-DATA", 2, 0, false);
        declareFunction("make_htfile_object_entry", "MAKE-HTFILE-OBJECT-ENTRY", 0, 1, false);
        declareFunction("htfile_key_entry_print_function_trampoline", "HTFILE-KEY-ENTRY-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("htfile_key_entry_p", "HTFILE-KEY-ENTRY-P", 1, 0, false);
        new com.cyc.cycjava.cycl.file_hash_table.$htfile_key_entry_p$UnaryFunction();
        declareFunction("htfile_key_entry_key_offset", "HTFILE-KEY-ENTRY-KEY-OFFSET", 1, 0, false);
        declareFunction("htfile_key_entry_hash_code", "HTFILE-KEY-ENTRY-HASH-CODE", 1, 0, false);
        declareFunction("_csetf_htfile_key_entry_key_offset", "_CSETF-HTFILE-KEY-ENTRY-KEY-OFFSET", 2, 0, false);
        declareFunction("_csetf_htfile_key_entry_hash_code", "_CSETF-HTFILE-KEY-ENTRY-HASH-CODE", 2, 0, false);
        declareFunction("make_htfile_key_entry", "MAKE-HTFILE-KEY-ENTRY", 0, 1, false);
        declareFunction("get_default_fht_test_function", "GET-DEFAULT-FHT-TEST-FUNCTION", 0, 0, false);
        declareFunction("get_default_fht_serialization_protocol", "GET-DEFAULT-FHT-SERIALIZATION-PROTOCOL", 0, 0, false);
        declareFunction("new_htfile_header", "NEW-HTFILE-HEADER", 0, 0, false);
        declareFunction("construct_empty_htfile_header", "CONSTRUCT-EMPTY-HTFILE-HEADER", 1, 1, false);
        declareFunction("htfile_scale_user_space_to_implementation_space", "HTFILE-SCALE-USER-SPACE-TO-IMPLEMENTATION-SPACE", 1, 0, false);
        declareFunction("htfile_minimal_space_required", "HTFILE-MINIMAL-SPACE-REQUIRED", 0, 0, false);
        declareFunction("new_file_hash_table", "NEW-FILE-HASH-TABLE", 5, 3, false);
        declareFunction("new_empty_file_hash_table", "NEW-EMPTY-FILE-HASH-TABLE", 6, 4, false);
        declareFunction("new_htfile_key_entry", "NEW-HTFILE-KEY-ENTRY", 1, 1, false);
        declareFunction("construct_tombstone_key_entry", "CONSTRUCT-TOMBSTONE-KEY-ENTRY", 0, 0, false);
        declareFunction("is_tombstoned_key_entryP", "IS-TOMBSTONED-KEY-ENTRY?", 1, 0, false);
        declareFunction("construct_empty_key_entry", "CONSTRUCT-EMPTY-KEY-ENTRY", 0, 0, false);
        declareFunction("is_empty_key_entryP", "IS-EMPTY-KEY-ENTRY?", 1, 0, false);
        declareFunction("is_valid_key_entryP", "IS-VALID-KEY-ENTRY?", 2, 0, false);
        declareFunction("fht_sxhash_for_fht", "FHT-SXHASH-FOR-FHT", 2, 0, false);
        declareFunction("fht_sxhash", "FHT-SXHASH", 2, 0, false);
        declareFunction("valid_hash_code_p", "VALID-HASH-CODE-P", 1, 0, false);
        declareFunction("new_object_entry", "NEW-OBJECT-ENTRY", 2, 0, false);
        declareFunction("fht_serialization_entry_print_function_trampoline", "FHT-SERIALIZATION-ENTRY-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("fht_serialization_entry_p", "FHT-SERIALIZATION-ENTRY-P", 1, 0, false);
        new com.cyc.cycjava.cycl.file_hash_table.$fht_serialization_entry_p$UnaryFunction();
        declareFunction("fht_se_encoding_input_fn", "FHT-SE-ENCODING-INPUT-FN", 1, 0, false);
        declareFunction("fht_se_encoding_output_fn", "FHT-SE-ENCODING-OUTPUT-FN", 1, 0, false);
        declareFunction("fht_se_encoding_size_fn", "FHT-SE-ENCODING-SIZE-FN", 1, 0, false);
        declareFunction("fht_se_hash_fn", "FHT-SE-HASH-FN", 1, 0, false);
        declareFunction("fht_se_encoding_key_input_fn", "FHT-SE-ENCODING-KEY-INPUT-FN", 1, 0, false);
        declareFunction("fht_se_encoding_key_output_fn", "FHT-SE-ENCODING-KEY-OUTPUT-FN", 1, 0, false);
        declareFunction("_csetf_fht_se_encoding_input_fn", "_CSETF-FHT-SE-ENCODING-INPUT-FN", 2, 0, false);
        declareFunction("_csetf_fht_se_encoding_output_fn", "_CSETF-FHT-SE-ENCODING-OUTPUT-FN", 2, 0, false);
        declareFunction("_csetf_fht_se_encoding_size_fn", "_CSETF-FHT-SE-ENCODING-SIZE-FN", 2, 0, false);
        declareFunction("_csetf_fht_se_hash_fn", "_CSETF-FHT-SE-HASH-FN", 2, 0, false);
        declareFunction("_csetf_fht_se_encoding_key_input_fn", "_CSETF-FHT-SE-ENCODING-KEY-INPUT-FN", 2, 0, false);
        declareFunction("_csetf_fht_se_encoding_key_output_fn", "_CSETF-FHT-SE-ENCODING-KEY-OUTPUT-FN", 2, 0, false);
        declareFunction("make_fht_serialization_entry", "MAKE-FHT-SERIALIZATION-ENTRY", 0, 1, false);
        declareFunction("print_fht_serialization_entry", "PRINT-FHT-SERIALIZATION-ENTRY", 3, 0, false);
        declareFunction("new_fht_serialization_entry", "NEW-FHT-SERIALIZATION-ENTRY", 1, 0, false);
        declareFunction("register_fht_serialization_entry", "REGISTER-FHT-SERIALIZATION-ENTRY", 2, 0, false);
        declareFunction("fht_serialization_entry", "FHT-SERIALIZATION-ENTRY", 1, 0, false);
        declareFunction("fht_serialization_encoding_input_fn", "FHT-SERIALIZATION-ENCODING-INPUT-FN", 1, 0, false);
        declareFunction("fht_serialization_encoding_output_fn", "FHT-SERIALIZATION-ENCODING-OUTPUT-FN", 1, 0, false);
        declareFunction("fht_serialization_encoding_size_fn", "FHT-SERIALIZATION-ENCODING-SIZE-FN", 1, 0, false);
        declareFunction("fht_serialization_hash_fn", "FHT-SERIALIZATION-HASH-FN", 1, 0, false);
        declareFunction("fht_serialization_encoding_key_input_fn", "FHT-SERIALIZATION-ENCODING-KEY-INPUT-FN", 1, 0, false);
        declareFunction("fht_serialization_encoding_key_output_fn", "FHT-SERIALIZATION-ENCODING-KEY-OUTPUT-FN", 1, 0, false);
        declareMacro("do_fht_serializations", "DO-FHT-SERIALIZATIONS");
        declareFunction("find_fht_serialization_by_functions", "FIND-FHT-SERIALIZATION-BY-FUNCTIONS", 4, 2, false);
        declareFunction("create_file_hash_table", "CREATE-FILE-HASH-TABLE", 2, 3, false);
        declareFunction("open_file_hash_table", "OPEN-FILE-HASH-TABLE", 1, 2, false);
        declareFunction("open_file_hash_table_read_only", "OPEN-FILE-HASH-TABLE-READ-ONLY", 1, 2, false);
        declareFunction("file_hash_table_open_p", "FILE-HASH-TABLE-OPEN-P", 1, 0, false);
        declareFunction("finalize_file_hash_table", "FINALIZE-FILE-HASH-TABLE", 1, 0, false);
        declareFunction("file_hash_table_count", "FILE-HASH-TABLE-COUNT", 1, 0, false);
        declareFunction("file_hash_table_capacity", "FILE-HASH-TABLE-CAPACITY", 1, 0, false);
        declareFunction("put_file_hash_table", "PUT-FILE-HASH-TABLE", 3, 0, false);
        declareFunction("get_file_hash_table", "GET-FILE-HASH-TABLE", 2, 1, false);
        declareFunction("remove_file_hash_table", "REMOVE-FILE-HASH-TABLE", 2, 0, false);
        declareFunction("cinc_file_hash_table", "CINC-FILE-HASH-TABLE", 2, 2, false);
        declareMacro("dosome_file_hash_table", "DOSOME-FILE-HASH-TABLE");
        declareMacro("do_file_hash_table", "DO-FILE-HASH-TABLE");
        declareFunction("print_file_hash_table_contents", "PRINT-FILE-HASH-TABLE-CONTENTS", 1, 0, false);
        declareMacro("progress_do_file_hash_table", "PROGRESS-DO-FILE-HASH-TABLE");
        declareMacro("dosome_file_hash_table_keys", "DOSOME-FILE-HASH-TABLE-KEYS");
        declareMacro("do_file_hash_table_keys", "DO-FILE-HASH-TABLE-KEYS");
        declareMacro("progress_do_file_hash_table_keys", "PROGRESS-DO-FILE-HASH-TABLE-KEYS");
        declareFunction("file_hash_table_keys", "FILE-HASH-TABLE-KEYS", 1, 0, false);
        declareFunction("file_hash_table_random_n", "FILE-HASH-TABLE-RANDOM-N", 2, 1, false);
        declareFunction("validate_file_hash_table", "VALIDATE-FILE-HASH-TABLE", 1, 1, false);
        declareFunction("recover_file_hash_table_heap", "RECOVER-FILE-HASH-TABLE-HEAP", 1, 1, false);
        declareFunction("new_file_hash_table_iterator", "NEW-FILE-HASH-TABLE-ITERATOR", 1, 1, false);
        declareFunction("new_file_hash_table_keys_iterator", "NEW-FILE-HASH-TABLE-KEYS-ITERATOR", 1, 1, false);
        declareFunction("new_file_hash_table_values_iterator", "NEW-FILE-HASH-TABLE-VALUES-ITERATOR", 1, 1, false);
        declareFunction("iterate_file_hash_table_next_value", "ITERATE-FILE-HASH-TABLE-NEXT-VALUE", 1, 0, false);
        declareFunction("new_file_hash_table_iterator_internal", "NEW-FILE-HASH-TABLE-ITERATOR-INTERNAL", 3, 0, false);
        declareFunction("make_iterator_file_hash_table_state", "MAKE-ITERATOR-FILE-HASH-TABLE-STATE", 3, 0, false);
        declareFunction("iterate_file_hash_table_doneP", "ITERATE-FILE-HASH-TABLE-DONE?", 1, 0, false);
        declareFunction("iterate_file_hash_table_next", "ITERATE-FILE-HASH-TABLE-NEXT", 1, 0, false);
        declareFunction("make_fht_iterator_next", "MAKE-FHT-ITERATOR-NEXT", 3, 0, false);
        declareFunction("fht_iterator_next_value", "FHT-ITERATOR-NEXT-VALUE", 1, 0, false);
        declareFunction("file_hash_table_to_alist", "FILE-HASH-TABLE-TO-ALIST", 1, 0, false);
        declareFunction("hash_table_to_file_hash_table", "HASH-TABLE-TO-FILE-HASH-TABLE", 2, 4, false);
        declareFunction("alist_to_file_hash_table", "ALIST-TO-FILE-HASH-TABLE", 2, 3, false);
        declareFunction("file_hash_table_copy", "FILE-HASH-TABLE-COPY", 2, 5, false);
        declareFunction("get_file_hash_table_storage_resourcing", "GET-FILE-HASH-TABLE-STORAGE-RESOURCING", 1, 0, false);
        declareFunction("set_file_hash_table_storage_resourcing", "SET-FILE-HASH-TABLE-STORAGE-RESOURCING", 1, 1, false);
        declareFunction("file_hash_table_storage_resourcing_onP", "FILE-HASH-TABLE-STORAGE-RESOURCING-ON?", 1, 0, false);
        declareFunction("compute_fht_cache_capacity", "COMPUTE-FHT-CACHE-CAPACITY", 1, 0, false);
        declareFunction("allocate_file_hash_table_caches", "ALLOCATE-FILE-HASH-TABLE-CACHES", 2, 0, false);
        declareFunction("put_fht_lookaside_cache", "PUT-FHT-LOOKASIDE-CACHE", 3, 0, false);
        declareFunction("get_fht_lookaside_cache", "GET-FHT-LOOKASIDE-CACHE", 2, 0, false);
        declareFunction("remove_fht_lookaside_cache", "REMOVE-FHT-LOOKASIDE-CACHE", 2, 0, false);
        declareFunction("get_file_hash_table_any", "GET-FILE-HASH-TABLE-ANY", 1, 2, false);
        declareFunction("perform_fht_put", "PERFORM-FHT-PUT", 3, 0, false);
        declareFunction("perform_fht_put_insert", "PERFORM-FHT-PUT-INSERT", 6, 1, false);
        declareFunction("perform_fht_put_replace", "PERFORM-FHT-PUT-REPLACE", 6, 0, false);
        declareFunction("perform_fht_remove", "PERFORM-FHT-REMOVE", 2, 0, false);
        declareFunction("perform_fht_remove_int", "PERFORM-FHT-REMOVE-INT", 4, 0, false);
        declareFunction("clear_fht_key_entry_node", "CLEAR-FHT-KEY-ENTRY-NODE", 2, 0, false);
        declareFunction("fht_fill_key_entry_gap", "FHT-FILL-KEY-ENTRY-GAP", 2, 0, false);
        declareFunction("fht_lookup_key_index_only", "FHT-LOOKUP-KEY-INDEX-ONLY", 3, 0, false);
        declareFunction("increase_fht_item_count", "INCREASE-FHT-ITEM-COUNT", 1, 1, false);
        declareFunction("decrease_fht_item_count", "DECREASE-FHT-ITEM-COUNT", 1, 0, false);
        declareFunction("perform_fht_get", "PERFORM-FHT-GET", 2, 0, false);
        declareFunction("htfile_file_block_entry_print_function_trampoline", "HTFILE-FILE-BLOCK-ENTRY-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("htfile_file_block_entry_p", "HTFILE-FILE-BLOCK-ENTRY-P", 1, 0, false);
        new com.cyc.cycjava.cycl.file_hash_table.$htfile_file_block_entry_p$UnaryFunction();
        declareFunction("htfile_file_block_entry_size", "HTFILE-FILE-BLOCK-ENTRY-SIZE", 1, 0, false);
        declareFunction("htfile_file_block_entry_next", "HTFILE-FILE-BLOCK-ENTRY-NEXT", 1, 0, false);
        declareFunction("_csetf_htfile_file_block_entry_size", "_CSETF-HTFILE-FILE-BLOCK-ENTRY-SIZE", 2, 0, false);
        declareFunction("_csetf_htfile_file_block_entry_next", "_CSETF-HTFILE-FILE-BLOCK-ENTRY-NEXT", 2, 0, false);
        declareFunction("make_htfile_file_block_entry", "MAKE-HTFILE-FILE-BLOCK-ENTRY", 0, 1, false);
        declareFunction("new_htfile_file_block_entry", "NEW-HTFILE-FILE-BLOCK-ENTRY", 0, 1, false);
        declareFunction("print_htfile_file_block_entry", "PRINT-HTFILE-FILE-BLOCK-ENTRY", 3, 0, false);
        declareFunction("copy_file_block", "COPY-FILE-BLOCK", 2, 0, false);
        declareFunction("write_file_block_entry_to_space", "WRITE-FILE-BLOCK-ENTRY-TO-SPACE", 3, 0, false);
        declareFunction("read_file_block_entry_from_space", "READ-FILE-BLOCK-ENTRY-FROM-SPACE", 3, 0, false);
        declareFunction("deallocate_object_space", "DEALLOCATE-OBJECT-SPACE", 3, 0, false);
        declareFunction("insert_file_block_in_free_list", "INSERT-FILE-BLOCK-IN-FREE-LIST", 4, 0, false);
        declareFunction("allocate_object_space_from_free_list", "ALLOCATE-OBJECT-SPACE-FROM-FREE-LIST", 2, 0, false);
        declareFunction("write_initial_table", "WRITE-INITIAL-TABLE", 1, 0, false);
        declareFunction("allocate_fht_heap_space", "ALLOCATE-FHT-HEAP-SPACE", 1, 0, false);
        declareFunction("allocate_fht_key_space", "ALLOCATE-FHT-KEY-SPACE", 1, 1, false);
        declareFunction("htfile_minimal_space_required_for_key", "HTFILE-MINIMAL-SPACE-REQUIRED-FOR-KEY", 0, 0, false);
        declareFunction("fht_key_index_to_reladdr", "FHT-KEY-INDEX-TO-RELADDR", 1, 0, false);
        declareFunction("fht_keyspace_byte_size", "FHT-KEYSPACE-BYTE-SIZE", 1, 0, false);
        declareFunction("valid_heap_offset_p", "VALID-HEAP-OFFSET-P", 3, 0, false);
        declareFunction("valid_fht_heap_offset_p", "VALID-FHT-HEAP-OFFSET-P", 2, 0, false);
        declareFunction("valid_offset_in_keyspace_p", "VALID-OFFSET-IN-KEYSPACE-P", 3, 0, false);
        declareFunction("fht_get_keyspace_size", "FHT-GET-KEYSPACE-SIZE", 1, 0, false);
        declareFunction("fht_key_reladdr_to_address", "FHT-KEY-RELADDR-TO-ADDRESS", 2, 0, false);
        declareFunction("fht_key_index_to_address", "FHT-KEY-INDEX-TO-ADDRESS", 2, 0, false);
        declareFunction("validate_fht_key_index", "VALIDATE-FHT-KEY-INDEX", 2, 0, false);
        declareFunction("write_key_entry_object", "WRITE-KEY-ENTRY-OBJECT", 2, 0, false);
        declareFunction("read_key_entry_object", "READ-KEY-ENTRY-OBJECT", 2, 0, false);
        declareFunction("fetch_fht_key_entry", "FETCH-FHT-KEY-ENTRY", 3, 0, false);
        declareFunction("store_fht_key_entry", "STORE-FHT-KEY-ENTRY", 3, 0, false);
        declareFunction("fht_hash", "FHT-HASH", 2, 0, false);
        declareFunction("fht_ensure_hash_table_size", "FHT-ENSURE-HASH-TABLE-SIZE", 1, 0, false);
        declareFunction("fht_compute_fence_post_index", "FHT-COMPUTE-FENCE-POST-INDEX", 2, 0, false);
        declareFunction("fht_step_key_index", "FHT-STEP-KEY-INDEX", 2, 0, false);
        declareFunction("fht_lookup_key", "FHT-LOOKUP-KEY", 2, 1, false);
        declareFunction("identical_fht_key_entryP", "IDENTICAL-FHT-KEY-ENTRY?", 5, 0, false);
        declareFunction("complete_fht_object_entry_for_key", "COMPLETE-FHT-OBJECT-ENTRY-FOR-KEY", 3, 1, false);
        declareFunction("potentially_grow_fht_table", "POTENTIALLY-GROW-FHT-TABLE", 1, 0, false);
        declareFunction("perform_grow_fht_table", "PERFORM-GROW-FHT-TABLE", 1, 0, false);
        declareFunction("is_fht_too_smallP", "IS-FHT-TOO-SMALL?", 1, 0, false);
        declareFunction("resize_fht_object_and_key_spaces", "RESIZE-FHT-OBJECT-AND-KEY-SPACES", 1, 0, false);
        declareFunction("allocate_new_fht_key_space", "ALLOCATE-NEW-FHT-KEY-SPACE", 3, 0, false);
        declareFunction("move_htfile_key_space", "MOVE-HTFILE-KEY-SPACE", 3, 0, false);
        declareFunction("rehash_fht_key_space", "REHASH-FHT-KEY-SPACE", 3, 0, false);
        declareMacro("with_different_keyspace", "WITH-DIFFERENT-KEYSPACE");
        declareFunction("rehash_fht_cached_keys", "REHASH-FHT-CACHED-KEYS", 6, 0, false);
        declareFunction("handle_rehash_fht_insert", "HANDLE-REHASH-FHT-INSERT", 5, 0, false);
        declareFunction("htfile_minimal_space_required_for_object", "HTFILE-MINIMAL-SPACE-REQUIRED-FOR-OBJECT", 0, 0, false);
        declareFunction("specify_object_entry", "SPECIFY-OBJECT-ENTRY", 3, 1, false);
        declareFunction("compute_object_entry_size", "COMPUTE-OBJECT-ENTRY-SIZE", 2, 0, false);
        declareFunction("allocate_object_space", "ALLOCATE-OBJECT-SPACE", 2, 0, false);
        declareFunction("store_fht_object_entry", "STORE-FHT-OBJECT-ENTRY", 3, 0, false);
        declareFunction("write_object_entry_to_space", "WRITE-OBJECT-ENTRY-TO-SPACE", 3, 0, false);
        declareFunction("read_object_entry_from_space", "READ-OBJECT-ENTRY-FROM-SPACE", 3, 1, false);
        declareFunction("increase_htfile_heap_size", "INCREASE-HTFILE-HEAP-SIZE", 2, 0, false);
        declareFunction("compute_new_htfile_heap_size", "COMPUTE-NEW-HTFILE-HEAP-SIZE", 1, 1, false);
        declareMacro("register_file_table_header_support", "REGISTER-FILE-TABLE-HEADER-SUPPORT");
        declareFunction("read_fht_header", "READ-FHT-HEADER", 1, 0, false);
        declareFunction("write_fht_header", "WRITE-FHT-HEADER", 1, 0, false);
        declareFunction("read_fht_header_version1p3", "READ-FHT-HEADER-VERSION1P3", 1, 0, false);
        declareFunction("write_fht_header_version1p3", "WRITE-FHT-HEADER-VERSION1P3", 1, 0, false);
        declareFunction("read_fht_extension_space", "READ-FHT-EXTENSION-SPACE", 1, 0, false);
        declareFunction("write_fht_extension_space", "WRITE-FHT-EXTENSION-SPACE", 1, 0, false);
        declareFunction("verify_version1p3_crc", "VERIFY-VERSION1P3-CRC", 1, 0, false);
        declareFunction("read_fht_uint4", "READ-FHT-UINT4", 1, 0, false);
        declareFunction("write_fht_uint4", "WRITE-FHT-UINT4", 2, 0, false);
        declareFunction("read_fht_uint8", "READ-FHT-UINT8", 1, 0, false);
        declareFunction("write_fht_uint8", "WRITE-FHT-UINT8", 2, 0, false);
        declareFunction("write_null_fht_bytes", "WRITE-NULL-FHT-BYTES", 2, 0, false);
        declareFunction("read_fht_encoded_object", "READ-FHT-ENCODED-OBJECT", 2, 0, false);
        declareFunction("write_fht_encoded_object", "WRITE-FHT-ENCODED-OBJECT", 4, 0, false);
        declareFunction("read_fht_binary_block", "READ-FHT-BINARY-BLOCK", 3, 0, false);
        declareFunction("write_fht_binary_block", "WRITE-FHT-BINARY-BLOCK", 3, 0, false);
        declareFunction("move_fht_binary_block", "MOVE-FHT-BINARY-BLOCK", 5, 0, false);
        declareFunction("aggressive_fast_fht_optimization_modeP", "AGGRESSIVE-FAST-FHT-OPTIMIZATION-MODE?", 0, 0, false);
        declareFunction("moderate_fast_fht_optimization_modeP", "MODERATE-FAST-FHT-OPTIMIZATION-MODE?", 0, 0, false);
        declareFunction("conservative_fast_fht_optimization_modeP", "CONSERVATIVE-FAST-FHT-OPTIMIZATION-MODE?", 0, 0, false);
        declareFunction("invalid_fast_fht_optimization_mode", "INVALID-FAST-FHT-OPTIMIZATION-MODE", 0, 0, false);
        declareFunction("fast_create_fht_print_function_trampoline", "FAST-CREATE-FHT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("fast_create_fht_p", "FAST-CREATE-FHT-P", 1, 0, false);
        new com.cyc.cycjava.cycl.file_hash_table.$fast_create_fht_p$UnaryFunction();
        declareFunction("fast_create_fht_fht", "FAST-CREATE-FHT-FHT", 1, 0, false);
        declareFunction("fast_create_fht_tempstem", "FAST-CREATE-FHT-TEMPSTEM", 1, 0, false);
        declareFunction("fast_create_fht_tempfile", "FAST-CREATE-FHT-TEMPFILE", 1, 0, false);
        declareFunction("fast_create_fht_keystream", "FAST-CREATE-FHT-KEYSTREAM", 1, 0, false);
        declareFunction("_csetf_fast_create_fht_fht", "_CSETF-FAST-CREATE-FHT-FHT", 2, 0, false);
        declareFunction("_csetf_fast_create_fht_tempstem", "_CSETF-FAST-CREATE-FHT-TEMPSTEM", 2, 0, false);
        declareFunction("_csetf_fast_create_fht_tempfile", "_CSETF-FAST-CREATE-FHT-TEMPFILE", 2, 0, false);
        declareFunction("_csetf_fast_create_fht_keystream", "_CSETF-FAST-CREATE-FHT-KEYSTREAM", 2, 0, false);
        declareFunction("make_fast_create_fht", "MAKE-FAST-CREATE-FHT", 0, 1, false);
        declareFunction("fast_create_file_hash_table", "FAST-CREATE-FILE-HASH-TABLE", 1, 3, false);
        declareFunction("fast_create_allocate_keystream", "FAST-CREATE-ALLOCATE-KEYSTREAM", 1, 0, false);
        declareFunction("fast_create_fixup_object_heap", "FAST-CREATE-FIXUP-OBJECT-HEAP", 1, 0, false);
        declareFunction("fast_put_file_hash_table", "FAST-PUT-FILE-HASH-TABLE", 3, 0, false);
        declareFunction("perform_fast_fht_put", "PERFORM-FAST-FHT-PUT", 3, 0, false);
        declareFunction("update_fast_fht_keystream", "UPDATE-FAST-FHT-KEYSTREAM", 3, 0, false);
        declareFunction("finalize_fast_create_file_hash_table", "FINALIZE-FAST-CREATE-FILE-HASH-TABLE", 1, 2, false);
        declareFunction("prepare_fast_fht_keyspace", "PREPARE-FAST-FHT-KEYSPACE", 1, 0, false);
        declareFunction("realign_fast_fht_keyspace_offset", "REALIGN-FAST-FHT-KEYSPACE-OFFSET", 1, 0, false);
        declareFunction("realign_fast_fht_keyspace_capacity", "REALIGN-FAST-FHT-KEYSPACE-CAPACITY", 1, 0, false);
        declareFunction("allocate_fast_fht_keyspace", "ALLOCATE-FAST-FHT-KEYSPACE", 1, 0, false);
        declareFunction("insert_fast_fht_keystream_content", "INSERT-FAST-FHT-KEYSTREAM-CONTENT", 1, 2, false);
        declareFunction("perform_fast_fht_insert_of_unambiguous_keys", "PERFORM-FAST-FHT-INSERT-OF-UNAMBIGUOUS-KEYS", 2, 0, false);
        declareFunction("perform_fast_fht_insert_by_keystream_ordering", "PERFORM-FAST-FHT-INSERT-BY-KEYSTREAM-ORDERING", 4, 0, false);
        declareFunction("shutdown_fast_create_fht", "SHUTDOWN-FAST-CREATE-FHT", 1, 1, false);
        declareFunction("fast_fht_keystream_sorter_print_function_trampoline", "FAST-FHT-KEYSTREAM-SORTER-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("fast_fht_keystream_sorter_p", "FAST-FHT-KEYSTREAM-SORTER-P", 1, 0, false);
        new com.cyc.cycjava.cycl.file_hash_table.$fast_fht_keystream_sorter_p$UnaryFunction();
        declareFunction("fstfht_ksorter_tempstem", "FSTFHT-KSORTER-TEMPSTEM", 1, 0, false);
        declareFunction("fstfht_ksorter_in_files", "FSTFHT-KSORTER-IN-FILES", 1, 0, false);
        declareFunction("fstfht_ksorter_out_files", "FSTFHT-KSORTER-OUT-FILES", 1, 0, false);
        declareFunction("_csetf_fstfht_ksorter_tempstem", "_CSETF-FSTFHT-KSORTER-TEMPSTEM", 2, 0, false);
        declareFunction("_csetf_fstfht_ksorter_in_files", "_CSETF-FSTFHT-KSORTER-IN-FILES", 2, 0, false);
        declareFunction("_csetf_fstfht_ksorter_out_files", "_CSETF-FSTFHT-KSORTER-OUT-FILES", 2, 0, false);
        declareFunction("make_fast_fht_keystream_sorter", "MAKE-FAST-FHT-KEYSTREAM-SORTER", 0, 1, false);
        declareFunction("fast_fht_sort_keystream_by_expected_index", "FAST-FHT-SORT-KEYSTREAM-BY-EXPECTED-INDEX", 3, 2, false);
        declareFunction("new_fast_fht_keystream_sorter", "NEW-FAST-FHT-KEYSTREAM-SORTER", 1, 0, false);
        declareFunction("fast_fht_n_temp_files", "FAST-FHT-N-TEMP-FILES", 3, 0, false);
        declareFunction("fast_fht_split_keystream_into_tiled_input_files", "FAST-FHT-SPLIT-KEYSTREAM-INTO-TILED-INPUT-FILES", 3, 0, false);
        declareFunction("fast_fht_read_one_keystream_entry", "FAST-FHT-READ-ONE-KEYSTREAM-ENTRY", 2, 1, false);
        declareFunction("fast_fht_keystream_sentinel_entry", "FAST-FHT-KEYSTREAM-SENTINEL-ENTRY", 0, 1, false);
        declareFunction("fast_fht_keystream_eof_entry", "FAST-FHT-KEYSTREAM-EOF-ENTRY", 0, 1, false);
        declareFunction("fast_fht_keystream_entry_cmp", "FAST-FHT-KEYSTREAM-ENTRY-CMP", 2, 0, false);
        declareFunction("fast_fht_keystream_entryL", "FAST-FHT-KEYSTREAM-ENTRY<", 2, 0, false);
        declareFunction("fast_fht_write_one_keystream_tile", "FAST-FHT-WRITE-ONE-KEYSTREAM-TILE", 2, 0, false);
        declareFunction("is_fast_fht_keystream_chunk_separator_entryP", "IS-FAST-FHT-KEYSTREAM-CHUNK-SEPARATOR-ENTRY?", 1, 0, false);
        declareFunction("is_fast_fht_keystream_eofP", "IS-FAST-FHT-KEYSTREAM-EOF?", 1, 0, false);
        declareFunction("fast_fht_write_keystream_chunk_separator", "FAST-FHT-WRITE-KEYSTREAM-CHUNK-SEPARATOR", 1, 0, false);
        declareFunction("fast_fht_write_keystream_entry", "FAST-FHT-WRITE-KEYSTREAM-ENTRY", 3, 1, false);
        declareFunction("fast_fht_write_one_keystream_entry", "FAST-FHT-WRITE-ONE-KEYSTREAM-ENTRY", 2, 0, false);
        declareFunction("fast_fht_write_one_collision_stream_entry", "FAST-FHT-WRITE-ONE-COLLISION-STREAM-ENTRY", 3, 0, false);
        declareFunction("fast_fht_almost_merge_sort_keystream", "FAST-FHT-ALMOST-MERGE-SORT-KEYSTREAM", 2, 1, false);
        declareFunction("fast_fht_merge_keystream_input_files", "FAST-FHT-MERGE-KEYSTREAM-INPUT-FILES", 3, 0, false);
        declareFunction("fast_fht_merge_keystream_chunks", "FAST-FHT-MERGE-KEYSTREAM-CHUNKS", 4, 0, false);
        declareMacro("fast_fht_drain_index_run", "FAST-FHT-DRAIN-INDEX-RUN");
        declareMacro("fast_fht_manage_index_collisions", "FAST-FHT-MANAGE-INDEX-COLLISIONS");
        declareFunction("fast_fht_uniquify_keystream", "FAST-FHT-UNIQUIFY-KEYSTREAM", 2, 0, false);
        declareFunction("fast_fht_get_comparable_index_from_entry", "FAST-FHT-GET-COMPARABLE-INDEX-FROM-ENTRY", 1, 0, false);
        declareFunction("fast_fht_dump_keystream", "FAST-FHT-DUMP-KEYSTREAM", 2, 1, false);
        declareFunction("fast_fht_dump_keystream_files", "FAST-FHT-DUMP-KEYSTREAM-FILES", 2, 1, false);
        declareFunction("enforce_valid_fast_fht_dump_keystream_files", "ENFORCE-VALID-FAST-FHT-DUMP-KEYSTREAM-FILES", 2, 0, false);
        declareFunction("validate_fast_fht_dump_keystream", "VALIDATE-FAST-FHT-DUMP-KEYSTREAM", 2, 0, false);
        declareFunction("test_fast_fht_keystream_entry_cmp", "TEST-FAST-FHT-KEYSTREAM-ENTRY-CMP", 2, 0, false);
        declareFunction("fast_fht_keystream_entry_cmp_expand_argument", "FAST-FHT-KEYSTREAM-ENTRY-CMP-EXPAND-ARGUMENT", 1, 0, false);
        declareMacro("with_input_file_hash_table", "WITH-INPUT-FILE-HASH-TABLE");
        declareMacro("with_writable_file_hash_table", "WITH-WRITABLE-FILE-HASH-TABLE");
        declareMacro("with_output_file_hash_table", "WITH-OUTPUT-FILE-HASH-TABLE");
        declareMacro("with_fast_create_file_hash_table", "WITH-FAST-CREATE-FILE-HASH-TABLE");
        declareFunction("test_fast_fht_creation_with_merge_sorted_keystream", "TEST-FAST-FHT-CREATION-WITH-MERGE-SORTED-KEYSTREAM", 3, 0, false);
        return NIL;
    }

    public static SubLObject declare_file_hash_table_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("file_hash_table_print_function_trampoline", "FILE-HASH-TABLE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
            declareFunction("file_hash_table_p", "FILE-HASH-TABLE-P", 1, 0, false);
            new file_hash_table.$file_hash_table_p$UnaryFunction();
            declareFunction("file_hash_table_stream", "FILE-HASH-TABLE-STREAM", 1, 0, false);
            declareFunction("file_hash_table_header", "FILE-HASH-TABLE-HEADER", 1, 0, false);
            declareFunction("file_hash_table_lock", "FILE-HASH-TABLE-LOCK", 1, 0, false);
            declareFunction("file_hash_table_encoding_input_fn", "FILE-HASH-TABLE-ENCODING-INPUT-FN", 1, 0, false);
            declareFunction("file_hash_table_encoding_output_fn", "FILE-HASH-TABLE-ENCODING-OUTPUT-FN", 1, 0, false);
            declareFunction("file_hash_table_encoding_size_fn", "FILE-HASH-TABLE-ENCODING-SIZE-FN", 1, 0, false);
            declareFunction("file_hash_table_encoding_key_input_fn", "FILE-HASH-TABLE-ENCODING-KEY-INPUT-FN", 1, 0, false);
            declareFunction("file_hash_table_encoding_key_output_fn", "FILE-HASH-TABLE-ENCODING-KEY-OUTPUT-FN", 1, 0, false);
            declareFunction("file_hash_table_testfn", "FILE-HASH-TABLE-TESTFN", 1, 0, false);
            declareFunction("file_hash_table_hash_fn", "FILE-HASH-TABLE-HASH-FN", 1, 0, false);
            declareFunction("file_hash_table_input_cache", "FILE-HASH-TABLE-INPUT-CACHE", 1, 0, false);
            declareFunction("file_hash_table_output_cache", "FILE-HASH-TABLE-OUTPUT-CACHE", 1, 0, false);
            declareFunction("file_hash_table_property_list", "FILE-HASH-TABLE-PROPERTY-LIST", 1, 0, false);
            declareFunction("_csetf_file_hash_table_stream", "_CSETF-FILE-HASH-TABLE-STREAM", 2, 0, false);
            declareFunction("_csetf_file_hash_table_header", "_CSETF-FILE-HASH-TABLE-HEADER", 2, 0, false);
            declareFunction("_csetf_file_hash_table_lock", "_CSETF-FILE-HASH-TABLE-LOCK", 2, 0, false);
            declareFunction("_csetf_file_hash_table_encoding_input_fn", "_CSETF-FILE-HASH-TABLE-ENCODING-INPUT-FN", 2, 0, false);
            declareFunction("_csetf_file_hash_table_encoding_output_fn", "_CSETF-FILE-HASH-TABLE-ENCODING-OUTPUT-FN", 2, 0, false);
            declareFunction("_csetf_file_hash_table_encoding_size_fn", "_CSETF-FILE-HASH-TABLE-ENCODING-SIZE-FN", 2, 0, false);
            declareFunction("_csetf_file_hash_table_encoding_key_input_fn", "_CSETF-FILE-HASH-TABLE-ENCODING-KEY-INPUT-FN", 2, 0, false);
            declareFunction("_csetf_file_hash_table_encoding_key_output_fn", "_CSETF-FILE-HASH-TABLE-ENCODING-KEY-OUTPUT-FN", 2, 0, false);
            declareFunction("_csetf_file_hash_table_testfn", "_CSETF-FILE-HASH-TABLE-TESTFN", 2, 0, false);
            declareFunction("_csetf_file_hash_table_hash_fn", "_CSETF-FILE-HASH-TABLE-HASH-FN", 2, 0, false);
            declareFunction("_csetf_file_hash_table_input_cache", "_CSETF-FILE-HASH-TABLE-INPUT-CACHE", 2, 0, false);
            declareFunction("_csetf_file_hash_table_output_cache", "_CSETF-FILE-HASH-TABLE-OUTPUT-CACHE", 2, 0, false);
            declareFunction("_csetf_file_hash_table_property_list", "_CSETF-FILE-HASH-TABLE-PROPERTY-LIST", 2, 0, false);
            declareFunction("make_file_hash_table", "MAKE-FILE-HASH-TABLE", 0, 1, false);
            declareFunction("visit_defstruct_file_hash_table", "VISIT-DEFSTRUCT-FILE-HASH-TABLE", 2, 0, false);
            declareFunction("visit_defstruct_object_file_hash_table_method", "VISIT-DEFSTRUCT-OBJECT-FILE-HASH-TABLE-METHOD", 2, 0, false);
            declareFunction("describe_file_hash_table", "DESCRIBE-FILE-HASH-TABLE", 1, 1, false);
            declareFunction("read_only_file_hash_table_p", "READ-ONLY-FILE-HASH-TABLE-P", 1, 0, false);
            declareFunction("writeable_file_hash_table_p", "WRITEABLE-FILE-HASH-TABLE-P", 1, 0, false);
            declareFunction("file_hash_table_is_read_onlyP", "FILE-HASH-TABLE-IS-READ-ONLY?", 1, 0, false);
            declareFunction("file_hash_table_path", "FILE-HASH-TABLE-PATH", 1, 0, false);
            declareFunction("file_hash_table_serialization", "FILE-HASH-TABLE-SERIALIZATION", 1, 0, false);
            declareFunction("file_hash_table_change_stream_buffer_size", "FILE-HASH-TABLE-CHANGE-STREAM-BUFFER-SIZE", 2, 0, false);
            declareFunction("file_hash_table_enable_memory_mapping", "FILE-HASH-TABLE-ENABLE-MEMORY-MAPPING", 1, 0, false);
            declareFunction("file_hash_table_memory_mappedP", "FILE-HASH-TABLE-MEMORY-MAPPED?", 1, 0, false);
            declareFunction("htfile_header_print_function_trampoline", "HTFILE-HEADER-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
            declareFunction("htfile_header_p", "HTFILE-HEADER-P", 1, 0, false);
            new file_hash_table.$htfile_header_p$UnaryFunction();
            declareFunction("htfile_header_size", "HTFILE-HEADER-SIZE", 1, 0, false);
            declareFunction("htfile_header_version_major", "HTFILE-HEADER-VERSION-MAJOR", 1, 0, false);
            declareFunction("htfile_header_version_minor", "HTFILE-HEADER-VERSION-MINOR", 1, 0, false);
            declareFunction("htfile_header_object_space_offset", "HTFILE-HEADER-OBJECT-SPACE-OFFSET", 1, 0, false);
            declareFunction("htfile_header_key_space_offset", "HTFILE-HEADER-KEY-SPACE-OFFSET", 1, 0, false);
            declareFunction("htfile_header_current_heap_top", "HTFILE-HEADER-CURRENT-HEAP-TOP", 1, 0, false);
            declareFunction("htfile_header_item_count", "HTFILE-HEADER-ITEM-COUNT", 1, 0, false);
            declareFunction("htfile_header_capacity", "HTFILE-HEADER-CAPACITY", 1, 0, false);
            declareFunction("htfile_header_free_list_head", "HTFILE-HEADER-FREE-LIST-HEAD", 1, 0, false);
            declareFunction("htfile_header_deletion_count", "HTFILE-HEADER-DELETION-COUNT", 1, 0, false);
            declareFunction("htfile_header_header_crc", "HTFILE-HEADER-HEADER-CRC", 1, 0, false);
            declareFunction("htfile_header_extension_space_size", "HTFILE-HEADER-EXTENSION-SPACE-SIZE", 1, 0, false);
            declareFunction("htfile_header_extension_space", "HTFILE-HEADER-EXTENSION-SPACE", 1, 0, false);
            declareFunction("_csetf_htfile_header_size", "_CSETF-HTFILE-HEADER-SIZE", 2, 0, false);
            declareFunction("_csetf_htfile_header_version_major", "_CSETF-HTFILE-HEADER-VERSION-MAJOR", 2, 0, false);
            declareFunction("_csetf_htfile_header_version_minor", "_CSETF-HTFILE-HEADER-VERSION-MINOR", 2, 0, false);
            declareFunction("_csetf_htfile_header_object_space_offset", "_CSETF-HTFILE-HEADER-OBJECT-SPACE-OFFSET", 2, 0, false);
            declareFunction("_csetf_htfile_header_key_space_offset", "_CSETF-HTFILE-HEADER-KEY-SPACE-OFFSET", 2, 0, false);
            declareFunction("_csetf_htfile_header_current_heap_top", "_CSETF-HTFILE-HEADER-CURRENT-HEAP-TOP", 2, 0, false);
            declareFunction("_csetf_htfile_header_item_count", "_CSETF-HTFILE-HEADER-ITEM-COUNT", 2, 0, false);
            declareFunction("_csetf_htfile_header_capacity", "_CSETF-HTFILE-HEADER-CAPACITY", 2, 0, false);
            declareFunction("_csetf_htfile_header_free_list_head", "_CSETF-HTFILE-HEADER-FREE-LIST-HEAD", 2, 0, false);
            declareFunction("_csetf_htfile_header_deletion_count", "_CSETF-HTFILE-HEADER-DELETION-COUNT", 2, 0, false);
            declareFunction("_csetf_htfile_header_header_crc", "_CSETF-HTFILE-HEADER-HEADER-CRC", 2, 0, false);
            declareFunction("_csetf_htfile_header_extension_space_size", "_CSETF-HTFILE-HEADER-EXTENSION-SPACE-SIZE", 2, 0, false);
            declareFunction("_csetf_htfile_header_extension_space", "_CSETF-HTFILE-HEADER-EXTENSION-SPACE", 2, 0, false);
            declareFunction("make_htfile_header", "MAKE-HTFILE-HEADER", 0, 1, false);
            declareFunction("visit_defstruct_htfile_header", "VISIT-DEFSTRUCT-HTFILE-HEADER", 2, 0, false);
            declareFunction("visit_defstruct_object_htfile_header_method", "VISIT-DEFSTRUCT-OBJECT-HTFILE-HEADER-METHOD", 2, 0, false);
            declareFunction("describe_htfile_header", "DESCRIBE-HTFILE-HEADER", 1, 1, false);
            declareFunction("htfile_object_entry_print_function_trampoline", "HTFILE-OBJECT-ENTRY-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
            declareFunction("htfile_object_entry_p", "HTFILE-OBJECT-ENTRY-P", 1, 0, false);
            new file_hash_table.$htfile_object_entry_p$UnaryFunction();
            declareFunction("htfile_object_entry_size", "HTFILE-OBJECT-ENTRY-SIZE", 1, 0, false);
            declareFunction("htfile_object_entry_type", "HTFILE-OBJECT-ENTRY-TYPE", 1, 0, false);
            declareFunction("htfile_object_entry_key_size", "HTFILE-OBJECT-ENTRY-KEY-SIZE", 1, 0, false);
            declareFunction("htfile_object_entry_key", "HTFILE-OBJECT-ENTRY-KEY", 1, 0, false);
            declareFunction("htfile_object_entry_data_size", "HTFILE-OBJECT-ENTRY-DATA-SIZE", 1, 0, false);
            declareFunction("htfile_object_entry_data", "HTFILE-OBJECT-ENTRY-DATA", 1, 0, false);
            declareFunction("_csetf_htfile_object_entry_size", "_CSETF-HTFILE-OBJECT-ENTRY-SIZE", 2, 0, false);
            declareFunction("_csetf_htfile_object_entry_type", "_CSETF-HTFILE-OBJECT-ENTRY-TYPE", 2, 0, false);
            declareFunction("_csetf_htfile_object_entry_key_size", "_CSETF-HTFILE-OBJECT-ENTRY-KEY-SIZE", 2, 0, false);
            declareFunction("_csetf_htfile_object_entry_key", "_CSETF-HTFILE-OBJECT-ENTRY-KEY", 2, 0, false);
            declareFunction("_csetf_htfile_object_entry_data_size", "_CSETF-HTFILE-OBJECT-ENTRY-DATA-SIZE", 2, 0, false);
            declareFunction("_csetf_htfile_object_entry_data", "_CSETF-HTFILE-OBJECT-ENTRY-DATA", 2, 0, false);
            declareFunction("make_htfile_object_entry", "MAKE-HTFILE-OBJECT-ENTRY", 0, 1, false);
            declareFunction("visit_defstruct_htfile_object_entry", "VISIT-DEFSTRUCT-HTFILE-OBJECT-ENTRY", 2, 0, false);
            declareFunction("visit_defstruct_object_htfile_object_entry_method", "VISIT-DEFSTRUCT-OBJECT-HTFILE-OBJECT-ENTRY-METHOD", 2, 0, false);
            declareFunction("htfile_key_entry_print_function_trampoline", "HTFILE-KEY-ENTRY-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
            declareFunction("htfile_key_entry_p", "HTFILE-KEY-ENTRY-P", 1, 0, false);
            new file_hash_table.$htfile_key_entry_p$UnaryFunction();
            declareFunction("htfile_key_entry_key_offset", "HTFILE-KEY-ENTRY-KEY-OFFSET", 1, 0, false);
            declareFunction("htfile_key_entry_hash_code", "HTFILE-KEY-ENTRY-HASH-CODE", 1, 0, false);
            declareFunction("_csetf_htfile_key_entry_key_offset", "_CSETF-HTFILE-KEY-ENTRY-KEY-OFFSET", 2, 0, false);
            declareFunction("_csetf_htfile_key_entry_hash_code", "_CSETF-HTFILE-KEY-ENTRY-HASH-CODE", 2, 0, false);
            declareFunction("make_htfile_key_entry", "MAKE-HTFILE-KEY-ENTRY", 0, 1, false);
            declareFunction("visit_defstruct_htfile_key_entry", "VISIT-DEFSTRUCT-HTFILE-KEY-ENTRY", 2, 0, false);
            declareFunction("visit_defstruct_object_htfile_key_entry_method", "VISIT-DEFSTRUCT-OBJECT-HTFILE-KEY-ENTRY-METHOD", 2, 0, false);
            declareFunction("get_default_fht_test_function", "GET-DEFAULT-FHT-TEST-FUNCTION", 0, 0, false);
            declareFunction("get_default_fht_serialization_protocol", "GET-DEFAULT-FHT-SERIALIZATION-PROTOCOL", 0, 0, false);
            declareFunction("new_htfile_header", "NEW-HTFILE-HEADER", 0, 0, false);
            declareFunction("construct_empty_htfile_header", "CONSTRUCT-EMPTY-HTFILE-HEADER", 1, 1, false);
            declareFunction("htfile_scale_user_space_to_implementation_space", "HTFILE-SCALE-USER-SPACE-TO-IMPLEMENTATION-SPACE", 1, 0, false);
            declareFunction("htfile_minimal_space_required", "HTFILE-MINIMAL-SPACE-REQUIRED", 0, 0, false);
            declareFunction("new_file_hash_table", "NEW-FILE-HASH-TABLE", 5, 3, false);
            declareFunction("new_empty_file_hash_table", "NEW-EMPTY-FILE-HASH-TABLE", 6, 4, false);
            declareFunction("new_htfile_key_entry", "NEW-HTFILE-KEY-ENTRY", 1, 1, false);
            declareFunction("construct_tombstone_key_entry", "CONSTRUCT-TOMBSTONE-KEY-ENTRY", 0, 0, false);
            declareFunction("is_tombstoned_key_entryP", "IS-TOMBSTONED-KEY-ENTRY?", 1, 0, false);
            declareFunction("construct_empty_key_entry", "CONSTRUCT-EMPTY-KEY-ENTRY", 0, 0, false);
            declareFunction("is_empty_key_entryP", "IS-EMPTY-KEY-ENTRY?", 1, 0, false);
            declareFunction("is_valid_key_entryP", "IS-VALID-KEY-ENTRY?", 2, 0, false);
            declareFunction("fht_sxhash_for_fht", "FHT-SXHASH-FOR-FHT", 2, 0, false);
            declareFunction("fht_sxhash", "FHT-SXHASH", 2, 0, false);
            declareFunction("valid_hash_code_p", "VALID-HASH-CODE-P", 1, 0, false);
            declareFunction("new_object_entry", "NEW-OBJECT-ENTRY", 2, 0, false);
            declareFunction("fht_serialization_entry_print_function_trampoline", "FHT-SERIALIZATION-ENTRY-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
            declareFunction("fht_serialization_entry_p", "FHT-SERIALIZATION-ENTRY-P", 1, 0, false);
            new file_hash_table.$fht_serialization_entry_p$UnaryFunction();
            declareFunction("fht_se_encoding_input_fn", "FHT-SE-ENCODING-INPUT-FN", 1, 0, false);
            declareFunction("fht_se_encoding_output_fn", "FHT-SE-ENCODING-OUTPUT-FN", 1, 0, false);
            declareFunction("fht_se_encoding_size_fn", "FHT-SE-ENCODING-SIZE-FN", 1, 0, false);
            declareFunction("fht_se_hash_fn", "FHT-SE-HASH-FN", 1, 0, false);
            declareFunction("fht_se_encoding_key_input_fn", "FHT-SE-ENCODING-KEY-INPUT-FN", 1, 0, false);
            declareFunction("fht_se_encoding_key_output_fn", "FHT-SE-ENCODING-KEY-OUTPUT-FN", 1, 0, false);
            declareFunction("_csetf_fht_se_encoding_input_fn", "_CSETF-FHT-SE-ENCODING-INPUT-FN", 2, 0, false);
            declareFunction("_csetf_fht_se_encoding_output_fn", "_CSETF-FHT-SE-ENCODING-OUTPUT-FN", 2, 0, false);
            declareFunction("_csetf_fht_se_encoding_size_fn", "_CSETF-FHT-SE-ENCODING-SIZE-FN", 2, 0, false);
            declareFunction("_csetf_fht_se_hash_fn", "_CSETF-FHT-SE-HASH-FN", 2, 0, false);
            declareFunction("_csetf_fht_se_encoding_key_input_fn", "_CSETF-FHT-SE-ENCODING-KEY-INPUT-FN", 2, 0, false);
            declareFunction("_csetf_fht_se_encoding_key_output_fn", "_CSETF-FHT-SE-ENCODING-KEY-OUTPUT-FN", 2, 0, false);
            declareFunction("make_fht_serialization_entry", "MAKE-FHT-SERIALIZATION-ENTRY", 0, 1, false);
            declareFunction("visit_defstruct_fht_serialization_entry", "VISIT-DEFSTRUCT-FHT-SERIALIZATION-ENTRY", 2, 0, false);
            declareFunction("visit_defstruct_object_fht_serialization_entry_method", "VISIT-DEFSTRUCT-OBJECT-FHT-SERIALIZATION-ENTRY-METHOD", 2, 0, false);
            declareFunction("print_fht_serialization_entry", "PRINT-FHT-SERIALIZATION-ENTRY", 3, 0, false);
            declareFunction("new_fht_serialization_entry", "NEW-FHT-SERIALIZATION-ENTRY", 1, 0, false);
            declareFunction("register_fht_serialization_entry", "REGISTER-FHT-SERIALIZATION-ENTRY", 2, 0, false);
            declareFunction("fht_serialization_entry", "FHT-SERIALIZATION-ENTRY", 1, 0, false);
            declareFunction("fht_serialization_encoding_input_fn", "FHT-SERIALIZATION-ENCODING-INPUT-FN", 1, 0, false);
            declareFunction("fht_serialization_encoding_output_fn", "FHT-SERIALIZATION-ENCODING-OUTPUT-FN", 1, 0, false);
            declareFunction("fht_serialization_encoding_size_fn", "FHT-SERIALIZATION-ENCODING-SIZE-FN", 1, 0, false);
            declareFunction("fht_serialization_hash_fn", "FHT-SERIALIZATION-HASH-FN", 1, 0, false);
            declareFunction("fht_serialization_encoding_key_input_fn", "FHT-SERIALIZATION-ENCODING-KEY-INPUT-FN", 1, 0, false);
            declareFunction("fht_serialization_encoding_key_output_fn", "FHT-SERIALIZATION-ENCODING-KEY-OUTPUT-FN", 1, 0, false);
            declareMacro("do_fht_serializations", "DO-FHT-SERIALIZATIONS");
            declareFunction("find_fht_serialization_by_functions", "FIND-FHT-SERIALIZATION-BY-FUNCTIONS", 4, 2, false);
            declareMacro("log_fht_lookup", "LOG-FHT-LOOKUP");
            declareFunction("create_file_hash_table", "CREATE-FILE-HASH-TABLE", 2, 3, false);
            declareFunction("open_file_hash_table", "OPEN-FILE-HASH-TABLE", 1, 2, false);
            declareFunction("open_file_hash_table_read_only", "OPEN-FILE-HASH-TABLE-READ-ONLY", 1, 2, false);
            declareFunction("file_hash_table_open_p", "FILE-HASH-TABLE-OPEN-P", 1, 0, false);
            declareFunction("finalize_file_hash_table", "FINALIZE-FILE-HASH-TABLE", 1, 0, false);
            declareFunction("file_hash_table_count", "FILE-HASH-TABLE-COUNT", 1, 0, false);
            declareFunction("file_hash_table_capacity", "FILE-HASH-TABLE-CAPACITY", 1, 0, false);
            declareFunction("put_file_hash_table", "PUT-FILE-HASH-TABLE", 3, 0, false);
            declareFunction("get_file_hash_table", "GET-FILE-HASH-TABLE", 2, 1, false);
            declareFunction("remove_file_hash_table", "REMOVE-FILE-HASH-TABLE", 2, 0, false);
            declareFunction("cinc_file_hash_table", "CINC-FILE-HASH-TABLE", 2, 2, false);
            declareMacro("dosome_file_hash_table", "DOSOME-FILE-HASH-TABLE");
            declareMacro("dosome_pristine_file_hash_table", "DOSOME-PRISTINE-FILE-HASH-TABLE");
            declareMacro("do_file_hash_table", "DO-FILE-HASH-TABLE");
            declareMacro("do_pristine_file_hash_table", "DO-PRISTINE-FILE-HASH-TABLE");
            declareFunction("print_file_hash_table_contents", "PRINT-FILE-HASH-TABLE-CONTENTS", 1, 0, false);
            declareMacro("progress_do_file_hash_table", "PROGRESS-DO-FILE-HASH-TABLE");
            declareMacro("dosome_file_hash_table_keys", "DOSOME-FILE-HASH-TABLE-KEYS");
            declareMacro("do_file_hash_table_keys", "DO-FILE-HASH-TABLE-KEYS");
            declareMacro("do_pristine_file_hash_table_keys", "DO-PRISTINE-FILE-HASH-TABLE-KEYS");
            declareMacro("progress_do_file_hash_table_keys", "PROGRESS-DO-FILE-HASH-TABLE-KEYS");
            declareFunction("file_hash_table_keys", "FILE-HASH-TABLE-KEYS", 1, 0, false);
            declareFunction("file_hash_table_random_n", "FILE-HASH-TABLE-RANDOM-N", 2, 1, false);
            declareFunction("validate_file_hash_table", "VALIDATE-FILE-HASH-TABLE", 1, 1, false);
            declareFunction("recover_file_hash_table_heap", "RECOVER-FILE-HASH-TABLE-HEAP", 1, 1, false);
            declareFunction("new_file_hash_table_iterator", "NEW-FILE-HASH-TABLE-ITERATOR", 1, 1, false);
            declareFunction("new_file_hash_table_keys_iterator", "NEW-FILE-HASH-TABLE-KEYS-ITERATOR", 1, 1, false);
            declareFunction("new_file_hash_table_values_iterator", "NEW-FILE-HASH-TABLE-VALUES-ITERATOR", 1, 1, false);
            declareFunction("iterate_file_hash_table_next_value", "ITERATE-FILE-HASH-TABLE-NEXT-VALUE", 1, 0, false);
            declareFunction("new_file_hash_table_iterator_internal", "NEW-FILE-HASH-TABLE-ITERATOR-INTERNAL", 3, 0, false);
            declareFunction("make_iterator_file_hash_table_state", "MAKE-ITERATOR-FILE-HASH-TABLE-STATE", 3, 0, false);
            declareFunction("iterate_file_hash_table_doneP", "ITERATE-FILE-HASH-TABLE-DONE?", 1, 0, false);
            declareFunction("iterate_file_hash_table_next", "ITERATE-FILE-HASH-TABLE-NEXT", 1, 0, false);
            declareFunction("make_fht_iterator_next", "MAKE-FHT-ITERATOR-NEXT", 3, 0, false);
            declareFunction("fht_iterator_next_value", "FHT-ITERATOR-NEXT-VALUE", 1, 0, false);
            declareFunction("file_hash_table_to_alist", "FILE-HASH-TABLE-TO-ALIST", 1, 0, false);
            declareFunction("hash_table_to_file_hash_table", "HASH-TABLE-TO-FILE-HASH-TABLE", 2, 4, false);
            declareFunction("alist_to_file_hash_table", "ALIST-TO-FILE-HASH-TABLE", 2, 3, false);
            declareFunction("file_hash_table_copy", "FILE-HASH-TABLE-COPY", 2, 5, false);
            declareFunction("get_file_hash_table_storage_resourcing", "GET-FILE-HASH-TABLE-STORAGE-RESOURCING", 1, 0, false);
            declareFunction("set_file_hash_table_storage_resourcing", "SET-FILE-HASH-TABLE-STORAGE-RESOURCING", 1, 1, false);
            declareFunction("file_hash_table_storage_resourcing_onP", "FILE-HASH-TABLE-STORAGE-RESOURCING-ON?", 1, 0, false);
            declareFunction("compute_fht_cache_capacity", "COMPUTE-FHT-CACHE-CAPACITY", 1, 0, false);
            declareFunction("allocate_file_hash_table_caches", "ALLOCATE-FILE-HASH-TABLE-CACHES", 2, 0, false);
            declareFunction("put_fht_lookaside_cache", "PUT-FHT-LOOKASIDE-CACHE", 3, 0, false);
            declareFunction("get_fht_lookaside_cache", "GET-FHT-LOOKASIDE-CACHE", 2, 0, false);
            declareFunction("remove_fht_lookaside_cache", "REMOVE-FHT-LOOKASIDE-CACHE", 2, 0, false);
            declareFunction("get_pristine_file_hash_table_any", "GET-PRISTINE-FILE-HASH-TABLE-ANY", 1, 2, false);
            declareFunction("get_file_hash_table_any", "GET-FILE-HASH-TABLE-ANY", 1, 2, false);
            declareFunction("perform_fht_put", "PERFORM-FHT-PUT", 3, 0, false);
            declareFunction("perform_fht_put_insert", "PERFORM-FHT-PUT-INSERT", 6, 1, false);
            declareFunction("perform_fht_put_replace", "PERFORM-FHT-PUT-REPLACE", 6, 0, false);
            declareFunction("perform_fht_remove", "PERFORM-FHT-REMOVE", 2, 0, false);
            declareFunction("perform_fht_remove_int", "PERFORM-FHT-REMOVE-INT", 4, 0, false);
            declareFunction("clear_fht_key_entry_node", "CLEAR-FHT-KEY-ENTRY-NODE", 2, 0, false);
            declareFunction("fht_fill_key_entry_gap", "FHT-FILL-KEY-ENTRY-GAP", 2, 0, false);
            declareFunction("fht_lookup_key_index_only", "FHT-LOOKUP-KEY-INDEX-ONLY", 3, 0, false);
            declareFunction("increase_fht_item_count", "INCREASE-FHT-ITEM-COUNT", 1, 1, false);
            declareFunction("decrease_fht_item_count", "DECREASE-FHT-ITEM-COUNT", 1, 0, false);
            declareFunction("perform_fht_get", "PERFORM-FHT-GET", 2, 0, false);
            declareFunction("htfile_file_block_entry_print_function_trampoline", "HTFILE-FILE-BLOCK-ENTRY-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
            declareFunction("htfile_file_block_entry_p", "HTFILE-FILE-BLOCK-ENTRY-P", 1, 0, false);
            new file_hash_table.$htfile_file_block_entry_p$UnaryFunction();
            declareFunction("htfile_file_block_entry_size", "HTFILE-FILE-BLOCK-ENTRY-SIZE", 1, 0, false);
            declareFunction("htfile_file_block_entry_next", "HTFILE-FILE-BLOCK-ENTRY-NEXT", 1, 0, false);
            declareFunction("_csetf_htfile_file_block_entry_size", "_CSETF-HTFILE-FILE-BLOCK-ENTRY-SIZE", 2, 0, false);
            declareFunction("_csetf_htfile_file_block_entry_next", "_CSETF-HTFILE-FILE-BLOCK-ENTRY-NEXT", 2, 0, false);
            declareFunction("make_htfile_file_block_entry", "MAKE-HTFILE-FILE-BLOCK-ENTRY", 0, 1, false);
            declareFunction("visit_defstruct_htfile_file_block_entry", "VISIT-DEFSTRUCT-HTFILE-FILE-BLOCK-ENTRY", 2, 0, false);
            declareFunction("visit_defstruct_object_htfile_file_block_entry_method", "VISIT-DEFSTRUCT-OBJECT-HTFILE-FILE-BLOCK-ENTRY-METHOD", 2, 0, false);
            declareFunction("new_htfile_file_block_entry", "NEW-HTFILE-FILE-BLOCK-ENTRY", 0, 1, false);
            declareFunction("print_htfile_file_block_entry", "PRINT-HTFILE-FILE-BLOCK-ENTRY", 3, 0, false);
            declareFunction("copy_file_block", "COPY-FILE-BLOCK", 2, 0, false);
            declareFunction("write_file_block_entry_to_space", "WRITE-FILE-BLOCK-ENTRY-TO-SPACE", 3, 0, false);
            declareFunction("read_file_block_entry_from_space", "READ-FILE-BLOCK-ENTRY-FROM-SPACE", 3, 0, false);
            declareFunction("deallocate_object_space", "DEALLOCATE-OBJECT-SPACE", 3, 0, false);
            declareFunction("insert_file_block_in_free_list", "INSERT-FILE-BLOCK-IN-FREE-LIST", 4, 0, false);
            declareFunction("allocate_object_space_from_free_list", "ALLOCATE-OBJECT-SPACE-FROM-FREE-LIST", 2, 0, false);
            declareFunction("write_initial_table", "WRITE-INITIAL-TABLE", 1, 0, false);
            declareFunction("allocate_fht_heap_space", "ALLOCATE-FHT-HEAP-SPACE", 1, 0, false);
            declareFunction("allocate_fht_key_space", "ALLOCATE-FHT-KEY-SPACE", 1, 1, false);
            declareFunction("htfile_minimal_space_required_for_key", "HTFILE-MINIMAL-SPACE-REQUIRED-FOR-KEY", 0, 0, false);
            declareFunction("fht_key_index_to_reladdr", "FHT-KEY-INDEX-TO-RELADDR", 1, 0, false);
            declareFunction("fht_keyspace_byte_size", "FHT-KEYSPACE-BYTE-SIZE", 1, 0, false);
            declareFunction("valid_heap_offset_p", "VALID-HEAP-OFFSET-P", 3, 0, false);
            declareFunction("valid_fht_heap_offset_p", "VALID-FHT-HEAP-OFFSET-P", 2, 0, false);
            declareFunction("valid_offset_in_keyspace_p", "VALID-OFFSET-IN-KEYSPACE-P", 3, 0, false);
            declareFunction("fht_get_keyspace_size", "FHT-GET-KEYSPACE-SIZE", 1, 0, false);
            declareFunction("fht_key_reladdr_to_address", "FHT-KEY-RELADDR-TO-ADDRESS", 2, 0, false);
            declareFunction("fht_key_index_to_address", "FHT-KEY-INDEX-TO-ADDRESS", 2, 0, false);
            declareFunction("validate_fht_key_index", "VALIDATE-FHT-KEY-INDEX", 2, 0, false);
            declareFunction("validate_fht_key_entry", "VALIDATE-FHT-KEY-ENTRY", 2, 0, false);
            declareFunction("write_key_entry_object", "WRITE-KEY-ENTRY-OBJECT", 2, 0, false);
            declareFunction("read_key_entry_object", "READ-KEY-ENTRY-OBJECT", 2, 0, false);
            declareFunction("fetch_fht_key_entry", "FETCH-FHT-KEY-ENTRY", 3, 0, false);
            declareFunction("store_fht_key_entry", "STORE-FHT-KEY-ENTRY", 3, 1, false);
            declareFunction("fht_hash", "FHT-HASH", 2, 0, false);
            declareFunction("fht_ensure_hash_table_size", "FHT-ENSURE-HASH-TABLE-SIZE", 1, 0, false);
            declareFunction("fht_compute_fence_post_index", "FHT-COMPUTE-FENCE-POST-INDEX", 2, 0, false);
            declareFunction("fht_step_key_index", "FHT-STEP-KEY-INDEX", 2, 0, false);
            declareFunction("fht_lookup_key", "FHT-LOOKUP-KEY", 2, 1, false);
            declareFunction("identical_fht_key_entryP", "IDENTICAL-FHT-KEY-ENTRY?", 5, 0, false);
            declareFunction("complete_fht_object_entry_for_key", "COMPLETE-FHT-OBJECT-ENTRY-FOR-KEY", 3, 1, false);
            declareFunction("potentially_grow_fht_table", "POTENTIALLY-GROW-FHT-TABLE", 1, 0, false);
            declareFunction("perform_grow_fht_table", "PERFORM-GROW-FHT-TABLE", 1, 0, false);
            declareFunction("is_fht_too_smallP", "IS-FHT-TOO-SMALL?", 1, 0, false);
            declareFunction("resize_fht_object_and_key_spaces", "RESIZE-FHT-OBJECT-AND-KEY-SPACES", 1, 0, false);
            declareFunction("allocate_new_fht_key_space", "ALLOCATE-NEW-FHT-KEY-SPACE", 3, 0, false);
            declareFunction("move_htfile_key_space", "MOVE-HTFILE-KEY-SPACE", 3, 0, false);
            declareFunction("rehash_fht_key_space", "REHASH-FHT-KEY-SPACE", 3, 0, false);
            declareMacro("with_different_keyspace", "WITH-DIFFERENT-KEYSPACE");
            declareFunction("rehash_fht_cached_keys", "REHASH-FHT-CACHED-KEYS", 6, 0, false);
            declareFunction("handle_rehash_fht_insert", "HANDLE-REHASH-FHT-INSERT", 5, 0, false);
            declareFunction("htfile_minimal_space_required_for_object", "HTFILE-MINIMAL-SPACE-REQUIRED-FOR-OBJECT", 0, 0, false);
            declareFunction("specify_object_entry", "SPECIFY-OBJECT-ENTRY", 3, 1, false);
            declareFunction("compute_object_entry_size", "COMPUTE-OBJECT-ENTRY-SIZE", 2, 0, false);
            declareFunction("allocate_object_space", "ALLOCATE-OBJECT-SPACE", 2, 0, false);
            declareFunction("store_fht_object_entry", "STORE-FHT-OBJECT-ENTRY", 3, 0, false);
            declareFunction("write_object_entry_to_space", "WRITE-OBJECT-ENTRY-TO-SPACE", 3, 0, false);
            declareFunction("read_object_entry_from_space", "READ-OBJECT-ENTRY-FROM-SPACE", 3, 1, false);
            declareFunction("increase_htfile_heap_size", "INCREASE-HTFILE-HEAP-SIZE", 2, 0, false);
            declareFunction("compute_new_htfile_heap_size", "COMPUTE-NEW-HTFILE-HEAP-SIZE", 1, 1, false);
            declareMacro("register_file_table_header_support", "REGISTER-FILE-TABLE-HEADER-SUPPORT");
            declareFunction("read_fht_header", "READ-FHT-HEADER", 1, 0, false);
            declareFunction("write_fht_header", "WRITE-FHT-HEADER", 1, 0, false);
            declareFunction("read_fht_header_version1p3", "READ-FHT-HEADER-VERSION1P3", 1, 0, false);
            declareFunction("write_fht_header_version1p3", "WRITE-FHT-HEADER-VERSION1P3", 1, 0, false);
            declareFunction("read_fht_extension_space", "READ-FHT-EXTENSION-SPACE", 1, 0, false);
            declareFunction("write_fht_extension_space", "WRITE-FHT-EXTENSION-SPACE", 1, 0, false);
            declareFunction("verify_version1p3_crc", "VERIFY-VERSION1P3-CRC", 1, 0, false);
            declareFunction("read_fht_uint4", "READ-FHT-UINT4", 1, 0, false);
            declareFunction("write_fht_uint4", "WRITE-FHT-UINT4", 2, 0, false);
            declareFunction("read_fht_uint8", "READ-FHT-UINT8", 1, 0, false);
            declareFunction("write_fht_uint8", "WRITE-FHT-UINT8", 2, 0, false);
            declareFunction("write_null_fht_bytes", "WRITE-NULL-FHT-BYTES", 2, 0, false);
            declareFunction("read_fht_encoded_object", "READ-FHT-ENCODED-OBJECT", 2, 0, false);
            declareFunction("write_fht_encoded_object", "WRITE-FHT-ENCODED-OBJECT", 4, 0, false);
            declareFunction("read_fht_binary_block", "READ-FHT-BINARY-BLOCK", 3, 0, false);
            declareFunction("write_fht_binary_block", "WRITE-FHT-BINARY-BLOCK", 3, 0, false);
            declareFunction("move_fht_binary_block", "MOVE-FHT-BINARY-BLOCK", 5, 0, false);
            declareFunction("aggressive_fast_fht_optimization_modeP", "AGGRESSIVE-FAST-FHT-OPTIMIZATION-MODE?", 0, 0, false);
            declareFunction("moderate_fast_fht_optimization_modeP", "MODERATE-FAST-FHT-OPTIMIZATION-MODE?", 0, 0, false);
            declareFunction("conservative_fast_fht_optimization_modeP", "CONSERVATIVE-FAST-FHT-OPTIMIZATION-MODE?", 0, 0, false);
            declareFunction("invalid_fast_fht_optimization_mode", "INVALID-FAST-FHT-OPTIMIZATION-MODE", 0, 0, false);
            declareFunction("fast_create_fht_print_function_trampoline", "FAST-CREATE-FHT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
            declareFunction("fast_create_fht_p", "FAST-CREATE-FHT-P", 1, 0, false);
            new file_hash_table.$fast_create_fht_p$UnaryFunction();
            declareFunction("fast_create_fht_fht", "FAST-CREATE-FHT-FHT", 1, 0, false);
            declareFunction("fast_create_fht_tempstem", "FAST-CREATE-FHT-TEMPSTEM", 1, 0, false);
            declareFunction("fast_create_fht_tempfile", "FAST-CREATE-FHT-TEMPFILE", 1, 0, false);
            declareFunction("fast_create_fht_keystream", "FAST-CREATE-FHT-KEYSTREAM", 1, 0, false);
            declareFunction("_csetf_fast_create_fht_fht", "_CSETF-FAST-CREATE-FHT-FHT", 2, 0, false);
            declareFunction("_csetf_fast_create_fht_tempstem", "_CSETF-FAST-CREATE-FHT-TEMPSTEM", 2, 0, false);
            declareFunction("_csetf_fast_create_fht_tempfile", "_CSETF-FAST-CREATE-FHT-TEMPFILE", 2, 0, false);
            declareFunction("_csetf_fast_create_fht_keystream", "_CSETF-FAST-CREATE-FHT-KEYSTREAM", 2, 0, false);
            declareFunction("make_fast_create_fht", "MAKE-FAST-CREATE-FHT", 0, 1, false);
            declareFunction("visit_defstruct_fast_create_fht", "VISIT-DEFSTRUCT-FAST-CREATE-FHT", 2, 0, false);
            declareFunction("visit_defstruct_object_fast_create_fht_method", "VISIT-DEFSTRUCT-OBJECT-FAST-CREATE-FHT-METHOD", 2, 0, false);
            declareFunction("fast_create_file_hash_table", "FAST-CREATE-FILE-HASH-TABLE", 1, 3, false);
            declareFunction("fast_create_allocate_keystream", "FAST-CREATE-ALLOCATE-KEYSTREAM", 1, 0, false);
            declareFunction("fast_create_fixup_object_heap", "FAST-CREATE-FIXUP-OBJECT-HEAP", 1, 0, false);
            declareFunction("fast_put_file_hash_table", "FAST-PUT-FILE-HASH-TABLE", 3, 0, false);
            declareFunction("perform_fast_fht_put", "PERFORM-FAST-FHT-PUT", 3, 0, false);
            declareFunction("update_fast_fht_keystream", "UPDATE-FAST-FHT-KEYSTREAM", 3, 0, false);
            declareFunction("finalize_fast_create_file_hash_table", "FINALIZE-FAST-CREATE-FILE-HASH-TABLE", 1, 2, false);
            declareFunction("prepare_fast_fht_keyspace", "PREPARE-FAST-FHT-KEYSPACE", 1, 0, false);
            declareFunction("realign_fast_fht_keyspace_offset", "REALIGN-FAST-FHT-KEYSPACE-OFFSET", 1, 0, false);
            declareFunction("realign_fast_fht_keyspace_capacity", "REALIGN-FAST-FHT-KEYSPACE-CAPACITY", 1, 0, false);
            declareFunction("allocate_fast_fht_keyspace", "ALLOCATE-FAST-FHT-KEYSPACE", 1, 0, false);
            declareFunction("insert_fast_fht_keystream_content", "INSERT-FAST-FHT-KEYSTREAM-CONTENT", 1, 2, false);
            declareFunction("perform_fast_fht_insert_of_unambiguous_keys", "PERFORM-FAST-FHT-INSERT-OF-UNAMBIGUOUS-KEYS", 2, 0, false);
            declareFunction("perform_fast_fht_insert_by_keystream_ordering", "PERFORM-FAST-FHT-INSERT-BY-KEYSTREAM-ORDERING", 4, 0, false);
            declareFunction("shutdown_fast_create_fht", "SHUTDOWN-FAST-CREATE-FHT", 1, 1, false);
            declareFunction("fast_fht_keystream_sorter_print_function_trampoline", "FAST-FHT-KEYSTREAM-SORTER-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
            declareFunction("fast_fht_keystream_sorter_p", "FAST-FHT-KEYSTREAM-SORTER-P", 1, 0, false);
            new file_hash_table.$fast_fht_keystream_sorter_p$UnaryFunction();
            declareFunction("fstfht_ksorter_tempstem", "FSTFHT-KSORTER-TEMPSTEM", 1, 0, false);
            declareFunction("fstfht_ksorter_in_files", "FSTFHT-KSORTER-IN-FILES", 1, 0, false);
            declareFunction("fstfht_ksorter_out_files", "FSTFHT-KSORTER-OUT-FILES", 1, 0, false);
            declareFunction("_csetf_fstfht_ksorter_tempstem", "_CSETF-FSTFHT-KSORTER-TEMPSTEM", 2, 0, false);
            declareFunction("_csetf_fstfht_ksorter_in_files", "_CSETF-FSTFHT-KSORTER-IN-FILES", 2, 0, false);
            declareFunction("_csetf_fstfht_ksorter_out_files", "_CSETF-FSTFHT-KSORTER-OUT-FILES", 2, 0, false);
            declareFunction("make_fast_fht_keystream_sorter", "MAKE-FAST-FHT-KEYSTREAM-SORTER", 0, 1, false);
            declareFunction("visit_defstruct_fast_fht_keystream_sorter", "VISIT-DEFSTRUCT-FAST-FHT-KEYSTREAM-SORTER", 2, 0, false);
            declareFunction("visit_defstruct_object_fast_fht_keystream_sorter_method", "VISIT-DEFSTRUCT-OBJECT-FAST-FHT-KEYSTREAM-SORTER-METHOD", 2, 0, false);
            declareFunction("fast_fht_sort_keystream_by_expected_index", "FAST-FHT-SORT-KEYSTREAM-BY-EXPECTED-INDEX", 3, 2, false);
            declareFunction("new_fast_fht_keystream_sorter", "NEW-FAST-FHT-KEYSTREAM-SORTER", 1, 0, false);
            declareFunction("fast_fht_n_temp_files", "FAST-FHT-N-TEMP-FILES", 3, 0, false);
            declareFunction("fast_fht_split_keystream_into_tiled_input_files", "FAST-FHT-SPLIT-KEYSTREAM-INTO-TILED-INPUT-FILES", 3, 0, false);
            declareFunction("fast_fht_read_one_keystream_entry", "FAST-FHT-READ-ONE-KEYSTREAM-ENTRY", 2, 1, false);
            declareFunction("fast_fht_keystream_sentinel_entry", "FAST-FHT-KEYSTREAM-SENTINEL-ENTRY", 0, 1, false);
            declareFunction("fast_fht_keystream_eof_entry", "FAST-FHT-KEYSTREAM-EOF-ENTRY", 0, 1, false);
            declareFunction("fast_fht_keystream_entry_cmp", "FAST-FHT-KEYSTREAM-ENTRY-CMP", 2, 0, false);
            declareFunction("fast_fht_keystream_entryL", "FAST-FHT-KEYSTREAM-ENTRY<", 2, 0, false);
            declareFunction("fast_fht_write_one_keystream_tile", "FAST-FHT-WRITE-ONE-KEYSTREAM-TILE", 2, 0, false);
            declareFunction("is_fast_fht_keystream_chunk_separator_entryP", "IS-FAST-FHT-KEYSTREAM-CHUNK-SEPARATOR-ENTRY?", 1, 0, false);
            declareFunction("is_fast_fht_keystream_eofP", "IS-FAST-FHT-KEYSTREAM-EOF?", 1, 0, false);
            declareFunction("fast_fht_write_keystream_chunk_separator", "FAST-FHT-WRITE-KEYSTREAM-CHUNK-SEPARATOR", 1, 0, false);
            declareFunction("fast_fht_write_keystream_entry", "FAST-FHT-WRITE-KEYSTREAM-ENTRY", 3, 1, false);
            declareFunction("fast_fht_write_one_keystream_entry", "FAST-FHT-WRITE-ONE-KEYSTREAM-ENTRY", 2, 0, false);
            declareFunction("fast_fht_write_one_collision_stream_entry", "FAST-FHT-WRITE-ONE-COLLISION-STREAM-ENTRY", 3, 0, false);
            declareFunction("fast_fht_almost_merge_sort_keystream", "FAST-FHT-ALMOST-MERGE-SORT-KEYSTREAM", 2, 1, false);
            declareFunction("fast_fht_merge_keystream_input_files", "FAST-FHT-MERGE-KEYSTREAM-INPUT-FILES", 3, 0, false);
            declareFunction("fast_fht_merge_keystream_chunks", "FAST-FHT-MERGE-KEYSTREAM-CHUNKS", 4, 0, false);
            declareMacro("fast_fht_drain_index_run", "FAST-FHT-DRAIN-INDEX-RUN");
            declareMacro("fast_fht_manage_index_collisions", "FAST-FHT-MANAGE-INDEX-COLLISIONS");
            declareFunction("fast_fht_uniquify_keystream", "FAST-FHT-UNIQUIFY-KEYSTREAM", 2, 0, false);
            declareFunction("fast_fht_get_comparable_index_from_entry", "FAST-FHT-GET-COMPARABLE-INDEX-FROM-ENTRY", 1, 0, false);
            declareFunction("fast_fht_dump_keystream", "FAST-FHT-DUMP-KEYSTREAM", 2, 1, false);
            declareFunction("fast_fht_dump_keystream_files", "FAST-FHT-DUMP-KEYSTREAM-FILES", 2, 1, false);
            declareFunction("enforce_valid_fast_fht_dump_keystream_files", "ENFORCE-VALID-FAST-FHT-DUMP-KEYSTREAM-FILES", 2, 0, false);
            declareFunction("validate_fast_fht_dump_keystream", "VALIDATE-FAST-FHT-DUMP-KEYSTREAM", 2, 0, false);
            declareFunction("test_fast_fht_keystream_entry_cmp", "TEST-FAST-FHT-KEYSTREAM-ENTRY-CMP", 2, 0, false);
            declareFunction("fast_fht_keystream_entry_cmp_expand_argument", "FAST-FHT-KEYSTREAM-ENTRY-CMP-EXPAND-ARGUMENT", 1, 0, false);
            declareMacro("with_input_file_hash_table", "WITH-INPUT-FILE-HASH-TABLE");
            declareMacro("with_writable_file_hash_table", "WITH-WRITABLE-FILE-HASH-TABLE");
            declareMacro("with_output_file_hash_table", "WITH-OUTPUT-FILE-HASH-TABLE");
            declareMacro("with_fast_create_file_hash_table", "WITH-FAST-CREATE-FILE-HASH-TABLE");
            declareFunction("test_fast_fht_creation_with_merge_sorted_keystream", "TEST-FAST-FHT-CREATION-WITH-MERGE-SORTED-KEYSTREAM", 3, 0, false);
            declareFunction("test_fast_fht_creation_with_map_contents", "TEST-FAST-FHT-CREATION-WITH-MAP-CONTENTS", 1, 2, false);
            declareFunction("test_fast_fht_with_kb_contents", "TEST-FAST-FHT-WITH-KB-CONTENTS", 4, 3, false);
            declareFunction("test_ffhtkb_generate_constant_info", "TEST-FFHTKB-GENERATE-CONSTANT-INFO", 0, 0, false);
            declareFunction("test_ffhtkb_grab_constant_key_info", "TEST-FFHTKB-GRAB-CONSTANT-KEY-INFO", 1, 0, false);
            declareFunction("test_ffhtkb_grab_constant_value_info", "TEST-FFHTKB-GRAB-CONSTANT-VALUE-INFO", 1, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("store_fht_key_entry", "STORE-FHT-KEY-ENTRY", 3, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_file_hash_table_file_Previous() {
        declareFunction("file_hash_table_print_function_trampoline", "FILE-HASH-TABLE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("file_hash_table_p", "FILE-HASH-TABLE-P", 1, 0, false);
        new file_hash_table.$file_hash_table_p$UnaryFunction();
        declareFunction("file_hash_table_stream", "FILE-HASH-TABLE-STREAM", 1, 0, false);
        declareFunction("file_hash_table_header", "FILE-HASH-TABLE-HEADER", 1, 0, false);
        declareFunction("file_hash_table_lock", "FILE-HASH-TABLE-LOCK", 1, 0, false);
        declareFunction("file_hash_table_encoding_input_fn", "FILE-HASH-TABLE-ENCODING-INPUT-FN", 1, 0, false);
        declareFunction("file_hash_table_encoding_output_fn", "FILE-HASH-TABLE-ENCODING-OUTPUT-FN", 1, 0, false);
        declareFunction("file_hash_table_encoding_size_fn", "FILE-HASH-TABLE-ENCODING-SIZE-FN", 1, 0, false);
        declareFunction("file_hash_table_encoding_key_input_fn", "FILE-HASH-TABLE-ENCODING-KEY-INPUT-FN", 1, 0, false);
        declareFunction("file_hash_table_encoding_key_output_fn", "FILE-HASH-TABLE-ENCODING-KEY-OUTPUT-FN", 1, 0, false);
        declareFunction("file_hash_table_testfn", "FILE-HASH-TABLE-TESTFN", 1, 0, false);
        declareFunction("file_hash_table_hash_fn", "FILE-HASH-TABLE-HASH-FN", 1, 0, false);
        declareFunction("file_hash_table_input_cache", "FILE-HASH-TABLE-INPUT-CACHE", 1, 0, false);
        declareFunction("file_hash_table_output_cache", "FILE-HASH-TABLE-OUTPUT-CACHE", 1, 0, false);
        declareFunction("file_hash_table_property_list", "FILE-HASH-TABLE-PROPERTY-LIST", 1, 0, false);
        declareFunction("_csetf_file_hash_table_stream", "_CSETF-FILE-HASH-TABLE-STREAM", 2, 0, false);
        declareFunction("_csetf_file_hash_table_header", "_CSETF-FILE-HASH-TABLE-HEADER", 2, 0, false);
        declareFunction("_csetf_file_hash_table_lock", "_CSETF-FILE-HASH-TABLE-LOCK", 2, 0, false);
        declareFunction("_csetf_file_hash_table_encoding_input_fn", "_CSETF-FILE-HASH-TABLE-ENCODING-INPUT-FN", 2, 0, false);
        declareFunction("_csetf_file_hash_table_encoding_output_fn", "_CSETF-FILE-HASH-TABLE-ENCODING-OUTPUT-FN", 2, 0, false);
        declareFunction("_csetf_file_hash_table_encoding_size_fn", "_CSETF-FILE-HASH-TABLE-ENCODING-SIZE-FN", 2, 0, false);
        declareFunction("_csetf_file_hash_table_encoding_key_input_fn", "_CSETF-FILE-HASH-TABLE-ENCODING-KEY-INPUT-FN", 2, 0, false);
        declareFunction("_csetf_file_hash_table_encoding_key_output_fn", "_CSETF-FILE-HASH-TABLE-ENCODING-KEY-OUTPUT-FN", 2, 0, false);
        declareFunction("_csetf_file_hash_table_testfn", "_CSETF-FILE-HASH-TABLE-TESTFN", 2, 0, false);
        declareFunction("_csetf_file_hash_table_hash_fn", "_CSETF-FILE-HASH-TABLE-HASH-FN", 2, 0, false);
        declareFunction("_csetf_file_hash_table_input_cache", "_CSETF-FILE-HASH-TABLE-INPUT-CACHE", 2, 0, false);
        declareFunction("_csetf_file_hash_table_output_cache", "_CSETF-FILE-HASH-TABLE-OUTPUT-CACHE", 2, 0, false);
        declareFunction("_csetf_file_hash_table_property_list", "_CSETF-FILE-HASH-TABLE-PROPERTY-LIST", 2, 0, false);
        declareFunction("make_file_hash_table", "MAKE-FILE-HASH-TABLE", 0, 1, false);
        declareFunction("visit_defstruct_file_hash_table", "VISIT-DEFSTRUCT-FILE-HASH-TABLE", 2, 0, false);
        declareFunction("visit_defstruct_object_file_hash_table_method", "VISIT-DEFSTRUCT-OBJECT-FILE-HASH-TABLE-METHOD", 2, 0, false);
        declareFunction("describe_file_hash_table", "DESCRIBE-FILE-HASH-TABLE", 1, 1, false);
        declareFunction("read_only_file_hash_table_p", "READ-ONLY-FILE-HASH-TABLE-P", 1, 0, false);
        declareFunction("writeable_file_hash_table_p", "WRITEABLE-FILE-HASH-TABLE-P", 1, 0, false);
        declareFunction("file_hash_table_is_read_onlyP", "FILE-HASH-TABLE-IS-READ-ONLY?", 1, 0, false);
        declareFunction("file_hash_table_path", "FILE-HASH-TABLE-PATH", 1, 0, false);
        declareFunction("file_hash_table_serialization", "FILE-HASH-TABLE-SERIALIZATION", 1, 0, false);
        declareFunction("file_hash_table_change_stream_buffer_size", "FILE-HASH-TABLE-CHANGE-STREAM-BUFFER-SIZE", 2, 0, false);
        declareFunction("file_hash_table_enable_memory_mapping", "FILE-HASH-TABLE-ENABLE-MEMORY-MAPPING", 1, 0, false);
        declareFunction("file_hash_table_memory_mappedP", "FILE-HASH-TABLE-MEMORY-MAPPED?", 1, 0, false);
        declareFunction("htfile_header_print_function_trampoline", "HTFILE-HEADER-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("htfile_header_p", "HTFILE-HEADER-P", 1, 0, false);
        new file_hash_table.$htfile_header_p$UnaryFunction();
        declareFunction("htfile_header_size", "HTFILE-HEADER-SIZE", 1, 0, false);
        declareFunction("htfile_header_version_major", "HTFILE-HEADER-VERSION-MAJOR", 1, 0, false);
        declareFunction("htfile_header_version_minor", "HTFILE-HEADER-VERSION-MINOR", 1, 0, false);
        declareFunction("htfile_header_object_space_offset", "HTFILE-HEADER-OBJECT-SPACE-OFFSET", 1, 0, false);
        declareFunction("htfile_header_key_space_offset", "HTFILE-HEADER-KEY-SPACE-OFFSET", 1, 0, false);
        declareFunction("htfile_header_current_heap_top", "HTFILE-HEADER-CURRENT-HEAP-TOP", 1, 0, false);
        declareFunction("htfile_header_item_count", "HTFILE-HEADER-ITEM-COUNT", 1, 0, false);
        declareFunction("htfile_header_capacity", "HTFILE-HEADER-CAPACITY", 1, 0, false);
        declareFunction("htfile_header_free_list_head", "HTFILE-HEADER-FREE-LIST-HEAD", 1, 0, false);
        declareFunction("htfile_header_deletion_count", "HTFILE-HEADER-DELETION-COUNT", 1, 0, false);
        declareFunction("htfile_header_header_crc", "HTFILE-HEADER-HEADER-CRC", 1, 0, false);
        declareFunction("htfile_header_extension_space_size", "HTFILE-HEADER-EXTENSION-SPACE-SIZE", 1, 0, false);
        declareFunction("htfile_header_extension_space", "HTFILE-HEADER-EXTENSION-SPACE", 1, 0, false);
        declareFunction("_csetf_htfile_header_size", "_CSETF-HTFILE-HEADER-SIZE", 2, 0, false);
        declareFunction("_csetf_htfile_header_version_major", "_CSETF-HTFILE-HEADER-VERSION-MAJOR", 2, 0, false);
        declareFunction("_csetf_htfile_header_version_minor", "_CSETF-HTFILE-HEADER-VERSION-MINOR", 2, 0, false);
        declareFunction("_csetf_htfile_header_object_space_offset", "_CSETF-HTFILE-HEADER-OBJECT-SPACE-OFFSET", 2, 0, false);
        declareFunction("_csetf_htfile_header_key_space_offset", "_CSETF-HTFILE-HEADER-KEY-SPACE-OFFSET", 2, 0, false);
        declareFunction("_csetf_htfile_header_current_heap_top", "_CSETF-HTFILE-HEADER-CURRENT-HEAP-TOP", 2, 0, false);
        declareFunction("_csetf_htfile_header_item_count", "_CSETF-HTFILE-HEADER-ITEM-COUNT", 2, 0, false);
        declareFunction("_csetf_htfile_header_capacity", "_CSETF-HTFILE-HEADER-CAPACITY", 2, 0, false);
        declareFunction("_csetf_htfile_header_free_list_head", "_CSETF-HTFILE-HEADER-FREE-LIST-HEAD", 2, 0, false);
        declareFunction("_csetf_htfile_header_deletion_count", "_CSETF-HTFILE-HEADER-DELETION-COUNT", 2, 0, false);
        declareFunction("_csetf_htfile_header_header_crc", "_CSETF-HTFILE-HEADER-HEADER-CRC", 2, 0, false);
        declareFunction("_csetf_htfile_header_extension_space_size", "_CSETF-HTFILE-HEADER-EXTENSION-SPACE-SIZE", 2, 0, false);
        declareFunction("_csetf_htfile_header_extension_space", "_CSETF-HTFILE-HEADER-EXTENSION-SPACE", 2, 0, false);
        declareFunction("make_htfile_header", "MAKE-HTFILE-HEADER", 0, 1, false);
        declareFunction("visit_defstruct_htfile_header", "VISIT-DEFSTRUCT-HTFILE-HEADER", 2, 0, false);
        declareFunction("visit_defstruct_object_htfile_header_method", "VISIT-DEFSTRUCT-OBJECT-HTFILE-HEADER-METHOD", 2, 0, false);
        declareFunction("describe_htfile_header", "DESCRIBE-HTFILE-HEADER", 1, 1, false);
        declareFunction("htfile_object_entry_print_function_trampoline", "HTFILE-OBJECT-ENTRY-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("htfile_object_entry_p", "HTFILE-OBJECT-ENTRY-P", 1, 0, false);
        new file_hash_table.$htfile_object_entry_p$UnaryFunction();
        declareFunction("htfile_object_entry_size", "HTFILE-OBJECT-ENTRY-SIZE", 1, 0, false);
        declareFunction("htfile_object_entry_type", "HTFILE-OBJECT-ENTRY-TYPE", 1, 0, false);
        declareFunction("htfile_object_entry_key_size", "HTFILE-OBJECT-ENTRY-KEY-SIZE", 1, 0, false);
        declareFunction("htfile_object_entry_key", "HTFILE-OBJECT-ENTRY-KEY", 1, 0, false);
        declareFunction("htfile_object_entry_data_size", "HTFILE-OBJECT-ENTRY-DATA-SIZE", 1, 0, false);
        declareFunction("htfile_object_entry_data", "HTFILE-OBJECT-ENTRY-DATA", 1, 0, false);
        declareFunction("_csetf_htfile_object_entry_size", "_CSETF-HTFILE-OBJECT-ENTRY-SIZE", 2, 0, false);
        declareFunction("_csetf_htfile_object_entry_type", "_CSETF-HTFILE-OBJECT-ENTRY-TYPE", 2, 0, false);
        declareFunction("_csetf_htfile_object_entry_key_size", "_CSETF-HTFILE-OBJECT-ENTRY-KEY-SIZE", 2, 0, false);
        declareFunction("_csetf_htfile_object_entry_key", "_CSETF-HTFILE-OBJECT-ENTRY-KEY", 2, 0, false);
        declareFunction("_csetf_htfile_object_entry_data_size", "_CSETF-HTFILE-OBJECT-ENTRY-DATA-SIZE", 2, 0, false);
        declareFunction("_csetf_htfile_object_entry_data", "_CSETF-HTFILE-OBJECT-ENTRY-DATA", 2, 0, false);
        declareFunction("make_htfile_object_entry", "MAKE-HTFILE-OBJECT-ENTRY", 0, 1, false);
        declareFunction("visit_defstruct_htfile_object_entry", "VISIT-DEFSTRUCT-HTFILE-OBJECT-ENTRY", 2, 0, false);
        declareFunction("visit_defstruct_object_htfile_object_entry_method", "VISIT-DEFSTRUCT-OBJECT-HTFILE-OBJECT-ENTRY-METHOD", 2, 0, false);
        declareFunction("htfile_key_entry_print_function_trampoline", "HTFILE-KEY-ENTRY-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("htfile_key_entry_p", "HTFILE-KEY-ENTRY-P", 1, 0, false);
        new file_hash_table.$htfile_key_entry_p$UnaryFunction();
        declareFunction("htfile_key_entry_key_offset", "HTFILE-KEY-ENTRY-KEY-OFFSET", 1, 0, false);
        declareFunction("htfile_key_entry_hash_code", "HTFILE-KEY-ENTRY-HASH-CODE", 1, 0, false);
        declareFunction("_csetf_htfile_key_entry_key_offset", "_CSETF-HTFILE-KEY-ENTRY-KEY-OFFSET", 2, 0, false);
        declareFunction("_csetf_htfile_key_entry_hash_code", "_CSETF-HTFILE-KEY-ENTRY-HASH-CODE", 2, 0, false);
        declareFunction("make_htfile_key_entry", "MAKE-HTFILE-KEY-ENTRY", 0, 1, false);
        declareFunction("visit_defstruct_htfile_key_entry", "VISIT-DEFSTRUCT-HTFILE-KEY-ENTRY", 2, 0, false);
        declareFunction("visit_defstruct_object_htfile_key_entry_method", "VISIT-DEFSTRUCT-OBJECT-HTFILE-KEY-ENTRY-METHOD", 2, 0, false);
        declareFunction("get_default_fht_test_function", "GET-DEFAULT-FHT-TEST-FUNCTION", 0, 0, false);
        declareFunction("get_default_fht_serialization_protocol", "GET-DEFAULT-FHT-SERIALIZATION-PROTOCOL", 0, 0, false);
        declareFunction("new_htfile_header", "NEW-HTFILE-HEADER", 0, 0, false);
        declareFunction("construct_empty_htfile_header", "CONSTRUCT-EMPTY-HTFILE-HEADER", 1, 1, false);
        declareFunction("htfile_scale_user_space_to_implementation_space", "HTFILE-SCALE-USER-SPACE-TO-IMPLEMENTATION-SPACE", 1, 0, false);
        declareFunction("htfile_minimal_space_required", "HTFILE-MINIMAL-SPACE-REQUIRED", 0, 0, false);
        declareFunction("new_file_hash_table", "NEW-FILE-HASH-TABLE", 5, 3, false);
        declareFunction("new_empty_file_hash_table", "NEW-EMPTY-FILE-HASH-TABLE", 6, 4, false);
        declareFunction("new_htfile_key_entry", "NEW-HTFILE-KEY-ENTRY", 1, 1, false);
        declareFunction("construct_tombstone_key_entry", "CONSTRUCT-TOMBSTONE-KEY-ENTRY", 0, 0, false);
        declareFunction("is_tombstoned_key_entryP", "IS-TOMBSTONED-KEY-ENTRY?", 1, 0, false);
        declareFunction("construct_empty_key_entry", "CONSTRUCT-EMPTY-KEY-ENTRY", 0, 0, false);
        declareFunction("is_empty_key_entryP", "IS-EMPTY-KEY-ENTRY?", 1, 0, false);
        declareFunction("is_valid_key_entryP", "IS-VALID-KEY-ENTRY?", 2, 0, false);
        declareFunction("fht_sxhash_for_fht", "FHT-SXHASH-FOR-FHT", 2, 0, false);
        declareFunction("fht_sxhash", "FHT-SXHASH", 2, 0, false);
        declareFunction("valid_hash_code_p", "VALID-HASH-CODE-P", 1, 0, false);
        declareFunction("new_object_entry", "NEW-OBJECT-ENTRY", 2, 0, false);
        declareFunction("fht_serialization_entry_print_function_trampoline", "FHT-SERIALIZATION-ENTRY-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("fht_serialization_entry_p", "FHT-SERIALIZATION-ENTRY-P", 1, 0, false);
        new file_hash_table.$fht_serialization_entry_p$UnaryFunction();
        declareFunction("fht_se_encoding_input_fn", "FHT-SE-ENCODING-INPUT-FN", 1, 0, false);
        declareFunction("fht_se_encoding_output_fn", "FHT-SE-ENCODING-OUTPUT-FN", 1, 0, false);
        declareFunction("fht_se_encoding_size_fn", "FHT-SE-ENCODING-SIZE-FN", 1, 0, false);
        declareFunction("fht_se_hash_fn", "FHT-SE-HASH-FN", 1, 0, false);
        declareFunction("fht_se_encoding_key_input_fn", "FHT-SE-ENCODING-KEY-INPUT-FN", 1, 0, false);
        declareFunction("fht_se_encoding_key_output_fn", "FHT-SE-ENCODING-KEY-OUTPUT-FN", 1, 0, false);
        declareFunction("_csetf_fht_se_encoding_input_fn", "_CSETF-FHT-SE-ENCODING-INPUT-FN", 2, 0, false);
        declareFunction("_csetf_fht_se_encoding_output_fn", "_CSETF-FHT-SE-ENCODING-OUTPUT-FN", 2, 0, false);
        declareFunction("_csetf_fht_se_encoding_size_fn", "_CSETF-FHT-SE-ENCODING-SIZE-FN", 2, 0, false);
        declareFunction("_csetf_fht_se_hash_fn", "_CSETF-FHT-SE-HASH-FN", 2, 0, false);
        declareFunction("_csetf_fht_se_encoding_key_input_fn", "_CSETF-FHT-SE-ENCODING-KEY-INPUT-FN", 2, 0, false);
        declareFunction("_csetf_fht_se_encoding_key_output_fn", "_CSETF-FHT-SE-ENCODING-KEY-OUTPUT-FN", 2, 0, false);
        declareFunction("make_fht_serialization_entry", "MAKE-FHT-SERIALIZATION-ENTRY", 0, 1, false);
        declareFunction("visit_defstruct_fht_serialization_entry", "VISIT-DEFSTRUCT-FHT-SERIALIZATION-ENTRY", 2, 0, false);
        declareFunction("visit_defstruct_object_fht_serialization_entry_method", "VISIT-DEFSTRUCT-OBJECT-FHT-SERIALIZATION-ENTRY-METHOD", 2, 0, false);
        declareFunction("print_fht_serialization_entry", "PRINT-FHT-SERIALIZATION-ENTRY", 3, 0, false);
        declareFunction("new_fht_serialization_entry", "NEW-FHT-SERIALIZATION-ENTRY", 1, 0, false);
        declareFunction("register_fht_serialization_entry", "REGISTER-FHT-SERIALIZATION-ENTRY", 2, 0, false);
        declareFunction("fht_serialization_entry", "FHT-SERIALIZATION-ENTRY", 1, 0, false);
        declareFunction("fht_serialization_encoding_input_fn", "FHT-SERIALIZATION-ENCODING-INPUT-FN", 1, 0, false);
        declareFunction("fht_serialization_encoding_output_fn", "FHT-SERIALIZATION-ENCODING-OUTPUT-FN", 1, 0, false);
        declareFunction("fht_serialization_encoding_size_fn", "FHT-SERIALIZATION-ENCODING-SIZE-FN", 1, 0, false);
        declareFunction("fht_serialization_hash_fn", "FHT-SERIALIZATION-HASH-FN", 1, 0, false);
        declareFunction("fht_serialization_encoding_key_input_fn", "FHT-SERIALIZATION-ENCODING-KEY-INPUT-FN", 1, 0, false);
        declareFunction("fht_serialization_encoding_key_output_fn", "FHT-SERIALIZATION-ENCODING-KEY-OUTPUT-FN", 1, 0, false);
        declareMacro("do_fht_serializations", "DO-FHT-SERIALIZATIONS");
        declareFunction("find_fht_serialization_by_functions", "FIND-FHT-SERIALIZATION-BY-FUNCTIONS", 4, 2, false);
        declareMacro("log_fht_lookup", "LOG-FHT-LOOKUP");
        declareFunction("create_file_hash_table", "CREATE-FILE-HASH-TABLE", 2, 3, false);
        declareFunction("open_file_hash_table", "OPEN-FILE-HASH-TABLE", 1, 2, false);
        declareFunction("open_file_hash_table_read_only", "OPEN-FILE-HASH-TABLE-READ-ONLY", 1, 2, false);
        declareFunction("file_hash_table_open_p", "FILE-HASH-TABLE-OPEN-P", 1, 0, false);
        declareFunction("finalize_file_hash_table", "FINALIZE-FILE-HASH-TABLE", 1, 0, false);
        declareFunction("file_hash_table_count", "FILE-HASH-TABLE-COUNT", 1, 0, false);
        declareFunction("file_hash_table_capacity", "FILE-HASH-TABLE-CAPACITY", 1, 0, false);
        declareFunction("put_file_hash_table", "PUT-FILE-HASH-TABLE", 3, 0, false);
        declareFunction("get_file_hash_table", "GET-FILE-HASH-TABLE", 2, 1, false);
        declareFunction("remove_file_hash_table", "REMOVE-FILE-HASH-TABLE", 2, 0, false);
        declareFunction("cinc_file_hash_table", "CINC-FILE-HASH-TABLE", 2, 2, false);
        declareMacro("dosome_file_hash_table", "DOSOME-FILE-HASH-TABLE");
        declareMacro("dosome_pristine_file_hash_table", "DOSOME-PRISTINE-FILE-HASH-TABLE");
        declareMacro("do_file_hash_table", "DO-FILE-HASH-TABLE");
        declareMacro("do_pristine_file_hash_table", "DO-PRISTINE-FILE-HASH-TABLE");
        declareFunction("print_file_hash_table_contents", "PRINT-FILE-HASH-TABLE-CONTENTS", 1, 0, false);
        declareMacro("progress_do_file_hash_table", "PROGRESS-DO-FILE-HASH-TABLE");
        declareMacro("dosome_file_hash_table_keys", "DOSOME-FILE-HASH-TABLE-KEYS");
        declareMacro("do_file_hash_table_keys", "DO-FILE-HASH-TABLE-KEYS");
        declareMacro("do_pristine_file_hash_table_keys", "DO-PRISTINE-FILE-HASH-TABLE-KEYS");
        declareMacro("progress_do_file_hash_table_keys", "PROGRESS-DO-FILE-HASH-TABLE-KEYS");
        declareFunction("file_hash_table_keys", "FILE-HASH-TABLE-KEYS", 1, 0, false);
        declareFunction("file_hash_table_random_n", "FILE-HASH-TABLE-RANDOM-N", 2, 1, false);
        declareFunction("validate_file_hash_table", "VALIDATE-FILE-HASH-TABLE", 1, 1, false);
        declareFunction("recover_file_hash_table_heap", "RECOVER-FILE-HASH-TABLE-HEAP", 1, 1, false);
        declareFunction("new_file_hash_table_iterator", "NEW-FILE-HASH-TABLE-ITERATOR", 1, 1, false);
        declareFunction("new_file_hash_table_keys_iterator", "NEW-FILE-HASH-TABLE-KEYS-ITERATOR", 1, 1, false);
        declareFunction("new_file_hash_table_values_iterator", "NEW-FILE-HASH-TABLE-VALUES-ITERATOR", 1, 1, false);
        declareFunction("iterate_file_hash_table_next_value", "ITERATE-FILE-HASH-TABLE-NEXT-VALUE", 1, 0, false);
        declareFunction("new_file_hash_table_iterator_internal", "NEW-FILE-HASH-TABLE-ITERATOR-INTERNAL", 3, 0, false);
        declareFunction("make_iterator_file_hash_table_state", "MAKE-ITERATOR-FILE-HASH-TABLE-STATE", 3, 0, false);
        declareFunction("iterate_file_hash_table_doneP", "ITERATE-FILE-HASH-TABLE-DONE?", 1, 0, false);
        declareFunction("iterate_file_hash_table_next", "ITERATE-FILE-HASH-TABLE-NEXT", 1, 0, false);
        declareFunction("make_fht_iterator_next", "MAKE-FHT-ITERATOR-NEXT", 3, 0, false);
        declareFunction("fht_iterator_next_value", "FHT-ITERATOR-NEXT-VALUE", 1, 0, false);
        declareFunction("file_hash_table_to_alist", "FILE-HASH-TABLE-TO-ALIST", 1, 0, false);
        declareFunction("hash_table_to_file_hash_table", "HASH-TABLE-TO-FILE-HASH-TABLE", 2, 4, false);
        declareFunction("alist_to_file_hash_table", "ALIST-TO-FILE-HASH-TABLE", 2, 3, false);
        declareFunction("file_hash_table_copy", "FILE-HASH-TABLE-COPY", 2, 5, false);
        declareFunction("get_file_hash_table_storage_resourcing", "GET-FILE-HASH-TABLE-STORAGE-RESOURCING", 1, 0, false);
        declareFunction("set_file_hash_table_storage_resourcing", "SET-FILE-HASH-TABLE-STORAGE-RESOURCING", 1, 1, false);
        declareFunction("file_hash_table_storage_resourcing_onP", "FILE-HASH-TABLE-STORAGE-RESOURCING-ON?", 1, 0, false);
        declareFunction("compute_fht_cache_capacity", "COMPUTE-FHT-CACHE-CAPACITY", 1, 0, false);
        declareFunction("allocate_file_hash_table_caches", "ALLOCATE-FILE-HASH-TABLE-CACHES", 2, 0, false);
        declareFunction("put_fht_lookaside_cache", "PUT-FHT-LOOKASIDE-CACHE", 3, 0, false);
        declareFunction("get_fht_lookaside_cache", "GET-FHT-LOOKASIDE-CACHE", 2, 0, false);
        declareFunction("remove_fht_lookaside_cache", "REMOVE-FHT-LOOKASIDE-CACHE", 2, 0, false);
        declareFunction("get_pristine_file_hash_table_any", "GET-PRISTINE-FILE-HASH-TABLE-ANY", 1, 2, false);
        declareFunction("get_file_hash_table_any", "GET-FILE-HASH-TABLE-ANY", 1, 2, false);
        declareFunction("perform_fht_put", "PERFORM-FHT-PUT", 3, 0, false);
        declareFunction("perform_fht_put_insert", "PERFORM-FHT-PUT-INSERT", 6, 1, false);
        declareFunction("perform_fht_put_replace", "PERFORM-FHT-PUT-REPLACE", 6, 0, false);
        declareFunction("perform_fht_remove", "PERFORM-FHT-REMOVE", 2, 0, false);
        declareFunction("perform_fht_remove_int", "PERFORM-FHT-REMOVE-INT", 4, 0, false);
        declareFunction("clear_fht_key_entry_node", "CLEAR-FHT-KEY-ENTRY-NODE", 2, 0, false);
        declareFunction("fht_fill_key_entry_gap", "FHT-FILL-KEY-ENTRY-GAP", 2, 0, false);
        declareFunction("fht_lookup_key_index_only", "FHT-LOOKUP-KEY-INDEX-ONLY", 3, 0, false);
        declareFunction("increase_fht_item_count", "INCREASE-FHT-ITEM-COUNT", 1, 1, false);
        declareFunction("decrease_fht_item_count", "DECREASE-FHT-ITEM-COUNT", 1, 0, false);
        declareFunction("perform_fht_get", "PERFORM-FHT-GET", 2, 0, false);
        declareFunction("htfile_file_block_entry_print_function_trampoline", "HTFILE-FILE-BLOCK-ENTRY-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("htfile_file_block_entry_p", "HTFILE-FILE-BLOCK-ENTRY-P", 1, 0, false);
        new file_hash_table.$htfile_file_block_entry_p$UnaryFunction();
        declareFunction("htfile_file_block_entry_size", "HTFILE-FILE-BLOCK-ENTRY-SIZE", 1, 0, false);
        declareFunction("htfile_file_block_entry_next", "HTFILE-FILE-BLOCK-ENTRY-NEXT", 1, 0, false);
        declareFunction("_csetf_htfile_file_block_entry_size", "_CSETF-HTFILE-FILE-BLOCK-ENTRY-SIZE", 2, 0, false);
        declareFunction("_csetf_htfile_file_block_entry_next", "_CSETF-HTFILE-FILE-BLOCK-ENTRY-NEXT", 2, 0, false);
        declareFunction("make_htfile_file_block_entry", "MAKE-HTFILE-FILE-BLOCK-ENTRY", 0, 1, false);
        declareFunction("visit_defstruct_htfile_file_block_entry", "VISIT-DEFSTRUCT-HTFILE-FILE-BLOCK-ENTRY", 2, 0, false);
        declareFunction("visit_defstruct_object_htfile_file_block_entry_method", "VISIT-DEFSTRUCT-OBJECT-HTFILE-FILE-BLOCK-ENTRY-METHOD", 2, 0, false);
        declareFunction("new_htfile_file_block_entry", "NEW-HTFILE-FILE-BLOCK-ENTRY", 0, 1, false);
        declareFunction("print_htfile_file_block_entry", "PRINT-HTFILE-FILE-BLOCK-ENTRY", 3, 0, false);
        declareFunction("copy_file_block", "COPY-FILE-BLOCK", 2, 0, false);
        declareFunction("write_file_block_entry_to_space", "WRITE-FILE-BLOCK-ENTRY-TO-SPACE", 3, 0, false);
        declareFunction("read_file_block_entry_from_space", "READ-FILE-BLOCK-ENTRY-FROM-SPACE", 3, 0, false);
        declareFunction("deallocate_object_space", "DEALLOCATE-OBJECT-SPACE", 3, 0, false);
        declareFunction("insert_file_block_in_free_list", "INSERT-FILE-BLOCK-IN-FREE-LIST", 4, 0, false);
        declareFunction("allocate_object_space_from_free_list", "ALLOCATE-OBJECT-SPACE-FROM-FREE-LIST", 2, 0, false);
        declareFunction("write_initial_table", "WRITE-INITIAL-TABLE", 1, 0, false);
        declareFunction("allocate_fht_heap_space", "ALLOCATE-FHT-HEAP-SPACE", 1, 0, false);
        declareFunction("allocate_fht_key_space", "ALLOCATE-FHT-KEY-SPACE", 1, 1, false);
        declareFunction("htfile_minimal_space_required_for_key", "HTFILE-MINIMAL-SPACE-REQUIRED-FOR-KEY", 0, 0, false);
        declareFunction("fht_key_index_to_reladdr", "FHT-KEY-INDEX-TO-RELADDR", 1, 0, false);
        declareFunction("fht_keyspace_byte_size", "FHT-KEYSPACE-BYTE-SIZE", 1, 0, false);
        declareFunction("valid_heap_offset_p", "VALID-HEAP-OFFSET-P", 3, 0, false);
        declareFunction("valid_fht_heap_offset_p", "VALID-FHT-HEAP-OFFSET-P", 2, 0, false);
        declareFunction("valid_offset_in_keyspace_p", "VALID-OFFSET-IN-KEYSPACE-P", 3, 0, false);
        declareFunction("fht_get_keyspace_size", "FHT-GET-KEYSPACE-SIZE", 1, 0, false);
        declareFunction("fht_key_reladdr_to_address", "FHT-KEY-RELADDR-TO-ADDRESS", 2, 0, false);
        declareFunction("fht_key_index_to_address", "FHT-KEY-INDEX-TO-ADDRESS", 2, 0, false);
        declareFunction("validate_fht_key_index", "VALIDATE-FHT-KEY-INDEX", 2, 0, false);
        declareFunction("validate_fht_key_entry", "VALIDATE-FHT-KEY-ENTRY", 2, 0, false);
        declareFunction("write_key_entry_object", "WRITE-KEY-ENTRY-OBJECT", 2, 0, false);
        declareFunction("read_key_entry_object", "READ-KEY-ENTRY-OBJECT", 2, 0, false);
        declareFunction("fetch_fht_key_entry", "FETCH-FHT-KEY-ENTRY", 3, 0, false);
        declareFunction("store_fht_key_entry", "STORE-FHT-KEY-ENTRY", 3, 1, false);
        declareFunction("fht_hash", "FHT-HASH", 2, 0, false);
        declareFunction("fht_ensure_hash_table_size", "FHT-ENSURE-HASH-TABLE-SIZE", 1, 0, false);
        declareFunction("fht_compute_fence_post_index", "FHT-COMPUTE-FENCE-POST-INDEX", 2, 0, false);
        declareFunction("fht_step_key_index", "FHT-STEP-KEY-INDEX", 2, 0, false);
        declareFunction("fht_lookup_key", "FHT-LOOKUP-KEY", 2, 1, false);
        declareFunction("identical_fht_key_entryP", "IDENTICAL-FHT-KEY-ENTRY?", 5, 0, false);
        declareFunction("complete_fht_object_entry_for_key", "COMPLETE-FHT-OBJECT-ENTRY-FOR-KEY", 3, 1, false);
        declareFunction("potentially_grow_fht_table", "POTENTIALLY-GROW-FHT-TABLE", 1, 0, false);
        declareFunction("perform_grow_fht_table", "PERFORM-GROW-FHT-TABLE", 1, 0, false);
        declareFunction("is_fht_too_smallP", "IS-FHT-TOO-SMALL?", 1, 0, false);
        declareFunction("resize_fht_object_and_key_spaces", "RESIZE-FHT-OBJECT-AND-KEY-SPACES", 1, 0, false);
        declareFunction("allocate_new_fht_key_space", "ALLOCATE-NEW-FHT-KEY-SPACE", 3, 0, false);
        declareFunction("move_htfile_key_space", "MOVE-HTFILE-KEY-SPACE", 3, 0, false);
        declareFunction("rehash_fht_key_space", "REHASH-FHT-KEY-SPACE", 3, 0, false);
        declareMacro("with_different_keyspace", "WITH-DIFFERENT-KEYSPACE");
        declareFunction("rehash_fht_cached_keys", "REHASH-FHT-CACHED-KEYS", 6, 0, false);
        declareFunction("handle_rehash_fht_insert", "HANDLE-REHASH-FHT-INSERT", 5, 0, false);
        declareFunction("htfile_minimal_space_required_for_object", "HTFILE-MINIMAL-SPACE-REQUIRED-FOR-OBJECT", 0, 0, false);
        declareFunction("specify_object_entry", "SPECIFY-OBJECT-ENTRY", 3, 1, false);
        declareFunction("compute_object_entry_size", "COMPUTE-OBJECT-ENTRY-SIZE", 2, 0, false);
        declareFunction("allocate_object_space", "ALLOCATE-OBJECT-SPACE", 2, 0, false);
        declareFunction("store_fht_object_entry", "STORE-FHT-OBJECT-ENTRY", 3, 0, false);
        declareFunction("write_object_entry_to_space", "WRITE-OBJECT-ENTRY-TO-SPACE", 3, 0, false);
        declareFunction("read_object_entry_from_space", "READ-OBJECT-ENTRY-FROM-SPACE", 3, 1, false);
        declareFunction("increase_htfile_heap_size", "INCREASE-HTFILE-HEAP-SIZE", 2, 0, false);
        declareFunction("compute_new_htfile_heap_size", "COMPUTE-NEW-HTFILE-HEAP-SIZE", 1, 1, false);
        declareMacro("register_file_table_header_support", "REGISTER-FILE-TABLE-HEADER-SUPPORT");
        declareFunction("read_fht_header", "READ-FHT-HEADER", 1, 0, false);
        declareFunction("write_fht_header", "WRITE-FHT-HEADER", 1, 0, false);
        declareFunction("read_fht_header_version1p3", "READ-FHT-HEADER-VERSION1P3", 1, 0, false);
        declareFunction("write_fht_header_version1p3", "WRITE-FHT-HEADER-VERSION1P3", 1, 0, false);
        declareFunction("read_fht_extension_space", "READ-FHT-EXTENSION-SPACE", 1, 0, false);
        declareFunction("write_fht_extension_space", "WRITE-FHT-EXTENSION-SPACE", 1, 0, false);
        declareFunction("verify_version1p3_crc", "VERIFY-VERSION1P3-CRC", 1, 0, false);
        declareFunction("read_fht_uint4", "READ-FHT-UINT4", 1, 0, false);
        declareFunction("write_fht_uint4", "WRITE-FHT-UINT4", 2, 0, false);
        declareFunction("read_fht_uint8", "READ-FHT-UINT8", 1, 0, false);
        declareFunction("write_fht_uint8", "WRITE-FHT-UINT8", 2, 0, false);
        declareFunction("write_null_fht_bytes", "WRITE-NULL-FHT-BYTES", 2, 0, false);
        declareFunction("read_fht_encoded_object", "READ-FHT-ENCODED-OBJECT", 2, 0, false);
        declareFunction("write_fht_encoded_object", "WRITE-FHT-ENCODED-OBJECT", 4, 0, false);
        declareFunction("read_fht_binary_block", "READ-FHT-BINARY-BLOCK", 3, 0, false);
        declareFunction("write_fht_binary_block", "WRITE-FHT-BINARY-BLOCK", 3, 0, false);
        declareFunction("move_fht_binary_block", "MOVE-FHT-BINARY-BLOCK", 5, 0, false);
        declareFunction("aggressive_fast_fht_optimization_modeP", "AGGRESSIVE-FAST-FHT-OPTIMIZATION-MODE?", 0, 0, false);
        declareFunction("moderate_fast_fht_optimization_modeP", "MODERATE-FAST-FHT-OPTIMIZATION-MODE?", 0, 0, false);
        declareFunction("conservative_fast_fht_optimization_modeP", "CONSERVATIVE-FAST-FHT-OPTIMIZATION-MODE?", 0, 0, false);
        declareFunction("invalid_fast_fht_optimization_mode", "INVALID-FAST-FHT-OPTIMIZATION-MODE", 0, 0, false);
        declareFunction("fast_create_fht_print_function_trampoline", "FAST-CREATE-FHT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("fast_create_fht_p", "FAST-CREATE-FHT-P", 1, 0, false);
        new file_hash_table.$fast_create_fht_p$UnaryFunction();
        declareFunction("fast_create_fht_fht", "FAST-CREATE-FHT-FHT", 1, 0, false);
        declareFunction("fast_create_fht_tempstem", "FAST-CREATE-FHT-TEMPSTEM", 1, 0, false);
        declareFunction("fast_create_fht_tempfile", "FAST-CREATE-FHT-TEMPFILE", 1, 0, false);
        declareFunction("fast_create_fht_keystream", "FAST-CREATE-FHT-KEYSTREAM", 1, 0, false);
        declareFunction("_csetf_fast_create_fht_fht", "_CSETF-FAST-CREATE-FHT-FHT", 2, 0, false);
        declareFunction("_csetf_fast_create_fht_tempstem", "_CSETF-FAST-CREATE-FHT-TEMPSTEM", 2, 0, false);
        declareFunction("_csetf_fast_create_fht_tempfile", "_CSETF-FAST-CREATE-FHT-TEMPFILE", 2, 0, false);
        declareFunction("_csetf_fast_create_fht_keystream", "_CSETF-FAST-CREATE-FHT-KEYSTREAM", 2, 0, false);
        declareFunction("make_fast_create_fht", "MAKE-FAST-CREATE-FHT", 0, 1, false);
        declareFunction("visit_defstruct_fast_create_fht", "VISIT-DEFSTRUCT-FAST-CREATE-FHT", 2, 0, false);
        declareFunction("visit_defstruct_object_fast_create_fht_method", "VISIT-DEFSTRUCT-OBJECT-FAST-CREATE-FHT-METHOD", 2, 0, false);
        declareFunction("fast_create_file_hash_table", "FAST-CREATE-FILE-HASH-TABLE", 1, 3, false);
        declareFunction("fast_create_allocate_keystream", "FAST-CREATE-ALLOCATE-KEYSTREAM", 1, 0, false);
        declareFunction("fast_create_fixup_object_heap", "FAST-CREATE-FIXUP-OBJECT-HEAP", 1, 0, false);
        declareFunction("fast_put_file_hash_table", "FAST-PUT-FILE-HASH-TABLE", 3, 0, false);
        declareFunction("perform_fast_fht_put", "PERFORM-FAST-FHT-PUT", 3, 0, false);
        declareFunction("update_fast_fht_keystream", "UPDATE-FAST-FHT-KEYSTREAM", 3, 0, false);
        declareFunction("finalize_fast_create_file_hash_table", "FINALIZE-FAST-CREATE-FILE-HASH-TABLE", 1, 2, false);
        declareFunction("prepare_fast_fht_keyspace", "PREPARE-FAST-FHT-KEYSPACE", 1, 0, false);
        declareFunction("realign_fast_fht_keyspace_offset", "REALIGN-FAST-FHT-KEYSPACE-OFFSET", 1, 0, false);
        declareFunction("realign_fast_fht_keyspace_capacity", "REALIGN-FAST-FHT-KEYSPACE-CAPACITY", 1, 0, false);
        declareFunction("allocate_fast_fht_keyspace", "ALLOCATE-FAST-FHT-KEYSPACE", 1, 0, false);
        declareFunction("insert_fast_fht_keystream_content", "INSERT-FAST-FHT-KEYSTREAM-CONTENT", 1, 2, false);
        declareFunction("perform_fast_fht_insert_of_unambiguous_keys", "PERFORM-FAST-FHT-INSERT-OF-UNAMBIGUOUS-KEYS", 2, 0, false);
        declareFunction("perform_fast_fht_insert_by_keystream_ordering", "PERFORM-FAST-FHT-INSERT-BY-KEYSTREAM-ORDERING", 4, 0, false);
        declareFunction("shutdown_fast_create_fht", "SHUTDOWN-FAST-CREATE-FHT", 1, 1, false);
        declareFunction("fast_fht_keystream_sorter_print_function_trampoline", "FAST-FHT-KEYSTREAM-SORTER-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("fast_fht_keystream_sorter_p", "FAST-FHT-KEYSTREAM-SORTER-P", 1, 0, false);
        new file_hash_table.$fast_fht_keystream_sorter_p$UnaryFunction();
        declareFunction("fstfht_ksorter_tempstem", "FSTFHT-KSORTER-TEMPSTEM", 1, 0, false);
        declareFunction("fstfht_ksorter_in_files", "FSTFHT-KSORTER-IN-FILES", 1, 0, false);
        declareFunction("fstfht_ksorter_out_files", "FSTFHT-KSORTER-OUT-FILES", 1, 0, false);
        declareFunction("_csetf_fstfht_ksorter_tempstem", "_CSETF-FSTFHT-KSORTER-TEMPSTEM", 2, 0, false);
        declareFunction("_csetf_fstfht_ksorter_in_files", "_CSETF-FSTFHT-KSORTER-IN-FILES", 2, 0, false);
        declareFunction("_csetf_fstfht_ksorter_out_files", "_CSETF-FSTFHT-KSORTER-OUT-FILES", 2, 0, false);
        declareFunction("make_fast_fht_keystream_sorter", "MAKE-FAST-FHT-KEYSTREAM-SORTER", 0, 1, false);
        declareFunction("visit_defstruct_fast_fht_keystream_sorter", "VISIT-DEFSTRUCT-FAST-FHT-KEYSTREAM-SORTER", 2, 0, false);
        declareFunction("visit_defstruct_object_fast_fht_keystream_sorter_method", "VISIT-DEFSTRUCT-OBJECT-FAST-FHT-KEYSTREAM-SORTER-METHOD", 2, 0, false);
        declareFunction("fast_fht_sort_keystream_by_expected_index", "FAST-FHT-SORT-KEYSTREAM-BY-EXPECTED-INDEX", 3, 2, false);
        declareFunction("new_fast_fht_keystream_sorter", "NEW-FAST-FHT-KEYSTREAM-SORTER", 1, 0, false);
        declareFunction("fast_fht_n_temp_files", "FAST-FHT-N-TEMP-FILES", 3, 0, false);
        declareFunction("fast_fht_split_keystream_into_tiled_input_files", "FAST-FHT-SPLIT-KEYSTREAM-INTO-TILED-INPUT-FILES", 3, 0, false);
        declareFunction("fast_fht_read_one_keystream_entry", "FAST-FHT-READ-ONE-KEYSTREAM-ENTRY", 2, 1, false);
        declareFunction("fast_fht_keystream_sentinel_entry", "FAST-FHT-KEYSTREAM-SENTINEL-ENTRY", 0, 1, false);
        declareFunction("fast_fht_keystream_eof_entry", "FAST-FHT-KEYSTREAM-EOF-ENTRY", 0, 1, false);
        declareFunction("fast_fht_keystream_entry_cmp", "FAST-FHT-KEYSTREAM-ENTRY-CMP", 2, 0, false);
        declareFunction("fast_fht_keystream_entryL", "FAST-FHT-KEYSTREAM-ENTRY<", 2, 0, false);
        declareFunction("fast_fht_write_one_keystream_tile", "FAST-FHT-WRITE-ONE-KEYSTREAM-TILE", 2, 0, false);
        declareFunction("is_fast_fht_keystream_chunk_separator_entryP", "IS-FAST-FHT-KEYSTREAM-CHUNK-SEPARATOR-ENTRY?", 1, 0, false);
        declareFunction("is_fast_fht_keystream_eofP", "IS-FAST-FHT-KEYSTREAM-EOF?", 1, 0, false);
        declareFunction("fast_fht_write_keystream_chunk_separator", "FAST-FHT-WRITE-KEYSTREAM-CHUNK-SEPARATOR", 1, 0, false);
        declareFunction("fast_fht_write_keystream_entry", "FAST-FHT-WRITE-KEYSTREAM-ENTRY", 3, 1, false);
        declareFunction("fast_fht_write_one_keystream_entry", "FAST-FHT-WRITE-ONE-KEYSTREAM-ENTRY", 2, 0, false);
        declareFunction("fast_fht_write_one_collision_stream_entry", "FAST-FHT-WRITE-ONE-COLLISION-STREAM-ENTRY", 3, 0, false);
        declareFunction("fast_fht_almost_merge_sort_keystream", "FAST-FHT-ALMOST-MERGE-SORT-KEYSTREAM", 2, 1, false);
        declareFunction("fast_fht_merge_keystream_input_files", "FAST-FHT-MERGE-KEYSTREAM-INPUT-FILES", 3, 0, false);
        declareFunction("fast_fht_merge_keystream_chunks", "FAST-FHT-MERGE-KEYSTREAM-CHUNKS", 4, 0, false);
        declareMacro("fast_fht_drain_index_run", "FAST-FHT-DRAIN-INDEX-RUN");
        declareMacro("fast_fht_manage_index_collisions", "FAST-FHT-MANAGE-INDEX-COLLISIONS");
        declareFunction("fast_fht_uniquify_keystream", "FAST-FHT-UNIQUIFY-KEYSTREAM", 2, 0, false);
        declareFunction("fast_fht_get_comparable_index_from_entry", "FAST-FHT-GET-COMPARABLE-INDEX-FROM-ENTRY", 1, 0, false);
        declareFunction("fast_fht_dump_keystream", "FAST-FHT-DUMP-KEYSTREAM", 2, 1, false);
        declareFunction("fast_fht_dump_keystream_files", "FAST-FHT-DUMP-KEYSTREAM-FILES", 2, 1, false);
        declareFunction("enforce_valid_fast_fht_dump_keystream_files", "ENFORCE-VALID-FAST-FHT-DUMP-KEYSTREAM-FILES", 2, 0, false);
        declareFunction("validate_fast_fht_dump_keystream", "VALIDATE-FAST-FHT-DUMP-KEYSTREAM", 2, 0, false);
        declareFunction("test_fast_fht_keystream_entry_cmp", "TEST-FAST-FHT-KEYSTREAM-ENTRY-CMP", 2, 0, false);
        declareFunction("fast_fht_keystream_entry_cmp_expand_argument", "FAST-FHT-KEYSTREAM-ENTRY-CMP-EXPAND-ARGUMENT", 1, 0, false);
        declareMacro("with_input_file_hash_table", "WITH-INPUT-FILE-HASH-TABLE");
        declareMacro("with_writable_file_hash_table", "WITH-WRITABLE-FILE-HASH-TABLE");
        declareMacro("with_output_file_hash_table", "WITH-OUTPUT-FILE-HASH-TABLE");
        declareMacro("with_fast_create_file_hash_table", "WITH-FAST-CREATE-FILE-HASH-TABLE");
        declareFunction("test_fast_fht_creation_with_merge_sorted_keystream", "TEST-FAST-FHT-CREATION-WITH-MERGE-SORTED-KEYSTREAM", 3, 0, false);
        declareFunction("test_fast_fht_creation_with_map_contents", "TEST-FAST-FHT-CREATION-WITH-MAP-CONTENTS", 1, 2, false);
        declareFunction("test_fast_fht_with_kb_contents", "TEST-FAST-FHT-WITH-KB-CONTENTS", 4, 3, false);
        declareFunction("test_ffhtkb_generate_constant_info", "TEST-FFHTKB-GENERATE-CONSTANT-INFO", 0, 0, false);
        declareFunction("test_ffhtkb_grab_constant_key_info", "TEST-FFHTKB-GRAB-CONSTANT-KEY-INFO", 1, 0, false);
        declareFunction("test_ffhtkb_grab_constant_value_info", "TEST-FFHTKB-GRAB-CONSTANT-VALUE-INFO", 1, 0, false);
        return NIL;
    }

    static private final SubLList $list_alt2 = list(new SubLObject[]{ makeSymbol("STREAM"), makeSymbol("HEADER"), makeSymbol("LOCK"), makeSymbol("ENCODING-INPUT-FN"), makeSymbol("ENCODING-OUTPUT-FN"), makeSymbol("ENCODING-SIZE-FN"), makeSymbol("ENCODING-KEY-INPUT-FN"), makeSymbol("ENCODING-KEY-OUTPUT-FN"), makeSymbol("TESTFN"), makeSymbol("HASH-FN"), makeSymbol("INPUT-CACHE"), makeSymbol("OUTPUT-CACHE"), makeSymbol("PROPERTY-LIST") });

    static private final SubLList $list_alt3 = list(new SubLObject[]{ makeKeyword("STREAM"), makeKeyword("HEADER"), $LOCK, makeKeyword("ENCODING-INPUT-FN"), makeKeyword("ENCODING-OUTPUT-FN"), makeKeyword("ENCODING-SIZE-FN"), makeKeyword("ENCODING-KEY-INPUT-FN"), makeKeyword("ENCODING-KEY-OUTPUT-FN"), makeKeyword("TESTFN"), makeKeyword("HASH-FN"), makeKeyword("INPUT-CACHE"), makeKeyword("OUTPUT-CACHE"), makeKeyword("PROPERTY-LIST") });

    static private final SubLList $list_alt4 = list(new SubLObject[]{ makeSymbol("FILE-HASH-TABLE-STREAM"), makeSymbol("FILE-HASH-TABLE-HEADER"), makeSymbol("FILE-HASH-TABLE-LOCK"), makeSymbol("FILE-HASH-TABLE-ENCODING-INPUT-FN"), makeSymbol("FILE-HASH-TABLE-ENCODING-OUTPUT-FN"), makeSymbol("FILE-HASH-TABLE-ENCODING-SIZE-FN"), makeSymbol("FILE-HASH-TABLE-ENCODING-KEY-INPUT-FN"), makeSymbol("FILE-HASH-TABLE-ENCODING-KEY-OUTPUT-FN"), makeSymbol("FILE-HASH-TABLE-TESTFN"), makeSymbol("FILE-HASH-TABLE-HASH-FN"), makeSymbol("FILE-HASH-TABLE-INPUT-CACHE"), makeSymbol("FILE-HASH-TABLE-OUTPUT-CACHE"), makeSymbol("FILE-HASH-TABLE-PROPERTY-LIST") });

    static private final SubLList $list_alt5 = list(new SubLObject[]{ makeSymbol("_CSETF-FILE-HASH-TABLE-STREAM"), makeSymbol("_CSETF-FILE-HASH-TABLE-HEADER"), makeSymbol("_CSETF-FILE-HASH-TABLE-LOCK"), makeSymbol("_CSETF-FILE-HASH-TABLE-ENCODING-INPUT-FN"), makeSymbol("_CSETF-FILE-HASH-TABLE-ENCODING-OUTPUT-FN"), makeSymbol("_CSETF-FILE-HASH-TABLE-ENCODING-SIZE-FN"), makeSymbol("_CSETF-FILE-HASH-TABLE-ENCODING-KEY-INPUT-FN"), makeSymbol("_CSETF-FILE-HASH-TABLE-ENCODING-KEY-OUTPUT-FN"), makeSymbol("_CSETF-FILE-HASH-TABLE-TESTFN"), makeSymbol("_CSETF-FILE-HASH-TABLE-HASH-FN"), makeSymbol("_CSETF-FILE-HASH-TABLE-INPUT-CACHE"), makeSymbol("_CSETF-FILE-HASH-TABLE-OUTPUT-CACHE"), makeSymbol("_CSETF-FILE-HASH-TABLE-PROPERTY-LIST") });

    static private final SubLString $str_alt47$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLString $str_alt48$__FHT__Stream___A_Lock___A___ = makeString("#<FHT: Stream: ~A Lock: ~A ~%");

    static private final SubLString $str_alt49$_Test___A__ = makeString(" Test: ~A~%");

    static private final SubLString $str_alt50$_Encoding__Input__A_Output__A_Siz = makeString(" Encoding: Input ~A Output ~A Sizing ~A~%");

    static private final SubLString $str_alt51$_Key_Encoding__Input__A_Output__A = makeString(" Key Encoding: Input ~A Output ~A~%");

    static private final SubLString $str_alt52$_Hashing___A__ = makeString(" Hashing: ~A~%");

    static private final SubLString $str_alt53$_Caches__Input__A_Output__A____ = makeString(" Caches: Input ~A Output ~A >~%");

    static private final SubLString $str_alt54$_Properties___A__ = makeString(" Properties: ~A~%");

    static private final SubLList $list_alt57 = list(new SubLObject[]{ makeSymbol("SIZE"), makeSymbol("VERSION-MAJOR"), makeSymbol("VERSION-MINOR"), makeSymbol("OBJECT-SPACE-OFFSET"), makeSymbol("KEY-SPACE-OFFSET"), makeSymbol("CURRENT-HEAP-TOP"), makeSymbol("ITEM-COUNT"), makeSymbol("CAPACITY"), makeSymbol("FREE-LIST-HEAD"), makeSymbol("DELETION-COUNT"), makeSymbol("HEADER-CRC"), makeSymbol("EXTENSION-SPACE-SIZE"), makeSymbol("EXTENSION-SPACE") });

    static private final SubLList $list_alt58 = list(new SubLObject[]{ $SIZE, makeKeyword("VERSION-MAJOR"), makeKeyword("VERSION-MINOR"), makeKeyword("OBJECT-SPACE-OFFSET"), makeKeyword("KEY-SPACE-OFFSET"), makeKeyword("CURRENT-HEAP-TOP"), makeKeyword("ITEM-COUNT"), makeKeyword("CAPACITY"), makeKeyword("FREE-LIST-HEAD"), makeKeyword("DELETION-COUNT"), makeKeyword("HEADER-CRC"), makeKeyword("EXTENSION-SPACE-SIZE"), makeKeyword("EXTENSION-SPACE") });

    static private final SubLList $list_alt59 = list(new SubLObject[]{ makeSymbol("HTFILE-HEADER-SIZE"), makeSymbol("HTFILE-HEADER-VERSION-MAJOR"), makeSymbol("HTFILE-HEADER-VERSION-MINOR"), makeSymbol("HTFILE-HEADER-OBJECT-SPACE-OFFSET"), makeSymbol("HTFILE-HEADER-KEY-SPACE-OFFSET"), makeSymbol("HTFILE-HEADER-CURRENT-HEAP-TOP"), makeSymbol("HTFILE-HEADER-ITEM-COUNT"), makeSymbol("HTFILE-HEADER-CAPACITY"), makeSymbol("HTFILE-HEADER-FREE-LIST-HEAD"), makeSymbol("HTFILE-HEADER-DELETION-COUNT"), makeSymbol("HTFILE-HEADER-HEADER-CRC"), makeSymbol("HTFILE-HEADER-EXTENSION-SPACE-SIZE"), makeSymbol("HTFILE-HEADER-EXTENSION-SPACE") });

    static private final SubLList $list_alt60 = list(new SubLObject[]{ makeSymbol("_CSETF-HTFILE-HEADER-SIZE"), makeSymbol("_CSETF-HTFILE-HEADER-VERSION-MAJOR"), makeSymbol("_CSETF-HTFILE-HEADER-VERSION-MINOR"), makeSymbol("_CSETF-HTFILE-HEADER-OBJECT-SPACE-OFFSET"), makeSymbol("_CSETF-HTFILE-HEADER-KEY-SPACE-OFFSET"), makeSymbol("_CSETF-HTFILE-HEADER-CURRENT-HEAP-TOP"), makeSymbol("_CSETF-HTFILE-HEADER-ITEM-COUNT"), makeSymbol("_CSETF-HTFILE-HEADER-CAPACITY"), makeSymbol("_CSETF-HTFILE-HEADER-FREE-LIST-HEAD"), makeSymbol("_CSETF-HTFILE-HEADER-DELETION-COUNT"), makeSymbol("_CSETF-HTFILE-HEADER-HEADER-CRC"), makeSymbol("_CSETF-HTFILE-HEADER-EXTENSION-SPACE-SIZE"), makeSymbol("_CSETF-HTFILE-HEADER-EXTENSION-SPACE") });

    static private final SubLString $str_alt101$__HTFile_Header__Size__A_Format_V = makeString("#<HTFile-Header: Size=~A Format-Version ~A.~A~%");

    static private final SubLString $str_alt102$_ObjSpace_Offset__0x_X___D___KeyS = makeString(" ObjSpace Offset: 0x~X (~D)  KeySpace Offset: 0x~X (~D) HeapTop: 0x~X (~D)~%");

    static private final SubLString $str_alt103$_Item_Count___A__Capacity___A__ = makeString(" Item Count: ~A  Capacity: ~A~%");

    static private final SubLString $str_alt104$_FreeListHead___A_ = makeString(" FreeListHead: ~A ");

    static private final SubLString $str_alt105$_no_free_list_ = makeString(" no free-list ");

    static private final SubLString $str_alt106$_Deletions___A_ = makeString(" Deletions: ~A ");

    static private final SubLString $str_alt107$_no_deletions_ = makeString(" no deletions ");

    static private final SubLString $str_alt108$_CRC___A_ = makeString(" CRC: ~A ");

    static private final SubLString $str_alt109$_no_CRC_support_ = makeString(" no CRC support ");

    static private final SubLString $str_alt110$_Extension_Space____A____A____ = makeString(" Extension Space: (~A) |~A| ~%");

    static private final SubLString $str_alt111$__ = makeString("> ");

    static private final SubLList $list_alt114 = list(makeSymbol("SIZE"), makeSymbol("TYPE"), makeSymbol("KEY-SIZE"), makeSymbol("KEY"), makeSymbol("DATA-SIZE"), makeSymbol("DATA"));

    static private final SubLList $list_alt115 = list($SIZE, $TYPE, makeKeyword("KEY-SIZE"), makeKeyword("KEY"), makeKeyword("DATA-SIZE"), $DATA);

    static private final SubLList $list_alt116 = list(makeSymbol("HTFILE-OBJECT-ENTRY-SIZE"), makeSymbol("HTFILE-OBJECT-ENTRY-TYPE"), makeSymbol("HTFILE-OBJECT-ENTRY-KEY-SIZE"), makeSymbol("HTFILE-OBJECT-ENTRY-KEY"), makeSymbol("HTFILE-OBJECT-ENTRY-DATA-SIZE"), makeSymbol("HTFILE-OBJECT-ENTRY-DATA"));

    static private final SubLList $list_alt117 = list(makeSymbol("_CSETF-HTFILE-OBJECT-ENTRY-SIZE"), makeSymbol("_CSETF-HTFILE-OBJECT-ENTRY-TYPE"), makeSymbol("_CSETF-HTFILE-OBJECT-ENTRY-KEY-SIZE"), makeSymbol("_CSETF-HTFILE-OBJECT-ENTRY-KEY"), makeSymbol("_CSETF-HTFILE-OBJECT-ENTRY-DATA-SIZE"), makeSymbol("_CSETF-HTFILE-OBJECT-ENTRY-DATA"));

    static private final SubLList $list_alt138 = list(makeSymbol("KEY-OFFSET"), makeSymbol("HASH-CODE"));

    static private final SubLList $list_alt139 = list(makeKeyword("KEY-OFFSET"), makeKeyword("HASH-CODE"));

    static private final SubLList $list_alt140 = list(makeSymbol("HTFILE-KEY-ENTRY-KEY-OFFSET"), makeSymbol("HTFILE-KEY-ENTRY-HASH-CODE"));

    static private final SubLList $list_alt141 = list(makeSymbol("_CSETF-HTFILE-KEY-ENTRY-KEY-OFFSET"), makeSymbol("_CSETF-HTFILE-KEY-ENTRY-HASH-CODE"));

    public static final SubLObject init_file_hash_table_file_alt() {
        defconstant("*DTP-FILE-HASH-TABLE*", FILE_HASH_TABLE);
        defconstant("*DTP-HTFILE-HEADER*", HTFILE_HEADER);
        defconstant("*DTP-HTFILE-OBJECT-ENTRY*", HTFILE_OBJECT_ENTRY);
        defconstant("*DTP-HTFILE-KEY-ENTRY*", HTFILE_KEY_ENTRY);
        deflexical("*DEFAULT-FHT-TEST-FUNCTION*", symbol_function(EQL));
        deflexical("*DEFAULT-FHT-SERIALIZATION-PROTOCOL*", $IMAGE_DEPENDENT_CFASL);
        defparameter("*FHT-MIN-CACHE-CAPACITY*", $int$2000);
        defparameter("*FHT-CACHE-PERCENTAGE*", FOUR_INTEGER);
        defconstant("*HTFILE-HEADER-CURRENT-VMAJOR*", ONE_INTEGER);
        defconstant("*HTFILE-HEADER-CURRENT-VMINOR*", THREE_INTEGER);
        defconstant("*HTFILE-HEADER-CURRENT-SIZE*", $int$84);
        defconstant("*HTFILE-DEFAULT-EXPECTED-ITEMS*", $int$256);
        defconstant("*HTFILE-DEFAULT-AVERAGE-SIZE*", $int$256);
        defconstant("*FHT-EMPTY-OFFSET-MARKER*", ZERO_INTEGER);
        defconstant("*FHT-TOMBSTONE-OFFSET-MARKER*", ONE_INTEGER);
        defconstant("*FHT-INVALID-HASH-CODE*", ZERO_INTEGER);
        deflexical("*FHT-TOMBSTONE-KEY-ENTRY*", construct_tombstone_key_entry());
        deflexical("*FHT-EMPTY-KEY-ENTRY*", construct_empty_key_entry());
        defconstant("*DTP-FHT-SERIALIZATION-ENTRY*", FHT_SERIALIZATION_ENTRY);
        deflexical("*FHT-SERIALIZATION-TABLE*", NIL != boundp($fht_serialization_table$) ? ((SubLObject) ($fht_serialization_table$.getGlobalValue())) : dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
        deflexical("*FHT-NOT-FOUND*", NIL != boundp($fht_not_found$) ? ((SubLObject) ($fht_not_found$.getGlobalValue())) : make_symbol($$$FileHashTable_Not_Found));
        deflexical("*NOT-IN-FHT*", NIL != boundp($not_in_fht$) ? ((SubLObject) ($not_in_fht$.getGlobalValue())) : make_symbol($$$Not_In_FHT));
        defparameter("*FAST-PUT-SKIP-OUTPUT-FORCING*", NIL);
        defconstant("*HTFILE-MINIMAL-FILE-BLOCK-SIZE*", TWELVE_INTEGER);
        defconstant("*DTP-HTFILE-FILE-BLOCK-ENTRY*", HTFILE_FILE_BLOCK_ENTRY);
        defconstant("*HTFILE-KEY-ENTRY-SIZE*", TWELVE_INTEGER);
        defconstant("*FHT-HASH-CONSTANT-A*", $int$10009);
        defconstant("*FHT-HASH-STEP-SIZE*", THIRTEEN_INTEGER);
        defconstant("*FHT-HASH-NEXT-STEP-POW2*", SIXTEEN_INTEGER);
        defconstant("*FHT-DKNUTHS-MAGIC-CUTOFF*", $int$66);
        deflexical("*KEYSPACE-MOVE-SIZE*", expt(TWO_INTEGER, SIXTEEN_INTEGER));
        deflexical("*KEYSPACE-REHASH-CACHE-SIZE*", integerDivide($keyspace_move_size$.getGlobalValue(), $htfile_key_entry_size$.getGlobalValue()));
        defconstant("*HTFILE-OBJECT-ENTRY-SIZE*", TWELVE_INTEGER);
        defconstant("*FILE-HASH-TABLE-HEADER-POSITION*", ZERO_INTEGER);
        deflexical("*FILE-HASH-TABLE-HEADERS*", NIL != boundp($file_hash_table_headers$) ? ((SubLObject) ($file_hash_table_headers$.getGlobalValue())) : make_hash_table(TEN_INTEGER, symbol_function(EQUAL), UNPROVIDED));
        defparameter("*FAST-FILE-HASH-TABLE-OPTIMIZATION-MODE*", $AGGRESSIVE);
        defconstant("*DTP-FAST-CREATE-FHT*", FAST_CREATE_FHT);
        defparameter("*FAST-FHT-KEYSPACE-ALIGNMENT*", SIXTEEN_INTEGER);
        defconstant("*DTP-FAST-FHT-KEYSTREAM-SORTER*", FAST_FHT_KEYSTREAM_SORTER);
        defconstant("*FAST-FHT-SENTINEL-HASHCODE-VALUE*", MINUS_ONE_INTEGER);
        defconstant("*FAST-FHT-SENTINEL-INDEX-VALUE*", expt(TWO_INTEGER, $int$1024));
        defparameter("*FAST-FHT-KEYSTREAM-TILE-SIZE-POW2*", SIXTEEN_INTEGER);
        return NIL;
    }

    public static SubLObject init_file_hash_table_file() {
        if (SubLFiles.USE_V1) {
            defconstant("*DTP-FILE-HASH-TABLE*", FILE_HASH_TABLE);
            defconstant("*DTP-HTFILE-HEADER*", HTFILE_HEADER);
            defconstant("*DTP-HTFILE-OBJECT-ENTRY*", HTFILE_OBJECT_ENTRY);
            defconstant("*DTP-HTFILE-KEY-ENTRY*", HTFILE_KEY_ENTRY);
            deflexical("*DEFAULT-FHT-TEST-FUNCTION*", symbol_function(EQL));
            deflexical("*DEFAULT-FHT-SERIALIZATION-PROTOCOL*", $IMAGE_DEPENDENT_CFASL);
            defparameter("*FHT-MIN-CACHE-CAPACITY*", $int$2000);
            defparameter("*FHT-CACHE-PERCENTAGE*", FOUR_INTEGER);
            defconstant("*HTFILE-HEADER-CURRENT-VMAJOR*", ONE_INTEGER);
            defconstant("*HTFILE-HEADER-CURRENT-VMINOR*", THREE_INTEGER);
            defconstant("*HTFILE-HEADER-CURRENT-SIZE*", $int$84);
            defconstant("*HTFILE-DEFAULT-EXPECTED-ITEMS*", $int$256);
            defconstant("*HTFILE-DEFAULT-AVERAGE-SIZE*", $int$256);
            defconstant("*FHT-EMPTY-OFFSET-MARKER*", ZERO_INTEGER);
            defconstant("*FHT-TOMBSTONE-OFFSET-MARKER*", ONE_INTEGER);
            defconstant("*FHT-INVALID-HASH-CODE*", ZERO_INTEGER);
            deflexical("*FHT-TOMBSTONE-KEY-ENTRY*", construct_tombstone_key_entry());
            deflexical("*FHT-EMPTY-KEY-ENTRY*", construct_empty_key_entry());
            deflexical("*MAX-FHT-HASH-CODE-VALUE*", subtract(expt(TWO_INTEGER, $int$32), ONE_INTEGER));
            defconstant("*DTP-FHT-SERIALIZATION-ENTRY*", FHT_SERIALIZATION_ENTRY);
            deflexical("*FHT-SERIALIZATION-TABLE*", SubLTrampolineFile.maybeDefault($fht_serialization_table$, $fht_serialization_table$, () -> dictionary.new_dictionary(UNPROVIDED, UNPROVIDED)));
            defparameter("*FHT-LOOKUP-STREAM*", NIL);
            deflexical("*FHT-NOT-FOUND*", SubLTrampolineFile.maybeDefault($fht_not_found$, $fht_not_found$, () -> make_symbol($$$FileHashTable_Not_Found)));
            deflexical("*NOT-IN-FHT*", SubLTrampolineFile.maybeDefault($not_in_fht$, $not_in_fht$, () -> make_symbol($$$Not_In_FHT)));
            defparameter("*FAST-PUT-SKIP-OUTPUT-FORCING*", NIL);
            defconstant("*HTFILE-MINIMAL-FILE-BLOCK-SIZE*", TWELVE_INTEGER);
            defconstant("*DTP-HTFILE-FILE-BLOCK-ENTRY*", HTFILE_FILE_BLOCK_ENTRY);
            defconstant("*HTFILE-KEY-ENTRY-SIZE*", TWELVE_INTEGER);
            defconstant("*FHT-HASH-CONSTANT-A*", $int$10009);
            defconstant("*FHT-HASH-STEP-SIZE*", THIRTEEN_INTEGER);
            defconstant("*FHT-HASH-NEXT-STEP-POW2*", SIXTEEN_INTEGER);
            defconstant("*FHT-DKNUTHS-MAGIC-CUTOFF*", $int$66);
            deflexical("*KEYSPACE-MOVE-SIZE*", expt(TWO_INTEGER, SIXTEEN_INTEGER));
            deflexical("*KEYSPACE-REHASH-CACHE-SIZE*", integerDivide($keyspace_move_size$.getGlobalValue(), $htfile_key_entry_size$.getGlobalValue()));
            defconstant("*HTFILE-OBJECT-ENTRY-SIZE*", TWELVE_INTEGER);
            defconstant("*FILE-HASH-TABLE-HEADER-POSITION*", ZERO_INTEGER);
            deflexical("*FILE-HASH-TABLE-HEADERS*", SubLTrampolineFile.maybeDefault($file_hash_table_headers$, $file_hash_table_headers$, () -> make_hash_table(TEN_INTEGER, symbol_function(EQUAL), UNPROVIDED)));
            defparameter("*FAST-FILE-HASH-TABLE-OPTIMIZATION-MODE*", $AGGRESSIVE);
            defconstant("*DTP-FAST-CREATE-FHT*", FAST_CREATE_FHT);
            deflexical("*FAST-FHT-LARGE-BUFFER-SIZE*", multiply(FOUR_INTEGER, $int$1024, $int$1024));
            deflexical("*FAST-FHT-SMALL-BUFFER-SIZE*", multiply(FOUR_INTEGER, $int$1024));
            defparameter("*FAST-FHT-KEYSPACE-ALIGNMENT*", SIXTEEN_INTEGER);
            defconstant("*DTP-FAST-FHT-KEYSTREAM-SORTER*", FAST_FHT_KEYSTREAM_SORTER);
            defconstant("*FAST-FHT-SENTINEL-HASHCODE-VALUE*", MINUS_ONE_INTEGER);
            defconstant("*FAST-FHT-SENTINEL-INDEX-VALUE*", $int$179769313486231590772930519078902);
            defparameter("*FAST-FHT-KEYSTREAM-TILE-SIZE-POW2*", SIXTEEN_INTEGER);
            defparameter("*TEST-FAST-FHT-GENERATOR-STATE*", NIL);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*FHT-SERIALIZATION-TABLE*", NIL != boundp($fht_serialization_table$) ? ((SubLObject) ($fht_serialization_table$.getGlobalValue())) : dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
            deflexical("*FHT-NOT-FOUND*", NIL != boundp($fht_not_found$) ? ((SubLObject) ($fht_not_found$.getGlobalValue())) : make_symbol($$$FileHashTable_Not_Found));
            deflexical("*NOT-IN-FHT*", NIL != boundp($not_in_fht$) ? ((SubLObject) ($not_in_fht$.getGlobalValue())) : make_symbol($$$Not_In_FHT));
            deflexical("*FILE-HASH-TABLE-HEADERS*", NIL != boundp($file_hash_table_headers$) ? ((SubLObject) ($file_hash_table_headers$.getGlobalValue())) : make_hash_table(TEN_INTEGER, symbol_function(EQUAL), UNPROVIDED));
            defconstant("*FAST-FHT-SENTINEL-INDEX-VALUE*", expt(TWO_INTEGER, $int$1024));
        }
        return NIL;
    }

    public static SubLObject init_file_hash_table_file_Previous() {
        defconstant("*DTP-FILE-HASH-TABLE*", FILE_HASH_TABLE);
        defconstant("*DTP-HTFILE-HEADER*", HTFILE_HEADER);
        defconstant("*DTP-HTFILE-OBJECT-ENTRY*", HTFILE_OBJECT_ENTRY);
        defconstant("*DTP-HTFILE-KEY-ENTRY*", HTFILE_KEY_ENTRY);
        deflexical("*DEFAULT-FHT-TEST-FUNCTION*", symbol_function(EQL));
        deflexical("*DEFAULT-FHT-SERIALIZATION-PROTOCOL*", $IMAGE_DEPENDENT_CFASL);
        defparameter("*FHT-MIN-CACHE-CAPACITY*", $int$2000);
        defparameter("*FHT-CACHE-PERCENTAGE*", FOUR_INTEGER);
        defconstant("*HTFILE-HEADER-CURRENT-VMAJOR*", ONE_INTEGER);
        defconstant("*HTFILE-HEADER-CURRENT-VMINOR*", THREE_INTEGER);
        defconstant("*HTFILE-HEADER-CURRENT-SIZE*", $int$84);
        defconstant("*HTFILE-DEFAULT-EXPECTED-ITEMS*", $int$256);
        defconstant("*HTFILE-DEFAULT-AVERAGE-SIZE*", $int$256);
        defconstant("*FHT-EMPTY-OFFSET-MARKER*", ZERO_INTEGER);
        defconstant("*FHT-TOMBSTONE-OFFSET-MARKER*", ONE_INTEGER);
        defconstant("*FHT-INVALID-HASH-CODE*", ZERO_INTEGER);
        deflexical("*FHT-TOMBSTONE-KEY-ENTRY*", construct_tombstone_key_entry());
        deflexical("*FHT-EMPTY-KEY-ENTRY*", construct_empty_key_entry());
        deflexical("*MAX-FHT-HASH-CODE-VALUE*", subtract(expt(TWO_INTEGER, $int$32), ONE_INTEGER));
        defconstant("*DTP-FHT-SERIALIZATION-ENTRY*", FHT_SERIALIZATION_ENTRY);
        deflexical("*FHT-SERIALIZATION-TABLE*", SubLTrampolineFile.maybeDefault($fht_serialization_table$, $fht_serialization_table$, () -> dictionary.new_dictionary(UNPROVIDED, UNPROVIDED)));
        defparameter("*FHT-LOOKUP-STREAM*", NIL);
        deflexical("*FHT-NOT-FOUND*", SubLTrampolineFile.maybeDefault($fht_not_found$, $fht_not_found$, () -> make_symbol($$$FileHashTable_Not_Found)));
        deflexical("*NOT-IN-FHT*", SubLTrampolineFile.maybeDefault($not_in_fht$, $not_in_fht$, () -> make_symbol($$$Not_In_FHT)));
        defparameter("*FAST-PUT-SKIP-OUTPUT-FORCING*", NIL);
        defconstant("*HTFILE-MINIMAL-FILE-BLOCK-SIZE*", TWELVE_INTEGER);
        defconstant("*DTP-HTFILE-FILE-BLOCK-ENTRY*", HTFILE_FILE_BLOCK_ENTRY);
        defconstant("*HTFILE-KEY-ENTRY-SIZE*", TWELVE_INTEGER);
        defconstant("*FHT-HASH-CONSTANT-A*", $int$10009);
        defconstant("*FHT-HASH-STEP-SIZE*", THIRTEEN_INTEGER);
        defconstant("*FHT-HASH-NEXT-STEP-POW2*", SIXTEEN_INTEGER);
        defconstant("*FHT-DKNUTHS-MAGIC-CUTOFF*", $int$66);
        deflexical("*KEYSPACE-MOVE-SIZE*", expt(TWO_INTEGER, SIXTEEN_INTEGER));
        deflexical("*KEYSPACE-REHASH-CACHE-SIZE*", integerDivide($keyspace_move_size$.getGlobalValue(), $htfile_key_entry_size$.getGlobalValue()));
        defconstant("*HTFILE-OBJECT-ENTRY-SIZE*", TWELVE_INTEGER);
        defconstant("*FILE-HASH-TABLE-HEADER-POSITION*", ZERO_INTEGER);
        deflexical("*FILE-HASH-TABLE-HEADERS*", SubLTrampolineFile.maybeDefault($file_hash_table_headers$, $file_hash_table_headers$, () -> make_hash_table(TEN_INTEGER, symbol_function(EQUAL), UNPROVIDED)));
        defparameter("*FAST-FILE-HASH-TABLE-OPTIMIZATION-MODE*", $AGGRESSIVE);
        defconstant("*DTP-FAST-CREATE-FHT*", FAST_CREATE_FHT);
        deflexical("*FAST-FHT-LARGE-BUFFER-SIZE*", multiply(FOUR_INTEGER, $int$1024, $int$1024));
        deflexical("*FAST-FHT-SMALL-BUFFER-SIZE*", multiply(FOUR_INTEGER, $int$1024));
        defparameter("*FAST-FHT-KEYSPACE-ALIGNMENT*", SIXTEEN_INTEGER);
        defconstant("*DTP-FAST-FHT-KEYSTREAM-SORTER*", FAST_FHT_KEYSTREAM_SORTER);
        defconstant("*FAST-FHT-SENTINEL-HASHCODE-VALUE*", MINUS_ONE_INTEGER);
        defconstant("*FAST-FHT-SENTINEL-INDEX-VALUE*", $int$179769313486231590772930519078902);
        defparameter("*FAST-FHT-KEYSTREAM-TILE-SIZE-POW2*", SIXTEEN_INTEGER);
        defparameter("*TEST-FAST-FHT-GENERATOR-STATE*", NIL);
        return NIL;
    }

    static private final SubLList $list_alt157 = list(makeSymbol("ENCODING-INPUT-FN"), makeSymbol("ENCODING-OUTPUT-FN"), makeSymbol("ENCODING-SIZE-FN"), makeSymbol("HASH-FN"), makeSymbol("ENCODING-KEY-INPUT-FN"), makeSymbol("ENCODING-KEY-OUTPUT-FN"));

    static private final SubLList $list_alt158 = list(makeKeyword("ENCODING-INPUT-FN"), makeKeyword("ENCODING-OUTPUT-FN"), makeKeyword("ENCODING-SIZE-FN"), makeKeyword("HASH-FN"), makeKeyword("ENCODING-KEY-INPUT-FN"), makeKeyword("ENCODING-KEY-OUTPUT-FN"));

    static private final SubLList $list_alt159 = list(makeSymbol("FHT-SE-ENCODING-INPUT-FN"), makeSymbol("FHT-SE-ENCODING-OUTPUT-FN"), makeSymbol("FHT-SE-ENCODING-SIZE-FN"), makeSymbol("FHT-SE-HASH-FN"), makeSymbol("FHT-SE-ENCODING-KEY-INPUT-FN"), makeSymbol("FHT-SE-ENCODING-KEY-OUTPUT-FN"));

    static private final SubLList $list_alt160 = list(makeSymbol("_CSETF-FHT-SE-ENCODING-INPUT-FN"), makeSymbol("_CSETF-FHT-SE-ENCODING-OUTPUT-FN"), makeSymbol("_CSETF-FHT-SE-ENCODING-SIZE-FN"), makeSymbol("_CSETF-FHT-SE-HASH-FN"), makeSymbol("_CSETF-FHT-SE-ENCODING-KEY-INPUT-FN"), makeSymbol("_CSETF-FHT-SE-ENCODING-KEY-OUTPUT-FN"));

    static private final SubLString $str_alt175$__FHT_Serialization__Input_Fn____ = makeString("#<FHT-Serialization: Input Fn:    ~S~%");

    static private final SubLString $str_alt176$_____________________Output_Fn___ = makeString("                     Output Fn:   ~S~%");

    static private final SubLString $str_alt177$_____________________Size_Fn_____ = makeString("                     Size Fn:     ~S~%");

    static private final SubLString $str_alt178$_____________________Hash_Fn_____ = makeString("                     Hash Fn:     ~S~%");

    static private final SubLString $str_alt179$_____________________Key_Input___ = makeString("                     Key Input    ~S~%");

    public static final SubLObject setup_file_hash_table_file_alt() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_file_hash_table$.getGlobalValue(), symbol_function(FILE_HASH_TABLE_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(FILE_HASH_TABLE_STREAM, _CSETF_FILE_HASH_TABLE_STREAM);
        def_csetf(FILE_HASH_TABLE_HEADER, _CSETF_FILE_HASH_TABLE_HEADER);
        def_csetf(FILE_HASH_TABLE_LOCK, _CSETF_FILE_HASH_TABLE_LOCK);
        def_csetf(FILE_HASH_TABLE_ENCODING_INPUT_FN, _CSETF_FILE_HASH_TABLE_ENCODING_INPUT_FN);
        def_csetf(FILE_HASH_TABLE_ENCODING_OUTPUT_FN, _CSETF_FILE_HASH_TABLE_ENCODING_OUTPUT_FN);
        def_csetf(FILE_HASH_TABLE_ENCODING_SIZE_FN, _CSETF_FILE_HASH_TABLE_ENCODING_SIZE_FN);
        def_csetf(FILE_HASH_TABLE_ENCODING_KEY_INPUT_FN, _CSETF_FILE_HASH_TABLE_ENCODING_KEY_INPUT_FN);
        def_csetf(FILE_HASH_TABLE_ENCODING_KEY_OUTPUT_FN, _CSETF_FILE_HASH_TABLE_ENCODING_KEY_OUTPUT_FN);
        def_csetf(FILE_HASH_TABLE_TESTFN, _CSETF_FILE_HASH_TABLE_TESTFN);
        def_csetf(FILE_HASH_TABLE_HASH_FN, _CSETF_FILE_HASH_TABLE_HASH_FN);
        def_csetf(FILE_HASH_TABLE_INPUT_CACHE, _CSETF_FILE_HASH_TABLE_INPUT_CACHE);
        def_csetf(FILE_HASH_TABLE_OUTPUT_CACHE, _CSETF_FILE_HASH_TABLE_OUTPUT_CACHE);
        def_csetf(FILE_HASH_TABLE_PROPERTY_LIST, _CSETF_FILE_HASH_TABLE_PROPERTY_LIST);
        identity(FILE_HASH_TABLE);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_htfile_header$.getGlobalValue(), symbol_function(HTFILE_HEADER_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(HTFILE_HEADER_SIZE, _CSETF_HTFILE_HEADER_SIZE);
        def_csetf(HTFILE_HEADER_VERSION_MAJOR, _CSETF_HTFILE_HEADER_VERSION_MAJOR);
        def_csetf(HTFILE_HEADER_VERSION_MINOR, _CSETF_HTFILE_HEADER_VERSION_MINOR);
        def_csetf(HTFILE_HEADER_OBJECT_SPACE_OFFSET, _CSETF_HTFILE_HEADER_OBJECT_SPACE_OFFSET);
        def_csetf(HTFILE_HEADER_KEY_SPACE_OFFSET, _CSETF_HTFILE_HEADER_KEY_SPACE_OFFSET);
        def_csetf(HTFILE_HEADER_CURRENT_HEAP_TOP, _CSETF_HTFILE_HEADER_CURRENT_HEAP_TOP);
        def_csetf(HTFILE_HEADER_ITEM_COUNT, _CSETF_HTFILE_HEADER_ITEM_COUNT);
        def_csetf(HTFILE_HEADER_CAPACITY, _CSETF_HTFILE_HEADER_CAPACITY);
        def_csetf(HTFILE_HEADER_FREE_LIST_HEAD, _CSETF_HTFILE_HEADER_FREE_LIST_HEAD);
        def_csetf(HTFILE_HEADER_DELETION_COUNT, _CSETF_HTFILE_HEADER_DELETION_COUNT);
        def_csetf(HTFILE_HEADER_HEADER_CRC, _CSETF_HTFILE_HEADER_HEADER_CRC);
        def_csetf(HTFILE_HEADER_EXTENSION_SPACE_SIZE, _CSETF_HTFILE_HEADER_EXTENSION_SPACE_SIZE);
        def_csetf(HTFILE_HEADER_EXTENSION_SPACE, _CSETF_HTFILE_HEADER_EXTENSION_SPACE);
        identity(HTFILE_HEADER);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_htfile_object_entry$.getGlobalValue(), symbol_function(HTFILE_OBJECT_ENTRY_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(HTFILE_OBJECT_ENTRY_SIZE, _CSETF_HTFILE_OBJECT_ENTRY_SIZE);
        def_csetf(HTFILE_OBJECT_ENTRY_TYPE, _CSETF_HTFILE_OBJECT_ENTRY_TYPE);
        def_csetf(HTFILE_OBJECT_ENTRY_KEY_SIZE, _CSETF_HTFILE_OBJECT_ENTRY_KEY_SIZE);
        def_csetf(HTFILE_OBJECT_ENTRY_KEY, _CSETF_HTFILE_OBJECT_ENTRY_KEY);
        def_csetf(HTFILE_OBJECT_ENTRY_DATA_SIZE, _CSETF_HTFILE_OBJECT_ENTRY_DATA_SIZE);
        def_csetf(HTFILE_OBJECT_ENTRY_DATA, _CSETF_HTFILE_OBJECT_ENTRY_DATA);
        identity(HTFILE_OBJECT_ENTRY);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_htfile_key_entry$.getGlobalValue(), symbol_function(HTFILE_KEY_ENTRY_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(HTFILE_KEY_ENTRY_KEY_OFFSET, _CSETF_HTFILE_KEY_ENTRY_KEY_OFFSET);
        def_csetf(HTFILE_KEY_ENTRY_HASH_CODE, _CSETF_HTFILE_KEY_ENTRY_HASH_CODE);
        identity(HTFILE_KEY_ENTRY);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_fht_serialization_entry$.getGlobalValue(), symbol_function(FHT_SERIALIZATION_ENTRY_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(FHT_SE_ENCODING_INPUT_FN, _CSETF_FHT_SE_ENCODING_INPUT_FN);
        def_csetf(FHT_SE_ENCODING_OUTPUT_FN, _CSETF_FHT_SE_ENCODING_OUTPUT_FN);
        def_csetf(FHT_SE_ENCODING_SIZE_FN, _CSETF_FHT_SE_ENCODING_SIZE_FN);
        def_csetf(FHT_SE_HASH_FN, _CSETF_FHT_SE_HASH_FN);
        def_csetf(FHT_SE_ENCODING_KEY_INPUT_FN, _CSETF_FHT_SE_ENCODING_KEY_INPUT_FN);
        def_csetf(FHT_SE_ENCODING_KEY_OUTPUT_FN, _CSETF_FHT_SE_ENCODING_KEY_OUTPUT_FN);
        identity(FHT_SERIALIZATION_ENTRY);
        declare_defglobal($fht_serialization_table$);
        register_fht_serialization_entry($IMAGE_DEPENDENT_CFASL, $list_alt188);
        register_fht_serialization_entry($IMAGE_INDEPENDENT_CFASL, $list_alt190);
        register_fht_serialization_entry($HL_EXTERNALIZED_KEYS, $list_alt192);
        declare_defglobal($fht_not_found$);
        declare_defglobal($not_in_fht$);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_htfile_file_block_entry$.getGlobalValue(), symbol_function(HTFILE_FILE_BLOCK_ENTRY_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(HTFILE_FILE_BLOCK_ENTRY_SIZE, _CSETF_HTFILE_FILE_BLOCK_ENTRY_SIZE);
        def_csetf(HTFILE_FILE_BLOCK_ENTRY_NEXT, _CSETF_HTFILE_FILE_BLOCK_ENTRY_NEXT);
        identity(HTFILE_FILE_BLOCK_ENTRY);
        declare_defglobal($file_hash_table_headers$);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_fast_create_fht$.getGlobalValue(), symbol_function(FAST_CREATE_FHT_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(FAST_CREATE_FHT_FHT, _CSETF_FAST_CREATE_FHT_FHT);
        def_csetf(FAST_CREATE_FHT_TEMPSTEM, _CSETF_FAST_CREATE_FHT_TEMPSTEM);
        def_csetf(FAST_CREATE_FHT_TEMPFILE, _CSETF_FAST_CREATE_FHT_TEMPFILE);
        def_csetf(FAST_CREATE_FHT_KEYSTREAM, _CSETF_FAST_CREATE_FHT_KEYSTREAM);
        identity(FAST_CREATE_FHT);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_fast_fht_keystream_sorter$.getGlobalValue(), symbol_function(FAST_FHT_KEYSTREAM_SORTER_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(FSTFHT_KSORTER_TEMPSTEM, _CSETF_FSTFHT_KSORTER_TEMPSTEM);
        def_csetf(FSTFHT_KSORTER_IN_FILES, _CSETF_FSTFHT_KSORTER_IN_FILES);
        def_csetf(FSTFHT_KSORTER_OUT_FILES, _CSETF_FSTFHT_KSORTER_OUT_FILES);
        identity(FAST_FHT_KEYSTREAM_SORTER);
        define_test_case_table_int(TEST_FAST_FHT_KEYSTREAM_ENTRY_CMP, list(new SubLObject[]{ $TEST, EQ, $OWNER, $$$rck, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt432);
        define_test_case_table_int(TEST_FAST_FHT_CREATION_WITH_MERGE_SORTED_KEYSTREAM, list(new SubLObject[]{ $TEST, EQ, $OWNER, $$$rck, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt456);
        return NIL;
    }

    public static SubLObject setup_file_hash_table_file() {
        if (SubLFiles.USE_V1) {
            register_method($print_object_method_table$.getGlobalValue(), $dtp_file_hash_table$.getGlobalValue(), symbol_function(FILE_HASH_TABLE_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim($list8);
            def_csetf(FILE_HASH_TABLE_STREAM, _CSETF_FILE_HASH_TABLE_STREAM);
            def_csetf(FILE_HASH_TABLE_HEADER, _CSETF_FILE_HASH_TABLE_HEADER);
            def_csetf(FILE_HASH_TABLE_LOCK, _CSETF_FILE_HASH_TABLE_LOCK);
            def_csetf(FILE_HASH_TABLE_ENCODING_INPUT_FN, _CSETF_FILE_HASH_TABLE_ENCODING_INPUT_FN);
            def_csetf(FILE_HASH_TABLE_ENCODING_OUTPUT_FN, _CSETF_FILE_HASH_TABLE_ENCODING_OUTPUT_FN);
            def_csetf(FILE_HASH_TABLE_ENCODING_SIZE_FN, _CSETF_FILE_HASH_TABLE_ENCODING_SIZE_FN);
            def_csetf(FILE_HASH_TABLE_ENCODING_KEY_INPUT_FN, _CSETF_FILE_HASH_TABLE_ENCODING_KEY_INPUT_FN);
            def_csetf(FILE_HASH_TABLE_ENCODING_KEY_OUTPUT_FN, _CSETF_FILE_HASH_TABLE_ENCODING_KEY_OUTPUT_FN);
            def_csetf(FILE_HASH_TABLE_TESTFN, _CSETF_FILE_HASH_TABLE_TESTFN);
            def_csetf(FILE_HASH_TABLE_HASH_FN, _CSETF_FILE_HASH_TABLE_HASH_FN);
            def_csetf(FILE_HASH_TABLE_INPUT_CACHE, _CSETF_FILE_HASH_TABLE_INPUT_CACHE);
            def_csetf(FILE_HASH_TABLE_OUTPUT_CACHE, _CSETF_FILE_HASH_TABLE_OUTPUT_CACHE);
            def_csetf(FILE_HASH_TABLE_PROPERTY_LIST, _CSETF_FILE_HASH_TABLE_PROPERTY_LIST);
            identity(FILE_HASH_TABLE);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_file_hash_table$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_FILE_HASH_TABLE_METHOD));
            register_method($print_object_method_table$.getGlobalValue(), $dtp_htfile_header$.getGlobalValue(), symbol_function(HTFILE_HEADER_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim($list68);
            def_csetf(HTFILE_HEADER_SIZE, _CSETF_HTFILE_HEADER_SIZE);
            def_csetf(HTFILE_HEADER_VERSION_MAJOR, _CSETF_HTFILE_HEADER_VERSION_MAJOR);
            def_csetf(HTFILE_HEADER_VERSION_MINOR, _CSETF_HTFILE_HEADER_VERSION_MINOR);
            def_csetf(HTFILE_HEADER_OBJECT_SPACE_OFFSET, _CSETF_HTFILE_HEADER_OBJECT_SPACE_OFFSET);
            def_csetf(HTFILE_HEADER_KEY_SPACE_OFFSET, _CSETF_HTFILE_HEADER_KEY_SPACE_OFFSET);
            def_csetf(HTFILE_HEADER_CURRENT_HEAP_TOP, _CSETF_HTFILE_HEADER_CURRENT_HEAP_TOP);
            def_csetf(HTFILE_HEADER_ITEM_COUNT, _CSETF_HTFILE_HEADER_ITEM_COUNT);
            def_csetf(HTFILE_HEADER_CAPACITY, _CSETF_HTFILE_HEADER_CAPACITY);
            def_csetf(HTFILE_HEADER_FREE_LIST_HEAD, _CSETF_HTFILE_HEADER_FREE_LIST_HEAD);
            def_csetf(HTFILE_HEADER_DELETION_COUNT, _CSETF_HTFILE_HEADER_DELETION_COUNT);
            def_csetf(HTFILE_HEADER_HEADER_CRC, _CSETF_HTFILE_HEADER_HEADER_CRC);
            def_csetf(HTFILE_HEADER_EXTENSION_SPACE_SIZE, _CSETF_HTFILE_HEADER_EXTENSION_SPACE_SIZE);
            def_csetf(HTFILE_HEADER_EXTENSION_SPACE, _CSETF_HTFILE_HEADER_EXTENSION_SPACE);
            identity(HTFILE_HEADER);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_htfile_header$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_HTFILE_HEADER_METHOD));
            register_method($print_object_method_table$.getGlobalValue(), $dtp_htfile_object_entry$.getGlobalValue(), symbol_function(HTFILE_OBJECT_ENTRY_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim($list128);
            def_csetf(HTFILE_OBJECT_ENTRY_SIZE, _CSETF_HTFILE_OBJECT_ENTRY_SIZE);
            def_csetf(HTFILE_OBJECT_ENTRY_TYPE, _CSETF_HTFILE_OBJECT_ENTRY_TYPE);
            def_csetf(HTFILE_OBJECT_ENTRY_KEY_SIZE, _CSETF_HTFILE_OBJECT_ENTRY_KEY_SIZE);
            def_csetf(HTFILE_OBJECT_ENTRY_KEY, _CSETF_HTFILE_OBJECT_ENTRY_KEY);
            def_csetf(HTFILE_OBJECT_ENTRY_DATA_SIZE, _CSETF_HTFILE_OBJECT_ENTRY_DATA_SIZE);
            def_csetf(HTFILE_OBJECT_ENTRY_DATA, _CSETF_HTFILE_OBJECT_ENTRY_DATA);
            identity(HTFILE_OBJECT_ENTRY);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_htfile_object_entry$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_HTFILE_OBJECT_ENTRY_METHOD));
            register_method($print_object_method_table$.getGlobalValue(), $dtp_htfile_key_entry$.getGlobalValue(), symbol_function(HTFILE_KEY_ENTRY_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim($list155);
            def_csetf(HTFILE_KEY_ENTRY_KEY_OFFSET, _CSETF_HTFILE_KEY_ENTRY_KEY_OFFSET);
            def_csetf(HTFILE_KEY_ENTRY_HASH_CODE, _CSETF_HTFILE_KEY_ENTRY_HASH_CODE);
            identity(HTFILE_KEY_ENTRY);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_htfile_key_entry$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_HTFILE_KEY_ENTRY_METHOD));
            register_method($print_object_method_table$.getGlobalValue(), $dtp_fht_serialization_entry$.getGlobalValue(), symbol_function(FHT_SERIALIZATION_ENTRY_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim($list180);
            def_csetf(FHT_SE_ENCODING_INPUT_FN, _CSETF_FHT_SE_ENCODING_INPUT_FN);
            def_csetf(FHT_SE_ENCODING_OUTPUT_FN, _CSETF_FHT_SE_ENCODING_OUTPUT_FN);
            def_csetf(FHT_SE_ENCODING_SIZE_FN, _CSETF_FHT_SE_ENCODING_SIZE_FN);
            def_csetf(FHT_SE_HASH_FN, _CSETF_FHT_SE_HASH_FN);
            def_csetf(FHT_SE_ENCODING_KEY_INPUT_FN, _CSETF_FHT_SE_ENCODING_KEY_INPUT_FN);
            def_csetf(FHT_SE_ENCODING_KEY_OUTPUT_FN, _CSETF_FHT_SE_ENCODING_KEY_OUTPUT_FN);
            identity(FHT_SERIALIZATION_ENTRY);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_fht_serialization_entry$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_FHT_SERIALIZATION_ENTRY_METHOD));
            declare_defglobal($fht_serialization_table$);
            register_fht_serialization_entry($IMAGE_DEPENDENT_CFASL, $list208);
            register_fht_serialization_entry($IMAGE_INDEPENDENT_CFASL, $list210);
            register_fht_serialization_entry($HL_EXTERNALIZED_KEYS, $list212);
            declare_defglobal($fht_not_found$);
            declare_defglobal($not_in_fht$);
            register_method($print_object_method_table$.getGlobalValue(), $dtp_htfile_file_block_entry$.getGlobalValue(), symbol_function(HTFILE_FILE_BLOCK_ENTRY_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim($list332);
            def_csetf(HTFILE_FILE_BLOCK_ENTRY_SIZE, _CSETF_HTFILE_FILE_BLOCK_ENTRY_SIZE);
            def_csetf(HTFILE_FILE_BLOCK_ENTRY_NEXT, _CSETF_HTFILE_FILE_BLOCK_ENTRY_NEXT);
            identity(HTFILE_FILE_BLOCK_ENTRY);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_htfile_file_block_entry$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_HTFILE_FILE_BLOCK_ENTRY_METHOD));
            declare_defglobal($file_hash_table_headers$);
            register_method($print_object_method_table$.getGlobalValue(), $dtp_fast_create_fht$.getGlobalValue(), symbol_function(FAST_CREATE_FHT_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim($list396);
            def_csetf(FAST_CREATE_FHT_FHT, _CSETF_FAST_CREATE_FHT_FHT);
            def_csetf(FAST_CREATE_FHT_TEMPSTEM, _CSETF_FAST_CREATE_FHT_TEMPSTEM);
            def_csetf(FAST_CREATE_FHT_TEMPFILE, _CSETF_FAST_CREATE_FHT_TEMPFILE);
            def_csetf(FAST_CREATE_FHT_KEYSTREAM, _CSETF_FAST_CREATE_FHT_KEYSTREAM);
            identity(FAST_CREATE_FHT);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_fast_create_fht$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_FAST_CREATE_FHT_METHOD));
            register_method($print_object_method_table$.getGlobalValue(), $dtp_fast_fht_keystream_sorter$.getGlobalValue(), symbol_function(FAST_FHT_KEYSTREAM_SORTER_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim($list435);
            def_csetf(FSTFHT_KSORTER_TEMPSTEM, _CSETF_FSTFHT_KSORTER_TEMPSTEM);
            def_csetf(FSTFHT_KSORTER_IN_FILES, _CSETF_FSTFHT_KSORTER_IN_FILES);
            def_csetf(FSTFHT_KSORTER_OUT_FILES, _CSETF_FSTFHT_KSORTER_OUT_FILES);
            identity(FAST_FHT_KEYSTREAM_SORTER);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_fast_fht_keystream_sorter$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_FAST_FHT_KEYSTREAM_SORTER_METHOD));
            define_test_case_table_int(TEST_FAST_FHT_KEYSTREAM_ENTRY_CMP, list(new SubLObject[]{ $TEST, EQ, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list493);
            define_test_case_table_int(TEST_FAST_FHT_CREATION_WITH_MERGE_SORTED_KEYSTREAM, list(new SubLObject[]{ $TEST, EQ, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list517);
            define_test_case_table_int(TEST_FAST_FHT_WITH_KB_CONTENTS, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list531);
        }
        if (SubLFiles.USE_V2) {
            register_fht_serialization_entry($IMAGE_DEPENDENT_CFASL, $list_alt188);
            register_fht_serialization_entry($IMAGE_INDEPENDENT_CFASL, $list_alt190);
            register_fht_serialization_entry($HL_EXTERNALIZED_KEYS, $list_alt192);
            define_test_case_table_int(TEST_FAST_FHT_KEYSTREAM_ENTRY_CMP, list(new SubLObject[]{ $TEST, EQ, $OWNER, $$$rck, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt432);
            define_test_case_table_int(TEST_FAST_FHT_CREATION_WITH_MERGE_SORTED_KEYSTREAM, list(new SubLObject[]{ $TEST, EQ, $OWNER, $$$rck, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt456);
        }
        return NIL;
    }

    public static SubLObject setup_file_hash_table_file_Previous() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_file_hash_table$.getGlobalValue(), symbol_function(FILE_HASH_TABLE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list8);
        def_csetf(FILE_HASH_TABLE_STREAM, _CSETF_FILE_HASH_TABLE_STREAM);
        def_csetf(FILE_HASH_TABLE_HEADER, _CSETF_FILE_HASH_TABLE_HEADER);
        def_csetf(FILE_HASH_TABLE_LOCK, _CSETF_FILE_HASH_TABLE_LOCK);
        def_csetf(FILE_HASH_TABLE_ENCODING_INPUT_FN, _CSETF_FILE_HASH_TABLE_ENCODING_INPUT_FN);
        def_csetf(FILE_HASH_TABLE_ENCODING_OUTPUT_FN, _CSETF_FILE_HASH_TABLE_ENCODING_OUTPUT_FN);
        def_csetf(FILE_HASH_TABLE_ENCODING_SIZE_FN, _CSETF_FILE_HASH_TABLE_ENCODING_SIZE_FN);
        def_csetf(FILE_HASH_TABLE_ENCODING_KEY_INPUT_FN, _CSETF_FILE_HASH_TABLE_ENCODING_KEY_INPUT_FN);
        def_csetf(FILE_HASH_TABLE_ENCODING_KEY_OUTPUT_FN, _CSETF_FILE_HASH_TABLE_ENCODING_KEY_OUTPUT_FN);
        def_csetf(FILE_HASH_TABLE_TESTFN, _CSETF_FILE_HASH_TABLE_TESTFN);
        def_csetf(FILE_HASH_TABLE_HASH_FN, _CSETF_FILE_HASH_TABLE_HASH_FN);
        def_csetf(FILE_HASH_TABLE_INPUT_CACHE, _CSETF_FILE_HASH_TABLE_INPUT_CACHE);
        def_csetf(FILE_HASH_TABLE_OUTPUT_CACHE, _CSETF_FILE_HASH_TABLE_OUTPUT_CACHE);
        def_csetf(FILE_HASH_TABLE_PROPERTY_LIST, _CSETF_FILE_HASH_TABLE_PROPERTY_LIST);
        identity(FILE_HASH_TABLE);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_file_hash_table$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_FILE_HASH_TABLE_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_htfile_header$.getGlobalValue(), symbol_function(HTFILE_HEADER_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list68);
        def_csetf(HTFILE_HEADER_SIZE, _CSETF_HTFILE_HEADER_SIZE);
        def_csetf(HTFILE_HEADER_VERSION_MAJOR, _CSETF_HTFILE_HEADER_VERSION_MAJOR);
        def_csetf(HTFILE_HEADER_VERSION_MINOR, _CSETF_HTFILE_HEADER_VERSION_MINOR);
        def_csetf(HTFILE_HEADER_OBJECT_SPACE_OFFSET, _CSETF_HTFILE_HEADER_OBJECT_SPACE_OFFSET);
        def_csetf(HTFILE_HEADER_KEY_SPACE_OFFSET, _CSETF_HTFILE_HEADER_KEY_SPACE_OFFSET);
        def_csetf(HTFILE_HEADER_CURRENT_HEAP_TOP, _CSETF_HTFILE_HEADER_CURRENT_HEAP_TOP);
        def_csetf(HTFILE_HEADER_ITEM_COUNT, _CSETF_HTFILE_HEADER_ITEM_COUNT);
        def_csetf(HTFILE_HEADER_CAPACITY, _CSETF_HTFILE_HEADER_CAPACITY);
        def_csetf(HTFILE_HEADER_FREE_LIST_HEAD, _CSETF_HTFILE_HEADER_FREE_LIST_HEAD);
        def_csetf(HTFILE_HEADER_DELETION_COUNT, _CSETF_HTFILE_HEADER_DELETION_COUNT);
        def_csetf(HTFILE_HEADER_HEADER_CRC, _CSETF_HTFILE_HEADER_HEADER_CRC);
        def_csetf(HTFILE_HEADER_EXTENSION_SPACE_SIZE, _CSETF_HTFILE_HEADER_EXTENSION_SPACE_SIZE);
        def_csetf(HTFILE_HEADER_EXTENSION_SPACE, _CSETF_HTFILE_HEADER_EXTENSION_SPACE);
        identity(HTFILE_HEADER);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_htfile_header$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_HTFILE_HEADER_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_htfile_object_entry$.getGlobalValue(), symbol_function(HTFILE_OBJECT_ENTRY_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list128);
        def_csetf(HTFILE_OBJECT_ENTRY_SIZE, _CSETF_HTFILE_OBJECT_ENTRY_SIZE);
        def_csetf(HTFILE_OBJECT_ENTRY_TYPE, _CSETF_HTFILE_OBJECT_ENTRY_TYPE);
        def_csetf(HTFILE_OBJECT_ENTRY_KEY_SIZE, _CSETF_HTFILE_OBJECT_ENTRY_KEY_SIZE);
        def_csetf(HTFILE_OBJECT_ENTRY_KEY, _CSETF_HTFILE_OBJECT_ENTRY_KEY);
        def_csetf(HTFILE_OBJECT_ENTRY_DATA_SIZE, _CSETF_HTFILE_OBJECT_ENTRY_DATA_SIZE);
        def_csetf(HTFILE_OBJECT_ENTRY_DATA, _CSETF_HTFILE_OBJECT_ENTRY_DATA);
        identity(HTFILE_OBJECT_ENTRY);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_htfile_object_entry$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_HTFILE_OBJECT_ENTRY_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_htfile_key_entry$.getGlobalValue(), symbol_function(HTFILE_KEY_ENTRY_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list155);
        def_csetf(HTFILE_KEY_ENTRY_KEY_OFFSET, _CSETF_HTFILE_KEY_ENTRY_KEY_OFFSET);
        def_csetf(HTFILE_KEY_ENTRY_HASH_CODE, _CSETF_HTFILE_KEY_ENTRY_HASH_CODE);
        identity(HTFILE_KEY_ENTRY);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_htfile_key_entry$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_HTFILE_KEY_ENTRY_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_fht_serialization_entry$.getGlobalValue(), symbol_function(FHT_SERIALIZATION_ENTRY_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list180);
        def_csetf(FHT_SE_ENCODING_INPUT_FN, _CSETF_FHT_SE_ENCODING_INPUT_FN);
        def_csetf(FHT_SE_ENCODING_OUTPUT_FN, _CSETF_FHT_SE_ENCODING_OUTPUT_FN);
        def_csetf(FHT_SE_ENCODING_SIZE_FN, _CSETF_FHT_SE_ENCODING_SIZE_FN);
        def_csetf(FHT_SE_HASH_FN, _CSETF_FHT_SE_HASH_FN);
        def_csetf(FHT_SE_ENCODING_KEY_INPUT_FN, _CSETF_FHT_SE_ENCODING_KEY_INPUT_FN);
        def_csetf(FHT_SE_ENCODING_KEY_OUTPUT_FN, _CSETF_FHT_SE_ENCODING_KEY_OUTPUT_FN);
        identity(FHT_SERIALIZATION_ENTRY);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_fht_serialization_entry$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_FHT_SERIALIZATION_ENTRY_METHOD));
        declare_defglobal($fht_serialization_table$);
        register_fht_serialization_entry($IMAGE_DEPENDENT_CFASL, $list208);
        register_fht_serialization_entry($IMAGE_INDEPENDENT_CFASL, $list210);
        register_fht_serialization_entry($HL_EXTERNALIZED_KEYS, $list212);
        declare_defglobal($fht_not_found$);
        declare_defglobal($not_in_fht$);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_htfile_file_block_entry$.getGlobalValue(), symbol_function(HTFILE_FILE_BLOCK_ENTRY_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list332);
        def_csetf(HTFILE_FILE_BLOCK_ENTRY_SIZE, _CSETF_HTFILE_FILE_BLOCK_ENTRY_SIZE);
        def_csetf(HTFILE_FILE_BLOCK_ENTRY_NEXT, _CSETF_HTFILE_FILE_BLOCK_ENTRY_NEXT);
        identity(HTFILE_FILE_BLOCK_ENTRY);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_htfile_file_block_entry$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_HTFILE_FILE_BLOCK_ENTRY_METHOD));
        declare_defglobal($file_hash_table_headers$);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_fast_create_fht$.getGlobalValue(), symbol_function(FAST_CREATE_FHT_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list396);
        def_csetf(FAST_CREATE_FHT_FHT, _CSETF_FAST_CREATE_FHT_FHT);
        def_csetf(FAST_CREATE_FHT_TEMPSTEM, _CSETF_FAST_CREATE_FHT_TEMPSTEM);
        def_csetf(FAST_CREATE_FHT_TEMPFILE, _CSETF_FAST_CREATE_FHT_TEMPFILE);
        def_csetf(FAST_CREATE_FHT_KEYSTREAM, _CSETF_FAST_CREATE_FHT_KEYSTREAM);
        identity(FAST_CREATE_FHT);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_fast_create_fht$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_FAST_CREATE_FHT_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_fast_fht_keystream_sorter$.getGlobalValue(), symbol_function(FAST_FHT_KEYSTREAM_SORTER_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list435);
        def_csetf(FSTFHT_KSORTER_TEMPSTEM, _CSETF_FSTFHT_KSORTER_TEMPSTEM);
        def_csetf(FSTFHT_KSORTER_IN_FILES, _CSETF_FSTFHT_KSORTER_IN_FILES);
        def_csetf(FSTFHT_KSORTER_OUT_FILES, _CSETF_FSTFHT_KSORTER_OUT_FILES);
        identity(FAST_FHT_KEYSTREAM_SORTER);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_fast_fht_keystream_sorter$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_FAST_FHT_KEYSTREAM_SORTER_METHOD));
        define_test_case_table_int(TEST_FAST_FHT_KEYSTREAM_ENTRY_CMP, list(new SubLObject[]{ $TEST, EQ, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list493);
        define_test_case_table_int(TEST_FAST_FHT_CREATION_WITH_MERGE_SORTED_KEYSTREAM, list(new SubLObject[]{ $TEST, EQ, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list517);
        define_test_case_table_int(TEST_FAST_FHT_WITH_KB_CONTENTS, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list531);
        return NIL;
    }

    static private final SubLString $str_alt180$_____________________Key_Output__ = makeString("                     Key Output    ~S~%");

    static private final SubLString $str_alt181$_ = makeString(">");

    static private final SubLList $list_alt183 = list(list(makeSymbol("SERIALIZATION"), makeSymbol("SERIALIZATION-ENTRY"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt184 = list($DONE);

    static private final SubLList $list_alt188 = list(makeKeyword("ENCODING-INPUT-FN"), makeSymbol("CFASL-INPUT"), makeKeyword("ENCODING-OUTPUT-FN"), makeSymbol("CFASL-OUTPUT"), makeKeyword("ENCODING-SIZE-FN"), makeSymbol("CFASL-OBJECT-SIZE"), makeKeyword("HASH-FN"), makeSymbol("SXHASH"));

    static private final SubLList $list_alt190 = list(makeKeyword("ENCODING-INPUT-FN"), makeSymbol("CFASL-INPUT"), makeKeyword("ENCODING-OUTPUT-FN"), makeSymbol("CFASL-OUTPUT-EXTERNALIZED"), makeKeyword("ENCODING-SIZE-FN"), makeSymbol("CFASL-EXTERNALIZED-OBJECT-SIZE"), makeKeyword("HASH-FN"), makeSymbol("SXHASH-EXTERNAL"));

    static private final SubLList $list_alt192 = list(new SubLObject[]{ makeKeyword("ENCODING-INPUT-FN"), makeSymbol("CFASL-INPUT"), makeKeyword("ENCODING-OUTPUT-FN"), makeSymbol("CFASL-OUTPUT-EXTERNALIZED"), makeKeyword("ENCODING-SIZE-FN"), makeSymbol("CFASL-EXTERNALIZED-OBJECT-SIZE"), makeKeyword("HASH-FN"), makeSymbol("SXHASH-EXTERNAL"), makeKeyword("ENCODING-KEY-INPUT-FN"), makeSymbol("FIND-OBJECT-BY-HL-EXTERNAL-ID-STRING"), makeKeyword("ENCODING-KEY-OUTPUT-FN"), makeSymbol("HL-EXTERNAL-ID-STRING") });

    static private final SubLString $str_alt207$The_key__S_maps_to_the_non_numeri = makeString("The key ~S maps to the non-numeric value ~S in the file-hash-table ~A.");

    static private final SubLList $list_alt208 = list(list(makeSymbol("KEY"), makeSymbol("VAL"), makeSymbol("FHT"), makeSymbol("DONE-VAR"), makeSymbol("&OPTIONAL"), makeSymbol("KEYS-ONLY?")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym209$THE_KEY = makeUninternedSymbol("THE-KEY");

    static private final SubLSymbol $sym210$THE_VALUE = makeUninternedSymbol("THE-VALUE");

    static private final SubLSymbol $sym211$CONTINUATION = makeUninternedSymbol("CONTINUATION");

    static private final SubLSymbol $sym212$NEXT = makeUninternedSymbol("NEXT");

    static private final SubLSymbol $sym213$COMPLETE_ = makeUninternedSymbol("COMPLETE?");

    static private final SubLList $list_alt215 = list(NIL);

    static private final SubLList $list_alt225 = list(list(makeSymbol("KEY"), makeSymbol("VALUE"), makeSymbol("FHT"), makeSymbol("&KEY"), makeSymbol("MESSAGE"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt226 = list(makeKeyword("MESSAGE"), $DONE);

    static private final SubLSymbol $sym228$TABLE_VAR = makeUninternedSymbol("TABLE-VAR");

    static private final SubLList $list_alt230 = list(makeSymbol("CSETQ"), makeSymbol("*PROGRESS-START-TIME*"), list(makeSymbol("GET-UNIVERSAL-TIME")));

    static private final SubLList $list_alt233 = list(makeSymbol("CSETQ"), makeSymbol("*PROGRESS-SOFAR*"), ZERO_INTEGER);

    static private final SubLList $list_alt236 = list(makeSymbol("NOTE-PERCENT-PROGRESS"), makeSymbol("*PROGRESS-SOFAR*"), makeSymbol("*PROGRESS-TOTAL*"));

    static private final SubLList $list_alt237 = list(makeSymbol("CINC"), makeSymbol("*PROGRESS-SOFAR*"));

    static private final SubLString $str_alt239$_S_____S__ = makeString("~S -> ~S~%");

    static private final SubLList $list_alt240 = list(list(makeSymbol("KEY"), makeSymbol("VALUE"), makeSymbol("FHT"), makeSymbol("&OPTIONAL"), list(makeSymbol("MESSAGE"), makeString("do-file-hash-table"))), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLString $str_alt241$do_file_hash_table = makeString("do-file-hash-table");

    static private final SubLList $list_alt243 = list(makeSymbol("DO-FILE-HASH-TABLE"));

    static private final SubLList $list_alt244 = list(list(makeSymbol("KEY"), makeSymbol("FHT"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt246 = list(makeSymbol("DO-FILE-HASH-TABLE-KEYS"));

    static private final SubLList $list_alt248 = list(list(makeSymbol("KEY"), makeSymbol("FHT"), makeSymbol("&KEY"), makeSymbol("MESSAGE"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym249$FHT_VAR = makeUninternedSymbol("FHT-VAR");

    static private final SubLSymbol $sym250$VALUE = makeUninternedSymbol("VALUE");

    static private final SubLList $list_alt251 = list(T);

    static private final SubLList $list_alt253 = list(list(makeSymbol("KEY"), makeSymbol("FHT"), makeSymbol("&OPTIONAL"), list(makeSymbol("MESSAGE"), makeString("do-file-hash-table-keys"))), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLString $str_alt254$do_file_hash_table_keys = makeString("do-file-hash-table-keys");

    static private final SubLSymbol $sym257$_ = makeSymbol("<");

    static private final SubLString $str_alt258$Invalid_key_entry__A__Offset_0x_X = makeString("Invalid key entry ~A: Offset 0x~X (~A) HashCode ~A~%");

    static private final SubLString $str_alt259$FHT_for__A_corrupted___A_____A__A = makeString("FHT for ~A corrupted; ~A != ~A+~A+ -- cannot recover in this fashion.~%");

    static private final SubLString $str_alt260$Entry__A___A_bytes_total___A_byte = makeString("Entry ~A: ~A bytes total, ~A bytes key size, ~A bytes object size (+ ~A bytes header).~%");

    static private final SubLSymbol $sym261$ITERATE_FILE_HASH_TABLE_DONE_ = makeSymbol("ITERATE-FILE-HASH-TABLE-DONE?");

    static private final SubLList $list_alt265 = list(makeSymbol("CURRENT"), makeSymbol("FHT"), makeSymbol("KEYS-ONLY?"), makeSymbol("FINALIZE-FHT?"));

    static private final SubLString $str_alt267$converting_file_hash_table_to_ali = makeString("converting file-hash-table to alist");

    static private final SubLString $str_alt268$tmp_ = makeString("tmp/");

    static private final SubLString $str_alt271$_tmp_ = makeString("/tmp/");

    static private final SubLString $str_alt280$Cannot_put_into_table__table_is_f = makeString("Cannot put into table; table is full and cannot grow.");

    static private final SubLString $str_alt281$Implementation_Error__Unexpected_ = makeString("Implementation Error: Unexpected status ~A returned by FHT-LOOKUP-KEY. (KEY = ~A, INDEX = ~A.)");

    @Override
    public void declareFunctions() {
        declare_file_hash_table_file();
    }

    static private final SubLString $str_alt283$Can_neither_find_key__S_nor_prove = makeString("Can neither find key ~S nor prove its non-presence. Ensure that your encoding function and your test function work correctly together, i.e. (funcall testfn <OBJ> (cfasl-decoding (cfasl-encoding <OBJ))) -> T. If they are, then this is an implementation error. (INDEX = ~A, STATUS = ~A, KEY-ENTRY = ~A)");

    @Override
    public void initializeVariables() {
        init_file_hash_table_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_file_hash_table_file();
    }

    public static final class $file_hash_table_native extends SubLStructNative {
        public SubLObject $stream;

        public SubLObject $header;

        public SubLObject $lock;

        public SubLObject $encoding_input_fn;

        public SubLObject $encoding_output_fn;

        public SubLObject $encoding_size_fn;

        public SubLObject $encoding_key_input_fn;

        public SubLObject $encoding_key_output_fn;

        public SubLObject $testfn;

        public SubLObject $hash_fn;

        public SubLObject $input_cache;

        public SubLObject $output_cache;

        public SubLObject $property_list;

        private static final SubLStructDeclNative structDecl;

        public $file_hash_table_native() {
            file_hash_table.$file_hash_table_native.this.$stream = Lisp.NIL;
            file_hash_table.$file_hash_table_native.this.$header = Lisp.NIL;
            file_hash_table.$file_hash_table_native.this.$lock = Lisp.NIL;
            file_hash_table.$file_hash_table_native.this.$encoding_input_fn = Lisp.NIL;
            file_hash_table.$file_hash_table_native.this.$encoding_output_fn = Lisp.NIL;
            file_hash_table.$file_hash_table_native.this.$encoding_size_fn = Lisp.NIL;
            file_hash_table.$file_hash_table_native.this.$encoding_key_input_fn = Lisp.NIL;
            file_hash_table.$file_hash_table_native.this.$encoding_key_output_fn = Lisp.NIL;
            file_hash_table.$file_hash_table_native.this.$testfn = Lisp.NIL;
            file_hash_table.$file_hash_table_native.this.$hash_fn = Lisp.NIL;
            file_hash_table.$file_hash_table_native.this.$input_cache = Lisp.NIL;
            file_hash_table.$file_hash_table_native.this.$output_cache = Lisp.NIL;
            file_hash_table.$file_hash_table_native.this.$property_list = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return file_hash_table.$file_hash_table_native.this.$stream;
        }

        @Override
        public SubLObject getField3() {
            return file_hash_table.$file_hash_table_native.this.$header;
        }

        @Override
        public SubLObject getField4() {
            return file_hash_table.$file_hash_table_native.this.$lock;
        }

        @Override
        public SubLObject getField5() {
            return file_hash_table.$file_hash_table_native.this.$encoding_input_fn;
        }

        @Override
        public SubLObject getField6() {
            return file_hash_table.$file_hash_table_native.this.$encoding_output_fn;
        }

        @Override
        public SubLObject getField7() {
            return file_hash_table.$file_hash_table_native.this.$encoding_size_fn;
        }

        @Override
        public SubLObject getField8() {
            return file_hash_table.$file_hash_table_native.this.$encoding_key_input_fn;
        }

        @Override
        public SubLObject getField9() {
            return file_hash_table.$file_hash_table_native.this.$encoding_key_output_fn;
        }

        @Override
        public SubLObject getField10() {
            return file_hash_table.$file_hash_table_native.this.$testfn;
        }

        @Override
        public SubLObject getField11() {
            return file_hash_table.$file_hash_table_native.this.$hash_fn;
        }

        @Override
        public SubLObject getField12() {
            return file_hash_table.$file_hash_table_native.this.$input_cache;
        }

        @Override
        public SubLObject getField13() {
            return file_hash_table.$file_hash_table_native.this.$output_cache;
        }

        @Override
        public SubLObject getField14() {
            return file_hash_table.$file_hash_table_native.this.$property_list;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return file_hash_table.$file_hash_table_native.this.$stream = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return file_hash_table.$file_hash_table_native.this.$header = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return file_hash_table.$file_hash_table_native.this.$lock = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return file_hash_table.$file_hash_table_native.this.$encoding_input_fn = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return file_hash_table.$file_hash_table_native.this.$encoding_output_fn = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return file_hash_table.$file_hash_table_native.this.$encoding_size_fn = value;
        }

        @Override
        public SubLObject setField8(final SubLObject value) {
            return file_hash_table.$file_hash_table_native.this.$encoding_key_input_fn = value;
        }

        @Override
        public SubLObject setField9(final SubLObject value) {
            return file_hash_table.$file_hash_table_native.this.$encoding_key_output_fn = value;
        }

        @Override
        public SubLObject setField10(final SubLObject value) {
            return file_hash_table.$file_hash_table_native.this.$testfn = value;
        }

        @Override
        public SubLObject setField11(final SubLObject value) {
            return file_hash_table.$file_hash_table_native.this.$hash_fn = value;
        }

        @Override
        public SubLObject setField12(final SubLObject value) {
            return file_hash_table.$file_hash_table_native.this.$input_cache = value;
        }

        @Override
        public SubLObject setField13(final SubLObject value) {
            return file_hash_table.$file_hash_table_native.this.$output_cache = value;
        }

        @Override
        public SubLObject setField14(final SubLObject value) {
            return file_hash_table.$file_hash_table_native.this.$property_list = value;
        }

        static {
            structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.file_hash_table.$file_hash_table_native.class, FILE_HASH_TABLE, FILE_HASH_TABLE_P, $list2, $list3, new String[]{ "$stream", "$header", "$lock", "$encoding_input_fn", "$encoding_output_fn", "$encoding_size_fn", "$encoding_key_input_fn", "$encoding_key_output_fn", "$testfn", "$hash_fn", "$input_cache", "$output_cache", "$property_list" }, $list4, $list5, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    static private final SubLString $str_alt284$Cannot_get_key__S_from_table__Imp = makeString("Cannot get key ~S from table: Implementation error (INDEX = ~A, STATUS = ~A, KEY-ENTRY = ~A).");

    static private final SubLList $list_alt287 = list(makeSymbol("SIZE"), makeSymbol("NEXT"));

    static private final SubLList $list_alt288 = list($SIZE, $NEXT);

    static private final SubLList $list_alt289 = list(makeSymbol("HTFILE-FILE-BLOCK-ENTRY-SIZE"), makeSymbol("HTFILE-FILE-BLOCK-ENTRY-NEXT"));

    static private final SubLList $list_alt290 = list(makeSymbol("_CSETF-HTFILE-FILE-BLOCK-ENTRY-SIZE"), makeSymbol("_CSETF-HTFILE-FILE-BLOCK-ENTRY-NEXT"));

    static private final SubLString $str_alt298$__FILE_BLOCK_ENTRY__s__s_ = makeString("#<FILE-BLOCK-ENTRY:~s:~s>");

    static private final SubLString $str_alt299$Unable_to_position_to_file_pos__D = makeString("Unable to position to file-pos ~D; true position is.");

    static private final SubLString $str_alt300$Unable_to_position_to_file_pos__A = makeString("Unable to position to file-pos ~A; true position is ~A.");

    static private final SubLString $str_alt301$Invalid_key_index__D_into_key_spa = makeString("Invalid key index ~D into key space [0,~D).");

    static private final SubLList $list_alt304 = list(list(makeSymbol("FHT"), makeSymbol("DIFF-KEYSPACE"), makeSymbol("DIFF-CAPACITY")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym305$HEADER_LOCAL = makeUninternedSymbol("HEADER-LOCAL");

    static private final SubLSymbol $sym306$KEYSPACE_TEMP = makeUninternedSymbol("KEYSPACE-TEMP");

    static private final SubLSymbol $sym307$CAPACITY_TEMP = makeUninternedSymbol("CAPACITY-TEMP");

    static private final SubLString $str_alt309$Internal_error__S_during_table_re = makeString("Internal error ~S during table rehashing; file might be corrupted.");

    static private final SubLString $str_alt311$Cannot_correctly_determine_file_p = makeString("Cannot correctly determine file position after writing object entry of ~D bytes to ~D.");

    static private final SubLString $str_alt312$Predicted_object_size__D_did_not_ = makeString("Predicted object size ~D did not match I/O size ~D; file might be corrupted.");

    static private final SubLString $str_alt313$Claimed_object_size__D_did_not_ma = makeString("Claimed object size ~D did not match I/O size ~D; file might be corrupted.");

    static private final SubLList $list_alt315 = list(makeSymbol("VMAJOR"), makeSymbol("VMINOR"), makeSymbol("READER"), makeSymbol("WRITER"), makeSymbol("VERIFIER"));

    static private final SubLString $str_alt328$After_reading__S__computed_positi = makeString("After reading ~S, computed position ~D /= actual file position ~D.");

    static private final SubLString $str_alt330$Premature_end_of_file_when_moving = makeString("Premature end-of-file when moving block (~D bytes) from ~D to ~D.");

    static private final SubLString $str_alt334$Invalid_Fast_FHT_optimization_mod = makeString("Invalid Fast-FHT optimization mode ~A.");

    static private final SubLList $list_alt337 = list(makeSymbol("FHT"), makeSymbol("TEMPSTEM"), makeSymbol("TEMPFILE"), makeSymbol("KEYSTREAM"));

    public static final class $file_hash_table_p$UnaryFunction extends UnaryFunction {
        public $file_hash_table_p$UnaryFunction() {
            super(extractFunctionNamed("FILE-HASH-TABLE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return file_hash_table_p(arg1);
        }
    }

    static private final SubLList $list_alt338 = list(makeKeyword("FHT"), makeKeyword("TEMPSTEM"), makeKeyword("TEMPFILE"), makeKeyword("KEYSTREAM"));

    static private final SubLList $list_alt339 = list(makeSymbol("FAST-CREATE-FHT-FHT"), makeSymbol("FAST-CREATE-FHT-TEMPSTEM"), makeSymbol("FAST-CREATE-FHT-TEMPFILE"), makeSymbol("FAST-CREATE-FHT-KEYSTREAM"));

    static private final SubLList $list_alt340 = list(makeSymbol("_CSETF-FAST-CREATE-FHT-FHT"), makeSymbol("_CSETF-FAST-CREATE-FHT-TEMPSTEM"), makeSymbol("_CSETF-FAST-CREATE-FHT-TEMPFILE"), makeSymbol("_CSETF-FAST-CREATE-FHT-KEYSTREAM"));

    static private final SubLString $str_alt354$keystream_ = makeString("keystream-");

    static private final SubLList $list_alt355 = list(makeKeyword("ERROR"), makeKeyword("USE-FIRST"));

    static private final SubLString $str_alt356$Unknown_NON_UNIQUE_KEY_HANDLING_v = makeString("Unknown NON-UNIQUE-KEY-HANDLING value ~S");

    static private final SubLString $str_alt360$Unable_to_open__S = makeString("Unable to open ~S");

    static private final SubLString $str_alt362$Cannot_call_this_method_in_mode__ = makeString("Cannot call this method in mode ~A.");

    static private final SubLString $str_alt363$Seeding_keyspace_with_unambiguous = makeString("Seeding keyspace with unambiguous keys ....");

    static private final SubLString $str_alt364$Run_in_index_of_keystream__prev__ = makeString("Run in index of keystream (prev=~A curr=~A). Fix FAST-FHT-UNIQUIFY-KEYSTREAM");

    static private final SubLString $str_alt365$Inserting_ = makeString("Inserting ");

    static private final SubLString $str_alt366$_keys_into_keyspace_____ = makeString(" keys into keyspace ....");

    static private final SubLString $str_alt367$Sorry__key__A_appears_not_to_be_u = makeString("Sorry, key ~A appears not to be unique within the set; fast hash table create only works for already unique sets.");

    static private final SubLList $list_alt371 = list(makeSymbol("TEMPSTEM"), makeSymbol("IN-FILES"), makeSymbol("OUT-FILES"));

    static private final SubLList $list_alt372 = list(makeKeyword("TEMPSTEM"), makeKeyword("IN-FILES"), makeKeyword("OUT-FILES"));

    static private final SubLList $list_alt373 = list(makeSymbol("FSTFHT-KSORTER-TEMPSTEM"), makeSymbol("FSTFHT-KSORTER-IN-FILES"), makeSymbol("FSTFHT-KSORTER-OUT-FILES"));

    static private final SubLList $list_alt374 = list(makeSymbol("_CSETF-FSTFHT-KSORTER-TEMPSTEM"), makeSymbol("_CSETF-FSTFHT-KSORTER-IN-FILES"), makeSymbol("_CSETF-FSTFHT-KSORTER-OUT-FILES"));

    static private final SubLString $str_alt385$Prepare_tiled_input_files_____ = makeString("Prepare tiled input files ....");

    static private final SubLString $str_alt386$Less_than_3_tiles__no_sort_needed = makeString("Less than 3 tiles, no sort needed ....");

    static private final SubLString $str_alt388$Merge_sorting_keystream_of_ = makeString("Merge-sorting keystream of ");

    static private final SubLString $str_alt389$_tiles_in_ = makeString(" tiles in ");

    static private final SubLString $str_alt390$_passes____ = makeString(" passes....");

    public static final class $htfile_header_p$UnaryFunction extends UnaryFunction {
        public $htfile_header_p$UnaryFunction() {
            super(extractFunctionNamed("HTFILE-HEADER-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return htfile_header_p(arg1);
        }
    }

    static private final SubLString $str_alt391$Generate_set_and_activity_files__ = makeString("Generate set and activity files ....");

    static private final SubLString $str_alt392$in_ = makeString("in-");

    static private final SubLString $str_alt393$out_ = makeString("out-");

    public static final class $htfile_object_entry_native extends SubLStructNative {
        public SubLObject $size;

        public SubLObject $type;

        public SubLObject $key_size;

        public SubLObject $key;

        public SubLObject $data_size;

        public SubLObject $data;

        private static final SubLStructDeclNative structDecl;

        public $htfile_object_entry_native() {
            file_hash_table.$htfile_object_entry_native.this.$size = Lisp.NIL;
            file_hash_table.$htfile_object_entry_native.this.$type = Lisp.NIL;
            file_hash_table.$htfile_object_entry_native.this.$key_size = Lisp.NIL;
            file_hash_table.$htfile_object_entry_native.this.$key = Lisp.NIL;
            file_hash_table.$htfile_object_entry_native.this.$data_size = Lisp.NIL;
            file_hash_table.$htfile_object_entry_native.this.$data = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return file_hash_table.$htfile_object_entry_native.this.$size;
        }

        @Override
        public SubLObject getField3() {
            return file_hash_table.$htfile_object_entry_native.this.$type;
        }

        @Override
        public SubLObject getField4() {
            return file_hash_table.$htfile_object_entry_native.this.$key_size;
        }

        @Override
        public SubLObject getField5() {
            return file_hash_table.$htfile_object_entry_native.this.$key;
        }

        @Override
        public SubLObject getField6() {
            return file_hash_table.$htfile_object_entry_native.this.$data_size;
        }

        @Override
        public SubLObject getField7() {
            return file_hash_table.$htfile_object_entry_native.this.$data;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return file_hash_table.$htfile_object_entry_native.this.$size = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return file_hash_table.$htfile_object_entry_native.this.$type = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return file_hash_table.$htfile_object_entry_native.this.$key_size = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return file_hash_table.$htfile_object_entry_native.this.$key = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return file_hash_table.$htfile_object_entry_native.this.$data_size = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return file_hash_table.$htfile_object_entry_native.this.$data = value;
        }

        static {
            structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.file_hash_table.$htfile_object_entry_native.class, HTFILE_OBJECT_ENTRY, HTFILE_OBJECT_ENTRY_P, $list123, $list124, new String[]{ "$size", "$type", "$key_size", "$key", "$data_size", "$data" }, $list125, $list126, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    static private final SubLString $str_alt394$Can_only_work_from_a_rewound_keys = makeString("Can only work from a rewound keystream ~A.");

    static private final SubLSymbol $sym395$FAST_FHT_KEYSTREAM_ENTRY_ = makeSymbol("FAST-FHT-KEYSTREAM-ENTRY<");

    static private final SubLList $list_alt400 = list(makeUninternedSymbol("START"), makeUninternedSymbol("END"), makeUninternedSymbol("DELTA"));

    static private final SubLString $str_alt401$_of_ = makeString(" of ");

    static private final SubLString $str_alt402$Merge_Pass_ = makeString("Merge Pass ");

    static private final SubLString $str_alt403$The_chunk_count_should_have_decli = makeString("The chunk count should have declined, but did not: ~A >= ~A.");

    static private final SubLString $str_alt404$Only_sentinels_or__EOF_can_be_equ = makeString("Only sentinels or :EOF can be equal, but ~A and ~A are.");

    static private final SubLList $list_alt406 = list(makeSymbol("FHT"), makeSymbol("INDEX"), makeSymbol("ENTRY"), makeSymbol("IN-STREAM"), makeSymbol("LOSER-ITEMS"), makeSymbol("COLLISION-STREAM"));

    static private final SubLSymbol $sym407$_ = makeSymbol("=");

    static private final SubLList $list_alt412 = list(new SubLObject[]{ makeSymbol("FHT"), makeSymbol("KEEPER-ENTRY"), makeSymbol("LOSER-ENTRY"), makeSymbol("KEEPER-STREAM"), makeSymbol("LOSER-STREAM"), makeSymbol("KEEPER-ITEMS"), makeSymbol("LOSER-ITEMS"), makeSymbol("SET-STREAM"), makeSymbol("COLLISION-STREAM") });

    static private final SubLSymbol $sym413$INDEX_KEEPER = makeUninternedSymbol("INDEX-KEEPER");

    static private final SubLSymbol $sym414$INDEX_LOSER = makeUninternedSymbol("INDEX-LOSER");

    static private final SubLString $str_alt417$__A_set_item_A___A_activity_item_ = makeString(" ~A set item~A, ~A activity item~A ");

    static private final SubLString $str_alt419$_________________________ = makeString("=========================");

    public static final class $htfile_object_entry_p$UnaryFunction extends UnaryFunction {
        public $htfile_object_entry_p$UnaryFunction() {
            super(extractFunctionNamed("HTFILE-OBJECT-ENTRY-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return htfile_object_entry_p(arg1);
        }
    }

    static private final SubLString $str_alt420$______File__A______ = makeString("~&<<<<File ~A>>>>~%");

    static private final SubLString $str_alt421$File__A_no_does_not_contain_a_val = makeString("File ~A no does not contain a valid keystream: problem at ~A.");

    static private final SubLString $$$rck = makeString("rck");

    static private final SubLList $list_alt432 = list(new SubLObject[]{ list(list(makeKeyword("SENTINEL"), makeKeyword("SENTINEL")), makeKeyword("EQ")), list(list(makeKeyword("EOF"), makeKeyword("EOF")), makeKeyword("EQ")), list(list(makeKeyword("SENTINEL"), makeKeyword("EOF")), makeKeyword("LT")), list(list(makeKeyword("EOF"), makeKeyword("SENTINEL")), makeKeyword("GT")), list(list(list(makeInteger(104), makeInteger(168), makeInteger(12850), makeString("137")), makeKeyword("SENTINEL")), makeKeyword("LT")), list(list(makeKeyword("SENTINEL"), list(makeInteger(104), makeInteger(168), makeInteger(12850), makeString("137"))), makeKeyword("GT")), list(list(list(makeInteger(104), makeInteger(168), makeInteger(12850), makeString("137")), makeKeyword("EOF")), makeKeyword("LT")), list(list(makeKeyword("EOF"), list(makeInteger(104), makeInteger(168), makeInteger(12850), makeString("137"))), makeKeyword("GT")), list(list(list(makeInteger(128), makeInteger(128), makeInteger(13062), makeString("97")), list(makeInteger(104), makeInteger(168), makeInteger(12850), makeString("137"))), makeKeyword("GT")), list(list(list(makeInteger(104), makeInteger(168), makeInteger(12850), makeString("137")), list(makeInteger(128), makeInteger(128), makeInteger(13062), makeString("97"))), makeKeyword("LT")), list(list(list(makeInteger(104), makeInteger(168), makeInteger(12850), makeString("137")), list(makeInteger(104), makeInteger(168), makeInteger(12850), makeString("137"))), makeKeyword("EQ")) });

    public static final class $htfile_key_entry_p$UnaryFunction extends UnaryFunction {
        public $htfile_key_entry_p$UnaryFunction() {
            super(extractFunctionNamed("HTFILE-KEY-ENTRY-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return htfile_key_entry_p(arg1);
        }
    }

    public static final class $fht_serialization_entry_native extends SubLStructNative {
        public SubLObject $encoding_input_fn;

        public SubLObject $encoding_output_fn;

        public SubLObject $encoding_size_fn;

        public SubLObject $hash_fn;

        public SubLObject $encoding_key_input_fn;

        public SubLObject $encoding_key_output_fn;

        private static final SubLStructDeclNative structDecl;

        public $fht_serialization_entry_native() {
            file_hash_table.$fht_serialization_entry_native.this.$encoding_input_fn = Lisp.NIL;
            file_hash_table.$fht_serialization_entry_native.this.$encoding_output_fn = Lisp.NIL;
            file_hash_table.$fht_serialization_entry_native.this.$encoding_size_fn = Lisp.NIL;
            file_hash_table.$fht_serialization_entry_native.this.$hash_fn = Lisp.NIL;
            file_hash_table.$fht_serialization_entry_native.this.$encoding_key_input_fn = Lisp.NIL;
            file_hash_table.$fht_serialization_entry_native.this.$encoding_key_output_fn = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return file_hash_table.$fht_serialization_entry_native.this.$encoding_input_fn;
        }

        @Override
        public SubLObject getField3() {
            return file_hash_table.$fht_serialization_entry_native.this.$encoding_output_fn;
        }

        @Override
        public SubLObject getField4() {
            return file_hash_table.$fht_serialization_entry_native.this.$encoding_size_fn;
        }

        @Override
        public SubLObject getField5() {
            return file_hash_table.$fht_serialization_entry_native.this.$hash_fn;
        }

        @Override
        public SubLObject getField6() {
            return file_hash_table.$fht_serialization_entry_native.this.$encoding_key_input_fn;
        }

        @Override
        public SubLObject getField7() {
            return file_hash_table.$fht_serialization_entry_native.this.$encoding_key_output_fn;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return file_hash_table.$fht_serialization_entry_native.this.$encoding_input_fn = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return file_hash_table.$fht_serialization_entry_native.this.$encoding_output_fn = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return file_hash_table.$fht_serialization_entry_native.this.$encoding_size_fn = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return file_hash_table.$fht_serialization_entry_native.this.$hash_fn = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return file_hash_table.$fht_serialization_entry_native.this.$encoding_key_input_fn = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return file_hash_table.$fht_serialization_entry_native.this.$encoding_key_output_fn = value;
        }

        static {
            structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.file_hash_table.$fht_serialization_entry_native.class, FHT_SERIALIZATION_ENTRY, FHT_SERIALIZATION_ENTRY_P, $list174, $list175, new String[]{ "$encoding_input_fn", "$encoding_output_fn", "$encoding_size_fn", "$hash_fn", "$encoding_key_input_fn", "$encoding_key_output_fn" }, $list176, $list177, PRINT_FHT_SERIALIZATION_ENTRY);
        }
    }

    static private final SubLList $list_alt434 = list(list(makeSymbol("FHT"), makeSymbol("FILENAME"), makeSymbol("&KEY"), list(makeSymbol("TEST-FN"), list(QUOTE, makeSymbol("*DEFAULT-FHT-TEST-FUNCTION*"))), list(makeSymbol("SERIALIZATION-FN"), makeSymbol("*DEFAULT-FHT-SERIALIZATION-PROTOCOL*"))), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt435 = list(makeKeyword("TEST-FN"), makeKeyword("SERIALIZATION-FN"));

    static private final SubLList $list_alt444 = list(list(makeSymbol("FHT"), makeSymbol("FILENAME"), makeSymbol("&KEY"), list(makeSymbol("EXPECTED-ITEMS"), makeSymbol("*HTFILE-DEFAULT-EXPECTED-ITEMS*")), list(makeSymbol("AVERAGE-SIZE"), makeSymbol("*HTFILE-DEFAULT-AVERAGE-SIZE*")), list(makeSymbol("TEST-FN"), list(QUOTE, makeSymbol("*DEFAULT-FHT-TEST-FUNCTION*"))), list(makeSymbol("SERIALIZATION-FN"), makeSymbol("*DEFAULT-FHT-SERIALIZATION-PROTOCOL*"))), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt445 = list(makeKeyword("EXPECTED-ITEMS"), makeKeyword("AVERAGE-SIZE"), makeKeyword("TEST-FN"), makeKeyword("SERIALIZATION-FN"));

    static private final SubLList $list_alt449 = list(list(makeSymbol("FAST-FHT"), makeSymbol("FILENAME"), makeSymbol("&KEY"), list(makeSymbol("TEMPDIR"), list(makeSymbol("TEMP-DIRECTORY"))), list(makeSymbol("TEST-FN"), list(QUOTE, makeSymbol("*DEFAULT-FHT-TEST-FUNCTION*"))), list(makeSymbol("SERIALIZATION-FN"), makeSymbol("*DEFAULT-FHT-SERIALIZATION-PROTOCOL*")), list(makeSymbol("KEEP-TEMPORARY-KEYFILE"))), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt450 = list(makeKeyword("TEMPDIR"), makeKeyword("TEST-FN"), makeKeyword("SERIALIZATION-FN"), makeKeyword("KEEP-TEMPORARY-KEYFILE"));

    public static final class $fht_serialization_entry_p$UnaryFunction extends UnaryFunction {
        public $fht_serialization_entry_p$UnaryFunction() {
            super(extractFunctionNamed("FHT-SERIALIZATION-ENTRY-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return fht_serialization_entry_p(arg1);
        }
    }

    static private final SubLList $list_alt456 = list(new SubLObject[]{ list(list(makeInteger(31), THREE_INTEGER, makeKeyword("MODERATE")), makeKeyword("SUCCESS")), list(list(makeInteger(23), THREE_INTEGER, makeKeyword("MODERATE")), makeKeyword("SUCCESS")), list(list(FIFTEEN_INTEGER, THREE_INTEGER, makeKeyword("MODERATE")), makeKeyword("SUCCESS")), list(list(SEVEN_INTEGER, THREE_INTEGER, makeKeyword("MODERATE")), makeKeyword("SUCCESS")), list(list(makeInteger(31), THREE_INTEGER, makeKeyword("AGGRESSIVE")), makeKeyword("SUCCESS")), list(list(makeInteger(23), THREE_INTEGER, makeKeyword("AGGRESSIVE")), makeKeyword("SUCCESS")), list(list(FIFTEEN_INTEGER, THREE_INTEGER, makeKeyword("AGGRESSIVE")), makeKeyword("SUCCESS")), list(list(SEVEN_INTEGER, THREE_INTEGER, makeKeyword("AGGRESSIVE")), makeKeyword("SUCCESS")), list(list(makeInteger(31), THREE_INTEGER, makeKeyword("CONSERVATIVE")), makeKeyword("SUCCESS")), list(list(makeInteger(23), THREE_INTEGER, makeKeyword("CONSERVATIVE")), makeKeyword("SUCCESS")), list(list(FIFTEEN_INTEGER, THREE_INTEGER, makeKeyword("CONSERVATIVE")), makeKeyword("SUCCESS")), list(list(SEVEN_INTEGER, THREE_INTEGER, makeKeyword("CONSERVATIVE")), makeKeyword("SUCCESS")) });

    public static final class $htfile_file_block_entry_native extends SubLStructNative {
        public SubLObject $size;

        public SubLObject $next;

        private static final SubLStructDeclNative structDecl;

        public $htfile_file_block_entry_native() {
            file_hash_table.$htfile_file_block_entry_native.this.$size = Lisp.NIL;
            file_hash_table.$htfile_file_block_entry_native.this.$next = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return file_hash_table.$htfile_file_block_entry_native.this.$size;
        }

        @Override
        public SubLObject getField3() {
            return file_hash_table.$htfile_file_block_entry_native.this.$next;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return file_hash_table.$htfile_file_block_entry_native.this.$size = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return file_hash_table.$htfile_file_block_entry_native.this.$next = value;
        }

        static {
            structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.file_hash_table.$htfile_file_block_entry_native.class, HTFILE_FILE_BLOCK_ENTRY, HTFILE_FILE_BLOCK_ENTRY_P, $list326, $list327, new String[]{ "$size", "$next" }, $list328, $list329, PRINT_HTFILE_FILE_BLOCK_ENTRY);
        }
    }

    static private final SubLString $str_alt457$My_String_ = makeString("My String ");

    static private final SubLString $str_alt458$fht_ = makeString("fht-");

    static private final SubLString $str_alt459$Writing_out_FHT_____ = makeString("Writing out FHT ....");

    static private final SubLList $list_alt460 = list(makeSymbol("KEY"), makeSymbol("VALUES"));

    public static final class $htfile_file_block_entry_p$UnaryFunction extends UnaryFunction {
        public $htfile_file_block_entry_p$UnaryFunction() {
            super(extractFunctionNamed("HTFILE-FILE-BLOCK-ENTRY-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return htfile_file_block_entry_p(arg1);
        }
    }

    static private final SubLString $str_alt461$Error__expected__A_items__got__A_ = makeString("Error, expected ~A items, got ~A.");

    static private final SubLString $str_alt462$Checking_against_FHT_____ = makeString("Checking against FHT ....");

    static private final SubLString $str_alt463$For__A__expected__A__got__A_inste = makeString("For ~A, expected ~A, got ~A instead.");

    static private final SubLString $str_alt464$Checking_aggressively_built_FHT_a = makeString("Checking aggressively built FHT against map ...");

    static private final SubLString $str_alt465$For__A__epxected__A__got__A_inste = makeString("For ~A, epxected ~A, got ~A instead.");

    public static final class $fast_create_fht_p$UnaryFunction extends UnaryFunction {
        public $fast_create_fht_p$UnaryFunction() {
            super(extractFunctionNamed("FAST-CREATE-FHT-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return fast_create_fht_p(arg1);
        }
    }

    public static final class $fast_fht_keystream_sorter_native extends SubLStructNative {
        public SubLObject $tempstem;

        public SubLObject $in_files;

        public SubLObject $out_files;

        private static final SubLStructDeclNative structDecl;

        public $fast_fht_keystream_sorter_native() {
            file_hash_table.$fast_fht_keystream_sorter_native.this.$tempstem = Lisp.NIL;
            file_hash_table.$fast_fht_keystream_sorter_native.this.$in_files = Lisp.NIL;
            file_hash_table.$fast_fht_keystream_sorter_native.this.$out_files = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return file_hash_table.$fast_fht_keystream_sorter_native.this.$tempstem;
        }

        @Override
        public SubLObject getField3() {
            return file_hash_table.$fast_fht_keystream_sorter_native.this.$in_files;
        }

        @Override
        public SubLObject getField4() {
            return file_hash_table.$fast_fht_keystream_sorter_native.this.$out_files;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return file_hash_table.$fast_fht_keystream_sorter_native.this.$tempstem = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return file_hash_table.$fast_fht_keystream_sorter_native.this.$in_files = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return file_hash_table.$fast_fht_keystream_sorter_native.this.$out_files = value;
        }

        static {
            structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.file_hash_table.$fast_fht_keystream_sorter_native.class, FAST_FHT_KEYSTREAM_SORTER, FAST_FHT_KEYSTREAM_SORTER_P, $list430, $list431, new String[]{ "$tempstem", "$in_files", "$out_files" }, $list432, $list433, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static final class $fast_fht_keystream_sorter_p$UnaryFunction extends UnaryFunction {
        public $fast_fht_keystream_sorter_p$UnaryFunction() {
            super(extractFunctionNamed("FAST-FHT-KEYSTREAM-SORTER-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return fast_fht_keystream_sorter_p(arg1);
        }
    }
}

/**
 * Total time: 3055 ms
 */
