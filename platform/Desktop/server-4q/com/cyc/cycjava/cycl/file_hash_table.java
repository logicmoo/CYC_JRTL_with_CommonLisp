package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class file_hash_table extends SubLTranslatedFile
{

    public static final SubLFile me = new file_hash_table();
    public static final String myName = "com.cyc.cycjava.cycl.file_hash_table";
    public static final String myFingerPrint = "ce7868f7a98e3f837b379682fe507717f6366189cc5d4e43bb6dfd89288fcf7b";
    public static SubLSymbol $dtp_file_hash_table$ = null;
    public static SubLSymbol $dtp_htfile_header$ = null;
    public static SubLSymbol $dtp_htfile_object_entry$ = null;
    public static SubLSymbol $dtp_htfile_key_entry$ = null;
    public static SubLSymbol $default_fht_test_function$ = null;
    public static SubLSymbol $default_fht_serialization_protocol$ = null;
    public static SubLSymbol $fht_min_cache_capacity$ = null;
    public static SubLSymbol $fht_cache_percentage$ = null;
    private static SubLSymbol $htfile_header_current_vmajor$ = null;
    private static SubLSymbol $htfile_header_current_vminor$ = null;
    private static SubLSymbol $htfile_header_current_size$ = null;
    public static SubLSymbol $htfile_default_expected_items$ = null;
    public static SubLSymbol $htfile_default_average_size$ = null;
    private static SubLSymbol $fht_empty_offset_marker$ = null;
    private static SubLSymbol $fht_tombstone_offset_marker$ = null;
    private static SubLSymbol $fht_invalid_hash_code$ = null;
    private static SubLSymbol $fht_tombstone_key_entry$ = null;
    private static SubLSymbol $fht_empty_key_entry$ = null;
    private static SubLSymbol $max_fht_hash_code_value$ = null;
    public static SubLSymbol $dtp_fht_serialization_entry$ = null;
    private static SubLSymbol $fht_serialization_table$ = null;
    public static SubLSymbol $fht_lookup_stream$ = null;
    private static SubLSymbol $fht_not_found$ = null;
    private static SubLSymbol $not_in_fht$ = null;
    private static SubLSymbol $fast_put_skip_output_forcing$ = null;
    private static SubLSymbol $htfile_minimal_file_block_size$ = null;
    public static SubLSymbol $dtp_htfile_file_block_entry$ = null;
    private static SubLSymbol $htfile_key_entry_size$ = null;
    private static SubLSymbol $fht_hash_constant_a$ = null;
    private static SubLSymbol $fht_hash_step_size$ = null;
    private static SubLSymbol $fht_hash_next_step_pow2$ = null;
    private static SubLSymbol $fht_dknuths_magic_cutoff$ = null;
    private static SubLSymbol $keyspace_move_size$ = null;
    private static SubLSymbol $keyspace_rehash_cache_size$ = null;
    private static SubLSymbol $htfile_object_entry_size$ = null;
    public static SubLSymbol $file_hash_table_header_position$ = null;
    private static SubLSymbol $file_hash_table_headers$ = null;
    public static SubLSymbol $fast_file_hash_table_optimization_mode$ = null;
    public static SubLSymbol $dtp_fast_create_fht$ = null;
    private static SubLSymbol $fast_fht_large_buffer_size$ = null;
    private static SubLSymbol $fast_fht_small_buffer_size$ = null;
    public static SubLSymbol $fast_fht_keyspace_alignment$ = null;
    public static SubLSymbol $dtp_fast_fht_keystream_sorter$ = null;
    private static SubLSymbol $fast_fht_sentinel_hashcode_value$ = null;
    private static SubLSymbol $fast_fht_sentinel_index_value$ = null;
    public static SubLSymbol $fast_fht_keystream_tile_size_pow2$ = null;
    private static SubLSymbol $test_fast_fht_generator_state$ = null;
    private static final SubLSymbol $sym0$FILE_HASH_TABLE = SubLObjectFactory.makeSymbol("FILE-HASH-TABLE");
    private static final SubLSymbol $sym1$FILE_HASH_TABLE_P = SubLObjectFactory.makeSymbol("FILE-HASH-TABLE-P");
    private static final SubLList $list2 = ConsesLow.list(new SubLObject[] {
        SubLObjectFactory.makeSymbol("STREAM"), SubLObjectFactory.makeSymbol("HEADER"), SubLObjectFactory.makeSymbol("LOCK"), SubLObjectFactory.makeSymbol("ENCODING-INPUT-FN"), SubLObjectFactory.makeSymbol("ENCODING-OUTPUT-FN"), SubLObjectFactory.makeSymbol("ENCODING-SIZE-FN"), SubLObjectFactory.makeSymbol("ENCODING-KEY-INPUT-FN"), SubLObjectFactory.makeSymbol("ENCODING-KEY-OUTPUT-FN"), SubLObjectFactory.makeSymbol("TESTFN"), SubLObjectFactory.makeSymbol("HASH-FN"), 
        SubLObjectFactory.makeSymbol("INPUT-CACHE"), SubLObjectFactory.makeSymbol("OUTPUT-CACHE"), SubLObjectFactory.makeSymbol("PROPERTY-LIST")
    });
    private static final SubLList $list3 = ConsesLow.list(new SubLObject[] {
        SubLObjectFactory.makeKeyword("STREAM"), SubLObjectFactory.makeKeyword("HEADER"), SubLObjectFactory.makeKeyword("LOCK"), SubLObjectFactory.makeKeyword("ENCODING-INPUT-FN"), SubLObjectFactory.makeKeyword("ENCODING-OUTPUT-FN"), SubLObjectFactory.makeKeyword("ENCODING-SIZE-FN"), SubLObjectFactory.makeKeyword("ENCODING-KEY-INPUT-FN"), SubLObjectFactory.makeKeyword("ENCODING-KEY-OUTPUT-FN"), SubLObjectFactory.makeKeyword("TESTFN"), SubLObjectFactory.makeKeyword("HASH-FN"), 
        SubLObjectFactory.makeKeyword("INPUT-CACHE"), SubLObjectFactory.makeKeyword("OUTPUT-CACHE"), SubLObjectFactory.makeKeyword("PROPERTY-LIST")
    });
    private static final SubLList $list4 = ConsesLow.list(new SubLObject[] {
        SubLObjectFactory.makeSymbol("FILE-HASH-TABLE-STREAM"), SubLObjectFactory.makeSymbol("FILE-HASH-TABLE-HEADER"), SubLObjectFactory.makeSymbol("FILE-HASH-TABLE-LOCK"), SubLObjectFactory.makeSymbol("FILE-HASH-TABLE-ENCODING-INPUT-FN"), SubLObjectFactory.makeSymbol("FILE-HASH-TABLE-ENCODING-OUTPUT-FN"), SubLObjectFactory.makeSymbol("FILE-HASH-TABLE-ENCODING-SIZE-FN"), SubLObjectFactory.makeSymbol("FILE-HASH-TABLE-ENCODING-KEY-INPUT-FN"), SubLObjectFactory.makeSymbol("FILE-HASH-TABLE-ENCODING-KEY-OUTPUT-FN"), SubLObjectFactory.makeSymbol("FILE-HASH-TABLE-TESTFN"), SubLObjectFactory.makeSymbol("FILE-HASH-TABLE-HASH-FN"), 
        SubLObjectFactory.makeSymbol("FILE-HASH-TABLE-INPUT-CACHE"), SubLObjectFactory.makeSymbol("FILE-HASH-TABLE-OUTPUT-CACHE"), SubLObjectFactory.makeSymbol("FILE-HASH-TABLE-PROPERTY-LIST")
    });
    private static final SubLList $list5 = ConsesLow.list(new SubLObject[] {
        SubLObjectFactory.makeSymbol("_CSETF-FILE-HASH-TABLE-STREAM"), SubLObjectFactory.makeSymbol("_CSETF-FILE-HASH-TABLE-HEADER"), SubLObjectFactory.makeSymbol("_CSETF-FILE-HASH-TABLE-LOCK"), SubLObjectFactory.makeSymbol("_CSETF-FILE-HASH-TABLE-ENCODING-INPUT-FN"), SubLObjectFactory.makeSymbol("_CSETF-FILE-HASH-TABLE-ENCODING-OUTPUT-FN"), SubLObjectFactory.makeSymbol("_CSETF-FILE-HASH-TABLE-ENCODING-SIZE-FN"), SubLObjectFactory.makeSymbol("_CSETF-FILE-HASH-TABLE-ENCODING-KEY-INPUT-FN"), SubLObjectFactory.makeSymbol("_CSETF-FILE-HASH-TABLE-ENCODING-KEY-OUTPUT-FN"), SubLObjectFactory.makeSymbol("_CSETF-FILE-HASH-TABLE-TESTFN"), SubLObjectFactory.makeSymbol("_CSETF-FILE-HASH-TABLE-HASH-FN"), 
        SubLObjectFactory.makeSymbol("_CSETF-FILE-HASH-TABLE-INPUT-CACHE"), SubLObjectFactory.makeSymbol("_CSETF-FILE-HASH-TABLE-OUTPUT-CACHE"), SubLObjectFactory.makeSymbol("_CSETF-FILE-HASH-TABLE-PROPERTY-LIST")
    });
    private static final SubLSymbol $sym6$DEFAULT_STRUCT_PRINT_FUNCTION = SubLObjectFactory.makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
    private static final SubLSymbol $sym7$FILE_HASH_TABLE_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("FILE-HASH-TABLE-PRINT-FUNCTION-TRAMPOLINE");
    private static final SubLList $list8 = ConsesLow.list(SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), SubLObjectFactory.makeSymbol("FILE-HASH-TABLE-P"));
    private static final SubLSymbol $sym9$FILE_HASH_TABLE_STREAM = SubLObjectFactory.makeSymbol("FILE-HASH-TABLE-STREAM");
    private static final SubLSymbol $sym10$_CSETF_FILE_HASH_TABLE_STREAM = SubLObjectFactory.makeSymbol("_CSETF-FILE-HASH-TABLE-STREAM");
    private static final SubLSymbol $sym11$FILE_HASH_TABLE_HEADER = SubLObjectFactory.makeSymbol("FILE-HASH-TABLE-HEADER");
    private static final SubLSymbol $sym12$_CSETF_FILE_HASH_TABLE_HEADER = SubLObjectFactory.makeSymbol("_CSETF-FILE-HASH-TABLE-HEADER");
    private static final SubLSymbol $sym13$FILE_HASH_TABLE_LOCK = SubLObjectFactory.makeSymbol("FILE-HASH-TABLE-LOCK");
    private static final SubLSymbol $sym14$_CSETF_FILE_HASH_TABLE_LOCK = SubLObjectFactory.makeSymbol("_CSETF-FILE-HASH-TABLE-LOCK");
    private static final SubLSymbol $sym15$FILE_HASH_TABLE_ENCODING_INPUT_FN = SubLObjectFactory.makeSymbol("FILE-HASH-TABLE-ENCODING-INPUT-FN");
    private static final SubLSymbol $sym16$_CSETF_FILE_HASH_TABLE_ENCODING_INPUT_FN = SubLObjectFactory.makeSymbol("_CSETF-FILE-HASH-TABLE-ENCODING-INPUT-FN");
    private static final SubLSymbol $sym17$FILE_HASH_TABLE_ENCODING_OUTPUT_FN = SubLObjectFactory.makeSymbol("FILE-HASH-TABLE-ENCODING-OUTPUT-FN");
    private static final SubLSymbol $sym18$_CSETF_FILE_HASH_TABLE_ENCODING_OUTPUT_FN = SubLObjectFactory.makeSymbol("_CSETF-FILE-HASH-TABLE-ENCODING-OUTPUT-FN");
    private static final SubLSymbol $sym19$FILE_HASH_TABLE_ENCODING_SIZE_FN = SubLObjectFactory.makeSymbol("FILE-HASH-TABLE-ENCODING-SIZE-FN");
    private static final SubLSymbol $sym20$_CSETF_FILE_HASH_TABLE_ENCODING_SIZE_FN = SubLObjectFactory.makeSymbol("_CSETF-FILE-HASH-TABLE-ENCODING-SIZE-FN");
    private static final SubLSymbol $sym21$FILE_HASH_TABLE_ENCODING_KEY_INPUT_FN = SubLObjectFactory.makeSymbol("FILE-HASH-TABLE-ENCODING-KEY-INPUT-FN");
    private static final SubLSymbol $sym22$_CSETF_FILE_HASH_TABLE_ENCODING_KEY_INPUT_FN = SubLObjectFactory.makeSymbol("_CSETF-FILE-HASH-TABLE-ENCODING-KEY-INPUT-FN");
    private static final SubLSymbol $sym23$FILE_HASH_TABLE_ENCODING_KEY_OUTPUT_FN = SubLObjectFactory.makeSymbol("FILE-HASH-TABLE-ENCODING-KEY-OUTPUT-FN");
    private static final SubLSymbol $sym24$_CSETF_FILE_HASH_TABLE_ENCODING_KEY_OUTPUT_FN = SubLObjectFactory.makeSymbol("_CSETF-FILE-HASH-TABLE-ENCODING-KEY-OUTPUT-FN");
    private static final SubLSymbol $sym25$FILE_HASH_TABLE_TESTFN = SubLObjectFactory.makeSymbol("FILE-HASH-TABLE-TESTFN");
    private static final SubLSymbol $sym26$_CSETF_FILE_HASH_TABLE_TESTFN = SubLObjectFactory.makeSymbol("_CSETF-FILE-HASH-TABLE-TESTFN");
    private static final SubLSymbol $sym27$FILE_HASH_TABLE_HASH_FN = SubLObjectFactory.makeSymbol("FILE-HASH-TABLE-HASH-FN");
    private static final SubLSymbol $sym28$_CSETF_FILE_HASH_TABLE_HASH_FN = SubLObjectFactory.makeSymbol("_CSETF-FILE-HASH-TABLE-HASH-FN");
    private static final SubLSymbol $sym29$FILE_HASH_TABLE_INPUT_CACHE = SubLObjectFactory.makeSymbol("FILE-HASH-TABLE-INPUT-CACHE");
    private static final SubLSymbol $sym30$_CSETF_FILE_HASH_TABLE_INPUT_CACHE = SubLObjectFactory.makeSymbol("_CSETF-FILE-HASH-TABLE-INPUT-CACHE");
    private static final SubLSymbol $sym31$FILE_HASH_TABLE_OUTPUT_CACHE = SubLObjectFactory.makeSymbol("FILE-HASH-TABLE-OUTPUT-CACHE");
    private static final SubLSymbol $sym32$_CSETF_FILE_HASH_TABLE_OUTPUT_CACHE = SubLObjectFactory.makeSymbol("_CSETF-FILE-HASH-TABLE-OUTPUT-CACHE");
    private static final SubLSymbol $sym33$FILE_HASH_TABLE_PROPERTY_LIST = SubLObjectFactory.makeSymbol("FILE-HASH-TABLE-PROPERTY-LIST");
    private static final SubLSymbol $sym34$_CSETF_FILE_HASH_TABLE_PROPERTY_LIST = SubLObjectFactory.makeSymbol("_CSETF-FILE-HASH-TABLE-PROPERTY-LIST");
    private static final SubLSymbol $kw35$STREAM = SubLObjectFactory.makeKeyword("STREAM");
    private static final SubLSymbol $kw36$HEADER = SubLObjectFactory.makeKeyword("HEADER");
    private static final SubLSymbol $kw37$LOCK = SubLObjectFactory.makeKeyword("LOCK");
    private static final SubLSymbol $kw38$ENCODING_INPUT_FN = SubLObjectFactory.makeKeyword("ENCODING-INPUT-FN");
    private static final SubLSymbol $kw39$ENCODING_OUTPUT_FN = SubLObjectFactory.makeKeyword("ENCODING-OUTPUT-FN");
    private static final SubLSymbol $kw40$ENCODING_SIZE_FN = SubLObjectFactory.makeKeyword("ENCODING-SIZE-FN");
    private static final SubLSymbol $kw41$ENCODING_KEY_INPUT_FN = SubLObjectFactory.makeKeyword("ENCODING-KEY-INPUT-FN");
    private static final SubLSymbol $kw42$ENCODING_KEY_OUTPUT_FN = SubLObjectFactory.makeKeyword("ENCODING-KEY-OUTPUT-FN");
    private static final SubLSymbol $kw43$TESTFN = SubLObjectFactory.makeKeyword("TESTFN");
    private static final SubLSymbol $kw44$HASH_FN = SubLObjectFactory.makeKeyword("HASH-FN");
    private static final SubLSymbol $kw45$INPUT_CACHE = SubLObjectFactory.makeKeyword("INPUT-CACHE");
    private static final SubLSymbol $kw46$OUTPUT_CACHE = SubLObjectFactory.makeKeyword("OUTPUT-CACHE");
    private static final SubLSymbol $kw47$PROPERTY_LIST = SubLObjectFactory.makeKeyword("PROPERTY-LIST");
    private static final SubLString $str48$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
    private static final SubLSymbol $kw49$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
    private static final SubLSymbol $sym50$MAKE_FILE_HASH_TABLE = SubLObjectFactory.makeSymbol("MAKE-FILE-HASH-TABLE");
    private static final SubLSymbol $kw51$SLOT = SubLObjectFactory.makeKeyword("SLOT");
    private static final SubLSymbol $kw52$END = SubLObjectFactory.makeKeyword("END");
    private static final SubLSymbol $sym53$VISIT_DEFSTRUCT_OBJECT_FILE_HASH_TABLE_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-FILE-HASH-TABLE-METHOD");
    private static final SubLString $str54$__FHT__Stream___A_Lock___A___ = SubLObjectFactory.makeString("#<FHT: Stream: ~A Lock: ~A ~%");
    private static final SubLString $str55$_Test___A__ = SubLObjectFactory.makeString(" Test: ~A~%");
    private static final SubLString $str56$_Encoding__Input__A_Output__A_Siz = SubLObjectFactory.makeString(" Encoding: Input ~A Output ~A Sizing ~A~%");
    private static final SubLString $str57$_Key_Encoding__Input__A_Output__A = SubLObjectFactory.makeString(" Key Encoding: Input ~A Output ~A~%");
    private static final SubLString $str58$_Hashing___A__ = SubLObjectFactory.makeString(" Hashing: ~A~%");
    private static final SubLString $str59$_Caches__Input__A_Output__A____ = SubLObjectFactory.makeString(" Caches: Input ~A Output ~A >~%");
    private static final SubLString $str60$_Properties___A__ = SubLObjectFactory.makeString(" Properties: ~A~%");
    private static final SubLSymbol $sym61$HTFILE_HEADER = SubLObjectFactory.makeSymbol("HTFILE-HEADER");
    private static final SubLSymbol $sym62$HTFILE_HEADER_P = SubLObjectFactory.makeSymbol("HTFILE-HEADER-P");
    private static final SubLList $list63 = ConsesLow.list(new SubLObject[] {
        SubLObjectFactory.makeSymbol("SIZE"), SubLObjectFactory.makeSymbol("VERSION-MAJOR"), SubLObjectFactory.makeSymbol("VERSION-MINOR"), SubLObjectFactory.makeSymbol("OBJECT-SPACE-OFFSET"), SubLObjectFactory.makeSymbol("KEY-SPACE-OFFSET"), SubLObjectFactory.makeSymbol("CURRENT-HEAP-TOP"), SubLObjectFactory.makeSymbol("ITEM-COUNT"), SubLObjectFactory.makeSymbol("CAPACITY"), SubLObjectFactory.makeSymbol("FREE-LIST-HEAD"), SubLObjectFactory.makeSymbol("DELETION-COUNT"), 
        SubLObjectFactory.makeSymbol("HEADER-CRC"), SubLObjectFactory.makeSymbol("EXTENSION-SPACE-SIZE"), SubLObjectFactory.makeSymbol("EXTENSION-SPACE")
    });
    private static final SubLList $list64 = ConsesLow.list(new SubLObject[] {
        SubLObjectFactory.makeKeyword("SIZE"), SubLObjectFactory.makeKeyword("VERSION-MAJOR"), SubLObjectFactory.makeKeyword("VERSION-MINOR"), SubLObjectFactory.makeKeyword("OBJECT-SPACE-OFFSET"), SubLObjectFactory.makeKeyword("KEY-SPACE-OFFSET"), SubLObjectFactory.makeKeyword("CURRENT-HEAP-TOP"), SubLObjectFactory.makeKeyword("ITEM-COUNT"), SubLObjectFactory.makeKeyword("CAPACITY"), SubLObjectFactory.makeKeyword("FREE-LIST-HEAD"), SubLObjectFactory.makeKeyword("DELETION-COUNT"), 
        SubLObjectFactory.makeKeyword("HEADER-CRC"), SubLObjectFactory.makeKeyword("EXTENSION-SPACE-SIZE"), SubLObjectFactory.makeKeyword("EXTENSION-SPACE")
    });
    private static final SubLList $list65 = ConsesLow.list(new SubLObject[] {
        SubLObjectFactory.makeSymbol("HTFILE-HEADER-SIZE"), SubLObjectFactory.makeSymbol("HTFILE-HEADER-VERSION-MAJOR"), SubLObjectFactory.makeSymbol("HTFILE-HEADER-VERSION-MINOR"), SubLObjectFactory.makeSymbol("HTFILE-HEADER-OBJECT-SPACE-OFFSET"), SubLObjectFactory.makeSymbol("HTFILE-HEADER-KEY-SPACE-OFFSET"), SubLObjectFactory.makeSymbol("HTFILE-HEADER-CURRENT-HEAP-TOP"), SubLObjectFactory.makeSymbol("HTFILE-HEADER-ITEM-COUNT"), SubLObjectFactory.makeSymbol("HTFILE-HEADER-CAPACITY"), SubLObjectFactory.makeSymbol("HTFILE-HEADER-FREE-LIST-HEAD"), SubLObjectFactory.makeSymbol("HTFILE-HEADER-DELETION-COUNT"), 
        SubLObjectFactory.makeSymbol("HTFILE-HEADER-HEADER-CRC"), SubLObjectFactory.makeSymbol("HTFILE-HEADER-EXTENSION-SPACE-SIZE"), SubLObjectFactory.makeSymbol("HTFILE-HEADER-EXTENSION-SPACE")
    });
    private static final SubLList $list66 = ConsesLow.list(new SubLObject[] {
        SubLObjectFactory.makeSymbol("_CSETF-HTFILE-HEADER-SIZE"), SubLObjectFactory.makeSymbol("_CSETF-HTFILE-HEADER-VERSION-MAJOR"), SubLObjectFactory.makeSymbol("_CSETF-HTFILE-HEADER-VERSION-MINOR"), SubLObjectFactory.makeSymbol("_CSETF-HTFILE-HEADER-OBJECT-SPACE-OFFSET"), SubLObjectFactory.makeSymbol("_CSETF-HTFILE-HEADER-KEY-SPACE-OFFSET"), SubLObjectFactory.makeSymbol("_CSETF-HTFILE-HEADER-CURRENT-HEAP-TOP"), SubLObjectFactory.makeSymbol("_CSETF-HTFILE-HEADER-ITEM-COUNT"), SubLObjectFactory.makeSymbol("_CSETF-HTFILE-HEADER-CAPACITY"), SubLObjectFactory.makeSymbol("_CSETF-HTFILE-HEADER-FREE-LIST-HEAD"), SubLObjectFactory.makeSymbol("_CSETF-HTFILE-HEADER-DELETION-COUNT"), 
        SubLObjectFactory.makeSymbol("_CSETF-HTFILE-HEADER-HEADER-CRC"), SubLObjectFactory.makeSymbol("_CSETF-HTFILE-HEADER-EXTENSION-SPACE-SIZE"), SubLObjectFactory.makeSymbol("_CSETF-HTFILE-HEADER-EXTENSION-SPACE")
    });
    private static final SubLSymbol $sym67$HTFILE_HEADER_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("HTFILE-HEADER-PRINT-FUNCTION-TRAMPOLINE");
    private static final SubLList $list68 = ConsesLow.list(SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), SubLObjectFactory.makeSymbol("HTFILE-HEADER-P"));
    private static final SubLSymbol $sym69$HTFILE_HEADER_SIZE = SubLObjectFactory.makeSymbol("HTFILE-HEADER-SIZE");
    private static final SubLSymbol $sym70$_CSETF_HTFILE_HEADER_SIZE = SubLObjectFactory.makeSymbol("_CSETF-HTFILE-HEADER-SIZE");
    private static final SubLSymbol $sym71$HTFILE_HEADER_VERSION_MAJOR = SubLObjectFactory.makeSymbol("HTFILE-HEADER-VERSION-MAJOR");
    private static final SubLSymbol $sym72$_CSETF_HTFILE_HEADER_VERSION_MAJOR = SubLObjectFactory.makeSymbol("_CSETF-HTFILE-HEADER-VERSION-MAJOR");
    private static final SubLSymbol $sym73$HTFILE_HEADER_VERSION_MINOR = SubLObjectFactory.makeSymbol("HTFILE-HEADER-VERSION-MINOR");
    private static final SubLSymbol $sym74$_CSETF_HTFILE_HEADER_VERSION_MINOR = SubLObjectFactory.makeSymbol("_CSETF-HTFILE-HEADER-VERSION-MINOR");
    private static final SubLSymbol $sym75$HTFILE_HEADER_OBJECT_SPACE_OFFSET = SubLObjectFactory.makeSymbol("HTFILE-HEADER-OBJECT-SPACE-OFFSET");
    private static final SubLSymbol $sym76$_CSETF_HTFILE_HEADER_OBJECT_SPACE_OFFSET = SubLObjectFactory.makeSymbol("_CSETF-HTFILE-HEADER-OBJECT-SPACE-OFFSET");
    private static final SubLSymbol $sym77$HTFILE_HEADER_KEY_SPACE_OFFSET = SubLObjectFactory.makeSymbol("HTFILE-HEADER-KEY-SPACE-OFFSET");
    private static final SubLSymbol $sym78$_CSETF_HTFILE_HEADER_KEY_SPACE_OFFSET = SubLObjectFactory.makeSymbol("_CSETF-HTFILE-HEADER-KEY-SPACE-OFFSET");
    private static final SubLSymbol $sym79$HTFILE_HEADER_CURRENT_HEAP_TOP = SubLObjectFactory.makeSymbol("HTFILE-HEADER-CURRENT-HEAP-TOP");
    private static final SubLSymbol $sym80$_CSETF_HTFILE_HEADER_CURRENT_HEAP_TOP = SubLObjectFactory.makeSymbol("_CSETF-HTFILE-HEADER-CURRENT-HEAP-TOP");
    private static final SubLSymbol $sym81$HTFILE_HEADER_ITEM_COUNT = SubLObjectFactory.makeSymbol("HTFILE-HEADER-ITEM-COUNT");
    private static final SubLSymbol $sym82$_CSETF_HTFILE_HEADER_ITEM_COUNT = SubLObjectFactory.makeSymbol("_CSETF-HTFILE-HEADER-ITEM-COUNT");
    private static final SubLSymbol $sym83$HTFILE_HEADER_CAPACITY = SubLObjectFactory.makeSymbol("HTFILE-HEADER-CAPACITY");
    private static final SubLSymbol $sym84$_CSETF_HTFILE_HEADER_CAPACITY = SubLObjectFactory.makeSymbol("_CSETF-HTFILE-HEADER-CAPACITY");
    private static final SubLSymbol $sym85$HTFILE_HEADER_FREE_LIST_HEAD = SubLObjectFactory.makeSymbol("HTFILE-HEADER-FREE-LIST-HEAD");
    private static final SubLSymbol $sym86$_CSETF_HTFILE_HEADER_FREE_LIST_HEAD = SubLObjectFactory.makeSymbol("_CSETF-HTFILE-HEADER-FREE-LIST-HEAD");
    private static final SubLSymbol $sym87$HTFILE_HEADER_DELETION_COUNT = SubLObjectFactory.makeSymbol("HTFILE-HEADER-DELETION-COUNT");
    private static final SubLSymbol $sym88$_CSETF_HTFILE_HEADER_DELETION_COUNT = SubLObjectFactory.makeSymbol("_CSETF-HTFILE-HEADER-DELETION-COUNT");
    private static final SubLSymbol $sym89$HTFILE_HEADER_HEADER_CRC = SubLObjectFactory.makeSymbol("HTFILE-HEADER-HEADER-CRC");
    private static final SubLSymbol $sym90$_CSETF_HTFILE_HEADER_HEADER_CRC = SubLObjectFactory.makeSymbol("_CSETF-HTFILE-HEADER-HEADER-CRC");
    private static final SubLSymbol $sym91$HTFILE_HEADER_EXTENSION_SPACE_SIZE = SubLObjectFactory.makeSymbol("HTFILE-HEADER-EXTENSION-SPACE-SIZE");
    private static final SubLSymbol $sym92$_CSETF_HTFILE_HEADER_EXTENSION_SPACE_SIZE = SubLObjectFactory.makeSymbol("_CSETF-HTFILE-HEADER-EXTENSION-SPACE-SIZE");
    private static final SubLSymbol $sym93$HTFILE_HEADER_EXTENSION_SPACE = SubLObjectFactory.makeSymbol("HTFILE-HEADER-EXTENSION-SPACE");
    private static final SubLSymbol $sym94$_CSETF_HTFILE_HEADER_EXTENSION_SPACE = SubLObjectFactory.makeSymbol("_CSETF-HTFILE-HEADER-EXTENSION-SPACE");
    private static final SubLSymbol $kw95$SIZE = SubLObjectFactory.makeKeyword("SIZE");
    private static final SubLSymbol $kw96$VERSION_MAJOR = SubLObjectFactory.makeKeyword("VERSION-MAJOR");
    private static final SubLSymbol $kw97$VERSION_MINOR = SubLObjectFactory.makeKeyword("VERSION-MINOR");
    private static final SubLSymbol $kw98$OBJECT_SPACE_OFFSET = SubLObjectFactory.makeKeyword("OBJECT-SPACE-OFFSET");
    private static final SubLSymbol $kw99$KEY_SPACE_OFFSET = SubLObjectFactory.makeKeyword("KEY-SPACE-OFFSET");
    private static final SubLSymbol $kw100$CURRENT_HEAP_TOP = SubLObjectFactory.makeKeyword("CURRENT-HEAP-TOP");
    private static final SubLSymbol $kw101$ITEM_COUNT = SubLObjectFactory.makeKeyword("ITEM-COUNT");
    private static final SubLSymbol $kw102$CAPACITY = SubLObjectFactory.makeKeyword("CAPACITY");
    private static final SubLSymbol $kw103$FREE_LIST_HEAD = SubLObjectFactory.makeKeyword("FREE-LIST-HEAD");
    private static final SubLSymbol $kw104$DELETION_COUNT = SubLObjectFactory.makeKeyword("DELETION-COUNT");
    private static final SubLSymbol $kw105$HEADER_CRC = SubLObjectFactory.makeKeyword("HEADER-CRC");
    private static final SubLSymbol $kw106$EXTENSION_SPACE_SIZE = SubLObjectFactory.makeKeyword("EXTENSION-SPACE-SIZE");
    private static final SubLSymbol $kw107$EXTENSION_SPACE = SubLObjectFactory.makeKeyword("EXTENSION-SPACE");
    private static final SubLSymbol $sym108$MAKE_HTFILE_HEADER = SubLObjectFactory.makeSymbol("MAKE-HTFILE-HEADER");
    private static final SubLSymbol $sym109$VISIT_DEFSTRUCT_OBJECT_HTFILE_HEADER_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-HTFILE-HEADER-METHOD");
    private static final SubLString $str110$__HTFile_Header__Size__A_Format_V = SubLObjectFactory.makeString("#<HTFile-Header: Size=~A Format-Version ~A.~A~%");
    private static final SubLString $str111$_ObjSpace_Offset__0x_X___D___KeyS = SubLObjectFactory.makeString(" ObjSpace Offset: 0x~X (~D)  KeySpace Offset: 0x~X (~D) HeapTop: 0x~X (~D)~%");
    private static final SubLString $str112$_Item_Count___A__Capacity___A__ = SubLObjectFactory.makeString(" Item Count: ~A  Capacity: ~A~%");
    private static final SubLString $str113$_FreeListHead___A_ = SubLObjectFactory.makeString(" FreeListHead: ~A ");
    private static final SubLString $str114$_no_free_list_ = SubLObjectFactory.makeString(" no free-list ");
    private static final SubLString $str115$_Deletions___A_ = SubLObjectFactory.makeString(" Deletions: ~A ");
    private static final SubLString $str116$_no_deletions_ = SubLObjectFactory.makeString(" no deletions ");
    private static final SubLString $str117$_CRC___A_ = SubLObjectFactory.makeString(" CRC: ~A ");
    private static final SubLString $str118$_no_CRC_support_ = SubLObjectFactory.makeString(" no CRC support ");
    private static final SubLString $str119$_Extension_Space____A____A____ = SubLObjectFactory.makeString(" Extension Space: (~A) |~A| ~%");
    private static final SubLString $str120$__ = SubLObjectFactory.makeString("> ");
    private static final SubLSymbol $sym121$HTFILE_OBJECT_ENTRY = SubLObjectFactory.makeSymbol("HTFILE-OBJECT-ENTRY");
    private static final SubLSymbol $sym122$HTFILE_OBJECT_ENTRY_P = SubLObjectFactory.makeSymbol("HTFILE-OBJECT-ENTRY-P");
    private static final SubLList $list123 = ConsesLow.list(SubLObjectFactory.makeSymbol("SIZE"), SubLObjectFactory.makeSymbol("TYPE"), SubLObjectFactory.makeSymbol("KEY-SIZE"), SubLObjectFactory.makeSymbol("KEY"), SubLObjectFactory.makeSymbol("DATA-SIZE"), SubLObjectFactory.makeSymbol("DATA"));
    private static final SubLList $list124 = ConsesLow.list(SubLObjectFactory.makeKeyword("SIZE"), SubLObjectFactory.makeKeyword("TYPE"), SubLObjectFactory.makeKeyword("KEY-SIZE"), SubLObjectFactory.makeKeyword("KEY"), SubLObjectFactory.makeKeyword("DATA-SIZE"), SubLObjectFactory.makeKeyword("DATA"));
    private static final SubLList $list125 = ConsesLow.list(SubLObjectFactory.makeSymbol("HTFILE-OBJECT-ENTRY-SIZE"), SubLObjectFactory.makeSymbol("HTFILE-OBJECT-ENTRY-TYPE"), SubLObjectFactory.makeSymbol("HTFILE-OBJECT-ENTRY-KEY-SIZE"), SubLObjectFactory.makeSymbol("HTFILE-OBJECT-ENTRY-KEY"), SubLObjectFactory.makeSymbol("HTFILE-OBJECT-ENTRY-DATA-SIZE"), SubLObjectFactory.makeSymbol("HTFILE-OBJECT-ENTRY-DATA"));
    private static final SubLList $list126 = ConsesLow.list(SubLObjectFactory.makeSymbol("_CSETF-HTFILE-OBJECT-ENTRY-SIZE"), SubLObjectFactory.makeSymbol("_CSETF-HTFILE-OBJECT-ENTRY-TYPE"), SubLObjectFactory.makeSymbol("_CSETF-HTFILE-OBJECT-ENTRY-KEY-SIZE"), SubLObjectFactory.makeSymbol("_CSETF-HTFILE-OBJECT-ENTRY-KEY"), SubLObjectFactory.makeSymbol("_CSETF-HTFILE-OBJECT-ENTRY-DATA-SIZE"), SubLObjectFactory.makeSymbol("_CSETF-HTFILE-OBJECT-ENTRY-DATA"));
    private static final SubLSymbol $sym127$HTFILE_OBJECT_ENTRY_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("HTFILE-OBJECT-ENTRY-PRINT-FUNCTION-TRAMPOLINE");
    private static final SubLList $list128 = ConsesLow.list(SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), SubLObjectFactory.makeSymbol("HTFILE-OBJECT-ENTRY-P"));
    private static final SubLSymbol $sym129$HTFILE_OBJECT_ENTRY_SIZE = SubLObjectFactory.makeSymbol("HTFILE-OBJECT-ENTRY-SIZE");
    private static final SubLSymbol $sym130$_CSETF_HTFILE_OBJECT_ENTRY_SIZE = SubLObjectFactory.makeSymbol("_CSETF-HTFILE-OBJECT-ENTRY-SIZE");
    private static final SubLSymbol $sym131$HTFILE_OBJECT_ENTRY_TYPE = SubLObjectFactory.makeSymbol("HTFILE-OBJECT-ENTRY-TYPE");
    private static final SubLSymbol $sym132$_CSETF_HTFILE_OBJECT_ENTRY_TYPE = SubLObjectFactory.makeSymbol("_CSETF-HTFILE-OBJECT-ENTRY-TYPE");
    private static final SubLSymbol $sym133$HTFILE_OBJECT_ENTRY_KEY_SIZE = SubLObjectFactory.makeSymbol("HTFILE-OBJECT-ENTRY-KEY-SIZE");
    private static final SubLSymbol $sym134$_CSETF_HTFILE_OBJECT_ENTRY_KEY_SIZE = SubLObjectFactory.makeSymbol("_CSETF-HTFILE-OBJECT-ENTRY-KEY-SIZE");
    private static final SubLSymbol $sym135$HTFILE_OBJECT_ENTRY_KEY = SubLObjectFactory.makeSymbol("HTFILE-OBJECT-ENTRY-KEY");
    private static final SubLSymbol $sym136$_CSETF_HTFILE_OBJECT_ENTRY_KEY = SubLObjectFactory.makeSymbol("_CSETF-HTFILE-OBJECT-ENTRY-KEY");
    private static final SubLSymbol $sym137$HTFILE_OBJECT_ENTRY_DATA_SIZE = SubLObjectFactory.makeSymbol("HTFILE-OBJECT-ENTRY-DATA-SIZE");
    private static final SubLSymbol $sym138$_CSETF_HTFILE_OBJECT_ENTRY_DATA_SIZE = SubLObjectFactory.makeSymbol("_CSETF-HTFILE-OBJECT-ENTRY-DATA-SIZE");
    private static final SubLSymbol $sym139$HTFILE_OBJECT_ENTRY_DATA = SubLObjectFactory.makeSymbol("HTFILE-OBJECT-ENTRY-DATA");
    private static final SubLSymbol $sym140$_CSETF_HTFILE_OBJECT_ENTRY_DATA = SubLObjectFactory.makeSymbol("_CSETF-HTFILE-OBJECT-ENTRY-DATA");
    private static final SubLSymbol $kw141$TYPE = SubLObjectFactory.makeKeyword("TYPE");
    private static final SubLSymbol $kw142$KEY_SIZE = SubLObjectFactory.makeKeyword("KEY-SIZE");
    private static final SubLSymbol $kw143$KEY = SubLObjectFactory.makeKeyword("KEY");
    private static final SubLSymbol $kw144$DATA_SIZE = SubLObjectFactory.makeKeyword("DATA-SIZE");
    private static final SubLSymbol $kw145$DATA = SubLObjectFactory.makeKeyword("DATA");
    private static final SubLSymbol $sym146$MAKE_HTFILE_OBJECT_ENTRY = SubLObjectFactory.makeSymbol("MAKE-HTFILE-OBJECT-ENTRY");
    private static final SubLSymbol $sym147$VISIT_DEFSTRUCT_OBJECT_HTFILE_OBJECT_ENTRY_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-HTFILE-OBJECT-ENTRY-METHOD");
    private static final SubLSymbol $sym148$HTFILE_KEY_ENTRY = SubLObjectFactory.makeSymbol("HTFILE-KEY-ENTRY");
    private static final SubLSymbol $sym149$HTFILE_KEY_ENTRY_P = SubLObjectFactory.makeSymbol("HTFILE-KEY-ENTRY-P");
    private static final SubLList $list150 = ConsesLow.list(SubLObjectFactory.makeSymbol("KEY-OFFSET"), SubLObjectFactory.makeSymbol("HASH-CODE"));
    private static final SubLList $list151 = ConsesLow.list(SubLObjectFactory.makeKeyword("KEY-OFFSET"), SubLObjectFactory.makeKeyword("HASH-CODE"));
    private static final SubLList $list152 = ConsesLow.list(SubLObjectFactory.makeSymbol("HTFILE-KEY-ENTRY-KEY-OFFSET"), SubLObjectFactory.makeSymbol("HTFILE-KEY-ENTRY-HASH-CODE"));
    private static final SubLList $list153 = ConsesLow.list(SubLObjectFactory.makeSymbol("_CSETF-HTFILE-KEY-ENTRY-KEY-OFFSET"), SubLObjectFactory.makeSymbol("_CSETF-HTFILE-KEY-ENTRY-HASH-CODE"));
    private static final SubLSymbol $sym154$HTFILE_KEY_ENTRY_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("HTFILE-KEY-ENTRY-PRINT-FUNCTION-TRAMPOLINE");
    private static final SubLList $list155 = ConsesLow.list(SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), SubLObjectFactory.makeSymbol("HTFILE-KEY-ENTRY-P"));
    private static final SubLSymbol $sym156$HTFILE_KEY_ENTRY_KEY_OFFSET = SubLObjectFactory.makeSymbol("HTFILE-KEY-ENTRY-KEY-OFFSET");
    private static final SubLSymbol $sym157$_CSETF_HTFILE_KEY_ENTRY_KEY_OFFSET = SubLObjectFactory.makeSymbol("_CSETF-HTFILE-KEY-ENTRY-KEY-OFFSET");
    private static final SubLSymbol $sym158$HTFILE_KEY_ENTRY_HASH_CODE = SubLObjectFactory.makeSymbol("HTFILE-KEY-ENTRY-HASH-CODE");
    private static final SubLSymbol $sym159$_CSETF_HTFILE_KEY_ENTRY_HASH_CODE = SubLObjectFactory.makeSymbol("_CSETF-HTFILE-KEY-ENTRY-HASH-CODE");
    private static final SubLSymbol $kw160$KEY_OFFSET = SubLObjectFactory.makeKeyword("KEY-OFFSET");
    private static final SubLSymbol $kw161$HASH_CODE = SubLObjectFactory.makeKeyword("HASH-CODE");
    private static final SubLSymbol $sym162$MAKE_HTFILE_KEY_ENTRY = SubLObjectFactory.makeSymbol("MAKE-HTFILE-KEY-ENTRY");
    private static final SubLSymbol $sym163$VISIT_DEFSTRUCT_OBJECT_HTFILE_KEY_ENTRY_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-HTFILE-KEY-ENTRY-METHOD");
    private static final SubLSymbol $kw164$IMAGE_DEPENDENT_CFASL = SubLObjectFactory.makeKeyword("IMAGE-DEPENDENT-CFASL");
    private static final SubLInteger $int165$2000 = SubLObjectFactory.makeInteger(2000);
    private static final SubLInteger $int166$84 = SubLObjectFactory.makeInteger(84);
    private static final SubLInteger $int167$256 = SubLObjectFactory.makeInteger(256);
    private static final SubLSymbol $sym168$SXHASH = SubLObjectFactory.makeSymbol("SXHASH");
    private static final SubLString $str169$File_Hash_Table_Lock = SubLObjectFactory.makeString("File Hash Table Lock");
    private static final SubLString $str170$Sorry___A_hashed_to__A__which_is_ = SubLObjectFactory.makeString("Sorry, ~A hashed to ~A, which is not a valid hash code.");
    private static final SubLInteger $int171$32 = SubLObjectFactory.makeInteger(32);
    private static final SubLSymbol $sym172$FHT_SERIALIZATION_ENTRY = SubLObjectFactory.makeSymbol("FHT-SERIALIZATION-ENTRY");
    private static final SubLSymbol $sym173$FHT_SERIALIZATION_ENTRY_P = SubLObjectFactory.makeSymbol("FHT-SERIALIZATION-ENTRY-P");
    private static final SubLList $list174 = ConsesLow.list(SubLObjectFactory.makeSymbol("ENCODING-INPUT-FN"), SubLObjectFactory.makeSymbol("ENCODING-OUTPUT-FN"), SubLObjectFactory.makeSymbol("ENCODING-SIZE-FN"), SubLObjectFactory.makeSymbol("HASH-FN"), SubLObjectFactory.makeSymbol("ENCODING-KEY-INPUT-FN"), SubLObjectFactory.makeSymbol("ENCODING-KEY-OUTPUT-FN"));
    private static final SubLList $list175 = ConsesLow.list(SubLObjectFactory.makeKeyword("ENCODING-INPUT-FN"), SubLObjectFactory.makeKeyword("ENCODING-OUTPUT-FN"), SubLObjectFactory.makeKeyword("ENCODING-SIZE-FN"), SubLObjectFactory.makeKeyword("HASH-FN"), SubLObjectFactory.makeKeyword("ENCODING-KEY-INPUT-FN"), SubLObjectFactory.makeKeyword("ENCODING-KEY-OUTPUT-FN"));
    private static final SubLList $list176 = ConsesLow.list(SubLObjectFactory.makeSymbol("FHT-SE-ENCODING-INPUT-FN"), SubLObjectFactory.makeSymbol("FHT-SE-ENCODING-OUTPUT-FN"), SubLObjectFactory.makeSymbol("FHT-SE-ENCODING-SIZE-FN"), SubLObjectFactory.makeSymbol("FHT-SE-HASH-FN"), SubLObjectFactory.makeSymbol("FHT-SE-ENCODING-KEY-INPUT-FN"), SubLObjectFactory.makeSymbol("FHT-SE-ENCODING-KEY-OUTPUT-FN"));
    private static final SubLList $list177 = ConsesLow.list(SubLObjectFactory.makeSymbol("_CSETF-FHT-SE-ENCODING-INPUT-FN"), SubLObjectFactory.makeSymbol("_CSETF-FHT-SE-ENCODING-OUTPUT-FN"), SubLObjectFactory.makeSymbol("_CSETF-FHT-SE-ENCODING-SIZE-FN"), SubLObjectFactory.makeSymbol("_CSETF-FHT-SE-HASH-FN"), SubLObjectFactory.makeSymbol("_CSETF-FHT-SE-ENCODING-KEY-INPUT-FN"), SubLObjectFactory.makeSymbol("_CSETF-FHT-SE-ENCODING-KEY-OUTPUT-FN"));
    private static final SubLSymbol $sym178$PRINT_FHT_SERIALIZATION_ENTRY = SubLObjectFactory.makeSymbol("PRINT-FHT-SERIALIZATION-ENTRY");
    private static final SubLSymbol $sym179$FHT_SERIALIZATION_ENTRY_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("FHT-SERIALIZATION-ENTRY-PRINT-FUNCTION-TRAMPOLINE");
    private static final SubLList $list180 = ConsesLow.list(SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), SubLObjectFactory.makeSymbol("FHT-SERIALIZATION-ENTRY-P"));
    private static final SubLSymbol $sym181$FHT_SE_ENCODING_INPUT_FN = SubLObjectFactory.makeSymbol("FHT-SE-ENCODING-INPUT-FN");
    private static final SubLSymbol $sym182$_CSETF_FHT_SE_ENCODING_INPUT_FN = SubLObjectFactory.makeSymbol("_CSETF-FHT-SE-ENCODING-INPUT-FN");
    private static final SubLSymbol $sym183$FHT_SE_ENCODING_OUTPUT_FN = SubLObjectFactory.makeSymbol("FHT-SE-ENCODING-OUTPUT-FN");
    private static final SubLSymbol $sym184$_CSETF_FHT_SE_ENCODING_OUTPUT_FN = SubLObjectFactory.makeSymbol("_CSETF-FHT-SE-ENCODING-OUTPUT-FN");
    private static final SubLSymbol $sym185$FHT_SE_ENCODING_SIZE_FN = SubLObjectFactory.makeSymbol("FHT-SE-ENCODING-SIZE-FN");
    private static final SubLSymbol $sym186$_CSETF_FHT_SE_ENCODING_SIZE_FN = SubLObjectFactory.makeSymbol("_CSETF-FHT-SE-ENCODING-SIZE-FN");
    private static final SubLSymbol $sym187$FHT_SE_HASH_FN = SubLObjectFactory.makeSymbol("FHT-SE-HASH-FN");
    private static final SubLSymbol $sym188$_CSETF_FHT_SE_HASH_FN = SubLObjectFactory.makeSymbol("_CSETF-FHT-SE-HASH-FN");
    private static final SubLSymbol $sym189$FHT_SE_ENCODING_KEY_INPUT_FN = SubLObjectFactory.makeSymbol("FHT-SE-ENCODING-KEY-INPUT-FN");
    private static final SubLSymbol $sym190$_CSETF_FHT_SE_ENCODING_KEY_INPUT_FN = SubLObjectFactory.makeSymbol("_CSETF-FHT-SE-ENCODING-KEY-INPUT-FN");
    private static final SubLSymbol $sym191$FHT_SE_ENCODING_KEY_OUTPUT_FN = SubLObjectFactory.makeSymbol("FHT-SE-ENCODING-KEY-OUTPUT-FN");
    private static final SubLSymbol $sym192$_CSETF_FHT_SE_ENCODING_KEY_OUTPUT_FN = SubLObjectFactory.makeSymbol("_CSETF-FHT-SE-ENCODING-KEY-OUTPUT-FN");
    private static final SubLSymbol $sym193$MAKE_FHT_SERIALIZATION_ENTRY = SubLObjectFactory.makeSymbol("MAKE-FHT-SERIALIZATION-ENTRY");
    private static final SubLSymbol $sym194$VISIT_DEFSTRUCT_OBJECT_FHT_SERIALIZATION_ENTRY_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-FHT-SERIALIZATION-ENTRY-METHOD");
    private static final SubLString $str195$__FHT_Serialization__Input_Fn____ = SubLObjectFactory.makeString("#<FHT-Serialization: Input Fn:    ~S~%");
    private static final SubLString $str196$_____________________Output_Fn___ = SubLObjectFactory.makeString("                     Output Fn:   ~S~%");
    private static final SubLString $str197$_____________________Size_Fn_____ = SubLObjectFactory.makeString("                     Size Fn:     ~S~%");
    private static final SubLString $str198$_____________________Hash_Fn_____ = SubLObjectFactory.makeString("                     Hash Fn:     ~S~%");
    private static final SubLString $str199$_____________________Key_Input___ = SubLObjectFactory.makeString("                     Key Input    ~S~%");
    private static final SubLString $str200$_____________________Key_Output__ = SubLObjectFactory.makeString("                     Key Output    ~S~%");
    private static final SubLString $str201$_ = SubLObjectFactory.makeString(">");
    private static final SubLSymbol $sym202$_FHT_SERIALIZATION_TABLE_ = SubLObjectFactory.makeSymbol("*FHT-SERIALIZATION-TABLE*");
    private static final SubLList $list203 = ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("SERIALIZATION"), SubLObjectFactory.makeSymbol("SERIALIZATION-ENTRY"), SubLObjectFactory.makeSymbol("&KEY"), SubLObjectFactory.makeSymbol("DONE")), SubLObjectFactory.makeSymbol("&BODY"), SubLObjectFactory.makeSymbol("BODY"));
    private static final SubLList $list204 = ConsesLow.list(SubLObjectFactory.makeKeyword("DONE"));
    private static final SubLSymbol $kw205$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
    private static final SubLSymbol $kw206$DONE = SubLObjectFactory.makeKeyword("DONE");
    private static final SubLSymbol $sym207$DO_DICTIONARY = SubLObjectFactory.makeSymbol("DO-DICTIONARY");
    private static final SubLList $list208 = ConsesLow.list(SubLObjectFactory.makeKeyword("ENCODING-INPUT-FN"), SubLObjectFactory.makeSymbol("CFASL-INPUT"), SubLObjectFactory.makeKeyword("ENCODING-OUTPUT-FN"), SubLObjectFactory.makeSymbol("CFASL-OUTPUT"), SubLObjectFactory.makeKeyword("ENCODING-SIZE-FN"), SubLObjectFactory.makeSymbol("CFASL-OBJECT-SIZE"), SubLObjectFactory.makeKeyword("HASH-FN"), SubLObjectFactory.makeSymbol("SXHASH"));
    private static final SubLSymbol $kw209$IMAGE_INDEPENDENT_CFASL = SubLObjectFactory.makeKeyword("IMAGE-INDEPENDENT-CFASL");
    private static final SubLList $list210 = ConsesLow.list(SubLObjectFactory.makeKeyword("ENCODING-INPUT-FN"), SubLObjectFactory.makeSymbol("CFASL-INPUT"), SubLObjectFactory.makeKeyword("ENCODING-OUTPUT-FN"), SubLObjectFactory.makeSymbol("CFASL-OUTPUT-EXTERNALIZED"), SubLObjectFactory.makeKeyword("ENCODING-SIZE-FN"), SubLObjectFactory.makeSymbol("CFASL-EXTERNALIZED-OBJECT-SIZE"), SubLObjectFactory.makeKeyword("HASH-FN"), SubLObjectFactory.makeSymbol("SXHASH-EXTERNAL"));
    private static final SubLSymbol $kw211$HL_EXTERNALIZED_KEYS = SubLObjectFactory.makeKeyword("HL-EXTERNALIZED-KEYS");
    private static final SubLList $list212 = ConsesLow.list(new SubLObject[] {
        SubLObjectFactory.makeKeyword("ENCODING-INPUT-FN"), SubLObjectFactory.makeSymbol("CFASL-INPUT"), SubLObjectFactory.makeKeyword("ENCODING-OUTPUT-FN"), SubLObjectFactory.makeSymbol("CFASL-OUTPUT-EXTERNALIZED"), SubLObjectFactory.makeKeyword("ENCODING-SIZE-FN"), SubLObjectFactory.makeSymbol("CFASL-EXTERNALIZED-OBJECT-SIZE"), SubLObjectFactory.makeKeyword("HASH-FN"), SubLObjectFactory.makeSymbol("SXHASH-EXTERNAL"), SubLObjectFactory.makeKeyword("ENCODING-KEY-INPUT-FN"), SubLObjectFactory.makeSymbol("FIND-OBJECT-BY-HL-EXTERNAL-ID-STRING"), 
        SubLObjectFactory.makeKeyword("ENCODING-KEY-OUTPUT-FN"), SubLObjectFactory.makeSymbol("HL-EXTERNAL-ID-STRING")
    });
    private static final SubLList $list213 = ConsesLow.list(SubLObjectFactory.makeSymbol("FORMAT-STRING"), SubLObjectFactory.makeSymbol("&REST"), SubLObjectFactory.makeSymbol("ARGS"));
    private static final SubLSymbol $sym214$PUNLESS = SubLObjectFactory.makeSymbol("PUNLESS");
    private static final SubLList $list215 = ConsesLow.list(SubLObjectFactory.makeSymbol("NULL"), SubLObjectFactory.makeSymbol("*FHT-LOOKUP-STREAM*"));
    private static final SubLSymbol $sym216$FORMAT = SubLObjectFactory.makeSymbol("FORMAT");
    private static final SubLSymbol $sym217$_FHT_LOOKUP_STREAM_ = SubLObjectFactory.makeSymbol("*FHT-LOOKUP-STREAM*");
    private static final SubLSymbol $kw218$IO = SubLObjectFactory.makeKeyword("IO");
    private static final SubLSymbol $kw219$DIRECTION = SubLObjectFactory.makeKeyword("DIRECTION");
    private static final SubLSymbol $kw220$IF_EXISTS = SubLObjectFactory.makeKeyword("IF-EXISTS");
    private static final SubLSymbol $kw221$OVERWRITE = SubLObjectFactory.makeKeyword("OVERWRITE");
    private static final SubLSymbol $kw222$IF_DOES_NOT_EXIST = SubLObjectFactory.makeKeyword("IF-DOES-NOT-EXIST");
    private static final SubLSymbol $kw223$ERROR = SubLObjectFactory.makeKeyword("ERROR");
    private static final SubLSymbol $kw224$ELEMENT_TYPE = SubLObjectFactory.makeKeyword("ELEMENT-TYPE");
    private static final SubLSymbol $kw225$BINARY = SubLObjectFactory.makeKeyword("BINARY");
    private static final SubLSymbol $kw226$INPUT = SubLObjectFactory.makeKeyword("INPUT");
    private static final SubLSymbol $sym227$_FHT_NOT_FOUND_ = SubLObjectFactory.makeSymbol("*FHT-NOT-FOUND*");
    private static final SubLString $str228$FileHashTable_Not_Found = SubLObjectFactory.makeString("FileHashTable Not Found");
    private static final SubLSymbol $sym229$_NOT_IN_FHT_ = SubLObjectFactory.makeSymbol("*NOT-IN-FHT*");
    private static final SubLString $str230$Not_In_FHT = SubLObjectFactory.makeString("Not In FHT");
    private static final SubLString $str231$GET_FILE_HASH_TABLE__A_has_cache_ = SubLObjectFactory.makeString("GET-FILE-HASH-TABLE ~A has cache hit of ABSENT.~%");
    private static final SubLString $str232$GET_FILE_HASH_TABLE__A_has_cache_ = SubLObjectFactory.makeString("GET-FILE-HASH-TABLE ~A has cache hit with good value.~%");
    private static final SubLString $str233$GET_FILE_HASH_TABLE__A_has_to_go_ = SubLObjectFactory.makeString("GET-FILE-HASH-TABLE ~A has to go to the FHT.~%");
    private static final SubLSymbol $kw234$FOUND = SubLObjectFactory.makeKeyword("FOUND");
    private static final SubLString $str235$GET_FILE_HASH_TABLE__A_updated_ca = SubLObjectFactory.makeString("GET-FILE-HASH-TABLE ~A updated cache with hit.~%");
    private static final SubLString $str236$GET_FILE_HASH_TABLE__A_updated_ca = SubLObjectFactory.makeString("GET-FILE-HASH-TABLE ~A updated cache with ABSENT.~%");
    private static final SubLString $str237$The_key__S_maps_to_the_non_numeri = SubLObjectFactory.makeString("The key ~S maps to the non-numeric value ~S in the file-hash-table ~A.");
    private static final SubLList $list238 = ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("KEY"), SubLObjectFactory.makeSymbol("VAL"), SubLObjectFactory.makeSymbol("FHT"), SubLObjectFactory.makeSymbol("DONE-VAR"), SubLObjectFactory.makeSymbol("&OPTIONAL"), SubLObjectFactory.makeSymbol("KEYS-ONLY?")), SubLObjectFactory.makeSymbol("&BODY"), SubLObjectFactory.makeSymbol("BODY"));
    private static final SubLSymbol $sym239$THE_KEY = SubLObjectFactory.makeUninternedSymbol("THE-KEY");
    private static final SubLSymbol $sym240$THE_VALUE = SubLObjectFactory.makeUninternedSymbol("THE-VALUE");
    private static final SubLSymbol $sym241$CONTINUATION = SubLObjectFactory.makeUninternedSymbol("CONTINUATION");
    private static final SubLSymbol $sym242$NEXT = SubLObjectFactory.makeUninternedSymbol("NEXT");
    private static final SubLSymbol $sym243$COMPLETE_ = SubLObjectFactory.makeUninternedSymbol("COMPLETE?");
    private static final SubLSymbol $sym244$CLET = SubLObjectFactory.makeSymbol("CLET");
    private static final SubLList $list245;
    private static final SubLSymbol $sym246$WHILE = SubLObjectFactory.makeSymbol("WHILE");
    private static final SubLSymbol $sym247$CAND = SubLObjectFactory.makeSymbol("CAND");
    private static final SubLSymbol $sym248$CNOT = SubLObjectFactory.makeSymbol("CNOT");
    private static final SubLSymbol $sym249$CMULTIPLE_VALUE_BIND = SubLObjectFactory.makeSymbol("CMULTIPLE-VALUE-BIND");
    private static final SubLSymbol $sym250$GET_FILE_HASH_TABLE_ANY = SubLObjectFactory.makeSymbol("GET-FILE-HASH-TABLE-ANY");
    private static final SubLSymbol $sym251$NULL = SubLObjectFactory.makeSymbol("NULL");
    private static final SubLSymbol $sym252$PROGN = SubLObjectFactory.makeSymbol("PROGN");
    private static final SubLSymbol $sym253$CSETQ = SubLObjectFactory.makeSymbol("CSETQ");
    private static final SubLSymbol $sym254$THE_KEY = SubLObjectFactory.makeUninternedSymbol("THE-KEY");
    private static final SubLSymbol $sym255$THE_VALUE = SubLObjectFactory.makeUninternedSymbol("THE-VALUE");
    private static final SubLSymbol $sym256$CONTINUATION = SubLObjectFactory.makeUninternedSymbol("CONTINUATION");
    private static final SubLSymbol $sym257$NEXT = SubLObjectFactory.makeUninternedSymbol("NEXT");
    private static final SubLSymbol $sym258$COMPLETE_ = SubLObjectFactory.makeUninternedSymbol("COMPLETE?");
    private static final SubLSymbol $sym259$GET_PRISTINE_FILE_HASH_TABLE_ANY = SubLObjectFactory.makeSymbol("GET-PRISTINE-FILE-HASH-TABLE-ANY");
    private static final SubLList $list260 = ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("KEY"), SubLObjectFactory.makeSymbol("VALUE"), SubLObjectFactory.makeSymbol("FHT"), SubLObjectFactory.makeSymbol("&KEY"), SubLObjectFactory.makeSymbol("MESSAGE"), SubLObjectFactory.makeSymbol("DONE")), SubLObjectFactory.makeSymbol("&BODY"), SubLObjectFactory.makeSymbol("BODY"));
    private static final SubLList $list261 = ConsesLow.list(SubLObjectFactory.makeKeyword("MESSAGE"), SubLObjectFactory.makeKeyword("DONE"));
    private static final SubLSymbol $kw262$MESSAGE = SubLObjectFactory.makeKeyword("MESSAGE");
    private static final SubLSymbol $sym263$TABLE_VAR = SubLObjectFactory.makeUninternedSymbol("TABLE-VAR");
    private static final SubLSymbol $sym264$_PROGRESS_NOTE_ = SubLObjectFactory.makeSymbol("*PROGRESS-NOTE*");
    private static final SubLList $list265 = ConsesLow.list(SubLObjectFactory.makeSymbol("CSETQ"), SubLObjectFactory.makeSymbol("*PROGRESS-START-TIME*"), ConsesLow.list(SubLObjectFactory.makeSymbol("GET-UNIVERSAL-TIME")));
    private static final SubLSymbol $sym266$_PROGRESS_TOTAL_ = SubLObjectFactory.makeSymbol("*PROGRESS-TOTAL*");
    private static final SubLSymbol $sym267$FILE_HASH_TABLE_COUNT = SubLObjectFactory.makeSymbol("FILE-HASH-TABLE-COUNT");
    private static final SubLList $list268;
    private static final SubLSymbol $sym269$NOTING_PERCENT_PROGRESS = SubLObjectFactory.makeSymbol("NOTING-PERCENT-PROGRESS");
    private static final SubLSymbol $sym270$DO_FILE_HASH_TABLE = SubLObjectFactory.makeSymbol("DO-FILE-HASH-TABLE");
    private static final SubLList $list271 = ConsesLow.list(SubLObjectFactory.makeSymbol("NOTE-PERCENT-PROGRESS"), SubLObjectFactory.makeSymbol("*PROGRESS-SOFAR*"), SubLObjectFactory.makeSymbol("*PROGRESS-TOTAL*"));
    private static final SubLList $list272 = ConsesLow.list(SubLObjectFactory.makeSymbol("CINC"), SubLObjectFactory.makeSymbol("*PROGRESS-SOFAR*"));
    private static final SubLSymbol $sym273$DOSOME_FILE_HASH_TABLE = SubLObjectFactory.makeSymbol("DOSOME-FILE-HASH-TABLE");
    private static final SubLSymbol $sym274$TABLE_VAR = SubLObjectFactory.makeUninternedSymbol("TABLE-VAR");
    private static final SubLSymbol $sym275$DOSOME_PRISTINE_FILE_HASH_TABLE = SubLObjectFactory.makeSymbol("DOSOME-PRISTINE-FILE-HASH-TABLE");
    private static final SubLString $str276$_S_____S__ = SubLObjectFactory.makeString("~S -> ~S~%");
    private static final SubLList $list277 = ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("KEY"), SubLObjectFactory.makeSymbol("VALUE"), SubLObjectFactory.makeSymbol("FHT"), SubLObjectFactory.makeSymbol("&OPTIONAL"), ConsesLow.list(SubLObjectFactory.makeSymbol("MESSAGE"), SubLObjectFactory.makeString("do-file-hash-table"))), SubLObjectFactory.makeSymbol("&BODY"), SubLObjectFactory.makeSymbol("BODY"));
    private static final SubLString $str278$do_file_hash_table = SubLObjectFactory.makeString("do-file-hash-table");
    private static final SubLSymbol $sym279$PROGRESS_DO_FILE_HASH_TABLE = SubLObjectFactory.makeSymbol("PROGRESS-DO-FILE-HASH-TABLE");
    private static final SubLList $list280 = ConsesLow.list(SubLObjectFactory.makeSymbol("DO-FILE-HASH-TABLE"));
    private static final SubLList $list281 = ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("KEY"), SubLObjectFactory.makeSymbol("FHT"), SubLObjectFactory.makeSymbol("DONE-VAR")), SubLObjectFactory.makeSymbol("&BODY"), SubLObjectFactory.makeSymbol("BODY"));
    private static final SubLSymbol $sym282$DOSOME_FILE_HASH_TABLE_KEYS = SubLObjectFactory.makeSymbol("DOSOME-FILE-HASH-TABLE-KEYS");
    private static final SubLList $list283 = ConsesLow.list(SubLObjectFactory.makeSymbol("DO-FILE-HASH-TABLE-KEYS"));
    private static final SubLSymbol $sym284$DO_FILE_HASH_TABLE_KEYS = SubLObjectFactory.makeSymbol("DO-FILE-HASH-TABLE-KEYS");
    private static final SubLList $list285 = ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("KEY"), SubLObjectFactory.makeSymbol("FHT"), SubLObjectFactory.makeSymbol("&KEY"), SubLObjectFactory.makeSymbol("MESSAGE"), SubLObjectFactory.makeSymbol("DONE")), SubLObjectFactory.makeSymbol("&BODY"), SubLObjectFactory.makeSymbol("BODY"));
    private static final SubLSymbol $sym286$FHT_VAR = SubLObjectFactory.makeUninternedSymbol("FHT-VAR");
    private static final SubLSymbol $sym287$VALUE = SubLObjectFactory.makeUninternedSymbol("VALUE");
    private static final SubLList $list288;
    private static final SubLSymbol $sym289$IGNORE = SubLObjectFactory.makeSymbol("IGNORE");
    private static final SubLSymbol $sym290$FHT_VAR = SubLObjectFactory.makeUninternedSymbol("FHT-VAR");
    private static final SubLSymbol $sym291$VALUE = SubLObjectFactory.makeUninternedSymbol("VALUE");
    private static final SubLList $list292 = ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("KEY"), SubLObjectFactory.makeSymbol("FHT"), SubLObjectFactory.makeSymbol("&OPTIONAL"), ConsesLow.list(SubLObjectFactory.makeSymbol("MESSAGE"), SubLObjectFactory.makeString("do-file-hash-table-keys"))), SubLObjectFactory.makeSymbol("&BODY"), SubLObjectFactory.makeSymbol("BODY"));
    private static final SubLString $str293$do_file_hash_table_keys = SubLObjectFactory.makeString("do-file-hash-table-keys");
    private static final SubLSymbol $sym294$PROGRESS_DO_FILE_HASH_TABLE_KEYS = SubLObjectFactory.makeSymbol("PROGRESS-DO-FILE-HASH-TABLE-KEYS");
    private static final SubLSymbol $sym295$NON_NEGATIVE_INTEGER_P = SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P");
    private static final SubLSymbol $sym296$_ = SubLObjectFactory.makeSymbol("<");
    private static final SubLString $str297$Invalid_key_entry__A__Offset_0x_X = SubLObjectFactory.makeString("Invalid key entry ~A: Offset 0x~X (~A) HashCode ~A~%");
    private static final SubLString $str298$FHT_for__A_corrupted___A_____A__A = SubLObjectFactory.makeString("FHT for ~A corrupted; ~A != ~A+~A+ -- cannot recover in this fashion.~%");
    private static final SubLString $str299$Entry__A___A_bytes_total___A_byte = SubLObjectFactory.makeString("Entry ~A: ~A bytes total, ~A bytes key size, ~A bytes object size (+ ~A bytes header).~%");
    private static final SubLSymbol $sym300$ITERATE_FILE_HASH_TABLE_DONE_ = SubLObjectFactory.makeSymbol("ITERATE-FILE-HASH-TABLE-DONE?");
    private static final SubLSymbol $sym301$ITERATE_FILE_HASH_TABLE_NEXT_VALUE = SubLObjectFactory.makeSymbol("ITERATE-FILE-HASH-TABLE-NEXT-VALUE");
    private static final SubLSymbol $sym302$ITERATE_FILE_HASH_TABLE_NEXT = SubLObjectFactory.makeSymbol("ITERATE-FILE-HASH-TABLE-NEXT");
    private static final SubLSymbol $kw303$START = SubLObjectFactory.makeKeyword("START");
    private static final SubLList $list304 = ConsesLow.list(SubLObjectFactory.makeSymbol("CURRENT"), SubLObjectFactory.makeSymbol("FHT"), SubLObjectFactory.makeSymbol("KEYS-ONLY?"), SubLObjectFactory.makeSymbol("FINALIZE-FHT?"));
    private static final SubLSymbol $kw305$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
    private static final SubLString $str306$converting_file_hash_table_to_ali = SubLObjectFactory.makeString("converting file-hash-table to alist");
    private static final SubLString $str307$tmp_ = SubLObjectFactory.makeString("tmp/");
    private static final SubLSymbol $sym308$HASH_TABLE_P = SubLObjectFactory.makeSymbol("HASH-TABLE-P");
    private static final SubLString $str309$ = SubLObjectFactory.makeString("");
    private static final SubLString $str310$_tmp_ = SubLObjectFactory.makeString("/tmp/");
    private static final SubLSymbol $sym311$LISTP = SubLObjectFactory.makeSymbol("LISTP");
    private static final SubLSymbol $sym312$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
    private static final SubLSymbol $kw313$STORAGE_RESOURCING = SubLObjectFactory.makeKeyword("STORAGE-RESOURCING");
    private static final SubLInteger $int314$100 = SubLObjectFactory.makeInteger(100);
    private static final SubLSymbol $kw315$KEY_ONLY = SubLObjectFactory.makeKeyword("KEY-ONLY");
    private static final SubLSymbol $kw316$FULL = SubLObjectFactory.makeKeyword("FULL");
    private static final SubLSymbol $kw317$NOT_FOUND = SubLObjectFactory.makeKeyword("NOT-FOUND");
    private static final SubLSymbol $kw318$TABLE_FULL = SubLObjectFactory.makeKeyword("TABLE-FULL");
    private static final SubLString $str319$Cannot_put_into_table__table_is_f = SubLObjectFactory.makeString("Cannot put into table; table is full and cannot grow.");
    private static final SubLString $str320$Implementation_Error__Unexpected_ = SubLObjectFactory.makeString("Implementation Error: Unexpected status ~A returned by FHT-LOOKUP-KEY. (KEY = ~A, INDEX = ~A.)");
    private static final SubLSymbol $sym321$COR = SubLObjectFactory.makeSymbol("COR");
    private static final SubLString $str322$Can_neither_find_key__S_nor_prove = SubLObjectFactory.makeString("Can neither find key ~S nor prove its non-presence. Ensure that your encoding function and your test function work correctly together, i.e. (funcall testfn <OBJ> (cfasl-decoding (cfasl-encoding <OBJ))) -> T. If they are, then this is an implementation error. (INDEX = ~A, STATUS = ~A, KEY-ENTRY = ~A)");
    private static final SubLString $str323$Cannot_get_key__S_from_table__Imp = SubLObjectFactory.makeString("Cannot get key ~S from table: Implementation error (INDEX = ~A, STATUS = ~A, KEY-ENTRY = ~A).");
    private static final SubLSymbol $sym324$HTFILE_FILE_BLOCK_ENTRY = SubLObjectFactory.makeSymbol("HTFILE-FILE-BLOCK-ENTRY");
    private static final SubLSymbol $sym325$HTFILE_FILE_BLOCK_ENTRY_P = SubLObjectFactory.makeSymbol("HTFILE-FILE-BLOCK-ENTRY-P");
    private static final SubLList $list326 = ConsesLow.list(SubLObjectFactory.makeSymbol("SIZE"), SubLObjectFactory.makeSymbol("NEXT"));
    private static final SubLList $list327 = ConsesLow.list(SubLObjectFactory.makeKeyword("SIZE"), SubLObjectFactory.makeKeyword("NEXT"));
    private static final SubLList $list328 = ConsesLow.list(SubLObjectFactory.makeSymbol("HTFILE-FILE-BLOCK-ENTRY-SIZE"), SubLObjectFactory.makeSymbol("HTFILE-FILE-BLOCK-ENTRY-NEXT"));
    private static final SubLList $list329 = ConsesLow.list(SubLObjectFactory.makeSymbol("_CSETF-HTFILE-FILE-BLOCK-ENTRY-SIZE"), SubLObjectFactory.makeSymbol("_CSETF-HTFILE-FILE-BLOCK-ENTRY-NEXT"));
    private static final SubLSymbol $sym330$PRINT_HTFILE_FILE_BLOCK_ENTRY = SubLObjectFactory.makeSymbol("PRINT-HTFILE-FILE-BLOCK-ENTRY");
    private static final SubLSymbol $sym331$HTFILE_FILE_BLOCK_ENTRY_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("HTFILE-FILE-BLOCK-ENTRY-PRINT-FUNCTION-TRAMPOLINE");
    private static final SubLList $list332 = ConsesLow.list(SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), SubLObjectFactory.makeSymbol("HTFILE-FILE-BLOCK-ENTRY-P"));
    private static final SubLSymbol $sym333$HTFILE_FILE_BLOCK_ENTRY_SIZE = SubLObjectFactory.makeSymbol("HTFILE-FILE-BLOCK-ENTRY-SIZE");
    private static final SubLSymbol $sym334$_CSETF_HTFILE_FILE_BLOCK_ENTRY_SIZE = SubLObjectFactory.makeSymbol("_CSETF-HTFILE-FILE-BLOCK-ENTRY-SIZE");
    private static final SubLSymbol $sym335$HTFILE_FILE_BLOCK_ENTRY_NEXT = SubLObjectFactory.makeSymbol("HTFILE-FILE-BLOCK-ENTRY-NEXT");
    private static final SubLSymbol $sym336$_CSETF_HTFILE_FILE_BLOCK_ENTRY_NEXT = SubLObjectFactory.makeSymbol("_CSETF-HTFILE-FILE-BLOCK-ENTRY-NEXT");
    private static final SubLSymbol $kw337$NEXT = SubLObjectFactory.makeKeyword("NEXT");
    private static final SubLSymbol $sym338$MAKE_HTFILE_FILE_BLOCK_ENTRY = SubLObjectFactory.makeSymbol("MAKE-HTFILE-FILE-BLOCK-ENTRY");
    private static final SubLSymbol $sym339$VISIT_DEFSTRUCT_OBJECT_HTFILE_FILE_BLOCK_ENTRY_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-HTFILE-FILE-BLOCK-ENTRY-METHOD");
    private static final SubLString $str340$__FILE_BLOCK_ENTRY__s__s_ = SubLObjectFactory.makeString("#<FILE-BLOCK-ENTRY:~s:~s>");
    private static final SubLString $str341$Unable_to_position_to_file_pos__D = SubLObjectFactory.makeString("Unable to position to file-pos ~D; true position is.");
    private static final SubLString $str342$Unable_to_position_to_file_pos__A = SubLObjectFactory.makeString("Unable to position to file-pos ~A; true position is ~A.");
    private static final SubLString $str343$Invalid_key_index__D_into_key_spa = SubLObjectFactory.makeString("Invalid key index ~D into key space [0,~D).");
    private static final SubLString $str344$Invalid_key_offset__A__points_pas = SubLObjectFactory.makeString("Invalid key offset ~A, points past key space start ~A.");
    private static final SubLString $str345$Index__A_has_null_hash_code_ = SubLObjectFactory.makeString("Index ~A has null hash-code.");
    private static final SubLString $str346$Index__A_has_null_key_offset_ = SubLObjectFactory.makeString("Index ~A has null key offset.");
    private static final SubLInteger $int347$10009 = SubLObjectFactory.makeInteger(10009);
    private static final SubLString $str348$__FHT_LOOKUP__A_I__A__H__A___ = SubLObjectFactory.makeString("~&FHT-LOOKUP ~A I=~A (H=~A)~%");
    private static final SubLString $str349$__FHT_LOOKUP__empty_key_iter__A_L = SubLObjectFactory.makeString("~&FHT-LOOKUP :empty-key iter=~A LastI=~A~%");
    private static final SubLString $str350$__FHT_LOOKUP__found_iter__A_LastI = SubLObjectFactory.makeString("~&FHT-LOOKUP :found iter=~A LastI=~A~%");
    private static final SubLString $str351$__FHT_LOOKUP__table_full_iter__A_ = SubLObjectFactory.makeString("~&FHT-LOOKUP :table-full iter=~A LastI=~A~%");
    private static final SubLString $str352$__FHT_LOOKUP_probe_I__A__ = SubLObjectFactory.makeString("~&FHT-LOOKUP probe I=~A~%");
    private static final SubLString $str353$__FHT_LOOKUP__error_iter__A_LastI = SubLObjectFactory.makeString("~&FHT-LOOKUP :error iter=~A LastI=~A~%");
    private static final SubLInteger $int354$66 = SubLObjectFactory.makeInteger(66);
    private static final SubLList $list355 = ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("FHT"), SubLObjectFactory.makeSymbol("DIFF-KEYSPACE"), SubLObjectFactory.makeSymbol("DIFF-CAPACITY")), SubLObjectFactory.makeSymbol("&BODY"), SubLObjectFactory.makeSymbol("BODY"));
    private static final SubLSymbol $sym356$HEADER_LOCAL = SubLObjectFactory.makeUninternedSymbol("HEADER-LOCAL");
    private static final SubLSymbol $sym357$KEYSPACE_TEMP = SubLObjectFactory.makeUninternedSymbol("KEYSPACE-TEMP");
    private static final SubLSymbol $sym358$CAPACITY_TEMP = SubLObjectFactory.makeUninternedSymbol("CAPACITY-TEMP");
    private static final SubLSymbol $sym359$CSETF = SubLObjectFactory.makeSymbol("CSETF");
    private static final SubLString $str360$Internal_error__S_during_table_re = SubLObjectFactory.makeString("Internal error ~S during table rehashing; file might be corrupted.");
    private static final SubLSymbol $kw361$VALID = SubLObjectFactory.makeKeyword("VALID");
    private static final SubLString $str362$Cannot_correctly_determine_file_p = SubLObjectFactory.makeString("Cannot correctly determine file position after writing object entry to ~D.");
    private static final SubLString $str363$New_file_position__D_is_smaller_t = SubLObjectFactory.makeString("New file position ~D is smaller than starting position ~D ... disk full?");
    private static final SubLString $str364$Instead_of__D_bytes__object_took_ = SubLObjectFactory.makeString("Instead of ~D bytes, object took ~D to write; object modified during write?");
    private static final SubLString $str365$Only__D_of_the_expected__D_bytes_ = SubLObjectFactory.makeString("Only ~D of the expected ~D bytes were written; object modified during write? Disk full?");
    private static final SubLString $str366$Claimed_object_size__D_did_not_ma = SubLObjectFactory.makeString("Claimed object size ~D did not match I/O size ~D; file might be corrupted.");
    private static final SubLSymbol $sym367$_FILE_HASH_TABLE_HEADERS_ = SubLObjectFactory.makeSymbol("*FILE-HASH-TABLE-HEADERS*");
    private static final SubLList $list368 = ConsesLow.list(SubLObjectFactory.makeSymbol("VMAJOR"), SubLObjectFactory.makeSymbol("VMINOR"), SubLObjectFactory.makeSymbol("READER"), SubLObjectFactory.makeSymbol("WRITER"), SubLObjectFactory.makeSymbol("VERIFIER"));
    private static final SubLSymbol $kw369$READER = SubLObjectFactory.makeKeyword("READER");
    private static final SubLSymbol $kw370$WRITER = SubLObjectFactory.makeKeyword("WRITER");
    private static final SubLSymbol $kw371$VERIFIER = SubLObjectFactory.makeKeyword("VERIFIER");
    private static final SubLSymbol $sym372$SETHASH = SubLObjectFactory.makeSymbol("SETHASH");
    private static final SubLInteger $int373$32792 = SubLObjectFactory.makeInteger(32792);
    private static final SubLInteger $int374$32784 = SubLObjectFactory.makeInteger(32784);
    private static final SubLInteger $int375$32776 = SubLObjectFactory.makeInteger(32776);
    private static final SubLInteger $int376$32768 = SubLObjectFactory.makeInteger(32768);
    private static final SubLInteger $int377$32824 = SubLObjectFactory.makeInteger(32824);
    private static final SubLInteger $int378$32816 = SubLObjectFactory.makeInteger(32816);
    private static final SubLInteger $int379$32808 = SubLObjectFactory.makeInteger(32808);
    private static final SubLInteger $int380$32800 = SubLObjectFactory.makeInteger(32800);
    private static final SubLString $str381$After_reading__S__computed_positi = SubLObjectFactory.makeString("After reading ~S, computed position ~D /= actual file position ~D.");
    private static final SubLString $str382$Predicted_object_size__D_did_not_ = SubLObjectFactory.makeString("Predicted object size ~D did not match I/O size ~D; file might be corrupted.");
    private static final SubLSymbol $kw383$EOF = SubLObjectFactory.makeKeyword("EOF");
    private static final SubLString $str384$Premature_end_of_file_when_moving = SubLObjectFactory.makeString("Premature end-of-file when moving block (~D bytes) from ~D to ~D.");
    private static final SubLSymbol $kw385$AGGRESSIVE = SubLObjectFactory.makeKeyword("AGGRESSIVE");
    private static final SubLSymbol $kw386$MODERATE = SubLObjectFactory.makeKeyword("MODERATE");
    private static final SubLSymbol $kw387$CONSERVATIVE = SubLObjectFactory.makeKeyword("CONSERVATIVE");
    private static final SubLString $str388$Invalid_Fast_FHT_optimization_mod = SubLObjectFactory.makeString("Invalid Fast-FHT optimization mode ~A.");
    private static final SubLSymbol $sym389$FAST_CREATE_FHT = SubLObjectFactory.makeSymbol("FAST-CREATE-FHT");
    private static final SubLSymbol $sym390$FAST_CREATE_FHT_P = SubLObjectFactory.makeSymbol("FAST-CREATE-FHT-P");
    private static final SubLList $list391 = ConsesLow.list(SubLObjectFactory.makeSymbol("FHT"), SubLObjectFactory.makeSymbol("TEMPSTEM"), SubLObjectFactory.makeSymbol("TEMPFILE"), SubLObjectFactory.makeSymbol("KEYSTREAM"));
    private static final SubLList $list392 = ConsesLow.list(SubLObjectFactory.makeKeyword("FHT"), SubLObjectFactory.makeKeyword("TEMPSTEM"), SubLObjectFactory.makeKeyword("TEMPFILE"), SubLObjectFactory.makeKeyword("KEYSTREAM"));
    private static final SubLList $list393 = ConsesLow.list(SubLObjectFactory.makeSymbol("FAST-CREATE-FHT-FHT"), SubLObjectFactory.makeSymbol("FAST-CREATE-FHT-TEMPSTEM"), SubLObjectFactory.makeSymbol("FAST-CREATE-FHT-TEMPFILE"), SubLObjectFactory.makeSymbol("FAST-CREATE-FHT-KEYSTREAM"));
    private static final SubLList $list394 = ConsesLow.list(SubLObjectFactory.makeSymbol("_CSETF-FAST-CREATE-FHT-FHT"), SubLObjectFactory.makeSymbol("_CSETF-FAST-CREATE-FHT-TEMPSTEM"), SubLObjectFactory.makeSymbol("_CSETF-FAST-CREATE-FHT-TEMPFILE"), SubLObjectFactory.makeSymbol("_CSETF-FAST-CREATE-FHT-KEYSTREAM"));
    private static final SubLSymbol $sym395$FAST_CREATE_FHT_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("FAST-CREATE-FHT-PRINT-FUNCTION-TRAMPOLINE");
    private static final SubLList $list396 = ConsesLow.list(SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), SubLObjectFactory.makeSymbol("FAST-CREATE-FHT-P"));
    private static final SubLSymbol $sym397$FAST_CREATE_FHT_FHT = SubLObjectFactory.makeSymbol("FAST-CREATE-FHT-FHT");
    private static final SubLSymbol $sym398$_CSETF_FAST_CREATE_FHT_FHT = SubLObjectFactory.makeSymbol("_CSETF-FAST-CREATE-FHT-FHT");
    private static final SubLSymbol $sym399$FAST_CREATE_FHT_TEMPSTEM = SubLObjectFactory.makeSymbol("FAST-CREATE-FHT-TEMPSTEM");
    private static final SubLSymbol $sym400$_CSETF_FAST_CREATE_FHT_TEMPSTEM = SubLObjectFactory.makeSymbol("_CSETF-FAST-CREATE-FHT-TEMPSTEM");
    private static final SubLSymbol $sym401$FAST_CREATE_FHT_TEMPFILE = SubLObjectFactory.makeSymbol("FAST-CREATE-FHT-TEMPFILE");
    private static final SubLSymbol $sym402$_CSETF_FAST_CREATE_FHT_TEMPFILE = SubLObjectFactory.makeSymbol("_CSETF-FAST-CREATE-FHT-TEMPFILE");
    private static final SubLSymbol $sym403$FAST_CREATE_FHT_KEYSTREAM = SubLObjectFactory.makeSymbol("FAST-CREATE-FHT-KEYSTREAM");
    private static final SubLSymbol $sym404$_CSETF_FAST_CREATE_FHT_KEYSTREAM = SubLObjectFactory.makeSymbol("_CSETF-FAST-CREATE-FHT-KEYSTREAM");
    private static final SubLSymbol $kw405$FHT = SubLObjectFactory.makeKeyword("FHT");
    private static final SubLSymbol $kw406$TEMPSTEM = SubLObjectFactory.makeKeyword("TEMPSTEM");
    private static final SubLSymbol $kw407$TEMPFILE = SubLObjectFactory.makeKeyword("TEMPFILE");
    private static final SubLSymbol $kw408$KEYSTREAM = SubLObjectFactory.makeKeyword("KEYSTREAM");
    private static final SubLSymbol $sym409$MAKE_FAST_CREATE_FHT = SubLObjectFactory.makeSymbol("MAKE-FAST-CREATE-FHT");
    private static final SubLSymbol $sym410$VISIT_DEFSTRUCT_OBJECT_FAST_CREATE_FHT_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-FAST-CREATE-FHT-METHOD");
    private static final SubLInteger $int411$1024 = SubLObjectFactory.makeInteger(1024);
    private static final SubLSymbol $sym412$_EXIT = SubLObjectFactory.makeSymbol("%EXIT");
    private static final SubLString $str413$keystream_ = SubLObjectFactory.makeString("keystream-");
    private static final SubLList $list414 = ConsesLow.list(SubLObjectFactory.makeKeyword("ERROR"), SubLObjectFactory.makeKeyword("USE-FIRST"));
    private static final SubLString $str415$Unknown_NON_UNIQUE_KEY_HANDLING_v = SubLObjectFactory.makeString("Unknown NON-UNIQUE-KEY-HANDLING value ~S");
    private static final SubLSymbol $kw416$IGNORE_ERRORS_TARGET = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
    private static final SubLSymbol $sym417$IGNORE_ERRORS_HANDLER = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
    private static final SubLString $str418$ambiguous = SubLObjectFactory.makeString("ambiguous");
    private static final SubLString $str419$Unable_to_open__S = SubLObjectFactory.makeString("Unable to open ~S");
    private static final SubLString $str420$unambiguous = SubLObjectFactory.makeString("unambiguous");
    private static final SubLString $str421$Cannot_call_this_method_in_mode__ = SubLObjectFactory.makeString("Cannot call this method in mode ~A.");
    private static final SubLString $str422$Seeding_keyspace_with_unambiguous = SubLObjectFactory.makeString("Seeding keyspace with unambiguous keys ....");
    private static final SubLString $str423$Run_in_index_of_keystream__prev__ = SubLObjectFactory.makeString("Run in index of keystream (prev=~A curr=~A). Fix FAST-FHT-UNIQUIFY-KEYSTREAM");
    private static final SubLString $str424$Inserting_ = SubLObjectFactory.makeString("Inserting ");
    private static final SubLString $str425$_keys_into_keyspace_____ = SubLObjectFactory.makeString(" keys into keyspace ....");
    private static final SubLString $str426$Sorry__key__A_appears_not_to_be_u = SubLObjectFactory.makeString("Sorry, key ~A appears not to be unique within the set; fast hash table create only works for already unique sets.");
    private static final SubLSymbol $kw427$USE_FIRST = SubLObjectFactory.makeKeyword("USE-FIRST");
    private static final SubLSymbol $sym428$FAST_FHT_KEYSTREAM_SORTER = SubLObjectFactory.makeSymbol("FAST-FHT-KEYSTREAM-SORTER");
    private static final SubLSymbol $sym429$FAST_FHT_KEYSTREAM_SORTER_P = SubLObjectFactory.makeSymbol("FAST-FHT-KEYSTREAM-SORTER-P");
    private static final SubLList $list430 = ConsesLow.list(SubLObjectFactory.makeSymbol("TEMPSTEM"), SubLObjectFactory.makeSymbol("IN-FILES"), SubLObjectFactory.makeSymbol("OUT-FILES"));
    private static final SubLList $list431 = ConsesLow.list(SubLObjectFactory.makeKeyword("TEMPSTEM"), SubLObjectFactory.makeKeyword("IN-FILES"), SubLObjectFactory.makeKeyword("OUT-FILES"));
    private static final SubLList $list432 = ConsesLow.list(SubLObjectFactory.makeSymbol("FSTFHT-KSORTER-TEMPSTEM"), SubLObjectFactory.makeSymbol("FSTFHT-KSORTER-IN-FILES"), SubLObjectFactory.makeSymbol("FSTFHT-KSORTER-OUT-FILES"));
    private static final SubLList $list433 = ConsesLow.list(SubLObjectFactory.makeSymbol("_CSETF-FSTFHT-KSORTER-TEMPSTEM"), SubLObjectFactory.makeSymbol("_CSETF-FSTFHT-KSORTER-IN-FILES"), SubLObjectFactory.makeSymbol("_CSETF-FSTFHT-KSORTER-OUT-FILES"));
    private static final SubLSymbol $sym434$FAST_FHT_KEYSTREAM_SORTER_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("FAST-FHT-KEYSTREAM-SORTER-PRINT-FUNCTION-TRAMPOLINE");
    private static final SubLList $list435 = ConsesLow.list(SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), SubLObjectFactory.makeSymbol("FAST-FHT-KEYSTREAM-SORTER-P"));
    private static final SubLSymbol $sym436$FSTFHT_KSORTER_TEMPSTEM = SubLObjectFactory.makeSymbol("FSTFHT-KSORTER-TEMPSTEM");
    private static final SubLSymbol $sym437$_CSETF_FSTFHT_KSORTER_TEMPSTEM = SubLObjectFactory.makeSymbol("_CSETF-FSTFHT-KSORTER-TEMPSTEM");
    private static final SubLSymbol $sym438$FSTFHT_KSORTER_IN_FILES = SubLObjectFactory.makeSymbol("FSTFHT-KSORTER-IN-FILES");
    private static final SubLSymbol $sym439$_CSETF_FSTFHT_KSORTER_IN_FILES = SubLObjectFactory.makeSymbol("_CSETF-FSTFHT-KSORTER-IN-FILES");
    private static final SubLSymbol $sym440$FSTFHT_KSORTER_OUT_FILES = SubLObjectFactory.makeSymbol("FSTFHT-KSORTER-OUT-FILES");
    private static final SubLSymbol $sym441$_CSETF_FSTFHT_KSORTER_OUT_FILES = SubLObjectFactory.makeSymbol("_CSETF-FSTFHT-KSORTER-OUT-FILES");
    private static final SubLSymbol $kw442$IN_FILES = SubLObjectFactory.makeKeyword("IN-FILES");
    private static final SubLSymbol $kw443$OUT_FILES = SubLObjectFactory.makeKeyword("OUT-FILES");
    private static final SubLSymbol $sym444$MAKE_FAST_FHT_KEYSTREAM_SORTER = SubLObjectFactory.makeSymbol("MAKE-FAST-FHT-KEYSTREAM-SORTER");
    private static final SubLSymbol $sym445$VISIT_DEFSTRUCT_OBJECT_FAST_FHT_KEYSTREAM_SORTER_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-FAST-FHT-KEYSTREAM-SORTER-METHOD");
    private static final SubLInteger $int446$179769313486231590772930519078902 = SubLObjectFactory.makeInteger("179769313486231590772930519078902473361797697894230657273430081157732675805500963132708477322407536021120113879871393357658789768814416622492847430639474124377767893424865485276302219601246094119453082952085005768838150682342462881473913110540827237163350510684586298239947245938479716304835356329624224137216");
    private static final SubLString $str447$Prepare_tiled_input_files_____ = SubLObjectFactory.makeString("Prepare tiled input files ....");
    private static final SubLString $str448$Less_than_3_tiles__no_sort_needed = SubLObjectFactory.makeString("Less than 3 tiles, no sort needed ....");
    private static final SubLSymbol $kw449$OUTPUT = SubLObjectFactory.makeKeyword("OUTPUT");
    private static final SubLString $str450$Merge_sorting_keystream_of_ = SubLObjectFactory.makeString("Merge-sorting keystream of ");
    private static final SubLString $str451$_tiles_in_ = SubLObjectFactory.makeString(" tiles in ");
    private static final SubLString $str452$_passes____ = SubLObjectFactory.makeString(" passes....");
    private static final SubLString $str453$Generate_set_and_activity_files__ = SubLObjectFactory.makeString("Generate set and activity files ....");
    private static final SubLString $str454$in_ = SubLObjectFactory.makeString("in-");
    private static final SubLString $str455$out_ = SubLObjectFactory.makeString("out-");
    private static final SubLString $str456$Can_only_work_from_a_rewound_keys = SubLObjectFactory.makeString("Can only work from a rewound keystream ~A.");
    private static final SubLSymbol $sym457$FAST_FHT_KEYSTREAM_ENTRY_ = SubLObjectFactory.makeSymbol("FAST-FHT-KEYSTREAM-ENTRY<");
    private static final SubLSymbol $kw458$EQ = SubLObjectFactory.makeKeyword("EQ");
    private static final SubLSymbol $kw459$GT = SubLObjectFactory.makeKeyword("GT");
    private static final SubLSymbol $kw460$LT = SubLObjectFactory.makeKeyword("LT");
    private static final SubLSymbol $kw461$APPEND = SubLObjectFactory.makeKeyword("APPEND");
    private static final SubLList $list462 = ConsesLow.list(SubLObjectFactory.makeUninternedSymbol("START"), SubLObjectFactory.makeUninternedSymbol("END"), SubLObjectFactory.makeUninternedSymbol("DELTA"));
    private static final SubLString $str463$_of_ = SubLObjectFactory.makeString(" of ");
    private static final SubLString $str464$Merge_Pass_ = SubLObjectFactory.makeString("Merge Pass ");
    private static final SubLString $str465$The_chunk_count_should_have_decli = SubLObjectFactory.makeString("The chunk count should have declined, but did not: ~A >= ~A.");
    private static final SubLString $str466$Only_sentinels_or__EOF_can_be_equ = SubLObjectFactory.makeString("Only sentinels or :EOF can be equal, but ~A and ~A are.");
    private static final SubLSymbol $kw467$MORE = SubLObjectFactory.makeKeyword("MORE");
    private static final SubLList $list468 = ConsesLow.list(SubLObjectFactory.makeSymbol("FHT"), SubLObjectFactory.makeSymbol("INDEX"), SubLObjectFactory.makeSymbol("ENTRY"), SubLObjectFactory.makeSymbol("IN-STREAM"), SubLObjectFactory.makeSymbol("LOSER-ITEMS"), SubLObjectFactory.makeSymbol("COLLISION-STREAM"));
    private static final SubLSymbol $sym469$_ = SubLObjectFactory.makeSymbol("=");
    private static final SubLSymbol $sym470$FAST_FHT_GET_COMPARABLE_INDEX_FROM_ENTRY = SubLObjectFactory.makeSymbol("FAST-FHT-GET-COMPARABLE-INDEX-FROM-ENTRY");
    private static final SubLSymbol $sym471$FAST_FHT_WRITE_ONE_COLLISION_STREAM_ENTRY = SubLObjectFactory.makeSymbol("FAST-FHT-WRITE-ONE-COLLISION-STREAM-ENTRY");
    private static final SubLSymbol $sym472$FAST_FHT_READ_ONE_KEYSTREAM_ENTRY = SubLObjectFactory.makeSymbol("FAST-FHT-READ-ONE-KEYSTREAM-ENTRY");
    private static final SubLSymbol $sym473$CINC = SubLObjectFactory.makeSymbol("CINC");
    private static final SubLList $list474 = ConsesLow.list(new SubLObject[] {
        SubLObjectFactory.makeSymbol("FHT"), SubLObjectFactory.makeSymbol("KEEPER-ENTRY"), SubLObjectFactory.makeSymbol("LOSER-ENTRY"), SubLObjectFactory.makeSymbol("KEEPER-STREAM"), SubLObjectFactory.makeSymbol("LOSER-STREAM"), SubLObjectFactory.makeSymbol("KEEPER-ITEMS"), SubLObjectFactory.makeSymbol("LOSER-ITEMS"), SubLObjectFactory.makeSymbol("SET-STREAM"), SubLObjectFactory.makeSymbol("COLLISION-STREAM")
    });
    private static final SubLSymbol $sym475$INDEX_KEEPER = SubLObjectFactory.makeUninternedSymbol("INDEX-KEEPER");
    private static final SubLSymbol $sym476$INDEX_LOSER = SubLObjectFactory.makeUninternedSymbol("INDEX-LOSER");
    private static final SubLSymbol $sym477$FAST_FHT_WRITE_ONE_KEYSTREAM_ENTRY = SubLObjectFactory.makeSymbol("FAST-FHT-WRITE-ONE-KEYSTREAM-ENTRY");
    private static final SubLSymbol $sym478$FAST_FHT_DRAIN_INDEX_RUN = SubLObjectFactory.makeSymbol("FAST-FHT-DRAIN-INDEX-RUN");
    private static final SubLString $str479$__A_set_item_A___A_activity_item_ = SubLObjectFactory.makeString(" ~A set item~A, ~A activity item~A ");
    private static final SubLString $str480$s = SubLObjectFactory.makeString("s");
    private static final SubLString $str481$_________________________ = SubLObjectFactory.makeString("=========================");
    private static final SubLString $str482$______File__A______ = SubLObjectFactory.makeString("~&<<<<File ~A>>>>~%");
    private static final SubLString $str483$File__A_no_does_not_contain_a_val = SubLObjectFactory.makeString("File ~A no does not contain a valid keystream: problem at ~A.");
    private static final SubLSymbol $kw484$MID_STREAM_EOF = SubLObjectFactory.makeKeyword("MID-STREAM-EOF");
    private static final SubLSymbol $kw485$UNSORTED_INDEX = SubLObjectFactory.makeKeyword("UNSORTED-INDEX");
    private static final SubLSymbol $sym486$TEST_FAST_FHT_KEYSTREAM_ENTRY_CMP = SubLObjectFactory.makeSymbol("TEST-FAST-FHT-KEYSTREAM-ENTRY-CMP");
    private static final SubLSymbol $kw487$TEST = SubLObjectFactory.makeKeyword("TEST");
    private static final SubLSymbol $kw488$OWNER = SubLObjectFactory.makeKeyword("OWNER");
    private static final SubLSymbol $kw489$CLASSES = SubLObjectFactory.makeKeyword("CLASSES");
    private static final SubLSymbol $kw490$KB = SubLObjectFactory.makeKeyword("KB");
    private static final SubLSymbol $kw491$TINY = SubLObjectFactory.makeKeyword("TINY");
    private static final SubLSymbol $kw492$WORKING_ = SubLObjectFactory.makeKeyword("WORKING?");
    private static final SubLList $list493 = ConsesLow.list(new SubLObject[] {
        ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeKeyword("SENTINEL"), SubLObjectFactory.makeKeyword("SENTINEL")), SubLObjectFactory.makeKeyword("EQ")), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeKeyword("EOF"), SubLObjectFactory.makeKeyword("EOF")), SubLObjectFactory.makeKeyword("EQ")), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeKeyword("SENTINEL"), SubLObjectFactory.makeKeyword("EOF")), SubLObjectFactory.makeKeyword("LT")), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeKeyword("EOF"), SubLObjectFactory.makeKeyword("SENTINEL")), SubLObjectFactory.makeKeyword("GT")), ConsesLow.list(ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeInteger(104), SubLObjectFactory.makeInteger(168), SubLObjectFactory.makeInteger(12850), SubLObjectFactory.makeString("137")), SubLObjectFactory.makeKeyword("SENTINEL")), SubLObjectFactory.makeKeyword("LT")), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeKeyword("SENTINEL"), ConsesLow.list(SubLObjectFactory.makeInteger(104), SubLObjectFactory.makeInteger(168), SubLObjectFactory.makeInteger(12850), SubLObjectFactory.makeString("137"))), SubLObjectFactory.makeKeyword("GT")), ConsesLow.list(ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeInteger(104), SubLObjectFactory.makeInteger(168), SubLObjectFactory.makeInteger(12850), SubLObjectFactory.makeString("137")), SubLObjectFactory.makeKeyword("EOF")), SubLObjectFactory.makeKeyword("LT")), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeKeyword("EOF"), ConsesLow.list(SubLObjectFactory.makeInteger(104), SubLObjectFactory.makeInteger(168), SubLObjectFactory.makeInteger(12850), SubLObjectFactory.makeString("137"))), SubLObjectFactory.makeKeyword("GT")), ConsesLow.list(ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeInteger(128), SubLObjectFactory.makeInteger(128), SubLObjectFactory.makeInteger(13062), SubLObjectFactory.makeString("97")), ConsesLow.list(SubLObjectFactory.makeInteger(104), SubLObjectFactory.makeInteger(168), SubLObjectFactory.makeInteger(12850), SubLObjectFactory.makeString("137"))), SubLObjectFactory.makeKeyword("GT")), ConsesLow.list(ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeInteger(104), SubLObjectFactory.makeInteger(168), SubLObjectFactory.makeInteger(12850), SubLObjectFactory.makeString("137")), ConsesLow.list(SubLObjectFactory.makeInteger(128), SubLObjectFactory.makeInteger(128), SubLObjectFactory.makeInteger(13062), SubLObjectFactory.makeString("97"))), SubLObjectFactory.makeKeyword("LT")), 
        ConsesLow.list(ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeInteger(104), SubLObjectFactory.makeInteger(168), SubLObjectFactory.makeInteger(12850), SubLObjectFactory.makeString("137")), ConsesLow.list(SubLObjectFactory.makeInteger(104), SubLObjectFactory.makeInteger(168), SubLObjectFactory.makeInteger(12850), SubLObjectFactory.makeString("137"))), SubLObjectFactory.makeKeyword("EQ"))
    });
    private static final SubLSymbol $kw494$SENTINEL = SubLObjectFactory.makeKeyword("SENTINEL");
    private static final SubLList $list495 = ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("FHT"), SubLObjectFactory.makeSymbol("FILENAME"), SubLObjectFactory.makeSymbol("&KEY"), ConsesLow.list(SubLObjectFactory.makeSymbol("TEST-FN"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), SubLObjectFactory.makeSymbol("*DEFAULT-FHT-TEST-FUNCTION*"))), ConsesLow.list(SubLObjectFactory.makeSymbol("SERIALIZATION-FN"), SubLObjectFactory.makeSymbol("*DEFAULT-FHT-SERIALIZATION-PROTOCOL*"))), SubLObjectFactory.makeSymbol("&BODY"), SubLObjectFactory.makeSymbol("BODY"));
    private static final SubLList $list496 = ConsesLow.list(SubLObjectFactory.makeKeyword("TEST-FN"), SubLObjectFactory.makeKeyword("SERIALIZATION-FN"));
    private static final SubLSymbol $kw497$TEST_FN = SubLObjectFactory.makeKeyword("TEST-FN");
    private static final SubLSymbol $sym498$_DEFAULT_FHT_TEST_FUNCTION_ = SubLObjectFactory.makeSymbol("*DEFAULT-FHT-TEST-FUNCTION*");
    private static final SubLSymbol $kw499$SERIALIZATION_FN = SubLObjectFactory.makeKeyword("SERIALIZATION-FN");
    private static final SubLSymbol $sym500$CUNWIND_PROTECT = SubLObjectFactory.makeSymbol("CUNWIND-PROTECT");
    private static final SubLSymbol $sym501$OPEN_FILE_HASH_TABLE_READ_ONLY = SubLObjectFactory.makeSymbol("OPEN-FILE-HASH-TABLE-READ-ONLY");
    private static final SubLSymbol $sym502$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
    private static final SubLSymbol $sym503$FINALIZE_FILE_HASH_TABLE = SubLObjectFactory.makeSymbol("FINALIZE-FILE-HASH-TABLE");
    private static final SubLSymbol $sym504$OPEN_FILE_HASH_TABLE = SubLObjectFactory.makeSymbol("OPEN-FILE-HASH-TABLE");
    private static final SubLList $list505 = ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("FHT"), SubLObjectFactory.makeSymbol("FILENAME"), SubLObjectFactory.makeSymbol("&KEY"), ConsesLow.list(SubLObjectFactory.makeSymbol("EXPECTED-ITEMS"), SubLObjectFactory.makeSymbol("*HTFILE-DEFAULT-EXPECTED-ITEMS*")), ConsesLow.list(SubLObjectFactory.makeSymbol("AVERAGE-SIZE"), SubLObjectFactory.makeSymbol("*HTFILE-DEFAULT-AVERAGE-SIZE*")), ConsesLow.list(SubLObjectFactory.makeSymbol("TEST-FN"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), SubLObjectFactory.makeSymbol("*DEFAULT-FHT-TEST-FUNCTION*"))), ConsesLow.list(SubLObjectFactory.makeSymbol("SERIALIZATION-FN"), SubLObjectFactory.makeSymbol("*DEFAULT-FHT-SERIALIZATION-PROTOCOL*"))), SubLObjectFactory.makeSymbol("&BODY"), SubLObjectFactory.makeSymbol("BODY"));
    private static final SubLList $list506 = ConsesLow.list(SubLObjectFactory.makeKeyword("EXPECTED-ITEMS"), SubLObjectFactory.makeKeyword("AVERAGE-SIZE"), SubLObjectFactory.makeKeyword("TEST-FN"), SubLObjectFactory.makeKeyword("SERIALIZATION-FN"));
    private static final SubLSymbol $kw507$EXPECTED_ITEMS = SubLObjectFactory.makeKeyword("EXPECTED-ITEMS");
    private static final SubLSymbol $kw508$AVERAGE_SIZE = SubLObjectFactory.makeKeyword("AVERAGE-SIZE");
    private static final SubLSymbol $sym509$CREATE_FILE_HASH_TABLE = SubLObjectFactory.makeSymbol("CREATE-FILE-HASH-TABLE");
    private static final SubLList $list510 = ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("FAST-FHT"), SubLObjectFactory.makeSymbol("FILENAME"), SubLObjectFactory.makeSymbol("&KEY"), ConsesLow.list(SubLObjectFactory.makeSymbol("TEMPDIR"), ConsesLow.list(SubLObjectFactory.makeSymbol("TEMP-DIRECTORY"))), ConsesLow.list(SubLObjectFactory.makeSymbol("TEST-FN"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), SubLObjectFactory.makeSymbol("*DEFAULT-FHT-TEST-FUNCTION*"))), ConsesLow.list(SubLObjectFactory.makeSymbol("SERIALIZATION-FN"), SubLObjectFactory.makeSymbol("*DEFAULT-FHT-SERIALIZATION-PROTOCOL*")), ConsesLow.list(SubLObjectFactory.makeSymbol("KEEP-TEMPORARY-KEYFILE"))), SubLObjectFactory.makeSymbol("&BODY"), SubLObjectFactory.makeSymbol("BODY"));
    private static final SubLList $list511 = ConsesLow.list(SubLObjectFactory.makeKeyword("TEMPDIR"), SubLObjectFactory.makeKeyword("TEST-FN"), SubLObjectFactory.makeKeyword("SERIALIZATION-FN"), SubLObjectFactory.makeKeyword("KEEP-TEMPORARY-KEYFILE"));
    private static final SubLSymbol $kw512$TEMPDIR = SubLObjectFactory.makeKeyword("TEMPDIR");
    private static final SubLSymbol $kw513$KEEP_TEMPORARY_KEYFILE = SubLObjectFactory.makeKeyword("KEEP-TEMPORARY-KEYFILE");
    private static final SubLSymbol $sym514$FAST_CREATE_FILE_HASH_TABLE = SubLObjectFactory.makeSymbol("FAST-CREATE-FILE-HASH-TABLE");
    private static final SubLSymbol $sym515$FINALIZE_FAST_CREATE_FILE_HASH_TABLE = SubLObjectFactory.makeSymbol("FINALIZE-FAST-CREATE-FILE-HASH-TABLE");
    private static final SubLSymbol $sym516$TEST_FAST_FHT_CREATION_WITH_MERGE_SORTED_KEYSTREAM = SubLObjectFactory.makeSymbol("TEST-FAST-FHT-CREATION-WITH-MERGE-SORTED-KEYSTREAM");
    private static final SubLList $list517;
    private static final SubLString $str518$My_String_ = SubLObjectFactory.makeString("My String ");
    private static final SubLSymbol $kw519$SUCCESS = SubLObjectFactory.makeKeyword("SUCCESS");
    private static final SubLSymbol $kw520$UNPROVIDED = SubLObjectFactory.makeKeyword("UNPROVIDED");
    private static final SubLString $str521$fht_ = SubLObjectFactory.makeString("fht-");
    private static final SubLString $str522$Writing_out_FHT_____ = SubLObjectFactory.makeString("Writing out FHT ....");
    private static final SubLList $list523 = ConsesLow.list(SubLObjectFactory.makeSymbol("KEY"), SubLObjectFactory.makeSymbol("VALUES"));
    private static final SubLString $str524$Error__expected__A_items__got__A_ = SubLObjectFactory.makeString("Error, expected ~A items, got ~A.");
    private static final SubLString $str525$Checking_map_against_FHT_____ = SubLObjectFactory.makeString("Checking map against FHT ....");
    private static final SubLString $str526$For__S__expected__S__got__S_inste = SubLObjectFactory.makeString("For ~S, expected ~S, got ~S instead.");
    private static final SubLString $str527$We_checked__A_of__A_entries_ = SubLObjectFactory.makeString("We checked ~A of ~A entries.");
    private static final SubLString $str528$Checking_FHT_against_map____ = SubLObjectFactory.makeString("Checking FHT against map ...");
    private static final SubLString $str529$For__S__epxected__S__got__S_inste = SubLObjectFactory.makeString("For ~S, epxected ~S, got ~S instead.");
    private static final SubLSymbol $sym530$TEST_FAST_FHT_WITH_KB_CONTENTS = SubLObjectFactory.makeSymbol("TEST-FAST-FHT-WITH-KB-CONTENTS");
    private static final SubLList $list531;
    private static final SubLSymbol $kw532$VALUE = SubLObjectFactory.makeKeyword("VALUE");

    static 
    {
        $list245 = ConsesLow.list(NIL);
        $list268 = ConsesLow.list(SubLObjectFactory.makeSymbol("CSETQ"), SubLObjectFactory.makeSymbol("*PROGRESS-SOFAR*"), ZERO_INTEGER);
        $list288 = ConsesLow.list(T);
        $list517 = ConsesLow.list(new SubLObject[] {
            ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeInteger(31), THREE_INTEGER, SubLObjectFactory.makeKeyword("MODERATE")), SubLObjectFactory.makeKeyword("SUCCESS")), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeInteger(23), THREE_INTEGER, SubLObjectFactory.makeKeyword("MODERATE")), SubLObjectFactory.makeKeyword("SUCCESS")), ConsesLow.list(ConsesLow.list(FIFTEEN_INTEGER, THREE_INTEGER, SubLObjectFactory.makeKeyword("MODERATE")), SubLObjectFactory.makeKeyword("SUCCESS")), ConsesLow.list(ConsesLow.list(SEVEN_INTEGER, THREE_INTEGER, SubLObjectFactory.makeKeyword("MODERATE")), SubLObjectFactory.makeKeyword("SUCCESS")), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeInteger(31), THREE_INTEGER, SubLObjectFactory.makeKeyword("AGGRESSIVE")), SubLObjectFactory.makeKeyword("SUCCESS")), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeInteger(23), THREE_INTEGER, SubLObjectFactory.makeKeyword("AGGRESSIVE")), SubLObjectFactory.makeKeyword("SUCCESS")), ConsesLow.list(ConsesLow.list(FIFTEEN_INTEGER, THREE_INTEGER, SubLObjectFactory.makeKeyword("AGGRESSIVE")), SubLObjectFactory.makeKeyword("SUCCESS")), ConsesLow.list(ConsesLow.list(SEVEN_INTEGER, THREE_INTEGER, SubLObjectFactory.makeKeyword("AGGRESSIVE")), SubLObjectFactory.makeKeyword("SUCCESS")), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeInteger(31), THREE_INTEGER, SubLObjectFactory.makeKeyword("CONSERVATIVE")), SubLObjectFactory.makeKeyword("SUCCESS")), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeInteger(23), THREE_INTEGER, SubLObjectFactory.makeKeyword("CONSERVATIVE")), SubLObjectFactory.makeKeyword("SUCCESS")), 
            ConsesLow.list(ConsesLow.list(FIFTEEN_INTEGER, THREE_INTEGER, SubLObjectFactory.makeKeyword("CONSERVATIVE")), SubLObjectFactory.makeKeyword("SUCCESS")), ConsesLow.list(ConsesLow.list(SEVEN_INTEGER, THREE_INTEGER, SubLObjectFactory.makeKeyword("CONSERVATIVE")), SubLObjectFactory.makeKeyword("SUCCESS"))
        });
        $list531 = ConsesLow.list(ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeInteger(100), SubLObjectFactory.makeSymbol("RANDOM-CONSTANT"), SubLObjectFactory.makeSymbol("CONSTANT-SUID"), SubLObjectFactory.makeSymbol("CONSTANT-NAME"), EQL, SubLObjectFactory.makeSymbol("STRING-EQUAL")), SubLObjectFactory.makeKeyword("SUCCESS")), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeInteger(100), SubLObjectFactory.makeSymbol("RANDOM-ASSERTION"), SubLObjectFactory.makeSymbol("ASSERTION-ID"), SubLObjectFactory.makeSymbol("COMPACT-HL-EXTERNAL-ID-STRING"), EQL, SubLObjectFactory.makeSymbol("STRING-EQUAL")), SubLObjectFactory.makeKeyword("SUCCESS")), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeInteger(100), SubLObjectFactory.makeSymbol("TEST-FFHTKB-GENERATE-CONSTANT-INFO"), SubLObjectFactory.makeSymbol("TEST-FFHTKB-GRAB-CONSTANT-KEY-INFO"), SubLObjectFactory.makeSymbol("TEST-FFHTKB-GRAB-CONSTANT-VALUE-INFO"), EQUALP, EQUALP, SubLObjectFactory.makeKeyword("IMAGE-INDEPENDENT-CFASL")), SubLObjectFactory.makeKeyword("SUCCESS")));
    }    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 1419L)
    public static SubLObject file_hash_table_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, (SubLObject)file_hash_table.ZERO_INTEGER);
        return (SubLObject)file_hash_table.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 1419L)
    public static SubLObject file_hash_table_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $file_hash_table_native.class) ? file_hash_table.T : file_hash_table.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 1419L)
    public static SubLObject file_hash_table_stream(final SubLObject v_object) {
        assert file_hash_table.NIL != file_hash_table_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 1419L)
    public static SubLObject file_hash_table_header(final SubLObject v_object) {
        assert file_hash_table.NIL != file_hash_table_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 1419L)
    public static SubLObject file_hash_table_lock(final SubLObject v_object) {
        assert file_hash_table.NIL != file_hash_table_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 1419L)
    public static SubLObject file_hash_table_encoding_input_fn(final SubLObject v_object) {
        assert file_hash_table.NIL != file_hash_table_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 1419L)
    public static SubLObject file_hash_table_encoding_output_fn(final SubLObject v_object) {
        assert file_hash_table.NIL != file_hash_table_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 1419L)
    public static SubLObject file_hash_table_encoding_size_fn(final SubLObject v_object) {
        assert file_hash_table.NIL != file_hash_table_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 1419L)
    public static SubLObject file_hash_table_encoding_key_input_fn(final SubLObject v_object) {
        assert file_hash_table.NIL != file_hash_table_p(v_object) : v_object;
        return v_object.getField8();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 1419L)
    public static SubLObject file_hash_table_encoding_key_output_fn(final SubLObject v_object) {
        assert file_hash_table.NIL != file_hash_table_p(v_object) : v_object;
        return v_object.getField9();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 1419L)
    public static SubLObject file_hash_table_testfn(final SubLObject v_object) {
        assert file_hash_table.NIL != file_hash_table_p(v_object) : v_object;
        return v_object.getField10();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 1419L)
    public static SubLObject file_hash_table_hash_fn(final SubLObject v_object) {
        assert file_hash_table.NIL != file_hash_table_p(v_object) : v_object;
        return v_object.getField11();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 1419L)
    public static SubLObject file_hash_table_input_cache(final SubLObject v_object) {
        assert file_hash_table.NIL != file_hash_table_p(v_object) : v_object;
        return v_object.getField12();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 1419L)
    public static SubLObject file_hash_table_output_cache(final SubLObject v_object) {
        assert file_hash_table.NIL != file_hash_table_p(v_object) : v_object;
        return v_object.getField13();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 1419L)
    public static SubLObject file_hash_table_property_list(final SubLObject v_object) {
        assert file_hash_table.NIL != file_hash_table_p(v_object) : v_object;
        return v_object.getField14();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 1419L)
    public static SubLObject _csetf_file_hash_table_stream(final SubLObject v_object, final SubLObject value) {
        assert file_hash_table.NIL != file_hash_table_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 1419L)
    public static SubLObject _csetf_file_hash_table_header(final SubLObject v_object, final SubLObject value) {
        assert file_hash_table.NIL != file_hash_table_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 1419L)
    public static SubLObject _csetf_file_hash_table_lock(final SubLObject v_object, final SubLObject value) {
        assert file_hash_table.NIL != file_hash_table_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 1419L)
    public static SubLObject _csetf_file_hash_table_encoding_input_fn(final SubLObject v_object, final SubLObject value) {
        assert file_hash_table.NIL != file_hash_table_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 1419L)
    public static SubLObject _csetf_file_hash_table_encoding_output_fn(final SubLObject v_object, final SubLObject value) {
        assert file_hash_table.NIL != file_hash_table_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 1419L)
    public static SubLObject _csetf_file_hash_table_encoding_size_fn(final SubLObject v_object, final SubLObject value) {
        assert file_hash_table.NIL != file_hash_table_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 1419L)
    public static SubLObject _csetf_file_hash_table_encoding_key_input_fn(final SubLObject v_object, final SubLObject value) {
        assert file_hash_table.NIL != file_hash_table_p(v_object) : v_object;
        return v_object.setField8(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 1419L)
    public static SubLObject _csetf_file_hash_table_encoding_key_output_fn(final SubLObject v_object, final SubLObject value) {
        assert file_hash_table.NIL != file_hash_table_p(v_object) : v_object;
        return v_object.setField9(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 1419L)
    public static SubLObject _csetf_file_hash_table_testfn(final SubLObject v_object, final SubLObject value) {
        assert file_hash_table.NIL != file_hash_table_p(v_object) : v_object;
        return v_object.setField10(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 1419L)
    public static SubLObject _csetf_file_hash_table_hash_fn(final SubLObject v_object, final SubLObject value) {
        assert file_hash_table.NIL != file_hash_table_p(v_object) : v_object;
        return v_object.setField11(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 1419L)
    public static SubLObject _csetf_file_hash_table_input_cache(final SubLObject v_object, final SubLObject value) {
        assert file_hash_table.NIL != file_hash_table_p(v_object) : v_object;
        return v_object.setField12(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 1419L)
    public static SubLObject _csetf_file_hash_table_output_cache(final SubLObject v_object, final SubLObject value) {
        assert file_hash_table.NIL != file_hash_table_p(v_object) : v_object;
        return v_object.setField13(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 1419L)
    public static SubLObject _csetf_file_hash_table_property_list(final SubLObject v_object, final SubLObject value) {
        assert file_hash_table.NIL != file_hash_table_p(v_object) : v_object;
        return v_object.setField14(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 1419L)
    public static SubLObject make_file_hash_table(SubLObject arglist) {
        if (arglist == file_hash_table.UNPROVIDED) {
            arglist = (SubLObject)file_hash_table.NIL;
        }
        final SubLObject v_new = (SubLObject)new $file_hash_table_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)file_hash_table.NIL, next = arglist; file_hash_table.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)file_hash_table.$kw35$STREAM)) {
                _csetf_file_hash_table_stream(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)file_hash_table.$kw36$HEADER)) {
                _csetf_file_hash_table_header(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)file_hash_table.$kw37$LOCK)) {
                _csetf_file_hash_table_lock(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)file_hash_table.$kw38$ENCODING_INPUT_FN)) {
                _csetf_file_hash_table_encoding_input_fn(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)file_hash_table.$kw39$ENCODING_OUTPUT_FN)) {
                _csetf_file_hash_table_encoding_output_fn(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)file_hash_table.$kw40$ENCODING_SIZE_FN)) {
                _csetf_file_hash_table_encoding_size_fn(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)file_hash_table.$kw41$ENCODING_KEY_INPUT_FN)) {
                _csetf_file_hash_table_encoding_key_input_fn(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)file_hash_table.$kw42$ENCODING_KEY_OUTPUT_FN)) {
                _csetf_file_hash_table_encoding_key_output_fn(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)file_hash_table.$kw43$TESTFN)) {
                _csetf_file_hash_table_testfn(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)file_hash_table.$kw44$HASH_FN)) {
                _csetf_file_hash_table_hash_fn(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)file_hash_table.$kw45$INPUT_CACHE)) {
                _csetf_file_hash_table_input_cache(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)file_hash_table.$kw46$OUTPUT_CACHE)) {
                _csetf_file_hash_table_output_cache(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)file_hash_table.$kw47$PROPERTY_LIST)) {
                _csetf_file_hash_table_property_list(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)file_hash_table.$str48$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 1419L)
    public static SubLObject visit_defstruct_file_hash_table(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)file_hash_table.$kw49$BEGIN, (SubLObject)file_hash_table.$sym50$MAKE_FILE_HASH_TABLE, (SubLObject)file_hash_table.THIRTEEN_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)file_hash_table.$kw51$SLOT, (SubLObject)file_hash_table.$kw35$STREAM, file_hash_table_stream(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)file_hash_table.$kw51$SLOT, (SubLObject)file_hash_table.$kw36$HEADER, file_hash_table_header(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)file_hash_table.$kw51$SLOT, (SubLObject)file_hash_table.$kw37$LOCK, file_hash_table_lock(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)file_hash_table.$kw51$SLOT, (SubLObject)file_hash_table.$kw38$ENCODING_INPUT_FN, file_hash_table_encoding_input_fn(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)file_hash_table.$kw51$SLOT, (SubLObject)file_hash_table.$kw39$ENCODING_OUTPUT_FN, file_hash_table_encoding_output_fn(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)file_hash_table.$kw51$SLOT, (SubLObject)file_hash_table.$kw40$ENCODING_SIZE_FN, file_hash_table_encoding_size_fn(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)file_hash_table.$kw51$SLOT, (SubLObject)file_hash_table.$kw41$ENCODING_KEY_INPUT_FN, file_hash_table_encoding_key_input_fn(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)file_hash_table.$kw51$SLOT, (SubLObject)file_hash_table.$kw42$ENCODING_KEY_OUTPUT_FN, file_hash_table_encoding_key_output_fn(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)file_hash_table.$kw51$SLOT, (SubLObject)file_hash_table.$kw43$TESTFN, file_hash_table_testfn(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)file_hash_table.$kw51$SLOT, (SubLObject)file_hash_table.$kw44$HASH_FN, file_hash_table_hash_fn(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)file_hash_table.$kw51$SLOT, (SubLObject)file_hash_table.$kw45$INPUT_CACHE, file_hash_table_input_cache(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)file_hash_table.$kw51$SLOT, (SubLObject)file_hash_table.$kw46$OUTPUT_CACHE, file_hash_table_output_cache(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)file_hash_table.$kw51$SLOT, (SubLObject)file_hash_table.$kw47$PROPERTY_LIST, file_hash_table_property_list(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)file_hash_table.$kw52$END, (SubLObject)file_hash_table.$sym50$MAKE_FILE_HASH_TABLE, (SubLObject)file_hash_table.THIRTEEN_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 1419L)
    public static SubLObject visit_defstruct_object_file_hash_table_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_file_hash_table(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 1772L)
    public static SubLObject describe_file_hash_table(final SubLObject fht, SubLObject stream) {
        if (stream == file_hash_table.UNPROVIDED) {
            stream = (SubLObject)file_hash_table.T;
        }
        PrintLow.format(stream, (SubLObject)file_hash_table.$str54$__FHT__Stream___A_Lock___A___, file_hash_table_stream(fht), file_hash_table_lock(fht));
        PrintLow.format(stream, (SubLObject)file_hash_table.$str55$_Test___A__, file_hash_table_testfn(fht));
        describe_htfile_header(file_hash_table_header(fht), stream);
        PrintLow.format(stream, (SubLObject)file_hash_table.$str56$_Encoding__Input__A_Output__A_Siz, new SubLObject[] { file_hash_table_encoding_input_fn(fht), file_hash_table_encoding_output_fn(fht), file_hash_table_encoding_size_fn(fht) });
        PrintLow.format(stream, (SubLObject)file_hash_table.$str57$_Key_Encoding__Input__A_Output__A, file_hash_table_encoding_key_input_fn(fht), file_hash_table_encoding_key_output_fn(fht));
        PrintLow.format(stream, (SubLObject)file_hash_table.$str58$_Hashing___A__, file_hash_table_hash_fn(fht));
        PrintLow.format(stream, (SubLObject)file_hash_table.$str59$_Caches__Input__A_Output__A____, file_hash_table_input_cache(fht), file_hash_table_output_cache(fht));
        PrintLow.format(stream, (SubLObject)file_hash_table.$str60$_Properties___A__, file_hash_table_property_list(fht));
        return fht;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 2772L)
    public static SubLObject read_only_file_hash_table_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(file_hash_table.NIL != file_hash_table_p(v_object) && file_hash_table.NIL != file_hash_table_is_read_onlyP(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 2956L)
    public static SubLObject writeable_file_hash_table_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(file_hash_table.NIL != file_hash_table_p(v_object) && file_hash_table.NIL == file_hash_table_is_read_onlyP(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 3147L)
    public static SubLObject file_hash_table_is_read_onlyP(final SubLObject fht) {
        assert file_hash_table.NIL != file_hash_table_p(fht) : fht;
        final SubLObject fht_stream = file_hash_table_stream(fht);
        return (SubLObject)SubLObjectFactory.makeBoolean(file_hash_table.NIL == streams_high.output_stream_p(fht_stream));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 3378L)
    public static SubLObject file_hash_table_path(final SubLObject fht) {
        assert file_hash_table.NIL != file_hash_table_p(fht) : fht;
        return string_utilities.to_string(Filesys.probe_file(file_hash_table_stream(fht)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 3662L)
    public static SubLObject file_hash_table_serialization(final SubLObject fht) {
        assert file_hash_table.NIL != file_hash_table_p(fht) : fht;
        final SubLObject encoding_input_fn = file_hash_table_encoding_input_fn(fht);
        final SubLObject encoding_output_fn = file_hash_table_encoding_output_fn(fht);
        final SubLObject encoding_size_fn = file_hash_table_encoding_size_fn(fht);
        final SubLObject hash_fn = file_hash_table_hash_fn(fht);
        final SubLObject encoding_key_input_fn = file_hash_table_encoding_key_input_fn(fht);
        final SubLObject encoding_key_output_fn = file_hash_table_encoding_key_output_fn(fht);
        return find_fht_serialization_by_functions(encoding_input_fn, encoding_output_fn, encoding_size_fn, hash_fn, encoding_key_input_fn, encoding_key_output_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 4416L)
    public static SubLObject file_hash_table_change_stream_buffer_size(final SubLObject fht, final SubLObject new_stream_buffer_size) {
        final SubLObject lock = file_hash_table_lock(fht);
        SubLObject release = (SubLObject)file_hash_table.NIL;
        try {
            release = Locks.seize_lock(lock);
            _csetf_file_hash_table_stream(fht, file_utilities.change_file_stream_buffer_size(file_hash_table_stream(fht), new_stream_buffer_size));
        }
        finally {
            if (file_hash_table.NIL != release) {
                Locks.release_lock(lock);
            }
        }
        return fht;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 4757L)
    public static SubLObject file_hash_table_enable_memory_mapping(final SubLObject fht) {
        final SubLObject lock = file_hash_table_lock(fht);
        SubLObject release = (SubLObject)file_hash_table.NIL;
        try {
            release = Locks.seize_lock(lock);
            _csetf_file_hash_table_stream(fht, file_utilities.enable_file_stream_memory_mapping(file_hash_table_stream(fht)));
        }
        finally {
            if (file_hash_table.NIL != release) {
                Locks.release_lock(lock);
            }
        }
        return fht;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 4995L)
    public static SubLObject file_hash_table_memory_mappedP(final SubLObject fht) {
        SubLObject result = (SubLObject)file_hash_table.NIL;
        final SubLObject lock = file_hash_table_lock(fht);
        SubLObject release = (SubLObject)file_hash_table.NIL;
        try {
            release = Locks.seize_lock(lock);
            result = file_utilities.file_stream_memory_mappedP(file_hash_table_stream(fht));
        }
        finally {
            if (file_hash_table.NIL != release) {
                Locks.release_lock(lock);
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 5219L)
    public static SubLObject htfile_header_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, (SubLObject)file_hash_table.ZERO_INTEGER);
        return (SubLObject)file_hash_table.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 5219L)
    public static SubLObject htfile_header_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $htfile_header_native.class) ? file_hash_table.T : file_hash_table.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 5219L)
    public static SubLObject htfile_header_size(final SubLObject v_object) {
        assert file_hash_table.NIL != htfile_header_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 5219L)
    public static SubLObject htfile_header_version_major(final SubLObject v_object) {
        assert file_hash_table.NIL != htfile_header_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 5219L)
    public static SubLObject htfile_header_version_minor(final SubLObject v_object) {
        assert file_hash_table.NIL != htfile_header_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 5219L)
    public static SubLObject htfile_header_object_space_offset(final SubLObject v_object) {
        assert file_hash_table.NIL != htfile_header_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 5219L)
    public static SubLObject htfile_header_key_space_offset(final SubLObject v_object) {
        assert file_hash_table.NIL != htfile_header_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 5219L)
    public static SubLObject htfile_header_current_heap_top(final SubLObject v_object) {
        assert file_hash_table.NIL != htfile_header_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 5219L)
    public static SubLObject htfile_header_item_count(final SubLObject v_object) {
        assert file_hash_table.NIL != htfile_header_p(v_object) : v_object;
        return v_object.getField8();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 5219L)
    public static SubLObject htfile_header_capacity(final SubLObject v_object) {
        assert file_hash_table.NIL != htfile_header_p(v_object) : v_object;
        return v_object.getField9();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 5219L)
    public static SubLObject htfile_header_free_list_head(final SubLObject v_object) {
        assert file_hash_table.NIL != htfile_header_p(v_object) : v_object;
        return v_object.getField10();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 5219L)
    public static SubLObject htfile_header_deletion_count(final SubLObject v_object) {
        assert file_hash_table.NIL != htfile_header_p(v_object) : v_object;
        return v_object.getField11();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 5219L)
    public static SubLObject htfile_header_header_crc(final SubLObject v_object) {
        assert file_hash_table.NIL != htfile_header_p(v_object) : v_object;
        return v_object.getField12();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 5219L)
    public static SubLObject htfile_header_extension_space_size(final SubLObject v_object) {
        assert file_hash_table.NIL != htfile_header_p(v_object) : v_object;
        return v_object.getField13();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 5219L)
    public static SubLObject htfile_header_extension_space(final SubLObject v_object) {
        assert file_hash_table.NIL != htfile_header_p(v_object) : v_object;
        return v_object.getField14();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 5219L)
    public static SubLObject _csetf_htfile_header_size(final SubLObject v_object, final SubLObject value) {
        assert file_hash_table.NIL != htfile_header_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 5219L)
    public static SubLObject _csetf_htfile_header_version_major(final SubLObject v_object, final SubLObject value) {
        assert file_hash_table.NIL != htfile_header_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 5219L)
    public static SubLObject _csetf_htfile_header_version_minor(final SubLObject v_object, final SubLObject value) {
        assert file_hash_table.NIL != htfile_header_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 5219L)
    public static SubLObject _csetf_htfile_header_object_space_offset(final SubLObject v_object, final SubLObject value) {
        assert file_hash_table.NIL != htfile_header_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 5219L)
    public static SubLObject _csetf_htfile_header_key_space_offset(final SubLObject v_object, final SubLObject value) {
        assert file_hash_table.NIL != htfile_header_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 5219L)
    public static SubLObject _csetf_htfile_header_current_heap_top(final SubLObject v_object, final SubLObject value) {
        assert file_hash_table.NIL != htfile_header_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 5219L)
    public static SubLObject _csetf_htfile_header_item_count(final SubLObject v_object, final SubLObject value) {
        assert file_hash_table.NIL != htfile_header_p(v_object) : v_object;
        return v_object.setField8(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 5219L)
    public static SubLObject _csetf_htfile_header_capacity(final SubLObject v_object, final SubLObject value) {
        assert file_hash_table.NIL != htfile_header_p(v_object) : v_object;
        return v_object.setField9(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 5219L)
    public static SubLObject _csetf_htfile_header_free_list_head(final SubLObject v_object, final SubLObject value) {
        assert file_hash_table.NIL != htfile_header_p(v_object) : v_object;
        return v_object.setField10(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 5219L)
    public static SubLObject _csetf_htfile_header_deletion_count(final SubLObject v_object, final SubLObject value) {
        assert file_hash_table.NIL != htfile_header_p(v_object) : v_object;
        return v_object.setField11(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 5219L)
    public static SubLObject _csetf_htfile_header_header_crc(final SubLObject v_object, final SubLObject value) {
        assert file_hash_table.NIL != htfile_header_p(v_object) : v_object;
        return v_object.setField12(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 5219L)
    public static SubLObject _csetf_htfile_header_extension_space_size(final SubLObject v_object, final SubLObject value) {
        assert file_hash_table.NIL != htfile_header_p(v_object) : v_object;
        return v_object.setField13(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 5219L)
    public static SubLObject _csetf_htfile_header_extension_space(final SubLObject v_object, final SubLObject value) {
        assert file_hash_table.NIL != htfile_header_p(v_object) : v_object;
        return v_object.setField14(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 5219L)
    public static SubLObject make_htfile_header(SubLObject arglist) {
        if (arglist == file_hash_table.UNPROVIDED) {
            arglist = (SubLObject)file_hash_table.NIL;
        }
        final SubLObject v_new = (SubLObject)new $htfile_header_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)file_hash_table.NIL, next = arglist; file_hash_table.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)file_hash_table.$kw95$SIZE)) {
                _csetf_htfile_header_size(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)file_hash_table.$kw96$VERSION_MAJOR)) {
                _csetf_htfile_header_version_major(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)file_hash_table.$kw97$VERSION_MINOR)) {
                _csetf_htfile_header_version_minor(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)file_hash_table.$kw98$OBJECT_SPACE_OFFSET)) {
                _csetf_htfile_header_object_space_offset(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)file_hash_table.$kw99$KEY_SPACE_OFFSET)) {
                _csetf_htfile_header_key_space_offset(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)file_hash_table.$kw100$CURRENT_HEAP_TOP)) {
                _csetf_htfile_header_current_heap_top(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)file_hash_table.$kw101$ITEM_COUNT)) {
                _csetf_htfile_header_item_count(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)file_hash_table.$kw102$CAPACITY)) {
                _csetf_htfile_header_capacity(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)file_hash_table.$kw103$FREE_LIST_HEAD)) {
                _csetf_htfile_header_free_list_head(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)file_hash_table.$kw104$DELETION_COUNT)) {
                _csetf_htfile_header_deletion_count(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)file_hash_table.$kw105$HEADER_CRC)) {
                _csetf_htfile_header_header_crc(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)file_hash_table.$kw106$EXTENSION_SPACE_SIZE)) {
                _csetf_htfile_header_extension_space_size(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)file_hash_table.$kw107$EXTENSION_SPACE)) {
                _csetf_htfile_header_extension_space(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)file_hash_table.$str48$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 5219L)
    public static SubLObject visit_defstruct_htfile_header(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)file_hash_table.$kw49$BEGIN, (SubLObject)file_hash_table.$sym108$MAKE_HTFILE_HEADER, (SubLObject)file_hash_table.THIRTEEN_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)file_hash_table.$kw51$SLOT, (SubLObject)file_hash_table.$kw95$SIZE, htfile_header_size(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)file_hash_table.$kw51$SLOT, (SubLObject)file_hash_table.$kw96$VERSION_MAJOR, htfile_header_version_major(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)file_hash_table.$kw51$SLOT, (SubLObject)file_hash_table.$kw97$VERSION_MINOR, htfile_header_version_minor(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)file_hash_table.$kw51$SLOT, (SubLObject)file_hash_table.$kw98$OBJECT_SPACE_OFFSET, htfile_header_object_space_offset(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)file_hash_table.$kw51$SLOT, (SubLObject)file_hash_table.$kw99$KEY_SPACE_OFFSET, htfile_header_key_space_offset(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)file_hash_table.$kw51$SLOT, (SubLObject)file_hash_table.$kw100$CURRENT_HEAP_TOP, htfile_header_current_heap_top(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)file_hash_table.$kw51$SLOT, (SubLObject)file_hash_table.$kw101$ITEM_COUNT, htfile_header_item_count(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)file_hash_table.$kw51$SLOT, (SubLObject)file_hash_table.$kw102$CAPACITY, htfile_header_capacity(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)file_hash_table.$kw51$SLOT, (SubLObject)file_hash_table.$kw103$FREE_LIST_HEAD, htfile_header_free_list_head(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)file_hash_table.$kw51$SLOT, (SubLObject)file_hash_table.$kw104$DELETION_COUNT, htfile_header_deletion_count(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)file_hash_table.$kw51$SLOT, (SubLObject)file_hash_table.$kw105$HEADER_CRC, htfile_header_header_crc(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)file_hash_table.$kw51$SLOT, (SubLObject)file_hash_table.$kw106$EXTENSION_SPACE_SIZE, htfile_header_extension_space_size(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)file_hash_table.$kw51$SLOT, (SubLObject)file_hash_table.$kw107$EXTENSION_SPACE, htfile_header_extension_space(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)file_hash_table.$kw52$END, (SubLObject)file_hash_table.$sym108$MAKE_HTFILE_HEADER, (SubLObject)file_hash_table.THIRTEEN_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 5219L)
    public static SubLObject visit_defstruct_object_htfile_header_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_htfile_header(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 5526L)
    public static SubLObject describe_htfile_header(final SubLObject htfhdr, SubLObject stream) {
        if (stream == file_hash_table.UNPROVIDED) {
            stream = (SubLObject)file_hash_table.T;
        }
        PrintLow.format(stream, (SubLObject)file_hash_table.$str110$__HTFile_Header__Size__A_Format_V, new SubLObject[] { htfile_header_size(htfhdr), htfile_header_version_major(htfhdr), htfile_header_version_minor(htfhdr) });
        PrintLow.format(stream, (SubLObject)file_hash_table.$str111$_ObjSpace_Offset__0x_X___D___KeyS, new SubLObject[] { htfile_header_object_space_offset(htfhdr), htfile_header_object_space_offset(htfhdr), htfile_header_key_space_offset(htfhdr), htfile_header_key_space_offset(htfhdr), htfile_header_current_heap_top(htfhdr), htfile_header_current_heap_top(htfhdr) });
        PrintLow.format(stream, (SubLObject)file_hash_table.$str112$_Item_Count___A__Capacity___A__, htfile_header_item_count(htfhdr), htfile_header_capacity(htfhdr));
        if (file_hash_table.NIL != htfile_header_free_list_head(htfhdr)) {
            PrintLow.format(stream, (SubLObject)file_hash_table.$str113$_FreeListHead___A_, htfile_header_free_list_head(htfhdr));
        }
        else {
            streams_high.write_string((SubLObject)file_hash_table.$str114$_no_free_list_, stream, (SubLObject)file_hash_table.UNPROVIDED, (SubLObject)file_hash_table.UNPROVIDED);
        }
        if (file_hash_table.NIL != htfile_header_deletion_count(htfhdr)) {
            PrintLow.format(stream, (SubLObject)file_hash_table.$str115$_Deletions___A_, htfile_header_deletion_count(htfhdr));
        }
        else {
            streams_high.write_string((SubLObject)file_hash_table.$str116$_no_deletions_, stream, (SubLObject)file_hash_table.UNPROVIDED, (SubLObject)file_hash_table.UNPROVIDED);
        }
        if (file_hash_table.NIL != htfile_header_header_crc(htfhdr)) {
            PrintLow.format(stream, (SubLObject)file_hash_table.$str117$_CRC___A_, htfile_header_header_crc(htfhdr));
        }
        else {
            streams_high.write_string((SubLObject)file_hash_table.$str118$_no_CRC_support_, stream, (SubLObject)file_hash_table.UNPROVIDED, (SubLObject)file_hash_table.UNPROVIDED);
        }
        streams_high.terpri(stream);
        PrintLow.format(stream, (SubLObject)file_hash_table.$str119$_Extension_Space____A____A____, htfile_header_extension_space_size(htfhdr), htfile_header_extension_space(htfhdr));
        streams_high.write_string((SubLObject)file_hash_table.$str120$__, stream, (SubLObject)file_hash_table.UNPROVIDED, (SubLObject)file_hash_table.UNPROVIDED);
        return htfhdr;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 7154L)
    public static SubLObject htfile_object_entry_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, (SubLObject)file_hash_table.ZERO_INTEGER);
        return (SubLObject)file_hash_table.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 7154L)
    public static SubLObject htfile_object_entry_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $htfile_object_entry_native.class) ? file_hash_table.T : file_hash_table.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 7154L)
    public static SubLObject htfile_object_entry_size(final SubLObject v_object) {
        assert file_hash_table.NIL != htfile_object_entry_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 7154L)
    public static SubLObject htfile_object_entry_type(final SubLObject v_object) {
        assert file_hash_table.NIL != htfile_object_entry_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 7154L)
    public static SubLObject htfile_object_entry_key_size(final SubLObject v_object) {
        assert file_hash_table.NIL != htfile_object_entry_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 7154L)
    public static SubLObject htfile_object_entry_key(final SubLObject v_object) {
        assert file_hash_table.NIL != htfile_object_entry_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 7154L)
    public static SubLObject htfile_object_entry_data_size(final SubLObject v_object) {
        assert file_hash_table.NIL != htfile_object_entry_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 7154L)
    public static SubLObject htfile_object_entry_data(final SubLObject v_object) {
        assert file_hash_table.NIL != htfile_object_entry_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 7154L)
    public static SubLObject _csetf_htfile_object_entry_size(final SubLObject v_object, final SubLObject value) {
        assert file_hash_table.NIL != htfile_object_entry_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 7154L)
    public static SubLObject _csetf_htfile_object_entry_type(final SubLObject v_object, final SubLObject value) {
        assert file_hash_table.NIL != htfile_object_entry_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 7154L)
    public static SubLObject _csetf_htfile_object_entry_key_size(final SubLObject v_object, final SubLObject value) {
        assert file_hash_table.NIL != htfile_object_entry_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 7154L)
    public static SubLObject _csetf_htfile_object_entry_key(final SubLObject v_object, final SubLObject value) {
        assert file_hash_table.NIL != htfile_object_entry_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 7154L)
    public static SubLObject _csetf_htfile_object_entry_data_size(final SubLObject v_object, final SubLObject value) {
        assert file_hash_table.NIL != htfile_object_entry_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 7154L)
    public static SubLObject _csetf_htfile_object_entry_data(final SubLObject v_object, final SubLObject value) {
        assert file_hash_table.NIL != htfile_object_entry_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 7154L)
    public static SubLObject make_htfile_object_entry(SubLObject arglist) {
        if (arglist == file_hash_table.UNPROVIDED) {
            arglist = (SubLObject)file_hash_table.NIL;
        }
        final SubLObject v_new = (SubLObject)new $htfile_object_entry_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)file_hash_table.NIL, next = arglist; file_hash_table.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)file_hash_table.$kw95$SIZE)) {
                _csetf_htfile_object_entry_size(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)file_hash_table.$kw141$TYPE)) {
                _csetf_htfile_object_entry_type(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)file_hash_table.$kw142$KEY_SIZE)) {
                _csetf_htfile_object_entry_key_size(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)file_hash_table.$kw143$KEY)) {
                _csetf_htfile_object_entry_key(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)file_hash_table.$kw144$DATA_SIZE)) {
                _csetf_htfile_object_entry_data_size(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)file_hash_table.$kw145$DATA)) {
                _csetf_htfile_object_entry_data(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)file_hash_table.$str48$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 7154L)
    public static SubLObject visit_defstruct_htfile_object_entry(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)file_hash_table.$kw49$BEGIN, (SubLObject)file_hash_table.$sym146$MAKE_HTFILE_OBJECT_ENTRY, (SubLObject)file_hash_table.SIX_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)file_hash_table.$kw51$SLOT, (SubLObject)file_hash_table.$kw95$SIZE, htfile_object_entry_size(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)file_hash_table.$kw51$SLOT, (SubLObject)file_hash_table.$kw141$TYPE, htfile_object_entry_type(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)file_hash_table.$kw51$SLOT, (SubLObject)file_hash_table.$kw142$KEY_SIZE, htfile_object_entry_key_size(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)file_hash_table.$kw51$SLOT, (SubLObject)file_hash_table.$kw143$KEY, htfile_object_entry_key(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)file_hash_table.$kw51$SLOT, (SubLObject)file_hash_table.$kw144$DATA_SIZE, htfile_object_entry_data_size(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)file_hash_table.$kw51$SLOT, (SubLObject)file_hash_table.$kw145$DATA, htfile_object_entry_data(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)file_hash_table.$kw52$END, (SubLObject)file_hash_table.$sym146$MAKE_HTFILE_OBJECT_ENTRY, (SubLObject)file_hash_table.SIX_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 7154L)
    public static SubLObject visit_defstruct_object_htfile_object_entry_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_htfile_object_entry(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 7251L)
    public static SubLObject htfile_key_entry_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, (SubLObject)file_hash_table.ZERO_INTEGER);
        return (SubLObject)file_hash_table.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 7251L)
    public static SubLObject htfile_key_entry_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $htfile_key_entry_native.class) ? file_hash_table.T : file_hash_table.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 7251L)
    public static SubLObject htfile_key_entry_key_offset(final SubLObject v_object) {
        assert file_hash_table.NIL != htfile_key_entry_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 7251L)
    public static SubLObject htfile_key_entry_hash_code(final SubLObject v_object) {
        assert file_hash_table.NIL != htfile_key_entry_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 7251L)
    public static SubLObject _csetf_htfile_key_entry_key_offset(final SubLObject v_object, final SubLObject value) {
        assert file_hash_table.NIL != htfile_key_entry_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 7251L)
    public static SubLObject _csetf_htfile_key_entry_hash_code(final SubLObject v_object, final SubLObject value) {
        assert file_hash_table.NIL != htfile_key_entry_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 7251L)
    public static SubLObject make_htfile_key_entry(SubLObject arglist) {
        if (arglist == file_hash_table.UNPROVIDED) {
            arglist = (SubLObject)file_hash_table.NIL;
        }
        final SubLObject v_new = (SubLObject)new $htfile_key_entry_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)file_hash_table.NIL, next = arglist; file_hash_table.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)file_hash_table.$kw160$KEY_OFFSET)) {
                _csetf_htfile_key_entry_key_offset(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)file_hash_table.$kw161$HASH_CODE)) {
                _csetf_htfile_key_entry_hash_code(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)file_hash_table.$str48$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 7251L)
    public static SubLObject visit_defstruct_htfile_key_entry(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)file_hash_table.$kw49$BEGIN, (SubLObject)file_hash_table.$sym162$MAKE_HTFILE_KEY_ENTRY, (SubLObject)file_hash_table.TWO_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)file_hash_table.$kw51$SLOT, (SubLObject)file_hash_table.$kw160$KEY_OFFSET, htfile_key_entry_key_offset(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)file_hash_table.$kw51$SLOT, (SubLObject)file_hash_table.$kw161$HASH_CODE, htfile_key_entry_hash_code(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)file_hash_table.$kw52$END, (SubLObject)file_hash_table.$sym162$MAKE_HTFILE_KEY_ENTRY, (SubLObject)file_hash_table.TWO_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 7251L)
    public static SubLObject visit_defstruct_object_htfile_key_entry_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_htfile_key_entry(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 7936L)
    public static SubLObject get_default_fht_test_function() {
        return file_hash_table.$default_fht_test_function$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 8025L)
    public static SubLObject get_default_fht_serialization_protocol() {
        return file_hash_table.$default_fht_serialization_protocol$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 8572L)
    public static SubLObject new_htfile_header() {
        final SubLObject header = make_htfile_header((SubLObject)file_hash_table.UNPROVIDED);
        _csetf_htfile_header_version_major(header, file_hash_table.$htfile_header_current_vmajor$.getGlobalValue());
        _csetf_htfile_header_version_minor(header, file_hash_table.$htfile_header_current_vminor$.getGlobalValue());
        return header;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 9005L)
    public static SubLObject construct_empty_htfile_header(final SubLObject expected_items, SubLObject avg_size) {
        if (avg_size == file_hash_table.UNPROVIDED) {
            avg_size = file_hash_table.$htfile_default_average_size$.getGlobalValue();
        }
        final SubLObject avg_implementation_size = htfile_scale_user_space_to_implementation_space(avg_size);
        final SubLObject header = new_htfile_header();
        _csetf_htfile_header_size(header, file_hash_table.$htfile_header_current_size$.getGlobalValue());
        _csetf_htfile_header_item_count(header, (SubLObject)file_hash_table.ZERO_INTEGER);
        _csetf_htfile_header_capacity(header, fht_ensure_hash_table_size(expected_items));
        _csetf_htfile_header_free_list_head(header, (SubLObject)file_hash_table.ZERO_INTEGER);
        _csetf_htfile_header_deletion_count(header, (SubLObject)file_hash_table.ZERO_INTEGER);
        _csetf_htfile_header_header_crc(header, (SubLObject)file_hash_table.ZERO_INTEGER);
        _csetf_htfile_header_extension_space_size(header, (SubLObject)file_hash_table.ZERO_INTEGER);
        _csetf_htfile_header_extension_space(header, (SubLObject)file_hash_table.ZERO_INTEGER);
        SubLObject size = file_hash_table.$htfile_header_current_size$.getGlobalValue();
        final SubLObject heap_space = Numbers.multiply(expected_items, avg_implementation_size);
        size = Numbers.add(size, htfile_header_extension_space_size(header));
        _csetf_htfile_header_object_space_offset(header, size);
        _csetf_htfile_header_current_heap_top(header, size);
        _csetf_htfile_header_key_space_offset(header, Numbers.add(size, heap_space));
        return header;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 10171L)
    public static SubLObject htfile_scale_user_space_to_implementation_space(final SubLObject avg_size) {
        return Numbers.add(htfile_minimal_space_required(), avg_size);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 10303L)
    public static SubLObject htfile_minimal_space_required() {
        return Numbers.add(htfile_minimal_space_required_for_key(), htfile_minimal_space_required_for_object());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 10461L)
    public static SubLObject new_file_hash_table(final SubLObject encoding_input_fn, final SubLObject encoding_output_fn, final SubLObject encoding_size_fn, final SubLObject encoding_key_input_fn, final SubLObject encoding_key_output_fn, SubLObject cachedP, SubLObject testfn, SubLObject hash_fn) {
        if (cachedP == file_hash_table.UNPROVIDED) {
            cachedP = file_hash_table.$fht_min_cache_capacity$.getDynamicValue();
        }
        if (testfn == file_hash_table.UNPROVIDED) {
            testfn = file_hash_table.$default_fht_test_function$.getGlobalValue();
        }
        if (hash_fn == file_hash_table.UNPROVIDED) {
            hash_fn = (SubLObject)file_hash_table.$sym168$SXHASH;
        }
        final SubLObject fht = make_file_hash_table((SubLObject)file_hash_table.UNPROVIDED);
        _csetf_file_hash_table_stream(fht, (SubLObject)file_hash_table.NIL);
        _csetf_file_hash_table_header(fht, (SubLObject)file_hash_table.NIL);
        _csetf_file_hash_table_lock(fht, Locks.make_lock((SubLObject)file_hash_table.$str169$File_Hash_Table_Lock));
        _csetf_file_hash_table_encoding_input_fn(fht, encoding_input_fn);
        _csetf_file_hash_table_encoding_output_fn(fht, encoding_output_fn);
        _csetf_file_hash_table_encoding_size_fn(fht, encoding_size_fn);
        _csetf_file_hash_table_testfn(fht, testfn);
        _csetf_file_hash_table_hash_fn(fht, hash_fn);
        _csetf_file_hash_table_encoding_key_input_fn(fht, encoding_key_input_fn);
        _csetf_file_hash_table_encoding_key_output_fn(fht, encoding_key_output_fn);
        if (file_hash_table.NIL != cachedP) {
            allocate_file_hash_table_caches(fht, cachedP);
        }
        return fht;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 11707L)
    public static SubLObject new_empty_file_hash_table(final SubLObject size, final SubLObject encoding_input_fn, final SubLObject encoding_output_fn, final SubLObject encoding_size_fn, final SubLObject encoding_key_input_fn, final SubLObject encoding_key_output_fn, SubLObject cachedP, SubLObject avg_size, SubLObject testfn, SubLObject hash_fn) {
        if (cachedP == file_hash_table.UNPROVIDED) {
            cachedP = file_hash_table.$fht_min_cache_capacity$.getDynamicValue();
        }
        if (avg_size == file_hash_table.UNPROVIDED) {
            avg_size = file_hash_table.$htfile_default_average_size$.getGlobalValue();
        }
        if (testfn == file_hash_table.UNPROVIDED) {
            testfn = file_hash_table.$default_fht_test_function$.getGlobalValue();
        }
        if (hash_fn == file_hash_table.UNPROVIDED) {
            hash_fn = (SubLObject)file_hash_table.$sym168$SXHASH;
        }
        final SubLObject fht = new_file_hash_table(encoding_input_fn, encoding_output_fn, encoding_size_fn, encoding_key_input_fn, encoding_key_output_fn, cachedP, testfn, hash_fn);
        _csetf_file_hash_table_header(fht, construct_empty_htfile_header(size, avg_size));
        return fht;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 13009L)
    public static SubLObject new_htfile_key_entry(final SubLObject code, SubLObject offset) {
        if (offset == file_hash_table.UNPROVIDED) {
            offset = (SubLObject)file_hash_table.ZERO_INTEGER;
        }
        final SubLObject entry = make_htfile_key_entry((SubLObject)file_hash_table.UNPROVIDED);
        _csetf_htfile_key_entry_key_offset(entry, offset);
        _csetf_htfile_key_entry_hash_code(entry, code);
        return entry;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 13243L)
    public static SubLObject construct_tombstone_key_entry() {
        return new_htfile_key_entry(file_hash_table.$fht_invalid_hash_code$.getGlobalValue(), file_hash_table.$fht_tombstone_offset_marker$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 13459L)
    public static SubLObject is_tombstoned_key_entryP(final SubLObject entry) {
        return Equality.equalp(entry, file_hash_table.$fht_tombstone_key_entry$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 13559L)
    public static SubLObject construct_empty_key_entry() {
        return new_htfile_key_entry(file_hash_table.$fht_invalid_hash_code$.getGlobalValue(), file_hash_table.$fht_empty_offset_marker$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 13759L)
    public static SubLObject is_empty_key_entryP(final SubLObject entry) {
        return Equality.equalp(entry, file_hash_table.$fht_empty_key_entry$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 13850L)
    public static SubLObject is_valid_key_entryP(final SubLObject entry, final SubLObject fht) {
        return (SubLObject)SubLObjectFactory.makeBoolean(file_hash_table.NIL != is_empty_key_entryP(entry) || (file_hash_table.NIL != valid_hash_code_p(htfile_key_entry_hash_code(entry)) && file_hash_table.NIL != valid_fht_heap_offset_p(htfile_key_entry_key_offset(entry), fht)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 14100L)
    public static SubLObject fht_sxhash_for_fht(final SubLObject fht, final SubLObject entity) {
        final SubLObject hash_fn = file_hash_table_hash_fn(fht);
        return fht_sxhash(entity, hash_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 14242L)
    public static SubLObject fht_sxhash(final SubLObject entity, final SubLObject hash_fn) {
        final SubLObject code = Numbers.abs(Functions.funcall(hash_fn, entity));
        if (file_hash_table.NIL == valid_hash_code_p(code)) {
            Errors.warn((SubLObject)file_hash_table.$str170$Sorry___A_hashed_to__A__which_is_, entity, code);
        }
        return code;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 14618L)
    public static SubLObject valid_hash_code_p(final SubLObject code) {
        return (SubLObject)SubLObjectFactory.makeBoolean(file_hash_table.NIL != subl_promotions.non_negative_integer_p(code) && code.numL(file_hash_table.$max_fht_hash_code_value$.getGlobalValue()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 14754L)
    public static SubLObject new_object_entry(final SubLObject key, final SubLObject v_object) {
        final SubLObject object_entry = make_htfile_object_entry((SubLObject)file_hash_table.UNPROVIDED);
        _csetf_htfile_object_entry_key(object_entry, key);
        _csetf_htfile_object_entry_data(object_entry, v_object);
        return object_entry;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 15407L)
    public static SubLObject fht_serialization_entry_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_fht_serialization_entry(v_object, stream, (SubLObject)file_hash_table.ZERO_INTEGER);
        return (SubLObject)file_hash_table.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 15407L)
    public static SubLObject fht_serialization_entry_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $fht_serialization_entry_native.class) ? file_hash_table.T : file_hash_table.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 15407L)
    public static SubLObject fht_se_encoding_input_fn(final SubLObject v_object) {
        assert file_hash_table.NIL != fht_serialization_entry_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 15407L)
    public static SubLObject fht_se_encoding_output_fn(final SubLObject v_object) {
        assert file_hash_table.NIL != fht_serialization_entry_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 15407L)
    public static SubLObject fht_se_encoding_size_fn(final SubLObject v_object) {
        assert file_hash_table.NIL != fht_serialization_entry_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 15407L)
    public static SubLObject fht_se_hash_fn(final SubLObject v_object) {
        assert file_hash_table.NIL != fht_serialization_entry_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 15407L)
    public static SubLObject fht_se_encoding_key_input_fn(final SubLObject v_object) {
        assert file_hash_table.NIL != fht_serialization_entry_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 15407L)
    public static SubLObject fht_se_encoding_key_output_fn(final SubLObject v_object) {
        assert file_hash_table.NIL != fht_serialization_entry_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 15407L)
    public static SubLObject _csetf_fht_se_encoding_input_fn(final SubLObject v_object, final SubLObject value) {
        assert file_hash_table.NIL != fht_serialization_entry_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 15407L)
    public static SubLObject _csetf_fht_se_encoding_output_fn(final SubLObject v_object, final SubLObject value) {
        assert file_hash_table.NIL != fht_serialization_entry_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 15407L)
    public static SubLObject _csetf_fht_se_encoding_size_fn(final SubLObject v_object, final SubLObject value) {
        assert file_hash_table.NIL != fht_serialization_entry_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 15407L)
    public static SubLObject _csetf_fht_se_hash_fn(final SubLObject v_object, final SubLObject value) {
        assert file_hash_table.NIL != fht_serialization_entry_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 15407L)
    public static SubLObject _csetf_fht_se_encoding_key_input_fn(final SubLObject v_object, final SubLObject value) {
        assert file_hash_table.NIL != fht_serialization_entry_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 15407L)
    public static SubLObject _csetf_fht_se_encoding_key_output_fn(final SubLObject v_object, final SubLObject value) {
        assert file_hash_table.NIL != fht_serialization_entry_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 15407L)
    public static SubLObject make_fht_serialization_entry(SubLObject arglist) {
        if (arglist == file_hash_table.UNPROVIDED) {
            arglist = (SubLObject)file_hash_table.NIL;
        }
        final SubLObject v_new = (SubLObject)new $fht_serialization_entry_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)file_hash_table.NIL, next = arglist; file_hash_table.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)file_hash_table.$kw38$ENCODING_INPUT_FN)) {
                _csetf_fht_se_encoding_input_fn(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)file_hash_table.$kw39$ENCODING_OUTPUT_FN)) {
                _csetf_fht_se_encoding_output_fn(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)file_hash_table.$kw40$ENCODING_SIZE_FN)) {
                _csetf_fht_se_encoding_size_fn(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)file_hash_table.$kw44$HASH_FN)) {
                _csetf_fht_se_hash_fn(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)file_hash_table.$kw41$ENCODING_KEY_INPUT_FN)) {
                _csetf_fht_se_encoding_key_input_fn(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)file_hash_table.$kw42$ENCODING_KEY_OUTPUT_FN)) {
                _csetf_fht_se_encoding_key_output_fn(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)file_hash_table.$str48$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 15407L)
    public static SubLObject visit_defstruct_fht_serialization_entry(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)file_hash_table.$kw49$BEGIN, (SubLObject)file_hash_table.$sym193$MAKE_FHT_SERIALIZATION_ENTRY, (SubLObject)file_hash_table.SIX_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)file_hash_table.$kw51$SLOT, (SubLObject)file_hash_table.$kw38$ENCODING_INPUT_FN, fht_se_encoding_input_fn(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)file_hash_table.$kw51$SLOT, (SubLObject)file_hash_table.$kw39$ENCODING_OUTPUT_FN, fht_se_encoding_output_fn(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)file_hash_table.$kw51$SLOT, (SubLObject)file_hash_table.$kw40$ENCODING_SIZE_FN, fht_se_encoding_size_fn(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)file_hash_table.$kw51$SLOT, (SubLObject)file_hash_table.$kw44$HASH_FN, fht_se_hash_fn(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)file_hash_table.$kw51$SLOT, (SubLObject)file_hash_table.$kw41$ENCODING_KEY_INPUT_FN, fht_se_encoding_key_input_fn(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)file_hash_table.$kw51$SLOT, (SubLObject)file_hash_table.$kw42$ENCODING_KEY_OUTPUT_FN, fht_se_encoding_key_output_fn(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)file_hash_table.$kw52$END, (SubLObject)file_hash_table.$sym193$MAKE_FHT_SERIALIZATION_ENTRY, (SubLObject)file_hash_table.SIX_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 15407L)
    public static SubLObject visit_defstruct_object_fht_serialization_entry_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_fht_serialization_entry(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 15647L)
    public static SubLObject print_fht_serialization_entry(final SubLObject serialization_entry, final SubLObject stream, final SubLObject depth) {
        PrintLow.format(stream, (SubLObject)file_hash_table.$str195$__FHT_Serialization__Input_Fn____, fht_se_encoding_input_fn(serialization_entry));
        PrintLow.format(stream, (SubLObject)file_hash_table.$str196$_____________________Output_Fn___, fht_se_encoding_output_fn(serialization_entry));
        PrintLow.format(stream, (SubLObject)file_hash_table.$str197$_____________________Size_Fn_____, fht_se_encoding_size_fn(serialization_entry));
        PrintLow.format(stream, (SubLObject)file_hash_table.$str198$_____________________Hash_Fn_____, fht_se_hash_fn(serialization_entry));
        if (file_hash_table.IDENTITY != fht_se_encoding_key_input_fn(serialization_entry) && !Symbols.symbol_function((SubLObject)file_hash_table.IDENTITY).eql(fht_se_encoding_key_input_fn(serialization_entry))) {
            PrintLow.format(stream, (SubLObject)file_hash_table.$str199$_____________________Key_Input___, fht_se_encoding_key_input_fn(serialization_entry));
        }
        if (file_hash_table.IDENTITY != fht_se_encoding_key_output_fn(serialization_entry) && !Symbols.symbol_function((SubLObject)file_hash_table.IDENTITY).eql(fht_se_encoding_key_output_fn(serialization_entry))) {
            PrintLow.format(stream, (SubLObject)file_hash_table.$str200$_____________________Key_Output__, fht_se_encoding_key_output_fn(serialization_entry));
        }
        streams_high.write_string((SubLObject)file_hash_table.$str201$_, stream, (SubLObject)file_hash_table.UNPROVIDED, (SubLObject)file_hash_table.UNPROVIDED);
        return serialization_entry;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 16782L)
    public static SubLObject new_fht_serialization_entry(final SubLObject plist) {
        final SubLObject serialization_entry = make_fht_serialization_entry((SubLObject)file_hash_table.UNPROVIDED);
        final SubLObject input_fn = conses_high.getf(plist, (SubLObject)file_hash_table.$kw38$ENCODING_INPUT_FN, (SubLObject)file_hash_table.UNPROVIDED);
        final SubLObject output_fn = conses_high.getf(plist, (SubLObject)file_hash_table.$kw39$ENCODING_OUTPUT_FN, (SubLObject)file_hash_table.UNPROVIDED);
        final SubLObject size_fn = conses_high.getf(plist, (SubLObject)file_hash_table.$kw40$ENCODING_SIZE_FN, (SubLObject)file_hash_table.UNPROVIDED);
        final SubLObject hash_fn = conses_high.getf(plist, (SubLObject)file_hash_table.$kw44$HASH_FN, (SubLObject)file_hash_table.UNPROVIDED);
        final SubLObject key_input_fn = conses_high.getf(plist, (SubLObject)file_hash_table.$kw41$ENCODING_KEY_INPUT_FN, (SubLObject)file_hash_table.IDENTITY);
        final SubLObject key_output_fn = conses_high.getf(plist, (SubLObject)file_hash_table.$kw42$ENCODING_KEY_OUTPUT_FN, (SubLObject)file_hash_table.IDENTITY);
        _csetf_fht_se_encoding_input_fn(serialization_entry, input_fn);
        _csetf_fht_se_encoding_output_fn(serialization_entry, output_fn);
        _csetf_fht_se_encoding_size_fn(serialization_entry, size_fn);
        _csetf_fht_se_hash_fn(serialization_entry, hash_fn);
        _csetf_fht_se_encoding_key_input_fn(serialization_entry, key_input_fn);
        _csetf_fht_se_encoding_key_output_fn(serialization_entry, key_output_fn);
        return serialization_entry;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 17721L)
    public static SubLObject register_fht_serialization_entry(final SubLObject serialization, final SubLObject plist) {
        final SubLObject serialization_entry = new_fht_serialization_entry(plist);
        dictionary.dictionary_enter(file_hash_table.$fht_serialization_table$.getGlobalValue(), serialization, serialization_entry);
        return serialization_entry;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 17978L)
    public static SubLObject fht_serialization_entry(final SubLObject serialization) {
        return dictionary.dictionary_lookup(file_hash_table.$fht_serialization_table$.getGlobalValue(), serialization, (SubLObject)file_hash_table.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 18104L)
    public static SubLObject fht_serialization_encoding_input_fn(final SubLObject serialization) {
        final SubLObject serialization_entry = fht_serialization_entry(serialization);
        if (file_hash_table.NIL != fht_serialization_entry_p(serialization_entry)) {
            return fht_se_encoding_input_fn(serialization_entry);
        }
        return (SubLObject)file_hash_table.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 18366L)
    public static SubLObject fht_serialization_encoding_output_fn(final SubLObject serialization) {
        final SubLObject serialization_entry = fht_serialization_entry(serialization);
        if (file_hash_table.NIL != fht_serialization_entry_p(serialization_entry)) {
            return fht_se_encoding_output_fn(serialization_entry);
        }
        return (SubLObject)file_hash_table.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 18630L)
    public static SubLObject fht_serialization_encoding_size_fn(final SubLObject serialization) {
        final SubLObject serialization_entry = fht_serialization_entry(serialization);
        if (file_hash_table.NIL != fht_serialization_entry_p(serialization_entry)) {
            return fht_se_encoding_size_fn(serialization_entry);
        }
        return (SubLObject)file_hash_table.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 18890L)
    public static SubLObject fht_serialization_hash_fn(final SubLObject serialization) {
        final SubLObject serialization_entry = fht_serialization_entry(serialization);
        if (file_hash_table.NIL != fht_serialization_entry_p(serialization_entry)) {
            return fht_se_hash_fn(serialization_entry);
        }
        return (SubLObject)file_hash_table.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 19132L)
    public static SubLObject fht_serialization_encoding_key_input_fn(final SubLObject serialization) {
        final SubLObject serialization_entry = fht_serialization_entry(serialization);
        if (file_hash_table.NIL != fht_serialization_entry_p(serialization_entry)) {
            return fht_se_encoding_key_input_fn(serialization_entry);
        }
        return (SubLObject)file_hash_table.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 19402L)
    public static SubLObject fht_serialization_encoding_key_output_fn(final SubLObject serialization) {
        final SubLObject serialization_entry = fht_serialization_entry(serialization);
        if (file_hash_table.NIL != fht_serialization_entry_p(serialization_entry)) {
            return fht_se_encoding_key_output_fn(serialization_entry);
        }
        return (SubLObject)file_hash_table.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 19674L)
    public static SubLObject do_fht_serializations(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_hash_table.$list203);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject serialization = (SubLObject)file_hash_table.NIL;
        SubLObject serialization_entry = (SubLObject)file_hash_table.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_hash_table.$list203);
        serialization = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_hash_table.$list203);
        serialization_entry = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)file_hash_table.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)file_hash_table.NIL;
        SubLObject current_$1 = (SubLObject)file_hash_table.NIL;
        while (file_hash_table.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)file_hash_table.$list203);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)file_hash_table.$list203);
            if (file_hash_table.NIL == conses_high.member(current_$1, (SubLObject)file_hash_table.$list204, (SubLObject)file_hash_table.UNPROVIDED, (SubLObject)file_hash_table.UNPROVIDED)) {
                bad = (SubLObject)file_hash_table.T;
            }
            if (current_$1 == file_hash_table.$kw205$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (file_hash_table.NIL != bad && file_hash_table.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)file_hash_table.$list203);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)file_hash_table.$kw206$DONE, current);
        final SubLObject done = (SubLObject)((file_hash_table.NIL != done_tail) ? conses_high.cadr(done_tail) : file_hash_table.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.listS((SubLObject)file_hash_table.$sym207$DO_DICTIONARY, (SubLObject)ConsesLow.list(serialization, serialization_entry, (SubLObject)file_hash_table.$sym202$_FHT_SERIALIZATION_TABLE_, done), ConsesLow.append(body, (SubLObject)file_hash_table.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 19880L)
    public static SubLObject find_fht_serialization_by_functions(final SubLObject encoding_input_fn, final SubLObject encoding_output_fn, final SubLObject encoding_size_fn, final SubLObject hash_fn, SubLObject encoding_key_input_fn, SubLObject encoding_key_output_fn) {
        if (encoding_key_input_fn == file_hash_table.UNPROVIDED) {
            encoding_key_input_fn = (SubLObject)file_hash_table.IDENTITY;
        }
        if (encoding_key_output_fn == file_hash_table.UNPROVIDED) {
            encoding_key_output_fn = (SubLObject)file_hash_table.IDENTITY;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject matching_serialization;
        SubLObject iteration_state;
        for (matching_serialization = (SubLObject)file_hash_table.NIL, iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(file_hash_table.$fht_serialization_table$.getGlobalValue())); file_hash_table.NIL == matching_serialization && file_hash_table.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject serialization = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject serialization_entry = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (encoding_input_fn.eql(fht_se_encoding_input_fn(serialization_entry)) && encoding_output_fn.eql(fht_se_encoding_output_fn(serialization_entry)) && encoding_size_fn.eql(fht_se_encoding_size_fn(serialization_entry)) && hash_fn.eql(fht_se_hash_fn(serialization_entry)) && encoding_key_input_fn.eql(fht_se_encoding_key_input_fn(serialization_entry)) && encoding_key_output_fn.eql(fht_se_encoding_key_output_fn(serialization_entry))) {
                matching_serialization = serialization;
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return matching_serialization;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 22100L)
    public static SubLObject log_fht_lookup(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject format_string = (SubLObject)file_hash_table.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_hash_table.$list213);
        format_string = current.first();
        final SubLObject args;
        current = (args = current.rest());
        return (SubLObject)ConsesLow.list((SubLObject)file_hash_table.$sym214$PUNLESS, (SubLObject)file_hash_table.$list215, (SubLObject)ConsesLow.listS((SubLObject)file_hash_table.$sym216$FORMAT, (SubLObject)file_hash_table.$sym217$_FHT_LOOKUP_STREAM_, format_string, ConsesLow.append(args, (SubLObject)file_hash_table.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 22271L)
    public static SubLObject create_file_hash_table(final SubLObject filename, final SubLObject size, SubLObject avg_size, SubLObject testfn, SubLObject serialization) {
        if (avg_size == file_hash_table.UNPROVIDED) {
            avg_size = file_hash_table.$htfile_default_average_size$.getGlobalValue();
        }
        if (testfn == file_hash_table.UNPROVIDED) {
            testfn = file_hash_table.$default_fht_test_function$.getGlobalValue();
        }
        if (serialization == file_hash_table.UNPROVIDED) {
            serialization = file_hash_table.$default_fht_serialization_protocol$.getGlobalValue();
        }
        final SubLObject fht = new_empty_file_hash_table(size, fht_serialization_encoding_input_fn(serialization), fht_serialization_encoding_output_fn(serialization), fht_serialization_encoding_size_fn(serialization), fht_serialization_encoding_key_input_fn(serialization), fht_serialization_encoding_key_output_fn(serialization), compute_fht_cache_capacity(size), avg_size, testfn, fht_serialization_hash_fn(serialization));
        _csetf_file_hash_table_stream(fht, compatibility.open_binary(filename, (SubLObject)file_hash_table.$kw218$IO));
        write_initial_table(fht);
        return fht;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 23244L)
    public static SubLObject open_file_hash_table(final SubLObject filename, SubLObject testfn, SubLObject serialization) {
        if (testfn == file_hash_table.UNPROVIDED) {
            testfn = file_hash_table.$default_fht_test_function$.getGlobalValue();
        }
        if (serialization == file_hash_table.UNPROVIDED) {
            serialization = file_hash_table.$default_fht_serialization_protocol$.getGlobalValue();
        }
        final SubLObject fht = new_file_hash_table(fht_serialization_encoding_input_fn(serialization), fht_serialization_encoding_output_fn(serialization), fht_serialization_encoding_size_fn(serialization), fht_serialization_encoding_key_input_fn(serialization), fht_serialization_encoding_key_output_fn(serialization), (SubLObject)file_hash_table.NIL, testfn, fht_serialization_hash_fn(serialization));
        _csetf_file_hash_table_stream(fht, StreamsLow.open(filename, new SubLObject[] { file_hash_table.$kw219$DIRECTION, file_hash_table.$kw218$IO, file_hash_table.$kw220$IF_EXISTS, file_hash_table.$kw221$OVERWRITE, file_hash_table.$kw222$IF_DOES_NOT_EXIST, file_hash_table.$kw223$ERROR, file_hash_table.$kw224$ELEMENT_TYPE, file_hash_table.$kw225$BINARY }));
        _csetf_file_hash_table_header(fht, make_htfile_header((SubLObject)file_hash_table.UNPROVIDED));
        read_fht_header(fht);
        allocate_file_hash_table_caches(fht, compute_fht_cache_capacity(file_hash_table_count(fht)));
        return fht;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 24302L)
    public static SubLObject open_file_hash_table_read_only(final SubLObject filename, SubLObject testfn, SubLObject serialization) {
        if (testfn == file_hash_table.UNPROVIDED) {
            testfn = file_hash_table.$default_fht_test_function$.getGlobalValue();
        }
        if (serialization == file_hash_table.UNPROVIDED) {
            serialization = file_hash_table.$default_fht_serialization_protocol$.getGlobalValue();
        }
        final SubLObject fht = new_file_hash_table(fht_serialization_encoding_input_fn(serialization), fht_serialization_encoding_output_fn(serialization), fht_serialization_encoding_size_fn(serialization), fht_serialization_encoding_key_input_fn(serialization), fht_serialization_encoding_key_output_fn(serialization), (SubLObject)file_hash_table.NIL, testfn, fht_serialization_hash_fn(serialization));
        _csetf_file_hash_table_stream(fht, StreamsLow.open(filename, new SubLObject[] { file_hash_table.$kw219$DIRECTION, file_hash_table.$kw226$INPUT, file_hash_table.$kw222$IF_DOES_NOT_EXIST, file_hash_table.$kw223$ERROR, file_hash_table.$kw224$ELEMENT_TYPE, file_hash_table.$kw225$BINARY }));
        _csetf_file_hash_table_header(fht, make_htfile_header((SubLObject)file_hash_table.UNPROVIDED));
        read_fht_header(fht);
        allocate_file_hash_table_caches(fht, compute_fht_cache_capacity(file_hash_table_count(fht)));
        return fht;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 25326L)
    public static SubLObject file_hash_table_open_p(final SubLObject fht) {
        assert file_hash_table.NIL != file_hash_table_p(fht) : fht;
        return streams_high.open_stream_p(file_hash_table_stream(fht));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 25524L)
    public static SubLObject finalize_file_hash_table(final SubLObject fht) {
        assert file_hash_table.NIL != file_hash_table_p(fht) : fht;
        final SubLObject lock = file_hash_table_lock(fht);
        SubLObject release = (SubLObject)file_hash_table.NIL;
        try {
            release = Locks.seize_lock(lock);
            final SubLObject fht_stream = file_hash_table_stream(fht);
            if (file_hash_table.NIL != streams_high.output_stream_p(fht_stream)) {
                streams_high.force_output(fht_stream);
                write_fht_header(fht);
            }
            streams_high.close(fht_stream, (SubLObject)file_hash_table.UNPROVIDED);
        }
        finally {
            if (file_hash_table.NIL != release) {
                Locks.release_lock(lock);
            }
        }
        return fht;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 25858L)
    public static SubLObject file_hash_table_count(final SubLObject fht) {
        assert file_hash_table.NIL != file_hash_table_p(fht) : fht;
        SubLObject retval = (SubLObject)file_hash_table.NIL;
        final SubLObject lock = file_hash_table_lock(fht);
        SubLObject release = (SubLObject)file_hash_table.NIL;
        try {
            release = Locks.seize_lock(lock);
            final SubLObject header = file_hash_table_header(fht);
            retval = htfile_header_item_count(header);
        }
        finally {
            if (file_hash_table.NIL != release) {
                Locks.release_lock(lock);
            }
        }
        return retval;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 26136L)
    public static SubLObject file_hash_table_capacity(final SubLObject fht) {
        assert file_hash_table.NIL != file_hash_table_p(fht) : fht;
        SubLObject retval = (SubLObject)file_hash_table.NIL;
        final SubLObject lock = file_hash_table_lock(fht);
        SubLObject release = (SubLObject)file_hash_table.NIL;
        try {
            release = Locks.seize_lock(lock);
            final SubLObject header = file_hash_table_header(fht);
            retval = htfile_header_capacity(header);
        }
        finally {
            if (file_hash_table.NIL != release) {
                Locks.release_lock(lock);
            }
        }
        return retval;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 26414L)
    public static SubLObject put_file_hash_table(final SubLObject key, final SubLObject fht, final SubLObject value) {
        assert file_hash_table.NIL != file_hash_table_p(fht) : fht;
        final SubLObject encoding_key_output_fn = file_hash_table_encoding_key_output_fn(fht);
        final SubLObject internal_key = Functions.funcall(encoding_key_output_fn, key);
        final SubLObject lock = file_hash_table_lock(fht);
        SubLObject release = (SubLObject)file_hash_table.NIL;
        try {
            release = Locks.seize_lock(lock);
            perform_fht_put(fht, internal_key, value);
        }
        finally {
            if (file_hash_table.NIL != release) {
                Locks.release_lock(lock);
            }
        }
        put_fht_lookaside_cache(fht, key, value);
        return key;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 26944L)
    public static SubLObject get_file_hash_table(final SubLObject key, final SubLObject fht, SubLObject default_value) {
        if (default_value == file_hash_table.UNPROVIDED) {
            default_value = (SubLObject)file_hash_table.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert file_hash_table.NIL != file_hash_table_p(fht) : fht;
        thread.resetMultipleValues();
        SubLObject value = get_fht_lookaside_cache(fht, key);
        final SubLObject cachedP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (file_hash_table.NIL != cachedP) {
            if (value.eql(file_hash_table.$not_in_fht$.getGlobalValue())) {
                if (file_hash_table.NIL != file_hash_table.$fht_lookup_stream$.getDynamicValue(thread)) {
                    PrintLow.format(file_hash_table.$fht_lookup_stream$.getDynamicValue(thread), (SubLObject)file_hash_table.$str231$GET_FILE_HASH_TABLE__A_has_cache_, key);
                }
                return Values.values(default_value, (SubLObject)file_hash_table.NIL);
            }
            if (file_hash_table.NIL != file_hash_table.$fht_lookup_stream$.getDynamicValue(thread)) {
                PrintLow.format(file_hash_table.$fht_lookup_stream$.getDynamicValue(thread), (SubLObject)file_hash_table.$str232$GET_FILE_HASH_TABLE__A_has_cache_, key);
            }
            return Values.values(value, (SubLObject)file_hash_table.T);
        }
        else {
            if (file_hash_table.NIL != file_hash_table.$fht_lookup_stream$.getDynamicValue(thread)) {
                PrintLow.format(file_hash_table.$fht_lookup_stream$.getDynamicValue(thread), (SubLObject)file_hash_table.$str233$GET_FILE_HASH_TABLE__A_has_to_go_, key);
            }
            final SubLObject encoding_key_output_fn = file_hash_table_encoding_key_output_fn(fht);
            final SubLObject internal_key = Functions.funcall(encoding_key_output_fn, key);
            SubLObject status = (SubLObject)file_hash_table.NIL;
            final SubLObject lock = file_hash_table_lock(fht);
            SubLObject release = (SubLObject)file_hash_table.NIL;
            try {
                release = Locks.seize_lock(lock);
                thread.resetMultipleValues();
                final SubLObject value_$2 = perform_fht_get(fht, internal_key);
                final SubLObject status_$3 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                value = value_$2;
                status = status_$3;
            }
            finally {
                if (file_hash_table.NIL != release) {
                    Locks.release_lock(lock);
                }
            }
            if (status == file_hash_table.$kw234$FOUND) {
                put_fht_lookaside_cache(fht, key, value);
                if (file_hash_table.NIL != file_hash_table.$fht_lookup_stream$.getDynamicValue(thread)) {
                    PrintLow.format(file_hash_table.$fht_lookup_stream$.getDynamicValue(thread), (SubLObject)file_hash_table.$str235$GET_FILE_HASH_TABLE__A_updated_ca, key);
                }
                return Values.values(value, (SubLObject)file_hash_table.T);
            }
            put_fht_lookaside_cache(fht, key, file_hash_table.$not_in_fht$.getGlobalValue());
            if (file_hash_table.NIL != file_hash_table.$fht_lookup_stream$.getDynamicValue(thread)) {
                PrintLow.format(file_hash_table.$fht_lookup_stream$.getDynamicValue(thread), (SubLObject)file_hash_table.$str236$GET_FILE_HASH_TABLE__A_updated_ca, key);
            }
            return Values.values(default_value, (SubLObject)file_hash_table.NIL);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 28477L)
    public static SubLObject remove_file_hash_table(final SubLObject key, final SubLObject fht) {
        assert file_hash_table.NIL != file_hash_table_p(fht) : fht;
        final SubLObject encoding_key_output_fn = file_hash_table_encoding_key_input_fn(fht);
        final SubLObject internal_key = Functions.funcall(encoding_key_output_fn, key);
        final SubLObject lock = file_hash_table_lock(fht);
        SubLObject release = (SubLObject)file_hash_table.NIL;
        try {
            release = Locks.seize_lock(lock);
            perform_fht_remove(fht, internal_key);
        }
        finally {
            if (file_hash_table.NIL != release) {
                Locks.release_lock(lock);
            }
        }
        put_fht_lookaside_cache(fht, key, file_hash_table.$not_in_fht$.getGlobalValue());
        return key;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 28860L)
    public static SubLObject cinc_file_hash_table(final SubLObject key, final SubLObject fht, SubLObject increment, SubLObject initial_val) {
        if (increment == file_hash_table.UNPROVIDED) {
            increment = (SubLObject)file_hash_table.ONE_INTEGER;
        }
        if (initial_val == file_hash_table.UNPROVIDED) {
            initial_val = increment;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert file_hash_table.NIL != file_hash_table_p(fht) : fht;
        final SubLObject val = get_file_hash_table(key, fht, (SubLObject)file_hash_table.UNPROVIDED);
        if (file_hash_table.NIL != val && file_hash_table.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !val.isNumber()) {
            Errors.error((SubLObject)file_hash_table.$str237$The_key__S_maps_to_the_non_numeri, key, val, fht);
        }
        return put_file_hash_table(key, fht, (file_hash_table.NIL != val) ? Numbers.add(val, increment) : initial_val);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 29452L)
    public static SubLObject dosome_file_hash_table(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_hash_table.$list238);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject key = (SubLObject)file_hash_table.NIL;
        SubLObject val = (SubLObject)file_hash_table.NIL;
        SubLObject fht = (SubLObject)file_hash_table.NIL;
        SubLObject done_var = (SubLObject)file_hash_table.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_hash_table.$list238);
        key = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_hash_table.$list238);
        val = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_hash_table.$list238);
        fht = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_hash_table.$list238);
        done_var = current.first();
        current = current.rest();
        final SubLObject keys_onlyP = (SubLObject)(current.isCons() ? current.first() : file_hash_table.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)file_hash_table.$list238);
        current = current.rest();
        if (file_hash_table.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject the_key = (SubLObject)file_hash_table.$sym239$THE_KEY;
            final SubLObject the_value = (SubLObject)file_hash_table.$sym240$THE_VALUE;
            final SubLObject continuation = (SubLObject)file_hash_table.$sym241$CONTINUATION;
            final SubLObject next = (SubLObject)file_hash_table.$sym242$NEXT;
            final SubLObject completeP = (SubLObject)file_hash_table.$sym243$COMPLETE_;
            return (SubLObject)ConsesLow.list((SubLObject)file_hash_table.$sym244$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(continuation, (SubLObject)file_hash_table.$list245), reader.bq_cons(completeP, (SubLObject)file_hash_table.$list245)), (SubLObject)ConsesLow.list((SubLObject)file_hash_table.$sym246$WHILE, (SubLObject)ConsesLow.list((SubLObject)file_hash_table.$sym247$CAND, (SubLObject)ConsesLow.list((SubLObject)file_hash_table.$sym248$CNOT, done_var), (SubLObject)ConsesLow.list((SubLObject)file_hash_table.$sym248$CNOT, completeP)), (SubLObject)ConsesLow.list((SubLObject)file_hash_table.$sym249$CMULTIPLE_VALUE_BIND, (SubLObject)ConsesLow.list(the_key, the_value, next), (SubLObject)ConsesLow.list((SubLObject)file_hash_table.$sym250$GET_FILE_HASH_TABLE_ANY, fht, continuation, keys_onlyP), (SubLObject)ConsesLow.list((SubLObject)file_hash_table.$sym214$PUNLESS, (SubLObject)ConsesLow.list((SubLObject)file_hash_table.$sym251$NULL, next), (SubLObject)ConsesLow.list((SubLObject)file_hash_table.$sym244$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(key, the_key), (SubLObject)ConsesLow.list(val, the_value)), reader.bq_cons((SubLObject)file_hash_table.$sym252$PROGN, ConsesLow.append(body, (SubLObject)file_hash_table.NIL)))), (SubLObject)ConsesLow.list((SubLObject)file_hash_table.$sym253$CSETQ, continuation, next, completeP, (SubLObject)ConsesLow.list((SubLObject)file_hash_table.$sym251$NULL, next)))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)file_hash_table.$list238);
        return (SubLObject)file_hash_table.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 30197L)
    public static SubLObject dosome_pristine_file_hash_table(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_hash_table.$list238);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject key = (SubLObject)file_hash_table.NIL;
        SubLObject val = (SubLObject)file_hash_table.NIL;
        SubLObject fht = (SubLObject)file_hash_table.NIL;
        SubLObject done_var = (SubLObject)file_hash_table.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_hash_table.$list238);
        key = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_hash_table.$list238);
        val = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_hash_table.$list238);
        fht = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_hash_table.$list238);
        done_var = current.first();
        current = current.rest();
        final SubLObject keys_onlyP = (SubLObject)(current.isCons() ? current.first() : file_hash_table.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)file_hash_table.$list238);
        current = current.rest();
        if (file_hash_table.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject the_key = (SubLObject)file_hash_table.$sym254$THE_KEY;
            final SubLObject the_value = (SubLObject)file_hash_table.$sym255$THE_VALUE;
            final SubLObject continuation = (SubLObject)file_hash_table.$sym256$CONTINUATION;
            final SubLObject next = (SubLObject)file_hash_table.$sym257$NEXT;
            final SubLObject completeP = (SubLObject)file_hash_table.$sym258$COMPLETE_;
            return (SubLObject)ConsesLow.list((SubLObject)file_hash_table.$sym244$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(continuation, (SubLObject)file_hash_table.$list245), reader.bq_cons(completeP, (SubLObject)file_hash_table.$list245)), (SubLObject)ConsesLow.list((SubLObject)file_hash_table.$sym246$WHILE, (SubLObject)ConsesLow.list((SubLObject)file_hash_table.$sym247$CAND, (SubLObject)ConsesLow.list((SubLObject)file_hash_table.$sym248$CNOT, done_var), (SubLObject)ConsesLow.list((SubLObject)file_hash_table.$sym248$CNOT, completeP)), (SubLObject)ConsesLow.list((SubLObject)file_hash_table.$sym249$CMULTIPLE_VALUE_BIND, (SubLObject)ConsesLow.list(the_key, the_value, next), (SubLObject)ConsesLow.list((SubLObject)file_hash_table.$sym259$GET_PRISTINE_FILE_HASH_TABLE_ANY, fht, continuation, keys_onlyP), (SubLObject)ConsesLow.list((SubLObject)file_hash_table.$sym214$PUNLESS, (SubLObject)ConsesLow.list((SubLObject)file_hash_table.$sym251$NULL, next), (SubLObject)ConsesLow.list((SubLObject)file_hash_table.$sym244$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(key, the_key), (SubLObject)ConsesLow.list(val, the_value)), reader.bq_cons((SubLObject)file_hash_table.$sym252$PROGN, ConsesLow.append(body, (SubLObject)file_hash_table.NIL)))), (SubLObject)ConsesLow.list((SubLObject)file_hash_table.$sym253$CSETQ, continuation, next, completeP, (SubLObject)ConsesLow.list((SubLObject)file_hash_table.$sym251$NULL, next)))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)file_hash_table.$list238);
        return (SubLObject)file_hash_table.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 30960L)
    public static SubLObject do_file_hash_table(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_hash_table.$list260);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject key = (SubLObject)file_hash_table.NIL;
        SubLObject value = (SubLObject)file_hash_table.NIL;
        SubLObject fht = (SubLObject)file_hash_table.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_hash_table.$list260);
        key = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_hash_table.$list260);
        value = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_hash_table.$list260);
        fht = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)file_hash_table.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)file_hash_table.NIL;
        SubLObject current_$4 = (SubLObject)file_hash_table.NIL;
        while (file_hash_table.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)file_hash_table.$list260);
            current_$4 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)file_hash_table.$list260);
            if (file_hash_table.NIL == conses_high.member(current_$4, (SubLObject)file_hash_table.$list261, (SubLObject)file_hash_table.UNPROVIDED, (SubLObject)file_hash_table.UNPROVIDED)) {
                bad = (SubLObject)file_hash_table.T;
            }
            if (current_$4 == file_hash_table.$kw205$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (file_hash_table.NIL != bad && file_hash_table.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)file_hash_table.$list260);
        }
        final SubLObject message_tail = cdestructuring_bind.property_list_member((SubLObject)file_hash_table.$kw262$MESSAGE, current);
        final SubLObject message = (SubLObject)((file_hash_table.NIL != message_tail) ? conses_high.cadr(message_tail) : file_hash_table.NIL);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)file_hash_table.$kw206$DONE, current);
        final SubLObject done = (SubLObject)((file_hash_table.NIL != done_tail) ? conses_high.cadr(done_tail) : file_hash_table.NIL);
        final SubLObject body;
        current = (body = temp);
        if (file_hash_table.NIL != message) {
            final SubLObject table_var = (SubLObject)file_hash_table.$sym263$TABLE_VAR;
            return (SubLObject)ConsesLow.list((SubLObject)file_hash_table.$sym244$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(table_var, fht)), (SubLObject)ConsesLow.list((SubLObject)file_hash_table.$sym253$CSETQ, (SubLObject)file_hash_table.$sym264$_PROGRESS_NOTE_, message), (SubLObject)file_hash_table.$list265, (SubLObject)ConsesLow.list((SubLObject)file_hash_table.$sym253$CSETQ, (SubLObject)file_hash_table.$sym266$_PROGRESS_TOTAL_, (SubLObject)ConsesLow.list((SubLObject)file_hash_table.$sym267$FILE_HASH_TABLE_COUNT, table_var)), (SubLObject)file_hash_table.$list268, (SubLObject)ConsesLow.list((SubLObject)file_hash_table.$sym269$NOTING_PERCENT_PROGRESS, (SubLObject)file_hash_table.$sym264$_PROGRESS_NOTE_, (SubLObject)ConsesLow.listS((SubLObject)file_hash_table.$sym270$DO_FILE_HASH_TABLE, (SubLObject)ConsesLow.list(key, value, table_var, (SubLObject)file_hash_table.$kw206$DONE, done), (SubLObject)file_hash_table.$list271, (SubLObject)file_hash_table.$list272, ConsesLow.append(body, (SubLObject)file_hash_table.NIL))));
        }
        return (SubLObject)ConsesLow.listS((SubLObject)file_hash_table.$sym273$DOSOME_FILE_HASH_TABLE, (SubLObject)ConsesLow.listS(key, value, fht, done, (SubLObject)file_hash_table.$list245), ConsesLow.append(body, (SubLObject)file_hash_table.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 31617L)
    public static SubLObject do_pristine_file_hash_table(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_hash_table.$list260);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject key = (SubLObject)file_hash_table.NIL;
        SubLObject value = (SubLObject)file_hash_table.NIL;
        SubLObject fht = (SubLObject)file_hash_table.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_hash_table.$list260);
        key = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_hash_table.$list260);
        value = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_hash_table.$list260);
        fht = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)file_hash_table.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)file_hash_table.NIL;
        SubLObject current_$5 = (SubLObject)file_hash_table.NIL;
        while (file_hash_table.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)file_hash_table.$list260);
            current_$5 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)file_hash_table.$list260);
            if (file_hash_table.NIL == conses_high.member(current_$5, (SubLObject)file_hash_table.$list261, (SubLObject)file_hash_table.UNPROVIDED, (SubLObject)file_hash_table.UNPROVIDED)) {
                bad = (SubLObject)file_hash_table.T;
            }
            if (current_$5 == file_hash_table.$kw205$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (file_hash_table.NIL != bad && file_hash_table.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)file_hash_table.$list260);
        }
        final SubLObject message_tail = cdestructuring_bind.property_list_member((SubLObject)file_hash_table.$kw262$MESSAGE, current);
        final SubLObject message = (SubLObject)((file_hash_table.NIL != message_tail) ? conses_high.cadr(message_tail) : file_hash_table.NIL);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)file_hash_table.$kw206$DONE, current);
        final SubLObject done = (SubLObject)((file_hash_table.NIL != done_tail) ? conses_high.cadr(done_tail) : file_hash_table.NIL);
        final SubLObject body;
        current = (body = temp);
        if (file_hash_table.NIL != message) {
            final SubLObject table_var = (SubLObject)file_hash_table.$sym274$TABLE_VAR;
            return (SubLObject)ConsesLow.list((SubLObject)file_hash_table.$sym244$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(table_var, fht)), (SubLObject)ConsesLow.list((SubLObject)file_hash_table.$sym253$CSETQ, (SubLObject)file_hash_table.$sym264$_PROGRESS_NOTE_, message), (SubLObject)file_hash_table.$list265, (SubLObject)ConsesLow.list((SubLObject)file_hash_table.$sym253$CSETQ, (SubLObject)file_hash_table.$sym266$_PROGRESS_TOTAL_, (SubLObject)ConsesLow.list((SubLObject)file_hash_table.$sym267$FILE_HASH_TABLE_COUNT, table_var)), (SubLObject)file_hash_table.$list268, (SubLObject)ConsesLow.list((SubLObject)file_hash_table.$sym269$NOTING_PERCENT_PROGRESS, (SubLObject)file_hash_table.$sym264$_PROGRESS_NOTE_, (SubLObject)ConsesLow.listS((SubLObject)file_hash_table.$sym270$DO_FILE_HASH_TABLE, (SubLObject)ConsesLow.list(key, value, table_var, (SubLObject)file_hash_table.$kw206$DONE, done), (SubLObject)file_hash_table.$list271, (SubLObject)file_hash_table.$list272, ConsesLow.append(body, (SubLObject)file_hash_table.NIL))));
        }
        return (SubLObject)ConsesLow.listS((SubLObject)file_hash_table.$sym275$DOSOME_PRISTINE_FILE_HASH_TABLE, (SubLObject)ConsesLow.listS(key, value, fht, done, (SubLObject)file_hash_table.$list245), ConsesLow.append(body, (SubLObject)file_hash_table.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 32292L)
    public static SubLObject print_file_hash_table_contents(final SubLObject fht) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject continuation = (SubLObject)file_hash_table.NIL;
        SubLObject next;
        for (SubLObject completeP = (SubLObject)file_hash_table.NIL; file_hash_table.NIL == completeP; completeP = Types.sublisp_null(next)) {
            thread.resetMultipleValues();
            final SubLObject the_key = get_file_hash_table_any(fht, continuation, (SubLObject)file_hash_table.NIL);
            final SubLObject the_value = thread.secondMultipleValue();
            next = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (file_hash_table.NIL != next) {
                final SubLObject key = the_key;
                final SubLObject value = the_value;
                PrintLow.format((SubLObject)file_hash_table.T, (SubLObject)file_hash_table.$str276$_S_____S__, key, value);
            }
            continuation = next;
        }
        return (SubLObject)file_hash_table.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 32435L)
    public static SubLObject progress_do_file_hash_table(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_hash_table.$list277);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject key = (SubLObject)file_hash_table.NIL;
        SubLObject value = (SubLObject)file_hash_table.NIL;
        SubLObject fht = (SubLObject)file_hash_table.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_hash_table.$list277);
        key = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_hash_table.$list277);
        value = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_hash_table.$list277);
        fht = current.first();
        current = current.rest();
        final SubLObject message = (SubLObject)(current.isCons() ? current.first() : file_hash_table.$str278$do_file_hash_table);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)file_hash_table.$list277);
        current = current.rest();
        if (file_hash_table.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            access_macros.defmacro_obsolete_warning((SubLObject)file_hash_table.$sym279$PROGRESS_DO_FILE_HASH_TABLE, (SubLObject)file_hash_table.$list280);
            return (SubLObject)ConsesLow.listS((SubLObject)file_hash_table.$sym270$DO_FILE_HASH_TABLE, (SubLObject)ConsesLow.list(key, value, fht, (SubLObject)file_hash_table.$kw262$MESSAGE, message), ConsesLow.append(body, (SubLObject)file_hash_table.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)file_hash_table.$list277);
        return (SubLObject)file_hash_table.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 32668L)
    public static SubLObject dosome_file_hash_table_keys(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_hash_table.$list281);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject key = (SubLObject)file_hash_table.NIL;
        SubLObject fht = (SubLObject)file_hash_table.NIL;
        SubLObject done_var = (SubLObject)file_hash_table.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_hash_table.$list281);
        key = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_hash_table.$list281);
        fht = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_hash_table.$list281);
        done_var = current.first();
        current = current.rest();
        if (file_hash_table.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            access_macros.defmacro_obsolete_warning((SubLObject)file_hash_table.$sym282$DOSOME_FILE_HASH_TABLE_KEYS, (SubLObject)file_hash_table.$list283);
            return (SubLObject)ConsesLow.listS((SubLObject)file_hash_table.$sym284$DO_FILE_HASH_TABLE_KEYS, (SubLObject)ConsesLow.list(key, fht, (SubLObject)file_hash_table.$kw206$DONE, done_var), ConsesLow.append(body, (SubLObject)file_hash_table.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)file_hash_table.$list281);
        return (SubLObject)file_hash_table.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 32864L)
    public static SubLObject do_file_hash_table_keys(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_hash_table.$list285);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject key = (SubLObject)file_hash_table.NIL;
        SubLObject fht = (SubLObject)file_hash_table.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_hash_table.$list285);
        key = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_hash_table.$list285);
        fht = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)file_hash_table.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)file_hash_table.NIL;
        SubLObject current_$6 = (SubLObject)file_hash_table.NIL;
        while (file_hash_table.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)file_hash_table.$list285);
            current_$6 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)file_hash_table.$list285);
            if (file_hash_table.NIL == conses_high.member(current_$6, (SubLObject)file_hash_table.$list261, (SubLObject)file_hash_table.UNPROVIDED, (SubLObject)file_hash_table.UNPROVIDED)) {
                bad = (SubLObject)file_hash_table.T;
            }
            if (current_$6 == file_hash_table.$kw205$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (file_hash_table.NIL != bad && file_hash_table.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)file_hash_table.$list285);
        }
        final SubLObject message_tail = cdestructuring_bind.property_list_member((SubLObject)file_hash_table.$kw262$MESSAGE, current);
        final SubLObject message = (SubLObject)((file_hash_table.NIL != message_tail) ? conses_high.cadr(message_tail) : file_hash_table.NIL);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)file_hash_table.$kw206$DONE, current);
        final SubLObject done = (SubLObject)((file_hash_table.NIL != done_tail) ? conses_high.cadr(done_tail) : file_hash_table.NIL);
        final SubLObject body;
        current = (body = temp);
        if (file_hash_table.NIL != message) {
            final SubLObject fht_var = (SubLObject)file_hash_table.$sym286$FHT_VAR;
            return (SubLObject)ConsesLow.list((SubLObject)file_hash_table.$sym244$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(fht_var, fht)), (SubLObject)ConsesLow.list((SubLObject)file_hash_table.$sym253$CSETQ, (SubLObject)file_hash_table.$sym264$_PROGRESS_NOTE_, message), (SubLObject)file_hash_table.$list265, (SubLObject)ConsesLow.list((SubLObject)file_hash_table.$sym253$CSETQ, (SubLObject)file_hash_table.$sym266$_PROGRESS_TOTAL_, (SubLObject)ConsesLow.list((SubLObject)file_hash_table.$sym267$FILE_HASH_TABLE_COUNT, fht_var)), (SubLObject)file_hash_table.$list268, (SubLObject)ConsesLow.list((SubLObject)file_hash_table.$sym269$NOTING_PERCENT_PROGRESS, (SubLObject)file_hash_table.$sym264$_PROGRESS_NOTE_, (SubLObject)ConsesLow.listS((SubLObject)file_hash_table.$sym284$DO_FILE_HASH_TABLE_KEYS, (SubLObject)ConsesLow.list(key, fht_var, (SubLObject)file_hash_table.$kw206$DONE, done), (SubLObject)file_hash_table.$list271, (SubLObject)file_hash_table.$list272, ConsesLow.append(body, (SubLObject)file_hash_table.NIL))));
        }
        final SubLObject value = (SubLObject)file_hash_table.$sym287$VALUE;
        return (SubLObject)ConsesLow.listS((SubLObject)file_hash_table.$sym273$DOSOME_FILE_HASH_TABLE, (SubLObject)ConsesLow.listS(key, value, fht, done, (SubLObject)file_hash_table.$list288), (SubLObject)ConsesLow.list((SubLObject)file_hash_table.$sym289$IGNORE, value), ConsesLow.append(body, (SubLObject)file_hash_table.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 33549L)
    public static SubLObject do_pristine_file_hash_table_keys(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_hash_table.$list285);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject key = (SubLObject)file_hash_table.NIL;
        SubLObject fht = (SubLObject)file_hash_table.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_hash_table.$list285);
        key = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_hash_table.$list285);
        fht = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)file_hash_table.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)file_hash_table.NIL;
        SubLObject current_$7 = (SubLObject)file_hash_table.NIL;
        while (file_hash_table.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)file_hash_table.$list285);
            current_$7 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)file_hash_table.$list285);
            if (file_hash_table.NIL == conses_high.member(current_$7, (SubLObject)file_hash_table.$list261, (SubLObject)file_hash_table.UNPROVIDED, (SubLObject)file_hash_table.UNPROVIDED)) {
                bad = (SubLObject)file_hash_table.T;
            }
            if (current_$7 == file_hash_table.$kw205$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (file_hash_table.NIL != bad && file_hash_table.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)file_hash_table.$list285);
        }
        final SubLObject message_tail = cdestructuring_bind.property_list_member((SubLObject)file_hash_table.$kw262$MESSAGE, current);
        final SubLObject message = (SubLObject)((file_hash_table.NIL != message_tail) ? conses_high.cadr(message_tail) : file_hash_table.NIL);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)file_hash_table.$kw206$DONE, current);
        final SubLObject done = (SubLObject)((file_hash_table.NIL != done_tail) ? conses_high.cadr(done_tail) : file_hash_table.NIL);
        final SubLObject body;
        current = (body = temp);
        if (file_hash_table.NIL != message) {
            final SubLObject fht_var = (SubLObject)file_hash_table.$sym290$FHT_VAR;
            return (SubLObject)ConsesLow.list((SubLObject)file_hash_table.$sym244$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(fht_var, fht)), (SubLObject)ConsesLow.list((SubLObject)file_hash_table.$sym253$CSETQ, (SubLObject)file_hash_table.$sym264$_PROGRESS_NOTE_, message), (SubLObject)file_hash_table.$list265, (SubLObject)ConsesLow.list((SubLObject)file_hash_table.$sym253$CSETQ, (SubLObject)file_hash_table.$sym266$_PROGRESS_TOTAL_, (SubLObject)ConsesLow.list((SubLObject)file_hash_table.$sym267$FILE_HASH_TABLE_COUNT, fht_var)), (SubLObject)file_hash_table.$list268, (SubLObject)ConsesLow.list((SubLObject)file_hash_table.$sym269$NOTING_PERCENT_PROGRESS, (SubLObject)file_hash_table.$sym264$_PROGRESS_NOTE_, (SubLObject)ConsesLow.listS((SubLObject)file_hash_table.$sym284$DO_FILE_HASH_TABLE_KEYS, (SubLObject)ConsesLow.list(key, fht_var, (SubLObject)file_hash_table.$kw206$DONE, done), (SubLObject)file_hash_table.$list271, (SubLObject)file_hash_table.$list272, ConsesLow.append(body, (SubLObject)file_hash_table.NIL))));
        }
        final SubLObject value = (SubLObject)file_hash_table.$sym291$VALUE;
        return (SubLObject)ConsesLow.listS((SubLObject)file_hash_table.$sym275$DOSOME_PRISTINE_FILE_HASH_TABLE, (SubLObject)ConsesLow.listS(key, value, fht, done, (SubLObject)file_hash_table.$list288), (SubLObject)ConsesLow.list((SubLObject)file_hash_table.$sym289$IGNORE, value), ConsesLow.append(body, (SubLObject)file_hash_table.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 34253L)
    public static SubLObject progress_do_file_hash_table_keys(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_hash_table.$list292);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject key = (SubLObject)file_hash_table.NIL;
        SubLObject fht = (SubLObject)file_hash_table.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_hash_table.$list292);
        key = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_hash_table.$list292);
        fht = current.first();
        current = current.rest();
        final SubLObject message = (SubLObject)(current.isCons() ? current.first() : file_hash_table.$str293$do_file_hash_table_keys);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)file_hash_table.$list292);
        current = current.rest();
        if (file_hash_table.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            access_macros.defmacro_obsolete_warning((SubLObject)file_hash_table.$sym294$PROGRESS_DO_FILE_HASH_TABLE_KEYS, (SubLObject)file_hash_table.$list283);
            return (SubLObject)ConsesLow.listS((SubLObject)file_hash_table.$sym284$DO_FILE_HASH_TABLE_KEYS, (SubLObject)ConsesLow.list(key, fht, (SubLObject)file_hash_table.$kw262$MESSAGE, message), ConsesLow.append(body, (SubLObject)file_hash_table.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)file_hash_table.$list292);
        return (SubLObject)file_hash_table.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 34493L)
    public static SubLObject file_hash_table_keys(final SubLObject fht) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)file_hash_table.NIL;
        SubLObject continuation = (SubLObject)file_hash_table.NIL;
        SubLObject next;
        for (SubLObject completeP = (SubLObject)file_hash_table.NIL; file_hash_table.NIL == completeP; completeP = Types.sublisp_null(next)) {
            thread.resetMultipleValues();
            final SubLObject the_key = get_file_hash_table_any(fht, continuation, (SubLObject)file_hash_table.T);
            final SubLObject the_value = thread.secondMultipleValue();
            next = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (file_hash_table.NIL != next) {
                final SubLObject key = the_key;
                final SubLObject value = the_value;
                result = (SubLObject)ConsesLow.cons(key, result);
            }
            continuation = next;
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 34649L)
    public static SubLObject file_hash_table_random_n(final SubLObject fht, final SubLObject n, SubLObject keys_onlyP) {
        if (keys_onlyP == file_hash_table.UNPROVIDED) {
            keys_onlyP = (SubLObject)file_hash_table.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert file_hash_table.NIL != file_hash_table_p(fht) : fht;
        assert file_hash_table.NIL != subl_promotions.non_negative_integer_p(n) : n;
        final SubLObject count = file_hash_table_count(fht);
        if (!n.numGE(count)) {
            SubLObject indexes_to_take = number_utilities.n_random_integers(n, count, Symbols.symbol_function((SubLObject)file_hash_table.$sym296$_));
            SubLObject result = (SubLObject)file_hash_table.NIL;
            SubLObject index = (SubLObject)file_hash_table.ZERO_INTEGER;
            SubLObject done = (SubLObject)file_hash_table.NIL;
            SubLObject continuation = (SubLObject)file_hash_table.NIL;
            SubLObject next;
            for (SubLObject completeP = (SubLObject)file_hash_table.NIL; file_hash_table.NIL == done && file_hash_table.NIL == completeP; completeP = Types.sublisp_null(next)) {
                thread.resetMultipleValues();
                final SubLObject the_key = get_file_hash_table_any(fht, continuation, keys_onlyP);
                final SubLObject the_value = thread.secondMultipleValue();
                next = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (file_hash_table.NIL != next) {
                    final SubLObject key = the_key;
                    final SubLObject val = the_value;
                    if (file_hash_table.NIL != list_utilities.empty_list_p(indexes_to_take)) {
                        done = (SubLObject)file_hash_table.T;
                    }
                    else {
                        final SubLObject next_index_to_take = indexes_to_take.first();
                        if (index.numE(next_index_to_take)) {
                            if (file_hash_table.NIL != keys_onlyP) {
                                result = (SubLObject)ConsesLow.cons(key, result);
                            }
                            else {
                                result = conses_high.acons(key, val, result);
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
        if (file_hash_table.NIL != keys_onlyP) {
            return file_hash_table_keys(fht);
        }
        return file_hash_table_to_alist(fht);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 35918L)
    public static SubLObject validate_file_hash_table(final SubLObject fht, SubLObject report_stream) {
        if (report_stream == file_hash_table.UNPROVIDED) {
            report_stream = (SubLObject)file_hash_table.T;
        }
        SubLObject problems = (SubLObject)file_hash_table.ZERO_INTEGER;
        final SubLObject capacity = file_hash_table_capacity(fht);
        final SubLObject key_entry = make_htfile_key_entry((SubLObject)file_hash_table.UNPROVIDED);
        SubLObject index;
        for (index = (SubLObject)file_hash_table.NIL, index = (SubLObject)file_hash_table.ZERO_INTEGER; index.numL(capacity); index = Numbers.add(index, (SubLObject)file_hash_table.ONE_INTEGER)) {
            fetch_fht_key_entry(fht, index, key_entry);
            if (file_hash_table.NIL == is_valid_key_entryP(key_entry, fht)) {
                problems = Numbers.add(problems, (SubLObject)file_hash_table.ONE_INTEGER);
                PrintLow.format(report_stream, (SubLObject)file_hash_table.$str297$Invalid_key_entry__A__Offset_0x_X, new SubLObject[] { index, htfile_key_entry_key_offset(key_entry), htfile_key_entry_key_offset(key_entry), htfile_key_entry_hash_code(key_entry) });
            }
        }
        return Numbers.numE(problems, (SubLObject)file_hash_table.ZERO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 36656L)
    public static SubLObject recover_file_hash_table_heap(final SubLObject fht, SubLObject report_stream) {
        if (report_stream == file_hash_table.UNPROVIDED) {
            report_stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLObject header = file_hash_table_header(fht);
        final SubLObject item_count = file_hash_table_capacity(fht);
        final SubLObject heap_start = htfile_header_object_space_offset(header);
        final SubLObject heap_end = htfile_header_current_heap_top(header);
        final SubLObject fht_stream = file_hash_table_stream(fht);
        SubLObject records_read = (SubLObject)file_hash_table.ZERO_INTEGER;
        compatibility.set_file_position(fht_stream, heap_start);
        while (streams_high.file_position(fht_stream, (SubLObject)file_hash_table.UNPROVIDED).numL(heap_end) && records_read.numL(item_count)) {
            final SubLObject total_object_size = read_fht_uint4(fht_stream);
            final SubLObject type_or_key_size = read_fht_uint4(fht_stream);
            final SubLObject object_only_size = read_fht_uint4(fht_stream);
            if (file_hash_table.NIL != Numbers.numNE(total_object_size, Numbers.add(Numbers.add(type_or_key_size, object_only_size), file_hash_table.$htfile_object_entry_size$.getGlobalValue()))) {
                Errors.error((SubLObject)file_hash_table.$str298$FHT_for__A_corrupted___A_____A__A, new SubLObject[] { total_object_size, type_or_key_size, object_only_size, file_hash_table.$htfile_object_entry_size$.getGlobalValue() });
            }
            else if (file_hash_table.NIL != streams_high.output_stream_p(report_stream)) {
                PrintLow.format(report_stream, (SubLObject)file_hash_table.$str299$Entry__A___A_bytes_total___A_byte, new SubLObject[] { records_read, total_object_size, type_or_key_size, object_only_size, file_hash_table.$htfile_object_entry_size$.getGlobalValue() });
            }
            records_read = Numbers.add(records_read, (SubLObject)file_hash_table.ONE_INTEGER);
            final SubLObject current = streams_high.file_position(fht_stream, (SubLObject)file_hash_table.UNPROVIDED);
            compatibility.set_file_position(fht_stream, Numbers.add(Numbers.subtract(total_object_size, file_hash_table.$htfile_object_entry_size$.getGlobalValue()), current));
        }
        return records_read;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 38765L)
    public static SubLObject new_file_hash_table_iterator(final SubLObject fht, SubLObject finalize_fhtP) {
        if (finalize_fhtP == file_hash_table.UNPROVIDED) {
            finalize_fhtP = (SubLObject)file_hash_table.NIL;
        }
        assert file_hash_table.NIL != file_hash_table_p(fht) : fht;
        return new_file_hash_table_iterator_internal(fht, (SubLObject)file_hash_table.NIL, finalize_fhtP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 39494L)
    public static SubLObject new_file_hash_table_keys_iterator(final SubLObject fht, SubLObject finalize_fhtP) {
        if (finalize_fhtP == file_hash_table.UNPROVIDED) {
            finalize_fhtP = (SubLObject)file_hash_table.NIL;
        }
        assert file_hash_table.NIL != file_hash_table_p(fht) : fht;
        return new_file_hash_table_iterator_internal(fht, (SubLObject)file_hash_table.T, finalize_fhtP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 40641L)
    public static SubLObject new_file_hash_table_values_iterator(final SubLObject fht, SubLObject finalize_fhtP) {
        if (finalize_fhtP == file_hash_table.UNPROVIDED) {
            finalize_fhtP = (SubLObject)file_hash_table.NIL;
        }
        assert file_hash_table.NIL != file_hash_table_p(fht) : fht;
        return iteration.new_iterator(make_iterator_file_hash_table_state(fht, (SubLObject)file_hash_table.NIL, finalize_fhtP), (SubLObject)file_hash_table.$sym300$ITERATE_FILE_HASH_TABLE_DONE_, (SubLObject)file_hash_table.$sym301$ITERATE_FILE_HASH_TABLE_NEXT_VALUE, (SubLObject)file_hash_table.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 41757L)
    public static SubLObject iterate_file_hash_table_next_value(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject next = iterate_file_hash_table_next(state);
        final SubLObject next_state = thread.secondMultipleValue();
        final SubLObject doneP = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        return Values.values(fht_iterator_next_value(next), next_state, doneP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 41979L)
    public static SubLObject new_file_hash_table_iterator_internal(final SubLObject fht, final SubLObject keys_onlyP, final SubLObject finalize_fhtP) {
        return iteration.new_iterator(make_iterator_file_hash_table_state(fht, keys_onlyP, finalize_fhtP), (SubLObject)file_hash_table.$sym300$ITERATE_FILE_HASH_TABLE_DONE_, (SubLObject)file_hash_table.$sym302$ITERATE_FILE_HASH_TABLE_NEXT, (SubLObject)file_hash_table.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 42461L)
    public static SubLObject make_iterator_file_hash_table_state(final SubLObject fht, final SubLObject keys_onlyP, final SubLObject finalize_fhtP) {
        final SubLObject current = (SubLObject)file_hash_table.$kw303$START;
        return (SubLObject)ConsesLow.list(current, fht, keys_onlyP, finalize_fhtP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 42725L)
    public static SubLObject iterate_file_hash_table_doneP(final SubLObject state) {
        SubLObject current_$8 = (SubLObject)file_hash_table.NIL;
        SubLObject fht = (SubLObject)file_hash_table.NIL;
        SubLObject keys_onlyP = (SubLObject)file_hash_table.NIL;
        SubLObject finalize_fhtP = (SubLObject)file_hash_table.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, (SubLObject)file_hash_table.$list304);
        current_$8 = state.first();
        SubLObject current = state.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)file_hash_table.$list304);
        fht = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)file_hash_table.$list304);
        keys_onlyP = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)file_hash_table.$list304);
        finalize_fhtP = current.first();
        current = current.rest();
        if (file_hash_table.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(state, (SubLObject)file_hash_table.$list304);
            return (SubLObject)file_hash_table.NIL;
        }
        if (file_hash_table.$kw206$DONE == current_$8) {
            if (file_hash_table.NIL != finalize_fhtP) {
                finalize_file_hash_table(fht);
            }
            return (SubLObject)file_hash_table.T;
        }
        return (SubLObject)file_hash_table.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 43133L)
    public static SubLObject iterate_file_hash_table_next(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current_$9 = (SubLObject)file_hash_table.NIL;
        SubLObject fht = (SubLObject)file_hash_table.NIL;
        SubLObject keys_onlyP = (SubLObject)file_hash_table.NIL;
        SubLObject finalize_fhtP = (SubLObject)file_hash_table.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, (SubLObject)file_hash_table.$list304);
        current_$9 = state.first();
        SubLObject current = state.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)file_hash_table.$list304);
        fht = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)file_hash_table.$list304);
        keys_onlyP = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)file_hash_table.$list304);
        finalize_fhtP = current.first();
        current = current.rest();
        if (file_hash_table.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(state, (SubLObject)file_hash_table.$list304);
            return (SubLObject)file_hash_table.NIL;
        }
        final SubLObject continuation = (SubLObject)((file_hash_table.$kw303$START == current_$9) ? file_hash_table.NIL : current_$9);
        thread.resetMultipleValues();
        final SubLObject next_key = get_file_hash_table_any(fht, continuation, keys_onlyP);
        final SubLObject next_value = thread.secondMultipleValue();
        final SubLObject next_continuation = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(file_hash_table.NIL != next_continuation);
        if (file_hash_table.NIL == valid) {
            final SubLObject update = (SubLObject)file_hash_table.$kw206$DONE;
            if (file_hash_table.NIL != finalize_fhtP) {
                finalize_file_hash_table(fht);
            }
            else {
                ConsesLow.set_nth((SubLObject)file_hash_table.ONE_INTEGER, state, (SubLObject)file_hash_table.$kw305$UNINITIALIZED);
            }
            ConsesLow.rplaca(state, update);
            return Values.values((SubLObject)file_hash_table.NIL, state, (SubLObject)file_hash_table.T);
        }
        final SubLObject next = make_fht_iterator_next(keys_onlyP, next_key, next_value);
        final SubLObject update2 = next_continuation;
        ConsesLow.rplaca(state, update2);
        return Values.values(next, state, (SubLObject)file_hash_table.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 44113L)
    public static SubLObject make_fht_iterator_next(final SubLObject keys_onlyP, final SubLObject next_key, final SubLObject next_value) {
        return (SubLObject)((file_hash_table.NIL != keys_onlyP) ? next_key : ConsesLow.list(next_key, next_value));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 44249L)
    public static SubLObject fht_iterator_next_value(final SubLObject next) {
        return (SubLObject)(next.isList() ? conses_high.second(next) : file_hash_table.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 44341L)
    public static SubLObject file_hash_table_to_alist(final SubLObject fht) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject alist = (SubLObject)file_hash_table.NIL;
        utilities_macros.$progress_note$.setDynamicValue((SubLObject)file_hash_table.$str306$converting_file_hash_table_to_ali, thread);
        utilities_macros.$progress_start_time$.setDynamicValue(Time.get_universal_time(), thread);
        utilities_macros.$progress_total$.setDynamicValue(file_hash_table_count(fht), thread);
        utilities_macros.$progress_sofar$.setDynamicValue((SubLObject)file_hash_table.ZERO_INTEGER, thread);
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)file_hash_table.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)file_hash_table.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)file_hash_table.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                SubLObject continuation = (SubLObject)file_hash_table.NIL;
                SubLObject next;
                for (SubLObject completeP = (SubLObject)file_hash_table.NIL; file_hash_table.NIL == completeP; completeP = Types.sublisp_null(next)) {
                    thread.resetMultipleValues();
                    final SubLObject the_key = get_file_hash_table_any(fht, continuation, (SubLObject)file_hash_table.NIL);
                    final SubLObject the_value = thread.secondMultipleValue();
                    next = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    if (file_hash_table.NIL != next) {
                        final SubLObject key = the_key;
                        final SubLObject val = the_value;
                        utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                        utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)file_hash_table.ONE_INTEGER), thread);
                        alist = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(key, val), alist);
                    }
                    continuation = next;
                }
            }
            finally {
                final SubLObject _prev_bind_0_$10 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)file_hash_table.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$10, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return Sequences.nreverse(alist);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 44783L)
    public static SubLObject hash_table_to_file_hash_table(final SubLObject hash_table, final SubLObject filename, SubLObject tempstem, SubLObject testfn, SubLObject serialization, SubLObject progress_message) {
        if (tempstem == file_hash_table.UNPROVIDED) {
            tempstem = (SubLObject)file_hash_table.$str307$tmp_;
        }
        if (testfn == file_hash_table.UNPROVIDED) {
            testfn = file_hash_table.$default_fht_test_function$.getGlobalValue();
        }
        if (serialization == file_hash_table.UNPROVIDED) {
            serialization = file_hash_table.$default_fht_serialization_protocol$.getGlobalValue();
        }
        if (progress_message == file_hash_table.UNPROVIDED) {
            progress_message = (SubLObject)file_hash_table.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert file_hash_table.NIL != Types.hash_table_p(hash_table) : hash_table;
        final SubLObject fast_fht = fast_create_file_hash_table(filename, tempstem, testfn, serialization);
        final SubLObject message_var = progress_message;
        final SubLObject silentP = utilities_macros.$silent_progressP$.getDynamicValue(thread);
        final SubLObject _prev_bind_0 = utilities_macros.$silent_progressP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_5 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$silent_progressP$.bind((SubLObject)SubLObjectFactory.makeBoolean(file_hash_table.NIL != silentP || file_hash_table.NIL == message_var), thread);
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)file_hash_table.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)file_hash_table.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)file_hash_table.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble((SubLObject)((file_hash_table.NIL != message_var) ? message_var : file_hash_table.$str309$));
                SubLObject index_var = (SubLObject)file_hash_table.ZERO_INTEGER;
                final SubLObject count_var = Hashtables.hash_table_count(hash_table);
                SubLObject key = (SubLObject)file_hash_table.NIL;
                SubLObject val = (SubLObject)file_hash_table.NIL;
                final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(hash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        key = Hashtables.getEntryKey(cdohash_entry);
                        val = Hashtables.getEntryValue(cdohash_entry);
                        final SubLObject _prev_bind_0_$11 = utilities_macros.$silent_progressP$.currentBinding(thread);
                        try {
                            utilities_macros.$silent_progressP$.bind(silentP, thread);
                            fast_put_file_hash_table(key, fast_fht, val);
                        }
                        finally {
                            utilities_macros.$silent_progressP$.rebind(_prev_bind_0_$11, thread);
                        }
                        index_var = number_utilities.f_1X(index_var);
                        utilities_macros.note_percent_progress(index_var, count_var);
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$12 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)file_hash_table.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$12, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_5, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_4, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_2, thread);
            utilities_macros.$silent_progressP$.rebind(_prev_bind_0, thread);
        }
        finalize_fast_create_file_hash_table(fast_fht, (SubLObject)file_hash_table.UNPROVIDED, (SubLObject)file_hash_table.UNPROVIDED);
        return (SubLObject)file_hash_table.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 45550L)
    public static SubLObject alist_to_file_hash_table(final SubLObject alist, final SubLObject path, SubLObject testfn, SubLObject serialization, SubLObject tempstem) {
        if (testfn == file_hash_table.UNPROVIDED) {
            testfn = file_hash_table.$default_fht_test_function$.getGlobalValue();
        }
        if (serialization == file_hash_table.UNPROVIDED) {
            serialization = file_hash_table.$default_fht_serialization_protocol$.getGlobalValue();
        }
        if (tempstem == file_hash_table.UNPROVIDED) {
            tempstem = (SubLObject)file_hash_table.$str310$_tmp_;
        }
        assert file_hash_table.NIL != Types.listp(alist) : alist;
        assert file_hash_table.NIL != Types.stringp(path) : path;
        final SubLObject fht = fast_create_file_hash_table(path, tempstem, testfn, serialization);
        SubLObject cdolist_list_var = Sequences.reverse(alist);
        SubLObject keyXvalue = (SubLObject)file_hash_table.NIL;
        keyXvalue = cdolist_list_var.first();
        while (file_hash_table.NIL != cdolist_list_var) {
            fast_put_file_hash_table(keyXvalue.first(), fht, keyXvalue.rest());
            cdolist_list_var = cdolist_list_var.rest();
            keyXvalue = cdolist_list_var.first();
        }
        finalize_fast_create_file_hash_table(fht, (SubLObject)file_hash_table.UNPROVIDED, (SubLObject)file_hash_table.UNPROVIDED);
        return path;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 46171L)
    public static SubLObject file_hash_table_copy(final SubLObject existing_fht_path, final SubLObject new_fht_path, SubLObject existing_testfn, SubLObject existing_serialization, SubLObject testfn, SubLObject serialization, SubLObject progress_message) {
        if (existing_testfn == file_hash_table.UNPROVIDED) {
            existing_testfn = file_hash_table.$default_fht_test_function$.getGlobalValue();
        }
        if (existing_serialization == file_hash_table.UNPROVIDED) {
            existing_serialization = file_hash_table.$default_fht_serialization_protocol$.getGlobalValue();
        }
        if (testfn == file_hash_table.UNPROVIDED) {
            testfn = file_hash_table.$default_fht_test_function$.getGlobalValue();
        }
        if (serialization == file_hash_table.UNPROVIDED) {
            serialization = file_hash_table.$default_fht_serialization_protocol$.getGlobalValue();
        }
        if (progress_message == file_hash_table.UNPROVIDED) {
            progress_message = (SubLObject)file_hash_table.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject new_fht = create_file_hash_table(new_fht_path, testfn, serialization, (SubLObject)file_hash_table.UNPROVIDED, (SubLObject)file_hash_table.UNPROVIDED);
        final SubLObject table_var;
        final SubLObject fht = table_var = open_file_hash_table_read_only(existing_fht_path, existing_testfn, existing_serialization);
        utilities_macros.$progress_note$.setDynamicValue(progress_message, thread);
        utilities_macros.$progress_start_time$.setDynamicValue(Time.get_universal_time(), thread);
        utilities_macros.$progress_total$.setDynamicValue(file_hash_table_count(table_var), thread);
        utilities_macros.$progress_sofar$.setDynamicValue((SubLObject)file_hash_table.ZERO_INTEGER, thread);
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)file_hash_table.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)file_hash_table.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)file_hash_table.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                SubLObject continuation = (SubLObject)file_hash_table.NIL;
                SubLObject next;
                for (SubLObject completeP = (SubLObject)file_hash_table.NIL; file_hash_table.NIL == completeP; completeP = Types.sublisp_null(next)) {
                    thread.resetMultipleValues();
                    final SubLObject the_key = get_file_hash_table_any(table_var, continuation, (SubLObject)file_hash_table.NIL);
                    final SubLObject the_value = thread.secondMultipleValue();
                    next = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    if (file_hash_table.NIL != next) {
                        final SubLObject key = the_key;
                        final SubLObject value = the_value;
                        utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                        utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)file_hash_table.ONE_INTEGER), thread);
                        put_file_hash_table(key, new_fht, value);
                    }
                    continuation = next;
                }
            }
            finally {
                final SubLObject _prev_bind_0_$13 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)file_hash_table.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$13, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        finalize_file_hash_table(new_fht);
        finalize_file_hash_table(fht);
        return new_fht_path;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 46967L)
    public static SubLObject get_file_hash_table_storage_resourcing(final SubLObject fht) {
        return conses_high.getf(file_hash_table_property_list(fht), (SubLObject)file_hash_table.$kw313$STORAGE_RESOURCING, (SubLObject)file_hash_table.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 47184L)
    public static SubLObject set_file_hash_table_storage_resourcing(final SubLObject fht, SubLObject value) {
        if (value == file_hash_table.UNPROVIDED) {
            value = (SubLObject)file_hash_table.T;
        }
        _csetf_file_hash_table_property_list(fht, conses_high.putf(file_hash_table_property_list(fht), (SubLObject)file_hash_table.$kw313$STORAGE_RESOURCING, value));
        return fht;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 47396L)
    public static SubLObject file_hash_table_storage_resourcing_onP(final SubLObject fht) {
        return get_file_hash_table_storage_resourcing(fht);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 47566L)
    public static SubLObject compute_fht_cache_capacity(final SubLObject size) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return Numbers.max(file_hash_table.$fht_min_cache_capacity$.getDynamicValue(thread), Numbers.round(Numbers.multiply(Numbers.divide(size, (SubLObject)file_hash_table.$int314$100), file_hash_table.$fht_cache_percentage$.getDynamicValue(thread)), (SubLObject)file_hash_table.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 47782L)
    public static SubLObject allocate_file_hash_table_caches(final SubLObject fht, final SubLObject capacity) {
        _csetf_file_hash_table_output_cache(fht, cache.new_cache(capacity, file_hash_table_testfn(fht)));
        return (SubLObject)file_hash_table.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 47959L)
    public static SubLObject put_fht_lookaside_cache(final SubLObject fht, final SubLObject key, final SubLObject value) {
        return cache.cache_set(file_hash_table_output_cache(fht), key, value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 48084L)
    public static SubLObject get_fht_lookaside_cache(final SubLObject fht, final SubLObject key) {
        return cache.cache_get(file_hash_table_output_cache(fht), key);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 48197L)
    public static SubLObject remove_fht_lookaside_cache(final SubLObject fht, final SubLObject key) {
        return cache.cache_remove(file_hash_table_output_cache(fht), key);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 48585L)
    public static SubLObject get_pristine_file_hash_table_any(final SubLObject fht, SubLObject continuation, SubLObject key_onlyP) {
        if (continuation == file_hash_table.UNPROVIDED) {
            continuation = (SubLObject)file_hash_table.NIL;
        }
        if (key_onlyP == file_hash_table.UNPROVIDED) {
            key_onlyP = (SubLObject)file_hash_table.NIL;
        }
        assert file_hash_table.NIL != file_hash_table_p(fht) : fht;
        final SubLObject header = file_hash_table_header(fht);
        final SubLObject heap_top = htfile_header_current_heap_top(header);
        final SubLObject object_entry = make_htfile_object_entry((SubLObject)file_hash_table.UNPROVIDED);
        final SubLObject complete_style = (SubLObject)((file_hash_table.NIL != key_onlyP) ? file_hash_table.$kw315$KEY_ONLY : file_hash_table.$kw316$FULL);
        SubLObject key = (SubLObject)file_hash_table.NIL;
        SubLObject value = (SubLObject)file_hash_table.NIL;
        if (file_hash_table.NIL == continuation) {
            continuation = htfile_header_object_space_offset(header);
        }
        final SubLObject address = continuation;
        read_object_entry_from_space(fht, object_entry, address, complete_style);
        final SubLObject encoding_key_input_fn = file_hash_table_encoding_key_input_fn(fht);
        final SubLObject internal_key = htfile_object_entry_key(object_entry);
        key = (SubLObject)((file_hash_table.NIL == internal_key) ? file_hash_table.NIL : Functions.funcall(encoding_key_input_fn, internal_key));
        value = htfile_object_entry_data(object_entry);
        continuation = Numbers.add(address, htfile_object_entry_size(object_entry));
        if (continuation.numGE(heap_top)) {
            continuation = (SubLObject)file_hash_table.NIL;
        }
        return Values.values(key, value, continuation);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 49899L)
    public static SubLObject get_file_hash_table_any(final SubLObject fht, SubLObject continuation, SubLObject key_onlyP) {
        if (continuation == file_hash_table.UNPROVIDED) {
            continuation = (SubLObject)file_hash_table.NIL;
        }
        if (key_onlyP == file_hash_table.UNPROVIDED) {
            key_onlyP = (SubLObject)file_hash_table.NIL;
        }
        assert file_hash_table.NIL != file_hash_table_p(fht) : fht;
        final SubLObject header = file_hash_table_header(fht);
        final SubLObject encoding_key_input_fn = file_hash_table_encoding_key_input_fn(fht);
        final SubLObject capacity = htfile_header_capacity(header);
        SubLObject index = (SubLObject)(continuation.isNumber() ? continuation : file_hash_table.ZERO_INTEGER);
        SubLObject doneP = (SubLObject)SubLObjectFactory.makeBoolean(index.numG(capacity) || index.numE(capacity));
        final SubLObject key_entry = make_htfile_key_entry((SubLObject)file_hash_table.UNPROVIDED);
        final SubLObject object_entry = make_htfile_object_entry((SubLObject)file_hash_table.UNPROVIDED);
        final SubLObject complete_style = (SubLObject)((file_hash_table.NIL != key_onlyP) ? file_hash_table.$kw315$KEY_ONLY : file_hash_table.$kw316$FULL);
        if (file_hash_table.NIL != doneP) {
            index = (SubLObject)file_hash_table.NIL;
        }
        while (file_hash_table.NIL == doneP) {
            fetch_fht_key_entry(fht, index, key_entry);
            if (file_hash_table.NIL == is_empty_key_entryP(key_entry)) {
                doneP = (SubLObject)file_hash_table.T;
                complete_fht_object_entry_for_key(fht, key_entry, object_entry, complete_style);
                index = Numbers.add(index, (SubLObject)file_hash_table.ONE_INTEGER);
            }
            else {
                index = Numbers.add(index, (SubLObject)file_hash_table.ONE_INTEGER);
                if (index.numL(capacity)) {
                    continue;
                }
                doneP = (SubLObject)file_hash_table.T;
                index = (SubLObject)file_hash_table.NIL;
            }
        }
        final SubLObject internal_key = htfile_object_entry_key(object_entry);
        final SubLObject key = (SubLObject)((file_hash_table.NIL == internal_key) ? file_hash_table.NIL : Functions.funcall(encoding_key_input_fn, internal_key));
        final SubLObject value = htfile_object_entry_data(object_entry);
        return Values.values(key, value, index);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 51181L)
    public static SubLObject perform_fht_put(final SubLObject fht, final SubLObject key, final SubLObject value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject status = fht_lookup_key(fht, key, (SubLObject)file_hash_table.UNPROVIDED);
        final SubLObject index = thread.secondMultipleValue();
        final SubLObject key_entry = thread.thirdMultipleValue();
        final SubLObject object_entry = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        final SubLObject pcase_var = status;
        if (pcase_var.eql((SubLObject)file_hash_table.$kw317$NOT_FOUND)) {
            perform_fht_put_insert(fht, key, value, index, key_entry, object_entry, (SubLObject)file_hash_table.UNPROVIDED);
        }
        else if (pcase_var.eql((SubLObject)file_hash_table.$kw234$FOUND)) {
            perform_fht_put_replace(fht, key, value, index, key_entry, object_entry);
        }
        else if (pcase_var.eql((SubLObject)file_hash_table.$kw318$TABLE_FULL)) {
            Errors.error((SubLObject)file_hash_table.$str319$Cannot_put_into_table__table_is_f);
        }
        else {
            Errors.error((SubLObject)file_hash_table.$str320$Implementation_Error__Unexpected_, status, key, index);
        }
        return fht;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 51790L)
    public static SubLObject perform_fht_put_insert(final SubLObject fht, final SubLObject key, final SubLObject value, final SubLObject index, final SubLObject key_entry, final SubLObject object_entry, SubLObject store_key_entryP) {
        if (store_key_entryP == file_hash_table.UNPROVIDED) {
            store_key_entryP = (SubLObject)file_hash_table.T;
        }
        final SubLObject encoding_size_fn = file_hash_table_encoding_size_fn(fht);
        SubLObject address = (SubLObject)file_hash_table.NIL;
        specify_object_entry(key, value, encoding_size_fn, object_entry);
        address = allocate_object_space(fht, object_entry);
        store_fht_object_entry(fht, address, object_entry);
        _csetf_htfile_key_entry_key_offset(key_entry, address);
        if (file_hash_table.NIL != store_key_entryP) {
            store_fht_key_entry(fht, index, key_entry, (SubLObject)file_hash_table.UNPROVIDED);
        }
        increase_fht_item_count(fht, (SubLObject)SubLObjectFactory.makeBoolean(file_hash_table.NIL == store_key_entryP));
        return fht;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 52421L)
    public static SubLObject perform_fht_put_replace(final SubLObject fht, final SubLObject key, final SubLObject value, final SubLObject index, final SubLObject key_entry, final SubLObject object_entry) {
        final SubLObject encoding_size_fn = file_hash_table_encoding_size_fn(fht);
        final SubLObject old_entry = make_htfile_object_entry((SubLObject)file_hash_table.UNPROVIDED);
        SubLObject address = (SubLObject)file_hash_table.NIL;
        read_object_entry_from_space(fht, old_entry, htfile_key_entry_key_offset(key_entry), (SubLObject)file_hash_table.UNPROVIDED);
        if (!value.equalp(htfile_object_entry_data(old_entry))) {
            specify_object_entry(key, value, encoding_size_fn, object_entry);
            if (htfile_object_entry_size(old_entry).numE(htfile_object_entry_size(object_entry))) {
                address = htfile_key_entry_key_offset(key_entry);
            }
            else {
                if (file_hash_table.NIL != file_hash_table_storage_resourcing_onP(fht)) {
                    deallocate_object_space(fht, htfile_key_entry_key_offset(key_entry), htfile_object_entry_size(old_entry));
                }
                address = allocate_object_space(fht, object_entry);
            }
            store_fht_object_entry(fht, address, object_entry);
            if (!address.numE(htfile_key_entry_key_offset(key_entry))) {
                _csetf_htfile_key_entry_key_offset(key_entry, address);
                store_fht_key_entry(fht, index, key_entry, (SubLObject)file_hash_table.UNPROVIDED);
            }
        }
        return fht;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 53746L)
    public static SubLObject perform_fht_remove(final SubLObject fht, final SubLObject key) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject status = fht_lookup_key(fht, key, (SubLObject)file_hash_table.UNPROVIDED);
        final SubLObject index = thread.secondMultipleValue();
        final SubLObject key_entry = thread.thirdMultipleValue();
        final SubLObject object_entry = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        final SubLObject pcase_var = status;
        if (pcase_var.eql((SubLObject)file_hash_table.$kw234$FOUND)) {
            perform_fht_remove_int(fht, index, key_entry, object_entry);
        }
        else {
            if (pcase_var.eql((SubLObject)file_hash_table.$sym321$COR) || pcase_var.eql((SubLObject)file_hash_table.$kw318$TABLE_FULL) || pcase_var.eql((SubLObject)file_hash_table.$kw317$NOT_FOUND)) {
                return (SubLObject)file_hash_table.NIL;
            }
            Errors.error((SubLObject)file_hash_table.$str320$Implementation_Error__Unexpected_, status, key, index);
        }
        return fht;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 54200L)
    public static SubLObject perform_fht_remove_int(final SubLObject fht, final SubLObject index, final SubLObject key_entry, final SubLObject object_entry) {
        if (file_hash_table.NIL == is_empty_key_entryP(key_entry) && file_hash_table.NIL == is_tombstoned_key_entryP(key_entry)) {
            if (file_hash_table.NIL != file_hash_table_storage_resourcing_onP(fht)) {
                deallocate_object_space(fht, htfile_key_entry_key_offset(key_entry), htfile_object_entry_size(object_entry));
            }
            decrease_fht_item_count(fht);
            clear_fht_key_entry_node(fht, index);
            fht_fill_key_entry_gap(fht, index);
            return fht;
        }
        return (SubLObject)file_hash_table.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 54677L)
    public static SubLObject clear_fht_key_entry_node(final SubLObject fht, final SubLObject key_index) {
        return store_fht_key_entry(fht, key_index, construct_empty_key_entry(), (SubLObject)file_hash_table.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 54808L)
    public static SubLObject fht_fill_key_entry_gap(final SubLObject fht, SubLObject gap_index) {
        final SubLObject key_entry = make_htfile_key_entry((SubLObject)file_hash_table.UNPROVIDED);
        final SubLObject object_entry = make_htfile_object_entry((SubLObject)file_hash_table.UNPROVIDED);
        SubLObject empty = gap_index;
        SubLObject doneP = (SubLObject)file_hash_table.NIL;
        while (file_hash_table.NIL == doneP) {
            gap_index = fht_step_key_index(gap_index, fht);
            fetch_fht_key_entry(fht, gap_index, key_entry);
            if (file_hash_table.NIL != is_empty_key_entryP(key_entry)) {
                doneP = (SubLObject)file_hash_table.T;
            }
            else {
                final SubLObject node_key_code = htfile_key_entry_hash_code(key_entry);
                final SubLObject address = htfile_key_entry_key_offset(key_entry);
                SubLObject new_index = (SubLObject)file_hash_table.NIL;
                read_object_entry_from_space(fht, object_entry, address, (SubLObject)file_hash_table.$kw315$KEY_ONLY);
                new_index = fht_lookup_key_index_only(fht, htfile_object_entry_key(object_entry), node_key_code);
                if (!new_index.numE(empty)) {
                    continue;
                }
                store_fht_key_entry(fht, empty, key_entry, (SubLObject)file_hash_table.UNPROVIDED);
                empty = gap_index;
                clear_fht_key_entry_node(fht, empty);
            }
        }
        return fht;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 56592L)
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
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 56818L)
    public static SubLObject increase_fht_item_count(final SubLObject fht, SubLObject delay_writeP) {
        if (delay_writeP == file_hash_table.UNPROVIDED) {
            delay_writeP = (SubLObject)file_hash_table.NIL;
        }
        final SubLObject header = file_hash_table_header(fht);
        SubLObject count = htfile_header_item_count(header);
        count = Numbers.add(count, (SubLObject)file_hash_table.ONE_INTEGER);
        _csetf_htfile_header_item_count(header, count);
        if (file_hash_table.NIL == delay_writeP) {
            write_fht_header(fht);
            potentially_grow_fht_table(fht);
        }
        return fht;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 57168L)
    public static SubLObject decrease_fht_item_count(final SubLObject fht) {
        final SubLObject header = file_hash_table_header(fht);
        SubLObject count = htfile_header_item_count(header);
        count = Numbers.subtract(count, (SubLObject)file_hash_table.ONE_INTEGER);
        _csetf_htfile_header_item_count(header, count);
        write_fht_header(fht);
        return fht;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 57427L)
    public static SubLObject perform_fht_get(final SubLObject fht, final SubLObject key) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject status = fht_lookup_key(fht, key, (SubLObject)file_hash_table.UNPROVIDED);
        final SubLObject index = thread.secondMultipleValue();
        final SubLObject key_entry = thread.thirdMultipleValue();
        final SubLObject object_entry = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        final SubLObject pcase_var = status;
        if (pcase_var.eql((SubLObject)file_hash_table.$kw317$NOT_FOUND)) {
            return Values.values((SubLObject)file_hash_table.NIL, status);
        }
        if (pcase_var.eql((SubLObject)file_hash_table.$kw234$FOUND)) {
            complete_fht_object_entry_for_key(fht, key_entry, object_entry, (SubLObject)file_hash_table.UNPROVIDED);
            return Values.values(htfile_object_entry_data(object_entry), status);
        }
        if (pcase_var.eql((SubLObject)file_hash_table.$kw318$TABLE_FULL)) {
            Errors.error((SubLObject)file_hash_table.$str322$Can_neither_find_key__S_nor_prove, new SubLObject[] { key, index, status, key_entry });
        }
        else {
            Errors.error((SubLObject)file_hash_table.$str323$Cannot_get_key__S_from_table__Imp, new SubLObject[] { key, index, status, key_entry });
        }
        return fht;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 58510L)
    public static SubLObject htfile_file_block_entry_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_htfile_file_block_entry(v_object, stream, (SubLObject)file_hash_table.ZERO_INTEGER);
        return (SubLObject)file_hash_table.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 58510L)
    public static SubLObject htfile_file_block_entry_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $htfile_file_block_entry_native.class) ? file_hash_table.T : file_hash_table.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 58510L)
    public static SubLObject htfile_file_block_entry_size(final SubLObject v_object) {
        assert file_hash_table.NIL != htfile_file_block_entry_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 58510L)
    public static SubLObject htfile_file_block_entry_next(final SubLObject v_object) {
        assert file_hash_table.NIL != htfile_file_block_entry_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 58510L)
    public static SubLObject _csetf_htfile_file_block_entry_size(final SubLObject v_object, final SubLObject value) {
        assert file_hash_table.NIL != htfile_file_block_entry_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 58510L)
    public static SubLObject _csetf_htfile_file_block_entry_next(final SubLObject v_object, final SubLObject value) {
        assert file_hash_table.NIL != htfile_file_block_entry_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 58510L)
    public static SubLObject make_htfile_file_block_entry(SubLObject arglist) {
        if (arglist == file_hash_table.UNPROVIDED) {
            arglist = (SubLObject)file_hash_table.NIL;
        }
        final SubLObject v_new = (SubLObject)new $htfile_file_block_entry_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)file_hash_table.NIL, next = arglist; file_hash_table.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)file_hash_table.$kw95$SIZE)) {
                _csetf_htfile_file_block_entry_size(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)file_hash_table.$kw337$NEXT)) {
                _csetf_htfile_file_block_entry_next(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)file_hash_table.$str48$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 58510L)
    public static SubLObject visit_defstruct_htfile_file_block_entry(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)file_hash_table.$kw49$BEGIN, (SubLObject)file_hash_table.$sym338$MAKE_HTFILE_FILE_BLOCK_ENTRY, (SubLObject)file_hash_table.TWO_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)file_hash_table.$kw51$SLOT, (SubLObject)file_hash_table.$kw95$SIZE, htfile_file_block_entry_size(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)file_hash_table.$kw51$SLOT, (SubLObject)file_hash_table.$kw337$NEXT, htfile_file_block_entry_next(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)file_hash_table.$kw52$END, (SubLObject)file_hash_table.$sym338$MAKE_HTFILE_FILE_BLOCK_ENTRY, (SubLObject)file_hash_table.TWO_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 58510L)
    public static SubLObject visit_defstruct_object_htfile_file_block_entry_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_htfile_file_block_entry(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 58740L)
    public static SubLObject new_htfile_file_block_entry(SubLObject size) {
        if (size == file_hash_table.UNPROVIDED) {
            size = (SubLObject)file_hash_table.NIL;
        }
        final SubLObject file_block = make_htfile_file_block_entry((SubLObject)file_hash_table.UNPROVIDED);
        _csetf_htfile_file_block_entry_size(file_block, size);
        _csetf_htfile_file_block_entry_next(file_block, (SubLObject)file_hash_table.ZERO_INTEGER);
        return file_block;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 59141L)
    public static SubLObject print_htfile_file_block_entry(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        PrintLow.format(stream, (SubLObject)file_hash_table.$str340$__FILE_BLOCK_ENTRY__s__s_, htfile_file_block_entry_size(v_object), htfile_file_block_entry_next(v_object));
        return (SubLObject)file_hash_table.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 59422L)
    public static SubLObject copy_file_block(final SubLObject block_1, final SubLObject block_2) {
        _csetf_htfile_file_block_entry_size(block_2, htfile_file_block_entry_size(block_1));
        _csetf_htfile_file_block_entry_next(block_2, htfile_file_block_entry_next(block_1));
        return block_2;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 59792L)
    public static SubLObject write_file_block_entry_to_space(final SubLObject fht, final SubLObject file_block_entry, final SubLObject address) {
        final SubLObject stream = file_hash_table_stream(fht);
        streams_high.file_position(stream, address);
        if (!streams_high.file_position(stream, (SubLObject)file_hash_table.UNPROVIDED).numE(address)) {
            Errors.error((SubLObject)file_hash_table.$str341$Unable_to_position_to_file_pos__D, address, streams_high.file_position(stream, (SubLObject)file_hash_table.UNPROVIDED));
        }
        write_fht_uint4(stream, htfile_file_block_entry_size(file_block_entry));
        write_fht_uint8(stream, htfile_file_block_entry_next(file_block_entry));
        streams_high.force_output(stream);
        return fht;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 60378L)
    public static SubLObject read_file_block_entry_from_space(final SubLObject fht, final SubLObject file_block_entry, final SubLObject address) {
        final SubLObject stream = file_hash_table_stream(fht);
        streams_high.file_position(stream, address);
        if (!streams_high.file_position(stream, (SubLObject)file_hash_table.UNPROVIDED).numE(address)) {
            Errors.error((SubLObject)file_hash_table.$str342$Unable_to_position_to_file_pos__A, address, streams_high.file_position(stream, (SubLObject)file_hash_table.UNPROVIDED));
        }
        _csetf_htfile_file_block_entry_size(file_block_entry, read_fht_uint4(stream));
        _csetf_htfile_file_block_entry_next(file_block_entry, read_fht_uint8(stream));
        return file_block_entry;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 60969L)
    public static SubLObject deallocate_object_space(final SubLObject fht, final SubLObject address, final SubLObject space_available) {
        if (!space_available.numGE(file_hash_table.$htfile_minimal_file_block_size$.getGlobalValue())) {
            return fht;
        }
        final SubLObject fht_header = file_hash_table_header(fht);
        final SubLObject free_list_head = htfile_header_free_list_head(fht_header);
        final SubLObject file_block = new_htfile_file_block_entry(space_available);
        if (free_list_head.isPositive()) {
            final SubLObject new_free_list_head = insert_file_block_in_free_list(fht, free_list_head, file_block, address);
            _csetf_htfile_header_free_list_head(fht_header, new_free_list_head);
        }
        else {
            _csetf_htfile_header_free_list_head(fht_header, address);
            write_file_block_entry_to_space(fht, file_block, address);
        }
        return fht;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 62019L)
    public static SubLObject insert_file_block_in_free_list(final SubLObject fht, final SubLObject free_list_head, final SubLObject file_block, SubLObject file_block_address) {
        SubLObject prev_block = new_htfile_file_block_entry((SubLObject)file_hash_table.UNPROVIDED);
        SubLObject prev_block_address = free_list_head;
        final SubLObject next_block = new_htfile_file_block_entry((SubLObject)file_hash_table.UNPROVIDED);
        SubLObject doneP = (SubLObject)file_hash_table.NIL;
        if (file_block_address.numL(free_list_head)) {
            if (Numbers.add(file_block_address, htfile_file_block_entry_size(file_block)).numE(free_list_head)) {
                read_file_block_entry_from_space(fht, next_block, free_list_head);
                _csetf_htfile_file_block_entry_size(file_block, Numbers.add(htfile_file_block_entry_size(file_block), htfile_file_block_entry_size(next_block)));
                _csetf_htfile_file_block_entry_next(file_block, htfile_file_block_entry_next(next_block));
            }
            else {
                _csetf_htfile_file_block_entry_next(file_block, free_list_head);
            }
            write_file_block_entry_to_space(fht, file_block, file_block_address);
            return file_block_address;
        }
        while (file_hash_table.NIL == doneP && prev_block_address.numL(file_block_address)) {
            read_file_block_entry_from_space(fht, prev_block, prev_block_address);
            if (htfile_file_block_entry_next(prev_block).isPositive() && htfile_file_block_entry_next(prev_block).numL(file_block_address)) {
                prev_block_address = htfile_file_block_entry_next(prev_block);
            }
            else {
                doneP = (SubLObject)file_hash_table.T;
            }
        }
        _csetf_htfile_file_block_entry_next(file_block, htfile_file_block_entry_next(prev_block));
        _csetf_htfile_file_block_entry_next(prev_block, file_block_address);
        if (Numbers.add(prev_block_address, htfile_file_block_entry_size(prev_block)).numE(file_block_address)) {
            _csetf_htfile_file_block_entry_size(file_block, Numbers.add(htfile_file_block_entry_size(prev_block), htfile_file_block_entry_size(file_block)));
            file_block_address = prev_block_address;
            prev_block = (SubLObject)file_hash_table.NIL;
        }
        if (Numbers.add(file_block_address, htfile_file_block_entry_size(file_block)).numE(htfile_file_block_entry_next(file_block))) {
            read_file_block_entry_from_space(fht, next_block, htfile_file_block_entry_next(file_block));
            _csetf_htfile_file_block_entry_size(file_block, Numbers.add(htfile_file_block_entry_size(next_block), htfile_file_block_entry_size(file_block)));
            _csetf_htfile_file_block_entry_next(file_block, htfile_file_block_entry_next(next_block));
        }
        if (file_hash_table.NIL != htfile_file_block_entry_p(prev_block)) {
            write_file_block_entry_to_space(fht, prev_block, prev_block_address);
        }
        if (file_hash_table.NIL != htfile_file_block_entry_p(file_block)) {
            write_file_block_entry_to_space(fht, file_block, file_block_address);
        }
        return free_list_head;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 65486L)
    public static SubLObject allocate_object_space_from_free_list(final SubLObject fht, final SubLObject space_needed) {
        final SubLObject header = file_hash_table_header(fht);
        final SubLObject free_list_head = htfile_header_free_list_head(header);
        final SubLObject temp_block = new_htfile_file_block_entry((SubLObject)file_hash_table.UNPROVIDED);
        final SubLObject next_block = new_htfile_file_block_entry((SubLObject)file_hash_table.UNPROVIDED);
        SubLObject temp_block_address = free_list_head;
        SubLObject next_block_address = (SubLObject)file_hash_table.NIL;
        SubLObject leftover_space = (SubLObject)file_hash_table.NIL;
        SubLObject failP = (SubLObject)file_hash_table.NIL;
        SubLObject object_address = (SubLObject)file_hash_table.NIL;
        read_file_block_entry_from_space(fht, temp_block, temp_block_address);
        if (htfile_file_block_entry_size(temp_block).numGE(space_needed)) {
            object_address = temp_block_address;
            leftover_space = Numbers.subtract(htfile_file_block_entry_size(temp_block), space_needed);
            if (leftover_space.numL(file_hash_table.$htfile_minimal_file_block_size$.getGlobalValue())) {
                _csetf_htfile_header_free_list_head(header, htfile_file_block_entry_next(temp_block));
            }
            else {
                _csetf_htfile_file_block_entry_size(temp_block, leftover_space);
                temp_block_address = Numbers.add(temp_block_address, space_needed);
                write_file_block_entry_to_space(fht, temp_block, temp_block_address);
                _csetf_htfile_header_free_list_head(header, temp_block_address);
            }
            return object_address;
        }
        next_block_address = htfile_file_block_entry_next(temp_block);
        if (!next_block_address.isPositive()) {
            return (SubLObject)file_hash_table.NIL;
        }
        read_file_block_entry_from_space(fht, next_block, next_block_address);
        while (file_hash_table.NIL == failP && htfile_file_block_entry_size(next_block).numL(space_needed)) {
            temp_block_address = next_block_address;
            copy_file_block(next_block, temp_block);
            next_block_address = htfile_file_block_entry_next(temp_block);
            if (next_block_address.isPositive()) {
                read_file_block_entry_from_space(fht, next_block, next_block_address);
            }
            else {
                failP = (SubLObject)file_hash_table.T;
            }
        }
        if (file_hash_table.NIL == failP) {
            object_address = next_block_address;
            leftover_space = Numbers.subtract(htfile_file_block_entry_size(next_block), space_needed);
            if (leftover_space.numL(file_hash_table.$htfile_minimal_file_block_size$.getGlobalValue())) {
                _csetf_htfile_file_block_entry_next(temp_block, htfile_file_block_entry_next(next_block));
                write_file_block_entry_to_space(fht, temp_block, temp_block_address);
            }
            else {
                _csetf_htfile_file_block_entry_size(next_block, leftover_space);
                next_block_address = Numbers.add(next_block_address, space_needed);
                _csetf_htfile_file_block_entry_next(temp_block, next_block_address);
                write_file_block_entry_to_space(fht, temp_block, temp_block_address);
                write_file_block_entry_to_space(fht, next_block, next_block_address);
            }
        }
        return object_address;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 68833L)
    public static SubLObject write_initial_table(final SubLObject fht) {
        write_fht_header(fht);
        allocate_fht_heap_space(fht);
        allocate_fht_key_space(fht, (SubLObject)file_hash_table.UNPROVIDED);
        return fht;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 69287L)
    public static SubLObject allocate_fht_heap_space(final SubLObject fht) {
        final SubLObject stream = file_hash_table_stream(fht);
        final SubLObject header = file_hash_table_header(fht);
        final SubLObject object_space = htfile_header_object_space_offset(header);
        final SubLObject key_space = htfile_header_key_space_offset(header);
        compatibility.set_file_position(stream, object_space);
        streams_high.force_output(stream);
        compatibility.set_file_position(stream, key_space);
        streams_high.force_output(stream);
        return fht;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 69797L)
    public static SubLObject allocate_fht_key_space(final SubLObject fht, SubLObject capacity) {
        if (capacity == file_hash_table.UNPROVIDED) {
            capacity = (SubLObject)file_hash_table.NIL;
        }
        final SubLObject stream = file_hash_table_stream(fht);
        final SubLObject header = file_hash_table_header(fht);
        if (!capacity.isInteger()) {
            capacity = htfile_header_capacity(header);
        }
        SubLObject i;
        for (i = (SubLObject)file_hash_table.NIL, i = (SubLObject)file_hash_table.ZERO_INTEGER; i.numL(capacity); i = Numbers.add(i, (SubLObject)file_hash_table.ONE_INTEGER)) {
            write_key_entry_object(stream, file_hash_table.$fht_empty_key_entry$.getGlobalValue());
        }
        streams_high.force_output(stream);
        return fht;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 70360L)
    public static SubLObject htfile_minimal_space_required_for_key() {
        return file_hash_table.$htfile_key_entry_size$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 70452L)
    public static SubLObject fht_key_index_to_reladdr(final SubLObject index) {
        return Numbers.multiply(index, file_hash_table.$htfile_key_entry_size$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 70546L)
    public static SubLObject fht_keyspace_byte_size(final SubLObject capacity) {
        return fht_key_index_to_reladdr(capacity);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 70643L)
    public static SubLObject valid_heap_offset_p(final SubLObject offset, final SubLObject heap_start, final SubLObject heap_end) {
        return (SubLObject)SubLObjectFactory.makeBoolean(!offset.numL(heap_start) && offset.numL(heap_end));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 70788L)
    public static SubLObject valid_fht_heap_offset_p(final SubLObject offset, final SubLObject fht) {
        final SubLObject header = file_hash_table_header(fht);
        return valid_heap_offset_p(offset, htfile_header_object_space_offset(header), htfile_header_key_space_offset(header));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 71047L)
    public static SubLObject valid_offset_in_keyspace_p(final SubLObject offset, final SubLObject keyspace_offset, final SubLObject capacity) {
        return (SubLObject)SubLObjectFactory.makeBoolean(!offset.numL(keyspace_offset) && offset.numL(Numbers.add(keyspace_offset, fht_keyspace_byte_size(capacity))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 71254L)
    public static SubLObject fht_get_keyspace_size(final SubLObject fht) {
        final SubLObject header = file_hash_table_header(fht);
        return fht_keyspace_byte_size(htfile_header_capacity(header));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 71418L)
    public static SubLObject fht_key_reladdr_to_address(final SubLObject fht, final SubLObject reladdr) {
        return Numbers.add(reladdr, htfile_header_key_space_offset(file_hash_table_header(fht)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 71561L)
    public static SubLObject fht_key_index_to_address(final SubLObject fht, final SubLObject index) {
        final SubLObject key_offset = fht_key_index_to_reladdr(index);
        return fht_key_reladdr_to_address(fht, key_offset);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 71728L)
    public static SubLObject validate_fht_key_index(final SubLObject fht, final SubLObject index) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject key_capacity = htfile_header_capacity(file_hash_table_header(fht));
        if (file_hash_table.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (!index.isInteger() || index.isNegative() || !index.numL(key_capacity))) {
            Errors.error((SubLObject)file_hash_table.$str343$Invalid_key_index__D_into_key_spa, index, key_capacity);
        }
        return fht;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 72063L)
    public static SubLObject validate_fht_key_entry(final SubLObject fht, final SubLObject key_entry) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject key_space_start = htfile_header_key_space_offset(file_hash_table_header(fht));
        final SubLObject key_offset = htfile_key_entry_key_offset(key_entry);
        if (file_hash_table.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (file_hash_table.NIL == subl_promotions.non_negative_integer_p(key_offset) || !key_offset.numL(key_space_start))) {
            Errors.error((SubLObject)file_hash_table.$str344$Invalid_key_offset__A__points_pas, key_offset, key_space_start);
        }
        return fht;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 72482L)
    public static SubLObject write_key_entry_object(final SubLObject stream, final SubLObject key_entry) {
        write_fht_uint8(stream, htfile_key_entry_key_offset(key_entry));
        write_fht_uint4(stream, htfile_key_entry_hash_code(key_entry));
        return stream;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 72749L)
    public static SubLObject read_key_entry_object(final SubLObject stream, final SubLObject key_entry) {
        _csetf_htfile_key_entry_key_offset(key_entry, read_fht_uint8(stream));
        _csetf_htfile_key_entry_hash_code(key_entry, read_fht_uint4(stream));
        return key_entry;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 72974L)
    public static SubLObject fetch_fht_key_entry(final SubLObject fht, final SubLObject index, final SubLObject key_entry) {
        validate_fht_key_index(fht, index);
        final SubLObject address = fht_key_index_to_address(fht, index);
        final SubLObject stream = file_hash_table_stream(fht);
        streams_high.file_position(stream, address);
        read_key_entry_object(stream, key_entry);
        if (file_hash_table.NIL == htfile_key_entry_hash_code(key_entry)) {
            Errors.warn((SubLObject)file_hash_table.$str345$Index__A_has_null_hash_code_, index);
            _csetf_htfile_key_entry_hash_code(key_entry, htfile_key_entry_hash_code(file_hash_table.$fht_empty_key_entry$.getGlobalValue()));
        }
        if (file_hash_table.NIL == htfile_key_entry_key_offset(key_entry)) {
            Errors.warn((SubLObject)file_hash_table.$str346$Index__A_has_null_key_offset_, index);
            _csetf_htfile_key_entry_key_offset(key_entry, htfile_key_entry_key_offset(file_hash_table.$fht_empty_key_entry$.getGlobalValue()));
        }
        validate_fht_key_entry(fht, key_entry);
        return key_entry;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 73869L)
    public static SubLObject store_fht_key_entry(final SubLObject fht, final SubLObject index, final SubLObject key_entry, SubLObject should_flushP) {
        if (should_flushP == file_hash_table.UNPROVIDED) {
            should_flushP = (SubLObject)file_hash_table.T;
        }
        validate_fht_key_index(fht, index);
        validate_fht_key_entry(fht, key_entry);
        final SubLObject address = fht_key_index_to_address(fht, index);
        final SubLObject stream = file_hash_table_stream(fht);
        streams_high.file_position(stream, address);
        write_key_entry_object(stream, key_entry);
        if (file_hash_table.NIL != should_flushP) {
            streams_high.force_output(stream);
        }
        return key_entry;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 74495L)
    public static SubLObject fht_hash(final SubLObject key_code, final SubLObject fht) {
        final SubLObject capacity = htfile_header_capacity(file_hash_table_header(fht));
        final SubLObject size = Numbers.subtract(capacity, (SubLObject)file_hash_table.ONE_INTEGER);
        return Numbers.logand(Numbers.multiply(key_code, file_hash_table.$fht_hash_constant_a$.getGlobalValue()), size);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 74720L)
    public static SubLObject fht_ensure_hash_table_size(SubLObject size) {
        if (size.numL(file_hash_table.$fht_hash_step_size$.getGlobalValue())) {
            size = file_hash_table.$fht_hash_step_size$.getGlobalValue();
        }
        SubLObject i = file_hash_table.$fht_hash_next_step_pow2$.getGlobalValue();
        for (SubLObject fract = Numbers.integerDivide(Numbers.multiply(i, (SubLObject)file_hash_table.THREE_INTEGER), (SubLObject)file_hash_table.FOUR_INTEGER); fract.numL(size); fract = Numbers.integerDivide(Numbers.multiply(i, (SubLObject)file_hash_table.THREE_INTEGER), (SubLObject)file_hash_table.FOUR_INTEGER)) {
            i = Numbers.add(i, i);
        }
        return i;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 75019L)
    public static SubLObject fht_compute_fence_post_index(SubLObject index, final SubLObject fht) {
        SubLObject capacity;
        for (capacity = htfile_header_capacity(file_hash_table_header(fht)), index = Numbers.add(index, file_hash_table.$fht_hash_step_size$.getGlobalValue()); index.numGE(capacity); index = Numbers.subtract(index, capacity)) {}
        return index;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 75269L)
    public static SubLObject fht_step_key_index(SubLObject index, final SubLObject fht) {
        SubLObject capacity;
        for (capacity = htfile_header_capacity(file_hash_table_header(fht)), index = Numbers.subtract(index, file_hash_table.$fht_hash_step_size$.getGlobalValue()); index.isNegative(); index = Numbers.add(index, capacity)) {}
        return index;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 75504L)
    public static SubLObject fht_lookup_key(final SubLObject fht, final SubLObject key, SubLObject known_key_code) {
        if (known_key_code == file_hash_table.UNPROVIDED) {
            known_key_code = (SubLObject)file_hash_table.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject key_entry = make_htfile_key_entry((SubLObject)file_hash_table.UNPROVIDED);
        final SubLObject object_entry = make_htfile_object_entry((SubLObject)file_hash_table.UNPROVIDED);
        final SubLObject hash_fn = file_hash_table_hash_fn(fht);
        final SubLObject key_code = known_key_code.isNumber() ? known_key_code : fht_sxhash(key, hash_fn);
        SubLObject index = fht_hash(key_code, fht);
        final SubLObject wrap_around = fht_compute_fence_post_index(index, fht);
        SubLObject iterations = (SubLObject)file_hash_table.ZERO_INTEGER;
        final SubLObject done = (SubLObject)file_hash_table.NIL;
        if (file_hash_table.NIL != file_hash_table.$fht_lookup_stream$.getDynamicValue(thread)) {
            PrintLow.format(file_hash_table.$fht_lookup_stream$.getDynamicValue(thread), (SubLObject)file_hash_table.$str348$__FHT_LOOKUP__A_I__A__H__A___, new SubLObject[] { key, index, key_code });
        }
        while (file_hash_table.NIL == done) {
            fetch_fht_key_entry(fht, index, key_entry);
            iterations = Numbers.add(iterations, (SubLObject)file_hash_table.ONE_INTEGER);
            if (file_hash_table.NIL != is_empty_key_entryP(key_entry)) {
                _csetf_htfile_key_entry_hash_code(key_entry, key_code);
                if (file_hash_table.NIL != file_hash_table.$fht_lookup_stream$.getDynamicValue(thread)) {
                    PrintLow.format(file_hash_table.$fht_lookup_stream$.getDynamicValue(thread), (SubLObject)file_hash_table.$str349$__FHT_LOOKUP__empty_key_iter__A_L, iterations, index);
                }
                return Values.values((SubLObject)file_hash_table.$kw317$NOT_FOUND, index, key_entry, object_entry, iterations);
            }
            if (file_hash_table.NIL != identical_fht_key_entryP(fht, key, key_code, key_entry, object_entry)) {
                if (file_hash_table.NIL != file_hash_table.$fht_lookup_stream$.getDynamicValue(thread)) {
                    PrintLow.format(file_hash_table.$fht_lookup_stream$.getDynamicValue(thread), (SubLObject)file_hash_table.$str350$__FHT_LOOKUP__found_iter__A_LastI, iterations, index);
                }
                return Values.values((SubLObject)file_hash_table.$kw234$FOUND, index, key_entry, object_entry, iterations);
            }
            if (index.numE(wrap_around)) {
                if (file_hash_table.NIL != file_hash_table.$fht_lookup_stream$.getDynamicValue(thread)) {
                    PrintLow.format(file_hash_table.$fht_lookup_stream$.getDynamicValue(thread), (SubLObject)file_hash_table.$str351$__FHT_LOOKUP__table_full_iter__A_, iterations, index);
                }
                return Values.values((SubLObject)file_hash_table.$kw318$TABLE_FULL, index, key_entry, object_entry, iterations);
            }
            index = fht_step_key_index(index, fht);
            if (file_hash_table.NIL == file_hash_table.$fht_lookup_stream$.getDynamicValue(thread)) {
                continue;
            }
            PrintLow.format(file_hash_table.$fht_lookup_stream$.getDynamicValue(thread), (SubLObject)file_hash_table.$str352$__FHT_LOOKUP_probe_I__A__, index);
        }
        if (file_hash_table.NIL != file_hash_table.$fht_lookup_stream$.getDynamicValue(thread)) {
            PrintLow.format(file_hash_table.$fht_lookup_stream$.getDynamicValue(thread), (SubLObject)file_hash_table.$str353$__FHT_LOOKUP__error_iter__A_LastI, iterations, index);
        }
        return Values.values((SubLObject)file_hash_table.$kw223$ERROR, index, key_entry, object_entry, iterations);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 77282L)
    public static SubLObject identical_fht_key_entryP(final SubLObject fht, final SubLObject key, final SubLObject code, final SubLObject key_entry, final SubLObject object_entry) {
        final SubLObject testfn = file_hash_table_testfn(fht);
        final SubLObject address = htfile_key_entry_key_offset(key_entry);
        if (!code.numE(htfile_key_entry_hash_code(key_entry))) {
            return (SubLObject)file_hash_table.NIL;
        }
        read_object_entry_from_space(fht, object_entry, address, (SubLObject)file_hash_table.$kw315$KEY_ONLY);
        return Functions.funcall(testfn, key, htfile_object_entry_key(object_entry));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 77724L)
    public static SubLObject complete_fht_object_entry_for_key(final SubLObject fht, final SubLObject key_entry, final SubLObject object_entry, SubLObject style) {
        if (style == file_hash_table.UNPROVIDED) {
            style = (SubLObject)file_hash_table.$kw316$FULL;
        }
        final SubLObject address = htfile_key_entry_key_offset(key_entry);
        read_object_entry_from_space(fht, object_entry, address, style);
        return object_entry;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 77985L)
    public static SubLObject potentially_grow_fht_table(final SubLObject fht) {
        if (file_hash_table.NIL != is_fht_too_smallP(fht)) {
            perform_grow_fht_table(fht);
        }
        return fht;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 78431L)
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
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 78974L)
    public static SubLObject is_fht_too_smallP(final SubLObject fht) {
        final SubLObject header = file_hash_table_header(fht);
        final SubLObject count = htfile_header_item_count(header);
        final SubLObject capacity = htfile_header_capacity(header);
        return Numbers.numG(count, Numbers.integerDivide(Numbers.multiply(capacity, file_hash_table.$fht_dknuths_magic_cutoff$.getGlobalValue()), (SubLObject)file_hash_table.$int314$100));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 79252L)
    public static SubLObject resize_fht_object_and_key_spaces(final SubLObject fht) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject header = file_hash_table_header(fht);
        SubLObject capacity = htfile_header_capacity(header);
        capacity = Numbers.add(capacity, capacity);
        thread.resetMultipleValues();
        final SubLObject old_key_space = compute_new_htfile_heap_size(fht, (SubLObject)file_hash_table.UNPROVIDED);
        final SubLObject new_key_space = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return Values.values(new_key_space, capacity);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 79712L)
    public static SubLObject allocate_new_fht_key_space(final SubLObject fht, final SubLObject new_keyspace, final SubLObject new_capacity) {
        final SubLObject stream = file_hash_table_stream(fht);
        streams_high.file_position(stream, new_keyspace);
        allocate_fht_key_space(fht, new_capacity);
        return fht;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 80175L)
    public static SubLObject move_htfile_key_space(final SubLObject fht, SubLObject from, SubLObject to) {
        final SubLObject stream = file_hash_table_stream(fht);
        final SubLObject block = Vectors.make_vector(file_hash_table.$keyspace_move_size$.getGlobalValue(), (SubLObject)file_hash_table.UNPROVIDED);
        final SubLObject key_space_size = fht_get_keyspace_size(fht);
        final SubLObject full_blocks = Numbers.integerDivide(key_space_size, file_hash_table.$keyspace_move_size$.getGlobalValue());
        final SubLObject last_block_size = Numbers.mod(key_space_size, file_hash_table.$keyspace_move_size$.getGlobalValue());
        SubLObject i;
        for (i = (SubLObject)file_hash_table.NIL, i = (SubLObject)file_hash_table.ZERO_INTEGER; i.numL(full_blocks); i = Numbers.add(i, (SubLObject)file_hash_table.ONE_INTEGER)) {
            move_fht_binary_block(stream, block, file_hash_table.$keyspace_move_size$.getGlobalValue(), from, to);
            from = Numbers.add(from, file_hash_table.$keyspace_move_size$.getGlobalValue());
            to = Numbers.add(to, file_hash_table.$keyspace_move_size$.getGlobalValue());
        }
        if (last_block_size.isPositive()) {
            move_fht_binary_block(stream, block, last_block_size, from, to);
        }
        return fht;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 81128L)
    public static SubLObject rehash_fht_key_space(final SubLObject fht, final SubLObject new_keyspace, final SubLObject new_capacity) {
        final SubLObject header = file_hash_table_header(fht);
        final SubLObject key_entry = make_htfile_key_entry((SubLObject)file_hash_table.UNPROVIDED);
        final SubLObject temp_codes = Vectors.make_vector(file_hash_table.$keyspace_rehash_cache_size$.getGlobalValue(), (SubLObject)file_hash_table.UNPROVIDED);
        final SubLObject temp_offsets = Vectors.make_vector(file_hash_table.$keyspace_rehash_cache_size$.getGlobalValue(), (SubLObject)file_hash_table.UNPROVIDED);
        SubLObject items = (SubLObject)file_hash_table.ZERO_INTEGER;
        SubLObject cdotimes_end_var;
        SubLObject i;
        for (cdotimes_end_var = htfile_header_capacity(header), i = (SubLObject)file_hash_table.NIL, i = (SubLObject)file_hash_table.ZERO_INTEGER; i.numL(cdotimes_end_var); i = Numbers.add(i, (SubLObject)file_hash_table.ONE_INTEGER)) {
            fetch_fht_key_entry(fht, i, key_entry);
            if (file_hash_table.NIL == is_empty_key_entryP(key_entry)) {
                Vectors.set_aref(temp_codes, items, htfile_key_entry_hash_code(key_entry));
                Vectors.set_aref(temp_offsets, items, htfile_key_entry_key_offset(key_entry));
                items = Numbers.add(items, (SubLObject)file_hash_table.ONE_INTEGER);
            }
            if (items.numE(Sequences.length(temp_codes))) {
                rehash_fht_cached_keys(fht, temp_codes, temp_offsets, items, new_keyspace, new_capacity);
                items = (SubLObject)file_hash_table.ZERO_INTEGER;
            }
        }
        if (!items.isZero()) {
            rehash_fht_cached_keys(fht, temp_codes, temp_offsets, items, new_keyspace, new_capacity);
        }
        return fht;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 82311L)
    public static SubLObject with_different_keyspace(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_hash_table.$list355);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject fht = (SubLObject)file_hash_table.NIL;
        SubLObject diff_keyspace = (SubLObject)file_hash_table.NIL;
        SubLObject diff_capacity = (SubLObject)file_hash_table.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_hash_table.$list355);
        fht = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_hash_table.$list355);
        diff_keyspace = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_hash_table.$list355);
        diff_capacity = current.first();
        current = current.rest();
        if (file_hash_table.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject header_local = (SubLObject)file_hash_table.$sym356$HEADER_LOCAL;
            final SubLObject keyspace_temp = (SubLObject)file_hash_table.$sym357$KEYSPACE_TEMP;
            final SubLObject capacity_temp = (SubLObject)file_hash_table.$sym358$CAPACITY_TEMP;
            return (SubLObject)ConsesLow.listS((SubLObject)file_hash_table.$sym244$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(header_local, (SubLObject)ConsesLow.list((SubLObject)file_hash_table.$sym11$FILE_HASH_TABLE_HEADER, fht)), (SubLObject)ConsesLow.list(keyspace_temp, (SubLObject)ConsesLow.list((SubLObject)file_hash_table.$sym77$HTFILE_HEADER_KEY_SPACE_OFFSET, header_local)), (SubLObject)ConsesLow.list(capacity_temp, (SubLObject)ConsesLow.list((SubLObject)file_hash_table.$sym83$HTFILE_HEADER_CAPACITY, header_local))), (SubLObject)ConsesLow.list((SubLObject)file_hash_table.$sym359$CSETF, (SubLObject)ConsesLow.list((SubLObject)file_hash_table.$sym77$HTFILE_HEADER_KEY_SPACE_OFFSET, header_local), diff_keyspace), (SubLObject)ConsesLow.list((SubLObject)file_hash_table.$sym359$CSETF, (SubLObject)ConsesLow.list((SubLObject)file_hash_table.$sym83$HTFILE_HEADER_CAPACITY, header_local), diff_capacity), ConsesLow.append(body, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)file_hash_table.$sym359$CSETF, (SubLObject)ConsesLow.list((SubLObject)file_hash_table.$sym77$HTFILE_HEADER_KEY_SPACE_OFFSET, header_local), keyspace_temp), (SubLObject)ConsesLow.list((SubLObject)file_hash_table.$sym359$CSETF, (SubLObject)ConsesLow.list((SubLObject)file_hash_table.$sym83$HTFILE_HEADER_CAPACITY, header_local), capacity_temp))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)file_hash_table.$list355);
        return (SubLObject)file_hash_table.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 82995L)
    public static SubLObject rehash_fht_cached_keys(final SubLObject fht, final SubLObject code_buffer, final SubLObject offset_buffer, final SubLObject count, final SubLObject new_keyspace, final SubLObject new_capacity) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject object_entry = make_htfile_object_entry((SubLObject)file_hash_table.UNPROVIDED);
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
        for (i = (SubLObject)file_hash_table.NIL, i = (SubLObject)file_hash_table.ZERO_INTEGER; i.numL(count); i = Numbers.add(i, (SubLObject)file_hash_table.ONE_INTEGER)) {
            code = Vectors.aref(code_buffer, i);
            address = Vectors.aref(offset_buffer, i);
            key = (SubLObject)file_hash_table.NIL;
            read_object_entry_from_space(fht, object_entry, address, (SubLObject)file_hash_table.$kw315$KEY_ONLY);
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
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 83761L)
    public static SubLObject handle_rehash_fht_insert(final SubLObject fht, final SubLObject status, final SubLObject index, final SubLObject key_entry, final SubLObject offset) {
        if (status != file_hash_table.$kw317$NOT_FOUND) {
            Errors.error((SubLObject)file_hash_table.$str360$Internal_error__S_during_table_re, status);
        }
        _csetf_htfile_key_entry_key_offset(key_entry, offset);
        store_fht_key_entry(fht, index, key_entry, (SubLObject)file_hash_table.UNPROVIDED);
        return fht;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 84212L)
    public static SubLObject htfile_minimal_space_required_for_object() {
        return file_hash_table.$htfile_object_entry_size$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 84310L)
    public static SubLObject specify_object_entry(final SubLObject key, final SubLObject v_object, final SubLObject encoding_size_fn, SubLObject object_entry) {
        if (object_entry == file_hash_table.UNPROVIDED) {
            object_entry = (SubLObject)file_hash_table.NIL;
        }
        if (file_hash_table.NIL == htfile_object_entry_p(object_entry)) {
            object_entry = new_object_entry(key, v_object);
        }
        _csetf_htfile_object_entry_key(object_entry, key);
        _csetf_htfile_object_entry_data(object_entry, v_object);
        _csetf_htfile_object_entry_type(object_entry, (SubLObject)file_hash_table.$kw361$VALID);
        compute_object_entry_size(object_entry, encoding_size_fn);
        return object_entry;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 84755L)
    public static SubLObject compute_object_entry_size(final SubLObject object_entry, final SubLObject encoding_size_fn) {
        _csetf_htfile_object_entry_key_size(object_entry, Functions.funcall(encoding_size_fn, htfile_object_entry_key(object_entry)));
        _csetf_htfile_object_entry_data_size(object_entry, Functions.funcall(encoding_size_fn, htfile_object_entry_data(object_entry)));
        _csetf_htfile_object_entry_size(object_entry, Numbers.add(file_hash_table.$htfile_object_entry_size$.getGlobalValue(), htfile_object_entry_key_size(object_entry), htfile_object_entry_data_size(object_entry)));
        return object_entry;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 85317L)
    public static SubLObject allocate_object_space(final SubLObject fht, final SubLObject object_entry) {
        final SubLObject header = file_hash_table_header(fht);
        final SubLObject needed = htfile_object_entry_size(object_entry);
        SubLObject address = (SubLObject)file_hash_table.NIL;
        SubLObject new_heap_top = (SubLObject)file_hash_table.NIL;
        if (file_hash_table.NIL != file_hash_table_storage_resourcing_onP(fht) && htfile_header_free_list_head(header).isPositive()) {
            address = allocate_object_space_from_free_list(fht, needed);
            if (file_hash_table.NIL != address) {
                return address;
            }
        }
        address = htfile_header_current_heap_top(header);
        new_heap_top = Numbers.add(needed, address);
        if (new_heap_top.numG(htfile_header_key_space_offset(header))) {
            increase_htfile_heap_size(fht, new_heap_top);
            address = htfile_header_current_heap_top(header);
            new_heap_top = Numbers.add(needed, address);
        }
        _csetf_htfile_header_current_heap_top(header, new_heap_top);
        return address;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 86500L)
    public static SubLObject store_fht_object_entry(final SubLObject fht, final SubLObject address, final SubLObject object_entry) {
        return write_object_entry_to_space(fht, object_entry, address);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 86632L)
    public static SubLObject write_object_entry_to_space(final SubLObject fht, final SubLObject object_entry, final SubLObject address) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject stream = file_hash_table_stream(fht);
        final SubLObject encoding_output_fn = file_hash_table_encoding_output_fn(fht);
        if (!address.numE(streams_high.file_position(stream, (SubLObject)file_hash_table.UNPROVIDED))) {
            streams_high.file_position(stream, address);
            if (!streams_high.file_position(stream, (SubLObject)file_hash_table.UNPROVIDED).numE(address)) {
                Errors.error((SubLObject)file_hash_table.$str341$Unable_to_position_to_file_pos__D, address, streams_high.file_position(stream, (SubLObject)file_hash_table.UNPROVIDED));
            }
        }
        write_fht_uint4(stream, htfile_object_entry_size(object_entry));
        write_fht_uint4(stream, htfile_object_entry_key_size(object_entry));
        write_fht_uint4(stream, htfile_object_entry_data_size(object_entry));
        Functions.funcall(encoding_output_fn, htfile_object_entry_key(object_entry), stream);
        Functions.funcall(encoding_output_fn, htfile_object_entry_data(object_entry), stream);
        if (file_hash_table.NIL == file_hash_table.$fast_put_skip_output_forcing$.getDynamicValue(thread)) {
            streams_high.force_output(stream);
        }
        final SubLObject new_pos = streams_high.file_position(stream, (SubLObject)file_hash_table.UNPROVIDED);
        if (!new_pos.isInteger()) {
            Errors.error((SubLObject)file_hash_table.$str362$Cannot_correctly_determine_file_p, address);
        }
        if (new_pos.numL(address)) {
            Errors.error((SubLObject)file_hash_table.$str363$New_file_position__D_is_smaller_t, new_pos, address);
        }
        final SubLObject computed_size = htfile_object_entry_size(object_entry);
        final SubLObject actual_size = Numbers.subtract(new_pos, address);
        if (!computed_size.numE(actual_size)) {
            if (computed_size.numL(actual_size)) {
                Errors.error((SubLObject)file_hash_table.$str364$Instead_of__D_bytes__object_took_, computed_size, actual_size);
            }
            else if (computed_size.numG(actual_size)) {
                Errors.error((SubLObject)file_hash_table.$str365$Only__D_of_the_expected__D_bytes_, actual_size, computed_size);
            }
        }
        return fht;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 89018L)
    public static SubLObject read_object_entry_from_space(final SubLObject fht, final SubLObject object_entry, final SubLObject address, SubLObject style) {
        if (style == file_hash_table.UNPROVIDED) {
            style = (SubLObject)file_hash_table.$kw316$FULL;
        }
        final SubLObject stream = file_hash_table_stream(fht);
        final SubLObject encoding_input_fn = file_hash_table_encoding_input_fn(fht);
        streams_high.file_position(stream, address);
        if (!streams_high.file_position(stream, (SubLObject)file_hash_table.UNPROVIDED).numE(address)) {
            Errors.error((SubLObject)file_hash_table.$str342$Unable_to_position_to_file_pos__A, address, streams_high.file_position(stream, (SubLObject)file_hash_table.UNPROVIDED));
        }
        _csetf_htfile_object_entry_size(object_entry, read_fht_uint4(stream));
        _csetf_htfile_object_entry_key_size(object_entry, read_fht_uint4(stream));
        _csetf_htfile_object_entry_data_size(object_entry, read_fht_uint4(stream));
        _csetf_htfile_object_entry_key(object_entry, Functions.funcall(encoding_input_fn, stream));
        if (style != file_hash_table.$kw315$KEY_ONLY) {
            _csetf_htfile_object_entry_data(object_entry, Functions.funcall(encoding_input_fn, stream));
            final SubLObject new_pos = streams_high.file_position(stream, (SubLObject)file_hash_table.UNPROVIDED);
            final SubLObject claimed_size = htfile_object_entry_size(object_entry);
            final SubLObject actual_size = Numbers.subtract(new_pos, address);
            if (!claimed_size.numE(actual_size)) {
                Errors.error((SubLObject)file_hash_table.$str366$Claimed_object_size__D_did_not_ma, claimed_size, actual_size);
            }
        }
        return object_entry;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 90308L)
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
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 90935L)
    public static SubLObject compute_new_htfile_heap_size(final SubLObject fht, SubLObject minimal_size) {
        if (minimal_size == file_hash_table.UNPROVIDED) {
            minimal_size = (SubLObject)file_hash_table.NIL;
        }
        final SubLObject header = file_hash_table_header(fht);
        final SubLObject old_key_space = htfile_header_key_space_offset(header);
        SubLObject new_key_space = Numbers.add(old_key_space, old_key_space);
        if (file_hash_table.NIL == minimal_size) {
            minimal_size = new_key_space;
        }
        else {
            while (new_key_space.numL(minimal_size)) {
                new_key_space = Numbers.add(new_key_space, new_key_space);
            }
        }
        return Values.values(old_key_space, new_key_space);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 91746L)
    public static SubLObject register_file_table_header_support(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject vmajor = (SubLObject)file_hash_table.NIL;
        SubLObject vminor = (SubLObject)file_hash_table.NIL;
        SubLObject reader = (SubLObject)file_hash_table.NIL;
        SubLObject writer = (SubLObject)file_hash_table.NIL;
        SubLObject verifier = (SubLObject)file_hash_table.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_hash_table.$list368);
        vmajor = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_hash_table.$list368);
        vminor = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_hash_table.$list368);
        reader = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_hash_table.$list368);
        writer = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_hash_table.$list368);
        verifier = current.first();
        current = current.rest();
        if (file_hash_table.NIL == current) {
            final SubLObject tuple = (SubLObject)ConsesLow.cons(vmajor, vminor);
            SubLObject v_methods = (SubLObject)file_hash_table.NIL;
            v_methods = conses_high.acons((SubLObject)file_hash_table.$kw369$READER, reader, v_methods);
            v_methods = conses_high.acons((SubLObject)file_hash_table.$kw370$WRITER, writer, v_methods);
            v_methods = conses_high.acons((SubLObject)file_hash_table.$kw371$VERIFIER, verifier, v_methods);
            return (SubLObject)ConsesLow.list((SubLObject)file_hash_table.$sym372$SETHASH, tuple, (SubLObject)file_hash_table.$sym367$_FILE_HASH_TABLE_HEADERS_, v_methods);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)file_hash_table.$list368);
        return (SubLObject)file_hash_table.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 92123L)
    public static SubLObject read_fht_header(final SubLObject fht) {
        final SubLObject stream = file_hash_table_stream(fht);
        final SubLObject header = file_hash_table_header(fht);
        streams_high.file_position(stream, file_hash_table.$file_hash_table_header_position$.getGlobalValue());
        _csetf_htfile_header_size(header, read_fht_uint4(stream));
        _csetf_htfile_header_version_major(header, read_fht_uint4(stream));
        _csetf_htfile_header_version_minor(header, read_fht_uint4(stream));
        read_fht_header_version1p3(fht);
        return fht;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 92768L)
    public static SubLObject write_fht_header(final SubLObject fht) {
        final SubLObject stream = file_hash_table_stream(fht);
        final SubLObject header = file_hash_table_header(fht);
        streams_high.file_position(stream, file_hash_table.$file_hash_table_header_position$.getGlobalValue());
        write_fht_uint4(stream, htfile_header_size(header));
        write_fht_uint4(stream, htfile_header_version_major(header));
        write_fht_uint4(stream, htfile_header_version_minor(header));
        write_fht_header_version1p3(fht);
        streams_high.force_output(stream);
        return fht;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 93401L)
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
        }
        else {
            _csetf_htfile_header_extension_space(header, Vectors.make_vector((SubLObject)file_hash_table.ZERO_INTEGER, (SubLObject)file_hash_table.UNPROVIDED));
        }
        verify_version1p3_crc(fht);
        return fht;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 94450L)
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
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 95243L)
    public static SubLObject read_fht_extension_space(final SubLObject fht) {
        return fht;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 95346L)
    public static SubLObject write_fht_extension_space(final SubLObject fht) {
        return fht;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 95400L)
    public static SubLObject verify_version1p3_crc(final SubLObject fht) {
        return fht;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 95472L)
    public static SubLObject read_fht_uint4(final SubLObject stream) {
        return streams_high.read_byte_sequence_to_positive_integer((SubLObject)file_hash_table.FOUR_INTEGER, stream, (SubLObject)file_hash_table.T, (SubLObject)file_hash_table.NIL, (SubLObject)file_hash_table.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 95889L)
    public static SubLObject write_fht_uint4(final SubLObject stream, final SubLObject value) {
        return streams_high.write_positive_integer_as_byte_sequence(value, (SubLObject)file_hash_table.FOUR_INTEGER, stream, (SubLObject)file_hash_table.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 96303L)
    public static SubLObject read_fht_uint8(final SubLObject stream) {
        return streams_high.read_byte_sequence_to_positive_integer((SubLObject)file_hash_table.EIGHT_INTEGER, stream, (SubLObject)file_hash_table.T, (SubLObject)file_hash_table.NIL, (SubLObject)file_hash_table.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 96827L)
    public static SubLObject write_fht_uint8(final SubLObject stream, final SubLObject value) {
        return streams_high.write_positive_integer_as_byte_sequence(value, (SubLObject)file_hash_table.EIGHT_INTEGER, stream, (SubLObject)file_hash_table.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 97434L)
    public static SubLObject write_null_fht_bytes(final SubLObject stream, final SubLObject count) {
        SubLObject i;
        for (i = (SubLObject)file_hash_table.NIL, i = (SubLObject)file_hash_table.ZERO_INTEGER; i.numL(count); i = Numbers.add(i, (SubLObject)file_hash_table.ONE_INTEGER)) {
            streams_high.write_byte((SubLObject)file_hash_table.ZERO_INTEGER, stream);
        }
        return (SubLObject)file_hash_table.ZERO_INTEGER;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 97548L)
    public static SubLObject read_fht_encoded_object(final SubLObject stream, final SubLObject encoding_input_fn) {
        SubLObject size = (SubLObject)file_hash_table.NIL;
        SubLObject start = (SubLObject)file_hash_table.NIL;
        SubLObject v_object = (SubLObject)file_hash_table.NIL;
        size = read_fht_uint4(stream);
        start = streams_high.file_position(stream, (SubLObject)file_hash_table.UNPROVIDED);
        v_object = Functions.funcall(encoding_input_fn, stream);
        final SubLObject computed_spot = Numbers.add(size, start);
        final SubLObject real_spot = streams_high.file_position(stream, (SubLObject)file_hash_table.UNPROVIDED);
        if (!computed_spot.numE(real_spot)) {
            Errors.error((SubLObject)file_hash_table.$str381$After_reading__S__computed_positi, computed_spot, real_spot);
        }
        return Values.values(size, v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 98082L)
    public static SubLObject write_fht_encoded_object(final SubLObject stream, final SubLObject v_object, final SubLObject encoding_output_fn, final SubLObject encoding_size_fn) {
        final SubLObject computed_size = Functions.funcall(encoding_size_fn, v_object);
        SubLObject curr_pos = (SubLObject)file_hash_table.NIL;
        write_fht_uint4(stream, computed_size);
        curr_pos = streams_high.file_position(stream, (SubLObject)file_hash_table.UNPROVIDED);
        Functions.funcall(encoding_output_fn, v_object);
        final SubLObject end_pos = streams_high.file_position(stream, (SubLObject)file_hash_table.UNPROVIDED);
        final SubLObject actual_size = Numbers.subtract(end_pos, curr_pos);
        if (!actual_size.numE(computed_size)) {
            Errors.error((SubLObject)file_hash_table.$str382$Predicted_object_size__D_did_not_, computed_size, actual_size);
        }
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 98665L)
    public static SubLObject read_fht_binary_block(final SubLObject stream, final SubLObject block, final SubLObject size) {
        SubLObject i;
        SubLObject v_byte;
        for (i = (SubLObject)file_hash_table.NIL, i = (SubLObject)file_hash_table.ZERO_INTEGER; i.numL(size); i = Numbers.add(i, (SubLObject)file_hash_table.ONE_INTEGER)) {
            v_byte = streams_high.read_byte(stream, (SubLObject)file_hash_table.NIL, (SubLObject)file_hash_table.$kw383$EOF);
            if (v_byte == file_hash_table.$kw383$EOF) {
                return i;
            }
            Vectors.set_aref(block, i, v_byte);
        }
        return size;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 98988L)
    public static SubLObject write_fht_binary_block(final SubLObject stream, final SubLObject block, final SubLObject size) {
        SubLObject i;
        for (i = (SubLObject)file_hash_table.NIL, i = (SubLObject)file_hash_table.ZERO_INTEGER; i.numL(size); i = Numbers.add(i, (SubLObject)file_hash_table.ONE_INTEGER)) {
            streams_high.write_byte(Vectors.aref(block, i), stream);
        }
        streams_high.force_output(stream);
        return stream;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 99237L)
    public static SubLObject move_fht_binary_block(final SubLObject stream, final SubLObject block, final SubLObject size, final SubLObject from, final SubLObject to) {
        streams_high.file_position(stream, from);
        final SubLObject amount = read_fht_binary_block(stream, block, size);
        if (!amount.numE(size)) {
            Errors.error((SubLObject)file_hash_table.$str384$Premature_end_of_file_when_moving, size, from, to);
        }
        streams_high.file_position(stream, to);
        write_fht_binary_block(stream, block, size);
        return stream;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 100235L)
    public static SubLObject aggressive_fast_fht_optimization_modeP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return Equality.eq((SubLObject)file_hash_table.$kw385$AGGRESSIVE, file_hash_table.$fast_file_hash_table_optimization_mode$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 100431L)
    public static SubLObject moderate_fast_fht_optimization_modeP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return Equality.eq((SubLObject)file_hash_table.$kw386$MODERATE, file_hash_table.$fast_file_hash_table_optimization_mode$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 100629L)
    public static SubLObject conservative_fast_fht_optimization_modeP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return Equality.eq((SubLObject)file_hash_table.$kw387$CONSERVATIVE, file_hash_table.$fast_file_hash_table_optimization_mode$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 100825L)
    public static SubLObject invalid_fast_fht_optimization_mode() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return Errors.error((SubLObject)file_hash_table.$str388$Invalid_Fast_FHT_optimization_mod, file_hash_table.$fast_file_hash_table_optimization_mode$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 100994L)
    public static SubLObject fast_create_fht_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, (SubLObject)file_hash_table.ZERO_INTEGER);
        return (SubLObject)file_hash_table.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 100994L)
    public static SubLObject fast_create_fht_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $fast_create_fht_native.class) ? file_hash_table.T : file_hash_table.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 100994L)
    public static SubLObject fast_create_fht_fht(final SubLObject v_object) {
        assert file_hash_table.NIL != fast_create_fht_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 100994L)
    public static SubLObject fast_create_fht_tempstem(final SubLObject v_object) {
        assert file_hash_table.NIL != fast_create_fht_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 100994L)
    public static SubLObject fast_create_fht_tempfile(final SubLObject v_object) {
        assert file_hash_table.NIL != fast_create_fht_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 100994L)
    public static SubLObject fast_create_fht_keystream(final SubLObject v_object) {
        assert file_hash_table.NIL != fast_create_fht_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 100994L)
    public static SubLObject _csetf_fast_create_fht_fht(final SubLObject v_object, final SubLObject value) {
        assert file_hash_table.NIL != fast_create_fht_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 100994L)
    public static SubLObject _csetf_fast_create_fht_tempstem(final SubLObject v_object, final SubLObject value) {
        assert file_hash_table.NIL != fast_create_fht_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 100994L)
    public static SubLObject _csetf_fast_create_fht_tempfile(final SubLObject v_object, final SubLObject value) {
        assert file_hash_table.NIL != fast_create_fht_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 100994L)
    public static SubLObject _csetf_fast_create_fht_keystream(final SubLObject v_object, final SubLObject value) {
        assert file_hash_table.NIL != fast_create_fht_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 100994L)
    public static SubLObject make_fast_create_fht(SubLObject arglist) {
        if (arglist == file_hash_table.UNPROVIDED) {
            arglist = (SubLObject)file_hash_table.NIL;
        }
        final SubLObject v_new = (SubLObject)new $fast_create_fht_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)file_hash_table.NIL, next = arglist; file_hash_table.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)file_hash_table.$kw405$FHT)) {
                _csetf_fast_create_fht_fht(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)file_hash_table.$kw406$TEMPSTEM)) {
                _csetf_fast_create_fht_tempstem(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)file_hash_table.$kw407$TEMPFILE)) {
                _csetf_fast_create_fht_tempfile(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)file_hash_table.$kw408$KEYSTREAM)) {
                _csetf_fast_create_fht_keystream(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)file_hash_table.$str48$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 100994L)
    public static SubLObject visit_defstruct_fast_create_fht(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)file_hash_table.$kw49$BEGIN, (SubLObject)file_hash_table.$sym409$MAKE_FAST_CREATE_FHT, (SubLObject)file_hash_table.FOUR_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)file_hash_table.$kw51$SLOT, (SubLObject)file_hash_table.$kw405$FHT, fast_create_fht_fht(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)file_hash_table.$kw51$SLOT, (SubLObject)file_hash_table.$kw406$TEMPSTEM, fast_create_fht_tempstem(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)file_hash_table.$kw51$SLOT, (SubLObject)file_hash_table.$kw407$TEMPFILE, fast_create_fht_tempfile(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)file_hash_table.$kw51$SLOT, (SubLObject)file_hash_table.$kw408$KEYSTREAM, fast_create_fht_keystream(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)file_hash_table.$kw52$END, (SubLObject)file_hash_table.$sym409$MAKE_FAST_CREATE_FHT, (SubLObject)file_hash_table.FOUR_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 100994L)
    public static SubLObject visit_defstruct_object_fast_create_fht_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_fast_create_fht(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 101510L)
    public static SubLObject fast_create_file_hash_table(final SubLObject filename, SubLObject tempstem, SubLObject testfn, SubLObject serialization) {
        if (tempstem == file_hash_table.UNPROVIDED) {
            tempstem = (SubLObject)file_hash_table.$str307$tmp_;
        }
        if (testfn == file_hash_table.UNPROVIDED) {
            testfn = file_hash_table.$default_fht_test_function$.getGlobalValue();
        }
        if (serialization == file_hash_table.UNPROVIDED) {
            serialization = file_hash_table.$default_fht_serialization_protocol$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding(thread);
        final SubLObject _prev_bind_2 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding(thread);
        try {
            StreamsLow.$stream_initial_input_buffer_size$.bind(file_hash_table.$fast_fht_large_buffer_size$.getGlobalValue(), thread);
            StreamsLow.$stream_initial_output_buffer_size$.bind(StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue(thread), thread);
            final SubLObject fast_fht = make_fast_create_fht((SubLObject)file_hash_table.UNPROVIDED);
            final SubLObject fht = create_file_hash_table(filename, (SubLObject)file_hash_table.ONE_INTEGER, (SubLObject)file_hash_table.ONE_INTEGER, testfn, serialization);
            _csetf_fast_create_fht_fht(fast_fht, fht);
            _csetf_fast_create_fht_tempstem(fast_fht, tempstem);
            fast_create_allocate_keystream(fast_fht);
            fast_create_fixup_object_heap(fast_fht);
            return fast_fht;
        }
        finally {
            StreamsLow.$stream_initial_output_buffer_size$.rebind(_prev_bind_2, thread);
            StreamsLow.$stream_initial_input_buffer_size$.rebind(_prev_bind_0, thread);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 102345L)
    public static SubLObject fast_create_allocate_keystream(final SubLObject fast_fht) {
        final SubLObject tempfile = file_utilities.make_prefixed_temp_filename((SubLObject)file_hash_table.$str413$keystream_, fast_create_fht_tempstem(fast_fht));
        final SubLObject stream = compatibility.open_binary(tempfile, (SubLObject)file_hash_table.$kw218$IO);
        _csetf_fast_create_fht_tempfile(fast_fht, tempfile);
        _csetf_fast_create_fht_keystream(fast_fht, stream);
        return fast_fht;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 102682L)
    public static SubLObject fast_create_fixup_object_heap(final SubLObject fast_fht) {
        final SubLObject fht = fast_create_fht_fht(fast_fht);
        final SubLObject header = file_hash_table_header(fht);
        _csetf_htfile_header_key_space_offset(header, Numbers.subtract(Numbers.expt((SubLObject)file_hash_table.TWO_INTEGER, Numbers.multiply((SubLObject)file_hash_table.EIGHT_INTEGER, (SubLObject)file_hash_table.EIGHT_INTEGER)), (SubLObject)file_hash_table.ONE_INTEGER));
        return fast_fht;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 102983L)
    public static SubLObject fast_put_file_hash_table(final SubLObject key, final SubLObject fast_fht, final SubLObject value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject fht = fast_create_fht_fht(fast_fht);
        final SubLObject encoding_key_output_fn = file_hash_table_encoding_key_output_fn(fht);
        final SubLObject internal_key = Functions.funcall(encoding_key_output_fn, key);
        thread.resetMultipleValues();
        final SubLObject key_entry = perform_fast_fht_put(fht, internal_key, value);
        final SubLObject object_entry = thread.secondMultipleValue();
        thread.resetMultipleValues();
        update_fast_fht_keystream(fast_fht, internal_key, key_entry);
        return fast_fht;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 103457L)
    public static SubLObject perform_fast_fht_put(final SubLObject fht, final SubLObject key, final SubLObject value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject key_entry = make_htfile_key_entry((SubLObject)file_hash_table.UNPROVIDED);
        final SubLObject object_entry = make_htfile_object_entry((SubLObject)file_hash_table.UNPROVIDED);
        _csetf_htfile_key_entry_hash_code(key_entry, fht_sxhash_for_fht(fht, key));
        final SubLObject _prev_bind_0 = file_hash_table.$fast_put_skip_output_forcing$.currentBinding(thread);
        try {
            file_hash_table.$fast_put_skip_output_forcing$.bind((SubLObject)file_hash_table.T, thread);
            perform_fht_put_insert(fht, key, value, (SubLObject)file_hash_table.MINUS_ONE_INTEGER, key_entry, object_entry, (SubLObject)file_hash_table.NIL);
        }
        finally {
            file_hash_table.$fast_put_skip_output_forcing$.rebind(_prev_bind_0, thread);
        }
        return Values.values(key_entry, object_entry);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 103871L)
    public static SubLObject update_fast_fht_keystream(final SubLObject fast_fht, final SubLObject key, final SubLObject key_entry) {
        final SubLObject keystream = fast_create_fht_keystream(fast_fht);
        cfasl.cfasl_output(htfile_key_entry_hash_code(key_entry), keystream);
        cfasl.cfasl_output(htfile_key_entry_key_offset(key_entry), keystream);
        if (file_hash_table.NIL == aggressive_fast_fht_optimization_modeP()) {
            cfasl.cfasl_output(key, keystream);
        }
        return fast_fht;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 104282L)
    public static SubLObject finalize_fast_create_file_hash_table(final SubLObject fast_fht, SubLObject keep_temporary_keyfileP, SubLObject non_unique_key_handling) {
        if (keep_temporary_keyfileP == file_hash_table.UNPROVIDED) {
            keep_temporary_keyfileP = (SubLObject)file_hash_table.NIL;
        }
        if (non_unique_key_handling == file_hash_table.UNPROVIDED) {
            non_unique_key_handling = (SubLObject)file_hash_table.$kw223$ERROR;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (file_hash_table.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && file_hash_table.NIL == conses_high.member(non_unique_key_handling, (SubLObject)file_hash_table.$list414, (SubLObject)file_hash_table.UNPROVIDED, (SubLObject)file_hash_table.UNPROVIDED)) {
            Errors.error((SubLObject)file_hash_table.$str415$Unknown_NON_UNIQUE_KEY_HANDLING_v, non_unique_key_handling);
        }
        prepare_fast_fht_keyspace(fast_fht);
        file_hash_table_change_stream_buffer_size(fast_create_fht_fht(fast_fht), (SubLObject)file_hash_table.$int411$1024);
        thread.resetMultipleValues();
        final SubLObject set_file = insert_fast_fht_keystream_content(fast_fht, keep_temporary_keyfileP, non_unique_key_handling);
        final SubLObject collision_file = thread.secondMultipleValue();
        thread.resetMultipleValues();
        shutdown_fast_create_fht(fast_fht, (SubLObject)SubLObjectFactory.makeBoolean(file_hash_table.NIL == keep_temporary_keyfileP));
        if (file_hash_table.NIL == keep_temporary_keyfileP) {
            SubLObject ignore_errors_tag = (SubLObject)file_hash_table.NIL;
            try {
                thread.throwStack.push(file_hash_table.$kw416$IGNORE_ERRORS_TARGET);
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)file_hash_table.$sym417$IGNORE_ERRORS_HANDLER), thread);
                    try {
                        Filesys.delete_file(set_file);
                    }
                    catch (Throwable catch_var) {
                        Errors.handleThrowable(catch_var, (SubLObject)file_hash_table.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            }
            catch (Throwable ccatch_env_var) {
                ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)file_hash_table.$kw416$IGNORE_ERRORS_TARGET);
            }
            finally {
                thread.throwStack.pop();
            }
            ignore_errors_tag = (SubLObject)file_hash_table.NIL;
            try {
                thread.throwStack.push(file_hash_table.$kw416$IGNORE_ERRORS_TARGET);
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)file_hash_table.$sym417$IGNORE_ERRORS_HANDLER), thread);
                    try {
                        Filesys.delete_file(collision_file);
                    }
                    catch (Throwable catch_var) {
                        Errors.handleThrowable(catch_var, (SubLObject)file_hash_table.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            }
            catch (Throwable ccatch_env_var) {
                ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)file_hash_table.$kw416$IGNORE_ERRORS_TARGET);
            }
            finally {
                thread.throwStack.pop();
            }
        }
        return fast_fht;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 105287L)
    public static SubLObject prepare_fast_fht_keyspace(final SubLObject fast_fht) {
        final SubLObject fht = fast_create_fht_fht(fast_fht);
        realign_fast_fht_keyspace_offset(fht);
        realign_fast_fht_keyspace_capacity(fht);
        allocate_fast_fht_keyspace(fht);
        return fast_fht;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 105593L)
    public static SubLObject realign_fast_fht_keyspace_offset(final SubLObject fht) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject header = file_hash_table_header(fht);
        final SubLObject alignment = Numbers.expt((SubLObject)file_hash_table.TWO_INTEGER, file_hash_table.$fast_fht_keyspace_alignment$.getDynamicValue(thread));
        SubLObject heap_top = htfile_header_current_heap_top(header);
        heap_top = Numbers.add(heap_top, alignment);
        heap_top = Numbers.multiply(Numbers.add(Numbers.integerDivide(heap_top, alignment), (SubLObject)file_hash_table.ONE_INTEGER), alignment);
        _csetf_htfile_header_key_space_offset(header, heap_top);
        return fht;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 106069L)
    public static SubLObject realign_fast_fht_keyspace_capacity(final SubLObject fht) {
        final SubLObject header = file_hash_table_header(fht);
        _csetf_htfile_header_capacity(header, fht_ensure_hash_table_size(htfile_header_item_count(header)));
        return fht;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 106326L)
    public static SubLObject allocate_fast_fht_keyspace(final SubLObject fht) {
        final SubLObject header = file_hash_table_header(fht);
        final SubLObject new_keyspace = htfile_header_key_space_offset(header);
        final SubLObject new_capacity = htfile_header_capacity(header);
        if (file_hash_table.NIL == aggressive_fast_fht_optimization_modeP()) {
            allocate_new_fht_key_space(fht, new_keyspace, new_capacity);
        }
        write_fht_header(fht);
        return fht;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 106765L)
    public static SubLObject insert_fast_fht_keystream_content(final SubLObject fast_fht, SubLObject keep_temporary_keyfileP, SubLObject non_unique_key_handling) {
        if (keep_temporary_keyfileP == file_hash_table.UNPROVIDED) {
            keep_temporary_keyfileP = (SubLObject)file_hash_table.NIL;
        }
        if (non_unique_key_handling == file_hash_table.UNPROVIDED) {
            non_unique_key_handling = (SubLObject)file_hash_table.$kw223$ERROR;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject fht = fast_create_fht_fht(fast_fht);
        final SubLObject items = file_hash_table_count(fht);
        final SubLObject keystream = fast_create_fht_keystream(fast_fht);
        streams_high.force_output(keystream);
        compatibility.set_file_position(keystream, (SubLObject)file_hash_table.ZERO_INTEGER);
        try {
            final SubLObject _prev_bind_0 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding(thread);
            final SubLObject _prev_bind_2 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding(thread);
            try {
                StreamsLow.$stream_initial_input_buffer_size$.bind(file_hash_table.$fast_fht_large_buffer_size$.getGlobalValue(), thread);
                StreamsLow.$stream_initial_output_buffer_size$.bind(StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue(thread), thread);
                if (file_hash_table.NIL != conservative_fast_fht_optimization_modeP()) {
                    perform_fast_fht_insert_by_keystream_ordering(fast_fht, keystream, (SubLObject)file_hash_table.$str418$ambiguous, non_unique_key_handling);
                    return Values.values((SubLObject)file_hash_table.NIL, (SubLObject)file_hash_table.NIL);
                }
                if (file_hash_table.NIL != moderate_fast_fht_optimization_modeP() || file_hash_table.NIL != aggressive_fast_fht_optimization_modeP()) {
                    thread.resetMultipleValues();
                    final SubLObject set_file = fast_fht_sort_keystream_by_expected_index(fht, keystream, items, fast_create_fht_tempstem(fast_fht), (SubLObject)SubLObjectFactory.makeBoolean(file_hash_table.NIL == keep_temporary_keyfileP));
                    final SubLObject collision_file = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    SubLObject stream = (SubLObject)file_hash_table.NIL;
                    try {
                        final SubLObject _prev_bind_0_$14 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                        try {
                            stream_macros.$stream_requires_locking$.bind((SubLObject)file_hash_table.NIL, thread);
                            stream = compatibility.open_binary(set_file, (SubLObject)file_hash_table.$kw226$INPUT);
                        }
                        finally {
                            stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_$14, thread);
                        }
                        if (!stream.isStream()) {
                            Errors.error((SubLObject)file_hash_table.$str419$Unable_to_open__S, set_file);
                        }
                        final SubLObject stream_$15 = stream;
                        if (file_hash_table.NIL != moderate_fast_fht_optimization_modeP()) {
                            perform_fast_fht_insert_by_keystream_ordering(fast_fht, stream_$15, (SubLObject)file_hash_table.$str420$unambiguous, non_unique_key_handling);
                        }
                        else if (file_hash_table.NIL != aggressive_fast_fht_optimization_modeP()) {
                            perform_fast_fht_insert_of_unambiguous_keys(fast_fht, stream_$15);
                        }
                        else {
                            invalid_fast_fht_optimization_mode();
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$15 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)file_hash_table.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            if (stream.isStream()) {
                                streams_high.close(stream, (SubLObject)file_hash_table.UNPROVIDED);
                            }
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$15, thread);
                        }
                    }
                    file_hash_table_enable_memory_mapping(fast_create_fht_fht(fast_fht));
                    stream = (SubLObject)file_hash_table.NIL;
                    try {
                        final SubLObject _prev_bind_0_$16 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                        try {
                            stream_macros.$stream_requires_locking$.bind((SubLObject)file_hash_table.NIL, thread);
                            stream = compatibility.open_binary(collision_file, (SubLObject)file_hash_table.$kw226$INPUT);
                        }
                        finally {
                            stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_$16, thread);
                        }
                        if (!stream.isStream()) {
                            Errors.error((SubLObject)file_hash_table.$str419$Unable_to_open__S, collision_file);
                        }
                        final SubLObject stream_$16 = stream;
                        perform_fast_fht_insert_by_keystream_ordering(fast_fht, stream_$16, (SubLObject)file_hash_table.$str418$ambiguous, non_unique_key_handling);
                    }
                    finally {
                        final SubLObject _prev_bind_0_$17 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)file_hash_table.T, thread);
                            final SubLObject _values2 = Values.getValuesAsVector();
                            if (stream.isStream()) {
                                streams_high.close(stream, (SubLObject)file_hash_table.UNPROVIDED);
                            }
                            Values.restoreValuesFromVector(_values2);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$17, thread);
                        }
                    }
                    return Values.values(set_file, collision_file);
                }
                invalid_fast_fht_optimization_mode();
            }
            finally {
                StreamsLow.$stream_initial_output_buffer_size$.rebind(_prev_bind_2, thread);
                StreamsLow.$stream_initial_input_buffer_size$.rebind(_prev_bind_0, thread);
            }
        }
        finally {
            final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)file_hash_table.T, thread);
                final SubLObject _values3 = Values.getValuesAsVector();
                file_hash_table_change_stream_buffer_size(fast_create_fht_fht(fast_fht), file_hash_table.$fast_fht_small_buffer_size$.getGlobalValue());
                Values.restoreValuesFromVector(_values3);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return (SubLObject)file_hash_table.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 109170L)
    public static SubLObject perform_fast_fht_insert_of_unambiguous_keys(final SubLObject fast_fht, final SubLObject keystream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (file_hash_table.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && file_hash_table.NIL == aggressive_fast_fht_optimization_modeP()) {
            Errors.error((SubLObject)file_hash_table.$str421$Cannot_call_this_method_in_mode__, file_hash_table.$fast_file_hash_table_optimization_mode$.getDynamicValue(thread));
        }
        final SubLObject fht = fast_create_fht_fht(fast_fht);
        final SubLObject total = streams_high.file_length(keystream);
        final SubLObject msg = (SubLObject)file_hash_table.$str422$Seeding_keyspace_with_unambiguous;
        SubLObject doneP = (SubLObject)file_hash_table.NIL;
        file_hash_table_change_stream_buffer_size(fht, file_hash_table.$fast_fht_large_buffer_size$.getGlobalValue());
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)file_hash_table.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)file_hash_table.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)file_hash_table.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(msg);
                final SubLObject header = file_hash_table_header(fht);
                final SubLObject fht_stream = file_hash_table_stream(fht);
                final SubLObject key_entry = new_htfile_key_entry((SubLObject)file_hash_table.ZERO_INTEGER, (SubLObject)file_hash_table.UNPROVIDED);
                SubLObject prev_index = (SubLObject)file_hash_table.MINUS_ONE_INTEGER;
                final SubLObject keyspace = htfile_header_key_space_offset(header);
                compatibility.set_file_position(fht_stream, keyspace);
                while (file_hash_table.NIL == doneP) {
                    utilities_macros.note_percent_progress(streams_high.file_position(keystream, (SubLObject)file_hash_table.UNPROVIDED), total);
                    final SubLObject hashcode = cfasl.cfasl_input(keystream, (SubLObject)file_hash_table.NIL, (SubLObject)file_hash_table.$kw383$EOF);
                    final SubLObject offset = cfasl.cfasl_input(keystream, (SubLObject)file_hash_table.NIL, (SubLObject)file_hash_table.$kw383$EOF);
                    if (file_hash_table.$kw383$EOF == hashcode) {
                        doneP = (SubLObject)file_hash_table.T;
                    }
                    else {
                        final SubLObject index = fht_hash(hashcode, fht);
                        if (file_hash_table.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !prev_index.numL(index)) {
                            Errors.error((SubLObject)file_hash_table.$str423$Run_in_index_of_keystream__prev__, prev_index, index);
                        }
                        for (prev_index = Numbers.add(prev_index, (SubLObject)file_hash_table.ONE_INTEGER); prev_index.numL(index); prev_index = Numbers.add(prev_index, (SubLObject)file_hash_table.ONE_INTEGER)) {
                            write_key_entry_object(fht_stream, file_hash_table.$fht_empty_key_entry$.getGlobalValue());
                        }
                        _csetf_htfile_key_entry_hash_code(key_entry, hashcode);
                        _csetf_htfile_key_entry_key_offset(key_entry, offset);
                        write_key_entry_object(fht_stream, key_entry);
                    }
                }
                for (SubLObject capacity = htfile_header_capacity(header); prev_index.numL(capacity); prev_index = Numbers.add(prev_index, (SubLObject)file_hash_table.ONE_INTEGER)) {
                    write_key_entry_object(fht_stream, file_hash_table.$fht_empty_key_entry$.getGlobalValue());
                }
                streams_high.force_output(fht_stream);
            }
            finally {
                final SubLObject _prev_bind_0_$20 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)file_hash_table.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$20, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return fast_fht;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 111462L)
    public static SubLObject perform_fast_fht_insert_by_keystream_ordering(final SubLObject fast_fht, final SubLObject keystream, final SubLObject key_type, final SubLObject non_unique_key_handling) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject fht = fast_create_fht_fht(fast_fht);
        final SubLObject total = streams_high.file_length(keystream);
        final SubLObject msg = Sequences.cconcatenate((SubLObject)file_hash_table.$str424$Inserting_, new SubLObject[] { format_nil.format_nil_a_no_copy(key_type), file_hash_table.$str425$_keys_into_keyspace_____ });
        SubLObject doneP = (SubLObject)file_hash_table.NIL;
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)file_hash_table.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)file_hash_table.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)file_hash_table.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(msg);
                while (file_hash_table.NIL == doneP) {
                    utilities_macros.note_percent_progress(streams_high.file_position(keystream, (SubLObject)file_hash_table.UNPROVIDED), total);
                    final SubLObject hashcode = cfasl.cfasl_input(keystream, (SubLObject)file_hash_table.NIL, (SubLObject)file_hash_table.$kw383$EOF);
                    final SubLObject offset = cfasl.cfasl_input(keystream, (SubLObject)file_hash_table.NIL, (SubLObject)file_hash_table.$kw383$EOF);
                    final SubLObject key = cfasl.cfasl_input(keystream, (SubLObject)file_hash_table.NIL, (SubLObject)file_hash_table.$kw383$EOF);
                    if (file_hash_table.$kw383$EOF == offset) {
                        doneP = (SubLObject)file_hash_table.T;
                    }
                    else {
                        thread.resetMultipleValues();
                        final SubLObject status = fht_lookup_key(fht, key, hashcode);
                        final SubLObject index = thread.secondMultipleValue();
                        final SubLObject key_entry = thread.thirdMultipleValue();
                        final SubLObject object_entry = thread.fourthMultipleValue();
                        thread.resetMultipleValues();
                        if (status == file_hash_table.$kw317$NOT_FOUND) {
                            _csetf_htfile_key_entry_key_offset(key_entry, offset);
                            store_fht_key_entry(fht, index, key_entry, (SubLObject)file_hash_table.NIL);
                        }
                        else {
                            final SubLObject format_string = (SubLObject)file_hash_table.$str426$Sorry__key__A_appears_not_to_be_u;
                            if (non_unique_key_handling.eql((SubLObject)file_hash_table.$kw223$ERROR)) {
                                Errors.error(format_string, key);
                            }
                            else {
                                if (!non_unique_key_handling.eql((SubLObject)file_hash_table.$kw427$USE_FIRST)) {
                                    continue;
                                }
                                Errors.warn(format_string, key);
                            }
                        }
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$21 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)file_hash_table.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$21, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        streams_high.force_output(file_hash_table_stream(fht));
        return fast_fht;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 113160L)
    public static SubLObject shutdown_fast_create_fht(final SubLObject fast_fht, SubLObject cleanupP) {
        if (cleanupP == file_hash_table.UNPROVIDED) {
            cleanupP = (SubLObject)file_hash_table.NIL;
        }
        streams_high.close(fast_create_fht_keystream(fast_fht), (SubLObject)file_hash_table.UNPROVIDED);
        if (file_hash_table.NIL != cleanupP) {
            Filesys.delete_file(fast_create_fht_tempfile(fast_fht));
        }
        finalize_file_hash_table(fast_create_fht_fht(fast_fht));
        return fast_fht;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 113436L)
    public static SubLObject fast_fht_keystream_sorter_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, (SubLObject)file_hash_table.ZERO_INTEGER);
        return (SubLObject)file_hash_table.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 113436L)
    public static SubLObject fast_fht_keystream_sorter_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $fast_fht_keystream_sorter_native.class) ? file_hash_table.T : file_hash_table.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 113436L)
    public static SubLObject fstfht_ksorter_tempstem(final SubLObject v_object) {
        assert file_hash_table.NIL != fast_fht_keystream_sorter_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 113436L)
    public static SubLObject fstfht_ksorter_in_files(final SubLObject v_object) {
        assert file_hash_table.NIL != fast_fht_keystream_sorter_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 113436L)
    public static SubLObject fstfht_ksorter_out_files(final SubLObject v_object) {
        assert file_hash_table.NIL != fast_fht_keystream_sorter_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 113436L)
    public static SubLObject _csetf_fstfht_ksorter_tempstem(final SubLObject v_object, final SubLObject value) {
        assert file_hash_table.NIL != fast_fht_keystream_sorter_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 113436L)
    public static SubLObject _csetf_fstfht_ksorter_in_files(final SubLObject v_object, final SubLObject value) {
        assert file_hash_table.NIL != fast_fht_keystream_sorter_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 113436L)
    public static SubLObject _csetf_fstfht_ksorter_out_files(final SubLObject v_object, final SubLObject value) {
        assert file_hash_table.NIL != fast_fht_keystream_sorter_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 113436L)
    public static SubLObject make_fast_fht_keystream_sorter(SubLObject arglist) {
        if (arglist == file_hash_table.UNPROVIDED) {
            arglist = (SubLObject)file_hash_table.NIL;
        }
        final SubLObject v_new = (SubLObject)new $fast_fht_keystream_sorter_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)file_hash_table.NIL, next = arglist; file_hash_table.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)file_hash_table.$kw406$TEMPSTEM)) {
                _csetf_fstfht_ksorter_tempstem(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)file_hash_table.$kw442$IN_FILES)) {
                _csetf_fstfht_ksorter_in_files(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)file_hash_table.$kw443$OUT_FILES)) {
                _csetf_fstfht_ksorter_out_files(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)file_hash_table.$str48$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 113436L)
    public static SubLObject visit_defstruct_fast_fht_keystream_sorter(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)file_hash_table.$kw49$BEGIN, (SubLObject)file_hash_table.$sym444$MAKE_FAST_FHT_KEYSTREAM_SORTER, (SubLObject)file_hash_table.THREE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)file_hash_table.$kw51$SLOT, (SubLObject)file_hash_table.$kw406$TEMPSTEM, fstfht_ksorter_tempstem(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)file_hash_table.$kw51$SLOT, (SubLObject)file_hash_table.$kw442$IN_FILES, fstfht_ksorter_in_files(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)file_hash_table.$kw51$SLOT, (SubLObject)file_hash_table.$kw443$OUT_FILES, fstfht_ksorter_out_files(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)file_hash_table.$kw52$END, (SubLObject)file_hash_table.$sym444$MAKE_FAST_FHT_KEYSTREAM_SORTER, (SubLObject)file_hash_table.THREE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 113436L)
    public static SubLObject visit_defstruct_object_fast_fht_keystream_sorter_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_fast_fht_keystream_sorter(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 115124L)
    public static SubLObject fast_fht_sort_keystream_by_expected_index(final SubLObject fht, final SubLObject keystream, final SubLObject count, SubLObject temp_stem, SubLObject cleanupP) {
        if (temp_stem == file_hash_table.UNPROVIDED) {
            temp_stem = file_utilities.temp_directory();
        }
        if (cleanupP == file_hash_table.UNPROVIDED) {
            cleanupP = (SubLObject)file_hash_table.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject total_passes = Numbers.ceiling(Numbers.log(count, (SubLObject)file_hash_table.TWO_INTEGER), (SubLObject)file_hash_table.UNPROVIDED);
        final SubLObject fast_fht_sorter = new_fast_fht_keystream_sorter(temp_stem);
        SubLObject tile_count = (SubLObject)file_hash_table.NIL;
        SubLObject str = (SubLObject)file_hash_table.$str447$Prepare_tiled_input_files_____;
        SubLObject _prev_bind_0 = utilities_macros.$progress_start_time$.currentBinding(thread);
        SubLObject _prev_bind_2 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
        SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
        SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding(thread);
        SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
        SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding(thread);
        SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
        SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding(thread);
        try {
            utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
            utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
            utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
            utilities_macros.$progress_notification_count$.bind((SubLObject)file_hash_table.ZERO_INTEGER, thread);
            utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)file_hash_table.ZERO_INTEGER, thread);
            utilities_macros.$progress_count$.bind((SubLObject)file_hash_table.ZERO_INTEGER, thread);
            utilities_macros.$is_noting_progressP$.bind((SubLObject)file_hash_table.T, thread);
            utilities_macros.$silent_progressP$.bind((SubLObject)((file_hash_table.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : file_hash_table.T), thread);
            utilities_macros.noting_progress_preamble(str);
            tile_count = fast_fht_split_keystream_into_tiled_input_files(fast_fht_sorter, keystream, fht);
            utilities_macros.noting_progress_postamble();
        }
        finally {
            utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
            utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
            utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
            utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
            utilities_macros.$progress_notification_count$.rebind(_prev_bind_4, thread);
            utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
            utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_2, thread);
            utilities_macros.$progress_start_time$.rebind(_prev_bind_0, thread);
        }
        if (tile_count.numL((SubLObject)file_hash_table.THREE_INTEGER)) {
            str = (SubLObject)file_hash_table.$str448$Less_than_3_tiles__no_sort_needed;
            _prev_bind_0 = utilities_macros.$progress_start_time$.currentBinding(thread);
            _prev_bind_2 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
            _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
            _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding(thread);
            _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
            _prev_bind_6 = utilities_macros.$progress_count$.currentBinding(thread);
            _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
            _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding(thread);
            try {
                utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                utilities_macros.$progress_notification_count$.bind((SubLObject)file_hash_table.ZERO_INTEGER, thread);
                utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)file_hash_table.ZERO_INTEGER, thread);
                utilities_macros.$progress_count$.bind((SubLObject)file_hash_table.ZERO_INTEGER, thread);
                utilities_macros.$is_noting_progressP$.bind((SubLObject)file_hash_table.T, thread);
                utilities_macros.$silent_progressP$.bind((SubLObject)((file_hash_table.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : file_hash_table.T), thread);
                utilities_macros.noting_progress_preamble(str);
                final SubLObject temp_files = fstfht_ksorter_out_files(fast_fht_sorter);
                _csetf_fstfht_ksorter_out_files(fast_fht_sorter, fstfht_ksorter_in_files(fast_fht_sorter));
                _csetf_fstfht_ksorter_in_files(fast_fht_sorter, temp_files);
                utilities_macros.noting_progress_postamble();
            }
            finally {
                utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
                utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
                utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
                utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                utilities_macros.$progress_notification_count$.rebind(_prev_bind_4, thread);
                utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_2, thread);
                utilities_macros.$progress_start_time$.rebind(_prev_bind_0, thread);
            }
            if (tile_count.numE((SubLObject)file_hash_table.ONE_INTEGER)) {
                final SubLObject output_files = fstfht_ksorter_out_files(fast_fht_sorter);
                final SubLObject file_a = output_files.first();
                final SubLObject file_b = conses_high.second(output_files);
                final SubLObject empty_file = (file_hash_table.NIL != file_utilities.empty_file_p(file_a)) ? file_a : file_b;
                SubLObject stream = (SubLObject)file_hash_table.NIL;
                try {
                    final SubLObject _prev_bind_9 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                    try {
                        stream_macros.$stream_requires_locking$.bind((SubLObject)file_hash_table.NIL, thread);
                        stream = compatibility.open_binary(empty_file, (SubLObject)file_hash_table.$kw449$OUTPUT);
                    }
                    finally {
                        stream_macros.$stream_requires_locking$.rebind(_prev_bind_9, thread);
                    }
                    if (!stream.isStream()) {
                        Errors.error((SubLObject)file_hash_table.$str419$Unable_to_open__S, empty_file);
                    }
                    final SubLObject s = stream;
                    fast_fht_write_keystream_chunk_separator(s);
                }
                finally {
                    final SubLObject _prev_bind_10 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)file_hash_table.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        if (stream.isStream()) {
                            streams_high.close(stream, (SubLObject)file_hash_table.UNPROVIDED);
                        }
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_10, thread);
                    }
                }
            }
        }
        else {
            total_passes = Numbers.subtract(total_passes, file_hash_table.$fast_fht_keystream_tile_size_pow2$.getDynamicValue(thread));
            final SubLObject str2;
            final SubLObject msg = str2 = Sequences.cconcatenate((SubLObject)file_hash_table.$str450$Merge_sorting_keystream_of_, new SubLObject[] { format_nil.format_nil_a_no_copy(tile_count), file_hash_table.$str451$_tiles_in_, format_nil.format_nil_a_no_copy(total_passes), file_hash_table.$str452$_passes____ });
            final SubLObject _prev_bind_11 = utilities_macros.$progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_12 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
            final SubLObject _prev_bind_13 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
            final SubLObject _prev_bind_14 = utilities_macros.$progress_notification_count$.currentBinding(thread);
            final SubLObject _prev_bind_15 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
            final SubLObject _prev_bind_16 = utilities_macros.$progress_count$.currentBinding(thread);
            final SubLObject _prev_bind_17 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
            final SubLObject _prev_bind_18 = utilities_macros.$silent_progressP$.currentBinding(thread);
            try {
                utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                utilities_macros.$progress_notification_count$.bind((SubLObject)file_hash_table.ZERO_INTEGER, thread);
                utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)file_hash_table.ZERO_INTEGER, thread);
                utilities_macros.$progress_count$.bind((SubLObject)file_hash_table.ZERO_INTEGER, thread);
                utilities_macros.$is_noting_progressP$.bind((SubLObject)file_hash_table.T, thread);
                utilities_macros.$silent_progressP$.bind((SubLObject)((file_hash_table.NIL != str2) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : file_hash_table.T), thread);
                utilities_macros.noting_progress_preamble(str2);
                total_passes = Numbers.subtract(total_passes, (SubLObject)file_hash_table.ONE_INTEGER);
                fast_fht_almost_merge_sort_keystream(fht, fast_fht_sorter, total_passes);
                utilities_macros.noting_progress_postamble();
            }
            finally {
                utilities_macros.$silent_progressP$.rebind(_prev_bind_18, thread);
                utilities_macros.$is_noting_progressP$.rebind(_prev_bind_17, thread);
                utilities_macros.$progress_count$.rebind(_prev_bind_16, thread);
                utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_15, thread);
                utilities_macros.$progress_notification_count$.rebind(_prev_bind_14, thread);
                utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_13, thread);
                utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_12, thread);
                utilities_macros.$progress_start_time$.rebind(_prev_bind_11, thread);
            }
        }
        str = (SubLObject)file_hash_table.$str453$Generate_set_and_activity_files__;
        _prev_bind_0 = utilities_macros.$progress_start_time$.currentBinding(thread);
        _prev_bind_2 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
        _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
        _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding(thread);
        _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
        _prev_bind_6 = utilities_macros.$progress_count$.currentBinding(thread);
        _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
        _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding(thread);
        try {
            utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
            utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
            utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
            utilities_macros.$progress_notification_count$.bind((SubLObject)file_hash_table.ZERO_INTEGER, thread);
            utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)file_hash_table.ZERO_INTEGER, thread);
            utilities_macros.$progress_count$.bind((SubLObject)file_hash_table.ZERO_INTEGER, thread);
            utilities_macros.$is_noting_progressP$.bind((SubLObject)file_hash_table.T, thread);
            utilities_macros.$silent_progressP$.bind((SubLObject)((file_hash_table.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : file_hash_table.T), thread);
            utilities_macros.noting_progress_preamble(str);
            fast_fht_uniquify_keystream(fht, fast_fht_sorter);
            utilities_macros.noting_progress_postamble();
        }
        finally {
            utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
            utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
            utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
            utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
            utilities_macros.$progress_notification_count$.rebind(_prev_bind_4, thread);
            utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
            utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_2, thread);
            utilities_macros.$progress_start_time$.rebind(_prev_bind_0, thread);
        }
        if (file_hash_table.NIL != cleanupP) {
            SubLObject cdolist_list_var = fstfht_ksorter_out_files(fast_fht_sorter);
            SubLObject old_file = (SubLObject)file_hash_table.NIL;
            old_file = cdolist_list_var.first();
            while (file_hash_table.NIL != cdolist_list_var) {
                Filesys.delete_file(old_file);
                cdolist_list_var = cdolist_list_var.rest();
                old_file = cdolist_list_var.first();
            }
        }
        final SubLObject result_files = fstfht_ksorter_in_files(fast_fht_sorter);
        return Values.values(result_files.first(), conses_high.second(result_files));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 118318L)
    public static SubLObject new_fast_fht_keystream_sorter(final SubLObject temp_stem) {
        final SubLObject fast_fht_sorter = make_fast_fht_keystream_sorter((SubLObject)file_hash_table.UNPROVIDED);
        _csetf_fstfht_ksorter_tempstem(fast_fht_sorter, temp_stem);
        _csetf_fstfht_ksorter_in_files(fast_fht_sorter, fast_fht_n_temp_files((SubLObject)file_hash_table.TWO_INTEGER, (SubLObject)file_hash_table.$str454$in_, temp_stem));
        _csetf_fstfht_ksorter_out_files(fast_fht_sorter, fast_fht_n_temp_files((SubLObject)file_hash_table.TWO_INTEGER, (SubLObject)file_hash_table.$str455$out_, temp_stem));
        return fast_fht_sorter;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 118725L)
    public static SubLObject fast_fht_n_temp_files(final SubLObject n, final SubLObject prefix, final SubLObject temp_stem) {
        SubLObject files = (SubLObject)file_hash_table.NIL;
        SubLObject i;
        for (i = (SubLObject)file_hash_table.NIL, i = (SubLObject)file_hash_table.ZERO_INTEGER; i.numL(n); i = Numbers.add(i, (SubLObject)file_hash_table.ONE_INTEGER)) {
            files = (SubLObject)ConsesLow.cons(file_utilities.make_prefixed_temp_filename(prefix, temp_stem), files);
        }
        return files;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 118963L)
    public static SubLObject fast_fht_split_keystream_into_tiled_input_files(final SubLObject fast_fht_sorter, final SubLObject keystream, final SubLObject fht) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject file_queue = queues.create_queue((SubLObject)file_hash_table.UNPROVIDED);
        SubLObject tile_counter = (SubLObject)file_hash_table.ZERO_INTEGER;
        SubLObject tile = (SubLObject)file_hash_table.NIL;
        SubLObject doneP = (SubLObject)file_hash_table.NIL;
        if (file_hash_table.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !streams_high.file_position(keystream, (SubLObject)file_hash_table.UNPROVIDED).isZero()) {
            Errors.error((SubLObject)file_hash_table.$str456$Can_only_work_from_a_rewound_keys, keystream);
        }
        final SubLObject tile_size = Numbers.expt((SubLObject)file_hash_table.TWO_INTEGER, file_hash_table.$fast_fht_keystream_tile_size_pow2$.getDynamicValue(thread));
        tile = Vectors.make_vector(tile_size, (SubLObject)file_hash_table.NIL);
        SubLObject cdolist_list_var = fstfht_ksorter_in_files(fast_fht_sorter);
        SubLObject file_name = (SubLObject)file_hash_table.NIL;
        file_name = cdolist_list_var.first();
        while (file_hash_table.NIL != cdolist_list_var) {
            file_utilities.truncate_file(file_name);
            queues.enqueue(file_name, file_queue);
            cdolist_list_var = cdolist_list_var.rest();
            file_name = cdolist_list_var.first();
        }
        while (file_hash_table.NIL == doneP) {
            SubLObject cdotimes_end_var;
            SubLObject i;
            SubLObject old_result;
            SubLObject new_result;
            for (cdotimes_end_var = Sequences.length(tile), i = (SubLObject)file_hash_table.NIL, i = (SubLObject)file_hash_table.ZERO_INTEGER; i.numL(cdotimes_end_var); i = Numbers.add(i, (SubLObject)file_hash_table.ONE_INTEGER)) {
                old_result = Vectors.aref(tile, i);
                new_result = fast_fht_read_one_keystream_entry(keystream, fht, old_result);
                Vectors.set_aref(tile, i, new_result);
                doneP = Equality.eq((SubLObject)file_hash_table.$kw383$EOF, new_result.first());
            }
            Sort.sort(tile, (SubLObject)file_hash_table.$sym457$FAST_FHT_KEYSTREAM_ENTRY_, (SubLObject)file_hash_table.UNPROVIDED);
            final SubLObject file = queues.requeue(file_queue);
            fast_fht_write_one_keystream_tile(file, tile);
            tile_counter = Numbers.add(tile_counter, (SubLObject)file_hash_table.ONE_INTEGER);
        }
        return tile_counter;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 120419L)
    public static SubLObject fast_fht_read_one_keystream_entry(final SubLObject keystream, final SubLObject fht, SubLObject result) {
        if (result == file_hash_table.UNPROVIDED) {
            result = (SubLObject)file_hash_table.NIL;
        }
        result = fast_fht_keystream_eof_entry(result);
        final SubLObject hashcode = cfasl.cfasl_input(keystream, (SubLObject)file_hash_table.NIL, (SubLObject)file_hash_table.$kw383$EOF);
        if (hashcode.isNumber()) {
            if (file_hash_table.$fast_fht_sentinel_hashcode_value$.getGlobalValue().numE(hashcode)) {
                ConsesLow.set_nth((SubLObject)file_hash_table.ZERO_INTEGER, result, file_hash_table.$fast_fht_sentinel_index_value$.getGlobalValue());
            }
            else {
                ConsesLow.set_nth((SubLObject)file_hash_table.ZERO_INTEGER, result, fht_hash(hashcode, fht));
            }
            ConsesLow.set_nth((SubLObject)file_hash_table.ONE_INTEGER, result, hashcode);
            ConsesLow.set_nth((SubLObject)file_hash_table.TWO_INTEGER, result, cfasl.cfasl_input(keystream, (SubLObject)file_hash_table.UNPROVIDED, (SubLObject)file_hash_table.UNPROVIDED));
            if (file_hash_table.NIL == aggressive_fast_fht_optimization_modeP()) {
                ConsesLow.set_nth((SubLObject)file_hash_table.THREE_INTEGER, result, cfasl.cfasl_input(keystream, (SubLObject)file_hash_table.UNPROVIDED, (SubLObject)file_hash_table.UNPROVIDED));
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 121119L)
    public static SubLObject fast_fht_keystream_sentinel_entry(SubLObject result) {
        if (result == file_hash_table.UNPROVIDED) {
            result = (SubLObject)file_hash_table.NIL;
        }
        if (!result.isCons()) {
            final SubLObject size = (SubLObject)((file_hash_table.NIL != aggressive_fast_fht_optimization_modeP()) ? file_hash_table.THREE_INTEGER : file_hash_table.FOUR_INTEGER);
            result = (SubLObject)ConsesLow.make_list(size, (SubLObject)file_hash_table.UNPROVIDED);
        }
        ConsesLow.set_nth((SubLObject)file_hash_table.ZERO_INTEGER, result, file_hash_table.$fast_fht_sentinel_index_value$.getGlobalValue());
        ConsesLow.set_nth((SubLObject)file_hash_table.ONE_INTEGER, result, file_hash_table.$fast_fht_sentinel_hashcode_value$.getGlobalValue());
        ConsesLow.set_nth((SubLObject)file_hash_table.TWO_INTEGER, result, file_hash_table.$fast_fht_sentinel_hashcode_value$.getGlobalValue());
        if (file_hash_table.NIL == aggressive_fast_fht_optimization_modeP()) {
            ConsesLow.set_nth((SubLObject)file_hash_table.THREE_INTEGER, result, file_hash_table.$fast_fht_sentinel_hashcode_value$.getGlobalValue());
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 121618L)
    public static SubLObject fast_fht_keystream_eof_entry(SubLObject result) {
        if (result == file_hash_table.UNPROVIDED) {
            result = (SubLObject)file_hash_table.NIL;
        }
        final SubLObject size = (SubLObject)((file_hash_table.NIL != aggressive_fast_fht_optimization_modeP()) ? file_hash_table.THREE_INTEGER : file_hash_table.FOUR_INTEGER);
        if (!result.isCons()) {
            result = (SubLObject)ConsesLow.make_list(size, (SubLObject)file_hash_table.UNPROVIDED);
        }
        SubLObject i;
        for (i = (SubLObject)file_hash_table.NIL, i = (SubLObject)file_hash_table.ZERO_INTEGER; i.numL(size); i = Numbers.add(i, (SubLObject)file_hash_table.ONE_INTEGER)) {
            ConsesLow.set_nth(i, result, (SubLObject)file_hash_table.$kw383$EOF);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 121922L)
    public static SubLObject fast_fht_keystream_entry_cmp(final SubLObject entry_a, final SubLObject entry_b) {
        final SubLObject index_a = entry_a.first();
        final SubLObject index_b = entry_b.first();
        if (index_a == file_hash_table.$kw383$EOF) {
            return (SubLObject)((index_b == file_hash_table.$kw383$EOF) ? file_hash_table.$kw458$EQ : file_hash_table.$kw459$GT);
        }
        if (index_b == file_hash_table.$kw383$EOF) {
            return (SubLObject)file_hash_table.$kw460$LT;
        }
        if (index_a.numL(index_b)) {
            return (SubLObject)file_hash_table.$kw460$LT;
        }
        if (index_b.numL(index_a)) {
            return (SubLObject)file_hash_table.$kw459$GT;
        }
        final SubLObject offset_a = ConsesLow.nth((SubLObject)file_hash_table.TWO_INTEGER, entry_a);
        final SubLObject offset_b = ConsesLow.nth((SubLObject)file_hash_table.TWO_INTEGER, entry_b);
        if (offset_a.numL(offset_b)) {
            return (SubLObject)file_hash_table.$kw460$LT;
        }
        if (offset_b.numL(offset_a)) {
            return (SubLObject)file_hash_table.$kw459$GT;
        }
        return (SubLObject)file_hash_table.$kw458$EQ;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 122942L)
    public static SubLObject fast_fht_keystream_entryL(final SubLObject entry_a, final SubLObject entry_b) {
        return Equality.eq((SubLObject)file_hash_table.$kw460$LT, fast_fht_keystream_entry_cmp(entry_a, entry_b));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 123140L)
    public static SubLObject fast_fht_write_one_keystream_tile(final SubLObject file, final SubLObject tile) {
        final SubLObject stream = compatibility.open_binary(file, (SubLObject)file_hash_table.$kw461$APPEND);
        SubLObject doneP = (SubLObject)file_hash_table.NIL;
        final SubLObject backwardP_var = (SubLObject)file_hash_table.NIL;
        final SubLObject length = Sequences.length(tile);
        SubLObject current;
        final SubLObject datum = current = (SubLObject)((file_hash_table.NIL != backwardP_var) ? ConsesLow.list(Numbers.subtract(length, (SubLObject)file_hash_table.ONE_INTEGER), (SubLObject)file_hash_table.MINUS_ONE_INTEGER, (SubLObject)file_hash_table.MINUS_ONE_INTEGER) : ConsesLow.list((SubLObject)file_hash_table.ZERO_INTEGER, length, (SubLObject)file_hash_table.ONE_INTEGER));
        SubLObject start = (SubLObject)file_hash_table.NIL;
        SubLObject end = (SubLObject)file_hash_table.NIL;
        SubLObject delta = (SubLObject)file_hash_table.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_hash_table.$list462);
        start = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_hash_table.$list462);
        end = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_hash_table.$list462);
        delta = current.first();
        current = current.rest();
        if (file_hash_table.NIL == current) {
            if (file_hash_table.NIL == doneP) {
                SubLObject end_var;
                SubLObject element_num;
                SubLObject entry;
                for (end_var = end, element_num = (SubLObject)file_hash_table.NIL, element_num = start; file_hash_table.NIL == doneP && file_hash_table.NIL == subl_macros.do_numbers_endtest(element_num, delta, end_var); element_num = Numbers.add(element_num, delta)) {
                    entry = Vectors.aref(tile, element_num);
                    if (file_hash_table.NIL != is_fast_fht_keystream_eofP(entry)) {
                        doneP = (SubLObject)file_hash_table.T;
                    }
                    else {
                        fast_fht_write_one_keystream_entry(stream, entry);
                    }
                }
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)file_hash_table.$list462);
        }
        fast_fht_write_keystream_chunk_separator(stream);
        streams_high.close(stream, (SubLObject)file_hash_table.UNPROVIDED);
        return file;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 123594L)
    public static SubLObject is_fast_fht_keystream_chunk_separator_entryP(final SubLObject entry) {
        final SubLObject index = entry.first();
        return (SubLObject)SubLObjectFactory.makeBoolean(index.isNumber() && file_hash_table.$fast_fht_sentinel_index_value$.getGlobalValue().numE(index));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 123789L)
    public static SubLObject is_fast_fht_keystream_eofP(final SubLObject entry) {
        return Equality.eq((SubLObject)file_hash_table.$kw383$EOF, entry.first());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 123874L)
    public static SubLObject fast_fht_write_keystream_chunk_separator(final SubLObject stream) {
        final SubLObject sentinel = file_hash_table.$fast_fht_sentinel_hashcode_value$.getGlobalValue();
        fast_fht_write_keystream_entry(stream, sentinel, sentinel, sentinel);
        return stream;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 124086L)
    public static SubLObject fast_fht_write_keystream_entry(final SubLObject stream, final SubLObject hashcode, final SubLObject offset, SubLObject key) {
        if (key == file_hash_table.UNPROVIDED) {
            key = (SubLObject)file_hash_table.NIL;
        }
        cfasl.cfasl_output(hashcode, stream);
        cfasl.cfasl_output(offset, stream);
        if (file_hash_table.NIL == aggressive_fast_fht_optimization_modeP()) {
            cfasl.cfasl_output(key, stream);
        }
        return stream;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 124337L)
    public static SubLObject fast_fht_write_one_keystream_entry(final SubLObject stream, final SubLObject entry) {
        return fast_fht_write_keystream_entry(stream, ConsesLow.nth((SubLObject)file_hash_table.ONE_INTEGER, entry), ConsesLow.nth((SubLObject)file_hash_table.TWO_INTEGER, entry), (SubLObject)((file_hash_table.NIL != aggressive_fast_fht_optimization_modeP()) ? file_hash_table.NIL : ConsesLow.nth((SubLObject)file_hash_table.THREE_INTEGER, entry)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 124936L)
    public static SubLObject fast_fht_write_one_collision_stream_entry(final SubLObject fht, final SubLObject coll_stream, final SubLObject entry) {
        if (file_hash_table.NIL != aggressive_fast_fht_optimization_modeP()) {
            final SubLObject address = ConsesLow.nth((SubLObject)file_hash_table.TWO_INTEGER, entry);
            final SubLObject object_entry = make_htfile_object_entry((SubLObject)file_hash_table.UNPROVIDED);
            read_object_entry_from_space(fht, object_entry, address, (SubLObject)file_hash_table.$kw315$KEY_ONLY);
            cfasl.cfasl_output(ConsesLow.nth((SubLObject)file_hash_table.ONE_INTEGER, entry), coll_stream);
            cfasl.cfasl_output(ConsesLow.nth((SubLObject)file_hash_table.TWO_INTEGER, entry), coll_stream);
            cfasl.cfasl_output(htfile_object_entry_key(object_entry), coll_stream);
        }
        else {
            fast_fht_write_one_keystream_entry(coll_stream, entry);
        }
        return fht;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 125780L)
    public static SubLObject fast_fht_almost_merge_sort_keystream(final SubLObject fht, final SubLObject fast_fht_sorter, SubLObject passes) {
        if (passes == file_hash_table.UNPROVIDED) {
            passes = (SubLObject)file_hash_table.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject input_files = fstfht_ksorter_in_files(fast_fht_sorter);
        SubLObject output_files = fstfht_ksorter_out_files(fast_fht_sorter);
        final SubLObject last_chunk_count = Numbers.$most_positive_fixnum$.getGlobalValue();
        final SubLObject passes_msg = (SubLObject)(passes.isNumber() ? Sequences.cconcatenate((SubLObject)file_hash_table.$str463$_of_, format_nil.format_nil_a_no_copy(passes)) : file_hash_table.$str309$);
        SubLObject pass = (SubLObject)file_hash_table.ZERO_INTEGER;
        SubLObject doneP = (SubLObject)file_hash_table.NIL;
        while (file_hash_table.NIL == doneP) {
            pass = Numbers.add(pass, (SubLObject)file_hash_table.ONE_INTEGER);
            final SubLObject activity_msg = Sequences.cconcatenate((SubLObject)file_hash_table.$str464$Merge_Pass_, new SubLObject[] { format_nil.format_nil_a_no_copy(pass), format_nil.format_nil_a_no_copy(passes_msg) });
            SubLObject chunk_count = (SubLObject)file_hash_table.NIL;
            final SubLObject str = activity_msg;
            final SubLObject _prev_bind_0 = utilities_macros.$progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_2 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
            final SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
            final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding(thread);
            final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
            final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding(thread);
            final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
            final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding(thread);
            try {
                utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                utilities_macros.$progress_notification_count$.bind((SubLObject)file_hash_table.ZERO_INTEGER, thread);
                utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)file_hash_table.ZERO_INTEGER, thread);
                utilities_macros.$progress_count$.bind((SubLObject)file_hash_table.ZERO_INTEGER, thread);
                utilities_macros.$is_noting_progressP$.bind((SubLObject)file_hash_table.T, thread);
                utilities_macros.$silent_progressP$.bind((SubLObject)((file_hash_table.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : file_hash_table.T), thread);
                utilities_macros.noting_progress_preamble(str);
                chunk_count = fast_fht_merge_keystream_input_files(fht, input_files, output_files);
                utilities_macros.noting_progress_postamble();
            }
            finally {
                utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
                utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
                utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
                utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                utilities_macros.$progress_notification_count$.rebind(_prev_bind_4, thread);
                utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_2, thread);
                utilities_macros.$progress_start_time$.rebind(_prev_bind_0, thread);
            }
            if (file_hash_table.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !chunk_count.numL(last_chunk_count)) {
                Errors.error((SubLObject)file_hash_table.$str465$The_chunk_count_should_have_decli, chunk_count, last_chunk_count);
            }
            if (file_hash_table.TWO_INTEGER.numE(chunk_count)) {
                doneP = (SubLObject)file_hash_table.T;
            }
            else {
                final SubLObject tmp_swap_var = input_files;
                input_files = output_files;
                output_files = tmp_swap_var;
            }
        }
        _csetf_fstfht_ksorter_in_files(fast_fht_sorter, input_files);
        _csetf_fstfht_ksorter_out_files(fast_fht_sorter, output_files);
        return output_files;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 127335L)
    public static SubLObject fast_fht_merge_keystream_input_files(final SubLObject fht, final SubLObject input_files, final SubLObject output_files) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject outfile_queue = queues.create_queue((SubLObject)file_hash_table.UNPROVIDED);
        SubLObject chunks = (SubLObject)file_hash_table.ZERO_INTEGER;
        SubLObject doneP = (SubLObject)file_hash_table.NIL;
        SubLObject cdolist_list_var = output_files;
        SubLObject file = (SubLObject)file_hash_table.NIL;
        file = cdolist_list_var.first();
        while (file_hash_table.NIL != cdolist_list_var) {
            file_utilities.truncate_file(file);
            queues.enqueue(file, outfile_queue);
            cdolist_list_var = cdolist_list_var.rest();
            file = cdolist_list_var.first();
        }
        final SubLObject file_a = input_files.first();
        final SubLObject file_b = conses_high.second(input_files);
        SubLObject stream = (SubLObject)file_hash_table.NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)file_hash_table.NIL, thread);
                stream = compatibility.open_binary(file_a, (SubLObject)file_hash_table.$kw226$INPUT);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error((SubLObject)file_hash_table.$str419$Unable_to_open__S, file_a);
            }
            final SubLObject in_stream_a = stream;
            SubLObject stream_$22 = (SubLObject)file_hash_table.NIL;
            try {
                final SubLObject _prev_bind_2 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)file_hash_table.NIL, thread);
                    stream_$22 = compatibility.open_binary(file_b, (SubLObject)file_hash_table.$kw226$INPUT);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_2, thread);
                }
                if (!stream_$22.isStream()) {
                    Errors.error((SubLObject)file_hash_table.$str419$Unable_to_open__S, file_b);
                }
                final SubLObject in_stream_b = stream_$22;
                while (file_hash_table.NIL == doneP) {
                    final SubLObject curr_outfile = queues.requeue(outfile_queue);
                    SubLObject out_stream = (SubLObject)file_hash_table.NIL;
                    try {
                        out_stream = compatibility.open_binary(curr_outfile, (SubLObject)file_hash_table.$kw461$APPEND);
                        final SubLObject status = fast_fht_merge_keystream_chunks(fht, in_stream_a, in_stream_b, out_stream);
                        if (file_hash_table.$kw383$EOF == status) {
                            doneP = (SubLObject)file_hash_table.T;
                        }
                        else {
                            chunks = Numbers.add(chunks, (SubLObject)file_hash_table.ONE_INTEGER);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)file_hash_table.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            streams_high.close(out_stream, (SubLObject)file_hash_table.UNPROVIDED);
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                        }
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)file_hash_table.T, thread);
                    final SubLObject _values2 = Values.getValuesAsVector();
                    if (stream_$22.isStream()) {
                        streams_high.close(stream_$22, (SubLObject)file_hash_table.UNPROVIDED);
                    }
                    Values.restoreValuesFromVector(_values2);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
                }
            }
        }
        finally {
            final SubLObject _prev_bind_5 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)file_hash_table.T, thread);
                final SubLObject _values3 = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)file_hash_table.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values3);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_5, thread);
            }
        }
        return chunks;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 128889L)
    public static SubLObject fast_fht_merge_keystream_chunks(final SubLObject fht, final SubLObject in_stream_a, final SubLObject in_stream_b, final SubLObject out_stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject entry_a = (SubLObject)file_hash_table.NIL;
        SubLObject entry_b = (SubLObject)file_hash_table.NIL;
        entry_a = fast_fht_read_one_keystream_entry(in_stream_a, fht, entry_a);
        entry_b = fast_fht_read_one_keystream_entry(in_stream_b, fht, entry_b);
        if (file_hash_table.NIL != is_fast_fht_keystream_eofP(entry_a) && file_hash_table.NIL != is_fast_fht_keystream_eofP(entry_b)) {
            return (SubLObject)file_hash_table.$kw383$EOF;
        }
        if (file_hash_table.NIL != is_fast_fht_keystream_eofP(entry_a)) {
            fast_fht_keystream_sentinel_entry(entry_a);
        }
        if (file_hash_table.NIL != is_fast_fht_keystream_eofP(entry_b)) {
            fast_fht_keystream_sentinel_entry(entry_b);
        }
        SubLObject doneP = (SubLObject)file_hash_table.NIL;
        while (file_hash_table.NIL == doneP) {
            final SubLObject pcase_var;
            final SubLObject comparison = pcase_var = fast_fht_keystream_entry_cmp(entry_a, entry_b);
            if (pcase_var.eql((SubLObject)file_hash_table.$kw460$LT)) {
                fast_fht_write_one_keystream_entry(out_stream, entry_a);
                entry_a = fast_fht_read_one_keystream_entry(in_stream_a, fht, entry_a);
            }
            else if (pcase_var.eql((SubLObject)file_hash_table.$kw459$GT)) {
                fast_fht_write_one_keystream_entry(out_stream, entry_b);
                entry_b = fast_fht_read_one_keystream_entry(in_stream_b, fht, entry_b);
            }
            else {
                if (!pcase_var.eql((SubLObject)file_hash_table.$kw458$EQ)) {
                    continue;
                }
                if (file_hash_table.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (file_hash_table.NIL == is_fast_fht_keystream_chunk_separator_entryP(entry_a) || file_hash_table.NIL == is_fast_fht_keystream_chunk_separator_entryP(entry_b))) {
                    Errors.error((SubLObject)file_hash_table.$str466$Only_sentinels_or__EOF_can_be_equ, entry_a, entry_b);
                }
                doneP = (SubLObject)file_hash_table.T;
            }
        }
        fast_fht_write_keystream_chunk_separator(out_stream);
        return (SubLObject)file_hash_table.$kw467$MORE;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 130730L)
    public static SubLObject fast_fht_drain_index_run(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject fht = (SubLObject)file_hash_table.NIL;
        SubLObject index = (SubLObject)file_hash_table.NIL;
        SubLObject entry = (SubLObject)file_hash_table.NIL;
        SubLObject in_stream = (SubLObject)file_hash_table.NIL;
        SubLObject loser_items = (SubLObject)file_hash_table.NIL;
        SubLObject collision_stream = (SubLObject)file_hash_table.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_hash_table.$list468);
        fht = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_hash_table.$list468);
        index = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_hash_table.$list468);
        entry = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_hash_table.$list468);
        in_stream = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_hash_table.$list468);
        loser_items = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_hash_table.$list468);
        collision_stream = current.first();
        current = current.rest();
        if (file_hash_table.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)file_hash_table.$sym246$WHILE, (SubLObject)ConsesLow.list((SubLObject)file_hash_table.$sym469$_, index, (SubLObject)ConsesLow.list((SubLObject)file_hash_table.$sym470$FAST_FHT_GET_COMPARABLE_INDEX_FROM_ENTRY, entry)), (SubLObject)ConsesLow.list((SubLObject)file_hash_table.$sym471$FAST_FHT_WRITE_ONE_COLLISION_STREAM_ENTRY, fht, collision_stream, entry), (SubLObject)ConsesLow.list((SubLObject)file_hash_table.$sym253$CSETQ, entry, (SubLObject)ConsesLow.list((SubLObject)file_hash_table.$sym472$FAST_FHT_READ_ONE_KEYSTREAM_ENTRY, in_stream, fht, entry)), (SubLObject)ConsesLow.list((SubLObject)file_hash_table.$sym473$CINC, loser_items));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)file_hash_table.$list468);
        return (SubLObject)file_hash_table.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 131272L)
    public static SubLObject fast_fht_manage_index_collisions(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject fht = (SubLObject)file_hash_table.NIL;
        SubLObject keeper_entry = (SubLObject)file_hash_table.NIL;
        SubLObject loser_entry = (SubLObject)file_hash_table.NIL;
        SubLObject keeper_stream = (SubLObject)file_hash_table.NIL;
        SubLObject loser_stream = (SubLObject)file_hash_table.NIL;
        SubLObject keeper_items = (SubLObject)file_hash_table.NIL;
        SubLObject loser_items = (SubLObject)file_hash_table.NIL;
        SubLObject set_stream = (SubLObject)file_hash_table.NIL;
        SubLObject collision_stream = (SubLObject)file_hash_table.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_hash_table.$list474);
        fht = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_hash_table.$list474);
        keeper_entry = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_hash_table.$list474);
        loser_entry = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_hash_table.$list474);
        keeper_stream = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_hash_table.$list474);
        loser_stream = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_hash_table.$list474);
        keeper_items = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_hash_table.$list474);
        loser_items = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_hash_table.$list474);
        set_stream = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_hash_table.$list474);
        collision_stream = current.first();
        current = current.rest();
        if (file_hash_table.NIL == current) {
            final SubLObject index_keeper = (SubLObject)file_hash_table.$sym475$INDEX_KEEPER;
            final SubLObject index_loser = (SubLObject)file_hash_table.$sym476$INDEX_LOSER;
            return (SubLObject)ConsesLow.list((SubLObject)file_hash_table.$sym244$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(index_keeper, (SubLObject)ConsesLow.list((SubLObject)file_hash_table.$sym470$FAST_FHT_GET_COMPARABLE_INDEX_FROM_ENTRY, keeper_entry)), (SubLObject)ConsesLow.list(index_loser, (SubLObject)ConsesLow.list((SubLObject)file_hash_table.$sym470$FAST_FHT_GET_COMPARABLE_INDEX_FROM_ENTRY, loser_entry))), (SubLObject)ConsesLow.list((SubLObject)file_hash_table.$sym477$FAST_FHT_WRITE_ONE_KEYSTREAM_ENTRY, set_stream, keeper_entry), (SubLObject)ConsesLow.list((SubLObject)file_hash_table.$sym473$CINC, keeper_items), (SubLObject)ConsesLow.list((SubLObject)file_hash_table.$sym253$CSETQ, keeper_entry, (SubLObject)ConsesLow.list((SubLObject)file_hash_table.$sym472$FAST_FHT_READ_ONE_KEYSTREAM_ENTRY, keeper_stream, fht, keeper_entry)), (SubLObject)ConsesLow.list((SubLObject)file_hash_table.$sym478$FAST_FHT_DRAIN_INDEX_RUN, fht, index_keeper, keeper_entry, keeper_stream, loser_items, collision_stream), (SubLObject)ConsesLow.list((SubLObject)file_hash_table.$sym478$FAST_FHT_DRAIN_INDEX_RUN, fht, index_loser, loser_entry, loser_stream, loser_items, collision_stream));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)file_hash_table.$list474);
        return (SubLObject)file_hash_table.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 132796L)
    public static SubLObject fast_fht_uniquify_keystream(final SubLObject fht, final SubLObject fast_fht_sorter) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject input_files = fstfht_ksorter_in_files(fast_fht_sorter);
        final SubLObject set_file = input_files.first();
        final SubLObject collisions = conses_high.second(input_files);
        final SubLObject output_files = fstfht_ksorter_out_files(fast_fht_sorter);
        final SubLObject file_a = output_files.first();
        final SubLObject file_b = conses_high.second(output_files);
        SubLObject set_items = (SubLObject)file_hash_table.ZERO_INTEGER;
        SubLObject collision_items = (SubLObject)file_hash_table.ZERO_INTEGER;
        final SubLObject _prev_bind_0 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding(thread);
        final SubLObject _prev_bind_2 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding(thread);
        try {
            StreamsLow.$stream_initial_input_buffer_size$.bind(file_hash_table.$fast_fht_large_buffer_size$.getGlobalValue(), thread);
            StreamsLow.$stream_initial_output_buffer_size$.bind(StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue(thread), thread);
            SubLObject stream = (SubLObject)file_hash_table.NIL;
            try {
                final SubLObject _prev_bind_0_$23 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)file_hash_table.NIL, thread);
                    stream = compatibility.open_binary(file_a, (SubLObject)file_hash_table.$kw226$INPUT);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_$23, thread);
                }
                if (!stream.isStream()) {
                    Errors.error((SubLObject)file_hash_table.$str419$Unable_to_open__S, file_a);
                }
                final SubLObject in_stream_a = stream;
                SubLObject stream_$24 = (SubLObject)file_hash_table.NIL;
                try {
                    final SubLObject _prev_bind_0_$24 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                    try {
                        stream_macros.$stream_requires_locking$.bind((SubLObject)file_hash_table.NIL, thread);
                        stream_$24 = compatibility.open_binary(file_b, (SubLObject)file_hash_table.$kw226$INPUT);
                    }
                    finally {
                        stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_$24, thread);
                    }
                    if (!stream_$24.isStream()) {
                        Errors.error((SubLObject)file_hash_table.$str419$Unable_to_open__S, file_b);
                    }
                    final SubLObject in_stream_b = stream_$24;
                    SubLObject stream_$25 = (SubLObject)file_hash_table.NIL;
                    try {
                        final SubLObject _prev_bind_0_$25 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                        try {
                            stream_macros.$stream_requires_locking$.bind((SubLObject)file_hash_table.NIL, thread);
                            stream_$25 = compatibility.open_binary(set_file, (SubLObject)file_hash_table.$kw449$OUTPUT);
                        }
                        finally {
                            stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_$25, thread);
                        }
                        if (!stream_$25.isStream()) {
                            Errors.error((SubLObject)file_hash_table.$str419$Unable_to_open__S, set_file);
                        }
                        final SubLObject set_stream = stream_$25;
                        SubLObject stream_$26 = (SubLObject)file_hash_table.NIL;
                        try {
                            final SubLObject _prev_bind_0_$26 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                            try {
                                stream_macros.$stream_requires_locking$.bind((SubLObject)file_hash_table.NIL, thread);
                                stream_$26 = compatibility.open_binary(collisions, (SubLObject)file_hash_table.$kw449$OUTPUT);
                            }
                            finally {
                                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_$26, thread);
                            }
                            if (!stream_$26.isStream()) {
                                Errors.error((SubLObject)file_hash_table.$str419$Unable_to_open__S, collisions);
                            }
                            final SubLObject collision_stream = stream_$26;
                            SubLObject entry_a = (SubLObject)file_hash_table.NIL;
                            SubLObject entry_b = (SubLObject)file_hash_table.NIL;
                            entry_a = fast_fht_read_one_keystream_entry(in_stream_a, fht, entry_a);
                            entry_b = fast_fht_read_one_keystream_entry(in_stream_b, fht, entry_b);
                            while (file_hash_table.NIL == is_fast_fht_keystream_chunk_separator_entryP(entry_a) || file_hash_table.NIL == is_fast_fht_keystream_chunk_separator_entryP(entry_b)) {
                                final SubLObject index_a = fast_fht_get_comparable_index_from_entry(entry_a);
                                final SubLObject index_b = fast_fht_get_comparable_index_from_entry(entry_b);
                                if (index_a.numL(index_b)) {
                                    fast_fht_write_one_keystream_entry(set_stream, entry_a);
                                    set_items = Numbers.add(set_items, (SubLObject)file_hash_table.ONE_INTEGER);
                                    for (entry_a = fast_fht_read_one_keystream_entry(in_stream_a, fht, entry_a); index_a.numE(fast_fht_get_comparable_index_from_entry(entry_a)); entry_a = fast_fht_read_one_keystream_entry(in_stream_a, fht, entry_a), collision_items = Numbers.add(collision_items, (SubLObject)file_hash_table.ONE_INTEGER)) {
                                        fast_fht_write_one_collision_stream_entry(fht, collision_stream, entry_a);
                                    }
                                }
                                else if (index_b.numL(index_a)) {
                                    fast_fht_write_one_keystream_entry(set_stream, entry_b);
                                    set_items = Numbers.add(set_items, (SubLObject)file_hash_table.ONE_INTEGER);
                                    for (entry_b = fast_fht_read_one_keystream_entry(in_stream_b, fht, entry_b); index_b.numE(fast_fht_get_comparable_index_from_entry(entry_b)); entry_b = fast_fht_read_one_keystream_entry(in_stream_b, fht, entry_b), collision_items = Numbers.add(collision_items, (SubLObject)file_hash_table.ONE_INTEGER)) {
                                        fast_fht_write_one_collision_stream_entry(fht, collision_stream, entry_b);
                                    }
                                }
                                else if (file_hash_table.NIL != fast_fht_keystream_entryL(entry_a, entry_b)) {
                                    final SubLObject index_keeper = fast_fht_get_comparable_index_from_entry(entry_a);
                                    final SubLObject index_loser = fast_fht_get_comparable_index_from_entry(entry_b);
                                    fast_fht_write_one_keystream_entry(set_stream, entry_a);
                                    set_items = Numbers.add(set_items, (SubLObject)file_hash_table.ONE_INTEGER);
                                    for (entry_a = fast_fht_read_one_keystream_entry(in_stream_a, fht, entry_a); index_keeper.numE(fast_fht_get_comparable_index_from_entry(entry_a)); entry_a = fast_fht_read_one_keystream_entry(in_stream_a, fht, entry_a), collision_items = Numbers.add(collision_items, (SubLObject)file_hash_table.ONE_INTEGER)) {
                                        fast_fht_write_one_collision_stream_entry(fht, collision_stream, entry_a);
                                    }
                                    while (index_loser.numE(fast_fht_get_comparable_index_from_entry(entry_b))) {
                                        fast_fht_write_one_collision_stream_entry(fht, collision_stream, entry_b);
                                        entry_b = fast_fht_read_one_keystream_entry(in_stream_b, fht, entry_b);
                                        collision_items = Numbers.add(collision_items, (SubLObject)file_hash_table.ONE_INTEGER);
                                    }
                                }
                                else if (file_hash_table.NIL != fast_fht_keystream_entryL(entry_b, entry_a)) {
                                    final SubLObject index_keeper = fast_fht_get_comparable_index_from_entry(entry_b);
                                    final SubLObject index_loser = fast_fht_get_comparable_index_from_entry(entry_a);
                                    fast_fht_write_one_keystream_entry(set_stream, entry_b);
                                    set_items = Numbers.add(set_items, (SubLObject)file_hash_table.ONE_INTEGER);
                                    for (entry_b = fast_fht_read_one_keystream_entry(in_stream_b, fht, entry_b); index_keeper.numE(fast_fht_get_comparable_index_from_entry(entry_b)); entry_b = fast_fht_read_one_keystream_entry(in_stream_b, fht, entry_b), collision_items = Numbers.add(collision_items, (SubLObject)file_hash_table.ONE_INTEGER)) {
                                        fast_fht_write_one_collision_stream_entry(fht, collision_stream, entry_b);
                                    }
                                    while (index_loser.numE(fast_fht_get_comparable_index_from_entry(entry_a))) {
                                        fast_fht_write_one_collision_stream_entry(fht, collision_stream, entry_a);
                                        entry_a = fast_fht_read_one_keystream_entry(in_stream_a, fht, entry_a);
                                        collision_items = Numbers.add(collision_items, (SubLObject)file_hash_table.ONE_INTEGER);
                                    }
                                }
                                else {
                                    Errors.error((SubLObject)file_hash_table.$str466$Only_sentinels_or__EOF_can_be_equ, entry_a, entry_b);
                                }
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$27 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)file_hash_table.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                if (stream_$26.isStream()) {
                                    streams_high.close(stream_$26, (SubLObject)file_hash_table.UNPROVIDED);
                                }
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$27, thread);
                            }
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$28 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)file_hash_table.T, thread);
                            final SubLObject _values2 = Values.getValuesAsVector();
                            if (stream_$25.isStream()) {
                                streams_high.close(stream_$25, (SubLObject)file_hash_table.UNPROVIDED);
                            }
                            Values.restoreValuesFromVector(_values2);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$28, thread);
                        }
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$29 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)file_hash_table.T, thread);
                        final SubLObject _values3 = Values.getValuesAsVector();
                        if (stream_$24.isStream()) {
                            streams_high.close(stream_$24, (SubLObject)file_hash_table.UNPROVIDED);
                        }
                        Values.restoreValuesFromVector(_values3);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$29, thread);
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$30 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)file_hash_table.T, thread);
                    final SubLObject _values4 = Values.getValuesAsVector();
                    if (stream.isStream()) {
                        streams_high.close(stream, (SubLObject)file_hash_table.UNPROVIDED);
                    }
                    Values.restoreValuesFromVector(_values4);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$30, thread);
                }
            }
        }
        finally {
            StreamsLow.$stream_initial_output_buffer_size$.rebind(_prev_bind_2, thread);
            StreamsLow.$stream_initial_input_buffer_size$.rebind(_prev_bind_0, thread);
        }
        if (file_hash_table.NIL == utilities_macros.$silent_progressP$.getDynamicValue(thread)) {
            PrintLow.format((SubLObject)file_hash_table.T, (SubLObject)file_hash_table.$str479$__A_set_item_A___A_activity_item_, new SubLObject[] { set_items, file_hash_table.ONE_INTEGER.numE(set_items) ? file_hash_table.$str309$ : file_hash_table.$str480$s, collision_items, file_hash_table.ONE_INTEGER.numE(collision_items) ? file_hash_table.$str309$ : file_hash_table.$str480$s });
        }
        return Values.values(set_items, collision_items);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 137247L)
    public static SubLObject fast_fht_get_comparable_index_from_entry(final SubLObject entry) {
        SubLObject index = entry.first();
        if (!index.isNumber()) {
            index = file_hash_table.$fast_fht_sentinel_index_value$.getGlobalValue();
        }
        return index;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 137501L)
    public static SubLObject fast_fht_dump_keystream(final SubLObject keystream, final SubLObject fht, SubLObject stream) {
        if (stream == file_hash_table.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        SubLObject doneP = (SubLObject)file_hash_table.NIL;
        SubLObject result = (SubLObject)file_hash_table.NIL;
        while (file_hash_table.NIL == doneP) {
            result = fast_fht_read_one_keystream_entry(keystream, fht, result);
            if (file_hash_table.NIL != is_fast_fht_keystream_eofP(result)) {
                doneP = (SubLObject)file_hash_table.T;
            }
            else if (file_hash_table.NIL != is_fast_fht_keystream_chunk_separator_entryP(result)) {
                streams_high.write_string((SubLObject)file_hash_table.$str481$_________________________, stream, (SubLObject)file_hash_table.UNPROVIDED, (SubLObject)file_hash_table.UNPROVIDED);
                streams_high.terpri(stream);
            }
            else {
                print_high.princ(result, stream);
                streams_high.terpri(stream);
            }
        }
        return fht;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 138250L)
    public static SubLObject fast_fht_dump_keystream_files(final SubLObject file_list, final SubLObject fht, SubLObject stream) {
        if (stream == file_hash_table.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = file_list;
        SubLObject file = (SubLObject)file_hash_table.NIL;
        file = cdolist_list_var.first();
        while (file_hash_table.NIL != cdolist_list_var) {
            PrintLow.format(stream, (SubLObject)file_hash_table.$str482$______File__A______, file);
            SubLObject stream_$34 = (SubLObject)file_hash_table.NIL;
            try {
                final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)file_hash_table.NIL, thread);
                    stream_$34 = compatibility.open_binary(file, (SubLObject)file_hash_table.$kw226$INPUT);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                }
                if (!stream_$34.isStream()) {
                    Errors.error((SubLObject)file_hash_table.$str419$Unable_to_open__S, file);
                }
                final SubLObject keystream = stream_$34;
                fast_fht_dump_keystream(keystream, fht, (SubLObject)file_hash_table.UNPROVIDED);
            }
            finally {
                final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)file_hash_table.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    if (stream_$34.isStream()) {
                        streams_high.close(stream_$34, (SubLObject)file_hash_table.UNPROVIDED);
                    }
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            file = cdolist_list_var.first();
        }
        return fht;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 138639L)
    public static SubLObject enforce_valid_fast_fht_dump_keystream_files(final SubLObject file_list, final SubLObject fht) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = file_list;
        SubLObject file = (SubLObject)file_hash_table.NIL;
        file = cdolist_list_var.first();
        while (file_hash_table.NIL != cdolist_list_var) {
            SubLObject stream = (SubLObject)file_hash_table.NIL;
            try {
                final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)file_hash_table.NIL, thread);
                    stream = compatibility.open_binary(file, (SubLObject)file_hash_table.$kw226$INPUT);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                }
                if (!stream.isStream()) {
                    Errors.error((SubLObject)file_hash_table.$str419$Unable_to_open__S, file);
                }
                final SubLObject keystream = stream;
                thread.resetMultipleValues();
                final SubLObject successP = validate_fast_fht_dump_keystream(keystream, fht);
                final SubLObject details = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (file_hash_table.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && file_hash_table.NIL == successP) {
                    Errors.error((SubLObject)file_hash_table.$str483$File__A_no_does_not_contain_a_val, file, details);
                }
            }
            finally {
                final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)file_hash_table.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    if (stream.isStream()) {
                        streams_high.close(stream, (SubLObject)file_hash_table.UNPROVIDED);
                    }
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            file = cdolist_list_var.first();
        }
        return fht;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 139186L)
    public static SubLObject validate_fast_fht_dump_keystream(final SubLObject keystream, final SubLObject fht) {
        SubLObject prev_index = Numbers.$most_negative_fixnum$.getGlobalValue();
        SubLObject chunk = (SubLObject)file_hash_table.ZERO_INTEGER;
        SubLObject position = (SubLObject)file_hash_table.ZERO_INTEGER;
        SubLObject doneP = (SubLObject)file_hash_table.NIL;
        SubLObject result = (SubLObject)file_hash_table.NIL;
        while (file_hash_table.NIL == doneP) {
            result = fast_fht_read_one_keystream_entry(keystream, fht, result);
            if (file_hash_table.NIL != is_fast_fht_keystream_eofP(result)) {
                if (!position.isZero()) {
                    return Values.values((SubLObject)file_hash_table.NIL, (SubLObject)ConsesLow.list((SubLObject)file_hash_table.$kw484$MID_STREAM_EOF, chunk, position));
                }
                doneP = (SubLObject)file_hash_table.T;
            }
            else if (file_hash_table.NIL != is_fast_fht_keystream_chunk_separator_entryP(result)) {
                chunk = Numbers.add(chunk, (SubLObject)file_hash_table.ONE_INTEGER);
                position = (SubLObject)file_hash_table.ZERO_INTEGER;
                prev_index = Numbers.$most_negative_fixnum$.getGlobalValue();
            }
            else {
                final SubLObject index = result.first();
                if (!prev_index.numLE(index)) {
                    return Values.values((SubLObject)file_hash_table.NIL, (SubLObject)ConsesLow.list((SubLObject)file_hash_table.$kw485$UNSORTED_INDEX, chunk, position));
                }
                position = Numbers.add(position, (SubLObject)file_hash_table.ONE_INTEGER);
                prev_index = index;
            }
        }
        return Values.values((SubLObject)file_hash_table.T, (SubLObject)file_hash_table.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 140771L)
    public static SubLObject test_fast_fht_keystream_entry_cmp(final SubLObject entry_a, final SubLObject entry_b) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)file_hash_table.NIL;
        final SubLObject _prev_bind_0 = file_hash_table.$fast_file_hash_table_optimization_mode$.currentBinding(thread);
        try {
            file_hash_table.$fast_file_hash_table_optimization_mode$.bind((SubLObject)file_hash_table.$kw386$MODERATE, thread);
            result = fast_fht_keystream_entry_cmp(fast_fht_keystream_entry_cmp_expand_argument(entry_a), fast_fht_keystream_entry_cmp_expand_argument(entry_b));
        }
        finally {
            file_hash_table.$fast_file_hash_table_optimization_mode$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 141147L)
    public static SubLObject fast_fht_keystream_entry_cmp_expand_argument(final SubLObject arg) {
        if (file_hash_table.$kw494$SENTINEL == arg) {
            return fast_fht_keystream_sentinel_entry((SubLObject)file_hash_table.UNPROVIDED);
        }
        if (file_hash_table.$kw383$EOF == arg) {
            return fast_fht_keystream_eof_entry((SubLObject)file_hash_table.UNPROVIDED);
        }
        return arg;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 141493L)
    public static SubLObject with_input_file_hash_table(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_hash_table.$list495);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject fht = (SubLObject)file_hash_table.NIL;
        SubLObject filename = (SubLObject)file_hash_table.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_hash_table.$list495);
        fht = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_hash_table.$list495);
        filename = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)file_hash_table.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)file_hash_table.NIL;
        SubLObject current_$35 = (SubLObject)file_hash_table.NIL;
        while (file_hash_table.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)file_hash_table.$list495);
            current_$35 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)file_hash_table.$list495);
            if (file_hash_table.NIL == conses_high.member(current_$35, (SubLObject)file_hash_table.$list496, (SubLObject)file_hash_table.UNPROVIDED, (SubLObject)file_hash_table.UNPROVIDED)) {
                bad = (SubLObject)file_hash_table.T;
            }
            if (current_$35 == file_hash_table.$kw205$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (file_hash_table.NIL != bad && file_hash_table.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)file_hash_table.$list495);
        }
        final SubLObject test_fn_tail = cdestructuring_bind.property_list_member((SubLObject)file_hash_table.$kw497$TEST_FN, current);
        final SubLObject test_fn = (SubLObject)((file_hash_table.NIL != test_fn_tail) ? conses_high.cadr(test_fn_tail) : file_hash_table.$sym498$_DEFAULT_FHT_TEST_FUNCTION_);
        final SubLObject serialization_fn_tail = cdestructuring_bind.property_list_member((SubLObject)file_hash_table.$kw499$SERIALIZATION_FN, current);
        final SubLObject serialization_fn = (file_hash_table.NIL != serialization_fn_tail) ? conses_high.cadr(serialization_fn_tail) : file_hash_table.$default_fht_serialization_protocol$.getGlobalValue();
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.list((SubLObject)file_hash_table.$sym244$CLET, (SubLObject)ConsesLow.list(fht), (SubLObject)ConsesLow.list((SubLObject)file_hash_table.$sym500$CUNWIND_PROTECT, (SubLObject)ConsesLow.listS((SubLObject)file_hash_table.$sym252$PROGN, (SubLObject)ConsesLow.list((SubLObject)file_hash_table.$sym253$CSETQ, fht, (SubLObject)ConsesLow.list((SubLObject)file_hash_table.$sym501$OPEN_FILE_HASH_TABLE_READ_ONLY, filename, test_fn, serialization_fn)), ConsesLow.append(body, (SubLObject)file_hash_table.NIL)), (SubLObject)ConsesLow.list((SubLObject)file_hash_table.$sym502$PWHEN, (SubLObject)ConsesLow.list((SubLObject)file_hash_table.$sym1$FILE_HASH_TABLE_P, fht), (SubLObject)ConsesLow.list((SubLObject)file_hash_table.$sym503$FINALIZE_FILE_HASH_TABLE, fht))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 142273L)
    public static SubLObject with_writable_file_hash_table(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_hash_table.$list495);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject fht = (SubLObject)file_hash_table.NIL;
        SubLObject filename = (SubLObject)file_hash_table.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_hash_table.$list495);
        fht = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_hash_table.$list495);
        filename = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)file_hash_table.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)file_hash_table.NIL;
        SubLObject current_$36 = (SubLObject)file_hash_table.NIL;
        while (file_hash_table.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)file_hash_table.$list495);
            current_$36 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)file_hash_table.$list495);
            if (file_hash_table.NIL == conses_high.member(current_$36, (SubLObject)file_hash_table.$list496, (SubLObject)file_hash_table.UNPROVIDED, (SubLObject)file_hash_table.UNPROVIDED)) {
                bad = (SubLObject)file_hash_table.T;
            }
            if (current_$36 == file_hash_table.$kw205$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (file_hash_table.NIL != bad && file_hash_table.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)file_hash_table.$list495);
        }
        final SubLObject test_fn_tail = cdestructuring_bind.property_list_member((SubLObject)file_hash_table.$kw497$TEST_FN, current);
        final SubLObject test_fn = (SubLObject)((file_hash_table.NIL != test_fn_tail) ? conses_high.cadr(test_fn_tail) : file_hash_table.$sym498$_DEFAULT_FHT_TEST_FUNCTION_);
        final SubLObject serialization_fn_tail = cdestructuring_bind.property_list_member((SubLObject)file_hash_table.$kw499$SERIALIZATION_FN, current);
        final SubLObject serialization_fn = (file_hash_table.NIL != serialization_fn_tail) ? conses_high.cadr(serialization_fn_tail) : file_hash_table.$default_fht_serialization_protocol$.getGlobalValue();
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.list((SubLObject)file_hash_table.$sym244$CLET, (SubLObject)ConsesLow.list(fht), (SubLObject)ConsesLow.list((SubLObject)file_hash_table.$sym500$CUNWIND_PROTECT, (SubLObject)ConsesLow.listS((SubLObject)file_hash_table.$sym252$PROGN, (SubLObject)ConsesLow.list((SubLObject)file_hash_table.$sym253$CSETQ, fht, (SubLObject)ConsesLow.list((SubLObject)file_hash_table.$sym504$OPEN_FILE_HASH_TABLE, filename, test_fn, serialization_fn)), ConsesLow.append(body, (SubLObject)file_hash_table.NIL)), (SubLObject)ConsesLow.list((SubLObject)file_hash_table.$sym502$PWHEN, (SubLObject)ConsesLow.list((SubLObject)file_hash_table.$sym1$FILE_HASH_TABLE_P, fht), (SubLObject)ConsesLow.list((SubLObject)file_hash_table.$sym503$FINALIZE_FILE_HASH_TABLE, fht))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 142964L)
    public static SubLObject with_output_file_hash_table(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_hash_table.$list505);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject fht = (SubLObject)file_hash_table.NIL;
        SubLObject filename = (SubLObject)file_hash_table.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_hash_table.$list505);
        fht = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_hash_table.$list505);
        filename = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)file_hash_table.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)file_hash_table.NIL;
        SubLObject current_$37 = (SubLObject)file_hash_table.NIL;
        while (file_hash_table.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)file_hash_table.$list505);
            current_$37 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)file_hash_table.$list505);
            if (file_hash_table.NIL == conses_high.member(current_$37, (SubLObject)file_hash_table.$list506, (SubLObject)file_hash_table.UNPROVIDED, (SubLObject)file_hash_table.UNPROVIDED)) {
                bad = (SubLObject)file_hash_table.T;
            }
            if (current_$37 == file_hash_table.$kw205$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (file_hash_table.NIL != bad && file_hash_table.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)file_hash_table.$list505);
        }
        final SubLObject expected_items_tail = cdestructuring_bind.property_list_member((SubLObject)file_hash_table.$kw507$EXPECTED_ITEMS, current);
        final SubLObject expected_items = (file_hash_table.NIL != expected_items_tail) ? conses_high.cadr(expected_items_tail) : file_hash_table.$htfile_default_expected_items$.getGlobalValue();
        final SubLObject average_size_tail = cdestructuring_bind.property_list_member((SubLObject)file_hash_table.$kw508$AVERAGE_SIZE, current);
        final SubLObject average_size = (file_hash_table.NIL != average_size_tail) ? conses_high.cadr(average_size_tail) : file_hash_table.$htfile_default_average_size$.getGlobalValue();
        final SubLObject test_fn_tail = cdestructuring_bind.property_list_member((SubLObject)file_hash_table.$kw497$TEST_FN, current);
        final SubLObject test_fn = (SubLObject)((file_hash_table.NIL != test_fn_tail) ? conses_high.cadr(test_fn_tail) : file_hash_table.$sym498$_DEFAULT_FHT_TEST_FUNCTION_);
        final SubLObject serialization_fn_tail = cdestructuring_bind.property_list_member((SubLObject)file_hash_table.$kw499$SERIALIZATION_FN, current);
        final SubLObject serialization_fn = (file_hash_table.NIL != serialization_fn_tail) ? conses_high.cadr(serialization_fn_tail) : file_hash_table.$default_fht_serialization_protocol$.getGlobalValue();
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.list((SubLObject)file_hash_table.$sym244$CLET, (SubLObject)ConsesLow.list(fht), (SubLObject)ConsesLow.list((SubLObject)file_hash_table.$sym500$CUNWIND_PROTECT, (SubLObject)ConsesLow.listS((SubLObject)file_hash_table.$sym252$PROGN, (SubLObject)ConsesLow.list((SubLObject)file_hash_table.$sym253$CSETQ, fht, (SubLObject)ConsesLow.list((SubLObject)file_hash_table.$sym509$CREATE_FILE_HASH_TABLE, filename, expected_items, average_size, test_fn, serialization_fn)), ConsesLow.append(body, (SubLObject)file_hash_table.NIL)), (SubLObject)ConsesLow.list((SubLObject)file_hash_table.$sym502$PWHEN, (SubLObject)ConsesLow.list((SubLObject)file_hash_table.$sym1$FILE_HASH_TABLE_P, fht), (SubLObject)ConsesLow.list((SubLObject)file_hash_table.$sym503$FINALIZE_FILE_HASH_TABLE, fht))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 143971L)
    public static SubLObject with_fast_create_file_hash_table(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_hash_table.$list510);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject fast_fht = (SubLObject)file_hash_table.NIL;
        SubLObject filename = (SubLObject)file_hash_table.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_hash_table.$list510);
        fast_fht = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_hash_table.$list510);
        filename = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)file_hash_table.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)file_hash_table.NIL;
        SubLObject current_$38 = (SubLObject)file_hash_table.NIL;
        while (file_hash_table.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)file_hash_table.$list510);
            current_$38 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)file_hash_table.$list510);
            if (file_hash_table.NIL == conses_high.member(current_$38, (SubLObject)file_hash_table.$list511, (SubLObject)file_hash_table.UNPROVIDED, (SubLObject)file_hash_table.UNPROVIDED)) {
                bad = (SubLObject)file_hash_table.T;
            }
            if (current_$38 == file_hash_table.$kw205$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (file_hash_table.NIL != bad && file_hash_table.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)file_hash_table.$list510);
        }
        final SubLObject tempdir_tail = cdestructuring_bind.property_list_member((SubLObject)file_hash_table.$kw512$TEMPDIR, current);
        final SubLObject tempdir = (file_hash_table.NIL != tempdir_tail) ? conses_high.cadr(tempdir_tail) : file_utilities.temp_directory();
        final SubLObject test_fn_tail = cdestructuring_bind.property_list_member((SubLObject)file_hash_table.$kw497$TEST_FN, current);
        final SubLObject test_fn = (SubLObject)((file_hash_table.NIL != test_fn_tail) ? conses_high.cadr(test_fn_tail) : file_hash_table.$sym498$_DEFAULT_FHT_TEST_FUNCTION_);
        final SubLObject serialization_fn_tail = cdestructuring_bind.property_list_member((SubLObject)file_hash_table.$kw499$SERIALIZATION_FN, current);
        final SubLObject serialization_fn = (file_hash_table.NIL != serialization_fn_tail) ? conses_high.cadr(serialization_fn_tail) : file_hash_table.$default_fht_serialization_protocol$.getGlobalValue();
        final SubLObject keep_temporary_keyfile_tail = cdestructuring_bind.property_list_member((SubLObject)file_hash_table.$kw513$KEEP_TEMPORARY_KEYFILE, current);
        final SubLObject keep_temporary_keyfile = (SubLObject)((file_hash_table.NIL != keep_temporary_keyfile_tail) ? conses_high.cadr(keep_temporary_keyfile_tail) : file_hash_table.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.list((SubLObject)file_hash_table.$sym244$CLET, (SubLObject)ConsesLow.list(fast_fht), (SubLObject)ConsesLow.list((SubLObject)file_hash_table.$sym500$CUNWIND_PROTECT, (SubLObject)ConsesLow.listS((SubLObject)file_hash_table.$sym252$PROGN, (SubLObject)ConsesLow.list((SubLObject)file_hash_table.$sym253$CSETQ, fast_fht, (SubLObject)ConsesLow.list((SubLObject)file_hash_table.$sym514$FAST_CREATE_FILE_HASH_TABLE, filename, tempdir, test_fn, serialization_fn)), ConsesLow.append(body, (SubLObject)file_hash_table.NIL)), (SubLObject)ConsesLow.list((SubLObject)file_hash_table.$sym502$PWHEN, (SubLObject)ConsesLow.list((SubLObject)file_hash_table.$sym390$FAST_CREATE_FHT_P, fast_fht), (SubLObject)ConsesLow.list((SubLObject)file_hash_table.$sym515$FINALIZE_FAST_CREATE_FILE_HASH_TABLE, fast_fht, keep_temporary_keyfile))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 146658L)
    public static SubLObject test_fast_fht_creation_with_merge_sorted_keystream(final SubLObject items, final SubLObject tile_size_pow2, final SubLObject optimization) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = file_hash_table.$fast_file_hash_table_optimization_mode$.currentBinding(thread);
        final SubLObject _prev_bind_2 = file_hash_table.$fast_fht_keystream_tile_size_pow2$.currentBinding(thread);
        try {
            file_hash_table.$fast_file_hash_table_optimization_mode$.bind(optimization, thread);
            file_hash_table.$fast_fht_keystream_tile_size_pow2$.bind(tile_size_pow2, thread);
            final SubLObject map = Hashtables.make_hash_table(items, (SubLObject)file_hash_table.EQUAL, (SubLObject)file_hash_table.UNPROVIDED);
            SubLObject i;
            for (i = (SubLObject)file_hash_table.NIL, i = (SubLObject)file_hash_table.ZERO_INTEGER; i.numL(items); i = Numbers.add(i, (SubLObject)file_hash_table.ONE_INTEGER)) {
                map_utilities.map_put(map, string_utilities.to_string(i), Sequences.cconcatenate((SubLObject)file_hash_table.$str518$My_String_, format_nil.format_nil_a_no_copy(i)));
            }
            final SubLObject fht_name = test_fast_fht_creation_with_map_contents(map, (SubLObject)file_hash_table.UNPROVIDED, (SubLObject)file_hash_table.UNPROVIDED);
            SubLObject ignore_errors_tag = (SubLObject)file_hash_table.NIL;
            try {
                thread.throwStack.push(file_hash_table.$kw416$IGNORE_ERRORS_TARGET);
                final SubLObject _prev_bind_0_$39 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)file_hash_table.$sym417$IGNORE_ERRORS_HANDLER), thread);
                    try {
                        Filesys.delete_file(fht_name);
                    }
                    catch (Throwable catch_var) {
                        Errors.handleThrowable(catch_var, (SubLObject)file_hash_table.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(_prev_bind_0_$39, thread);
                }
            }
            catch (Throwable ccatch_env_var) {
                ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)file_hash_table.$kw416$IGNORE_ERRORS_TARGET);
            }
            finally {
                thread.throwStack.pop();
            }
        }
        finally {
            file_hash_table.$fast_fht_keystream_tile_size_pow2$.rebind(_prev_bind_2, thread);
            file_hash_table.$fast_file_hash_table_optimization_mode$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)file_hash_table.$kw519$SUCCESS;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 147270L)
    public static SubLObject test_fast_fht_creation_with_map_contents(final SubLObject map, SubLObject serialization, SubLObject value_test) {
        if (serialization == file_hash_table.UNPROVIDED) {
            serialization = (SubLObject)file_hash_table.$kw164$IMAGE_DEPENDENT_CFASL;
        }
        if (value_test == file_hash_table.UNPROVIDED) {
            value_test = (SubLObject)file_hash_table.$kw520$UNPROVIDED;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject test = map_utilities.map_test(map);
        final SubLObject fht_name = file_utilities.make_prefixed_temp_filename((SubLObject)file_hash_table.$str521$fht_, (SubLObject)file_hash_table.UNPROVIDED);
        if (!value_test.isFunctionSpec()) {
            value_test = test;
        }
        final SubLObject fast_fht = fast_create_file_hash_table(fht_name, file_utilities.temp_directory(), test, serialization);
        final SubLObject mess = (SubLObject)file_hash_table.$str522$Writing_out_FHT_____;
        SubLObject sofar = (SubLObject)file_hash_table.ZERO_INTEGER;
        final SubLObject total = map_utilities.map_size(map);
        assert file_hash_table.NIL != Types.stringp(mess) : mess;
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)file_hash_table.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)file_hash_table.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)file_hash_table.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(mess);
                final SubLObject iterator = map_utilities.new_map_iterator(map);
                SubLObject valid;
                for (SubLObject done_var = (SubLObject)file_hash_table.NIL; file_hash_table.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(file_hash_table.NIL == valid)) {
                    thread.resetMultipleValues();
                    final SubLObject var = iteration.iteration_next(iterator);
                    valid = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (file_hash_table.NIL != valid) {
                        SubLObject current;
                        final SubLObject datum = current = var;
                        SubLObject key = (SubLObject)file_hash_table.NIL;
                        SubLObject values = (SubLObject)file_hash_table.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_hash_table.$list523);
                        key = current.first();
                        current = current.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_hash_table.$list523);
                        values = current.first();
                        current = current.rest();
                        if (file_hash_table.NIL == current) {
                            utilities_macros.note_percent_progress(sofar, total);
                            sofar = Numbers.add(sofar, (SubLObject)file_hash_table.ONE_INTEGER);
                            fast_put_file_hash_table(key, fast_fht, values);
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)file_hash_table.$list523);
                        }
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$40 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)file_hash_table.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$40, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        finalize_fast_create_file_hash_table(fast_fht, (SubLObject)file_hash_table.UNPROVIDED, (SubLObject)file_hash_table.UNPROVIDED);
        SubLObject not_found;
        SubLObject fht = not_found = open_file_hash_table_read_only(fht_name, test, serialization);
        SubLObject checked = (SubLObject)file_hash_table.ZERO_INTEGER;
        if (file_hash_table.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !map_utilities.map_size(map).numE(file_hash_table_count(fht))) {
            Errors.error((SubLObject)file_hash_table.$str524$Error__expected__A_items__got__A_, map_utilities.map_size(map), file_hash_table_count(fht));
        }
        final SubLObject mess2 = (SubLObject)file_hash_table.$str525$Checking_map_against_FHT_____;
        SubLObject sofar2 = (SubLObject)file_hash_table.ZERO_INTEGER;
        final SubLObject total2 = map_utilities.map_size(map);
        assert file_hash_table.NIL != Types.stringp(mess2) : mess2;
        final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)file_hash_table.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)file_hash_table.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)file_hash_table.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(mess2);
                final SubLObject iterator2 = map_utilities.new_map_iterator(map);
                SubLObject valid2;
                for (SubLObject done_var2 = (SubLObject)file_hash_table.NIL; file_hash_table.NIL == done_var2; done_var2 = (SubLObject)SubLObjectFactory.makeBoolean(file_hash_table.NIL == valid2)) {
                    thread.resetMultipleValues();
                    final SubLObject var2 = iteration.iteration_next(iterator2);
                    valid2 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (file_hash_table.NIL != valid2) {
                        SubLObject current2;
                        final SubLObject datum2 = current2 = var2;
                        SubLObject key2 = (SubLObject)file_hash_table.NIL;
                        SubLObject values2 = (SubLObject)file_hash_table.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, (SubLObject)file_hash_table.$list523);
                        key2 = current2.first();
                        current2 = current2.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, (SubLObject)file_hash_table.$list523);
                        values2 = current2.first();
                        current2 = current2.rest();
                        if (file_hash_table.NIL == current2) {
                            utilities_macros.note_percent_progress(sofar2, total2);
                            sofar2 = Numbers.add(sofar2, (SubLObject)file_hash_table.ONE_INTEGER);
                            final SubLObject fht_values = get_file_hash_table(key2, fht, not_found);
                            if (file_hash_table.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && file_hash_table.NIL == Functions.funcall(value_test, values2, fht_values)) {
                                Errors.error((SubLObject)file_hash_table.$str526$For__S__expected__S__got__S_inste, key2, values2, fht_values);
                            }
                            checked = Numbers.add(checked, (SubLObject)file_hash_table.ONE_INTEGER);
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(datum2, (SubLObject)file_hash_table.$list523);
                        }
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$41 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)file_hash_table.T, thread);
                    final SubLObject _values2 = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values2);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$41, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
        }
        if (file_hash_table.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !checked.numE(map_utilities.map_size(map))) {
            Errors.error((SubLObject)file_hash_table.$str527$We_checked__A_of__A_entries_, checked, map_utilities.map_size(map));
        }
        finalize_file_hash_table(fht);
        fht = (not_found = open_file_hash_table_read_only(fht_name, test, serialization));
        checked = (SubLObject)file_hash_table.ZERO_INTEGER;
        final SubLObject table_var = fht;
        utilities_macros.$progress_note$.setDynamicValue((SubLObject)file_hash_table.$str528$Checking_FHT_against_map____, thread);
        utilities_macros.$progress_start_time$.setDynamicValue(Time.get_universal_time(), thread);
        utilities_macros.$progress_total$.setDynamicValue(file_hash_table_count(table_var), thread);
        utilities_macros.$progress_sofar$.setDynamicValue((SubLObject)file_hash_table.ZERO_INTEGER, thread);
        final SubLObject _prev_bind_9 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_10 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_11 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_12 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)file_hash_table.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)file_hash_table.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)file_hash_table.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                SubLObject continuation = (SubLObject)file_hash_table.NIL;
                SubLObject next;
                for (SubLObject completeP = (SubLObject)file_hash_table.NIL; file_hash_table.NIL == completeP; completeP = Types.sublisp_null(next)) {
                    thread.resetMultipleValues();
                    final SubLObject the_key = get_file_hash_table_any(table_var, continuation, (SubLObject)file_hash_table.NIL);
                    final SubLObject the_value = thread.secondMultipleValue();
                    next = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    if (file_hash_table.NIL != next) {
                        final SubLObject key3 = the_key;
                        final SubLObject values3 = the_value;
                        utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                        utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)file_hash_table.ONE_INTEGER), thread);
                        final SubLObject map_values = map_utilities.map_get(map, key3, not_found);
                        if (file_hash_table.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && file_hash_table.NIL == Functions.funcall(value_test, values3, map_values)) {
                            Errors.error((SubLObject)file_hash_table.$str529$For__S__epxected__S__got__S_inste, key3, values3, map_values);
                        }
                        checked = Numbers.add(checked, (SubLObject)file_hash_table.ONE_INTEGER);
                    }
                    continuation = next;
                }
            }
            finally {
                final SubLObject _prev_bind_0_$42 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)file_hash_table.T, thread);
                    final SubLObject _values3 = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values3);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$42, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_12, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_11, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_10, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_9, thread);
        }
        if (file_hash_table.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !checked.numE(map_utilities.map_size(map))) {
            Errors.error((SubLObject)file_hash_table.$str527$We_checked__A_of__A_entries_, checked, map_utilities.map_size(map));
        }
        finalize_file_hash_table(fht);
        return fht_name;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 150320L)
    public static SubLObject test_fast_fht_with_kb_contents(final SubLObject count, final SubLObject generator, final SubLObject key_property_fn, final SubLObject value_property_fn, SubLObject test, SubLObject value_test, SubLObject serialization) {
        if (test == file_hash_table.UNPROVIDED) {
            test = (SubLObject)file_hash_table.EQL;
        }
        if (value_test == file_hash_table.UNPROVIDED) {
            value_test = (SubLObject)file_hash_table.EQUALP;
        }
        if (serialization == file_hash_table.UNPROVIDED) {
            serialization = (SubLObject)file_hash_table.$kw164$IMAGE_DEPENDENT_CFASL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = file_hash_table.$test_fast_fht_generator_state$.currentBinding(thread);
        try {
            file_hash_table.$test_fast_fht_generator_state$.bind((SubLObject)file_hash_table.NIL, thread);
            final SubLObject map = Hashtables.make_hash_table(count, test, (SubLObject)file_hash_table.UNPROVIDED);
            SubLObject i;
            SubLObject item;
            SubLObject key;
            SubLObject value;
            for (i = (SubLObject)file_hash_table.NIL, i = (SubLObject)file_hash_table.ZERO_INTEGER; i.numL(count); i = Numbers.add(i, (SubLObject)file_hash_table.ONE_INTEGER)) {
                item = Functions.funcall(generator);
                key = Functions.funcall(key_property_fn, item);
                value = Functions.funcall(value_property_fn, item);
                map_utilities.map_put(map, key, value);
            }
            final SubLObject filename = test_fast_fht_creation_with_map_contents(map, serialization, value_test);
            SubLObject ignore_errors_tag = (SubLObject)file_hash_table.NIL;
            try {
                thread.throwStack.push(file_hash_table.$kw416$IGNORE_ERRORS_TARGET);
                final SubLObject _prev_bind_0_$43 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)file_hash_table.$sym417$IGNORE_ERRORS_HANDLER), thread);
                    try {
                        Filesys.delete_file(filename);
                    }
                    catch (Throwable catch_var) {
                        Errors.handleThrowable(catch_var, (SubLObject)file_hash_table.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(_prev_bind_0_$43, thread);
                }
            }
            catch (Throwable ccatch_env_var) {
                ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)file_hash_table.$kw416$IGNORE_ERRORS_TARGET);
            }
            finally {
                thread.throwStack.pop();
            }
        }
        finally {
            file_hash_table.$test_fast_fht_generator_state$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)file_hash_table.$kw519$SUCCESS;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 151143L)
    public static SubLObject test_ffhtkb_generate_constant_info() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (file_hash_table.NIL == file_hash_table.$test_fast_fht_generator_state$.getDynamicValue(thread)) {
            final SubLObject v_term = constants_high.random_constant((SubLObject)file_hash_table.UNPROVIDED);
            final SubLObject suid = constant_handles.constant_suid(v_term);
            final SubLObject guid = constants_high.constant_guid(v_term);
            final SubLObject name = constants_high.constant_name(v_term);
            file_hash_table.$test_fast_fht_generator_state$.setDynamicValue((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)file_hash_table.$kw143$KEY, (SubLObject)ConsesLow.cons((SubLObject)Characters.CHAR_I, suid), (SubLObject)file_hash_table.$kw532$VALUE, guid), (SubLObject)ConsesLow.list((SubLObject)file_hash_table.$kw143$KEY, (SubLObject)ConsesLow.cons((SubLObject)Characters.CHAR_G, guid), (SubLObject)file_hash_table.$kw532$VALUE, suid), (SubLObject)ConsesLow.list((SubLObject)file_hash_table.$kw143$KEY, (SubLObject)ConsesLow.cons((SubLObject)Characters.CHAR_T, name), (SubLObject)file_hash_table.$kw532$VALUE, suid), (SubLObject)ConsesLow.list((SubLObject)file_hash_table.$kw143$KEY, (SubLObject)ConsesLow.cons((SubLObject)Characters.CHAR_S, suid), (SubLObject)file_hash_table.$kw532$VALUE, name)), thread);
        }
        return file_hash_table.$test_fast_fht_generator_state$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 151728L)
    public static SubLObject test_ffhtkb_grab_constant_key_info(final SubLObject state) {
        final SubLObject curr_state = state.first();
        return conses_high.getf(curr_state, (SubLObject)file_hash_table.$kw143$KEY, (SubLObject)file_hash_table.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-hash-table.lisp", position = 151861L)
    public static SubLObject test_ffhtkb_grab_constant_value_info(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject curr_state = state.first();
        final SubLObject value = conses_high.getf(curr_state, (SubLObject)file_hash_table.$kw532$VALUE, (SubLObject)file_hash_table.UNPROVIDED);
        file_hash_table.$test_fast_fht_generator_state$.setDynamicValue(file_hash_table.$test_fast_fht_generator_state$.getDynamicValue(thread).rest(), thread);
        return value;
    }
    
    public static SubLObject declare_file_hash_table_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "file_hash_table_print_function_trampoline", "FILE-HASH-TABLE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "file_hash_table_p", "FILE-HASH-TABLE-P", 1, 0, false);
        new $file_hash_table_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "file_hash_table_stream", "FILE-HASH-TABLE-STREAM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "file_hash_table_header", "FILE-HASH-TABLE-HEADER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "file_hash_table_lock", "FILE-HASH-TABLE-LOCK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "file_hash_table_encoding_input_fn", "FILE-HASH-TABLE-ENCODING-INPUT-FN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "file_hash_table_encoding_output_fn", "FILE-HASH-TABLE-ENCODING-OUTPUT-FN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "file_hash_table_encoding_size_fn", "FILE-HASH-TABLE-ENCODING-SIZE-FN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "file_hash_table_encoding_key_input_fn", "FILE-HASH-TABLE-ENCODING-KEY-INPUT-FN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "file_hash_table_encoding_key_output_fn", "FILE-HASH-TABLE-ENCODING-KEY-OUTPUT-FN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "file_hash_table_testfn", "FILE-HASH-TABLE-TESTFN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "file_hash_table_hash_fn", "FILE-HASH-TABLE-HASH-FN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "file_hash_table_input_cache", "FILE-HASH-TABLE-INPUT-CACHE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "file_hash_table_output_cache", "FILE-HASH-TABLE-OUTPUT-CACHE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "file_hash_table_property_list", "FILE-HASH-TABLE-PROPERTY-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "_csetf_file_hash_table_stream", "_CSETF-FILE-HASH-TABLE-STREAM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "_csetf_file_hash_table_header", "_CSETF-FILE-HASH-TABLE-HEADER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "_csetf_file_hash_table_lock", "_CSETF-FILE-HASH-TABLE-LOCK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "_csetf_file_hash_table_encoding_input_fn", "_CSETF-FILE-HASH-TABLE-ENCODING-INPUT-FN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "_csetf_file_hash_table_encoding_output_fn", "_CSETF-FILE-HASH-TABLE-ENCODING-OUTPUT-FN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "_csetf_file_hash_table_encoding_size_fn", "_CSETF-FILE-HASH-TABLE-ENCODING-SIZE-FN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "_csetf_file_hash_table_encoding_key_input_fn", "_CSETF-FILE-HASH-TABLE-ENCODING-KEY-INPUT-FN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "_csetf_file_hash_table_encoding_key_output_fn", "_CSETF-FILE-HASH-TABLE-ENCODING-KEY-OUTPUT-FN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "_csetf_file_hash_table_testfn", "_CSETF-FILE-HASH-TABLE-TESTFN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "_csetf_file_hash_table_hash_fn", "_CSETF-FILE-HASH-TABLE-HASH-FN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "_csetf_file_hash_table_input_cache", "_CSETF-FILE-HASH-TABLE-INPUT-CACHE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "_csetf_file_hash_table_output_cache", "_CSETF-FILE-HASH-TABLE-OUTPUT-CACHE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "_csetf_file_hash_table_property_list", "_CSETF-FILE-HASH-TABLE-PROPERTY-LIST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "make_file_hash_table", "MAKE-FILE-HASH-TABLE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "visit_defstruct_file_hash_table", "VISIT-DEFSTRUCT-FILE-HASH-TABLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "visit_defstruct_object_file_hash_table_method", "VISIT-DEFSTRUCT-OBJECT-FILE-HASH-TABLE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "describe_file_hash_table", "DESCRIBE-FILE-HASH-TABLE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "read_only_file_hash_table_p", "READ-ONLY-FILE-HASH-TABLE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "writeable_file_hash_table_p", "WRITEABLE-FILE-HASH-TABLE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "file_hash_table_is_read_onlyP", "FILE-HASH-TABLE-IS-READ-ONLY?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "file_hash_table_path", "FILE-HASH-TABLE-PATH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "file_hash_table_serialization", "FILE-HASH-TABLE-SERIALIZATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "file_hash_table_change_stream_buffer_size", "FILE-HASH-TABLE-CHANGE-STREAM-BUFFER-SIZE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "file_hash_table_enable_memory_mapping", "FILE-HASH-TABLE-ENABLE-MEMORY-MAPPING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "file_hash_table_memory_mappedP", "FILE-HASH-TABLE-MEMORY-MAPPED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "htfile_header_print_function_trampoline", "HTFILE-HEADER-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "htfile_header_p", "HTFILE-HEADER-P", 1, 0, false);
        new $htfile_header_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "htfile_header_size", "HTFILE-HEADER-SIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "htfile_header_version_major", "HTFILE-HEADER-VERSION-MAJOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "htfile_header_version_minor", "HTFILE-HEADER-VERSION-MINOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "htfile_header_object_space_offset", "HTFILE-HEADER-OBJECT-SPACE-OFFSET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "htfile_header_key_space_offset", "HTFILE-HEADER-KEY-SPACE-OFFSET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "htfile_header_current_heap_top", "HTFILE-HEADER-CURRENT-HEAP-TOP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "htfile_header_item_count", "HTFILE-HEADER-ITEM-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "htfile_header_capacity", "HTFILE-HEADER-CAPACITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "htfile_header_free_list_head", "HTFILE-HEADER-FREE-LIST-HEAD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "htfile_header_deletion_count", "HTFILE-HEADER-DELETION-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "htfile_header_header_crc", "HTFILE-HEADER-HEADER-CRC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "htfile_header_extension_space_size", "HTFILE-HEADER-EXTENSION-SPACE-SIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "htfile_header_extension_space", "HTFILE-HEADER-EXTENSION-SPACE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "_csetf_htfile_header_size", "_CSETF-HTFILE-HEADER-SIZE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "_csetf_htfile_header_version_major", "_CSETF-HTFILE-HEADER-VERSION-MAJOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "_csetf_htfile_header_version_minor", "_CSETF-HTFILE-HEADER-VERSION-MINOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "_csetf_htfile_header_object_space_offset", "_CSETF-HTFILE-HEADER-OBJECT-SPACE-OFFSET", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "_csetf_htfile_header_key_space_offset", "_CSETF-HTFILE-HEADER-KEY-SPACE-OFFSET", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "_csetf_htfile_header_current_heap_top", "_CSETF-HTFILE-HEADER-CURRENT-HEAP-TOP", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "_csetf_htfile_header_item_count", "_CSETF-HTFILE-HEADER-ITEM-COUNT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "_csetf_htfile_header_capacity", "_CSETF-HTFILE-HEADER-CAPACITY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "_csetf_htfile_header_free_list_head", "_CSETF-HTFILE-HEADER-FREE-LIST-HEAD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "_csetf_htfile_header_deletion_count", "_CSETF-HTFILE-HEADER-DELETION-COUNT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "_csetf_htfile_header_header_crc", "_CSETF-HTFILE-HEADER-HEADER-CRC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "_csetf_htfile_header_extension_space_size", "_CSETF-HTFILE-HEADER-EXTENSION-SPACE-SIZE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "_csetf_htfile_header_extension_space", "_CSETF-HTFILE-HEADER-EXTENSION-SPACE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "make_htfile_header", "MAKE-HTFILE-HEADER", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "visit_defstruct_htfile_header", "VISIT-DEFSTRUCT-HTFILE-HEADER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "visit_defstruct_object_htfile_header_method", "VISIT-DEFSTRUCT-OBJECT-HTFILE-HEADER-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "describe_htfile_header", "DESCRIBE-HTFILE-HEADER", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "htfile_object_entry_print_function_trampoline", "HTFILE-OBJECT-ENTRY-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "htfile_object_entry_p", "HTFILE-OBJECT-ENTRY-P", 1, 0, false);
        new $htfile_object_entry_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "htfile_object_entry_size", "HTFILE-OBJECT-ENTRY-SIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "htfile_object_entry_type", "HTFILE-OBJECT-ENTRY-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "htfile_object_entry_key_size", "HTFILE-OBJECT-ENTRY-KEY-SIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "htfile_object_entry_key", "HTFILE-OBJECT-ENTRY-KEY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "htfile_object_entry_data_size", "HTFILE-OBJECT-ENTRY-DATA-SIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "htfile_object_entry_data", "HTFILE-OBJECT-ENTRY-DATA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "_csetf_htfile_object_entry_size", "_CSETF-HTFILE-OBJECT-ENTRY-SIZE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "_csetf_htfile_object_entry_type", "_CSETF-HTFILE-OBJECT-ENTRY-TYPE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "_csetf_htfile_object_entry_key_size", "_CSETF-HTFILE-OBJECT-ENTRY-KEY-SIZE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "_csetf_htfile_object_entry_key", "_CSETF-HTFILE-OBJECT-ENTRY-KEY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "_csetf_htfile_object_entry_data_size", "_CSETF-HTFILE-OBJECT-ENTRY-DATA-SIZE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "_csetf_htfile_object_entry_data", "_CSETF-HTFILE-OBJECT-ENTRY-DATA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "make_htfile_object_entry", "MAKE-HTFILE-OBJECT-ENTRY", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "visit_defstruct_htfile_object_entry", "VISIT-DEFSTRUCT-HTFILE-OBJECT-ENTRY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "visit_defstruct_object_htfile_object_entry_method", "VISIT-DEFSTRUCT-OBJECT-HTFILE-OBJECT-ENTRY-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "htfile_key_entry_print_function_trampoline", "HTFILE-KEY-ENTRY-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "htfile_key_entry_p", "HTFILE-KEY-ENTRY-P", 1, 0, false);
        new $htfile_key_entry_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "htfile_key_entry_key_offset", "HTFILE-KEY-ENTRY-KEY-OFFSET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "htfile_key_entry_hash_code", "HTFILE-KEY-ENTRY-HASH-CODE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "_csetf_htfile_key_entry_key_offset", "_CSETF-HTFILE-KEY-ENTRY-KEY-OFFSET", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "_csetf_htfile_key_entry_hash_code", "_CSETF-HTFILE-KEY-ENTRY-HASH-CODE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "make_htfile_key_entry", "MAKE-HTFILE-KEY-ENTRY", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "visit_defstruct_htfile_key_entry", "VISIT-DEFSTRUCT-HTFILE-KEY-ENTRY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "visit_defstruct_object_htfile_key_entry_method", "VISIT-DEFSTRUCT-OBJECT-HTFILE-KEY-ENTRY-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "get_default_fht_test_function", "GET-DEFAULT-FHT-TEST-FUNCTION", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "get_default_fht_serialization_protocol", "GET-DEFAULT-FHT-SERIALIZATION-PROTOCOL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "new_htfile_header", "NEW-HTFILE-HEADER", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "construct_empty_htfile_header", "CONSTRUCT-EMPTY-HTFILE-HEADER", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "htfile_scale_user_space_to_implementation_space", "HTFILE-SCALE-USER-SPACE-TO-IMPLEMENTATION-SPACE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "htfile_minimal_space_required", "HTFILE-MINIMAL-SPACE-REQUIRED", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "new_file_hash_table", "NEW-FILE-HASH-TABLE", 5, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "new_empty_file_hash_table", "NEW-EMPTY-FILE-HASH-TABLE", 6, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "new_htfile_key_entry", "NEW-HTFILE-KEY-ENTRY", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "construct_tombstone_key_entry", "CONSTRUCT-TOMBSTONE-KEY-ENTRY", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "is_tombstoned_key_entryP", "IS-TOMBSTONED-KEY-ENTRY?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "construct_empty_key_entry", "CONSTRUCT-EMPTY-KEY-ENTRY", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "is_empty_key_entryP", "IS-EMPTY-KEY-ENTRY?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "is_valid_key_entryP", "IS-VALID-KEY-ENTRY?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "fht_sxhash_for_fht", "FHT-SXHASH-FOR-FHT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "fht_sxhash", "FHT-SXHASH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "valid_hash_code_p", "VALID-HASH-CODE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "new_object_entry", "NEW-OBJECT-ENTRY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "fht_serialization_entry_print_function_trampoline", "FHT-SERIALIZATION-ENTRY-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "fht_serialization_entry_p", "FHT-SERIALIZATION-ENTRY-P", 1, 0, false);
        new $fht_serialization_entry_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "fht_se_encoding_input_fn", "FHT-SE-ENCODING-INPUT-FN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "fht_se_encoding_output_fn", "FHT-SE-ENCODING-OUTPUT-FN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "fht_se_encoding_size_fn", "FHT-SE-ENCODING-SIZE-FN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "fht_se_hash_fn", "FHT-SE-HASH-FN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "fht_se_encoding_key_input_fn", "FHT-SE-ENCODING-KEY-INPUT-FN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "fht_se_encoding_key_output_fn", "FHT-SE-ENCODING-KEY-OUTPUT-FN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "_csetf_fht_se_encoding_input_fn", "_CSETF-FHT-SE-ENCODING-INPUT-FN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "_csetf_fht_se_encoding_output_fn", "_CSETF-FHT-SE-ENCODING-OUTPUT-FN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "_csetf_fht_se_encoding_size_fn", "_CSETF-FHT-SE-ENCODING-SIZE-FN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "_csetf_fht_se_hash_fn", "_CSETF-FHT-SE-HASH-FN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "_csetf_fht_se_encoding_key_input_fn", "_CSETF-FHT-SE-ENCODING-KEY-INPUT-FN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "_csetf_fht_se_encoding_key_output_fn", "_CSETF-FHT-SE-ENCODING-KEY-OUTPUT-FN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "make_fht_serialization_entry", "MAKE-FHT-SERIALIZATION-ENTRY", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "visit_defstruct_fht_serialization_entry", "VISIT-DEFSTRUCT-FHT-SERIALIZATION-ENTRY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "visit_defstruct_object_fht_serialization_entry_method", "VISIT-DEFSTRUCT-OBJECT-FHT-SERIALIZATION-ENTRY-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "print_fht_serialization_entry", "PRINT-FHT-SERIALIZATION-ENTRY", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "new_fht_serialization_entry", "NEW-FHT-SERIALIZATION-ENTRY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "register_fht_serialization_entry", "REGISTER-FHT-SERIALIZATION-ENTRY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "fht_serialization_entry", "FHT-SERIALIZATION-ENTRY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "fht_serialization_encoding_input_fn", "FHT-SERIALIZATION-ENCODING-INPUT-FN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "fht_serialization_encoding_output_fn", "FHT-SERIALIZATION-ENCODING-OUTPUT-FN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "fht_serialization_encoding_size_fn", "FHT-SERIALIZATION-ENCODING-SIZE-FN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "fht_serialization_hash_fn", "FHT-SERIALIZATION-HASH-FN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "fht_serialization_encoding_key_input_fn", "FHT-SERIALIZATION-ENCODING-KEY-INPUT-FN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "fht_serialization_encoding_key_output_fn", "FHT-SERIALIZATION-ENCODING-KEY-OUTPUT-FN", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.file_hash_table", "do_fht_serializations", "DO-FHT-SERIALIZATIONS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "find_fht_serialization_by_functions", "FIND-FHT-SERIALIZATION-BY-FUNCTIONS", 4, 2, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.file_hash_table", "log_fht_lookup", "LOG-FHT-LOOKUP");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "create_file_hash_table", "CREATE-FILE-HASH-TABLE", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "open_file_hash_table", "OPEN-FILE-HASH-TABLE", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "open_file_hash_table_read_only", "OPEN-FILE-HASH-TABLE-READ-ONLY", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "file_hash_table_open_p", "FILE-HASH-TABLE-OPEN-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "finalize_file_hash_table", "FINALIZE-FILE-HASH-TABLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "file_hash_table_count", "FILE-HASH-TABLE-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "file_hash_table_capacity", "FILE-HASH-TABLE-CAPACITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "put_file_hash_table", "PUT-FILE-HASH-TABLE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "get_file_hash_table", "GET-FILE-HASH-TABLE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "remove_file_hash_table", "REMOVE-FILE-HASH-TABLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "cinc_file_hash_table", "CINC-FILE-HASH-TABLE", 2, 2, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.file_hash_table", "dosome_file_hash_table", "DOSOME-FILE-HASH-TABLE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.file_hash_table", "dosome_pristine_file_hash_table", "DOSOME-PRISTINE-FILE-HASH-TABLE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.file_hash_table", "do_file_hash_table", "DO-FILE-HASH-TABLE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.file_hash_table", "do_pristine_file_hash_table", "DO-PRISTINE-FILE-HASH-TABLE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "print_file_hash_table_contents", "PRINT-FILE-HASH-TABLE-CONTENTS", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.file_hash_table", "progress_do_file_hash_table", "PROGRESS-DO-FILE-HASH-TABLE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.file_hash_table", "dosome_file_hash_table_keys", "DOSOME-FILE-HASH-TABLE-KEYS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.file_hash_table", "do_file_hash_table_keys", "DO-FILE-HASH-TABLE-KEYS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.file_hash_table", "do_pristine_file_hash_table_keys", "DO-PRISTINE-FILE-HASH-TABLE-KEYS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.file_hash_table", "progress_do_file_hash_table_keys", "PROGRESS-DO-FILE-HASH-TABLE-KEYS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "file_hash_table_keys", "FILE-HASH-TABLE-KEYS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "file_hash_table_random_n", "FILE-HASH-TABLE-RANDOM-N", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "validate_file_hash_table", "VALIDATE-FILE-HASH-TABLE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "recover_file_hash_table_heap", "RECOVER-FILE-HASH-TABLE-HEAP", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "new_file_hash_table_iterator", "NEW-FILE-HASH-TABLE-ITERATOR", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "new_file_hash_table_keys_iterator", "NEW-FILE-HASH-TABLE-KEYS-ITERATOR", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "new_file_hash_table_values_iterator", "NEW-FILE-HASH-TABLE-VALUES-ITERATOR", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "iterate_file_hash_table_next_value", "ITERATE-FILE-HASH-TABLE-NEXT-VALUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "new_file_hash_table_iterator_internal", "NEW-FILE-HASH-TABLE-ITERATOR-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "make_iterator_file_hash_table_state", "MAKE-ITERATOR-FILE-HASH-TABLE-STATE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "iterate_file_hash_table_doneP", "ITERATE-FILE-HASH-TABLE-DONE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "iterate_file_hash_table_next", "ITERATE-FILE-HASH-TABLE-NEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "make_fht_iterator_next", "MAKE-FHT-ITERATOR-NEXT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "fht_iterator_next_value", "FHT-ITERATOR-NEXT-VALUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "file_hash_table_to_alist", "FILE-HASH-TABLE-TO-ALIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "hash_table_to_file_hash_table", "HASH-TABLE-TO-FILE-HASH-TABLE", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "alist_to_file_hash_table", "ALIST-TO-FILE-HASH-TABLE", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "file_hash_table_copy", "FILE-HASH-TABLE-COPY", 2, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "get_file_hash_table_storage_resourcing", "GET-FILE-HASH-TABLE-STORAGE-RESOURCING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "set_file_hash_table_storage_resourcing", "SET-FILE-HASH-TABLE-STORAGE-RESOURCING", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "file_hash_table_storage_resourcing_onP", "FILE-HASH-TABLE-STORAGE-RESOURCING-ON?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "compute_fht_cache_capacity", "COMPUTE-FHT-CACHE-CAPACITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "allocate_file_hash_table_caches", "ALLOCATE-FILE-HASH-TABLE-CACHES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "put_fht_lookaside_cache", "PUT-FHT-LOOKASIDE-CACHE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "get_fht_lookaside_cache", "GET-FHT-LOOKASIDE-CACHE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "remove_fht_lookaside_cache", "REMOVE-FHT-LOOKASIDE-CACHE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "get_pristine_file_hash_table_any", "GET-PRISTINE-FILE-HASH-TABLE-ANY", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "get_file_hash_table_any", "GET-FILE-HASH-TABLE-ANY", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "perform_fht_put", "PERFORM-FHT-PUT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "perform_fht_put_insert", "PERFORM-FHT-PUT-INSERT", 6, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "perform_fht_put_replace", "PERFORM-FHT-PUT-REPLACE", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "perform_fht_remove", "PERFORM-FHT-REMOVE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "perform_fht_remove_int", "PERFORM-FHT-REMOVE-INT", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "clear_fht_key_entry_node", "CLEAR-FHT-KEY-ENTRY-NODE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "fht_fill_key_entry_gap", "FHT-FILL-KEY-ENTRY-GAP", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "fht_lookup_key_index_only", "FHT-LOOKUP-KEY-INDEX-ONLY", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "increase_fht_item_count", "INCREASE-FHT-ITEM-COUNT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "decrease_fht_item_count", "DECREASE-FHT-ITEM-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "perform_fht_get", "PERFORM-FHT-GET", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "htfile_file_block_entry_print_function_trampoline", "HTFILE-FILE-BLOCK-ENTRY-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "htfile_file_block_entry_p", "HTFILE-FILE-BLOCK-ENTRY-P", 1, 0, false);
        new $htfile_file_block_entry_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "htfile_file_block_entry_size", "HTFILE-FILE-BLOCK-ENTRY-SIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "htfile_file_block_entry_next", "HTFILE-FILE-BLOCK-ENTRY-NEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "_csetf_htfile_file_block_entry_size", "_CSETF-HTFILE-FILE-BLOCK-ENTRY-SIZE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "_csetf_htfile_file_block_entry_next", "_CSETF-HTFILE-FILE-BLOCK-ENTRY-NEXT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "make_htfile_file_block_entry", "MAKE-HTFILE-FILE-BLOCK-ENTRY", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "visit_defstruct_htfile_file_block_entry", "VISIT-DEFSTRUCT-HTFILE-FILE-BLOCK-ENTRY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "visit_defstruct_object_htfile_file_block_entry_method", "VISIT-DEFSTRUCT-OBJECT-HTFILE-FILE-BLOCK-ENTRY-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "new_htfile_file_block_entry", "NEW-HTFILE-FILE-BLOCK-ENTRY", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "print_htfile_file_block_entry", "PRINT-HTFILE-FILE-BLOCK-ENTRY", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "copy_file_block", "COPY-FILE-BLOCK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "write_file_block_entry_to_space", "WRITE-FILE-BLOCK-ENTRY-TO-SPACE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "read_file_block_entry_from_space", "READ-FILE-BLOCK-ENTRY-FROM-SPACE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "deallocate_object_space", "DEALLOCATE-OBJECT-SPACE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "insert_file_block_in_free_list", "INSERT-FILE-BLOCK-IN-FREE-LIST", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "allocate_object_space_from_free_list", "ALLOCATE-OBJECT-SPACE-FROM-FREE-LIST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "write_initial_table", "WRITE-INITIAL-TABLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "allocate_fht_heap_space", "ALLOCATE-FHT-HEAP-SPACE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "allocate_fht_key_space", "ALLOCATE-FHT-KEY-SPACE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "htfile_minimal_space_required_for_key", "HTFILE-MINIMAL-SPACE-REQUIRED-FOR-KEY", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "fht_key_index_to_reladdr", "FHT-KEY-INDEX-TO-RELADDR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "fht_keyspace_byte_size", "FHT-KEYSPACE-BYTE-SIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "valid_heap_offset_p", "VALID-HEAP-OFFSET-P", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "valid_fht_heap_offset_p", "VALID-FHT-HEAP-OFFSET-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "valid_offset_in_keyspace_p", "VALID-OFFSET-IN-KEYSPACE-P", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "fht_get_keyspace_size", "FHT-GET-KEYSPACE-SIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "fht_key_reladdr_to_address", "FHT-KEY-RELADDR-TO-ADDRESS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "fht_key_index_to_address", "FHT-KEY-INDEX-TO-ADDRESS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "validate_fht_key_index", "VALIDATE-FHT-KEY-INDEX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "validate_fht_key_entry", "VALIDATE-FHT-KEY-ENTRY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "write_key_entry_object", "WRITE-KEY-ENTRY-OBJECT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "read_key_entry_object", "READ-KEY-ENTRY-OBJECT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "fetch_fht_key_entry", "FETCH-FHT-KEY-ENTRY", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "store_fht_key_entry", "STORE-FHT-KEY-ENTRY", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "fht_hash", "FHT-HASH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "fht_ensure_hash_table_size", "FHT-ENSURE-HASH-TABLE-SIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "fht_compute_fence_post_index", "FHT-COMPUTE-FENCE-POST-INDEX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "fht_step_key_index", "FHT-STEP-KEY-INDEX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "fht_lookup_key", "FHT-LOOKUP-KEY", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "identical_fht_key_entryP", "IDENTICAL-FHT-KEY-ENTRY?", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "complete_fht_object_entry_for_key", "COMPLETE-FHT-OBJECT-ENTRY-FOR-KEY", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "potentially_grow_fht_table", "POTENTIALLY-GROW-FHT-TABLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "perform_grow_fht_table", "PERFORM-GROW-FHT-TABLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "is_fht_too_smallP", "IS-FHT-TOO-SMALL?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "resize_fht_object_and_key_spaces", "RESIZE-FHT-OBJECT-AND-KEY-SPACES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "allocate_new_fht_key_space", "ALLOCATE-NEW-FHT-KEY-SPACE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "move_htfile_key_space", "MOVE-HTFILE-KEY-SPACE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "rehash_fht_key_space", "REHASH-FHT-KEY-SPACE", 3, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.file_hash_table", "with_different_keyspace", "WITH-DIFFERENT-KEYSPACE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "rehash_fht_cached_keys", "REHASH-FHT-CACHED-KEYS", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "handle_rehash_fht_insert", "HANDLE-REHASH-FHT-INSERT", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "htfile_minimal_space_required_for_object", "HTFILE-MINIMAL-SPACE-REQUIRED-FOR-OBJECT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "specify_object_entry", "SPECIFY-OBJECT-ENTRY", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "compute_object_entry_size", "COMPUTE-OBJECT-ENTRY-SIZE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "allocate_object_space", "ALLOCATE-OBJECT-SPACE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "store_fht_object_entry", "STORE-FHT-OBJECT-ENTRY", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "write_object_entry_to_space", "WRITE-OBJECT-ENTRY-TO-SPACE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "read_object_entry_from_space", "READ-OBJECT-ENTRY-FROM-SPACE", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "increase_htfile_heap_size", "INCREASE-HTFILE-HEAP-SIZE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "compute_new_htfile_heap_size", "COMPUTE-NEW-HTFILE-HEAP-SIZE", 1, 1, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.file_hash_table", "register_file_table_header_support", "REGISTER-FILE-TABLE-HEADER-SUPPORT");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "read_fht_header", "READ-FHT-HEADER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "write_fht_header", "WRITE-FHT-HEADER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "read_fht_header_version1p3", "READ-FHT-HEADER-VERSION1P3", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "write_fht_header_version1p3", "WRITE-FHT-HEADER-VERSION1P3", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "read_fht_extension_space", "READ-FHT-EXTENSION-SPACE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "write_fht_extension_space", "WRITE-FHT-EXTENSION-SPACE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "verify_version1p3_crc", "VERIFY-VERSION1P3-CRC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "read_fht_uint4", "READ-FHT-UINT4", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "write_fht_uint4", "WRITE-FHT-UINT4", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "read_fht_uint8", "READ-FHT-UINT8", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "write_fht_uint8", "WRITE-FHT-UINT8", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "write_null_fht_bytes", "WRITE-NULL-FHT-BYTES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "read_fht_encoded_object", "READ-FHT-ENCODED-OBJECT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "write_fht_encoded_object", "WRITE-FHT-ENCODED-OBJECT", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "read_fht_binary_block", "READ-FHT-BINARY-BLOCK", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "write_fht_binary_block", "WRITE-FHT-BINARY-BLOCK", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "move_fht_binary_block", "MOVE-FHT-BINARY-BLOCK", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "aggressive_fast_fht_optimization_modeP", "AGGRESSIVE-FAST-FHT-OPTIMIZATION-MODE?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "moderate_fast_fht_optimization_modeP", "MODERATE-FAST-FHT-OPTIMIZATION-MODE?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "conservative_fast_fht_optimization_modeP", "CONSERVATIVE-FAST-FHT-OPTIMIZATION-MODE?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "invalid_fast_fht_optimization_mode", "INVALID-FAST-FHT-OPTIMIZATION-MODE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "fast_create_fht_print_function_trampoline", "FAST-CREATE-FHT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "fast_create_fht_p", "FAST-CREATE-FHT-P", 1, 0, false);
        new $fast_create_fht_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "fast_create_fht_fht", "FAST-CREATE-FHT-FHT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "fast_create_fht_tempstem", "FAST-CREATE-FHT-TEMPSTEM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "fast_create_fht_tempfile", "FAST-CREATE-FHT-TEMPFILE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "fast_create_fht_keystream", "FAST-CREATE-FHT-KEYSTREAM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "_csetf_fast_create_fht_fht", "_CSETF-FAST-CREATE-FHT-FHT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "_csetf_fast_create_fht_tempstem", "_CSETF-FAST-CREATE-FHT-TEMPSTEM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "_csetf_fast_create_fht_tempfile", "_CSETF-FAST-CREATE-FHT-TEMPFILE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "_csetf_fast_create_fht_keystream", "_CSETF-FAST-CREATE-FHT-KEYSTREAM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "make_fast_create_fht", "MAKE-FAST-CREATE-FHT", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "visit_defstruct_fast_create_fht", "VISIT-DEFSTRUCT-FAST-CREATE-FHT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "visit_defstruct_object_fast_create_fht_method", "VISIT-DEFSTRUCT-OBJECT-FAST-CREATE-FHT-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "fast_create_file_hash_table", "FAST-CREATE-FILE-HASH-TABLE", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "fast_create_allocate_keystream", "FAST-CREATE-ALLOCATE-KEYSTREAM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "fast_create_fixup_object_heap", "FAST-CREATE-FIXUP-OBJECT-HEAP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "fast_put_file_hash_table", "FAST-PUT-FILE-HASH-TABLE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "perform_fast_fht_put", "PERFORM-FAST-FHT-PUT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "update_fast_fht_keystream", "UPDATE-FAST-FHT-KEYSTREAM", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "finalize_fast_create_file_hash_table", "FINALIZE-FAST-CREATE-FILE-HASH-TABLE", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "prepare_fast_fht_keyspace", "PREPARE-FAST-FHT-KEYSPACE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "realign_fast_fht_keyspace_offset", "REALIGN-FAST-FHT-KEYSPACE-OFFSET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "realign_fast_fht_keyspace_capacity", "REALIGN-FAST-FHT-KEYSPACE-CAPACITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "allocate_fast_fht_keyspace", "ALLOCATE-FAST-FHT-KEYSPACE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "insert_fast_fht_keystream_content", "INSERT-FAST-FHT-KEYSTREAM-CONTENT", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "perform_fast_fht_insert_of_unambiguous_keys", "PERFORM-FAST-FHT-INSERT-OF-UNAMBIGUOUS-KEYS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "perform_fast_fht_insert_by_keystream_ordering", "PERFORM-FAST-FHT-INSERT-BY-KEYSTREAM-ORDERING", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "shutdown_fast_create_fht", "SHUTDOWN-FAST-CREATE-FHT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "fast_fht_keystream_sorter_print_function_trampoline", "FAST-FHT-KEYSTREAM-SORTER-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "fast_fht_keystream_sorter_p", "FAST-FHT-KEYSTREAM-SORTER-P", 1, 0, false);
        new $fast_fht_keystream_sorter_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "fstfht_ksorter_tempstem", "FSTFHT-KSORTER-TEMPSTEM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "fstfht_ksorter_in_files", "FSTFHT-KSORTER-IN-FILES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "fstfht_ksorter_out_files", "FSTFHT-KSORTER-OUT-FILES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "_csetf_fstfht_ksorter_tempstem", "_CSETF-FSTFHT-KSORTER-TEMPSTEM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "_csetf_fstfht_ksorter_in_files", "_CSETF-FSTFHT-KSORTER-IN-FILES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "_csetf_fstfht_ksorter_out_files", "_CSETF-FSTFHT-KSORTER-OUT-FILES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "make_fast_fht_keystream_sorter", "MAKE-FAST-FHT-KEYSTREAM-SORTER", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "visit_defstruct_fast_fht_keystream_sorter", "VISIT-DEFSTRUCT-FAST-FHT-KEYSTREAM-SORTER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "visit_defstruct_object_fast_fht_keystream_sorter_method", "VISIT-DEFSTRUCT-OBJECT-FAST-FHT-KEYSTREAM-SORTER-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "fast_fht_sort_keystream_by_expected_index", "FAST-FHT-SORT-KEYSTREAM-BY-EXPECTED-INDEX", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "new_fast_fht_keystream_sorter", "NEW-FAST-FHT-KEYSTREAM-SORTER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "fast_fht_n_temp_files", "FAST-FHT-N-TEMP-FILES", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "fast_fht_split_keystream_into_tiled_input_files", "FAST-FHT-SPLIT-KEYSTREAM-INTO-TILED-INPUT-FILES", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "fast_fht_read_one_keystream_entry", "FAST-FHT-READ-ONE-KEYSTREAM-ENTRY", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "fast_fht_keystream_sentinel_entry", "FAST-FHT-KEYSTREAM-SENTINEL-ENTRY", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "fast_fht_keystream_eof_entry", "FAST-FHT-KEYSTREAM-EOF-ENTRY", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "fast_fht_keystream_entry_cmp", "FAST-FHT-KEYSTREAM-ENTRY-CMP", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "fast_fht_keystream_entryL", "FAST-FHT-KEYSTREAM-ENTRY<", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "fast_fht_write_one_keystream_tile", "FAST-FHT-WRITE-ONE-KEYSTREAM-TILE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "is_fast_fht_keystream_chunk_separator_entryP", "IS-FAST-FHT-KEYSTREAM-CHUNK-SEPARATOR-ENTRY?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "is_fast_fht_keystream_eofP", "IS-FAST-FHT-KEYSTREAM-EOF?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "fast_fht_write_keystream_chunk_separator", "FAST-FHT-WRITE-KEYSTREAM-CHUNK-SEPARATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "fast_fht_write_keystream_entry", "FAST-FHT-WRITE-KEYSTREAM-ENTRY", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "fast_fht_write_one_keystream_entry", "FAST-FHT-WRITE-ONE-KEYSTREAM-ENTRY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "fast_fht_write_one_collision_stream_entry", "FAST-FHT-WRITE-ONE-COLLISION-STREAM-ENTRY", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "fast_fht_almost_merge_sort_keystream", "FAST-FHT-ALMOST-MERGE-SORT-KEYSTREAM", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "fast_fht_merge_keystream_input_files", "FAST-FHT-MERGE-KEYSTREAM-INPUT-FILES", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "fast_fht_merge_keystream_chunks", "FAST-FHT-MERGE-KEYSTREAM-CHUNKS", 4, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.file_hash_table", "fast_fht_drain_index_run", "FAST-FHT-DRAIN-INDEX-RUN");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.file_hash_table", "fast_fht_manage_index_collisions", "FAST-FHT-MANAGE-INDEX-COLLISIONS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "fast_fht_uniquify_keystream", "FAST-FHT-UNIQUIFY-KEYSTREAM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "fast_fht_get_comparable_index_from_entry", "FAST-FHT-GET-COMPARABLE-INDEX-FROM-ENTRY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "fast_fht_dump_keystream", "FAST-FHT-DUMP-KEYSTREAM", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "fast_fht_dump_keystream_files", "FAST-FHT-DUMP-KEYSTREAM-FILES", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "enforce_valid_fast_fht_dump_keystream_files", "ENFORCE-VALID-FAST-FHT-DUMP-KEYSTREAM-FILES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "validate_fast_fht_dump_keystream", "VALIDATE-FAST-FHT-DUMP-KEYSTREAM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "test_fast_fht_keystream_entry_cmp", "TEST-FAST-FHT-KEYSTREAM-ENTRY-CMP", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "fast_fht_keystream_entry_cmp_expand_argument", "FAST-FHT-KEYSTREAM-ENTRY-CMP-EXPAND-ARGUMENT", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.file_hash_table", "with_input_file_hash_table", "WITH-INPUT-FILE-HASH-TABLE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.file_hash_table", "with_writable_file_hash_table", "WITH-WRITABLE-FILE-HASH-TABLE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.file_hash_table", "with_output_file_hash_table", "WITH-OUTPUT-FILE-HASH-TABLE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.file_hash_table", "with_fast_create_file_hash_table", "WITH-FAST-CREATE-FILE-HASH-TABLE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "test_fast_fht_creation_with_merge_sorted_keystream", "TEST-FAST-FHT-CREATION-WITH-MERGE-SORTED-KEYSTREAM", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "test_fast_fht_creation_with_map_contents", "TEST-FAST-FHT-CREATION-WITH-MAP-CONTENTS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "test_fast_fht_with_kb_contents", "TEST-FAST-FHT-WITH-KB-CONTENTS", 4, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "test_ffhtkb_generate_constant_info", "TEST-FFHTKB-GENERATE-CONSTANT-INFO", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "test_ffhtkb_grab_constant_key_info", "TEST-FFHTKB-GRAB-CONSTANT-KEY-INFO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_hash_table", "test_ffhtkb_grab_constant_value_info", "TEST-FFHTKB-GRAB-CONSTANT-VALUE-INFO", 1, 0, false);
        return (SubLObject)file_hash_table.NIL;
    }
    
    public static SubLObject init_file_hash_table_file() {
        file_hash_table.$dtp_file_hash_table$ = SubLFiles.defconstant("*DTP-FILE-HASH-TABLE*", (SubLObject)file_hash_table.$sym0$FILE_HASH_TABLE);
        file_hash_table.$dtp_htfile_header$ = SubLFiles.defconstant("*DTP-HTFILE-HEADER*", (SubLObject)file_hash_table.$sym61$HTFILE_HEADER);
        file_hash_table.$dtp_htfile_object_entry$ = SubLFiles.defconstant("*DTP-HTFILE-OBJECT-ENTRY*", (SubLObject)file_hash_table.$sym121$HTFILE_OBJECT_ENTRY);
        file_hash_table.$dtp_htfile_key_entry$ = SubLFiles.defconstant("*DTP-HTFILE-KEY-ENTRY*", (SubLObject)file_hash_table.$sym148$HTFILE_KEY_ENTRY);
        file_hash_table.$default_fht_test_function$ = SubLFiles.deflexical("*DEFAULT-FHT-TEST-FUNCTION*", Symbols.symbol_function((SubLObject)file_hash_table.EQL));
        file_hash_table.$default_fht_serialization_protocol$ = SubLFiles.deflexical("*DEFAULT-FHT-SERIALIZATION-PROTOCOL*", (SubLObject)file_hash_table.$kw164$IMAGE_DEPENDENT_CFASL);
        file_hash_table.$fht_min_cache_capacity$ = SubLFiles.defparameter("*FHT-MIN-CACHE-CAPACITY*", (SubLObject)file_hash_table.$int165$2000);
        file_hash_table.$fht_cache_percentage$ = SubLFiles.defparameter("*FHT-CACHE-PERCENTAGE*", (SubLObject)file_hash_table.FOUR_INTEGER);
        file_hash_table.$htfile_header_current_vmajor$ = SubLFiles.defconstant("*HTFILE-HEADER-CURRENT-VMAJOR*", (SubLObject)file_hash_table.ONE_INTEGER);
        file_hash_table.$htfile_header_current_vminor$ = SubLFiles.defconstant("*HTFILE-HEADER-CURRENT-VMINOR*", (SubLObject)file_hash_table.THREE_INTEGER);
        file_hash_table.$htfile_header_current_size$ = SubLFiles.defconstant("*HTFILE-HEADER-CURRENT-SIZE*", (SubLObject)file_hash_table.$int166$84);
        file_hash_table.$htfile_default_expected_items$ = SubLFiles.defconstant("*HTFILE-DEFAULT-EXPECTED-ITEMS*", (SubLObject)file_hash_table.$int167$256);
        file_hash_table.$htfile_default_average_size$ = SubLFiles.defconstant("*HTFILE-DEFAULT-AVERAGE-SIZE*", (SubLObject)file_hash_table.$int167$256);
        file_hash_table.$fht_empty_offset_marker$ = SubLFiles.defconstant("*FHT-EMPTY-OFFSET-MARKER*", (SubLObject)file_hash_table.ZERO_INTEGER);
        file_hash_table.$fht_tombstone_offset_marker$ = SubLFiles.defconstant("*FHT-TOMBSTONE-OFFSET-MARKER*", (SubLObject)file_hash_table.ONE_INTEGER);
        file_hash_table.$fht_invalid_hash_code$ = SubLFiles.defconstant("*FHT-INVALID-HASH-CODE*", (SubLObject)file_hash_table.ZERO_INTEGER);
        file_hash_table.$fht_tombstone_key_entry$ = SubLFiles.deflexical("*FHT-TOMBSTONE-KEY-ENTRY*", construct_tombstone_key_entry());
        file_hash_table.$fht_empty_key_entry$ = SubLFiles.deflexical("*FHT-EMPTY-KEY-ENTRY*", construct_empty_key_entry());
        file_hash_table.$max_fht_hash_code_value$ = SubLFiles.deflexical("*MAX-FHT-HASH-CODE-VALUE*", Numbers.subtract(Numbers.expt((SubLObject)file_hash_table.TWO_INTEGER, (SubLObject)file_hash_table.$int171$32), (SubLObject)file_hash_table.ONE_INTEGER));
        file_hash_table.$dtp_fht_serialization_entry$ = SubLFiles.defconstant("*DTP-FHT-SERIALIZATION-ENTRY*", (SubLObject)file_hash_table.$sym172$FHT_SERIALIZATION_ENTRY);
        file_hash_table.$fht_serialization_table$ = SubLFiles.deflexical("*FHT-SERIALIZATION-TABLE*", (file_hash_table.NIL != Symbols.boundp((SubLObject)file_hash_table.$sym202$_FHT_SERIALIZATION_TABLE_)) ? file_hash_table.$fht_serialization_table$.getGlobalValue() : dictionary.new_dictionary((SubLObject)file_hash_table.UNPROVIDED, (SubLObject)file_hash_table.UNPROVIDED));
        file_hash_table.$fht_lookup_stream$ = SubLFiles.defparameter("*FHT-LOOKUP-STREAM*", (SubLObject)file_hash_table.NIL);
        file_hash_table.$fht_not_found$ = SubLFiles.deflexical("*FHT-NOT-FOUND*", (file_hash_table.NIL != Symbols.boundp((SubLObject)file_hash_table.$sym227$_FHT_NOT_FOUND_)) ? file_hash_table.$fht_not_found$.getGlobalValue() : Symbols.make_symbol((SubLObject)file_hash_table.$str228$FileHashTable_Not_Found));
        file_hash_table.$not_in_fht$ = SubLFiles.deflexical("*NOT-IN-FHT*", (file_hash_table.NIL != Symbols.boundp((SubLObject)file_hash_table.$sym229$_NOT_IN_FHT_)) ? file_hash_table.$not_in_fht$.getGlobalValue() : Symbols.make_symbol((SubLObject)file_hash_table.$str230$Not_In_FHT));
        file_hash_table.$fast_put_skip_output_forcing$ = SubLFiles.defparameter("*FAST-PUT-SKIP-OUTPUT-FORCING*", (SubLObject)file_hash_table.NIL);
        file_hash_table.$htfile_minimal_file_block_size$ = SubLFiles.defconstant("*HTFILE-MINIMAL-FILE-BLOCK-SIZE*", (SubLObject)file_hash_table.TWELVE_INTEGER);
        file_hash_table.$dtp_htfile_file_block_entry$ = SubLFiles.defconstant("*DTP-HTFILE-FILE-BLOCK-ENTRY*", (SubLObject)file_hash_table.$sym324$HTFILE_FILE_BLOCK_ENTRY);
        file_hash_table.$htfile_key_entry_size$ = SubLFiles.defconstant("*HTFILE-KEY-ENTRY-SIZE*", (SubLObject)file_hash_table.TWELVE_INTEGER);
        file_hash_table.$fht_hash_constant_a$ = SubLFiles.defconstant("*FHT-HASH-CONSTANT-A*", (SubLObject)file_hash_table.$int347$10009);
        file_hash_table.$fht_hash_step_size$ = SubLFiles.defconstant("*FHT-HASH-STEP-SIZE*", (SubLObject)file_hash_table.THIRTEEN_INTEGER);
        file_hash_table.$fht_hash_next_step_pow2$ = SubLFiles.defconstant("*FHT-HASH-NEXT-STEP-POW2*", (SubLObject)file_hash_table.SIXTEEN_INTEGER);
        file_hash_table.$fht_dknuths_magic_cutoff$ = SubLFiles.defconstant("*FHT-DKNUTHS-MAGIC-CUTOFF*", (SubLObject)file_hash_table.$int354$66);
        file_hash_table.$keyspace_move_size$ = SubLFiles.deflexical("*KEYSPACE-MOVE-SIZE*", Numbers.expt((SubLObject)file_hash_table.TWO_INTEGER, (SubLObject)file_hash_table.SIXTEEN_INTEGER));
        file_hash_table.$keyspace_rehash_cache_size$ = SubLFiles.deflexical("*KEYSPACE-REHASH-CACHE-SIZE*", Numbers.integerDivide(file_hash_table.$keyspace_move_size$.getGlobalValue(), file_hash_table.$htfile_key_entry_size$.getGlobalValue()));
        file_hash_table.$htfile_object_entry_size$ = SubLFiles.defconstant("*HTFILE-OBJECT-ENTRY-SIZE*", (SubLObject)file_hash_table.TWELVE_INTEGER);
        file_hash_table.$file_hash_table_header_position$ = SubLFiles.defconstant("*FILE-HASH-TABLE-HEADER-POSITION*", (SubLObject)file_hash_table.ZERO_INTEGER);
        file_hash_table.$file_hash_table_headers$ = SubLFiles.deflexical("*FILE-HASH-TABLE-HEADERS*", (file_hash_table.NIL != Symbols.boundp((SubLObject)file_hash_table.$sym367$_FILE_HASH_TABLE_HEADERS_)) ? file_hash_table.$file_hash_table_headers$.getGlobalValue() : Hashtables.make_hash_table((SubLObject)file_hash_table.TEN_INTEGER, Symbols.symbol_function((SubLObject)file_hash_table.EQUAL), (SubLObject)file_hash_table.UNPROVIDED));
        file_hash_table.$fast_file_hash_table_optimization_mode$ = SubLFiles.defparameter("*FAST-FILE-HASH-TABLE-OPTIMIZATION-MODE*", (SubLObject)file_hash_table.$kw385$AGGRESSIVE);
        file_hash_table.$dtp_fast_create_fht$ = SubLFiles.defconstant("*DTP-FAST-CREATE-FHT*", (SubLObject)file_hash_table.$sym389$FAST_CREATE_FHT);
        file_hash_table.$fast_fht_large_buffer_size$ = SubLFiles.deflexical("*FAST-FHT-LARGE-BUFFER-SIZE*", Numbers.multiply((SubLObject)file_hash_table.FOUR_INTEGER, (SubLObject)file_hash_table.$int411$1024, (SubLObject)file_hash_table.$int411$1024));
        file_hash_table.$fast_fht_small_buffer_size$ = SubLFiles.deflexical("*FAST-FHT-SMALL-BUFFER-SIZE*", Numbers.multiply((SubLObject)file_hash_table.FOUR_INTEGER, (SubLObject)file_hash_table.$int411$1024));
        file_hash_table.$fast_fht_keyspace_alignment$ = SubLFiles.defparameter("*FAST-FHT-KEYSPACE-ALIGNMENT*", (SubLObject)file_hash_table.SIXTEEN_INTEGER);
        file_hash_table.$dtp_fast_fht_keystream_sorter$ = SubLFiles.defconstant("*DTP-FAST-FHT-KEYSTREAM-SORTER*", (SubLObject)file_hash_table.$sym428$FAST_FHT_KEYSTREAM_SORTER);
        file_hash_table.$fast_fht_sentinel_hashcode_value$ = SubLFiles.defconstant("*FAST-FHT-SENTINEL-HASHCODE-VALUE*", (SubLObject)file_hash_table.MINUS_ONE_INTEGER);
        file_hash_table.$fast_fht_sentinel_index_value$ = SubLFiles.defconstant("*FAST-FHT-SENTINEL-INDEX-VALUE*", (SubLObject)file_hash_table.$int446$179769313486231590772930519078902);
        file_hash_table.$fast_fht_keystream_tile_size_pow2$ = SubLFiles.defparameter("*FAST-FHT-KEYSTREAM-TILE-SIZE-POW2*", (SubLObject)file_hash_table.SIXTEEN_INTEGER);
        file_hash_table.$test_fast_fht_generator_state$ = SubLFiles.defparameter("*TEST-FAST-FHT-GENERATOR-STATE*", (SubLObject)file_hash_table.NIL);
        return (SubLObject)file_hash_table.NIL;
    }
    
    public static SubLObject setup_file_hash_table_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), file_hash_table.$dtp_file_hash_table$.getGlobalValue(), Symbols.symbol_function((SubLObject)file_hash_table.$sym7$FILE_HASH_TABLE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)file_hash_table.$list8);
        Structures.def_csetf((SubLObject)file_hash_table.$sym9$FILE_HASH_TABLE_STREAM, (SubLObject)file_hash_table.$sym10$_CSETF_FILE_HASH_TABLE_STREAM);
        Structures.def_csetf((SubLObject)file_hash_table.$sym11$FILE_HASH_TABLE_HEADER, (SubLObject)file_hash_table.$sym12$_CSETF_FILE_HASH_TABLE_HEADER);
        Structures.def_csetf((SubLObject)file_hash_table.$sym13$FILE_HASH_TABLE_LOCK, (SubLObject)file_hash_table.$sym14$_CSETF_FILE_HASH_TABLE_LOCK);
        Structures.def_csetf((SubLObject)file_hash_table.$sym15$FILE_HASH_TABLE_ENCODING_INPUT_FN, (SubLObject)file_hash_table.$sym16$_CSETF_FILE_HASH_TABLE_ENCODING_INPUT_FN);
        Structures.def_csetf((SubLObject)file_hash_table.$sym17$FILE_HASH_TABLE_ENCODING_OUTPUT_FN, (SubLObject)file_hash_table.$sym18$_CSETF_FILE_HASH_TABLE_ENCODING_OUTPUT_FN);
        Structures.def_csetf((SubLObject)file_hash_table.$sym19$FILE_HASH_TABLE_ENCODING_SIZE_FN, (SubLObject)file_hash_table.$sym20$_CSETF_FILE_HASH_TABLE_ENCODING_SIZE_FN);
        Structures.def_csetf((SubLObject)file_hash_table.$sym21$FILE_HASH_TABLE_ENCODING_KEY_INPUT_FN, (SubLObject)file_hash_table.$sym22$_CSETF_FILE_HASH_TABLE_ENCODING_KEY_INPUT_FN);
        Structures.def_csetf((SubLObject)file_hash_table.$sym23$FILE_HASH_TABLE_ENCODING_KEY_OUTPUT_FN, (SubLObject)file_hash_table.$sym24$_CSETF_FILE_HASH_TABLE_ENCODING_KEY_OUTPUT_FN);
        Structures.def_csetf((SubLObject)file_hash_table.$sym25$FILE_HASH_TABLE_TESTFN, (SubLObject)file_hash_table.$sym26$_CSETF_FILE_HASH_TABLE_TESTFN);
        Structures.def_csetf((SubLObject)file_hash_table.$sym27$FILE_HASH_TABLE_HASH_FN, (SubLObject)file_hash_table.$sym28$_CSETF_FILE_HASH_TABLE_HASH_FN);
        Structures.def_csetf((SubLObject)file_hash_table.$sym29$FILE_HASH_TABLE_INPUT_CACHE, (SubLObject)file_hash_table.$sym30$_CSETF_FILE_HASH_TABLE_INPUT_CACHE);
        Structures.def_csetf((SubLObject)file_hash_table.$sym31$FILE_HASH_TABLE_OUTPUT_CACHE, (SubLObject)file_hash_table.$sym32$_CSETF_FILE_HASH_TABLE_OUTPUT_CACHE);
        Structures.def_csetf((SubLObject)file_hash_table.$sym33$FILE_HASH_TABLE_PROPERTY_LIST, (SubLObject)file_hash_table.$sym34$_CSETF_FILE_HASH_TABLE_PROPERTY_LIST);
        Equality.identity((SubLObject)file_hash_table.$sym0$FILE_HASH_TABLE);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), file_hash_table.$dtp_file_hash_table$.getGlobalValue(), Symbols.symbol_function((SubLObject)file_hash_table.$sym53$VISIT_DEFSTRUCT_OBJECT_FILE_HASH_TABLE_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), file_hash_table.$dtp_htfile_header$.getGlobalValue(), Symbols.symbol_function((SubLObject)file_hash_table.$sym67$HTFILE_HEADER_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)file_hash_table.$list68);
        Structures.def_csetf((SubLObject)file_hash_table.$sym69$HTFILE_HEADER_SIZE, (SubLObject)file_hash_table.$sym70$_CSETF_HTFILE_HEADER_SIZE);
        Structures.def_csetf((SubLObject)file_hash_table.$sym71$HTFILE_HEADER_VERSION_MAJOR, (SubLObject)file_hash_table.$sym72$_CSETF_HTFILE_HEADER_VERSION_MAJOR);
        Structures.def_csetf((SubLObject)file_hash_table.$sym73$HTFILE_HEADER_VERSION_MINOR, (SubLObject)file_hash_table.$sym74$_CSETF_HTFILE_HEADER_VERSION_MINOR);
        Structures.def_csetf((SubLObject)file_hash_table.$sym75$HTFILE_HEADER_OBJECT_SPACE_OFFSET, (SubLObject)file_hash_table.$sym76$_CSETF_HTFILE_HEADER_OBJECT_SPACE_OFFSET);
        Structures.def_csetf((SubLObject)file_hash_table.$sym77$HTFILE_HEADER_KEY_SPACE_OFFSET, (SubLObject)file_hash_table.$sym78$_CSETF_HTFILE_HEADER_KEY_SPACE_OFFSET);
        Structures.def_csetf((SubLObject)file_hash_table.$sym79$HTFILE_HEADER_CURRENT_HEAP_TOP, (SubLObject)file_hash_table.$sym80$_CSETF_HTFILE_HEADER_CURRENT_HEAP_TOP);
        Structures.def_csetf((SubLObject)file_hash_table.$sym81$HTFILE_HEADER_ITEM_COUNT, (SubLObject)file_hash_table.$sym82$_CSETF_HTFILE_HEADER_ITEM_COUNT);
        Structures.def_csetf((SubLObject)file_hash_table.$sym83$HTFILE_HEADER_CAPACITY, (SubLObject)file_hash_table.$sym84$_CSETF_HTFILE_HEADER_CAPACITY);
        Structures.def_csetf((SubLObject)file_hash_table.$sym85$HTFILE_HEADER_FREE_LIST_HEAD, (SubLObject)file_hash_table.$sym86$_CSETF_HTFILE_HEADER_FREE_LIST_HEAD);
        Structures.def_csetf((SubLObject)file_hash_table.$sym87$HTFILE_HEADER_DELETION_COUNT, (SubLObject)file_hash_table.$sym88$_CSETF_HTFILE_HEADER_DELETION_COUNT);
        Structures.def_csetf((SubLObject)file_hash_table.$sym89$HTFILE_HEADER_HEADER_CRC, (SubLObject)file_hash_table.$sym90$_CSETF_HTFILE_HEADER_HEADER_CRC);
        Structures.def_csetf((SubLObject)file_hash_table.$sym91$HTFILE_HEADER_EXTENSION_SPACE_SIZE, (SubLObject)file_hash_table.$sym92$_CSETF_HTFILE_HEADER_EXTENSION_SPACE_SIZE);
        Structures.def_csetf((SubLObject)file_hash_table.$sym93$HTFILE_HEADER_EXTENSION_SPACE, (SubLObject)file_hash_table.$sym94$_CSETF_HTFILE_HEADER_EXTENSION_SPACE);
        Equality.identity((SubLObject)file_hash_table.$sym61$HTFILE_HEADER);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), file_hash_table.$dtp_htfile_header$.getGlobalValue(), Symbols.symbol_function((SubLObject)file_hash_table.$sym109$VISIT_DEFSTRUCT_OBJECT_HTFILE_HEADER_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), file_hash_table.$dtp_htfile_object_entry$.getGlobalValue(), Symbols.symbol_function((SubLObject)file_hash_table.$sym127$HTFILE_OBJECT_ENTRY_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)file_hash_table.$list128);
        Structures.def_csetf((SubLObject)file_hash_table.$sym129$HTFILE_OBJECT_ENTRY_SIZE, (SubLObject)file_hash_table.$sym130$_CSETF_HTFILE_OBJECT_ENTRY_SIZE);
        Structures.def_csetf((SubLObject)file_hash_table.$sym131$HTFILE_OBJECT_ENTRY_TYPE, (SubLObject)file_hash_table.$sym132$_CSETF_HTFILE_OBJECT_ENTRY_TYPE);
        Structures.def_csetf((SubLObject)file_hash_table.$sym133$HTFILE_OBJECT_ENTRY_KEY_SIZE, (SubLObject)file_hash_table.$sym134$_CSETF_HTFILE_OBJECT_ENTRY_KEY_SIZE);
        Structures.def_csetf((SubLObject)file_hash_table.$sym135$HTFILE_OBJECT_ENTRY_KEY, (SubLObject)file_hash_table.$sym136$_CSETF_HTFILE_OBJECT_ENTRY_KEY);
        Structures.def_csetf((SubLObject)file_hash_table.$sym137$HTFILE_OBJECT_ENTRY_DATA_SIZE, (SubLObject)file_hash_table.$sym138$_CSETF_HTFILE_OBJECT_ENTRY_DATA_SIZE);
        Structures.def_csetf((SubLObject)file_hash_table.$sym139$HTFILE_OBJECT_ENTRY_DATA, (SubLObject)file_hash_table.$sym140$_CSETF_HTFILE_OBJECT_ENTRY_DATA);
        Equality.identity((SubLObject)file_hash_table.$sym121$HTFILE_OBJECT_ENTRY);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), file_hash_table.$dtp_htfile_object_entry$.getGlobalValue(), Symbols.symbol_function((SubLObject)file_hash_table.$sym147$VISIT_DEFSTRUCT_OBJECT_HTFILE_OBJECT_ENTRY_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), file_hash_table.$dtp_htfile_key_entry$.getGlobalValue(), Symbols.symbol_function((SubLObject)file_hash_table.$sym154$HTFILE_KEY_ENTRY_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)file_hash_table.$list155);
        Structures.def_csetf((SubLObject)file_hash_table.$sym156$HTFILE_KEY_ENTRY_KEY_OFFSET, (SubLObject)file_hash_table.$sym157$_CSETF_HTFILE_KEY_ENTRY_KEY_OFFSET);
        Structures.def_csetf((SubLObject)file_hash_table.$sym158$HTFILE_KEY_ENTRY_HASH_CODE, (SubLObject)file_hash_table.$sym159$_CSETF_HTFILE_KEY_ENTRY_HASH_CODE);
        Equality.identity((SubLObject)file_hash_table.$sym148$HTFILE_KEY_ENTRY);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), file_hash_table.$dtp_htfile_key_entry$.getGlobalValue(), Symbols.symbol_function((SubLObject)file_hash_table.$sym163$VISIT_DEFSTRUCT_OBJECT_HTFILE_KEY_ENTRY_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), file_hash_table.$dtp_fht_serialization_entry$.getGlobalValue(), Symbols.symbol_function((SubLObject)file_hash_table.$sym179$FHT_SERIALIZATION_ENTRY_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)file_hash_table.$list180);
        Structures.def_csetf((SubLObject)file_hash_table.$sym181$FHT_SE_ENCODING_INPUT_FN, (SubLObject)file_hash_table.$sym182$_CSETF_FHT_SE_ENCODING_INPUT_FN);
        Structures.def_csetf((SubLObject)file_hash_table.$sym183$FHT_SE_ENCODING_OUTPUT_FN, (SubLObject)file_hash_table.$sym184$_CSETF_FHT_SE_ENCODING_OUTPUT_FN);
        Structures.def_csetf((SubLObject)file_hash_table.$sym185$FHT_SE_ENCODING_SIZE_FN, (SubLObject)file_hash_table.$sym186$_CSETF_FHT_SE_ENCODING_SIZE_FN);
        Structures.def_csetf((SubLObject)file_hash_table.$sym187$FHT_SE_HASH_FN, (SubLObject)file_hash_table.$sym188$_CSETF_FHT_SE_HASH_FN);
        Structures.def_csetf((SubLObject)file_hash_table.$sym189$FHT_SE_ENCODING_KEY_INPUT_FN, (SubLObject)file_hash_table.$sym190$_CSETF_FHT_SE_ENCODING_KEY_INPUT_FN);
        Structures.def_csetf((SubLObject)file_hash_table.$sym191$FHT_SE_ENCODING_KEY_OUTPUT_FN, (SubLObject)file_hash_table.$sym192$_CSETF_FHT_SE_ENCODING_KEY_OUTPUT_FN);
        Equality.identity((SubLObject)file_hash_table.$sym172$FHT_SERIALIZATION_ENTRY);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), file_hash_table.$dtp_fht_serialization_entry$.getGlobalValue(), Symbols.symbol_function((SubLObject)file_hash_table.$sym194$VISIT_DEFSTRUCT_OBJECT_FHT_SERIALIZATION_ENTRY_METHOD));
        subl_macro_promotions.declare_defglobal((SubLObject)file_hash_table.$sym202$_FHT_SERIALIZATION_TABLE_);
        register_fht_serialization_entry((SubLObject)file_hash_table.$kw164$IMAGE_DEPENDENT_CFASL, (SubLObject)file_hash_table.$list208);
        register_fht_serialization_entry((SubLObject)file_hash_table.$kw209$IMAGE_INDEPENDENT_CFASL, (SubLObject)file_hash_table.$list210);
        register_fht_serialization_entry((SubLObject)file_hash_table.$kw211$HL_EXTERNALIZED_KEYS, (SubLObject)file_hash_table.$list212);
        subl_macro_promotions.declare_defglobal((SubLObject)file_hash_table.$sym227$_FHT_NOT_FOUND_);
        subl_macro_promotions.declare_defglobal((SubLObject)file_hash_table.$sym229$_NOT_IN_FHT_);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), file_hash_table.$dtp_htfile_file_block_entry$.getGlobalValue(), Symbols.symbol_function((SubLObject)file_hash_table.$sym331$HTFILE_FILE_BLOCK_ENTRY_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)file_hash_table.$list332);
        Structures.def_csetf((SubLObject)file_hash_table.$sym333$HTFILE_FILE_BLOCK_ENTRY_SIZE, (SubLObject)file_hash_table.$sym334$_CSETF_HTFILE_FILE_BLOCK_ENTRY_SIZE);
        Structures.def_csetf((SubLObject)file_hash_table.$sym335$HTFILE_FILE_BLOCK_ENTRY_NEXT, (SubLObject)file_hash_table.$sym336$_CSETF_HTFILE_FILE_BLOCK_ENTRY_NEXT);
        Equality.identity((SubLObject)file_hash_table.$sym324$HTFILE_FILE_BLOCK_ENTRY);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), file_hash_table.$dtp_htfile_file_block_entry$.getGlobalValue(), Symbols.symbol_function((SubLObject)file_hash_table.$sym339$VISIT_DEFSTRUCT_OBJECT_HTFILE_FILE_BLOCK_ENTRY_METHOD));
        subl_macro_promotions.declare_defglobal((SubLObject)file_hash_table.$sym367$_FILE_HASH_TABLE_HEADERS_);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), file_hash_table.$dtp_fast_create_fht$.getGlobalValue(), Symbols.symbol_function((SubLObject)file_hash_table.$sym395$FAST_CREATE_FHT_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)file_hash_table.$list396);
        Structures.def_csetf((SubLObject)file_hash_table.$sym397$FAST_CREATE_FHT_FHT, (SubLObject)file_hash_table.$sym398$_CSETF_FAST_CREATE_FHT_FHT);
        Structures.def_csetf((SubLObject)file_hash_table.$sym399$FAST_CREATE_FHT_TEMPSTEM, (SubLObject)file_hash_table.$sym400$_CSETF_FAST_CREATE_FHT_TEMPSTEM);
        Structures.def_csetf((SubLObject)file_hash_table.$sym401$FAST_CREATE_FHT_TEMPFILE, (SubLObject)file_hash_table.$sym402$_CSETF_FAST_CREATE_FHT_TEMPFILE);
        Structures.def_csetf((SubLObject)file_hash_table.$sym403$FAST_CREATE_FHT_KEYSTREAM, (SubLObject)file_hash_table.$sym404$_CSETF_FAST_CREATE_FHT_KEYSTREAM);
        Equality.identity((SubLObject)file_hash_table.$sym389$FAST_CREATE_FHT);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), file_hash_table.$dtp_fast_create_fht$.getGlobalValue(), Symbols.symbol_function((SubLObject)file_hash_table.$sym410$VISIT_DEFSTRUCT_OBJECT_FAST_CREATE_FHT_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), file_hash_table.$dtp_fast_fht_keystream_sorter$.getGlobalValue(), Symbols.symbol_function((SubLObject)file_hash_table.$sym434$FAST_FHT_KEYSTREAM_SORTER_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)file_hash_table.$list435);
        Structures.def_csetf((SubLObject)file_hash_table.$sym436$FSTFHT_KSORTER_TEMPSTEM, (SubLObject)file_hash_table.$sym437$_CSETF_FSTFHT_KSORTER_TEMPSTEM);
        Structures.def_csetf((SubLObject)file_hash_table.$sym438$FSTFHT_KSORTER_IN_FILES, (SubLObject)file_hash_table.$sym439$_CSETF_FSTFHT_KSORTER_IN_FILES);
        Structures.def_csetf((SubLObject)file_hash_table.$sym440$FSTFHT_KSORTER_OUT_FILES, (SubLObject)file_hash_table.$sym441$_CSETF_FSTFHT_KSORTER_OUT_FILES);
        Equality.identity((SubLObject)file_hash_table.$sym428$FAST_FHT_KEYSTREAM_SORTER);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), file_hash_table.$dtp_fast_fht_keystream_sorter$.getGlobalValue(), Symbols.symbol_function((SubLObject)file_hash_table.$sym445$VISIT_DEFSTRUCT_OBJECT_FAST_FHT_KEYSTREAM_SORTER_METHOD));
        generic_testing.define_test_case_table_int((SubLObject)file_hash_table.$sym486$TEST_FAST_FHT_KEYSTREAM_ENTRY_CMP, (SubLObject)ConsesLow.list(new SubLObject[] { file_hash_table.$kw487$TEST, file_hash_table.EQ, file_hash_table.$kw488$OWNER, file_hash_table.NIL, file_hash_table.$kw489$CLASSES, file_hash_table.NIL, file_hash_table.$kw490$KB, file_hash_table.$kw491$TINY, file_hash_table.$kw492$WORKING_, file_hash_table.T }), (SubLObject)file_hash_table.$list493);
        generic_testing.define_test_case_table_int((SubLObject)file_hash_table.$sym516$TEST_FAST_FHT_CREATION_WITH_MERGE_SORTED_KEYSTREAM, (SubLObject)ConsesLow.list(new SubLObject[] { file_hash_table.$kw487$TEST, file_hash_table.EQ, file_hash_table.$kw488$OWNER, file_hash_table.NIL, file_hash_table.$kw489$CLASSES, file_hash_table.NIL, file_hash_table.$kw490$KB, file_hash_table.$kw491$TINY, file_hash_table.$kw492$WORKING_, file_hash_table.T }), (SubLObject)file_hash_table.$list517);
        generic_testing.define_test_case_table_int((SubLObject)file_hash_table.$sym530$TEST_FAST_FHT_WITH_KB_CONTENTS, (SubLObject)ConsesLow.list(new SubLObject[] { file_hash_table.$kw487$TEST, file_hash_table.NIL, file_hash_table.$kw488$OWNER, file_hash_table.NIL, file_hash_table.$kw489$CLASSES, file_hash_table.NIL, file_hash_table.$kw490$KB, file_hash_table.$kw316$FULL, file_hash_table.$kw492$WORKING_, file_hash_table.T }), (SubLObject)file_hash_table.$list531);
        return (SubLObject)file_hash_table.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_file_hash_table_file();
    }
    
    @Override
	public void initializeVariables() {
        init_file_hash_table_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_file_hash_table_file();
    }
    
    
    public static final class $file_hash_table_native extends SubLStructNative
    {
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
            this.$stream = (SubLObject)CommonSymbols.NIL;
            this.$header = (SubLObject)CommonSymbols.NIL;
            this.$lock = (SubLObject)CommonSymbols.NIL;
            this.$encoding_input_fn = (SubLObject)CommonSymbols.NIL;
            this.$encoding_output_fn = (SubLObject)CommonSymbols.NIL;
            this.$encoding_size_fn = (SubLObject)CommonSymbols.NIL;
            this.$encoding_key_input_fn = (SubLObject)CommonSymbols.NIL;
            this.$encoding_key_output_fn = (SubLObject)CommonSymbols.NIL;
            this.$testfn = (SubLObject)CommonSymbols.NIL;
            this.$hash_fn = (SubLObject)CommonSymbols.NIL;
            this.$input_cache = (SubLObject)CommonSymbols.NIL;
            this.$output_cache = (SubLObject)CommonSymbols.NIL;
            this.$property_list = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$file_hash_table_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$stream;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$header;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$lock;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$encoding_input_fn;
        }
        
        @Override
		public SubLObject getField6() {
            return this.$encoding_output_fn;
        }
        
        @Override
		public SubLObject getField7() {
            return this.$encoding_size_fn;
        }
        
        @Override
		public SubLObject getField8() {
            return this.$encoding_key_input_fn;
        }
        
        @Override
		public SubLObject getField9() {
            return this.$encoding_key_output_fn;
        }
        
        @Override
		public SubLObject getField10() {
            return this.$testfn;
        }
        
        @Override
		public SubLObject getField11() {
            return this.$hash_fn;
        }
        
        @Override
		public SubLObject getField12() {
            return this.$input_cache;
        }
        
        @Override
		public SubLObject getField13() {
            return this.$output_cache;
        }
        
        @Override
		public SubLObject getField14() {
            return this.$property_list;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$stream = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$header = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$lock = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$encoding_input_fn = value;
        }
        
        @Override
		public SubLObject setField6(final SubLObject value) {
            return this.$encoding_output_fn = value;
        }
        
        @Override
		public SubLObject setField7(final SubLObject value) {
            return this.$encoding_size_fn = value;
        }
        
        @Override
		public SubLObject setField8(final SubLObject value) {
            return this.$encoding_key_input_fn = value;
        }
        
        @Override
		public SubLObject setField9(final SubLObject value) {
            return this.$encoding_key_output_fn = value;
        }
        
        @Override
		public SubLObject setField10(final SubLObject value) {
            return this.$testfn = value;
        }
        
        @Override
		public SubLObject setField11(final SubLObject value) {
            return this.$hash_fn = value;
        }
        
        @Override
		public SubLObject setField12(final SubLObject value) {
            return this.$input_cache = value;
        }
        
        @Override
		public SubLObject setField13(final SubLObject value) {
            return this.$output_cache = value;
        }
        
        @Override
		public SubLObject setField14(final SubLObject value) {
            return this.$property_list = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$file_hash_table_native.class, file_hash_table.$sym0$FILE_HASH_TABLE, file_hash_table.$sym1$FILE_HASH_TABLE_P, file_hash_table.$list2, file_hash_table.$list3, new String[] { "$stream", "$header", "$lock", "$encoding_input_fn", "$encoding_output_fn", "$encoding_size_fn", "$encoding_key_input_fn", "$encoding_key_output_fn", "$testfn", "$hash_fn", "$input_cache", "$output_cache", "$property_list" }, file_hash_table.$list4, file_hash_table.$list5, file_hash_table.$sym6$DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }
    
    public static final class $file_hash_table_p$UnaryFunction extends UnaryFunction
    {
        public $file_hash_table_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("FILE-HASH-TABLE-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return file_hash_table.file_hash_table_p(arg1);
        }
    }
    
    public static final class $htfile_header_native extends SubLStructNative
    {
        public SubLObject $size;
        public SubLObject $version_major;
        public SubLObject $version_minor;
        public SubLObject $object_space_offset;
        public SubLObject $key_space_offset;
        public SubLObject $current_heap_top;
        public SubLObject $item_count;
        public SubLObject $capacity;
        public SubLObject $free_list_head;
        public SubLObject $deletion_count;
        public SubLObject $header_crc;
        public SubLObject $extension_space_size;
        public SubLObject $extension_space;
        private static final SubLStructDeclNative structDecl;
        
        public $htfile_header_native() {
            this.$size = (SubLObject)CommonSymbols.NIL;
            this.$version_major = (SubLObject)CommonSymbols.NIL;
            this.$version_minor = (SubLObject)CommonSymbols.NIL;
            this.$object_space_offset = (SubLObject)CommonSymbols.NIL;
            this.$key_space_offset = (SubLObject)CommonSymbols.NIL;
            this.$current_heap_top = (SubLObject)CommonSymbols.NIL;
            this.$item_count = (SubLObject)CommonSymbols.NIL;
            this.$capacity = (SubLObject)CommonSymbols.NIL;
            this.$free_list_head = (SubLObject)CommonSymbols.NIL;
            this.$deletion_count = (SubLObject)CommonSymbols.NIL;
            this.$header_crc = (SubLObject)CommonSymbols.NIL;
            this.$extension_space_size = (SubLObject)CommonSymbols.NIL;
            this.$extension_space = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$htfile_header_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$size;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$version_major;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$version_minor;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$object_space_offset;
        }
        
        @Override
		public SubLObject getField6() {
            return this.$key_space_offset;
        }
        
        @Override
		public SubLObject getField7() {
            return this.$current_heap_top;
        }
        
        @Override
		public SubLObject getField8() {
            return this.$item_count;
        }
        
        @Override
		public SubLObject getField9() {
            return this.$capacity;
        }
        
        @Override
		public SubLObject getField10() {
            return this.$free_list_head;
        }
        
        @Override
		public SubLObject getField11() {
            return this.$deletion_count;
        }
        
        @Override
		public SubLObject getField12() {
            return this.$header_crc;
        }
        
        @Override
		public SubLObject getField13() {
            return this.$extension_space_size;
        }
        
        @Override
		public SubLObject getField14() {
            return this.$extension_space;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$size = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$version_major = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$version_minor = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$object_space_offset = value;
        }
        
        @Override
		public SubLObject setField6(final SubLObject value) {
            return this.$key_space_offset = value;
        }
        
        @Override
		public SubLObject setField7(final SubLObject value) {
            return this.$current_heap_top = value;
        }
        
        @Override
		public SubLObject setField8(final SubLObject value) {
            return this.$item_count = value;
        }
        
        @Override
		public SubLObject setField9(final SubLObject value) {
            return this.$capacity = value;
        }
        
        @Override
		public SubLObject setField10(final SubLObject value) {
            return this.$free_list_head = value;
        }
        
        @Override
		public SubLObject setField11(final SubLObject value) {
            return this.$deletion_count = value;
        }
        
        @Override
		public SubLObject setField12(final SubLObject value) {
            return this.$header_crc = value;
        }
        
        @Override
		public SubLObject setField13(final SubLObject value) {
            return this.$extension_space_size = value;
        }
        
        @Override
		public SubLObject setField14(final SubLObject value) {
            return this.$extension_space = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$htfile_header_native.class, file_hash_table.$sym61$HTFILE_HEADER, file_hash_table.$sym62$HTFILE_HEADER_P, file_hash_table.$list63, file_hash_table.$list64, new String[] { "$size", "$version_major", "$version_minor", "$object_space_offset", "$key_space_offset", "$current_heap_top", "$item_count", "$capacity", "$free_list_head", "$deletion_count", "$header_crc", "$extension_space_size", "$extension_space" }, file_hash_table.$list65, file_hash_table.$list66, file_hash_table.$sym6$DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }
    
    public static final class $htfile_header_p$UnaryFunction extends UnaryFunction
    {
        public $htfile_header_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("HTFILE-HEADER-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return file_hash_table.htfile_header_p(arg1);
        }
    }
    
    public static final class $htfile_object_entry_native extends SubLStructNative
    {
        public SubLObject $size;
        public SubLObject $type;
        public SubLObject $key_size;
        public SubLObject $key;
        public SubLObject $data_size;
        public SubLObject $data;
        private static final SubLStructDeclNative structDecl;
        
        public $htfile_object_entry_native() {
            this.$size = (SubLObject)CommonSymbols.NIL;
            this.$type = (SubLObject)CommonSymbols.NIL;
            this.$key_size = (SubLObject)CommonSymbols.NIL;
            this.$key = (SubLObject)CommonSymbols.NIL;
            this.$data_size = (SubLObject)CommonSymbols.NIL;
            this.$data = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$htfile_object_entry_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$size;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$type;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$key_size;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$key;
        }
        
        @Override
		public SubLObject getField6() {
            return this.$data_size;
        }
        
        @Override
		public SubLObject getField7() {
            return this.$data;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$size = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$type = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$key_size = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$key = value;
        }
        
        @Override
		public SubLObject setField6(final SubLObject value) {
            return this.$data_size = value;
        }
        
        @Override
		public SubLObject setField7(final SubLObject value) {
            return this.$data = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$htfile_object_entry_native.class, file_hash_table.$sym121$HTFILE_OBJECT_ENTRY, file_hash_table.$sym122$HTFILE_OBJECT_ENTRY_P, file_hash_table.$list123, file_hash_table.$list124, new String[] { "$size", "$type", "$key_size", "$key", "$data_size", "$data" }, file_hash_table.$list125, file_hash_table.$list126, file_hash_table.$sym6$DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }
    
    public static final class $htfile_object_entry_p$UnaryFunction extends UnaryFunction
    {
        public $htfile_object_entry_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("HTFILE-OBJECT-ENTRY-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return file_hash_table.htfile_object_entry_p(arg1);
        }
    }
    
    public static final class $htfile_key_entry_native extends SubLStructNative
    {
        public SubLObject $key_offset;
        public SubLObject $hash_code;
        private static final SubLStructDeclNative structDecl;
        
        public $htfile_key_entry_native() {
            this.$key_offset = (SubLObject)CommonSymbols.NIL;
            this.$hash_code = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$htfile_key_entry_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$key_offset;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$hash_code;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$key_offset = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$hash_code = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$htfile_key_entry_native.class, file_hash_table.$sym148$HTFILE_KEY_ENTRY, file_hash_table.$sym149$HTFILE_KEY_ENTRY_P, file_hash_table.$list150, file_hash_table.$list151, new String[] { "$key_offset", "$hash_code" }, file_hash_table.$list152, file_hash_table.$list153, file_hash_table.$sym6$DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }
    
    public static final class $htfile_key_entry_p$UnaryFunction extends UnaryFunction
    {
        public $htfile_key_entry_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("HTFILE-KEY-ENTRY-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return file_hash_table.htfile_key_entry_p(arg1);
        }
    }
    
    public static final class $fht_serialization_entry_native extends SubLStructNative
    {
        public SubLObject $encoding_input_fn;
        public SubLObject $encoding_output_fn;
        public SubLObject $encoding_size_fn;
        public SubLObject $hash_fn;
        public SubLObject $encoding_key_input_fn;
        public SubLObject $encoding_key_output_fn;
        private static final SubLStructDeclNative structDecl;
        
        public $fht_serialization_entry_native() {
            this.$encoding_input_fn = (SubLObject)CommonSymbols.NIL;
            this.$encoding_output_fn = (SubLObject)CommonSymbols.NIL;
            this.$encoding_size_fn = (SubLObject)CommonSymbols.NIL;
            this.$hash_fn = (SubLObject)CommonSymbols.NIL;
            this.$encoding_key_input_fn = (SubLObject)CommonSymbols.NIL;
            this.$encoding_key_output_fn = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$fht_serialization_entry_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$encoding_input_fn;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$encoding_output_fn;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$encoding_size_fn;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$hash_fn;
        }
        
        @Override
		public SubLObject getField6() {
            return this.$encoding_key_input_fn;
        }
        
        @Override
		public SubLObject getField7() {
            return this.$encoding_key_output_fn;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$encoding_input_fn = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$encoding_output_fn = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$encoding_size_fn = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$hash_fn = value;
        }
        
        @Override
		public SubLObject setField6(final SubLObject value) {
            return this.$encoding_key_input_fn = value;
        }
        
        @Override
		public SubLObject setField7(final SubLObject value) {
            return this.$encoding_key_output_fn = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$fht_serialization_entry_native.class, file_hash_table.$sym172$FHT_SERIALIZATION_ENTRY, file_hash_table.$sym173$FHT_SERIALIZATION_ENTRY_P, file_hash_table.$list174, file_hash_table.$list175, new String[] { "$encoding_input_fn", "$encoding_output_fn", "$encoding_size_fn", "$hash_fn", "$encoding_key_input_fn", "$encoding_key_output_fn" }, file_hash_table.$list176, file_hash_table.$list177, file_hash_table.$sym178$PRINT_FHT_SERIALIZATION_ENTRY);
        }
    }
    
    public static final class $fht_serialization_entry_p$UnaryFunction extends UnaryFunction
    {
        public $fht_serialization_entry_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("FHT-SERIALIZATION-ENTRY-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return file_hash_table.fht_serialization_entry_p(arg1);
        }
    }
    
    public static final class $htfile_file_block_entry_native extends SubLStructNative
    {
        public SubLObject $size;
        public SubLObject $next;
        private static final SubLStructDeclNative structDecl;
        
        public $htfile_file_block_entry_native() {
            this.$size = (SubLObject)CommonSymbols.NIL;
            this.$next = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$htfile_file_block_entry_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$size;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$next;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$size = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$next = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$htfile_file_block_entry_native.class, file_hash_table.$sym324$HTFILE_FILE_BLOCK_ENTRY, file_hash_table.$sym325$HTFILE_FILE_BLOCK_ENTRY_P, file_hash_table.$list326, file_hash_table.$list327, new String[] { "$size", "$next" }, file_hash_table.$list328, file_hash_table.$list329, file_hash_table.$sym330$PRINT_HTFILE_FILE_BLOCK_ENTRY);
        }
    }
    
    public static final class $htfile_file_block_entry_p$UnaryFunction extends UnaryFunction
    {
        public $htfile_file_block_entry_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("HTFILE-FILE-BLOCK-ENTRY-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return file_hash_table.htfile_file_block_entry_p(arg1);
        }
    }
    
    public static final class $fast_create_fht_native extends SubLStructNative
    {
        public SubLObject $fht;
        public SubLObject $tempstem;
        public SubLObject $tempfile;
        public SubLObject $keystream;
        private static final SubLStructDeclNative structDecl;
        
        public $fast_create_fht_native() {
            this.$fht = (SubLObject)CommonSymbols.NIL;
            this.$tempstem = (SubLObject)CommonSymbols.NIL;
            this.$tempfile = (SubLObject)CommonSymbols.NIL;
            this.$keystream = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$fast_create_fht_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$fht;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$tempstem;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$tempfile;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$keystream;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$fht = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$tempstem = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$tempfile = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$keystream = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$fast_create_fht_native.class, file_hash_table.$sym389$FAST_CREATE_FHT, file_hash_table.$sym390$FAST_CREATE_FHT_P, file_hash_table.$list391, file_hash_table.$list392, new String[] { "$fht", "$tempstem", "$tempfile", "$keystream" }, file_hash_table.$list393, file_hash_table.$list394, file_hash_table.$sym6$DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }
    
    public static final class $fast_create_fht_p$UnaryFunction extends UnaryFunction
    {
        public $fast_create_fht_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("FAST-CREATE-FHT-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return file_hash_table.fast_create_fht_p(arg1);
        }
    }
    
    public static final class $fast_fht_keystream_sorter_native extends SubLStructNative
    {
        public SubLObject $tempstem;
        public SubLObject $in_files;
        public SubLObject $out_files;
        private static final SubLStructDeclNative structDecl;
        
        public $fast_fht_keystream_sorter_native() {
            this.$tempstem = (SubLObject)CommonSymbols.NIL;
            this.$in_files = (SubLObject)CommonSymbols.NIL;
            this.$out_files = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$fast_fht_keystream_sorter_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$tempstem;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$in_files;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$out_files;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$tempstem = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$in_files = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$out_files = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$fast_fht_keystream_sorter_native.class, file_hash_table.$sym428$FAST_FHT_KEYSTREAM_SORTER, file_hash_table.$sym429$FAST_FHT_KEYSTREAM_SORTER_P, file_hash_table.$list430, file_hash_table.$list431, new String[] { "$tempstem", "$in_files", "$out_files" }, file_hash_table.$list432, file_hash_table.$list433, file_hash_table.$sym6$DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }
    
    public static final class $fast_fht_keystream_sorter_p$UnaryFunction extends UnaryFunction
    {
        public $fast_fht_keystream_sorter_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("FAST-FHT-KEYSTREAM-SORTER-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return file_hash_table.fast_fht_keystream_sorter_p(arg1);
        }
    }
}

/*

	Total time: 3055 ms
	
*/