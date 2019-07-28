package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.cfasl;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
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
import static com.cyc.cycjava.cycl.control_vars.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_colon;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EIGHTEEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EIGHT_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ELEVEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQ;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUAL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUALP;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FIFTEEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FIVE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FOURTEEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FOUR_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.MINUS_ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NINE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.SEVENTEEN_INTEGER;
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
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.$dtp_bignum$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.$dtp_character$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.$dtp_cons$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.$dtp_fixnum$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.$dtp_float$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.$dtp_hash_table$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.$dtp_package$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.$dtp_string$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.$dtp_symbol$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.$dtp_vector$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.$features$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class cfasl extends SubLTranslatedFile {
    public static final SubLFile me = new cfasl();

    public static final String myName = "com.cyc.cycjava.cycl.cfasl";

    public static final String myFingerPrint = "aa0383efe486a1476ef93ea66fa0e83f5a21a4c9f6739e5bc4b8b3c3c55264d2";

    // defconstant
    public static final SubLSymbol $dtp_cfasl_encoding_stream$ = makeSymbol("*DTP-CFASL-ENCODING-STREAM*");

    // defparameter
    // Temporary control variable, should eventually stay T.
    private static final SubLSymbol $terse_guid_serialization_enabledP$ = makeSymbol("*TERSE-GUID-SERIALIZATION-ENABLED?*");

    // defparameter
    /**
     * Temporary control variable, the only controls whether
     * cfasl-econde-externalized-terse uses terse GUID serialization
     */
    public static final SubLSymbol $terse_guid_serialization_enabled_for_cfasl_encode_externalizedP$ = makeSymbol("*TERSE-GUID-SERIALIZATION-ENABLED-FOR-CFASL-ENCODE-EXTERNALIZED?*");

    // defconstant
    public static final SubLSymbol $dtp_cfasl_decoding_stream$ = makeSymbol("*DTP-CFASL-DECODING-STREAM*");

    // defconstant
    public static final SubLSymbol $dtp_cfasl_count_stream$ = makeSymbol("*DTP-CFASL-COUNT-STREAM*");

    // defparameter
    public static final SubLSymbol $cfasl_stream_extensions_enabled$ = makeSymbol("*CFASL-STREAM-EXTENSIONS-ENABLED*");

    // defparameter
    public static final SubLSymbol $cfasl_unread_byte$ = makeSymbol("*CFASL-UNREAD-BYTE*");

    // deflexical
    public static final SubLSymbol $cfasl_output_object_method_table$ = makeSymbol("*CFASL-OUTPUT-OBJECT-METHOD-TABLE*");



    // defconstant
    private static final SubLSymbol $cfasl_max_opcode$ = makeSymbol("*CFASL-MAX-OPCODE*");



    // defparameter
    public static final SubLSymbol $within_cfasl_externalization$ = makeSymbol("*WITHIN-CFASL-EXTERNALIZATION*");

    // defparameter
    public static final SubLSymbol $cfasl_channel_externalizedP$ = makeSymbol("*CFASL-CHANNEL-EXTERNALIZED?*");



    // defconstant
    private static final SubLSymbol $cfasl_opcode_externalization$ = makeSymbol("*CFASL-OPCODE-EXTERNALIZATION*");

    // defparameter
    /**
     * The current stream to which the CFASL-DEFSTRUCT-RECIPE-OUTPUT-METHOD is
     * writing.
     */
    private static final SubLSymbol $current_cfasl_defstruct_output_stream$ = makeSymbol("*CURRENT-CFASL-DEFSTRUCT-OUTPUT-STREAM*");

    // defconstant
    private static final SubLSymbol $cfasl_opcode_defstruct_recipe$ = makeSymbol("*CFASL-OPCODE-DEFSTRUCT-RECIPE*");

    // defconstant
    private static final SubLSymbol $cfasl_immediate_fixnum_cutoff$ = makeSymbol("*CFASL-IMMEDIATE-FIXNUM-CUTOFF*");

    // defconstant
    private static final SubLSymbol $cfasl_immediate_fixnum_offset$ = makeSymbol("*CFASL-IMMEDIATE-FIXNUM-OFFSET*");

    // defconstant
    private static final SubLSymbol $cfasl_opcode_p_8bit_int$ = makeSymbol("*CFASL-OPCODE-P-8BIT-INT*");

    // defconstant
    private static final SubLSymbol $cfasl_opcode_n_8bit_int$ = makeSymbol("*CFASL-OPCODE-N-8BIT-INT*");

    // defconstant
    private static final SubLSymbol $cfasl_opcode_p_16bit_int$ = makeSymbol("*CFASL-OPCODE-P-16BIT-INT*");

    // defconstant
    private static final SubLSymbol $cfasl_opcode_n_16bit_int$ = makeSymbol("*CFASL-OPCODE-N-16BIT-INT*");

    // defconstant
    private static final SubLSymbol $cfasl_opcode_p_24bit_int$ = makeSymbol("*CFASL-OPCODE-P-24BIT-INT*");

    // defconstant
    private static final SubLSymbol $cfasl_opcode_n_24bit_int$ = makeSymbol("*CFASL-OPCODE-N-24BIT-INT*");

    // defconstant
    private static final SubLSymbol $cfasl_opcode_p_32bit_int$ = makeSymbol("*CFASL-OPCODE-P-32BIT-INT*");

    // defconstant
    private static final SubLSymbol $cfasl_opcode_n_32bit_int$ = makeSymbol("*CFASL-OPCODE-N-32BIT-INT*");

    // defconstant
    private static final SubLSymbol $cfasl_opcode_p_bignum$ = makeSymbol("*CFASL-OPCODE-P-BIGNUM*");

    // defconstant
    private static final SubLSymbol $cfasl_opcode_n_bignum$ = makeSymbol("*CFASL-OPCODE-N-BIGNUM*");

    // defconstant
    private static final SubLSymbol $cfasl_opcode_p_float$ = makeSymbol("*CFASL-OPCODE-P-FLOAT*");

    // defconstant
    private static final SubLSymbol $cfasl_opcode_n_float$ = makeSymbol("*CFASL-OPCODE-N-FLOAT*");

    // defconstant
    private static final SubLSymbol $cfasl_opcode_keyword$ = makeSymbol("*CFASL-OPCODE-KEYWORD*");

    // defconstant
    private static final SubLSymbol $cfasl_opcode_other_symbol$ = makeSymbol("*CFASL-OPCODE-OTHER-SYMBOL*");

    // defconstant
    private static final SubLSymbol $cfasl_opcode_nil$ = makeSymbol("*CFASL-OPCODE-NIL*");

    // defconstant
    private static final SubLSymbol $cfasl_opcode_common_symbol$ = makeSymbol("*CFASL-OPCODE-COMMON-SYMBOL*");





    // defconstant
    private static final SubLSymbol $cfasl_opcode_list$ = makeSymbol("*CFASL-OPCODE-LIST*");

    // defconstant
    private static final SubLSymbol $cfasl_opcode_dotted_list$ = makeSymbol("*CFASL-OPCODE-DOTTED-LIST*");

    // defconstant
    private static final SubLSymbol $cfasl_opcode_general_vector$ = makeSymbol("*CFASL-OPCODE-GENERAL-VECTOR*");

    // defconstant
    private static final SubLSymbol $cfasl_opcode_byte_vector$ = makeSymbol("*CFASL-OPCODE-BYTE-VECTOR*");

    // defconstant
    private static final SubLSymbol $cfasl_opcode_string$ = makeSymbol("*CFASL-OPCODE-STRING*");

    // defparameter
    /**
     * If non-nil, a string that is destructively re-used when loading a string of
     * the same length.
     */
    private static final SubLSymbol $cfasl_input_string_resource$ = makeSymbol("*CFASL-INPUT-STRING-RESOURCE*");

    // defconstant
    private static final SubLSymbol $cfasl_opcode_character$ = makeSymbol("*CFASL-OPCODE-CHARACTER*");

    // defconstant
    private static final SubLSymbol $cfasl_opcode_hashtable$ = makeSymbol("*CFASL-OPCODE-HASHTABLE*");

    // defconstant
    private static final SubLSymbol $cfasl_opcode_guid$ = makeSymbol("*CFASL-OPCODE-GUID*");

    // defconstant
    private static final SubLSymbol $cfasl_opcode_legacy_guid$ = makeSymbol("*CFASL-OPCODE-LEGACY-GUID*");

    // defparameter
    public static final SubLSymbol $cfasl_input_guid_string_resource$ = makeSymbol("*CFASL-INPUT-GUID-STRING-RESOURCE*");

    // defconstant
    private static final SubLSymbol $cfasl_opcode_result_set$ = makeSymbol("*CFASL-OPCODE-RESULT-SET*");

    // defconstant
    private static final SubLSymbol $cfasl_opcode_package$ = makeSymbol("*CFASL-OPCODE-PACKAGE*");

    // defconstant
    private static final SubLSymbol $cfasl_opcode_wide_cfasl_opcode$ = makeSymbol("*CFASL-OPCODE-WIDE-CFASL-OPCODE*");

    // defconstant
    /**
     * All wide opcodes have to be more than one byte, so that all narrow opcodes
     * can be re-encoded as wide opcodes without loss of functionality.
     */
    public static final SubLSymbol $cfasl_min_wide_opcode$ = makeSymbol("*CFASL-MIN-WIDE-OPCODE*");



    // defconstant
    private static final SubLSymbol $cfasl_opcode_instance$ = makeSymbol("*CFASL-OPCODE-INSTANCE*");

    // defconstant
    private static final SubLSymbol $cfasl_opcode_guid_denoted_type$ = makeSymbol("*CFASL-OPCODE-GUID-DENOTED-TYPE*");



    // Internal Constants
    public static final SubLSymbol CFASL_ENCODING_STREAM = makeSymbol("CFASL-ENCODING-STREAM");

    public static final SubLSymbol CFASL_ENCODING_STREAM_P = makeSymbol("CFASL-ENCODING-STREAM-P");

    public static final SubLList $list2 = list(makeSymbol("INTERNAL-STREAM"), makeSymbol("COUNT"));

    public static final SubLList $list3 = list(makeKeyword("INTERNAL-STREAM"), makeKeyword("COUNT"));

    public static final SubLList $list4 = list(makeSymbol("CFASL-ENCODING-STREAM-INTERNAL-STREAM"), makeSymbol("CFASL-ENCODING-STREAM-COUNT"));

    public static final SubLList $list5 = list(makeSymbol("_CSETF-CFASL-ENCODING-STREAM-INTERNAL-STREAM"), makeSymbol("_CSETF-CFASL-ENCODING-STREAM-COUNT"));



    public static final SubLSymbol CFASL_ENCODING_STREAM_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("CFASL-ENCODING-STREAM-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list8 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("CFASL-ENCODING-STREAM-P"));

    private static final SubLSymbol CFASL_ENCODING_STREAM_INTERNAL_STREAM = makeSymbol("CFASL-ENCODING-STREAM-INTERNAL-STREAM");

    private static final SubLSymbol _CSETF_CFASL_ENCODING_STREAM_INTERNAL_STREAM = makeSymbol("_CSETF-CFASL-ENCODING-STREAM-INTERNAL-STREAM");

    private static final SubLSymbol CFASL_ENCODING_STREAM_COUNT = makeSymbol("CFASL-ENCODING-STREAM-COUNT");

    private static final SubLSymbol _CSETF_CFASL_ENCODING_STREAM_COUNT = makeSymbol("_CSETF-CFASL-ENCODING-STREAM-COUNT");





    private static final SubLString $str15$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_CFASL_ENCODING_STREAM = makeSymbol("MAKE-CFASL-ENCODING-STREAM");





    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_CFASL_ENCODING_STREAM_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-CFASL-ENCODING-STREAM-METHOD");

    private static final SubLList $list21 = list(list(makeSymbol("STREAM"), makeSymbol("STRING")), makeSymbol("&BODY"), makeSymbol("BODY"));





    private static final SubLList $list24 = list(list(makeSymbol("NEW-CFASL-ENCODING-STREAM")));







    private static final SubLSymbol CFASL_ENCODING_STRING_STREAM_ENCODING = makeSymbol("CFASL-ENCODING-STRING-STREAM-ENCODING");

    private static final SubLSymbol CLOSE_CFASL_ENCODING_STREAM = makeSymbol("CLOSE-CFASL-ENCODING-STREAM");

    private static final SubLSymbol WITH_CFASL_OUTPUT_TO_HEX_STRING = makeSymbol("WITH-CFASL-OUTPUT-TO-HEX-STRING");

    public static final SubLList $list31 = list(list(makeSymbol("STREAM"), makeSymbol("BYTE-VECTOR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol CFASL_ENCODING_STREAM_ENCODING = makeSymbol("CFASL-ENCODING-STREAM-ENCODING");

    private static final SubLSymbol NEW_CFASL_ENCODING_STREAM = makeSymbol("NEW-CFASL-ENCODING-STREAM");

    private static final SubLSymbol WITH_CFASL_OUTPUT_TO_BYTE_VECTOR = makeSymbol("WITH-CFASL-OUTPUT-TO-BYTE-VECTOR");

    private static final SubLSymbol CFASL_ENCODING_STREAM_WRITE_BYTE = makeSymbol("CFASL-ENCODING-STREAM-WRITE-BYTE");

    private static final SubLSymbol CFASL_ENCODING_STREAM_HEXCHAR_POSITION = makeSymbol("CFASL-ENCODING-STREAM-HEXCHAR-POSITION");

    private static final SubLSymbol CFASL_ENCODING_STREAM_BYTE_POSITION = makeSymbol("CFASL-ENCODING-STREAM-BYTE-POSITION");



    private static final SubLSymbol CFASL_DECODING_STREAM = makeSymbol("CFASL-DECODING-STREAM");

    private static final SubLSymbol CFASL_DECODING_STREAM_P = makeSymbol("CFASL-DECODING-STREAM-P");

    private static final SubLList $list41 = list(makeSymbol("INTERNAL-STREAM"), makeSymbol("POSITION"));

    private static final SubLList $list42 = list(makeKeyword("INTERNAL-STREAM"), makeKeyword("POSITION"));

    private static final SubLList $list43 = list(makeSymbol("CFASL-DECODING-STREAM-INTERNAL-STREAM"), makeSymbol("CFASL-DECODING-STREAM-POSITION"));

    private static final SubLList $list44 = list(makeSymbol("_CSETF-CFASL-DECODING-STREAM-INTERNAL-STREAM"), makeSymbol("_CSETF-CFASL-DECODING-STREAM-POSITION"));

    private static final SubLSymbol CFASL_DECODING_STREAM_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("CFASL-DECODING-STREAM-PRINT-FUNCTION-TRAMPOLINE");

    public static final SubLList $list46 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("CFASL-DECODING-STREAM-P"));

    private static final SubLSymbol CFASL_DECODING_STREAM_INTERNAL_STREAM = makeSymbol("CFASL-DECODING-STREAM-INTERNAL-STREAM");

    private static final SubLSymbol _CSETF_CFASL_DECODING_STREAM_INTERNAL_STREAM = makeSymbol("_CSETF-CFASL-DECODING-STREAM-INTERNAL-STREAM");

    private static final SubLSymbol CFASL_DECODING_STREAM_POSITION = makeSymbol("CFASL-DECODING-STREAM-POSITION");

    private static final SubLSymbol _CSETF_CFASL_DECODING_STREAM_POSITION = makeSymbol("_CSETF-CFASL-DECODING-STREAM-POSITION");



    private static final SubLSymbol MAKE_CFASL_DECODING_STREAM = makeSymbol("MAKE-CFASL-DECODING-STREAM");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_CFASL_DECODING_STREAM_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-CFASL-DECODING-STREAM-METHOD");

    private static final SubLSymbol NEW_CFASL_DECODING_STREAM_FROM_STRING = makeSymbol("NEW-CFASL-DECODING-STREAM-FROM-STRING");

    private static final SubLSymbol CLOSE_CFASL_DECODING_STREAM = makeSymbol("CLOSE-CFASL-DECODING-STREAM");

    private static final SubLSymbol WITH_CFASL_INPUT_FROM_STRING = makeSymbol("WITH-CFASL-INPUT-FROM-STRING");

    private static final SubLSymbol NEW_CFASL_DECODING_STREAM = makeSymbol("NEW-CFASL-DECODING-STREAM");

    private static final SubLSymbol WITH_CFASL_INPUT_FROM_BYTE_VECTOR = makeSymbol("WITH-CFASL-INPUT-FROM-BYTE-VECTOR");

    private static final SubLSymbol CFASL_ENCODING_P = makeSymbol("CFASL-ENCODING-P");

    private static final SubLSymbol CFASL_DECODING_STREAM_READ_BYTE = makeSymbol("CFASL-DECODING-STREAM-READ-BYTE");



    private static final SubLSymbol CFASL_COUNT_STREAM = makeSymbol("CFASL-COUNT-STREAM");

    private static final SubLSymbol CFASL_COUNT_STREAM_P = makeSymbol("CFASL-COUNT-STREAM-P");

    private static final SubLList $list64 = list(makeSymbol("POSITION"));

    private static final SubLList $list65 = list(makeKeyword("POSITION"));

    private static final SubLList $list66 = list(makeSymbol("CFASL-COUNT-STREAM-POSITION"));

    private static final SubLList $list67 = list(makeSymbol("_CSETF-CFASL-COUNT-STREAM-POSITION"));

    private static final SubLSymbol CFASL_COUNT_STREAM_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("CFASL-COUNT-STREAM-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list69 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("CFASL-COUNT-STREAM-P"));

    private static final SubLSymbol CFASL_COUNT_STREAM_POSITION = makeSymbol("CFASL-COUNT-STREAM-POSITION");

    private static final SubLSymbol _CSETF_CFASL_COUNT_STREAM_POSITION = makeSymbol("_CSETF-CFASL-COUNT-STREAM-POSITION");

    private static final SubLSymbol MAKE_CFASL_COUNT_STREAM = makeSymbol("MAKE-CFASL-COUNT-STREAM");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_CFASL_COUNT_STREAM_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-CFASL-COUNT-STREAM-METHOD");

    private static final SubLList $list74 = list(list(makeSymbol("STREAM"), makeSymbol("COUNT")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list75 = list(list(makeSymbol("NEW-CFASL-COUNT-STREAM")));

    private static final SubLSymbol CFASL_COUNT_STREAM_SIZE = makeSymbol("CFASL-COUNT-STREAM-SIZE");

    private static final SubLSymbol CLOSE_CFASL_COUNT_STREAM = makeSymbol("CLOSE-CFASL-COUNT-STREAM");

    public static final SubLList $list78 = list(list(makeSymbol("*CFASL-STREAM-EXTENSIONS-ENABLED*"), T), list(makeSymbol("*CFASL-UNREAD-BYTE*"), NIL));





    private static final SubLString $$$Use_NIL_instead = makeString("Use NIL instead");

    private static final SubLString $str82$CFASL_cannot_handle____S = makeString("CFASL cannot handle : ~S");

    private static final SubLString $str83$Undefined_cfasl_opcode_in__S = makeString("Undefined cfasl opcode in ~S");

    private static final SubLString $str84$end_of_file_on_stream__S = makeString("end-of-file on stream ~S");

    private static final SubLSymbol CFASL_INPUT_ERROR = makeSymbol("CFASL-INPUT-ERROR");

    private static final SubLString $str86$Undefined_cfasl_opcode__A_in__S = makeString("Undefined cfasl opcode ~A in ~S");

    private static final SubLInteger $int$128 = makeInteger(128);

    private static final SubLSymbol $cfasl_input_method_table$ = makeSymbol("*CFASL-INPUT-METHOD-TABLE*");

    private static final SubLList $list89 = list(makeSymbol("VARIABLE"), makeSymbol("CFASL-OPCODE"), makeSymbol("INPUT-FUNCTION"));



    private static final SubLSymbol DEFCONSTANT_PRIVATE = makeSymbol("DEFCONSTANT-PRIVATE");

    private static final SubLSymbol REGISTER_CFASL_INPUT_FUNCTION = makeSymbol("REGISTER-CFASL-INPUT-FUNCTION");



    private static final SubLSymbol DECLARE_CFASL_OPCODE = makeSymbol("DECLARE-CFASL-OPCODE");





    public static final SubLSymbol $cfasl_input_to_static_area$ = makeSymbol("*CFASL-INPUT-TO-STATIC-AREA*");



    private static final SubLList $list99 = list(list(makeSymbol("*WITHIN-CFASL-EXTERNALIZATION*"), T));

    private static final SubLList $list100 = list(list(makeSymbol("*WITHIN-CFASL-EXTERNALIZATION*"), NIL));

    private static final SubLList $list101 = list(list(makeSymbol("*CFASL-CHANNEL-EXTERNALIZED?*"), NIL));

    private static final SubLSymbol $cfasl_extensions$ = makeSymbol("*CFASL-EXTENSIONS*");

    private static final SubLList $list103 = list(makeSymbol("VARIABLE"), makeSymbol("CFASL-OPCODE"), makeSymbol("PRED-FUNC"), makeSymbol("OUTPUT-FUNC"), makeSymbol("INPUT-FUNC"));

    private static final SubLSymbol REGISTER_CFASL_EXTENSION = makeSymbol("REGISTER-CFASL-EXTENSION");

    private static final SubLSymbol DECLARE_CFASL_EXTENSION_OPCODE = makeSymbol("DECLARE-CFASL-EXTENSION-OPCODE");

    private static final SubLInteger $int$51 = makeInteger(51);

    private static final SubLSymbol CFASL_INPUT_EXTERNALIZATION = makeSymbol("CFASL-INPUT-EXTERNALIZATION");

    private static final SubLInteger $int$44 = makeInteger(44);

    private static final SubLSymbol CFASL_INPUT_DEFSTRUCT_RECIPE = makeSymbol("CFASL-INPUT-DEFSTRUCT-RECIPE");

    private static final SubLSymbol CFASL_OUTPUT_DEFSTRUCT_RECIPE_VISITORFN = makeSymbol("CFASL-OUTPUT-DEFSTRUCT-RECIPE-VISITORFN");

    private static final SubLString $str111$Error__expected_constructor_for_d = makeString("Error, expected constructor for defstruct, got ~A.");

    private static final SubLString $str112$Expected_keyword_at_slot___A_of_s = makeString("Expected keyword at slot #~A of structure with constructor ~A, got ~A.");

    private static final SubLSymbol CFASL_INPUT_P_8BIT_INT = makeSymbol("CFASL-INPUT-P-8BIT-INT");

    private static final SubLSymbol CFASL_INPUT_N_8BIT_INT = makeSymbol("CFASL-INPUT-N-8BIT-INT");

    private static final SubLSymbol CFASL_INPUT_P_16BIT_INT = makeSymbol("CFASL-INPUT-P-16BIT-INT");

    private static final SubLSymbol CFASL_INPUT_N_16BIT_INT = makeSymbol("CFASL-INPUT-N-16BIT-INT");

    private static final SubLSymbol CFASL_INPUT_P_24BIT_INT = makeSymbol("CFASL-INPUT-P-24BIT-INT");

    private static final SubLSymbol CFASL_INPUT_N_24BIT_INT = makeSymbol("CFASL-INPUT-N-24BIT-INT");

    private static final SubLSymbol CFASL_INPUT_P_32BIT_INT = makeSymbol("CFASL-INPUT-P-32BIT-INT");

    private static final SubLSymbol CFASL_INPUT_N_32BIT_INT = makeSymbol("CFASL-INPUT-N-32BIT-INT");

    private static final SubLInteger $int$23 = makeInteger(23);

    private static final SubLSymbol CFASL_INPUT_P_BIGNUM = makeSymbol("CFASL-INPUT-P-BIGNUM");

    private static final SubLInteger $int$24 = makeInteger(24);

    private static final SubLSymbol CFASL_INPUT_N_BIGNUM = makeSymbol("CFASL-INPUT-N-BIGNUM");

    private static final SubLSymbol CFASL_OUTPUT_OBJECT_INTEGER_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-INTEGER-METHOD");

    private static final SubLInteger $int$32768 = makeInteger(32768);

    private static final SubLInteger $int$8388608 = makeInteger(0x800000);

    private static final SubLInteger $int$2147483648 = makeInteger("2147483648");

    private static final SubLList $list129 = list(makeSymbol("SIGN"), makeSymbol("&REST"), makeSymbol("FIXNUMS"));

    private static final SubLList $list130 = list(makeSymbol("INLINE"), makeSymbol("ASSEMBLE-2-FIXNUMS-TO-NON-NEGATIVE-INTEGER"), makeSymbol("ASSEMBLE-3-FIXNUMS-TO-NON-NEGATIVE-INTEGER"), makeSymbol("ASSEMBLE-4-FIXNUMS-TO-NON-NEGATIVE-INTEGER"));





    private static final SubLSymbol CFASL_INPUT_P_FLOAT = makeSymbol("CFASL-INPUT-P-FLOAT");

    private static final SubLSymbol CFASL_INPUT_N_FLOAT = makeSymbol("CFASL-INPUT-N-FLOAT");

    private static final SubLSymbol CFASL_OUTPUT_OBJECT_FLOAT_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-FLOAT-METHOD");

    private static final SubLSymbol CFASL_OUTPUT_OBJECT_SYMBOL_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-SYMBOL-METHOD");

    private static final SubLSymbol CFASL_INPUT_KEYWORD = makeSymbol("CFASL-INPUT-KEYWORD");

    private static final SubLSymbol CFASL_INPUT_OTHER_SYMBOL = makeSymbol("CFASL-INPUT-OTHER-SYMBOL");

    private static final SubLSymbol CFASL_INPUT_NIL = makeSymbol("CFASL-INPUT-NIL");

    private static final SubLInteger $int$50 = makeInteger(50);

    private static final SubLSymbol CFASL_INPUT_COMMON_SYMBOL = makeSymbol("CFASL-INPUT-COMMON-SYMBOL");



    private static final SubLList $list143 = list(makeSymbol("SYMBOLS"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list144 = list(list(makeSymbol("*CFASL-COMMON-SYMBOLS*"), NIL));

    private static final SubLSymbol CFASL_SET_COMMON_SYMBOLS = makeSymbol("CFASL-SET-COMMON-SYMBOLS");

    private static final SubLSymbol CFASL_SET_COMMON_SYMBOLS_SIMPLE = makeSymbol("CFASL-SET-COMMON-SYMBOLS-SIMPLE");

    private static final SubLString $str147$Use_NIL_ = makeString("Use NIL.");

    private static final SubLString $str148$Common_symbol_at_index__D_was_not = makeString("Common symbol at index ~D was not found in ~S.");

    public static final SubLSymbol $cfasl_common_symbols$ = makeSymbol("*CFASL-COMMON-SYMBOLS*");

    private static final SubLSymbol CFASL_OUTPUT_OBJECT_CONS_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-CONS-METHOD");

    private static final SubLSymbol $cfasl_list_methods$ = makeSymbol("*CFASL-LIST-METHODS*");

    private static final SubLSymbol CFASL_INPUT_LIST = makeSymbol("CFASL-INPUT-LIST");

    private static final SubLString $$$Output_NIL_instead = makeString("Output NIL instead");

    private static final SubLString $str154$Trying_to_output_a_circular_list_ = makeString("Trying to output a circular list!");

    private static final SubLSymbol CFASL_INPUT_DOTTED_LIST = makeSymbol("CFASL-INPUT-DOTTED-LIST");

    private static final SubLSymbol CFASL_OUTPUT_OBJECT_VECTOR_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-VECTOR-METHOD");

    private static final SubLSymbol CFASL_INPUT_GENERAL_VECTOR = makeSymbol("CFASL-INPUT-GENERAL-VECTOR");

    private static final SubLInteger $int$26 = makeInteger(26);

    private static final SubLSymbol CFASL_INPUT_BYTE_VECTOR = makeSymbol("CFASL-INPUT-BYTE-VECTOR");

    private static final SubLSymbol CFASL_INPUT_STRING = makeSymbol("CFASL-INPUT-STRING");

    private static final SubLSymbol CFASL_OUTPUT_OBJECT_STRING_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-STRING-METHOD");

    private static final SubLSymbol CFASL_INPUT_CHARACTER = makeSymbol("CFASL-INPUT-CHARACTER");

    private static final SubLSymbol CFASL_OUTPUT_OBJECT_CHARACTER_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-CHARACTER-METHOD");

    private static final SubLSymbol CFASL_INPUT_HASHTABLE = makeSymbol("CFASL-INPUT-HASHTABLE");

    private static final SubLSymbol CFASL_OUTPUT_OBJECT_HASH_TABLE_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-HASH-TABLE-METHOD");

    private static final SubLInteger $int$43 = makeInteger(43);

    private static final SubLSymbol CFASL_INPUT_GUID = makeSymbol("CFASL-INPUT-GUID");

    private static final SubLSymbol CFASL_OUTPUT_OBJECT_GUID_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-GUID-METHOD");

    private static final SubLInteger $int$25 = makeInteger(25);

    private static final SubLSymbol CFASL_INPUT_LEGACY_GUID = makeSymbol("CFASL-INPUT-LEGACY-GUID");

    private static final SubLInteger $int$36 = makeInteger(36);

    private static final SubLList $list172 = list(list(makeSymbol("*CFASL-INPUT-GUID-STRING-RESOURCE*"), list(makeSymbol("GET-NEW-CFASL-INPUT-GUID-STRING-RESOURCE"))));

    private static final SubLInteger $int$27 = makeInteger(27);

    private static final SubLSymbol CFASL_INPUT_RESULT_SET = makeSymbol("CFASL-INPUT-RESULT-SET");

    private static final SubLInteger $int$28 = makeInteger(28);

    private static final SubLSymbol CFASL_INPUT_PACKAGE = makeSymbol("CFASL-INPUT-PACKAGE");

    private static final SubLSymbol CFASL_OUTPUT_OBJECT_PACKAGE_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-PACKAGE-METHOD");

    private static final SubLInteger $int$29 = makeInteger(29);

    private static final SubLSymbol CFASL_INPUT_WIDE_OPCODE_ENCODED = makeSymbol("CFASL-INPUT-WIDE-OPCODE-ENCODED");

    private static final SubLSymbol $cfasl_wide_opcode_input_method_table$ = makeSymbol("*CFASL-WIDE-OPCODE-INPUT-METHOD-TABLE*");



    private static final SubLList $list182 = list(makeSymbol("VARIABLE"), makeSymbol("WIDE-OPCODE"), makeSymbol("INPUT-FUNCTION"));

    private static final SubLString $str183$_A_is_too_small_to_be_a_wide_opco = makeString("~A is too small to be a wide opcode.");

    private static final SubLSymbol REGISTER_WIDE_CFASL_OPCODE_INPUT_FUNCTION = makeSymbol("REGISTER-WIDE-CFASL-OPCODE-INPUT-FUNCTION");

    private static final SubLSymbol DECLARE_WIDE_CFASL_OPCODE = makeSymbol("DECLARE-WIDE-CFASL-OPCODE");

    private static final SubLInteger $int$124 = makeInteger(124);

    private static final SubLSymbol CFASL_INPUT_INSTANCE = makeSymbol("CFASL-INPUT-INSTANCE");



    private static final SubLSymbol CFASL_OUTPUT_OBJECT_INSTANCE_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-INSTANCE-METHOD");



    private static final SubLInteger $int$126 = makeInteger(126);

    private static final SubLSymbol CFASL_INPUT_GUID_DENOTED_TYPE = makeSymbol("CFASL-INPUT-GUID-DENOTED-TYPE");

    private static final SubLSymbol $cfasl_guid_denoted_type_input_method_table$ = makeSymbol("*CFASL-GUID-DENOTED-TYPE-INPUT-METHOD-TABLE*");



    private static final SubLList $list195 = list(makeSymbol("VARIABLE"), makeSymbol("CFASL-GUID-OPCODE"), makeSymbol("INPUT-FUNCTION"));





    private static final SubLSymbol REGISTER_CFASL_GUID_DENOTED_TYPE_INPUT_FUNCTION = makeSymbol("REGISTER-CFASL-GUID-DENOTED-TYPE-INPUT-FUNCTION");

    private static final SubLList $list199 = list(makeSymbol("VARIABLE"), makeSymbol("CFASL-GUID-STRING-OPCODE"), makeSymbol("INPUT-FUNCTION"));

    private static final SubLSymbol GUID_STRING_P = makeSymbol("GUID-STRING-P");

    private static final SubLSymbol STRING_TO_GUID = makeSymbol("STRING-TO-GUID");

    private static final SubLSymbol DECLARE_CFASL_GUID_OPCODE = makeSymbol("DECLARE-CFASL-GUID-OPCODE");

    private static final SubLList $list203 = list(list(makeSymbol("TYPE-DENOTING-GUID"), makeSymbol("STREAM")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol WRITE_CFASL_GUID_DENOTED_TYPE_OPCODE = makeSymbol("WRITE-CFASL-GUID-DENOTED-TYPE-OPCODE");



    private static final SubLString $str206$Unable_to_open__S = makeString("Unable to open ~S");

    static {





    }

    public static SubLObject cfasl_encoding_p(final SubLObject v_object) {
        return vector_utilities.byte_vector_p(v_object);
    }

    public static SubLObject cfasl_encodable_stream_p(final SubLObject v_object) {
        return makeBoolean(v_object.isStream() || (NIL != cfasl_encoding_stream_p(v_object)));
    }

    public static SubLObject cfasl_encoding_stream_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject cfasl_encoding_stream_p(final SubLObject v_object) {
        return v_object.getClass() == cfasl.$cfasl_encoding_stream_native.class ? T : NIL;
    }

    public static SubLObject cfasl_encoding_stream_internal_stream(final SubLObject v_object) {
        assert NIL != cfasl_encoding_stream_p(v_object) : "cfasl.cfasl_encoding_stream_p(v_object) " + "CommonSymbols.NIL != cfasl.cfasl_encoding_stream_p(v_object) " + v_object;
        return v_object.getField2();
    }

    public static SubLObject cfasl_encoding_stream_count(final SubLObject v_object) {
        assert NIL != cfasl_encoding_stream_p(v_object) : "cfasl.cfasl_encoding_stream_p(v_object) " + "CommonSymbols.NIL != cfasl.cfasl_encoding_stream_p(v_object) " + v_object;
        return v_object.getField3();
    }

    public static SubLObject _csetf_cfasl_encoding_stream_internal_stream(final SubLObject v_object, final SubLObject value) {
        assert NIL != cfasl_encoding_stream_p(v_object) : "cfasl.cfasl_encoding_stream_p(v_object) " + "CommonSymbols.NIL != cfasl.cfasl_encoding_stream_p(v_object) " + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_cfasl_encoding_stream_count(final SubLObject v_object, final SubLObject value) {
        assert NIL != cfasl_encoding_stream_p(v_object) : "cfasl.cfasl_encoding_stream_p(v_object) " + "CommonSymbols.NIL != cfasl.cfasl_encoding_stream_p(v_object) " + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject make_cfasl_encoding_stream(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new cfasl.$cfasl_encoding_stream_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($INTERNAL_STREAM)) {
                _csetf_cfasl_encoding_stream_internal_stream(v_new, current_value);
            } else
                if (pcase_var.eql($COUNT)) {
                    _csetf_cfasl_encoding_stream_count(v_new, current_value);
                } else {
                    Errors.error($str15$Invalid_slot__S_for_construction_, current_arg);
                }

        }
        return v_new;
    }

    public static SubLObject visit_defstruct_cfasl_encoding_stream(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_CFASL_ENCODING_STREAM, TWO_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $INTERNAL_STREAM, cfasl_encoding_stream_internal_stream(obj));
        funcall(visitor_fn, obj, $SLOT, $COUNT, cfasl_encoding_stream_count(obj));
        funcall(visitor_fn, obj, $END, MAKE_CFASL_ENCODING_STREAM, TWO_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_cfasl_encoding_stream_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_cfasl_encoding_stream(obj, visitor_fn);
    }

    public static SubLObject with_cfasl_output_to_hex_string(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list21);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject stream = NIL;
        SubLObject string = NIL;
        destructuring_bind_must_consp(current, datum, $list21);
        stream = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list21);
        string = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(datum, $list21);
            return NIL;
        }
        final SubLObject body;
        current = body = temp;
        assert NIL != symbolp(stream) : "Types.symbolp(stream) " + "CommonSymbols.NIL != Types.symbolp(stream) " + stream;
        assert NIL != symbolp(string) : "Types.symbolp(string) " + "CommonSymbols.NIL != Types.symbolp(string) " + string;
        return list(CLET, list(bq_cons(stream, $list24)), list(CUNWIND_PROTECT, bq_cons(PROGN, append(body, list(list(CSETQ, string, list(CFASL_ENCODING_STRING_STREAM_ENCODING, stream))))), list(CLOSE_CFASL_ENCODING_STREAM, stream)));
    }

    public static SubLObject cfasl_encoding_string_stream_encoding(final SubLObject encoding_stream) {
        return get_output_stream_string(cfasl_encoding_stream_internal_stream(encoding_stream));
    }

    public static SubLObject with_cfasl_output_to_byte_vector(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list31);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject stream = NIL;
        SubLObject byte_vector = NIL;
        destructuring_bind_must_consp(current, datum, $list31);
        stream = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list31);
        byte_vector = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(datum, $list31);
            return NIL;
        }
        final SubLObject body;
        current = body = temp;
        assert NIL != symbolp(stream) : "Types.symbolp(stream) " + "CommonSymbols.NIL != Types.symbolp(stream) " + stream;
        assert NIL != symbolp(byte_vector) : "Types.symbolp(byte_vector) " + "CommonSymbols.NIL != Types.symbolp(byte_vector) " + byte_vector;
        return list(CLET, list(bq_cons(stream, $list24)), list(CUNWIND_PROTECT, bq_cons(PROGN, append(body, list(list(CSETQ, byte_vector, list(CFASL_ENCODING_STREAM_ENCODING, stream))))), list(CLOSE_CFASL_ENCODING_STREAM, stream)));
    }

    public static SubLObject new_cfasl_encoding_stream() {
        final SubLObject encoding_stream = make_cfasl_encoding_stream(UNPROVIDED);
        final SubLObject string_stream = make_private_string_output_stream();
        _csetf_cfasl_encoding_stream_internal_stream(encoding_stream, string_stream);
        _csetf_cfasl_encoding_stream_count(encoding_stream, ZERO_INTEGER);
        return encoding_stream;
    }

    public static SubLObject cfasl_encoding_stream_write_byte(final SubLObject v_byte, final SubLObject encoding_stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject internal_stream = cfasl_encoding_stream_internal_stream(encoding_stream);
        thread.resetMultipleValues();
        final SubLObject high_char = vector_utilities.byte_to_hex_chars(v_byte);
        final SubLObject low_char = thread.secondMultipleValue();
        thread.resetMultipleValues();
        write_char(high_char, internal_stream);
        write_char(low_char, internal_stream);
        _csetf_cfasl_encoding_stream_count(encoding_stream, add(cfasl_encoding_stream_count(encoding_stream), TWO_INTEGER));
        return v_byte;
    }

    public static SubLObject cfasl_encoding_stream_encoding(final SubLObject encoding_stream) {
        assert NIL != cfasl_encoding_stream_p(encoding_stream) : "cfasl.cfasl_encoding_stream_p(encoding_stream) " + "CommonSymbols.NIL != cfasl.cfasl_encoding_stream_p(encoding_stream) " + encoding_stream;
        final SubLObject encoding_string = cfasl_encoding_string_stream_encoding(encoding_stream);
        final SubLObject encoding = vector_utilities.hex_char_string_to_byte_vector(encoding_string);
        return encoding;
    }

    public static SubLObject close_cfasl_encoding_stream(final SubLObject encoding_stream) {
        assert NIL != cfasl_encoding_stream_p(encoding_stream) : "cfasl.cfasl_encoding_stream_p(encoding_stream) " + "CommonSymbols.NIL != cfasl.cfasl_encoding_stream_p(encoding_stream) " + encoding_stream;
        return close(cfasl_encoding_stream_internal_stream(encoding_stream), UNPROVIDED);
    }

    public static SubLObject cfasl_encoding_stream_hexchar_position(final SubLObject encoding_stream) {
        assert NIL != cfasl_encoding_stream_p(encoding_stream) : "cfasl.cfasl_encoding_stream_p(encoding_stream) " + "CommonSymbols.NIL != cfasl.cfasl_encoding_stream_p(encoding_stream) " + encoding_stream;
        final SubLObject internal_stream = cfasl_encoding_stream_internal_stream(encoding_stream);
        final SubLObject position = cfasl_encoding_stream_count(encoding_stream);
        return position;
    }

    public static SubLObject cfasl_encoding_stream_byte_position(final SubLObject encoding_stream) {
        return integerDivide(cfasl_encoding_stream_hexchar_position(encoding_stream), TWO_INTEGER);
    }

    public static SubLObject cfasl_encode(final SubLObject v_object) {
        SubLObject encoding = NIL;
        final SubLObject stream = new_cfasl_encoding_stream();
        try {
            cfasl_output(v_object, stream);
            encoding = cfasl_encoding_stream_encoding(stream);
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                close_cfasl_encoding_stream(stream);
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return encoding;
    }

    public static SubLObject cfasl_encode_externalized(final SubLObject v_object) {
        SubLObject encoding = NIL;
        final SubLObject stream = new_cfasl_encoding_stream();
        try {
            cfasl_output_externalized(v_object, stream);
            encoding = cfasl_encoding_stream_encoding(stream);
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                close_cfasl_encoding_stream(stream);
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return encoding;
    }

    public static SubLObject cfasl_encode_externalized_terse(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject encoding = NIL;
        final SubLObject _prev_bind_0 = $terse_guid_serialization_enabledP$.currentBinding(thread);
        try {
            $terse_guid_serialization_enabledP$.bind($terse_guid_serialization_enabled_for_cfasl_encode_externalizedP$.getDynamicValue(thread) == $UNINITIALIZED ? T : $terse_guid_serialization_enabled_for_cfasl_encode_externalizedP$.getDynamicValue(thread), thread);
            final SubLObject stream = new_cfasl_encoding_stream();
            try {
                cfasl_output_externalized(v_object, stream);
                encoding = cfasl_encoding_stream_encoding(stream);
            } finally {
                final SubLObject _prev_bind_0_$1 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    close_cfasl_encoding_stream(stream);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$1, thread);
                }
            }
        } finally {
            $terse_guid_serialization_enabledP$.rebind(_prev_bind_0, thread);
        }
        return encoding;
    }

    public static SubLObject cfasl_decodable_stream_p(final SubLObject v_object) {
        return makeBoolean(v_object.isStream() || (NIL != cfasl_decoding_stream_p(v_object)));
    }

    public static SubLObject cfasl_decoding_stream_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject cfasl_decoding_stream_p(final SubLObject v_object) {
        return v_object.getClass() == cfasl.$cfasl_decoding_stream_native.class ? T : NIL;
    }

    public static SubLObject cfasl_decoding_stream_internal_stream(final SubLObject v_object) {
        assert NIL != cfasl_decoding_stream_p(v_object) : "cfasl.cfasl_decoding_stream_p(v_object) " + "CommonSymbols.NIL != cfasl.cfasl_decoding_stream_p(v_object) " + v_object;
        return v_object.getField2();
    }

    public static SubLObject cfasl_decoding_stream_position(final SubLObject v_object) {
        assert NIL != cfasl_decoding_stream_p(v_object) : "cfasl.cfasl_decoding_stream_p(v_object) " + "CommonSymbols.NIL != cfasl.cfasl_decoding_stream_p(v_object) " + v_object;
        return v_object.getField3();
    }

    public static SubLObject _csetf_cfasl_decoding_stream_internal_stream(final SubLObject v_object, final SubLObject value) {
        assert NIL != cfasl_decoding_stream_p(v_object) : "cfasl.cfasl_decoding_stream_p(v_object) " + "CommonSymbols.NIL != cfasl.cfasl_decoding_stream_p(v_object) " + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_cfasl_decoding_stream_position(final SubLObject v_object, final SubLObject value) {
        assert NIL != cfasl_decoding_stream_p(v_object) : "cfasl.cfasl_decoding_stream_p(v_object) " + "CommonSymbols.NIL != cfasl.cfasl_decoding_stream_p(v_object) " + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject make_cfasl_decoding_stream(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new cfasl.$cfasl_decoding_stream_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($INTERNAL_STREAM)) {
                _csetf_cfasl_decoding_stream_internal_stream(v_new, current_value);
            } else
                if (pcase_var.eql($POSITION)) {
                    _csetf_cfasl_decoding_stream_position(v_new, current_value);
                } else {
                    Errors.error($str15$Invalid_slot__S_for_construction_, current_arg);
                }

        }
        return v_new;
    }

    public static SubLObject visit_defstruct_cfasl_decoding_stream(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_CFASL_DECODING_STREAM, TWO_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $INTERNAL_STREAM, cfasl_decoding_stream_internal_stream(obj));
        funcall(visitor_fn, obj, $SLOT, $POSITION, cfasl_decoding_stream_position(obj));
        funcall(visitor_fn, obj, $END, MAKE_CFASL_DECODING_STREAM, TWO_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_cfasl_decoding_stream_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_cfasl_decoding_stream(obj, visitor_fn);
    }

    public static SubLObject with_cfasl_input_from_string(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list21);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject stream = NIL;
        SubLObject string = NIL;
        destructuring_bind_must_consp(current, datum, $list21);
        stream = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list21);
        string = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(datum, $list21);
            return NIL;
        }
        final SubLObject body;
        current = body = temp;
        assert NIL != symbolp(stream) : "Types.symbolp(stream) " + "CommonSymbols.NIL != Types.symbolp(stream) " + stream;
        return list(CLET, list(list(stream, list(NEW_CFASL_DECODING_STREAM_FROM_STRING, string))), list(CUNWIND_PROTECT, bq_cons(PROGN, append(body, NIL)), list(CLOSE_CFASL_DECODING_STREAM, stream)));
    }

    public static SubLObject new_cfasl_decoding_stream_from_string(final SubLObject encoding_string) {
        final SubLObject decoding_stream = make_cfasl_decoding_stream(UNPROVIDED);
        final SubLObject internal_stream = make_private_string_input_stream(encoding_string, UNPROVIDED, UNPROVIDED);
        _csetf_cfasl_decoding_stream_internal_stream(decoding_stream, internal_stream);
        _csetf_cfasl_decoding_stream_position(decoding_stream, ZERO_INTEGER);
        return decoding_stream;
    }

    public static SubLObject with_cfasl_input_from_byte_vector(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list31);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject stream = NIL;
        SubLObject byte_vector = NIL;
        destructuring_bind_must_consp(current, datum, $list31);
        stream = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list31);
        byte_vector = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(datum, $list31);
            return NIL;
        }
        final SubLObject body;
        current = body = temp;
        assert NIL != symbolp(stream) : "Types.symbolp(stream) " + "CommonSymbols.NIL != Types.symbolp(stream) " + stream;
        return list(CLET, list(list(stream, list(NEW_CFASL_DECODING_STREAM, byte_vector))), list(CUNWIND_PROTECT, bq_cons(PROGN, append(body, NIL)), list(CLOSE_CFASL_DECODING_STREAM, stream)));
    }

    public static SubLObject new_cfasl_decoding_stream(final SubLObject encoding) {
        assert NIL != cfasl_encoding_p(encoding) : "cfasl.cfasl_encoding_p(encoding) " + "CommonSymbols.NIL != cfasl.cfasl_encoding_p(encoding) " + encoding;
        final SubLObject encoding_string = vector_utilities.byte_vector_to_hex_char_string(encoding);
        return new_cfasl_decoding_stream_from_string(encoding_string);
    }

    public static SubLObject cfasl_decoding_stream_read_byte(final SubLObject decoding_stream, SubLObject eof_error_p, SubLObject eof_value) {
        if (eof_error_p == UNPROVIDED) {
            eof_error_p = T;
        }
        if (eof_value == UNPROVIDED) {
            eof_value = $EOF;
        }
        final SubLObject internal_stream = cfasl_decoding_stream_internal_stream(decoding_stream);
        final SubLObject high_char = read_char(internal_stream, eof_error_p, eof_value, UNPROVIDED);
        SubLObject low_char = NIL;
        if (eof_value.eql(high_char)) {
            return eof_value;
        }
        _csetf_cfasl_decoding_stream_position(decoding_stream, add(cfasl_decoding_stream_position(decoding_stream), ONE_INTEGER));
        low_char = read_char(internal_stream, eof_error_p, eof_value, UNPROVIDED);
        if (eof_value.eql(low_char)) {
            return eof_value;
        }
        _csetf_cfasl_decoding_stream_position(decoding_stream, add(cfasl_decoding_stream_position(decoding_stream), ONE_INTEGER));
        return vector_utilities.hex_chars_to_byte(high_char, low_char);
    }

    public static SubLObject close_cfasl_decoding_stream(final SubLObject decoding_stream) {
        assert NIL != cfasl_decoding_stream_p(decoding_stream) : "cfasl.cfasl_decoding_stream_p(decoding_stream) " + "CommonSymbols.NIL != cfasl.cfasl_decoding_stream_p(decoding_stream) " + decoding_stream;
        return close(cfasl_decoding_stream_internal_stream(decoding_stream), UNPROVIDED);
    }

    public static SubLObject cfasl_decoding_stream_nybble_position(final SubLObject decoding_stream) {
        return cfasl_decoding_stream_position(decoding_stream);
    }

    public static SubLObject cfasl_decode(final SubLObject encoding) {
        assert NIL != cfasl_encoding_p(encoding) : "cfasl.cfasl_encoding_p(encoding) " + "CommonSymbols.NIL != cfasl.cfasl_encoding_p(encoding) " + encoding;
        SubLObject v_object = NIL;
        final SubLObject stream = new_cfasl_decoding_stream(encoding);
        try {
            v_object = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                close_cfasl_decoding_stream(stream);
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return v_object;
    }

    public static SubLObject cfasl_decoding_stream_byte_position(final SubLObject decoding_stream) {
        return integerDivide(cfasl_decoding_stream_nybble_position(decoding_stream), TWO_INTEGER);
    }

    public static SubLObject cfasl_decoding_stream_hexchar_position(final SubLObject decoding_stream) {
        return cfasl_decoding_stream_nybble_position(decoding_stream);
    }

    public static SubLObject cfasl_count_stream_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject cfasl_count_stream_p(final SubLObject v_object) {
        return v_object.getClass() == cfasl.$cfasl_count_stream_native.class ? T : NIL;
    }

    public static SubLObject cfasl_count_stream_position(final SubLObject v_object) {
        assert NIL != cfasl_count_stream_p(v_object) : "cfasl.cfasl_count_stream_p(v_object) " + "CommonSymbols.NIL != cfasl.cfasl_count_stream_p(v_object) " + v_object;
        return v_object.getField2();
    }

    public static SubLObject _csetf_cfasl_count_stream_position(final SubLObject v_object, final SubLObject value) {
        assert NIL != cfasl_count_stream_p(v_object) : "cfasl.cfasl_count_stream_p(v_object) " + "CommonSymbols.NIL != cfasl.cfasl_count_stream_p(v_object) " + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject make_cfasl_count_stream(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new cfasl.$cfasl_count_stream_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($POSITION)) {
                _csetf_cfasl_count_stream_position(v_new, current_value);
            } else {
                Errors.error($str15$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }

    public static SubLObject visit_defstruct_cfasl_count_stream(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_CFASL_COUNT_STREAM, ONE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $POSITION, cfasl_count_stream_position(obj));
        funcall(visitor_fn, obj, $END, MAKE_CFASL_COUNT_STREAM, ONE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_cfasl_count_stream_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_cfasl_count_stream(obj, visitor_fn);
    }

    public static SubLObject with_cfasl_output_to_count_stream(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list74);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject stream = NIL;
        SubLObject count = NIL;
        destructuring_bind_must_consp(current, datum, $list74);
        stream = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list74);
        count = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(datum, $list74);
            return NIL;
        }
        final SubLObject body;
        current = body = temp;
        assert NIL != symbolp(stream) : "Types.symbolp(stream) " + "CommonSymbols.NIL != Types.symbolp(stream) " + stream;
        assert NIL != symbolp(count) : "Types.symbolp(count) " + "CommonSymbols.NIL != Types.symbolp(count) " + count;
        return list(CLET, list(bq_cons(stream, $list75)), list(CUNWIND_PROTECT, bq_cons(PROGN, append(body, list(list(CSETQ, count, list(CFASL_COUNT_STREAM_SIZE, stream))))), list(CLOSE_CFASL_COUNT_STREAM, stream)));
    }

    public static SubLObject new_cfasl_count_stream() {
        final SubLObject stream = make_cfasl_count_stream(UNPROVIDED);
        _csetf_cfasl_count_stream_position(stream, ZERO_INTEGER);
        return stream;
    }

    public static SubLObject cfasl_count_stream_write_byte(final SubLObject v_byte, final SubLObject count_stream) {
        _csetf_cfasl_count_stream_position(count_stream, add(cfasl_count_stream_position(count_stream), ONE_INTEGER));
        return v_byte;
    }

    public static SubLObject cfasl_count_stream_increment(final SubLObject count, final SubLObject count_stream) {
        _csetf_cfasl_count_stream_position(count_stream, add(count, cfasl_count_stream_position(count_stream)));
        return NIL;
    }

    public static SubLObject cfasl_count_stream_size(final SubLObject count_stream) {
        assert NIL != cfasl_count_stream_p(count_stream) : "cfasl.cfasl_count_stream_p(count_stream) " + "CommonSymbols.NIL != cfasl.cfasl_count_stream_p(count_stream) " + count_stream;
        return cfasl_count_stream_position(count_stream);
    }

    public static SubLObject close_cfasl_count_stream(final SubLObject count_stream) {
        assert NIL != cfasl_count_stream_p(count_stream) : "cfasl.cfasl_count_stream_p(count_stream) " + "CommonSymbols.NIL != cfasl.cfasl_count_stream_p(count_stream) " + count_stream;
        return NIL;
    }

    public static SubLObject cfasl_object_size(final SubLObject v_object) {
        SubLObject size = NIL;
        final SubLObject stream = new_cfasl_count_stream();
        try {
            cfasl_output(v_object, stream);
            size = cfasl_count_stream_size(stream);
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                close_cfasl_count_stream(stream);
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return size;
    }

    public static SubLObject cfasl_externalized_object_size(final SubLObject v_object) {
        SubLObject size = NIL;
        final SubLObject stream = new_cfasl_count_stream();
        try {
            cfasl_output_externalized(v_object, stream);
            size = cfasl_count_stream_size(stream);
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                close_cfasl_count_stream(stream);
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return size;
    }

    public static SubLObject with_cfasl_stream_extensions(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list78, append(body, NIL));
    }

    public static SubLObject cfasl_output(final SubLObject v_object, final SubLObject stream) {
        if (NIL != cfasl_compression.cfasl_compress_objectP(v_object)) {
            return cfasl_compression.cfasl_output_object_compressed(v_object, stream);
        }
        return cfasl_output_object(v_object, stream);
    }

    public static SubLObject cfasl_output_externalized(final SubLObject v_object, final SubLObject stream) {
        return cfasl_output_externalization(v_object, stream);
    }

    public static SubLObject cfasl_output_maybe_externalized(final SubLObject v_object, final SubLObject stream, final SubLObject externalizedP) {
        if (NIL != externalizedP) {
            return cfasl_output_externalized(v_object, stream);
        }
        return cfasl_output(v_object, stream);
    }

    public static SubLObject cfasl_output_object(final SubLObject v_object, final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject method_function = method_func(v_object, $cfasl_output_object_method_table$.getGlobalValue());
        if (NIL != method_function) {
            return funcall(method_function, v_object, stream);
        }
        if (NIL == handle_cfasl_extensions(v_object, stream)) {
            SubLObject msg = NIL;
            try {
                thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        cfasl_output_defstruct_recipe(v_object, stream);
                    } catch (final Throwable catch_var) {
                        Errors.handleThrowable(catch_var, NIL);
                    }
                } finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                msg = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
            } finally {
                thread.throwStack.pop();
            }
            if (msg.isString()) {
                cfasl_output_error(v_object, stream);
                return NIL;
            }
        }
        return v_object;
    }

    public static SubLObject cfasl_output_error(final SubLObject v_object, final SubLObject stream) {
        Errors.cerror($$$Use_NIL_instead, $str82$CFASL_cannot_handle____S, v_object);
        return cfasl_output_nil(stream);
    }

    public static SubLObject cfasl_raw_write_byte(final SubLObject v_byte, final SubLObject stream) {
        if (NIL != cfasl_count_stream_p(stream)) {
            return cfasl_count_stream_write_byte(v_byte, stream);
        }
        if (NIL != cfasl_encoding_stream_p(stream)) {
            return cfasl_encoding_stream_write_byte(v_byte, stream);
        }
        return write_byte(v_byte, stream);
    }

    public static SubLObject cfasl_input(final SubLObject stream, SubLObject eof_error_p, SubLObject eof_value) {
        if (eof_error_p == UNPROVIDED) {
            eof_error_p = T;
        }
        if (eof_value == UNPROVIDED) {
            eof_value = $EOF;
        }
        return cfasl_input_internal(stream, eof_error_p, eof_value);
    }

    public static SubLObject cfasl_opcode_peek(final SubLObject stream, SubLObject eof_error_p, SubLObject eof_value) {
        if (eof_error_p == UNPROVIDED) {
            eof_error_p = T;
        }
        if (eof_value == UNPROVIDED) {
            eof_value = $EOF;
        }
        return cfasl_opcode_peek_internal(stream, eof_error_p, eof_value);
    }

    public static SubLObject cfasl_input_object(final SubLObject stream) {
        return cfasl_input_internal(stream, NIL, NIL);
    }

    public static SubLObject cfasl_input_error(final SubLObject stream) {
        Errors.error($str83$Undefined_cfasl_opcode_in__S, stream);
        return NIL;
    }

    public static SubLObject cfasl_input_internal(final SubLObject stream, final SubLObject eof_error_p, final SubLObject eof_value) {
        final SubLObject opcode = cfasl_raw_read_byte(stream);
        if (NIL == opcode) {
            if (NIL != eof_error_p) {
                Errors.error($str84$end_of_file_on_stream__S, stream);
            }
            return eof_value;
        }
        if (NIL != cfasl_immediate_fixnum_opcode(opcode)) {
            return cfasl_extract_immediate_fixnum(opcode);
        }
        final SubLObject cfasl_input_method = cfasl_input_method(opcode);
        if (CFASL_INPUT_ERROR == cfasl_input_method) {
            return Errors.error($str86$Undefined_cfasl_opcode__A_in__S, opcode, stream);
        }
        return funcall(cfasl_input_method, stream);
    }

    public static SubLObject cfasl_opcode_peek_internal(final SubLObject stream, final SubLObject eof_error_p, final SubLObject eof_value) {
        final SubLObject opcode = cfasl_raw_peek_byte(stream);
        if (NIL == opcode) {
            if (NIL != eof_error_p) {
                Errors.error($str84$end_of_file_on_stream__S, stream);
            }
            return eof_value;
        }
        return opcode;
    }

    public static SubLObject cfasl_input_method(final SubLObject cfasl_opcode) {
        return aref($cfasl_input_method_table$.getGlobalValue(), cfasl_opcode);
    }

    public static SubLObject declare_cfasl_opcode(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject variable = NIL;
        SubLObject cfasl_opcode = NIL;
        SubLObject input_function = NIL;
        destructuring_bind_must_consp(current, datum, $list89);
        variable = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list89);
        cfasl_opcode = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list89);
        input_function = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(datum, $list89);
            return NIL;
        }
        assert NIL != symbolp(variable) : "Types.symbolp(variable) " + "CommonSymbols.NIL != Types.symbolp(variable) " + variable;
        assert NIL != integerp(cfasl_opcode) : "Types.integerp(cfasl_opcode) " + "CommonSymbols.NIL != Types.integerp(cfasl_opcode) " + cfasl_opcode;
        assert NIL != symbolp(input_function) : "Types.symbolp(input_function) " + "CommonSymbols.NIL != Types.symbolp(input_function) " + input_function;
        return list(PROGN, list(DEFCONSTANT_PRIVATE, variable, cfasl_opcode), list(REGISTER_CFASL_INPUT_FUNCTION, variable, list(QUOTE, input_function)));
    }

    public static SubLObject register_cfasl_input_function(final SubLObject cfasl_opcode, final SubLObject function) {
        set_aref($cfasl_input_method_table$.getGlobalValue(), cfasl_opcode, function);
        return function;
    }

    public static SubLObject cfasl_raw_peek_byte(final SubLObject stream) {
        final SubLObject v_byte = cfasl_raw_read_byte(stream);
        if (NIL != number_utilities.bytep(v_byte)) {
            unread_byte(v_byte, stream);
        }
        return v_byte;
    }

    public static SubLObject cfasl_raw_read_byte(final SubLObject stream) {
        if (NIL != cfasl_decoding_stream_p(stream)) {
            return cfasl_decoding_stream_read_byte(stream, NIL, NIL);
        }
        return read_byte(stream, NIL, NIL);
    }

    public static SubLObject with_cfasl_area_allocation(final SubLObject macroform, final SubLObject environment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        if (NIL != find($SL2JAVA, $features$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return bq_cons(PROGN, append(body, NIL));
        }
        return list(PIF, $cfasl_input_to_static_area$, bq_cons(WITH_STATIC_AREA, append(body, NIL)), bq_cons(PROGN, append(body, NIL)));
    }

    public static SubLObject within_cfasl_externalization(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list99, append(body, NIL));
    }

    public static SubLObject without_cfasl_externalization(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list100, append(body, NIL));
    }

    public static SubLObject within_cfasl_externalization_p() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $within_cfasl_externalization$.getDynamicValue(thread);
    }

    public static SubLObject without_cfasl_channel_externalization(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list101, append(body, NIL));
    }

    public static SubLObject cfasl_channel_externalizedP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $cfasl_channel_externalizedP$.getDynamicValue(thread);
    }

    public static SubLObject declare_cfasl_extension_opcode(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject variable = NIL;
        SubLObject cfasl_opcode = NIL;
        SubLObject pred_func = NIL;
        SubLObject output_func = NIL;
        SubLObject input_func = NIL;
        destructuring_bind_must_consp(current, datum, $list103);
        variable = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list103);
        cfasl_opcode = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list103);
        pred_func = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list103);
        output_func = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list103);
        input_func = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(datum, $list103);
            return NIL;
        }
        assert NIL != symbolp(variable) : "Types.symbolp(variable) " + "CommonSymbols.NIL != Types.symbolp(variable) " + variable;
        assert NIL != integerp(cfasl_opcode) : "Types.integerp(cfasl_opcode) " + "CommonSymbols.NIL != Types.integerp(cfasl_opcode) " + cfasl_opcode;
        assert NIL != symbolp(pred_func) : "Types.symbolp(pred_func) " + "CommonSymbols.NIL != Types.symbolp(pred_func) " + pred_func;
        assert NIL != symbolp(output_func) : "Types.symbolp(output_func) " + "CommonSymbols.NIL != Types.symbolp(output_func) " + output_func;
        assert NIL != symbolp(input_func) : "Types.symbolp(input_func) " + "CommonSymbols.NIL != Types.symbolp(input_func) " + input_func;
        return list(PROGN, list(DECLARE_CFASL_OPCODE, variable, cfasl_opcode, input_func), list(REGISTER_CFASL_EXTENSION, variable, list(QUOTE, pred_func), list(QUOTE, output_func), list(QUOTE, input_func)));
    }

    public static SubLObject register_cfasl_extension(final SubLObject cfasl_number, final SubLObject pred_func, final SubLObject output_func, final SubLObject input_func) {
        SubLObject existing = assoc(cfasl_number, $cfasl_extensions$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
        if (NIL == existing) {
            existing = make_list(FOUR_INTEGER, cfasl_number);
            $cfasl_extensions$.setGlobalValue(cons(existing, $cfasl_extensions$.getGlobalValue()));
        }
        set_nth(ONE_INTEGER, existing, pred_func);
        set_nth(TWO_INTEGER, existing, output_func);
        set_nth(THREE_INTEGER, existing, input_func);
        return cfasl_number;
    }

    public static SubLObject handle_cfasl_extensions(final SubLObject v_object, final SubLObject stream) {
        SubLObject handled = NIL;
        if (NIL == handled) {
            SubLObject csome_list_var = $cfasl_extensions$.getGlobalValue();
            SubLObject extension = NIL;
            extension = csome_list_var.first();
            while ((NIL == handled) && (NIL != csome_list_var)) {
                if (NIL != funcall(second(extension), v_object)) {
                    funcall(third(extension), v_object, stream);
                    handled = T;
                }
                csome_list_var = csome_list_var.rest();
                extension = csome_list_var.first();
            } 
        }
        return handled;
    }

    public static SubLObject cfasl_output_narrow_opcode(final SubLObject opcode, final SubLObject stream) {
        cfasl_raw_write_byte(opcode, stream);
        return opcode;
    }

    public static SubLObject cfasl_output_opcode(final SubLObject opcode, final SubLObject stream) {
        if (NIL != cfasl_narrow_opcode_p(opcode)) {
            cfasl_output_narrow_opcode(opcode, stream);
        } else {
            cfasl_output_wide_opcode(opcode, stream);
        }
        return opcode;
    }

    public static SubLObject cfasl_output_externalization(final SubLObject v_object, final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        cfasl_raw_write_byte($cfasl_opcode_externalization$.getGlobalValue(), stream);
        SubLObject v_answer = NIL;
        final SubLObject _prev_bind_0 = $within_cfasl_externalization$.currentBinding(thread);
        try {
            $within_cfasl_externalization$.bind(T, thread);
            v_answer = cfasl_output(v_object, stream);
        } finally {
            $within_cfasl_externalization$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }

    public static SubLObject cfasl_input_externalization(final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = NIL;
        final SubLObject _prev_bind_0 = $within_cfasl_externalization$.currentBinding(thread);
        try {
            $within_cfasl_externalization$.bind(T, thread);
            v_answer = cfasl_input_object(stream);
        } finally {
            $within_cfasl_externalization$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }

    public static SubLObject cfasl_output_defstruct_recipe(final SubLObject v_object, final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        cfasl_output_opcode($cfasl_opcode_defstruct_recipe$.getGlobalValue(), stream);
        final SubLObject _prev_bind_0 = $current_cfasl_defstruct_output_stream$.currentBinding(thread);
        try {
            $current_cfasl_defstruct_output_stream$.bind(stream, thread);
            visitation.visit_defstruct(v_object, symbol_function(CFASL_OUTPUT_DEFSTRUCT_RECIPE_VISITORFN));
        } finally {
            $current_cfasl_defstruct_output_stream$.rebind(_prev_bind_0, thread);
        }
        return v_object;
    }

    public static SubLObject cfasl_output_defstruct_recipe_visitorfn(final SubLObject obj, final SubLObject phase, final SubLObject param_a, final SubLObject param_b) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject stream = $current_cfasl_defstruct_output_stream$.getDynamicValue(thread);
        if (phase.eql($BEGIN)) {
            cfasl_output(param_a, stream);
            cfasl_output(param_b, stream);
        } else
            if (phase.eql($SLOT)) {
                cfasl_output(param_a, stream);
                cfasl_output(param_b, stream);
            } else
                if (phase.eql($END)) {
                }


        return obj;
    }

    public static SubLObject cfasl_input_defstruct_recipe(final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject constructor_fn = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        final SubLObject num_of_slots = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        SubLObject plist = NIL;
        SubLObject cursor = NIL;
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!constructor_fn.isFunctionSpec())) {
            Errors.error($str111$Error__expected_constructor_for_d, constructor_fn);
        }
        plist = cursor = make_list(add(num_of_slots, num_of_slots), UNPROVIDED);
        SubLObject i;
        SubLObject slot_name;
        SubLObject slot_value;
        for (i = NIL, i = ZERO_INTEGER; i.numL(num_of_slots); i = add(i, ONE_INTEGER)) {
            slot_name = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            slot_value = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!slot_name.isKeyword())) {
                Errors.error($str112$Expected_keyword_at_slot___A_of_s, i, constructor_fn, slot_name);
            }
            set_nth(ZERO_INTEGER, cursor, slot_name);
            set_nth(ONE_INTEGER, cursor, slot_value);
            cursor = cddr(cursor);
        }
        return funcall(constructor_fn, plist);
    }

    public static SubLObject cfasl_immediate_fixnump(final SubLObject v_object) {
        return makeBoolean((v_object.isFixnum() && v_object.numGE(ZERO_INTEGER)) && v_object.numL($cfasl_immediate_fixnum_cutoff$.getGlobalValue()));
    }

    public static SubLObject cfasl_output_immediate_fixnum(final SubLObject v_object, final SubLObject stream) {
        cfasl_raw_write_byte(add($cfasl_immediate_fixnum_offset$.getGlobalValue(), v_object), stream);
        return v_object;
    }

    public static SubLObject cfasl_immediate_fixnum_opcode(final SubLObject opcode) {
        return numGE(opcode, $cfasl_immediate_fixnum_offset$.getGlobalValue());
    }

    public static SubLObject cfasl_extract_immediate_fixnum(final SubLObject opcode) {
        return subtract(opcode, $cfasl_immediate_fixnum_offset$.getGlobalValue());
    }

    public static SubLObject cfasl_output_object_integer_method(final SubLObject v_object, final SubLObject stream) {
        return cfasl_output_integer(v_object, stream);
    }

    public static SubLObject cfasl_output_integer(final SubLObject integer, final SubLObject stream) {
        if (NIL != cfasl_immediate_fixnump(integer)) {
            return cfasl_output_immediate_fixnum(integer, stream);
        }
        final SubLObject positive = plusp(integer);
        final SubLObject value = (NIL != positive) ? integer : abs(integer);
        if (value.numL($int$128)) {
            if (NIL != positive) {
                cfasl_raw_write_byte($cfasl_opcode_p_8bit_int$.getGlobalValue(), stream);
            } else {
                cfasl_raw_write_byte($cfasl_opcode_n_8bit_int$.getGlobalValue(), stream);
            }
            cfasl_output_integer_internal(value, ONE_INTEGER, stream);
        } else
            if (value.numL($int$32768)) {
                if (NIL != positive) {
                    cfasl_raw_write_byte($cfasl_opcode_p_16bit_int$.getGlobalValue(), stream);
                } else {
                    cfasl_raw_write_byte($cfasl_opcode_n_16bit_int$.getGlobalValue(), stream);
                }
                cfasl_output_integer_internal(value, TWO_INTEGER, stream);
            } else
                if (value.numL($int$8388608)) {
                    if (NIL != positive) {
                        cfasl_raw_write_byte($cfasl_opcode_p_24bit_int$.getGlobalValue(), stream);
                    } else {
                        cfasl_raw_write_byte($cfasl_opcode_n_24bit_int$.getGlobalValue(), stream);
                    }
                    cfasl_output_integer_internal(value, THREE_INTEGER, stream);
                } else
                    if (value.numL($int$2147483648)) {
                        if (NIL != positive) {
                            cfasl_raw_write_byte($cfasl_opcode_p_32bit_int$.getGlobalValue(), stream);
                        } else {
                            cfasl_raw_write_byte($cfasl_opcode_n_32bit_int$.getGlobalValue(), stream);
                        }
                        cfasl_output_integer_internal(value, FOUR_INTEGER, stream);
                    } else {
                        final SubLObject bignum_spec = disassemble_integer_to_fixnums(integer);
                        SubLObject current;
                        final SubLObject datum = current = bignum_spec;
                        SubLObject sign = NIL;
                        destructuring_bind_must_consp(current, datum, $list129);
                        sign = current.first();
                        final SubLObject fixnums;
                        current = fixnums = current.rest();
                        if (sign.isNegative()) {
                            cfasl_raw_write_byte($cfasl_opcode_n_bignum$.getGlobalValue(), stream);
                        } else {
                            cfasl_raw_write_byte($cfasl_opcode_p_bignum$.getGlobalValue(), stream);
                        }
                        cfasl_output(length(fixnums), stream);
                        SubLObject cdolist_list_var = fixnums;
                        SubLObject fixnum = NIL;
                        fixnum = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            cfasl_output(fixnum, stream);
                            cdolist_list_var = cdolist_list_var.rest();
                            fixnum = cdolist_list_var.first();
                        } 
                    }



        return integer;
    }

    public static SubLObject cfasl_output_integer_internal(final SubLObject integer, final SubLObject bytes, final SubLObject stream) {
        if ((NIL != cfasl_encoding_stream_p(stream)) || (!bytes.numLE(EIGHT_INTEGER))) {
            if (bytes.numE(ONE_INTEGER)) {
                cfasl_raw_write_byte(integer, stream);
            } else {
                final SubLObject low_part = mod(integer, $int$256);
                final SubLObject high_part = integerDivide(subtract(integer, low_part), $int$256);
                cfasl_raw_write_byte(low_part, stream);
                cfasl_output_integer_internal(high_part, subtract(bytes, ONE_INTEGER), stream);
            }
            return integer;
        }
        if (NIL != cfasl_count_stream_p(stream)) {
            cfasl_count_stream_increment(bytes, stream);
            return integer;
        }
        return write_positive_integer_as_byte_sequence(integer, bytes, stream, UNPROVIDED);
    }

    public static SubLObject cfasl_input_p_8bit_int(final SubLObject stream) {
        return cfasl_input_integer(ONE_INTEGER, stream);
    }

    public static SubLObject cfasl_input_n_8bit_int(final SubLObject stream) {
        return minus(cfasl_input_integer(ONE_INTEGER, stream));
    }

    public static SubLObject cfasl_input_p_16bit_int(final SubLObject stream) {
        return cfasl_input_integer(TWO_INTEGER, stream);
    }

    public static SubLObject cfasl_input_n_16bit_int(final SubLObject stream) {
        return minus(cfasl_input_integer(TWO_INTEGER, stream));
    }

    public static SubLObject cfasl_input_p_24bit_int(final SubLObject stream) {
        return cfasl_input_integer(THREE_INTEGER, stream);
    }

    public static SubLObject cfasl_input_n_24bit_int(final SubLObject stream) {
        return minus(cfasl_input_integer(THREE_INTEGER, stream));
    }

    public static SubLObject cfasl_input_p_32bit_int(final SubLObject stream) {
        return cfasl_input_integer(FOUR_INTEGER, stream);
    }

    public static SubLObject cfasl_input_n_32bit_int(final SubLObject stream) {
        return minus(cfasl_input_integer(FOUR_INTEGER, stream));
    }

    public static SubLObject assemble_2_fixnums_to_non_negative_integer(final SubLObject fixnum0, final SubLObject fixnum1) {
        return add(fixnum0, ash(fixnum1, EIGHT_INTEGER));
    }

    public static SubLObject assemble_3_fixnums_to_non_negative_integer(final SubLObject fixnum0, final SubLObject fixnum1, final SubLObject fixnum2) {
        return add(assemble_2_fixnums_to_non_negative_integer(fixnum0, fixnum1), ash(fixnum2, SIXTEEN_INTEGER));
    }

    public static SubLObject assemble_4_fixnums_to_non_negative_integer(final SubLObject fixnum0, final SubLObject fixnum1, final SubLObject fixnum2, final SubLObject fixnum3) {
        return add(assemble_3_fixnums_to_non_negative_integer(fixnum0, fixnum1, fixnum2), ash(fixnum3, $int$24));
    }

    public static SubLObject cfasl_input_integer(final SubLObject bytes, final SubLObject stream) {
        if (NIL == cfasl_decoding_stream_p(stream)) {
            return read_byte_sequence_to_positive_integer(bytes, stream, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        if (bytes.numG(FOUR_INTEGER)) {
            final SubLObject high_recursive = cfasl_input_integer(subtract(bytes, FOUR_INTEGER), stream);
            final SubLObject low_4 = cfasl_input_integer(FOUR_INTEGER, stream);
            return add(ash(high_recursive, $int$32), low_4);
        }
        if (bytes.eql(FOUR_INTEGER)) {
            final SubLObject fixnum0 = cfasl_raw_read_byte(stream);
            final SubLObject fixnum2 = cfasl_raw_read_byte(stream);
            final SubLObject fixnum3 = cfasl_raw_read_byte(stream);
            final SubLObject fixnum4 = cfasl_raw_read_byte(stream);
            return assemble_4_fixnums_to_non_negative_integer(fixnum0, fixnum2, fixnum3, fixnum4);
        }
        if (bytes.eql(THREE_INTEGER)) {
            final SubLObject fixnum0 = cfasl_raw_read_byte(stream);
            final SubLObject fixnum2 = cfasl_raw_read_byte(stream);
            final SubLObject fixnum3 = cfasl_raw_read_byte(stream);
            return assemble_3_fixnums_to_non_negative_integer(fixnum0, fixnum2, fixnum3);
        }
        if (bytes.eql(TWO_INTEGER)) {
            final SubLObject fixnum0 = cfasl_raw_read_byte(stream);
            final SubLObject fixnum2 = cfasl_raw_read_byte(stream);
            return assemble_2_fixnums_to_non_negative_integer(fixnum0, fixnum2);
        }
        if (bytes.eql(ONE_INTEGER)) {
            final SubLObject fixnum0 = cfasl_raw_read_byte(stream);
            return fixnum0;
        }
        if (bytes.eql(ZERO_INTEGER)) {
            return ZERO_INTEGER;
        }
        return NIL;
    }

    public static SubLObject cfasl_input_p_bignum(final SubLObject stream) {
        return cfasl_input_bignum(ONE_INTEGER, stream);
    }

    public static SubLObject cfasl_input_n_bignum(final SubLObject stream) {
        return cfasl_input_bignum(MINUS_ONE_INTEGER, stream);
    }

    public static SubLObject cfasl_input_bignum(final SubLObject sign, final SubLObject stream) {
        final SubLObject count = cfasl_input_object(stream);
        final SubLObject fixnums = make_list(add(count, ONE_INTEGER), ZERO_INTEGER);
        rplaca(fixnums, sign);
        SubLObject tail;
        for (tail = NIL, tail = fixnums.rest(); NIL != tail; tail = tail.rest()) {
            rplaca(tail, cfasl_input_object(stream));
        }
        SubLObject bignum = NIL;
        bignum = apply(symbol_function(ASSEMBLE_FIXNUMS_TO_INTEGER), fixnums);
        return bignum;
    }

    public static SubLObject cfasl_output_object_float_method(final SubLObject v_object, final SubLObject stream) {
        return cfasl_output_float(v_object, stream);
    }

    public static SubLObject cfasl_output_float(final SubLObject v_object, final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject signif = integer_decode_float(v_object);
        final SubLObject exp = thread.secondMultipleValue();
        final SubLObject sign = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (v_object.isNegative()) {
            cfasl_raw_write_byte($cfasl_opcode_n_float$.getGlobalValue(), stream);
        } else {
            cfasl_raw_write_byte($cfasl_opcode_p_float$.getGlobalValue(), stream);
        }
        cfasl_output_integer(signif, stream);
        cfasl_output_integer(exp, stream);
        return v_object;
    }

    public static SubLObject cfasl_input_p_float(final SubLObject stream) {
        return cfasl_input_float(stream);
    }

    public static SubLObject cfasl_input_n_float(final SubLObject stream) {
        return minus(cfasl_input_float(stream));
    }

    public static SubLObject cfasl_input_float(final SubLObject stream) {
        final SubLObject signif = cfasl_input_object(stream);
        final SubLObject exp = cfasl_input_object(stream);
        return scale_float(sublisp_float(signif, UNPROVIDED), exp);
    }

    public static SubLObject cfasl_output_object_symbol_method(final SubLObject v_object, final SubLObject stream) {
        if (NIL == v_object) {
            return cfasl_output_nil(stream);
        }
        if (NIL != cfasl_common_symbol_p(v_object)) {
            return cfasl_output_common_symbol(v_object, stream);
        }
        if (v_object.isKeyword()) {
            return cfasl_output_keyword(v_object, stream);
        }
        return cfasl_output_other_symbol(v_object, stream);
    }

    public static SubLObject cfasl_output_keyword(final SubLObject v_object, final SubLObject stream) {
        cfasl_raw_write_byte($cfasl_opcode_keyword$.getGlobalValue(), stream);
        cfasl_output_string(symbol_name(v_object), stream);
        return v_object;
    }

    public static SubLObject cfasl_input_keyword(final SubLObject stream) {
        SubLObject name = cfasl_input_object(stream);
        if (CHAR_colon.eql(Strings.sublisp_char(name, ZERO_INTEGER))) {
            name = subseq(name, ONE_INTEGER, UNPROVIDED);
        }
        return make_keyword(name);
    }

    public static SubLObject cfasl_output_other_symbol(final SubLObject v_object, final SubLObject stream) {
        cfasl_raw_write_byte($cfasl_opcode_other_symbol$.getGlobalValue(), stream);
        if (NIL == cyc_package_symbol_p(v_object)) {
            final SubLObject v_package = symbol_package(v_object);
            cfasl_output(v_package, stream);
        }
        cfasl_output_string(symbol_name(v_object), stream);
        return v_object;
    }

    public static SubLObject cyc_package_symbol_p(final SubLObject v_object) {
        return makeBoolean((v_object.isSymbol() && (!v_object.isKeyword())) && ($cyc_package$.getGlobalValue().eql(symbol_package(v_object)) || v_object.eql(find_symbol(symbol_name(v_object), $cyc_package$.getGlobalValue()))));
    }

    public static SubLObject cfasl_input_other_symbol(final SubLObject stream) {
        final SubLObject input = cfasl_input_object(stream);
        if (input.isString()) {
            final SubLObject name = input;
            return intern(name, $cyc_package$.getGlobalValue());
        }
        final SubLObject v_package = input;
        final SubLObject name2 = cfasl_input_object(stream);
        if (NIL == v_package) {
            return make_symbol(name2);
        }
        return intern(name2, v_package);
    }

    public static SubLObject cfasl_output_nil(final SubLObject stream) {
        cfasl_raw_write_byte($cfasl_opcode_nil$.getGlobalValue(), stream);
        return NIL;
    }

    public static SubLObject cfasl_input_nil(final SubLObject stream) {
        return NIL;
    }

    public static SubLObject cfasl_set_common_symbols(final SubLObject symbols) {
        $cfasl_common_symbols$.setDynamicValue(apply(symbol_function(VECTOR), symbols));
        return NIL;
    }

    public static SubLObject with_cfasl_common_symbols(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject symbols = NIL;
        destructuring_bind_must_consp(current, datum, $list143);
        symbols = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, $list144, list(CFASL_SET_COMMON_SYMBOLS, symbols), append(body, NIL));
    }

    public static SubLObject cfasl_set_common_symbols_simple(final SubLObject symbols) {
        $cfasl_common_symbols$.setDynamicValue(symbols);
        return NIL;
    }

    public static SubLObject with_cfasl_common_symbols_simple(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject symbols = NIL;
        destructuring_bind_must_consp(current, datum, $list143);
        symbols = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, $list144, list(CFASL_SET_COMMON_SYMBOLS_SIMPLE, symbols), append(body, NIL));
    }

    public static SubLObject cfasl_current_common_symbols() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ($cfasl_common_symbols$.getDynamicValue(thread).isVector()) {
            return vector_utilities.vector_elements($cfasl_common_symbols$.getDynamicValue(thread), UNPROVIDED);
        }
        return $cfasl_common_symbols$.getDynamicValue(thread);
    }

    public static SubLObject cfasl_common_symbol_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean(((NIL != $cfasl_common_symbols$.getDynamicValue(thread)) && v_object.isSymbol()) && (NIL != position(v_object, $cfasl_common_symbols$.getDynamicValue(thread), symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject cfasl_encode_common_symbol(final SubLObject symbol) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return position(symbol, $cfasl_common_symbols$.getDynamicValue(thread), symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject cfasl_decode_common_symbol(final SubLObject integer) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $cfasl_common_symbols$.getDynamicValue(thread).isVector() ? aref($cfasl_common_symbols$.getDynamicValue(thread), integer) : nth(integer, $cfasl_common_symbols$.getDynamicValue(thread));
    }

    public static SubLObject cfasl_output_common_symbol(final SubLObject symbol, final SubLObject stream) {
        final SubLObject encoding = cfasl_encode_common_symbol(symbol);
        cfasl_raw_write_byte($cfasl_opcode_common_symbol$.getGlobalValue(), stream);
        cfasl_output_integer(encoding, stream);
        return symbol;
    }

    public static SubLObject cfasl_input_common_symbol(final SubLObject stream) {
        final SubLObject encoding = cfasl_input_object(stream);
        final SubLObject symbol = cfasl_decode_common_symbol(encoding);
        if (NIL == symbol) {
            Errors.cerror($str147$Use_NIL_, $str148$Common_symbol_at_index__D_was_not, encoding, $cfasl_common_symbols$);
        }
        return symbol;
    }

    public static SubLObject cfasl_output_object_cons_method(final SubLObject v_object, final SubLObject stream) {
        if (NIL != list_utilities.proper_list_p(v_object)) {
            return cfasl_output_list(v_object, stream);
        }
        return cfasl_output_dotted_list(v_object, stream);
    }

    public static SubLObject register_cfasl_list_method(final SubLObject method_key, final SubLObject pred_func, final SubLObject output_func) {
        SubLObject existing = assoc(method_key, $cfasl_list_methods$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
        if (NIL == existing) {
            existing = make_list(THREE_INTEGER, method_key);
            $cfasl_list_methods$.setGlobalValue(cons(existing, $cfasl_list_methods$.getGlobalValue()));
        }
        set_nth(ONE_INTEGER, existing, pred_func);
        set_nth(TWO_INTEGER, existing, output_func);
        return method_key;
    }

    public static SubLObject handle_cfasl_list_methods(final SubLObject v_object, final SubLObject stream) {
        SubLObject handled = NIL;
        if (NIL == handled) {
            SubLObject csome_list_var = $cfasl_list_methods$.getGlobalValue();
            SubLObject list_method = NIL;
            list_method = csome_list_var.first();
            while ((NIL == handled) && (NIL != csome_list_var)) {
                if (NIL != funcall(second(list_method), v_object)) {
                    funcall(third(list_method), v_object, stream);
                    handled = T;
                }
                csome_list_var = csome_list_var.rest();
                list_method = csome_list_var.first();
            } 
        }
        return handled;
    }

    public static SubLObject cfasl_output_list(final SubLObject list, final SubLObject stream) {
        final SubLObject length = list_length(list);
        if (NIL == length) {
            Errors.cerror($$$Output_NIL_instead, $str154$Trying_to_output_a_circular_list_);
            return cfasl_output_nil(stream);
        }
        if (length.numE(ZERO_INTEGER)) {
            return cfasl_output_nil(stream);
        }
        if ((NIL != $cfasl_list_methods$.getGlobalValue()) && (NIL != handle_cfasl_list_methods(list, stream))) {
            return NIL;
        }
        cfasl_raw_write_byte($cfasl_opcode_list$.getGlobalValue(), stream);
        cfasl_output_integer(length, stream);
        SubLObject cdolist_list_var = list;
        SubLObject item = NIL;
        item = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            cfasl_output(item, stream);
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        } 
        return list;
    }

    public static SubLObject cfasl_input_list(final SubLObject stream) {
        final SubLObject length = cfasl_input_object(stream);
        SubLObject list = NIL;
        SubLObject list_item = NIL;
        list = make_list(length, UNPROVIDED);
        SubLObject cell;
        for (cell = NIL, cell = list; NIL != cell; cell = cell.rest()) {
            list_item = cfasl_input_object(stream);
            rplaca(cell, list_item);
        }
        return list;
    }

    public static SubLObject cfasl_output_dotted_list(final SubLObject v_object, final SubLObject stream) {
        final SubLObject length = list_utilities.dotted_length(v_object);
        cfasl_raw_write_byte($cfasl_opcode_dotted_list$.getGlobalValue(), stream);
        cfasl_output_integer(length, stream);
        SubLObject i;
        SubLObject cons;
        for (i = NIL, cons = NIL, i = ZERO_INTEGER, cons = v_object; !i.numE(length); i = add(i, ONE_INTEGER) , cons = cons.rest()) {
            cfasl_output(cons.first(), stream);
        }
        cfasl_output(cons, stream);
        return v_object;
    }

    public static SubLObject cfasl_input_dotted_list(final SubLObject stream) {
        final SubLObject length = cfasl_input_object(stream);
        SubLObject list = NIL;
        if (length.numE(ONE_INTEGER)) {
            list = cons(NIL, NIL);
            rplaca(list, cfasl_input_object(stream));
            rplacd(list, cfasl_input_object(stream));
        } else {
            list = make_list(length, UNPROVIDED);
            SubLObject cell;
            for (cell = NIL, cell = list; NIL != cell.rest(); cell = cell.rest()) {
                rplaca(cell, cfasl_input_object(stream));
            }
            rplaca(cell, cfasl_input_object(stream));
            rplacd(cell, cfasl_input_object(stream));
        }
        return list;
    }

    public static SubLObject cfasl_output_object_vector_method(final SubLObject v_object, final SubLObject stream) {
        if (NIL != vector_utilities.byte_vector_p(v_object)) {
            return cfasl_output_byte_vector(v_object, stream);
        }
        return cfasl_output_general_vector(v_object, stream);
    }

    public static SubLObject cfasl_output_general_vector(final SubLObject vector, final SubLObject stream) {
        cfasl_raw_write_byte($cfasl_opcode_general_vector$.getGlobalValue(), stream);
        final SubLObject length = length(vector);
        cfasl_output_integer(length, stream);
        SubLObject i;
        for (i = NIL, i = ZERO_INTEGER; i.numL(length); i = add(i, ONE_INTEGER)) {
            cfasl_output(aref(vector, i), stream);
        }
        return vector;
    }

    public static SubLObject cfasl_input_general_vector(final SubLObject stream) {
        final SubLObject length = cfasl_input_object(stream);
        SubLObject vector = NIL;
        vector = make_vector(length, UNPROVIDED);
        SubLObject i;
        for (i = NIL, i = ZERO_INTEGER; i.numL(length); i = add(i, ONE_INTEGER)) {
            set_aref(vector, i, cfasl_input_object(stream));
        }
        return vector;
    }

    public static SubLObject cfasl_output_byte_vector(final SubLObject byte_vector, final SubLObject stream) {
        cfasl_raw_write_byte($cfasl_opcode_byte_vector$.getGlobalValue(), stream);
        final SubLObject length = length(byte_vector);
        cfasl_output_integer(length, stream);
        SubLObject i;
        for (i = NIL, i = ZERO_INTEGER; i.numL(length); i = add(i, ONE_INTEGER)) {
            cfasl_raw_write_byte(aref(byte_vector, i), stream);
        }
        return byte_vector;
    }

    public static SubLObject cfasl_input_byte_vector(final SubLObject stream) {
        final SubLObject length = cfasl_input_object(stream);
        SubLObject byte_vector = NIL;
        byte_vector = make_vector(length, UNPROVIDED);
        SubLObject i;
        for (i = NIL, i = ZERO_INTEGER; i.numL(length); i = add(i, ONE_INTEGER)) {
            set_aref(byte_vector, i, cfasl_raw_read_byte(stream));
        }
        return byte_vector;
    }

    public static SubLObject cfasl_output_object_string_method(final SubLObject v_object, final SubLObject stream) {
        return cfasl_output_string(v_object, stream);
    }

    public static SubLObject cfasl_output_string(final SubLObject string, final SubLObject stream) {
        cfasl_raw_write_byte($cfasl_opcode_string$.getGlobalValue(), stream);
        final SubLObject length = length(string);
        cfasl_output_integer(length, stream);
        if (NIL != cfasl_encoding_stream_p(stream)) {
            SubLObject i;
            for (i = NIL, i = ZERO_INTEGER; i.numL(length); i = add(i, ONE_INTEGER)) {
                cfasl_raw_write_byte(char_code(Strings.sublisp_char(string, i)), stream);
            }
            return string;
        }
        if (NIL != cfasl_count_stream_p(stream)) {
            cfasl_count_stream_increment(length, stream);
            return string;
        }
        return write_string_to_byte_sequence(string, stream, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject cfasl_input_string(final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject length = cfasl_input_object(stream);
        SubLObject string = NIL;
        if ($cfasl_input_string_resource$.getDynamicValue(thread).isString() && length.numE(length($cfasl_input_string_resource$.getDynamicValue(thread)))) {
            string = $cfasl_input_string_resource$.getDynamicValue(thread);
        } else {
            string = Strings.make_string(length, UNPROVIDED);
        }
        if (NIL == cfasl_decoding_stream_p(stream)) {
            return read_byte_sequence_into_string(string, stream, UNPROVIDED, UNPROVIDED);
        }
        SubLObject i;
        for (i = NIL, i = ZERO_INTEGER; i.numL(length); i = add(i, ONE_INTEGER)) {
            Strings.set_char(string, i, code_char(cfasl_raw_read_byte(stream)));
        }
        return string;
    }

    public static SubLObject cfasl_output_object_character_method(final SubLObject v_object, final SubLObject stream) {
        return cfasl_output_character(v_object, stream);
    }

    public static SubLObject cfasl_output_character(final SubLObject v_object, final SubLObject stream) {
        cfasl_raw_write_byte($cfasl_opcode_character$.getGlobalValue(), stream);
        cfasl_raw_write_byte(char_code(v_object), stream);
        return v_object;
    }

    public static SubLObject cfasl_input_character(final SubLObject stream) {
        return code_char(cfasl_raw_read_byte(stream));
    }

    public static SubLObject cfasl_output_object_hash_table_method(final SubLObject v_object, final SubLObject stream) {
        return cfasl_output_hashtable(v_object, stream);
    }

    public static SubLObject cfasl_output_hashtable(final SubLObject v_object, final SubLObject stream) {
        cfasl_raw_write_byte($cfasl_opcode_hashtable$.getGlobalValue(), stream);
        final SubLObject test = hash_table_utilities.hash_test_to_symbol(hash_table_test(v_object));
        final SubLObject size = hash_table_count(v_object);
        cfasl_output(test, stream);
        cfasl_output_integer(size, stream);
        SubLObject key = NIL;
        SubLObject value = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator(v_object);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                key = getEntryKey(cdohash_entry);
                value = getEntryValue(cdohash_entry);
                cfasl_output(key, stream);
                cfasl_output(value, stream);
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        return v_object;
    }

    public static SubLObject cfasl_input_hashtable(final SubLObject stream) {
        SubLObject test = cfasl_input_object(stream);
        final SubLObject size = cfasl_input_object(stream);
        SubLObject hashtable = NIL;
        final SubLObject pcase_var = test;
        if (((pcase_var.eql(EQ) || pcase_var.eql(EQL)) || pcase_var.eql(EQUAL)) || pcase_var.eql(EQUALP)) {
            test = symbol_function(test);
        }
        hashtable = make_hash_table(size, test, UNPROVIDED);
        SubLObject i;
        SubLObject key;
        SubLObject value;
        for (i = NIL, i = ZERO_INTEGER; i.numL(size); i = add(i, ONE_INTEGER)) {
            key = cfasl_input_object(stream);
            value = cfasl_input_object(stream);
            sethash(key, hashtable, value);
        }
        return hashtable;
    }

    public static SubLObject cfasl_output_object_guid_method(final SubLObject v_object, final SubLObject stream) {
        return cfasl_output_guid(v_object, stream);
    }

    public static SubLObject cfasl_output_guid(final SubLObject guid, final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == $terse_guid_serialization_enabledP$.getDynamicValue(thread)) {
            return cfasl_output_legacy_guid(guid, stream);
        }
        cfasl_raw_write_byte($cfasl_opcode_guid$.getGlobalValue(), stream);
        final SubLObject byte_vector = Guids.disassemble_guid_to_fixnums(guid, UNPROVIDED);
        SubLObject i;
        for (i = NIL, i = ZERO_INTEGER; i.numL(SIXTEEN_INTEGER); i = add(i, ONE_INTEGER)) {
            cfasl_raw_write_byte(aref(byte_vector, i), stream);
        }
        return guid;
    }

    public static SubLObject cfasl_input_guid(final SubLObject stream) {
        final SubLObject byte_vector = cfasl_input_guid_byte_vector(stream);
        SubLObject guid = NIL;
        guid = Guids.assemble_fixnums_to_guid(byte_vector);
        return guid;
    }

    public static SubLObject cfasl_input_guid_byte_vector(final SubLObject stream) {
        final SubLObject byte_vector = make_vector(SIXTEEN_INTEGER, NIL);
        SubLObject i;
        for (i = NIL, i = ZERO_INTEGER; i.numL(SIXTEEN_INTEGER); i = add(i, ONE_INTEGER)) {
            set_aref(byte_vector, i, cfasl_raw_read_byte(stream));
        }
        return byte_vector;
    }

    public static SubLObject cfasl_output_legacy_guid(final SubLObject guid, final SubLObject stream) {
        cfasl_raw_write_byte($cfasl_opcode_legacy_guid$.getGlobalValue(), stream);
        final SubLObject string = Guids.guid_to_string(guid);
        cfasl_output_string(string, stream);
        return guid;
    }

    public static SubLObject cfasl_input_legacy_guid(final SubLObject stream) {
        final SubLObject string = cfasl_input_guid_string(stream);
        SubLObject guid = NIL;
        guid = Guids.string_to_guid(string);
        return guid;
    }

    public static SubLObject cfasl_input_guid_string(final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject string = NIL;
        final SubLObject _prev_bind_0 = $cfasl_input_string_resource$.currentBinding(thread);
        try {
            $cfasl_input_string_resource$.bind($cfasl_input_guid_string_resource$.getDynamicValue(thread), thread);
            string = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        } finally {
            $cfasl_input_string_resource$.rebind(_prev_bind_0, thread);
        }
        return string;
    }

    public static SubLObject get_new_cfasl_input_guid_string_resource() {
        return Strings.make_string($int$36, UNPROVIDED);
    }

    public static SubLObject with_new_cfasl_input_guid_string_resource(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list172, append(body, NIL));
    }

    public static SubLObject cfasl_input_result_set(final SubLObject stream) {
        final SubLObject total_row_count = cfasl_input_object(stream);
        final SubLObject slice_row_count = cfasl_input_object(stream);
        final SubLObject column_count = cfasl_input_object(stream);
        final SubLObject first = cfasl_input_object(stream);
        final SubLObject rows = make_vector(slice_row_count, UNPROVIDED);
        SubLObject r;
        SubLObject row;
        SubLObject c;
        for (r = NIL, r = ZERO_INTEGER; r.numL(slice_row_count); r = add(r, ONE_INTEGER)) {
            row = make_vector(column_count, UNPROVIDED);
            for (c = NIL, c = ZERO_INTEGER; c.numL(column_count); c = add(c, ONE_INTEGER)) {
                set_aref(row, c, cfasl_input_object(stream));
            }
            set_aref(rows, r, row);
        }
        return sdbc.new_sql_result_set(first, rows, total_row_count);
    }

    public static SubLObject cfasl_output_object_package_method(final SubLObject v_object, final SubLObject stream) {
        return cfasl_output_package(v_object, stream);
    }

    public static SubLObject cfasl_output_package(final SubLObject v_package, final SubLObject stream) {
        cfasl_raw_write_byte($cfasl_opcode_package$.getGlobalValue(), stream);
        cfasl_output_string(package_name(v_package), stream);
        return v_package;
    }

    public static SubLObject cfasl_input_package(final SubLObject stream) {
        final SubLObject name = cfasl_input_object(stream);
        return find_package(name);
    }

    public static SubLObject cfasl_narrow_opcode_p(final SubLObject opcode) {
        return makeBoolean((NIL != subl_promotions.non_negative_integer_p(opcode)) && opcode.numL($cfasl_max_opcode$.getGlobalValue()));
    }

    public static SubLObject cfasl_wide_opcode_input_method(final SubLObject cfasl_wide_opcode) {
        final SubLObject result = gethash(cfasl_wide_opcode, $cfasl_wide_opcode_input_method_table$.getGlobalValue(), $NOT_FOUND);
        if ($NOT_FOUND != result) {
            return result;
        }
        if (NIL != cfasl_narrow_opcode_p(cfasl_wide_opcode)) {
            return cfasl_input_method(cfasl_wide_opcode);
        }
        return CFASL_INPUT_ERROR;
    }

    public static SubLObject cfasl_input_wide_opcode_encoded(final SubLObject stream) {
        final SubLObject code = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        final SubLObject method = cfasl_wide_opcode_input_method(code);
        return funcall(method, stream);
    }

    public static SubLObject declare_wide_cfasl_opcode(final SubLObject macroform, final SubLObject environment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject variable = NIL;
        SubLObject wide_opcode = NIL;
        SubLObject input_function = NIL;
        destructuring_bind_must_consp(current, datum, $list182);
        variable = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list182);
        wide_opcode = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list182);
        input_function = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(datum, $list182);
            return NIL;
        }
        assert NIL != symbolp(variable) : "Types.symbolp(variable) " + "CommonSymbols.NIL != Types.symbolp(variable) " + variable;
        assert NIL != integerp(wide_opcode) : "Types.integerp(wide_opcode) " + "CommonSymbols.NIL != Types.integerp(wide_opcode) " + wide_opcode;
        assert NIL != symbolp(input_function) : "Types.symbolp(input_function) " + "CommonSymbols.NIL != Types.symbolp(input_function) " + input_function;
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!wide_opcode.numGE($cfasl_min_wide_opcode$.getGlobalValue()))) {
            Errors.error($str183$_A_is_too_small_to_be_a_wide_opco, wide_opcode);
        }
        return list(PROGN, list(DEFCONSTANT_PRIVATE, variable, wide_opcode), list(REGISTER_WIDE_CFASL_OPCODE_INPUT_FUNCTION, variable, list(QUOTE, input_function)));
    }

    public static SubLObject register_wide_cfasl_opcode_input_function(final SubLObject wide_opcode, final SubLObject function) {
        sethash(wide_opcode, $cfasl_wide_opcode_input_method_table$.getGlobalValue(), function);
        return function;
    }

    public static SubLObject cfasl_output_wide_opcode(final SubLObject wide_opcode, final SubLObject stream) {
        cfasl_output_narrow_opcode($cfasl_opcode_wide_cfasl_opcode$.getGlobalValue(), stream);
        cfasl_output(wide_opcode, stream);
        return wide_opcode;
    }

    public static SubLObject cfasl_output_object_instance_method(final SubLObject v_object, final SubLObject stream) {
        cfasl_raw_write_byte($cfasl_opcode_instance$.getGlobalValue(), stream);
        return methods.funcall_instance_method_with_1_args(v_object, CFASL_OUTPUT, stream);
    }

    public static SubLObject cfasl_input_instance(final SubLObject stream) {
        final SubLObject class_name = cfasl_input_object(stream);
        assert NIL != symbolp(class_name) : "Types.symbolp(class_name) " + "CommonSymbols.NIL != Types.symbolp(class_name) " + class_name;
        return methods.funcall_class_method_with_1_args(class_name, CFASL_INPUT, stream);
    }

    public static SubLObject declare_cfasl_guid_opcode(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject variable = NIL;
        SubLObject cfasl_guid_opcode = NIL;
        SubLObject input_function = NIL;
        destructuring_bind_must_consp(current, datum, $list195);
        variable = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list195);
        cfasl_guid_opcode = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list195);
        input_function = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(datum, $list195);
            return NIL;
        }
        assert NIL != symbolp(variable) : "Types.symbolp(variable) " + "CommonSymbols.NIL != Types.symbolp(variable) " + variable;
        assert NIL != Guids.guid_p(cfasl_guid_opcode) : "Guids.guid_p(cfasl_guid_opcode) " + "CommonSymbols.NIL != Guids.guid_p(cfasl_guid_opcode) " + cfasl_guid_opcode;
        assert NIL != symbolp(input_function) : "Types.symbolp(input_function) " + "CommonSymbols.NIL != Types.symbolp(input_function) " + input_function;
        return list(PROGN, list(DEFLEXICAL_PRIVATE, variable, cfasl_guid_opcode), list(REGISTER_CFASL_GUID_DENOTED_TYPE_INPUT_FUNCTION, variable, list(QUOTE, input_function)));
    }

    public static SubLObject declare_cfasl_guid_string_opcode(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject variable = NIL;
        SubLObject cfasl_guid_string_opcode = NIL;
        SubLObject input_function = NIL;
        destructuring_bind_must_consp(current, datum, $list199);
        variable = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list199);
        cfasl_guid_string_opcode = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list199);
        input_function = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(datum, $list199);
            return NIL;
        }
        assert NIL != symbolp(variable) : "Types.symbolp(variable) " + "CommonSymbols.NIL != Types.symbolp(variable) " + variable;
        assert NIL != Guids.guid_string_p(cfasl_guid_string_opcode) : "Guids.guid_string_p(cfasl_guid_string_opcode) " + "CommonSymbols.NIL != Guids.guid_string_p(cfasl_guid_string_opcode) " + cfasl_guid_string_opcode;
        assert NIL != symbolp(input_function) : "Types.symbolp(input_function) " + "CommonSymbols.NIL != Types.symbolp(input_function) " + input_function;
        return list(PROGN, list(DEFLEXICAL_PRIVATE, variable, list(STRING_TO_GUID, cfasl_guid_string_opcode)), list(REGISTER_CFASL_GUID_DENOTED_TYPE_INPUT_FUNCTION, variable, list(QUOTE, input_function)));
    }

    public static SubLObject register_cfasl_guid_denoted_type_input_function(final SubLObject cfasl_guid_opcode, final SubLObject function) {
        sethash(cfasl_guid_opcode, $cfasl_guid_denoted_type_input_method_table$.getGlobalValue(), function);
        return function;
    }

    public static SubLObject write_cfasl_guid_denoted_type_opcode(final SubLObject stream, final SubLObject guid) {
        cfasl_raw_write_byte($cfasl_opcode_guid_denoted_type$.getGlobalValue(), stream);
        return cfasl_output(guid, stream);
    }

    public static SubLObject cfasl_guid_denoted_type_input_method(final SubLObject guid_for_type) {
        return gethash(guid_for_type, $cfasl_guid_denoted_type_input_method_table$.getGlobalValue(), UNPROVIDED);
    }

    public static SubLObject cfasl_input_guid_denoted_type(final SubLObject stream) {
        final SubLObject guid_for_type = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        final SubLObject result = funcall(cfasl_guid_denoted_type_input_method(guid_for_type), stream);
        return result;
    }

    public static SubLObject with_guid_denoted_type_cfasl_encoding(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list203);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject type_denoting_guid = NIL;
        SubLObject stream = NIL;
        destructuring_bind_must_consp(current, datum, $list203);
        type_denoting_guid = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list203);
        stream = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(PROGN, list(WRITE_CFASL_GUID_DENOTED_TYPE_OPCODE, stream, type_denoting_guid), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list203);
        return NIL;
    }

    public static SubLObject cfasl_test(final SubLObject v_object) {
        final SubLObject v_answer = cfasl_decode(cfasl_encode(v_object));
        return values(v_answer, equalp(v_answer, v_object));
    }

    public static SubLObject cfasl_test_externalized(final SubLObject v_object) {
        final SubLObject v_answer = cfasl_decode(cfasl_encode_externalized(v_object));
        return values(v_answer, equalp(v_answer, v_object));
    }

    public static SubLObject show_cfasl_file(final SubLObject filename, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject stream_$2 = NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream_$2 = compatibility.open_binary(filename, $INPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream_$2.isStream()) {
                Errors.error($str206$Unable_to_open__S, filename);
            }
            SubLObject input_stream;
            SubLObject thing;
            for (input_stream = stream_$2, thing = NIL, thing = cfasl_input(input_stream, NIL, $EOF); thing != $EOF; thing = cfasl_input(input_stream, NIL, $EOF)) {
                print(thing, stream);
            }
        } finally {
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (stream_$2.isStream()) {
                    close(stream_$2, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return NIL;
    }

    public static SubLObject declare_cfasl_file() {
        declareFunction(me, "cfasl_encoding_p", "CFASL-ENCODING-P", 1, 0, false);
        declareFunction(me, "cfasl_encodable_stream_p", "CFASL-ENCODABLE-STREAM-P", 1, 0, false);
        declareFunction(me, "cfasl_encoding_stream_print_function_trampoline", "CFASL-ENCODING-STREAM-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "cfasl_encoding_stream_p", "CFASL-ENCODING-STREAM-P", 1, 0, false);
        new cfasl.$cfasl_encoding_stream_p$UnaryFunction();
        declareFunction(me, "cfasl_encoding_stream_internal_stream", "CFASL-ENCODING-STREAM-INTERNAL-STREAM", 1, 0, false);
        declareFunction(me, "cfasl_encoding_stream_count", "CFASL-ENCODING-STREAM-COUNT", 1, 0, false);
        declareFunction(me, "_csetf_cfasl_encoding_stream_internal_stream", "_CSETF-CFASL-ENCODING-STREAM-INTERNAL-STREAM", 2, 0, false);
        declareFunction(me, "_csetf_cfasl_encoding_stream_count", "_CSETF-CFASL-ENCODING-STREAM-COUNT", 2, 0, false);
        declareFunction(me, "make_cfasl_encoding_stream", "MAKE-CFASL-ENCODING-STREAM", 0, 1, false);
        declareFunction(me, "visit_defstruct_cfasl_encoding_stream", "VISIT-DEFSTRUCT-CFASL-ENCODING-STREAM", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_cfasl_encoding_stream_method", "VISIT-DEFSTRUCT-OBJECT-CFASL-ENCODING-STREAM-METHOD", 2, 0, false);
        declareMacro(me, "with_cfasl_output_to_hex_string", "WITH-CFASL-OUTPUT-TO-HEX-STRING");
        declareFunction(me, "cfasl_encoding_string_stream_encoding", "CFASL-ENCODING-STRING-STREAM-ENCODING", 1, 0, false);
        declareMacro(me, "with_cfasl_output_to_byte_vector", "WITH-CFASL-OUTPUT-TO-BYTE-VECTOR");
        declareFunction(me, "new_cfasl_encoding_stream", "NEW-CFASL-ENCODING-STREAM", 0, 0, false);
        declareFunction(me, "cfasl_encoding_stream_write_byte", "CFASL-ENCODING-STREAM-WRITE-BYTE", 2, 0, false);
        declareFunction(me, "cfasl_encoding_stream_encoding", "CFASL-ENCODING-STREAM-ENCODING", 1, 0, false);
        declareFunction(me, "close_cfasl_encoding_stream", "CLOSE-CFASL-ENCODING-STREAM", 1, 0, false);
        declareFunction(me, "cfasl_encoding_stream_hexchar_position", "CFASL-ENCODING-STREAM-HEXCHAR-POSITION", 1, 0, false);
        declareFunction(me, "cfasl_encoding_stream_byte_position", "CFASL-ENCODING-STREAM-BYTE-POSITION", 1, 0, false);
        declareFunction(me, "cfasl_encode", "CFASL-ENCODE", 1, 0, false);
        declareFunction(me, "cfasl_encode_externalized", "CFASL-ENCODE-EXTERNALIZED", 1, 0, false);
        declareFunction(me, "cfasl_encode_externalized_terse", "CFASL-ENCODE-EXTERNALIZED-TERSE", 1, 0, false);
        declareFunction(me, "cfasl_decodable_stream_p", "CFASL-DECODABLE-STREAM-P", 1, 0, false);
        declareFunction(me, "cfasl_decoding_stream_print_function_trampoline", "CFASL-DECODING-STREAM-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "cfasl_decoding_stream_p", "CFASL-DECODING-STREAM-P", 1, 0, false);
        new cfasl.$cfasl_decoding_stream_p$UnaryFunction();
        declareFunction(me, "cfasl_decoding_stream_internal_stream", "CFASL-DECODING-STREAM-INTERNAL-STREAM", 1, 0, false);
        declareFunction(me, "cfasl_decoding_stream_position", "CFASL-DECODING-STREAM-POSITION", 1, 0, false);
        declareFunction(me, "_csetf_cfasl_decoding_stream_internal_stream", "_CSETF-CFASL-DECODING-STREAM-INTERNAL-STREAM", 2, 0, false);
        declareFunction(me, "_csetf_cfasl_decoding_stream_position", "_CSETF-CFASL-DECODING-STREAM-POSITION", 2, 0, false);
        declareFunction(me, "make_cfasl_decoding_stream", "MAKE-CFASL-DECODING-STREAM", 0, 1, false);
        declareFunction(me, "visit_defstruct_cfasl_decoding_stream", "VISIT-DEFSTRUCT-CFASL-DECODING-STREAM", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_cfasl_decoding_stream_method", "VISIT-DEFSTRUCT-OBJECT-CFASL-DECODING-STREAM-METHOD", 2, 0, false);
        declareMacro(me, "with_cfasl_input_from_string", "WITH-CFASL-INPUT-FROM-STRING");
        declareFunction(me, "new_cfasl_decoding_stream_from_string", "NEW-CFASL-DECODING-STREAM-FROM-STRING", 1, 0, false);
        declareMacro(me, "with_cfasl_input_from_byte_vector", "WITH-CFASL-INPUT-FROM-BYTE-VECTOR");
        declareFunction(me, "new_cfasl_decoding_stream", "NEW-CFASL-DECODING-STREAM", 1, 0, false);
        declareFunction(me, "cfasl_decoding_stream_read_byte", "CFASL-DECODING-STREAM-READ-BYTE", 1, 2, false);
        declareFunction(me, "close_cfasl_decoding_stream", "CLOSE-CFASL-DECODING-STREAM", 1, 0, false);
        declareFunction(me, "cfasl_decoding_stream_nybble_position", "CFASL-DECODING-STREAM-NYBBLE-POSITION", 1, 0, false);
        declareFunction(me, "cfasl_decode", "CFASL-DECODE", 1, 0, false);
        declareFunction(me, "cfasl_decoding_stream_byte_position", "CFASL-DECODING-STREAM-BYTE-POSITION", 1, 0, false);
        declareFunction(me, "cfasl_decoding_stream_hexchar_position", "CFASL-DECODING-STREAM-HEXCHAR-POSITION", 1, 0, false);
        declareFunction(me, "cfasl_count_stream_print_function_trampoline", "CFASL-COUNT-STREAM-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "cfasl_count_stream_p", "CFASL-COUNT-STREAM-P", 1, 0, false);
        new cfasl.$cfasl_count_stream_p$UnaryFunction();
        declareFunction(me, "cfasl_count_stream_position", "CFASL-COUNT-STREAM-POSITION", 1, 0, false);
        declareFunction(me, "_csetf_cfasl_count_stream_position", "_CSETF-CFASL-COUNT-STREAM-POSITION", 2, 0, false);
        declareFunction(me, "make_cfasl_count_stream", "MAKE-CFASL-COUNT-STREAM", 0, 1, false);
        declareFunction(me, "visit_defstruct_cfasl_count_stream", "VISIT-DEFSTRUCT-CFASL-COUNT-STREAM", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_cfasl_count_stream_method", "VISIT-DEFSTRUCT-OBJECT-CFASL-COUNT-STREAM-METHOD", 2, 0, false);
        declareMacro(me, "with_cfasl_output_to_count_stream", "WITH-CFASL-OUTPUT-TO-COUNT-STREAM");
        declareFunction(me, "new_cfasl_count_stream", "NEW-CFASL-COUNT-STREAM", 0, 0, false);
        declareFunction(me, "cfasl_count_stream_write_byte", "CFASL-COUNT-STREAM-WRITE-BYTE", 2, 0, false);
        declareFunction(me, "cfasl_count_stream_increment", "CFASL-COUNT-STREAM-INCREMENT", 2, 0, false);
        declareFunction(me, "cfasl_count_stream_size", "CFASL-COUNT-STREAM-SIZE", 1, 0, false);
        declareFunction(me, "close_cfasl_count_stream", "CLOSE-CFASL-COUNT-STREAM", 1, 0, false);
        declareFunction(me, "cfasl_object_size", "CFASL-OBJECT-SIZE", 1, 0, false);
        declareFunction(me, "cfasl_externalized_object_size", "CFASL-EXTERNALIZED-OBJECT-SIZE", 1, 0, false);
        declareMacro(me, "with_cfasl_stream_extensions", "WITH-CFASL-STREAM-EXTENSIONS");
        declareFunction(me, "cfasl_output", "CFASL-OUTPUT", 2, 0, false);
        declareFunction(me, "cfasl_output_externalized", "CFASL-OUTPUT-EXTERNALIZED", 2, 0, false);
        declareFunction(me, "cfasl_output_maybe_externalized", "CFASL-OUTPUT-MAYBE-EXTERNALIZED", 3, 0, false);
        declareFunction(me, "cfasl_output_object", "CFASL-OUTPUT-OBJECT", 2, 0, false);
        declareFunction(me, "cfasl_output_error", "CFASL-OUTPUT-ERROR", 2, 0, false);
        declareFunction(me, "cfasl_raw_write_byte", "CFASL-RAW-WRITE-BYTE", 2, 0, false);
        declareFunction(me, "cfasl_input", "CFASL-INPUT", 1, 2, false);
        declareFunction(me, "cfasl_opcode_peek", "CFASL-OPCODE-PEEK", 1, 2, false);
        declareFunction(me, "cfasl_input_object", "CFASL-INPUT-OBJECT", 1, 0, false);
        declareFunction(me, "cfasl_input_error", "CFASL-INPUT-ERROR", 1, 0, false);
        declareFunction(me, "cfasl_input_internal", "CFASL-INPUT-INTERNAL", 3, 0, false);
        declareFunction(me, "cfasl_opcode_peek_internal", "CFASL-OPCODE-PEEK-INTERNAL", 3, 0, false);
        declareFunction(me, "cfasl_input_method", "CFASL-INPUT-METHOD", 1, 0, false);
        declareMacro(me, "declare_cfasl_opcode", "DECLARE-CFASL-OPCODE");
        declareFunction(me, "register_cfasl_input_function", "REGISTER-CFASL-INPUT-FUNCTION", 2, 0, false);
        declareFunction(me, "cfasl_raw_peek_byte", "CFASL-RAW-PEEK-BYTE", 1, 0, false);
        declareFunction(me, "cfasl_raw_read_byte", "CFASL-RAW-READ-BYTE", 1, 0, false);
        declareMacro(me, "with_cfasl_area_allocation", "WITH-CFASL-AREA-ALLOCATION");
        declareMacro(me, "within_cfasl_externalization", "WITHIN-CFASL-EXTERNALIZATION");
        declareMacro(me, "without_cfasl_externalization", "WITHOUT-CFASL-EXTERNALIZATION");
        declareFunction(me, "within_cfasl_externalization_p", "WITHIN-CFASL-EXTERNALIZATION-P", 0, 0, false);
        declareMacro(me, "without_cfasl_channel_externalization", "WITHOUT-CFASL-CHANNEL-EXTERNALIZATION");
        declareFunction(me, "cfasl_channel_externalizedP", "CFASL-CHANNEL-EXTERNALIZED?", 0, 0, false);
        declareMacro(me, "declare_cfasl_extension_opcode", "DECLARE-CFASL-EXTENSION-OPCODE");
        declareFunction(me, "register_cfasl_extension", "REGISTER-CFASL-EXTENSION", 4, 0, false);
        declareFunction(me, "handle_cfasl_extensions", "HANDLE-CFASL-EXTENSIONS", 2, 0, false);
        declareFunction(me, "cfasl_output_narrow_opcode", "CFASL-OUTPUT-NARROW-OPCODE", 2, 0, false);
        declareFunction(me, "cfasl_output_opcode", "CFASL-OUTPUT-OPCODE", 2, 0, false);
        declareFunction(me, "cfasl_output_externalization", "CFASL-OUTPUT-EXTERNALIZATION", 2, 0, false);
        declareFunction(me, "cfasl_input_externalization", "CFASL-INPUT-EXTERNALIZATION", 1, 0, false);
        declareFunction(me, "cfasl_output_defstruct_recipe", "CFASL-OUTPUT-DEFSTRUCT-RECIPE", 2, 0, false);
        declareFunction(me, "cfasl_output_defstruct_recipe_visitorfn", "CFASL-OUTPUT-DEFSTRUCT-RECIPE-VISITORFN", 4, 0, false);
        declareFunction(me, "cfasl_input_defstruct_recipe", "CFASL-INPUT-DEFSTRUCT-RECIPE", 1, 0, false);
        declareFunction(me, "cfasl_immediate_fixnump", "CFASL-IMMEDIATE-FIXNUMP", 1, 0, false);
        declareFunction(me, "cfasl_output_immediate_fixnum", "CFASL-OUTPUT-IMMEDIATE-FIXNUM", 2, 0, false);
        declareFunction(me, "cfasl_immediate_fixnum_opcode", "CFASL-IMMEDIATE-FIXNUM-OPCODE", 1, 0, false);
        declareFunction(me, "cfasl_extract_immediate_fixnum", "CFASL-EXTRACT-IMMEDIATE-FIXNUM", 1, 0, false);
        declareFunction(me, "cfasl_output_object_integer_method", "CFASL-OUTPUT-OBJECT-INTEGER-METHOD", 2, 0, false);
        declareFunction(me, "cfasl_output_integer", "CFASL-OUTPUT-INTEGER", 2, 0, false);
        declareFunction(me, "cfasl_output_integer_internal", "CFASL-OUTPUT-INTEGER-INTERNAL", 3, 0, false);
        declareFunction(me, "cfasl_input_p_8bit_int", "CFASL-INPUT-P-8BIT-INT", 1, 0, false);
        declareFunction(me, "cfasl_input_n_8bit_int", "CFASL-INPUT-N-8BIT-INT", 1, 0, false);
        new cfasl.$cfasl_input_n_8bit_int$UnaryFunction();
        declareFunction(me, "cfasl_input_p_16bit_int", "CFASL-INPUT-P-16BIT-INT", 1, 0, false);
        new cfasl.$cfasl_input_p_16bit_int$UnaryFunction();
        declareFunction(me, "cfasl_input_n_16bit_int", "CFASL-INPUT-N-16BIT-INT", 1, 0, false);
        declareFunction(me, "cfasl_input_p_24bit_int", "CFASL-INPUT-P-24BIT-INT", 1, 0, false);
        new cfasl.$cfasl_input_p_24bit_int$UnaryFunction();
        declareFunction(me, "cfasl_input_n_24bit_int", "CFASL-INPUT-N-24BIT-INT", 1, 0, false);
        new cfasl.$cfasl_input_n_24bit_int$UnaryFunction();
        declareFunction(me, "cfasl_input_p_32bit_int", "CFASL-INPUT-P-32BIT-INT", 1, 0, false);
        new cfasl.$cfasl_input_p_32bit_int$UnaryFunction();
        declareFunction(me, "cfasl_input_n_32bit_int", "CFASL-INPUT-N-32BIT-INT", 1, 0, false);
        declareFunction(me, "assemble_2_fixnums_to_non_negative_integer", "ASSEMBLE-2-FIXNUMS-TO-NON-NEGATIVE-INTEGER", 2, 0, false);
        declareFunction(me, "assemble_3_fixnums_to_non_negative_integer", "ASSEMBLE-3-FIXNUMS-TO-NON-NEGATIVE-INTEGER", 3, 0, false);
        declareFunction(me, "assemble_4_fixnums_to_non_negative_integer", "ASSEMBLE-4-FIXNUMS-TO-NON-NEGATIVE-INTEGER", 4, 0, false);
        declareFunction(me, "cfasl_input_integer", "CFASL-INPUT-INTEGER", 2, 0, false);
        declareFunction(me, "cfasl_input_p_bignum", "CFASL-INPUT-P-BIGNUM", 1, 0, false);
        new cfasl.$cfasl_input_p_bignum$UnaryFunction();
        declareFunction(me, "cfasl_input_n_bignum", "CFASL-INPUT-N-BIGNUM", 1, 0, false);
        declareFunction(me, "cfasl_input_bignum", "CFASL-INPUT-BIGNUM", 2, 0, false);
        declareFunction(me, "cfasl_output_object_float_method", "CFASL-OUTPUT-OBJECT-FLOAT-METHOD", 2, 0, false);
        declareFunction(me, "cfasl_output_float", "CFASL-OUTPUT-FLOAT", 2, 0, false);
        declareFunction(me, "cfasl_input_p_float", "CFASL-INPUT-P-FLOAT", 1, 0, false);
        new cfasl.$cfasl_input_p_float$UnaryFunction();
        declareFunction(me, "cfasl_input_n_float", "CFASL-INPUT-N-FLOAT", 1, 0, false);
        new cfasl.$cfasl_input_n_float$UnaryFunction();
        declareFunction(me, "cfasl_input_float", "CFASL-INPUT-FLOAT", 1, 0, false);
        declareFunction(me, "cfasl_output_object_symbol_method", "CFASL-OUTPUT-OBJECT-SYMBOL-METHOD", 2, 0, false);
        declareFunction(me, "cfasl_output_keyword", "CFASL-OUTPUT-KEYWORD", 2, 0, false);
        declareFunction(me, "cfasl_input_keyword", "CFASL-INPUT-KEYWORD", 1, 0, false);
        new cfasl.$cfasl_input_keyword$UnaryFunction();
        declareFunction(me, "cfasl_output_other_symbol", "CFASL-OUTPUT-OTHER-SYMBOL", 2, 0, false);
        declareFunction(me, "cyc_package_symbol_p", "CYC-PACKAGE-SYMBOL-P", 1, 0, false);
        declareFunction(me, "cfasl_input_other_symbol", "CFASL-INPUT-OTHER-SYMBOL", 1, 0, false);
        new cfasl.$cfasl_input_other_symbol$UnaryFunction();
        declareFunction(me, "cfasl_output_nil", "CFASL-OUTPUT-NIL", 1, 0, false);
        declareFunction(me, "cfasl_input_nil", "CFASL-INPUT-NIL", 1, 0, false);
        new cfasl.$cfasl_input_nil$UnaryFunction();
        declareFunction(me, "cfasl_set_common_symbols", "CFASL-SET-COMMON-SYMBOLS", 1, 0, false);
        declareMacro(me, "with_cfasl_common_symbols", "WITH-CFASL-COMMON-SYMBOLS");
        declareFunction(me, "cfasl_set_common_symbols_simple", "CFASL-SET-COMMON-SYMBOLS-SIMPLE", 1, 0, false);
        declareMacro(me, "with_cfasl_common_symbols_simple", "WITH-CFASL-COMMON-SYMBOLS-SIMPLE");
        declareFunction(me, "cfasl_current_common_symbols", "CFASL-CURRENT-COMMON-SYMBOLS", 0, 0, false);
        declareFunction(me, "cfasl_common_symbol_p", "CFASL-COMMON-SYMBOL-P", 1, 0, false);
        declareFunction(me, "cfasl_encode_common_symbol", "CFASL-ENCODE-COMMON-SYMBOL", 1, 0, false);
        declareFunction(me, "cfasl_decode_common_symbol", "CFASL-DECODE-COMMON-SYMBOL", 1, 0, false);
        declareFunction(me, "cfasl_output_common_symbol", "CFASL-OUTPUT-COMMON-SYMBOL", 2, 0, false);
        declareFunction(me, "cfasl_input_common_symbol", "CFASL-INPUT-COMMON-SYMBOL", 1, 0, false);
        new cfasl.$cfasl_input_common_symbol$UnaryFunction();
        declareFunction(me, "cfasl_output_object_cons_method", "CFASL-OUTPUT-OBJECT-CONS-METHOD", 2, 0, false);
        declareFunction(me, "register_cfasl_list_method", "REGISTER-CFASL-LIST-METHOD", 3, 0, false);
        declareFunction(me, "handle_cfasl_list_methods", "HANDLE-CFASL-LIST-METHODS", 2, 0, false);
        declareFunction(me, "cfasl_output_list", "CFASL-OUTPUT-LIST", 2, 0, false);
        declareFunction(me, "cfasl_input_list", "CFASL-INPUT-LIST", 1, 0, false);
        new cfasl.$cfasl_input_list$UnaryFunction();
        declareFunction(me, "cfasl_output_dotted_list", "CFASL-OUTPUT-DOTTED-LIST", 2, 0, false);
        declareFunction(me, "cfasl_input_dotted_list", "CFASL-INPUT-DOTTED-LIST", 1, 0, false);
        new cfasl.$cfasl_input_dotted_list$UnaryFunction();
        declareFunction(me, "cfasl_output_object_vector_method", "CFASL-OUTPUT-OBJECT-VECTOR-METHOD", 2, 0, false);
        declareFunction(me, "cfasl_output_general_vector", "CFASL-OUTPUT-GENERAL-VECTOR", 2, 0, false);
        declareFunction(me, "cfasl_input_general_vector", "CFASL-INPUT-GENERAL-VECTOR", 1, 0, false);
        new cfasl.$cfasl_input_general_vector$UnaryFunction();
        declareFunction(me, "cfasl_output_byte_vector", "CFASL-OUTPUT-BYTE-VECTOR", 2, 0, false);
        declareFunction(me, "cfasl_input_byte_vector", "CFASL-INPUT-BYTE-VECTOR", 1, 0, false);
        declareFunction(me, "cfasl_output_object_string_method", "CFASL-OUTPUT-OBJECT-STRING-METHOD", 2, 0, false);
        declareFunction(me, "cfasl_output_string", "CFASL-OUTPUT-STRING", 2, 0, false);
        declareFunction(me, "cfasl_input_string", "CFASL-INPUT-STRING", 1, 0, false);
        new cfasl.$cfasl_input_string$UnaryFunction();
        declareFunction(me, "cfasl_output_object_character_method", "CFASL-OUTPUT-OBJECT-CHARACTER-METHOD", 2, 0, false);
        declareFunction(me, "cfasl_output_character", "CFASL-OUTPUT-CHARACTER", 2, 0, false);
        declareFunction(me, "cfasl_input_character", "CFASL-INPUT-CHARACTER", 1, 0, false);
        new cfasl.$cfasl_input_character$UnaryFunction();
        declareFunction(me, "cfasl_output_object_hash_table_method", "CFASL-OUTPUT-OBJECT-HASH-TABLE-METHOD", 2, 0, false);
        declareFunction(me, "cfasl_output_hashtable", "CFASL-OUTPUT-HASHTABLE", 2, 0, false);
        declareFunction(me, "cfasl_input_hashtable", "CFASL-INPUT-HASHTABLE", 1, 0, false);
        declareFunction(me, "cfasl_output_object_guid_method", "CFASL-OUTPUT-OBJECT-GUID-METHOD", 2, 0, false);
        declareFunction(me, "cfasl_output_guid", "CFASL-OUTPUT-GUID", 2, 0, false);
        declareFunction(me, "cfasl_input_guid", "CFASL-INPUT-GUID", 1, 0, false);
        new cfasl.$cfasl_input_guid$UnaryFunction();
        declareFunction(me, "cfasl_input_guid_byte_vector", "CFASL-INPUT-GUID-BYTE-VECTOR", 1, 0, false);
        declareFunction(me, "cfasl_output_legacy_guid", "CFASL-OUTPUT-LEGACY-GUID", 2, 0, false);
        declareFunction(me, "cfasl_input_legacy_guid", "CFASL-INPUT-LEGACY-GUID", 1, 0, false);
        declareFunction(me, "cfasl_input_guid_string", "CFASL-INPUT-GUID-STRING", 1, 0, false);
        declareFunction(me, "get_new_cfasl_input_guid_string_resource", "GET-NEW-CFASL-INPUT-GUID-STRING-RESOURCE", 0, 0, false);
        declareMacro(me, "with_new_cfasl_input_guid_string_resource", "WITH-NEW-CFASL-INPUT-GUID-STRING-RESOURCE");
        declareFunction(me, "cfasl_input_result_set", "CFASL-INPUT-RESULT-SET", 1, 0, false);
        declareFunction(me, "cfasl_output_object_package_method", "CFASL-OUTPUT-OBJECT-PACKAGE-METHOD", 2, 0, false);
        declareFunction(me, "cfasl_output_package", "CFASL-OUTPUT-PACKAGE", 2, 0, false);
        declareFunction(me, "cfasl_input_package", "CFASL-INPUT-PACKAGE", 1, 0, false);
        declareFunction(me, "cfasl_narrow_opcode_p", "CFASL-NARROW-OPCODE-P", 1, 0, false);
        declareFunction(me, "cfasl_wide_opcode_input_method", "CFASL-WIDE-OPCODE-INPUT-METHOD", 1, 0, false);
        declareFunction(me, "cfasl_input_wide_opcode_encoded", "CFASL-INPUT-WIDE-OPCODE-ENCODED", 1, 0, false);
        declareMacro(me, "declare_wide_cfasl_opcode", "DECLARE-WIDE-CFASL-OPCODE");
        declareFunction(me, "register_wide_cfasl_opcode_input_function", "REGISTER-WIDE-CFASL-OPCODE-INPUT-FUNCTION", 2, 0, false);
        declareFunction(me, "cfasl_output_wide_opcode", "CFASL-OUTPUT-WIDE-OPCODE", 2, 0, false);
        declareFunction(me, "cfasl_output_object_instance_method", "CFASL-OUTPUT-OBJECT-INSTANCE-METHOD", 2, 0, false);
        declareFunction(me, "cfasl_input_instance", "CFASL-INPUT-INSTANCE", 1, 0, false);
        declareMacro(me, "declare_cfasl_guid_opcode", "DECLARE-CFASL-GUID-OPCODE");
        declareMacro(me, "declare_cfasl_guid_string_opcode", "DECLARE-CFASL-GUID-STRING-OPCODE");
        declareFunction(me, "register_cfasl_guid_denoted_type_input_function", "REGISTER-CFASL-GUID-DENOTED-TYPE-INPUT-FUNCTION", 2, 0, false);
        declareFunction(me, "write_cfasl_guid_denoted_type_opcode", "WRITE-CFASL-GUID-DENOTED-TYPE-OPCODE", 2, 0, false);
        declareFunction(me, "cfasl_guid_denoted_type_input_method", "CFASL-GUID-DENOTED-TYPE-INPUT-METHOD", 1, 0, false);
        declareFunction(me, "cfasl_input_guid_denoted_type", "CFASL-INPUT-GUID-DENOTED-TYPE", 1, 0, false);
        declareMacro(me, "with_guid_denoted_type_cfasl_encoding", "WITH-GUID-DENOTED-TYPE-CFASL-ENCODING");
        declareFunction(me, "cfasl_test", "CFASL-TEST", 1, 0, false);
        declareFunction(me, "cfasl_test_externalized", "CFASL-TEST-EXTERNALIZED", 1, 0, false);
        declareFunction(me, "show_cfasl_file", "SHOW-CFASL-FILE", 1, 1, false);
        return NIL;
    }

    public static SubLObject init_cfasl_file() {
        defconstant("*DTP-CFASL-ENCODING-STREAM*", CFASL_ENCODING_STREAM);
        defparameter("*TERSE-GUID-SERIALIZATION-ENABLED?*", NIL);
        defparameter("*TERSE-GUID-SERIALIZATION-ENABLED-FOR-CFASL-ENCODE-EXTERNALIZED?*", $UNINITIALIZED);
        defconstant("*DTP-CFASL-DECODING-STREAM*", CFASL_DECODING_STREAM);
        defconstant("*DTP-CFASL-COUNT-STREAM*", CFASL_COUNT_STREAM);
        defparameter("*CFASL-STREAM-EXTENSIONS-ENABLED*", NIL);
        defparameter("*CFASL-UNREAD-BYTE*", NIL);
        deflexical("*CFASL-OUTPUT-OBJECT-METHOD-TABLE*", make_vector($int$256, NIL));
        defparameter("*CFASL-INPUT-TO-STATIC-AREA*", NIL);
        defconstant("*CFASL-MAX-OPCODE*", $int$128);
        deflexical("*CFASL-INPUT-METHOD-TABLE*", SubLTrampolineFile.maybeDefault($cfasl_input_method_table$, $cfasl_input_method_table$, () -> make_vector($cfasl_max_opcode$.getGlobalValue(), CFASL_INPUT_ERROR)));
        defparameter("*WITHIN-CFASL-EXTERNALIZATION*", NIL);
        defparameter("*CFASL-CHANNEL-EXTERNALIZED?*", T);
        deflexical("*CFASL-EXTENSIONS*", SubLTrampolineFile.maybeDefault($cfasl_extensions$, $cfasl_extensions$, NIL));
        defconstant("*CFASL-OPCODE-EXTERNALIZATION*", $int$51);
        defparameter("*CURRENT-CFASL-DEFSTRUCT-OUTPUT-STREAM*", NIL);
        defconstant("*CFASL-OPCODE-DEFSTRUCT-RECIPE*", $int$44);
        defconstant("*CFASL-IMMEDIATE-FIXNUM-CUTOFF*", $cfasl_max_opcode$.getGlobalValue());
        defconstant("*CFASL-IMMEDIATE-FIXNUM-OFFSET*", subtract($int$256, $cfasl_immediate_fixnum_cutoff$.getGlobalValue()));
        defconstant("*CFASL-OPCODE-P-8BIT-INT*", ZERO_INTEGER);
        defconstant("*CFASL-OPCODE-N-8BIT-INT*", ONE_INTEGER);
        defconstant("*CFASL-OPCODE-P-16BIT-INT*", TWO_INTEGER);
        defconstant("*CFASL-OPCODE-N-16BIT-INT*", THREE_INTEGER);
        defconstant("*CFASL-OPCODE-P-24BIT-INT*", FOUR_INTEGER);
        defconstant("*CFASL-OPCODE-N-24BIT-INT*", FIVE_INTEGER);
        defconstant("*CFASL-OPCODE-P-32BIT-INT*", SIX_INTEGER);
        defconstant("*CFASL-OPCODE-N-32BIT-INT*", SEVEN_INTEGER);
        defconstant("*CFASL-OPCODE-P-BIGNUM*", $int$23);
        defconstant("*CFASL-OPCODE-N-BIGNUM*", $int$24);
        defconstant("*CFASL-OPCODE-P-FLOAT*", EIGHT_INTEGER);
        defconstant("*CFASL-OPCODE-N-FLOAT*", NINE_INTEGER);
        defconstant("*CFASL-OPCODE-KEYWORD*", TEN_INTEGER);
        defconstant("*CFASL-OPCODE-OTHER-SYMBOL*", ELEVEN_INTEGER);
        defconstant("*CFASL-OPCODE-NIL*", TWELVE_INTEGER);
        defconstant("*CFASL-OPCODE-COMMON-SYMBOL*", $int$50);
        defparameter("*CFASL-COMMON-SYMBOLS*", NIL);
        deflexical("*CFASL-LIST-METHODS*", SubLTrampolineFile.maybeDefault($cfasl_list_methods$, $cfasl_list_methods$, NIL));
        defconstant("*CFASL-OPCODE-LIST*", THIRTEEN_INTEGER);
        defconstant("*CFASL-OPCODE-DOTTED-LIST*", SEVENTEEN_INTEGER);
        defconstant("*CFASL-OPCODE-GENERAL-VECTOR*", FOURTEEN_INTEGER);
        defconstant("*CFASL-OPCODE-BYTE-VECTOR*", $int$26);
        defconstant("*CFASL-OPCODE-STRING*", FIFTEEN_INTEGER);
        defparameter("*CFASL-INPUT-STRING-RESOURCE*", NIL);
        defconstant("*CFASL-OPCODE-CHARACTER*", SIXTEEN_INTEGER);
        defconstant("*CFASL-OPCODE-HASHTABLE*", EIGHTEEN_INTEGER);
        defconstant("*CFASL-OPCODE-GUID*", $int$43);
        defconstant("*CFASL-OPCODE-LEGACY-GUID*", $int$25);
        defparameter("*CFASL-INPUT-GUID-STRING-RESOURCE*", NIL);
        defconstant("*CFASL-OPCODE-RESULT-SET*", $int$27);
        defconstant("*CFASL-OPCODE-PACKAGE*", $int$28);
        defconstant("*CFASL-OPCODE-WIDE-CFASL-OPCODE*", $int$29);
        defconstant("*CFASL-MIN-WIDE-OPCODE*", $cfasl_max_opcode$.getGlobalValue());
        deflexical("*CFASL-WIDE-OPCODE-INPUT-METHOD-TABLE*", SubLTrampolineFile.maybeDefault($cfasl_wide_opcode_input_method_table$, $cfasl_wide_opcode_input_method_table$, () -> make_hash_table($int$32, symbol_function(EQL), UNPROVIDED)));
        defconstant("*CFASL-OPCODE-INSTANCE*", $int$124);
        defconstant("*CFASL-OPCODE-GUID-DENOTED-TYPE*", $int$126);
        deflexical("*CFASL-GUID-DENOTED-TYPE-INPUT-METHOD-TABLE*", SubLTrampolineFile.maybeDefault($cfasl_guid_denoted_type_input_method_table$, $cfasl_guid_denoted_type_input_method_table$, () -> make_hash_table($int$100, symbol_function(EQUALP), UNPROVIDED)));
        return NIL;
    }

    public static SubLObject setup_cfasl_file() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_cfasl_encoding_stream$.getGlobalValue(), symbol_function(CFASL_ENCODING_STREAM_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list8);
        def_csetf(CFASL_ENCODING_STREAM_INTERNAL_STREAM, _CSETF_CFASL_ENCODING_STREAM_INTERNAL_STREAM);
        def_csetf(CFASL_ENCODING_STREAM_COUNT, _CSETF_CFASL_ENCODING_STREAM_COUNT);
        identity(CFASL_ENCODING_STREAM);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_cfasl_encoding_stream$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_CFASL_ENCODING_STREAM_METHOD));
        register_macro_helper(CFASL_ENCODING_STRING_STREAM_ENCODING, WITH_CFASL_OUTPUT_TO_HEX_STRING);
        register_macro_helper(NEW_CFASL_ENCODING_STREAM, WITH_CFASL_OUTPUT_TO_BYTE_VECTOR);
        register_macro_helper(CFASL_ENCODING_STREAM_WRITE_BYTE, WITH_CFASL_OUTPUT_TO_BYTE_VECTOR);
        register_macro_helper(CFASL_ENCODING_STREAM_ENCODING, WITH_CFASL_OUTPUT_TO_BYTE_VECTOR);
        register_macro_helper(CLOSE_CFASL_ENCODING_STREAM, WITH_CFASL_OUTPUT_TO_BYTE_VECTOR);
        register_macro_helper(CFASL_ENCODING_STREAM_HEXCHAR_POSITION, WITH_CFASL_OUTPUT_TO_HEX_STRING);
        register_macro_helper(CFASL_ENCODING_STREAM_BYTE_POSITION, WITH_CFASL_OUTPUT_TO_HEX_STRING);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_cfasl_decoding_stream$.getGlobalValue(), symbol_function(CFASL_DECODING_STREAM_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list46);
        def_csetf(CFASL_DECODING_STREAM_INTERNAL_STREAM, _CSETF_CFASL_DECODING_STREAM_INTERNAL_STREAM);
        def_csetf(CFASL_DECODING_STREAM_POSITION, _CSETF_CFASL_DECODING_STREAM_POSITION);
        identity(CFASL_DECODING_STREAM);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_cfasl_decoding_stream$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_CFASL_DECODING_STREAM_METHOD));
        register_macro_helper(NEW_CFASL_DECODING_STREAM_FROM_STRING, WITH_CFASL_INPUT_FROM_STRING);
        register_macro_helper(NEW_CFASL_DECODING_STREAM, WITH_CFASL_INPUT_FROM_BYTE_VECTOR);
        register_macro_helper(CFASL_DECODING_STREAM_READ_BYTE, WITH_CFASL_INPUT_FROM_BYTE_VECTOR);
        register_macro_helper(CLOSE_CFASL_DECODING_STREAM, WITH_CFASL_INPUT_FROM_BYTE_VECTOR);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_cfasl_count_stream$.getGlobalValue(), symbol_function(CFASL_COUNT_STREAM_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list69);
        def_csetf(CFASL_COUNT_STREAM_POSITION, _CSETF_CFASL_COUNT_STREAM_POSITION);
        identity(CFASL_COUNT_STREAM);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_cfasl_count_stream$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_CFASL_COUNT_STREAM_METHOD));
        declare_defglobal($cfasl_input_method_table$);
        register_macro_helper(REGISTER_CFASL_INPUT_FUNCTION, DECLARE_CFASL_OPCODE);
        declare_defglobal($cfasl_extensions$);
        register_macro_helper(REGISTER_CFASL_EXTENSION, DECLARE_CFASL_EXTENSION_OPCODE);
        register_cfasl_input_function($cfasl_opcode_externalization$.getGlobalValue(), CFASL_INPUT_EXTERNALIZATION);
        register_cfasl_input_function($cfasl_opcode_defstruct_recipe$.getGlobalValue(), CFASL_INPUT_DEFSTRUCT_RECIPE);
        register_cfasl_input_function($cfasl_opcode_p_8bit_int$.getGlobalValue(), CFASL_INPUT_P_8BIT_INT);
        register_cfasl_input_function($cfasl_opcode_n_8bit_int$.getGlobalValue(), CFASL_INPUT_N_8BIT_INT);
        register_cfasl_input_function($cfasl_opcode_p_16bit_int$.getGlobalValue(), CFASL_INPUT_P_16BIT_INT);
        register_cfasl_input_function($cfasl_opcode_n_16bit_int$.getGlobalValue(), CFASL_INPUT_N_16BIT_INT);
        register_cfasl_input_function($cfasl_opcode_p_24bit_int$.getGlobalValue(), CFASL_INPUT_P_24BIT_INT);
        register_cfasl_input_function($cfasl_opcode_n_24bit_int$.getGlobalValue(), CFASL_INPUT_N_24BIT_INT);
        register_cfasl_input_function($cfasl_opcode_p_32bit_int$.getGlobalValue(), CFASL_INPUT_P_32BIT_INT);
        register_cfasl_input_function($cfasl_opcode_n_32bit_int$.getGlobalValue(), CFASL_INPUT_N_32BIT_INT);
        register_cfasl_input_function($cfasl_opcode_p_bignum$.getGlobalValue(), CFASL_INPUT_P_BIGNUM);
        register_cfasl_input_function($cfasl_opcode_n_bignum$.getGlobalValue(), CFASL_INPUT_N_BIGNUM);
        register_method($cfasl_output_object_method_table$.getGlobalValue(), $dtp_bignum$.getGlobalValue(), symbol_function(CFASL_OUTPUT_OBJECT_INTEGER_METHOD));
        register_method($cfasl_output_object_method_table$.getGlobalValue(), $dtp_fixnum$.getGlobalValue(), symbol_function(CFASL_OUTPUT_OBJECT_INTEGER_METHOD));
        SubLSpecialOperatorDeclarations.proclaim($list130);
        register_cfasl_input_function($cfasl_opcode_p_float$.getGlobalValue(), CFASL_INPUT_P_FLOAT);
        register_cfasl_input_function($cfasl_opcode_n_float$.getGlobalValue(), CFASL_INPUT_N_FLOAT);
        register_method($cfasl_output_object_method_table$.getGlobalValue(), $dtp_float$.getGlobalValue(), symbol_function(CFASL_OUTPUT_OBJECT_FLOAT_METHOD));
        register_method($cfasl_output_object_method_table$.getGlobalValue(), $dtp_symbol$.getGlobalValue(), symbol_function(CFASL_OUTPUT_OBJECT_SYMBOL_METHOD));
        register_cfasl_input_function($cfasl_opcode_keyword$.getGlobalValue(), CFASL_INPUT_KEYWORD);
        register_cfasl_input_function($cfasl_opcode_other_symbol$.getGlobalValue(), CFASL_INPUT_OTHER_SYMBOL);
        register_cfasl_input_function($cfasl_opcode_nil$.getGlobalValue(), CFASL_INPUT_NIL);
        register_cfasl_input_function($cfasl_opcode_common_symbol$.getGlobalValue(), CFASL_INPUT_COMMON_SYMBOL);
        register_method($cfasl_output_object_method_table$.getGlobalValue(), $dtp_cons$.getGlobalValue(), symbol_function(CFASL_OUTPUT_OBJECT_CONS_METHOD));
        declare_defglobal($cfasl_list_methods$);
        register_cfasl_input_function($cfasl_opcode_list$.getGlobalValue(), CFASL_INPUT_LIST);
        register_cfasl_input_function($cfasl_opcode_dotted_list$.getGlobalValue(), CFASL_INPUT_DOTTED_LIST);
        register_method($cfasl_output_object_method_table$.getGlobalValue(), $dtp_vector$.getGlobalValue(), symbol_function(CFASL_OUTPUT_OBJECT_VECTOR_METHOD));
        register_cfasl_input_function($cfasl_opcode_general_vector$.getGlobalValue(), CFASL_INPUT_GENERAL_VECTOR);
        register_cfasl_input_function($cfasl_opcode_byte_vector$.getGlobalValue(), CFASL_INPUT_BYTE_VECTOR);
        register_cfasl_input_function($cfasl_opcode_string$.getGlobalValue(), CFASL_INPUT_STRING);
        register_method($cfasl_output_object_method_table$.getGlobalValue(), $dtp_string$.getGlobalValue(), symbol_function(CFASL_OUTPUT_OBJECT_STRING_METHOD));
        register_cfasl_input_function($cfasl_opcode_character$.getGlobalValue(), CFASL_INPUT_CHARACTER);
        register_method($cfasl_output_object_method_table$.getGlobalValue(), $dtp_character$.getGlobalValue(), symbol_function(CFASL_OUTPUT_OBJECT_CHARACTER_METHOD));
        register_cfasl_input_function($cfasl_opcode_hashtable$.getGlobalValue(), CFASL_INPUT_HASHTABLE);
        register_method($cfasl_output_object_method_table$.getGlobalValue(), $dtp_hash_table$.getGlobalValue(), symbol_function(CFASL_OUTPUT_OBJECT_HASH_TABLE_METHOD));
        register_cfasl_input_function($cfasl_opcode_guid$.getGlobalValue(), CFASL_INPUT_GUID);
        register_method($cfasl_output_object_method_table$.getGlobalValue(), Guids.$dtp_guid$.getGlobalValue(), symbol_function(CFASL_OUTPUT_OBJECT_GUID_METHOD));
        register_cfasl_input_function($cfasl_opcode_legacy_guid$.getGlobalValue(), CFASL_INPUT_LEGACY_GUID);
        register_cfasl_input_function($cfasl_opcode_result_set$.getGlobalValue(), CFASL_INPUT_RESULT_SET);
        register_cfasl_input_function($cfasl_opcode_package$.getGlobalValue(), CFASL_INPUT_PACKAGE);
        register_method($cfasl_output_object_method_table$.getGlobalValue(), $dtp_package$.getGlobalValue(), symbol_function(CFASL_OUTPUT_OBJECT_PACKAGE_METHOD));
        register_cfasl_input_function($cfasl_opcode_wide_cfasl_opcode$.getGlobalValue(), CFASL_INPUT_WIDE_OPCODE_ENCODED);
        declare_defglobal($cfasl_wide_opcode_input_method_table$);
        register_macro_helper(REGISTER_WIDE_CFASL_OPCODE_INPUT_FUNCTION, DECLARE_WIDE_CFASL_OPCODE);
        register_cfasl_input_function($cfasl_opcode_instance$.getGlobalValue(), CFASL_INPUT_INSTANCE);
        register_method($cfasl_output_object_method_table$.getGlobalValue(), subloop_structures.$dtp_instance$.getGlobalValue(), symbol_function(CFASL_OUTPUT_OBJECT_INSTANCE_METHOD));
        register_cfasl_input_function($cfasl_opcode_guid_denoted_type$.getGlobalValue(), CFASL_INPUT_GUID_DENOTED_TYPE);
        declare_defglobal($cfasl_guid_denoted_type_input_method_table$);
        register_macro_helper(REGISTER_CFASL_GUID_DENOTED_TYPE_INPUT_FUNCTION, DECLARE_CFASL_GUID_OPCODE);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_cfasl_file();
    }

    @Override
    public void initializeVariables() {
        init_cfasl_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_cfasl_file();
    }

    public static final class $cfasl_encoding_stream_native extends SubLStructNative {
        public SubLObject $internal_stream;

        public SubLObject $count;

        private static final SubLStructDeclNative structDecl;

        public $cfasl_encoding_stream_native() {
            this.$internal_stream = Lisp.NIL;
            this.$count = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$internal_stream;
        }

        @Override
        public SubLObject getField3() {
            return this.$count;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$internal_stream = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$count = value;
        }

        static {
            structDecl = makeStructDeclNative(cfasl.$cfasl_encoding_stream_native.class, CFASL_ENCODING_STREAM, CFASL_ENCODING_STREAM_P, $list2, $list3, new String[]{ "$internal_stream", "$count" }, $list4, $list5, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static final class $cfasl_encoding_stream_p$UnaryFunction extends UnaryFunction {
        public $cfasl_encoding_stream_p$UnaryFunction() {
            super(extractFunctionNamed("CFASL-ENCODING-STREAM-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return cfasl_encoding_stream_p(arg1);
        }
    }

    public static final class $cfasl_decoding_stream_native extends SubLStructNative {
        public SubLObject $internal_stream;

        public SubLObject $position;

        private static final SubLStructDeclNative structDecl;

        public $cfasl_decoding_stream_native() {
            this.$internal_stream = Lisp.NIL;
            this.$position = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$internal_stream;
        }

        @Override
        public SubLObject getField3() {
            return this.$position;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$internal_stream = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$position = value;
        }

        static {
            structDecl = makeStructDeclNative(cfasl.$cfasl_decoding_stream_native.class, CFASL_DECODING_STREAM, CFASL_DECODING_STREAM_P, $list41, $list42, new String[]{ "$internal_stream", "$position" }, $list43, $list44, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static final class $cfasl_decoding_stream_p$UnaryFunction extends UnaryFunction {
        public $cfasl_decoding_stream_p$UnaryFunction() {
            super(extractFunctionNamed("CFASL-DECODING-STREAM-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return cfasl_decoding_stream_p(arg1);
        }
    }

    public static final class $cfasl_count_stream_native extends SubLStructNative {
        public SubLObject $position;

        private static final SubLStructDeclNative structDecl;

        public $cfasl_count_stream_native() {
            this.$position = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$position;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$position = value;
        }

        static {
            structDecl = makeStructDeclNative(cfasl.$cfasl_count_stream_native.class, CFASL_COUNT_STREAM, CFASL_COUNT_STREAM_P, $list64, $list65, new String[]{ "$position" }, $list66, $list67, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static final class $cfasl_count_stream_p$UnaryFunction extends UnaryFunction {
        public $cfasl_count_stream_p$UnaryFunction() {
            super(extractFunctionNamed("CFASL-COUNT-STREAM-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return cfasl_count_stream_p(arg1);
        }
    }

    public static final class $cfasl_input_n_8bit_int$UnaryFunction extends UnaryFunction {
        public $cfasl_input_n_8bit_int$UnaryFunction() {
            super(extractFunctionNamed("CFASL-INPUT-N-8BIT-INT"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return cfasl_input_n_8bit_int(arg1);
        }
    }

    public static final class $cfasl_input_p_16bit_int$UnaryFunction extends UnaryFunction {
        public $cfasl_input_p_16bit_int$UnaryFunction() {
            super(extractFunctionNamed("CFASL-INPUT-P-16BIT-INT"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return cfasl_input_p_16bit_int(arg1);
        }
    }

    public static final class $cfasl_input_p_24bit_int$UnaryFunction extends UnaryFunction {
        public $cfasl_input_p_24bit_int$UnaryFunction() {
            super(extractFunctionNamed("CFASL-INPUT-P-24BIT-INT"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return cfasl_input_p_24bit_int(arg1);
        }
    }

    public static final class $cfasl_input_n_24bit_int$UnaryFunction extends UnaryFunction {
        public $cfasl_input_n_24bit_int$UnaryFunction() {
            super(extractFunctionNamed("CFASL-INPUT-N-24BIT-INT"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return cfasl_input_n_24bit_int(arg1);
        }
    }

    public static final class $cfasl_input_p_32bit_int$UnaryFunction extends UnaryFunction {
        public $cfasl_input_p_32bit_int$UnaryFunction() {
            super(extractFunctionNamed("CFASL-INPUT-P-32BIT-INT"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return cfasl_input_p_32bit_int(arg1);
        }
    }

    public static final class $cfasl_input_p_bignum$UnaryFunction extends UnaryFunction {
        public $cfasl_input_p_bignum$UnaryFunction() {
            super(extractFunctionNamed("CFASL-INPUT-P-BIGNUM"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return cfasl_input_p_bignum(arg1);
        }
    }

    public static final class $cfasl_input_p_float$UnaryFunction extends UnaryFunction {
        public $cfasl_input_p_float$UnaryFunction() {
            super(extractFunctionNamed("CFASL-INPUT-P-FLOAT"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return cfasl_input_p_float(arg1);
        }
    }

    public static final class $cfasl_input_n_float$UnaryFunction extends UnaryFunction {
        public $cfasl_input_n_float$UnaryFunction() {
            super(extractFunctionNamed("CFASL-INPUT-N-FLOAT"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return cfasl_input_n_float(arg1);
        }
    }

    public static final class $cfasl_input_keyword$UnaryFunction extends UnaryFunction {
        public $cfasl_input_keyword$UnaryFunction() {
            super(extractFunctionNamed("CFASL-INPUT-KEYWORD"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return cfasl_input_keyword(arg1);
        }
    }

    public static final class $cfasl_input_other_symbol$UnaryFunction extends UnaryFunction {
        public $cfasl_input_other_symbol$UnaryFunction() {
            super(extractFunctionNamed("CFASL-INPUT-OTHER-SYMBOL"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return cfasl_input_other_symbol(arg1);
        }
    }

    public static final class $cfasl_input_nil$UnaryFunction extends UnaryFunction {
        public $cfasl_input_nil$UnaryFunction() {
            super(extractFunctionNamed("CFASL-INPUT-NIL"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return cfasl_input_nil(arg1);
        }
    }

    public static final class $cfasl_input_common_symbol$UnaryFunction extends UnaryFunction {
        public $cfasl_input_common_symbol$UnaryFunction() {
            super(extractFunctionNamed("CFASL-INPUT-COMMON-SYMBOL"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return cfasl_input_common_symbol(arg1);
        }
    }

    public static final class $cfasl_input_list$UnaryFunction extends UnaryFunction {
        public $cfasl_input_list$UnaryFunction() {
            super(extractFunctionNamed("CFASL-INPUT-LIST"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return cfasl_input_list(arg1);
        }
    }

    public static final class $cfasl_input_dotted_list$UnaryFunction extends UnaryFunction {
        public $cfasl_input_dotted_list$UnaryFunction() {
            super(extractFunctionNamed("CFASL-INPUT-DOTTED-LIST"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return cfasl_input_dotted_list(arg1);
        }
    }

    public static final class $cfasl_input_general_vector$UnaryFunction extends UnaryFunction {
        public $cfasl_input_general_vector$UnaryFunction() {
            super(extractFunctionNamed("CFASL-INPUT-GENERAL-VECTOR"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return cfasl_input_general_vector(arg1);
        }
    }

    public static final class $cfasl_input_string$UnaryFunction extends UnaryFunction {
        public $cfasl_input_string$UnaryFunction() {
            super(extractFunctionNamed("CFASL-INPUT-STRING"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return cfasl_input_string(arg1);
        }
    }

    public static final class $cfasl_input_character$UnaryFunction extends UnaryFunction {
        public $cfasl_input_character$UnaryFunction() {
            super(extractFunctionNamed("CFASL-INPUT-CHARACTER"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return cfasl_input_character(arg1);
        }
    }

    public static final class $cfasl_input_guid$UnaryFunction extends UnaryFunction {
        public $cfasl_input_guid$UnaryFunction() {
            super(extractFunctionNamed("CFASL-INPUT-GUID"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return cfasl_input_guid(arg1);
        }
    }
}

/**
 * Total time: 663 ms
 */
