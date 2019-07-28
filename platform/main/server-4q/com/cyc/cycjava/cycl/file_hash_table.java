package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.file_hash_table;
import com.cyc.cycjava.cycl.utilities_macros;
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
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Supplier;
import org.armedbear.lisp.Lisp;

import static com.cyc.cycjava.cycl.access_macros.*;
import static com.cyc.cycjava.cycl.cfasl.*;
import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.*;
import static com.cyc.cycjava.cycl.file_hash_table.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_G;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_I;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_S;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EIGHT_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQ;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUAL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUALP;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FIFTEEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FOUR_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.IDENTITY;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.MINUS_ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.SEVEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.SIXTEEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.SIX_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.THIRTEEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.THREE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWELVE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.$most_negative_fixnum$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.$most_positive_fixnum$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class file_hash_table extends SubLTranslatedFile {
    public static final SubLFile me = new file_hash_table();

    public static final String myName = "com.cyc.cycjava.cycl.file_hash_table";

    public static final String myFingerPrint = "ce7868f7a98e3f837b379682fe507717f6366189cc5d4e43bb6dfd89288fcf7b";

    // defconstant
    public static final SubLSymbol $dtp_file_hash_table$ = makeSymbol("*DTP-FILE-HASH-TABLE*");

    // defconstant
    public static final SubLSymbol $dtp_htfile_header$ = makeSymbol("*DTP-HTFILE-HEADER*");

    // defconstant
    public static final SubLSymbol $dtp_htfile_object_entry$ = makeSymbol("*DTP-HTFILE-OBJECT-ENTRY*");

    // defconstant
    public static final SubLSymbol $dtp_htfile_key_entry$ = makeSymbol("*DTP-HTFILE-KEY-ENTRY*");



    // deflexical
    public static final SubLSymbol $default_fht_serialization_protocol$ = makeSymbol("*DEFAULT-FHT-SERIALIZATION-PROTOCOL*");

    // defparameter
    // The minimum cache size of a file hashtable
    public static final SubLSymbol $fht_min_cache_capacity$ = makeSymbol("*FHT-MIN-CACHE-CAPACITY*");

    // defparameter
    // The percentage of file hashtable entries to be cached
    public static final SubLSymbol $fht_cache_percentage$ = makeSymbol("*FHT-CACHE-PERCENTAGE*");

    // defconstant
    private static final SubLSymbol $htfile_header_current_vmajor$ = makeSymbol("*HTFILE-HEADER-CURRENT-VMAJOR*");

    // defconstant
    private static final SubLSymbol $htfile_header_current_vminor$ = makeSymbol("*HTFILE-HEADER-CURRENT-VMINOR*");

    // defconstant
    private static final SubLSymbol $htfile_header_current_size$ = makeSymbol("*HTFILE-HEADER-CURRENT-SIZE*");

    // defconstant
    public static final SubLSymbol $htfile_default_expected_items$ = makeSymbol("*HTFILE-DEFAULT-EXPECTED-ITEMS*");

    // defconstant
    public static final SubLSymbol $htfile_default_average_size$ = makeSymbol("*HTFILE-DEFAULT-AVERAGE-SIZE*");

    // defconstant
    private static final SubLSymbol $fht_empty_offset_marker$ = makeSymbol("*FHT-EMPTY-OFFSET-MARKER*");

    // defconstant
    private static final SubLSymbol $fht_tombstone_offset_marker$ = makeSymbol("*FHT-TOMBSTONE-OFFSET-MARKER*");

    // defconstant
    private static final SubLSymbol $fht_invalid_hash_code$ = makeSymbol("*FHT-INVALID-HASH-CODE*");

    // deflexical
    private static final SubLSymbol $fht_tombstone_key_entry$ = makeSymbol("*FHT-TOMBSTONE-KEY-ENTRY*");

    // deflexical
    private static final SubLSymbol $fht_empty_key_entry$ = makeSymbol("*FHT-EMPTY-KEY-ENTRY*");

    // deflexical
    private static final SubLSymbol $max_fht_hash_code_value$ = makeSymbol("*MAX-FHT-HASH-CODE-VALUE*");

    // defconstant
    public static final SubLSymbol $dtp_fht_serialization_entry$ = makeSymbol("*DTP-FHT-SERIALIZATION-ENTRY*");









    // defparameter
    /**
     * When set to T, we are in fast put mode, i.e. doing serial insertion, and
     * constantly flushing the buffers is seriously slowing us down.
     */
    private static final SubLSymbol $fast_put_skip_output_forcing$ = makeSymbol("*FAST-PUT-SKIP-OUTPUT-FORCING*");

    // defconstant
    private static final SubLSymbol $htfile_minimal_file_block_size$ = makeSymbol("*HTFILE-MINIMAL-FILE-BLOCK-SIZE*");

    // defconstant
    public static final SubLSymbol $dtp_htfile_file_block_entry$ = makeSymbol("*DTP-HTFILE-FILE-BLOCK-ENTRY*");

    // defconstant
    private static final SubLSymbol $htfile_key_entry_size$ = makeSymbol("*HTFILE-KEY-ENTRY-SIZE*");

    // defconstant
    private static final SubLSymbol $fht_hash_constant_a$ = makeSymbol("*FHT-HASH-CONSTANT-A*");

    // defconstant
    private static final SubLSymbol $fht_hash_step_size$ = makeSymbol("*FHT-HASH-STEP-SIZE*");

    // defconstant
    private static final SubLSymbol $fht_hash_next_step_pow2$ = makeSymbol("*FHT-HASH-NEXT-STEP-POW2*");

    // defconstant
    private static final SubLSymbol $fht_dknuths_magic_cutoff$ = makeSymbol("*FHT-DKNUTHS-MAGIC-CUTOFF*");

    // deflexical
    private static final SubLSymbol $keyspace_move_size$ = makeSymbol("*KEYSPACE-MOVE-SIZE*");

    // deflexical
    private static final SubLSymbol $keyspace_rehash_cache_size$ = makeSymbol("*KEYSPACE-REHASH-CACHE-SIZE*");

    // defconstant
    private static final SubLSymbol $htfile_object_entry_size$ = makeSymbol("*HTFILE-OBJECT-ENTRY-SIZE*");

    // defconstant
    public static final SubLSymbol $file_hash_table_header_position$ = makeSymbol("*FILE-HASH-TABLE-HEADER-POSITION*");



    // defparameter
    /**
     * Which optimization mode we want to employ. There is :conservative, :moderate
     * and :aggressive
     */
    public static final SubLSymbol $fast_file_hash_table_optimization_mode$ = makeSymbol("*FAST-FILE-HASH-TABLE-OPTIMIZATION-MODE*");

    // defconstant
    public static final SubLSymbol $dtp_fast_create_fht$ = makeSymbol("*DTP-FAST-CREATE-FHT*");

    // deflexical
    private static final SubLSymbol $fast_fht_large_buffer_size$ = makeSymbol("*FAST-FHT-LARGE-BUFFER-SIZE*");

    // deflexical
    private static final SubLSymbol $fast_fht_small_buffer_size$ = makeSymbol("*FAST-FHT-SMALL-BUFFER-SIZE*");

    // defparameter
    public static final SubLSymbol $fast_fht_keyspace_alignment$ = makeSymbol("*FAST-FHT-KEYSPACE-ALIGNMENT*");

    // defconstant
    public static final SubLSymbol $dtp_fast_fht_keystream_sorter$ = makeSymbol("*DTP-FAST-FHT-KEYSTREAM-SORTER*");

    // defconstant
    // The value written out as a hashcode for the chunk sentinel.
    private static final SubLSymbol $fast_fht_sentinel_hashcode_value$ = makeSymbol("*FAST-FHT-SENTINEL-HASHCODE-VALUE*");

    // defconstant
    /**
     * The value returned for a sentinel hashcode; it is larger than any other value
     * should be.
     */
    private static final SubLSymbol $fast_fht_sentinel_index_value$ = makeSymbol("*FAST-FHT-SENTINEL-INDEX-VALUE*");

    // defparameter
    // Assume 64K of entries.
    public static final SubLSymbol $fast_fht_keystream_tile_size_pow2$ = makeSymbol("*FAST-FHT-KEYSTREAM-TILE-SIZE-POW2*");

    // defparameter
    private static final SubLSymbol $test_fast_fht_generator_state$ = makeSymbol("*TEST-FAST-FHT-GENERATOR-STATE*");

    // Internal Constants
    public static final SubLSymbol FILE_HASH_TABLE = makeSymbol("FILE-HASH-TABLE");

    public static final SubLSymbol FILE_HASH_TABLE_P = makeSymbol("FILE-HASH-TABLE-P");

    public static final SubLList $list2 = list(new SubLObject[]{ makeSymbol("STREAM"), makeSymbol("HEADER"), makeSymbol("LOCK"), makeSymbol("ENCODING-INPUT-FN"), makeSymbol("ENCODING-OUTPUT-FN"), makeSymbol("ENCODING-SIZE-FN"), makeSymbol("ENCODING-KEY-INPUT-FN"), makeSymbol("ENCODING-KEY-OUTPUT-FN"), makeSymbol("TESTFN"), makeSymbol("HASH-FN"), makeSymbol("INPUT-CACHE"), makeSymbol("OUTPUT-CACHE"), makeSymbol("PROPERTY-LIST") });

    public static final SubLList $list3 = list(new SubLObject[]{ makeKeyword("STREAM"), makeKeyword("HEADER"), makeKeyword("LOCK"), makeKeyword("ENCODING-INPUT-FN"), makeKeyword("ENCODING-OUTPUT-FN"), makeKeyword("ENCODING-SIZE-FN"), makeKeyword("ENCODING-KEY-INPUT-FN"), makeKeyword("ENCODING-KEY-OUTPUT-FN"), makeKeyword("TESTFN"), makeKeyword("HASH-FN"), makeKeyword("INPUT-CACHE"), makeKeyword("OUTPUT-CACHE"), makeKeyword("PROPERTY-LIST") });

    public static final SubLList $list4 = list(new SubLObject[]{ makeSymbol("FILE-HASH-TABLE-STREAM"), makeSymbol("FILE-HASH-TABLE-HEADER"), makeSymbol("FILE-HASH-TABLE-LOCK"), makeSymbol("FILE-HASH-TABLE-ENCODING-INPUT-FN"), makeSymbol("FILE-HASH-TABLE-ENCODING-OUTPUT-FN"), makeSymbol("FILE-HASH-TABLE-ENCODING-SIZE-FN"), makeSymbol("FILE-HASH-TABLE-ENCODING-KEY-INPUT-FN"), makeSymbol("FILE-HASH-TABLE-ENCODING-KEY-OUTPUT-FN"), makeSymbol("FILE-HASH-TABLE-TESTFN"), makeSymbol("FILE-HASH-TABLE-HASH-FN"), makeSymbol("FILE-HASH-TABLE-INPUT-CACHE"), makeSymbol("FILE-HASH-TABLE-OUTPUT-CACHE"), makeSymbol("FILE-HASH-TABLE-PROPERTY-LIST") });

    public static final SubLList $list5 = list(new SubLObject[]{ makeSymbol("_CSETF-FILE-HASH-TABLE-STREAM"), makeSymbol("_CSETF-FILE-HASH-TABLE-HEADER"), makeSymbol("_CSETF-FILE-HASH-TABLE-LOCK"), makeSymbol("_CSETF-FILE-HASH-TABLE-ENCODING-INPUT-FN"), makeSymbol("_CSETF-FILE-HASH-TABLE-ENCODING-OUTPUT-FN"), makeSymbol("_CSETF-FILE-HASH-TABLE-ENCODING-SIZE-FN"), makeSymbol("_CSETF-FILE-HASH-TABLE-ENCODING-KEY-INPUT-FN"), makeSymbol("_CSETF-FILE-HASH-TABLE-ENCODING-KEY-OUTPUT-FN"), makeSymbol("_CSETF-FILE-HASH-TABLE-TESTFN"), makeSymbol("_CSETF-FILE-HASH-TABLE-HASH-FN"), makeSymbol("_CSETF-FILE-HASH-TABLE-INPUT-CACHE"), makeSymbol("_CSETF-FILE-HASH-TABLE-OUTPUT-CACHE"), makeSymbol("_CSETF-FILE-HASH-TABLE-PROPERTY-LIST") });



    public static final SubLSymbol FILE_HASH_TABLE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("FILE-HASH-TABLE-PRINT-FUNCTION-TRAMPOLINE");

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

    private static final SubLList $list64 = list(new SubLObject[]{ makeKeyword("SIZE"), makeKeyword("VERSION-MAJOR"), makeKeyword("VERSION-MINOR"), makeKeyword("OBJECT-SPACE-OFFSET"), makeKeyword("KEY-SPACE-OFFSET"), makeKeyword("CURRENT-HEAP-TOP"), makeKeyword("ITEM-COUNT"), makeKeyword("CAPACITY"), makeKeyword("FREE-LIST-HEAD"), makeKeyword("DELETION-COUNT"), makeKeyword("HEADER-CRC"), makeKeyword("EXTENSION-SPACE-SIZE"), makeKeyword("EXTENSION-SPACE") });

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

    private static final SubLList $list124 = list(makeKeyword("SIZE"), makeKeyword("TYPE"), makeKeyword("KEY-SIZE"), makeKeyword("KEY"), makeKeyword("DATA-SIZE"), makeKeyword("DATA"));

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

    private static final SubLList $list204 = list(makeKeyword("DONE"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");





    public static final SubLList $list208 = list(makeKeyword("ENCODING-INPUT-FN"), makeSymbol("CFASL-INPUT"), makeKeyword("ENCODING-OUTPUT-FN"), makeSymbol("CFASL-OUTPUT"), makeKeyword("ENCODING-SIZE-FN"), makeSymbol("CFASL-OBJECT-SIZE"), makeKeyword("HASH-FN"), makeSymbol("SXHASH"));

    private static final SubLSymbol $IMAGE_INDEPENDENT_CFASL = makeKeyword("IMAGE-INDEPENDENT-CFASL");

    private static final SubLList $list210 = list(makeKeyword("ENCODING-INPUT-FN"), makeSymbol("CFASL-INPUT"), makeKeyword("ENCODING-OUTPUT-FN"), makeSymbol("CFASL-OUTPUT-EXTERNALIZED"), makeKeyword("ENCODING-SIZE-FN"), makeSymbol("CFASL-EXTERNALIZED-OBJECT-SIZE"), makeKeyword("HASH-FN"), makeSymbol("SXHASH-EXTERNAL"));

    private static final SubLSymbol $HL_EXTERNALIZED_KEYS = makeKeyword("HL-EXTERNALIZED-KEYS");

    private static final SubLList $list212 = list(new SubLObject[]{ makeKeyword("ENCODING-INPUT-FN"), makeSymbol("CFASL-INPUT"), makeKeyword("ENCODING-OUTPUT-FN"), makeSymbol("CFASL-OUTPUT-EXTERNALIZED"), makeKeyword("ENCODING-SIZE-FN"), makeSymbol("CFASL-EXTERNALIZED-OBJECT-SIZE"), makeKeyword("HASH-FN"), makeSymbol("SXHASH-EXTERNAL"), makeKeyword("ENCODING-KEY-INPUT-FN"), makeSymbol("FIND-OBJECT-BY-HL-EXTERNAL-ID-STRING"), makeKeyword("ENCODING-KEY-OUTPUT-FN"), makeSymbol("HL-EXTERNAL-ID-STRING") });

    private static final SubLList $list213 = list(makeSymbol("FORMAT-STRING"), makeSymbol("&REST"), makeSymbol("ARGS"));



    public static final SubLList $list215 = list(makeSymbol("NULL"), makeSymbol("*FHT-LOOKUP-STREAM*"));



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

    private static final SubLList $list261 = list(makeKeyword("MESSAGE"), makeKeyword("DONE"));



    private static final SubLSymbol $sym263$TABLE_VAR = makeUninternedSymbol("TABLE-VAR");

    private static final SubLSymbol $progress_note$ = makeSymbol("*PROGRESS-NOTE*");

    public static final SubLList $list265 = list(makeSymbol("CSETQ"), makeSymbol("*PROGRESS-START-TIME*"), list(makeSymbol("GET-UNIVERSAL-TIME")));

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

    public static final SubLList $list288 = list(T);



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



    public static final SubLList $list304 = list(makeSymbol("CURRENT"), makeSymbol("FHT"), makeSymbol("KEYS-ONLY?"), makeSymbol("FINALIZE-FHT?"));



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

    private static final SubLList $list327 = list(makeKeyword("SIZE"), makeKeyword("NEXT"));

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

    public static final SubLList $list355 = list(list(makeSymbol("FHT"), makeSymbol("DIFF-KEYSPACE"), makeSymbol("DIFF-CAPACITY")), makeSymbol("&BODY"), makeSymbol("BODY"));

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

    public static final SubLList $list432 = list(makeSymbol("FSTFHT-KSORTER-TEMPSTEM"), makeSymbol("FSTFHT-KSORTER-IN-FILES"), makeSymbol("FSTFHT-KSORTER-OUT-FILES"));

    private static final SubLList $list433 = list(makeSymbol("_CSETF-FSTFHT-KSORTER-TEMPSTEM"), makeSymbol("_CSETF-FSTFHT-KSORTER-IN-FILES"), makeSymbol("_CSETF-FSTFHT-KSORTER-OUT-FILES"));

    private static final SubLSymbol FAST_FHT_KEYSTREAM_SORTER_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("FAST-FHT-KEYSTREAM-SORTER-PRINT-FUNCTION-TRAMPOLINE");

    public static final SubLList $list435 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("FAST-FHT-KEYSTREAM-SORTER-P"));

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



    private static final SubLList $list495 = list(list(makeSymbol("FHT"), makeSymbol("FILENAME"), makeSymbol("&KEY"), list(makeSymbol("TEST-FN"), list(makeSymbol("QUOTE"), makeSymbol("*DEFAULT-FHT-TEST-FUNCTION*"))), list(makeSymbol("SERIALIZATION-FN"), makeSymbol("*DEFAULT-FHT-SERIALIZATION-PROTOCOL*"))), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list496 = list(makeKeyword("TEST-FN"), makeKeyword("SERIALIZATION-FN"));



    public static final SubLSymbol $default_fht_test_function$ = makeSymbol("*DEFAULT-FHT-TEST-FUNCTION*");





    private static final SubLSymbol OPEN_FILE_HASH_TABLE_READ_ONLY = makeSymbol("OPEN-FILE-HASH-TABLE-READ-ONLY");



    private static final SubLSymbol FINALIZE_FILE_HASH_TABLE = makeSymbol("FINALIZE-FILE-HASH-TABLE");

    private static final SubLSymbol OPEN_FILE_HASH_TABLE = makeSymbol("OPEN-FILE-HASH-TABLE");

    private static final SubLList $list505 = list(list(makeSymbol("FHT"), makeSymbol("FILENAME"), makeSymbol("&KEY"), list(makeSymbol("EXPECTED-ITEMS"), makeSymbol("*HTFILE-DEFAULT-EXPECTED-ITEMS*")), list(makeSymbol("AVERAGE-SIZE"), makeSymbol("*HTFILE-DEFAULT-AVERAGE-SIZE*")), list(makeSymbol("TEST-FN"), list(makeSymbol("QUOTE"), makeSymbol("*DEFAULT-FHT-TEST-FUNCTION*"))), list(makeSymbol("SERIALIZATION-FN"), makeSymbol("*DEFAULT-FHT-SERIALIZATION-PROTOCOL*"))), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list506 = list(makeKeyword("EXPECTED-ITEMS"), makeKeyword("AVERAGE-SIZE"), makeKeyword("TEST-FN"), makeKeyword("SERIALIZATION-FN"));





    private static final SubLSymbol CREATE_FILE_HASH_TABLE = makeSymbol("CREATE-FILE-HASH-TABLE");

    private static final SubLList $list510 = list(list(makeSymbol("FAST-FHT"), makeSymbol("FILENAME"), makeSymbol("&KEY"), list(makeSymbol("TEMPDIR"), list(makeSymbol("TEMP-DIRECTORY"))), list(makeSymbol("TEST-FN"), list(makeSymbol("QUOTE"), makeSymbol("*DEFAULT-FHT-TEST-FUNCTION*"))), list(makeSymbol("SERIALIZATION-FN"), makeSymbol("*DEFAULT-FHT-SERIALIZATION-PROTOCOL*")), list(makeSymbol("KEEP-TEMPORARY-KEYFILE"))), makeSymbol("&BODY"), makeSymbol("BODY"));

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



    static {





    }

    public static SubLObject file_hash_table_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject file_hash_table_p(final SubLObject v_object) {
        return v_object.getClass() == file_hash_table.$file_hash_table_native.class ? T : NIL;
    }

    public static SubLObject file_hash_table_stream(final SubLObject v_object) {
        assert NIL != file_hash_table_p(v_object) : "file_hash_table.file_hash_table_p(v_object) " + "CommonSymbols.NIL != file_hash_table.file_hash_table_p(v_object) " + v_object;
        return v_object.getField2();
    }

    public static SubLObject file_hash_table_header(final SubLObject v_object) {
        assert NIL != file_hash_table_p(v_object) : "file_hash_table.file_hash_table_p(v_object) " + "CommonSymbols.NIL != file_hash_table.file_hash_table_p(v_object) " + v_object;
        return v_object.getField3();
    }

    public static SubLObject file_hash_table_lock(final SubLObject v_object) {
        assert NIL != file_hash_table_p(v_object) : "file_hash_table.file_hash_table_p(v_object) " + "CommonSymbols.NIL != file_hash_table.file_hash_table_p(v_object) " + v_object;
        return v_object.getField4();
    }

    public static SubLObject file_hash_table_encoding_input_fn(final SubLObject v_object) {
        assert NIL != file_hash_table_p(v_object) : "file_hash_table.file_hash_table_p(v_object) " + "CommonSymbols.NIL != file_hash_table.file_hash_table_p(v_object) " + v_object;
        return v_object.getField5();
    }

    public static SubLObject file_hash_table_encoding_output_fn(final SubLObject v_object) {
        assert NIL != file_hash_table_p(v_object) : "file_hash_table.file_hash_table_p(v_object) " + "CommonSymbols.NIL != file_hash_table.file_hash_table_p(v_object) " + v_object;
        return v_object.getField6();
    }

    public static SubLObject file_hash_table_encoding_size_fn(final SubLObject v_object) {
        assert NIL != file_hash_table_p(v_object) : "file_hash_table.file_hash_table_p(v_object) " + "CommonSymbols.NIL != file_hash_table.file_hash_table_p(v_object) " + v_object;
        return v_object.getField7();
    }

    public static SubLObject file_hash_table_encoding_key_input_fn(final SubLObject v_object) {
        assert NIL != file_hash_table_p(v_object) : "file_hash_table.file_hash_table_p(v_object) " + "CommonSymbols.NIL != file_hash_table.file_hash_table_p(v_object) " + v_object;
        return v_object.getField8();
    }

    public static SubLObject file_hash_table_encoding_key_output_fn(final SubLObject v_object) {
        assert NIL != file_hash_table_p(v_object) : "file_hash_table.file_hash_table_p(v_object) " + "CommonSymbols.NIL != file_hash_table.file_hash_table_p(v_object) " + v_object;
        return v_object.getField9();
    }

    public static SubLObject file_hash_table_testfn(final SubLObject v_object) {
        assert NIL != file_hash_table_p(v_object) : "file_hash_table.file_hash_table_p(v_object) " + "CommonSymbols.NIL != file_hash_table.file_hash_table_p(v_object) " + v_object;
        return v_object.getField10();
    }

    public static SubLObject file_hash_table_hash_fn(final SubLObject v_object) {
        assert NIL != file_hash_table_p(v_object) : "file_hash_table.file_hash_table_p(v_object) " + "CommonSymbols.NIL != file_hash_table.file_hash_table_p(v_object) " + v_object;
        return v_object.getField11();
    }

    public static SubLObject file_hash_table_input_cache(final SubLObject v_object) {
        assert NIL != file_hash_table_p(v_object) : "file_hash_table.file_hash_table_p(v_object) " + "CommonSymbols.NIL != file_hash_table.file_hash_table_p(v_object) " + v_object;
        return v_object.getField12();
    }

    public static SubLObject file_hash_table_output_cache(final SubLObject v_object) {
        assert NIL != file_hash_table_p(v_object) : "file_hash_table.file_hash_table_p(v_object) " + "CommonSymbols.NIL != file_hash_table.file_hash_table_p(v_object) " + v_object;
        return v_object.getField13();
    }

    public static SubLObject file_hash_table_property_list(final SubLObject v_object) {
        assert NIL != file_hash_table_p(v_object) : "file_hash_table.file_hash_table_p(v_object) " + "CommonSymbols.NIL != file_hash_table.file_hash_table_p(v_object) " + v_object;
        return v_object.getField14();
    }

    public static SubLObject _csetf_file_hash_table_stream(final SubLObject v_object, final SubLObject value) {
        assert NIL != file_hash_table_p(v_object) : "file_hash_table.file_hash_table_p(v_object) " + "CommonSymbols.NIL != file_hash_table.file_hash_table_p(v_object) " + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_file_hash_table_header(final SubLObject v_object, final SubLObject value) {
        assert NIL != file_hash_table_p(v_object) : "file_hash_table.file_hash_table_p(v_object) " + "CommonSymbols.NIL != file_hash_table.file_hash_table_p(v_object) " + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_file_hash_table_lock(final SubLObject v_object, final SubLObject value) {
        assert NIL != file_hash_table_p(v_object) : "file_hash_table.file_hash_table_p(v_object) " + "CommonSymbols.NIL != file_hash_table.file_hash_table_p(v_object) " + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_file_hash_table_encoding_input_fn(final SubLObject v_object, final SubLObject value) {
        assert NIL != file_hash_table_p(v_object) : "file_hash_table.file_hash_table_p(v_object) " + "CommonSymbols.NIL != file_hash_table.file_hash_table_p(v_object) " + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_file_hash_table_encoding_output_fn(final SubLObject v_object, final SubLObject value) {
        assert NIL != file_hash_table_p(v_object) : "file_hash_table.file_hash_table_p(v_object) " + "CommonSymbols.NIL != file_hash_table.file_hash_table_p(v_object) " + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_file_hash_table_encoding_size_fn(final SubLObject v_object, final SubLObject value) {
        assert NIL != file_hash_table_p(v_object) : "file_hash_table.file_hash_table_p(v_object) " + "CommonSymbols.NIL != file_hash_table.file_hash_table_p(v_object) " + v_object;
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_file_hash_table_encoding_key_input_fn(final SubLObject v_object, final SubLObject value) {
        assert NIL != file_hash_table_p(v_object) : "file_hash_table.file_hash_table_p(v_object) " + "CommonSymbols.NIL != file_hash_table.file_hash_table_p(v_object) " + v_object;
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_file_hash_table_encoding_key_output_fn(final SubLObject v_object, final SubLObject value) {
        assert NIL != file_hash_table_p(v_object) : "file_hash_table.file_hash_table_p(v_object) " + "CommonSymbols.NIL != file_hash_table.file_hash_table_p(v_object) " + v_object;
        return v_object.setField9(value);
    }

    public static SubLObject _csetf_file_hash_table_testfn(final SubLObject v_object, final SubLObject value) {
        assert NIL != file_hash_table_p(v_object) : "file_hash_table.file_hash_table_p(v_object) " + "CommonSymbols.NIL != file_hash_table.file_hash_table_p(v_object) " + v_object;
        return v_object.setField10(value);
    }

    public static SubLObject _csetf_file_hash_table_hash_fn(final SubLObject v_object, final SubLObject value) {
        assert NIL != file_hash_table_p(v_object) : "file_hash_table.file_hash_table_p(v_object) " + "CommonSymbols.NIL != file_hash_table.file_hash_table_p(v_object) " + v_object;
        return v_object.setField11(value);
    }

    public static SubLObject _csetf_file_hash_table_input_cache(final SubLObject v_object, final SubLObject value) {
        assert NIL != file_hash_table_p(v_object) : "file_hash_table.file_hash_table_p(v_object) " + "CommonSymbols.NIL != file_hash_table.file_hash_table_p(v_object) " + v_object;
        return v_object.setField12(value);
    }

    public static SubLObject _csetf_file_hash_table_output_cache(final SubLObject v_object, final SubLObject value) {
        assert NIL != file_hash_table_p(v_object) : "file_hash_table.file_hash_table_p(v_object) " + "CommonSymbols.NIL != file_hash_table.file_hash_table_p(v_object) " + v_object;
        return v_object.setField13(value);
    }

    public static SubLObject _csetf_file_hash_table_property_list(final SubLObject v_object, final SubLObject value) {
        assert NIL != file_hash_table_p(v_object) : "file_hash_table.file_hash_table_p(v_object) " + "CommonSymbols.NIL != file_hash_table.file_hash_table_p(v_object) " + v_object;
        return v_object.setField14(value);
    }

    public static SubLObject make_file_hash_table(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new file_hash_table.$file_hash_table_native();
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

    public static SubLObject read_only_file_hash_table_p(final SubLObject v_object) {
        return makeBoolean((NIL != file_hash_table_p(v_object)) && (NIL != file_hash_table_is_read_onlyP(v_object)));
    }

    public static SubLObject writeable_file_hash_table_p(final SubLObject v_object) {
        return makeBoolean((NIL != file_hash_table_p(v_object)) && (NIL == file_hash_table_is_read_onlyP(v_object)));
    }

    public static SubLObject file_hash_table_is_read_onlyP(final SubLObject fht) {
        assert NIL != file_hash_table_p(fht) : "file_hash_table.file_hash_table_p(fht) " + "CommonSymbols.NIL != file_hash_table.file_hash_table_p(fht) " + fht;
        final SubLObject fht_stream = file_hash_table_stream(fht);
        return makeBoolean(NIL == output_stream_p(fht_stream));
    }

    public static SubLObject file_hash_table_path(final SubLObject fht) {
        assert NIL != file_hash_table_p(fht) : "file_hash_table.file_hash_table_p(fht) " + "CommonSymbols.NIL != file_hash_table.file_hash_table_p(fht) " + fht;
        return string_utilities.to_string(Filesys.probe_file(file_hash_table_stream(fht)));
    }

    public static SubLObject file_hash_table_serialization(final SubLObject fht) {
        assert NIL != file_hash_table_p(fht) : "file_hash_table.file_hash_table_p(fht) " + "CommonSymbols.NIL != file_hash_table.file_hash_table_p(fht) " + fht;
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

    public static SubLObject htfile_header_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject htfile_header_p(final SubLObject v_object) {
        return v_object.getClass() == file_hash_table.$htfile_header_native.class ? T : NIL;
    }

    public static SubLObject htfile_header_size(final SubLObject v_object) {
        assert NIL != htfile_header_p(v_object) : "file_hash_table.htfile_header_p(v_object) " + "CommonSymbols.NIL != file_hash_table.htfile_header_p(v_object) " + v_object;
        return v_object.getField2();
    }

    public static SubLObject htfile_header_version_major(final SubLObject v_object) {
        assert NIL != htfile_header_p(v_object) : "file_hash_table.htfile_header_p(v_object) " + "CommonSymbols.NIL != file_hash_table.htfile_header_p(v_object) " + v_object;
        return v_object.getField3();
    }

    public static SubLObject htfile_header_version_minor(final SubLObject v_object) {
        assert NIL != htfile_header_p(v_object) : "file_hash_table.htfile_header_p(v_object) " + "CommonSymbols.NIL != file_hash_table.htfile_header_p(v_object) " + v_object;
        return v_object.getField4();
    }

    public static SubLObject htfile_header_object_space_offset(final SubLObject v_object) {
        assert NIL != htfile_header_p(v_object) : "file_hash_table.htfile_header_p(v_object) " + "CommonSymbols.NIL != file_hash_table.htfile_header_p(v_object) " + v_object;
        return v_object.getField5();
    }

    public static SubLObject htfile_header_key_space_offset(final SubLObject v_object) {
        assert NIL != htfile_header_p(v_object) : "file_hash_table.htfile_header_p(v_object) " + "CommonSymbols.NIL != file_hash_table.htfile_header_p(v_object) " + v_object;
        return v_object.getField6();
    }

    public static SubLObject htfile_header_current_heap_top(final SubLObject v_object) {
        assert NIL != htfile_header_p(v_object) : "file_hash_table.htfile_header_p(v_object) " + "CommonSymbols.NIL != file_hash_table.htfile_header_p(v_object) " + v_object;
        return v_object.getField7();
    }

    public static SubLObject htfile_header_item_count(final SubLObject v_object) {
        assert NIL != htfile_header_p(v_object) : "file_hash_table.htfile_header_p(v_object) " + "CommonSymbols.NIL != file_hash_table.htfile_header_p(v_object) " + v_object;
        return v_object.getField8();
    }

    public static SubLObject htfile_header_capacity(final SubLObject v_object) {
        assert NIL != htfile_header_p(v_object) : "file_hash_table.htfile_header_p(v_object) " + "CommonSymbols.NIL != file_hash_table.htfile_header_p(v_object) " + v_object;
        return v_object.getField9();
    }

    public static SubLObject htfile_header_free_list_head(final SubLObject v_object) {
        assert NIL != htfile_header_p(v_object) : "file_hash_table.htfile_header_p(v_object) " + "CommonSymbols.NIL != file_hash_table.htfile_header_p(v_object) " + v_object;
        return v_object.getField10();
    }

    public static SubLObject htfile_header_deletion_count(final SubLObject v_object) {
        assert NIL != htfile_header_p(v_object) : "file_hash_table.htfile_header_p(v_object) " + "CommonSymbols.NIL != file_hash_table.htfile_header_p(v_object) " + v_object;
        return v_object.getField11();
    }

    public static SubLObject htfile_header_header_crc(final SubLObject v_object) {
        assert NIL != htfile_header_p(v_object) : "file_hash_table.htfile_header_p(v_object) " + "CommonSymbols.NIL != file_hash_table.htfile_header_p(v_object) " + v_object;
        return v_object.getField12();
    }

    public static SubLObject htfile_header_extension_space_size(final SubLObject v_object) {
        assert NIL != htfile_header_p(v_object) : "file_hash_table.htfile_header_p(v_object) " + "CommonSymbols.NIL != file_hash_table.htfile_header_p(v_object) " + v_object;
        return v_object.getField13();
    }

    public static SubLObject htfile_header_extension_space(final SubLObject v_object) {
        assert NIL != htfile_header_p(v_object) : "file_hash_table.htfile_header_p(v_object) " + "CommonSymbols.NIL != file_hash_table.htfile_header_p(v_object) " + v_object;
        return v_object.getField14();
    }

    public static SubLObject _csetf_htfile_header_size(final SubLObject v_object, final SubLObject value) {
        assert NIL != htfile_header_p(v_object) : "file_hash_table.htfile_header_p(v_object) " + "CommonSymbols.NIL != file_hash_table.htfile_header_p(v_object) " + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_htfile_header_version_major(final SubLObject v_object, final SubLObject value) {
        assert NIL != htfile_header_p(v_object) : "file_hash_table.htfile_header_p(v_object) " + "CommonSymbols.NIL != file_hash_table.htfile_header_p(v_object) " + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_htfile_header_version_minor(final SubLObject v_object, final SubLObject value) {
        assert NIL != htfile_header_p(v_object) : "file_hash_table.htfile_header_p(v_object) " + "CommonSymbols.NIL != file_hash_table.htfile_header_p(v_object) " + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_htfile_header_object_space_offset(final SubLObject v_object, final SubLObject value) {
        assert NIL != htfile_header_p(v_object) : "file_hash_table.htfile_header_p(v_object) " + "CommonSymbols.NIL != file_hash_table.htfile_header_p(v_object) " + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_htfile_header_key_space_offset(final SubLObject v_object, final SubLObject value) {
        assert NIL != htfile_header_p(v_object) : "file_hash_table.htfile_header_p(v_object) " + "CommonSymbols.NIL != file_hash_table.htfile_header_p(v_object) " + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_htfile_header_current_heap_top(final SubLObject v_object, final SubLObject value) {
        assert NIL != htfile_header_p(v_object) : "file_hash_table.htfile_header_p(v_object) " + "CommonSymbols.NIL != file_hash_table.htfile_header_p(v_object) " + v_object;
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_htfile_header_item_count(final SubLObject v_object, final SubLObject value) {
        assert NIL != htfile_header_p(v_object) : "file_hash_table.htfile_header_p(v_object) " + "CommonSymbols.NIL != file_hash_table.htfile_header_p(v_object) " + v_object;
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_htfile_header_capacity(final SubLObject v_object, final SubLObject value) {
        assert NIL != htfile_header_p(v_object) : "file_hash_table.htfile_header_p(v_object) " + "CommonSymbols.NIL != file_hash_table.htfile_header_p(v_object) " + v_object;
        return v_object.setField9(value);
    }

    public static SubLObject _csetf_htfile_header_free_list_head(final SubLObject v_object, final SubLObject value) {
        assert NIL != htfile_header_p(v_object) : "file_hash_table.htfile_header_p(v_object) " + "CommonSymbols.NIL != file_hash_table.htfile_header_p(v_object) " + v_object;
        return v_object.setField10(value);
    }

    public static SubLObject _csetf_htfile_header_deletion_count(final SubLObject v_object, final SubLObject value) {
        assert NIL != htfile_header_p(v_object) : "file_hash_table.htfile_header_p(v_object) " + "CommonSymbols.NIL != file_hash_table.htfile_header_p(v_object) " + v_object;
        return v_object.setField11(value);
    }

    public static SubLObject _csetf_htfile_header_header_crc(final SubLObject v_object, final SubLObject value) {
        assert NIL != htfile_header_p(v_object) : "file_hash_table.htfile_header_p(v_object) " + "CommonSymbols.NIL != file_hash_table.htfile_header_p(v_object) " + v_object;
        return v_object.setField12(value);
    }

    public static SubLObject _csetf_htfile_header_extension_space_size(final SubLObject v_object, final SubLObject value) {
        assert NIL != htfile_header_p(v_object) : "file_hash_table.htfile_header_p(v_object) " + "CommonSymbols.NIL != file_hash_table.htfile_header_p(v_object) " + v_object;
        return v_object.setField13(value);
    }

    public static SubLObject _csetf_htfile_header_extension_space(final SubLObject v_object, final SubLObject value) {
        assert NIL != htfile_header_p(v_object) : "file_hash_table.htfile_header_p(v_object) " + "CommonSymbols.NIL != file_hash_table.htfile_header_p(v_object) " + v_object;
        return v_object.setField14(value);
    }

    public static SubLObject make_htfile_header(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new file_hash_table.$htfile_header_native();
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

    public static SubLObject htfile_object_entry_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject htfile_object_entry_p(final SubLObject v_object) {
        return v_object.getClass() == file_hash_table.$htfile_object_entry_native.class ? T : NIL;
    }

    public static SubLObject htfile_object_entry_size(final SubLObject v_object) {
        assert NIL != htfile_object_entry_p(v_object) : "file_hash_table.htfile_object_entry_p(v_object) " + "CommonSymbols.NIL != file_hash_table.htfile_object_entry_p(v_object) " + v_object;
        return v_object.getField2();
    }

    public static SubLObject htfile_object_entry_type(final SubLObject v_object) {
        assert NIL != htfile_object_entry_p(v_object) : "file_hash_table.htfile_object_entry_p(v_object) " + "CommonSymbols.NIL != file_hash_table.htfile_object_entry_p(v_object) " + v_object;
        return v_object.getField3();
    }

    public static SubLObject htfile_object_entry_key_size(final SubLObject v_object) {
        assert NIL != htfile_object_entry_p(v_object) : "file_hash_table.htfile_object_entry_p(v_object) " + "CommonSymbols.NIL != file_hash_table.htfile_object_entry_p(v_object) " + v_object;
        return v_object.getField4();
    }

    public static SubLObject htfile_object_entry_key(final SubLObject v_object) {
        assert NIL != htfile_object_entry_p(v_object) : "file_hash_table.htfile_object_entry_p(v_object) " + "CommonSymbols.NIL != file_hash_table.htfile_object_entry_p(v_object) " + v_object;
        return v_object.getField5();
    }

    public static SubLObject htfile_object_entry_data_size(final SubLObject v_object) {
        assert NIL != htfile_object_entry_p(v_object) : "file_hash_table.htfile_object_entry_p(v_object) " + "CommonSymbols.NIL != file_hash_table.htfile_object_entry_p(v_object) " + v_object;
        return v_object.getField6();
    }

    public static SubLObject htfile_object_entry_data(final SubLObject v_object) {
        assert NIL != htfile_object_entry_p(v_object) : "file_hash_table.htfile_object_entry_p(v_object) " + "CommonSymbols.NIL != file_hash_table.htfile_object_entry_p(v_object) " + v_object;
        return v_object.getField7();
    }

    public static SubLObject _csetf_htfile_object_entry_size(final SubLObject v_object, final SubLObject value) {
        assert NIL != htfile_object_entry_p(v_object) : "file_hash_table.htfile_object_entry_p(v_object) " + "CommonSymbols.NIL != file_hash_table.htfile_object_entry_p(v_object) " + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_htfile_object_entry_type(final SubLObject v_object, final SubLObject value) {
        assert NIL != htfile_object_entry_p(v_object) : "file_hash_table.htfile_object_entry_p(v_object) " + "CommonSymbols.NIL != file_hash_table.htfile_object_entry_p(v_object) " + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_htfile_object_entry_key_size(final SubLObject v_object, final SubLObject value) {
        assert NIL != htfile_object_entry_p(v_object) : "file_hash_table.htfile_object_entry_p(v_object) " + "CommonSymbols.NIL != file_hash_table.htfile_object_entry_p(v_object) " + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_htfile_object_entry_key(final SubLObject v_object, final SubLObject value) {
        assert NIL != htfile_object_entry_p(v_object) : "file_hash_table.htfile_object_entry_p(v_object) " + "CommonSymbols.NIL != file_hash_table.htfile_object_entry_p(v_object) " + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_htfile_object_entry_data_size(final SubLObject v_object, final SubLObject value) {
        assert NIL != htfile_object_entry_p(v_object) : "file_hash_table.htfile_object_entry_p(v_object) " + "CommonSymbols.NIL != file_hash_table.htfile_object_entry_p(v_object) " + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_htfile_object_entry_data(final SubLObject v_object, final SubLObject value) {
        assert NIL != htfile_object_entry_p(v_object) : "file_hash_table.htfile_object_entry_p(v_object) " + "CommonSymbols.NIL != file_hash_table.htfile_object_entry_p(v_object) " + v_object;
        return v_object.setField7(value);
    }

    public static SubLObject make_htfile_object_entry(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new file_hash_table.$htfile_object_entry_native();
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

    public static SubLObject htfile_key_entry_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject htfile_key_entry_p(final SubLObject v_object) {
        return v_object.getClass() == file_hash_table.$htfile_key_entry_native.class ? T : NIL;
    }

    public static SubLObject htfile_key_entry_key_offset(final SubLObject v_object) {
        assert NIL != htfile_key_entry_p(v_object) : "file_hash_table.htfile_key_entry_p(v_object) " + "CommonSymbols.NIL != file_hash_table.htfile_key_entry_p(v_object) " + v_object;
        return v_object.getField2();
    }

    public static SubLObject htfile_key_entry_hash_code(final SubLObject v_object) {
        assert NIL != htfile_key_entry_p(v_object) : "file_hash_table.htfile_key_entry_p(v_object) " + "CommonSymbols.NIL != file_hash_table.htfile_key_entry_p(v_object) " + v_object;
        return v_object.getField3();
    }

    public static SubLObject _csetf_htfile_key_entry_key_offset(final SubLObject v_object, final SubLObject value) {
        assert NIL != htfile_key_entry_p(v_object) : "file_hash_table.htfile_key_entry_p(v_object) " + "CommonSymbols.NIL != file_hash_table.htfile_key_entry_p(v_object) " + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_htfile_key_entry_hash_code(final SubLObject v_object, final SubLObject value) {
        assert NIL != htfile_key_entry_p(v_object) : "file_hash_table.htfile_key_entry_p(v_object) " + "CommonSymbols.NIL != file_hash_table.htfile_key_entry_p(v_object) " + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject make_htfile_key_entry(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new file_hash_table.$htfile_key_entry_native();
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

    public static SubLObject get_default_fht_test_function() {
        return $default_fht_test_function$.getGlobalValue();
    }

    public static SubLObject get_default_fht_serialization_protocol() {
        return $default_fht_serialization_protocol$.getGlobalValue();
    }

    public static SubLObject new_htfile_header() {
        final SubLObject header = make_htfile_header(UNPROVIDED);
        _csetf_htfile_header_version_major(header, $htfile_header_current_vmajor$.getGlobalValue());
        _csetf_htfile_header_version_minor(header, $htfile_header_current_vminor$.getGlobalValue());
        return header;
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

    public static SubLObject htfile_scale_user_space_to_implementation_space(final SubLObject avg_size) {
        return add(htfile_minimal_space_required(), avg_size);
    }

    public static SubLObject htfile_minimal_space_required() {
        return add(htfile_minimal_space_required_for_key(), htfile_minimal_space_required_for_object());
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

    public static SubLObject new_htfile_key_entry(final SubLObject code, SubLObject offset) {
        if (offset == UNPROVIDED) {
            offset = ZERO_INTEGER;
        }
        final SubLObject entry = make_htfile_key_entry(UNPROVIDED);
        _csetf_htfile_key_entry_key_offset(entry, offset);
        _csetf_htfile_key_entry_hash_code(entry, code);
        return entry;
    }

    public static SubLObject construct_tombstone_key_entry() {
        return new_htfile_key_entry($fht_invalid_hash_code$.getGlobalValue(), $fht_tombstone_offset_marker$.getGlobalValue());
    }

    public static SubLObject is_tombstoned_key_entryP(final SubLObject entry) {
        return equalp(entry, $fht_tombstone_key_entry$.getGlobalValue());
    }

    public static SubLObject construct_empty_key_entry() {
        return new_htfile_key_entry($fht_invalid_hash_code$.getGlobalValue(), $fht_empty_offset_marker$.getGlobalValue());
    }

    public static SubLObject is_empty_key_entryP(final SubLObject entry) {
        return equalp(entry, $fht_empty_key_entry$.getGlobalValue());
    }

    public static SubLObject is_valid_key_entryP(final SubLObject entry, final SubLObject fht) {
        return makeBoolean((NIL != is_empty_key_entryP(entry)) || ((NIL != valid_hash_code_p(htfile_key_entry_hash_code(entry))) && (NIL != valid_fht_heap_offset_p(htfile_key_entry_key_offset(entry), fht))));
    }

    public static SubLObject fht_sxhash_for_fht(final SubLObject fht, final SubLObject entity) {
        final SubLObject hash_fn = file_hash_table_hash_fn(fht);
        return fht_sxhash(entity, hash_fn);
    }

    public static SubLObject fht_sxhash(final SubLObject entity, final SubLObject hash_fn) {
        final SubLObject code = abs(funcall(hash_fn, entity));
        if (NIL == valid_hash_code_p(code)) {
            Errors.warn($str170$Sorry___A_hashed_to__A__which_is_, entity, code);
        }
        return code;
    }

    public static SubLObject valid_hash_code_p(final SubLObject code) {
        return makeBoolean((NIL != subl_promotions.non_negative_integer_p(code)) && code.numL($max_fht_hash_code_value$.getGlobalValue()));
    }

    public static SubLObject new_object_entry(final SubLObject key, final SubLObject v_object) {
        final SubLObject object_entry = make_htfile_object_entry(UNPROVIDED);
        _csetf_htfile_object_entry_key(object_entry, key);
        _csetf_htfile_object_entry_data(object_entry, v_object);
        return object_entry;
    }

    public static SubLObject fht_serialization_entry_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_fht_serialization_entry(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject fht_serialization_entry_p(final SubLObject v_object) {
        return v_object.getClass() == file_hash_table.$fht_serialization_entry_native.class ? T : NIL;
    }

    public static SubLObject fht_se_encoding_input_fn(final SubLObject v_object) {
        assert NIL != fht_serialization_entry_p(v_object) : "file_hash_table.fht_serialization_entry_p(v_object) " + "CommonSymbols.NIL != file_hash_table.fht_serialization_entry_p(v_object) " + v_object;
        return v_object.getField2();
    }

    public static SubLObject fht_se_encoding_output_fn(final SubLObject v_object) {
        assert NIL != fht_serialization_entry_p(v_object) : "file_hash_table.fht_serialization_entry_p(v_object) " + "CommonSymbols.NIL != file_hash_table.fht_serialization_entry_p(v_object) " + v_object;
        return v_object.getField3();
    }

    public static SubLObject fht_se_encoding_size_fn(final SubLObject v_object) {
        assert NIL != fht_serialization_entry_p(v_object) : "file_hash_table.fht_serialization_entry_p(v_object) " + "CommonSymbols.NIL != file_hash_table.fht_serialization_entry_p(v_object) " + v_object;
        return v_object.getField4();
    }

    public static SubLObject fht_se_hash_fn(final SubLObject v_object) {
        assert NIL != fht_serialization_entry_p(v_object) : "file_hash_table.fht_serialization_entry_p(v_object) " + "CommonSymbols.NIL != file_hash_table.fht_serialization_entry_p(v_object) " + v_object;
        return v_object.getField5();
    }

    public static SubLObject fht_se_encoding_key_input_fn(final SubLObject v_object) {
        assert NIL != fht_serialization_entry_p(v_object) : "file_hash_table.fht_serialization_entry_p(v_object) " + "CommonSymbols.NIL != file_hash_table.fht_serialization_entry_p(v_object) " + v_object;
        return v_object.getField6();
    }

    public static SubLObject fht_se_encoding_key_output_fn(final SubLObject v_object) {
        assert NIL != fht_serialization_entry_p(v_object) : "file_hash_table.fht_serialization_entry_p(v_object) " + "CommonSymbols.NIL != file_hash_table.fht_serialization_entry_p(v_object) " + v_object;
        return v_object.getField7();
    }

    public static SubLObject _csetf_fht_se_encoding_input_fn(final SubLObject v_object, final SubLObject value) {
        assert NIL != fht_serialization_entry_p(v_object) : "file_hash_table.fht_serialization_entry_p(v_object) " + "CommonSymbols.NIL != file_hash_table.fht_serialization_entry_p(v_object) " + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_fht_se_encoding_output_fn(final SubLObject v_object, final SubLObject value) {
        assert NIL != fht_serialization_entry_p(v_object) : "file_hash_table.fht_serialization_entry_p(v_object) " + "CommonSymbols.NIL != file_hash_table.fht_serialization_entry_p(v_object) " + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_fht_se_encoding_size_fn(final SubLObject v_object, final SubLObject value) {
        assert NIL != fht_serialization_entry_p(v_object) : "file_hash_table.fht_serialization_entry_p(v_object) " + "CommonSymbols.NIL != file_hash_table.fht_serialization_entry_p(v_object) " + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_fht_se_hash_fn(final SubLObject v_object, final SubLObject value) {
        assert NIL != fht_serialization_entry_p(v_object) : "file_hash_table.fht_serialization_entry_p(v_object) " + "CommonSymbols.NIL != file_hash_table.fht_serialization_entry_p(v_object) " + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_fht_se_encoding_key_input_fn(final SubLObject v_object, final SubLObject value) {
        assert NIL != fht_serialization_entry_p(v_object) : "file_hash_table.fht_serialization_entry_p(v_object) " + "CommonSymbols.NIL != file_hash_table.fht_serialization_entry_p(v_object) " + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_fht_se_encoding_key_output_fn(final SubLObject v_object, final SubLObject value) {
        assert NIL != fht_serialization_entry_p(v_object) : "file_hash_table.fht_serialization_entry_p(v_object) " + "CommonSymbols.NIL != file_hash_table.fht_serialization_entry_p(v_object) " + v_object;
        return v_object.setField7(value);
    }

    public static SubLObject make_fht_serialization_entry(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new file_hash_table.$fht_serialization_entry_native();
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

    public static SubLObject register_fht_serialization_entry(final SubLObject serialization, final SubLObject plist) {
        final SubLObject serialization_entry = new_fht_serialization_entry(plist);
        dictionary.dictionary_enter($fht_serialization_table$.getGlobalValue(), serialization, serialization_entry);
        return serialization_entry;
    }

    public static SubLObject fht_serialization_entry(final SubLObject serialization) {
        return dictionary.dictionary_lookup($fht_serialization_table$.getGlobalValue(), serialization, UNPROVIDED);
    }

    public static SubLObject fht_serialization_encoding_input_fn(final SubLObject serialization) {
        final SubLObject serialization_entry = fht_serialization_entry(serialization);
        if (NIL != fht_serialization_entry_p(serialization_entry)) {
            return fht_se_encoding_input_fn(serialization_entry);
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

    public static SubLObject fht_serialization_encoding_size_fn(final SubLObject serialization) {
        final SubLObject serialization_entry = fht_serialization_entry(serialization);
        if (NIL != fht_serialization_entry_p(serialization_entry)) {
            return fht_se_encoding_size_fn(serialization_entry);
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

    public static SubLObject fht_serialization_encoding_key_input_fn(final SubLObject serialization) {
        final SubLObject serialization_entry = fht_serialization_entry(serialization);
        if (NIL != fht_serialization_entry_p(serialization_entry)) {
            return fht_se_encoding_key_input_fn(serialization_entry);
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

    public static SubLObject file_hash_table_open_p(final SubLObject fht) {
        assert NIL != file_hash_table_p(fht) : "file_hash_table.file_hash_table_p(fht) " + "CommonSymbols.NIL != file_hash_table.file_hash_table_p(fht) " + fht;
        return open_stream_p(file_hash_table_stream(fht));
    }

    public static SubLObject finalize_file_hash_table(final SubLObject fht) {
        assert NIL != file_hash_table_p(fht) : "file_hash_table.file_hash_table_p(fht) " + "CommonSymbols.NIL != file_hash_table.file_hash_table_p(fht) " + fht;
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

    public static SubLObject file_hash_table_count(final SubLObject fht) {
        assert NIL != file_hash_table_p(fht) : "file_hash_table.file_hash_table_p(fht) " + "CommonSymbols.NIL != file_hash_table.file_hash_table_p(fht) " + fht;
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

    public static SubLObject file_hash_table_capacity(final SubLObject fht) {
        assert NIL != file_hash_table_p(fht) : "file_hash_table.file_hash_table_p(fht) " + "CommonSymbols.NIL != file_hash_table.file_hash_table_p(fht) " + fht;
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

    public static SubLObject put_file_hash_table(final SubLObject key, final SubLObject fht, final SubLObject value) {
        assert NIL != file_hash_table_p(fht) : "file_hash_table.file_hash_table_p(fht) " + "CommonSymbols.NIL != file_hash_table.file_hash_table_p(fht) " + fht;
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

    public static SubLObject get_file_hash_table(final SubLObject key, final SubLObject fht, SubLObject default_value) {
        if (default_value == UNPROVIDED) {
            default_value = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != file_hash_table_p(fht) : "file_hash_table.file_hash_table_p(fht) " + "CommonSymbols.NIL != file_hash_table.file_hash_table_p(fht) " + fht;
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

    public static SubLObject remove_file_hash_table(final SubLObject key, final SubLObject fht) {
        assert NIL != file_hash_table_p(fht) : "file_hash_table.file_hash_table_p(fht) " + "CommonSymbols.NIL != file_hash_table.file_hash_table_p(fht) " + fht;
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

    public static SubLObject cinc_file_hash_table(final SubLObject key, final SubLObject fht, SubLObject increment, SubLObject initial_val) {
        if (increment == UNPROVIDED) {
            increment = ONE_INTEGER;
        }
        if (initial_val == UNPROVIDED) {
            initial_val = increment;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != file_hash_table_p(fht) : "file_hash_table.file_hash_table_p(fht) " + "CommonSymbols.NIL != file_hash_table.file_hash_table_p(fht) " + fht;
        final SubLObject val = get_file_hash_table(key, fht, UNPROVIDED);
        if (((NIL != val) && (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) && (!val.isNumber())) {
            Errors.error($str237$The_key__S_maps_to_the_non_numeri, key, val, fht);
        }
        return put_file_hash_table(key, fht, NIL != val ? add(val, increment) : initial_val);
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

    public static SubLObject file_hash_table_random_n(final SubLObject fht, final SubLObject n, SubLObject keys_onlyP) {
        if (keys_onlyP == UNPROVIDED) {
            keys_onlyP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != file_hash_table_p(fht) : "file_hash_table.file_hash_table_p(fht) " + "CommonSymbols.NIL != file_hash_table.file_hash_table_p(fht) " + fht;
        assert NIL != subl_promotions.non_negative_integer_p(n) : "subl_promotions.non_negative_integer_p(n) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(n) " + n;
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

    public static SubLObject new_file_hash_table_iterator(final SubLObject fht, SubLObject finalize_fhtP) {
        if (finalize_fhtP == UNPROVIDED) {
            finalize_fhtP = NIL;
        }
        assert NIL != file_hash_table_p(fht) : "file_hash_table.file_hash_table_p(fht) " + "CommonSymbols.NIL != file_hash_table.file_hash_table_p(fht) " + fht;
        return new_file_hash_table_iterator_internal(fht, NIL, finalize_fhtP);
    }

    public static SubLObject new_file_hash_table_keys_iterator(final SubLObject fht, SubLObject finalize_fhtP) {
        if (finalize_fhtP == UNPROVIDED) {
            finalize_fhtP = NIL;
        }
        assert NIL != file_hash_table_p(fht) : "file_hash_table.file_hash_table_p(fht) " + "CommonSymbols.NIL != file_hash_table.file_hash_table_p(fht) " + fht;
        return new_file_hash_table_iterator_internal(fht, T, finalize_fhtP);
    }

    public static SubLObject new_file_hash_table_values_iterator(final SubLObject fht, SubLObject finalize_fhtP) {
        if (finalize_fhtP == UNPROVIDED) {
            finalize_fhtP = NIL;
        }
        assert NIL != file_hash_table_p(fht) : "file_hash_table.file_hash_table_p(fht) " + "CommonSymbols.NIL != file_hash_table.file_hash_table_p(fht) " + fht;
        return iteration.new_iterator(make_iterator_file_hash_table_state(fht, NIL, finalize_fhtP), $sym300$ITERATE_FILE_HASH_TABLE_DONE_, ITERATE_FILE_HASH_TABLE_NEXT_VALUE, UNPROVIDED);
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

    public static SubLObject new_file_hash_table_iterator_internal(final SubLObject fht, final SubLObject keys_onlyP, final SubLObject finalize_fhtP) {
        return iteration.new_iterator(make_iterator_file_hash_table_state(fht, keys_onlyP, finalize_fhtP), $sym300$ITERATE_FILE_HASH_TABLE_DONE_, ITERATE_FILE_HASH_TABLE_NEXT, UNPROVIDED);
    }

    public static SubLObject make_iterator_file_hash_table_state(final SubLObject fht, final SubLObject keys_onlyP, final SubLObject finalize_fhtP) {
        final SubLObject current = $START;
        return list(current, fht, keys_onlyP, finalize_fhtP);
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

    public static SubLObject make_fht_iterator_next(final SubLObject keys_onlyP, final SubLObject next_key, final SubLObject next_value) {
        return NIL != keys_onlyP ? next_key : list(next_key, next_value);
    }

    public static SubLObject fht_iterator_next_value(final SubLObject next) {
        return next.isList() ? second(next) : NIL;
    }

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
        assert NIL != hash_table_p(hash_table) : "Types.hash_table_p(hash_table) " + "CommonSymbols.NIL != Types.hash_table_p(hash_table) " + hash_table;
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
        assert NIL != listp(alist) : "Types.listp(alist) " + "CommonSymbols.NIL != Types.listp(alist) " + alist;
        assert NIL != stringp(path) : "Types.stringp(path) " + "CommonSymbols.NIL != Types.stringp(path) " + path;
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

    public static SubLObject get_file_hash_table_storage_resourcing(final SubLObject fht) {
        return getf(file_hash_table_property_list(fht), $STORAGE_RESOURCING, UNPROVIDED);
    }

    public static SubLObject set_file_hash_table_storage_resourcing(final SubLObject fht, SubLObject value) {
        if (value == UNPROVIDED) {
            value = T;
        }
        _csetf_file_hash_table_property_list(fht, putf(file_hash_table_property_list(fht), $STORAGE_RESOURCING, value));
        return fht;
    }

    public static SubLObject file_hash_table_storage_resourcing_onP(final SubLObject fht) {
        return get_file_hash_table_storage_resourcing(fht);
    }

    public static SubLObject compute_fht_cache_capacity(final SubLObject size) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return max($fht_min_cache_capacity$.getDynamicValue(thread), round(multiply(divide(size, $int$100), $fht_cache_percentage$.getDynamicValue(thread)), UNPROVIDED));
    }

    public static SubLObject allocate_file_hash_table_caches(final SubLObject fht, final SubLObject capacity) {
        _csetf_file_hash_table_output_cache(fht, cache.new_cache(capacity, file_hash_table_testfn(fht)));
        return NIL;
    }

    public static SubLObject put_fht_lookaside_cache(final SubLObject fht, final SubLObject key, final SubLObject value) {
        return cache.cache_set(file_hash_table_output_cache(fht), key, value);
    }

    public static SubLObject get_fht_lookaside_cache(final SubLObject fht, final SubLObject key) {
        return cache.cache_get(file_hash_table_output_cache(fht), key);
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
        assert NIL != file_hash_table_p(fht) : "file_hash_table.file_hash_table_p(fht) " + "CommonSymbols.NIL != file_hash_table.file_hash_table_p(fht) " + fht;
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

    public static SubLObject get_file_hash_table_any(final SubLObject fht, SubLObject continuation, SubLObject key_onlyP) {
        if (continuation == UNPROVIDED) {
            continuation = NIL;
        }
        if (key_onlyP == UNPROVIDED) {
            key_onlyP = NIL;
        }
        assert NIL != file_hash_table_p(fht) : "file_hash_table.file_hash_table_p(fht) " + "CommonSymbols.NIL != file_hash_table.file_hash_table_p(fht) " + fht;
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

    public static SubLObject clear_fht_key_entry_node(final SubLObject fht, final SubLObject key_index) {
        return store_fht_key_entry(fht, key_index, construct_empty_key_entry(), UNPROVIDED);
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

    public static SubLObject decrease_fht_item_count(final SubLObject fht) {
        final SubLObject header = file_hash_table_header(fht);
        SubLObject count = htfile_header_item_count(header);
        count = subtract(count, ONE_INTEGER);
        _csetf_htfile_header_item_count(header, count);
        write_fht_header(fht);
        return fht;
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

    public static SubLObject htfile_file_block_entry_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_htfile_file_block_entry(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject htfile_file_block_entry_p(final SubLObject v_object) {
        return v_object.getClass() == file_hash_table.$htfile_file_block_entry_native.class ? T : NIL;
    }

    public static SubLObject htfile_file_block_entry_size(final SubLObject v_object) {
        assert NIL != htfile_file_block_entry_p(v_object) : "file_hash_table.htfile_file_block_entry_p(v_object) " + "CommonSymbols.NIL != file_hash_table.htfile_file_block_entry_p(v_object) " + v_object;
        return v_object.getField2();
    }

    public static SubLObject htfile_file_block_entry_next(final SubLObject v_object) {
        assert NIL != htfile_file_block_entry_p(v_object) : "file_hash_table.htfile_file_block_entry_p(v_object) " + "CommonSymbols.NIL != file_hash_table.htfile_file_block_entry_p(v_object) " + v_object;
        return v_object.getField3();
    }

    public static SubLObject _csetf_htfile_file_block_entry_size(final SubLObject v_object, final SubLObject value) {
        assert NIL != htfile_file_block_entry_p(v_object) : "file_hash_table.htfile_file_block_entry_p(v_object) " + "CommonSymbols.NIL != file_hash_table.htfile_file_block_entry_p(v_object) " + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_htfile_file_block_entry_next(final SubLObject v_object, final SubLObject value) {
        assert NIL != htfile_file_block_entry_p(v_object) : "file_hash_table.htfile_file_block_entry_p(v_object) " + "CommonSymbols.NIL != file_hash_table.htfile_file_block_entry_p(v_object) " + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject make_htfile_file_block_entry(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new file_hash_table.$htfile_file_block_entry_native();
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

    public static SubLObject new_htfile_file_block_entry(SubLObject size) {
        if (size == UNPROVIDED) {
            size = NIL;
        }
        final SubLObject file_block = make_htfile_file_block_entry(UNPROVIDED);
        _csetf_htfile_file_block_entry_size(file_block, size);
        _csetf_htfile_file_block_entry_next(file_block, ZERO_INTEGER);
        return file_block;
    }

    public static SubLObject print_htfile_file_block_entry(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        format(stream, $str340$__FILE_BLOCK_ENTRY__s__s_, htfile_file_block_entry_size(v_object), htfile_file_block_entry_next(v_object));
        return NIL;
    }

    public static SubLObject copy_file_block(final SubLObject block_1, final SubLObject block_2) {
        _csetf_htfile_file_block_entry_size(block_2, htfile_file_block_entry_size(block_1));
        _csetf_htfile_file_block_entry_next(block_2, htfile_file_block_entry_next(block_1));
        return block_2;
    }

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

    public static SubLObject write_initial_table(final SubLObject fht) {
        write_fht_header(fht);
        allocate_fht_heap_space(fht);
        allocate_fht_key_space(fht, UNPROVIDED);
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

    public static SubLObject htfile_minimal_space_required_for_key() {
        return $htfile_key_entry_size$.getGlobalValue();
    }

    public static SubLObject fht_key_index_to_reladdr(final SubLObject index) {
        return multiply(index, $htfile_key_entry_size$.getGlobalValue());
    }

    public static SubLObject fht_keyspace_byte_size(final SubLObject capacity) {
        return fht_key_index_to_reladdr(capacity);
    }

    public static SubLObject valid_heap_offset_p(final SubLObject offset, final SubLObject heap_start, final SubLObject heap_end) {
        return makeBoolean((!offset.numL(heap_start)) && offset.numL(heap_end));
    }

    public static SubLObject valid_fht_heap_offset_p(final SubLObject offset, final SubLObject fht) {
        final SubLObject header = file_hash_table_header(fht);
        return valid_heap_offset_p(offset, htfile_header_object_space_offset(header), htfile_header_key_space_offset(header));
    }

    public static SubLObject valid_offset_in_keyspace_p(final SubLObject offset, final SubLObject keyspace_offset, final SubLObject capacity) {
        return makeBoolean((!offset.numL(keyspace_offset)) && offset.numL(add(keyspace_offset, fht_keyspace_byte_size(capacity))));
    }

    public static SubLObject fht_get_keyspace_size(final SubLObject fht) {
        final SubLObject header = file_hash_table_header(fht);
        return fht_keyspace_byte_size(htfile_header_capacity(header));
    }

    public static SubLObject fht_key_reladdr_to_address(final SubLObject fht, final SubLObject reladdr) {
        return add(reladdr, htfile_header_key_space_offset(file_hash_table_header(fht)));
    }

    public static SubLObject fht_key_index_to_address(final SubLObject fht, final SubLObject index) {
        final SubLObject key_offset = fht_key_index_to_reladdr(index);
        return fht_key_reladdr_to_address(fht, key_offset);
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

    public static SubLObject write_key_entry_object(final SubLObject stream, final SubLObject key_entry) {
        write_fht_uint8(stream, htfile_key_entry_key_offset(key_entry));
        write_fht_uint4(stream, htfile_key_entry_hash_code(key_entry));
        return stream;
    }

    public static SubLObject read_key_entry_object(final SubLObject stream, final SubLObject key_entry) {
        _csetf_htfile_key_entry_key_offset(key_entry, read_fht_uint8(stream));
        _csetf_htfile_key_entry_hash_code(key_entry, read_fht_uint4(stream));
        return key_entry;
    }

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

    public static SubLObject fht_hash(final SubLObject key_code, final SubLObject fht) {
        final SubLObject capacity = htfile_header_capacity(file_hash_table_header(fht));
        final SubLObject size = subtract(capacity, ONE_INTEGER);
        return logand(multiply(key_code, $fht_hash_constant_a$.getGlobalValue()), size);
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

    public static SubLObject fht_compute_fence_post_index(SubLObject index, final SubLObject fht) {
        SubLObject capacity;
        for (capacity = htfile_header_capacity(file_hash_table_header(fht)), index = add(index, $fht_hash_step_size$.getGlobalValue()); index.numGE(capacity); index = subtract(index, capacity)) {
        }
        return index;
    }

    public static SubLObject fht_step_key_index(SubLObject index, final SubLObject fht) {
        SubLObject capacity;
        for (capacity = htfile_header_capacity(file_hash_table_header(fht)), index = subtract(index, $fht_hash_step_size$.getGlobalValue()); index.isNegative(); index = add(index, capacity)) {
        }
        return index;
    }

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

    public static SubLObject identical_fht_key_entryP(final SubLObject fht, final SubLObject key, final SubLObject code, final SubLObject key_entry, final SubLObject object_entry) {
        final SubLObject testfn = file_hash_table_testfn(fht);
        final SubLObject address = htfile_key_entry_key_offset(key_entry);
        if (!code.numE(htfile_key_entry_hash_code(key_entry))) {
            return NIL;
        }
        read_object_entry_from_space(fht, object_entry, address, $KEY_ONLY);
        return funcall(testfn, key, htfile_object_entry_key(object_entry));
    }

    public static SubLObject complete_fht_object_entry_for_key(final SubLObject fht, final SubLObject key_entry, final SubLObject object_entry, SubLObject style) {
        if (style == UNPROVIDED) {
            style = $FULL;
        }
        final SubLObject address = htfile_key_entry_key_offset(key_entry);
        read_object_entry_from_space(fht, object_entry, address, style);
        return object_entry;
    }

    public static SubLObject potentially_grow_fht_table(final SubLObject fht) {
        if (NIL != is_fht_too_smallP(fht)) {
            perform_grow_fht_table(fht);
        }
        return fht;
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

    public static SubLObject is_fht_too_smallP(final SubLObject fht) {
        final SubLObject header = file_hash_table_header(fht);
        final SubLObject count = htfile_header_item_count(header);
        final SubLObject capacity = htfile_header_capacity(header);
        return numG(count, integerDivide(multiply(capacity, $fht_dknuths_magic_cutoff$.getGlobalValue()), $int$100));
    }

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

    public static SubLObject allocate_new_fht_key_space(final SubLObject fht, final SubLObject new_keyspace, final SubLObject new_capacity) {
        final SubLObject stream = file_hash_table_stream(fht);
        file_position(stream, new_keyspace);
        allocate_fht_key_space(fht, new_capacity);
        return fht;
    }

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

    public static SubLObject handle_rehash_fht_insert(final SubLObject fht, final SubLObject status, final SubLObject index, final SubLObject key_entry, final SubLObject offset) {
        if (status != $NOT_FOUND) {
            Errors.error($str360$Internal_error__S_during_table_re, status);
        }
        _csetf_htfile_key_entry_key_offset(key_entry, offset);
        store_fht_key_entry(fht, index, key_entry, UNPROVIDED);
        return fht;
    }

    public static SubLObject htfile_minimal_space_required_for_object() {
        return $htfile_object_entry_size$.getGlobalValue();
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

    public static SubLObject compute_object_entry_size(final SubLObject object_entry, final SubLObject encoding_size_fn) {
        _csetf_htfile_object_entry_key_size(object_entry, funcall(encoding_size_fn, htfile_object_entry_key(object_entry)));
        _csetf_htfile_object_entry_data_size(object_entry, funcall(encoding_size_fn, htfile_object_entry_data(object_entry)));
        _csetf_htfile_object_entry_size(object_entry, add($htfile_object_entry_size$.getGlobalValue(), htfile_object_entry_key_size(object_entry), htfile_object_entry_data_size(object_entry)));
        return object_entry;
    }

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

    public static SubLObject store_fht_object_entry(final SubLObject fht, final SubLObject address, final SubLObject object_entry) {
        return write_object_entry_to_space(fht, object_entry, address);
    }

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

    public static SubLObject read_fht_extension_space(final SubLObject fht) {
        return fht;
    }

    public static SubLObject write_fht_extension_space(final SubLObject fht) {
        return fht;
    }

    public static SubLObject verify_version1p3_crc(final SubLObject fht) {
        return fht;
    }

    public static SubLObject read_fht_uint4(final SubLObject stream) {
        return read_byte_sequence_to_positive_integer(FOUR_INTEGER, stream, T, NIL, T);
    }

    public static SubLObject write_fht_uint4(final SubLObject stream, final SubLObject value) {
        return write_positive_integer_as_byte_sequence(value, FOUR_INTEGER, stream, T);
    }

    public static SubLObject read_fht_uint8(final SubLObject stream) {
        return read_byte_sequence_to_positive_integer(EIGHT_INTEGER, stream, T, NIL, T);
    }

    public static SubLObject write_fht_uint8(final SubLObject stream, final SubLObject value) {
        return write_positive_integer_as_byte_sequence(value, EIGHT_INTEGER, stream, T);
    }

    public static SubLObject write_null_fht_bytes(final SubLObject stream, final SubLObject count) {
        SubLObject i;
        for (i = NIL, i = ZERO_INTEGER; i.numL(count); i = add(i, ONE_INTEGER)) {
            write_byte(ZERO_INTEGER, stream);
        }
        return ZERO_INTEGER;
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

    public static SubLObject write_fht_binary_block(final SubLObject stream, final SubLObject block, final SubLObject size) {
        SubLObject i;
        for (i = NIL, i = ZERO_INTEGER; i.numL(size); i = add(i, ONE_INTEGER)) {
            write_byte(aref(block, i), stream);
        }
        force_output(stream);
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

    public static SubLObject aggressive_fast_fht_optimization_modeP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return eq($AGGRESSIVE, $fast_file_hash_table_optimization_mode$.getDynamicValue(thread));
    }

    public static SubLObject moderate_fast_fht_optimization_modeP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return eq($MODERATE, $fast_file_hash_table_optimization_mode$.getDynamicValue(thread));
    }

    public static SubLObject conservative_fast_fht_optimization_modeP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return eq($CONSERVATIVE, $fast_file_hash_table_optimization_mode$.getDynamicValue(thread));
    }

    public static SubLObject invalid_fast_fht_optimization_mode() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return Errors.error($str388$Invalid_Fast_FHT_optimization_mod, $fast_file_hash_table_optimization_mode$.getDynamicValue(thread));
    }

    public static SubLObject fast_create_fht_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject fast_create_fht_p(final SubLObject v_object) {
        return v_object.getClass() == file_hash_table.$fast_create_fht_native.class ? T : NIL;
    }

    public static SubLObject fast_create_fht_fht(final SubLObject v_object) {
        assert NIL != fast_create_fht_p(v_object) : "file_hash_table.fast_create_fht_p(v_object) " + "CommonSymbols.NIL != file_hash_table.fast_create_fht_p(v_object) " + v_object;
        return v_object.getField2();
    }

    public static SubLObject fast_create_fht_tempstem(final SubLObject v_object) {
        assert NIL != fast_create_fht_p(v_object) : "file_hash_table.fast_create_fht_p(v_object) " + "CommonSymbols.NIL != file_hash_table.fast_create_fht_p(v_object) " + v_object;
        return v_object.getField3();
    }

    public static SubLObject fast_create_fht_tempfile(final SubLObject v_object) {
        assert NIL != fast_create_fht_p(v_object) : "file_hash_table.fast_create_fht_p(v_object) " + "CommonSymbols.NIL != file_hash_table.fast_create_fht_p(v_object) " + v_object;
        return v_object.getField4();
    }

    public static SubLObject fast_create_fht_keystream(final SubLObject v_object) {
        assert NIL != fast_create_fht_p(v_object) : "file_hash_table.fast_create_fht_p(v_object) " + "CommonSymbols.NIL != file_hash_table.fast_create_fht_p(v_object) " + v_object;
        return v_object.getField5();
    }

    public static SubLObject _csetf_fast_create_fht_fht(final SubLObject v_object, final SubLObject value) {
        assert NIL != fast_create_fht_p(v_object) : "file_hash_table.fast_create_fht_p(v_object) " + "CommonSymbols.NIL != file_hash_table.fast_create_fht_p(v_object) " + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_fast_create_fht_tempstem(final SubLObject v_object, final SubLObject value) {
        assert NIL != fast_create_fht_p(v_object) : "file_hash_table.fast_create_fht_p(v_object) " + "CommonSymbols.NIL != file_hash_table.fast_create_fht_p(v_object) " + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_fast_create_fht_tempfile(final SubLObject v_object, final SubLObject value) {
        assert NIL != fast_create_fht_p(v_object) : "file_hash_table.fast_create_fht_p(v_object) " + "CommonSymbols.NIL != file_hash_table.fast_create_fht_p(v_object) " + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_fast_create_fht_keystream(final SubLObject v_object, final SubLObject value) {
        assert NIL != fast_create_fht_p(v_object) : "file_hash_table.fast_create_fht_p(v_object) " + "CommonSymbols.NIL != file_hash_table.fast_create_fht_p(v_object) " + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject make_fast_create_fht(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new file_hash_table.$fast_create_fht_native();
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

    public static SubLObject fast_create_allocate_keystream(final SubLObject fast_fht) {
        final SubLObject tempfile = file_utilities.make_prefixed_temp_filename($str413$keystream_, fast_create_fht_tempstem(fast_fht));
        final SubLObject stream = compatibility.open_binary(tempfile, $IO);
        _csetf_fast_create_fht_tempfile(fast_fht, tempfile);
        _csetf_fast_create_fht_keystream(fast_fht, stream);
        return fast_fht;
    }

    public static SubLObject fast_create_fixup_object_heap(final SubLObject fast_fht) {
        final SubLObject fht = fast_create_fht_fht(fast_fht);
        final SubLObject header = file_hash_table_header(fht);
        _csetf_htfile_header_key_space_offset(header, subtract(expt(TWO_INTEGER, multiply(EIGHT_INTEGER, EIGHT_INTEGER)), ONE_INTEGER));
        return fast_fht;
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

    public static SubLObject update_fast_fht_keystream(final SubLObject fast_fht, final SubLObject key, final SubLObject key_entry) {
        final SubLObject keystream = fast_create_fht_keystream(fast_fht);
        cfasl_output(htfile_key_entry_hash_code(key_entry), keystream);
        cfasl_output(htfile_key_entry_key_offset(key_entry), keystream);
        if (NIL == aggressive_fast_fht_optimization_modeP()) {
            cfasl_output(key, keystream);
        }
        return fast_fht;
    }

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

    public static SubLObject prepare_fast_fht_keyspace(final SubLObject fast_fht) {
        final SubLObject fht = fast_create_fht_fht(fast_fht);
        realign_fast_fht_keyspace_offset(fht);
        realign_fast_fht_keyspace_capacity(fht);
        allocate_fast_fht_keyspace(fht);
        return fast_fht;
    }

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

    public static SubLObject realign_fast_fht_keyspace_capacity(final SubLObject fht) {
        final SubLObject header = file_hash_table_header(fht);
        _csetf_htfile_header_capacity(header, fht_ensure_hash_table_size(htfile_header_item_count(header)));
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

    public static SubLObject fast_fht_keystream_sorter_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject fast_fht_keystream_sorter_p(final SubLObject v_object) {
        return v_object.getClass() == file_hash_table.$fast_fht_keystream_sorter_native.class ? T : NIL;
    }

    public static SubLObject fstfht_ksorter_tempstem(final SubLObject v_object) {
        assert NIL != fast_fht_keystream_sorter_p(v_object) : "file_hash_table.fast_fht_keystream_sorter_p(v_object) " + "CommonSymbols.NIL != file_hash_table.fast_fht_keystream_sorter_p(v_object) " + v_object;
        return v_object.getField2();
    }

    public static SubLObject fstfht_ksorter_in_files(final SubLObject v_object) {
        assert NIL != fast_fht_keystream_sorter_p(v_object) : "file_hash_table.fast_fht_keystream_sorter_p(v_object) " + "CommonSymbols.NIL != file_hash_table.fast_fht_keystream_sorter_p(v_object) " + v_object;
        return v_object.getField3();
    }

    public static SubLObject fstfht_ksorter_out_files(final SubLObject v_object) {
        assert NIL != fast_fht_keystream_sorter_p(v_object) : "file_hash_table.fast_fht_keystream_sorter_p(v_object) " + "CommonSymbols.NIL != file_hash_table.fast_fht_keystream_sorter_p(v_object) " + v_object;
        return v_object.getField4();
    }

    public static SubLObject _csetf_fstfht_ksorter_tempstem(final SubLObject v_object, final SubLObject value) {
        assert NIL != fast_fht_keystream_sorter_p(v_object) : "file_hash_table.fast_fht_keystream_sorter_p(v_object) " + "CommonSymbols.NIL != file_hash_table.fast_fht_keystream_sorter_p(v_object) " + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_fstfht_ksorter_in_files(final SubLObject v_object, final SubLObject value) {
        assert NIL != fast_fht_keystream_sorter_p(v_object) : "file_hash_table.fast_fht_keystream_sorter_p(v_object) " + "CommonSymbols.NIL != file_hash_table.fast_fht_keystream_sorter_p(v_object) " + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_fstfht_ksorter_out_files(final SubLObject v_object, final SubLObject value) {
        assert NIL != fast_fht_keystream_sorter_p(v_object) : "file_hash_table.fast_fht_keystream_sorter_p(v_object) " + "CommonSymbols.NIL != file_hash_table.fast_fht_keystream_sorter_p(v_object) " + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject make_fast_fht_keystream_sorter(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new file_hash_table.$fast_fht_keystream_sorter_native();
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

    public static SubLObject new_fast_fht_keystream_sorter(final SubLObject temp_stem) {
        final SubLObject fast_fht_sorter = make_fast_fht_keystream_sorter(UNPROVIDED);
        _csetf_fstfht_ksorter_tempstem(fast_fht_sorter, temp_stem);
        _csetf_fstfht_ksorter_in_files(fast_fht_sorter, fast_fht_n_temp_files(TWO_INTEGER, $str454$in_, temp_stem));
        _csetf_fstfht_ksorter_out_files(fast_fht_sorter, fast_fht_n_temp_files(TWO_INTEGER, $str455$out_, temp_stem));
        return fast_fht_sorter;
    }

    public static SubLObject fast_fht_n_temp_files(final SubLObject n, final SubLObject prefix, final SubLObject temp_stem) {
        SubLObject files = NIL;
        SubLObject i;
        for (i = NIL, i = ZERO_INTEGER; i.numL(n); i = add(i, ONE_INTEGER)) {
            files = cons(file_utilities.make_prefixed_temp_filename(prefix, temp_stem), files);
        }
        return files;
    }

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

    public static SubLObject fast_fht_keystream_entryL(final SubLObject entry_a, final SubLObject entry_b) {
        return eq($LT, fast_fht_keystream_entry_cmp(entry_a, entry_b));
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

    public static SubLObject is_fast_fht_keystream_chunk_separator_entryP(final SubLObject entry) {
        final SubLObject index = entry.first();
        return makeBoolean(index.isNumber() && $fast_fht_sentinel_index_value$.getGlobalValue().numE(index));
    }

    public static SubLObject is_fast_fht_keystream_eofP(final SubLObject entry) {
        return eq($EOF, entry.first());
    }

    public static SubLObject fast_fht_write_keystream_chunk_separator(final SubLObject stream) {
        final SubLObject sentinel = $fast_fht_sentinel_hashcode_value$.getGlobalValue();
        fast_fht_write_keystream_entry(stream, sentinel, sentinel, sentinel);
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

    public static SubLObject fast_fht_write_one_keystream_entry(final SubLObject stream, final SubLObject entry) {
        return fast_fht_write_keystream_entry(stream, nth(ONE_INTEGER, entry), nth(TWO_INTEGER, entry), NIL != aggressive_fast_fht_optimization_modeP() ? NIL : nth(THREE_INTEGER, entry));
    }

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

    public static SubLObject fast_fht_get_comparable_index_from_entry(final SubLObject entry) {
        SubLObject index = entry.first();
        if (!index.isNumber()) {
            index = $fast_fht_sentinel_index_value$.getGlobalValue();
        }
        return index;
    }

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

    public static SubLObject fast_fht_keystream_entry_cmp_expand_argument(final SubLObject arg) {
        if ($SENTINEL == arg) {
            return fast_fht_keystream_sentinel_entry(UNPROVIDED);
        }
        if ($EOF == arg) {
            return fast_fht_keystream_eof_entry(UNPROVIDED);
        }
        return arg;
    }

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
        assert NIL != stringp(mess) : "Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) " + mess;
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
        assert NIL != stringp(mess2) : "Types.stringp(mess2) " + "CommonSymbols.NIL != Types.stringp(mess2) " + mess2;
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

    public static SubLObject declare_file_hash_table_file() {
        declareFunction(me, "file_hash_table_print_function_trampoline", "FILE-HASH-TABLE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "file_hash_table_p", "FILE-HASH-TABLE-P", 1, 0, false);
        new file_hash_table.$file_hash_table_p$UnaryFunction();
        declareFunction(me, "file_hash_table_stream", "FILE-HASH-TABLE-STREAM", 1, 0, false);
        declareFunction(me, "file_hash_table_header", "FILE-HASH-TABLE-HEADER", 1, 0, false);
        declareFunction(me, "file_hash_table_lock", "FILE-HASH-TABLE-LOCK", 1, 0, false);
        declareFunction(me, "file_hash_table_encoding_input_fn", "FILE-HASH-TABLE-ENCODING-INPUT-FN", 1, 0, false);
        declareFunction(me, "file_hash_table_encoding_output_fn", "FILE-HASH-TABLE-ENCODING-OUTPUT-FN", 1, 0, false);
        declareFunction(me, "file_hash_table_encoding_size_fn", "FILE-HASH-TABLE-ENCODING-SIZE-FN", 1, 0, false);
        declareFunction(me, "file_hash_table_encoding_key_input_fn", "FILE-HASH-TABLE-ENCODING-KEY-INPUT-FN", 1, 0, false);
        declareFunction(me, "file_hash_table_encoding_key_output_fn", "FILE-HASH-TABLE-ENCODING-KEY-OUTPUT-FN", 1, 0, false);
        declareFunction(me, "file_hash_table_testfn", "FILE-HASH-TABLE-TESTFN", 1, 0, false);
        declareFunction(me, "file_hash_table_hash_fn", "FILE-HASH-TABLE-HASH-FN", 1, 0, false);
        declareFunction(me, "file_hash_table_input_cache", "FILE-HASH-TABLE-INPUT-CACHE", 1, 0, false);
        declareFunction(me, "file_hash_table_output_cache", "FILE-HASH-TABLE-OUTPUT-CACHE", 1, 0, false);
        declareFunction(me, "file_hash_table_property_list", "FILE-HASH-TABLE-PROPERTY-LIST", 1, 0, false);
        declareFunction(me, "_csetf_file_hash_table_stream", "_CSETF-FILE-HASH-TABLE-STREAM", 2, 0, false);
        declareFunction(me, "_csetf_file_hash_table_header", "_CSETF-FILE-HASH-TABLE-HEADER", 2, 0, false);
        declareFunction(me, "_csetf_file_hash_table_lock", "_CSETF-FILE-HASH-TABLE-LOCK", 2, 0, false);
        declareFunction(me, "_csetf_file_hash_table_encoding_input_fn", "_CSETF-FILE-HASH-TABLE-ENCODING-INPUT-FN", 2, 0, false);
        declareFunction(me, "_csetf_file_hash_table_encoding_output_fn", "_CSETF-FILE-HASH-TABLE-ENCODING-OUTPUT-FN", 2, 0, false);
        declareFunction(me, "_csetf_file_hash_table_encoding_size_fn", "_CSETF-FILE-HASH-TABLE-ENCODING-SIZE-FN", 2, 0, false);
        declareFunction(me, "_csetf_file_hash_table_encoding_key_input_fn", "_CSETF-FILE-HASH-TABLE-ENCODING-KEY-INPUT-FN", 2, 0, false);
        declareFunction(me, "_csetf_file_hash_table_encoding_key_output_fn", "_CSETF-FILE-HASH-TABLE-ENCODING-KEY-OUTPUT-FN", 2, 0, false);
        declareFunction(me, "_csetf_file_hash_table_testfn", "_CSETF-FILE-HASH-TABLE-TESTFN", 2, 0, false);
        declareFunction(me, "_csetf_file_hash_table_hash_fn", "_CSETF-FILE-HASH-TABLE-HASH-FN", 2, 0, false);
        declareFunction(me, "_csetf_file_hash_table_input_cache", "_CSETF-FILE-HASH-TABLE-INPUT-CACHE", 2, 0, false);
        declareFunction(me, "_csetf_file_hash_table_output_cache", "_CSETF-FILE-HASH-TABLE-OUTPUT-CACHE", 2, 0, false);
        declareFunction(me, "_csetf_file_hash_table_property_list", "_CSETF-FILE-HASH-TABLE-PROPERTY-LIST", 2, 0, false);
        declareFunction(me, "make_file_hash_table", "MAKE-FILE-HASH-TABLE", 0, 1, false);
        declareFunction(me, "visit_defstruct_file_hash_table", "VISIT-DEFSTRUCT-FILE-HASH-TABLE", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_file_hash_table_method", "VISIT-DEFSTRUCT-OBJECT-FILE-HASH-TABLE-METHOD", 2, 0, false);
        declareFunction(me, "describe_file_hash_table", "DESCRIBE-FILE-HASH-TABLE", 1, 1, false);
        declareFunction(me, "read_only_file_hash_table_p", "READ-ONLY-FILE-HASH-TABLE-P", 1, 0, false);
        declareFunction(me, "writeable_file_hash_table_p", "WRITEABLE-FILE-HASH-TABLE-P", 1, 0, false);
        declareFunction(me, "file_hash_table_is_read_onlyP", "FILE-HASH-TABLE-IS-READ-ONLY?", 1, 0, false);
        declareFunction(me, "file_hash_table_path", "FILE-HASH-TABLE-PATH", 1, 0, false);
        declareFunction(me, "file_hash_table_serialization", "FILE-HASH-TABLE-SERIALIZATION", 1, 0, false);
        declareFunction(me, "file_hash_table_change_stream_buffer_size", "FILE-HASH-TABLE-CHANGE-STREAM-BUFFER-SIZE", 2, 0, false);
        declareFunction(me, "file_hash_table_enable_memory_mapping", "FILE-HASH-TABLE-ENABLE-MEMORY-MAPPING", 1, 0, false);
        declareFunction(me, "file_hash_table_memory_mappedP", "FILE-HASH-TABLE-MEMORY-MAPPED?", 1, 0, false);
        declareFunction(me, "htfile_header_print_function_trampoline", "HTFILE-HEADER-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "htfile_header_p", "HTFILE-HEADER-P", 1, 0, false);
        new file_hash_table.$htfile_header_p$UnaryFunction();
        declareFunction(me, "htfile_header_size", "HTFILE-HEADER-SIZE", 1, 0, false);
        declareFunction(me, "htfile_header_version_major", "HTFILE-HEADER-VERSION-MAJOR", 1, 0, false);
        declareFunction(me, "htfile_header_version_minor", "HTFILE-HEADER-VERSION-MINOR", 1, 0, false);
        declareFunction(me, "htfile_header_object_space_offset", "HTFILE-HEADER-OBJECT-SPACE-OFFSET", 1, 0, false);
        declareFunction(me, "htfile_header_key_space_offset", "HTFILE-HEADER-KEY-SPACE-OFFSET", 1, 0, false);
        declareFunction(me, "htfile_header_current_heap_top", "HTFILE-HEADER-CURRENT-HEAP-TOP", 1, 0, false);
        declareFunction(me, "htfile_header_item_count", "HTFILE-HEADER-ITEM-COUNT", 1, 0, false);
        declareFunction(me, "htfile_header_capacity", "HTFILE-HEADER-CAPACITY", 1, 0, false);
        declareFunction(me, "htfile_header_free_list_head", "HTFILE-HEADER-FREE-LIST-HEAD", 1, 0, false);
        declareFunction(me, "htfile_header_deletion_count", "HTFILE-HEADER-DELETION-COUNT", 1, 0, false);
        declareFunction(me, "htfile_header_header_crc", "HTFILE-HEADER-HEADER-CRC", 1, 0, false);
        declareFunction(me, "htfile_header_extension_space_size", "HTFILE-HEADER-EXTENSION-SPACE-SIZE", 1, 0, false);
        declareFunction(me, "htfile_header_extension_space", "HTFILE-HEADER-EXTENSION-SPACE", 1, 0, false);
        declareFunction(me, "_csetf_htfile_header_size", "_CSETF-HTFILE-HEADER-SIZE", 2, 0, false);
        declareFunction(me, "_csetf_htfile_header_version_major", "_CSETF-HTFILE-HEADER-VERSION-MAJOR", 2, 0, false);
        declareFunction(me, "_csetf_htfile_header_version_minor", "_CSETF-HTFILE-HEADER-VERSION-MINOR", 2, 0, false);
        declareFunction(me, "_csetf_htfile_header_object_space_offset", "_CSETF-HTFILE-HEADER-OBJECT-SPACE-OFFSET", 2, 0, false);
        declareFunction(me, "_csetf_htfile_header_key_space_offset", "_CSETF-HTFILE-HEADER-KEY-SPACE-OFFSET", 2, 0, false);
        declareFunction(me, "_csetf_htfile_header_current_heap_top", "_CSETF-HTFILE-HEADER-CURRENT-HEAP-TOP", 2, 0, false);
        declareFunction(me, "_csetf_htfile_header_item_count", "_CSETF-HTFILE-HEADER-ITEM-COUNT", 2, 0, false);
        declareFunction(me, "_csetf_htfile_header_capacity", "_CSETF-HTFILE-HEADER-CAPACITY", 2, 0, false);
        declareFunction(me, "_csetf_htfile_header_free_list_head", "_CSETF-HTFILE-HEADER-FREE-LIST-HEAD", 2, 0, false);
        declareFunction(me, "_csetf_htfile_header_deletion_count", "_CSETF-HTFILE-HEADER-DELETION-COUNT", 2, 0, false);
        declareFunction(me, "_csetf_htfile_header_header_crc", "_CSETF-HTFILE-HEADER-HEADER-CRC", 2, 0, false);
        declareFunction(me, "_csetf_htfile_header_extension_space_size", "_CSETF-HTFILE-HEADER-EXTENSION-SPACE-SIZE", 2, 0, false);
        declareFunction(me, "_csetf_htfile_header_extension_space", "_CSETF-HTFILE-HEADER-EXTENSION-SPACE", 2, 0, false);
        declareFunction(me, "make_htfile_header", "MAKE-HTFILE-HEADER", 0, 1, false);
        declareFunction(me, "visit_defstruct_htfile_header", "VISIT-DEFSTRUCT-HTFILE-HEADER", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_htfile_header_method", "VISIT-DEFSTRUCT-OBJECT-HTFILE-HEADER-METHOD", 2, 0, false);
        declareFunction(me, "describe_htfile_header", "DESCRIBE-HTFILE-HEADER", 1, 1, false);
        declareFunction(me, "htfile_object_entry_print_function_trampoline", "HTFILE-OBJECT-ENTRY-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "htfile_object_entry_p", "HTFILE-OBJECT-ENTRY-P", 1, 0, false);
        new file_hash_table.$htfile_object_entry_p$UnaryFunction();
        declareFunction(me, "htfile_object_entry_size", "HTFILE-OBJECT-ENTRY-SIZE", 1, 0, false);
        declareFunction(me, "htfile_object_entry_type", "HTFILE-OBJECT-ENTRY-TYPE", 1, 0, false);
        declareFunction(me, "htfile_object_entry_key_size", "HTFILE-OBJECT-ENTRY-KEY-SIZE", 1, 0, false);
        declareFunction(me, "htfile_object_entry_key", "HTFILE-OBJECT-ENTRY-KEY", 1, 0, false);
        declareFunction(me, "htfile_object_entry_data_size", "HTFILE-OBJECT-ENTRY-DATA-SIZE", 1, 0, false);
        declareFunction(me, "htfile_object_entry_data", "HTFILE-OBJECT-ENTRY-DATA", 1, 0, false);
        declareFunction(me, "_csetf_htfile_object_entry_size", "_CSETF-HTFILE-OBJECT-ENTRY-SIZE", 2, 0, false);
        declareFunction(me, "_csetf_htfile_object_entry_type", "_CSETF-HTFILE-OBJECT-ENTRY-TYPE", 2, 0, false);
        declareFunction(me, "_csetf_htfile_object_entry_key_size", "_CSETF-HTFILE-OBJECT-ENTRY-KEY-SIZE", 2, 0, false);
        declareFunction(me, "_csetf_htfile_object_entry_key", "_CSETF-HTFILE-OBJECT-ENTRY-KEY", 2, 0, false);
        declareFunction(me, "_csetf_htfile_object_entry_data_size", "_CSETF-HTFILE-OBJECT-ENTRY-DATA-SIZE", 2, 0, false);
        declareFunction(me, "_csetf_htfile_object_entry_data", "_CSETF-HTFILE-OBJECT-ENTRY-DATA", 2, 0, false);
        declareFunction(me, "make_htfile_object_entry", "MAKE-HTFILE-OBJECT-ENTRY", 0, 1, false);
        declareFunction(me, "visit_defstruct_htfile_object_entry", "VISIT-DEFSTRUCT-HTFILE-OBJECT-ENTRY", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_htfile_object_entry_method", "VISIT-DEFSTRUCT-OBJECT-HTFILE-OBJECT-ENTRY-METHOD", 2, 0, false);
        declareFunction(me, "htfile_key_entry_print_function_trampoline", "HTFILE-KEY-ENTRY-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "htfile_key_entry_p", "HTFILE-KEY-ENTRY-P", 1, 0, false);
        new file_hash_table.$htfile_key_entry_p$UnaryFunction();
        declareFunction(me, "htfile_key_entry_key_offset", "HTFILE-KEY-ENTRY-KEY-OFFSET", 1, 0, false);
        declareFunction(me, "htfile_key_entry_hash_code", "HTFILE-KEY-ENTRY-HASH-CODE", 1, 0, false);
        declareFunction(me, "_csetf_htfile_key_entry_key_offset", "_CSETF-HTFILE-KEY-ENTRY-KEY-OFFSET", 2, 0, false);
        declareFunction(me, "_csetf_htfile_key_entry_hash_code", "_CSETF-HTFILE-KEY-ENTRY-HASH-CODE", 2, 0, false);
        declareFunction(me, "make_htfile_key_entry", "MAKE-HTFILE-KEY-ENTRY", 0, 1, false);
        declareFunction(me, "visit_defstruct_htfile_key_entry", "VISIT-DEFSTRUCT-HTFILE-KEY-ENTRY", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_htfile_key_entry_method", "VISIT-DEFSTRUCT-OBJECT-HTFILE-KEY-ENTRY-METHOD", 2, 0, false);
        declareFunction(me, "get_default_fht_test_function", "GET-DEFAULT-FHT-TEST-FUNCTION", 0, 0, false);
        declareFunction(me, "get_default_fht_serialization_protocol", "GET-DEFAULT-FHT-SERIALIZATION-PROTOCOL", 0, 0, false);
        declareFunction(me, "new_htfile_header", "NEW-HTFILE-HEADER", 0, 0, false);
        declareFunction(me, "construct_empty_htfile_header", "CONSTRUCT-EMPTY-HTFILE-HEADER", 1, 1, false);
        declareFunction(me, "htfile_scale_user_space_to_implementation_space", "HTFILE-SCALE-USER-SPACE-TO-IMPLEMENTATION-SPACE", 1, 0, false);
        declareFunction(me, "htfile_minimal_space_required", "HTFILE-MINIMAL-SPACE-REQUIRED", 0, 0, false);
        declareFunction(me, "new_file_hash_table", "NEW-FILE-HASH-TABLE", 5, 3, false);
        declareFunction(me, "new_empty_file_hash_table", "NEW-EMPTY-FILE-HASH-TABLE", 6, 4, false);
        declareFunction(me, "new_htfile_key_entry", "NEW-HTFILE-KEY-ENTRY", 1, 1, false);
        declareFunction(me, "construct_tombstone_key_entry", "CONSTRUCT-TOMBSTONE-KEY-ENTRY", 0, 0, false);
        declareFunction(me, "is_tombstoned_key_entryP", "IS-TOMBSTONED-KEY-ENTRY?", 1, 0, false);
        declareFunction(me, "construct_empty_key_entry", "CONSTRUCT-EMPTY-KEY-ENTRY", 0, 0, false);
        declareFunction(me, "is_empty_key_entryP", "IS-EMPTY-KEY-ENTRY?", 1, 0, false);
        declareFunction(me, "is_valid_key_entryP", "IS-VALID-KEY-ENTRY?", 2, 0, false);
        declareFunction(me, "fht_sxhash_for_fht", "FHT-SXHASH-FOR-FHT", 2, 0, false);
        declareFunction(me, "fht_sxhash", "FHT-SXHASH", 2, 0, false);
        declareFunction(me, "valid_hash_code_p", "VALID-HASH-CODE-P", 1, 0, false);
        declareFunction(me, "new_object_entry", "NEW-OBJECT-ENTRY", 2, 0, false);
        declareFunction(me, "fht_serialization_entry_print_function_trampoline", "FHT-SERIALIZATION-ENTRY-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "fht_serialization_entry_p", "FHT-SERIALIZATION-ENTRY-P", 1, 0, false);
        new file_hash_table.$fht_serialization_entry_p$UnaryFunction();
        declareFunction(me, "fht_se_encoding_input_fn", "FHT-SE-ENCODING-INPUT-FN", 1, 0, false);
        declareFunction(me, "fht_se_encoding_output_fn", "FHT-SE-ENCODING-OUTPUT-FN", 1, 0, false);
        declareFunction(me, "fht_se_encoding_size_fn", "FHT-SE-ENCODING-SIZE-FN", 1, 0, false);
        declareFunction(me, "fht_se_hash_fn", "FHT-SE-HASH-FN", 1, 0, false);
        declareFunction(me, "fht_se_encoding_key_input_fn", "FHT-SE-ENCODING-KEY-INPUT-FN", 1, 0, false);
        declareFunction(me, "fht_se_encoding_key_output_fn", "FHT-SE-ENCODING-KEY-OUTPUT-FN", 1, 0, false);
        declareFunction(me, "_csetf_fht_se_encoding_input_fn", "_CSETF-FHT-SE-ENCODING-INPUT-FN", 2, 0, false);
        declareFunction(me, "_csetf_fht_se_encoding_output_fn", "_CSETF-FHT-SE-ENCODING-OUTPUT-FN", 2, 0, false);
        declareFunction(me, "_csetf_fht_se_encoding_size_fn", "_CSETF-FHT-SE-ENCODING-SIZE-FN", 2, 0, false);
        declareFunction(me, "_csetf_fht_se_hash_fn", "_CSETF-FHT-SE-HASH-FN", 2, 0, false);
        declareFunction(me, "_csetf_fht_se_encoding_key_input_fn", "_CSETF-FHT-SE-ENCODING-KEY-INPUT-FN", 2, 0, false);
        declareFunction(me, "_csetf_fht_se_encoding_key_output_fn", "_CSETF-FHT-SE-ENCODING-KEY-OUTPUT-FN", 2, 0, false);
        declareFunction(me, "make_fht_serialization_entry", "MAKE-FHT-SERIALIZATION-ENTRY", 0, 1, false);
        declareFunction(me, "visit_defstruct_fht_serialization_entry", "VISIT-DEFSTRUCT-FHT-SERIALIZATION-ENTRY", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_fht_serialization_entry_method", "VISIT-DEFSTRUCT-OBJECT-FHT-SERIALIZATION-ENTRY-METHOD", 2, 0, false);
        declareFunction(me, "print_fht_serialization_entry", "PRINT-FHT-SERIALIZATION-ENTRY", 3, 0, false);
        declareFunction(me, "new_fht_serialization_entry", "NEW-FHT-SERIALIZATION-ENTRY", 1, 0, false);
        declareFunction(me, "register_fht_serialization_entry", "REGISTER-FHT-SERIALIZATION-ENTRY", 2, 0, false);
        declareFunction(me, "fht_serialization_entry", "FHT-SERIALIZATION-ENTRY", 1, 0, false);
        declareFunction(me, "fht_serialization_encoding_input_fn", "FHT-SERIALIZATION-ENCODING-INPUT-FN", 1, 0, false);
        declareFunction(me, "fht_serialization_encoding_output_fn", "FHT-SERIALIZATION-ENCODING-OUTPUT-FN", 1, 0, false);
        declareFunction(me, "fht_serialization_encoding_size_fn", "FHT-SERIALIZATION-ENCODING-SIZE-FN", 1, 0, false);
        declareFunction(me, "fht_serialization_hash_fn", "FHT-SERIALIZATION-HASH-FN", 1, 0, false);
        declareFunction(me, "fht_serialization_encoding_key_input_fn", "FHT-SERIALIZATION-ENCODING-KEY-INPUT-FN", 1, 0, false);
        declareFunction(me, "fht_serialization_encoding_key_output_fn", "FHT-SERIALIZATION-ENCODING-KEY-OUTPUT-FN", 1, 0, false);
        declareMacro(me, "do_fht_serializations", "DO-FHT-SERIALIZATIONS");
        declareFunction(me, "find_fht_serialization_by_functions", "FIND-FHT-SERIALIZATION-BY-FUNCTIONS", 4, 2, false);
        declareMacro(me, "log_fht_lookup", "LOG-FHT-LOOKUP");
        declareFunction(me, "create_file_hash_table", "CREATE-FILE-HASH-TABLE", 2, 3, false);
        declareFunction(me, "open_file_hash_table", "OPEN-FILE-HASH-TABLE", 1, 2, false);
        declareFunction(me, "open_file_hash_table_read_only", "OPEN-FILE-HASH-TABLE-READ-ONLY", 1, 2, false);
        declareFunction(me, "file_hash_table_open_p", "FILE-HASH-TABLE-OPEN-P", 1, 0, false);
        declareFunction(me, "finalize_file_hash_table", "FINALIZE-FILE-HASH-TABLE", 1, 0, false);
        declareFunction(me, "file_hash_table_count", "FILE-HASH-TABLE-COUNT", 1, 0, false);
        declareFunction(me, "file_hash_table_capacity", "FILE-HASH-TABLE-CAPACITY", 1, 0, false);
        declareFunction(me, "put_file_hash_table", "PUT-FILE-HASH-TABLE", 3, 0, false);
        declareFunction(me, "get_file_hash_table", "GET-FILE-HASH-TABLE", 2, 1, false);
        declareFunction(me, "remove_file_hash_table", "REMOVE-FILE-HASH-TABLE", 2, 0, false);
        declareFunction(me, "cinc_file_hash_table", "CINC-FILE-HASH-TABLE", 2, 2, false);
        declareMacro(me, "dosome_file_hash_table", "DOSOME-FILE-HASH-TABLE");
        declareMacro(me, "dosome_pristine_file_hash_table", "DOSOME-PRISTINE-FILE-HASH-TABLE");
        declareMacro(me, "do_file_hash_table", "DO-FILE-HASH-TABLE");
        declareMacro(me, "do_pristine_file_hash_table", "DO-PRISTINE-FILE-HASH-TABLE");
        declareFunction(me, "print_file_hash_table_contents", "PRINT-FILE-HASH-TABLE-CONTENTS", 1, 0, false);
        declareMacro(me, "progress_do_file_hash_table", "PROGRESS-DO-FILE-HASH-TABLE");
        declareMacro(me, "dosome_file_hash_table_keys", "DOSOME-FILE-HASH-TABLE-KEYS");
        declareMacro(me, "do_file_hash_table_keys", "DO-FILE-HASH-TABLE-KEYS");
        declareMacro(me, "do_pristine_file_hash_table_keys", "DO-PRISTINE-FILE-HASH-TABLE-KEYS");
        declareMacro(me, "progress_do_file_hash_table_keys", "PROGRESS-DO-FILE-HASH-TABLE-KEYS");
        declareFunction(me, "file_hash_table_keys", "FILE-HASH-TABLE-KEYS", 1, 0, false);
        declareFunction(me, "file_hash_table_random_n", "FILE-HASH-TABLE-RANDOM-N", 2, 1, false);
        declareFunction(me, "validate_file_hash_table", "VALIDATE-FILE-HASH-TABLE", 1, 1, false);
        declareFunction(me, "recover_file_hash_table_heap", "RECOVER-FILE-HASH-TABLE-HEAP", 1, 1, false);
        declareFunction(me, "new_file_hash_table_iterator", "NEW-FILE-HASH-TABLE-ITERATOR", 1, 1, false);
        declareFunction(me, "new_file_hash_table_keys_iterator", "NEW-FILE-HASH-TABLE-KEYS-ITERATOR", 1, 1, false);
        declareFunction(me, "new_file_hash_table_values_iterator", "NEW-FILE-HASH-TABLE-VALUES-ITERATOR", 1, 1, false);
        declareFunction(me, "iterate_file_hash_table_next_value", "ITERATE-FILE-HASH-TABLE-NEXT-VALUE", 1, 0, false);
        declareFunction(me, "new_file_hash_table_iterator_internal", "NEW-FILE-HASH-TABLE-ITERATOR-INTERNAL", 3, 0, false);
        declareFunction(me, "make_iterator_file_hash_table_state", "MAKE-ITERATOR-FILE-HASH-TABLE-STATE", 3, 0, false);
        declareFunction(me, "iterate_file_hash_table_doneP", "ITERATE-FILE-HASH-TABLE-DONE?", 1, 0, false);
        declareFunction(me, "iterate_file_hash_table_next", "ITERATE-FILE-HASH-TABLE-NEXT", 1, 0, false);
        declareFunction(me, "make_fht_iterator_next", "MAKE-FHT-ITERATOR-NEXT", 3, 0, false);
        declareFunction(me, "fht_iterator_next_value", "FHT-ITERATOR-NEXT-VALUE", 1, 0, false);
        declareFunction(me, "file_hash_table_to_alist", "FILE-HASH-TABLE-TO-ALIST", 1, 0, false);
        declareFunction(me, "hash_table_to_file_hash_table", "HASH-TABLE-TO-FILE-HASH-TABLE", 2, 4, false);
        declareFunction(me, "alist_to_file_hash_table", "ALIST-TO-FILE-HASH-TABLE", 2, 3, false);
        declareFunction(me, "file_hash_table_copy", "FILE-HASH-TABLE-COPY", 2, 5, false);
        declareFunction(me, "get_file_hash_table_storage_resourcing", "GET-FILE-HASH-TABLE-STORAGE-RESOURCING", 1, 0, false);
        declareFunction(me, "set_file_hash_table_storage_resourcing", "SET-FILE-HASH-TABLE-STORAGE-RESOURCING", 1, 1, false);
        declareFunction(me, "file_hash_table_storage_resourcing_onP", "FILE-HASH-TABLE-STORAGE-RESOURCING-ON?", 1, 0, false);
        declareFunction(me, "compute_fht_cache_capacity", "COMPUTE-FHT-CACHE-CAPACITY", 1, 0, false);
        declareFunction(me, "allocate_file_hash_table_caches", "ALLOCATE-FILE-HASH-TABLE-CACHES", 2, 0, false);
        declareFunction(me, "put_fht_lookaside_cache", "PUT-FHT-LOOKASIDE-CACHE", 3, 0, false);
        declareFunction(me, "get_fht_lookaside_cache", "GET-FHT-LOOKASIDE-CACHE", 2, 0, false);
        declareFunction(me, "remove_fht_lookaside_cache", "REMOVE-FHT-LOOKASIDE-CACHE", 2, 0, false);
        declareFunction(me, "get_pristine_file_hash_table_any", "GET-PRISTINE-FILE-HASH-TABLE-ANY", 1, 2, false);
        declareFunction(me, "get_file_hash_table_any", "GET-FILE-HASH-TABLE-ANY", 1, 2, false);
        declareFunction(me, "perform_fht_put", "PERFORM-FHT-PUT", 3, 0, false);
        declareFunction(me, "perform_fht_put_insert", "PERFORM-FHT-PUT-INSERT", 6, 1, false);
        declareFunction(me, "perform_fht_put_replace", "PERFORM-FHT-PUT-REPLACE", 6, 0, false);
        declareFunction(me, "perform_fht_remove", "PERFORM-FHT-REMOVE", 2, 0, false);
        declareFunction(me, "perform_fht_remove_int", "PERFORM-FHT-REMOVE-INT", 4, 0, false);
        declareFunction(me, "clear_fht_key_entry_node", "CLEAR-FHT-KEY-ENTRY-NODE", 2, 0, false);
        declareFunction(me, "fht_fill_key_entry_gap", "FHT-FILL-KEY-ENTRY-GAP", 2, 0, false);
        declareFunction(me, "fht_lookup_key_index_only", "FHT-LOOKUP-KEY-INDEX-ONLY", 3, 0, false);
        declareFunction(me, "increase_fht_item_count", "INCREASE-FHT-ITEM-COUNT", 1, 1, false);
        declareFunction(me, "decrease_fht_item_count", "DECREASE-FHT-ITEM-COUNT", 1, 0, false);
        declareFunction(me, "perform_fht_get", "PERFORM-FHT-GET", 2, 0, false);
        declareFunction(me, "htfile_file_block_entry_print_function_trampoline", "HTFILE-FILE-BLOCK-ENTRY-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "htfile_file_block_entry_p", "HTFILE-FILE-BLOCK-ENTRY-P", 1, 0, false);
        new file_hash_table.$htfile_file_block_entry_p$UnaryFunction();
        declareFunction(me, "htfile_file_block_entry_size", "HTFILE-FILE-BLOCK-ENTRY-SIZE", 1, 0, false);
        declareFunction(me, "htfile_file_block_entry_next", "HTFILE-FILE-BLOCK-ENTRY-NEXT", 1, 0, false);
        declareFunction(me, "_csetf_htfile_file_block_entry_size", "_CSETF-HTFILE-FILE-BLOCK-ENTRY-SIZE", 2, 0, false);
        declareFunction(me, "_csetf_htfile_file_block_entry_next", "_CSETF-HTFILE-FILE-BLOCK-ENTRY-NEXT", 2, 0, false);
        declareFunction(me, "make_htfile_file_block_entry", "MAKE-HTFILE-FILE-BLOCK-ENTRY", 0, 1, false);
        declareFunction(me, "visit_defstruct_htfile_file_block_entry", "VISIT-DEFSTRUCT-HTFILE-FILE-BLOCK-ENTRY", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_htfile_file_block_entry_method", "VISIT-DEFSTRUCT-OBJECT-HTFILE-FILE-BLOCK-ENTRY-METHOD", 2, 0, false);
        declareFunction(me, "new_htfile_file_block_entry", "NEW-HTFILE-FILE-BLOCK-ENTRY", 0, 1, false);
        declareFunction(me, "print_htfile_file_block_entry", "PRINT-HTFILE-FILE-BLOCK-ENTRY", 3, 0, false);
        declareFunction(me, "copy_file_block", "COPY-FILE-BLOCK", 2, 0, false);
        declareFunction(me, "write_file_block_entry_to_space", "WRITE-FILE-BLOCK-ENTRY-TO-SPACE", 3, 0, false);
        declareFunction(me, "read_file_block_entry_from_space", "READ-FILE-BLOCK-ENTRY-FROM-SPACE", 3, 0, false);
        declareFunction(me, "deallocate_object_space", "DEALLOCATE-OBJECT-SPACE", 3, 0, false);
        declareFunction(me, "insert_file_block_in_free_list", "INSERT-FILE-BLOCK-IN-FREE-LIST", 4, 0, false);
        declareFunction(me, "allocate_object_space_from_free_list", "ALLOCATE-OBJECT-SPACE-FROM-FREE-LIST", 2, 0, false);
        declareFunction(me, "write_initial_table", "WRITE-INITIAL-TABLE", 1, 0, false);
        declareFunction(me, "allocate_fht_heap_space", "ALLOCATE-FHT-HEAP-SPACE", 1, 0, false);
        declareFunction(me, "allocate_fht_key_space", "ALLOCATE-FHT-KEY-SPACE", 1, 1, false);
        declareFunction(me, "htfile_minimal_space_required_for_key", "HTFILE-MINIMAL-SPACE-REQUIRED-FOR-KEY", 0, 0, false);
        declareFunction(me, "fht_key_index_to_reladdr", "FHT-KEY-INDEX-TO-RELADDR", 1, 0, false);
        declareFunction(me, "fht_keyspace_byte_size", "FHT-KEYSPACE-BYTE-SIZE", 1, 0, false);
        declareFunction(me, "valid_heap_offset_p", "VALID-HEAP-OFFSET-P", 3, 0, false);
        declareFunction(me, "valid_fht_heap_offset_p", "VALID-FHT-HEAP-OFFSET-P", 2, 0, false);
        declareFunction(me, "valid_offset_in_keyspace_p", "VALID-OFFSET-IN-KEYSPACE-P", 3, 0, false);
        declareFunction(me, "fht_get_keyspace_size", "FHT-GET-KEYSPACE-SIZE", 1, 0, false);
        declareFunction(me, "fht_key_reladdr_to_address", "FHT-KEY-RELADDR-TO-ADDRESS", 2, 0, false);
        declareFunction(me, "fht_key_index_to_address", "FHT-KEY-INDEX-TO-ADDRESS", 2, 0, false);
        declareFunction(me, "validate_fht_key_index", "VALIDATE-FHT-KEY-INDEX", 2, 0, false);
        declareFunction(me, "validate_fht_key_entry", "VALIDATE-FHT-KEY-ENTRY", 2, 0, false);
        declareFunction(me, "write_key_entry_object", "WRITE-KEY-ENTRY-OBJECT", 2, 0, false);
        declareFunction(me, "read_key_entry_object", "READ-KEY-ENTRY-OBJECT", 2, 0, false);
        declareFunction(me, "fetch_fht_key_entry", "FETCH-FHT-KEY-ENTRY", 3, 0, false);
        declareFunction(me, "store_fht_key_entry", "STORE-FHT-KEY-ENTRY", 3, 1, false);
        declareFunction(me, "fht_hash", "FHT-HASH", 2, 0, false);
        declareFunction(me, "fht_ensure_hash_table_size", "FHT-ENSURE-HASH-TABLE-SIZE", 1, 0, false);
        declareFunction(me, "fht_compute_fence_post_index", "FHT-COMPUTE-FENCE-POST-INDEX", 2, 0, false);
        declareFunction(me, "fht_step_key_index", "FHT-STEP-KEY-INDEX", 2, 0, false);
        declareFunction(me, "fht_lookup_key", "FHT-LOOKUP-KEY", 2, 1, false);
        declareFunction(me, "identical_fht_key_entryP", "IDENTICAL-FHT-KEY-ENTRY?", 5, 0, false);
        declareFunction(me, "complete_fht_object_entry_for_key", "COMPLETE-FHT-OBJECT-ENTRY-FOR-KEY", 3, 1, false);
        declareFunction(me, "potentially_grow_fht_table", "POTENTIALLY-GROW-FHT-TABLE", 1, 0, false);
        declareFunction(me, "perform_grow_fht_table", "PERFORM-GROW-FHT-TABLE", 1, 0, false);
        declareFunction(me, "is_fht_too_smallP", "IS-FHT-TOO-SMALL?", 1, 0, false);
        declareFunction(me, "resize_fht_object_and_key_spaces", "RESIZE-FHT-OBJECT-AND-KEY-SPACES", 1, 0, false);
        declareFunction(me, "allocate_new_fht_key_space", "ALLOCATE-NEW-FHT-KEY-SPACE", 3, 0, false);
        declareFunction(me, "move_htfile_key_space", "MOVE-HTFILE-KEY-SPACE", 3, 0, false);
        declareFunction(me, "rehash_fht_key_space", "REHASH-FHT-KEY-SPACE", 3, 0, false);
        declareMacro(me, "with_different_keyspace", "WITH-DIFFERENT-KEYSPACE");
        declareFunction(me, "rehash_fht_cached_keys", "REHASH-FHT-CACHED-KEYS", 6, 0, false);
        declareFunction(me, "handle_rehash_fht_insert", "HANDLE-REHASH-FHT-INSERT", 5, 0, false);
        declareFunction(me, "htfile_minimal_space_required_for_object", "HTFILE-MINIMAL-SPACE-REQUIRED-FOR-OBJECT", 0, 0, false);
        declareFunction(me, "specify_object_entry", "SPECIFY-OBJECT-ENTRY", 3, 1, false);
        declareFunction(me, "compute_object_entry_size", "COMPUTE-OBJECT-ENTRY-SIZE", 2, 0, false);
        declareFunction(me, "allocate_object_space", "ALLOCATE-OBJECT-SPACE", 2, 0, false);
        declareFunction(me, "store_fht_object_entry", "STORE-FHT-OBJECT-ENTRY", 3, 0, false);
        declareFunction(me, "write_object_entry_to_space", "WRITE-OBJECT-ENTRY-TO-SPACE", 3, 0, false);
        declareFunction(me, "read_object_entry_from_space", "READ-OBJECT-ENTRY-FROM-SPACE", 3, 1, false);
        declareFunction(me, "increase_htfile_heap_size", "INCREASE-HTFILE-HEAP-SIZE", 2, 0, false);
        declareFunction(me, "compute_new_htfile_heap_size", "COMPUTE-NEW-HTFILE-HEAP-SIZE", 1, 1, false);
        declareMacro(me, "register_file_table_header_support", "REGISTER-FILE-TABLE-HEADER-SUPPORT");
        declareFunction(me, "read_fht_header", "READ-FHT-HEADER", 1, 0, false);
        declareFunction(me, "write_fht_header", "WRITE-FHT-HEADER", 1, 0, false);
        declareFunction(me, "read_fht_header_version1p3", "READ-FHT-HEADER-VERSION1P3", 1, 0, false);
        declareFunction(me, "write_fht_header_version1p3", "WRITE-FHT-HEADER-VERSION1P3", 1, 0, false);
        declareFunction(me, "read_fht_extension_space", "READ-FHT-EXTENSION-SPACE", 1, 0, false);
        declareFunction(me, "write_fht_extension_space", "WRITE-FHT-EXTENSION-SPACE", 1, 0, false);
        declareFunction(me, "verify_version1p3_crc", "VERIFY-VERSION1P3-CRC", 1, 0, false);
        declareFunction(me, "read_fht_uint4", "READ-FHT-UINT4", 1, 0, false);
        declareFunction(me, "write_fht_uint4", "WRITE-FHT-UINT4", 2, 0, false);
        declareFunction(me, "read_fht_uint8", "READ-FHT-UINT8", 1, 0, false);
        declareFunction(me, "write_fht_uint8", "WRITE-FHT-UINT8", 2, 0, false);
        declareFunction(me, "write_null_fht_bytes", "WRITE-NULL-FHT-BYTES", 2, 0, false);
        declareFunction(me, "read_fht_encoded_object", "READ-FHT-ENCODED-OBJECT", 2, 0, false);
        declareFunction(me, "write_fht_encoded_object", "WRITE-FHT-ENCODED-OBJECT", 4, 0, false);
        declareFunction(me, "read_fht_binary_block", "READ-FHT-BINARY-BLOCK", 3, 0, false);
        declareFunction(me, "write_fht_binary_block", "WRITE-FHT-BINARY-BLOCK", 3, 0, false);
        declareFunction(me, "move_fht_binary_block", "MOVE-FHT-BINARY-BLOCK", 5, 0, false);
        declareFunction(me, "aggressive_fast_fht_optimization_modeP", "AGGRESSIVE-FAST-FHT-OPTIMIZATION-MODE?", 0, 0, false);
        declareFunction(me, "moderate_fast_fht_optimization_modeP", "MODERATE-FAST-FHT-OPTIMIZATION-MODE?", 0, 0, false);
        declareFunction(me, "conservative_fast_fht_optimization_modeP", "CONSERVATIVE-FAST-FHT-OPTIMIZATION-MODE?", 0, 0, false);
        declareFunction(me, "invalid_fast_fht_optimization_mode", "INVALID-FAST-FHT-OPTIMIZATION-MODE", 0, 0, false);
        declareFunction(me, "fast_create_fht_print_function_trampoline", "FAST-CREATE-FHT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "fast_create_fht_p", "FAST-CREATE-FHT-P", 1, 0, false);
        new file_hash_table.$fast_create_fht_p$UnaryFunction();
        declareFunction(me, "fast_create_fht_fht", "FAST-CREATE-FHT-FHT", 1, 0, false);
        declareFunction(me, "fast_create_fht_tempstem", "FAST-CREATE-FHT-TEMPSTEM", 1, 0, false);
        declareFunction(me, "fast_create_fht_tempfile", "FAST-CREATE-FHT-TEMPFILE", 1, 0, false);
        declareFunction(me, "fast_create_fht_keystream", "FAST-CREATE-FHT-KEYSTREAM", 1, 0, false);
        declareFunction(me, "_csetf_fast_create_fht_fht", "_CSETF-FAST-CREATE-FHT-FHT", 2, 0, false);
        declareFunction(me, "_csetf_fast_create_fht_tempstem", "_CSETF-FAST-CREATE-FHT-TEMPSTEM", 2, 0, false);
        declareFunction(me, "_csetf_fast_create_fht_tempfile", "_CSETF-FAST-CREATE-FHT-TEMPFILE", 2, 0, false);
        declareFunction(me, "_csetf_fast_create_fht_keystream", "_CSETF-FAST-CREATE-FHT-KEYSTREAM", 2, 0, false);
        declareFunction(me, "make_fast_create_fht", "MAKE-FAST-CREATE-FHT", 0, 1, false);
        declareFunction(me, "visit_defstruct_fast_create_fht", "VISIT-DEFSTRUCT-FAST-CREATE-FHT", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_fast_create_fht_method", "VISIT-DEFSTRUCT-OBJECT-FAST-CREATE-FHT-METHOD", 2, 0, false);
        declareFunction(me, "fast_create_file_hash_table", "FAST-CREATE-FILE-HASH-TABLE", 1, 3, false);
        declareFunction(me, "fast_create_allocate_keystream", "FAST-CREATE-ALLOCATE-KEYSTREAM", 1, 0, false);
        declareFunction(me, "fast_create_fixup_object_heap", "FAST-CREATE-FIXUP-OBJECT-HEAP", 1, 0, false);
        declareFunction(me, "fast_put_file_hash_table", "FAST-PUT-FILE-HASH-TABLE", 3, 0, false);
        declareFunction(me, "perform_fast_fht_put", "PERFORM-FAST-FHT-PUT", 3, 0, false);
        declareFunction(me, "update_fast_fht_keystream", "UPDATE-FAST-FHT-KEYSTREAM", 3, 0, false);
        declareFunction(me, "finalize_fast_create_file_hash_table", "FINALIZE-FAST-CREATE-FILE-HASH-TABLE", 1, 2, false);
        declareFunction(me, "prepare_fast_fht_keyspace", "PREPARE-FAST-FHT-KEYSPACE", 1, 0, false);
        declareFunction(me, "realign_fast_fht_keyspace_offset", "REALIGN-FAST-FHT-KEYSPACE-OFFSET", 1, 0, false);
        declareFunction(me, "realign_fast_fht_keyspace_capacity", "REALIGN-FAST-FHT-KEYSPACE-CAPACITY", 1, 0, false);
        declareFunction(me, "allocate_fast_fht_keyspace", "ALLOCATE-FAST-FHT-KEYSPACE", 1, 0, false);
        declareFunction(me, "insert_fast_fht_keystream_content", "INSERT-FAST-FHT-KEYSTREAM-CONTENT", 1, 2, false);
        declareFunction(me, "perform_fast_fht_insert_of_unambiguous_keys", "PERFORM-FAST-FHT-INSERT-OF-UNAMBIGUOUS-KEYS", 2, 0, false);
        declareFunction(me, "perform_fast_fht_insert_by_keystream_ordering", "PERFORM-FAST-FHT-INSERT-BY-KEYSTREAM-ORDERING", 4, 0, false);
        declareFunction(me, "shutdown_fast_create_fht", "SHUTDOWN-FAST-CREATE-FHT", 1, 1, false);
        declareFunction(me, "fast_fht_keystream_sorter_print_function_trampoline", "FAST-FHT-KEYSTREAM-SORTER-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "fast_fht_keystream_sorter_p", "FAST-FHT-KEYSTREAM-SORTER-P", 1, 0, false);
        new file_hash_table.$fast_fht_keystream_sorter_p$UnaryFunction();
        declareFunction(me, "fstfht_ksorter_tempstem", "FSTFHT-KSORTER-TEMPSTEM", 1, 0, false);
        declareFunction(me, "fstfht_ksorter_in_files", "FSTFHT-KSORTER-IN-FILES", 1, 0, false);
        declareFunction(me, "fstfht_ksorter_out_files", "FSTFHT-KSORTER-OUT-FILES", 1, 0, false);
        declareFunction(me, "_csetf_fstfht_ksorter_tempstem", "_CSETF-FSTFHT-KSORTER-TEMPSTEM", 2, 0, false);
        declareFunction(me, "_csetf_fstfht_ksorter_in_files", "_CSETF-FSTFHT-KSORTER-IN-FILES", 2, 0, false);
        declareFunction(me, "_csetf_fstfht_ksorter_out_files", "_CSETF-FSTFHT-KSORTER-OUT-FILES", 2, 0, false);
        declareFunction(me, "make_fast_fht_keystream_sorter", "MAKE-FAST-FHT-KEYSTREAM-SORTER", 0, 1, false);
        declareFunction(me, "visit_defstruct_fast_fht_keystream_sorter", "VISIT-DEFSTRUCT-FAST-FHT-KEYSTREAM-SORTER", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_fast_fht_keystream_sorter_method", "VISIT-DEFSTRUCT-OBJECT-FAST-FHT-KEYSTREAM-SORTER-METHOD", 2, 0, false);
        declareFunction(me, "fast_fht_sort_keystream_by_expected_index", "FAST-FHT-SORT-KEYSTREAM-BY-EXPECTED-INDEX", 3, 2, false);
        declareFunction(me, "new_fast_fht_keystream_sorter", "NEW-FAST-FHT-KEYSTREAM-SORTER", 1, 0, false);
        declareFunction(me, "fast_fht_n_temp_files", "FAST-FHT-N-TEMP-FILES", 3, 0, false);
        declareFunction(me, "fast_fht_split_keystream_into_tiled_input_files", "FAST-FHT-SPLIT-KEYSTREAM-INTO-TILED-INPUT-FILES", 3, 0, false);
        declareFunction(me, "fast_fht_read_one_keystream_entry", "FAST-FHT-READ-ONE-KEYSTREAM-ENTRY", 2, 1, false);
        declareFunction(me, "fast_fht_keystream_sentinel_entry", "FAST-FHT-KEYSTREAM-SENTINEL-ENTRY", 0, 1, false);
        declareFunction(me, "fast_fht_keystream_eof_entry", "FAST-FHT-KEYSTREAM-EOF-ENTRY", 0, 1, false);
        declareFunction(me, "fast_fht_keystream_entry_cmp", "FAST-FHT-KEYSTREAM-ENTRY-CMP", 2, 0, false);
        declareFunction(me, "fast_fht_keystream_entryL", "FAST-FHT-KEYSTREAM-ENTRY<", 2, 0, false);
        declareFunction(me, "fast_fht_write_one_keystream_tile", "FAST-FHT-WRITE-ONE-KEYSTREAM-TILE", 2, 0, false);
        declareFunction(me, "is_fast_fht_keystream_chunk_separator_entryP", "IS-FAST-FHT-KEYSTREAM-CHUNK-SEPARATOR-ENTRY?", 1, 0, false);
        declareFunction(me, "is_fast_fht_keystream_eofP", "IS-FAST-FHT-KEYSTREAM-EOF?", 1, 0, false);
        declareFunction(me, "fast_fht_write_keystream_chunk_separator", "FAST-FHT-WRITE-KEYSTREAM-CHUNK-SEPARATOR", 1, 0, false);
        declareFunction(me, "fast_fht_write_keystream_entry", "FAST-FHT-WRITE-KEYSTREAM-ENTRY", 3, 1, false);
        declareFunction(me, "fast_fht_write_one_keystream_entry", "FAST-FHT-WRITE-ONE-KEYSTREAM-ENTRY", 2, 0, false);
        declareFunction(me, "fast_fht_write_one_collision_stream_entry", "FAST-FHT-WRITE-ONE-COLLISION-STREAM-ENTRY", 3, 0, false);
        declareFunction(me, "fast_fht_almost_merge_sort_keystream", "FAST-FHT-ALMOST-MERGE-SORT-KEYSTREAM", 2, 1, false);
        declareFunction(me, "fast_fht_merge_keystream_input_files", "FAST-FHT-MERGE-KEYSTREAM-INPUT-FILES", 3, 0, false);
        declareFunction(me, "fast_fht_merge_keystream_chunks", "FAST-FHT-MERGE-KEYSTREAM-CHUNKS", 4, 0, false);
        declareMacro(me, "fast_fht_drain_index_run", "FAST-FHT-DRAIN-INDEX-RUN");
        declareMacro(me, "fast_fht_manage_index_collisions", "FAST-FHT-MANAGE-INDEX-COLLISIONS");
        declareFunction(me, "fast_fht_uniquify_keystream", "FAST-FHT-UNIQUIFY-KEYSTREAM", 2, 0, false);
        declareFunction(me, "fast_fht_get_comparable_index_from_entry", "FAST-FHT-GET-COMPARABLE-INDEX-FROM-ENTRY", 1, 0, false);
        declareFunction(me, "fast_fht_dump_keystream", "FAST-FHT-DUMP-KEYSTREAM", 2, 1, false);
        declareFunction(me, "fast_fht_dump_keystream_files", "FAST-FHT-DUMP-KEYSTREAM-FILES", 2, 1, false);
        declareFunction(me, "enforce_valid_fast_fht_dump_keystream_files", "ENFORCE-VALID-FAST-FHT-DUMP-KEYSTREAM-FILES", 2, 0, false);
        declareFunction(me, "validate_fast_fht_dump_keystream", "VALIDATE-FAST-FHT-DUMP-KEYSTREAM", 2, 0, false);
        declareFunction(me, "test_fast_fht_keystream_entry_cmp", "TEST-FAST-FHT-KEYSTREAM-ENTRY-CMP", 2, 0, false);
        declareFunction(me, "fast_fht_keystream_entry_cmp_expand_argument", "FAST-FHT-KEYSTREAM-ENTRY-CMP-EXPAND-ARGUMENT", 1, 0, false);
        declareMacro(me, "with_input_file_hash_table", "WITH-INPUT-FILE-HASH-TABLE");
        declareMacro(me, "with_writable_file_hash_table", "WITH-WRITABLE-FILE-HASH-TABLE");
        declareMacro(me, "with_output_file_hash_table", "WITH-OUTPUT-FILE-HASH-TABLE");
        declareMacro(me, "with_fast_create_file_hash_table", "WITH-FAST-CREATE-FILE-HASH-TABLE");
        declareFunction(me, "test_fast_fht_creation_with_merge_sorted_keystream", "TEST-FAST-FHT-CREATION-WITH-MERGE-SORTED-KEYSTREAM", 3, 0, false);
        declareFunction(me, "test_fast_fht_creation_with_map_contents", "TEST-FAST-FHT-CREATION-WITH-MAP-CONTENTS", 1, 2, false);
        declareFunction(me, "test_fast_fht_with_kb_contents", "TEST-FAST-FHT-WITH-KB-CONTENTS", 4, 3, false);
        declareFunction(me, "test_ffhtkb_generate_constant_info", "TEST-FFHTKB-GENERATE-CONSTANT-INFO", 0, 0, false);
        declareFunction(me, "test_ffhtkb_grab_constant_key_info", "TEST-FFHTKB-GRAB-CONSTANT-KEY-INFO", 1, 0, false);
        declareFunction(me, "test_ffhtkb_grab_constant_value_info", "TEST-FFHTKB-GRAB-CONSTANT-VALUE-INFO", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_file_hash_table_file() {
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

    public static SubLObject setup_file_hash_table_file() {
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
            this.$stream = Lisp.NIL;
            this.$header = Lisp.NIL;
            this.$lock = Lisp.NIL;
            this.$encoding_input_fn = Lisp.NIL;
            this.$encoding_output_fn = Lisp.NIL;
            this.$encoding_size_fn = Lisp.NIL;
            this.$encoding_key_input_fn = Lisp.NIL;
            this.$encoding_key_output_fn = Lisp.NIL;
            this.$testfn = Lisp.NIL;
            this.$hash_fn = Lisp.NIL;
            this.$input_cache = Lisp.NIL;
            this.$output_cache = Lisp.NIL;
            this.$property_list = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
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
            structDecl = makeStructDeclNative(file_hash_table.$file_hash_table_native.class, FILE_HASH_TABLE, FILE_HASH_TABLE_P, $list2, $list3, new String[]{ "$stream", "$header", "$lock", "$encoding_input_fn", "$encoding_output_fn", "$encoding_size_fn", "$encoding_key_input_fn", "$encoding_key_output_fn", "$testfn", "$hash_fn", "$input_cache", "$output_cache", "$property_list" }, $list4, $list5, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static final class $file_hash_table_p$UnaryFunction extends UnaryFunction {
        public $file_hash_table_p$UnaryFunction() {
            super(extractFunctionNamed("FILE-HASH-TABLE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return file_hash_table_p(arg1);
        }
    }

    public static final class $htfile_header_native extends SubLStructNative {
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
            this.$size = Lisp.NIL;
            this.$version_major = Lisp.NIL;
            this.$version_minor = Lisp.NIL;
            this.$object_space_offset = Lisp.NIL;
            this.$key_space_offset = Lisp.NIL;
            this.$current_heap_top = Lisp.NIL;
            this.$item_count = Lisp.NIL;
            this.$capacity = Lisp.NIL;
            this.$free_list_head = Lisp.NIL;
            this.$deletion_count = Lisp.NIL;
            this.$header_crc = Lisp.NIL;
            this.$extension_space_size = Lisp.NIL;
            this.$extension_space = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
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
            structDecl = makeStructDeclNative(file_hash_table.$htfile_header_native.class, HTFILE_HEADER, HTFILE_HEADER_P, $list63, $list64, new String[]{ "$size", "$version_major", "$version_minor", "$object_space_offset", "$key_space_offset", "$current_heap_top", "$item_count", "$capacity", "$free_list_head", "$deletion_count", "$header_crc", "$extension_space_size", "$extension_space" }, $list65, $list66, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static final class $htfile_header_p$UnaryFunction extends UnaryFunction {
        public $htfile_header_p$UnaryFunction() {
            super(extractFunctionNamed("HTFILE-HEADER-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return htfile_header_p(arg1);
        }
    }

    public static final class $htfile_object_entry_native extends SubLStructNative {
        public SubLObject $size;

        public SubLObject $type;

        public SubLObject $key_size;

        public SubLObject $key;

        public SubLObject $data_size;

        public SubLObject $data;

        private static final SubLStructDeclNative structDecl;

        public $htfile_object_entry_native() {
            this.$size = Lisp.NIL;
            this.$type = Lisp.NIL;
            this.$key_size = Lisp.NIL;
            this.$key = Lisp.NIL;
            this.$data_size = Lisp.NIL;
            this.$data = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
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
            structDecl = makeStructDeclNative(file_hash_table.$htfile_object_entry_native.class, HTFILE_OBJECT_ENTRY, HTFILE_OBJECT_ENTRY_P, $list123, $list124, new String[]{ "$size", "$type", "$key_size", "$key", "$data_size", "$data" }, $list125, $list126, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static final class $htfile_object_entry_p$UnaryFunction extends UnaryFunction {
        public $htfile_object_entry_p$UnaryFunction() {
            super(extractFunctionNamed("HTFILE-OBJECT-ENTRY-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return htfile_object_entry_p(arg1);
        }
    }

    public static final class $htfile_key_entry_native extends SubLStructNative {
        public SubLObject $key_offset;

        public SubLObject $hash_code;

        private static final SubLStructDeclNative structDecl;

        public $htfile_key_entry_native() {
            this.$key_offset = Lisp.NIL;
            this.$hash_code = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
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
            structDecl = makeStructDeclNative(file_hash_table.$htfile_key_entry_native.class, HTFILE_KEY_ENTRY, HTFILE_KEY_ENTRY_P, $list150, $list151, new String[]{ "$key_offset", "$hash_code" }, $list152, $list153, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

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
            this.$encoding_input_fn = Lisp.NIL;
            this.$encoding_output_fn = Lisp.NIL;
            this.$encoding_size_fn = Lisp.NIL;
            this.$hash_fn = Lisp.NIL;
            this.$encoding_key_input_fn = Lisp.NIL;
            this.$encoding_key_output_fn = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
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
            structDecl = makeStructDeclNative(file_hash_table.$fht_serialization_entry_native.class, FHT_SERIALIZATION_ENTRY, FHT_SERIALIZATION_ENTRY_P, $list174, $list175, new String[]{ "$encoding_input_fn", "$encoding_output_fn", "$encoding_size_fn", "$hash_fn", "$encoding_key_input_fn", "$encoding_key_output_fn" }, $list176, $list177, PRINT_FHT_SERIALIZATION_ENTRY);
        }
    }

    public static final class $fht_serialization_entry_p$UnaryFunction extends UnaryFunction {
        public $fht_serialization_entry_p$UnaryFunction() {
            super(extractFunctionNamed("FHT-SERIALIZATION-ENTRY-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return fht_serialization_entry_p(arg1);
        }
    }

    public static final class $htfile_file_block_entry_native extends SubLStructNative {
        public SubLObject $size;

        public SubLObject $next;

        private static final SubLStructDeclNative structDecl;

        public $htfile_file_block_entry_native() {
            this.$size = Lisp.NIL;
            this.$next = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
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
            structDecl = makeStructDeclNative(file_hash_table.$htfile_file_block_entry_native.class, HTFILE_FILE_BLOCK_ENTRY, HTFILE_FILE_BLOCK_ENTRY_P, $list326, $list327, new String[]{ "$size", "$next" }, $list328, $list329, PRINT_HTFILE_FILE_BLOCK_ENTRY);
        }
    }

    public static final class $htfile_file_block_entry_p$UnaryFunction extends UnaryFunction {
        public $htfile_file_block_entry_p$UnaryFunction() {
            super(extractFunctionNamed("HTFILE-FILE-BLOCK-ENTRY-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return htfile_file_block_entry_p(arg1);
        }
    }

    public static final class $fast_create_fht_native extends SubLStructNative {
        public SubLObject $fht;

        public SubLObject $tempstem;

        public SubLObject $tempfile;

        public SubLObject $keystream;

        private static final SubLStructDeclNative structDecl;

        public $fast_create_fht_native() {
            this.$fht = Lisp.NIL;
            this.$tempstem = Lisp.NIL;
            this.$tempfile = Lisp.NIL;
            this.$keystream = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
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
            structDecl = makeStructDeclNative(file_hash_table.$fast_create_fht_native.class, FAST_CREATE_FHT, FAST_CREATE_FHT_P, $list391, $list392, new String[]{ "$fht", "$tempstem", "$tempfile", "$keystream" }, $list393, $list394, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

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
            this.$tempstem = Lisp.NIL;
            this.$in_files = Lisp.NIL;
            this.$out_files = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
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
            structDecl = makeStructDeclNative(file_hash_table.$fast_fht_keystream_sorter_native.class, FAST_FHT_KEYSTREAM_SORTER, FAST_FHT_KEYSTREAM_SORTER_P, $list430, $list431, new String[]{ "$tempstem", "$in_files", "$out_files" }, $list432, $list433, DEFAULT_STRUCT_PRINT_FUNCTION);
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
