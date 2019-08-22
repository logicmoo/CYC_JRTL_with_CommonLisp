package com.cyc.cycjava.cycl;

import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;

import java.util.Iterator;
import java.util.Map;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cfasl
    extends
      SubLTranslatedFile
{
  public static final SubLFile me = new cfasl();
  public static final String myName = "com.cyc.cycjava.cycl.cfasl";
  public static final String myFingerPrint = "aa0383efe486a1476ef93ea66fa0e83f5a21a4c9f6739e5bc4b8b3c3c55264d2";
  public static SubLSymbol $dtp_cfasl_encoding_stream$ = null;
  private static SubLSymbol $terse_guid_serialization_enabledP$ = null;
  public static SubLSymbol $terse_guid_serialization_enabled_for_cfasl_encode_externalizedP$ = null;
  public static SubLSymbol $dtp_cfasl_decoding_stream$ = null;
  public static SubLSymbol $dtp_cfasl_count_stream$ = null;
  public static SubLSymbol $cfasl_stream_extensions_enabled$ = null;
  public static SubLSymbol $cfasl_unread_byte$ = null;
  public static SubLSymbol $cfasl_output_object_method_table$ = null;
  public static SubLSymbol $cfasl_input_to_static_area$ = null;
  private static SubLSymbol $cfasl_max_opcode$ = null;
  private static SubLSymbol $cfasl_input_method_table$ = null;
  public static SubLSymbol $within_cfasl_externalization$ = null;
  public static SubLSymbol $cfasl_channel_externalizedP$ = null;
  private static SubLSymbol $cfasl_extensions$ = null;
  private static SubLSymbol $cfasl_opcode_externalization$ = null;
  private static SubLSymbol $current_cfasl_defstruct_output_stream$ = null;
  private static SubLSymbol $cfasl_opcode_defstruct_recipe$ = null;
  private static SubLSymbol $cfasl_immediate_fixnum_cutoff$ = null;
  private static SubLSymbol $cfasl_immediate_fixnum_offset$ = null;
  private static SubLSymbol $cfasl_opcode_p_8bit_int$ = null;
  private static SubLSymbol $cfasl_opcode_n_8bit_int$ = null;
  private static SubLSymbol $cfasl_opcode_p_16bit_int$ = null;
  private static SubLSymbol $cfasl_opcode_n_16bit_int$ = null;
  private static SubLSymbol $cfasl_opcode_p_24bit_int$ = null;
  private static SubLSymbol $cfasl_opcode_n_24bit_int$ = null;
  private static SubLSymbol $cfasl_opcode_p_32bit_int$ = null;
  private static SubLSymbol $cfasl_opcode_n_32bit_int$ = null;
  private static SubLSymbol $cfasl_opcode_p_bignum$ = null;
  private static SubLSymbol $cfasl_opcode_n_bignum$ = null;
  private static SubLSymbol $cfasl_opcode_p_float$ = null;
  private static SubLSymbol $cfasl_opcode_n_float$ = null;
  private static SubLSymbol $cfasl_opcode_keyword$ = null;
  private static SubLSymbol $cfasl_opcode_other_symbol$ = null;
  private static SubLSymbol $cfasl_opcode_nil$ = null;
  private static SubLSymbol $cfasl_opcode_common_symbol$ = null;
  public static SubLSymbol $cfasl_common_symbols$ = null;
  private static SubLSymbol $cfasl_list_methods$ = null;
  private static SubLSymbol $cfasl_opcode_list$ = null;
  private static SubLSymbol $cfasl_opcode_dotted_list$ = null;
  private static SubLSymbol $cfasl_opcode_general_vector$ = null;
  private static SubLSymbol $cfasl_opcode_byte_vector$ = null;
  private static SubLSymbol $cfasl_opcode_string$ = null;
  private static SubLSymbol $cfasl_input_string_resource$ = null;
  private static SubLSymbol $cfasl_opcode_character$ = null;
  private static SubLSymbol $cfasl_opcode_hashtable$ = null;
  private static SubLSymbol $cfasl_opcode_guid$ = null;
  private static SubLSymbol $cfasl_opcode_legacy_guid$ = null;
  public static SubLSymbol $cfasl_input_guid_string_resource$ = null;
  private static SubLSymbol $cfasl_opcode_result_set$ = null;
  private static SubLSymbol $cfasl_opcode_package$ = null;
  private static SubLSymbol $cfasl_opcode_wide_cfasl_opcode$ = null;
  public static SubLSymbol $cfasl_min_wide_opcode$ = null;
  private static SubLSymbol $cfasl_wide_opcode_input_method_table$ = null;
  private static SubLSymbol $cfasl_opcode_instance$ = null;
  private static SubLSymbol $cfasl_opcode_guid_denoted_type$ = null;
  private static SubLSymbol $cfasl_guid_denoted_type_input_method_table$ = null;
  private static final SubLSymbol $sym0$CFASL_ENCODING_STREAM = makeSymbol( "CFASL-ENCODING-STREAM" );
  private static final SubLSymbol $sym1$CFASL_ENCODING_STREAM_P = makeSymbol( "CFASL-ENCODING-STREAM-P" );
  private static final SubLList $list2 = ConsesLow.list( makeSymbol( "INTERNAL-STREAM" ), makeSymbol( "COUNT" ) );
  private static final SubLList $list3 = ConsesLow.list( makeKeyword( "INTERNAL-STREAM" ), makeKeyword( "COUNT" ) );
  private static final SubLList $list4 = ConsesLow.list( makeSymbol( "CFASL-ENCODING-STREAM-INTERNAL-STREAM" ), makeSymbol( "CFASL-ENCODING-STREAM-COUNT" ) );
  private static final SubLList $list5 = ConsesLow.list( makeSymbol( "_CSETF-CFASL-ENCODING-STREAM-INTERNAL-STREAM" ), makeSymbol( "_CSETF-CFASL-ENCODING-STREAM-COUNT" ) );
  private static final SubLSymbol $sym6$DEFAULT_STRUCT_PRINT_FUNCTION = makeSymbol( "DEFAULT-STRUCT-PRINT-FUNCTION" );
  private static final SubLSymbol $sym7$CFASL_ENCODING_STREAM_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "CFASL-ENCODING-STREAM-PRINT-FUNCTION-TRAMPOLINE" );
  private static final SubLList $list8 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "CFASL-ENCODING-STREAM-P" ) );
  private static final SubLSymbol $sym9$CFASL_ENCODING_STREAM_INTERNAL_STREAM = makeSymbol( "CFASL-ENCODING-STREAM-INTERNAL-STREAM" );
  private static final SubLSymbol $sym10$_CSETF_CFASL_ENCODING_STREAM_INTERNAL_STREAM = makeSymbol( "_CSETF-CFASL-ENCODING-STREAM-INTERNAL-STREAM" );
  private static final SubLSymbol $sym11$CFASL_ENCODING_STREAM_COUNT = makeSymbol( "CFASL-ENCODING-STREAM-COUNT" );
  private static final SubLSymbol $sym12$_CSETF_CFASL_ENCODING_STREAM_COUNT = makeSymbol( "_CSETF-CFASL-ENCODING-STREAM-COUNT" );
  private static final SubLSymbol $kw13$INTERNAL_STREAM = makeKeyword( "INTERNAL-STREAM" );
  private static final SubLSymbol $kw14$COUNT = makeKeyword( "COUNT" );
  private static final SubLString $str15$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
  private static final SubLSymbol $kw16$BEGIN = makeKeyword( "BEGIN" );
  private static final SubLSymbol $sym17$MAKE_CFASL_ENCODING_STREAM = makeSymbol( "MAKE-CFASL-ENCODING-STREAM" );
  private static final SubLSymbol $kw18$SLOT = makeKeyword( "SLOT" );
  private static final SubLSymbol $kw19$END = makeKeyword( "END" );
  private static final SubLSymbol $sym20$VISIT_DEFSTRUCT_OBJECT_CFASL_ENCODING_STREAM_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-CFASL-ENCODING-STREAM-METHOD" );
  private static final SubLList $list21 = ConsesLow.list( ConsesLow.list( makeSymbol( "STREAM" ), makeSymbol( "STRING" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
  private static final SubLSymbol $sym22$SYMBOLP = makeSymbol( "SYMBOLP" );
  private static final SubLSymbol $sym23$CLET = makeSymbol( "CLET" );
  private static final SubLList $list24 = ConsesLow.list( ConsesLow.list( makeSymbol( "NEW-CFASL-ENCODING-STREAM" ) ) );
  private static final SubLSymbol $sym25$CUNWIND_PROTECT = makeSymbol( "CUNWIND-PROTECT" );
  private static final SubLSymbol $sym26$PROGN = makeSymbol( "PROGN" );
  private static final SubLSymbol $sym27$CSETQ = makeSymbol( "CSETQ" );
  private static final SubLSymbol $sym28$CFASL_ENCODING_STRING_STREAM_ENCODING = makeSymbol( "CFASL-ENCODING-STRING-STREAM-ENCODING" );
  private static final SubLSymbol $sym29$CLOSE_CFASL_ENCODING_STREAM = makeSymbol( "CLOSE-CFASL-ENCODING-STREAM" );
  private static final SubLSymbol $sym30$WITH_CFASL_OUTPUT_TO_HEX_STRING = makeSymbol( "WITH-CFASL-OUTPUT-TO-HEX-STRING" );
  private static final SubLList $list31 = ConsesLow.list( ConsesLow.list( makeSymbol( "STREAM" ), makeSymbol( "BYTE-VECTOR" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
  private static final SubLSymbol $sym32$CFASL_ENCODING_STREAM_ENCODING = makeSymbol( "CFASL-ENCODING-STREAM-ENCODING" );
  private static final SubLSymbol $sym33$NEW_CFASL_ENCODING_STREAM = makeSymbol( "NEW-CFASL-ENCODING-STREAM" );
  private static final SubLSymbol $sym34$WITH_CFASL_OUTPUT_TO_BYTE_VECTOR = makeSymbol( "WITH-CFASL-OUTPUT-TO-BYTE-VECTOR" );
  private static final SubLSymbol $sym35$CFASL_ENCODING_STREAM_WRITE_BYTE = makeSymbol( "CFASL-ENCODING-STREAM-WRITE-BYTE" );
  private static final SubLSymbol $sym36$CFASL_ENCODING_STREAM_HEXCHAR_POSITION = makeSymbol( "CFASL-ENCODING-STREAM-HEXCHAR-POSITION" );
  private static final SubLSymbol $sym37$CFASL_ENCODING_STREAM_BYTE_POSITION = makeSymbol( "CFASL-ENCODING-STREAM-BYTE-POSITION" );
  private static final SubLSymbol $kw38$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
  private static final SubLSymbol $sym39$CFASL_DECODING_STREAM = makeSymbol( "CFASL-DECODING-STREAM" );
  private static final SubLSymbol $sym40$CFASL_DECODING_STREAM_P = makeSymbol( "CFASL-DECODING-STREAM-P" );
  private static final SubLList $list41 = ConsesLow.list( makeSymbol( "INTERNAL-STREAM" ), makeSymbol( "POSITION" ) );
  private static final SubLList $list42 = ConsesLow.list( makeKeyword( "INTERNAL-STREAM" ), makeKeyword( "POSITION" ) );
  private static final SubLList $list43 = ConsesLow.list( makeSymbol( "CFASL-DECODING-STREAM-INTERNAL-STREAM" ), makeSymbol( "CFASL-DECODING-STREAM-POSITION" ) );
  private static final SubLList $list44 = ConsesLow.list( makeSymbol( "_CSETF-CFASL-DECODING-STREAM-INTERNAL-STREAM" ), makeSymbol( "_CSETF-CFASL-DECODING-STREAM-POSITION" ) );
  private static final SubLSymbol $sym45$CFASL_DECODING_STREAM_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "CFASL-DECODING-STREAM-PRINT-FUNCTION-TRAMPOLINE" );
  private static final SubLList $list46 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "CFASL-DECODING-STREAM-P" ) );
  private static final SubLSymbol $sym47$CFASL_DECODING_STREAM_INTERNAL_STREAM = makeSymbol( "CFASL-DECODING-STREAM-INTERNAL-STREAM" );
  private static final SubLSymbol $sym48$_CSETF_CFASL_DECODING_STREAM_INTERNAL_STREAM = makeSymbol( "_CSETF-CFASL-DECODING-STREAM-INTERNAL-STREAM" );
  private static final SubLSymbol $sym49$CFASL_DECODING_STREAM_POSITION = makeSymbol( "CFASL-DECODING-STREAM-POSITION" );
  private static final SubLSymbol $sym50$_CSETF_CFASL_DECODING_STREAM_POSITION = makeSymbol( "_CSETF-CFASL-DECODING-STREAM-POSITION" );
  private static final SubLSymbol $kw51$POSITION = makeKeyword( "POSITION" );
  private static final SubLSymbol $sym52$MAKE_CFASL_DECODING_STREAM = makeSymbol( "MAKE-CFASL-DECODING-STREAM" );
  private static final SubLSymbol $sym53$VISIT_DEFSTRUCT_OBJECT_CFASL_DECODING_STREAM_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-CFASL-DECODING-STREAM-METHOD" );
  private static final SubLSymbol $sym54$NEW_CFASL_DECODING_STREAM_FROM_STRING = makeSymbol( "NEW-CFASL-DECODING-STREAM-FROM-STRING" );
  private static final SubLSymbol $sym55$CLOSE_CFASL_DECODING_STREAM = makeSymbol( "CLOSE-CFASL-DECODING-STREAM" );
  private static final SubLSymbol $sym56$WITH_CFASL_INPUT_FROM_STRING = makeSymbol( "WITH-CFASL-INPUT-FROM-STRING" );
  private static final SubLSymbol $sym57$NEW_CFASL_DECODING_STREAM = makeSymbol( "NEW-CFASL-DECODING-STREAM" );
  private static final SubLSymbol $sym58$WITH_CFASL_INPUT_FROM_BYTE_VECTOR = makeSymbol( "WITH-CFASL-INPUT-FROM-BYTE-VECTOR" );
  private static final SubLSymbol $sym59$CFASL_ENCODING_P = makeSymbol( "CFASL-ENCODING-P" );
  private static final SubLSymbol $sym60$CFASL_DECODING_STREAM_READ_BYTE = makeSymbol( "CFASL-DECODING-STREAM-READ-BYTE" );
  private static final SubLSymbol $kw61$EOF = makeKeyword( "EOF" );
  private static final SubLSymbol $sym62$CFASL_COUNT_STREAM = makeSymbol( "CFASL-COUNT-STREAM" );
  private static final SubLSymbol $sym63$CFASL_COUNT_STREAM_P = makeSymbol( "CFASL-COUNT-STREAM-P" );
  private static final SubLList $list64 = ConsesLow.list( makeSymbol( "POSITION" ) );
  private static final SubLList $list65 = ConsesLow.list( makeKeyword( "POSITION" ) );
  private static final SubLList $list66 = ConsesLow.list( makeSymbol( "CFASL-COUNT-STREAM-POSITION" ) );
  private static final SubLList $list67 = ConsesLow.list( makeSymbol( "_CSETF-CFASL-COUNT-STREAM-POSITION" ) );
  private static final SubLSymbol $sym68$CFASL_COUNT_STREAM_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "CFASL-COUNT-STREAM-PRINT-FUNCTION-TRAMPOLINE" );
  private static final SubLList $list69 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "CFASL-COUNT-STREAM-P" ) );
  private static final SubLSymbol $sym70$CFASL_COUNT_STREAM_POSITION = makeSymbol( "CFASL-COUNT-STREAM-POSITION" );
  private static final SubLSymbol $sym71$_CSETF_CFASL_COUNT_STREAM_POSITION = makeSymbol( "_CSETF-CFASL-COUNT-STREAM-POSITION" );
  private static final SubLSymbol $sym72$MAKE_CFASL_COUNT_STREAM = makeSymbol( "MAKE-CFASL-COUNT-STREAM" );
  private static final SubLSymbol $sym73$VISIT_DEFSTRUCT_OBJECT_CFASL_COUNT_STREAM_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-CFASL-COUNT-STREAM-METHOD" );
  private static final SubLList $list74 = ConsesLow.list( ConsesLow.list( makeSymbol( "STREAM" ), makeSymbol( "COUNT" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
  private static final SubLList $list75 = ConsesLow.list( ConsesLow.list( makeSymbol( "NEW-CFASL-COUNT-STREAM" ) ) );
  private static final SubLSymbol $sym76$CFASL_COUNT_STREAM_SIZE = makeSymbol( "CFASL-COUNT-STREAM-SIZE" );
  private static final SubLSymbol $sym77$CLOSE_CFASL_COUNT_STREAM = makeSymbol( "CLOSE-CFASL-COUNT-STREAM" );
  private static final SubLList $list78;
  private static final SubLInteger $int79$256 = makeInteger( 256 );
  private static final SubLSymbol $sym80$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol( "CATCH-ERROR-MESSAGE-HANDLER" );
  private static final SubLString $str81$Use_NIL_instead = makeString( "Use NIL instead" );
  private static final SubLString $str82$CFASL_cannot_handle____S = makeString( "CFASL cannot handle : ~S" );
  private static final SubLString $str83$Undefined_cfasl_opcode_in__S = makeString( "Undefined cfasl opcode in ~S" );
  private static final SubLString $str84$end_of_file_on_stream__S = makeString( "end-of-file on stream ~S" );
  private static final SubLSymbol $sym85$CFASL_INPUT_ERROR = makeSymbol( "CFASL-INPUT-ERROR" );
  private static final SubLString $str86$Undefined_cfasl_opcode__A_in__S = makeString( "Undefined cfasl opcode ~A in ~S" );
  private static final SubLInteger $int87$128 = makeInteger( 128 );
  private static final SubLSymbol $sym88$_CFASL_INPUT_METHOD_TABLE_ = makeSymbol( "*CFASL-INPUT-METHOD-TABLE*" );
  private static final SubLList $list89 = ConsesLow.list( makeSymbol( "VARIABLE" ), makeSymbol( "CFASL-OPCODE" ), makeSymbol( "INPUT-FUNCTION" ) );
  private static final SubLSymbol $sym90$INTEGERP = makeSymbol( "INTEGERP" );
  private static final SubLSymbol $sym91$DEFCONSTANT_PRIVATE = makeSymbol( "DEFCONSTANT-PRIVATE" );
  private static final SubLSymbol $sym92$REGISTER_CFASL_INPUT_FUNCTION = makeSymbol( "REGISTER-CFASL-INPUT-FUNCTION" );
  private static final SubLSymbol $sym93$QUOTE = makeSymbol( "QUOTE" );
  private static final SubLSymbol $sym94$DECLARE_CFASL_OPCODE = makeSymbol( "DECLARE-CFASL-OPCODE" );
  private static final SubLSymbol $kw95$SL2JAVA = makeKeyword( "SL2JAVA" );
  private static final SubLSymbol $sym96$PIF = makeSymbol( "PIF" );
  private static final SubLSymbol $sym97$_CFASL_INPUT_TO_STATIC_AREA_ = makeSymbol( "*CFASL-INPUT-TO-STATIC-AREA*" );
  private static final SubLSymbol $sym98$WITH_STATIC_AREA = makeSymbol( "WITH-STATIC-AREA" );
  private static final SubLList $list99;
  private static final SubLList $list100;
  private static final SubLList $list101;
  private static final SubLSymbol $sym102$_CFASL_EXTENSIONS_ = makeSymbol( "*CFASL-EXTENSIONS*" );
  private static final SubLList $list103 = ConsesLow.list( makeSymbol( "VARIABLE" ), makeSymbol( "CFASL-OPCODE" ), makeSymbol( "PRED-FUNC" ), makeSymbol( "OUTPUT-FUNC" ), makeSymbol( "INPUT-FUNC" ) );
  private static final SubLSymbol $sym104$REGISTER_CFASL_EXTENSION = makeSymbol( "REGISTER-CFASL-EXTENSION" );
  private static final SubLSymbol $sym105$DECLARE_CFASL_EXTENSION_OPCODE = makeSymbol( "DECLARE-CFASL-EXTENSION-OPCODE" );
  private static final SubLInteger $int106$51 = makeInteger( 51 );
  private static final SubLSymbol $sym107$CFASL_INPUT_EXTERNALIZATION = makeSymbol( "CFASL-INPUT-EXTERNALIZATION" );
  private static final SubLInteger $int108$44 = makeInteger( 44 );
  private static final SubLSymbol $sym109$CFASL_INPUT_DEFSTRUCT_RECIPE = makeSymbol( "CFASL-INPUT-DEFSTRUCT-RECIPE" );
  private static final SubLSymbol $sym110$CFASL_OUTPUT_DEFSTRUCT_RECIPE_VISITORFN = makeSymbol( "CFASL-OUTPUT-DEFSTRUCT-RECIPE-VISITORFN" );
  private static final SubLString $str111$Error__expected_constructor_for_d = makeString( "Error, expected constructor for defstruct, got ~A." );
  private static final SubLString $str112$Expected_keyword_at_slot___A_of_s = makeString( "Expected keyword at slot #~A of structure with constructor ~A, got ~A." );
  private static final SubLSymbol $sym113$CFASL_INPUT_P_8BIT_INT = makeSymbol( "CFASL-INPUT-P-8BIT-INT" );
  private static final SubLSymbol $sym114$CFASL_INPUT_N_8BIT_INT = makeSymbol( "CFASL-INPUT-N-8BIT-INT" );
  private static final SubLSymbol $sym115$CFASL_INPUT_P_16BIT_INT = makeSymbol( "CFASL-INPUT-P-16BIT-INT" );
  private static final SubLSymbol $sym116$CFASL_INPUT_N_16BIT_INT = makeSymbol( "CFASL-INPUT-N-16BIT-INT" );
  private static final SubLSymbol $sym117$CFASL_INPUT_P_24BIT_INT = makeSymbol( "CFASL-INPUT-P-24BIT-INT" );
  private static final SubLSymbol $sym118$CFASL_INPUT_N_24BIT_INT = makeSymbol( "CFASL-INPUT-N-24BIT-INT" );
  private static final SubLSymbol $sym119$CFASL_INPUT_P_32BIT_INT = makeSymbol( "CFASL-INPUT-P-32BIT-INT" );
  private static final SubLSymbol $sym120$CFASL_INPUT_N_32BIT_INT = makeSymbol( "CFASL-INPUT-N-32BIT-INT" );
  private static final SubLInteger $int121$23 = makeInteger( 23 );
  private static final SubLSymbol $sym122$CFASL_INPUT_P_BIGNUM = makeSymbol( "CFASL-INPUT-P-BIGNUM" );
  private static final SubLInteger $int123$24 = makeInteger( 24 );
  private static final SubLSymbol $sym124$CFASL_INPUT_N_BIGNUM = makeSymbol( "CFASL-INPUT-N-BIGNUM" );
  private static final SubLSymbol $sym125$CFASL_OUTPUT_OBJECT_INTEGER_METHOD = makeSymbol( "CFASL-OUTPUT-OBJECT-INTEGER-METHOD" );
  private static final SubLInteger $int126$32768 = makeInteger( 32768 );
  private static final SubLInteger $int127$8388608 = makeInteger( 0x800000 );
  private static final SubLInteger $int128$2147483648 = makeInteger( "2147483648" );
  private static final SubLList $list129 = ConsesLow.list( makeSymbol( "SIGN" ), makeSymbol( "&REST" ), makeSymbol( "FIXNUMS" ) );
  private static final SubLList $list130 = ConsesLow.list( makeSymbol( "INLINE" ), makeSymbol( "ASSEMBLE-2-FIXNUMS-TO-NON-NEGATIVE-INTEGER" ), makeSymbol( "ASSEMBLE-3-FIXNUMS-TO-NON-NEGATIVE-INTEGER" ), makeSymbol(
      "ASSEMBLE-4-FIXNUMS-TO-NON-NEGATIVE-INTEGER" ) );
  private static final SubLInteger $int131$32 = makeInteger( 32 );
  private static final SubLSymbol $sym132$ASSEMBLE_FIXNUMS_TO_INTEGER = makeSymbol( "ASSEMBLE-FIXNUMS-TO-INTEGER" );
  private static final SubLSymbol $sym133$CFASL_INPUT_P_FLOAT = makeSymbol( "CFASL-INPUT-P-FLOAT" );
  private static final SubLSymbol $sym134$CFASL_INPUT_N_FLOAT = makeSymbol( "CFASL-INPUT-N-FLOAT" );
  private static final SubLSymbol $sym135$CFASL_OUTPUT_OBJECT_FLOAT_METHOD = makeSymbol( "CFASL-OUTPUT-OBJECT-FLOAT-METHOD" );
  private static final SubLSymbol $sym136$CFASL_OUTPUT_OBJECT_SYMBOL_METHOD = makeSymbol( "CFASL-OUTPUT-OBJECT-SYMBOL-METHOD" );
  private static final SubLSymbol $sym137$CFASL_INPUT_KEYWORD = makeSymbol( "CFASL-INPUT-KEYWORD" );
  private static final SubLSymbol $sym138$CFASL_INPUT_OTHER_SYMBOL = makeSymbol( "CFASL-INPUT-OTHER-SYMBOL" );
  private static final SubLSymbol $sym139$CFASL_INPUT_NIL = makeSymbol( "CFASL-INPUT-NIL" );
  private static final SubLInteger $int140$50 = makeInteger( 50 );
  private static final SubLSymbol $sym141$CFASL_INPUT_COMMON_SYMBOL = makeSymbol( "CFASL-INPUT-COMMON-SYMBOL" );
  private static final SubLSymbol $sym142$VECTOR = makeSymbol( "VECTOR" );
  private static final SubLList $list143 = ConsesLow.list( makeSymbol( "SYMBOLS" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
  private static final SubLList $list144;
  private static final SubLSymbol $sym145$CFASL_SET_COMMON_SYMBOLS = makeSymbol( "CFASL-SET-COMMON-SYMBOLS" );
  private static final SubLSymbol $sym146$CFASL_SET_COMMON_SYMBOLS_SIMPLE = makeSymbol( "CFASL-SET-COMMON-SYMBOLS-SIMPLE" );
  private static final SubLString $str147$Use_NIL_ = makeString( "Use NIL." );
  private static final SubLString $str148$Common_symbol_at_index__D_was_not = makeString( "Common symbol at index ~D was not found in ~S." );
  private static final SubLSymbol $sym149$_CFASL_COMMON_SYMBOLS_ = makeSymbol( "*CFASL-COMMON-SYMBOLS*" );
  private static final SubLSymbol $sym150$CFASL_OUTPUT_OBJECT_CONS_METHOD = makeSymbol( "CFASL-OUTPUT-OBJECT-CONS-METHOD" );
  private static final SubLSymbol $sym151$_CFASL_LIST_METHODS_ = makeSymbol( "*CFASL-LIST-METHODS*" );
  private static final SubLSymbol $sym152$CFASL_INPUT_LIST = makeSymbol( "CFASL-INPUT-LIST" );
  private static final SubLString $str153$Output_NIL_instead = makeString( "Output NIL instead" );
  private static final SubLString $str154$Trying_to_output_a_circular_list_ = makeString( "Trying to output a circular list!" );
  private static final SubLSymbol $sym155$CFASL_INPUT_DOTTED_LIST = makeSymbol( "CFASL-INPUT-DOTTED-LIST" );
  private static final SubLSymbol $sym156$CFASL_OUTPUT_OBJECT_VECTOR_METHOD = makeSymbol( "CFASL-OUTPUT-OBJECT-VECTOR-METHOD" );
  private static final SubLSymbol $sym157$CFASL_INPUT_GENERAL_VECTOR = makeSymbol( "CFASL-INPUT-GENERAL-VECTOR" );
  private static final SubLInteger $int158$26 = makeInteger( 26 );
  private static final SubLSymbol $sym159$CFASL_INPUT_BYTE_VECTOR = makeSymbol( "CFASL-INPUT-BYTE-VECTOR" );
  private static final SubLSymbol $sym160$CFASL_INPUT_STRING = makeSymbol( "CFASL-INPUT-STRING" );
  private static final SubLSymbol $sym161$CFASL_OUTPUT_OBJECT_STRING_METHOD = makeSymbol( "CFASL-OUTPUT-OBJECT-STRING-METHOD" );
  private static final SubLSymbol $sym162$CFASL_INPUT_CHARACTER = makeSymbol( "CFASL-INPUT-CHARACTER" );
  private static final SubLSymbol $sym163$CFASL_OUTPUT_OBJECT_CHARACTER_METHOD = makeSymbol( "CFASL-OUTPUT-OBJECT-CHARACTER-METHOD" );
  private static final SubLSymbol $sym164$CFASL_INPUT_HASHTABLE = makeSymbol( "CFASL-INPUT-HASHTABLE" );
  private static final SubLSymbol $sym165$CFASL_OUTPUT_OBJECT_HASH_TABLE_METHOD = makeSymbol( "CFASL-OUTPUT-OBJECT-HASH-TABLE-METHOD" );
  private static final SubLInteger $int166$43 = makeInteger( 43 );
  private static final SubLSymbol $sym167$CFASL_INPUT_GUID = makeSymbol( "CFASL-INPUT-GUID" );
  private static final SubLSymbol $sym168$CFASL_OUTPUT_OBJECT_GUID_METHOD = makeSymbol( "CFASL-OUTPUT-OBJECT-GUID-METHOD" );
  private static final SubLInteger $int169$25 = makeInteger( 25 );
  private static final SubLSymbol $sym170$CFASL_INPUT_LEGACY_GUID = makeSymbol( "CFASL-INPUT-LEGACY-GUID" );
  private static final SubLInteger $int171$36 = makeInteger( 36 );
  private static final SubLList $list172 = ConsesLow.list( ConsesLow.list( makeSymbol( "*CFASL-INPUT-GUID-STRING-RESOURCE*" ), ConsesLow.list( makeSymbol( "GET-NEW-CFASL-INPUT-GUID-STRING-RESOURCE" ) ) ) );
  private static final SubLInteger $int173$27 = makeInteger( 27 );
  private static final SubLSymbol $sym174$CFASL_INPUT_RESULT_SET = makeSymbol( "CFASL-INPUT-RESULT-SET" );
  private static final SubLInteger $int175$28 = makeInteger( 28 );
  private static final SubLSymbol $sym176$CFASL_INPUT_PACKAGE = makeSymbol( "CFASL-INPUT-PACKAGE" );
  private static final SubLSymbol $sym177$CFASL_OUTPUT_OBJECT_PACKAGE_METHOD = makeSymbol( "CFASL-OUTPUT-OBJECT-PACKAGE-METHOD" );
  private static final SubLInteger $int178$29 = makeInteger( 29 );
  private static final SubLSymbol $sym179$CFASL_INPUT_WIDE_OPCODE_ENCODED = makeSymbol( "CFASL-INPUT-WIDE-OPCODE-ENCODED" );
  private static final SubLSymbol $sym180$_CFASL_WIDE_OPCODE_INPUT_METHOD_TABLE_ = makeSymbol( "*CFASL-WIDE-OPCODE-INPUT-METHOD-TABLE*" );
  private static final SubLSymbol $kw181$NOT_FOUND = makeKeyword( "NOT-FOUND" );
  private static final SubLList $list182 = ConsesLow.list( makeSymbol( "VARIABLE" ), makeSymbol( "WIDE-OPCODE" ), makeSymbol( "INPUT-FUNCTION" ) );
  private static final SubLString $str183$_A_is_too_small_to_be_a_wide_opco = makeString( "~A is too small to be a wide opcode." );
  private static final SubLSymbol $sym184$REGISTER_WIDE_CFASL_OPCODE_INPUT_FUNCTION = makeSymbol( "REGISTER-WIDE-CFASL-OPCODE-INPUT-FUNCTION" );
  private static final SubLSymbol $sym185$DECLARE_WIDE_CFASL_OPCODE = makeSymbol( "DECLARE-WIDE-CFASL-OPCODE" );
  private static final SubLInteger $int186$124 = makeInteger( 124 );
  private static final SubLSymbol $sym187$CFASL_INPUT_INSTANCE = makeSymbol( "CFASL-INPUT-INSTANCE" );
  private static final SubLSymbol $sym188$CFASL_OUTPUT = makeSymbol( "CFASL-OUTPUT" );
  private static final SubLSymbol $sym189$CFASL_OUTPUT_OBJECT_INSTANCE_METHOD = makeSymbol( "CFASL-OUTPUT-OBJECT-INSTANCE-METHOD" );
  private static final SubLSymbol $sym190$CFASL_INPUT = makeSymbol( "CFASL-INPUT" );
  private static final SubLInteger $int191$126 = makeInteger( 126 );
  private static final SubLSymbol $sym192$CFASL_INPUT_GUID_DENOTED_TYPE = makeSymbol( "CFASL-INPUT-GUID-DENOTED-TYPE" );
  private static final SubLSymbol $sym193$_CFASL_GUID_DENOTED_TYPE_INPUT_METHOD_TABLE_ = makeSymbol( "*CFASL-GUID-DENOTED-TYPE-INPUT-METHOD-TABLE*" );
  private static final SubLInteger $int194$100 = makeInteger( 100 );
  private static final SubLList $list195 = ConsesLow.list( makeSymbol( "VARIABLE" ), makeSymbol( "CFASL-GUID-OPCODE" ), makeSymbol( "INPUT-FUNCTION" ) );
  private static final SubLSymbol $sym196$GUID_P = makeSymbol( "GUID-P" );
  private static final SubLSymbol $sym197$DEFLEXICAL_PRIVATE = makeSymbol( "DEFLEXICAL-PRIVATE" );
  private static final SubLSymbol $sym198$REGISTER_CFASL_GUID_DENOTED_TYPE_INPUT_FUNCTION = makeSymbol( "REGISTER-CFASL-GUID-DENOTED-TYPE-INPUT-FUNCTION" );
  private static final SubLList $list199 = ConsesLow.list( makeSymbol( "VARIABLE" ), makeSymbol( "CFASL-GUID-STRING-OPCODE" ), makeSymbol( "INPUT-FUNCTION" ) );
  private static final SubLSymbol $sym200$GUID_STRING_P = makeSymbol( "GUID-STRING-P" );
  private static final SubLSymbol $sym201$STRING_TO_GUID = makeSymbol( "STRING-TO-GUID" );
  private static final SubLSymbol $sym202$DECLARE_CFASL_GUID_OPCODE = makeSymbol( "DECLARE-CFASL-GUID-OPCODE" );
  private static final SubLList $list203 = ConsesLow.list( ConsesLow.list( makeSymbol( "TYPE-DENOTING-GUID" ), makeSymbol( "STREAM" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
  private static final SubLSymbol $sym204$WRITE_CFASL_GUID_DENOTED_TYPE_OPCODE = makeSymbol( "WRITE-CFASL-GUID-DENOTED-TYPE-OPCODE" );
  private static final SubLSymbol $kw205$INPUT = makeKeyword( "INPUT" );
  private static final SubLString $str206$Unable_to_open__S = makeString( "Unable to open ~S" );
  static
  {
    $list78 = ConsesLow.list( ConsesLow.list( makeSymbol( "*CFASL-STREAM-EXTENSIONS-ENABLED*" ), T ), ConsesLow.list( makeSymbol( "*CFASL-UNREAD-BYTE*" ), NIL ) );
    $list99 = ConsesLow.list( ConsesLow.list( makeSymbol( "*WITHIN-CFASL-EXTERNALIZATION*" ), T ) );
    $list100 = ConsesLow.list( ConsesLow.list( makeSymbol( "*WITHIN-CFASL-EXTERNALIZATION*" ), NIL ) );
    $list101 = ConsesLow.list( ConsesLow.list( makeSymbol( "*CFASL-CHANNEL-EXTERNALIZED?*" ), NIL ) );
    $list144 = ConsesLow.list( ConsesLow.list( makeSymbol( "*CFASL-COMMON-SYMBOLS*" ), NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1785L)
  public static SubLObject cfasl_encoding_p(final SubLObject v_object)
  {
    return vector_utilities.byte_vector_p( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2078L)
  public static SubLObject cfasl_encodable_stream_p(final SubLObject v_object)
  {
    return makeBoolean( v_object.isStream() || NIL != cfasl_encoding_stream_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2522L)
  public static SubLObject cfasl_encoding_stream_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    compatibility.default_struct_print_function( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2522L)
  public static SubLObject cfasl_encoding_stream_p(final SubLObject v_object)
  {
    return ( v_object.getJavaClass() ==$cfasl_encoding_stream_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2522L)
  public static SubLObject cfasl_encoding_stream_internal_stream(final SubLObject v_object)
  {
    assert NIL != cfasl_encoding_stream_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2522L)
  public static SubLObject cfasl_encoding_stream_count(final SubLObject v_object)
  {
    assert NIL != cfasl_encoding_stream_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2522L)
  public static SubLObject _csetf_cfasl_encoding_stream_internal_stream(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != cfasl_encoding_stream_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2522L)
  public static SubLObject _csetf_cfasl_encoding_stream_count(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != cfasl_encoding_stream_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2522L)
  public static SubLObject make_cfasl_encoding_stream(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $cfasl_encoding_stream_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw13$INTERNAL_STREAM ) )
      {
        _csetf_cfasl_encoding_stream_internal_stream( v_new, current_value );
      }
      else if( pcase_var.eql( $kw14$COUNT ) )
      {
        _csetf_cfasl_encoding_stream_count( v_new, current_value );
      }
      else
      {
        Errors.error( $str15$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2522L)
  public static SubLObject visit_defstruct_cfasl_encoding_stream(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw16$BEGIN, $sym17$MAKE_CFASL_ENCODING_STREAM, TWO_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw18$SLOT, $kw13$INTERNAL_STREAM, cfasl_encoding_stream_internal_stream( obj ) );
    Functions.funcall( visitor_fn, obj, $kw18$SLOT, $kw14$COUNT, cfasl_encoding_stream_count( obj ) );
    Functions.funcall( visitor_fn, obj, $kw19$END, $sym17$MAKE_CFASL_ENCODING_STREAM, TWO_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2522L)
  public static SubLObject visit_defstruct_object_cfasl_encoding_stream_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_cfasl_encoding_stream( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2600L)
  public static SubLObject with_cfasl_output_to_hex_string(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list21 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject stream = NIL;
    SubLObject string = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list21 );
    stream = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list21 );
    string = current.first();
    current = current.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list21 );
      return NIL;
    }
    final SubLObject body;
    current = ( body = temp );
    assert NIL != Types.symbolp( stream ) : stream;
    assert NIL != Types.symbolp( string ) : string;
    return ConsesLow.list( $sym23$CLET, ConsesLow.list( reader.bq_cons( stream, $list24 ) ), ConsesLow.list( $sym25$CUNWIND_PROTECT, reader.bq_cons( $sym26$PROGN, ConsesLow.append( body, ConsesLow.list( ConsesLow.list(
        $sym27$CSETQ, string, ConsesLow.list( $sym28$CFASL_ENCODING_STRING_STREAM_ENCODING, stream ) ) ) ) ), ConsesLow.list( $sym29$CLOSE_CFASL_ENCODING_STREAM, stream ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3041L)
  public static SubLObject cfasl_encoding_string_stream_encoding(final SubLObject encoding_stream)
  {
    return streams_high.get_output_stream_string( cfasl_encoding_stream_internal_stream( encoding_stream ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3254L)
  public static SubLObject with_cfasl_output_to_byte_vector(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list31 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject stream = NIL;
    SubLObject byte_vector = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list31 );
    stream = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list31 );
    byte_vector = current.first();
    current = current.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list31 );
      return NIL;
    }
    final SubLObject body;
    current = ( body = temp );
    assert NIL != Types.symbolp( stream ) : stream;
    assert NIL != Types.symbolp( byte_vector ) : byte_vector;
    return ConsesLow.list( $sym23$CLET, ConsesLow.list( reader.bq_cons( stream, $list24 ) ), ConsesLow.list( $sym25$CUNWIND_PROTECT, reader.bq_cons( $sym26$PROGN, ConsesLow.append( body, ConsesLow.list( ConsesLow.list(
        $sym27$CSETQ, byte_vector, ConsesLow.list( $sym32$CFASL_ENCODING_STREAM_ENCODING, stream ) ) ) ) ), ConsesLow.list( $sym29$CLOSE_CFASL_ENCODING_STREAM, stream ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3698L)
  public static SubLObject new_cfasl_encoding_stream()
  {
    final SubLObject encoding_stream = make_cfasl_encoding_stream( UNPROVIDED );
    final SubLObject string_stream = streams_high.make_private_string_output_stream();
    _csetf_cfasl_encoding_stream_internal_stream( encoding_stream, string_stream );
    _csetf_cfasl_encoding_stream_count( encoding_stream, ZERO_INTEGER );
    return encoding_stream;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4089L)
  public static SubLObject cfasl_encoding_stream_write_byte(final SubLObject v_byte, final SubLObject encoding_stream)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject internal_stream = cfasl_encoding_stream_internal_stream( encoding_stream );
    thread.resetMultipleValues();
    final SubLObject high_char = vector_utilities.byte_to_hex_chars( v_byte );
    final SubLObject low_char = thread.secondMultipleValue();
    thread.resetMultipleValues();
    streams_high.write_char( high_char, internal_stream );
    streams_high.write_char( low_char, internal_stream );
    _csetf_cfasl_encoding_stream_count( encoding_stream, Numbers.add( cfasl_encoding_stream_count( encoding_stream ), TWO_INTEGER ) );
    return v_byte;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4543L)
  public static SubLObject cfasl_encoding_stream_encoding(final SubLObject encoding_stream)
  {
    assert NIL != cfasl_encoding_stream_p( encoding_stream ) : encoding_stream;
    final SubLObject encoding_string = cfasl_encoding_string_stream_encoding( encoding_stream );
    final SubLObject encoding = vector_utilities.hex_char_string_to_byte_vector( encoding_string );
    return encoding;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4880L)
  public static SubLObject close_cfasl_encoding_stream(final SubLObject encoding_stream)
  {
    assert NIL != cfasl_encoding_stream_p( encoding_stream ) : encoding_stream;
    return streams_high.close( cfasl_encoding_stream_internal_stream( encoding_stream ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5120L)
  public static SubLObject cfasl_encoding_stream_hexchar_position(final SubLObject encoding_stream)
  {
    assert NIL != cfasl_encoding_stream_p( encoding_stream ) : encoding_stream;
    final SubLObject internal_stream = cfasl_encoding_stream_internal_stream( encoding_stream );
    final SubLObject position = cfasl_encoding_stream_count( encoding_stream );
    return position;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5540L)
  public static SubLObject cfasl_encoding_stream_byte_position(final SubLObject encoding_stream)
  {
    return Numbers.integerDivide( cfasl_encoding_stream_hexchar_position( encoding_stream ), TWO_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5734L)
  public static SubLObject cfasl_encode(final SubLObject v_object)
  {
    SubLObject encoding = NIL;
    final SubLObject stream = new_cfasl_encoding_stream();
    try
    {
      cfasl_output( v_object, stream );
      encoding = cfasl_encoding_stream_encoding( stream );
    }
    finally
    {
      final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
      try
      {
        Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
        final SubLObject _values = Values.getValuesAsVector();
        close_cfasl_encoding_stream( stream );
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
      }
    }
    return encoding;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6025L)
  public static SubLObject cfasl_encode_externalized(final SubLObject v_object)
  {
    SubLObject encoding = NIL;
    final SubLObject stream = new_cfasl_encoding_stream();
    try
    {
      cfasl_output_externalized( v_object, stream );
      encoding = cfasl_encoding_stream_encoding( stream );
    }
    finally
    {
      final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
      try
      {
        Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
        final SubLObject _values = Values.getValuesAsVector();
        close_cfasl_encoding_stream( stream );
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
      }
    }
    return encoding;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6693L)
  public static SubLObject cfasl_encode_externalized_terse(final SubLObject v_object)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject encoding = NIL;
    final SubLObject _prev_bind_0 = $terse_guid_serialization_enabledP$.currentBinding( thread );
    try
    {
      $terse_guid_serialization_enabledP$.bind( ( $terse_guid_serialization_enabled_for_cfasl_encode_externalizedP$.getDynamicValue( thread ) == $kw38$UNINITIALIZED ) ? T
          : $terse_guid_serialization_enabled_for_cfasl_encode_externalizedP$.getDynamicValue( thread ), thread );
      final SubLObject stream = new_cfasl_encoding_stream();
      try
      {
        cfasl_output_externalized( v_object, stream );
        encoding = cfasl_encoding_stream_encoding( stream );
      }
      finally
      {
        final SubLObject _prev_bind_0_$1 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          close_cfasl_encoding_stream( stream );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$1, thread );
        }
      }
    }
    finally
    {
      $terse_guid_serialization_enabledP$.rebind( _prev_bind_0, thread );
    }
    return encoding;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7278L)
  public static SubLObject cfasl_decodable_stream_p(final SubLObject v_object)
  {
    return makeBoolean( v_object.isStream() || NIL != cfasl_decoding_stream_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7638L)
  public static SubLObject cfasl_decoding_stream_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    compatibility.default_struct_print_function( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7638L)
  public static SubLObject cfasl_decoding_stream_p(final SubLObject v_object)
  {
    return ( v_object.getJavaClass() ==$cfasl_decoding_stream_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7638L)
  public static SubLObject cfasl_decoding_stream_internal_stream(final SubLObject v_object)
  {
    assert NIL != cfasl_decoding_stream_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7638L)
  public static SubLObject cfasl_decoding_stream_position(final SubLObject v_object)
  {
    assert NIL != cfasl_decoding_stream_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7638L)
  public static SubLObject _csetf_cfasl_decoding_stream_internal_stream(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != cfasl_decoding_stream_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7638L)
  public static SubLObject _csetf_cfasl_decoding_stream_position(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != cfasl_decoding_stream_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7638L)
  public static SubLObject make_cfasl_decoding_stream(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $cfasl_decoding_stream_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw13$INTERNAL_STREAM ) )
      {
        _csetf_cfasl_decoding_stream_internal_stream( v_new, current_value );
      }
      else if( pcase_var.eql( $kw51$POSITION ) )
      {
        _csetf_cfasl_decoding_stream_position( v_new, current_value );
      }
      else
      {
        Errors.error( $str15$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7638L)
  public static SubLObject visit_defstruct_cfasl_decoding_stream(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw16$BEGIN, $sym52$MAKE_CFASL_DECODING_STREAM, TWO_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw18$SLOT, $kw13$INTERNAL_STREAM, cfasl_decoding_stream_internal_stream( obj ) );
    Functions.funcall( visitor_fn, obj, $kw18$SLOT, $kw51$POSITION, cfasl_decoding_stream_position( obj ) );
    Functions.funcall( visitor_fn, obj, $kw19$END, $sym52$MAKE_CFASL_DECODING_STREAM, TWO_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7638L)
  public static SubLObject visit_defstruct_object_cfasl_decoding_stream_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_cfasl_decoding_stream( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7707L)
  public static SubLObject with_cfasl_input_from_string(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list21 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject stream = NIL;
    SubLObject string = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list21 );
    stream = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list21 );
    string = current.first();
    current = current.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list21 );
      return NIL;
    }
    final SubLObject body;
    current = ( body = temp );
    assert NIL != Types.symbolp( stream ) : stream;
    return ConsesLow.list( $sym23$CLET, ConsesLow.list( ConsesLow.list( stream, ConsesLow.list( $sym54$NEW_CFASL_DECODING_STREAM_FROM_STRING, string ) ) ), ConsesLow.list( $sym25$CUNWIND_PROTECT, reader.bq_cons(
        $sym26$PROGN, ConsesLow.append( body, NIL ) ), ConsesLow.list( $sym55$CLOSE_CFASL_DECODING_STREAM, stream ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8037L)
  public static SubLObject new_cfasl_decoding_stream_from_string(final SubLObject encoding_string)
  {
    final SubLObject decoding_stream = make_cfasl_decoding_stream( UNPROVIDED );
    final SubLObject internal_stream = streams_high.make_private_string_input_stream( encoding_string, UNPROVIDED, UNPROVIDED );
    _csetf_cfasl_decoding_stream_internal_stream( decoding_stream, internal_stream );
    _csetf_cfasl_decoding_stream_position( decoding_stream, ZERO_INTEGER );
    return decoding_stream;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8458L)
  public static SubLObject with_cfasl_input_from_byte_vector(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list31 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject stream = NIL;
    SubLObject byte_vector = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list31 );
    stream = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list31 );
    byte_vector = current.first();
    current = current.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list31 );
      return NIL;
    }
    final SubLObject body;
    current = ( body = temp );
    assert NIL != Types.symbolp( stream ) : stream;
    return ConsesLow.list( $sym23$CLET, ConsesLow.list( ConsesLow.list( stream, ConsesLow.list( $sym57$NEW_CFASL_DECODING_STREAM, byte_vector ) ) ), ConsesLow.list( $sym25$CUNWIND_PROTECT, reader.bq_cons( $sym26$PROGN,
        ConsesLow.append( body, NIL ) ), ConsesLow.list( $sym55$CLOSE_CFASL_DECODING_STREAM, stream ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8819L)
  public static SubLObject new_cfasl_decoding_stream(final SubLObject encoding)
  {
    assert NIL != cfasl_encoding_p( encoding ) : encoding;
    final SubLObject encoding_string = vector_utilities.byte_vector_to_hex_char_string( encoding );
    return new_cfasl_decoding_stream_from_string( encoding_string );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9102L)
  public static SubLObject cfasl_decoding_stream_read_byte(final SubLObject decoding_stream, SubLObject eof_error_p, SubLObject eof_value)
  {
    if( eof_error_p == UNPROVIDED )
    {
      eof_error_p = T;
    }
    if( eof_value == UNPROVIDED )
    {
      eof_value = $kw61$EOF;
    }
    final SubLObject internal_stream = cfasl_decoding_stream_internal_stream( decoding_stream );
    final SubLObject high_char = streams_high.read_char( internal_stream, eof_error_p, eof_value, UNPROVIDED );
    SubLObject low_char = NIL;
    if( eof_value.eql( high_char ) )
    {
      return eof_value;
    }
    _csetf_cfasl_decoding_stream_position( decoding_stream, Numbers.add( cfasl_decoding_stream_position( decoding_stream ), ONE_INTEGER ) );
    low_char = streams_high.read_char( internal_stream, eof_error_p, eof_value, UNPROVIDED );
    if( eof_value.eql( low_char ) )
    {
      return eof_value;
    }
    _csetf_cfasl_decoding_stream_position( decoding_stream, Numbers.add( cfasl_decoding_stream_position( decoding_stream ), ONE_INTEGER ) );
    return vector_utilities.hex_chars_to_byte( high_char, low_char );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9892L)
  public static SubLObject close_cfasl_decoding_stream(final SubLObject decoding_stream)
  {
    assert NIL != cfasl_decoding_stream_p( decoding_stream ) : decoding_stream;
    return streams_high.close( cfasl_decoding_stream_internal_stream( decoding_stream ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10133L)
  public static SubLObject cfasl_decoding_stream_nybble_position(final SubLObject decoding_stream)
  {
    return cfasl_decoding_stream_position( decoding_stream );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10264L)
  public static SubLObject cfasl_decode(final SubLObject encoding)
  {
    assert NIL != cfasl_encoding_p( encoding ) : encoding;
    SubLObject v_object = NIL;
    final SubLObject stream = new_cfasl_decoding_stream( encoding );
    try
    {
      v_object = cfasl_input( stream, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
      try
      {
        Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
        final SubLObject _values = Values.getValuesAsVector();
        close_cfasl_decoding_stream( stream );
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
      }
    }
    return v_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10546L)
  public static SubLObject cfasl_decoding_stream_byte_position(final SubLObject decoding_stream)
  {
    return Numbers.integerDivide( cfasl_decoding_stream_nybble_position( decoding_stream ), TWO_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10782L)
  public static SubLObject cfasl_decoding_stream_hexchar_position(final SubLObject decoding_stream)
  {
    return cfasl_decoding_stream_nybble_position( decoding_stream );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 11320L)
  public static SubLObject cfasl_count_stream_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    compatibility.default_struct_print_function( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 11320L)
  public static SubLObject cfasl_count_stream_p(final SubLObject v_object)
  {
    return ( v_object.getJavaClass() ==$cfasl_count_stream_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 11320L)
  public static SubLObject cfasl_count_stream_position(final SubLObject v_object)
  {
    assert NIL != cfasl_count_stream_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 11320L)
  public static SubLObject _csetf_cfasl_count_stream_position(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != cfasl_count_stream_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 11320L)
  public static SubLObject make_cfasl_count_stream(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $cfasl_count_stream_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw51$POSITION ) )
      {
        _csetf_cfasl_count_stream_position( v_new, current_value );
      }
      else
      {
        Errors.error( $str15$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 11320L)
  public static SubLObject visit_defstruct_cfasl_count_stream(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw16$BEGIN, $sym72$MAKE_CFASL_COUNT_STREAM, ONE_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw18$SLOT, $kw51$POSITION, cfasl_count_stream_position( obj ) );
    Functions.funcall( visitor_fn, obj, $kw19$END, $sym72$MAKE_CFASL_COUNT_STREAM, ONE_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 11320L)
  public static SubLObject visit_defstruct_object_cfasl_count_stream_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_cfasl_count_stream( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 11369L)
  public static SubLObject with_cfasl_output_to_count_stream(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list74 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject stream = NIL;
    SubLObject count = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list74 );
    stream = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list74 );
    count = current.first();
    current = current.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list74 );
      return NIL;
    }
    final SubLObject body;
    current = ( body = temp );
    assert NIL != Types.symbolp( stream ) : stream;
    assert NIL != Types.symbolp( count ) : count;
    return ConsesLow.list( $sym23$CLET, ConsesLow.list( reader.bq_cons( stream, $list75 ) ), ConsesLow.list( $sym25$CUNWIND_PROTECT, reader.bq_cons( $sym26$PROGN, ConsesLow.append( body, ConsesLow.list( ConsesLow.list(
        $sym27$CSETQ, count, ConsesLow.list( $sym76$CFASL_COUNT_STREAM_SIZE, stream ) ) ) ) ), ConsesLow.list( $sym77$CLOSE_CFASL_COUNT_STREAM, stream ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 11743L)
  public static SubLObject new_cfasl_count_stream()
  {
    final SubLObject stream = make_cfasl_count_stream( UNPROVIDED );
    _csetf_cfasl_count_stream_position( stream, ZERO_INTEGER );
    return stream;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 11901L)
  public static SubLObject cfasl_count_stream_write_byte(final SubLObject v_byte, final SubLObject count_stream)
  {
    _csetf_cfasl_count_stream_position( count_stream, Numbers.add( cfasl_count_stream_position( count_stream ), ONE_INTEGER ) );
    return v_byte;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 12034L)
  public static SubLObject cfasl_count_stream_increment(final SubLObject count, final SubLObject count_stream)
  {
    _csetf_cfasl_count_stream_position( count_stream, Numbers.add( count, cfasl_count_stream_position( count_stream ) ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 12220L)
  public static SubLObject cfasl_count_stream_size(final SubLObject count_stream)
  {
    assert NIL != cfasl_count_stream_p( count_stream ) : count_stream;
    return cfasl_count_stream_position( count_stream );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 12377L)
  public static SubLObject close_cfasl_count_stream(final SubLObject count_stream)
  {
    assert NIL != cfasl_count_stream_p( count_stream ) : count_stream;
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 12496L)
  public static SubLObject cfasl_object_size(final SubLObject v_object)
  {
    SubLObject size = NIL;
    final SubLObject stream = new_cfasl_count_stream();
    try
    {
      cfasl_output( v_object, stream );
      size = cfasl_count_stream_size( stream );
    }
    finally
    {
      final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
      try
      {
        Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
        final SubLObject _values = Values.getValuesAsVector();
        close_cfasl_count_stream( stream );
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
      }
    }
    return size;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 12826L)
  public static SubLObject cfasl_externalized_object_size(final SubLObject v_object)
  {
    SubLObject size = NIL;
    final SubLObject stream = new_cfasl_count_stream();
    try
    {
      cfasl_output_externalized( v_object, stream );
      size = cfasl_count_stream_size( stream );
    }
    finally
    {
      final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
      try
      {
        Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
        final SubLObject _values = Values.getValuesAsVector();
        close_cfasl_count_stream( stream );
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
      }
    }
    return size;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 13567L)
  public static SubLObject with_cfasl_stream_extensions(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym23$CLET, $list78, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 13790L)
  public static SubLObject cfasl_output(final SubLObject v_object, final SubLObject stream)
  {
    if( NIL != cfasl_compression.cfasl_compress_objectP( v_object ) )
    {
      return cfasl_compression.cfasl_output_object_compressed( v_object, stream );
    }
    return cfasl_output_object( v_object, stream );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 15410L)
  public static SubLObject cfasl_output_externalized(final SubLObject v_object, final SubLObject stream)
  {
    return cfasl_output_externalization( v_object, stream );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 15634L)
  public static SubLObject cfasl_output_maybe_externalized(final SubLObject v_object, final SubLObject stream, final SubLObject externalizedP)
  {
    if( NIL != externalizedP )
    {
      return cfasl_output_externalized( v_object, stream );
    }
    return cfasl_output( v_object, stream );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 15895L)
  public static SubLObject cfasl_output_object(final SubLObject v_object, final SubLObject stream)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject method_function = Structures.method_func( v_object, $cfasl_output_object_method_table$.getGlobalValue() );
    if( NIL != method_function )
    {
      return Functions.funcall( method_function, v_object, stream );
    }
    if( NIL == handle_cfasl_extensions( v_object, stream ) )
    {
      SubLObject msg = NIL;
      try
      {
        thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
        final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
        try
        {
          Errors.$error_handler$.bind( $sym80$CATCH_ERROR_MESSAGE_HANDLER, thread );
          try
          {
            cfasl_output_defstruct_recipe( v_object, stream );
          }
          catch( final Throwable catch_var )
          {
            Errors.handleThrowable( catch_var, NIL );
          }
        }
        finally
        {
          Errors.$error_handler$.rebind( _prev_bind_0, thread );
        }
      }
      catch( final Throwable ccatch_env_var )
      {
        msg = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      }
      finally
      {
        thread.throwStack.pop();
      }
      if( msg.isString() )
      {
        cfasl_output_error( v_object, stream );
        return NIL;
      }
    }
    return v_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 16209L)
  public static SubLObject cfasl_output_error(final SubLObject v_object, final SubLObject stream)
  {
    Errors.cerror( $str81$Use_NIL_instead, $str82$CFASL_cannot_handle____S, v_object );
    return cfasl_output_nil( stream );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 16359L)
  public static SubLObject cfasl_raw_write_byte(final SubLObject v_byte, final SubLObject stream)
  {
    if( NIL != cfasl_count_stream_p( stream ) )
    {
      return cfasl_count_stream_write_byte( v_byte, stream );
    }
    if( NIL != cfasl_encoding_stream_p( stream ) )
    {
      return cfasl_encoding_stream_write_byte( v_byte, stream );
    }
    return streams_high.write_byte( v_byte, stream );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17093L)
  public static SubLObject cfasl_input(final SubLObject stream, SubLObject eof_error_p, SubLObject eof_value)
  {
    if( eof_error_p == UNPROVIDED )
    {
      eof_error_p = T;
    }
    if( eof_value == UNPROVIDED )
    {
      eof_value = $kw61$EOF;
    }
    return cfasl_input_internal( stream, eof_error_p, eof_value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17452L)
  public static SubLObject cfasl_opcode_peek(final SubLObject stream, SubLObject eof_error_p, SubLObject eof_value)
  {
    if( eof_error_p == UNPROVIDED )
    {
      eof_error_p = T;
    }
    if( eof_value == UNPROVIDED )
    {
      eof_value = $kw61$EOF;
    }
    return cfasl_opcode_peek_internal( stream, eof_error_p, eof_value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17858L)
  public static SubLObject cfasl_input_object(final SubLObject stream)
  {
    return cfasl_input_internal( stream, NIL, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17966L)
  public static SubLObject cfasl_input_error(final SubLObject stream)
  {
    Errors.error( $str83$Undefined_cfasl_opcode_in__S, stream );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 18138L)
  public static SubLObject cfasl_input_internal(final SubLObject stream, final SubLObject eof_error_p, final SubLObject eof_value)
  {
    final SubLObject opcode = cfasl_raw_read_byte( stream );
    if( NIL == opcode )
    {
      if( NIL != eof_error_p )
      {
        Errors.error( $str84$end_of_file_on_stream__S, stream );
      }
      return eof_value;
    }
    if( NIL != cfasl_immediate_fixnum_opcode( opcode ) )
    {
      return cfasl_extract_immediate_fixnum( opcode );
    }
    final SubLObject cfasl_input_method = cfasl_input_method( opcode );
    if( $sym85$CFASL_INPUT_ERROR == cfasl_input_method )
    {
      return Errors.error( $str86$Undefined_cfasl_opcode__A_in__S, opcode, stream );
    }
    return Functions.funcall( cfasl_input_method, stream );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 18777L)
  public static SubLObject cfasl_opcode_peek_internal(final SubLObject stream, final SubLObject eof_error_p, final SubLObject eof_value)
  {
    final SubLObject opcode = cfasl_raw_peek_byte( stream );
    if( NIL == opcode )
    {
      if( NIL != eof_error_p )
      {
        Errors.error( $str84$end_of_file_on_stream__S, stream );
      }
      return eof_value;
    }
    return opcode;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 19225L)
  public static SubLObject cfasl_input_method(final SubLObject cfasl_opcode)
  {
    return Vectors.aref( $cfasl_input_method_table$.getGlobalValue(), cfasl_opcode );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 19332L)
  public static SubLObject declare_cfasl_opcode(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject variable = NIL;
    SubLObject cfasl_opcode = NIL;
    SubLObject input_function = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list89 );
    variable = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list89 );
    cfasl_opcode = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list89 );
    input_function = current.first();
    current = current.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list89 );
      return NIL;
    }
    assert NIL != Types.symbolp( variable ) : variable;
    assert NIL != Types.integerp( cfasl_opcode ) : cfasl_opcode;
    assert NIL != Types.symbolp( input_function ) : input_function;
    return ConsesLow.list( $sym26$PROGN, ConsesLow.list( $sym91$DEFCONSTANT_PRIVATE, variable, cfasl_opcode ), ConsesLow.list( $sym92$REGISTER_CFASL_INPUT_FUNCTION, variable, ConsesLow.list( $sym93$QUOTE,
        input_function ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 19646L)
  public static SubLObject register_cfasl_input_function(final SubLObject cfasl_opcode, final SubLObject function)
  {
    Vectors.set_aref( $cfasl_input_method_table$.getGlobalValue(), cfasl_opcode, function );
    return function;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 19838L)
  public static SubLObject cfasl_raw_peek_byte(final SubLObject stream)
  {
    final SubLObject v_byte = cfasl_raw_read_byte( stream );
    if( NIL != number_utilities.bytep( v_byte ) )
    {
      streams_high.unread_byte( v_byte, stream );
    }
    return v_byte;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 20118L)
  public static SubLObject cfasl_raw_read_byte(final SubLObject stream)
  {
    if( NIL != cfasl_decoding_stream_p( stream ) )
    {
      return cfasl_decoding_stream_read_byte( stream, NIL, NIL );
    }
    return streams_high.read_byte( stream, NIL, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 20741L)
  public static SubLObject with_cfasl_area_allocation(final SubLObject macroform, final SubLObject environment)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    if( NIL != Sequences.find( $kw95$SL2JAVA, reader.$features$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      return reader.bq_cons( $sym26$PROGN, ConsesLow.append( body, NIL ) );
    }
    return ConsesLow.list( $sym96$PIF, $sym97$_CFASL_INPUT_TO_STATIC_AREA_, reader.bq_cons( $sym98$WITH_STATIC_AREA, ConsesLow.append( body, NIL ) ), reader.bq_cons( $sym26$PROGN, ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 21245L)
  public static SubLObject within_cfasl_externalization(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym23$CLET, $list99, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 21370L)
  public static SubLObject without_cfasl_externalization(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym23$CLET, $list100, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 21507L)
  public static SubLObject within_cfasl_externalization_p()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $within_cfasl_externalization$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 21770L)
  public static SubLObject without_cfasl_channel_externalization(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym23$CLET, $list101, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 21907L)
  public static SubLObject cfasl_channel_externalizedP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $cfasl_channel_externalizedP$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 22281L)
  public static SubLObject declare_cfasl_extension_opcode(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject variable = NIL;
    SubLObject cfasl_opcode = NIL;
    SubLObject pred_func = NIL;
    SubLObject output_func = NIL;
    SubLObject input_func = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list103 );
    variable = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list103 );
    cfasl_opcode = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list103 );
    pred_func = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list103 );
    output_func = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list103 );
    input_func = current.first();
    current = current.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list103 );
      return NIL;
    }
    assert NIL != Types.symbolp( variable ) : variable;
    assert NIL != Types.integerp( cfasl_opcode ) : cfasl_opcode;
    assert NIL != Types.symbolp( pred_func ) : pred_func;
    assert NIL != Types.symbolp( output_func ) : output_func;
    assert NIL != Types.symbolp( input_func ) : input_func;
    return ConsesLow.list( $sym26$PROGN, ConsesLow.list( $sym94$DECLARE_CFASL_OPCODE, variable, cfasl_opcode, input_func ), ConsesLow.list( $sym104$REGISTER_CFASL_EXTENSION, variable, ConsesLow.list( $sym93$QUOTE,
        pred_func ), ConsesLow.list( $sym93$QUOTE, output_func ), ConsesLow.list( $sym93$QUOTE, input_func ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 22717L)
  public static SubLObject register_cfasl_extension(final SubLObject cfasl_number, final SubLObject pred_func, final SubLObject output_func, final SubLObject input_func)
  {
    SubLObject existing = conses_high.assoc( cfasl_number, $cfasl_extensions$.getGlobalValue(), UNPROVIDED, UNPROVIDED );
    if( NIL == existing )
    {
      existing = ConsesLow.make_list( FOUR_INTEGER, cfasl_number );
      $cfasl_extensions$.setGlobalValue( ConsesLow.cons( existing, $cfasl_extensions$.getGlobalValue() ) );
    }
    ConsesLow.set_nth( ONE_INTEGER, existing, pred_func );
    ConsesLow.set_nth( TWO_INTEGER, existing, output_func );
    ConsesLow.set_nth( THREE_INTEGER, existing, input_func );
    return cfasl_number;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 23175L)
  public static SubLObject handle_cfasl_extensions(final SubLObject v_object, final SubLObject stream)
  {
    SubLObject handled = NIL;
    if( NIL == handled )
    {
      SubLObject csome_list_var = $cfasl_extensions$.getGlobalValue();
      SubLObject extension = NIL;
      extension = csome_list_var.first();
      while ( NIL == handled && NIL != csome_list_var)
      {
        if( NIL != Functions.funcall( conses_high.second( extension ), v_object ) )
        {
          Functions.funcall( conses_high.third( extension ), v_object, stream );
          handled = T;
        }
        csome_list_var = csome_list_var.rest();
        extension = csome_list_var.first();
      }
    }
    return handled;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 23433L)
  public static SubLObject cfasl_output_narrow_opcode(final SubLObject opcode, final SubLObject stream)
  {
    cfasl_raw_write_byte( opcode, stream );
    return opcode;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 23720L)
  public static SubLObject cfasl_output_opcode(final SubLObject opcode, final SubLObject stream)
  {
    if( NIL != cfasl_narrow_opcode_p( opcode ) )
    {
      cfasl_output_narrow_opcode( opcode, stream );
    }
    else
    {
      cfasl_output_wide_opcode( opcode, stream );
    }
    return opcode;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 24166L)
  public static SubLObject cfasl_output_externalization(final SubLObject v_object, final SubLObject stream)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    cfasl_raw_write_byte( $cfasl_opcode_externalization$.getGlobalValue(), stream );
    SubLObject v_answer = NIL;
    final SubLObject _prev_bind_0 = $within_cfasl_externalization$.currentBinding( thread );
    try
    {
      $within_cfasl_externalization$.bind( T, thread );
      v_answer = cfasl_output( v_object, stream );
    }
    finally
    {
      $within_cfasl_externalization$.rebind( _prev_bind_0, thread );
    }
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 24423L)
  public static SubLObject cfasl_input_externalization(final SubLObject stream)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject v_answer = NIL;
    final SubLObject _prev_bind_0 = $within_cfasl_externalization$.currentBinding( thread );
    try
    {
      $within_cfasl_externalization$.bind( T, thread );
      v_answer = cfasl_input_object( stream );
    }
    finally
    {
      $within_cfasl_externalization$.rebind( _prev_bind_0, thread );
    }
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 25048L)
  public static SubLObject cfasl_output_defstruct_recipe(final SubLObject v_object, final SubLObject stream)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    cfasl_output_opcode( $cfasl_opcode_defstruct_recipe$.getGlobalValue(), stream );
    final SubLObject _prev_bind_0 = $current_cfasl_defstruct_output_stream$.currentBinding( thread );
    try
    {
      $current_cfasl_defstruct_output_stream$.bind( stream, thread );
      visitation.visit_defstruct( v_object, Symbols.symbol_function( $sym110$CFASL_OUTPUT_DEFSTRUCT_RECIPE_VISITORFN ) );
    }
    finally
    {
      $current_cfasl_defstruct_output_stream$.rebind( _prev_bind_0, thread );
    }
    return v_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 25487L)
  public static SubLObject cfasl_output_defstruct_recipe_visitorfn(final SubLObject obj, final SubLObject phase, final SubLObject param_a, final SubLObject param_b)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject stream = $current_cfasl_defstruct_output_stream$.getDynamicValue( thread );
    if( phase.eql( $kw16$BEGIN ) )
    {
      cfasl_output( param_a, stream );
      cfasl_output( param_b, stream );
    }
    else if( phase.eql( $kw18$SLOT ) )
    {
      cfasl_output( param_a, stream );
      cfasl_output( param_b, stream );
    }
    else if( phase.eql( $kw19$END ) )
    {
    }
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 26222L)
  public static SubLObject cfasl_input_defstruct_recipe(final SubLObject stream)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject constructor_fn = cfasl_input( stream, UNPROVIDED, UNPROVIDED );
    final SubLObject num_of_slots = cfasl_input( stream, UNPROVIDED, UNPROVIDED );
    SubLObject plist = NIL;
    SubLObject cursor = NIL;
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !constructor_fn.isFunctionSpec() )
    {
      Errors.error( $str111$Error__expected_constructor_for_d, constructor_fn );
    }
    plist = ( cursor = ConsesLow.make_list( Numbers.add( num_of_slots, num_of_slots ), UNPROVIDED ) );
    SubLObject i;
    SubLObject slot_name;
    SubLObject slot_value;
    for( i = NIL, i = ZERO_INTEGER; i.numL( num_of_slots ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      slot_name = cfasl_input( stream, UNPROVIDED, UNPROVIDED );
      slot_value = cfasl_input( stream, UNPROVIDED, UNPROVIDED );
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !slot_name.isKeyword() )
      {
        Errors.error( $str112$Expected_keyword_at_slot___A_of_s, i, constructor_fn, slot_name );
      }
      ConsesLow.set_nth( ZERO_INTEGER, cursor, slot_name );
      ConsesLow.set_nth( ONE_INTEGER, cursor, slot_value );
      cursor = conses_high.cddr( cursor );
    }
    return Functions.funcall( constructor_fn, plist );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 27906L)
  public static SubLObject cfasl_immediate_fixnump(final SubLObject v_object)
  {
    return makeBoolean( v_object.isFixnum() && v_object.numGE( ZERO_INTEGER ) && v_object.numL( $cfasl_immediate_fixnum_cutoff$.getGlobalValue() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 28069L)
  public static SubLObject cfasl_output_immediate_fixnum(final SubLObject v_object, final SubLObject stream)
  {
    cfasl_raw_write_byte( Numbers.add( $cfasl_immediate_fixnum_offset$.getGlobalValue(), v_object ), stream );
    return v_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 28223L)
  public static SubLObject cfasl_immediate_fixnum_opcode(final SubLObject opcode)
  {
    return Numbers.numGE( opcode, $cfasl_immediate_fixnum_offset$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 28342L)
  public static SubLObject cfasl_extract_immediate_fixnum(final SubLObject opcode)
  {
    return Numbers.subtract( opcode, $cfasl_immediate_fixnum_offset$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 29248L)
  public static SubLObject cfasl_output_object_integer_method(final SubLObject v_object, final SubLObject stream)
  {
    return cfasl_output_integer( v_object, stream );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 29367L)
  public static SubLObject cfasl_output_integer(final SubLObject integer, final SubLObject stream)
  {
    if( NIL != cfasl_immediate_fixnump( integer ) )
    {
      return cfasl_output_immediate_fixnum( integer, stream );
    }
    final SubLObject positive = Numbers.plusp( integer );
    final SubLObject value = ( NIL != positive ) ? integer : Numbers.abs( integer );
    if( value.numL( $int87$128 ) )
    {
      if( NIL != positive )
      {
        cfasl_raw_write_byte( $cfasl_opcode_p_8bit_int$.getGlobalValue(), stream );
      }
      else
      {
        cfasl_raw_write_byte( $cfasl_opcode_n_8bit_int$.getGlobalValue(), stream );
      }
      cfasl_output_integer_internal( value, ONE_INTEGER, stream );
    }
    else if( value.numL( $int126$32768 ) )
    {
      if( NIL != positive )
      {
        cfasl_raw_write_byte( $cfasl_opcode_p_16bit_int$.getGlobalValue(), stream );
      }
      else
      {
        cfasl_raw_write_byte( $cfasl_opcode_n_16bit_int$.getGlobalValue(), stream );
      }
      cfasl_output_integer_internal( value, TWO_INTEGER, stream );
    }
    else if( value.numL( $int127$8388608 ) )
    {
      if( NIL != positive )
      {
        cfasl_raw_write_byte( $cfasl_opcode_p_24bit_int$.getGlobalValue(), stream );
      }
      else
      {
        cfasl_raw_write_byte( $cfasl_opcode_n_24bit_int$.getGlobalValue(), stream );
      }
      cfasl_output_integer_internal( value, THREE_INTEGER, stream );
    }
    else if( value.numL( $int128$2147483648 ) )
    {
      if( NIL != positive )
      {
        cfasl_raw_write_byte( $cfasl_opcode_p_32bit_int$.getGlobalValue(), stream );
      }
      else
      {
        cfasl_raw_write_byte( $cfasl_opcode_n_32bit_int$.getGlobalValue(), stream );
      }
      cfasl_output_integer_internal( value, FOUR_INTEGER, stream );
    }
    else
    {
      final SubLObject bignum_spec = Numbers.disassemble_integer_to_fixnums( integer );
      SubLObject current;
      final SubLObject datum = current = bignum_spec;
      SubLObject sign = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list129 );
      sign = current.first();
      final SubLObject fixnums;
      current = ( fixnums = current.rest() );
      if( sign.isNegative() )
      {
        cfasl_raw_write_byte( $cfasl_opcode_n_bignum$.getGlobalValue(), stream );
      }
      else
      {
        cfasl_raw_write_byte( $cfasl_opcode_p_bignum$.getGlobalValue(), stream );
      }
      cfasl_output( Sequences.length( fixnums ), stream );
      SubLObject cdolist_list_var = fixnums;
      SubLObject fixnum = NIL;
      fixnum = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        cfasl_output( fixnum, stream );
        cdolist_list_var = cdolist_list_var.rest();
        fixnum = cdolist_list_var.first();
      }
    }
    return integer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 31344L)
  public static SubLObject cfasl_output_integer_internal(final SubLObject integer, final SubLObject bytes, final SubLObject stream)
  {
    if( NIL != cfasl_encoding_stream_p( stream ) || !bytes.numLE( EIGHT_INTEGER ) )
    {
      if( bytes.numE( ONE_INTEGER ) )
      {
        cfasl_raw_write_byte( integer, stream );
      }
      else
      {
        final SubLObject low_part = Numbers.mod( integer, $int79$256 );
        final SubLObject high_part = Numbers.integerDivide( Numbers.subtract( integer, low_part ), $int79$256 );
        cfasl_raw_write_byte( low_part, stream );
        cfasl_output_integer_internal( high_part, Numbers.subtract( bytes, ONE_INTEGER ), stream );
      }
      return integer;
    }
    if( NIL != cfasl_count_stream_p( stream ) )
    {
      cfasl_count_stream_increment( bytes, stream );
      return integer;
    }
    return streams_high.write_positive_integer_as_byte_sequence( integer, bytes, stream, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 32108L)
  public static SubLObject cfasl_input_p_8bit_int(final SubLObject stream)
  {
    return cfasl_input_integer( ONE_INTEGER, stream );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 32208L)
  public static SubLObject cfasl_input_n_8bit_int(final SubLObject stream)
  {
    return Numbers.minus( cfasl_input_integer( ONE_INTEGER, stream ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 32302L)
  public static SubLObject cfasl_input_p_16bit_int(final SubLObject stream)
  {
    return cfasl_input_integer( TWO_INTEGER, stream );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 32392L)
  public static SubLObject cfasl_input_n_16bit_int(final SubLObject stream)
  {
    return Numbers.minus( cfasl_input_integer( TWO_INTEGER, stream ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 32486L)
  public static SubLObject cfasl_input_p_24bit_int(final SubLObject stream)
  {
    return cfasl_input_integer( THREE_INTEGER, stream );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 32576L)
  public static SubLObject cfasl_input_n_24bit_int(final SubLObject stream)
  {
    return Numbers.minus( cfasl_input_integer( THREE_INTEGER, stream ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 32670L)
  public static SubLObject cfasl_input_p_32bit_int(final SubLObject stream)
  {
    return cfasl_input_integer( FOUR_INTEGER, stream );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 32760L)
  public static SubLObject cfasl_input_n_32bit_int(final SubLObject stream)
  {
    return Numbers.minus( cfasl_input_integer( FOUR_INTEGER, stream ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 33010L)
  public static SubLObject assemble_2_fixnums_to_non_negative_integer(final SubLObject fixnum0, final SubLObject fixnum1)
  {
    return Numbers.add( fixnum0, Numbers.ash( fixnum1, EIGHT_INTEGER ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 33197L)
  public static SubLObject assemble_3_fixnums_to_non_negative_integer(final SubLObject fixnum0, final SubLObject fixnum1, final SubLObject fixnum2)
  {
    return Numbers.add( assemble_2_fixnums_to_non_negative_integer( fixnum0, fixnum1 ), Numbers.ash( fixnum2, SIXTEEN_INTEGER ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 33453L)
  public static SubLObject assemble_4_fixnums_to_non_negative_integer(final SubLObject fixnum0, final SubLObject fixnum1, final SubLObject fixnum2, final SubLObject fixnum3)
  {
    return Numbers.add( assemble_3_fixnums_to_non_negative_integer( fixnum0, fixnum1, fixnum2 ), Numbers.ash( fixnum3, $int123$24 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 33735L)
  public static SubLObject cfasl_input_integer(final SubLObject bytes, final SubLObject stream)
  {
    if( NIL == cfasl_decoding_stream_p( stream ) )
    {
      return streams_high.read_byte_sequence_to_positive_integer( bytes, stream, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    if( bytes.numG( FOUR_INTEGER ) )
    {
      final SubLObject high_recursive = cfasl_input_integer( Numbers.subtract( bytes, FOUR_INTEGER ), stream );
      final SubLObject low_4 = cfasl_input_integer( FOUR_INTEGER, stream );
      return Numbers.add( Numbers.ash( high_recursive, $int131$32 ), low_4 );
    }
    if( bytes.eql( FOUR_INTEGER ) )
    {
      final SubLObject fixnum0 = cfasl_raw_read_byte( stream );
      final SubLObject fixnum2 = cfasl_raw_read_byte( stream );
      final SubLObject fixnum3 = cfasl_raw_read_byte( stream );
      final SubLObject fixnum4 = cfasl_raw_read_byte( stream );
      return assemble_4_fixnums_to_non_negative_integer( fixnum0, fixnum2, fixnum3, fixnum4 );
    }
    if( bytes.eql( THREE_INTEGER ) )
    {
      final SubLObject fixnum0 = cfasl_raw_read_byte( stream );
      final SubLObject fixnum2 = cfasl_raw_read_byte( stream );
      final SubLObject fixnum3 = cfasl_raw_read_byte( stream );
      return assemble_3_fixnums_to_non_negative_integer( fixnum0, fixnum2, fixnum3 );
    }
    if( bytes.eql( TWO_INTEGER ) )
    {
      final SubLObject fixnum0 = cfasl_raw_read_byte( stream );
      final SubLObject fixnum2 = cfasl_raw_read_byte( stream );
      return assemble_2_fixnums_to_non_negative_integer( fixnum0, fixnum2 );
    }
    if( bytes.eql( ONE_INTEGER ) )
    {
      final SubLObject fixnum0 = cfasl_raw_read_byte( stream );
      return fixnum0;
    }
    if( bytes.eql( ZERO_INTEGER ) )
    {
      return ZERO_INTEGER;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 34993L)
  public static SubLObject cfasl_input_p_bignum(final SubLObject stream)
  {
    return cfasl_input_bignum( ONE_INTEGER, stream );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 35079L)
  public static SubLObject cfasl_input_n_bignum(final SubLObject stream)
  {
    return cfasl_input_bignum( MINUS_ONE_INTEGER, stream );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 35166L)
  public static SubLObject cfasl_input_bignum(final SubLObject sign, final SubLObject stream)
  {
    final SubLObject count = cfasl_input_object( stream );
    final SubLObject fixnums = ConsesLow.make_list( Numbers.add( count, ONE_INTEGER ), ZERO_INTEGER );
    ConsesLow.rplaca( fixnums, sign );
    SubLObject tail;
    for( tail = NIL, tail = fixnums.rest(); NIL != tail; tail = tail.rest() )
    {
      ConsesLow.rplaca( tail, cfasl_input_object( stream ) );
    }
    SubLObject bignum = NIL;
    bignum = Functions.apply( Symbols.symbol_function( $sym132$ASSEMBLE_FIXNUMS_TO_INTEGER ), fixnums );
    return bignum;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 35770L)
  public static SubLObject cfasl_output_object_float_method(final SubLObject v_object, final SubLObject stream)
  {
    return cfasl_output_float( v_object, stream );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 35885L)
  public static SubLObject cfasl_output_float(final SubLObject v_object, final SubLObject stream)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject signif = Numbers.integer_decode_float( v_object );
    final SubLObject exp = thread.secondMultipleValue();
    final SubLObject sign = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    if( v_object.isNegative() )
    {
      cfasl_raw_write_byte( $cfasl_opcode_n_float$.getGlobalValue(), stream );
    }
    else
    {
      cfasl_raw_write_byte( $cfasl_opcode_p_float$.getGlobalValue(), stream );
    }
    cfasl_output_integer( signif, stream );
    cfasl_output_integer( exp, stream );
    return v_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 36259L)
  public static SubLObject cfasl_input_p_float(final SubLObject stream)
  {
    return cfasl_input_float( stream );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 36351L)
  public static SubLObject cfasl_input_n_float(final SubLObject stream)
  {
    return Numbers.minus( cfasl_input_float( stream ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 36437L)
  public static SubLObject cfasl_input_float(final SubLObject stream)
  {
    final SubLObject signif = cfasl_input_object( stream );
    final SubLObject exp = cfasl_input_object( stream );
    return Numbers.scale_float( Numbers.sublisp_float( signif, UNPROVIDED ), exp );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 36609L)
  public static SubLObject cfasl_output_object_symbol_method(final SubLObject v_object, final SubLObject stream)
  {
    if( NIL == v_object )
    {
      return cfasl_output_nil( stream );
    }
    if( NIL != cfasl_common_symbol_p( v_object ) )
    {
      return cfasl_output_common_symbol( v_object, stream );
    }
    if( v_object.isKeyword() )
    {
      return cfasl_output_keyword( v_object, stream );
    }
    return cfasl_output_other_symbol( v_object, stream );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 37266L)
  public static SubLObject cfasl_output_keyword(final SubLObject v_object, final SubLObject stream)
  {
    cfasl_raw_write_byte( $cfasl_opcode_keyword$.getGlobalValue(), stream );
    cfasl_output_string( Symbols.symbol_name( v_object ), stream );
    return v_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 37454L)
  public static SubLObject cfasl_input_keyword(final SubLObject stream)
  {
    SubLObject name = cfasl_input_object( stream );
    if( Characters.CHAR_colon.eql( Strings.sublisp_char( name, ZERO_INTEGER ) ) )
    {
      name = Sequences.subseq( name, ONE_INTEGER, UNPROVIDED );
    }
    return Symbols.make_keyword( name );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 37821L)
  public static SubLObject cfasl_output_other_symbol(final SubLObject v_object, final SubLObject stream)
  {
    cfasl_raw_write_byte( $cfasl_opcode_other_symbol$.getGlobalValue(), stream );
    if( NIL == cyc_package_symbol_p( v_object ) )
    {
      final SubLObject v_package = Symbols.symbol_package( v_object );
      cfasl_output( v_package, stream );
    }
    cfasl_output_string( Symbols.symbol_name( v_object ), stream );
    return v_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 38144L)
  public static SubLObject cyc_package_symbol_p(final SubLObject v_object)
  {
    return makeBoolean( v_object.isSymbol() && !v_object.isKeyword() && ( control_vars.$cyc_package$.getGlobalValue().eql( Symbols.symbol_package( v_object ) ) || v_object.eql( Packages.find_symbol( Symbols.symbol_name(
        v_object ), control_vars.$cyc_package$.getGlobalValue() ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 38507L)
  public static SubLObject cfasl_input_other_symbol(final SubLObject stream)
  {
    final SubLObject input = cfasl_input_object( stream );
    if( input.isString() )
    {
      final SubLObject name = input;
      return Packages.intern( name, control_vars.$cyc_package$.getGlobalValue() );
    }
    final SubLObject v_package = input;
    final SubLObject name2 = cfasl_input_object( stream );
    if( NIL == v_package )
    {
      return Symbols.make_symbol( name2 );
    }
    return Packages.intern( name2, v_package );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 38999L)
  public static SubLObject cfasl_output_nil(final SubLObject stream)
  {
    cfasl_raw_write_byte( $cfasl_opcode_nil$.getGlobalValue(), stream );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 39117L)
  public static SubLObject cfasl_input_nil(final SubLObject stream)
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 39553L)
  public static SubLObject cfasl_set_common_symbols(final SubLObject symbols)
  {
    $cfasl_common_symbols$.setDynamicValue( Functions.apply( Symbols.symbol_function( $sym142$VECTOR ), symbols ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 39788L)
  public static SubLObject with_cfasl_common_symbols(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject symbols = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list143 );
    symbols = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.listS( $sym23$CLET, $list144, ConsesLow.list( $sym145$CFASL_SET_COMMON_SYMBOLS, symbols ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 39950L)
  public static SubLObject cfasl_set_common_symbols_simple(final SubLObject symbols)
  {
    $cfasl_common_symbols$.setDynamicValue( symbols );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 40287L)
  public static SubLObject with_cfasl_common_symbols_simple(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject symbols = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list143 );
    symbols = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.listS( $sym23$CLET, $list144, ConsesLow.list( $sym146$CFASL_SET_COMMON_SYMBOLS_SIMPLE, symbols ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 40463L)
  public static SubLObject cfasl_current_common_symbols()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( $cfasl_common_symbols$.getDynamicValue( thread ).isVector() )
    {
      return vector_utilities.vector_elements( $cfasl_common_symbols$.getDynamicValue( thread ), UNPROVIDED );
    }
    return $cfasl_common_symbols$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 40789L)
  public static SubLObject cfasl_common_symbol_p(final SubLObject v_object)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return makeBoolean( NIL != $cfasl_common_symbols$.getDynamicValue( thread ) && v_object.isSymbol() && NIL != Sequences.position( v_object, $cfasl_common_symbols$.getDynamicValue( thread ), Symbols.symbol_function(
        EQ ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 40953L)
  public static SubLObject cfasl_encode_common_symbol(final SubLObject symbol)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return Sequences.position( symbol, $cfasl_common_symbols$.getDynamicValue( thread ), Symbols.symbol_function( EQ ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 41061L)
  public static SubLObject cfasl_decode_common_symbol(final SubLObject integer)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $cfasl_common_symbols$.getDynamicValue( thread ).isVector() ? Vectors.aref( $cfasl_common_symbols$.getDynamicValue( thread ), integer )
        : ConsesLow.nth( integer, $cfasl_common_symbols$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 41248L)
  public static SubLObject cfasl_output_common_symbol(final SubLObject symbol, final SubLObject stream)
  {
    final SubLObject encoding = cfasl_encode_common_symbol( symbol );
    cfasl_raw_write_byte( $cfasl_opcode_common_symbol$.getGlobalValue(), stream );
    cfasl_output_integer( encoding, stream );
    return symbol;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 41499L)
  public static SubLObject cfasl_input_common_symbol(final SubLObject stream)
  {
    final SubLObject encoding = cfasl_input_object( stream );
    final SubLObject symbol = cfasl_decode_common_symbol( encoding );
    if( NIL == symbol )
    {
      Errors.cerror( $str147$Use_NIL_, $str148$Common_symbol_at_index__D_was_not, encoding, $sym149$_CFASL_COMMON_SYMBOLS_ );
    }
    return symbol;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 41813L)
  public static SubLObject cfasl_output_object_cons_method(final SubLObject v_object, final SubLObject stream)
  {
    if( NIL != list_utilities.proper_list_p( v_object ) )
    {
      return cfasl_output_list( v_object, stream );
    }
    return cfasl_output_dotted_list( v_object, stream );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 42260L)
  public static SubLObject register_cfasl_list_method(final SubLObject method_key, final SubLObject pred_func, final SubLObject output_func)
  {
    SubLObject existing = conses_high.assoc( method_key, $cfasl_list_methods$.getGlobalValue(), UNPROVIDED, UNPROVIDED );
    if( NIL == existing )
    {
      existing = ConsesLow.make_list( THREE_INTEGER, method_key );
      $cfasl_list_methods$.setGlobalValue( ConsesLow.cons( existing, $cfasl_list_methods$.getGlobalValue() ) );
    }
    ConsesLow.set_nth( ONE_INTEGER, existing, pred_func );
    ConsesLow.set_nth( TWO_INTEGER, existing, output_func );
    return method_key;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 42617L)
  public static SubLObject handle_cfasl_list_methods(final SubLObject v_object, final SubLObject stream)
  {
    SubLObject handled = NIL;
    if( NIL == handled )
    {
      SubLObject csome_list_var = $cfasl_list_methods$.getGlobalValue();
      SubLObject list_method = NIL;
      list_method = csome_list_var.first();
      while ( NIL == handled && NIL != csome_list_var)
      {
        if( NIL != Functions.funcall( conses_high.second( list_method ), v_object ) )
        {
          Functions.funcall( conses_high.third( list_method ), v_object, stream );
          handled = T;
        }
        csome_list_var = csome_list_var.rest();
        list_method = csome_list_var.first();
      }
    }
    return handled;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 43028L)
  public static SubLObject cfasl_output_list(final SubLObject list, final SubLObject stream)
  {
    final SubLObject length = conses_high.list_length( list );
    if( NIL == length )
    {
      Errors.cerror( $str153$Output_NIL_instead, $str154$Trying_to_output_a_circular_list_ );
      return cfasl_output_nil( stream );
    }
    if( length.numE( ZERO_INTEGER ) )
    {
      return cfasl_output_nil( stream );
    }
    if( NIL != $cfasl_list_methods$.getGlobalValue() && NIL != handle_cfasl_list_methods( list, stream ) )
    {
      return NIL;
    }
    cfasl_raw_write_byte( $cfasl_opcode_list$.getGlobalValue(), stream );
    cfasl_output_integer( length, stream );
    SubLObject cdolist_list_var = list;
    SubLObject item = NIL;
    item = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      cfasl_output( item, stream );
      cdolist_list_var = cdolist_list_var.rest();
      item = cdolist_list_var.first();
    }
    return list;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 43776L)
  public static SubLObject cfasl_input_list(final SubLObject stream)
  {
    final SubLObject length = cfasl_input_object( stream );
    SubLObject list = NIL;
    SubLObject list_item = NIL;
    list = ConsesLow.make_list( length, UNPROVIDED );
    SubLObject cell;
    for( cell = NIL, cell = list; NIL != cell; cell = cell.rest() )
    {
      list_item = cfasl_input_object( stream );
      ConsesLow.rplaca( cell, list_item );
    }
    return list;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 44267L)
  public static SubLObject cfasl_output_dotted_list(final SubLObject v_object, final SubLObject stream)
  {
    final SubLObject length = list_utilities.dotted_length( v_object );
    cfasl_raw_write_byte( $cfasl_opcode_dotted_list$.getGlobalValue(), stream );
    cfasl_output_integer( length, stream );
    SubLObject i;
    SubLObject cons;
    for( i = NIL, cons = NIL, i = ZERO_INTEGER, cons = v_object; !i.numE( length ); i = Numbers.add( i, ONE_INTEGER ), cons = cons.rest() )
    {
      cfasl_output( cons.first(), stream );
    }
    cfasl_output( cons, stream );
    return v_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 44669L)
  public static SubLObject cfasl_input_dotted_list(final SubLObject stream)
  {
    final SubLObject length = cfasl_input_object( stream );
    SubLObject list = NIL;
    if( length.numE( ONE_INTEGER ) )
    {
      list = ConsesLow.cons( NIL, NIL );
      ConsesLow.rplaca( list, cfasl_input_object( stream ) );
      ConsesLow.rplacd( list, cfasl_input_object( stream ) );
    }
    else
    {
      list = ConsesLow.make_list( length, UNPROVIDED );
      SubLObject cell;
      for( cell = NIL, cell = list; NIL != cell.rest(); cell = cell.rest() )
      {
        ConsesLow.rplaca( cell, cfasl_input_object( stream ) );
      }
      ConsesLow.rplaca( cell, cfasl_input_object( stream ) );
      ConsesLow.rplacd( cell, cfasl_input_object( stream ) );
    }
    return list;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 45301L)
  public static SubLObject cfasl_output_object_vector_method(final SubLObject v_object, final SubLObject stream)
  {
    if( NIL != vector_utilities.byte_vector_p( v_object ) )
    {
      return cfasl_output_byte_vector( v_object, stream );
    }
    return cfasl_output_general_vector( v_object, stream );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 45753L)
  public static SubLObject cfasl_output_general_vector(final SubLObject vector, final SubLObject stream)
  {
    cfasl_raw_write_byte( $cfasl_opcode_general_vector$.getGlobalValue(), stream );
    final SubLObject length = Sequences.length( vector );
    cfasl_output_integer( length, stream );
    SubLObject i;
    for( i = NIL, i = ZERO_INTEGER; i.numL( length ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      cfasl_output( Vectors.aref( vector, i ), stream );
    }
    return vector;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 46051L)
  public static SubLObject cfasl_input_general_vector(final SubLObject stream)
  {
    final SubLObject length = cfasl_input_object( stream );
    SubLObject vector = NIL;
    vector = Vectors.make_vector( length, UNPROVIDED );
    SubLObject i;
    for( i = NIL, i = ZERO_INTEGER; i.numL( length ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      Vectors.set_aref( vector, i, cfasl_input_object( stream ) );
    }
    return vector;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 46509L)
  public static SubLObject cfasl_output_byte_vector(final SubLObject byte_vector, final SubLObject stream)
  {
    cfasl_raw_write_byte( $cfasl_opcode_byte_vector$.getGlobalValue(), stream );
    final SubLObject length = Sequences.length( byte_vector );
    cfasl_output_integer( length, stream );
    SubLObject i;
    for( i = NIL, i = ZERO_INTEGER; i.numL( length ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      cfasl_raw_write_byte( Vectors.aref( byte_vector, i ), stream );
    }
    return byte_vector;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 46870L)
  public static SubLObject cfasl_input_byte_vector(final SubLObject stream)
  {
    final SubLObject length = cfasl_input_object( stream );
    SubLObject byte_vector = NIL;
    byte_vector = Vectors.make_vector( length, UNPROVIDED );
    SubLObject i;
    for( i = NIL, i = ZERO_INTEGER; i.numL( length ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      Vectors.set_aref( byte_vector, i, cfasl_raw_read_byte( stream ) );
    }
    return byte_vector;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 47326L)
  public static SubLObject cfasl_output_object_string_method(final SubLObject v_object, final SubLObject stream)
  {
    return cfasl_output_string( v_object, stream );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 47443L)
  public static SubLObject cfasl_output_string(final SubLObject string, final SubLObject stream)
  {
    cfasl_raw_write_byte( $cfasl_opcode_string$.getGlobalValue(), stream );
    final SubLObject length = Sequences.length( string );
    cfasl_output_integer( length, stream );
    if( NIL != cfasl_encoding_stream_p( stream ) )
    {
      SubLObject i;
      for( i = NIL, i = ZERO_INTEGER; i.numL( length ); i = Numbers.add( i, ONE_INTEGER ) )
      {
        cfasl_raw_write_byte( Characters.char_code( Strings.sublisp_char( string, i ) ), stream );
      }
      return string;
    }
    if( NIL != cfasl_count_stream_p( stream ) )
    {
      cfasl_count_stream_increment( length, stream );
      return string;
    }
    return streams_high.write_string_to_byte_sequence( string, stream, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 48208L)
  public static SubLObject cfasl_input_string(final SubLObject stream)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject length = cfasl_input_object( stream );
    SubLObject string = NIL;
    if( $cfasl_input_string_resource$.getDynamicValue( thread ).isString() && length.numE( Sequences.length( $cfasl_input_string_resource$.getDynamicValue( thread ) ) ) )
    {
      string = $cfasl_input_string_resource$.getDynamicValue( thread );
    }
    else
    {
      string = Strings.make_string( length, UNPROVIDED );
    }
    if( NIL == cfasl_decoding_stream_p( stream ) )
    {
      return streams_high.read_byte_sequence_into_string( string, stream, UNPROVIDED, UNPROVIDED );
    }
    SubLObject i;
    for( i = NIL, i = ZERO_INTEGER; i.numL( length ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      Strings.set_char( string, i, Characters.code_char( cfasl_raw_read_byte( stream ) ) );
    }
    return string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 48909L)
  public static SubLObject cfasl_output_object_character_method(final SubLObject v_object, final SubLObject stream)
  {
    return cfasl_output_character( v_object, stream );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 49032L)
  public static SubLObject cfasl_output_character(final SubLObject v_object, final SubLObject stream)
  {
    cfasl_raw_write_byte( $cfasl_opcode_character$.getGlobalValue(), stream );
    cfasl_raw_write_byte( Characters.char_code( v_object ), stream );
    return v_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 49212L)
  public static SubLObject cfasl_input_character(final SubLObject stream)
  {
    return Characters.code_char( cfasl_raw_read_byte( stream ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 49435L)
  public static SubLObject cfasl_output_object_hash_table_method(final SubLObject v_object, final SubLObject stream)
  {
    return cfasl_output_hashtable( v_object, stream );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 49559L)
  public static SubLObject cfasl_output_hashtable(final SubLObject v_object, final SubLObject stream)
  {
    cfasl_raw_write_byte( $cfasl_opcode_hashtable$.getGlobalValue(), stream );
    final SubLObject test = hash_table_utilities.hash_test_to_symbol( Hashtables.hash_table_test( v_object ) );
    final SubLObject size = Hashtables.hash_table_count( v_object );
    cfasl_output( test, stream );
    cfasl_output_integer( size, stream );
    SubLObject key = NIL;
    SubLObject value = NIL;
    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( v_object );
    try
    {
      while ( Hashtables.iteratorHasNext( cdohash_iterator ))
      {
        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
        key = Hashtables.getEntryKey( cdohash_entry );
        value = Hashtables.getEntryValue( cdohash_entry );
        cfasl_output( key, stream );
        cfasl_output( value, stream );
      }
    }
    finally
    {
      Hashtables.releaseEntrySetIterator( cdohash_iterator );
    }
    return v_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 49959L)
  public static SubLObject cfasl_input_hashtable(final SubLObject stream)
  {
    SubLObject test = cfasl_input_object( stream );
    final SubLObject size = cfasl_input_object( stream );
    SubLObject hashtable = NIL;
    final SubLObject pcase_var = test;
    if( pcase_var.eql( EQ ) || pcase_var.eql( EQL ) || pcase_var.eql( EQUAL ) || pcase_var.eql( EQUALP ) )
    {
      test = Symbols.symbol_function( test );
    }
    hashtable = Hashtables.make_hash_table( size, test, UNPROVIDED );
    SubLObject i;
    SubLObject key;
    SubLObject value;
    for( i = NIL, i = ZERO_INTEGER; i.numL( size ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      key = cfasl_input_object( stream );
      value = cfasl_input_object( stream );
      Hashtables.sethash( key, hashtable, value );
    }
    return hashtable;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 50588L)
  public static SubLObject cfasl_output_object_guid_method(final SubLObject v_object, final SubLObject stream)
  {
    return cfasl_output_guid( v_object, stream );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 50702L)
  public static SubLObject cfasl_output_guid(final SubLObject guid, final SubLObject stream)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == $terse_guid_serialization_enabledP$.getDynamicValue( thread ) )
    {
      return cfasl_output_legacy_guid( guid, stream );
    }
    cfasl_raw_write_byte( $cfasl_opcode_guid$.getGlobalValue(), stream );
    final SubLObject byte_vector = Guids.disassemble_guid_to_fixnums( guid, UNPROVIDED );
    SubLObject i;
    for( i = NIL, i = ZERO_INTEGER; i.numL( SIXTEEN_INTEGER ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      cfasl_raw_write_byte( Vectors.aref( byte_vector, i ), stream );
    }
    return guid;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 51085L)
  public static SubLObject cfasl_input_guid(final SubLObject stream)
  {
    final SubLObject byte_vector = cfasl_input_guid_byte_vector( stream );
    SubLObject guid = NIL;
    guid = Guids.assemble_fixnums_to_guid( byte_vector );
    return guid;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 51315L)
  public static SubLObject cfasl_input_guid_byte_vector(final SubLObject stream)
  {
    final SubLObject byte_vector = Vectors.make_vector( SIXTEEN_INTEGER, NIL );
    SubLObject i;
    for( i = NIL, i = ZERO_INTEGER; i.numL( SIXTEEN_INTEGER ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      Vectors.set_aref( byte_vector, i, cfasl_raw_read_byte( stream ) );
    }
    return byte_vector;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 51684L)
  public static SubLObject cfasl_output_legacy_guid(final SubLObject guid, final SubLObject stream)
  {
    cfasl_raw_write_byte( $cfasl_opcode_legacy_guid$.getGlobalValue(), stream );
    final SubLObject string = Guids.guid_to_string( guid );
    cfasl_output_string( string, stream );
    return guid;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 51907L)
  public static SubLObject cfasl_input_legacy_guid(final SubLObject stream)
  {
    final SubLObject string = cfasl_input_guid_string( stream );
    SubLObject guid = NIL;
    guid = Guids.string_to_guid( string );
    return guid;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 52192L)
  public static SubLObject cfasl_input_guid_string(final SubLObject stream)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject string = NIL;
    final SubLObject _prev_bind_0 = $cfasl_input_string_resource$.currentBinding( thread );
    try
    {
      $cfasl_input_string_resource$.bind( $cfasl_input_guid_string_resource$.getDynamicValue( thread ), thread );
      string = cfasl_input( stream, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      $cfasl_input_string_resource$.rebind( _prev_bind_0, thread );
    }
    return string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 52400L)
  public static SubLObject get_new_cfasl_input_guid_string_resource()
  {
    return Strings.make_string( $int171$36, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 52682L)
  public static SubLObject with_new_cfasl_input_guid_string_resource(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym23$CLET, $list172, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 53115L)
  public static SubLObject cfasl_input_result_set(final SubLObject stream)
  {
    final SubLObject total_row_count = cfasl_input_object( stream );
    final SubLObject slice_row_count = cfasl_input_object( stream );
    final SubLObject column_count = cfasl_input_object( stream );
    final SubLObject first = cfasl_input_object( stream );
    final SubLObject rows = Vectors.make_vector( slice_row_count, UNPROVIDED );
    SubLObject r;
    SubLObject row;
    SubLObject c;
    for( r = NIL, r = ZERO_INTEGER; r.numL( slice_row_count ); r = Numbers.add( r, ONE_INTEGER ) )
    {
      row = Vectors.make_vector( column_count, UNPROVIDED );
      for( c = NIL, c = ZERO_INTEGER; c.numL( column_count ); c = Numbers.add( c, ONE_INTEGER ) )
      {
        Vectors.set_aref( row, c, cfasl_input_object( stream ) );
      }
      Vectors.set_aref( rows, r, row );
    }
    return sdbc.new_sql_result_set( first, rows, total_row_count );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 53780L)
  public static SubLObject cfasl_output_object_package_method(final SubLObject v_object, final SubLObject stream)
  {
    return cfasl_output_package( v_object, stream );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 53899L)
  public static SubLObject cfasl_output_package(final SubLObject v_package, final SubLObject stream)
  {
    cfasl_raw_write_byte( $cfasl_opcode_package$.getGlobalValue(), stream );
    cfasl_output_string( Packages.package_name( v_package ), stream );
    return v_package;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 54080L)
  public static SubLObject cfasl_input_package(final SubLObject stream)
  {
    final SubLObject name = cfasl_input_object( stream );
    return Packages.find_package( name );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 55341L)
  public static SubLObject cfasl_narrow_opcode_p(final SubLObject opcode)
  {
    return makeBoolean( NIL != subl_promotions.non_negative_integer_p( opcode ) && opcode.numL( $cfasl_max_opcode$.getGlobalValue() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 55678L)
  public static SubLObject cfasl_wide_opcode_input_method(final SubLObject cfasl_wide_opcode)
  {
    final SubLObject result = Hashtables.gethash( cfasl_wide_opcode, $cfasl_wide_opcode_input_method_table$.getGlobalValue(), $kw181$NOT_FOUND );
    if( $kw181$NOT_FOUND != result )
    {
      return result;
    }
    if( NIL != cfasl_narrow_opcode_p( cfasl_wide_opcode ) )
    {
      return cfasl_input_method( cfasl_wide_opcode );
    }
    return $sym85$CFASL_INPUT_ERROR;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 56088L)
  public static SubLObject cfasl_input_wide_opcode_encoded(final SubLObject stream)
  {
    final SubLObject code = cfasl_input( stream, UNPROVIDED, UNPROVIDED );
    final SubLObject method = cfasl_wide_opcode_input_method( code );
    return Functions.funcall( method, stream );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 56276L)
  public static SubLObject declare_wide_cfasl_opcode(final SubLObject macroform, final SubLObject environment)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject variable = NIL;
    SubLObject wide_opcode = NIL;
    SubLObject input_function = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list182 );
    variable = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list182 );
    wide_opcode = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list182 );
    input_function = current.first();
    current = current.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list182 );
      return NIL;
    }
    assert NIL != Types.symbolp( variable ) : variable;
    assert NIL != Types.integerp( wide_opcode ) : wide_opcode;
    assert NIL != Types.symbolp( input_function ) : input_function;
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !wide_opcode.numGE( $cfasl_min_wide_opcode$.getGlobalValue() ) )
    {
      Errors.error( $str183$_A_is_too_small_to_be_a_wide_opco, wide_opcode );
    }
    return ConsesLow.list( $sym26$PROGN, ConsesLow.list( $sym91$DEFCONSTANT_PRIVATE, variable, wide_opcode ), ConsesLow.list( $sym184$REGISTER_WIDE_CFASL_OPCODE_INPUT_FUNCTION, variable, ConsesLow.list( $sym93$QUOTE,
        input_function ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 56709L)
  public static SubLObject register_wide_cfasl_opcode_input_function(final SubLObject wide_opcode, final SubLObject function)
  {
    Hashtables.sethash( wide_opcode, $cfasl_wide_opcode_input_method_table$.getGlobalValue(), function );
    return function;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 56923L)
  public static SubLObject cfasl_output_wide_opcode(final SubLObject wide_opcode, final SubLObject stream)
  {
    cfasl_output_narrow_opcode( $cfasl_opcode_wide_cfasl_opcode$.getGlobalValue(), stream );
    cfasl_output( wide_opcode, stream );
    return wide_opcode;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 57269L)
  public static SubLObject cfasl_output_object_instance_method(final SubLObject v_object, final SubLObject stream)
  {
    cfasl_raw_write_byte( $cfasl_opcode_instance$.getGlobalValue(), stream );
    return methods.funcall_instance_method_with_1_args( v_object, $sym188$CFASL_OUTPUT, stream );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 57477L)
  public static SubLObject cfasl_input_instance(final SubLObject stream)
  {
    final SubLObject class_name = cfasl_input_object( stream );
    assert NIL != Types.symbolp( class_name ) : class_name;
    return methods.funcall_class_method_with_1_args( class_name, $sym190$CFASL_INPUT, stream );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 58230L)
  public static SubLObject declare_cfasl_guid_opcode(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject variable = NIL;
    SubLObject cfasl_guid_opcode = NIL;
    SubLObject input_function = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list195 );
    variable = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list195 );
    cfasl_guid_opcode = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list195 );
    input_function = current.first();
    current = current.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list195 );
      return NIL;
    }
    assert NIL != Types.symbolp( variable ) : variable;
    assert NIL != Guids.guid_p( cfasl_guid_opcode ) : cfasl_guid_opcode;
    assert NIL != Types.symbolp( input_function ) : input_function;
    return ConsesLow.list( $sym26$PROGN, ConsesLow.list( $sym197$DEFLEXICAL_PRIVATE, variable, cfasl_guid_opcode ), ConsesLow.list( $sym198$REGISTER_CFASL_GUID_DENOTED_TYPE_INPUT_FUNCTION, variable, ConsesLow.list(
        $sym93$QUOTE, input_function ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 58579L)
  public static SubLObject declare_cfasl_guid_string_opcode(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject variable = NIL;
    SubLObject cfasl_guid_string_opcode = NIL;
    SubLObject input_function = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list199 );
    variable = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list199 );
    cfasl_guid_string_opcode = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list199 );
    input_function = current.first();
    current = current.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list199 );
      return NIL;
    }
    assert NIL != Types.symbolp( variable ) : variable;
    assert NIL != Guids.guid_string_p( cfasl_guid_string_opcode ) : cfasl_guid_string_opcode;
    assert NIL != Types.symbolp( input_function ) : input_function;
    return ConsesLow.list( $sym26$PROGN, ConsesLow.list( $sym197$DEFLEXICAL_PRIVATE, variable, ConsesLow.list( $sym201$STRING_TO_GUID, cfasl_guid_string_opcode ) ), ConsesLow.list(
        $sym198$REGISTER_CFASL_GUID_DENOTED_TYPE_INPUT_FUNCTION, variable, ConsesLow.list( $sym93$QUOTE, input_function ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 58994L)
  public static SubLObject register_cfasl_guid_denoted_type_input_function(final SubLObject cfasl_guid_opcode, final SubLObject function)
  {
    Hashtables.sethash( cfasl_guid_opcode, $cfasl_guid_denoted_type_input_method_table$.getGlobalValue(), function );
    return function;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 59232L)
  public static SubLObject write_cfasl_guid_denoted_type_opcode(final SubLObject stream, final SubLObject guid)
  {
    cfasl_raw_write_byte( $cfasl_opcode_guid_denoted_type$.getGlobalValue(), stream );
    return cfasl_output( guid, stream );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 59404L)
  public static SubLObject cfasl_guid_denoted_type_input_method(final SubLObject guid_for_type)
  {
    return Hashtables.gethash( guid_for_type, $cfasl_guid_denoted_type_input_method_table$.getGlobalValue(), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 59552L)
  public static SubLObject cfasl_input_guid_denoted_type(final SubLObject stream)
  {
    final SubLObject guid_for_type = cfasl_input( stream, UNPROVIDED, UNPROVIDED );
    final SubLObject result = Functions.funcall( cfasl_guid_denoted_type_input_method( guid_for_type ), stream );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 59762L)
  public static SubLObject with_guid_denoted_type_cfasl_encoding(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list203 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject type_denoting_guid = NIL;
    SubLObject stream = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list203 );
    type_denoting_guid = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list203 );
    stream = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym26$PROGN, ConsesLow.list( $sym204$WRITE_CFASL_GUID_DENOTED_TYPE_OPCODE, stream, type_denoting_guid ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list203 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 60019L)
  public static SubLObject cfasl_test(final SubLObject v_object)
  {
    final SubLObject v_answer = cfasl_decode( cfasl_encode( v_object ) );
    return Values.values( v_answer, Equality.equalp( v_answer, v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 60309L)
  public static SubLObject cfasl_test_externalized(final SubLObject v_object)
  {
    final SubLObject v_answer = cfasl_decode( cfasl_encode_externalized( v_object ) );
    return Values.values( v_answer, Equality.equalp( v_answer, v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 60479L)
  public static SubLObject show_cfasl_file(final SubLObject filename, SubLObject stream)
  {
    if( stream == UNPROVIDED )
    {
      stream = StreamsLow.$standard_output$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject stream_$2 = NIL;
    try
    {
      final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
      try
      {
        stream_macros.$stream_requires_locking$.bind( NIL, thread );
        stream_$2 = compatibility.open_binary( filename, $kw205$INPUT );
      }
      finally
      {
        stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
      }
      if( !stream_$2.isStream() )
      {
        Errors.error( $str206$Unable_to_open__S, filename );
      }
      SubLObject input_stream;
      SubLObject thing;
      for( input_stream = stream_$2, thing = NIL, thing = cfasl_input( input_stream, NIL, $kw61$EOF ); thing != $kw61$EOF; thing = cfasl_input( input_stream, NIL, $kw61$EOF ) )
      {
        print_high.print( thing, stream );
      }
    }
    finally
    {
      final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values = Values.getValuesAsVector();
        if( stream_$2.isStream() )
        {
          streams_high.close( stream_$2, UNPROVIDED );
        }
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
      }
    }
    return NIL;
  }

  public static SubLObject declare_cfasl_file()
  {
    SubLFiles.declareFunction( me, "cfasl_encoding_p", "CFASL-ENCODING-P", 1, 0, false );
    SubLFiles.declareFunction( me, "cfasl_encodable_stream_p", "CFASL-ENCODABLE-STREAM-P", 1, 0, false );
    SubLFiles.declareFunction( me, "cfasl_encoding_stream_print_function_trampoline", "CFASL-ENCODING-STREAM-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_encoding_stream_p", "CFASL-ENCODING-STREAM-P", 1, 0, false );
    new $cfasl_encoding_stream_p$UnaryFunction();
    SubLFiles.declareFunction( me, "cfasl_encoding_stream_internal_stream", "CFASL-ENCODING-STREAM-INTERNAL-STREAM", 1, 0, false );
    SubLFiles.declareFunction( me, "cfasl_encoding_stream_count", "CFASL-ENCODING-STREAM-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_cfasl_encoding_stream_internal_stream", "_CSETF-CFASL-ENCODING-STREAM-INTERNAL-STREAM", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_cfasl_encoding_stream_count", "_CSETF-CFASL-ENCODING-STREAM-COUNT", 2, 0, false );
    SubLFiles.declareFunction( me, "make_cfasl_encoding_stream", "MAKE-CFASL-ENCODING-STREAM", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_cfasl_encoding_stream", "VISIT-DEFSTRUCT-CFASL-ENCODING-STREAM", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_cfasl_encoding_stream_method", "VISIT-DEFSTRUCT-OBJECT-CFASL-ENCODING-STREAM-METHOD", 2, 0, false );
    SubLFiles.declareMacro( me, "with_cfasl_output_to_hex_string", "WITH-CFASL-OUTPUT-TO-HEX-STRING" );
    SubLFiles.declareFunction( me, "cfasl_encoding_string_stream_encoding", "CFASL-ENCODING-STRING-STREAM-ENCODING", 1, 0, false );
    SubLFiles.declareMacro( me, "with_cfasl_output_to_byte_vector", "WITH-CFASL-OUTPUT-TO-BYTE-VECTOR" );
    SubLFiles.declareFunction( me, "new_cfasl_encoding_stream", "NEW-CFASL-ENCODING-STREAM", 0, 0, false );
    SubLFiles.declareFunction( me, "cfasl_encoding_stream_write_byte", "CFASL-ENCODING-STREAM-WRITE-BYTE", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_encoding_stream_encoding", "CFASL-ENCODING-STREAM-ENCODING", 1, 0, false );
    SubLFiles.declareFunction( me, "close_cfasl_encoding_stream", "CLOSE-CFASL-ENCODING-STREAM", 1, 0, false );
    SubLFiles.declareFunction( me, "cfasl_encoding_stream_hexchar_position", "CFASL-ENCODING-STREAM-HEXCHAR-POSITION", 1, 0, false );
    SubLFiles.declareFunction( me, "cfasl_encoding_stream_byte_position", "CFASL-ENCODING-STREAM-BYTE-POSITION", 1, 0, false );
    SubLFiles.declareFunction( me, "cfasl_encode", "CFASL-ENCODE", 1, 0, false );
    SubLFiles.declareFunction( me, "cfasl_encode_externalized", "CFASL-ENCODE-EXTERNALIZED", 1, 0, false );
    SubLFiles.declareFunction( me, "cfasl_encode_externalized_terse", "CFASL-ENCODE-EXTERNALIZED-TERSE", 1, 0, false );
    SubLFiles.declareFunction( me, "cfasl_decodable_stream_p", "CFASL-DECODABLE-STREAM-P", 1, 0, false );
    SubLFiles.declareFunction( me, "cfasl_decoding_stream_print_function_trampoline", "CFASL-DECODING-STREAM-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_decoding_stream_p", "CFASL-DECODING-STREAM-P", 1, 0, false );
    new $cfasl_decoding_stream_p$UnaryFunction();
    SubLFiles.declareFunction( me, "cfasl_decoding_stream_internal_stream", "CFASL-DECODING-STREAM-INTERNAL-STREAM", 1, 0, false );
    SubLFiles.declareFunction( me, "cfasl_decoding_stream_position", "CFASL-DECODING-STREAM-POSITION", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_cfasl_decoding_stream_internal_stream", "_CSETF-CFASL-DECODING-STREAM-INTERNAL-STREAM", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_cfasl_decoding_stream_position", "_CSETF-CFASL-DECODING-STREAM-POSITION", 2, 0, false );
    SubLFiles.declareFunction( me, "make_cfasl_decoding_stream", "MAKE-CFASL-DECODING-STREAM", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_cfasl_decoding_stream", "VISIT-DEFSTRUCT-CFASL-DECODING-STREAM", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_cfasl_decoding_stream_method", "VISIT-DEFSTRUCT-OBJECT-CFASL-DECODING-STREAM-METHOD", 2, 0, false );
    SubLFiles.declareMacro( me, "with_cfasl_input_from_string", "WITH-CFASL-INPUT-FROM-STRING" );
    SubLFiles.declareFunction( me, "new_cfasl_decoding_stream_from_string", "NEW-CFASL-DECODING-STREAM-FROM-STRING", 1, 0, false );
    SubLFiles.declareMacro( me, "with_cfasl_input_from_byte_vector", "WITH-CFASL-INPUT-FROM-BYTE-VECTOR" );
    SubLFiles.declareFunction( me, "new_cfasl_decoding_stream", "NEW-CFASL-DECODING-STREAM", 1, 0, false );
    SubLFiles.declareFunction( me, "cfasl_decoding_stream_read_byte", "CFASL-DECODING-STREAM-READ-BYTE", 1, 2, false );
    SubLFiles.declareFunction( me, "close_cfasl_decoding_stream", "CLOSE-CFASL-DECODING-STREAM", 1, 0, false );
    SubLFiles.declareFunction( me, "cfasl_decoding_stream_nybble_position", "CFASL-DECODING-STREAM-NYBBLE-POSITION", 1, 0, false );
    SubLFiles.declareFunction( me, "cfasl_decode", "CFASL-DECODE", 1, 0, false );
    SubLFiles.declareFunction( me, "cfasl_decoding_stream_byte_position", "CFASL-DECODING-STREAM-BYTE-POSITION", 1, 0, false );
    SubLFiles.declareFunction( me, "cfasl_decoding_stream_hexchar_position", "CFASL-DECODING-STREAM-HEXCHAR-POSITION", 1, 0, false );
    SubLFiles.declareFunction( me, "cfasl_count_stream_print_function_trampoline", "CFASL-COUNT-STREAM-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_count_stream_p", "CFASL-COUNT-STREAM-P", 1, 0, false );
    new $cfasl_count_stream_p$UnaryFunction();
    SubLFiles.declareFunction( me, "cfasl_count_stream_position", "CFASL-COUNT-STREAM-POSITION", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_cfasl_count_stream_position", "_CSETF-CFASL-COUNT-STREAM-POSITION", 2, 0, false );
    SubLFiles.declareFunction( me, "make_cfasl_count_stream", "MAKE-CFASL-COUNT-STREAM", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_cfasl_count_stream", "VISIT-DEFSTRUCT-CFASL-COUNT-STREAM", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_cfasl_count_stream_method", "VISIT-DEFSTRUCT-OBJECT-CFASL-COUNT-STREAM-METHOD", 2, 0, false );
    SubLFiles.declareMacro( me, "with_cfasl_output_to_count_stream", "WITH-CFASL-OUTPUT-TO-COUNT-STREAM" );
    SubLFiles.declareFunction( me, "new_cfasl_count_stream", "NEW-CFASL-COUNT-STREAM", 0, 0, false );
    SubLFiles.declareFunction( me, "cfasl_count_stream_write_byte", "CFASL-COUNT-STREAM-WRITE-BYTE", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_count_stream_increment", "CFASL-COUNT-STREAM-INCREMENT", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_count_stream_size", "CFASL-COUNT-STREAM-SIZE", 1, 0, false );
    SubLFiles.declareFunction( me, "close_cfasl_count_stream", "CLOSE-CFASL-COUNT-STREAM", 1, 0, false );
    SubLFiles.declareFunction( me, "cfasl_object_size", "CFASL-OBJECT-SIZE", 1, 0, false );
    SubLFiles.declareFunction( me, "cfasl_externalized_object_size", "CFASL-EXTERNALIZED-OBJECT-SIZE", 1, 0, false );
    SubLFiles.declareMacro( me, "with_cfasl_stream_extensions", "WITH-CFASL-STREAM-EXTENSIONS" );
    SubLFiles.declareFunction( me, "cfasl_output", "CFASL-OUTPUT", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_output_externalized", "CFASL-OUTPUT-EXTERNALIZED", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_output_maybe_externalized", "CFASL-OUTPUT-MAYBE-EXTERNALIZED", 3, 0, false );
    SubLFiles.declareFunction( me, "cfasl_output_object", "CFASL-OUTPUT-OBJECT", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_output_error", "CFASL-OUTPUT-ERROR", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_raw_write_byte", "CFASL-RAW-WRITE-BYTE", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_input", "CFASL-INPUT", 1, 2, false );
    SubLFiles.declareFunction( me, "cfasl_opcode_peek", "CFASL-OPCODE-PEEK", 1, 2, false );
    SubLFiles.declareFunction( me, "cfasl_input_object", "CFASL-INPUT-OBJECT", 1, 0, false );
    SubLFiles.declareFunction( me, "cfasl_input_error", "CFASL-INPUT-ERROR", 1, 0, false );
    SubLFiles.declareFunction( me, "cfasl_input_internal", "CFASL-INPUT-INTERNAL", 3, 0, false );
    SubLFiles.declareFunction( me, "cfasl_opcode_peek_internal", "CFASL-OPCODE-PEEK-INTERNAL", 3, 0, false );
    SubLFiles.declareFunction( me, "cfasl_input_method", "CFASL-INPUT-METHOD", 1, 0, false );
    SubLFiles.declareMacro( me, "declare_cfasl_opcode", "DECLARE-CFASL-OPCODE" );
    SubLFiles.declareFunction( me, "register_cfasl_input_function", "REGISTER-CFASL-INPUT-FUNCTION", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_raw_peek_byte", "CFASL-RAW-PEEK-BYTE", 1, 0, false );
    SubLFiles.declareFunction( me, "cfasl_raw_read_byte", "CFASL-RAW-READ-BYTE", 1, 0, false );
    SubLFiles.declareMacro( me, "with_cfasl_area_allocation", "WITH-CFASL-AREA-ALLOCATION" );
    SubLFiles.declareMacro( me, "within_cfasl_externalization", "WITHIN-CFASL-EXTERNALIZATION" );
    SubLFiles.declareMacro( me, "without_cfasl_externalization", "WITHOUT-CFASL-EXTERNALIZATION" );
    SubLFiles.declareFunction( me, "within_cfasl_externalization_p", "WITHIN-CFASL-EXTERNALIZATION-P", 0, 0, false );
    SubLFiles.declareMacro( me, "without_cfasl_channel_externalization", "WITHOUT-CFASL-CHANNEL-EXTERNALIZATION" );
    SubLFiles.declareFunction( me, "cfasl_channel_externalizedP", "CFASL-CHANNEL-EXTERNALIZED?", 0, 0, false );
    SubLFiles.declareMacro( me, "declare_cfasl_extension_opcode", "DECLARE-CFASL-EXTENSION-OPCODE" );
    SubLFiles.declareFunction( me, "register_cfasl_extension", "REGISTER-CFASL-EXTENSION", 4, 0, false );
    SubLFiles.declareFunction( me, "handle_cfasl_extensions", "HANDLE-CFASL-EXTENSIONS", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_output_narrow_opcode", "CFASL-OUTPUT-NARROW-OPCODE", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_output_opcode", "CFASL-OUTPUT-OPCODE", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_output_externalization", "CFASL-OUTPUT-EXTERNALIZATION", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_input_externalization", "CFASL-INPUT-EXTERNALIZATION", 1, 0, false );
    SubLFiles.declareFunction( me, "cfasl_output_defstruct_recipe", "CFASL-OUTPUT-DEFSTRUCT-RECIPE", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_output_defstruct_recipe_visitorfn", "CFASL-OUTPUT-DEFSTRUCT-RECIPE-VISITORFN", 4, 0, false );
    SubLFiles.declareFunction( me, "cfasl_input_defstruct_recipe", "CFASL-INPUT-DEFSTRUCT-RECIPE", 1, 0, false );
    SubLFiles.declareFunction( me, "cfasl_immediate_fixnump", "CFASL-IMMEDIATE-FIXNUMP", 1, 0, false );
    SubLFiles.declareFunction( me, "cfasl_output_immediate_fixnum", "CFASL-OUTPUT-IMMEDIATE-FIXNUM", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_immediate_fixnum_opcode", "CFASL-IMMEDIATE-FIXNUM-OPCODE", 1, 0, false );
    SubLFiles.declareFunction( me, "cfasl_extract_immediate_fixnum", "CFASL-EXTRACT-IMMEDIATE-FIXNUM", 1, 0, false );
    SubLFiles.declareFunction( me, "cfasl_output_object_integer_method", "CFASL-OUTPUT-OBJECT-INTEGER-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_output_integer", "CFASL-OUTPUT-INTEGER", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_output_integer_internal", "CFASL-OUTPUT-INTEGER-INTERNAL", 3, 0, false );
    SubLFiles.declareFunction( me, "cfasl_input_p_8bit_int", "CFASL-INPUT-P-8BIT-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "cfasl_input_n_8bit_int", "CFASL-INPUT-N-8BIT-INT", 1, 0, false );
    new $cfasl_input_n_8bit_int$UnaryFunction();
    SubLFiles.declareFunction( me, "cfasl_input_p_16bit_int", "CFASL-INPUT-P-16BIT-INT", 1, 0, false );
    new $cfasl_input_p_16bit_int$UnaryFunction();
    SubLFiles.declareFunction( me, "cfasl_input_n_16bit_int", "CFASL-INPUT-N-16BIT-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "cfasl_input_p_24bit_int", "CFASL-INPUT-P-24BIT-INT", 1, 0, false );
    new $cfasl_input_p_24bit_int$UnaryFunction();
    SubLFiles.declareFunction( me, "cfasl_input_n_24bit_int", "CFASL-INPUT-N-24BIT-INT", 1, 0, false );
    new $cfasl_input_n_24bit_int$UnaryFunction();
    SubLFiles.declareFunction( me, "cfasl_input_p_32bit_int", "CFASL-INPUT-P-32BIT-INT", 1, 0, false );
    new $cfasl_input_p_32bit_int$UnaryFunction();
    SubLFiles.declareFunction( me, "cfasl_input_n_32bit_int", "CFASL-INPUT-N-32BIT-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "assemble_2_fixnums_to_non_negative_integer", "ASSEMBLE-2-FIXNUMS-TO-NON-NEGATIVE-INTEGER", 2, 0, false );
    SubLFiles.declareFunction( me, "assemble_3_fixnums_to_non_negative_integer", "ASSEMBLE-3-FIXNUMS-TO-NON-NEGATIVE-INTEGER", 3, 0, false );
    SubLFiles.declareFunction( me, "assemble_4_fixnums_to_non_negative_integer", "ASSEMBLE-4-FIXNUMS-TO-NON-NEGATIVE-INTEGER", 4, 0, false );
    SubLFiles.declareFunction( me, "cfasl_input_integer", "CFASL-INPUT-INTEGER", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_input_p_bignum", "CFASL-INPUT-P-BIGNUM", 1, 0, false );
    new $cfasl_input_p_bignum$UnaryFunction();
    SubLFiles.declareFunction( me, "cfasl_input_n_bignum", "CFASL-INPUT-N-BIGNUM", 1, 0, false );
    SubLFiles.declareFunction( me, "cfasl_input_bignum", "CFASL-INPUT-BIGNUM", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_output_object_float_method", "CFASL-OUTPUT-OBJECT-FLOAT-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_output_float", "CFASL-OUTPUT-FLOAT", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_input_p_float", "CFASL-INPUT-P-FLOAT", 1, 0, false );
    new $cfasl_input_p_float$UnaryFunction();
    SubLFiles.declareFunction( me, "cfasl_input_n_float", "CFASL-INPUT-N-FLOAT", 1, 0, false );
    new $cfasl_input_n_float$UnaryFunction();
    SubLFiles.declareFunction( me, "cfasl_input_float", "CFASL-INPUT-FLOAT", 1, 0, false );
    SubLFiles.declareFunction( me, "cfasl_output_object_symbol_method", "CFASL-OUTPUT-OBJECT-SYMBOL-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_output_keyword", "CFASL-OUTPUT-KEYWORD", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_input_keyword", "CFASL-INPUT-KEYWORD", 1, 0, false );
    new $cfasl_input_keyword$UnaryFunction();
    SubLFiles.declareFunction( me, "cfasl_output_other_symbol", "CFASL-OUTPUT-OTHER-SYMBOL", 2, 0, false );
    SubLFiles.declareFunction( me, "cyc_package_symbol_p", "CYC-PACKAGE-SYMBOL-P", 1, 0, false );
    SubLFiles.declareFunction( me, "cfasl_input_other_symbol", "CFASL-INPUT-OTHER-SYMBOL", 1, 0, false );
    new $cfasl_input_other_symbol$UnaryFunction();
    SubLFiles.declareFunction( me, "cfasl_output_nil", "CFASL-OUTPUT-NIL", 1, 0, false );
    SubLFiles.declareFunction( me, "cfasl_input_nil", "CFASL-INPUT-NIL", 1, 0, false );
    new $cfasl_input_nil$UnaryFunction();
    SubLFiles.declareFunction( me, "cfasl_set_common_symbols", "CFASL-SET-COMMON-SYMBOLS", 1, 0, false );
    SubLFiles.declareMacro( me, "with_cfasl_common_symbols", "WITH-CFASL-COMMON-SYMBOLS" );
    SubLFiles.declareFunction( me, "cfasl_set_common_symbols_simple", "CFASL-SET-COMMON-SYMBOLS-SIMPLE", 1, 0, false );
    SubLFiles.declareMacro( me, "with_cfasl_common_symbols_simple", "WITH-CFASL-COMMON-SYMBOLS-SIMPLE" );
    SubLFiles.declareFunction( me, "cfasl_current_common_symbols", "CFASL-CURRENT-COMMON-SYMBOLS", 0, 0, false );
    SubLFiles.declareFunction( me, "cfasl_common_symbol_p", "CFASL-COMMON-SYMBOL-P", 1, 0, false );
    SubLFiles.declareFunction( me, "cfasl_encode_common_symbol", "CFASL-ENCODE-COMMON-SYMBOL", 1, 0, false );
    SubLFiles.declareFunction( me, "cfasl_decode_common_symbol", "CFASL-DECODE-COMMON-SYMBOL", 1, 0, false );
    SubLFiles.declareFunction( me, "cfasl_output_common_symbol", "CFASL-OUTPUT-COMMON-SYMBOL", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_input_common_symbol", "CFASL-INPUT-COMMON-SYMBOL", 1, 0, false );
    new $cfasl_input_common_symbol$UnaryFunction();
    SubLFiles.declareFunction( me, "cfasl_output_object_cons_method", "CFASL-OUTPUT-OBJECT-CONS-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "register_cfasl_list_method", "REGISTER-CFASL-LIST-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "handle_cfasl_list_methods", "HANDLE-CFASL-LIST-METHODS", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_output_list", "CFASL-OUTPUT-LIST", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_input_list", "CFASL-INPUT-LIST", 1, 0, false );
    new $cfasl_input_list$UnaryFunction();
    SubLFiles.declareFunction( me, "cfasl_output_dotted_list", "CFASL-OUTPUT-DOTTED-LIST", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_input_dotted_list", "CFASL-INPUT-DOTTED-LIST", 1, 0, false );
    new $cfasl_input_dotted_list$UnaryFunction();
    SubLFiles.declareFunction( me, "cfasl_output_object_vector_method", "CFASL-OUTPUT-OBJECT-VECTOR-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_output_general_vector", "CFASL-OUTPUT-GENERAL-VECTOR", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_input_general_vector", "CFASL-INPUT-GENERAL-VECTOR", 1, 0, false );
    new $cfasl_input_general_vector$UnaryFunction();
    SubLFiles.declareFunction( me, "cfasl_output_byte_vector", "CFASL-OUTPUT-BYTE-VECTOR", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_input_byte_vector", "CFASL-INPUT-BYTE-VECTOR", 1, 0, false );
    SubLFiles.declareFunction( me, "cfasl_output_object_string_method", "CFASL-OUTPUT-OBJECT-STRING-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_output_string", "CFASL-OUTPUT-STRING", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_input_string", "CFASL-INPUT-STRING", 1, 0, false );
    new $cfasl_input_string$UnaryFunction();
    SubLFiles.declareFunction( me, "cfasl_output_object_character_method", "CFASL-OUTPUT-OBJECT-CHARACTER-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_output_character", "CFASL-OUTPUT-CHARACTER", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_input_character", "CFASL-INPUT-CHARACTER", 1, 0, false );
    new $cfasl_input_character$UnaryFunction();
    SubLFiles.declareFunction( me, "cfasl_output_object_hash_table_method", "CFASL-OUTPUT-OBJECT-HASH-TABLE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_output_hashtable", "CFASL-OUTPUT-HASHTABLE", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_input_hashtable", "CFASL-INPUT-HASHTABLE", 1, 0, false );
    SubLFiles.declareFunction( me, "cfasl_output_object_guid_method", "CFASL-OUTPUT-OBJECT-GUID-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_output_guid", "CFASL-OUTPUT-GUID", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_input_guid", "CFASL-INPUT-GUID", 1, 0, false );
    new $cfasl_input_guid$UnaryFunction();
    SubLFiles.declareFunction( me, "cfasl_input_guid_byte_vector", "CFASL-INPUT-GUID-BYTE-VECTOR", 1, 0, false );
    SubLFiles.declareFunction( me, "cfasl_output_legacy_guid", "CFASL-OUTPUT-LEGACY-GUID", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_input_legacy_guid", "CFASL-INPUT-LEGACY-GUID", 1, 0, false );
    SubLFiles.declareFunction( me, "cfasl_input_guid_string", "CFASL-INPUT-GUID-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "get_new_cfasl_input_guid_string_resource", "GET-NEW-CFASL-INPUT-GUID-STRING-RESOURCE", 0, 0, false );
    SubLFiles.declareMacro( me, "with_new_cfasl_input_guid_string_resource", "WITH-NEW-CFASL-INPUT-GUID-STRING-RESOURCE" );
    SubLFiles.declareFunction( me, "cfasl_input_result_set", "CFASL-INPUT-RESULT-SET", 1, 0, false );
    SubLFiles.declareFunction( me, "cfasl_output_object_package_method", "CFASL-OUTPUT-OBJECT-PACKAGE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_output_package", "CFASL-OUTPUT-PACKAGE", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_input_package", "CFASL-INPUT-PACKAGE", 1, 0, false );
    SubLFiles.declareFunction( me, "cfasl_narrow_opcode_p", "CFASL-NARROW-OPCODE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "cfasl_wide_opcode_input_method", "CFASL-WIDE-OPCODE-INPUT-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "cfasl_input_wide_opcode_encoded", "CFASL-INPUT-WIDE-OPCODE-ENCODED", 1, 0, false );
    SubLFiles.declareMacro( me, "declare_wide_cfasl_opcode", "DECLARE-WIDE-CFASL-OPCODE" );
    SubLFiles.declareFunction( me, "register_wide_cfasl_opcode_input_function", "REGISTER-WIDE-CFASL-OPCODE-INPUT-FUNCTION", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_output_wide_opcode", "CFASL-OUTPUT-WIDE-OPCODE", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_output_object_instance_method", "CFASL-OUTPUT-OBJECT-INSTANCE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_input_instance", "CFASL-INPUT-INSTANCE", 1, 0, false );
    SubLFiles.declareMacro( me, "declare_cfasl_guid_opcode", "DECLARE-CFASL-GUID-OPCODE" );
    SubLFiles.declareMacro( me, "declare_cfasl_guid_string_opcode", "DECLARE-CFASL-GUID-STRING-OPCODE" );
    SubLFiles.declareFunction( me, "register_cfasl_guid_denoted_type_input_function", "REGISTER-CFASL-GUID-DENOTED-TYPE-INPUT-FUNCTION", 2, 0, false );
    SubLFiles.declareFunction( me, "write_cfasl_guid_denoted_type_opcode", "WRITE-CFASL-GUID-DENOTED-TYPE-OPCODE", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_guid_denoted_type_input_method", "CFASL-GUID-DENOTED-TYPE-INPUT-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "cfasl_input_guid_denoted_type", "CFASL-INPUT-GUID-DENOTED-TYPE", 1, 0, false );
    SubLFiles.declareMacro( me, "with_guid_denoted_type_cfasl_encoding", "WITH-GUID-DENOTED-TYPE-CFASL-ENCODING" );
    SubLFiles.declareFunction( me, "cfasl_test", "CFASL-TEST", 1, 0, false );
    SubLFiles.declareFunction( me, "cfasl_test_externalized", "CFASL-TEST-EXTERNALIZED", 1, 0, false );
    SubLFiles.declareFunction( me, "show_cfasl_file", "SHOW-CFASL-FILE", 1, 1, false );
    return NIL;
  }

  public static SubLObject init_cfasl_file()
  {
    $dtp_cfasl_encoding_stream$ = SubLFiles.defconstant( "*DTP-CFASL-ENCODING-STREAM*", $sym0$CFASL_ENCODING_STREAM );
    $terse_guid_serialization_enabledP$ = SubLFiles.defparameter( "*TERSE-GUID-SERIALIZATION-ENABLED?*", NIL );
    $terse_guid_serialization_enabled_for_cfasl_encode_externalizedP$ = SubLFiles.defparameter( "*TERSE-GUID-SERIALIZATION-ENABLED-FOR-CFASL-ENCODE-EXTERNALIZED?*", $kw38$UNINITIALIZED );
    $dtp_cfasl_decoding_stream$ = SubLFiles.defconstant( "*DTP-CFASL-DECODING-STREAM*", $sym39$CFASL_DECODING_STREAM );
    $dtp_cfasl_count_stream$ = SubLFiles.defconstant( "*DTP-CFASL-COUNT-STREAM*", $sym62$CFASL_COUNT_STREAM );
    $cfasl_stream_extensions_enabled$ = SubLFiles.defparameter( "*CFASL-STREAM-EXTENSIONS-ENABLED*", NIL );
    $cfasl_unread_byte$ = SubLFiles.defparameter( "*CFASL-UNREAD-BYTE*", NIL );
    $cfasl_output_object_method_table$ = SubLFiles.deflexical( "*CFASL-OUTPUT-OBJECT-METHOD-TABLE*", Vectors.make_vector( $int79$256, NIL ) );
    $cfasl_input_to_static_area$ = SubLFiles.defparameter( "*CFASL-INPUT-TO-STATIC-AREA*", NIL );
    $cfasl_max_opcode$ = SubLFiles.defconstant( "*CFASL-MAX-OPCODE*", $int87$128 );
    $cfasl_input_method_table$ = SubLFiles.deflexical( "*CFASL-INPUT-METHOD-TABLE*", maybeDefault( $sym88$_CFASL_INPUT_METHOD_TABLE_, $cfasl_input_method_table$, () -> ( Vectors.make_vector( $cfasl_max_opcode$
        .getGlobalValue(), $sym85$CFASL_INPUT_ERROR ) ) ) );
    $within_cfasl_externalization$ = SubLFiles.defparameter( "*WITHIN-CFASL-EXTERNALIZATION*", NIL );
    $cfasl_channel_externalizedP$ = SubLFiles.defparameter( "*CFASL-CHANNEL-EXTERNALIZED?*", T );
    $cfasl_extensions$ = SubLFiles.deflexical( "*CFASL-EXTENSIONS*", ( maybeDefault( $sym102$_CFASL_EXTENSIONS_, $cfasl_extensions$, NIL ) ) );
    $cfasl_opcode_externalization$ = SubLFiles.defconstant( "*CFASL-OPCODE-EXTERNALIZATION*", $int106$51 );
    $current_cfasl_defstruct_output_stream$ = SubLFiles.defparameter( "*CURRENT-CFASL-DEFSTRUCT-OUTPUT-STREAM*", NIL );
    $cfasl_opcode_defstruct_recipe$ = SubLFiles.defconstant( "*CFASL-OPCODE-DEFSTRUCT-RECIPE*", $int108$44 );
    $cfasl_immediate_fixnum_cutoff$ = SubLFiles.defconstant( "*CFASL-IMMEDIATE-FIXNUM-CUTOFF*", $cfasl_max_opcode$.getGlobalValue() );
    $cfasl_immediate_fixnum_offset$ = SubLFiles.defconstant( "*CFASL-IMMEDIATE-FIXNUM-OFFSET*", Numbers.subtract( $int79$256, $cfasl_immediate_fixnum_cutoff$.getGlobalValue() ) );
    $cfasl_opcode_p_8bit_int$ = SubLFiles.defconstant( "*CFASL-OPCODE-P-8BIT-INT*", ZERO_INTEGER );
    $cfasl_opcode_n_8bit_int$ = SubLFiles.defconstant( "*CFASL-OPCODE-N-8BIT-INT*", ONE_INTEGER );
    $cfasl_opcode_p_16bit_int$ = SubLFiles.defconstant( "*CFASL-OPCODE-P-16BIT-INT*", TWO_INTEGER );
    $cfasl_opcode_n_16bit_int$ = SubLFiles.defconstant( "*CFASL-OPCODE-N-16BIT-INT*", THREE_INTEGER );
    $cfasl_opcode_p_24bit_int$ = SubLFiles.defconstant( "*CFASL-OPCODE-P-24BIT-INT*", FOUR_INTEGER );
    $cfasl_opcode_n_24bit_int$ = SubLFiles.defconstant( "*CFASL-OPCODE-N-24BIT-INT*", FIVE_INTEGER );
    $cfasl_opcode_p_32bit_int$ = SubLFiles.defconstant( "*CFASL-OPCODE-P-32BIT-INT*", SIX_INTEGER );
    $cfasl_opcode_n_32bit_int$ = SubLFiles.defconstant( "*CFASL-OPCODE-N-32BIT-INT*", SEVEN_INTEGER );
    $cfasl_opcode_p_bignum$ = SubLFiles.defconstant( "*CFASL-OPCODE-P-BIGNUM*", $int121$23 );
    $cfasl_opcode_n_bignum$ = SubLFiles.defconstant( "*CFASL-OPCODE-N-BIGNUM*", $int123$24 );
    $cfasl_opcode_p_float$ = SubLFiles.defconstant( "*CFASL-OPCODE-P-FLOAT*", EIGHT_INTEGER );
    $cfasl_opcode_n_float$ = SubLFiles.defconstant( "*CFASL-OPCODE-N-FLOAT*", NINE_INTEGER );
    $cfasl_opcode_keyword$ = SubLFiles.defconstant( "*CFASL-OPCODE-KEYWORD*", TEN_INTEGER );
    $cfasl_opcode_other_symbol$ = SubLFiles.defconstant( "*CFASL-OPCODE-OTHER-SYMBOL*", ELEVEN_INTEGER );
    $cfasl_opcode_nil$ = SubLFiles.defconstant( "*CFASL-OPCODE-NIL*", TWELVE_INTEGER );
    $cfasl_opcode_common_symbol$ = SubLFiles.defconstant( "*CFASL-OPCODE-COMMON-SYMBOL*", $int140$50 );
    $cfasl_common_symbols$ = SubLFiles.defparameter( "*CFASL-COMMON-SYMBOLS*", NIL );
    $cfasl_list_methods$ = SubLFiles.deflexical( "*CFASL-LIST-METHODS*", ( maybeDefault( $sym151$_CFASL_LIST_METHODS_, $cfasl_list_methods$, NIL ) ) );
    $cfasl_opcode_list$ = SubLFiles.defconstant( "*CFASL-OPCODE-LIST*", THIRTEEN_INTEGER );
    $cfasl_opcode_dotted_list$ = SubLFiles.defconstant( "*CFASL-OPCODE-DOTTED-LIST*", SEVENTEEN_INTEGER );
    $cfasl_opcode_general_vector$ = SubLFiles.defconstant( "*CFASL-OPCODE-GENERAL-VECTOR*", FOURTEEN_INTEGER );
    $cfasl_opcode_byte_vector$ = SubLFiles.defconstant( "*CFASL-OPCODE-BYTE-VECTOR*", $int158$26 );
    $cfasl_opcode_string$ = SubLFiles.defconstant( "*CFASL-OPCODE-STRING*", FIFTEEN_INTEGER );
    $cfasl_input_string_resource$ = SubLFiles.defparameter( "*CFASL-INPUT-STRING-RESOURCE*", NIL );
    $cfasl_opcode_character$ = SubLFiles.defconstant( "*CFASL-OPCODE-CHARACTER*", SIXTEEN_INTEGER );
    $cfasl_opcode_hashtable$ = SubLFiles.defconstant( "*CFASL-OPCODE-HASHTABLE*", EIGHTEEN_INTEGER );
    $cfasl_opcode_guid$ = SubLFiles.defconstant( "*CFASL-OPCODE-GUID*", $int166$43 );
    $cfasl_opcode_legacy_guid$ = SubLFiles.defconstant( "*CFASL-OPCODE-LEGACY-GUID*", $int169$25 );
    $cfasl_input_guid_string_resource$ = SubLFiles.defparameter( "*CFASL-INPUT-GUID-STRING-RESOURCE*", NIL );
    $cfasl_opcode_result_set$ = SubLFiles.defconstant( "*CFASL-OPCODE-RESULT-SET*", $int173$27 );
    $cfasl_opcode_package$ = SubLFiles.defconstant( "*CFASL-OPCODE-PACKAGE*", $int175$28 );
    $cfasl_opcode_wide_cfasl_opcode$ = SubLFiles.defconstant( "*CFASL-OPCODE-WIDE-CFASL-OPCODE*", $int178$29 );
    $cfasl_min_wide_opcode$ = SubLFiles.defconstant( "*CFASL-MIN-WIDE-OPCODE*", $cfasl_max_opcode$.getGlobalValue() );
    $cfasl_wide_opcode_input_method_table$ = SubLFiles.deflexical( "*CFASL-WIDE-OPCODE-INPUT-METHOD-TABLE*", maybeDefault( $sym180$_CFASL_WIDE_OPCODE_INPUT_METHOD_TABLE_, $cfasl_wide_opcode_input_method_table$,
        () -> ( Hashtables.make_hash_table( $int131$32, Symbols.symbol_function( EQL ), UNPROVIDED ) ) ) );
    $cfasl_opcode_instance$ = SubLFiles.defconstant( "*CFASL-OPCODE-INSTANCE*", $int186$124 );
    $cfasl_opcode_guid_denoted_type$ = SubLFiles.defconstant( "*CFASL-OPCODE-GUID-DENOTED-TYPE*", $int191$126 );
    $cfasl_guid_denoted_type_input_method_table$ = SubLFiles.deflexical( "*CFASL-GUID-DENOTED-TYPE-INPUT-METHOD-TABLE*", maybeDefault( $sym193$_CFASL_GUID_DENOTED_TYPE_INPUT_METHOD_TABLE_,
        $cfasl_guid_denoted_type_input_method_table$, () -> ( Hashtables.make_hash_table( $int194$100, Symbols.symbol_function( EQUALP ), UNPROVIDED ) ) ) );
    return NIL;
  }

  public static SubLObject setup_cfasl_file()
  {
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_cfasl_encoding_stream$.getGlobalValue(), Symbols.symbol_function( $sym7$CFASL_ENCODING_STREAM_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list8 );
    Structures.def_csetf( $sym9$CFASL_ENCODING_STREAM_INTERNAL_STREAM, $sym10$_CSETF_CFASL_ENCODING_STREAM_INTERNAL_STREAM );
    Structures.def_csetf( $sym11$CFASL_ENCODING_STREAM_COUNT, $sym12$_CSETF_CFASL_ENCODING_STREAM_COUNT );
    Equality.identity( $sym0$CFASL_ENCODING_STREAM );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_cfasl_encoding_stream$.getGlobalValue(), Symbols.symbol_function(
        $sym20$VISIT_DEFSTRUCT_OBJECT_CFASL_ENCODING_STREAM_METHOD ) );
    access_macros.register_macro_helper( $sym28$CFASL_ENCODING_STRING_STREAM_ENCODING, $sym30$WITH_CFASL_OUTPUT_TO_HEX_STRING );
    access_macros.register_macro_helper( $sym33$NEW_CFASL_ENCODING_STREAM, $sym34$WITH_CFASL_OUTPUT_TO_BYTE_VECTOR );
    access_macros.register_macro_helper( $sym35$CFASL_ENCODING_STREAM_WRITE_BYTE, $sym34$WITH_CFASL_OUTPUT_TO_BYTE_VECTOR );
    access_macros.register_macro_helper( $sym32$CFASL_ENCODING_STREAM_ENCODING, $sym34$WITH_CFASL_OUTPUT_TO_BYTE_VECTOR );
    access_macros.register_macro_helper( $sym29$CLOSE_CFASL_ENCODING_STREAM, $sym34$WITH_CFASL_OUTPUT_TO_BYTE_VECTOR );
    access_macros.register_macro_helper( $sym36$CFASL_ENCODING_STREAM_HEXCHAR_POSITION, $sym30$WITH_CFASL_OUTPUT_TO_HEX_STRING );
    access_macros.register_macro_helper( $sym37$CFASL_ENCODING_STREAM_BYTE_POSITION, $sym30$WITH_CFASL_OUTPUT_TO_HEX_STRING );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_cfasl_decoding_stream$.getGlobalValue(), Symbols.symbol_function( $sym45$CFASL_DECODING_STREAM_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list46 );
    Structures.def_csetf( $sym47$CFASL_DECODING_STREAM_INTERNAL_STREAM, $sym48$_CSETF_CFASL_DECODING_STREAM_INTERNAL_STREAM );
    Structures.def_csetf( $sym49$CFASL_DECODING_STREAM_POSITION, $sym50$_CSETF_CFASL_DECODING_STREAM_POSITION );
    Equality.identity( $sym39$CFASL_DECODING_STREAM );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_cfasl_decoding_stream$.getGlobalValue(), Symbols.symbol_function(
        $sym53$VISIT_DEFSTRUCT_OBJECT_CFASL_DECODING_STREAM_METHOD ) );
    access_macros.register_macro_helper( $sym54$NEW_CFASL_DECODING_STREAM_FROM_STRING, $sym56$WITH_CFASL_INPUT_FROM_STRING );
    access_macros.register_macro_helper( $sym57$NEW_CFASL_DECODING_STREAM, $sym58$WITH_CFASL_INPUT_FROM_BYTE_VECTOR );
    access_macros.register_macro_helper( $sym60$CFASL_DECODING_STREAM_READ_BYTE, $sym58$WITH_CFASL_INPUT_FROM_BYTE_VECTOR );
    access_macros.register_macro_helper( $sym55$CLOSE_CFASL_DECODING_STREAM, $sym58$WITH_CFASL_INPUT_FROM_BYTE_VECTOR );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_cfasl_count_stream$.getGlobalValue(), Symbols.symbol_function( $sym68$CFASL_COUNT_STREAM_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list69 );
    Structures.def_csetf( $sym70$CFASL_COUNT_STREAM_POSITION, $sym71$_CSETF_CFASL_COUNT_STREAM_POSITION );
    Equality.identity( $sym62$CFASL_COUNT_STREAM );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_cfasl_count_stream$.getGlobalValue(), Symbols.symbol_function(
        $sym73$VISIT_DEFSTRUCT_OBJECT_CFASL_COUNT_STREAM_METHOD ) );
    subl_macro_promotions.declare_defglobal( $sym88$_CFASL_INPUT_METHOD_TABLE_ );
    access_macros.register_macro_helper( $sym92$REGISTER_CFASL_INPUT_FUNCTION, $sym94$DECLARE_CFASL_OPCODE );
    subl_macro_promotions.declare_defglobal( $sym102$_CFASL_EXTENSIONS_ );
    access_macros.register_macro_helper( $sym104$REGISTER_CFASL_EXTENSION, $sym105$DECLARE_CFASL_EXTENSION_OPCODE );
    register_cfasl_input_function( $cfasl_opcode_externalization$.getGlobalValue(), $sym107$CFASL_INPUT_EXTERNALIZATION );
    register_cfasl_input_function( $cfasl_opcode_defstruct_recipe$.getGlobalValue(), $sym109$CFASL_INPUT_DEFSTRUCT_RECIPE );
    register_cfasl_input_function( $cfasl_opcode_p_8bit_int$.getGlobalValue(), $sym113$CFASL_INPUT_P_8BIT_INT );
    register_cfasl_input_function( $cfasl_opcode_n_8bit_int$.getGlobalValue(), $sym114$CFASL_INPUT_N_8BIT_INT );
    register_cfasl_input_function( $cfasl_opcode_p_16bit_int$.getGlobalValue(), $sym115$CFASL_INPUT_P_16BIT_INT );
    register_cfasl_input_function( $cfasl_opcode_n_16bit_int$.getGlobalValue(), $sym116$CFASL_INPUT_N_16BIT_INT );
    register_cfasl_input_function( $cfasl_opcode_p_24bit_int$.getGlobalValue(), $sym117$CFASL_INPUT_P_24BIT_INT );
    register_cfasl_input_function( $cfasl_opcode_n_24bit_int$.getGlobalValue(), $sym118$CFASL_INPUT_N_24BIT_INT );
    register_cfasl_input_function( $cfasl_opcode_p_32bit_int$.getGlobalValue(), $sym119$CFASL_INPUT_P_32BIT_INT );
    register_cfasl_input_function( $cfasl_opcode_n_32bit_int$.getGlobalValue(), $sym120$CFASL_INPUT_N_32BIT_INT );
    register_cfasl_input_function( $cfasl_opcode_p_bignum$.getGlobalValue(), $sym122$CFASL_INPUT_P_BIGNUM );
    register_cfasl_input_function( $cfasl_opcode_n_bignum$.getGlobalValue(), $sym124$CFASL_INPUT_N_BIGNUM );
    Structures.register_method( $cfasl_output_object_method_table$.getGlobalValue(), Types.$dtp_bignum$.getGlobalValue(), Symbols.symbol_function( $sym125$CFASL_OUTPUT_OBJECT_INTEGER_METHOD ) );
    Structures.register_method( $cfasl_output_object_method_table$.getGlobalValue(), Types.$dtp_fixnum$.getGlobalValue(), Symbols.symbol_function( $sym125$CFASL_OUTPUT_OBJECT_INTEGER_METHOD ) );
    SubLSpecialOperatorDeclarations.proclaim( $list130 );
    register_cfasl_input_function( $cfasl_opcode_p_float$.getGlobalValue(), $sym133$CFASL_INPUT_P_FLOAT );
    register_cfasl_input_function( $cfasl_opcode_n_float$.getGlobalValue(), $sym134$CFASL_INPUT_N_FLOAT );
    Structures.register_method( $cfasl_output_object_method_table$.getGlobalValue(), Types.$dtp_float$.getGlobalValue(), Symbols.symbol_function( $sym135$CFASL_OUTPUT_OBJECT_FLOAT_METHOD ) );
    Structures.register_method( $cfasl_output_object_method_table$.getGlobalValue(), Types.$dtp_symbol$.getGlobalValue(), Symbols.symbol_function( $sym136$CFASL_OUTPUT_OBJECT_SYMBOL_METHOD ) );
    register_cfasl_input_function( $cfasl_opcode_keyword$.getGlobalValue(), $sym137$CFASL_INPUT_KEYWORD );
    register_cfasl_input_function( $cfasl_opcode_other_symbol$.getGlobalValue(), $sym138$CFASL_INPUT_OTHER_SYMBOL );
    register_cfasl_input_function( $cfasl_opcode_nil$.getGlobalValue(), $sym139$CFASL_INPUT_NIL );
    register_cfasl_input_function( $cfasl_opcode_common_symbol$.getGlobalValue(), $sym141$CFASL_INPUT_COMMON_SYMBOL );
    Structures.register_method( $cfasl_output_object_method_table$.getGlobalValue(), Types.$dtp_cons$.getGlobalValue(), Symbols.symbol_function( $sym150$CFASL_OUTPUT_OBJECT_CONS_METHOD ) );
    subl_macro_promotions.declare_defglobal( $sym151$_CFASL_LIST_METHODS_ );
    register_cfasl_input_function( $cfasl_opcode_list$.getGlobalValue(), $sym152$CFASL_INPUT_LIST );
    register_cfasl_input_function( $cfasl_opcode_dotted_list$.getGlobalValue(), $sym155$CFASL_INPUT_DOTTED_LIST );
    Structures.register_method( $cfasl_output_object_method_table$.getGlobalValue(), Types.$dtp_vector$.getGlobalValue(), Symbols.symbol_function( $sym156$CFASL_OUTPUT_OBJECT_VECTOR_METHOD ) );
    register_cfasl_input_function( $cfasl_opcode_general_vector$.getGlobalValue(), $sym157$CFASL_INPUT_GENERAL_VECTOR );
    register_cfasl_input_function( $cfasl_opcode_byte_vector$.getGlobalValue(), $sym159$CFASL_INPUT_BYTE_VECTOR );
    register_cfasl_input_function( $cfasl_opcode_string$.getGlobalValue(), $sym160$CFASL_INPUT_STRING );
    Structures.register_method( $cfasl_output_object_method_table$.getGlobalValue(), Types.$dtp_string$.getGlobalValue(), Symbols.symbol_function( $sym161$CFASL_OUTPUT_OBJECT_STRING_METHOD ) );
    register_cfasl_input_function( $cfasl_opcode_character$.getGlobalValue(), $sym162$CFASL_INPUT_CHARACTER );
    Structures.register_method( $cfasl_output_object_method_table$.getGlobalValue(), Types.$dtp_character$.getGlobalValue(), Symbols.symbol_function( $sym163$CFASL_OUTPUT_OBJECT_CHARACTER_METHOD ) );
    register_cfasl_input_function( $cfasl_opcode_hashtable$.getGlobalValue(), $sym164$CFASL_INPUT_HASHTABLE );
    Structures.register_method( $cfasl_output_object_method_table$.getGlobalValue(), Types.$dtp_hash_table$.getGlobalValue(), Symbols.symbol_function( $sym165$CFASL_OUTPUT_OBJECT_HASH_TABLE_METHOD ) );
    register_cfasl_input_function( $cfasl_opcode_guid$.getGlobalValue(), $sym167$CFASL_INPUT_GUID );
    Structures.register_method( $cfasl_output_object_method_table$.getGlobalValue(), Guids.$dtp_guid$.getGlobalValue(), Symbols.symbol_function( $sym168$CFASL_OUTPUT_OBJECT_GUID_METHOD ) );
    register_cfasl_input_function( $cfasl_opcode_legacy_guid$.getGlobalValue(), $sym170$CFASL_INPUT_LEGACY_GUID );
    register_cfasl_input_function( $cfasl_opcode_result_set$.getGlobalValue(), $sym174$CFASL_INPUT_RESULT_SET );
    register_cfasl_input_function( $cfasl_opcode_package$.getGlobalValue(), $sym176$CFASL_INPUT_PACKAGE );
    Structures.register_method( $cfasl_output_object_method_table$.getGlobalValue(), Types.$dtp_package$.getGlobalValue(), Symbols.symbol_function( $sym177$CFASL_OUTPUT_OBJECT_PACKAGE_METHOD ) );
    register_cfasl_input_function( $cfasl_opcode_wide_cfasl_opcode$.getGlobalValue(), $sym179$CFASL_INPUT_WIDE_OPCODE_ENCODED );
    subl_macro_promotions.declare_defglobal( $sym180$_CFASL_WIDE_OPCODE_INPUT_METHOD_TABLE_ );
    access_macros.register_macro_helper( $sym184$REGISTER_WIDE_CFASL_OPCODE_INPUT_FUNCTION, $sym185$DECLARE_WIDE_CFASL_OPCODE );
    register_cfasl_input_function( $cfasl_opcode_instance$.getGlobalValue(), $sym187$CFASL_INPUT_INSTANCE );
    Structures.register_method( $cfasl_output_object_method_table$.getGlobalValue(), subloop_structures.$dtp_instance$.getGlobalValue(), Symbols.symbol_function( $sym189$CFASL_OUTPUT_OBJECT_INSTANCE_METHOD ) );
    register_cfasl_input_function( $cfasl_opcode_guid_denoted_type$.getGlobalValue(), $sym192$CFASL_INPUT_GUID_DENOTED_TYPE );
    subl_macro_promotions.declare_defglobal( $sym193$_CFASL_GUID_DENOTED_TYPE_INPUT_METHOD_TABLE_ );
    access_macros.register_macro_helper( $sym198$REGISTER_CFASL_GUID_DENOTED_TYPE_INPUT_FUNCTION, $sym202$DECLARE_CFASL_GUID_OPCODE );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_cfasl_file();
  }

  @Override
  public void initializeVariables()
  {
    init_cfasl_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_cfasl_file();
  }

  public static final class $cfasl_encoding_stream_native
      extends
        SubLStructNative
  {
    public SubLObject $internal_stream;
    public SubLObject $count;
    private static final SubLStructDeclNative structDecl;

    public $cfasl_encoding_stream_native()
    {
      this.$internal_stream = CommonSymbols.NIL;
      this.$count = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $cfasl_encoding_stream_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$internal_stream;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$count;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$internal_stream = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$count = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $cfasl_encoding_stream_native.class, $sym0$CFASL_ENCODING_STREAM, $sym1$CFASL_ENCODING_STREAM_P, $list2, $list3, new String[] { "$internal_stream", "$count"
      }, $list4, $list5, $sym6$DEFAULT_STRUCT_PRINT_FUNCTION );
    }
  }

  public static final class $cfasl_encoding_stream_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $cfasl_encoding_stream_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "CFASL-ENCODING-STREAM-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return cfasl_encoding_stream_p( arg1 );
    }
  }

  public static final class $cfasl_decoding_stream_native
      extends
        SubLStructNative
  {
    public SubLObject $internal_stream;
    public SubLObject $position;
    private static final SubLStructDeclNative structDecl;

    public $cfasl_decoding_stream_native()
    {
      this.$internal_stream = CommonSymbols.NIL;
      this.$position = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $cfasl_decoding_stream_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$internal_stream;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$position;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$internal_stream = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$position = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $cfasl_decoding_stream_native.class, $sym39$CFASL_DECODING_STREAM, $sym40$CFASL_DECODING_STREAM_P, $list41, $list42, new String[] { "$internal_stream", "$position"
      }, $list43, $list44, $sym6$DEFAULT_STRUCT_PRINT_FUNCTION );
    }
  }

  public static final class $cfasl_decoding_stream_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $cfasl_decoding_stream_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "CFASL-DECODING-STREAM-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return cfasl_decoding_stream_p( arg1 );
    }
  }

  public static final class $cfasl_count_stream_native
      extends
        SubLStructNative
  {
    public SubLObject $position;
    private static final SubLStructDeclNative structDecl;

    public $cfasl_count_stream_native()
    {
      this.$position = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $cfasl_count_stream_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$position;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$position = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $cfasl_count_stream_native.class, $sym62$CFASL_COUNT_STREAM, $sym63$CFASL_COUNT_STREAM_P, $list64, $list65, new String[] { "$position"
      }, $list66, $list67, $sym6$DEFAULT_STRUCT_PRINT_FUNCTION );
    }
  }

  public static final class $cfasl_count_stream_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $cfasl_count_stream_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "CFASL-COUNT-STREAM-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return cfasl_count_stream_p( arg1 );
    }
  }

  public static final class $cfasl_input_n_8bit_int$UnaryFunction
      extends
        UnaryFunction
  {
    public $cfasl_input_n_8bit_int$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "CFASL-INPUT-N-8BIT-INT" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return cfasl_input_n_8bit_int( arg1 );
    }
  }

  public static final class $cfasl_input_p_16bit_int$UnaryFunction
      extends
        UnaryFunction
  {
    public $cfasl_input_p_16bit_int$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "CFASL-INPUT-P-16BIT-INT" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return cfasl_input_p_16bit_int( arg1 );
    }
  }

  public static final class $cfasl_input_p_24bit_int$UnaryFunction
      extends
        UnaryFunction
  {
    public $cfasl_input_p_24bit_int$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "CFASL-INPUT-P-24BIT-INT" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return cfasl_input_p_24bit_int( arg1 );
    }
  }

  public static final class $cfasl_input_n_24bit_int$UnaryFunction
      extends
        UnaryFunction
  {
    public $cfasl_input_n_24bit_int$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "CFASL-INPUT-N-24BIT-INT" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return cfasl_input_n_24bit_int( arg1 );
    }
  }

  public static final class $cfasl_input_p_32bit_int$UnaryFunction
      extends
        UnaryFunction
  {
    public $cfasl_input_p_32bit_int$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "CFASL-INPUT-P-32BIT-INT" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return cfasl_input_p_32bit_int( arg1 );
    }
  }

  public static final class $cfasl_input_p_bignum$UnaryFunction
      extends
        UnaryFunction
  {
    public $cfasl_input_p_bignum$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "CFASL-INPUT-P-BIGNUM" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return cfasl_input_p_bignum( arg1 );
    }
  }

  public static final class $cfasl_input_p_float$UnaryFunction
      extends
        UnaryFunction
  {
    public $cfasl_input_p_float$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "CFASL-INPUT-P-FLOAT" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return cfasl_input_p_float( arg1 );
    }
  }

  public static final class $cfasl_input_n_float$UnaryFunction
      extends
        UnaryFunction
  {
    public $cfasl_input_n_float$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "CFASL-INPUT-N-FLOAT" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return cfasl_input_n_float( arg1 );
    }
  }

  public static final class $cfasl_input_keyword$UnaryFunction
      extends
        UnaryFunction
  {
    public $cfasl_input_keyword$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "CFASL-INPUT-KEYWORD" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return cfasl_input_keyword( arg1 );
    }
  }

  public static final class $cfasl_input_other_symbol$UnaryFunction
      extends
        UnaryFunction
  {
    public $cfasl_input_other_symbol$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "CFASL-INPUT-OTHER-SYMBOL" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return cfasl_input_other_symbol( arg1 );
    }
  }

  public static final class $cfasl_input_nil$UnaryFunction
      extends
        UnaryFunction
  {
    public $cfasl_input_nil$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "CFASL-INPUT-NIL" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return cfasl_input_nil( arg1 );
    }
  }

  public static final class $cfasl_input_common_symbol$UnaryFunction
      extends
        UnaryFunction
  {
    public $cfasl_input_common_symbol$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "CFASL-INPUT-COMMON-SYMBOL" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return cfasl_input_common_symbol( arg1 );
    }
  }

  public static final class $cfasl_input_list$UnaryFunction
      extends
        UnaryFunction
  {
    public $cfasl_input_list$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "CFASL-INPUT-LIST" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return cfasl_input_list( arg1 );
    }
  }

  public static final class $cfasl_input_dotted_list$UnaryFunction
      extends
        UnaryFunction
  {
    public $cfasl_input_dotted_list$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "CFASL-INPUT-DOTTED-LIST" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return cfasl_input_dotted_list( arg1 );
    }
  }

  public static final class $cfasl_input_general_vector$UnaryFunction
      extends
        UnaryFunction
  {
    public $cfasl_input_general_vector$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "CFASL-INPUT-GENERAL-VECTOR" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return cfasl_input_general_vector( arg1 );
    }
  }

  public static final class $cfasl_input_string$UnaryFunction
      extends
        UnaryFunction
  {
    public $cfasl_input_string$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "CFASL-INPUT-STRING" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return cfasl_input_string( arg1 );
    }
  }

  public static final class $cfasl_input_character$UnaryFunction
      extends
        UnaryFunction
  {
    public $cfasl_input_character$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "CFASL-INPUT-CHARACTER" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return cfasl_input_character( arg1 );
    }
  }

  public static final class $cfasl_input_guid$UnaryFunction
      extends
        UnaryFunction
  {
    public $cfasl_input_guid$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "CFASL-INPUT-GUID" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return cfasl_input_guid( arg1 );
    }
  }
}
/*
 * 
 * Total time: 663 ms
 * 
 */