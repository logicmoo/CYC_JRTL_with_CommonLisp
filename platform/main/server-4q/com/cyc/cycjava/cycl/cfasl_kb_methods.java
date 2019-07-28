package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.cfasl;
import com.cyc.cycjava.cycl.cfasl_kb_methods;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;
import java.util.function.Supplier;

import static com.cyc.cycjava.cycl.access_macros.*;
import static com.cyc.cycjava.cycl.cfasl.*;
import static com.cyc.cycjava.cycl.cfasl_kb_methods.*;
import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUALP;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FIFTEEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.MINUS_ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.SEVENTEEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class cfasl_kb_methods extends SubLTranslatedFile {
    public static final SubLFile me = new cfasl_kb_methods();

    public static final String myName = "com.cyc.cycjava.cycl.cfasl_kb_methods";

    public static final String myFingerPrint = "a085c9400e4481663941eb5956099c1e38cb191aa81992ca1d89b264bd518028";



    // defparameter
    public static final SubLSymbol $cfasl_reloc_last_address$ = makeSymbol("*CFASL-RELOC-LAST-ADDRESS*");

    // deflexical
    private static final SubLSymbol $cfasl_reloc_eof_marker$ = makeSymbol("*CFASL-RELOC-EOF-MARKER*");

    // deflexical
    private static final SubLSymbol $cfasl_reloc_version_1p0a$ = makeSymbol("*CFASL-RELOC-VERSION-1P0A*");

    // defparameter
    public static final SubLSymbol $report_cfasl_invalid_objectsP$ = makeSymbol("*REPORT-CFASL-INVALID-OBJECTS?");

    // defparameter
    // Definitions
    public static final SubLSymbol $within_complete_cfasl_objects$ = makeSymbol("*WITHIN-COMPLETE-CFASL-OBJECTS*");



    // defconstant
    private static final SubLSymbol $cfasl_opcode_constant$ = makeSymbol("*CFASL-OPCODE-CONSTANT*");

    // defconstant
    private static final SubLSymbol $cfasl_opcode_complete_constant$ = makeSymbol("*CFASL-OPCODE-COMPLETE-CONSTANT*");



    // defconstant
    private static final SubLSymbol $cfasl_opcode_nart$ = makeSymbol("*CFASL-OPCODE-NART*");



    // defconstant
    private static final SubLSymbol $cfasl_opcode_assertion$ = makeSymbol("*CFASL-OPCODE-ASSERTION*");

    // defparameter
    public static final SubLSymbol $cfasl_error_on_invalid_assertion_inputP$ = makeSymbol("*CFASL-ERROR-ON-INVALID-ASSERTION-INPUT?*");



    // defconstant
    private static final SubLSymbol $cfasl_opcode_deduction$ = makeSymbol("*CFASL-OPCODE-DEDUCTION*");



    // defconstant
    private static final SubLSymbol $cfasl_opcode_kb_hl_support$ = makeSymbol("*CFASL-OPCODE-KB-HL-SUPPORT*");



    // defconstant
    private static final SubLSymbol $cfasl_opcode_clause_struc$ = makeSymbol("*CFASL-OPCODE-CLAUSE-STRUC*");



    // defconstant
    private static final SubLSymbol $cfasl_opcode_variable$ = makeSymbol("*CFASL-OPCODE-VARIABLE*");

    // defconstant
    private static final SubLSymbol $cfasl_opcode_complete_variable$ = makeSymbol("*CFASL-OPCODE-COMPLETE-VARIABLE*");

    // defconstant
    private static final SubLSymbol $cfasl_opcode_sbhl_directed_link$ = makeSymbol("*CFASL-OPCODE-SBHL-DIRECTED-LINK*");

    // defconstant
    private static final SubLSymbol $cfasl_opcode_sbhl_undirected_link$ = makeSymbol("*CFASL-OPCODE-SBHL-UNDIRECTED-LINK*");

    // defconstant
    private static final SubLSymbol $cfasl_opcode_hl_start$ = makeSymbol("*CFASL-OPCODE-HL-START*");

    // defconstant
    private static final SubLSymbol $cfasl_opcode_hl_end$ = makeSymbol("*CFASL-OPCODE-HL-END*");

    private static final SubLInteger $int$_101 = makeInteger(-101);

    private static final SubLList $list1 = list(list(makeSymbol("STREAM")), makeSymbol("&BODY"), makeSymbol("BODY"));



    public static final SubLSymbol $cfasl_reloc_side_stream$ = makeSymbol("*CFASL-RELOC-SIDE-STREAM*");

    private static final SubLList $list4 = list(list(makeSymbol("*CFASL-RELOC-LAST-ADDRESS*"), ZERO_INTEGER));

    private static final SubLList $list5 = list(makeSymbol("CFASL-OUTPUT-RELOC-VERSION-1P0A"));



    private static final SubLList $list7 = list(list(makeSymbol("CFASL-OUTPUT-RELOC-FOOTER")));

    private static final SubLList $list8 = list(list(makeSymbol("FILENAME")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym9$STREAMVAR = makeUninternedSymbol("STREAMVAR");



    private static final SubLList $list11 = list(makeKeyword("OUTPUT"));

    private static final SubLSymbol WITH_CFASL_RELOC_SIDE_STREAM = makeSymbol("WITH-CFASL-RELOC-SIDE-STREAM");

    private static final SubLSymbol SHOW_CFASL_RELOCATION_INFORMATION = makeSymbol("SHOW-CFASL-RELOCATION-INFORMATION");



    private static final SubLString $str15$Unable_to_open__S = makeString("Unable to open ~S");

    private static final SubLString $str16$Unsupported_reloc_version__A_ = makeString("Unsupported reloc version ~A.");

    private static final SubLString $str17$CFASL_Reloc_1_0a = makeString("CFASL Reloc 1.0a");

    private static final SubLString $str18$___EOF___ = makeString("---EOF---");

    private static final SubLList $list19 = list(list(makeSymbol("*REPORT-CFASL-INVALID-OBJECTS?"), T));

    private static final SubLList $list20 = list(makeSymbol("CONSTANTS"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $cfasl_externalized_constant_exceptions$ = makeSymbol("*CFASL-EXTERNALIZED-CONSTANT-EXCEPTIONS*");

    private static final SubLInteger $int$30 = makeInteger(30);

    private static final SubLSymbol CFASL_INPUT_CONSTANT = makeSymbol("CFASL-INPUT-CONSTANT");



    private static final SubLSymbol CFASL_INPUT_COMPLETE_CONSTANT = makeSymbol("CFASL-INPUT-COMPLETE-CONSTANT");



    private static final SubLSymbol CFASL_OUTPUT_OBJECT_CONSTANT_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-CONSTANT-METHOD");

    private static final SubLSymbol $sample_invalid_constant$ = makeSymbol("*SAMPLE-INVALID-CONSTANT*");

    private static final SubLSymbol CONSTANT_INTERNAL_ID = makeSymbol("CONSTANT-INTERNAL-ID");

    private static final SubLSymbol CONSTANT_DUMP_ID = makeSymbol("CONSTANT-DUMP-ID");



    private static final SubLSymbol FIND_CONSTANT_BY_DUMP_ID = makeSymbol("FIND-CONSTANT-BY-DUMP-ID");

    private static final SubLInteger $int$31 = makeInteger(31);

    private static final SubLSymbol CFASL_INPUT_NART = makeSymbol("CFASL-INPUT-NART");



    private static final SubLSymbol CFASL_OUTPUT_OBJECT_NART_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-NART-METHOD");

    private static final SubLSymbol $sample_invalid_nart$ = makeSymbol("*SAMPLE-INVALID-NART*");

    private static final SubLSymbol $NART_HL_FORMULA = makeKeyword("NART-HL-FORMULA");



    private static final SubLSymbol NART_ID = makeSymbol("NART-ID");

    private static final SubLSymbol NART_DUMP_ID = makeSymbol("NART-DUMP-ID");

    private static final SubLSymbol FIND_NART_BY_ID = makeSymbol("FIND-NART-BY-ID");

    private static final SubLSymbol FIND_NART_BY_DUMP_ID = makeSymbol("FIND-NART-BY-DUMP-ID");

    private static final SubLInteger $int$33 = makeInteger(33);

    private static final SubLSymbol CFASL_INPUT_ASSERTION = makeSymbol("CFASL-INPUT-ASSERTION");



    private static final SubLSymbol CFASL_OUTPUT_OBJECT_ASSERTION_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-ASSERTION-METHOD");

    private static final SubLSymbol $sample_invalid_assertion$ = makeSymbol("*SAMPLE-INVALID-ASSERTION*");

    private static final SubLString $str49$Failed_to_input_assertion_with_CN = makeString("Failed to input assertion with CNF ~a and mt ~a from stream ~a");





    private static final SubLString $str52$Failed_to_input_assertion_with_ha = makeString("Failed to input assertion with handle ~a and lookup function ~a from stream ~a");



    private static final SubLSymbol ASSERTION_DUMP_ID = makeSymbol("ASSERTION-DUMP-ID");



    private static final SubLSymbol FIND_ASSERTION_BY_DUMP_ID = makeSymbol("FIND-ASSERTION-BY-DUMP-ID");

    private static final SubLInteger $int$36 = makeInteger(36);

    private static final SubLSymbol CFASL_INPUT_DEDUCTION = makeSymbol("CFASL-INPUT-DEDUCTION");



    private static final SubLSymbol CFASL_OUTPUT_OBJECT_DEDUCTION_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-DEDUCTION-METHOD");

    private static final SubLSymbol $sample_invalid_deduction$ = makeSymbol("*SAMPLE-INVALID-DEDUCTION*");

    private static final SubLSymbol $NULL_SUPPORTED_OBJECT = makeKeyword("NULL-SUPPORTED-OBJECT");





    private static final SubLSymbol DEDUCTION_ID = makeSymbol("DEDUCTION-ID");

    private static final SubLSymbol DEDUCTION_DUMP_ID = makeSymbol("DEDUCTION-DUMP-ID");

    private static final SubLSymbol FIND_DEDUCTION_BY_ID = makeSymbol("FIND-DEDUCTION-BY-ID");

    private static final SubLSymbol FIND_DEDUCTION_BY_DUMP_ID = makeSymbol("FIND-DEDUCTION-BY-DUMP-ID");

    private static final SubLInteger $int$37 = makeInteger(37);

    private static final SubLSymbol CFASL_INPUT_KB_HL_SUPPORT = makeSymbol("CFASL-INPUT-KB-HL-SUPPORT");

    private static final SubLSymbol $KB_HL_SUPPORT = makeKeyword("KB-HL-SUPPORT");

    private static final SubLSymbol CFASL_OUTPUT_OBJECT_KB_HL_SUPPORT_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-KB-HL-SUPPORT-METHOD");

    private static final SubLSymbol $sample_invalid_kb_hl_support$ = makeSymbol("*SAMPLE-INVALID-KB-HL-SUPPORT*");

    private static final SubLSymbol KB_HL_SUPPORT_ID = makeSymbol("KB-HL-SUPPORT-ID");

    private static final SubLSymbol KB_HL_SUPPORT_DUMP_ID = makeSymbol("KB-HL-SUPPORT-DUMP-ID");

    private static final SubLSymbol FIND_KB_HL_SUPPORT_BY_ID = makeSymbol("FIND-KB-HL-SUPPORT-BY-ID");

    private static final SubLSymbol FIND_KB_HL_SUPPORT_BY_DUMP_ID = makeSymbol("FIND-KB-HL-SUPPORT-BY-DUMP-ID");

    private static final SubLInteger $int$38 = makeInteger(38);

    private static final SubLSymbol CFASL_INPUT_CLAUSE_STRUC = makeSymbol("CFASL-INPUT-CLAUSE-STRUC");



    private static final SubLSymbol CFASL_OUTPUT_OBJECT_CLAUSE_STRUC_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-CLAUSE-STRUC-METHOD");

    private static final SubLSymbol $sample_invalid_clause_struc$ = makeSymbol("*SAMPLE-INVALID-CLAUSE-STRUC*");

    private static final SubLSymbol CLAUSE_STRUC_ID = makeSymbol("CLAUSE-STRUC-ID");

    private static final SubLSymbol CLAUSE_STRUC_DUMP_ID = makeSymbol("CLAUSE-STRUC-DUMP-ID");

    private static final SubLSymbol FIND_CLAUSE_STRUC_BY_ID = makeSymbol("FIND-CLAUSE-STRUC-BY-ID");

    private static final SubLSymbol FIND_CLAUSE_STRUC_BY_DUMP_ID = makeSymbol("FIND-CLAUSE-STRUC-BY-DUMP-ID");

    private static final SubLInteger $int$40 = makeInteger(40);

    private static final SubLSymbol CFASL_INPUT_VARIABLE = makeSymbol("CFASL-INPUT-VARIABLE");

    private static final SubLInteger $int$42 = makeInteger(42);

    private static final SubLSymbol CFASL_INPUT_COMPLETE_VARIABLE = makeSymbol("CFASL-INPUT-COMPLETE-VARIABLE");

    private static final SubLSymbol CFASL_OUTPUT_OBJECT_VARIABLE_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-VARIABLE-METHOD");

    private static final SubLSymbol CFASL_OUTPUT_OBJECT_SBHL_DIRECTED_LINK_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-SBHL-DIRECTED-LINK-METHOD");

    private static final SubLInteger $int$90 = makeInteger(90);

    private static final SubLSymbol CFASL_INPUT_SBHL_DIRECTED_LINK = makeSymbol("CFASL-INPUT-SBHL-DIRECTED-LINK");

    private static final SubLSymbol CFASL_OUTPUT_OBJECT_SBHL_UNDIRECTED_LINK_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-SBHL-UNDIRECTED-LINK-METHOD");

    private static final SubLInteger $int$91 = makeInteger(91);

    private static final SubLSymbol CFASL_INPUT_SBHL_UNDIRECTED_LINK = makeSymbol("CFASL-INPUT-SBHL-UNDIRECTED-LINK");

    private static final SubLInteger $int$94 = makeInteger(94);

    private static final SubLSymbol CFASL_INPUT_HL_START = makeSymbol("CFASL-INPUT-HL-START");

    private static final SubLInteger $int$95 = makeInteger(95);

    private static final SubLSymbol CFASL_INPUT_HL_END = makeSymbol("CFASL-INPUT-HL-END");

    private static final SubLSymbol CFASL_OUTPUT_OBJECT_HL_START_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-HL-START-METHOD");

    private static final SubLSymbol CFASL_OUTPUT_OBJECT_HL_END_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-HL-END-METHOD");

    private static final SubLSymbol CFASL_ENCODE = makeSymbol("CFASL-ENCODE");













    private static final SubLList $list111 = list(list(list(makeGuid("bd5880f4-9c29-11b1-9dad-c379636f7270")), vector(new SubLObject[]{ makeInteger(25), FIFTEEN_INTEGER, makeInteger(164), makeInteger(98), makeInteger(100), makeInteger(53), makeInteger(56), makeInteger(56), makeInteger(48), makeInteger(102), makeInteger(52), makeInteger(45), makeInteger(57), makeInteger(99), makeInteger(50), makeInteger(57), makeInteger(45), makeInteger(49), makeInteger(49), makeInteger(98), makeInteger(49), makeInteger(45), makeInteger(57), makeInteger(100), makeInteger(97), makeInteger(100), makeInteger(45), makeInteger(99), makeInteger(51), makeInteger(55), makeInteger(57), makeInteger(54), makeInteger(51), makeInteger(54), makeInteger(102), makeInteger(55), makeInteger(50), makeInteger(55), makeInteger(48) })), list(list(makeGuid("1bb5d971-e945-11dc-8241-00e08156aaa2")), vector(new SubLObject[]{ makeInteger(25), FIFTEEN_INTEGER, makeInteger(164), makeInteger(49), makeInteger(98), makeInteger(98), makeInteger(53), makeInteger(100), makeInteger(57), makeInteger(55), makeInteger(49), makeInteger(45), makeInteger(101), makeInteger(57), makeInteger(52), makeInteger(53), makeInteger(45), makeInteger(49), makeInteger(49), makeInteger(100), makeInteger(99), makeInteger(45), makeInteger(56), makeInteger(50), makeInteger(52), makeInteger(49), makeInteger(45), makeInteger(48), makeInteger(48), makeInteger(101), makeInteger(48), makeInteger(56), makeInteger(49), makeInteger(53), makeInteger(54), makeInteger(97), makeInteger(97), makeInteger(97), makeInteger(50) })), list(list(makeGuid("8654b22c-e947-11dc-86ef-00e08156aaa2")), vector(new SubLObject[]{ makeInteger(25), FIFTEEN_INTEGER, makeInteger(164), makeInteger(56), makeInteger(54), makeInteger(53), makeInteger(52), makeInteger(98), makeInteger(50), makeInteger(50), makeInteger(99), makeInteger(45), makeInteger(101), makeInteger(57), makeInteger(52), makeInteger(55), makeInteger(45), makeInteger(49), makeInteger(49), makeInteger(100), makeInteger(99), makeInteger(45), makeInteger(56), makeInteger(54), makeInteger(101), makeInteger(102), makeInteger(45), makeInteger(48), makeInteger(48), makeInteger(101), makeInteger(48), makeInteger(56), makeInteger(49), makeInteger(53), makeInteger(54), makeInteger(97), makeInteger(97), makeInteger(97), makeInteger(50) })), list(list(makeGuid("69ece82b-4224-40d6-8f55-268be97ba4e7")), vector(new SubLObject[]{ makeInteger(25), FIFTEEN_INTEGER, makeInteger(164), makeInteger(54), makeInteger(57), makeInteger(101), makeInteger(99), makeInteger(101), makeInteger(56), makeInteger(50), makeInteger(98), makeInteger(45), makeInteger(52), makeInteger(50), makeInteger(50), makeInteger(52), makeInteger(45), makeInteger(52), makeInteger(48), makeInteger(100), makeInteger(54), makeInteger(45), makeInteger(56), makeInteger(102), makeInteger(53), makeInteger(53), makeInteger(45), makeInteger(50), makeInteger(54), makeInteger(56), makeInteger(98), makeInteger(101), makeInteger(57), makeInteger(55), makeInteger(98), makeInteger(97), makeInteger(52), makeInteger(101), makeInteger(55) })));

    private static final SubLSymbol CFASL_DECODE = makeSymbol("CFASL-DECODE");

    private static final SubLList $list113 = list(list(list(vector(new SubLObject[]{ makeInteger(25), FIFTEEN_INTEGER, makeInteger(164), makeInteger(98), makeInteger(100), makeInteger(53), makeInteger(56), makeInteger(56), makeInteger(48), makeInteger(102), makeInteger(52), makeInteger(45), makeInteger(57), makeInteger(99), makeInteger(50), makeInteger(57), makeInteger(45), makeInteger(49), makeInteger(49), makeInteger(98), makeInteger(49), makeInteger(45), makeInteger(57), makeInteger(100), makeInteger(97), makeInteger(100), makeInteger(45), makeInteger(99), makeInteger(51), makeInteger(55), makeInteger(57), makeInteger(54), makeInteger(51), makeInteger(54), makeInteger(102), makeInteger(55), makeInteger(50), makeInteger(55), makeInteger(48) })), makeGuid("bd5880f4-9c29-11b1-9dad-c379636f7270")), list(list(vector(new SubLObject[]{ makeInteger(25), FIFTEEN_INTEGER, makeInteger(164), makeInteger(49), makeInteger(98), makeInteger(98), makeInteger(53), makeInteger(100), makeInteger(57), makeInteger(55), makeInteger(49), makeInteger(45), makeInteger(101), makeInteger(57), makeInteger(52), makeInteger(53), makeInteger(45), makeInteger(49), makeInteger(49), makeInteger(100), makeInteger(99), makeInteger(45), makeInteger(56), makeInteger(50), makeInteger(52), makeInteger(49), makeInteger(45), makeInteger(48), makeInteger(48), makeInteger(101), makeInteger(48), makeInteger(56), makeInteger(49), makeInteger(53), makeInteger(54), makeInteger(97), makeInteger(97), makeInteger(97), makeInteger(50) })), makeGuid("1bb5d971-e945-11dc-8241-00e08156aaa2")), list(list(vector(new SubLObject[]{ makeInteger(25), FIFTEEN_INTEGER, makeInteger(164), makeInteger(56), makeInteger(54), makeInteger(53), makeInteger(52), makeInteger(98), makeInteger(50), makeInteger(50), makeInteger(99), makeInteger(45), makeInteger(101), makeInteger(57), makeInteger(52), makeInteger(55), makeInteger(45), makeInteger(49), makeInteger(49), makeInteger(100), makeInteger(99), makeInteger(45), makeInteger(56), makeInteger(54), makeInteger(101), makeInteger(102), makeInteger(45), makeInteger(48), makeInteger(48), makeInteger(101), makeInteger(48), makeInteger(56), makeInteger(49), makeInteger(53), makeInteger(54), makeInteger(97), makeInteger(97), makeInteger(97), makeInteger(50) })), makeGuid("8654b22c-e947-11dc-86ef-00e08156aaa2")), list(list(vector(new SubLObject[]{ makeInteger(25), FIFTEEN_INTEGER, makeInteger(164), makeInteger(54), makeInteger(57), makeInteger(101), makeInteger(99), makeInteger(101), makeInteger(56), makeInteger(50), makeInteger(98), makeInteger(45), makeInteger(52), makeInteger(50), makeInteger(50), makeInteger(52), makeInteger(45), makeInteger(52), makeInteger(48), makeInteger(100), makeInteger(54), makeInteger(45), makeInteger(56), makeInteger(102), makeInteger(53), makeInteger(53), makeInteger(45), makeInteger(50), makeInteger(54), makeInteger(56), makeInteger(98), makeInteger(101), makeInteger(57), makeInteger(55), makeInteger(98), makeInteger(97), makeInteger(52), makeInteger(101), makeInteger(55) })), makeGuid("69ece82b-4224-40d6-8f55-268be97ba4e7")), list(list(vector(new SubLObject[]{ makeInteger(43), makeInteger(189), makeInteger(88), makeInteger(128), makeInteger(244), makeInteger(156), makeInteger(41), SEVENTEEN_INTEGER, makeInteger(177), makeInteger(157), makeInteger(173), makeInteger(195), makeInteger(121), makeInteger(99), makeInteger(111), makeInteger(114), makeInteger(112) })), makeGuid("bd5880f4-9c29-11b1-9dad-c379636f7270")), list(list(vector(new SubLObject[]{ makeInteger(43), makeInteger(27), makeInteger(181), makeInteger(217), makeInteger(113), makeInteger(233), makeInteger(69), SEVENTEEN_INTEGER, makeInteger(220), makeInteger(130), makeInteger(65), ZERO_INTEGER, makeInteger(224), makeInteger(129), makeInteger(86), makeInteger(170), makeInteger(162) })), makeGuid("1bb5d971-e945-11dc-8241-00e08156aaa2")), list(list(vector(new SubLObject[]{ makeInteger(43), makeInteger(134), makeInteger(84), makeInteger(178), makeInteger(44), makeInteger(233), makeInteger(71), SEVENTEEN_INTEGER, makeInteger(220), makeInteger(134), makeInteger(239), ZERO_INTEGER, makeInteger(224), makeInteger(129), makeInteger(86), makeInteger(170), makeInteger(162) })), makeGuid("8654b22c-e947-11dc-86ef-00e08156aaa2")), list(list(vector(new SubLObject[]{ makeInteger(43), makeInteger(105), makeInteger(236), makeInteger(232), makeInteger(43), makeInteger(66), makeInteger(36), makeInteger(64), makeInteger(214), makeInteger(143), makeInteger(85), makeInteger(38), makeInteger(139), makeInteger(233), makeInteger(123), makeInteger(164), makeInteger(231) })), makeGuid("69ece82b-4224-40d6-8f55-268be97ba4e7")));

    public static SubLObject valid_cfasl_reloc_side_stream_p() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return streamp($cfasl_reloc_side_stream$.getDynamicValue(thread));
    }

    public static SubLObject cfasl_output_reloc_address(final SubLObject file_position) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject previous = $cfasl_reloc_last_address$.getDynamicValue(thread);
        final SubLObject delta = subtract(file_position, previous);
        cfasl_output(delta, $cfasl_reloc_side_stream$.getDynamicValue(thread));
        $cfasl_reloc_last_address$.setDynamicValue(file_position, thread);
        return delta;
    }

    public static SubLObject possibly_output_cfasl_reloc_position(final SubLObject stream) {
        if (NIL != valid_cfasl_reloc_side_stream_p()) {
            cfasl_output_reloc_address(file_position(stream, UNPROVIDED));
        }
        return NIL;
    }

    public static SubLObject possibly_output_adjusted_cfasl_reloc_position(final SubLObject stream, SubLObject adjustment) {
        if (adjustment == UNPROVIDED) {
            adjustment = MINUS_ONE_INTEGER;
        }
        if (NIL != valid_cfasl_reloc_side_stream_p()) {
            SubLObject address = file_position(stream, UNPROVIDED);
            address = add(address, adjustment);
            cfasl_output_reloc_address(address);
        }
        return NIL;
    }

    public static SubLObject cfasl_output_reloc_version_1p0a() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return cfasl_output($cfasl_reloc_version_1p0a$.getGlobalValue(), $cfasl_reloc_side_stream$.getDynamicValue(thread));
    }

    public static SubLObject cfasl_output_reloc_footer() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return cfasl_output($cfasl_reloc_eof_marker$.getGlobalValue(), $cfasl_reloc_side_stream$.getDynamicValue(thread));
    }

    public static SubLObject with_cfasl_reloc_side_stream(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list1);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject stream = NIL;
        destructuring_bind_must_consp(current, datum, $list1);
        stream = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(CLET, bq_cons(list($cfasl_reloc_side_stream$, stream), $list4), $list5, bq_cons(PROGN, append(body, NIL)), $list7);
        }
        cdestructuring_bind_error(datum, $list1);
        return NIL;
    }

    public static SubLObject with_cfasl_reloc_side_file(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list8);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject filename = NIL;
        destructuring_bind_must_consp(current, datum, $list8);
        filename = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject streamvar = $sym9$STREAMVAR;
            return list(WITH_PRIVATE_BINARY_FILE, listS(streamvar, filename, $list11), listS(WITH_CFASL_RELOC_SIDE_STREAM, list(streamvar), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list8);
        return NIL;
    }

    public static SubLObject show_cfasl_relocation_information(final SubLObject filename, SubLObject output) {
        if (output == UNPROVIDED) {
            output = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject stream = NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_binary(filename, $INPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str15$Unable_to_open__S, filename);
            }
            final SubLObject s = stream;
            final SubLObject version = cfasl_input(s, UNPROVIDED, UNPROVIDED);
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!version.numE($cfasl_reloc_version_1p0a$.getGlobalValue()))) {
                Errors.error($str16$Unsupported_reloc_version__A_, version);
            }
            write_string($str17$CFASL_Reloc_1_0a, output, UNPROVIDED, UNPROVIDED);
            SubLObject address = ZERO_INTEGER;
            SubLObject offset;
            for (offset = NIL, offset = cfasl_input(s, UNPROVIDED, UNPROVIDED); offset.isPositive(); offset = cfasl_input(s, UNPROVIDED, UNPROVIDED)) {
                address = add(address, offset);
                print(address, output);
            }
            terpri(output);
            write_string($str18$___EOF___, output, UNPROVIDED, UNPROVIDED);
            terpri(output);
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
        return filename;
    }

    public static SubLObject with_cfasl_invalid_object_reporting(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list19, append(body, NIL));
    }

    public static SubLObject report_cfasl_invalid_objectsP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $report_cfasl_invalid_objectsP$.getDynamicValue(thread);
    }

    public static SubLObject within_complete_cfasl_objects_p() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $within_complete_cfasl_objects$.getDynamicValue(thread);
    }

    public static SubLObject with_cfasl_externalized_constant_exceptions(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject constants = NIL;
        destructuring_bind_must_consp(current, datum, $list20);
        constants = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(list($cfasl_externalized_constant_exceptions$, constants)), append(body, NIL));
    }

    public static SubLObject cfasl_externalized_constant_exception_p(final SubLObject constant) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL != $cfasl_externalized_constant_exceptions$.getDynamicValue(thread)) && (NIL != set.set_memberP(constant, $cfasl_externalized_constant_exceptions$.getDynamicValue(thread))));
    }

    public static SubLObject cfasl_output_constant(final SubLObject constant, final SubLObject stream) {
        if ((NIL != report_cfasl_invalid_objectsP()) && (NIL == valid_constantP(constant, UNPROVIDED))) {
            kb_health_statistics.kb_health_note_problem_with($CONSTANT, constant, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        if (NIL != within_complete_cfasl_objects_p()) {
            cfasl_raw_write_byte($cfasl_opcode_complete_constant$.getGlobalValue(), stream);
            cfasl_output_constant_recipe(constant, stream);
            final SubLObject name = constants_high.constant_name(constant);
            if (name.isString()) {
                cfasl_output_string(name, stream);
            } else {
                cfasl_output(name, stream);
            }
        } else {
            cfasl_raw_write_byte($cfasl_opcode_constant$.getGlobalValue(), stream);
            if (NIL != within_cfasl_externalization_p()) {
                cfasl_output_constant_recipe(constant, stream);
            } else {
                possibly_output_adjusted_cfasl_reloc_position(stream, UNPROVIDED);
                cfasl_output_constant_handle(constant, stream);
            }
        }
        return constant;
    }

    public static SubLObject cfasl_output_object_constant_method(final SubLObject v_object, final SubLObject stream) {
        return cfasl_output_constant(v_object, stream);
    }

    public static SubLObject cfasl_invalid_constant() {
        return $sample_invalid_constant$.getGlobalValue();
    }

    public static SubLObject cfasl_input_constant(final SubLObject stream) {
        SubLObject constant = NIL;
        if (NIL != within_cfasl_externalization_p()) {
            constant = cfasl_input_constant_recipe(stream);
        } else {
            constant = cfasl_input_constant_handle(stream);
        }
        if (NIL == constant) {
            constant = $sample_invalid_constant$.getGlobalValue();
        }
        return constant;
    }

    public static SubLObject cfasl_input_complete_constant(final SubLObject stream) {
        SubLObject constant = NIL;
        constant = cfasl_input_constant_recipe(stream);
        cfasl_input_object(stream);
        if (NIL == constant) {
            constant = $sample_invalid_constant$.getGlobalValue();
        }
        return constant;
    }

    public static SubLObject cfasl_output_constant_recipe(final SubLObject constant, final SubLObject stream) {
        if (NIL != cfasl_externalized_constant_exception_p(constant)) {
            return cfasl_output_constant_handle(constant, stream);
        }
        final SubLObject external_id = constants_high.constant_external_id(constant);
        cfasl_output(external_id, stream);
        return constant;
    }

    public static SubLObject cfasl_input_constant_recipe(final SubLObject stream) {
        final SubLObject id = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        SubLObject constant = NIL;
        if (NIL != constants_high.constant_external_id_p(id)) {
            constant = constants_high.find_constant_by_external_id(id);
        } else
            if (NIL != constants_high.constant_internal_id_p(id)) {
                constant = cfasl_constant_handle_lookup(id);
            }

        if ((NIL == constant) && (NIL != report_cfasl_invalid_objectsP())) {
            kb_health_statistics.kb_health_note_problem_with($CONSTANT, id, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return constant;
    }

    public static SubLObject cfasl_output_constant_handle(final SubLObject constant, final SubLObject stream) {
        cfasl_output(cfasl_constant_handle(constant), stream);
        return constant;
    }

    public static SubLObject cfasl_input_constant_handle(final SubLObject stream) {
        final SubLObject handle = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        final SubLObject constant = cfasl_constant_handle_lookup(handle);
        if (((NIL == constant) || $sample_invalid_constant$.getGlobalValue().eql(constant)) && (NIL != report_cfasl_invalid_objectsP())) {
            kb_health_statistics.kb_health_note_problem_with($CONSTANT, handle, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return constant;
    }

    public static SubLObject cfasl_constant_handle(final SubLObject constant) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != invalid_constantP(constant, UNPROVIDED)) {
            return MINUS_ONE_INTEGER;
        }
        final SubLObject method = api_control_vars.$cfasl_constant_handle_func$.getDynamicValue(thread);
        if (NIL == method) {
            return constants_high.constant_internal_id(constant);
        }
        final SubLObject pcase_var = method;
        if (pcase_var.eql(CONSTANT_INTERNAL_ID)) {
            return constants_high.constant_internal_id(constant);
        }
        if (pcase_var.eql(CONSTANT_DUMP_ID)) {
            return constants_high.constant_dump_id(constant);
        }
        return funcall(method, constant);
    }

    public static SubLObject cfasl_constant_handle_lookup(final SubLObject id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == subl_promotions.non_negative_integer_p(id)) {
            return $sample_invalid_constant$.getGlobalValue();
        }
        final SubLObject method = api_control_vars.$cfasl_constant_handle_lookup_func$.getDynamicValue(thread);
        if (NIL == method) {
            return constants_high.find_constant_by_internal_id(id);
        }
        final SubLObject pcase_var = method;
        if (pcase_var.eql(FIND_CONSTANT_BY_INTERNAL_ID)) {
            return constants_high.find_constant_by_internal_id(id);
        }
        if (pcase_var.eql(FIND_CONSTANT_BY_DUMP_ID)) {
            return constants_high.find_constant_by_dump_id(id);
        }
        return funcall(method, id);
    }

    public static SubLObject cfasl_output_nart(final SubLObject nart, final SubLObject stream) {
        if ((NIL != report_cfasl_invalid_objectsP()) && (NIL == nart_handles.valid_nartP(nart, UNPROVIDED))) {
            kb_health_statistics.kb_health_note_problem_with($NART, nart, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        cfasl_raw_write_byte($cfasl_opcode_nart$.getGlobalValue(), stream);
        if (NIL != within_cfasl_externalization_p()) {
            cfasl_output_nart_recipe(nart, stream);
        } else {
            possibly_output_adjusted_cfasl_reloc_position(stream, UNPROVIDED);
            cfasl_output_nart_handle(nart, stream);
        }
        return nart;
    }

    public static SubLObject cfasl_output_object_nart_method(final SubLObject v_object, final SubLObject stream) {
        return cfasl_output_nart(v_object, stream);
    }

    public static SubLObject cfasl_invalid_nart() {
        return $sample_invalid_nart$.getGlobalValue();
    }

    public static SubLObject cfasl_input_nart(final SubLObject stream) {
        SubLObject nart = NIL;
        if (NIL != within_cfasl_externalization_p()) {
            nart = cfasl_input_nart_recipe(stream);
        } else {
            nart = cfasl_input_nart_handle(stream);
        }
        if (NIL == nart) {
            nart = $sample_invalid_nart$.getGlobalValue();
        }
        return nart;
    }

    public static SubLObject cfasl_output_nart_recipe(final SubLObject nart, final SubLObject stream) {
        final SubLObject hl_formula = narts_high.nart_hl_formula(nart);
        cfasl_output(hl_formula, stream);
        return nart;
    }

    public static SubLObject cfasl_input_nart_recipe(final SubLObject stream) {
        final SubLObject hl_formula = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        if (NIL != hl_formula) {
            final SubLObject nart = narts_high.nart_lookup(hl_formula);
            if ((NIL == nart) && (NIL != report_cfasl_invalid_objectsP())) {
                kb_health_statistics.kb_health_note_problem_with($NART, hl_formula, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            return nart;
        }
        if (NIL != report_cfasl_invalid_objectsP()) {
            kb_health_statistics.kb_health_note_problem_with($NART_HL_FORMULA, $NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject cfasl_output_nart_handle(final SubLObject nart, final SubLObject stream) {
        cfasl_output(cfasl_nart_handle(nart), stream);
        return nart;
    }

    public static SubLObject cfasl_input_nart_handle(final SubLObject stream) {
        final SubLObject handle = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        final SubLObject nart = cfasl_nart_handle_lookup(handle);
        if (((NIL == nart) || $sample_invalid_nart$.getGlobalValue().eql(nart)) && (NIL != report_cfasl_invalid_objectsP())) {
            kb_health_statistics.kb_health_note_problem_with($NART, handle, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return nart;
    }

    public static SubLObject cfasl_nart_handle(final SubLObject nart) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != narts_high.invalid_nartP(nart, UNPROVIDED)) {
            return MINUS_ONE_INTEGER;
        }
        final SubLObject method = api_control_vars.$cfasl_nart_handle_func$.getDynamicValue(thread);
        if (NIL == method) {
            return nart_handles.nart_id(nart);
        }
        final SubLObject pcase_var = method;
        if (pcase_var.eql(NART_ID)) {
            return nart_handles.nart_id(nart);
        }
        if (pcase_var.eql(NART_DUMP_ID)) {
            return narts_high.nart_dump_id(nart);
        }
        return funcall(method, nart);
    }

    public static SubLObject cfasl_nart_handle_lookup(final SubLObject id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == subl_promotions.non_negative_integer_p(id)) {
            return $sample_invalid_nart$.getGlobalValue();
        }
        final SubLObject method = api_control_vars.$cfasl_nart_handle_lookup_func$.getDynamicValue(thread);
        if (NIL == method) {
            return nart_handles.find_nart_by_id(id);
        }
        final SubLObject pcase_var = method;
        if (pcase_var.eql(FIND_NART_BY_ID)) {
            return nart_handles.find_nart_by_id(id);
        }
        if (pcase_var.eql(FIND_NART_BY_DUMP_ID)) {
            return narts_high.find_nart_by_dump_id(id);
        }
        return funcall(method, id);
    }

    public static SubLObject cfasl_output_assertion(final SubLObject assertion, final SubLObject stream) {
        if ((NIL != report_cfasl_invalid_objectsP()) && (NIL == assertion_handles.valid_assertionP(assertion, UNPROVIDED))) {
            kb_health_statistics.kb_health_note_problem_with($ASSERTION, assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        cfasl_raw_write_byte($cfasl_opcode_assertion$.getGlobalValue(), stream);
        if (NIL != within_cfasl_externalization_p()) {
            cfasl_output_assertion_recipe(assertion, stream);
        } else {
            possibly_output_adjusted_cfasl_reloc_position(stream, UNPROVIDED);
            cfasl_output_assertion_handle(assertion, stream);
        }
        return assertion;
    }

    public static SubLObject cfasl_output_object_assertion_method(final SubLObject v_object, final SubLObject stream) {
        return cfasl_output_assertion(v_object, stream);
    }

    public static SubLObject cfasl_invalid_assertion() {
        return $sample_invalid_assertion$.getGlobalValue();
    }

    public static SubLObject cfasl_input_assertion(final SubLObject stream) {
        SubLObject assertion = NIL;
        if (NIL != within_cfasl_externalization_p()) {
            assertion = cfasl_input_assertion_recipe(stream);
        } else {
            assertion = cfasl_input_assertion_handle(stream);
        }
        if (NIL == assertion) {
            assertion = $sample_invalid_assertion$.getGlobalValue();
        }
        return assertion;
    }

    public static SubLObject cfasl_output_assertion_recipe(final SubLObject assertion, final SubLObject stream) {
        final SubLObject cnf = assertions_high.assertion_cnf(assertion);
        final SubLObject mt = assertions_high.assertion_mt(assertion);
        cfasl_output(cnf, stream);
        cfasl_output(mt, stream);
        return assertion;
    }

    public static SubLObject cfasl_input_assertion_recipe(final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject cnf = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        final SubLObject mt = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        if ((NIL != cnf) && (NIL != mt)) {
            final SubLObject result = kb_indexing.find_assertion_internal(cnf, mt);
            if ((NIL == result) && (NIL != report_cfasl_invalid_objectsP())) {
                kb_health_statistics.kb_health_note_problem_with($ASSERTION, cons(cnf, mt), UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            if (NIL != $cfasl_error_on_invalid_assertion_inputP$.getDynamicValue(thread)) {
                Errors.error($str49$Failed_to_input_assertion_with_CN, cnf, mt, stream);
            }
            return result;
        }
        if (NIL != report_cfasl_invalid_objectsP()) {
            if (NIL == cnf) {
                kb_health_statistics.kb_health_note_problem_with($ASSERTION, $NULL_CNF, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            if (NIL == mt) {
                kb_health_statistics.kb_health_note_problem_with($ASSERTION, $NULL_MT, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static SubLObject cfasl_output_assertion_handle(final SubLObject assertion, final SubLObject stream) {
        cfasl_output(cfasl_assertion_handle(assertion), stream);
        return assertion;
    }

    public static SubLObject cfasl_input_assertion_handle(final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject handle = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        final SubLObject result = cfasl_assertion_handle_lookup(handle);
        if (NIL == result) {
            if (NIL != report_cfasl_invalid_objectsP()) {
                kb_health_statistics.kb_health_note_problem_with($ASSERTION, handle, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            if (NIL != $cfasl_error_on_invalid_assertion_inputP$.getDynamicValue(thread)) {
                Errors.error($str52$Failed_to_input_assertion_with_ha, handle, api_control_vars.$cfasl_assertion_handle_lookup_func$.getDynamicValue(thread), stream);
            }
        }
        return result;
    }

    public static SubLObject cfasl_assertion_handle(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != assertions_high.invalid_assertion(assertion, UNPROVIDED)) {
            return MINUS_ONE_INTEGER;
        }
        final SubLObject method = api_control_vars.$cfasl_assertion_handle_func$.getDynamicValue(thread);
        if (NIL == method) {
            return assertion_handles.assertion_id(assertion);
        }
        final SubLObject pcase_var = method;
        if (pcase_var.eql(ASSERTION_ID)) {
            return assertion_handles.assertion_id(assertion);
        }
        if (pcase_var.eql(ASSERTION_DUMP_ID)) {
            return assertions_high.assertion_dump_id(assertion);
        }
        return funcall(method, assertion);
    }

    public static SubLObject cfasl_assertion_handle_lookup(final SubLObject id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == subl_promotions.non_negative_integer_p(id)) {
            return $sample_invalid_assertion$.getGlobalValue();
        }
        final SubLObject method = api_control_vars.$cfasl_assertion_handle_lookup_func$.getDynamicValue(thread);
        if (NIL == method) {
            return assertion_handles.find_assertion_by_id(id);
        }
        final SubLObject pcase_var = method;
        if (pcase_var.eql(FIND_ASSERTION_BY_ID)) {
            return assertion_handles.find_assertion_by_id(id);
        }
        if (pcase_var.eql(FIND_ASSERTION_BY_DUMP_ID)) {
            return assertions_high.find_assertion_by_dump_id(id);
        }
        return funcall(method, id);
    }

    public static SubLObject cfasl_output_deduction(final SubLObject deduction, final SubLObject stream) {
        if ((NIL != report_cfasl_invalid_objectsP()) && (NIL == deduction_handles.valid_deductionP(deduction, UNPROVIDED))) {
            kb_health_statistics.kb_health_note_problem_with($DEDUCTION, deduction, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        cfasl_raw_write_byte($cfasl_opcode_deduction$.getGlobalValue(), stream);
        if (NIL != within_cfasl_externalization_p()) {
            cfasl_output_deduction_recipe(deduction, stream);
        } else {
            possibly_output_adjusted_cfasl_reloc_position(stream, UNPROVIDED);
            cfasl_output_deduction_handle(deduction, stream);
        }
        return deduction;
    }

    public static SubLObject cfasl_output_object_deduction_method(final SubLObject v_object, final SubLObject stream) {
        return cfasl_output_deduction(v_object, stream);
    }

    public static SubLObject cfasl_invalid_deduction() {
        return $sample_invalid_deduction$.getGlobalValue();
    }

    public static SubLObject cfasl_input_deduction(final SubLObject stream) {
        SubLObject deduction = NIL;
        if (NIL != within_cfasl_externalization_p()) {
            deduction = cfasl_input_deduction_recipe(stream);
        } else {
            deduction = cfasl_input_deduction_handle(stream);
        }
        if (NIL == deduction) {
            deduction = $sample_invalid_deduction$.getGlobalValue();
        }
        return deduction;
    }

    public static SubLObject cfasl_output_deduction_recipe(final SubLObject deduction, final SubLObject stream) {
        final SubLObject supported_object = deductions_high.deduction_supported_object(deduction);
        final SubLObject supports = deductions_high.deduction_supports(deduction);
        final SubLObject truth = arguments.argument_truth(deduction);
        cfasl_output(supported_object, stream);
        cfasl_output(supports, stream);
        cfasl_output(truth, stream);
        return deduction;
    }

    public static SubLObject cfasl_input_deduction_recipe(final SubLObject stream) {
        final SubLObject supported_object = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        final SubLObject supports = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        final SubLObject truth = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        if (((NIL != supported_object) && (NIL != supports)) && (NIL != truth)) {
            final SubLObject result = deductions_high.find_deduction(supported_object, supports, truth);
            if ((NIL == result) && (NIL != report_cfasl_invalid_objectsP())) {
                kb_health_statistics.kb_health_note_problem_with($DEDUCTION, list(supported_object, supports, truth), UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            return result;
        }
        if (NIL != report_cfasl_invalid_objectsP()) {
            if (NIL == supported_object) {
                kb_health_statistics.kb_health_note_problem_with($DEDUCTION, $NULL_SUPPORTED_OBJECT, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            if (NIL == supports) {
                kb_health_statistics.kb_health_note_problem_with($DEDUCTION, $NULL_SUPPORTS, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            if (NIL == truth) {
                kb_health_statistics.kb_health_note_problem_with($DEDUCTION, $NULL_TRUTH, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static SubLObject cfasl_output_deduction_handle(final SubLObject deduction, final SubLObject stream) {
        cfasl_output(cfasl_deduction_handle(deduction), stream);
        return deduction;
    }

    public static SubLObject cfasl_input_deduction_handle(final SubLObject stream) {
        final SubLObject handle = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        final SubLObject result = cfasl_deduction_handle_lookup(handle);
        if ((NIL == result) && (NIL != report_cfasl_invalid_objectsP())) {
            kb_health_statistics.kb_health_note_problem_with($DEDUCTION, handle, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return result;
    }

    public static SubLObject cfasl_deduction_handle(final SubLObject deduction) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != deductions_high.invalid_deduction(deduction, UNPROVIDED)) {
            return MINUS_ONE_INTEGER;
        }
        final SubLObject method = api_control_vars.$cfasl_deduction_handle_func$.getDynamicValue(thread);
        if (NIL == method) {
            return deduction_handles.deduction_id(deduction);
        }
        final SubLObject pcase_var = method;
        if (pcase_var.eql(DEDUCTION_ID)) {
            return deduction_handles.deduction_id(deduction);
        }
        if (pcase_var.eql(DEDUCTION_DUMP_ID)) {
            return deductions_high.deduction_dump_id(deduction);
        }
        return funcall(method, deduction);
    }

    public static SubLObject cfasl_deduction_handle_lookup(final SubLObject id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == subl_promotions.non_negative_integer_p(id)) {
            return $sample_invalid_deduction$.getGlobalValue();
        }
        final SubLObject method = api_control_vars.$cfasl_deduction_handle_lookup_func$.getDynamicValue(thread);
        if (NIL == method) {
            return deduction_handles.find_deduction_by_id(id);
        }
        final SubLObject pcase_var = method;
        if (pcase_var.eql(FIND_DEDUCTION_BY_ID)) {
            return deduction_handles.find_deduction_by_id(id);
        }
        if (pcase_var.eql(FIND_DEDUCTION_BY_DUMP_ID)) {
            return deductions_high.find_deduction_by_dump_id(id);
        }
        return funcall(method, id);
    }

    public static SubLObject cfasl_output_kb_hl_support(final SubLObject kb_hl_support, final SubLObject stream) {
        if ((NIL != report_cfasl_invalid_objectsP()) && (NIL == kb_hl_support_handles.valid_kb_hl_supportP(kb_hl_support, UNPROVIDED))) {
            kb_health_statistics.kb_health_note_problem_with($KB_HL_SUPPORT, kb_hl_support, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        cfasl_raw_write_byte($cfasl_opcode_kb_hl_support$.getGlobalValue(), stream);
        if (NIL != within_cfasl_externalization_p()) {
            cfasl_output_kb_hl_support_recipe(kb_hl_support, stream);
        } else {
            possibly_output_adjusted_cfasl_reloc_position(stream, UNPROVIDED);
            cfasl_output_kb_hl_support_handle(kb_hl_support, stream);
        }
        return kb_hl_support;
    }

    public static SubLObject cfasl_output_object_kb_hl_support_method(final SubLObject v_object, final SubLObject stream) {
        return cfasl_output_kb_hl_support(v_object, stream);
    }

    public static SubLObject cfasl_invalid_kb_hl_support() {
        return $sample_invalid_kb_hl_support$.getGlobalValue();
    }

    public static SubLObject cfasl_input_kb_hl_support(final SubLObject stream) {
        SubLObject kb_hl_support = NIL;
        if (NIL != within_cfasl_externalization_p()) {
            kb_hl_support = cfasl_input_kb_hl_support_recipe(stream);
        } else {
            kb_hl_support = cfasl_input_kb_hl_support_handle(stream);
        }
        if (NIL == kb_hl_support) {
            kb_hl_support = $sample_invalid_kb_hl_support$.getGlobalValue();
        }
        return kb_hl_support;
    }

    public static SubLObject cfasl_output_kb_hl_support_recipe(final SubLObject kb_hl_support, final SubLObject stream) {
        final SubLObject hl_support = kb_hl_supports_high.kb_hl_support_hl_support(kb_hl_support);
        cfasl_output(hl_support, stream);
        return kb_hl_support;
    }

    public static SubLObject cfasl_input_kb_hl_support_recipe(final SubLObject stream) {
        final SubLObject hl_support = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        SubLObject kb_hl_support = NIL;
        if (NIL != arguments.hl_support_p(hl_support)) {
            kb_hl_support = kb_hl_supports_high.find_kb_hl_support(hl_support);
            if ((NIL == kb_hl_support) && (NIL != report_cfasl_invalid_objectsP())) {
                kb_health_statistics.kb_health_note_problem_with($KB_HL_SUPPORT, hl_support, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        } else
            if (NIL != report_cfasl_invalid_objectsP()) {
                kb_health_statistics.kb_health_note_problem_with($KB_HL_SUPPORT, hl_support, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }

        return kb_hl_support;
    }

    public static SubLObject cfasl_output_kb_hl_support_handle(final SubLObject kb_hl_support, final SubLObject stream) {
        cfasl_output(cfasl_kb_hl_support_handle(kb_hl_support), stream);
        return kb_hl_support;
    }

    public static SubLObject cfasl_input_kb_hl_support_handle(final SubLObject stream) {
        final SubLObject handle = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        final SubLObject kb_hl_support = cfasl_kb_hl_support_handle_lookup(handle);
        if ((NIL == kb_hl_support) && (NIL != report_cfasl_invalid_objectsP())) {
            kb_health_statistics.kb_health_note_problem_with($KB_HL_SUPPORT, handle, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return kb_hl_support;
    }

    public static SubLObject cfasl_kb_hl_support_handle(final SubLObject kb_hl_support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == kb_hl_support_handles.valid_kb_hl_supportP(kb_hl_support, UNPROVIDED)) {
            return MINUS_ONE_INTEGER;
        }
        final SubLObject pcase_var;
        final SubLObject method = pcase_var = (NIL != api_control_vars.$cfasl_kb_hl_support_handle_func$.getDynamicValue(thread)) ? api_control_vars.$cfasl_kb_hl_support_handle_func$.getDynamicValue(thread) : KB_HL_SUPPORT_ID;
        if (pcase_var.eql(KB_HL_SUPPORT_ID)) {
            return kb_hl_support_handles.kb_hl_support_id(kb_hl_support);
        }
        if (pcase_var.eql(KB_HL_SUPPORT_DUMP_ID)) {
            return kb_hl_supports_high.kb_hl_support_dump_id(kb_hl_support);
        }
        return funcall(method, kb_hl_support);
    }

    public static SubLObject cfasl_kb_hl_support_handle_lookup(final SubLObject id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pcase_var;
        final SubLObject method = pcase_var = (NIL != api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.getDynamicValue(thread)) ? api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.getDynamicValue(thread) : FIND_KB_HL_SUPPORT_BY_ID;
        if (pcase_var.eql(FIND_KB_HL_SUPPORT_BY_ID)) {
            return kb_hl_support_handles.find_kb_hl_support_by_id(id);
        }
        if (pcase_var.eql(FIND_KB_HL_SUPPORT_BY_DUMP_ID)) {
            return kb_hl_supports_high.find_kb_hl_support_by_dump_id(id);
        }
        return funcall(method, id);
    }

    public static SubLObject cfasl_output_clause_struc(final SubLObject clause_struc, final SubLObject stream) {
        if ((NIL != report_cfasl_invalid_objectsP()) && (NIL == clause_strucs.valid_clause_struc(clause_struc, UNPROVIDED))) {
            kb_health_statistics.kb_health_note_problem_with($CLAUSE_STRUC, clause_struc, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        cfasl_raw_write_byte($cfasl_opcode_clause_struc$.getGlobalValue(), stream);
        if (NIL != within_cfasl_externalization_p()) {
            cfasl_output_clause_struc_recipe(clause_struc, stream);
        } else {
            possibly_output_adjusted_cfasl_reloc_position(stream, UNPROVIDED);
            cfasl_output_clause_struc_handle(clause_struc, stream);
        }
        return clause_struc;
    }

    public static SubLObject cfasl_output_object_clause_struc_method(final SubLObject v_object, final SubLObject stream) {
        return cfasl_output_clause_struc(v_object, stream);
    }

    public static SubLObject cfasl_invalid_clause_struc() {
        return $sample_invalid_clause_struc$.getGlobalValue();
    }

    public static SubLObject cfasl_input_clause_struc(final SubLObject stream) {
        SubLObject clause_struc = NIL;
        if (NIL != within_cfasl_externalization_p()) {
            clause_struc = cfasl_input_clause_struc_recipe(stream);
        } else {
            clause_struc = cfasl_input_clause_struc_handle(stream);
        }
        if (NIL == clause_struc) {
            clause_struc = $sample_invalid_clause_struc$.getGlobalValue();
        }
        return clause_struc;
    }

    public static SubLObject cfasl_output_clause_struc_recipe(final SubLObject clause_struc, final SubLObject stream) {
        final SubLObject cnf = clause_strucs.clause_struc_cnf(clause_struc);
        cfasl_output(cnf, stream);
        return clause_struc;
    }

    public static SubLObject cfasl_input_clause_struc_recipe(final SubLObject stream) {
        final SubLObject cnf = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        if (NIL != cnf) {
            final SubLObject result = kb_indexing.find_clause_struc(cnf);
            if ((NIL == result) && (NIL != report_cfasl_invalid_objectsP())) {
                kb_health_statistics.kb_health_note_problem_with($CLAUSE_STRUC, cnf, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            return result;
        }
        if (NIL != report_cfasl_invalid_objectsP()) {
            kb_health_statistics.kb_health_note_problem_with($CLAUSE_STRUC, $NULL_CNF, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject cfasl_output_clause_struc_handle(final SubLObject clause_struc, final SubLObject stream) {
        cfasl_output(cfasl_clause_struc_handle(clause_struc), stream);
        return clause_struc;
    }

    public static SubLObject cfasl_input_clause_struc_handle(final SubLObject stream) {
        final SubLObject handle = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        final SubLObject result = cfasl_clause_struc_handle_lookup(handle);
        if (((NIL == result) || $sample_invalid_clause_struc$.getGlobalValue().eql(result)) && (NIL != report_cfasl_invalid_objectsP())) {
            kb_health_statistics.kb_health_note_problem_with($CLAUSE_STRUC, handle, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return result;
    }

    public static SubLObject cfasl_clause_struc_handle(final SubLObject clause_struc) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != clause_strucs.invalid_clause_struc(clause_struc, UNPROVIDED)) {
            return MINUS_ONE_INTEGER;
        }
        final SubLObject method = api_control_vars.$cfasl_clause_struc_handle_func$.getDynamicValue(thread);
        if (NIL == method) {
            return clause_strucs.clause_struc_id(clause_struc);
        }
        final SubLObject pcase_var = method;
        if (pcase_var.eql(CLAUSE_STRUC_ID)) {
            return clause_strucs.clause_struc_id(clause_struc);
        }
        if (pcase_var.eql(CLAUSE_STRUC_DUMP_ID)) {
            return clause_strucs.clause_struc_dump_id(clause_struc);
        }
        return funcall(method, clause_struc);
    }

    public static SubLObject cfasl_clause_struc_handle_lookup(final SubLObject id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == subl_promotions.non_negative_integer_p(id)) {
            return $sample_invalid_clause_struc$.getGlobalValue();
        }
        final SubLObject method = api_control_vars.$cfasl_clause_struc_handle_lookup_func$.getDynamicValue(thread);
        if (NIL == method) {
            return clause_strucs.find_clause_struc_by_id(id);
        }
        final SubLObject pcase_var = method;
        if (pcase_var.eql(FIND_CLAUSE_STRUC_BY_ID)) {
            return clause_strucs.find_clause_struc_by_id(id);
        }
        if (pcase_var.eql(FIND_CLAUSE_STRUC_BY_DUMP_ID)) {
            return clause_strucs.find_clause_struc_by_dump_id(id);
        }
        return funcall(method, id);
    }

    public static SubLObject cfasl_output_variable(final SubLObject variable, final SubLObject stream) {
        if (NIL != within_complete_cfasl_objects_p()) {
            cfasl_raw_write_byte($cfasl_opcode_complete_variable$.getGlobalValue(), stream);
            cfasl_output(variables.variable_id(variable), stream);
            cfasl_output_string(string_utilities.to_string(variable), stream);
        } else {
            cfasl_raw_write_byte($cfasl_opcode_variable$.getGlobalValue(), stream);
            cfasl_output(variables.variable_id(variable), stream);
        }
        return variable;
    }

    public static SubLObject cfasl_output_object_variable_method(final SubLObject v_object, final SubLObject stream) {
        return cfasl_output_variable(v_object, stream);
    }

    public static SubLObject cfasl_input_variable(final SubLObject stream) {
        return variables.find_variable_by_id(cfasl_input(stream, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject cfasl_input_complete_variable(final SubLObject stream) {
        final SubLObject variable = variables.find_variable_by_id(cfasl_input(stream, UNPROVIDED, UNPROVIDED));
        cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        return variable;
    }

    public static SubLObject cfasl_output_object_sbhl_directed_link_method(final SubLObject v_object, final SubLObject stream) {
        return cfasl_output_sbhl_directed_link(v_object, stream);
    }

    public static SubLObject cfasl_output_sbhl_directed_link(final SubLObject d_link, final SubLObject stream) {
        cfasl_raw_write_byte($cfasl_opcode_sbhl_directed_link$.getGlobalValue(), stream);
        cfasl_output(sbhl_links.sbhl_directed_link_predicate_links(d_link), stream);
        cfasl_output(sbhl_links.sbhl_directed_link_inverse_links(d_link), stream);
        return d_link;
    }

    public static SubLObject cfasl_input_sbhl_directed_link(final SubLObject stream) {
        SubLObject d_link = NIL;
        d_link = sbhl_links.make_sbhl_directed_link(UNPROVIDED);
        sbhl_links._csetf_sbhl_directed_link_predicate_links(d_link, cfasl_input(stream, UNPROVIDED, UNPROVIDED));
        sbhl_links._csetf_sbhl_directed_link_inverse_links(d_link, cfasl_input(stream, UNPROVIDED, UNPROVIDED));
        return d_link;
    }

    public static SubLObject cfasl_output_object_sbhl_undirected_link_method(final SubLObject v_object, final SubLObject stream) {
        return cfasl_output_sbhl_undirected_link(v_object, stream);
    }

    public static SubLObject cfasl_output_sbhl_undirected_link(final SubLObject d_link, final SubLObject stream) {
        cfasl_raw_write_byte($cfasl_opcode_sbhl_undirected_link$.getGlobalValue(), stream);
        cfasl_output(sbhl_links.sbhl_undirected_link_links(d_link), stream);
        return d_link;
    }

    public static SubLObject cfasl_input_sbhl_undirected_link(final SubLObject stream) {
        SubLObject d_link = NIL;
        d_link = sbhl_links.make_sbhl_undirected_link(UNPROVIDED);
        sbhl_links._csetf_sbhl_undirected_link_links(d_link, cfasl_input(stream, UNPROVIDED, UNPROVIDED));
        return d_link;
    }

    public static SubLObject cfasl_input_hl_start(final SubLObject stream) {
        final SubLObject interval = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        SubLObject hl_start = NIL;
        hl_start = sbhl_time_utilities.hl_start(interval);
        return hl_start;
    }

    public static SubLObject cfasl_input_hl_end(final SubLObject stream) {
        final SubLObject interval = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        SubLObject hl_end = NIL;
        hl_end = sbhl_time_utilities.hl_end(interval);
        return hl_end;
    }

    public static SubLObject cfasl_output_object_hl_start_method(final SubLObject v_object, final SubLObject stream) {
        return cfasl_output_hl_start(v_object, stream);
    }

    public static SubLObject cfasl_output_object_hl_end_method(final SubLObject v_object, final SubLObject stream) {
        return cfasl_output_hl_end(v_object, stream);
    }

    public static SubLObject cfasl_output_hl_start(final SubLObject hl_start, final SubLObject stream) {
        cfasl_raw_write_byte($cfasl_opcode_hl_start$.getGlobalValue(), stream);
        cfasl_output(sbhl_time_utilities.hl_interval_of_endpoint(hl_start), stream);
        return hl_start;
    }

    public static SubLObject cfasl_output_hl_end(final SubLObject hl_end, final SubLObject stream) {
        cfasl_raw_write_byte($cfasl_opcode_hl_end$.getGlobalValue(), stream);
        cfasl_output(sbhl_time_utilities.hl_interval_of_endpoint(hl_end), stream);
        return hl_end;
    }

    public static SubLObject declare_cfasl_kb_methods_file() {
        declareFunction(me, "valid_cfasl_reloc_side_stream_p", "VALID-CFASL-RELOC-SIDE-STREAM-P", 0, 0, false);
        declareFunction(me, "cfasl_output_reloc_address", "CFASL-OUTPUT-RELOC-ADDRESS", 1, 0, false);
        declareFunction(me, "possibly_output_cfasl_reloc_position", "POSSIBLY-OUTPUT-CFASL-RELOC-POSITION", 1, 0, false);
        declareFunction(me, "possibly_output_adjusted_cfasl_reloc_position", "POSSIBLY-OUTPUT-ADJUSTED-CFASL-RELOC-POSITION", 1, 1, false);
        declareFunction(me, "cfasl_output_reloc_version_1p0a", "CFASL-OUTPUT-RELOC-VERSION-1P0A", 0, 0, false);
        declareFunction(me, "cfasl_output_reloc_footer", "CFASL-OUTPUT-RELOC-FOOTER", 0, 0, false);
        declareMacro(me, "with_cfasl_reloc_side_stream", "WITH-CFASL-RELOC-SIDE-STREAM");
        declareMacro(me, "with_cfasl_reloc_side_file", "WITH-CFASL-RELOC-SIDE-FILE");
        declareFunction(me, "show_cfasl_relocation_information", "SHOW-CFASL-RELOCATION-INFORMATION", 1, 1, false);
        declareMacro(me, "with_cfasl_invalid_object_reporting", "WITH-CFASL-INVALID-OBJECT-REPORTING");
        declareFunction(me, "report_cfasl_invalid_objectsP", "REPORT-CFASL-INVALID-OBJECTS?", 0, 0, false);
        declareFunction(me, "within_complete_cfasl_objects_p", "WITHIN-COMPLETE-CFASL-OBJECTS-P", 0, 0, false);
        declareMacro(me, "with_cfasl_externalized_constant_exceptions", "WITH-CFASL-EXTERNALIZED-CONSTANT-EXCEPTIONS");
        declareFunction(me, "cfasl_externalized_constant_exception_p", "CFASL-EXTERNALIZED-CONSTANT-EXCEPTION-P", 1, 0, false);
        declareFunction(me, "cfasl_output_constant", "CFASL-OUTPUT-CONSTANT", 2, 0, false);
        declareFunction(me, "cfasl_output_object_constant_method", "CFASL-OUTPUT-OBJECT-CONSTANT-METHOD", 2, 0, false);
        declareFunction(me, "cfasl_invalid_constant", "CFASL-INVALID-CONSTANT", 0, 0, false);
        declareFunction(me, "cfasl_input_constant", "CFASL-INPUT-CONSTANT", 1, 0, false);
        new cfasl_kb_methods.$cfasl_input_constant$UnaryFunction();
        declareFunction(me, "cfasl_input_complete_constant", "CFASL-INPUT-COMPLETE-CONSTANT", 1, 0, false);
        declareFunction(me, "cfasl_output_constant_recipe", "CFASL-OUTPUT-CONSTANT-RECIPE", 2, 0, false);
        declareFunction(me, "cfasl_input_constant_recipe", "CFASL-INPUT-CONSTANT-RECIPE", 1, 0, false);
        declareFunction(me, "cfasl_output_constant_handle", "CFASL-OUTPUT-CONSTANT-HANDLE", 2, 0, false);
        declareFunction(me, "cfasl_input_constant_handle", "CFASL-INPUT-CONSTANT-HANDLE", 1, 0, false);
        declareFunction(me, "cfasl_constant_handle", "CFASL-CONSTANT-HANDLE", 1, 0, false);
        declareFunction(me, "cfasl_constant_handle_lookup", "CFASL-CONSTANT-HANDLE-LOOKUP", 1, 0, false);
        declareFunction(me, "cfasl_output_nart", "CFASL-OUTPUT-NART", 2, 0, false);
        declareFunction(me, "cfasl_output_object_nart_method", "CFASL-OUTPUT-OBJECT-NART-METHOD", 2, 0, false);
        declareFunction(me, "cfasl_invalid_nart", "CFASL-INVALID-NART", 0, 0, false);
        declareFunction(me, "cfasl_input_nart", "CFASL-INPUT-NART", 1, 0, false);
        new cfasl_kb_methods.$cfasl_input_nart$UnaryFunction();
        declareFunction(me, "cfasl_output_nart_recipe", "CFASL-OUTPUT-NART-RECIPE", 2, 0, false);
        declareFunction(me, "cfasl_input_nart_recipe", "CFASL-INPUT-NART-RECIPE", 1, 0, false);
        declareFunction(me, "cfasl_output_nart_handle", "CFASL-OUTPUT-NART-HANDLE", 2, 0, false);
        declareFunction(me, "cfasl_input_nart_handle", "CFASL-INPUT-NART-HANDLE", 1, 0, false);
        declareFunction(me, "cfasl_nart_handle", "CFASL-NART-HANDLE", 1, 0, false);
        declareFunction(me, "cfasl_nart_handle_lookup", "CFASL-NART-HANDLE-LOOKUP", 1, 0, false);
        declareFunction(me, "cfasl_output_assertion", "CFASL-OUTPUT-ASSERTION", 2, 0, false);
        declareFunction(me, "cfasl_output_object_assertion_method", "CFASL-OUTPUT-OBJECT-ASSERTION-METHOD", 2, 0, false);
        declareFunction(me, "cfasl_invalid_assertion", "CFASL-INVALID-ASSERTION", 0, 0, false);
        declareFunction(me, "cfasl_input_assertion", "CFASL-INPUT-ASSERTION", 1, 0, false);
        new cfasl_kb_methods.$cfasl_input_assertion$UnaryFunction();
        declareFunction(me, "cfasl_output_assertion_recipe", "CFASL-OUTPUT-ASSERTION-RECIPE", 2, 0, false);
        declareFunction(me, "cfasl_input_assertion_recipe", "CFASL-INPUT-ASSERTION-RECIPE", 1, 0, false);
        declareFunction(me, "cfasl_output_assertion_handle", "CFASL-OUTPUT-ASSERTION-HANDLE", 2, 0, false);
        declareFunction(me, "cfasl_input_assertion_handle", "CFASL-INPUT-ASSERTION-HANDLE", 1, 0, false);
        declareFunction(me, "cfasl_assertion_handle", "CFASL-ASSERTION-HANDLE", 1, 0, false);
        declareFunction(me, "cfasl_assertion_handle_lookup", "CFASL-ASSERTION-HANDLE-LOOKUP", 1, 0, false);
        declareFunction(me, "cfasl_output_deduction", "CFASL-OUTPUT-DEDUCTION", 2, 0, false);
        declareFunction(me, "cfasl_output_object_deduction_method", "CFASL-OUTPUT-OBJECT-DEDUCTION-METHOD", 2, 0, false);
        declareFunction(me, "cfasl_invalid_deduction", "CFASL-INVALID-DEDUCTION", 0, 0, false);
        declareFunction(me, "cfasl_input_deduction", "CFASL-INPUT-DEDUCTION", 1, 0, false);
        new cfasl_kb_methods.$cfasl_input_deduction$UnaryFunction();
        declareFunction(me, "cfasl_output_deduction_recipe", "CFASL-OUTPUT-DEDUCTION-RECIPE", 2, 0, false);
        declareFunction(me, "cfasl_input_deduction_recipe", "CFASL-INPUT-DEDUCTION-RECIPE", 1, 0, false);
        declareFunction(me, "cfasl_output_deduction_handle", "CFASL-OUTPUT-DEDUCTION-HANDLE", 2, 0, false);
        declareFunction(me, "cfasl_input_deduction_handle", "CFASL-INPUT-DEDUCTION-HANDLE", 1, 0, false);
        declareFunction(me, "cfasl_deduction_handle", "CFASL-DEDUCTION-HANDLE", 1, 0, false);
        declareFunction(me, "cfasl_deduction_handle_lookup", "CFASL-DEDUCTION-HANDLE-LOOKUP", 1, 0, false);
        declareFunction(me, "cfasl_output_kb_hl_support", "CFASL-OUTPUT-KB-HL-SUPPORT", 2, 0, false);
        declareFunction(me, "cfasl_output_object_kb_hl_support_method", "CFASL-OUTPUT-OBJECT-KB-HL-SUPPORT-METHOD", 2, 0, false);
        declareFunction(me, "cfasl_invalid_kb_hl_support", "CFASL-INVALID-KB-HL-SUPPORT", 0, 0, false);
        declareFunction(me, "cfasl_input_kb_hl_support", "CFASL-INPUT-KB-HL-SUPPORT", 1, 0, false);
        new cfasl_kb_methods.$cfasl_input_kb_hl_support$UnaryFunction();
        declareFunction(me, "cfasl_output_kb_hl_support_recipe", "CFASL-OUTPUT-KB-HL-SUPPORT-RECIPE", 2, 0, false);
        declareFunction(me, "cfasl_input_kb_hl_support_recipe", "CFASL-INPUT-KB-HL-SUPPORT-RECIPE", 1, 0, false);
        declareFunction(me, "cfasl_output_kb_hl_support_handle", "CFASL-OUTPUT-KB-HL-SUPPORT-HANDLE", 2, 0, false);
        declareFunction(me, "cfasl_input_kb_hl_support_handle", "CFASL-INPUT-KB-HL-SUPPORT-HANDLE", 1, 0, false);
        declareFunction(me, "cfasl_kb_hl_support_handle", "CFASL-KB-HL-SUPPORT-HANDLE", 1, 0, false);
        declareFunction(me, "cfasl_kb_hl_support_handle_lookup", "CFASL-KB-HL-SUPPORT-HANDLE-LOOKUP", 1, 0, false);
        declareFunction(me, "cfasl_output_clause_struc", "CFASL-OUTPUT-CLAUSE-STRUC", 2, 0, false);
        declareFunction(me, "cfasl_output_object_clause_struc_method", "CFASL-OUTPUT-OBJECT-CLAUSE-STRUC-METHOD", 2, 0, false);
        declareFunction(me, "cfasl_invalid_clause_struc", "CFASL-INVALID-CLAUSE-STRUC", 0, 0, false);
        declareFunction(me, "cfasl_input_clause_struc", "CFASL-INPUT-CLAUSE-STRUC", 1, 0, false);
        new cfasl_kb_methods.$cfasl_input_clause_struc$UnaryFunction();
        declareFunction(me, "cfasl_output_clause_struc_recipe", "CFASL-OUTPUT-CLAUSE-STRUC-RECIPE", 2, 0, false);
        declareFunction(me, "cfasl_input_clause_struc_recipe", "CFASL-INPUT-CLAUSE-STRUC-RECIPE", 1, 0, false);
        declareFunction(me, "cfasl_output_clause_struc_handle", "CFASL-OUTPUT-CLAUSE-STRUC-HANDLE", 2, 0, false);
        declareFunction(me, "cfasl_input_clause_struc_handle", "CFASL-INPUT-CLAUSE-STRUC-HANDLE", 1, 0, false);
        declareFunction(me, "cfasl_clause_struc_handle", "CFASL-CLAUSE-STRUC-HANDLE", 1, 0, false);
        declareFunction(me, "cfasl_clause_struc_handle_lookup", "CFASL-CLAUSE-STRUC-HANDLE-LOOKUP", 1, 0, false);
        declareFunction(me, "cfasl_output_variable", "CFASL-OUTPUT-VARIABLE", 2, 0, false);
        declareFunction(me, "cfasl_output_object_variable_method", "CFASL-OUTPUT-OBJECT-VARIABLE-METHOD", 2, 0, false);
        declareFunction(me, "cfasl_input_variable", "CFASL-INPUT-VARIABLE", 1, 0, false);
        new cfasl_kb_methods.$cfasl_input_variable$UnaryFunction();
        declareFunction(me, "cfasl_input_complete_variable", "CFASL-INPUT-COMPLETE-VARIABLE", 1, 0, false);
        declareFunction(me, "cfasl_output_object_sbhl_directed_link_method", "CFASL-OUTPUT-OBJECT-SBHL-DIRECTED-LINK-METHOD", 2, 0, false);
        declareFunction(me, "cfasl_output_sbhl_directed_link", "CFASL-OUTPUT-SBHL-DIRECTED-LINK", 2, 0, false);
        declareFunction(me, "cfasl_input_sbhl_directed_link", "CFASL-INPUT-SBHL-DIRECTED-LINK", 1, 0, false);
        new cfasl_kb_methods.$cfasl_input_sbhl_directed_link$UnaryFunction();
        declareFunction(me, "cfasl_output_object_sbhl_undirected_link_method", "CFASL-OUTPUT-OBJECT-SBHL-UNDIRECTED-LINK-METHOD", 2, 0, false);
        declareFunction(me, "cfasl_output_sbhl_undirected_link", "CFASL-OUTPUT-SBHL-UNDIRECTED-LINK", 2, 0, false);
        declareFunction(me, "cfasl_input_sbhl_undirected_link", "CFASL-INPUT-SBHL-UNDIRECTED-LINK", 1, 0, false);
        new cfasl_kb_methods.$cfasl_input_sbhl_undirected_link$UnaryFunction();
        declareFunction(me, "cfasl_input_hl_start", "CFASL-INPUT-HL-START", 1, 0, false);
        new cfasl_kb_methods.$cfasl_input_hl_start$UnaryFunction();
        declareFunction(me, "cfasl_input_hl_end", "CFASL-INPUT-HL-END", 1, 0, false);
        new cfasl_kb_methods.$cfasl_input_hl_end$UnaryFunction();
        declareFunction(me, "cfasl_output_object_hl_start_method", "CFASL-OUTPUT-OBJECT-HL-START-METHOD", 2, 0, false);
        declareFunction(me, "cfasl_output_object_hl_end_method", "CFASL-OUTPUT-OBJECT-HL-END-METHOD", 2, 0, false);
        declareFunction(me, "cfasl_output_hl_start", "CFASL-OUTPUT-HL-START", 2, 0, false);
        declareFunction(me, "cfasl_output_hl_end", "CFASL-OUTPUT-HL-END", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_cfasl_kb_methods_file() {
        defparameter("*CFASL-RELOC-SIDE-STREAM*", NIL);
        defparameter("*CFASL-RELOC-LAST-ADDRESS*", ZERO_INTEGER);
        deflexical("*CFASL-RELOC-EOF-MARKER*", MINUS_ONE_INTEGER);
        deflexical("*CFASL-RELOC-VERSION-1P0A*", $int$_101);
        defparameter("*REPORT-CFASL-INVALID-OBJECTS?", NIL);
        defparameter("*WITHIN-COMPLETE-CFASL-OBJECTS*", NIL);
        defparameter("*CFASL-EXTERNALIZED-CONSTANT-EXCEPTIONS*", NIL);
        defconstant("*CFASL-OPCODE-CONSTANT*", $int$30);
        defconstant("*CFASL-OPCODE-COMPLETE-CONSTANT*", $int$32);
        deflexical("*SAMPLE-INVALID-CONSTANT*", SubLTrampolineFile.maybeDefault($sample_invalid_constant$, $sample_invalid_constant$, () -> create_sample_invalid_constant()));
        defconstant("*CFASL-OPCODE-NART*", $int$31);
        deflexical("*SAMPLE-INVALID-NART*", SubLTrampolineFile.maybeDefault($sample_invalid_nart$, $sample_invalid_nart$, () -> nart_handles.create_sample_invalid_nart()));
        defconstant("*CFASL-OPCODE-ASSERTION*", $int$33);
        defparameter("*CFASL-ERROR-ON-INVALID-ASSERTION-INPUT?*", NIL);
        deflexical("*SAMPLE-INVALID-ASSERTION*", SubLTrampolineFile.maybeDefault($sample_invalid_assertion$, $sample_invalid_assertion$, () -> assertion_handles.create_sample_invalid_assertion()));
        defconstant("*CFASL-OPCODE-DEDUCTION*", $int$36);
        deflexical("*SAMPLE-INVALID-DEDUCTION*", SubLTrampolineFile.maybeDefault($sample_invalid_deduction$, $sample_invalid_deduction$, () -> deduction_handles.create_sample_invalid_deduction()));
        defconstant("*CFASL-OPCODE-KB-HL-SUPPORT*", $int$37);
        deflexical("*SAMPLE-INVALID-KB-HL-SUPPORT*", SubLTrampolineFile.maybeDefault($sample_invalid_kb_hl_support$, $sample_invalid_kb_hl_support$, () -> kb_hl_support_handles.create_sample_invalid_kb_hl_support()));
        defconstant("*CFASL-OPCODE-CLAUSE-STRUC*", $int$38);
        deflexical("*SAMPLE-INVALID-CLAUSE-STRUC*", SubLTrampolineFile.maybeDefault($sample_invalid_clause_struc$, $sample_invalid_clause_struc$, () -> clause_strucs.create_sample_invalid_clause_struc()));
        defconstant("*CFASL-OPCODE-VARIABLE*", $int$40);
        defconstant("*CFASL-OPCODE-COMPLETE-VARIABLE*", $int$42);
        defconstant("*CFASL-OPCODE-SBHL-DIRECTED-LINK*", $int$90);
        defconstant("*CFASL-OPCODE-SBHL-UNDIRECTED-LINK*", $int$91);
        defconstant("*CFASL-OPCODE-HL-START*", $int$94);
        defconstant("*CFASL-OPCODE-HL-END*", $int$95);
        return NIL;
    }

    public static SubLObject setup_cfasl_kb_methods_file() {
        register_external_symbol(SHOW_CFASL_RELOCATION_INFORMATION);
        register_cfasl_input_function($cfasl_opcode_constant$.getGlobalValue(), CFASL_INPUT_CONSTANT);
        register_cfasl_input_function($cfasl_opcode_complete_constant$.getGlobalValue(), CFASL_INPUT_COMPLETE_CONSTANT);
        register_method($cfasl_output_object_method_table$.getGlobalValue(), $dtp_constant$.getGlobalValue(), symbol_function(CFASL_OUTPUT_OBJECT_CONSTANT_METHOD));
        declare_defglobal($sample_invalid_constant$);
        register_cfasl_input_function($cfasl_opcode_nart$.getGlobalValue(), CFASL_INPUT_NART);
        register_method($cfasl_output_object_method_table$.getGlobalValue(), nart_handles.$dtp_nart$.getGlobalValue(), symbol_function(CFASL_OUTPUT_OBJECT_NART_METHOD));
        declare_defglobal($sample_invalid_nart$);
        register_cfasl_input_function($cfasl_opcode_assertion$.getGlobalValue(), CFASL_INPUT_ASSERTION);
        register_method($cfasl_output_object_method_table$.getGlobalValue(), assertion_handles.$dtp_assertion$.getGlobalValue(), symbol_function(CFASL_OUTPUT_OBJECT_ASSERTION_METHOD));
        declare_defglobal($sample_invalid_assertion$);
        register_cfasl_input_function($cfasl_opcode_deduction$.getGlobalValue(), CFASL_INPUT_DEDUCTION);
        register_method($cfasl_output_object_method_table$.getGlobalValue(), deduction_handles.$dtp_deduction$.getGlobalValue(), symbol_function(CFASL_OUTPUT_OBJECT_DEDUCTION_METHOD));
        declare_defglobal($sample_invalid_deduction$);
        register_cfasl_input_function($cfasl_opcode_kb_hl_support$.getGlobalValue(), CFASL_INPUT_KB_HL_SUPPORT);
        register_method($cfasl_output_object_method_table$.getGlobalValue(), kb_hl_support_handles.$dtp_kb_hl_support$.getGlobalValue(), symbol_function(CFASL_OUTPUT_OBJECT_KB_HL_SUPPORT_METHOD));
        declare_defglobal($sample_invalid_kb_hl_support$);
        register_cfasl_input_function($cfasl_opcode_clause_struc$.getGlobalValue(), CFASL_INPUT_CLAUSE_STRUC);
        register_method($cfasl_output_object_method_table$.getGlobalValue(), clause_strucs.$dtp_clause_struc$.getGlobalValue(), symbol_function(CFASL_OUTPUT_OBJECT_CLAUSE_STRUC_METHOD));
        declare_defglobal($sample_invalid_clause_struc$);
        register_cfasl_input_function($cfasl_opcode_variable$.getGlobalValue(), CFASL_INPUT_VARIABLE);
        register_cfasl_input_function($cfasl_opcode_complete_variable$.getGlobalValue(), CFASL_INPUT_COMPLETE_VARIABLE);
        register_method($cfasl_output_object_method_table$.getGlobalValue(), variables.$dtp_variable$.getGlobalValue(), symbol_function(CFASL_OUTPUT_OBJECT_VARIABLE_METHOD));
        register_method($cfasl_output_object_method_table$.getGlobalValue(), sbhl_links.$dtp_sbhl_directed_link$.getGlobalValue(), symbol_function(CFASL_OUTPUT_OBJECT_SBHL_DIRECTED_LINK_METHOD));
        register_cfasl_input_function($cfasl_opcode_sbhl_directed_link$.getGlobalValue(), CFASL_INPUT_SBHL_DIRECTED_LINK);
        register_method($cfasl_output_object_method_table$.getGlobalValue(), sbhl_links.$dtp_sbhl_undirected_link$.getGlobalValue(), symbol_function(CFASL_OUTPUT_OBJECT_SBHL_UNDIRECTED_LINK_METHOD));
        register_cfasl_input_function($cfasl_opcode_sbhl_undirected_link$.getGlobalValue(), CFASL_INPUT_SBHL_UNDIRECTED_LINK);
        register_cfasl_input_function($cfasl_opcode_hl_start$.getGlobalValue(), CFASL_INPUT_HL_START);
        register_cfasl_input_function($cfasl_opcode_hl_end$.getGlobalValue(), CFASL_INPUT_HL_END);
        register_method($cfasl_output_object_method_table$.getGlobalValue(), sbhl_time_utilities.$dtp_hl_start$.getGlobalValue(), symbol_function(CFASL_OUTPUT_OBJECT_HL_START_METHOD));
        register_method($cfasl_output_object_method_table$.getGlobalValue(), sbhl_time_utilities.$dtp_hl_end$.getGlobalValue(), symbol_function(CFASL_OUTPUT_OBJECT_HL_END_METHOD));
        define_test_case_table_int(CFASL_ENCODE, list(new SubLObject[]{ $TEST, symbol_function(EQUALP), $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list111);
        define_test_case_table_int(CFASL_DECODE, list(new SubLObject[]{ $TEST, symbol_function(EQUALP), $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list113);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_cfasl_kb_methods_file();
    }

    @Override
    public void initializeVariables() {
        init_cfasl_kb_methods_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_cfasl_kb_methods_file();
    }

    static {














































































































































    }

    public static final class $cfasl_input_constant$UnaryFunction extends UnaryFunction {
        public $cfasl_input_constant$UnaryFunction() {
            super(extractFunctionNamed("CFASL-INPUT-CONSTANT"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return cfasl_input_constant(arg1);
        }
    }

    public static final class $cfasl_input_nart$UnaryFunction extends UnaryFunction {
        public $cfasl_input_nart$UnaryFunction() {
            super(extractFunctionNamed("CFASL-INPUT-NART"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return cfasl_input_nart(arg1);
        }
    }

    public static final class $cfasl_input_assertion$UnaryFunction extends UnaryFunction {
        public $cfasl_input_assertion$UnaryFunction() {
            super(extractFunctionNamed("CFASL-INPUT-ASSERTION"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return cfasl_input_assertion(arg1);
        }
    }

    public static final class $cfasl_input_deduction$UnaryFunction extends UnaryFunction {
        public $cfasl_input_deduction$UnaryFunction() {
            super(extractFunctionNamed("CFASL-INPUT-DEDUCTION"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return cfasl_input_deduction(arg1);
        }
    }

    public static final class $cfasl_input_kb_hl_support$UnaryFunction extends UnaryFunction {
        public $cfasl_input_kb_hl_support$UnaryFunction() {
            super(extractFunctionNamed("CFASL-INPUT-KB-HL-SUPPORT"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return cfasl_input_kb_hl_support(arg1);
        }
    }

    public static final class $cfasl_input_clause_struc$UnaryFunction extends UnaryFunction {
        public $cfasl_input_clause_struc$UnaryFunction() {
            super(extractFunctionNamed("CFASL-INPUT-CLAUSE-STRUC"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return cfasl_input_clause_struc(arg1);
        }
    }

    public static final class $cfasl_input_variable$UnaryFunction extends UnaryFunction {
        public $cfasl_input_variable$UnaryFunction() {
            super(extractFunctionNamed("CFASL-INPUT-VARIABLE"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return cfasl_input_variable(arg1);
        }
    }

    public static final class $cfasl_input_sbhl_directed_link$UnaryFunction extends UnaryFunction {
        public $cfasl_input_sbhl_directed_link$UnaryFunction() {
            super(extractFunctionNamed("CFASL-INPUT-SBHL-DIRECTED-LINK"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return cfasl_input_sbhl_directed_link(arg1);
        }
    }

    public static final class $cfasl_input_sbhl_undirected_link$UnaryFunction extends UnaryFunction {
        public $cfasl_input_sbhl_undirected_link$UnaryFunction() {
            super(extractFunctionNamed("CFASL-INPUT-SBHL-UNDIRECTED-LINK"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return cfasl_input_sbhl_undirected_link(arg1);
        }
    }

    public static final class $cfasl_input_hl_start$UnaryFunction extends UnaryFunction {
        public $cfasl_input_hl_start$UnaryFunction() {
            super(extractFunctionNamed("CFASL-INPUT-HL-START"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return cfasl_input_hl_start(arg1);
        }
    }

    public static final class $cfasl_input_hl_end$UnaryFunction extends UnaryFunction {
        public $cfasl_input_hl_end$UnaryFunction() {
            super(extractFunctionNamed("CFASL-INPUT-HL-END"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return cfasl_input_hl_end(arg1);
        }
    }
}

/**
 * Total time: 330 ms
 */
